import numpy as np
import pandas as pd

from sklearn.model_selection import KFold

from sklearn.metrics import confusion_matrix
 
from sklearn.metrics import accuracy_score
from sklearn.metrics import zero_one_loss
from fairlearn.metrics import MetricFrame
from copy import deepcopy

from scipy import stats
from demv import DEMV
from fairlearn.reductions import BoundedGroupLoss, GridSearch, ExponentiatedGradient, DemographicParity, ZeroOneLoss

# METRICS

def _get_groups(data, label_name, positive_label, group_condition):
    query = '&'.join([str(k) + '==' + str(v)
                     for k, v in group_condition.items()])
    label_query = label_name + '==' + str(positive_label)
    unpriv_group = data.query(query)
    unpriv_group_pos = data.query(query + '&' + label_query)
    priv_group = data.query('~(' + query + ')')
    priv_group_pos = data.query('~(' + query + ')&' + label_query)
    return unpriv_group, unpriv_group_pos, priv_group, priv_group_pos


def _compute_probs(data_pred, label_name, positive_label, group_condition):
    unpriv_group, unpriv_group_pos, priv_group, priv_group_pos = _get_groups(data_pred, label_name, positive_label, group_condition)
    unpriv_group_prob = (len(unpriv_group_pos)
                         / len(unpriv_group))
    priv_group_prob = (len(priv_group_pos)
                       / len(priv_group))
    return unpriv_group_prob, priv_group_prob


def _compute_tpr_fpr(y_true, y_pred):
    matrix = confusion_matrix(y_true, y_pred)
    FP = matrix.sum(axis=0) - np.diag(matrix)
    FN = matrix.sum(axis=1) - np.diag(matrix)
    TP = np.diag(matrix)
    TN = matrix.sum() - (FP + FN + TP)

    TPR = TP/(TP+FN)
    FPR = FP/(FP+TN)
    return FPR, TPR

def disparate_impact(data_pred, group_condition, label_name, positive_label):
    unpriv_group_prob, priv_group_prob = _compute_probs(
        data_pred, label_name, positive_label, group_condition)
    return min(unpriv_group_prob / priv_group_prob,
               priv_group_prob / unpriv_group_prob) if unpriv_group_prob != 0 else \
        unpriv_group_prob / priv_group_prob

def statistical_parity(data_pred: pd.DataFrame, group_condition: dict, label_name: str, positive_label: str):
    query = '&'.join([f'{k}=={v}' for k, v in group_condition.items()])
    label_query = label_name+'=='+str(positive_label)
    unpriv_group_prob = (len(data_pred.query(query + '&' + label_query))
                         / len(data_pred.query(query)))
    priv_group_prob = (len(data_pred.query('~(' + query + ')&' + label_query))
                       / len(data_pred.query('~(' + query+')')))
    return unpriv_group_prob - priv_group_prob

def equalized_odds(data_pred: pd.DataFrame, group_condition: dict, label_name: str, positive_label: str):
    query = '&'.join([f'{k}=={v}' for k, v in group_condition.items()])
    label_query = label_name+'=='+str(positive_label)
    tpr_query = 'y_true == ' + str(positive_label)
    if(len(data_pred.query(query + '&' + label_query)) == 0):
        unpriv_group_tpr = 0
    else:
        unpriv_group_tpr = (len(data_pred.query(query + '&' + label_query + '&' + tpr_query))
                            / len(data_pred.query(query + '&' + label_query)))

    if (len(data_pred.query('~(' + query+')&' + label_query)) == 0):
        priv_group_tpr = 0
    else:
        priv_group_tpr = (len(data_pred.query('~(' + query + ')&' + label_query + '&' + tpr_query))
                          / len(data_pred.query('~(' + query+')&' + label_query)))

    if (len(data_pred.query(query + '& ~(' + label_query + ')')) == 0):
        unpriv_group_fpr = 0
    else:
        unpriv_group_fpr = (len(data_pred.query(query + '&' + label_query + '& ~(' + tpr_query + ')'))
                            / len(data_pred.query(query + '& ~(' + label_query + ')')))

    if (len(data_pred.query('~(' + query+')& ~(' + label_query + ')')) == 0):
        priv_group_fpr = 0
    else:
        priv_group_fpr = (len(data_pred.query('~(' + query + ')&' + label_query + '& ~(' + tpr_query + ')'))
                          / len(data_pred.query('~(' + query+')& ~(' + label_query + ')')))

    return max(np.abs(unpriv_group_tpr - priv_group_tpr), np.abs(unpriv_group_fpr - priv_group_fpr))


