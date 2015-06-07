/**
 */
package dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl;

import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Block;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Column;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SpreadsheetGrammarLanguagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.BlockImpl#getColumn <em>Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockImpl extends ElementImpl implements Block
{
  /**
   * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumn()
   * @generated
   * @ordered
   */
  protected EList<Column> column;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BlockImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SpreadsheetGrammarLanguagePackage.Literals.BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Column> getColumn()
  {
    if (column == null)
    {
      column = new EObjectContainmentEList<Column>(Column.class, this, SpreadsheetGrammarLanguagePackage.BLOCK__COLUMN);
    }
    return column;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SpreadsheetGrammarLanguagePackage.BLOCK__COLUMN:
        return ((InternalEList<?>)getColumn()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SpreadsheetGrammarLanguagePackage.BLOCK__COLUMN:
        return getColumn();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SpreadsheetGrammarLanguagePackage.BLOCK__COLUMN:
        getColumn().clear();
        getColumn().addAll((Collection<? extends Column>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SpreadsheetGrammarLanguagePackage.BLOCK__COLUMN:
        getColumn().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SpreadsheetGrammarLanguagePackage.BLOCK__COLUMN:
        return column != null && !column.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BlockImpl
