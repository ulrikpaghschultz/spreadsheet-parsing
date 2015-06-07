/**
 */
package dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Block#getColumn <em>Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SpreadsheetGrammarLanguagePackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends Element
{
  /**
   * Returns the value of the '<em><b>Column</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Column}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column</em>' containment reference list.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SpreadsheetGrammarLanguagePackage#getBlock_Column()
   * @model containment="true"
   * @generated
   */
  EList<Column> getColumn();

} // Block
