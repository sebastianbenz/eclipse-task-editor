/**
 * <copyright>
 * </copyright>
 *
 */
package de.sebastianbenz.task.taskPaper;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.sebastianbenz.task.taskPaper.TaskPaperFactory
 * @model kind="package"
 * @generated
 */
public interface TaskPaperPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "taskPaper";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sebastianbenz.de/task/TaskPaper";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "taskPaper";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TaskPaperPackage eINSTANCE = de.sebastianbenz.task.taskPaper.impl.TaskPaperPackageImpl.init();

  /**
   * The meta object id for the '{@link de.sebastianbenz.task.taskPaper.impl.TodoImpl <em>Todo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.task.taskPaper.impl.TodoImpl
   * @see de.sebastianbenz.task.taskPaper.impl.TaskPaperPackageImpl#getTodo()
   * @generated
   */
  int TODO = 0;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TODO__CONTENTS = 0;

  /**
   * The number of structural features of the '<em>Todo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TODO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.sebastianbenz.task.taskPaper.impl.ContentImpl <em>Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.task.taskPaper.impl.ContentImpl
   * @see de.sebastianbenz.task.taskPaper.impl.TaskPaperPackageImpl#getContent()
   * @generated
   */
  int CONTENT = 1;

  /**
   * The feature id for the '<em><b>Intend</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT__INTEND = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT__TEXT = 1;

  /**
   * The number of structural features of the '<em>Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.sebastianbenz.task.taskPaper.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.task.taskPaper.impl.TaskImpl
   * @see de.sebastianbenz.task.taskPaper.impl.TaskPaperPackageImpl#getTask()
   * @generated
   */
  int TASK = 2;

  /**
   * The feature id for the '<em><b>Intend</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__INTEND = CONTENT__INTEND;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__TEXT = CONTENT__TEXT;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sebastianbenz.task.taskPaper.impl.NoteImpl <em>Note</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.task.taskPaper.impl.NoteImpl
   * @see de.sebastianbenz.task.taskPaper.impl.TaskPaperPackageImpl#getNote()
   * @generated
   */
  int NOTE = 3;

  /**
   * The feature id for the '<em><b>Intend</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE__INTEND = CONTENT__INTEND;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE__TEXT = CONTENT__TEXT;

  /**
   * The number of structural features of the '<em>Note</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sebastianbenz.task.taskPaper.impl.ProjectImpl <em>Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.task.taskPaper.impl.ProjectImpl
   * @see de.sebastianbenz.task.taskPaper.impl.TaskPaperPackageImpl#getProject()
   * @generated
   */
  int PROJECT = 4;

  /**
   * The feature id for the '<em><b>Intend</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__INTEND = CONTENT__INTEND;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__TEXT = CONTENT__TEXT;

  /**
   * The number of structural features of the '<em>Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link de.sebastianbenz.task.taskPaper.Todo <em>Todo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Todo</em>'.
   * @see de.sebastianbenz.task.taskPaper.Todo
   * @generated
   */
  EClass getTodo();

  /**
   * Returns the meta object for the containment reference list '{@link de.sebastianbenz.task.taskPaper.Todo#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see de.sebastianbenz.task.taskPaper.Todo#getContents()
   * @see #getTodo()
   * @generated
   */
  EReference getTodo_Contents();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.task.taskPaper.Content <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content</em>'.
   * @see de.sebastianbenz.task.taskPaper.Content
   * @generated
   */
  EClass getContent();

  /**
   * Returns the meta object for the attribute list '{@link de.sebastianbenz.task.taskPaper.Content#getIntend <em>Intend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Intend</em>'.
   * @see de.sebastianbenz.task.taskPaper.Content#getIntend()
   * @see #getContent()
   * @generated
   */
  EAttribute getContent_Intend();

  /**
   * Returns the meta object for the attribute '{@link de.sebastianbenz.task.taskPaper.Content#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see de.sebastianbenz.task.taskPaper.Content#getText()
   * @see #getContent()
   * @generated
   */
  EAttribute getContent_Text();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.task.taskPaper.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see de.sebastianbenz.task.taskPaper.Task
   * @generated
   */
  EClass getTask();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.task.taskPaper.Note <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Note</em>'.
   * @see de.sebastianbenz.task.taskPaper.Note
   * @generated
   */
  EClass getNote();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.task.taskPaper.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project</em>'.
   * @see de.sebastianbenz.task.taskPaper.Project
   * @generated
   */
  EClass getProject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TaskPaperFactory getTaskPaperFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.sebastianbenz.task.taskPaper.impl.TodoImpl <em>Todo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.task.taskPaper.impl.TodoImpl
     * @see de.sebastianbenz.task.taskPaper.impl.TaskPaperPackageImpl#getTodo()
     * @generated
     */
    EClass TODO = eINSTANCE.getTodo();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TODO__CONTENTS = eINSTANCE.getTodo_Contents();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.task.taskPaper.impl.ContentImpl <em>Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.task.taskPaper.impl.ContentImpl
     * @see de.sebastianbenz.task.taskPaper.impl.TaskPaperPackageImpl#getContent()
     * @generated
     */
    EClass CONTENT = eINSTANCE.getContent();

    /**
     * The meta object literal for the '<em><b>Intend</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT__INTEND = eINSTANCE.getContent_Intend();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT__TEXT = eINSTANCE.getContent_Text();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.task.taskPaper.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.task.taskPaper.impl.TaskImpl
     * @see de.sebastianbenz.task.taskPaper.impl.TaskPaperPackageImpl#getTask()
     * @generated
     */
    EClass TASK = eINSTANCE.getTask();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.task.taskPaper.impl.NoteImpl <em>Note</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.task.taskPaper.impl.NoteImpl
     * @see de.sebastianbenz.task.taskPaper.impl.TaskPaperPackageImpl#getNote()
     * @generated
     */
    EClass NOTE = eINSTANCE.getNote();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.task.taskPaper.impl.ProjectImpl <em>Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.task.taskPaper.impl.ProjectImpl
     * @see de.sebastianbenz.task.taskPaper.impl.TaskPaperPackageImpl#getProject()
     * @generated
     */
    EClass PROJECT = eINSTANCE.getProject();

  }

} //TaskPaperPackage
