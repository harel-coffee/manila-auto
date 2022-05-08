/**
 */
package it.disim.univaq.qml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.QualityRequirements#getMadeOf <em>Made Of</em>}</li>
 *   <li>{@link it.disim.univaq.qml.QualityRequirements#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.qml.QmlPackage#getQualityRequirements()
 * @model
 * @generated
 */
public interface QualityRequirements extends EObject {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' attribute.
	 * The literals are from the enumeration {@link it.disim.univaq.qml.TaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' attribute.
	 * @see it.disim.univaq.qml.TaskType
	 * @see #setTask(TaskType)
	 * @see it.disim.univaq.qml.QmlPackage#getQualityRequirements_Task()
	 * @model required="true"
	 * @generated
	 */
	TaskType getTask();

	/**
	 * Sets the value of the '{@link it.disim.univaq.qml.QualityRequirements#getTask <em>Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' attribute.
	 * @see it.disim.univaq.qml.TaskType
	 * @see #getTask()
	 * @generated
	 */
	void setTask(TaskType value);

	/**
	 * Returns the value of the '<em><b>Made Of</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.univaq.qml.QualityRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Made Of</em>' containment reference list.
	 * @see it.disim.univaq.qml.QmlPackage#getQualityRequirements_MadeOf()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<QualityRequirement> getMadeOf();

} // QualityRequirements
