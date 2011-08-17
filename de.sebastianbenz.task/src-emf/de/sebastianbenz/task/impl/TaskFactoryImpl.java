/**
 * <copyright>
 * </copyright>
 *

 */
package de.sebastianbenz.task.impl;

import de.sebastianbenz.task.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskFactoryImpl extends EFactoryImpl implements TaskFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaskFactory init()
	{
		try
		{
			TaskFactory theTaskFactory = (TaskFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sebastianbenz.de/task/2011/"); 
			if (theTaskFactory != null)
			{
				return theTaskFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TaskFactoryImplCustom();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case TaskPackage.TASK_MODEL: return createTaskModel();
			case TaskPackage.TASK: return createTask();
			case TaskPackage.NOTE: return createNote();
			case TaskPackage.PROJECT: return createProject();
			case TaskPackage.GLOBAL_TASK_MODEL: return createGlobalTaskModel();
			case TaskPackage.EMPTY_LINE: return createEmptyLine();
			case TaskPackage.CODE: return createCode();
			case TaskPackage.TAG: return createTag();
			case TaskPackage.LINK: return createLink();
			case TaskPackage.TEXT: return createText();
			case TaskPackage.IMAGE: return createImage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskModel createTaskModel()
	{
		TaskModelImplCustom taskModel = new TaskModelImplCustom();
		return taskModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask()
	{
		TaskImplCustom task = new TaskImplCustom();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note createNote()
	{
		NoteImplCustom note = new NoteImplCustom();
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject()
	{
		ProjectImplCustom project = new ProjectImplCustom();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalTaskModel createGlobalTaskModel()
	{
		GlobalTaskModelImplCustom globalTaskModel = new GlobalTaskModelImplCustom();
		return globalTaskModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyLine createEmptyLine()
	{
		EmptyLineImplCustom emptyLine = new EmptyLineImplCustom();
		return emptyLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code createCode()
	{
		CodeImplCustom code = new CodeImplCustom();
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag createTag()
	{
		TagImplCustom tag = new TagImplCustom();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink()
	{
		LinkImplCustom link = new LinkImplCustom();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText()
	{
		TextImplCustom text = new TextImplCustom();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage()
	{
		ImageImplCustom image = new ImageImplCustom();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskPackage getTaskPackage()
	{
		return (TaskPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TaskPackage getPackage()
	{
		return TaskPackage.eINSTANCE;
	}

} //TaskFactoryImpl
