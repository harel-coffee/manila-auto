/**
 */
package it.disim.univaq.qml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclude Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.ExcludeConstraint#getFeature <em>Feature</em>}</li>
 *   <li>{@link it.disim.univaq.qml.ExcludeConstraint#getExcludedFeature <em>Excluded Feature</em>}</li>
 *   <li>{@link it.disim.univaq.qml.ExcludeConstraint#getExcludedAttribute <em>Excluded Attribute</em>}</li>
 *   <li>{@link it.disim.univaq.qml.ExcludeConstraint#getExcludedAttributeValue <em>Excluded Attribute Value</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.qml.QmlPackage#getExcludeConstraint()
 * @model
 * @generated
 */
public interface ExcludeConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Feature)
	 * @see it.disim.univaq.qml.QmlPackage#getExcludeConstraint_Feature()
	 * @model required="true"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link it.disim.univaq.qml.ExcludeConstraint#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Excluded Feature</b></em>' reference list.
	 * The list contents are of type {@link it.disim.univaq.qml.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excluded Feature</em>' reference list.
	 * @see it.disim.univaq.qml.QmlPackage#getExcludeConstraint_ExcludedFeature()
	 * @model
	 * @generated
	 */
	EList<Feature> getExcludedFeature();

	/**
	 * Returns the value of the '<em><b>Excluded Attribute</b></em>' reference list.
	 * The list contents are of type {@link it.disim.univaq.qml.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excluded Attribute</em>' reference list.
	 * @see it.disim.univaq.qml.QmlPackage#getExcludeConstraint_ExcludedAttribute()
	 * @model
	 * @generated
	 */
	EList<Attribute> getExcludedAttribute();

	/**
	 * Returns the value of the '<em><b>Excluded Attribute Value</b></em>' reference list.
	 * The list contents are of type {@link it.disim.univaq.qml.AttributeValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excluded Attribute Value</em>' reference list.
	 * @see it.disim.univaq.qml.QmlPackage#getExcludeConstraint_ExcludedAttributeValue()
	 * @model
	 * @generated
	 */
	EList<AttributeValue> getExcludedAttributeValue();

} // ExcludeConstraint
