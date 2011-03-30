package de.sebastianbenz.task.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.sebastianbenz.task.services.QueryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQueryParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'!='", "'<='", "'<'", "'>='", "'>'", "'or'", "'and'", "'not'", "'('", "')'", "'project'", "':'", "'task'", "'text'", "'@'"
    };
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalQueryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQueryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQueryParser.tokenNames; }
    public String getGrammarFileName() { return "../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g"; }


     
     	private QueryGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(QueryGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleQuery"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:61:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:62:1: ( ruleQuery EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:63:1: ruleQuery EOF
            {
             before(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_ruleQuery_in_entryRuleQuery61);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getQueryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery68); 

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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:70:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:74:2: ( ( ( rule__Query__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:75:1: ( ( rule__Query__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:75:1: ( ( rule__Query__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:76:1: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:77:1: ( rule__Query__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:77:2: rule__Query__Group__0
            {
            pushFollow(FOLLOW_rule__Query__Group__0_in_ruleQuery94);
            rule__Query__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getGroup()); 

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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleOrExpr"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:89:1: entryRuleOrExpr : ruleOrExpr EOF ;
    public final void entryRuleOrExpr() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:90:1: ( ruleOrExpr EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:91:1: ruleOrExpr EOF
            {
             before(grammarAccess.getOrExprRule()); 
            pushFollow(FOLLOW_ruleOrExpr_in_entryRuleOrExpr121);
            ruleOrExpr();

            state._fsp--;

             after(grammarAccess.getOrExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpr128); 

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
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:98:1: ruleOrExpr : ( ( rule__OrExpr__Group__0 ) ) ;
    public final void ruleOrExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:102:2: ( ( ( rule__OrExpr__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:103:1: ( ( rule__OrExpr__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:103:1: ( ( rule__OrExpr__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:104:1: ( rule__OrExpr__Group__0 )
            {
             before(grammarAccess.getOrExprAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:105:1: ( rule__OrExpr__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:105:2: rule__OrExpr__Group__0
            {
            pushFollow(FOLLOW_rule__OrExpr__Group__0_in_ruleOrExpr154);
            rule__OrExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrExprAccess().getGroup()); 

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
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleAndExpr"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:117:1: entryRuleAndExpr : ruleAndExpr EOF ;
    public final void entryRuleAndExpr() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:118:1: ( ruleAndExpr EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:119:1: ruleAndExpr EOF
            {
             before(grammarAccess.getAndExprRule()); 
            pushFollow(FOLLOW_ruleAndExpr_in_entryRuleAndExpr181);
            ruleAndExpr();

            state._fsp--;

             after(grammarAccess.getAndExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpr188); 

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
    // $ANTLR end "entryRuleAndExpr"


    // $ANTLR start "ruleAndExpr"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:126:1: ruleAndExpr : ( ( rule__AndExpr__Group__0 ) ) ;
    public final void ruleAndExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:130:2: ( ( ( rule__AndExpr__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:131:1: ( ( rule__AndExpr__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:131:1: ( ( rule__AndExpr__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:132:1: ( rule__AndExpr__Group__0 )
            {
             before(grammarAccess.getAndExprAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:133:1: ( rule__AndExpr__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:133:2: rule__AndExpr__Group__0
            {
            pushFollow(FOLLOW_rule__AndExpr__Group__0_in_ruleAndExpr214);
            rule__AndExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExprAccess().getGroup()); 

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
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRuleCompEqExpr"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:145:1: entryRuleCompEqExpr : ruleCompEqExpr EOF ;
    public final void entryRuleCompEqExpr() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:146:1: ( ruleCompEqExpr EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:147:1: ruleCompEqExpr EOF
            {
             before(grammarAccess.getCompEqExprRule()); 
            pushFollow(FOLLOW_ruleCompEqExpr_in_entryRuleCompEqExpr241);
            ruleCompEqExpr();

            state._fsp--;

             after(grammarAccess.getCompEqExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompEqExpr248); 

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
    // $ANTLR end "entryRuleCompEqExpr"


    // $ANTLR start "ruleCompEqExpr"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:154:1: ruleCompEqExpr : ( ( rule__CompEqExpr__Group__0 ) ) ;
    public final void ruleCompEqExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:158:2: ( ( ( rule__CompEqExpr__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:159:1: ( ( rule__CompEqExpr__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:159:1: ( ( rule__CompEqExpr__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:160:1: ( rule__CompEqExpr__Group__0 )
            {
             before(grammarAccess.getCompEqExprAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:161:1: ( rule__CompEqExpr__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:161:2: rule__CompEqExpr__Group__0
            {
            pushFollow(FOLLOW_rule__CompEqExpr__Group__0_in_ruleCompEqExpr274);
            rule__CompEqExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompEqExprAccess().getGroup()); 

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
    // $ANTLR end "ruleCompEqExpr"


    // $ANTLR start "entryRuleCompExpr"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:173:1: entryRuleCompExpr : ruleCompExpr EOF ;
    public final void entryRuleCompExpr() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:174:1: ( ruleCompExpr EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:175:1: ruleCompExpr EOF
            {
             before(grammarAccess.getCompExprRule()); 
            pushFollow(FOLLOW_ruleCompExpr_in_entryRuleCompExpr301);
            ruleCompExpr();

            state._fsp--;

             after(grammarAccess.getCompExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompExpr308); 

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
    // $ANTLR end "entryRuleCompExpr"


    // $ANTLR start "ruleCompExpr"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:182:1: ruleCompExpr : ( ( rule__CompExpr__Group__0 ) ) ;
    public final void ruleCompExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:186:2: ( ( ( rule__CompExpr__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:187:1: ( ( rule__CompExpr__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:187:1: ( ( rule__CompExpr__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:188:1: ( rule__CompExpr__Group__0 )
            {
             before(grammarAccess.getCompExprAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:189:1: ( rule__CompExpr__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:189:2: rule__CompExpr__Group__0
            {
            pushFollow(FOLLOW_rule__CompExpr__Group__0_in_ruleCompExpr334);
            rule__CompExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompExprAccess().getGroup()); 

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
    // $ANTLR end "ruleCompExpr"


    // $ANTLR start "entryRuleUnaryExpr"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:201:1: entryRuleUnaryExpr : ruleUnaryExpr EOF ;
    public final void entryRuleUnaryExpr() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:202:1: ( ruleUnaryExpr EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:203:1: ruleUnaryExpr EOF
            {
             before(grammarAccess.getUnaryExprRule()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr361);
            ruleUnaryExpr();

            state._fsp--;

             after(grammarAccess.getUnaryExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpr368); 

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
    // $ANTLR end "entryRuleUnaryExpr"


    // $ANTLR start "ruleUnaryExpr"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:210:1: ruleUnaryExpr : ( ( rule__UnaryExpr__Alternatives ) ) ;
    public final void ruleUnaryExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:214:2: ( ( ( rule__UnaryExpr__Alternatives ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:215:1: ( ( rule__UnaryExpr__Alternatives ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:215:1: ( ( rule__UnaryExpr__Alternatives ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:216:1: ( rule__UnaryExpr__Alternatives )
            {
             before(grammarAccess.getUnaryExprAccess().getAlternatives()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:217:1: ( rule__UnaryExpr__Alternatives )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:217:2: rule__UnaryExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__UnaryExpr__Alternatives_in_ruleUnaryExpr394);
            rule__UnaryExpr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExprAccess().getAlternatives()); 

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
    // $ANTLR end "ruleUnaryExpr"


    // $ANTLR start "entryRuleAtom"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:229:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:230:1: ( ruleAtom EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:231:1: ruleAtom EOF
            {
             before(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom421);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getAtomRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom428); 

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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:238:1: ruleAtom : ( ( rule__Atom__Alternatives ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:242:2: ( ( ( rule__Atom__Alternatives ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:243:1: ( ( rule__Atom__Alternatives ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:243:1: ( ( rule__Atom__Alternatives ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:244:1: ( rule__Atom__Alternatives )
            {
             before(grammarAccess.getAtomAccess().getAlternatives()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:245:1: ( rule__Atom__Alternatives )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:245:2: rule__Atom__Alternatives
            {
            pushFollow(FOLLOW_rule__Atom__Alternatives_in_ruleAtom454);
            rule__Atom__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleValue"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:257:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:258:1: ( ruleValue EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:259:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue481);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue488); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:266:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:270:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:271:1: ( ( rule__Value__Alternatives ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:271:1: ( ( rule__Value__Alternatives ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:272:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:273:1: ( rule__Value__Alternatives )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:273:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue514);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleParenExpr"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:285:1: entryRuleParenExpr : ruleParenExpr EOF ;
    public final void entryRuleParenExpr() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:286:1: ( ruleParenExpr EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:287:1: ruleParenExpr EOF
            {
             before(grammarAccess.getParenExprRule()); 
            pushFollow(FOLLOW_ruleParenExpr_in_entryRuleParenExpr541);
            ruleParenExpr();

            state._fsp--;

             after(grammarAccess.getParenExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenExpr548); 

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
    // $ANTLR end "entryRuleParenExpr"


    // $ANTLR start "ruleParenExpr"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:294:1: ruleParenExpr : ( ( rule__ParenExpr__Group__0 ) ) ;
    public final void ruleParenExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:298:2: ( ( ( rule__ParenExpr__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:299:1: ( ( rule__ParenExpr__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:299:1: ( ( rule__ParenExpr__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:300:1: ( rule__ParenExpr__Group__0 )
            {
             before(grammarAccess.getParenExprAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:301:1: ( rule__ParenExpr__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:301:2: rule__ParenExpr__Group__0
            {
            pushFollow(FOLLOW_rule__ParenExpr__Group__0_in_ruleParenExpr574);
            rule__ParenExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenExprAccess().getGroup()); 

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
    // $ANTLR end "ruleParenExpr"


    // $ANTLR start "entryRuleProjectReference"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:313:1: entryRuleProjectReference : ruleProjectReference EOF ;
    public final void entryRuleProjectReference() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:314:1: ( ruleProjectReference EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:315:1: ruleProjectReference EOF
            {
             before(grammarAccess.getProjectReferenceRule()); 
            pushFollow(FOLLOW_ruleProjectReference_in_entryRuleProjectReference601);
            ruleProjectReference();

            state._fsp--;

             after(grammarAccess.getProjectReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjectReference608); 

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
    // $ANTLR end "entryRuleProjectReference"


    // $ANTLR start "ruleProjectReference"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:322:1: ruleProjectReference : ( ( rule__ProjectReference__Group__0 ) ) ;
    public final void ruleProjectReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:326:2: ( ( ( rule__ProjectReference__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:327:1: ( ( rule__ProjectReference__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:327:1: ( ( rule__ProjectReference__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:328:1: ( rule__ProjectReference__Group__0 )
            {
             before(grammarAccess.getProjectReferenceAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:329:1: ( rule__ProjectReference__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:329:2: rule__ProjectReference__Group__0
            {
            pushFollow(FOLLOW_rule__ProjectReference__Group__0_in_ruleProjectReference634);
            rule__ProjectReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectReferenceAccess().getGroup()); 

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
    // $ANTLR end "ruleProjectReference"


    // $ANTLR start "entryRuleTaskReference"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:341:1: entryRuleTaskReference : ruleTaskReference EOF ;
    public final void entryRuleTaskReference() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:342:1: ( ruleTaskReference EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:343:1: ruleTaskReference EOF
            {
             before(grammarAccess.getTaskReferenceRule()); 
            pushFollow(FOLLOW_ruleTaskReference_in_entryRuleTaskReference661);
            ruleTaskReference();

            state._fsp--;

             after(grammarAccess.getTaskReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaskReference668); 

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
    // $ANTLR end "entryRuleTaskReference"


    // $ANTLR start "ruleTaskReference"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:350:1: ruleTaskReference : ( ( rule__TaskReference__Group__0 ) ) ;
    public final void ruleTaskReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:354:2: ( ( ( rule__TaskReference__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:355:1: ( ( rule__TaskReference__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:355:1: ( ( rule__TaskReference__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:356:1: ( rule__TaskReference__Group__0 )
            {
             before(grammarAccess.getTaskReferenceAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:357:1: ( rule__TaskReference__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:357:2: rule__TaskReference__Group__0
            {
            pushFollow(FOLLOW_rule__TaskReference__Group__0_in_ruleTaskReference694);
            rule__TaskReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskReferenceAccess().getGroup()); 

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
    // $ANTLR end "ruleTaskReference"


    // $ANTLR start "entryRuleTextReference"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:369:1: entryRuleTextReference : ruleTextReference EOF ;
    public final void entryRuleTextReference() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:370:1: ( ruleTextReference EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:371:1: ruleTextReference EOF
            {
             before(grammarAccess.getTextReferenceRule()); 
            pushFollow(FOLLOW_ruleTextReference_in_entryRuleTextReference721);
            ruleTextReference();

            state._fsp--;

             after(grammarAccess.getTextReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextReference728); 

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
    // $ANTLR end "entryRuleTextReference"


    // $ANTLR start "ruleTextReference"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:378:1: ruleTextReference : ( ( rule__TextReference__Group__0 ) ) ;
    public final void ruleTextReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:382:2: ( ( ( rule__TextReference__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:383:1: ( ( rule__TextReference__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:383:1: ( ( rule__TextReference__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:384:1: ( rule__TextReference__Group__0 )
            {
             before(grammarAccess.getTextReferenceAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:385:1: ( rule__TextReference__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:385:2: rule__TextReference__Group__0
            {
            pushFollow(FOLLOW_rule__TextReference__Group__0_in_ruleTextReference754);
            rule__TextReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextReferenceAccess().getGroup()); 

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
    // $ANTLR end "ruleTextReference"


    // $ANTLR start "entryRuleWords"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:397:1: entryRuleWords : ruleWords EOF ;
    public final void entryRuleWords() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:398:1: ( ruleWords EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:399:1: ruleWords EOF
            {
             before(grammarAccess.getWordsRule()); 
            pushFollow(FOLLOW_ruleWords_in_entryRuleWords781);
            ruleWords();

            state._fsp--;

             after(grammarAccess.getWordsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWords788); 

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
    // $ANTLR end "entryRuleWords"


    // $ANTLR start "ruleWords"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:406:1: ruleWords : ( ( rule__Words__Group__0 ) ) ;
    public final void ruleWords() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:410:2: ( ( ( rule__Words__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:411:1: ( ( rule__Words__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:411:1: ( ( rule__Words__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:412:1: ( rule__Words__Group__0 )
            {
             before(grammarAccess.getWordsAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:413:1: ( rule__Words__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:413:2: rule__Words__Group__0
            {
            pushFollow(FOLLOW_rule__Words__Group__0_in_ruleWords814);
            rule__Words__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWordsAccess().getGroup()); 

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
    // $ANTLR end "ruleWords"


    // $ANTLR start "entryRuleWord"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:425:1: entryRuleWord : ruleWord EOF ;
    public final void entryRuleWord() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:426:1: ( ruleWord EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:427:1: ruleWord EOF
            {
             before(grammarAccess.getWordRule()); 
            pushFollow(FOLLOW_ruleWord_in_entryRuleWord841);
            ruleWord();

            state._fsp--;

             after(grammarAccess.getWordRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWord848); 

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
    // $ANTLR end "entryRuleWord"


    // $ANTLR start "ruleWord"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:434:1: ruleWord : ( ( rule__Word__ValueAssignment ) ) ;
    public final void ruleWord() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:438:2: ( ( ( rule__Word__ValueAssignment ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:439:1: ( ( rule__Word__ValueAssignment ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:439:1: ( ( rule__Word__ValueAssignment ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:440:1: ( rule__Word__ValueAssignment )
            {
             before(grammarAccess.getWordAccess().getValueAssignment()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:441:1: ( rule__Word__ValueAssignment )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:441:2: rule__Word__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Word__ValueAssignment_in_ruleWord874);
            rule__Word__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getWordAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleWord"


    // $ANTLR start "entryRulePhrase"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:453:1: entryRulePhrase : rulePhrase EOF ;
    public final void entryRulePhrase() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:454:1: ( rulePhrase EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:455:1: rulePhrase EOF
            {
             before(grammarAccess.getPhraseRule()); 
            pushFollow(FOLLOW_rulePhrase_in_entryRulePhrase901);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getPhraseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhrase908); 

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
    // $ANTLR end "entryRulePhrase"


    // $ANTLR start "rulePhrase"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:462:1: rulePhrase : ( ( rule__Phrase__ValueAssignment ) ) ;
    public final void rulePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:466:2: ( ( ( rule__Phrase__ValueAssignment ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:467:1: ( ( rule__Phrase__ValueAssignment ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:467:1: ( ( rule__Phrase__ValueAssignment ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:468:1: ( rule__Phrase__ValueAssignment )
            {
             before(grammarAccess.getPhraseAccess().getValueAssignment()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:469:1: ( rule__Phrase__ValueAssignment )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:469:2: rule__Phrase__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Phrase__ValueAssignment_in_rulePhrase934);
            rule__Phrase__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getValueAssignment()); 

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
    // $ANTLR end "rulePhrase"


    // $ANTLR start "entryRuleTagReference"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:481:1: entryRuleTagReference : ruleTagReference EOF ;
    public final void entryRuleTagReference() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:482:1: ( ruleTagReference EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:483:1: ruleTagReference EOF
            {
             before(grammarAccess.getTagReferenceRule()); 
            pushFollow(FOLLOW_ruleTagReference_in_entryRuleTagReference961);
            ruleTagReference();

            state._fsp--;

             after(grammarAccess.getTagReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagReference968); 

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
    // $ANTLR end "entryRuleTagReference"


    // $ANTLR start "ruleTagReference"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:490:1: ruleTagReference : ( ( rule__TagReference__Group__0 ) ) ;
    public final void ruleTagReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:494:2: ( ( ( rule__TagReference__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:495:1: ( ( rule__TagReference__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:495:1: ( ( rule__TagReference__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:496:1: ( rule__TagReference__Group__0 )
            {
             before(grammarAccess.getTagReferenceAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:497:1: ( rule__TagReference__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:497:2: rule__TagReference__Group__0
            {
            pushFollow(FOLLOW_rule__TagReference__Group__0_in_ruleTagReference994);
            rule__TagReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTagReferenceAccess().getGroup()); 

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
    // $ANTLR end "ruleTagReference"


    // $ANTLR start "ruleCompEqOperator"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:510:1: ruleCompEqOperator : ( ( rule__CompEqOperator__Alternatives ) ) ;
    public final void ruleCompEqOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:514:1: ( ( ( rule__CompEqOperator__Alternatives ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:515:1: ( ( rule__CompEqOperator__Alternatives ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:515:1: ( ( rule__CompEqOperator__Alternatives ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:516:1: ( rule__CompEqOperator__Alternatives )
            {
             before(grammarAccess.getCompEqOperatorAccess().getAlternatives()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:517:1: ( rule__CompEqOperator__Alternatives )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:517:2: rule__CompEqOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__CompEqOperator__Alternatives_in_ruleCompEqOperator1031);
            rule__CompEqOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCompEqOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCompEqOperator"


    // $ANTLR start "ruleCompOperator"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:529:1: ruleCompOperator : ( ( rule__CompOperator__Alternatives ) ) ;
    public final void ruleCompOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:533:1: ( ( ( rule__CompOperator__Alternatives ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:534:1: ( ( rule__CompOperator__Alternatives ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:534:1: ( ( rule__CompOperator__Alternatives ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:535:1: ( rule__CompOperator__Alternatives )
            {
             before(grammarAccess.getCompOperatorAccess().getAlternatives()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:536:1: ( rule__CompOperator__Alternatives )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:536:2: rule__CompOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__CompOperator__Alternatives_in_ruleCompOperator1067);
            rule__CompOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCompOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCompOperator"


    // $ANTLR start "rule__UnaryExpr__Alternatives"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:547:1: rule__UnaryExpr__Alternatives : ( ( ruleAtom ) | ( ( rule__UnaryExpr__Group_1__0 ) ) );
    public final void rule__UnaryExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:551:1: ( ( ruleAtom ) | ( ( rule__UnaryExpr__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)||LA1_0==20||LA1_0==22||(LA1_0>=24 && LA1_0<=26)) ) {
                alt1=1;
            }
            else if ( (LA1_0==19) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:552:1: ( ruleAtom )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:552:1: ( ruleAtom )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:553:1: ruleAtom
                    {
                     before(grammarAccess.getUnaryExprAccess().getAtomParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAtom_in_rule__UnaryExpr__Alternatives1102);
                    ruleAtom();

                    state._fsp--;

                     after(grammarAccess.getUnaryExprAccess().getAtomParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:558:6: ( ( rule__UnaryExpr__Group_1__0 ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:558:6: ( ( rule__UnaryExpr__Group_1__0 ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:559:1: ( rule__UnaryExpr__Group_1__0 )
                    {
                     before(grammarAccess.getUnaryExprAccess().getGroup_1()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:560:1: ( rule__UnaryExpr__Group_1__0 )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:560:2: rule__UnaryExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__UnaryExpr__Group_1__0_in_rule__UnaryExpr__Alternatives1119);
                    rule__UnaryExpr__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryExprAccess().getGroup_1()); 

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
    // $ANTLR end "rule__UnaryExpr__Alternatives"


    // $ANTLR start "rule__Atom__Alternatives"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:569:1: rule__Atom__Alternatives : ( ( ruleValue ) | ( ruleWords ) | ( ruleParenExpr ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:573:1: ( ( ruleValue ) | ( ruleWords ) | ( ruleParenExpr ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case 22:
            case 24:
            case 25:
            case 26:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==EOF||(LA2_2>=11 && LA2_2<=18)||LA2_2==21) ) {
                    alt2=1;
                }
                else if ( (LA2_2==RULE_ID) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:574:1: ( ruleValue )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:574:1: ( ruleValue )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:575:1: ruleValue
                    {
                     before(grammarAccess.getAtomAccess().getValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleValue_in_rule__Atom__Alternatives1152);
                    ruleValue();

                    state._fsp--;

                     after(grammarAccess.getAtomAccess().getValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:580:6: ( ruleWords )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:580:6: ( ruleWords )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:581:1: ruleWords
                    {
                     before(grammarAccess.getAtomAccess().getWordsParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleWords_in_rule__Atom__Alternatives1169);
                    ruleWords();

                    state._fsp--;

                     after(grammarAccess.getAtomAccess().getWordsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:586:6: ( ruleParenExpr )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:586:6: ( ruleParenExpr )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:587:1: ruleParenExpr
                    {
                     before(grammarAccess.getAtomAccess().getParenExprParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleParenExpr_in_rule__Atom__Alternatives1186);
                    ruleParenExpr();

                    state._fsp--;

                     after(grammarAccess.getAtomAccess().getParenExprParserRuleCall_2()); 

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
    // $ANTLR end "rule__Atom__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:597:1: rule__Value__Alternatives : ( ( ruleProjectReference ) | ( ruleWord ) | ( rulePhrase ) | ( ruleTagReference ) | ( ruleTextReference ) | ( ruleTaskReference ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:601:1: ( ( ruleProjectReference ) | ( ruleWord ) | ( rulePhrase ) | ( ruleTagReference ) | ( ruleTextReference ) | ( ruleTaskReference ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case RULE_STRING:
                {
                alt3=3;
                }
                break;
            case 26:
                {
                alt3=4;
                }
                break;
            case 25:
                {
                alt3=5;
                }
                break;
            case 24:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:602:1: ( ruleProjectReference )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:602:1: ( ruleProjectReference )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:603:1: ruleProjectReference
                    {
                     before(grammarAccess.getValueAccess().getProjectReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleProjectReference_in_rule__Value__Alternatives1218);
                    ruleProjectReference();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getProjectReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:608:6: ( ruleWord )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:608:6: ( ruleWord )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:609:1: ruleWord
                    {
                     before(grammarAccess.getValueAccess().getWordParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleWord_in_rule__Value__Alternatives1235);
                    ruleWord();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getWordParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:614:6: ( rulePhrase )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:614:6: ( rulePhrase )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:615:1: rulePhrase
                    {
                     before(grammarAccess.getValueAccess().getPhraseParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePhrase_in_rule__Value__Alternatives1252);
                    rulePhrase();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getPhraseParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:620:6: ( ruleTagReference )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:620:6: ( ruleTagReference )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:621:1: ruleTagReference
                    {
                     before(grammarAccess.getValueAccess().getTagReferenceParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleTagReference_in_rule__Value__Alternatives1269);
                    ruleTagReference();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getTagReferenceParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:626:6: ( ruleTextReference )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:626:6: ( ruleTextReference )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:627:1: ruleTextReference
                    {
                     before(grammarAccess.getValueAccess().getTextReferenceParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleTextReference_in_rule__Value__Alternatives1286);
                    ruleTextReference();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getTextReferenceParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:632:6: ( ruleTaskReference )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:632:6: ( ruleTaskReference )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:633:1: ruleTaskReference
                    {
                     before(grammarAccess.getValueAccess().getTaskReferenceParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleTaskReference_in_rule__Value__Alternatives1303);
                    ruleTaskReference();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getTaskReferenceParserRuleCall_5()); 

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__ProjectReference__Alternatives_2"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:643:1: rule__ProjectReference__Alternatives_2 : ( ( ( rule__ProjectReference__ValueAssignment_2_0 ) ) | ( ( rule__ProjectReference__ValueAssignment_2_1 ) ) );
    public final void rule__ProjectReference__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:647:1: ( ( ( rule__ProjectReference__ValueAssignment_2_0 ) ) | ( ( rule__ProjectReference__ValueAssignment_2_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:648:1: ( ( rule__ProjectReference__ValueAssignment_2_0 ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:648:1: ( ( rule__ProjectReference__ValueAssignment_2_0 ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:649:1: ( rule__ProjectReference__ValueAssignment_2_0 )
                    {
                     before(grammarAccess.getProjectReferenceAccess().getValueAssignment_2_0()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:650:1: ( rule__ProjectReference__ValueAssignment_2_0 )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:650:2: rule__ProjectReference__ValueAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__ProjectReference__ValueAssignment_2_0_in_rule__ProjectReference__Alternatives_21335);
                    rule__ProjectReference__ValueAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProjectReferenceAccess().getValueAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:654:6: ( ( rule__ProjectReference__ValueAssignment_2_1 ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:654:6: ( ( rule__ProjectReference__ValueAssignment_2_1 ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:655:1: ( rule__ProjectReference__ValueAssignment_2_1 )
                    {
                     before(grammarAccess.getProjectReferenceAccess().getValueAssignment_2_1()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:656:1: ( rule__ProjectReference__ValueAssignment_2_1 )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:656:2: rule__ProjectReference__ValueAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__ProjectReference__ValueAssignment_2_1_in_rule__ProjectReference__Alternatives_21353);
                    rule__ProjectReference__ValueAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getProjectReferenceAccess().getValueAssignment_2_1()); 

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
    // $ANTLR end "rule__ProjectReference__Alternatives_2"


    // $ANTLR start "rule__TaskReference__Alternatives_2"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:665:1: rule__TaskReference__Alternatives_2 : ( ( ( rule__TaskReference__ValueAssignment_2_0 ) ) | ( ( rule__TaskReference__ValueAssignment_2_1 ) ) );
    public final void rule__TaskReference__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:669:1: ( ( ( rule__TaskReference__ValueAssignment_2_0 ) ) | ( ( rule__TaskReference__ValueAssignment_2_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:670:1: ( ( rule__TaskReference__ValueAssignment_2_0 ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:670:1: ( ( rule__TaskReference__ValueAssignment_2_0 ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:671:1: ( rule__TaskReference__ValueAssignment_2_0 )
                    {
                     before(grammarAccess.getTaskReferenceAccess().getValueAssignment_2_0()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:672:1: ( rule__TaskReference__ValueAssignment_2_0 )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:672:2: rule__TaskReference__ValueAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__TaskReference__ValueAssignment_2_0_in_rule__TaskReference__Alternatives_21386);
                    rule__TaskReference__ValueAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTaskReferenceAccess().getValueAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:676:6: ( ( rule__TaskReference__ValueAssignment_2_1 ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:676:6: ( ( rule__TaskReference__ValueAssignment_2_1 ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:677:1: ( rule__TaskReference__ValueAssignment_2_1 )
                    {
                     before(grammarAccess.getTaskReferenceAccess().getValueAssignment_2_1()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:678:1: ( rule__TaskReference__ValueAssignment_2_1 )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:678:2: rule__TaskReference__ValueAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__TaskReference__ValueAssignment_2_1_in_rule__TaskReference__Alternatives_21404);
                    rule__TaskReference__ValueAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTaskReferenceAccess().getValueAssignment_2_1()); 

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
    // $ANTLR end "rule__TaskReference__Alternatives_2"


    // $ANTLR start "rule__TextReference__Alternatives_2"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:687:1: rule__TextReference__Alternatives_2 : ( ( ( rule__TextReference__ValueAssignment_2_0 ) ) | ( ( rule__TextReference__ValueAssignment_2_1 ) ) );
    public final void rule__TextReference__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:691:1: ( ( ( rule__TextReference__ValueAssignment_2_0 ) ) | ( ( rule__TextReference__ValueAssignment_2_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:692:1: ( ( rule__TextReference__ValueAssignment_2_0 ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:692:1: ( ( rule__TextReference__ValueAssignment_2_0 ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:693:1: ( rule__TextReference__ValueAssignment_2_0 )
                    {
                     before(grammarAccess.getTextReferenceAccess().getValueAssignment_2_0()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:694:1: ( rule__TextReference__ValueAssignment_2_0 )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:694:2: rule__TextReference__ValueAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__TextReference__ValueAssignment_2_0_in_rule__TextReference__Alternatives_21437);
                    rule__TextReference__ValueAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTextReferenceAccess().getValueAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:698:6: ( ( rule__TextReference__ValueAssignment_2_1 ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:698:6: ( ( rule__TextReference__ValueAssignment_2_1 ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:699:1: ( rule__TextReference__ValueAssignment_2_1 )
                    {
                     before(grammarAccess.getTextReferenceAccess().getValueAssignment_2_1()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:700:1: ( rule__TextReference__ValueAssignment_2_1 )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:700:2: rule__TextReference__ValueAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__TextReference__ValueAssignment_2_1_in_rule__TextReference__Alternatives_21455);
                    rule__TextReference__ValueAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTextReferenceAccess().getValueAssignment_2_1()); 

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
    // $ANTLR end "rule__TextReference__Alternatives_2"


    // $ANTLR start "rule__CompEqOperator__Alternatives"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:709:1: rule__CompEqOperator__Alternatives : ( ( ( '=' ) ) | ( ( '!=' ) ) );
    public final void rule__CompEqOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:713:1: ( ( ( '=' ) ) | ( ( '!=' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            else if ( (LA7_0==12) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:714:1: ( ( '=' ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:714:1: ( ( '=' ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:715:1: ( '=' )
                    {
                     before(grammarAccess.getCompEqOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:716:1: ( '=' )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:716:3: '='
                    {
                    match(input,11,FOLLOW_11_in_rule__CompEqOperator__Alternatives1489); 

                    }

                     after(grammarAccess.getCompEqOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:721:6: ( ( '!=' ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:721:6: ( ( '!=' ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:722:1: ( '!=' )
                    {
                     before(grammarAccess.getCompEqOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_1()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:723:1: ( '!=' )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:723:3: '!='
                    {
                    match(input,12,FOLLOW_12_in_rule__CompEqOperator__Alternatives1510); 

                    }

                     after(grammarAccess.getCompEqOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__CompEqOperator__Alternatives"


    // $ANTLR start "rule__CompOperator__Alternatives"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:733:1: rule__CompOperator__Alternatives : ( ( ( '<=' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) );
    public final void rule__CompOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:737:1: ( ( ( '<=' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt8=1;
                }
                break;
            case 14:
                {
                alt8=2;
                }
                break;
            case 15:
                {
                alt8=3;
                }
                break;
            case 16:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:738:1: ( ( '<=' ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:738:1: ( ( '<=' ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:739:1: ( '<=' )
                    {
                     before(grammarAccess.getCompOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_0()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:740:1: ( '<=' )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:740:3: '<='
                    {
                    match(input,13,FOLLOW_13_in_rule__CompOperator__Alternatives1546); 

                    }

                     after(grammarAccess.getCompOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:745:6: ( ( '<' ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:745:6: ( ( '<' ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:746:1: ( '<' )
                    {
                     before(grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_1()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:747:1: ( '<' )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:747:3: '<'
                    {
                    match(input,14,FOLLOW_14_in_rule__CompOperator__Alternatives1567); 

                    }

                     after(grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:752:6: ( ( '>=' ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:752:6: ( ( '>=' ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:753:1: ( '>=' )
                    {
                     before(grammarAccess.getCompOperatorAccess().getGREATER_EQUALEnumLiteralDeclaration_2()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:754:1: ( '>=' )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:754:3: '>='
                    {
                    match(input,15,FOLLOW_15_in_rule__CompOperator__Alternatives1588); 

                    }

                     after(grammarAccess.getCompOperatorAccess().getGREATER_EQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:759:6: ( ( '>' ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:759:6: ( ( '>' ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:760:1: ( '>' )
                    {
                     before(grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_3()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:761:1: ( '>' )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:761:3: '>'
                    {
                    match(input,16,FOLLOW_16_in_rule__CompOperator__Alternatives1609); 

                    }

                     after(grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__CompOperator__Alternatives"


    // $ANTLR start "rule__Query__Group__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:773:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:777:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:778:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__01642);
            rule__Query__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Query__Group__1_in_rule__Query__Group__01645);
            rule__Query__Group__1();

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
    // $ANTLR end "rule__Query__Group__0"


    // $ANTLR start "rule__Query__Group__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:785:1: rule__Query__Group__0__Impl : ( () ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:789:1: ( ( () ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:790:1: ( () )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:790:1: ( () )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:791:1: ()
            {
             before(grammarAccess.getQueryAccess().getQueryAction_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:792:1: ()
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:794:1: 
            {
            }

             after(grammarAccess.getQueryAccess().getQueryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0__Impl"


    // $ANTLR start "rule__Query__Group__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:804:1: rule__Query__Group__1 : rule__Query__Group__1__Impl ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:808:1: ( rule__Query__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:809:2: rule__Query__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__11703);
            rule__Query__Group__1__Impl();

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
    // $ANTLR end "rule__Query__Group__1"


    // $ANTLR start "rule__Query__Group__1__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:815:1: rule__Query__Group__1__Impl : ( ( rule__Query__ExpressionAssignment_1 )? ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:819:1: ( ( ( rule__Query__ExpressionAssignment_1 )? ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:820:1: ( ( rule__Query__ExpressionAssignment_1 )? )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:820:1: ( ( rule__Query__ExpressionAssignment_1 )? )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:821:1: ( rule__Query__ExpressionAssignment_1 )?
            {
             before(grammarAccess.getQueryAccess().getExpressionAssignment_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:822:1: ( rule__Query__ExpressionAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)||(LA9_0>=19 && LA9_0<=20)||LA9_0==22||(LA9_0>=24 && LA9_0<=26)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:822:2: rule__Query__ExpressionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Query__ExpressionAssignment_1_in_rule__Query__Group__1__Impl1730);
                    rule__Query__ExpressionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryAccess().getExpressionAssignment_1()); 

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
    // $ANTLR end "rule__Query__Group__1__Impl"


    // $ANTLR start "rule__OrExpr__Group__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:836:1: rule__OrExpr__Group__0 : rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1 ;
    public final void rule__OrExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:840:1: ( rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:841:2: rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1
            {
            pushFollow(FOLLOW_rule__OrExpr__Group__0__Impl_in_rule__OrExpr__Group__01765);
            rule__OrExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpr__Group__1_in_rule__OrExpr__Group__01768);
            rule__OrExpr__Group__1();

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
    // $ANTLR end "rule__OrExpr__Group__0"


    // $ANTLR start "rule__OrExpr__Group__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:848:1: rule__OrExpr__Group__0__Impl : ( ruleAndExpr ) ;
    public final void rule__OrExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:852:1: ( ( ruleAndExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:853:1: ( ruleAndExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:853:1: ( ruleAndExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:854:1: ruleAndExpr
            {
             before(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAndExpr_in_rule__OrExpr__Group__0__Impl1795);
            ruleAndExpr();

            state._fsp--;

             after(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0()); 

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
    // $ANTLR end "rule__OrExpr__Group__0__Impl"


    // $ANTLR start "rule__OrExpr__Group__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:865:1: rule__OrExpr__Group__1 : rule__OrExpr__Group__1__Impl ;
    public final void rule__OrExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:869:1: ( rule__OrExpr__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:870:2: rule__OrExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpr__Group__1__Impl_in_rule__OrExpr__Group__11824);
            rule__OrExpr__Group__1__Impl();

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
    // $ANTLR end "rule__OrExpr__Group__1"


    // $ANTLR start "rule__OrExpr__Group__1__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:876:1: rule__OrExpr__Group__1__Impl : ( ( rule__OrExpr__Group_1__0 )* ) ;
    public final void rule__OrExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:880:1: ( ( ( rule__OrExpr__Group_1__0 )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:881:1: ( ( rule__OrExpr__Group_1__0 )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:881:1: ( ( rule__OrExpr__Group_1__0 )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:882:1: ( rule__OrExpr__Group_1__0 )*
            {
             before(grammarAccess.getOrExprAccess().getGroup_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:883:1: ( rule__OrExpr__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:883:2: rule__OrExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrExpr__Group_1__0_in_rule__OrExpr__Group__1__Impl1851);
            	    rule__OrExpr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getOrExprAccess().getGroup_1()); 

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
    // $ANTLR end "rule__OrExpr__Group__1__Impl"


    // $ANTLR start "rule__OrExpr__Group_1__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:897:1: rule__OrExpr__Group_1__0 : rule__OrExpr__Group_1__0__Impl rule__OrExpr__Group_1__1 ;
    public final void rule__OrExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:901:1: ( rule__OrExpr__Group_1__0__Impl rule__OrExpr__Group_1__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:902:2: rule__OrExpr__Group_1__0__Impl rule__OrExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrExpr__Group_1__0__Impl_in_rule__OrExpr__Group_1__01886);
            rule__OrExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpr__Group_1__1_in_rule__OrExpr__Group_1__01889);
            rule__OrExpr__Group_1__1();

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
    // $ANTLR end "rule__OrExpr__Group_1__0"


    // $ANTLR start "rule__OrExpr__Group_1__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:909:1: rule__OrExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:913:1: ( ( () ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:914:1: ( () )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:914:1: ( () )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:915:1: ()
            {
             before(grammarAccess.getOrExprAccess().getOrExprLeftAction_1_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:916:1: ()
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:918:1: 
            {
            }

             after(grammarAccess.getOrExprAccess().getOrExprLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpr__Group_1__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:928:1: rule__OrExpr__Group_1__1 : rule__OrExpr__Group_1__1__Impl rule__OrExpr__Group_1__2 ;
    public final void rule__OrExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:932:1: ( rule__OrExpr__Group_1__1__Impl rule__OrExpr__Group_1__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:933:2: rule__OrExpr__Group_1__1__Impl rule__OrExpr__Group_1__2
            {
            pushFollow(FOLLOW_rule__OrExpr__Group_1__1__Impl_in_rule__OrExpr__Group_1__11947);
            rule__OrExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpr__Group_1__2_in_rule__OrExpr__Group_1__11950);
            rule__OrExpr__Group_1__2();

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
    // $ANTLR end "rule__OrExpr__Group_1__1"


    // $ANTLR start "rule__OrExpr__Group_1__1__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:940:1: rule__OrExpr__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__OrExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:944:1: ( ( 'or' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:945:1: ( 'or' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:945:1: ( 'or' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:946:1: 'or'
            {
             before(grammarAccess.getOrExprAccess().getOrKeyword_1_1()); 
            match(input,17,FOLLOW_17_in_rule__OrExpr__Group_1__1__Impl1978); 
             after(grammarAccess.getOrExprAccess().getOrKeyword_1_1()); 

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
    // $ANTLR end "rule__OrExpr__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpr__Group_1__2"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:959:1: rule__OrExpr__Group_1__2 : rule__OrExpr__Group_1__2__Impl ;
    public final void rule__OrExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:963:1: ( rule__OrExpr__Group_1__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:964:2: rule__OrExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__OrExpr__Group_1__2__Impl_in_rule__OrExpr__Group_1__22009);
            rule__OrExpr__Group_1__2__Impl();

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
    // $ANTLR end "rule__OrExpr__Group_1__2"


    // $ANTLR start "rule__OrExpr__Group_1__2__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:970:1: rule__OrExpr__Group_1__2__Impl : ( ( rule__OrExpr__RightAssignment_1_2 ) ) ;
    public final void rule__OrExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:974:1: ( ( ( rule__OrExpr__RightAssignment_1_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:975:1: ( ( rule__OrExpr__RightAssignment_1_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:975:1: ( ( rule__OrExpr__RightAssignment_1_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:976:1: ( rule__OrExpr__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrExprAccess().getRightAssignment_1_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:977:1: ( rule__OrExpr__RightAssignment_1_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:977:2: rule__OrExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__OrExpr__RightAssignment_1_2_in_rule__OrExpr__Group_1__2__Impl2036);
            rule__OrExpr__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrExprAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__OrExpr__Group_1__2__Impl"


    // $ANTLR start "rule__AndExpr__Group__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:993:1: rule__AndExpr__Group__0 : rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1 ;
    public final void rule__AndExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:997:1: ( rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:998:2: rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1
            {
            pushFollow(FOLLOW_rule__AndExpr__Group__0__Impl_in_rule__AndExpr__Group__02072);
            rule__AndExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpr__Group__1_in_rule__AndExpr__Group__02075);
            rule__AndExpr__Group__1();

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
    // $ANTLR end "rule__AndExpr__Group__0"


    // $ANTLR start "rule__AndExpr__Group__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1005:1: rule__AndExpr__Group__0__Impl : ( ruleCompEqExpr ) ;
    public final void rule__AndExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1009:1: ( ( ruleCompEqExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1010:1: ( ruleCompEqExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1010:1: ( ruleCompEqExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1011:1: ruleCompEqExpr
            {
             before(grammarAccess.getAndExprAccess().getCompEqExprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleCompEqExpr_in_rule__AndExpr__Group__0__Impl2102);
            ruleCompEqExpr();

            state._fsp--;

             after(grammarAccess.getAndExprAccess().getCompEqExprParserRuleCall_0()); 

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
    // $ANTLR end "rule__AndExpr__Group__0__Impl"


    // $ANTLR start "rule__AndExpr__Group__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1022:1: rule__AndExpr__Group__1 : rule__AndExpr__Group__1__Impl ;
    public final void rule__AndExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1026:1: ( rule__AndExpr__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1027:2: rule__AndExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpr__Group__1__Impl_in_rule__AndExpr__Group__12131);
            rule__AndExpr__Group__1__Impl();

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
    // $ANTLR end "rule__AndExpr__Group__1"


    // $ANTLR start "rule__AndExpr__Group__1__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1033:1: rule__AndExpr__Group__1__Impl : ( ( rule__AndExpr__Group_1__0 )* ) ;
    public final void rule__AndExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1037:1: ( ( ( rule__AndExpr__Group_1__0 )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1038:1: ( ( rule__AndExpr__Group_1__0 )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1038:1: ( ( rule__AndExpr__Group_1__0 )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1039:1: ( rule__AndExpr__Group_1__0 )*
            {
             before(grammarAccess.getAndExprAccess().getGroup_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1040:1: ( rule__AndExpr__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1040:2: rule__AndExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExpr__Group_1__0_in_rule__AndExpr__Group__1__Impl2158);
            	    rule__AndExpr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAndExprAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AndExpr__Group__1__Impl"


    // $ANTLR start "rule__AndExpr__Group_1__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1054:1: rule__AndExpr__Group_1__0 : rule__AndExpr__Group_1__0__Impl rule__AndExpr__Group_1__1 ;
    public final void rule__AndExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1058:1: ( rule__AndExpr__Group_1__0__Impl rule__AndExpr__Group_1__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1059:2: rule__AndExpr__Group_1__0__Impl rule__AndExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1__0__Impl_in_rule__AndExpr__Group_1__02193);
            rule__AndExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpr__Group_1__1_in_rule__AndExpr__Group_1__02196);
            rule__AndExpr__Group_1__1();

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
    // $ANTLR end "rule__AndExpr__Group_1__0"


    // $ANTLR start "rule__AndExpr__Group_1__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1066:1: rule__AndExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1070:1: ( ( () ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1071:1: ( () )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1071:1: ( () )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1072:1: ()
            {
             before(grammarAccess.getAndExprAccess().getAndExprLeftAction_1_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1073:1: ()
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1075:1: 
            {
            }

             after(grammarAccess.getAndExprAccess().getAndExprLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpr__Group_1__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1085:1: rule__AndExpr__Group_1__1 : rule__AndExpr__Group_1__1__Impl rule__AndExpr__Group_1__2 ;
    public final void rule__AndExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1089:1: ( rule__AndExpr__Group_1__1__Impl rule__AndExpr__Group_1__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1090:2: rule__AndExpr__Group_1__1__Impl rule__AndExpr__Group_1__2
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1__1__Impl_in_rule__AndExpr__Group_1__12254);
            rule__AndExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpr__Group_1__2_in_rule__AndExpr__Group_1__12257);
            rule__AndExpr__Group_1__2();

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
    // $ANTLR end "rule__AndExpr__Group_1__1"


    // $ANTLR start "rule__AndExpr__Group_1__1__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1097:1: rule__AndExpr__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__AndExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1101:1: ( ( 'and' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1102:1: ( 'and' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1102:1: ( 'and' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1103:1: 'and'
            {
             before(grammarAccess.getAndExprAccess().getAndKeyword_1_1()); 
            match(input,18,FOLLOW_18_in_rule__AndExpr__Group_1__1__Impl2285); 
             after(grammarAccess.getAndExprAccess().getAndKeyword_1_1()); 

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
    // $ANTLR end "rule__AndExpr__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpr__Group_1__2"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1116:1: rule__AndExpr__Group_1__2 : rule__AndExpr__Group_1__2__Impl ;
    public final void rule__AndExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1120:1: ( rule__AndExpr__Group_1__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1121:2: rule__AndExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1__2__Impl_in_rule__AndExpr__Group_1__22316);
            rule__AndExpr__Group_1__2__Impl();

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
    // $ANTLR end "rule__AndExpr__Group_1__2"


    // $ANTLR start "rule__AndExpr__Group_1__2__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1127:1: rule__AndExpr__Group_1__2__Impl : ( ( rule__AndExpr__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1131:1: ( ( ( rule__AndExpr__RightAssignment_1_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1132:1: ( ( rule__AndExpr__RightAssignment_1_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1132:1: ( ( rule__AndExpr__RightAssignment_1_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1133:1: ( rule__AndExpr__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndExprAccess().getRightAssignment_1_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1134:1: ( rule__AndExpr__RightAssignment_1_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1134:2: rule__AndExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AndExpr__RightAssignment_1_2_in_rule__AndExpr__Group_1__2__Impl2343);
            rule__AndExpr__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndExprAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__AndExpr__Group_1__2__Impl"


    // $ANTLR start "rule__CompEqExpr__Group__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1150:1: rule__CompEqExpr__Group__0 : rule__CompEqExpr__Group__0__Impl rule__CompEqExpr__Group__1 ;
    public final void rule__CompEqExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1154:1: ( rule__CompEqExpr__Group__0__Impl rule__CompEqExpr__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1155:2: rule__CompEqExpr__Group__0__Impl rule__CompEqExpr__Group__1
            {
            pushFollow(FOLLOW_rule__CompEqExpr__Group__0__Impl_in_rule__CompEqExpr__Group__02379);
            rule__CompEqExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompEqExpr__Group__1_in_rule__CompEqExpr__Group__02382);
            rule__CompEqExpr__Group__1();

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
    // $ANTLR end "rule__CompEqExpr__Group__0"


    // $ANTLR start "rule__CompEqExpr__Group__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1162:1: rule__CompEqExpr__Group__0__Impl : ( ruleCompExpr ) ;
    public final void rule__CompEqExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1166:1: ( ( ruleCompExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1167:1: ( ruleCompExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1167:1: ( ruleCompExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1168:1: ruleCompExpr
            {
             before(grammarAccess.getCompEqExprAccess().getCompExprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleCompExpr_in_rule__CompEqExpr__Group__0__Impl2409);
            ruleCompExpr();

            state._fsp--;

             after(grammarAccess.getCompEqExprAccess().getCompExprParserRuleCall_0()); 

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
    // $ANTLR end "rule__CompEqExpr__Group__0__Impl"


    // $ANTLR start "rule__CompEqExpr__Group__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1179:1: rule__CompEqExpr__Group__1 : rule__CompEqExpr__Group__1__Impl ;
    public final void rule__CompEqExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1183:1: ( rule__CompEqExpr__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1184:2: rule__CompEqExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CompEqExpr__Group__1__Impl_in_rule__CompEqExpr__Group__12438);
            rule__CompEqExpr__Group__1__Impl();

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
    // $ANTLR end "rule__CompEqExpr__Group__1"


    // $ANTLR start "rule__CompEqExpr__Group__1__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1190:1: rule__CompEqExpr__Group__1__Impl : ( ( rule__CompEqExpr__Group_1__0 )* ) ;
    public final void rule__CompEqExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1194:1: ( ( ( rule__CompEqExpr__Group_1__0 )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1195:1: ( ( rule__CompEqExpr__Group_1__0 )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1195:1: ( ( rule__CompEqExpr__Group_1__0 )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1196:1: ( rule__CompEqExpr__Group_1__0 )*
            {
             before(grammarAccess.getCompEqExprAccess().getGroup_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1197:1: ( rule__CompEqExpr__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=11 && LA12_0<=12)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1197:2: rule__CompEqExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CompEqExpr__Group_1__0_in_rule__CompEqExpr__Group__1__Impl2465);
            	    rule__CompEqExpr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getCompEqExprAccess().getGroup_1()); 

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
    // $ANTLR end "rule__CompEqExpr__Group__1__Impl"


    // $ANTLR start "rule__CompEqExpr__Group_1__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1211:1: rule__CompEqExpr__Group_1__0 : rule__CompEqExpr__Group_1__0__Impl rule__CompEqExpr__Group_1__1 ;
    public final void rule__CompEqExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1215:1: ( rule__CompEqExpr__Group_1__0__Impl rule__CompEqExpr__Group_1__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1216:2: rule__CompEqExpr__Group_1__0__Impl rule__CompEqExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__CompEqExpr__Group_1__0__Impl_in_rule__CompEqExpr__Group_1__02500);
            rule__CompEqExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompEqExpr__Group_1__1_in_rule__CompEqExpr__Group_1__02503);
            rule__CompEqExpr__Group_1__1();

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
    // $ANTLR end "rule__CompEqExpr__Group_1__0"


    // $ANTLR start "rule__CompEqExpr__Group_1__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1223:1: rule__CompEqExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__CompEqExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1227:1: ( ( () ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1228:1: ( () )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1228:1: ( () )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1229:1: ()
            {
             before(grammarAccess.getCompEqExprAccess().getCompEqExprLeftAction_1_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1230:1: ()
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1232:1: 
            {
            }

             after(grammarAccess.getCompEqExprAccess().getCompEqExprLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompEqExpr__Group_1__0__Impl"


    // $ANTLR start "rule__CompEqExpr__Group_1__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1242:1: rule__CompEqExpr__Group_1__1 : rule__CompEqExpr__Group_1__1__Impl rule__CompEqExpr__Group_1__2 ;
    public final void rule__CompEqExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1246:1: ( rule__CompEqExpr__Group_1__1__Impl rule__CompEqExpr__Group_1__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1247:2: rule__CompEqExpr__Group_1__1__Impl rule__CompEqExpr__Group_1__2
            {
            pushFollow(FOLLOW_rule__CompEqExpr__Group_1__1__Impl_in_rule__CompEqExpr__Group_1__12561);
            rule__CompEqExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompEqExpr__Group_1__2_in_rule__CompEqExpr__Group_1__12564);
            rule__CompEqExpr__Group_1__2();

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
    // $ANTLR end "rule__CompEqExpr__Group_1__1"


    // $ANTLR start "rule__CompEqExpr__Group_1__1__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1254:1: rule__CompEqExpr__Group_1__1__Impl : ( ( rule__CompEqExpr__OperatorAssignment_1_1 ) ) ;
    public final void rule__CompEqExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1258:1: ( ( ( rule__CompEqExpr__OperatorAssignment_1_1 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1259:1: ( ( rule__CompEqExpr__OperatorAssignment_1_1 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1259:1: ( ( rule__CompEqExpr__OperatorAssignment_1_1 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1260:1: ( rule__CompEqExpr__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getCompEqExprAccess().getOperatorAssignment_1_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1261:1: ( rule__CompEqExpr__OperatorAssignment_1_1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1261:2: rule__CompEqExpr__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CompEqExpr__OperatorAssignment_1_1_in_rule__CompEqExpr__Group_1__1__Impl2591);
            rule__CompEqExpr__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompEqExprAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__CompEqExpr__Group_1__1__Impl"


    // $ANTLR start "rule__CompEqExpr__Group_1__2"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1271:1: rule__CompEqExpr__Group_1__2 : rule__CompEqExpr__Group_1__2__Impl ;
    public final void rule__CompEqExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1275:1: ( rule__CompEqExpr__Group_1__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1276:2: rule__CompEqExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__CompEqExpr__Group_1__2__Impl_in_rule__CompEqExpr__Group_1__22621);
            rule__CompEqExpr__Group_1__2__Impl();

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
    // $ANTLR end "rule__CompEqExpr__Group_1__2"


    // $ANTLR start "rule__CompEqExpr__Group_1__2__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1282:1: rule__CompEqExpr__Group_1__2__Impl : ( ( rule__CompEqExpr__RightAssignment_1_2 ) ) ;
    public final void rule__CompEqExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1286:1: ( ( ( rule__CompEqExpr__RightAssignment_1_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1287:1: ( ( rule__CompEqExpr__RightAssignment_1_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1287:1: ( ( rule__CompEqExpr__RightAssignment_1_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1288:1: ( rule__CompEqExpr__RightAssignment_1_2 )
            {
             before(grammarAccess.getCompEqExprAccess().getRightAssignment_1_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1289:1: ( rule__CompEqExpr__RightAssignment_1_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1289:2: rule__CompEqExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__CompEqExpr__RightAssignment_1_2_in_rule__CompEqExpr__Group_1__2__Impl2648);
            rule__CompEqExpr__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCompEqExprAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__CompEqExpr__Group_1__2__Impl"


    // $ANTLR start "rule__CompExpr__Group__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1305:1: rule__CompExpr__Group__0 : rule__CompExpr__Group__0__Impl rule__CompExpr__Group__1 ;
    public final void rule__CompExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1309:1: ( rule__CompExpr__Group__0__Impl rule__CompExpr__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1310:2: rule__CompExpr__Group__0__Impl rule__CompExpr__Group__1
            {
            pushFollow(FOLLOW_rule__CompExpr__Group__0__Impl_in_rule__CompExpr__Group__02684);
            rule__CompExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompExpr__Group__1_in_rule__CompExpr__Group__02687);
            rule__CompExpr__Group__1();

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
    // $ANTLR end "rule__CompExpr__Group__0"


    // $ANTLR start "rule__CompExpr__Group__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1317:1: rule__CompExpr__Group__0__Impl : ( ruleUnaryExpr ) ;
    public final void rule__CompExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1321:1: ( ( ruleUnaryExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1322:1: ( ruleUnaryExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1322:1: ( ruleUnaryExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1323:1: ruleUnaryExpr
            {
             before(grammarAccess.getCompExprAccess().getUnaryExprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_rule__CompExpr__Group__0__Impl2714);
            ruleUnaryExpr();

            state._fsp--;

             after(grammarAccess.getCompExprAccess().getUnaryExprParserRuleCall_0()); 

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
    // $ANTLR end "rule__CompExpr__Group__0__Impl"


    // $ANTLR start "rule__CompExpr__Group__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1334:1: rule__CompExpr__Group__1 : rule__CompExpr__Group__1__Impl ;
    public final void rule__CompExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1338:1: ( rule__CompExpr__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1339:2: rule__CompExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CompExpr__Group__1__Impl_in_rule__CompExpr__Group__12743);
            rule__CompExpr__Group__1__Impl();

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
    // $ANTLR end "rule__CompExpr__Group__1"


    // $ANTLR start "rule__CompExpr__Group__1__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1345:1: rule__CompExpr__Group__1__Impl : ( ( rule__CompExpr__Group_1__0 )* ) ;
    public final void rule__CompExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1349:1: ( ( ( rule__CompExpr__Group_1__0 )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1350:1: ( ( rule__CompExpr__Group_1__0 )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1350:1: ( ( rule__CompExpr__Group_1__0 )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1351:1: ( rule__CompExpr__Group_1__0 )*
            {
             before(grammarAccess.getCompExprAccess().getGroup_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1352:1: ( rule__CompExpr__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=13 && LA13_0<=16)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1352:2: rule__CompExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CompExpr__Group_1__0_in_rule__CompExpr__Group__1__Impl2770);
            	    rule__CompExpr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getCompExprAccess().getGroup_1()); 

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
    // $ANTLR end "rule__CompExpr__Group__1__Impl"


    // $ANTLR start "rule__CompExpr__Group_1__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1366:1: rule__CompExpr__Group_1__0 : rule__CompExpr__Group_1__0__Impl rule__CompExpr__Group_1__1 ;
    public final void rule__CompExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1370:1: ( rule__CompExpr__Group_1__0__Impl rule__CompExpr__Group_1__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1371:2: rule__CompExpr__Group_1__0__Impl rule__CompExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__CompExpr__Group_1__0__Impl_in_rule__CompExpr__Group_1__02805);
            rule__CompExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompExpr__Group_1__1_in_rule__CompExpr__Group_1__02808);
            rule__CompExpr__Group_1__1();

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
    // $ANTLR end "rule__CompExpr__Group_1__0"


    // $ANTLR start "rule__CompExpr__Group_1__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1378:1: rule__CompExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__CompExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1382:1: ( ( () ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1383:1: ( () )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1383:1: ( () )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1384:1: ()
            {
             before(grammarAccess.getCompExprAccess().getCompExprLeftAction_1_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1385:1: ()
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1387:1: 
            {
            }

             after(grammarAccess.getCompExprAccess().getCompExprLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompExpr__Group_1__0__Impl"


    // $ANTLR start "rule__CompExpr__Group_1__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1397:1: rule__CompExpr__Group_1__1 : rule__CompExpr__Group_1__1__Impl rule__CompExpr__Group_1__2 ;
    public final void rule__CompExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1401:1: ( rule__CompExpr__Group_1__1__Impl rule__CompExpr__Group_1__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1402:2: rule__CompExpr__Group_1__1__Impl rule__CompExpr__Group_1__2
            {
            pushFollow(FOLLOW_rule__CompExpr__Group_1__1__Impl_in_rule__CompExpr__Group_1__12866);
            rule__CompExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompExpr__Group_1__2_in_rule__CompExpr__Group_1__12869);
            rule__CompExpr__Group_1__2();

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
    // $ANTLR end "rule__CompExpr__Group_1__1"


    // $ANTLR start "rule__CompExpr__Group_1__1__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1409:1: rule__CompExpr__Group_1__1__Impl : ( ( rule__CompExpr__OperatorAssignment_1_1 ) ) ;
    public final void rule__CompExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1413:1: ( ( ( rule__CompExpr__OperatorAssignment_1_1 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1414:1: ( ( rule__CompExpr__OperatorAssignment_1_1 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1414:1: ( ( rule__CompExpr__OperatorAssignment_1_1 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1415:1: ( rule__CompExpr__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getCompExprAccess().getOperatorAssignment_1_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1416:1: ( rule__CompExpr__OperatorAssignment_1_1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1416:2: rule__CompExpr__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CompExpr__OperatorAssignment_1_1_in_rule__CompExpr__Group_1__1__Impl2896);
            rule__CompExpr__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompExprAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__CompExpr__Group_1__1__Impl"


    // $ANTLR start "rule__CompExpr__Group_1__2"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1426:1: rule__CompExpr__Group_1__2 : rule__CompExpr__Group_1__2__Impl ;
    public final void rule__CompExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1430:1: ( rule__CompExpr__Group_1__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1431:2: rule__CompExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__CompExpr__Group_1__2__Impl_in_rule__CompExpr__Group_1__22926);
            rule__CompExpr__Group_1__2__Impl();

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
    // $ANTLR end "rule__CompExpr__Group_1__2"


    // $ANTLR start "rule__CompExpr__Group_1__2__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1437:1: rule__CompExpr__Group_1__2__Impl : ( ( rule__CompExpr__RightAssignment_1_2 ) ) ;
    public final void rule__CompExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1441:1: ( ( ( rule__CompExpr__RightAssignment_1_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1442:1: ( ( rule__CompExpr__RightAssignment_1_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1442:1: ( ( rule__CompExpr__RightAssignment_1_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1443:1: ( rule__CompExpr__RightAssignment_1_2 )
            {
             before(grammarAccess.getCompExprAccess().getRightAssignment_1_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1444:1: ( rule__CompExpr__RightAssignment_1_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1444:2: rule__CompExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__CompExpr__RightAssignment_1_2_in_rule__CompExpr__Group_1__2__Impl2953);
            rule__CompExpr__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCompExprAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__CompExpr__Group_1__2__Impl"


    // $ANTLR start "rule__UnaryExpr__Group_1__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1460:1: rule__UnaryExpr__Group_1__0 : rule__UnaryExpr__Group_1__0__Impl rule__UnaryExpr__Group_1__1 ;
    public final void rule__UnaryExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1464:1: ( rule__UnaryExpr__Group_1__0__Impl rule__UnaryExpr__Group_1__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1465:2: rule__UnaryExpr__Group_1__0__Impl rule__UnaryExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__UnaryExpr__Group_1__0__Impl_in_rule__UnaryExpr__Group_1__02989);
            rule__UnaryExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnaryExpr__Group_1__1_in_rule__UnaryExpr__Group_1__02992);
            rule__UnaryExpr__Group_1__1();

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
    // $ANTLR end "rule__UnaryExpr__Group_1__0"


    // $ANTLR start "rule__UnaryExpr__Group_1__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1472:1: rule__UnaryExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__UnaryExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1476:1: ( ( () ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1477:1: ( () )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1477:1: ( () )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1478:1: ()
            {
             before(grammarAccess.getUnaryExprAccess().getUnaryExprAction_1_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1479:1: ()
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1481:1: 
            {
            }

             after(grammarAccess.getUnaryExprAccess().getUnaryExprAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group_1__0__Impl"


    // $ANTLR start "rule__UnaryExpr__Group_1__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1491:1: rule__UnaryExpr__Group_1__1 : rule__UnaryExpr__Group_1__1__Impl rule__UnaryExpr__Group_1__2 ;
    public final void rule__UnaryExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1495:1: ( rule__UnaryExpr__Group_1__1__Impl rule__UnaryExpr__Group_1__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1496:2: rule__UnaryExpr__Group_1__1__Impl rule__UnaryExpr__Group_1__2
            {
            pushFollow(FOLLOW_rule__UnaryExpr__Group_1__1__Impl_in_rule__UnaryExpr__Group_1__13050);
            rule__UnaryExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnaryExpr__Group_1__2_in_rule__UnaryExpr__Group_1__13053);
            rule__UnaryExpr__Group_1__2();

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
    // $ANTLR end "rule__UnaryExpr__Group_1__1"


    // $ANTLR start "rule__UnaryExpr__Group_1__1__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1503:1: rule__UnaryExpr__Group_1__1__Impl : ( 'not' ) ;
    public final void rule__UnaryExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1507:1: ( ( 'not' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1508:1: ( 'not' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1508:1: ( 'not' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1509:1: 'not'
            {
             before(grammarAccess.getUnaryExprAccess().getNotKeyword_1_1()); 
            match(input,19,FOLLOW_19_in_rule__UnaryExpr__Group_1__1__Impl3081); 
             after(grammarAccess.getUnaryExprAccess().getNotKeyword_1_1()); 

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
    // $ANTLR end "rule__UnaryExpr__Group_1__1__Impl"


    // $ANTLR start "rule__UnaryExpr__Group_1__2"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1522:1: rule__UnaryExpr__Group_1__2 : rule__UnaryExpr__Group_1__2__Impl ;
    public final void rule__UnaryExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1526:1: ( rule__UnaryExpr__Group_1__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1527:2: rule__UnaryExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__UnaryExpr__Group_1__2__Impl_in_rule__UnaryExpr__Group_1__23112);
            rule__UnaryExpr__Group_1__2__Impl();

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
    // $ANTLR end "rule__UnaryExpr__Group_1__2"


    // $ANTLR start "rule__UnaryExpr__Group_1__2__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1533:1: rule__UnaryExpr__Group_1__2__Impl : ( ( rule__UnaryExpr__ExprAssignment_1_2 ) ) ;
    public final void rule__UnaryExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1537:1: ( ( ( rule__UnaryExpr__ExprAssignment_1_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1538:1: ( ( rule__UnaryExpr__ExprAssignment_1_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1538:1: ( ( rule__UnaryExpr__ExprAssignment_1_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1539:1: ( rule__UnaryExpr__ExprAssignment_1_2 )
            {
             before(grammarAccess.getUnaryExprAccess().getExprAssignment_1_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1540:1: ( rule__UnaryExpr__ExprAssignment_1_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1540:2: rule__UnaryExpr__ExprAssignment_1_2
            {
            pushFollow(FOLLOW_rule__UnaryExpr__ExprAssignment_1_2_in_rule__UnaryExpr__Group_1__2__Impl3139);
            rule__UnaryExpr__ExprAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExprAccess().getExprAssignment_1_2()); 

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
    // $ANTLR end "rule__UnaryExpr__Group_1__2__Impl"


    // $ANTLR start "rule__ParenExpr__Group__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1556:1: rule__ParenExpr__Group__0 : rule__ParenExpr__Group__0__Impl rule__ParenExpr__Group__1 ;
    public final void rule__ParenExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1560:1: ( rule__ParenExpr__Group__0__Impl rule__ParenExpr__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1561:2: rule__ParenExpr__Group__0__Impl rule__ParenExpr__Group__1
            {
            pushFollow(FOLLOW_rule__ParenExpr__Group__0__Impl_in_rule__ParenExpr__Group__03175);
            rule__ParenExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParenExpr__Group__1_in_rule__ParenExpr__Group__03178);
            rule__ParenExpr__Group__1();

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
    // $ANTLR end "rule__ParenExpr__Group__0"


    // $ANTLR start "rule__ParenExpr__Group__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1568:1: rule__ParenExpr__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1572:1: ( ( '(' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1573:1: ( '(' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1573:1: ( '(' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1574:1: '('
            {
             before(grammarAccess.getParenExprAccess().getLeftParenthesisKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__ParenExpr__Group__0__Impl3206); 
             after(grammarAccess.getParenExprAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__ParenExpr__Group__0__Impl"


    // $ANTLR start "rule__ParenExpr__Group__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1587:1: rule__ParenExpr__Group__1 : rule__ParenExpr__Group__1__Impl rule__ParenExpr__Group__2 ;
    public final void rule__ParenExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1591:1: ( rule__ParenExpr__Group__1__Impl rule__ParenExpr__Group__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1592:2: rule__ParenExpr__Group__1__Impl rule__ParenExpr__Group__2
            {
            pushFollow(FOLLOW_rule__ParenExpr__Group__1__Impl_in_rule__ParenExpr__Group__13237);
            rule__ParenExpr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParenExpr__Group__2_in_rule__ParenExpr__Group__13240);
            rule__ParenExpr__Group__2();

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
    // $ANTLR end "rule__ParenExpr__Group__1"


    // $ANTLR start "rule__ParenExpr__Group__1__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1599:1: rule__ParenExpr__Group__1__Impl : ( () ) ;
    public final void rule__ParenExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1603:1: ( ( () ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1604:1: ( () )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1604:1: ( () )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1605:1: ()
            {
             before(grammarAccess.getParenExprAccess().getParenExprAction_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1606:1: ()
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1608:1: 
            {
            }

             after(grammarAccess.getParenExprAccess().getParenExprAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenExpr__Group__1__Impl"


    // $ANTLR start "rule__ParenExpr__Group__2"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1618:1: rule__ParenExpr__Group__2 : rule__ParenExpr__Group__2__Impl rule__ParenExpr__Group__3 ;
    public final void rule__ParenExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1622:1: ( rule__ParenExpr__Group__2__Impl rule__ParenExpr__Group__3 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1623:2: rule__ParenExpr__Group__2__Impl rule__ParenExpr__Group__3
            {
            pushFollow(FOLLOW_rule__ParenExpr__Group__2__Impl_in_rule__ParenExpr__Group__23298);
            rule__ParenExpr__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParenExpr__Group__3_in_rule__ParenExpr__Group__23301);
            rule__ParenExpr__Group__3();

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
    // $ANTLR end "rule__ParenExpr__Group__2"


    // $ANTLR start "rule__ParenExpr__Group__2__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1630:1: rule__ParenExpr__Group__2__Impl : ( ( rule__ParenExpr__ExprAssignment_2 ) ) ;
    public final void rule__ParenExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1634:1: ( ( ( rule__ParenExpr__ExprAssignment_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1635:1: ( ( rule__ParenExpr__ExprAssignment_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1635:1: ( ( rule__ParenExpr__ExprAssignment_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1636:1: ( rule__ParenExpr__ExprAssignment_2 )
            {
             before(grammarAccess.getParenExprAccess().getExprAssignment_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1637:1: ( rule__ParenExpr__ExprAssignment_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1637:2: rule__ParenExpr__ExprAssignment_2
            {
            pushFollow(FOLLOW_rule__ParenExpr__ExprAssignment_2_in_rule__ParenExpr__Group__2__Impl3328);
            rule__ParenExpr__ExprAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParenExprAccess().getExprAssignment_2()); 

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
    // $ANTLR end "rule__ParenExpr__Group__2__Impl"


    // $ANTLR start "rule__ParenExpr__Group__3"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1647:1: rule__ParenExpr__Group__3 : rule__ParenExpr__Group__3__Impl ;
    public final void rule__ParenExpr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1651:1: ( rule__ParenExpr__Group__3__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1652:2: rule__ParenExpr__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ParenExpr__Group__3__Impl_in_rule__ParenExpr__Group__33358);
            rule__ParenExpr__Group__3__Impl();

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
    // $ANTLR end "rule__ParenExpr__Group__3"


    // $ANTLR start "rule__ParenExpr__Group__3__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1658:1: rule__ParenExpr__Group__3__Impl : ( ')' ) ;
    public final void rule__ParenExpr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1662:1: ( ( ')' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1663:1: ( ')' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1663:1: ( ')' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1664:1: ')'
            {
             before(grammarAccess.getParenExprAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__ParenExpr__Group__3__Impl3386); 
             after(grammarAccess.getParenExprAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__ParenExpr__Group__3__Impl"


    // $ANTLR start "rule__ProjectReference__Group__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1685:1: rule__ProjectReference__Group__0 : rule__ProjectReference__Group__0__Impl rule__ProjectReference__Group__1 ;
    public final void rule__ProjectReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1689:1: ( rule__ProjectReference__Group__0__Impl rule__ProjectReference__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1690:2: rule__ProjectReference__Group__0__Impl rule__ProjectReference__Group__1
            {
            pushFollow(FOLLOW_rule__ProjectReference__Group__0__Impl_in_rule__ProjectReference__Group__03425);
            rule__ProjectReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProjectReference__Group__1_in_rule__ProjectReference__Group__03428);
            rule__ProjectReference__Group__1();

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
    // $ANTLR end "rule__ProjectReference__Group__0"


    // $ANTLR start "rule__ProjectReference__Group__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1697:1: rule__ProjectReference__Group__0__Impl : ( 'project' ) ;
    public final void rule__ProjectReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1701:1: ( ( 'project' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1702:1: ( 'project' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1702:1: ( 'project' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1703:1: 'project'
            {
             before(grammarAccess.getProjectReferenceAccess().getProjectKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__ProjectReference__Group__0__Impl3456); 
             after(grammarAccess.getProjectReferenceAccess().getProjectKeyword_0()); 

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
    // $ANTLR end "rule__ProjectReference__Group__0__Impl"


    // $ANTLR start "rule__ProjectReference__Group__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1716:1: rule__ProjectReference__Group__1 : rule__ProjectReference__Group__1__Impl rule__ProjectReference__Group__2 ;
    public final void rule__ProjectReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1720:1: ( rule__ProjectReference__Group__1__Impl rule__ProjectReference__Group__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1721:2: rule__ProjectReference__Group__1__Impl rule__ProjectReference__Group__2
            {
            pushFollow(FOLLOW_rule__ProjectReference__Group__1__Impl_in_rule__ProjectReference__Group__13487);
            rule__ProjectReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProjectReference__Group__2_in_rule__ProjectReference__Group__13490);
            rule__ProjectReference__Group__2();

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
    // $ANTLR end "rule__ProjectReference__Group__1"


    // $ANTLR start "rule__ProjectReference__Group__1__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1728:1: rule__ProjectReference__Group__1__Impl : ( ':' ) ;
    public final void rule__ProjectReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1732:1: ( ( ':' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1733:1: ( ':' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1733:1: ( ':' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1734:1: ':'
            {
             before(grammarAccess.getProjectReferenceAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__ProjectReference__Group__1__Impl3518); 
             after(grammarAccess.getProjectReferenceAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__ProjectReference__Group__1__Impl"


    // $ANTLR start "rule__ProjectReference__Group__2"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1747:1: rule__ProjectReference__Group__2 : rule__ProjectReference__Group__2__Impl ;
    public final void rule__ProjectReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1751:1: ( rule__ProjectReference__Group__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1752:2: rule__ProjectReference__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ProjectReference__Group__2__Impl_in_rule__ProjectReference__Group__23549);
            rule__ProjectReference__Group__2__Impl();

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
    // $ANTLR end "rule__ProjectReference__Group__2"


    // $ANTLR start "rule__ProjectReference__Group__2__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1758:1: rule__ProjectReference__Group__2__Impl : ( ( rule__ProjectReference__Alternatives_2 ) ) ;
    public final void rule__ProjectReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1762:1: ( ( ( rule__ProjectReference__Alternatives_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1763:1: ( ( rule__ProjectReference__Alternatives_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1763:1: ( ( rule__ProjectReference__Alternatives_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1764:1: ( rule__ProjectReference__Alternatives_2 )
            {
             before(grammarAccess.getProjectReferenceAccess().getAlternatives_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1765:1: ( rule__ProjectReference__Alternatives_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1765:2: rule__ProjectReference__Alternatives_2
            {
            pushFollow(FOLLOW_rule__ProjectReference__Alternatives_2_in_rule__ProjectReference__Group__2__Impl3576);
            rule__ProjectReference__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getProjectReferenceAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__ProjectReference__Group__2__Impl"


    // $ANTLR start "rule__TaskReference__Group__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1781:1: rule__TaskReference__Group__0 : rule__TaskReference__Group__0__Impl rule__TaskReference__Group__1 ;
    public final void rule__TaskReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1785:1: ( rule__TaskReference__Group__0__Impl rule__TaskReference__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1786:2: rule__TaskReference__Group__0__Impl rule__TaskReference__Group__1
            {
            pushFollow(FOLLOW_rule__TaskReference__Group__0__Impl_in_rule__TaskReference__Group__03612);
            rule__TaskReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TaskReference__Group__1_in_rule__TaskReference__Group__03615);
            rule__TaskReference__Group__1();

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
    // $ANTLR end "rule__TaskReference__Group__0"


    // $ANTLR start "rule__TaskReference__Group__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1793:1: rule__TaskReference__Group__0__Impl : ( 'task' ) ;
    public final void rule__TaskReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1797:1: ( ( 'task' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1798:1: ( 'task' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1798:1: ( 'task' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1799:1: 'task'
            {
             before(grammarAccess.getTaskReferenceAccess().getTaskKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__TaskReference__Group__0__Impl3643); 
             after(grammarAccess.getTaskReferenceAccess().getTaskKeyword_0()); 

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
    // $ANTLR end "rule__TaskReference__Group__0__Impl"


    // $ANTLR start "rule__TaskReference__Group__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1812:1: rule__TaskReference__Group__1 : rule__TaskReference__Group__1__Impl rule__TaskReference__Group__2 ;
    public final void rule__TaskReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1816:1: ( rule__TaskReference__Group__1__Impl rule__TaskReference__Group__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1817:2: rule__TaskReference__Group__1__Impl rule__TaskReference__Group__2
            {
            pushFollow(FOLLOW_rule__TaskReference__Group__1__Impl_in_rule__TaskReference__Group__13674);
            rule__TaskReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TaskReference__Group__2_in_rule__TaskReference__Group__13677);
            rule__TaskReference__Group__2();

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
    // $ANTLR end "rule__TaskReference__Group__1"


    // $ANTLR start "rule__TaskReference__Group__1__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1824:1: rule__TaskReference__Group__1__Impl : ( ':' ) ;
    public final void rule__TaskReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1828:1: ( ( ':' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1829:1: ( ':' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1829:1: ( ':' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1830:1: ':'
            {
             before(grammarAccess.getTaskReferenceAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__TaskReference__Group__1__Impl3705); 
             after(grammarAccess.getTaskReferenceAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__TaskReference__Group__1__Impl"


    // $ANTLR start "rule__TaskReference__Group__2"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1843:1: rule__TaskReference__Group__2 : rule__TaskReference__Group__2__Impl ;
    public final void rule__TaskReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1847:1: ( rule__TaskReference__Group__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1848:2: rule__TaskReference__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TaskReference__Group__2__Impl_in_rule__TaskReference__Group__23736);
            rule__TaskReference__Group__2__Impl();

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
    // $ANTLR end "rule__TaskReference__Group__2"


    // $ANTLR start "rule__TaskReference__Group__2__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1854:1: rule__TaskReference__Group__2__Impl : ( ( rule__TaskReference__Alternatives_2 ) ) ;
    public final void rule__TaskReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1858:1: ( ( ( rule__TaskReference__Alternatives_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1859:1: ( ( rule__TaskReference__Alternatives_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1859:1: ( ( rule__TaskReference__Alternatives_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1860:1: ( rule__TaskReference__Alternatives_2 )
            {
             before(grammarAccess.getTaskReferenceAccess().getAlternatives_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1861:1: ( rule__TaskReference__Alternatives_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1861:2: rule__TaskReference__Alternatives_2
            {
            pushFollow(FOLLOW_rule__TaskReference__Alternatives_2_in_rule__TaskReference__Group__2__Impl3763);
            rule__TaskReference__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskReferenceAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__TaskReference__Group__2__Impl"


    // $ANTLR start "rule__TextReference__Group__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1877:1: rule__TextReference__Group__0 : rule__TextReference__Group__0__Impl rule__TextReference__Group__1 ;
    public final void rule__TextReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1881:1: ( rule__TextReference__Group__0__Impl rule__TextReference__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1882:2: rule__TextReference__Group__0__Impl rule__TextReference__Group__1
            {
            pushFollow(FOLLOW_rule__TextReference__Group__0__Impl_in_rule__TextReference__Group__03799);
            rule__TextReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextReference__Group__1_in_rule__TextReference__Group__03802);
            rule__TextReference__Group__1();

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
    // $ANTLR end "rule__TextReference__Group__0"


    // $ANTLR start "rule__TextReference__Group__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1889:1: rule__TextReference__Group__0__Impl : ( 'text' ) ;
    public final void rule__TextReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1893:1: ( ( 'text' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1894:1: ( 'text' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1894:1: ( 'text' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1895:1: 'text'
            {
             before(grammarAccess.getTextReferenceAccess().getTextKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__TextReference__Group__0__Impl3830); 
             after(grammarAccess.getTextReferenceAccess().getTextKeyword_0()); 

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
    // $ANTLR end "rule__TextReference__Group__0__Impl"


    // $ANTLR start "rule__TextReference__Group__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1908:1: rule__TextReference__Group__1 : rule__TextReference__Group__1__Impl rule__TextReference__Group__2 ;
    public final void rule__TextReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1912:1: ( rule__TextReference__Group__1__Impl rule__TextReference__Group__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1913:2: rule__TextReference__Group__1__Impl rule__TextReference__Group__2
            {
            pushFollow(FOLLOW_rule__TextReference__Group__1__Impl_in_rule__TextReference__Group__13861);
            rule__TextReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextReference__Group__2_in_rule__TextReference__Group__13864);
            rule__TextReference__Group__2();

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
    // $ANTLR end "rule__TextReference__Group__1"


    // $ANTLR start "rule__TextReference__Group__1__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1920:1: rule__TextReference__Group__1__Impl : ( ':' ) ;
    public final void rule__TextReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1924:1: ( ( ':' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1925:1: ( ':' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1925:1: ( ':' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1926:1: ':'
            {
             before(grammarAccess.getTextReferenceAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__TextReference__Group__1__Impl3892); 
             after(grammarAccess.getTextReferenceAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__TextReference__Group__1__Impl"


    // $ANTLR start "rule__TextReference__Group__2"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1939:1: rule__TextReference__Group__2 : rule__TextReference__Group__2__Impl ;
    public final void rule__TextReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1943:1: ( rule__TextReference__Group__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1944:2: rule__TextReference__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TextReference__Group__2__Impl_in_rule__TextReference__Group__23923);
            rule__TextReference__Group__2__Impl();

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
    // $ANTLR end "rule__TextReference__Group__2"


    // $ANTLR start "rule__TextReference__Group__2__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1950:1: rule__TextReference__Group__2__Impl : ( ( rule__TextReference__Alternatives_2 ) ) ;
    public final void rule__TextReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1954:1: ( ( ( rule__TextReference__Alternatives_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1955:1: ( ( rule__TextReference__Alternatives_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1955:1: ( ( rule__TextReference__Alternatives_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1956:1: ( rule__TextReference__Alternatives_2 )
            {
             before(grammarAccess.getTextReferenceAccess().getAlternatives_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1957:1: ( rule__TextReference__Alternatives_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1957:2: rule__TextReference__Alternatives_2
            {
            pushFollow(FOLLOW_rule__TextReference__Alternatives_2_in_rule__TextReference__Group__2__Impl3950);
            rule__TextReference__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getTextReferenceAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__TextReference__Group__2__Impl"


    // $ANTLR start "rule__Words__Group__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1973:1: rule__Words__Group__0 : rule__Words__Group__0__Impl rule__Words__Group__1 ;
    public final void rule__Words__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1977:1: ( rule__Words__Group__0__Impl rule__Words__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1978:2: rule__Words__Group__0__Impl rule__Words__Group__1
            {
            pushFollow(FOLLOW_rule__Words__Group__0__Impl_in_rule__Words__Group__03986);
            rule__Words__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Words__Group__1_in_rule__Words__Group__03989);
            rule__Words__Group__1();

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
    // $ANTLR end "rule__Words__Group__0"


    // $ANTLR start "rule__Words__Group__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1985:1: rule__Words__Group__0__Impl : ( ( rule__Words__ValuesAssignment_0 ) ) ;
    public final void rule__Words__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1989:1: ( ( ( rule__Words__ValuesAssignment_0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1990:1: ( ( rule__Words__ValuesAssignment_0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1990:1: ( ( rule__Words__ValuesAssignment_0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1991:1: ( rule__Words__ValuesAssignment_0 )
            {
             before(grammarAccess.getWordsAccess().getValuesAssignment_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1992:1: ( rule__Words__ValuesAssignment_0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1992:2: rule__Words__ValuesAssignment_0
            {
            pushFollow(FOLLOW_rule__Words__ValuesAssignment_0_in_rule__Words__Group__0__Impl4016);
            rule__Words__ValuesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWordsAccess().getValuesAssignment_0()); 

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
    // $ANTLR end "rule__Words__Group__0__Impl"


    // $ANTLR start "rule__Words__Group__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2002:1: rule__Words__Group__1 : rule__Words__Group__1__Impl ;
    public final void rule__Words__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2006:1: ( rule__Words__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2007:2: rule__Words__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Words__Group__1__Impl_in_rule__Words__Group__14046);
            rule__Words__Group__1__Impl();

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
    // $ANTLR end "rule__Words__Group__1"


    // $ANTLR start "rule__Words__Group__1__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2013:1: rule__Words__Group__1__Impl : ( ( ( rule__Words__ValuesAssignment_1 ) ) ( ( rule__Words__ValuesAssignment_1 )* ) ) ;
    public final void rule__Words__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2017:1: ( ( ( ( rule__Words__ValuesAssignment_1 ) ) ( ( rule__Words__ValuesAssignment_1 )* ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2018:1: ( ( ( rule__Words__ValuesAssignment_1 ) ) ( ( rule__Words__ValuesAssignment_1 )* ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2018:1: ( ( ( rule__Words__ValuesAssignment_1 ) ) ( ( rule__Words__ValuesAssignment_1 )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2019:1: ( ( rule__Words__ValuesAssignment_1 ) ) ( ( rule__Words__ValuesAssignment_1 )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2019:1: ( ( rule__Words__ValuesAssignment_1 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2020:1: ( rule__Words__ValuesAssignment_1 )
            {
             before(grammarAccess.getWordsAccess().getValuesAssignment_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2021:1: ( rule__Words__ValuesAssignment_1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2021:2: rule__Words__ValuesAssignment_1
            {
            pushFollow(FOLLOW_rule__Words__ValuesAssignment_1_in_rule__Words__Group__1__Impl4075);
            rule__Words__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWordsAccess().getValuesAssignment_1()); 

            }

            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2024:1: ( ( rule__Words__ValuesAssignment_1 )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2025:1: ( rule__Words__ValuesAssignment_1 )*
            {
             before(grammarAccess.getWordsAccess().getValuesAssignment_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2026:1: ( rule__Words__ValuesAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2026:2: rule__Words__ValuesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Words__ValuesAssignment_1_in_rule__Words__Group__1__Impl4087);
            	    rule__Words__ValuesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getWordsAccess().getValuesAssignment_1()); 

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
    // $ANTLR end "rule__Words__Group__1__Impl"


    // $ANTLR start "rule__TagReference__Group__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2041:1: rule__TagReference__Group__0 : rule__TagReference__Group__0__Impl rule__TagReference__Group__1 ;
    public final void rule__TagReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2045:1: ( rule__TagReference__Group__0__Impl rule__TagReference__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2046:2: rule__TagReference__Group__0__Impl rule__TagReference__Group__1
            {
            pushFollow(FOLLOW_rule__TagReference__Group__0__Impl_in_rule__TagReference__Group__04124);
            rule__TagReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TagReference__Group__1_in_rule__TagReference__Group__04127);
            rule__TagReference__Group__1();

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
    // $ANTLR end "rule__TagReference__Group__0"


    // $ANTLR start "rule__TagReference__Group__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2053:1: rule__TagReference__Group__0__Impl : ( '@' ) ;
    public final void rule__TagReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2057:1: ( ( '@' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2058:1: ( '@' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2058:1: ( '@' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2059:1: '@'
            {
             before(grammarAccess.getTagReferenceAccess().getCommercialAtKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__TagReference__Group__0__Impl4155); 
             after(grammarAccess.getTagReferenceAccess().getCommercialAtKeyword_0()); 

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
    // $ANTLR end "rule__TagReference__Group__0__Impl"


    // $ANTLR start "rule__TagReference__Group__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2072:1: rule__TagReference__Group__1 : rule__TagReference__Group__1__Impl ;
    public final void rule__TagReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2076:1: ( rule__TagReference__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2077:2: rule__TagReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TagReference__Group__1__Impl_in_rule__TagReference__Group__14186);
            rule__TagReference__Group__1__Impl();

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
    // $ANTLR end "rule__TagReference__Group__1"


    // $ANTLR start "rule__TagReference__Group__1__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2083:1: rule__TagReference__Group__1__Impl : ( ( rule__TagReference__ValueAssignment_1 ) ) ;
    public final void rule__TagReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2087:1: ( ( ( rule__TagReference__ValueAssignment_1 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2088:1: ( ( rule__TagReference__ValueAssignment_1 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2088:1: ( ( rule__TagReference__ValueAssignment_1 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2089:1: ( rule__TagReference__ValueAssignment_1 )
            {
             before(grammarAccess.getTagReferenceAccess().getValueAssignment_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2090:1: ( rule__TagReference__ValueAssignment_1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2090:2: rule__TagReference__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__TagReference__ValueAssignment_1_in_rule__TagReference__Group__1__Impl4213);
            rule__TagReference__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTagReferenceAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__TagReference__Group__1__Impl"


    // $ANTLR start "rule__Query__ExpressionAssignment_1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2105:1: rule__Query__ExpressionAssignment_1 : ( ruleOrExpr ) ;
    public final void rule__Query__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2109:1: ( ( ruleOrExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2110:1: ( ruleOrExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2110:1: ( ruleOrExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2111:1: ruleOrExpr
            {
             before(grammarAccess.getQueryAccess().getExpressionOrExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleOrExpr_in_rule__Query__ExpressionAssignment_14252);
            ruleOrExpr();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getExpressionOrExprParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Query__ExpressionAssignment_1"


    // $ANTLR start "rule__OrExpr__RightAssignment_1_2"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2120:1: rule__OrExpr__RightAssignment_1_2 : ( ruleAndExpr ) ;
    public final void rule__OrExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2124:1: ( ( ruleAndExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2125:1: ( ruleAndExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2125:1: ( ruleAndExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2126:1: ruleAndExpr
            {
             before(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAndExpr_in_rule__OrExpr__RightAssignment_1_24283);
            ruleAndExpr();

            state._fsp--;

             after(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__OrExpr__RightAssignment_1_2"


    // $ANTLR start "rule__AndExpr__RightAssignment_1_2"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2135:1: rule__AndExpr__RightAssignment_1_2 : ( ruleCompEqExpr ) ;
    public final void rule__AndExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2139:1: ( ( ruleCompEqExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2140:1: ( ruleCompEqExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2140:1: ( ruleCompEqExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2141:1: ruleCompEqExpr
            {
             before(grammarAccess.getAndExprAccess().getRightCompEqExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleCompEqExpr_in_rule__AndExpr__RightAssignment_1_24314);
            ruleCompEqExpr();

            state._fsp--;

             after(grammarAccess.getAndExprAccess().getRightCompEqExprParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__AndExpr__RightAssignment_1_2"


    // $ANTLR start "rule__CompEqExpr__OperatorAssignment_1_1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2150:1: rule__CompEqExpr__OperatorAssignment_1_1 : ( ruleCompEqOperator ) ;
    public final void rule__CompEqExpr__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2154:1: ( ( ruleCompEqOperator ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2155:1: ( ruleCompEqOperator )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2155:1: ( ruleCompEqOperator )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2156:1: ruleCompEqOperator
            {
             before(grammarAccess.getCompEqExprAccess().getOperatorCompEqOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleCompEqOperator_in_rule__CompEqExpr__OperatorAssignment_1_14345);
            ruleCompEqOperator();

            state._fsp--;

             after(grammarAccess.getCompEqExprAccess().getOperatorCompEqOperatorEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__CompEqExpr__OperatorAssignment_1_1"


    // $ANTLR start "rule__CompEqExpr__RightAssignment_1_2"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2165:1: rule__CompEqExpr__RightAssignment_1_2 : ( ruleCompExpr ) ;
    public final void rule__CompEqExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2169:1: ( ( ruleCompExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2170:1: ( ruleCompExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2170:1: ( ruleCompExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2171:1: ruleCompExpr
            {
             before(grammarAccess.getCompEqExprAccess().getRightCompExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleCompExpr_in_rule__CompEqExpr__RightAssignment_1_24376);
            ruleCompExpr();

            state._fsp--;

             after(grammarAccess.getCompEqExprAccess().getRightCompExprParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__CompEqExpr__RightAssignment_1_2"


    // $ANTLR start "rule__CompExpr__OperatorAssignment_1_1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2180:1: rule__CompExpr__OperatorAssignment_1_1 : ( ruleCompOperator ) ;
    public final void rule__CompExpr__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2184:1: ( ( ruleCompOperator ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2185:1: ( ruleCompOperator )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2185:1: ( ruleCompOperator )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2186:1: ruleCompOperator
            {
             before(grammarAccess.getCompExprAccess().getOperatorCompOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleCompOperator_in_rule__CompExpr__OperatorAssignment_1_14407);
            ruleCompOperator();

            state._fsp--;

             after(grammarAccess.getCompExprAccess().getOperatorCompOperatorEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__CompExpr__OperatorAssignment_1_1"


    // $ANTLR start "rule__CompExpr__RightAssignment_1_2"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2195:1: rule__CompExpr__RightAssignment_1_2 : ( ruleUnaryExpr ) ;
    public final void rule__CompExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2199:1: ( ( ruleUnaryExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2200:1: ( ruleUnaryExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2200:1: ( ruleUnaryExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2201:1: ruleUnaryExpr
            {
             before(grammarAccess.getCompExprAccess().getRightUnaryExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_rule__CompExpr__RightAssignment_1_24438);
            ruleUnaryExpr();

            state._fsp--;

             after(grammarAccess.getCompExprAccess().getRightUnaryExprParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__CompExpr__RightAssignment_1_2"


    // $ANTLR start "rule__UnaryExpr__ExprAssignment_1_2"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2210:1: rule__UnaryExpr__ExprAssignment_1_2 : ( ruleUnaryExpr ) ;
    public final void rule__UnaryExpr__ExprAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2214:1: ( ( ruleUnaryExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2215:1: ( ruleUnaryExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2215:1: ( ruleUnaryExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2216:1: ruleUnaryExpr
            {
             before(grammarAccess.getUnaryExprAccess().getExprUnaryExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_rule__UnaryExpr__ExprAssignment_1_24469);
            ruleUnaryExpr();

            state._fsp--;

             after(grammarAccess.getUnaryExprAccess().getExprUnaryExprParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__UnaryExpr__ExprAssignment_1_2"


    // $ANTLR start "rule__ParenExpr__ExprAssignment_2"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2225:1: rule__ParenExpr__ExprAssignment_2 : ( ruleOrExpr ) ;
    public final void rule__ParenExpr__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2229:1: ( ( ruleOrExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2230:1: ( ruleOrExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2230:1: ( ruleOrExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2231:1: ruleOrExpr
            {
             before(grammarAccess.getParenExprAccess().getExprOrExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleOrExpr_in_rule__ParenExpr__ExprAssignment_24500);
            ruleOrExpr();

            state._fsp--;

             after(grammarAccess.getParenExprAccess().getExprOrExprParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ParenExpr__ExprAssignment_2"


    // $ANTLR start "rule__ProjectReference__ValueAssignment_2_0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2240:1: rule__ProjectReference__ValueAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__ProjectReference__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2244:1: ( ( RULE_ID ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2245:1: ( RULE_ID )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2245:1: ( RULE_ID )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2246:1: RULE_ID
            {
             before(grammarAccess.getProjectReferenceAccess().getValueIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProjectReference__ValueAssignment_2_04531); 
             after(grammarAccess.getProjectReferenceAccess().getValueIDTerminalRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__ProjectReference__ValueAssignment_2_0"


    // $ANTLR start "rule__ProjectReference__ValueAssignment_2_1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2255:1: rule__ProjectReference__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__ProjectReference__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2259:1: ( ( RULE_STRING ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2260:1: ( RULE_STRING )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2260:1: ( RULE_STRING )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2261:1: RULE_STRING
            {
             before(grammarAccess.getProjectReferenceAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ProjectReference__ValueAssignment_2_14562); 
             after(grammarAccess.getProjectReferenceAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ProjectReference__ValueAssignment_2_1"


    // $ANTLR start "rule__TaskReference__ValueAssignment_2_0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2270:1: rule__TaskReference__ValueAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__TaskReference__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2274:1: ( ( RULE_ID ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2275:1: ( RULE_ID )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2275:1: ( RULE_ID )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2276:1: RULE_ID
            {
             before(grammarAccess.getTaskReferenceAccess().getValueIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TaskReference__ValueAssignment_2_04593); 
             after(grammarAccess.getTaskReferenceAccess().getValueIDTerminalRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__TaskReference__ValueAssignment_2_0"


    // $ANTLR start "rule__TaskReference__ValueAssignment_2_1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2285:1: rule__TaskReference__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__TaskReference__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2289:1: ( ( RULE_STRING ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2290:1: ( RULE_STRING )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2290:1: ( RULE_STRING )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2291:1: RULE_STRING
            {
             before(grammarAccess.getTaskReferenceAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TaskReference__ValueAssignment_2_14624); 
             after(grammarAccess.getTaskReferenceAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__TaskReference__ValueAssignment_2_1"


    // $ANTLR start "rule__TextReference__ValueAssignment_2_0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2300:1: rule__TextReference__ValueAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__TextReference__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2304:1: ( ( RULE_ID ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2305:1: ( RULE_ID )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2305:1: ( RULE_ID )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2306:1: RULE_ID
            {
             before(grammarAccess.getTextReferenceAccess().getValueIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TextReference__ValueAssignment_2_04655); 
             after(grammarAccess.getTextReferenceAccess().getValueIDTerminalRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__TextReference__ValueAssignment_2_0"


    // $ANTLR start "rule__TextReference__ValueAssignment_2_1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2315:1: rule__TextReference__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__TextReference__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2319:1: ( ( RULE_STRING ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2320:1: ( RULE_STRING )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2320:1: ( RULE_STRING )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2321:1: RULE_STRING
            {
             before(grammarAccess.getTextReferenceAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextReference__ValueAssignment_2_14686); 
             after(grammarAccess.getTextReferenceAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__TextReference__ValueAssignment_2_1"


    // $ANTLR start "rule__Words__ValuesAssignment_0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2330:1: rule__Words__ValuesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Words__ValuesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2334:1: ( ( RULE_ID ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2335:1: ( RULE_ID )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2335:1: ( RULE_ID )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2336:1: RULE_ID
            {
             before(grammarAccess.getWordsAccess().getValuesIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Words__ValuesAssignment_04717); 
             after(grammarAccess.getWordsAccess().getValuesIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Words__ValuesAssignment_0"


    // $ANTLR start "rule__Words__ValuesAssignment_1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2345:1: rule__Words__ValuesAssignment_1 : ( RULE_ID ) ;
    public final void rule__Words__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2349:1: ( ( RULE_ID ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2350:1: ( RULE_ID )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2350:1: ( RULE_ID )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2351:1: RULE_ID
            {
             before(grammarAccess.getWordsAccess().getValuesIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Words__ValuesAssignment_14748); 
             after(grammarAccess.getWordsAccess().getValuesIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Words__ValuesAssignment_1"


    // $ANTLR start "rule__Word__ValueAssignment"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2360:1: rule__Word__ValueAssignment : ( RULE_ID ) ;
    public final void rule__Word__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2364:1: ( ( RULE_ID ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2365:1: ( RULE_ID )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2365:1: ( RULE_ID )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2366:1: RULE_ID
            {
             before(grammarAccess.getWordAccess().getValueIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Word__ValueAssignment4779); 
             after(grammarAccess.getWordAccess().getValueIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Word__ValueAssignment"


    // $ANTLR start "rule__Phrase__ValueAssignment"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2375:1: rule__Phrase__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__Phrase__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2379:1: ( ( RULE_STRING ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2380:1: ( RULE_STRING )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2380:1: ( RULE_STRING )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2381:1: RULE_STRING
            {
             before(grammarAccess.getPhraseAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Phrase__ValueAssignment4810); 
             after(grammarAccess.getPhraseAccess().getValueSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Phrase__ValueAssignment"


    // $ANTLR start "rule__TagReference__ValueAssignment_1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2390:1: rule__TagReference__ValueAssignment_1 : ( RULE_ID ) ;
    public final void rule__TagReference__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2394:1: ( ( RULE_ID ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2395:1: ( RULE_ID )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2395:1: ( RULE_ID )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2396:1: RULE_ID
            {
             before(grammarAccess.getTagReferenceAccess().getValueIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TagReference__ValueAssignment_14841); 
             after(grammarAccess.getTagReferenceAccess().getValueIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__TagReference__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__0_in_ruleQuery94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_entryRuleOrExpr121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpr128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group__0_in_ruleOrExpr154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_entryRuleAndExpr181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpr188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__0_in_ruleAndExpr214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompEqExpr_in_entryRuleCompEqExpr241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompEqExpr248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group__0_in_ruleCompEqExpr274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompExpr_in_entryRuleCompExpr301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompExpr308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompExpr__Group__0_in_ruleCompExpr334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpr368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Alternatives_in_ruleUnaryExpr394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Alternatives_in_ruleAtom454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenExpr_in_entryRuleParenExpr541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenExpr548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenExpr__Group__0_in_ruleParenExpr574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectReference_in_entryRuleProjectReference601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjectReference608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectReference__Group__0_in_ruleProjectReference634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskReference_in_entryRuleTaskReference661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaskReference668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskReference__Group__0_in_ruleTaskReference694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextReference_in_entryRuleTextReference721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextReference728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextReference__Group__0_in_ruleTextReference754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWords_in_entryRuleWords781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWords788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Words__Group__0_in_ruleWords814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_entryRuleWord841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWord848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Word__ValueAssignment_in_ruleWord874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhrase_in_entryRulePhrase901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhrase908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phrase__ValueAssignment_in_rulePhrase934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagReference_in_entryRuleTagReference961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagReference968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagReference__Group__0_in_ruleTagReference994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompEqOperator__Alternatives_in_ruleCompEqOperator1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompOperator__Alternatives_in_ruleCompOperator1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__UnaryExpr__Alternatives1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group_1__0_in_rule__UnaryExpr__Alternatives1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Atom__Alternatives1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWords_in_rule__Atom__Alternatives1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenExpr_in_rule__Atom__Alternatives1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectReference_in_rule__Value__Alternatives1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_rule__Value__Alternatives1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhrase_in_rule__Value__Alternatives1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagReference_in_rule__Value__Alternatives1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextReference_in_rule__Value__Alternatives1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskReference_in_rule__Value__Alternatives1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectReference__ValueAssignment_2_0_in_rule__ProjectReference__Alternatives_21335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectReference__ValueAssignment_2_1_in_rule__ProjectReference__Alternatives_21353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskReference__ValueAssignment_2_0_in_rule__TaskReference__Alternatives_21386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskReference__ValueAssignment_2_1_in_rule__TaskReference__Alternatives_21404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextReference__ValueAssignment_2_0_in_rule__TextReference__Alternatives_21437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextReference__ValueAssignment_2_1_in_rule__TextReference__Alternatives_21455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__CompEqOperator__Alternatives1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CompEqOperator__Alternatives1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CompOperator__Alternatives1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CompOperator__Alternatives1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CompOperator__Alternatives1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CompOperator__Alternatives1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__01642 = new BitSet(new long[]{0x0000000007580030L});
    public static final BitSet FOLLOW_rule__Query__Group__1_in_rule__Query__Group__01645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__11703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ExpressionAssignment_1_in_rule__Query__Group__1__Impl1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group__0__Impl_in_rule__OrExpr__Group__01765 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__OrExpr__Group__1_in_rule__OrExpr__Group__01768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_rule__OrExpr__Group__0__Impl1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group__1__Impl_in_rule__OrExpr__Group__11824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__0_in_rule__OrExpr__Group__1__Impl1851 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__0__Impl_in_rule__OrExpr__Group_1__01886 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__1_in_rule__OrExpr__Group_1__01889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__1__Impl_in_rule__OrExpr__Group_1__11947 = new BitSet(new long[]{0x0000000007580030L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__2_in_rule__OrExpr__Group_1__11950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__OrExpr__Group_1__1__Impl1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__2__Impl_in_rule__OrExpr__Group_1__22009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__RightAssignment_1_2_in_rule__OrExpr__Group_1__2__Impl2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__0__Impl_in_rule__AndExpr__Group__02072 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__1_in_rule__AndExpr__Group__02075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompEqExpr_in_rule__AndExpr__Group__0__Impl2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__1__Impl_in_rule__AndExpr__Group__12131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__0_in_rule__AndExpr__Group__1__Impl2158 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__0__Impl_in_rule__AndExpr__Group_1__02193 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__1_in_rule__AndExpr__Group_1__02196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__1__Impl_in_rule__AndExpr__Group_1__12254 = new BitSet(new long[]{0x0000000007580030L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__2_in_rule__AndExpr__Group_1__12257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AndExpr__Group_1__1__Impl2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__2__Impl_in_rule__AndExpr__Group_1__22316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__RightAssignment_1_2_in_rule__AndExpr__Group_1__2__Impl2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group__0__Impl_in_rule__CompEqExpr__Group__02379 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group__1_in_rule__CompEqExpr__Group__02382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompExpr_in_rule__CompEqExpr__Group__0__Impl2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group__1__Impl_in_rule__CompEqExpr__Group__12438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group_1__0_in_rule__CompEqExpr__Group__1__Impl2465 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group_1__0__Impl_in_rule__CompEqExpr__Group_1__02500 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group_1__1_in_rule__CompEqExpr__Group_1__02503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group_1__1__Impl_in_rule__CompEqExpr__Group_1__12561 = new BitSet(new long[]{0x0000000007580030L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group_1__2_in_rule__CompEqExpr__Group_1__12564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompEqExpr__OperatorAssignment_1_1_in_rule__CompEqExpr__Group_1__1__Impl2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group_1__2__Impl_in_rule__CompEqExpr__Group_1__22621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompEqExpr__RightAssignment_1_2_in_rule__CompEqExpr__Group_1__2__Impl2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompExpr__Group__0__Impl_in_rule__CompExpr__Group__02684 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_rule__CompExpr__Group__1_in_rule__CompExpr__Group__02687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rule__CompExpr__Group__0__Impl2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompExpr__Group__1__Impl_in_rule__CompExpr__Group__12743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompExpr__Group_1__0_in_rule__CompExpr__Group__1__Impl2770 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_rule__CompExpr__Group_1__0__Impl_in_rule__CompExpr__Group_1__02805 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_rule__CompExpr__Group_1__1_in_rule__CompExpr__Group_1__02808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompExpr__Group_1__1__Impl_in_rule__CompExpr__Group_1__12866 = new BitSet(new long[]{0x0000000007580030L});
    public static final BitSet FOLLOW_rule__CompExpr__Group_1__2_in_rule__CompExpr__Group_1__12869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompExpr__OperatorAssignment_1_1_in_rule__CompExpr__Group_1__1__Impl2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompExpr__Group_1__2__Impl_in_rule__CompExpr__Group_1__22926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompExpr__RightAssignment_1_2_in_rule__CompExpr__Group_1__2__Impl2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group_1__0__Impl_in_rule__UnaryExpr__Group_1__02989 = new BitSet(new long[]{0x0000000007580030L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group_1__1_in_rule__UnaryExpr__Group_1__02992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group_1__1__Impl_in_rule__UnaryExpr__Group_1__13050 = new BitSet(new long[]{0x0000000007580030L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group_1__2_in_rule__UnaryExpr__Group_1__13053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__UnaryExpr__Group_1__1__Impl3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group_1__2__Impl_in_rule__UnaryExpr__Group_1__23112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__ExprAssignment_1_2_in_rule__UnaryExpr__Group_1__2__Impl3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenExpr__Group__0__Impl_in_rule__ParenExpr__Group__03175 = new BitSet(new long[]{0x0000000007580030L});
    public static final BitSet FOLLOW_rule__ParenExpr__Group__1_in_rule__ParenExpr__Group__03178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ParenExpr__Group__0__Impl3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenExpr__Group__1__Impl_in_rule__ParenExpr__Group__13237 = new BitSet(new long[]{0x0000000007580030L});
    public static final BitSet FOLLOW_rule__ParenExpr__Group__2_in_rule__ParenExpr__Group__13240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenExpr__Group__2__Impl_in_rule__ParenExpr__Group__23298 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ParenExpr__Group__3_in_rule__ParenExpr__Group__23301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenExpr__ExprAssignment_2_in_rule__ParenExpr__Group__2__Impl3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenExpr__Group__3__Impl_in_rule__ParenExpr__Group__33358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ParenExpr__Group__3__Impl3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectReference__Group__0__Impl_in_rule__ProjectReference__Group__03425 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ProjectReference__Group__1_in_rule__ProjectReference__Group__03428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ProjectReference__Group__0__Impl3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectReference__Group__1__Impl_in_rule__ProjectReference__Group__13487 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ProjectReference__Group__2_in_rule__ProjectReference__Group__13490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ProjectReference__Group__1__Impl3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectReference__Group__2__Impl_in_rule__ProjectReference__Group__23549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectReference__Alternatives_2_in_rule__ProjectReference__Group__2__Impl3576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskReference__Group__0__Impl_in_rule__TaskReference__Group__03612 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__TaskReference__Group__1_in_rule__TaskReference__Group__03615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TaskReference__Group__0__Impl3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskReference__Group__1__Impl_in_rule__TaskReference__Group__13674 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__TaskReference__Group__2_in_rule__TaskReference__Group__13677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TaskReference__Group__1__Impl3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskReference__Group__2__Impl_in_rule__TaskReference__Group__23736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskReference__Alternatives_2_in_rule__TaskReference__Group__2__Impl3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextReference__Group__0__Impl_in_rule__TextReference__Group__03799 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__TextReference__Group__1_in_rule__TextReference__Group__03802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TextReference__Group__0__Impl3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextReference__Group__1__Impl_in_rule__TextReference__Group__13861 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__TextReference__Group__2_in_rule__TextReference__Group__13864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TextReference__Group__1__Impl3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextReference__Group__2__Impl_in_rule__TextReference__Group__23923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextReference__Alternatives_2_in_rule__TextReference__Group__2__Impl3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Words__Group__0__Impl_in_rule__Words__Group__03986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Words__Group__1_in_rule__Words__Group__03989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Words__ValuesAssignment_0_in_rule__Words__Group__0__Impl4016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Words__Group__1__Impl_in_rule__Words__Group__14046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Words__ValuesAssignment_1_in_rule__Words__Group__1__Impl4075 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Words__ValuesAssignment_1_in_rule__Words__Group__1__Impl4087 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__TagReference__Group__0__Impl_in_rule__TagReference__Group__04124 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TagReference__Group__1_in_rule__TagReference__Group__04127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TagReference__Group__0__Impl4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagReference__Group__1__Impl_in_rule__TagReference__Group__14186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagReference__ValueAssignment_1_in_rule__TagReference__Group__1__Impl4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_rule__Query__ExpressionAssignment_14252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_rule__OrExpr__RightAssignment_1_24283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompEqExpr_in_rule__AndExpr__RightAssignment_1_24314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompEqOperator_in_rule__CompEqExpr__OperatorAssignment_1_14345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompExpr_in_rule__CompEqExpr__RightAssignment_1_24376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompOperator_in_rule__CompExpr__OperatorAssignment_1_14407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rule__CompExpr__RightAssignment_1_24438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rule__UnaryExpr__ExprAssignment_1_24469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_rule__ParenExpr__ExprAssignment_24500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProjectReference__ValueAssignment_2_04531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ProjectReference__ValueAssignment_2_14562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TaskReference__ValueAssignment_2_04593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TaskReference__ValueAssignment_2_14624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TextReference__ValueAssignment_2_04655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextReference__ValueAssignment_2_14686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Words__ValuesAssignment_04717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Words__ValuesAssignment_14748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Word__ValueAssignment4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Phrase__ValueAssignment4810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TagReference__ValueAssignment_14841 = new BitSet(new long[]{0x0000000000000002L});

}