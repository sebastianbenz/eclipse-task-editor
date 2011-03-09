package de.sebastianbenz.task.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTaskPaperLexer extends Lexer {
    public static final int RULE_PROJECT_3=6;
    public static final int RULE_TASK_START=13;
    public static final int RULE_PROJECT_2=5;
    public static final int RULE_PROJECT_1=4;
    public static final int RULE_TASK_CLOSED=9;
    public static final int RULE_NL=12;
    public static final int RULE_NOTE_CONTENT=10;
    public static final int RULE_PROJECT_DELIMITER=14;
    public static final int RULE_WS=7;
    public static final int EOF=-1;
    public static final int RULE_SPACE=11;
    public static final int RULE_TASK_OPEN=8;

    // delegates
    // delegators

    public InternalTaskPaperLexer() {;} 
    public InternalTaskPaperLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTaskPaperLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g"; }

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:831:9: ( ( ' ' | '\\t' ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:831:11: ( ' ' | '\\t' )
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

    // $ANTLR start "RULE_SPACE"
    public final void mRULE_SPACE() throws RecognitionException {
        try {
            int _type = RULE_SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:833:12: ( ( RULE_WS )* RULE_NL )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:833:14: ( RULE_WS )* RULE_NL
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:833:14: ( RULE_WS )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\t'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:833:14: RULE_WS
            	    {
            	    mRULE_WS(); 

            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "RULE_SPACE"

    // $ANTLR start "RULE_NOTE_CONTENT"
    public final void mRULE_NOTE_CONTENT() throws RecognitionException {
        try {
            int _type = RULE_NOTE_CONTENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:835:19: ( ( RULE_WS )* ~ ( ( RULE_TASK_START | '\\n' | '\\r' | RULE_WS ) ) (~ ( ( '\\n' | '\\r' ) ) )* ~ ( ( RULE_PROJECT_DELIMITER | '\\n' | '\\r' ) ) RULE_NL )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:835:21: ( RULE_WS )* ~ ( ( RULE_TASK_START | '\\n' | '\\r' | RULE_WS ) ) (~ ( ( '\\n' | '\\r' ) ) )* ~ ( ( RULE_PROJECT_DELIMITER | '\\n' | '\\r' ) ) RULE_NL
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:835:21: ( RULE_WS )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\t'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:835:21: RULE_WS
            	    {
            	    mRULE_WS(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:835:69: (~ ( ( '\\n' | '\\r' ) ) )*
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
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:835:69: ~ ( ( '\\n' | '\\r' ) )
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

            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOTE_CONTENT"

    // $ANTLR start "RULE_TASK_OPEN"
    public final void mRULE_TASK_OPEN() throws RecognitionException {
        try {
            int _type = RULE_TASK_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:837:16: ( ( RULE_WS )* RULE_TASK_START (~ ( ( '@' | '\\n' | '\\r' ) ) )* RULE_NL )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:837:18: ( RULE_WS )* RULE_TASK_START (~ ( ( '@' | '\\n' | '\\r' ) ) )* RULE_NL
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:837:18: ( RULE_WS )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\t'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:837:18: RULE_WS
            	    {
            	    mRULE_WS(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            mRULE_TASK_START(); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:837:43: (~ ( ( '@' | '\\n' | '\\r' ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='?')||(LA5_0>='A' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:837:43: ~ ( ( '@' | '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='\uFFFF') ) {
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

            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TASK_OPEN"

    // $ANTLR start "RULE_TASK_CLOSED"
    public final void mRULE_TASK_CLOSED() throws RecognitionException {
        try {
            int _type = RULE_TASK_CLOSED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:839:18: ( ( ( RULE_WS )* RULE_TASK_START (~ ( ( '\\n' | '\\r' | '@' ) ) )+ '@done' (~ ( ( '\\n' | '\\r' | '@' ) ) )+ RULE_NL | ( RULE_WS )* RULE_TASK_START (~ ( ( '\\n' | '\\r' | '@' ) ) )+ '@done' RULE_NL | ( RULE_WS )* RULE_TASK_START '@done' (~ ( ( '\\n' | '\\r' | '@' ) ) )+ RULE_NL ) )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:839:20: ( ( RULE_WS )* RULE_TASK_START (~ ( ( '\\n' | '\\r' | '@' ) ) )+ '@done' (~ ( ( '\\n' | '\\r' | '@' ) ) )+ RULE_NL | ( RULE_WS )* RULE_TASK_START (~ ( ( '\\n' | '\\r' | '@' ) ) )+ '@done' RULE_NL | ( RULE_WS )* RULE_TASK_START '@done' (~ ( ( '\\n' | '\\r' | '@' ) ) )+ RULE_NL )
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:839:20: ( ( RULE_WS )* RULE_TASK_START (~ ( ( '\\n' | '\\r' | '@' ) ) )+ '@done' (~ ( ( '\\n' | '\\r' | '@' ) ) )+ RULE_NL | ( RULE_WS )* RULE_TASK_START (~ ( ( '\\n' | '\\r' | '@' ) ) )+ '@done' RULE_NL | ( RULE_WS )* RULE_TASK_START '@done' (~ ( ( '\\n' | '\\r' | '@' ) ) )+ RULE_NL )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:839:21: ( RULE_WS )* RULE_TASK_START (~ ( ( '\\n' | '\\r' | '@' ) ) )+ '@done' (~ ( ( '\\n' | '\\r' | '@' ) ) )+ RULE_NL
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:839:21: ( RULE_WS )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\t'||LA6_0==' ') ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:839:21: RULE_WS
                    	    {
                    	    mRULE_WS(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    mRULE_TASK_START(); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:839:46: (~ ( ( '\\n' | '\\r' | '@' ) ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='?')||(LA7_0>='A' && LA7_0<='\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:839:46: ~ ( ( '\\n' | '\\r' | '@' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    match("@done"); 

                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:839:74: (~ ( ( '\\n' | '\\r' | '@' ) ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='?')||(LA8_0>='A' && LA8_0<='\uFFFF')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:839:74: ~ ( ( '\\n' | '\\r' | '@' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    mRULE_NL(); 

                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:839:102: ( RULE_WS )* RULE_TASK_START (~ ( ( '\\n' | '\\r' | '@' ) ) )+ '@done' RULE_NL
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:839:102: ( RULE_WS )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\t'||LA9_0==' ') ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:839:102: RULE_WS
                    	    {
                    	    mRULE_WS(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    mRULE_TASK_START(); 
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:839:127: (~ ( ( '\\n' | '\\r' | '@' ) ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='?')||(LA10_0>='A' && LA10_0<='\uFFFF')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:839:127: ~ ( ( '\\n' | '\\r' | '@' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='\uFFFF') ) {
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

                    match("@done"); 

                    mRULE_NL(); 

                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:839:163: ( RULE_WS )* RULE_TASK_START '@done' (~ ( ( '\\n' | '\\r' | '@' ) ) )+ RULE_NL
                    {
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:839:163: ( RULE_WS )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\t'||LA11_0==' ') ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:839:163: RULE_WS
                    	    {
                    	    mRULE_WS(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    mRULE_TASK_START(); 
                    match("@done"); 

                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:839:196: (~ ( ( '\\n' | '\\r' | '@' ) ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='?')||(LA12_0>='A' && LA12_0<='\uFFFF')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:839:196: ~ ( ( '\\n' | '\\r' | '@' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


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
    // $ANTLR end "RULE_TASK_CLOSED"

    // $ANTLR start "RULE_PROJECT_1"
    public final void mRULE_PROJECT_1() throws RecognitionException {
        try {
            int _type = RULE_PROJECT_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:841:16: (~ ( ( '\\n' | '\\r' | RULE_TASK_START | RULE_WS ) ) (~ ( ( '\\n' | '\\r' ) ) )* RULE_PROJECT_DELIMITER RULE_NL )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:841:18: ~ ( ( '\\n' | '\\r' | RULE_TASK_START | RULE_WS ) ) (~ ( ( '\\n' | '\\r' ) ) )* RULE_PROJECT_DELIMITER RULE_NL
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:841:57: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==':') ) {
                    int LA14_1 = input.LA(2);

                    if ( ((LA14_1>='\u0000' && LA14_1<='\t')||(LA14_1>='\u000B' && LA14_1<='\f')||(LA14_1>='\u000E' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='9')||(LA14_0>=';' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:841:57: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop14;
                }
            } while (true);

            mRULE_PROJECT_DELIMITER(); 
            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PROJECT_1"

    // $ANTLR start "RULE_PROJECT_2"
    public final void mRULE_PROJECT_2() throws RecognitionException {
        try {
            int _type = RULE_PROJECT_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:843:16: ( RULE_WS ~ ( ( '\\n' | '\\r' | RULE_TASK_START | RULE_WS ) ) (~ ( ( '\\n' | '\\r' ) ) )* RULE_PROJECT_DELIMITER RULE_NL )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:843:18: RULE_WS ~ ( ( '\\n' | '\\r' | RULE_TASK_START | RULE_WS ) ) (~ ( ( '\\n' | '\\r' ) ) )* RULE_PROJECT_DELIMITER RULE_NL
            {
            mRULE_WS(); 
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:843:65: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==':') ) {
                    int LA15_1 = input.LA(2);

                    if ( ((LA15_1>='\u0000' && LA15_1<='\t')||(LA15_1>='\u000B' && LA15_1<='\f')||(LA15_1>='\u000E' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='9')||(LA15_0>=';' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:843:65: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop15;
                }
            } while (true);

            mRULE_PROJECT_DELIMITER(); 
            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PROJECT_2"

    // $ANTLR start "RULE_PROJECT_3"
    public final void mRULE_PROJECT_3() throws RecognitionException {
        try {
            int _type = RULE_PROJECT_3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:845:16: ( RULE_WS ( RULE_WS )+ ~ ( ( '\\n' | '\\r' | RULE_TASK_START | RULE_WS ) ) (~ ( ( '\\n' | '\\r' ) ) )* RULE_PROJECT_DELIMITER RULE_NL )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:845:18: RULE_WS ( RULE_WS )+ ~ ( ( '\\n' | '\\r' | RULE_TASK_START | RULE_WS ) ) (~ ( ( '\\n' | '\\r' ) ) )* RULE_PROJECT_DELIMITER RULE_NL
            {
            mRULE_WS(); 
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:845:26: ( RULE_WS )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='\t'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:845:26: RULE_WS
            	    {
            	    mRULE_WS(); 

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:845:74: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==':') ) {
                    int LA17_1 = input.LA(2);

                    if ( ((LA17_1>='\u0000' && LA17_1<='\t')||(LA17_1>='\u000B' && LA17_1<='\f')||(LA17_1>='\u000E' && LA17_1<='\uFFFF')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='9')||(LA17_0>=';' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:845:74: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop17;
                }
            } while (true);

            mRULE_PROJECT_DELIMITER(); 
            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PROJECT_3"

    // $ANTLR start "RULE_PROJECT_DELIMITER"
    public final void mRULE_PROJECT_DELIMITER() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:847:33: ( ':' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:847:35: ':'
            {
            match(':'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_PROJECT_DELIMITER"

    // $ANTLR start "RULE_NL"
    public final void mRULE_NL() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:849:18: ( ( '\\r' )? '\\n' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:849:20: ( '\\r' )? '\\n'
            {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:849:20: ( '\\r' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\r') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:849:20: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NL"

    // $ANTLR start "RULE_TASK_START"
    public final void mRULE_TASK_START() throws RecognitionException {
        try {
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:851:26: ( '-' )
            // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:851:28: '-'
            {
            match('-'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_TASK_START"

    public void mTokens() throws RecognitionException {
        // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:1:8: ( RULE_WS | RULE_SPACE | RULE_NOTE_CONTENT | RULE_TASK_OPEN | RULE_TASK_CLOSED | RULE_PROJECT_1 | RULE_PROJECT_2 | RULE_PROJECT_3 )
        int alt19=8;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:1:10: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 2 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:1:18: RULE_SPACE
                {
                mRULE_SPACE(); 

                }
                break;
            case 3 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:1:29: RULE_NOTE_CONTENT
                {
                mRULE_NOTE_CONTENT(); 

                }
                break;
            case 4 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:1:47: RULE_TASK_OPEN
                {
                mRULE_TASK_OPEN(); 

                }
                break;
            case 5 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:1:62: RULE_TASK_CLOSED
                {
                mRULE_TASK_CLOSED(); 

                }
                break;
            case 6 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:1:79: RULE_PROJECT_1
                {
                mRULE_PROJECT_1(); 

                }
                break;
            case 7 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:1:94: RULE_PROJECT_2
                {
                mRULE_PROJECT_2(); 

                }
                break;
            case 8 :
                // ../de.sebastianbenz.task.ui/src-gen/de/sebastianbenz/task/ui/contentassist/antlr/internal/InternalTaskPaper.g:1:109: RULE_PROJECT_3
                {
                mRULE_PROJECT_3(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA13_eotS =
        "\14\uffff";
    static final String DFA13_eofS =
        "\14\uffff";
    static final String DFA13_minS =
        "\2\11\1\0\1\uffff\1\0\1\144\1\157\1\156\1\145\1\0\2\uffff";
    static final String DFA13_maxS =
        "\2\55\1\uffff\1\uffff\1\uffff\1\144\1\157\1\156\1\145\1\uffff\2"+
        "\uffff";
    static final String DFA13_acceptS =
        "\3\uffff\1\3\6\uffff\1\1\1\2";
    static final String DFA13_specialS =
        "\2\uffff\1\2\1\uffff\1\0\4\uffff\1\1\2\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\26\uffff\1\1\14\uffff\1\2",
            "\1\1\26\uffff\1\1\14\uffff\1\2",
            "\12\4\1\uffff\2\4\1\uffff\62\4\1\3\uffbf\4",
            "",
            "\12\4\1\uffff\2\4\1\uffff\62\4\1\5\uffbf\4",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\12\12\1\13\2\12\1\13\62\12\1\uffff\uffbf\12",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "839:20: ( ( RULE_WS )* RULE_TASK_START (~ ( ( '\\n' | '\\r' | '@' ) ) )+ '@done' (~ ( ( '\\n' | '\\r' | '@' ) ) )+ RULE_NL | ( RULE_WS )* RULE_TASK_START (~ ( ( '\\n' | '\\r' | '@' ) ) )+ '@done' RULE_NL | ( RULE_WS )* RULE_TASK_START '@done' (~ ( ( '\\n' | '\\r' | '@' ) ) )+ RULE_NL )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_4 = input.LA(1);

                        s = -1;
                        if ( (LA13_4=='@') ) {s = 5;}

                        else if ( ((LA13_4>='\u0000' && LA13_4<='\t')||(LA13_4>='\u000B' && LA13_4<='\f')||(LA13_4>='\u000E' && LA13_4<='?')||(LA13_4>='A' && LA13_4<='\uFFFF')) ) {s = 4;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_9 = input.LA(1);

                        s = -1;
                        if ( ((LA13_9>='\u0000' && LA13_9<='\t')||(LA13_9>='\u000B' && LA13_9<='\f')||(LA13_9>='\u000E' && LA13_9<='?')||(LA13_9>='A' && LA13_9<='\uFFFF')) ) {s = 10;}

                        else if ( (LA13_9=='\n'||LA13_9=='\r') ) {s = 11;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_2 = input.LA(1);

                        s = -1;
                        if ( (LA13_2=='@') ) {s = 3;}

                        else if ( ((LA13_2>='\u0000' && LA13_2<='\t')||(LA13_2>='\u000B' && LA13_2<='\f')||(LA13_2>='\u000E' && LA13_2<='?')||(LA13_2>='A' && LA13_2<='\uFFFF')) ) {s = 4;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA19_eotS =
        "\1\uffff\1\5\24\uffff";
    static final String DFA19_eofS =
        "\26\uffff";
    static final String DFA19_minS =
        "\2\0\1\uffff\2\0\1\uffff\5\0\2\uffff\3\0\3\uffff\2\0\1\uffff";
    static final String DFA19_maxS =
        "\2\uffff\1\uffff\2\uffff\1\uffff\5\uffff\2\uffff\3\uffff\3\uffff"+
        "\2\uffff\1\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\5\uffff\1\4\1\5\3\uffff\1\3\1\6\1\7\2\uffff"+
        "\1\10";
    static final String DFA19_specialS =
        "\1\10\1\3\1\uffff\1\13\1\0\1\uffff\1\5\1\11\1\6\1\14\1\2\2\uffff"+
        "\1\15\1\12\1\1\3\uffff\1\7\1\4\1\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\3\1\1\1\2\2\3\1\2\22\3\1\1\14\3\1\4\uffd2\3",
            "\11\6\1\7\1\2\2\6\1\2\22\6\1\7\14\6\1\4\uffd2\6",
            "",
            "\12\10\1\uffff\2\10\1\uffff\54\10\1\11\uffc5\10",
            "\12\12\1\13\2\12\1\13\62\12\1\14\uffbf\12",
            "",
            "\12\15\1\uffff\2\15\1\uffff\54\15\1\16\uffc5\15",
            "\11\17\1\7\1\2\2\17\1\2\22\17\1\7\14\17\1\4\uffd2\17",
            "\12\10\1\20\2\10\1\20\54\10\1\11\uffc5\10",
            "\12\10\1\21\2\10\1\21\54\10\1\11\uffc5\10",
            "\12\12\1\13\2\12\1\13\62\12\1\14\uffbf\12",
            "",
            "",
            "\12\15\1\20\2\15\1\20\54\15\1\16\uffc5\15",
            "\12\15\1\22\2\15\1\22\54\15\1\16\uffc5\15",
            "\12\23\1\uffff\2\23\1\uffff\54\23\1\24\uffc5\23",
            "",
            "",
            "",
            "\12\23\1\20\2\23\1\20\54\23\1\24\uffc5\23",
            "\12\23\1\25\2\23\1\25\54\23\1\24\uffc5\23",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_WS | RULE_SPACE | RULE_NOTE_CONTENT | RULE_TASK_OPEN | RULE_TASK_CLOSED | RULE_PROJECT_1 | RULE_PROJECT_2 | RULE_PROJECT_3 );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_4 = input.LA(1);

                        s = -1;
                        if ( ((LA19_4>='\u0000' && LA19_4<='\t')||(LA19_4>='\u000B' && LA19_4<='\f')||(LA19_4>='\u000E' && LA19_4<='?')||(LA19_4>='A' && LA19_4<='\uFFFF')) ) {s = 10;}

                        else if ( (LA19_4=='\n'||LA19_4=='\r') ) {s = 11;}

                        else if ( (LA19_4=='@') ) {s = 12;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_15 = input.LA(1);

                        s = -1;
                        if ( ((LA19_15>='\u0000' && LA19_15<='\t')||(LA19_15>='\u000B' && LA19_15<='\f')||(LA19_15>='\u000E' && LA19_15<='9')||(LA19_15>=';' && LA19_15<='\uFFFF')) ) {s = 19;}

                        else if ( (LA19_15==':') ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_10 = input.LA(1);

                        s = -1;
                        if ( (LA19_10=='@') ) {s = 12;}

                        else if ( ((LA19_10>='\u0000' && LA19_10<='\t')||(LA19_10>='\u000B' && LA19_10<='\f')||(LA19_10>='\u000E' && LA19_10<='?')||(LA19_10>='A' && LA19_10<='\uFFFF')) ) {s = 10;}

                        else if ( (LA19_10=='\n'||LA19_10=='\r') ) {s = 11;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA19_1 = input.LA(1);

                        s = -1;
                        if ( ((LA19_1>='\u0000' && LA19_1<='\b')||(LA19_1>='\u000B' && LA19_1<='\f')||(LA19_1>='\u000E' && LA19_1<='\u001F')||(LA19_1>='!' && LA19_1<=',')||(LA19_1>='.' && LA19_1<='\uFFFF')) ) {s = 6;}

                        else if ( (LA19_1=='\n'||LA19_1=='\r') ) {s = 2;}

                        else if ( (LA19_1=='\t'||LA19_1==' ') ) {s = 7;}

                        else if ( (LA19_1=='-') ) {s = 4;}

                        else s = 5;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA19_20 = input.LA(1);

                        s = -1;
                        if ( (LA19_20=='\n'||LA19_20=='\r') ) {s = 21;}

                        else if ( (LA19_20==':') ) {s = 20;}

                        else if ( ((LA19_20>='\u0000' && LA19_20<='\t')||(LA19_20>='\u000B' && LA19_20<='\f')||(LA19_20>='\u000E' && LA19_20<='9')||(LA19_20>=';' && LA19_20<='\uFFFF')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA19_6 = input.LA(1);

                        s = -1;
                        if ( ((LA19_6>='\u0000' && LA19_6<='\t')||(LA19_6>='\u000B' && LA19_6<='\f')||(LA19_6>='\u000E' && LA19_6<='9')||(LA19_6>=';' && LA19_6<='\uFFFF')) ) {s = 13;}

                        else if ( (LA19_6==':') ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA19_8 = input.LA(1);

                        s = -1;
                        if ( (LA19_8=='\n'||LA19_8=='\r') ) {s = 16;}

                        else if ( (LA19_8==':') ) {s = 9;}

                        else if ( ((LA19_8>='\u0000' && LA19_8<='\t')||(LA19_8>='\u000B' && LA19_8<='\f')||(LA19_8>='\u000E' && LA19_8<='9')||(LA19_8>=';' && LA19_8<='\uFFFF')) ) {s = 8;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA19_19 = input.LA(1);

                        s = -1;
                        if ( (LA19_19=='\n'||LA19_19=='\r') ) {s = 16;}

                        else if ( (LA19_19==':') ) {s = 20;}

                        else if ( ((LA19_19>='\u0000' && LA19_19<='\t')||(LA19_19>='\u000B' && LA19_19<='\f')||(LA19_19>='\u000E' && LA19_19<='9')||(LA19_19>=';' && LA19_19<='\uFFFF')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='\t'||LA19_0==' ') ) {s = 1;}

                        else if ( (LA19_0=='\n'||LA19_0=='\r') ) {s = 2;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||(LA19_0>='!' && LA19_0<=',')||(LA19_0>='.' && LA19_0<='\uFFFF')) ) {s = 3;}

                        else if ( (LA19_0=='-') ) {s = 4;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA19_7 = input.LA(1);

                        s = -1;
                        if ( (LA19_7=='\n'||LA19_7=='\r') ) {s = 2;}

                        else if ( (LA19_7=='\t'||LA19_7==' ') ) {s = 7;}

                        else if ( (LA19_7=='-') ) {s = 4;}

                        else if ( ((LA19_7>='\u0000' && LA19_7<='\b')||(LA19_7>='\u000B' && LA19_7<='\f')||(LA19_7>='\u000E' && LA19_7<='\u001F')||(LA19_7>='!' && LA19_7<=',')||(LA19_7>='.' && LA19_7<='\uFFFF')) ) {s = 15;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA19_14 = input.LA(1);

                        s = -1;
                        if ( (LA19_14=='\n'||LA19_14=='\r') ) {s = 18;}

                        else if ( (LA19_14==':') ) {s = 14;}

                        else if ( ((LA19_14>='\u0000' && LA19_14<='\t')||(LA19_14>='\u000B' && LA19_14<='\f')||(LA19_14>='\u000E' && LA19_14<='9')||(LA19_14>=';' && LA19_14<='\uFFFF')) ) {s = 13;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA19_3 = input.LA(1);

                        s = -1;
                        if ( ((LA19_3>='\u0000' && LA19_3<='\t')||(LA19_3>='\u000B' && LA19_3<='\f')||(LA19_3>='\u000E' && LA19_3<='9')||(LA19_3>=';' && LA19_3<='\uFFFF')) ) {s = 8;}

                        else if ( (LA19_3==':') ) {s = 9;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA19_9 = input.LA(1);

                        s = -1;
                        if ( (LA19_9==':') ) {s = 9;}

                        else if ( ((LA19_9>='\u0000' && LA19_9<='\t')||(LA19_9>='\u000B' && LA19_9<='\f')||(LA19_9>='\u000E' && LA19_9<='9')||(LA19_9>=';' && LA19_9<='\uFFFF')) ) {s = 8;}

                        else if ( (LA19_9=='\n'||LA19_9=='\r') ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA19_13 = input.LA(1);

                        s = -1;
                        if ( (LA19_13=='\n'||LA19_13=='\r') ) {s = 16;}

                        else if ( (LA19_13==':') ) {s = 14;}

                        else if ( ((LA19_13>='\u0000' && LA19_13<='\t')||(LA19_13>='\u000B' && LA19_13<='\f')||(LA19_13>='\u000E' && LA19_13<='9')||(LA19_13>=';' && LA19_13<='\uFFFF')) ) {s = 13;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}