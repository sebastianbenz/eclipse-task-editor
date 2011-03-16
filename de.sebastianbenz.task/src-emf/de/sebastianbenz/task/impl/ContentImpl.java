/**
 * <copyright>
 * </copyright>
 *

 */
package de.sebastianbenz.task.impl;

import de.sebastianbenz.task.Container;
import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.TaskModel;
import de.sebastianbenz.task.TaskPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.sebastianbenz.task.impl.ContentImpl#getIntend <em>Intend</em>}</li>
 *   <li>{@link de.sebastianbenz.task.impl.ContentImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.sebastianbenz.task.impl.ContentImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link de.sebastianbenz.task.impl.ContentImpl#getTaskModel <em>Task Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ContentImpl extends EObjectImpl implements Content
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
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Container parent;

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
		return TaskPackage.Literals.CONTENT;
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
			intend = new EDataTypeEList<String>(String.class, this, TaskPackage.CONTENT__INTEND);
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.CONTENT__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Container getParent()
	{
		if (parent != null && parent.eIsProxy())
		{
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (Container)eResolveProxy(oldParent);
			if (parent != oldParent)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.CONTENT__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Container basicGetParent()
	{
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Container newParent, NotificationChain msgs)
	{
		Container oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskPackage.CONTENT__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Container newParent)
	{
		if (newParent != parent)
		{
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, TaskPackage.CONTAINER__CHILDREN, Container.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, TaskPackage.CONTAINER__CHILDREN, Container.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.CONTENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskModel getTaskModel()
	{
		if (eContainerFeatureID() != TaskPackage.CONTENT__TASK_MODEL) return null;
		return (TaskModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskModel(TaskModel newTaskModel, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newTaskModel, TaskPackage.CONTENT__TASK_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskModel(TaskModel newTaskModel)
	{
		if (newTaskModel != eInternalContainer() || (eContainerFeatureID() != TaskPackage.CONTENT__TASK_MODEL && newTaskModel != null))
		{
			if (EcoreUtil.isAncestor(this, newTaskModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTaskModel != null)
				msgs = ((InternalEObject)newTaskModel).eInverseAdd(this, TaskPackage.TASK_MODEL__CONTENTS, TaskModel.class, msgs);
			msgs = basicSetTaskModel(newTaskModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.CONTENT__TASK_MODEL, newTaskModel, newTaskModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLevel()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case TaskPackage.CONTENT__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, TaskPackage.CONTAINER__CHILDREN, Container.class, msgs);
				return basicSetParent((Container)otherEnd, msgs);
			case TaskPackage.CONTENT__TASK_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTaskModel((TaskModel)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case TaskPackage.CONTENT__PARENT:
				return basicSetParent(null, msgs);
			case TaskPackage.CONTENT__TASK_MODEL:
				return basicSetTaskModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case TaskPackage.CONTENT__TASK_MODEL:
				return eInternalContainer().eInverseRemove(this, TaskPackage.TASK_MODEL__CONTENTS, TaskModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case TaskPackage.CONTENT__INTEND:
				return getIntend();
			case TaskPackage.CONTENT__TEXT:
				return getText();
			case TaskPackage.CONTENT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case TaskPackage.CONTENT__TASK_MODEL:
				return getTaskModel();
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
			case TaskPackage.CONTENT__INTEND:
				getIntend().clear();
				getIntend().addAll((Collection<? extends String>)newValue);
				return;
			case TaskPackage.CONTENT__TEXT:
				setText((String)newValue);
				return;
			case TaskPackage.CONTENT__PARENT:
				setParent((Container)newValue);
				return;
			case TaskPackage.CONTENT__TASK_MODEL:
				setTaskModel((TaskModel)newValue);
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
			case TaskPackage.CONTENT__INTEND:
				getIntend().clear();
				return;
			case TaskPackage.CONTENT__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case TaskPackage.CONTENT__PARENT:
				setParent((Container)null);
				return;
			case TaskPackage.CONTENT__TASK_MODEL:
				setTaskModel((TaskModel)null);
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
			case TaskPackage.CONTENT__INTEND:
				return intend != null && !intend.isEmpty();
			case TaskPackage.CONTENT__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case TaskPackage.CONTENT__PARENT:
				return parent != null;
			case TaskPackage.CONTENT__TASK_MODEL:
				return getTaskModel() != null;
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
