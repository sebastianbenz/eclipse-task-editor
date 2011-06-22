package de.sebastianbenz.task.parser.antlr.internal; 

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.BitSet;
import org.antlr.runtime.DFA;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;

import de.sebastianbenz.task.services.TaskGrammarAccess;

@SuppressWarnings("all")
public class InternalTaskParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_TASK_TEXT", "RULE_TEXT", "RULE_PROJECT_", "RULE_CODE_", "RULE_NL", "RULE_HYPHEN", "RULE_COLON"
    };
    public static final int RULE_COLON=11;
    public static final int RULE_CODE_=8;
    public static final int RULE_HYPHEN=10;
    public static final int RULE_PROJECT_=7;
    public static final int RULE_NL=9;
    public static final int RULE_TASK_TEXT=5;
    public static final int RULE_TEXT=6;
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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:76:1: ruleTaskModel returns [EObject current=null] : ( () ( (lv_contents_1_0= ruleContent ) )* (this_WS_2= RULE_WS )* ) ;
    public final EObject ruleTaskModel() throws RecognitionException {
        EObject current = null;

        Token this_WS_2=null;
        EObject lv_contents_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:79:28: ( ( () ( (lv_contents_1_0= ruleContent ) )* (this_WS_2= RULE_WS )* ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:80:1: ( () ( (lv_contents_1_0= ruleContent ) )* (this_WS_2= RULE_WS )* )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:80:1: ( () ( (lv_contents_1_0= ruleContent ) )* (this_WS_2= RULE_WS )* )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:80:2: () ( (lv_contents_1_0= ruleContent ) )* (this_WS_2= RULE_WS )*
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

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:104:3: (this_WS_2= RULE_WS )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_WS) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:104:4: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTaskModel153); 
            	     
            	        newLeafNode(this_WS_2, grammarAccess.getTaskModelAccess().getWSTerminalRuleCall_2()); 
            	        

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:116:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:117:2: (iv_ruleContent= ruleContent EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:118:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_ruleContent_in_entryRuleContent190);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContent200); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:125:1: ruleContent returns [EObject current=null] : (this_Project_0= ruleProject | this_Task_1= ruleTask | this_Note_2= ruleNote | this_EmptyLine_3= ruleEmptyLine | this_Code_4= ruleCode ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        EObject this_Project_0 = null;

        EObject this_Task_1 = null;

        EObject this_Note_2 = null;

        EObject this_EmptyLine_3 = null;

        EObject this_Code_4 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:128:28: ( (this_Project_0= ruleProject | this_Task_1= ruleTask | this_Note_2= ruleNote | this_EmptyLine_3= ruleEmptyLine | this_Code_4= ruleCode ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:129:1: (this_Project_0= ruleProject | this_Task_1= ruleTask | this_Note_2= ruleNote | this_EmptyLine_3= ruleEmptyLine | this_Code_4= ruleCode )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:129:1: (this_Project_0= ruleProject | this_Task_1= ruleTask | this_Note_2= ruleNote | this_EmptyLine_3= ruleEmptyLine | this_Code_4= ruleCode )
            int alt3=5;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:130:5: this_Project_0= ruleProject
                    {
                     
                            newCompositeNode(grammarAccess.getContentAccess().getProjectParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleProject_in_ruleContent247);
                    this_Project_0=ruleProject();

                    state._fsp--;

                     
                            current = this_Project_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:140:5: this_Task_1= ruleTask
                    {
                     
                            newCompositeNode(grammarAccess.getContentAccess().getTaskParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTask_in_ruleContent274);
                    this_Task_1=ruleTask();

                    state._fsp--;

                     
                            current = this_Task_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:150:5: this_Note_2= ruleNote
                    {
                     
                            newCompositeNode(grammarAccess.getContentAccess().getNoteParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNote_in_ruleContent301);
                    this_Note_2=ruleNote();

                    state._fsp--;

                     
                            current = this_Note_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:160:5: this_EmptyLine_3= ruleEmptyLine
                    {
                     
                            newCompositeNode(grammarAccess.getContentAccess().getEmptyLineParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleEmptyLine_in_ruleContent328);
                    this_EmptyLine_3=ruleEmptyLine();

                    state._fsp--;

                     
                            current = this_EmptyLine_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:170:5: this_Code_4= ruleCode
                    {
                     
                            newCompositeNode(grammarAccess.getContentAccess().getCodeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCode_in_ruleContent355);
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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:186:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:187:2: (iv_ruleTask= ruleTask EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:188:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask390);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask400); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:195:1: ruleTask returns [EObject current=null] : ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_TASK_TEXT ) ) ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token lv_intend_0_0=null;
        Token lv_text_1_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:198:28: ( ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_TASK_TEXT ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:199:1: ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_TASK_TEXT ) ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:199:1: ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_TASK_TEXT ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:199:2: ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_TASK_TEXT ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:199:2: ( (lv_intend_0_0= RULE_WS ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_WS) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:200:1: (lv_intend_0_0= RULE_WS )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:200:1: (lv_intend_0_0= RULE_WS )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:201:3: lv_intend_0_0= RULE_WS
            	    {
            	    lv_intend_0_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTask442); 

            	    			newLeafNode(lv_intend_0_0, grammarAccess.getTaskAccess().getIntendWSTerminalRuleCall_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTaskRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"intend",
            	            		lv_intend_0_0, 
            	            		"WS");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:217:3: ( (lv_text_1_0= RULE_TASK_TEXT ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:218:1: (lv_text_1_0= RULE_TASK_TEXT )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:218:1: (lv_text_1_0= RULE_TASK_TEXT )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:219:3: lv_text_1_0= RULE_TASK_TEXT
            {
            lv_text_1_0=(Token)match(input,RULE_TASK_TEXT,FOLLOW_RULE_TASK_TEXT_in_ruleTask465); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:243:1: entryRuleNote returns [EObject current=null] : iv_ruleNote= ruleNote EOF ;
    public final EObject entryRuleNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNote = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:244:2: (iv_ruleNote= ruleNote EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:245:2: iv_ruleNote= ruleNote EOF
            {
             newCompositeNode(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_ruleNote_in_entryRuleNote506);
            iv_ruleNote=ruleNote();

            state._fsp--;

             current =iv_ruleNote; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNote516); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:252:1: ruleNote returns [EObject current=null] : ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_TEXT ) ) ) ;
    public final EObject ruleNote() throws RecognitionException {
        EObject current = null;

        Token lv_intend_0_0=null;
        Token lv_text_1_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:255:28: ( ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_TEXT ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:256:1: ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_TEXT ) ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:256:1: ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_TEXT ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:256:2: ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_TEXT ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:256:2: ( (lv_intend_0_0= RULE_WS ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_WS) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:257:1: (lv_intend_0_0= RULE_WS )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:257:1: (lv_intend_0_0= RULE_WS )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:258:3: lv_intend_0_0= RULE_WS
            	    {
            	    lv_intend_0_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleNote558); 

            	    			newLeafNode(lv_intend_0_0, grammarAccess.getNoteAccess().getIntendWSTerminalRuleCall_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getNoteRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"intend",
            	            		lv_intend_0_0, 
            	            		"WS");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:274:3: ( (lv_text_1_0= RULE_TEXT ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:275:1: (lv_text_1_0= RULE_TEXT )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:275:1: (lv_text_1_0= RULE_TEXT )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:276:3: lv_text_1_0= RULE_TEXT
            {
            lv_text_1_0=(Token)match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_ruleNote581); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:300:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:301:2: (iv_ruleProject= ruleProject EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:302:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_ruleProject_in_entryRuleProject622);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProject632); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:309:1: ruleProject returns [EObject current=null] : ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_PROJECT_ ) ) ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token lv_intend_0_0=null;
        Token lv_text_1_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:312:28: ( ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_PROJECT_ ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:313:1: ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_PROJECT_ ) ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:313:1: ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_PROJECT_ ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:313:2: ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_PROJECT_ ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:313:2: ( (lv_intend_0_0= RULE_WS ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_WS) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:314:1: (lv_intend_0_0= RULE_WS )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:314:1: (lv_intend_0_0= RULE_WS )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:315:3: lv_intend_0_0= RULE_WS
            	    {
            	    lv_intend_0_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleProject674); 

            	    			newLeafNode(lv_intend_0_0, grammarAccess.getProjectAccess().getIntendWSTerminalRuleCall_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getProjectRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"intend",
            	            		lv_intend_0_0, 
            	            		"WS");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:331:3: ( (lv_text_1_0= RULE_PROJECT_ ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:332:1: (lv_text_1_0= RULE_PROJECT_ )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:332:1: (lv_text_1_0= RULE_PROJECT_ )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:333:3: lv_text_1_0= RULE_PROJECT_
            {
            lv_text_1_0=(Token)match(input,RULE_PROJECT_,FOLLOW_RULE_PROJECT__in_ruleProject697); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:357:1: entryRuleCode returns [EObject current=null] : iv_ruleCode= ruleCode EOF ;
    public final EObject entryRuleCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCode = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:358:2: (iv_ruleCode= ruleCode EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:359:2: iv_ruleCode= ruleCode EOF
            {
             newCompositeNode(grammarAccess.getCodeRule()); 
            pushFollow(FOLLOW_ruleCode_in_entryRuleCode738);
            iv_ruleCode=ruleCode();

            state._fsp--;

             current =iv_ruleCode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCode748); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:366:1: ruleCode returns [EObject current=null] : ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_CODE_ ) ) ) ;
    public final EObject ruleCode() throws RecognitionException {
        EObject current = null;

        Token lv_intend_0_0=null;
        Token lv_text_1_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:369:28: ( ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_CODE_ ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:370:1: ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_CODE_ ) ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:370:1: ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_CODE_ ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:370:2: ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_CODE_ ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:370:2: ( (lv_intend_0_0= RULE_WS ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_WS) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:371:1: (lv_intend_0_0= RULE_WS )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:371:1: (lv_intend_0_0= RULE_WS )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:372:3: lv_intend_0_0= RULE_WS
            	    {
            	    lv_intend_0_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCode790); 

            	    			newLeafNode(lv_intend_0_0, grammarAccess.getCodeAccess().getIntendWSTerminalRuleCall_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCodeRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"intend",
            	            		lv_intend_0_0, 
            	            		"WS");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:388:3: ( (lv_text_1_0= RULE_CODE_ ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:389:1: (lv_text_1_0= RULE_CODE_ )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:389:1: (lv_text_1_0= RULE_CODE_ )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:390:3: lv_text_1_0= RULE_CODE_
            {
            lv_text_1_0=(Token)match(input,RULE_CODE_,FOLLOW_RULE_CODE__in_ruleCode813); 

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


    // $ANTLR start "entryRuleEmptyLine"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:414:1: entryRuleEmptyLine returns [EObject current=null] : iv_ruleEmptyLine= ruleEmptyLine EOF ;
    public final EObject entryRuleEmptyLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyLine = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:415:2: (iv_ruleEmptyLine= ruleEmptyLine EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:416:2: iv_ruleEmptyLine= ruleEmptyLine EOF
            {
             newCompositeNode(grammarAccess.getEmptyLineRule()); 
            pushFollow(FOLLOW_ruleEmptyLine_in_entryRuleEmptyLine854);
            iv_ruleEmptyLine=ruleEmptyLine();

            state._fsp--;

             current =iv_ruleEmptyLine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmptyLine864); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:423:1: ruleEmptyLine returns [EObject current=null] : ( (lv_text_0_0= ruleSpaces ) ) ;
    public final EObject ruleEmptyLine() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_text_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:426:28: ( ( (lv_text_0_0= ruleSpaces ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:427:1: ( (lv_text_0_0= ruleSpaces ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:427:1: ( (lv_text_0_0= ruleSpaces ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:428:1: (lv_text_0_0= ruleSpaces )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:428:1: (lv_text_0_0= ruleSpaces )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:429:3: lv_text_0_0= ruleSpaces
            {
             
            	        newCompositeNode(grammarAccess.getEmptyLineAccess().getTextSpacesParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleSpaces_in_ruleEmptyLine909);
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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:453:1: entryRuleSpaces returns [String current=null] : iv_ruleSpaces= ruleSpaces EOF ;
    public final String entryRuleSpaces() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSpaces = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:454:2: (iv_ruleSpaces= ruleSpaces EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:455:2: iv_ruleSpaces= ruleSpaces EOF
            {
             newCompositeNode(grammarAccess.getSpacesRule()); 
            pushFollow(FOLLOW_ruleSpaces_in_entryRuleSpaces945);
            iv_ruleSpaces=ruleSpaces();

            state._fsp--;

             current =iv_ruleSpaces.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpaces956); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:462:1: ruleSpaces returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_WS_0= RULE_WS )* this_NL_1= RULE_NL ) ;
    public final AntlrDatatypeRuleToken ruleSpaces() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WS_0=null;
        Token this_NL_1=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:465:28: ( ( (this_WS_0= RULE_WS )* this_NL_1= RULE_NL ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:466:1: ( (this_WS_0= RULE_WS )* this_NL_1= RULE_NL )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:466:1: ( (this_WS_0= RULE_WS )* this_NL_1= RULE_NL )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:466:2: (this_WS_0= RULE_WS )* this_NL_1= RULE_NL
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:466:2: (this_WS_0= RULE_WS )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_WS) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:466:7: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleSpaces997); 

            	    		current.merge(this_WS_0);
            	        
            	     
            	        newLeafNode(this_WS_0, grammarAccess.getSpacesAccess().getWSTerminalRuleCall_0()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            this_NL_1=(Token)match(input,RULE_NL,FOLLOW_RULE_NL_in_ruleSpaces1019); 

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

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA1_eotS =
        "\4\uffff";
    static final String DFA1_eofS =
        "\2\2\2\uffff";
    static final String DFA1_minS =
        "\2\4\2\uffff";
    static final String DFA1_maxS =
        "\2\11\2\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA1_specialS =
        "\4\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\5\3",
            "\1\1\5\3",
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
            return "()* loopback of 86:2: ( (lv_contents_1_0= ruleContent ) )*";
        }
    }
    static final String DFA3_eotS =
        "\7\uffff";
    static final String DFA3_eofS =
        "\7\uffff";
    static final String DFA3_minS =
        "\2\4\5\uffff";
    static final String DFA3_maxS =
        "\2\11\5\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5";
    static final String DFA3_specialS =
        "\7\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\1\3\1\4\1\2\1\6\1\5",
            "\1\1\1\3\1\4\1\2\1\6\1\5",
            "",
            "",
            "",
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
            return "129:1: (this_Project_0= ruleProject | this_Task_1= ruleTask | this_Note_2= ruleNote | this_EmptyLine_3= ruleEmptyLine | this_Code_4= ruleCode )";
        }
    }
 

    public static final BitSet FOLLOW_ruleTaskModel_in_entryRuleTaskModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaskModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_ruleTaskModel140 = new BitSet(new long[]{0x00000000000003F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTaskModel153 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleContent_in_entryRuleContent190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContent200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_ruleContent247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_ruleContent274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_ruleContent301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyLine_in_ruleContent328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_ruleContent355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTask442 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_TASK_TEXT_in_ruleTask465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_entryRuleNote506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNote516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleNote558 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_TEXT_in_ruleNote581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleProject674 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_RULE_PROJECT__in_ruleProject697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_entryRuleCode738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCode748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCode790 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_RULE_CODE__in_ruleCode813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyLine_in_entryRuleEmptyLine854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmptyLine864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpaces_in_ruleEmptyLine909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpaces_in_entryRuleSpaces945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpaces956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleSpaces997 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_RULE_NL_in_ruleSpaces1019 = new BitSet(new long[]{0x0000000000000002L});

}