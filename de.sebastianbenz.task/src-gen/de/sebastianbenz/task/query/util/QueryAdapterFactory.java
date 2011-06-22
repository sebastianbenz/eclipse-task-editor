/**
 * <copyright>
 * </copyright>
 *
 */
package de.sebastianbenz.task.query.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import de.sebastianbenz.task.query.AndExpr;
import de.sebastianbenz.task.query.Atom;
import de.sebastianbenz.task.query.CompEqExpr;
import de.sebastianbenz.task.query.CompExpr;
import de.sebastianbenz.task.query.Expression;
import de.sebastianbenz.task.query.OrExpr;
import de.sebastianbenz.task.query.ParenExpr;
import de.sebastianbenz.task.query.Phrase;
import de.sebastianbenz.task.query.ProjectReference;
import de.sebastianbenz.task.query.Query;
import de.sebastianbenz.task.query.QueryPackage;
import de.sebastianbenz.task.query.TagReference;
import de.sebastianbenz.task.query.TaskReference;
import de.sebastianbenz.task.query.TextReference;
import de.sebastianbenz.task.query.UnaryExpr;
import de.sebastianbenz.task.query.Value;
import de.sebastianbenz.task.query.Word;
import de.sebastianbenz.task.query.Words;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.sebastianbenz.task.query.QueryPackage
 * @generated
 */
public class QueryAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static QueryPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = QueryPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuerySwitch<Adapter> modelSwitch =
    new QuerySwitch<Adapter>()
    {
      @Override
      public Adapter caseQuery(Query object)
      {
        return createQueryAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseAtom(Atom object)
      {
        return createAtomAdapter();
      }
      @Override
      public Adapter caseValue(Value object)
      {
        return createValueAdapter();
      }
      @Override
      public Adapter caseParenExpr(ParenExpr object)
      {
        return createParenExprAdapter();
      }
      @Override
      public Adapter caseProjectReference(ProjectReference object)
      {
        return createProjectReferenceAdapter();
      }
      @Override
      public Adapter caseTaskReference(TaskReference object)
      {
        return createTaskReferenceAdapter();
      }
      @Override
      public Adapter caseTextReference(TextReference object)
      {
        return createTextReferenceAdapter();
      }
      @Override
      public Adapter caseWords(Words object)
      {
        return createWordsAdapter();
      }
      @Override
      public Adapter caseWord(Word object)
      {
        return createWordAdapter();
      }
      @Override
      public Adapter casePhrase(Phrase object)
      {
        return createPhraseAdapter();
      }
      @Override
      public Adapter caseTagReference(TagReference object)
      {
        return createTagReferenceAdapter();
      }
      @Override
      public Adapter caseOrExpr(OrExpr object)
      {
        return createOrExprAdapter();
      }
      @Override
      public Adapter caseAndExpr(AndExpr object)
      {
        return createAndExprAdapter();
      }
      @Override
      public Adapter caseCompEqExpr(CompEqExpr object)
      {
        return createCompEqExprAdapter();
      }
      @Override
      public Adapter caseCompExpr(CompExpr object)
      {
        return createCompExprAdapter();
      }
      @Override
      public Adapter caseUnaryExpr(UnaryExpr object)
      {
        return createUnaryExprAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.task.query.Query <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.task.query.Query
   * @generated
   */
  public Adapter createQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.task.query.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.task.query.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.task.query.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.task.query.Atom
   * @generated
   */
  public Adapter createAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.task.query.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.task.query.Value
   * @generated
   */
  public Adapter createValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.task.query.ParenExpr <em>Paren Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.task.query.ParenExpr
   * @generated
   */
  public Adapter createParenExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.task.query.ProjectReference <em>Project Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.task.query.ProjectReference
   * @generated
   */
  public Adapter createProjectReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.task.query.TaskReference <em>Task Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.task.query.TaskReference
   * @generated
   */
  public Adapter createTaskReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.task.query.TextReference <em>Text Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.task.query.TextReference
   * @generated
   */
  public Adapter createTextReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.task.query.Words <em>Words</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.task.query.Words
   * @generated
   */
  public Adapter createWordsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.task.query.Word <em>Word</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.task.query.Word
   * @generated
   */
  public Adapter createWordAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.task.query.Phrase <em>Phrase</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.task.query.Phrase
   * @generated
   */
  public Adapter createPhraseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.task.query.TagReference <em>Tag Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.task.query.TagReference
   * @generated
   */
  public Adapter createTagReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.task.query.OrExpr <em>Or Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.task.query.OrExpr
   * @generated
   */
  public Adapter createOrExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.task.query.AndExpr <em>And Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.task.query.AndExpr
   * @generated
   */
  public Adapter createAndExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.task.query.CompEqExpr <em>Comp Eq Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.task.query.CompEqExpr
   * @generated
   */
  public Adapter createCompEqExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.task.query.CompExpr <em>Comp Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.task.query.CompExpr
   * @generated
   */
  public Adapter createCompExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.task.query.UnaryExpr <em>Unary Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.task.query.UnaryExpr
   * @generated
   */
  public Adapter createUnaryExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //QueryAdapterFactory
