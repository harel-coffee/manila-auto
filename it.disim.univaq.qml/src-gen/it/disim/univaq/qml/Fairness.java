/**
 */
package it.disim.univaq.qml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fairness</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.Fairness#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.qml.QmlPackage#getFairness()
 * @model
 * @generated
 */
public interface Fairness extends QualityProperty {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.disim.univaq.qml.FairnessType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see it.disim.univaq.qml.FairnessType
	 * @see #setType(FairnessType)
	 * @see it.disim.univaq.qml.QmlPackage#getFairness_Type()
	 * @model
	 * @generated
	 */
	FairnessType getType();

	/**
	 * Sets the value of the '{@link it.disim.univaq.qml.Fairness#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see it.disim.univaq.qml.FairnessType
	 * @see #getType()
	 * @generated
	 */
	void setType(FairnessType value);

} // Fairness
