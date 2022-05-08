/**
 */
package it.disim.univaq.qml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.disim.univaq.qml.QmlFactory
 * @model kind="package"
 * @generated
 */
public interface QmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/qml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QmlPackage eINSTANCE = it.disim.univaq.qml.impl.QmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.impl.FeatureModelImpl <em>Feature Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.impl.FeatureModelImpl
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getFeatureModel()
	 * @generated
	 */
	int FEATURE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__ROOT = 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__GROUPS = 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Quality Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__QUALITY_PROPERTIES = 3;

	/**
	 * The feature id for the '<em><b>Qualityrequirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__QUALITYREQUIREMENT = 4;

	/**
	 * The number of structural features of the '<em>Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.impl.FeatureImpl
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ABSTRACT = 1;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__HIDDEN = 2;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__MANDATORY = 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CHILDREN = 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__GROUP = 5;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.impl.GroupImpl
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 2;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__FEATURE = 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.impl.ConstraintImpl
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 3;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.impl.RequireConstraintImpl <em>Require Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.impl.RequireConstraintImpl
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getRequireConstraint()
	 * @generated
	 */
	int REQUIRE_CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Requiring Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_CONSTRAINT__REQUIRING_FEATURE = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_CONSTRAINT__REQUIRED_FEATURE = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_CONSTRAINT__REQUIRED_ATTRIBUTE = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required Attribute Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_CONSTRAINT__REQUIRED_ATTRIBUTE_VALUE = CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Require Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Require Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.impl.ExcludeConstraintImpl <em>Exclude Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.impl.ExcludeConstraintImpl
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getExcludeConstraint()
	 * @generated
	 */
	int EXCLUDE_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Excluding Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_CONSTRAINT__EXCLUDING_FEATURE = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Excluded Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_CONSTRAINT__EXCLUDED_FEATURE = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Excluded Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_CONSTRAINT__EXCLUDED_ATTRIBUTE = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Excluded Attribute Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_CONSTRAINT__EXCLUDED_ATTRIBUTE_VALUE = CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Exclude Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Exclude Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.impl.AttributeImpl
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.impl.OpenValueAttributeImpl <em>Open Value Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.impl.OpenValueAttributeImpl
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getOpenValueAttribute()
	 * @generated
	 */
	int OPEN_VALUE_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_VALUE_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_VALUE_ATTRIBUTE__TYPE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Open Value Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_VALUE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Open Value Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_VALUE_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.impl.QualityPropertyImpl <em>Quality Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.impl.QualityPropertyImpl
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getQualityProperty()
	 * @generated
	 */
	int QUALITY_PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_PROPERTY__MEASURE = 0;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_PROPERTY__NATURE = 1;

	/**
	 * The feature id for the '<em><b>Implemented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_PROPERTY__IMPLEMENTED_BY = 2;

	/**
	 * The feature id for the '<em><b>Involved Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_PROPERTY__INVOLVED_FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Influenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_PROPERTY__INFLUENCED_BY = 4;

	/**
	 * The number of structural features of the '<em>Quality Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_PROPERTY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Quality Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.impl.FairnessImpl <em>Fairness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.impl.FairnessImpl
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getFairness()
	 * @generated
	 */
	int FAIRNESS = 8;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIRNESS__MEASURE = QUALITY_PROPERTY__MEASURE;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIRNESS__NATURE = QUALITY_PROPERTY__NATURE;

	/**
	 * The feature id for the '<em><b>Implemented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIRNESS__IMPLEMENTED_BY = QUALITY_PROPERTY__IMPLEMENTED_BY;

	/**
	 * The feature id for the '<em><b>Involved Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIRNESS__INVOLVED_FEATURE = QUALITY_PROPERTY__INVOLVED_FEATURE;

	/**
	 * The feature id for the '<em><b>Influenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIRNESS__INFLUENCED_BY = QUALITY_PROPERTY__INFLUENCED_BY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIRNESS__TYPE = QUALITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fairness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIRNESS_FEATURE_COUNT = QUALITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fairness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIRNESS_OPERATION_COUNT = QUALITY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.impl.ExplainabilityImpl <em>Explainability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.impl.ExplainabilityImpl
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getExplainability()
	 * @generated
	 */
	int EXPLAINABILITY = 9;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLAINABILITY__MEASURE = QUALITY_PROPERTY__MEASURE;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLAINABILITY__NATURE = QUALITY_PROPERTY__NATURE;

	/**
	 * The feature id for the '<em><b>Implemented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLAINABILITY__IMPLEMENTED_BY = QUALITY_PROPERTY__IMPLEMENTED_BY;

	/**
	 * The feature id for the '<em><b>Involved Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLAINABILITY__INVOLVED_FEATURE = QUALITY_PROPERTY__INVOLVED_FEATURE;

	/**
	 * The feature id for the '<em><b>Influenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLAINABILITY__INFLUENCED_BY = QUALITY_PROPERTY__INFLUENCED_BY;

	/**
	 * The feature id for the '<em><b>Explainability Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLAINABILITY__EXPLAINABILITY_LEVEL = QUALITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Explainability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLAINABILITY_FEATURE_COUNT = QUALITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Explainability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLAINABILITY_OPERATION_COUNT = QUALITY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.impl.MetricImpl
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 10;

	/**
	 * The feature id for the '<em><b>Implemented By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__IMPLEMENTED_BY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__NAME = 1;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.impl.ThresholdImpl <em>Threshold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.impl.ThresholdImpl
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getThreshold()
	 * @generated
	 */
	int THRESHOLD = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Related To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD__RELATED_TO = 1;

	/**
	 * The feature id for the '<em><b>Equality Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD__EQUALITY_OPERATOR = 2;

	/**
	 * The number of structural features of the '<em>Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.impl.SelectionValueAttributeImpl <em>Selection Value Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.impl.SelectionValueAttributeImpl
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getSelectionValueAttribute()
	 * @generated
	 */
	int SELECTION_VALUE_ATTRIBUTE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_VALUE_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Attributevalue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_VALUE_ATTRIBUTE__ATTRIBUTEVALUE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Selection Value Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_VALUE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Selection Value Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_VALUE_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.impl.AttributeValueImpl
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getAttributeValue()
	 * @generated
	 */
	int ATTRIBUTE_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.impl.PredictionCorrectnessImpl <em>Prediction Correctness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.impl.PredictionCorrectnessImpl
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getPredictionCorrectness()
	 * @generated
	 */
	int PREDICTION_CORRECTNESS = 15;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION_CORRECTNESS__MEASURE = QUALITY_PROPERTY__MEASURE;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION_CORRECTNESS__NATURE = QUALITY_PROPERTY__NATURE;

	/**
	 * The feature id for the '<em><b>Implemented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION_CORRECTNESS__IMPLEMENTED_BY = QUALITY_PROPERTY__IMPLEMENTED_BY;

	/**
	 * The feature id for the '<em><b>Involved Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION_CORRECTNESS__INVOLVED_FEATURE = QUALITY_PROPERTY__INVOLVED_FEATURE;

	/**
	 * The feature id for the '<em><b>Influenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION_CORRECTNESS__INFLUENCED_BY = QUALITY_PROPERTY__INFLUENCED_BY;

	/**
	 * The number of structural features of the '<em>Prediction Correctness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION_CORRECTNESS_FEATURE_COUNT = QUALITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Prediction Correctness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION_CORRECTNESS_OPERATION_COUNT = QUALITY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.impl.PrivacyImpl <em>Privacy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.impl.PrivacyImpl
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getPrivacy()
	 * @generated
	 */
	int PRIVACY = 16;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY__MEASURE = QUALITY_PROPERTY__MEASURE;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY__NATURE = QUALITY_PROPERTY__NATURE;

	/**
	 * The feature id for the '<em><b>Implemented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY__IMPLEMENTED_BY = QUALITY_PROPERTY__IMPLEMENTED_BY;

	/**
	 * The feature id for the '<em><b>Involved Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY__INVOLVED_FEATURE = QUALITY_PROPERTY__INVOLVED_FEATURE;

	/**
	 * The feature id for the '<em><b>Influenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY__INFLUENCED_BY = QUALITY_PROPERTY__INFLUENCED_BY;

	/**
	 * The feature id for the '<em><b>Privacy Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY__PRIVACY_LEVEL = QUALITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Privacy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_FEATURE_COUNT = QUALITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Privacy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_OPERATION_COUNT = QUALITY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.impl.QualityRequirementsImpl <em>Quality Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.impl.QualityRequirementsImpl
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getQualityRequirements()
	 * @generated
	 */
	int QUALITY_REQUIREMENTS = 17;

	/**
	 * The feature id for the '<em><b>Made Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENTS__MADE_OF = 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENTS__TASK = 1;

	/**
	 * The number of structural features of the '<em>Quality Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Quality Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.impl.QualityRequirementImpl <em>Quality Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.impl.QualityRequirementImpl
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getQualityRequirement()
	 * @generated
	 */
	int QUALITY_REQUIREMENT = 21;

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.impl.ComputationalComplexityImpl <em>Computational Complexity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.impl.ComputationalComplexityImpl
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getComputationalComplexity()
	 * @generated
	 */
	int COMPUTATIONAL_COMPLEXITY = 18;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_COMPLEXITY__MEASURE = QUALITY_PROPERTY__MEASURE;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_COMPLEXITY__NATURE = QUALITY_PROPERTY__NATURE;

	/**
	 * The feature id for the '<em><b>Implemented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_COMPLEXITY__IMPLEMENTED_BY = QUALITY_PROPERTY__IMPLEMENTED_BY;

	/**
	 * The feature id for the '<em><b>Involved Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_COMPLEXITY__INVOLVED_FEATURE = QUALITY_PROPERTY__INVOLVED_FEATURE;

	/**
	 * The feature id for the '<em><b>Influenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_COMPLEXITY__INFLUENCED_BY = QUALITY_PROPERTY__INFLUENCED_BY;

	/**
	 * The number of structural features of the '<em>Computational Complexity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_COMPLEXITY_FEATURE_COUNT = QUALITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Computational Complexity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_COMPLEXITY_OPERATION_COUNT = QUALITY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.impl.OrGroupImpl <em>Or Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.impl.OrGroupImpl
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getOrGroup()
	 * @generated
	 */
	int OR_GROUP = 19;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GROUP__FEATURE = GROUP__FEATURE;

	/**
	 * The number of structural features of the '<em>Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GROUP_FEATURE_COUNT = GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GROUP_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.impl.AltGroupImpl <em>Alt Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.impl.AltGroupImpl
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getAltGroup()
	 * @generated
	 */
	int ALT_GROUP = 20;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_GROUP__FEATURE = GROUP__FEATURE;

	/**
	 * The number of structural features of the '<em>Alt Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_GROUP_FEATURE_COUNT = GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Alt Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_GROUP_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Related To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__RELATED_TO = 0;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__THRESHOLD = 1;

	/**
	 * The number of structural features of the '<em>Quality Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Quality Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.Level <em>Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.Level
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 22;

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.QualityNature <em>Quality Nature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.QualityNature
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getQualityNature()
	 * @generated
	 */
	int QUALITY_NATURE = 23;

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.FairnessType <em>Fairness Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.FairnessType
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getFairnessType()
	 * @generated
	 */
	int FAIRNESS_TYPE = 24;

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.BaseType <em>Base Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.BaseType
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getBaseType()
	 * @generated
	 */
	int BASE_TYPE = 25;

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.TaskType <em>Task Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.TaskType
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getTaskType()
	 * @generated
	 */
	int TASK_TYPE = 26;

	/**
	 * The meta object id for the '{@link it.disim.univaq.qml.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.qml.Operator
	 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 27;

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.qml.FeatureModel <em>Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Model</em>'.
	 * @see it.disim.univaq.qml.FeatureModel
	 * @generated
	 */
	EClass getFeatureModel();

	/**
	 * Returns the meta object for the containment reference '{@link it.disim.univaq.qml.FeatureModel#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see it.disim.univaq.qml.FeatureModel#getRoot()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_Root();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.qml.FeatureModel#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see it.disim.univaq.qml.FeatureModel#getGroups()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.qml.FeatureModel#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see it.disim.univaq.qml.FeatureModel#getConstraint()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_Constraint();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.qml.FeatureModel#getQualityProperties <em>Quality Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quality Properties</em>'.
	 * @see it.disim.univaq.qml.FeatureModel#getQualityProperties()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_QualityProperties();

	/**
	 * Returns the meta object for the containment reference '{@link it.disim.univaq.qml.FeatureModel#getQualityrequirement <em>Qualityrequirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualityrequirement</em>'.
	 * @see it.disim.univaq.qml.FeatureModel#getQualityrequirement()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_Qualityrequirement();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.qml.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see it.disim.univaq.qml.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.qml.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.disim.univaq.qml.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.qml.Feature#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see it.disim.univaq.qml.Feature#isAbstract()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.qml.Feature#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see it.disim.univaq.qml.Feature#isHidden()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Hidden();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.qml.Feature#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see it.disim.univaq.qml.Feature#isMandatory()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Mandatory();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.qml.Feature#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see it.disim.univaq.qml.Feature#getChildren()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Children();

	/**
	 * Returns the meta object for the reference '{@link it.disim.univaq.qml.Feature#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group</em>'.
	 * @see it.disim.univaq.qml.Feature#getGroup()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.qml.Feature#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see it.disim.univaq.qml.Feature#getAttribute()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Attribute();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.qml.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see it.disim.univaq.qml.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the reference list '{@link it.disim.univaq.qml.Group#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature</em>'.
	 * @see it.disim.univaq.qml.Group#getFeature()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Feature();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.qml.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see it.disim.univaq.qml.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.qml.RequireConstraint <em>Require Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Require Constraint</em>'.
	 * @see it.disim.univaq.qml.RequireConstraint
	 * @generated
	 */
	EClass getRequireConstraint();

	/**
	 * Returns the meta object for the reference '{@link it.disim.univaq.qml.RequireConstraint#getRequiringFeature <em>Requiring Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requiring Feature</em>'.
	 * @see it.disim.univaq.qml.RequireConstraint#getRequiringFeature()
	 * @see #getRequireConstraint()
	 * @generated
	 */
	EReference getRequireConstraint_RequiringFeature();

	/**
	 * Returns the meta object for the reference list '{@link it.disim.univaq.qml.RequireConstraint#getRequiredFeature <em>Required Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Feature</em>'.
	 * @see it.disim.univaq.qml.RequireConstraint#getRequiredFeature()
	 * @see #getRequireConstraint()
	 * @generated
	 */
	EReference getRequireConstraint_RequiredFeature();

	/**
	 * Returns the meta object for the reference list '{@link it.disim.univaq.qml.RequireConstraint#getRequiredAttribute <em>Required Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Attribute</em>'.
	 * @see it.disim.univaq.qml.RequireConstraint#getRequiredAttribute()
	 * @see #getRequireConstraint()
	 * @generated
	 */
	EReference getRequireConstraint_RequiredAttribute();

	/**
	 * Returns the meta object for the reference list '{@link it.disim.univaq.qml.RequireConstraint#getRequiredAttributeValue <em>Required Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Attribute Value</em>'.
	 * @see it.disim.univaq.qml.RequireConstraint#getRequiredAttributeValue()
	 * @see #getRequireConstraint()
	 * @generated
	 */
	EReference getRequireConstraint_RequiredAttributeValue();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.qml.ExcludeConstraint <em>Exclude Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclude Constraint</em>'.
	 * @see it.disim.univaq.qml.ExcludeConstraint
	 * @generated
	 */
	EClass getExcludeConstraint();

	/**
	 * Returns the meta object for the reference '{@link it.disim.univaq.qml.ExcludeConstraint#getExcludingFeature <em>Excluding Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Excluding Feature</em>'.
	 * @see it.disim.univaq.qml.ExcludeConstraint#getExcludingFeature()
	 * @see #getExcludeConstraint()
	 * @generated
	 */
	EReference getExcludeConstraint_ExcludingFeature();

	/**
	 * Returns the meta object for the reference list '{@link it.disim.univaq.qml.ExcludeConstraint#getExcludedFeature <em>Excluded Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Excluded Feature</em>'.
	 * @see it.disim.univaq.qml.ExcludeConstraint#getExcludedFeature()
	 * @see #getExcludeConstraint()
	 * @generated
	 */
	EReference getExcludeConstraint_ExcludedFeature();

	/**
	 * Returns the meta object for the reference list '{@link it.disim.univaq.qml.ExcludeConstraint#getExcludedAttribute <em>Excluded Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Excluded Attribute</em>'.
	 * @see it.disim.univaq.qml.ExcludeConstraint#getExcludedAttribute()
	 * @see #getExcludeConstraint()
	 * @generated
	 */
	EReference getExcludeConstraint_ExcludedAttribute();

	/**
	 * Returns the meta object for the reference list '{@link it.disim.univaq.qml.ExcludeConstraint#getExcludedAttributeValue <em>Excluded Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Excluded Attribute Value</em>'.
	 * @see it.disim.univaq.qml.ExcludeConstraint#getExcludedAttributeValue()
	 * @see #getExcludeConstraint()
	 * @generated
	 */
	EReference getExcludeConstraint_ExcludedAttributeValue();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.qml.OpenValueAttribute <em>Open Value Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Value Attribute</em>'.
	 * @see it.disim.univaq.qml.OpenValueAttribute
	 * @generated
	 */
	EClass getOpenValueAttribute();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.qml.OpenValueAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see it.disim.univaq.qml.OpenValueAttribute#getType()
	 * @see #getOpenValueAttribute()
	 * @generated
	 */
	EAttribute getOpenValueAttribute_Type();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.qml.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see it.disim.univaq.qml.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.qml.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.disim.univaq.qml.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.qml.AttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value</em>'.
	 * @see it.disim.univaq.qml.AttributeValue
	 * @generated
	 */
	EClass getAttributeValue();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.qml.AttributeValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.disim.univaq.qml.AttributeValue#getValue()
	 * @see #getAttributeValue()
	 * @generated
	 */
	EAttribute getAttributeValue_Value();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.qml.PredictionCorrectness <em>Prediction Correctness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prediction Correctness</em>'.
	 * @see it.disim.univaq.qml.PredictionCorrectness
	 * @generated
	 */
	EClass getPredictionCorrectness();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.qml.Privacy <em>Privacy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Privacy</em>'.
	 * @see it.disim.univaq.qml.Privacy
	 * @generated
	 */
	EClass getPrivacy();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.qml.Privacy#getPrivacyLevel <em>Privacy Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Privacy Level</em>'.
	 * @see it.disim.univaq.qml.Privacy#getPrivacyLevel()
	 * @see #getPrivacy()
	 * @generated
	 */
	EAttribute getPrivacy_PrivacyLevel();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.qml.QualityRequirements <em>Quality Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Requirements</em>'.
	 * @see it.disim.univaq.qml.QualityRequirements
	 * @generated
	 */
	EClass getQualityRequirements();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.qml.QualityRequirements#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task</em>'.
	 * @see it.disim.univaq.qml.QualityRequirements#getTask()
	 * @see #getQualityRequirements()
	 * @generated
	 */
	EAttribute getQualityRequirements_Task();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.qml.QualityRequirements#getMadeOf <em>Made Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Made Of</em>'.
	 * @see it.disim.univaq.qml.QualityRequirements#getMadeOf()
	 * @see #getQualityRequirements()
	 * @generated
	 */
	EReference getQualityRequirements_MadeOf();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.qml.QualityRequirement <em>Quality Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Requirement</em>'.
	 * @see it.disim.univaq.qml.QualityRequirement
	 * @generated
	 */
	EClass getQualityRequirement();

	/**
	 * Returns the meta object for the reference '{@link it.disim.univaq.qml.QualityRequirement#getRelatedTo <em>Related To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related To</em>'.
	 * @see it.disim.univaq.qml.QualityRequirement#getRelatedTo()
	 * @see #getQualityRequirement()
	 * @generated
	 */
	EReference getQualityRequirement_RelatedTo();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.qml.QualityRequirement#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Threshold</em>'.
	 * @see it.disim.univaq.qml.QualityRequirement#getThreshold()
	 * @see #getQualityRequirement()
	 * @generated
	 */
	EReference getQualityRequirement_Threshold();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.qml.ComputationalComplexity <em>Computational Complexity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computational Complexity</em>'.
	 * @see it.disim.univaq.qml.ComputationalComplexity
	 * @generated
	 */
	EClass getComputationalComplexity();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.qml.OrGroup <em>Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Group</em>'.
	 * @see it.disim.univaq.qml.OrGroup
	 * @generated
	 */
	EClass getOrGroup();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.qml.AltGroup <em>Alt Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alt Group</em>'.
	 * @see it.disim.univaq.qml.AltGroup
	 * @generated
	 */
	EClass getAltGroup();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.qml.QualityProperty <em>Quality Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Property</em>'.
	 * @see it.disim.univaq.qml.QualityProperty
	 * @generated
	 */
	EClass getQualityProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.qml.QualityProperty#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure</em>'.
	 * @see it.disim.univaq.qml.QualityProperty#getMeasure()
	 * @see #getQualityProperty()
	 * @generated
	 */
	EReference getQualityProperty_Measure();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.qml.QualityProperty#getNature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nature</em>'.
	 * @see it.disim.univaq.qml.QualityProperty#getNature()
	 * @see #getQualityProperty()
	 * @generated
	 */
	EAttribute getQualityProperty_Nature();

	/**
	 * Returns the meta object for the reference list '{@link it.disim.univaq.qml.QualityProperty#getImplementedBy <em>Implemented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implemented By</em>'.
	 * @see it.disim.univaq.qml.QualityProperty#getImplementedBy()
	 * @see #getQualityProperty()
	 * @generated
	 */
	EReference getQualityProperty_ImplementedBy();

	/**
	 * Returns the meta object for the reference list '{@link it.disim.univaq.qml.QualityProperty#getInvolvedFeature <em>Involved Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Involved Feature</em>'.
	 * @see it.disim.univaq.qml.QualityProperty#getInvolvedFeature()
	 * @see #getQualityProperty()
	 * @generated
	 */
	EReference getQualityProperty_InvolvedFeature();

	/**
	 * Returns the meta object for the reference list '{@link it.disim.univaq.qml.QualityProperty#getInfluencedBy <em>Influenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Influenced By</em>'.
	 * @see it.disim.univaq.qml.QualityProperty#getInfluencedBy()
	 * @see #getQualityProperty()
	 * @generated
	 */
	EReference getQualityProperty_InfluencedBy();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.qml.Fairness <em>Fairness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fairness</em>'.
	 * @see it.disim.univaq.qml.Fairness
	 * @generated
	 */
	EClass getFairness();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.qml.Fairness#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see it.disim.univaq.qml.Fairness#getType()
	 * @see #getFairness()
	 * @generated
	 */
	EAttribute getFairness_Type();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.qml.Explainability <em>Explainability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Explainability</em>'.
	 * @see it.disim.univaq.qml.Explainability
	 * @generated
	 */
	EClass getExplainability();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.qml.Explainability#getExplainabilityLevel <em>Explainability Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explainability Level</em>'.
	 * @see it.disim.univaq.qml.Explainability#getExplainabilityLevel()
	 * @see #getExplainability()
	 * @generated
	 */
	EAttribute getExplainability_ExplainabilityLevel();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.qml.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see it.disim.univaq.qml.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for the reference '{@link it.disim.univaq.qml.Metric#getImplementedBy <em>Implemented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implemented By</em>'.
	 * @see it.disim.univaq.qml.Metric#getImplementedBy()
	 * @see #getMetric()
	 * @generated
	 */
	EReference getMetric_ImplementedBy();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.qml.Metric#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.disim.univaq.qml.Metric#getName()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Name();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.qml.Threshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threshold</em>'.
	 * @see it.disim.univaq.qml.Threshold
	 * @generated
	 */
	EClass getThreshold();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.qml.Threshold#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.disim.univaq.qml.Threshold#getValue()
	 * @see #getThreshold()
	 * @generated
	 */
	EAttribute getThreshold_Value();

	/**
	 * Returns the meta object for the reference '{@link it.disim.univaq.qml.Threshold#getRelatedTo <em>Related To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related To</em>'.
	 * @see it.disim.univaq.qml.Threshold#getRelatedTo()
	 * @see #getThreshold()
	 * @generated
	 */
	EReference getThreshold_RelatedTo();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.qml.Threshold#getEqualityOperator <em>Equality Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Equality Operator</em>'.
	 * @see it.disim.univaq.qml.Threshold#getEqualityOperator()
	 * @see #getThreshold()
	 * @generated
	 */
	EAttribute getThreshold_EqualityOperator();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.qml.SelectionValueAttribute <em>Selection Value Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Value Attribute</em>'.
	 * @see it.disim.univaq.qml.SelectionValueAttribute
	 * @generated
	 */
	EClass getSelectionValueAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.qml.SelectionValueAttribute#getAttributevalue <em>Attributevalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributevalue</em>'.
	 * @see it.disim.univaq.qml.SelectionValueAttribute#getAttributevalue()
	 * @see #getSelectionValueAttribute()
	 * @generated
	 */
	EReference getSelectionValueAttribute_Attributevalue();

	/**
	 * Returns the meta object for enum '{@link it.disim.univaq.qml.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Level</em>'.
	 * @see it.disim.univaq.qml.Level
	 * @generated
	 */
	EEnum getLevel();

	/**
	 * Returns the meta object for enum '{@link it.disim.univaq.qml.QualityNature <em>Quality Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quality Nature</em>'.
	 * @see it.disim.univaq.qml.QualityNature
	 * @generated
	 */
	EEnum getQualityNature();

	/**
	 * Returns the meta object for enum '{@link it.disim.univaq.qml.FairnessType <em>Fairness Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fairness Type</em>'.
	 * @see it.disim.univaq.qml.FairnessType
	 * @generated
	 */
	EEnum getFairnessType();

	/**
	 * Returns the meta object for enum '{@link it.disim.univaq.qml.BaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Base Type</em>'.
	 * @see it.disim.univaq.qml.BaseType
	 * @generated
	 */
	EEnum getBaseType();

	/**
	 * Returns the meta object for enum '{@link it.disim.univaq.qml.TaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task Type</em>'.
	 * @see it.disim.univaq.qml.TaskType
	 * @generated
	 */
	EEnum getTaskType();

	/**
	 * Returns the meta object for enum '{@link it.disim.univaq.qml.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see it.disim.univaq.qml.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QmlFactory getQmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.impl.FeatureModelImpl <em>Feature Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.impl.FeatureModelImpl
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getFeatureModel()
		 * @generated
		 */
		EClass FEATURE_MODEL = eINSTANCE.getFeatureModel();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__ROOT = eINSTANCE.getFeatureModel_Root();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__GROUPS = eINSTANCE.getFeatureModel_Groups();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__CONSTRAINT = eINSTANCE.getFeatureModel_Constraint();

		/**
		 * The meta object literal for the '<em><b>Quality Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__QUALITY_PROPERTIES = eINSTANCE.getFeatureModel_QualityProperties();

		/**
		 * The meta object literal for the '<em><b>Qualityrequirement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__QUALITYREQUIREMENT = eINSTANCE.getFeatureModel_Qualityrequirement();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.impl.FeatureImpl
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__ABSTRACT = eINSTANCE.getFeature_Abstract();

		/**
		 * The meta object literal for the '<em><b>Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__HIDDEN = eINSTANCE.getFeature_Hidden();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__MANDATORY = eINSTANCE.getFeature_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__CHILDREN = eINSTANCE.getFeature_Children();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__GROUP = eINSTANCE.getFeature_Group();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__ATTRIBUTE = eINSTANCE.getFeature_Attribute();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.impl.GroupImpl
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__FEATURE = eINSTANCE.getGroup_Feature();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.impl.ConstraintImpl
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.impl.RequireConstraintImpl <em>Require Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.impl.RequireConstraintImpl
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getRequireConstraint()
		 * @generated
		 */
		EClass REQUIRE_CONSTRAINT = eINSTANCE.getRequireConstraint();

		/**
		 * The meta object literal for the '<em><b>Requiring Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRE_CONSTRAINT__REQUIRING_FEATURE = eINSTANCE.getRequireConstraint_RequiringFeature();

		/**
		 * The meta object literal for the '<em><b>Required Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRE_CONSTRAINT__REQUIRED_FEATURE = eINSTANCE.getRequireConstraint_RequiredFeature();

		/**
		 * The meta object literal for the '<em><b>Required Attribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRE_CONSTRAINT__REQUIRED_ATTRIBUTE = eINSTANCE.getRequireConstraint_RequiredAttribute();

		/**
		 * The meta object literal for the '<em><b>Required Attribute Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRE_CONSTRAINT__REQUIRED_ATTRIBUTE_VALUE = eINSTANCE
				.getRequireConstraint_RequiredAttributeValue();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.impl.ExcludeConstraintImpl <em>Exclude Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.impl.ExcludeConstraintImpl
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getExcludeConstraint()
		 * @generated
		 */
		EClass EXCLUDE_CONSTRAINT = eINSTANCE.getExcludeConstraint();

		/**
		 * The meta object literal for the '<em><b>Excluding Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUDE_CONSTRAINT__EXCLUDING_FEATURE = eINSTANCE.getExcludeConstraint_ExcludingFeature();

		/**
		 * The meta object literal for the '<em><b>Excluded Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUDE_CONSTRAINT__EXCLUDED_FEATURE = eINSTANCE.getExcludeConstraint_ExcludedFeature();

		/**
		 * The meta object literal for the '<em><b>Excluded Attribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUDE_CONSTRAINT__EXCLUDED_ATTRIBUTE = eINSTANCE.getExcludeConstraint_ExcludedAttribute();

		/**
		 * The meta object literal for the '<em><b>Excluded Attribute Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUDE_CONSTRAINT__EXCLUDED_ATTRIBUTE_VALUE = eINSTANCE
				.getExcludeConstraint_ExcludedAttributeValue();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.impl.OpenValueAttributeImpl <em>Open Value Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.impl.OpenValueAttributeImpl
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getOpenValueAttribute()
		 * @generated
		 */
		EClass OPEN_VALUE_ATTRIBUTE = eINSTANCE.getOpenValueAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_VALUE_ATTRIBUTE__TYPE = eINSTANCE.getOpenValueAttribute_Type();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.impl.AttributeImpl
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.impl.AttributeValueImpl
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getAttributeValue()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE = eINSTANCE.getAttributeValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE__VALUE = eINSTANCE.getAttributeValue_Value();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.impl.PredictionCorrectnessImpl <em>Prediction Correctness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.impl.PredictionCorrectnessImpl
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getPredictionCorrectness()
		 * @generated
		 */
		EClass PREDICTION_CORRECTNESS = eINSTANCE.getPredictionCorrectness();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.impl.PrivacyImpl <em>Privacy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.impl.PrivacyImpl
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getPrivacy()
		 * @generated
		 */
		EClass PRIVACY = eINSTANCE.getPrivacy();

		/**
		 * The meta object literal for the '<em><b>Privacy Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVACY__PRIVACY_LEVEL = eINSTANCE.getPrivacy_PrivacyLevel();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.impl.QualityRequirementsImpl <em>Quality Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.impl.QualityRequirementsImpl
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getQualityRequirements()
		 * @generated
		 */
		EClass QUALITY_REQUIREMENTS = eINSTANCE.getQualityRequirements();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY_REQUIREMENTS__TASK = eINSTANCE.getQualityRequirements_Task();

		/**
		 * The meta object literal for the '<em><b>Made Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_REQUIREMENTS__MADE_OF = eINSTANCE.getQualityRequirements_MadeOf();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.impl.QualityRequirementImpl <em>Quality Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.impl.QualityRequirementImpl
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getQualityRequirement()
		 * @generated
		 */
		EClass QUALITY_REQUIREMENT = eINSTANCE.getQualityRequirement();

		/**
		 * The meta object literal for the '<em><b>Related To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_REQUIREMENT__RELATED_TO = eINSTANCE.getQualityRequirement_RelatedTo();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_REQUIREMENT__THRESHOLD = eINSTANCE.getQualityRequirement_Threshold();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.impl.ComputationalComplexityImpl <em>Computational Complexity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.impl.ComputationalComplexityImpl
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getComputationalComplexity()
		 * @generated
		 */
		EClass COMPUTATIONAL_COMPLEXITY = eINSTANCE.getComputationalComplexity();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.impl.OrGroupImpl <em>Or Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.impl.OrGroupImpl
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getOrGroup()
		 * @generated
		 */
		EClass OR_GROUP = eINSTANCE.getOrGroup();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.impl.AltGroupImpl <em>Alt Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.impl.AltGroupImpl
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getAltGroup()
		 * @generated
		 */
		EClass ALT_GROUP = eINSTANCE.getAltGroup();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.impl.QualityPropertyImpl <em>Quality Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.impl.QualityPropertyImpl
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getQualityProperty()
		 * @generated
		 */
		EClass QUALITY_PROPERTY = eINSTANCE.getQualityProperty();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_PROPERTY__MEASURE = eINSTANCE.getQualityProperty_Measure();

		/**
		 * The meta object literal for the '<em><b>Nature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY_PROPERTY__NATURE = eINSTANCE.getQualityProperty_Nature();

		/**
		 * The meta object literal for the '<em><b>Implemented By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_PROPERTY__IMPLEMENTED_BY = eINSTANCE.getQualityProperty_ImplementedBy();

		/**
		 * The meta object literal for the '<em><b>Involved Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_PROPERTY__INVOLVED_FEATURE = eINSTANCE.getQualityProperty_InvolvedFeature();

		/**
		 * The meta object literal for the '<em><b>Influenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_PROPERTY__INFLUENCED_BY = eINSTANCE.getQualityProperty_InfluencedBy();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.impl.FairnessImpl <em>Fairness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.impl.FairnessImpl
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getFairness()
		 * @generated
		 */
		EClass FAIRNESS = eINSTANCE.getFairness();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAIRNESS__TYPE = eINSTANCE.getFairness_Type();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.impl.ExplainabilityImpl <em>Explainability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.impl.ExplainabilityImpl
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getExplainability()
		 * @generated
		 */
		EClass EXPLAINABILITY = eINSTANCE.getExplainability();

		/**
		 * The meta object literal for the '<em><b>Explainability Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPLAINABILITY__EXPLAINABILITY_LEVEL = eINSTANCE.getExplainability_ExplainabilityLevel();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.impl.MetricImpl
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '<em><b>Implemented By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC__IMPLEMENTED_BY = eINSTANCE.getMetric_ImplementedBy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__NAME = eINSTANCE.getMetric_Name();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.impl.ThresholdImpl <em>Threshold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.impl.ThresholdImpl
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getThreshold()
		 * @generated
		 */
		EClass THRESHOLD = eINSTANCE.getThreshold();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THRESHOLD__VALUE = eINSTANCE.getThreshold_Value();

		/**
		 * The meta object literal for the '<em><b>Related To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THRESHOLD__RELATED_TO = eINSTANCE.getThreshold_RelatedTo();

		/**
		 * The meta object literal for the '<em><b>Equality Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THRESHOLD__EQUALITY_OPERATOR = eINSTANCE.getThreshold_EqualityOperator();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.impl.SelectionValueAttributeImpl <em>Selection Value Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.impl.SelectionValueAttributeImpl
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getSelectionValueAttribute()
		 * @generated
		 */
		EClass SELECTION_VALUE_ATTRIBUTE = eINSTANCE.getSelectionValueAttribute();

		/**
		 * The meta object literal for the '<em><b>Attributevalue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION_VALUE_ATTRIBUTE__ATTRIBUTEVALUE = eINSTANCE.getSelectionValueAttribute_Attributevalue();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.Level <em>Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.Level
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getLevel()
		 * @generated
		 */
		EEnum LEVEL = eINSTANCE.getLevel();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.QualityNature <em>Quality Nature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.QualityNature
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getQualityNature()
		 * @generated
		 */
		EEnum QUALITY_NATURE = eINSTANCE.getQualityNature();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.FairnessType <em>Fairness Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.FairnessType
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getFairnessType()
		 * @generated
		 */
		EEnum FAIRNESS_TYPE = eINSTANCE.getFairnessType();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.BaseType <em>Base Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.BaseType
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getBaseType()
		 * @generated
		 */
		EEnum BASE_TYPE = eINSTANCE.getBaseType();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.TaskType <em>Task Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.TaskType
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getTaskType()
		 * @generated
		 */
		EEnum TASK_TYPE = eINSTANCE.getTaskType();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.qml.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.qml.Operator
		 * @see it.disim.univaq.qml.impl.QmlPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

	}

} //QmlPackage
