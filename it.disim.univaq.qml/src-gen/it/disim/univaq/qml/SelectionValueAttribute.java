/**
 */
package it.disim.univaq.qml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Value Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.SelectionValueAttribute#getName <em>Name</em>}</li>
 *   <li>{@link it.disim.univaq.qml.SelectionValueAttribute#getAttributevalue <em>Attributevalue</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.qml.QmlPackage#getSelectionValueAttribute()
 * @model
 * @generated
 */
public interface SelectionValueAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.disim.univaq.qml.QmlPackage#getSelectionValueAttribute_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.disim.univaq.qml.SelectionValueAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attributevalue</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.univaq.qml.AttributeValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributevalue</em>' containment reference list.
	 * @see it.disim.univaq.qml.QmlPackage#getSelectionValueAttribute_Attributevalue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AttributeValue> getAttributevalue();

} // SelectionValueAttribute
