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
 *   <li>{@link it.disim.univaq.qml.QualityRequirement#getQualityproperty <em>Qualityproperty</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.qml.QmlPackage#getQualityRequirement()
 * @model
 * @generated
 */
public interface QualityRequirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualityproperty</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.univaq.qml.QualityProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualityproperty</em>' containment reference list.
	 * @see it.disim.univaq.qml.QmlPackage#getQualityRequirement_Qualityproperty()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<QualityProperty> getQualityproperty();

} // QualityRequirement
