/**
 */
package it.disim.univaq.qml.impl;

import it.disim.univaq.qml.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QmlFactoryImpl extends EFactoryImpl implements QmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QmlFactory init() {
		try {
			QmlFactory theQmlFactory = (QmlFactory) EPackage.Registry.INSTANCE.getEFactory(QmlPackage.eNS_URI);
			if (theQmlFactory != null) {
				return theQmlFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case QmlPackage.FEATURE_MODEL:
			return createFeatureModel();
		case QmlPackage.FEATURE:
			return createFeature();
		case QmlPackage.GROUP:
			return createGroup();
		case QmlPackage.REQUIRE_CONSTRAINT:
			return createRequireConstraint();
		case QmlPackage.EXCLUDE_CONSTRAINT:
			return createExcludeConstraint();
		case QmlPackage.OPEN_VALUE_ATTRIBUTE:
			return createOpenValueAttribute();
		case QmlPackage.FAIRNESS:
			return createFairness();
		case QmlPackage.EXPLAINABILITY:
			return createExplainability();
		case QmlPackage.MEASURE:
			return createMeasure();
		case QmlPackage.THRESHOLD:
			return createThreshold();
		case QmlPackage.SELECTION_VALUE_ATTRIBUTE:
			return createSelectionValueAttribute();
		case QmlPackage.ATTRIBUTE_VALUE:
			return createAttributeValue();
		case QmlPackage.PREDICTION_QUALITY:
			return createPredictionQuality();
		case QmlPackage.PRIVACY:
			return createPrivacy();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case QmlPackage.GROUP_TYPE:
			return createGroupTypeFromString(eDataType, initialValue);
		case QmlPackage.LEVEL:
			return createLevelFromString(eDataType, initialValue);
		case QmlPackage.QUALITY_NATURE:
			return createQualityNatureFromString(eDataType, initialValue);
		case QmlPackage.FAIRNESS_TYPE:
			return createFairnessTypeFromString(eDataType, initialValue);
		case QmlPackage.BASE_TYPE:
			return createBaseTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case QmlPackage.GROUP_TYPE:
			return convertGroupTypeToString(eDataType, instanceValue);
		case QmlPackage.LEVEL:
			return convertLevelToString(eDataType, instanceValue);
		case QmlPackage.QUALITY_NATURE:
			return convertQualityNatureToString(eDataType, instanceValue);
		case QmlPackage.FAIRNESS_TYPE:
			return convertFairnessTypeToString(eDataType, instanceValue);
		case QmlPackage.BASE_TYPE:
			return convertBaseTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureModel createFeatureModel() {
		FeatureModelImpl featureModel = new FeatureModelImpl();
		return featureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequireConstraint createRequireConstraint() {
		RequireConstraintImpl requireConstraint = new RequireConstraintImpl();
		return requireConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExcludeConstraint createExcludeConstraint() {
		ExcludeConstraintImpl excludeConstraint = new ExcludeConstraintImpl();
		return excludeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenValueAttribute createOpenValueAttribute() {
		OpenValueAttributeImpl openValueAttribute = new OpenValueAttributeImpl();
		return openValueAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fairness createFairness() {
		FairnessImpl fairness = new FairnessImpl();
		return fairness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Explainability createExplainability() {
		ExplainabilityImpl explainability = new ExplainabilityImpl();
		return explainability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Measure createMeasure() {
		MeasureImpl measure = new MeasureImpl();
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Threshold createThreshold() {
		ThresholdImpl threshold = new ThresholdImpl();
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectionValueAttribute createSelectionValueAttribute() {
		SelectionValueAttributeImpl selectionValueAttribute = new SelectionValueAttributeImpl();
		return selectionValueAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeValue createAttributeValue() {
		AttributeValueImpl attributeValue = new AttributeValueImpl();
		return attributeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PredictionQuality createPredictionQuality() {
		PredictionQualityImpl predictionQuality = new PredictionQualityImpl();
		return predictionQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Privacy createPrivacy() {
		PrivacyImpl privacy = new PrivacyImpl();
		return privacy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupType createGroupTypeFromString(EDataType eDataType, String initialValue) {
		GroupType result = GroupType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level createLevelFromString(EDataType eDataType, String initialValue) {
		Level result = Level.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityNature createQualityNatureFromString(EDataType eDataType, String initialValue) {
		QualityNature result = QualityNature.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQualityNatureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FairnessType createFairnessTypeFromString(EDataType eDataType, String initialValue) {
		FairnessType result = FairnessType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFairnessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseType createBaseTypeFromString(EDataType eDataType, String initialValue) {
		BaseType result = BaseType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBaseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QmlPackage getQmlPackage() {
		return (QmlPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QmlPackage getPackage() {
		return QmlPackage.eINSTANCE;
	}

} //QmlFactoryImpl
