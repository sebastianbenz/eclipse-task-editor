package de.sebastianbenz.task.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.sebastianbenz.task.services.TaskPaperGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTaskPaperParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_TASK_OPEN", "RULE_TASK_CLOSED", "RULE_NOTE_CONTENT", "RULE_PROJECT_1", "RULE_PROJECT_2", "RULE_PROJECT_3", "RULE_SPACE", "RULE_NL", "RULE_TASK_START", "RULE_PROJECT_DELIMITER"
    };
    public static final int RULE_PROJECT_3=10;
    public static final int RULE_TASK_START=13;
    public static final int RULE_PROJECT_2=9;
    public static final int RULE_PROJECT_1=8;
    public static final int RULE_TASK_CLOSED=6;
    public static final int RULE_NL=12;
    public static final int RULE_NOTE_CONTENT=7;
    public static final int RULE_PROJECT_DELIMITER=14;
    public static final int RULE_WS=4;
    public static final int EOF=-1;
    public static final int RULE_SPACE=11;
    public static final int RULE_TASK_OPEN=5;

    // delegates
    // delegators


        public InternalTaskPaperParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTaskPaperParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTaskPaperParser.tokenNames; }
    public String getGrammarFileName() { return "../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g"; }



     	private TaskPaperGrammarAccess grammarAccess;
     	
        public InternalTaskPaperParser(TokenStream input, TaskPaperGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Todo";	
       	}
       	
       	@Override
       	protected TaskPaperGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTodo"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:67:1: entryRuleTodo returns [EObject current=null] : iv_ruleTodo= ruleTodo EOF ;
    public final EObject entryRuleTodo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTodo = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:68:2: (iv_ruleTodo= ruleTodo EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:69:2: iv_ruleTodo= ruleTodo EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTodoRule()); 
            }
            pushFollow(FOLLOW_ruleTodo_in_entryRuleTodo75);
            iv_ruleTodo=ruleTodo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTodo; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTodo85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTodo"


    // $ANTLR start "ruleTodo"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:76:1: ruleTodo returns [EObject current=null] : ( () ( (lv_contents_1_0= ruleContent ) )+ (this_WS_2= RULE_WS )* ) ;
    public final EObject ruleTodo() throws RecognitionException {
        EObject current = null;

        Token this_WS_2=null;
        EObject lv_contents_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:79:28: ( ( () ( (lv_contents_1_0= ruleContent ) )+ (this_WS_2= RULE_WS )* ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:80:1: ( () ( (lv_contents_1_0= ruleContent ) )+ (this_WS_2= RULE_WS )* )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:80:1: ( () ( (lv_contents_1_0= ruleContent ) )+ (this_WS_2= RULE_WS )* )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:80:2: () ( (lv_contents_1_0= ruleContent ) )+ (this_WS_2= RULE_WS )*
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:80:2: ()
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:81:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTodoAccess().getTodoAction_0(),
                          current);
                  
            }

            }

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:86:2: ( (lv_contents_1_0= ruleContent ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:87:1: (lv_contents_1_0= ruleContent )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:87:1: (lv_contents_1_0= ruleContent )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:88:3: lv_contents_1_0= ruleContent
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTodoAccess().getContentsContentParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleContent_in_ruleTodo140);
            	    lv_contents_1_0=ruleContent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTodoRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"contents",
            	              		lv_contents_1_0, 
            	              		"Content");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:104:3: (this_WS_2= RULE_WS )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_WS) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:104:4: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTodo153); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_2, grammarAccess.getTodoAccess().getWSTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTodo"


    // $ANTLR start "entryRuleContent"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:116:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:117:2: (iv_ruleContent= ruleContent EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:118:2: iv_ruleContent= ruleContent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentRule()); 
            }
            pushFollow(FOLLOW_ruleContent_in_entryRuleContent190);
            iv_ruleContent=ruleContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContent200); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:125:1: ruleContent returns [EObject current=null] : ( ( ( ruleProject )=>this_Project_0= ruleProject ) | ( ( ruleTask )=>this_Task_1= ruleTask ) | this_Note_2= ruleNote | this_Spaces_3= ruleSpaces ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        EObject this_Project_0 = null;

        EObject this_Task_1 = null;

        EObject this_Note_2 = null;

        EObject this_Spaces_3 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:128:28: ( ( ( ( ruleProject )=>this_Project_0= ruleProject ) | ( ( ruleTask )=>this_Task_1= ruleTask ) | this_Note_2= ruleNote | this_Spaces_3= ruleSpaces ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:129:1: ( ( ( ruleProject )=>this_Project_0= ruleProject ) | ( ( ruleTask )=>this_Task_1= ruleTask ) | this_Note_2= ruleNote | this_Spaces_3= ruleSpaces )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:129:1: ( ( ( ruleProject )=>this_Project_0= ruleProject ) | ( ( ruleTask )=>this_Task_1= ruleTask ) | this_Note_2= ruleNote | this_Spaces_3= ruleSpaces )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_WS) && (synpred1_InternalTaskPaper())) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_PROJECT_1) && (synpred1_InternalTaskPaper())) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_PROJECT_2) && (synpred1_InternalTaskPaper())) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_PROJECT_3) && (synpred1_InternalTaskPaper())) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_TASK_CLOSED) && (synpred2_InternalTaskPaper())) {
                alt3=2;
            }
            else if ( (LA3_0==RULE_TASK_OPEN) && (synpred2_InternalTaskPaper())) {
                alt3=2;
            }
            else if ( (LA3_0==RULE_NOTE_CONTENT) ) {
                alt3=3;
            }
            else if ( (LA3_0==RULE_SPACE) ) {
                alt3=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:129:2: ( ( ruleProject )=>this_Project_0= ruleProject )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:129:2: ( ( ruleProject )=>this_Project_0= ruleProject )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:129:3: ( ruleProject )=>this_Project_0= ruleProject
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getContentAccess().getProjectParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleProject_in_ruleContent253);
                    this_Project_0=ruleProject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Project_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:139:6: ( ( ruleTask )=>this_Task_1= ruleTask )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:139:6: ( ( ruleTask )=>this_Task_1= ruleTask )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:139:7: ( ruleTask )=>this_Task_1= ruleTask
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getContentAccess().getTaskParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTask_in_ruleContent287);
                    this_Task_1=ruleTask();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Task_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:150:5: this_Note_2= ruleNote
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getContentAccess().getNoteParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNote_in_ruleContent315);
                    this_Note_2=ruleNote();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Note_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:160:5: this_Spaces_3= ruleSpaces
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getContentAccess().getSpacesParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSpaces_in_ruleContent342);
                    this_Spaces_3=ruleSpaces();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Spaces_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleTask"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:176:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:177:2: (iv_ruleTask= ruleTask EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:178:2: iv_ruleTask= ruleTask EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTaskRule()); 
            }
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask377);
            iv_ruleTask=ruleTask();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTask; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask387); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:185:1: ruleTask returns [EObject current=null] : ( ( ( ruleClosedTask )=>this_ClosedTask_0= ruleClosedTask ) | this_OpenTask_1= ruleOpenTask ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        EObject this_ClosedTask_0 = null;

        EObject this_OpenTask_1 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:188:28: ( ( ( ( ruleClosedTask )=>this_ClosedTask_0= ruleClosedTask ) | this_OpenTask_1= ruleOpenTask ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:189:1: ( ( ( ruleClosedTask )=>this_ClosedTask_0= ruleClosedTask ) | this_OpenTask_1= ruleOpenTask )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:189:1: ( ( ( ruleClosedTask )=>this_ClosedTask_0= ruleClosedTask ) | this_OpenTask_1= ruleOpenTask )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_TASK_CLOSED) && (synpred3_InternalTaskPaper())) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_TASK_OPEN) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:189:2: ( ( ruleClosedTask )=>this_ClosedTask_0= ruleClosedTask )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:189:2: ( ( ruleClosedTask )=>this_ClosedTask_0= ruleClosedTask )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:189:3: ( ruleClosedTask )=>this_ClosedTask_0= ruleClosedTask
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTaskAccess().getClosedTaskParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClosedTask_in_ruleTask440);
                    this_ClosedTask_0=ruleClosedTask();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ClosedTask_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:200:5: this_OpenTask_1= ruleOpenTask
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTaskAccess().getOpenTaskParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpenTask_in_ruleTask468);
                    this_OpenTask_1=ruleOpenTask();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OpenTask_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleOpenTask"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:216:1: entryRuleOpenTask returns [EObject current=null] : iv_ruleOpenTask= ruleOpenTask EOF ;
    public final EObject entryRuleOpenTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenTask = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:217:2: (iv_ruleOpenTask= ruleOpenTask EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:218:2: iv_ruleOpenTask= ruleOpenTask EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpenTaskRule()); 
            }
            pushFollow(FOLLOW_ruleOpenTask_in_entryRuleOpenTask503);
            iv_ruleOpenTask=ruleOpenTask();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpenTask; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpenTask513); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpenTask"


    // $ANTLR start "ruleOpenTask"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:225:1: ruleOpenTask returns [EObject current=null] : ( () ( (lv_text_1_0= RULE_TASK_OPEN ) ) ) ;
    public final EObject ruleOpenTask() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:228:28: ( ( () ( (lv_text_1_0= RULE_TASK_OPEN ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:229:1: ( () ( (lv_text_1_0= RULE_TASK_OPEN ) ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:229:1: ( () ( (lv_text_1_0= RULE_TASK_OPEN ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:229:2: () ( (lv_text_1_0= RULE_TASK_OPEN ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:229:2: ()
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:230:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOpenTaskAccess().getOpenTaskAction_0(),
                          current);
                  
            }

            }

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:235:2: ( (lv_text_1_0= RULE_TASK_OPEN ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:236:1: (lv_text_1_0= RULE_TASK_OPEN )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:236:1: (lv_text_1_0= RULE_TASK_OPEN )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:237:3: lv_text_1_0= RULE_TASK_OPEN
            {
            lv_text_1_0=(Token)match(input,RULE_TASK_OPEN,FOLLOW_RULE_TASK_OPEN_in_ruleOpenTask564); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_text_1_0, grammarAccess.getOpenTaskAccess().getTextTASK_OPENTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOpenTaskRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"text",
                      		lv_text_1_0, 
                      		"TASK_OPEN");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpenTask"


    // $ANTLR start "entryRuleClosedTask"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:261:1: entryRuleClosedTask returns [EObject current=null] : iv_ruleClosedTask= ruleClosedTask EOF ;
    public final EObject entryRuleClosedTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClosedTask = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:262:2: (iv_ruleClosedTask= ruleClosedTask EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:263:2: iv_ruleClosedTask= ruleClosedTask EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClosedTaskRule()); 
            }
            pushFollow(FOLLOW_ruleClosedTask_in_entryRuleClosedTask605);
            iv_ruleClosedTask=ruleClosedTask();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClosedTask; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClosedTask615); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClosedTask"


    // $ANTLR start "ruleClosedTask"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:270:1: ruleClosedTask returns [EObject current=null] : ( () ( (lv_text_1_0= RULE_TASK_CLOSED ) ) ) ;
    public final EObject ruleClosedTask() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:273:28: ( ( () ( (lv_text_1_0= RULE_TASK_CLOSED ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:274:1: ( () ( (lv_text_1_0= RULE_TASK_CLOSED ) ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:274:1: ( () ( (lv_text_1_0= RULE_TASK_CLOSED ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:274:2: () ( (lv_text_1_0= RULE_TASK_CLOSED ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:274:2: ()
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:275:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getClosedTaskAccess().getClosedTaskAction_0(),
                          current);
                  
            }

            }

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:280:2: ( (lv_text_1_0= RULE_TASK_CLOSED ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:281:1: (lv_text_1_0= RULE_TASK_CLOSED )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:281:1: (lv_text_1_0= RULE_TASK_CLOSED )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:282:3: lv_text_1_0= RULE_TASK_CLOSED
            {
            lv_text_1_0=(Token)match(input,RULE_TASK_CLOSED,FOLLOW_RULE_TASK_CLOSED_in_ruleClosedTask666); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_text_1_0, grammarAccess.getClosedTaskAccess().getTextTASK_CLOSEDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClosedTaskRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"text",
                      		lv_text_1_0, 
                      		"TASK_CLOSED");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClosedTask"


    // $ANTLR start "entryRuleNote"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:306:1: entryRuleNote returns [EObject current=null] : iv_ruleNote= ruleNote EOF ;
    public final EObject entryRuleNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNote = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:307:2: (iv_ruleNote= ruleNote EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:308:2: iv_ruleNote= ruleNote EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNoteRule()); 
            }
            pushFollow(FOLLOW_ruleNote_in_entryRuleNote707);
            iv_ruleNote=ruleNote();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNote; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNote717); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNote"


    // $ANTLR start "ruleNote"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:315:1: ruleNote returns [EObject current=null] : ( (lv_text_0_0= RULE_NOTE_CONTENT ) ) ;
    public final EObject ruleNote() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:318:28: ( ( (lv_text_0_0= RULE_NOTE_CONTENT ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:319:1: ( (lv_text_0_0= RULE_NOTE_CONTENT ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:319:1: ( (lv_text_0_0= RULE_NOTE_CONTENT ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:320:1: (lv_text_0_0= RULE_NOTE_CONTENT )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:320:1: (lv_text_0_0= RULE_NOTE_CONTENT )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:321:3: lv_text_0_0= RULE_NOTE_CONTENT
            {
            lv_text_0_0=(Token)match(input,RULE_NOTE_CONTENT,FOLLOW_RULE_NOTE_CONTENT_in_ruleNote758); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_text_0_0, grammarAccess.getNoteAccess().getTextNOTE_CONTENTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNoteRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"text",
                      		lv_text_0_0, 
                      		"NOTE_CONTENT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNote"


    // $ANTLR start "entryRuleProject"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:345:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:346:2: (iv_ruleProject= ruleProject EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:347:2: iv_ruleProject= ruleProject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProjectRule()); 
            }
            pushFollow(FOLLOW_ruleProject_in_entryRuleProject798);
            iv_ruleProject=ruleProject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProject; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProject808); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:354:1: ruleProject returns [EObject current=null] : ( () ( ( ( ( RULE_WS ) ) )=> ( (lv_intend_1_0= RULE_WS ) ) )* ( ( (lv_text_2_1= RULE_PROJECT_1 | lv_text_2_2= RULE_PROJECT_2 | lv_text_2_3= RULE_PROJECT_3 ) ) ) ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token lv_intend_1_0=null;
        Token lv_text_2_1=null;
        Token lv_text_2_2=null;
        Token lv_text_2_3=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:357:28: ( ( () ( ( ( ( RULE_WS ) ) )=> ( (lv_intend_1_0= RULE_WS ) ) )* ( ( (lv_text_2_1= RULE_PROJECT_1 | lv_text_2_2= RULE_PROJECT_2 | lv_text_2_3= RULE_PROJECT_3 ) ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:358:1: ( () ( ( ( ( RULE_WS ) ) )=> ( (lv_intend_1_0= RULE_WS ) ) )* ( ( (lv_text_2_1= RULE_PROJECT_1 | lv_text_2_2= RULE_PROJECT_2 | lv_text_2_3= RULE_PROJECT_3 ) ) ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:358:1: ( () ( ( ( ( RULE_WS ) ) )=> ( (lv_intend_1_0= RULE_WS ) ) )* ( ( (lv_text_2_1= RULE_PROJECT_1 | lv_text_2_2= RULE_PROJECT_2 | lv_text_2_3= RULE_PROJECT_3 ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:358:2: () ( ( ( ( RULE_WS ) ) )=> ( (lv_intend_1_0= RULE_WS ) ) )* ( ( (lv_text_2_1= RULE_PROJECT_1 | lv_text_2_2= RULE_PROJECT_2 | lv_text_2_3= RULE_PROJECT_3 ) ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:358:2: ()
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:359:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getProjectAccess().getProjectAction_0(),
                          current);
                  
            }

            }

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:364:2: ( ( ( ( RULE_WS ) ) )=> ( (lv_intend_1_0= RULE_WS ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_WS) && (synpred4_InternalTaskPaper())) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:364:3: ( ( ( RULE_WS ) ) )=> ( (lv_intend_1_0= RULE_WS ) )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:369:5: ( (lv_intend_1_0= RULE_WS ) )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:370:1: (lv_intend_1_0= RULE_WS )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:370:1: (lv_intend_1_0= RULE_WS )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:371:3: lv_intend_1_0= RULE_WS
            	    {
            	    lv_intend_1_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleProject873); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_intend_1_0, grammarAccess.getProjectAccess().getIntendWSTerminalRuleCall_1_0_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getProjectRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"intend",
            	              		lv_intend_1_0, 
            	              		"WS");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:387:4: ( ( (lv_text_2_1= RULE_PROJECT_1 | lv_text_2_2= RULE_PROJECT_2 | lv_text_2_3= RULE_PROJECT_3 ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:388:1: ( (lv_text_2_1= RULE_PROJECT_1 | lv_text_2_2= RULE_PROJECT_2 | lv_text_2_3= RULE_PROJECT_3 ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:388:1: ( (lv_text_2_1= RULE_PROJECT_1 | lv_text_2_2= RULE_PROJECT_2 | lv_text_2_3= RULE_PROJECT_3 ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:389:1: (lv_text_2_1= RULE_PROJECT_1 | lv_text_2_2= RULE_PROJECT_2 | lv_text_2_3= RULE_PROJECT_3 )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:389:1: (lv_text_2_1= RULE_PROJECT_1 | lv_text_2_2= RULE_PROJECT_2 | lv_text_2_3= RULE_PROJECT_3 )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_PROJECT_1:
                {
                alt6=1;
                }
                break;
            case RULE_PROJECT_2:
                {
                alt6=2;
                }
                break;
            case RULE_PROJECT_3:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:390:3: lv_text_2_1= RULE_PROJECT_1
                    {
                    lv_text_2_1=(Token)match(input,RULE_PROJECT_1,FOLLOW_RULE_PROJECT_1_in_ruleProject899); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_text_2_1, grammarAccess.getProjectAccess().getTextPROJECT_1TerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getProjectRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"text",
                              		lv_text_2_1, 
                              		"PROJECT_1");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:405:8: lv_text_2_2= RULE_PROJECT_2
                    {
                    lv_text_2_2=(Token)match(input,RULE_PROJECT_2,FOLLOW_RULE_PROJECT_2_in_ruleProject919); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_text_2_2, grammarAccess.getProjectAccess().getTextPROJECT_2TerminalRuleCall_2_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getProjectRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"text",
                              		lv_text_2_2, 
                              		"PROJECT_2");
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:420:8: lv_text_2_3= RULE_PROJECT_3
                    {
                    lv_text_2_3=(Token)match(input,RULE_PROJECT_3,FOLLOW_RULE_PROJECT_3_in_ruleProject939); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_text_2_3, grammarAccess.getProjectAccess().getTextPROJECT_3TerminalRuleCall_2_0_2()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getProjectRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"text",
                              		lv_text_2_3, 
                              		"PROJECT_3");
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleSpaces"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:446:1: entryRuleSpaces returns [EObject current=null] : iv_ruleSpaces= ruleSpaces EOF ;
    public final EObject entryRuleSpaces() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpaces = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:447:2: (iv_ruleSpaces= ruleSpaces EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:448:2: iv_ruleSpaces= ruleSpaces EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpacesRule()); 
            }
            pushFollow(FOLLOW_ruleSpaces_in_entryRuleSpaces983);
            iv_ruleSpaces=ruleSpaces();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpaces; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpaces993); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpaces"


    // $ANTLR start "ruleSpaces"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:455:1: ruleSpaces returns [EObject current=null] : ( (lv_text_0_0= RULE_SPACE ) ) ;
    public final EObject ruleSpaces() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:458:28: ( ( (lv_text_0_0= RULE_SPACE ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:459:1: ( (lv_text_0_0= RULE_SPACE ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:459:1: ( (lv_text_0_0= RULE_SPACE ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:460:1: (lv_text_0_0= RULE_SPACE )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:460:1: (lv_text_0_0= RULE_SPACE )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:461:3: lv_text_0_0= RULE_SPACE
            {
            lv_text_0_0=(Token)match(input,RULE_SPACE,FOLLOW_RULE_SPACE_in_ruleSpaces1034); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_text_0_0, grammarAccess.getSpacesAccess().getTextSPACETerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSpacesRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"text",
                      		lv_text_0_0, 
                      		"SPACE");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpaces"

    // $ANTLR start synpred1_InternalTaskPaper
    public final void synpred1_InternalTaskPaper_fragment() throws RecognitionException {   
        // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:129:3: ( ruleProject )
        // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:129:5: ruleProject
        {
        pushFollow(FOLLOW_ruleProject_in_synpred1_InternalTaskPaper237);
        ruleProject();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalTaskPaper

    // $ANTLR start synpred2_InternalTaskPaper
    public final void synpred2_InternalTaskPaper_fragment() throws RecognitionException {   
        // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:139:7: ( ruleTask )
        // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:139:9: ruleTask
        {
        pushFollow(FOLLOW_ruleTask_in_synpred2_InternalTaskPaper271);
        ruleTask();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalTaskPaper

    // $ANTLR start synpred3_InternalTaskPaper
    public final void synpred3_InternalTaskPaper_fragment() throws RecognitionException {   
        // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:189:3: ( ruleClosedTask )
        // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:189:5: ruleClosedTask
        {
        pushFollow(FOLLOW_ruleClosedTask_in_synpred3_InternalTaskPaper424);
        ruleClosedTask();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalTaskPaper

    // $ANTLR start synpred4_InternalTaskPaper
    public final void synpred4_InternalTaskPaper_fragment() throws RecognitionException {   
        // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:364:3: ( ( ( RULE_WS ) ) )
        // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:364:4: ( ( RULE_WS ) )
        {
        // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:364:4: ( ( RULE_WS ) )
        // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:365:1: ( RULE_WS )
        {
        // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:365:1: ( RULE_WS )
        // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:366:1: RULE_WS
        {
        match(input,RULE_WS,FOLLOW_RULE_WS_in_synpred4_InternalTaskPaper857); if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4_InternalTaskPaper

    // Delegated rules

    public final boolean synpred2_InternalTaskPaper() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalTaskPaper_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalTaskPaper() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalTaskPaper_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalTaskPaper() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalTaskPaper_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalTaskPaper() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalTaskPaper_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\4\uffff";
    static final String DFA1_eofS =
        "\2\2\2\uffff";
    static final String DFA1_minS =
        "\2\4\2\uffff";
    static final String DFA1_maxS =
        "\1\13\1\12\2\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA1_specialS =
        "\4\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\7\3",
            "\1\1\3\uffff\3\3",
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
            return "()+ loopback of 86:2: ( (lv_contents_1_0= ruleContent ) )+";
        }
    }
 

    public static final BitSet FOLLOW_ruleTodo_in_entryRuleTodo75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTodo85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_ruleTodo140 = new BitSet(new long[]{0x0000000000000FF2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTodo153 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleContent_in_entryRuleContent190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContent200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_ruleContent253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_ruleContent287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_ruleContent315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpaces_in_ruleContent342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosedTask_in_ruleTask440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenTask_in_ruleTask468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenTask_in_entryRuleOpenTask503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpenTask513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TASK_OPEN_in_ruleOpenTask564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosedTask_in_entryRuleClosedTask605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClosedTask615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TASK_CLOSED_in_ruleClosedTask666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_entryRuleNote707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNote717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOTE_CONTENT_in_ruleNote758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleProject873 = new BitSet(new long[]{0x0000000000000710L});
    public static final BitSet FOLLOW_RULE_PROJECT_1_in_ruleProject899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PROJECT_2_in_ruleProject919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PROJECT_3_in_ruleProject939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpaces_in_entryRuleSpaces983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpaces993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SPACE_in_ruleSpaces1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_synpred1_InternalTaskPaper237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_synpred2_InternalTaskPaper271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosedTask_in_synpred3_InternalTaskPaper424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_synpred4_InternalTaskPaper857 = new BitSet(new long[]{0x0000000000000002L});

}