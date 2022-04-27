/**
 */
package it.disim.univaq.qml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Value Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.OpenValueAttribute#getName <em>Name</em>}</li>
 *   <li>{@link it.disim.univaq.qml.OpenValueAttribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.qml.QmlPackage#getOpenValueAttribute()
 * @model
 * @generated
 */
public interface OpenValueAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.disim.univaq.qml.QmlPackage#getOpenValueAttribute_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.disim.univaq.qml.OpenValueAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.disim.univaq.qml.BaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see it.disim.univaq.qml.BaseType
	 * @see #setType(BaseType)
	 * @see it.disim.univaq.qml.QmlPackage#getOpenValueAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	BaseType getType();

	/**
	 * Sets the value of the '{@link it.disim.univaq.qml.OpenValueAttribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see it.disim.univaq.qml.BaseType
	 * @see #getType()
	 * @generated
	 */
	void setType(BaseType value);

} // OpenValueAttribute
