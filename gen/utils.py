import numpy as np
import pandas as pd
from sklearn.model_selection import KFold
 
from sklearn.metrics import accuracy_score
from fairlearn.reductions import BoundedGroupLoss, GridSearch, ExponentiatedGradient, DemographicParity, ZeroOneLoss
from aif360.datasets import BinaryLabelDataset
from aif360.sklearn.preprocessing import Reweighing
from aif360.algorithms.preprocessing import DisparateImpactRemover
from copy import deepcopy
from scipy import stats
from demv import DEMV
from aif360.sklearn.inprocessing import AdversarialDebiasing
import tensorflow.compat.v1 as tf
from aif360.algorithms.inprocessing import GerryFairClassifier

from metrics import *
# TRAINING FUNCTIONS

def cross_val(classifier, data, label, unpriv_group, priv_group, sensitive_features, positive_label, metrics, n_splits=10, preprocessor=None, inprocessor=None, postprocessor=None):
    fold = KFold(n_splits=n_splits, shuffle=True, random_state=2)
    for train, test in fold.split(data):
        weights = None
        data = data.copy()
        df_train = data.iloc[train]
        df_test = data.iloc[test]
        model = deepcopy(classifier)
        if preprocessor == 'rw':
            prot_attr = [df_train[s] for s in sensitive_features]
            rw = Reweighing(prot_attr)
            x, weights = rw.fit_transform(df_train.drop(label, axis=1), df_train[label])
        if preprocessor == 'dir':
            bin_data = BinaryLabelDataset(favorable_label=positive_label, 
                unfavorable_label=1-positive_label, 
                df=df_train, 
                label_names=[label], 
                protected_attribute_names=sensitive_features)
            dir = DisparateImpactRemover(sensitive_attribute=sensitive_features[0])
            trans_data = dir.fit_transform(bin_data)
            df_train, _ = trans_data.convert_to_dataframe()
        if preprocessor == 'demv':
            demv = DEMV(round_level=1)
            df_train = demv.fit_transform(df_train, [keys for keys in unpriv_group.keys()], label)
        if inprocessor == 'eg':
            constr = _get_constr(df_train, label)
            model = ExponentiatedGradient(
                model, constraints=constr, sample_weight_name="sample_weight")
        if inprocessor == 'grid':
            constr = _get_constr(df_train, label)
            model = GridSearch(
            model, constr, sample_weight_name="sample_weight")
        if inprocessor == 'adv':
            model = AdversarialDebiasing(prot_attr=[df_train[s] for s in sensitive_features])
            tf.disable_eager_execution()
        if inprocessor == 'gerry':
            model = GerryFairClassifier(fairness_def='FP')
        if inprocessor == 'gerry' or inprocessor == 'meta':
            pred = _train_gerry_meta(df_train, df_test, label, model, sensitive_features, positive_label)
        else:
            exp = bool(inprocessor == 'eg' or inprocessor == 'grid')
            adv = bool(inprocessor == 'adv')
            pred = _model_train(df_train, df_test, label, model, sensitive_features, exp=exp, weights=weights, adv=adv)
        compute_metrics(pred, unpriv_group, label, positive_label, metrics, sensitive_features)
    return model, metrics

def _get_constr(df, label):
    if len(df[label].unique()) == 2:
        constr = DemographicParity()
    else:
        constr = BoundedGroupLoss(ZeroOneLoss(), upper_bound=0.1)
    return constr

def _train_test_split(df_train, df_test, label):
    x_train = df_train.drop(label, axis=1)
    y_train = df_train[label]
    x_test = df_test.drop(label, axis=1)
    y_test = df_test[label]
    return x_train, x_test, y_train, y_test


def _model_train(df_train, df_test, label, classifier, sensitive_features, exp=False, weights=None, adv=False):
    x_train, x_test, y_train, y_test = _train_test_split(
        df_train, df_test, label)
    model = deepcopy(classifier)
    if adv:
        model.fit(x_train, y_train)
    else:
        model.fit(x_train, y_train,
                sensitive_features=df_train[sensitive_features]) if exp else model.fit(x_train, y_train, sample_weight=weights)
    pred = model.predict(x_test)
    df_pred = df_test.copy()
    df_pred['y_true'] = df_pred[label]
    df_pred[label] = pred
    return df_pred

def _train_gerry_meta(df_train, df_test, label, model, sensitive_features, positive_label):
    bin_train = BinaryLabelDataset(favorable_label=positive_label, 
        unfavorable_label=1-positive_label,
        df=df_train, 
        label_names=[label], 
        protected_attribute_names=sensitive_features)
    model.fit(bin_train)
    bin_test = BinaryLabelDataset(favorable_label=positive_label, 
        unfavorable_label=1-positive_label,
        df=df_test, 
        label_names=[label], 
        protected_attribute_names=sensitive_features)
    pred = model.predict(bin_test)
    df_pred = df_test.copy()
    df_pred['y_true'] = df_pred[label]
    df_pred[label] = pred.labels
    return df_pred

def compute_metrics(df_pred, unpriv_group, label, positive_label, metrics, sensitive_features):
    stat_par = statistical_parity(
        df_pred, unpriv_group, label, positive_label)
    metrics['stat_par'].append(stat_par)
    eo = equalized_odds(
        df_pred, unpriv_group, label, positive_label)
    metrics['eq_odds'].append(eo)
    di = disparate_impact(
        df_pred, unpriv_group, label, positive_label=positive_label)
    metrics['disp_imp'].append(di)
    accuracy = accuracy_score(df_pred['y_true'].values, df_pred[label].values)
    metrics['acc'].append(accuracy)
    metrics['hmean'].append(
        stats.hmean([
            accuracy,
 
            di,
 
            norm_data(eo), 
            norm_data(stat_par), 
        ])
    )
    return metrics

