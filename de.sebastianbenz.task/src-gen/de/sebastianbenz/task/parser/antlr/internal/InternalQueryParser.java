package de.sebastianbenz.task.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.sebastianbenz.task.services.QueryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQueryParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'or'", "'and'", "'not'", "'('", "')'", "'project'", "':'", "'task'", "'text'", "'@'", "'='", "'!='", "'<='", "'<'", "'>='", "'>'"
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
    public String getGrammarFileName() { return "../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g"; }



     	private QueryGrammarAccess grammarAccess;
     	
        public InternalQueryParser(TokenStream input, QueryGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Query";	
       	}
       	
       	@Override
       	protected QueryGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleQuery"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:68:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:69:2: (iv_ruleQuery= ruleQuery EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:70:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_ruleQuery_in_entryRuleQuery75);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery85); 

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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:77:1: ruleQuery returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleOrExpr ) )? ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:80:28: ( ( () ( (lv_expression_1_0= ruleOrExpr ) )? ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:81:1: ( () ( (lv_expression_1_0= ruleOrExpr ) )? )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:81:1: ( () ( (lv_expression_1_0= ruleOrExpr ) )? )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:81:2: () ( (lv_expression_1_0= ruleOrExpr ) )?
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:81:2: ()
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getQueryAccess().getQueryAction_0(),
                        current);
                

            }

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:87:2: ( (lv_expression_1_0= ruleOrExpr ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)||(LA1_0>=13 && LA1_0<=14)||LA1_0==16||(LA1_0>=18 && LA1_0<=20)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:88:1: (lv_expression_1_0= ruleOrExpr )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:88:1: (lv_expression_1_0= ruleOrExpr )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:89:3: lv_expression_1_0= ruleOrExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getQueryAccess().getExpressionOrExprParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOrExpr_in_ruleQuery140);
                    lv_expression_1_0=ruleOrExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQueryRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_1_0, 
                            		"OrExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleOrExpr"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:113:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:114:2: (iv_ruleOrExpr= ruleOrExpr EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:115:2: iv_ruleOrExpr= ruleOrExpr EOF
            {
             newCompositeNode(grammarAccess.getOrExprRule()); 
            pushFollow(FOLLOW_ruleOrExpr_in_entryRuleOrExpr177);
            iv_ruleOrExpr=ruleOrExpr();

            state._fsp--;

             current =iv_ruleOrExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpr187); 

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
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:122:1: ruleOrExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:125:28: ( (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpr ) ) )* ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:126:1: (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpr ) ) )* )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:126:1: (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpr ) ) )* )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:127:5: this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAndExpr_in_ruleOrExpr234);
            this_AndExpr_0=ruleAndExpr();

            state._fsp--;

             
                    current = this_AndExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:135:1: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpr ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:135:2: () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpr ) )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:135:2: ()
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:136:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrExprAccess().getOrExprLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleOrExpr255); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrExprAccess().getOrKeyword_1_1());
            	        
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:145:1: ( (lv_right_3_0= ruleAndExpr ) )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:146:1: (lv_right_3_0= ruleAndExpr )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:146:1: (lv_right_3_0= ruleAndExpr )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:147:3: lv_right_3_0= ruleAndExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndExpr_in_ruleOrExpr276);
            	    lv_right_3_0=ruleAndExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"AndExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


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
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleAndExpr"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:171:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:172:2: (iv_ruleAndExpr= ruleAndExpr EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:173:2: iv_ruleAndExpr= ruleAndExpr EOF
            {
             newCompositeNode(grammarAccess.getAndExprRule()); 
            pushFollow(FOLLOW_ruleAndExpr_in_entryRuleAndExpr314);
            iv_ruleAndExpr=ruleAndExpr();

            state._fsp--;

             current =iv_ruleAndExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpr324); 

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
    // $ANTLR end "entryRuleAndExpr"


    // $ANTLR start "ruleAndExpr"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:180:1: ruleAndExpr returns [EObject current=null] : (this_CompEqExpr_0= ruleCompEqExpr ( () otherlv_2= 'and' ( (lv_right_3_0= ruleCompEqExpr ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_CompEqExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:183:28: ( (this_CompEqExpr_0= ruleCompEqExpr ( () otherlv_2= 'and' ( (lv_right_3_0= ruleCompEqExpr ) ) )* ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:184:1: (this_CompEqExpr_0= ruleCompEqExpr ( () otherlv_2= 'and' ( (lv_right_3_0= ruleCompEqExpr ) ) )* )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:184:1: (this_CompEqExpr_0= ruleCompEqExpr ( () otherlv_2= 'and' ( (lv_right_3_0= ruleCompEqExpr ) ) )* )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:185:5: this_CompEqExpr_0= ruleCompEqExpr ( () otherlv_2= 'and' ( (lv_right_3_0= ruleCompEqExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndExprAccess().getCompEqExprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleCompEqExpr_in_ruleAndExpr371);
            this_CompEqExpr_0=ruleCompEqExpr();

            state._fsp--;

             
                    current = this_CompEqExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:193:1: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleCompEqExpr ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:193:2: () otherlv_2= 'and' ( (lv_right_3_0= ruleCompEqExpr ) )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:193:2: ()
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:194:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndExprAccess().getAndExprLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAndExpr392); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndExprAccess().getAndKeyword_1_1());
            	        
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:203:1: ( (lv_right_3_0= ruleCompEqExpr ) )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:204:1: (lv_right_3_0= ruleCompEqExpr )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:204:1: (lv_right_3_0= ruleCompEqExpr )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:205:3: lv_right_3_0= ruleCompEqExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExprAccess().getRightCompEqExprParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCompEqExpr_in_ruleAndExpr413);
            	    lv_right_3_0=ruleCompEqExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"CompEqExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRuleCompEqExpr"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:229:1: entryRuleCompEqExpr returns [EObject current=null] : iv_ruleCompEqExpr= ruleCompEqExpr EOF ;
    public final EObject entryRuleCompEqExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompEqExpr = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:230:2: (iv_ruleCompEqExpr= ruleCompEqExpr EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:231:2: iv_ruleCompEqExpr= ruleCompEqExpr EOF
            {
             newCompositeNode(grammarAccess.getCompEqExprRule()); 
            pushFollow(FOLLOW_ruleCompEqExpr_in_entryRuleCompEqExpr451);
            iv_ruleCompEqExpr=ruleCompEqExpr();

            state._fsp--;

             current =iv_ruleCompEqExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompEqExpr461); 

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
    // $ANTLR end "entryRuleCompEqExpr"


    // $ANTLR start "ruleCompEqExpr"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:238:1: ruleCompEqExpr returns [EObject current=null] : (this_CompExpr_0= ruleCompExpr ( () ( (lv_operator_2_0= ruleCompEqOperator ) ) ( (lv_right_3_0= ruleCompExpr ) ) )* ) ;
    public final EObject ruleCompEqExpr() throws RecognitionException {
        EObject current = null;

        EObject this_CompExpr_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:241:28: ( (this_CompExpr_0= ruleCompExpr ( () ( (lv_operator_2_0= ruleCompEqOperator ) ) ( (lv_right_3_0= ruleCompExpr ) ) )* ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:242:1: (this_CompExpr_0= ruleCompExpr ( () ( (lv_operator_2_0= ruleCompEqOperator ) ) ( (lv_right_3_0= ruleCompExpr ) ) )* )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:242:1: (this_CompExpr_0= ruleCompExpr ( () ( (lv_operator_2_0= ruleCompEqOperator ) ) ( (lv_right_3_0= ruleCompExpr ) ) )* )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:243:5: this_CompExpr_0= ruleCompExpr ( () ( (lv_operator_2_0= ruleCompEqOperator ) ) ( (lv_right_3_0= ruleCompExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getCompEqExprAccess().getCompExprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleCompExpr_in_ruleCompEqExpr508);
            this_CompExpr_0=ruleCompExpr();

            state._fsp--;

             
                    current = this_CompExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:251:1: ( () ( (lv_operator_2_0= ruleCompEqOperator ) ) ( (lv_right_3_0= ruleCompExpr ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=21 && LA4_0<=22)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:251:2: () ( (lv_operator_2_0= ruleCompEqOperator ) ) ( (lv_right_3_0= ruleCompExpr ) )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:251:2: ()
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:252:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getCompEqExprAccess().getCompEqExprLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:257:2: ( (lv_operator_2_0= ruleCompEqOperator ) )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:258:1: (lv_operator_2_0= ruleCompEqOperator )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:258:1: (lv_operator_2_0= ruleCompEqOperator )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:259:3: lv_operator_2_0= ruleCompEqOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompEqExprAccess().getOperatorCompEqOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCompEqOperator_in_ruleCompEqExpr538);
            	    lv_operator_2_0=ruleCompEqOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCompEqExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operator",
            	            		lv_operator_2_0, 
            	            		"CompEqOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:275:2: ( (lv_right_3_0= ruleCompExpr ) )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:276:1: (lv_right_3_0= ruleCompExpr )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:276:1: (lv_right_3_0= ruleCompExpr )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:277:3: lv_right_3_0= ruleCompExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompEqExprAccess().getRightCompExprParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCompExpr_in_ruleCompEqExpr559);
            	    lv_right_3_0=ruleCompExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCompEqExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"CompExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleCompEqExpr"


    // $ANTLR start "entryRuleCompExpr"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:301:1: entryRuleCompExpr returns [EObject current=null] : iv_ruleCompExpr= ruleCompExpr EOF ;
    public final EObject entryRuleCompExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompExpr = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:302:2: (iv_ruleCompExpr= ruleCompExpr EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:303:2: iv_ruleCompExpr= ruleCompExpr EOF
            {
             newCompositeNode(grammarAccess.getCompExprRule()); 
            pushFollow(FOLLOW_ruleCompExpr_in_entryRuleCompExpr597);
            iv_ruleCompExpr=ruleCompExpr();

            state._fsp--;

             current =iv_ruleCompExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompExpr607); 

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
    // $ANTLR end "entryRuleCompExpr"


    // $ANTLR start "ruleCompExpr"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:310:1: ruleCompExpr returns [EObject current=null] : (this_UnaryExpr_0= ruleUnaryExpr ( () ( (lv_operator_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* ) ;
    public final EObject ruleCompExpr() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpr_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:313:28: ( (this_UnaryExpr_0= ruleUnaryExpr ( () ( (lv_operator_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:314:1: (this_UnaryExpr_0= ruleUnaryExpr ( () ( (lv_operator_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:314:1: (this_UnaryExpr_0= ruleUnaryExpr ( () ( (lv_operator_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:315:5: this_UnaryExpr_0= ruleUnaryExpr ( () ( (lv_operator_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getCompExprAccess().getUnaryExprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUnaryExpr_in_ruleCompExpr654);
            this_UnaryExpr_0=ruleUnaryExpr();

            state._fsp--;

             
                    current = this_UnaryExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:323:1: ( () ( (lv_operator_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=23 && LA5_0<=26)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:323:2: () ( (lv_operator_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleUnaryExpr ) )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:323:2: ()
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:324:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getCompExprAccess().getCompExprLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:329:2: ( (lv_operator_2_0= ruleCompOperator ) )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:330:1: (lv_operator_2_0= ruleCompOperator )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:330:1: (lv_operator_2_0= ruleCompOperator )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:331:3: lv_operator_2_0= ruleCompOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompExprAccess().getOperatorCompOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCompOperator_in_ruleCompExpr684);
            	    lv_operator_2_0=ruleCompOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCompExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operator",
            	            		lv_operator_2_0, 
            	            		"CompOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:347:2: ( (lv_right_3_0= ruleUnaryExpr ) )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:348:1: (lv_right_3_0= ruleUnaryExpr )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:348:1: (lv_right_3_0= ruleUnaryExpr )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:349:3: lv_right_3_0= ruleUnaryExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompExprAccess().getRightUnaryExprParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnaryExpr_in_ruleCompExpr705);
            	    lv_right_3_0=ruleUnaryExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCompExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"UnaryExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleCompExpr"


    // $ANTLR start "entryRuleUnaryExpr"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:373:1: entryRuleUnaryExpr returns [EObject current=null] : iv_ruleUnaryExpr= ruleUnaryExpr EOF ;
    public final EObject entryRuleUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpr = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:374:2: (iv_ruleUnaryExpr= ruleUnaryExpr EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:375:2: iv_ruleUnaryExpr= ruleUnaryExpr EOF
            {
             newCompositeNode(grammarAccess.getUnaryExprRule()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr743);
            iv_ruleUnaryExpr=ruleUnaryExpr();

            state._fsp--;

             current =iv_ruleUnaryExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpr753); 

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
    // $ANTLR end "entryRuleUnaryExpr"


    // $ANTLR start "ruleUnaryExpr"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:382:1: ruleUnaryExpr returns [EObject current=null] : (this_Atom_0= ruleAtom | ( () otherlv_2= 'not' ( (lv_expr_3_0= ruleUnaryExpr ) ) ) ) ;
    public final EObject ruleUnaryExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Atom_0 = null;

        EObject lv_expr_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:385:28: ( (this_Atom_0= ruleAtom | ( () otherlv_2= 'not' ( (lv_expr_3_0= ruleUnaryExpr ) ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:386:1: (this_Atom_0= ruleAtom | ( () otherlv_2= 'not' ( (lv_expr_3_0= ruleUnaryExpr ) ) ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:386:1: (this_Atom_0= ruleAtom | ( () otherlv_2= 'not' ( (lv_expr_3_0= ruleUnaryExpr ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)||LA6_0==14||LA6_0==16||(LA6_0>=18 && LA6_0<=20)) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:387:5: this_Atom_0= ruleAtom
                    {
                     
                            newCompositeNode(grammarAccess.getUnaryExprAccess().getAtomParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAtom_in_ruleUnaryExpr800);
                    this_Atom_0=ruleAtom();

                    state._fsp--;

                     
                            current = this_Atom_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:396:6: ( () otherlv_2= 'not' ( (lv_expr_3_0= ruleUnaryExpr ) ) )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:396:6: ( () otherlv_2= 'not' ( (lv_expr_3_0= ruleUnaryExpr ) ) )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:396:7: () otherlv_2= 'not' ( (lv_expr_3_0= ruleUnaryExpr ) )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:396:7: ()
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:397:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUnaryExprAccess().getUnaryExprAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleUnaryExpr827); 

                        	newLeafNode(otherlv_2, grammarAccess.getUnaryExprAccess().getNotKeyword_1_1());
                        
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:406:1: ( (lv_expr_3_0= ruleUnaryExpr ) )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:407:1: (lv_expr_3_0= ruleUnaryExpr )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:407:1: (lv_expr_3_0= ruleUnaryExpr )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:408:3: lv_expr_3_0= ruleUnaryExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnaryExprAccess().getExprUnaryExprParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUnaryExpr_in_ruleUnaryExpr848);
                    lv_expr_3_0=ruleUnaryExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnaryExprRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_3_0, 
                            		"UnaryExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


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
    // $ANTLR end "ruleUnaryExpr"


    // $ANTLR start "entryRuleAtom"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:432:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:433:2: (iv_ruleAtom= ruleAtom EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:434:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom885);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom895); 

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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:441:1: ruleAtom returns [EObject current=null] : (this_Value_0= ruleValue | this_Words_1= ruleWords | this_ParenExpr_2= ruleParenExpr ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        EObject this_Value_0 = null;

        EObject this_Words_1 = null;

        EObject this_ParenExpr_2 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:444:28: ( (this_Value_0= ruleValue | this_Words_1= ruleWords | this_ParenExpr_2= ruleParenExpr ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:445:1: (this_Value_0= ruleValue | this_Words_1= ruleWords | this_ParenExpr_2= ruleParenExpr )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:445:1: (this_Value_0= ruleValue | this_Words_1= ruleWords | this_ParenExpr_2= ruleParenExpr )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case 16:
            case 18:
            case 19:
            case 20:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==EOF||(LA7_2>=11 && LA7_2<=12)||LA7_2==15||(LA7_2>=21 && LA7_2<=26)) ) {
                    alt7=1;
                }
                else if ( (LA7_2==RULE_ID) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:446:5: this_Value_0= ruleValue
                    {
                     
                            newCompositeNode(grammarAccess.getAtomAccess().getValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleValue_in_ruleAtom942);
                    this_Value_0=ruleValue();

                    state._fsp--;

                     
                            current = this_Value_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:456:5: this_Words_1= ruleWords
                    {
                     
                            newCompositeNode(grammarAccess.getAtomAccess().getWordsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWords_in_ruleAtom969);
                    this_Words_1=ruleWords();

                    state._fsp--;

                     
                            current = this_Words_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:466:5: this_ParenExpr_2= ruleParenExpr
                    {
                     
                            newCompositeNode(grammarAccess.getAtomAccess().getParenExprParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleParenExpr_in_ruleAtom996);
                    this_ParenExpr_2=ruleParenExpr();

                    state._fsp--;

                     
                            current = this_ParenExpr_2; 
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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleValue"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:482:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:483:2: (iv_ruleValue= ruleValue EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:484:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1031);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1041); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:491:1: ruleValue returns [EObject current=null] : (this_ProjectReference_0= ruleProjectReference | this_Word_1= ruleWord | this_Phrase_2= rulePhrase | this_TagReference_3= ruleTagReference | this_TextReference_4= ruleTextReference | this_TaskReference_5= ruleTaskReference ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_ProjectReference_0 = null;

        EObject this_Word_1 = null;

        EObject this_Phrase_2 = null;

        EObject this_TagReference_3 = null;

        EObject this_TextReference_4 = null;

        EObject this_TaskReference_5 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:494:28: ( (this_ProjectReference_0= ruleProjectReference | this_Word_1= ruleWord | this_Phrase_2= rulePhrase | this_TagReference_3= ruleTagReference | this_TextReference_4= ruleTextReference | this_TaskReference_5= ruleTaskReference ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:495:1: (this_ProjectReference_0= ruleProjectReference | this_Word_1= ruleWord | this_Phrase_2= rulePhrase | this_TagReference_3= ruleTagReference | this_TextReference_4= ruleTextReference | this_TaskReference_5= ruleTaskReference )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:495:1: (this_ProjectReference_0= ruleProjectReference | this_Word_1= ruleWord | this_Phrase_2= rulePhrase | this_TagReference_3= ruleTagReference | this_TextReference_4= ruleTextReference | this_TaskReference_5= ruleTaskReference )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case RULE_STRING:
                {
                alt8=3;
                }
                break;
            case 20:
                {
                alt8=4;
                }
                break;
            case 19:
                {
                alt8=5;
                }
                break;
            case 18:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:496:5: this_ProjectReference_0= ruleProjectReference
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getProjectReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleProjectReference_in_ruleValue1088);
                    this_ProjectReference_0=ruleProjectReference();

                    state._fsp--;

                     
                            current = this_ProjectReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:506:5: this_Word_1= ruleWord
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getWordParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWord_in_ruleValue1115);
                    this_Word_1=ruleWord();

                    state._fsp--;

                     
                            current = this_Word_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:516:5: this_Phrase_2= rulePhrase
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getPhraseParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePhrase_in_ruleValue1142);
                    this_Phrase_2=rulePhrase();

                    state._fsp--;

                     
                            current = this_Phrase_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:526:5: this_TagReference_3= ruleTagReference
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getTagReferenceParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleTagReference_in_ruleValue1169);
                    this_TagReference_3=ruleTagReference();

                    state._fsp--;

                     
                            current = this_TagReference_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:536:5: this_TextReference_4= ruleTextReference
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getTextReferenceParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleTextReference_in_ruleValue1196);
                    this_TextReference_4=ruleTextReference();

                    state._fsp--;

                     
                            current = this_TextReference_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:546:5: this_TaskReference_5= ruleTaskReference
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getTaskReferenceParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleTaskReference_in_ruleValue1223);
                    this_TaskReference_5=ruleTaskReference();

                    state._fsp--;

                     
                            current = this_TaskReference_5; 
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleParenExpr"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:562:1: entryRuleParenExpr returns [EObject current=null] : iv_ruleParenExpr= ruleParenExpr EOF ;
    public final EObject entryRuleParenExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenExpr = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:563:2: (iv_ruleParenExpr= ruleParenExpr EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:564:2: iv_ruleParenExpr= ruleParenExpr EOF
            {
             newCompositeNode(grammarAccess.getParenExprRule()); 
            pushFollow(FOLLOW_ruleParenExpr_in_entryRuleParenExpr1258);
            iv_ruleParenExpr=ruleParenExpr();

            state._fsp--;

             current =iv_ruleParenExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenExpr1268); 

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
    // $ANTLR end "entryRuleParenExpr"


    // $ANTLR start "ruleParenExpr"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:571:1: ruleParenExpr returns [EObject current=null] : (otherlv_0= '(' () ( (lv_expr_2_0= ruleOrExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleParenExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:574:28: ( (otherlv_0= '(' () ( (lv_expr_2_0= ruleOrExpr ) ) otherlv_3= ')' ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:575:1: (otherlv_0= '(' () ( (lv_expr_2_0= ruleOrExpr ) ) otherlv_3= ')' )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:575:1: (otherlv_0= '(' () ( (lv_expr_2_0= ruleOrExpr ) ) otherlv_3= ')' )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:575:3: otherlv_0= '(' () ( (lv_expr_2_0= ruleOrExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleParenExpr1305); 

                	newLeafNode(otherlv_0, grammarAccess.getParenExprAccess().getLeftParenthesisKeyword_0());
                
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:579:1: ()
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:580:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParenExprAccess().getParenExprAction_1(),
                        current);
                

            }

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:585:2: ( (lv_expr_2_0= ruleOrExpr ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:586:1: (lv_expr_2_0= ruleOrExpr )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:586:1: (lv_expr_2_0= ruleOrExpr )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:587:3: lv_expr_2_0= ruleOrExpr
            {
             
            	        newCompositeNode(grammarAccess.getParenExprAccess().getExprOrExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleOrExpr_in_ruleParenExpr1335);
            lv_expr_2_0=ruleOrExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParenExprRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_2_0, 
                    		"OrExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleParenExpr1347); 

                	newLeafNode(otherlv_3, grammarAccess.getParenExprAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleParenExpr"


    // $ANTLR start "entryRuleProjectReference"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:615:1: entryRuleProjectReference returns [EObject current=null] : iv_ruleProjectReference= ruleProjectReference EOF ;
    public final EObject entryRuleProjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectReference = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:616:2: (iv_ruleProjectReference= ruleProjectReference EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:617:2: iv_ruleProjectReference= ruleProjectReference EOF
            {
             newCompositeNode(grammarAccess.getProjectReferenceRule()); 
            pushFollow(FOLLOW_ruleProjectReference_in_entryRuleProjectReference1383);
            iv_ruleProjectReference=ruleProjectReference();

            state._fsp--;

             current =iv_ruleProjectReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjectReference1393); 

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
    // $ANTLR end "entryRuleProjectReference"


    // $ANTLR start "ruleProjectReference"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:624:1: ruleProjectReference returns [EObject current=null] : (otherlv_0= 'project' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleProjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:627:28: ( (otherlv_0= 'project' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:628:1: (otherlv_0= 'project' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:628:1: (otherlv_0= 'project' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:628:3: otherlv_0= 'project' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleProjectReference1430); 

                	newLeafNode(otherlv_0, grammarAccess.getProjectReferenceAccess().getProjectKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleProjectReference1442); 

                	newLeafNode(otherlv_1, grammarAccess.getProjectReferenceAccess().getColonKeyword_1());
                
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:636:1: ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) )
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
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:636:2: ( (lv_value_2_0= RULE_ID ) )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:636:2: ( (lv_value_2_0= RULE_ID ) )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:637:1: (lv_value_2_0= RULE_ID )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:637:1: (lv_value_2_0= RULE_ID )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:638:3: lv_value_2_0= RULE_ID
                    {
                    lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProjectReference1460); 

                    			newLeafNode(lv_value_2_0, grammarAccess.getProjectReferenceAccess().getValueIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectReferenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:655:6: ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:655:6: ( (lv_value_3_0= RULE_STRING ) )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:656:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:656:1: (lv_value_3_0= RULE_STRING )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:657:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProjectReference1488); 

                    			newLeafNode(lv_value_3_0, grammarAccess.getProjectReferenceAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectReferenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"STRING");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleProjectReference"


    // $ANTLR start "entryRuleTaskReference"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:681:1: entryRuleTaskReference returns [EObject current=null] : iv_ruleTaskReference= ruleTaskReference EOF ;
    public final EObject entryRuleTaskReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskReference = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:682:2: (iv_ruleTaskReference= ruleTaskReference EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:683:2: iv_ruleTaskReference= ruleTaskReference EOF
            {
             newCompositeNode(grammarAccess.getTaskReferenceRule()); 
            pushFollow(FOLLOW_ruleTaskReference_in_entryRuleTaskReference1530);
            iv_ruleTaskReference=ruleTaskReference();

            state._fsp--;

             current =iv_ruleTaskReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaskReference1540); 

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
    // $ANTLR end "entryRuleTaskReference"


    // $ANTLR start "ruleTaskReference"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:690:1: ruleTaskReference returns [EObject current=null] : (otherlv_0= 'task' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleTaskReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:693:28: ( (otherlv_0= 'task' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:694:1: (otherlv_0= 'task' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:694:1: (otherlv_0= 'task' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:694:3: otherlv_0= 'task' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleTaskReference1577); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskReferenceAccess().getTaskKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleTaskReference1589); 

                	newLeafNode(otherlv_1, grammarAccess.getTaskReferenceAccess().getColonKeyword_1());
                
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:702:1: ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:702:2: ( (lv_value_2_0= RULE_ID ) )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:702:2: ( (lv_value_2_0= RULE_ID ) )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:703:1: (lv_value_2_0= RULE_ID )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:703:1: (lv_value_2_0= RULE_ID )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:704:3: lv_value_2_0= RULE_ID
                    {
                    lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTaskReference1607); 

                    			newLeafNode(lv_value_2_0, grammarAccess.getTaskReferenceAccess().getValueIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTaskReferenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:721:6: ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:721:6: ( (lv_value_3_0= RULE_STRING ) )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:722:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:722:1: (lv_value_3_0= RULE_STRING )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:723:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTaskReference1635); 

                    			newLeafNode(lv_value_3_0, grammarAccess.getTaskReferenceAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTaskReferenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"STRING");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleTaskReference"


    // $ANTLR start "entryRuleTextReference"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:747:1: entryRuleTextReference returns [EObject current=null] : iv_ruleTextReference= ruleTextReference EOF ;
    public final EObject entryRuleTextReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextReference = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:748:2: (iv_ruleTextReference= ruleTextReference EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:749:2: iv_ruleTextReference= ruleTextReference EOF
            {
             newCompositeNode(grammarAccess.getTextReferenceRule()); 
            pushFollow(FOLLOW_ruleTextReference_in_entryRuleTextReference1677);
            iv_ruleTextReference=ruleTextReference();

            state._fsp--;

             current =iv_ruleTextReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextReference1687); 

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
    // $ANTLR end "entryRuleTextReference"


    // $ANTLR start "ruleTextReference"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:756:1: ruleTextReference returns [EObject current=null] : (otherlv_0= 'text' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleTextReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:759:28: ( (otherlv_0= 'text' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:760:1: (otherlv_0= 'text' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:760:1: (otherlv_0= 'text' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:760:3: otherlv_0= 'text' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleTextReference1724); 

                	newLeafNode(otherlv_0, grammarAccess.getTextReferenceAccess().getTextKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleTextReference1736); 

                	newLeafNode(otherlv_1, grammarAccess.getTextReferenceAccess().getColonKeyword_1());
                
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:768:1: ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_STRING) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:768:2: ( (lv_value_2_0= RULE_ID ) )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:768:2: ( (lv_value_2_0= RULE_ID ) )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:769:1: (lv_value_2_0= RULE_ID )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:769:1: (lv_value_2_0= RULE_ID )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:770:3: lv_value_2_0= RULE_ID
                    {
                    lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTextReference1754); 

                    			newLeafNode(lv_value_2_0, grammarAccess.getTextReferenceAccess().getValueIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTextReferenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:787:6: ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:787:6: ( (lv_value_3_0= RULE_STRING ) )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:788:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:788:1: (lv_value_3_0= RULE_STRING )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:789:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextReference1782); 

                    			newLeafNode(lv_value_3_0, grammarAccess.getTextReferenceAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTextReferenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"STRING");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleTextReference"


    // $ANTLR start "entryRuleWords"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:813:1: entryRuleWords returns [EObject current=null] : iv_ruleWords= ruleWords EOF ;
    public final EObject entryRuleWords() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWords = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:814:2: (iv_ruleWords= ruleWords EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:815:2: iv_ruleWords= ruleWords EOF
            {
             newCompositeNode(grammarAccess.getWordsRule()); 
            pushFollow(FOLLOW_ruleWords_in_entryRuleWords1824);
            iv_ruleWords=ruleWords();

            state._fsp--;

             current =iv_ruleWords; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWords1834); 

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
    // $ANTLR end "entryRuleWords"


    // $ANTLR start "ruleWords"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:822:1: ruleWords returns [EObject current=null] : ( ( (lv_values_0_0= RULE_ID ) ) ( (lv_values_1_0= RULE_ID ) )+ ) ;
    public final EObject ruleWords() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;
        Token lv_values_1_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:825:28: ( ( ( (lv_values_0_0= RULE_ID ) ) ( (lv_values_1_0= RULE_ID ) )+ ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:826:1: ( ( (lv_values_0_0= RULE_ID ) ) ( (lv_values_1_0= RULE_ID ) )+ )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:826:1: ( ( (lv_values_0_0= RULE_ID ) ) ( (lv_values_1_0= RULE_ID ) )+ )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:826:2: ( (lv_values_0_0= RULE_ID ) ) ( (lv_values_1_0= RULE_ID ) )+
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:826:2: ( (lv_values_0_0= RULE_ID ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:827:1: (lv_values_0_0= RULE_ID )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:827:1: (lv_values_0_0= RULE_ID )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:828:3: lv_values_0_0= RULE_ID
            {
            lv_values_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWords1876); 

            			newLeafNode(lv_values_0_0, grammarAccess.getWordsAccess().getValuesIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWordsRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"values",
                    		lv_values_0_0, 
                    		"ID");
            	    

            }


            }

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:844:2: ( (lv_values_1_0= RULE_ID ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:845:1: (lv_values_1_0= RULE_ID )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:845:1: (lv_values_1_0= RULE_ID )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:846:3: lv_values_1_0= RULE_ID
            	    {
            	    lv_values_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWords1898); 

            	    			newLeafNode(lv_values_1_0, grammarAccess.getWordsAccess().getValuesIDTerminalRuleCall_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getWordsRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"values",
            	            		lv_values_1_0, 
            	            		"ID");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // $ANTLR end "ruleWords"


    // $ANTLR start "entryRuleWord"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:870:1: entryRuleWord returns [EObject current=null] : iv_ruleWord= ruleWord EOF ;
    public final EObject entryRuleWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWord = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:871:2: (iv_ruleWord= ruleWord EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:872:2: iv_ruleWord= ruleWord EOF
            {
             newCompositeNode(grammarAccess.getWordRule()); 
            pushFollow(FOLLOW_ruleWord_in_entryRuleWord1940);
            iv_ruleWord=ruleWord();

            state._fsp--;

             current =iv_ruleWord; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWord1950); 

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
    // $ANTLR end "entryRuleWord"


    // $ANTLR start "ruleWord"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:879:1: ruleWord returns [EObject current=null] : ( (lv_value_0_0= RULE_ID ) ) ;
    public final EObject ruleWord() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:882:28: ( ( (lv_value_0_0= RULE_ID ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:883:1: ( (lv_value_0_0= RULE_ID ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:883:1: ( (lv_value_0_0= RULE_ID ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:884:1: (lv_value_0_0= RULE_ID )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:884:1: (lv_value_0_0= RULE_ID )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:885:3: lv_value_0_0= RULE_ID
            {
            lv_value_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWord1991); 

            			newLeafNode(lv_value_0_0, grammarAccess.getWordAccess().getValueIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWordRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleWord"


    // $ANTLR start "entryRulePhrase"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:909:1: entryRulePhrase returns [EObject current=null] : iv_rulePhrase= rulePhrase EOF ;
    public final EObject entryRulePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhrase = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:910:2: (iv_rulePhrase= rulePhrase EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:911:2: iv_rulePhrase= rulePhrase EOF
            {
             newCompositeNode(grammarAccess.getPhraseRule()); 
            pushFollow(FOLLOW_rulePhrase_in_entryRulePhrase2031);
            iv_rulePhrase=rulePhrase();

            state._fsp--;

             current =iv_rulePhrase; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhrase2041); 

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
    // $ANTLR end "entryRulePhrase"


    // $ANTLR start "rulePhrase"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:918:1: rulePhrase returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject rulePhrase() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:921:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:922:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:922:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:923:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:923:1: (lv_value_0_0= RULE_STRING )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:924:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePhrase2082); 

            			newLeafNode(lv_value_0_0, grammarAccess.getPhraseAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPhraseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "rulePhrase"


    // $ANTLR start "entryRuleTagReference"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:948:1: entryRuleTagReference returns [EObject current=null] : iv_ruleTagReference= ruleTagReference EOF ;
    public final EObject entryRuleTagReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagReference = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:949:2: (iv_ruleTagReference= ruleTagReference EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:950:2: iv_ruleTagReference= ruleTagReference EOF
            {
             newCompositeNode(grammarAccess.getTagReferenceRule()); 
            pushFollow(FOLLOW_ruleTagReference_in_entryRuleTagReference2122);
            iv_ruleTagReference=ruleTagReference();

            state._fsp--;

             current =iv_ruleTagReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagReference2132); 

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
    // $ANTLR end "entryRuleTagReference"


    // $ANTLR start "ruleTagReference"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:957:1: ruleTagReference returns [EObject current=null] : (otherlv_0= '@' ( (lv_value_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTagReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:960:28: ( (otherlv_0= '@' ( (lv_value_1_0= RULE_ID ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:961:1: (otherlv_0= '@' ( (lv_value_1_0= RULE_ID ) ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:961:1: (otherlv_0= '@' ( (lv_value_1_0= RULE_ID ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:961:3: otherlv_0= '@' ( (lv_value_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleTagReference2169); 

                	newLeafNode(otherlv_0, grammarAccess.getTagReferenceAccess().getCommercialAtKeyword_0());
                
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:965:1: ( (lv_value_1_0= RULE_ID ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:966:1: (lv_value_1_0= RULE_ID )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:966:1: (lv_value_1_0= RULE_ID )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:967:3: lv_value_1_0= RULE_ID
            {
            lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTagReference2186); 

            			newLeafNode(lv_value_1_0, grammarAccess.getTagReferenceAccess().getValueIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTagReferenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleTagReference"


    // $ANTLR start "ruleCompEqOperator"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:991:1: ruleCompEqOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) ) ;
    public final Enumerator ruleCompEqOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:993:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:994:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:994:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            else if ( (LA13_0==22) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:994:2: (enumLiteral_0= '=' )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:994:2: (enumLiteral_0= '=' )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:994:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_21_in_ruleCompEqOperator2241); 

                            current = grammarAccess.getCompEqOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCompEqOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1000:6: (enumLiteral_1= '!=' )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1000:6: (enumLiteral_1= '!=' )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1000:8: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_22_in_ruleCompEqOperator2258); 

                            current = grammarAccess.getCompEqOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCompEqOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_1()); 
                        

                    }


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
    // $ANTLR end "ruleCompEqOperator"


    // $ANTLR start "ruleCompOperator"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1010:1: ruleCompOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) ) ;
    public final Enumerator ruleCompOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1012:28: ( ( (enumLiteral_0= '<=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1013:1: ( (enumLiteral_0= '<=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1013:1: ( (enumLiteral_0= '<=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt14=1;
                }
                break;
            case 24:
                {
                alt14=2;
                }
                break;
            case 25:
                {
                alt14=3;
                }
                break;
            case 26:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1013:2: (enumLiteral_0= '<=' )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1013:2: (enumLiteral_0= '<=' )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1013:4: enumLiteral_0= '<='
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_23_in_ruleCompOperator2303); 

                            current = grammarAccess.getCompOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCompOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1019:6: (enumLiteral_1= '<' )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1019:6: (enumLiteral_1= '<' )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1019:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_24_in_ruleCompOperator2320); 

                            current = grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1025:6: (enumLiteral_2= '>=' )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1025:6: (enumLiteral_2= '>=' )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1025:8: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_25_in_ruleCompOperator2337); 

                            current = grammarAccess.getCompOperatorAccess().getGREATER_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCompOperatorAccess().getGREATER_EQUALEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1031:6: (enumLiteral_3= '>' )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1031:6: (enumLiteral_3= '>' )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1031:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,26,FOLLOW_26_in_ruleCompOperator2354); 

                            current = grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_3()); 
                        

                    }


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
    // $ANTLR end "ruleCompOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_ruleQuery140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_entryRuleOrExpr177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpr187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_ruleOrExpr234 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleOrExpr255 = new BitSet(new long[]{0x00000000001D6030L});
    public static final BitSet FOLLOW_ruleAndExpr_in_ruleOrExpr276 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleAndExpr_in_entryRuleAndExpr314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpr324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompEqExpr_in_ruleAndExpr371 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleAndExpr392 = new BitSet(new long[]{0x00000000001D6030L});
    public static final BitSet FOLLOW_ruleCompEqExpr_in_ruleAndExpr413 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleCompEqExpr_in_entryRuleCompEqExpr451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompEqExpr461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompExpr_in_ruleCompEqExpr508 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleCompEqOperator_in_ruleCompEqExpr538 = new BitSet(new long[]{0x00000000001D6030L});
    public static final BitSet FOLLOW_ruleCompExpr_in_ruleCompEqExpr559 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleCompExpr_in_entryRuleCompExpr597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompExpr607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_ruleCompExpr654 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_ruleCompOperator_in_ruleCompExpr684 = new BitSet(new long[]{0x00000000001D6030L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_ruleCompExpr705 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpr753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleUnaryExpr800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleUnaryExpr827 = new BitSet(new long[]{0x00000000001D6030L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_ruleUnaryExpr848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAtom942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWords_in_ruleAtom969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenExpr_in_ruleAtom996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectReference_in_ruleValue1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_ruleValue1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhrase_in_ruleValue1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagReference_in_ruleValue1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextReference_in_ruleValue1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskReference_in_ruleValue1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenExpr_in_entryRuleParenExpr1258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenExpr1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleParenExpr1305 = new BitSet(new long[]{0x00000000001D6030L});
    public static final BitSet FOLLOW_ruleOrExpr_in_ruleParenExpr1335 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleParenExpr1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectReference_in_entryRuleProjectReference1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjectReference1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleProjectReference1430 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProjectReference1442 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProjectReference1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProjectReference1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskReference_in_entryRuleTaskReference1530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaskReference1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTaskReference1577 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTaskReference1589 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTaskReference1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTaskReference1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextReference_in_entryRuleTextReference1677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextReference1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTextReference1724 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTextReference1736 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTextReference1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextReference1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWords_in_entryRuleWords1824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWords1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWords1876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWords1898 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleWord_in_entryRuleWord1940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWord1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWord1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhrase_in_entryRulePhrase2031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhrase2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePhrase2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagReference_in_entryRuleTagReference2122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagReference2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleTagReference2169 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTagReference2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCompEqOperator2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleCompEqOperator2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleCompOperator2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCompOperator2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCompOperator2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCompOperator2354 = new BitSet(new long[]{0x0000000000000002L});

}