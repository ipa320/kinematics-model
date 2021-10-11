package de.fraunhofer.ipa.kinematics.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKinematicsLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__59=59;
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
    public static final int RULE_ID=6;
    public static final int RULE_DIGIT=7;
    public static final int RULE_INT=10;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_DECINT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_BOOLEAN=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_DOUBLE=4;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

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

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:11:7: ( 'AnyURI' )
            // InternalKinematics.g:11:9: 'AnyURI'
            {
            match("AnyURI"); 


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
            // InternalKinematics.g:12:7: ( 'RobotType' )
            // InternalKinematics.g:12:9: 'RobotType'
            {
            match("RobotType"); 


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
            // InternalKinematics.g:13:7: ( '{' )
            // InternalKinematics.g:13:9: '{'
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
            // InternalKinematics.g:14:7: ( 'name' )
            // InternalKinematics.g:14:9: 'name'
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
            // InternalKinematics.g:15:7: ( '}' )
            // InternalKinematics.g:15:9: '}'
            {
            match('}'); 

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
            // InternalKinematics.g:16:7: ( 'version' )
            // InternalKinematics.g:16:9: 'version'
            {
            match("version"); 


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
            // InternalKinematics.g:17:7: ( 'joint' )
            // InternalKinematics.g:17:9: 'joint'
            {
            match("joint"); 


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
            // InternalKinematics.g:18:7: ( ',' )
            // InternalKinematics.g:18:9: ','
            {
            match(','); 

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
            // InternalKinematics.g:19:7: ( 'link' )
            // InternalKinematics.g:19:9: 'link'
            {
            match("link"); 


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
            // InternalKinematics.g:20:7: ( 'material' )
            // InternalKinematics.g:20:9: 'material'
            {
            match("material"); 


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
            // InternalKinematics.g:21:7: ( 'transmission' )
            // InternalKinematics.g:21:9: 'transmission'
            {
            match("transmission"); 


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
            // InternalKinematics.g:22:7: ( 'Joint' )
            // InternalKinematics.g:22:9: 'Joint'
            {
            match("Joint"); 


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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:24:7: ( 'parent' )
            // InternalKinematics.g:24:9: 'parent'
            {
            match("parent"); 


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
            // InternalKinematics.g:25:7: ( 'child' )
            // InternalKinematics.g:25:9: 'child'
            {
            match("child"); 


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
            // InternalKinematics.g:26:7: ( 'origin' )
            // InternalKinematics.g:26:9: 'origin'
            {
            match("origin"); 


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
            // InternalKinematics.g:27:7: ( 'axis' )
            // InternalKinematics.g:27:9: 'axis'
            {
            match("axis"); 


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
            // InternalKinematics.g:28:7: ( 'calibration' )
            // InternalKinematics.g:28:9: 'calibration'
            {
            match("calibration"); 


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
            // InternalKinematics.g:29:7: ( 'dynamics' )
            // InternalKinematics.g:29:9: 'dynamics'
            {
            match("dynamics"); 


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
            // InternalKinematics.g:30:7: ( 'limit' )
            // InternalKinematics.g:30:9: 'limit'
            {
            match("limit"); 


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
            // InternalKinematics.g:31:7: ( 'safetyController' )
            // InternalKinematics.g:31:9: 'safetyController'
            {
            match("safetyController"); 


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
            // InternalKinematics.g:32:7: ( 'mimic' )
            // InternalKinematics.g:32:9: 'mimic'
            {
            match("mimic"); 


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
            // InternalKinematics.g:33:7: ( 'Link' )
            // InternalKinematics.g:33:9: 'Link'
            {
            match("Link"); 


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
            // InternalKinematics.g:34:7: ( 'inertial' )
            // InternalKinematics.g:34:9: 'inertial'
            {
            match("inertial"); 


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
            // InternalKinematics.g:35:7: ( 'visual' )
            // InternalKinematics.g:35:9: 'visual'
            {
            match("visual"); 


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
            // InternalKinematics.g:36:7: ( 'collision' )
            // InternalKinematics.g:36:9: 'collision'
            {
            match("collision"); 


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
            // InternalKinematics.g:37:7: ( 'MaterialGlobal' )
            // InternalKinematics.g:37:9: 'MaterialGlobal'
            {
            match("MaterialGlobal"); 


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
            // InternalKinematics.g:38:7: ( 'color' )
            // InternalKinematics.g:38:9: 'color'
            {
            match("color"); 


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
            // InternalKinematics.g:39:7: ( 'texture' )
            // InternalKinematics.g:39:9: 'texture'
            {
            match("texture"); 


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
            // InternalKinematics.g:40:7: ( 'Transmission' )
            // InternalKinematics.g:40:9: 'Transmission'
            {
            match("Transmission"); 


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
            // InternalKinematics.g:41:7: ( 'mechanicalReduction' )
            // InternalKinematics.g:41:9: 'mechanicalReduction'
            {
            match("mechanicalReduction"); 


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
            // InternalKinematics.g:42:7: ( 'leftActuator' )
            // InternalKinematics.g:42:9: 'leftActuator'
            {
            match("leftActuator"); 


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
            // InternalKinematics.g:43:7: ( 'rightActuator' )
            // InternalKinematics.g:43:9: 'rightActuator'
            {
            match("rightActuator"); 


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
            // InternalKinematics.g:44:7: ( 'flexJoint' )
            // InternalKinematics.g:44:9: 'flexJoint'
            {
            match("flexJoint"); 


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
            // InternalKinematics.g:45:7: ( 'rollJoint' )
            // InternalKinematics.g:45:9: 'rollJoint'
            {
            match("rollJoint"); 


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
            // InternalKinematics.g:46:7: ( 'gapJoint' )
            // InternalKinematics.g:46:9: 'gapJoint'
            {
            match("gapJoint"); 


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
            // InternalKinematics.g:47:7: ( 'passiveJoint' )
            // InternalKinematics.g:47:9: 'passiveJoint'
            {
            match("passiveJoint"); 


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
            // InternalKinematics.g:48:7: ( 'useSimulatedGripperJoint' )
            // InternalKinematics.g:48:9: 'useSimulatedGripperJoint'
            {
            match("useSimulatedGripperJoint"); 


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
            // InternalKinematics.g:49:7: ( 'actuator' )
            // InternalKinematics.g:49:9: 'actuator'
            {
            match("actuator"); 


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
            // InternalKinematics.g:50:7: ( 'Pose' )
            // InternalKinematics.g:50:9: 'Pose'
            {
            match("Pose"); 


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
            // InternalKinematics.g:51:7: ( 'rpy' )
            // InternalKinematics.g:51:9: 'rpy'
            {
            match("rpy"); 


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
            // InternalKinematics.g:52:7: ( 'xyz' )
            // InternalKinematics.g:52:9: 'xyz'
            {
            match("xyz"); 


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
            // InternalKinematics.g:53:7: ( 'Parent' )
            // InternalKinematics.g:53:9: 'Parent'
            {
            match("Parent"); 


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
            // InternalKinematics.g:54:7: ( 'Child' )
            // InternalKinematics.g:54:9: 'Child'
            {
            match("Child"); 


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
            // InternalKinematics.g:55:7: ( 'Axis' )
            // InternalKinematics.g:55:9: 'Axis'
            {
            match("Axis"); 


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
            // InternalKinematics.g:56:7: ( 'Calibration' )
            // InternalKinematics.g:56:9: 'Calibration'
            {
            match("Calibration"); 


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
            // InternalKinematics.g:57:7: ( 'falling' )
            // InternalKinematics.g:57:9: 'falling'
            {
            match("falling"); 


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
            // InternalKinematics.g:58:7: ( 'referencePosition' )
            // InternalKinematics.g:58:9: 'referencePosition'
            {
            match("referencePosition"); 


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
            // InternalKinematics.g:59:7: ( 'rising' )
            // InternalKinematics.g:59:9: 'rising'
            {
            match("rising"); 


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
            // InternalKinematics.g:60:7: ( 'Dynamics' )
            // InternalKinematics.g:60:9: 'Dynamics'
            {
            match("Dynamics"); 


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
            // InternalKinematics.g:61:7: ( 'damping' )
            // InternalKinematics.g:61:9: 'damping'
            {
            match("damping"); 


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
            // InternalKinematics.g:62:7: ( 'friction' )
            // InternalKinematics.g:62:9: 'friction'
            {
            match("friction"); 


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
            // InternalKinematics.g:63:7: ( 'Limit' )
            // InternalKinematics.g:63:9: 'Limit'
            {
            match("Limit"); 


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
            // InternalKinematics.g:64:7: ( 'effort' )
            // InternalKinematics.g:64:9: 'effort'
            {
            match("effort"); 


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
            // InternalKinematics.g:65:7: ( 'lower' )
            // InternalKinematics.g:65:9: 'lower'
            {
            match("lower"); 


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
            // InternalKinematics.g:66:7: ( 'upper' )
            // InternalKinematics.g:66:9: 'upper'
            {
            match("upper"); 


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
            // InternalKinematics.g:67:7: ( 'velocity' )
            // InternalKinematics.g:67:9: 'velocity'
            {
            match("velocity"); 


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
            // InternalKinematics.g:68:7: ( 'SafetyController' )
            // InternalKinematics.g:68:9: 'SafetyController'
            {
            match("SafetyController"); 


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
            // InternalKinematics.g:69:7: ( 'kVelocity' )
            // InternalKinematics.g:69:9: 'kVelocity'
            {
            match("kVelocity"); 


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
            // InternalKinematics.g:70:7: ( 'kPosition' )
            // InternalKinematics.g:70:9: 'kPosition'
            {
            match("kPosition"); 


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
            // InternalKinematics.g:71:7: ( 'softLowerLimit' )
            // InternalKinematics.g:71:9: 'softLowerLimit'
            {
            match("softLowerLimit"); 


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
            // InternalKinematics.g:72:7: ( 'softUpperLimit' )
            // InternalKinematics.g:72:9: 'softUpperLimit'
            {
            match("softUpperLimit"); 


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
            // InternalKinematics.g:73:7: ( 'Mimic' )
            // InternalKinematics.g:73:9: 'Mimic'
            {
            match("Mimic"); 


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
            // InternalKinematics.g:74:7: ( 'multiplier' )
            // InternalKinematics.g:74:9: 'multiplier'
            {
            match("multiplier"); 


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
            // InternalKinematics.g:75:7: ( 'offset' )
            // InternalKinematics.g:75:9: 'offset'
            {
            match("offset"); 


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
            // InternalKinematics.g:76:7: ( 'Inertial' )
            // InternalKinematics.g:76:9: 'Inertial'
            {
            match("Inertial"); 


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
            // InternalKinematics.g:77:7: ( 'mass' )
            // InternalKinematics.g:77:9: 'mass'
            {
            match("mass"); 


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
            // InternalKinematics.g:78:7: ( 'inertia' )
            // InternalKinematics.g:78:9: 'inertia'
            {
            match("inertia"); 


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
            // InternalKinematics.g:79:7: ( 'Visual' )
            // InternalKinematics.g:79:9: 'Visual'
            {
            match("Visual"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:80:7: ( 'geometry' )
            // InternalKinematics.g:80:9: 'geometry'
            {
            match("geometry"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:81:7: ( 'Collision' )
            // InternalKinematics.g:81:9: 'Collision'
            {
            match("Collision"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:82:7: ( 'verbose' )
            // InternalKinematics.g:82:9: 'verbose'
            {
            match("verbose"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:83:7: ( 'Mass' )
            // InternalKinematics.g:83:9: 'Mass'
            {
            match("Mass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:84:7: ( 'value' )
            // InternalKinematics.g:84:9: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:85:7: ( 'Inertia' )
            // InternalKinematics.g:85:9: 'Inertia'
            {
            match("Inertia"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:86:7: ( 'ixx' )
            // InternalKinematics.g:86:9: 'ixx'
            {
            match("ixx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:87:7: ( 'ixy' )
            // InternalKinematics.g:87:9: 'ixy'
            {
            match("ixy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:88:7: ( 'ixz' )
            // InternalKinematics.g:88:9: 'ixz'
            {
            match("ixz"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:89:7: ( 'iyy' )
            // InternalKinematics.g:89:9: 'iyy'
            {
            match("iyy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:90:7: ( 'iyz' )
            // InternalKinematics.g:90:9: 'iyz'
            {
            match("iyz"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:91:7: ( 'izz' )
            // InternalKinematics.g:91:9: 'izz'
            {
            match("izz"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:92:7: ( 'Geometry' )
            // InternalKinematics.g:92:9: 'Geometry'
            {
            match("Geometry"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:93:7: ( 'box' )
            // InternalKinematics.g:93:9: 'box'
            {
            match("box"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:94:7: ( 'cylinder' )
            // InternalKinematics.g:94:9: 'cylinder'
            {
            match("cylinder"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:95:7: ( 'sphere' )
            // InternalKinematics.g:95:9: 'sphere'
            {
            match("sphere"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:96:8: ( 'mesh' )
            // InternalKinematics.g:96:10: 'mesh'
            {
            match("mesh"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:97:8: ( 'Material' )
            // InternalKinematics.g:97:10: 'Material'
            {
            match("Material"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:98:8: ( 'Box' )
            // InternalKinematics.g:98:10: 'Box'
            {
            match("Box"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:99:8: ( 'size' )
            // InternalKinematics.g:99:10: 'size'
            {
            match("size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:100:8: ( 'Cylinder' )
            // InternalKinematics.g:100:10: 'Cylinder'
            {
            match("Cylinder"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:101:8: ( 'length' )
            // InternalKinematics.g:101:10: 'length'
            {
            match("length"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:102:8: ( 'radius' )
            // InternalKinematics.g:102:10: 'radius'
            {
            match("radius"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:103:8: ( 'Sphere' )
            // InternalKinematics.g:103:10: 'Sphere'
            {
            match("Sphere"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:104:8: ( 'Mesh' )
            // InternalKinematics.g:104:10: 'Mesh'
            {
            match("Mesh"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:105:8: ( 'filename' )
            // InternalKinematics.g:105:10: 'filename'
            {
            match("filename"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:106:8: ( 'scale' )
            // InternalKinematics.g:106:10: 'scale'
            {
            match("scale"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:107:8: ( 'Color' )
            // InternalKinematics.g:107:10: 'Color'
            {
            match("Color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:108:8: ( 'rgba' )
            // InternalKinematics.g:108:10: 'rgba'
            {
            match("rgba"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:109:8: ( 'Texture' )
            // InternalKinematics.g:109:10: 'Texture'
            {
            match("Texture"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:110:8: ( 'Verbose' )
            // InternalKinematics.g:110:10: 'Verbose'
            {
            match("Verbose"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:111:8: ( 'ActuatorTransmission' )
            // InternalKinematics.g:111:10: 'ActuatorTransmission'
            {
            match("ActuatorTransmission"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:112:8: ( 'GapJointTransmission' )
            // InternalKinematics.g:112:10: 'GapJointTransmission'
            {
            match("GapJointTransmission"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:113:8: ( 'a' )
            // InternalKinematics.g:113:10: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:114:8: ( 'b' )
            // InternalKinematics.g:114:10: 'b'
            {
            match('b'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:115:8: ( 'gearRatio' )
            // InternalKinematics.g:115:10: 'gearRatio'
            {
            match("gearRatio"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:116:8: ( 'h' )
            // InternalKinematics.g:116:10: 'h'
            {
            match('h'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:117:8: ( 'l0' )
            // InternalKinematics.g:117:10: 'l0'
            {
            match("l0"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:118:8: ( 'phi0' )
            // InternalKinematics.g:118:10: 'phi0'
            {
            match("phi0"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:119:8: ( 'r' )
            // InternalKinematics.g:119:10: 'r'
            {
            match('r'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:120:8: ( 'screwReduction' )
            // InternalKinematics.g:120:10: 'screwReduction'
            {
            match("screwReduction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:121:8: ( 't0' )
            // InternalKinematics.g:121:10: 't0'
            {
            match("t0"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:122:8: ( 'theta0' )
            // InternalKinematics.g:122:10: 'theta0'
            {
            match("theta0"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:123:8: ( 'PassiveJointTransmission' )
            // InternalKinematics.g:123:10: 'PassiveJointTransmission'
            {
            match("PassiveJointTransmission"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:124:8: ( 'UseSimulatedGripperJointType' )
            // InternalKinematics.g:124:10: 'UseSimulatedGripperJointType'
            {
            match("UseSimulatedGripperJointType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:125:8: ( 'Name' )
            // InternalKinematics.g:125:10: 'Name'
            {
            match("Name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalKinematics.g:15478:21: ( '0' .. '9' )
            // InternalKinematics.g:15478:23: '0' .. '9'
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
            // InternalKinematics.g:15480:14: ( ( 'true' | 'false' ) )
            // InternalKinematics.g:15480:16: ( 'true' | 'false' )
            {
            // InternalKinematics.g:15480:16: ( 'true' | 'false' )
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
                    // InternalKinematics.g:15480:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalKinematics.g:15480:24: 'false'
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
            // InternalKinematics.g:15482:13: ( RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT ) )
            // InternalKinematics.g:15482:15: RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )
            {
            mRULE_DECINT(); 
            // InternalKinematics.g:15482:27: ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalKinematics.g:15482:28: '.' ( RULE_DIGIT )*
                    {
                    match('.'); 
                    // InternalKinematics.g:15482:32: ( RULE_DIGIT )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalKinematics.g:15482:32: RULE_DIGIT
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
                    // InternalKinematics.g:15482:44: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT
                    {
                    // InternalKinematics.g:15482:44: ( '.' ( RULE_DIGIT )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='.') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalKinematics.g:15482:45: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalKinematics.g:15482:49: ( RULE_DIGIT )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalKinematics.g:15482:49: RULE_DIGIT
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

                    // InternalKinematics.g:15482:73: ( '-' | '+' )?
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
            // InternalKinematics.g:15484:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalKinematics.g:15484:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalKinematics.g:15484:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
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
                    // InternalKinematics.g:15484:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalKinematics.g:15484:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalKinematics.g:15484:29: ( RULE_DIGIT )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalKinematics.g:15484:29: RULE_DIGIT
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
                    // InternalKinematics.g:15484:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    matchRange('0','9'); 
                    // InternalKinematics.g:15484:54: ( RULE_DIGIT )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalKinematics.g:15484:54: RULE_DIGIT
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematics.g:15486:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKinematics.g:15486:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalKinematics.g:15486:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalKinematics.g:15486:11: '^'
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

            // InternalKinematics.g:15486:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
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
            	    break loop11;
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
            // InternalKinematics.g:15488:10: ( ( '0' .. '9' )+ )
            // InternalKinematics.g:15488:12: ( '0' .. '9' )+
            {
            // InternalKinematics.g:15488:12: ( '0' .. '9' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKinematics.g:15488:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // InternalKinematics.g:15490:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalKinematics.g:15490:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalKinematics.g:15490:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\"') ) {
                alt15=1;
            }
            else if ( (LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalKinematics.g:15490:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalKinematics.g:15490:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalKinematics.g:15490:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKinematics.g:15490:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop13;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalKinematics.g:15490:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalKinematics.g:15490:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalKinematics.g:15490:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKinematics.g:15490:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop14;
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
            // InternalKinematics.g:15492:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalKinematics.g:15492:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalKinematics.g:15492:24: ( options {greedy=false; } : . )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='*') ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1=='/') ) {
                        alt16=2;
                    }
                    else if ( ((LA16_1>='\u0000' && LA16_1<='.')||(LA16_1>='0' && LA16_1<='\uFFFF')) ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0>='\u0000' && LA16_0<=')')||(LA16_0>='+' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKinematics.g:15492:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop16;
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
            // InternalKinematics.g:15494:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKinematics.g:15494:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalKinematics.g:15494:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKinematics.g:15494:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalKinematics.g:15494:40: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalKinematics.g:15494:41: ( '\\r' )? '\\n'
                    {
                    // InternalKinematics.g:15494:41: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalKinematics.g:15494:41: '\\r'
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
            // InternalKinematics.g:15496:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKinematics.g:15496:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKinematics.g:15496:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
            // InternalKinematics.g:15498:16: ( . )
            // InternalKinematics.g:15498:18: .
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
        // InternalKinematics.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=125;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // InternalKinematics.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalKinematics.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalKinematics.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalKinematics.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalKinematics.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalKinematics.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalKinematics.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalKinematics.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalKinematics.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalKinematics.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalKinematics.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalKinematics.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalKinematics.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalKinematics.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalKinematics.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalKinematics.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalKinematics.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalKinematics.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalKinematics.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalKinematics.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // InternalKinematics.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // InternalKinematics.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // InternalKinematics.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // InternalKinematics.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // InternalKinematics.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // InternalKinematics.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // InternalKinematics.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // InternalKinematics.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // InternalKinematics.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // InternalKinematics.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // InternalKinematics.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // InternalKinematics.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // InternalKinematics.g:1:202: T__47
                {
                mT__47(); 

                }
                break;
            case 34 :
                // InternalKinematics.g:1:208: T__48
                {
                mT__48(); 

                }
                break;
            case 35 :
                // InternalKinematics.g:1:214: T__49
                {
                mT__49(); 

                }
                break;
            case 36 :
                // InternalKinematics.g:1:220: T__50
                {
                mT__50(); 

                }
                break;
            case 37 :
                // InternalKinematics.g:1:226: T__51
                {
                mT__51(); 

                }
                break;
            case 38 :
                // InternalKinematics.g:1:232: T__52
                {
                mT__52(); 

                }
                break;
            case 39 :
                // InternalKinematics.g:1:238: T__53
                {
                mT__53(); 

                }
                break;
            case 40 :
                // InternalKinematics.g:1:244: T__54
                {
                mT__54(); 

                }
                break;
            case 41 :
                // InternalKinematics.g:1:250: T__55
                {
                mT__55(); 

                }
                break;
            case 42 :
                // InternalKinematics.g:1:256: T__56
                {
                mT__56(); 

                }
                break;
            case 43 :
                // InternalKinematics.g:1:262: T__57
                {
                mT__57(); 

                }
                break;
            case 44 :
                // InternalKinematics.g:1:268: T__58
                {
                mT__58(); 

                }
                break;
            case 45 :
                // InternalKinematics.g:1:274: T__59
                {
                mT__59(); 

                }
                break;
            case 46 :
                // InternalKinematics.g:1:280: T__60
                {
                mT__60(); 

                }
                break;
            case 47 :
                // InternalKinematics.g:1:286: T__61
                {
                mT__61(); 

                }
                break;
            case 48 :
                // InternalKinematics.g:1:292: T__62
                {
                mT__62(); 

                }
                break;
            case 49 :
                // InternalKinematics.g:1:298: T__63
                {
                mT__63(); 

                }
                break;
            case 50 :
                // InternalKinematics.g:1:304: T__64
                {
                mT__64(); 

                }
                break;
            case 51 :
                // InternalKinematics.g:1:310: T__65
                {
                mT__65(); 

                }
                break;
            case 52 :
                // InternalKinematics.g:1:316: T__66
                {
                mT__66(); 

                }
                break;
            case 53 :
                // InternalKinematics.g:1:322: T__67
                {
                mT__67(); 

                }
                break;
            case 54 :
                // InternalKinematics.g:1:328: T__68
                {
                mT__68(); 

                }
                break;
            case 55 :
                // InternalKinematics.g:1:334: T__69
                {
                mT__69(); 

                }
                break;
            case 56 :
                // InternalKinematics.g:1:340: T__70
                {
                mT__70(); 

                }
                break;
            case 57 :
                // InternalKinematics.g:1:346: T__71
                {
                mT__71(); 

                }
                break;
            case 58 :
                // InternalKinematics.g:1:352: T__72
                {
                mT__72(); 

                }
                break;
            case 59 :
                // InternalKinematics.g:1:358: T__73
                {
                mT__73(); 

                }
                break;
            case 60 :
                // InternalKinematics.g:1:364: T__74
                {
                mT__74(); 

                }
                break;
            case 61 :
                // InternalKinematics.g:1:370: T__75
                {
                mT__75(); 

                }
                break;
            case 62 :
                // InternalKinematics.g:1:376: T__76
                {
                mT__76(); 

                }
                break;
            case 63 :
                // InternalKinematics.g:1:382: T__77
                {
                mT__77(); 

                }
                break;
            case 64 :
                // InternalKinematics.g:1:388: T__78
                {
                mT__78(); 

                }
                break;
            case 65 :
                // InternalKinematics.g:1:394: T__79
                {
                mT__79(); 

                }
                break;
            case 66 :
                // InternalKinematics.g:1:400: T__80
                {
                mT__80(); 

                }
                break;
            case 67 :
                // InternalKinematics.g:1:406: T__81
                {
                mT__81(); 

                }
                break;
            case 68 :
                // InternalKinematics.g:1:412: T__82
                {
                mT__82(); 

                }
                break;
            case 69 :
                // InternalKinematics.g:1:418: T__83
                {
                mT__83(); 

                }
                break;
            case 70 :
                // InternalKinematics.g:1:424: T__84
                {
                mT__84(); 

                }
                break;
            case 71 :
                // InternalKinematics.g:1:430: T__85
                {
                mT__85(); 

                }
                break;
            case 72 :
                // InternalKinematics.g:1:436: T__86
                {
                mT__86(); 

                }
                break;
            case 73 :
                // InternalKinematics.g:1:442: T__87
                {
                mT__87(); 

                }
                break;
            case 74 :
                // InternalKinematics.g:1:448: T__88
                {
                mT__88(); 

                }
                break;
            case 75 :
                // InternalKinematics.g:1:454: T__89
                {
                mT__89(); 

                }
                break;
            case 76 :
                // InternalKinematics.g:1:460: T__90
                {
                mT__90(); 

                }
                break;
            case 77 :
                // InternalKinematics.g:1:466: T__91
                {
                mT__91(); 

                }
                break;
            case 78 :
                // InternalKinematics.g:1:472: T__92
                {
                mT__92(); 

                }
                break;
            case 79 :
                // InternalKinematics.g:1:478: T__93
                {
                mT__93(); 

                }
                break;
            case 80 :
                // InternalKinematics.g:1:484: T__94
                {
                mT__94(); 

                }
                break;
            case 81 :
                // InternalKinematics.g:1:490: T__95
                {
                mT__95(); 

                }
                break;
            case 82 :
                // InternalKinematics.g:1:496: T__96
                {
                mT__96(); 

                }
                break;
            case 83 :
                // InternalKinematics.g:1:502: T__97
                {
                mT__97(); 

                }
                break;
            case 84 :
                // InternalKinematics.g:1:508: T__98
                {
                mT__98(); 

                }
                break;
            case 85 :
                // InternalKinematics.g:1:514: T__99
                {
                mT__99(); 

                }
                break;
            case 86 :
                // InternalKinematics.g:1:520: T__100
                {
                mT__100(); 

                }
                break;
            case 87 :
                // InternalKinematics.g:1:527: T__101
                {
                mT__101(); 

                }
                break;
            case 88 :
                // InternalKinematics.g:1:534: T__102
                {
                mT__102(); 

                }
                break;
            case 89 :
                // InternalKinematics.g:1:541: T__103
                {
                mT__103(); 

                }
                break;
            case 90 :
                // InternalKinematics.g:1:548: T__104
                {
                mT__104(); 

                }
                break;
            case 91 :
                // InternalKinematics.g:1:555: T__105
                {
                mT__105(); 

                }
                break;
            case 92 :
                // InternalKinematics.g:1:562: T__106
                {
                mT__106(); 

                }
                break;
            case 93 :
                // InternalKinematics.g:1:569: T__107
                {
                mT__107(); 

                }
                break;
            case 94 :
                // InternalKinematics.g:1:576: T__108
                {
                mT__108(); 

                }
                break;
            case 95 :
                // InternalKinematics.g:1:583: T__109
                {
                mT__109(); 

                }
                break;
            case 96 :
                // InternalKinematics.g:1:590: T__110
                {
                mT__110(); 

                }
                break;
            case 97 :
                // InternalKinematics.g:1:597: T__111
                {
                mT__111(); 

                }
                break;
            case 98 :
                // InternalKinematics.g:1:604: T__112
                {
                mT__112(); 

                }
                break;
            case 99 :
                // InternalKinematics.g:1:611: T__113
                {
                mT__113(); 

                }
                break;
            case 100 :
                // InternalKinematics.g:1:618: T__114
                {
                mT__114(); 

                }
                break;
            case 101 :
                // InternalKinematics.g:1:625: T__115
                {
                mT__115(); 

                }
                break;
            case 102 :
                // InternalKinematics.g:1:632: T__116
                {
                mT__116(); 

                }
                break;
            case 103 :
                // InternalKinematics.g:1:639: T__117
                {
                mT__117(); 

                }
                break;
            case 104 :
                // InternalKinematics.g:1:646: T__118
                {
                mT__118(); 

                }
                break;
            case 105 :
                // InternalKinematics.g:1:653: T__119
                {
                mT__119(); 

                }
                break;
            case 106 :
                // InternalKinematics.g:1:660: T__120
                {
                mT__120(); 

                }
                break;
            case 107 :
                // InternalKinematics.g:1:667: T__121
                {
                mT__121(); 

                }
                break;
            case 108 :
                // InternalKinematics.g:1:674: T__122
                {
                mT__122(); 

                }
                break;
            case 109 :
                // InternalKinematics.g:1:681: T__123
                {
                mT__123(); 

                }
                break;
            case 110 :
                // InternalKinematics.g:1:688: T__124
                {
                mT__124(); 

                }
                break;
            case 111 :
                // InternalKinematics.g:1:695: T__125
                {
                mT__125(); 

                }
                break;
            case 112 :
                // InternalKinematics.g:1:702: T__126
                {
                mT__126(); 

                }
                break;
            case 113 :
                // InternalKinematics.g:1:709: T__127
                {
                mT__127(); 

                }
                break;
            case 114 :
                // InternalKinematics.g:1:716: T__128
                {
                mT__128(); 

                }
                break;
            case 115 :
                // InternalKinematics.g:1:723: T__129
                {
                mT__129(); 

                }
                break;
            case 116 :
                // InternalKinematics.g:1:730: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 117 :
                // InternalKinematics.g:1:743: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 118 :
                // InternalKinematics.g:1:755: RULE_DECINT
                {
                mRULE_DECINT(); 

                }
                break;
            case 119 :
                // InternalKinematics.g:1:767: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 120 :
                // InternalKinematics.g:1:775: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 121 :
                // InternalKinematics.g:1:784: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 122 :
                // InternalKinematics.g:1:796: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 123 :
                // InternalKinematics.g:1:812: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 124 :
                // InternalKinematics.g:1:828: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 125 :
                // InternalKinematics.g:1:836: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA21 dfa21 = new DFA21(this);
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
            return "15482:27: ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )";
        }
    }
    static final String DFA21_eotS =
        "\1\uffff\2\67\1\uffff\1\67\1\uffff\2\67\1\uffff\7\67\1\131\6\67\1\161\15\67\1\u008d\1\67\1\u008f\2\67\2\u0092\2\63\1\uffff\3\63\2\uffff\3\67\1\uffff\1\67\1\uffff\1\67\1\uffff\4\67\1\uffff\3\67\1\u00aa\7\67\1\u00b5\14\67\1\uffff\27\67\1\uffff\33\67\1\uffff\1\67\1\uffff\2\67\3\uffff\2\u0092\4\uffff\17\67\1\uffff\12\67\1\uffff\30\67\1\u0135\1\u0136\1\u0137\1\u0138\1\u0139\1\u013a\11\67\1\u0144\17\67\1\u0155\17\67\1\u0166\1\u0167\2\67\1\u0092\1\67\1\u016b\2\67\1\u016e\6\67\1\u0175\5\67\1\u017b\2\67\1\u017e\2\67\1\u0181\1\u0182\5\67\1\u0188\7\67\1\u0190\6\67\1\u0198\2\67\1\u019b\2\67\6\uffff\1\67\1\u019f\1\67\1\u01a1\5\67\1\uffff\2\67\1\u01a9\12\67\1\u01b4\2\67\1\uffff\20\67\2\uffff\1\67\1\u01c8\1\67\1\uffff\2\67\1\uffff\4\67\1\u01d0\1\u01d1\1\uffff\1\u01d2\2\67\1\u01d5\1\67\1\uffff\1\u01d7\1\67\1\uffff\2\67\2\uffff\2\67\1\u01dd\2\67\1\uffff\1\u01e0\2\67\1\u01e3\3\67\1\uffff\7\67\1\uffff\1\u01ee\1\67\1\uffff\1\u01f0\2\67\1\uffff\1\u01f3\1\uffff\7\67\1\uffff\2\67\1\u0181\6\67\1\u0203\1\uffff\2\67\1\u0206\2\67\1\u0209\15\67\1\uffff\1\u0217\5\67\1\u021d\3\uffff\1\67\1\u021f\1\uffff\1\67\1\uffff\4\67\1\u0225\1\uffff\1\u0226\1\67\1\uffff\2\67\1\uffff\1\67\1\u022b\1\u022c\6\67\1\u0233\1\uffff\1\67\1\uffff\2\67\1\uffff\3\67\1\u023a\2\67\1\u023d\10\67\1\uffff\1\u0246\1\67\1\uffff\2\67\1\uffff\2\67\1\u024c\1\67\1\u024e\3\67\1\u0252\4\67\1\uffff\2\67\1\u0259\1\u025a\1\67\1\uffff\1\67\1\uffff\4\67\1\u0261\2\uffff\4\67\2\uffff\2\67\1\u0268\3\67\1\uffff\1\67\1\u026e\2\67\1\u0271\1\67\1\uffff\2\67\1\uffff\1\67\1\u0276\6\67\1\uffff\5\67\1\uffff\1\67\1\uffff\2\67\1\u0286\1\uffff\1\u0287\5\67\2\uffff\1\u028d\1\67\1\u028f\3\67\1\uffff\3\67\1\u0296\1\u0297\1\u0298\1\uffff\4\67\1\u029d\1\uffff\1\u029f\1\67\1\uffff\4\67\1\uffff\1\u02a5\1\u02a6\1\u02a7\1\u02a8\5\67\1\u02ae\1\u02af\3\67\1\u02b3\2\uffff\1\u02b4\3\67\1\u02b8\1\uffff\1\67\1\uffff\5\67\1\u02bf\3\uffff\4\67\1\uffff\1\67\1\uffff\2\67\1\u02c7\1\67\1\u02c9\4\uffff\1\u02ca\3\67\1\u02ce\2\uffff\1\67\1\u02d0\1\u02d1\2\uffff\3\67\1\uffff\2\67\1\u02d7\3\67\1\uffff\7\67\1\uffff\1\67\2\uffff\3\67\1\uffff\1\67\2\uffff\5\67\1\uffff\2\67\1\u02ee\12\67\1\u02f9\4\67\1\u02fe\1\67\1\u0300\1\u0301\1\uffff\5\67\1\u0307\4\67\1\uffff\4\67\1\uffff\1\67\2\uffff\5\67\1\uffff\1\u0316\11\67\1\u0320\1\u0321\1\u0322\1\u0323\1\uffff\11\67\4\uffff\10\67\1\u0335\3\67\1\u0339\4\67\1\uffff\1\u033e\2\67\1\uffff\4\67\1\uffff\5\67\1\u034a\4\67\1\u034f\1\uffff\2\67\1\u0352\1\67\1\uffff\2\67\1\uffff\7\67\1\u035d\1\u035e\1\67\2\uffff\3\67\1\u0363\1\uffff";
    static final String DFA21_eofS =
        "\u0364\uffff";
    static final String DFA21_minS =
        "\1\0\1\143\1\157\1\uffff\1\141\1\uffff\1\141\1\157\1\uffff\1\60\1\141\1\60\1\157\2\141\1\146\1\60\2\141\1\151\1\156\1\141\1\145\1\60\2\141\1\160\1\141\1\171\1\141\1\171\1\146\1\141\1\120\1\156\1\145\1\141\1\60\1\157\1\60\1\163\1\141\2\56\1\60\1\101\1\uffff\2\0\1\52\2\uffff\1\171\1\151\1\164\1\uffff\1\142\1\uffff\1\155\1\uffff\1\154\1\163\1\154\1\151\1\uffff\1\155\1\146\1\167\1\60\1\163\1\155\1\143\1\154\1\141\1\160\1\170\1\60\1\145\1\151\1\162\2\151\3\154\1\151\1\146\1\151\1\164\1\uffff\1\156\1\155\2\146\1\150\1\172\1\141\1\155\1\145\1\170\1\171\1\172\1\163\1\155\1\163\1\141\1\170\1\147\1\154\1\171\1\146\1\144\1\142\1\uffff\1\145\1\154\1\151\1\154\1\160\1\141\1\145\1\160\1\163\1\162\1\172\1\151\3\154\1\156\2\146\1\150\1\145\1\157\1\145\1\163\1\162\1\157\1\160\1\170\1\uffff\1\170\1\uffff\1\145\1\155\3\uffff\2\56\4\uffff\1\125\1\163\1\165\1\157\1\145\1\142\1\157\2\165\1\156\1\153\1\151\1\164\1\147\1\145\1\uffff\1\145\1\163\1\151\2\150\1\164\1\156\2\145\1\164\1\uffff\1\164\1\156\1\145\1\163\1\60\1\154\1\151\1\154\1\151\1\147\2\163\1\165\1\141\1\160\1\145\1\164\2\145\1\154\1\145\1\153\1\151\1\162\6\60\1\145\1\163\1\151\1\150\1\156\1\164\1\150\1\151\1\154\1\60\1\145\1\151\1\141\1\170\1\154\1\143\1\145\1\112\1\155\1\162\1\123\3\145\1\163\1\60\1\154\1\151\1\154\1\151\1\141\1\157\2\145\1\154\1\163\1\162\1\165\1\142\1\155\1\112\2\60\1\123\1\145\1\56\1\122\1\60\1\141\1\164\1\60\1\151\1\157\1\143\1\141\1\145\1\164\1\60\1\164\1\101\1\164\2\162\1\60\1\143\1\141\1\60\1\151\1\163\2\60\1\165\1\141\1\164\1\156\1\151\1\60\1\144\1\142\1\151\1\162\1\156\1\151\1\145\1\60\1\141\1\155\1\151\1\164\1\114\1\162\1\60\1\145\1\167\1\60\2\164\6\uffff\1\162\1\60\1\143\1\60\1\163\1\165\1\164\1\156\1\112\1\uffff\1\162\1\165\1\60\1\112\1\151\1\145\1\164\1\156\1\157\1\145\1\122\1\151\1\162\1\60\1\156\1\151\1\uffff\1\144\1\142\1\151\1\162\1\156\1\155\1\162\1\164\1\162\1\157\1\151\1\164\1\141\1\157\1\145\1\157\2\uffff\1\151\1\60\1\111\1\uffff\1\164\1\124\1\uffff\1\157\1\163\1\151\1\154\2\60\1\uffff\1\60\1\143\1\150\1\60\1\151\1\uffff\1\60\1\156\1\uffff\1\160\1\155\2\uffff\1\162\2\60\1\164\1\166\1\uffff\1\60\1\162\1\163\1\60\1\144\1\156\1\164\1\uffff\1\164\1\151\1\156\1\171\1\157\1\160\1\145\1\uffff\1\60\1\122\1\uffff\1\60\2\151\1\uffff\1\60\1\uffff\1\155\1\162\1\101\1\147\1\157\1\145\1\163\1\uffff\1\157\1\156\1\60\1\151\1\141\1\151\1\164\1\141\1\155\1\60\1\uffff\1\164\1\166\1\60\1\162\1\163\1\60\1\144\1\151\1\164\1\171\1\145\1\143\1\164\1\151\1\154\1\163\1\164\1\151\1\155\1\uffff\1\60\1\157\1\171\1\156\1\145\1\164\1\60\3\uffff\1\164\1\60\1\uffff\1\141\1\uffff\1\151\1\154\1\151\1\145\1\60\1\uffff\1\60\1\145\1\uffff\1\141\1\151\1\uffff\1\145\2\60\1\157\1\143\1\147\1\103\1\167\1\160\1\60\1\uffff\1\145\1\uffff\2\141\1\uffff\1\151\1\145\1\143\1\60\1\151\1\156\1\60\1\151\1\147\1\157\1\155\1\156\1\162\1\164\1\165\1\uffff\1\60\1\145\1\uffff\1\141\1\151\1\uffff\1\145\1\143\1\60\1\103\1\60\2\151\1\141\1\60\1\145\1\162\1\156\1\165\1\uffff\1\162\1\160\2\60\1\171\1\uffff\1\165\1\uffff\1\154\1\143\1\151\1\163\1\60\2\uffff\1\112\1\164\1\157\1\162\2\uffff\1\162\1\163\1\60\1\157\2\145\1\uffff\1\144\1\60\1\154\1\163\1\60\1\164\1\uffff\1\156\1\143\1\uffff\1\156\1\60\1\156\1\145\1\164\1\171\1\151\1\154\1\uffff\1\112\1\164\1\157\1\162\1\163\1\uffff\1\157\1\uffff\1\164\1\157\1\60\1\uffff\1\60\1\171\1\164\1\154\1\124\1\145\2\uffff\1\60\1\141\1\60\1\141\1\145\1\163\1\uffff\1\157\1\151\1\156\3\60\1\uffff\1\156\2\162\1\165\1\60\1\uffff\1\60\1\163\1\uffff\1\165\1\164\1\145\1\164\1\uffff\4\60\1\157\1\141\1\157\1\151\1\156\2\60\1\156\1\171\1\156\1\60\2\uffff\1\60\1\124\1\141\1\162\1\60\1\uffff\1\164\1\uffff\1\154\1\162\2\151\1\157\1\60\3\uffff\1\164\2\114\1\143\1\uffff\1\154\1\uffff\1\151\1\141\1\60\1\120\1\60\4\uffff\1\60\1\164\1\151\1\157\1\60\2\uffff\1\164\2\60\2\uffff\1\162\1\164\1\141\1\uffff\1\157\1\122\1\60\1\157\2\156\1\uffff\1\162\2\151\1\164\2\157\1\164\1\uffff\1\157\2\uffff\1\145\2\156\1\uffff\1\162\2\uffff\1\141\1\145\1\156\1\162\1\145\1\uffff\1\156\1\164\1\60\1\157\2\155\1\151\1\142\1\156\1\157\1\163\1\144\1\164\1\60\1\157\1\156\1\144\1\163\1\60\1\144\2\60\1\uffff\1\154\2\151\1\157\1\141\1\60\1\162\1\151\1\107\1\124\1\uffff\1\154\1\163\1\107\1\155\1\uffff\1\165\2\uffff\1\154\2\164\1\156\1\154\1\uffff\1\60\1\164\2\162\1\154\1\155\1\162\1\151\1\143\1\145\4\60\1\uffff\2\151\1\141\1\145\2\151\1\163\1\164\1\162\4\uffff\1\157\1\160\1\156\1\162\1\163\1\160\1\163\1\151\1\60\1\156\1\160\1\163\1\60\1\163\1\160\1\151\1\157\1\uffff\1\60\1\145\1\155\1\uffff\1\151\1\145\1\157\1\156\1\uffff\1\162\1\151\1\157\1\162\1\156\1\60\1\112\1\163\1\156\1\112\1\60\1\uffff\1\157\1\163\1\60\1\157\1\uffff\2\151\1\uffff\1\151\1\156\1\157\1\156\1\164\1\156\1\164\2\60\1\124\2\uffff\1\171\1\160\1\145\1\60\1\uffff";
    static final String DFA21_maxS =
        "\1\uffff\1\170\1\157\1\uffff\1\141\1\uffff\1\151\1\157\1\uffff\1\157\1\165\1\171\1\157\1\150\1\171\1\162\1\172\1\171\1\160\1\151\1\172\1\151\1\162\1\172\1\162\1\145\1\163\1\157\3\171\1\146\1\160\1\126\1\156\1\151\1\145\1\172\1\157\1\172\1\163\1\141\2\145\1\71\1\172\1\uffff\2\uffff\1\57\2\uffff\1\171\1\151\1\164\1\uffff\1\142\1\uffff\1\155\1\uffff\1\162\1\163\1\154\1\151\1\uffff\2\156\1\167\1\172\1\164\1\155\1\163\1\154\1\165\1\160\1\170\1\172\1\145\1\151\1\163\2\151\3\154\1\151\1\146\1\151\1\164\1\uffff\1\156\1\155\2\146\1\150\1\172\1\162\1\156\1\145\3\172\1\164\1\155\1\163\1\141\1\170\1\163\1\154\1\171\1\146\1\144\1\142\1\uffff\1\145\1\154\1\151\1\154\1\160\1\157\1\145\1\160\2\163\1\172\1\151\3\154\1\156\2\146\1\150\1\145\1\157\1\145\1\163\1\162\1\157\1\160\1\170\1\uffff\1\170\1\uffff\1\145\1\155\3\uffff\2\145\4\uffff\1\125\1\163\1\165\1\157\1\145\1\163\1\157\2\165\1\156\1\153\1\151\1\164\1\147\1\145\1\uffff\1\145\1\163\1\151\2\150\1\164\1\156\2\145\1\164\1\uffff\1\164\1\156\1\145\1\163\1\60\1\154\1\151\1\157\1\151\1\147\2\163\1\165\1\141\1\160\1\145\1\164\2\145\1\154\1\145\1\153\1\151\1\162\6\172\1\145\1\163\1\151\1\150\1\156\1\164\1\150\1\151\1\154\1\172\1\145\1\151\1\141\1\170\1\163\1\143\1\145\1\112\1\155\1\162\1\123\3\145\1\163\1\172\1\154\1\151\1\157\1\151\1\141\1\157\2\145\1\154\1\163\1\162\1\165\1\142\1\155\1\112\2\172\1\123\2\145\1\122\1\172\1\141\1\164\1\172\1\151\1\157\1\143\1\141\1\145\1\164\1\172\1\164\1\101\1\164\2\162\1\172\1\143\1\141\1\172\1\151\1\163\2\172\1\165\1\141\1\164\1\156\1\151\1\172\1\144\1\142\1\151\1\162\1\156\1\151\1\145\1\172\1\141\1\155\1\151\1\164\1\125\1\162\1\172\1\145\1\167\1\172\2\164\6\uffff\1\162\1\172\1\143\1\172\1\163\1\165\1\164\1\156\1\112\1\uffff\1\162\1\165\1\172\1\112\1\151\1\145\1\164\1\156\1\157\1\145\1\122\1\151\1\162\1\172\1\156\1\151\1\uffff\1\144\1\142\1\151\1\162\1\156\1\155\1\162\1\164\1\162\1\157\1\151\1\164\1\141\1\157\1\145\1\157\2\uffff\1\151\1\172\1\111\1\uffff\1\164\1\124\1\uffff\1\157\1\163\1\151\1\154\2\172\1\uffff\1\172\1\143\1\150\1\172\1\151\1\uffff\1\172\1\156\1\uffff\1\160\1\155\2\uffff\1\162\1\60\1\172\1\164\1\166\1\uffff\1\172\1\162\1\163\1\172\1\144\1\156\1\164\1\uffff\1\164\1\151\1\156\1\171\1\157\1\160\1\145\1\uffff\1\172\1\122\1\uffff\1\172\2\151\1\uffff\1\172\1\uffff\1\155\1\162\1\101\1\147\1\157\1\145\1\163\1\uffff\1\157\1\156\1\172\1\151\1\141\1\151\1\164\1\141\1\155\1\172\1\uffff\1\164\1\166\1\172\1\162\1\163\1\172\1\144\1\151\1\164\1\171\1\145\1\143\1\164\1\151\1\154\1\163\1\164\1\151\1\155\1\uffff\1\172\1\157\1\171\1\156\1\145\1\164\1\172\3\uffff\1\164\1\172\1\uffff\1\141\1\uffff\1\151\1\154\1\151\1\145\1\172\1\uffff\1\172\1\145\1\uffff\1\141\1\151\1\uffff\1\145\2\172\1\157\1\143\1\147\1\103\1\167\1\160\1\172\1\uffff\1\145\1\uffff\2\141\1\uffff\1\151\1\145\1\143\1\172\1\151\1\156\1\172\1\151\1\147\1\157\1\155\1\156\1\162\1\164\1\165\1\uffff\1\172\1\145\1\uffff\1\141\1\151\1\uffff\1\145\1\143\1\172\1\103\1\172\2\151\1\141\1\172\1\145\1\162\1\156\1\165\1\uffff\1\162\1\160\2\172\1\171\1\uffff\1\165\1\uffff\1\154\1\143\1\151\1\163\1\172\2\uffff\1\112\1\164\1\157\1\162\2\uffff\1\162\1\163\1\172\1\157\2\145\1\uffff\1\144\1\172\1\154\1\163\1\172\1\164\1\uffff\1\156\1\143\1\uffff\1\156\1\172\1\156\1\145\1\164\1\171\1\151\1\154\1\uffff\1\112\1\164\1\157\1\162\1\163\1\uffff\1\157\1\uffff\1\164\1\157\1\172\1\uffff\1\172\1\171\1\164\1\154\1\124\1\145\2\uffff\1\172\1\141\1\172\1\141\1\145\1\163\1\uffff\1\157\1\151\1\156\3\172\1\uffff\1\156\2\162\1\165\1\172\1\uffff\1\172\1\163\1\uffff\1\165\1\164\1\145\1\164\1\uffff\4\172\1\157\1\141\1\157\1\151\1\156\2\172\1\156\1\171\1\156\1\172\2\uffff\1\172\1\124\1\141\1\162\1\172\1\uffff\1\164\1\uffff\1\154\1\162\2\151\1\157\1\172\3\uffff\1\164\2\114\1\143\1\uffff\1\154\1\uffff\1\151\1\141\1\172\1\120\1\172\4\uffff\1\172\1\164\1\151\1\157\1\172\2\uffff\1\164\2\172\2\uffff\1\162\1\164\1\141\1\uffff\1\157\1\122\1\172\1\157\2\156\1\uffff\1\162\2\151\1\164\2\157\1\164\1\uffff\1\157\2\uffff\1\145\2\156\1\uffff\1\162\2\uffff\1\141\1\145\1\156\1\162\1\145\1\uffff\1\156\1\164\1\172\1\157\2\155\1\151\1\142\1\156\1\157\1\163\1\144\1\164\1\172\1\157\1\156\1\144\1\163\1\172\1\144\2\172\1\uffff\1\154\2\151\1\157\1\141\1\172\1\162\1\151\1\107\1\124\1\uffff\1\154\1\163\1\107\1\155\1\uffff\1\165\2\uffff\1\154\2\164\1\156\1\154\1\uffff\1\172\1\164\2\162\1\154\1\155\1\162\1\151\1\143\1\145\4\172\1\uffff\2\151\1\141\1\145\2\151\1\163\1\164\1\162\4\uffff\1\157\1\160\1\156\1\162\1\163\1\160\1\163\1\151\1\172\1\156\1\160\1\163\1\172\1\163\1\160\1\151\1\157\1\uffff\1\172\1\145\1\155\1\uffff\1\151\1\145\1\157\1\156\1\uffff\1\162\1\151\1\157\1\162\1\156\1\172\1\112\1\163\1\156\1\112\1\172\1\uffff\1\157\1\163\1\172\1\157\1\uffff\2\151\1\uffff\1\151\1\156\1\157\1\156\1\164\1\156\1\164\2\172\1\124\2\uffff\1\171\1\160\1\145\1\172\1\uffff";
    static final String DFA21_acceptS =
        "\3\uffff\1\3\1\uffff\1\5\2\uffff\1\10\45\uffff\1\167\3\uffff\1\174\1\175\3\uffff\1\167\1\uffff\1\3\1\uffff\1\5\4\uffff\1\10\30\uffff\1\147\27\uffff\1\155\33\uffff\1\150\1\uffff\1\152\2\uffff\1\166\1\170\1\165\2\uffff\1\171\1\172\1\173\1\174\17\uffff\1\153\12\uffff\1\157\177\uffff\1\114\1\115\1\116\1\117\1\120\1\121\11\uffff\1\51\20\uffff\1\52\20\uffff\1\123\1\130\3\uffff\1\55\2\uffff\1\4\6\uffff\1\11\5\uffff\1\103\2\uffff\1\126\2\uffff\1\164\1\15\5\uffff\1\154\7\uffff\1\21\7\uffff\1\131\2\uffff\1\27\3\uffff\1\111\1\uffff\1\136\7\uffff\1\142\12\uffff\1\50\23\uffff\1\163\7\uffff\1\112\1\7\1\24\2\uffff\1\67\1\uffff\1\26\5\uffff\1\14\2\uffff\1\17\2\uffff\1\34\12\uffff\1\140\1\uffff\1\65\2\uffff\1\77\17\uffff\1\70\2\uffff\1\54\2\uffff\1\141\15\uffff\1\1\5\uffff\1\31\1\uffff\1\133\5\uffff\1\160\1\16\4\uffff\1\20\1\101\6\uffff\1\125\6\uffff\1\61\2\uffff\1\134\10\uffff\1\53\5\uffff\1\66\1\uffff\1\135\3\uffff\1\105\6\uffff\1\6\1\110\6\uffff\1\35\6\uffff\1\63\5\uffff\1\104\2\uffff\1\143\4\uffff\1\57\17\uffff\1\113\1\144\5\uffff\1\71\1\uffff\1\12\6\uffff\1\124\1\47\1\23\4\uffff\1\30\1\uffff\1\127\5\uffff\1\64\1\137\1\44\1\106\5\uffff\1\132\1\62\3\uffff\1\102\1\122\3\uffff\1\2\6\uffff\1\32\7\uffff\1\43\1\uffff\1\42\1\151\3\uffff\1\107\1\uffff\1\73\1\74\5\uffff\1\100\26\uffff\1\22\12\uffff\1\56\4\uffff\1\40\1\uffff\1\13\1\45\5\uffff\1\36\16\uffff\1\41\11\uffff\1\75\1\76\1\156\1\33\21\uffff\1\25\3\uffff\1\72\4\uffff\1\60\13\uffff\1\37\4\uffff\1\145\2\uffff\1\146\12\uffff\1\46\1\161\4\uffff\1\162";
    static final String DFA21_specialS =
        "\1\2\56\uffff\1\0\1\1\u0333\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\63\2\62\2\63\1\62\22\63\1\62\1\63\1\57\4\63\1\60\4\63\1\10\1\54\1\63\1\61\1\52\11\53\7\63\1\1\1\46\1\35\1\36\2\56\1\44\1\56\1\42\1\14\1\56\1\23\1\25\1\51\1\56\1\33\1\56\1\2\1\40\1\26\1\50\1\43\4\56\3\63\1\55\1\56\1\63\1\20\1\45\1\16\1\21\1\37\1\30\1\31\1\47\1\24\1\7\1\41\1\11\1\12\1\4\1\17\1\15\1\56\1\27\1\22\1\13\1\32\1\6\1\56\1\34\2\56\1\3\1\63\1\5\uff82\63",
            "\1\66\12\uffff\1\64\11\uffff\1\65",
            "\1\70",
            "",
            "\1\72",
            "",
            "\1\76\3\uffff\1\74\3\uffff\1\75",
            "\1\77",
            "",
            "\1\104\64\uffff\1\102\3\uffff\1\101\5\uffff\1\103",
            "\1\105\3\uffff\1\107\3\uffff\1\106\13\uffff\1\110",
            "\1\114\64\uffff\1\113\2\uffff\1\115\11\uffff\1\111\6\uffff\1\112",
            "\1\116",
            "\1\117\6\uffff\1\120",
            "\1\122\6\uffff\1\121\6\uffff\1\123\11\uffff\1\124",
            "\1\126\13\uffff\1\125",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\2\67\1\130\24\67\1\127\2\67",
            "\1\133\27\uffff\1\132",
            "\1\134\1\uffff\1\140\5\uffff\1\137\5\uffff\1\135\1\136",
            "\1\141",
            "\1\142\11\uffff\1\143\1\144\1\145",
            "\1\146\3\uffff\1\150\3\uffff\1\147",
            "\1\152\14\uffff\1\151",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\1\157\3\67\1\156\1\67\1\160\1\67\1\153\5\67\1\154\1\155\12\67",
            "\1\163\7\uffff\1\165\2\uffff\1\162\5\uffff\1\164",
            "\1\166\3\uffff\1\167",
            "\1\171\2\uffff\1\170",
            "\1\173\15\uffff\1\172",
            "\1\174",
            "\1\176\6\uffff\1\175\6\uffff\1\177\11\uffff\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083\16\uffff\1\u0084",
            "\1\u0086\5\uffff\1\u0085",
            "\1\u0087",
            "\1\u0089\3\uffff\1\u0088",
            "\1\u008b\3\uffff\1\u008a",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\16\67\1\u008c\13\67",
            "\1\u008e",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0090",
            "\1\u0091",
            "\1\u0094\1\uffff\12\u0093\13\uffff\1\u0094\37\uffff\1\u0094",
            "\1\u0094\1\uffff\12\u0095\13\uffff\1\u0094\37\uffff\1\u0094",
            "\12\u0096",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\0\u0097",
            "\0\u0097",
            "\1\u0098\4\uffff\1\u0099",
            "",
            "",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "",
            "\1\u009e",
            "",
            "\1\u009f",
            "",
            "\1\u00a1\5\uffff\1\u00a0",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "",
            "\1\u00a6\1\u00a5",
            "\1\u00a7\7\uffff\1\u00a8",
            "\1\u00a9",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00ac\1\u00ab",
            "\1\u00ad",
            "\1\u00ae\17\uffff\1\u00af",
            "\1\u00b0",
            "\1\u00b1\23\uffff\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9\20\uffff\1\u00ca",
            "\1\u00cc\1\u00cb",
            "\1\u00cd",
            "\1\u00ce\1\u00cf\1\u00d0",
            "\1\u00d1\1\u00d2",
            "\1\u00d3",
            "\1\u00d5\1\u00d4",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da\13\uffff\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e7\15\uffff\1\u00e6",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb\1\u00ec",
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
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "",
            "\1\u00fe",
            "",
            "\1\u00ff",
            "\1\u0100",
            "",
            "",
            "",
            "\1\u0094\1\uffff\12\u0095\13\uffff\1\u0094\37\uffff\1\u0094",
            "\1\u0094\1\uffff\12\u0101\13\uffff\1\u0094\37\uffff\1\u0094",
            "",
            "",
            "",
            "",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0108\20\uffff\1\u0107",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123\2\uffff\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149\6\uffff\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158\2\uffff\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0168",
            "\1\u0169",
            "\1\u0094\1\uffff\12\u0101\13\uffff\1\u0094\37\uffff\1\u0094",
            "\1\u016a",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u016c",
            "\1\u016d",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u017c",
            "\1\u017d",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u017f",
            "\1\u0180",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195\10\uffff\1\u0196",
            "\1\u0197",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0199",
            "\1\u019a",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u019c",
            "\1\u019d",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u019e",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u01a0",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "",
            "\1\u01a7",
            "\1\u01a8",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u01b5",
            "\1\u01b6",
            "",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "",
            "",
            "\1\u01c7",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u01c9",
            "",
            "\1\u01ca",
            "\1\u01cb",
            "",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u01d3",
            "\1\u01d4",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u01d6",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u01d8",
            "",
            "\1\u01d9",
            "\1\u01da",
            "",
            "",
            "\1\u01db",
            "\1\u01dc",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u01de",
            "\1\u01df",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u01e1",
            "\1\u01e2",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u01ef",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u01f1",
            "\1\u01f2",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "",
            "\1\u01fb",
            "\1\u01fc",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "\1\u0202",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u0204",
            "\1\u0205",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0207",
            "\1\u0208",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "",
            "\1\u021e",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u0220",
            "",
            "\1\u0221",
            "\1\u0222",
            "\1\u0223",
            "\1\u0224",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0227",
            "",
            "\1\u0228",
            "\1\u0229",
            "",
            "\1\u022a",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u0234",
            "",
            "\1\u0235",
            "\1\u0236",
            "",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u023b",
            "\1\u023c",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0247",
            "",
            "\1\u0248",
            "\1\u0249",
            "",
            "\1\u024a",
            "\1\u024b",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u024d",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u024f",
            "\1\u0250",
            "\1\u0251",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0253",
            "\1\u0254",
            "\1\u0255",
            "\1\u0256",
            "",
            "\1\u0257",
            "\1\u0258",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u025b",
            "",
            "\1\u025c",
            "",
            "\1\u025d",
            "\1\u025e",
            "\1\u025f",
            "\1\u0260",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "\1\u0262",
            "\1\u0263",
            "\1\u0264",
            "\1\u0265",
            "",
            "",
            "\1\u0266",
            "\1\u0267",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0269",
            "\1\u026a",
            "\1\u026b",
            "",
            "\1\u026c",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\13\67\1\u026d\16\67",
            "\1\u026f",
            "\1\u0270",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0272",
            "",
            "\1\u0273",
            "\1\u0274",
            "",
            "\1\u0275",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0277",
            "\1\u0278",
            "\1\u0279",
            "\1\u027a",
            "\1\u027b",
            "\1\u027c",
            "",
            "\1\u027d",
            "\1\u027e",
            "\1\u027f",
            "\1\u0280",
            "\1\u0281",
            "",
            "\1\u0282",
            "",
            "\1\u0283",
            "\1\u0284",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\13\67\1\u0285\16\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0288",
            "\1\u0289",
            "\1\u028a",
            "\1\u028b",
            "\1\u028c",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u028e",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0290",
            "\1\u0291",
            "\1\u0292",
            "",
            "\1\u0293",
            "\1\u0294",
            "\1\u0295",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u0299",
            "\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\12\67\7\uffff\6\67\1\u029e\23\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u02a0",
            "",
            "\1\u02a1",
            "\1\u02a2",
            "\1\u02a3",
            "\1\u02a4",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u02a9",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "\1\u02ad",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u02b0",
            "\1\u02b1",
            "\1\u02b2",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u02b5",
            "\1\u02b6",
            "\1\u02b7",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u02b9",
            "",
            "\1\u02ba",
            "\1\u02bb",
            "\1\u02bc",
            "\1\u02bd",
            "\1\u02be",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "",
            "\1\u02c0",
            "\1\u02c1",
            "\1\u02c2",
            "\1\u02c3",
            "",
            "\1\u02c4",
            "",
            "\1\u02c5",
            "\1\u02c6",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u02c8",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u02cb",
            "\1\u02cc",
            "\1\u02cd",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "\1\u02cf",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "\1\u02d2",
            "\1\u02d3",
            "\1\u02d4",
            "",
            "\1\u02d5",
            "\1\u02d6",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u02d8",
            "\1\u02d9",
            "\1\u02da",
            "",
            "\1\u02db",
            "\1\u02dc",
            "\1\u02dd",
            "\1\u02de",
            "\1\u02df",
            "\1\u02e0",
            "\1\u02e1",
            "",
            "\1\u02e2",
            "",
            "",
            "\1\u02e3",
            "\1\u02e4",
            "\1\u02e5",
            "",
            "\1\u02e6",
            "",
            "",
            "\1\u02e7",
            "\1\u02e8",
            "\1\u02e9",
            "\1\u02ea",
            "\1\u02eb",
            "",
            "\1\u02ec",
            "\1\u02ed",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u02ef",
            "\1\u02f0",
            "\1\u02f1",
            "\1\u02f2",
            "\1\u02f3",
            "\1\u02f4",
            "\1\u02f5",
            "\1\u02f6",
            "\1\u02f7",
            "\1\u02f8",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u02fa",
            "\1\u02fb",
            "\1\u02fc",
            "\1\u02fd",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u02ff",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u0302",
            "\1\u0303",
            "\1\u0304",
            "\1\u0305",
            "\1\u0306",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0308",
            "\1\u0309",
            "\1\u030a",
            "\1\u030b",
            "",
            "\1\u030c",
            "\1\u030d",
            "\1\u030e",
            "\1\u030f",
            "",
            "\1\u0310",
            "",
            "",
            "\1\u0311",
            "\1\u0312",
            "\1\u0313",
            "\1\u0314",
            "\1\u0315",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0317",
            "\1\u0318",
            "\1\u0319",
            "\1\u031a",
            "\1\u031b",
            "\1\u031c",
            "\1\u031d",
            "\1\u031e",
            "\1\u031f",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u0324",
            "\1\u0325",
            "\1\u0326",
            "\1\u0327",
            "\1\u0328",
            "\1\u0329",
            "\1\u032a",
            "\1\u032b",
            "\1\u032c",
            "",
            "",
            "",
            "",
            "\1\u032d",
            "\1\u032e",
            "\1\u032f",
            "\1\u0330",
            "\1\u0331",
            "\1\u0332",
            "\1\u0333",
            "\1\u0334",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0336",
            "\1\u0337",
            "\1\u0338",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u033a",
            "\1\u033b",
            "\1\u033c",
            "\1\u033d",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u033f",
            "\1\u0340",
            "",
            "\1\u0341",
            "\1\u0342",
            "\1\u0343",
            "\1\u0344",
            "",
            "\1\u0345",
            "\1\u0346",
            "\1\u0347",
            "\1\u0348",
            "\1\u0349",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u034b",
            "\1\u034c",
            "\1\u034d",
            "\1\u034e",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u0350",
            "\1\u0351",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0353",
            "",
            "\1\u0354",
            "\1\u0355",
            "",
            "\1\u0356",
            "\1\u0357",
            "\1\u0358",
            "\1\u0359",
            "\1\u035a",
            "\1\u035b",
            "\1\u035c",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u035f",
            "",
            "",
            "\1\u0360",
            "\1\u0361",
            "\1\u0362",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_47 = input.LA(1);

                        s = -1;
                        if ( ((LA21_47>='\u0000' && LA21_47<='\uFFFF')) ) {s = 151;}

                        else s = 51;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_48 = input.LA(1);

                        s = -1;
                        if ( ((LA21_48>='\u0000' && LA21_48<='\uFFFF')) ) {s = 151;}

                        else s = 51;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='A') ) {s = 1;}

                        else if ( (LA21_0=='R') ) {s = 2;}

                        else if ( (LA21_0=='{') ) {s = 3;}

                        else if ( (LA21_0=='n') ) {s = 4;}

                        else if ( (LA21_0=='}') ) {s = 5;}

                        else if ( (LA21_0=='v') ) {s = 6;}

                        else if ( (LA21_0=='j') ) {s = 7;}

                        else if ( (LA21_0==',') ) {s = 8;}

                        else if ( (LA21_0=='l') ) {s = 9;}

                        else if ( (LA21_0=='m') ) {s = 10;}

                        else if ( (LA21_0=='t') ) {s = 11;}

                        else if ( (LA21_0=='J') ) {s = 12;}

                        else if ( (LA21_0=='p') ) {s = 13;}

                        else if ( (LA21_0=='c') ) {s = 14;}

                        else if ( (LA21_0=='o') ) {s = 15;}

                        else if ( (LA21_0=='a') ) {s = 16;}

                        else if ( (LA21_0=='d') ) {s = 17;}

                        else if ( (LA21_0=='s') ) {s = 18;}

                        else if ( (LA21_0=='L') ) {s = 19;}

                        else if ( (LA21_0=='i') ) {s = 20;}

                        else if ( (LA21_0=='M') ) {s = 21;}

                        else if ( (LA21_0=='T') ) {s = 22;}

                        else if ( (LA21_0=='r') ) {s = 23;}

                        else if ( (LA21_0=='f') ) {s = 24;}

                        else if ( (LA21_0=='g') ) {s = 25;}

                        else if ( (LA21_0=='u') ) {s = 26;}

                        else if ( (LA21_0=='P') ) {s = 27;}

                        else if ( (LA21_0=='x') ) {s = 28;}

                        else if ( (LA21_0=='C') ) {s = 29;}

                        else if ( (LA21_0=='D') ) {s = 30;}

                        else if ( (LA21_0=='e') ) {s = 31;}

                        else if ( (LA21_0=='S') ) {s = 32;}

                        else if ( (LA21_0=='k') ) {s = 33;}

                        else if ( (LA21_0=='I') ) {s = 34;}

                        else if ( (LA21_0=='V') ) {s = 35;}

                        else if ( (LA21_0=='G') ) {s = 36;}

                        else if ( (LA21_0=='b') ) {s = 37;}

                        else if ( (LA21_0=='B') ) {s = 38;}

                        else if ( (LA21_0=='h') ) {s = 39;}

                        else if ( (LA21_0=='U') ) {s = 40;}

                        else if ( (LA21_0=='N') ) {s = 41;}

                        else if ( (LA21_0=='0') ) {s = 42;}

                        else if ( ((LA21_0>='1' && LA21_0<='9')) ) {s = 43;}

                        else if ( (LA21_0=='-') ) {s = 44;}

                        else if ( (LA21_0=='^') ) {s = 45;}

                        else if ( ((LA21_0>='E' && LA21_0<='F')||LA21_0=='H'||LA21_0=='K'||LA21_0=='O'||LA21_0=='Q'||(LA21_0>='W' && LA21_0<='Z')||LA21_0=='_'||LA21_0=='q'||LA21_0=='w'||(LA21_0>='y' && LA21_0<='z')) ) {s = 46;}

                        else if ( (LA21_0=='\"') ) {s = 47;}

                        else if ( (LA21_0=='\'') ) {s = 48;}

                        else if ( (LA21_0=='/') ) {s = 49;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 50;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||LA21_0=='!'||(LA21_0>='#' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='+')||LA21_0=='.'||(LA21_0>=':' && LA21_0<='@')||(LA21_0>='[' && LA21_0<=']')||LA21_0=='`'||LA21_0=='|'||(LA21_0>='~' && LA21_0<='\uFFFF')) ) {s = 51;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}