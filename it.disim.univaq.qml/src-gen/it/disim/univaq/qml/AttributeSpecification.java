/**
 */
package it.disim.univaq.qml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.AttributeSpecification#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link it.disim.univaq.qml.AttributeSpecification#getAttributevalue <em>Attributevalue</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.qml.QmlPackage#getAttributeSpecification()
 * @model
 * @generated
 */
public interface AttributeSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see it.disim.univaq.qml.QmlPackage#getAttributeSpecification_Attribute()
	 * @model required="true"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link it.disim.univaq.qml.AttributeSpecification#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Attributevalue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributevalue</em>' reference.
	 * @see #setAttributevalue(AttributeValue)
	 * @see it.disim.univaq.qml.QmlPackage#getAttributeSpecification_Attributevalue()
	 * @model required="true"
	 * @generated
	 */
	AttributeValue getAttributevalue();

	/**
	 * Sets the value of the '{@link it.disim.univaq.qml.AttributeSpecification#getAttributevalue <em>Attributevalue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributevalue</em>' reference.
	 * @see #getAttributevalue()
	 * @generated
	 */
	void setAttributevalue(AttributeValue value);

} // AttributeSpecification
