/**
 * <copyright>
 * </copyright>
 *

 */
package de.sebastianbenz.task.query.impl;

import de.sebastianbenz.task.query.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class QueryFactoryImpl extends EFactoryImpl implements QueryFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static QueryFactory init()
  {
    try
    {
      QueryFactory theQueryFactory = (QueryFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sebastianbenz.de/task/query/2011/"); 
      if (theQueryFactory != null)
      {
        return theQueryFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new QueryFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryFactoryImpl()
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
      case QueryPackage.QUERY: return createQuery();
      case QueryPackage.EXPRESSION: return createExpression();
      case QueryPackage.ATOM: return createAtom();
      case QueryPackage.VALUE: return createValue();
      case QueryPackage.PAREN_EXPR: return createParenExpr();
      case QueryPackage.PROJECT_REFERENCE: return createProjectReference();
      case QueryPackage.TASK_REFERENCE: return createTaskReference();
      case QueryPackage.TEXT_REFERENCE: return createTextReference();
      case QueryPackage.WORDS: return createWords();
      case QueryPackage.WORD: return createWord();
      case QueryPackage.PHRASE: return createPhrase();
      case QueryPackage.TAG_REFERENCE: return createTagReference();
      case QueryPackage.OR_EXPR: return createOrExpr();
      case QueryPackage.AND_EXPR: return createAndExpr();
      case QueryPackage.COMP_EQ_EXPR: return createCompEqExpr();
      case QueryPackage.COMP_EXPR: return createCompExpr();
      case QueryPackage.UNARY_EXPR: return createUnaryExpr();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case QueryPackage.COMP_EQ_OPERATOR:
        return createCompEqOperatorFromString(eDataType, initialValue);
      case QueryPackage.COMP_OPERATOR:
        return createCompOperatorFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case QueryPackage.COMP_EQ_OPERATOR:
        return convertCompEqOperatorToString(eDataType, instanceValue);
      case QueryPackage.COMP_OPERATOR:
        return convertCompOperatorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query createQuery()
  {
    QueryImpl query = new QueryImpl();
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atom createAtom()
  {
    AtomImpl atom = new AtomImpl();
    return atom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParenExpr createParenExpr()
  {
    ParenExprImpl parenExpr = new ParenExprImpl();
    return parenExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectReference createProjectReference()
  {
    ProjectReferenceImpl projectReference = new ProjectReferenceImpl();
    return projectReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskReference createTaskReference()
  {
    TaskReferenceImpl taskReference = new TaskReferenceImpl();
    return taskReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextReference createTextReference()
  {
    TextReferenceImpl textReference = new TextReferenceImpl();
    return textReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Words createWords()
  {
    WordsImpl words = new WordsImpl();
    return words;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Word createWord()
  {
    WordImpl word = new WordImpl();
    return word;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Phrase createPhrase()
  {
    PhraseImpl phrase = new PhraseImpl();
    return phrase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TagReference createTagReference()
  {
    TagReferenceImpl tagReference = new TagReferenceImpl();
    return tagReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrExpr createOrExpr()
  {
    OrExprImpl orExpr = new OrExprImpl();
    return orExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndExpr createAndExpr()
  {
    AndExprImpl andExpr = new AndExprImpl();
    return andExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompEqExpr createCompEqExpr()
  {
    CompEqExprImpl compEqExpr = new CompEqExprImpl();
    return compEqExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompExpr createCompExpr()
  {
    CompExprImpl compExpr = new CompExprImpl();
    return compExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpr createUnaryExpr()
  {
    UnaryExprImpl unaryExpr = new UnaryExprImpl();
    return unaryExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompEqOperator createCompEqOperatorFromString(EDataType eDataType, String initialValue)
  {
    CompEqOperator result = CompEqOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCompEqOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompOperator createCompOperatorFromString(EDataType eDataType, String initialValue)
  {
    CompOperator result = CompOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCompOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryPackage getQueryPackage()
  {
    return (QueryPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static QueryPackage getPackage()
  {
    return QueryPackage.eINSTANCE;
  }

} //QueryFactoryImpl
