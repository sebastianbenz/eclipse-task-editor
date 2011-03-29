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


    // $ANTLR start "rule__CompEqOperator__Alternatives"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:643:1: rule__CompEqOperator__Alternatives : ( ( ( '=' ) ) | ( ( '!=' ) ) );
    public final void rule__CompEqOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:647:1: ( ( ( '=' ) ) | ( ( '!=' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:648:1: ( ( '=' ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:648:1: ( ( '=' ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:649:1: ( '=' )
                    {
                     before(grammarAccess.getCompEqOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:650:1: ( '=' )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:650:3: '='
                    {
                    match(input,11,FOLLOW_11_in_rule__CompEqOperator__Alternatives1336); 

                    }

                     after(grammarAccess.getCompEqOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:655:6: ( ( '!=' ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:655:6: ( ( '!=' ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:656:1: ( '!=' )
                    {
                     before(grammarAccess.getCompEqOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_1()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:657:1: ( '!=' )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:657:3: '!='
                    {
                    match(input,12,FOLLOW_12_in_rule__CompEqOperator__Alternatives1357); 

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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:667:1: rule__CompOperator__Alternatives : ( ( ( '<=' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) );
    public final void rule__CompOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:671:1: ( ( ( '<=' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            case 16:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:672:1: ( ( '<=' ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:672:1: ( ( '<=' ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:673:1: ( '<=' )
                    {
                     before(grammarAccess.getCompOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_0()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:674:1: ( '<=' )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:674:3: '<='
                    {
                    match(input,13,FOLLOW_13_in_rule__CompOperator__Alternatives1393); 

                    }

                     after(grammarAccess.getCompOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:679:6: ( ( '<' ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:679:6: ( ( '<' ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:680:1: ( '<' )
                    {
                     before(grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_1()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:681:1: ( '<' )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:681:3: '<'
                    {
                    match(input,14,FOLLOW_14_in_rule__CompOperator__Alternatives1414); 

                    }

                     after(grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:686:6: ( ( '>=' ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:686:6: ( ( '>=' ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:687:1: ( '>=' )
                    {
                     before(grammarAccess.getCompOperatorAccess().getGREATER_EQUALEnumLiteralDeclaration_2()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:688:1: ( '>=' )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:688:3: '>='
                    {
                    match(input,15,FOLLOW_15_in_rule__CompOperator__Alternatives1435); 

                    }

                     after(grammarAccess.getCompOperatorAccess().getGREATER_EQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:693:6: ( ( '>' ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:693:6: ( ( '>' ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:694:1: ( '>' )
                    {
                     before(grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_3()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:695:1: ( '>' )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:695:3: '>'
                    {
                    match(input,16,FOLLOW_16_in_rule__CompOperator__Alternatives1456); 

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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:707:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:711:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:712:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__01489);
            rule__Query__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Query__Group__1_in_rule__Query__Group__01492);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:719:1: rule__Query__Group__0__Impl : ( () ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:723:1: ( ( () ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:724:1: ( () )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:724:1: ( () )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:725:1: ()
            {
             before(grammarAccess.getQueryAccess().getQueryAction_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:726:1: ()
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:728:1: 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:738:1: rule__Query__Group__1 : rule__Query__Group__1__Impl ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:742:1: ( rule__Query__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:743:2: rule__Query__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__11550);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:749:1: rule__Query__Group__1__Impl : ( ( rule__Query__ExpressionAssignment_1 )? ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:753:1: ( ( ( rule__Query__ExpressionAssignment_1 )? ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:754:1: ( ( rule__Query__ExpressionAssignment_1 )? )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:754:1: ( ( rule__Query__ExpressionAssignment_1 )? )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:755:1: ( rule__Query__ExpressionAssignment_1 )?
            {
             before(grammarAccess.getQueryAccess().getExpressionAssignment_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:756:1: ( rule__Query__ExpressionAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)||(LA6_0>=19 && LA6_0<=20)||LA6_0==22||(LA6_0>=24 && LA6_0<=26)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:756:2: rule__Query__ExpressionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Query__ExpressionAssignment_1_in_rule__Query__Group__1__Impl1577);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:770:1: rule__OrExpr__Group__0 : rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1 ;
    public final void rule__OrExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:774:1: ( rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:775:2: rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1
            {
            pushFollow(FOLLOW_rule__OrExpr__Group__0__Impl_in_rule__OrExpr__Group__01612);
            rule__OrExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpr__Group__1_in_rule__OrExpr__Group__01615);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:782:1: rule__OrExpr__Group__0__Impl : ( ruleAndExpr ) ;
    public final void rule__OrExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:786:1: ( ( ruleAndExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:787:1: ( ruleAndExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:787:1: ( ruleAndExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:788:1: ruleAndExpr
            {
             before(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAndExpr_in_rule__OrExpr__Group__0__Impl1642);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:799:1: rule__OrExpr__Group__1 : rule__OrExpr__Group__1__Impl ;
    public final void rule__OrExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:803:1: ( rule__OrExpr__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:804:2: rule__OrExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpr__Group__1__Impl_in_rule__OrExpr__Group__11671);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:810:1: rule__OrExpr__Group__1__Impl : ( ( rule__OrExpr__Group_1__0 )* ) ;
    public final void rule__OrExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:814:1: ( ( ( rule__OrExpr__Group_1__0 )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:815:1: ( ( rule__OrExpr__Group_1__0 )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:815:1: ( ( rule__OrExpr__Group_1__0 )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:816:1: ( rule__OrExpr__Group_1__0 )*
            {
             before(grammarAccess.getOrExprAccess().getGroup_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:817:1: ( rule__OrExpr__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:817:2: rule__OrExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrExpr__Group_1__0_in_rule__OrExpr__Group__1__Impl1698);
            	    rule__OrExpr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:831:1: rule__OrExpr__Group_1__0 : rule__OrExpr__Group_1__0__Impl rule__OrExpr__Group_1__1 ;
    public final void rule__OrExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:835:1: ( rule__OrExpr__Group_1__0__Impl rule__OrExpr__Group_1__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:836:2: rule__OrExpr__Group_1__0__Impl rule__OrExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrExpr__Group_1__0__Impl_in_rule__OrExpr__Group_1__01733);
            rule__OrExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpr__Group_1__1_in_rule__OrExpr__Group_1__01736);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:843:1: rule__OrExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:847:1: ( ( () ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:848:1: ( () )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:848:1: ( () )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:849:1: ()
            {
             before(grammarAccess.getOrExprAccess().getOrExprLeftAction_1_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:850:1: ()
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:852:1: 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:862:1: rule__OrExpr__Group_1__1 : rule__OrExpr__Group_1__1__Impl rule__OrExpr__Group_1__2 ;
    public final void rule__OrExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:866:1: ( rule__OrExpr__Group_1__1__Impl rule__OrExpr__Group_1__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:867:2: rule__OrExpr__Group_1__1__Impl rule__OrExpr__Group_1__2
            {
            pushFollow(FOLLOW_rule__OrExpr__Group_1__1__Impl_in_rule__OrExpr__Group_1__11794);
            rule__OrExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpr__Group_1__2_in_rule__OrExpr__Group_1__11797);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:874:1: rule__OrExpr__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__OrExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:878:1: ( ( 'or' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:879:1: ( 'or' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:879:1: ( 'or' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:880:1: 'or'
            {
             before(grammarAccess.getOrExprAccess().getOrKeyword_1_1()); 
            match(input,17,FOLLOW_17_in_rule__OrExpr__Group_1__1__Impl1825); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:893:1: rule__OrExpr__Group_1__2 : rule__OrExpr__Group_1__2__Impl ;
    public final void rule__OrExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:897:1: ( rule__OrExpr__Group_1__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:898:2: rule__OrExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__OrExpr__Group_1__2__Impl_in_rule__OrExpr__Group_1__21856);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:904:1: rule__OrExpr__Group_1__2__Impl : ( ( rule__OrExpr__RightAssignment_1_2 ) ) ;
    public final void rule__OrExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:908:1: ( ( ( rule__OrExpr__RightAssignment_1_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:909:1: ( ( rule__OrExpr__RightAssignment_1_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:909:1: ( ( rule__OrExpr__RightAssignment_1_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:910:1: ( rule__OrExpr__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrExprAccess().getRightAssignment_1_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:911:1: ( rule__OrExpr__RightAssignment_1_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:911:2: rule__OrExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__OrExpr__RightAssignment_1_2_in_rule__OrExpr__Group_1__2__Impl1883);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:927:1: rule__AndExpr__Group__0 : rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1 ;
    public final void rule__AndExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:931:1: ( rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:932:2: rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1
            {
            pushFollow(FOLLOW_rule__AndExpr__Group__0__Impl_in_rule__AndExpr__Group__01919);
            rule__AndExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpr__Group__1_in_rule__AndExpr__Group__01922);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:939:1: rule__AndExpr__Group__0__Impl : ( ruleCompEqExpr ) ;
    public final void rule__AndExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:943:1: ( ( ruleCompEqExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:944:1: ( ruleCompEqExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:944:1: ( ruleCompEqExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:945:1: ruleCompEqExpr
            {
             before(grammarAccess.getAndExprAccess().getCompEqExprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleCompEqExpr_in_rule__AndExpr__Group__0__Impl1949);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:956:1: rule__AndExpr__Group__1 : rule__AndExpr__Group__1__Impl ;
    public final void rule__AndExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:960:1: ( rule__AndExpr__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:961:2: rule__AndExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpr__Group__1__Impl_in_rule__AndExpr__Group__11978);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:967:1: rule__AndExpr__Group__1__Impl : ( ( rule__AndExpr__Group_1__0 )* ) ;
    public final void rule__AndExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:971:1: ( ( ( rule__AndExpr__Group_1__0 )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:972:1: ( ( rule__AndExpr__Group_1__0 )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:972:1: ( ( rule__AndExpr__Group_1__0 )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:973:1: ( rule__AndExpr__Group_1__0 )*
            {
             before(grammarAccess.getAndExprAccess().getGroup_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:974:1: ( rule__AndExpr__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:974:2: rule__AndExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExpr__Group_1__0_in_rule__AndExpr__Group__1__Impl2005);
            	    rule__AndExpr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:988:1: rule__AndExpr__Group_1__0 : rule__AndExpr__Group_1__0__Impl rule__AndExpr__Group_1__1 ;
    public final void rule__AndExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:992:1: ( rule__AndExpr__Group_1__0__Impl rule__AndExpr__Group_1__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:993:2: rule__AndExpr__Group_1__0__Impl rule__AndExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1__0__Impl_in_rule__AndExpr__Group_1__02040);
            rule__AndExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpr__Group_1__1_in_rule__AndExpr__Group_1__02043);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1000:1: rule__AndExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1004:1: ( ( () ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1005:1: ( () )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1005:1: ( () )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1006:1: ()
            {
             before(grammarAccess.getAndExprAccess().getAndExprLeftAction_1_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1007:1: ()
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1009:1: 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1019:1: rule__AndExpr__Group_1__1 : rule__AndExpr__Group_1__1__Impl rule__AndExpr__Group_1__2 ;
    public final void rule__AndExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1023:1: ( rule__AndExpr__Group_1__1__Impl rule__AndExpr__Group_1__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1024:2: rule__AndExpr__Group_1__1__Impl rule__AndExpr__Group_1__2
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1__1__Impl_in_rule__AndExpr__Group_1__12101);
            rule__AndExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpr__Group_1__2_in_rule__AndExpr__Group_1__12104);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1031:1: rule__AndExpr__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__AndExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1035:1: ( ( 'and' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1036:1: ( 'and' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1036:1: ( 'and' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1037:1: 'and'
            {
             before(grammarAccess.getAndExprAccess().getAndKeyword_1_1()); 
            match(input,18,FOLLOW_18_in_rule__AndExpr__Group_1__1__Impl2132); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1050:1: rule__AndExpr__Group_1__2 : rule__AndExpr__Group_1__2__Impl ;
    public final void rule__AndExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1054:1: ( rule__AndExpr__Group_1__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1055:2: rule__AndExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1__2__Impl_in_rule__AndExpr__Group_1__22163);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1061:1: rule__AndExpr__Group_1__2__Impl : ( ( rule__AndExpr__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1065:1: ( ( ( rule__AndExpr__RightAssignment_1_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1066:1: ( ( rule__AndExpr__RightAssignment_1_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1066:1: ( ( rule__AndExpr__RightAssignment_1_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1067:1: ( rule__AndExpr__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndExprAccess().getRightAssignment_1_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1068:1: ( rule__AndExpr__RightAssignment_1_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1068:2: rule__AndExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AndExpr__RightAssignment_1_2_in_rule__AndExpr__Group_1__2__Impl2190);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1084:1: rule__CompEqExpr__Group__0 : rule__CompEqExpr__Group__0__Impl rule__CompEqExpr__Group__1 ;
    public final void rule__CompEqExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1088:1: ( rule__CompEqExpr__Group__0__Impl rule__CompEqExpr__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1089:2: rule__CompEqExpr__Group__0__Impl rule__CompEqExpr__Group__1
            {
            pushFollow(FOLLOW_rule__CompEqExpr__Group__0__Impl_in_rule__CompEqExpr__Group__02226);
            rule__CompEqExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompEqExpr__Group__1_in_rule__CompEqExpr__Group__02229);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1096:1: rule__CompEqExpr__Group__0__Impl : ( ruleCompExpr ) ;
    public final void rule__CompEqExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1100:1: ( ( ruleCompExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1101:1: ( ruleCompExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1101:1: ( ruleCompExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1102:1: ruleCompExpr
            {
             before(grammarAccess.getCompEqExprAccess().getCompExprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleCompExpr_in_rule__CompEqExpr__Group__0__Impl2256);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1113:1: rule__CompEqExpr__Group__1 : rule__CompEqExpr__Group__1__Impl ;
    public final void rule__CompEqExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1117:1: ( rule__CompEqExpr__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1118:2: rule__CompEqExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CompEqExpr__Group__1__Impl_in_rule__CompEqExpr__Group__12285);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1124:1: rule__CompEqExpr__Group__1__Impl : ( ( rule__CompEqExpr__Group_1__0 )* ) ;
    public final void rule__CompEqExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1128:1: ( ( ( rule__CompEqExpr__Group_1__0 )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1129:1: ( ( rule__CompEqExpr__Group_1__0 )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1129:1: ( ( rule__CompEqExpr__Group_1__0 )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1130:1: ( rule__CompEqExpr__Group_1__0 )*
            {
             before(grammarAccess.getCompEqExprAccess().getGroup_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1131:1: ( rule__CompEqExpr__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=11 && LA9_0<=12)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1131:2: rule__CompEqExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CompEqExpr__Group_1__0_in_rule__CompEqExpr__Group__1__Impl2312);
            	    rule__CompEqExpr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1145:1: rule__CompEqExpr__Group_1__0 : rule__CompEqExpr__Group_1__0__Impl rule__CompEqExpr__Group_1__1 ;
    public final void rule__CompEqExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1149:1: ( rule__CompEqExpr__Group_1__0__Impl rule__CompEqExpr__Group_1__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1150:2: rule__CompEqExpr__Group_1__0__Impl rule__CompEqExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__CompEqExpr__Group_1__0__Impl_in_rule__CompEqExpr__Group_1__02347);
            rule__CompEqExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompEqExpr__Group_1__1_in_rule__CompEqExpr__Group_1__02350);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1157:1: rule__CompEqExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__CompEqExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1161:1: ( ( () ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1162:1: ( () )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1162:1: ( () )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1163:1: ()
            {
             before(grammarAccess.getCompEqExprAccess().getCompEqExprLeftAction_1_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1164:1: ()
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1166:1: 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1176:1: rule__CompEqExpr__Group_1__1 : rule__CompEqExpr__Group_1__1__Impl rule__CompEqExpr__Group_1__2 ;
    public final void rule__CompEqExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1180:1: ( rule__CompEqExpr__Group_1__1__Impl rule__CompEqExpr__Group_1__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1181:2: rule__CompEqExpr__Group_1__1__Impl rule__CompEqExpr__Group_1__2
            {
            pushFollow(FOLLOW_rule__CompEqExpr__Group_1__1__Impl_in_rule__CompEqExpr__Group_1__12408);
            rule__CompEqExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompEqExpr__Group_1__2_in_rule__CompEqExpr__Group_1__12411);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1188:1: rule__CompEqExpr__Group_1__1__Impl : ( ( rule__CompEqExpr__OperatorAssignment_1_1 ) ) ;
    public final void rule__CompEqExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1192:1: ( ( ( rule__CompEqExpr__OperatorAssignment_1_1 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1193:1: ( ( rule__CompEqExpr__OperatorAssignment_1_1 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1193:1: ( ( rule__CompEqExpr__OperatorAssignment_1_1 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1194:1: ( rule__CompEqExpr__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getCompEqExprAccess().getOperatorAssignment_1_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1195:1: ( rule__CompEqExpr__OperatorAssignment_1_1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1195:2: rule__CompEqExpr__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CompEqExpr__OperatorAssignment_1_1_in_rule__CompEqExpr__Group_1__1__Impl2438);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1205:1: rule__CompEqExpr__Group_1__2 : rule__CompEqExpr__Group_1__2__Impl ;
    public final void rule__CompEqExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1209:1: ( rule__CompEqExpr__Group_1__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1210:2: rule__CompEqExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__CompEqExpr__Group_1__2__Impl_in_rule__CompEqExpr__Group_1__22468);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1216:1: rule__CompEqExpr__Group_1__2__Impl : ( ( rule__CompEqExpr__RightAssignment_1_2 ) ) ;
    public final void rule__CompEqExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1220:1: ( ( ( rule__CompEqExpr__RightAssignment_1_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1221:1: ( ( rule__CompEqExpr__RightAssignment_1_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1221:1: ( ( rule__CompEqExpr__RightAssignment_1_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1222:1: ( rule__CompEqExpr__RightAssignment_1_2 )
            {
             before(grammarAccess.getCompEqExprAccess().getRightAssignment_1_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1223:1: ( rule__CompEqExpr__RightAssignment_1_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1223:2: rule__CompEqExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__CompEqExpr__RightAssignment_1_2_in_rule__CompEqExpr__Group_1__2__Impl2495);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1239:1: rule__CompExpr__Group__0 : rule__CompExpr__Group__0__Impl rule__CompExpr__Group__1 ;
    public final void rule__CompExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1243:1: ( rule__CompExpr__Group__0__Impl rule__CompExpr__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1244:2: rule__CompExpr__Group__0__Impl rule__CompExpr__Group__1
            {
            pushFollow(FOLLOW_rule__CompExpr__Group__0__Impl_in_rule__CompExpr__Group__02531);
            rule__CompExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompExpr__Group__1_in_rule__CompExpr__Group__02534);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1251:1: rule__CompExpr__Group__0__Impl : ( ruleUnaryExpr ) ;
    public final void rule__CompExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1255:1: ( ( ruleUnaryExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1256:1: ( ruleUnaryExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1256:1: ( ruleUnaryExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1257:1: ruleUnaryExpr
            {
             before(grammarAccess.getCompExprAccess().getUnaryExprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_rule__CompExpr__Group__0__Impl2561);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1268:1: rule__CompExpr__Group__1 : rule__CompExpr__Group__1__Impl ;
    public final void rule__CompExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1272:1: ( rule__CompExpr__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1273:2: rule__CompExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CompExpr__Group__1__Impl_in_rule__CompExpr__Group__12590);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1279:1: rule__CompExpr__Group__1__Impl : ( ( rule__CompExpr__Group_1__0 )* ) ;
    public final void rule__CompExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1283:1: ( ( ( rule__CompExpr__Group_1__0 )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1284:1: ( ( rule__CompExpr__Group_1__0 )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1284:1: ( ( rule__CompExpr__Group_1__0 )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1285:1: ( rule__CompExpr__Group_1__0 )*
            {
             before(grammarAccess.getCompExprAccess().getGroup_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1286:1: ( rule__CompExpr__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=13 && LA10_0<=16)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1286:2: rule__CompExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CompExpr__Group_1__0_in_rule__CompExpr__Group__1__Impl2617);
            	    rule__CompExpr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1300:1: rule__CompExpr__Group_1__0 : rule__CompExpr__Group_1__0__Impl rule__CompExpr__Group_1__1 ;
    public final void rule__CompExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1304:1: ( rule__CompExpr__Group_1__0__Impl rule__CompExpr__Group_1__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1305:2: rule__CompExpr__Group_1__0__Impl rule__CompExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__CompExpr__Group_1__0__Impl_in_rule__CompExpr__Group_1__02652);
            rule__CompExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompExpr__Group_1__1_in_rule__CompExpr__Group_1__02655);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1312:1: rule__CompExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__CompExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1316:1: ( ( () ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1317:1: ( () )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1317:1: ( () )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1318:1: ()
            {
             before(grammarAccess.getCompExprAccess().getCompExprLeftAction_1_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1319:1: ()
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1321:1: 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1331:1: rule__CompExpr__Group_1__1 : rule__CompExpr__Group_1__1__Impl rule__CompExpr__Group_1__2 ;
    public final void rule__CompExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1335:1: ( rule__CompExpr__Group_1__1__Impl rule__CompExpr__Group_1__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1336:2: rule__CompExpr__Group_1__1__Impl rule__CompExpr__Group_1__2
            {
            pushFollow(FOLLOW_rule__CompExpr__Group_1__1__Impl_in_rule__CompExpr__Group_1__12713);
            rule__CompExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompExpr__Group_1__2_in_rule__CompExpr__Group_1__12716);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1343:1: rule__CompExpr__Group_1__1__Impl : ( ( rule__CompExpr__OperatorAssignment_1_1 ) ) ;
    public final void rule__CompExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1347:1: ( ( ( rule__CompExpr__OperatorAssignment_1_1 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1348:1: ( ( rule__CompExpr__OperatorAssignment_1_1 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1348:1: ( ( rule__CompExpr__OperatorAssignment_1_1 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1349:1: ( rule__CompExpr__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getCompExprAccess().getOperatorAssignment_1_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1350:1: ( rule__CompExpr__OperatorAssignment_1_1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1350:2: rule__CompExpr__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CompExpr__OperatorAssignment_1_1_in_rule__CompExpr__Group_1__1__Impl2743);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1360:1: rule__CompExpr__Group_1__2 : rule__CompExpr__Group_1__2__Impl ;
    public final void rule__CompExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1364:1: ( rule__CompExpr__Group_1__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1365:2: rule__CompExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__CompExpr__Group_1__2__Impl_in_rule__CompExpr__Group_1__22773);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1371:1: rule__CompExpr__Group_1__2__Impl : ( ( rule__CompExpr__RightAssignment_1_2 ) ) ;
    public final void rule__CompExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1375:1: ( ( ( rule__CompExpr__RightAssignment_1_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1376:1: ( ( rule__CompExpr__RightAssignment_1_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1376:1: ( ( rule__CompExpr__RightAssignment_1_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1377:1: ( rule__CompExpr__RightAssignment_1_2 )
            {
             before(grammarAccess.getCompExprAccess().getRightAssignment_1_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1378:1: ( rule__CompExpr__RightAssignment_1_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1378:2: rule__CompExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__CompExpr__RightAssignment_1_2_in_rule__CompExpr__Group_1__2__Impl2800);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1394:1: rule__UnaryExpr__Group_1__0 : rule__UnaryExpr__Group_1__0__Impl rule__UnaryExpr__Group_1__1 ;
    public final void rule__UnaryExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1398:1: ( rule__UnaryExpr__Group_1__0__Impl rule__UnaryExpr__Group_1__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1399:2: rule__UnaryExpr__Group_1__0__Impl rule__UnaryExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__UnaryExpr__Group_1__0__Impl_in_rule__UnaryExpr__Group_1__02836);
            rule__UnaryExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnaryExpr__Group_1__1_in_rule__UnaryExpr__Group_1__02839);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1406:1: rule__UnaryExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__UnaryExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1410:1: ( ( () ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1411:1: ( () )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1411:1: ( () )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1412:1: ()
            {
             before(grammarAccess.getUnaryExprAccess().getUnaryExprAction_1_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1413:1: ()
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1415:1: 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1425:1: rule__UnaryExpr__Group_1__1 : rule__UnaryExpr__Group_1__1__Impl rule__UnaryExpr__Group_1__2 ;
    public final void rule__UnaryExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1429:1: ( rule__UnaryExpr__Group_1__1__Impl rule__UnaryExpr__Group_1__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1430:2: rule__UnaryExpr__Group_1__1__Impl rule__UnaryExpr__Group_1__2
            {
            pushFollow(FOLLOW_rule__UnaryExpr__Group_1__1__Impl_in_rule__UnaryExpr__Group_1__12897);
            rule__UnaryExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnaryExpr__Group_1__2_in_rule__UnaryExpr__Group_1__12900);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1437:1: rule__UnaryExpr__Group_1__1__Impl : ( 'not' ) ;
    public final void rule__UnaryExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1441:1: ( ( 'not' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1442:1: ( 'not' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1442:1: ( 'not' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1443:1: 'not'
            {
             before(grammarAccess.getUnaryExprAccess().getNotKeyword_1_1()); 
            match(input,19,FOLLOW_19_in_rule__UnaryExpr__Group_1__1__Impl2928); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1456:1: rule__UnaryExpr__Group_1__2 : rule__UnaryExpr__Group_1__2__Impl ;
    public final void rule__UnaryExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1460:1: ( rule__UnaryExpr__Group_1__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1461:2: rule__UnaryExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__UnaryExpr__Group_1__2__Impl_in_rule__UnaryExpr__Group_1__22959);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1467:1: rule__UnaryExpr__Group_1__2__Impl : ( ( rule__UnaryExpr__ExprAssignment_1_2 ) ) ;
    public final void rule__UnaryExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1471:1: ( ( ( rule__UnaryExpr__ExprAssignment_1_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1472:1: ( ( rule__UnaryExpr__ExprAssignment_1_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1472:1: ( ( rule__UnaryExpr__ExprAssignment_1_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1473:1: ( rule__UnaryExpr__ExprAssignment_1_2 )
            {
             before(grammarAccess.getUnaryExprAccess().getExprAssignment_1_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1474:1: ( rule__UnaryExpr__ExprAssignment_1_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1474:2: rule__UnaryExpr__ExprAssignment_1_2
            {
            pushFollow(FOLLOW_rule__UnaryExpr__ExprAssignment_1_2_in_rule__UnaryExpr__Group_1__2__Impl2986);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1490:1: rule__ParenExpr__Group__0 : rule__ParenExpr__Group__0__Impl rule__ParenExpr__Group__1 ;
    public final void rule__ParenExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1494:1: ( rule__ParenExpr__Group__0__Impl rule__ParenExpr__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1495:2: rule__ParenExpr__Group__0__Impl rule__ParenExpr__Group__1
            {
            pushFollow(FOLLOW_rule__ParenExpr__Group__0__Impl_in_rule__ParenExpr__Group__03022);
            rule__ParenExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParenExpr__Group__1_in_rule__ParenExpr__Group__03025);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1502:1: rule__ParenExpr__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1506:1: ( ( '(' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1507:1: ( '(' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1507:1: ( '(' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1508:1: '('
            {
             before(grammarAccess.getParenExprAccess().getLeftParenthesisKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__ParenExpr__Group__0__Impl3053); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1521:1: rule__ParenExpr__Group__1 : rule__ParenExpr__Group__1__Impl rule__ParenExpr__Group__2 ;
    public final void rule__ParenExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1525:1: ( rule__ParenExpr__Group__1__Impl rule__ParenExpr__Group__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1526:2: rule__ParenExpr__Group__1__Impl rule__ParenExpr__Group__2
            {
            pushFollow(FOLLOW_rule__ParenExpr__Group__1__Impl_in_rule__ParenExpr__Group__13084);
            rule__ParenExpr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParenExpr__Group__2_in_rule__ParenExpr__Group__13087);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1533:1: rule__ParenExpr__Group__1__Impl : ( () ) ;
    public final void rule__ParenExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1537:1: ( ( () ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1538:1: ( () )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1538:1: ( () )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1539:1: ()
            {
             before(grammarAccess.getParenExprAccess().getParenExprAction_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1540:1: ()
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1542:1: 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1552:1: rule__ParenExpr__Group__2 : rule__ParenExpr__Group__2__Impl rule__ParenExpr__Group__3 ;
    public final void rule__ParenExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1556:1: ( rule__ParenExpr__Group__2__Impl rule__ParenExpr__Group__3 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1557:2: rule__ParenExpr__Group__2__Impl rule__ParenExpr__Group__3
            {
            pushFollow(FOLLOW_rule__ParenExpr__Group__2__Impl_in_rule__ParenExpr__Group__23145);
            rule__ParenExpr__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParenExpr__Group__3_in_rule__ParenExpr__Group__23148);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1564:1: rule__ParenExpr__Group__2__Impl : ( ( rule__ParenExpr__ExprAssignment_2 ) ) ;
    public final void rule__ParenExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1568:1: ( ( ( rule__ParenExpr__ExprAssignment_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1569:1: ( ( rule__ParenExpr__ExprAssignment_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1569:1: ( ( rule__ParenExpr__ExprAssignment_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1570:1: ( rule__ParenExpr__ExprAssignment_2 )
            {
             before(grammarAccess.getParenExprAccess().getExprAssignment_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1571:1: ( rule__ParenExpr__ExprAssignment_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1571:2: rule__ParenExpr__ExprAssignment_2
            {
            pushFollow(FOLLOW_rule__ParenExpr__ExprAssignment_2_in_rule__ParenExpr__Group__2__Impl3175);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1581:1: rule__ParenExpr__Group__3 : rule__ParenExpr__Group__3__Impl ;
    public final void rule__ParenExpr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1585:1: ( rule__ParenExpr__Group__3__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1586:2: rule__ParenExpr__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ParenExpr__Group__3__Impl_in_rule__ParenExpr__Group__33205);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1592:1: rule__ParenExpr__Group__3__Impl : ( ')' ) ;
    public final void rule__ParenExpr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1596:1: ( ( ')' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1597:1: ( ')' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1597:1: ( ')' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1598:1: ')'
            {
             before(grammarAccess.getParenExprAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__ParenExpr__Group__3__Impl3233); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1619:1: rule__ProjectReference__Group__0 : rule__ProjectReference__Group__0__Impl rule__ProjectReference__Group__1 ;
    public final void rule__ProjectReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1623:1: ( rule__ProjectReference__Group__0__Impl rule__ProjectReference__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1624:2: rule__ProjectReference__Group__0__Impl rule__ProjectReference__Group__1
            {
            pushFollow(FOLLOW_rule__ProjectReference__Group__0__Impl_in_rule__ProjectReference__Group__03272);
            rule__ProjectReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProjectReference__Group__1_in_rule__ProjectReference__Group__03275);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1631:1: rule__ProjectReference__Group__0__Impl : ( 'project' ) ;
    public final void rule__ProjectReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1635:1: ( ( 'project' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1636:1: ( 'project' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1636:1: ( 'project' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1637:1: 'project'
            {
             before(grammarAccess.getProjectReferenceAccess().getProjectKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__ProjectReference__Group__0__Impl3303); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1650:1: rule__ProjectReference__Group__1 : rule__ProjectReference__Group__1__Impl rule__ProjectReference__Group__2 ;
    public final void rule__ProjectReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1654:1: ( rule__ProjectReference__Group__1__Impl rule__ProjectReference__Group__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1655:2: rule__ProjectReference__Group__1__Impl rule__ProjectReference__Group__2
            {
            pushFollow(FOLLOW_rule__ProjectReference__Group__1__Impl_in_rule__ProjectReference__Group__13334);
            rule__ProjectReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProjectReference__Group__2_in_rule__ProjectReference__Group__13337);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1662:1: rule__ProjectReference__Group__1__Impl : ( ':' ) ;
    public final void rule__ProjectReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1666:1: ( ( ':' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1667:1: ( ':' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1667:1: ( ':' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1668:1: ':'
            {
             before(grammarAccess.getProjectReferenceAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__ProjectReference__Group__1__Impl3365); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1681:1: rule__ProjectReference__Group__2 : rule__ProjectReference__Group__2__Impl ;
    public final void rule__ProjectReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1685:1: ( rule__ProjectReference__Group__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1686:2: rule__ProjectReference__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ProjectReference__Group__2__Impl_in_rule__ProjectReference__Group__23396);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1692:1: rule__ProjectReference__Group__2__Impl : ( ( rule__ProjectReference__ValueAssignment_2 ) ) ;
    public final void rule__ProjectReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1696:1: ( ( ( rule__ProjectReference__ValueAssignment_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1697:1: ( ( rule__ProjectReference__ValueAssignment_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1697:1: ( ( rule__ProjectReference__ValueAssignment_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1698:1: ( rule__ProjectReference__ValueAssignment_2 )
            {
             before(grammarAccess.getProjectReferenceAccess().getValueAssignment_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1699:1: ( rule__ProjectReference__ValueAssignment_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1699:2: rule__ProjectReference__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__ProjectReference__ValueAssignment_2_in_rule__ProjectReference__Group__2__Impl3423);
            rule__ProjectReference__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProjectReferenceAccess().getValueAssignment_2()); 

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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1715:1: rule__TaskReference__Group__0 : rule__TaskReference__Group__0__Impl rule__TaskReference__Group__1 ;
    public final void rule__TaskReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1719:1: ( rule__TaskReference__Group__0__Impl rule__TaskReference__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1720:2: rule__TaskReference__Group__0__Impl rule__TaskReference__Group__1
            {
            pushFollow(FOLLOW_rule__TaskReference__Group__0__Impl_in_rule__TaskReference__Group__03459);
            rule__TaskReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TaskReference__Group__1_in_rule__TaskReference__Group__03462);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1727:1: rule__TaskReference__Group__0__Impl : ( 'task' ) ;
    public final void rule__TaskReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1731:1: ( ( 'task' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1732:1: ( 'task' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1732:1: ( 'task' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1733:1: 'task'
            {
             before(grammarAccess.getTaskReferenceAccess().getTaskKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__TaskReference__Group__0__Impl3490); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1746:1: rule__TaskReference__Group__1 : rule__TaskReference__Group__1__Impl rule__TaskReference__Group__2 ;
    public final void rule__TaskReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1750:1: ( rule__TaskReference__Group__1__Impl rule__TaskReference__Group__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1751:2: rule__TaskReference__Group__1__Impl rule__TaskReference__Group__2
            {
            pushFollow(FOLLOW_rule__TaskReference__Group__1__Impl_in_rule__TaskReference__Group__13521);
            rule__TaskReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TaskReference__Group__2_in_rule__TaskReference__Group__13524);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1758:1: rule__TaskReference__Group__1__Impl : ( ':' ) ;
    public final void rule__TaskReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1762:1: ( ( ':' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1763:1: ( ':' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1763:1: ( ':' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1764:1: ':'
            {
             before(grammarAccess.getTaskReferenceAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__TaskReference__Group__1__Impl3552); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1777:1: rule__TaskReference__Group__2 : rule__TaskReference__Group__2__Impl ;
    public final void rule__TaskReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1781:1: ( rule__TaskReference__Group__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1782:2: rule__TaskReference__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TaskReference__Group__2__Impl_in_rule__TaskReference__Group__23583);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1788:1: rule__TaskReference__Group__2__Impl : ( ( rule__TaskReference__ValueAssignment_2 ) ) ;
    public final void rule__TaskReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1792:1: ( ( ( rule__TaskReference__ValueAssignment_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1793:1: ( ( rule__TaskReference__ValueAssignment_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1793:1: ( ( rule__TaskReference__ValueAssignment_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1794:1: ( rule__TaskReference__ValueAssignment_2 )
            {
             before(grammarAccess.getTaskReferenceAccess().getValueAssignment_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1795:1: ( rule__TaskReference__ValueAssignment_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1795:2: rule__TaskReference__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__TaskReference__ValueAssignment_2_in_rule__TaskReference__Group__2__Impl3610);
            rule__TaskReference__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskReferenceAccess().getValueAssignment_2()); 

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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1811:1: rule__TextReference__Group__0 : rule__TextReference__Group__0__Impl rule__TextReference__Group__1 ;
    public final void rule__TextReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1815:1: ( rule__TextReference__Group__0__Impl rule__TextReference__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1816:2: rule__TextReference__Group__0__Impl rule__TextReference__Group__1
            {
            pushFollow(FOLLOW_rule__TextReference__Group__0__Impl_in_rule__TextReference__Group__03646);
            rule__TextReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextReference__Group__1_in_rule__TextReference__Group__03649);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1823:1: rule__TextReference__Group__0__Impl : ( 'text' ) ;
    public final void rule__TextReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1827:1: ( ( 'text' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1828:1: ( 'text' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1828:1: ( 'text' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1829:1: 'text'
            {
             before(grammarAccess.getTextReferenceAccess().getTextKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__TextReference__Group__0__Impl3677); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1842:1: rule__TextReference__Group__1 : rule__TextReference__Group__1__Impl rule__TextReference__Group__2 ;
    public final void rule__TextReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1846:1: ( rule__TextReference__Group__1__Impl rule__TextReference__Group__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1847:2: rule__TextReference__Group__1__Impl rule__TextReference__Group__2
            {
            pushFollow(FOLLOW_rule__TextReference__Group__1__Impl_in_rule__TextReference__Group__13708);
            rule__TextReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextReference__Group__2_in_rule__TextReference__Group__13711);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1854:1: rule__TextReference__Group__1__Impl : ( ':' ) ;
    public final void rule__TextReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1858:1: ( ( ':' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1859:1: ( ':' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1859:1: ( ':' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1860:1: ':'
            {
             before(grammarAccess.getTextReferenceAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__TextReference__Group__1__Impl3739); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1873:1: rule__TextReference__Group__2 : rule__TextReference__Group__2__Impl ;
    public final void rule__TextReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1877:1: ( rule__TextReference__Group__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1878:2: rule__TextReference__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TextReference__Group__2__Impl_in_rule__TextReference__Group__23770);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1884:1: rule__TextReference__Group__2__Impl : ( ( rule__TextReference__ValueAssignment_2 ) ) ;
    public final void rule__TextReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1888:1: ( ( ( rule__TextReference__ValueAssignment_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1889:1: ( ( rule__TextReference__ValueAssignment_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1889:1: ( ( rule__TextReference__ValueAssignment_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1890:1: ( rule__TextReference__ValueAssignment_2 )
            {
             before(grammarAccess.getTextReferenceAccess().getValueAssignment_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1891:1: ( rule__TextReference__ValueAssignment_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1891:2: rule__TextReference__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__TextReference__ValueAssignment_2_in_rule__TextReference__Group__2__Impl3797);
            rule__TextReference__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTextReferenceAccess().getValueAssignment_2()); 

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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1907:1: rule__Words__Group__0 : rule__Words__Group__0__Impl rule__Words__Group__1 ;
    public final void rule__Words__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1911:1: ( rule__Words__Group__0__Impl rule__Words__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1912:2: rule__Words__Group__0__Impl rule__Words__Group__1
            {
            pushFollow(FOLLOW_rule__Words__Group__0__Impl_in_rule__Words__Group__03833);
            rule__Words__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Words__Group__1_in_rule__Words__Group__03836);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1919:1: rule__Words__Group__0__Impl : ( ( rule__Words__ValuesAssignment_0 ) ) ;
    public final void rule__Words__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1923:1: ( ( ( rule__Words__ValuesAssignment_0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1924:1: ( ( rule__Words__ValuesAssignment_0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1924:1: ( ( rule__Words__ValuesAssignment_0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1925:1: ( rule__Words__ValuesAssignment_0 )
            {
             before(grammarAccess.getWordsAccess().getValuesAssignment_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1926:1: ( rule__Words__ValuesAssignment_0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1926:2: rule__Words__ValuesAssignment_0
            {
            pushFollow(FOLLOW_rule__Words__ValuesAssignment_0_in_rule__Words__Group__0__Impl3863);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1936:1: rule__Words__Group__1 : rule__Words__Group__1__Impl ;
    public final void rule__Words__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1940:1: ( rule__Words__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1941:2: rule__Words__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Words__Group__1__Impl_in_rule__Words__Group__13893);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1947:1: rule__Words__Group__1__Impl : ( ( ( rule__Words__ValuesAssignment_1 ) ) ( ( rule__Words__ValuesAssignment_1 )* ) ) ;
    public final void rule__Words__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1951:1: ( ( ( ( rule__Words__ValuesAssignment_1 ) ) ( ( rule__Words__ValuesAssignment_1 )* ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1952:1: ( ( ( rule__Words__ValuesAssignment_1 ) ) ( ( rule__Words__ValuesAssignment_1 )* ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1952:1: ( ( ( rule__Words__ValuesAssignment_1 ) ) ( ( rule__Words__ValuesAssignment_1 )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1953:1: ( ( rule__Words__ValuesAssignment_1 ) ) ( ( rule__Words__ValuesAssignment_1 )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1953:1: ( ( rule__Words__ValuesAssignment_1 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1954:1: ( rule__Words__ValuesAssignment_1 )
            {
             before(grammarAccess.getWordsAccess().getValuesAssignment_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1955:1: ( rule__Words__ValuesAssignment_1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1955:2: rule__Words__ValuesAssignment_1
            {
            pushFollow(FOLLOW_rule__Words__ValuesAssignment_1_in_rule__Words__Group__1__Impl3922);
            rule__Words__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWordsAccess().getValuesAssignment_1()); 

            }

            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1958:1: ( ( rule__Words__ValuesAssignment_1 )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1959:1: ( rule__Words__ValuesAssignment_1 )*
            {
             before(grammarAccess.getWordsAccess().getValuesAssignment_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1960:1: ( rule__Words__ValuesAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1960:2: rule__Words__ValuesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Words__ValuesAssignment_1_in_rule__Words__Group__1__Impl3934);
            	    rule__Words__ValuesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1975:1: rule__TagReference__Group__0 : rule__TagReference__Group__0__Impl rule__TagReference__Group__1 ;
    public final void rule__TagReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1979:1: ( rule__TagReference__Group__0__Impl rule__TagReference__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1980:2: rule__TagReference__Group__0__Impl rule__TagReference__Group__1
            {
            pushFollow(FOLLOW_rule__TagReference__Group__0__Impl_in_rule__TagReference__Group__03971);
            rule__TagReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TagReference__Group__1_in_rule__TagReference__Group__03974);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1987:1: rule__TagReference__Group__0__Impl : ( '@' ) ;
    public final void rule__TagReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1991:1: ( ( '@' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1992:1: ( '@' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1992:1: ( '@' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1993:1: '@'
            {
             before(grammarAccess.getTagReferenceAccess().getCommercialAtKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__TagReference__Group__0__Impl4002); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2006:1: rule__TagReference__Group__1 : rule__TagReference__Group__1__Impl ;
    public final void rule__TagReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2010:1: ( rule__TagReference__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2011:2: rule__TagReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TagReference__Group__1__Impl_in_rule__TagReference__Group__14033);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2017:1: rule__TagReference__Group__1__Impl : ( ( rule__TagReference__ValueAssignment_1 ) ) ;
    public final void rule__TagReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2021:1: ( ( ( rule__TagReference__ValueAssignment_1 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2022:1: ( ( rule__TagReference__ValueAssignment_1 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2022:1: ( ( rule__TagReference__ValueAssignment_1 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2023:1: ( rule__TagReference__ValueAssignment_1 )
            {
             before(grammarAccess.getTagReferenceAccess().getValueAssignment_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2024:1: ( rule__TagReference__ValueAssignment_1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2024:2: rule__TagReference__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__TagReference__ValueAssignment_1_in_rule__TagReference__Group__1__Impl4060);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2039:1: rule__Query__ExpressionAssignment_1 : ( ruleOrExpr ) ;
    public final void rule__Query__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2043:1: ( ( ruleOrExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2044:1: ( ruleOrExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2044:1: ( ruleOrExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2045:1: ruleOrExpr
            {
             before(grammarAccess.getQueryAccess().getExpressionOrExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleOrExpr_in_rule__Query__ExpressionAssignment_14099);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2054:1: rule__OrExpr__RightAssignment_1_2 : ( ruleAndExpr ) ;
    public final void rule__OrExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2058:1: ( ( ruleAndExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2059:1: ( ruleAndExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2059:1: ( ruleAndExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2060:1: ruleAndExpr
            {
             before(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAndExpr_in_rule__OrExpr__RightAssignment_1_24130);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2069:1: rule__AndExpr__RightAssignment_1_2 : ( ruleCompEqExpr ) ;
    public final void rule__AndExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2073:1: ( ( ruleCompEqExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2074:1: ( ruleCompEqExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2074:1: ( ruleCompEqExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2075:1: ruleCompEqExpr
            {
             before(grammarAccess.getAndExprAccess().getRightCompEqExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleCompEqExpr_in_rule__AndExpr__RightAssignment_1_24161);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2084:1: rule__CompEqExpr__OperatorAssignment_1_1 : ( ruleCompEqOperator ) ;
    public final void rule__CompEqExpr__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2088:1: ( ( ruleCompEqOperator ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2089:1: ( ruleCompEqOperator )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2089:1: ( ruleCompEqOperator )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2090:1: ruleCompEqOperator
            {
             before(grammarAccess.getCompEqExprAccess().getOperatorCompEqOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleCompEqOperator_in_rule__CompEqExpr__OperatorAssignment_1_14192);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2099:1: rule__CompEqExpr__RightAssignment_1_2 : ( ruleCompExpr ) ;
    public final void rule__CompEqExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2103:1: ( ( ruleCompExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2104:1: ( ruleCompExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2104:1: ( ruleCompExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2105:1: ruleCompExpr
            {
             before(grammarAccess.getCompEqExprAccess().getRightCompExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleCompExpr_in_rule__CompEqExpr__RightAssignment_1_24223);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2114:1: rule__CompExpr__OperatorAssignment_1_1 : ( ruleCompOperator ) ;
    public final void rule__CompExpr__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2118:1: ( ( ruleCompOperator ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2119:1: ( ruleCompOperator )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2119:1: ( ruleCompOperator )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2120:1: ruleCompOperator
            {
             before(grammarAccess.getCompExprAccess().getOperatorCompOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleCompOperator_in_rule__CompExpr__OperatorAssignment_1_14254);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2129:1: rule__CompExpr__RightAssignment_1_2 : ( ruleUnaryExpr ) ;
    public final void rule__CompExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2133:1: ( ( ruleUnaryExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2134:1: ( ruleUnaryExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2134:1: ( ruleUnaryExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2135:1: ruleUnaryExpr
            {
             before(grammarAccess.getCompExprAccess().getRightUnaryExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_rule__CompExpr__RightAssignment_1_24285);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2144:1: rule__UnaryExpr__ExprAssignment_1_2 : ( ruleUnaryExpr ) ;
    public final void rule__UnaryExpr__ExprAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2148:1: ( ( ruleUnaryExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2149:1: ( ruleUnaryExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2149:1: ( ruleUnaryExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2150:1: ruleUnaryExpr
            {
             before(grammarAccess.getUnaryExprAccess().getExprUnaryExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_rule__UnaryExpr__ExprAssignment_1_24316);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2159:1: rule__ParenExpr__ExprAssignment_2 : ( ruleOrExpr ) ;
    public final void rule__ParenExpr__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2163:1: ( ( ruleOrExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2164:1: ( ruleOrExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2164:1: ( ruleOrExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2165:1: ruleOrExpr
            {
             before(grammarAccess.getParenExprAccess().getExprOrExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleOrExpr_in_rule__ParenExpr__ExprAssignment_24347);
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


    // $ANTLR start "rule__ProjectReference__ValueAssignment_2"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2174:1: rule__ProjectReference__ValueAssignment_2 : ( RULE_ID ) ;
    public final void rule__ProjectReference__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2178:1: ( ( RULE_ID ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2179:1: ( RULE_ID )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2179:1: ( RULE_ID )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2180:1: RULE_ID
            {
             before(grammarAccess.getProjectReferenceAccess().getValueIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProjectReference__ValueAssignment_24378); 
             after(grammarAccess.getProjectReferenceAccess().getValueIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ProjectReference__ValueAssignment_2"


    // $ANTLR start "rule__TaskReference__ValueAssignment_2"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2189:1: rule__TaskReference__ValueAssignment_2 : ( RULE_ID ) ;
    public final void rule__TaskReference__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2193:1: ( ( RULE_ID ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2194:1: ( RULE_ID )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2194:1: ( RULE_ID )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2195:1: RULE_ID
            {
             before(grammarAccess.getTaskReferenceAccess().getValueIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TaskReference__ValueAssignment_24409); 
             after(grammarAccess.getTaskReferenceAccess().getValueIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__TaskReference__ValueAssignment_2"


    // $ANTLR start "rule__TextReference__ValueAssignment_2"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2204:1: rule__TextReference__ValueAssignment_2 : ( RULE_ID ) ;
    public final void rule__TextReference__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2208:1: ( ( RULE_ID ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2209:1: ( RULE_ID )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2209:1: ( RULE_ID )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2210:1: RULE_ID
            {
             before(grammarAccess.getTextReferenceAccess().getValueIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TextReference__ValueAssignment_24440); 
             after(grammarAccess.getTextReferenceAccess().getValueIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__TextReference__ValueAssignment_2"


    // $ANTLR start "rule__Words__ValuesAssignment_0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2219:1: rule__Words__ValuesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Words__ValuesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2223:1: ( ( RULE_ID ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2224:1: ( RULE_ID )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2224:1: ( RULE_ID )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2225:1: RULE_ID
            {
             before(grammarAccess.getWordsAccess().getValuesIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Words__ValuesAssignment_04471); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2234:1: rule__Words__ValuesAssignment_1 : ( RULE_ID ) ;
    public final void rule__Words__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2238:1: ( ( RULE_ID ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2239:1: ( RULE_ID )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2239:1: ( RULE_ID )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2240:1: RULE_ID
            {
             before(grammarAccess.getWordsAccess().getValuesIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Words__ValuesAssignment_14502); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2249:1: rule__Word__ValueAssignment : ( RULE_ID ) ;
    public final void rule__Word__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2253:1: ( ( RULE_ID ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2254:1: ( RULE_ID )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2254:1: ( RULE_ID )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2255:1: RULE_ID
            {
             before(grammarAccess.getWordAccess().getValueIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Word__ValueAssignment4533); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2264:1: rule__Phrase__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__Phrase__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2268:1: ( ( RULE_STRING ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2269:1: ( RULE_STRING )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2269:1: ( RULE_STRING )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2270:1: RULE_STRING
            {
             before(grammarAccess.getPhraseAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Phrase__ValueAssignment4564); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2279:1: rule__TagReference__ValueAssignment_1 : ( RULE_ID ) ;
    public final void rule__TagReference__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2283:1: ( ( RULE_ID ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2284:1: ( RULE_ID )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2284:1: ( RULE_ID )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2285:1: RULE_ID
            {
             before(grammarAccess.getTagReferenceAccess().getValueIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TagReference__ValueAssignment_14595); 
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
    public static final BitSet FOLLOW_11_in_rule__CompEqOperator__Alternatives1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CompEqOperator__Alternatives1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CompOperator__Alternatives1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CompOperator__Alternatives1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CompOperator__Alternatives1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CompOperator__Alternatives1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__01489 = new BitSet(new long[]{0x0000000007580030L});
    public static final BitSet FOLLOW_rule__Query__Group__1_in_rule__Query__Group__01492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__11550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ExpressionAssignment_1_in_rule__Query__Group__1__Impl1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group__0__Impl_in_rule__OrExpr__Group__01612 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__OrExpr__Group__1_in_rule__OrExpr__Group__01615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_rule__OrExpr__Group__0__Impl1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group__1__Impl_in_rule__OrExpr__Group__11671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__0_in_rule__OrExpr__Group__1__Impl1698 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__0__Impl_in_rule__OrExpr__Group_1__01733 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__1_in_rule__OrExpr__Group_1__01736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__1__Impl_in_rule__OrExpr__Group_1__11794 = new BitSet(new long[]{0x0000000007580030L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__2_in_rule__OrExpr__Group_1__11797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__OrExpr__Group_1__1__Impl1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__2__Impl_in_rule__OrExpr__Group_1__21856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__RightAssignment_1_2_in_rule__OrExpr__Group_1__2__Impl1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__0__Impl_in_rule__AndExpr__Group__01919 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__1_in_rule__AndExpr__Group__01922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompEqExpr_in_rule__AndExpr__Group__0__Impl1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__1__Impl_in_rule__AndExpr__Group__11978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__0_in_rule__AndExpr__Group__1__Impl2005 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__0__Impl_in_rule__AndExpr__Group_1__02040 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__1_in_rule__AndExpr__Group_1__02043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__1__Impl_in_rule__AndExpr__Group_1__12101 = new BitSet(new long[]{0x0000000007580030L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__2_in_rule__AndExpr__Group_1__12104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AndExpr__Group_1__1__Impl2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__2__Impl_in_rule__AndExpr__Group_1__22163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__RightAssignment_1_2_in_rule__AndExpr__Group_1__2__Impl2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group__0__Impl_in_rule__CompEqExpr__Group__02226 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group__1_in_rule__CompEqExpr__Group__02229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompExpr_in_rule__CompEqExpr__Group__0__Impl2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group__1__Impl_in_rule__CompEqExpr__Group__12285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group_1__0_in_rule__CompEqExpr__Group__1__Impl2312 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group_1__0__Impl_in_rule__CompEqExpr__Group_1__02347 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group_1__1_in_rule__CompEqExpr__Group_1__02350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group_1__1__Impl_in_rule__CompEqExpr__Group_1__12408 = new BitSet(new long[]{0x0000000007580030L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group_1__2_in_rule__CompEqExpr__Group_1__12411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompEqExpr__OperatorAssignment_1_1_in_rule__CompEqExpr__Group_1__1__Impl2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group_1__2__Impl_in_rule__CompEqExpr__Group_1__22468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompEqExpr__RightAssignment_1_2_in_rule__CompEqExpr__Group_1__2__Impl2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompExpr__Group__0__Impl_in_rule__CompExpr__Group__02531 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_rule__CompExpr__Group__1_in_rule__CompExpr__Group__02534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rule__CompExpr__Group__0__Impl2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompExpr__Group__1__Impl_in_rule__CompExpr__Group__12590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompExpr__Group_1__0_in_rule__CompExpr__Group__1__Impl2617 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_rule__CompExpr__Group_1__0__Impl_in_rule__CompExpr__Group_1__02652 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_rule__CompExpr__Group_1__1_in_rule__CompExpr__Group_1__02655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompExpr__Group_1__1__Impl_in_rule__CompExpr__Group_1__12713 = new BitSet(new long[]{0x0000000007580030L});
    public static final BitSet FOLLOW_rule__CompExpr__Group_1__2_in_rule__CompExpr__Group_1__12716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompExpr__OperatorAssignment_1_1_in_rule__CompExpr__Group_1__1__Impl2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompExpr__Group_1__2__Impl_in_rule__CompExpr__Group_1__22773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompExpr__RightAssignment_1_2_in_rule__CompExpr__Group_1__2__Impl2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group_1__0__Impl_in_rule__UnaryExpr__Group_1__02836 = new BitSet(new long[]{0x0000000007580030L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group_1__1_in_rule__UnaryExpr__Group_1__02839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group_1__1__Impl_in_rule__UnaryExpr__Group_1__12897 = new BitSet(new long[]{0x0000000007580030L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group_1__2_in_rule__UnaryExpr__Group_1__12900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__UnaryExpr__Group_1__1__Impl2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group_1__2__Impl_in_rule__UnaryExpr__Group_1__22959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__ExprAssignment_1_2_in_rule__UnaryExpr__Group_1__2__Impl2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenExpr__Group__0__Impl_in_rule__ParenExpr__Group__03022 = new BitSet(new long[]{0x0000000007580030L});
    public static final BitSet FOLLOW_rule__ParenExpr__Group__1_in_rule__ParenExpr__Group__03025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ParenExpr__Group__0__Impl3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenExpr__Group__1__Impl_in_rule__ParenExpr__Group__13084 = new BitSet(new long[]{0x0000000007580030L});
    public static final BitSet FOLLOW_rule__ParenExpr__Group__2_in_rule__ParenExpr__Group__13087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenExpr__Group__2__Impl_in_rule__ParenExpr__Group__23145 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ParenExpr__Group__3_in_rule__ParenExpr__Group__23148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenExpr__ExprAssignment_2_in_rule__ParenExpr__Group__2__Impl3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenExpr__Group__3__Impl_in_rule__ParenExpr__Group__33205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ParenExpr__Group__3__Impl3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectReference__Group__0__Impl_in_rule__ProjectReference__Group__03272 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ProjectReference__Group__1_in_rule__ProjectReference__Group__03275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ProjectReference__Group__0__Impl3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectReference__Group__1__Impl_in_rule__ProjectReference__Group__13334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProjectReference__Group__2_in_rule__ProjectReference__Group__13337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ProjectReference__Group__1__Impl3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectReference__Group__2__Impl_in_rule__ProjectReference__Group__23396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectReference__ValueAssignment_2_in_rule__ProjectReference__Group__2__Impl3423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskReference__Group__0__Impl_in_rule__TaskReference__Group__03459 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__TaskReference__Group__1_in_rule__TaskReference__Group__03462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TaskReference__Group__0__Impl3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskReference__Group__1__Impl_in_rule__TaskReference__Group__13521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TaskReference__Group__2_in_rule__TaskReference__Group__13524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TaskReference__Group__1__Impl3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskReference__Group__2__Impl_in_rule__TaskReference__Group__23583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskReference__ValueAssignment_2_in_rule__TaskReference__Group__2__Impl3610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextReference__Group__0__Impl_in_rule__TextReference__Group__03646 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__TextReference__Group__1_in_rule__TextReference__Group__03649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TextReference__Group__0__Impl3677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextReference__Group__1__Impl_in_rule__TextReference__Group__13708 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TextReference__Group__2_in_rule__TextReference__Group__13711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TextReference__Group__1__Impl3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextReference__Group__2__Impl_in_rule__TextReference__Group__23770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextReference__ValueAssignment_2_in_rule__TextReference__Group__2__Impl3797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Words__Group__0__Impl_in_rule__Words__Group__03833 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Words__Group__1_in_rule__Words__Group__03836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Words__ValuesAssignment_0_in_rule__Words__Group__0__Impl3863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Words__Group__1__Impl_in_rule__Words__Group__13893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Words__ValuesAssignment_1_in_rule__Words__Group__1__Impl3922 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Words__ValuesAssignment_1_in_rule__Words__Group__1__Impl3934 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__TagReference__Group__0__Impl_in_rule__TagReference__Group__03971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TagReference__Group__1_in_rule__TagReference__Group__03974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TagReference__Group__0__Impl4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagReference__Group__1__Impl_in_rule__TagReference__Group__14033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagReference__ValueAssignment_1_in_rule__TagReference__Group__1__Impl4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_rule__Query__ExpressionAssignment_14099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_rule__OrExpr__RightAssignment_1_24130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompEqExpr_in_rule__AndExpr__RightAssignment_1_24161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompEqOperator_in_rule__CompEqExpr__OperatorAssignment_1_14192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompExpr_in_rule__CompEqExpr__RightAssignment_1_24223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompOperator_in_rule__CompExpr__OperatorAssignment_1_14254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rule__CompExpr__RightAssignment_1_24285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rule__UnaryExpr__ExprAssignment_1_24316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_rule__ParenExpr__ExprAssignment_24347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProjectReference__ValueAssignment_24378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TaskReference__ValueAssignment_24409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TextReference__ValueAssignment_24440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Words__ValuesAssignment_04471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Words__ValuesAssignment_14502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Word__ValueAssignment4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Phrase__ValueAssignment4564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TagReference__ValueAssignment_14595 = new BitSet(new long[]{0x0000000000000002L});

}