package de.sebastianbenz.task.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQueryLexer extends Lexer {
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
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
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

    public InternalQueryLexer() {;} 
    public InternalQueryLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalQueryLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:11:7: ( 'or' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:11:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:12:7: ( '||' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:12:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:13:7: ( 'and' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:13:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:14:7: ( '&&' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:14:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:15:7: ( 'not' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:15:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:16:7: ( '!' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:16:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:17:7: ( '=' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:17:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:18:7: ( '!=' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:18:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:19:7: ( '<=' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:19:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:20:7: ( '<' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:20:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:21:7: ( '>=' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:21:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:22:7: ( '>' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:22:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:23:7: ( '(' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:23:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:24:7: ( ')' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:24:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:25:7: ( 'project' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:25:9: 'project'
            {
            match("project"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:26:7: ( ':' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:26:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:27:7: ( 'task' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:27:9: 'task'
            {
            match("task"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:28:7: ( 'text' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:28:9: 'text'
            {
            match("text"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:29:7: ( '@' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:29:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2478:9: (~ ( ( '@' | '=' | '<' | '>' | '!' | '(' | ')' | ':' | ' ' | '\\t' | '\\r' | '\\n' | '\"' | '\\'' | '&' | '|' ) ) (~ ( ( ' ' | '\\t' | '\\r' | '\\n' | ':' ) ) )* )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2478:11: ~ ( ( '@' | '=' | '<' | '>' | '!' | '(' | ')' | ':' | ' ' | '\\t' | '\\r' | '\\n' | '\"' | '\\'' | '&' | '|' ) ) (~ ( ( ' ' | '\\t' | '\\r' | '\\n' | ':' ) ) )*
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='#' && input.LA(1)<='%')||(input.LA(1)>='*' && input.LA(1)<='9')||input.LA(1)==';'||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='{')||(input.LA(1)>='}' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2478:84: (~ ( ( ' ' | '\\t' | '\\r' | '\\n' | ':' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\b')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\u001F')||(LA1_0>='!' && LA1_0<='9')||(LA1_0>=';' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2478:84: ~ ( ( ' ' | '\\t' | '\\r' | '\\n' | ':' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='9')||(input.LA(1)>=';' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2480:10: ( ( '0' .. '9' )+ )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2480:12: ( '0' .. '9' )+
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2480:12: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2480:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2482:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2482:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2482:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2482:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2482:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2482:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2482:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2482:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2482:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2482:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2482:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2484:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2484:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2484:24: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2484:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2486:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2486:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2486:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2486:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2486:40: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2486:41: ( '\\r' )? '\\n'
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2486:41: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2486:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2488:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2488:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2488:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2490:16: ( . )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:2490:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt11=26;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1:124: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 21 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1:132: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 22 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1:141: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 23 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1:153: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 24 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1:169: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 25 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1:185: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 26 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalQuery.g:1:193: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\27\1\31\1\27\1\31\1\27\1\36\1\uffff\1\41\1\43\2\uffff"+
        "\1\27\1\uffff\1\27\1\uffff\2\27\2\31\2\uffff\1\60\3\uffff\1\27\1"+
        "\uffff\1\27\11\uffff\1\27\1\uffff\2\27\1\uffff\3\27\3\uffff\1\73"+
        "\1\74\5\27\1\uffff\1\27\3\uffff\1\27\1\102\1\103\2\27\2\uffff\1"+
        "\27\1\106\1\uffff";
    static final String DFA11_eofS =
        "\107\uffff";
    static final String DFA11_minS =
        "\1\0\1\162\1\174\1\156\1\46\1\157\1\75\1\uffff\2\75\2\uffff\1\162"+
        "\1\uffff\1\141\1\uffff\1\60\1\52\2\0\2\uffff\1\0\3\uffff\1\144\1"+
        "\uffff\1\164\11\uffff\1\157\1\uffff\1\163\1\170\1\uffff\1\60\2\0"+
        "\3\uffff\2\0\1\152\1\153\1\164\2\0\1\uffff\1\0\3\uffff\1\145\3\0"+
        "\1\143\2\uffff\1\164\1\0\1\uffff";
    static final String DFA11_maxS =
        "\1\uffff\1\162\1\174\1\156\1\46\1\157\1\75\1\uffff\2\75\2\uffff"+
        "\1\162\1\uffff\1\145\1\uffff\1\71\1\57\2\uffff\2\uffff\1\uffff\3"+
        "\uffff\1\144\1\uffff\1\164\11\uffff\1\157\1\uffff\1\163\1\170\1"+
        "\uffff\1\71\2\uffff\3\uffff\2\uffff\1\152\1\153\1\164\2\uffff\1"+
        "\uffff\1\uffff\3\uffff\1\145\3\uffff\1\143\2\uffff\1\164\1\uffff"+
        "\1\uffff";
    static final String DFA11_acceptS =
        "\7\uffff\1\7\2\uffff\1\15\1\16\1\uffff\1\20\1\uffff\1\23\4\uffff"+
        "\1\24\1\31\1\uffff\1\24\1\2\1\32\1\uffff\1\4\1\uffff\1\10\1\6\1"+
        "\7\1\11\1\12\1\13\1\14\1\15\1\16\1\uffff\1\20\2\uffff\1\23\3\uffff"+
        "\1\26\1\31\1\1\7\uffff\1\27\1\uffff\1\30\1\3\1\5\5\uffff\1\21\1"+
        "\22\2\uffff\1\17";
    static final String DFA11_specialS =
        "\1\16\21\uffff\1\4\1\0\2\uffff\1\1\25\uffff\1\12\1\5\3\uffff\1"+
        "\3\1\7\3\uffff\1\6\1\2\1\uffff\1\15\4\uffff\1\14\1\13\1\10\4\uffff"+
        "\1\11\1\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\24\2\25\2\24\1\25\22\24\1\25\1\6\1\22\3\24\1\4\1\23\1\12"+
            "\1\13\5\24\1\21\12\20\1\15\1\24\1\10\1\7\1\11\1\24\1\17\40\24"+
            "\1\3\14\24\1\5\1\1\1\14\3\24\1\16\7\24\1\2\uff83\24",
            "\1\26",
            "\1\30",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "",
            "\1\40",
            "\1\42",
            "",
            "",
            "\1\46",
            "",
            "\1\50\3\uffff\1\51",
            "",
            "\12\53",
            "\1\54\4\uffff\1\55",
            "\0\56",
            "\0\56",
            "",
            "",
            "\11\27\2\uffff\2\27\1\uffff\22\27\1\uffff\31\27\1\uffff\uffc5"+
            "\27",
            "",
            "",
            "",
            "\1\61",
            "",
            "\1\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\63",
            "",
            "\1\64",
            "\1\65",
            "",
            "\12\53",
            "\11\67\2\70\2\67\1\70\22\67\1\70\11\67\1\66\17\67\1\70\uffc5"+
            "\67",
            "\11\71\2\72\2\71\1\72\22\71\1\72\31\71\1\72\uffc5\71",
            "",
            "",
            "",
            "\11\27\2\uffff\2\27\1\uffff\22\27\1\uffff\31\27\1\uffff\uffc5"+
            "\27",
            "\11\27\2\uffff\2\27\1\uffff\22\27\1\uffff\31\27\1\uffff\uffc5"+
            "\27",
            "\1\75",
            "\1\76",
            "\1\77",
            "\11\67\2\70\2\67\1\70\22\67\1\70\11\67\1\66\4\67\1\100\12"+
            "\67\1\70\uffc5\67",
            "\11\67\2\70\2\67\1\70\22\67\1\70\11\67\1\66\17\67\1\70\uffc5"+
            "\67",
            "",
            "\11\71\2\72\2\71\1\72\22\71\1\72\31\71\1\72\uffc5\71",
            "",
            "",
            "",
            "\1\101",
            "\11\27\2\uffff\2\27\1\uffff\22\27\1\uffff\31\27\1\uffff\uffc5"+
            "\27",
            "\11\27\2\uffff\2\27\1\uffff\22\27\1\uffff\31\27\1\uffff\uffc5"+
            "\27",
            "\11\67\2\70\2\67\1\70\22\67\1\70\11\67\1\66\17\67\1\70\uffc5"+
            "\67",
            "\1\104",
            "",
            "",
            "\1\105",
            "\11\27\2\uffff\2\27\1\uffff\22\27\1\uffff\31\27\1\uffff\uffc5"+
            "\27",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_19 = input.LA(1);

                        s = -1;
                        if ( ((LA11_19>='\u0000' && LA11_19<='\uFFFF')) ) {s = 46;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_22 = input.LA(1);

                        s = -1;
                        if ( ((LA11_22>='\u0000' && LA11_22<='\b')||(LA11_22>='\u000B' && LA11_22<='\f')||(LA11_22>='\u000E' && LA11_22<='\u001F')||(LA11_22>='!' && LA11_22<='9')||(LA11_22>=';' && LA11_22<='\uFFFF')) ) {s = 23;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_55 = input.LA(1);

                        s = -1;
                        if ( (LA11_55=='*') ) {s = 54;}

                        else if ( ((LA11_55>='\u0000' && LA11_55<='\b')||(LA11_55>='\u000B' && LA11_55<='\f')||(LA11_55>='\u000E' && LA11_55<='\u001F')||(LA11_55>='!' && LA11_55<=')')||(LA11_55>='+' && LA11_55<='9')||(LA11_55>=';' && LA11_55<='\uFFFF')) ) {s = 55;}

                        else if ( ((LA11_55>='\t' && LA11_55<='\n')||LA11_55=='\r'||LA11_55==' '||LA11_55==':') ) {s = 56;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_49 = input.LA(1);

                        s = -1;
                        if ( ((LA11_49>='\u0000' && LA11_49<='\b')||(LA11_49>='\u000B' && LA11_49<='\f')||(LA11_49>='\u000E' && LA11_49<='\u001F')||(LA11_49>='!' && LA11_49<='9')||(LA11_49>=';' && LA11_49<='\uFFFF')) ) {s = 23;}

                        else s = 59;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_18 = input.LA(1);

                        s = -1;
                        if ( ((LA11_18>='\u0000' && LA11_18<='\uFFFF')) ) {s = 46;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_45 = input.LA(1);

                        s = -1;
                        if ( ((LA11_45>='\u0000' && LA11_45<='\b')||(LA11_45>='\u000B' && LA11_45<='\f')||(LA11_45>='\u000E' && LA11_45<='\u001F')||(LA11_45>='!' && LA11_45<='9')||(LA11_45>=';' && LA11_45<='\uFFFF')) ) {s = 57;}

                        else if ( ((LA11_45>='\t' && LA11_45<='\n')||LA11_45=='\r'||LA11_45==' '||LA11_45==':') ) {s = 58;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_54 = input.LA(1);

                        s = -1;
                        if ( (LA11_54=='/') ) {s = 64;}

                        else if ( (LA11_54=='*') ) {s = 54;}

                        else if ( ((LA11_54>='\u0000' && LA11_54<='\b')||(LA11_54>='\u000B' && LA11_54<='\f')||(LA11_54>='\u000E' && LA11_54<='\u001F')||(LA11_54>='!' && LA11_54<=')')||(LA11_54>='+' && LA11_54<='.')||(LA11_54>='0' && LA11_54<='9')||(LA11_54>=';' && LA11_54<='\uFFFF')) ) {s = 55;}

                        else if ( ((LA11_54>='\t' && LA11_54<='\n')||LA11_54=='\r'||LA11_54==' '||LA11_54==':') ) {s = 56;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_50 = input.LA(1);

                        s = -1;
                        if ( ((LA11_50>='\u0000' && LA11_50<='\b')||(LA11_50>='\u000B' && LA11_50<='\f')||(LA11_50>='\u000E' && LA11_50<='\u001F')||(LA11_50>='!' && LA11_50<='9')||(LA11_50>=';' && LA11_50<='\uFFFF')) ) {s = 23;}

                        else s = 60;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA11_64 = input.LA(1);

                        s = -1;
                        if ( (LA11_64=='*') ) {s = 54;}

                        else if ( ((LA11_64>='\u0000' && LA11_64<='\b')||(LA11_64>='\u000B' && LA11_64<='\f')||(LA11_64>='\u000E' && LA11_64<='\u001F')||(LA11_64>='!' && LA11_64<=')')||(LA11_64>='+' && LA11_64<='9')||(LA11_64>=';' && LA11_64<='\uFFFF')) ) {s = 55;}

                        else if ( ((LA11_64>='\t' && LA11_64<='\n')||LA11_64=='\r'||LA11_64==' '||LA11_64==':') ) {s = 56;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA11_69 = input.LA(1);

                        s = -1;
                        if ( ((LA11_69>='\u0000' && LA11_69<='\b')||(LA11_69>='\u000B' && LA11_69<='\f')||(LA11_69>='\u000E' && LA11_69<='\u001F')||(LA11_69>='!' && LA11_69<='9')||(LA11_69>=';' && LA11_69<='\uFFFF')) ) {s = 23;}

                        else s = 70;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA11_44 = input.LA(1);

                        s = -1;
                        if ( (LA11_44=='*') ) {s = 54;}

                        else if ( ((LA11_44>='\u0000' && LA11_44<='\b')||(LA11_44>='\u000B' && LA11_44<='\f')||(LA11_44>='\u000E' && LA11_44<='\u001F')||(LA11_44>='!' && LA11_44<=')')||(LA11_44>='+' && LA11_44<='9')||(LA11_44>=';' && LA11_44<='\uFFFF')) ) {s = 55;}

                        else if ( ((LA11_44>='\t' && LA11_44<='\n')||LA11_44=='\r'||LA11_44==' '||LA11_44==':') ) {s = 56;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA11_63 = input.LA(1);

                        s = -1;
                        if ( ((LA11_63>='\u0000' && LA11_63<='\b')||(LA11_63>='\u000B' && LA11_63<='\f')||(LA11_63>='\u000E' && LA11_63<='\u001F')||(LA11_63>='!' && LA11_63<='9')||(LA11_63>=';' && LA11_63<='\uFFFF')) ) {s = 23;}

                        else s = 67;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA11_62 = input.LA(1);

                        s = -1;
                        if ( ((LA11_62>='\u0000' && LA11_62<='\b')||(LA11_62>='\u000B' && LA11_62<='\f')||(LA11_62>='\u000E' && LA11_62<='\u001F')||(LA11_62>='!' && LA11_62<='9')||(LA11_62>=';' && LA11_62<='\uFFFF')) ) {s = 23;}

                        else s = 66;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA11_57 = input.LA(1);

                        s = -1;
                        if ( ((LA11_57>='\t' && LA11_57<='\n')||LA11_57=='\r'||LA11_57==' '||LA11_57==':') ) {s = 58;}

                        else if ( ((LA11_57>='\u0000' && LA11_57<='\b')||(LA11_57>='\u000B' && LA11_57<='\f')||(LA11_57>='\u000E' && LA11_57<='\u001F')||(LA11_57>='!' && LA11_57<='9')||(LA11_57>=';' && LA11_57<='\uFFFF')) ) {s = 57;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0=='o') ) {s = 1;}

                        else if ( (LA11_0=='|') ) {s = 2;}

                        else if ( (LA11_0=='a') ) {s = 3;}

                        else if ( (LA11_0=='&') ) {s = 4;}

                        else if ( (LA11_0=='n') ) {s = 5;}

                        else if ( (LA11_0=='!') ) {s = 6;}

                        else if ( (LA11_0=='=') ) {s = 7;}

                        else if ( (LA11_0=='<') ) {s = 8;}

                        else if ( (LA11_0=='>') ) {s = 9;}

                        else if ( (LA11_0=='(') ) {s = 10;}

                        else if ( (LA11_0==')') ) {s = 11;}

                        else if ( (LA11_0=='p') ) {s = 12;}

                        else if ( (LA11_0==':') ) {s = 13;}

                        else if ( (LA11_0=='t') ) {s = 14;}

                        else if ( (LA11_0=='@') ) {s = 15;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 16;}

                        else if ( (LA11_0=='/') ) {s = 17;}

                        else if ( (LA11_0=='\"') ) {s = 18;}

                        else if ( (LA11_0=='\'') ) {s = 19;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||(LA11_0>='#' && LA11_0<='%')||(LA11_0>='*' && LA11_0<='.')||LA11_0==';'||LA11_0=='?'||(LA11_0>='A' && LA11_0<='`')||(LA11_0>='b' && LA11_0<='m')||(LA11_0>='q' && LA11_0<='s')||(LA11_0>='u' && LA11_0<='{')||(LA11_0>='}' && LA11_0<='\uFFFF')) ) {s = 20;}

                        else if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}