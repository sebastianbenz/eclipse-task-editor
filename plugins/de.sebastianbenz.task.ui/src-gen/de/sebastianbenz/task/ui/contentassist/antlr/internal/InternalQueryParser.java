package de.sebastianbenz.task.ui.contentassist.antlr.internal; 

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
import de.sebastianbenz.task.services.QueryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQueryParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_WS", "RULE_ANY_OTHER", "'or'", "'||'", "'and'", "'&&'", "'not'", "'!'", "'='", "'!='", "'<='", "'<'", "'>='", "'>'", "'('", "')'", "'project'", "':'", "'task'", "'text'", "'@'"
    };
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=7;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__8=8;
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
    public static final int T__10=10;
    public static final int RULE_WS=6;

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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:60:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:61:1: ( ruleQuery EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:62:1: ruleQuery EOF
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:69:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:73:2: ( ( ( rule__Query__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:74:1: ( ( rule__Query__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:74:1: ( ( rule__Query__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:75:1: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:76:1: ( rule__Query__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:76:2: rule__Query__Group__0
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:88:1: entryRuleOrExpr : ruleOrExpr EOF ;
    public final void entryRuleOrExpr() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:89:1: ( ruleOrExpr EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:90:1: ruleOrExpr EOF
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:97:1: ruleOrExpr : ( ( rule__OrExpr__Group__0 ) ) ;
    public final void ruleOrExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:101:2: ( ( ( rule__OrExpr__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:102:1: ( ( rule__OrExpr__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:102:1: ( ( rule__OrExpr__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:103:1: ( rule__OrExpr__Group__0 )
            {
             before(grammarAccess.getOrExprAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:104:1: ( rule__OrExpr__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:104:2: rule__OrExpr__Group__0
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:116:1: entryRuleAndExpr : ruleAndExpr EOF ;
    public final void entryRuleAndExpr() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:117:1: ( ruleAndExpr EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:118:1: ruleAndExpr EOF
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:125:1: ruleAndExpr : ( ( rule__AndExpr__Group__0 ) ) ;
    public final void ruleAndExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:129:2: ( ( ( rule__AndExpr__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:130:1: ( ( rule__AndExpr__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:130:1: ( ( rule__AndExpr__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:131:1: ( rule__AndExpr__Group__0 )
            {
             before(grammarAccess.getAndExprAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:132:1: ( rule__AndExpr__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:132:2: rule__AndExpr__Group__0
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:144:1: entryRuleCompEqExpr : ruleCompEqExpr EOF ;
    public final void entryRuleCompEqExpr() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:145:1: ( ruleCompEqExpr EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:146:1: ruleCompEqExpr EOF
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:153:1: ruleCompEqExpr : ( ( rule__CompEqExpr__Group__0 ) ) ;
    public final void ruleCompEqExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:157:2: ( ( ( rule__CompEqExpr__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:158:1: ( ( rule__CompEqExpr__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:158:1: ( ( rule__CompEqExpr__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:159:1: ( rule__CompEqExpr__Group__0 )
            {
             before(grammarAccess.getCompEqExprAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:160:1: ( rule__CompEqExpr__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:160:2: rule__CompEqExpr__Group__0
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:172:1: entryRuleCompExpr : ruleCompExpr EOF ;
    public final void entryRuleCompExpr() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:173:1: ( ruleCompExpr EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:174:1: ruleCompExpr EOF
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:181:1: ruleCompExpr : ( ( rule__CompExpr__Group__0 ) ) ;
    public final void ruleCompExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:185:2: ( ( ( rule__CompExpr__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:186:1: ( ( rule__CompExpr__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:186:1: ( ( rule__CompExpr__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:187:1: ( rule__CompExpr__Group__0 )
            {
             before(grammarAccess.getCompExprAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:188:1: ( rule__CompExpr__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:188:2: rule__CompExpr__Group__0
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:200:1: entryRuleUnaryExpr : ruleUnaryExpr EOF ;
    public final void entryRuleUnaryExpr() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:201:1: ( ruleUnaryExpr EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:202:1: ruleUnaryExpr EOF
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:209:1: ruleUnaryExpr : ( ( rule__UnaryExpr__Alternatives ) ) ;
    public final void ruleUnaryExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:213:2: ( ( ( rule__UnaryExpr__Alternatives ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:214:1: ( ( rule__UnaryExpr__Alternatives ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:214:1: ( ( rule__UnaryExpr__Alternatives ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:215:1: ( rule__UnaryExpr__Alternatives )
            {
             before(grammarAccess.getUnaryExprAccess().getAlternatives()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:216:1: ( rule__UnaryExpr__Alternatives )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:216:2: rule__UnaryExpr__Alternatives
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:228:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:229:1: ( ruleAtom EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:230:1: ruleAtom EOF
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:237:1: ruleAtom : ( ( rule__Atom__Alternatives ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:241:2: ( ( ( rule__Atom__Alternatives ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:242:1: ( ( rule__Atom__Alternatives ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:242:1: ( ( rule__Atom__Alternatives ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:243:1: ( rule__Atom__Alternatives )
            {
             before(grammarAccess.getAtomAccess().getAlternatives()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:244:1: ( rule__Atom__Alternatives )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:244:2: rule__Atom__Alternatives
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:256:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:257:1: ( ruleValue EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:258:1: ruleValue EOF
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:265:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:269:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:270:1: ( ( rule__Value__Alternatives ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:270:1: ( ( rule__Value__Alternatives ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:271:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:272:1: ( rule__Value__Alternatives )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:272:2: rule__Value__Alternatives
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:284:1: entryRuleParenExpr : ruleParenExpr EOF ;
    public final void entryRuleParenExpr() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:285:1: ( ruleParenExpr EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:286:1: ruleParenExpr EOF
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:293:1: ruleParenExpr : ( ( rule__ParenExpr__Group__0 ) ) ;
    public final void ruleParenExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:297:2: ( ( ( rule__ParenExpr__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:298:1: ( ( rule__ParenExpr__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:298:1: ( ( rule__ParenExpr__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:299:1: ( rule__ParenExpr__Group__0 )
            {
             before(grammarAccess.getParenExprAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:300:1: ( rule__ParenExpr__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:300:2: rule__ParenExpr__Group__0
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:312:1: entryRuleProjectReference : ruleProjectReference EOF ;
    public final void entryRuleProjectReference() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:313:1: ( ruleProjectReference EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:314:1: ruleProjectReference EOF
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:321:1: ruleProjectReference : ( ( rule__ProjectReference__Group__0 ) ) ;
    public final void ruleProjectReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:325:2: ( ( ( rule__ProjectReference__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:326:1: ( ( rule__ProjectReference__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:326:1: ( ( rule__ProjectReference__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:327:1: ( rule__ProjectReference__Group__0 )
            {
             before(grammarAccess.getProjectReferenceAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:328:1: ( rule__ProjectReference__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:328:2: rule__ProjectReference__Group__0
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:340:1: entryRuleTaskReference : ruleTaskReference EOF ;
    public final void entryRuleTaskReference() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:341:1: ( ruleTaskReference EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:342:1: ruleTaskReference EOF
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:349:1: ruleTaskReference : ( ( rule__TaskReference__Group__0 ) ) ;
    public final void ruleTaskReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:353:2: ( ( ( rule__TaskReference__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:354:1: ( ( rule__TaskReference__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:354:1: ( ( rule__TaskReference__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:355:1: ( rule__TaskReference__Group__0 )
            {
             before(grammarAccess.getTaskReferenceAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:356:1: ( rule__TaskReference__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:356:2: rule__TaskReference__Group__0
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:368:1: entryRuleTextReference : ruleTextReference EOF ;
    public final void entryRuleTextReference() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:369:1: ( ruleTextReference EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:370:1: ruleTextReference EOF
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:377:1: ruleTextReference : ( ( rule__TextReference__Group__0 ) ) ;
    public final void ruleTextReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:381:2: ( ( ( rule__TextReference__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:382:1: ( ( rule__TextReference__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:382:1: ( ( rule__TextReference__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:383:1: ( rule__TextReference__Group__0 )
            {
             before(grammarAccess.getTextReferenceAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:384:1: ( rule__TextReference__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:384:2: rule__TextReference__Group__0
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:396:1: entryRuleWords : ruleWords EOF ;
    public final void entryRuleWords() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:397:1: ( ruleWords EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:398:1: ruleWords EOF
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:405:1: ruleWords : ( ( rule__Words__Group__0 ) ) ;
    public final void ruleWords() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:409:2: ( ( ( rule__Words__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:410:1: ( ( rule__Words__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:410:1: ( ( rule__Words__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:411:1: ( rule__Words__Group__0 )
            {
             before(grammarAccess.getWordsAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:412:1: ( rule__Words__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:412:2: rule__Words__Group__0
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:424:1: entryRuleWord : ruleWord EOF ;
    public final void entryRuleWord() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:425:1: ( ruleWord EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:426:1: ruleWord EOF
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:433:1: ruleWord : ( ( rule__Word__ValueAssignment ) ) ;
    public final void ruleWord() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:437:2: ( ( ( rule__Word__ValueAssignment ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:438:1: ( ( rule__Word__ValueAssignment ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:438:1: ( ( rule__Word__ValueAssignment ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:439:1: ( rule__Word__ValueAssignment )
            {
             before(grammarAccess.getWordAccess().getValueAssignment()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:440:1: ( rule__Word__ValueAssignment )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:440:2: rule__Word__ValueAssignment
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:452:1: entryRulePhrase : rulePhrase EOF ;
    public final void entryRulePhrase() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:453:1: ( rulePhrase EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:454:1: rulePhrase EOF
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:461:1: rulePhrase : ( ( rule__Phrase__ValueAssignment ) ) ;
    public final void rulePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:465:2: ( ( ( rule__Phrase__ValueAssignment ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:466:1: ( ( rule__Phrase__ValueAssignment ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:466:1: ( ( rule__Phrase__ValueAssignment ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:467:1: ( rule__Phrase__ValueAssignment )
            {
             before(grammarAccess.getPhraseAccess().getValueAssignment()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:468:1: ( rule__Phrase__ValueAssignment )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:468:2: rule__Phrase__ValueAssignment
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:480:1: entryRuleTagReference : ruleTagReference EOF ;
    public final void entryRuleTagReference() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:481:1: ( ruleTagReference EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:482:1: ruleTagReference EOF
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:489:1: ruleTagReference : ( ( rule__TagReference__Group__0 ) ) ;
    public final void ruleTagReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:493:2: ( ( ( rule__TagReference__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:494:1: ( ( rule__TagReference__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:494:1: ( ( rule__TagReference__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:495:1: ( rule__TagReference__Group__0 )
            {
             before(grammarAccess.getTagReferenceAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:496:1: ( rule__TagReference__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:496:2: rule__TagReference__Group__0
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:509:1: ruleCompEqOperator : ( ( rule__CompEqOperator__Alternatives ) ) ;
    public final void ruleCompEqOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:513:1: ( ( ( rule__CompEqOperator__Alternatives ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:514:1: ( ( rule__CompEqOperator__Alternatives ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:514:1: ( ( rule__CompEqOperator__Alternatives ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:515:1: ( rule__CompEqOperator__Alternatives )
            {
             before(grammarAccess.getCompEqOperatorAccess().getAlternatives()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:516:1: ( rule__CompEqOperator__Alternatives )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:516:2: rule__CompEqOperator__Alternatives
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:528:1: ruleCompOperator : ( ( rule__CompOperator__Alternatives ) ) ;
    public final void ruleCompOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:532:1: ( ( ( rule__CompOperator__Alternatives ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:533:1: ( ( rule__CompOperator__Alternatives ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:533:1: ( ( rule__CompOperator__Alternatives ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:534:1: ( rule__CompOperator__Alternatives )
            {
             before(grammarAccess.getCompOperatorAccess().getAlternatives()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:535:1: ( rule__CompOperator__Alternatives )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:535:2: rule__CompOperator__Alternatives
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


    // $ANTLR start "rule__OrExpr__Alternatives_1_1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:546:1: rule__OrExpr__Alternatives_1_1 : ( ( 'or' ) | ( '||' ) );
    public final void rule__OrExpr__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:550:1: ( ( 'or' ) | ( '||' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==8) ) {
                alt1=1;
            }
            else if ( (LA1_0==9) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:551:1: ( 'or' )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:551:1: ( 'or' )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:552:1: 'or'
                    {
                     before(grammarAccess.getOrExprAccess().getOrKeyword_1_1_0()); 
                    match(input,8,FOLLOW_8_in_rule__OrExpr__Alternatives_1_11103); 
                     after(grammarAccess.getOrExprAccess().getOrKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:559:6: ( '||' )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:559:6: ( '||' )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:560:1: '||'
                    {
                     before(grammarAccess.getOrExprAccess().getVerticalLineVerticalLineKeyword_1_1_1()); 
                    match(input,9,FOLLOW_9_in_rule__OrExpr__Alternatives_1_11123); 
                     after(grammarAccess.getOrExprAccess().getVerticalLineVerticalLineKeyword_1_1_1()); 

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
    // $ANTLR end "rule__OrExpr__Alternatives_1_1"


    // $ANTLR start "rule__AndExpr__Alternatives_1_1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:572:1: rule__AndExpr__Alternatives_1_1 : ( ( 'and' ) | ( '&&' ) );
    public final void rule__AndExpr__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:576:1: ( ( 'and' ) | ( '&&' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==10) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:577:1: ( 'and' )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:577:1: ( 'and' )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:578:1: 'and'
                    {
                     before(grammarAccess.getAndExprAccess().getAndKeyword_1_1_0()); 
                    match(input,10,FOLLOW_10_in_rule__AndExpr__Alternatives_1_11158); 
                     after(grammarAccess.getAndExprAccess().getAndKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:585:6: ( '&&' )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:585:6: ( '&&' )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:586:1: '&&'
                    {
                     before(grammarAccess.getAndExprAccess().getAmpersandAmpersandKeyword_1_1_1()); 
                    match(input,11,FOLLOW_11_in_rule__AndExpr__Alternatives_1_11178); 
                     after(grammarAccess.getAndExprAccess().getAmpersandAmpersandKeyword_1_1_1()); 

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
    // $ANTLR end "rule__AndExpr__Alternatives_1_1"


    // $ANTLR start "rule__UnaryExpr__Alternatives"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:598:1: rule__UnaryExpr__Alternatives : ( ( ruleAtom ) | ( ( rule__UnaryExpr__Group_1__0 ) ) );
    public final void rule__UnaryExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:602:1: ( ( ruleAtom ) | ( ( rule__UnaryExpr__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_STRING)||LA3_0==20||LA3_0==22||(LA3_0>=24 && LA3_0<=26)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=12 && LA3_0<=13)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:603:1: ( ruleAtom )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:603:1: ( ruleAtom )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:604:1: ruleAtom
                    {
                     before(grammarAccess.getUnaryExprAccess().getAtomParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAtom_in_rule__UnaryExpr__Alternatives1212);
                    ruleAtom();

                    state._fsp--;

                     after(grammarAccess.getUnaryExprAccess().getAtomParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:609:6: ( ( rule__UnaryExpr__Group_1__0 ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:609:6: ( ( rule__UnaryExpr__Group_1__0 ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:610:1: ( rule__UnaryExpr__Group_1__0 )
                    {
                     before(grammarAccess.getUnaryExprAccess().getGroup_1()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:611:1: ( rule__UnaryExpr__Group_1__0 )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:611:2: rule__UnaryExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__UnaryExpr__Group_1__0_in_rule__UnaryExpr__Alternatives1229);
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


    // $ANTLR start "rule__UnaryExpr__Alternatives_1_1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:620:1: rule__UnaryExpr__Alternatives_1_1 : ( ( 'not' ) | ( '!' ) );
    public final void rule__UnaryExpr__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:624:1: ( ( 'not' ) | ( '!' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:625:1: ( 'not' )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:625:1: ( 'not' )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:626:1: 'not'
                    {
                     before(grammarAccess.getUnaryExprAccess().getNotKeyword_1_1_0()); 
                    match(input,12,FOLLOW_12_in_rule__UnaryExpr__Alternatives_1_11263); 
                     after(grammarAccess.getUnaryExprAccess().getNotKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:633:6: ( '!' )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:633:6: ( '!' )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:634:1: '!'
                    {
                     before(grammarAccess.getUnaryExprAccess().getExclamationMarkKeyword_1_1_1()); 
                    match(input,13,FOLLOW_13_in_rule__UnaryExpr__Alternatives_1_11283); 
                     after(grammarAccess.getUnaryExprAccess().getExclamationMarkKeyword_1_1_1()); 

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
    // $ANTLR end "rule__UnaryExpr__Alternatives_1_1"


    // $ANTLR start "rule__Atom__Alternatives"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:646:1: rule__Atom__Alternatives : ( ( ruleValue ) | ( ruleWords ) | ( ruleParenExpr ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:650:1: ( ( ruleValue ) | ( ruleWords ) | ( ruleParenExpr ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case 22:
            case 24:
            case 25:
            case 26:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==EOF||(LA5_2>=8 && LA5_2<=11)||(LA5_2>=14 && LA5_2<=19)||LA5_2==21) ) {
                    alt5=1;
                }
                else if ( (LA5_2==RULE_ID) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:651:1: ( ruleValue )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:651:1: ( ruleValue )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:652:1: ruleValue
                    {
                     before(grammarAccess.getAtomAccess().getValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleValue_in_rule__Atom__Alternatives1317);
                    ruleValue();

                    state._fsp--;

                     after(grammarAccess.getAtomAccess().getValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:657:6: ( ruleWords )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:657:6: ( ruleWords )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:658:1: ruleWords
                    {
                     before(grammarAccess.getAtomAccess().getWordsParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleWords_in_rule__Atom__Alternatives1334);
                    ruleWords();

                    state._fsp--;

                     after(grammarAccess.getAtomAccess().getWordsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:663:6: ( ruleParenExpr )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:663:6: ( ruleParenExpr )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:664:1: ruleParenExpr
                    {
                     before(grammarAccess.getAtomAccess().getParenExprParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleParenExpr_in_rule__Atom__Alternatives1351);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:674:1: rule__Value__Alternatives : ( ( ruleProjectReference ) | ( ruleWord ) | ( rulePhrase ) | ( ruleTagReference ) | ( ruleTextReference ) | ( ruleTaskReference ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:678:1: ( ( ruleProjectReference ) | ( ruleWord ) | ( rulePhrase ) | ( ruleTagReference ) | ( ruleTextReference ) | ( ruleTaskReference ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
                {
                alt6=2;
                }
                break;
            case RULE_STRING:
                {
                alt6=3;
                }
                break;
            case 26:
                {
                alt6=4;
                }
                break;
            case 25:
                {
                alt6=5;
                }
                break;
            case 24:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:679:1: ( ruleProjectReference )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:679:1: ( ruleProjectReference )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:680:1: ruleProjectReference
                    {
                     before(grammarAccess.getValueAccess().getProjectReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleProjectReference_in_rule__Value__Alternatives1383);
                    ruleProjectReference();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getProjectReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:685:6: ( ruleWord )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:685:6: ( ruleWord )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:686:1: ruleWord
                    {
                     before(grammarAccess.getValueAccess().getWordParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleWord_in_rule__Value__Alternatives1400);
                    ruleWord();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getWordParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:691:6: ( rulePhrase )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:691:6: ( rulePhrase )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:692:1: rulePhrase
                    {
                     before(grammarAccess.getValueAccess().getPhraseParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePhrase_in_rule__Value__Alternatives1417);
                    rulePhrase();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getPhraseParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:697:6: ( ruleTagReference )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:697:6: ( ruleTagReference )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:698:1: ruleTagReference
                    {
                     before(grammarAccess.getValueAccess().getTagReferenceParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleTagReference_in_rule__Value__Alternatives1434);
                    ruleTagReference();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getTagReferenceParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:703:6: ( ruleTextReference )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:703:6: ( ruleTextReference )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:704:1: ruleTextReference
                    {
                     before(grammarAccess.getValueAccess().getTextReferenceParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleTextReference_in_rule__Value__Alternatives1451);
                    ruleTextReference();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getTextReferenceParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:709:6: ( ruleTaskReference )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:709:6: ( ruleTaskReference )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:710:1: ruleTaskReference
                    {
                     before(grammarAccess.getValueAccess().getTaskReferenceParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleTaskReference_in_rule__Value__Alternatives1468);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:720:1: rule__ProjectReference__Alternatives_2 : ( ( ( rule__ProjectReference__ValueAssignment_2_0 ) ) | ( ( rule__ProjectReference__ValueAssignment_2_1 ) ) );
    public final void rule__ProjectReference__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:724:1: ( ( ( rule__ProjectReference__ValueAssignment_2_0 ) ) | ( ( rule__ProjectReference__ValueAssignment_2_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:725:1: ( ( rule__ProjectReference__ValueAssignment_2_0 ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:725:1: ( ( rule__ProjectReference__ValueAssignment_2_0 ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:726:1: ( rule__ProjectReference__ValueAssignment_2_0 )
                    {
                     before(grammarAccess.getProjectReferenceAccess().getValueAssignment_2_0()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:727:1: ( rule__ProjectReference__ValueAssignment_2_0 )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:727:2: rule__ProjectReference__ValueAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__ProjectReference__ValueAssignment_2_0_in_rule__ProjectReference__Alternatives_21500);
                    rule__ProjectReference__ValueAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProjectReferenceAccess().getValueAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:731:6: ( ( rule__ProjectReference__ValueAssignment_2_1 ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:731:6: ( ( rule__ProjectReference__ValueAssignment_2_1 ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:732:1: ( rule__ProjectReference__ValueAssignment_2_1 )
                    {
                     before(grammarAccess.getProjectReferenceAccess().getValueAssignment_2_1()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:733:1: ( rule__ProjectReference__ValueAssignment_2_1 )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:733:2: rule__ProjectReference__ValueAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__ProjectReference__ValueAssignment_2_1_in_rule__ProjectReference__Alternatives_21518);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:742:1: rule__TaskReference__Alternatives_2 : ( ( ( rule__TaskReference__ValueAssignment_2_0 ) ) | ( ( rule__TaskReference__ValueAssignment_2_1 ) ) );
    public final void rule__TaskReference__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:746:1: ( ( ( rule__TaskReference__ValueAssignment_2_0 ) ) | ( ( rule__TaskReference__ValueAssignment_2_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:747:1: ( ( rule__TaskReference__ValueAssignment_2_0 ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:747:1: ( ( rule__TaskReference__ValueAssignment_2_0 ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:748:1: ( rule__TaskReference__ValueAssignment_2_0 )
                    {
                     before(grammarAccess.getTaskReferenceAccess().getValueAssignment_2_0()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:749:1: ( rule__TaskReference__ValueAssignment_2_0 )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:749:2: rule__TaskReference__ValueAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__TaskReference__ValueAssignment_2_0_in_rule__TaskReference__Alternatives_21551);
                    rule__TaskReference__ValueAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTaskReferenceAccess().getValueAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:753:6: ( ( rule__TaskReference__ValueAssignment_2_1 ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:753:6: ( ( rule__TaskReference__ValueAssignment_2_1 ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:754:1: ( rule__TaskReference__ValueAssignment_2_1 )
                    {
                     before(grammarAccess.getTaskReferenceAccess().getValueAssignment_2_1()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:755:1: ( rule__TaskReference__ValueAssignment_2_1 )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:755:2: rule__TaskReference__ValueAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__TaskReference__ValueAssignment_2_1_in_rule__TaskReference__Alternatives_21569);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:764:1: rule__TextReference__Alternatives_2 : ( ( ( rule__TextReference__ValueAssignment_2_0 ) ) | ( ( rule__TextReference__ValueAssignment_2_1 ) ) );
    public final void rule__TextReference__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:768:1: ( ( ( rule__TextReference__ValueAssignment_2_0 ) ) | ( ( rule__TextReference__ValueAssignment_2_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:769:1: ( ( rule__TextReference__ValueAssignment_2_0 ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:769:1: ( ( rule__TextReference__ValueAssignment_2_0 ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:770:1: ( rule__TextReference__ValueAssignment_2_0 )
                    {
                     before(grammarAccess.getTextReferenceAccess().getValueAssignment_2_0()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:771:1: ( rule__TextReference__ValueAssignment_2_0 )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:771:2: rule__TextReference__ValueAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__TextReference__ValueAssignment_2_0_in_rule__TextReference__Alternatives_21602);
                    rule__TextReference__ValueAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTextReferenceAccess().getValueAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:775:6: ( ( rule__TextReference__ValueAssignment_2_1 ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:775:6: ( ( rule__TextReference__ValueAssignment_2_1 ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:776:1: ( rule__TextReference__ValueAssignment_2_1 )
                    {
                     before(grammarAccess.getTextReferenceAccess().getValueAssignment_2_1()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:777:1: ( rule__TextReference__ValueAssignment_2_1 )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:777:2: rule__TextReference__ValueAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__TextReference__ValueAssignment_2_1_in_rule__TextReference__Alternatives_21620);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:786:1: rule__CompEqOperator__Alternatives : ( ( ( '=' ) ) | ( ( '!=' ) ) );
    public final void rule__CompEqOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:790:1: ( ( ( '=' ) ) | ( ( '!=' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            else if ( (LA10_0==15) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:791:1: ( ( '=' ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:791:1: ( ( '=' ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:792:1: ( '=' )
                    {
                     before(grammarAccess.getCompEqOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:793:1: ( '=' )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:793:3: '='
                    {
                    match(input,14,FOLLOW_14_in_rule__CompEqOperator__Alternatives1654); 

                    }

                     after(grammarAccess.getCompEqOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:798:6: ( ( '!=' ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:798:6: ( ( '!=' ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:799:1: ( '!=' )
                    {
                     before(grammarAccess.getCompEqOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_1()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:800:1: ( '!=' )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:800:3: '!='
                    {
                    match(input,15,FOLLOW_15_in_rule__CompEqOperator__Alternatives1675); 

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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:810:1: rule__CompOperator__Alternatives : ( ( ( '<=' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) );
    public final void rule__CompOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:814:1: ( ( ( '<=' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt11=1;
                }
                break;
            case 17:
                {
                alt11=2;
                }
                break;
            case 18:
                {
                alt11=3;
                }
                break;
            case 19:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:815:1: ( ( '<=' ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:815:1: ( ( '<=' ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:816:1: ( '<=' )
                    {
                     before(grammarAccess.getCompOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_0()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:817:1: ( '<=' )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:817:3: '<='
                    {
                    match(input,16,FOLLOW_16_in_rule__CompOperator__Alternatives1711); 

                    }

                     after(grammarAccess.getCompOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:822:6: ( ( '<' ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:822:6: ( ( '<' ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:823:1: ( '<' )
                    {
                     before(grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_1()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:824:1: ( '<' )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:824:3: '<'
                    {
                    match(input,17,FOLLOW_17_in_rule__CompOperator__Alternatives1732); 

                    }

                     after(grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:829:6: ( ( '>=' ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:829:6: ( ( '>=' ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:830:1: ( '>=' )
                    {
                     before(grammarAccess.getCompOperatorAccess().getGREATER_EQUALEnumLiteralDeclaration_2()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:831:1: ( '>=' )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:831:3: '>='
                    {
                    match(input,18,FOLLOW_18_in_rule__CompOperator__Alternatives1753); 

                    }

                     after(grammarAccess.getCompOperatorAccess().getGREATER_EQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:836:6: ( ( '>' ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:836:6: ( ( '>' ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:837:1: ( '>' )
                    {
                     before(grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_3()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:838:1: ( '>' )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:838:3: '>'
                    {
                    match(input,19,FOLLOW_19_in_rule__CompOperator__Alternatives1774); 

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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:850:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:854:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:855:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__01807);
            rule__Query__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Query__Group__1_in_rule__Query__Group__01810);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:862:1: rule__Query__Group__0__Impl : ( () ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:866:1: ( ( () ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:867:1: ( () )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:867:1: ( () )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:868:1: ()
            {
             before(grammarAccess.getQueryAccess().getQueryAction_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:869:1: ()
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:871:1: 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:881:1: rule__Query__Group__1 : rule__Query__Group__1__Impl ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:885:1: ( rule__Query__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:886:2: rule__Query__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__11868);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:892:1: rule__Query__Group__1__Impl : ( ( rule__Query__ExpressionAssignment_1 )? ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:896:1: ( ( ( rule__Query__ExpressionAssignment_1 )? ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:897:1: ( ( rule__Query__ExpressionAssignment_1 )? )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:897:1: ( ( rule__Query__ExpressionAssignment_1 )? )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:898:1: ( rule__Query__ExpressionAssignment_1 )?
            {
             before(grammarAccess.getQueryAccess().getExpressionAssignment_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:899:1: ( rule__Query__ExpressionAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_STRING)||(LA12_0>=12 && LA12_0<=13)||LA12_0==20||LA12_0==22||(LA12_0>=24 && LA12_0<=26)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:899:2: rule__Query__ExpressionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Query__ExpressionAssignment_1_in_rule__Query__Group__1__Impl1895);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:913:1: rule__OrExpr__Group__0 : rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1 ;
    public final void rule__OrExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:917:1: ( rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:918:2: rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1
            {
            pushFollow(FOLLOW_rule__OrExpr__Group__0__Impl_in_rule__OrExpr__Group__01930);
            rule__OrExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpr__Group__1_in_rule__OrExpr__Group__01933);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:925:1: rule__OrExpr__Group__0__Impl : ( ruleAndExpr ) ;
    public final void rule__OrExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:929:1: ( ( ruleAndExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:930:1: ( ruleAndExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:930:1: ( ruleAndExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:931:1: ruleAndExpr
            {
             before(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAndExpr_in_rule__OrExpr__Group__0__Impl1960);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:942:1: rule__OrExpr__Group__1 : rule__OrExpr__Group__1__Impl ;
    public final void rule__OrExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:946:1: ( rule__OrExpr__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:947:2: rule__OrExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpr__Group__1__Impl_in_rule__OrExpr__Group__11989);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:953:1: rule__OrExpr__Group__1__Impl : ( ( rule__OrExpr__Group_1__0 )* ) ;
    public final void rule__OrExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:957:1: ( ( ( rule__OrExpr__Group_1__0 )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:958:1: ( ( rule__OrExpr__Group_1__0 )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:958:1: ( ( rule__OrExpr__Group_1__0 )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:959:1: ( rule__OrExpr__Group_1__0 )*
            {
             before(grammarAccess.getOrExprAccess().getGroup_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:960:1: ( rule__OrExpr__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=8 && LA13_0<=9)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:960:2: rule__OrExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrExpr__Group_1__0_in_rule__OrExpr__Group__1__Impl2016);
            	    rule__OrExpr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:974:1: rule__OrExpr__Group_1__0 : rule__OrExpr__Group_1__0__Impl rule__OrExpr__Group_1__1 ;
    public final void rule__OrExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:978:1: ( rule__OrExpr__Group_1__0__Impl rule__OrExpr__Group_1__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:979:2: rule__OrExpr__Group_1__0__Impl rule__OrExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrExpr__Group_1__0__Impl_in_rule__OrExpr__Group_1__02051);
            rule__OrExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpr__Group_1__1_in_rule__OrExpr__Group_1__02054);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:986:1: rule__OrExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:990:1: ( ( () ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:991:1: ( () )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:991:1: ( () )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:992:1: ()
            {
             before(grammarAccess.getOrExprAccess().getOrExprLeftAction_1_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:993:1: ()
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:995:1: 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1005:1: rule__OrExpr__Group_1__1 : rule__OrExpr__Group_1__1__Impl rule__OrExpr__Group_1__2 ;
    public final void rule__OrExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1009:1: ( rule__OrExpr__Group_1__1__Impl rule__OrExpr__Group_1__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1010:2: rule__OrExpr__Group_1__1__Impl rule__OrExpr__Group_1__2
            {
            pushFollow(FOLLOW_rule__OrExpr__Group_1__1__Impl_in_rule__OrExpr__Group_1__12112);
            rule__OrExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpr__Group_1__2_in_rule__OrExpr__Group_1__12115);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1017:1: rule__OrExpr__Group_1__1__Impl : ( ( rule__OrExpr__Alternatives_1_1 ) ) ;
    public final void rule__OrExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1021:1: ( ( ( rule__OrExpr__Alternatives_1_1 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1022:1: ( ( rule__OrExpr__Alternatives_1_1 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1022:1: ( ( rule__OrExpr__Alternatives_1_1 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1023:1: ( rule__OrExpr__Alternatives_1_1 )
            {
             before(grammarAccess.getOrExprAccess().getAlternatives_1_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1024:1: ( rule__OrExpr__Alternatives_1_1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1024:2: rule__OrExpr__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__OrExpr__Alternatives_1_1_in_rule__OrExpr__Group_1__1__Impl2142);
            rule__OrExpr__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOrExprAccess().getAlternatives_1_1()); 

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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1034:1: rule__OrExpr__Group_1__2 : rule__OrExpr__Group_1__2__Impl ;
    public final void rule__OrExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1038:1: ( rule__OrExpr__Group_1__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1039:2: rule__OrExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__OrExpr__Group_1__2__Impl_in_rule__OrExpr__Group_1__22172);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1045:1: rule__OrExpr__Group_1__2__Impl : ( ( rule__OrExpr__RightAssignment_1_2 ) ) ;
    public final void rule__OrExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1049:1: ( ( ( rule__OrExpr__RightAssignment_1_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1050:1: ( ( rule__OrExpr__RightAssignment_1_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1050:1: ( ( rule__OrExpr__RightAssignment_1_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1051:1: ( rule__OrExpr__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrExprAccess().getRightAssignment_1_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1052:1: ( rule__OrExpr__RightAssignment_1_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1052:2: rule__OrExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__OrExpr__RightAssignment_1_2_in_rule__OrExpr__Group_1__2__Impl2199);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1068:1: rule__AndExpr__Group__0 : rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1 ;
    public final void rule__AndExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1072:1: ( rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1073:2: rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1
            {
            pushFollow(FOLLOW_rule__AndExpr__Group__0__Impl_in_rule__AndExpr__Group__02235);
            rule__AndExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpr__Group__1_in_rule__AndExpr__Group__02238);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1080:1: rule__AndExpr__Group__0__Impl : ( ruleCompEqExpr ) ;
    public final void rule__AndExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1084:1: ( ( ruleCompEqExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1085:1: ( ruleCompEqExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1085:1: ( ruleCompEqExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1086:1: ruleCompEqExpr
            {
             before(grammarAccess.getAndExprAccess().getCompEqExprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleCompEqExpr_in_rule__AndExpr__Group__0__Impl2265);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1097:1: rule__AndExpr__Group__1 : rule__AndExpr__Group__1__Impl ;
    public final void rule__AndExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1101:1: ( rule__AndExpr__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1102:2: rule__AndExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpr__Group__1__Impl_in_rule__AndExpr__Group__12294);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1108:1: rule__AndExpr__Group__1__Impl : ( ( rule__AndExpr__Group_1__0 )* ) ;
    public final void rule__AndExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1112:1: ( ( ( rule__AndExpr__Group_1__0 )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1113:1: ( ( rule__AndExpr__Group_1__0 )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1113:1: ( ( rule__AndExpr__Group_1__0 )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1114:1: ( rule__AndExpr__Group_1__0 )*
            {
             before(grammarAccess.getAndExprAccess().getGroup_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1115:1: ( rule__AndExpr__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=10 && LA14_0<=11)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1115:2: rule__AndExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExpr__Group_1__0_in_rule__AndExpr__Group__1__Impl2321);
            	    rule__AndExpr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1129:1: rule__AndExpr__Group_1__0 : rule__AndExpr__Group_1__0__Impl rule__AndExpr__Group_1__1 ;
    public final void rule__AndExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1133:1: ( rule__AndExpr__Group_1__0__Impl rule__AndExpr__Group_1__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1134:2: rule__AndExpr__Group_1__0__Impl rule__AndExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1__0__Impl_in_rule__AndExpr__Group_1__02356);
            rule__AndExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpr__Group_1__1_in_rule__AndExpr__Group_1__02359);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1141:1: rule__AndExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1145:1: ( ( () ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1146:1: ( () )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1146:1: ( () )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1147:1: ()
            {
             before(grammarAccess.getAndExprAccess().getAndExprLeftAction_1_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1148:1: ()
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1150:1: 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1160:1: rule__AndExpr__Group_1__1 : rule__AndExpr__Group_1__1__Impl rule__AndExpr__Group_1__2 ;
    public final void rule__AndExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1164:1: ( rule__AndExpr__Group_1__1__Impl rule__AndExpr__Group_1__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1165:2: rule__AndExpr__Group_1__1__Impl rule__AndExpr__Group_1__2
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1__1__Impl_in_rule__AndExpr__Group_1__12417);
            rule__AndExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpr__Group_1__2_in_rule__AndExpr__Group_1__12420);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1172:1: rule__AndExpr__Group_1__1__Impl : ( ( rule__AndExpr__Alternatives_1_1 ) ) ;
    public final void rule__AndExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1176:1: ( ( ( rule__AndExpr__Alternatives_1_1 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1177:1: ( ( rule__AndExpr__Alternatives_1_1 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1177:1: ( ( rule__AndExpr__Alternatives_1_1 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1178:1: ( rule__AndExpr__Alternatives_1_1 )
            {
             before(grammarAccess.getAndExprAccess().getAlternatives_1_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1179:1: ( rule__AndExpr__Alternatives_1_1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1179:2: rule__AndExpr__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__AndExpr__Alternatives_1_1_in_rule__AndExpr__Group_1__1__Impl2447);
            rule__AndExpr__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAndExprAccess().getAlternatives_1_1()); 

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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1189:1: rule__AndExpr__Group_1__2 : rule__AndExpr__Group_1__2__Impl ;
    public final void rule__AndExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1193:1: ( rule__AndExpr__Group_1__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1194:2: rule__AndExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1__2__Impl_in_rule__AndExpr__Group_1__22477);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1200:1: rule__AndExpr__Group_1__2__Impl : ( ( rule__AndExpr__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1204:1: ( ( ( rule__AndExpr__RightAssignment_1_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1205:1: ( ( rule__AndExpr__RightAssignment_1_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1205:1: ( ( rule__AndExpr__RightAssignment_1_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1206:1: ( rule__AndExpr__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndExprAccess().getRightAssignment_1_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1207:1: ( rule__AndExpr__RightAssignment_1_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1207:2: rule__AndExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AndExpr__RightAssignment_1_2_in_rule__AndExpr__Group_1__2__Impl2504);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1223:1: rule__CompEqExpr__Group__0 : rule__CompEqExpr__Group__0__Impl rule__CompEqExpr__Group__1 ;
    public final void rule__CompEqExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1227:1: ( rule__CompEqExpr__Group__0__Impl rule__CompEqExpr__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1228:2: rule__CompEqExpr__Group__0__Impl rule__CompEqExpr__Group__1
            {
            pushFollow(FOLLOW_rule__CompEqExpr__Group__0__Impl_in_rule__CompEqExpr__Group__02540);
            rule__CompEqExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompEqExpr__Group__1_in_rule__CompEqExpr__Group__02543);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1235:1: rule__CompEqExpr__Group__0__Impl : ( ruleCompExpr ) ;
    public final void rule__CompEqExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1239:1: ( ( ruleCompExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1240:1: ( ruleCompExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1240:1: ( ruleCompExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1241:1: ruleCompExpr
            {
             before(grammarAccess.getCompEqExprAccess().getCompExprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleCompExpr_in_rule__CompEqExpr__Group__0__Impl2570);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1252:1: rule__CompEqExpr__Group__1 : rule__CompEqExpr__Group__1__Impl ;
    public final void rule__CompEqExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1256:1: ( rule__CompEqExpr__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1257:2: rule__CompEqExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CompEqExpr__Group__1__Impl_in_rule__CompEqExpr__Group__12599);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1263:1: rule__CompEqExpr__Group__1__Impl : ( ( rule__CompEqExpr__Group_1__0 )* ) ;
    public final void rule__CompEqExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1267:1: ( ( ( rule__CompEqExpr__Group_1__0 )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1268:1: ( ( rule__CompEqExpr__Group_1__0 )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1268:1: ( ( rule__CompEqExpr__Group_1__0 )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1269:1: ( rule__CompEqExpr__Group_1__0 )*
            {
             before(grammarAccess.getCompEqExprAccess().getGroup_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1270:1: ( rule__CompEqExpr__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=14 && LA15_0<=15)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1270:2: rule__CompEqExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CompEqExpr__Group_1__0_in_rule__CompEqExpr__Group__1__Impl2626);
            	    rule__CompEqExpr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1284:1: rule__CompEqExpr__Group_1__0 : rule__CompEqExpr__Group_1__0__Impl rule__CompEqExpr__Group_1__1 ;
    public final void rule__CompEqExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1288:1: ( rule__CompEqExpr__Group_1__0__Impl rule__CompEqExpr__Group_1__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1289:2: rule__CompEqExpr__Group_1__0__Impl rule__CompEqExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__CompEqExpr__Group_1__0__Impl_in_rule__CompEqExpr__Group_1__02661);
            rule__CompEqExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompEqExpr__Group_1__1_in_rule__CompEqExpr__Group_1__02664);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1296:1: rule__CompEqExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__CompEqExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1300:1: ( ( () ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1301:1: ( () )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1301:1: ( () )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1302:1: ()
            {
             before(grammarAccess.getCompEqExprAccess().getCompEqExprLeftAction_1_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1303:1: ()
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1305:1: 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1315:1: rule__CompEqExpr__Group_1__1 : rule__CompEqExpr__Group_1__1__Impl rule__CompEqExpr__Group_1__2 ;
    public final void rule__CompEqExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1319:1: ( rule__CompEqExpr__Group_1__1__Impl rule__CompEqExpr__Group_1__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1320:2: rule__CompEqExpr__Group_1__1__Impl rule__CompEqExpr__Group_1__2
            {
            pushFollow(FOLLOW_rule__CompEqExpr__Group_1__1__Impl_in_rule__CompEqExpr__Group_1__12722);
            rule__CompEqExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompEqExpr__Group_1__2_in_rule__CompEqExpr__Group_1__12725);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1327:1: rule__CompEqExpr__Group_1__1__Impl : ( ( rule__CompEqExpr__OperatorAssignment_1_1 ) ) ;
    public final void rule__CompEqExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1331:1: ( ( ( rule__CompEqExpr__OperatorAssignment_1_1 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1332:1: ( ( rule__CompEqExpr__OperatorAssignment_1_1 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1332:1: ( ( rule__CompEqExpr__OperatorAssignment_1_1 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1333:1: ( rule__CompEqExpr__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getCompEqExprAccess().getOperatorAssignment_1_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1334:1: ( rule__CompEqExpr__OperatorAssignment_1_1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1334:2: rule__CompEqExpr__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CompEqExpr__OperatorAssignment_1_1_in_rule__CompEqExpr__Group_1__1__Impl2752);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1344:1: rule__CompEqExpr__Group_1__2 : rule__CompEqExpr__Group_1__2__Impl ;
    public final void rule__CompEqExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1348:1: ( rule__CompEqExpr__Group_1__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1349:2: rule__CompEqExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__CompEqExpr__Group_1__2__Impl_in_rule__CompEqExpr__Group_1__22782);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1355:1: rule__CompEqExpr__Group_1__2__Impl : ( ( rule__CompEqExpr__RightAssignment_1_2 ) ) ;
    public final void rule__CompEqExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1359:1: ( ( ( rule__CompEqExpr__RightAssignment_1_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1360:1: ( ( rule__CompEqExpr__RightAssignment_1_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1360:1: ( ( rule__CompEqExpr__RightAssignment_1_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1361:1: ( rule__CompEqExpr__RightAssignment_1_2 )
            {
             before(grammarAccess.getCompEqExprAccess().getRightAssignment_1_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1362:1: ( rule__CompEqExpr__RightAssignment_1_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1362:2: rule__CompEqExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__CompEqExpr__RightAssignment_1_2_in_rule__CompEqExpr__Group_1__2__Impl2809);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1378:1: rule__CompExpr__Group__0 : rule__CompExpr__Group__0__Impl rule__CompExpr__Group__1 ;
    public final void rule__CompExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1382:1: ( rule__CompExpr__Group__0__Impl rule__CompExpr__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1383:2: rule__CompExpr__Group__0__Impl rule__CompExpr__Group__1
            {
            pushFollow(FOLLOW_rule__CompExpr__Group__0__Impl_in_rule__CompExpr__Group__02845);
            rule__CompExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompExpr__Group__1_in_rule__CompExpr__Group__02848);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1390:1: rule__CompExpr__Group__0__Impl : ( ruleUnaryExpr ) ;
    public final void rule__CompExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1394:1: ( ( ruleUnaryExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1395:1: ( ruleUnaryExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1395:1: ( ruleUnaryExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1396:1: ruleUnaryExpr
            {
             before(grammarAccess.getCompExprAccess().getUnaryExprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_rule__CompExpr__Group__0__Impl2875);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1407:1: rule__CompExpr__Group__1 : rule__CompExpr__Group__1__Impl ;
    public final void rule__CompExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1411:1: ( rule__CompExpr__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1412:2: rule__CompExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CompExpr__Group__1__Impl_in_rule__CompExpr__Group__12904);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1418:1: rule__CompExpr__Group__1__Impl : ( ( rule__CompExpr__Group_1__0 )* ) ;
    public final void rule__CompExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1422:1: ( ( ( rule__CompExpr__Group_1__0 )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1423:1: ( ( rule__CompExpr__Group_1__0 )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1423:1: ( ( rule__CompExpr__Group_1__0 )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1424:1: ( rule__CompExpr__Group_1__0 )*
            {
             before(grammarAccess.getCompExprAccess().getGroup_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1425:1: ( rule__CompExpr__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=16 && LA16_0<=19)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1425:2: rule__CompExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CompExpr__Group_1__0_in_rule__CompExpr__Group__1__Impl2931);
            	    rule__CompExpr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1439:1: rule__CompExpr__Group_1__0 : rule__CompExpr__Group_1__0__Impl rule__CompExpr__Group_1__1 ;
    public final void rule__CompExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1443:1: ( rule__CompExpr__Group_1__0__Impl rule__CompExpr__Group_1__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1444:2: rule__CompExpr__Group_1__0__Impl rule__CompExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__CompExpr__Group_1__0__Impl_in_rule__CompExpr__Group_1__02966);
            rule__CompExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompExpr__Group_1__1_in_rule__CompExpr__Group_1__02969);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1451:1: rule__CompExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__CompExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1455:1: ( ( () ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1456:1: ( () )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1456:1: ( () )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1457:1: ()
            {
             before(grammarAccess.getCompExprAccess().getCompExprLeftAction_1_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1458:1: ()
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1460:1: 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1470:1: rule__CompExpr__Group_1__1 : rule__CompExpr__Group_1__1__Impl rule__CompExpr__Group_1__2 ;
    public final void rule__CompExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1474:1: ( rule__CompExpr__Group_1__1__Impl rule__CompExpr__Group_1__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1475:2: rule__CompExpr__Group_1__1__Impl rule__CompExpr__Group_1__2
            {
            pushFollow(FOLLOW_rule__CompExpr__Group_1__1__Impl_in_rule__CompExpr__Group_1__13027);
            rule__CompExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompExpr__Group_1__2_in_rule__CompExpr__Group_1__13030);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1482:1: rule__CompExpr__Group_1__1__Impl : ( ( rule__CompExpr__OperatorAssignment_1_1 ) ) ;
    public final void rule__CompExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1486:1: ( ( ( rule__CompExpr__OperatorAssignment_1_1 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1487:1: ( ( rule__CompExpr__OperatorAssignment_1_1 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1487:1: ( ( rule__CompExpr__OperatorAssignment_1_1 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1488:1: ( rule__CompExpr__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getCompExprAccess().getOperatorAssignment_1_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1489:1: ( rule__CompExpr__OperatorAssignment_1_1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1489:2: rule__CompExpr__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CompExpr__OperatorAssignment_1_1_in_rule__CompExpr__Group_1__1__Impl3057);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1499:1: rule__CompExpr__Group_1__2 : rule__CompExpr__Group_1__2__Impl ;
    public final void rule__CompExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1503:1: ( rule__CompExpr__Group_1__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1504:2: rule__CompExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__CompExpr__Group_1__2__Impl_in_rule__CompExpr__Group_1__23087);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1510:1: rule__CompExpr__Group_1__2__Impl : ( ( rule__CompExpr__RightAssignment_1_2 ) ) ;
    public final void rule__CompExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1514:1: ( ( ( rule__CompExpr__RightAssignment_1_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1515:1: ( ( rule__CompExpr__RightAssignment_1_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1515:1: ( ( rule__CompExpr__RightAssignment_1_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1516:1: ( rule__CompExpr__RightAssignment_1_2 )
            {
             before(grammarAccess.getCompExprAccess().getRightAssignment_1_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1517:1: ( rule__CompExpr__RightAssignment_1_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1517:2: rule__CompExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__CompExpr__RightAssignment_1_2_in_rule__CompExpr__Group_1__2__Impl3114);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1533:1: rule__UnaryExpr__Group_1__0 : rule__UnaryExpr__Group_1__0__Impl rule__UnaryExpr__Group_1__1 ;
    public final void rule__UnaryExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1537:1: ( rule__UnaryExpr__Group_1__0__Impl rule__UnaryExpr__Group_1__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1538:2: rule__UnaryExpr__Group_1__0__Impl rule__UnaryExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__UnaryExpr__Group_1__0__Impl_in_rule__UnaryExpr__Group_1__03150);
            rule__UnaryExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnaryExpr__Group_1__1_in_rule__UnaryExpr__Group_1__03153);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1545:1: rule__UnaryExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__UnaryExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1549:1: ( ( () ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1550:1: ( () )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1550:1: ( () )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1551:1: ()
            {
             before(grammarAccess.getUnaryExprAccess().getUnaryExprAction_1_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1552:1: ()
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1554:1: 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1564:1: rule__UnaryExpr__Group_1__1 : rule__UnaryExpr__Group_1__1__Impl rule__UnaryExpr__Group_1__2 ;
    public final void rule__UnaryExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1568:1: ( rule__UnaryExpr__Group_1__1__Impl rule__UnaryExpr__Group_1__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1569:2: rule__UnaryExpr__Group_1__1__Impl rule__UnaryExpr__Group_1__2
            {
            pushFollow(FOLLOW_rule__UnaryExpr__Group_1__1__Impl_in_rule__UnaryExpr__Group_1__13211);
            rule__UnaryExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnaryExpr__Group_1__2_in_rule__UnaryExpr__Group_1__13214);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1576:1: rule__UnaryExpr__Group_1__1__Impl : ( ( rule__UnaryExpr__Alternatives_1_1 ) ) ;
    public final void rule__UnaryExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1580:1: ( ( ( rule__UnaryExpr__Alternatives_1_1 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1581:1: ( ( rule__UnaryExpr__Alternatives_1_1 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1581:1: ( ( rule__UnaryExpr__Alternatives_1_1 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1582:1: ( rule__UnaryExpr__Alternatives_1_1 )
            {
             before(grammarAccess.getUnaryExprAccess().getAlternatives_1_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1583:1: ( rule__UnaryExpr__Alternatives_1_1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1583:2: rule__UnaryExpr__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__UnaryExpr__Alternatives_1_1_in_rule__UnaryExpr__Group_1__1__Impl3241);
            rule__UnaryExpr__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExprAccess().getAlternatives_1_1()); 

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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1593:1: rule__UnaryExpr__Group_1__2 : rule__UnaryExpr__Group_1__2__Impl ;
    public final void rule__UnaryExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1597:1: ( rule__UnaryExpr__Group_1__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1598:2: rule__UnaryExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__UnaryExpr__Group_1__2__Impl_in_rule__UnaryExpr__Group_1__23271);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1604:1: rule__UnaryExpr__Group_1__2__Impl : ( ( rule__UnaryExpr__ExprAssignment_1_2 ) ) ;
    public final void rule__UnaryExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1608:1: ( ( ( rule__UnaryExpr__ExprAssignment_1_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1609:1: ( ( rule__UnaryExpr__ExprAssignment_1_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1609:1: ( ( rule__UnaryExpr__ExprAssignment_1_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1610:1: ( rule__UnaryExpr__ExprAssignment_1_2 )
            {
             before(grammarAccess.getUnaryExprAccess().getExprAssignment_1_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1611:1: ( rule__UnaryExpr__ExprAssignment_1_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1611:2: rule__UnaryExpr__ExprAssignment_1_2
            {
            pushFollow(FOLLOW_rule__UnaryExpr__ExprAssignment_1_2_in_rule__UnaryExpr__Group_1__2__Impl3298);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1627:1: rule__ParenExpr__Group__0 : rule__ParenExpr__Group__0__Impl rule__ParenExpr__Group__1 ;
    public final void rule__ParenExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1631:1: ( rule__ParenExpr__Group__0__Impl rule__ParenExpr__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1632:2: rule__ParenExpr__Group__0__Impl rule__ParenExpr__Group__1
            {
            pushFollow(FOLLOW_rule__ParenExpr__Group__0__Impl_in_rule__ParenExpr__Group__03334);
            rule__ParenExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParenExpr__Group__1_in_rule__ParenExpr__Group__03337);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1639:1: rule__ParenExpr__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1643:1: ( ( '(' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1644:1: ( '(' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1644:1: ( '(' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1645:1: '('
            {
             before(grammarAccess.getParenExprAccess().getLeftParenthesisKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__ParenExpr__Group__0__Impl3365); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1658:1: rule__ParenExpr__Group__1 : rule__ParenExpr__Group__1__Impl rule__ParenExpr__Group__2 ;
    public final void rule__ParenExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1662:1: ( rule__ParenExpr__Group__1__Impl rule__ParenExpr__Group__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1663:2: rule__ParenExpr__Group__1__Impl rule__ParenExpr__Group__2
            {
            pushFollow(FOLLOW_rule__ParenExpr__Group__1__Impl_in_rule__ParenExpr__Group__13396);
            rule__ParenExpr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParenExpr__Group__2_in_rule__ParenExpr__Group__13399);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1670:1: rule__ParenExpr__Group__1__Impl : ( () ) ;
    public final void rule__ParenExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1674:1: ( ( () ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1675:1: ( () )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1675:1: ( () )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1676:1: ()
            {
             before(grammarAccess.getParenExprAccess().getParenExprAction_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1677:1: ()
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1679:1: 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1689:1: rule__ParenExpr__Group__2 : rule__ParenExpr__Group__2__Impl rule__ParenExpr__Group__3 ;
    public final void rule__ParenExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1693:1: ( rule__ParenExpr__Group__2__Impl rule__ParenExpr__Group__3 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1694:2: rule__ParenExpr__Group__2__Impl rule__ParenExpr__Group__3
            {
            pushFollow(FOLLOW_rule__ParenExpr__Group__2__Impl_in_rule__ParenExpr__Group__23457);
            rule__ParenExpr__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParenExpr__Group__3_in_rule__ParenExpr__Group__23460);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1701:1: rule__ParenExpr__Group__2__Impl : ( ( rule__ParenExpr__ExprAssignment_2 ) ) ;
    public final void rule__ParenExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1705:1: ( ( ( rule__ParenExpr__ExprAssignment_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1706:1: ( ( rule__ParenExpr__ExprAssignment_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1706:1: ( ( rule__ParenExpr__ExprAssignment_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1707:1: ( rule__ParenExpr__ExprAssignment_2 )
            {
             before(grammarAccess.getParenExprAccess().getExprAssignment_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1708:1: ( rule__ParenExpr__ExprAssignment_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1708:2: rule__ParenExpr__ExprAssignment_2
            {
            pushFollow(FOLLOW_rule__ParenExpr__ExprAssignment_2_in_rule__ParenExpr__Group__2__Impl3487);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1718:1: rule__ParenExpr__Group__3 : rule__ParenExpr__Group__3__Impl ;
    public final void rule__ParenExpr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1722:1: ( rule__ParenExpr__Group__3__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1723:2: rule__ParenExpr__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ParenExpr__Group__3__Impl_in_rule__ParenExpr__Group__33517);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1729:1: rule__ParenExpr__Group__3__Impl : ( ')' ) ;
    public final void rule__ParenExpr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1733:1: ( ( ')' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1734:1: ( ')' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1734:1: ( ')' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1735:1: ')'
            {
             before(grammarAccess.getParenExprAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__ParenExpr__Group__3__Impl3545); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1756:1: rule__ProjectReference__Group__0 : rule__ProjectReference__Group__0__Impl rule__ProjectReference__Group__1 ;
    public final void rule__ProjectReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1760:1: ( rule__ProjectReference__Group__0__Impl rule__ProjectReference__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1761:2: rule__ProjectReference__Group__0__Impl rule__ProjectReference__Group__1
            {
            pushFollow(FOLLOW_rule__ProjectReference__Group__0__Impl_in_rule__ProjectReference__Group__03584);
            rule__ProjectReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProjectReference__Group__1_in_rule__ProjectReference__Group__03587);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1768:1: rule__ProjectReference__Group__0__Impl : ( 'project' ) ;
    public final void rule__ProjectReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1772:1: ( ( 'project' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1773:1: ( 'project' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1773:1: ( 'project' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1774:1: 'project'
            {
             before(grammarAccess.getProjectReferenceAccess().getProjectKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__ProjectReference__Group__0__Impl3615); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1787:1: rule__ProjectReference__Group__1 : rule__ProjectReference__Group__1__Impl rule__ProjectReference__Group__2 ;
    public final void rule__ProjectReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1791:1: ( rule__ProjectReference__Group__1__Impl rule__ProjectReference__Group__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1792:2: rule__ProjectReference__Group__1__Impl rule__ProjectReference__Group__2
            {
            pushFollow(FOLLOW_rule__ProjectReference__Group__1__Impl_in_rule__ProjectReference__Group__13646);
            rule__ProjectReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProjectReference__Group__2_in_rule__ProjectReference__Group__13649);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1799:1: rule__ProjectReference__Group__1__Impl : ( ':' ) ;
    public final void rule__ProjectReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1803:1: ( ( ':' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1804:1: ( ':' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1804:1: ( ':' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1805:1: ':'
            {
             before(grammarAccess.getProjectReferenceAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__ProjectReference__Group__1__Impl3677); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1818:1: rule__ProjectReference__Group__2 : rule__ProjectReference__Group__2__Impl ;
    public final void rule__ProjectReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1822:1: ( rule__ProjectReference__Group__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1823:2: rule__ProjectReference__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ProjectReference__Group__2__Impl_in_rule__ProjectReference__Group__23708);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1829:1: rule__ProjectReference__Group__2__Impl : ( ( rule__ProjectReference__Alternatives_2 ) ) ;
    public final void rule__ProjectReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1833:1: ( ( ( rule__ProjectReference__Alternatives_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1834:1: ( ( rule__ProjectReference__Alternatives_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1834:1: ( ( rule__ProjectReference__Alternatives_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1835:1: ( rule__ProjectReference__Alternatives_2 )
            {
             before(grammarAccess.getProjectReferenceAccess().getAlternatives_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1836:1: ( rule__ProjectReference__Alternatives_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1836:2: rule__ProjectReference__Alternatives_2
            {
            pushFollow(FOLLOW_rule__ProjectReference__Alternatives_2_in_rule__ProjectReference__Group__2__Impl3735);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1852:1: rule__TaskReference__Group__0 : rule__TaskReference__Group__0__Impl rule__TaskReference__Group__1 ;
    public final void rule__TaskReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1856:1: ( rule__TaskReference__Group__0__Impl rule__TaskReference__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1857:2: rule__TaskReference__Group__0__Impl rule__TaskReference__Group__1
            {
            pushFollow(FOLLOW_rule__TaskReference__Group__0__Impl_in_rule__TaskReference__Group__03771);
            rule__TaskReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TaskReference__Group__1_in_rule__TaskReference__Group__03774);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1864:1: rule__TaskReference__Group__0__Impl : ( 'task' ) ;
    public final void rule__TaskReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1868:1: ( ( 'task' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1869:1: ( 'task' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1869:1: ( 'task' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1870:1: 'task'
            {
             before(grammarAccess.getTaskReferenceAccess().getTaskKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__TaskReference__Group__0__Impl3802); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1883:1: rule__TaskReference__Group__1 : rule__TaskReference__Group__1__Impl rule__TaskReference__Group__2 ;
    public final void rule__TaskReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1887:1: ( rule__TaskReference__Group__1__Impl rule__TaskReference__Group__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1888:2: rule__TaskReference__Group__1__Impl rule__TaskReference__Group__2
            {
            pushFollow(FOLLOW_rule__TaskReference__Group__1__Impl_in_rule__TaskReference__Group__13833);
            rule__TaskReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TaskReference__Group__2_in_rule__TaskReference__Group__13836);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1895:1: rule__TaskReference__Group__1__Impl : ( ':' ) ;
    public final void rule__TaskReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1899:1: ( ( ':' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1900:1: ( ':' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1900:1: ( ':' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1901:1: ':'
            {
             before(grammarAccess.getTaskReferenceAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__TaskReference__Group__1__Impl3864); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1914:1: rule__TaskReference__Group__2 : rule__TaskReference__Group__2__Impl ;
    public final void rule__TaskReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1918:1: ( rule__TaskReference__Group__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1919:2: rule__TaskReference__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TaskReference__Group__2__Impl_in_rule__TaskReference__Group__23895);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1925:1: rule__TaskReference__Group__2__Impl : ( ( rule__TaskReference__Alternatives_2 ) ) ;
    public final void rule__TaskReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1929:1: ( ( ( rule__TaskReference__Alternatives_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1930:1: ( ( rule__TaskReference__Alternatives_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1930:1: ( ( rule__TaskReference__Alternatives_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1931:1: ( rule__TaskReference__Alternatives_2 )
            {
             before(grammarAccess.getTaskReferenceAccess().getAlternatives_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1932:1: ( rule__TaskReference__Alternatives_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1932:2: rule__TaskReference__Alternatives_2
            {
            pushFollow(FOLLOW_rule__TaskReference__Alternatives_2_in_rule__TaskReference__Group__2__Impl3922);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1948:1: rule__TextReference__Group__0 : rule__TextReference__Group__0__Impl rule__TextReference__Group__1 ;
    public final void rule__TextReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1952:1: ( rule__TextReference__Group__0__Impl rule__TextReference__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1953:2: rule__TextReference__Group__0__Impl rule__TextReference__Group__1
            {
            pushFollow(FOLLOW_rule__TextReference__Group__0__Impl_in_rule__TextReference__Group__03958);
            rule__TextReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextReference__Group__1_in_rule__TextReference__Group__03961);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1960:1: rule__TextReference__Group__0__Impl : ( 'text' ) ;
    public final void rule__TextReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1964:1: ( ( 'text' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1965:1: ( 'text' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1965:1: ( 'text' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1966:1: 'text'
            {
             before(grammarAccess.getTextReferenceAccess().getTextKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__TextReference__Group__0__Impl3989); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1979:1: rule__TextReference__Group__1 : rule__TextReference__Group__1__Impl rule__TextReference__Group__2 ;
    public final void rule__TextReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1983:1: ( rule__TextReference__Group__1__Impl rule__TextReference__Group__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1984:2: rule__TextReference__Group__1__Impl rule__TextReference__Group__2
            {
            pushFollow(FOLLOW_rule__TextReference__Group__1__Impl_in_rule__TextReference__Group__14020);
            rule__TextReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextReference__Group__2_in_rule__TextReference__Group__14023);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1991:1: rule__TextReference__Group__1__Impl : ( ':' ) ;
    public final void rule__TextReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1995:1: ( ( ':' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1996:1: ( ':' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1996:1: ( ':' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1997:1: ':'
            {
             before(grammarAccess.getTextReferenceAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__TextReference__Group__1__Impl4051); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2010:1: rule__TextReference__Group__2 : rule__TextReference__Group__2__Impl ;
    public final void rule__TextReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2014:1: ( rule__TextReference__Group__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2015:2: rule__TextReference__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TextReference__Group__2__Impl_in_rule__TextReference__Group__24082);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2021:1: rule__TextReference__Group__2__Impl : ( ( rule__TextReference__Alternatives_2 ) ) ;
    public final void rule__TextReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2025:1: ( ( ( rule__TextReference__Alternatives_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2026:1: ( ( rule__TextReference__Alternatives_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2026:1: ( ( rule__TextReference__Alternatives_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2027:1: ( rule__TextReference__Alternatives_2 )
            {
             before(grammarAccess.getTextReferenceAccess().getAlternatives_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2028:1: ( rule__TextReference__Alternatives_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2028:2: rule__TextReference__Alternatives_2
            {
            pushFollow(FOLLOW_rule__TextReference__Alternatives_2_in_rule__TextReference__Group__2__Impl4109);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2044:1: rule__Words__Group__0 : rule__Words__Group__0__Impl rule__Words__Group__1 ;
    public final void rule__Words__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2048:1: ( rule__Words__Group__0__Impl rule__Words__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2049:2: rule__Words__Group__0__Impl rule__Words__Group__1
            {
            pushFollow(FOLLOW_rule__Words__Group__0__Impl_in_rule__Words__Group__04145);
            rule__Words__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Words__Group__1_in_rule__Words__Group__04148);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2056:1: rule__Words__Group__0__Impl : ( ( rule__Words__ValuesAssignment_0 ) ) ;
    public final void rule__Words__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2060:1: ( ( ( rule__Words__ValuesAssignment_0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2061:1: ( ( rule__Words__ValuesAssignment_0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2061:1: ( ( rule__Words__ValuesAssignment_0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2062:1: ( rule__Words__ValuesAssignment_0 )
            {
             before(grammarAccess.getWordsAccess().getValuesAssignment_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2063:1: ( rule__Words__ValuesAssignment_0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2063:2: rule__Words__ValuesAssignment_0
            {
            pushFollow(FOLLOW_rule__Words__ValuesAssignment_0_in_rule__Words__Group__0__Impl4175);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2073:1: rule__Words__Group__1 : rule__Words__Group__1__Impl ;
    public final void rule__Words__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2077:1: ( rule__Words__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2078:2: rule__Words__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Words__Group__1__Impl_in_rule__Words__Group__14205);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2084:1: rule__Words__Group__1__Impl : ( ( ( rule__Words__ValuesAssignment_1 ) ) ( ( rule__Words__ValuesAssignment_1 )* ) ) ;
    public final void rule__Words__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2088:1: ( ( ( ( rule__Words__ValuesAssignment_1 ) ) ( ( rule__Words__ValuesAssignment_1 )* ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2089:1: ( ( ( rule__Words__ValuesAssignment_1 ) ) ( ( rule__Words__ValuesAssignment_1 )* ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2089:1: ( ( ( rule__Words__ValuesAssignment_1 ) ) ( ( rule__Words__ValuesAssignment_1 )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2090:1: ( ( rule__Words__ValuesAssignment_1 ) ) ( ( rule__Words__ValuesAssignment_1 )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2090:1: ( ( rule__Words__ValuesAssignment_1 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2091:1: ( rule__Words__ValuesAssignment_1 )
            {
             before(grammarAccess.getWordsAccess().getValuesAssignment_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2092:1: ( rule__Words__ValuesAssignment_1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2092:2: rule__Words__ValuesAssignment_1
            {
            pushFollow(FOLLOW_rule__Words__ValuesAssignment_1_in_rule__Words__Group__1__Impl4234);
            rule__Words__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWordsAccess().getValuesAssignment_1()); 

            }

            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2095:1: ( ( rule__Words__ValuesAssignment_1 )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2096:1: ( rule__Words__ValuesAssignment_1 )*
            {
             before(grammarAccess.getWordsAccess().getValuesAssignment_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2097:1: ( rule__Words__ValuesAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2097:2: rule__Words__ValuesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Words__ValuesAssignment_1_in_rule__Words__Group__1__Impl4246);
            	    rule__Words__ValuesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2112:1: rule__TagReference__Group__0 : rule__TagReference__Group__0__Impl rule__TagReference__Group__1 ;
    public final void rule__TagReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2116:1: ( rule__TagReference__Group__0__Impl rule__TagReference__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2117:2: rule__TagReference__Group__0__Impl rule__TagReference__Group__1
            {
            pushFollow(FOLLOW_rule__TagReference__Group__0__Impl_in_rule__TagReference__Group__04283);
            rule__TagReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TagReference__Group__1_in_rule__TagReference__Group__04286);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2124:1: rule__TagReference__Group__0__Impl : ( '@' ) ;
    public final void rule__TagReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2128:1: ( ( '@' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2129:1: ( '@' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2129:1: ( '@' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2130:1: '@'
            {
             before(grammarAccess.getTagReferenceAccess().getCommercialAtKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__TagReference__Group__0__Impl4314); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2143:1: rule__TagReference__Group__1 : rule__TagReference__Group__1__Impl ;
    public final void rule__TagReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2147:1: ( rule__TagReference__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2148:2: rule__TagReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TagReference__Group__1__Impl_in_rule__TagReference__Group__14345);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2154:1: rule__TagReference__Group__1__Impl : ( ( rule__TagReference__ValueAssignment_1 ) ) ;
    public final void rule__TagReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2158:1: ( ( ( rule__TagReference__ValueAssignment_1 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2159:1: ( ( rule__TagReference__ValueAssignment_1 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2159:1: ( ( rule__TagReference__ValueAssignment_1 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2160:1: ( rule__TagReference__ValueAssignment_1 )
            {
             before(grammarAccess.getTagReferenceAccess().getValueAssignment_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2161:1: ( rule__TagReference__ValueAssignment_1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2161:2: rule__TagReference__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__TagReference__ValueAssignment_1_in_rule__TagReference__Group__1__Impl4372);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2176:1: rule__Query__ExpressionAssignment_1 : ( ruleOrExpr ) ;
    public final void rule__Query__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2180:1: ( ( ruleOrExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2181:1: ( ruleOrExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2181:1: ( ruleOrExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2182:1: ruleOrExpr
            {
             before(grammarAccess.getQueryAccess().getExpressionOrExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleOrExpr_in_rule__Query__ExpressionAssignment_14411);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2191:1: rule__OrExpr__RightAssignment_1_2 : ( ruleAndExpr ) ;
    public final void rule__OrExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2195:1: ( ( ruleAndExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2196:1: ( ruleAndExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2196:1: ( ruleAndExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2197:1: ruleAndExpr
            {
             before(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAndExpr_in_rule__OrExpr__RightAssignment_1_24442);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2206:1: rule__AndExpr__RightAssignment_1_2 : ( ruleCompEqExpr ) ;
    public final void rule__AndExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2210:1: ( ( ruleCompEqExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2211:1: ( ruleCompEqExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2211:1: ( ruleCompEqExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2212:1: ruleCompEqExpr
            {
             before(grammarAccess.getAndExprAccess().getRightCompEqExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleCompEqExpr_in_rule__AndExpr__RightAssignment_1_24473);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2221:1: rule__CompEqExpr__OperatorAssignment_1_1 : ( ruleCompEqOperator ) ;
    public final void rule__CompEqExpr__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2225:1: ( ( ruleCompEqOperator ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2226:1: ( ruleCompEqOperator )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2226:1: ( ruleCompEqOperator )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2227:1: ruleCompEqOperator
            {
             before(grammarAccess.getCompEqExprAccess().getOperatorCompEqOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleCompEqOperator_in_rule__CompEqExpr__OperatorAssignment_1_14504);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2236:1: rule__CompEqExpr__RightAssignment_1_2 : ( ruleCompExpr ) ;
    public final void rule__CompEqExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2240:1: ( ( ruleCompExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2241:1: ( ruleCompExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2241:1: ( ruleCompExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2242:1: ruleCompExpr
            {
             before(grammarAccess.getCompEqExprAccess().getRightCompExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleCompExpr_in_rule__CompEqExpr__RightAssignment_1_24535);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2251:1: rule__CompExpr__OperatorAssignment_1_1 : ( ruleCompOperator ) ;
    public final void rule__CompExpr__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2255:1: ( ( ruleCompOperator ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2256:1: ( ruleCompOperator )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2256:1: ( ruleCompOperator )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2257:1: ruleCompOperator
            {
             before(grammarAccess.getCompExprAccess().getOperatorCompOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleCompOperator_in_rule__CompExpr__OperatorAssignment_1_14566);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2266:1: rule__CompExpr__RightAssignment_1_2 : ( ruleUnaryExpr ) ;
    public final void rule__CompExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2270:1: ( ( ruleUnaryExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2271:1: ( ruleUnaryExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2271:1: ( ruleUnaryExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2272:1: ruleUnaryExpr
            {
             before(grammarAccess.getCompExprAccess().getRightUnaryExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_rule__CompExpr__RightAssignment_1_24597);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2281:1: rule__UnaryExpr__ExprAssignment_1_2 : ( ruleUnaryExpr ) ;
    public final void rule__UnaryExpr__ExprAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2285:1: ( ( ruleUnaryExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2286:1: ( ruleUnaryExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2286:1: ( ruleUnaryExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2287:1: ruleUnaryExpr
            {
             before(grammarAccess.getUnaryExprAccess().getExprUnaryExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_rule__UnaryExpr__ExprAssignment_1_24628);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2296:1: rule__ParenExpr__ExprAssignment_2 : ( ruleOrExpr ) ;
    public final void rule__ParenExpr__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2300:1: ( ( ruleOrExpr ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2301:1: ( ruleOrExpr )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2301:1: ( ruleOrExpr )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2302:1: ruleOrExpr
            {
             before(grammarAccess.getParenExprAccess().getExprOrExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleOrExpr_in_rule__ParenExpr__ExprAssignment_24659);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2311:1: rule__ProjectReference__ValueAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__ProjectReference__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2315:1: ( ( RULE_ID ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2316:1: ( RULE_ID )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2316:1: ( RULE_ID )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2317:1: RULE_ID
            {
             before(grammarAccess.getProjectReferenceAccess().getValueIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProjectReference__ValueAssignment_2_04690); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2326:1: rule__ProjectReference__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__ProjectReference__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2330:1: ( ( RULE_STRING ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2331:1: ( RULE_STRING )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2331:1: ( RULE_STRING )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2332:1: RULE_STRING
            {
             before(grammarAccess.getProjectReferenceAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ProjectReference__ValueAssignment_2_14721); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2341:1: rule__TaskReference__ValueAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__TaskReference__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2345:1: ( ( RULE_ID ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2346:1: ( RULE_ID )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2346:1: ( RULE_ID )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2347:1: RULE_ID
            {
             before(grammarAccess.getTaskReferenceAccess().getValueIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TaskReference__ValueAssignment_2_04752); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2356:1: rule__TaskReference__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__TaskReference__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2360:1: ( ( RULE_STRING ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2361:1: ( RULE_STRING )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2361:1: ( RULE_STRING )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2362:1: RULE_STRING
            {
             before(grammarAccess.getTaskReferenceAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TaskReference__ValueAssignment_2_14783); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2371:1: rule__TextReference__ValueAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__TextReference__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2375:1: ( ( RULE_ID ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2376:1: ( RULE_ID )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2376:1: ( RULE_ID )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2377:1: RULE_ID
            {
             before(grammarAccess.getTextReferenceAccess().getValueIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TextReference__ValueAssignment_2_04814); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2386:1: rule__TextReference__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__TextReference__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2390:1: ( ( RULE_STRING ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2391:1: ( RULE_STRING )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2391:1: ( RULE_STRING )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2392:1: RULE_STRING
            {
             before(grammarAccess.getTextReferenceAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextReference__ValueAssignment_2_14845); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2401:1: rule__Words__ValuesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Words__ValuesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2405:1: ( ( RULE_ID ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2406:1: ( RULE_ID )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2406:1: ( RULE_ID )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2407:1: RULE_ID
            {
             before(grammarAccess.getWordsAccess().getValuesIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Words__ValuesAssignment_04876); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2416:1: rule__Words__ValuesAssignment_1 : ( RULE_ID ) ;
    public final void rule__Words__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2420:1: ( ( RULE_ID ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2421:1: ( RULE_ID )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2421:1: ( RULE_ID )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2422:1: RULE_ID
            {
             before(grammarAccess.getWordsAccess().getValuesIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Words__ValuesAssignment_14907); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2431:1: rule__Word__ValueAssignment : ( RULE_ID ) ;
    public final void rule__Word__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2435:1: ( ( RULE_ID ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2436:1: ( RULE_ID )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2436:1: ( RULE_ID )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2437:1: RULE_ID
            {
             before(grammarAccess.getWordAccess().getValueIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Word__ValueAssignment4938); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2446:1: rule__Phrase__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__Phrase__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2450:1: ( ( RULE_STRING ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2451:1: ( RULE_STRING )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2451:1: ( RULE_STRING )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2452:1: RULE_STRING
            {
             before(grammarAccess.getPhraseAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Phrase__ValueAssignment4969); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2461:1: rule__TagReference__ValueAssignment_1 : ( RULE_ID ) ;
    public final void rule__TagReference__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2465:1: ( ( RULE_ID ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2466:1: ( RULE_ID )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2466:1: ( RULE_ID )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2467:1: RULE_ID
            {
             before(grammarAccess.getTagReferenceAccess().getValueIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TagReference__ValueAssignment_15000); 
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
    public static final BitSet FOLLOW_8_in_rule__OrExpr__Alternatives_1_11103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__OrExpr__Alternatives_1_11123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__AndExpr__Alternatives_1_11158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__AndExpr__Alternatives_1_11178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__UnaryExpr__Alternatives1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group_1__0_in_rule__UnaryExpr__Alternatives1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__UnaryExpr__Alternatives_1_11263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__UnaryExpr__Alternatives_1_11283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Atom__Alternatives1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWords_in_rule__Atom__Alternatives1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenExpr_in_rule__Atom__Alternatives1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectReference_in_rule__Value__Alternatives1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_rule__Value__Alternatives1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhrase_in_rule__Value__Alternatives1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagReference_in_rule__Value__Alternatives1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextReference_in_rule__Value__Alternatives1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskReference_in_rule__Value__Alternatives1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectReference__ValueAssignment_2_0_in_rule__ProjectReference__Alternatives_21500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectReference__ValueAssignment_2_1_in_rule__ProjectReference__Alternatives_21518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskReference__ValueAssignment_2_0_in_rule__TaskReference__Alternatives_21551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskReference__ValueAssignment_2_1_in_rule__TaskReference__Alternatives_21569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextReference__ValueAssignment_2_0_in_rule__TextReference__Alternatives_21602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextReference__ValueAssignment_2_1_in_rule__TextReference__Alternatives_21620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CompEqOperator__Alternatives1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CompEqOperator__Alternatives1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CompOperator__Alternatives1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CompOperator__Alternatives1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CompOperator__Alternatives1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CompOperator__Alternatives1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__01807 = new BitSet(new long[]{0x0000000007503030L});
    public static final BitSet FOLLOW_rule__Query__Group__1_in_rule__Query__Group__01810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__11868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ExpressionAssignment_1_in_rule__Query__Group__1__Impl1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group__0__Impl_in_rule__OrExpr__Group__01930 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_rule__OrExpr__Group__1_in_rule__OrExpr__Group__01933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_rule__OrExpr__Group__0__Impl1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group__1__Impl_in_rule__OrExpr__Group__11989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__0_in_rule__OrExpr__Group__1__Impl2016 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__0__Impl_in_rule__OrExpr__Group_1__02051 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__1_in_rule__OrExpr__Group_1__02054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__1__Impl_in_rule__OrExpr__Group_1__12112 = new BitSet(new long[]{0x0000000007503030L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__2_in_rule__OrExpr__Group_1__12115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Alternatives_1_1_in_rule__OrExpr__Group_1__1__Impl2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__2__Impl_in_rule__OrExpr__Group_1__22172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__RightAssignment_1_2_in_rule__OrExpr__Group_1__2__Impl2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__0__Impl_in_rule__AndExpr__Group__02235 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__1_in_rule__AndExpr__Group__02238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompEqExpr_in_rule__AndExpr__Group__0__Impl2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__1__Impl_in_rule__AndExpr__Group__12294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__0_in_rule__AndExpr__Group__1__Impl2321 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__0__Impl_in_rule__AndExpr__Group_1__02356 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__1_in_rule__AndExpr__Group_1__02359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__1__Impl_in_rule__AndExpr__Group_1__12417 = new BitSet(new long[]{0x0000000007503030L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__2_in_rule__AndExpr__Group_1__12420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Alternatives_1_1_in_rule__AndExpr__Group_1__1__Impl2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__2__Impl_in_rule__AndExpr__Group_1__22477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__RightAssignment_1_2_in_rule__AndExpr__Group_1__2__Impl2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group__0__Impl_in_rule__CompEqExpr__Group__02540 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group__1_in_rule__CompEqExpr__Group__02543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompExpr_in_rule__CompEqExpr__Group__0__Impl2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group__1__Impl_in_rule__CompEqExpr__Group__12599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group_1__0_in_rule__CompEqExpr__Group__1__Impl2626 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group_1__0__Impl_in_rule__CompEqExpr__Group_1__02661 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group_1__1_in_rule__CompEqExpr__Group_1__02664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group_1__1__Impl_in_rule__CompEqExpr__Group_1__12722 = new BitSet(new long[]{0x0000000007503030L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group_1__2_in_rule__CompEqExpr__Group_1__12725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompEqExpr__OperatorAssignment_1_1_in_rule__CompEqExpr__Group_1__1__Impl2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompEqExpr__Group_1__2__Impl_in_rule__CompEqExpr__Group_1__22782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompEqExpr__RightAssignment_1_2_in_rule__CompEqExpr__Group_1__2__Impl2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompExpr__Group__0__Impl_in_rule__CompExpr__Group__02845 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_rule__CompExpr__Group__1_in_rule__CompExpr__Group__02848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rule__CompExpr__Group__0__Impl2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompExpr__Group__1__Impl_in_rule__CompExpr__Group__12904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompExpr__Group_1__0_in_rule__CompExpr__Group__1__Impl2931 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_rule__CompExpr__Group_1__0__Impl_in_rule__CompExpr__Group_1__02966 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_rule__CompExpr__Group_1__1_in_rule__CompExpr__Group_1__02969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompExpr__Group_1__1__Impl_in_rule__CompExpr__Group_1__13027 = new BitSet(new long[]{0x0000000007503030L});
    public static final BitSet FOLLOW_rule__CompExpr__Group_1__2_in_rule__CompExpr__Group_1__13030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompExpr__OperatorAssignment_1_1_in_rule__CompExpr__Group_1__1__Impl3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompExpr__Group_1__2__Impl_in_rule__CompExpr__Group_1__23087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompExpr__RightAssignment_1_2_in_rule__CompExpr__Group_1__2__Impl3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group_1__0__Impl_in_rule__UnaryExpr__Group_1__03150 = new BitSet(new long[]{0x0000000007503030L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group_1__1_in_rule__UnaryExpr__Group_1__03153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group_1__1__Impl_in_rule__UnaryExpr__Group_1__13211 = new BitSet(new long[]{0x0000000007503030L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group_1__2_in_rule__UnaryExpr__Group_1__13214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Alternatives_1_1_in_rule__UnaryExpr__Group_1__1__Impl3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group_1__2__Impl_in_rule__UnaryExpr__Group_1__23271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__ExprAssignment_1_2_in_rule__UnaryExpr__Group_1__2__Impl3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenExpr__Group__0__Impl_in_rule__ParenExpr__Group__03334 = new BitSet(new long[]{0x0000000007503030L});
    public static final BitSet FOLLOW_rule__ParenExpr__Group__1_in_rule__ParenExpr__Group__03337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ParenExpr__Group__0__Impl3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenExpr__Group__1__Impl_in_rule__ParenExpr__Group__13396 = new BitSet(new long[]{0x0000000007503030L});
    public static final BitSet FOLLOW_rule__ParenExpr__Group__2_in_rule__ParenExpr__Group__13399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenExpr__Group__2__Impl_in_rule__ParenExpr__Group__23457 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ParenExpr__Group__3_in_rule__ParenExpr__Group__23460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenExpr__ExprAssignment_2_in_rule__ParenExpr__Group__2__Impl3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenExpr__Group__3__Impl_in_rule__ParenExpr__Group__33517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ParenExpr__Group__3__Impl3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectReference__Group__0__Impl_in_rule__ProjectReference__Group__03584 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ProjectReference__Group__1_in_rule__ProjectReference__Group__03587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ProjectReference__Group__0__Impl3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectReference__Group__1__Impl_in_rule__ProjectReference__Group__13646 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ProjectReference__Group__2_in_rule__ProjectReference__Group__13649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ProjectReference__Group__1__Impl3677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectReference__Group__2__Impl_in_rule__ProjectReference__Group__23708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectReference__Alternatives_2_in_rule__ProjectReference__Group__2__Impl3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskReference__Group__0__Impl_in_rule__TaskReference__Group__03771 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__TaskReference__Group__1_in_rule__TaskReference__Group__03774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TaskReference__Group__0__Impl3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskReference__Group__1__Impl_in_rule__TaskReference__Group__13833 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__TaskReference__Group__2_in_rule__TaskReference__Group__13836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TaskReference__Group__1__Impl3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskReference__Group__2__Impl_in_rule__TaskReference__Group__23895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskReference__Alternatives_2_in_rule__TaskReference__Group__2__Impl3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextReference__Group__0__Impl_in_rule__TextReference__Group__03958 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__TextReference__Group__1_in_rule__TextReference__Group__03961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TextReference__Group__0__Impl3989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextReference__Group__1__Impl_in_rule__TextReference__Group__14020 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__TextReference__Group__2_in_rule__TextReference__Group__14023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TextReference__Group__1__Impl4051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextReference__Group__2__Impl_in_rule__TextReference__Group__24082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextReference__Alternatives_2_in_rule__TextReference__Group__2__Impl4109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Words__Group__0__Impl_in_rule__Words__Group__04145 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Words__Group__1_in_rule__Words__Group__04148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Words__ValuesAssignment_0_in_rule__Words__Group__0__Impl4175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Words__Group__1__Impl_in_rule__Words__Group__14205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Words__ValuesAssignment_1_in_rule__Words__Group__1__Impl4234 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Words__ValuesAssignment_1_in_rule__Words__Group__1__Impl4246 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__TagReference__Group__0__Impl_in_rule__TagReference__Group__04283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TagReference__Group__1_in_rule__TagReference__Group__04286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TagReference__Group__0__Impl4314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagReference__Group__1__Impl_in_rule__TagReference__Group__14345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagReference__ValueAssignment_1_in_rule__TagReference__Group__1__Impl4372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_rule__Query__ExpressionAssignment_14411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_rule__OrExpr__RightAssignment_1_24442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompEqExpr_in_rule__AndExpr__RightAssignment_1_24473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompEqOperator_in_rule__CompEqExpr__OperatorAssignment_1_14504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompExpr_in_rule__CompEqExpr__RightAssignment_1_24535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompOperator_in_rule__CompExpr__OperatorAssignment_1_14566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rule__CompExpr__RightAssignment_1_24597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rule__UnaryExpr__ExprAssignment_1_24628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_rule__ParenExpr__ExprAssignment_24659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProjectReference__ValueAssignment_2_04690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ProjectReference__ValueAssignment_2_14721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TaskReference__ValueAssignment_2_04752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TaskReference__ValueAssignment_2_14783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TextReference__ValueAssignment_2_04814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextReference__ValueAssignment_2_14845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Words__ValuesAssignment_04876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Words__ValuesAssignment_14907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Word__ValueAssignment4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Phrase__ValueAssignment4969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TagReference__ValueAssignment_15000 = new BitSet(new long[]{0x0000000000000002L});

}