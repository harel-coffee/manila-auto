/**
 */
package it.disim.univaq.qml.util;

import it.disim.univaq.qml.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.disim.univaq.qml.QmlPackage
 * @generated
 */
public class QmlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QmlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QmlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QmlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QmlSwitch<Adapter> modelSwitch = new QmlSwitch<Adapter>() {
		@Override
		public Adapter caseFeatureModel(FeatureModel object) {
			return createFeatureModelAdapter();
		}

		@Override
		public Adapter caseFeature(Feature object) {
			return createFeatureAdapter();
		}

		@Override
		public Adapter caseGroup(Group object) {
			return createGroupAdapter();
		}

		@Override
		public Adapter caseConstraint(Constraint object) {
			return createConstraintAdapter();
		}

		@Override
		public Adapter caseRequireConstraint(RequireConstraint object) {
			return createRequireConstraintAdapter();
		}

		@Override
		public Adapter caseExcludeConstraint(ExcludeConstraint object) {
			return createExcludeConstraintAdapter();
		}

		@Override
		public Adapter caseOpenValueAttribute(OpenValueAttribute object) {
			return createOpenValueAttributeAdapter();
		}

		@Override
		public Adapter caseQualityProperty(QualityProperty object) {
			return createQualityPropertyAdapter();
		}

		@Override
		public Adapter caseFairness(Fairness object) {
			return createFairnessAdapter();
		}

		@Override
		public Adapter caseExplainability(Explainability object) {
			return createExplainabilityAdapter();
		}

		@Override
		public Adapter caseMetric(Metric object) {
			return createMetricAdapter();
		}

		@Override
		public Adapter caseThreshold(Threshold object) {
			return createThresholdAdapter();
		}

		@Override
		public Adapter caseSelectionValueAttribute(SelectionValueAttribute object) {
			return createSelectionValueAttributeAdapter();
		}

		@Override
		public Adapter caseAttribute(Attribute object) {
			return createAttributeAdapter();
		}

		@Override
		public Adapter caseAttributeValue(AttributeValue object) {
			return createAttributeValueAdapter();
		}

		@Override
		public Adapter casePredictionCorrectness(PredictionCorrectness object) {
			return createPredictionCorrectnessAdapter();
		}

		@Override
		public Adapter casePrivacy(Privacy object) {
			return createPrivacyAdapter();
		}

		@Override
		public Adapter caseQualityRequirements(QualityRequirements object) {
			return createQualityRequirementsAdapter();
		}

		@Override
		public Adapter caseComputationalComplexity(ComputationalComplexity object) {
			return createComputationalComplexityAdapter();
		}

		@Override
		public Adapter caseOrGroup(OrGroup object) {
			return createOrGroupAdapter();
		}

		@Override
		public Adapter caseAltGroup(AltGroup object) {
			return createAltGroupAdapter();
		}

		@Override
		public Adapter caseQualityRequirement(QualityRequirement object) {
			return createQualityRequirementAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.qml.FeatureModel <em>Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.qml.FeatureModel
	 * @generated
	 */
	public Adapter createFeatureModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.qml.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.qml.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.qml.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.qml.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.qml.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.qml.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.qml.RequireConstraint <em>Require Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.qml.RequireConstraint
	 * @generated
	 */
	public Adapter createRequireConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.qml.ExcludeConstraint <em>Exclude Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.qml.ExcludeConstraint
	 * @generated
	 */
	public Adapter createExcludeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.qml.OpenValueAttribute <em>Open Value Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.qml.OpenValueAttribute
	 * @generated
	 */
	public Adapter createOpenValueAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.qml.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.qml.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.qml.AttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.qml.AttributeValue
	 * @generated
	 */
	public Adapter createAttributeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.qml.PredictionCorrectness <em>Prediction Correctness</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.qml.PredictionCorrectness
	 * @generated
	 */
	public Adapter createPredictionCorrectnessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.qml.Privacy <em>Privacy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.qml.Privacy
	 * @generated
	 */
	public Adapter createPrivacyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.qml.QualityRequirements <em>Quality Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.qml.QualityRequirements
	 * @generated
	 */
	public Adapter createQualityRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.qml.QualityRequirement <em>Quality Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.qml.QualityRequirement
	 * @generated
	 */
	public Adapter createQualityRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.qml.ComputationalComplexity <em>Computational Complexity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.qml.ComputationalComplexity
	 * @generated
	 */
	public Adapter createComputationalComplexityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.qml.OrGroup <em>Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.qml.OrGroup
	 * @generated
	 */
	public Adapter createOrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.qml.AltGroup <em>Alt Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.qml.AltGroup
	 * @generated
	 */
	public Adapter createAltGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.qml.QualityProperty <em>Quality Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.qml.QualityProperty
	 * @generated
	 */
	public Adapter createQualityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.qml.Fairness <em>Fairness</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.qml.Fairness
	 * @generated
	 */
	public Adapter createFairnessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.qml.Explainability <em>Explainability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.qml.Explainability
	 * @generated
	 */
	public Adapter createExplainabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.qml.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.qml.Metric
	 * @generated
	 */
	public Adapter createMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.qml.Threshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.qml.Threshold
	 * @generated
	 */
	public Adapter createThresholdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.qml.SelectionValueAttribute <em>Selection Value Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.qml.SelectionValueAttribute
	 * @generated
	 */
	public Adapter createSelectionValueAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //QmlAdapterFactory
