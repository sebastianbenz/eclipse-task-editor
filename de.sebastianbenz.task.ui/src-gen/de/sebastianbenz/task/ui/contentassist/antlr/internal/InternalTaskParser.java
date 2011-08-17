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
import de.sebastianbenz.task.services.TaskGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTaskParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TAB", "RULE_SPACE", "RULE_NL", "RULE_TASK_TEXT", "RULE_TEXT", "RULE_PROJECT_", "RULE_CODE_", "RULE_HYPHEN", "RULE_COLON"
    };
    public static final int RULE_COLON=12;
    public static final int RULE_CODE_=10;
    public static final int RULE_HYPHEN=11;
    public static final int RULE_PROJECT_=9;
    public static final int RULE_NL=6;
    public static final int RULE_TAB=4;
    public static final int RULE_TASK_TEXT=7;
    public static final int RULE_TEXT=8;
    public static final int EOF=-1;
    public static final int RULE_SPACE=5;

    // delegates
    // delegators


        public InternalTaskParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTaskParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTaskParser.tokenNames; }
    public String getGrammarFileName() { return "../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g"; }


     
     	private TaskGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(TaskGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleTaskModel"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:61:1: entryRuleTaskModel : ruleTaskModel EOF ;
    public final void entryRuleTaskModel() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:62:1: ( ruleTaskModel EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:63:1: ruleTaskModel EOF
            {
             before(grammarAccess.getTaskModelRule()); 
            pushFollow(FOLLOW_ruleTaskModel_in_entryRuleTaskModel61);
            ruleTaskModel();

            state._fsp--;

             after(grammarAccess.getTaskModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaskModel68); 

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
    // $ANTLR end "entryRuleTaskModel"


    // $ANTLR start "ruleTaskModel"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:70:1: ruleTaskModel : ( ( rule__TaskModel__Group__0 ) ) ;
    public final void ruleTaskModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:74:2: ( ( ( rule__TaskModel__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:75:1: ( ( rule__TaskModel__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:75:1: ( ( rule__TaskModel__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:76:1: ( rule__TaskModel__Group__0 )
            {
             before(grammarAccess.getTaskModelAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:77:1: ( rule__TaskModel__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:77:2: rule__TaskModel__Group__0
            {
            pushFollow(FOLLOW_rule__TaskModel__Group__0_in_ruleTaskModel94);
            rule__TaskModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTaskModel"


    // $ANTLR start "entryRuleContent"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:89:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:90:1: ( ruleContent EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:91:1: ruleContent EOF
            {
             before(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_ruleContent_in_entryRuleContent121);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getContentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContent128); 

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
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:98:1: ruleContent : ( ( rule__Content__Alternatives ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:102:2: ( ( ( rule__Content__Alternatives ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:103:1: ( ( rule__Content__Alternatives ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:103:1: ( ( rule__Content__Alternatives ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:104:1: ( rule__Content__Alternatives )
            {
             before(grammarAccess.getContentAccess().getAlternatives()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:105:1: ( rule__Content__Alternatives )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:105:2: rule__Content__Alternatives
            {
            pushFollow(FOLLOW_rule__Content__Alternatives_in_ruleContent154);
            rule__Content__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleTask"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:117:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:118:1: ( ruleTask EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:119:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask181);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask188); 

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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:126:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:130:2: ( ( ( rule__Task__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:131:1: ( ( rule__Task__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:131:1: ( ( rule__Task__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:132:1: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:133:1: ( rule__Task__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:133:2: rule__Task__Group__0
            {
            pushFollow(FOLLOW_rule__Task__Group__0_in_ruleTask214);
            rule__Task__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleNote"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:145:1: entryRuleNote : ruleNote EOF ;
    public final void entryRuleNote() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:146:1: ( ruleNote EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:147:1: ruleNote EOF
            {
             before(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_ruleNote_in_entryRuleNote241);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getNoteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNote248); 

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
    // $ANTLR end "entryRuleNote"


    // $ANTLR start "ruleNote"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:154:1: ruleNote : ( ( rule__Note__Group__0 ) ) ;
    public final void ruleNote() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:158:2: ( ( ( rule__Note__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:159:1: ( ( rule__Note__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:159:1: ( ( rule__Note__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:160:1: ( rule__Note__Group__0 )
            {
             before(grammarAccess.getNoteAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:161:1: ( rule__Note__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:161:2: rule__Note__Group__0
            {
            pushFollow(FOLLOW_rule__Note__Group__0_in_ruleNote274);
            rule__Note__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNote"


    // $ANTLR start "entryRuleProject"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:173:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:174:1: ( ruleProject EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:175:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_ruleProject_in_entryRuleProject301);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProject308); 

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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:182:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:186:2: ( ( ( rule__Project__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:187:1: ( ( rule__Project__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:187:1: ( ( rule__Project__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:188:1: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:189:1: ( rule__Project__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:189:2: rule__Project__Group__0
            {
            pushFollow(FOLLOW_rule__Project__Group__0_in_ruleProject334);
            rule__Project__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleCode"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:201:1: entryRuleCode : ruleCode EOF ;
    public final void entryRuleCode() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:202:1: ( ruleCode EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:203:1: ruleCode EOF
            {
             before(grammarAccess.getCodeRule()); 
            pushFollow(FOLLOW_ruleCode_in_entryRuleCode361);
            ruleCode();

            state._fsp--;

             after(grammarAccess.getCodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCode368); 

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
    // $ANTLR end "entryRuleCode"


    // $ANTLR start "ruleCode"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:210:1: ruleCode : ( ( rule__Code__Group__0 ) ) ;
    public final void ruleCode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:214:2: ( ( ( rule__Code__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:215:1: ( ( rule__Code__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:215:1: ( ( rule__Code__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:216:1: ( rule__Code__Group__0 )
            {
             before(grammarAccess.getCodeAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:217:1: ( rule__Code__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:217:2: rule__Code__Group__0
            {
            pushFollow(FOLLOW_rule__Code__Group__0_in_ruleCode394);
            rule__Code__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCode"


    // $ANTLR start "entryRuleIntendation"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:229:1: entryRuleIntendation : ruleIntendation EOF ;
    public final void entryRuleIntendation() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:230:1: ( ruleIntendation EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:231:1: ruleIntendation EOF
            {
             before(grammarAccess.getIntendationRule()); 
            pushFollow(FOLLOW_ruleIntendation_in_entryRuleIntendation421);
            ruleIntendation();

            state._fsp--;

             after(grammarAccess.getIntendationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntendation428); 

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
    // $ANTLR end "entryRuleIntendation"


    // $ANTLR start "ruleIntendation"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:238:1: ruleIntendation : ( ( rule__Intendation__Group__0 ) ) ;
    public final void ruleIntendation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:242:2: ( ( ( rule__Intendation__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:243:1: ( ( rule__Intendation__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:243:1: ( ( rule__Intendation__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:244:1: ( rule__Intendation__Group__0 )
            {
             before(grammarAccess.getIntendationAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:245:1: ( rule__Intendation__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:245:2: rule__Intendation__Group__0
            {
            pushFollow(FOLLOW_rule__Intendation__Group__0_in_ruleIntendation454);
            rule__Intendation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntendationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntendation"


    // $ANTLR start "entryRuleEmptyLine"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:257:1: entryRuleEmptyLine : ruleEmptyLine EOF ;
    public final void entryRuleEmptyLine() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:258:1: ( ruleEmptyLine EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:259:1: ruleEmptyLine EOF
            {
             before(grammarAccess.getEmptyLineRule()); 
            pushFollow(FOLLOW_ruleEmptyLine_in_entryRuleEmptyLine481);
            ruleEmptyLine();

            state._fsp--;

             after(grammarAccess.getEmptyLineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmptyLine488); 

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
    // $ANTLR end "entryRuleEmptyLine"


    // $ANTLR start "ruleEmptyLine"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:266:1: ruleEmptyLine : ( ( rule__EmptyLine__TextAssignment ) ) ;
    public final void ruleEmptyLine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:270:2: ( ( ( rule__EmptyLine__TextAssignment ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:271:1: ( ( rule__EmptyLine__TextAssignment ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:271:1: ( ( rule__EmptyLine__TextAssignment ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:272:1: ( rule__EmptyLine__TextAssignment )
            {
             before(grammarAccess.getEmptyLineAccess().getTextAssignment()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:273:1: ( rule__EmptyLine__TextAssignment )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:273:2: rule__EmptyLine__TextAssignment
            {
            pushFollow(FOLLOW_rule__EmptyLine__TextAssignment_in_ruleEmptyLine514);
            rule__EmptyLine__TextAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEmptyLineAccess().getTextAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmptyLine"


    // $ANTLR start "entryRuleSpaces"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:285:1: entryRuleSpaces : ruleSpaces EOF ;
    public final void entryRuleSpaces() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:286:1: ( ruleSpaces EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:287:1: ruleSpaces EOF
            {
             before(grammarAccess.getSpacesRule()); 
            pushFollow(FOLLOW_ruleSpaces_in_entryRuleSpaces541);
            ruleSpaces();

            state._fsp--;

             after(grammarAccess.getSpacesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpaces548); 

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
    // $ANTLR end "entryRuleSpaces"


    // $ANTLR start "ruleSpaces"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:294:1: ruleSpaces : ( ( rule__Spaces__Group__0 ) ) ;
    public final void ruleSpaces() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:298:2: ( ( ( rule__Spaces__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:299:1: ( ( rule__Spaces__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:299:1: ( ( rule__Spaces__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:300:1: ( rule__Spaces__Group__0 )
            {
             before(grammarAccess.getSpacesAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:301:1: ( rule__Spaces__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:301:2: rule__Spaces__Group__0
            {
            pushFollow(FOLLOW_rule__Spaces__Group__0_in_ruleSpaces574);
            rule__Spaces__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpacesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpaces"


    // $ANTLR start "entryRuleWs"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:313:1: entryRuleWs : ruleWs EOF ;
    public final void entryRuleWs() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:314:1: ( ruleWs EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:315:1: ruleWs EOF
            {
             before(grammarAccess.getWsRule()); 
            pushFollow(FOLLOW_ruleWs_in_entryRuleWs601);
            ruleWs();

            state._fsp--;

             after(grammarAccess.getWsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWs608); 

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
    // $ANTLR end "entryRuleWs"


    // $ANTLR start "ruleWs"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:322:1: ruleWs : ( ( rule__Ws__Alternatives ) ) ;
    public final void ruleWs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:326:2: ( ( ( rule__Ws__Alternatives ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:327:1: ( ( rule__Ws__Alternatives ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:327:1: ( ( rule__Ws__Alternatives ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:328:1: ( rule__Ws__Alternatives )
            {
             before(grammarAccess.getWsAccess().getAlternatives()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:329:1: ( rule__Ws__Alternatives )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:329:2: rule__Ws__Alternatives
            {
            pushFollow(FOLLOW_rule__Ws__Alternatives_in_ruleWs634);
            rule__Ws__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWs"


    // $ANTLR start "rule__Content__Alternatives"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:341:1: rule__Content__Alternatives : ( ( ruleProject ) | ( ruleTask ) | ( ruleNote ) | ( ruleEmptyLine ) | ( ruleCode ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:345:1: ( ( ruleProject ) | ( ruleTask ) | ( ruleNote ) | ( ruleEmptyLine ) | ( ruleCode ) )
            int alt1=5;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:346:1: ( ruleProject )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:346:1: ( ruleProject )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:347:1: ruleProject
                    {
                     before(grammarAccess.getContentAccess().getProjectParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleProject_in_rule__Content__Alternatives670);
                    ruleProject();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getProjectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:352:6: ( ruleTask )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:352:6: ( ruleTask )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:353:1: ruleTask
                    {
                     before(grammarAccess.getContentAccess().getTaskParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTask_in_rule__Content__Alternatives687);
                    ruleTask();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getTaskParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:358:6: ( ruleNote )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:358:6: ( ruleNote )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:359:1: ruleNote
                    {
                     before(grammarAccess.getContentAccess().getNoteParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNote_in_rule__Content__Alternatives704);
                    ruleNote();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getNoteParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:364:6: ( ruleEmptyLine )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:364:6: ( ruleEmptyLine )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:365:1: ruleEmptyLine
                    {
                     before(grammarAccess.getContentAccess().getEmptyLineParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleEmptyLine_in_rule__Content__Alternatives721);
                    ruleEmptyLine();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getEmptyLineParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:370:6: ( ruleCode )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:370:6: ( ruleCode )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:371:1: ruleCode
                    {
                     before(grammarAccess.getContentAccess().getCodeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleCode_in_rule__Content__Alternatives738);
                    ruleCode();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getCodeParserRuleCall_4()); 

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
    // $ANTLR end "rule__Content__Alternatives"


    // $ANTLR start "rule__Intendation__Alternatives_0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:381:1: rule__Intendation__Alternatives_0 : ( ( ( rule__Intendation__Group_0_0__0 ) ) | ( RULE_TAB ) );
    public final void rule__Intendation__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:385:1: ( ( ( rule__Intendation__Group_0_0__0 ) ) | ( RULE_TAB ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_SPACE) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_TAB) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:386:1: ( ( rule__Intendation__Group_0_0__0 ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:386:1: ( ( rule__Intendation__Group_0_0__0 ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:387:1: ( rule__Intendation__Group_0_0__0 )
                    {
                     before(grammarAccess.getIntendationAccess().getGroup_0_0()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:388:1: ( rule__Intendation__Group_0_0__0 )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:388:2: rule__Intendation__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Intendation__Group_0_0__0_in_rule__Intendation__Alternatives_0770);
                    rule__Intendation__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntendationAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:392:6: ( RULE_TAB )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:392:6: ( RULE_TAB )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:393:1: RULE_TAB
                    {
                     before(grammarAccess.getIntendationAccess().getTABTerminalRuleCall_0_1()); 
                    match(input,RULE_TAB,FOLLOW_RULE_TAB_in_rule__Intendation__Alternatives_0788); 
                     after(grammarAccess.getIntendationAccess().getTABTerminalRuleCall_0_1()); 

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
    // $ANTLR end "rule__Intendation__Alternatives_0"


    // $ANTLR start "rule__Ws__Alternatives"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:403:1: rule__Ws__Alternatives : ( ( RULE_SPACE ) | ( RULE_TAB ) );
    public final void rule__Ws__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:407:1: ( ( RULE_SPACE ) | ( RULE_TAB ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_SPACE) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_TAB) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:408:1: ( RULE_SPACE )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:408:1: ( RULE_SPACE )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:409:1: RULE_SPACE
                    {
                     before(grammarAccess.getWsAccess().getSPACETerminalRuleCall_0()); 
                    match(input,RULE_SPACE,FOLLOW_RULE_SPACE_in_rule__Ws__Alternatives820); 
                     after(grammarAccess.getWsAccess().getSPACETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:414:6: ( RULE_TAB )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:414:6: ( RULE_TAB )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:415:1: RULE_TAB
                    {
                     before(grammarAccess.getWsAccess().getTABTerminalRuleCall_1()); 
                    match(input,RULE_TAB,FOLLOW_RULE_TAB_in_rule__Ws__Alternatives837); 
                     after(grammarAccess.getWsAccess().getTABTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Ws__Alternatives"


    // $ANTLR start "rule__TaskModel__Group__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:427:1: rule__TaskModel__Group__0 : rule__TaskModel__Group__0__Impl rule__TaskModel__Group__1 ;
    public final void rule__TaskModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:431:1: ( rule__TaskModel__Group__0__Impl rule__TaskModel__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:432:2: rule__TaskModel__Group__0__Impl rule__TaskModel__Group__1
            {
            pushFollow(FOLLOW_rule__TaskModel__Group__0__Impl_in_rule__TaskModel__Group__0867);
            rule__TaskModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TaskModel__Group__1_in_rule__TaskModel__Group__0870);
            rule__TaskModel__Group__1();

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
    // $ANTLR end "rule__TaskModel__Group__0"


    // $ANTLR start "rule__TaskModel__Group__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:439:1: rule__TaskModel__Group__0__Impl : ( () ) ;
    public final void rule__TaskModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:443:1: ( ( () ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:444:1: ( () )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:444:1: ( () )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:445:1: ()
            {
             before(grammarAccess.getTaskModelAccess().getTaskModelAction_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:446:1: ()
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:448:1: 
            {
            }

             after(grammarAccess.getTaskModelAccess().getTaskModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskModel__Group__0__Impl"


    // $ANTLR start "rule__TaskModel__Group__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:458:1: rule__TaskModel__Group__1 : rule__TaskModel__Group__1__Impl rule__TaskModel__Group__2 ;
    public final void rule__TaskModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:462:1: ( rule__TaskModel__Group__1__Impl rule__TaskModel__Group__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:463:2: rule__TaskModel__Group__1__Impl rule__TaskModel__Group__2
            {
            pushFollow(FOLLOW_rule__TaskModel__Group__1__Impl_in_rule__TaskModel__Group__1928);
            rule__TaskModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TaskModel__Group__2_in_rule__TaskModel__Group__1931);
            rule__TaskModel__Group__2();

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
    // $ANTLR end "rule__TaskModel__Group__1"


    // $ANTLR start "rule__TaskModel__Group__1__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:470:1: rule__TaskModel__Group__1__Impl : ( ( rule__TaskModel__ContentsAssignment_1 )* ) ;
    public final void rule__TaskModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:474:1: ( ( ( rule__TaskModel__ContentsAssignment_1 )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:475:1: ( ( rule__TaskModel__ContentsAssignment_1 )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:475:1: ( ( rule__TaskModel__ContentsAssignment_1 )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:476:1: ( rule__TaskModel__ContentsAssignment_1 )*
            {
             before(grammarAccess.getTaskModelAccess().getContentsAssignment_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:477:1: ( rule__TaskModel__ContentsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:477:2: rule__TaskModel__ContentsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__TaskModel__ContentsAssignment_1_in_rule__TaskModel__Group__1__Impl958);
            	    rule__TaskModel__ContentsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTaskModelAccess().getContentsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskModel__Group__1__Impl"


    // $ANTLR start "rule__TaskModel__Group__2"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:487:1: rule__TaskModel__Group__2 : rule__TaskModel__Group__2__Impl ;
    public final void rule__TaskModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:491:1: ( rule__TaskModel__Group__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:492:2: rule__TaskModel__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TaskModel__Group__2__Impl_in_rule__TaskModel__Group__2989);
            rule__TaskModel__Group__2__Impl();

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
    // $ANTLR end "rule__TaskModel__Group__2"


    // $ANTLR start "rule__TaskModel__Group__2__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:498:1: rule__TaskModel__Group__2__Impl : ( ( ruleWs )* ) ;
    public final void rule__TaskModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:502:1: ( ( ( ruleWs )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:503:1: ( ( ruleWs )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:503:1: ( ( ruleWs )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:504:1: ( ruleWs )*
            {
             before(grammarAccess.getTaskModelAccess().getWsParserRuleCall_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:505:1: ( ruleWs )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_TAB && LA5_0<=RULE_SPACE)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:505:3: ruleWs
            	    {
            	    pushFollow(FOLLOW_ruleWs_in_rule__TaskModel__Group__2__Impl1017);
            	    ruleWs();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getTaskModelAccess().getWsParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskModel__Group__2__Impl"


    // $ANTLR start "rule__Task__Group__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:521:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:525:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:526:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_rule__Task__Group__0__Impl_in_rule__Task__Group__01054);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__1_in_rule__Task__Group__01057);
            rule__Task__Group__1();

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
    // $ANTLR end "rule__Task__Group__0"


    // $ANTLR start "rule__Task__Group__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:533:1: rule__Task__Group__0__Impl : ( ( rule__Task__IntendAssignment_0 ) ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:537:1: ( ( ( rule__Task__IntendAssignment_0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:538:1: ( ( rule__Task__IntendAssignment_0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:538:1: ( ( rule__Task__IntendAssignment_0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:539:1: ( rule__Task__IntendAssignment_0 )
            {
             before(grammarAccess.getTaskAccess().getIntendAssignment_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:540:1: ( rule__Task__IntendAssignment_0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:540:2: rule__Task__IntendAssignment_0
            {
            pushFollow(FOLLOW_rule__Task__IntendAssignment_0_in_rule__Task__Group__0__Impl1084);
            rule__Task__IntendAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getIntendAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:550:1: rule__Task__Group__1 : rule__Task__Group__1__Impl ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:554:1: ( rule__Task__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:555:2: rule__Task__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Task__Group__1__Impl_in_rule__Task__Group__11114);
            rule__Task__Group__1__Impl();

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
    // $ANTLR end "rule__Task__Group__1"


    // $ANTLR start "rule__Task__Group__1__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:561:1: rule__Task__Group__1__Impl : ( ( rule__Task__TextAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:565:1: ( ( ( rule__Task__TextAssignment_1 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:566:1: ( ( rule__Task__TextAssignment_1 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:566:1: ( ( rule__Task__TextAssignment_1 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:567:1: ( rule__Task__TextAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getTextAssignment_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:568:1: ( rule__Task__TextAssignment_1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:568:2: rule__Task__TextAssignment_1
            {
            pushFollow(FOLLOW_rule__Task__TextAssignment_1_in_rule__Task__Group__1__Impl1141);
            rule__Task__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Note__Group__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:582:1: rule__Note__Group__0 : rule__Note__Group__0__Impl rule__Note__Group__1 ;
    public final void rule__Note__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:586:1: ( rule__Note__Group__0__Impl rule__Note__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:587:2: rule__Note__Group__0__Impl rule__Note__Group__1
            {
            pushFollow(FOLLOW_rule__Note__Group__0__Impl_in_rule__Note__Group__01175);
            rule__Note__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__1_in_rule__Note__Group__01178);
            rule__Note__Group__1();

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
    // $ANTLR end "rule__Note__Group__0"


    // $ANTLR start "rule__Note__Group__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:594:1: rule__Note__Group__0__Impl : ( ( rule__Note__IntendAssignment_0 ) ) ;
    public final void rule__Note__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:598:1: ( ( ( rule__Note__IntendAssignment_0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:599:1: ( ( rule__Note__IntendAssignment_0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:599:1: ( ( rule__Note__IntendAssignment_0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:600:1: ( rule__Note__IntendAssignment_0 )
            {
             before(grammarAccess.getNoteAccess().getIntendAssignment_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:601:1: ( rule__Note__IntendAssignment_0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:601:2: rule__Note__IntendAssignment_0
            {
            pushFollow(FOLLOW_rule__Note__IntendAssignment_0_in_rule__Note__Group__0__Impl1205);
            rule__Note__IntendAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getIntendAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__0__Impl"


    // $ANTLR start "rule__Note__Group__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:611:1: rule__Note__Group__1 : rule__Note__Group__1__Impl ;
    public final void rule__Note__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:615:1: ( rule__Note__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:616:2: rule__Note__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Note__Group__1__Impl_in_rule__Note__Group__11235);
            rule__Note__Group__1__Impl();

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
    // $ANTLR end "rule__Note__Group__1"


    // $ANTLR start "rule__Note__Group__1__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:622:1: rule__Note__Group__1__Impl : ( ( rule__Note__TextAssignment_1 ) ) ;
    public final void rule__Note__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:626:1: ( ( ( rule__Note__TextAssignment_1 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:627:1: ( ( rule__Note__TextAssignment_1 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:627:1: ( ( rule__Note__TextAssignment_1 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:628:1: ( rule__Note__TextAssignment_1 )
            {
             before(grammarAccess.getNoteAccess().getTextAssignment_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:629:1: ( rule__Note__TextAssignment_1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:629:2: rule__Note__TextAssignment_1
            {
            pushFollow(FOLLOW_rule__Note__TextAssignment_1_in_rule__Note__Group__1__Impl1262);
            rule__Note__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__1__Impl"


    // $ANTLR start "rule__Project__Group__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:643:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:647:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:648:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FOLLOW_rule__Project__Group__0__Impl_in_rule__Project__Group__01296);
            rule__Project__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__1_in_rule__Project__Group__01299);
            rule__Project__Group__1();

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
    // $ANTLR end "rule__Project__Group__0"


    // $ANTLR start "rule__Project__Group__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:655:1: rule__Project__Group__0__Impl : ( ( rule__Project__IntendAssignment_0 ) ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:659:1: ( ( ( rule__Project__IntendAssignment_0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:660:1: ( ( rule__Project__IntendAssignment_0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:660:1: ( ( rule__Project__IntendAssignment_0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:661:1: ( rule__Project__IntendAssignment_0 )
            {
             before(grammarAccess.getProjectAccess().getIntendAssignment_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:662:1: ( rule__Project__IntendAssignment_0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:662:2: rule__Project__IntendAssignment_0
            {
            pushFollow(FOLLOW_rule__Project__IntendAssignment_0_in_rule__Project__Group__0__Impl1326);
            rule__Project__IntendAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getIntendAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0__Impl"


    // $ANTLR start "rule__Project__Group__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:672:1: rule__Project__Group__1 : rule__Project__Group__1__Impl ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:676:1: ( rule__Project__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:677:2: rule__Project__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group__1__Impl_in_rule__Project__Group__11356);
            rule__Project__Group__1__Impl();

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
    // $ANTLR end "rule__Project__Group__1"


    // $ANTLR start "rule__Project__Group__1__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:683:1: rule__Project__Group__1__Impl : ( ( rule__Project__TextAssignment_1 ) ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:687:1: ( ( ( rule__Project__TextAssignment_1 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:688:1: ( ( rule__Project__TextAssignment_1 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:688:1: ( ( rule__Project__TextAssignment_1 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:689:1: ( rule__Project__TextAssignment_1 )
            {
             before(grammarAccess.getProjectAccess().getTextAssignment_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:690:1: ( rule__Project__TextAssignment_1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:690:2: rule__Project__TextAssignment_1
            {
            pushFollow(FOLLOW_rule__Project__TextAssignment_1_in_rule__Project__Group__1__Impl1383);
            rule__Project__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1__Impl"


    // $ANTLR start "rule__Code__Group__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:704:1: rule__Code__Group__0 : rule__Code__Group__0__Impl rule__Code__Group__1 ;
    public final void rule__Code__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:708:1: ( rule__Code__Group__0__Impl rule__Code__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:709:2: rule__Code__Group__0__Impl rule__Code__Group__1
            {
            pushFollow(FOLLOW_rule__Code__Group__0__Impl_in_rule__Code__Group__01417);
            rule__Code__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Code__Group__1_in_rule__Code__Group__01420);
            rule__Code__Group__1();

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
    // $ANTLR end "rule__Code__Group__0"


    // $ANTLR start "rule__Code__Group__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:716:1: rule__Code__Group__0__Impl : ( ( rule__Code__IntendAssignment_0 ) ) ;
    public final void rule__Code__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:720:1: ( ( ( rule__Code__IntendAssignment_0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:721:1: ( ( rule__Code__IntendAssignment_0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:721:1: ( ( rule__Code__IntendAssignment_0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:722:1: ( rule__Code__IntendAssignment_0 )
            {
             before(grammarAccess.getCodeAccess().getIntendAssignment_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:723:1: ( rule__Code__IntendAssignment_0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:723:2: rule__Code__IntendAssignment_0
            {
            pushFollow(FOLLOW_rule__Code__IntendAssignment_0_in_rule__Code__Group__0__Impl1447);
            rule__Code__IntendAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCodeAccess().getIntendAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group__0__Impl"


    // $ANTLR start "rule__Code__Group__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:733:1: rule__Code__Group__1 : rule__Code__Group__1__Impl ;
    public final void rule__Code__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:737:1: ( rule__Code__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:738:2: rule__Code__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Code__Group__1__Impl_in_rule__Code__Group__11477);
            rule__Code__Group__1__Impl();

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
    // $ANTLR end "rule__Code__Group__1"


    // $ANTLR start "rule__Code__Group__1__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:744:1: rule__Code__Group__1__Impl : ( ( rule__Code__TextAssignment_1 ) ) ;
    public final void rule__Code__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:748:1: ( ( ( rule__Code__TextAssignment_1 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:749:1: ( ( rule__Code__TextAssignment_1 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:749:1: ( ( rule__Code__TextAssignment_1 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:750:1: ( rule__Code__TextAssignment_1 )
            {
             before(grammarAccess.getCodeAccess().getTextAssignment_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:751:1: ( rule__Code__TextAssignment_1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:751:2: rule__Code__TextAssignment_1
            {
            pushFollow(FOLLOW_rule__Code__TextAssignment_1_in_rule__Code__Group__1__Impl1504);
            rule__Code__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCodeAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group__1__Impl"


    // $ANTLR start "rule__Intendation__Group__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:765:1: rule__Intendation__Group__0 : rule__Intendation__Group__0__Impl rule__Intendation__Group__1 ;
    public final void rule__Intendation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:769:1: ( rule__Intendation__Group__0__Impl rule__Intendation__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:770:2: rule__Intendation__Group__0__Impl rule__Intendation__Group__1
            {
            pushFollow(FOLLOW_rule__Intendation__Group__0__Impl_in_rule__Intendation__Group__01538);
            rule__Intendation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Intendation__Group__1_in_rule__Intendation__Group__01541);
            rule__Intendation__Group__1();

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
    // $ANTLR end "rule__Intendation__Group__0"


    // $ANTLR start "rule__Intendation__Group__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:777:1: rule__Intendation__Group__0__Impl : ( ( rule__Intendation__Alternatives_0 )* ) ;
    public final void rule__Intendation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:781:1: ( ( ( rule__Intendation__Alternatives_0 )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:782:1: ( ( rule__Intendation__Alternatives_0 )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:782:1: ( ( rule__Intendation__Alternatives_0 )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:783:1: ( rule__Intendation__Alternatives_0 )*
            {
             before(grammarAccess.getIntendationAccess().getAlternatives_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:784:1: ( rule__Intendation__Alternatives_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_SPACE) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==RULE_SPACE) ) {
                        alt6=1;
                    }


                }
                else if ( (LA6_0==RULE_TAB) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:784:2: rule__Intendation__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_rule__Intendation__Alternatives_0_in_rule__Intendation__Group__0__Impl1568);
            	    rule__Intendation__Alternatives_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getIntendationAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intendation__Group__0__Impl"


    // $ANTLR start "rule__Intendation__Group__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:794:1: rule__Intendation__Group__1 : rule__Intendation__Group__1__Impl ;
    public final void rule__Intendation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:798:1: ( rule__Intendation__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:799:2: rule__Intendation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Intendation__Group__1__Impl_in_rule__Intendation__Group__11599);
            rule__Intendation__Group__1__Impl();

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
    // $ANTLR end "rule__Intendation__Group__1"


    // $ANTLR start "rule__Intendation__Group__1__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:805:1: rule__Intendation__Group__1__Impl : ( ( RULE_SPACE )? ) ;
    public final void rule__Intendation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:809:1: ( ( ( RULE_SPACE )? ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:810:1: ( ( RULE_SPACE )? )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:810:1: ( ( RULE_SPACE )? )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:811:1: ( RULE_SPACE )?
            {
             before(grammarAccess.getIntendationAccess().getSPACETerminalRuleCall_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:812:1: ( RULE_SPACE )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_SPACE) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:812:3: RULE_SPACE
                    {
                    match(input,RULE_SPACE,FOLLOW_RULE_SPACE_in_rule__Intendation__Group__1__Impl1627); 

                    }
                    break;

            }

             after(grammarAccess.getIntendationAccess().getSPACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intendation__Group__1__Impl"


    // $ANTLR start "rule__Intendation__Group_0_0__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:826:1: rule__Intendation__Group_0_0__0 : rule__Intendation__Group_0_0__0__Impl rule__Intendation__Group_0_0__1 ;
    public final void rule__Intendation__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:830:1: ( rule__Intendation__Group_0_0__0__Impl rule__Intendation__Group_0_0__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:831:2: rule__Intendation__Group_0_0__0__Impl rule__Intendation__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__Intendation__Group_0_0__0__Impl_in_rule__Intendation__Group_0_0__01662);
            rule__Intendation__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Intendation__Group_0_0__1_in_rule__Intendation__Group_0_0__01665);
            rule__Intendation__Group_0_0__1();

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
    // $ANTLR end "rule__Intendation__Group_0_0__0"


    // $ANTLR start "rule__Intendation__Group_0_0__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:838:1: rule__Intendation__Group_0_0__0__Impl : ( RULE_SPACE ) ;
    public final void rule__Intendation__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:842:1: ( ( RULE_SPACE ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:843:1: ( RULE_SPACE )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:843:1: ( RULE_SPACE )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:844:1: RULE_SPACE
            {
             before(grammarAccess.getIntendationAccess().getSPACETerminalRuleCall_0_0_0()); 
            match(input,RULE_SPACE,FOLLOW_RULE_SPACE_in_rule__Intendation__Group_0_0__0__Impl1692); 
             after(grammarAccess.getIntendationAccess().getSPACETerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intendation__Group_0_0__0__Impl"


    // $ANTLR start "rule__Intendation__Group_0_0__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:855:1: rule__Intendation__Group_0_0__1 : rule__Intendation__Group_0_0__1__Impl ;
    public final void rule__Intendation__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:859:1: ( rule__Intendation__Group_0_0__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:860:2: rule__Intendation__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Intendation__Group_0_0__1__Impl_in_rule__Intendation__Group_0_0__11721);
            rule__Intendation__Group_0_0__1__Impl();

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
    // $ANTLR end "rule__Intendation__Group_0_0__1"


    // $ANTLR start "rule__Intendation__Group_0_0__1__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:866:1: rule__Intendation__Group_0_0__1__Impl : ( RULE_SPACE ) ;
    public final void rule__Intendation__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:870:1: ( ( RULE_SPACE ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:871:1: ( RULE_SPACE )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:871:1: ( RULE_SPACE )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:872:1: RULE_SPACE
            {
             before(grammarAccess.getIntendationAccess().getSPACETerminalRuleCall_0_0_1()); 
            match(input,RULE_SPACE,FOLLOW_RULE_SPACE_in_rule__Intendation__Group_0_0__1__Impl1748); 
             after(grammarAccess.getIntendationAccess().getSPACETerminalRuleCall_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intendation__Group_0_0__1__Impl"


    // $ANTLR start "rule__Spaces__Group__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:887:1: rule__Spaces__Group__0 : rule__Spaces__Group__0__Impl rule__Spaces__Group__1 ;
    public final void rule__Spaces__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:891:1: ( rule__Spaces__Group__0__Impl rule__Spaces__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:892:2: rule__Spaces__Group__0__Impl rule__Spaces__Group__1
            {
            pushFollow(FOLLOW_rule__Spaces__Group__0__Impl_in_rule__Spaces__Group__01781);
            rule__Spaces__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spaces__Group__1_in_rule__Spaces__Group__01784);
            rule__Spaces__Group__1();

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
    // $ANTLR end "rule__Spaces__Group__0"


    // $ANTLR start "rule__Spaces__Group__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:899:1: rule__Spaces__Group__0__Impl : ( ( ruleWs )* ) ;
    public final void rule__Spaces__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:903:1: ( ( ( ruleWs )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:904:1: ( ( ruleWs )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:904:1: ( ( ruleWs )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:905:1: ( ruleWs )*
            {
             before(grammarAccess.getSpacesAccess().getWsParserRuleCall_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:906:1: ( ruleWs )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_TAB && LA8_0<=RULE_SPACE)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:906:3: ruleWs
            	    {
            	    pushFollow(FOLLOW_ruleWs_in_rule__Spaces__Group__0__Impl1812);
            	    ruleWs();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSpacesAccess().getWsParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spaces__Group__0__Impl"


    // $ANTLR start "rule__Spaces__Group__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:916:1: rule__Spaces__Group__1 : rule__Spaces__Group__1__Impl ;
    public final void rule__Spaces__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:920:1: ( rule__Spaces__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:921:2: rule__Spaces__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Spaces__Group__1__Impl_in_rule__Spaces__Group__11843);
            rule__Spaces__Group__1__Impl();

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
    // $ANTLR end "rule__Spaces__Group__1"


    // $ANTLR start "rule__Spaces__Group__1__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:927:1: rule__Spaces__Group__1__Impl : ( RULE_NL ) ;
    public final void rule__Spaces__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:931:1: ( ( RULE_NL ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:932:1: ( RULE_NL )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:932:1: ( RULE_NL )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:933:1: RULE_NL
            {
             before(grammarAccess.getSpacesAccess().getNLTerminalRuleCall_1()); 
            match(input,RULE_NL,FOLLOW_RULE_NL_in_rule__Spaces__Group__1__Impl1870); 
             after(grammarAccess.getSpacesAccess().getNLTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spaces__Group__1__Impl"


    // $ANTLR start "rule__TaskModel__ContentsAssignment_1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:949:1: rule__TaskModel__ContentsAssignment_1 : ( ruleContent ) ;
    public final void rule__TaskModel__ContentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:953:1: ( ( ruleContent ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:954:1: ( ruleContent )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:954:1: ( ruleContent )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:955:1: ruleContent
            {
             before(grammarAccess.getTaskModelAccess().getContentsContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleContent_in_rule__TaskModel__ContentsAssignment_11908);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getTaskModelAccess().getContentsContentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskModel__ContentsAssignment_1"


    // $ANTLR start "rule__Task__IntendAssignment_0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:964:1: rule__Task__IntendAssignment_0 : ( ruleIntendation ) ;
    public final void rule__Task__IntendAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:968:1: ( ( ruleIntendation ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:969:1: ( ruleIntendation )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:969:1: ( ruleIntendation )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:970:1: ruleIntendation
            {
             before(grammarAccess.getTaskAccess().getIntendIntendationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIntendation_in_rule__Task__IntendAssignment_01939);
            ruleIntendation();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getIntendIntendationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__IntendAssignment_0"


    // $ANTLR start "rule__Task__TextAssignment_1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:979:1: rule__Task__TextAssignment_1 : ( RULE_TASK_TEXT ) ;
    public final void rule__Task__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:983:1: ( ( RULE_TASK_TEXT ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:984:1: ( RULE_TASK_TEXT )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:984:1: ( RULE_TASK_TEXT )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:985:1: RULE_TASK_TEXT
            {
             before(grammarAccess.getTaskAccess().getTextTASK_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_TASK_TEXT,FOLLOW_RULE_TASK_TEXT_in_rule__Task__TextAssignment_11970); 
             after(grammarAccess.getTaskAccess().getTextTASK_TEXTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TextAssignment_1"


    // $ANTLR start "rule__Note__IntendAssignment_0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:994:1: rule__Note__IntendAssignment_0 : ( ruleIntendation ) ;
    public final void rule__Note__IntendAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:998:1: ( ( ruleIntendation ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:999:1: ( ruleIntendation )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:999:1: ( ruleIntendation )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1000:1: ruleIntendation
            {
             before(grammarAccess.getNoteAccess().getIntendIntendationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIntendation_in_rule__Note__IntendAssignment_02001);
            ruleIntendation();

            state._fsp--;

             after(grammarAccess.getNoteAccess().getIntendIntendationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__IntendAssignment_0"


    // $ANTLR start "rule__Note__TextAssignment_1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1009:1: rule__Note__TextAssignment_1 : ( RULE_TEXT ) ;
    public final void rule__Note__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1013:1: ( ( RULE_TEXT ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1014:1: ( RULE_TEXT )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1014:1: ( RULE_TEXT )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1015:1: RULE_TEXT
            {
             before(grammarAccess.getNoteAccess().getTextTEXTTerminalRuleCall_1_0()); 
            match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_rule__Note__TextAssignment_12032); 
             after(grammarAccess.getNoteAccess().getTextTEXTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__TextAssignment_1"


    // $ANTLR start "rule__Project__IntendAssignment_0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1024:1: rule__Project__IntendAssignment_0 : ( ruleIntendation ) ;
    public final void rule__Project__IntendAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1028:1: ( ( ruleIntendation ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1029:1: ( ruleIntendation )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1029:1: ( ruleIntendation )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1030:1: ruleIntendation
            {
             before(grammarAccess.getProjectAccess().getIntendIntendationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIntendation_in_rule__Project__IntendAssignment_02063);
            ruleIntendation();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getIntendIntendationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__IntendAssignment_0"


    // $ANTLR start "rule__Project__TextAssignment_1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1039:1: rule__Project__TextAssignment_1 : ( RULE_PROJECT_ ) ;
    public final void rule__Project__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1043:1: ( ( RULE_PROJECT_ ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1044:1: ( RULE_PROJECT_ )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1044:1: ( RULE_PROJECT_ )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1045:1: RULE_PROJECT_
            {
             before(grammarAccess.getProjectAccess().getTextPROJECT_TerminalRuleCall_1_0()); 
            match(input,RULE_PROJECT_,FOLLOW_RULE_PROJECT__in_rule__Project__TextAssignment_12094); 
             after(grammarAccess.getProjectAccess().getTextPROJECT_TerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__TextAssignment_1"


    // $ANTLR start "rule__Code__IntendAssignment_0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1054:1: rule__Code__IntendAssignment_0 : ( ruleIntendation ) ;
    public final void rule__Code__IntendAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1058:1: ( ( ruleIntendation ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1059:1: ( ruleIntendation )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1059:1: ( ruleIntendation )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1060:1: ruleIntendation
            {
             before(grammarAccess.getCodeAccess().getIntendIntendationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIntendation_in_rule__Code__IntendAssignment_02125);
            ruleIntendation();

            state._fsp--;

             after(grammarAccess.getCodeAccess().getIntendIntendationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__IntendAssignment_0"


    // $ANTLR start "rule__Code__TextAssignment_1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1069:1: rule__Code__TextAssignment_1 : ( RULE_CODE_ ) ;
    public final void rule__Code__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1073:1: ( ( RULE_CODE_ ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1074:1: ( RULE_CODE_ )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1074:1: ( RULE_CODE_ )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1075:1: RULE_CODE_
            {
             before(grammarAccess.getCodeAccess().getTextCODE_TerminalRuleCall_1_0()); 
            match(input,RULE_CODE_,FOLLOW_RULE_CODE__in_rule__Code__TextAssignment_12156); 
             after(grammarAccess.getCodeAccess().getTextCODE_TerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__TextAssignment_1"


    // $ANTLR start "rule__EmptyLine__TextAssignment"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1084:1: rule__EmptyLine__TextAssignment : ( ruleSpaces ) ;
    public final void rule__EmptyLine__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1088:1: ( ( ruleSpaces ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1089:1: ( ruleSpaces )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1089:1: ( ruleSpaces )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1090:1: ruleSpaces
            {
             before(grammarAccess.getEmptyLineAccess().getTextSpacesParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSpaces_in_rule__EmptyLine__TextAssignment2187);
            ruleSpaces();

            state._fsp--;

             after(grammarAccess.getEmptyLineAccess().getTextSpacesParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyLine__TextAssignment"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA1_eotS =
        "\11\uffff";
    static final String DFA1_eofS =
        "\11\uffff";
    static final String DFA1_minS =
        "\3\4\5\uffff\1\4";
    static final String DFA1_maxS =
        "\3\12\5\uffff\1\12";
    static final String DFA1_acceptS =
        "\3\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff";
    static final String DFA1_specialS =
        "\11\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\1\1\1\6\1\4\1\5\1\3\1\7",
            "\1\6\1\10\1\6\1\4\1\5\1\3\1\7",
            "\1\2\1\1\1\6\1\4\1\5\1\3\1\7",
            "",
            "",
            "",
            "",
            "",
            "\1\2\1\1\1\6\1\4\1\5\1\3\1\7"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "341:1: rule__Content__Alternatives : ( ( ruleProject ) | ( ruleTask ) | ( ruleNote ) | ( ruleEmptyLine ) | ( ruleCode ) );";
        }
    }
    static final String DFA4_eotS =
        "\10\uffff";
    static final String DFA4_eofS =
        "\3\3\2\uffff\3\3";
    static final String DFA4_minS =
        "\3\4\2\uffff\3\4";
    static final String DFA4_maxS =
        "\3\12\2\uffff\1\12\2\6";
    static final String DFA4_acceptS =
        "\3\uffff\1\2\1\1\3\uffff";
    static final String DFA4_specialS =
        "\10\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\1\1\5\4",
            "\1\6\1\5\5\4",
            "\1\2\1\1\5\4",
            "",
            "",
            "\1\2\1\1\5\4",
            "\1\6\1\7\1\4",
            "\1\6\1\7\1\4"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "()* loopback of 477:1: ( rule__TaskModel__ContentsAssignment_1 )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleTaskModel_in_entryRuleTaskModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaskModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskModel__Group__0_in_ruleTaskModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_entryRuleContent121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContent128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__Alternatives_in_ruleContent154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__0_in_ruleTask214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_entryRuleNote241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNote248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__0_in_ruleNote274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__0_in_ruleProject334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_entryRuleCode361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCode368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Code__Group__0_in_ruleCode394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntendation_in_entryRuleIntendation421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntendation428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intendation__Group__0_in_ruleIntendation454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyLine_in_entryRuleEmptyLine481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmptyLine488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyLine__TextAssignment_in_ruleEmptyLine514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpaces_in_entryRuleSpaces541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpaces548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spaces__Group__0_in_ruleSpaces574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWs_in_entryRuleWs601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWs608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ws__Alternatives_in_ruleWs634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_rule__Content__Alternatives670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_rule__Content__Alternatives687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Content__Alternatives704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyLine_in_rule__Content__Alternatives721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_rule__Content__Alternatives738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intendation__Group_0_0__0_in_rule__Intendation__Alternatives_0770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAB_in_rule__Intendation__Alternatives_0788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SPACE_in_rule__Ws__Alternatives820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAB_in_rule__Ws__Alternatives837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskModel__Group__0__Impl_in_rule__TaskModel__Group__0867 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__TaskModel__Group__1_in_rule__TaskModel__Group__0870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskModel__Group__1__Impl_in_rule__TaskModel__Group__1928 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__TaskModel__Group__2_in_rule__TaskModel__Group__1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskModel__ContentsAssignment_1_in_rule__TaskModel__Group__1__Impl958 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_rule__TaskModel__Group__2__Impl_in_rule__TaskModel__Group__2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWs_in_rule__TaskModel__Group__2__Impl1017 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Task__Group__0__Impl_in_rule__Task__Group__01054 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Task__Group__1_in_rule__Task__Group__01057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__IntendAssignment_0_in_rule__Task__Group__0__Impl1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__1__Impl_in_rule__Task__Group__11114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__TextAssignment_1_in_rule__Task__Group__1__Impl1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__0__Impl_in_rule__Note__Group__01175 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Note__Group__1_in_rule__Note__Group__01178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__IntendAssignment_0_in_rule__Note__Group__0__Impl1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__1__Impl_in_rule__Note__Group__11235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__TextAssignment_1_in_rule__Note__Group__1__Impl1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__0__Impl_in_rule__Project__Group__01296 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Project__Group__1_in_rule__Project__Group__01299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__IntendAssignment_0_in_rule__Project__Group__0__Impl1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__1__Impl_in_rule__Project__Group__11356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__TextAssignment_1_in_rule__Project__Group__1__Impl1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Code__Group__0__Impl_in_rule__Code__Group__01417 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Code__Group__1_in_rule__Code__Group__01420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Code__IntendAssignment_0_in_rule__Code__Group__0__Impl1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Code__Group__1__Impl_in_rule__Code__Group__11477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Code__TextAssignment_1_in_rule__Code__Group__1__Impl1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intendation__Group__0__Impl_in_rule__Intendation__Group__01538 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Intendation__Group__1_in_rule__Intendation__Group__01541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intendation__Alternatives_0_in_rule__Intendation__Group__0__Impl1568 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Intendation__Group__1__Impl_in_rule__Intendation__Group__11599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SPACE_in_rule__Intendation__Group__1__Impl1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intendation__Group_0_0__0__Impl_in_rule__Intendation__Group_0_0__01662 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Intendation__Group_0_0__1_in_rule__Intendation__Group_0_0__01665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SPACE_in_rule__Intendation__Group_0_0__0__Impl1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intendation__Group_0_0__1__Impl_in_rule__Intendation__Group_0_0__11721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SPACE_in_rule__Intendation__Group_0_0__1__Impl1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spaces__Group__0__Impl_in_rule__Spaces__Group__01781 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Spaces__Group__1_in_rule__Spaces__Group__01784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWs_in_rule__Spaces__Group__0__Impl1812 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Spaces__Group__1__Impl_in_rule__Spaces__Group__11843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NL_in_rule__Spaces__Group__1__Impl1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_rule__TaskModel__ContentsAssignment_11908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntendation_in_rule__Task__IntendAssignment_01939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TASK_TEXT_in_rule__Task__TextAssignment_11970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntendation_in_rule__Note__IntendAssignment_02001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_rule__Note__TextAssignment_12032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntendation_in_rule__Project__IntendAssignment_02063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PROJECT__in_rule__Project__TextAssignment_12094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntendation_in_rule__Code__IntendAssignment_02125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CODE__in_rule__Code__TextAssignment_12156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpaces_in_rule__EmptyLine__TextAssignment2187 = new BitSet(new long[]{0x0000000000000002L});

}