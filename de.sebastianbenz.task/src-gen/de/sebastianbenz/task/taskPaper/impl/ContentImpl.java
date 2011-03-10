/**
 * <copyright>
 * </copyright>
 *
 */
package de.sebastianbenz.task.taskPaper.impl;

import de.sebastianbenz.task.taskPaper.Content;
import de.sebastianbenz.task.taskPaper.TaskPaperPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.sebastianbenz.task.taskPaper.impl.ContentImpl#getIntend <em>Intend</em>}</li>
 *   <li>{@link de.sebastianbenz.task.taskPaper.impl.ContentImpl#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContentImpl extends MinimalEObjectImpl.Container implements Content
{
  /**
   * The cached value of the '{@link #getIntend() <em>Intend</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntend()
   * @generated
   * @ordered
   */
  protected EList<String> intend;

  /**
   * The default value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected static final String TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected String text = TEXT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContentImpl()
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
    return TaskPaperPackage.Literals.CONTENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getIntend()
  {
    if (intend == null)
    {
      intend = new EDataTypeEList<String>(String.class, this, TaskPaperPackage.CONTENT__INTEND);
    }
    return intend;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(String newText)
  {
    String oldText = text;
    text = newText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TaskPaperPackage.CONTENT__TEXT, oldText, text));
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
      case TaskPaperPackage.CONTENT__INTEND:
        return getIntend();
      case TaskPaperPackage.CONTENT__TEXT:
        return getText();
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
      case TaskPaperPackage.CONTENT__INTEND:
        getIntend().clear();
        getIntend().addAll((Collection<? extends String>)newValue);
        return;
      case TaskPaperPackage.CONTENT__TEXT:
        setText((String)newValue);
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
      case TaskPaperPackage.CONTENT__INTEND:
        getIntend().clear();
        return;
      case TaskPaperPackage.CONTENT__TEXT:
        setText(TEXT_EDEFAULT);
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
      case TaskPaperPackage.CONTENT__INTEND:
        return intend != null && !intend.isEmpty();
      case TaskPaperPackage.CONTENT__TEXT:
        return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (intend: ");
    result.append(intend);
    result.append(", text: ");
    result.append(text);
    result.append(')');
    return result.toString();
  }

} //ContentImpl
