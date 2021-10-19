package de.fraunhofer.ipa.kinematics.xacro.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXacroLexer extends Lexer {
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
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
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
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_DOUBLE=4;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__107=107;
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

    public InternalXacroLexer() {;} 
    public InternalXacroLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalXacroLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalXacro.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:11:7: ( 'AnyURI' )
            // InternalXacro.g:11:9: 'AnyURI'
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
            // InternalXacro.g:12:7: ( 'Robot' )
            // InternalXacro.g:12:9: 'Robot'
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
            // InternalXacro.g:13:7: ( '{' )
            // InternalXacro.g:13:9: '{'
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
            // InternalXacro.g:14:7: ( 'name' )
            // InternalXacro.g:14:9: 'name'
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
            // InternalXacro.g:15:7: ( '}' )
            // InternalXacro.g:15:9: '}'
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
            // InternalXacro.g:16:7: ( 'macro' )
            // InternalXacro.g:16:9: 'macro'
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
            // InternalXacro.g:17:7: ( ',' )
            // InternalXacro.g:17:9: ','
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
            // InternalXacro.g:18:7: ( 'Macro' )
            // InternalXacro.g:18:9: 'Macro'
            {
            match("Macro"); 


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
            // InternalXacro.g:19:7: ( 'parameter' )
            // InternalXacro.g:19:9: 'parameter'
            {
            match("parameter"); 


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
            // InternalXacro.g:20:7: ( 'body' )
            // InternalXacro.g:20:9: 'body'
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
            // InternalXacro.g:21:7: ( 'Parameter' )
            // InternalXacro.g:21:9: 'Parameter'
            {
            match("Parameter"); 


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
            // InternalXacro.g:22:7: ( 'default' )
            // InternalXacro.g:22:9: 'default'
            {
            match("default"); 


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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:24:7: ( 'Body' )
            // InternalXacro.g:24:9: 'Body'
            {
            match("Body"); 


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
            // InternalXacro.g:25:7: ( 'link' )
            // InternalXacro.g:25:9: 'link'
            {
            match("link"); 


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
            // InternalXacro.g:26:7: ( 'joint' )
            // InternalXacro.g:26:9: 'joint'
            {
            match("joint"); 


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
            // InternalXacro.g:27:7: ( 'material' )
            // InternalXacro.g:27:9: 'material'
            {
            match("material"); 


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
            // InternalXacro.g:28:7: ( 'Joint' )
            // InternalXacro.g:28:9: 'Joint'
            {
            match("Joint"); 


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
            // InternalXacro.g:29:7: ( 'type' )
            // InternalXacro.g:29:9: 'type'
            {
            match("type"); 


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
            // InternalXacro.g:30:7: ( 'parent' )
            // InternalXacro.g:30:9: 'parent'
            {
            match("parent"); 


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
            // InternalXacro.g:31:7: ( 'child' )
            // InternalXacro.g:31:9: 'child'
            {
            match("child"); 


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
            // InternalXacro.g:32:7: ( 'origin' )
            // InternalXacro.g:32:9: 'origin'
            {
            match("origin"); 


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
            // InternalXacro.g:33:7: ( 'axis' )
            // InternalXacro.g:33:9: 'axis'
            {
            match("axis"); 


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
            // InternalXacro.g:34:7: ( 'calibration' )
            // InternalXacro.g:34:9: 'calibration'
            {
            match("calibration"); 


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
            // InternalXacro.g:35:7: ( 'dynamics' )
            // InternalXacro.g:35:9: 'dynamics'
            {
            match("dynamics"); 


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
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXacro.g:37:7: ( 'safetyController' )
            // InternalXacro.g:37:9: 'safetyController'
            {
            match("safetyController"); 


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
            // InternalXacro.g:38:7: ( 'mimic' )
            // InternalXacro.g:38:9: 'mimic'
            {
            match("mimic"); 


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
            // InternalXacro.g:39:7: ( 'Link' )
            // InternalXacro.g:39:9: 'Link'
            {
            match("Link"); 


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
            // InternalXacro.g:40:7: ( 'inertial' )
            // InternalXacro.g:40:9: 'inertial'
            {
            match("inertial"); 


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
            // InternalXacro.g:41:7: ( 'visual' )
            // InternalXacro.g:41:9: 'visual'
            {
            match("visual"); 


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
            // InternalXacro.g:42:7: ( 'collision' )
            // InternalXacro.g:42:9: 'collision'
            {
            match("collision"); 


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
            // InternalXacro.g:43:7: ( 'MaterialGlobal' )
            // InternalXacro.g:43:9: 'MaterialGlobal'
            {
            match("MaterialGlobal"); 


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
            // InternalXacro.g:44:7: ( 'color' )
            // InternalXacro.g:44:9: 'color'
            {
            match("color"); 


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
            // InternalXacro.g:45:7: ( 'texture' )
            // InternalXacro.g:45:9: 'texture'
            {
            match("texture"); 


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
            // InternalXacro.g:46:7: ( 'Pose' )
            // InternalXacro.g:46:9: 'Pose'
            {
            match("Pose"); 


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
            // InternalXacro.g:47:7: ( 'rpy' )
            // InternalXacro.g:47:9: 'rpy'
            {
            match("rpy"); 


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
            // InternalXacro.g:48:7: ( 'xyz' )
            // InternalXacro.g:48:9: 'xyz'
            {
            match("xyz"); 


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
            // InternalXacro.g:49:7: ( 'Axis' )
            // InternalXacro.g:49:9: 'Axis'
            {
            match("Axis"); 


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
            // InternalXacro.g:50:7: ( 'Calibration' )
            // InternalXacro.g:50:9: 'Calibration'
            {
            match("Calibration"); 


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
            // InternalXacro.g:51:7: ( 'falling' )
            // InternalXacro.g:51:9: 'falling'
            {
            match("falling"); 


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
            // InternalXacro.g:52:7: ( 'referencePosition' )
            // InternalXacro.g:52:9: 'referencePosition'
            {
            match("referencePosition"); 


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
            // InternalXacro.g:53:7: ( 'rising' )
            // InternalXacro.g:53:9: 'rising'
            {
            match("rising"); 


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
            // InternalXacro.g:54:7: ( 'Dynamics' )
            // InternalXacro.g:54:9: 'Dynamics'
            {
            match("Dynamics"); 


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
            // InternalXacro.g:55:7: ( 'damping' )
            // InternalXacro.g:55:9: 'damping'
            {
            match("damping"); 


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
            // InternalXacro.g:56:7: ( 'friction' )
            // InternalXacro.g:56:9: 'friction'
            {
            match("friction"); 


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
            // InternalXacro.g:57:7: ( 'Limit' )
            // InternalXacro.g:57:9: 'Limit'
            {
            match("Limit"); 


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
            // InternalXacro.g:58:7: ( 'effort' )
            // InternalXacro.g:58:9: 'effort'
            {
            match("effort"); 


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
            // InternalXacro.g:59:7: ( 'lower' )
            // InternalXacro.g:59:9: 'lower'
            {
            match("lower"); 


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
            // InternalXacro.g:60:7: ( 'upper' )
            // InternalXacro.g:60:9: 'upper'
            {
            match("upper"); 


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
            // InternalXacro.g:61:7: ( 'velocity' )
            // InternalXacro.g:61:9: 'velocity'
            {
            match("velocity"); 


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
            // InternalXacro.g:62:7: ( 'SafetyController' )
            // InternalXacro.g:62:9: 'SafetyController'
            {
            match("SafetyController"); 


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
            // InternalXacro.g:63:7: ( 'kVelocity' )
            // InternalXacro.g:63:9: 'kVelocity'
            {
            match("kVelocity"); 


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
            // InternalXacro.g:64:7: ( 'kPosition' )
            // InternalXacro.g:64:9: 'kPosition'
            {
            match("kPosition"); 


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
            // InternalXacro.g:65:7: ( 'softLowerLimit' )
            // InternalXacro.g:65:9: 'softLowerLimit'
            {
            match("softLowerLimit"); 


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
            // InternalXacro.g:66:7: ( 'softUpperLimit' )
            // InternalXacro.g:66:9: 'softUpperLimit'
            {
            match("softUpperLimit"); 


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
            // InternalXacro.g:67:7: ( 'Mimic' )
            // InternalXacro.g:67:9: 'Mimic'
            {
            match("Mimic"); 


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
            // InternalXacro.g:68:7: ( 'multiplier' )
            // InternalXacro.g:68:9: 'multiplier'
            {
            match("multiplier"); 


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
            // InternalXacro.g:69:7: ( 'offset' )
            // InternalXacro.g:69:9: 'offset'
            {
            match("offset"); 


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
            // InternalXacro.g:70:7: ( 'Inertial' )
            // InternalXacro.g:70:9: 'Inertial'
            {
            match("Inertial"); 


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
            // InternalXacro.g:71:7: ( 'mass' )
            // InternalXacro.g:71:9: 'mass'
            {
            match("mass"); 


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
            // InternalXacro.g:72:7: ( 'inertia' )
            // InternalXacro.g:72:9: 'inertia'
            {
            match("inertia"); 


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
            // InternalXacro.g:73:7: ( 'Visual' )
            // InternalXacro.g:73:9: 'Visual'
            {
            match("Visual"); 


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
            // InternalXacro.g:74:7: ( 'geometry' )
            // InternalXacro.g:74:9: 'geometry'
            {
            match("geometry"); 


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
            // InternalXacro.g:75:7: ( 'Collision' )
            // InternalXacro.g:75:9: 'Collision'
            {
            match("Collision"); 


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
            // InternalXacro.g:76:7: ( 'verbose' )
            // InternalXacro.g:76:9: 'verbose'
            {
            match("verbose"); 


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
            // InternalXacro.g:77:7: ( 'Mass' )
            // InternalXacro.g:77:9: 'Mass'
            {
            match("Mass"); 


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
            // InternalXacro.g:78:7: ( 'Inertia' )
            // InternalXacro.g:78:9: 'Inertia'
            {
            match("Inertia"); 


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
            // InternalXacro.g:79:7: ( 'ixx' )
            // InternalXacro.g:79:9: 'ixx'
            {
            match("ixx"); 


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
            // InternalXacro.g:80:7: ( 'ixy' )
            // InternalXacro.g:80:9: 'ixy'
            {
            match("ixy"); 


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
            // InternalXacro.g:81:7: ( 'ixz' )
            // InternalXacro.g:81:9: 'ixz'
            {
            match("ixz"); 


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
            // InternalXacro.g:82:7: ( 'iyy' )
            // InternalXacro.g:82:9: 'iyy'
            {
            match("iyy"); 


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
            // InternalXacro.g:83:7: ( 'iyz' )
            // InternalXacro.g:83:9: 'iyz'
            {
            match("iyz"); 


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
            // InternalXacro.g:84:7: ( 'izz' )
            // InternalXacro.g:84:9: 'izz'
            {
            match("izz"); 


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
            // InternalXacro.g:85:7: ( 'Geometry' )
            // InternalXacro.g:85:9: 'Geometry'
            {
            match("Geometry"); 


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
            // InternalXacro.g:86:7: ( 'box' )
            // InternalXacro.g:86:9: 'box'
            {
            match("box"); 


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
            // InternalXacro.g:87:7: ( 'cylinder' )
            // InternalXacro.g:87:9: 'cylinder'
            {
            match("cylinder"); 


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
            // InternalXacro.g:88:7: ( 'sphere' )
            // InternalXacro.g:88:9: 'sphere'
            {
            match("sphere"); 


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
            // InternalXacro.g:89:7: ( 'mesh' )
            // InternalXacro.g:89:9: 'mesh'
            {
            match("mesh"); 


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
            // InternalXacro.g:90:7: ( 'Material' )
            // InternalXacro.g:90:9: 'Material'
            {
            match("Material"); 


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
            // InternalXacro.g:91:7: ( 'Box' )
            // InternalXacro.g:91:9: 'Box'
            {
            match("Box"); 


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
            // InternalXacro.g:92:7: ( 'size' )
            // InternalXacro.g:92:9: 'size'
            {
            match("size"); 


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
            // InternalXacro.g:93:7: ( 'Cylinder' )
            // InternalXacro.g:93:9: 'Cylinder'
            {
            match("Cylinder"); 


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
            // InternalXacro.g:94:7: ( 'length' )
            // InternalXacro.g:94:9: 'length'
            {
            match("length"); 


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
            // InternalXacro.g:95:7: ( 'radius' )
            // InternalXacro.g:95:9: 'radius'
            {
            match("radius"); 


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
            // InternalXacro.g:96:8: ( 'Sphere' )
            // InternalXacro.g:96:10: 'Sphere'
            {
            match("Sphere"); 


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
            // InternalXacro.g:97:8: ( 'Mesh' )
            // InternalXacro.g:97:10: 'Mesh'
            {
            match("Mesh"); 


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
            // InternalXacro.g:98:8: ( 'filename' )
            // InternalXacro.g:98:10: 'filename'
            {
            match("filename"); 


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
            // InternalXacro.g:99:8: ( 'scale' )
            // InternalXacro.g:99:10: 'scale'
            {
            match("scale"); 


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
            // InternalXacro.g:100:8: ( 'Color' )
            // InternalXacro.g:100:10: 'Color'
            {
            match("Color"); 


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
            // InternalXacro.g:101:8: ( 'rgba' )
            // InternalXacro.g:101:10: 'rgba'
            {
            match("rgba"); 


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
            // InternalXacro.g:102:8: ( 'Texture' )
            // InternalXacro.g:102:10: 'Texture'
            {
            match("Texture"); 


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
            // InternalXacro.g:103:8: ( 'Verbose' )
            // InternalXacro.g:103:10: 'Verbose'
            {
            match("Verbose"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalXacro.g:11719:21: ( '0' .. '9' )
            // InternalXacro.g:11719:23: '0' .. '9'
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
            // InternalXacro.g:11721:14: ( ( 'true' | 'false' ) )
            // InternalXacro.g:11721:16: ( 'true' | 'false' )
            {
            // InternalXacro.g:11721:16: ( 'true' | 'false' )
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
                    // InternalXacro.g:11721:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalXacro.g:11721:24: 'false'
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
            // InternalXacro.g:11723:13: ( RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT ) )
            // InternalXacro.g:11723:15: RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )
            {
            mRULE_DECINT(); 
            // InternalXacro.g:11723:27: ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalXacro.g:11723:28: '.' ( RULE_DIGIT )*
                    {
                    match('.'); 
                    // InternalXacro.g:11723:32: ( RULE_DIGIT )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalXacro.g:11723:32: RULE_DIGIT
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
                    // InternalXacro.g:11723:44: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT
                    {
                    // InternalXacro.g:11723:44: ( '.' ( RULE_DIGIT )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='.') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalXacro.g:11723:45: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalXacro.g:11723:49: ( RULE_DIGIT )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalXacro.g:11723:49: RULE_DIGIT
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

                    // InternalXacro.g:11723:73: ( '-' | '+' )?
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
            // InternalXacro.g:11725:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalXacro.g:11725:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalXacro.g:11725:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
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
                    // InternalXacro.g:11725:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalXacro.g:11725:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalXacro.g:11725:29: ( RULE_DIGIT )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalXacro.g:11725:29: RULE_DIGIT
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
                    // InternalXacro.g:11725:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    matchRange('0','9'); 
                    // InternalXacro.g:11725:54: ( RULE_DIGIT )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalXacro.g:11725:54: RULE_DIGIT
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
            // InternalXacro.g:11727:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalXacro.g:11727:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalXacro.g:11727:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXacro.g:11727:11: '^'
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

            // InternalXacro.g:11727:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
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
            // InternalXacro.g:11729:10: ( ( '0' .. '9' )+ )
            // InternalXacro.g:11729:12: ( '0' .. '9' )+
            {
            // InternalXacro.g:11729:12: ( '0' .. '9' )+
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
            	    // InternalXacro.g:11729:13: '0' .. '9'
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
            // InternalXacro.g:11731:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalXacro.g:11731:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalXacro.g:11731:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalXacro.g:11731:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalXacro.g:11731:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalXacro.g:11731:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalXacro.g:11731:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalXacro.g:11731:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalXacro.g:11731:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalXacro.g:11731:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalXacro.g:11731:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalXacro.g:11733:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalXacro.g:11733:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalXacro.g:11733:24: ( options {greedy=false; } : . )*
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
            	    // InternalXacro.g:11733:52: .
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
            // InternalXacro.g:11735:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalXacro.g:11735:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalXacro.g:11735:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalXacro.g:11735:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalXacro.g:11735:40: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXacro.g:11735:41: ( '\\r' )? '\\n'
                    {
                    // InternalXacro.g:11735:41: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalXacro.g:11735:41: '\\r'
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
            // InternalXacro.g:11737:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalXacro.g:11737:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalXacro.g:11737:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalXacro.g:11739:16: ( . )
            // InternalXacro.g:11739:18: .
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
        // InternalXacro.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=103;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // InternalXacro.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalXacro.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalXacro.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalXacro.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalXacro.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalXacro.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalXacro.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalXacro.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalXacro.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalXacro.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalXacro.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalXacro.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalXacro.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalXacro.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalXacro.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalXacro.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalXacro.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalXacro.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalXacro.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalXacro.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // InternalXacro.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // InternalXacro.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // InternalXacro.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // InternalXacro.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // InternalXacro.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // InternalXacro.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // InternalXacro.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // InternalXacro.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // InternalXacro.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // InternalXacro.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // InternalXacro.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // InternalXacro.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // InternalXacro.g:1:202: T__47
                {
                mT__47(); 

                }
                break;
            case 34 :
                // InternalXacro.g:1:208: T__48
                {
                mT__48(); 

                }
                break;
            case 35 :
                // InternalXacro.g:1:214: T__49
                {
                mT__49(); 

                }
                break;
            case 36 :
                // InternalXacro.g:1:220: T__50
                {
                mT__50(); 

                }
                break;
            case 37 :
                // InternalXacro.g:1:226: T__51
                {
                mT__51(); 

                }
                break;
            case 38 :
                // InternalXacro.g:1:232: T__52
                {
                mT__52(); 

                }
                break;
            case 39 :
                // InternalXacro.g:1:238: T__53
                {
                mT__53(); 

                }
                break;
            case 40 :
                // InternalXacro.g:1:244: T__54
                {
                mT__54(); 

                }
                break;
            case 41 :
                // InternalXacro.g:1:250: T__55
                {
                mT__55(); 

                }
                break;
            case 42 :
                // InternalXacro.g:1:256: T__56
                {
                mT__56(); 

                }
                break;
            case 43 :
                // InternalXacro.g:1:262: T__57
                {
                mT__57(); 

                }
                break;
            case 44 :
                // InternalXacro.g:1:268: T__58
                {
                mT__58(); 

                }
                break;
            case 45 :
                // InternalXacro.g:1:274: T__59
                {
                mT__59(); 

                }
                break;
            case 46 :
                // InternalXacro.g:1:280: T__60
                {
                mT__60(); 

                }
                break;
            case 47 :
                // InternalXacro.g:1:286: T__61
                {
                mT__61(); 

                }
                break;
            case 48 :
                // InternalXacro.g:1:292: T__62
                {
                mT__62(); 

                }
                break;
            case 49 :
                // InternalXacro.g:1:298: T__63
                {
                mT__63(); 

                }
                break;
            case 50 :
                // InternalXacro.g:1:304: T__64
                {
                mT__64(); 

                }
                break;
            case 51 :
                // InternalXacro.g:1:310: T__65
                {
                mT__65(); 

                }
                break;
            case 52 :
                // InternalXacro.g:1:316: T__66
                {
                mT__66(); 

                }
                break;
            case 53 :
                // InternalXacro.g:1:322: T__67
                {
                mT__67(); 

                }
                break;
            case 54 :
                // InternalXacro.g:1:328: T__68
                {
                mT__68(); 

                }
                break;
            case 55 :
                // InternalXacro.g:1:334: T__69
                {
                mT__69(); 

                }
                break;
            case 56 :
                // InternalXacro.g:1:340: T__70
                {
                mT__70(); 

                }
                break;
            case 57 :
                // InternalXacro.g:1:346: T__71
                {
                mT__71(); 

                }
                break;
            case 58 :
                // InternalXacro.g:1:352: T__72
                {
                mT__72(); 

                }
                break;
            case 59 :
                // InternalXacro.g:1:358: T__73
                {
                mT__73(); 

                }
                break;
            case 60 :
                // InternalXacro.g:1:364: T__74
                {
                mT__74(); 

                }
                break;
            case 61 :
                // InternalXacro.g:1:370: T__75
                {
                mT__75(); 

                }
                break;
            case 62 :
                // InternalXacro.g:1:376: T__76
                {
                mT__76(); 

                }
                break;
            case 63 :
                // InternalXacro.g:1:382: T__77
                {
                mT__77(); 

                }
                break;
            case 64 :
                // InternalXacro.g:1:388: T__78
                {
                mT__78(); 

                }
                break;
            case 65 :
                // InternalXacro.g:1:394: T__79
                {
                mT__79(); 

                }
                break;
            case 66 :
                // InternalXacro.g:1:400: T__80
                {
                mT__80(); 

                }
                break;
            case 67 :
                // InternalXacro.g:1:406: T__81
                {
                mT__81(); 

                }
                break;
            case 68 :
                // InternalXacro.g:1:412: T__82
                {
                mT__82(); 

                }
                break;
            case 69 :
                // InternalXacro.g:1:418: T__83
                {
                mT__83(); 

                }
                break;
            case 70 :
                // InternalXacro.g:1:424: T__84
                {
                mT__84(); 

                }
                break;
            case 71 :
                // InternalXacro.g:1:430: T__85
                {
                mT__85(); 

                }
                break;
            case 72 :
                // InternalXacro.g:1:436: T__86
                {
                mT__86(); 

                }
                break;
            case 73 :
                // InternalXacro.g:1:442: T__87
                {
                mT__87(); 

                }
                break;
            case 74 :
                // InternalXacro.g:1:448: T__88
                {
                mT__88(); 

                }
                break;
            case 75 :
                // InternalXacro.g:1:454: T__89
                {
                mT__89(); 

                }
                break;
            case 76 :
                // InternalXacro.g:1:460: T__90
                {
                mT__90(); 

                }
                break;
            case 77 :
                // InternalXacro.g:1:466: T__91
                {
                mT__91(); 

                }
                break;
            case 78 :
                // InternalXacro.g:1:472: T__92
                {
                mT__92(); 

                }
                break;
            case 79 :
                // InternalXacro.g:1:478: T__93
                {
                mT__93(); 

                }
                break;
            case 80 :
                // InternalXacro.g:1:484: T__94
                {
                mT__94(); 

                }
                break;
            case 81 :
                // InternalXacro.g:1:490: T__95
                {
                mT__95(); 

                }
                break;
            case 82 :
                // InternalXacro.g:1:496: T__96
                {
                mT__96(); 

                }
                break;
            case 83 :
                // InternalXacro.g:1:502: T__97
                {
                mT__97(); 

                }
                break;
            case 84 :
                // InternalXacro.g:1:508: T__98
                {
                mT__98(); 

                }
                break;
            case 85 :
                // InternalXacro.g:1:514: T__99
                {
                mT__99(); 

                }
                break;
            case 86 :
                // InternalXacro.g:1:520: T__100
                {
                mT__100(); 

                }
                break;
            case 87 :
                // InternalXacro.g:1:527: T__101
                {
                mT__101(); 

                }
                break;
            case 88 :
                // InternalXacro.g:1:534: T__102
                {
                mT__102(); 

                }
                break;
            case 89 :
                // InternalXacro.g:1:541: T__103
                {
                mT__103(); 

                }
                break;
            case 90 :
                // InternalXacro.g:1:548: T__104
                {
                mT__104(); 

                }
                break;
            case 91 :
                // InternalXacro.g:1:555: T__105
                {
                mT__105(); 

                }
                break;
            case 92 :
                // InternalXacro.g:1:562: T__106
                {
                mT__106(); 

                }
                break;
            case 93 :
                // InternalXacro.g:1:569: T__107
                {
                mT__107(); 

                }
                break;
            case 94 :
                // InternalXacro.g:1:576: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 95 :
                // InternalXacro.g:1:589: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 96 :
                // InternalXacro.g:1:601: RULE_DECINT
                {
                mRULE_DECINT(); 

                }
                break;
            case 97 :
                // InternalXacro.g:1:613: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 98 :
                // InternalXacro.g:1:621: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 99 :
                // InternalXacro.g:1:630: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 100 :
                // InternalXacro.g:1:642: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 101 :
                // InternalXacro.g:1:658: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 102 :
                // InternalXacro.g:1:674: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 103 :
                // InternalXacro.g:1:682: RULE_ANY_OTHER
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
            return "11723:27: ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )";
        }
    }
    static final String DFA21_eotS =
        "\1\uffff\2\63\1\uffff\1\63\1\uffff\1\63\1\uffff\37\63\2\175\2\60\1\uffff\3\60\2\uffff\2\63\1\uffff\1\63\1\uffff\1\63\1\uffff\4\63\1\uffff\100\63\3\uffff\2\175\4\uffff\21\63\1\u00ed\12\63\1\u00f8\30\63\1\u0112\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118\4\63\1\u011d\23\63\1\175\1\63\1\u0134\1\63\1\u0136\2\63\1\u0139\2\63\1\u013c\2\63\1\u013f\1\63\1\u0141\2\63\1\u0144\1\uffff\1\63\1\u0146\7\63\1\u014e\1\uffff\1\u014f\5\63\1\u0155\1\63\1\u0157\7\63\1\u015f\3\63\1\u0164\1\63\1\u0166\2\63\7\uffff\3\63\1\u016c\1\uffff\26\63\1\uffff\1\u0183\1\uffff\1\u0184\1\63\1\uffff\1\u0186\1\63\1\uffff\1\u0188\1\63\1\uffff\1\u018a\1\uffff\2\63\1\uffff\1\63\1\uffff\3\63\1\u0191\3\63\2\uffff\1\u0195\1\u0196\1\63\1\u0198\1\u0199\1\uffff\1\63\1\uffff\1\u019b\2\63\1\u019e\3\63\1\uffff\4\63\1\uffff\1\u01a6\1\uffff\1\u01a7\4\63\1\uffff\2\63\1\u01ae\2\63\1\u0157\4\63\1\u01b5\12\63\1\u01c0\2\uffff\1\63\1\uffff\1\63\1\uffff\1\63\1\uffff\1\63\1\u01c5\4\63\1\uffff\1\u01ca\2\63\2\uffff\1\u01cd\2\uffff\1\63\1\uffff\2\63\1\uffff\1\63\1\u01d2\1\u01d3\3\63\1\u01d7\2\uffff\2\63\1\u01da\1\u01db\2\63\1\uffff\5\63\1\u01e3\1\uffff\1\63\1\u01e5\3\63\1\u01e9\4\63\1\uffff\4\63\1\uffff\1\63\1\u01f3\1\63\1\u01f5\1\uffff\1\63\1\u01f7\1\uffff\1\u01f8\3\63\2\uffff\3\63\1\uffff\1\u0200\1\63\2\uffff\3\63\1\u0205\3\63\1\uffff\1\63\1\uffff\2\63\1\u020d\1\uffff\1\u020e\2\63\1\u0211\1\u0212\1\63\1\u0215\2\63\1\uffff\1\u0218\1\uffff\1\u0219\2\uffff\2\63\1\u021c\3\63\1\u0220\1\uffff\3\63\1\u0224\1\uffff\1\u0225\1\u0226\1\u0227\3\63\1\u022b\2\uffff\1\u022c\1\u022d\2\uffff\2\63\1\uffff\1\u0230\1\u0231\2\uffff\1\63\1\u0233\1\uffff\3\63\1\uffff\2\63\1\u0239\4\uffff\1\63\1\u023b\1\u023c\3\uffff\1\u023d\1\63\2\uffff\1\63\1\uffff\5\63\1\uffff\1\63\3\uffff\1\63\1\u0247\4\63\1\u024c\2\63\1\uffff\4\63\1\uffff\7\63\1\u025a\1\63\1\u025c\1\u025d\2\63\1\uffff\1\63\2\uffff\2\63\1\u0263\1\63\1\u0265\1\uffff\1\u0266\2\uffff";
    static final String DFA21_eofS =
        "\u0267\uffff";
    static final String DFA21_minS =
        "\1\0\1\156\1\157\1\uffff\1\141\1\uffff\1\141\1\uffff\2\141\1\157\3\141\1\157\1\145\2\157\1\145\1\141\1\146\1\170\1\141\1\151\1\156\1\141\1\171\2\141\1\171\1\146\1\160\1\141\1\120\1\156\4\145\2\56\1\60\1\101\1\uffff\2\0\1\52\2\uffff\1\171\1\151\1\uffff\1\142\1\uffff\1\155\1\uffff\1\143\1\155\1\154\1\163\1\uffff\1\143\1\155\1\163\1\162\1\144\1\162\1\163\1\146\1\156\1\155\1\154\1\163\1\154\1\144\1\155\1\167\1\156\2\151\1\160\1\170\1\165\1\151\3\154\1\151\1\146\1\151\2\146\1\150\1\172\1\141\1\155\1\145\1\170\1\171\1\172\1\171\1\146\1\163\1\144\1\142\1\172\4\154\1\151\1\154\1\156\1\146\1\160\1\146\1\150\1\145\1\157\1\145\1\163\1\162\2\157\1\170\3\uffff\2\56\4\uffff\1\125\1\163\1\157\1\145\1\162\1\145\1\163\1\151\1\164\1\150\1\162\1\145\1\163\1\151\1\150\1\141\1\171\1\60\1\141\1\145\2\141\1\160\2\165\1\157\1\142\1\171\1\60\1\153\1\151\1\145\1\147\2\156\1\145\1\164\1\145\1\154\1\151\1\154\1\151\1\147\2\163\1\145\1\164\2\145\1\154\1\153\1\151\1\162\7\60\1\145\2\151\1\141\1\60\1\151\1\154\1\151\1\154\1\143\1\145\1\141\1\157\3\145\1\154\1\163\1\162\1\165\1\142\2\155\1\164\1\56\1\122\1\60\1\164\1\60\1\157\1\162\1\60\1\143\1\151\1\60\1\157\1\162\1\60\1\143\1\60\1\155\1\156\1\60\1\uffff\1\155\1\60\1\165\1\155\1\151\1\145\1\141\1\143\1\157\1\60\1\uffff\1\60\1\164\1\162\3\164\1\60\1\165\1\60\1\144\1\142\1\151\1\162\1\156\1\151\1\145\1\60\1\164\1\114\1\162\1\60\1\145\1\60\2\164\7\uffff\1\162\1\156\1\165\1\60\1\uffff\1\142\1\151\1\162\1\156\1\151\1\145\1\164\1\156\1\155\2\162\1\164\1\162\1\157\1\151\1\164\1\141\1\157\2\145\1\165\1\111\1\uffff\1\60\1\uffff\1\60\1\151\1\uffff\1\60\1\160\1\uffff\1\60\1\151\1\uffff\1\60\1\uffff\1\145\1\164\1\uffff\1\145\1\uffff\1\154\1\151\1\156\1\60\1\154\1\151\1\163\2\uffff\2\60\1\150\2\60\1\uffff\1\162\1\uffff\1\60\1\162\1\163\1\60\1\144\1\156\1\164\1\uffff\1\171\1\157\1\160\1\145\1\uffff\1\60\1\uffff\1\60\1\151\1\145\1\147\1\163\1\uffff\1\162\1\163\1\60\1\144\1\156\1\60\1\151\1\141\1\151\1\164\1\60\1\171\1\145\1\143\1\164\1\151\1\154\1\163\2\164\1\162\1\60\2\uffff\1\141\1\uffff\1\154\1\uffff\1\141\1\uffff\1\164\1\60\2\164\1\143\1\147\1\uffff\1\60\1\164\1\145\2\uffff\1\60\2\uffff\1\145\1\uffff\1\141\1\151\1\uffff\1\145\2\60\1\103\1\167\1\160\1\60\2\uffff\1\141\1\156\2\60\1\141\1\151\1\uffff\1\145\1\147\1\157\1\155\1\143\1\60\1\uffff\1\103\1\60\2\151\1\141\1\60\1\145\2\162\1\145\1\uffff\1\154\1\151\1\154\1\145\1\uffff\1\145\1\60\1\163\1\60\1\uffff\1\171\1\60\1\uffff\1\60\1\164\1\157\1\162\2\uffff\1\157\2\145\1\uffff\1\60\1\143\2\uffff\1\164\1\157\1\162\1\60\1\156\1\145\1\163\1\uffff\1\157\1\uffff\1\164\1\157\1\60\1\uffff\1\60\2\171\2\60\1\145\1\60\2\162\1\uffff\1\60\1\uffff\1\60\2\uffff\1\151\1\156\1\60\1\156\2\162\1\60\1\uffff\1\145\1\151\1\156\1\60\1\uffff\3\60\1\156\1\171\1\156\1\60\2\uffff\2\60\2\uffff\1\162\1\154\1\uffff\2\60\2\uffff\1\157\1\60\1\uffff\1\164\2\114\1\uffff\1\120\1\157\1\60\4\uffff\1\164\2\60\3\uffff\1\60\1\157\2\uffff\1\156\1\uffff\1\162\2\151\1\157\1\156\1\uffff\1\162\3\uffff\1\142\1\60\1\157\2\155\1\163\1\60\1\157\1\141\1\uffff\1\154\3\151\1\uffff\3\154\3\164\1\154\1\60\1\145\2\60\1\151\1\145\1\uffff\1\162\2\uffff\1\157\1\162\1\60\1\156\1\60\1\uffff\1\60\2\uffff";
    static final String DFA21_maxS =
        "\1\uffff\1\170\1\157\1\uffff\1\141\1\uffff\1\165\1\uffff\1\151\1\141\2\157\1\171\1\151\4\157\2\171\1\162\1\170\1\160\1\151\1\172\1\160\2\171\1\162\1\171\1\146\2\160\1\126\1\156\1\151\5\145\1\71\1\172\1\uffff\2\uffff\1\57\2\uffff\1\171\1\151\1\uffff\1\142\1\uffff\1\155\1\uffff\1\164\1\155\1\154\1\163\1\uffff\1\164\1\155\1\163\1\162\1\170\1\162\1\163\1\146\1\156\1\155\1\154\1\163\1\162\1\170\1\156\1\167\1\156\2\151\1\160\1\170\1\165\1\151\3\154\1\151\1\146\1\151\2\146\1\150\1\172\1\141\1\156\1\145\3\172\1\171\1\146\1\163\1\144\1\142\1\172\4\154\1\151\1\154\1\156\1\146\1\160\1\146\1\150\1\145\1\157\1\145\1\163\1\162\2\157\1\170\3\uffff\2\145\4\uffff\1\125\1\163\1\157\1\145\1\162\1\145\1\163\1\151\1\164\1\150\1\162\1\145\1\163\1\151\1\150\1\145\1\171\1\172\1\141\1\145\2\141\1\160\2\165\1\157\1\142\1\171\1\172\1\153\1\151\1\145\1\147\2\156\1\145\1\164\1\145\1\154\1\151\1\157\1\151\1\147\2\163\1\145\1\164\2\145\1\154\1\153\1\151\1\162\7\172\1\145\2\151\1\141\1\172\1\151\1\157\1\151\1\163\1\143\1\145\1\141\1\157\3\145\1\154\1\163\1\162\1\165\1\142\2\155\1\164\1\145\1\122\1\172\1\164\1\172\1\157\1\162\1\172\1\143\1\151\1\172\1\157\1\162\1\172\1\143\1\172\1\155\1\156\1\172\1\uffff\1\155\1\172\1\165\1\155\1\151\1\145\1\141\1\143\1\157\1\172\1\uffff\1\172\1\164\1\162\3\164\1\172\1\165\1\172\1\144\1\142\1\151\1\162\1\156\1\151\1\145\1\172\1\164\1\125\1\162\1\172\1\145\1\172\2\164\7\uffff\1\162\1\156\1\165\1\172\1\uffff\1\142\1\151\1\162\1\156\1\151\1\145\1\164\1\156\1\155\2\162\1\164\1\162\1\157\1\151\1\164\1\141\1\157\2\145\1\165\1\111\1\uffff\1\172\1\uffff\1\172\1\151\1\uffff\1\172\1\160\1\uffff\1\172\1\151\1\uffff\1\172\1\uffff\1\145\1\164\1\uffff\1\145\1\uffff\1\154\1\151\1\156\1\172\1\154\1\151\1\163\2\uffff\2\172\1\150\2\172\1\uffff\1\162\1\uffff\1\172\1\162\1\163\1\172\1\144\1\156\1\164\1\uffff\1\171\1\157\1\160\1\145\1\uffff\1\172\1\uffff\1\172\1\151\1\145\1\147\1\163\1\uffff\1\162\1\163\1\172\1\144\1\156\1\172\1\151\1\141\1\151\1\164\1\172\1\171\1\145\1\143\1\164\1\151\1\154\1\163\2\164\1\162\1\172\2\uffff\1\141\1\uffff\1\154\1\uffff\1\141\1\uffff\1\164\1\172\2\164\1\143\1\147\1\uffff\1\172\1\164\1\145\2\uffff\1\172\2\uffff\1\145\1\uffff\1\141\1\151\1\uffff\1\145\2\172\1\103\1\167\1\160\1\172\2\uffff\1\141\1\156\2\172\1\141\1\151\1\uffff\1\145\1\147\1\157\1\155\1\143\1\172\1\uffff\1\103\1\172\2\151\1\141\1\172\1\145\2\162\1\145\1\uffff\1\154\1\151\1\154\1\145\1\uffff\1\145\1\172\1\163\1\172\1\uffff\1\171\1\172\1\uffff\1\172\1\164\1\157\1\162\2\uffff\1\157\2\145\1\uffff\1\172\1\143\2\uffff\1\164\1\157\1\162\1\172\1\156\1\145\1\163\1\uffff\1\157\1\uffff\1\164\1\157\1\172\1\uffff\1\172\2\171\2\172\1\145\1\172\2\162\1\uffff\1\172\1\uffff\1\172\2\uffff\1\151\1\156\1\172\1\156\2\162\1\172\1\uffff\1\145\1\151\1\156\1\172\1\uffff\3\172\1\156\1\171\1\156\1\172\2\uffff\2\172\2\uffff\1\162\1\154\1\uffff\2\172\2\uffff\1\157\1\172\1\uffff\1\164\2\114\1\uffff\1\120\1\157\1\172\4\uffff\1\164\2\172\3\uffff\1\172\1\157\2\uffff\1\156\1\uffff\1\162\2\151\1\157\1\156\1\uffff\1\162\3\uffff\1\142\1\172\1\157\2\155\1\163\1\172\1\157\1\141\1\uffff\1\154\3\151\1\uffff\3\154\3\164\1\154\1\172\1\145\2\172\1\151\1\145\1\uffff\1\162\2\uffff\1\157\1\162\1\172\1\156\1\172\1\uffff\1\172\2\uffff";
    static final String DFA21_acceptS =
        "\3\uffff\1\3\1\uffff\1\5\1\uffff\1\7\43\uffff\1\141\3\uffff\1\146\1\147\2\uffff\1\141\1\uffff\1\3\1\uffff\1\5\4\uffff\1\7\100\uffff\1\140\1\137\1\142\2\uffff\1\143\1\144\1\145\1\146\147\uffff\1\114\12\uffff\1\121\31\uffff\1\105\1\106\1\107\1\110\1\111\1\112\1\45\4\uffff\1\46\26\uffff\1\47\1\uffff\1\4\2\uffff\1\75\2\uffff\1\117\2\uffff\1\103\1\uffff\1\127\2\uffff\1\12\1\uffff\1\44\7\uffff\1\16\1\17\5\uffff\1\23\1\uffff\1\136\7\uffff\1\27\4\uffff\1\122\1\uffff\1\35\5\uffff\1\133\26\uffff\1\2\1\6\1\uffff\1\34\1\uffff\1\10\1\uffff\1\71\6\uffff\1\15\3\uffff\1\32\1\61\1\uffff\1\20\1\22\1\uffff\1\25\2\uffff\1\42\7\uffff\1\131\1\57\6\uffff\1\132\6\uffff\1\62\12\uffff\1\1\4\uffff\1\24\4\uffff\1\37\2\uffff\1\124\4\uffff\1\26\1\73\3\uffff\1\116\2\uffff\1\53\1\125\7\uffff\1\60\1\uffff\1\126\3\uffff\1\77\11\uffff\1\14\1\uffff\1\55\1\uffff\1\102\1\43\7\uffff\1\76\4\uffff\1\51\7\uffff\1\104\1\135\2\uffff\1\134\1\21\2\uffff\1\120\2\uffff\1\31\1\63\2\uffff\1\115\3\uffff\1\36\3\uffff\1\123\1\56\1\130\1\54\3\uffff\1\74\1\100\1\113\2\uffff\1\11\1\13\1\uffff\1\40\5\uffff\1\101\1\uffff\1\65\1\66\1\72\11\uffff\1\30\4\uffff\1\50\15\uffff\1\41\1\uffff\1\67\1\70\5\uffff\1\33\1\uffff\1\64\1\52";
    static final String DFA21_specialS =
        "\1\2\53\uffff\1\0\1\1\u0239\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\60\2\57\2\60\1\57\22\60\1\57\1\60\1\54\4\60\1\55\4\60\1\7\1\51\1\60\1\56\1\47\11\50\7\60\1\1\1\16\1\33\1\35\2\53\1\45\1\53\1\42\1\21\1\53\1\27\1\10\2\53\1\13\1\53\1\2\1\40\1\46\1\53\1\43\4\53\3\60\1\52\1\53\1\60\1\25\1\12\1\23\1\14\1\36\1\34\1\44\1\53\1\30\1\20\1\41\1\17\1\6\1\4\1\24\1\11\1\53\1\31\1\26\1\22\1\37\1\15\1\53\1\32\2\53\1\3\1\60\1\5\uff82\60",
            "\1\61\11\uffff\1\62",
            "\1\64",
            "",
            "\1\66",
            "",
            "\1\70\3\uffff\1\73\3\uffff\1\71\13\uffff\1\72",
            "",
            "\1\75\3\uffff\1\77\3\uffff\1\76",
            "\1\100",
            "\1\101",
            "\1\102\15\uffff\1\103",
            "\1\106\3\uffff\1\104\23\uffff\1\105",
            "\1\107\3\uffff\1\111\3\uffff\1\110",
            "\1\112",
            "\1\115\3\uffff\1\113\5\uffff\1\114",
            "\1\116",
            "\1\117",
            "\1\121\14\uffff\1\122\6\uffff\1\120",
            "\1\124\6\uffff\1\123\6\uffff\1\125\11\uffff\1\126",
            "\1\130\13\uffff\1\127",
            "\1\131",
            "\1\132\1\uffff\1\136\5\uffff\1\135\5\uffff\1\133\1\134",
            "\1\137",
            "\1\140\11\uffff\1\141\1\142\1\143",
            "\1\147\3\uffff\1\145\1\uffff\1\150\1\uffff\1\146\6\uffff\1\144",
            "\1\151",
            "\1\152\15\uffff\1\153\11\uffff\1\154",
            "\1\155\7\uffff\1\157\10\uffff\1\156",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163\16\uffff\1\164",
            "\1\166\5\uffff\1\165",
            "\1\167",
            "\1\171\3\uffff\1\170",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\176\1\uffff\12\177\13\uffff\1\176\37\uffff\1\176",
            "\1\176\1\uffff\12\u0080\13\uffff\1\176\37\uffff\1\176",
            "\12\u0081",
            "\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\0\u0082",
            "\0\u0082",
            "\1\u0083\4\uffff\1\u0084",
            "",
            "",
            "\1\u0086",
            "\1\u0087",
            "",
            "\1\u0088",
            "",
            "\1\u0089",
            "",
            "\1\u008a\17\uffff\1\u008c\1\u008b",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "",
            "\1\u0090\17\uffff\1\u0092\1\u0091",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096\23\uffff\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f\5\uffff\1\u00a0",
            "\1\u00a1\23\uffff\1\u00a2",
            "\1\u00a4\1\u00a3",
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
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b9\1\u00b8",
            "\1\u00ba",
            "\1\u00bb\1\u00bc\1\u00bd",
            "\1\u00be\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
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
            "",
            "",
            "",
            "\1\176\1\uffff\12\u0080\13\uffff\1\176\37\uffff\1\176",
            "\1\176\1\uffff\12\u00da\13\uffff\1\176\37\uffff\1\176",
            "",
            "",
            "",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea\3\uffff\1\u00eb",
            "\1\u00ec",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
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
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104\2\uffff\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u011e",
            "\1\u011f\2\uffff\1\u0120",
            "\1\u0121",
            "\1\u0122\6\uffff\1\u0123",
            "\1\u0124",
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
            "\1\176\1\uffff\12\u00da\13\uffff\1\176\37\uffff\1\176",
            "\1\u0133",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0135",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0137",
            "\1\u0138",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u013a",
            "\1\u013b",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u013d",
            "\1\u013e",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0140",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0142",
            "\1\u0143",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0145",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0156",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0160",
            "\1\u0161\10\uffff\1\u0162",
            "\1\u0163",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0165",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0167",
            "\1\u0168",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0185",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0187",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0189",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u018b",
            "\1\u018c",
            "",
            "\1\u018d",
            "",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0197",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u019a",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u019c",
            "\1\u019d",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "",
            "\1\u01ac",
            "\1\u01ad",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01af",
            "\1\u01b0",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\1\u01c1",
            "",
            "\1\u01c2",
            "",
            "\1\u01c3",
            "",
            "\1\u01c4",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01cb",
            "\1\u01cc",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\1\u01ce",
            "",
            "\1\u01cf",
            "\1\u01d0",
            "",
            "\1\u01d1",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\1\u01d8",
            "\1\u01d9",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01dc",
            "\1\u01dd",
            "",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u01e4",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "",
            "\1\u01f2",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01f4",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u01f6",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "",
            "",
            "\1\u01fc",
            "\1\u01fd",
            "\1\u01fe",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u01ff\16\63",
            "\1\u0201",
            "",
            "",
            "\1\u0202",
            "\1\u0203",
            "\1\u0204",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "",
            "\1\u0209",
            "",
            "\1\u020a",
            "\1\u020b",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u020c\16\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u020f",
            "\1\u0210",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0213",
            "\12\63\7\uffff\6\63\1\u0214\23\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0216",
            "\1\u0217",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\1\u021a",
            "\1\u021b",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u021d",
            "\1\u021e",
            "\1\u021f",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0221",
            "\1\u0222",
            "\1\u0223",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\1\u022e",
            "\1\u022f",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\1\u0232",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0234",
            "\1\u0235",
            "\1\u0236",
            "",
            "\1\u0237",
            "\1\u0238",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "",
            "",
            "\1\u023a",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u023e",
            "",
            "",
            "\1\u023f",
            "",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "",
            "\1\u0245",
            "",
            "",
            "",
            "\1\u0246",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0248",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u024d",
            "\1\u024e",
            "",
            "\1\u024f",
            "\1\u0250",
            "\1\u0251",
            "\1\u0252",
            "",
            "\1\u0253",
            "\1\u0254",
            "\1\u0255",
            "\1\u0256",
            "\1\u0257",
            "\1\u0258",
            "\1\u0259",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u025b",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u025e",
            "\1\u025f",
            "",
            "\1\u0260",
            "",
            "",
            "\1\u0261",
            "\1\u0262",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0264",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
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
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_44 = input.LA(1);

                        s = -1;
                        if ( ((LA21_44>='\u0000' && LA21_44<='\uFFFF')) ) {s = 130;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_45 = input.LA(1);

                        s = -1;
                        if ( ((LA21_45>='\u0000' && LA21_45<='\uFFFF')) ) {s = 130;}

                        else s = 48;

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

                        else if ( (LA21_0=='m') ) {s = 6;}

                        else if ( (LA21_0==',') ) {s = 7;}

                        else if ( (LA21_0=='M') ) {s = 8;}

                        else if ( (LA21_0=='p') ) {s = 9;}

                        else if ( (LA21_0=='b') ) {s = 10;}

                        else if ( (LA21_0=='P') ) {s = 11;}

                        else if ( (LA21_0=='d') ) {s = 12;}

                        else if ( (LA21_0=='v') ) {s = 13;}

                        else if ( (LA21_0=='B') ) {s = 14;}

                        else if ( (LA21_0=='l') ) {s = 15;}

                        else if ( (LA21_0=='j') ) {s = 16;}

                        else if ( (LA21_0=='J') ) {s = 17;}

                        else if ( (LA21_0=='t') ) {s = 18;}

                        else if ( (LA21_0=='c') ) {s = 19;}

                        else if ( (LA21_0=='o') ) {s = 20;}

                        else if ( (LA21_0=='a') ) {s = 21;}

                        else if ( (LA21_0=='s') ) {s = 22;}

                        else if ( (LA21_0=='L') ) {s = 23;}

                        else if ( (LA21_0=='i') ) {s = 24;}

                        else if ( (LA21_0=='r') ) {s = 25;}

                        else if ( (LA21_0=='x') ) {s = 26;}

                        else if ( (LA21_0=='C') ) {s = 27;}

                        else if ( (LA21_0=='f') ) {s = 28;}

                        else if ( (LA21_0=='D') ) {s = 29;}

                        else if ( (LA21_0=='e') ) {s = 30;}

                        else if ( (LA21_0=='u') ) {s = 31;}

                        else if ( (LA21_0=='S') ) {s = 32;}

                        else if ( (LA21_0=='k') ) {s = 33;}

                        else if ( (LA21_0=='I') ) {s = 34;}

                        else if ( (LA21_0=='V') ) {s = 35;}

                        else if ( (LA21_0=='g') ) {s = 36;}

                        else if ( (LA21_0=='G') ) {s = 37;}

                        else if ( (LA21_0=='T') ) {s = 38;}

                        else if ( (LA21_0=='0') ) {s = 39;}

                        else if ( ((LA21_0>='1' && LA21_0<='9')) ) {s = 40;}

                        else if ( (LA21_0=='-') ) {s = 41;}

                        else if ( (LA21_0=='^') ) {s = 42;}

                        else if ( ((LA21_0>='E' && LA21_0<='F')||LA21_0=='H'||LA21_0=='K'||(LA21_0>='N' && LA21_0<='O')||LA21_0=='Q'||LA21_0=='U'||(LA21_0>='W' && LA21_0<='Z')||LA21_0=='_'||LA21_0=='h'||LA21_0=='q'||LA21_0=='w'||(LA21_0>='y' && LA21_0<='z')) ) {s = 43;}

                        else if ( (LA21_0=='\"') ) {s = 44;}

                        else if ( (LA21_0=='\'') ) {s = 45;}

                        else if ( (LA21_0=='/') ) {s = 46;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 47;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||LA21_0=='!'||(LA21_0>='#' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='+')||LA21_0=='.'||(LA21_0>=':' && LA21_0<='@')||(LA21_0>='[' && LA21_0<=']')||LA21_0=='`'||LA21_0=='|'||(LA21_0>='~' && LA21_0<='\uFFFF')) ) {s = 48;}

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