package de.fraunhofer.ipa.kinematics.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKinematicsLexer extends Lexer {
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

    public InternalKinematicsLexer() {;} 
    public InternalKinematicsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalKinematicsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalKinematics.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:11:7: ( 'Robot' )
            // InternalKinematics.g:11:9: 'Robot'
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
            // InternalKinematics.g:12:7: ( '{' )
            // InternalKinematics.g:12:9: '{'
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
            // InternalKinematics.g:13:7: ( 'name' )
            // InternalKinematics.g:13:9: 'name'
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
            // InternalKinematics.g:14:7: ( 'version' )
            // InternalKinematics.g:14:9: 'version'
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
            // InternalKinematics.g:15:7: ( 'macro' )
            // InternalKinematics.g:15:9: 'macro'
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
            // InternalKinematics.g:16:7: ( ',' )
            // InternalKinematics.g:16:9: ','
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
            // InternalKinematics.g:17:7: ( '}' )
            // InternalKinematics.g:17:9: '}'
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
            // InternalKinematics.g:18:7: ( 'macroCall' )
            // InternalKinematics.g:18:9: 'macroCall'
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
            // InternalKinematics.g:19:7: ( 'body' )
            // InternalKinematics.g:19:9: 'body'
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
            // InternalKinematics.g:20:7: ( 'Macro' )
            // InternalKinematics.g:20:9: 'Macro'
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
            // InternalKinematics.g:21:7: ( 'parameter' )
            // InternalKinematics.g:21:9: 'parameter'
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
            // InternalKinematics.g:22:7: ( 'Parameter' )
            // InternalKinematics.g:22:9: 'Parameter'
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
            // InternalKinematics.g:23:7: ( 'type' )
            // InternalKinematics.g:23:9: 'type'
            {
            match("type"); 


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
            // InternalKinematics.g:24:7: ( 'value' )
            // InternalKinematics.g:24:9: 'value'
            {
            match("value"); 


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
            // InternalKinematics.g:25:7: ( 'String' )
            // InternalKinematics.g:25:9: 'String'
            {
            match("String"); 


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
            // InternalKinematics.g:26:7: ( 'LinkRef' )
            // InternalKinematics.g:26:9: 'LinkRef'
            {
            match("LinkRef"); 


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
            // InternalKinematics.g:27:7: ( 'Pose' )
            // InternalKinematics.g:27:9: 'Pose'
            {
            match("Pose"); 


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
            // InternalKinematics.g:28:7: ( 'Body' )
            // InternalKinematics.g:28:9: 'Body'
            {
            match("Body"); 


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
            // InternalKinematics.g:29:7: ( 'link' )
            // InternalKinematics.g:29:9: 'link'
            {
            match("link"); 


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
            // InternalKinematics.g:30:7: ( 'joint' )
            // InternalKinematics.g:30:9: 'joint'
            {
            match("joint"); 


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
            // InternalKinematics.g:31:7: ( 'MacroCall' )
            // InternalKinematics.g:31:9: 'MacroCall'
            {
            match("MacroCall"); 


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
            // InternalKinematics.g:32:7: ( 'ParameterCall' )
            // InternalKinematics.g:32:9: 'ParameterCall'
            {
            match("ParameterCall"); 


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
            // InternalKinematics.g:33:7: ( 'Joint' )
            // InternalKinematics.g:33:9: 'Joint'
            {
            match("Joint"); 


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
            // InternalKinematics.g:34:7: ( 'parent' )
            // InternalKinematics.g:34:9: 'parent'
            {
            match("parent"); 


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
            // InternalKinematics.g:35:7: ( 'child' )
            // InternalKinematics.g:35:9: 'child'
            {
            match("child"); 


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
            // InternalKinematics.g:36:7: ( 'origin' )
            // InternalKinematics.g:36:9: 'origin'
            {
            match("origin"); 


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
            // InternalKinematics.g:37:7: ( 'axis' )
            // InternalKinematics.g:37:9: 'axis'
            {
            match("axis"); 


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
            // InternalKinematics.g:38:7: ( 'limit' )
            // InternalKinematics.g:38:9: 'limit'
            {
            match("limit"); 


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
            // InternalKinematics.g:39:7: ( 'Link' )
            // InternalKinematics.g:39:9: 'Link'
            {
            match("Link"); 


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
            // InternalKinematics.g:40:7: ( 'inertial' )
            // InternalKinematics.g:40:9: 'inertial'
            {
            match("inertial"); 


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
            // InternalKinematics.g:41:7: ( 'visual' )
            // InternalKinematics.g:41:9: 'visual'
            {
            match("visual"); 


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
            // InternalKinematics.g:42:7: ( 'collision' )
            // InternalKinematics.g:42:9: 'collision'
            {
            match("collision"); 


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
            // InternalKinematics.g:43:7: ( 'rpy' )
            // InternalKinematics.g:43:9: 'rpy'
            {
            match("rpy"); 


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
            // InternalKinematics.g:44:7: ( 'xyz' )
            // InternalKinematics.g:44:9: 'xyz'
            {
            match("xyz"); 


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
            // InternalKinematics.g:45:7: ( 'Vector3' )
            // InternalKinematics.g:45:9: 'Vector3'
            {
            match("Vector3"); 


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
            // InternalKinematics.g:46:7: ( 'Limit' )
            // InternalKinematics.g:46:9: 'Limit'
            {
            match("Limit"); 


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
            // InternalKinematics.g:47:7: ( 'effort' )
            // InternalKinematics.g:47:9: 'effort'
            {
            match("effort"); 


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
            // InternalKinematics.g:48:7: ( 'lower' )
            // InternalKinematics.g:48:9: 'lower'
            {
            match("lower"); 


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
            // InternalKinematics.g:49:7: ( 'upper' )
            // InternalKinematics.g:49:9: 'upper'
            {
            match("upper"); 


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
            // InternalKinematics.g:50:7: ( 'velocity' )
            // InternalKinematics.g:50:9: 'velocity'
            {
            match("velocity"); 


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
            // InternalKinematics.g:51:7: ( 'Inertial' )
            // InternalKinematics.g:51:9: 'Inertial'
            {
            match("Inertial"); 


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
            // InternalKinematics.g:52:7: ( 'mass' )
            // InternalKinematics.g:52:9: 'mass'
            {
            match("mass"); 


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
            // InternalKinematics.g:53:7: ( 'inertia' )
            // InternalKinematics.g:53:9: 'inertia'
            {
            match("inertia"); 


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
            // InternalKinematics.g:54:7: ( 'Visual' )
            // InternalKinematics.g:54:9: 'Visual'
            {
            match("Visual"); 


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
            // InternalKinematics.g:55:7: ( 'geometry' )
            // InternalKinematics.g:55:9: 'geometry'
            {
            match("geometry"); 


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
            // InternalKinematics.g:56:7: ( 'Collision' )
            // InternalKinematics.g:56:9: 'Collision'
            {
            match("Collision"); 


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
            // InternalKinematics.g:57:7: ( 'Mass' )
            // InternalKinematics.g:57:9: 'Mass'
            {
            match("Mass"); 


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
            // InternalKinematics.g:58:7: ( 'Inertia' )
            // InternalKinematics.g:58:9: 'Inertia'
            {
            match("Inertia"); 


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
            // InternalKinematics.g:59:7: ( 'ixx' )
            // InternalKinematics.g:59:9: 'ixx'
            {
            match("ixx"); 


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
            // InternalKinematics.g:60:7: ( 'ixy' )
            // InternalKinematics.g:60:9: 'ixy'
            {
            match("ixy"); 


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
            // InternalKinematics.g:61:7: ( 'ixz' )
            // InternalKinematics.g:61:9: 'ixz'
            {
            match("ixz"); 


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
            // InternalKinematics.g:62:7: ( 'iyy' )
            // InternalKinematics.g:62:9: 'iyy'
            {
            match("iyy"); 


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
            // InternalKinematics.g:63:7: ( 'iyz' )
            // InternalKinematics.g:63:9: 'iyz'
            {
            match("iyz"); 


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
            // InternalKinematics.g:64:7: ( 'izz' )
            // InternalKinematics.g:64:9: 'izz'
            {
            match("izz"); 


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
            // InternalKinematics.g:65:7: ( 'Geometry' )
            // InternalKinematics.g:65:9: 'Geometry'
            {
            match("Geometry"); 


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
            // InternalKinematics.g:66:7: ( 'box' )
            // InternalKinematics.g:66:9: 'box'
            {
            match("box"); 


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
            // InternalKinematics.g:67:7: ( 'cylinder' )
            // InternalKinematics.g:67:9: 'cylinder'
            {
            match("cylinder"); 


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
            // InternalKinematics.g:68:7: ( 'sphere' )
            // InternalKinematics.g:68:9: 'sphere'
            {
            match("sphere"); 


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
            // InternalKinematics.g:69:7: ( 'mesh' )
            // InternalKinematics.g:69:9: 'mesh'
            {
            match("mesh"); 


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
            // InternalKinematics.g:70:7: ( 'Box' )
            // InternalKinematics.g:70:9: 'Box'
            {
            match("Box"); 


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
            // InternalKinematics.g:71:7: ( 'size' )
            // InternalKinematics.g:71:9: 'size'
            {
            match("size"); 


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
            // InternalKinematics.g:72:7: ( 'Cylinder' )
            // InternalKinematics.g:72:9: 'Cylinder'
            {
            match("Cylinder"); 


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
            // InternalKinematics.g:73:7: ( 'length' )
            // InternalKinematics.g:73:9: 'length'
            {
            match("length"); 


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
            // InternalKinematics.g:74:7: ( 'radius' )
            // InternalKinematics.g:74:9: 'radius'
            {
            match("radius"); 


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
            // InternalKinematics.g:75:7: ( 'Sphere' )
            // InternalKinematics.g:75:9: 'Sphere'
            {
            match("Sphere"); 


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
            // InternalKinematics.g:76:7: ( 'Mesh' )
            // InternalKinematics.g:76:9: 'Mesh'
            {
            match("Mesh"); 


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
            // InternalKinematics.g:77:7: ( 'filename' )
            // InternalKinematics.g:77:9: 'filename'
            {
            match("filename"); 


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
            // InternalKinematics.g:78:7: ( 'scale' )
            // InternalKinematics.g:78:9: 'scale'
            {
            match("scale"); 


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
            // InternalKinematics.g:2812:21: ( '0' .. '9' )
            // InternalKinematics.g:2812:23: '0' .. '9'
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
            // InternalKinematics.g:2814:14: ( ( 'true' | 'false' ) )
            // InternalKinematics.g:2814:16: ( 'true' | 'false' )
            {
            // InternalKinematics.g:2814:16: ( 'true' | 'false' )
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
                    // InternalKinematics.g:2814:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalKinematics.g:2814:24: 'false'
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
            // InternalKinematics.g:2816:13: ( RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT ) )
            // InternalKinematics.g:2816:15: RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )
            {
            mRULE_DECINT(); 
            // InternalKinematics.g:2816:27: ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalKinematics.g:2816:28: '.' ( RULE_DIGIT )*
                    {
                    match('.'); 
                    // InternalKinematics.g:2816:32: ( RULE_DIGIT )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalKinematics.g:2816:32: RULE_DIGIT
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
                    // InternalKinematics.g:2816:44: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT
                    {
                    // InternalKinematics.g:2816:44: ( '.' ( RULE_DIGIT )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='.') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalKinematics.g:2816:45: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalKinematics.g:2816:49: ( RULE_DIGIT )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalKinematics.g:2816:49: RULE_DIGIT
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

                    // InternalKinematics.g:2816:73: ( '-' | '+' )?
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
                            // InternalKinematics.g:
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
            // InternalKinematics.g:2818:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalKinematics.g:2818:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalKinematics.g:2818:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
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
                    // InternalKinematics.g:2818:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalKinematics.g:2818:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalKinematics.g:2818:29: ( RULE_DIGIT )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalKinematics.g:2818:29: RULE_DIGIT
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
                    // InternalKinematics.g:2818:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    matchRange('0','9'); 
                    // InternalKinematics.g:2818:54: ( RULE_DIGIT )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalKinematics.g:2818:54: RULE_DIGIT
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
            // InternalKinematics.g:2820:16: ( ( 'revolute' | 'continuous' | 'prismatic' | 'fixed' | 'floating' | 'planar' ) )
            // InternalKinematics.g:2820:18: ( 'revolute' | 'continuous' | 'prismatic' | 'fixed' | 'floating' | 'planar' )
            {
            // InternalKinematics.g:2820:18: ( 'revolute' | 'continuous' | 'prismatic' | 'fixed' | 'floating' | 'planar' )
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
                    // InternalKinematics.g:2820:19: 'revolute'
                    {
                    match("revolute"); 


                    }
                    break;
                case 2 :
                    // InternalKinematics.g:2820:30: 'continuous'
                    {
                    match("continuous"); 


                    }
                    break;
                case 3 :
                    // InternalKinematics.g:2820:43: 'prismatic'
                    {
                    match("prismatic"); 


                    }
                    break;
                case 4 :
                    // InternalKinematics.g:2820:55: 'fixed'
                    {
                    match("fixed"); 


                    }
                    break;
                case 5 :
                    // InternalKinematics.g:2820:63: 'floating'
                    {
                    match("floating"); 


                    }
                    break;
                case 6 :
                    // InternalKinematics.g:2820:74: 'planar'
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
            // InternalKinematics.g:2822:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKinematics.g:2822:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalKinematics.g:2822:11: ( '^' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='^') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKinematics.g:2822:11: '^'
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

            // InternalKinematics.g:2822:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKinematics.g:
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
            // InternalKinematics.g:2824:10: ( ( '0' .. '9' )+ )
            // InternalKinematics.g:2824:12: ( '0' .. '9' )+
            {
            // InternalKinematics.g:2824:12: ( '0' .. '9' )+
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
            	    // InternalKinematics.g:2824:13: '0' .. '9'
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
            // InternalKinematics.g:2826:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalKinematics.g:2826:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalKinematics.g:2826:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalKinematics.g:2826:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalKinematics.g:2826:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalKinematics.g:2826:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKinematics.g:2826:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalKinematics.g:2826:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalKinematics.g:2826:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalKinematics.g:2826:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKinematics.g:2826:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalKinematics.g:2828:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalKinematics.g:2828:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalKinematics.g:2828:24: ( options {greedy=false; } : . )*
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
            	    // InternalKinematics.g:2828:52: .
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
            // InternalKinematics.g:2830:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKinematics.g:2830:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalKinematics.g:2830:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKinematics.g:2830:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalKinematics.g:2830:40: ( ( '\\r' )? '\\n' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n'||LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalKinematics.g:2830:41: ( '\\r' )? '\\n'
                    {
                    // InternalKinematics.g:2830:41: ( '\\r' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\r') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalKinematics.g:2830:41: '\\r'
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
            // InternalKinematics.g:2832:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKinematics.g:2832:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKinematics.g:2832:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalKinematics.g:
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
            // InternalKinematics.g:2834:16: ( . )
            // InternalKinematics.g:2834:18: .
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
        // InternalKinematics.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_JOINTTYPE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt22=79;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // InternalKinematics.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // InternalKinematics.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // InternalKinematics.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // InternalKinematics.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // InternalKinematics.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // InternalKinematics.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // InternalKinematics.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // InternalKinematics.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // InternalKinematics.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // InternalKinematics.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // InternalKinematics.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // InternalKinematics.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // InternalKinematics.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // InternalKinematics.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // InternalKinematics.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // InternalKinematics.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // InternalKinematics.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // InternalKinematics.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // InternalKinematics.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // InternalKinematics.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // InternalKinematics.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // InternalKinematics.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // InternalKinematics.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // InternalKinematics.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // InternalKinematics.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // InternalKinematics.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // InternalKinematics.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // InternalKinematics.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // InternalKinematics.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // InternalKinematics.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // InternalKinematics.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // InternalKinematics.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // InternalKinematics.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // InternalKinematics.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // InternalKinematics.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // InternalKinematics.g:1:220: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // InternalKinematics.g:1:226: T__52
                {
                mT__52(); 

                }
                break;
            case 38 :
                // InternalKinematics.g:1:232: T__53
                {
                mT__53(); 

                }
                break;
            case 39 :
                // InternalKinematics.g:1:238: T__54
                {
                mT__54(); 

                }
                break;
            case 40 :
                // InternalKinematics.g:1:244: T__55
                {
                mT__55(); 

                }
                break;
            case 41 :
                // InternalKinematics.g:1:250: T__56
                {
                mT__56(); 

                }
                break;
            case 42 :
                // InternalKinematics.g:1:256: T__57
                {
                mT__57(); 

                }
                break;
            case 43 :
                // InternalKinematics.g:1:262: T__58
                {
                mT__58(); 

                }
                break;
            case 44 :
                // InternalKinematics.g:1:268: T__59
                {
                mT__59(); 

                }
                break;
            case 45 :
                // InternalKinematics.g:1:274: T__60
                {
                mT__60(); 

                }
                break;
            case 46 :
                // InternalKinematics.g:1:280: T__61
                {
                mT__61(); 

                }
                break;
            case 47 :
                // InternalKinematics.g:1:286: T__62
                {
                mT__62(); 

                }
                break;
            case 48 :
                // InternalKinematics.g:1:292: T__63
                {
                mT__63(); 

                }
                break;
            case 49 :
                // InternalKinematics.g:1:298: T__64
                {
                mT__64(); 

                }
                break;
            case 50 :
                // InternalKinematics.g:1:304: T__65
                {
                mT__65(); 

                }
                break;
            case 51 :
                // InternalKinematics.g:1:310: T__66
                {
                mT__66(); 

                }
                break;
            case 52 :
                // InternalKinematics.g:1:316: T__67
                {
                mT__67(); 

                }
                break;
            case 53 :
                // InternalKinematics.g:1:322: T__68
                {
                mT__68(); 

                }
                break;
            case 54 :
                // InternalKinematics.g:1:328: T__69
                {
                mT__69(); 

                }
                break;
            case 55 :
                // InternalKinematics.g:1:334: T__70
                {
                mT__70(); 

                }
                break;
            case 56 :
                // InternalKinematics.g:1:340: T__71
                {
                mT__71(); 

                }
                break;
            case 57 :
                // InternalKinematics.g:1:346: T__72
                {
                mT__72(); 

                }
                break;
            case 58 :
                // InternalKinematics.g:1:352: T__73
                {
                mT__73(); 

                }
                break;
            case 59 :
                // InternalKinematics.g:1:358: T__74
                {
                mT__74(); 

                }
                break;
            case 60 :
                // InternalKinematics.g:1:364: T__75
                {
                mT__75(); 

                }
                break;
            case 61 :
                // InternalKinematics.g:1:370: T__76
                {
                mT__76(); 

                }
                break;
            case 62 :
                // InternalKinematics.g:1:376: T__77
                {
                mT__77(); 

                }
                break;
            case 63 :
                // InternalKinematics.g:1:382: T__78
                {
                mT__78(); 

                }
                break;
            case 64 :
                // InternalKinematics.g:1:388: T__79
                {
                mT__79(); 

                }
                break;
            case 65 :
                // InternalKinematics.g:1:394: T__80
                {
                mT__80(); 

                }
                break;
            case 66 :
                // InternalKinematics.g:1:400: T__81
                {
                mT__81(); 

                }
                break;
            case 67 :
                // InternalKinematics.g:1:406: T__82
                {
                mT__82(); 

                }
                break;
            case 68 :
                // InternalKinematics.g:1:412: T__83
                {
                mT__83(); 

                }
                break;
            case 69 :
                // InternalKinematics.g:1:418: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 70 :
                // InternalKinematics.g:1:431: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 71 :
                // InternalKinematics.g:1:443: RULE_DECINT
                {
                mRULE_DECINT(); 

                }
                break;
            case 72 :
                // InternalKinematics.g:1:455: RULE_JOINTTYPE
                {
                mRULE_JOINTTYPE(); 

                }
                break;
            case 73 :
                // InternalKinematics.g:1:470: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 74 :
                // InternalKinematics.g:1:478: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 75 :
                // InternalKinematics.g:1:487: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 76 :
                // InternalKinematics.g:1:499: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 77 :
                // InternalKinematics.g:1:515: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 78 :
                // InternalKinematics.g:1:531: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 79 :
                // InternalKinematics.g:1:539: RULE_ANY_OTHER
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
            return "2816:27: ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )";
        }
    }
    static final String DFA22_eotS =
        "\1\uffff\1\55\1\uffff\3\55\2\uffff\32\55\2\146\2\53\1\uffff\3\53\2\uffff\1\55\2\uffff\6\55\2\uffff\57\55\3\uffff\2\146\4\uffff\12\55\1\u00bc\17\55\1\u00cd\15\55\1\u00db\1\u00dc\1\u00dd\1\u00de\1\u00df\1\u00e0\1\u00e1\2\55\1\u00e4\20\55\1\146\1\55\1\u00f6\5\55\1\u00fc\1\u00fd\1\u00fe\1\uffff\1\55\1\u0100\1\u0101\5\55\1\u0107\1\u0108\1\u0109\2\55\1\u010d\1\55\1\u010f\1\uffff\1\u0110\12\55\1\u011b\1\55\7\uffff\2\55\1\uffff\12\55\1\u0129\5\55\1\u012f\1\uffff\2\55\1\u0132\1\55\1\u0135\3\uffff\1\u0137\2\uffff\5\55\3\uffff\3\55\1\uffff\1\u0140\2\uffff\1\u0141\1\u0142\1\55\1\u0144\1\u0145\1\u0146\4\55\1\uffff\6\55\1\u0151\6\55\1\uffff\1\u0158\1\55\1\u015a\1\u0109\1\55\1\uffff\2\55\1\uffff\1\u015e\1\55\1\uffff\1\55\1\uffff\1\55\1\u0162\1\55\1\u015a\1\55\1\u0165\1\u0166\1\55\3\uffff\1\u0168\3\uffff\3\55\1\u016c\1\55\1\u016e\2\55\1\u0171\1\u0172\1\uffff\5\55\1\u0178\1\uffff\1\55\1\uffff\1\55\1\u017b\1\55\1\uffff\3\55\1\uffff\2\55\2\uffff\1\u0182\1\uffff\3\55\1\uffff\1\u0187\1\uffff\1\55\1\u0189\2\uffff\1\u018b\4\55\1\uffff\2\55\1\uffff\1\u0192\5\55\1\uffff\2\55\1\u019a\1\u019b\1\uffff\1\u015a\1\uffff\1\u019c\1\uffff\1\u019d\1\55\1\u019f\1\u01a0\1\u01a1\1\u015a\1\uffff\1\u01a2\1\u01a3\1\u01a4\1\u015a\1\u01a6\1\u01a7\1\55\4\uffff\1\u01a9\6\uffff\1\55\2\uffff\1\u015a\1\uffff\2\55\1\u01ad\1\uffff";
    static final String DFA22_eofS =
        "\u01ae\uffff";
    static final String DFA22_minS =
        "\1\0\1\157\1\uffff\3\141\2\uffff\1\157\3\141\1\162\1\160\1\151\1\157\1\145\2\157\1\150\1\162\1\170\1\156\1\141\1\171\1\145\1\146\1\160\1\156\1\145\1\157\1\145\1\143\1\141\2\56\1\60\1\101\1\uffff\2\0\1\52\2\uffff\1\142\2\uffff\1\155\2\154\1\163\1\143\1\163\2\uffff\1\144\1\143\1\163\1\162\1\151\1\141\1\162\1\163\1\160\1\165\1\162\1\150\1\155\1\144\1\155\1\167\1\156\3\151\2\154\2\151\1\145\1\170\1\171\1\172\1\171\1\144\1\166\1\172\1\143\1\163\1\146\1\160\1\145\1\157\2\154\1\157\1\150\1\172\1\141\2\154\1\157\3\uffff\2\56\4\uffff\1\157\1\145\1\163\1\157\2\165\1\162\1\163\1\150\1\171\1\60\1\162\1\163\1\150\1\141\1\163\1\156\1\141\3\145\1\151\1\145\1\153\1\151\1\171\1\60\1\153\1\151\1\145\1\147\2\156\2\154\1\164\1\151\1\147\1\163\1\162\7\60\1\151\1\157\1\60\1\164\1\165\1\157\1\145\1\162\1\155\1\154\1\151\1\155\2\145\1\154\2\145\1\163\1\141\1\56\1\164\1\60\1\151\1\143\1\145\1\141\1\157\3\60\1\uffff\1\157\2\60\1\155\1\156\1\155\1\141\1\155\3\60\1\156\1\162\1\60\1\164\1\60\1\uffff\1\60\1\164\1\162\3\164\1\144\2\151\1\156\1\151\1\60\1\164\7\uffff\1\165\1\154\1\uffff\1\157\1\141\2\162\1\164\1\145\1\151\1\156\1\145\1\162\1\60\1\145\1\156\1\144\1\145\1\164\1\60\1\uffff\1\157\1\151\1\60\1\154\1\60\3\uffff\1\60\2\uffff\1\145\1\164\1\141\1\162\1\145\3\uffff\1\147\2\145\1\uffff\1\60\2\uffff\2\60\1\150\3\60\1\163\1\156\1\144\1\156\1\uffff\1\151\1\163\1\165\1\162\1\154\1\164\1\60\1\151\1\164\1\163\1\144\1\164\1\145\1\uffff\1\60\1\141\2\60\1\151\1\uffff\1\156\1\164\1\uffff\1\60\1\141\1\uffff\1\141\1\uffff\1\164\1\60\1\164\1\60\1\164\2\60\1\146\3\uffff\1\60\3\uffff\1\151\1\165\1\145\1\60\1\141\1\60\1\164\1\63\2\60\1\uffff\1\141\1\162\1\151\1\145\1\162\1\60\1\uffff\1\155\1\uffff\1\156\1\60\1\171\1\uffff\2\154\1\145\1\uffff\1\151\1\145\2\uffff\1\60\1\uffff\2\157\1\162\1\uffff\1\60\1\uffff\1\145\1\60\2\uffff\1\60\1\171\1\157\1\162\1\171\1\uffff\1\145\1\147\1\uffff\1\60\2\154\1\162\1\143\1\162\1\uffff\1\156\1\165\2\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\156\4\60\1\uffff\6\60\1\163\4\uffff\1\60\6\uffff\1\141\2\uffff\1\60\1\uffff\2\154\1\60\1\uffff";
    static final String DFA22_maxS =
        "\1\uffff\1\157\1\uffff\1\141\1\151\1\145\2\uffff\1\157\1\145\1\162\1\157\1\171\1\164\1\151\4\157\1\171\1\162\1\170\1\172\1\160\1\171\1\151\1\146\1\160\1\156\1\145\1\171\1\145\1\160\1\154\2\145\1\71\1\172\1\uffff\2\uffff\1\57\2\uffff\1\142\2\uffff\1\155\1\162\1\154\3\163\2\uffff\1\170\2\163\1\162\1\151\1\141\1\162\1\163\1\160\1\165\1\162\1\150\1\156\1\170\1\156\1\167\1\156\3\151\1\156\1\154\2\151\1\145\3\172\1\171\1\144\1\166\1\172\1\143\1\163\1\146\1\160\1\145\1\157\2\154\1\157\1\150\1\172\1\141\1\170\1\154\1\157\3\uffff\2\145\4\uffff\1\157\1\145\1\163\1\157\2\165\1\162\1\163\1\150\1\171\1\172\1\162\1\163\1\150\1\145\1\163\1\156\1\141\3\145\1\151\1\145\1\153\1\151\1\171\1\172\1\153\1\151\1\145\1\147\2\156\2\154\1\164\1\151\1\147\1\163\1\162\7\172\1\151\1\157\1\172\1\164\1\165\1\157\1\145\1\162\1\155\1\154\1\151\1\155\2\145\1\154\2\145\1\163\1\141\1\145\1\164\1\172\1\151\1\143\1\145\1\141\1\157\3\172\1\uffff\1\157\2\172\1\155\1\156\1\155\1\141\1\155\3\172\1\156\1\162\1\172\1\164\1\172\1\uffff\1\172\1\164\1\162\3\164\1\144\2\151\1\156\1\151\1\172\1\164\7\uffff\1\165\1\154\1\uffff\1\157\1\141\2\162\1\164\1\145\1\151\1\156\1\145\1\162\1\172\1\145\1\156\1\144\1\145\1\164\1\172\1\uffff\1\157\1\151\1\172\1\154\1\172\3\uffff\1\172\2\uffff\1\145\1\164\1\141\1\162\1\145\3\uffff\1\147\2\145\1\uffff\1\172\2\uffff\2\172\1\150\3\172\1\163\1\156\1\144\1\156\1\uffff\1\151\1\163\1\165\1\162\1\154\1\164\1\172\1\151\1\164\1\163\1\144\1\164\1\145\1\uffff\1\172\1\141\2\172\1\151\1\uffff\1\156\1\164\1\uffff\1\172\1\141\1\uffff\1\141\1\uffff\1\164\1\172\1\164\1\172\1\164\2\172\1\146\3\uffff\1\172\3\uffff\1\151\1\165\1\145\1\172\1\141\1\172\1\164\1\63\2\172\1\uffff\1\141\1\162\1\151\1\145\1\162\1\172\1\uffff\1\155\1\uffff\1\156\1\172\1\171\1\uffff\2\154\1\145\1\uffff\1\151\1\145\2\uffff\1\172\1\uffff\2\157\1\162\1\uffff\1\172\1\uffff\1\145\1\172\2\uffff\1\172\1\171\1\157\1\162\1\171\1\uffff\1\145\1\147\1\uffff\1\172\2\154\1\162\1\143\1\162\1\uffff\1\156\1\165\2\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\156\4\172\1\uffff\6\172\1\163\4\uffff\1\172\6\uffff\1\141\2\uffff\1\172\1\uffff\2\154\1\172\1\uffff";
    static final String DFA22_acceptS =
        "\2\uffff\1\2\3\uffff\1\6\1\7\36\uffff\1\111\3\uffff\1\116\1\117\1\uffff\1\111\1\2\6\uffff\1\6\1\7\57\uffff\1\107\1\106\1\112\2\uffff\1\113\1\114\1\115\1\116\115\uffff\1\70\20\uffff\1\74\15\uffff\1\61\1\62\1\63\1\64\1\65\1\66\1\41\2\uffff\1\42\21\uffff\1\3\5\uffff\1\52\1\73\1\11\1\uffff\1\57\1\102\5\uffff\1\21\1\15\1\105\3\uffff\1\35\1\uffff\1\22\1\23\12\uffff\1\33\15\uffff\1\75\5\uffff\1\1\2\uffff\1\16\2\uffff\1\5\1\uffff\1\12\10\uffff\1\44\1\34\1\46\1\uffff\1\24\1\27\1\31\12\uffff\1\47\6\uffff\1\104\1\uffff\1\110\3\uffff\1\37\3\uffff\1\30\2\uffff\1\17\1\101\1\uffff\1\77\3\uffff\1\32\1\uffff\1\100\2\uffff\1\54\1\45\5\uffff\1\72\2\uffff\1\4\6\uffff\1\20\4\uffff\1\53\1\uffff\1\43\1\uffff\1\60\6\uffff\1\50\7\uffff\1\71\1\36\1\51\1\55\1\uffff\1\76\1\67\1\103\1\10\1\25\1\13\1\uffff\1\14\1\40\1\uffff\1\56\3\uffff\1\26";
    static final String DFA22_specialS =
        "\1\0\46\uffff\1\1\1\2\u0185\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\53\2\52\2\53\1\52\22\53\1\52\1\53\1\47\4\53\1\50\4\53\1\6\1\44\1\53\1\51\1\42\11\43\7\53\1\46\1\17\1\36\3\46\1\37\1\46\1\34\1\22\1\46\1\16\1\11\2\46\1\13\1\46\1\1\1\15\2\46\1\31\4\46\3\53\1\45\1\46\1\53\1\25\1\10\1\23\1\46\1\32\1\41\1\35\1\46\1\26\1\21\1\46\1\20\1\5\1\3\1\24\1\12\1\46\1\27\1\40\1\14\1\33\1\4\1\46\1\30\2\46\1\2\1\53\1\7\uff82\53",
            "\1\54",
            "",
            "\1\57",
            "\1\61\3\uffff\1\60\3\uffff\1\62",
            "\1\63\3\uffff\1\64",
            "",
            "",
            "\1\67",
            "\1\70\3\uffff\1\71",
            "\1\72\12\uffff\1\74\5\uffff\1\73",
            "\1\75\15\uffff\1\76",
            "\1\100\6\uffff\1\77",
            "\1\102\3\uffff\1\101",
            "\1\103",
            "\1\104",
            "\1\107\3\uffff\1\105\5\uffff\1\106",
            "\1\110",
            "\1\111",
            "\1\112\6\uffff\1\113\11\uffff\1\114",
            "\1\115",
            "\1\116",
            "\1\117\11\uffff\1\120\1\121\1\122",
            "\1\124\3\uffff\1\125\12\uffff\1\123",
            "\1\126",
            "\1\127\3\uffff\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135\11\uffff\1\136",
            "\1\137",
            "\1\142\5\uffff\1\141\6\uffff\1\140",
            "\1\144\7\uffff\1\143\2\uffff\1\145",
            "\1\147\1\uffff\12\150\13\uffff\1\147\37\uffff\1\147",
            "\1\147\1\uffff\12\151\13\uffff\1\147\37\uffff\1\147",
            "\12\152",
            "\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\0\153",
            "\0\153",
            "\1\154\4\uffff\1\155",
            "",
            "",
            "\1\157",
            "",
            "",
            "\1\160",
            "\1\162\5\uffff\1\161",
            "\1\163",
            "\1\164",
            "\1\165\17\uffff\1\166",
            "\1\167",
            "",
            "",
            "\1\170\23\uffff\1\171",
            "\1\172\17\uffff\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0087\1\u0086",
            "\1\u0088\23\uffff\1\u0089",
            "\1\u008b\1\u008a",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091\1\uffff\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097\1\u0098\1\u0099",
            "\1\u009a\1\u009b",
            "\1\u009c",
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
            "\1\u00ad\13\uffff\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "",
            "",
            "",
            "\1\147\1\uffff\12\151\13\uffff\1\147\37\uffff\1\147",
            "\1\147\1\uffff\12\u00b1\13\uffff\1\147\37\uffff\1\147",
            "",
            "",
            "",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0\3\uffff\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
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
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e2",
            "\1\u00e3",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e5",
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
            "\1\147\1\uffff\12\u00b1\13\uffff\1\147\37\uffff\1\147",
            "\1\u00f5",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00ff",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u010a",
            "\1\u010b",
            "\12\55\7\uffff\21\55\1\u010c\10\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u010e",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
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
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u0130",
            "\1\u0131",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0133",
            "\12\55\7\uffff\2\55\1\u0134\27\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "\12\55\7\uffff\2\55\1\u0136\27\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "",
            "",
            "",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0143",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0159",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u015b",
            "",
            "\1\u015c",
            "\1\u015d",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u015f",
            "",
            "\1\u0160",
            "",
            "\1\u0161",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0163",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0164",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0167",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u016d",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u016f",
            "\1\u0170",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u0179",
            "",
            "\1\u017a",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u017c",
            "",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "",
            "\1\u0180",
            "\1\u0181",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u0186\16\55",
            "",
            "\1\u0188",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u018a\16\55",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "",
            "\1\u0190",
            "\1\u0191",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "",
            "\1\u0198",
            "\1\u0199",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u019e",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\2\55\1\u01a5\27\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u01a8",
            "",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01aa",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u01ab",
            "\1\u01ac",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
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

                        else if ( (LA22_0=='t') ) {s = 12;}

                        else if ( (LA22_0=='S') ) {s = 13;}

                        else if ( (LA22_0=='L') ) {s = 14;}

                        else if ( (LA22_0=='B') ) {s = 15;}

                        else if ( (LA22_0=='l') ) {s = 16;}

                        else if ( (LA22_0=='j') ) {s = 17;}

                        else if ( (LA22_0=='J') ) {s = 18;}

                        else if ( (LA22_0=='c') ) {s = 19;}

                        else if ( (LA22_0=='o') ) {s = 20;}

                        else if ( (LA22_0=='a') ) {s = 21;}

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

                        else if ( (LA22_0=='f') ) {s = 33;}

                        else if ( (LA22_0=='0') ) {s = 34;}

                        else if ( ((LA22_0>='1' && LA22_0<='9')) ) {s = 35;}

                        else if ( (LA22_0=='-') ) {s = 36;}

                        else if ( (LA22_0=='^') ) {s = 37;}

                        else if ( (LA22_0=='A'||(LA22_0>='D' && LA22_0<='F')||LA22_0=='H'||LA22_0=='K'||(LA22_0>='N' && LA22_0<='O')||LA22_0=='Q'||(LA22_0>='T' && LA22_0<='U')||(LA22_0>='W' && LA22_0<='Z')||LA22_0=='_'||LA22_0=='d'||LA22_0=='h'||LA22_0=='k'||LA22_0=='q'||LA22_0=='w'||(LA22_0>='y' && LA22_0<='z')) ) {s = 38;}

                        else if ( (LA22_0=='\"') ) {s = 39;}

                        else if ( (LA22_0=='\'') ) {s = 40;}

                        else if ( (LA22_0=='/') ) {s = 41;}

                        else if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {s = 42;}

                        else if ( ((LA22_0>='\u0000' && LA22_0<='\b')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\u001F')||LA22_0=='!'||(LA22_0>='#' && LA22_0<='&')||(LA22_0>='(' && LA22_0<='+')||LA22_0=='.'||(LA22_0>=':' && LA22_0<='@')||(LA22_0>='[' && LA22_0<=']')||LA22_0=='`'||LA22_0=='|'||(LA22_0>='~' && LA22_0<='\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_39 = input.LA(1);

                        s = -1;
                        if ( ((LA22_39>='\u0000' && LA22_39<='\uFFFF')) ) {s = 107;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_40 = input.LA(1);

                        s = -1;
                        if ( ((LA22_40>='\u0000' && LA22_40<='\uFFFF')) ) {s = 107;}

                        else s = 43;

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