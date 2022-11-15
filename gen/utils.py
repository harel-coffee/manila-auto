import numpy as np
import pandas as pd
from sklearn.model_selection import KFold
 
from sklearn.metrics import accuracy_score
from aif360.datasets import BinaryLabelDataset
from copy import deepcopy
from scipy import stats
from aif360.sklearn.postprocessing import PostProcessingMeta
from aif360.sklearn.postprocessing import CalibratedEqualizedOdds
from aif360.sklearn.postprocessing import RejectOptionClassifierCV
from metrics import *
# TRAINING FUNCTIONS

def cross_val(classifier, data, label, unpriv_group, priv_group, sensitive_features, positive_label, metrics, n_splits=10, preprocessor=None, inprocessor=None, postprocessor=None):
    fold = KFold(n_splits=n_splits, shuffle=True, random_state=2)
    for train, test in fold.split(data):
        weights = None
        data = data.copy()
        data = data.set_index([s for s in sensitive_features])
        df_train = data.iloc[train]
        df_test = data.iloc[test]
        model = deepcopy(classifier)
        exp = bool(inprocessor == 'eg' or inprocessor == 'grid')
        adv = bool(inprocessor == 'adv')
        pred, model = _model_train(df_train, df_test, label, model, sensitive_features, exp=exp, weights=weights, adv=adv)
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
    df_pred = _predict_data(model, df_test, label, x_test)
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

