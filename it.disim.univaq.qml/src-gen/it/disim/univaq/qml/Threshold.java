/**
 */
package it.disim.univaq.qml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threshold</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.Threshold#getValue <em>Value</em>}</li>
 *   <li>{@link it.disim.univaq.qml.Threshold#getRelatedTo <em>Related To</em>}</li>
 *   <li>{@link it.disim.univaq.qml.Threshold#getEqualityOperator <em>Equality Operator</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.qml.QmlPackage#getThreshold()
 * @model
 * @generated
 */
public interface Threshold extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see it.disim.univaq.qml.QmlPackage#getThreshold_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Float"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link it.disim.univaq.qml.Threshold#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Related To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related To</em>' reference.
	 * @see #setRelatedTo(Metric)
	 * @see it.disim.univaq.qml.QmlPackage#getThreshold_RelatedTo()
	 * @model required="true"
	 * @generated
	 */
	Metric getRelatedTo();

	/**
	 * Sets the value of the '{@link it.disim.univaq.qml.Threshold#getRelatedTo <em>Related To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related To</em>' reference.
	 * @see #getRelatedTo()
	 * @generated
	 */
	void setRelatedTo(Metric value);

	/**
	 * Returns the value of the '<em><b>Equality Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link it.disim.univaq.qml.Operator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equality Operator</em>' attribute.
	 * @see it.disim.univaq.qml.Operator
	 * @see #setEqualityOperator(Operator)
	 * @see it.disim.univaq.qml.QmlPackage#getThreshold_EqualityOperator()
	 * @model
	 * @generated
	 */
	Operator getEqualityOperator();

	/**
	 * Sets the value of the '{@link it.disim.univaq.qml.Threshold#getEqualityOperator <em>Equality Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equality Operator</em>' attribute.
	 * @see it.disim.univaq.qml.Operator
	 * @see #getEqualityOperator()
	 * @generated
	 */
	void setEqualityOperator(Operator value);

} // Threshold
