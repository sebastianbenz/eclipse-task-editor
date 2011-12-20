/**
 * <copyright>
 * </copyright>
 *
 */
package de.sebastianbenz.task.query;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Words</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.sebastianbenz.task.query.Words#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.sebastianbenz.task.query.QueryPackage#getWords()
 * @model
 * @generated
 */
public interface Words extends Atom
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' attribute list.
   * @see de.sebastianbenz.task.query.QueryPackage#getWords_Values()
   * @model unique="false"
   * @generated
   */
  EList<String> getValues();

} // Words
