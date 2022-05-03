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
    </children>
    <children name="Classifier" abstract="true" mandatory="true">
      <children name="Logistic Regression"/>
      <children name="KNN"/>
    </children>
    <children name="Fairness" abstract="true">
      <children name="Fairness Metrics" abstract="true">
        <children name="SP"/>
        <children name="DI"/>
        <children name="EO"/>
      </children>
      <children name="Fairness Methods" abstract="true">
        <children name="Reweighing" group="//@groups.2"/>
        <children name="DIR" group="//@groups.2"/>
        <children name="DEMV" group="//@groups.2"/>
      </children>
    </children>
  </root>
  <groups groupType="OR"/>
  <groups groupType="OR"/>
  <groups feature="//@root/@children.2/@children.1/@children.2 //@root/@children.2/@children.1/@children.1 //@root/@children.2/@children.1/@children.0"/>
  <constraint xsi:type="qml:RequireConstraint" feature="//@root/@children.2" requiredAttribute="//@root/@children.0/@attribute.0 //@root/@children.0/@attribute.1"/>
  <constraint xsi:type="qml:ExcludeConstraint" feature="//@root/@children.2/@children.1/@children.1" excludedAttributeValue="//@root/@children.0/@attribute.0/@attributevalue.1 //@root/@children.0/@attribute.1/@attributevalue.1"/>
  <constraint xsi:type="qml:ExcludeConstraint" feature="//@root/@children.2/@children.1/@children.0" excludedAttributeValue="//@root/@children.0/@attribute.0/@attributevalue.1 //@root/@children.0/@attribute.1/@attributevalue.1"/>
</qml:FeatureModel>
