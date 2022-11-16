import argparse
import os
import pickle
from copy import deepcopy
from utils import *
from demv import DEMV
from sklearn.linear_model import LogisticRegression
from sklearn.neural_network import MLPClassifier
from sklearn.ensemble import GradientBoostingClassifier
from sklearn.tree import DecisionTreeClassifier
from sklearn.ensemble import RandomForestClassifier
from sklearn.pipeline import Pipeline
from sklearn.preprocessing import StandardScaler

def _store_metrics(metrics, method, fairness, save_data, save_model, model_fair):
    df_metrics = pd.DataFrame(metrics)
    df_metrics = df_metrics.explode(list(df_metrics.columns))
    df_metrics['model'] = method
    df_metrics['fairness_method'] = fairness
    if save_data:
        os.makedirs('ris', exist_ok=True)
        df_metrics.to_csv(os.path.join(
            'ris', f'ris_{method}_{fairness}.csv'))
    if save_model:
        os.makedirs('ris', exist_ok=True)
        pickle.dump(model_fair, open(os.path.join(
            'ris', f'{method}_{fairness}_partial.pickle'), 'wb'))
    return df_metrics



def exec(data):
    label = 'income'
    positive_label = 1
    
    unpriv_group = { 'sex': 1 }
    priv_group = { 'sex': 0 }
    sensitive_features = ['sex']

    save_data =  False 
    save_model =  False     
    ml_methods = {
        'logreg': LogisticRegression(),
        'gradient_class': GradientBoostingClassifier(),
        'mlp': MLPClassifier(),
        'tree': DecisionTreeClassifier(),
        'forest': RandomForestClassifier(),
    }

    fairness_methods = {
        'no_method': 'no_method',
        'preprocessing': [
            'demv',
            'reweighing',
            'dir',
        ],
        'postprocessing': [
        ]
    }

    base_metrics = {
        'stat_par': [],
        'eq_odds': [],
        'disp_imp': [],
        'acc': [],
        'hmean': [],
    }

    agg_metric =  'hmean' 
    dataset_label =  'binary' 
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
                    metrics = deepcopy(base_metrics)
                    model_fair, ris_metrics = cross_val(classifier=model, data=data, unpriv_group=unpriv_group, priv_group=priv_group, label=label, metrics=metrics, positive_label=positive_label, sensitive_features=sensitive_features, preprocessor=method, n_splits=10)
                    df_metrics = _store_metrics(ris_metrics, m, method, save_data, save_model, model_fair)
                    ris = ris.append(df_metrics)
            elif f == 'inprocessing':
                for method in fairness_methods[f]:
                    metrics = deepcopy(base_metrics)
                    model_fair, ris_metrics = cross_val(classifier=model, data=data, unpriv_group=unpriv_group, priv_group=priv_group, label=label, metrics=metrics, positive_label=positive_label, sensitive_features=sensitive_features, inprocessor=method, n_splits=10)
                    df_metrics = _store_metrics(
                        ris_metrics, m, method, save_data, save_model, model_fair)
                    ris = ris.append(df_metrics)
            elif f == 'postprocessing':
                for method in fairness_methods[f]:
                    metrics = deepcopy(base_metrics)
                    model_fair, ris_metrics = cross_val(classifier=model, data=data, unpriv_group=unpriv_group, priv_group=priv_group, label=label, metrics=metrics, positive_label=positive_label,sensitive_features=sensitive_features, postprocessor=method, n_splits=10)
                    df_metrics = _store_metrics(ris_metrics, m, method, save_data, save_model, model_fair)
                    ris = ris.append(df_metrics)
            else:
                metrics = deepcopy(base_metrics)
                model_fair, ris_metrics = cross_val(classifier=model, data=data, unpriv_group=unpriv_group, priv_group=priv_group, label=label, metrics=metrics, positive_label=positive_label,sensitive_features=sensitive_features, n_splits=10)
                df_metrics = _store_metrics(ris_metrics, m, 'No method', save_data, save_model, model_fair)
                ris = ris.append(df_metrics)

    report = ris.groupby(['fairness_method', 'model']).agg(
        np.mean).sort_values(agg_metric, ascending=False).reset_index()
    return report
    # best_ris = report.iloc[0,:]
    # model = ml_methods[best_ris['model']]
    #     # model = Pipeline([
    #     ('scaler', StandardScaler()),
    #     ('classifier', model)
    # ])
    #     #    #     # if best_ris['fairness_method'] == 'demv':
    #     demv = DEMV(round_level=1)
    #     data = demv.fit_transform(data, sensitive_features, label)
    #     model.fit(data.drop(label,axis=1).values, data[label].values.ravel())
    #     return model, report
    #     #     #     # 
if __name__ == '__main__':
    parser = argparse.ArgumentParser(
        description='Experiment file for fairness testing')
    parser.add_argument('-d', '--dataset', type=str,
                        help='Required argument: relative path of the dataset to process')
    args = parser.parse_args()
    
    data = pd.read_csv(args.dataset
    )
    report = exec(data)
    os.makedirs('ris', exist_ok=True)
    report.round(3).to_csv(os.path.join('ris','report.csv'))
    # pickle.dump(model, open(os.path.join('ris','model.pkl'), 'wb'))