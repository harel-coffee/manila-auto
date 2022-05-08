/**
 */
package it.disim.univaq.qml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Task Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.disim.univaq.qml.QmlPackage#getTaskType()
 * @model
 * @generated
 */
public enum TaskType implements Enumerator {
	/**
	 * The '<em><b>CLASSIFICATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASSIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	CLASSIFICATION(0, "CLASSIFICATION", "CLASSIFICATION"),

	/**
	 * The '<em><b>REGRESSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	REGRESSION(1, "REGRESSION", "REGRESSION"),

	/**
	 * The '<em><b>NLP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NLP_VALUE
	 * @generated
	 * @ordered
	 */
	NLP(2, "NLP", "NLP");

	/**
	 * The '<em><b>CLASSIFICATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASSIFICATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLASSIFICATION_VALUE = 0;

	/**
	 * The '<em><b>REGRESSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGRESSION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REGRESSION_VALUE = 1;

	/**
	 * The '<em><b>NLP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NLP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NLP_VALUE = 2;

	/**
	 * An array of all the '<em><b>Task Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TaskType[] VALUES_ARRAY = new TaskType[] { CLASSIFICATION, REGRESSION, NLP, };

	/**
	 * A public read-only list of all the '<em><b>Task Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TaskType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Task Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TaskType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaskType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Task Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TaskType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaskType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Task Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TaskType get(int value) {
		switch (value) {
		case CLASSIFICATION_VALUE:
			return CLASSIFICATION;
		case REGRESSION_VALUE:
			return REGRESSION;
		case NLP_VALUE:
			return NLP;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TaskType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //TaskType
