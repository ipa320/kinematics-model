package de.fraunhofer.ipa.kinematics.xacro.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXacroLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=9;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_DIGIT=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=7;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int RULE_JOINTTYPE=6;
    public static final int T__36=36;
    public static final int RULE_DECINT=10;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalXacroLexer() {;} 
    public InternalXacroLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalXacroLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalXacro.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:11:7: ( 'Robot' )
            // InternalXacro.g:11:9: 'Robot'
            {
            match("Robot"); 


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
            // InternalXacro.g:12:7: ( '{' )
            // InternalXacro.g:12:9: '{'
            {
            match('{'); 

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
            // InternalXacro.g:13:7: ( 'name' )
            // InternalXacro.g:13:9: 'name'
            {
            match("name"); 


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
            // InternalXacro.g:14:7: ( 'version' )
            // InternalXacro.g:14:9: 'version'
            {
            match("version"); 


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
            // InternalXacro.g:15:7: ( 'macro' )
            // InternalXacro.g:15:9: 'macro'
            {
            match("macro"); 


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
            // InternalXacro.g:16:7: ( ',' )
            // InternalXacro.g:16:9: ','
            {
            match(','); 

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
            // InternalXacro.g:17:7: ( '}' )
            // InternalXacro.g:17:9: '}'
            {
            match('}'); 

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
            // InternalXacro.g:18:7: ( 'macroCall' )
            // InternalXacro.g:18:9: 'macroCall'
            {
            match("macroCall"); 


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
            // InternalXacro.g:19:7: ( 'body' )
            // InternalXacro.g:19:9: 'body'
            {
            match("body"); 


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
            // InternalXacro.g:20:7: ( 'Macro' )
            // InternalXacro.g:20:9: 'Macro'
            {
            match("Macro"); 


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
            // InternalXacro.g:21:7: ( 'parameter' )
            // InternalXacro.g:21:9: 'parameter'
            {
            match("parameter"); 


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
            // InternalXacro.g:22:7: ( 'Parameter' )
            // InternalXacro.g:22:9: 'Parameter'
            {
            match("Parameter"); 


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
            // InternalXacro.g:23:7: ( 'value' )
            // InternalXacro.g:23:9: 'value'
            {
            match("value"); 


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
            // InternalXacro.g:24:7: ( '+' )
            // InternalXacro.g:24:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:25:7: ( 'Body' )
            // InternalXacro.g:25:9: 'Body'
            {
            match("Body"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:26:7: ( 'link' )
            // InternalXacro.g:26:9: 'link'
            {
            match("link"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:27:7: ( 'joint' )
            // InternalXacro.g:27:9: 'joint'
            {
            match("joint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:28:7: ( 'MacroCall' )
            // InternalXacro.g:28:9: 'MacroCall'
            {
            match("MacroCall"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:29:7: ( 'ParameterCall' )
            // InternalXacro.g:29:9: 'ParameterCall'
            {
            match("ParameterCall"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:30:7: ( 'Joint' )
            // InternalXacro.g:30:9: 'Joint'
            {
            match("Joint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:31:7: ( 'type' )
            // InternalXacro.g:31:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:32:7: ( 'parent' )
            // InternalXacro.g:32:9: 'parent'
            {
            match("parent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:33:7: ( 'child' )
            // InternalXacro.g:33:9: 'child'
            {
            match("child"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:34:7: ( 'origin' )
            // InternalXacro.g:34:9: 'origin'
            {
            match("origin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:35:7: ( 'axis' )
            // InternalXacro.g:35:9: 'axis'
            {
            match("axis"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:36:7: ( 'limit' )
            // InternalXacro.g:36:9: 'limit'
            {
            match("limit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:37:7: ( 'Link' )
            // InternalXacro.g:37:9: 'Link'
            {
            match("Link"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:38:7: ( 'inertial' )
            // InternalXacro.g:38:9: 'inertial'
            {
            match("inertial"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:39:7: ( 'visual' )
            // InternalXacro.g:39:9: 'visual'
            {
            match("visual"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:40:7: ( 'collision' )
            // InternalXacro.g:40:9: 'collision'
            {
            match("collision"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:41:7: ( 'Pose' )
            // InternalXacro.g:41:9: 'Pose'
            {
            match("Pose"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:42:7: ( 'rpy' )
            // InternalXacro.g:42:9: 'rpy'
            {
            match("rpy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:43:7: ( 'xyz' )
            // InternalXacro.g:43:9: 'xyz'
            {
            match("xyz"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:44:7: ( 'Vector3' )
            // InternalXacro.g:44:9: 'Vector3'
            {
            match("Vector3"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:45:7: ( 'Limit' )
            // InternalXacro.g:45:9: 'Limit'
            {
            match("Limit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:46:7: ( 'effort' )
            // InternalXacro.g:46:9: 'effort'
            {
            match("effort"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:47:7: ( 'lower' )
            // InternalXacro.g:47:9: 'lower'
            {
            match("lower"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:48:7: ( 'upper' )
            // InternalXacro.g:48:9: 'upper'
            {
            match("upper"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:49:7: ( 'velocity' )
            // InternalXacro.g:49:9: 'velocity'
            {
            match("velocity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:50:7: ( 'Inertial' )
            // InternalXacro.g:50:9: 'Inertial'
            {
            match("Inertial"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:51:7: ( 'mass' )
            // InternalXacro.g:51:9: 'mass'
            {
            match("mass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:52:7: ( 'inertia' )
            // InternalXacro.g:52:9: 'inertia'
            {
            match("inertia"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:53:7: ( 'Visual' )
            // InternalXacro.g:53:9: 'Visual'
            {
            match("Visual"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:54:7: ( 'geometry' )
            // InternalXacro.g:54:9: 'geometry'
            {
            match("geometry"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:55:7: ( 'Collision' )
            // InternalXacro.g:55:9: 'Collision'
            {
            match("Collision"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:56:7: ( 'Mass' )
            // InternalXacro.g:56:9: 'Mass'
            {
            match("Mass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:57:7: ( 'Inertia' )
            // InternalXacro.g:57:9: 'Inertia'
            {
            match("Inertia"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:58:7: ( 'ixx' )
            // InternalXacro.g:58:9: 'ixx'
            {
            match("ixx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:59:7: ( 'ixy' )
            // InternalXacro.g:59:9: 'ixy'
            {
            match("ixy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:60:7: ( 'ixz' )
            // InternalXacro.g:60:9: 'ixz'
            {
            match("ixz"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:61:7: ( 'iyy' )
            // InternalXacro.g:61:9: 'iyy'
            {
            match("iyy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:62:7: ( 'iyz' )
            // InternalXacro.g:62:9: 'iyz'
            {
            match("iyz"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:63:7: ( 'izz' )
            // InternalXacro.g:63:9: 'izz'
            {
            match("izz"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:64:7: ( 'Geometry' )
            // InternalXacro.g:64:9: 'Geometry'
            {
            match("Geometry"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:65:7: ( 'box' )
            // InternalXacro.g:65:9: 'box'
            {
            match("box"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:66:7: ( 'cylinder' )
            // InternalXacro.g:66:9: 'cylinder'
            {
            match("cylinder"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:67:7: ( 'sphere' )
            // InternalXacro.g:67:9: 'sphere'
            {
            match("sphere"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:68:7: ( 'mesh' )
            // InternalXacro.g:68:9: 'mesh'
            {
            match("mesh"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:69:7: ( 'Box' )
            // InternalXacro.g:69:9: 'Box'
            {
            match("Box"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:70:7: ( 'size' )
            // InternalXacro.g:70:9: 'size'
            {
            match("size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:71:7: ( 'Cylinder' )
            // InternalXacro.g:71:9: 'Cylinder'
            {
            match("Cylinder"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:72:7: ( 'length' )
            // InternalXacro.g:72:9: 'length'
            {
            match("length"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:73:7: ( 'radius' )
            // InternalXacro.g:73:9: 'radius'
            {
            match("radius"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:74:7: ( 'Sphere' )
            // InternalXacro.g:74:9: 'Sphere'
            {
            match("Sphere"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:75:7: ( 'Mesh' )
            // InternalXacro.g:75:9: 'Mesh'
            {
            match("Mesh"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:76:7: ( 'filename' )
            // InternalXacro.g:76:9: 'filename'
            {
            match("filename"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:77:7: ( 'scale' )
            // InternalXacro.g:77:9: 'scale'
            {
            match("scale"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:78:7: ( 'AnyURI' )
            // InternalXacro.g:78:9: 'AnyURI'
            {
            match("AnyURI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalXacro.g:2619:21: ( '0' .. '9' )
            // InternalXacro.g:2619:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:2621:14: ( ( 'true' | 'false' ) )
            // InternalXacro.g:2621:16: ( 'true' | 'false' )
            {
            // InternalXacro.g:2621:16: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalXacro.g:2621:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalXacro.g:2621:24: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:2623:13: ( RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT ) )
            // InternalXacro.g:2623:15: RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )
            {
            mRULE_DECINT(); 
            // InternalXacro.g:2623:27: ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalXacro.g:2623:28: '.' ( RULE_DIGIT )*
                    {
                    match('.'); 
                    // InternalXacro.g:2623:32: ( RULE_DIGIT )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalXacro.g:2623:32: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalXacro.g:2623:44: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT
                    {
                    // InternalXacro.g:2623:44: ( '.' ( RULE_DIGIT )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='.') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalXacro.g:2623:45: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalXacro.g:2623:49: ( RULE_DIGIT )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalXacro.g:2623:49: RULE_DIGIT
                            	    {
                            	    mRULE_DIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);


                            }
                            break;

                    }

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalXacro.g:2623:73: ( '-' | '+' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='-') ) {
                        int LA5_1 = input.LA(2);

                        if ( (LA5_1=='0') ) {
                            alt5=1;
                        }
                        else if ( (LA5_1=='-'||(LA5_1>='1' && LA5_1<='9')) ) {
                            alt5=1;
                        }
                    }
                    else if ( (LA5_0=='+') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalXacro.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_DECINT(); 

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
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_DECINT"
    public final void mRULE_DECINT() throws RecognitionException {
        try {
            int _type = RULE_DECINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:2625:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalXacro.g:2625:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalXacro.g:2625:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            int alt9=3;
            switch ( input.LA(1) ) {
            case '0':
                {
                alt9=1;
                }
                break;
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt9=2;
                }
                break;
            case '-':
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalXacro.g:2625:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalXacro.g:2625:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalXacro.g:2625:29: ( RULE_DIGIT )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalXacro.g:2625:29: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalXacro.g:2625:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    matchRange('0','9'); 
                    // InternalXacro.g:2625:54: ( RULE_DIGIT )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalXacro.g:2625:54: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


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
    // $ANTLR end "RULE_DECINT"

    // $ANTLR start "RULE_JOINTTYPE"
    public final void mRULE_JOINTTYPE() throws RecognitionException {
        try {
            int _type = RULE_JOINTTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:2627:16: ( ( 'revolute' | 'continuous' | 'prismatic' | 'fixed' | 'floating' | 'planar' ) )
            // InternalXacro.g:2627:18: ( 'revolute' | 'continuous' | 'prismatic' | 'fixed' | 'floating' | 'planar' )
            {
            // InternalXacro.g:2627:18: ( 'revolute' | 'continuous' | 'prismatic' | 'fixed' | 'floating' | 'planar' )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 'r':
                {
                alt10=1;
                }
                break;
            case 'c':
                {
                alt10=2;
                }
                break;
            case 'p':
                {
                int LA10_3 = input.LA(2);

                if ( (LA10_3=='r') ) {
                    alt10=3;
                }
                else if ( (LA10_3=='l') ) {
                    alt10=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            case 'f':
                {
                int LA10_4 = input.LA(2);

                if ( (LA10_4=='i') ) {
                    alt10=4;
                }
                else if ( (LA10_4=='l') ) {
                    alt10=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalXacro.g:2627:19: 'revolute'
                    {
                    match("revolute"); 


                    }
                    break;
                case 2 :
                    // InternalXacro.g:2627:30: 'continuous'
                    {
                    match("continuous"); 


                    }
                    break;
                case 3 :
                    // InternalXacro.g:2627:43: 'prismatic'
                    {
                    match("prismatic"); 


                    }
                    break;
                case 4 :
                    // InternalXacro.g:2627:55: 'fixed'
                    {
                    match("fixed"); 


                    }
                    break;
                case 5 :
                    // InternalXacro.g:2627:63: 'floating'
                    {
                    match("floating"); 


                    }
                    break;
                case 6 :
                    // InternalXacro.g:2627:74: 'planar'
                    {
                    match("planar"); 


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
    // $ANTLR end "RULE_JOINTTYPE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:2629:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalXacro.g:2629:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalXacro.g:2629:11: ( '^' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='^') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXacro.g:2629:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalXacro.g:2629:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXacro.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
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
            // InternalXacro.g:2631:10: ( ( '0' .. '9' )+ )
            // InternalXacro.g:2631:12: ( '0' .. '9' )+
            {
            // InternalXacro.g:2631:12: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalXacro.g:2631:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalXacro.g:2633:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalXacro.g:2633:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalXacro.g:2633:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\"') ) {
                alt16=1;
            }
            else if ( (LA16_0=='\'') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalXacro.g:2633:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalXacro.g:2633:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalXacro.g:2633:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalXacro.g:2633:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop14;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalXacro.g:2633:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalXacro.g:2633:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalXacro.g:2633:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalXacro.g:2633:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop15;
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
            // InternalXacro.g:2635:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalXacro.g:2635:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalXacro.g:2635:24: ( options {greedy=false; } : . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='*') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='/') ) {
                        alt17=2;
                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='.')||(LA17_1>='0' && LA17_1<='\uFFFF')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<=')')||(LA17_0>='+' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalXacro.g:2635:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop17;
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
            // InternalXacro.g:2637:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalXacro.g:2637:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalXacro.g:2637:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalXacro.g:2637:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop18;
                }
            } while (true);

            // InternalXacro.g:2637:40: ( ( '\\r' )? '\\n' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n'||LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalXacro.g:2637:41: ( '\\r' )? '\\n'
                    {
                    // InternalXacro.g:2637:41: ( '\\r' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\r') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalXacro.g:2637:41: '\\r'
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
            // InternalXacro.g:2639:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalXacro.g:2639:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalXacro.g:2639:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalXacro.g:
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
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
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
            // InternalXacro.g:2641:16: ( . )
            // InternalXacro.g:2641:18: .
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
        // InternalXacro.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_JOINTTYPE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt22=79;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // InternalXacro.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // InternalXacro.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // InternalXacro.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // InternalXacro.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // InternalXacro.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // InternalXacro.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // InternalXacro.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // InternalXacro.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // InternalXacro.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // InternalXacro.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // InternalXacro.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // InternalXacro.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // InternalXacro.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // InternalXacro.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // InternalXacro.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // InternalXacro.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // InternalXacro.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // InternalXacro.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // InternalXacro.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // InternalXacro.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // InternalXacro.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // InternalXacro.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // InternalXacro.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // InternalXacro.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // InternalXacro.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // InternalXacro.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // InternalXacro.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // InternalXacro.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // InternalXacro.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // InternalXacro.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // InternalXacro.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // InternalXacro.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // InternalXacro.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // InternalXacro.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // InternalXacro.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // InternalXacro.g:1:220: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // InternalXacro.g:1:226: T__52
                {
                mT__52(); 

                }
                break;
            case 38 :
                // InternalXacro.g:1:232: T__53
                {
                mT__53(); 

                }
                break;
            case 39 :
                // InternalXacro.g:1:238: T__54
                {
                mT__54(); 

                }
                break;
            case 40 :
                // InternalXacro.g:1:244: T__55
                {
                mT__55(); 

                }
                break;
            case 41 :
                // InternalXacro.g:1:250: T__56
                {
                mT__56(); 

                }
                break;
            case 42 :
                // InternalXacro.g:1:256: T__57
                {
                mT__57(); 

                }
                break;
            case 43 :
                // InternalXacro.g:1:262: T__58
                {
                mT__58(); 

                }
                break;
            case 44 :
                // InternalXacro.g:1:268: T__59
                {
                mT__59(); 

                }
                break;
            case 45 :
                // InternalXacro.g:1:274: T__60
                {
                mT__60(); 

                }
                break;
            case 46 :
                // InternalXacro.g:1:280: T__61
                {
                mT__61(); 

                }
                break;
            case 47 :
                // InternalXacro.g:1:286: T__62
                {
                mT__62(); 

                }
                break;
            case 48 :
                // InternalXacro.g:1:292: T__63
                {
                mT__63(); 

                }
                break;
            case 49 :
                // InternalXacro.g:1:298: T__64
                {
                mT__64(); 

                }
                break;
            case 50 :
                // InternalXacro.g:1:304: T__65
                {
                mT__65(); 

                }
                break;
            case 51 :
                // InternalXacro.g:1:310: T__66
                {
                mT__66(); 

                }
                break;
            case 52 :
                // InternalXacro.g:1:316: T__67
                {
                mT__67(); 

                }
                break;
            case 53 :
                // InternalXacro.g:1:322: T__68
                {
                mT__68(); 

                }
                break;
            case 54 :
                // InternalXacro.g:1:328: T__69
                {
                mT__69(); 

                }
                break;
            case 55 :
                // InternalXacro.g:1:334: T__70
                {
                mT__70(); 

                }
                break;
            case 56 :
                // InternalXacro.g:1:340: T__71
                {
                mT__71(); 

                }
                break;
            case 57 :
                // InternalXacro.g:1:346: T__72
                {
                mT__72(); 

                }
                break;
            case 58 :
                // InternalXacro.g:1:352: T__73
                {
                mT__73(); 

                }
                break;
            case 59 :
                // InternalXacro.g:1:358: T__74
                {
                mT__74(); 

                }
                break;
            case 60 :
                // InternalXacro.g:1:364: T__75
                {
                mT__75(); 

                }
                break;
            case 61 :
                // InternalXacro.g:1:370: T__76
                {
                mT__76(); 

                }
                break;
            case 62 :
                // InternalXacro.g:1:376: T__77
                {
                mT__77(); 

                }
                break;
            case 63 :
                // InternalXacro.g:1:382: T__78
                {
                mT__78(); 

                }
                break;
            case 64 :
                // InternalXacro.g:1:388: T__79
                {
                mT__79(); 

                }
                break;
            case 65 :
                // InternalXacro.g:1:394: T__80
                {
                mT__80(); 

                }
                break;
            case 66 :
                // InternalXacro.g:1:400: T__81
                {
                mT__81(); 

                }
                break;
            case 67 :
                // InternalXacro.g:1:406: T__82
                {
                mT__82(); 

                }
                break;
            case 68 :
                // InternalXacro.g:1:412: T__83
                {
                mT__83(); 

                }
                break;
            case 69 :
                // InternalXacro.g:1:418: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 70 :
                // InternalXacro.g:1:431: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 71 :
                // InternalXacro.g:1:443: RULE_DECINT
                {
                mRULE_DECINT(); 

                }
                break;
            case 72 :
                // InternalXacro.g:1:455: RULE_JOINTTYPE
                {
                mRULE_JOINTTYPE(); 

                }
                break;
            case 73 :
                // InternalXacro.g:1:470: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 74 :
                // InternalXacro.g:1:478: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 75 :
                // InternalXacro.g:1:487: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 76 :
                // InternalXacro.g:1:499: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 77 :
                // InternalXacro.g:1:515: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 78 :
                // InternalXacro.g:1:531: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 79 :
                // InternalXacro.g:1:539: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA6_eotS =
        "\1\uffff\1\4\1\uffff\1\4\1\uffff";
    static final String DFA6_eofS =
        "\5\uffff";
    static final String DFA6_minS =
        "\1\56\1\60\1\uffff\1\60\1\uffff";
    static final String DFA6_maxS =
        "\2\145\1\uffff\1\145\1\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\1\uffff\1\1";
    static final String DFA6_specialS =
        "\5\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\26\uffff\1\2\37\uffff\1\2",
            "\12\3\13\uffff\1\2\37\uffff\1\2",
            "",
            "\12\3\13\uffff\1\2\37\uffff\1\2",
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
            return "2623:27: ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )";
        }
    }
    static final String DFA22_eotS =
        "\1\uffff\1\57\1\uffff\3\57\2\uffff\4\57\1\uffff\27\57\2\151\2\55\1\uffff\3\55\2\uffff\1\57\2\uffff\6\57\2\uffff\10\57\1\uffff\47\57\3\uffff\2\151\4\uffff\12\57\1\u00bf\11\57\1\u00ca\21\57\1\u00dc\1\u00dd\1\u00de\1\u00df\1\u00e0\1\u00e1\1\u00e2\2\57\1\u00e5\22\57\1\151\1\57\1\u00f9\5\57\1\u00ff\1\u0100\1\u0101\1\uffff\1\57\1\u0103\1\u0104\5\57\1\u010a\1\u010b\1\uffff\1\u010c\5\57\1\u0112\1\u0113\5\57\1\u0119\1\u011a\2\57\7\uffff\2\57\1\uffff\12\57\1\u0129\7\57\1\u0131\1\uffff\2\57\1\u0134\1\57\1\u0137\3\uffff\1\u0139\2\uffff\5\57\3\uffff\1\u013f\1\u0140\1\57\1\u0142\1\u0143\2\uffff\1\u0144\4\57\2\uffff\1\u0149\6\57\1\u0150\6\57\1\uffff\1\u0157\2\57\1\u015a\1\u0113\2\57\1\uffff\2\57\1\uffff\1\u015f\1\57\1\uffff\1\57\1\uffff\1\57\1\u0163\1\57\1\u015a\1\57\2\uffff\1\u0166\3\uffff\3\57\1\u016a\1\uffff\1\57\1\u016c\2\57\1\u016f\1\u0170\1\uffff\5\57\1\u0176\1\uffff\1\u0177\1\57\1\uffff\1\57\1\u017a\1\u017b\1\57\1\uffff\3\57\1\uffff\2\57\1\uffff\3\57\1\uffff\1\u0186\1\uffff\1\57\1\u0188\2\uffff\1\u018a\4\57\2\uffff\2\57\2\uffff\1\u0191\7\57\1\u0199\1\u019a\1\uffff\1\u015a\1\uffff\1\u019b\1\uffff\1\u019c\1\57\1\u019e\1\u019f\1\u01a0\1\u015a\1\uffff\1\u01a1\1\u01a2\1\u01a3\1\u015a\1\u01a5\1\u01a6\1\57\4\uffff\1\u01a8\6\uffff\1\57\2\uffff\1\u015a\1\uffff\2\57\1\u01ac\1\uffff";
    static final String DFA22_eofS =
        "\u01ad\uffff";
    static final String DFA22_minS =
        "\1\0\1\157\1\uffff\3\141\2\uffff\1\157\3\141\1\uffff\1\157\1\145\2\157\1\162\1\150\1\162\1\170\1\151\1\156\1\141\1\171\1\145\1\146\1\160\1\156\1\145\1\157\1\145\1\143\1\160\1\141\1\156\2\56\1\60\1\101\1\uffff\2\0\1\52\2\uffff\1\142\2\uffff\1\155\2\154\1\163\1\143\1\163\2\uffff\1\144\1\143\1\163\1\162\1\151\1\141\1\162\1\163\1\uffff\1\144\1\155\1\167\1\156\2\151\1\160\1\165\1\151\2\154\2\151\1\155\1\145\1\170\1\171\1\172\1\171\1\144\1\166\1\172\1\143\1\163\1\146\1\160\1\145\1\157\2\154\1\157\1\150\1\172\1\141\1\150\2\154\1\157\1\171\3\uffff\2\56\4\uffff\1\157\1\145\1\163\1\157\2\165\1\162\1\163\1\150\1\171\1\60\1\162\1\163\1\150\1\141\1\163\1\156\1\141\1\145\1\171\1\60\1\153\1\151\1\145\1\147\2\156\2\145\2\154\1\164\1\151\1\147\1\163\1\153\1\151\1\162\7\60\1\151\1\157\1\60\1\164\1\165\1\157\1\145\1\162\1\155\1\154\1\151\1\155\2\145\1\154\3\145\1\163\1\141\1\125\1\56\1\164\1\60\1\151\1\143\1\145\1\141\1\157\3\60\1\uffff\1\157\2\60\1\155\1\156\1\155\1\141\1\155\2\60\1\uffff\1\60\1\164\1\162\3\164\2\60\1\144\2\151\1\156\1\151\2\60\2\164\7\uffff\1\165\1\154\1\uffff\1\157\1\141\2\162\1\164\1\145\1\151\1\156\1\145\1\162\1\60\1\145\1\162\1\156\1\144\1\145\1\164\1\122\1\60\1\uffff\1\157\1\151\1\60\1\154\1\60\3\uffff\1\60\2\uffff\1\145\1\164\1\141\1\162\1\145\3\uffff\2\60\1\150\2\60\2\uffff\1\60\1\163\1\156\1\144\1\156\2\uffff\1\60\1\151\1\163\1\165\1\162\1\154\1\164\1\60\1\151\1\164\1\163\1\144\1\164\1\145\1\uffff\1\60\1\145\1\141\2\60\1\151\1\111\1\uffff\1\156\1\164\1\uffff\1\60\1\141\1\uffff\1\141\1\uffff\1\164\1\60\1\164\1\60\1\164\2\uffff\1\60\3\uffff\1\151\1\165\1\145\1\60\1\uffff\1\141\1\60\1\164\1\63\2\60\1\uffff\1\141\1\162\1\151\1\145\1\162\1\60\1\uffff\1\60\1\155\1\uffff\1\156\2\60\1\171\1\uffff\2\154\1\145\1\uffff\1\151\1\145\1\uffff\2\157\1\162\1\uffff\1\60\1\uffff\1\145\1\60\2\uffff\1\60\1\171\1\157\1\162\1\171\2\uffff\1\145\1\147\2\uffff\1\60\2\154\1\162\1\143\1\162\1\156\1\165\2\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\156\4\60\1\uffff\6\60\1\163\4\uffff\1\60\6\uffff\1\141\2\uffff\1\60\1\uffff\2\154\1\60\1\uffff";
    static final String DFA22_maxS =
        "\1\uffff\1\157\1\uffff\1\141\1\151\1\145\2\uffff\1\157\1\145\1\162\1\157\1\uffff\4\157\2\171\1\162\1\170\1\151\1\172\1\160\1\171\1\151\1\146\1\160\1\156\1\145\1\171\1\145\2\160\1\154\1\156\2\145\1\71\1\172\1\uffff\2\uffff\1\57\2\uffff\1\142\2\uffff\1\155\1\162\1\154\3\163\2\uffff\1\170\2\163\1\162\1\151\1\141\1\162\1\163\1\uffff\1\170\1\156\1\167\1\156\2\151\1\160\1\165\1\151\1\156\1\154\2\151\1\156\1\145\3\172\1\171\1\144\1\166\1\172\1\143\1\163\1\146\1\160\1\145\1\157\2\154\1\157\1\150\1\172\1\141\1\150\1\170\1\154\1\157\1\171\3\uffff\2\145\4\uffff\1\157\1\145\1\163\1\157\2\165\1\162\1\163\1\150\1\171\1\172\1\162\1\163\1\150\1\145\1\163\1\156\1\141\1\145\1\171\1\172\1\153\1\151\1\145\1\147\2\156\2\145\2\154\1\164\1\151\1\147\1\163\1\153\1\151\1\162\7\172\1\151\1\157\1\172\1\164\1\165\1\157\1\145\1\162\1\155\1\154\1\151\1\155\2\145\1\154\3\145\1\163\1\141\1\125\1\145\1\164\1\172\1\151\1\143\1\145\1\141\1\157\3\172\1\uffff\1\157\2\172\1\155\1\156\1\155\1\141\1\155\2\172\1\uffff\1\172\1\164\1\162\3\164\2\172\1\144\2\151\1\156\1\151\2\172\2\164\7\uffff\1\165\1\154\1\uffff\1\157\1\141\2\162\1\164\1\145\1\151\1\156\1\145\1\162\1\172\1\145\1\162\1\156\1\144\1\145\1\164\1\122\1\172\1\uffff\1\157\1\151\1\172\1\154\1\172\3\uffff\1\172\2\uffff\1\145\1\164\1\141\1\162\1\145\3\uffff\2\172\1\150\2\172\2\uffff\1\172\1\163\1\156\1\144\1\156\2\uffff\1\172\1\151\1\163\1\165\1\162\1\154\1\164\1\172\1\151\1\164\1\163\1\144\1\164\1\145\1\uffff\1\172\1\145\1\141\2\172\1\151\1\111\1\uffff\1\156\1\164\1\uffff\1\172\1\141\1\uffff\1\141\1\uffff\1\164\1\172\1\164\1\172\1\164\2\uffff\1\172\3\uffff\1\151\1\165\1\145\1\172\1\uffff\1\141\1\172\1\164\1\63\2\172\1\uffff\1\141\1\162\1\151\1\145\1\162\1\172\1\uffff\1\172\1\155\1\uffff\1\156\2\172\1\171\1\uffff\2\154\1\145\1\uffff\1\151\1\145\1\uffff\2\157\1\162\1\uffff\1\172\1\uffff\1\145\1\172\2\uffff\1\172\1\171\1\157\1\162\1\171\2\uffff\1\145\1\147\2\uffff\1\172\2\154\1\162\1\143\1\162\1\156\1\165\2\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\156\4\172\1\uffff\6\172\1\163\4\uffff\1\172\6\uffff\1\141\2\uffff\1\172\1\uffff\2\154\1\172\1\uffff";
    static final String DFA22_acceptS =
        "\2\uffff\1\2\3\uffff\1\6\1\7\4\uffff\1\16\33\uffff\1\111\3\uffff\1\116\1\117\1\uffff\1\111\1\2\6\uffff\1\6\1\7\10\uffff\1\16\47\uffff\1\107\1\106\1\112\2\uffff\1\113\1\114\1\115\1\116\115\uffff\1\67\12\uffff\1\73\21\uffff\1\60\1\61\1\62\1\63\1\64\1\65\1\40\2\uffff\1\41\23\uffff\1\3\5\uffff\1\51\1\72\1\11\1\uffff\1\56\1\101\5\uffff\1\37\1\17\1\20\5\uffff\1\25\1\105\5\uffff\1\31\1\33\16\uffff\1\74\7\uffff\1\1\2\uffff\1\15\2\uffff\1\5\1\uffff\1\12\5\uffff\1\32\1\45\1\uffff\1\21\1\24\1\27\4\uffff\1\43\6\uffff\1\46\6\uffff\1\103\2\uffff\1\110\4\uffff\1\35\3\uffff\1\26\2\uffff\1\76\3\uffff\1\30\1\uffff\1\77\2\uffff\1\53\1\44\5\uffff\1\71\1\100\2\uffff\1\104\1\4\12\uffff\1\52\1\uffff\1\42\1\uffff\1\57\6\uffff\1\47\7\uffff\1\70\1\34\1\50\1\54\1\uffff\1\75\1\66\1\102\1\10\1\22\1\13\1\uffff\1\14\1\36\1\uffff\1\55\3\uffff\1\23";
    static final String DFA22_specialS =
        "\1\0\50\uffff\1\1\1\2\u0182\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\55\2\54\2\55\1\54\22\55\1\54\1\55\1\51\4\55\1\52\3\55\1\14\1\6\1\46\1\55\1\53\1\44\11\45\7\55\1\43\1\15\1\36\3\50\1\37\1\50\1\34\1\20\1\50\1\25\1\11\2\50\1\13\1\50\1\1\1\41\2\50\1\31\4\50\3\55\1\47\1\50\1\55\1\24\1\10\1\22\1\50\1\32\1\42\1\35\1\50\1\26\1\17\1\50\1\16\1\5\1\3\1\23\1\12\1\50\1\27\1\40\1\21\1\33\1\4\1\50\1\30\2\50\1\2\1\55\1\7\uff82\55",
            "\1\56",
            "",
            "\1\61",
            "\1\63\3\uffff\1\62\3\uffff\1\64",
            "\1\65\3\uffff\1\66",
            "",
            "",
            "\1\71",
            "\1\72\3\uffff\1\73",
            "\1\74\12\uffff\1\76\5\uffff\1\75",
            "\1\77\15\uffff\1\100",
            "",
            "\1\102",
            "\1\105\3\uffff\1\103\5\uffff\1\104",
            "\1\106",
            "\1\107",
            "\1\111\6\uffff\1\110",
            "\1\112\6\uffff\1\113\11\uffff\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120\11\uffff\1\121\1\122\1\123",
            "\1\125\3\uffff\1\126\12\uffff\1\124",
            "\1\127",
            "\1\130\3\uffff\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136\11\uffff\1\137",
            "\1\140",
            "\1\143\5\uffff\1\142\6\uffff\1\141",
            "\1\144",
            "\1\146\7\uffff\1\145\2\uffff\1\147",
            "\1\150",
            "\1\152\1\uffff\12\153\13\uffff\1\152\37\uffff\1\152",
            "\1\152\1\uffff\12\154\13\uffff\1\152\37\uffff\1\152",
            "\12\155",
            "\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\0\156",
            "\0\156",
            "\1\157\4\uffff\1\160",
            "",
            "",
            "\1\162",
            "",
            "",
            "\1\163",
            "\1\165\5\uffff\1\164",
            "\1\166",
            "\1\167",
            "\1\170\17\uffff\1\171",
            "\1\172",
            "",
            "",
            "\1\173\23\uffff\1\174",
            "\1\175\17\uffff\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "\1\u0085\23\uffff\1\u0086",
            "\1\u0088\1\u0087",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090\1\uffff\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0096\1\u0095",
            "\1\u0097",
            "\1\u0098\1\u0099\1\u009a",
            "\1\u009b\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af\13\uffff\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "",
            "",
            "\1\152\1\uffff\12\154\13\uffff\1\152\37\uffff\1\152",
            "\1\152\1\uffff\12\u00b4\13\uffff\1\152\37\uffff\1\152",
            "",
            "",
            "",
            "",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3\3\uffff\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00e3",
            "\1\u00e4",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\152\1\uffff\12\u00b4\13\uffff\1\152\37\uffff\1\152",
            "\1\u00f8",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u0102",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u011b",
            "\1\u011c",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u011d",
            "\1\u011e",
            "",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u0132",
            "\1\u0133",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0135",
            "\12\57\7\uffff\2\57\1\u0136\27\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "\12\57\7\uffff\2\57\1\u0138\27\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0141",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0158",
            "\1\u0159",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u015b",
            "\1\u015c",
            "",
            "\1\u015d",
            "\1\u015e",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0160",
            "",
            "\1\u0161",
            "",
            "\1\u0162",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0164",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0165",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u016b",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u016d",
            "\1\u016e",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0178",
            "",
            "\1\u0179",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u017c",
            "",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "",
            "\1\u0180",
            "\1\u0181",
            "",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u0185\16\57",
            "",
            "\1\u0187",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u0189\16\57",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "",
            "",
            "\1\u018f",
            "\1\u0190",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u019d",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\2\57\1\u01a4\27\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01a7",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01a9",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u01aa",
            "\1\u01ab",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_JOINTTYPE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_0 = input.LA(1);

                        s = -1;
                        if ( (LA22_0=='R') ) {s = 1;}

                        else if ( (LA22_0=='{') ) {s = 2;}

                        else if ( (LA22_0=='n') ) {s = 3;}

                        else if ( (LA22_0=='v') ) {s = 4;}

                        else if ( (LA22_0=='m') ) {s = 5;}

                        else if ( (LA22_0==',') ) {s = 6;}

                        else if ( (LA22_0=='}') ) {s = 7;}

                        else if ( (LA22_0=='b') ) {s = 8;}

                        else if ( (LA22_0=='M') ) {s = 9;}

                        else if ( (LA22_0=='p') ) {s = 10;}

                        else if ( (LA22_0=='P') ) {s = 11;}

                        else if ( (LA22_0=='+') ) {s = 12;}

                        else if ( (LA22_0=='B') ) {s = 13;}

                        else if ( (LA22_0=='l') ) {s = 14;}

                        else if ( (LA22_0=='j') ) {s = 15;}

                        else if ( (LA22_0=='J') ) {s = 16;}

                        else if ( (LA22_0=='t') ) {s = 17;}

                        else if ( (LA22_0=='c') ) {s = 18;}

                        else if ( (LA22_0=='o') ) {s = 19;}

                        else if ( (LA22_0=='a') ) {s = 20;}

                        else if ( (LA22_0=='L') ) {s = 21;}

                        else if ( (LA22_0=='i') ) {s = 22;}

                        else if ( (LA22_0=='r') ) {s = 23;}

                        else if ( (LA22_0=='x') ) {s = 24;}

                        else if ( (LA22_0=='V') ) {s = 25;}

                        else if ( (LA22_0=='e') ) {s = 26;}

                        else if ( (LA22_0=='u') ) {s = 27;}

                        else if ( (LA22_0=='I') ) {s = 28;}

                        else if ( (LA22_0=='g') ) {s = 29;}

                        else if ( (LA22_0=='C') ) {s = 30;}

                        else if ( (LA22_0=='G') ) {s = 31;}

                        else if ( (LA22_0=='s') ) {s = 32;}

                        else if ( (LA22_0=='S') ) {s = 33;}

                        else if ( (LA22_0=='f') ) {s = 34;}

                        else if ( (LA22_0=='A') ) {s = 35;}

                        else if ( (LA22_0=='0') ) {s = 36;}

                        else if ( ((LA22_0>='1' && LA22_0<='9')) ) {s = 37;}

                        else if ( (LA22_0=='-') ) {s = 38;}

                        else if ( (LA22_0=='^') ) {s = 39;}

                        else if ( ((LA22_0>='D' && LA22_0<='F')||LA22_0=='H'||LA22_0=='K'||(LA22_0>='N' && LA22_0<='O')||LA22_0=='Q'||(LA22_0>='T' && LA22_0<='U')||(LA22_0>='W' && LA22_0<='Z')||LA22_0=='_'||LA22_0=='d'||LA22_0=='h'||LA22_0=='k'||LA22_0=='q'||LA22_0=='w'||(LA22_0>='y' && LA22_0<='z')) ) {s = 40;}

                        else if ( (LA22_0=='\"') ) {s = 41;}

                        else if ( (LA22_0=='\'') ) {s = 42;}

                        else if ( (LA22_0=='/') ) {s = 43;}

                        else if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {s = 44;}

                        else if ( ((LA22_0>='\u0000' && LA22_0<='\b')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\u001F')||LA22_0=='!'||(LA22_0>='#' && LA22_0<='&')||(LA22_0>='(' && LA22_0<='*')||LA22_0=='.'||(LA22_0>=':' && LA22_0<='@')||(LA22_0>='[' && LA22_0<=']')||LA22_0=='`'||LA22_0=='|'||(LA22_0>='~' && LA22_0<='\uFFFF')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_41 = input.LA(1);

                        s = -1;
                        if ( ((LA22_41>='\u0000' && LA22_41<='\uFFFF')) ) {s = 110;}

                        else s = 45;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_42 = input.LA(1);

                        s = -1;
                        if ( ((LA22_42>='\u0000' && LA22_42<='\uFFFF')) ) {s = 110;}

                        else s = 45;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}