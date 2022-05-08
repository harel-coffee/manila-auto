/**
 */
package it.disim.univaq.qml.impl;

import it.disim.univaq.qml.QmlPackage;
import it.disim.univaq.qml.QualityProperty;
import it.disim.univaq.qml.QualityRequirement;
import it.disim.univaq.qml.Threshold;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link it.disim.univaq.qml.impl.QualityRequirementImpl#getRelatedTo <em>Related To</em>}</li>
 *   <li>{@link it.disim.univaq.qml.impl.QualityRequirementImpl#getThreshold <em>Threshold</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityRequirementImpl extends MinimalEObjectImpl.Container implements QualityRequirement {
	/**
	 * The cached value of the '{@link #getRelatedTo() <em>Related To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedTo()
	 * @generated
	 * @ordered
	 */
	protected QualityProperty relatedTo;

	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected EList<Threshold> threshold;

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
	public QualityProperty getRelatedTo() {
		if (relatedTo != null && relatedTo.eIsProxy()) {
			InternalEObject oldRelatedTo = (InternalEObject) relatedTo;
			relatedTo = (QualityProperty) eResolveProxy(oldRelatedTo);
			if (relatedTo != oldRelatedTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							QmlPackage.QUALITY_REQUIREMENT__RELATED_TO, oldRelatedTo, relatedTo));
			}
		}
		return relatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityProperty basicGetRelatedTo() {
		return relatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelatedTo(QualityProperty newRelatedTo) {
		QualityProperty oldRelatedTo = relatedTo;
		relatedTo = newRelatedTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmlPackage.QUALITY_REQUIREMENT__RELATED_TO,
					oldRelatedTo, relatedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Threshold> getThreshold() {
		if (threshold == null) {
			threshold = new EObjectContainmentEList<Threshold>(Threshold.class, this,
					QmlPackage.QUALITY_REQUIREMENT__THRESHOLD);
		}
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QmlPackage.QUALITY_REQUIREMENT__THRESHOLD:
			return ((InternalEList<?>) getThreshold()).basicRemove(otherEnd, msgs);
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
		case QmlPackage.QUALITY_REQUIREMENT__RELATED_TO:
			if (resolve)
				return getRelatedTo();
			return basicGetRelatedTo();
		case QmlPackage.QUALITY_REQUIREMENT__THRESHOLD:
			return getThreshold();
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
		case QmlPackage.QUALITY_REQUIREMENT__RELATED_TO:
			setRelatedTo((QualityProperty) newValue);
			return;
		case QmlPackage.QUALITY_REQUIREMENT__THRESHOLD:
			getThreshold().clear();
			getThreshold().addAll((Collection<? extends Threshold>) newValue);
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
		case QmlPackage.QUALITY_REQUIREMENT__RELATED_TO:
			setRelatedTo((QualityProperty) null);
			return;
		case QmlPackage.QUALITY_REQUIREMENT__THRESHOLD:
			getThreshold().clear();
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
		case QmlPackage.QUALITY_REQUIREMENT__RELATED_TO:
			return relatedTo != null;
		case QmlPackage.QUALITY_REQUIREMENT__THRESHOLD:
			return threshold != null && !threshold.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QualityRequirementImpl
