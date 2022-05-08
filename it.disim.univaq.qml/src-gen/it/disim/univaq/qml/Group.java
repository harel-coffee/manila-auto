/**
 */
package it.disim.univaq.qml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.Group#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.qml.QmlPackage#getGroup()
 * @model abstract="true"
 * @generated
 */
public interface Group extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference list.
	 * The list contents are of type {@link it.disim.univaq.qml.Feature}.
	 * It is bidirectional and its opposite is '{@link it.disim.univaq.qml.Feature#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference list.
	 * @see it.disim.univaq.qml.QmlPackage#getGroup_Feature()
	 * @see it.disim.univaq.qml.Feature#getGroup
	 * @model opposite="group" lower="2"
	 * @generated
	 */
	EList<Feature> getFeature();

} // Group
