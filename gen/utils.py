import numpy as np
import pandas as pd
from sklearn.model_selection import KFold
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
from aif360.algorithms.inprocessing import MetaFairClassifier
from aif360.algorithms.inprocessing import PrejudiceRemover
from aif360.sklearn.postprocessing import PostProcessingMeta
from aif360.sklearn.postprocessing import CalibratedEqualizedOdds
from aif360.sklearn.postprocessing import RejectOptionClassifierCV
from metrics import *
# TRAINING FUNCTIONS

def cross_val(classifier, data, label, unpriv_group, priv_group, sensitive_features, positive_label, metrics, n_splits=10, preprocessor=None, inprocessor=None, postprocessor=None):
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
            _, weights = rw.fit_transform(df_train.drop(label, axis=1), df_train[label])
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
        if inprocessor == 'eg':
            constr = _get_constr(df_train, label)
            model = ExponentiatedGradient(
                model, constraints=constr, sample_weight_name="classifier__sample_weight")
        if inprocessor == 'grid':
            constr = _get_constr(df_train, label)
            model = GridSearch(
            model, constr, sample_weight_name="classifier__sample_weight")
        if inprocessor == 'adv':
            df_train = df_train.set_index([s for s in sensitive_features])
            df_test = df_test.set_index([s for s in sensitive_features])
            model = AdversarialDebiasing(prot_attr=[s for s in sensitive_features])
            tf.disable_eager_execution()
        if inprocessor == 'gerry':
            model = GerryFairClassifier(fairness_def='FP')
        if inprocessor == 'meta':
            model = MetaFairClassifier(sensitive_attr=sensitive_features[0])
        if inprocessor == 'prej':
            model = PrejudiceRemover(sensitive_attr=sensitive_features[0], class_attr=label)
        if inprocessor == 'gerry' or inprocessor == 'meta' or inprocessor == 'prej':
            pred, model = _train_gerry_meta(df_train, df_test, label, model, sensitive_features, positive_label)
        else:
            exp = bool(inprocessor == 'eg' or inprocessor == 'grid')
            adv = bool(inprocessor == 'adv')
            pred, model = _model_train(df_train, df_test, label, model, sensitive_features, exp=exp, weights=weights, adv=adv)
        if postprocessor:
            df_train = df_train.set_index(sensitive_features[0])
            df_test = df_test.set_index(sensitive_features[0])
        if postprocessor=='cal':
            cal = CalibratedEqualizedOdds(prot_attr=sensitive_features[0])
            model, pred = _compute_postprocessing(model, cal, df_train, df_test, label)
        if postprocessor == 'rej':
            rej = RejectOptionClassifierCV(
                scoring='statistical_parity', prot_attr='sex')
            model, pred = _compute_postprocessing(
                model, rej, df_train, df_test, label)
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
        if exp:
            model.fit(x_train, y_train,
                    sensitive_features=df_train[sensitive_features]) 
        else:
            model.fit(x_train, y_train, classifier__sample_weight=weights)
  
    df_pred = _predict_data(model, df_test, label, x_test)
    if adv:
        model.sess_.close()
    return df_pred, model

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
    df_pred = _predict_data(model, df_test, label, bin_test, True)
    return df_pred, model

def _compute_postprocessing(model, postprocessor, d_train, d_test, label):
    meta = PostProcessingMeta(model, postprocessor)
    meta.fit(d_train.drop(label, axis=1), d_train[label])
    df_pred = _predict_data(meta, d_test, label, d_test.drop(label, axis=1))
    return meta, df_pred

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
    ao = average_odds_difference(df_pred, unpriv_group, label)
    metrics['ao'] = ao
    tpr = true_pos_diff(df_pred, unpriv_group, label)
    metrics['tpr_diff'] = tpr
    fpr = false_pos_diff(df_pred, unpriv_group, label)
    metrics['fpr_diff'] = fpr
    zero_one_loss = zero_one_loss_diff(
        y_true=df_pred['y_true'].values, y_pred=df_pred[label].values, sensitive_features=df_pred[sensitive_features].values)
    metrics['zero_one_loss'].append(zero_one_loss)
    accuracy_score = accuracy(df_pred, label)
    metrics['acc'].append(accuracy_score)
    precision_score = precision(df_pred, label)
    metrics['precision'].append(precision_score)
    recall_score = recall(df_pred, label)
    metrics['recall'].append(recall_score)
    auc_score = auc(df_pred, label)
    metrics['auc'].append(auc_score)
    metrics['hmean'].append(
        stats.hmean([
            accuracy_score,
 
            di,
 
            norm_data(eo), 
            norm_data(stat_par), 
            norm_data(zero_one_loss),
            norm_data(ao),
            precision_score,
            recall_score,
            auc_score,
            norm_data(tpr),
            norm_data(fpr),
        ])
    )
    return metrics

