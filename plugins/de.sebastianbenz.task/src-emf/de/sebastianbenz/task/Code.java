/**
 */
package de.sebastianbenz.task;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.sebastianbenz.task.Code#getLang <em>Lang</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.sebastianbenz.task.TaskPackage#getCode()
 * @model
 * @generated
 */
public interface Code extends Content
{
	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #isSetLang()
	 * @see #unsetLang()
	 * @see #setLang(String)
	 * @see de.sebastianbenz.task.TaskPackage#getCode_Lang()
	 * @model unsettable="true" transient="true" volatile="true"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link de.sebastianbenz.task.Code#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #isSetLang()
	 * @see #unsetLang()
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Unsets the value of the '{@link de.sebastianbenz.task.Code#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLang()
	 * @see #getLang()
	 * @see #setLang(String)
	 * @generated
	 */
	void unsetLang();

	/**
	 * Returns whether the value of the '{@link de.sebastianbenz.task.Code#getLang <em>Lang</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lang</em>' attribute is set.
	 * @see #unsetLang()
	 * @see #getLang()
	 * @see #setLang(String)
	 * @generated
	 */
	boolean isSetLang();

} // Code
