package de.sebastianbenz.task.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQueryLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=7;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__8=8;
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
    public static final int T__10=10;
    public static final int RULE_WS=6;

    // delegates
    // delegators

    public InternalQueryLexer() {;} 
    public InternalQueryLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalQueryLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:11:6: ( 'or' )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:11:8: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:12:6: ( '||' )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:12:8: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:13:7: ( 'and' )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:13:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:14:7: ( '&&' )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:14:9: '&&'
            {
            match("&&"); 


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
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:15:7: ( 'not' )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:15:9: 'not'
            {
            match("not"); 


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
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:16:7: ( '!' )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:16:9: '!'
            {
            match('!'); 

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
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:17:7: ( '(' )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:17:9: '('
            {
            match('('); 

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
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:18:7: ( ')' )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:18:9: ')'
            {
            match(')'); 

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
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:19:7: ( 'project' )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:19:9: 'project'
            {
            match("project"); 


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
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:20:7: ( ':' )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:20:9: ':'
            {
            match(':'); 

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
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:21:7: ( 'task' )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:21:9: 'task'
            {
            match("task"); 


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
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:22:7: ( 'text' )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:22:9: 'text'
            {
            match("text"); 


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
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:23:7: ( '@' )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:23:9: '@'
            {
            match('@'); 

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
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:24:7: ( '=' )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:24:9: '='
            {
            match('='); 

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
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:25:7: ( '!=' )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:25:9: '!='
            {
            match("!="); 


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
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:26:7: ( '<=' )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:26:9: '<='
            {
            match("<="); 


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
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:27:7: ( '<' )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:27:9: '<'
            {
            match('<'); 

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
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:28:7: ( '>=' )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:28:9: '>='
            {
            match(">="); 


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
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:29:7: ( '>' )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:29:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1055:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1055:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1055:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\"') ) {
                alt3=1;
            }
            else if ( (LA3_0=='\'') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1055:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1055:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop1:
                    do {
                        int alt1=3;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='\\') ) {
                            alt1=1;
                        }
                        else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                            alt1=2;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1055:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1055:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop1;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1055:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1055:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='\\') ) {
                            alt2=1;
                        }
                        else if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                            alt2=2;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1055:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1055:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop2;
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1057:9: (~ ( ( '@' | '=' | '<' | '>' | '!' | '(' | ')' | ':' | ' ' | '\\t' | '\\r' | '\\n' | '\"' | '\\'' | '&' | '|' ) ) (~ ( ( ' ' | '\\t' | '\\r' | '\\n' | ':' ) ) )* )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1057:11: ~ ( ( '@' | '=' | '<' | '>' | '!' | '(' | ')' | ':' | ' ' | '\\t' | '\\r' | '\\n' | '\"' | '\\'' | '&' | '|' ) ) (~ ( ( ' ' | '\\t' | '\\r' | '\\n' | ':' ) ) )*
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='#' && input.LA(1)<='%')||(input.LA(1)>='*' && input.LA(1)<='9')||input.LA(1)==';'||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='{')||(input.LA(1)>='}' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1057:84: (~ ( ( ' ' | '\\t' | '\\r' | '\\n' | ':' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\b')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\u001F')||(LA4_0>='!' && LA4_0<='9')||(LA4_0>=';' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1057:84: ~ ( ( ' ' | '\\t' | '\\r' | '\\n' | ':' ) )
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
            	    break loop4;
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1059:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1059:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1059:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1061:16: ( . )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1061:18: .
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
        // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_STRING | RULE_ID | RULE_WS | RULE_ANY_OTHER )
        int alt6=23;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1:10: T__8
                {
                mT__8(); 

                }
                break;
            case 2 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1:15: T__9
                {
                mT__9(); 

                }
                break;
            case 3 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1:20: T__10
                {
                mT__10(); 

                }
                break;
            case 4 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1:26: T__11
                {
                mT__11(); 

                }
                break;
            case 5 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1:32: T__12
                {
                mT__12(); 

                }
                break;
            case 6 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1:38: T__13
                {
                mT__13(); 

                }
                break;
            case 7 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1:44: T__14
                {
                mT__14(); 

                }
                break;
            case 8 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1:50: T__15
                {
                mT__15(); 

                }
                break;
            case 9 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1:56: T__16
                {
                mT__16(); 

                }
                break;
            case 10 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1:62: T__17
                {
                mT__17(); 

                }
                break;
            case 11 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1:68: T__18
                {
                mT__18(); 

                }
                break;
            case 12 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1:74: T__19
                {
                mT__19(); 

                }
                break;
            case 13 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1:80: T__20
                {
                mT__20(); 

                }
                break;
            case 14 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1:86: T__21
                {
                mT__21(); 

                }
                break;
            case 15 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1:92: T__22
                {
                mT__22(); 

                }
                break;
            case 16 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1:98: T__23
                {
                mT__23(); 

                }
                break;
            case 17 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1:104: T__24
                {
                mT__24(); 

                }
                break;
            case 18 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1:110: T__25
                {
                mT__25(); 

                }
                break;
            case 19 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1:116: T__26
                {
                mT__26(); 

                }
                break;
            case 20 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1:122: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 21 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1:134: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 22 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1:142: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 23 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalQuery.g:1:150: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\1\25\1\27\1\25\1\27\1\25\1\34\2\uffff\1\25\1\uffff\1\25"+
        "\2\uffff\1\46\1\50\2\27\2\uffff\1\53\3\uffff\1\25\1\uffff\1\25\4"+
        "\uffff\1\25\1\uffff\2\25\11\uffff\1\61\1\62\3\25\2\uffff\1\25\1"+
        "\67\1\70\1\25\2\uffff\1\25\1\73\1\uffff";
    static final String DFA6_eofS =
        "\74\uffff";
    static final String DFA6_minS =
        "\1\0\1\162\1\174\1\156\1\46\1\157\1\75\2\uffff\1\162\1\uffff\1"+
        "\141\2\uffff\2\75\2\0\2\uffff\1\0\3\uffff\1\144\1\uffff\1\164\4"+
        "\uffff\1\157\1\uffff\1\163\1\170\11\uffff\2\0\1\152\1\153\1\164"+
        "\2\uffff\1\145\2\0\1\143\2\uffff\1\164\1\0\1\uffff";
    static final String DFA6_maxS =
        "\1\uffff\1\162\1\174\1\156\1\46\1\157\1\75\2\uffff\1\162\1\uffff"+
        "\1\145\2\uffff\2\75\2\uffff\2\uffff\1\uffff\3\uffff\1\144\1\uffff"+
        "\1\164\4\uffff\1\157\1\uffff\1\163\1\170\11\uffff\2\uffff\1\152"+
        "\1\153\1\164\2\uffff\1\145\2\uffff\1\143\2\uffff\1\164\1\uffff\1"+
        "\uffff";
    static final String DFA6_acceptS =
        "\7\uffff\1\7\1\10\1\uffff\1\12\1\uffff\1\15\1\16\4\uffff\1\25\1"+
        "\26\1\uffff\1\25\1\2\1\27\1\uffff\1\4\1\uffff\1\17\1\6\1\7\1\10"+
        "\1\uffff\1\12\2\uffff\1\15\1\16\1\20\1\21\1\22\1\23\1\24\1\26\1"+
        "\1\5\uffff\1\3\1\5\4\uffff\1\13\1\14\2\uffff\1\11";
    static final String DFA6_specialS =
        "\1\3\17\uffff\1\7\1\1\2\uffff\1\4\27\uffff\1\2\1\0\6\uffff\1\10"+
        "\1\6\4\uffff\1\5\1\uffff}>";
    static final String[] DFA6_transitionS = {
            "\11\22\2\23\2\22\1\23\22\22\1\23\1\6\1\20\3\22\1\4\1\21\1\7"+
            "\1\10\20\22\1\12\1\22\1\16\1\15\1\17\1\22\1\14\40\22\1\3\14"+
            "\22\1\5\1\1\1\11\3\22\1\13\7\22\1\2\uff83\22",
            "\1\24",
            "\1\26",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "",
            "",
            "\1\37",
            "",
            "\1\41\3\uffff\1\42",
            "",
            "",
            "\1\45",
            "\1\47",
            "\0\51",
            "\0\51",
            "",
            "",
            "\11\25\2\uffff\2\25\1\uffff\22\25\1\uffff\31\25\1\uffff\uffc5"+
            "\25",
            "",
            "",
            "",
            "\1\54",
            "",
            "\1\55",
            "",
            "",
            "",
            "",
            "\1\56",
            "",
            "\1\57",
            "\1\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\11\25\2\uffff\2\25\1\uffff\22\25\1\uffff\31\25\1\uffff\uffc5"+
            "\25",
            "\11\25\2\uffff\2\25\1\uffff\22\25\1\uffff\31\25\1\uffff\uffc5"+
            "\25",
            "\1\63",
            "\1\64",
            "\1\65",
            "",
            "",
            "\1\66",
            "\11\25\2\uffff\2\25\1\uffff\22\25\1\uffff\31\25\1\uffff\uffc5"+
            "\25",
            "\11\25\2\uffff\2\25\1\uffff\22\25\1\uffff\31\25\1\uffff\uffc5"+
            "\25",
            "\1\71",
            "",
            "",
            "\1\72",
            "\11\25\2\uffff\2\25\1\uffff\22\25\1\uffff\31\25\1\uffff\uffc5"+
            "\25",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_STRING | RULE_ID | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_45 = input.LA(1);

                        s = -1;
                        if ( ((LA6_45>='\u0000' && LA6_45<='\b')||(LA6_45>='\u000B' && LA6_45<='\f')||(LA6_45>='\u000E' && LA6_45<='\u001F')||(LA6_45>='!' && LA6_45<='9')||(LA6_45>=';' && LA6_45<='\uFFFF')) ) {s = 21;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_17 = input.LA(1);

                        s = -1;
                        if ( ((LA6_17>='\u0000' && LA6_17<='\uFFFF')) ) {s = 41;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA6_44 = input.LA(1);

                        s = -1;
                        if ( ((LA6_44>='\u0000' && LA6_44<='\b')||(LA6_44>='\u000B' && LA6_44<='\f')||(LA6_44>='\u000E' && LA6_44<='\u001F')||(LA6_44>='!' && LA6_44<='9')||(LA6_44>=';' && LA6_44<='\uFFFF')) ) {s = 21;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA6_0 = input.LA(1);

                        s = -1;
                        if ( (LA6_0=='o') ) {s = 1;}

                        else if ( (LA6_0=='|') ) {s = 2;}

                        else if ( (LA6_0=='a') ) {s = 3;}

                        else if ( (LA6_0=='&') ) {s = 4;}

                        else if ( (LA6_0=='n') ) {s = 5;}

                        else if ( (LA6_0=='!') ) {s = 6;}

                        else if ( (LA6_0=='(') ) {s = 7;}

                        else if ( (LA6_0==')') ) {s = 8;}

                        else if ( (LA6_0=='p') ) {s = 9;}

                        else if ( (LA6_0==':') ) {s = 10;}

                        else if ( (LA6_0=='t') ) {s = 11;}

                        else if ( (LA6_0=='@') ) {s = 12;}

                        else if ( (LA6_0=='=') ) {s = 13;}

                        else if ( (LA6_0=='<') ) {s = 14;}

                        else if ( (LA6_0=='>') ) {s = 15;}

                        else if ( (LA6_0=='\"') ) {s = 16;}

                        else if ( (LA6_0=='\'') ) {s = 17;}

                        else if ( ((LA6_0>='\u0000' && LA6_0<='\b')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\u001F')||(LA6_0>='#' && LA6_0<='%')||(LA6_0>='*' && LA6_0<='9')||LA6_0==';'||LA6_0=='?'||(LA6_0>='A' && LA6_0<='`')||(LA6_0>='b' && LA6_0<='m')||(LA6_0>='q' && LA6_0<='s')||(LA6_0>='u' && LA6_0<='{')||(LA6_0>='}' && LA6_0<='\uFFFF')) ) {s = 18;}

                        else if ( ((LA6_0>='\t' && LA6_0<='\n')||LA6_0=='\r'||LA6_0==' ') ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA6_20 = input.LA(1);

                        s = -1;
                        if ( ((LA6_20>='\u0000' && LA6_20<='\b')||(LA6_20>='\u000B' && LA6_20<='\f')||(LA6_20>='\u000E' && LA6_20<='\u001F')||(LA6_20>='!' && LA6_20<='9')||(LA6_20>=';' && LA6_20<='\uFFFF')) ) {s = 21;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA6_58 = input.LA(1);

                        s = -1;
                        if ( ((LA6_58>='\u0000' && LA6_58<='\b')||(LA6_58>='\u000B' && LA6_58<='\f')||(LA6_58>='\u000E' && LA6_58<='\u001F')||(LA6_58>='!' && LA6_58<='9')||(LA6_58>=';' && LA6_58<='\uFFFF')) ) {s = 21;}

                        else s = 59;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA6_53 = input.LA(1);

                        s = -1;
                        if ( ((LA6_53>='\u0000' && LA6_53<='\b')||(LA6_53>='\u000B' && LA6_53<='\f')||(LA6_53>='\u000E' && LA6_53<='\u001F')||(LA6_53>='!' && LA6_53<='9')||(LA6_53>=';' && LA6_53<='\uFFFF')) ) {s = 21;}

                        else s = 56;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA6_16 = input.LA(1);

                        s = -1;
                        if ( ((LA6_16>='\u0000' && LA6_16<='\uFFFF')) ) {s = 41;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA6_52 = input.LA(1);

                        s = -1;
                        if ( ((LA6_52>='\u0000' && LA6_52<='\b')||(LA6_52>='\u000B' && LA6_52<='\f')||(LA6_52>='\u000E' && LA6_52<='\u001F')||(LA6_52>='!' && LA6_52<='9')||(LA6_52>=';' && LA6_52<='\uFFFF')) ) {s = 21;}

                        else s = 55;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}