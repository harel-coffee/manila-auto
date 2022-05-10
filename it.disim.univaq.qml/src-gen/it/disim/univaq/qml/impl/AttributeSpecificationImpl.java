/**
 */
package it.disim.univaq.qml.impl;

import it.disim.univaq.qml.Attribute;
import it.disim.univaq.qml.AttributeSpecification;
import it.disim.univaq.qml.AttributeValue;
import it.disim.univaq.qml.QmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.impl.AttributeSpecificationImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link it.disim.univaq.qml.impl.AttributeSpecificationImpl#getAttributevalue <em>Attributevalue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeSpecificationImpl extends MinimalEObjectImpl.Container implements AttributeSpecification {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute attribute;

	/**
	 * The cached value of the '{@link #getAttributevalue() <em>Attributevalue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributevalue()
	 * @generated
	 * @ordered
	 */
	protected AttributeValue attributevalue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmlPackage.Literals.ATTRIBUTE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject) attribute;
			attribute = (Attribute) eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							QmlPackage.ATTRIBUTE_SPECIFICATION__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttribute(Attribute newAttribute) {
		Attribute oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmlPackage.ATTRIBUTE_SPECIFICATION__ATTRIBUTE,
					oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeValue getAttributevalue() {
		if (attributevalue != null && attributevalue.eIsProxy()) {
			InternalEObject oldAttributevalue = (InternalEObject) attributevalue;
			attributevalue = (AttributeValue) eResolveProxy(oldAttributevalue);
			if (attributevalue != oldAttributevalue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							QmlPackage.ATTRIBUTE_SPECIFICATION__ATTRIBUTEVALUE, oldAttributevalue, attributevalue));
			}
		}
		return attributevalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValue basicGetAttributevalue() {
		return attributevalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributevalue(AttributeValue newAttributevalue) {
		AttributeValue oldAttributevalue = attributevalue;
		attributevalue = newAttributevalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmlPackage.ATTRIBUTE_SPECIFICATION__ATTRIBUTEVALUE,
					oldAttributevalue, attributevalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QmlPackage.ATTRIBUTE_SPECIFICATION__ATTRIBUTE:
			if (resolve)
				return getAttribute();
			return basicGetAttribute();
		case QmlPackage.ATTRIBUTE_SPECIFICATION__ATTRIBUTEVALUE:
			if (resolve)
				return getAttributevalue();
			return basicGetAttributevalue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case QmlPackage.ATTRIBUTE_SPECIFICATION__ATTRIBUTE:
			setAttribute((Attribute) newValue);
			return;
		case QmlPackage.ATTRIBUTE_SPECIFICATION__ATTRIBUTEVALUE:
			setAttributevalue((AttributeValue) newValue);
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
		case QmlPackage.ATTRIBUTE_SPECIFICATION__ATTRIBUTE:
			setAttribute((Attribute) null);
			return;
		case QmlPackage.ATTRIBUTE_SPECIFICATION__ATTRIBUTEVALUE:
			setAttributevalue((AttributeValue) null);
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
		case QmlPackage.ATTRIBUTE_SPECIFICATION__ATTRIBUTE:
			return attribute != null;
		case QmlPackage.ATTRIBUTE_SPECIFICATION__ATTRIBUTEVALUE:
			return attributevalue != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeSpecificationImpl
