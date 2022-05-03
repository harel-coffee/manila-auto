/**
 */
package it.disim.univaq.qml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Privacy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.Privacy#getPrivacyLevel <em>Privacy Level</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.qml.QmlPackage#getPrivacy()
 * @model
 * @generated
 */
public interface Privacy extends QualityProperty {
	/**
	 * Returns the value of the '<em><b>Privacy Level</b></em>' attribute.
	 * The literals are from the enumeration {@link it.disim.univaq.qml.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Privacy Level</em>' attribute.
	 * @see it.disim.univaq.qml.Level
	 * @see #setPrivacyLevel(Level)
	 * @see it.disim.univaq.qml.QmlPackage#getPrivacy_PrivacyLevel()
	 * @model
	 * @generated
	 */
	Level getPrivacyLevel();

	/**
	 * Sets the value of the '{@link it.disim.univaq.qml.Privacy#getPrivacyLevel <em>Privacy Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Privacy Level</em>' attribute.
	 * @see it.disim.univaq.qml.Level
	 * @see #getPrivacyLevel()
	 * @generated
	 */
	void setPrivacyLevel(Level value);

} // Privacy
