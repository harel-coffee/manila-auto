/**
 */
package it.disim.univaq.qml.impl;

import it.disim.univaq.qml.QmlPackage;
import it.disim.univaq.qml.QualityRequirement;
import it.disim.univaq.qml.QualityRequirements;
import it.disim.univaq.qml.TaskType;
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
 * An implementation of the model object '<em><b>Quality Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.impl.QualityRequirementsImpl#getMadeOf <em>Made Of</em>}</li>
 *   <li>{@link it.disim.univaq.qml.impl.QualityRequirementsImpl#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityRequirementsImpl extends MinimalEObjectImpl.Container implements QualityRequirements {
	/**
	 * The cached value of the '{@link #getMadeOf() <em>Made Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMadeOf()
	 * @generated
	 * @ordered
	 */
	protected EList<QualityRequirement> madeOf;

	/**
	 * The default value of the '{@link #getTask() <em>Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected static final TaskType TASK_EDEFAULT = TaskType.CLASSIFICATION;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected TaskType task = TASK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityRequirementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmlPackage.Literals.QUALITY_REQUIREMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskType getTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTask(TaskType newTask) {
		TaskType oldTask = task;
		task = newTask == null ? TASK_EDEFAULT : newTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmlPackage.QUALITY_REQUIREMENTS__TASK, oldTask,
					task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QualityRequirement> getMadeOf() {
		if (madeOf == null) {
			madeOf = new EObjectContainmentEList<QualityRequirement>(QualityRequirement.class, this,
					QmlPackage.QUALITY_REQUIREMENTS__MADE_OF);
		}
		return madeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QmlPackage.QUALITY_REQUIREMENTS__MADE_OF:
			return ((InternalEList<?>) getMadeOf()).basicRemove(otherEnd, msgs);
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
		case QmlPackage.QUALITY_REQUIREMENTS__MADE_OF:
			return getMadeOf();
		case QmlPackage.QUALITY_REQUIREMENTS__TASK:
			return getTask();
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
		case QmlPackage.QUALITY_REQUIREMENTS__MADE_OF:
			getMadeOf().clear();
			getMadeOf().addAll((Collection<? extends QualityRequirement>) newValue);
			return;
		case QmlPackage.QUALITY_REQUIREMENTS__TASK:
			setTask((TaskType) newValue);
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
		case QmlPackage.QUALITY_REQUIREMENTS__MADE_OF:
			getMadeOf().clear();
			return;
		case QmlPackage.QUALITY_REQUIREMENTS__TASK:
			setTask(TASK_EDEFAULT);
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
		case QmlPackage.QUALITY_REQUIREMENTS__MADE_OF:
			return madeOf != null && !madeOf.isEmpty();
		case QmlPackage.QUALITY_REQUIREMENTS__TASK:
			return task != TASK_EDEFAULT;
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
		result.append(" (task: ");
		result.append(task);
		result.append(')');
		return result.toString();
	}

} //QualityRequirementsImpl
