import argparse

from demv import DEMV
from utils import *
from fairlearn.reductions import ExponentiatedGradient, BoundedGroupLoss, ZeroOneLoss, GridSearch, DemographicParity
from sklearn.neural_network import MLPClassifier
from sklearn.svm import SVC
from sklearn.ensemble import GradientBoostingClassifier
from sklearn.pipeline import Pipeline
from sklearn.preprocessing import StandardScaler
from sklearn.linear_model import LogisticRegression


# parser = argparse.ArgumentParser(description='Metrics generator for DEMV testing.',
#                                  epilog="Example usage: python generatemetrics.py cmc biased 3 --classifier svc")

# parser.add_argument('dataset', type=str,
#                     help='Required argument: Chosen dataset to generate metrics for. Availability of datasets changes according to the chosen method.'
#                     + ' All available datasets are: adult, cmc, compas, crime, drugs, german, obesity, park, wine.', choices=['adult', 'cmc', 'law', 'compas', 'crime', 'drug', 'german', 'obesity', 'park', 'wine', 'all'])

# parser.add_argument('method', type=str,
#                     help='Required argument: Chosen method to generate metrics for. Can be biased, eg, grid, uniform, smote, adasyn.', choices=['biased', 'eg', 'grid', 'uniform', 'smote', 'adasyn'])

# parser.add_argument('number_of_features', type=int,
#                     help='Required argument: Number of sensitive features in the dataset to consider, up to 3. If "1" is chosen, two datasets will be generated, one for each canonical sensitive feature  (as described in literature for that dataset)', choices=[1, 2, 3, 4])

# parser.add_argument('--classifier', type=str, nargs='?', default="logistic",
#                     help='Optional argument: classifier to use. Possible options are logistic, gradient, svc and mlp. Defaults to Logistic Regression (logistic).', choices=['logistic', 'gradient', 'svc', 'mlp'])
# parser.add_argument("--cm", action=argparse.BooleanOptionalAction,
#                     help="Optional argument: only generate Confusion Matrices for the selected dataset.")

# args = parser.parse_args()


def exec(data):
    label = 'contr_use'
    sensitive_features = ['wife_religion', 'wife_work']
    unpriv_group = {'wife_religion': 1, 'wife_work': 1}
    positive_label = 2
    ml_methods = {
        'logreg': LogisticRegression(),
        'svm': SVC()
    }
    fairness_methods = ['demv', 'eg', 'grid']
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
        for f in fairness_methods:
            model = deepcopy(model)
            data = data.copy()
            if f == 'reweighing':
                rw
            elif f == 'demv':
                demv = DEMV(round_level=1)
                metrics = cross_val(
                    model, data, label, unpriv_group, sensitive_features, positive_label, debiaser=demv, metrics=metrics)
            elif f == 'eg':
                if dataset_label == 'binary':
                    constr = BoundedGroupLoss(DemographicParity(), upper_bound=0.1)
                else:
                    constr = BoundedGroupLoss(ZeroOneLoss(), upper_bound=0.1)
                eg = ExponentiatedGradient(
                    model, constraints=constr, sample_weight_name="classifier__sample_weight")
                metrics = cross_val(
                    eg, data, label, unpriv_group, sensitive_features, positive_label, exp=True, metrics=metrics)
            else:
                if dataset_label == 'binary':
                    constr = BoundedGroupLoss(DemographicParity(), upper_bound=0.1)
                else:
                    constr = BoundedGroupLoss(ZeroOneLoss(), upper_bound=0.1)
                grid = GridSearch(
                    model, constraints=constr, sample_weight_name="classifier__sample_weight")
                metrics = cross_val(
                    grid, data, label, unpriv_group, sensitive_features, positive_label, exp=True, metrics=metrics)
            df_metrics = pd.DataFrame(metrics)
            df_metrics = df_metrics.explode(list(df_metrics.columns))
            df_metrics['model'] = m
            df_metrics['fairness_method'] = f
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