/**
 */
package it.disim.univaq.qml.impl;

import it.disim.univaq.qml.Explainability;
import it.disim.univaq.qml.Level;
import it.disim.univaq.qml.QmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explainability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.impl.ExplainabilityImpl#getExplainabilityLevel <em>Explainability Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplainabilityImpl extends QualityPropertyImpl implements Explainability {
	/**
	 * The default value of the '{@link #getExplainabilityLevel() <em>Explainability Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplainabilityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Level EXPLAINABILITY_LEVEL_EDEFAULT = Level.LOW;

	/**
	 * The cached value of the '{@link #getExplainabilityLevel() <em>Explainability Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplainabilityLevel()
	 * @generated
	 * @ordered
	 */
	protected Level explainabilityLevel = EXPLAINABILITY_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplainabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmlPackage.Literals.EXPLAINABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Level getExplainabilityLevel() {
		return explainabilityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExplainabilityLevel(Level newExplainabilityLevel) {
		Level oldExplainabilityLevel = explainabilityLevel;
		explainabilityLevel = newExplainabilityLevel == null ? EXPLAINABILITY_LEVEL_EDEFAULT : newExplainabilityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmlPackage.EXPLAINABILITY__EXPLAINABILITY_LEVEL,
					oldExplainabilityLevel, explainabilityLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QmlPackage.EXPLAINABILITY__EXPLAINABILITY_LEVEL:
			return getExplainabilityLevel();
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
		case QmlPackage.EXPLAINABILITY__EXPLAINABILITY_LEVEL:
			setExplainabilityLevel((Level) newValue);
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
		case QmlPackage.EXPLAINABILITY__EXPLAINABILITY_LEVEL:
			setExplainabilityLevel(EXPLAINABILITY_LEVEL_EDEFAULT);
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
		case QmlPackage.EXPLAINABILITY__EXPLAINABILITY_LEVEL:
			return explainabilityLevel != EXPLAINABILITY_LEVEL_EDEFAULT;
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
		result.append(" (explainabilityLevel: ");
		result.append(explainabilityLevel);
		result.append(')');
		return result.toString();
	}

} //ExplainabilityImpl
