/**
 */
package dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage;

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
 * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SpreadsheetGrammarLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface SpreadsheetGrammarLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "spreadsheetGrammarLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sdu.dk/mmmi/sgl/SpreadsheetGrammarLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "spreadsheetGrammarLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SpreadsheetGrammarLanguagePackage eINSTANCE = dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.GrammarImpl <em>Grammar</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.GrammarImpl
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguagePackageImpl#getGrammar()
   * @generated
   */
  int GRAMMAR = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAMMAR__NAME = 0;

  /**
   * The feature id for the '<em><b>Root</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAMMAR__ROOT = 1;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAMMAR__ELEMENTS = 2;

  /**
   * The number of structural features of the '<em>Grammar</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAMMAR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.ElementImpl
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguagePackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.BlockImpl
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguagePackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__COLUMNS = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.ColumnImpl <em>Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.ColumnImpl
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguagePackageImpl#getColumn()
   * @generated
   */
  int COLUMN = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__NAME = 0;

  /**
   * The feature id for the '<em><b>Multiple</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__MULTIPLE = 1;

  /**
   * The feature id for the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__DEF = 2;

  /**
   * The number of structural features of the '<em>Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.ColumnDefinitionImpl <em>Column Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.ColumnDefinitionImpl
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguagePackageImpl#getColumnDefinition()
   * @generated
   */
  int COLUMN_DEFINITION = 4;

  /**
   * The feature id for the '<em><b>Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_DEFINITION__SPEC = 0;

  /**
   * The number of structural features of the '<em>Column Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.MandatoryColumnImpl <em>Mandatory Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.MandatoryColumnImpl
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguagePackageImpl#getMandatoryColumn()
   * @generated
   */
  int MANDATORY_COLUMN = 5;

  /**
   * The feature id for the '<em><b>Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_COLUMN__SPEC = COLUMN_DEFINITION__SPEC;

  /**
   * The number of structural features of the '<em>Mandatory Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_COLUMN_FEATURE_COUNT = COLUMN_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.OptionalColumnImpl <em>Optional Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.OptionalColumnImpl
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguagePackageImpl#getOptionalColumn()
   * @generated
   */
  int OPTIONAL_COLUMN = 6;

  /**
   * The feature id for the '<em><b>Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_COLUMN__SPEC = COLUMN_DEFINITION__SPEC;

  /**
   * The number of structural features of the '<em>Optional Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_COLUMN_FEATURE_COUNT = COLUMN_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.ColumnSpecImpl <em>Column Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.ColumnSpecImpl
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguagePackageImpl#getColumnSpec()
   * @generated
   */
  int COLUMN_SPEC = 7;

  /**
   * The number of structural features of the '<em>Column Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_SPEC_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.RowSpecImpl <em>Row Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.RowSpecImpl
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguagePackageImpl#getRowSpec()
   * @generated
   */
  int ROW_SPEC = 8;

  /**
   * The feature id for the '<em><b>Header</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW_SPEC__HEADER = COLUMN_SPEC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Syntax</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW_SPEC__SYNTAX = COLUMN_SPEC_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Row Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW_SPEC_FEATURE_COUNT = COLUMN_SPEC_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.BlockSpecImpl <em>Block Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.BlockSpecImpl
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguagePackageImpl#getBlockSpec()
   * @generated
   */
  int BLOCK_SPEC = 9;

  /**
   * The feature id for the '<em><b>Kind</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_SPEC__KIND = COLUMN_SPEC_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Block Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_SPEC_FEATURE_COUNT = COLUMN_SPEC_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SyntaxImpl <em>Syntax</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SyntaxImpl
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguagePackageImpl#getSyntax()
   * @generated
   */
  int SYNTAX = 10;

  /**
   * The feature id for the '<em><b>Is id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNTAX__IS_ID = 0;

  /**
   * The feature id for the '<em><b>Is string</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNTAX__IS_STRING = 1;

  /**
   * The feature id for the '<em><b>Is int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNTAX__IS_INT = 2;

  /**
   * The feature id for the '<em><b>Token</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNTAX__TOKEN = 3;

  /**
   * The feature id for the '<em><b>Rule</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNTAX__RULE = 4;

  /**
   * The number of structural features of the '<em>Syntax</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNTAX_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.RuleImpl
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguagePackageImpl#getRule()
   * @generated
   */
  int RULE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Alternatives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__ALTERNATIVES = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SyntaxSeqImpl <em>Syntax Seq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SyntaxSeqImpl
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguagePackageImpl#getSyntaxSeq()
   * @generated
   */
  int SYNTAX_SEQ = 12;

  /**
   * The feature id for the '<em><b>Parts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNTAX_SEQ__PARTS = 0;

  /**
   * The number of structural features of the '<em>Syntax Seq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNTAX_SEQ_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Grammar <em>Grammar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Grammar</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Grammar
   * @generated
   */
  EClass getGrammar();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Grammar#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Grammar#getName()
   * @see #getGrammar()
   * @generated
   */
  EAttribute getGrammar_Name();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Grammar#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Root</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Grammar#getRoot()
   * @see #getGrammar()
   * @generated
   */
  EReference getGrammar_Root();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Grammar#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Grammar#getElements()
   * @see #getGrammar()
   * @generated
   */
  EReference getGrammar_Elements();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Element#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Element#getName()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Name();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Block#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Columns</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Block#getColumns()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Columns();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Column <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Column
   * @generated
   */
  EClass getColumn();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Column#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Column#getName()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Name();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Column#isMultiple <em>Multiple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiple</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Column#isMultiple()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Multiple();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Column#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Def</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Column#getDef()
   * @see #getColumn()
   * @generated
   */
  EReference getColumn_Def();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.ColumnDefinition <em>Column Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Definition</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.ColumnDefinition
   * @generated
   */
  EClass getColumnDefinition();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.ColumnDefinition#getSpec <em>Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Spec</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.ColumnDefinition#getSpec()
   * @see #getColumnDefinition()
   * @generated
   */
  EReference getColumnDefinition_Spec();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.MandatoryColumn <em>Mandatory Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mandatory Column</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.MandatoryColumn
   * @generated
   */
  EClass getMandatoryColumn();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.OptionalColumn <em>Optional Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Optional Column</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.OptionalColumn
   * @generated
   */
  EClass getOptionalColumn();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.ColumnSpec <em>Column Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Spec</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.ColumnSpec
   * @generated
   */
  EClass getColumnSpec();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.RowSpec <em>Row Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Row Spec</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.RowSpec
   * @generated
   */
  EClass getRowSpec();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.RowSpec#getHeader <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Header</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.RowSpec#getHeader()
   * @see #getRowSpec()
   * @generated
   */
  EAttribute getRowSpec_Header();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.RowSpec#getSyntax <em>Syntax</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Syntax</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.RowSpec#getSyntax()
   * @see #getRowSpec()
   * @generated
   */
  EReference getRowSpec_Syntax();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.BlockSpec <em>Block Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Spec</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.BlockSpec
   * @generated
   */
  EClass getBlockSpec();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.BlockSpec#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Kind</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.BlockSpec#getKind()
   * @see #getBlockSpec()
   * @generated
   */
  EReference getBlockSpec_Kind();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax <em>Syntax</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Syntax</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax
   * @generated
   */
  EClass getSyntax();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax#isIs_id <em>Is id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is id</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax#isIs_id()
   * @see #getSyntax()
   * @generated
   */
  EAttribute getSyntax_Is_id();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax#isIs_string <em>Is string</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is string</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax#isIs_string()
   * @see #getSyntax()
   * @generated
   */
  EAttribute getSyntax_Is_string();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax#isIs_int <em>Is int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is int</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax#isIs_int()
   * @see #getSyntax()
   * @generated
   */
  EAttribute getSyntax_Is_int();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax#getToken <em>Token</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Token</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax#getToken()
   * @see #getSyntax()
   * @generated
   */
  EAttribute getSyntax_Token();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rule</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax#getRule()
   * @see #getSyntax()
   * @generated
   */
  EReference getSyntax_Rule();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Rule#getAlternatives <em>Alternatives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Alternatives</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Rule#getAlternatives()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Alternatives();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SyntaxSeq <em>Syntax Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Syntax Seq</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SyntaxSeq
   * @generated
   */
  EClass getSyntaxSeq();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SyntaxSeq#getParts <em>Parts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parts</em>'.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SyntaxSeq#getParts()
   * @see #getSyntaxSeq()
   * @generated
   */
  EReference getSyntaxSeq_Parts();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SpreadsheetGrammarLanguageFactory getSpreadsheetGrammarLanguageFactory();

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
     * The meta object literal for the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.GrammarImpl <em>Grammar</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.GrammarImpl
     * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguagePackageImpl#getGrammar()
     * @generated
     */
    EClass GRAMMAR = eINSTANCE.getGrammar();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRAMMAR__NAME = eINSTANCE.getGrammar_Name();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAMMAR__ROOT = eINSTANCE.getGrammar_Root();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAMMAR__ELEMENTS = eINSTANCE.getGrammar_Elements();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.ElementImpl
     * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguagePackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.BlockImpl
     * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguagePackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__COLUMNS = eINSTANCE.getBlock_Columns();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.ColumnImpl <em>Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.ColumnImpl
     * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguagePackageImpl#getColumn()
     * @generated
     */
    EClass COLUMN = eINSTANCE.getColumn();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

    /**
     * The meta object literal for the '<em><b>Multiple</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN__MULTIPLE = eINSTANCE.getColumn_Multiple();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLUMN__DEF = eINSTANCE.getColumn_Def();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.ColumnDefinitionImpl <em>Column Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.ColumnDefinitionImpl
     * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguagePackageImpl#getColumnDefinition()
     * @generated
     */
    EClass COLUMN_DEFINITION = eINSTANCE.getColumnDefinition();

    /**
     * The meta object literal for the '<em><b>Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLUMN_DEFINITION__SPEC = eINSTANCE.getColumnDefinition_Spec();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.MandatoryColumnImpl <em>Mandatory Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.MandatoryColumnImpl
     * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguagePackageImpl#getMandatoryColumn()
     * @generated
     */
    EClass MANDATORY_COLUMN = eINSTANCE.getMandatoryColumn();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.OptionalColumnImpl <em>Optional Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.OptionalColumnImpl
     * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguagePackageImpl#getOptionalColumn()
     * @generated
     */
    EClass OPTIONAL_COLUMN = eINSTANCE.getOptionalColumn();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.ColumnSpecImpl <em>Column Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.ColumnSpecImpl
     * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguagePackageImpl#getColumnSpec()
     * @generated
     */
    EClass COLUMN_SPEC = eINSTANCE.getColumnSpec();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.RowSpecImpl <em>Row Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.RowSpecImpl
     * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguagePackageImpl#getRowSpec()
     * @generated
     */
    EClass ROW_SPEC = eINSTANCE.getRowSpec();

    /**
     * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROW_SPEC__HEADER = eINSTANCE.getRowSpec_Header();

    /**
     * The meta object literal for the '<em><b>Syntax</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROW_SPEC__SYNTAX = eINSTANCE.getRowSpec_Syntax();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.BlockSpecImpl <em>Block Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.BlockSpecImpl
     * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguagePackageImpl#getBlockSpec()
     * @generated
     */
    EClass BLOCK_SPEC = eINSTANCE.getBlockSpec();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK_SPEC__KIND = eINSTANCE.getBlockSpec_Kind();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SyntaxImpl <em>Syntax</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SyntaxImpl
     * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguagePackageImpl#getSyntax()
     * @generated
     */
    EClass SYNTAX = eINSTANCE.getSyntax();

    /**
     * The meta object literal for the '<em><b>Is id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYNTAX__IS_ID = eINSTANCE.getSyntax_Is_id();

    /**
     * The meta object literal for the '<em><b>Is string</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYNTAX__IS_STRING = eINSTANCE.getSyntax_Is_string();

    /**
     * The meta object literal for the '<em><b>Is int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYNTAX__IS_INT = eINSTANCE.getSyntax_Is_int();

    /**
     * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYNTAX__TOKEN = eINSTANCE.getSyntax_Token();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYNTAX__RULE = eINSTANCE.getSyntax_Rule();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.RuleImpl
     * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguagePackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>Alternatives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__ALTERNATIVES = eINSTANCE.getRule_Alternatives();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SyntaxSeqImpl <em>Syntax Seq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SyntaxSeqImpl
     * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguagePackageImpl#getSyntaxSeq()
     * @generated
     */
    EClass SYNTAX_SEQ = eINSTANCE.getSyntaxSeq();

    /**
     * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYNTAX_SEQ__PARTS = eINSTANCE.getSyntaxSeq_Parts();

  }

} //SpreadsheetGrammarLanguagePackage