def zero_one_loss_diff(y_true: np.ndarray, y_pred: np.ndarray, sensitive_features: list):
    mf = MetricFrame(metrics=zero_one_loss,
                     y_true=y_true,
                     y_pred=y_pred,
                     sensitive_features=sensitive_features)
    return mf.difference()

def norm_data(data):
    return abs(1 - abs(data))


# TRAINING FUNCTIONS

def cross_val(classifier, data, label, groups_condition, sensitive_features, positive_label, metrics, n_splits=10, preprocessor=None, inprocessor=None, postprocessor=None):
    fold = KFold(n_splits=n_splits, shuffle=True, random_state=2)
    for train, test in fold.split(data):
        data = data.copy()
        df_train = data.iloc[train]
        df_test = data.iloc[test]
        model = deepcopy(classifier)
        if preprocessor == 'demv':
            demv = DEMV(round_level=1)
            df_train = demv.fit_transform(df_train, [keys for keys in groups_condition.keys()], label)
        if inprocessor == 'eg':
            constr = _get_constr(df_train, label)
            model = ExponentiatedGradient(
                model, constraints=constr, sample_weight_name="classifier__sample_weight")
        if inprocessor == 'grid':
            constr = _get_constr(df_train, label)
            model = GridSearch(
            model, constr, sample_weight_name="classifier__sample_weight")
        exp = bool(inprocessor == 'eg' or inprocessor == 'grid')
        pred = _model_train(df_train, df_test, label, model, sensitive_features, exp=exp)
        compute_metrics(pred, groups_condition, label, positive_label, metrics, sensitive_features)
    return model, metrics

def _get_constr(df, label):
    if len(df[label].unique()) == 2:
        constr = BoundedGroupLoss(
            DemographicParity(), upper_bound=0.1)
    else:
        constr = BoundedGroupLoss(ZeroOneLoss(), upper_bound=0.1)
    return constr

def _train_test_split(df_train, df_test, label):
    x_train = df_train.drop(label, axis=1).values
    y_train = df_train[label].values.ravel()
    x_test = df_test.drop(label, axis=1).values
    y_test = df_test[label].values.ravel()
    return x_train, x_test, y_train, y_test


def _model_train(df_train, df_test, label, classifier, sensitive_features, exp=False):
    x_train, x_test, y_train, y_test = _train_test_split(
        df_train, df_test, label)
    model = deepcopy(classifier)
    model.fit(x_train, y_train,
              sensitive_features=df_train[sensitive_features]) if exp else model.fit(x_train, y_train)
    pred = model.predict(x_test)
    df_pred = df_test.copy()
    df_pred['y_true'] = df_pred[label]
    df_pred[label] = pred
    return df_pred


def compute_metrics(df_pred, groups_condition, label, positive_label, metrics, sensitive_features):
    stat_par = statistical_parity(
        df_pred, groups_condition, label, positive_label)
    metrics['stat_par'].append(stat_par)
    eo = equalized_odds(
        df_pred, groups_condition, label, positive_label)
    metrics['eq_odds'].append(eo)
    di = disparate_impact(
        df_pred, groups_condition, label, positive_label=positive_label)
    metrics['disp_imp'].append(di)
    zero_one_loss = zero_one_loss_diff(
        y_true=df_pred['y_true'].values, y_pred=df_pred[label].values, sensitive_features=df_pred[sensitive_features].values)
    metrics['zero_one_loss'].append(zero_one_loss)
    accuracy = accuracy_score(df_pred['y_true'].values, df_pred[label].values)
    metrics['acc'].append(accuracy)
    metrics['hmean'].append(
        stats.hmean([
            accuracy,
 
            di,
 
            norm_data(eo), 
            norm_data(stat_par), 
            norm_data(zero_one_loss)
        ])
    )
    return metrics

