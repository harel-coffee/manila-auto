/**
 */
package it.disim.univaq.qml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Require Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.RequireConstraint#getRequiringFeature <em>Requiring Feature</em>}</li>
 *   <li>{@link it.disim.univaq.qml.RequireConstraint#getRequiredFeature <em>Required Feature</em>}</li>
 *   <li>{@link it.disim.univaq.qml.RequireConstraint#getRequiredAttribute <em>Required Attribute</em>}</li>
 *   <li>{@link it.disim.univaq.qml.RequireConstraint#getRequiredAttributeValue <em>Required Attribute Value</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.qml.QmlPackage#getRequireConstraint()
 * @model
 * @generated
 */
public interface RequireConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Requiring Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requiring Feature</em>' reference.
	 * @see #setRequiringFeature(Feature)
	 * @see it.disim.univaq.qml.QmlPackage#getRequireConstraint_RequiringFeature()
	 * @model required="true"
	 * @generated
	 */
	Feature getRequiringFeature();

	/**
	 * Sets the value of the '{@link it.disim.univaq.qml.RequireConstraint#getRequiringFeature <em>Requiring Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requiring Feature</em>' reference.
	 * @see #getRequiringFeature()
	 * @generated
	 */
	void setRequiringFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Required Feature</b></em>' reference list.
	 * The list contents are of type {@link it.disim.univaq.qml.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Feature</em>' reference list.
	 * @see it.disim.univaq.qml.QmlPackage#getRequireConstraint_RequiredFeature()
	 * @model
	 * @generated
	 */
	EList<Feature> getRequiredFeature();

	/**
	 * Returns the value of the '<em><b>Required Attribute</b></em>' reference list.
	 * The list contents are of type {@link it.disim.univaq.qml.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Attribute</em>' reference list.
	 * @see it.disim.univaq.qml.QmlPackage#getRequireConstraint_RequiredAttribute()
	 * @model
	 * @generated
	 */
	EList<Attribute> getRequiredAttribute();

	/**
	 * Returns the value of the '<em><b>Required Attribute Value</b></em>' reference list.
	 * The list contents are of type {@link it.disim.univaq.qml.AttributeValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Attribute Value</em>' reference list.
	 * @see it.disim.univaq.qml.QmlPackage#getRequireConstraint_RequiredAttributeValue()
	 * @model
	 * @generated
	 */
	EList<AttributeValue> getRequiredAttributeValue();

} // RequireConstraint
