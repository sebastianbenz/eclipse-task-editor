package de.sebastianbenz.task.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTaskLexer extends Lexer {
    public static final int RULE_COLON=12;
    public static final int RULE_CODE_=10;
    public static final int RULE_HYPHEN=11;
    public static final int RULE_PROJECT_=9;
    public static final int RULE_NL=6;
    public static final int RULE_TASK_TEXT=7;
    public static final int RULE_TAB=4;
    public static final int RULE_TEXT=8;
    public static final int EOF=-1;
    public static final int RULE_SPACE=5;

    // delegates
    // delegators

    public InternalTaskLexer() {;} 
    public InternalTaskLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTaskLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g"; }

    // $ANTLR start "RULE_SPACE"
    public final void mRULE_SPACE() throws RecognitionException {
        try {
            int _type = RULE_SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1100:12: ( ' ' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1100:14: ' '
            {
            match(' '); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPACE"

    // $ANTLR start "RULE_TAB"
    public final void mRULE_TAB() throws RecognitionException {
        try {
            int _type = RULE_TAB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1102:10: ( '\\t' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1102:12: '\\t'
            {
            match('\t'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TAB"

    // $ANTLR start "RULE_NL"
    public final void mRULE_NL() throws RecognitionException {
        try {
            int _type = RULE_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1104:9: ( ( '\\r' )? '\\n' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1104:11: ( '\\r' )? '\\n'
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1104:11: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1104:11: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NL"

    // $ANTLR start "RULE_CODE_"
    public final void mRULE_CODE_() throws RecognitionException {
        try {
            int _type = RULE_CODE_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1106:12: ( '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' ( RULE_NL )? )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1106:14: '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' ( RULE_NL )?
            {
            match("'''"); 

            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1106:23: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\'') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='\'') ) {
                        int LA2_3 = input.LA(3);

                        if ( (LA2_3=='\'') ) {
                            alt2=2;
                        }
                        else if ( ((LA2_3>='\u0000' && LA2_3<='&')||(LA2_3>='(' && LA2_3<='\uFFFF')) ) {
                            alt2=1;
                        }


                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='&')||(LA2_1>='(' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1106:51: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("'''"); 

            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1106:64: ( RULE_NL )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1106:64: RULE_NL
                    {
                    mRULE_NL(); 

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
    // $ANTLR end "RULE_CODE_"

    // $ANTLR start "RULE_TASK_TEXT"
    public final void mRULE_TASK_TEXT() throws RecognitionException {
        try {
            int _type = RULE_TASK_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1108:16: ( RULE_HYPHEN (~ ( ( '\\n' | '\\r' ) ) )* ( RULE_NL )? )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1108:18: RULE_HYPHEN (~ ( ( '\\n' | '\\r' ) ) )* ( RULE_NL )?
            {
            mRULE_HYPHEN(); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1108:30: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1108:30: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop4;
                }
            } while (true);

            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1108:46: ( RULE_NL )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\n'||LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1108:46: RULE_NL
                    {
                    mRULE_NL(); 

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
    // $ANTLR end "RULE_TASK_TEXT"

    // $ANTLR start "RULE_TEXT"
    public final void mRULE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1110:11: ( (~ ( ( RULE_HYPHEN | RULE_COLON | '\\n' | '\\r' | RULE_SPACE | RULE_TAB ) ) | ~ ( ( RULE_HYPHEN | '\\n' | '\\r' | RULE_SPACE | RULE_TAB ) ) (~ ( ( '\\n' | '\\r' ) ) )* ~ ( ( RULE_COLON | '\\n' | '\\r' ) ) ) ( RULE_NL )? )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1110:13: (~ ( ( RULE_HYPHEN | RULE_COLON | '\\n' | '\\r' | RULE_SPACE | RULE_TAB ) ) | ~ ( ( RULE_HYPHEN | '\\n' | '\\r' | RULE_SPACE | RULE_TAB ) ) (~ ( ( '\\n' | '\\r' ) ) )* ~ ( ( RULE_COLON | '\\n' | '\\r' ) ) ) ( RULE_NL )?
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1110:13: (~ ( ( RULE_HYPHEN | RULE_COLON | '\\n' | '\\r' | RULE_SPACE | RULE_TAB ) ) | ~ ( ( RULE_HYPHEN | '\\n' | '\\r' | RULE_SPACE | RULE_TAB ) ) (~ ( ( '\\n' | '\\r' ) ) )* ~ ( ( RULE_COLON | '\\n' | '\\r' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='\u0000' && LA7_0<='\b')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\u001F')||(LA7_0>='!' && LA7_0<=',')||(LA7_0>='.' && LA7_0<='9')||(LA7_0>=';' && LA7_0<='\uFFFF')) ) {
                int LA7_1 = input.LA(2);

                if ( ((LA7_1>='\u0000' && LA7_1<='\t')||(LA7_1>='\u000B' && LA7_1<='\f')||(LA7_1>='\u000E' && LA7_1<='\uFFFF')) ) {
                    alt7=2;
                }
                else {
                    alt7=1;}
            }
            else if ( (LA7_0==':') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1110:14: ~ ( ( RULE_HYPHEN | RULE_COLON | '\\n' | '\\r' | RULE_SPACE | RULE_TAB ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='9')||(input.LA(1)>=';' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1110:72: ~ ( ( RULE_HYPHEN | '\\n' | '\\r' | RULE_SPACE | RULE_TAB ) ) (~ ( ( '\\n' | '\\r' ) ) )* ~ ( ( RULE_COLON | '\\n' | '\\r' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1110:119: (~ ( ( '\\n' | '\\r' ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='9')||(LA6_0>=';' && LA6_0<='\uFFFF')) ) {
                            int LA6_1 = input.LA(2);

                            if ( ((LA6_1>='\u0000' && LA6_1<='\t')||(LA6_1>='\u000B' && LA6_1<='\f')||(LA6_1>='\u000E' && LA6_1<='\uFFFF')) ) {
                                alt6=1;
                            }


                        }
                        else if ( (LA6_0==':') ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1110:119: ~ ( ( '\\n' | '\\r' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='9')||(input.LA(1)>=';' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1110:162: ( RULE_NL )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1110:162: RULE_NL
                    {
                    mRULE_NL(); 

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
    // $ANTLR end "RULE_TEXT"

    // $ANTLR start "RULE_PROJECT_"
    public final void mRULE_PROJECT_() throws RecognitionException {
        try {
            int _type = RULE_PROJECT_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1112:15: (~ ( ( '\\n' | '\\r' | RULE_HYPHEN | RULE_SPACE | RULE_TAB ) ) (~ ( ( '\\n' | '\\r' ) ) )* RULE_COLON ( RULE_NL )? )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1112:17: ~ ( ( '\\n' | '\\r' | RULE_HYPHEN | RULE_SPACE | RULE_TAB ) ) (~ ( ( '\\n' | '\\r' ) ) )* RULE_COLON ( RULE_NL )?
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1112:64: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==':') ) {
                    int LA9_1 = input.LA(2);

                    if ( ((LA9_1>='\u0000' && LA9_1<='\t')||(LA9_1>='\u000B' && LA9_1<='\f')||(LA9_1>='\u000E' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='9')||(LA9_0>=';' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1112:64: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            mRULE_COLON(); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1112:91: ( RULE_NL )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1112:91: RULE_NL
                    {
                    mRULE_NL(); 

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
    // $ANTLR end "RULE_PROJECT_"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1114:21: ( ':' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1114:23: ':'
            {
            match(':'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_HYPHEN"
    public final void mRULE_HYPHEN() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1116:22: ( '-' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1116:24: '-'
            {
            match('-'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HYPHEN"

    public void mTokens() throws RecognitionException {
        // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1:8: ( RULE_SPACE | RULE_TAB | RULE_NL | RULE_CODE_ | RULE_TASK_TEXT | RULE_TEXT | RULE_PROJECT_ )
        int alt11=7;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1:10: RULE_SPACE
                {
                mRULE_SPACE(); 

                }
                break;
            case 2 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1:21: RULE_TAB
                {
                mRULE_TAB(); 

                }
                break;
            case 3 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1:30: RULE_NL
                {
                mRULE_NL(); 

                }
                break;
            case 4 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1:38: RULE_CODE_
                {
                mRULE_CODE_(); 

                }
                break;
            case 5 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1:49: RULE_TASK_TEXT
                {
                mRULE_TASK_TEXT(); 

                }
                break;
            case 6 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1:64: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 7 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1:74: RULE_PROJECT_
                {
                mRULE_PROJECT_(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\4\uffff\1\13\1\uffff\1\13\1\uffff\2\13\1\15\1\uffff\1\13\2\uffff"+
        "\2\13\1\15\1\13\1\uffff\1\13\1\uffff\1\15\1\23\2\uffff";
    static final String DFA11_eofS =
        "\32\uffff";
    static final String DFA11_minS =
        "\1\0\3\uffff\1\0\1\uffff\5\0\1\uffff\1\0\1\uffff\5\0\1\uffff\5\0"+
        "\1\uffff";
    static final String DFA11_maxS =
        "\1\uffff\3\uffff\1\uffff\1\uffff\5\uffff\1\uffff\1\uffff\1\uffff"+
        "\5\uffff\1\uffff\5\uffff\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\5\uffff\1\6\1\uffff\1\7\5\uffff"+
        "\1\4\5\uffff\1\4";
    static final String DFA11_specialS =
        "\1\11\3\uffff\1\5\1\uffff\1\14\1\1\1\4\1\13\1\10\1\uffff\1\12\1"+
        "\uffff\1\21\1\6\1\3\1\16\1\20\1\uffff\1\0\1\17\1\7\1\2\1\15\1\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\6\1\2\1\3\2\6\1\3\22\6\1\1\6\6\1\4\5\6\1\5\14\6\1\7\uffc5"+
            "\6",
            "",
            "",
            "",
            "\12\11\1\uffff\2\11\1\uffff\31\11\1\10\22\11\1\12\uffc5\11",
            "",
            "\12\11\1\uffff\2\11\1\uffff\54\11\1\12\uffc5\11",
            "\12\11\1\uffff\2\11\1\uffff\54\11\1\12\uffc5\11",
            "\12\11\1\uffff\2\11\1\uffff\31\11\1\14\22\11\1\12\uffc5\11",
            "\12\11\1\uffff\2\11\1\uffff\54\11\1\12\uffc5\11",
            "\12\11\1\uffff\2\11\1\uffff\54\11\1\12\uffc5\11",
            "",
            "\12\22\1\17\2\22\1\16\31\22\1\20\22\22\1\21\uffc5\22",
            "",
            "\12\23\1\17\ufff5\23",
            "\0\23",
            "\12\22\1\17\2\22\1\16\31\22\1\24\22\22\1\21\uffc5\22",
            "\12\22\1\26\2\22\1\25\31\22\1\20\22\22\1\21\uffc5\22",
            "\12\22\1\17\2\22\1\16\31\22\1\20\22\22\1\21\uffc5\22",
            "",
            "\12\22\1\17\2\22\1\16\31\22\1\27\22\22\1\21\uffc5\22",
            "\12\23\1\26\ufff5\23",
            "\0\23",
            "\12\22\1\31\2\22\1\30\31\22\1\27\22\22\1\21\uffc5\22",
            "\12\23\1\31\ufff5\23",
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
            return "1:1: Tokens : ( RULE_SPACE | RULE_TAB | RULE_NL | RULE_CODE_ | RULE_TASK_TEXT | RULE_TEXT | RULE_PROJECT_ );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_20 = input.LA(1);

                        s = -1;
                        if ( (LA11_20=='\'') ) {s = 23;}

                        else if ( (LA11_20=='\r') ) {s = 14;}

                        else if ( (LA11_20=='\n') ) {s = 15;}

                        else if ( (LA11_20==':') ) {s = 17;}

                        else if ( ((LA11_20>='\u0000' && LA11_20<='\t')||(LA11_20>='\u000B' && LA11_20<='\f')||(LA11_20>='\u000E' && LA11_20<='&')||(LA11_20>='(' && LA11_20<='9')||(LA11_20>=';' && LA11_20<='\uFFFF')) ) {s = 18;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_7 = input.LA(1);

                        s = -1;
                        if ( ((LA11_7>='\u0000' && LA11_7<='\t')||(LA11_7>='\u000B' && LA11_7<='\f')||(LA11_7>='\u000E' && LA11_7<='9')||(LA11_7>=';' && LA11_7<='\uFFFF')) ) {s = 9;}

                        else if ( (LA11_7==':') ) {s = 10;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_23 = input.LA(1);

                        s = -1;
                        if ( (LA11_23=='\'') ) {s = 23;}

                        else if ( (LA11_23=='\r') ) {s = 24;}

                        else if ( (LA11_23=='\n') ) {s = 25;}

                        else if ( (LA11_23==':') ) {s = 17;}

                        else if ( ((LA11_23>='\u0000' && LA11_23<='\t')||(LA11_23>='\u000B' && LA11_23<='\f')||(LA11_23>='\u000E' && LA11_23<='&')||(LA11_23>='(' && LA11_23<='9')||(LA11_23>=';' && LA11_23<='\uFFFF')) ) {s = 18;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_16 = input.LA(1);

                        s = -1;
                        if ( (LA11_16=='\'') ) {s = 20;}

                        else if ( (LA11_16=='\r') ) {s = 14;}

                        else if ( (LA11_16=='\n') ) {s = 15;}

                        else if ( (LA11_16==':') ) {s = 17;}

                        else if ( ((LA11_16>='\u0000' && LA11_16<='\t')||(LA11_16>='\u000B' && LA11_16<='\f')||(LA11_16>='\u000E' && LA11_16<='&')||(LA11_16>='(' && LA11_16<='9')||(LA11_16>=';' && LA11_16<='\uFFFF')) ) {s = 18;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_8 = input.LA(1);

                        s = -1;
                        if ( (LA11_8=='\'') ) {s = 12;}

                        else if ( (LA11_8==':') ) {s = 10;}

                        else if ( ((LA11_8>='\u0000' && LA11_8<='\t')||(LA11_8>='\u000B' && LA11_8<='\f')||(LA11_8>='\u000E' && LA11_8<='&')||(LA11_8>='(' && LA11_8<='9')||(LA11_8>=';' && LA11_8<='\uFFFF')) ) {s = 9;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_4 = input.LA(1);

                        s = -1;
                        if ( (LA11_4=='\'') ) {s = 8;}

                        else if ( ((LA11_4>='\u0000' && LA11_4<='\t')||(LA11_4>='\u000B' && LA11_4<='\f')||(LA11_4>='\u000E' && LA11_4<='&')||(LA11_4>='(' && LA11_4<='9')||(LA11_4>=';' && LA11_4<='\uFFFF')) ) {s = 9;}

                        else if ( (LA11_4==':') ) {s = 10;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_15 = input.LA(1);

                        s = -1;
                        if ( ((LA11_15>='\u0000' && LA11_15<='\uFFFF')) ) {s = 19;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_22 = input.LA(1);

                        s = -1;
                        if ( ((LA11_22>='\u0000' && LA11_22<='\uFFFF')) ) {s = 19;}

                        else s = 13;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA11_10 = input.LA(1);

                        s = -1;
                        if ( (LA11_10==':') ) {s = 10;}

                        else if ( ((LA11_10>='\u0000' && LA11_10<='\t')||(LA11_10>='\u000B' && LA11_10<='\f')||(LA11_10>='\u000E' && LA11_10<='9')||(LA11_10>=';' && LA11_10<='\uFFFF')) ) {s = 9;}

                        else s = 13;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0==' ') ) {s = 1;}

                        else if ( (LA11_0=='\t') ) {s = 2;}

                        else if ( (LA11_0=='\n'||LA11_0=='\r') ) {s = 3;}

                        else if ( (LA11_0=='\'') ) {s = 4;}

                        else if ( (LA11_0=='-') ) {s = 5;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||(LA11_0>='!' && LA11_0<='&')||(LA11_0>='(' && LA11_0<=',')||(LA11_0>='.' && LA11_0<='9')||(LA11_0>=';' && LA11_0<='\uFFFF')) ) {s = 6;}

                        else if ( (LA11_0==':') ) {s = 7;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA11_12 = input.LA(1);

                        s = -1;
                        if ( (LA11_12=='\r') ) {s = 14;}

                        else if ( (LA11_12=='\n') ) {s = 15;}

                        else if ( (LA11_12=='\'') ) {s = 16;}

                        else if ( (LA11_12==':') ) {s = 17;}

                        else if ( ((LA11_12>='\u0000' && LA11_12<='\t')||(LA11_12>='\u000B' && LA11_12<='\f')||(LA11_12>='\u000E' && LA11_12<='&')||(LA11_12>='(' && LA11_12<='9')||(LA11_12>=';' && LA11_12<='\uFFFF')) ) {s = 18;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA11_9 = input.LA(1);

                        s = -1;
                        if ( (LA11_9==':') ) {s = 10;}

                        else if ( ((LA11_9>='\u0000' && LA11_9<='\t')||(LA11_9>='\u000B' && LA11_9<='\f')||(LA11_9>='\u000E' && LA11_9<='9')||(LA11_9>=';' && LA11_9<='\uFFFF')) ) {s = 9;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA11_6 = input.LA(1);

                        s = -1;
                        if ( ((LA11_6>='\u0000' && LA11_6<='\t')||(LA11_6>='\u000B' && LA11_6<='\f')||(LA11_6>='\u000E' && LA11_6<='9')||(LA11_6>=';' && LA11_6<='\uFFFF')) ) {s = 9;}

                        else if ( (LA11_6==':') ) {s = 10;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA11_24 = input.LA(1);

                        s = -1;
                        if ( ((LA11_24>='\u0000' && LA11_24<='\t')||(LA11_24>='\u000B' && LA11_24<='\uFFFF')) ) {s = 19;}

                        else if ( (LA11_24=='\n') ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA11_17 = input.LA(1);

                        s = -1;
                        if ( (LA11_17==':') ) {s = 17;}

                        else if ( (LA11_17=='\'') ) {s = 16;}

                        else if ( ((LA11_17>='\u0000' && LA11_17<='\t')||(LA11_17>='\u000B' && LA11_17<='\f')||(LA11_17>='\u000E' && LA11_17<='&')||(LA11_17>='(' && LA11_17<='9')||(LA11_17>=';' && LA11_17<='\uFFFF')) ) {s = 18;}

                        else if ( (LA11_17=='\r') ) {s = 21;}

                        else if ( (LA11_17=='\n') ) {s = 22;}

                        else s = 13;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA11_21 = input.LA(1);

                        s = -1;
                        if ( ((LA11_21>='\u0000' && LA11_21<='\t')||(LA11_21>='\u000B' && LA11_21<='\uFFFF')) ) {s = 19;}

                        else if ( (LA11_21=='\n') ) {s = 22;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA11_18 = input.LA(1);

                        s = -1;
                        if ( (LA11_18=='\r') ) {s = 14;}

                        else if ( (LA11_18=='\n') ) {s = 15;}

                        else if ( (LA11_18==':') ) {s = 17;}

                        else if ( (LA11_18=='\'') ) {s = 16;}

                        else if ( ((LA11_18>='\u0000' && LA11_18<='\t')||(LA11_18>='\u000B' && LA11_18<='\f')||(LA11_18>='\u000E' && LA11_18<='&')||(LA11_18>='(' && LA11_18<='9')||(LA11_18>=';' && LA11_18<='\uFFFF')) ) {s = 18;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA11_14 = input.LA(1);

                        s = -1;
                        if ( ((LA11_14>='\u0000' && LA11_14<='\t')||(LA11_14>='\u000B' && LA11_14<='\uFFFF')) ) {s = 19;}

                        else if ( (LA11_14=='\n') ) {s = 15;}

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