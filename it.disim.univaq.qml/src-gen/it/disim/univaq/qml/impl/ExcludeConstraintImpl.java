/**
 */
package it.disim.univaq.qml.impl;

import it.disim.univaq.qml.Attribute;
import it.disim.univaq.qml.AttributeValue;
import it.disim.univaq.qml.ExcludeConstraint;
import it.disim.univaq.qml.Feature;
import it.disim.univaq.qml.QmlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exclude Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.impl.ExcludeConstraintImpl#getExcludingFeature <em>Excluding Feature</em>}</li>
 *   <li>{@link it.disim.univaq.qml.impl.ExcludeConstraintImpl#getExcludedFeature <em>Excluded Feature</em>}</li>
 *   <li>{@link it.disim.univaq.qml.impl.ExcludeConstraintImpl#getExcludedAttribute <em>Excluded Attribute</em>}</li>
 *   <li>{@link it.disim.univaq.qml.impl.ExcludeConstraintImpl#getExcludedAttributeValue <em>Excluded Attribute Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcludeConstraintImpl extends ConstraintImpl implements ExcludeConstraint {
	/**
	 * The cached value of the '{@link #getExcludingFeature() <em>Excluding Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludingFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature excludingFeature;

	/**
	 * The cached value of the '{@link #getExcludedFeature() <em>Excluded Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludedFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> excludedFeature;

	/**
	 * The cached value of the '{@link #getExcludedAttribute() <em>Excluded Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludedAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> excludedAttribute;

	/**
	 * The cached value of the '{@link #getExcludedAttributeValue() <em>Excluded Attribute Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludedAttributeValue()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeValue> excludedAttributeValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExcludeConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmlPackage.Literals.EXCLUDE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getExcludingFeature() {
		if (excludingFeature != null && excludingFeature.eIsProxy()) {
			InternalEObject oldExcludingFeature = (InternalEObject) excludingFeature;
			excludingFeature = (Feature) eResolveProxy(oldExcludingFeature);
			if (excludingFeature != oldExcludingFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							QmlPackage.EXCLUDE_CONSTRAINT__EXCLUDING_FEATURE, oldExcludingFeature, excludingFeature));
			}
		}
		return excludingFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetExcludingFeature() {
		return excludingFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExcludingFeature(Feature newExcludingFeature) {
		Feature oldExcludingFeature = excludingFeature;
		excludingFeature = newExcludingFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmlPackage.EXCLUDE_CONSTRAINT__EXCLUDING_FEATURE,
					oldExcludingFeature, excludingFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getExcludedFeature() {
		if (excludedFeature == null) {
			excludedFeature = new EObjectResolvingEList<Feature>(Feature.class, this,
					QmlPackage.EXCLUDE_CONSTRAINT__EXCLUDED_FEATURE);
		}
		return excludedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getExcludedAttribute() {
		if (excludedAttribute == null) {
			excludedAttribute = new EObjectResolvingEList<Attribute>(Attribute.class, this,
					QmlPackage.EXCLUDE_CONSTRAINT__EXCLUDED_ATTRIBUTE);
		}
		return excludedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttributeValue> getExcludedAttributeValue() {
		if (excludedAttributeValue == null) {
			excludedAttributeValue = new EObjectResolvingEList<AttributeValue>(AttributeValue.class, this,
					QmlPackage.EXCLUDE_CONSTRAINT__EXCLUDED_ATTRIBUTE_VALUE);
		}
		return excludedAttributeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QmlPackage.EXCLUDE_CONSTRAINT__EXCLUDING_FEATURE:
			if (resolve)
				return getExcludingFeature();
			return basicGetExcludingFeature();
		case QmlPackage.EXCLUDE_CONSTRAINT__EXCLUDED_FEATURE:
			return getExcludedFeature();
		case QmlPackage.EXCLUDE_CONSTRAINT__EXCLUDED_ATTRIBUTE:
			return getExcludedAttribute();
		case QmlPackage.EXCLUDE_CONSTRAINT__EXCLUDED_ATTRIBUTE_VALUE:
			return getExcludedAttributeValue();
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
		case QmlPackage.EXCLUDE_CONSTRAINT__EXCLUDING_FEATURE:
			setExcludingFeature((Feature) newValue);
			return;
		case QmlPackage.EXCLUDE_CONSTRAINT__EXCLUDED_FEATURE:
			getExcludedFeature().clear();
			getExcludedFeature().addAll((Collection<? extends Feature>) newValue);
			return;
		case QmlPackage.EXCLUDE_CONSTRAINT__EXCLUDED_ATTRIBUTE:
			getExcludedAttribute().clear();
			getExcludedAttribute().addAll((Collection<? extends Attribute>) newValue);
			return;
		case QmlPackage.EXCLUDE_CONSTRAINT__EXCLUDED_ATTRIBUTE_VALUE:
			getExcludedAttributeValue().clear();
			getExcludedAttributeValue().addAll((Collection<? extends AttributeValue>) newValue);
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
		case QmlPackage.EXCLUDE_CONSTRAINT__EXCLUDING_FEATURE:
			setExcludingFeature((Feature) null);
			return;
		case QmlPackage.EXCLUDE_CONSTRAINT__EXCLUDED_FEATURE:
			getExcludedFeature().clear();
			return;
		case QmlPackage.EXCLUDE_CONSTRAINT__EXCLUDED_ATTRIBUTE:
			getExcludedAttribute().clear();
			return;
		case QmlPackage.EXCLUDE_CONSTRAINT__EXCLUDED_ATTRIBUTE_VALUE:
			getExcludedAttributeValue().clear();
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
		case QmlPackage.EXCLUDE_CONSTRAINT__EXCLUDING_FEATURE:
			return excludingFeature != null;
		case QmlPackage.EXCLUDE_CONSTRAINT__EXCLUDED_FEATURE:
			return excludedFeature != null && !excludedFeature.isEmpty();
		case QmlPackage.EXCLUDE_CONSTRAINT__EXCLUDED_ATTRIBUTE:
			return excludedAttribute != null && !excludedAttribute.isEmpty();
		case QmlPackage.EXCLUDE_CONSTRAINT__EXCLUDED_ATTRIBUTE_VALUE:
			return excludedAttributeValue != null && !excludedAttributeValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExcludeConstraintImpl
