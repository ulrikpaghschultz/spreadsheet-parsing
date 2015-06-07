package dk.sdu.mmmi.sgl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import dk.sdu.mmmi.sgl.services.SpreadsheetGrammarLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpreadsheetGrammarLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'block'", "'{'", "'}'", "';'", "'='", "'?='", "'column'", "':'", "'token'", "'rule'", "'|'", "'*'", "'IDENTIFIER'", "'STRING'", "'INTEGER'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSpreadsheetGrammarLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpreadsheetGrammarLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpreadsheetGrammarLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g"; }


     
     	private SpreadsheetGrammarLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SpreadsheetGrammarLanguageGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleGrammar"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:60:1: entryRuleGrammar : ruleGrammar EOF ;
    public final void entryRuleGrammar() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:61:1: ( ruleGrammar EOF )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:62:1: ruleGrammar EOF
            {
             before(grammarAccess.getGrammarRule()); 
            pushFollow(FOLLOW_ruleGrammar_in_entryRuleGrammar61);
            ruleGrammar();

            state._fsp--;

             after(grammarAccess.getGrammarRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrammar68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrammar"


    // $ANTLR start "ruleGrammar"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:69:1: ruleGrammar : ( ( rule__Grammar__ElementsAssignment )* ) ;
    public final void ruleGrammar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:73:2: ( ( ( rule__Grammar__ElementsAssignment )* ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:74:1: ( ( rule__Grammar__ElementsAssignment )* )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:74:1: ( ( rule__Grammar__ElementsAssignment )* )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:75:1: ( rule__Grammar__ElementsAssignment )*
            {
             before(grammarAccess.getGrammarAccess().getElementsAssignment()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:76:1: ( rule__Grammar__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:76:2: rule__Grammar__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Grammar__ElementsAssignment_in_ruleGrammar94);
            	    rule__Grammar__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getGrammarAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrammar"


    // $ANTLR start "entryRuleElement"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:88:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:89:1: ( ruleElement EOF )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:90:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement122);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:97:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:101:2: ( ( ( rule__Element__Alternatives ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:102:1: ( ( rule__Element__Alternatives ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:102:1: ( ( rule__Element__Alternatives ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:103:1: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:104:1: ( rule__Element__Alternatives )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:104:2: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_rule__Element__Alternatives_in_ruleElement155);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleBlock"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:116:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:117:1: ( ruleBlock EOF )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:118:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock182);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:125:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:129:2: ( ( ( rule__Block__Group__0 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:130:1: ( ( rule__Block__Group__0 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:130:1: ( ( rule__Block__Group__0 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:131:1: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:132:1: ( rule__Block__Group__0 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:132:2: rule__Block__Group__0
            {
            pushFollow(FOLLOW_rule__Block__Group__0_in_ruleBlock215);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleColumn"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:144:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:145:1: ( ruleColumn EOF )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:146:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_ruleColumn_in_entryRuleColumn242);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumn249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:153:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:157:2: ( ( ( rule__Column__Group__0 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:158:1: ( ( rule__Column__Group__0 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:158:1: ( ( rule__Column__Group__0 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:159:1: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:160:1: ( rule__Column__Group__0 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:160:2: rule__Column__Group__0
            {
            pushFollow(FOLLOW_rule__Column__Group__0_in_ruleColumn275);
            rule__Column__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleColumnDefinition"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:172:1: entryRuleColumnDefinition : ruleColumnDefinition EOF ;
    public final void entryRuleColumnDefinition() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:173:1: ( ruleColumnDefinition EOF )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:174:1: ruleColumnDefinition EOF
            {
             before(grammarAccess.getColumnDefinitionRule()); 
            pushFollow(FOLLOW_ruleColumnDefinition_in_entryRuleColumnDefinition302);
            ruleColumnDefinition();

            state._fsp--;

             after(grammarAccess.getColumnDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnDefinition309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumnDefinition"


    // $ANTLR start "ruleColumnDefinition"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:181:1: ruleColumnDefinition : ( ( rule__ColumnDefinition__Alternatives ) ) ;
    public final void ruleColumnDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:185:2: ( ( ( rule__ColumnDefinition__Alternatives ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:186:1: ( ( rule__ColumnDefinition__Alternatives ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:186:1: ( ( rule__ColumnDefinition__Alternatives ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:187:1: ( rule__ColumnDefinition__Alternatives )
            {
             before(grammarAccess.getColumnDefinitionAccess().getAlternatives()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:188:1: ( rule__ColumnDefinition__Alternatives )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:188:2: rule__ColumnDefinition__Alternatives
            {
            pushFollow(FOLLOW_rule__ColumnDefinition__Alternatives_in_ruleColumnDefinition335);
            rule__ColumnDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColumnDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnDefinition"


    // $ANTLR start "entryRuleMandatoryColumn"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:200:1: entryRuleMandatoryColumn : ruleMandatoryColumn EOF ;
    public final void entryRuleMandatoryColumn() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:201:1: ( ruleMandatoryColumn EOF )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:202:1: ruleMandatoryColumn EOF
            {
             before(grammarAccess.getMandatoryColumnRule()); 
            pushFollow(FOLLOW_ruleMandatoryColumn_in_entryRuleMandatoryColumn362);
            ruleMandatoryColumn();

            state._fsp--;

             after(grammarAccess.getMandatoryColumnRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatoryColumn369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMandatoryColumn"


    // $ANTLR start "ruleMandatoryColumn"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:209:1: ruleMandatoryColumn : ( ( rule__MandatoryColumn__Group__0 ) ) ;
    public final void ruleMandatoryColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:213:2: ( ( ( rule__MandatoryColumn__Group__0 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:214:1: ( ( rule__MandatoryColumn__Group__0 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:214:1: ( ( rule__MandatoryColumn__Group__0 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:215:1: ( rule__MandatoryColumn__Group__0 )
            {
             before(grammarAccess.getMandatoryColumnAccess().getGroup()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:216:1: ( rule__MandatoryColumn__Group__0 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:216:2: rule__MandatoryColumn__Group__0
            {
            pushFollow(FOLLOW_rule__MandatoryColumn__Group__0_in_ruleMandatoryColumn395);
            rule__MandatoryColumn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMandatoryColumn"


    // $ANTLR start "entryRuleOptionalColumn"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:228:1: entryRuleOptionalColumn : ruleOptionalColumn EOF ;
    public final void entryRuleOptionalColumn() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:229:1: ( ruleOptionalColumn EOF )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:230:1: ruleOptionalColumn EOF
            {
             before(grammarAccess.getOptionalColumnRule()); 
            pushFollow(FOLLOW_ruleOptionalColumn_in_entryRuleOptionalColumn422);
            ruleOptionalColumn();

            state._fsp--;

             after(grammarAccess.getOptionalColumnRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionalColumn429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOptionalColumn"


    // $ANTLR start "ruleOptionalColumn"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:237:1: ruleOptionalColumn : ( ( rule__OptionalColumn__Group__0 ) ) ;
    public final void ruleOptionalColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:241:2: ( ( ( rule__OptionalColumn__Group__0 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:242:1: ( ( rule__OptionalColumn__Group__0 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:242:1: ( ( rule__OptionalColumn__Group__0 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:243:1: ( rule__OptionalColumn__Group__0 )
            {
             before(grammarAccess.getOptionalColumnAccess().getGroup()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:244:1: ( rule__OptionalColumn__Group__0 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:244:2: rule__OptionalColumn__Group__0
            {
            pushFollow(FOLLOW_rule__OptionalColumn__Group__0_in_ruleOptionalColumn455);
            rule__OptionalColumn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionalColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptionalColumn"


    // $ANTLR start "entryRuleColumnSpec"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:256:1: entryRuleColumnSpec : ruleColumnSpec EOF ;
    public final void entryRuleColumnSpec() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:257:1: ( ruleColumnSpec EOF )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:258:1: ruleColumnSpec EOF
            {
             before(grammarAccess.getColumnSpecRule()); 
            pushFollow(FOLLOW_ruleColumnSpec_in_entryRuleColumnSpec482);
            ruleColumnSpec();

            state._fsp--;

             after(grammarAccess.getColumnSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnSpec489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumnSpec"


    // $ANTLR start "ruleColumnSpec"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:265:1: ruleColumnSpec : ( ( rule__ColumnSpec__Alternatives ) ) ;
    public final void ruleColumnSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:269:2: ( ( ( rule__ColumnSpec__Alternatives ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:270:1: ( ( rule__ColumnSpec__Alternatives ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:270:1: ( ( rule__ColumnSpec__Alternatives ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:271:1: ( rule__ColumnSpec__Alternatives )
            {
             before(grammarAccess.getColumnSpecAccess().getAlternatives()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:272:1: ( rule__ColumnSpec__Alternatives )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:272:2: rule__ColumnSpec__Alternatives
            {
            pushFollow(FOLLOW_rule__ColumnSpec__Alternatives_in_ruleColumnSpec515);
            rule__ColumnSpec__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColumnSpecAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnSpec"


    // $ANTLR start "entryRuleRowSpec"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:284:1: entryRuleRowSpec : ruleRowSpec EOF ;
    public final void entryRuleRowSpec() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:285:1: ( ruleRowSpec EOF )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:286:1: ruleRowSpec EOF
            {
             before(grammarAccess.getRowSpecRule()); 
            pushFollow(FOLLOW_ruleRowSpec_in_entryRuleRowSpec542);
            ruleRowSpec();

            state._fsp--;

             after(grammarAccess.getRowSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRowSpec549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRowSpec"


    // $ANTLR start "ruleRowSpec"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:293:1: ruleRowSpec : ( ( rule__RowSpec__Group__0 ) ) ;
    public final void ruleRowSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:297:2: ( ( ( rule__RowSpec__Group__0 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:298:1: ( ( rule__RowSpec__Group__0 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:298:1: ( ( rule__RowSpec__Group__0 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:299:1: ( rule__RowSpec__Group__0 )
            {
             before(grammarAccess.getRowSpecAccess().getGroup()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:300:1: ( rule__RowSpec__Group__0 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:300:2: rule__RowSpec__Group__0
            {
            pushFollow(FOLLOW_rule__RowSpec__Group__0_in_ruleRowSpec575);
            rule__RowSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRowSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRowSpec"


    // $ANTLR start "entryRuleBlockSpec"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:312:1: entryRuleBlockSpec : ruleBlockSpec EOF ;
    public final void entryRuleBlockSpec() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:313:1: ( ruleBlockSpec EOF )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:314:1: ruleBlockSpec EOF
            {
             before(grammarAccess.getBlockSpecRule()); 
            pushFollow(FOLLOW_ruleBlockSpec_in_entryRuleBlockSpec602);
            ruleBlockSpec();

            state._fsp--;

             after(grammarAccess.getBlockSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockSpec609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlockSpec"


    // $ANTLR start "ruleBlockSpec"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:321:1: ruleBlockSpec : ( ( rule__BlockSpec__Group__0 ) ) ;
    public final void ruleBlockSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:325:2: ( ( ( rule__BlockSpec__Group__0 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:326:1: ( ( rule__BlockSpec__Group__0 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:326:1: ( ( rule__BlockSpec__Group__0 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:327:1: ( rule__BlockSpec__Group__0 )
            {
             before(grammarAccess.getBlockSpecAccess().getGroup()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:328:1: ( rule__BlockSpec__Group__0 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:328:2: rule__BlockSpec__Group__0
            {
            pushFollow(FOLLOW_rule__BlockSpec__Group__0_in_ruleBlockSpec635);
            rule__BlockSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlockSpec"


    // $ANTLR start "entryRuleSyntax"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:340:1: entryRuleSyntax : ruleSyntax EOF ;
    public final void entryRuleSyntax() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:341:1: ( ruleSyntax EOF )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:342:1: ruleSyntax EOF
            {
             before(grammarAccess.getSyntaxRule()); 
            pushFollow(FOLLOW_ruleSyntax_in_entryRuleSyntax662);
            ruleSyntax();

            state._fsp--;

             after(grammarAccess.getSyntaxRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSyntax669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSyntax"


    // $ANTLR start "ruleSyntax"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:349:1: ruleSyntax : ( ( rule__Syntax__Alternatives ) ) ;
    public final void ruleSyntax() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:353:2: ( ( ( rule__Syntax__Alternatives ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:354:1: ( ( rule__Syntax__Alternatives ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:354:1: ( ( rule__Syntax__Alternatives ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:355:1: ( rule__Syntax__Alternatives )
            {
             before(grammarAccess.getSyntaxAccess().getAlternatives()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:356:1: ( rule__Syntax__Alternatives )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:356:2: rule__Syntax__Alternatives
            {
            pushFollow(FOLLOW_rule__Syntax__Alternatives_in_ruleSyntax695);
            rule__Syntax__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSyntaxAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSyntax"


    // $ANTLR start "entryRuleRule"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:368:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:369:1: ( ruleRule EOF )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:370:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule722);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule729); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:377:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:381:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:382:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:382:1: ( ( rule__Rule__Group__0 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:383:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:384:1: ( rule__Rule__Group__0 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:384:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule755);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleSyntaxSeq"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:396:1: entryRuleSyntaxSeq : ruleSyntaxSeq EOF ;
    public final void entryRuleSyntaxSeq() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:397:1: ( ruleSyntaxSeq EOF )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:398:1: ruleSyntaxSeq EOF
            {
             before(grammarAccess.getSyntaxSeqRule()); 
            pushFollow(FOLLOW_ruleSyntaxSeq_in_entryRuleSyntaxSeq782);
            ruleSyntaxSeq();

            state._fsp--;

             after(grammarAccess.getSyntaxSeqRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSyntaxSeq789); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSyntaxSeq"


    // $ANTLR start "ruleSyntaxSeq"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:405:1: ruleSyntaxSeq : ( ( ( rule__SyntaxSeq__PartsAssignment ) ) ( ( rule__SyntaxSeq__PartsAssignment )* ) ) ;
    public final void ruleSyntaxSeq() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:409:2: ( ( ( ( rule__SyntaxSeq__PartsAssignment ) ) ( ( rule__SyntaxSeq__PartsAssignment )* ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:410:1: ( ( ( rule__SyntaxSeq__PartsAssignment ) ) ( ( rule__SyntaxSeq__PartsAssignment )* ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:410:1: ( ( ( rule__SyntaxSeq__PartsAssignment ) ) ( ( rule__SyntaxSeq__PartsAssignment )* ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:411:1: ( ( rule__SyntaxSeq__PartsAssignment ) ) ( ( rule__SyntaxSeq__PartsAssignment )* )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:411:1: ( ( rule__SyntaxSeq__PartsAssignment ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:412:1: ( rule__SyntaxSeq__PartsAssignment )
            {
             before(grammarAccess.getSyntaxSeqAccess().getPartsAssignment()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:413:1: ( rule__SyntaxSeq__PartsAssignment )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:413:2: rule__SyntaxSeq__PartsAssignment
            {
            pushFollow(FOLLOW_rule__SyntaxSeq__PartsAssignment_in_ruleSyntaxSeq817);
            rule__SyntaxSeq__PartsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSyntaxSeqAccess().getPartsAssignment()); 

            }

            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:416:1: ( ( rule__SyntaxSeq__PartsAssignment )* )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:417:1: ( rule__SyntaxSeq__PartsAssignment )*
            {
             before(grammarAccess.getSyntaxSeqAccess().getPartsAssignment()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:418:1: ( rule__SyntaxSeq__PartsAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=19 && LA2_0<=20)||(LA2_0>=23 && LA2_0<=25)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:418:2: rule__SyntaxSeq__PartsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__SyntaxSeq__PartsAssignment_in_ruleSyntaxSeq829);
            	    rule__SyntaxSeq__PartsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getSyntaxSeqAccess().getPartsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSyntaxSeq"


    // $ANTLR start "rule__Element__Alternatives"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:431:1: rule__Element__Alternatives : ( ( ruleBlock ) | ( ruleRule ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:435:1: ( ( ruleBlock ) | ( ruleRule ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:436:1: ( ruleBlock )
                    {
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:436:1: ( ruleBlock )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:437:1: ruleBlock
                    {
                     before(grammarAccess.getElementAccess().getBlockParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBlock_in_rule__Element__Alternatives868);
                    ruleBlock();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getBlockParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:442:6: ( ruleRule )
                    {
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:442:6: ( ruleRule )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:443:1: ruleRule
                    {
                     before(grammarAccess.getElementAccess().getRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRule_in_rule__Element__Alternatives885);
                    ruleRule();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getRuleParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__ColumnDefinition__Alternatives"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:453:1: rule__ColumnDefinition__Alternatives : ( ( ruleMandatoryColumn ) | ( ruleOptionalColumn ) );
    public final void rule__ColumnDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:457:1: ( ( ruleMandatoryColumn ) | ( ruleOptionalColumn ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:458:1: ( ruleMandatoryColumn )
                    {
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:458:1: ( ruleMandatoryColumn )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:459:1: ruleMandatoryColumn
                    {
                     before(grammarAccess.getColumnDefinitionAccess().getMandatoryColumnParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMandatoryColumn_in_rule__ColumnDefinition__Alternatives917);
                    ruleMandatoryColumn();

                    state._fsp--;

                     after(grammarAccess.getColumnDefinitionAccess().getMandatoryColumnParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:464:6: ( ruleOptionalColumn )
                    {
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:464:6: ( ruleOptionalColumn )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:465:1: ruleOptionalColumn
                    {
                     before(grammarAccess.getColumnDefinitionAccess().getOptionalColumnParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOptionalColumn_in_rule__ColumnDefinition__Alternatives934);
                    ruleOptionalColumn();

                    state._fsp--;

                     after(grammarAccess.getColumnDefinitionAccess().getOptionalColumnParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDefinition__Alternatives"


    // $ANTLR start "rule__ColumnSpec__Alternatives"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:475:1: rule__ColumnSpec__Alternatives : ( ( ruleRowSpec ) | ( ruleBlockSpec ) );
    public final void rule__ColumnSpec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:479:1: ( ( ruleRowSpec ) | ( ruleBlockSpec ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==11) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:480:1: ( ruleRowSpec )
                    {
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:480:1: ( ruleRowSpec )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:481:1: ruleRowSpec
                    {
                     before(grammarAccess.getColumnSpecAccess().getRowSpecParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRowSpec_in_rule__ColumnSpec__Alternatives966);
                    ruleRowSpec();

                    state._fsp--;

                     after(grammarAccess.getColumnSpecAccess().getRowSpecParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:486:6: ( ruleBlockSpec )
                    {
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:486:6: ( ruleBlockSpec )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:487:1: ruleBlockSpec
                    {
                     before(grammarAccess.getColumnSpecAccess().getBlockSpecParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBlockSpec_in_rule__ColumnSpec__Alternatives983);
                    ruleBlockSpec();

                    state._fsp--;

                     after(grammarAccess.getColumnSpecAccess().getBlockSpecParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSpec__Alternatives"


    // $ANTLR start "rule__Syntax__Alternatives"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:497:1: rule__Syntax__Alternatives : ( ( ( rule__Syntax__Is_idAssignment_0 ) ) | ( ( rule__Syntax__Is_stringAssignment_1 ) ) | ( ( rule__Syntax__Is_intAssignment_2 ) ) | ( ( rule__Syntax__Group_3__0 ) ) | ( ( rule__Syntax__Group_4__0 ) ) );
    public final void rule__Syntax__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:501:1: ( ( ( rule__Syntax__Is_idAssignment_0 ) ) | ( ( rule__Syntax__Is_stringAssignment_1 ) ) | ( ( rule__Syntax__Is_intAssignment_2 ) ) | ( ( rule__Syntax__Group_3__0 ) ) | ( ( rule__Syntax__Group_4__0 ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            case 19:
                {
                alt6=4;
                }
                break;
            case 20:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:502:1: ( ( rule__Syntax__Is_idAssignment_0 ) )
                    {
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:502:1: ( ( rule__Syntax__Is_idAssignment_0 ) )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:503:1: ( rule__Syntax__Is_idAssignment_0 )
                    {
                     before(grammarAccess.getSyntaxAccess().getIs_idAssignment_0()); 
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:504:1: ( rule__Syntax__Is_idAssignment_0 )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:504:2: rule__Syntax__Is_idAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Syntax__Is_idAssignment_0_in_rule__Syntax__Alternatives1015);
                    rule__Syntax__Is_idAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSyntaxAccess().getIs_idAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:508:6: ( ( rule__Syntax__Is_stringAssignment_1 ) )
                    {
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:508:6: ( ( rule__Syntax__Is_stringAssignment_1 ) )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:509:1: ( rule__Syntax__Is_stringAssignment_1 )
                    {
                     before(grammarAccess.getSyntaxAccess().getIs_stringAssignment_1()); 
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:510:1: ( rule__Syntax__Is_stringAssignment_1 )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:510:2: rule__Syntax__Is_stringAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Syntax__Is_stringAssignment_1_in_rule__Syntax__Alternatives1033);
                    rule__Syntax__Is_stringAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSyntaxAccess().getIs_stringAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:514:6: ( ( rule__Syntax__Is_intAssignment_2 ) )
                    {
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:514:6: ( ( rule__Syntax__Is_intAssignment_2 ) )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:515:1: ( rule__Syntax__Is_intAssignment_2 )
                    {
                     before(grammarAccess.getSyntaxAccess().getIs_intAssignment_2()); 
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:516:1: ( rule__Syntax__Is_intAssignment_2 )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:516:2: rule__Syntax__Is_intAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Syntax__Is_intAssignment_2_in_rule__Syntax__Alternatives1051);
                    rule__Syntax__Is_intAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSyntaxAccess().getIs_intAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:520:6: ( ( rule__Syntax__Group_3__0 ) )
                    {
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:520:6: ( ( rule__Syntax__Group_3__0 ) )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:521:1: ( rule__Syntax__Group_3__0 )
                    {
                     before(grammarAccess.getSyntaxAccess().getGroup_3()); 
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:522:1: ( rule__Syntax__Group_3__0 )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:522:2: rule__Syntax__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Syntax__Group_3__0_in_rule__Syntax__Alternatives1069);
                    rule__Syntax__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSyntaxAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:526:6: ( ( rule__Syntax__Group_4__0 ) )
                    {
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:526:6: ( ( rule__Syntax__Group_4__0 ) )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:527:1: ( rule__Syntax__Group_4__0 )
                    {
                     before(grammarAccess.getSyntaxAccess().getGroup_4()); 
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:528:1: ( rule__Syntax__Group_4__0 )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:528:2: rule__Syntax__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Syntax__Group_4__0_in_rule__Syntax__Alternatives1087);
                    rule__Syntax__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSyntaxAccess().getGroup_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Alternatives"


    // $ANTLR start "rule__Block__Group__0"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:539:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:543:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:544:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__01118);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__01121);
            rule__Block__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:551:1: rule__Block__Group__0__Impl : ( 'block' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:555:1: ( ( 'block' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:556:1: ( 'block' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:556:1: ( 'block' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:557:1: 'block'
            {
             before(grammarAccess.getBlockAccess().getBlockKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Block__Group__0__Impl1149); 
             after(grammarAccess.getBlockAccess().getBlockKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:570:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:574:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:575:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__11180);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__2_in_rule__Block__Group__11183);
            rule__Block__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:582:1: rule__Block__Group__1__Impl : ( ( rule__Block__NameAssignment_1 ) ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:586:1: ( ( ( rule__Block__NameAssignment_1 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:587:1: ( ( rule__Block__NameAssignment_1 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:587:1: ( ( rule__Block__NameAssignment_1 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:588:1: ( rule__Block__NameAssignment_1 )
            {
             before(grammarAccess.getBlockAccess().getNameAssignment_1()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:589:1: ( rule__Block__NameAssignment_1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:589:2: rule__Block__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Block__NameAssignment_1_in_rule__Block__Group__1__Impl1210);
            rule__Block__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:599:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:603:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:604:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__21240);
            rule__Block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__3_in_rule__Block__Group__21243);
            rule__Block__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:611:1: rule__Block__Group__2__Impl : ( '{' ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:615:1: ( ( '{' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:616:1: ( '{' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:616:1: ( '{' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:617:1: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Block__Group__2__Impl1271); 
             after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:630:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:634:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:635:2: rule__Block__Group__3__Impl rule__Block__Group__4
            {
            pushFollow(FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__31302);
            rule__Block__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__4_in_rule__Block__Group__31305);
            rule__Block__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:642:1: rule__Block__Group__3__Impl : ( ( rule__Block__ColumnAssignment_3 )* ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:646:1: ( ( ( rule__Block__ColumnAssignment_3 )* ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:647:1: ( ( rule__Block__ColumnAssignment_3 )* )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:647:1: ( ( rule__Block__ColumnAssignment_3 )* )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:648:1: ( rule__Block__ColumnAssignment_3 )*
            {
             before(grammarAccess.getBlockAccess().getColumnAssignment_3()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:649:1: ( rule__Block__ColumnAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:649:2: rule__Block__ColumnAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Block__ColumnAssignment_3_in_rule__Block__Group__3__Impl1332);
            	    rule__Block__ColumnAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getColumnAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__Block__Group__4"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:659:1: rule__Block__Group__4 : rule__Block__Group__4__Impl ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:663:1: ( rule__Block__Group__4__Impl )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:664:2: rule__Block__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__4__Impl_in_rule__Block__Group__41363);
            rule__Block__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__4"


    // $ANTLR start "rule__Block__Group__4__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:670:1: rule__Block__Group__4__Impl : ( '}' ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:674:1: ( ( '}' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:675:1: ( '}' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:675:1: ( '}' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:676:1: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Block__Group__4__Impl1391); 
             after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__4__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:699:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:703:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:704:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_rule__Column__Group__0__Impl_in_rule__Column__Group__01432);
            rule__Column__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Column__Group__1_in_rule__Column__Group__01435);
            rule__Column__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0"


    // $ANTLR start "rule__Column__Group__0__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:711:1: rule__Column__Group__0__Impl : ( ( rule__Column__NameAssignment_0 ) ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:715:1: ( ( ( rule__Column__NameAssignment_0 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:716:1: ( ( rule__Column__NameAssignment_0 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:716:1: ( ( rule__Column__NameAssignment_0 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:717:1: ( rule__Column__NameAssignment_0 )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment_0()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:718:1: ( rule__Column__NameAssignment_0 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:718:2: rule__Column__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Column__NameAssignment_0_in_rule__Column__Group__0__Impl1462);
            rule__Column__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0__Impl"


    // $ANTLR start "rule__Column__Group__1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:728:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:732:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:733:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FOLLOW_rule__Column__Group__1__Impl_in_rule__Column__Group__11492);
            rule__Column__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Column__Group__2_in_rule__Column__Group__11495);
            rule__Column__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1"


    // $ANTLR start "rule__Column__Group__1__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:740:1: rule__Column__Group__1__Impl : ( ( rule__Column__MultipleAssignment_1 )? ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:744:1: ( ( ( rule__Column__MultipleAssignment_1 )? ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:745:1: ( ( rule__Column__MultipleAssignment_1 )? )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:745:1: ( ( rule__Column__MultipleAssignment_1 )? )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:746:1: ( rule__Column__MultipleAssignment_1 )?
            {
             before(grammarAccess.getColumnAccess().getMultipleAssignment_1()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:747:1: ( rule__Column__MultipleAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:747:2: rule__Column__MultipleAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Column__MultipleAssignment_1_in_rule__Column__Group__1__Impl1522);
                    rule__Column__MultipleAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getMultipleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1__Impl"


    // $ANTLR start "rule__Column__Group__2"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:757:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:761:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:762:2: rule__Column__Group__2__Impl rule__Column__Group__3
            {
            pushFollow(FOLLOW_rule__Column__Group__2__Impl_in_rule__Column__Group__21553);
            rule__Column__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Column__Group__3_in_rule__Column__Group__21556);
            rule__Column__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2"


    // $ANTLR start "rule__Column__Group__2__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:769:1: rule__Column__Group__2__Impl : ( ( rule__Column__DefAssignment_2 ) ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:773:1: ( ( ( rule__Column__DefAssignment_2 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:774:1: ( ( rule__Column__DefAssignment_2 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:774:1: ( ( rule__Column__DefAssignment_2 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:775:1: ( rule__Column__DefAssignment_2 )
            {
             before(grammarAccess.getColumnAccess().getDefAssignment_2()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:776:1: ( rule__Column__DefAssignment_2 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:776:2: rule__Column__DefAssignment_2
            {
            pushFollow(FOLLOW_rule__Column__DefAssignment_2_in_rule__Column__Group__2__Impl1583);
            rule__Column__DefAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getDefAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2__Impl"


    // $ANTLR start "rule__Column__Group__3"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:786:1: rule__Column__Group__3 : rule__Column__Group__3__Impl ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:790:1: ( rule__Column__Group__3__Impl )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:791:2: rule__Column__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Column__Group__3__Impl_in_rule__Column__Group__31613);
            rule__Column__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3"


    // $ANTLR start "rule__Column__Group__3__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:797:1: rule__Column__Group__3__Impl : ( ';' ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:801:1: ( ( ';' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:802:1: ( ';' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:802:1: ( ';' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:803:1: ';'
            {
             before(grammarAccess.getColumnAccess().getSemicolonKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Column__Group__3__Impl1641); 
             after(grammarAccess.getColumnAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3__Impl"


    // $ANTLR start "rule__MandatoryColumn__Group__0"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:824:1: rule__MandatoryColumn__Group__0 : rule__MandatoryColumn__Group__0__Impl rule__MandatoryColumn__Group__1 ;
    public final void rule__MandatoryColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:828:1: ( rule__MandatoryColumn__Group__0__Impl rule__MandatoryColumn__Group__1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:829:2: rule__MandatoryColumn__Group__0__Impl rule__MandatoryColumn__Group__1
            {
            pushFollow(FOLLOW_rule__MandatoryColumn__Group__0__Impl_in_rule__MandatoryColumn__Group__01680);
            rule__MandatoryColumn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MandatoryColumn__Group__1_in_rule__MandatoryColumn__Group__01683);
            rule__MandatoryColumn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryColumn__Group__0"


    // $ANTLR start "rule__MandatoryColumn__Group__0__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:836:1: rule__MandatoryColumn__Group__0__Impl : ( '=' ) ;
    public final void rule__MandatoryColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:840:1: ( ( '=' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:841:1: ( '=' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:841:1: ( '=' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:842:1: '='
            {
             before(grammarAccess.getMandatoryColumnAccess().getEqualsSignKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__MandatoryColumn__Group__0__Impl1711); 
             after(grammarAccess.getMandatoryColumnAccess().getEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryColumn__Group__0__Impl"


    // $ANTLR start "rule__MandatoryColumn__Group__1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:855:1: rule__MandatoryColumn__Group__1 : rule__MandatoryColumn__Group__1__Impl ;
    public final void rule__MandatoryColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:859:1: ( rule__MandatoryColumn__Group__1__Impl )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:860:2: rule__MandatoryColumn__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MandatoryColumn__Group__1__Impl_in_rule__MandatoryColumn__Group__11742);
            rule__MandatoryColumn__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryColumn__Group__1"


    // $ANTLR start "rule__MandatoryColumn__Group__1__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:866:1: rule__MandatoryColumn__Group__1__Impl : ( ( rule__MandatoryColumn__SpecAssignment_1 ) ) ;
    public final void rule__MandatoryColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:870:1: ( ( ( rule__MandatoryColumn__SpecAssignment_1 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:871:1: ( ( rule__MandatoryColumn__SpecAssignment_1 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:871:1: ( ( rule__MandatoryColumn__SpecAssignment_1 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:872:1: ( rule__MandatoryColumn__SpecAssignment_1 )
            {
             before(grammarAccess.getMandatoryColumnAccess().getSpecAssignment_1()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:873:1: ( rule__MandatoryColumn__SpecAssignment_1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:873:2: rule__MandatoryColumn__SpecAssignment_1
            {
            pushFollow(FOLLOW_rule__MandatoryColumn__SpecAssignment_1_in_rule__MandatoryColumn__Group__1__Impl1769);
            rule__MandatoryColumn__SpecAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryColumnAccess().getSpecAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryColumn__Group__1__Impl"


    // $ANTLR start "rule__OptionalColumn__Group__0"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:887:1: rule__OptionalColumn__Group__0 : rule__OptionalColumn__Group__0__Impl rule__OptionalColumn__Group__1 ;
    public final void rule__OptionalColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:891:1: ( rule__OptionalColumn__Group__0__Impl rule__OptionalColumn__Group__1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:892:2: rule__OptionalColumn__Group__0__Impl rule__OptionalColumn__Group__1
            {
            pushFollow(FOLLOW_rule__OptionalColumn__Group__0__Impl_in_rule__OptionalColumn__Group__01803);
            rule__OptionalColumn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalColumn__Group__1_in_rule__OptionalColumn__Group__01806);
            rule__OptionalColumn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalColumn__Group__0"


    // $ANTLR start "rule__OptionalColumn__Group__0__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:899:1: rule__OptionalColumn__Group__0__Impl : ( '?=' ) ;
    public final void rule__OptionalColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:903:1: ( ( '?=' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:904:1: ( '?=' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:904:1: ( '?=' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:905:1: '?='
            {
             before(grammarAccess.getOptionalColumnAccess().getQuestionMarkEqualsSignKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__OptionalColumn__Group__0__Impl1834); 
             after(grammarAccess.getOptionalColumnAccess().getQuestionMarkEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalColumn__Group__0__Impl"


    // $ANTLR start "rule__OptionalColumn__Group__1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:918:1: rule__OptionalColumn__Group__1 : rule__OptionalColumn__Group__1__Impl ;
    public final void rule__OptionalColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:922:1: ( rule__OptionalColumn__Group__1__Impl )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:923:2: rule__OptionalColumn__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OptionalColumn__Group__1__Impl_in_rule__OptionalColumn__Group__11865);
            rule__OptionalColumn__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalColumn__Group__1"


    // $ANTLR start "rule__OptionalColumn__Group__1__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:929:1: rule__OptionalColumn__Group__1__Impl : ( ( rule__OptionalColumn__SpecAssignment_1 ) ) ;
    public final void rule__OptionalColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:933:1: ( ( ( rule__OptionalColumn__SpecAssignment_1 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:934:1: ( ( rule__OptionalColumn__SpecAssignment_1 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:934:1: ( ( rule__OptionalColumn__SpecAssignment_1 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:935:1: ( rule__OptionalColumn__SpecAssignment_1 )
            {
             before(grammarAccess.getOptionalColumnAccess().getSpecAssignment_1()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:936:1: ( rule__OptionalColumn__SpecAssignment_1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:936:2: rule__OptionalColumn__SpecAssignment_1
            {
            pushFollow(FOLLOW_rule__OptionalColumn__SpecAssignment_1_in_rule__OptionalColumn__Group__1__Impl1892);
            rule__OptionalColumn__SpecAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionalColumnAccess().getSpecAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalColumn__Group__1__Impl"


    // $ANTLR start "rule__RowSpec__Group__0"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:950:1: rule__RowSpec__Group__0 : rule__RowSpec__Group__0__Impl rule__RowSpec__Group__1 ;
    public final void rule__RowSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:954:1: ( rule__RowSpec__Group__0__Impl rule__RowSpec__Group__1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:955:2: rule__RowSpec__Group__0__Impl rule__RowSpec__Group__1
            {
            pushFollow(FOLLOW_rule__RowSpec__Group__0__Impl_in_rule__RowSpec__Group__01926);
            rule__RowSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RowSpec__Group__1_in_rule__RowSpec__Group__01929);
            rule__RowSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowSpec__Group__0"


    // $ANTLR start "rule__RowSpec__Group__0__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:962:1: rule__RowSpec__Group__0__Impl : ( 'column' ) ;
    public final void rule__RowSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:966:1: ( ( 'column' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:967:1: ( 'column' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:967:1: ( 'column' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:968:1: 'column'
            {
             before(grammarAccess.getRowSpecAccess().getColumnKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__RowSpec__Group__0__Impl1957); 
             after(grammarAccess.getRowSpecAccess().getColumnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowSpec__Group__0__Impl"


    // $ANTLR start "rule__RowSpec__Group__1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:981:1: rule__RowSpec__Group__1 : rule__RowSpec__Group__1__Impl rule__RowSpec__Group__2 ;
    public final void rule__RowSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:985:1: ( rule__RowSpec__Group__1__Impl rule__RowSpec__Group__2 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:986:2: rule__RowSpec__Group__1__Impl rule__RowSpec__Group__2
            {
            pushFollow(FOLLOW_rule__RowSpec__Group__1__Impl_in_rule__RowSpec__Group__11988);
            rule__RowSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RowSpec__Group__2_in_rule__RowSpec__Group__11991);
            rule__RowSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowSpec__Group__1"


    // $ANTLR start "rule__RowSpec__Group__1__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:993:1: rule__RowSpec__Group__1__Impl : ( ( rule__RowSpec__HeaderAssignment_1 ) ) ;
    public final void rule__RowSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:997:1: ( ( ( rule__RowSpec__HeaderAssignment_1 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:998:1: ( ( rule__RowSpec__HeaderAssignment_1 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:998:1: ( ( rule__RowSpec__HeaderAssignment_1 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:999:1: ( rule__RowSpec__HeaderAssignment_1 )
            {
             before(grammarAccess.getRowSpecAccess().getHeaderAssignment_1()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1000:1: ( rule__RowSpec__HeaderAssignment_1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1000:2: rule__RowSpec__HeaderAssignment_1
            {
            pushFollow(FOLLOW_rule__RowSpec__HeaderAssignment_1_in_rule__RowSpec__Group__1__Impl2018);
            rule__RowSpec__HeaderAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRowSpecAccess().getHeaderAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowSpec__Group__1__Impl"


    // $ANTLR start "rule__RowSpec__Group__2"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1010:1: rule__RowSpec__Group__2 : rule__RowSpec__Group__2__Impl rule__RowSpec__Group__3 ;
    public final void rule__RowSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1014:1: ( rule__RowSpec__Group__2__Impl rule__RowSpec__Group__3 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1015:2: rule__RowSpec__Group__2__Impl rule__RowSpec__Group__3
            {
            pushFollow(FOLLOW_rule__RowSpec__Group__2__Impl_in_rule__RowSpec__Group__22048);
            rule__RowSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RowSpec__Group__3_in_rule__RowSpec__Group__22051);
            rule__RowSpec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowSpec__Group__2"


    // $ANTLR start "rule__RowSpec__Group__2__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1022:1: rule__RowSpec__Group__2__Impl : ( ':' ) ;
    public final void rule__RowSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1026:1: ( ( ':' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1027:1: ( ':' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1027:1: ( ':' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1028:1: ':'
            {
             before(grammarAccess.getRowSpecAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__RowSpec__Group__2__Impl2079); 
             after(grammarAccess.getRowSpecAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowSpec__Group__2__Impl"


    // $ANTLR start "rule__RowSpec__Group__3"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1041:1: rule__RowSpec__Group__3 : rule__RowSpec__Group__3__Impl ;
    public final void rule__RowSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1045:1: ( rule__RowSpec__Group__3__Impl )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1046:2: rule__RowSpec__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RowSpec__Group__3__Impl_in_rule__RowSpec__Group__32110);
            rule__RowSpec__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowSpec__Group__3"


    // $ANTLR start "rule__RowSpec__Group__3__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1052:1: rule__RowSpec__Group__3__Impl : ( ( rule__RowSpec__SyntaxAssignment_3 ) ) ;
    public final void rule__RowSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1056:1: ( ( ( rule__RowSpec__SyntaxAssignment_3 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1057:1: ( ( rule__RowSpec__SyntaxAssignment_3 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1057:1: ( ( rule__RowSpec__SyntaxAssignment_3 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1058:1: ( rule__RowSpec__SyntaxAssignment_3 )
            {
             before(grammarAccess.getRowSpecAccess().getSyntaxAssignment_3()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1059:1: ( rule__RowSpec__SyntaxAssignment_3 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1059:2: rule__RowSpec__SyntaxAssignment_3
            {
            pushFollow(FOLLOW_rule__RowSpec__SyntaxAssignment_3_in_rule__RowSpec__Group__3__Impl2137);
            rule__RowSpec__SyntaxAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRowSpecAccess().getSyntaxAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowSpec__Group__3__Impl"


    // $ANTLR start "rule__BlockSpec__Group__0"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1077:1: rule__BlockSpec__Group__0 : rule__BlockSpec__Group__0__Impl rule__BlockSpec__Group__1 ;
    public final void rule__BlockSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1081:1: ( rule__BlockSpec__Group__0__Impl rule__BlockSpec__Group__1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1082:2: rule__BlockSpec__Group__0__Impl rule__BlockSpec__Group__1
            {
            pushFollow(FOLLOW_rule__BlockSpec__Group__0__Impl_in_rule__BlockSpec__Group__02175);
            rule__BlockSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BlockSpec__Group__1_in_rule__BlockSpec__Group__02178);
            rule__BlockSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockSpec__Group__0"


    // $ANTLR start "rule__BlockSpec__Group__0__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1089:1: rule__BlockSpec__Group__0__Impl : ( 'block' ) ;
    public final void rule__BlockSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1093:1: ( ( 'block' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1094:1: ( 'block' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1094:1: ( 'block' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1095:1: 'block'
            {
             before(grammarAccess.getBlockSpecAccess().getBlockKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__BlockSpec__Group__0__Impl2206); 
             after(grammarAccess.getBlockSpecAccess().getBlockKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockSpec__Group__0__Impl"


    // $ANTLR start "rule__BlockSpec__Group__1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1108:1: rule__BlockSpec__Group__1 : rule__BlockSpec__Group__1__Impl ;
    public final void rule__BlockSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1112:1: ( rule__BlockSpec__Group__1__Impl )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1113:2: rule__BlockSpec__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BlockSpec__Group__1__Impl_in_rule__BlockSpec__Group__12237);
            rule__BlockSpec__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockSpec__Group__1"


    // $ANTLR start "rule__BlockSpec__Group__1__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1119:1: rule__BlockSpec__Group__1__Impl : ( ( rule__BlockSpec__KindAssignment_1 ) ) ;
    public final void rule__BlockSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1123:1: ( ( ( rule__BlockSpec__KindAssignment_1 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1124:1: ( ( rule__BlockSpec__KindAssignment_1 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1124:1: ( ( rule__BlockSpec__KindAssignment_1 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1125:1: ( rule__BlockSpec__KindAssignment_1 )
            {
             before(grammarAccess.getBlockSpecAccess().getKindAssignment_1()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1126:1: ( rule__BlockSpec__KindAssignment_1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1126:2: rule__BlockSpec__KindAssignment_1
            {
            pushFollow(FOLLOW_rule__BlockSpec__KindAssignment_1_in_rule__BlockSpec__Group__1__Impl2264);
            rule__BlockSpec__KindAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBlockSpecAccess().getKindAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockSpec__Group__1__Impl"


    // $ANTLR start "rule__Syntax__Group_3__0"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1140:1: rule__Syntax__Group_3__0 : rule__Syntax__Group_3__0__Impl rule__Syntax__Group_3__1 ;
    public final void rule__Syntax__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1144:1: ( rule__Syntax__Group_3__0__Impl rule__Syntax__Group_3__1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1145:2: rule__Syntax__Group_3__0__Impl rule__Syntax__Group_3__1
            {
            pushFollow(FOLLOW_rule__Syntax__Group_3__0__Impl_in_rule__Syntax__Group_3__02298);
            rule__Syntax__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Syntax__Group_3__1_in_rule__Syntax__Group_3__02301);
            rule__Syntax__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Group_3__0"


    // $ANTLR start "rule__Syntax__Group_3__0__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1152:1: rule__Syntax__Group_3__0__Impl : ( 'token' ) ;
    public final void rule__Syntax__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1156:1: ( ( 'token' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1157:1: ( 'token' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1157:1: ( 'token' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1158:1: 'token'
            {
             before(grammarAccess.getSyntaxAccess().getTokenKeyword_3_0()); 
            match(input,19,FOLLOW_19_in_rule__Syntax__Group_3__0__Impl2329); 
             after(grammarAccess.getSyntaxAccess().getTokenKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Group_3__0__Impl"


    // $ANTLR start "rule__Syntax__Group_3__1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1171:1: rule__Syntax__Group_3__1 : rule__Syntax__Group_3__1__Impl ;
    public final void rule__Syntax__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1175:1: ( rule__Syntax__Group_3__1__Impl )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1176:2: rule__Syntax__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Syntax__Group_3__1__Impl_in_rule__Syntax__Group_3__12360);
            rule__Syntax__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Group_3__1"


    // $ANTLR start "rule__Syntax__Group_3__1__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1182:1: rule__Syntax__Group_3__1__Impl : ( ( rule__Syntax__TokenAssignment_3_1 ) ) ;
    public final void rule__Syntax__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1186:1: ( ( ( rule__Syntax__TokenAssignment_3_1 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1187:1: ( ( rule__Syntax__TokenAssignment_3_1 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1187:1: ( ( rule__Syntax__TokenAssignment_3_1 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1188:1: ( rule__Syntax__TokenAssignment_3_1 )
            {
             before(grammarAccess.getSyntaxAccess().getTokenAssignment_3_1()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1189:1: ( rule__Syntax__TokenAssignment_3_1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1189:2: rule__Syntax__TokenAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Syntax__TokenAssignment_3_1_in_rule__Syntax__Group_3__1__Impl2387);
            rule__Syntax__TokenAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSyntaxAccess().getTokenAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Group_3__1__Impl"


    // $ANTLR start "rule__Syntax__Group_4__0"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1203:1: rule__Syntax__Group_4__0 : rule__Syntax__Group_4__0__Impl rule__Syntax__Group_4__1 ;
    public final void rule__Syntax__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1207:1: ( rule__Syntax__Group_4__0__Impl rule__Syntax__Group_4__1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1208:2: rule__Syntax__Group_4__0__Impl rule__Syntax__Group_4__1
            {
            pushFollow(FOLLOW_rule__Syntax__Group_4__0__Impl_in_rule__Syntax__Group_4__02421);
            rule__Syntax__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Syntax__Group_4__1_in_rule__Syntax__Group_4__02424);
            rule__Syntax__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Group_4__0"


    // $ANTLR start "rule__Syntax__Group_4__0__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1215:1: rule__Syntax__Group_4__0__Impl : ( 'rule' ) ;
    public final void rule__Syntax__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1219:1: ( ( 'rule' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1220:1: ( 'rule' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1220:1: ( 'rule' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1221:1: 'rule'
            {
             before(grammarAccess.getSyntaxAccess().getRuleKeyword_4_0()); 
            match(input,20,FOLLOW_20_in_rule__Syntax__Group_4__0__Impl2452); 
             after(grammarAccess.getSyntaxAccess().getRuleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Group_4__0__Impl"


    // $ANTLR start "rule__Syntax__Group_4__1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1234:1: rule__Syntax__Group_4__1 : rule__Syntax__Group_4__1__Impl ;
    public final void rule__Syntax__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1238:1: ( rule__Syntax__Group_4__1__Impl )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1239:2: rule__Syntax__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Syntax__Group_4__1__Impl_in_rule__Syntax__Group_4__12483);
            rule__Syntax__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Group_4__1"


    // $ANTLR start "rule__Syntax__Group_4__1__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1245:1: rule__Syntax__Group_4__1__Impl : ( ( rule__Syntax__RuleAssignment_4_1 ) ) ;
    public final void rule__Syntax__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1249:1: ( ( ( rule__Syntax__RuleAssignment_4_1 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1250:1: ( ( rule__Syntax__RuleAssignment_4_1 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1250:1: ( ( rule__Syntax__RuleAssignment_4_1 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1251:1: ( rule__Syntax__RuleAssignment_4_1 )
            {
             before(grammarAccess.getSyntaxAccess().getRuleAssignment_4_1()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1252:1: ( rule__Syntax__RuleAssignment_4_1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1252:2: rule__Syntax__RuleAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Syntax__RuleAssignment_4_1_in_rule__Syntax__Group_4__1__Impl2510);
            rule__Syntax__RuleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSyntaxAccess().getRuleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Group_4__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1266:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1270:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1271:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02544);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02547);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1278:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1282:1: ( ( 'rule' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1283:1: ( 'rule' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1283:1: ( 'rule' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1284:1: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Rule__Group__0__Impl2575); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1297:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1301:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1302:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12606);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12609);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1309:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1313:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1314:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1314:1: ( ( rule__Rule__NameAssignment_1 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1315:1: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1316:1: ( rule__Rule__NameAssignment_1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1316:2: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl2636);
            rule__Rule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1326:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1330:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1331:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22666);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22669);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1338:1: rule__Rule__Group__2__Impl : ( ':' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1342:1: ( ( ':' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1343:1: ( ':' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1343:1: ( ':' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1344:1: ':'
            {
             before(grammarAccess.getRuleAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Rule__Group__2__Impl2697); 
             after(grammarAccess.getRuleAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1357:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1361:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1362:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32728);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__32731);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1369:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__AlternativesAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1373:1: ( ( ( rule__Rule__AlternativesAssignment_3 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1374:1: ( ( rule__Rule__AlternativesAssignment_3 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1374:1: ( ( rule__Rule__AlternativesAssignment_3 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1375:1: ( rule__Rule__AlternativesAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getAlternativesAssignment_3()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1376:1: ( rule__Rule__AlternativesAssignment_3 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1376:2: rule__Rule__AlternativesAssignment_3
            {
            pushFollow(FOLLOW_rule__Rule__AlternativesAssignment_3_in_rule__Rule__Group__3__Impl2758);
            rule__Rule__AlternativesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAlternativesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1386:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1390:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1391:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__42788);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__42791);
            rule__Rule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1398:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__Group_4__0 )* ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1402:1: ( ( ( rule__Rule__Group_4__0 )* ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1403:1: ( ( rule__Rule__Group_4__0 )* )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1403:1: ( ( rule__Rule__Group_4__0 )* )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1404:1: ( rule__Rule__Group_4__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_4()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1405:1: ( rule__Rule__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1405:2: rule__Rule__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Rule__Group_4__0_in_rule__Rule__Group__4__Impl2818);
            	    rule__Rule__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1415:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1419:1: ( rule__Rule__Group__5__Impl )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1420:2: rule__Rule__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__52849);
            rule__Rule__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1426:1: rule__Rule__Group__5__Impl : ( ';' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1430:1: ( ( ';' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1431:1: ( ';' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1431:1: ( ';' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1432:1: ';'
            {
             before(grammarAccess.getRuleAccess().getSemicolonKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Rule__Group__5__Impl2877); 
             after(grammarAccess.getRuleAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group_4__0"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1457:1: rule__Rule__Group_4__0 : rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 ;
    public final void rule__Rule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1461:1: ( rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1462:2: rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1
            {
            pushFollow(FOLLOW_rule__Rule__Group_4__0__Impl_in_rule__Rule__Group_4__02920);
            rule__Rule__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_4__1_in_rule__Rule__Group_4__02923);
            rule__Rule__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4__0"


    // $ANTLR start "rule__Rule__Group_4__0__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1469:1: rule__Rule__Group_4__0__Impl : ( '|' ) ;
    public final void rule__Rule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1473:1: ( ( '|' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1474:1: ( '|' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1474:1: ( '|' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1475:1: '|'
            {
             before(grammarAccess.getRuleAccess().getVerticalLineKeyword_4_0()); 
            match(input,21,FOLLOW_21_in_rule__Rule__Group_4__0__Impl2951); 
             after(grammarAccess.getRuleAccess().getVerticalLineKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4__0__Impl"


    // $ANTLR start "rule__Rule__Group_4__1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1488:1: rule__Rule__Group_4__1 : rule__Rule__Group_4__1__Impl ;
    public final void rule__Rule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1492:1: ( rule__Rule__Group_4__1__Impl )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1493:2: rule__Rule__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group_4__1__Impl_in_rule__Rule__Group_4__12982);
            rule__Rule__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4__1"


    // $ANTLR start "rule__Rule__Group_4__1__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1499:1: rule__Rule__Group_4__1__Impl : ( ( rule__Rule__AlternativesAssignment_4_1 ) ) ;
    public final void rule__Rule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1503:1: ( ( ( rule__Rule__AlternativesAssignment_4_1 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1504:1: ( ( rule__Rule__AlternativesAssignment_4_1 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1504:1: ( ( rule__Rule__AlternativesAssignment_4_1 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1505:1: ( rule__Rule__AlternativesAssignment_4_1 )
            {
             before(grammarAccess.getRuleAccess().getAlternativesAssignment_4_1()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1506:1: ( rule__Rule__AlternativesAssignment_4_1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1506:2: rule__Rule__AlternativesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Rule__AlternativesAssignment_4_1_in_rule__Rule__Group_4__1__Impl3009);
            rule__Rule__AlternativesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAlternativesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4__1__Impl"


    // $ANTLR start "rule__Grammar__ElementsAssignment"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1521:1: rule__Grammar__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Grammar__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1525:1: ( ( ruleElement ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1526:1: ( ruleElement )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1526:1: ( ruleElement )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1527:1: ruleElement
            {
             before(grammarAccess.getGrammarAccess().getElementsElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Grammar__ElementsAssignment3048);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getGrammarAccess().getElementsElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__ElementsAssignment"


    // $ANTLR start "rule__Block__NameAssignment_1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1536:1: rule__Block__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Block__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1540:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1541:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1541:1: ( RULE_ID )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1542:1: RULE_ID
            {
             before(grammarAccess.getBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Block__NameAssignment_13079); 
             after(grammarAccess.getBlockAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__NameAssignment_1"


    // $ANTLR start "rule__Block__ColumnAssignment_3"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1551:1: rule__Block__ColumnAssignment_3 : ( ruleColumn ) ;
    public final void rule__Block__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1555:1: ( ( ruleColumn ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1556:1: ( ruleColumn )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1556:1: ( ruleColumn )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1557:1: ruleColumn
            {
             before(grammarAccess.getBlockAccess().getColumnColumnParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleColumn_in_rule__Block__ColumnAssignment_33110);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getColumnColumnParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__ColumnAssignment_3"


    // $ANTLR start "rule__Column__NameAssignment_0"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1566:1: rule__Column__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Column__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1570:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1571:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1571:1: ( RULE_ID )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1572:1: RULE_ID
            {
             before(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Column__NameAssignment_03141); 
             after(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__NameAssignment_0"


    // $ANTLR start "rule__Column__MultipleAssignment_1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1581:1: rule__Column__MultipleAssignment_1 : ( ( '*' ) ) ;
    public final void rule__Column__MultipleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1585:1: ( ( ( '*' ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1586:1: ( ( '*' ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1586:1: ( ( '*' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1587:1: ( '*' )
            {
             before(grammarAccess.getColumnAccess().getMultipleAsteriskKeyword_1_0()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1588:1: ( '*' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1589:1: '*'
            {
             before(grammarAccess.getColumnAccess().getMultipleAsteriskKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Column__MultipleAssignment_13177); 
             after(grammarAccess.getColumnAccess().getMultipleAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getColumnAccess().getMultipleAsteriskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__MultipleAssignment_1"


    // $ANTLR start "rule__Column__DefAssignment_2"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1604:1: rule__Column__DefAssignment_2 : ( ruleColumnDefinition ) ;
    public final void rule__Column__DefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1608:1: ( ( ruleColumnDefinition ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1609:1: ( ruleColumnDefinition )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1609:1: ( ruleColumnDefinition )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1610:1: ruleColumnDefinition
            {
             before(grammarAccess.getColumnAccess().getDefColumnDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleColumnDefinition_in_rule__Column__DefAssignment_23216);
            ruleColumnDefinition();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getDefColumnDefinitionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__DefAssignment_2"


    // $ANTLR start "rule__MandatoryColumn__SpecAssignment_1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1619:1: rule__MandatoryColumn__SpecAssignment_1 : ( ruleColumnSpec ) ;
    public final void rule__MandatoryColumn__SpecAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1623:1: ( ( ruleColumnSpec ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1624:1: ( ruleColumnSpec )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1624:1: ( ruleColumnSpec )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1625:1: ruleColumnSpec
            {
             before(grammarAccess.getMandatoryColumnAccess().getSpecColumnSpecParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleColumnSpec_in_rule__MandatoryColumn__SpecAssignment_13247);
            ruleColumnSpec();

            state._fsp--;

             after(grammarAccess.getMandatoryColumnAccess().getSpecColumnSpecParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryColumn__SpecAssignment_1"


    // $ANTLR start "rule__OptionalColumn__SpecAssignment_1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1634:1: rule__OptionalColumn__SpecAssignment_1 : ( ruleColumnSpec ) ;
    public final void rule__OptionalColumn__SpecAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1638:1: ( ( ruleColumnSpec ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1639:1: ( ruleColumnSpec )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1639:1: ( ruleColumnSpec )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1640:1: ruleColumnSpec
            {
             before(grammarAccess.getOptionalColumnAccess().getSpecColumnSpecParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleColumnSpec_in_rule__OptionalColumn__SpecAssignment_13278);
            ruleColumnSpec();

            state._fsp--;

             after(grammarAccess.getOptionalColumnAccess().getSpecColumnSpecParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalColumn__SpecAssignment_1"


    // $ANTLR start "rule__RowSpec__HeaderAssignment_1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1649:1: rule__RowSpec__HeaderAssignment_1 : ( RULE_STRING ) ;
    public final void rule__RowSpec__HeaderAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1653:1: ( ( RULE_STRING ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1654:1: ( RULE_STRING )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1654:1: ( RULE_STRING )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1655:1: RULE_STRING
            {
             before(grammarAccess.getRowSpecAccess().getHeaderSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RowSpec__HeaderAssignment_13309); 
             after(grammarAccess.getRowSpecAccess().getHeaderSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowSpec__HeaderAssignment_1"


    // $ANTLR start "rule__RowSpec__SyntaxAssignment_3"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1664:1: rule__RowSpec__SyntaxAssignment_3 : ( ruleSyntax ) ;
    public final void rule__RowSpec__SyntaxAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1668:1: ( ( ruleSyntax ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1669:1: ( ruleSyntax )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1669:1: ( ruleSyntax )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1670:1: ruleSyntax
            {
             before(grammarAccess.getRowSpecAccess().getSyntaxSyntaxParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSyntax_in_rule__RowSpec__SyntaxAssignment_33340);
            ruleSyntax();

            state._fsp--;

             after(grammarAccess.getRowSpecAccess().getSyntaxSyntaxParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowSpec__SyntaxAssignment_3"


    // $ANTLR start "rule__BlockSpec__KindAssignment_1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1679:1: rule__BlockSpec__KindAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__BlockSpec__KindAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1683:1: ( ( ( RULE_ID ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1684:1: ( ( RULE_ID ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1684:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1685:1: ( RULE_ID )
            {
             before(grammarAccess.getBlockSpecAccess().getKindBlockCrossReference_1_0()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1686:1: ( RULE_ID )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1687:1: RULE_ID
            {
             before(grammarAccess.getBlockSpecAccess().getKindBlockIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BlockSpec__KindAssignment_13375); 
             after(grammarAccess.getBlockSpecAccess().getKindBlockIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getBlockSpecAccess().getKindBlockCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockSpec__KindAssignment_1"


    // $ANTLR start "rule__Syntax__Is_idAssignment_0"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1698:1: rule__Syntax__Is_idAssignment_0 : ( ( 'IDENTIFIER' ) ) ;
    public final void rule__Syntax__Is_idAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1702:1: ( ( ( 'IDENTIFIER' ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1703:1: ( ( 'IDENTIFIER' ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1703:1: ( ( 'IDENTIFIER' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1704:1: ( 'IDENTIFIER' )
            {
             before(grammarAccess.getSyntaxAccess().getIs_idIDENTIFIERKeyword_0_0()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1705:1: ( 'IDENTIFIER' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1706:1: 'IDENTIFIER'
            {
             before(grammarAccess.getSyntaxAccess().getIs_idIDENTIFIERKeyword_0_0()); 
            match(input,23,FOLLOW_23_in_rule__Syntax__Is_idAssignment_03415); 
             after(grammarAccess.getSyntaxAccess().getIs_idIDENTIFIERKeyword_0_0()); 

            }

             after(grammarAccess.getSyntaxAccess().getIs_idIDENTIFIERKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Is_idAssignment_0"


    // $ANTLR start "rule__Syntax__Is_stringAssignment_1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1721:1: rule__Syntax__Is_stringAssignment_1 : ( ( 'STRING' ) ) ;
    public final void rule__Syntax__Is_stringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1725:1: ( ( ( 'STRING' ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1726:1: ( ( 'STRING' ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1726:1: ( ( 'STRING' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1727:1: ( 'STRING' )
            {
             before(grammarAccess.getSyntaxAccess().getIs_stringSTRINGKeyword_1_0()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1728:1: ( 'STRING' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1729:1: 'STRING'
            {
             before(grammarAccess.getSyntaxAccess().getIs_stringSTRINGKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__Syntax__Is_stringAssignment_13459); 
             after(grammarAccess.getSyntaxAccess().getIs_stringSTRINGKeyword_1_0()); 

            }

             after(grammarAccess.getSyntaxAccess().getIs_stringSTRINGKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Is_stringAssignment_1"


    // $ANTLR start "rule__Syntax__Is_intAssignment_2"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1744:1: rule__Syntax__Is_intAssignment_2 : ( ( 'INTEGER' ) ) ;
    public final void rule__Syntax__Is_intAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1748:1: ( ( ( 'INTEGER' ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1749:1: ( ( 'INTEGER' ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1749:1: ( ( 'INTEGER' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1750:1: ( 'INTEGER' )
            {
             before(grammarAccess.getSyntaxAccess().getIs_intINTEGERKeyword_2_0()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1751:1: ( 'INTEGER' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1752:1: 'INTEGER'
            {
             before(grammarAccess.getSyntaxAccess().getIs_intINTEGERKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__Syntax__Is_intAssignment_23503); 
             after(grammarAccess.getSyntaxAccess().getIs_intINTEGERKeyword_2_0()); 

            }

             after(grammarAccess.getSyntaxAccess().getIs_intINTEGERKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Is_intAssignment_2"


    // $ANTLR start "rule__Syntax__TokenAssignment_3_1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1767:1: rule__Syntax__TokenAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Syntax__TokenAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1771:1: ( ( RULE_STRING ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1772:1: ( RULE_STRING )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1772:1: ( RULE_STRING )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1773:1: RULE_STRING
            {
             before(grammarAccess.getSyntaxAccess().getTokenSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Syntax__TokenAssignment_3_13542); 
             after(grammarAccess.getSyntaxAccess().getTokenSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__TokenAssignment_3_1"


    // $ANTLR start "rule__Syntax__RuleAssignment_4_1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1782:1: rule__Syntax__RuleAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Syntax__RuleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1786:1: ( ( ( RULE_ID ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1787:1: ( ( RULE_ID ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1787:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1788:1: ( RULE_ID )
            {
             before(grammarAccess.getSyntaxAccess().getRuleRuleCrossReference_4_1_0()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1789:1: ( RULE_ID )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1790:1: RULE_ID
            {
             before(grammarAccess.getSyntaxAccess().getRuleRuleIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Syntax__RuleAssignment_4_13577); 
             after(grammarAccess.getSyntaxAccess().getRuleRuleIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getSyntaxAccess().getRuleRuleCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__RuleAssignment_4_1"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1801:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1805:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1806:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1806:1: ( RULE_ID )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1807:1: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_13612); 
             after(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NameAssignment_1"


    // $ANTLR start "rule__Rule__AlternativesAssignment_3"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1816:1: rule__Rule__AlternativesAssignment_3 : ( ruleSyntaxSeq ) ;
    public final void rule__Rule__AlternativesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1820:1: ( ( ruleSyntaxSeq ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1821:1: ( ruleSyntaxSeq )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1821:1: ( ruleSyntaxSeq )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1822:1: ruleSyntaxSeq
            {
             before(grammarAccess.getRuleAccess().getAlternativesSyntaxSeqParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSyntaxSeq_in_rule__Rule__AlternativesAssignment_33643);
            ruleSyntaxSeq();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAlternativesSyntaxSeqParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__AlternativesAssignment_3"


    // $ANTLR start "rule__Rule__AlternativesAssignment_4_1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1831:1: rule__Rule__AlternativesAssignment_4_1 : ( ruleSyntaxSeq ) ;
    public final void rule__Rule__AlternativesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1835:1: ( ( ruleSyntaxSeq ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1836:1: ( ruleSyntaxSeq )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1836:1: ( ruleSyntaxSeq )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1837:1: ruleSyntaxSeq
            {
             before(grammarAccess.getRuleAccess().getAlternativesSyntaxSeqParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleSyntaxSeq_in_rule__Rule__AlternativesAssignment_4_13674);
            ruleSyntaxSeq();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAlternativesSyntaxSeqParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__AlternativesAssignment_4_1"


    // $ANTLR start "rule__SyntaxSeq__PartsAssignment"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1846:1: rule__SyntaxSeq__PartsAssignment : ( ruleSyntax ) ;
    public final void rule__SyntaxSeq__PartsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1850:1: ( ( ruleSyntax ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1851:1: ( ruleSyntax )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1851:1: ( ruleSyntax )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1852:1: ruleSyntax
            {
             before(grammarAccess.getSyntaxSeqAccess().getPartsSyntaxParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSyntax_in_rule__SyntaxSeq__PartsAssignment3705);
            ruleSyntax();

            state._fsp--;

             after(grammarAccess.getSyntaxSeqAccess().getPartsSyntaxParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntaxSeq__PartsAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleGrammar_in_entryRuleGrammar61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrammar68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grammar__ElementsAssignment_in_ruleGrammar94 = new BitSet(new long[]{0x0000000000100802L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleElement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0_in_ruleBlock215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumn_in_entryRuleColumn242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumn249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__Group__0_in_ruleColumn275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnDefinition_in_entryRuleColumnDefinition302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnDefinition309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnDefinition__Alternatives_in_ruleColumnDefinition335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatoryColumn_in_entryRuleMandatoryColumn362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatoryColumn369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryColumn__Group__0_in_ruleMandatoryColumn395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalColumn_in_entryRuleOptionalColumn422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalColumn429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalColumn__Group__0_in_ruleOptionalColumn455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnSpec_in_entryRuleColumnSpec482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnSpec489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnSpec__Alternatives_in_ruleColumnSpec515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRowSpec_in_entryRuleRowSpec542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRowSpec549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RowSpec__Group__0_in_ruleRowSpec575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockSpec_in_entryRuleBlockSpec602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockSpec609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockSpec__Group__0_in_ruleBlockSpec635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntax_in_entryRuleSyntax662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSyntax669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Alternatives_in_ruleSyntax695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntaxSeq_in_entryRuleSyntaxSeq782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSyntaxSeq789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntaxSeq__PartsAssignment_in_ruleSyntaxSeq817 = new BitSet(new long[]{0x0000000003980002L});
    public static final BitSet FOLLOW_rule__SyntaxSeq__PartsAssignment_in_ruleSyntaxSeq829 = new BitSet(new long[]{0x0000000003980002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__Element__Alternatives868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Element__Alternatives885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatoryColumn_in_rule__ColumnDefinition__Alternatives917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalColumn_in_rule__ColumnDefinition__Alternatives934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRowSpec_in_rule__ColumnSpec__Alternatives966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockSpec_in_rule__ColumnSpec__Alternatives983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Is_idAssignment_0_in_rule__Syntax__Alternatives1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Is_stringAssignment_1_in_rule__Syntax__Alternatives1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Is_intAssignment_2_in_rule__Syntax__Alternatives1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Group_3__0_in_rule__Syntax__Alternatives1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Group_4__0_in_rule__Syntax__Alternatives1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__01118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__01121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Block__Group__0__Impl1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__11180 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Block__Group__2_in_rule__Block__Group__11183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__NameAssignment_1_in_rule__Block__Group__1__Impl1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__21240 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__Block__Group__3_in_rule__Block__Group__21243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Block__Group__2__Impl1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__31302 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__Block__Group__4_in_rule__Block__Group__31305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__ColumnAssignment_3_in_rule__Block__Group__3__Impl1332 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Block__Group__4__Impl_in_rule__Block__Group__41363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Block__Group__4__Impl1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__Group__0__Impl_in_rule__Column__Group__01432 = new BitSet(new long[]{0x0000000000418000L});
    public static final BitSet FOLLOW_rule__Column__Group__1_in_rule__Column__Group__01435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__NameAssignment_0_in_rule__Column__Group__0__Impl1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__Group__1__Impl_in_rule__Column__Group__11492 = new BitSet(new long[]{0x0000000000418000L});
    public static final BitSet FOLLOW_rule__Column__Group__2_in_rule__Column__Group__11495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__MultipleAssignment_1_in_rule__Column__Group__1__Impl1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__Group__2__Impl_in_rule__Column__Group__21553 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Column__Group__3_in_rule__Column__Group__21556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__DefAssignment_2_in_rule__Column__Group__2__Impl1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__Group__3__Impl_in_rule__Column__Group__31613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Column__Group__3__Impl1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryColumn__Group__0__Impl_in_rule__MandatoryColumn__Group__01680 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_rule__MandatoryColumn__Group__1_in_rule__MandatoryColumn__Group__01683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MandatoryColumn__Group__0__Impl1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryColumn__Group__1__Impl_in_rule__MandatoryColumn__Group__11742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryColumn__SpecAssignment_1_in_rule__MandatoryColumn__Group__1__Impl1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalColumn__Group__0__Impl_in_rule__OptionalColumn__Group__01803 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_rule__OptionalColumn__Group__1_in_rule__OptionalColumn__Group__01806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__OptionalColumn__Group__0__Impl1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalColumn__Group__1__Impl_in_rule__OptionalColumn__Group__11865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalColumn__SpecAssignment_1_in_rule__OptionalColumn__Group__1__Impl1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RowSpec__Group__0__Impl_in_rule__RowSpec__Group__01926 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RowSpec__Group__1_in_rule__RowSpec__Group__01929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RowSpec__Group__0__Impl1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RowSpec__Group__1__Impl_in_rule__RowSpec__Group__11988 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__RowSpec__Group__2_in_rule__RowSpec__Group__11991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RowSpec__HeaderAssignment_1_in_rule__RowSpec__Group__1__Impl2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RowSpec__Group__2__Impl_in_rule__RowSpec__Group__22048 = new BitSet(new long[]{0x0000000003980000L});
    public static final BitSet FOLLOW_rule__RowSpec__Group__3_in_rule__RowSpec__Group__22051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RowSpec__Group__2__Impl2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RowSpec__Group__3__Impl_in_rule__RowSpec__Group__32110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RowSpec__SyntaxAssignment_3_in_rule__RowSpec__Group__3__Impl2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockSpec__Group__0__Impl_in_rule__BlockSpec__Group__02175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BlockSpec__Group__1_in_rule__BlockSpec__Group__02178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BlockSpec__Group__0__Impl2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockSpec__Group__1__Impl_in_rule__BlockSpec__Group__12237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockSpec__KindAssignment_1_in_rule__BlockSpec__Group__1__Impl2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Group_3__0__Impl_in_rule__Syntax__Group_3__02298 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Syntax__Group_3__1_in_rule__Syntax__Group_3__02301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Syntax__Group_3__0__Impl2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Group_3__1__Impl_in_rule__Syntax__Group_3__12360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__TokenAssignment_3_1_in_rule__Syntax__Group_3__1__Impl2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Group_4__0__Impl_in_rule__Syntax__Group_4__02421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Syntax__Group_4__1_in_rule__Syntax__Group_4__02424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Syntax__Group_4__0__Impl2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Group_4__1__Impl_in_rule__Syntax__Group_4__12483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__RuleAssignment_4_1_in_rule__Syntax__Group_4__1__Impl2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Rule__Group__0__Impl2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12606 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22666 = new BitSet(new long[]{0x0000000003980000L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Rule__Group__2__Impl2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32728 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__32731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__AlternativesAssignment_3_in_rule__Rule__Group__3__Impl2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__42788 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__42791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_4__0_in_rule__Rule__Group__4__Impl2818 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__52849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Rule__Group__5__Impl2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_4__0__Impl_in_rule__Rule__Group_4__02920 = new BitSet(new long[]{0x0000000003980000L});
    public static final BitSet FOLLOW_rule__Rule__Group_4__1_in_rule__Rule__Group_4__02923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Rule__Group_4__0__Impl2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_4__1__Impl_in_rule__Rule__Group_4__12982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__AlternativesAssignment_4_1_in_rule__Rule__Group_4__1__Impl3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Grammar__ElementsAssignment3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Block__NameAssignment_13079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumn_in_rule__Block__ColumnAssignment_33110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Column__NameAssignment_03141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Column__MultipleAssignment_13177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnDefinition_in_rule__Column__DefAssignment_23216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnSpec_in_rule__MandatoryColumn__SpecAssignment_13247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnSpec_in_rule__OptionalColumn__SpecAssignment_13278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RowSpec__HeaderAssignment_13309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntax_in_rule__RowSpec__SyntaxAssignment_33340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BlockSpec__KindAssignment_13375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Syntax__Is_idAssignment_03415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Syntax__Is_stringAssignment_13459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Syntax__Is_intAssignment_23503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Syntax__TokenAssignment_3_13542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Syntax__RuleAssignment_4_13577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_13612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntaxSeq_in_rule__Rule__AlternativesAssignment_33643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntaxSeq_in_rule__Rule__AlternativesAssignment_4_13674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntax_in_rule__SyntaxSeq__PartsAssignment3705 = new BitSet(new long[]{0x0000000000000002L});

}