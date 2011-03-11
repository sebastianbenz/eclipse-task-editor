/*******************************************************************************
 * Copyright (c) 2011 Sebastian Benz.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sebastian Benz - initial API and implementation
 *******************************************************************************/
package de.sebastianbenz.task.taskPaper;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Todo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.sebastianbenz.task.taskPaper.Todo#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.sebastianbenz.task.taskPaper.TaskPaperPackage#getTodo()
 * @model
 * @generated
 */
public interface Todo extends EObject
{
  /**
   * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
   * The list contents are of type {@link de.sebastianbenz.task.taskPaper.Content}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contents</em>' containment reference list.
   * @see de.sebastianbenz.task.taskPaper.TaskPaperPackage#getTodo_Contents()
   * @model containment="true"
   * @generated
   */
  EList<Content> getContents();

} // Todo
