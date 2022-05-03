/**
 */
package it.disim.univaq.qml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.QualityProperty#getMeasure <em>Measure</em>}</li>
 *   <li>{@link it.disim.univaq.qml.QualityProperty#getNature <em>Nature</em>}</li>
 *   <li>{@link it.disim.univaq.qml.QualityProperty#getImplementedBy <em>Implemented By</em>}</li>
 *   <li>{@link it.disim.univaq.qml.QualityProperty#getInvolvedFeature <em>Involved Feature</em>}</li>
 *   <li>{@link it.disim.univaq.qml.QualityProperty#getInfluencedBy <em>Influenced By</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.qml.QmlPackage#getQualityProperty()
 * @model abstract="true"
 * @generated
 */
public interface QualityProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Measure</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.univaq.qml.Measure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' containment reference list.
	 * @see it.disim.univaq.qml.QmlPackage#getQualityProperty_Measure()
	 * @model containment="true"
	 * @generated
	 */
	EList<Measure> getMeasure();

	/**
	 * Returns the value of the '<em><b>Nature</b></em>' attribute.
	 * The literals are from the enumeration {@link it.disim.univaq.qml.QualityNature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature</em>' attribute.
	 * @see it.disim.univaq.qml.QualityNature
	 * @see #setNature(QualityNature)
	 * @see it.disim.univaq.qml.QmlPackage#getQualityProperty_Nature()
	 * @model
	 * @generated
	 */
	QualityNature getNature();

	/**
	 * Sets the value of the '{@link it.disim.univaq.qml.QualityProperty#getNature <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature</em>' attribute.
	 * @see it.disim.univaq.qml.QualityNature
	 * @see #getNature()
	 * @generated
	 */
	void setNature(QualityNature value);

	/**
	 * Returns the value of the '<em><b>Implemented By</b></em>' reference list.
	 * The list contents are of type {@link it.disim.univaq.qml.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implemented By</em>' reference list.
	 * @see it.disim.univaq.qml.QmlPackage#getQualityProperty_ImplementedBy()
	 * @model
	 * @generated
	 */
	EList<Feature> getImplementedBy();

	/**
	 * Returns the value of the '<em><b>Involved Feature</b></em>' reference list.
	 * The list contents are of type {@link it.disim.univaq.qml.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved Feature</em>' reference list.
	 * @see it.disim.univaq.qml.QmlPackage#getQualityProperty_InvolvedFeature()
	 * @model
	 * @generated
	 */
	EList<Feature> getInvolvedFeature();

	/**
	 * Returns the value of the '<em><b>Influenced By</b></em>' reference list.
	 * The list contents are of type {@link it.disim.univaq.qml.QualityProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Influenced By</em>' reference list.
	 * @see it.disim.univaq.qml.QmlPackage#getQualityProperty_InfluencedBy()
	 * @model
	 * @generated
	 */
	EList<QualityProperty> getInfluencedBy();

} // QualityProperty
