/**
 */
package it.disim.univaq.qml.impl;

import it.disim.univaq.qml.Constraint;
import it.disim.univaq.qml.Feature;
import it.disim.univaq.qml.FeatureModel;
import it.disim.univaq.qml.Group;
import it.disim.univaq.qml.QmlPackage;
import it.disim.univaq.qml.QualityProperty;
import it.disim.univaq.qml.Requirement;
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
 * An implementation of the model object '<em><b>Feature Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.impl.FeatureModelImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link it.disim.univaq.qml.impl.FeatureModelImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link it.disim.univaq.qml.impl.FeatureModelImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link it.disim.univaq.qml.impl.FeatureModelImpl#getQualityProperties <em>Quality Properties</em>}</li>
 *   <li>{@link it.disim.univaq.qml.impl.FeatureModelImpl#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureModelImpl extends MinimalEObjectImpl.Container implements FeatureModel {
	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected Feature root;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> groups;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraint;

	/**
	 * The cached value of the '{@link #getQualityProperties() <em>Quality Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<QualityProperty> qualityProperties;

	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected Requirement requirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmlPackage.Literals.FEATURE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(Feature newRoot, NotificationChain msgs) {
		Feature oldRoot = root;
		root = newRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					QmlPackage.FEATURE_MODEL__ROOT, oldRoot, newRoot);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoot(Feature newRoot) {
		if (newRoot != root) {
			NotificationChain msgs = null;
			if (root != null)
				msgs = ((InternalEObject) root).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - QmlPackage.FEATURE_MODEL__ROOT, null, msgs);
			if (newRoot != null)
				msgs = ((InternalEObject) newRoot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - QmlPackage.FEATURE_MODEL__ROOT, null, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmlPackage.FEATURE_MODEL__ROOT, newRoot, newRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<Group>(Group.class, this, QmlPackage.FEATURE_MODEL__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<Constraint>(Constraint.class, this,
					QmlPackage.FEATURE_MODEL__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QualityProperty> getQualityProperties() {
		if (qualityProperties == null) {
			qualityProperties = new EObjectContainmentEList<QualityProperty>(QualityProperty.class, this,
					QmlPackage.FEATURE_MODEL__QUALITY_PROPERTIES);
		}
		return qualityProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Requirement getRequirement() {
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirement(Requirement newRequirement, NotificationChain msgs) {
		Requirement oldRequirement = requirement;
		requirement = newRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					QmlPackage.FEATURE_MODEL__REQUIREMENT, oldRequirement, newRequirement);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirement(Requirement newRequirement) {
		if (newRequirement != requirement) {
			NotificationChain msgs = null;
			if (requirement != null)
				msgs = ((InternalEObject) requirement).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - QmlPackage.FEATURE_MODEL__REQUIREMENT, null, msgs);
			if (newRequirement != null)
				msgs = ((InternalEObject) newRequirement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - QmlPackage.FEATURE_MODEL__REQUIREMENT, null, msgs);
			msgs = basicSetRequirement(newRequirement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmlPackage.FEATURE_MODEL__REQUIREMENT, newRequirement,
					newRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QmlPackage.FEATURE_MODEL__ROOT:
			return basicSetRoot(null, msgs);
		case QmlPackage.FEATURE_MODEL__GROUPS:
			return ((InternalEList<?>) getGroups()).basicRemove(otherEnd, msgs);
		case QmlPackage.FEATURE_MODEL__CONSTRAINT:
			return ((InternalEList<?>) getConstraint()).basicRemove(otherEnd, msgs);
		case QmlPackage.FEATURE_MODEL__QUALITY_PROPERTIES:
			return ((InternalEList<?>) getQualityProperties()).basicRemove(otherEnd, msgs);
		case QmlPackage.FEATURE_MODEL__REQUIREMENT:
			return basicSetRequirement(null, msgs);
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
		case QmlPackage.FEATURE_MODEL__ROOT:
			return getRoot();
		case QmlPackage.FEATURE_MODEL__GROUPS:
			return getGroups();
		case QmlPackage.FEATURE_MODEL__CONSTRAINT:
			return getConstraint();
		case QmlPackage.FEATURE_MODEL__QUALITY_PROPERTIES:
			return getQualityProperties();
		case QmlPackage.FEATURE_MODEL__REQUIREMENT:
			return getRequirement();
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
		case QmlPackage.FEATURE_MODEL__ROOT:
			setRoot((Feature) newValue);
			return;
		case QmlPackage.FEATURE_MODEL__GROUPS:
			getGroups().clear();
			getGroups().addAll((Collection<? extends Group>) newValue);
			return;
		case QmlPackage.FEATURE_MODEL__CONSTRAINT:
			getConstraint().clear();
			getConstraint().addAll((Collection<? extends Constraint>) newValue);
			return;
		case QmlPackage.FEATURE_MODEL__QUALITY_PROPERTIES:
			getQualityProperties().clear();
			getQualityProperties().addAll((Collection<? extends QualityProperty>) newValue);
			return;
		case QmlPackage.FEATURE_MODEL__REQUIREMENT:
			setRequirement((Requirement) newValue);
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
		case QmlPackage.FEATURE_MODEL__ROOT:
			setRoot((Feature) null);
			return;
		case QmlPackage.FEATURE_MODEL__GROUPS:
			getGroups().clear();
			return;
		case QmlPackage.FEATURE_MODEL__CONSTRAINT:
			getConstraint().clear();
			return;
		case QmlPackage.FEATURE_MODEL__QUALITY_PROPERTIES:
			getQualityProperties().clear();
			return;
		case QmlPackage.FEATURE_MODEL__REQUIREMENT:
			setRequirement((Requirement) null);
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
		case QmlPackage.FEATURE_MODEL__ROOT:
			return root != null;
		case QmlPackage.FEATURE_MODEL__GROUPS:
			return groups != null && !groups.isEmpty();
		case QmlPackage.FEATURE_MODEL__CONSTRAINT:
			return constraint != null && !constraint.isEmpty();
		case QmlPackage.FEATURE_MODEL__QUALITY_PROPERTIES:
			return qualityProperties != null && !qualityProperties.isEmpty();
		case QmlPackage.FEATURE_MODEL__REQUIREMENT:
			return requirement != null;
		}
		return super.eIsSet(featureID);
	}

} //FeatureModelImpl
