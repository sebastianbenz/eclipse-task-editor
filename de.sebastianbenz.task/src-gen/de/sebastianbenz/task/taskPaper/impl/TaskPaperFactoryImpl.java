/**
 * <copyright>
 * </copyright>
 *
 */
package de.sebastianbenz.task.taskPaper.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.sebastianbenz.task.taskPaper.Content;
import de.sebastianbenz.task.taskPaper.Note;
import de.sebastianbenz.task.taskPaper.Project;
import de.sebastianbenz.task.taskPaper.Task;
import de.sebastianbenz.task.taskPaper.TaskPaperFactory;
import de.sebastianbenz.task.taskPaper.TaskPaperPackage;
import de.sebastianbenz.task.taskPaper.Todo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskPaperFactoryImpl extends EFactoryImpl implements TaskPaperFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TaskPaperFactory init()
  {
    try
    {
      TaskPaperFactory theTaskPaperFactory = (TaskPaperFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sebastianbenz.de/task/TaskPaper"); 
      if (theTaskPaperFactory != null)
      {
        return theTaskPaperFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TaskPaperFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskPaperFactoryImpl()
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
      case TaskPaperPackage.TODO: return createTodo();
      case TaskPaperPackage.CONTENT: return createContent();
      case TaskPaperPackage.TASK: return createTask();
      case TaskPaperPackage.NOTE: return createNote();
      case TaskPaperPackage.PROJECT: return createProject();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Todo createTodo()
  {
    TodoImpl todo = new TodoImpl();
    return todo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Content createContent()
  {
    ContentImpl content = new ContentImpl();
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task createTask()
  {
    TaskImpl task = new TaskImpl();
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Note createNote()
  {
    NoteImpl note = new NoteImpl();
    return note;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Project createProject()
  {
    ProjectImpl project = new ProjectImpl();
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskPaperPackage getTaskPaperPackage()
  {
    return (TaskPaperPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TaskPaperPackage getPackage()
  {
    return TaskPaperPackage.eINSTANCE;
  }

} //TaskPaperFactoryImpl
