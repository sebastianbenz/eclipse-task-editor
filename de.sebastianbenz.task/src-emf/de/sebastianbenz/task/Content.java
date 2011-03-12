/**
 * <copyright>
 * </copyright>
 *
 */
package de.sebastianbenz.task;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.sebastianbenz.task.Content#getIntend <em>Intend</em>}</li>
 *   <li>{@link de.sebastianbenz.task.Content#getText <em>Text</em>}</li>
 *   <li>{@link de.sebastianbenz.task.Content#getParent <em>Parent</em>}</li>
 *   <li>{@link de.sebastianbenz.task.Content#getTaskModel <em>Task Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.sebastianbenz.task.TaskPackage#getContent()
 * @model abstract="true"
 * @generated
 */
public interface Content extends EObject
{
	/**
	 * Returns the value of the '<em><b>Intend</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intend</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intend</em>' attribute list.
	 * @see de.sebastianbenz.task.TaskPackage#getContent_Intend()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getIntend();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see de.sebastianbenz.task.TaskPackage#getContent_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link de.sebastianbenz.task.Content#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.sebastianbenz.task.Container#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Container)
	 * @see de.sebastianbenz.task.TaskPackage#getContent_Parent()
	 * @see de.sebastianbenz.task.Container#getChildren
	 * @model opposite="children" derived="true"
	 * @generated
	 */
	Container getParent();

	/**
	 * Sets the value of the '{@link de.sebastianbenz.task.Content#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Container value);

	/**
	 * Returns the value of the '<em><b>Task Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.sebastianbenz.task.TaskModel#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Model</em>' container reference.
	 * @see #setTaskModel(TaskModel)
	 * @see de.sebastianbenz.task.TaskPackage#getContent_TaskModel()
	 * @see de.sebastianbenz.task.TaskModel#getContents
	 * @model opposite="contents" transient="false"
	 * @generated
	 */
	TaskModel getTaskModel();

	/**
	 * Sets the value of the '{@link de.sebastianbenz.task.Content#getTaskModel <em>Task Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Model</em>' container reference.
	 * @see #getTaskModel()
	 * @generated
	 */
	void setTaskModel(TaskModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getLevel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getValue();

} // Content
