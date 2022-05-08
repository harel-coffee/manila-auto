/**
 */
package it.disim.univaq.qml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.disim.univaq.qml.QmlPackage
 * @generated
 */
public interface QmlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QmlFactory eINSTANCE = it.disim.univaq.qml.impl.QmlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Feature Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Model</em>'.
	 * @generated
	 */
	FeatureModel createFeatureModel();

	/**
	 * Returns a new object of class '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature</em>'.
	 * @generated
	 */
	Feature createFeature();

	/**
	 * Returns a new object of class '<em>Require Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Require Constraint</em>'.
	 * @generated
	 */
	RequireConstraint createRequireConstraint();

	/**
	 * Returns a new object of class '<em>Exclude Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclude Constraint</em>'.
	 * @generated
	 */
	ExcludeConstraint createExcludeConstraint();

	/**
	 * Returns a new object of class '<em>Open Value Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Value Attribute</em>'.
	 * @generated
	 */
	OpenValueAttribute createOpenValueAttribute();

	/**
	 * Returns a new object of class '<em>Fairness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fairness</em>'.
	 * @generated
	 */
	Fairness createFairness();

	/**
	 * Returns a new object of class '<em>Explainability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explainability</em>'.
	 * @generated
	 */
	Explainability createExplainability();

	/**
	 * Returns a new object of class '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metric</em>'.
	 * @generated
	 */
	Metric createMetric();

	/**
	 * Returns a new object of class '<em>Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Threshold</em>'.
	 * @generated
	 */
	Threshold createThreshold();

	/**
	 * Returns a new object of class '<em>Selection Value Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selection Value Attribute</em>'.
	 * @generated
	 */
	SelectionValueAttribute createSelectionValueAttribute();

	/**
	 * Returns a new object of class '<em>Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value</em>'.
	 * @generated
	 */
	AttributeValue createAttributeValue();

	/**
	 * Returns a new object of class '<em>Prediction Correctness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prediction Correctness</em>'.
	 * @generated
	 */
	PredictionCorrectness createPredictionCorrectness();

	/**
	 * Returns a new object of class '<em>Privacy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Privacy</em>'.
	 * @generated
	 */
	Privacy createPrivacy();

	/**
	 * Returns a new object of class '<em>Quality Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quality Requirements</em>'.
	 * @generated
	 */
	QualityRequirements createQualityRequirements();

	/**
	 * Returns a new object of class '<em>Quality Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quality Requirement</em>'.
	 * @generated
	 */
	QualityRequirement createQualityRequirement();

	/**
	 * Returns a new object of class '<em>Computational Complexity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computational Complexity</em>'.
	 * @generated
	 */
	ComputationalComplexity createComputationalComplexity();

	/**
	 * Returns a new object of class '<em>Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Group</em>'.
	 * @generated
	 */
	OrGroup createOrGroup();

	/**
	 * Returns a new object of class '<em>Alt Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alt Group</em>'.
	 * @generated
	 */
	AltGroup createAltGroup();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QmlPackage getQmlPackage();

} //QmlFactory
