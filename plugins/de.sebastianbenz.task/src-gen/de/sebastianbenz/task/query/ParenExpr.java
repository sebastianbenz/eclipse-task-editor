/**
 */
package de.sebastianbenz.task.query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paren Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.sebastianbenz.task.query.ParenExpr#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.sebastianbenz.task.query.QueryPackage#getParenExpr()
 * @model
 * @generated
 */
public interface ParenExpr extends Atom
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expression)
   * @see de.sebastianbenz.task.query.QueryPackage#getParenExpr_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link de.sebastianbenz.task.query.ParenExpr#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

} // ParenExpr
