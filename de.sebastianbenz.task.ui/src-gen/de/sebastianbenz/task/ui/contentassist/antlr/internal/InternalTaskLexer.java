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
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:757:16: ( RULE_HYPHEN (~ ( ( '\\n' | '\\r' ) ) )* RULE_NL )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:757:18: RULE_HYPHEN (~ ( ( '\\n' | '\\r' ) ) )* RULE_NL
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

            mRULE_NL(); 

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
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:759:11: ( (~ ( ( RULE_HYPHEN | RULE_COLON | '\\n' | '\\r' | RULE_WS ) ) | ~ ( ( RULE_HYPHEN | '\\n' | '\\r' | RULE_WS ) ) (~ ( ( '\\n' | '\\r' ) ) )* ~ ( ( RULE_COLON | '\\n' | '\\r' ) ) ) RULE_NL )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:759:13: (~ ( ( RULE_HYPHEN | RULE_COLON | '\\n' | '\\r' | RULE_WS ) ) | ~ ( ( RULE_HYPHEN | '\\n' | '\\r' | RULE_WS ) ) (~ ( ( '\\n' | '\\r' ) ) )* ~ ( ( RULE_COLON | '\\n' | '\\r' ) ) ) RULE_NL
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:759:13: (~ ( ( RULE_HYPHEN | RULE_COLON | '\\n' | '\\r' | RULE_WS ) ) | ~ ( ( RULE_HYPHEN | '\\n' | '\\r' | RULE_WS ) ) (~ ( ( '\\n' | '\\r' ) ) )* ~ ( ( RULE_COLON | '\\n' | '\\r' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>='\u0000' && LA4_0<='\b')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\u001F')||(LA4_0>='!' && LA4_0<=',')||(LA4_0>='.' && LA4_0<='9')||(LA4_0>=';' && LA4_0<='\uFFFF')) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='\n'||LA4_1=='\r') ) {
                    alt4=1;
                }
                else if ( ((LA4_1>='\u0000' && LA4_1<='\t')||(LA4_1>='\u000B' && LA4_1<='\f')||(LA4_1>='\u000E' && LA4_1<='\uFFFF')) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==':') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
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
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='9')||(LA3_0>=';' && LA3_0<='\uFFFF')) ) {
                            int LA3_1 = input.LA(2);

                            if ( ((LA3_1>='\u0000' && LA3_1<='\t')||(LA3_1>='\u000B' && LA3_1<='\f')||(LA3_1>='\u000E' && LA3_1<='\uFFFF')) ) {
                                alt3=1;
                            }


                        }
                        else if ( (LA3_0==':') ) {
                            alt3=1;
                        }


                        switch (alt3) {
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
                    	    break loop3;
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

            mRULE_NL(); 

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
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:761:15: (~ ( ( '\\n' | '\\r' | RULE_HYPHEN | RULE_WS ) ) (~ ( ( '\\n' | '\\r' ) ) )* RULE_COLON RULE_NL )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:761:17: ~ ( ( '\\n' | '\\r' | RULE_HYPHEN | RULE_WS ) ) (~ ( ( '\\n' | '\\r' ) ) )* RULE_COLON RULE_NL
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTask.g:761:52: (~ ( ( '\\n' | '\\r' ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==':') ) {
                    int LA5_1 = input.LA(2);

                    if ( ((LA5_1>='\u0000' && LA5_1<='\t')||(LA5_1>='\u000B' && LA5_1<='\f')||(LA5_1>='\u000E' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='9')||(LA5_0>=';' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
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
            	    break loop5;
                }
            } while (true);

            mRULE_COLON(); 
            mRULE_NL(); 

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
        int alt6=5;
        alt6 = dfa6.predict(input);
        switch (alt6) {
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


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\12\uffff";
    static final String DFA6_eofS =
        "\12\uffff";
    static final String DFA6_minS =
        "\1\0\3\uffff\2\0\1\uffff\2\0\1\uffff";
    static final String DFA6_maxS =
        "\1\uffff\3\uffff\2\uffff\1\uffff\2\uffff\1\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\3\2\uffff\1\4\2\uffff\1\5";
    static final String DFA6_specialS =
        "\1\2\3\uffff\1\4\1\0\1\uffff\1\1\1\3\1\uffff}>";
    static final String[] DFA6_transitionS = {
            "\11\4\1\1\1\2\2\4\1\2\22\4\1\1\14\4\1\3\14\4\1\5\uffc5\4",
            "",
            "",
            "",
            "\12\7\1\6\2\7\1\6\54\7\1\10\uffc5\7",
            "\12\7\1\uffff\2\7\1\uffff\54\7\1\10\uffc5\7",
            "",
            "\12\7\1\6\2\7\1\6\54\7\1\10\uffc5\7",
            "\12\7\1\11\2\7\1\11\54\7\1\10\uffc5\7",
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
            return "1:1: Tokens : ( RULE_WS | RULE_NL | RULE_TASK_TEXT | RULE_TEXT | RULE_PROJECT_ );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_5 = input.LA(1);

                        s = -1;
                        if ( ((LA6_5>='\u0000' && LA6_5<='\t')||(LA6_5>='\u000B' && LA6_5<='\f')||(LA6_5>='\u000E' && LA6_5<='9')||(LA6_5>=';' && LA6_5<='\uFFFF')) ) {s = 7;}

                        else if ( (LA6_5==':') ) {s = 8;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_7 = input.LA(1);

                        s = -1;
                        if ( (LA6_7==':') ) {s = 8;}

                        else if ( ((LA6_7>='\u0000' && LA6_7<='\t')||(LA6_7>='\u000B' && LA6_7<='\f')||(LA6_7>='\u000E' && LA6_7<='9')||(LA6_7>=';' && LA6_7<='\uFFFF')) ) {s = 7;}

                        else if ( (LA6_7=='\n'||LA6_7=='\r') ) {s = 6;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA6_0 = input.LA(1);

                        s = -1;
                        if ( (LA6_0=='\t'||LA6_0==' ') ) {s = 1;}

                        else if ( (LA6_0=='\n'||LA6_0=='\r') ) {s = 2;}

                        else if ( (LA6_0=='-') ) {s = 3;}

                        else if ( ((LA6_0>='\u0000' && LA6_0<='\b')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\u001F')||(LA6_0>='!' && LA6_0<=',')||(LA6_0>='.' && LA6_0<='9')||(LA6_0>=';' && LA6_0<='\uFFFF')) ) {s = 4;}

                        else if ( (LA6_0==':') ) {s = 5;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA6_8 = input.LA(1);

                        s = -1;
                        if ( (LA6_8=='\n'||LA6_8=='\r') ) {s = 9;}

                        else if ( (LA6_8==':') ) {s = 8;}

                        else if ( ((LA6_8>='\u0000' && LA6_8<='\t')||(LA6_8>='\u000B' && LA6_8<='\f')||(LA6_8>='\u000E' && LA6_8<='9')||(LA6_8>=';' && LA6_8<='\uFFFF')) ) {s = 7;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA6_4 = input.LA(1);

                        s = -1;
                        if ( (LA6_4=='\n'||LA6_4=='\r') ) {s = 6;}

                        else if ( ((LA6_4>='\u0000' && LA6_4<='\t')||(LA6_4>='\u000B' && LA6_4<='\f')||(LA6_4>='\u000E' && LA6_4<='9')||(LA6_4>=';' && LA6_4<='\uFFFF')) ) {s = 7;}

                        else if ( (LA6_4==':') ) {s = 8;}

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