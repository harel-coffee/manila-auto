/**
 */
package it.disim.univaq.qml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.Task#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.qml.QmlPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.disim.univaq.qml.TaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see it.disim.univaq.qml.TaskType
	 * @see #setType(TaskType)
	 * @see it.disim.univaq.qml.QmlPackage#getTask_Type()
	 * @model
	 * @generated
	 */
	TaskType getType();

	/**
	 * Sets the value of the '{@link it.disim.univaq.qml.Task#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see it.disim.univaq.qml.TaskType
	 * @see #getType()
	 * @generated
	 */
	void setType(TaskType value);

} // Task
