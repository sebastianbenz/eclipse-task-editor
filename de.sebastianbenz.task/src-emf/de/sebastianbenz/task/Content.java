/**
 * <copyright>
 * </copyright>
 *

 */
package de.sebastianbenz.task;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link de.sebastianbenz.task.Content#getTags <em>Tags</em>}</li>
 *   <li>{@link de.sebastianbenz.task.Content#getLinks <em>Links</em>}</li>
 *   <li>{@link de.sebastianbenz.task.Content#getSegments <em>Segments</em>}</li>
 *   <li>{@link de.sebastianbenz.task.Content#getImages <em>Images</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.sebastianbenz.task.TaskPackage#getContent()
 * @model abstract="true"
 * @generated
 */
public interface Content extends Container
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
	 * @model opposite="children" transient="true" derived="true"
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
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link de.sebastianbenz.task.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see de.sebastianbenz.task.TaskPackage#getContent_Tags()
	 * @model containment="true" transient="true" derived="true"
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link de.sebastianbenz.task.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see de.sebastianbenz.task.TaskPackage#getContent_Links()
	 * @model containment="true" transient="true" derived="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
	 * The list contents are of type {@link de.sebastianbenz.task.TextSegment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference list.
	 * @see de.sebastianbenz.task.TaskPackage#getContent_Segments()
	 * @model containment="true" transient="true" derived="true"
	 * @generated
	 */
	EList<TextSegment> getSegments();

	/**
	 * Returns the value of the '<em><b>Images</b></em>' containment reference list.
	 * The list contents are of type {@link de.sebastianbenz.task.Image}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Images</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Images</em>' containment reference list.
	 * @see de.sebastianbenz.task.TaskPackage#getContent_Images()
	 * @model containment="true" transient="true" derived="true"
	 * @generated
	 */
	EList<Image> getImages();

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isDone();

} // Content
