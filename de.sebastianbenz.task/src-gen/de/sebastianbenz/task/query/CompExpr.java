/**
 * <copyright>
 * </copyright>
 *
 */
package de.sebastianbenz.task.query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comp Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.sebastianbenz.task.query.CompExpr#getLeft <em>Left</em>}</li>
 *   <li>{@link de.sebastianbenz.task.query.CompExpr#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.sebastianbenz.task.query.CompExpr#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.sebastianbenz.task.query.QueryPackage#getCompExpr()
 * @model
 * @generated
 */
public interface CompExpr extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see de.sebastianbenz.task.query.QueryPackage#getCompExpr_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link de.sebastianbenz.task.query.CompExpr#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link de.sebastianbenz.task.query.CompOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see de.sebastianbenz.task.query.CompOperator
   * @see #setOperator(CompOperator)
   * @see de.sebastianbenz.task.query.QueryPackage#getCompExpr_Operator()
   * @model
   * @generated
   */
  CompOperator getOperator();

  /**
   * Sets the value of the '{@link de.sebastianbenz.task.query.CompExpr#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see de.sebastianbenz.task.query.CompOperator
   * @see #getOperator()
   * @generated
   */
  void setOperator(CompOperator value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see de.sebastianbenz.task.query.QueryPackage#getCompExpr_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link de.sebastianbenz.task.query.CompExpr#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // CompExpr
