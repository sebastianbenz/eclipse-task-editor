/**
 */
package de.sebastianbenz.task;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.sebastianbenz.task.Container#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.sebastianbenz.task.TaskPackage#getContainer()
 * @model abstract="true"
 * @generated
 */
public interface Container extends EObject
{
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link de.sebastianbenz.task.Content}.
	 * It is bidirectional and its opposite is '{@link de.sebastianbenz.task.Content#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see de.sebastianbenz.task.TaskPackage#getContainer_Children()
	 * @see de.sebastianbenz.task.Content#getParent
	 * @model opposite="parent" transient="true" derived="true"
	 * @generated
	 */
	EList<Content> getChildren();

} // Container
