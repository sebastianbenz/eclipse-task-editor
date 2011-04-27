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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'or'", "'||'", "'and'", "'&&'", "'not'", "'!'", "'('", "')'", "'project'", "':'", "'task'", "'text'", "'@'", "'='", "'!='", "'<='", "'<'", "'>='", "'>'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
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

            if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)||(LA1_0>=15 && LA1_0<=17)||LA1_0==19||(LA1_0>=21 && LA1_0<=23)) ) {
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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:122:1: ruleOrExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( () (otherlv_2= 'or' | otherlv_3= '||' ) ( (lv_right_4_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_AndExpr_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:125:28: ( (this_AndExpr_0= ruleAndExpr ( () (otherlv_2= 'or' | otherlv_3= '||' ) ( (lv_right_4_0= ruleAndExpr ) ) )* ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:126:1: (this_AndExpr_0= ruleAndExpr ( () (otherlv_2= 'or' | otherlv_3= '||' ) ( (lv_right_4_0= ruleAndExpr ) ) )* )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:126:1: (this_AndExpr_0= ruleAndExpr ( () (otherlv_2= 'or' | otherlv_3= '||' ) ( (lv_right_4_0= ruleAndExpr ) ) )* )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:127:5: this_AndExpr_0= ruleAndExpr ( () (otherlv_2= 'or' | otherlv_3= '||' ) ( (lv_right_4_0= ruleAndExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAndExpr_in_ruleOrExpr234);
            this_AndExpr_0=ruleAndExpr();

            state._fsp--;

             
                    current = this_AndExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:135:1: ( () (otherlv_2= 'or' | otherlv_3= '||' ) ( (lv_right_4_0= ruleAndExpr ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=11 && LA3_0<=12)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:135:2: () (otherlv_2= 'or' | otherlv_3= '||' ) ( (lv_right_4_0= ruleAndExpr ) )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:135:2: ()
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:136:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrExprAccess().getOrExprLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:141:2: (otherlv_2= 'or' | otherlv_3= '||' )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==11) ) {
            	        alt2=1;
            	    }
            	    else if ( (LA2_0==12) ) {
            	        alt2=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:141:4: otherlv_2= 'or'
            	            {
            	            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleOrExpr256); 

            	                	newLeafNode(otherlv_2, grammarAccess.getOrExprAccess().getOrKeyword_1_1_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:146:7: otherlv_3= '||'
            	            {
            	            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleOrExpr274); 

            	                	newLeafNode(otherlv_3, grammarAccess.getOrExprAccess().getVerticalLineVerticalLineKeyword_1_1_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:150:2: ( (lv_right_4_0= ruleAndExpr ) )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:151:1: (lv_right_4_0= ruleAndExpr )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:151:1: (lv_right_4_0= ruleAndExpr )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:152:3: lv_right_4_0= ruleAndExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndExpr_in_ruleOrExpr296);
            	    lv_right_4_0=ruleAndExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_4_0, 
            	            		"AndExpr");
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
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleAndExpr"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:176:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:177:2: (iv_ruleAndExpr= ruleAndExpr EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:178:2: iv_ruleAndExpr= ruleAndExpr EOF
            {
             newCompositeNode(grammarAccess.getAndExprRule()); 
            pushFollow(FOLLOW_ruleAndExpr_in_entryRuleAndExpr334);
            iv_ruleAndExpr=ruleAndExpr();

            state._fsp--;

             current =iv_ruleAndExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpr344); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:185:1: ruleAndExpr returns [EObject current=null] : (this_CompEqExpr_0= ruleCompEqExpr ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ( (lv_right_4_0= ruleCompEqExpr ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_CompEqExpr_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:188:28: ( (this_CompEqExpr_0= ruleCompEqExpr ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ( (lv_right_4_0= ruleCompEqExpr ) ) )* ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:189:1: (this_CompEqExpr_0= ruleCompEqExpr ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ( (lv_right_4_0= ruleCompEqExpr ) ) )* )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:189:1: (this_CompEqExpr_0= ruleCompEqExpr ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ( (lv_right_4_0= ruleCompEqExpr ) ) )* )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:190:5: this_CompEqExpr_0= ruleCompEqExpr ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ( (lv_right_4_0= ruleCompEqExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndExprAccess().getCompEqExprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleCompEqExpr_in_ruleAndExpr391);
            this_CompEqExpr_0=ruleCompEqExpr();

            state._fsp--;

             
                    current = this_CompEqExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:198:1: ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ( (lv_right_4_0= ruleCompEqExpr ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=13 && LA5_0<=14)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:198:2: () (otherlv_2= 'and' | otherlv_3= '&&' ) ( (lv_right_4_0= ruleCompEqExpr ) )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:198:2: ()
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:199:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndExprAccess().getAndExprLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:204:2: (otherlv_2= 'and' | otherlv_3= '&&' )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==13) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==14) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:204:4: otherlv_2= 'and'
            	            {
            	            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleAndExpr413); 

            	                	newLeafNode(otherlv_2, grammarAccess.getAndExprAccess().getAndKeyword_1_1_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:209:7: otherlv_3= '&&'
            	            {
            	            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleAndExpr431); 

            	                	newLeafNode(otherlv_3, grammarAccess.getAndExprAccess().getAmpersandAmpersandKeyword_1_1_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:213:2: ( (lv_right_4_0= ruleCompEqExpr ) )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:214:1: (lv_right_4_0= ruleCompEqExpr )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:214:1: (lv_right_4_0= ruleCompEqExpr )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:215:3: lv_right_4_0= ruleCompEqExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExprAccess().getRightCompEqExprParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCompEqExpr_in_ruleAndExpr453);
            	    lv_right_4_0=ruleCompEqExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_4_0, 
            	            		"CompEqExpr");
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
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRuleCompEqExpr"
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:239:1: entryRuleCompEqExpr returns [EObject current=null] : iv_ruleCompEqExpr= ruleCompEqExpr EOF ;
    public final EObject entryRuleCompEqExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompEqExpr = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:240:2: (iv_ruleCompEqExpr= ruleCompEqExpr EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:241:2: iv_ruleCompEqExpr= ruleCompEqExpr EOF
            {
             newCompositeNode(grammarAccess.getCompEqExprRule()); 
            pushFollow(FOLLOW_ruleCompEqExpr_in_entryRuleCompEqExpr491);
            iv_ruleCompEqExpr=ruleCompEqExpr();

            state._fsp--;

             current =iv_ruleCompEqExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompEqExpr501); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:248:1: ruleCompEqExpr returns [EObject current=null] : (this_CompExpr_0= ruleCompExpr ( () ( (lv_operator_2_0= ruleCompEqOperator ) ) ( (lv_right_3_0= ruleCompExpr ) ) )* ) ;
    public final EObject ruleCompEqExpr() throws RecognitionException {
        EObject current = null;

        EObject this_CompExpr_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:251:28: ( (this_CompExpr_0= ruleCompExpr ( () ( (lv_operator_2_0= ruleCompEqOperator ) ) ( (lv_right_3_0= ruleCompExpr ) ) )* ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:252:1: (this_CompExpr_0= ruleCompExpr ( () ( (lv_operator_2_0= ruleCompEqOperator ) ) ( (lv_right_3_0= ruleCompExpr ) ) )* )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:252:1: (this_CompExpr_0= ruleCompExpr ( () ( (lv_operator_2_0= ruleCompEqOperator ) ) ( (lv_right_3_0= ruleCompExpr ) ) )* )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:253:5: this_CompExpr_0= ruleCompExpr ( () ( (lv_operator_2_0= ruleCompEqOperator ) ) ( (lv_right_3_0= ruleCompExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getCompEqExprAccess().getCompExprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleCompExpr_in_ruleCompEqExpr548);
            this_CompExpr_0=ruleCompExpr();

            state._fsp--;

             
                    current = this_CompExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:261:1: ( () ( (lv_operator_2_0= ruleCompEqOperator ) ) ( (lv_right_3_0= ruleCompExpr ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=24 && LA6_0<=25)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:261:2: () ( (lv_operator_2_0= ruleCompEqOperator ) ) ( (lv_right_3_0= ruleCompExpr ) )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:261:2: ()
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:262:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getCompEqExprAccess().getCompEqExprLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:267:2: ( (lv_operator_2_0= ruleCompEqOperator ) )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:268:1: (lv_operator_2_0= ruleCompEqOperator )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:268:1: (lv_operator_2_0= ruleCompEqOperator )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:269:3: lv_operator_2_0= ruleCompEqOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompEqExprAccess().getOperatorCompEqOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCompEqOperator_in_ruleCompEqExpr578);
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

            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:285:2: ( (lv_right_3_0= ruleCompExpr ) )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:286:1: (lv_right_3_0= ruleCompExpr )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:286:1: (lv_right_3_0= ruleCompExpr )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:287:3: lv_right_3_0= ruleCompExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompEqExprAccess().getRightCompExprParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCompExpr_in_ruleCompEqExpr599);
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
            	    break loop6;
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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:311:1: entryRuleCompExpr returns [EObject current=null] : iv_ruleCompExpr= ruleCompExpr EOF ;
    public final EObject entryRuleCompExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompExpr = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:312:2: (iv_ruleCompExpr= ruleCompExpr EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:313:2: iv_ruleCompExpr= ruleCompExpr EOF
            {
             newCompositeNode(grammarAccess.getCompExprRule()); 
            pushFollow(FOLLOW_ruleCompExpr_in_entryRuleCompExpr637);
            iv_ruleCompExpr=ruleCompExpr();

            state._fsp--;

             current =iv_ruleCompExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompExpr647); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:320:1: ruleCompExpr returns [EObject current=null] : (this_UnaryExpr_0= ruleUnaryExpr ( () ( (lv_operator_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* ) ;
    public final EObject ruleCompExpr() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpr_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:323:28: ( (this_UnaryExpr_0= ruleUnaryExpr ( () ( (lv_operator_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:324:1: (this_UnaryExpr_0= ruleUnaryExpr ( () ( (lv_operator_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:324:1: (this_UnaryExpr_0= ruleUnaryExpr ( () ( (lv_operator_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:325:5: this_UnaryExpr_0= ruleUnaryExpr ( () ( (lv_operator_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getCompExprAccess().getUnaryExprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUnaryExpr_in_ruleCompExpr694);
            this_UnaryExpr_0=ruleUnaryExpr();

            state._fsp--;

             
                    current = this_UnaryExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:333:1: ( () ( (lv_operator_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=26 && LA7_0<=29)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:333:2: () ( (lv_operator_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleUnaryExpr ) )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:333:2: ()
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:334:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getCompExprAccess().getCompExprLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:339:2: ( (lv_operator_2_0= ruleCompOperator ) )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:340:1: (lv_operator_2_0= ruleCompOperator )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:340:1: (lv_operator_2_0= ruleCompOperator )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:341:3: lv_operator_2_0= ruleCompOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompExprAccess().getOperatorCompOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCompOperator_in_ruleCompExpr724);
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

            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:357:2: ( (lv_right_3_0= ruleUnaryExpr ) )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:358:1: (lv_right_3_0= ruleUnaryExpr )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:358:1: (lv_right_3_0= ruleUnaryExpr )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:359:3: lv_right_3_0= ruleUnaryExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompExprAccess().getRightUnaryExprParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnaryExpr_in_ruleCompExpr745);
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
            	    break loop7;
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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:383:1: entryRuleUnaryExpr returns [EObject current=null] : iv_ruleUnaryExpr= ruleUnaryExpr EOF ;
    public final EObject entryRuleUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpr = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:384:2: (iv_ruleUnaryExpr= ruleUnaryExpr EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:385:2: iv_ruleUnaryExpr= ruleUnaryExpr EOF
            {
             newCompositeNode(grammarAccess.getUnaryExprRule()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr783);
            iv_ruleUnaryExpr=ruleUnaryExpr();

            state._fsp--;

             current =iv_ruleUnaryExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpr793); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:392:1: ruleUnaryExpr returns [EObject current=null] : (this_Atom_0= ruleAtom | ( () (otherlv_2= 'not' | otherlv_3= '!' ) ( (lv_expr_4_0= ruleUnaryExpr ) ) ) ) ;
    public final EObject ruleUnaryExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Atom_0 = null;

        EObject lv_expr_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:395:28: ( (this_Atom_0= ruleAtom | ( () (otherlv_2= 'not' | otherlv_3= '!' ) ( (lv_expr_4_0= ruleUnaryExpr ) ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:396:1: (this_Atom_0= ruleAtom | ( () (otherlv_2= 'not' | otherlv_3= '!' ) ( (lv_expr_4_0= ruleUnaryExpr ) ) ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:396:1: (this_Atom_0= ruleAtom | ( () (otherlv_2= 'not' | otherlv_3= '!' ) ( (lv_expr_4_0= ruleUnaryExpr ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)||LA9_0==17||LA9_0==19||(LA9_0>=21 && LA9_0<=23)) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=15 && LA9_0<=16)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:397:5: this_Atom_0= ruleAtom
                    {
                     
                            newCompositeNode(grammarAccess.getUnaryExprAccess().getAtomParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAtom_in_ruleUnaryExpr840);
                    this_Atom_0=ruleAtom();

                    state._fsp--;

                     
                            current = this_Atom_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:406:6: ( () (otherlv_2= 'not' | otherlv_3= '!' ) ( (lv_expr_4_0= ruleUnaryExpr ) ) )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:406:6: ( () (otherlv_2= 'not' | otherlv_3= '!' ) ( (lv_expr_4_0= ruleUnaryExpr ) ) )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:406:7: () (otherlv_2= 'not' | otherlv_3= '!' ) ( (lv_expr_4_0= ruleUnaryExpr ) )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:406:7: ()
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:407:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUnaryExprAccess().getUnaryExprAction_1_0(),
                                current);
                        

                    }

                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:412:2: (otherlv_2= 'not' | otherlv_3= '!' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==15) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==16) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:412:4: otherlv_2= 'not'
                            {
                            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleUnaryExpr868); 

                                	newLeafNode(otherlv_2, grammarAccess.getUnaryExprAccess().getNotKeyword_1_1_0());
                                

                            }
                            break;
                        case 2 :
                            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:417:7: otherlv_3= '!'
                            {
                            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleUnaryExpr886); 

                                	newLeafNode(otherlv_3, grammarAccess.getUnaryExprAccess().getExclamationMarkKeyword_1_1_1());
                                

                            }
                            break;

                    }

                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:421:2: ( (lv_expr_4_0= ruleUnaryExpr ) )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:422:1: (lv_expr_4_0= ruleUnaryExpr )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:422:1: (lv_expr_4_0= ruleUnaryExpr )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:423:3: lv_expr_4_0= ruleUnaryExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnaryExprAccess().getExprUnaryExprParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUnaryExpr_in_ruleUnaryExpr908);
                    lv_expr_4_0=ruleUnaryExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnaryExprRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_4_0, 
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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:447:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:448:2: (iv_ruleAtom= ruleAtom EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:449:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom945);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom955); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:456:1: ruleAtom returns [EObject current=null] : (this_Value_0= ruleValue | this_Words_1= ruleWords | this_ParenExpr_2= ruleParenExpr ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        EObject this_Value_0 = null;

        EObject this_Words_1 = null;

        EObject this_ParenExpr_2 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:459:28: ( (this_Value_0= ruleValue | this_Words_1= ruleWords | this_ParenExpr_2= ruleParenExpr ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:460:1: (this_Value_0= ruleValue | this_Words_1= ruleWords | this_ParenExpr_2= ruleParenExpr )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:460:1: (this_Value_0= ruleValue | this_Words_1= ruleWords | this_ParenExpr_2= ruleParenExpr )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case 19:
            case 21:
            case 22:
            case 23:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==EOF||(LA10_2>=11 && LA10_2<=14)||LA10_2==18||(LA10_2>=24 && LA10_2<=29)) ) {
                    alt10=1;
                }
                else if ( (LA10_2==RULE_ID) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:461:5: this_Value_0= ruleValue
                    {
                     
                            newCompositeNode(grammarAccess.getAtomAccess().getValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleValue_in_ruleAtom1002);
                    this_Value_0=ruleValue();

                    state._fsp--;

                     
                            current = this_Value_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:471:5: this_Words_1= ruleWords
                    {
                     
                            newCompositeNode(grammarAccess.getAtomAccess().getWordsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWords_in_ruleAtom1029);
                    this_Words_1=ruleWords();

                    state._fsp--;

                     
                            current = this_Words_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:481:5: this_ParenExpr_2= ruleParenExpr
                    {
                     
                            newCompositeNode(grammarAccess.getAtomAccess().getParenExprParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleParenExpr_in_ruleAtom1056);
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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:497:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:498:2: (iv_ruleValue= ruleValue EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:499:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1091);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1101); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:506:1: ruleValue returns [EObject current=null] : (this_ProjectReference_0= ruleProjectReference | this_Word_1= ruleWord | this_Phrase_2= rulePhrase | this_TagReference_3= ruleTagReference | this_TextReference_4= ruleTextReference | this_TaskReference_5= ruleTaskReference ) ;
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
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:509:28: ( (this_ProjectReference_0= ruleProjectReference | this_Word_1= ruleWord | this_Phrase_2= rulePhrase | this_TagReference_3= ruleTagReference | this_TextReference_4= ruleTextReference | this_TaskReference_5= ruleTaskReference ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:510:1: (this_ProjectReference_0= ruleProjectReference | this_Word_1= ruleWord | this_Phrase_2= rulePhrase | this_TagReference_3= ruleTagReference | this_TextReference_4= ruleTextReference | this_TaskReference_5= ruleTaskReference )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:510:1: (this_ProjectReference_0= ruleProjectReference | this_Word_1= ruleWord | this_Phrase_2= rulePhrase | this_TagReference_3= ruleTagReference | this_TextReference_4= ruleTextReference | this_TaskReference_5= ruleTaskReference )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                alt11=2;
                }
                break;
            case RULE_STRING:
                {
                alt11=3;
                }
                break;
            case 23:
                {
                alt11=4;
                }
                break;
            case 22:
                {
                alt11=5;
                }
                break;
            case 21:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:511:5: this_ProjectReference_0= ruleProjectReference
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getProjectReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleProjectReference_in_ruleValue1148);
                    this_ProjectReference_0=ruleProjectReference();

                    state._fsp--;

                     
                            current = this_ProjectReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:521:5: this_Word_1= ruleWord
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getWordParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWord_in_ruleValue1175);
                    this_Word_1=ruleWord();

                    state._fsp--;

                     
                            current = this_Word_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:531:5: this_Phrase_2= rulePhrase
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getPhraseParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePhrase_in_ruleValue1202);
                    this_Phrase_2=rulePhrase();

                    state._fsp--;

                     
                            current = this_Phrase_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:541:5: this_TagReference_3= ruleTagReference
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getTagReferenceParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleTagReference_in_ruleValue1229);
                    this_TagReference_3=ruleTagReference();

                    state._fsp--;

                     
                            current = this_TagReference_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:551:5: this_TextReference_4= ruleTextReference
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getTextReferenceParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleTextReference_in_ruleValue1256);
                    this_TextReference_4=ruleTextReference();

                    state._fsp--;

                     
                            current = this_TextReference_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:561:5: this_TaskReference_5= ruleTaskReference
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getTaskReferenceParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleTaskReference_in_ruleValue1283);
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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:577:1: entryRuleParenExpr returns [EObject current=null] : iv_ruleParenExpr= ruleParenExpr EOF ;
    public final EObject entryRuleParenExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenExpr = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:578:2: (iv_ruleParenExpr= ruleParenExpr EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:579:2: iv_ruleParenExpr= ruleParenExpr EOF
            {
             newCompositeNode(grammarAccess.getParenExprRule()); 
            pushFollow(FOLLOW_ruleParenExpr_in_entryRuleParenExpr1318);
            iv_ruleParenExpr=ruleParenExpr();

            state._fsp--;

             current =iv_ruleParenExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenExpr1328); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:586:1: ruleParenExpr returns [EObject current=null] : (otherlv_0= '(' () ( (lv_expr_2_0= ruleOrExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleParenExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:589:28: ( (otherlv_0= '(' () ( (lv_expr_2_0= ruleOrExpr ) ) otherlv_3= ')' ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:590:1: (otherlv_0= '(' () ( (lv_expr_2_0= ruleOrExpr ) ) otherlv_3= ')' )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:590:1: (otherlv_0= '(' () ( (lv_expr_2_0= ruleOrExpr ) ) otherlv_3= ')' )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:590:3: otherlv_0= '(' () ( (lv_expr_2_0= ruleOrExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleParenExpr1365); 

                	newLeafNode(otherlv_0, grammarAccess.getParenExprAccess().getLeftParenthesisKeyword_0());
                
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:594:1: ()
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:595:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParenExprAccess().getParenExprAction_1(),
                        current);
                

            }

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:600:2: ( (lv_expr_2_0= ruleOrExpr ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:601:1: (lv_expr_2_0= ruleOrExpr )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:601:1: (lv_expr_2_0= ruleOrExpr )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:602:3: lv_expr_2_0= ruleOrExpr
            {
             
            	        newCompositeNode(grammarAccess.getParenExprAccess().getExprOrExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleOrExpr_in_ruleParenExpr1395);
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

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleParenExpr1407); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:630:1: entryRuleProjectReference returns [EObject current=null] : iv_ruleProjectReference= ruleProjectReference EOF ;
    public final EObject entryRuleProjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectReference = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:631:2: (iv_ruleProjectReference= ruleProjectReference EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:632:2: iv_ruleProjectReference= ruleProjectReference EOF
            {
             newCompositeNode(grammarAccess.getProjectReferenceRule()); 
            pushFollow(FOLLOW_ruleProjectReference_in_entryRuleProjectReference1443);
            iv_ruleProjectReference=ruleProjectReference();

            state._fsp--;

             current =iv_ruleProjectReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjectReference1453); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:639:1: ruleProjectReference returns [EObject current=null] : (otherlv_0= 'project' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleProjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:642:28: ( (otherlv_0= 'project' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:643:1: (otherlv_0= 'project' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:643:1: (otherlv_0= 'project' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:643:3: otherlv_0= 'project' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleProjectReference1490); 

                	newLeafNode(otherlv_0, grammarAccess.getProjectReferenceAccess().getProjectKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleProjectReference1502); 

                	newLeafNode(otherlv_1, grammarAccess.getProjectReferenceAccess().getColonKeyword_1());
                
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:651:1: ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_STRING) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:651:2: ( (lv_value_2_0= RULE_ID ) )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:651:2: ( (lv_value_2_0= RULE_ID ) )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:652:1: (lv_value_2_0= RULE_ID )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:652:1: (lv_value_2_0= RULE_ID )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:653:3: lv_value_2_0= RULE_ID
                    {
                    lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProjectReference1520); 

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
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:670:6: ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:670:6: ( (lv_value_3_0= RULE_STRING ) )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:671:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:671:1: (lv_value_3_0= RULE_STRING )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:672:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProjectReference1548); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:696:1: entryRuleTaskReference returns [EObject current=null] : iv_ruleTaskReference= ruleTaskReference EOF ;
    public final EObject entryRuleTaskReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskReference = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:697:2: (iv_ruleTaskReference= ruleTaskReference EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:698:2: iv_ruleTaskReference= ruleTaskReference EOF
            {
             newCompositeNode(grammarAccess.getTaskReferenceRule()); 
            pushFollow(FOLLOW_ruleTaskReference_in_entryRuleTaskReference1590);
            iv_ruleTaskReference=ruleTaskReference();

            state._fsp--;

             current =iv_ruleTaskReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaskReference1600); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:705:1: ruleTaskReference returns [EObject current=null] : (otherlv_0= 'task' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleTaskReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:708:28: ( (otherlv_0= 'task' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:709:1: (otherlv_0= 'task' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:709:1: (otherlv_0= 'task' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:709:3: otherlv_0= 'task' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleTaskReference1637); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskReferenceAccess().getTaskKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleTaskReference1649); 

                	newLeafNode(otherlv_1, grammarAccess.getTaskReferenceAccess().getColonKeyword_1());
                
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:717:1: ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_STRING) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:717:2: ( (lv_value_2_0= RULE_ID ) )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:717:2: ( (lv_value_2_0= RULE_ID ) )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:718:1: (lv_value_2_0= RULE_ID )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:718:1: (lv_value_2_0= RULE_ID )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:719:3: lv_value_2_0= RULE_ID
                    {
                    lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTaskReference1667); 

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
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:736:6: ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:736:6: ( (lv_value_3_0= RULE_STRING ) )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:737:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:737:1: (lv_value_3_0= RULE_STRING )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:738:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTaskReference1695); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:762:1: entryRuleTextReference returns [EObject current=null] : iv_ruleTextReference= ruleTextReference EOF ;
    public final EObject entryRuleTextReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextReference = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:763:2: (iv_ruleTextReference= ruleTextReference EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:764:2: iv_ruleTextReference= ruleTextReference EOF
            {
             newCompositeNode(grammarAccess.getTextReferenceRule()); 
            pushFollow(FOLLOW_ruleTextReference_in_entryRuleTextReference1737);
            iv_ruleTextReference=ruleTextReference();

            state._fsp--;

             current =iv_ruleTextReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextReference1747); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:771:1: ruleTextReference returns [EObject current=null] : (otherlv_0= 'text' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleTextReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:774:28: ( (otherlv_0= 'text' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:775:1: (otherlv_0= 'text' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:775:1: (otherlv_0= 'text' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:775:3: otherlv_0= 'text' otherlv_1= ':' ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleTextReference1784); 

                	newLeafNode(otherlv_0, grammarAccess.getTextReferenceAccess().getTextKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleTextReference1796); 

                	newLeafNode(otherlv_1, grammarAccess.getTextReferenceAccess().getColonKeyword_1());
                
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:783:1: ( ( (lv_value_2_0= RULE_ID ) ) | ( (lv_value_3_0= RULE_STRING ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_STRING) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:783:2: ( (lv_value_2_0= RULE_ID ) )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:783:2: ( (lv_value_2_0= RULE_ID ) )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:784:1: (lv_value_2_0= RULE_ID )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:784:1: (lv_value_2_0= RULE_ID )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:785:3: lv_value_2_0= RULE_ID
                    {
                    lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTextReference1814); 

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
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:802:6: ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:802:6: ( (lv_value_3_0= RULE_STRING ) )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:803:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:803:1: (lv_value_3_0= RULE_STRING )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:804:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextReference1842); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:828:1: entryRuleWords returns [EObject current=null] : iv_ruleWords= ruleWords EOF ;
    public final EObject entryRuleWords() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWords = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:829:2: (iv_ruleWords= ruleWords EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:830:2: iv_ruleWords= ruleWords EOF
            {
             newCompositeNode(grammarAccess.getWordsRule()); 
            pushFollow(FOLLOW_ruleWords_in_entryRuleWords1884);
            iv_ruleWords=ruleWords();

            state._fsp--;

             current =iv_ruleWords; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWords1894); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:837:1: ruleWords returns [EObject current=null] : ( ( (lv_values_0_0= RULE_ID ) ) ( (lv_values_1_0= RULE_ID ) )+ ) ;
    public final EObject ruleWords() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;
        Token lv_values_1_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:840:28: ( ( ( (lv_values_0_0= RULE_ID ) ) ( (lv_values_1_0= RULE_ID ) )+ ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:841:1: ( ( (lv_values_0_0= RULE_ID ) ) ( (lv_values_1_0= RULE_ID ) )+ )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:841:1: ( ( (lv_values_0_0= RULE_ID ) ) ( (lv_values_1_0= RULE_ID ) )+ )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:841:2: ( (lv_values_0_0= RULE_ID ) ) ( (lv_values_1_0= RULE_ID ) )+
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:841:2: ( (lv_values_0_0= RULE_ID ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:842:1: (lv_values_0_0= RULE_ID )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:842:1: (lv_values_0_0= RULE_ID )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:843:3: lv_values_0_0= RULE_ID
            {
            lv_values_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWords1936); 

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

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:859:2: ( (lv_values_1_0= RULE_ID ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:860:1: (lv_values_1_0= RULE_ID )
            	    {
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:860:1: (lv_values_1_0= RULE_ID )
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:861:3: lv_values_1_0= RULE_ID
            	    {
            	    lv_values_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWords1958); 

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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:885:1: entryRuleWord returns [EObject current=null] : iv_ruleWord= ruleWord EOF ;
    public final EObject entryRuleWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWord = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:886:2: (iv_ruleWord= ruleWord EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:887:2: iv_ruleWord= ruleWord EOF
            {
             newCompositeNode(grammarAccess.getWordRule()); 
            pushFollow(FOLLOW_ruleWord_in_entryRuleWord2000);
            iv_ruleWord=ruleWord();

            state._fsp--;

             current =iv_ruleWord; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWord2010); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:894:1: ruleWord returns [EObject current=null] : ( (lv_value_0_0= RULE_ID ) ) ;
    public final EObject ruleWord() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:897:28: ( ( (lv_value_0_0= RULE_ID ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:898:1: ( (lv_value_0_0= RULE_ID ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:898:1: ( (lv_value_0_0= RULE_ID ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:899:1: (lv_value_0_0= RULE_ID )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:899:1: (lv_value_0_0= RULE_ID )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:900:3: lv_value_0_0= RULE_ID
            {
            lv_value_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWord2051); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:924:1: entryRulePhrase returns [EObject current=null] : iv_rulePhrase= rulePhrase EOF ;
    public final EObject entryRulePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhrase = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:925:2: (iv_rulePhrase= rulePhrase EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:926:2: iv_rulePhrase= rulePhrase EOF
            {
             newCompositeNode(grammarAccess.getPhraseRule()); 
            pushFollow(FOLLOW_rulePhrase_in_entryRulePhrase2091);
            iv_rulePhrase=rulePhrase();

            state._fsp--;

             current =iv_rulePhrase; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhrase2101); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:933:1: rulePhrase returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject rulePhrase() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:936:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:937:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:937:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:938:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:938:1: (lv_value_0_0= RULE_STRING )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:939:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePhrase2142); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:963:1: entryRuleTagReference returns [EObject current=null] : iv_ruleTagReference= ruleTagReference EOF ;
    public final EObject entryRuleTagReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagReference = null;


        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:964:2: (iv_ruleTagReference= ruleTagReference EOF )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:965:2: iv_ruleTagReference= ruleTagReference EOF
            {
             newCompositeNode(grammarAccess.getTagReferenceRule()); 
            pushFollow(FOLLOW_ruleTagReference_in_entryRuleTagReference2182);
            iv_ruleTagReference=ruleTagReference();

            state._fsp--;

             current =iv_ruleTagReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagReference2192); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:972:1: ruleTagReference returns [EObject current=null] : (otherlv_0= '@' ( (lv_value_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTagReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:975:28: ( (otherlv_0= '@' ( (lv_value_1_0= RULE_ID ) ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:976:1: (otherlv_0= '@' ( (lv_value_1_0= RULE_ID ) ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:976:1: (otherlv_0= '@' ( (lv_value_1_0= RULE_ID ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:976:3: otherlv_0= '@' ( (lv_value_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleTagReference2229); 

                	newLeafNode(otherlv_0, grammarAccess.getTagReferenceAccess().getCommercialAtKeyword_0());
                
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:980:1: ( (lv_value_1_0= RULE_ID ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:981:1: (lv_value_1_0= RULE_ID )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:981:1: (lv_value_1_0= RULE_ID )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:982:3: lv_value_1_0= RULE_ID
            {
            lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTagReference2246); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1006:1: ruleCompEqOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) ) ;
    public final Enumerator ruleCompEqOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1008:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1009:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1009:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            else if ( (LA16_0==25) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1009:2: (enumLiteral_0= '=' )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1009:2: (enumLiteral_0= '=' )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1009:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_24_in_ruleCompEqOperator2301); 

                            current = grammarAccess.getCompEqOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCompEqOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1015:6: (enumLiteral_1= '!=' )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1015:6: (enumLiteral_1= '!=' )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1015:8: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_25_in_ruleCompEqOperator2318); 

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
    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1025:1: ruleCompOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) ) ;
    public final Enumerator ruleCompOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1027:28: ( ( (enumLiteral_0= '<=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1028:1: ( (enumLiteral_0= '<=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1028:1: ( (enumLiteral_0= '<=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt17=1;
                }
                break;
            case 27:
                {
                alt17=2;
                }
                break;
            case 28:
                {
                alt17=3;
                }
                break;
            case 29:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1028:2: (enumLiteral_0= '<=' )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1028:2: (enumLiteral_0= '<=' )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1028:4: enumLiteral_0= '<='
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_26_in_ruleCompOperator2363); 

                            current = grammarAccess.getCompOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCompOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1034:6: (enumLiteral_1= '<' )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1034:6: (enumLiteral_1= '<' )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1034:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_27_in_ruleCompOperator2380); 

                            current = grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1040:6: (enumLiteral_2= '>=' )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1040:6: (enumLiteral_2= '>=' )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1040:8: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_28_in_ruleCompOperator2397); 

                            current = grammarAccess.getCompOperatorAccess().getGREATER_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCompOperatorAccess().getGREATER_EQUALEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1046:6: (enumLiteral_3= '>' )
                    {
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1046:6: (enumLiteral_3= '>' )
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1046:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,29,FOLLOW_29_in_ruleCompOperator2414); 

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
    public static final BitSet FOLLOW_ruleAndExpr_in_ruleOrExpr234 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_11_in_ruleOrExpr256 = new BitSet(new long[]{0x0000000000EB8030L});
    public static final BitSet FOLLOW_12_in_ruleOrExpr274 = new BitSet(new long[]{0x0000000000EB8030L});
    public static final BitSet FOLLOW_ruleAndExpr_in_ruleOrExpr296 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_ruleAndExpr_in_entryRuleAndExpr334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpr344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompEqExpr_in_ruleAndExpr391 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_13_in_ruleAndExpr413 = new BitSet(new long[]{0x0000000000EB8030L});
    public static final BitSet FOLLOW_14_in_ruleAndExpr431 = new BitSet(new long[]{0x0000000000EB8030L});
    public static final BitSet FOLLOW_ruleCompEqExpr_in_ruleAndExpr453 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_ruleCompEqExpr_in_entryRuleCompEqExpr491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompEqExpr501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompExpr_in_ruleCompEqExpr548 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_ruleCompEqOperator_in_ruleCompEqExpr578 = new BitSet(new long[]{0x0000000000EB8030L});
    public static final BitSet FOLLOW_ruleCompExpr_in_ruleCompEqExpr599 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_ruleCompExpr_in_entryRuleCompExpr637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompExpr647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_ruleCompExpr694 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_ruleCompOperator_in_ruleCompExpr724 = new BitSet(new long[]{0x0000000000EB8030L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_ruleCompExpr745 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpr793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleUnaryExpr840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleUnaryExpr868 = new BitSet(new long[]{0x0000000000EB8030L});
    public static final BitSet FOLLOW_16_in_ruleUnaryExpr886 = new BitSet(new long[]{0x0000000000EB8030L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_ruleUnaryExpr908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAtom1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWords_in_ruleAtom1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenExpr_in_ruleAtom1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectReference_in_ruleValue1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_ruleValue1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhrase_in_ruleValue1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagReference_in_ruleValue1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextReference_in_ruleValue1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskReference_in_ruleValue1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenExpr_in_entryRuleParenExpr1318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenExpr1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleParenExpr1365 = new BitSet(new long[]{0x0000000000EB8030L});
    public static final BitSet FOLLOW_ruleOrExpr_in_ruleParenExpr1395 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleParenExpr1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectReference_in_entryRuleProjectReference1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjectReference1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleProjectReference1490 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleProjectReference1502 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProjectReference1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProjectReference1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskReference_in_entryRuleTaskReference1590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaskReference1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTaskReference1637 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTaskReference1649 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTaskReference1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTaskReference1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextReference_in_entryRuleTextReference1737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextReference1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTextReference1784 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTextReference1796 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTextReference1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextReference1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWords_in_entryRuleWords1884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWords1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWords1936 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWords1958 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleWord_in_entryRuleWord2000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWord2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWord2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhrase_in_entryRulePhrase2091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhrase2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePhrase2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagReference_in_entryRuleTagReference2182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagReference2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleTagReference2229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTagReference2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCompEqOperator2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCompEqOperator2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCompOperator2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCompOperator2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleCompOperator2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCompOperator2414 = new BitSet(new long[]{0x0000000000000002L});

}