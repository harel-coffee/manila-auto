/**
 */
package it.disim.univaq.qml.impl;

import it.disim.univaq.qml.AttributeValue;
import it.disim.univaq.qml.QmlPackage;
import it.disim.univaq.qml.SelectionValueAttribute;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection Value Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.impl.SelectionValueAttributeImpl#getAttributevalue <em>Attributevalue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectionValueAttributeImpl extends AttributeImpl implements SelectionValueAttribute {
	/**
	 * The cached value of the '{@link #getAttributevalue() <em>Attributevalue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributevalue()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeValue> attributevalue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionValueAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmlPackage.Literals.SELECTION_VALUE_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttributeValue> getAttributevalue() {
		if (attributevalue == null) {
			attributevalue = new EObjectContainmentEList<AttributeValue>(AttributeValue.class, this,
					QmlPackage.SELECTION_VALUE_ATTRIBUTE__ATTRIBUTEVALUE);
		}
		return attributevalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QmlPackage.SELECTION_VALUE_ATTRIBUTE__ATTRIBUTEVALUE:
			return ((InternalEList<?>) getAttributevalue()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QmlPackage.SELECTION_VALUE_ATTRIBUTE__ATTRIBUTEVALUE:
			return getAttributevalue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case QmlPackage.SELECTION_VALUE_ATTRIBUTE__ATTRIBUTEVALUE:
			getAttributevalue().clear();
			getAttributevalue().addAll((Collection<? extends AttributeValue>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case QmlPackage.SELECTION_VALUE_ATTRIBUTE__ATTRIBUTEVALUE:
			getAttributevalue().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case QmlPackage.SELECTION_VALUE_ATTRIBUTE__ATTRIBUTEVALUE:
			return attributevalue != null && !attributevalue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SelectionValueAttributeImpl
