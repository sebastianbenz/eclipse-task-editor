/**
 * <copyright>
 * </copyright>
 *

 */
package de.sebastianbenz.task.query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comp Eq Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.sebastianbenz.task.query.CompEqExpr#getLeft <em>Left</em>}</li>
 *   <li>{@link de.sebastianbenz.task.query.CompEqExpr#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.sebastianbenz.task.query.CompEqExpr#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.sebastianbenz.task.query.QueryPackage#getCompEqExpr()
 * @model
 * @generated
 */
public interface CompEqExpr extends Expression
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
   * @see de.sebastianbenz.task.query.QueryPackage#getCompEqExpr_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link de.sebastianbenz.task.query.CompEqExpr#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link de.sebastianbenz.task.query.CompEqOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see de.sebastianbenz.task.query.CompEqOperator
   * @see #setOperator(CompEqOperator)
   * @see de.sebastianbenz.task.query.QueryPackage#getCompEqExpr_Operator()
   * @model
   * @generated
   */
  CompEqOperator getOperator();

  /**
   * Sets the value of the '{@link de.sebastianbenz.task.query.CompEqExpr#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see de.sebastianbenz.task.query.CompEqOperator
   * @see #getOperator()
   * @generated
   */
  void setOperator(CompEqOperator value);

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
   * @see de.sebastianbenz.task.query.QueryPackage#getCompEqExpr_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link de.sebastianbenz.task.query.CompEqExpr#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // CompEqExpr
