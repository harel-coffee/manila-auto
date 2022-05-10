/**
 */
package it.disim.univaq.qml.impl;

import it.disim.univaq.qml.AttributeSpecification;
import it.disim.univaq.qml.QmlPackage;
import it.disim.univaq.qml.QualityRequirement;
import it.disim.univaq.qml.Requirement;
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
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.impl.RequirementImpl#getQualityrequirement <em>Qualityrequirement</em>}</li>
 *   <li>{@link it.disim.univaq.qml.impl.RequirementImpl#getTask <em>Task</em>}</li>
 *   <li>{@link it.disim.univaq.qml.impl.RequirementImpl#getAttributespecification <em>Attributespecification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementImpl extends MinimalEObjectImpl.Container implements Requirement {
	/**
	 * The cached value of the '{@link #getQualityrequirement() <em>Qualityrequirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityrequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<QualityRequirement> qualityrequirement;

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
	 * The cached value of the '{@link #getAttributespecification() <em>Attributespecification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributespecification()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeSpecification> attributespecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmlPackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QualityRequirement> getQualityrequirement() {
		if (qualityrequirement == null) {
			qualityrequirement = new EObjectContainmentEList<QualityRequirement>(QualityRequirement.class, this,
					QmlPackage.REQUIREMENT__QUALITYREQUIREMENT);
		}
		return qualityrequirement;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QmlPackage.REQUIREMENT__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttributeSpecification> getAttributespecification() {
		if (attributespecification == null) {
			attributespecification = new EObjectContainmentEList<AttributeSpecification>(AttributeSpecification.class,
					this, QmlPackage.REQUIREMENT__ATTRIBUTESPECIFICATION);
		}
		return attributespecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QmlPackage.REQUIREMENT__QUALITYREQUIREMENT:
			return ((InternalEList<?>) getQualityrequirement()).basicRemove(otherEnd, msgs);
		case QmlPackage.REQUIREMENT__ATTRIBUTESPECIFICATION:
			return ((InternalEList<?>) getAttributespecification()).basicRemove(otherEnd, msgs);
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
		case QmlPackage.REQUIREMENT__QUALITYREQUIREMENT:
			return getQualityrequirement();
		case QmlPackage.REQUIREMENT__TASK:
			return getTask();
		case QmlPackage.REQUIREMENT__ATTRIBUTESPECIFICATION:
			return getAttributespecification();
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
		case QmlPackage.REQUIREMENT__QUALITYREQUIREMENT:
			getQualityrequirement().clear();
			getQualityrequirement().addAll((Collection<? extends QualityRequirement>) newValue);
			return;
		case QmlPackage.REQUIREMENT__TASK:
			setTask((TaskType) newValue);
			return;
		case QmlPackage.REQUIREMENT__ATTRIBUTESPECIFICATION:
			getAttributespecification().clear();
			getAttributespecification().addAll((Collection<? extends AttributeSpecification>) newValue);
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
		case QmlPackage.REQUIREMENT__QUALITYREQUIREMENT:
			getQualityrequirement().clear();
			return;
		case QmlPackage.REQUIREMENT__TASK:
			setTask(TASK_EDEFAULT);
			return;
		case QmlPackage.REQUIREMENT__ATTRIBUTESPECIFICATION:
			getAttributespecification().clear();
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
		case QmlPackage.REQUIREMENT__QUALITYREQUIREMENT:
			return qualityrequirement != null && !qualityrequirement.isEmpty();
		case QmlPackage.REQUIREMENT__TASK:
			return task != TASK_EDEFAULT;
		case QmlPackage.REQUIREMENT__ATTRIBUTESPECIFICATION:
			return attributespecification != null && !attributespecification.isEmpty();
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

} //RequirementImpl
