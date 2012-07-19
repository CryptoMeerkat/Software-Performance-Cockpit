/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.sopeco.model.configuration.environment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Parameter Role</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.sopeco.model.configuration.environment.EnvironmentPackage#getParameterRole()
 * @model
 * @generated
 */
public enum ParameterRole implements Enumerator {
	/**
	 * The '<em><b>INPUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	INPUT(0, "INPUT", "INPUT"),

	/**
	 * The '<em><b>OBSERVATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVATION_VALUE
	 * @generated
	 * @ordered
	 */
	OBSERVATION(1, "OBSERVATION", "OBSERVATION");

	/**
	 * The '<em><b>INPUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INPUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INPUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INPUT_VALUE = 0;

	/**
	 * The '<em><b>OBSERVATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OBSERVATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBSERVATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVATION_VALUE = 1;

	/**
	 * An array of all the '<em><b>Parameter Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ParameterRole[] VALUES_ARRAY =
		new ParameterRole[] {
			INPUT,
			OBSERVATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Parameter Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ParameterRole> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Parameter Role</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParameterRole get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParameterRole result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parameter Role</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParameterRole getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParameterRole result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parameter Role</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParameterRole get(int value) {
		switch (value) {
			case INPUT_VALUE: return INPUT;
			case OBSERVATION_VALUE: return OBSERVATION;
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
	private ParameterRole(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //ParameterRole
