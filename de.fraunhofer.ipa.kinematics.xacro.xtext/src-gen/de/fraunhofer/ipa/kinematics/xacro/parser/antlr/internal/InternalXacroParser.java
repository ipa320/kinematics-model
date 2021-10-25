package de.fraunhofer.ipa.kinematics.xacro.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.ipa.kinematics.xacro.services.XacroGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXacroParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_JOINTTYPE", "RULE_DOUBLE", "RULE_DIGIT", "RULE_BOOLEAN", "RULE_DECINT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'{'", "'name'", "'version'", "'macro'", "','", "'}'", "'body'", "'Macro'", "'parameter'", "'Parameter'", "'default'", "'value'", "'Body'", "'link'", "'joint'", "'material'", "'transmission'", "'Joint'", "'type'", "'parent'", "'child'", "'origin'", "'axis'", "'calibration'", "'dynamics'", "'limit'", "'safetyController'", "'mimic'", "'Link'", "'inertial'", "'visual'", "'collision'", "'MaterialGlobal'", "'color'", "'texture'", "'Transmission'", "'mechanicalReduction'", "'leftActuator'", "'rightActuator'", "'flexJoint'", "'rollJoint'", "'gapJoint'", "'passiveJoint'", "'useSimulatedGripperJoint'", "'actuator'", "'Pose'", "'rpy'", "'xyz'", "'Axis'", "'Calibration'", "'falling'", "'referencePosition'", "'rising'", "'Dynamics'", "'damping'", "'friction'", "'Limit'", "'effort'", "'lower'", "'upper'", "'velocity'", "'SafetyController'", "'kPosition'", "'kVelocity'", "'softLowerLimit'", "'softUpperLimit'", "'Mimic'", "'multiplier'", "'offset'", "'Inertial'", "'mass'", "'inertia'", "'Visual'", "'geometry'", "'Collision'", "'verbose'", "'Mass'", "'Inertia'", "'ixx'", "'ixy'", "'ixz'", "'iyy'", "'iyz'", "'izz'", "'Geometry'", "'box'", "'cylinder'", "'sphere'", "'mesh'", "'Material'", "'Box'", "'size'", "'Cylinder'", "'length'", "'radius'", "'Sphere'", "'Mesh'", "'filename'", "'scale'", "'AnyURI'", "'Color'", "'rgba'", "'Texture'", "'Verbose'", "'ActuatorTransmission'", "'GapJointTransmission'", "'a'", "'b'", "'gearRatio'", "'h'", "'l0'", "'phi0'", "'r'", "'screwReduction'", "'t0'", "'theta0'", "'PassiveJointTransmission'", "'UseSimulatedGripperJointType'", "'Name'"
    };
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
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=5;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_DIGIT=8;
    public static final int RULE_INT=11;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=12;
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
    public static final int RULE_DECINT=10;
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
    public static final int RULE_BOOLEAN=9;
    public static final int T__19=19;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_DOUBLE=7;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int RULE_JOINTTYPE=6;
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
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
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


        public InternalXacroParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXacroParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXacroParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXacro.g"; }



     	private XacroGrammarAccess grammarAccess;

        public InternalXacroParser(TokenStream input, XacroGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Robot";
       	}

       	@Override
       	protected XacroGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRobot"
    // InternalXacro.g:64:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalXacro.g:64:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalXacro.g:65:2: iv_ruleRobot= ruleRobot EOF
            {
             newCompositeNode(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobot=ruleRobot();

            state._fsp--;

             current =iv_ruleRobot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalXacro.g:71:1: ruleRobot returns [EObject current=null] : ( () otherlv_1= 'Robot' otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) ) )? (otherlv_7= 'macro' otherlv_8= '{' ( (lv_macro_9_0= ruleMacro ) ) (otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) ) )* otherlv_12= '}' )? (otherlv_13= 'body' ( (lv_body_14_0= ruleBody ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_version_6_0 = null;

        EObject lv_macro_9_0 = null;

        EObject lv_macro_11_0 = null;

        EObject lv_body_14_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:77:2: ( ( () otherlv_1= 'Robot' otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) ) )? (otherlv_7= 'macro' otherlv_8= '{' ( (lv_macro_9_0= ruleMacro ) ) (otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) ) )* otherlv_12= '}' )? (otherlv_13= 'body' ( (lv_body_14_0= ruleBody ) ) )? otherlv_15= '}' ) )
            // InternalXacro.g:78:2: ( () otherlv_1= 'Robot' otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) ) )? (otherlv_7= 'macro' otherlv_8= '{' ( (lv_macro_9_0= ruleMacro ) ) (otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) ) )* otherlv_12= '}' )? (otherlv_13= 'body' ( (lv_body_14_0= ruleBody ) ) )? otherlv_15= '}' )
            {
            // InternalXacro.g:78:2: ( () otherlv_1= 'Robot' otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) ) )? (otherlv_7= 'macro' otherlv_8= '{' ( (lv_macro_9_0= ruleMacro ) ) (otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) ) )* otherlv_12= '}' )? (otherlv_13= 'body' ( (lv_body_14_0= ruleBody ) ) )? otherlv_15= '}' )
            // InternalXacro.g:79:3: () otherlv_1= 'Robot' otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) ) )? (otherlv_7= 'macro' otherlv_8= '{' ( (lv_macro_9_0= ruleMacro ) ) (otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) ) )* otherlv_12= '}' )? (otherlv_13= 'body' ( (lv_body_14_0= ruleBody ) ) )? otherlv_15= '}'
            {
            // InternalXacro.g:79:3: ()
            // InternalXacro.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRobotAccess().getRobotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotAccess().getRobotKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRobotAccess().getNameKeyword_3());
            		
            // InternalXacro.g:98:3: ( (lv_name_4_0= ruleEString ) )
            // InternalXacro.g:99:4: (lv_name_4_0= ruleEString )
            {
            // InternalXacro.g:99:4: (lv_name_4_0= ruleEString )
            // InternalXacro.g:100:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRobotAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXacro.g:117:3: (otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalXacro.g:118:4: otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getRobotAccess().getVersionKeyword_5_0());
                    			
                    // InternalXacro.g:122:4: ( (lv_version_6_0= ruleEString ) )
                    // InternalXacro.g:123:5: (lv_version_6_0= ruleEString )
                    {
                    // InternalXacro.g:123:5: (lv_version_6_0= ruleEString )
                    // InternalXacro.g:124:6: lv_version_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getVersionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_version_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    						}
                    						set(
                    							current,
                    							"version",
                    							lv_version_6_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:142:3: (otherlv_7= 'macro' otherlv_8= '{' ( (lv_macro_9_0= ruleMacro ) ) (otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) ) )* otherlv_12= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalXacro.g:143:4: otherlv_7= 'macro' otherlv_8= '{' ( (lv_macro_9_0= ruleMacro ) ) (otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getRobotAccess().getMacroKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalXacro.g:151:4: ( (lv_macro_9_0= ruleMacro ) )
                    // InternalXacro.g:152:5: (lv_macro_9_0= ruleMacro )
                    {
                    // InternalXacro.g:152:5: (lv_macro_9_0= ruleMacro )
                    // InternalXacro.g:153:6: lv_macro_9_0= ruleMacro
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getMacroMacroParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_macro_9_0=ruleMacro();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    						}
                    						add(
                    							current,
                    							"macro",
                    							lv_macro_9_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Macro");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXacro.g:170:4: (otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==21) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalXacro.g:171:5: otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) )
                    	    {
                    	    otherlv_10=(Token)match(input,21,FOLLOW_8); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getRobotAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalXacro.g:175:5: ( (lv_macro_11_0= ruleMacro ) )
                    	    // InternalXacro.g:176:6: (lv_macro_11_0= ruleMacro )
                    	    {
                    	    // InternalXacro.g:176:6: (lv_macro_11_0= ruleMacro )
                    	    // InternalXacro.g:177:7: lv_macro_11_0= ruleMacro
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobotAccess().getMacroMacroParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_macro_11_0=ruleMacro();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRobotRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"macro",
                    	    								lv_macro_11_0,
                    	    								"de.fraunhofer.ipa.kinematics.xacro.Xacro.Macro");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,22,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:200:3: (otherlv_13= 'body' ( (lv_body_14_0= ruleBody ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalXacro.g:201:4: otherlv_13= 'body' ( (lv_body_14_0= ruleBody ) )
                    {
                    otherlv_13=(Token)match(input,23,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getRobotAccess().getBodyKeyword_7_0());
                    			
                    // InternalXacro.g:205:4: ( (lv_body_14_0= ruleBody ) )
                    // InternalXacro.g:206:5: (lv_body_14_0= ruleBody )
                    {
                    // InternalXacro.g:206:5: (lv_body_14_0= ruleBody )
                    // InternalXacro.g:207:6: lv_body_14_0= ruleBody
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getBodyBodyParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_body_14_0=ruleBody();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_14_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Body");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleEString"
    // InternalXacro.g:233:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalXacro.g:233:47: (iv_ruleEString= ruleEString EOF )
            // InternalXacro.g:234:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalXacro.g:240:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalXacro.g:246:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalXacro.g:247:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalXacro.g:247:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalXacro.g:248:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXacro.g:256:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleMacro"
    // InternalXacro.g:267:1: entryRuleMacro returns [EObject current=null] : iv_ruleMacro= ruleMacro EOF ;
    public final EObject entryRuleMacro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacro = null;


        try {
            // InternalXacro.g:267:46: (iv_ruleMacro= ruleMacro EOF )
            // InternalXacro.g:268:2: iv_ruleMacro= ruleMacro EOF
            {
             newCompositeNode(grammarAccess.getMacroRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMacro=ruleMacro();

            state._fsp--;

             current =iv_ruleMacro; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMacro"


    // $ANTLR start "ruleMacro"
    // InternalXacro.g:274:1: ruleMacro returns [EObject current=null] : (otherlv_0= 'Macro' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'body' ( (lv_body_11_0= ruleBody ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleMacro() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_parameter_6_0 = null;

        EObject lv_parameter_8_0 = null;

        EObject lv_body_11_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:280:2: ( (otherlv_0= 'Macro' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'body' ( (lv_body_11_0= ruleBody ) ) )? otherlv_12= '}' ) )
            // InternalXacro.g:281:2: (otherlv_0= 'Macro' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'body' ( (lv_body_11_0= ruleBody ) ) )? otherlv_12= '}' )
            {
            // InternalXacro.g:281:2: (otherlv_0= 'Macro' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'body' ( (lv_body_11_0= ruleBody ) ) )? otherlv_12= '}' )
            // InternalXacro.g:282:3: otherlv_0= 'Macro' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'body' ( (lv_body_11_0= ruleBody ) ) )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMacroAccess().getMacroKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMacroAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMacroAccess().getNameKeyword_2());
            		
            // InternalXacro.g:294:3: ( (lv_name_3_0= ruleEString ) )
            // InternalXacro.g:295:4: (lv_name_3_0= ruleEString )
            {
            // InternalXacro.g:295:4: (lv_name_3_0= ruleEString )
            // InternalXacro.g:296:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMacroAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMacroRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXacro.g:313:3: (otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXacro.g:314:4: otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getMacroAccess().getParameterKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getMacroAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalXacro.g:322:4: ( (lv_parameter_6_0= ruleParameter ) )
                    // InternalXacro.g:323:5: (lv_parameter_6_0= ruleParameter )
                    {
                    // InternalXacro.g:323:5: (lv_parameter_6_0= ruleParameter )
                    // InternalXacro.g:324:6: lv_parameter_6_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getMacroAccess().getParameterParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_parameter_6_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMacroRule());
                    						}
                    						add(
                    							current,
                    							"parameter",
                    							lv_parameter_6_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXacro.g:341:4: (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==21) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalXacro.g:342:5: otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,21,FOLLOW_14); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getMacroAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalXacro.g:346:5: ( (lv_parameter_8_0= ruleParameter ) )
                    	    // InternalXacro.g:347:6: (lv_parameter_8_0= ruleParameter )
                    	    {
                    	    // InternalXacro.g:347:6: (lv_parameter_8_0= ruleParameter )
                    	    // InternalXacro.g:348:7: lv_parameter_8_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getMacroAccess().getParameterParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_parameter_8_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMacroRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameter",
                    	    								lv_parameter_8_0,
                    	    								"de.fraunhofer.ipa.kinematics.xacro.Xacro.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,22,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getMacroAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:371:3: (otherlv_10= 'body' ( (lv_body_11_0= ruleBody ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXacro.g:372:4: otherlv_10= 'body' ( (lv_body_11_0= ruleBody ) )
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getMacroAccess().getBodyKeyword_5_0());
                    			
                    // InternalXacro.g:376:4: ( (lv_body_11_0= ruleBody ) )
                    // InternalXacro.g:377:5: (lv_body_11_0= ruleBody )
                    {
                    // InternalXacro.g:377:5: (lv_body_11_0= ruleBody )
                    // InternalXacro.g:378:6: lv_body_11_0= ruleBody
                    {

                    						newCompositeNode(grammarAccess.getMacroAccess().getBodyBodyParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_body_11_0=ruleBody();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMacroRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_11_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Body");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getMacroAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMacro"


    // $ANTLR start "entryRuleParameter"
    // InternalXacro.g:404:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalXacro.g:404:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalXacro.g:405:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalXacro.g:411:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'default' ( (lv_default_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_default_5_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:417:2: ( ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'default' ( (lv_default_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalXacro.g:418:2: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'default' ( (lv_default_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalXacro.g:418:2: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'default' ( (lv_default_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // InternalXacro.g:419:3: () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'default' ( (lv_default_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalXacro.g:419:3: ()
            // InternalXacro.g:420:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getParameterKeyword_1());
            		
            // InternalXacro.g:430:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXacro.g:431:4: (lv_name_2_0= ruleEString )
            {
            // InternalXacro.g:431:4: (lv_name_2_0= ruleEString )
            // InternalXacro.g:432:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXacro.g:453:3: (otherlv_4= 'default' ( (lv_default_5_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXacro.g:454:4: otherlv_4= 'default' ( (lv_default_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getDefaultKeyword_4_0());
                    			
                    // InternalXacro.g:458:4: ( (lv_default_5_0= ruleEString ) )
                    // InternalXacro.g:459:5: (lv_default_5_0= ruleEString )
                    {
                    // InternalXacro.g:459:5: (lv_default_5_0= ruleEString )
                    // InternalXacro.g:460:6: lv_default_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getDefaultEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_default_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_5_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:478:3: (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXacro.g:479:4: otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getValueKeyword_5_0());
                    			
                    // InternalXacro.g:483:4: ( (lv_value_7_0= ruleEString ) )
                    // InternalXacro.g:484:5: (lv_value_7_0= ruleEString )
                    {
                    // InternalXacro.g:484:5: (lv_value_7_0= ruleEString )
                    // InternalXacro.g:485:6: lv_value_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getValueEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_value_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleBody"
    // InternalXacro.g:511:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // InternalXacro.g:511:45: (iv_ruleBody= ruleBody EOF )
            // InternalXacro.g:512:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // InternalXacro.g:518:1: ruleBody returns [EObject current=null] : ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}' )? (otherlv_15= 'material' otherlv_16= '{' ( (lv_material_17_0= ruleMaterialGlobal ) ) (otherlv_18= ',' ( (lv_material_19_0= ruleMaterialGlobal ) ) )* otherlv_20= '}' )? (otherlv_21= 'transmission' otherlv_22= '{' ( (lv_transmission_23_0= ruleTransmission ) ) (otherlv_24= ',' ( (lv_transmission_25_0= ruleTransmission ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        EObject lv_link_5_0 = null;

        EObject lv_link_7_0 = null;

        EObject lv_joint_11_0 = null;

        EObject lv_joint_13_0 = null;

        EObject lv_material_17_0 = null;

        EObject lv_material_19_0 = null;

        EObject lv_transmission_23_0 = null;

        EObject lv_transmission_25_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:524:2: ( ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}' )? (otherlv_15= 'material' otherlv_16= '{' ( (lv_material_17_0= ruleMaterialGlobal ) ) (otherlv_18= ',' ( (lv_material_19_0= ruleMaterialGlobal ) ) )* otherlv_20= '}' )? (otherlv_21= 'transmission' otherlv_22= '{' ( (lv_transmission_23_0= ruleTransmission ) ) (otherlv_24= ',' ( (lv_transmission_25_0= ruleTransmission ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // InternalXacro.g:525:2: ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}' )? (otherlv_15= 'material' otherlv_16= '{' ( (lv_material_17_0= ruleMaterialGlobal ) ) (otherlv_18= ',' ( (lv_material_19_0= ruleMaterialGlobal ) ) )* otherlv_20= '}' )? (otherlv_21= 'transmission' otherlv_22= '{' ( (lv_transmission_23_0= ruleTransmission ) ) (otherlv_24= ',' ( (lv_transmission_25_0= ruleTransmission ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // InternalXacro.g:525:2: ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}' )? (otherlv_15= 'material' otherlv_16= '{' ( (lv_material_17_0= ruleMaterialGlobal ) ) (otherlv_18= ',' ( (lv_material_19_0= ruleMaterialGlobal ) ) )* otherlv_20= '}' )? (otherlv_21= 'transmission' otherlv_22= '{' ( (lv_transmission_23_0= ruleTransmission ) ) (otherlv_24= ',' ( (lv_transmission_25_0= ruleTransmission ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // InternalXacro.g:526:3: () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}' )? (otherlv_15= 'material' otherlv_16= '{' ( (lv_material_17_0= ruleMaterialGlobal ) ) (otherlv_18= ',' ( (lv_material_19_0= ruleMaterialGlobal ) ) )* otherlv_20= '}' )? (otherlv_21= 'transmission' otherlv_22= '{' ( (lv_transmission_23_0= ruleTransmission ) ) (otherlv_24= ',' ( (lv_transmission_25_0= ruleTransmission ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // InternalXacro.g:526:3: ()
            // InternalXacro.g:527:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBodyAccess().getBodyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBodyAccess().getBodyKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:541:3: (otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalXacro.g:542:4: otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getBodyAccess().getLinkKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,17,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalXacro.g:550:4: ( (lv_link_5_0= ruleLink ) )
                    // InternalXacro.g:551:5: (lv_link_5_0= ruleLink )
                    {
                    // InternalXacro.g:551:5: (lv_link_5_0= ruleLink )
                    // InternalXacro.g:552:6: lv_link_5_0= ruleLink
                    {

                    						newCompositeNode(grammarAccess.getBodyAccess().getLinkLinkParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_link_5_0=ruleLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBodyRule());
                    						}
                    						add(
                    							current,
                    							"link",
                    							lv_link_5_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Link");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXacro.g:569:4: (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==21) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalXacro.g:570:5: otherlv_6= ',' ( (lv_link_7_0= ruleLink ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_18); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getBodyAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalXacro.g:574:5: ( (lv_link_7_0= ruleLink ) )
                    	    // InternalXacro.g:575:6: (lv_link_7_0= ruleLink )
                    	    {
                    	    // InternalXacro.g:575:6: (lv_link_7_0= ruleLink )
                    	    // InternalXacro.g:576:7: lv_link_7_0= ruleLink
                    	    {

                    	    							newCompositeNode(grammarAccess.getBodyAccess().getLinkLinkParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_link_7_0=ruleLink();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"link",
                    	    								lv_link_7_0,
                    	    								"de.fraunhofer.ipa.kinematics.xacro.Xacro.Link");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,22,FOLLOW_19); 

                    				newLeafNode(otherlv_8, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:599:3: (otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXacro.g:600:4: otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getBodyAccess().getJointKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,17,FOLLOW_20); 

                    				newLeafNode(otherlv_10, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalXacro.g:608:4: ( (lv_joint_11_0= ruleJoint ) )
                    // InternalXacro.g:609:5: (lv_joint_11_0= ruleJoint )
                    {
                    // InternalXacro.g:609:5: (lv_joint_11_0= ruleJoint )
                    // InternalXacro.g:610:6: lv_joint_11_0= ruleJoint
                    {

                    						newCompositeNode(grammarAccess.getBodyAccess().getJointJointParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_joint_11_0=ruleJoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBodyRule());
                    						}
                    						add(
                    							current,
                    							"joint",
                    							lv_joint_11_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Joint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXacro.g:627:4: (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==21) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalXacro.g:628:5: otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) )
                    	    {
                    	    otherlv_12=(Token)match(input,21,FOLLOW_20); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getBodyAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalXacro.g:632:5: ( (lv_joint_13_0= ruleJoint ) )
                    	    // InternalXacro.g:633:6: (lv_joint_13_0= ruleJoint )
                    	    {
                    	    // InternalXacro.g:633:6: (lv_joint_13_0= ruleJoint )
                    	    // InternalXacro.g:634:7: lv_joint_13_0= ruleJoint
                    	    {

                    	    							newCompositeNode(grammarAccess.getBodyAccess().getJointJointParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_joint_13_0=ruleJoint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"joint",
                    	    								lv_joint_13_0,
                    	    								"de.fraunhofer.ipa.kinematics.xacro.Xacro.Joint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_14, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:657:3: (otherlv_15= 'material' otherlv_16= '{' ( (lv_material_17_0= ruleMaterialGlobal ) ) (otherlv_18= ',' ( (lv_material_19_0= ruleMaterialGlobal ) ) )* otherlv_20= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXacro.g:658:4: otherlv_15= 'material' otherlv_16= '{' ( (lv_material_17_0= ruleMaterialGlobal ) ) (otherlv_18= ',' ( (lv_material_19_0= ruleMaterialGlobal ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getBodyAccess().getMaterialKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,17,FOLLOW_22); 

                    				newLeafNode(otherlv_16, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalXacro.g:666:4: ( (lv_material_17_0= ruleMaterialGlobal ) )
                    // InternalXacro.g:667:5: (lv_material_17_0= ruleMaterialGlobal )
                    {
                    // InternalXacro.g:667:5: (lv_material_17_0= ruleMaterialGlobal )
                    // InternalXacro.g:668:6: lv_material_17_0= ruleMaterialGlobal
                    {

                    						newCompositeNode(grammarAccess.getBodyAccess().getMaterialMaterialGlobalParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_material_17_0=ruleMaterialGlobal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBodyRule());
                    						}
                    						add(
                    							current,
                    							"material",
                    							lv_material_17_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.MaterialGlobal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXacro.g:685:4: (otherlv_18= ',' ( (lv_material_19_0= ruleMaterialGlobal ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==21) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalXacro.g:686:5: otherlv_18= ',' ( (lv_material_19_0= ruleMaterialGlobal ) )
                    	    {
                    	    otherlv_18=(Token)match(input,21,FOLLOW_22); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getBodyAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalXacro.g:690:5: ( (lv_material_19_0= ruleMaterialGlobal ) )
                    	    // InternalXacro.g:691:6: (lv_material_19_0= ruleMaterialGlobal )
                    	    {
                    	    // InternalXacro.g:691:6: (lv_material_19_0= ruleMaterialGlobal )
                    	    // InternalXacro.g:692:7: lv_material_19_0= ruleMaterialGlobal
                    	    {

                    	    							newCompositeNode(grammarAccess.getBodyAccess().getMaterialMaterialGlobalParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_material_19_0=ruleMaterialGlobal();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"material",
                    	    								lv_material_19_0,
                    	    								"de.fraunhofer.ipa.kinematics.xacro.Xacro.MaterialGlobal");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,22,FOLLOW_23); 

                    				newLeafNode(otherlv_20, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:715:3: (otherlv_21= 'transmission' otherlv_22= '{' ( (lv_transmission_23_0= ruleTransmission ) ) (otherlv_24= ',' ( (lv_transmission_25_0= ruleTransmission ) ) )* otherlv_26= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalXacro.g:716:4: otherlv_21= 'transmission' otherlv_22= '{' ( (lv_transmission_23_0= ruleTransmission ) ) (otherlv_24= ',' ( (lv_transmission_25_0= ruleTransmission ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getBodyAccess().getTransmissionKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,17,FOLLOW_24); 

                    				newLeafNode(otherlv_22, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalXacro.g:724:4: ( (lv_transmission_23_0= ruleTransmission ) )
                    // InternalXacro.g:725:5: (lv_transmission_23_0= ruleTransmission )
                    {
                    // InternalXacro.g:725:5: (lv_transmission_23_0= ruleTransmission )
                    // InternalXacro.g:726:6: lv_transmission_23_0= ruleTransmission
                    {

                    						newCompositeNode(grammarAccess.getBodyAccess().getTransmissionTransmissionParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_transmission_23_0=ruleTransmission();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBodyRule());
                    						}
                    						add(
                    							current,
                    							"transmission",
                    							lv_transmission_23_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Transmission");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXacro.g:743:4: (otherlv_24= ',' ( (lv_transmission_25_0= ruleTransmission ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==21) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalXacro.g:744:5: otherlv_24= ',' ( (lv_transmission_25_0= ruleTransmission ) )
                    	    {
                    	    otherlv_24=(Token)match(input,21,FOLLOW_24); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getBodyAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalXacro.g:748:5: ( (lv_transmission_25_0= ruleTransmission ) )
                    	    // InternalXacro.g:749:6: (lv_transmission_25_0= ruleTransmission )
                    	    {
                    	    // InternalXacro.g:749:6: (lv_transmission_25_0= ruleTransmission )
                    	    // InternalXacro.g:750:7: lv_transmission_25_0= ruleTransmission
                    	    {

                    	    							newCompositeNode(grammarAccess.getBodyAccess().getTransmissionTransmissionParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_transmission_25_0=ruleTransmission();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"transmission",
                    	    								lv_transmission_25_0,
                    	    								"de.fraunhofer.ipa.kinematics.xacro.Xacro.Transmission");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_26, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleJoint"
    // InternalXacro.g:781:1: entryRuleJoint returns [EObject current=null] : iv_ruleJoint= ruleJoint EOF ;
    public final EObject entryRuleJoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoint = null;


        try {
            // InternalXacro.g:781:46: (iv_ruleJoint= ruleJoint EOF )
            // InternalXacro.g:782:2: iv_ruleJoint= ruleJoint EOF
            {
             newCompositeNode(grammarAccess.getJointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoint=ruleJoint();

            state._fsp--;

             current =iv_ruleJoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoint"


    // $ANTLR start "ruleJoint"
    // InternalXacro.g:788:1: ruleJoint returns [EObject current=null] : (otherlv_0= 'Joint' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'type' ( (lv_type_5_0= RULE_JOINTTYPE ) ) otherlv_6= 'parent' ( ( ruleEString ) ) otherlv_8= 'child' ( ( ruleEString ) ) (otherlv_10= 'origin' ( (lv_origin_11_0= rulePose ) ) )? (otherlv_12= 'axis' ( (lv_axis_13_0= ruleAxis ) ) )? (otherlv_14= 'calibration' ( (lv_calibration_15_0= ruleCalibration ) ) )? (otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )? (otherlv_18= 'limit' ( (lv_limit_19_0= ruleLimit ) ) )? (otherlv_20= 'safetyController' ( (lv_safetyController_21_0= ruleSafetyController ) ) )? (otherlv_22= 'mimic' ( (lv_mimic_23_0= ruleMimic ) ) )? otherlv_24= '}' ) ;
    public final EObject ruleJoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_origin_11_0 = null;

        EObject lv_axis_13_0 = null;

        EObject lv_calibration_15_0 = null;

        EObject lv_dynamics_17_0 = null;

        EObject lv_limit_19_0 = null;

        EObject lv_safetyController_21_0 = null;

        EObject lv_mimic_23_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:794:2: ( (otherlv_0= 'Joint' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'type' ( (lv_type_5_0= RULE_JOINTTYPE ) ) otherlv_6= 'parent' ( ( ruleEString ) ) otherlv_8= 'child' ( ( ruleEString ) ) (otherlv_10= 'origin' ( (lv_origin_11_0= rulePose ) ) )? (otherlv_12= 'axis' ( (lv_axis_13_0= ruleAxis ) ) )? (otherlv_14= 'calibration' ( (lv_calibration_15_0= ruleCalibration ) ) )? (otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )? (otherlv_18= 'limit' ( (lv_limit_19_0= ruleLimit ) ) )? (otherlv_20= 'safetyController' ( (lv_safetyController_21_0= ruleSafetyController ) ) )? (otherlv_22= 'mimic' ( (lv_mimic_23_0= ruleMimic ) ) )? otherlv_24= '}' ) )
            // InternalXacro.g:795:2: (otherlv_0= 'Joint' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'type' ( (lv_type_5_0= RULE_JOINTTYPE ) ) otherlv_6= 'parent' ( ( ruleEString ) ) otherlv_8= 'child' ( ( ruleEString ) ) (otherlv_10= 'origin' ( (lv_origin_11_0= rulePose ) ) )? (otherlv_12= 'axis' ( (lv_axis_13_0= ruleAxis ) ) )? (otherlv_14= 'calibration' ( (lv_calibration_15_0= ruleCalibration ) ) )? (otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )? (otherlv_18= 'limit' ( (lv_limit_19_0= ruleLimit ) ) )? (otherlv_20= 'safetyController' ( (lv_safetyController_21_0= ruleSafetyController ) ) )? (otherlv_22= 'mimic' ( (lv_mimic_23_0= ruleMimic ) ) )? otherlv_24= '}' )
            {
            // InternalXacro.g:795:2: (otherlv_0= 'Joint' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'type' ( (lv_type_5_0= RULE_JOINTTYPE ) ) otherlv_6= 'parent' ( ( ruleEString ) ) otherlv_8= 'child' ( ( ruleEString ) ) (otherlv_10= 'origin' ( (lv_origin_11_0= rulePose ) ) )? (otherlv_12= 'axis' ( (lv_axis_13_0= ruleAxis ) ) )? (otherlv_14= 'calibration' ( (lv_calibration_15_0= ruleCalibration ) ) )? (otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )? (otherlv_18= 'limit' ( (lv_limit_19_0= ruleLimit ) ) )? (otherlv_20= 'safetyController' ( (lv_safetyController_21_0= ruleSafetyController ) ) )? (otherlv_22= 'mimic' ( (lv_mimic_23_0= ruleMimic ) ) )? otherlv_24= '}' )
            // InternalXacro.g:796:3: otherlv_0= 'Joint' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'type' ( (lv_type_5_0= RULE_JOINTTYPE ) ) otherlv_6= 'parent' ( ( ruleEString ) ) otherlv_8= 'child' ( ( ruleEString ) ) (otherlv_10= 'origin' ( (lv_origin_11_0= rulePose ) ) )? (otherlv_12= 'axis' ( (lv_axis_13_0= ruleAxis ) ) )? (otherlv_14= 'calibration' ( (lv_calibration_15_0= ruleCalibration ) ) )? (otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )? (otherlv_18= 'limit' ( (lv_limit_19_0= ruleLimit ) ) )? (otherlv_20= 'safetyController' ( (lv_safetyController_21_0= ruleSafetyController ) ) )? (otherlv_22= 'mimic' ( (lv_mimic_23_0= ruleMimic ) ) )? otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getJointAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getJointAccess().getNameKeyword_2());
            		
            // InternalXacro.g:808:3: ( (lv_name_3_0= ruleEString ) )
            // InternalXacro.g:809:4: (lv_name_3_0= ruleEString )
            {
            // InternalXacro.g:809:4: (lv_name_3_0= ruleEString )
            // InternalXacro.g:810:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJointAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,35,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getJointAccess().getTypeKeyword_4());
            		
            // InternalXacro.g:831:3: ( (lv_type_5_0= RULE_JOINTTYPE ) )
            // InternalXacro.g:832:4: (lv_type_5_0= RULE_JOINTTYPE )
            {
            // InternalXacro.g:832:4: (lv_type_5_0= RULE_JOINTTYPE )
            // InternalXacro.g:833:5: lv_type_5_0= RULE_JOINTTYPE
            {
            lv_type_5_0=(Token)match(input,RULE_JOINTTYPE,FOLLOW_27); 

            					newLeafNode(lv_type_5_0, grammarAccess.getJointAccess().getTypeJOINTTYPETerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_5_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.JOINTTYPE");
            				

            }


            }

            otherlv_6=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getJointAccess().getParentKeyword_6());
            		
            // InternalXacro.g:853:3: ( ( ruleEString ) )
            // InternalXacro.g:854:4: ( ruleEString )
            {
            // InternalXacro.g:854:4: ( ruleEString )
            // InternalXacro.g:855:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				

            					newCompositeNode(grammarAccess.getJointAccess().getParentLinkCrossReference_7_0());
            				
            pushFollow(FOLLOW_28);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getJointAccess().getChildKeyword_8());
            		
            // InternalXacro.g:873:3: ( ( ruleEString ) )
            // InternalXacro.g:874:4: ( ruleEString )
            {
            // InternalXacro.g:874:4: ( ruleEString )
            // InternalXacro.g:875:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				

            					newCompositeNode(grammarAccess.getJointAccess().getChildLinkCrossReference_9_0());
            				
            pushFollow(FOLLOW_29);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXacro.g:889:3: (otherlv_10= 'origin' ( (lv_origin_11_0= rulePose ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXacro.g:890:4: otherlv_10= 'origin' ( (lv_origin_11_0= rulePose ) )
                    {
                    otherlv_10=(Token)match(input,38,FOLLOW_30); 

                    				newLeafNode(otherlv_10, grammarAccess.getJointAccess().getOriginKeyword_10_0());
                    			
                    // InternalXacro.g:894:4: ( (lv_origin_11_0= rulePose ) )
                    // InternalXacro.g:895:5: (lv_origin_11_0= rulePose )
                    {
                    // InternalXacro.g:895:5: (lv_origin_11_0= rulePose )
                    // InternalXacro.g:896:6: lv_origin_11_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getOriginPoseParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_origin_11_0=rulePose();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"origin",
                    							lv_origin_11_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Pose");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:914:3: (otherlv_12= 'axis' ( (lv_axis_13_0= ruleAxis ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalXacro.g:915:4: otherlv_12= 'axis' ( (lv_axis_13_0= ruleAxis ) )
                    {
                    otherlv_12=(Token)match(input,39,FOLLOW_32); 

                    				newLeafNode(otherlv_12, grammarAccess.getJointAccess().getAxisKeyword_11_0());
                    			
                    // InternalXacro.g:919:4: ( (lv_axis_13_0= ruleAxis ) )
                    // InternalXacro.g:920:5: (lv_axis_13_0= ruleAxis )
                    {
                    // InternalXacro.g:920:5: (lv_axis_13_0= ruleAxis )
                    // InternalXacro.g:921:6: lv_axis_13_0= ruleAxis
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_axis_13_0=ruleAxis();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"axis",
                    							lv_axis_13_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Axis");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:939:3: (otherlv_14= 'calibration' ( (lv_calibration_15_0= ruleCalibration ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXacro.g:940:4: otherlv_14= 'calibration' ( (lv_calibration_15_0= ruleCalibration ) )
                    {
                    otherlv_14=(Token)match(input,40,FOLLOW_34); 

                    				newLeafNode(otherlv_14, grammarAccess.getJointAccess().getCalibrationKeyword_12_0());
                    			
                    // InternalXacro.g:944:4: ( (lv_calibration_15_0= ruleCalibration ) )
                    // InternalXacro.g:945:5: (lv_calibration_15_0= ruleCalibration )
                    {
                    // InternalXacro.g:945:5: (lv_calibration_15_0= ruleCalibration )
                    // InternalXacro.g:946:6: lv_calibration_15_0= ruleCalibration
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getCalibrationCalibrationParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_calibration_15_0=ruleCalibration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"calibration",
                    							lv_calibration_15_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Calibration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:964:3: (otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalXacro.g:965:4: otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) )
                    {
                    otherlv_16=(Token)match(input,41,FOLLOW_36); 

                    				newLeafNode(otherlv_16, grammarAccess.getJointAccess().getDynamicsKeyword_13_0());
                    			
                    // InternalXacro.g:969:4: ( (lv_dynamics_17_0= ruleDynamics ) )
                    // InternalXacro.g:970:5: (lv_dynamics_17_0= ruleDynamics )
                    {
                    // InternalXacro.g:970:5: (lv_dynamics_17_0= ruleDynamics )
                    // InternalXacro.g:971:6: lv_dynamics_17_0= ruleDynamics
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getDynamicsDynamicsParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_dynamics_17_0=ruleDynamics();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"dynamics",
                    							lv_dynamics_17_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Dynamics");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:989:3: (otherlv_18= 'limit' ( (lv_limit_19_0= ruleLimit ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalXacro.g:990:4: otherlv_18= 'limit' ( (lv_limit_19_0= ruleLimit ) )
                    {
                    otherlv_18=(Token)match(input,42,FOLLOW_38); 

                    				newLeafNode(otherlv_18, grammarAccess.getJointAccess().getLimitKeyword_14_0());
                    			
                    // InternalXacro.g:994:4: ( (lv_limit_19_0= ruleLimit ) )
                    // InternalXacro.g:995:5: (lv_limit_19_0= ruleLimit )
                    {
                    // InternalXacro.g:995:5: (lv_limit_19_0= ruleLimit )
                    // InternalXacro.g:996:6: lv_limit_19_0= ruleLimit
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_limit_19_0=ruleLimit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"limit",
                    							lv_limit_19_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Limit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:1014:3: (otherlv_20= 'safetyController' ( (lv_safetyController_21_0= ruleSafetyController ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==43) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalXacro.g:1015:4: otherlv_20= 'safetyController' ( (lv_safetyController_21_0= ruleSafetyController ) )
                    {
                    otherlv_20=(Token)match(input,43,FOLLOW_40); 

                    				newLeafNode(otherlv_20, grammarAccess.getJointAccess().getSafetyControllerKeyword_15_0());
                    			
                    // InternalXacro.g:1019:4: ( (lv_safetyController_21_0= ruleSafetyController ) )
                    // InternalXacro.g:1020:5: (lv_safetyController_21_0= ruleSafetyController )
                    {
                    // InternalXacro.g:1020:5: (lv_safetyController_21_0= ruleSafetyController )
                    // InternalXacro.g:1021:6: lv_safetyController_21_0= ruleSafetyController
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getSafetyControllerSafetyControllerParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_safetyController_21_0=ruleSafetyController();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"safetyController",
                    							lv_safetyController_21_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.SafetyController");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:1039:3: (otherlv_22= 'mimic' ( (lv_mimic_23_0= ruleMimic ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==44) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalXacro.g:1040:4: otherlv_22= 'mimic' ( (lv_mimic_23_0= ruleMimic ) )
                    {
                    otherlv_22=(Token)match(input,44,FOLLOW_42); 

                    				newLeafNode(otherlv_22, grammarAccess.getJointAccess().getMimicKeyword_16_0());
                    			
                    // InternalXacro.g:1044:4: ( (lv_mimic_23_0= ruleMimic ) )
                    // InternalXacro.g:1045:5: (lv_mimic_23_0= ruleMimic )
                    {
                    // InternalXacro.g:1045:5: (lv_mimic_23_0= ruleMimic )
                    // InternalXacro.g:1046:6: lv_mimic_23_0= ruleMimic
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getMimicMimicParserRuleCall_16_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_mimic_23_0=ruleMimic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"mimic",
                    							lv_mimic_23_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Mimic");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getJointAccess().getRightCurlyBracketKeyword_17());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoint"


    // $ANTLR start "entryRuleLink"
    // InternalXacro.g:1072:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalXacro.g:1072:45: (iv_ruleLink= ruleLink EOF )
            // InternalXacro.g:1073:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalXacro.g:1079:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'inertial' ( (lv_inertial_7_0= ruleInertial ) ) )? (otherlv_8= 'visual' ( (lv_visual_9_0= ruleVisual ) ) )? (otherlv_10= 'collision' ( (lv_collision_11_0= ruleCollision ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;

        EObject lv_inertial_7_0 = null;

        EObject lv_visual_9_0 = null;

        EObject lv_collision_11_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:1085:2: ( (otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'inertial' ( (lv_inertial_7_0= ruleInertial ) ) )? (otherlv_8= 'visual' ( (lv_visual_9_0= ruleVisual ) ) )? (otherlv_10= 'collision' ( (lv_collision_11_0= ruleCollision ) ) )? otherlv_12= '}' ) )
            // InternalXacro.g:1086:2: (otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'inertial' ( (lv_inertial_7_0= ruleInertial ) ) )? (otherlv_8= 'visual' ( (lv_visual_9_0= ruleVisual ) ) )? (otherlv_10= 'collision' ( (lv_collision_11_0= ruleCollision ) ) )? otherlv_12= '}' )
            {
            // InternalXacro.g:1086:2: (otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'inertial' ( (lv_inertial_7_0= ruleInertial ) ) )? (otherlv_8= 'visual' ( (lv_visual_9_0= ruleVisual ) ) )? (otherlv_10= 'collision' ( (lv_collision_11_0= ruleCollision ) ) )? otherlv_12= '}' )
            // InternalXacro.g:1087:3: otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'inertial' ( (lv_inertial_7_0= ruleInertial ) ) )? (otherlv_8= 'visual' ( (lv_visual_9_0= ruleVisual ) ) )? (otherlv_10= 'collision' ( (lv_collision_11_0= ruleCollision ) ) )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getNameKeyword_2());
            		
            // InternalXacro.g:1099:3: ( (lv_name_3_0= ruleEString ) )
            // InternalXacro.g:1100:4: (lv_name_3_0= ruleEString )
            {
            // InternalXacro.g:1100:4: (lv_name_3_0= ruleEString )
            // InternalXacro.g:1101:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_43);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXacro.g:1118:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalXacro.g:1119:4: otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getTypeKeyword_4_0());
                    			
                    // InternalXacro.g:1123:4: ( (lv_type_5_0= ruleEString ) )
                    // InternalXacro.g:1124:5: (lv_type_5_0= ruleEString )
                    {
                    // InternalXacro.g:1124:5: (lv_type_5_0= ruleEString )
                    // InternalXacro.g:1125:6: lv_type_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLinkAccess().getTypeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_type_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:1143:3: (otherlv_6= 'inertial' ( (lv_inertial_7_0= ruleInertial ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==46) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXacro.g:1144:4: otherlv_6= 'inertial' ( (lv_inertial_7_0= ruleInertial ) )
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_45); 

                    				newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getInertialKeyword_5_0());
                    			
                    // InternalXacro.g:1148:4: ( (lv_inertial_7_0= ruleInertial ) )
                    // InternalXacro.g:1149:5: (lv_inertial_7_0= ruleInertial )
                    {
                    // InternalXacro.g:1149:5: (lv_inertial_7_0= ruleInertial )
                    // InternalXacro.g:1150:6: lv_inertial_7_0= ruleInertial
                    {

                    						newCompositeNode(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_inertial_7_0=ruleInertial();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    						}
                    						set(
                    							current,
                    							"inertial",
                    							lv_inertial_7_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Inertial");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:1168:3: (otherlv_8= 'visual' ( (lv_visual_9_0= ruleVisual ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==47) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalXacro.g:1169:4: otherlv_8= 'visual' ( (lv_visual_9_0= ruleVisual ) )
                    {
                    otherlv_8=(Token)match(input,47,FOLLOW_47); 

                    				newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getVisualKeyword_6_0());
                    			
                    // InternalXacro.g:1173:4: ( (lv_visual_9_0= ruleVisual ) )
                    // InternalXacro.g:1174:5: (lv_visual_9_0= ruleVisual )
                    {
                    // InternalXacro.g:1174:5: (lv_visual_9_0= ruleVisual )
                    // InternalXacro.g:1175:6: lv_visual_9_0= ruleVisual
                    {

                    						newCompositeNode(grammarAccess.getLinkAccess().getVisualVisualParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_visual_9_0=ruleVisual();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    						}
                    						set(
                    							current,
                    							"visual",
                    							lv_visual_9_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Visual");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:1193:3: (otherlv_10= 'collision' ( (lv_collision_11_0= ruleCollision ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==48) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalXacro.g:1194:4: otherlv_10= 'collision' ( (lv_collision_11_0= ruleCollision ) )
                    {
                    otherlv_10=(Token)match(input,48,FOLLOW_49); 

                    				newLeafNode(otherlv_10, grammarAccess.getLinkAccess().getCollisionKeyword_7_0());
                    			
                    // InternalXacro.g:1198:4: ( (lv_collision_11_0= ruleCollision ) )
                    // InternalXacro.g:1199:5: (lv_collision_11_0= ruleCollision )
                    {
                    // InternalXacro.g:1199:5: (lv_collision_11_0= ruleCollision )
                    // InternalXacro.g:1200:6: lv_collision_11_0= ruleCollision
                    {

                    						newCompositeNode(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_collision_11_0=ruleCollision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    						}
                    						set(
                    							current,
                    							"collision",
                    							lv_collision_11_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Collision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleMaterialGlobal"
    // InternalXacro.g:1226:1: entryRuleMaterialGlobal returns [EObject current=null] : iv_ruleMaterialGlobal= ruleMaterialGlobal EOF ;
    public final EObject entryRuleMaterialGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaterialGlobal = null;


        try {
            // InternalXacro.g:1226:55: (iv_ruleMaterialGlobal= ruleMaterialGlobal EOF )
            // InternalXacro.g:1227:2: iv_ruleMaterialGlobal= ruleMaterialGlobal EOF
            {
             newCompositeNode(grammarAccess.getMaterialGlobalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaterialGlobal=ruleMaterialGlobal();

            state._fsp--;

             current =iv_ruleMaterialGlobal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaterialGlobal"


    // $ANTLR start "ruleMaterialGlobal"
    // InternalXacro.g:1233:1: ruleMaterialGlobal returns [EObject current=null] : (otherlv_0= 'MaterialGlobal' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )? (otherlv_6= 'texture' ( (lv_texture_7_0= ruleTexture ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleMaterialGlobal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_color_5_0 = null;

        EObject lv_texture_7_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:1239:2: ( (otherlv_0= 'MaterialGlobal' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )? (otherlv_6= 'texture' ( (lv_texture_7_0= ruleTexture ) ) )? otherlv_8= '}' ) )
            // InternalXacro.g:1240:2: (otherlv_0= 'MaterialGlobal' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )? (otherlv_6= 'texture' ( (lv_texture_7_0= ruleTexture ) ) )? otherlv_8= '}' )
            {
            // InternalXacro.g:1240:2: (otherlv_0= 'MaterialGlobal' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )? (otherlv_6= 'texture' ( (lv_texture_7_0= ruleTexture ) ) )? otherlv_8= '}' )
            // InternalXacro.g:1241:3: otherlv_0= 'MaterialGlobal' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )? (otherlv_6= 'texture' ( (lv_texture_7_0= ruleTexture ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMaterialGlobalAccess().getMaterialGlobalKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMaterialGlobalAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMaterialGlobalAccess().getNameKeyword_2());
            		
            // InternalXacro.g:1253:3: ( (lv_name_3_0= ruleEString ) )
            // InternalXacro.g:1254:4: (lv_name_3_0= ruleEString )
            {
            // InternalXacro.g:1254:4: (lv_name_3_0= ruleEString )
            // InternalXacro.g:1255:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMaterialGlobalAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_50);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaterialGlobalRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXacro.g:1272:3: (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==50) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalXacro.g:1273:4: otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) )
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_51); 

                    				newLeafNode(otherlv_4, grammarAccess.getMaterialGlobalAccess().getColorKeyword_4_0());
                    			
                    // InternalXacro.g:1277:4: ( (lv_color_5_0= ruleColor ) )
                    // InternalXacro.g:1278:5: (lv_color_5_0= ruleColor )
                    {
                    // InternalXacro.g:1278:5: (lv_color_5_0= ruleColor )
                    // InternalXacro.g:1279:6: lv_color_5_0= ruleColor
                    {

                    						newCompositeNode(grammarAccess.getMaterialGlobalAccess().getColorColorParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_color_5_0=ruleColor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMaterialGlobalRule());
                    						}
                    						set(
                    							current,
                    							"color",
                    							lv_color_5_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:1297:3: (otherlv_6= 'texture' ( (lv_texture_7_0= ruleTexture ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==51) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalXacro.g:1298:4: otherlv_6= 'texture' ( (lv_texture_7_0= ruleTexture ) )
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_53); 

                    				newLeafNode(otherlv_6, grammarAccess.getMaterialGlobalAccess().getTextureKeyword_5_0());
                    			
                    // InternalXacro.g:1302:4: ( (lv_texture_7_0= ruleTexture ) )
                    // InternalXacro.g:1303:5: (lv_texture_7_0= ruleTexture )
                    {
                    // InternalXacro.g:1303:5: (lv_texture_7_0= ruleTexture )
                    // InternalXacro.g:1304:6: lv_texture_7_0= ruleTexture
                    {

                    						newCompositeNode(grammarAccess.getMaterialGlobalAccess().getTextureTextureParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_texture_7_0=ruleTexture();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMaterialGlobalRule());
                    						}
                    						set(
                    							current,
                    							"texture",
                    							lv_texture_7_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Texture");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getMaterialGlobalAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaterialGlobal"


    // $ANTLR start "entryRuleTransmission"
    // InternalXacro.g:1330:1: entryRuleTransmission returns [EObject current=null] : iv_ruleTransmission= ruleTransmission EOF ;
    public final EObject entryRuleTransmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransmission = null;


        try {
            // InternalXacro.g:1330:53: (iv_ruleTransmission= ruleTransmission EOF )
            // InternalXacro.g:1331:2: iv_ruleTransmission= ruleTransmission EOF
            {
             newCompositeNode(grammarAccess.getTransmissionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransmission=ruleTransmission();

            state._fsp--;

             current =iv_ruleTransmission; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransmission"


    // $ANTLR start "ruleTransmission"
    // InternalXacro.g:1337:1: ruleTransmission returns [EObject current=null] : (otherlv_0= 'Transmission' otherlv_1= '{' (otherlv_2= 'mechanicalReduction' otherlv_3= '{' ( (lv_mechanicalReduction_4_0= ruleDouble0 ) ) (otherlv_5= ',' ( (lv_mechanicalReduction_6_0= ruleDouble0 ) ) )* otherlv_7= '}' )? otherlv_8= 'name' ( (lv_name_9_0= ruleEString ) ) otherlv_10= 'type' ( (lv_type_11_0= ruleEString ) ) (otherlv_12= 'leftActuator' otherlv_13= '{' ( (lv_leftActuator_14_0= ruleActuatorTransmission ) ) (otherlv_15= ',' ( (lv_leftActuator_16_0= ruleActuatorTransmission ) ) )* otherlv_17= '}' )? (otherlv_18= 'rightActuator' otherlv_19= '{' ( (lv_rightActuator_20_0= ruleActuatorTransmission ) ) (otherlv_21= ',' ( (lv_rightActuator_22_0= ruleActuatorTransmission ) ) )* otherlv_23= '}' )? (otherlv_24= 'flexJoint' otherlv_25= '{' ( (lv_flexJoint_26_0= ruleActuatorTransmission ) ) (otherlv_27= ',' ( (lv_flexJoint_28_0= ruleActuatorTransmission ) ) )* otherlv_29= '}' )? (otherlv_30= 'rollJoint' otherlv_31= '{' ( (lv_rollJoint_32_0= ruleActuatorTransmission ) ) (otherlv_33= ',' ( (lv_rollJoint_34_0= ruleActuatorTransmission ) ) )* otherlv_35= '}' )? (otherlv_36= 'gapJoint' otherlv_37= '{' ( (lv_gapJoint_38_0= ruleGapJointTransmission ) ) (otherlv_39= ',' ( (lv_gapJoint_40_0= ruleGapJointTransmission ) ) )* otherlv_41= '}' )? (otherlv_42= 'passiveJoint' otherlv_43= '{' ( (lv_passiveJoint_44_0= rulePassiveJointTransmission ) ) (otherlv_45= ',' ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) ) )* otherlv_47= '}' )? (otherlv_48= 'useSimulatedGripperJoint' otherlv_49= '{' ( (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType ) ) (otherlv_51= ',' ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) ) )* otherlv_53= '}' )? (otherlv_54= 'actuator' otherlv_55= '{' ( (lv_actuator_56_0= ruleName ) ) (otherlv_57= ',' ( (lv_actuator_58_0= ruleName ) ) )* otherlv_59= '}' )? (otherlv_60= 'joint' otherlv_61= '{' ( (lv_joint_62_0= ruleName ) ) (otherlv_63= ',' ( (lv_joint_64_0= ruleName ) ) )* otherlv_65= '}' )? otherlv_66= '}' ) ;
    public final EObject ruleTransmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token otherlv_55=null;
        Token otherlv_57=null;
        Token otherlv_59=null;
        Token otherlv_60=null;
        Token otherlv_61=null;
        Token otherlv_63=null;
        Token otherlv_65=null;
        Token otherlv_66=null;
        AntlrDatatypeRuleToken lv_mechanicalReduction_4_0 = null;

        AntlrDatatypeRuleToken lv_mechanicalReduction_6_0 = null;

        AntlrDatatypeRuleToken lv_name_9_0 = null;

        AntlrDatatypeRuleToken lv_type_11_0 = null;

        EObject lv_leftActuator_14_0 = null;

        EObject lv_leftActuator_16_0 = null;

        EObject lv_rightActuator_20_0 = null;

        EObject lv_rightActuator_22_0 = null;

        EObject lv_flexJoint_26_0 = null;

        EObject lv_flexJoint_28_0 = null;

        EObject lv_rollJoint_32_0 = null;

        EObject lv_rollJoint_34_0 = null;

        EObject lv_gapJoint_38_0 = null;

        EObject lv_gapJoint_40_0 = null;

        EObject lv_passiveJoint_44_0 = null;

        EObject lv_passiveJoint_46_0 = null;

        EObject lv_useSimulatedGripperJoint_50_0 = null;

        EObject lv_useSimulatedGripperJoint_52_0 = null;

        EObject lv_actuator_56_0 = null;

        EObject lv_actuator_58_0 = null;

        EObject lv_joint_62_0 = null;

        EObject lv_joint_64_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:1343:2: ( (otherlv_0= 'Transmission' otherlv_1= '{' (otherlv_2= 'mechanicalReduction' otherlv_3= '{' ( (lv_mechanicalReduction_4_0= ruleDouble0 ) ) (otherlv_5= ',' ( (lv_mechanicalReduction_6_0= ruleDouble0 ) ) )* otherlv_7= '}' )? otherlv_8= 'name' ( (lv_name_9_0= ruleEString ) ) otherlv_10= 'type' ( (lv_type_11_0= ruleEString ) ) (otherlv_12= 'leftActuator' otherlv_13= '{' ( (lv_leftActuator_14_0= ruleActuatorTransmission ) ) (otherlv_15= ',' ( (lv_leftActuator_16_0= ruleActuatorTransmission ) ) )* otherlv_17= '}' )? (otherlv_18= 'rightActuator' otherlv_19= '{' ( (lv_rightActuator_20_0= ruleActuatorTransmission ) ) (otherlv_21= ',' ( (lv_rightActuator_22_0= ruleActuatorTransmission ) ) )* otherlv_23= '}' )? (otherlv_24= 'flexJoint' otherlv_25= '{' ( (lv_flexJoint_26_0= ruleActuatorTransmission ) ) (otherlv_27= ',' ( (lv_flexJoint_28_0= ruleActuatorTransmission ) ) )* otherlv_29= '}' )? (otherlv_30= 'rollJoint' otherlv_31= '{' ( (lv_rollJoint_32_0= ruleActuatorTransmission ) ) (otherlv_33= ',' ( (lv_rollJoint_34_0= ruleActuatorTransmission ) ) )* otherlv_35= '}' )? (otherlv_36= 'gapJoint' otherlv_37= '{' ( (lv_gapJoint_38_0= ruleGapJointTransmission ) ) (otherlv_39= ',' ( (lv_gapJoint_40_0= ruleGapJointTransmission ) ) )* otherlv_41= '}' )? (otherlv_42= 'passiveJoint' otherlv_43= '{' ( (lv_passiveJoint_44_0= rulePassiveJointTransmission ) ) (otherlv_45= ',' ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) ) )* otherlv_47= '}' )? (otherlv_48= 'useSimulatedGripperJoint' otherlv_49= '{' ( (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType ) ) (otherlv_51= ',' ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) ) )* otherlv_53= '}' )? (otherlv_54= 'actuator' otherlv_55= '{' ( (lv_actuator_56_0= ruleName ) ) (otherlv_57= ',' ( (lv_actuator_58_0= ruleName ) ) )* otherlv_59= '}' )? (otherlv_60= 'joint' otherlv_61= '{' ( (lv_joint_62_0= ruleName ) ) (otherlv_63= ',' ( (lv_joint_64_0= ruleName ) ) )* otherlv_65= '}' )? otherlv_66= '}' ) )
            // InternalXacro.g:1344:2: (otherlv_0= 'Transmission' otherlv_1= '{' (otherlv_2= 'mechanicalReduction' otherlv_3= '{' ( (lv_mechanicalReduction_4_0= ruleDouble0 ) ) (otherlv_5= ',' ( (lv_mechanicalReduction_6_0= ruleDouble0 ) ) )* otherlv_7= '}' )? otherlv_8= 'name' ( (lv_name_9_0= ruleEString ) ) otherlv_10= 'type' ( (lv_type_11_0= ruleEString ) ) (otherlv_12= 'leftActuator' otherlv_13= '{' ( (lv_leftActuator_14_0= ruleActuatorTransmission ) ) (otherlv_15= ',' ( (lv_leftActuator_16_0= ruleActuatorTransmission ) ) )* otherlv_17= '}' )? (otherlv_18= 'rightActuator' otherlv_19= '{' ( (lv_rightActuator_20_0= ruleActuatorTransmission ) ) (otherlv_21= ',' ( (lv_rightActuator_22_0= ruleActuatorTransmission ) ) )* otherlv_23= '}' )? (otherlv_24= 'flexJoint' otherlv_25= '{' ( (lv_flexJoint_26_0= ruleActuatorTransmission ) ) (otherlv_27= ',' ( (lv_flexJoint_28_0= ruleActuatorTransmission ) ) )* otherlv_29= '}' )? (otherlv_30= 'rollJoint' otherlv_31= '{' ( (lv_rollJoint_32_0= ruleActuatorTransmission ) ) (otherlv_33= ',' ( (lv_rollJoint_34_0= ruleActuatorTransmission ) ) )* otherlv_35= '}' )? (otherlv_36= 'gapJoint' otherlv_37= '{' ( (lv_gapJoint_38_0= ruleGapJointTransmission ) ) (otherlv_39= ',' ( (lv_gapJoint_40_0= ruleGapJointTransmission ) ) )* otherlv_41= '}' )? (otherlv_42= 'passiveJoint' otherlv_43= '{' ( (lv_passiveJoint_44_0= rulePassiveJointTransmission ) ) (otherlv_45= ',' ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) ) )* otherlv_47= '}' )? (otherlv_48= 'useSimulatedGripperJoint' otherlv_49= '{' ( (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType ) ) (otherlv_51= ',' ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) ) )* otherlv_53= '}' )? (otherlv_54= 'actuator' otherlv_55= '{' ( (lv_actuator_56_0= ruleName ) ) (otherlv_57= ',' ( (lv_actuator_58_0= ruleName ) ) )* otherlv_59= '}' )? (otherlv_60= 'joint' otherlv_61= '{' ( (lv_joint_62_0= ruleName ) ) (otherlv_63= ',' ( (lv_joint_64_0= ruleName ) ) )* otherlv_65= '}' )? otherlv_66= '}' )
            {
            // InternalXacro.g:1344:2: (otherlv_0= 'Transmission' otherlv_1= '{' (otherlv_2= 'mechanicalReduction' otherlv_3= '{' ( (lv_mechanicalReduction_4_0= ruleDouble0 ) ) (otherlv_5= ',' ( (lv_mechanicalReduction_6_0= ruleDouble0 ) ) )* otherlv_7= '}' )? otherlv_8= 'name' ( (lv_name_9_0= ruleEString ) ) otherlv_10= 'type' ( (lv_type_11_0= ruleEString ) ) (otherlv_12= 'leftActuator' otherlv_13= '{' ( (lv_leftActuator_14_0= ruleActuatorTransmission ) ) (otherlv_15= ',' ( (lv_leftActuator_16_0= ruleActuatorTransmission ) ) )* otherlv_17= '}' )? (otherlv_18= 'rightActuator' otherlv_19= '{' ( (lv_rightActuator_20_0= ruleActuatorTransmission ) ) (otherlv_21= ',' ( (lv_rightActuator_22_0= ruleActuatorTransmission ) ) )* otherlv_23= '}' )? (otherlv_24= 'flexJoint' otherlv_25= '{' ( (lv_flexJoint_26_0= ruleActuatorTransmission ) ) (otherlv_27= ',' ( (lv_flexJoint_28_0= ruleActuatorTransmission ) ) )* otherlv_29= '}' )? (otherlv_30= 'rollJoint' otherlv_31= '{' ( (lv_rollJoint_32_0= ruleActuatorTransmission ) ) (otherlv_33= ',' ( (lv_rollJoint_34_0= ruleActuatorTransmission ) ) )* otherlv_35= '}' )? (otherlv_36= 'gapJoint' otherlv_37= '{' ( (lv_gapJoint_38_0= ruleGapJointTransmission ) ) (otherlv_39= ',' ( (lv_gapJoint_40_0= ruleGapJointTransmission ) ) )* otherlv_41= '}' )? (otherlv_42= 'passiveJoint' otherlv_43= '{' ( (lv_passiveJoint_44_0= rulePassiveJointTransmission ) ) (otherlv_45= ',' ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) ) )* otherlv_47= '}' )? (otherlv_48= 'useSimulatedGripperJoint' otherlv_49= '{' ( (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType ) ) (otherlv_51= ',' ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) ) )* otherlv_53= '}' )? (otherlv_54= 'actuator' otherlv_55= '{' ( (lv_actuator_56_0= ruleName ) ) (otherlv_57= ',' ( (lv_actuator_58_0= ruleName ) ) )* otherlv_59= '}' )? (otherlv_60= 'joint' otherlv_61= '{' ( (lv_joint_62_0= ruleName ) ) (otherlv_63= ',' ( (lv_joint_64_0= ruleName ) ) )* otherlv_65= '}' )? otherlv_66= '}' )
            // InternalXacro.g:1345:3: otherlv_0= 'Transmission' otherlv_1= '{' (otherlv_2= 'mechanicalReduction' otherlv_3= '{' ( (lv_mechanicalReduction_4_0= ruleDouble0 ) ) (otherlv_5= ',' ( (lv_mechanicalReduction_6_0= ruleDouble0 ) ) )* otherlv_7= '}' )? otherlv_8= 'name' ( (lv_name_9_0= ruleEString ) ) otherlv_10= 'type' ( (lv_type_11_0= ruleEString ) ) (otherlv_12= 'leftActuator' otherlv_13= '{' ( (lv_leftActuator_14_0= ruleActuatorTransmission ) ) (otherlv_15= ',' ( (lv_leftActuator_16_0= ruleActuatorTransmission ) ) )* otherlv_17= '}' )? (otherlv_18= 'rightActuator' otherlv_19= '{' ( (lv_rightActuator_20_0= ruleActuatorTransmission ) ) (otherlv_21= ',' ( (lv_rightActuator_22_0= ruleActuatorTransmission ) ) )* otherlv_23= '}' )? (otherlv_24= 'flexJoint' otherlv_25= '{' ( (lv_flexJoint_26_0= ruleActuatorTransmission ) ) (otherlv_27= ',' ( (lv_flexJoint_28_0= ruleActuatorTransmission ) ) )* otherlv_29= '}' )? (otherlv_30= 'rollJoint' otherlv_31= '{' ( (lv_rollJoint_32_0= ruleActuatorTransmission ) ) (otherlv_33= ',' ( (lv_rollJoint_34_0= ruleActuatorTransmission ) ) )* otherlv_35= '}' )? (otherlv_36= 'gapJoint' otherlv_37= '{' ( (lv_gapJoint_38_0= ruleGapJointTransmission ) ) (otherlv_39= ',' ( (lv_gapJoint_40_0= ruleGapJointTransmission ) ) )* otherlv_41= '}' )? (otherlv_42= 'passiveJoint' otherlv_43= '{' ( (lv_passiveJoint_44_0= rulePassiveJointTransmission ) ) (otherlv_45= ',' ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) ) )* otherlv_47= '}' )? (otherlv_48= 'useSimulatedGripperJoint' otherlv_49= '{' ( (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType ) ) (otherlv_51= ',' ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) ) )* otherlv_53= '}' )? (otherlv_54= 'actuator' otherlv_55= '{' ( (lv_actuator_56_0= ruleName ) ) (otherlv_57= ',' ( (lv_actuator_58_0= ruleName ) ) )* otherlv_59= '}' )? (otherlv_60= 'joint' otherlv_61= '{' ( (lv_joint_62_0= ruleName ) ) (otherlv_63= ',' ( (lv_joint_64_0= ruleName ) ) )* otherlv_65= '}' )? otherlv_66= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransmissionAccess().getTransmissionKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXacro.g:1353:3: (otherlv_2= 'mechanicalReduction' otherlv_3= '{' ( (lv_mechanicalReduction_4_0= ruleDouble0 ) ) (otherlv_5= ',' ( (lv_mechanicalReduction_6_0= ruleDouble0 ) ) )* otherlv_7= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==53) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalXacro.g:1354:4: otherlv_2= 'mechanicalReduction' otherlv_3= '{' ( (lv_mechanicalReduction_4_0= ruleDouble0 ) ) (otherlv_5= ',' ( (lv_mechanicalReduction_6_0= ruleDouble0 ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getTransmissionAccess().getMechanicalReductionKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,17,FOLLOW_55); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalXacro.g:1362:4: ( (lv_mechanicalReduction_4_0= ruleDouble0 ) )
                    // InternalXacro.g:1363:5: (lv_mechanicalReduction_4_0= ruleDouble0 )
                    {
                    // InternalXacro.g:1363:5: (lv_mechanicalReduction_4_0= ruleDouble0 )
                    // InternalXacro.g:1364:6: lv_mechanicalReduction_4_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getTransmissionAccess().getMechanicalReductionDouble0ParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_mechanicalReduction_4_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransmissionRule());
                    						}
                    						add(
                    							current,
                    							"mechanicalReduction",
                    							lv_mechanicalReduction_4_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXacro.g:1381:4: (otherlv_5= ',' ( (lv_mechanicalReduction_6_0= ruleDouble0 ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==21) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalXacro.g:1382:5: otherlv_5= ',' ( (lv_mechanicalReduction_6_0= ruleDouble0 ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_55); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getTransmissionAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalXacro.g:1386:5: ( (lv_mechanicalReduction_6_0= ruleDouble0 ) )
                    	    // InternalXacro.g:1387:6: (lv_mechanicalReduction_6_0= ruleDouble0 )
                    	    {
                    	    // InternalXacro.g:1387:6: (lv_mechanicalReduction_6_0= ruleDouble0 )
                    	    // InternalXacro.g:1388:7: lv_mechanicalReduction_6_0= ruleDouble0
                    	    {

                    	    							newCompositeNode(grammarAccess.getTransmissionAccess().getMechanicalReductionDouble0ParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_mechanicalReduction_6_0=ruleDouble0();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTransmissionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"mechanicalReduction",
                    	    								lv_mechanicalReduction_6_0,
                    	    								"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getTransmissionAccess().getNameKeyword_3());
            		
            // InternalXacro.g:1415:3: ( (lv_name_9_0= ruleEString ) )
            // InternalXacro.g:1416:4: (lv_name_9_0= ruleEString )
            {
            // InternalXacro.g:1416:4: (lv_name_9_0= ruleEString )
            // InternalXacro.g:1417:5: lv_name_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransmissionAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
            lv_name_9_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransmissionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_9_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getTransmissionAccess().getTypeKeyword_5());
            		
            // InternalXacro.g:1438:3: ( (lv_type_11_0= ruleEString ) )
            // InternalXacro.g:1439:4: (lv_type_11_0= ruleEString )
            {
            // InternalXacro.g:1439:4: (lv_type_11_0= ruleEString )
            // InternalXacro.g:1440:5: lv_type_11_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransmissionAccess().getTypeEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_56);
            lv_type_11_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransmissionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_11_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXacro.g:1457:3: (otherlv_12= 'leftActuator' otherlv_13= '{' ( (lv_leftActuator_14_0= ruleActuatorTransmission ) ) (otherlv_15= ',' ( (lv_leftActuator_16_0= ruleActuatorTransmission ) ) )* otherlv_17= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==54) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalXacro.g:1458:4: otherlv_12= 'leftActuator' otherlv_13= '{' ( (lv_leftActuator_14_0= ruleActuatorTransmission ) ) (otherlv_15= ',' ( (lv_leftActuator_16_0= ruleActuatorTransmission ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,54,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getTransmissionAccess().getLeftActuatorKeyword_7_0());
                    			
                    otherlv_13=(Token)match(input,17,FOLLOW_57); 

                    				newLeafNode(otherlv_13, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalXacro.g:1466:4: ( (lv_leftActuator_14_0= ruleActuatorTransmission ) )
                    // InternalXacro.g:1467:5: (lv_leftActuator_14_0= ruleActuatorTransmission )
                    {
                    // InternalXacro.g:1467:5: (lv_leftActuator_14_0= ruleActuatorTransmission )
                    // InternalXacro.g:1468:6: lv_leftActuator_14_0= ruleActuatorTransmission
                    {

                    						newCompositeNode(grammarAccess.getTransmissionAccess().getLeftActuatorActuatorTransmissionParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_leftActuator_14_0=ruleActuatorTransmission();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransmissionRule());
                    						}
                    						add(
                    							current,
                    							"leftActuator",
                    							lv_leftActuator_14_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.ActuatorTransmission");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXacro.g:1485:4: (otherlv_15= ',' ( (lv_leftActuator_16_0= ruleActuatorTransmission ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==21) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalXacro.g:1486:5: otherlv_15= ',' ( (lv_leftActuator_16_0= ruleActuatorTransmission ) )
                    	    {
                    	    otherlv_15=(Token)match(input,21,FOLLOW_57); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getTransmissionAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalXacro.g:1490:5: ( (lv_leftActuator_16_0= ruleActuatorTransmission ) )
                    	    // InternalXacro.g:1491:6: (lv_leftActuator_16_0= ruleActuatorTransmission )
                    	    {
                    	    // InternalXacro.g:1491:6: (lv_leftActuator_16_0= ruleActuatorTransmission )
                    	    // InternalXacro.g:1492:7: lv_leftActuator_16_0= ruleActuatorTransmission
                    	    {

                    	    							newCompositeNode(grammarAccess.getTransmissionAccess().getLeftActuatorActuatorTransmissionParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_leftActuator_16_0=ruleActuatorTransmission();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTransmissionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"leftActuator",
                    	    								lv_leftActuator_16_0,
                    	    								"de.fraunhofer.ipa.kinematics.xacro.Xacro.ActuatorTransmission");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,22,FOLLOW_58); 

                    				newLeafNode(otherlv_17, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:1515:3: (otherlv_18= 'rightActuator' otherlv_19= '{' ( (lv_rightActuator_20_0= ruleActuatorTransmission ) ) (otherlv_21= ',' ( (lv_rightActuator_22_0= ruleActuatorTransmission ) ) )* otherlv_23= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==55) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalXacro.g:1516:4: otherlv_18= 'rightActuator' otherlv_19= '{' ( (lv_rightActuator_20_0= ruleActuatorTransmission ) ) (otherlv_21= ',' ( (lv_rightActuator_22_0= ruleActuatorTransmission ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,55,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getTransmissionAccess().getRightActuatorKeyword_8_0());
                    			
                    otherlv_19=(Token)match(input,17,FOLLOW_57); 

                    				newLeafNode(otherlv_19, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalXacro.g:1524:4: ( (lv_rightActuator_20_0= ruleActuatorTransmission ) )
                    // InternalXacro.g:1525:5: (lv_rightActuator_20_0= ruleActuatorTransmission )
                    {
                    // InternalXacro.g:1525:5: (lv_rightActuator_20_0= ruleActuatorTransmission )
                    // InternalXacro.g:1526:6: lv_rightActuator_20_0= ruleActuatorTransmission
                    {

                    						newCompositeNode(grammarAccess.getTransmissionAccess().getRightActuatorActuatorTransmissionParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_rightActuator_20_0=ruleActuatorTransmission();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransmissionRule());
                    						}
                    						add(
                    							current,
                    							"rightActuator",
                    							lv_rightActuator_20_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.ActuatorTransmission");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXacro.g:1543:4: (otherlv_21= ',' ( (lv_rightActuator_22_0= ruleActuatorTransmission ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==21) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalXacro.g:1544:5: otherlv_21= ',' ( (lv_rightActuator_22_0= ruleActuatorTransmission ) )
                    	    {
                    	    otherlv_21=(Token)match(input,21,FOLLOW_57); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getTransmissionAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalXacro.g:1548:5: ( (lv_rightActuator_22_0= ruleActuatorTransmission ) )
                    	    // InternalXacro.g:1549:6: (lv_rightActuator_22_0= ruleActuatorTransmission )
                    	    {
                    	    // InternalXacro.g:1549:6: (lv_rightActuator_22_0= ruleActuatorTransmission )
                    	    // InternalXacro.g:1550:7: lv_rightActuator_22_0= ruleActuatorTransmission
                    	    {

                    	    							newCompositeNode(grammarAccess.getTransmissionAccess().getRightActuatorActuatorTransmissionParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_rightActuator_22_0=ruleActuatorTransmission();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTransmissionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rightActuator",
                    	    								lv_rightActuator_22_0,
                    	    								"de.fraunhofer.ipa.kinematics.xacro.Xacro.ActuatorTransmission");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,22,FOLLOW_59); 

                    				newLeafNode(otherlv_23, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:1573:3: (otherlv_24= 'flexJoint' otherlv_25= '{' ( (lv_flexJoint_26_0= ruleActuatorTransmission ) ) (otherlv_27= ',' ( (lv_flexJoint_28_0= ruleActuatorTransmission ) ) )* otherlv_29= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==56) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalXacro.g:1574:4: otherlv_24= 'flexJoint' otherlv_25= '{' ( (lv_flexJoint_26_0= ruleActuatorTransmission ) ) (otherlv_27= ',' ( (lv_flexJoint_28_0= ruleActuatorTransmission ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,56,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getTransmissionAccess().getFlexJointKeyword_9_0());
                    			
                    otherlv_25=(Token)match(input,17,FOLLOW_57); 

                    				newLeafNode(otherlv_25, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalXacro.g:1582:4: ( (lv_flexJoint_26_0= ruleActuatorTransmission ) )
                    // InternalXacro.g:1583:5: (lv_flexJoint_26_0= ruleActuatorTransmission )
                    {
                    // InternalXacro.g:1583:5: (lv_flexJoint_26_0= ruleActuatorTransmission )
                    // InternalXacro.g:1584:6: lv_flexJoint_26_0= ruleActuatorTransmission
                    {

                    						newCompositeNode(grammarAccess.getTransmissionAccess().getFlexJointActuatorTransmissionParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_flexJoint_26_0=ruleActuatorTransmission();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransmissionRule());
                    						}
                    						add(
                    							current,
                    							"flexJoint",
                    							lv_flexJoint_26_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.ActuatorTransmission");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXacro.g:1601:4: (otherlv_27= ',' ( (lv_flexJoint_28_0= ruleActuatorTransmission ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==21) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalXacro.g:1602:5: otherlv_27= ',' ( (lv_flexJoint_28_0= ruleActuatorTransmission ) )
                    	    {
                    	    otherlv_27=(Token)match(input,21,FOLLOW_57); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getTransmissionAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalXacro.g:1606:5: ( (lv_flexJoint_28_0= ruleActuatorTransmission ) )
                    	    // InternalXacro.g:1607:6: (lv_flexJoint_28_0= ruleActuatorTransmission )
                    	    {
                    	    // InternalXacro.g:1607:6: (lv_flexJoint_28_0= ruleActuatorTransmission )
                    	    // InternalXacro.g:1608:7: lv_flexJoint_28_0= ruleActuatorTransmission
                    	    {

                    	    							newCompositeNode(grammarAccess.getTransmissionAccess().getFlexJointActuatorTransmissionParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_flexJoint_28_0=ruleActuatorTransmission();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTransmissionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"flexJoint",
                    	    								lv_flexJoint_28_0,
                    	    								"de.fraunhofer.ipa.kinematics.xacro.Xacro.ActuatorTransmission");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,22,FOLLOW_60); 

                    				newLeafNode(otherlv_29, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:1631:3: (otherlv_30= 'rollJoint' otherlv_31= '{' ( (lv_rollJoint_32_0= ruleActuatorTransmission ) ) (otherlv_33= ',' ( (lv_rollJoint_34_0= ruleActuatorTransmission ) ) )* otherlv_35= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==57) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalXacro.g:1632:4: otherlv_30= 'rollJoint' otherlv_31= '{' ( (lv_rollJoint_32_0= ruleActuatorTransmission ) ) (otherlv_33= ',' ( (lv_rollJoint_34_0= ruleActuatorTransmission ) ) )* otherlv_35= '}'
                    {
                    otherlv_30=(Token)match(input,57,FOLLOW_3); 

                    				newLeafNode(otherlv_30, grammarAccess.getTransmissionAccess().getRollJointKeyword_10_0());
                    			
                    otherlv_31=(Token)match(input,17,FOLLOW_57); 

                    				newLeafNode(otherlv_31, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalXacro.g:1640:4: ( (lv_rollJoint_32_0= ruleActuatorTransmission ) )
                    // InternalXacro.g:1641:5: (lv_rollJoint_32_0= ruleActuatorTransmission )
                    {
                    // InternalXacro.g:1641:5: (lv_rollJoint_32_0= ruleActuatorTransmission )
                    // InternalXacro.g:1642:6: lv_rollJoint_32_0= ruleActuatorTransmission
                    {

                    						newCompositeNode(grammarAccess.getTransmissionAccess().getRollJointActuatorTransmissionParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_rollJoint_32_0=ruleActuatorTransmission();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransmissionRule());
                    						}
                    						add(
                    							current,
                    							"rollJoint",
                    							lv_rollJoint_32_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.ActuatorTransmission");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXacro.g:1659:4: (otherlv_33= ',' ( (lv_rollJoint_34_0= ruleActuatorTransmission ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==21) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalXacro.g:1660:5: otherlv_33= ',' ( (lv_rollJoint_34_0= ruleActuatorTransmission ) )
                    	    {
                    	    otherlv_33=(Token)match(input,21,FOLLOW_57); 

                    	    					newLeafNode(otherlv_33, grammarAccess.getTransmissionAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalXacro.g:1664:5: ( (lv_rollJoint_34_0= ruleActuatorTransmission ) )
                    	    // InternalXacro.g:1665:6: (lv_rollJoint_34_0= ruleActuatorTransmission )
                    	    {
                    	    // InternalXacro.g:1665:6: (lv_rollJoint_34_0= ruleActuatorTransmission )
                    	    // InternalXacro.g:1666:7: lv_rollJoint_34_0= ruleActuatorTransmission
                    	    {

                    	    							newCompositeNode(grammarAccess.getTransmissionAccess().getRollJointActuatorTransmissionParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_rollJoint_34_0=ruleActuatorTransmission();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTransmissionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rollJoint",
                    	    								lv_rollJoint_34_0,
                    	    								"de.fraunhofer.ipa.kinematics.xacro.Xacro.ActuatorTransmission");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,22,FOLLOW_61); 

                    				newLeafNode(otherlv_35, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:1689:3: (otherlv_36= 'gapJoint' otherlv_37= '{' ( (lv_gapJoint_38_0= ruleGapJointTransmission ) ) (otherlv_39= ',' ( (lv_gapJoint_40_0= ruleGapJointTransmission ) ) )* otherlv_41= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==58) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalXacro.g:1690:4: otherlv_36= 'gapJoint' otherlv_37= '{' ( (lv_gapJoint_38_0= ruleGapJointTransmission ) ) (otherlv_39= ',' ( (lv_gapJoint_40_0= ruleGapJointTransmission ) ) )* otherlv_41= '}'
                    {
                    otherlv_36=(Token)match(input,58,FOLLOW_3); 

                    				newLeafNode(otherlv_36, grammarAccess.getTransmissionAccess().getGapJointKeyword_11_0());
                    			
                    otherlv_37=(Token)match(input,17,FOLLOW_62); 

                    				newLeafNode(otherlv_37, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalXacro.g:1698:4: ( (lv_gapJoint_38_0= ruleGapJointTransmission ) )
                    // InternalXacro.g:1699:5: (lv_gapJoint_38_0= ruleGapJointTransmission )
                    {
                    // InternalXacro.g:1699:5: (lv_gapJoint_38_0= ruleGapJointTransmission )
                    // InternalXacro.g:1700:6: lv_gapJoint_38_0= ruleGapJointTransmission
                    {

                    						newCompositeNode(grammarAccess.getTransmissionAccess().getGapJointGapJointTransmissionParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_gapJoint_38_0=ruleGapJointTransmission();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransmissionRule());
                    						}
                    						add(
                    							current,
                    							"gapJoint",
                    							lv_gapJoint_38_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.GapJointTransmission");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXacro.g:1717:4: (otherlv_39= ',' ( (lv_gapJoint_40_0= ruleGapJointTransmission ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==21) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalXacro.g:1718:5: otherlv_39= ',' ( (lv_gapJoint_40_0= ruleGapJointTransmission ) )
                    	    {
                    	    otherlv_39=(Token)match(input,21,FOLLOW_62); 

                    	    					newLeafNode(otherlv_39, grammarAccess.getTransmissionAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalXacro.g:1722:5: ( (lv_gapJoint_40_0= ruleGapJointTransmission ) )
                    	    // InternalXacro.g:1723:6: (lv_gapJoint_40_0= ruleGapJointTransmission )
                    	    {
                    	    // InternalXacro.g:1723:6: (lv_gapJoint_40_0= ruleGapJointTransmission )
                    	    // InternalXacro.g:1724:7: lv_gapJoint_40_0= ruleGapJointTransmission
                    	    {

                    	    							newCompositeNode(grammarAccess.getTransmissionAccess().getGapJointGapJointTransmissionParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_gapJoint_40_0=ruleGapJointTransmission();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTransmissionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"gapJoint",
                    	    								lv_gapJoint_40_0,
                    	    								"de.fraunhofer.ipa.kinematics.xacro.Xacro.GapJointTransmission");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_41=(Token)match(input,22,FOLLOW_63); 

                    				newLeafNode(otherlv_41, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:1747:3: (otherlv_42= 'passiveJoint' otherlv_43= '{' ( (lv_passiveJoint_44_0= rulePassiveJointTransmission ) ) (otherlv_45= ',' ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) ) )* otherlv_47= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==59) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalXacro.g:1748:4: otherlv_42= 'passiveJoint' otherlv_43= '{' ( (lv_passiveJoint_44_0= rulePassiveJointTransmission ) ) (otherlv_45= ',' ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) ) )* otherlv_47= '}'
                    {
                    otherlv_42=(Token)match(input,59,FOLLOW_3); 

                    				newLeafNode(otherlv_42, grammarAccess.getTransmissionAccess().getPassiveJointKeyword_12_0());
                    			
                    otherlv_43=(Token)match(input,17,FOLLOW_64); 

                    				newLeafNode(otherlv_43, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalXacro.g:1756:4: ( (lv_passiveJoint_44_0= rulePassiveJointTransmission ) )
                    // InternalXacro.g:1757:5: (lv_passiveJoint_44_0= rulePassiveJointTransmission )
                    {
                    // InternalXacro.g:1757:5: (lv_passiveJoint_44_0= rulePassiveJointTransmission )
                    // InternalXacro.g:1758:6: lv_passiveJoint_44_0= rulePassiveJointTransmission
                    {

                    						newCompositeNode(grammarAccess.getTransmissionAccess().getPassiveJointPassiveJointTransmissionParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_passiveJoint_44_0=rulePassiveJointTransmission();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransmissionRule());
                    						}
                    						add(
                    							current,
                    							"passiveJoint",
                    							lv_passiveJoint_44_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.PassiveJointTransmission");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXacro.g:1775:4: (otherlv_45= ',' ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==21) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalXacro.g:1776:5: otherlv_45= ',' ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) )
                    	    {
                    	    otherlv_45=(Token)match(input,21,FOLLOW_64); 

                    	    					newLeafNode(otherlv_45, grammarAccess.getTransmissionAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalXacro.g:1780:5: ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) )
                    	    // InternalXacro.g:1781:6: (lv_passiveJoint_46_0= rulePassiveJointTransmission )
                    	    {
                    	    // InternalXacro.g:1781:6: (lv_passiveJoint_46_0= rulePassiveJointTransmission )
                    	    // InternalXacro.g:1782:7: lv_passiveJoint_46_0= rulePassiveJointTransmission
                    	    {

                    	    							newCompositeNode(grammarAccess.getTransmissionAccess().getPassiveJointPassiveJointTransmissionParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_passiveJoint_46_0=rulePassiveJointTransmission();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTransmissionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"passiveJoint",
                    	    								lv_passiveJoint_46_0,
                    	    								"de.fraunhofer.ipa.kinematics.xacro.Xacro.PassiveJointTransmission");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_47=(Token)match(input,22,FOLLOW_65); 

                    				newLeafNode(otherlv_47, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:1805:3: (otherlv_48= 'useSimulatedGripperJoint' otherlv_49= '{' ( (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType ) ) (otherlv_51= ',' ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) ) )* otherlv_53= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==60) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalXacro.g:1806:4: otherlv_48= 'useSimulatedGripperJoint' otherlv_49= '{' ( (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType ) ) (otherlv_51= ',' ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) ) )* otherlv_53= '}'
                    {
                    otherlv_48=(Token)match(input,60,FOLLOW_3); 

                    				newLeafNode(otherlv_48, grammarAccess.getTransmissionAccess().getUseSimulatedGripperJointKeyword_13_0());
                    			
                    otherlv_49=(Token)match(input,17,FOLLOW_66); 

                    				newLeafNode(otherlv_49, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalXacro.g:1814:4: ( (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType ) )
                    // InternalXacro.g:1815:5: (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType )
                    {
                    // InternalXacro.g:1815:5: (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType )
                    // InternalXacro.g:1816:6: lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType
                    {

                    						newCompositeNode(grammarAccess.getTransmissionAccess().getUseSimulatedGripperJointUseSimulatedGripperJointTypeParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_useSimulatedGripperJoint_50_0=ruleUseSimulatedGripperJointType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransmissionRule());
                    						}
                    						add(
                    							current,
                    							"useSimulatedGripperJoint",
                    							lv_useSimulatedGripperJoint_50_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.UseSimulatedGripperJointType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXacro.g:1833:4: (otherlv_51= ',' ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==21) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalXacro.g:1834:5: otherlv_51= ',' ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) )
                    	    {
                    	    otherlv_51=(Token)match(input,21,FOLLOW_66); 

                    	    					newLeafNode(otherlv_51, grammarAccess.getTransmissionAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalXacro.g:1838:5: ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) )
                    	    // InternalXacro.g:1839:6: (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType )
                    	    {
                    	    // InternalXacro.g:1839:6: (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType )
                    	    // InternalXacro.g:1840:7: lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType
                    	    {

                    	    							newCompositeNode(grammarAccess.getTransmissionAccess().getUseSimulatedGripperJointUseSimulatedGripperJointTypeParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_useSimulatedGripperJoint_52_0=ruleUseSimulatedGripperJointType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTransmissionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"useSimulatedGripperJoint",
                    	    								lv_useSimulatedGripperJoint_52_0,
                    	    								"de.fraunhofer.ipa.kinematics.xacro.Xacro.UseSimulatedGripperJointType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_53=(Token)match(input,22,FOLLOW_67); 

                    				newLeafNode(otherlv_53, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:1863:3: (otherlv_54= 'actuator' otherlv_55= '{' ( (lv_actuator_56_0= ruleName ) ) (otherlv_57= ',' ( (lv_actuator_58_0= ruleName ) ) )* otherlv_59= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==61) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalXacro.g:1864:4: otherlv_54= 'actuator' otherlv_55= '{' ( (lv_actuator_56_0= ruleName ) ) (otherlv_57= ',' ( (lv_actuator_58_0= ruleName ) ) )* otherlv_59= '}'
                    {
                    otherlv_54=(Token)match(input,61,FOLLOW_3); 

                    				newLeafNode(otherlv_54, grammarAccess.getTransmissionAccess().getActuatorKeyword_14_0());
                    			
                    otherlv_55=(Token)match(input,17,FOLLOW_68); 

                    				newLeafNode(otherlv_55, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalXacro.g:1872:4: ( (lv_actuator_56_0= ruleName ) )
                    // InternalXacro.g:1873:5: (lv_actuator_56_0= ruleName )
                    {
                    // InternalXacro.g:1873:5: (lv_actuator_56_0= ruleName )
                    // InternalXacro.g:1874:6: lv_actuator_56_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getTransmissionAccess().getActuatorNameParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_actuator_56_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransmissionRule());
                    						}
                    						add(
                    							current,
                    							"actuator",
                    							lv_actuator_56_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXacro.g:1891:4: (otherlv_57= ',' ( (lv_actuator_58_0= ruleName ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==21) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalXacro.g:1892:5: otherlv_57= ',' ( (lv_actuator_58_0= ruleName ) )
                    	    {
                    	    otherlv_57=(Token)match(input,21,FOLLOW_68); 

                    	    					newLeafNode(otherlv_57, grammarAccess.getTransmissionAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalXacro.g:1896:5: ( (lv_actuator_58_0= ruleName ) )
                    	    // InternalXacro.g:1897:6: (lv_actuator_58_0= ruleName )
                    	    {
                    	    // InternalXacro.g:1897:6: (lv_actuator_58_0= ruleName )
                    	    // InternalXacro.g:1898:7: lv_actuator_58_0= ruleName
                    	    {

                    	    							newCompositeNode(grammarAccess.getTransmissionAccess().getActuatorNameParserRuleCall_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_actuator_58_0=ruleName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTransmissionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actuator",
                    	    								lv_actuator_58_0,
                    	    								"de.fraunhofer.ipa.kinematics.xacro.Xacro.Name");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_59=(Token)match(input,22,FOLLOW_69); 

                    				newLeafNode(otherlv_59, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:1921:3: (otherlv_60= 'joint' otherlv_61= '{' ( (lv_joint_62_0= ruleName ) ) (otherlv_63= ',' ( (lv_joint_64_0= ruleName ) ) )* otherlv_65= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==31) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalXacro.g:1922:4: otherlv_60= 'joint' otherlv_61= '{' ( (lv_joint_62_0= ruleName ) ) (otherlv_63= ',' ( (lv_joint_64_0= ruleName ) ) )* otherlv_65= '}'
                    {
                    otherlv_60=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_60, grammarAccess.getTransmissionAccess().getJointKeyword_15_0());
                    			
                    otherlv_61=(Token)match(input,17,FOLLOW_68); 

                    				newLeafNode(otherlv_61, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_15_1());
                    			
                    // InternalXacro.g:1930:4: ( (lv_joint_62_0= ruleName ) )
                    // InternalXacro.g:1931:5: (lv_joint_62_0= ruleName )
                    {
                    // InternalXacro.g:1931:5: (lv_joint_62_0= ruleName )
                    // InternalXacro.g:1932:6: lv_joint_62_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getTransmissionAccess().getJointNameParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_joint_62_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransmissionRule());
                    						}
                    						add(
                    							current,
                    							"joint",
                    							lv_joint_62_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXacro.g:1949:4: (otherlv_63= ',' ( (lv_joint_64_0= ruleName ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==21) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalXacro.g:1950:5: otherlv_63= ',' ( (lv_joint_64_0= ruleName ) )
                    	    {
                    	    otherlv_63=(Token)match(input,21,FOLLOW_68); 

                    	    					newLeafNode(otherlv_63, grammarAccess.getTransmissionAccess().getCommaKeyword_15_3_0());
                    	    				
                    	    // InternalXacro.g:1954:5: ( (lv_joint_64_0= ruleName ) )
                    	    // InternalXacro.g:1955:6: (lv_joint_64_0= ruleName )
                    	    {
                    	    // InternalXacro.g:1955:6: (lv_joint_64_0= ruleName )
                    	    // InternalXacro.g:1956:7: lv_joint_64_0= ruleName
                    	    {

                    	    							newCompositeNode(grammarAccess.getTransmissionAccess().getJointNameParserRuleCall_15_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_joint_64_0=ruleName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTransmissionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"joint",
                    	    								lv_joint_64_0,
                    	    								"de.fraunhofer.ipa.kinematics.xacro.Xacro.Name");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_65=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_65, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_15_4());
                    			

                    }
                    break;

            }

            otherlv_66=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_66, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransmission"


    // $ANTLR start "entryRulePose"
    // InternalXacro.g:1987:1: entryRulePose returns [EObject current=null] : iv_rulePose= rulePose EOF ;
    public final EObject entryRulePose() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePose = null;


        try {
            // InternalXacro.g:1987:45: (iv_rulePose= rulePose EOF )
            // InternalXacro.g:1988:2: iv_rulePose= rulePose EOF
            {
             newCompositeNode(grammarAccess.getPoseRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePose=rulePose();

            state._fsp--;

             current =iv_rulePose; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePose"


    // $ANTLR start "rulePose"
    // InternalXacro.g:1994:1: rulePose returns [EObject current=null] : ( () otherlv_1= 'Pose' otherlv_2= '{' (otherlv_3= 'rpy' ( (lv_rpy_4_0= ruleEString ) ) )? (otherlv_5= 'xyz' ( (lv_xyz_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject rulePose() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_rpy_4_0 = null;

        AntlrDatatypeRuleToken lv_xyz_6_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:2000:2: ( ( () otherlv_1= 'Pose' otherlv_2= '{' (otherlv_3= 'rpy' ( (lv_rpy_4_0= ruleEString ) ) )? (otherlv_5= 'xyz' ( (lv_xyz_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalXacro.g:2001:2: ( () otherlv_1= 'Pose' otherlv_2= '{' (otherlv_3= 'rpy' ( (lv_rpy_4_0= ruleEString ) ) )? (otherlv_5= 'xyz' ( (lv_xyz_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalXacro.g:2001:2: ( () otherlv_1= 'Pose' otherlv_2= '{' (otherlv_3= 'rpy' ( (lv_rpy_4_0= ruleEString ) ) )? (otherlv_5= 'xyz' ( (lv_xyz_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalXacro.g:2002:3: () otherlv_1= 'Pose' otherlv_2= '{' (otherlv_3= 'rpy' ( (lv_rpy_4_0= ruleEString ) ) )? (otherlv_5= 'xyz' ( (lv_xyz_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalXacro.g:2002:3: ()
            // InternalXacro.g:2003:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPoseAccess().getPoseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPoseAccess().getPoseKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getPoseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:2017:3: (otherlv_3= 'rpy' ( (lv_rpy_4_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==63) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalXacro.g:2018:4: otherlv_3= 'rpy' ( (lv_rpy_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,63,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getPoseAccess().getRpyKeyword_3_0());
                    			
                    // InternalXacro.g:2022:4: ( (lv_rpy_4_0= ruleEString ) )
                    // InternalXacro.g:2023:5: (lv_rpy_4_0= ruleEString )
                    {
                    // InternalXacro.g:2023:5: (lv_rpy_4_0= ruleEString )
                    // InternalXacro.g:2024:6: lv_rpy_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPoseAccess().getRpyEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_71);
                    lv_rpy_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPoseRule());
                    						}
                    						set(
                    							current,
                    							"rpy",
                    							lv_rpy_4_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:2042:3: (otherlv_5= 'xyz' ( (lv_xyz_6_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==64) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalXacro.g:2043:4: otherlv_5= 'xyz' ( (lv_xyz_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,64,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getPoseAccess().getXyzKeyword_4_0());
                    			
                    // InternalXacro.g:2047:4: ( (lv_xyz_6_0= ruleEString ) )
                    // InternalXacro.g:2048:5: (lv_xyz_6_0= ruleEString )
                    {
                    // InternalXacro.g:2048:5: (lv_xyz_6_0= ruleEString )
                    // InternalXacro.g:2049:6: lv_xyz_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPoseAccess().getXyzEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_xyz_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPoseRule());
                    						}
                    						set(
                    							current,
                    							"xyz",
                    							lv_xyz_6_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPoseAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePose"


    // $ANTLR start "entryRuleAxis"
    // InternalXacro.g:2075:1: entryRuleAxis returns [EObject current=null] : iv_ruleAxis= ruleAxis EOF ;
    public final EObject entryRuleAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxis = null;


        try {
            // InternalXacro.g:2075:45: (iv_ruleAxis= ruleAxis EOF )
            // InternalXacro.g:2076:2: iv_ruleAxis= ruleAxis EOF
            {
             newCompositeNode(grammarAccess.getAxisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAxis=ruleAxis();

            state._fsp--;

             current =iv_ruleAxis; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAxis"


    // $ANTLR start "ruleAxis"
    // InternalXacro.g:2082:1: ruleAxis returns [EObject current=null] : ( () otherlv_1= 'Axis' otherlv_2= '{' (otherlv_3= 'xyz' ( (lv_xyz_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleAxis() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_xyz_4_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:2088:2: ( ( () otherlv_1= 'Axis' otherlv_2= '{' (otherlv_3= 'xyz' ( (lv_xyz_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalXacro.g:2089:2: ( () otherlv_1= 'Axis' otherlv_2= '{' (otherlv_3= 'xyz' ( (lv_xyz_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalXacro.g:2089:2: ( () otherlv_1= 'Axis' otherlv_2= '{' (otherlv_3= 'xyz' ( (lv_xyz_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalXacro.g:2090:3: () otherlv_1= 'Axis' otherlv_2= '{' (otherlv_3= 'xyz' ( (lv_xyz_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalXacro.g:2090:3: ()
            // InternalXacro.g:2091:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAxisAccess().getAxisAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAxisAccess().getAxisKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_71); 

            			newLeafNode(otherlv_2, grammarAccess.getAxisAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:2105:3: (otherlv_3= 'xyz' ( (lv_xyz_4_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==64) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalXacro.g:2106:4: otherlv_3= 'xyz' ( (lv_xyz_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,64,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getAxisAccess().getXyzKeyword_3_0());
                    			
                    // InternalXacro.g:2110:4: ( (lv_xyz_4_0= ruleEString ) )
                    // InternalXacro.g:2111:5: (lv_xyz_4_0= ruleEString )
                    {
                    // InternalXacro.g:2111:5: (lv_xyz_4_0= ruleEString )
                    // InternalXacro.g:2112:6: lv_xyz_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAxisAccess().getXyzEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_xyz_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAxisRule());
                    						}
                    						set(
                    							current,
                    							"xyz",
                    							lv_xyz_4_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAxisAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAxis"


    // $ANTLR start "entryRuleCalibration"
    // InternalXacro.g:2138:1: entryRuleCalibration returns [EObject current=null] : iv_ruleCalibration= ruleCalibration EOF ;
    public final EObject entryRuleCalibration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalibration = null;


        try {
            // InternalXacro.g:2138:52: (iv_ruleCalibration= ruleCalibration EOF )
            // InternalXacro.g:2139:2: iv_ruleCalibration= ruleCalibration EOF
            {
             newCompositeNode(grammarAccess.getCalibrationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCalibration=ruleCalibration();

            state._fsp--;

             current =iv_ruleCalibration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCalibration"


    // $ANTLR start "ruleCalibration"
    // InternalXacro.g:2145:1: ruleCalibration returns [EObject current=null] : ( () otherlv_1= 'Calibration' otherlv_2= '{' (otherlv_3= 'falling' ( (lv_falling_4_0= ruleDouble0 ) ) )? (otherlv_5= 'referencePosition' ( (lv_referencePosition_6_0= ruleDouble0 ) ) )? (otherlv_7= 'rising' ( (lv_rising_8_0= ruleDouble0 ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleCalibration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_falling_4_0 = null;

        AntlrDatatypeRuleToken lv_referencePosition_6_0 = null;

        AntlrDatatypeRuleToken lv_rising_8_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:2151:2: ( ( () otherlv_1= 'Calibration' otherlv_2= '{' (otherlv_3= 'falling' ( (lv_falling_4_0= ruleDouble0 ) ) )? (otherlv_5= 'referencePosition' ( (lv_referencePosition_6_0= ruleDouble0 ) ) )? (otherlv_7= 'rising' ( (lv_rising_8_0= ruleDouble0 ) ) )? otherlv_9= '}' ) )
            // InternalXacro.g:2152:2: ( () otherlv_1= 'Calibration' otherlv_2= '{' (otherlv_3= 'falling' ( (lv_falling_4_0= ruleDouble0 ) ) )? (otherlv_5= 'referencePosition' ( (lv_referencePosition_6_0= ruleDouble0 ) ) )? (otherlv_7= 'rising' ( (lv_rising_8_0= ruleDouble0 ) ) )? otherlv_9= '}' )
            {
            // InternalXacro.g:2152:2: ( () otherlv_1= 'Calibration' otherlv_2= '{' (otherlv_3= 'falling' ( (lv_falling_4_0= ruleDouble0 ) ) )? (otherlv_5= 'referencePosition' ( (lv_referencePosition_6_0= ruleDouble0 ) ) )? (otherlv_7= 'rising' ( (lv_rising_8_0= ruleDouble0 ) ) )? otherlv_9= '}' )
            // InternalXacro.g:2153:3: () otherlv_1= 'Calibration' otherlv_2= '{' (otherlv_3= 'falling' ( (lv_falling_4_0= ruleDouble0 ) ) )? (otherlv_5= 'referencePosition' ( (lv_referencePosition_6_0= ruleDouble0 ) ) )? (otherlv_7= 'rising' ( (lv_rising_8_0= ruleDouble0 ) ) )? otherlv_9= '}'
            {
            // InternalXacro.g:2153:3: ()
            // InternalXacro.g:2154:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCalibrationAccess().getCalibrationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCalibrationAccess().getCalibrationKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_72); 

            			newLeafNode(otherlv_2, grammarAccess.getCalibrationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:2168:3: (otherlv_3= 'falling' ( (lv_falling_4_0= ruleDouble0 ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==67) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalXacro.g:2169:4: otherlv_3= 'falling' ( (lv_falling_4_0= ruleDouble0 ) )
                    {
                    otherlv_3=(Token)match(input,67,FOLLOW_55); 

                    				newLeafNode(otherlv_3, grammarAccess.getCalibrationAccess().getFallingKeyword_3_0());
                    			
                    // InternalXacro.g:2173:4: ( (lv_falling_4_0= ruleDouble0 ) )
                    // InternalXacro.g:2174:5: (lv_falling_4_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2174:5: (lv_falling_4_0= ruleDouble0 )
                    // InternalXacro.g:2175:6: lv_falling_4_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getCalibrationAccess().getFallingDouble0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_73);
                    lv_falling_4_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCalibrationRule());
                    						}
                    						set(
                    							current,
                    							"falling",
                    							lv_falling_4_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:2193:3: (otherlv_5= 'referencePosition' ( (lv_referencePosition_6_0= ruleDouble0 ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==68) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalXacro.g:2194:4: otherlv_5= 'referencePosition' ( (lv_referencePosition_6_0= ruleDouble0 ) )
                    {
                    otherlv_5=(Token)match(input,68,FOLLOW_55); 

                    				newLeafNode(otherlv_5, grammarAccess.getCalibrationAccess().getReferencePositionKeyword_4_0());
                    			
                    // InternalXacro.g:2198:4: ( (lv_referencePosition_6_0= ruleDouble0 ) )
                    // InternalXacro.g:2199:5: (lv_referencePosition_6_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2199:5: (lv_referencePosition_6_0= ruleDouble0 )
                    // InternalXacro.g:2200:6: lv_referencePosition_6_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getCalibrationAccess().getReferencePositionDouble0ParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_74);
                    lv_referencePosition_6_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCalibrationRule());
                    						}
                    						set(
                    							current,
                    							"referencePosition",
                    							lv_referencePosition_6_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:2218:3: (otherlv_7= 'rising' ( (lv_rising_8_0= ruleDouble0 ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==69) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalXacro.g:2219:4: otherlv_7= 'rising' ( (lv_rising_8_0= ruleDouble0 ) )
                    {
                    otherlv_7=(Token)match(input,69,FOLLOW_55); 

                    				newLeafNode(otherlv_7, grammarAccess.getCalibrationAccess().getRisingKeyword_5_0());
                    			
                    // InternalXacro.g:2223:4: ( (lv_rising_8_0= ruleDouble0 ) )
                    // InternalXacro.g:2224:5: (lv_rising_8_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2224:5: (lv_rising_8_0= ruleDouble0 )
                    // InternalXacro.g:2225:6: lv_rising_8_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getCalibrationAccess().getRisingDouble0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_rising_8_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCalibrationRule());
                    						}
                    						set(
                    							current,
                    							"rising",
                    							lv_rising_8_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCalibrationAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCalibration"


    // $ANTLR start "entryRuleDynamics"
    // InternalXacro.g:2251:1: entryRuleDynamics returns [EObject current=null] : iv_ruleDynamics= ruleDynamics EOF ;
    public final EObject entryRuleDynamics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamics = null;


        try {
            // InternalXacro.g:2251:49: (iv_ruleDynamics= ruleDynamics EOF )
            // InternalXacro.g:2252:2: iv_ruleDynamics= ruleDynamics EOF
            {
             newCompositeNode(grammarAccess.getDynamicsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDynamics=ruleDynamics();

            state._fsp--;

             current =iv_ruleDynamics; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDynamics"


    // $ANTLR start "ruleDynamics"
    // InternalXacro.g:2258:1: ruleDynamics returns [EObject current=null] : ( () otherlv_1= 'Dynamics' otherlv_2= '{' (otherlv_3= 'damping' ( (lv_damping_4_0= ruleDouble0 ) ) )? (otherlv_5= 'friction' ( (lv_friction_6_0= ruleDouble0 ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleDynamics() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_damping_4_0 = null;

        AntlrDatatypeRuleToken lv_friction_6_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:2264:2: ( ( () otherlv_1= 'Dynamics' otherlv_2= '{' (otherlv_3= 'damping' ( (lv_damping_4_0= ruleDouble0 ) ) )? (otherlv_5= 'friction' ( (lv_friction_6_0= ruleDouble0 ) ) )? otherlv_7= '}' ) )
            // InternalXacro.g:2265:2: ( () otherlv_1= 'Dynamics' otherlv_2= '{' (otherlv_3= 'damping' ( (lv_damping_4_0= ruleDouble0 ) ) )? (otherlv_5= 'friction' ( (lv_friction_6_0= ruleDouble0 ) ) )? otherlv_7= '}' )
            {
            // InternalXacro.g:2265:2: ( () otherlv_1= 'Dynamics' otherlv_2= '{' (otherlv_3= 'damping' ( (lv_damping_4_0= ruleDouble0 ) ) )? (otherlv_5= 'friction' ( (lv_friction_6_0= ruleDouble0 ) ) )? otherlv_7= '}' )
            // InternalXacro.g:2266:3: () otherlv_1= 'Dynamics' otherlv_2= '{' (otherlv_3= 'damping' ( (lv_damping_4_0= ruleDouble0 ) ) )? (otherlv_5= 'friction' ( (lv_friction_6_0= ruleDouble0 ) ) )? otherlv_7= '}'
            {
            // InternalXacro.g:2266:3: ()
            // InternalXacro.g:2267:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDynamicsAccess().getDynamicsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,70,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDynamicsAccess().getDynamicsKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_75); 

            			newLeafNode(otherlv_2, grammarAccess.getDynamicsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:2281:3: (otherlv_3= 'damping' ( (lv_damping_4_0= ruleDouble0 ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==71) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalXacro.g:2282:4: otherlv_3= 'damping' ( (lv_damping_4_0= ruleDouble0 ) )
                    {
                    otherlv_3=(Token)match(input,71,FOLLOW_55); 

                    				newLeafNode(otherlv_3, grammarAccess.getDynamicsAccess().getDampingKeyword_3_0());
                    			
                    // InternalXacro.g:2286:4: ( (lv_damping_4_0= ruleDouble0 ) )
                    // InternalXacro.g:2287:5: (lv_damping_4_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2287:5: (lv_damping_4_0= ruleDouble0 )
                    // InternalXacro.g:2288:6: lv_damping_4_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getDynamicsAccess().getDampingDouble0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_76);
                    lv_damping_4_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDynamicsRule());
                    						}
                    						set(
                    							current,
                    							"damping",
                    							lv_damping_4_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:2306:3: (otherlv_5= 'friction' ( (lv_friction_6_0= ruleDouble0 ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==72) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalXacro.g:2307:4: otherlv_5= 'friction' ( (lv_friction_6_0= ruleDouble0 ) )
                    {
                    otherlv_5=(Token)match(input,72,FOLLOW_55); 

                    				newLeafNode(otherlv_5, grammarAccess.getDynamicsAccess().getFrictionKeyword_4_0());
                    			
                    // InternalXacro.g:2311:4: ( (lv_friction_6_0= ruleDouble0 ) )
                    // InternalXacro.g:2312:5: (lv_friction_6_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2312:5: (lv_friction_6_0= ruleDouble0 )
                    // InternalXacro.g:2313:6: lv_friction_6_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getDynamicsAccess().getFrictionDouble0ParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_friction_6_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDynamicsRule());
                    						}
                    						set(
                    							current,
                    							"friction",
                    							lv_friction_6_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDynamicsAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDynamics"


    // $ANTLR start "entryRuleLimit"
    // InternalXacro.g:2339:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // InternalXacro.g:2339:46: (iv_ruleLimit= ruleLimit EOF )
            // InternalXacro.g:2340:2: iv_ruleLimit= ruleLimit EOF
            {
             newCompositeNode(grammarAccess.getLimitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLimit=ruleLimit();

            state._fsp--;

             current =iv_ruleLimit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLimit"


    // $ANTLR start "ruleLimit"
    // InternalXacro.g:2346:1: ruleLimit returns [EObject current=null] : ( () otherlv_1= 'Limit' otherlv_2= '{' (otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) ) )? (otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) ) )? (otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) ) )? (otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleLimit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_effort_4_0 = null;

        AntlrDatatypeRuleToken lv_lower_6_0 = null;

        AntlrDatatypeRuleToken lv_upper_8_0 = null;

        AntlrDatatypeRuleToken lv_velocity_10_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:2352:2: ( ( () otherlv_1= 'Limit' otherlv_2= '{' (otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) ) )? (otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) ) )? (otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) ) )? (otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) ) )? otherlv_11= '}' ) )
            // InternalXacro.g:2353:2: ( () otherlv_1= 'Limit' otherlv_2= '{' (otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) ) )? (otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) ) )? (otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) ) )? (otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) ) )? otherlv_11= '}' )
            {
            // InternalXacro.g:2353:2: ( () otherlv_1= 'Limit' otherlv_2= '{' (otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) ) )? (otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) ) )? (otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) ) )? (otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) ) )? otherlv_11= '}' )
            // InternalXacro.g:2354:3: () otherlv_1= 'Limit' otherlv_2= '{' (otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) ) )? (otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) ) )? (otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) ) )? (otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) ) )? otherlv_11= '}'
            {
            // InternalXacro.g:2354:3: ()
            // InternalXacro.g:2355:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLimitAccess().getLimitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,73,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLimitAccess().getLimitKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_77); 

            			newLeafNode(otherlv_2, grammarAccess.getLimitAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:2369:3: (otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==74) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalXacro.g:2370:4: otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) )
                    {
                    otherlv_3=(Token)match(input,74,FOLLOW_55); 

                    				newLeafNode(otherlv_3, grammarAccess.getLimitAccess().getEffortKeyword_3_0());
                    			
                    // InternalXacro.g:2374:4: ( (lv_effort_4_0= ruleDouble0 ) )
                    // InternalXacro.g:2375:5: (lv_effort_4_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2375:5: (lv_effort_4_0= ruleDouble0 )
                    // InternalXacro.g:2376:6: lv_effort_4_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getLimitAccess().getEffortDouble0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_78);
                    lv_effort_4_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLimitRule());
                    						}
                    						set(
                    							current,
                    							"effort",
                    							lv_effort_4_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:2394:3: (otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==75) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalXacro.g:2395:4: otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) )
                    {
                    otherlv_5=(Token)match(input,75,FOLLOW_55); 

                    				newLeafNode(otherlv_5, grammarAccess.getLimitAccess().getLowerKeyword_4_0());
                    			
                    // InternalXacro.g:2399:4: ( (lv_lower_6_0= ruleDouble0 ) )
                    // InternalXacro.g:2400:5: (lv_lower_6_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2400:5: (lv_lower_6_0= ruleDouble0 )
                    // InternalXacro.g:2401:6: lv_lower_6_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getLimitAccess().getLowerDouble0ParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_79);
                    lv_lower_6_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLimitRule());
                    						}
                    						set(
                    							current,
                    							"lower",
                    							lv_lower_6_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:2419:3: (otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==76) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalXacro.g:2420:4: otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) )
                    {
                    otherlv_7=(Token)match(input,76,FOLLOW_55); 

                    				newLeafNode(otherlv_7, grammarAccess.getLimitAccess().getUpperKeyword_5_0());
                    			
                    // InternalXacro.g:2424:4: ( (lv_upper_8_0= ruleDouble0 ) )
                    // InternalXacro.g:2425:5: (lv_upper_8_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2425:5: (lv_upper_8_0= ruleDouble0 )
                    // InternalXacro.g:2426:6: lv_upper_8_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getLimitAccess().getUpperDouble0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_80);
                    lv_upper_8_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLimitRule());
                    						}
                    						set(
                    							current,
                    							"upper",
                    							lv_upper_8_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:2444:3: (otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==77) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalXacro.g:2445:4: otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) )
                    {
                    otherlv_9=(Token)match(input,77,FOLLOW_55); 

                    				newLeafNode(otherlv_9, grammarAccess.getLimitAccess().getVelocityKeyword_6_0());
                    			
                    // InternalXacro.g:2449:4: ( (lv_velocity_10_0= ruleDouble0 ) )
                    // InternalXacro.g:2450:5: (lv_velocity_10_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2450:5: (lv_velocity_10_0= ruleDouble0 )
                    // InternalXacro.g:2451:6: lv_velocity_10_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getLimitAccess().getVelocityDouble0ParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_velocity_10_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLimitRule());
                    						}
                    						set(
                    							current,
                    							"velocity",
                    							lv_velocity_10_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getLimitAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLimit"


    // $ANTLR start "entryRuleSafetyController"
    // InternalXacro.g:2477:1: entryRuleSafetyController returns [EObject current=null] : iv_ruleSafetyController= ruleSafetyController EOF ;
    public final EObject entryRuleSafetyController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSafetyController = null;


        try {
            // InternalXacro.g:2477:57: (iv_ruleSafetyController= ruleSafetyController EOF )
            // InternalXacro.g:2478:2: iv_ruleSafetyController= ruleSafetyController EOF
            {
             newCompositeNode(grammarAccess.getSafetyControllerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSafetyController=ruleSafetyController();

            state._fsp--;

             current =iv_ruleSafetyController; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSafetyController"


    // $ANTLR start "ruleSafetyController"
    // InternalXacro.g:2484:1: ruleSafetyController returns [EObject current=null] : (otherlv_0= 'SafetyController' otherlv_1= '{' (otherlv_2= 'kPosition' ( (lv_kPosition_3_0= ruleDouble0 ) ) )? otherlv_4= 'kVelocity' ( (lv_kVelocity_5_0= ruleDouble0 ) ) (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleDouble0 ) ) )? (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleDouble0 ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleSafetyController() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_kPosition_3_0 = null;

        AntlrDatatypeRuleToken lv_kVelocity_5_0 = null;

        AntlrDatatypeRuleToken lv_softLowerLimit_7_0 = null;

        AntlrDatatypeRuleToken lv_softUpperLimit_9_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:2490:2: ( (otherlv_0= 'SafetyController' otherlv_1= '{' (otherlv_2= 'kPosition' ( (lv_kPosition_3_0= ruleDouble0 ) ) )? otherlv_4= 'kVelocity' ( (lv_kVelocity_5_0= ruleDouble0 ) ) (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleDouble0 ) ) )? (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleDouble0 ) ) )? otherlv_10= '}' ) )
            // InternalXacro.g:2491:2: (otherlv_0= 'SafetyController' otherlv_1= '{' (otherlv_2= 'kPosition' ( (lv_kPosition_3_0= ruleDouble0 ) ) )? otherlv_4= 'kVelocity' ( (lv_kVelocity_5_0= ruleDouble0 ) ) (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleDouble0 ) ) )? (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleDouble0 ) ) )? otherlv_10= '}' )
            {
            // InternalXacro.g:2491:2: (otherlv_0= 'SafetyController' otherlv_1= '{' (otherlv_2= 'kPosition' ( (lv_kPosition_3_0= ruleDouble0 ) ) )? otherlv_4= 'kVelocity' ( (lv_kVelocity_5_0= ruleDouble0 ) ) (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleDouble0 ) ) )? (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleDouble0 ) ) )? otherlv_10= '}' )
            // InternalXacro.g:2492:3: otherlv_0= 'SafetyController' otherlv_1= '{' (otherlv_2= 'kPosition' ( (lv_kPosition_3_0= ruleDouble0 ) ) )? otherlv_4= 'kVelocity' ( (lv_kVelocity_5_0= ruleDouble0 ) ) (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleDouble0 ) ) )? (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleDouble0 ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSafetyControllerAccess().getSafetyControllerKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_81); 

            			newLeafNode(otherlv_1, grammarAccess.getSafetyControllerAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXacro.g:2500:3: (otherlv_2= 'kPosition' ( (lv_kPosition_3_0= ruleDouble0 ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==79) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalXacro.g:2501:4: otherlv_2= 'kPosition' ( (lv_kPosition_3_0= ruleDouble0 ) )
                    {
                    otherlv_2=(Token)match(input,79,FOLLOW_55); 

                    				newLeafNode(otherlv_2, grammarAccess.getSafetyControllerAccess().getKPositionKeyword_2_0());
                    			
                    // InternalXacro.g:2505:4: ( (lv_kPosition_3_0= ruleDouble0 ) )
                    // InternalXacro.g:2506:5: (lv_kPosition_3_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2506:5: (lv_kPosition_3_0= ruleDouble0 )
                    // InternalXacro.g:2507:6: lv_kPosition_3_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getSafetyControllerAccess().getKPositionDouble0ParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_82);
                    lv_kPosition_3_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
                    						}
                    						set(
                    							current,
                    							"kPosition",
                    							lv_kPosition_3_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,80,FOLLOW_55); 

            			newLeafNode(otherlv_4, grammarAccess.getSafetyControllerAccess().getKVelocityKeyword_3());
            		
            // InternalXacro.g:2529:3: ( (lv_kVelocity_5_0= ruleDouble0 ) )
            // InternalXacro.g:2530:4: (lv_kVelocity_5_0= ruleDouble0 )
            {
            // InternalXacro.g:2530:4: (lv_kVelocity_5_0= ruleDouble0 )
            // InternalXacro.g:2531:5: lv_kVelocity_5_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getSafetyControllerAccess().getKVelocityDouble0ParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_83);
            lv_kVelocity_5_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
            					}
            					set(
            						current,
            						"kVelocity",
            						lv_kVelocity_5_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXacro.g:2548:3: (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleDouble0 ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==81) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalXacro.g:2549:4: otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleDouble0 ) )
                    {
                    otherlv_6=(Token)match(input,81,FOLLOW_55); 

                    				newLeafNode(otherlv_6, grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_5_0());
                    			
                    // InternalXacro.g:2553:4: ( (lv_softLowerLimit_7_0= ruleDouble0 ) )
                    // InternalXacro.g:2554:5: (lv_softLowerLimit_7_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2554:5: (lv_softLowerLimit_7_0= ruleDouble0 )
                    // InternalXacro.g:2555:6: lv_softLowerLimit_7_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitDouble0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_84);
                    lv_softLowerLimit_7_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
                    						}
                    						set(
                    							current,
                    							"softLowerLimit",
                    							lv_softLowerLimit_7_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:2573:3: (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleDouble0 ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==82) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalXacro.g:2574:4: otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleDouble0 ) )
                    {
                    otherlv_8=(Token)match(input,82,FOLLOW_55); 

                    				newLeafNode(otherlv_8, grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_6_0());
                    			
                    // InternalXacro.g:2578:4: ( (lv_softUpperLimit_9_0= ruleDouble0 ) )
                    // InternalXacro.g:2579:5: (lv_softUpperLimit_9_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2579:5: (lv_softUpperLimit_9_0= ruleDouble0 )
                    // InternalXacro.g:2580:6: lv_softUpperLimit_9_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitDouble0ParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_softUpperLimit_9_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
                    						}
                    						set(
                    							current,
                    							"softUpperLimit",
                    							lv_softUpperLimit_9_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getSafetyControllerAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSafetyController"


    // $ANTLR start "entryRuleMimic"
    // InternalXacro.g:2606:1: entryRuleMimic returns [EObject current=null] : iv_ruleMimic= ruleMimic EOF ;
    public final EObject entryRuleMimic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMimic = null;


        try {
            // InternalXacro.g:2606:46: (iv_ruleMimic= ruleMimic EOF )
            // InternalXacro.g:2607:2: iv_ruleMimic= ruleMimic EOF
            {
             newCompositeNode(grammarAccess.getMimicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMimic=ruleMimic();

            state._fsp--;

             current =iv_ruleMimic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMimic"


    // $ANTLR start "ruleMimic"
    // InternalXacro.g:2613:1: ruleMimic returns [EObject current=null] : (otherlv_0= 'Mimic' otherlv_1= '{' otherlv_2= 'joint' ( (lv_joint_3_0= ruleEString ) ) (otherlv_4= 'multiplier' ( (lv_multiplier_5_0= ruleDouble0 ) ) )? (otherlv_6= 'offset' ( (lv_offset_7_0= ruleDouble0 ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleMimic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_joint_3_0 = null;

        AntlrDatatypeRuleToken lv_multiplier_5_0 = null;

        AntlrDatatypeRuleToken lv_offset_7_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:2619:2: ( (otherlv_0= 'Mimic' otherlv_1= '{' otherlv_2= 'joint' ( (lv_joint_3_0= ruleEString ) ) (otherlv_4= 'multiplier' ( (lv_multiplier_5_0= ruleDouble0 ) ) )? (otherlv_6= 'offset' ( (lv_offset_7_0= ruleDouble0 ) ) )? otherlv_8= '}' ) )
            // InternalXacro.g:2620:2: (otherlv_0= 'Mimic' otherlv_1= '{' otherlv_2= 'joint' ( (lv_joint_3_0= ruleEString ) ) (otherlv_4= 'multiplier' ( (lv_multiplier_5_0= ruleDouble0 ) ) )? (otherlv_6= 'offset' ( (lv_offset_7_0= ruleDouble0 ) ) )? otherlv_8= '}' )
            {
            // InternalXacro.g:2620:2: (otherlv_0= 'Mimic' otherlv_1= '{' otherlv_2= 'joint' ( (lv_joint_3_0= ruleEString ) ) (otherlv_4= 'multiplier' ( (lv_multiplier_5_0= ruleDouble0 ) ) )? (otherlv_6= 'offset' ( (lv_offset_7_0= ruleDouble0 ) ) )? otherlv_8= '}' )
            // InternalXacro.g:2621:3: otherlv_0= 'Mimic' otherlv_1= '{' otherlv_2= 'joint' ( (lv_joint_3_0= ruleEString ) ) (otherlv_4= 'multiplier' ( (lv_multiplier_5_0= ruleDouble0 ) ) )? (otherlv_6= 'offset' ( (lv_offset_7_0= ruleDouble0 ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,83,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMimicAccess().getMimicKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_85); 

            			newLeafNode(otherlv_1, grammarAccess.getMimicAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMimicAccess().getJointKeyword_2());
            		
            // InternalXacro.g:2633:3: ( (lv_joint_3_0= ruleEString ) )
            // InternalXacro.g:2634:4: (lv_joint_3_0= ruleEString )
            {
            // InternalXacro.g:2634:4: (lv_joint_3_0= ruleEString )
            // InternalXacro.g:2635:5: lv_joint_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMimicAccess().getJointEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_86);
            lv_joint_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMimicRule());
            					}
            					set(
            						current,
            						"joint",
            						lv_joint_3_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXacro.g:2652:3: (otherlv_4= 'multiplier' ( (lv_multiplier_5_0= ruleDouble0 ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==84) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalXacro.g:2653:4: otherlv_4= 'multiplier' ( (lv_multiplier_5_0= ruleDouble0 ) )
                    {
                    otherlv_4=(Token)match(input,84,FOLLOW_55); 

                    				newLeafNode(otherlv_4, grammarAccess.getMimicAccess().getMultiplierKeyword_4_0());
                    			
                    // InternalXacro.g:2657:4: ( (lv_multiplier_5_0= ruleDouble0 ) )
                    // InternalXacro.g:2658:5: (lv_multiplier_5_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2658:5: (lv_multiplier_5_0= ruleDouble0 )
                    // InternalXacro.g:2659:6: lv_multiplier_5_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getMimicAccess().getMultiplierDouble0ParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_87);
                    lv_multiplier_5_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMimicRule());
                    						}
                    						set(
                    							current,
                    							"multiplier",
                    							lv_multiplier_5_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:2677:3: (otherlv_6= 'offset' ( (lv_offset_7_0= ruleDouble0 ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==85) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalXacro.g:2678:4: otherlv_6= 'offset' ( (lv_offset_7_0= ruleDouble0 ) )
                    {
                    otherlv_6=(Token)match(input,85,FOLLOW_55); 

                    				newLeafNode(otherlv_6, grammarAccess.getMimicAccess().getOffsetKeyword_5_0());
                    			
                    // InternalXacro.g:2682:4: ( (lv_offset_7_0= ruleDouble0 ) )
                    // InternalXacro.g:2683:5: (lv_offset_7_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2683:5: (lv_offset_7_0= ruleDouble0 )
                    // InternalXacro.g:2684:6: lv_offset_7_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getMimicAccess().getOffsetDouble0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_offset_7_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMimicRule());
                    						}
                    						set(
                    							current,
                    							"offset",
                    							lv_offset_7_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getMimicAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMimic"


    // $ANTLR start "entryRuleInertial"
    // InternalXacro.g:2710:1: entryRuleInertial returns [EObject current=null] : iv_ruleInertial= ruleInertial EOF ;
    public final EObject entryRuleInertial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertial = null;


        try {
            // InternalXacro.g:2710:49: (iv_ruleInertial= ruleInertial EOF )
            // InternalXacro.g:2711:2: iv_ruleInertial= ruleInertial EOF
            {
             newCompositeNode(grammarAccess.getInertialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInertial=ruleInertial();

            state._fsp--;

             current =iv_ruleInertial; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInertial"


    // $ANTLR start "ruleInertial"
    // InternalXacro.g:2717:1: ruleInertial returns [EObject current=null] : ( () otherlv_1= 'Inertial' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )? (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleInertial() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_origin_4_0 = null;

        EObject lv_mass_6_0 = null;

        EObject lv_inertia_8_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:2723:2: ( ( () otherlv_1= 'Inertial' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )? (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )? otherlv_9= '}' ) )
            // InternalXacro.g:2724:2: ( () otherlv_1= 'Inertial' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )? (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )? otherlv_9= '}' )
            {
            // InternalXacro.g:2724:2: ( () otherlv_1= 'Inertial' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )? (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )? otherlv_9= '}' )
            // InternalXacro.g:2725:3: () otherlv_1= 'Inertial' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )? (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )? otherlv_9= '}'
            {
            // InternalXacro.g:2725:3: ()
            // InternalXacro.g:2726:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInertialAccess().getInertialAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,86,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInertialAccess().getInertialKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_88); 

            			newLeafNode(otherlv_2, grammarAccess.getInertialAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:2740:3: (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==38) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalXacro.g:2741:4: otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_30); 

                    				newLeafNode(otherlv_3, grammarAccess.getInertialAccess().getOriginKeyword_3_0());
                    			
                    // InternalXacro.g:2745:4: ( (lv_origin_4_0= rulePose ) )
                    // InternalXacro.g:2746:5: (lv_origin_4_0= rulePose )
                    {
                    // InternalXacro.g:2746:5: (lv_origin_4_0= rulePose )
                    // InternalXacro.g:2747:6: lv_origin_4_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getInertialAccess().getOriginPoseParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_89);
                    lv_origin_4_0=rulePose();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertialRule());
                    						}
                    						set(
                    							current,
                    							"origin",
                    							lv_origin_4_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Pose");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:2765:3: (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==87) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalXacro.g:2766:4: otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) )
                    {
                    otherlv_5=(Token)match(input,87,FOLLOW_90); 

                    				newLeafNode(otherlv_5, grammarAccess.getInertialAccess().getMassKeyword_4_0());
                    			
                    // InternalXacro.g:2770:4: ( (lv_mass_6_0= ruleMass ) )
                    // InternalXacro.g:2771:5: (lv_mass_6_0= ruleMass )
                    {
                    // InternalXacro.g:2771:5: (lv_mass_6_0= ruleMass )
                    // InternalXacro.g:2772:6: lv_mass_6_0= ruleMass
                    {

                    						newCompositeNode(grammarAccess.getInertialAccess().getMassMassParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_91);
                    lv_mass_6_0=ruleMass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertialRule());
                    						}
                    						set(
                    							current,
                    							"mass",
                    							lv_mass_6_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Mass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:2790:3: (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==88) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalXacro.g:2791:4: otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) )
                    {
                    otherlv_7=(Token)match(input,88,FOLLOW_92); 

                    				newLeafNode(otherlv_7, grammarAccess.getInertialAccess().getInertiaKeyword_5_0());
                    			
                    // InternalXacro.g:2795:4: ( (lv_inertia_8_0= ruleInertia ) )
                    // InternalXacro.g:2796:5: (lv_inertia_8_0= ruleInertia )
                    {
                    // InternalXacro.g:2796:5: (lv_inertia_8_0= ruleInertia )
                    // InternalXacro.g:2797:6: lv_inertia_8_0= ruleInertia
                    {

                    						newCompositeNode(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_inertia_8_0=ruleInertia();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertialRule());
                    						}
                    						set(
                    							current,
                    							"inertia",
                    							lv_inertia_8_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Inertia");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getInertialAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInertial"


    // $ANTLR start "entryRuleVisual"
    // InternalXacro.g:2823:1: entryRuleVisual returns [EObject current=null] : iv_ruleVisual= ruleVisual EOF ;
    public final EObject entryRuleVisual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisual = null;


        try {
            // InternalXacro.g:2823:47: (iv_ruleVisual= ruleVisual EOF )
            // InternalXacro.g:2824:2: iv_ruleVisual= ruleVisual EOF
            {
             newCompositeNode(grammarAccess.getVisualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVisual=ruleVisual();

            state._fsp--;

             current =iv_ruleVisual; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVisual"


    // $ANTLR start "ruleVisual"
    // InternalXacro.g:2830:1: ruleVisual returns [EObject current=null] : (otherlv_0= 'Visual' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) (otherlv_6= 'material' ( (lv_material_7_0= ruleMaterial ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleVisual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_origin_3_0 = null;

        EObject lv_geometry_5_0 = null;

        EObject lv_material_7_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:2836:2: ( (otherlv_0= 'Visual' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) (otherlv_6= 'material' ( (lv_material_7_0= ruleMaterial ) ) )? otherlv_8= '}' ) )
            // InternalXacro.g:2837:2: (otherlv_0= 'Visual' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) (otherlv_6= 'material' ( (lv_material_7_0= ruleMaterial ) ) )? otherlv_8= '}' )
            {
            // InternalXacro.g:2837:2: (otherlv_0= 'Visual' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) (otherlv_6= 'material' ( (lv_material_7_0= ruleMaterial ) ) )? otherlv_8= '}' )
            // InternalXacro.g:2838:3: otherlv_0= 'Visual' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) (otherlv_6= 'material' ( (lv_material_7_0= ruleMaterial ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,89,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVisualAccess().getVisualKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_93); 

            			newLeafNode(otherlv_1, grammarAccess.getVisualAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXacro.g:2846:3: (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==38) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalXacro.g:2847:4: otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) )
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_30); 

                    				newLeafNode(otherlv_2, grammarAccess.getVisualAccess().getOriginKeyword_2_0());
                    			
                    // InternalXacro.g:2851:4: ( (lv_origin_3_0= rulePose ) )
                    // InternalXacro.g:2852:5: (lv_origin_3_0= rulePose )
                    {
                    // InternalXacro.g:2852:5: (lv_origin_3_0= rulePose )
                    // InternalXacro.g:2853:6: lv_origin_3_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getVisualAccess().getOriginPoseParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_94);
                    lv_origin_3_0=rulePose();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVisualRule());
                    						}
                    						set(
                    							current,
                    							"origin",
                    							lv_origin_3_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Pose");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,90,FOLLOW_95); 

            			newLeafNode(otherlv_4, grammarAccess.getVisualAccess().getGeometryKeyword_3());
            		
            // InternalXacro.g:2875:3: ( (lv_geometry_5_0= ruleGeometry ) )
            // InternalXacro.g:2876:4: (lv_geometry_5_0= ruleGeometry )
            {
            // InternalXacro.g:2876:4: (lv_geometry_5_0= ruleGeometry )
            // InternalXacro.g:2877:5: lv_geometry_5_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_96);
            lv_geometry_5_0=ruleGeometry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisualRule());
            					}
            					set(
            						current,
            						"geometry",
            						lv_geometry_5_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.Geometry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXacro.g:2894:3: (otherlv_6= 'material' ( (lv_material_7_0= ruleMaterial ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==32) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalXacro.g:2895:4: otherlv_6= 'material' ( (lv_material_7_0= ruleMaterial ) )
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_97); 

                    				newLeafNode(otherlv_6, grammarAccess.getVisualAccess().getMaterialKeyword_5_0());
                    			
                    // InternalXacro.g:2899:4: ( (lv_material_7_0= ruleMaterial ) )
                    // InternalXacro.g:2900:5: (lv_material_7_0= ruleMaterial )
                    {
                    // InternalXacro.g:2900:5: (lv_material_7_0= ruleMaterial )
                    // InternalXacro.g:2901:6: lv_material_7_0= ruleMaterial
                    {

                    						newCompositeNode(grammarAccess.getVisualAccess().getMaterialMaterialParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_material_7_0=ruleMaterial();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVisualRule());
                    						}
                    						set(
                    							current,
                    							"material",
                    							lv_material_7_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Material");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getVisualAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisual"


    // $ANTLR start "entryRuleCollision"
    // InternalXacro.g:2927:1: entryRuleCollision returns [EObject current=null] : iv_ruleCollision= ruleCollision EOF ;
    public final EObject entryRuleCollision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollision = null;


        try {
            // InternalXacro.g:2927:50: (iv_ruleCollision= ruleCollision EOF )
            // InternalXacro.g:2928:2: iv_ruleCollision= ruleCollision EOF
            {
             newCompositeNode(grammarAccess.getCollisionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollision=ruleCollision();

            state._fsp--;

             current =iv_ruleCollision; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollision"


    // $ANTLR start "ruleCollision"
    // InternalXacro.g:2934:1: ruleCollision returns [EObject current=null] : (otherlv_0= 'Collision' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'origin' ( (lv_origin_5_0= rulePose ) ) )? otherlv_6= 'geometry' ( (lv_geometry_7_0= ruleGeometry ) ) (otherlv_8= 'verbose' ( (lv_verbose_9_0= ruleVerbose ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleCollision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_origin_5_0 = null;

        EObject lv_geometry_7_0 = null;

        EObject lv_verbose_9_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:2940:2: ( (otherlv_0= 'Collision' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'origin' ( (lv_origin_5_0= rulePose ) ) )? otherlv_6= 'geometry' ( (lv_geometry_7_0= ruleGeometry ) ) (otherlv_8= 'verbose' ( (lv_verbose_9_0= ruleVerbose ) ) )? otherlv_10= '}' ) )
            // InternalXacro.g:2941:2: (otherlv_0= 'Collision' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'origin' ( (lv_origin_5_0= rulePose ) ) )? otherlv_6= 'geometry' ( (lv_geometry_7_0= ruleGeometry ) ) (otherlv_8= 'verbose' ( (lv_verbose_9_0= ruleVerbose ) ) )? otherlv_10= '}' )
            {
            // InternalXacro.g:2941:2: (otherlv_0= 'Collision' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'origin' ( (lv_origin_5_0= rulePose ) ) )? otherlv_6= 'geometry' ( (lv_geometry_7_0= ruleGeometry ) ) (otherlv_8= 'verbose' ( (lv_verbose_9_0= ruleVerbose ) ) )? otherlv_10= '}' )
            // InternalXacro.g:2942:3: otherlv_0= 'Collision' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'origin' ( (lv_origin_5_0= rulePose ) ) )? otherlv_6= 'geometry' ( (lv_geometry_7_0= ruleGeometry ) ) (otherlv_8= 'verbose' ( (lv_verbose_9_0= ruleVerbose ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,91,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCollisionAccess().getCollisionKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_98); 

            			newLeafNode(otherlv_1, grammarAccess.getCollisionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXacro.g:2950:3: (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==18) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalXacro.g:2951:4: otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getCollisionAccess().getNameKeyword_2_0());
                    			
                    // InternalXacro.g:2955:4: ( (lv_name_3_0= ruleEString ) )
                    // InternalXacro.g:2956:5: (lv_name_3_0= ruleEString )
                    {
                    // InternalXacro.g:2956:5: (lv_name_3_0= ruleEString )
                    // InternalXacro.g:2957:6: lv_name_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCollisionAccess().getNameEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_93);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollisionRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:2975:3: (otherlv_4= 'origin' ( (lv_origin_5_0= rulePose ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==38) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalXacro.g:2976:4: otherlv_4= 'origin' ( (lv_origin_5_0= rulePose ) )
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_30); 

                    				newLeafNode(otherlv_4, grammarAccess.getCollisionAccess().getOriginKeyword_3_0());
                    			
                    // InternalXacro.g:2980:4: ( (lv_origin_5_0= rulePose ) )
                    // InternalXacro.g:2981:5: (lv_origin_5_0= rulePose )
                    {
                    // InternalXacro.g:2981:5: (lv_origin_5_0= rulePose )
                    // InternalXacro.g:2982:6: lv_origin_5_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getCollisionAccess().getOriginPoseParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_94);
                    lv_origin_5_0=rulePose();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollisionRule());
                    						}
                    						set(
                    							current,
                    							"origin",
                    							lv_origin_5_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Pose");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,90,FOLLOW_95); 

            			newLeafNode(otherlv_6, grammarAccess.getCollisionAccess().getGeometryKeyword_4());
            		
            // InternalXacro.g:3004:3: ( (lv_geometry_7_0= ruleGeometry ) )
            // InternalXacro.g:3005:4: (lv_geometry_7_0= ruleGeometry )
            {
            // InternalXacro.g:3005:4: (lv_geometry_7_0= ruleGeometry )
            // InternalXacro.g:3006:5: lv_geometry_7_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_99);
            lv_geometry_7_0=ruleGeometry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollisionRule());
            					}
            					set(
            						current,
            						"geometry",
            						lv_geometry_7_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.Geometry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXacro.g:3023:3: (otherlv_8= 'verbose' ( (lv_verbose_9_0= ruleVerbose ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==92) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalXacro.g:3024:4: otherlv_8= 'verbose' ( (lv_verbose_9_0= ruleVerbose ) )
                    {
                    otherlv_8=(Token)match(input,92,FOLLOW_100); 

                    				newLeafNode(otherlv_8, grammarAccess.getCollisionAccess().getVerboseKeyword_6_0());
                    			
                    // InternalXacro.g:3028:4: ( (lv_verbose_9_0= ruleVerbose ) )
                    // InternalXacro.g:3029:5: (lv_verbose_9_0= ruleVerbose )
                    {
                    // InternalXacro.g:3029:5: (lv_verbose_9_0= ruleVerbose )
                    // InternalXacro.g:3030:6: lv_verbose_9_0= ruleVerbose
                    {

                    						newCompositeNode(grammarAccess.getCollisionAccess().getVerboseVerboseParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_verbose_9_0=ruleVerbose();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollisionRule());
                    						}
                    						set(
                    							current,
                    							"verbose",
                    							lv_verbose_9_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Verbose");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCollisionAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollision"


    // $ANTLR start "entryRuleMass"
    // InternalXacro.g:3056:1: entryRuleMass returns [EObject current=null] : iv_ruleMass= ruleMass EOF ;
    public final EObject entryRuleMass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMass = null;


        try {
            // InternalXacro.g:3056:45: (iv_ruleMass= ruleMass EOF )
            // InternalXacro.g:3057:2: iv_ruleMass= ruleMass EOF
            {
             newCompositeNode(grammarAccess.getMassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMass=ruleMass();

            state._fsp--;

             current =iv_ruleMass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMass"


    // $ANTLR start "ruleMass"
    // InternalXacro.g:3063:1: ruleMass returns [EObject current=null] : ( () otherlv_1= 'Mass' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleMass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:3069:2: ( ( () otherlv_1= 'Mass' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )? otherlv_5= '}' ) )
            // InternalXacro.g:3070:2: ( () otherlv_1= 'Mass' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )? otherlv_5= '}' )
            {
            // InternalXacro.g:3070:2: ( () otherlv_1= 'Mass' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )? otherlv_5= '}' )
            // InternalXacro.g:3071:3: () otherlv_1= 'Mass' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )? otherlv_5= '}'
            {
            // InternalXacro.g:3071:3: ()
            // InternalXacro.g:3072:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMassAccess().getMassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,93,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMassAccess().getMassKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getMassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:3086:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==28) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalXacro.g:3087:4: otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_55); 

                    				newLeafNode(otherlv_3, grammarAccess.getMassAccess().getValueKeyword_3_0());
                    			
                    // InternalXacro.g:3091:4: ( (lv_value_4_0= ruleDouble0 ) )
                    // InternalXacro.g:3092:5: (lv_value_4_0= ruleDouble0 )
                    {
                    // InternalXacro.g:3092:5: (lv_value_4_0= ruleDouble0 )
                    // InternalXacro.g:3093:6: lv_value_4_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getMassAccess().getValueDouble0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_value_4_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMassRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMassAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMass"


    // $ANTLR start "entryRuleInertia"
    // InternalXacro.g:3119:1: entryRuleInertia returns [EObject current=null] : iv_ruleInertia= ruleInertia EOF ;
    public final EObject entryRuleInertia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertia = null;


        try {
            // InternalXacro.g:3119:48: (iv_ruleInertia= ruleInertia EOF )
            // InternalXacro.g:3120:2: iv_ruleInertia= ruleInertia EOF
            {
             newCompositeNode(grammarAccess.getInertiaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInertia=ruleInertia();

            state._fsp--;

             current =iv_ruleInertia; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInertia"


    // $ANTLR start "ruleInertia"
    // InternalXacro.g:3126:1: ruleInertia returns [EObject current=null] : ( () otherlv_1= 'Inertia' otherlv_2= '{' (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )? (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )? (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )? (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )? (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )? (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleInertia() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_ixx_4_0 = null;

        AntlrDatatypeRuleToken lv_ixy_6_0 = null;

        AntlrDatatypeRuleToken lv_ixz_8_0 = null;

        AntlrDatatypeRuleToken lv_iyy_10_0 = null;

        AntlrDatatypeRuleToken lv_iyz_12_0 = null;

        AntlrDatatypeRuleToken lv_izz_14_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:3132:2: ( ( () otherlv_1= 'Inertia' otherlv_2= '{' (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )? (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )? (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )? (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )? (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )? (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )? otherlv_15= '}' ) )
            // InternalXacro.g:3133:2: ( () otherlv_1= 'Inertia' otherlv_2= '{' (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )? (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )? (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )? (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )? (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )? (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )? otherlv_15= '}' )
            {
            // InternalXacro.g:3133:2: ( () otherlv_1= 'Inertia' otherlv_2= '{' (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )? (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )? (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )? (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )? (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )? (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )? otherlv_15= '}' )
            // InternalXacro.g:3134:3: () otherlv_1= 'Inertia' otherlv_2= '{' (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )? (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )? (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )? (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )? (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )? (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )? otherlv_15= '}'
            {
            // InternalXacro.g:3134:3: ()
            // InternalXacro.g:3135:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInertiaAccess().getInertiaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,94,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInertiaAccess().getInertiaKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_101); 

            			newLeafNode(otherlv_2, grammarAccess.getInertiaAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:3149:3: (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==95) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalXacro.g:3150:4: otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) )
                    {
                    otherlv_3=(Token)match(input,95,FOLLOW_55); 

                    				newLeafNode(otherlv_3, grammarAccess.getInertiaAccess().getIxxKeyword_3_0());
                    			
                    // InternalXacro.g:3154:4: ( (lv_ixx_4_0= ruleDouble0 ) )
                    // InternalXacro.g:3155:5: (lv_ixx_4_0= ruleDouble0 )
                    {
                    // InternalXacro.g:3155:5: (lv_ixx_4_0= ruleDouble0 )
                    // InternalXacro.g:3156:6: lv_ixx_4_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIxxDouble0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_102);
                    lv_ixx_4_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertiaRule());
                    						}
                    						set(
                    							current,
                    							"ixx",
                    							lv_ixx_4_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:3174:3: (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==96) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalXacro.g:3175:4: otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) )
                    {
                    otherlv_5=(Token)match(input,96,FOLLOW_55); 

                    				newLeafNode(otherlv_5, grammarAccess.getInertiaAccess().getIxyKeyword_4_0());
                    			
                    // InternalXacro.g:3179:4: ( (lv_ixy_6_0= ruleDouble0 ) )
                    // InternalXacro.g:3180:5: (lv_ixy_6_0= ruleDouble0 )
                    {
                    // InternalXacro.g:3180:5: (lv_ixy_6_0= ruleDouble0 )
                    // InternalXacro.g:3181:6: lv_ixy_6_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIxyDouble0ParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_103);
                    lv_ixy_6_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertiaRule());
                    						}
                    						set(
                    							current,
                    							"ixy",
                    							lv_ixy_6_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:3199:3: (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==97) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalXacro.g:3200:4: otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) )
                    {
                    otherlv_7=(Token)match(input,97,FOLLOW_55); 

                    				newLeafNode(otherlv_7, grammarAccess.getInertiaAccess().getIxzKeyword_5_0());
                    			
                    // InternalXacro.g:3204:4: ( (lv_ixz_8_0= ruleDouble0 ) )
                    // InternalXacro.g:3205:5: (lv_ixz_8_0= ruleDouble0 )
                    {
                    // InternalXacro.g:3205:5: (lv_ixz_8_0= ruleDouble0 )
                    // InternalXacro.g:3206:6: lv_ixz_8_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIxzDouble0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_104);
                    lv_ixz_8_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertiaRule());
                    						}
                    						set(
                    							current,
                    							"ixz",
                    							lv_ixz_8_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:3224:3: (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==98) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalXacro.g:3225:4: otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) )
                    {
                    otherlv_9=(Token)match(input,98,FOLLOW_55); 

                    				newLeafNode(otherlv_9, grammarAccess.getInertiaAccess().getIyyKeyword_6_0());
                    			
                    // InternalXacro.g:3229:4: ( (lv_iyy_10_0= ruleDouble0 ) )
                    // InternalXacro.g:3230:5: (lv_iyy_10_0= ruleDouble0 )
                    {
                    // InternalXacro.g:3230:5: (lv_iyy_10_0= ruleDouble0 )
                    // InternalXacro.g:3231:6: lv_iyy_10_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIyyDouble0ParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_105);
                    lv_iyy_10_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertiaRule());
                    						}
                    						set(
                    							current,
                    							"iyy",
                    							lv_iyy_10_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:3249:3: (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==99) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalXacro.g:3250:4: otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) )
                    {
                    otherlv_11=(Token)match(input,99,FOLLOW_55); 

                    				newLeafNode(otherlv_11, grammarAccess.getInertiaAccess().getIyzKeyword_7_0());
                    			
                    // InternalXacro.g:3254:4: ( (lv_iyz_12_0= ruleDouble0 ) )
                    // InternalXacro.g:3255:5: (lv_iyz_12_0= ruleDouble0 )
                    {
                    // InternalXacro.g:3255:5: (lv_iyz_12_0= ruleDouble0 )
                    // InternalXacro.g:3256:6: lv_iyz_12_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIyzDouble0ParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_106);
                    lv_iyz_12_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertiaRule());
                    						}
                    						set(
                    							current,
                    							"iyz",
                    							lv_iyz_12_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:3274:3: (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==100) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalXacro.g:3275:4: otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) )
                    {
                    otherlv_13=(Token)match(input,100,FOLLOW_55); 

                    				newLeafNode(otherlv_13, grammarAccess.getInertiaAccess().getIzzKeyword_8_0());
                    			
                    // InternalXacro.g:3279:4: ( (lv_izz_14_0= ruleDouble0 ) )
                    // InternalXacro.g:3280:5: (lv_izz_14_0= ruleDouble0 )
                    {
                    // InternalXacro.g:3280:5: (lv_izz_14_0= ruleDouble0 )
                    // InternalXacro.g:3281:6: lv_izz_14_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIzzDouble0ParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_izz_14_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertiaRule());
                    						}
                    						set(
                    							current,
                    							"izz",
                    							lv_izz_14_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getInertiaAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInertia"


    // $ANTLR start "entryRuleGeometry"
    // InternalXacro.g:3307:1: entryRuleGeometry returns [EObject current=null] : iv_ruleGeometry= ruleGeometry EOF ;
    public final EObject entryRuleGeometry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeometry = null;


        try {
            // InternalXacro.g:3307:49: (iv_ruleGeometry= ruleGeometry EOF )
            // InternalXacro.g:3308:2: iv_ruleGeometry= ruleGeometry EOF
            {
             newCompositeNode(grammarAccess.getGeometryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeometry=ruleGeometry();

            state._fsp--;

             current =iv_ruleGeometry; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeometry"


    // $ANTLR start "ruleGeometry"
    // InternalXacro.g:3314:1: ruleGeometry returns [EObject current=null] : ( () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )? (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleGeometry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_box_4_0 = null;

        EObject lv_cylinder_6_0 = null;

        EObject lv_sphere_8_0 = null;

        EObject lv_mesh_10_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:3320:2: ( ( () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )? (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )? otherlv_11= '}' ) )
            // InternalXacro.g:3321:2: ( () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )? (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )? otherlv_11= '}' )
            {
            // InternalXacro.g:3321:2: ( () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )? (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )? otherlv_11= '}' )
            // InternalXacro.g:3322:3: () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )? (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )? otherlv_11= '}'
            {
            // InternalXacro.g:3322:3: ()
            // InternalXacro.g:3323:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGeometryAccess().getGeometryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,101,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGeometryAccess().getGeometryKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_107); 

            			newLeafNode(otherlv_2, grammarAccess.getGeometryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:3337:3: (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==102) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalXacro.g:3338:4: otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) )
                    {
                    otherlv_3=(Token)match(input,102,FOLLOW_108); 

                    				newLeafNode(otherlv_3, grammarAccess.getGeometryAccess().getBoxKeyword_3_0());
                    			
                    // InternalXacro.g:3342:4: ( (lv_box_4_0= ruleBox ) )
                    // InternalXacro.g:3343:5: (lv_box_4_0= ruleBox )
                    {
                    // InternalXacro.g:3343:5: (lv_box_4_0= ruleBox )
                    // InternalXacro.g:3344:6: lv_box_4_0= ruleBox
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getBoxBoxParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_109);
                    lv_box_4_0=ruleBox();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGeometryRule());
                    						}
                    						set(
                    							current,
                    							"box",
                    							lv_box_4_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Box");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:3362:3: (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==103) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalXacro.g:3363:4: otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) )
                    {
                    otherlv_5=(Token)match(input,103,FOLLOW_110); 

                    				newLeafNode(otherlv_5, grammarAccess.getGeometryAccess().getCylinderKeyword_4_0());
                    			
                    // InternalXacro.g:3367:4: ( (lv_cylinder_6_0= ruleCylinder ) )
                    // InternalXacro.g:3368:5: (lv_cylinder_6_0= ruleCylinder )
                    {
                    // InternalXacro.g:3368:5: (lv_cylinder_6_0= ruleCylinder )
                    // InternalXacro.g:3369:6: lv_cylinder_6_0= ruleCylinder
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getCylinderCylinderParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_111);
                    lv_cylinder_6_0=ruleCylinder();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGeometryRule());
                    						}
                    						set(
                    							current,
                    							"cylinder",
                    							lv_cylinder_6_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Cylinder");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:3387:3: (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==104) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalXacro.g:3388:4: otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) )
                    {
                    otherlv_7=(Token)match(input,104,FOLLOW_112); 

                    				newLeafNode(otherlv_7, grammarAccess.getGeometryAccess().getSphereKeyword_5_0());
                    			
                    // InternalXacro.g:3392:4: ( (lv_sphere_8_0= ruleSphere ) )
                    // InternalXacro.g:3393:5: (lv_sphere_8_0= ruleSphere )
                    {
                    // InternalXacro.g:3393:5: (lv_sphere_8_0= ruleSphere )
                    // InternalXacro.g:3394:6: lv_sphere_8_0= ruleSphere
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getSphereSphereParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_113);
                    lv_sphere_8_0=ruleSphere();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGeometryRule());
                    						}
                    						set(
                    							current,
                    							"sphere",
                    							lv_sphere_8_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Sphere");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:3412:3: (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==105) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalXacro.g:3413:4: otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) )
                    {
                    otherlv_9=(Token)match(input,105,FOLLOW_114); 

                    				newLeafNode(otherlv_9, grammarAccess.getGeometryAccess().getMeshKeyword_6_0());
                    			
                    // InternalXacro.g:3417:4: ( (lv_mesh_10_0= ruleMesh ) )
                    // InternalXacro.g:3418:5: (lv_mesh_10_0= ruleMesh )
                    {
                    // InternalXacro.g:3418:5: (lv_mesh_10_0= ruleMesh )
                    // InternalXacro.g:3419:6: lv_mesh_10_0= ruleMesh
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getMeshMeshParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_mesh_10_0=ruleMesh();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGeometryRule());
                    						}
                    						set(
                    							current,
                    							"mesh",
                    							lv_mesh_10_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Mesh");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getGeometryAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeometry"


    // $ANTLR start "entryRuleMaterial"
    // InternalXacro.g:3445:1: entryRuleMaterial returns [EObject current=null] : iv_ruleMaterial= ruleMaterial EOF ;
    public final EObject entryRuleMaterial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaterial = null;


        try {
            // InternalXacro.g:3445:49: (iv_ruleMaterial= ruleMaterial EOF )
            // InternalXacro.g:3446:2: iv_ruleMaterial= ruleMaterial EOF
            {
             newCompositeNode(grammarAccess.getMaterialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaterial=ruleMaterial();

            state._fsp--;

             current =iv_ruleMaterial; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaterial"


    // $ANTLR start "ruleMaterial"
    // InternalXacro.g:3452:1: ruleMaterial returns [EObject current=null] : ( () otherlv_1= 'Material' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'color' ( (lv_color_6_0= ruleColor ) ) )? (otherlv_7= 'texture' ( (lv_texture_8_0= ruleTexture ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleMaterial() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_color_6_0 = null;

        EObject lv_texture_8_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:3458:2: ( ( () otherlv_1= 'Material' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'color' ( (lv_color_6_0= ruleColor ) ) )? (otherlv_7= 'texture' ( (lv_texture_8_0= ruleTexture ) ) )? otherlv_9= '}' ) )
            // InternalXacro.g:3459:2: ( () otherlv_1= 'Material' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'color' ( (lv_color_6_0= ruleColor ) ) )? (otherlv_7= 'texture' ( (lv_texture_8_0= ruleTexture ) ) )? otherlv_9= '}' )
            {
            // InternalXacro.g:3459:2: ( () otherlv_1= 'Material' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'color' ( (lv_color_6_0= ruleColor ) ) )? (otherlv_7= 'texture' ( (lv_texture_8_0= ruleTexture ) ) )? otherlv_9= '}' )
            // InternalXacro.g:3460:3: () otherlv_1= 'Material' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'color' ( (lv_color_6_0= ruleColor ) ) )? (otherlv_7= 'texture' ( (lv_texture_8_0= ruleTexture ) ) )? otherlv_9= '}'
            {
            // InternalXacro.g:3460:3: ()
            // InternalXacro.g:3461:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMaterialAccess().getMaterialAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,106,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMaterialAccess().getMaterialKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_115); 

            			newLeafNode(otherlv_2, grammarAccess.getMaterialAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:3475:3: (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==18) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalXacro.g:3476:4: otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getMaterialAccess().getNameKeyword_3_0());
                    			
                    // InternalXacro.g:3480:4: ( (lv_name_4_0= ruleEString ) )
                    // InternalXacro.g:3481:5: (lv_name_4_0= ruleEString )
                    {
                    // InternalXacro.g:3481:5: (lv_name_4_0= ruleEString )
                    // InternalXacro.g:3482:6: lv_name_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMaterialAccess().getNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_name_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMaterialRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:3500:3: (otherlv_5= 'color' ( (lv_color_6_0= ruleColor ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==50) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalXacro.g:3501:4: otherlv_5= 'color' ( (lv_color_6_0= ruleColor ) )
                    {
                    otherlv_5=(Token)match(input,50,FOLLOW_51); 

                    				newLeafNode(otherlv_5, grammarAccess.getMaterialAccess().getColorKeyword_4_0());
                    			
                    // InternalXacro.g:3505:4: ( (lv_color_6_0= ruleColor ) )
                    // InternalXacro.g:3506:5: (lv_color_6_0= ruleColor )
                    {
                    // InternalXacro.g:3506:5: (lv_color_6_0= ruleColor )
                    // InternalXacro.g:3507:6: lv_color_6_0= ruleColor
                    {

                    						newCompositeNode(grammarAccess.getMaterialAccess().getColorColorParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_color_6_0=ruleColor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMaterialRule());
                    						}
                    						set(
                    							current,
                    							"color",
                    							lv_color_6_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:3525:3: (otherlv_7= 'texture' ( (lv_texture_8_0= ruleTexture ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==51) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalXacro.g:3526:4: otherlv_7= 'texture' ( (lv_texture_8_0= ruleTexture ) )
                    {
                    otherlv_7=(Token)match(input,51,FOLLOW_53); 

                    				newLeafNode(otherlv_7, grammarAccess.getMaterialAccess().getTextureKeyword_5_0());
                    			
                    // InternalXacro.g:3530:4: ( (lv_texture_8_0= ruleTexture ) )
                    // InternalXacro.g:3531:5: (lv_texture_8_0= ruleTexture )
                    {
                    // InternalXacro.g:3531:5: (lv_texture_8_0= ruleTexture )
                    // InternalXacro.g:3532:6: lv_texture_8_0= ruleTexture
                    {

                    						newCompositeNode(grammarAccess.getMaterialAccess().getTextureTextureParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_texture_8_0=ruleTexture();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMaterialRule());
                    						}
                    						set(
                    							current,
                    							"texture",
                    							lv_texture_8_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Texture");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getMaterialAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaterial"


    // $ANTLR start "entryRuleBox"
    // InternalXacro.g:3558:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // InternalXacro.g:3558:44: (iv_ruleBox= ruleBox EOF )
            // InternalXacro.g:3559:2: iv_ruleBox= ruleBox EOF
            {
             newCompositeNode(grammarAccess.getBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBox=ruleBox();

            state._fsp--;

             current =iv_ruleBox; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBox"


    // $ANTLR start "ruleBox"
    // InternalXacro.g:3565:1: ruleBox returns [EObject current=null] : ( () otherlv_1= 'Box' otherlv_2= '{' (otherlv_3= 'size' ( (lv_size_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_size_4_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:3571:2: ( ( () otherlv_1= 'Box' otherlv_2= '{' (otherlv_3= 'size' ( (lv_size_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalXacro.g:3572:2: ( () otherlv_1= 'Box' otherlv_2= '{' (otherlv_3= 'size' ( (lv_size_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalXacro.g:3572:2: ( () otherlv_1= 'Box' otherlv_2= '{' (otherlv_3= 'size' ( (lv_size_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalXacro.g:3573:3: () otherlv_1= 'Box' otherlv_2= '{' (otherlv_3= 'size' ( (lv_size_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalXacro.g:3573:3: ()
            // InternalXacro.g:3574:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoxAccess().getBoxAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,107,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBoxAccess().getBoxKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_116); 

            			newLeafNode(otherlv_2, grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:3588:3: (otherlv_3= 'size' ( (lv_size_4_0= ruleEString ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==108) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalXacro.g:3589:4: otherlv_3= 'size' ( (lv_size_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,108,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getBoxAccess().getSizeKeyword_3_0());
                    			
                    // InternalXacro.g:3593:4: ( (lv_size_4_0= ruleEString ) )
                    // InternalXacro.g:3594:5: (lv_size_4_0= ruleEString )
                    {
                    // InternalXacro.g:3594:5: (lv_size_4_0= ruleEString )
                    // InternalXacro.g:3595:6: lv_size_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBoxAccess().getSizeEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_size_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoxRule());
                    						}
                    						set(
                    							current,
                    							"size",
                    							lv_size_4_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleCylinder"
    // InternalXacro.g:3621:1: entryRuleCylinder returns [EObject current=null] : iv_ruleCylinder= ruleCylinder EOF ;
    public final EObject entryRuleCylinder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCylinder = null;


        try {
            // InternalXacro.g:3621:49: (iv_ruleCylinder= ruleCylinder EOF )
            // InternalXacro.g:3622:2: iv_ruleCylinder= ruleCylinder EOF
            {
             newCompositeNode(grammarAccess.getCylinderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCylinder=ruleCylinder();

            state._fsp--;

             current =iv_ruleCylinder; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCylinder"


    // $ANTLR start "ruleCylinder"
    // InternalXacro.g:3628:1: ruleCylinder returns [EObject current=null] : (otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}' ) ;
    public final EObject ruleCylinder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_length_3_0 = null;

        AntlrDatatypeRuleToken lv_radius_5_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:3634:2: ( (otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}' ) )
            // InternalXacro.g:3635:2: (otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}' )
            {
            // InternalXacro.g:3635:2: (otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}' )
            // InternalXacro.g:3636:3: otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,109,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCylinderAccess().getCylinderKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_117); 

            			newLeafNode(otherlv_1, grammarAccess.getCylinderAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,110,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getCylinderAccess().getLengthKeyword_2());
            		
            // InternalXacro.g:3648:3: ( (lv_length_3_0= ruleDouble0 ) )
            // InternalXacro.g:3649:4: (lv_length_3_0= ruleDouble0 )
            {
            // InternalXacro.g:3649:4: (lv_length_3_0= ruleDouble0 )
            // InternalXacro.g:3650:5: lv_length_3_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getCylinderAccess().getLengthDouble0ParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_118);
            lv_length_3_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCylinderRule());
            					}
            					set(
            						current,
            						"length",
            						lv_length_3_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,111,FOLLOW_55); 

            			newLeafNode(otherlv_4, grammarAccess.getCylinderAccess().getRadiusKeyword_4());
            		
            // InternalXacro.g:3671:3: ( (lv_radius_5_0= ruleDouble0 ) )
            // InternalXacro.g:3672:4: (lv_radius_5_0= ruleDouble0 )
            {
            // InternalXacro.g:3672:4: (lv_radius_5_0= ruleDouble0 )
            // InternalXacro.g:3673:5: lv_radius_5_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getCylinderAccess().getRadiusDouble0ParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_radius_5_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCylinderRule());
            					}
            					set(
            						current,
            						"radius",
            						lv_radius_5_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCylinderAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCylinder"


    // $ANTLR start "entryRuleSphere"
    // InternalXacro.g:3698:1: entryRuleSphere returns [EObject current=null] : iv_ruleSphere= ruleSphere EOF ;
    public final EObject entryRuleSphere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSphere = null;


        try {
            // InternalXacro.g:3698:47: (iv_ruleSphere= ruleSphere EOF )
            // InternalXacro.g:3699:2: iv_ruleSphere= ruleSphere EOF
            {
             newCompositeNode(grammarAccess.getSphereRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSphere=ruleSphere();

            state._fsp--;

             current =iv_ruleSphere; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSphere"


    // $ANTLR start "ruleSphere"
    // InternalXacro.g:3705:1: ruleSphere returns [EObject current=null] : (otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}' ) ;
    public final EObject ruleSphere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_radius_3_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:3711:2: ( (otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}' ) )
            // InternalXacro.g:3712:2: (otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}' )
            {
            // InternalXacro.g:3712:2: (otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}' )
            // InternalXacro.g:3713:3: otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,112,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSphereAccess().getSphereKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_118); 

            			newLeafNode(otherlv_1, grammarAccess.getSphereAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,111,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getSphereAccess().getRadiusKeyword_2());
            		
            // InternalXacro.g:3725:3: ( (lv_radius_3_0= ruleDouble0 ) )
            // InternalXacro.g:3726:4: (lv_radius_3_0= ruleDouble0 )
            {
            // InternalXacro.g:3726:4: (lv_radius_3_0= ruleDouble0 )
            // InternalXacro.g:3727:5: lv_radius_3_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getSphereAccess().getRadiusDouble0ParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_radius_3_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSphereRule());
            					}
            					set(
            						current,
            						"radius",
            						lv_radius_3_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSphereAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSphere"


    // $ANTLR start "entryRuleMesh"
    // InternalXacro.g:3752:1: entryRuleMesh returns [EObject current=null] : iv_ruleMesh= ruleMesh EOF ;
    public final EObject entryRuleMesh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMesh = null;


        try {
            // InternalXacro.g:3752:45: (iv_ruleMesh= ruleMesh EOF )
            // InternalXacro.g:3753:2: iv_ruleMesh= ruleMesh EOF
            {
             newCompositeNode(grammarAccess.getMeshRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMesh=ruleMesh();

            state._fsp--;

             current =iv_ruleMesh; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMesh"


    // $ANTLR start "ruleMesh"
    // InternalXacro.g:3759:1: ruleMesh returns [EObject current=null] : (otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= ruleEString ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleMesh() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_filename_3_0 = null;

        AntlrDatatypeRuleToken lv_scale_5_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:3765:2: ( (otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= ruleEString ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalXacro.g:3766:2: (otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= ruleEString ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalXacro.g:3766:2: (otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= ruleEString ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalXacro.g:3767:3: otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= ruleEString ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,113,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMeshAccess().getMeshKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_119); 

            			newLeafNode(otherlv_1, grammarAccess.getMeshAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,114,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMeshAccess().getFilenameKeyword_2());
            		
            // InternalXacro.g:3779:3: ( (lv_filename_3_0= ruleEString ) )
            // InternalXacro.g:3780:4: (lv_filename_3_0= ruleEString )
            {
            // InternalXacro.g:3780:4: (lv_filename_3_0= ruleEString )
            // InternalXacro.g:3781:5: lv_filename_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeshAccess().getFilenameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_120);
            lv_filename_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeshRule());
            					}
            					set(
            						current,
            						"filename",
            						lv_filename_3_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXacro.g:3798:3: (otherlv_4= 'scale' ( (lv_scale_5_0= ruleEString ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==115) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalXacro.g:3799:4: otherlv_4= 'scale' ( (lv_scale_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,115,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getMeshAccess().getScaleKeyword_4_0());
                    			
                    // InternalXacro.g:3803:4: ( (lv_scale_5_0= ruleEString ) )
                    // InternalXacro.g:3804:5: (lv_scale_5_0= ruleEString )
                    {
                    // InternalXacro.g:3804:5: (lv_scale_5_0= ruleEString )
                    // InternalXacro.g:3805:6: lv_scale_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeshAccess().getScaleEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_scale_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeshRule());
                    						}
                    						set(
                    							current,
                    							"scale",
                    							lv_scale_5_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMeshAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMesh"


    // $ANTLR start "entryRuleAnyURI"
    // InternalXacro.g:3831:1: entryRuleAnyURI returns [String current=null] : iv_ruleAnyURI= ruleAnyURI EOF ;
    public final String entryRuleAnyURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnyURI = null;


        try {
            // InternalXacro.g:3831:46: (iv_ruleAnyURI= ruleAnyURI EOF )
            // InternalXacro.g:3832:2: iv_ruleAnyURI= ruleAnyURI EOF
            {
             newCompositeNode(grammarAccess.getAnyURIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnyURI=ruleAnyURI();

            state._fsp--;

             current =iv_ruleAnyURI.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnyURI"


    // $ANTLR start "ruleAnyURI"
    // InternalXacro.g:3838:1: ruleAnyURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'AnyURI' ;
    public final AntlrDatatypeRuleToken ruleAnyURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXacro.g:3844:2: (kw= 'AnyURI' )
            // InternalXacro.g:3845:2: kw= 'AnyURI'
            {
            kw=(Token)match(input,116,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getAnyURIAccess().getAnyURIKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnyURI"


    // $ANTLR start "entryRuleColor"
    // InternalXacro.g:3853:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalXacro.g:3853:46: (iv_ruleColor= ruleColor EOF )
            // InternalXacro.g:3854:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalXacro.g:3860:1: ruleColor returns [EObject current=null] : ( () otherlv_1= 'Color' otherlv_2= '{' (otherlv_3= 'rgba' ( (lv_rgba_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_rgba_4_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:3866:2: ( ( () otherlv_1= 'Color' otherlv_2= '{' (otherlv_3= 'rgba' ( (lv_rgba_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalXacro.g:3867:2: ( () otherlv_1= 'Color' otherlv_2= '{' (otherlv_3= 'rgba' ( (lv_rgba_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalXacro.g:3867:2: ( () otherlv_1= 'Color' otherlv_2= '{' (otherlv_3= 'rgba' ( (lv_rgba_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalXacro.g:3868:3: () otherlv_1= 'Color' otherlv_2= '{' (otherlv_3= 'rgba' ( (lv_rgba_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalXacro.g:3868:3: ()
            // InternalXacro.g:3869:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColorAccess().getColorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,117,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getColorAccess().getColorKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_121); 

            			newLeafNode(otherlv_2, grammarAccess.getColorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:3883:3: (otherlv_3= 'rgba' ( (lv_rgba_4_0= ruleEString ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==118) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalXacro.g:3884:4: otherlv_3= 'rgba' ( (lv_rgba_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,118,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getColorAccess().getRgbaKeyword_3_0());
                    			
                    // InternalXacro.g:3888:4: ( (lv_rgba_4_0= ruleEString ) )
                    // InternalXacro.g:3889:5: (lv_rgba_4_0= ruleEString )
                    {
                    // InternalXacro.g:3889:5: (lv_rgba_4_0= ruleEString )
                    // InternalXacro.g:3890:6: lv_rgba_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getColorAccess().getRgbaEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_rgba_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColorRule());
                    						}
                    						set(
                    							current,
                    							"rgba",
                    							lv_rgba_4_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getColorAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleTexture"
    // InternalXacro.g:3916:1: entryRuleTexture returns [EObject current=null] : iv_ruleTexture= ruleTexture EOF ;
    public final EObject entryRuleTexture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTexture = null;


        try {
            // InternalXacro.g:3916:48: (iv_ruleTexture= ruleTexture EOF )
            // InternalXacro.g:3917:2: iv_ruleTexture= ruleTexture EOF
            {
             newCompositeNode(grammarAccess.getTextureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTexture=ruleTexture();

            state._fsp--;

             current =iv_ruleTexture; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTexture"


    // $ANTLR start "ruleTexture"
    // InternalXacro.g:3923:1: ruleTexture returns [EObject current=null] : ( () otherlv_1= 'Texture' otherlv_2= '{' (otherlv_3= 'filename' ( (lv_filename_4_0= ruleAnyURI ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleTexture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_filename_4_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:3929:2: ( ( () otherlv_1= 'Texture' otherlv_2= '{' (otherlv_3= 'filename' ( (lv_filename_4_0= ruleAnyURI ) ) )? otherlv_5= '}' ) )
            // InternalXacro.g:3930:2: ( () otherlv_1= 'Texture' otherlv_2= '{' (otherlv_3= 'filename' ( (lv_filename_4_0= ruleAnyURI ) ) )? otherlv_5= '}' )
            {
            // InternalXacro.g:3930:2: ( () otherlv_1= 'Texture' otherlv_2= '{' (otherlv_3= 'filename' ( (lv_filename_4_0= ruleAnyURI ) ) )? otherlv_5= '}' )
            // InternalXacro.g:3931:3: () otherlv_1= 'Texture' otherlv_2= '{' (otherlv_3= 'filename' ( (lv_filename_4_0= ruleAnyURI ) ) )? otherlv_5= '}'
            {
            // InternalXacro.g:3931:3: ()
            // InternalXacro.g:3932:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextureAccess().getTextureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,119,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTextureAccess().getTextureKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_122); 

            			newLeafNode(otherlv_2, grammarAccess.getTextureAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:3946:3: (otherlv_3= 'filename' ( (lv_filename_4_0= ruleAnyURI ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==114) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalXacro.g:3947:4: otherlv_3= 'filename' ( (lv_filename_4_0= ruleAnyURI ) )
                    {
                    otherlv_3=(Token)match(input,114,FOLLOW_123); 

                    				newLeafNode(otherlv_3, grammarAccess.getTextureAccess().getFilenameKeyword_3_0());
                    			
                    // InternalXacro.g:3951:4: ( (lv_filename_4_0= ruleAnyURI ) )
                    // InternalXacro.g:3952:5: (lv_filename_4_0= ruleAnyURI )
                    {
                    // InternalXacro.g:3952:5: (lv_filename_4_0= ruleAnyURI )
                    // InternalXacro.g:3953:6: lv_filename_4_0= ruleAnyURI
                    {

                    						newCompositeNode(grammarAccess.getTextureAccess().getFilenameAnyURIParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_filename_4_0=ruleAnyURI();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextureRule());
                    						}
                    						set(
                    							current,
                    							"filename",
                    							lv_filename_4_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.AnyURI");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTextureAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTexture"


    // $ANTLR start "entryRuleVerbose"
    // InternalXacro.g:3979:1: entryRuleVerbose returns [EObject current=null] : iv_ruleVerbose= ruleVerbose EOF ;
    public final EObject entryRuleVerbose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerbose = null;


        try {
            // InternalXacro.g:3979:48: (iv_ruleVerbose= ruleVerbose EOF )
            // InternalXacro.g:3980:2: iv_ruleVerbose= ruleVerbose EOF
            {
             newCompositeNode(grammarAccess.getVerboseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerbose=ruleVerbose();

            state._fsp--;

             current =iv_ruleVerbose; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerbose"


    // $ANTLR start "ruleVerbose"
    // InternalXacro.g:3986:1: ruleVerbose returns [EObject current=null] : ( () otherlv_1= 'Verbose' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleVerbose() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:3992:2: ( ( () otherlv_1= 'Verbose' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalXacro.g:3993:2: ( () otherlv_1= 'Verbose' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalXacro.g:3993:2: ( () otherlv_1= 'Verbose' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalXacro.g:3994:3: () otherlv_1= 'Verbose' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalXacro.g:3994:3: ()
            // InternalXacro.g:3995:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVerboseAccess().getVerboseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,120,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVerboseAccess().getVerboseKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getVerboseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:4009:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==28) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalXacro.g:4010:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getVerboseAccess().getValueKeyword_3_0());
                    			
                    // InternalXacro.g:4014:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalXacro.g:4015:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalXacro.g:4015:5: (lv_value_4_0= ruleEString )
                    // InternalXacro.g:4016:6: lv_value_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVerboseAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVerboseRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getVerboseAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerbose"


    // $ANTLR start "entryRuleActuatorTransmission"
    // InternalXacro.g:4042:1: entryRuleActuatorTransmission returns [EObject current=null] : iv_ruleActuatorTransmission= ruleActuatorTransmission EOF ;
    public final EObject entryRuleActuatorTransmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuatorTransmission = null;


        try {
            // InternalXacro.g:4042:61: (iv_ruleActuatorTransmission= ruleActuatorTransmission EOF )
            // InternalXacro.g:4043:2: iv_ruleActuatorTransmission= ruleActuatorTransmission EOF
            {
             newCompositeNode(grammarAccess.getActuatorTransmissionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActuatorTransmission=ruleActuatorTransmission();

            state._fsp--;

             current =iv_ruleActuatorTransmission; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActuatorTransmission"


    // $ANTLR start "ruleActuatorTransmission"
    // InternalXacro.g:4049:1: ruleActuatorTransmission returns [EObject current=null] : (otherlv_0= 'ActuatorTransmission' otherlv_1= '{' otherlv_2= 'mechanicalReduction' ( (lv_mechanicalReduction_3_0= ruleDouble0 ) ) otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleActuatorTransmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_mechanicalReduction_3_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:4055:2: ( (otherlv_0= 'ActuatorTransmission' otherlv_1= '{' otherlv_2= 'mechanicalReduction' ( (lv_mechanicalReduction_3_0= ruleDouble0 ) ) otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '}' ) )
            // InternalXacro.g:4056:2: (otherlv_0= 'ActuatorTransmission' otherlv_1= '{' otherlv_2= 'mechanicalReduction' ( (lv_mechanicalReduction_3_0= ruleDouble0 ) ) otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '}' )
            {
            // InternalXacro.g:4056:2: (otherlv_0= 'ActuatorTransmission' otherlv_1= '{' otherlv_2= 'mechanicalReduction' ( (lv_mechanicalReduction_3_0= ruleDouble0 ) ) otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '}' )
            // InternalXacro.g:4057:3: otherlv_0= 'ActuatorTransmission' otherlv_1= '{' otherlv_2= 'mechanicalReduction' ( (lv_mechanicalReduction_3_0= ruleDouble0 ) ) otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,121,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActuatorTransmissionAccess().getActuatorTransmissionKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_124); 

            			newLeafNode(otherlv_1, grammarAccess.getActuatorTransmissionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,53,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getActuatorTransmissionAccess().getMechanicalReductionKeyword_2());
            		
            // InternalXacro.g:4069:3: ( (lv_mechanicalReduction_3_0= ruleDouble0 ) )
            // InternalXacro.g:4070:4: (lv_mechanicalReduction_3_0= ruleDouble0 )
            {
            // InternalXacro.g:4070:4: (lv_mechanicalReduction_3_0= ruleDouble0 )
            // InternalXacro.g:4071:5: lv_mechanicalReduction_3_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getActuatorTransmissionAccess().getMechanicalReductionDouble0ParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_mechanicalReduction_3_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActuatorTransmissionRule());
            					}
            					set(
            						current,
            						"mechanicalReduction",
            						lv_mechanicalReduction_3_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getActuatorTransmissionAccess().getNameKeyword_4());
            		
            // InternalXacro.g:4092:3: ( (lv_name_5_0= ruleEString ) )
            // InternalXacro.g:4093:4: (lv_name_5_0= ruleEString )
            {
            // InternalXacro.g:4093:4: (lv_name_5_0= ruleEString )
            // InternalXacro.g:4094:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActuatorTransmissionAccess().getNameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActuatorTransmissionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getActuatorTransmissionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActuatorTransmission"


    // $ANTLR start "entryRuleGapJointTransmission"
    // InternalXacro.g:4119:1: entryRuleGapJointTransmission returns [EObject current=null] : iv_ruleGapJointTransmission= ruleGapJointTransmission EOF ;
    public final EObject entryRuleGapJointTransmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGapJointTransmission = null;


        try {
            // InternalXacro.g:4119:61: (iv_ruleGapJointTransmission= ruleGapJointTransmission EOF )
            // InternalXacro.g:4120:2: iv_ruleGapJointTransmission= ruleGapJointTransmission EOF
            {
             newCompositeNode(grammarAccess.getGapJointTransmissionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGapJointTransmission=ruleGapJointTransmission();

            state._fsp--;

             current =iv_ruleGapJointTransmission; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGapJointTransmission"


    // $ANTLR start "ruleGapJointTransmission"
    // InternalXacro.g:4126:1: ruleGapJointTransmission returns [EObject current=null] : (otherlv_0= 'GapJointTransmission' otherlv_1= '{' otherlv_2= 'a' ( (lv_a_3_0= ruleDouble0 ) ) otherlv_4= 'b' ( (lv_b_5_0= ruleDouble0 ) ) otherlv_6= 'gearRatio' ( (lv_gearRatio_7_0= ruleDouble0 ) ) otherlv_8= 'h' ( (lv_h_9_0= ruleDouble0 ) ) otherlv_10= 'l0' ( (lv_l0_11_0= ruleDouble0 ) ) otherlv_12= 'mechanicalReduction' ( (lv_mechanicalReduction_13_0= ruleDouble0 ) ) otherlv_14= 'name' ( (lv_name_15_0= ruleEString ) ) otherlv_16= 'phi0' ( (lv_phi0_17_0= ruleDouble0 ) ) otherlv_18= 'r' ( (lv_r_19_0= ruleDouble0 ) ) otherlv_20= 'screwReduction' ( (lv_screwReduction_21_0= ruleDouble0 ) ) otherlv_22= 't0' ( (lv_t0_23_0= ruleDouble0 ) ) otherlv_24= 'theta0' ( (lv_theta0_25_0= ruleDouble0 ) ) otherlv_26= '}' ) ;
    public final EObject ruleGapJointTransmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_a_3_0 = null;

        AntlrDatatypeRuleToken lv_b_5_0 = null;

        AntlrDatatypeRuleToken lv_gearRatio_7_0 = null;

        AntlrDatatypeRuleToken lv_h_9_0 = null;

        AntlrDatatypeRuleToken lv_l0_11_0 = null;

        AntlrDatatypeRuleToken lv_mechanicalReduction_13_0 = null;

        AntlrDatatypeRuleToken lv_name_15_0 = null;

        AntlrDatatypeRuleToken lv_phi0_17_0 = null;

        AntlrDatatypeRuleToken lv_r_19_0 = null;

        AntlrDatatypeRuleToken lv_screwReduction_21_0 = null;

        AntlrDatatypeRuleToken lv_t0_23_0 = null;

        AntlrDatatypeRuleToken lv_theta0_25_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:4132:2: ( (otherlv_0= 'GapJointTransmission' otherlv_1= '{' otherlv_2= 'a' ( (lv_a_3_0= ruleDouble0 ) ) otherlv_4= 'b' ( (lv_b_5_0= ruleDouble0 ) ) otherlv_6= 'gearRatio' ( (lv_gearRatio_7_0= ruleDouble0 ) ) otherlv_8= 'h' ( (lv_h_9_0= ruleDouble0 ) ) otherlv_10= 'l0' ( (lv_l0_11_0= ruleDouble0 ) ) otherlv_12= 'mechanicalReduction' ( (lv_mechanicalReduction_13_0= ruleDouble0 ) ) otherlv_14= 'name' ( (lv_name_15_0= ruleEString ) ) otherlv_16= 'phi0' ( (lv_phi0_17_0= ruleDouble0 ) ) otherlv_18= 'r' ( (lv_r_19_0= ruleDouble0 ) ) otherlv_20= 'screwReduction' ( (lv_screwReduction_21_0= ruleDouble0 ) ) otherlv_22= 't0' ( (lv_t0_23_0= ruleDouble0 ) ) otherlv_24= 'theta0' ( (lv_theta0_25_0= ruleDouble0 ) ) otherlv_26= '}' ) )
            // InternalXacro.g:4133:2: (otherlv_0= 'GapJointTransmission' otherlv_1= '{' otherlv_2= 'a' ( (lv_a_3_0= ruleDouble0 ) ) otherlv_4= 'b' ( (lv_b_5_0= ruleDouble0 ) ) otherlv_6= 'gearRatio' ( (lv_gearRatio_7_0= ruleDouble0 ) ) otherlv_8= 'h' ( (lv_h_9_0= ruleDouble0 ) ) otherlv_10= 'l0' ( (lv_l0_11_0= ruleDouble0 ) ) otherlv_12= 'mechanicalReduction' ( (lv_mechanicalReduction_13_0= ruleDouble0 ) ) otherlv_14= 'name' ( (lv_name_15_0= ruleEString ) ) otherlv_16= 'phi0' ( (lv_phi0_17_0= ruleDouble0 ) ) otherlv_18= 'r' ( (lv_r_19_0= ruleDouble0 ) ) otherlv_20= 'screwReduction' ( (lv_screwReduction_21_0= ruleDouble0 ) ) otherlv_22= 't0' ( (lv_t0_23_0= ruleDouble0 ) ) otherlv_24= 'theta0' ( (lv_theta0_25_0= ruleDouble0 ) ) otherlv_26= '}' )
            {
            // InternalXacro.g:4133:2: (otherlv_0= 'GapJointTransmission' otherlv_1= '{' otherlv_2= 'a' ( (lv_a_3_0= ruleDouble0 ) ) otherlv_4= 'b' ( (lv_b_5_0= ruleDouble0 ) ) otherlv_6= 'gearRatio' ( (lv_gearRatio_7_0= ruleDouble0 ) ) otherlv_8= 'h' ( (lv_h_9_0= ruleDouble0 ) ) otherlv_10= 'l0' ( (lv_l0_11_0= ruleDouble0 ) ) otherlv_12= 'mechanicalReduction' ( (lv_mechanicalReduction_13_0= ruleDouble0 ) ) otherlv_14= 'name' ( (lv_name_15_0= ruleEString ) ) otherlv_16= 'phi0' ( (lv_phi0_17_0= ruleDouble0 ) ) otherlv_18= 'r' ( (lv_r_19_0= ruleDouble0 ) ) otherlv_20= 'screwReduction' ( (lv_screwReduction_21_0= ruleDouble0 ) ) otherlv_22= 't0' ( (lv_t0_23_0= ruleDouble0 ) ) otherlv_24= 'theta0' ( (lv_theta0_25_0= ruleDouble0 ) ) otherlv_26= '}' )
            // InternalXacro.g:4134:3: otherlv_0= 'GapJointTransmission' otherlv_1= '{' otherlv_2= 'a' ( (lv_a_3_0= ruleDouble0 ) ) otherlv_4= 'b' ( (lv_b_5_0= ruleDouble0 ) ) otherlv_6= 'gearRatio' ( (lv_gearRatio_7_0= ruleDouble0 ) ) otherlv_8= 'h' ( (lv_h_9_0= ruleDouble0 ) ) otherlv_10= 'l0' ( (lv_l0_11_0= ruleDouble0 ) ) otherlv_12= 'mechanicalReduction' ( (lv_mechanicalReduction_13_0= ruleDouble0 ) ) otherlv_14= 'name' ( (lv_name_15_0= ruleEString ) ) otherlv_16= 'phi0' ( (lv_phi0_17_0= ruleDouble0 ) ) otherlv_18= 'r' ( (lv_r_19_0= ruleDouble0 ) ) otherlv_20= 'screwReduction' ( (lv_screwReduction_21_0= ruleDouble0 ) ) otherlv_22= 't0' ( (lv_t0_23_0= ruleDouble0 ) ) otherlv_24= 'theta0' ( (lv_theta0_25_0= ruleDouble0 ) ) otherlv_26= '}'
            {
            otherlv_0=(Token)match(input,122,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGapJointTransmissionAccess().getGapJointTransmissionKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_125); 

            			newLeafNode(otherlv_1, grammarAccess.getGapJointTransmissionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,123,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getGapJointTransmissionAccess().getAKeyword_2());
            		
            // InternalXacro.g:4146:3: ( (lv_a_3_0= ruleDouble0 ) )
            // InternalXacro.g:4147:4: (lv_a_3_0= ruleDouble0 )
            {
            // InternalXacro.g:4147:4: (lv_a_3_0= ruleDouble0 )
            // InternalXacro.g:4148:5: lv_a_3_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getADouble0ParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_126);
            lv_a_3_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGapJointTransmissionRule());
            					}
            					set(
            						current,
            						"a",
            						lv_a_3_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,124,FOLLOW_55); 

            			newLeafNode(otherlv_4, grammarAccess.getGapJointTransmissionAccess().getBKeyword_4());
            		
            // InternalXacro.g:4169:3: ( (lv_b_5_0= ruleDouble0 ) )
            // InternalXacro.g:4170:4: (lv_b_5_0= ruleDouble0 )
            {
            // InternalXacro.g:4170:4: (lv_b_5_0= ruleDouble0 )
            // InternalXacro.g:4171:5: lv_b_5_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getBDouble0ParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_127);
            lv_b_5_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGapJointTransmissionRule());
            					}
            					set(
            						current,
            						"b",
            						lv_b_5_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,125,FOLLOW_55); 

            			newLeafNode(otherlv_6, grammarAccess.getGapJointTransmissionAccess().getGearRatioKeyword_6());
            		
            // InternalXacro.g:4192:3: ( (lv_gearRatio_7_0= ruleDouble0 ) )
            // InternalXacro.g:4193:4: (lv_gearRatio_7_0= ruleDouble0 )
            {
            // InternalXacro.g:4193:4: (lv_gearRatio_7_0= ruleDouble0 )
            // InternalXacro.g:4194:5: lv_gearRatio_7_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getGearRatioDouble0ParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_128);
            lv_gearRatio_7_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGapJointTransmissionRule());
            					}
            					set(
            						current,
            						"gearRatio",
            						lv_gearRatio_7_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,126,FOLLOW_55); 

            			newLeafNode(otherlv_8, grammarAccess.getGapJointTransmissionAccess().getHKeyword_8());
            		
            // InternalXacro.g:4215:3: ( (lv_h_9_0= ruleDouble0 ) )
            // InternalXacro.g:4216:4: (lv_h_9_0= ruleDouble0 )
            {
            // InternalXacro.g:4216:4: (lv_h_9_0= ruleDouble0 )
            // InternalXacro.g:4217:5: lv_h_9_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getHDouble0ParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_129);
            lv_h_9_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGapJointTransmissionRule());
            					}
            					set(
            						current,
            						"h",
            						lv_h_9_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,127,FOLLOW_55); 

            			newLeafNode(otherlv_10, grammarAccess.getGapJointTransmissionAccess().getL0Keyword_10());
            		
            // InternalXacro.g:4238:3: ( (lv_l0_11_0= ruleDouble0 ) )
            // InternalXacro.g:4239:4: (lv_l0_11_0= ruleDouble0 )
            {
            // InternalXacro.g:4239:4: (lv_l0_11_0= ruleDouble0 )
            // InternalXacro.g:4240:5: lv_l0_11_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getL0Double0ParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_124);
            lv_l0_11_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGapJointTransmissionRule());
            					}
            					set(
            						current,
            						"l0",
            						lv_l0_11_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,53,FOLLOW_55); 

            			newLeafNode(otherlv_12, grammarAccess.getGapJointTransmissionAccess().getMechanicalReductionKeyword_12());
            		
            // InternalXacro.g:4261:3: ( (lv_mechanicalReduction_13_0= ruleDouble0 ) )
            // InternalXacro.g:4262:4: (lv_mechanicalReduction_13_0= ruleDouble0 )
            {
            // InternalXacro.g:4262:4: (lv_mechanicalReduction_13_0= ruleDouble0 )
            // InternalXacro.g:4263:5: lv_mechanicalReduction_13_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getMechanicalReductionDouble0ParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_4);
            lv_mechanicalReduction_13_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGapJointTransmissionRule());
            					}
            					set(
            						current,
            						"mechanicalReduction",
            						lv_mechanicalReduction_13_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_14, grammarAccess.getGapJointTransmissionAccess().getNameKeyword_14());
            		
            // InternalXacro.g:4284:3: ( (lv_name_15_0= ruleEString ) )
            // InternalXacro.g:4285:4: (lv_name_15_0= ruleEString )
            {
            // InternalXacro.g:4285:4: (lv_name_15_0= ruleEString )
            // InternalXacro.g:4286:5: lv_name_15_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getNameEStringParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_130);
            lv_name_15_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGapJointTransmissionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_15_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,128,FOLLOW_55); 

            			newLeafNode(otherlv_16, grammarAccess.getGapJointTransmissionAccess().getPhi0Keyword_16());
            		
            // InternalXacro.g:4307:3: ( (lv_phi0_17_0= ruleDouble0 ) )
            // InternalXacro.g:4308:4: (lv_phi0_17_0= ruleDouble0 )
            {
            // InternalXacro.g:4308:4: (lv_phi0_17_0= ruleDouble0 )
            // InternalXacro.g:4309:5: lv_phi0_17_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getPhi0Double0ParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_131);
            lv_phi0_17_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGapJointTransmissionRule());
            					}
            					set(
            						current,
            						"phi0",
            						lv_phi0_17_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,129,FOLLOW_55); 

            			newLeafNode(otherlv_18, grammarAccess.getGapJointTransmissionAccess().getRKeyword_18());
            		
            // InternalXacro.g:4330:3: ( (lv_r_19_0= ruleDouble0 ) )
            // InternalXacro.g:4331:4: (lv_r_19_0= ruleDouble0 )
            {
            // InternalXacro.g:4331:4: (lv_r_19_0= ruleDouble0 )
            // InternalXacro.g:4332:5: lv_r_19_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getRDouble0ParserRuleCall_19_0());
            				
            pushFollow(FOLLOW_132);
            lv_r_19_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGapJointTransmissionRule());
            					}
            					set(
            						current,
            						"r",
            						lv_r_19_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_20=(Token)match(input,130,FOLLOW_55); 

            			newLeafNode(otherlv_20, grammarAccess.getGapJointTransmissionAccess().getScrewReductionKeyword_20());
            		
            // InternalXacro.g:4353:3: ( (lv_screwReduction_21_0= ruleDouble0 ) )
            // InternalXacro.g:4354:4: (lv_screwReduction_21_0= ruleDouble0 )
            {
            // InternalXacro.g:4354:4: (lv_screwReduction_21_0= ruleDouble0 )
            // InternalXacro.g:4355:5: lv_screwReduction_21_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getScrewReductionDouble0ParserRuleCall_21_0());
            				
            pushFollow(FOLLOW_133);
            lv_screwReduction_21_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGapJointTransmissionRule());
            					}
            					set(
            						current,
            						"screwReduction",
            						lv_screwReduction_21_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_22=(Token)match(input,131,FOLLOW_55); 

            			newLeafNode(otherlv_22, grammarAccess.getGapJointTransmissionAccess().getT0Keyword_22());
            		
            // InternalXacro.g:4376:3: ( (lv_t0_23_0= ruleDouble0 ) )
            // InternalXacro.g:4377:4: (lv_t0_23_0= ruleDouble0 )
            {
            // InternalXacro.g:4377:4: (lv_t0_23_0= ruleDouble0 )
            // InternalXacro.g:4378:5: lv_t0_23_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getT0Double0ParserRuleCall_23_0());
            				
            pushFollow(FOLLOW_134);
            lv_t0_23_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGapJointTransmissionRule());
            					}
            					set(
            						current,
            						"t0",
            						lv_t0_23_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_24=(Token)match(input,132,FOLLOW_55); 

            			newLeafNode(otherlv_24, grammarAccess.getGapJointTransmissionAccess().getTheta0Keyword_24());
            		
            // InternalXacro.g:4399:3: ( (lv_theta0_25_0= ruleDouble0 ) )
            // InternalXacro.g:4400:4: (lv_theta0_25_0= ruleDouble0 )
            {
            // InternalXacro.g:4400:4: (lv_theta0_25_0= ruleDouble0 )
            // InternalXacro.g:4401:5: lv_theta0_25_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getTheta0Double0ParserRuleCall_25_0());
            				
            pushFollow(FOLLOW_12);
            lv_theta0_25_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGapJointTransmissionRule());
            					}
            					set(
            						current,
            						"theta0",
            						lv_theta0_25_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_26=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getGapJointTransmissionAccess().getRightCurlyBracketKeyword_26());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGapJointTransmission"


    // $ANTLR start "entryRulePassiveJointTransmission"
    // InternalXacro.g:4426:1: entryRulePassiveJointTransmission returns [EObject current=null] : iv_rulePassiveJointTransmission= rulePassiveJointTransmission EOF ;
    public final EObject entryRulePassiveJointTransmission() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePassiveJointTransmission = null;


        try {
            // InternalXacro.g:4426:65: (iv_rulePassiveJointTransmission= rulePassiveJointTransmission EOF )
            // InternalXacro.g:4427:2: iv_rulePassiveJointTransmission= rulePassiveJointTransmission EOF
            {
             newCompositeNode(grammarAccess.getPassiveJointTransmissionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePassiveJointTransmission=rulePassiveJointTransmission();

            state._fsp--;

             current =iv_rulePassiveJointTransmission; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePassiveJointTransmission"


    // $ANTLR start "rulePassiveJointTransmission"
    // InternalXacro.g:4433:1: rulePassiveJointTransmission returns [EObject current=null] : (otherlv_0= 'PassiveJointTransmission' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject rulePassiveJointTransmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:4439:2: ( (otherlv_0= 'PassiveJointTransmission' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // InternalXacro.g:4440:2: (otherlv_0= 'PassiveJointTransmission' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // InternalXacro.g:4440:2: (otherlv_0= 'PassiveJointTransmission' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '}' )
            // InternalXacro.g:4441:3: otherlv_0= 'PassiveJointTransmission' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,133,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPassiveJointTransmissionAccess().getPassiveJointTransmissionKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPassiveJointTransmissionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPassiveJointTransmissionAccess().getNameKeyword_2());
            		
            // InternalXacro.g:4453:3: ( (lv_name_3_0= ruleEString ) )
            // InternalXacro.g:4454:4: (lv_name_3_0= ruleEString )
            {
            // InternalXacro.g:4454:4: (lv_name_3_0= ruleEString )
            // InternalXacro.g:4455:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPassiveJointTransmissionAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPassiveJointTransmissionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPassiveJointTransmissionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePassiveJointTransmission"


    // $ANTLR start "entryRuleUseSimulatedGripperJointType"
    // InternalXacro.g:4480:1: entryRuleUseSimulatedGripperJointType returns [EObject current=null] : iv_ruleUseSimulatedGripperJointType= ruleUseSimulatedGripperJointType EOF ;
    public final EObject entryRuleUseSimulatedGripperJointType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseSimulatedGripperJointType = null;


        try {
            // InternalXacro.g:4480:69: (iv_ruleUseSimulatedGripperJointType= ruleUseSimulatedGripperJointType EOF )
            // InternalXacro.g:4481:2: iv_ruleUseSimulatedGripperJointType= ruleUseSimulatedGripperJointType EOF
            {
             newCompositeNode(grammarAccess.getUseSimulatedGripperJointTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseSimulatedGripperJointType=ruleUseSimulatedGripperJointType();

            state._fsp--;

             current =iv_ruleUseSimulatedGripperJointType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUseSimulatedGripperJointType"


    // $ANTLR start "ruleUseSimulatedGripperJointType"
    // InternalXacro.g:4487:1: ruleUseSimulatedGripperJointType returns [EObject current=null] : ( () otherlv_1= 'UseSimulatedGripperJointType' ) ;
    public final EObject ruleUseSimulatedGripperJointType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalXacro.g:4493:2: ( ( () otherlv_1= 'UseSimulatedGripperJointType' ) )
            // InternalXacro.g:4494:2: ( () otherlv_1= 'UseSimulatedGripperJointType' )
            {
            // InternalXacro.g:4494:2: ( () otherlv_1= 'UseSimulatedGripperJointType' )
            // InternalXacro.g:4495:3: () otherlv_1= 'UseSimulatedGripperJointType'
            {
            // InternalXacro.g:4495:3: ()
            // InternalXacro.g:4496:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUseSimulatedGripperJointTypeAccess().getUseSimulatedGripperJointTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,134,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getUseSimulatedGripperJointTypeAccess().getUseSimulatedGripperJointTypeKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUseSimulatedGripperJointType"


    // $ANTLR start "entryRuleName"
    // InternalXacro.g:4510:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // InternalXacro.g:4510:45: (iv_ruleName= ruleName EOF )
            // InternalXacro.g:4511:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalXacro.g:4517:1: ruleName returns [EObject current=null] : ( () otherlv_1= 'Name' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:4523:2: ( ( () otherlv_1= 'Name' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalXacro.g:4524:2: ( () otherlv_1= 'Name' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalXacro.g:4524:2: ( () otherlv_1= 'Name' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalXacro.g:4525:3: () otherlv_1= 'Name' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalXacro.g:4525:3: ()
            // InternalXacro.g:4526:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNameAccess().getNameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,135,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNameAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_135); 

            			newLeafNode(otherlv_2, grammarAccess.getNameAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:4540:3: (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==18) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalXacro.g:4541:4: otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getNameAccess().getNameKeyword_3_0());
                    			
                    // InternalXacro.g:4545:4: ( (lv_name_4_0= ruleEString ) )
                    // InternalXacro.g:4546:5: (lv_name_4_0= ruleEString )
                    {
                    // InternalXacro.g:4546:5: (lv_name_4_0= ruleEString )
                    // InternalXacro.g:4547:6: lv_name_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getNameAccess().getNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_name_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNameRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getNameAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleDouble0"
    // InternalXacro.g:4573:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalXacro.g:4573:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalXacro.g:4574:2: iv_ruleDouble0= ruleDouble0 EOF
            {
             newCompositeNode(grammarAccess.getDouble0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDouble0=ruleDouble0();

            state._fsp--;

             current =iv_ruleDouble0.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDouble0"


    // $ANTLR start "ruleDouble0"
    // InternalXacro.g:4580:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalXacro.g:4586:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalXacro.g:4587:2: this_DOUBLE_0= RULE_DOUBLE
            {
            this_DOUBLE_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

            		current.merge(this_DOUBLE_0);
            	

            		newLeafNode(this_DOUBLE_0, grammarAccess.getDouble0Access().getDOUBLETerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDouble0"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000D80000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000D00000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002C00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000018400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000003C0400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000380400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000300400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00001FC000400000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00001F8000400000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00001F0000400000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00001E0000400000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00001C0000400000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000180000400000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000400000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001C00800400000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001C00000400000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001800000400000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x000C000000400000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0008000000400000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0020000000040000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x3FC0000080400000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x3F80000080400000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x3F00000080400000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x3E00000080400000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x3C00000080400000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x3800000080400000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x3000000080400000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x2000000080400000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x8000000000400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000038L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000030L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000020L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000180L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000100L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000400000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000400000L,0x0000000000003800L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000400000L,0x0000000000003000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000400000L,0x0000000000002000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000400000L,0x0000000000060000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000400000L,0x0000000000040000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000400000L,0x0000000000300000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000400000L,0x0000000000200000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000004000400000L,0x0000000001800000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000400000L,0x0000000001800000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000400000L,0x0000000001000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000004000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000004000040000L,0x0000000004000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000400000L,0x0000000010000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000400000L,0x0000001F80000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000400000L,0x0000001F00000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000400000L,0x0000001E00000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000400000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000400000L,0x0000001800000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000400000L,0x0000001000000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000400000L,0x000003C000000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000400000L,0x0000038000000000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000400000L,0x0000030000000000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000400000L,0x0000020000000000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x000C000000440000L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000400000L,0x0000100000000000L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000400000L,0x0008000000000000L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000000400000L,0x0040000000000000L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000400000L,0x0004000000000000L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_135 = new BitSet(new long[]{0x0000000000440000L});

}