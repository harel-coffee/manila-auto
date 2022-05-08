/**
 */
package it.disim.univaq.qml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.QualityRequirement#getRelatedTo <em>Related To</em>}</li>
 *   <li>{@link it.disim.univaq.qml.QualityRequirement#getThreshold <em>Threshold</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.qml.QmlPackage#getQualityRequirement()
 * @model
 * @generated
 */
public interface QualityRequirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Related To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related To</em>' reference.
	 * @see #setRelatedTo(QualityProperty)
	 * @see it.disim.univaq.qml.QmlPackage#getQualityRequirement_RelatedTo()
	 * @model required="true"
	 * @generated
	 */
	QualityProperty getRelatedTo();

	/**
	 * Sets the value of the '{@link it.disim.univaq.qml.QualityRequirement#getRelatedTo <em>Related To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related To</em>' reference.
	 * @see #getRelatedTo()
	 * @generated
	 */
	void setRelatedTo(QualityProperty value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.univaq.qml.Threshold}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' containment reference list.
	 * @see it.disim.univaq.qml.QmlPackage#getQualityRequirement_Threshold()
	 * @model containment="true"
	 * @generated
	 */
	EList<Threshold> getThreshold();

} // QualityRequirement
