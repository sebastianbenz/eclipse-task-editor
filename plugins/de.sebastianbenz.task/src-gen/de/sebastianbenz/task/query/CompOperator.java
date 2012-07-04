/**
 */
package de.sebastianbenz.task.query;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Comp Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.sebastianbenz.task.query.QueryPackage#getCompOperator()
 * @model
 * @generated
 */
public enum CompOperator implements Enumerator
{
  /**
   * The '<em><b>LESS EQUAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LESS_EQUAL_VALUE
   * @generated
   * @ordered
   */
  LESS_EQUAL(0, "LESS_EQUAL", "<="),

  /**
   * The '<em><b>LESS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LESS_VALUE
   * @generated
   * @ordered
   */
  LESS(1, "LESS", "<"),

  /**
   * The '<em><b>GREATER EQUAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GREATER_EQUAL_VALUE
   * @generated
   * @ordered
   */
  GREATER_EQUAL(2, "GREATER_EQUAL", ">="),

  /**
   * The '<em><b>GREATER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GREATER_VALUE
   * @generated
   * @ordered
   */
  GREATER(3, "GREATER", ">");

  /**
   * The '<em><b>LESS EQUAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LESS EQUAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LESS_EQUAL
   * @model literal="<="
   * @generated
   * @ordered
   */
  public static final int LESS_EQUAL_VALUE = 0;

  /**
   * The '<em><b>LESS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LESS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LESS
   * @model literal="<"
   * @generated
   * @ordered
   */
  public static final int LESS_VALUE = 1;

  /**
   * The '<em><b>GREATER EQUAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>GREATER EQUAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GREATER_EQUAL
   * @model literal=">="
   * @generated
   * @ordered
   */
  public static final int GREATER_EQUAL_VALUE = 2;

  /**
   * The '<em><b>GREATER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>GREATER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GREATER
   * @model literal=">"
   * @generated
   * @ordered
   */
  public static final int GREATER_VALUE = 3;

  /**
   * An array of all the '<em><b>Comp Operator</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final CompOperator[] VALUES_ARRAY =
    new CompOperator[]
    {
      LESS_EQUAL,
      LESS,
      GREATER_EQUAL,
      GREATER,
    };

  /**
   * A public read-only list of all the '<em><b>Comp Operator</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<CompOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Comp Operator</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CompOperator get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      CompOperator result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Comp Operator</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CompOperator getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      CompOperator result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Comp Operator</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CompOperator get(int value)
  {
    switch (value)
    {
      case LESS_EQUAL_VALUE: return LESS_EQUAL;
      case LESS_VALUE: return LESS;
      case GREATER_EQUAL_VALUE: return GREATER_EQUAL;
      case GREATER_VALUE: return GREATER;
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
  private CompOperator(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //CompOperator
