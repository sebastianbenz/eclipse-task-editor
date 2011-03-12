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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_NL", "RULE_TASK_TEXT", "RULE_TEXT", "RULE_PROJECT_", "RULE_HYPHEN", "RULE_COLON"
    };
    public static final int RULE_COLON=10;
    public static final int RULE_HYPHEN=9;
    public static final int RULE_PROJECT_=8;
    public static final int RULE_NL=5;
    public static final int RULE_TASK_TEXT=6;
    public static final int RULE_TEXT=7;
    public static final int RULE_WS=4;
    public static final int EOF=-1;

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


    // $ANTLR start "entryRuleSpaces"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:201:1: entryRuleSpaces : ruleSpaces EOF ;
    public final void entryRuleSpaces() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:202:1: ( ruleSpaces EOF )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:203:1: ruleSpaces EOF
            {
             before(grammarAccess.getSpacesRule()); 
            pushFollow(FOLLOW_ruleSpaces_in_entryRuleSpaces361);
            ruleSpaces();

            state._fsp--;

             after(grammarAccess.getSpacesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpaces368); 

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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:210:1: ruleSpaces : ( ( rule__Spaces__Group__0 ) ) ;
    public final void ruleSpaces() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:214:2: ( ( ( rule__Spaces__Group__0 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:215:1: ( ( rule__Spaces__Group__0 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:215:1: ( ( rule__Spaces__Group__0 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:216:1: ( rule__Spaces__Group__0 )
            {
             before(grammarAccess.getSpacesAccess().getGroup()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:217:1: ( rule__Spaces__Group__0 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:217:2: rule__Spaces__Group__0
            {
            pushFollow(FOLLOW_rule__Spaces__Group__0_in_ruleSpaces394);
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


    // $ANTLR start "rule__TaskModel__Alternatives_1"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:229:1: rule__TaskModel__Alternatives_1 : ( ( ( rule__TaskModel__ContentsAssignment_1_0 ) ) | ( ruleSpaces ) );
    public final void rule__TaskModel__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:233:1: ( ( ( rule__TaskModel__ContentsAssignment_1_0 ) ) | ( ruleSpaces ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:234:1: ( ( rule__TaskModel__ContentsAssignment_1_0 ) )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:234:1: ( ( rule__TaskModel__ContentsAssignment_1_0 ) )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:235:1: ( rule__TaskModel__ContentsAssignment_1_0 )
                    {
                     before(grammarAccess.getTaskModelAccess().getContentsAssignment_1_0()); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:236:1: ( rule__TaskModel__ContentsAssignment_1_0 )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:236:2: rule__TaskModel__ContentsAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__TaskModel__ContentsAssignment_1_0_in_rule__TaskModel__Alternatives_1430);
                    rule__TaskModel__ContentsAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTaskModelAccess().getContentsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:240:6: ( ruleSpaces )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:240:6: ( ruleSpaces )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:241:1: ruleSpaces
                    {
                     before(grammarAccess.getTaskModelAccess().getSpacesParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_ruleSpaces_in_rule__TaskModel__Alternatives_1448);
                    ruleSpaces();

                    state._fsp--;

                     after(grammarAccess.getTaskModelAccess().getSpacesParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__TaskModel__Alternatives_1"


    // $ANTLR start "rule__Content__Alternatives"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:251:1: rule__Content__Alternatives : ( ( ruleProject ) | ( ruleTask ) | ( ruleNote ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:255:1: ( ( ruleProject ) | ( ruleTask ) | ( ruleNote ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:256:1: ( ruleProject )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:256:1: ( ruleProject )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:257:1: ruleProject
                    {
                     before(grammarAccess.getContentAccess().getProjectParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleProject_in_rule__Content__Alternatives480);
                    ruleProject();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getProjectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:262:6: ( ruleTask )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:262:6: ( ruleTask )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:263:1: ruleTask
                    {
                     before(grammarAccess.getContentAccess().getTaskParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTask_in_rule__Content__Alternatives497);
                    ruleTask();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getTaskParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:268:6: ( ruleNote )
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:268:6: ( ruleNote )
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:269:1: ruleNote
                    {
                     before(grammarAccess.getContentAccess().getNoteParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNote_in_rule__Content__Alternatives514);
                    ruleNote();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getNoteParserRuleCall_2()); 

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


    // $ANTLR start "rule__TaskModel__Group__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:281:1: rule__TaskModel__Group__0 : rule__TaskModel__Group__0__Impl rule__TaskModel__Group__1 ;
    public final void rule__TaskModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:285:1: ( rule__TaskModel__Group__0__Impl rule__TaskModel__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:286:2: rule__TaskModel__Group__0__Impl rule__TaskModel__Group__1
            {
            pushFollow(FOLLOW_rule__TaskModel__Group__0__Impl_in_rule__TaskModel__Group__0544);
            rule__TaskModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TaskModel__Group__1_in_rule__TaskModel__Group__0547);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:293:1: rule__TaskModel__Group__0__Impl : ( () ) ;
    public final void rule__TaskModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:297:1: ( ( () ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:298:1: ( () )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:298:1: ( () )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:299:1: ()
            {
             before(grammarAccess.getTaskModelAccess().getTaskModelAction_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:300:1: ()
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:302:1: 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:312:1: rule__TaskModel__Group__1 : rule__TaskModel__Group__1__Impl rule__TaskModel__Group__2 ;
    public final void rule__TaskModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:316:1: ( rule__TaskModel__Group__1__Impl rule__TaskModel__Group__2 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:317:2: rule__TaskModel__Group__1__Impl rule__TaskModel__Group__2
            {
            pushFollow(FOLLOW_rule__TaskModel__Group__1__Impl_in_rule__TaskModel__Group__1605);
            rule__TaskModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TaskModel__Group__2_in_rule__TaskModel__Group__1608);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:324:1: rule__TaskModel__Group__1__Impl : ( ( rule__TaskModel__Alternatives_1 )* ) ;
    public final void rule__TaskModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:328:1: ( ( ( rule__TaskModel__Alternatives_1 )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:329:1: ( ( rule__TaskModel__Alternatives_1 )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:329:1: ( ( rule__TaskModel__Alternatives_1 )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:330:1: ( rule__TaskModel__Alternatives_1 )*
            {
             before(grammarAccess.getTaskModelAccess().getAlternatives_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:331:1: ( rule__TaskModel__Alternatives_1 )*
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:331:2: rule__TaskModel__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__TaskModel__Alternatives_1_in_rule__TaskModel__Group__1__Impl635);
            	    rule__TaskModel__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getTaskModelAccess().getAlternatives_1()); 

            }


            }

        }
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:341:1: rule__TaskModel__Group__2 : rule__TaskModel__Group__2__Impl ;
    public final void rule__TaskModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:345:1: ( rule__TaskModel__Group__2__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:346:2: rule__TaskModel__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TaskModel__Group__2__Impl_in_rule__TaskModel__Group__2666);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:352:1: rule__TaskModel__Group__2__Impl : ( ( RULE_WS )* ) ;
    public final void rule__TaskModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:356:1: ( ( ( RULE_WS )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:357:1: ( ( RULE_WS )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:357:1: ( ( RULE_WS )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:358:1: ( RULE_WS )*
            {
             before(grammarAccess.getTaskModelAccess().getWSTerminalRuleCall_2()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:359:1: ( RULE_WS )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_WS) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:359:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__TaskModel__Group__2__Impl694); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTaskModelAccess().getWSTerminalRuleCall_2()); 

            }


            }

        }
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:375:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:379:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:380:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_rule__Task__Group__0__Impl_in_rule__Task__Group__0731);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__1_in_rule__Task__Group__0734);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:387:1: rule__Task__Group__0__Impl : ( ( rule__Task__IntendAssignment_0 )* ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:391:1: ( ( ( rule__Task__IntendAssignment_0 )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:392:1: ( ( rule__Task__IntendAssignment_0 )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:392:1: ( ( rule__Task__IntendAssignment_0 )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:393:1: ( rule__Task__IntendAssignment_0 )*
            {
             before(grammarAccess.getTaskAccess().getIntendAssignment_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:394:1: ( rule__Task__IntendAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_WS) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:394:2: rule__Task__IntendAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Task__IntendAssignment_0_in_rule__Task__Group__0__Impl761);
            	    rule__Task__IntendAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:404:1: rule__Task__Group__1 : rule__Task__Group__1__Impl ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:408:1: ( rule__Task__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:409:2: rule__Task__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Task__Group__1__Impl_in_rule__Task__Group__1792);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:415:1: rule__Task__Group__1__Impl : ( ( rule__Task__TextAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:419:1: ( ( ( rule__Task__TextAssignment_1 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:420:1: ( ( rule__Task__TextAssignment_1 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:420:1: ( ( rule__Task__TextAssignment_1 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:421:1: ( rule__Task__TextAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getTextAssignment_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:422:1: ( rule__Task__TextAssignment_1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:422:2: rule__Task__TextAssignment_1
            {
            pushFollow(FOLLOW_rule__Task__TextAssignment_1_in_rule__Task__Group__1__Impl819);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:436:1: rule__Note__Group__0 : rule__Note__Group__0__Impl rule__Note__Group__1 ;
    public final void rule__Note__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:440:1: ( rule__Note__Group__0__Impl rule__Note__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:441:2: rule__Note__Group__0__Impl rule__Note__Group__1
            {
            pushFollow(FOLLOW_rule__Note__Group__0__Impl_in_rule__Note__Group__0853);
            rule__Note__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__1_in_rule__Note__Group__0856);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:448:1: rule__Note__Group__0__Impl : ( ( rule__Note__IntendAssignment_0 )* ) ;
    public final void rule__Note__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:452:1: ( ( ( rule__Note__IntendAssignment_0 )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:453:1: ( ( rule__Note__IntendAssignment_0 )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:453:1: ( ( rule__Note__IntendAssignment_0 )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:454:1: ( rule__Note__IntendAssignment_0 )*
            {
             before(grammarAccess.getNoteAccess().getIntendAssignment_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:455:1: ( rule__Note__IntendAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_WS) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:455:2: rule__Note__IntendAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Note__IntendAssignment_0_in_rule__Note__Group__0__Impl883);
            	    rule__Note__IntendAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:465:1: rule__Note__Group__1 : rule__Note__Group__1__Impl ;
    public final void rule__Note__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:469:1: ( rule__Note__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:470:2: rule__Note__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Note__Group__1__Impl_in_rule__Note__Group__1914);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:476:1: rule__Note__Group__1__Impl : ( ( rule__Note__TextAssignment_1 ) ) ;
    public final void rule__Note__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:480:1: ( ( ( rule__Note__TextAssignment_1 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:481:1: ( ( rule__Note__TextAssignment_1 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:481:1: ( ( rule__Note__TextAssignment_1 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:482:1: ( rule__Note__TextAssignment_1 )
            {
             before(grammarAccess.getNoteAccess().getTextAssignment_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:483:1: ( rule__Note__TextAssignment_1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:483:2: rule__Note__TextAssignment_1
            {
            pushFollow(FOLLOW_rule__Note__TextAssignment_1_in_rule__Note__Group__1__Impl941);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:497:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:501:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:502:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FOLLOW_rule__Project__Group__0__Impl_in_rule__Project__Group__0975);
            rule__Project__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__1_in_rule__Project__Group__0978);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:509:1: rule__Project__Group__0__Impl : ( ( rule__Project__IntendAssignment_0 )* ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:513:1: ( ( ( rule__Project__IntendAssignment_0 )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:514:1: ( ( rule__Project__IntendAssignment_0 )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:514:1: ( ( rule__Project__IntendAssignment_0 )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:515:1: ( rule__Project__IntendAssignment_0 )*
            {
             before(grammarAccess.getProjectAccess().getIntendAssignment_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:516:1: ( rule__Project__IntendAssignment_0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_WS) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:516:2: rule__Project__IntendAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Project__IntendAssignment_0_in_rule__Project__Group__0__Impl1005);
            	    rule__Project__IntendAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:526:1: rule__Project__Group__1 : rule__Project__Group__1__Impl ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:530:1: ( rule__Project__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:531:2: rule__Project__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group__1__Impl_in_rule__Project__Group__11036);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:537:1: rule__Project__Group__1__Impl : ( ( rule__Project__TextAssignment_1 ) ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:541:1: ( ( ( rule__Project__TextAssignment_1 ) ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:542:1: ( ( rule__Project__TextAssignment_1 ) )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:542:1: ( ( rule__Project__TextAssignment_1 ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:543:1: ( rule__Project__TextAssignment_1 )
            {
             before(grammarAccess.getProjectAccess().getTextAssignment_1()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:544:1: ( rule__Project__TextAssignment_1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:544:2: rule__Project__TextAssignment_1
            {
            pushFollow(FOLLOW_rule__Project__TextAssignment_1_in_rule__Project__Group__1__Impl1063);
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


    // $ANTLR start "rule__Spaces__Group__0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:558:1: rule__Spaces__Group__0 : rule__Spaces__Group__0__Impl rule__Spaces__Group__1 ;
    public final void rule__Spaces__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:562:1: ( rule__Spaces__Group__0__Impl rule__Spaces__Group__1 )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:563:2: rule__Spaces__Group__0__Impl rule__Spaces__Group__1
            {
            pushFollow(FOLLOW_rule__Spaces__Group__0__Impl_in_rule__Spaces__Group__01097);
            rule__Spaces__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spaces__Group__1_in_rule__Spaces__Group__01100);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:570:1: rule__Spaces__Group__0__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Spaces__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:574:1: ( ( ( RULE_WS )* ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:575:1: ( ( RULE_WS )* )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:575:1: ( ( RULE_WS )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:576:1: ( RULE_WS )*
            {
             before(grammarAccess.getSpacesAccess().getWSTerminalRuleCall_0()); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:577:1: ( RULE_WS )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_WS) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:577:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Spaces__Group__0__Impl1128); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSpacesAccess().getWSTerminalRuleCall_0()); 

            }


            }

        }
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:587:1: rule__Spaces__Group__1 : rule__Spaces__Group__1__Impl ;
    public final void rule__Spaces__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:591:1: ( rule__Spaces__Group__1__Impl )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:592:2: rule__Spaces__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Spaces__Group__1__Impl_in_rule__Spaces__Group__11159);
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:598:1: rule__Spaces__Group__1__Impl : ( RULE_NL ) ;
    public final void rule__Spaces__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:602:1: ( ( RULE_NL ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:603:1: ( RULE_NL )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:603:1: ( RULE_NL )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:604:1: RULE_NL
            {
             before(grammarAccess.getSpacesAccess().getNLTerminalRuleCall_1()); 
            match(input,RULE_NL,FOLLOW_RULE_NL_in_rule__Spaces__Group__1__Impl1186); 
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


    // $ANTLR start "rule__TaskModel__ContentsAssignment_1_0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:620:1: rule__TaskModel__ContentsAssignment_1_0 : ( ruleContent ) ;
    public final void rule__TaskModel__ContentsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:624:1: ( ( ruleContent ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:625:1: ( ruleContent )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:625:1: ( ruleContent )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:626:1: ruleContent
            {
             before(grammarAccess.getTaskModelAccess().getContentsContentParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleContent_in_rule__TaskModel__ContentsAssignment_1_01224);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getTaskModelAccess().getContentsContentParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskModel__ContentsAssignment_1_0"


    // $ANTLR start "rule__Task__IntendAssignment_0"
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:635:1: rule__Task__IntendAssignment_0 : ( RULE_WS ) ;
    public final void rule__Task__IntendAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:639:1: ( ( RULE_WS ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:640:1: ( RULE_WS )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:640:1: ( RULE_WS )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:641:1: RULE_WS
            {
             before(grammarAccess.getTaskAccess().getIntendWSTerminalRuleCall_0_0()); 
            match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Task__IntendAssignment_01255); 
             after(grammarAccess.getTaskAccess().getIntendWSTerminalRuleCall_0_0()); 

            }


            }

        }
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:650:1: rule__Task__TextAssignment_1 : ( RULE_TASK_TEXT ) ;
    public final void rule__Task__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:654:1: ( ( RULE_TASK_TEXT ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:655:1: ( RULE_TASK_TEXT )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:655:1: ( RULE_TASK_TEXT )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:656:1: RULE_TASK_TEXT
            {
             before(grammarAccess.getTaskAccess().getTextTASK_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_TASK_TEXT,FOLLOW_RULE_TASK_TEXT_in_rule__Task__TextAssignment_11286); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:665:1: rule__Note__IntendAssignment_0 : ( RULE_WS ) ;
    public final void rule__Note__IntendAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:669:1: ( ( RULE_WS ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:670:1: ( RULE_WS )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:670:1: ( RULE_WS )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:671:1: RULE_WS
            {
             before(grammarAccess.getNoteAccess().getIntendWSTerminalRuleCall_0_0()); 
            match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Note__IntendAssignment_01317); 
             after(grammarAccess.getNoteAccess().getIntendWSTerminalRuleCall_0_0()); 

            }


            }

        }
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:680:1: rule__Note__TextAssignment_1 : ( RULE_TEXT ) ;
    public final void rule__Note__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:684:1: ( ( RULE_TEXT ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:685:1: ( RULE_TEXT )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:685:1: ( RULE_TEXT )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:686:1: RULE_TEXT
            {
             before(grammarAccess.getNoteAccess().getTextTEXTTerminalRuleCall_1_0()); 
            match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_rule__Note__TextAssignment_11348); 
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:695:1: rule__Project__IntendAssignment_0 : ( RULE_WS ) ;
    public final void rule__Project__IntendAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:699:1: ( ( RULE_WS ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:700:1: ( RULE_WS )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:700:1: ( RULE_WS )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:701:1: RULE_WS
            {
             before(grammarAccess.getProjectAccess().getIntendWSTerminalRuleCall_0_0()); 
            match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Project__IntendAssignment_01379); 
             after(grammarAccess.getProjectAccess().getIntendWSTerminalRuleCall_0_0()); 

            }


            }

        }
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
    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:710:1: rule__Project__TextAssignment_1 : ( RULE_PROJECT_ ) ;
    public final void rule__Project__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:714:1: ( ( RULE_PROJECT_ ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:715:1: ( RULE_PROJECT_ )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:715:1: ( RULE_PROJECT_ )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:716:1: RULE_PROJECT_
            {
             before(grammarAccess.getProjectAccess().getTextPROJECT_TerminalRuleCall_1_0()); 
            match(input,RULE_PROJECT_,FOLLOW_RULE_PROJECT__in_rule__Project__TextAssignment_11410); 
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

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA1_eotS =
        "\4\uffff";
    static final String DFA1_eofS =
        "\4\uffff";
    static final String DFA1_minS =
        "\2\4\2\uffff";
    static final String DFA1_maxS =
        "\2\10\2\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA1_specialS =
        "\4\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\1\3\3\2",
            "\1\1\1\3\3\2",
            "",
            ""
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
            return "229:1: rule__TaskModel__Alternatives_1 : ( ( ( rule__TaskModel__ContentsAssignment_1_0 ) ) | ( ruleSpaces ) );";
        }
    }
    static final String DFA2_eotS =
        "\5\uffff";
    static final String DFA2_eofS =
        "\5\uffff";
    static final String DFA2_minS =
        "\2\4\3\uffff";
    static final String DFA2_maxS =
        "\2\10\3\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\1\1\2\1\3";
    static final String DFA2_specialS =
        "\5\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\1\uffff\1\3\1\4\1\2",
            "\1\1\1\uffff\1\3\1\4\1\2",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "251:1: rule__Content__Alternatives : ( ( ruleProject ) | ( ruleTask ) | ( ruleNote ) );";
        }
    }
    static final String DFA3_eotS =
        "\4\uffff";
    static final String DFA3_eofS =
        "\2\2\2\uffff";
    static final String DFA3_minS =
        "\2\4\2\uffff";
    static final String DFA3_maxS =
        "\2\10\2\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA3_specialS =
        "\4\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\4\3",
            "\1\1\4\3",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "()* loopback of 331:1: ( rule__TaskModel__Alternatives_1 )*";
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
    public static final BitSet FOLLOW_ruleSpaces_in_entryRuleSpaces361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpaces368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spaces__Group__0_in_ruleSpaces394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskModel__ContentsAssignment_1_0_in_rule__TaskModel__Alternatives_1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpaces_in_rule__TaskModel__Alternatives_1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_rule__Content__Alternatives480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_rule__Content__Alternatives497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Content__Alternatives514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskModel__Group__0__Impl_in_rule__TaskModel__Group__0544 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_rule__TaskModel__Group__1_in_rule__TaskModel__Group__0547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskModel__Group__1__Impl_in_rule__TaskModel__Group__1605 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_rule__TaskModel__Group__2_in_rule__TaskModel__Group__1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TaskModel__Alternatives_1_in_rule__TaskModel__Group__1__Impl635 = new BitSet(new long[]{0x00000000000001F2L});
    public static final BitSet FOLLOW_rule__TaskModel__Group__2__Impl_in_rule__TaskModel__Group__2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__TaskModel__Group__2__Impl694 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Task__Group__0__Impl_in_rule__Task__Group__0731 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Task__Group__1_in_rule__Task__Group__0734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__IntendAssignment_0_in_rule__Task__Group__0__Impl761 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Task__Group__1__Impl_in_rule__Task__Group__1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__TextAssignment_1_in_rule__Task__Group__1__Impl819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__0__Impl_in_rule__Note__Group__0853 = new BitSet(new long[]{0x00000000000001D0L});
    public static final BitSet FOLLOW_rule__Note__Group__1_in_rule__Note__Group__0856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__IntendAssignment_0_in_rule__Note__Group__0__Impl883 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Note__Group__1__Impl_in_rule__Note__Group__1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__TextAssignment_1_in_rule__Note__Group__1__Impl941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__0__Impl_in_rule__Project__Group__0975 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_rule__Project__Group__1_in_rule__Project__Group__0978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__IntendAssignment_0_in_rule__Project__Group__0__Impl1005 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Project__Group__1__Impl_in_rule__Project__Group__11036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__TextAssignment_1_in_rule__Project__Group__1__Impl1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spaces__Group__0__Impl_in_rule__Spaces__Group__01097 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_rule__Spaces__Group__1_in_rule__Spaces__Group__01100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Spaces__Group__0__Impl1128 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Spaces__Group__1__Impl_in_rule__Spaces__Group__11159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NL_in_rule__Spaces__Group__1__Impl1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_rule__TaskModel__ContentsAssignment_1_01224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Task__IntendAssignment_01255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TASK_TEXT_in_rule__Task__TextAssignment_11286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Note__IntendAssignment_01317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_rule__Note__TextAssignment_11348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Project__IntendAssignment_01379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PROJECT__in_rule__Project__TextAssignment_11410 = new BitSet(new long[]{0x0000000000000002L});

}