import numpy as np
import pandas as pd
from sklearn.model_selection import KFold
from fairlearn.reductions import BoundedGroupLoss, GridSearch, ExponentiatedGradient, DemographicParity, ZeroOneLoss
from aif360.datasets import BinaryLabelDataset
from copy import deepcopy
from scipy import stats
from demv import DEMV
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
        exp = bool(inprocessor == 'eg' or inprocessor == 'grid')
        adv = bool(inprocessor == 'adv')
        pred, model = _model_train(df_train, df_test, label, model, sensitive_features, exp=exp, weights=weights, adv=adv)
        if postprocessor:
            df_train = df_train.set_index(sensitive_features[0])
            df_test = df_test.set_index(sensitive_features[0])
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
    ao = average_odds_difference(df_pred, unpriv_group, label, positive_label)
    metrics['ao'] = ao
    tpr = true_pos_diff(df_pred, unpriv_group, label, positive_label)
    metrics['tpr_diff'] = tpr
    fpr = false_pos_diff(df_pred, unpriv_group, label, positive_label)
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
    f1_score = f1(df_pred, label)
    metrics['f1score'].append(f1_score)
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
            f1_score,
            norm_data(tpr),
            norm_data(fpr),
        ])
    )
    return metrics