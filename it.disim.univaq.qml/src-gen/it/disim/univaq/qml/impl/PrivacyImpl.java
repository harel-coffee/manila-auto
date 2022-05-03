/**
 */
package it.disim.univaq.qml.impl;

import it.disim.univaq.qml.Level;
import it.disim.univaq.qml.Privacy;
import it.disim.univaq.qml.QmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Privacy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.impl.PrivacyImpl#getPrivacyLevel <em>Privacy Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrivacyImpl extends QualityPropertyImpl implements Privacy {
	/**
	 * The default value of the '{@link #getPrivacyLevel() <em>Privacy Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivacyLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Level PRIVACY_LEVEL_EDEFAULT = Level.LOW;

	/**
	 * The cached value of the '{@link #getPrivacyLevel() <em>Privacy Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivacyLevel()
	 * @generated
	 * @ordered
	 */
	protected Level privacyLevel = PRIVACY_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivacyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmlPackage.Literals.PRIVACY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Level getPrivacyLevel() {
		return privacyLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivacyLevel(Level newPrivacyLevel) {
		Level oldPrivacyLevel = privacyLevel;
		privacyLevel = newPrivacyLevel == null ? PRIVACY_LEVEL_EDEFAULT : newPrivacyLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmlPackage.PRIVACY__PRIVACY_LEVEL, oldPrivacyLevel,
					privacyLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QmlPackage.PRIVACY__PRIVACY_LEVEL:
			return getPrivacyLevel();
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
		case QmlPackage.PRIVACY__PRIVACY_LEVEL:
			setPrivacyLevel((Level) newValue);
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
		case QmlPackage.PRIVACY__PRIVACY_LEVEL:
			setPrivacyLevel(PRIVACY_LEVEL_EDEFAULT);
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
		case QmlPackage.PRIVACY__PRIVACY_LEVEL:
			return privacyLevel != PRIVACY_LEVEL_EDEFAULT;
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
		result.append(" (privacyLevel: ");
		result.append(privacyLevel);
		result.append(')');
		return result.toString();
	}

} //PrivacyImpl
