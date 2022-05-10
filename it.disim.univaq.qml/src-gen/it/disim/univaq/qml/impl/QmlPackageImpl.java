/**
 */
package it.disim.univaq.qml.impl;

import it.disim.univaq.qml.AltGroup;
import it.disim.univaq.qml.Attribute;
import it.disim.univaq.qml.AttributeSpecification;
import it.disim.univaq.qml.AttributeValue;
import it.disim.univaq.qml.BaseType;
import it.disim.univaq.qml.ComputationalComplexity;
import it.disim.univaq.qml.Constraint;
import it.disim.univaq.qml.ExcludeConstraint;
import it.disim.univaq.qml.Explainability;
import it.disim.univaq.qml.Fairness;
import it.disim.univaq.qml.FairnessType;
import it.disim.univaq.qml.Feature;
import it.disim.univaq.qml.FeatureModel;
import it.disim.univaq.qml.Group;
import it.disim.univaq.qml.Level;
import it.disim.univaq.qml.Metric;
import it.disim.univaq.qml.Operator;
import it.disim.univaq.qml.OrGroup;
import it.disim.univaq.qml.PredictionCorrectness;
import it.disim.univaq.qml.Privacy;
import it.disim.univaq.qml.QmlFactory;
import it.disim.univaq.qml.QmlPackage;
import it.disim.univaq.qml.QualityNature;
import it.disim.univaq.qml.QualityProperty;
import it.disim.univaq.qml.QualityRequirement;
import it.disim.univaq.qml.RequireConstraint;
import it.disim.univaq.qml.Requirement;
import it.disim.univaq.qml.TaskType;
import it.disim.univaq.qml.Threshold;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QmlPackageImpl extends EPackageImpl implements QmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requireConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excludeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predictionCorrectnessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privacyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computationalComplexityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass altGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fairnessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explainabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thresholdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum levelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum qualityNatureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fairnessTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum baseTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taskTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see it.disim.univaq.qml.QmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QmlPackageImpl() {
		super(eNS_URI, QmlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link QmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QmlPackage init() {
		if (isInited)
			return (QmlPackage) EPackage.Registry.INSTANCE.getEPackage(QmlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredQmlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		QmlPackageImpl theQmlPackage = registeredQmlPackage instanceof QmlPackageImpl
				? (QmlPackageImpl) registeredQmlPackage
				: new QmlPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theQmlPackage.createPackageContents();

		// Initialize created meta-data
		theQmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQmlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QmlPackage.eNS_URI, theQmlPackage);
		return theQmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureModel() {
		return featureModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureModel_Root() {
		return (EReference) featureModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureModel_Groups() {
		return (EReference) featureModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureModel_Constraint() {
		return (EReference) featureModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureModel_QualityProperties() {
		return (EReference) featureModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureModel_Requirement() {
		return (EReference) featureModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Name() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Abstract() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Hidden() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Mandatory() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_Children() {
		return (EReference) featureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_Group() {
		return (EReference) featureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_Attribute() {
		return (EReference) featureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroup_Feature() {
		return (EReference) groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequireConstraint() {
		return requireConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequireConstraint_RequiringFeature() {
		return (EReference) requireConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequireConstraint_RequiredFeature() {
		return (EReference) requireConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequireConstraint_RequiredAttribute() {
		return (EReference) requireConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequireConstraint_RequiredAttributeValue() {
		return (EReference) requireConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExcludeConstraint() {
		return excludeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExcludeConstraint_ExcludingFeature() {
		return (EReference) excludeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExcludeConstraint_ExcludedFeature() {
		return (EReference) excludeConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExcludeConstraint_ExcludedAttribute() {
		return (EReference) excludeConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExcludeConstraint_ExcludedAttributeValue() {
		return (EReference) excludeConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Name() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttribute_Attributevalue() {
		return (EReference) attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttributeValue() {
		return attributeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeValue_Value() {
		return (EAttribute) attributeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredictionCorrectness() {
		return predictionCorrectnessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrivacy() {
		return privacyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivacy_PrivacyLevel() {
		return (EAttribute) privacyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirement_Qualityrequirement() {
		return (EReference) requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Task() {
		return (EAttribute) requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirement_Attributespecification() {
		return (EReference) requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQualityRequirement() {
		return qualityRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQualityRequirement_RelatedTo() {
		return (EReference) qualityRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQualityRequirement_Threshold() {
		return (EReference) qualityRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttributeSpecification() {
		return attributeSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttributeSpecification_Attribute() {
		return (EReference) attributeSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttributeSpecification_Attributevalue() {
		return (EReference) attributeSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComputationalComplexity() {
		return computationalComplexityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrGroup() {
		return orGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAltGroup() {
		return altGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQualityProperty() {
		return qualityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQualityProperty_Measure() {
		return (EReference) qualityPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQualityProperty_Nature() {
		return (EAttribute) qualityPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQualityProperty_ImplementedBy() {
		return (EReference) qualityPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQualityProperty_InvolvedFeature() {
		return (EReference) qualityPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQualityProperty_InfluencedBy() {
		return (EReference) qualityPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFairness() {
		return fairnessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFairness_Type() {
		return (EAttribute) fairnessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExplainability() {
		return explainabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExplainability_ExplainabilityLevel() {
		return (EAttribute) explainabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetric() {
		return metricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetric_ImplementedBy() {
		return (EReference) metricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetric_Name() {
		return (EAttribute) metricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreshold() {
		return thresholdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreshold_Value() {
		return (EAttribute) thresholdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreshold_RelatedTo() {
		return (EReference) thresholdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreshold_EqualityOperator() {
		return (EAttribute) thresholdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLevel() {
		return levelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getQualityNature() {
		return qualityNatureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFairnessType() {
		return fairnessTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBaseType() {
		return baseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTaskType() {
		return taskTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOperator() {
		return operatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QmlFactory getQmlFactory() {
		return (QmlFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		featureModelEClass = createEClass(FEATURE_MODEL);
		createEReference(featureModelEClass, FEATURE_MODEL__ROOT);
		createEReference(featureModelEClass, FEATURE_MODEL__GROUPS);
		createEReference(featureModelEClass, FEATURE_MODEL__CONSTRAINT);
		createEReference(featureModelEClass, FEATURE_MODEL__QUALITY_PROPERTIES);
		createEReference(featureModelEClass, FEATURE_MODEL__REQUIREMENT);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__NAME);
		createEAttribute(featureEClass, FEATURE__ABSTRACT);
		createEAttribute(featureEClass, FEATURE__HIDDEN);
		createEAttribute(featureEClass, FEATURE__MANDATORY);
		createEReference(featureEClass, FEATURE__CHILDREN);
		createEReference(featureEClass, FEATURE__GROUP);
		createEReference(featureEClass, FEATURE__ATTRIBUTE);

		groupEClass = createEClass(GROUP);
		createEReference(groupEClass, GROUP__FEATURE);

		constraintEClass = createEClass(CONSTRAINT);

		requireConstraintEClass = createEClass(REQUIRE_CONSTRAINT);
		createEReference(requireConstraintEClass, REQUIRE_CONSTRAINT__REQUIRING_FEATURE);
		createEReference(requireConstraintEClass, REQUIRE_CONSTRAINT__REQUIRED_FEATURE);
		createEReference(requireConstraintEClass, REQUIRE_CONSTRAINT__REQUIRED_ATTRIBUTE);
		createEReference(requireConstraintEClass, REQUIRE_CONSTRAINT__REQUIRED_ATTRIBUTE_VALUE);

		excludeConstraintEClass = createEClass(EXCLUDE_CONSTRAINT);
		createEReference(excludeConstraintEClass, EXCLUDE_CONSTRAINT__EXCLUDING_FEATURE);
		createEReference(excludeConstraintEClass, EXCLUDE_CONSTRAINT__EXCLUDED_FEATURE);
		createEReference(excludeConstraintEClass, EXCLUDE_CONSTRAINT__EXCLUDED_ATTRIBUTE);
		createEReference(excludeConstraintEClass, EXCLUDE_CONSTRAINT__EXCLUDED_ATTRIBUTE_VALUE);

		qualityPropertyEClass = createEClass(QUALITY_PROPERTY);
		createEReference(qualityPropertyEClass, QUALITY_PROPERTY__MEASURE);
		createEAttribute(qualityPropertyEClass, QUALITY_PROPERTY__NATURE);
		createEReference(qualityPropertyEClass, QUALITY_PROPERTY__IMPLEMENTED_BY);
		createEReference(qualityPropertyEClass, QUALITY_PROPERTY__INVOLVED_FEATURE);
		createEReference(qualityPropertyEClass, QUALITY_PROPERTY__INFLUENCED_BY);

		fairnessEClass = createEClass(FAIRNESS);
		createEAttribute(fairnessEClass, FAIRNESS__TYPE);

		explainabilityEClass = createEClass(EXPLAINABILITY);
		createEAttribute(explainabilityEClass, EXPLAINABILITY__EXPLAINABILITY_LEVEL);

		metricEClass = createEClass(METRIC);
		createEReference(metricEClass, METRIC__IMPLEMENTED_BY);
		createEAttribute(metricEClass, METRIC__NAME);

		thresholdEClass = createEClass(THRESHOLD);
		createEAttribute(thresholdEClass, THRESHOLD__VALUE);
		createEReference(thresholdEClass, THRESHOLD__RELATED_TO);
		createEAttribute(thresholdEClass, THRESHOLD__EQUALITY_OPERATOR);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEReference(attributeEClass, ATTRIBUTE__ATTRIBUTEVALUE);

		attributeValueEClass = createEClass(ATTRIBUTE_VALUE);
		createEAttribute(attributeValueEClass, ATTRIBUTE_VALUE__VALUE);

		predictionCorrectnessEClass = createEClass(PREDICTION_CORRECTNESS);

		privacyEClass = createEClass(PRIVACY);
		createEAttribute(privacyEClass, PRIVACY__PRIVACY_LEVEL);

		requirementEClass = createEClass(REQUIREMENT);
		createEReference(requirementEClass, REQUIREMENT__QUALITYREQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__TASK);
		createEReference(requirementEClass, REQUIREMENT__ATTRIBUTESPECIFICATION);

		computationalComplexityEClass = createEClass(COMPUTATIONAL_COMPLEXITY);

		orGroupEClass = createEClass(OR_GROUP);

		altGroupEClass = createEClass(ALT_GROUP);

		qualityRequirementEClass = createEClass(QUALITY_REQUIREMENT);
		createEReference(qualityRequirementEClass, QUALITY_REQUIREMENT__RELATED_TO);
		createEReference(qualityRequirementEClass, QUALITY_REQUIREMENT__THRESHOLD);

		attributeSpecificationEClass = createEClass(ATTRIBUTE_SPECIFICATION);
		createEReference(attributeSpecificationEClass, ATTRIBUTE_SPECIFICATION__ATTRIBUTE);
		createEReference(attributeSpecificationEClass, ATTRIBUTE_SPECIFICATION__ATTRIBUTEVALUE);

		// Create enums
		levelEEnum = createEEnum(LEVEL);
		qualityNatureEEnum = createEEnum(QUALITY_NATURE);
		fairnessTypeEEnum = createEEnum(FAIRNESS_TYPE);
		baseTypeEEnum = createEEnum(BASE_TYPE);
		taskTypeEEnum = createEEnum(TASK_TYPE);
		operatorEEnum = createEEnum(OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		requireConstraintEClass.getESuperTypes().add(this.getConstraint());
		excludeConstraintEClass.getESuperTypes().add(this.getConstraint());
		fairnessEClass.getESuperTypes().add(this.getQualityProperty());
		explainabilityEClass.getESuperTypes().add(this.getQualityProperty());
		predictionCorrectnessEClass.getESuperTypes().add(this.getQualityProperty());
		privacyEClass.getESuperTypes().add(this.getQualityProperty());
		computationalComplexityEClass.getESuperTypes().add(this.getQualityProperty());
		orGroupEClass.getESuperTypes().add(this.getGroup());
		altGroupEClass.getESuperTypes().add(this.getGroup());

		// Initialize classes, features, and operations; add parameters
		initEClass(featureModelEClass, FeatureModel.class, "FeatureModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureModel_Root(), this.getFeature(), null, "root", null, 1, 1, FeatureModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureModel_Groups(), this.getGroup(), null, "groups", null, 0, -1, FeatureModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureModel_Constraint(), this.getConstraint(), null, "constraint", null, 0, -1,
				FeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureModel_QualityProperties(), this.getQualityProperty(), null, "qualityProperties", null,
				0, -1, FeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureModel_Requirement(), this.getRequirement(), null, "requirement", null, 0, 1,
				FeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, Feature.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, Feature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Hidden(), ecorePackage.getEBoolean(), "hidden", null, 0, 1, Feature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Mandatory(), ecorePackage.getEBoolean(), "mandatory", null, 0, 1, Feature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Children(), this.getFeature(), null, "children", null, 0, -1, Feature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Group(), this.getGroup(), this.getGroup_Feature(), "group", null, 0, 1, Feature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1, Feature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroup_Feature(), this.getFeature(), this.getFeature_Group(), "feature", null, 2, -1,
				Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(requireConstraintEClass, RequireConstraint.class, "RequireConstraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequireConstraint_RequiringFeature(), this.getFeature(), null, "requiringFeature", null, 1, 1,
				RequireConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequireConstraint_RequiredFeature(), this.getFeature(), null, "requiredFeature", null, 0, -1,
				RequireConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequireConstraint_RequiredAttribute(), this.getAttribute(), null, "requiredAttribute", null,
				0, -1, RequireConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequireConstraint_RequiredAttributeValue(), this.getAttributeValue(), null,
				"requiredAttributeValue", null, 0, -1, RequireConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(excludeConstraintEClass, ExcludeConstraint.class, "ExcludeConstraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExcludeConstraint_ExcludingFeature(), this.getFeature(), null, "excludingFeature", null, 1, 1,
				ExcludeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExcludeConstraint_ExcludedFeature(), this.getFeature(), null, "excludedFeature", null, 0, -1,
				ExcludeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExcludeConstraint_ExcludedAttribute(), this.getAttribute(), null, "excludedAttribute", null,
				0, -1, ExcludeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExcludeConstraint_ExcludedAttributeValue(), this.getAttributeValue(), null,
				"excludedAttributeValue", null, 0, -1, ExcludeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualityPropertyEClass, QualityProperty.class, "QualityProperty", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualityProperty_Measure(), this.getMetric(), null, "measure", null, 0, -1,
				QualityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualityProperty_Nature(), this.getQualityNature(), "nature", null, 0, 1,
				QualityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getQualityProperty_ImplementedBy(), this.getFeature(), null, "implementedBy", null, 0, -1,
				QualityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualityProperty_InvolvedFeature(), this.getFeature(), null, "involvedFeature", null, 0, -1,
				QualityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualityProperty_InfluencedBy(), this.getQualityProperty(), null, "influencedBy", null, 0, -1,
				QualityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fairnessEClass, Fairness.class, "Fairness", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFairness_Type(), this.getFairnessType(), "type", null, 0, 1, Fairness.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(explainabilityEClass, Explainability.class, "Explainability", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExplainability_ExplainabilityLevel(), this.getLevel(), "explainabilityLevel", null, 0, 1,
				Explainability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(metricEClass, Metric.class, "Metric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetric_ImplementedBy(), this.getFeature(), null, "implementedBy", null, 1, 1, Metric.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_Name(), ecorePackage.getEString(), "name", null, 0, 1, Metric.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thresholdEClass, Threshold.class, "Threshold", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThreshold_Value(), theXMLTypePackage.getFloat(), "value", null, 0, 1, Threshold.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreshold_RelatedTo(), this.getMetric(), null, "relatedTo", null, 1, 1, Threshold.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreshold_EqualityOperator(), this.getOperator(), "equalityOperator", null, 0, 1,
				Threshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Attributevalue(), this.getAttributeValue(), null, "attributevalue", null, 1, -1,
				Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeValueEClass, AttributeValue.class, "AttributeValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeValue_Value(), theXMLTypePackage.getAnySimpleType(), "value", null, 0, 1,
				AttributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(predictionCorrectnessEClass, PredictionCorrectness.class, "PredictionCorrectness", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(privacyEClass, Privacy.class, "Privacy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrivacy_PrivacyLevel(), this.getLevel(), "privacyLevel", null, 0, 1, Privacy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirement_Qualityrequirement(), this.getQualityRequirement(), null, "qualityrequirement",
				null, 1, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Task(), this.getTaskType(), "task", null, 1, 1, Requirement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Attributespecification(), this.getAttributeSpecification(), null,
				"attributespecification", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computationalComplexityEClass, ComputationalComplexity.class, "ComputationalComplexity",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orGroupEClass, OrGroup.class, "OrGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(altGroupEClass, AltGroup.class, "AltGroup", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(qualityRequirementEClass, QualityRequirement.class, "QualityRequirement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualityRequirement_RelatedTo(), this.getQualityProperty(), null, "relatedTo", null, 1, 1,
				QualityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualityRequirement_Threshold(), this.getThreshold(), null, "threshold", null, 0, -1,
				QualityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeSpecificationEClass, AttributeSpecification.class, "AttributeSpecification", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeSpecification_Attribute(), this.getAttribute(), null, "attribute", null, 1, 1,
				AttributeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeSpecification_Attributevalue(), this.getAttributeValue(), null, "attributevalue",
				null, 1, 1, AttributeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(levelEEnum, Level.class, "Level");
		addEEnumLiteral(levelEEnum, Level.LOW);
		addEEnumLiteral(levelEEnum, Level.MEDIUM);
		addEEnumLiteral(levelEEnum, Level.HIGH);

		initEEnum(qualityNatureEEnum, QualityNature.class, "QualityNature");
		addEEnumLiteral(qualityNatureEEnum, QualityNature.REQUIRED);
		addEEnumLiteral(qualityNatureEEnum, QualityNature.OBSERVED);

		initEEnum(fairnessTypeEEnum, FairnessType.class, "FairnessType");
		addEEnumLiteral(fairnessTypeEEnum, FairnessType.PREPROCESSING);
		addEEnumLiteral(fairnessTypeEEnum, FairnessType.INPROCESSING);
		addEEnumLiteral(fairnessTypeEEnum, FairnessType.POSTPROCESSING);

		initEEnum(baseTypeEEnum, BaseType.class, "BaseType");
		addEEnumLiteral(baseTypeEEnum, BaseType.INTEGER);
		addEEnumLiteral(baseTypeEEnum, BaseType.FLOAT);
		addEEnumLiteral(baseTypeEEnum, BaseType.BOOLEAN);
		addEEnumLiteral(baseTypeEEnum, BaseType.STRING);

		initEEnum(taskTypeEEnum, TaskType.class, "TaskType");
		addEEnumLiteral(taskTypeEEnum, TaskType.CLASSIFICATION);
		addEEnumLiteral(taskTypeEEnum, TaskType.REGRESSION);
		addEEnumLiteral(taskTypeEEnum, TaskType.NLP);

		initEEnum(operatorEEnum, Operator.class, "Operator");
		addEEnumLiteral(operatorEEnum, Operator.LOWER_OR_EQUAL);
		addEEnumLiteral(operatorEEnum, Operator.EQUAL);
		addEEnumLiteral(operatorEEnum, Operator.HIGHER_OR_EQUAL);

		// Create resource
		createResource(eNS_URI);
	}

} //QmlPackageImpl
