import numpy as np
import pandas as pd
from sklearn.model_selection import KFold
 
from sklearn.metrics import accuracy_score
from aif360.datasets import BinaryLabelDataset
from aif360.sklearn.preprocessing import Reweighing
from aif360.algorithms.preprocessing import DisparateImpactRemover
from copy import deepcopy
from scipy import stats
from demv import DEMV
from aif360.sklearn.postprocessing import PostProcessingMeta
from sklearn.neural_network import MLPClassifier
from metrics import *
# TRAINING FUNCTIONS

def cross_val(classifier, data, label, unpriv_group, priv_group, sensitive_features, positive_label, metrics, n_splits=10, preprocessor=None, inprocessor=None, postprocessor=None):
    n_splits = 2
    data_start = data.copy()
    fold = KFold(n_splits=n_splits, shuffle=True, random_state=2)
    for train, test in fold.split(data_start):
        weights = None
        data = data_start.copy()
        df_train = data.iloc[train]
        df_test = data.iloc[test]
        model = deepcopy(classifier)
        if preprocessor == 'rw':
            df_train = df_train.set_index(sensitive_features[0])
            prot_attr = [s for s in sensitive_features]
            rw = Reweighing(prot_attr)
            x, weights = rw.fit_transform(df_train.drop(label, axis=1), df_train[label])
            df_train = df_train.reset_index()
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
        exp = bool(inprocessor == 'eg' or inprocessor == 'grid')
        adv = bool(inprocessor == 'adv')
        pred, model = _model_train(df_train, df_test, label, model, sensitive_features, exp=exp, weights=weights, adv=adv)
        if postprocessor:
            df_train = df_train.set_index(sensitive_features[0])
            df_test = df_test.set_index(sensitive_features[0])
        compute_metrics(pred, unpriv_group, label, positive_label, metrics, sensitive_features)
    return model, metrics


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
        if exp:
            model.fit(x_train, y_train,
                    sensitive_features=df_train[sensitive_features]) 
        else:
            if isinstance(model['classifier'], MLPClassifier):
                model.fit(x_train, y_train)
            else:
                model.fit(x_train, y_train, classifier__sample_weight=weights)
  
    df_pred = _predict_data(model, df_test, label, x_test)
    if adv:
        model.sess_.close()
    return df_pred, model



def _predict_data(model, df_test, label, x_test, aif_data=False):
    pred = model.predict(x_test)
    df_pred = df_test.copy()
    df_pred['y_true'] = df_pred[label]
    if aif_data:
        df_pred[label] = pred.labels
    else:
        df_pred[label] = pred
    return df_pred

def compute_metrics(df_pred, unpriv_group, label, positive_label, metrics, sensitive_features):
    df_pred = df_pred.reset_index()
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

