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
import de.sebastianbenz.task.services.TaskPaperGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTaskPaperParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PROJECT_1", "RULE_PROJECT_2", "RULE_PROJECT_3", "RULE_WS", "RULE_TASK_OPEN", "RULE_TASK_CLOSED", "RULE_NOTE_CONTENT", "RULE_SPACE", "RULE_NL", "RULE_TASK_START", "RULE_PROJECT_DELIMITER"
    };
    public static final int RULE_PROJECT_3=6;
    public static final int RULE_TASK_START=13;
    public static final int RULE_PROJECT_2=5;
    public static final int RULE_PROJECT_1=4;
    public static final int RULE_TASK_CLOSED=9;
    public static final int RULE_NL=12;
    public static final int RULE_NOTE_CONTENT=10;
    public static final int RULE_PROJECT_DELIMITER=14;
    public static final int RULE_WS=7;
    public static final int EOF=-1;
    public static final int RULE_SPACE=11;
    public static final int RULE_TASK_OPEN=8;

    // delegates
    // delegators


        public InternalTaskPaperParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTaskPaperParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTaskPaperParser.tokenNames; }
    public String getGrammarFileName() { return "../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g"; }


     
     	private TaskPaperGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(TaskPaperGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleTodo"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:62:1: entryRuleTodo : ruleTodo EOF ;
    public final void entryRuleTodo() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:63:1: ( ruleTodo EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:64:1: ruleTodo EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTodoRule()); 
            }
            pushFollow(FOLLOW_ruleTodo_in_entryRuleTodo67);
            ruleTodo();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTodoRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTodo74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTodo"


    // $ANTLR start "ruleTodo"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:71:1: ruleTodo : ( ( rule__Todo__Group__0 ) ) ;
    public final void ruleTodo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:75:2: ( ( ( rule__Todo__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:76:1: ( ( rule__Todo__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:76:1: ( ( rule__Todo__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:77:1: ( rule__Todo__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTodoAccess().getGroup()); 
            }
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:78:1: ( rule__Todo__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:78:2: rule__Todo__Group__0
            {
            pushFollow(FOLLOW_rule__Todo__Group__0_in_ruleTodo100);
            rule__Todo__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTodoAccess().getGroup()); 
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
    // $ANTLR end "ruleTodo"


    // $ANTLR start "entryRuleContent"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:90:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:91:1: ( ruleContent EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:92:1: ruleContent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContentRule()); 
            }
            pushFollow(FOLLOW_ruleContent_in_entryRuleContent127);
            ruleContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContent134); if (state.failed) return ;

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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:99:1: ruleContent : ( ( rule__Content__Alternatives ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:103:2: ( ( ( rule__Content__Alternatives ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:104:1: ( ( rule__Content__Alternatives ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:104:1: ( ( rule__Content__Alternatives ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:105:1: ( rule__Content__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContentAccess().getAlternatives()); 
            }
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:106:1: ( rule__Content__Alternatives )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:106:2: rule__Content__Alternatives
            {
            pushFollow(FOLLOW_rule__Content__Alternatives_in_ruleContent160);
            rule__Content__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContentAccess().getAlternatives()); 
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
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleTask"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:118:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:119:1: ( ruleTask EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:120:1: ruleTask EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskRule()); 
            }
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask187);
            ruleTask();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask194); if (state.failed) return ;

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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:127:1: ruleTask : ( ( rule__Task__Alternatives ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:131:2: ( ( ( rule__Task__Alternatives ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:132:1: ( ( rule__Task__Alternatives ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:132:1: ( ( rule__Task__Alternatives ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:133:1: ( rule__Task__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getAlternatives()); 
            }
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:134:1: ( rule__Task__Alternatives )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:134:2: rule__Task__Alternatives
            {
            pushFollow(FOLLOW_rule__Task__Alternatives_in_ruleTask220);
            rule__Task__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleOpenTask"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:146:1: entryRuleOpenTask : ruleOpenTask EOF ;
    public final void entryRuleOpenTask() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:147:1: ( ruleOpenTask EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:148:1: ruleOpenTask EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenTaskRule()); 
            }
            pushFollow(FOLLOW_ruleOpenTask_in_entryRuleOpenTask247);
            ruleOpenTask();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenTaskRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpenTask254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOpenTask"


    // $ANTLR start "ruleOpenTask"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:155:1: ruleOpenTask : ( ( rule__OpenTask__Group__0 ) ) ;
    public final void ruleOpenTask() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:159:2: ( ( ( rule__OpenTask__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:160:1: ( ( rule__OpenTask__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:160:1: ( ( rule__OpenTask__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:161:1: ( rule__OpenTask__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenTaskAccess().getGroup()); 
            }
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:162:1: ( rule__OpenTask__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:162:2: rule__OpenTask__Group__0
            {
            pushFollow(FOLLOW_rule__OpenTask__Group__0_in_ruleOpenTask280);
            rule__OpenTask__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenTaskAccess().getGroup()); 
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
    // $ANTLR end "ruleOpenTask"


    // $ANTLR start "entryRuleClosedTask"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:174:1: entryRuleClosedTask : ruleClosedTask EOF ;
    public final void entryRuleClosedTask() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:175:1: ( ruleClosedTask EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:176:1: ruleClosedTask EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosedTaskRule()); 
            }
            pushFollow(FOLLOW_ruleClosedTask_in_entryRuleClosedTask307);
            ruleClosedTask();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosedTaskRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClosedTask314); if (state.failed) return ;

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
    // $ANTLR end "entryRuleClosedTask"


    // $ANTLR start "ruleClosedTask"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:183:1: ruleClosedTask : ( ( rule__ClosedTask__Group__0 ) ) ;
    public final void ruleClosedTask() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:187:2: ( ( ( rule__ClosedTask__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:188:1: ( ( rule__ClosedTask__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:188:1: ( ( rule__ClosedTask__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:189:1: ( rule__ClosedTask__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosedTaskAccess().getGroup()); 
            }
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:190:1: ( rule__ClosedTask__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:190:2: rule__ClosedTask__Group__0
            {
            pushFollow(FOLLOW_rule__ClosedTask__Group__0_in_ruleClosedTask340);
            rule__ClosedTask__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosedTaskAccess().getGroup()); 
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
    // $ANTLR end "ruleClosedTask"


    // $ANTLR start "entryRuleNote"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:202:1: entryRuleNote : ruleNote EOF ;
    public final void entryRuleNote() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:203:1: ( ruleNote EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:204:1: ruleNote EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteRule()); 
            }
            pushFollow(FOLLOW_ruleNote_in_entryRuleNote367);
            ruleNote();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNote374); if (state.failed) return ;

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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:211:1: ruleNote : ( ( rule__Note__TextAssignment ) ) ;
    public final void ruleNote() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:215:2: ( ( ( rule__Note__TextAssignment ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:216:1: ( ( rule__Note__TextAssignment ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:216:1: ( ( rule__Note__TextAssignment ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:217:1: ( rule__Note__TextAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteAccess().getTextAssignment()); 
            }
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:218:1: ( rule__Note__TextAssignment )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:218:2: rule__Note__TextAssignment
            {
            pushFollow(FOLLOW_rule__Note__TextAssignment_in_ruleNote400);
            rule__Note__TextAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteAccess().getTextAssignment()); 
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
    // $ANTLR end "ruleNote"


    // $ANTLR start "entryRuleProject"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:230:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:231:1: ( ruleProject EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:232:1: ruleProject EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectRule()); 
            }
            pushFollow(FOLLOW_ruleProject_in_entryRuleProject427);
            ruleProject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProject434); if (state.failed) return ;

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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:239:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:243:2: ( ( ( rule__Project__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:244:1: ( ( rule__Project__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:244:1: ( ( rule__Project__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:245:1: ( rule__Project__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectAccess().getGroup()); 
            }
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:246:1: ( rule__Project__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:246:2: rule__Project__Group__0
            {
            pushFollow(FOLLOW_rule__Project__Group__0_in_ruleProject460);
            rule__Project__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectAccess().getGroup()); 
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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleSpaces"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:258:1: entryRuleSpaces : ruleSpaces EOF ;
    public final void entryRuleSpaces() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:259:1: ( ruleSpaces EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:260:1: ruleSpaces EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSpacesRule()); 
            }
            pushFollow(FOLLOW_ruleSpaces_in_entryRuleSpaces487);
            ruleSpaces();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSpacesRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpaces494); if (state.failed) return ;

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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:267:1: ruleSpaces : ( ( rule__Spaces__TextAssignment ) ) ;
    public final void ruleSpaces() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:271:2: ( ( ( rule__Spaces__TextAssignment ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:272:1: ( ( rule__Spaces__TextAssignment ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:272:1: ( ( rule__Spaces__TextAssignment ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:273:1: ( rule__Spaces__TextAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSpacesAccess().getTextAssignment()); 
            }
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:274:1: ( rule__Spaces__TextAssignment )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:274:2: rule__Spaces__TextAssignment
            {
            pushFollow(FOLLOW_rule__Spaces__TextAssignment_in_ruleSpaces520);
            rule__Spaces__TextAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSpacesAccess().getTextAssignment()); 
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
    // $ANTLR end "ruleSpaces"


    // $ANTLR start "rule__Content__Alternatives"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:286:1: rule__Content__Alternatives : ( ( ( ruleProject ) ) | ( ( ruleTask ) ) | ( ruleNote ) | ( ruleSpaces ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:290:1: ( ( ( ruleProject ) ) | ( ( ruleTask ) ) | ( ruleNote ) | ( ruleSpaces ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case RULE_PROJECT_1:
            case RULE_PROJECT_2:
            case RULE_PROJECT_3:
            case RULE_WS:
                {
                alt1=1;
                }
                break;
            case RULE_TASK_OPEN:
            case RULE_TASK_CLOSED:
                {
                alt1=2;
                }
                break;
            case RULE_NOTE_CONTENT:
                {
                alt1=3;
                }
                break;
            case RULE_SPACE:
                {
                alt1=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:291:1: ( ( ruleProject ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:291:1: ( ( ruleProject ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:292:1: ( ruleProject )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getProjectParserRuleCall_0()); 
                    }
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:293:1: ( ruleProject )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:293:3: ruleProject
                    {
                    pushFollow(FOLLOW_ruleProject_in_rule__Content__Alternatives557);
                    ruleProject();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getProjectParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:297:6: ( ( ruleTask ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:297:6: ( ( ruleTask ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:298:1: ( ruleTask )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getTaskParserRuleCall_1()); 
                    }
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:299:1: ( ruleTask )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:299:3: ruleTask
                    {
                    pushFollow(FOLLOW_ruleTask_in_rule__Content__Alternatives576);
                    ruleTask();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getTaskParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:303:6: ( ruleNote )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:303:6: ( ruleNote )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:304:1: ruleNote
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getNoteParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleNote_in_rule__Content__Alternatives594);
                    ruleNote();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getNoteParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:309:6: ( ruleSpaces )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:309:6: ( ruleSpaces )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:310:1: ruleSpaces
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getSpacesParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleSpaces_in_rule__Content__Alternatives611);
                    ruleSpaces();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getSpacesParserRuleCall_3()); 
                    }

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


    // $ANTLR start "rule__Task__Alternatives"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:320:1: rule__Task__Alternatives : ( ( ( ruleClosedTask ) ) | ( ruleOpenTask ) );
    public final void rule__Task__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:324:1: ( ( ( ruleClosedTask ) ) | ( ruleOpenTask ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_TASK_CLOSED) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_TASK_OPEN) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:325:1: ( ( ruleClosedTask ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:325:1: ( ( ruleClosedTask ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:326:1: ( ruleClosedTask )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTaskAccess().getClosedTaskParserRuleCall_0()); 
                    }
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:327:1: ( ruleClosedTask )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:327:3: ruleClosedTask
                    {
                    pushFollow(FOLLOW_ruleClosedTask_in_rule__Task__Alternatives644);
                    ruleClosedTask();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTaskAccess().getClosedTaskParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:331:6: ( ruleOpenTask )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:331:6: ( ruleOpenTask )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:332:1: ruleOpenTask
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTaskAccess().getOpenTaskParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleOpenTask_in_rule__Task__Alternatives662);
                    ruleOpenTask();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTaskAccess().getOpenTaskParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Task__Alternatives"


    // $ANTLR start "rule__Project__TextAlternatives_2_0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:342:1: rule__Project__TextAlternatives_2_0 : ( ( RULE_PROJECT_1 ) | ( RULE_PROJECT_2 ) | ( RULE_PROJECT_3 ) );
    public final void rule__Project__TextAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:346:1: ( ( RULE_PROJECT_1 ) | ( RULE_PROJECT_2 ) | ( RULE_PROJECT_3 ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_PROJECT_1:
                {
                alt3=1;
                }
                break;
            case RULE_PROJECT_2:
                {
                alt3=2;
                }
                break;
            case RULE_PROJECT_3:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:347:1: ( RULE_PROJECT_1 )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:347:1: ( RULE_PROJECT_1 )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:348:1: RULE_PROJECT_1
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProjectAccess().getTextPROJECT_1TerminalRuleCall_2_0_0()); 
                    }
                    match(input,RULE_PROJECT_1,FOLLOW_RULE_PROJECT_1_in_rule__Project__TextAlternatives_2_0694); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProjectAccess().getTextPROJECT_1TerminalRuleCall_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:353:6: ( RULE_PROJECT_2 )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:353:6: ( RULE_PROJECT_2 )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:354:1: RULE_PROJECT_2
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProjectAccess().getTextPROJECT_2TerminalRuleCall_2_0_1()); 
                    }
                    match(input,RULE_PROJECT_2,FOLLOW_RULE_PROJECT_2_in_rule__Project__TextAlternatives_2_0711); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProjectAccess().getTextPROJECT_2TerminalRuleCall_2_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:359:6: ( RULE_PROJECT_3 )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:359:6: ( RULE_PROJECT_3 )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:360:1: RULE_PROJECT_3
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProjectAccess().getTextPROJECT_3TerminalRuleCall_2_0_2()); 
                    }
                    match(input,RULE_PROJECT_3,FOLLOW_RULE_PROJECT_3_in_rule__Project__TextAlternatives_2_0728); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProjectAccess().getTextPROJECT_3TerminalRuleCall_2_0_2()); 
                    }

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
    // $ANTLR end "rule__Project__TextAlternatives_2_0"


    // $ANTLR start "rule__Todo__Group__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:372:1: rule__Todo__Group__0 : rule__Todo__Group__0__Impl rule__Todo__Group__1 ;
    public final void rule__Todo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:376:1: ( rule__Todo__Group__0__Impl rule__Todo__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:377:2: rule__Todo__Group__0__Impl rule__Todo__Group__1
            {
            pushFollow(FOLLOW_rule__Todo__Group__0__Impl_in_rule__Todo__Group__0758);
            rule__Todo__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Todo__Group__1_in_rule__Todo__Group__0761);
            rule__Todo__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Todo__Group__0"


    // $ANTLR start "rule__Todo__Group__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:384:1: rule__Todo__Group__0__Impl : ( () ) ;
    public final void rule__Todo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:388:1: ( ( () ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:389:1: ( () )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:389:1: ( () )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:390:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTodoAccess().getTodoAction_0()); 
            }
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:391:1: ()
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:393:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTodoAccess().getTodoAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Todo__Group__0__Impl"


    // $ANTLR start "rule__Todo__Group__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:403:1: rule__Todo__Group__1 : rule__Todo__Group__1__Impl rule__Todo__Group__2 ;
    public final void rule__Todo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:407:1: ( rule__Todo__Group__1__Impl rule__Todo__Group__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:408:2: rule__Todo__Group__1__Impl rule__Todo__Group__2
            {
            pushFollow(FOLLOW_rule__Todo__Group__1__Impl_in_rule__Todo__Group__1819);
            rule__Todo__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Todo__Group__2_in_rule__Todo__Group__1822);
            rule__Todo__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Todo__Group__1"


    // $ANTLR start "rule__Todo__Group__1__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:415:1: rule__Todo__Group__1__Impl : ( ( ( rule__Todo__ContentsAssignment_1 ) ) ( ( rule__Todo__ContentsAssignment_1 )* ) ) ;
    public final void rule__Todo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:419:1: ( ( ( ( rule__Todo__ContentsAssignment_1 ) ) ( ( rule__Todo__ContentsAssignment_1 )* ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:420:1: ( ( ( rule__Todo__ContentsAssignment_1 ) ) ( ( rule__Todo__ContentsAssignment_1 )* ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:420:1: ( ( ( rule__Todo__ContentsAssignment_1 ) ) ( ( rule__Todo__ContentsAssignment_1 )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:421:1: ( ( rule__Todo__ContentsAssignment_1 ) ) ( ( rule__Todo__ContentsAssignment_1 )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:421:1: ( ( rule__Todo__ContentsAssignment_1 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:422:1: ( rule__Todo__ContentsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTodoAccess().getContentsAssignment_1()); 
            }
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:423:1: ( rule__Todo__ContentsAssignment_1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:423:2: rule__Todo__ContentsAssignment_1
            {
            pushFollow(FOLLOW_rule__Todo__ContentsAssignment_1_in_rule__Todo__Group__1__Impl851);
            rule__Todo__ContentsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTodoAccess().getContentsAssignment_1()); 
            }

            }

            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:426:1: ( ( rule__Todo__ContentsAssignment_1 )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:427:1: ( rule__Todo__ContentsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTodoAccess().getContentsAssignment_1()); 
            }
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:428:1: ( rule__Todo__ContentsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:428:2: rule__Todo__ContentsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Todo__ContentsAssignment_1_in_rule__Todo__Group__1__Impl863);
            	    rule__Todo__ContentsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTodoAccess().getContentsAssignment_1()); 
            }

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
    // $ANTLR end "rule__Todo__Group__1__Impl"


    // $ANTLR start "rule__Todo__Group__2"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:439:1: rule__Todo__Group__2 : rule__Todo__Group__2__Impl ;
    public final void rule__Todo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:443:1: ( rule__Todo__Group__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:444:2: rule__Todo__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Todo__Group__2__Impl_in_rule__Todo__Group__2896);
            rule__Todo__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Todo__Group__2"


    // $ANTLR start "rule__Todo__Group__2__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:450:1: rule__Todo__Group__2__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Todo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:454:1: ( ( ( RULE_WS )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:455:1: ( ( RULE_WS )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:455:1: ( ( RULE_WS )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:456:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTodoAccess().getWSTerminalRuleCall_2()); 
            }
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:457:1: ( RULE_WS )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_WS) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:457:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Todo__Group__2__Impl924); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTodoAccess().getWSTerminalRuleCall_2()); 
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
    // $ANTLR end "rule__Todo__Group__2__Impl"


    // $ANTLR start "rule__OpenTask__Group__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:473:1: rule__OpenTask__Group__0 : rule__OpenTask__Group__0__Impl rule__OpenTask__Group__1 ;
    public final void rule__OpenTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:477:1: ( rule__OpenTask__Group__0__Impl rule__OpenTask__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:478:2: rule__OpenTask__Group__0__Impl rule__OpenTask__Group__1
            {
            pushFollow(FOLLOW_rule__OpenTask__Group__0__Impl_in_rule__OpenTask__Group__0961);
            rule__OpenTask__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OpenTask__Group__1_in_rule__OpenTask__Group__0964);
            rule__OpenTask__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenTask__Group__0"


    // $ANTLR start "rule__OpenTask__Group__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:485:1: rule__OpenTask__Group__0__Impl : ( () ) ;
    public final void rule__OpenTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:489:1: ( ( () ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:490:1: ( () )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:490:1: ( () )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:491:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenTaskAccess().getOpenTaskAction_0()); 
            }
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:492:1: ()
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:494:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenTaskAccess().getOpenTaskAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenTask__Group__0__Impl"


    // $ANTLR start "rule__OpenTask__Group__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:504:1: rule__OpenTask__Group__1 : rule__OpenTask__Group__1__Impl ;
    public final void rule__OpenTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:508:1: ( rule__OpenTask__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:509:2: rule__OpenTask__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OpenTask__Group__1__Impl_in_rule__OpenTask__Group__11022);
            rule__OpenTask__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenTask__Group__1"


    // $ANTLR start "rule__OpenTask__Group__1__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:515:1: rule__OpenTask__Group__1__Impl : ( ( rule__OpenTask__TextAssignment_1 ) ) ;
    public final void rule__OpenTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:519:1: ( ( ( rule__OpenTask__TextAssignment_1 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:520:1: ( ( rule__OpenTask__TextAssignment_1 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:520:1: ( ( rule__OpenTask__TextAssignment_1 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:521:1: ( rule__OpenTask__TextAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenTaskAccess().getTextAssignment_1()); 
            }
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:522:1: ( rule__OpenTask__TextAssignment_1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:522:2: rule__OpenTask__TextAssignment_1
            {
            pushFollow(FOLLOW_rule__OpenTask__TextAssignment_1_in_rule__OpenTask__Group__1__Impl1049);
            rule__OpenTask__TextAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenTaskAccess().getTextAssignment_1()); 
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
    // $ANTLR end "rule__OpenTask__Group__1__Impl"


    // $ANTLR start "rule__ClosedTask__Group__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:536:1: rule__ClosedTask__Group__0 : rule__ClosedTask__Group__0__Impl rule__ClosedTask__Group__1 ;
    public final void rule__ClosedTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:540:1: ( rule__ClosedTask__Group__0__Impl rule__ClosedTask__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:541:2: rule__ClosedTask__Group__0__Impl rule__ClosedTask__Group__1
            {
            pushFollow(FOLLOW_rule__ClosedTask__Group__0__Impl_in_rule__ClosedTask__Group__01083);
            rule__ClosedTask__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ClosedTask__Group__1_in_rule__ClosedTask__Group__01086);
            rule__ClosedTask__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedTask__Group__0"


    // $ANTLR start "rule__ClosedTask__Group__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:548:1: rule__ClosedTask__Group__0__Impl : ( () ) ;
    public final void rule__ClosedTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:552:1: ( ( () ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:553:1: ( () )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:553:1: ( () )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:554:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosedTaskAccess().getClosedTaskAction_0()); 
            }
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:555:1: ()
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:557:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosedTaskAccess().getClosedTaskAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedTask__Group__0__Impl"


    // $ANTLR start "rule__ClosedTask__Group__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:567:1: rule__ClosedTask__Group__1 : rule__ClosedTask__Group__1__Impl ;
    public final void rule__ClosedTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:571:1: ( rule__ClosedTask__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:572:2: rule__ClosedTask__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ClosedTask__Group__1__Impl_in_rule__ClosedTask__Group__11144);
            rule__ClosedTask__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedTask__Group__1"


    // $ANTLR start "rule__ClosedTask__Group__1__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:578:1: rule__ClosedTask__Group__1__Impl : ( ( rule__ClosedTask__TextAssignment_1 ) ) ;
    public final void rule__ClosedTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:582:1: ( ( ( rule__ClosedTask__TextAssignment_1 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:583:1: ( ( rule__ClosedTask__TextAssignment_1 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:583:1: ( ( rule__ClosedTask__TextAssignment_1 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:584:1: ( rule__ClosedTask__TextAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosedTaskAccess().getTextAssignment_1()); 
            }
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:585:1: ( rule__ClosedTask__TextAssignment_1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:585:2: rule__ClosedTask__TextAssignment_1
            {
            pushFollow(FOLLOW_rule__ClosedTask__TextAssignment_1_in_rule__ClosedTask__Group__1__Impl1171);
            rule__ClosedTask__TextAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosedTaskAccess().getTextAssignment_1()); 
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
    // $ANTLR end "rule__ClosedTask__Group__1__Impl"


    // $ANTLR start "rule__Project__Group__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:599:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:603:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:604:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FOLLOW_rule__Project__Group__0__Impl_in_rule__Project__Group__01205);
            rule__Project__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Project__Group__1_in_rule__Project__Group__01208);
            rule__Project__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:611:1: rule__Project__Group__0__Impl : ( () ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:615:1: ( ( () ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:616:1: ( () )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:616:1: ( () )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:617:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectAccess().getProjectAction_0()); 
            }
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:618:1: ()
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:620:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectAccess().getProjectAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0__Impl"


    // $ANTLR start "rule__Project__Group__1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:630:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:634:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:635:2: rule__Project__Group__1__Impl rule__Project__Group__2
            {
            pushFollow(FOLLOW_rule__Project__Group__1__Impl_in_rule__Project__Group__11266);
            rule__Project__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Project__Group__2_in_rule__Project__Group__11269);
            rule__Project__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:642:1: rule__Project__Group__1__Impl : ( ( rule__Project__Group_1__0 )* ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:646:1: ( ( ( rule__Project__Group_1__0 )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:647:1: ( ( rule__Project__Group_1__0 )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:647:1: ( ( rule__Project__Group_1__0 )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:648:1: ( rule__Project__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectAccess().getGroup_1()); 
            }
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:649:1: ( rule__Project__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_WS) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:649:2: rule__Project__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Project__Group_1__0_in_rule__Project__Group__1__Impl1296);
            	    rule__Project__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Project__Group__1__Impl"


    // $ANTLR start "rule__Project__Group__2"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:659:1: rule__Project__Group__2 : rule__Project__Group__2__Impl ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:663:1: ( rule__Project__Group__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:664:2: rule__Project__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group__2__Impl_in_rule__Project__Group__21327);
            rule__Project__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__2"


    // $ANTLR start "rule__Project__Group__2__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:670:1: rule__Project__Group__2__Impl : ( ( rule__Project__TextAssignment_2 ) ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:674:1: ( ( ( rule__Project__TextAssignment_2 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:675:1: ( ( rule__Project__TextAssignment_2 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:675:1: ( ( rule__Project__TextAssignment_2 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:676:1: ( rule__Project__TextAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectAccess().getTextAssignment_2()); 
            }
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:677:1: ( rule__Project__TextAssignment_2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:677:2: rule__Project__TextAssignment_2
            {
            pushFollow(FOLLOW_rule__Project__TextAssignment_2_in_rule__Project__Group__2__Impl1354);
            rule__Project__TextAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectAccess().getTextAssignment_2()); 
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
    // $ANTLR end "rule__Project__Group__2__Impl"


    // $ANTLR start "rule__Project__Group_1__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:693:1: rule__Project__Group_1__0 : rule__Project__Group_1__0__Impl ;
    public final void rule__Project__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:697:1: ( rule__Project__Group_1__0__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:698:2: rule__Project__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group_1__0__Impl_in_rule__Project__Group_1__01390);
            rule__Project__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_1__0"


    // $ANTLR start "rule__Project__Group_1__0__Impl"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:704:1: rule__Project__Group_1__0__Impl : ( ( rule__Project__IntendAssignment_1_0 ) ) ;
    public final void rule__Project__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:708:1: ( ( ( rule__Project__IntendAssignment_1_0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:709:1: ( ( rule__Project__IntendAssignment_1_0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:709:1: ( ( rule__Project__IntendAssignment_1_0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:710:1: ( rule__Project__IntendAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectAccess().getIntendAssignment_1_0()); 
            }
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:711:1: ( rule__Project__IntendAssignment_1_0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:711:2: rule__Project__IntendAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Project__IntendAssignment_1_0_in_rule__Project__Group_1__0__Impl1417);
            rule__Project__IntendAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectAccess().getIntendAssignment_1_0()); 
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
    // $ANTLR end "rule__Project__Group_1__0__Impl"


    // $ANTLR start "rule__Todo__ContentsAssignment_1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:724:1: rule__Todo__ContentsAssignment_1 : ( ruleContent ) ;
    public final void rule__Todo__ContentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:728:1: ( ( ruleContent ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:729:1: ( ruleContent )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:729:1: ( ruleContent )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:730:1: ruleContent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTodoAccess().getContentsContentParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleContent_in_rule__Todo__ContentsAssignment_11454);
            ruleContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTodoAccess().getContentsContentParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Todo__ContentsAssignment_1"


    // $ANTLR start "rule__OpenTask__TextAssignment_1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:739:1: rule__OpenTask__TextAssignment_1 : ( RULE_TASK_OPEN ) ;
    public final void rule__OpenTask__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:743:1: ( ( RULE_TASK_OPEN ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:744:1: ( RULE_TASK_OPEN )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:744:1: ( RULE_TASK_OPEN )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:745:1: RULE_TASK_OPEN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenTaskAccess().getTextTASK_OPENTerminalRuleCall_1_0()); 
            }
            match(input,RULE_TASK_OPEN,FOLLOW_RULE_TASK_OPEN_in_rule__OpenTask__TextAssignment_11485); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenTaskAccess().getTextTASK_OPENTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__OpenTask__TextAssignment_1"


    // $ANTLR start "rule__ClosedTask__TextAssignment_1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:754:1: rule__ClosedTask__TextAssignment_1 : ( RULE_TASK_CLOSED ) ;
    public final void rule__ClosedTask__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:758:1: ( ( RULE_TASK_CLOSED ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:759:1: ( RULE_TASK_CLOSED )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:759:1: ( RULE_TASK_CLOSED )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:760:1: RULE_TASK_CLOSED
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClosedTaskAccess().getTextTASK_CLOSEDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_TASK_CLOSED,FOLLOW_RULE_TASK_CLOSED_in_rule__ClosedTask__TextAssignment_11516); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClosedTaskAccess().getTextTASK_CLOSEDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__ClosedTask__TextAssignment_1"


    // $ANTLR start "rule__Note__TextAssignment"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:769:1: rule__Note__TextAssignment : ( RULE_NOTE_CONTENT ) ;
    public final void rule__Note__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:773:1: ( ( RULE_NOTE_CONTENT ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:774:1: ( RULE_NOTE_CONTENT )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:774:1: ( RULE_NOTE_CONTENT )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:775:1: RULE_NOTE_CONTENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteAccess().getTextNOTE_CONTENTTerminalRuleCall_0()); 
            }
            match(input,RULE_NOTE_CONTENT,FOLLOW_RULE_NOTE_CONTENT_in_rule__Note__TextAssignment1547); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteAccess().getTextNOTE_CONTENTTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__Note__TextAssignment"


    // $ANTLR start "rule__Project__IntendAssignment_1_0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:784:1: rule__Project__IntendAssignment_1_0 : ( RULE_WS ) ;
    public final void rule__Project__IntendAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:788:1: ( ( RULE_WS ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:789:1: ( RULE_WS )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:789:1: ( RULE_WS )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:790:1: RULE_WS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectAccess().getIntendWSTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Project__IntendAssignment_1_01578); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectAccess().getIntendWSTerminalRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__Project__IntendAssignment_1_0"


    // $ANTLR start "rule__Project__TextAssignment_2"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:799:1: rule__Project__TextAssignment_2 : ( ( rule__Project__TextAlternatives_2_0 ) ) ;
    public final void rule__Project__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:803:1: ( ( ( rule__Project__TextAlternatives_2_0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:804:1: ( ( rule__Project__TextAlternatives_2_0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:804:1: ( ( rule__Project__TextAlternatives_2_0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:805:1: ( rule__Project__TextAlternatives_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectAccess().getTextAlternatives_2_0()); 
            }
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:806:1: ( rule__Project__TextAlternatives_2_0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:806:2: rule__Project__TextAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__Project__TextAlternatives_2_0_in_rule__Project__TextAssignment_21609);
            rule__Project__TextAlternatives_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectAccess().getTextAlternatives_2_0()); 
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
    // $ANTLR end "rule__Project__TextAssignment_2"


    // $ANTLR start "rule__Spaces__TextAssignment"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:815:1: rule__Spaces__TextAssignment : ( RULE_SPACE ) ;
    public final void rule__Spaces__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:819:1: ( ( RULE_SPACE ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:820:1: ( RULE_SPACE )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:820:1: ( RULE_SPACE )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:821:1: RULE_SPACE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSpacesAccess().getTextSPACETerminalRuleCall_0()); 
            }
            match(input,RULE_SPACE,FOLLOW_RULE_SPACE_in_rule__Spaces__TextAssignment1642); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSpacesAccess().getTextSPACETerminalRuleCall_0()); 
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
    // $ANTLR end "rule__Spaces__TextAssignment"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\4\uffff";
    static final String DFA4_eofS =
        "\2\2\2\uffff";
    static final String DFA4_minS =
        "\2\4\2\uffff";
    static final String DFA4_maxS =
        "\1\13\1\7\2\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA4_specialS =
        "\4\uffff}>";
    static final String[] DFA4_transitionS = {
            "\3\3\1\1\4\3",
            "\3\3\1\1",
            "",
            ""
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
            return "()* loopback of 428:1: ( rule__Todo__ContentsAssignment_1 )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleTodo_in_entryRuleTodo67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTodo74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Todo__Group__0_in_ruleTodo100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_entryRuleContent127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContent134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__Alternatives_in_ruleContent160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Alternatives_in_ruleTask220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenTask_in_entryRuleOpenTask247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpenTask254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OpenTask__Group__0_in_ruleOpenTask280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosedTask_in_entryRuleClosedTask307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClosedTask314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedTask__Group__0_in_ruleClosedTask340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_entryRuleNote367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNote374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__TextAssignment_in_ruleNote400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__0_in_ruleProject460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpaces_in_entryRuleSpaces487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpaces494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spaces__TextAssignment_in_ruleSpaces520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_rule__Content__Alternatives557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_rule__Content__Alternatives576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Content__Alternatives594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpaces_in_rule__Content__Alternatives611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosedTask_in_rule__Task__Alternatives644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenTask_in_rule__Task__Alternatives662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PROJECT_1_in_rule__Project__TextAlternatives_2_0694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PROJECT_2_in_rule__Project__TextAlternatives_2_0711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PROJECT_3_in_rule__Project__TextAlternatives_2_0728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Todo__Group__0__Impl_in_rule__Todo__Group__0758 = new BitSet(new long[]{0x0000000000000FF0L});
    public static final BitSet FOLLOW_rule__Todo__Group__1_in_rule__Todo__Group__0761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Todo__Group__1__Impl_in_rule__Todo__Group__1819 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Todo__Group__2_in_rule__Todo__Group__1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Todo__ContentsAssignment_1_in_rule__Todo__Group__1__Impl851 = new BitSet(new long[]{0x0000000000000FF2L});
    public static final BitSet FOLLOW_rule__Todo__ContentsAssignment_1_in_rule__Todo__Group__1__Impl863 = new BitSet(new long[]{0x0000000000000FF2L});
    public static final BitSet FOLLOW_rule__Todo__Group__2__Impl_in_rule__Todo__Group__2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Todo__Group__2__Impl924 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__OpenTask__Group__0__Impl_in_rule__OpenTask__Group__0961 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_rule__OpenTask__Group__1_in_rule__OpenTask__Group__0964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OpenTask__Group__1__Impl_in_rule__OpenTask__Group__11022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OpenTask__TextAssignment_1_in_rule__OpenTask__Group__1__Impl1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedTask__Group__0__Impl_in_rule__ClosedTask__Group__01083 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__ClosedTask__Group__1_in_rule__ClosedTask__Group__01086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedTask__Group__1__Impl_in_rule__ClosedTask__Group__11144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedTask__TextAssignment_1_in_rule__ClosedTask__Group__1__Impl1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__0__Impl_in_rule__Project__Group__01205 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Project__Group__1_in_rule__Project__Group__01208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__1__Impl_in_rule__Project__Group__11266 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Project__Group__2_in_rule__Project__Group__11269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_1__0_in_rule__Project__Group__1__Impl1296 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Project__Group__2__Impl_in_rule__Project__Group__21327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__TextAssignment_2_in_rule__Project__Group__2__Impl1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_1__0__Impl_in_rule__Project__Group_1__01390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__IntendAssignment_1_0_in_rule__Project__Group_1__0__Impl1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_rule__Todo__ContentsAssignment_11454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TASK_OPEN_in_rule__OpenTask__TextAssignment_11485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TASK_CLOSED_in_rule__ClosedTask__TextAssignment_11516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOTE_CONTENT_in_rule__Note__TextAssignment1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Project__IntendAssignment_1_01578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__TextAlternatives_2_0_in_rule__Project__TextAssignment_21609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SPACE_in_rule__Spaces__TextAssignment1642 = new BitSet(new long[]{0x0000000000000002L});

}