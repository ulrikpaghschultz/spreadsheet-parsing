/**
 */
package dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SpreadsheetGrammarLanguagePackage
 * @generated
 */
public interface SpreadsheetGrammarLanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SpreadsheetGrammarLanguageFactory eINSTANCE = dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SpreadsheetGrammarLanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Grammar</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Grammar</em>'.
   * @generated
   */
  Grammar createGrammar();

  /**
   * Returns a new object of class '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element</em>'.
   * @generated
   */
  Element createElement();

  /**
   * Returns a new object of class '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block</em>'.
   * @generated
   */
  Block createBlock();

  /**
   * Returns a new object of class '<em>Column</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column</em>'.
   * @generated
   */
  Column createColumn();

  /**
   * Returns a new object of class '<em>Column Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column Definition</em>'.
   * @generated
   */
  ColumnDefinition createColumnDefinition();

  /**
   * Returns a new object of class '<em>Mandatory Column</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mandatory Column</em>'.
   * @generated
   */
  MandatoryColumn createMandatoryColumn();

  /**
   * Returns a new object of class '<em>Optional Column</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Optional Column</em>'.
   * @generated
   */
  OptionalColumn createOptionalColumn();

  /**
   * Returns a new object of class '<em>Column Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column Spec</em>'.
   * @generated
   */
  ColumnSpec createColumnSpec();

  /**
   * Returns a new object of class '<em>Row Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Row Spec</em>'.
   * @generated
   */
  RowSpec createRowSpec();

  /**
   * Returns a new object of class '<em>Block Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block Spec</em>'.
   * @generated
   */
  BlockSpec createBlockSpec();

  /**
   * Returns a new object of class '<em>Syntax</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Syntax</em>'.
   * @generated
   */
  Syntax createSyntax();

  /**
   * Returns a new object of class '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule</em>'.
   * @generated
   */
  Rule createRule();

  /**
   * Returns a new object of class '<em>Syntax Seq</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Syntax Seq</em>'.
   * @generated
   */
  SyntaxSeq createSyntaxSeq();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SpreadsheetGrammarLanguagePackage getSpreadsheetGrammarLanguagePackage();

} //SpreadsheetGrammarLanguageFactory
