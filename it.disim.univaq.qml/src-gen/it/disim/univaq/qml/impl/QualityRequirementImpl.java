/**
 */
package it.disim.univaq.qml.impl;

import it.disim.univaq.qml.QmlPackage;
import it.disim.univaq.qml.QualityProperty;
import it.disim.univaq.qml.QualityRequirement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.impl.QualityRequirementImpl#getQualityproperty <em>Qualityproperty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityRequirementImpl extends MinimalEObjectImpl.Container implements QualityRequirement {
	/**
	 * The cached value of the '{@link #getQualityproperty() <em>Qualityproperty</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityproperty()
	 * @generated
	 * @ordered
	 */
	protected EList<QualityProperty> qualityproperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmlPackage.Literals.QUALITY_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QualityProperty> getQualityproperty() {
		if (qualityproperty == null) {
			qualityproperty = new EObjectContainmentEList<QualityProperty>(QualityProperty.class, this,
					QmlPackage.QUALITY_REQUIREMENT__QUALITYPROPERTY);
		}
		return qualityproperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QmlPackage.QUALITY_REQUIREMENT__QUALITYPROPERTY:
			return ((InternalEList<?>) getQualityproperty()).basicRemove(otherEnd, msgs);
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
		case QmlPackage.QUALITY_REQUIREMENT__QUALITYPROPERTY:
			return getQualityproperty();
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
		case QmlPackage.QUALITY_REQUIREMENT__QUALITYPROPERTY:
			getQualityproperty().clear();
			getQualityproperty().addAll((Collection<? extends QualityProperty>) newValue);
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
		case QmlPackage.QUALITY_REQUIREMENT__QUALITYPROPERTY:
			getQualityproperty().clear();
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
		case QmlPackage.QUALITY_REQUIREMENT__QUALITYPROPERTY:
			return qualityproperty != null && !qualityproperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QualityRequirementImpl
