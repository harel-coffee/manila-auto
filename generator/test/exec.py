import argparse
import os
import pickle
from demv import DEMV
from utils import *
from fairlearn.reductions import ExponentiatedGradient, BoundedGroupLoss, ZeroOneLoss, GridSearch, DemographicParity
from sklearn.neural_network import MLPClassifier
from sklearn.svm import SVC
from sklearn.ensemble import GradientBoostingClassifier
from sklearn.pipeline import Pipeline
from sklearn.preprocessing import StandardScaler
from sklearn.linear_model import LogisticRegression



def exec(data):
    label = 'contr_use'
    sensitive_features = ['wife_religion']
    unpriv_group = {'wife_religion': 1}
    positive_label = 2
    save_data = True
    save_model = True
    ml_methods = {
        'logreg': LogisticRegression(),
        'svm': SVC()
    }
    fairness_methods = {
        'preprocessing': ['demv'], 
        'inprocessing': ['eg', 'grid'],
        'postprocessing': ['blackbox']
    }
    metrics = {
        'stat_par': [],
        'eq_odds': [],
        'zero_one_loss': [],
        'disp_imp': [],
        'acc': [],
        'hmean': []
    }
    dataset_label = 'multi-class'
    ris = pd.DataFrame()
    for m in ml_methods.keys():
        model = Pipeline([
            ('scaler', StandardScaler()),
            ('classifier', ml_methods[m])
        ])
        for f in fairness_methods.keys():
            model = deepcopy(model)
            data = data.copy()
            if f == 'preprocessing':
                for method in fairness_methods[f]:
                    model, metrics = cross_val(classifier=model, data=data, groups_condition=unpriv_group, label=label, metrics=metrics, positive_label=positive_label, sensitive_features=sensitive_features, preprocessor=method)
            elif f == 'inprocessing':
                for method in fairness_methods[f]:
                    model, metrics = cross_val(classifier=model, data=data, groups_condition=unpriv_group, label=label, metrics=metrics, positive_label=positive_label, sensitive_features=sensitive_features, inprocessor=method)
            else:
               for method in fairness_methods[f]:
                   model, metrics = cross_val(classifier=model, data=data, groups_condition=unpriv_group, label=label, metrics=metrics, positive_label=positive_label,sensitive_features=sensitive_features, postprocessor=method)
            df_metrics = pd.DataFrame(metrics)
            df_metrics = df_metrics.explode(list(df_metrics.columns))
            df_metrics['model'] = m
            df_metrics['fairness_method'] = f
            if save_data:
                os.makedirs('ris', exist_ok=True)
                df_metrics.to_csv(os.path.join('ris', f'ris_{m}_{f}.csv'))
            if save_model:
                os.makedirs('ris', exist_ok=True)
                pickle.dump(model, open(os.path.join('ris', f'{m}_{f}_partial.pkl'), 'wb'))
            ris = ris.append(df_metrics)
    report = ris.groupby(['fairness_method', 'model']).agg(
        np.mean).sort_values('hmean', ascending=False).reset_index()
    best_ris = report.iloc[0,:]
    classifier = ml_methods[best_ris['model']]
    model = Pipeline([('scaler', StandardScaler()), ('classifier', classifier)])
    if best_ris['fairness_method'] == 'demv':
        demv = DEMV(round_level=1)
        data = demv.fit_transform(data, sensitive_features, label)
        model.fit(data.drop(label,axis=1).values, data[label].values.ravel())
        return model, report
    elif best_ris['fairness_method'] == 'eg':
        if dataset_label == 'binary':
            constr = BoundedGroupLoss(DemographicParity(), upper_bound=0.1)
        else:
            constr = BoundedGroupLoss(ZeroOneLoss(), upper_bound=0.1)
        eg = ExponentiatedGradient(
            model, constr, sample_weight_name="classifier__sample_weight")
        eg.fit(data.drop(label, axis=1).values, data[label].values.ravel(),sensitive_features=data[sensitive_features])
        return eg, report
    else:
        if dataset_label == 'binary':
            constr = BoundedGroupLoss(DemographicParity(), upper_bound=0.1)
        else:
            constr = BoundedGroupLoss(ZeroOneLoss(), upper_bound=0.1)
        grid = GridSearch(
            model, constr, sample_weight_name="classifier__sample_weight")
        grid.fit(data.drop(label, axis=1).values, data[label].values.ravel(),sensitive_features=data[sensitive_features])
        return grid, report


if __name__ == '__main__':
    parser = argparse.ArgumentParser(
        description='Experiment file for fairness testing')
    parser.add_argument('-d', '--dataset', type=str,
                        help='Required argument: relative path of the dataset to process')
    args = parser.parse_args()
    data = pd.read_csv(args.dataset)
    model, report = exec(data)
    os.makedirs('ris', exist_ok=True)
    report.to_csv(os.path.join('ris','report.csv'))
    pickle.dump(model, open(os.path.join('ris','model.pkl'), 'wb'))
