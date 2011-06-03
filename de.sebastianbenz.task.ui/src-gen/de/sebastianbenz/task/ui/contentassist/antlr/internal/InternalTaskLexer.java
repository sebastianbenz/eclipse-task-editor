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
    public static final int RULE_COLON=10;
    public static final int RULE_HYPHEN=9;
    public static final int RULE_PROJECT_=8;
    public static final int RULE_NL=5;
    public static final int RULE_TASK_TEXT=6;
    public static final int RULE_TEXT=7;
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
    public String getGrammarFileName() { return "../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g"; }

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:753:9: ( ( ' ' | '\\t' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:753:11: ( ' ' | '\\t' )
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
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:755:9: ( ( '\\r' )? '\\n' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:755:11: ( '\\r' )? '\\n'
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:755:11: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:755:11: '\\r'
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

    // $ANTLR start "RULE_TASK_TEXT"
    public final void mRULE_TASK_TEXT() throws RecognitionException {
        try {
            int _type = RULE_TASK_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:757:16: ( RULE_HYPHEN (~ ( ( '\\n' | '\\r' ) ) )* ( RULE_NL )? )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:757:18: RULE_HYPHEN (~ ( ( '\\n' | '\\r' ) ) )* ( RULE_NL )?
            {
            mRULE_HYPHEN(); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:757:30: (~ ( ( '\\n' | '\\r' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:757:30: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop2;
                }
            } while (true);

            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:757:46: ( RULE_NL )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:757:46: RULE_NL
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
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:759:11: ( (~ ( ( RULE_HYPHEN | RULE_COLON | '\\n' | '\\r' | RULE_WS ) ) | ~ ( ( RULE_HYPHEN | '\\n' | '\\r' | RULE_WS ) ) (~ ( ( '\\n' | '\\r' ) ) )* ~ ( ( RULE_COLON | '\\n' | '\\r' ) ) ) ( RULE_NL )? )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:759:13: (~ ( ( RULE_HYPHEN | RULE_COLON | '\\n' | '\\r' | RULE_WS ) ) | ~ ( ( RULE_HYPHEN | '\\n' | '\\r' | RULE_WS ) ) (~ ( ( '\\n' | '\\r' ) ) )* ~ ( ( RULE_COLON | '\\n' | '\\r' ) ) ) ( RULE_NL )?
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:759:13: (~ ( ( RULE_HYPHEN | RULE_COLON | '\\n' | '\\r' | RULE_WS ) ) | ~ ( ( RULE_HYPHEN | '\\n' | '\\r' | RULE_WS ) ) (~ ( ( '\\n' | '\\r' ) ) )* ~ ( ( RULE_COLON | '\\n' | '\\r' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='\u0000' && LA5_0<='\b')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\u001F')||(LA5_0>='!' && LA5_0<=',')||(LA5_0>='.' && LA5_0<='9')||(LA5_0>=';' && LA5_0<='\uFFFF')) ) {
                int LA5_1 = input.LA(2);

                if ( ((LA5_1>='\u0000' && LA5_1<='\t')||(LA5_1>='\u000B' && LA5_1<='\f')||(LA5_1>='\u000E' && LA5_1<='\uFFFF')) ) {
                    alt5=2;
                }
                else {
                    alt5=1;}
            }
            else if ( (LA5_0==':') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:759:14: ~ ( ( RULE_HYPHEN | RULE_COLON | '\\n' | '\\r' | RULE_WS ) )
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
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:759:60: ~ ( ( RULE_HYPHEN | '\\n' | '\\r' | RULE_WS ) ) (~ ( ( '\\n' | '\\r' ) ) )* ~ ( ( RULE_COLON | '\\n' | '\\r' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:759:95: (~ ( ( '\\n' | '\\r' ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='9')||(LA4_0>=';' && LA4_0<='\uFFFF')) ) {
                            int LA4_1 = input.LA(2);

                            if ( ((LA4_1>='\u0000' && LA4_1<='\t')||(LA4_1>='\u000B' && LA4_1<='\f')||(LA4_1>='\u000E' && LA4_1<='\uFFFF')) ) {
                                alt4=1;
                            }


                        }
                        else if ( (LA4_0==':') ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:759:95: ~ ( ( '\\n' | '\\r' ) )
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

            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:759:138: ( RULE_NL )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:759:138: RULE_NL
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
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:761:15: (~ ( ( '\\n' | '\\r' | RULE_HYPHEN | RULE_WS ) ) (~ ( ( '\\n' | '\\r' ) ) )* RULE_COLON ( RULE_NL )? )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:761:17: ~ ( ( '\\n' | '\\r' | RULE_HYPHEN | RULE_WS ) ) (~ ( ( '\\n' | '\\r' ) ) )* RULE_COLON ( RULE_NL )?
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:761:52: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==':') ) {
                    int LA7_1 = input.LA(2);

                    if ( ((LA7_1>='\u0000' && LA7_1<='\t')||(LA7_1>='\u000B' && LA7_1<='\f')||(LA7_1>='\u000E' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='9')||(LA7_0>=';' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:761:52: ~ ( ( '\\n' | '\\r' ) )
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

            mRULE_COLON(); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:761:79: ( RULE_NL )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:761:79: RULE_NL
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
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:763:21: ( ':' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:763:23: ':'
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
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:765:22: ( '-' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:765:24: '-'
            {
            match('-'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HYPHEN"

    public void mTokens() throws RecognitionException {
        // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1:8: ( RULE_WS | RULE_NL | RULE_TASK_TEXT | RULE_TEXT | RULE_PROJECT_ )
        int alt9=5;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1:10: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 2 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1:18: RULE_NL
                {
                mRULE_NL(); 

                }
                break;
            case 3 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1:26: RULE_TASK_TEXT
                {
                mRULE_TASK_TEXT(); 

                }
                break;
            case 4 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1:41: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 5 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:1:51: RULE_PROJECT_
                {
                mRULE_PROJECT_(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\4\uffff\1\10\1\uffff\1\10\1\11\2\uffff";
    static final String DFA9_eofS =
        "\12\uffff";
    static final String DFA9_minS =
        "\1\0\3\uffff\4\0\2\uffff";
    static final String DFA9_maxS =
        "\1\uffff\3\uffff\4\uffff\2\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\4\uffff\1\4\1\5";
    static final String DFA9_specialS =
        "\1\0\3\uffff\1\1\1\4\1\2\1\3\2\uffff}>";
    static final String[] DFA9_transitionS = {
            "\11\4\1\1\1\2\2\4\1\2\22\4\1\1\14\4\1\3\14\4\1\5\uffc5\4",
            "",
            "",
            "",
            "\12\6\1\uffff\2\6\1\uffff\54\6\1\7\uffc5\6",
            "\12\6\1\uffff\2\6\1\uffff\54\6\1\7\uffc5\6",
            "\12\6\1\uffff\2\6\1\uffff\54\6\1\7\uffc5\6",
            "\12\6\1\uffff\2\6\1\uffff\54\6\1\7\uffc5\6",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_WS | RULE_NL | RULE_TASK_TEXT | RULE_TEXT | RULE_PROJECT_ );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_0 = input.LA(1);

                        s = -1;
                        if ( (LA9_0=='\t'||LA9_0==' ') ) {s = 1;}

                        else if ( (LA9_0=='\n'||LA9_0=='\r') ) {s = 2;}

                        else if ( (LA9_0=='-') ) {s = 3;}

                        else if ( ((LA9_0>='\u0000' && LA9_0<='\b')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\u001F')||(LA9_0>='!' && LA9_0<=',')||(LA9_0>='.' && LA9_0<='9')||(LA9_0>=';' && LA9_0<='\uFFFF')) ) {s = 4;}

                        else if ( (LA9_0==':') ) {s = 5;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_4 = input.LA(1);

                        s = -1;
                        if ( ((LA9_4>='\u0000' && LA9_4<='\t')||(LA9_4>='\u000B' && LA9_4<='\f')||(LA9_4>='\u000E' && LA9_4<='9')||(LA9_4>=';' && LA9_4<='\uFFFF')) ) {s = 6;}

                        else if ( (LA9_4==':') ) {s = 7;}

                        else s = 8;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_6 = input.LA(1);

                        s = -1;
                        if ( (LA9_6==':') ) {s = 7;}

                        else if ( ((LA9_6>='\u0000' && LA9_6<='\t')||(LA9_6>='\u000B' && LA9_6<='\f')||(LA9_6>='\u000E' && LA9_6<='9')||(LA9_6>=';' && LA9_6<='\uFFFF')) ) {s = 6;}

                        else s = 8;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_7 = input.LA(1);

                        s = -1;
                        if ( (LA9_7==':') ) {s = 7;}

                        else if ( ((LA9_7>='\u0000' && LA9_7<='\t')||(LA9_7>='\u000B' && LA9_7<='\f')||(LA9_7>='\u000E' && LA9_7<='9')||(LA9_7>=';' && LA9_7<='\uFFFF')) ) {s = 6;}

                        else s = 9;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_5 = input.LA(1);

                        s = -1;
                        if ( ((LA9_5>='\u0000' && LA9_5<='\t')||(LA9_5>='\u000B' && LA9_5<='\f')||(LA9_5>='\u000E' && LA9_5<='9')||(LA9_5>=';' && LA9_5<='\uFFFF')) ) {s = 6;}

                        else if ( (LA9_5==':') ) {s = 7;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}