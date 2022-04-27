/**
 */
package it.disim.univaq.qml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explainability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.qml.Explainability#getExplainabilityLevel <em>Explainability Level</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.qml.QmlPackage#getExplainability()
 * @model
 * @generated
 */
public interface Explainability extends QualityProperty {
	/**
	 * Returns the value of the '<em><b>Explainability Level</b></em>' attribute.
	 * The literals are from the enumeration {@link it.disim.univaq.qml.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explainability Level</em>' attribute.
	 * @see it.disim.univaq.qml.Level
	 * @see #setExplainabilityLevel(Level)
	 * @see it.disim.univaq.qml.QmlPackage#getExplainability_ExplainabilityLevel()
	 * @model
	 * @generated
	 */
	Level getExplainabilityLevel();

	/**
	 * Sets the value of the '{@link it.disim.univaq.qml.Explainability#getExplainabilityLevel <em>Explainability Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explainability Level</em>' attribute.
	 * @see it.disim.univaq.qml.Level
	 * @see #getExplainabilityLevel()
	 * @generated
	 */
	void setExplainabilityLevel(Level value);

} // Explainability
