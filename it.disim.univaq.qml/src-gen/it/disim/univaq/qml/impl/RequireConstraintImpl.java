/**
 */
package it.disim.univaq.qml.impl;

import it.disim.univaq.qml.Attribute;
import it.disim.univaq.qml.AttributeValue;
import it.disim.univaq.qml.Feature;
import it.disim.univaq.qml.QmlPackage;
import it.disim.univaq.qml.RequireConstraint;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Require Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.impl.RequireConstraintImpl#getRequiringFeature <em>Requiring Feature</em>}</li>
 *   <li>{@link it.disim.univaq.qml.impl.RequireConstraintImpl#getRequiredFeature <em>Required Feature</em>}</li>
 *   <li>{@link it.disim.univaq.qml.impl.RequireConstraintImpl#getRequiredAttribute <em>Required Attribute</em>}</li>
 *   <li>{@link it.disim.univaq.qml.impl.RequireConstraintImpl#getRequiredAttributeValue <em>Required Attribute Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequireConstraintImpl extends ConstraintImpl implements RequireConstraint {
	/**
	 * The cached value of the '{@link #getRequiringFeature() <em>Requiring Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiringFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature requiringFeature;

	/**
	 * The cached value of the '{@link #getRequiredFeature() <em>Required Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> requiredFeature;

	/**
	 * The cached value of the '{@link #getRequiredAttribute() <em>Required Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> requiredAttribute;

	/**
	 * The cached value of the '{@link #getRequiredAttributeValue() <em>Required Attribute Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredAttributeValue()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeValue> requiredAttributeValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequireConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmlPackage.Literals.REQUIRE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getRequiringFeature() {
		if (requiringFeature != null && requiringFeature.eIsProxy()) {
			InternalEObject oldRequiringFeature = (InternalEObject) requiringFeature;
			requiringFeature = (Feature) eResolveProxy(oldRequiringFeature);
			if (requiringFeature != oldRequiringFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							QmlPackage.REQUIRE_CONSTRAINT__REQUIRING_FEATURE, oldRequiringFeature, requiringFeature));
			}
		}
		return requiringFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetRequiringFeature() {
		return requiringFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiringFeature(Feature newRequiringFeature) {
		Feature oldRequiringFeature = requiringFeature;
		requiringFeature = newRequiringFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmlPackage.REQUIRE_CONSTRAINT__REQUIRING_FEATURE,
					oldRequiringFeature, requiringFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getRequiredFeature() {
		if (requiredFeature == null) {
			requiredFeature = new EObjectResolvingEList<Feature>(Feature.class, this,
					QmlPackage.REQUIRE_CONSTRAINT__REQUIRED_FEATURE);
		}
		return requiredFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getRequiredAttribute() {
		if (requiredAttribute == null) {
			requiredAttribute = new EObjectResolvingEList<Attribute>(Attribute.class, this,
					QmlPackage.REQUIRE_CONSTRAINT__REQUIRED_ATTRIBUTE);
		}
		return requiredAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttributeValue> getRequiredAttributeValue() {
		if (requiredAttributeValue == null) {
			requiredAttributeValue = new EObjectResolvingEList<AttributeValue>(AttributeValue.class, this,
					QmlPackage.REQUIRE_CONSTRAINT__REQUIRED_ATTRIBUTE_VALUE);
		}
		return requiredAttributeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QmlPackage.REQUIRE_CONSTRAINT__REQUIRING_FEATURE:
			if (resolve)
				return getRequiringFeature();
			return basicGetRequiringFeature();
		case QmlPackage.REQUIRE_CONSTRAINT__REQUIRED_FEATURE:
			return getRequiredFeature();
		case QmlPackage.REQUIRE_CONSTRAINT__REQUIRED_ATTRIBUTE:
			return getRequiredAttribute();
		case QmlPackage.REQUIRE_CONSTRAINT__REQUIRED_ATTRIBUTE_VALUE:
			return getRequiredAttributeValue();
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
		case QmlPackage.REQUIRE_CONSTRAINT__REQUIRING_FEATURE:
			setRequiringFeature((Feature) newValue);
			return;
		case QmlPackage.REQUIRE_CONSTRAINT__REQUIRED_FEATURE:
			getRequiredFeature().clear();
			getRequiredFeature().addAll((Collection<? extends Feature>) newValue);
			return;
		case QmlPackage.REQUIRE_CONSTRAINT__REQUIRED_ATTRIBUTE:
			getRequiredAttribute().clear();
			getRequiredAttribute().addAll((Collection<? extends Attribute>) newValue);
			return;
		case QmlPackage.REQUIRE_CONSTRAINT__REQUIRED_ATTRIBUTE_VALUE:
			getRequiredAttributeValue().clear();
			getRequiredAttributeValue().addAll((Collection<? extends AttributeValue>) newValue);
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
		case QmlPackage.REQUIRE_CONSTRAINT__REQUIRING_FEATURE:
			setRequiringFeature((Feature) null);
			return;
		case QmlPackage.REQUIRE_CONSTRAINT__REQUIRED_FEATURE:
			getRequiredFeature().clear();
			return;
		case QmlPackage.REQUIRE_CONSTRAINT__REQUIRED_ATTRIBUTE:
			getRequiredAttribute().clear();
			return;
		case QmlPackage.REQUIRE_CONSTRAINT__REQUIRED_ATTRIBUTE_VALUE:
			getRequiredAttributeValue().clear();
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
		case QmlPackage.REQUIRE_CONSTRAINT__REQUIRING_FEATURE:
			return requiringFeature != null;
		case QmlPackage.REQUIRE_CONSTRAINT__REQUIRED_FEATURE:
			return requiredFeature != null && !requiredFeature.isEmpty();
		case QmlPackage.REQUIRE_CONSTRAINT__REQUIRED_ATTRIBUTE:
			return requiredAttribute != null && !requiredAttribute.isEmpty();
		case QmlPackage.REQUIRE_CONSTRAINT__REQUIRED_ATTRIBUTE_VALUE:
			return requiredAttributeValue != null && !requiredAttributeValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequireConstraintImpl
