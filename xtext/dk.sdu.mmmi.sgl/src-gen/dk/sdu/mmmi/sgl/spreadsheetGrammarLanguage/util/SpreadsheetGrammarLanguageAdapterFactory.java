/**
 */
package dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.util;

import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SpreadsheetGrammarLanguagePackage
 * @generated
 */
public class SpreadsheetGrammarLanguageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SpreadsheetGrammarLanguagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpreadsheetGrammarLanguageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SpreadsheetGrammarLanguagePackage.eINSTANCE;
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
  protected SpreadsheetGrammarLanguageSwitch<Adapter> modelSwitch =
    new SpreadsheetGrammarLanguageSwitch<Adapter>()
    {
      @Override
      public Adapter caseGrammar(Grammar object)
      {
        return createGrammarAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseBlock(Block object)
      {
        return createBlockAdapter();
      }
      @Override
      public Adapter caseColumn(Column object)
      {
        return createColumnAdapter();
      }
      @Override
      public Adapter caseColumnDefinition(ColumnDefinition object)
      {
        return createColumnDefinitionAdapter();
      }
      @Override
      public Adapter caseMandatoryColumn(MandatoryColumn object)
      {
        return createMandatoryColumnAdapter();
      }
      @Override
      public Adapter caseOptionalColumn(OptionalColumn object)
      {
        return createOptionalColumnAdapter();
      }
      @Override
      public Adapter caseColumnSpec(ColumnSpec object)
      {
        return createColumnSpecAdapter();
      }
      @Override
      public Adapter caseRowSpec(RowSpec object)
      {
        return createRowSpecAdapter();
      }
      @Override
      public Adapter caseBlockSpec(BlockSpec object)
      {
        return createBlockSpecAdapter();
      }
      @Override
      public Adapter caseSyntax(Syntax object)
      {
        return createSyntaxAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter caseSyntaxSeq(SyntaxSeq object)
      {
        return createSyntaxSeqAdapter();
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
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Grammar <em>Grammar</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Grammar
   * @generated
   */
  public Adapter createGrammarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Column <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Column
   * @generated
   */
  public Adapter createColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.ColumnDefinition <em>Column Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.ColumnDefinition
   * @generated
   */
  public Adapter createColumnDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.MandatoryColumn <em>Mandatory Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.MandatoryColumn
   * @generated
   */
  public Adapter createMandatoryColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.OptionalColumn <em>Optional Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.OptionalColumn
   * @generated
   */
  public Adapter createOptionalColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.ColumnSpec <em>Column Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.ColumnSpec
   * @generated
   */
  public Adapter createColumnSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.RowSpec <em>Row Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.RowSpec
   * @generated
   */
  public Adapter createRowSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.BlockSpec <em>Block Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.BlockSpec
   * @generated
   */
  public Adapter createBlockSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax <em>Syntax</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax
   * @generated
   */
  public Adapter createSyntaxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SyntaxSeq <em>Syntax Seq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SyntaxSeq
   * @generated
   */
  public Adapter createSyntaxSeqAdapter()
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

} //SpreadsheetGrammarLanguageAdapterFactory
