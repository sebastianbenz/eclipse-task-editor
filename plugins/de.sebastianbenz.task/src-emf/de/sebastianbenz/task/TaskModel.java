/**
 * <copyright>
 * </copyright>
 *

 */
package de.sebastianbenz.task;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.sebastianbenz.task.TaskModel#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.sebastianbenz.task.TaskPackage#getTaskModel()
 * @model
 * @generated
 */
public interface TaskModel extends Container
{
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link de.sebastianbenz.task.Content}.
	 * It is bidirectional and its opposite is '{@link de.sebastianbenz.task.Content#getTaskModel <em>Task Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see de.sebastianbenz.task.TaskPackage#getTaskModel_Contents()
	 * @see de.sebastianbenz.task.Content#getTaskModel
	 * @model opposite="taskModel" containment="true"
	 * @generated
	 */
	EList<Content> getContents();

} // TaskModel
