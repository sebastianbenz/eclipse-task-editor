package de.sebastianbenz.task.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.DFA;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.eclipse.xtext.parser.antlr.Lexer;

@SuppressWarnings("all")
public class InternalTaskLexer extends Lexer {
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

    public InternalTaskLexer() {;} 
    public InternalTaskLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTaskLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g"; }

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:487:9: ( ( ' ' | '\\t' ) )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:487:11: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_NL"
    public final void mRULE_NL() throws RecognitionException {
        try {
            int _type = RULE_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:489:9: ( ( '\\r' )? '\\n' )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:489:11: ( '\\r' )? '\\n'
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:489:11: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:489:11: '\\r'
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
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:491:12: ( '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' ( RULE_NL )? )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:491:14: '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' ( RULE_NL )?
            {
            match("'''"); 

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:491:23: ( options {greedy=false; } : . )*
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
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:491:51: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("'''"); 

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:491:64: ( RULE_NL )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:491:64: RULE_NL
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
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:493:16: ( RULE_HYPHEN (~ ( ( '\\n' | '\\r' ) ) )* ( RULE_NL )? )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:493:18: RULE_HYPHEN (~ ( ( '\\n' | '\\r' ) ) )* ( RULE_NL )?
            {
            mRULE_HYPHEN(); 
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:493:30: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:493:30: ~ ( ( '\\n' | '\\r' ) )
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

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:493:46: ( RULE_NL )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\n'||LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:493:46: RULE_NL
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
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:495:11: ( (~ ( ( RULE_HYPHEN | RULE_COLON | '\\n' | '\\r' | RULE_WS ) ) | ~ ( ( RULE_HYPHEN | '\\n' | '\\r' | RULE_WS ) ) (~ ( ( '\\n' | '\\r' ) ) )* ~ ( ( RULE_COLON | '\\n' | '\\r' ) ) ) ( RULE_NL )? )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:495:13: (~ ( ( RULE_HYPHEN | RULE_COLON | '\\n' | '\\r' | RULE_WS ) ) | ~ ( ( RULE_HYPHEN | '\\n' | '\\r' | RULE_WS ) ) (~ ( ( '\\n' | '\\r' ) ) )* ~ ( ( RULE_COLON | '\\n' | '\\r' ) ) ) ( RULE_NL )?
            {
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:495:13: (~ ( ( RULE_HYPHEN | RULE_COLON | '\\n' | '\\r' | RULE_WS ) ) | ~ ( ( RULE_HYPHEN | '\\n' | '\\r' | RULE_WS ) ) (~ ( ( '\\n' | '\\r' ) ) )* ~ ( ( RULE_COLON | '\\n' | '\\r' ) ) )
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
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:495:14: ~ ( ( RULE_HYPHEN | RULE_COLON | '\\n' | '\\r' | RULE_WS ) )
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
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:495:60: ~ ( ( RULE_HYPHEN | '\\n' | '\\r' | RULE_WS ) ) (~ ( ( '\\n' | '\\r' ) ) )* ~ ( ( RULE_COLON | '\\n' | '\\r' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:495:95: (~ ( ( '\\n' | '\\r' ) ) )*
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
                    	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:495:95: ~ ( ( '\\n' | '\\r' ) )
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

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:495:138: ( RULE_NL )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:495:138: RULE_NL
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
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:497:15: (~ ( ( '\\n' | '\\r' | RULE_HYPHEN | RULE_WS ) ) (~ ( ( '\\n' | '\\r' ) ) )* RULE_COLON ( RULE_NL )? )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:497:17: ~ ( ( '\\n' | '\\r' | RULE_HYPHEN | RULE_WS ) ) (~ ( ( '\\n' | '\\r' ) ) )* RULE_COLON ( RULE_NL )?
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:497:52: (~ ( ( '\\n' | '\\r' ) ) )*
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
            	    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:497:52: ~ ( ( '\\n' | '\\r' ) )
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
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:497:79: ( RULE_NL )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:497:79: RULE_NL
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
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:499:21: ( ':' )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:499:23: ':'
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
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:501:22: ( '-' )
            // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:501:24: '-'
            {
            match('-'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HYPHEN"

    public void mTokens() throws RecognitionException {
        // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:1:8: ( RULE_WS | RULE_NL | RULE_CODE_ | RULE_TASK_TEXT | RULE_TEXT | RULE_PROJECT_ )
        int alt11=6;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:1:10: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 2 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:1:18: RULE_NL
                {
                mRULE_NL(); 

                }
                break;
            case 3 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:1:26: RULE_CODE_
                {
                mRULE_CODE_(); 

                }
                break;
            case 4 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:1:37: RULE_TASK_TEXT
                {
                mRULE_TASK_TEXT(); 

                }
                break;
            case 5 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:1:52: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 6 :
                // ../de.sebastianbenz.task/src-gen/de/sebastianbenz/task/parser/antlr/internal/InternalTask.g:1:62: RULE_PROJECT_
                {
                mRULE_PROJECT_(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\3\uffff\1\12\1\uffff\1\12\1\uffff\2\12\1\14\1\uffff\1\12\2\uffff"+
        "\1\12\1\14\2\12\2\uffff\1\14\1\12\1\22\2\uffff";
    static final String DFA11_eofS =
        "\31\uffff";
    static final String DFA11_minS =
        "\1\0\2\uffff\1\0\1\uffff\5\0\1\uffff\1\0\1\uffff\5\0\1\uffff\5\0"+
        "\1\uffff";
    static final String DFA11_maxS =
        "\1\uffff\2\uffff\1\uffff\1\uffff\5\uffff\1\uffff\1\uffff\1\uffff"+
        "\5\uffff\1\uffff\5\uffff\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\5\uffff\1\5\1\uffff\1\6\5\uffff\1\3"+
        "\5\uffff\1\3";
    static final String DFA11_specialS =
        "\1\17\2\uffff\1\12\1\uffff\1\1\1\13\1\20\1\7\1\11\1\uffff\1\14\1"+
        "\uffff\1\6\1\5\1\15\1\3\1\16\1\uffff\1\10\1\0\1\21\1\2\1\4\1\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\5\1\1\1\2\2\5\1\2\22\5\1\1\6\5\1\3\5\5\1\4\14\5\1\6\uffc5"+
            "\5",
            "",
            "",
            "\12\10\1\uffff\2\10\1\uffff\31\10\1\7\22\10\1\11\uffc5\10",
            "",
            "\12\10\1\uffff\2\10\1\uffff\54\10\1\11\uffc5\10",
            "\12\10\1\uffff\2\10\1\uffff\54\10\1\11\uffc5\10",
            "\12\10\1\uffff\2\10\1\uffff\31\10\1\13\22\10\1\11\uffc5\10",
            "\12\10\1\uffff\2\10\1\uffff\54\10\1\11\uffc5\10",
            "\12\10\1\uffff\2\10\1\uffff\54\10\1\11\uffc5\10",
            "",
            "\12\21\1\16\2\21\1\15\31\21\1\20\22\21\1\17\uffc5\21",
            "",
            "\12\22\1\16\ufff5\22",
            "\0\22",
            "\12\21\1\24\2\21\1\23\31\21\1\20\22\21\1\17\uffc5\21",
            "\12\21\1\16\2\21\1\15\31\21\1\25\22\21\1\17\uffc5\21",
            "\12\21\1\16\2\21\1\15\31\21\1\20\22\21\1\17\uffc5\21",
            "",
            "\12\22\1\24\ufff5\22",
            "\0\22",
            "\12\21\1\16\2\21\1\15\31\21\1\26\22\21\1\17\uffc5\21",
            "\12\21\1\30\2\21\1\27\31\21\1\26\22\21\1\17\uffc5\21",
            "\12\22\1\30\ufff5\22",
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
            return "1:1: Tokens : ( RULE_WS | RULE_NL | RULE_CODE_ | RULE_TASK_TEXT | RULE_TEXT | RULE_PROJECT_ );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_20 = input.LA(1);

                        s = -1;
                        if ( ((LA11_20>='\u0000' && LA11_20<='\uFFFF')) ) {s = 18;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_5 = input.LA(1);

                        s = -1;
                        if ( ((LA11_5>='\u0000' && LA11_5<='\t')||(LA11_5>='\u000B' && LA11_5<='\f')||(LA11_5>='\u000E' && LA11_5<='9')||(LA11_5>=';' && LA11_5<='\uFFFF')) ) {s = 8;}

                        else if ( (LA11_5==':') ) {s = 9;}

                        else s = 10;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_22 = input.LA(1);

                        s = -1;
                        if ( (LA11_22=='\'') ) {s = 22;}

                        else if ( (LA11_22=='\r') ) {s = 23;}

                        else if ( (LA11_22=='\n') ) {s = 24;}

                        else if ( (LA11_22==':') ) {s = 15;}

                        else if ( ((LA11_22>='\u0000' && LA11_22<='\t')||(LA11_22>='\u000B' && LA11_22<='\f')||(LA11_22>='\u000E' && LA11_22<='&')||(LA11_22>='(' && LA11_22<='9')||(LA11_22>=';' && LA11_22<='\uFFFF')) ) {s = 17;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_16 = input.LA(1);

                        s = -1;
                        if ( (LA11_16=='\'') ) {s = 21;}

                        else if ( (LA11_16=='\r') ) {s = 13;}

                        else if ( (LA11_16=='\n') ) {s = 14;}

                        else if ( (LA11_16==':') ) {s = 15;}

                        else if ( ((LA11_16>='\u0000' && LA11_16<='\t')||(LA11_16>='\u000B' && LA11_16<='\f')||(LA11_16>='\u000E' && LA11_16<='&')||(LA11_16>='(' && LA11_16<='9')||(LA11_16>=';' && LA11_16<='\uFFFF')) ) {s = 17;}

                        else s = 10;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_23 = input.LA(1);

                        s = -1;
                        if ( (LA11_23=='\n') ) {s = 24;}

                        else if ( ((LA11_23>='\u0000' && LA11_23<='\t')||(LA11_23>='\u000B' && LA11_23<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_14 = input.LA(1);

                        s = -1;
                        if ( ((LA11_14>='\u0000' && LA11_14<='\uFFFF')) ) {s = 18;}

                        else s = 10;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_13 = input.LA(1);

                        s = -1;
                        if ( (LA11_13=='\n') ) {s = 14;}

                        else if ( ((LA11_13>='\u0000' && LA11_13<='\t')||(LA11_13>='\u000B' && LA11_13<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_8 = input.LA(1);

                        s = -1;
                        if ( (LA11_8==':') ) {s = 9;}

                        else if ( ((LA11_8>='\u0000' && LA11_8<='\t')||(LA11_8>='\u000B' && LA11_8<='\f')||(LA11_8>='\u000E' && LA11_8<='9')||(LA11_8>=';' && LA11_8<='\uFFFF')) ) {s = 8;}

                        else s = 10;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA11_19 = input.LA(1);

                        s = -1;
                        if ( (LA11_19=='\n') ) {s = 20;}

                        else if ( ((LA11_19>='\u0000' && LA11_19<='\t')||(LA11_19>='\u000B' && LA11_19<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA11_9 = input.LA(1);

                        s = -1;
                        if ( (LA11_9==':') ) {s = 9;}

                        else if ( ((LA11_9>='\u0000' && LA11_9<='\t')||(LA11_9>='\u000B' && LA11_9<='\f')||(LA11_9>='\u000E' && LA11_9<='9')||(LA11_9>=';' && LA11_9<='\uFFFF')) ) {s = 8;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA11_3 = input.LA(1);

                        s = -1;
                        if ( (LA11_3=='\'') ) {s = 7;}

                        else if ( ((LA11_3>='\u0000' && LA11_3<='\t')||(LA11_3>='\u000B' && LA11_3<='\f')||(LA11_3>='\u000E' && LA11_3<='&')||(LA11_3>='(' && LA11_3<='9')||(LA11_3>=';' && LA11_3<='\uFFFF')) ) {s = 8;}

                        else if ( (LA11_3==':') ) {s = 9;}

                        else s = 10;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA11_6 = input.LA(1);

                        s = -1;
                        if ( ((LA11_6>='\u0000' && LA11_6<='\t')||(LA11_6>='\u000B' && LA11_6<='\f')||(LA11_6>='\u000E' && LA11_6<='9')||(LA11_6>=';' && LA11_6<='\uFFFF')) ) {s = 8;}

                        else if ( (LA11_6==':') ) {s = 9;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA11_11 = input.LA(1);

                        s = -1;
                        if ( (LA11_11=='\r') ) {s = 13;}

                        else if ( (LA11_11=='\n') ) {s = 14;}

                        else if ( (LA11_11==':') ) {s = 15;}

                        else if ( (LA11_11=='\'') ) {s = 16;}

                        else if ( ((LA11_11>='\u0000' && LA11_11<='\t')||(LA11_11>='\u000B' && LA11_11<='\f')||(LA11_11>='\u000E' && LA11_11<='&')||(LA11_11>='(' && LA11_11<='9')||(LA11_11>=';' && LA11_11<='\uFFFF')) ) {s = 17;}

                        else s = 10;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA11_15 = input.LA(1);

                        s = -1;
                        if ( (LA11_15==':') ) {s = 15;}

                        else if ( (LA11_15=='\'') ) {s = 16;}

                        else if ( (LA11_15=='\r') ) {s = 19;}

                        else if ( (LA11_15=='\n') ) {s = 20;}

                        else if ( ((LA11_15>='\u0000' && LA11_15<='\t')||(LA11_15>='\u000B' && LA11_15<='\f')||(LA11_15>='\u000E' && LA11_15<='&')||(LA11_15>='(' && LA11_15<='9')||(LA11_15>=';' && LA11_15<='\uFFFF')) ) {s = 17;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA11_17 = input.LA(1);

                        s = -1;
                        if ( (LA11_17=='\r') ) {s = 13;}

                        else if ( (LA11_17=='\n') ) {s = 14;}

                        else if ( (LA11_17==':') ) {s = 15;}

                        else if ( (LA11_17=='\'') ) {s = 16;}

                        else if ( ((LA11_17>='\u0000' && LA11_17<='\t')||(LA11_17>='\u000B' && LA11_17<='\f')||(LA11_17>='\u000E' && LA11_17<='&')||(LA11_17>='(' && LA11_17<='9')||(LA11_17>=';' && LA11_17<='\uFFFF')) ) {s = 17;}

                        else s = 10;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0=='\t'||LA11_0==' ') ) {s = 1;}

                        else if ( (LA11_0=='\n'||LA11_0=='\r') ) {s = 2;}

                        else if ( (LA11_0=='\'') ) {s = 3;}

                        else if ( (LA11_0=='-') ) {s = 4;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||(LA11_0>='!' && LA11_0<='&')||(LA11_0>='(' && LA11_0<=',')||(LA11_0>='.' && LA11_0<='9')||(LA11_0>=';' && LA11_0<='\uFFFF')) ) {s = 5;}

                        else if ( (LA11_0==':') ) {s = 6;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA11_7 = input.LA(1);

                        s = -1;
                        if ( (LA11_7=='\'') ) {s = 11;}

                        else if ( (LA11_7==':') ) {s = 9;}

                        else if ( ((LA11_7>='\u0000' && LA11_7<='\t')||(LA11_7>='\u000B' && LA11_7<='\f')||(LA11_7>='\u000E' && LA11_7<='&')||(LA11_7>='(' && LA11_7<='9')||(LA11_7>=';' && LA11_7<='\uFFFF')) ) {s = 8;}

                        else s = 10;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA11_21 = input.LA(1);

                        s = -1;
                        if ( (LA11_21=='\'') ) {s = 22;}

                        else if ( (LA11_21=='\r') ) {s = 13;}

                        else if ( (LA11_21=='\n') ) {s = 14;}

                        else if ( (LA11_21==':') ) {s = 15;}

                        else if ( ((LA11_21>='\u0000' && LA11_21<='\t')||(LA11_21>='\u000B' && LA11_21<='\f')||(LA11_21>='\u000E' && LA11_21<='&')||(LA11_21>='(' && LA11_21<='9')||(LA11_21>=';' && LA11_21<='\uFFFF')) ) {s = 17;}

                        else s = 10;

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