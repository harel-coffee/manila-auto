/**
 */
package it.disim.univaq.qml.util;

import it.disim.univaq.qml.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see it.disim.univaq.qml.QmlPackage
 * @generated
 */
public class QmlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QmlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QmlSwitch() {
		if (modelPackage == null) {
			modelPackage = QmlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case QmlPackage.FEATURE_MODEL: {
			FeatureModel featureModel = (FeatureModel) theEObject;
			T result = caseFeatureModel(featureModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QmlPackage.FEATURE: {
			Feature feature = (Feature) theEObject;
			T result = caseFeature(feature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QmlPackage.GROUP: {
			Group group = (Group) theEObject;
			T result = caseGroup(group);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QmlPackage.CONSTRAINT: {
			Constraint constraint = (Constraint) theEObject;
			T result = caseConstraint(constraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QmlPackage.REQUIRE_CONSTRAINT: {
			RequireConstraint requireConstraint = (RequireConstraint) theEObject;
			T result = caseRequireConstraint(requireConstraint);
			if (result == null)
				result = caseConstraint(requireConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QmlPackage.EXCLUDE_CONSTRAINT: {
			ExcludeConstraint excludeConstraint = (ExcludeConstraint) theEObject;
			T result = caseExcludeConstraint(excludeConstraint);
			if (result == null)
				result = caseConstraint(excludeConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QmlPackage.OPEN_VALUE_ATTRIBUTE: {
			OpenValueAttribute openValueAttribute = (OpenValueAttribute) theEObject;
			T result = caseOpenValueAttribute(openValueAttribute);
			if (result == null)
				result = caseAttribute(openValueAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QmlPackage.QUALITY_PROPERTY: {
			QualityProperty qualityProperty = (QualityProperty) theEObject;
			T result = caseQualityProperty(qualityProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QmlPackage.FAIRNESS: {
			Fairness fairness = (Fairness) theEObject;
			T result = caseFairness(fairness);
			if (result == null)
				result = caseQualityProperty(fairness);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QmlPackage.EXPLAINABILITY: {
			Explainability explainability = (Explainability) theEObject;
			T result = caseExplainability(explainability);
			if (result == null)
				result = caseQualityProperty(explainability);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QmlPackage.METRIC: {
			Metric metric = (Metric) theEObject;
			T result = caseMetric(metric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QmlPackage.THRESHOLD: {
			Threshold threshold = (Threshold) theEObject;
			T result = caseThreshold(threshold);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QmlPackage.SELECTION_VALUE_ATTRIBUTE: {
			SelectionValueAttribute selectionValueAttribute = (SelectionValueAttribute) theEObject;
			T result = caseSelectionValueAttribute(selectionValueAttribute);
			if (result == null)
				result = caseAttribute(selectionValueAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QmlPackage.ATTRIBUTE: {
			Attribute attribute = (Attribute) theEObject;
			T result = caseAttribute(attribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QmlPackage.ATTRIBUTE_VALUE: {
			AttributeValue attributeValue = (AttributeValue) theEObject;
			T result = caseAttributeValue(attributeValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QmlPackage.PREDICTION_CORRECTNESS: {
			PredictionCorrectness predictionCorrectness = (PredictionCorrectness) theEObject;
			T result = casePredictionCorrectness(predictionCorrectness);
			if (result == null)
				result = caseQualityProperty(predictionCorrectness);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QmlPackage.PRIVACY: {
			Privacy privacy = (Privacy) theEObject;
			T result = casePrivacy(privacy);
			if (result == null)
				result = caseQualityProperty(privacy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QmlPackage.QUALITY_REQUIREMENTS: {
			QualityRequirements qualityRequirements = (QualityRequirements) theEObject;
			T result = caseQualityRequirements(qualityRequirements);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QmlPackage.COMPUTATIONAL_COMPLEXITY: {
			ComputationalComplexity computationalComplexity = (ComputationalComplexity) theEObject;
			T result = caseComputationalComplexity(computationalComplexity);
			if (result == null)
				result = caseQualityProperty(computationalComplexity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QmlPackage.OR_GROUP: {
			OrGroup orGroup = (OrGroup) theEObject;
			T result = caseOrGroup(orGroup);
			if (result == null)
				result = caseGroup(orGroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QmlPackage.ALT_GROUP: {
			AltGroup altGroup = (AltGroup) theEObject;
			T result = caseAltGroup(altGroup);
			if (result == null)
				result = caseGroup(altGroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QmlPackage.QUALITY_REQUIREMENT: {
			QualityRequirement qualityRequirement = (QualityRequirement) theEObject;
			T result = caseQualityRequirement(qualityRequirement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureModel(FeatureModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Require Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Require Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequireConstraint(RequireConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclude Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclude Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExcludeConstraint(ExcludeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Value Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Value Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenValueAttribute(OpenValueAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValue(AttributeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prediction Correctness</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prediction Correctness</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredictionCorrectness(PredictionCorrectness object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Privacy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Privacy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivacy(Privacy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualityRequirements(QualityRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualityRequirement(QualityRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computational Complexity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computational Complexity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputationalComplexity(ComputationalComplexity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrGroup(OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alt Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alt Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAltGroup(AltGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualityProperty(QualityProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fairness</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fairness</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFairness(Fairness object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explainability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explainability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplainability(Explainability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetric(Metric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Threshold</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreshold(Threshold object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Value Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Value Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionValueAttribute(SelectionValueAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //QmlSwitch
