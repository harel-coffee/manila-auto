import numpy as np
import pandas as pd
from sklearn.metrics import confusion_matrix

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
               priv_group_prob / unpriv_group_prob) if unpriv_group_prob != 0 and priv_group_prob != 0 else 0

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



def norm_data(data):
    return abs(1 - abs(data))