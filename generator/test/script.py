import pandas as pd
import numpy as np
from sklearn.pipeline import make_pipeline
from sklearn.linear_model import LogisticRegression
from sklearn.preprocessing import StandardScaler
from aif360.datasets import BinaryLabelDataset
from aif360.metrics import ClassificationMetric

from aif360.algorithms.preprocessing import Reweighing


data = pd.read_csv('test.csv')
label_name = '10'
data = BinaryLabelDataset(df=data, protected_attribute_names='s', label_names=[label_name])
privileged_group = [{ 's': 1 }]
unprivileged_group = [{ 's': 0 }]
from sklearn.model_selection import KFold
from collections import OrderedDict

debiaser = Reweighing(unprivileged_group, privileged_group)

np_data = np.hstack((data.features, data.labels))
kf = KFold(n_splits=5, shuffle=True)
fairness_metrics = []

for train, test in kf.split(np_data):
  dataset_train = data.subset(train)
  dataset_test = data.subset(test)
  dataset_train = debiaser.fit_transform(dataset_train)
  X_train = dataset_train.features
  y_train = dataset_train.labels.ravel()
  model = make_pipeline(StandardScaler(), LogisticRegression())
  model.fit(X_train, y_train, logisticregression__sample_weight=dataset_train.instance_weights.ravel())

  # Metrics
  
  pred = dataset_test.copy()
  pred.labels = model.predict(dataset_test.features)
  metrics = OrderedDict()
  classified_metric_pred = ClassificationMetric(dataset_test, pred, unprivileged_groups=unprivileged_group,privileged_groups=privileged_group)
  metrics['Model score'] = 0.5 * (classified_metric_pred.true_positive_rate() +
                                          classified_metric_pred.true_negative_rate())
  metrics['Statistical parity'] = classified_metric_pred.statistical_parity_difference()
     
  metrics['Equal accuracy'] = classified_metric_pred.average_odds_difference()


  fairness_metrics.append(metrics)

fair_m = {key: round(np.mean([metric[key] for metric in fairness_metrics]), 4) for key in fairness_metrics[0]}
for key, val in fair_m.items():
    print("%s: %.4f" % (key, val))