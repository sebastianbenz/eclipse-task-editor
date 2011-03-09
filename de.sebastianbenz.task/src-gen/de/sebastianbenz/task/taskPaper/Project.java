/**
 * <copyright>
 * </copyright>
 *
 */
package de.sebastianbenz.task.taskPaper;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.sebastianbenz.task.taskPaper.Project#getIntend <em>Intend</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.sebastianbenz.task.taskPaper.TaskPaperPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends Content
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
   * @see de.sebastianbenz.task.taskPaper.TaskPaperPackage#getProject_Intend()
   * @model unique="false"
   * @generated
   */
  EList<String> getIntend();

} // Project
