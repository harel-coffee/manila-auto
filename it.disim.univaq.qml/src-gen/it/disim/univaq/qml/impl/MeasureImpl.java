/**
 */
package it.disim.univaq.qml.impl;

import it.disim.univaq.qml.Feature;
import it.disim.univaq.qml.Measure;
import it.disim.univaq.qml.QmlPackage;
import it.disim.univaq.qml.Threshold;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.impl.MeasureImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link it.disim.univaq.qml.impl.MeasureImpl#getImplementedBy <em>Implemented By</em>}</li>
 *   <li>{@link it.disim.univaq.qml.impl.MeasureImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureImpl extends MinimalEObjectImpl.Container implements Measure {
	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected Threshold threshold;

	/**
	 * The cached value of the '{@link #getImplementedBy() <em>Implemented By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedBy()
	 * @generated
	 * @ordered
	 */
	protected Feature implementedBy;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmlPackage.Literals.MEASURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Threshold getThreshold() {
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThreshold(Threshold newThreshold, NotificationChain msgs) {
		Threshold oldThreshold = threshold;
		threshold = newThreshold;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					QmlPackage.MEASURE__THRESHOLD, oldThreshold, newThreshold);
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
	public void setThreshold(Threshold newThreshold) {
		if (newThreshold != threshold) {
			NotificationChain msgs = null;
			if (threshold != null)
				msgs = ((InternalEObject) threshold).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - QmlPackage.MEASURE__THRESHOLD, null, msgs);
			if (newThreshold != null)
				msgs = ((InternalEObject) newThreshold).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - QmlPackage.MEASURE__THRESHOLD, null, msgs);
			msgs = basicSetThreshold(newThreshold, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmlPackage.MEASURE__THRESHOLD, newThreshold,
					newThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getImplementedBy() {
		if (implementedBy != null && implementedBy.eIsProxy()) {
			InternalEObject oldImplementedBy = (InternalEObject) implementedBy;
			implementedBy = (Feature) eResolveProxy(oldImplementedBy);
			if (implementedBy != oldImplementedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QmlPackage.MEASURE__IMPLEMENTED_BY,
							oldImplementedBy, implementedBy));
			}
		}
		return implementedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetImplementedBy() {
		return implementedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplementedBy(Feature newImplementedBy) {
		Feature oldImplementedBy = implementedBy;
		implementedBy = newImplementedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmlPackage.MEASURE__IMPLEMENTED_BY, oldImplementedBy,
					implementedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmlPackage.MEASURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QmlPackage.MEASURE__THRESHOLD:
			return basicSetThreshold(null, msgs);
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
		case QmlPackage.MEASURE__THRESHOLD:
			return getThreshold();
		case QmlPackage.MEASURE__IMPLEMENTED_BY:
			if (resolve)
				return getImplementedBy();
			return basicGetImplementedBy();
		case QmlPackage.MEASURE__NAME:
			return getName();
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
		case QmlPackage.MEASURE__THRESHOLD:
			setThreshold((Threshold) newValue);
			return;
		case QmlPackage.MEASURE__IMPLEMENTED_BY:
			setImplementedBy((Feature) newValue);
			return;
		case QmlPackage.MEASURE__NAME:
			setName((String) newValue);
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
		case QmlPackage.MEASURE__THRESHOLD:
			setThreshold((Threshold) null);
			return;
		case QmlPackage.MEASURE__IMPLEMENTED_BY:
			setImplementedBy((Feature) null);
			return;
		case QmlPackage.MEASURE__NAME:
			setName(NAME_EDEFAULT);
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
		case QmlPackage.MEASURE__THRESHOLD:
			return threshold != null;
		case QmlPackage.MEASURE__IMPLEMENTED_BY:
			return implementedBy != null;
		case QmlPackage.MEASURE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MeasureImpl
