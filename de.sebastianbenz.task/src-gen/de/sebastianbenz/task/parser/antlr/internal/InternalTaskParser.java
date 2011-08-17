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
import de.sebastianbenz.task.services.TaskGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTaskParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TASK_TEXT", "RULE_TEXT", "RULE_PROJECT_", "RULE_CODE_", "RULE_SPACE", "RULE_TAB", "RULE_NL", "RULE_HYPHEN", "RULE_COLON"
    };
    public static final int RULE_COLON=12;
    public static final int RULE_CODE_=7;
    public static final int RULE_HYPHEN=11;
    public static final int RULE_PROJECT_=6;
    public static final int RULE_NL=10;
    public static final int RULE_TAB=9;
    public static final int RULE_TASK_TEXT=4;
    public static final int RULE_TEXT=5;
    public static final int EOF=-1;
    public static final int RULE_SPACE=8;

    // delegates
    // delegators


        public InternalTaskParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTaskParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTaskParser.tokenNames; }
    public String getGrammarFileName() { return "../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g"; }



     	private TaskGrammarAccess grammarAccess;
     	
        public InternalTaskParser(TokenStream input, TaskGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "TaskModel";	
       	}
       	
       	@Override
       	protected TaskGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTaskModel"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:67:1: entryRuleTaskModel returns [EObject current=null] : iv_ruleTaskModel= ruleTaskModel EOF ;
    public final EObject entryRuleTaskModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskModel = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:68:2: (iv_ruleTaskModel= ruleTaskModel EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:69:2: iv_ruleTaskModel= ruleTaskModel EOF
            {
             newCompositeNode(grammarAccess.getTaskModelRule()); 
            pushFollow(FOLLOW_ruleTaskModel_in_entryRuleTaskModel75);
            iv_ruleTaskModel=ruleTaskModel();

            state._fsp--;

             current =iv_ruleTaskModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaskModel85); 

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
    // $ANTLR end "entryRuleTaskModel"


    // $ANTLR start "ruleTaskModel"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:76:1: ruleTaskModel returns [EObject current=null] : ( () ( (lv_contents_1_0= ruleContent ) )* ( ruleWs )* ) ;
    public final EObject ruleTaskModel() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:79:28: ( ( () ( (lv_contents_1_0= ruleContent ) )* ( ruleWs )* ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:80:1: ( () ( (lv_contents_1_0= ruleContent ) )* ( ruleWs )* )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:80:1: ( () ( (lv_contents_1_0= ruleContent ) )* ( ruleWs )* )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:80:2: () ( (lv_contents_1_0= ruleContent ) )* ( ruleWs )*
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:80:2: ()
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTaskModelAccess().getTaskModelAction_0(),
                        current);
                

            }

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:86:2: ( (lv_contents_1_0= ruleContent ) )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:87:1: (lv_contents_1_0= ruleContent )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:87:1: (lv_contents_1_0= ruleContent )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:88:3: lv_contents_1_0= ruleContent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTaskModelAccess().getContentsContentParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContent_in_ruleTaskModel140);
            	    lv_contents_1_0=ruleContent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTaskModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"contents",
            	            		lv_contents_1_0, 
            	            		"Content");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:104:3: ( ruleWs )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_SPACE && LA2_0<=RULE_TAB)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:105:5: ruleWs
            	    {
            	     
            	            newCompositeNode(grammarAccess.getTaskModelAccess().getWsParserRuleCall_2()); 
            	        
            	    pushFollow(FOLLOW_ruleWs_in_ruleTaskModel158);
            	    ruleWs();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskModel"


    // $ANTLR start "entryRuleContent"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:120:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:121:2: (iv_ruleContent= ruleContent EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:122:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_ruleContent_in_entryRuleContent195);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContent205); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:129:1: ruleContent returns [EObject current=null] : (this_Project_0= ruleProject | this_Task_1= ruleTask | this_Note_2= ruleNote | this_EmptyLine_3= ruleEmptyLine | this_Code_4= ruleCode ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        EObject this_Project_0 = null;

        EObject this_Task_1 = null;

        EObject this_Note_2 = null;

        EObject this_EmptyLine_3 = null;

        EObject this_Code_4 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:132:28: ( (this_Project_0= ruleProject | this_Task_1= ruleTask | this_Note_2= ruleNote | this_EmptyLine_3= ruleEmptyLine | this_Code_4= ruleCode ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:133:1: (this_Project_0= ruleProject | this_Task_1= ruleTask | this_Note_2= ruleNote | this_EmptyLine_3= ruleEmptyLine | this_Code_4= ruleCode )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:133:1: (this_Project_0= ruleProject | this_Task_1= ruleTask | this_Note_2= ruleNote | this_EmptyLine_3= ruleEmptyLine | this_Code_4= ruleCode )
            int alt3=5;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:134:5: this_Project_0= ruleProject
                    {
                     
                            newCompositeNode(grammarAccess.getContentAccess().getProjectParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleProject_in_ruleContent252);
                    this_Project_0=ruleProject();

                    state._fsp--;

                     
                            current = this_Project_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:144:5: this_Task_1= ruleTask
                    {
                     
                            newCompositeNode(grammarAccess.getContentAccess().getTaskParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTask_in_ruleContent279);
                    this_Task_1=ruleTask();

                    state._fsp--;

                     
                            current = this_Task_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:154:5: this_Note_2= ruleNote
                    {
                     
                            newCompositeNode(grammarAccess.getContentAccess().getNoteParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNote_in_ruleContent306);
                    this_Note_2=ruleNote();

                    state._fsp--;

                     
                            current = this_Note_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:164:5: this_EmptyLine_3= ruleEmptyLine
                    {
                     
                            newCompositeNode(grammarAccess.getContentAccess().getEmptyLineParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleEmptyLine_in_ruleContent333);
                    this_EmptyLine_3=ruleEmptyLine();

                    state._fsp--;

                     
                            current = this_EmptyLine_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:174:5: this_Code_4= ruleCode
                    {
                     
                            newCompositeNode(grammarAccess.getContentAccess().getCodeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCode_in_ruleContent360);
                    this_Code_4=ruleCode();

                    state._fsp--;

                     
                            current = this_Code_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:190:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:191:2: (iv_ruleTask= ruleTask EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:192:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask395);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask405); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:199:1: ruleTask returns [EObject current=null] : ( ( (lv_intend_0_0= ruleIntendation ) ) ( (lv_text_1_0= RULE_TASK_TEXT ) ) ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        AntlrDatatypeRuleToken lv_intend_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:202:28: ( ( ( (lv_intend_0_0= ruleIntendation ) ) ( (lv_text_1_0= RULE_TASK_TEXT ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:203:1: ( ( (lv_intend_0_0= ruleIntendation ) ) ( (lv_text_1_0= RULE_TASK_TEXT ) ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:203:1: ( ( (lv_intend_0_0= ruleIntendation ) ) ( (lv_text_1_0= RULE_TASK_TEXT ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:203:2: ( (lv_intend_0_0= ruleIntendation ) ) ( (lv_text_1_0= RULE_TASK_TEXT ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:203:2: ( (lv_intend_0_0= ruleIntendation ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:204:1: (lv_intend_0_0= ruleIntendation )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:204:1: (lv_intend_0_0= ruleIntendation )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:205:3: lv_intend_0_0= ruleIntendation
            {
             
            	        newCompositeNode(grammarAccess.getTaskAccess().getIntendIntendationParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleIntendation_in_ruleTask451);
            lv_intend_0_0=ruleIntendation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTaskRule());
            	        }
                   		set(
                   			current, 
                   			"intend",
                    		lv_intend_0_0, 
                    		"Intendation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:221:2: ( (lv_text_1_0= RULE_TASK_TEXT ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:222:1: (lv_text_1_0= RULE_TASK_TEXT )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:222:1: (lv_text_1_0= RULE_TASK_TEXT )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:223:3: lv_text_1_0= RULE_TASK_TEXT
            {
            lv_text_1_0=(Token)match(input,RULE_TASK_TEXT,FOLLOW_RULE_TASK_TEXT_in_ruleTask468); 

            			newLeafNode(lv_text_1_0, grammarAccess.getTaskAccess().getTextTASK_TEXTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTaskRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_1_0, 
                    		"TASK_TEXT");
            	    

            }


            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleNote"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:247:1: entryRuleNote returns [EObject current=null] : iv_ruleNote= ruleNote EOF ;
    public final EObject entryRuleNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNote = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:248:2: (iv_ruleNote= ruleNote EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:249:2: iv_ruleNote= ruleNote EOF
            {
             newCompositeNode(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_ruleNote_in_entryRuleNote509);
            iv_ruleNote=ruleNote();

            state._fsp--;

             current =iv_ruleNote; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNote519); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:256:1: ruleNote returns [EObject current=null] : ( ( (lv_intend_0_0= ruleIntendation ) ) ( (lv_text_1_0= RULE_TEXT ) ) ) ;
    public final EObject ruleNote() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        AntlrDatatypeRuleToken lv_intend_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:259:28: ( ( ( (lv_intend_0_0= ruleIntendation ) ) ( (lv_text_1_0= RULE_TEXT ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:260:1: ( ( (lv_intend_0_0= ruleIntendation ) ) ( (lv_text_1_0= RULE_TEXT ) ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:260:1: ( ( (lv_intend_0_0= ruleIntendation ) ) ( (lv_text_1_0= RULE_TEXT ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:260:2: ( (lv_intend_0_0= ruleIntendation ) ) ( (lv_text_1_0= RULE_TEXT ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:260:2: ( (lv_intend_0_0= ruleIntendation ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:261:1: (lv_intend_0_0= ruleIntendation )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:261:1: (lv_intend_0_0= ruleIntendation )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:262:3: lv_intend_0_0= ruleIntendation
            {
             
            	        newCompositeNode(grammarAccess.getNoteAccess().getIntendIntendationParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleIntendation_in_ruleNote565);
            lv_intend_0_0=ruleIntendation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNoteRule());
            	        }
                   		set(
                   			current, 
                   			"intend",
                    		lv_intend_0_0, 
                    		"Intendation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:278:2: ( (lv_text_1_0= RULE_TEXT ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:279:1: (lv_text_1_0= RULE_TEXT )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:279:1: (lv_text_1_0= RULE_TEXT )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:280:3: lv_text_1_0= RULE_TEXT
            {
            lv_text_1_0=(Token)match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_ruleNote582); 

            			newLeafNode(lv_text_1_0, grammarAccess.getNoteAccess().getTextTEXTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNoteRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_1_0, 
                    		"TEXT");
            	    

            }


            }


            }


            }

             leaveRule(); 
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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:304:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:305:2: (iv_ruleProject= ruleProject EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:306:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_ruleProject_in_entryRuleProject623);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProject633); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:313:1: ruleProject returns [EObject current=null] : ( ( (lv_intend_0_0= ruleIntendation ) ) ( (lv_text_1_0= RULE_PROJECT_ ) ) ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        AntlrDatatypeRuleToken lv_intend_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:316:28: ( ( ( (lv_intend_0_0= ruleIntendation ) ) ( (lv_text_1_0= RULE_PROJECT_ ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:317:1: ( ( (lv_intend_0_0= ruleIntendation ) ) ( (lv_text_1_0= RULE_PROJECT_ ) ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:317:1: ( ( (lv_intend_0_0= ruleIntendation ) ) ( (lv_text_1_0= RULE_PROJECT_ ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:317:2: ( (lv_intend_0_0= ruleIntendation ) ) ( (lv_text_1_0= RULE_PROJECT_ ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:317:2: ( (lv_intend_0_0= ruleIntendation ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:318:1: (lv_intend_0_0= ruleIntendation )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:318:1: (lv_intend_0_0= ruleIntendation )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:319:3: lv_intend_0_0= ruleIntendation
            {
             
            	        newCompositeNode(grammarAccess.getProjectAccess().getIntendIntendationParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleIntendation_in_ruleProject679);
            lv_intend_0_0=ruleIntendation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	        }
                   		set(
                   			current, 
                   			"intend",
                    		lv_intend_0_0, 
                    		"Intendation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:335:2: ( (lv_text_1_0= RULE_PROJECT_ ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:336:1: (lv_text_1_0= RULE_PROJECT_ )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:336:1: (lv_text_1_0= RULE_PROJECT_ )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:337:3: lv_text_1_0= RULE_PROJECT_
            {
            lv_text_1_0=(Token)match(input,RULE_PROJECT_,FOLLOW_RULE_PROJECT__in_ruleProject696); 

            			newLeafNode(lv_text_1_0, grammarAccess.getProjectAccess().getTextPROJECT_TerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_1_0, 
                    		"PROJECT_");
            	    

            }


            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleCode"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:361:1: entryRuleCode returns [EObject current=null] : iv_ruleCode= ruleCode EOF ;
    public final EObject entryRuleCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCode = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:362:2: (iv_ruleCode= ruleCode EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:363:2: iv_ruleCode= ruleCode EOF
            {
             newCompositeNode(grammarAccess.getCodeRule()); 
            pushFollow(FOLLOW_ruleCode_in_entryRuleCode737);
            iv_ruleCode=ruleCode();

            state._fsp--;

             current =iv_ruleCode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCode747); 

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
    // $ANTLR end "entryRuleCode"


    // $ANTLR start "ruleCode"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:370:1: ruleCode returns [EObject current=null] : ( ( (lv_intend_0_0= ruleIntendation ) ) ( (lv_text_1_0= RULE_CODE_ ) ) ) ;
    public final EObject ruleCode() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        AntlrDatatypeRuleToken lv_intend_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:373:28: ( ( ( (lv_intend_0_0= ruleIntendation ) ) ( (lv_text_1_0= RULE_CODE_ ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:374:1: ( ( (lv_intend_0_0= ruleIntendation ) ) ( (lv_text_1_0= RULE_CODE_ ) ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:374:1: ( ( (lv_intend_0_0= ruleIntendation ) ) ( (lv_text_1_0= RULE_CODE_ ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:374:2: ( (lv_intend_0_0= ruleIntendation ) ) ( (lv_text_1_0= RULE_CODE_ ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:374:2: ( (lv_intend_0_0= ruleIntendation ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:375:1: (lv_intend_0_0= ruleIntendation )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:375:1: (lv_intend_0_0= ruleIntendation )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:376:3: lv_intend_0_0= ruleIntendation
            {
             
            	        newCompositeNode(grammarAccess.getCodeAccess().getIntendIntendationParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleIntendation_in_ruleCode793);
            lv_intend_0_0=ruleIntendation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCodeRule());
            	        }
                   		set(
                   			current, 
                   			"intend",
                    		lv_intend_0_0, 
                    		"Intendation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:392:2: ( (lv_text_1_0= RULE_CODE_ ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:393:1: (lv_text_1_0= RULE_CODE_ )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:393:1: (lv_text_1_0= RULE_CODE_ )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:394:3: lv_text_1_0= RULE_CODE_
            {
            lv_text_1_0=(Token)match(input,RULE_CODE_,FOLLOW_RULE_CODE__in_ruleCode810); 

            			newLeafNode(lv_text_1_0, grammarAccess.getCodeAccess().getTextCODE_TerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCodeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_1_0, 
                    		"CODE_");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCode"


    // $ANTLR start "entryRuleIntendation"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:418:1: entryRuleIntendation returns [String current=null] : iv_ruleIntendation= ruleIntendation EOF ;
    public final String entryRuleIntendation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntendation = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:419:2: (iv_ruleIntendation= ruleIntendation EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:420:2: iv_ruleIntendation= ruleIntendation EOF
            {
             newCompositeNode(grammarAccess.getIntendationRule()); 
            pushFollow(FOLLOW_ruleIntendation_in_entryRuleIntendation852);
            iv_ruleIntendation=ruleIntendation();

            state._fsp--;

             current =iv_ruleIntendation.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntendation863); 

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
    // $ANTLR end "entryRuleIntendation"


    // $ANTLR start "ruleIntendation"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:427:1: ruleIntendation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_SPACE_0= RULE_SPACE this_SPACE_1= RULE_SPACE ) | this_TAB_2= RULE_TAB )* (this_SPACE_3= RULE_SPACE )? ) ;
    public final AntlrDatatypeRuleToken ruleIntendation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SPACE_0=null;
        Token this_SPACE_1=null;
        Token this_TAB_2=null;
        Token this_SPACE_3=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:430:28: ( ( ( (this_SPACE_0= RULE_SPACE this_SPACE_1= RULE_SPACE ) | this_TAB_2= RULE_TAB )* (this_SPACE_3= RULE_SPACE )? ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:431:1: ( ( (this_SPACE_0= RULE_SPACE this_SPACE_1= RULE_SPACE ) | this_TAB_2= RULE_TAB )* (this_SPACE_3= RULE_SPACE )? )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:431:1: ( ( (this_SPACE_0= RULE_SPACE this_SPACE_1= RULE_SPACE ) | this_TAB_2= RULE_TAB )* (this_SPACE_3= RULE_SPACE )? )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:431:2: ( (this_SPACE_0= RULE_SPACE this_SPACE_1= RULE_SPACE ) | this_TAB_2= RULE_TAB )* (this_SPACE_3= RULE_SPACE )?
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:431:2: ( (this_SPACE_0= RULE_SPACE this_SPACE_1= RULE_SPACE ) | this_TAB_2= RULE_TAB )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_SPACE) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==RULE_SPACE) ) {
                        alt4=1;
                    }


                }
                else if ( (LA4_0==RULE_TAB) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:431:3: (this_SPACE_0= RULE_SPACE this_SPACE_1= RULE_SPACE )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:431:3: (this_SPACE_0= RULE_SPACE this_SPACE_1= RULE_SPACE )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:431:8: this_SPACE_0= RULE_SPACE this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_0=(Token)match(input,RULE_SPACE,FOLLOW_RULE_SPACE_in_ruleIntendation905); 

            	    		current.merge(this_SPACE_0);
            	        
            	     
            	        newLeafNode(this_SPACE_0, grammarAccess.getIntendationAccess().getSPACETerminalRuleCall_0_0_0()); 
            	        
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_RULE_SPACE_in_ruleIntendation925); 

            	    		current.merge(this_SPACE_1);
            	        
            	     
            	        newLeafNode(this_SPACE_1, grammarAccess.getIntendationAccess().getSPACETerminalRuleCall_0_0_1()); 
            	        

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:446:10: this_TAB_2= RULE_TAB
            	    {
            	    this_TAB_2=(Token)match(input,RULE_TAB,FOLLOW_RULE_TAB_in_ruleIntendation952); 

            	    		current.merge(this_TAB_2);
            	        
            	     
            	        newLeafNode(this_TAB_2, grammarAccess.getIntendationAccess().getTABTerminalRuleCall_0_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:453:3: (this_SPACE_3= RULE_SPACE )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_SPACE) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:453:8: this_SPACE_3= RULE_SPACE
                    {
                    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_RULE_SPACE_in_ruleIntendation975); 

                    		current.merge(this_SPACE_3);
                        
                     
                        newLeafNode(this_SPACE_3, grammarAccess.getIntendationAccess().getSPACETerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntendation"


    // $ANTLR start "entryRuleEmptyLine"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:468:1: entryRuleEmptyLine returns [EObject current=null] : iv_ruleEmptyLine= ruleEmptyLine EOF ;
    public final EObject entryRuleEmptyLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyLine = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:469:2: (iv_ruleEmptyLine= ruleEmptyLine EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:470:2: iv_ruleEmptyLine= ruleEmptyLine EOF
            {
             newCompositeNode(grammarAccess.getEmptyLineRule()); 
            pushFollow(FOLLOW_ruleEmptyLine_in_entryRuleEmptyLine1022);
            iv_ruleEmptyLine=ruleEmptyLine();

            state._fsp--;

             current =iv_ruleEmptyLine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmptyLine1032); 

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
    // $ANTLR end "entryRuleEmptyLine"


    // $ANTLR start "ruleEmptyLine"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:477:1: ruleEmptyLine returns [EObject current=null] : ( (lv_text_0_0= ruleSpaces ) ) ;
    public final EObject ruleEmptyLine() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_text_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:480:28: ( ( (lv_text_0_0= ruleSpaces ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:481:1: ( (lv_text_0_0= ruleSpaces ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:481:1: ( (lv_text_0_0= ruleSpaces ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:482:1: (lv_text_0_0= ruleSpaces )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:482:1: (lv_text_0_0= ruleSpaces )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:483:3: lv_text_0_0= ruleSpaces
            {
             
            	        newCompositeNode(grammarAccess.getEmptyLineAccess().getTextSpacesParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleSpaces_in_ruleEmptyLine1077);
            lv_text_0_0=ruleSpaces();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEmptyLineRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_0_0, 
                    		"Spaces");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmptyLine"


    // $ANTLR start "entryRuleSpaces"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:507:1: entryRuleSpaces returns [String current=null] : iv_ruleSpaces= ruleSpaces EOF ;
    public final String entryRuleSpaces() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSpaces = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:508:2: (iv_ruleSpaces= ruleSpaces EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:509:2: iv_ruleSpaces= ruleSpaces EOF
            {
             newCompositeNode(grammarAccess.getSpacesRule()); 
            pushFollow(FOLLOW_ruleSpaces_in_entryRuleSpaces1113);
            iv_ruleSpaces=ruleSpaces();

            state._fsp--;

             current =iv_ruleSpaces.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpaces1124); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:516:1: ruleSpaces returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Ws_0= ruleWs )* this_NL_1= RULE_NL ) ;
    public final AntlrDatatypeRuleToken ruleSpaces() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NL_1=null;
        AntlrDatatypeRuleToken this_Ws_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:519:28: ( ( (this_Ws_0= ruleWs )* this_NL_1= RULE_NL ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:520:1: ( (this_Ws_0= ruleWs )* this_NL_1= RULE_NL )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:520:1: ( (this_Ws_0= ruleWs )* this_NL_1= RULE_NL )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:520:2: (this_Ws_0= ruleWs )* this_NL_1= RULE_NL
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:520:2: (this_Ws_0= ruleWs )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_SPACE && LA6_0<=RULE_TAB)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:521:5: this_Ws_0= ruleWs
            	    {
            	     
            	            newCompositeNode(grammarAccess.getSpacesAccess().getWsParserRuleCall_0()); 
            	        
            	    pushFollow(FOLLOW_ruleWs_in_ruleSpaces1172);
            	    this_Ws_0=ruleWs();

            	    state._fsp--;


            	    		current.merge(this_Ws_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            this_NL_1=(Token)match(input,RULE_NL,FOLLOW_RULE_NL_in_ruleSpaces1194); 

            		current.merge(this_NL_1);
                
             
                newLeafNode(this_NL_1, grammarAccess.getSpacesAccess().getNLTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleWs"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:546:1: entryRuleWs returns [String current=null] : iv_ruleWs= ruleWs EOF ;
    public final String entryRuleWs() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWs = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:547:2: (iv_ruleWs= ruleWs EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:548:2: iv_ruleWs= ruleWs EOF
            {
             newCompositeNode(grammarAccess.getWsRule()); 
            pushFollow(FOLLOW_ruleWs_in_entryRuleWs1240);
            iv_ruleWs=ruleWs();

            state._fsp--;

             current =iv_ruleWs.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWs1251); 

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
    // $ANTLR end "entryRuleWs"


    // $ANTLR start "ruleWs"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:555:1: ruleWs returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SPACE_0= RULE_SPACE | this_TAB_1= RULE_TAB ) ;
    public final AntlrDatatypeRuleToken ruleWs() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SPACE_0=null;
        Token this_TAB_1=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:558:28: ( (this_SPACE_0= RULE_SPACE | this_TAB_1= RULE_TAB ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:559:1: (this_SPACE_0= RULE_SPACE | this_TAB_1= RULE_TAB )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:559:1: (this_SPACE_0= RULE_SPACE | this_TAB_1= RULE_TAB )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_SPACE) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_TAB) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:559:6: this_SPACE_0= RULE_SPACE
                    {
                    this_SPACE_0=(Token)match(input,RULE_SPACE,FOLLOW_RULE_SPACE_in_ruleWs1291); 

                    		current.merge(this_SPACE_0);
                        
                     
                        newLeafNode(this_SPACE_0, grammarAccess.getWsAccess().getSPACETerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:567:10: this_TAB_1= RULE_TAB
                    {
                    this_TAB_1=(Token)match(input,RULE_TAB,FOLLOW_RULE_TAB_in_ruleWs1317); 

                    		current.merge(this_TAB_1);
                        
                     
                        newLeafNode(this_TAB_1, grammarAccess.getWsAccess().getTABTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWs"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA1_eotS =
        "\10\uffff";
    static final String DFA1_eofS =
        "\3\3\2\uffff\3\3";
    static final String DFA1_minS =
        "\3\4\2\uffff\1\4\2\10";
    static final String DFA1_maxS =
        "\3\12\2\uffff\3\12";
    static final String DFA1_acceptS =
        "\3\uffff\1\2\1\1\3\uffff";
    static final String DFA1_specialS =
        "\10\uffff}>";
    static final String[] DFA1_transitionS = {
            "\4\4\1\1\1\2\1\4",
            "\4\4\1\5\1\6\1\4",
            "\4\4\1\1\1\2\1\4",
            "",
            "",
            "\4\4\1\1\1\2\1\4",
            "\1\7\1\6\1\4",
            "\1\7\1\6\1\4"
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
            return "()* loopback of 86:2: ( (lv_contents_1_0= ruleContent ) )*";
        }
    }
    static final String DFA3_eotS =
        "\11\uffff";
    static final String DFA3_eofS =
        "\11\uffff";
    static final String DFA3_minS =
        "\3\4\5\uffff\1\4";
    static final String DFA3_maxS =
        "\3\12\5\uffff\1\12";
    static final String DFA3_acceptS =
        "\3\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff";
    static final String DFA3_specialS =
        "\11\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\4\1\5\1\3\1\7\1\1\1\2\1\6",
            "\1\4\1\5\1\3\1\7\1\10\2\6",
            "\1\4\1\5\1\3\1\7\1\1\1\2\1\6",
            "",
            "",
            "",
            "",
            "",
            "\1\4\1\5\1\3\1\7\1\1\1\2\1\6"
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
            return "133:1: (this_Project_0= ruleProject | this_Task_1= ruleTask | this_Note_2= ruleNote | this_EmptyLine_3= ruleEmptyLine | this_Code_4= ruleCode )";
        }
    }
 

    public static final BitSet FOLLOW_ruleTaskModel_in_entryRuleTaskModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaskModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_ruleTaskModel140 = new BitSet(new long[]{0x00000000000007F2L});
    public static final BitSet FOLLOW_ruleWs_in_ruleTaskModel158 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_ruleContent_in_entryRuleContent195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContent205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_ruleContent252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_ruleContent279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_ruleContent306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyLine_in_ruleContent333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_ruleContent360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntendation_in_ruleTask451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_TASK_TEXT_in_ruleTask468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_entryRuleNote509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNote519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntendation_in_ruleNote565 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_TEXT_in_ruleNote582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntendation_in_ruleProject679 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_PROJECT__in_ruleProject696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_entryRuleCode737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCode747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntendation_in_ruleCode793 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_CODE__in_ruleCode810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntendation_in_entryRuleIntendation852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntendation863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SPACE_in_ruleIntendation905 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_SPACE_in_ruleIntendation925 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_RULE_TAB_in_ruleIntendation952 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_RULE_SPACE_in_ruleIntendation975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyLine_in_entryRuleEmptyLine1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmptyLine1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpaces_in_ruleEmptyLine1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpaces_in_entryRuleSpaces1113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpaces1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWs_in_ruleSpaces1172 = new BitSet(new long[]{0x0000000000000700L});
    public static final BitSet FOLLOW_RULE_NL_in_ruleSpaces1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWs_in_entryRuleWs1240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWs1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SPACE_in_ruleWs1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAB_in_ruleWs1317 = new BitSet(new long[]{0x0000000000000002L});

}