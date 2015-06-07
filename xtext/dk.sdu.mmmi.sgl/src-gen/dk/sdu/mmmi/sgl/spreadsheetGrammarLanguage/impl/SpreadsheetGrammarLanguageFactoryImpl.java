/**
 */
package dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl;

import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.*;

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
public class SpreadsheetGrammarLanguageFactoryImpl extends EFactoryImpl implements SpreadsheetGrammarLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SpreadsheetGrammarLanguageFactory init()
  {
    try
    {
      SpreadsheetGrammarLanguageFactory theSpreadsheetGrammarLanguageFactory = (SpreadsheetGrammarLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(SpreadsheetGrammarLanguagePackage.eNS_URI);
      if (theSpreadsheetGrammarLanguageFactory != null)
      {
        return theSpreadsheetGrammarLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SpreadsheetGrammarLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpreadsheetGrammarLanguageFactoryImpl()
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
      case SpreadsheetGrammarLanguagePackage.GRAMMAR: return createGrammar();
      case SpreadsheetGrammarLanguagePackage.ELEMENT: return createElement();
      case SpreadsheetGrammarLanguagePackage.BLOCK: return createBlock();
      case SpreadsheetGrammarLanguagePackage.COLUMN: return createColumn();
      case SpreadsheetGrammarLanguagePackage.COLUMN_DEFINITION: return createColumnDefinition();
      case SpreadsheetGrammarLanguagePackage.MANDATORY_COLUMN: return createMandatoryColumn();
      case SpreadsheetGrammarLanguagePackage.OPTIONAL_COLUMN: return createOptionalColumn();
      case SpreadsheetGrammarLanguagePackage.COLUMN_SPEC: return createColumnSpec();
      case SpreadsheetGrammarLanguagePackage.ROW_SPEC: return createRowSpec();
      case SpreadsheetGrammarLanguagePackage.BLOCK_SPEC: return createBlockSpec();
      case SpreadsheetGrammarLanguagePackage.SYNTAX: return createSyntax();
      case SpreadsheetGrammarLanguagePackage.RULE: return createRule();
      case SpreadsheetGrammarLanguagePackage.SYNTAX_SEQ: return createSyntaxSeq();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Grammar createGrammar()
  {
    GrammarImpl grammar = new GrammarImpl();
    return grammar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Column createColumn()
  {
    ColumnImpl column = new ColumnImpl();
    return column;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnDefinition createColumnDefinition()
  {
    ColumnDefinitionImpl columnDefinition = new ColumnDefinitionImpl();
    return columnDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MandatoryColumn createMandatoryColumn()
  {
    MandatoryColumnImpl mandatoryColumn = new MandatoryColumnImpl();
    return mandatoryColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptionalColumn createOptionalColumn()
  {
    OptionalColumnImpl optionalColumn = new OptionalColumnImpl();
    return optionalColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnSpec createColumnSpec()
  {
    ColumnSpecImpl columnSpec = new ColumnSpecImpl();
    return columnSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RowSpec createRowSpec()
  {
    RowSpecImpl rowSpec = new RowSpecImpl();
    return rowSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockSpec createBlockSpec()
  {
    BlockSpecImpl blockSpec = new BlockSpecImpl();
    return blockSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Syntax createSyntax()
  {
    SyntaxImpl syntax = new SyntaxImpl();
    return syntax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SyntaxSeq createSyntaxSeq()
  {
    SyntaxSeqImpl syntaxSeq = new SyntaxSeqImpl();
    return syntaxSeq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpreadsheetGrammarLanguagePackage getSpreadsheetGrammarLanguagePackage()
  {
    return (SpreadsheetGrammarLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SpreadsheetGrammarLanguagePackage getPackage()
  {
    return SpreadsheetGrammarLanguagePackage.eINSTANCE;
  }

} //SpreadsheetGrammarLanguageFactoryImpl
