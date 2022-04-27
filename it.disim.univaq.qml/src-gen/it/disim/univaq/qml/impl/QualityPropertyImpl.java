/**
 */
package it.disim.univaq.qml.impl;

import it.disim.univaq.qml.Feature;
import it.disim.univaq.qml.Measure;
import it.disim.univaq.qml.QmlPackage;
import it.disim.univaq.qml.QualityNature;
import it.disim.univaq.qml.QualityProperty;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.impl.QualityPropertyImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link it.disim.univaq.qml.impl.QualityPropertyImpl#getNature <em>Nature</em>}</li>
 *   <li>{@link it.disim.univaq.qml.impl.QualityPropertyImpl#getImplentedBy <em>Implented By</em>}</li>
 *   <li>{@link it.disim.univaq.qml.impl.QualityPropertyImpl#getInvolvedFeature <em>Involved Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class QualityPropertyImpl extends MinimalEObjectImpl.Container implements QualityProperty {
	/**
	 * The cached value of the '{@link #getMeasure() <em>Measure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<Measure> measure;

	/**
	 * The default value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected static final QualityNature NATURE_EDEFAULT = QualityNature.REQUIRED;

	/**
	 * The cached value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected QualityNature nature = NATURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImplentedBy() <em>Implented By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplentedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> implentedBy;

	/**
	 * The cached value of the '{@link #getInvolvedFeature() <em>Involved Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvedFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> involvedFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmlPackage.Literals.QUALITY_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Measure> getMeasure() {
		if (measure == null) {
			measure = new EObjectContainmentEList<Measure>(Measure.class, this, QmlPackage.QUALITY_PROPERTY__MEASURE);
		}
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualityNature getNature() {
		return nature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNature(QualityNature newNature) {
		QualityNature oldNature = nature;
		nature = newNature == null ? NATURE_EDEFAULT : newNature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmlPackage.QUALITY_PROPERTY__NATURE, oldNature,
					nature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getImplentedBy() {
		if (implentedBy == null) {
			implentedBy = new EObjectResolvingEList<Feature>(Feature.class, this,
					QmlPackage.QUALITY_PROPERTY__IMPLENTED_BY);
		}
		return implentedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getInvolvedFeature() {
		if (involvedFeature == null) {
			involvedFeature = new EObjectResolvingEList<Feature>(Feature.class, this,
					QmlPackage.QUALITY_PROPERTY__INVOLVED_FEATURE);
		}
		return involvedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QmlPackage.QUALITY_PROPERTY__MEASURE:
			return ((InternalEList<?>) getMeasure()).basicRemove(otherEnd, msgs);
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
		case QmlPackage.QUALITY_PROPERTY__MEASURE:
			return getMeasure();
		case QmlPackage.QUALITY_PROPERTY__NATURE:
			return getNature();
		case QmlPackage.QUALITY_PROPERTY__IMPLENTED_BY:
			return getImplentedBy();
		case QmlPackage.QUALITY_PROPERTY__INVOLVED_FEATURE:
			return getInvolvedFeature();
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
		case QmlPackage.QUALITY_PROPERTY__MEASURE:
			getMeasure().clear();
			getMeasure().addAll((Collection<? extends Measure>) newValue);
			return;
		case QmlPackage.QUALITY_PROPERTY__NATURE:
			setNature((QualityNature) newValue);
			return;
		case QmlPackage.QUALITY_PROPERTY__IMPLENTED_BY:
			getImplentedBy().clear();
			getImplentedBy().addAll((Collection<? extends Feature>) newValue);
			return;
		case QmlPackage.QUALITY_PROPERTY__INVOLVED_FEATURE:
			getInvolvedFeature().clear();
			getInvolvedFeature().addAll((Collection<? extends Feature>) newValue);
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
		case QmlPackage.QUALITY_PROPERTY__MEASURE:
			getMeasure().clear();
			return;
		case QmlPackage.QUALITY_PROPERTY__NATURE:
			setNature(NATURE_EDEFAULT);
			return;
		case QmlPackage.QUALITY_PROPERTY__IMPLENTED_BY:
			getImplentedBy().clear();
			return;
		case QmlPackage.QUALITY_PROPERTY__INVOLVED_FEATURE:
			getInvolvedFeature().clear();
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
		case QmlPackage.QUALITY_PROPERTY__MEASURE:
			return measure != null && !measure.isEmpty();
		case QmlPackage.QUALITY_PROPERTY__NATURE:
			return nature != NATURE_EDEFAULT;
		case QmlPackage.QUALITY_PROPERTY__IMPLENTED_BY:
			return implentedBy != null && !implentedBy.isEmpty();
		case QmlPackage.QUALITY_PROPERTY__INVOLVED_FEATURE:
			return involvedFeature != null && !involvedFeature.isEmpty();
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
		result.append(" (nature: ");
		result.append(nature);
		result.append(')');
		return result.toString();
	}

} //QualityPropertyImpl
