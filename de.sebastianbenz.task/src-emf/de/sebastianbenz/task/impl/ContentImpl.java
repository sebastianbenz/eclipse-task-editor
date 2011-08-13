/**
 * <copyright>
 * </copyright>
 *

 */
package de.sebastianbenz.task.impl;

import de.sebastianbenz.task.Container;
import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.Image;
import de.sebastianbenz.task.Link;
import de.sebastianbenz.task.Tag;
import de.sebastianbenz.task.TaskModel;
import de.sebastianbenz.task.TaskPackage;
import de.sebastianbenz.task.TextSegment;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link de.sebastianbenz.task.impl.ContentImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link de.sebastianbenz.task.impl.ContentImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link de.sebastianbenz.task.impl.ContentImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link de.sebastianbenz.task.impl.ContentImpl#getImages <em>Images</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ContentImpl extends ContainerImplCustom implements Content
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
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected EList<TextSegment> segments;

	/**
	 * The cached value of the '{@link #getImages() <em>Images</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImages()
	 * @generated
	 * @ordered
	 */
	protected EList<Image> images;

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
	public EList<Tag> getTags()
	{
		if (tags == null)
		{
			tags = new EObjectContainmentEList<Tag>(Tag.class, this, TaskPackage.CONTENT__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks()
	{
		if (links == null)
		{
			links = new EObjectContainmentEList<Link>(Link.class, this, TaskPackage.CONTENT__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextSegment> getSegments()
	{
		if (segments == null)
		{
			segments = new EObjectContainmentEList<TextSegment>(TextSegment.class, this, TaskPackage.CONTENT__SEGMENTS);
		}
		return segments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Image> getImages()
	{
		if (images == null)
		{
			images = new EObjectContainmentEList<Image>(Image.class, this, TaskPackage.CONTENT__IMAGES);
		}
		return images;
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
	public boolean isDone()
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
			case TaskPackage.CONTENT__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
			case TaskPackage.CONTENT__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case TaskPackage.CONTENT__SEGMENTS:
				return ((InternalEList<?>)getSegments()).basicRemove(otherEnd, msgs);
			case TaskPackage.CONTENT__IMAGES:
				return ((InternalEList<?>)getImages()).basicRemove(otherEnd, msgs);
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
			case TaskPackage.CONTENT__TAGS:
				return getTags();
			case TaskPackage.CONTENT__LINKS:
				return getLinks();
			case TaskPackage.CONTENT__SEGMENTS:
				return getSegments();
			case TaskPackage.CONTENT__IMAGES:
				return getImages();
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
			case TaskPackage.CONTENT__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case TaskPackage.CONTENT__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case TaskPackage.CONTENT__SEGMENTS:
				getSegments().clear();
				getSegments().addAll((Collection<? extends TextSegment>)newValue);
				return;
			case TaskPackage.CONTENT__IMAGES:
				getImages().clear();
				getImages().addAll((Collection<? extends Image>)newValue);
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
			case TaskPackage.CONTENT__TAGS:
				getTags().clear();
				return;
			case TaskPackage.CONTENT__LINKS:
				getLinks().clear();
				return;
			case TaskPackage.CONTENT__SEGMENTS:
				getSegments().clear();
				return;
			case TaskPackage.CONTENT__IMAGES:
				getImages().clear();
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
			case TaskPackage.CONTENT__TAGS:
				return tags != null && !tags.isEmpty();
			case TaskPackage.CONTENT__LINKS:
				return links != null && !links.isEmpty();
			case TaskPackage.CONTENT__SEGMENTS:
				return segments != null && !segments.isEmpty();
			case TaskPackage.CONTENT__IMAGES:
				return images != null && !images.isEmpty();
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
