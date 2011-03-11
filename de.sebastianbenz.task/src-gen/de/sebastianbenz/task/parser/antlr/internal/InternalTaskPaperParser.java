/*******************************************************************************
 * Copyright (c) 2011 Sebastian Benz.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sebastian Benz - initial API and implementation
 *******************************************************************************/
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

@SuppressWarnings("all")
public class InternalTaskPaperParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_TASK_TEXT", "RULE_TEXT", "RULE_PROJECT_", "RULE_NL", "RULE_HYPHEN", "RULE_COLON"
    };
    public static final int RULE_COLON=10;
    public static final int RULE_HYPHEN=9;
    public static final int RULE_PROJECT_=7;
    public static final int RULE_NL=8;
    public static final int RULE_TASK_TEXT=5;
    public static final int RULE_TEXT=6;
    public static final int RULE_WS=4;
    public static final int EOF=-1;

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
             newCompositeNode(grammarAccess.getTodoRule()); 
            pushFollow(FOLLOW_ruleTodo_in_entryRuleTodo75);
            iv_ruleTodo=ruleTodo();

            state._fsp--;

             current =iv_ruleTodo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTodo85); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:76:1: ruleTodo returns [EObject current=null] : ( () ( ( (lv_contents_1_0= ruleContent ) ) | ruleSpaces )* (this_WS_3= RULE_WS )* ) ;
    public final EObject ruleTodo() throws RecognitionException {
        EObject current = null;

        Token this_WS_3=null;
        EObject lv_contents_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:79:28: ( ( () ( ( (lv_contents_1_0= ruleContent ) ) | ruleSpaces )* (this_WS_3= RULE_WS )* ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:80:1: ( () ( ( (lv_contents_1_0= ruleContent ) ) | ruleSpaces )* (this_WS_3= RULE_WS )* )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:80:1: ( () ( ( (lv_contents_1_0= ruleContent ) ) | ruleSpaces )* (this_WS_3= RULE_WS )* )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:80:2: () ( ( (lv_contents_1_0= ruleContent ) ) | ruleSpaces )* (this_WS_3= RULE_WS )*
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:80:2: ()
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTodoAccess().getTodoAction_0(),
                        current);
                

            }

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:86:2: ( ( (lv_contents_1_0= ruleContent ) ) | ruleSpaces )*
            loop1:
            do {
                int alt1=3;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:86:3: ( (lv_contents_1_0= ruleContent ) )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:86:3: ( (lv_contents_1_0= ruleContent ) )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:87:1: (lv_contents_1_0= ruleContent )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:87:1: (lv_contents_1_0= ruleContent )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:88:3: lv_contents_1_0= ruleContent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTodoAccess().getContentsContentParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContent_in_ruleTodo141);
            	    lv_contents_1_0=ruleContent();

            	    state._fsp--;


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
            	case 2 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:106:5: ruleSpaces
            	    {
            	     
            	            newCompositeNode(grammarAccess.getTodoAccess().getSpacesParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleSpaces_in_ruleTodo163);
            	    ruleSpaces();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:113:3: (this_WS_3= RULE_WS )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_WS) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:113:4: this_WS_3= RULE_WS
            	    {
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTodo176); 
            	     
            	        newLeafNode(this_WS_3, grammarAccess.getTodoAccess().getWSTerminalRuleCall_2()); 
            	        

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
    // $ANTLR end "ruleTodo"


    // $ANTLR start "entryRuleContent"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:125:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:126:2: (iv_ruleContent= ruleContent EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:127:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_ruleContent_in_entryRuleContent213);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContent223); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:134:1: ruleContent returns [EObject current=null] : (this_Project_0= ruleProject | this_Task_1= ruleTask | this_Note_2= ruleNote ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        EObject this_Project_0 = null;

        EObject this_Task_1 = null;

        EObject this_Note_2 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:137:28: ( (this_Project_0= ruleProject | this_Task_1= ruleTask | this_Note_2= ruleNote ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:138:1: (this_Project_0= ruleProject | this_Task_1= ruleTask | this_Note_2= ruleNote )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:138:1: (this_Project_0= ruleProject | this_Task_1= ruleTask | this_Note_2= ruleNote )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:139:5: this_Project_0= ruleProject
                    {
                     
                            newCompositeNode(grammarAccess.getContentAccess().getProjectParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleProject_in_ruleContent270);
                    this_Project_0=ruleProject();

                    state._fsp--;

                     
                            current = this_Project_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:149:5: this_Task_1= ruleTask
                    {
                     
                            newCompositeNode(grammarAccess.getContentAccess().getTaskParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTask_in_ruleContent297);
                    this_Task_1=ruleTask();

                    state._fsp--;

                     
                            current = this_Task_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:159:5: this_Note_2= ruleNote
                    {
                     
                            newCompositeNode(grammarAccess.getContentAccess().getNoteParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNote_in_ruleContent324);
                    this_Note_2=ruleNote();

                    state._fsp--;

                     
                            current = this_Note_2; 
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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:175:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:176:2: (iv_ruleTask= ruleTask EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:177:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask359);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask369); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:184:1: ruleTask returns [EObject current=null] : ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_TASK_TEXT ) ) ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token lv_intend_0_0=null;
        Token lv_text_1_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:187:28: ( ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_TASK_TEXT ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:188:1: ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_TASK_TEXT ) ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:188:1: ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_TASK_TEXT ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:188:2: ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_TASK_TEXT ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:188:2: ( (lv_intend_0_0= RULE_WS ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_WS) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:189:1: (lv_intend_0_0= RULE_WS )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:189:1: (lv_intend_0_0= RULE_WS )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:190:3: lv_intend_0_0= RULE_WS
            	    {
            	    lv_intend_0_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleTask411); 

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

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:206:3: ( (lv_text_1_0= RULE_TASK_TEXT ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:207:1: (lv_text_1_0= RULE_TASK_TEXT )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:207:1: (lv_text_1_0= RULE_TASK_TEXT )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:208:3: lv_text_1_0= RULE_TASK_TEXT
            {
            lv_text_1_0=(Token)match(input,RULE_TASK_TEXT,FOLLOW_RULE_TASK_TEXT_in_ruleTask434); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:232:1: entryRuleNote returns [EObject current=null] : iv_ruleNote= ruleNote EOF ;
    public final EObject entryRuleNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNote = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:233:2: (iv_ruleNote= ruleNote EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:234:2: iv_ruleNote= ruleNote EOF
            {
             newCompositeNode(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_ruleNote_in_entryRuleNote475);
            iv_ruleNote=ruleNote();

            state._fsp--;

             current =iv_ruleNote; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNote485); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:241:1: ruleNote returns [EObject current=null] : ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_TEXT ) ) ) ;
    public final EObject ruleNote() throws RecognitionException {
        EObject current = null;

        Token lv_intend_0_0=null;
        Token lv_text_1_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:244:28: ( ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_TEXT ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:245:1: ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_TEXT ) ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:245:1: ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_TEXT ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:245:2: ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_TEXT ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:245:2: ( (lv_intend_0_0= RULE_WS ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_WS) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:246:1: (lv_intend_0_0= RULE_WS )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:246:1: (lv_intend_0_0= RULE_WS )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:247:3: lv_intend_0_0= RULE_WS
            	    {
            	    lv_intend_0_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleNote527); 

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

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:263:3: ( (lv_text_1_0= RULE_TEXT ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:264:1: (lv_text_1_0= RULE_TEXT )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:264:1: (lv_text_1_0= RULE_TEXT )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:265:3: lv_text_1_0= RULE_TEXT
            {
            lv_text_1_0=(Token)match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_ruleNote550); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:289:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:290:2: (iv_ruleProject= ruleProject EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:291:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_ruleProject_in_entryRuleProject591);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProject601); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:298:1: ruleProject returns [EObject current=null] : ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_PROJECT_ ) ) ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token lv_intend_0_0=null;
        Token lv_text_1_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:301:28: ( ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_PROJECT_ ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:302:1: ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_PROJECT_ ) ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:302:1: ( ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_PROJECT_ ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:302:2: ( (lv_intend_0_0= RULE_WS ) )* ( (lv_text_1_0= RULE_PROJECT_ ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:302:2: ( (lv_intend_0_0= RULE_WS ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_WS) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:303:1: (lv_intend_0_0= RULE_WS )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:303:1: (lv_intend_0_0= RULE_WS )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:304:3: lv_intend_0_0= RULE_WS
            	    {
            	    lv_intend_0_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleProject643); 

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

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:320:3: ( (lv_text_1_0= RULE_PROJECT_ ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:321:1: (lv_text_1_0= RULE_PROJECT_ )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:321:1: (lv_text_1_0= RULE_PROJECT_ )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:322:3: lv_text_1_0= RULE_PROJECT_
            {
            lv_text_1_0=(Token)match(input,RULE_PROJECT_,FOLLOW_RULE_PROJECT__in_ruleProject666); 

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


    // $ANTLR start "entryRuleSpaces"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:346:1: entryRuleSpaces returns [String current=null] : iv_ruleSpaces= ruleSpaces EOF ;
    public final String entryRuleSpaces() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSpaces = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:347:2: (iv_ruleSpaces= ruleSpaces EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:348:2: iv_ruleSpaces= ruleSpaces EOF
            {
             newCompositeNode(grammarAccess.getSpacesRule()); 
            pushFollow(FOLLOW_ruleSpaces_in_entryRuleSpaces708);
            iv_ruleSpaces=ruleSpaces();

            state._fsp--;

             current =iv_ruleSpaces.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpaces719); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:355:1: ruleSpaces returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_WS_0= RULE_WS )* this_NL_1= RULE_NL ) ;
    public final AntlrDatatypeRuleToken ruleSpaces() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WS_0=null;
        Token this_NL_1=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:358:28: ( ( (this_WS_0= RULE_WS )* this_NL_1= RULE_NL ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:359:1: ( (this_WS_0= RULE_WS )* this_NL_1= RULE_NL )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:359:1: ( (this_WS_0= RULE_WS )* this_NL_1= RULE_NL )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:359:2: (this_WS_0= RULE_WS )* this_NL_1= RULE_NL
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:359:2: (this_WS_0= RULE_WS )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_WS) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTaskPaper.g:359:7: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleSpaces760); 

            	    		current.merge(this_WS_0);
            	        
            	     
            	        newLeafNode(this_WS_0, grammarAccess.getSpacesAccess().getWSTerminalRuleCall_0()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            this_NL_1=(Token)match(input,RULE_NL,FOLLOW_RULE_NL_in_ruleSpaces782); 

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
        "\5\uffff";
    static final String DFA1_eofS =
        "\2\2\3\uffff";
    static final String DFA1_minS =
        "\2\4\3\uffff";
    static final String DFA1_maxS =
        "\2\10\3\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\3\1\1\1\2";
    static final String DFA1_specialS =
        "\5\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\3\3\1\4",
            "\1\1\3\3\1\4",
            "",
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
            return "()* loopback of 86:2: ( ( (lv_contents_1_0= ruleContent ) ) | ruleSpaces )*";
        }
    }
    static final String DFA3_eotS =
        "\5\uffff";
    static final String DFA3_eofS =
        "\5\uffff";
    static final String DFA3_minS =
        "\2\4\3\uffff";
    static final String DFA3_maxS =
        "\2\7\3\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\1\1\2\1\3";
    static final String DFA3_specialS =
        "\5\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\1\3\1\4\1\2",
            "\1\1\1\3\1\4\1\2",
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
            return "138:1: (this_Project_0= ruleProject | this_Task_1= ruleTask | this_Note_2= ruleNote )";
        }
    }
 

    public static final BitSet FOLLOW_ruleTodo_in_entryRuleTodo75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTodo85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_ruleTodo141 = new BitSet(new long[]{0x00000000000001F2L});
    public static final BitSet FOLLOW_ruleSpaces_in_ruleTodo163 = new BitSet(new long[]{0x00000000000001F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTodo176 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleContent_in_entryRuleContent213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContent223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_ruleContent270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_ruleContent297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_ruleContent324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleTask411 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_TASK_TEXT_in_ruleTask434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_entryRuleNote475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNote485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleNote527 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_TEXT_in_ruleNote550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleProject643 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_RULE_PROJECT__in_ruleProject666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpaces_in_entryRuleSpaces708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpaces719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleSpaces760 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_RULE_NL_in_ruleSpaces782 = new BitSet(new long[]{0x0000000000000002L});

}