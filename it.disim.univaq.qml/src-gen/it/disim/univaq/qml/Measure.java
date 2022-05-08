/**
 */
package it.disim.univaq.qml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.Measure#getImplementedBy <em>Implemented By</em>}</li>
 *   <li>{@link it.disim.univaq.qml.Measure#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.qml.QmlPackage#getMeasure()
 * @model
 * @generated
 */
public interface Measure extends EObject {
	/**
	 * Returns the value of the '<em><b>Implemented By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implemented By</em>' reference.
	 * @see #setImplementedBy(Feature)
	 * @see it.disim.univaq.qml.QmlPackage#getMeasure_ImplementedBy()
	 * @model required="true"
	 * @generated
	 */
	Feature getImplementedBy();

	/**
	 * Sets the value of the '{@link it.disim.univaq.qml.Measure#getImplementedBy <em>Implemented By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implemented By</em>' reference.
	 * @see #getImplementedBy()
	 * @generated
	 */
	void setImplementedBy(Feature value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.disim.univaq.qml.QmlPackage#getMeasure_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.disim.univaq.qml.Measure#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Measure
