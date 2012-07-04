/**
 */
package de.sebastianbenz.task.query;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see de.sebastianbenz.task.query.QueryFactory
 * @model kind="package"
 * @generated
 */
public interface QueryPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "query";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sebastianbenz.de/task/query/2011/";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "query";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  QueryPackage eINSTANCE = de.sebastianbenz.task.query.impl.QueryPackageImpl.init();

  /**
   * The meta object id for the '{@link de.sebastianbenz.task.query.impl.QueryImpl <em>Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.task.query.impl.QueryImpl
   * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getQuery()
   * @generated
   */
  int QUERY = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.sebastianbenz.task.query.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.task.query.impl.ExpressionImpl
   * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sebastianbenz.task.query.impl.AtomImpl <em>Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.task.query.impl.AtomImpl
   * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getAtom()
   * @generated
   */
  int ATOM = 2;

  /**
   * The number of structural features of the '<em>Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sebastianbenz.task.query.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.task.query.impl.ValueImpl
   * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getValue()
   * @generated
   */
  int VALUE = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__VALUE = ATOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = ATOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sebastianbenz.task.query.impl.ParenExprImpl <em>Paren Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.task.query.impl.ParenExprImpl
   * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getParenExpr()
   * @generated
   */
  int PAREN_EXPR = 4;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAREN_EXPR__EXPR = ATOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Paren Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAREN_EXPR_FEATURE_COUNT = ATOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sebastianbenz.task.query.impl.ProjectReferenceImpl <em>Project Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.task.query.impl.ProjectReferenceImpl
   * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getProjectReference()
   * @generated
   */
  int PROJECT_REFERENCE = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_REFERENCE__VALUE = VALUE__VALUE;

  /**
   * The number of structural features of the '<em>Project Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_REFERENCE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sebastianbenz.task.query.impl.TaskReferenceImpl <em>Task Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.task.query.impl.TaskReferenceImpl
   * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getTaskReference()
   * @generated
   */
  int TASK_REFERENCE = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_REFERENCE__VALUE = VALUE__VALUE;

  /**
   * The number of structural features of the '<em>Task Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_REFERENCE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sebastianbenz.task.query.impl.TextReferenceImpl <em>Text Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.task.query.impl.TextReferenceImpl
   * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getTextReference()
   * @generated
   */
  int TEXT_REFERENCE = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_REFERENCE__VALUE = VALUE__VALUE;

  /**
   * The number of structural features of the '<em>Text Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_REFERENCE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sebastianbenz.task.query.impl.WordsImpl <em>Words</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.task.query.impl.WordsImpl
   * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getWords()
   * @generated
   */
  int WORDS = 8;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORDS__VALUES = ATOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Words</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORDS_FEATURE_COUNT = ATOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sebastianbenz.task.query.impl.WordImpl <em>Word</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.task.query.impl.WordImpl
   * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getWord()
   * @generated
   */
  int WORD = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORD__VALUE = VALUE__VALUE;

  /**
   * The number of structural features of the '<em>Word</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORD_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sebastianbenz.task.query.impl.PhraseImpl <em>Phrase</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.task.query.impl.PhraseImpl
   * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getPhrase()
   * @generated
   */
  int PHRASE = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHRASE__VALUE = VALUE__VALUE;

  /**
   * The number of structural features of the '<em>Phrase</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHRASE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sebastianbenz.task.query.impl.TagReferenceImpl <em>Tag Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.task.query.impl.TagReferenceImpl
   * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getTagReference()
   * @generated
   */
  int TAG_REFERENCE = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_REFERENCE__VALUE = VALUE__VALUE;

  /**
   * The number of structural features of the '<em>Tag Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_REFERENCE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sebastianbenz.task.query.impl.OrExprImpl <em>Or Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.task.query.impl.OrExprImpl
   * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getOrExpr()
   * @generated
   */
  int OR_EXPR = 12;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sebastianbenz.task.query.impl.AndExprImpl <em>And Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.task.query.impl.AndExprImpl
   * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getAndExpr()
   * @generated
   */
  int AND_EXPR = 13;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sebastianbenz.task.query.impl.CompEqExprImpl <em>Comp Eq Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.task.query.impl.CompEqExprImpl
   * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getCompEqExpr()
   * @generated
   */
  int COMP_EQ_EXPR = 14;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMP_EQ_EXPR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMP_EQ_EXPR__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMP_EQ_EXPR__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Comp Eq Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMP_EQ_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.sebastianbenz.task.query.impl.CompExprImpl <em>Comp Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.task.query.impl.CompExprImpl
   * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getCompExpr()
   * @generated
   */
  int COMP_EXPR = 15;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMP_EXPR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMP_EXPR__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMP_EXPR__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Comp Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMP_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.sebastianbenz.task.query.impl.UnaryExprImpl <em>Unary Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.task.query.impl.UnaryExprImpl
   * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getUnaryExpr()
   * @generated
   */
  int UNARY_EXPR = 16;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPR__EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Unary Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sebastianbenz.task.query.CompEqOperator <em>Comp Eq Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.task.query.CompEqOperator
   * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getCompEqOperator()
   * @generated
   */
  int COMP_EQ_OPERATOR = 17;

  /**
   * The meta object id for the '{@link de.sebastianbenz.task.query.CompOperator <em>Comp Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.task.query.CompOperator
   * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getCompOperator()
   * @generated
   */
  int COMP_OPERATOR = 18;


  /**
   * Returns the meta object for class '{@link de.sebastianbenz.task.query.Query <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query</em>'.
   * @see de.sebastianbenz.task.query.Query
   * @generated
   */
  EClass getQuery();

  /**
   * Returns the meta object for the containment reference '{@link de.sebastianbenz.task.query.Query#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.sebastianbenz.task.query.Query#getExpression()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_Expression();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.task.query.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see de.sebastianbenz.task.query.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.task.query.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atom</em>'.
   * @see de.sebastianbenz.task.query.Atom
   * @generated
   */
  EClass getAtom();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.task.query.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see de.sebastianbenz.task.query.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for the attribute '{@link de.sebastianbenz.task.query.Value#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.sebastianbenz.task.query.Value#getValue()
   * @see #getValue()
   * @generated
   */
  EAttribute getValue_Value();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.task.query.ParenExpr <em>Paren Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Paren Expr</em>'.
   * @see de.sebastianbenz.task.query.ParenExpr
   * @generated
   */
  EClass getParenExpr();

  /**
   * Returns the meta object for the containment reference '{@link de.sebastianbenz.task.query.ParenExpr#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.sebastianbenz.task.query.ParenExpr#getExpr()
   * @see #getParenExpr()
   * @generated
   */
  EReference getParenExpr_Expr();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.task.query.ProjectReference <em>Project Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project Reference</em>'.
   * @see de.sebastianbenz.task.query.ProjectReference
   * @generated
   */
  EClass getProjectReference();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.task.query.TaskReference <em>Task Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Reference</em>'.
   * @see de.sebastianbenz.task.query.TaskReference
   * @generated
   */
  EClass getTaskReference();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.task.query.TextReference <em>Text Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Reference</em>'.
   * @see de.sebastianbenz.task.query.TextReference
   * @generated
   */
  EClass getTextReference();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.task.query.Words <em>Words</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Words</em>'.
   * @see de.sebastianbenz.task.query.Words
   * @generated
   */
  EClass getWords();

  /**
   * Returns the meta object for the attribute list '{@link de.sebastianbenz.task.query.Words#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see de.sebastianbenz.task.query.Words#getValues()
   * @see #getWords()
   * @generated
   */
  EAttribute getWords_Values();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.task.query.Word <em>Word</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Word</em>'.
   * @see de.sebastianbenz.task.query.Word
   * @generated
   */
  EClass getWord();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.task.query.Phrase <em>Phrase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Phrase</em>'.
   * @see de.sebastianbenz.task.query.Phrase
   * @generated
   */
  EClass getPhrase();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.task.query.TagReference <em>Tag Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tag Reference</em>'.
   * @see de.sebastianbenz.task.query.TagReference
   * @generated
   */
  EClass getTagReference();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.task.query.OrExpr <em>Or Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Expr</em>'.
   * @see de.sebastianbenz.task.query.OrExpr
   * @generated
   */
  EClass getOrExpr();

  /**
   * Returns the meta object for the containment reference '{@link de.sebastianbenz.task.query.OrExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.sebastianbenz.task.query.OrExpr#getLeft()
   * @see #getOrExpr()
   * @generated
   */
  EReference getOrExpr_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.sebastianbenz.task.query.OrExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.sebastianbenz.task.query.OrExpr#getRight()
   * @see #getOrExpr()
   * @generated
   */
  EReference getOrExpr_Right();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.task.query.AndExpr <em>And Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expr</em>'.
   * @see de.sebastianbenz.task.query.AndExpr
   * @generated
   */
  EClass getAndExpr();

  /**
   * Returns the meta object for the containment reference '{@link de.sebastianbenz.task.query.AndExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.sebastianbenz.task.query.AndExpr#getLeft()
   * @see #getAndExpr()
   * @generated
   */
  EReference getAndExpr_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.sebastianbenz.task.query.AndExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.sebastianbenz.task.query.AndExpr#getRight()
   * @see #getAndExpr()
   * @generated
   */
  EReference getAndExpr_Right();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.task.query.CompEqExpr <em>Comp Eq Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comp Eq Expr</em>'.
   * @see de.sebastianbenz.task.query.CompEqExpr
   * @generated
   */
  EClass getCompEqExpr();

  /**
   * Returns the meta object for the containment reference '{@link de.sebastianbenz.task.query.CompEqExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.sebastianbenz.task.query.CompEqExpr#getLeft()
   * @see #getCompEqExpr()
   * @generated
   */
  EReference getCompEqExpr_Left();

  /**
   * Returns the meta object for the attribute '{@link de.sebastianbenz.task.query.CompEqExpr#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see de.sebastianbenz.task.query.CompEqExpr#getOperator()
   * @see #getCompEqExpr()
   * @generated
   */
  EAttribute getCompEqExpr_Operator();

  /**
   * Returns the meta object for the containment reference '{@link de.sebastianbenz.task.query.CompEqExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.sebastianbenz.task.query.CompEqExpr#getRight()
   * @see #getCompEqExpr()
   * @generated
   */
  EReference getCompEqExpr_Right();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.task.query.CompExpr <em>Comp Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comp Expr</em>'.
   * @see de.sebastianbenz.task.query.CompExpr
   * @generated
   */
  EClass getCompExpr();

  /**
   * Returns the meta object for the containment reference '{@link de.sebastianbenz.task.query.CompExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.sebastianbenz.task.query.CompExpr#getLeft()
   * @see #getCompExpr()
   * @generated
   */
  EReference getCompExpr_Left();

  /**
   * Returns the meta object for the attribute '{@link de.sebastianbenz.task.query.CompExpr#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see de.sebastianbenz.task.query.CompExpr#getOperator()
   * @see #getCompExpr()
   * @generated
   */
  EAttribute getCompExpr_Operator();

  /**
   * Returns the meta object for the containment reference '{@link de.sebastianbenz.task.query.CompExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.sebastianbenz.task.query.CompExpr#getRight()
   * @see #getCompExpr()
   * @generated
   */
  EReference getCompExpr_Right();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.task.query.UnaryExpr <em>Unary Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expr</em>'.
   * @see de.sebastianbenz.task.query.UnaryExpr
   * @generated
   */
  EClass getUnaryExpr();

  /**
   * Returns the meta object for the containment reference '{@link de.sebastianbenz.task.query.UnaryExpr#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.sebastianbenz.task.query.UnaryExpr#getExpr()
   * @see #getUnaryExpr()
   * @generated
   */
  EReference getUnaryExpr_Expr();

  /**
   * Returns the meta object for enum '{@link de.sebastianbenz.task.query.CompEqOperator <em>Comp Eq Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Comp Eq Operator</em>'.
   * @see de.sebastianbenz.task.query.CompEqOperator
   * @generated
   */
  EEnum getCompEqOperator();

  /**
   * Returns the meta object for enum '{@link de.sebastianbenz.task.query.CompOperator <em>Comp Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Comp Operator</em>'.
   * @see de.sebastianbenz.task.query.CompOperator
   * @generated
   */
  EEnum getCompOperator();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  QueryFactory getQueryFactory();

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
     * The meta object literal for the '{@link de.sebastianbenz.task.query.impl.QueryImpl <em>Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.task.query.impl.QueryImpl
     * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getQuery()
     * @generated
     */
    EClass QUERY = eINSTANCE.getQuery();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__EXPRESSION = eINSTANCE.getQuery_Expression();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.task.query.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.task.query.impl.ExpressionImpl
     * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.task.query.impl.AtomImpl <em>Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.task.query.impl.AtomImpl
     * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getAtom()
     * @generated
     */
    EClass ATOM = eINSTANCE.getAtom();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.task.query.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.task.query.impl.ValueImpl
     * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE__VALUE = eINSTANCE.getValue_Value();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.task.query.impl.ParenExprImpl <em>Paren Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.task.query.impl.ParenExprImpl
     * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getParenExpr()
     * @generated
     */
    EClass PAREN_EXPR = eINSTANCE.getParenExpr();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAREN_EXPR__EXPR = eINSTANCE.getParenExpr_Expr();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.task.query.impl.ProjectReferenceImpl <em>Project Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.task.query.impl.ProjectReferenceImpl
     * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getProjectReference()
     * @generated
     */
    EClass PROJECT_REFERENCE = eINSTANCE.getProjectReference();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.task.query.impl.TaskReferenceImpl <em>Task Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.task.query.impl.TaskReferenceImpl
     * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getTaskReference()
     * @generated
     */
    EClass TASK_REFERENCE = eINSTANCE.getTaskReference();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.task.query.impl.TextReferenceImpl <em>Text Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.task.query.impl.TextReferenceImpl
     * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getTextReference()
     * @generated
     */
    EClass TEXT_REFERENCE = eINSTANCE.getTextReference();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.task.query.impl.WordsImpl <em>Words</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.task.query.impl.WordsImpl
     * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getWords()
     * @generated
     */
    EClass WORDS = eINSTANCE.getWords();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORDS__VALUES = eINSTANCE.getWords_Values();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.task.query.impl.WordImpl <em>Word</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.task.query.impl.WordImpl
     * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getWord()
     * @generated
     */
    EClass WORD = eINSTANCE.getWord();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.task.query.impl.PhraseImpl <em>Phrase</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.task.query.impl.PhraseImpl
     * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getPhrase()
     * @generated
     */
    EClass PHRASE = eINSTANCE.getPhrase();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.task.query.impl.TagReferenceImpl <em>Tag Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.task.query.impl.TagReferenceImpl
     * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getTagReference()
     * @generated
     */
    EClass TAG_REFERENCE = eINSTANCE.getTagReference();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.task.query.impl.OrExprImpl <em>Or Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.task.query.impl.OrExprImpl
     * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getOrExpr()
     * @generated
     */
    EClass OR_EXPR = eINSTANCE.getOrExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPR__LEFT = eINSTANCE.getOrExpr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPR__RIGHT = eINSTANCE.getOrExpr_Right();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.task.query.impl.AndExprImpl <em>And Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.task.query.impl.AndExprImpl
     * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getAndExpr()
     * @generated
     */
    EClass AND_EXPR = eINSTANCE.getAndExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPR__LEFT = eINSTANCE.getAndExpr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPR__RIGHT = eINSTANCE.getAndExpr_Right();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.task.query.impl.CompEqExprImpl <em>Comp Eq Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.task.query.impl.CompEqExprImpl
     * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getCompEqExpr()
     * @generated
     */
    EClass COMP_EQ_EXPR = eINSTANCE.getCompEqExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMP_EQ_EXPR__LEFT = eINSTANCE.getCompEqExpr_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMP_EQ_EXPR__OPERATOR = eINSTANCE.getCompEqExpr_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMP_EQ_EXPR__RIGHT = eINSTANCE.getCompEqExpr_Right();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.task.query.impl.CompExprImpl <em>Comp Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.task.query.impl.CompExprImpl
     * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getCompExpr()
     * @generated
     */
    EClass COMP_EXPR = eINSTANCE.getCompExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMP_EXPR__LEFT = eINSTANCE.getCompExpr_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMP_EXPR__OPERATOR = eINSTANCE.getCompExpr_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMP_EXPR__RIGHT = eINSTANCE.getCompExpr_Right();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.task.query.impl.UnaryExprImpl <em>Unary Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.task.query.impl.UnaryExprImpl
     * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getUnaryExpr()
     * @generated
     */
    EClass UNARY_EXPR = eINSTANCE.getUnaryExpr();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPR__EXPR = eINSTANCE.getUnaryExpr_Expr();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.task.query.CompEqOperator <em>Comp Eq Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.task.query.CompEqOperator
     * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getCompEqOperator()
     * @generated
     */
    EEnum COMP_EQ_OPERATOR = eINSTANCE.getCompEqOperator();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.task.query.CompOperator <em>Comp Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.task.query.CompOperator
     * @see de.sebastianbenz.task.query.impl.QueryPackageImpl#getCompOperator()
     * @generated
     */
    EEnum COMP_OPERATOR = eINSTANCE.getCompOperator();

  }

} //QueryPackage
