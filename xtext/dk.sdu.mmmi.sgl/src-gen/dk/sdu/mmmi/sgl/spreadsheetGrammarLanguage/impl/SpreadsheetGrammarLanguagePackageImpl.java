/**
 */
package dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl;

import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Block;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.BlockSpec;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Column;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.ColumnDefinition;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.ColumnSpec;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Element;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Grammar;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.MandatoryColumn;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.OptionalColumn;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.RowSpec;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Rule;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SpreadsheetGrammarLanguageFactory;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SpreadsheetGrammarLanguagePackage;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SyntaxSeq;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpreadsheetGrammarLanguagePackageImpl extends EPackageImpl implements SpreadsheetGrammarLanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass grammarEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mandatoryColumnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionalColumnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rowSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass syntaxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass syntaxSeqEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SpreadsheetGrammarLanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SpreadsheetGrammarLanguagePackageImpl()
  {
    super(eNS_URI, SpreadsheetGrammarLanguageFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SpreadsheetGrammarLanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SpreadsheetGrammarLanguagePackage init()
  {
    if (isInited) return (SpreadsheetGrammarLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(SpreadsheetGrammarLanguagePackage.eNS_URI);

    // Obtain or create and register package
    SpreadsheetGrammarLanguagePackageImpl theSpreadsheetGrammarLanguagePackage = (SpreadsheetGrammarLanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SpreadsheetGrammarLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SpreadsheetGrammarLanguagePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSpreadsheetGrammarLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theSpreadsheetGrammarLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSpreadsheetGrammarLanguagePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SpreadsheetGrammarLanguagePackage.eNS_URI, theSpreadsheetGrammarLanguagePackage);
    return theSpreadsheetGrammarLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGrammar()
  {
    return grammarEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGrammar_Elements()
  {
    return (EReference)grammarEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElement()
  {
    return elementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElement_Name()
  {
    return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlock()
  {
    return blockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlock_Column()
  {
    return (EReference)blockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumn()
  {
    return columnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumn_Name()
  {
    return (EAttribute)columnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumn_Multiple()
  {
    return (EAttribute)columnEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColumn_Def()
  {
    return (EReference)columnEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumnDefinition()
  {
    return columnDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColumnDefinition_Spec()
  {
    return (EReference)columnDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMandatoryColumn()
  {
    return mandatoryColumnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOptionalColumn()
  {
    return optionalColumnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumnSpec()
  {
    return columnSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRowSpec()
  {
    return rowSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRowSpec_Header()
  {
    return (EAttribute)rowSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRowSpec_Syntax()
  {
    return (EReference)rowSpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlockSpec()
  {
    return blockSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlockSpec_Kind()
  {
    return (EReference)blockSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSyntax()
  {
    return syntaxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSyntax_Is_id()
  {
    return (EAttribute)syntaxEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSyntax_Is_string()
  {
    return (EAttribute)syntaxEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSyntax_Is_int()
  {
    return (EAttribute)syntaxEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSyntax_Token()
  {
    return (EAttribute)syntaxEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSyntax_Rule()
  {
    return (EReference)syntaxEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRule()
  {
    return ruleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_Alternatives()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSyntaxSeq()
  {
    return syntaxSeqEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSyntaxSeq_Parts()
  {
    return (EReference)syntaxSeqEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpreadsheetGrammarLanguageFactory getSpreadsheetGrammarLanguageFactory()
  {
    return (SpreadsheetGrammarLanguageFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    grammarEClass = createEClass(GRAMMAR);
    createEReference(grammarEClass, GRAMMAR__ELEMENTS);

    elementEClass = createEClass(ELEMENT);
    createEAttribute(elementEClass, ELEMENT__NAME);

    blockEClass = createEClass(BLOCK);
    createEReference(blockEClass, BLOCK__COLUMN);

    columnEClass = createEClass(COLUMN);
    createEAttribute(columnEClass, COLUMN__NAME);
    createEAttribute(columnEClass, COLUMN__MULTIPLE);
    createEReference(columnEClass, COLUMN__DEF);

    columnDefinitionEClass = createEClass(COLUMN_DEFINITION);
    createEReference(columnDefinitionEClass, COLUMN_DEFINITION__SPEC);

    mandatoryColumnEClass = createEClass(MANDATORY_COLUMN);

    optionalColumnEClass = createEClass(OPTIONAL_COLUMN);

    columnSpecEClass = createEClass(COLUMN_SPEC);

    rowSpecEClass = createEClass(ROW_SPEC);
    createEAttribute(rowSpecEClass, ROW_SPEC__HEADER);
    createEReference(rowSpecEClass, ROW_SPEC__SYNTAX);

    blockSpecEClass = createEClass(BLOCK_SPEC);
    createEReference(blockSpecEClass, BLOCK_SPEC__KIND);

    syntaxEClass = createEClass(SYNTAX);
    createEAttribute(syntaxEClass, SYNTAX__IS_ID);
    createEAttribute(syntaxEClass, SYNTAX__IS_STRING);
    createEAttribute(syntaxEClass, SYNTAX__IS_INT);
    createEAttribute(syntaxEClass, SYNTAX__TOKEN);
    createEReference(syntaxEClass, SYNTAX__RULE);

    ruleEClass = createEClass(RULE);
    createEReference(ruleEClass, RULE__ALTERNATIVES);

    syntaxSeqEClass = createEClass(SYNTAX_SEQ);
    createEReference(syntaxSeqEClass, SYNTAX_SEQ__PARTS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    blockEClass.getESuperTypes().add(this.getElement());
    mandatoryColumnEClass.getESuperTypes().add(this.getColumnDefinition());
    optionalColumnEClass.getESuperTypes().add(this.getColumnDefinition());
    rowSpecEClass.getESuperTypes().add(this.getColumnSpec());
    blockSpecEClass.getESuperTypes().add(this.getColumnSpec());
    ruleEClass.getESuperTypes().add(this.getElement());

    // Initialize classes and features; add operations and parameters
    initEClass(grammarEClass, Grammar.class, "Grammar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGrammar_Elements(), this.getElement(), null, "elements", null, 0, -1, Grammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBlock_Column(), this.getColumn(), null, "column", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColumn_Name(), ecorePackage.getEString(), "name", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColumn_Multiple(), ecorePackage.getEBoolean(), "multiple", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getColumn_Def(), this.getColumnDefinition(), null, "def", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(columnDefinitionEClass, ColumnDefinition.class, "ColumnDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getColumnDefinition_Spec(), this.getColumnSpec(), null, "spec", null, 0, 1, ColumnDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mandatoryColumnEClass, MandatoryColumn.class, "MandatoryColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(optionalColumnEClass, OptionalColumn.class, "OptionalColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(columnSpecEClass, ColumnSpec.class, "ColumnSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rowSpecEClass, RowSpec.class, "RowSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRowSpec_Header(), ecorePackage.getEString(), "header", null, 0, 1, RowSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRowSpec_Syntax(), this.getSyntax(), null, "syntax", null, 0, 1, RowSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blockSpecEClass, BlockSpec.class, "BlockSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBlockSpec_Kind(), this.getBlock(), null, "kind", null, 0, 1, BlockSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(syntaxEClass, Syntax.class, "Syntax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSyntax_Is_id(), ecorePackage.getEBoolean(), "is_id", null, 0, 1, Syntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSyntax_Is_string(), ecorePackage.getEBoolean(), "is_string", null, 0, 1, Syntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSyntax_Is_int(), ecorePackage.getEBoolean(), "is_int", null, 0, 1, Syntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSyntax_Token(), ecorePackage.getEString(), "token", null, 0, 1, Syntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSyntax_Rule(), this.getRule(), null, "rule", null, 0, 1, Syntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRule_Alternatives(), this.getSyntaxSeq(), null, "alternatives", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(syntaxSeqEClass, SyntaxSeq.class, "SyntaxSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSyntaxSeq_Parts(), this.getSyntax(), null, "parts", null, 0, -1, SyntaxSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SpreadsheetGrammarLanguagePackageImpl
