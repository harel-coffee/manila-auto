<?xml version="1.0" encoding="UTF-8"?>
<qml:FeatureModel xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:qml="http://www.example.org/qml">
  <root name="ML Pipeline" mandatory="true">
    <children name="Dataset" mandatory="true">
      <attribute xsi:type="qml:SelectionValueAttribute" name="Label type">
        <attributevalue value="binary"/>
        <attributevalue value="multiclass"/>
      </attribute>
      <attribute xsi:type="qml:SelectionValueAttribute" name="Number of sensitive variables">
        <attributevalue value="single"/>
        <attributevalue value="multiple"/>
      </attribute>
      <attribute xsi:type="qml:OpenValueAttribute" name="Dataset name" type="STRING"/>
      <attribute xsi:type="qml:OpenValueAttribute" name="Label name" type="STRING"/>
    </children>
    <children name="Classifier" abstract="true" mandatory="true">
      <children name="LogReg" group="//@groups.1"/>
      <children name="Decision Tree" group="//@groups.1"/>
      <children name="Neural Network" group="//@groups.1"/>
      <children name="KNN" group="//@groups.1"/>
    </children>
    <children name="Fairness" abstract="true">
      <children name="Fairness Metrics" abstract="true">
        <children name="SP" group="//@groups.0"/>
        <children name="EO" group="//@groups.0"/>
        <children name="DI" group="//@groups.0"/>
      </children>
      <children name="Fairness Methods" abstract="true">
        <children name="Reweighing" group="//@groups.2"/>
        <children name="DIR" group="//@groups.2"/>
        <children name="DEMV" group="//@groups.2"/>
      </children>
    </children>
    <children name="Prediction correctness" abstract="true">
      <children name="Accuracy" group="//@groups.3"/>
      <children name="Precision" group="//@groups.3"/>
      <children name="Recall" group="//@groups.3"/>
    </children>
  </root>
  <groups xsi:type="qml:OrGroup" feature="//@root/@children.2/@children.0/@children.2 //@root/@children.2/@children.0/@children.1 //@root/@children.2/@children.0/@children.0"/>
  <groups xsi:type="qml:AltGroup" feature="//@root/@children.1/@children.2 //@root/@children.1/@children.0 //@root/@children.1/@children.1 //@root/@children.1/@children.3"/>
  <groups xsi:type="qml:OrGroup" feature="//@root/@children.2/@children.1/@children.2 //@root/@children.2/@children.1/@children.1 //@root/@children.2/@children.1/@children.0"/>
  <groups xsi:type="qml:OrGroup" feature="//@root/@children.3/@children.0 //@root/@children.3/@children.1 //@root/@children.3/@children.2"/>
  <constraint xsi:type="qml:RequireConstraint" requiringFeature="//@root/@children.2" requiredAttribute="//@root/@children.0/@attribute.1"/>
  <constraint xsi:type="qml:RequireConstraint" requiringFeature="//@root/@children.2/@children.1/@children.1" requiredAttributeValue="//@root/@children.0/@attribute.0/@attributevalue.0 //@root/@children.0/@attribute.1/@attributevalue.0"/>
  <constraint xsi:type="qml:RequireConstraint" requiringFeature="//@root/@children.2/@children.1/@children.0" requiredAttributeValue="//@root/@children.0/@attribute.0/@attributevalue.0 //@root/@children.0/@attribute.1/@attributevalue.0"/>
  <qualityProperties xsi:type="qml:Fairness" implementedBy="//@root/@children.2/@children.1/@children.1 //@root/@children.2/@children.1/@children.0 //@root/@children.2/@children.1/@children.2">
    <measure implementedBy="//@root/@children.2/@children.0/@children.1" name="Equalized Odds"/>
    <measure implementedBy="//@root/@children.2/@children.0/@children.2" name="Disparate Impact"/>
    <measure implementedBy="//@root/@children.2/@children.0/@children.0" name="Statistical Parity"/>
  </qualityProperties>
  <qualityProperties xsi:type="qml:Explainability" involvedFeature="//@root/@children.1/@children.0 //@root/@children.1/@children.3" explainabilityLevel="MEDIUM"/>
  <qualityProperties xsi:type="qml:Explainability" involvedFeature="//@root/@children.1/@children.2"/>
  <qualityProperties xsi:type="qml:Explainability" involvedFeature="//@root/@children.1/@children.1" explainabilityLevel="HIGH"/>
  <qualityProperties xsi:type="qml:PredictionCorrectness">
    <measure implementedBy="//@root/@children.3/@children.0" name="Accuracy"/>
    <measure implementedBy="//@root/@children.3/@children.1" name="Precision"/>
    <measure implementedBy="//@root/@children.3/@children.2" name="Recall"/>
  </qualityProperties>
  <qualityrequirement>
    <madeOf relatedTo="//@qualityProperties.0">
      <threshold value="0.85" relatedTo="//@qualityProperties.0/@measure.1" equalityOperator="HIGHER_OR_EQUAL"/>
      <threshold value="0.2" relatedTo="//@qualityProperties.0/@measure.2"/>
      <threshold value="0.2" relatedTo="//@qualityProperties.0/@measure.0"/>
    </madeOf>
    <madeOf relatedTo="//@qualityProperties.1"/>
    <madeOf relatedTo="//@qualityProperties.4">
      <threshold value="0.85" relatedTo="//@qualityProperties.4/@measure.0" equalityOperator="HIGHER_OR_EQUAL"/>
    </madeOf>
  </qualityrequirement>
</qml:FeatureModel>
