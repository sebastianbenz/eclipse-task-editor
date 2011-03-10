/**
 * <copyright>
 * </copyright>
 *
 */
package de.sebastianbenz.task.taskPaper.impl;

import de.sebastianbenz.task.taskPaper.Content;
import de.sebastianbenz.task.taskPaper.TaskPaperPackage;
import de.sebastianbenz.task.taskPaper.Todo;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Todo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.sebastianbenz.task.taskPaper.impl.TodoImpl#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TodoImpl extends MinimalEObjectImpl.Container implements Todo
{
  /**
   * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContents()
   * @generated
   * @ordered
   */
  protected EList<Content> contents;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TodoImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TaskPaperPackage.Literals.TODO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Content> getContents()
  {
    if (contents == null)
    {
      contents = new EObjectContainmentEList<Content>(Content.class, this, TaskPaperPackage.TODO__CONTENTS);
    }
    return contents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TaskPaperPackage.TODO__CONTENTS:
        return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TaskPaperPackage.TODO__CONTENTS:
        return getContents();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TaskPaperPackage.TODO__CONTENTS:
        getContents().clear();
        getContents().addAll((Collection<? extends Content>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TaskPaperPackage.TODO__CONTENTS:
        getContents().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TaskPaperPackage.TODO__CONTENTS:
        return contents != null && !contents.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TodoImpl
