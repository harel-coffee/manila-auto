/**
 */
package it.disim.univaq.qml.impl;

import it.disim.univaq.qml.Metric;
import it.disim.univaq.qml.Operator;
import it.disim.univaq.qml.QmlPackage;
import it.disim.univaq.qml.Threshold;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threshold</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.impl.ThresholdImpl#getValue <em>Value</em>}</li>
 *   <li>{@link it.disim.univaq.qml.impl.ThresholdImpl#getRelatedTo <em>Related To</em>}</li>
 *   <li>{@link it.disim.univaq.qml.impl.ThresholdImpl#getEqualityOperator <em>Equality Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThresholdImpl extends MinimalEObjectImpl.Container implements Threshold {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected float value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelatedTo() <em>Related To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedTo()
	 * @generated
	 * @ordered
	 */
	protected Metric relatedTo;

	/**
	 * The default value of the '{@link #getEqualityOperator() <em>Equality Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqualityOperator()
	 * @generated
	 * @ordered
	 */
	protected static final Operator EQUALITY_OPERATOR_EDEFAULT = Operator.LOWER_OR_EQUAL;

	/**
	 * The cached value of the '{@link #getEqualityOperator() <em>Equality Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqualityOperator()
	 * @generated
	 * @ordered
	 */
	protected Operator equalityOperator = EQUALITY_OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThresholdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmlPackage.Literals.THRESHOLD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(float newValue) {
		float oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmlPackage.THRESHOLD__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metric getRelatedTo() {
		if (relatedTo != null && relatedTo.eIsProxy()) {
			InternalEObject oldRelatedTo = (InternalEObject) relatedTo;
			relatedTo = (Metric) eResolveProxy(oldRelatedTo);
			if (relatedTo != oldRelatedTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QmlPackage.THRESHOLD__RELATED_TO,
							oldRelatedTo, relatedTo));
			}
		}
		return relatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric basicGetRelatedTo() {
		return relatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelatedTo(Metric newRelatedTo) {
		Metric oldRelatedTo = relatedTo;
		relatedTo = newRelatedTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmlPackage.THRESHOLD__RELATED_TO, oldRelatedTo,
					relatedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operator getEqualityOperator() {
		return equalityOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEqualityOperator(Operator newEqualityOperator) {
		Operator oldEqualityOperator = equalityOperator;
		equalityOperator = newEqualityOperator == null ? EQUALITY_OPERATOR_EDEFAULT : newEqualityOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmlPackage.THRESHOLD__EQUALITY_OPERATOR,
					oldEqualityOperator, equalityOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QmlPackage.THRESHOLD__VALUE:
			return getValue();
		case QmlPackage.THRESHOLD__RELATED_TO:
			if (resolve)
				return getRelatedTo();
			return basicGetRelatedTo();
		case QmlPackage.THRESHOLD__EQUALITY_OPERATOR:
			return getEqualityOperator();
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
		case QmlPackage.THRESHOLD__VALUE:
			setValue((Float) newValue);
			return;
		case QmlPackage.THRESHOLD__RELATED_TO:
			setRelatedTo((Metric) newValue);
			return;
		case QmlPackage.THRESHOLD__EQUALITY_OPERATOR:
			setEqualityOperator((Operator) newValue);
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
		case QmlPackage.THRESHOLD__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case QmlPackage.THRESHOLD__RELATED_TO:
			setRelatedTo((Metric) null);
			return;
		case QmlPackage.THRESHOLD__EQUALITY_OPERATOR:
			setEqualityOperator(EQUALITY_OPERATOR_EDEFAULT);
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
		case QmlPackage.THRESHOLD__VALUE:
			return value != VALUE_EDEFAULT;
		case QmlPackage.THRESHOLD__RELATED_TO:
			return relatedTo != null;
		case QmlPackage.THRESHOLD__EQUALITY_OPERATOR:
			return equalityOperator != EQUALITY_OPERATOR_EDEFAULT;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", equalityOperator: ");
		result.append(equalityOperator);
		result.append(')');
		return result.toString();
	}

} //ThresholdImpl
