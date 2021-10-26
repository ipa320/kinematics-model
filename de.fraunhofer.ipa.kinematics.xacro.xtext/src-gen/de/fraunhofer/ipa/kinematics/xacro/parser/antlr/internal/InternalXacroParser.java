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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_DOUBLE", "RULE_DIGIT", "RULE_BOOLEAN", "RULE_DECINT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'{'", "'name'", "'version'", "'macro'", "','", "'}'", "'body'", "'Macro'", "'parameter'", "'Parameter'", "'default'", "'value'", "'Body'", "'link'", "'joint'", "'material'", "'transmission'", "'Joint'", "'type'", "'parent'", "'child'", "'origin'", "'axis'", "'calibration'", "'dynamics'", "'limit'", "'safetyController'", "'mimic'", "'Link'", "'inertial'", "'visual'", "'collision'", "'MaterialGlobal'", "'color'", "'texture'", "'Transmission'", "'mechanicalReduction'", "'leftActuator'", "'rightActuator'", "'flexJoint'", "'rollJoint'", "'gapJoint'", "'passiveJoint'", "'useSimulatedGripperJoint'", "'actuator'", "'Pose'", "'rpy'", "'xyz'", "'Axis'", "'Calibration'", "'falling'", "'referencePosition'", "'rising'", "'Dynamics'", "'damping'", "'friction'", "'Limit'", "'effort'", "'lower'", "'upper'", "'velocity'", "'SafetyController'", "'kPosition'", "'kVelocity'", "'softLowerLimit'", "'softUpperLimit'", "'Mimic'", "'multiplier'", "'offset'", "'Inertial'", "'mass'", "'inertia'", "'Visual'", "'geometry'", "'Collision'", "'verbose'", "'Mass'", "'Inertia'", "'ixx'", "'ixy'", "'ixz'", "'iyy'", "'iyz'", "'izz'", "'Geometry'", "'box'", "'cylinder'", "'sphere'", "'mesh'", "'Material'", "'Box'", "'size'", "'Cylinder'", "'length'", "'radius'", "'Sphere'", "'Mesh'", "'filename'", "'scale'", "'AnyURI'", "'Color'", "'rgba'", "'Texture'", "'Verbose'", "'ActuatorTransmission'", "'GapJointTransmission'", "'a'", "'b'", "'gearRatio'", "'h'", "'l0'", "'phi0'", "'r'", "'screwReduction'", "'t0'", "'theta0'", "'PassiveJointTransmission'", "'UseSimulatedGripperJointType'", "'Name'"
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
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=5;
    public static final int T__131=131;
    public static final int T__130=130;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_DOUBLE=6;
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

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotAccess().getRobotKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_5); 

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

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalXacro.g:118:4: otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_5); 

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

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalXacro.g:143:4: otherlv_7= 'macro' otherlv_8= '{' ( (lv_macro_9_0= ruleMacro ) ) (otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getRobotAccess().getMacroKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,16,FOLLOW_8); 

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

                        if ( (LA2_0==20) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalXacro.g:171:5: otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) )
                    	    {
                    	    otherlv_10=(Token)match(input,20,FOLLOW_8); 

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

                    otherlv_12=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:200:3: (otherlv_13= 'body' ( (lv_body_14_0= ruleBody ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalXacro.g:201:4: otherlv_13= 'body' ( (lv_body_14_0= ruleBody ) )
                    {
                    otherlv_13=(Token)match(input,22,FOLLOW_11); 

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

            otherlv_15=(Token)match(input,21,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMacroAccess().getMacroKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMacroAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_5); 

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

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXacro.g:314:4: otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getMacroAccess().getParameterKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,16,FOLLOW_14); 

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

                        if ( (LA6_0==20) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalXacro.g:342:5: otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,20,FOLLOW_14); 

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

                    otherlv_9=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getMacroAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:371:3: (otherlv_10= 'body' ( (lv_body_11_0= ruleBody ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXacro.g:372:4: otherlv_10= 'body' ( (lv_body_11_0= ruleBody ) )
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_11); 

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

            otherlv_12=(Token)match(input,21,FOLLOW_2); 

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

            otherlv_1=(Token)match(input,25,FOLLOW_5); 

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

            otherlv_3=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXacro.g:453:3: (otherlv_4= 'default' ( (lv_default_5_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXacro.g:454:4: otherlv_4= 'default' ( (lv_default_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_5); 

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

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXacro.g:479:4: otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_5); 

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

            otherlv_8=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:518:1: ruleBody returns [EObject current=null] : ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}' )? (otherlv_15= 'link' otherlv_16= '{' ( (lv_link_17_0= ruleLink ) ) (otherlv_18= ',' ( (lv_link_19_0= ruleLink ) ) )* otherlv_20= '}' )? (otherlv_21= 'material' otherlv_22= '{' ( (lv_material_23_0= ruleMaterialGlobal ) ) (otherlv_24= ',' ( (lv_material_25_0= ruleMaterialGlobal ) ) )* otherlv_26= '}' )? (otherlv_27= 'transmission' otherlv_28= '{' ( (lv_transmission_29_0= ruleTransmission ) ) (otherlv_30= ',' ( (lv_transmission_31_0= ruleTransmission ) ) )* otherlv_32= '}' )? otherlv_33= '}' ) ;
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
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        EObject lv_link_5_0 = null;

        EObject lv_link_7_0 = null;

        EObject lv_joint_11_0 = null;

        EObject lv_joint_13_0 = null;

        EObject lv_link_17_0 = null;

        EObject lv_link_19_0 = null;

        EObject lv_material_23_0 = null;

        EObject lv_material_25_0 = null;

        EObject lv_transmission_29_0 = null;

        EObject lv_transmission_31_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:524:2: ( ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}' )? (otherlv_15= 'link' otherlv_16= '{' ( (lv_link_17_0= ruleLink ) ) (otherlv_18= ',' ( (lv_link_19_0= ruleLink ) ) )* otherlv_20= '}' )? (otherlv_21= 'material' otherlv_22= '{' ( (lv_material_23_0= ruleMaterialGlobal ) ) (otherlv_24= ',' ( (lv_material_25_0= ruleMaterialGlobal ) ) )* otherlv_26= '}' )? (otherlv_27= 'transmission' otherlv_28= '{' ( (lv_transmission_29_0= ruleTransmission ) ) (otherlv_30= ',' ( (lv_transmission_31_0= ruleTransmission ) ) )* otherlv_32= '}' )? otherlv_33= '}' ) )
            // InternalXacro.g:525:2: ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}' )? (otherlv_15= 'link' otherlv_16= '{' ( (lv_link_17_0= ruleLink ) ) (otherlv_18= ',' ( (lv_link_19_0= ruleLink ) ) )* otherlv_20= '}' )? (otherlv_21= 'material' otherlv_22= '{' ( (lv_material_23_0= ruleMaterialGlobal ) ) (otherlv_24= ',' ( (lv_material_25_0= ruleMaterialGlobal ) ) )* otherlv_26= '}' )? (otherlv_27= 'transmission' otherlv_28= '{' ( (lv_transmission_29_0= ruleTransmission ) ) (otherlv_30= ',' ( (lv_transmission_31_0= ruleTransmission ) ) )* otherlv_32= '}' )? otherlv_33= '}' )
            {
            // InternalXacro.g:525:2: ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}' )? (otherlv_15= 'link' otherlv_16= '{' ( (lv_link_17_0= ruleLink ) ) (otherlv_18= ',' ( (lv_link_19_0= ruleLink ) ) )* otherlv_20= '}' )? (otherlv_21= 'material' otherlv_22= '{' ( (lv_material_23_0= ruleMaterialGlobal ) ) (otherlv_24= ',' ( (lv_material_25_0= ruleMaterialGlobal ) ) )* otherlv_26= '}' )? (otherlv_27= 'transmission' otherlv_28= '{' ( (lv_transmission_29_0= ruleTransmission ) ) (otherlv_30= ',' ( (lv_transmission_31_0= ruleTransmission ) ) )* otherlv_32= '}' )? otherlv_33= '}' )
            // InternalXacro.g:526:3: () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}' )? (otherlv_15= 'link' otherlv_16= '{' ( (lv_link_17_0= ruleLink ) ) (otherlv_18= ',' ( (lv_link_19_0= ruleLink ) ) )* otherlv_20= '}' )? (otherlv_21= 'material' otherlv_22= '{' ( (lv_material_23_0= ruleMaterialGlobal ) ) (otherlv_24= ',' ( (lv_material_25_0= ruleMaterialGlobal ) ) )* otherlv_26= '}' )? (otherlv_27= 'transmission' otherlv_28= '{' ( (lv_transmission_29_0= ruleTransmission ) ) (otherlv_30= ',' ( (lv_transmission_31_0= ruleTransmission ) ) )* otherlv_32= '}' )? otherlv_33= '}'
            {
            // InternalXacro.g:526:3: ()
            // InternalXacro.g:527:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBodyAccess().getBodyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBodyAccess().getBodyKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:541:3: (otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}' )?
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalXacro.g:542:4: otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getBodyAccess().getLinkKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,16,FOLLOW_18); 

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

                        if ( (LA11_0==20) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalXacro.g:570:5: otherlv_6= ',' ( (lv_link_7_0= ruleLink ) )
                    	    {
                    	    otherlv_6=(Token)match(input,20,FOLLOW_18); 

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

                    otherlv_8=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:599:3: (otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXacro.g:600:4: otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getBodyAccess().getJointKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,16,FOLLOW_19); 

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

                        if ( (LA13_0==20) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalXacro.g:628:5: otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) )
                    	    {
                    	    otherlv_12=(Token)match(input,20,FOLLOW_19); 

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

                    otherlv_14=(Token)match(input,21,FOLLOW_20); 

                    				newLeafNode(otherlv_14, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:657:3: (otherlv_15= 'link' otherlv_16= '{' ( (lv_link_17_0= ruleLink ) ) (otherlv_18= ',' ( (lv_link_19_0= ruleLink ) ) )* otherlv_20= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXacro.g:658:4: otherlv_15= 'link' otherlv_16= '{' ( (lv_link_17_0= ruleLink ) ) (otherlv_18= ',' ( (lv_link_19_0= ruleLink ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getBodyAccess().getLinkKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,16,FOLLOW_18); 

                    				newLeafNode(otherlv_16, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalXacro.g:666:4: ( (lv_link_17_0= ruleLink ) )
                    // InternalXacro.g:667:5: (lv_link_17_0= ruleLink )
                    {
                    // InternalXacro.g:667:5: (lv_link_17_0= ruleLink )
                    // InternalXacro.g:668:6: lv_link_17_0= ruleLink
                    {

                    						newCompositeNode(grammarAccess.getBodyAccess().getLinkLinkParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_link_17_0=ruleLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBodyRule());
                    						}
                    						add(
                    							current,
                    							"link",
                    							lv_link_17_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Link");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXacro.g:685:4: (otherlv_18= ',' ( (lv_link_19_0= ruleLink ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==20) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalXacro.g:686:5: otherlv_18= ',' ( (lv_link_19_0= ruleLink ) )
                    	    {
                    	    otherlv_18=(Token)match(input,20,FOLLOW_18); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getBodyAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalXacro.g:690:5: ( (lv_link_19_0= ruleLink ) )
                    	    // InternalXacro.g:691:6: (lv_link_19_0= ruleLink )
                    	    {
                    	    // InternalXacro.g:691:6: (lv_link_19_0= ruleLink )
                    	    // InternalXacro.g:692:7: lv_link_19_0= ruleLink
                    	    {

                    	    							newCompositeNode(grammarAccess.getBodyAccess().getLinkLinkParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_link_19_0=ruleLink();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"link",
                    	    								lv_link_19_0,
                    	    								"de.fraunhofer.ipa.kinematics.xacro.Xacro.Link");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_20, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:715:3: (otherlv_21= 'material' otherlv_22= '{' ( (lv_material_23_0= ruleMaterialGlobal ) ) (otherlv_24= ',' ( (lv_material_25_0= ruleMaterialGlobal ) ) )* otherlv_26= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalXacro.g:716:4: otherlv_21= 'material' otherlv_22= '{' ( (lv_material_23_0= ruleMaterialGlobal ) ) (otherlv_24= ',' ( (lv_material_25_0= ruleMaterialGlobal ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getBodyAccess().getMaterialKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,16,FOLLOW_22); 

                    				newLeafNode(otherlv_22, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalXacro.g:724:4: ( (lv_material_23_0= ruleMaterialGlobal ) )
                    // InternalXacro.g:725:5: (lv_material_23_0= ruleMaterialGlobal )
                    {
                    // InternalXacro.g:725:5: (lv_material_23_0= ruleMaterialGlobal )
                    // InternalXacro.g:726:6: lv_material_23_0= ruleMaterialGlobal
                    {

                    						newCompositeNode(grammarAccess.getBodyAccess().getMaterialMaterialGlobalParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_material_23_0=ruleMaterialGlobal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBodyRule());
                    						}
                    						add(
                    							current,
                    							"material",
                    							lv_material_23_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.MaterialGlobal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXacro.g:743:4: (otherlv_24= ',' ( (lv_material_25_0= ruleMaterialGlobal ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==20) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalXacro.g:744:5: otherlv_24= ',' ( (lv_material_25_0= ruleMaterialGlobal ) )
                    	    {
                    	    otherlv_24=(Token)match(input,20,FOLLOW_22); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getBodyAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalXacro.g:748:5: ( (lv_material_25_0= ruleMaterialGlobal ) )
                    	    // InternalXacro.g:749:6: (lv_material_25_0= ruleMaterialGlobal )
                    	    {
                    	    // InternalXacro.g:749:6: (lv_material_25_0= ruleMaterialGlobal )
                    	    // InternalXacro.g:750:7: lv_material_25_0= ruleMaterialGlobal
                    	    {

                    	    							newCompositeNode(grammarAccess.getBodyAccess().getMaterialMaterialGlobalParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_material_25_0=ruleMaterialGlobal();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"material",
                    	    								lv_material_25_0,
                    	    								"de.fraunhofer.ipa.kinematics.xacro.Xacro.MaterialGlobal");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,21,FOLLOW_23); 

                    				newLeafNode(otherlv_26, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:773:3: (otherlv_27= 'transmission' otherlv_28= '{' ( (lv_transmission_29_0= ruleTransmission ) ) (otherlv_30= ',' ( (lv_transmission_31_0= ruleTransmission ) ) )* otherlv_32= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalXacro.g:774:4: otherlv_27= 'transmission' otherlv_28= '{' ( (lv_transmission_29_0= ruleTransmission ) ) (otherlv_30= ',' ( (lv_transmission_31_0= ruleTransmission ) ) )* otherlv_32= '}'
                    {
                    otherlv_27=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_27, grammarAccess.getBodyAccess().getTransmissionKeyword_7_0());
                    			
                    otherlv_28=(Token)match(input,16,FOLLOW_24); 

                    				newLeafNode(otherlv_28, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalXacro.g:782:4: ( (lv_transmission_29_0= ruleTransmission ) )
                    // InternalXacro.g:783:5: (lv_transmission_29_0= ruleTransmission )
                    {
                    // InternalXacro.g:783:5: (lv_transmission_29_0= ruleTransmission )
                    // InternalXacro.g:784:6: lv_transmission_29_0= ruleTransmission
                    {

                    						newCompositeNode(grammarAccess.getBodyAccess().getTransmissionTransmissionParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_transmission_29_0=ruleTransmission();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBodyRule());
                    						}
                    						add(
                    							current,
                    							"transmission",
                    							lv_transmission_29_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Transmission");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXacro.g:801:4: (otherlv_30= ',' ( (lv_transmission_31_0= ruleTransmission ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==20) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalXacro.g:802:5: otherlv_30= ',' ( (lv_transmission_31_0= ruleTransmission ) )
                    	    {
                    	    otherlv_30=(Token)match(input,20,FOLLOW_24); 

                    	    					newLeafNode(otherlv_30, grammarAccess.getBodyAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalXacro.g:806:5: ( (lv_transmission_31_0= ruleTransmission ) )
                    	    // InternalXacro.g:807:6: (lv_transmission_31_0= ruleTransmission )
                    	    {
                    	    // InternalXacro.g:807:6: (lv_transmission_31_0= ruleTransmission )
                    	    // InternalXacro.g:808:7: lv_transmission_31_0= ruleTransmission
                    	    {

                    	    							newCompositeNode(grammarAccess.getBodyAccess().getTransmissionTransmissionParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_transmission_31_0=ruleTransmission();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"transmission",
                    	    								lv_transmission_31_0,
                    	    								"de.fraunhofer.ipa.kinematics.xacro.Xacro.Transmission");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_32, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_33=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_33, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalXacro.g:839:1: entryRuleJoint returns [EObject current=null] : iv_ruleJoint= ruleJoint EOF ;
    public final EObject entryRuleJoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoint = null;


        try {
            // InternalXacro.g:839:46: (iv_ruleJoint= ruleJoint EOF )
            // InternalXacro.g:840:2: iv_ruleJoint= ruleJoint EOF
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
    // InternalXacro.g:846:1: ruleJoint returns [EObject current=null] : (otherlv_0= 'Joint' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) otherlv_6= 'parent' ( ( ruleEString ) ) otherlv_8= 'child' ( ( ruleEString ) ) (otherlv_10= 'origin' ( (lv_origin_11_0= rulePose ) ) )? (otherlv_12= 'axis' ( (lv_axis_13_0= ruleAxis ) ) )? (otherlv_14= 'calibration' ( (lv_calibration_15_0= ruleCalibration ) ) )? (otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )? (otherlv_18= 'limit' ( (lv_limit_19_0= ruleLimit ) ) )? (otherlv_20= 'safetyController' ( (lv_safetyController_21_0= ruleSafetyController ) ) )? (otherlv_22= 'mimic' ( (lv_mimic_23_0= ruleMimic ) ) )? otherlv_24= '}' ) ;
    public final EObject ruleJoint() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;

        EObject lv_origin_11_0 = null;

        EObject lv_axis_13_0 = null;

        EObject lv_calibration_15_0 = null;

        EObject lv_dynamics_17_0 = null;

        EObject lv_limit_19_0 = null;

        EObject lv_safetyController_21_0 = null;

        EObject lv_mimic_23_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:852:2: ( (otherlv_0= 'Joint' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) otherlv_6= 'parent' ( ( ruleEString ) ) otherlv_8= 'child' ( ( ruleEString ) ) (otherlv_10= 'origin' ( (lv_origin_11_0= rulePose ) ) )? (otherlv_12= 'axis' ( (lv_axis_13_0= ruleAxis ) ) )? (otherlv_14= 'calibration' ( (lv_calibration_15_0= ruleCalibration ) ) )? (otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )? (otherlv_18= 'limit' ( (lv_limit_19_0= ruleLimit ) ) )? (otherlv_20= 'safetyController' ( (lv_safetyController_21_0= ruleSafetyController ) ) )? (otherlv_22= 'mimic' ( (lv_mimic_23_0= ruleMimic ) ) )? otherlv_24= '}' ) )
            // InternalXacro.g:853:2: (otherlv_0= 'Joint' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) otherlv_6= 'parent' ( ( ruleEString ) ) otherlv_8= 'child' ( ( ruleEString ) ) (otherlv_10= 'origin' ( (lv_origin_11_0= rulePose ) ) )? (otherlv_12= 'axis' ( (lv_axis_13_0= ruleAxis ) ) )? (otherlv_14= 'calibration' ( (lv_calibration_15_0= ruleCalibration ) ) )? (otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )? (otherlv_18= 'limit' ( (lv_limit_19_0= ruleLimit ) ) )? (otherlv_20= 'safetyController' ( (lv_safetyController_21_0= ruleSafetyController ) ) )? (otherlv_22= 'mimic' ( (lv_mimic_23_0= ruleMimic ) ) )? otherlv_24= '}' )
            {
            // InternalXacro.g:853:2: (otherlv_0= 'Joint' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) otherlv_6= 'parent' ( ( ruleEString ) ) otherlv_8= 'child' ( ( ruleEString ) ) (otherlv_10= 'origin' ( (lv_origin_11_0= rulePose ) ) )? (otherlv_12= 'axis' ( (lv_axis_13_0= ruleAxis ) ) )? (otherlv_14= 'calibration' ( (lv_calibration_15_0= ruleCalibration ) ) )? (otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )? (otherlv_18= 'limit' ( (lv_limit_19_0= ruleLimit ) ) )? (otherlv_20= 'safetyController' ( (lv_safetyController_21_0= ruleSafetyController ) ) )? (otherlv_22= 'mimic' ( (lv_mimic_23_0= ruleMimic ) ) )? otherlv_24= '}' )
            // InternalXacro.g:854:3: otherlv_0= 'Joint' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) otherlv_6= 'parent' ( ( ruleEString ) ) otherlv_8= 'child' ( ( ruleEString ) ) (otherlv_10= 'origin' ( (lv_origin_11_0= rulePose ) ) )? (otherlv_12= 'axis' ( (lv_axis_13_0= ruleAxis ) ) )? (otherlv_14= 'calibration' ( (lv_calibration_15_0= ruleCalibration ) ) )? (otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )? (otherlv_18= 'limit' ( (lv_limit_19_0= ruleLimit ) ) )? (otherlv_20= 'safetyController' ( (lv_safetyController_21_0= ruleSafetyController ) ) )? (otherlv_22= 'mimic' ( (lv_mimic_23_0= ruleMimic ) ) )? otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getJointAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getJointAccess().getNameKeyword_2());
            		
            // InternalXacro.g:866:3: ( (lv_name_3_0= ruleEString ) )
            // InternalXacro.g:867:4: (lv_name_3_0= ruleEString )
            {
            // InternalXacro.g:867:4: (lv_name_3_0= ruleEString )
            // InternalXacro.g:868:5: lv_name_3_0= ruleEString
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

            otherlv_4=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getJointAccess().getTypeKeyword_4());
            		
            // InternalXacro.g:889:3: ( (lv_type_5_0= ruleEString ) )
            // InternalXacro.g:890:4: (lv_type_5_0= ruleEString )
            {
            // InternalXacro.g:890:4: (lv_type_5_0= ruleEString )
            // InternalXacro.g:891:5: lv_type_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJointAccess().getTypeEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_26);
            lv_type_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getJointAccess().getParentKeyword_6());
            		
            // InternalXacro.g:912:3: ( ( ruleEString ) )
            // InternalXacro.g:913:4: ( ruleEString )
            {
            // InternalXacro.g:913:4: ( ruleEString )
            // InternalXacro.g:914:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				

            					newCompositeNode(grammarAccess.getJointAccess().getParentLinkCrossReference_7_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getJointAccess().getChildKeyword_8());
            		
            // InternalXacro.g:932:3: ( ( ruleEString ) )
            // InternalXacro.g:933:4: ( ruleEString )
            {
            // InternalXacro.g:933:4: ( ruleEString )
            // InternalXacro.g:934:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				

            					newCompositeNode(grammarAccess.getJointAccess().getChildLinkCrossReference_9_0());
            				
            pushFollow(FOLLOW_28);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXacro.g:948:3: (otherlv_10= 'origin' ( (lv_origin_11_0= rulePose ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXacro.g:949:4: otherlv_10= 'origin' ( (lv_origin_11_0= rulePose ) )
                    {
                    otherlv_10=(Token)match(input,37,FOLLOW_29); 

                    				newLeafNode(otherlv_10, grammarAccess.getJointAccess().getOriginKeyword_10_0());
                    			
                    // InternalXacro.g:953:4: ( (lv_origin_11_0= rulePose ) )
                    // InternalXacro.g:954:5: (lv_origin_11_0= rulePose )
                    {
                    // InternalXacro.g:954:5: (lv_origin_11_0= rulePose )
                    // InternalXacro.g:955:6: lv_origin_11_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getOriginPoseParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_30);
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

            // InternalXacro.g:973:3: (otherlv_12= 'axis' ( (lv_axis_13_0= ruleAxis ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalXacro.g:974:4: otherlv_12= 'axis' ( (lv_axis_13_0= ruleAxis ) )
                    {
                    otherlv_12=(Token)match(input,38,FOLLOW_31); 

                    				newLeafNode(otherlv_12, grammarAccess.getJointAccess().getAxisKeyword_11_0());
                    			
                    // InternalXacro.g:978:4: ( (lv_axis_13_0= ruleAxis ) )
                    // InternalXacro.g:979:5: (lv_axis_13_0= ruleAxis )
                    {
                    // InternalXacro.g:979:5: (lv_axis_13_0= ruleAxis )
                    // InternalXacro.g:980:6: lv_axis_13_0= ruleAxis
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_32);
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

            // InternalXacro.g:998:3: (otherlv_14= 'calibration' ( (lv_calibration_15_0= ruleCalibration ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalXacro.g:999:4: otherlv_14= 'calibration' ( (lv_calibration_15_0= ruleCalibration ) )
                    {
                    otherlv_14=(Token)match(input,39,FOLLOW_33); 

                    				newLeafNode(otherlv_14, grammarAccess.getJointAccess().getCalibrationKeyword_12_0());
                    			
                    // InternalXacro.g:1003:4: ( (lv_calibration_15_0= ruleCalibration ) )
                    // InternalXacro.g:1004:5: (lv_calibration_15_0= ruleCalibration )
                    {
                    // InternalXacro.g:1004:5: (lv_calibration_15_0= ruleCalibration )
                    // InternalXacro.g:1005:6: lv_calibration_15_0= ruleCalibration
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getCalibrationCalibrationParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_34);
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

            // InternalXacro.g:1023:3: (otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalXacro.g:1024:4: otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) )
                    {
                    otherlv_16=(Token)match(input,40,FOLLOW_35); 

                    				newLeafNode(otherlv_16, grammarAccess.getJointAccess().getDynamicsKeyword_13_0());
                    			
                    // InternalXacro.g:1028:4: ( (lv_dynamics_17_0= ruleDynamics ) )
                    // InternalXacro.g:1029:5: (lv_dynamics_17_0= ruleDynamics )
                    {
                    // InternalXacro.g:1029:5: (lv_dynamics_17_0= ruleDynamics )
                    // InternalXacro.g:1030:6: lv_dynamics_17_0= ruleDynamics
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getDynamicsDynamicsParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_36);
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

            // InternalXacro.g:1048:3: (otherlv_18= 'limit' ( (lv_limit_19_0= ruleLimit ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalXacro.g:1049:4: otherlv_18= 'limit' ( (lv_limit_19_0= ruleLimit ) )
                    {
                    otherlv_18=(Token)match(input,41,FOLLOW_37); 

                    				newLeafNode(otherlv_18, grammarAccess.getJointAccess().getLimitKeyword_14_0());
                    			
                    // InternalXacro.g:1053:4: ( (lv_limit_19_0= ruleLimit ) )
                    // InternalXacro.g:1054:5: (lv_limit_19_0= ruleLimit )
                    {
                    // InternalXacro.g:1054:5: (lv_limit_19_0= ruleLimit )
                    // InternalXacro.g:1055:6: lv_limit_19_0= ruleLimit
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_38);
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

            // InternalXacro.g:1073:3: (otherlv_20= 'safetyController' ( (lv_safetyController_21_0= ruleSafetyController ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalXacro.g:1074:4: otherlv_20= 'safetyController' ( (lv_safetyController_21_0= ruleSafetyController ) )
                    {
                    otherlv_20=(Token)match(input,42,FOLLOW_39); 

                    				newLeafNode(otherlv_20, grammarAccess.getJointAccess().getSafetyControllerKeyword_15_0());
                    			
                    // InternalXacro.g:1078:4: ( (lv_safetyController_21_0= ruleSafetyController ) )
                    // InternalXacro.g:1079:5: (lv_safetyController_21_0= ruleSafetyController )
                    {
                    // InternalXacro.g:1079:5: (lv_safetyController_21_0= ruleSafetyController )
                    // InternalXacro.g:1080:6: lv_safetyController_21_0= ruleSafetyController
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getSafetyControllerSafetyControllerParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_40);
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

            // InternalXacro.g:1098:3: (otherlv_22= 'mimic' ( (lv_mimic_23_0= ruleMimic ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==43) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXacro.g:1099:4: otherlv_22= 'mimic' ( (lv_mimic_23_0= ruleMimic ) )
                    {
                    otherlv_22=(Token)match(input,43,FOLLOW_41); 

                    				newLeafNode(otherlv_22, grammarAccess.getJointAccess().getMimicKeyword_16_0());
                    			
                    // InternalXacro.g:1103:4: ( (lv_mimic_23_0= ruleMimic ) )
                    // InternalXacro.g:1104:5: (lv_mimic_23_0= ruleMimic )
                    {
                    // InternalXacro.g:1104:5: (lv_mimic_23_0= ruleMimic )
                    // InternalXacro.g:1105:6: lv_mimic_23_0= ruleMimic
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

            otherlv_24=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:1131:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalXacro.g:1131:45: (iv_ruleLink= ruleLink EOF )
            // InternalXacro.g:1132:2: iv_ruleLink= ruleLink EOF
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
    // InternalXacro.g:1138:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'inertial' ( (lv_inertial_7_0= ruleInertial ) ) )? (otherlv_8= 'visual' ( (lv_visual_9_0= ruleVisual ) ) )? (otherlv_10= 'collision' ( (lv_collision_11_0= ruleCollision ) ) )? otherlv_12= '}' ) ;
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
            // InternalXacro.g:1144:2: ( (otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'inertial' ( (lv_inertial_7_0= ruleInertial ) ) )? (otherlv_8= 'visual' ( (lv_visual_9_0= ruleVisual ) ) )? (otherlv_10= 'collision' ( (lv_collision_11_0= ruleCollision ) ) )? otherlv_12= '}' ) )
            // InternalXacro.g:1145:2: (otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'inertial' ( (lv_inertial_7_0= ruleInertial ) ) )? (otherlv_8= 'visual' ( (lv_visual_9_0= ruleVisual ) ) )? (otherlv_10= 'collision' ( (lv_collision_11_0= ruleCollision ) ) )? otherlv_12= '}' )
            {
            // InternalXacro.g:1145:2: (otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'inertial' ( (lv_inertial_7_0= ruleInertial ) ) )? (otherlv_8= 'visual' ( (lv_visual_9_0= ruleVisual ) ) )? (otherlv_10= 'collision' ( (lv_collision_11_0= ruleCollision ) ) )? otherlv_12= '}' )
            // InternalXacro.g:1146:3: otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'inertial' ( (lv_inertial_7_0= ruleInertial ) ) )? (otherlv_8= 'visual' ( (lv_visual_9_0= ruleVisual ) ) )? (otherlv_10= 'collision' ( (lv_collision_11_0= ruleCollision ) ) )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getNameKeyword_2());
            		
            // InternalXacro.g:1158:3: ( (lv_name_3_0= ruleEString ) )
            // InternalXacro.g:1159:4: (lv_name_3_0= ruleEString )
            {
            // InternalXacro.g:1159:4: (lv_name_3_0= ruleEString )
            // InternalXacro.g:1160:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_42);
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

            // InternalXacro.g:1177:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalXacro.g:1178:4: otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getTypeKeyword_4_0());
                    			
                    // InternalXacro.g:1182:4: ( (lv_type_5_0= ruleEString ) )
                    // InternalXacro.g:1183:5: (lv_type_5_0= ruleEString )
                    {
                    // InternalXacro.g:1183:5: (lv_type_5_0= ruleEString )
                    // InternalXacro.g:1184:6: lv_type_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLinkAccess().getTypeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_43);
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

            // InternalXacro.g:1202:3: (otherlv_6= 'inertial' ( (lv_inertial_7_0= ruleInertial ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==45) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalXacro.g:1203:4: otherlv_6= 'inertial' ( (lv_inertial_7_0= ruleInertial ) )
                    {
                    otherlv_6=(Token)match(input,45,FOLLOW_44); 

                    				newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getInertialKeyword_5_0());
                    			
                    // InternalXacro.g:1207:4: ( (lv_inertial_7_0= ruleInertial ) )
                    // InternalXacro.g:1208:5: (lv_inertial_7_0= ruleInertial )
                    {
                    // InternalXacro.g:1208:5: (lv_inertial_7_0= ruleInertial )
                    // InternalXacro.g:1209:6: lv_inertial_7_0= ruleInertial
                    {

                    						newCompositeNode(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_45);
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

            // InternalXacro.g:1227:3: (otherlv_8= 'visual' ( (lv_visual_9_0= ruleVisual ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==46) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalXacro.g:1228:4: otherlv_8= 'visual' ( (lv_visual_9_0= ruleVisual ) )
                    {
                    otherlv_8=(Token)match(input,46,FOLLOW_46); 

                    				newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getVisualKeyword_6_0());
                    			
                    // InternalXacro.g:1232:4: ( (lv_visual_9_0= ruleVisual ) )
                    // InternalXacro.g:1233:5: (lv_visual_9_0= ruleVisual )
                    {
                    // InternalXacro.g:1233:5: (lv_visual_9_0= ruleVisual )
                    // InternalXacro.g:1234:6: lv_visual_9_0= ruleVisual
                    {

                    						newCompositeNode(grammarAccess.getLinkAccess().getVisualVisualParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_47);
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

            // InternalXacro.g:1252:3: (otherlv_10= 'collision' ( (lv_collision_11_0= ruleCollision ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==47) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalXacro.g:1253:4: otherlv_10= 'collision' ( (lv_collision_11_0= ruleCollision ) )
                    {
                    otherlv_10=(Token)match(input,47,FOLLOW_48); 

                    				newLeafNode(otherlv_10, grammarAccess.getLinkAccess().getCollisionKeyword_7_0());
                    			
                    // InternalXacro.g:1257:4: ( (lv_collision_11_0= ruleCollision ) )
                    // InternalXacro.g:1258:5: (lv_collision_11_0= ruleCollision )
                    {
                    // InternalXacro.g:1258:5: (lv_collision_11_0= ruleCollision )
                    // InternalXacro.g:1259:6: lv_collision_11_0= ruleCollision
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

            otherlv_12=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:1285:1: entryRuleMaterialGlobal returns [EObject current=null] : iv_ruleMaterialGlobal= ruleMaterialGlobal EOF ;
    public final EObject entryRuleMaterialGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaterialGlobal = null;


        try {
            // InternalXacro.g:1285:55: (iv_ruleMaterialGlobal= ruleMaterialGlobal EOF )
            // InternalXacro.g:1286:2: iv_ruleMaterialGlobal= ruleMaterialGlobal EOF
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
    // InternalXacro.g:1292:1: ruleMaterialGlobal returns [EObject current=null] : (otherlv_0= 'MaterialGlobal' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )? (otherlv_6= 'texture' ( (lv_texture_7_0= ruleTexture ) ) )? otherlv_8= '}' ) ;
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
            // InternalXacro.g:1298:2: ( (otherlv_0= 'MaterialGlobal' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )? (otherlv_6= 'texture' ( (lv_texture_7_0= ruleTexture ) ) )? otherlv_8= '}' ) )
            // InternalXacro.g:1299:2: (otherlv_0= 'MaterialGlobal' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )? (otherlv_6= 'texture' ( (lv_texture_7_0= ruleTexture ) ) )? otherlv_8= '}' )
            {
            // InternalXacro.g:1299:2: (otherlv_0= 'MaterialGlobal' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )? (otherlv_6= 'texture' ( (lv_texture_7_0= ruleTexture ) ) )? otherlv_8= '}' )
            // InternalXacro.g:1300:3: otherlv_0= 'MaterialGlobal' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )? (otherlv_6= 'texture' ( (lv_texture_7_0= ruleTexture ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMaterialGlobalAccess().getMaterialGlobalKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMaterialGlobalAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMaterialGlobalAccess().getNameKeyword_2());
            		
            // InternalXacro.g:1312:3: ( (lv_name_3_0= ruleEString ) )
            // InternalXacro.g:1313:4: (lv_name_3_0= ruleEString )
            {
            // InternalXacro.g:1313:4: (lv_name_3_0= ruleEString )
            // InternalXacro.g:1314:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMaterialGlobalAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_49);
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

            // InternalXacro.g:1331:3: (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==49) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalXacro.g:1332:4: otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) )
                    {
                    otherlv_4=(Token)match(input,49,FOLLOW_50); 

                    				newLeafNode(otherlv_4, grammarAccess.getMaterialGlobalAccess().getColorKeyword_4_0());
                    			
                    // InternalXacro.g:1336:4: ( (lv_color_5_0= ruleColor ) )
                    // InternalXacro.g:1337:5: (lv_color_5_0= ruleColor )
                    {
                    // InternalXacro.g:1337:5: (lv_color_5_0= ruleColor )
                    // InternalXacro.g:1338:6: lv_color_5_0= ruleColor
                    {

                    						newCompositeNode(grammarAccess.getMaterialGlobalAccess().getColorColorParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_51);
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

            // InternalXacro.g:1356:3: (otherlv_6= 'texture' ( (lv_texture_7_0= ruleTexture ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==50) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalXacro.g:1357:4: otherlv_6= 'texture' ( (lv_texture_7_0= ruleTexture ) )
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_52); 

                    				newLeafNode(otherlv_6, grammarAccess.getMaterialGlobalAccess().getTextureKeyword_5_0());
                    			
                    // InternalXacro.g:1361:4: ( (lv_texture_7_0= ruleTexture ) )
                    // InternalXacro.g:1362:5: (lv_texture_7_0= ruleTexture )
                    {
                    // InternalXacro.g:1362:5: (lv_texture_7_0= ruleTexture )
                    // InternalXacro.g:1363:6: lv_texture_7_0= ruleTexture
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

            otherlv_8=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:1389:1: entryRuleTransmission returns [EObject current=null] : iv_ruleTransmission= ruleTransmission EOF ;
    public final EObject entryRuleTransmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransmission = null;


        try {
            // InternalXacro.g:1389:53: (iv_ruleTransmission= ruleTransmission EOF )
            // InternalXacro.g:1390:2: iv_ruleTransmission= ruleTransmission EOF
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
    // InternalXacro.g:1396:1: ruleTransmission returns [EObject current=null] : (otherlv_0= 'Transmission' otherlv_1= '{' (otherlv_2= 'mechanicalReduction' otherlv_3= '{' ( (lv_mechanicalReduction_4_0= ruleDouble0 ) ) (otherlv_5= ',' ( (lv_mechanicalReduction_6_0= ruleDouble0 ) ) )* otherlv_7= '}' )? otherlv_8= 'name' ( (lv_name_9_0= ruleEString ) ) otherlv_10= 'type' ( (lv_type_11_0= ruleEString ) ) (otherlv_12= 'leftActuator' otherlv_13= '{' ( (lv_leftActuator_14_0= ruleActuatorTransmission ) ) (otherlv_15= ',' ( (lv_leftActuator_16_0= ruleActuatorTransmission ) ) )* otherlv_17= '}' )? (otherlv_18= 'rightActuator' otherlv_19= '{' ( (lv_rightActuator_20_0= ruleActuatorTransmission ) ) (otherlv_21= ',' ( (lv_rightActuator_22_0= ruleActuatorTransmission ) ) )* otherlv_23= '}' )? (otherlv_24= 'flexJoint' otherlv_25= '{' ( (lv_flexJoint_26_0= ruleActuatorTransmission ) ) (otherlv_27= ',' ( (lv_flexJoint_28_0= ruleActuatorTransmission ) ) )* otherlv_29= '}' )? (otherlv_30= 'rollJoint' otherlv_31= '{' ( (lv_rollJoint_32_0= ruleActuatorTransmission ) ) (otherlv_33= ',' ( (lv_rollJoint_34_0= ruleActuatorTransmission ) ) )* otherlv_35= '}' )? (otherlv_36= 'gapJoint' otherlv_37= '{' ( (lv_gapJoint_38_0= ruleGapJointTransmission ) ) (otherlv_39= ',' ( (lv_gapJoint_40_0= ruleGapJointTransmission ) ) )* otherlv_41= '}' )? (otherlv_42= 'passiveJoint' otherlv_43= '{' ( (lv_passiveJoint_44_0= rulePassiveJointTransmission ) ) (otherlv_45= ',' ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) ) )* otherlv_47= '}' )? (otherlv_48= 'useSimulatedGripperJoint' otherlv_49= '{' ( (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType ) ) (otherlv_51= ',' ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) ) )* otherlv_53= '}' )? (otherlv_54= 'actuator' otherlv_55= '{' ( (lv_actuator_56_0= ruleName ) ) (otherlv_57= ',' ( (lv_actuator_58_0= ruleName ) ) )* otherlv_59= '}' )? (otherlv_60= 'joint' otherlv_61= '{' ( (lv_joint_62_0= ruleName ) ) (otherlv_63= ',' ( (lv_joint_64_0= ruleName ) ) )* otherlv_65= '}' )? otherlv_66= '}' ) ;
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
            // InternalXacro.g:1402:2: ( (otherlv_0= 'Transmission' otherlv_1= '{' (otherlv_2= 'mechanicalReduction' otherlv_3= '{' ( (lv_mechanicalReduction_4_0= ruleDouble0 ) ) (otherlv_5= ',' ( (lv_mechanicalReduction_6_0= ruleDouble0 ) ) )* otherlv_7= '}' )? otherlv_8= 'name' ( (lv_name_9_0= ruleEString ) ) otherlv_10= 'type' ( (lv_type_11_0= ruleEString ) ) (otherlv_12= 'leftActuator' otherlv_13= '{' ( (lv_leftActuator_14_0= ruleActuatorTransmission ) ) (otherlv_15= ',' ( (lv_leftActuator_16_0= ruleActuatorTransmission ) ) )* otherlv_17= '}' )? (otherlv_18= 'rightActuator' otherlv_19= '{' ( (lv_rightActuator_20_0= ruleActuatorTransmission ) ) (otherlv_21= ',' ( (lv_rightActuator_22_0= ruleActuatorTransmission ) ) )* otherlv_23= '}' )? (otherlv_24= 'flexJoint' otherlv_25= '{' ( (lv_flexJoint_26_0= ruleActuatorTransmission ) ) (otherlv_27= ',' ( (lv_flexJoint_28_0= ruleActuatorTransmission ) ) )* otherlv_29= '}' )? (otherlv_30= 'rollJoint' otherlv_31= '{' ( (lv_rollJoint_32_0= ruleActuatorTransmission ) ) (otherlv_33= ',' ( (lv_rollJoint_34_0= ruleActuatorTransmission ) ) )* otherlv_35= '}' )? (otherlv_36= 'gapJoint' otherlv_37= '{' ( (lv_gapJoint_38_0= ruleGapJointTransmission ) ) (otherlv_39= ',' ( (lv_gapJoint_40_0= ruleGapJointTransmission ) ) )* otherlv_41= '}' )? (otherlv_42= 'passiveJoint' otherlv_43= '{' ( (lv_passiveJoint_44_0= rulePassiveJointTransmission ) ) (otherlv_45= ',' ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) ) )* otherlv_47= '}' )? (otherlv_48= 'useSimulatedGripperJoint' otherlv_49= '{' ( (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType ) ) (otherlv_51= ',' ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) ) )* otherlv_53= '}' )? (otherlv_54= 'actuator' otherlv_55= '{' ( (lv_actuator_56_0= ruleName ) ) (otherlv_57= ',' ( (lv_actuator_58_0= ruleName ) ) )* otherlv_59= '}' )? (otherlv_60= 'joint' otherlv_61= '{' ( (lv_joint_62_0= ruleName ) ) (otherlv_63= ',' ( (lv_joint_64_0= ruleName ) ) )* otherlv_65= '}' )? otherlv_66= '}' ) )
            // InternalXacro.g:1403:2: (otherlv_0= 'Transmission' otherlv_1= '{' (otherlv_2= 'mechanicalReduction' otherlv_3= '{' ( (lv_mechanicalReduction_4_0= ruleDouble0 ) ) (otherlv_5= ',' ( (lv_mechanicalReduction_6_0= ruleDouble0 ) ) )* otherlv_7= '}' )? otherlv_8= 'name' ( (lv_name_9_0= ruleEString ) ) otherlv_10= 'type' ( (lv_type_11_0= ruleEString ) ) (otherlv_12= 'leftActuator' otherlv_13= '{' ( (lv_leftActuator_14_0= ruleActuatorTransmission ) ) (otherlv_15= ',' ( (lv_leftActuator_16_0= ruleActuatorTransmission ) ) )* otherlv_17= '}' )? (otherlv_18= 'rightActuator' otherlv_19= '{' ( (lv_rightActuator_20_0= ruleActuatorTransmission ) ) (otherlv_21= ',' ( (lv_rightActuator_22_0= ruleActuatorTransmission ) ) )* otherlv_23= '}' )? (otherlv_24= 'flexJoint' otherlv_25= '{' ( (lv_flexJoint_26_0= ruleActuatorTransmission ) ) (otherlv_27= ',' ( (lv_flexJoint_28_0= ruleActuatorTransmission ) ) )* otherlv_29= '}' )? (otherlv_30= 'rollJoint' otherlv_31= '{' ( (lv_rollJoint_32_0= ruleActuatorTransmission ) ) (otherlv_33= ',' ( (lv_rollJoint_34_0= ruleActuatorTransmission ) ) )* otherlv_35= '}' )? (otherlv_36= 'gapJoint' otherlv_37= '{' ( (lv_gapJoint_38_0= ruleGapJointTransmission ) ) (otherlv_39= ',' ( (lv_gapJoint_40_0= ruleGapJointTransmission ) ) )* otherlv_41= '}' )? (otherlv_42= 'passiveJoint' otherlv_43= '{' ( (lv_passiveJoint_44_0= rulePassiveJointTransmission ) ) (otherlv_45= ',' ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) ) )* otherlv_47= '}' )? (otherlv_48= 'useSimulatedGripperJoint' otherlv_49= '{' ( (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType ) ) (otherlv_51= ',' ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) ) )* otherlv_53= '}' )? (otherlv_54= 'actuator' otherlv_55= '{' ( (lv_actuator_56_0= ruleName ) ) (otherlv_57= ',' ( (lv_actuator_58_0= ruleName ) ) )* otherlv_59= '}' )? (otherlv_60= 'joint' otherlv_61= '{' ( (lv_joint_62_0= ruleName ) ) (otherlv_63= ',' ( (lv_joint_64_0= ruleName ) ) )* otherlv_65= '}' )? otherlv_66= '}' )
            {
            // InternalXacro.g:1403:2: (otherlv_0= 'Transmission' otherlv_1= '{' (otherlv_2= 'mechanicalReduction' otherlv_3= '{' ( (lv_mechanicalReduction_4_0= ruleDouble0 ) ) (otherlv_5= ',' ( (lv_mechanicalReduction_6_0= ruleDouble0 ) ) )* otherlv_7= '}' )? otherlv_8= 'name' ( (lv_name_9_0= ruleEString ) ) otherlv_10= 'type' ( (lv_type_11_0= ruleEString ) ) (otherlv_12= 'leftActuator' otherlv_13= '{' ( (lv_leftActuator_14_0= ruleActuatorTransmission ) ) (otherlv_15= ',' ( (lv_leftActuator_16_0= ruleActuatorTransmission ) ) )* otherlv_17= '}' )? (otherlv_18= 'rightActuator' otherlv_19= '{' ( (lv_rightActuator_20_0= ruleActuatorTransmission ) ) (otherlv_21= ',' ( (lv_rightActuator_22_0= ruleActuatorTransmission ) ) )* otherlv_23= '}' )? (otherlv_24= 'flexJoint' otherlv_25= '{' ( (lv_flexJoint_26_0= ruleActuatorTransmission ) ) (otherlv_27= ',' ( (lv_flexJoint_28_0= ruleActuatorTransmission ) ) )* otherlv_29= '}' )? (otherlv_30= 'rollJoint' otherlv_31= '{' ( (lv_rollJoint_32_0= ruleActuatorTransmission ) ) (otherlv_33= ',' ( (lv_rollJoint_34_0= ruleActuatorTransmission ) ) )* otherlv_35= '}' )? (otherlv_36= 'gapJoint' otherlv_37= '{' ( (lv_gapJoint_38_0= ruleGapJointTransmission ) ) (otherlv_39= ',' ( (lv_gapJoint_40_0= ruleGapJointTransmission ) ) )* otherlv_41= '}' )? (otherlv_42= 'passiveJoint' otherlv_43= '{' ( (lv_passiveJoint_44_0= rulePassiveJointTransmission ) ) (otherlv_45= ',' ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) ) )* otherlv_47= '}' )? (otherlv_48= 'useSimulatedGripperJoint' otherlv_49= '{' ( (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType ) ) (otherlv_51= ',' ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) ) )* otherlv_53= '}' )? (otherlv_54= 'actuator' otherlv_55= '{' ( (lv_actuator_56_0= ruleName ) ) (otherlv_57= ',' ( (lv_actuator_58_0= ruleName ) ) )* otherlv_59= '}' )? (otherlv_60= 'joint' otherlv_61= '{' ( (lv_joint_62_0= ruleName ) ) (otherlv_63= ',' ( (lv_joint_64_0= ruleName ) ) )* otherlv_65= '}' )? otherlv_66= '}' )
            // InternalXacro.g:1404:3: otherlv_0= 'Transmission' otherlv_1= '{' (otherlv_2= 'mechanicalReduction' otherlv_3= '{' ( (lv_mechanicalReduction_4_0= ruleDouble0 ) ) (otherlv_5= ',' ( (lv_mechanicalReduction_6_0= ruleDouble0 ) ) )* otherlv_7= '}' )? otherlv_8= 'name' ( (lv_name_9_0= ruleEString ) ) otherlv_10= 'type' ( (lv_type_11_0= ruleEString ) ) (otherlv_12= 'leftActuator' otherlv_13= '{' ( (lv_leftActuator_14_0= ruleActuatorTransmission ) ) (otherlv_15= ',' ( (lv_leftActuator_16_0= ruleActuatorTransmission ) ) )* otherlv_17= '}' )? (otherlv_18= 'rightActuator' otherlv_19= '{' ( (lv_rightActuator_20_0= ruleActuatorTransmission ) ) (otherlv_21= ',' ( (lv_rightActuator_22_0= ruleActuatorTransmission ) ) )* otherlv_23= '}' )? (otherlv_24= 'flexJoint' otherlv_25= '{' ( (lv_flexJoint_26_0= ruleActuatorTransmission ) ) (otherlv_27= ',' ( (lv_flexJoint_28_0= ruleActuatorTransmission ) ) )* otherlv_29= '}' )? (otherlv_30= 'rollJoint' otherlv_31= '{' ( (lv_rollJoint_32_0= ruleActuatorTransmission ) ) (otherlv_33= ',' ( (lv_rollJoint_34_0= ruleActuatorTransmission ) ) )* otherlv_35= '}' )? (otherlv_36= 'gapJoint' otherlv_37= '{' ( (lv_gapJoint_38_0= ruleGapJointTransmission ) ) (otherlv_39= ',' ( (lv_gapJoint_40_0= ruleGapJointTransmission ) ) )* otherlv_41= '}' )? (otherlv_42= 'passiveJoint' otherlv_43= '{' ( (lv_passiveJoint_44_0= rulePassiveJointTransmission ) ) (otherlv_45= ',' ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) ) )* otherlv_47= '}' )? (otherlv_48= 'useSimulatedGripperJoint' otherlv_49= '{' ( (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType ) ) (otherlv_51= ',' ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) ) )* otherlv_53= '}' )? (otherlv_54= 'actuator' otherlv_55= '{' ( (lv_actuator_56_0= ruleName ) ) (otherlv_57= ',' ( (lv_actuator_58_0= ruleName ) ) )* otherlv_59= '}' )? (otherlv_60= 'joint' otherlv_61= '{' ( (lv_joint_62_0= ruleName ) ) (otherlv_63= ',' ( (lv_joint_64_0= ruleName ) ) )* otherlv_65= '}' )? otherlv_66= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransmissionAccess().getTransmissionKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXacro.g:1412:3: (otherlv_2= 'mechanicalReduction' otherlv_3= '{' ( (lv_mechanicalReduction_4_0= ruleDouble0 ) ) (otherlv_5= ',' ( (lv_mechanicalReduction_6_0= ruleDouble0 ) ) )* otherlv_7= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==52) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalXacro.g:1413:4: otherlv_2= 'mechanicalReduction' otherlv_3= '{' ( (lv_mechanicalReduction_4_0= ruleDouble0 ) ) (otherlv_5= ',' ( (lv_mechanicalReduction_6_0= ruleDouble0 ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,52,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getTransmissionAccess().getMechanicalReductionKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,16,FOLLOW_54); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalXacro.g:1421:4: ( (lv_mechanicalReduction_4_0= ruleDouble0 ) )
                    // InternalXacro.g:1422:5: (lv_mechanicalReduction_4_0= ruleDouble0 )
                    {
                    // InternalXacro.g:1422:5: (lv_mechanicalReduction_4_0= ruleDouble0 )
                    // InternalXacro.g:1423:6: lv_mechanicalReduction_4_0= ruleDouble0
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

                    // InternalXacro.g:1440:4: (otherlv_5= ',' ( (lv_mechanicalReduction_6_0= ruleDouble0 ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==20) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalXacro.g:1441:5: otherlv_5= ',' ( (lv_mechanicalReduction_6_0= ruleDouble0 ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FOLLOW_54); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getTransmissionAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalXacro.g:1445:5: ( (lv_mechanicalReduction_6_0= ruleDouble0 ) )
                    	    // InternalXacro.g:1446:6: (lv_mechanicalReduction_6_0= ruleDouble0 )
                    	    {
                    	    // InternalXacro.g:1446:6: (lv_mechanicalReduction_6_0= ruleDouble0 )
                    	    // InternalXacro.g:1447:7: lv_mechanicalReduction_6_0= ruleDouble0
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
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getTransmissionAccess().getNameKeyword_3());
            		
            // InternalXacro.g:1474:3: ( (lv_name_9_0= ruleEString ) )
            // InternalXacro.g:1475:4: (lv_name_9_0= ruleEString )
            {
            // InternalXacro.g:1475:4: (lv_name_9_0= ruleEString )
            // InternalXacro.g:1476:5: lv_name_9_0= ruleEString
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

            otherlv_10=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getTransmissionAccess().getTypeKeyword_5());
            		
            // InternalXacro.g:1497:3: ( (lv_type_11_0= ruleEString ) )
            // InternalXacro.g:1498:4: (lv_type_11_0= ruleEString )
            {
            // InternalXacro.g:1498:4: (lv_type_11_0= ruleEString )
            // InternalXacro.g:1499:5: lv_type_11_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransmissionAccess().getTypeEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_55);
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

            // InternalXacro.g:1516:3: (otherlv_12= 'leftActuator' otherlv_13= '{' ( (lv_leftActuator_14_0= ruleActuatorTransmission ) ) (otherlv_15= ',' ( (lv_leftActuator_16_0= ruleActuatorTransmission ) ) )* otherlv_17= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==53) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalXacro.g:1517:4: otherlv_12= 'leftActuator' otherlv_13= '{' ( (lv_leftActuator_14_0= ruleActuatorTransmission ) ) (otherlv_15= ',' ( (lv_leftActuator_16_0= ruleActuatorTransmission ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getTransmissionAccess().getLeftActuatorKeyword_7_0());
                    			
                    otherlv_13=(Token)match(input,16,FOLLOW_56); 

                    				newLeafNode(otherlv_13, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalXacro.g:1525:4: ( (lv_leftActuator_14_0= ruleActuatorTransmission ) )
                    // InternalXacro.g:1526:5: (lv_leftActuator_14_0= ruleActuatorTransmission )
                    {
                    // InternalXacro.g:1526:5: (lv_leftActuator_14_0= ruleActuatorTransmission )
                    // InternalXacro.g:1527:6: lv_leftActuator_14_0= ruleActuatorTransmission
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

                    // InternalXacro.g:1544:4: (otherlv_15= ',' ( (lv_leftActuator_16_0= ruleActuatorTransmission ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==20) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalXacro.g:1545:5: otherlv_15= ',' ( (lv_leftActuator_16_0= ruleActuatorTransmission ) )
                    	    {
                    	    otherlv_15=(Token)match(input,20,FOLLOW_56); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getTransmissionAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalXacro.g:1549:5: ( (lv_leftActuator_16_0= ruleActuatorTransmission ) )
                    	    // InternalXacro.g:1550:6: (lv_leftActuator_16_0= ruleActuatorTransmission )
                    	    {
                    	    // InternalXacro.g:1550:6: (lv_leftActuator_16_0= ruleActuatorTransmission )
                    	    // InternalXacro.g:1551:7: lv_leftActuator_16_0= ruleActuatorTransmission
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
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,21,FOLLOW_57); 

                    				newLeafNode(otherlv_17, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:1574:3: (otherlv_18= 'rightActuator' otherlv_19= '{' ( (lv_rightActuator_20_0= ruleActuatorTransmission ) ) (otherlv_21= ',' ( (lv_rightActuator_22_0= ruleActuatorTransmission ) ) )* otherlv_23= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==54) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalXacro.g:1575:4: otherlv_18= 'rightActuator' otherlv_19= '{' ( (lv_rightActuator_20_0= ruleActuatorTransmission ) ) (otherlv_21= ',' ( (lv_rightActuator_22_0= ruleActuatorTransmission ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,54,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getTransmissionAccess().getRightActuatorKeyword_8_0());
                    			
                    otherlv_19=(Token)match(input,16,FOLLOW_56); 

                    				newLeafNode(otherlv_19, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalXacro.g:1583:4: ( (lv_rightActuator_20_0= ruleActuatorTransmission ) )
                    // InternalXacro.g:1584:5: (lv_rightActuator_20_0= ruleActuatorTransmission )
                    {
                    // InternalXacro.g:1584:5: (lv_rightActuator_20_0= ruleActuatorTransmission )
                    // InternalXacro.g:1585:6: lv_rightActuator_20_0= ruleActuatorTransmission
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

                    // InternalXacro.g:1602:4: (otherlv_21= ',' ( (lv_rightActuator_22_0= ruleActuatorTransmission ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==20) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalXacro.g:1603:5: otherlv_21= ',' ( (lv_rightActuator_22_0= ruleActuatorTransmission ) )
                    	    {
                    	    otherlv_21=(Token)match(input,20,FOLLOW_56); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getTransmissionAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalXacro.g:1607:5: ( (lv_rightActuator_22_0= ruleActuatorTransmission ) )
                    	    // InternalXacro.g:1608:6: (lv_rightActuator_22_0= ruleActuatorTransmission )
                    	    {
                    	    // InternalXacro.g:1608:6: (lv_rightActuator_22_0= ruleActuatorTransmission )
                    	    // InternalXacro.g:1609:7: lv_rightActuator_22_0= ruleActuatorTransmission
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
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,21,FOLLOW_58); 

                    				newLeafNode(otherlv_23, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:1632:3: (otherlv_24= 'flexJoint' otherlv_25= '{' ( (lv_flexJoint_26_0= ruleActuatorTransmission ) ) (otherlv_27= ',' ( (lv_flexJoint_28_0= ruleActuatorTransmission ) ) )* otherlv_29= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==55) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalXacro.g:1633:4: otherlv_24= 'flexJoint' otherlv_25= '{' ( (lv_flexJoint_26_0= ruleActuatorTransmission ) ) (otherlv_27= ',' ( (lv_flexJoint_28_0= ruleActuatorTransmission ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,55,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getTransmissionAccess().getFlexJointKeyword_9_0());
                    			
                    otherlv_25=(Token)match(input,16,FOLLOW_56); 

                    				newLeafNode(otherlv_25, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalXacro.g:1641:4: ( (lv_flexJoint_26_0= ruleActuatorTransmission ) )
                    // InternalXacro.g:1642:5: (lv_flexJoint_26_0= ruleActuatorTransmission )
                    {
                    // InternalXacro.g:1642:5: (lv_flexJoint_26_0= ruleActuatorTransmission )
                    // InternalXacro.g:1643:6: lv_flexJoint_26_0= ruleActuatorTransmission
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

                    // InternalXacro.g:1660:4: (otherlv_27= ',' ( (lv_flexJoint_28_0= ruleActuatorTransmission ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==20) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalXacro.g:1661:5: otherlv_27= ',' ( (lv_flexJoint_28_0= ruleActuatorTransmission ) )
                    	    {
                    	    otherlv_27=(Token)match(input,20,FOLLOW_56); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getTransmissionAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalXacro.g:1665:5: ( (lv_flexJoint_28_0= ruleActuatorTransmission ) )
                    	    // InternalXacro.g:1666:6: (lv_flexJoint_28_0= ruleActuatorTransmission )
                    	    {
                    	    // InternalXacro.g:1666:6: (lv_flexJoint_28_0= ruleActuatorTransmission )
                    	    // InternalXacro.g:1667:7: lv_flexJoint_28_0= ruleActuatorTransmission
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
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,21,FOLLOW_59); 

                    				newLeafNode(otherlv_29, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:1690:3: (otherlv_30= 'rollJoint' otherlv_31= '{' ( (lv_rollJoint_32_0= ruleActuatorTransmission ) ) (otherlv_33= ',' ( (lv_rollJoint_34_0= ruleActuatorTransmission ) ) )* otherlv_35= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==56) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalXacro.g:1691:4: otherlv_30= 'rollJoint' otherlv_31= '{' ( (lv_rollJoint_32_0= ruleActuatorTransmission ) ) (otherlv_33= ',' ( (lv_rollJoint_34_0= ruleActuatorTransmission ) ) )* otherlv_35= '}'
                    {
                    otherlv_30=(Token)match(input,56,FOLLOW_3); 

                    				newLeafNode(otherlv_30, grammarAccess.getTransmissionAccess().getRollJointKeyword_10_0());
                    			
                    otherlv_31=(Token)match(input,16,FOLLOW_56); 

                    				newLeafNode(otherlv_31, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalXacro.g:1699:4: ( (lv_rollJoint_32_0= ruleActuatorTransmission ) )
                    // InternalXacro.g:1700:5: (lv_rollJoint_32_0= ruleActuatorTransmission )
                    {
                    // InternalXacro.g:1700:5: (lv_rollJoint_32_0= ruleActuatorTransmission )
                    // InternalXacro.g:1701:6: lv_rollJoint_32_0= ruleActuatorTransmission
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

                    // InternalXacro.g:1718:4: (otherlv_33= ',' ( (lv_rollJoint_34_0= ruleActuatorTransmission ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==20) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalXacro.g:1719:5: otherlv_33= ',' ( (lv_rollJoint_34_0= ruleActuatorTransmission ) )
                    	    {
                    	    otherlv_33=(Token)match(input,20,FOLLOW_56); 

                    	    					newLeafNode(otherlv_33, grammarAccess.getTransmissionAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalXacro.g:1723:5: ( (lv_rollJoint_34_0= ruleActuatorTransmission ) )
                    	    // InternalXacro.g:1724:6: (lv_rollJoint_34_0= ruleActuatorTransmission )
                    	    {
                    	    // InternalXacro.g:1724:6: (lv_rollJoint_34_0= ruleActuatorTransmission )
                    	    // InternalXacro.g:1725:7: lv_rollJoint_34_0= ruleActuatorTransmission
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
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,21,FOLLOW_60); 

                    				newLeafNode(otherlv_35, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:1748:3: (otherlv_36= 'gapJoint' otherlv_37= '{' ( (lv_gapJoint_38_0= ruleGapJointTransmission ) ) (otherlv_39= ',' ( (lv_gapJoint_40_0= ruleGapJointTransmission ) ) )* otherlv_41= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==57) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalXacro.g:1749:4: otherlv_36= 'gapJoint' otherlv_37= '{' ( (lv_gapJoint_38_0= ruleGapJointTransmission ) ) (otherlv_39= ',' ( (lv_gapJoint_40_0= ruleGapJointTransmission ) ) )* otherlv_41= '}'
                    {
                    otherlv_36=(Token)match(input,57,FOLLOW_3); 

                    				newLeafNode(otherlv_36, grammarAccess.getTransmissionAccess().getGapJointKeyword_11_0());
                    			
                    otherlv_37=(Token)match(input,16,FOLLOW_61); 

                    				newLeafNode(otherlv_37, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalXacro.g:1757:4: ( (lv_gapJoint_38_0= ruleGapJointTransmission ) )
                    // InternalXacro.g:1758:5: (lv_gapJoint_38_0= ruleGapJointTransmission )
                    {
                    // InternalXacro.g:1758:5: (lv_gapJoint_38_0= ruleGapJointTransmission )
                    // InternalXacro.g:1759:6: lv_gapJoint_38_0= ruleGapJointTransmission
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

                    // InternalXacro.g:1776:4: (otherlv_39= ',' ( (lv_gapJoint_40_0= ruleGapJointTransmission ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==20) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalXacro.g:1777:5: otherlv_39= ',' ( (lv_gapJoint_40_0= ruleGapJointTransmission ) )
                    	    {
                    	    otherlv_39=(Token)match(input,20,FOLLOW_61); 

                    	    					newLeafNode(otherlv_39, grammarAccess.getTransmissionAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalXacro.g:1781:5: ( (lv_gapJoint_40_0= ruleGapJointTransmission ) )
                    	    // InternalXacro.g:1782:6: (lv_gapJoint_40_0= ruleGapJointTransmission )
                    	    {
                    	    // InternalXacro.g:1782:6: (lv_gapJoint_40_0= ruleGapJointTransmission )
                    	    // InternalXacro.g:1783:7: lv_gapJoint_40_0= ruleGapJointTransmission
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
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_41=(Token)match(input,21,FOLLOW_62); 

                    				newLeafNode(otherlv_41, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:1806:3: (otherlv_42= 'passiveJoint' otherlv_43= '{' ( (lv_passiveJoint_44_0= rulePassiveJointTransmission ) ) (otherlv_45= ',' ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) ) )* otherlv_47= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==58) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalXacro.g:1807:4: otherlv_42= 'passiveJoint' otherlv_43= '{' ( (lv_passiveJoint_44_0= rulePassiveJointTransmission ) ) (otherlv_45= ',' ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) ) )* otherlv_47= '}'
                    {
                    otherlv_42=(Token)match(input,58,FOLLOW_3); 

                    				newLeafNode(otherlv_42, grammarAccess.getTransmissionAccess().getPassiveJointKeyword_12_0());
                    			
                    otherlv_43=(Token)match(input,16,FOLLOW_63); 

                    				newLeafNode(otherlv_43, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalXacro.g:1815:4: ( (lv_passiveJoint_44_0= rulePassiveJointTransmission ) )
                    // InternalXacro.g:1816:5: (lv_passiveJoint_44_0= rulePassiveJointTransmission )
                    {
                    // InternalXacro.g:1816:5: (lv_passiveJoint_44_0= rulePassiveJointTransmission )
                    // InternalXacro.g:1817:6: lv_passiveJoint_44_0= rulePassiveJointTransmission
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

                    // InternalXacro.g:1834:4: (otherlv_45= ',' ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==20) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalXacro.g:1835:5: otherlv_45= ',' ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) )
                    	    {
                    	    otherlv_45=(Token)match(input,20,FOLLOW_63); 

                    	    					newLeafNode(otherlv_45, grammarAccess.getTransmissionAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalXacro.g:1839:5: ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) )
                    	    // InternalXacro.g:1840:6: (lv_passiveJoint_46_0= rulePassiveJointTransmission )
                    	    {
                    	    // InternalXacro.g:1840:6: (lv_passiveJoint_46_0= rulePassiveJointTransmission )
                    	    // InternalXacro.g:1841:7: lv_passiveJoint_46_0= rulePassiveJointTransmission
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
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_47=(Token)match(input,21,FOLLOW_64); 

                    				newLeafNode(otherlv_47, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:1864:3: (otherlv_48= 'useSimulatedGripperJoint' otherlv_49= '{' ( (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType ) ) (otherlv_51= ',' ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) ) )* otherlv_53= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==59) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalXacro.g:1865:4: otherlv_48= 'useSimulatedGripperJoint' otherlv_49= '{' ( (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType ) ) (otherlv_51= ',' ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) ) )* otherlv_53= '}'
                    {
                    otherlv_48=(Token)match(input,59,FOLLOW_3); 

                    				newLeafNode(otherlv_48, grammarAccess.getTransmissionAccess().getUseSimulatedGripperJointKeyword_13_0());
                    			
                    otherlv_49=(Token)match(input,16,FOLLOW_65); 

                    				newLeafNode(otherlv_49, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalXacro.g:1873:4: ( (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType ) )
                    // InternalXacro.g:1874:5: (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType )
                    {
                    // InternalXacro.g:1874:5: (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType )
                    // InternalXacro.g:1875:6: lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType
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

                    // InternalXacro.g:1892:4: (otherlv_51= ',' ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==20) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalXacro.g:1893:5: otherlv_51= ',' ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) )
                    	    {
                    	    otherlv_51=(Token)match(input,20,FOLLOW_65); 

                    	    					newLeafNode(otherlv_51, grammarAccess.getTransmissionAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalXacro.g:1897:5: ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) )
                    	    // InternalXacro.g:1898:6: (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType )
                    	    {
                    	    // InternalXacro.g:1898:6: (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType )
                    	    // InternalXacro.g:1899:7: lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType
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
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_53=(Token)match(input,21,FOLLOW_66); 

                    				newLeafNode(otherlv_53, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:1922:3: (otherlv_54= 'actuator' otherlv_55= '{' ( (lv_actuator_56_0= ruleName ) ) (otherlv_57= ',' ( (lv_actuator_58_0= ruleName ) ) )* otherlv_59= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==60) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalXacro.g:1923:4: otherlv_54= 'actuator' otherlv_55= '{' ( (lv_actuator_56_0= ruleName ) ) (otherlv_57= ',' ( (lv_actuator_58_0= ruleName ) ) )* otherlv_59= '}'
                    {
                    otherlv_54=(Token)match(input,60,FOLLOW_3); 

                    				newLeafNode(otherlv_54, grammarAccess.getTransmissionAccess().getActuatorKeyword_14_0());
                    			
                    otherlv_55=(Token)match(input,16,FOLLOW_67); 

                    				newLeafNode(otherlv_55, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalXacro.g:1931:4: ( (lv_actuator_56_0= ruleName ) )
                    // InternalXacro.g:1932:5: (lv_actuator_56_0= ruleName )
                    {
                    // InternalXacro.g:1932:5: (lv_actuator_56_0= ruleName )
                    // InternalXacro.g:1933:6: lv_actuator_56_0= ruleName
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

                    // InternalXacro.g:1950:4: (otherlv_57= ',' ( (lv_actuator_58_0= ruleName ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==20) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalXacro.g:1951:5: otherlv_57= ',' ( (lv_actuator_58_0= ruleName ) )
                    	    {
                    	    otherlv_57=(Token)match(input,20,FOLLOW_67); 

                    	    					newLeafNode(otherlv_57, grammarAccess.getTransmissionAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalXacro.g:1955:5: ( (lv_actuator_58_0= ruleName ) )
                    	    // InternalXacro.g:1956:6: (lv_actuator_58_0= ruleName )
                    	    {
                    	    // InternalXacro.g:1956:6: (lv_actuator_58_0= ruleName )
                    	    // InternalXacro.g:1957:7: lv_actuator_58_0= ruleName
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
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_59=(Token)match(input,21,FOLLOW_68); 

                    				newLeafNode(otherlv_59, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:1980:3: (otherlv_60= 'joint' otherlv_61= '{' ( (lv_joint_62_0= ruleName ) ) (otherlv_63= ',' ( (lv_joint_64_0= ruleName ) ) )* otherlv_65= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==30) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalXacro.g:1981:4: otherlv_60= 'joint' otherlv_61= '{' ( (lv_joint_62_0= ruleName ) ) (otherlv_63= ',' ( (lv_joint_64_0= ruleName ) ) )* otherlv_65= '}'
                    {
                    otherlv_60=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_60, grammarAccess.getTransmissionAccess().getJointKeyword_15_0());
                    			
                    otherlv_61=(Token)match(input,16,FOLLOW_67); 

                    				newLeafNode(otherlv_61, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_15_1());
                    			
                    // InternalXacro.g:1989:4: ( (lv_joint_62_0= ruleName ) )
                    // InternalXacro.g:1990:5: (lv_joint_62_0= ruleName )
                    {
                    // InternalXacro.g:1990:5: (lv_joint_62_0= ruleName )
                    // InternalXacro.g:1991:6: lv_joint_62_0= ruleName
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

                    // InternalXacro.g:2008:4: (otherlv_63= ',' ( (lv_joint_64_0= ruleName ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==20) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalXacro.g:2009:5: otherlv_63= ',' ( (lv_joint_64_0= ruleName ) )
                    	    {
                    	    otherlv_63=(Token)match(input,20,FOLLOW_67); 

                    	    					newLeafNode(otherlv_63, grammarAccess.getTransmissionAccess().getCommaKeyword_15_3_0());
                    	    				
                    	    // InternalXacro.g:2013:5: ( (lv_joint_64_0= ruleName ) )
                    	    // InternalXacro.g:2014:6: (lv_joint_64_0= ruleName )
                    	    {
                    	    // InternalXacro.g:2014:6: (lv_joint_64_0= ruleName )
                    	    // InternalXacro.g:2015:7: lv_joint_64_0= ruleName
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
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_65=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_65, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_15_4());
                    			

                    }
                    break;

            }

            otherlv_66=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:2046:1: entryRulePose returns [EObject current=null] : iv_rulePose= rulePose EOF ;
    public final EObject entryRulePose() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePose = null;


        try {
            // InternalXacro.g:2046:45: (iv_rulePose= rulePose EOF )
            // InternalXacro.g:2047:2: iv_rulePose= rulePose EOF
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
    // InternalXacro.g:2053:1: rulePose returns [EObject current=null] : ( () otherlv_1= 'Pose' otherlv_2= '{' (otherlv_3= 'rpy' ( (lv_rpy_4_0= ruleEString ) ) )? (otherlv_5= 'xyz' ( (lv_xyz_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
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
            // InternalXacro.g:2059:2: ( ( () otherlv_1= 'Pose' otherlv_2= '{' (otherlv_3= 'rpy' ( (lv_rpy_4_0= ruleEString ) ) )? (otherlv_5= 'xyz' ( (lv_xyz_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalXacro.g:2060:2: ( () otherlv_1= 'Pose' otherlv_2= '{' (otherlv_3= 'rpy' ( (lv_rpy_4_0= ruleEString ) ) )? (otherlv_5= 'xyz' ( (lv_xyz_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalXacro.g:2060:2: ( () otherlv_1= 'Pose' otherlv_2= '{' (otherlv_3= 'rpy' ( (lv_rpy_4_0= ruleEString ) ) )? (otherlv_5= 'xyz' ( (lv_xyz_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalXacro.g:2061:3: () otherlv_1= 'Pose' otherlv_2= '{' (otherlv_3= 'rpy' ( (lv_rpy_4_0= ruleEString ) ) )? (otherlv_5= 'xyz' ( (lv_xyz_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalXacro.g:2061:3: ()
            // InternalXacro.g:2062:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPoseAccess().getPoseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPoseAccess().getPoseKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_69); 

            			newLeafNode(otherlv_2, grammarAccess.getPoseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:2076:3: (otherlv_3= 'rpy' ( (lv_rpy_4_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==62) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalXacro.g:2077:4: otherlv_3= 'rpy' ( (lv_rpy_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,62,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getPoseAccess().getRpyKeyword_3_0());
                    			
                    // InternalXacro.g:2081:4: ( (lv_rpy_4_0= ruleEString ) )
                    // InternalXacro.g:2082:5: (lv_rpy_4_0= ruleEString )
                    {
                    // InternalXacro.g:2082:5: (lv_rpy_4_0= ruleEString )
                    // InternalXacro.g:2083:6: lv_rpy_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPoseAccess().getRpyEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_70);
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

            // InternalXacro.g:2101:3: (otherlv_5= 'xyz' ( (lv_xyz_6_0= ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==63) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalXacro.g:2102:4: otherlv_5= 'xyz' ( (lv_xyz_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,63,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getPoseAccess().getXyzKeyword_4_0());
                    			
                    // InternalXacro.g:2106:4: ( (lv_xyz_6_0= ruleEString ) )
                    // InternalXacro.g:2107:5: (lv_xyz_6_0= ruleEString )
                    {
                    // InternalXacro.g:2107:5: (lv_xyz_6_0= ruleEString )
                    // InternalXacro.g:2108:6: lv_xyz_6_0= ruleEString
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

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:2134:1: entryRuleAxis returns [EObject current=null] : iv_ruleAxis= ruleAxis EOF ;
    public final EObject entryRuleAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxis = null;


        try {
            // InternalXacro.g:2134:45: (iv_ruleAxis= ruleAxis EOF )
            // InternalXacro.g:2135:2: iv_ruleAxis= ruleAxis EOF
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
    // InternalXacro.g:2141:1: ruleAxis returns [EObject current=null] : ( () otherlv_1= 'Axis' otherlv_2= '{' (otherlv_3= 'xyz' ( (lv_xyz_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleAxis() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_xyz_4_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:2147:2: ( ( () otherlv_1= 'Axis' otherlv_2= '{' (otherlv_3= 'xyz' ( (lv_xyz_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalXacro.g:2148:2: ( () otherlv_1= 'Axis' otherlv_2= '{' (otherlv_3= 'xyz' ( (lv_xyz_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalXacro.g:2148:2: ( () otherlv_1= 'Axis' otherlv_2= '{' (otherlv_3= 'xyz' ( (lv_xyz_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalXacro.g:2149:3: () otherlv_1= 'Axis' otherlv_2= '{' (otherlv_3= 'xyz' ( (lv_xyz_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalXacro.g:2149:3: ()
            // InternalXacro.g:2150:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAxisAccess().getAxisAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAxisAccess().getAxisKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getAxisAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:2164:3: (otherlv_3= 'xyz' ( (lv_xyz_4_0= ruleEString ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==63) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalXacro.g:2165:4: otherlv_3= 'xyz' ( (lv_xyz_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,63,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getAxisAccess().getXyzKeyword_3_0());
                    			
                    // InternalXacro.g:2169:4: ( (lv_xyz_4_0= ruleEString ) )
                    // InternalXacro.g:2170:5: (lv_xyz_4_0= ruleEString )
                    {
                    // InternalXacro.g:2170:5: (lv_xyz_4_0= ruleEString )
                    // InternalXacro.g:2171:6: lv_xyz_4_0= ruleEString
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

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:2197:1: entryRuleCalibration returns [EObject current=null] : iv_ruleCalibration= ruleCalibration EOF ;
    public final EObject entryRuleCalibration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalibration = null;


        try {
            // InternalXacro.g:2197:52: (iv_ruleCalibration= ruleCalibration EOF )
            // InternalXacro.g:2198:2: iv_ruleCalibration= ruleCalibration EOF
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
    // InternalXacro.g:2204:1: ruleCalibration returns [EObject current=null] : ( () otherlv_1= 'Calibration' otherlv_2= '{' (otherlv_3= 'falling' ( (lv_falling_4_0= ruleDouble0 ) ) )? (otherlv_5= 'referencePosition' ( (lv_referencePosition_6_0= ruleDouble0 ) ) )? (otherlv_7= 'rising' ( (lv_rising_8_0= ruleDouble0 ) ) )? otherlv_9= '}' ) ;
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
            // InternalXacro.g:2210:2: ( ( () otherlv_1= 'Calibration' otherlv_2= '{' (otherlv_3= 'falling' ( (lv_falling_4_0= ruleDouble0 ) ) )? (otherlv_5= 'referencePosition' ( (lv_referencePosition_6_0= ruleDouble0 ) ) )? (otherlv_7= 'rising' ( (lv_rising_8_0= ruleDouble0 ) ) )? otherlv_9= '}' ) )
            // InternalXacro.g:2211:2: ( () otherlv_1= 'Calibration' otherlv_2= '{' (otherlv_3= 'falling' ( (lv_falling_4_0= ruleDouble0 ) ) )? (otherlv_5= 'referencePosition' ( (lv_referencePosition_6_0= ruleDouble0 ) ) )? (otherlv_7= 'rising' ( (lv_rising_8_0= ruleDouble0 ) ) )? otherlv_9= '}' )
            {
            // InternalXacro.g:2211:2: ( () otherlv_1= 'Calibration' otherlv_2= '{' (otherlv_3= 'falling' ( (lv_falling_4_0= ruleDouble0 ) ) )? (otherlv_5= 'referencePosition' ( (lv_referencePosition_6_0= ruleDouble0 ) ) )? (otherlv_7= 'rising' ( (lv_rising_8_0= ruleDouble0 ) ) )? otherlv_9= '}' )
            // InternalXacro.g:2212:3: () otherlv_1= 'Calibration' otherlv_2= '{' (otherlv_3= 'falling' ( (lv_falling_4_0= ruleDouble0 ) ) )? (otherlv_5= 'referencePosition' ( (lv_referencePosition_6_0= ruleDouble0 ) ) )? (otherlv_7= 'rising' ( (lv_rising_8_0= ruleDouble0 ) ) )? otherlv_9= '}'
            {
            // InternalXacro.g:2212:3: ()
            // InternalXacro.g:2213:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCalibrationAccess().getCalibrationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCalibrationAccess().getCalibrationKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_71); 

            			newLeafNode(otherlv_2, grammarAccess.getCalibrationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:2227:3: (otherlv_3= 'falling' ( (lv_falling_4_0= ruleDouble0 ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==66) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalXacro.g:2228:4: otherlv_3= 'falling' ( (lv_falling_4_0= ruleDouble0 ) )
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_54); 

                    				newLeafNode(otherlv_3, grammarAccess.getCalibrationAccess().getFallingKeyword_3_0());
                    			
                    // InternalXacro.g:2232:4: ( (lv_falling_4_0= ruleDouble0 ) )
                    // InternalXacro.g:2233:5: (lv_falling_4_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2233:5: (lv_falling_4_0= ruleDouble0 )
                    // InternalXacro.g:2234:6: lv_falling_4_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getCalibrationAccess().getFallingDouble0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_72);
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

            // InternalXacro.g:2252:3: (otherlv_5= 'referencePosition' ( (lv_referencePosition_6_0= ruleDouble0 ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==67) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalXacro.g:2253:4: otherlv_5= 'referencePosition' ( (lv_referencePosition_6_0= ruleDouble0 ) )
                    {
                    otherlv_5=(Token)match(input,67,FOLLOW_54); 

                    				newLeafNode(otherlv_5, grammarAccess.getCalibrationAccess().getReferencePositionKeyword_4_0());
                    			
                    // InternalXacro.g:2257:4: ( (lv_referencePosition_6_0= ruleDouble0 ) )
                    // InternalXacro.g:2258:5: (lv_referencePosition_6_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2258:5: (lv_referencePosition_6_0= ruleDouble0 )
                    // InternalXacro.g:2259:6: lv_referencePosition_6_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getCalibrationAccess().getReferencePositionDouble0ParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_73);
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

            // InternalXacro.g:2277:3: (otherlv_7= 'rising' ( (lv_rising_8_0= ruleDouble0 ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==68) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalXacro.g:2278:4: otherlv_7= 'rising' ( (lv_rising_8_0= ruleDouble0 ) )
                    {
                    otherlv_7=(Token)match(input,68,FOLLOW_54); 

                    				newLeafNode(otherlv_7, grammarAccess.getCalibrationAccess().getRisingKeyword_5_0());
                    			
                    // InternalXacro.g:2282:4: ( (lv_rising_8_0= ruleDouble0 ) )
                    // InternalXacro.g:2283:5: (lv_rising_8_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2283:5: (lv_rising_8_0= ruleDouble0 )
                    // InternalXacro.g:2284:6: lv_rising_8_0= ruleDouble0
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

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:2310:1: entryRuleDynamics returns [EObject current=null] : iv_ruleDynamics= ruleDynamics EOF ;
    public final EObject entryRuleDynamics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamics = null;


        try {
            // InternalXacro.g:2310:49: (iv_ruleDynamics= ruleDynamics EOF )
            // InternalXacro.g:2311:2: iv_ruleDynamics= ruleDynamics EOF
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
    // InternalXacro.g:2317:1: ruleDynamics returns [EObject current=null] : ( () otherlv_1= 'Dynamics' otherlv_2= '{' (otherlv_3= 'damping' ( (lv_damping_4_0= ruleDouble0 ) ) )? (otherlv_5= 'friction' ( (lv_friction_6_0= ruleDouble0 ) ) )? otherlv_7= '}' ) ;
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
            // InternalXacro.g:2323:2: ( ( () otherlv_1= 'Dynamics' otherlv_2= '{' (otherlv_3= 'damping' ( (lv_damping_4_0= ruleDouble0 ) ) )? (otherlv_5= 'friction' ( (lv_friction_6_0= ruleDouble0 ) ) )? otherlv_7= '}' ) )
            // InternalXacro.g:2324:2: ( () otherlv_1= 'Dynamics' otherlv_2= '{' (otherlv_3= 'damping' ( (lv_damping_4_0= ruleDouble0 ) ) )? (otherlv_5= 'friction' ( (lv_friction_6_0= ruleDouble0 ) ) )? otherlv_7= '}' )
            {
            // InternalXacro.g:2324:2: ( () otherlv_1= 'Dynamics' otherlv_2= '{' (otherlv_3= 'damping' ( (lv_damping_4_0= ruleDouble0 ) ) )? (otherlv_5= 'friction' ( (lv_friction_6_0= ruleDouble0 ) ) )? otherlv_7= '}' )
            // InternalXacro.g:2325:3: () otherlv_1= 'Dynamics' otherlv_2= '{' (otherlv_3= 'damping' ( (lv_damping_4_0= ruleDouble0 ) ) )? (otherlv_5= 'friction' ( (lv_friction_6_0= ruleDouble0 ) ) )? otherlv_7= '}'
            {
            // InternalXacro.g:2325:3: ()
            // InternalXacro.g:2326:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDynamicsAccess().getDynamicsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDynamicsAccess().getDynamicsKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_74); 

            			newLeafNode(otherlv_2, grammarAccess.getDynamicsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:2340:3: (otherlv_3= 'damping' ( (lv_damping_4_0= ruleDouble0 ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==70) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalXacro.g:2341:4: otherlv_3= 'damping' ( (lv_damping_4_0= ruleDouble0 ) )
                    {
                    otherlv_3=(Token)match(input,70,FOLLOW_54); 

                    				newLeafNode(otherlv_3, grammarAccess.getDynamicsAccess().getDampingKeyword_3_0());
                    			
                    // InternalXacro.g:2345:4: ( (lv_damping_4_0= ruleDouble0 ) )
                    // InternalXacro.g:2346:5: (lv_damping_4_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2346:5: (lv_damping_4_0= ruleDouble0 )
                    // InternalXacro.g:2347:6: lv_damping_4_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getDynamicsAccess().getDampingDouble0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_75);
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

            // InternalXacro.g:2365:3: (otherlv_5= 'friction' ( (lv_friction_6_0= ruleDouble0 ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==71) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalXacro.g:2366:4: otherlv_5= 'friction' ( (lv_friction_6_0= ruleDouble0 ) )
                    {
                    otherlv_5=(Token)match(input,71,FOLLOW_54); 

                    				newLeafNode(otherlv_5, grammarAccess.getDynamicsAccess().getFrictionKeyword_4_0());
                    			
                    // InternalXacro.g:2370:4: ( (lv_friction_6_0= ruleDouble0 ) )
                    // InternalXacro.g:2371:5: (lv_friction_6_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2371:5: (lv_friction_6_0= ruleDouble0 )
                    // InternalXacro.g:2372:6: lv_friction_6_0= ruleDouble0
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

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:2398:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // InternalXacro.g:2398:46: (iv_ruleLimit= ruleLimit EOF )
            // InternalXacro.g:2399:2: iv_ruleLimit= ruleLimit EOF
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
    // InternalXacro.g:2405:1: ruleLimit returns [EObject current=null] : ( () otherlv_1= 'Limit' otherlv_2= '{' (otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) ) )? (otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) ) )? (otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) ) )? (otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) ) )? otherlv_11= '}' ) ;
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
            // InternalXacro.g:2411:2: ( ( () otherlv_1= 'Limit' otherlv_2= '{' (otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) ) )? (otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) ) )? (otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) ) )? (otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) ) )? otherlv_11= '}' ) )
            // InternalXacro.g:2412:2: ( () otherlv_1= 'Limit' otherlv_2= '{' (otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) ) )? (otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) ) )? (otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) ) )? (otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) ) )? otherlv_11= '}' )
            {
            // InternalXacro.g:2412:2: ( () otherlv_1= 'Limit' otherlv_2= '{' (otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) ) )? (otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) ) )? (otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) ) )? (otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) ) )? otherlv_11= '}' )
            // InternalXacro.g:2413:3: () otherlv_1= 'Limit' otherlv_2= '{' (otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) ) )? (otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) ) )? (otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) ) )? (otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) ) )? otherlv_11= '}'
            {
            // InternalXacro.g:2413:3: ()
            // InternalXacro.g:2414:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLimitAccess().getLimitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLimitAccess().getLimitKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_76); 

            			newLeafNode(otherlv_2, grammarAccess.getLimitAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:2428:3: (otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==73) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalXacro.g:2429:4: otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) )
                    {
                    otherlv_3=(Token)match(input,73,FOLLOW_54); 

                    				newLeafNode(otherlv_3, grammarAccess.getLimitAccess().getEffortKeyword_3_0());
                    			
                    // InternalXacro.g:2433:4: ( (lv_effort_4_0= ruleDouble0 ) )
                    // InternalXacro.g:2434:5: (lv_effort_4_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2434:5: (lv_effort_4_0= ruleDouble0 )
                    // InternalXacro.g:2435:6: lv_effort_4_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getLimitAccess().getEffortDouble0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_77);
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

            // InternalXacro.g:2453:3: (otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==74) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalXacro.g:2454:4: otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) )
                    {
                    otherlv_5=(Token)match(input,74,FOLLOW_54); 

                    				newLeafNode(otherlv_5, grammarAccess.getLimitAccess().getLowerKeyword_4_0());
                    			
                    // InternalXacro.g:2458:4: ( (lv_lower_6_0= ruleDouble0 ) )
                    // InternalXacro.g:2459:5: (lv_lower_6_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2459:5: (lv_lower_6_0= ruleDouble0 )
                    // InternalXacro.g:2460:6: lv_lower_6_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getLimitAccess().getLowerDouble0ParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_78);
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

            // InternalXacro.g:2478:3: (otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==75) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalXacro.g:2479:4: otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) )
                    {
                    otherlv_7=(Token)match(input,75,FOLLOW_54); 

                    				newLeafNode(otherlv_7, grammarAccess.getLimitAccess().getUpperKeyword_5_0());
                    			
                    // InternalXacro.g:2483:4: ( (lv_upper_8_0= ruleDouble0 ) )
                    // InternalXacro.g:2484:5: (lv_upper_8_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2484:5: (lv_upper_8_0= ruleDouble0 )
                    // InternalXacro.g:2485:6: lv_upper_8_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getLimitAccess().getUpperDouble0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_79);
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

            // InternalXacro.g:2503:3: (otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==76) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalXacro.g:2504:4: otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) )
                    {
                    otherlv_9=(Token)match(input,76,FOLLOW_54); 

                    				newLeafNode(otherlv_9, grammarAccess.getLimitAccess().getVelocityKeyword_6_0());
                    			
                    // InternalXacro.g:2508:4: ( (lv_velocity_10_0= ruleDouble0 ) )
                    // InternalXacro.g:2509:5: (lv_velocity_10_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2509:5: (lv_velocity_10_0= ruleDouble0 )
                    // InternalXacro.g:2510:6: lv_velocity_10_0= ruleDouble0
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

            otherlv_11=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:2536:1: entryRuleSafetyController returns [EObject current=null] : iv_ruleSafetyController= ruleSafetyController EOF ;
    public final EObject entryRuleSafetyController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSafetyController = null;


        try {
            // InternalXacro.g:2536:57: (iv_ruleSafetyController= ruleSafetyController EOF )
            // InternalXacro.g:2537:2: iv_ruleSafetyController= ruleSafetyController EOF
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
    // InternalXacro.g:2543:1: ruleSafetyController returns [EObject current=null] : (otherlv_0= 'SafetyController' otherlv_1= '{' (otherlv_2= 'kPosition' ( (lv_kPosition_3_0= ruleDouble0 ) ) )? otherlv_4= 'kVelocity' ( (lv_kVelocity_5_0= ruleDouble0 ) ) (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleDouble0 ) ) )? (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleDouble0 ) ) )? otherlv_10= '}' ) ;
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
            // InternalXacro.g:2549:2: ( (otherlv_0= 'SafetyController' otherlv_1= '{' (otherlv_2= 'kPosition' ( (lv_kPosition_3_0= ruleDouble0 ) ) )? otherlv_4= 'kVelocity' ( (lv_kVelocity_5_0= ruleDouble0 ) ) (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleDouble0 ) ) )? (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleDouble0 ) ) )? otherlv_10= '}' ) )
            // InternalXacro.g:2550:2: (otherlv_0= 'SafetyController' otherlv_1= '{' (otherlv_2= 'kPosition' ( (lv_kPosition_3_0= ruleDouble0 ) ) )? otherlv_4= 'kVelocity' ( (lv_kVelocity_5_0= ruleDouble0 ) ) (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleDouble0 ) ) )? (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleDouble0 ) ) )? otherlv_10= '}' )
            {
            // InternalXacro.g:2550:2: (otherlv_0= 'SafetyController' otherlv_1= '{' (otherlv_2= 'kPosition' ( (lv_kPosition_3_0= ruleDouble0 ) ) )? otherlv_4= 'kVelocity' ( (lv_kVelocity_5_0= ruleDouble0 ) ) (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleDouble0 ) ) )? (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleDouble0 ) ) )? otherlv_10= '}' )
            // InternalXacro.g:2551:3: otherlv_0= 'SafetyController' otherlv_1= '{' (otherlv_2= 'kPosition' ( (lv_kPosition_3_0= ruleDouble0 ) ) )? otherlv_4= 'kVelocity' ( (lv_kVelocity_5_0= ruleDouble0 ) ) (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleDouble0 ) ) )? (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleDouble0 ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSafetyControllerAccess().getSafetyControllerKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_80); 

            			newLeafNode(otherlv_1, grammarAccess.getSafetyControllerAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXacro.g:2559:3: (otherlv_2= 'kPosition' ( (lv_kPosition_3_0= ruleDouble0 ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==78) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalXacro.g:2560:4: otherlv_2= 'kPosition' ( (lv_kPosition_3_0= ruleDouble0 ) )
                    {
                    otherlv_2=(Token)match(input,78,FOLLOW_54); 

                    				newLeafNode(otherlv_2, grammarAccess.getSafetyControllerAccess().getKPositionKeyword_2_0());
                    			
                    // InternalXacro.g:2564:4: ( (lv_kPosition_3_0= ruleDouble0 ) )
                    // InternalXacro.g:2565:5: (lv_kPosition_3_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2565:5: (lv_kPosition_3_0= ruleDouble0 )
                    // InternalXacro.g:2566:6: lv_kPosition_3_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getSafetyControllerAccess().getKPositionDouble0ParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_81);
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

            otherlv_4=(Token)match(input,79,FOLLOW_54); 

            			newLeafNode(otherlv_4, grammarAccess.getSafetyControllerAccess().getKVelocityKeyword_3());
            		
            // InternalXacro.g:2588:3: ( (lv_kVelocity_5_0= ruleDouble0 ) )
            // InternalXacro.g:2589:4: (lv_kVelocity_5_0= ruleDouble0 )
            {
            // InternalXacro.g:2589:4: (lv_kVelocity_5_0= ruleDouble0 )
            // InternalXacro.g:2590:5: lv_kVelocity_5_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getSafetyControllerAccess().getKVelocityDouble0ParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_82);
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

            // InternalXacro.g:2607:3: (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleDouble0 ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==80) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalXacro.g:2608:4: otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleDouble0 ) )
                    {
                    otherlv_6=(Token)match(input,80,FOLLOW_54); 

                    				newLeafNode(otherlv_6, grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_5_0());
                    			
                    // InternalXacro.g:2612:4: ( (lv_softLowerLimit_7_0= ruleDouble0 ) )
                    // InternalXacro.g:2613:5: (lv_softLowerLimit_7_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2613:5: (lv_softLowerLimit_7_0= ruleDouble0 )
                    // InternalXacro.g:2614:6: lv_softLowerLimit_7_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitDouble0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_83);
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

            // InternalXacro.g:2632:3: (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleDouble0 ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==81) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalXacro.g:2633:4: otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleDouble0 ) )
                    {
                    otherlv_8=(Token)match(input,81,FOLLOW_54); 

                    				newLeafNode(otherlv_8, grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_6_0());
                    			
                    // InternalXacro.g:2637:4: ( (lv_softUpperLimit_9_0= ruleDouble0 ) )
                    // InternalXacro.g:2638:5: (lv_softUpperLimit_9_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2638:5: (lv_softUpperLimit_9_0= ruleDouble0 )
                    // InternalXacro.g:2639:6: lv_softUpperLimit_9_0= ruleDouble0
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

            otherlv_10=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:2665:1: entryRuleMimic returns [EObject current=null] : iv_ruleMimic= ruleMimic EOF ;
    public final EObject entryRuleMimic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMimic = null;


        try {
            // InternalXacro.g:2665:46: (iv_ruleMimic= ruleMimic EOF )
            // InternalXacro.g:2666:2: iv_ruleMimic= ruleMimic EOF
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
    // InternalXacro.g:2672:1: ruleMimic returns [EObject current=null] : (otherlv_0= 'Mimic' otherlv_1= '{' otherlv_2= 'joint' ( (lv_joint_3_0= ruleEString ) ) (otherlv_4= 'multiplier' ( (lv_multiplier_5_0= ruleDouble0 ) ) )? (otherlv_6= 'offset' ( (lv_offset_7_0= ruleDouble0 ) ) )? otherlv_8= '}' ) ;
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
            // InternalXacro.g:2678:2: ( (otherlv_0= 'Mimic' otherlv_1= '{' otherlv_2= 'joint' ( (lv_joint_3_0= ruleEString ) ) (otherlv_4= 'multiplier' ( (lv_multiplier_5_0= ruleDouble0 ) ) )? (otherlv_6= 'offset' ( (lv_offset_7_0= ruleDouble0 ) ) )? otherlv_8= '}' ) )
            // InternalXacro.g:2679:2: (otherlv_0= 'Mimic' otherlv_1= '{' otherlv_2= 'joint' ( (lv_joint_3_0= ruleEString ) ) (otherlv_4= 'multiplier' ( (lv_multiplier_5_0= ruleDouble0 ) ) )? (otherlv_6= 'offset' ( (lv_offset_7_0= ruleDouble0 ) ) )? otherlv_8= '}' )
            {
            // InternalXacro.g:2679:2: (otherlv_0= 'Mimic' otherlv_1= '{' otherlv_2= 'joint' ( (lv_joint_3_0= ruleEString ) ) (otherlv_4= 'multiplier' ( (lv_multiplier_5_0= ruleDouble0 ) ) )? (otherlv_6= 'offset' ( (lv_offset_7_0= ruleDouble0 ) ) )? otherlv_8= '}' )
            // InternalXacro.g:2680:3: otherlv_0= 'Mimic' otherlv_1= '{' otherlv_2= 'joint' ( (lv_joint_3_0= ruleEString ) ) (otherlv_4= 'multiplier' ( (lv_multiplier_5_0= ruleDouble0 ) ) )? (otherlv_6= 'offset' ( (lv_offset_7_0= ruleDouble0 ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMimicAccess().getMimicKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_84); 

            			newLeafNode(otherlv_1, grammarAccess.getMimicAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMimicAccess().getJointKeyword_2());
            		
            // InternalXacro.g:2692:3: ( (lv_joint_3_0= ruleEString ) )
            // InternalXacro.g:2693:4: (lv_joint_3_0= ruleEString )
            {
            // InternalXacro.g:2693:4: (lv_joint_3_0= ruleEString )
            // InternalXacro.g:2694:5: lv_joint_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMimicAccess().getJointEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_85);
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

            // InternalXacro.g:2711:3: (otherlv_4= 'multiplier' ( (lv_multiplier_5_0= ruleDouble0 ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==83) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalXacro.g:2712:4: otherlv_4= 'multiplier' ( (lv_multiplier_5_0= ruleDouble0 ) )
                    {
                    otherlv_4=(Token)match(input,83,FOLLOW_54); 

                    				newLeafNode(otherlv_4, grammarAccess.getMimicAccess().getMultiplierKeyword_4_0());
                    			
                    // InternalXacro.g:2716:4: ( (lv_multiplier_5_0= ruleDouble0 ) )
                    // InternalXacro.g:2717:5: (lv_multiplier_5_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2717:5: (lv_multiplier_5_0= ruleDouble0 )
                    // InternalXacro.g:2718:6: lv_multiplier_5_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getMimicAccess().getMultiplierDouble0ParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_86);
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

            // InternalXacro.g:2736:3: (otherlv_6= 'offset' ( (lv_offset_7_0= ruleDouble0 ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==84) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalXacro.g:2737:4: otherlv_6= 'offset' ( (lv_offset_7_0= ruleDouble0 ) )
                    {
                    otherlv_6=(Token)match(input,84,FOLLOW_54); 

                    				newLeafNode(otherlv_6, grammarAccess.getMimicAccess().getOffsetKeyword_5_0());
                    			
                    // InternalXacro.g:2741:4: ( (lv_offset_7_0= ruleDouble0 ) )
                    // InternalXacro.g:2742:5: (lv_offset_7_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2742:5: (lv_offset_7_0= ruleDouble0 )
                    // InternalXacro.g:2743:6: lv_offset_7_0= ruleDouble0
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

            otherlv_8=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:2769:1: entryRuleInertial returns [EObject current=null] : iv_ruleInertial= ruleInertial EOF ;
    public final EObject entryRuleInertial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertial = null;


        try {
            // InternalXacro.g:2769:49: (iv_ruleInertial= ruleInertial EOF )
            // InternalXacro.g:2770:2: iv_ruleInertial= ruleInertial EOF
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
    // InternalXacro.g:2776:1: ruleInertial returns [EObject current=null] : ( () otherlv_1= 'Inertial' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )? (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )? otherlv_9= '}' ) ;
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
            // InternalXacro.g:2782:2: ( ( () otherlv_1= 'Inertial' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )? (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )? otherlv_9= '}' ) )
            // InternalXacro.g:2783:2: ( () otherlv_1= 'Inertial' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )? (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )? otherlv_9= '}' )
            {
            // InternalXacro.g:2783:2: ( () otherlv_1= 'Inertial' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )? (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )? otherlv_9= '}' )
            // InternalXacro.g:2784:3: () otherlv_1= 'Inertial' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )? (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )? otherlv_9= '}'
            {
            // InternalXacro.g:2784:3: ()
            // InternalXacro.g:2785:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInertialAccess().getInertialAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,85,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInertialAccess().getInertialKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_87); 

            			newLeafNode(otherlv_2, grammarAccess.getInertialAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:2799:3: (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==37) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalXacro.g:2800:4: otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_29); 

                    				newLeafNode(otherlv_3, grammarAccess.getInertialAccess().getOriginKeyword_3_0());
                    			
                    // InternalXacro.g:2804:4: ( (lv_origin_4_0= rulePose ) )
                    // InternalXacro.g:2805:5: (lv_origin_4_0= rulePose )
                    {
                    // InternalXacro.g:2805:5: (lv_origin_4_0= rulePose )
                    // InternalXacro.g:2806:6: lv_origin_4_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getInertialAccess().getOriginPoseParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_88);
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

            // InternalXacro.g:2824:3: (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==86) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalXacro.g:2825:4: otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) )
                    {
                    otherlv_5=(Token)match(input,86,FOLLOW_89); 

                    				newLeafNode(otherlv_5, grammarAccess.getInertialAccess().getMassKeyword_4_0());
                    			
                    // InternalXacro.g:2829:4: ( (lv_mass_6_0= ruleMass ) )
                    // InternalXacro.g:2830:5: (lv_mass_6_0= ruleMass )
                    {
                    // InternalXacro.g:2830:5: (lv_mass_6_0= ruleMass )
                    // InternalXacro.g:2831:6: lv_mass_6_0= ruleMass
                    {

                    						newCompositeNode(grammarAccess.getInertialAccess().getMassMassParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_90);
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

            // InternalXacro.g:2849:3: (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==87) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalXacro.g:2850:4: otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) )
                    {
                    otherlv_7=(Token)match(input,87,FOLLOW_91); 

                    				newLeafNode(otherlv_7, grammarAccess.getInertialAccess().getInertiaKeyword_5_0());
                    			
                    // InternalXacro.g:2854:4: ( (lv_inertia_8_0= ruleInertia ) )
                    // InternalXacro.g:2855:5: (lv_inertia_8_0= ruleInertia )
                    {
                    // InternalXacro.g:2855:5: (lv_inertia_8_0= ruleInertia )
                    // InternalXacro.g:2856:6: lv_inertia_8_0= ruleInertia
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

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:2882:1: entryRuleVisual returns [EObject current=null] : iv_ruleVisual= ruleVisual EOF ;
    public final EObject entryRuleVisual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisual = null;


        try {
            // InternalXacro.g:2882:47: (iv_ruleVisual= ruleVisual EOF )
            // InternalXacro.g:2883:2: iv_ruleVisual= ruleVisual EOF
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
    // InternalXacro.g:2889:1: ruleVisual returns [EObject current=null] : (otherlv_0= 'Visual' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) (otherlv_6= 'material' ( (lv_material_7_0= ruleMaterial ) ) )? otherlv_8= '}' ) ;
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
            // InternalXacro.g:2895:2: ( (otherlv_0= 'Visual' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) (otherlv_6= 'material' ( (lv_material_7_0= ruleMaterial ) ) )? otherlv_8= '}' ) )
            // InternalXacro.g:2896:2: (otherlv_0= 'Visual' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) (otherlv_6= 'material' ( (lv_material_7_0= ruleMaterial ) ) )? otherlv_8= '}' )
            {
            // InternalXacro.g:2896:2: (otherlv_0= 'Visual' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) (otherlv_6= 'material' ( (lv_material_7_0= ruleMaterial ) ) )? otherlv_8= '}' )
            // InternalXacro.g:2897:3: otherlv_0= 'Visual' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) (otherlv_6= 'material' ( (lv_material_7_0= ruleMaterial ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,88,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVisualAccess().getVisualKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_92); 

            			newLeafNode(otherlv_1, grammarAccess.getVisualAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXacro.g:2905:3: (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==37) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalXacro.g:2906:4: otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) )
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_29); 

                    				newLeafNode(otherlv_2, grammarAccess.getVisualAccess().getOriginKeyword_2_0());
                    			
                    // InternalXacro.g:2910:4: ( (lv_origin_3_0= rulePose ) )
                    // InternalXacro.g:2911:5: (lv_origin_3_0= rulePose )
                    {
                    // InternalXacro.g:2911:5: (lv_origin_3_0= rulePose )
                    // InternalXacro.g:2912:6: lv_origin_3_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getVisualAccess().getOriginPoseParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_93);
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

            otherlv_4=(Token)match(input,89,FOLLOW_94); 

            			newLeafNode(otherlv_4, grammarAccess.getVisualAccess().getGeometryKeyword_3());
            		
            // InternalXacro.g:2934:3: ( (lv_geometry_5_0= ruleGeometry ) )
            // InternalXacro.g:2935:4: (lv_geometry_5_0= ruleGeometry )
            {
            // InternalXacro.g:2935:4: (lv_geometry_5_0= ruleGeometry )
            // InternalXacro.g:2936:5: lv_geometry_5_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_95);
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

            // InternalXacro.g:2953:3: (otherlv_6= 'material' ( (lv_material_7_0= ruleMaterial ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==31) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalXacro.g:2954:4: otherlv_6= 'material' ( (lv_material_7_0= ruleMaterial ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_96); 

                    				newLeafNode(otherlv_6, grammarAccess.getVisualAccess().getMaterialKeyword_5_0());
                    			
                    // InternalXacro.g:2958:4: ( (lv_material_7_0= ruleMaterial ) )
                    // InternalXacro.g:2959:5: (lv_material_7_0= ruleMaterial )
                    {
                    // InternalXacro.g:2959:5: (lv_material_7_0= ruleMaterial )
                    // InternalXacro.g:2960:6: lv_material_7_0= ruleMaterial
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

            otherlv_8=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:2986:1: entryRuleCollision returns [EObject current=null] : iv_ruleCollision= ruleCollision EOF ;
    public final EObject entryRuleCollision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollision = null;


        try {
            // InternalXacro.g:2986:50: (iv_ruleCollision= ruleCollision EOF )
            // InternalXacro.g:2987:2: iv_ruleCollision= ruleCollision EOF
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
    // InternalXacro.g:2993:1: ruleCollision returns [EObject current=null] : (otherlv_0= 'Collision' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'origin' ( (lv_origin_5_0= rulePose ) ) )? otherlv_6= 'geometry' ( (lv_geometry_7_0= ruleGeometry ) ) (otherlv_8= 'verbose' ( (lv_verbose_9_0= ruleVerbose ) ) )? otherlv_10= '}' ) ;
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
            // InternalXacro.g:2999:2: ( (otherlv_0= 'Collision' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'origin' ( (lv_origin_5_0= rulePose ) ) )? otherlv_6= 'geometry' ( (lv_geometry_7_0= ruleGeometry ) ) (otherlv_8= 'verbose' ( (lv_verbose_9_0= ruleVerbose ) ) )? otherlv_10= '}' ) )
            // InternalXacro.g:3000:2: (otherlv_0= 'Collision' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'origin' ( (lv_origin_5_0= rulePose ) ) )? otherlv_6= 'geometry' ( (lv_geometry_7_0= ruleGeometry ) ) (otherlv_8= 'verbose' ( (lv_verbose_9_0= ruleVerbose ) ) )? otherlv_10= '}' )
            {
            // InternalXacro.g:3000:2: (otherlv_0= 'Collision' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'origin' ( (lv_origin_5_0= rulePose ) ) )? otherlv_6= 'geometry' ( (lv_geometry_7_0= ruleGeometry ) ) (otherlv_8= 'verbose' ( (lv_verbose_9_0= ruleVerbose ) ) )? otherlv_10= '}' )
            // InternalXacro.g:3001:3: otherlv_0= 'Collision' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'origin' ( (lv_origin_5_0= rulePose ) ) )? otherlv_6= 'geometry' ( (lv_geometry_7_0= ruleGeometry ) ) (otherlv_8= 'verbose' ( (lv_verbose_9_0= ruleVerbose ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCollisionAccess().getCollisionKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_97); 

            			newLeafNode(otherlv_1, grammarAccess.getCollisionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXacro.g:3009:3: (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==17) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalXacro.g:3010:4: otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getCollisionAccess().getNameKeyword_2_0());
                    			
                    // InternalXacro.g:3014:4: ( (lv_name_3_0= ruleEString ) )
                    // InternalXacro.g:3015:5: (lv_name_3_0= ruleEString )
                    {
                    // InternalXacro.g:3015:5: (lv_name_3_0= ruleEString )
                    // InternalXacro.g:3016:6: lv_name_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCollisionAccess().getNameEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_92);
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

            // InternalXacro.g:3034:3: (otherlv_4= 'origin' ( (lv_origin_5_0= rulePose ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==37) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalXacro.g:3035:4: otherlv_4= 'origin' ( (lv_origin_5_0= rulePose ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_29); 

                    				newLeafNode(otherlv_4, grammarAccess.getCollisionAccess().getOriginKeyword_3_0());
                    			
                    // InternalXacro.g:3039:4: ( (lv_origin_5_0= rulePose ) )
                    // InternalXacro.g:3040:5: (lv_origin_5_0= rulePose )
                    {
                    // InternalXacro.g:3040:5: (lv_origin_5_0= rulePose )
                    // InternalXacro.g:3041:6: lv_origin_5_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getCollisionAccess().getOriginPoseParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_93);
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

            otherlv_6=(Token)match(input,89,FOLLOW_94); 

            			newLeafNode(otherlv_6, grammarAccess.getCollisionAccess().getGeometryKeyword_4());
            		
            // InternalXacro.g:3063:3: ( (lv_geometry_7_0= ruleGeometry ) )
            // InternalXacro.g:3064:4: (lv_geometry_7_0= ruleGeometry )
            {
            // InternalXacro.g:3064:4: (lv_geometry_7_0= ruleGeometry )
            // InternalXacro.g:3065:5: lv_geometry_7_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_98);
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

            // InternalXacro.g:3082:3: (otherlv_8= 'verbose' ( (lv_verbose_9_0= ruleVerbose ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==91) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalXacro.g:3083:4: otherlv_8= 'verbose' ( (lv_verbose_9_0= ruleVerbose ) )
                    {
                    otherlv_8=(Token)match(input,91,FOLLOW_99); 

                    				newLeafNode(otherlv_8, grammarAccess.getCollisionAccess().getVerboseKeyword_6_0());
                    			
                    // InternalXacro.g:3087:4: ( (lv_verbose_9_0= ruleVerbose ) )
                    // InternalXacro.g:3088:5: (lv_verbose_9_0= ruleVerbose )
                    {
                    // InternalXacro.g:3088:5: (lv_verbose_9_0= ruleVerbose )
                    // InternalXacro.g:3089:6: lv_verbose_9_0= ruleVerbose
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

            otherlv_10=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:3115:1: entryRuleMass returns [EObject current=null] : iv_ruleMass= ruleMass EOF ;
    public final EObject entryRuleMass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMass = null;


        try {
            // InternalXacro.g:3115:45: (iv_ruleMass= ruleMass EOF )
            // InternalXacro.g:3116:2: iv_ruleMass= ruleMass EOF
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
    // InternalXacro.g:3122:1: ruleMass returns [EObject current=null] : ( () otherlv_1= 'Mass' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleMass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:3128:2: ( ( () otherlv_1= 'Mass' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )? otherlv_5= '}' ) )
            // InternalXacro.g:3129:2: ( () otherlv_1= 'Mass' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )? otherlv_5= '}' )
            {
            // InternalXacro.g:3129:2: ( () otherlv_1= 'Mass' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )? otherlv_5= '}' )
            // InternalXacro.g:3130:3: () otherlv_1= 'Mass' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )? otherlv_5= '}'
            {
            // InternalXacro.g:3130:3: ()
            // InternalXacro.g:3131:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMassAccess().getMassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,92,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMassAccess().getMassKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getMassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:3145:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==27) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalXacro.g:3146:4: otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_54); 

                    				newLeafNode(otherlv_3, grammarAccess.getMassAccess().getValueKeyword_3_0());
                    			
                    // InternalXacro.g:3150:4: ( (lv_value_4_0= ruleDouble0 ) )
                    // InternalXacro.g:3151:5: (lv_value_4_0= ruleDouble0 )
                    {
                    // InternalXacro.g:3151:5: (lv_value_4_0= ruleDouble0 )
                    // InternalXacro.g:3152:6: lv_value_4_0= ruleDouble0
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

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:3178:1: entryRuleInertia returns [EObject current=null] : iv_ruleInertia= ruleInertia EOF ;
    public final EObject entryRuleInertia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertia = null;


        try {
            // InternalXacro.g:3178:48: (iv_ruleInertia= ruleInertia EOF )
            // InternalXacro.g:3179:2: iv_ruleInertia= ruleInertia EOF
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
    // InternalXacro.g:3185:1: ruleInertia returns [EObject current=null] : ( () otherlv_1= 'Inertia' otherlv_2= '{' (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )? (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )? (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )? (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )? (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )? (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )? otherlv_15= '}' ) ;
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
            // InternalXacro.g:3191:2: ( ( () otherlv_1= 'Inertia' otherlv_2= '{' (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )? (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )? (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )? (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )? (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )? (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )? otherlv_15= '}' ) )
            // InternalXacro.g:3192:2: ( () otherlv_1= 'Inertia' otherlv_2= '{' (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )? (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )? (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )? (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )? (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )? (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )? otherlv_15= '}' )
            {
            // InternalXacro.g:3192:2: ( () otherlv_1= 'Inertia' otherlv_2= '{' (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )? (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )? (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )? (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )? (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )? (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )? otherlv_15= '}' )
            // InternalXacro.g:3193:3: () otherlv_1= 'Inertia' otherlv_2= '{' (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )? (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )? (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )? (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )? (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )? (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )? otherlv_15= '}'
            {
            // InternalXacro.g:3193:3: ()
            // InternalXacro.g:3194:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInertiaAccess().getInertiaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,93,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInertiaAccess().getInertiaKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_100); 

            			newLeafNode(otherlv_2, grammarAccess.getInertiaAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:3208:3: (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==94) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalXacro.g:3209:4: otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) )
                    {
                    otherlv_3=(Token)match(input,94,FOLLOW_54); 

                    				newLeafNode(otherlv_3, grammarAccess.getInertiaAccess().getIxxKeyword_3_0());
                    			
                    // InternalXacro.g:3213:4: ( (lv_ixx_4_0= ruleDouble0 ) )
                    // InternalXacro.g:3214:5: (lv_ixx_4_0= ruleDouble0 )
                    {
                    // InternalXacro.g:3214:5: (lv_ixx_4_0= ruleDouble0 )
                    // InternalXacro.g:3215:6: lv_ixx_4_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIxxDouble0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_101);
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

            // InternalXacro.g:3233:3: (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==95) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalXacro.g:3234:4: otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) )
                    {
                    otherlv_5=(Token)match(input,95,FOLLOW_54); 

                    				newLeafNode(otherlv_5, grammarAccess.getInertiaAccess().getIxyKeyword_4_0());
                    			
                    // InternalXacro.g:3238:4: ( (lv_ixy_6_0= ruleDouble0 ) )
                    // InternalXacro.g:3239:5: (lv_ixy_6_0= ruleDouble0 )
                    {
                    // InternalXacro.g:3239:5: (lv_ixy_6_0= ruleDouble0 )
                    // InternalXacro.g:3240:6: lv_ixy_6_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIxyDouble0ParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_102);
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

            // InternalXacro.g:3258:3: (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==96) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalXacro.g:3259:4: otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) )
                    {
                    otherlv_7=(Token)match(input,96,FOLLOW_54); 

                    				newLeafNode(otherlv_7, grammarAccess.getInertiaAccess().getIxzKeyword_5_0());
                    			
                    // InternalXacro.g:3263:4: ( (lv_ixz_8_0= ruleDouble0 ) )
                    // InternalXacro.g:3264:5: (lv_ixz_8_0= ruleDouble0 )
                    {
                    // InternalXacro.g:3264:5: (lv_ixz_8_0= ruleDouble0 )
                    // InternalXacro.g:3265:6: lv_ixz_8_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIxzDouble0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_103);
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

            // InternalXacro.g:3283:3: (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==97) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalXacro.g:3284:4: otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) )
                    {
                    otherlv_9=(Token)match(input,97,FOLLOW_54); 

                    				newLeafNode(otherlv_9, grammarAccess.getInertiaAccess().getIyyKeyword_6_0());
                    			
                    // InternalXacro.g:3288:4: ( (lv_iyy_10_0= ruleDouble0 ) )
                    // InternalXacro.g:3289:5: (lv_iyy_10_0= ruleDouble0 )
                    {
                    // InternalXacro.g:3289:5: (lv_iyy_10_0= ruleDouble0 )
                    // InternalXacro.g:3290:6: lv_iyy_10_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIyyDouble0ParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_104);
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

            // InternalXacro.g:3308:3: (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==98) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalXacro.g:3309:4: otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) )
                    {
                    otherlv_11=(Token)match(input,98,FOLLOW_54); 

                    				newLeafNode(otherlv_11, grammarAccess.getInertiaAccess().getIyzKeyword_7_0());
                    			
                    // InternalXacro.g:3313:4: ( (lv_iyz_12_0= ruleDouble0 ) )
                    // InternalXacro.g:3314:5: (lv_iyz_12_0= ruleDouble0 )
                    {
                    // InternalXacro.g:3314:5: (lv_iyz_12_0= ruleDouble0 )
                    // InternalXacro.g:3315:6: lv_iyz_12_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIyzDouble0ParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_105);
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

            // InternalXacro.g:3333:3: (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==99) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalXacro.g:3334:4: otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) )
                    {
                    otherlv_13=(Token)match(input,99,FOLLOW_54); 

                    				newLeafNode(otherlv_13, grammarAccess.getInertiaAccess().getIzzKeyword_8_0());
                    			
                    // InternalXacro.g:3338:4: ( (lv_izz_14_0= ruleDouble0 ) )
                    // InternalXacro.g:3339:5: (lv_izz_14_0= ruleDouble0 )
                    {
                    // InternalXacro.g:3339:5: (lv_izz_14_0= ruleDouble0 )
                    // InternalXacro.g:3340:6: lv_izz_14_0= ruleDouble0
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

            otherlv_15=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:3366:1: entryRuleGeometry returns [EObject current=null] : iv_ruleGeometry= ruleGeometry EOF ;
    public final EObject entryRuleGeometry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeometry = null;


        try {
            // InternalXacro.g:3366:49: (iv_ruleGeometry= ruleGeometry EOF )
            // InternalXacro.g:3367:2: iv_ruleGeometry= ruleGeometry EOF
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
    // InternalXacro.g:3373:1: ruleGeometry returns [EObject current=null] : ( () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )? (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )? otherlv_11= '}' ) ;
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
            // InternalXacro.g:3379:2: ( ( () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )? (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )? otherlv_11= '}' ) )
            // InternalXacro.g:3380:2: ( () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )? (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )? otherlv_11= '}' )
            {
            // InternalXacro.g:3380:2: ( () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )? (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )? otherlv_11= '}' )
            // InternalXacro.g:3381:3: () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )? (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )? otherlv_11= '}'
            {
            // InternalXacro.g:3381:3: ()
            // InternalXacro.g:3382:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGeometryAccess().getGeometryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,100,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGeometryAccess().getGeometryKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_106); 

            			newLeafNode(otherlv_2, grammarAccess.getGeometryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:3396:3: (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==101) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalXacro.g:3397:4: otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) )
                    {
                    otherlv_3=(Token)match(input,101,FOLLOW_107); 

                    				newLeafNode(otherlv_3, grammarAccess.getGeometryAccess().getBoxKeyword_3_0());
                    			
                    // InternalXacro.g:3401:4: ( (lv_box_4_0= ruleBox ) )
                    // InternalXacro.g:3402:5: (lv_box_4_0= ruleBox )
                    {
                    // InternalXacro.g:3402:5: (lv_box_4_0= ruleBox )
                    // InternalXacro.g:3403:6: lv_box_4_0= ruleBox
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getBoxBoxParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_108);
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

            // InternalXacro.g:3421:3: (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==102) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalXacro.g:3422:4: otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) )
                    {
                    otherlv_5=(Token)match(input,102,FOLLOW_109); 

                    				newLeafNode(otherlv_5, grammarAccess.getGeometryAccess().getCylinderKeyword_4_0());
                    			
                    // InternalXacro.g:3426:4: ( (lv_cylinder_6_0= ruleCylinder ) )
                    // InternalXacro.g:3427:5: (lv_cylinder_6_0= ruleCylinder )
                    {
                    // InternalXacro.g:3427:5: (lv_cylinder_6_0= ruleCylinder )
                    // InternalXacro.g:3428:6: lv_cylinder_6_0= ruleCylinder
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getCylinderCylinderParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_110);
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

            // InternalXacro.g:3446:3: (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==103) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalXacro.g:3447:4: otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) )
                    {
                    otherlv_7=(Token)match(input,103,FOLLOW_111); 

                    				newLeafNode(otherlv_7, grammarAccess.getGeometryAccess().getSphereKeyword_5_0());
                    			
                    // InternalXacro.g:3451:4: ( (lv_sphere_8_0= ruleSphere ) )
                    // InternalXacro.g:3452:5: (lv_sphere_8_0= ruleSphere )
                    {
                    // InternalXacro.g:3452:5: (lv_sphere_8_0= ruleSphere )
                    // InternalXacro.g:3453:6: lv_sphere_8_0= ruleSphere
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getSphereSphereParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_112);
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

            // InternalXacro.g:3471:3: (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==104) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalXacro.g:3472:4: otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) )
                    {
                    otherlv_9=(Token)match(input,104,FOLLOW_113); 

                    				newLeafNode(otherlv_9, grammarAccess.getGeometryAccess().getMeshKeyword_6_0());
                    			
                    // InternalXacro.g:3476:4: ( (lv_mesh_10_0= ruleMesh ) )
                    // InternalXacro.g:3477:5: (lv_mesh_10_0= ruleMesh )
                    {
                    // InternalXacro.g:3477:5: (lv_mesh_10_0= ruleMesh )
                    // InternalXacro.g:3478:6: lv_mesh_10_0= ruleMesh
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

            otherlv_11=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:3504:1: entryRuleMaterial returns [EObject current=null] : iv_ruleMaterial= ruleMaterial EOF ;
    public final EObject entryRuleMaterial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaterial = null;


        try {
            // InternalXacro.g:3504:49: (iv_ruleMaterial= ruleMaterial EOF )
            // InternalXacro.g:3505:2: iv_ruleMaterial= ruleMaterial EOF
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
    // InternalXacro.g:3511:1: ruleMaterial returns [EObject current=null] : ( () otherlv_1= 'Material' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'color' ( (lv_color_6_0= ruleColor ) ) )? (otherlv_7= 'texture' ( (lv_texture_8_0= ruleTexture ) ) )? otherlv_9= '}' ) ;
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
            // InternalXacro.g:3517:2: ( ( () otherlv_1= 'Material' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'color' ( (lv_color_6_0= ruleColor ) ) )? (otherlv_7= 'texture' ( (lv_texture_8_0= ruleTexture ) ) )? otherlv_9= '}' ) )
            // InternalXacro.g:3518:2: ( () otherlv_1= 'Material' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'color' ( (lv_color_6_0= ruleColor ) ) )? (otherlv_7= 'texture' ( (lv_texture_8_0= ruleTexture ) ) )? otherlv_9= '}' )
            {
            // InternalXacro.g:3518:2: ( () otherlv_1= 'Material' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'color' ( (lv_color_6_0= ruleColor ) ) )? (otherlv_7= 'texture' ( (lv_texture_8_0= ruleTexture ) ) )? otherlv_9= '}' )
            // InternalXacro.g:3519:3: () otherlv_1= 'Material' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'color' ( (lv_color_6_0= ruleColor ) ) )? (otherlv_7= 'texture' ( (lv_texture_8_0= ruleTexture ) ) )? otherlv_9= '}'
            {
            // InternalXacro.g:3519:3: ()
            // InternalXacro.g:3520:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMaterialAccess().getMaterialAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,105,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMaterialAccess().getMaterialKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_114); 

            			newLeafNode(otherlv_2, grammarAccess.getMaterialAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:3534:3: (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==17) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalXacro.g:3535:4: otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getMaterialAccess().getNameKeyword_3_0());
                    			
                    // InternalXacro.g:3539:4: ( (lv_name_4_0= ruleEString ) )
                    // InternalXacro.g:3540:5: (lv_name_4_0= ruleEString )
                    {
                    // InternalXacro.g:3540:5: (lv_name_4_0= ruleEString )
                    // InternalXacro.g:3541:6: lv_name_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMaterialAccess().getNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_49);
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

            // InternalXacro.g:3559:3: (otherlv_5= 'color' ( (lv_color_6_0= ruleColor ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==49) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalXacro.g:3560:4: otherlv_5= 'color' ( (lv_color_6_0= ruleColor ) )
                    {
                    otherlv_5=(Token)match(input,49,FOLLOW_50); 

                    				newLeafNode(otherlv_5, grammarAccess.getMaterialAccess().getColorKeyword_4_0());
                    			
                    // InternalXacro.g:3564:4: ( (lv_color_6_0= ruleColor ) )
                    // InternalXacro.g:3565:5: (lv_color_6_0= ruleColor )
                    {
                    // InternalXacro.g:3565:5: (lv_color_6_0= ruleColor )
                    // InternalXacro.g:3566:6: lv_color_6_0= ruleColor
                    {

                    						newCompositeNode(grammarAccess.getMaterialAccess().getColorColorParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_51);
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

            // InternalXacro.g:3584:3: (otherlv_7= 'texture' ( (lv_texture_8_0= ruleTexture ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==50) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalXacro.g:3585:4: otherlv_7= 'texture' ( (lv_texture_8_0= ruleTexture ) )
                    {
                    otherlv_7=(Token)match(input,50,FOLLOW_52); 

                    				newLeafNode(otherlv_7, grammarAccess.getMaterialAccess().getTextureKeyword_5_0());
                    			
                    // InternalXacro.g:3589:4: ( (lv_texture_8_0= ruleTexture ) )
                    // InternalXacro.g:3590:5: (lv_texture_8_0= ruleTexture )
                    {
                    // InternalXacro.g:3590:5: (lv_texture_8_0= ruleTexture )
                    // InternalXacro.g:3591:6: lv_texture_8_0= ruleTexture
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

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:3617:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // InternalXacro.g:3617:44: (iv_ruleBox= ruleBox EOF )
            // InternalXacro.g:3618:2: iv_ruleBox= ruleBox EOF
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
    // InternalXacro.g:3624:1: ruleBox returns [EObject current=null] : ( () otherlv_1= 'Box' otherlv_2= '{' (otherlv_3= 'size' ( (lv_size_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_size_4_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:3630:2: ( ( () otherlv_1= 'Box' otherlv_2= '{' (otherlv_3= 'size' ( (lv_size_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalXacro.g:3631:2: ( () otherlv_1= 'Box' otherlv_2= '{' (otherlv_3= 'size' ( (lv_size_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalXacro.g:3631:2: ( () otherlv_1= 'Box' otherlv_2= '{' (otherlv_3= 'size' ( (lv_size_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalXacro.g:3632:3: () otherlv_1= 'Box' otherlv_2= '{' (otherlv_3= 'size' ( (lv_size_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalXacro.g:3632:3: ()
            // InternalXacro.g:3633:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoxAccess().getBoxAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,106,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBoxAccess().getBoxKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_115); 

            			newLeafNode(otherlv_2, grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:3647:3: (otherlv_3= 'size' ( (lv_size_4_0= ruleEString ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==107) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalXacro.g:3648:4: otherlv_3= 'size' ( (lv_size_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,107,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getBoxAccess().getSizeKeyword_3_0());
                    			
                    // InternalXacro.g:3652:4: ( (lv_size_4_0= ruleEString ) )
                    // InternalXacro.g:3653:5: (lv_size_4_0= ruleEString )
                    {
                    // InternalXacro.g:3653:5: (lv_size_4_0= ruleEString )
                    // InternalXacro.g:3654:6: lv_size_4_0= ruleEString
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

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:3680:1: entryRuleCylinder returns [EObject current=null] : iv_ruleCylinder= ruleCylinder EOF ;
    public final EObject entryRuleCylinder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCylinder = null;


        try {
            // InternalXacro.g:3680:49: (iv_ruleCylinder= ruleCylinder EOF )
            // InternalXacro.g:3681:2: iv_ruleCylinder= ruleCylinder EOF
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
    // InternalXacro.g:3687:1: ruleCylinder returns [EObject current=null] : (otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}' ) ;
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
            // InternalXacro.g:3693:2: ( (otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}' ) )
            // InternalXacro.g:3694:2: (otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}' )
            {
            // InternalXacro.g:3694:2: (otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}' )
            // InternalXacro.g:3695:3: otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,108,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCylinderAccess().getCylinderKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_116); 

            			newLeafNode(otherlv_1, grammarAccess.getCylinderAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,109,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getCylinderAccess().getLengthKeyword_2());
            		
            // InternalXacro.g:3707:3: ( (lv_length_3_0= ruleDouble0 ) )
            // InternalXacro.g:3708:4: (lv_length_3_0= ruleDouble0 )
            {
            // InternalXacro.g:3708:4: (lv_length_3_0= ruleDouble0 )
            // InternalXacro.g:3709:5: lv_length_3_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getCylinderAccess().getLengthDouble0ParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_117);
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

            otherlv_4=(Token)match(input,110,FOLLOW_54); 

            			newLeafNode(otherlv_4, grammarAccess.getCylinderAccess().getRadiusKeyword_4());
            		
            // InternalXacro.g:3730:3: ( (lv_radius_5_0= ruleDouble0 ) )
            // InternalXacro.g:3731:4: (lv_radius_5_0= ruleDouble0 )
            {
            // InternalXacro.g:3731:4: (lv_radius_5_0= ruleDouble0 )
            // InternalXacro.g:3732:5: lv_radius_5_0= ruleDouble0
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

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:3757:1: entryRuleSphere returns [EObject current=null] : iv_ruleSphere= ruleSphere EOF ;
    public final EObject entryRuleSphere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSphere = null;


        try {
            // InternalXacro.g:3757:47: (iv_ruleSphere= ruleSphere EOF )
            // InternalXacro.g:3758:2: iv_ruleSphere= ruleSphere EOF
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
    // InternalXacro.g:3764:1: ruleSphere returns [EObject current=null] : (otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}' ) ;
    public final EObject ruleSphere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_radius_3_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:3770:2: ( (otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}' ) )
            // InternalXacro.g:3771:2: (otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}' )
            {
            // InternalXacro.g:3771:2: (otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}' )
            // InternalXacro.g:3772:3: otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,111,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSphereAccess().getSphereKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_117); 

            			newLeafNode(otherlv_1, grammarAccess.getSphereAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,110,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getSphereAccess().getRadiusKeyword_2());
            		
            // InternalXacro.g:3784:3: ( (lv_radius_3_0= ruleDouble0 ) )
            // InternalXacro.g:3785:4: (lv_radius_3_0= ruleDouble0 )
            {
            // InternalXacro.g:3785:4: (lv_radius_3_0= ruleDouble0 )
            // InternalXacro.g:3786:5: lv_radius_3_0= ruleDouble0
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:3811:1: entryRuleMesh returns [EObject current=null] : iv_ruleMesh= ruleMesh EOF ;
    public final EObject entryRuleMesh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMesh = null;


        try {
            // InternalXacro.g:3811:45: (iv_ruleMesh= ruleMesh EOF )
            // InternalXacro.g:3812:2: iv_ruleMesh= ruleMesh EOF
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
    // InternalXacro.g:3818:1: ruleMesh returns [EObject current=null] : (otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= ruleAnyURI ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
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
            // InternalXacro.g:3824:2: ( (otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= ruleAnyURI ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalXacro.g:3825:2: (otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= ruleAnyURI ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalXacro.g:3825:2: (otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= ruleAnyURI ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalXacro.g:3826:3: otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= ruleAnyURI ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,112,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMeshAccess().getMeshKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_118); 

            			newLeafNode(otherlv_1, grammarAccess.getMeshAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,113,FOLLOW_119); 

            			newLeafNode(otherlv_2, grammarAccess.getMeshAccess().getFilenameKeyword_2());
            		
            // InternalXacro.g:3838:3: ( (lv_filename_3_0= ruleAnyURI ) )
            // InternalXacro.g:3839:4: (lv_filename_3_0= ruleAnyURI )
            {
            // InternalXacro.g:3839:4: (lv_filename_3_0= ruleAnyURI )
            // InternalXacro.g:3840:5: lv_filename_3_0= ruleAnyURI
            {

            					newCompositeNode(grammarAccess.getMeshAccess().getFilenameAnyURIParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_120);
            lv_filename_3_0=ruleAnyURI();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeshRule());
            					}
            					set(
            						current,
            						"filename",
            						lv_filename_3_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.AnyURI");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXacro.g:3857:3: (otherlv_4= 'scale' ( (lv_scale_5_0= ruleEString ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==114) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalXacro.g:3858:4: otherlv_4= 'scale' ( (lv_scale_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,114,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getMeshAccess().getScaleKeyword_4_0());
                    			
                    // InternalXacro.g:3862:4: ( (lv_scale_5_0= ruleEString ) )
                    // InternalXacro.g:3863:5: (lv_scale_5_0= ruleEString )
                    {
                    // InternalXacro.g:3863:5: (lv_scale_5_0= ruleEString )
                    // InternalXacro.g:3864:6: lv_scale_5_0= ruleEString
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

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:3890:1: entryRuleAnyURI returns [String current=null] : iv_ruleAnyURI= ruleAnyURI EOF ;
    public final String entryRuleAnyURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnyURI = null;


        try {
            // InternalXacro.g:3890:46: (iv_ruleAnyURI= ruleAnyURI EOF )
            // InternalXacro.g:3891:2: iv_ruleAnyURI= ruleAnyURI EOF
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
    // InternalXacro.g:3897:1: ruleAnyURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'AnyURI' ;
    public final AntlrDatatypeRuleToken ruleAnyURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXacro.g:3903:2: (kw= 'AnyURI' )
            // InternalXacro.g:3904:2: kw= 'AnyURI'
            {
            kw=(Token)match(input,115,FOLLOW_2); 

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
    // InternalXacro.g:3912:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalXacro.g:3912:46: (iv_ruleColor= ruleColor EOF )
            // InternalXacro.g:3913:2: iv_ruleColor= ruleColor EOF
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
    // InternalXacro.g:3919:1: ruleColor returns [EObject current=null] : ( () otherlv_1= 'Color' otherlv_2= '{' (otherlv_3= 'rgba' ( (lv_rgba_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_rgba_4_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:3925:2: ( ( () otherlv_1= 'Color' otherlv_2= '{' (otherlv_3= 'rgba' ( (lv_rgba_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalXacro.g:3926:2: ( () otherlv_1= 'Color' otherlv_2= '{' (otherlv_3= 'rgba' ( (lv_rgba_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalXacro.g:3926:2: ( () otherlv_1= 'Color' otherlv_2= '{' (otherlv_3= 'rgba' ( (lv_rgba_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalXacro.g:3927:3: () otherlv_1= 'Color' otherlv_2= '{' (otherlv_3= 'rgba' ( (lv_rgba_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalXacro.g:3927:3: ()
            // InternalXacro.g:3928:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColorAccess().getColorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,116,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getColorAccess().getColorKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_121); 

            			newLeafNode(otherlv_2, grammarAccess.getColorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:3942:3: (otherlv_3= 'rgba' ( (lv_rgba_4_0= ruleEString ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==117) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalXacro.g:3943:4: otherlv_3= 'rgba' ( (lv_rgba_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,117,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getColorAccess().getRgbaKeyword_3_0());
                    			
                    // InternalXacro.g:3947:4: ( (lv_rgba_4_0= ruleEString ) )
                    // InternalXacro.g:3948:5: (lv_rgba_4_0= ruleEString )
                    {
                    // InternalXacro.g:3948:5: (lv_rgba_4_0= ruleEString )
                    // InternalXacro.g:3949:6: lv_rgba_4_0= ruleEString
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

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:3975:1: entryRuleTexture returns [EObject current=null] : iv_ruleTexture= ruleTexture EOF ;
    public final EObject entryRuleTexture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTexture = null;


        try {
            // InternalXacro.g:3975:48: (iv_ruleTexture= ruleTexture EOF )
            // InternalXacro.g:3976:2: iv_ruleTexture= ruleTexture EOF
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
    // InternalXacro.g:3982:1: ruleTexture returns [EObject current=null] : ( () otherlv_1= 'Texture' otherlv_2= '{' (otherlv_3= 'filename' ( (lv_filename_4_0= ruleAnyURI ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleTexture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_filename_4_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:3988:2: ( ( () otherlv_1= 'Texture' otherlv_2= '{' (otherlv_3= 'filename' ( (lv_filename_4_0= ruleAnyURI ) ) )? otherlv_5= '}' ) )
            // InternalXacro.g:3989:2: ( () otherlv_1= 'Texture' otherlv_2= '{' (otherlv_3= 'filename' ( (lv_filename_4_0= ruleAnyURI ) ) )? otherlv_5= '}' )
            {
            // InternalXacro.g:3989:2: ( () otherlv_1= 'Texture' otherlv_2= '{' (otherlv_3= 'filename' ( (lv_filename_4_0= ruleAnyURI ) ) )? otherlv_5= '}' )
            // InternalXacro.g:3990:3: () otherlv_1= 'Texture' otherlv_2= '{' (otherlv_3= 'filename' ( (lv_filename_4_0= ruleAnyURI ) ) )? otherlv_5= '}'
            {
            // InternalXacro.g:3990:3: ()
            // InternalXacro.g:3991:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextureAccess().getTextureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,118,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTextureAccess().getTextureKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_122); 

            			newLeafNode(otherlv_2, grammarAccess.getTextureAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:4005:3: (otherlv_3= 'filename' ( (lv_filename_4_0= ruleAnyURI ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==113) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalXacro.g:4006:4: otherlv_3= 'filename' ( (lv_filename_4_0= ruleAnyURI ) )
                    {
                    otherlv_3=(Token)match(input,113,FOLLOW_119); 

                    				newLeafNode(otherlv_3, grammarAccess.getTextureAccess().getFilenameKeyword_3_0());
                    			
                    // InternalXacro.g:4010:4: ( (lv_filename_4_0= ruleAnyURI ) )
                    // InternalXacro.g:4011:5: (lv_filename_4_0= ruleAnyURI )
                    {
                    // InternalXacro.g:4011:5: (lv_filename_4_0= ruleAnyURI )
                    // InternalXacro.g:4012:6: lv_filename_4_0= ruleAnyURI
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

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:4038:1: entryRuleVerbose returns [EObject current=null] : iv_ruleVerbose= ruleVerbose EOF ;
    public final EObject entryRuleVerbose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerbose = null;


        try {
            // InternalXacro.g:4038:48: (iv_ruleVerbose= ruleVerbose EOF )
            // InternalXacro.g:4039:2: iv_ruleVerbose= ruleVerbose EOF
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
    // InternalXacro.g:4045:1: ruleVerbose returns [EObject current=null] : ( () otherlv_1= 'Verbose' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleVerbose() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:4051:2: ( ( () otherlv_1= 'Verbose' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalXacro.g:4052:2: ( () otherlv_1= 'Verbose' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalXacro.g:4052:2: ( () otherlv_1= 'Verbose' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalXacro.g:4053:3: () otherlv_1= 'Verbose' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalXacro.g:4053:3: ()
            // InternalXacro.g:4054:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVerboseAccess().getVerboseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,119,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVerboseAccess().getVerboseKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getVerboseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:4068:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==27) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalXacro.g:4069:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getVerboseAccess().getValueKeyword_3_0());
                    			
                    // InternalXacro.g:4073:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalXacro.g:4074:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalXacro.g:4074:5: (lv_value_4_0= ruleEString )
                    // InternalXacro.g:4075:6: lv_value_4_0= ruleEString
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

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:4101:1: entryRuleActuatorTransmission returns [EObject current=null] : iv_ruleActuatorTransmission= ruleActuatorTransmission EOF ;
    public final EObject entryRuleActuatorTransmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuatorTransmission = null;


        try {
            // InternalXacro.g:4101:61: (iv_ruleActuatorTransmission= ruleActuatorTransmission EOF )
            // InternalXacro.g:4102:2: iv_ruleActuatorTransmission= ruleActuatorTransmission EOF
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
    // InternalXacro.g:4108:1: ruleActuatorTransmission returns [EObject current=null] : (otherlv_0= 'ActuatorTransmission' otherlv_1= '{' otherlv_2= 'mechanicalReduction' ( (lv_mechanicalReduction_3_0= ruleDouble0 ) ) otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '}' ) ;
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
            // InternalXacro.g:4114:2: ( (otherlv_0= 'ActuatorTransmission' otherlv_1= '{' otherlv_2= 'mechanicalReduction' ( (lv_mechanicalReduction_3_0= ruleDouble0 ) ) otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '}' ) )
            // InternalXacro.g:4115:2: (otherlv_0= 'ActuatorTransmission' otherlv_1= '{' otherlv_2= 'mechanicalReduction' ( (lv_mechanicalReduction_3_0= ruleDouble0 ) ) otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '}' )
            {
            // InternalXacro.g:4115:2: (otherlv_0= 'ActuatorTransmission' otherlv_1= '{' otherlv_2= 'mechanicalReduction' ( (lv_mechanicalReduction_3_0= ruleDouble0 ) ) otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '}' )
            // InternalXacro.g:4116:3: otherlv_0= 'ActuatorTransmission' otherlv_1= '{' otherlv_2= 'mechanicalReduction' ( (lv_mechanicalReduction_3_0= ruleDouble0 ) ) otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,120,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActuatorTransmissionAccess().getActuatorTransmissionKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_123); 

            			newLeafNode(otherlv_1, grammarAccess.getActuatorTransmissionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,52,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getActuatorTransmissionAccess().getMechanicalReductionKeyword_2());
            		
            // InternalXacro.g:4128:3: ( (lv_mechanicalReduction_3_0= ruleDouble0 ) )
            // InternalXacro.g:4129:4: (lv_mechanicalReduction_3_0= ruleDouble0 )
            {
            // InternalXacro.g:4129:4: (lv_mechanicalReduction_3_0= ruleDouble0 )
            // InternalXacro.g:4130:5: lv_mechanicalReduction_3_0= ruleDouble0
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

            otherlv_4=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getActuatorTransmissionAccess().getNameKeyword_4());
            		
            // InternalXacro.g:4151:3: ( (lv_name_5_0= ruleEString ) )
            // InternalXacro.g:4152:4: (lv_name_5_0= ruleEString )
            {
            // InternalXacro.g:4152:4: (lv_name_5_0= ruleEString )
            // InternalXacro.g:4153:5: lv_name_5_0= ruleEString
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

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:4178:1: entryRuleGapJointTransmission returns [EObject current=null] : iv_ruleGapJointTransmission= ruleGapJointTransmission EOF ;
    public final EObject entryRuleGapJointTransmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGapJointTransmission = null;


        try {
            // InternalXacro.g:4178:61: (iv_ruleGapJointTransmission= ruleGapJointTransmission EOF )
            // InternalXacro.g:4179:2: iv_ruleGapJointTransmission= ruleGapJointTransmission EOF
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
    // InternalXacro.g:4185:1: ruleGapJointTransmission returns [EObject current=null] : (otherlv_0= 'GapJointTransmission' otherlv_1= '{' otherlv_2= 'a' ( (lv_a_3_0= ruleDouble0 ) ) otherlv_4= 'b' ( (lv_b_5_0= ruleDouble0 ) ) otherlv_6= 'gearRatio' ( (lv_gearRatio_7_0= ruleDouble0 ) ) otherlv_8= 'h' ( (lv_h_9_0= ruleDouble0 ) ) otherlv_10= 'l0' ( (lv_l0_11_0= ruleDouble0 ) ) otherlv_12= 'mechanicalReduction' ( (lv_mechanicalReduction_13_0= ruleDouble0 ) ) otherlv_14= 'name' ( (lv_name_15_0= ruleEString ) ) otherlv_16= 'phi0' ( (lv_phi0_17_0= ruleDouble0 ) ) otherlv_18= 'r' ( (lv_r_19_0= ruleDouble0 ) ) otherlv_20= 'screwReduction' ( (lv_screwReduction_21_0= ruleDouble0 ) ) otherlv_22= 't0' ( (lv_t0_23_0= ruleDouble0 ) ) otherlv_24= 'theta0' ( (lv_theta0_25_0= ruleDouble0 ) ) otherlv_26= '}' ) ;
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
            // InternalXacro.g:4191:2: ( (otherlv_0= 'GapJointTransmission' otherlv_1= '{' otherlv_2= 'a' ( (lv_a_3_0= ruleDouble0 ) ) otherlv_4= 'b' ( (lv_b_5_0= ruleDouble0 ) ) otherlv_6= 'gearRatio' ( (lv_gearRatio_7_0= ruleDouble0 ) ) otherlv_8= 'h' ( (lv_h_9_0= ruleDouble0 ) ) otherlv_10= 'l0' ( (lv_l0_11_0= ruleDouble0 ) ) otherlv_12= 'mechanicalReduction' ( (lv_mechanicalReduction_13_0= ruleDouble0 ) ) otherlv_14= 'name' ( (lv_name_15_0= ruleEString ) ) otherlv_16= 'phi0' ( (lv_phi0_17_0= ruleDouble0 ) ) otherlv_18= 'r' ( (lv_r_19_0= ruleDouble0 ) ) otherlv_20= 'screwReduction' ( (lv_screwReduction_21_0= ruleDouble0 ) ) otherlv_22= 't0' ( (lv_t0_23_0= ruleDouble0 ) ) otherlv_24= 'theta0' ( (lv_theta0_25_0= ruleDouble0 ) ) otherlv_26= '}' ) )
            // InternalXacro.g:4192:2: (otherlv_0= 'GapJointTransmission' otherlv_1= '{' otherlv_2= 'a' ( (lv_a_3_0= ruleDouble0 ) ) otherlv_4= 'b' ( (lv_b_5_0= ruleDouble0 ) ) otherlv_6= 'gearRatio' ( (lv_gearRatio_7_0= ruleDouble0 ) ) otherlv_8= 'h' ( (lv_h_9_0= ruleDouble0 ) ) otherlv_10= 'l0' ( (lv_l0_11_0= ruleDouble0 ) ) otherlv_12= 'mechanicalReduction' ( (lv_mechanicalReduction_13_0= ruleDouble0 ) ) otherlv_14= 'name' ( (lv_name_15_0= ruleEString ) ) otherlv_16= 'phi0' ( (lv_phi0_17_0= ruleDouble0 ) ) otherlv_18= 'r' ( (lv_r_19_0= ruleDouble0 ) ) otherlv_20= 'screwReduction' ( (lv_screwReduction_21_0= ruleDouble0 ) ) otherlv_22= 't0' ( (lv_t0_23_0= ruleDouble0 ) ) otherlv_24= 'theta0' ( (lv_theta0_25_0= ruleDouble0 ) ) otherlv_26= '}' )
            {
            // InternalXacro.g:4192:2: (otherlv_0= 'GapJointTransmission' otherlv_1= '{' otherlv_2= 'a' ( (lv_a_3_0= ruleDouble0 ) ) otherlv_4= 'b' ( (lv_b_5_0= ruleDouble0 ) ) otherlv_6= 'gearRatio' ( (lv_gearRatio_7_0= ruleDouble0 ) ) otherlv_8= 'h' ( (lv_h_9_0= ruleDouble0 ) ) otherlv_10= 'l0' ( (lv_l0_11_0= ruleDouble0 ) ) otherlv_12= 'mechanicalReduction' ( (lv_mechanicalReduction_13_0= ruleDouble0 ) ) otherlv_14= 'name' ( (lv_name_15_0= ruleEString ) ) otherlv_16= 'phi0' ( (lv_phi0_17_0= ruleDouble0 ) ) otherlv_18= 'r' ( (lv_r_19_0= ruleDouble0 ) ) otherlv_20= 'screwReduction' ( (lv_screwReduction_21_0= ruleDouble0 ) ) otherlv_22= 't0' ( (lv_t0_23_0= ruleDouble0 ) ) otherlv_24= 'theta0' ( (lv_theta0_25_0= ruleDouble0 ) ) otherlv_26= '}' )
            // InternalXacro.g:4193:3: otherlv_0= 'GapJointTransmission' otherlv_1= '{' otherlv_2= 'a' ( (lv_a_3_0= ruleDouble0 ) ) otherlv_4= 'b' ( (lv_b_5_0= ruleDouble0 ) ) otherlv_6= 'gearRatio' ( (lv_gearRatio_7_0= ruleDouble0 ) ) otherlv_8= 'h' ( (lv_h_9_0= ruleDouble0 ) ) otherlv_10= 'l0' ( (lv_l0_11_0= ruleDouble0 ) ) otherlv_12= 'mechanicalReduction' ( (lv_mechanicalReduction_13_0= ruleDouble0 ) ) otherlv_14= 'name' ( (lv_name_15_0= ruleEString ) ) otherlv_16= 'phi0' ( (lv_phi0_17_0= ruleDouble0 ) ) otherlv_18= 'r' ( (lv_r_19_0= ruleDouble0 ) ) otherlv_20= 'screwReduction' ( (lv_screwReduction_21_0= ruleDouble0 ) ) otherlv_22= 't0' ( (lv_t0_23_0= ruleDouble0 ) ) otherlv_24= 'theta0' ( (lv_theta0_25_0= ruleDouble0 ) ) otherlv_26= '}'
            {
            otherlv_0=(Token)match(input,121,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGapJointTransmissionAccess().getGapJointTransmissionKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_124); 

            			newLeafNode(otherlv_1, grammarAccess.getGapJointTransmissionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,122,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getGapJointTransmissionAccess().getAKeyword_2());
            		
            // InternalXacro.g:4205:3: ( (lv_a_3_0= ruleDouble0 ) )
            // InternalXacro.g:4206:4: (lv_a_3_0= ruleDouble0 )
            {
            // InternalXacro.g:4206:4: (lv_a_3_0= ruleDouble0 )
            // InternalXacro.g:4207:5: lv_a_3_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getADouble0ParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_125);
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

            otherlv_4=(Token)match(input,123,FOLLOW_54); 

            			newLeafNode(otherlv_4, grammarAccess.getGapJointTransmissionAccess().getBKeyword_4());
            		
            // InternalXacro.g:4228:3: ( (lv_b_5_0= ruleDouble0 ) )
            // InternalXacro.g:4229:4: (lv_b_5_0= ruleDouble0 )
            {
            // InternalXacro.g:4229:4: (lv_b_5_0= ruleDouble0 )
            // InternalXacro.g:4230:5: lv_b_5_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getBDouble0ParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_126);
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

            otherlv_6=(Token)match(input,124,FOLLOW_54); 

            			newLeafNode(otherlv_6, grammarAccess.getGapJointTransmissionAccess().getGearRatioKeyword_6());
            		
            // InternalXacro.g:4251:3: ( (lv_gearRatio_7_0= ruleDouble0 ) )
            // InternalXacro.g:4252:4: (lv_gearRatio_7_0= ruleDouble0 )
            {
            // InternalXacro.g:4252:4: (lv_gearRatio_7_0= ruleDouble0 )
            // InternalXacro.g:4253:5: lv_gearRatio_7_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getGearRatioDouble0ParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_127);
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

            otherlv_8=(Token)match(input,125,FOLLOW_54); 

            			newLeafNode(otherlv_8, grammarAccess.getGapJointTransmissionAccess().getHKeyword_8());
            		
            // InternalXacro.g:4274:3: ( (lv_h_9_0= ruleDouble0 ) )
            // InternalXacro.g:4275:4: (lv_h_9_0= ruleDouble0 )
            {
            // InternalXacro.g:4275:4: (lv_h_9_0= ruleDouble0 )
            // InternalXacro.g:4276:5: lv_h_9_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getHDouble0ParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_128);
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

            otherlv_10=(Token)match(input,126,FOLLOW_54); 

            			newLeafNode(otherlv_10, grammarAccess.getGapJointTransmissionAccess().getL0Keyword_10());
            		
            // InternalXacro.g:4297:3: ( (lv_l0_11_0= ruleDouble0 ) )
            // InternalXacro.g:4298:4: (lv_l0_11_0= ruleDouble0 )
            {
            // InternalXacro.g:4298:4: (lv_l0_11_0= ruleDouble0 )
            // InternalXacro.g:4299:5: lv_l0_11_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getL0Double0ParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_123);
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

            otherlv_12=(Token)match(input,52,FOLLOW_54); 

            			newLeafNode(otherlv_12, grammarAccess.getGapJointTransmissionAccess().getMechanicalReductionKeyword_12());
            		
            // InternalXacro.g:4320:3: ( (lv_mechanicalReduction_13_0= ruleDouble0 ) )
            // InternalXacro.g:4321:4: (lv_mechanicalReduction_13_0= ruleDouble0 )
            {
            // InternalXacro.g:4321:4: (lv_mechanicalReduction_13_0= ruleDouble0 )
            // InternalXacro.g:4322:5: lv_mechanicalReduction_13_0= ruleDouble0
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

            otherlv_14=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_14, grammarAccess.getGapJointTransmissionAccess().getNameKeyword_14());
            		
            // InternalXacro.g:4343:3: ( (lv_name_15_0= ruleEString ) )
            // InternalXacro.g:4344:4: (lv_name_15_0= ruleEString )
            {
            // InternalXacro.g:4344:4: (lv_name_15_0= ruleEString )
            // InternalXacro.g:4345:5: lv_name_15_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getNameEStringParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_129);
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

            otherlv_16=(Token)match(input,127,FOLLOW_54); 

            			newLeafNode(otherlv_16, grammarAccess.getGapJointTransmissionAccess().getPhi0Keyword_16());
            		
            // InternalXacro.g:4366:3: ( (lv_phi0_17_0= ruleDouble0 ) )
            // InternalXacro.g:4367:4: (lv_phi0_17_0= ruleDouble0 )
            {
            // InternalXacro.g:4367:4: (lv_phi0_17_0= ruleDouble0 )
            // InternalXacro.g:4368:5: lv_phi0_17_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getPhi0Double0ParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_130);
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

            otherlv_18=(Token)match(input,128,FOLLOW_54); 

            			newLeafNode(otherlv_18, grammarAccess.getGapJointTransmissionAccess().getRKeyword_18());
            		
            // InternalXacro.g:4389:3: ( (lv_r_19_0= ruleDouble0 ) )
            // InternalXacro.g:4390:4: (lv_r_19_0= ruleDouble0 )
            {
            // InternalXacro.g:4390:4: (lv_r_19_0= ruleDouble0 )
            // InternalXacro.g:4391:5: lv_r_19_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getRDouble0ParserRuleCall_19_0());
            				
            pushFollow(FOLLOW_131);
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

            otherlv_20=(Token)match(input,129,FOLLOW_54); 

            			newLeafNode(otherlv_20, grammarAccess.getGapJointTransmissionAccess().getScrewReductionKeyword_20());
            		
            // InternalXacro.g:4412:3: ( (lv_screwReduction_21_0= ruleDouble0 ) )
            // InternalXacro.g:4413:4: (lv_screwReduction_21_0= ruleDouble0 )
            {
            // InternalXacro.g:4413:4: (lv_screwReduction_21_0= ruleDouble0 )
            // InternalXacro.g:4414:5: lv_screwReduction_21_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getScrewReductionDouble0ParserRuleCall_21_0());
            				
            pushFollow(FOLLOW_132);
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

            otherlv_22=(Token)match(input,130,FOLLOW_54); 

            			newLeafNode(otherlv_22, grammarAccess.getGapJointTransmissionAccess().getT0Keyword_22());
            		
            // InternalXacro.g:4435:3: ( (lv_t0_23_0= ruleDouble0 ) )
            // InternalXacro.g:4436:4: (lv_t0_23_0= ruleDouble0 )
            {
            // InternalXacro.g:4436:4: (lv_t0_23_0= ruleDouble0 )
            // InternalXacro.g:4437:5: lv_t0_23_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getT0Double0ParserRuleCall_23_0());
            				
            pushFollow(FOLLOW_133);
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

            otherlv_24=(Token)match(input,131,FOLLOW_54); 

            			newLeafNode(otherlv_24, grammarAccess.getGapJointTransmissionAccess().getTheta0Keyword_24());
            		
            // InternalXacro.g:4458:3: ( (lv_theta0_25_0= ruleDouble0 ) )
            // InternalXacro.g:4459:4: (lv_theta0_25_0= ruleDouble0 )
            {
            // InternalXacro.g:4459:4: (lv_theta0_25_0= ruleDouble0 )
            // InternalXacro.g:4460:5: lv_theta0_25_0= ruleDouble0
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

            otherlv_26=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:4485:1: entryRulePassiveJointTransmission returns [EObject current=null] : iv_rulePassiveJointTransmission= rulePassiveJointTransmission EOF ;
    public final EObject entryRulePassiveJointTransmission() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePassiveJointTransmission = null;


        try {
            // InternalXacro.g:4485:65: (iv_rulePassiveJointTransmission= rulePassiveJointTransmission EOF )
            // InternalXacro.g:4486:2: iv_rulePassiveJointTransmission= rulePassiveJointTransmission EOF
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
    // InternalXacro.g:4492:1: rulePassiveJointTransmission returns [EObject current=null] : (otherlv_0= 'PassiveJointTransmission' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject rulePassiveJointTransmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:4498:2: ( (otherlv_0= 'PassiveJointTransmission' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // InternalXacro.g:4499:2: (otherlv_0= 'PassiveJointTransmission' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // InternalXacro.g:4499:2: (otherlv_0= 'PassiveJointTransmission' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '}' )
            // InternalXacro.g:4500:3: otherlv_0= 'PassiveJointTransmission' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,132,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPassiveJointTransmissionAccess().getPassiveJointTransmissionKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPassiveJointTransmissionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPassiveJointTransmissionAccess().getNameKeyword_2());
            		
            // InternalXacro.g:4512:3: ( (lv_name_3_0= ruleEString ) )
            // InternalXacro.g:4513:4: (lv_name_3_0= ruleEString )
            {
            // InternalXacro.g:4513:4: (lv_name_3_0= ruleEString )
            // InternalXacro.g:4514:5: lv_name_3_0= ruleEString
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:4539:1: entryRuleUseSimulatedGripperJointType returns [EObject current=null] : iv_ruleUseSimulatedGripperJointType= ruleUseSimulatedGripperJointType EOF ;
    public final EObject entryRuleUseSimulatedGripperJointType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseSimulatedGripperJointType = null;


        try {
            // InternalXacro.g:4539:69: (iv_ruleUseSimulatedGripperJointType= ruleUseSimulatedGripperJointType EOF )
            // InternalXacro.g:4540:2: iv_ruleUseSimulatedGripperJointType= ruleUseSimulatedGripperJointType EOF
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
    // InternalXacro.g:4546:1: ruleUseSimulatedGripperJointType returns [EObject current=null] : ( () otherlv_1= 'UseSimulatedGripperJointType' ) ;
    public final EObject ruleUseSimulatedGripperJointType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalXacro.g:4552:2: ( ( () otherlv_1= 'UseSimulatedGripperJointType' ) )
            // InternalXacro.g:4553:2: ( () otherlv_1= 'UseSimulatedGripperJointType' )
            {
            // InternalXacro.g:4553:2: ( () otherlv_1= 'UseSimulatedGripperJointType' )
            // InternalXacro.g:4554:3: () otherlv_1= 'UseSimulatedGripperJointType'
            {
            // InternalXacro.g:4554:3: ()
            // InternalXacro.g:4555:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUseSimulatedGripperJointTypeAccess().getUseSimulatedGripperJointTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,133,FOLLOW_2); 

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
    // InternalXacro.g:4569:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // InternalXacro.g:4569:45: (iv_ruleName= ruleName EOF )
            // InternalXacro.g:4570:2: iv_ruleName= ruleName EOF
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
    // InternalXacro.g:4576:1: ruleName returns [EObject current=null] : ( () otherlv_1= 'Name' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:4582:2: ( ( () otherlv_1= 'Name' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalXacro.g:4583:2: ( () otherlv_1= 'Name' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalXacro.g:4583:2: ( () otherlv_1= 'Name' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalXacro.g:4584:3: () otherlv_1= 'Name' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalXacro.g:4584:3: ()
            // InternalXacro.g:4585:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNameAccess().getNameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,134,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNameAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_134); 

            			newLeafNode(otherlv_2, grammarAccess.getNameAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:4599:3: (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==17) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalXacro.g:4600:4: otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getNameAccess().getNameKeyword_3_0());
                    			
                    // InternalXacro.g:4604:4: ( (lv_name_4_0= ruleEString ) )
                    // InternalXacro.g:4605:5: (lv_name_4_0= ruleEString )
                    {
                    // InternalXacro.g:4605:5: (lv_name_4_0= ruleEString )
                    // InternalXacro.g:4606:6: lv_name_4_0= ruleEString
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

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXacro.g:4632:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalXacro.g:4632:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalXacro.g:4633:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalXacro.g:4639:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalXacro.g:4645:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalXacro.g:4646:2: this_DOUBLE_0= RULE_DOUBLE
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


    protected DFA12 dfa12 = new DFA12(this);
    static final String dfa_1s = "\u015c\uffff";
    static final String dfa_2s = "\1\25\1\20\1\uffff\1\54\1\20\1\21\1\4\2\25\1\4\1\125\1\130\1\132\1\24\2\25\3\20\1\54\1\uffff\1\25\1\45\1\21\1\20\1\75\1\134\1\135\1\25\1\75\1\144\1\4\1\75\1\144\1\21\5\20\2\45\2\20\1\4\11\25\2\4\1\25\1\6\1\25\6\6\1\25\2\4\1\131\1\152\1\154\1\157\1\160\1\25\2\4\1\131\1\152\1\154\1\157\1\160\1\25\1\4\1\125\1\130\1\132\1\24\17\25\4\20\1\151\5\25\4\20\1\167\3\25\3\20\1\25\1\155\1\156\1\161\1\20\1\25\1\155\1\156\1\161\1\20\1\25\1\45\1\21\1\4\1\25\2\6\1\163\1\21\1\4\1\25\2\6\1\163\1\25\1\75\1\134\1\135\1\25\1\75\1\144\1\4\1\75\1\144\2\25\1\156\2\25\1\4\1\164\1\166\3\25\1\156\2\25\1\4\1\25\5\20\2\45\2\20\1\6\1\25\1\4\3\25\2\20\1\6\1\25\1\4\22\25\2\4\1\25\1\6\1\25\6\6\1\25\2\4\1\131\1\152\1\154\1\157\1\160\1\25\2\4\1\131\1\152\1\154\1\157\1\160\2\25\1\4\1\25\1\163\21\25\4\20\1\151\5\25\4\20\1\167\5\25\1\155\1\156\1\161\1\20\1\25\1\155\1\156\1\161\1\20\1\4\1\25\2\6\1\163\1\21\1\4\1\25\2\6\1\163\3\25\1\156\2\25\1\4\1\164\1\166\3\25\1\156\2\25\1\4\1\25\1\6\1\25\1\4\3\25\2\20\1\6\1\25\1\4\14\25\1\4\1\25\1\163\5\25";
    static final String dfa_3s = "\1\40\1\20\1\uffff\1\54\1\20\1\21\1\5\2\57\1\5\1\125\1\130\1\132\1\25\2\57\3\20\1\54\1\uffff\1\127\2\131\1\20\1\75\1\134\1\135\1\57\1\75\1\144\1\5\1\75\1\144\1\21\5\20\2\131\2\20\1\5\1\77\1\33\1\143\1\77\1\150\1\77\1\150\2\57\2\5\1\127\1\6\1\127\6\6\1\25\2\5\1\131\1\152\1\154\1\157\1\160\1\37\2\5\1\131\1\152\1\154\1\157\1\160\1\133\1\5\1\125\1\130\1\132\1\25\2\77\3\25\5\143\1\25\2\77\2\25\4\20\1\151\1\57\2\77\2\25\4\20\1\167\1\25\2\57\3\20\1\153\1\155\1\156\1\161\1\20\1\153\1\155\1\156\1\161\1\20\1\127\2\131\1\5\1\150\2\6\1\163\1\62\1\5\1\150\2\6\1\163\1\33\1\75\1\134\1\135\1\57\1\75\1\144\1\5\1\75\1\144\2\25\1\156\1\25\1\162\1\5\1\164\1\166\3\25\1\156\1\25\1\162\1\5\1\25\5\20\2\131\2\20\1\6\1\150\1\5\1\25\2\62\2\20\1\6\1\150\1\5\3\25\1\77\1\33\1\143\1\77\1\150\1\77\1\150\3\25\1\165\1\161\3\25\2\5\1\127\1\6\1\127\6\6\1\25\2\5\1\131\1\152\1\154\1\157\1\160\1\37\2\5\1\131\1\152\1\154\1\157\1\160\1\133\1\150\1\5\1\62\1\163\1\25\1\150\2\77\3\25\5\143\1\25\2\77\2\25\4\20\1\151\1\57\2\77\2\25\4\20\1\167\4\25\1\153\1\155\1\156\1\161\1\20\1\153\1\155\1\156\1\161\1\20\1\5\1\150\2\6\1\163\1\62\1\5\1\150\2\6\1\163\1\33\2\25\1\156\1\25\1\162\1\5\1\164\1\166\3\25\1\156\1\25\1\162\1\5\1\25\1\6\1\150\1\5\1\25\2\62\2\20\1\6\1\150\1\5\6\25\1\165\1\161\3\25\1\150\1\5\1\62\1\163\1\25\1\150\3\25";
    static final String dfa_4s = "\2\uffff\1\2\21\uffff\1\1\u0147\uffff";
    static final String dfa_5s = "\u015c\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\7\uffff\1\1\3\2",
            "\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7\1\10",
            "\1\15\14\uffff\1\11\12\uffff\1\12\1\13\1\14",
            "\1\15\14\uffff\1\11\12\uffff\1\12\1\13\1\14",
            "\1\16\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23\1\24",
            "\1\15\27\uffff\1\12\1\13\1\14",
            "\1\15\27\uffff\1\12\1\13\1\14",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "",
            "\1\34\17\uffff\1\31\60\uffff\1\32\1\33",
            "\1\35\63\uffff\1\36",
            "\1\37\23\uffff\1\40\63\uffff\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\15\30\uffff\1\13\1\14",
            "\1\46",
            "\1\47",
            "\1\50\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\40\63\uffff\1\41",
            "\1\40\63\uffff\1\41",
            "\1\62",
            "\1\63",
            "\1\64\1\65",
            "\1\70\50\uffff\1\66\1\67",
            "\1\72\5\uffff\1\71",
            "\1\101\110\uffff\1\73\1\74\1\75\1\76\1\77\1\100",
            "\1\104\50\uffff\1\102\1\103",
            "\1\111\117\uffff\1\105\1\106\1\107\1\110",
            "\1\114\50\uffff\1\112\1\113",
            "\1\121\117\uffff\1\115\1\116\1\117\1\120",
            "\1\126\14\uffff\1\122\12\uffff\1\123\1\124\1\125",
            "\1\126\14\uffff\1\122\12\uffff\1\123\1\124\1\125",
            "\1\127\1\130",
            "\1\131\1\132",
            "\1\34\100\uffff\1\32\1\33",
            "\1\133",
            "\1\34\101\uffff\1\33",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\34",
            "\1\142\1\143",
            "\1\144\1\145",
            "\1\36",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\153\11\uffff\1\152",
            "\1\154\1\155",
            "\1\156\1\157",
            "\1\41",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\165\105\uffff\1\164",
            "\1\166\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\23\1\24",
            "\1\70\51\uffff\1\67",
            "\1\70\51\uffff\1\67",
            "\1\70",
            "\1\70",
            "\1\72",
            "\1\101\111\uffff\1\74\1\75\1\76\1\77\1\100",
            "\1\101\112\uffff\1\75\1\76\1\77\1\100",
            "\1\101\113\uffff\1\76\1\77\1\100",
            "\1\101\114\uffff\1\77\1\100",
            "\1\101\115\uffff\1\100",
            "\1\101",
            "\1\104\51\uffff\1\103",
            "\1\104\51\uffff\1\103",
            "\1\104",
            "\1\104",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\15\31\uffff\1\14",
            "\1\114\51\uffff\1\113",
            "\1\114\51\uffff\1\113",
            "\1\114",
            "\1\114",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\15",
            "\1\126\27\uffff\1\123\1\124\1\125",
            "\1\126\27\uffff\1\123\1\124\1\125",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0089\125\uffff\1\u0088",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008f\125\uffff\1\u008e",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0097\17\uffff\1\u0094\60\uffff\1\u0095\1\u0096",
            "\1\u0098\63\uffff\1\u0099",
            "\1\u009a\23\uffff\1\u009b\63\uffff\1\u009c",
            "\1\u009d\1\u009e",
            "\1\111\120\uffff\1\106\1\107\1\110",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2\3\uffff\1\u00a5\33\uffff\1\u00a3\1\u00a4",
            "\1\u00a6\1\u00a7",
            "\1\121\120\uffff\1\116\1\117\1\120",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ac\5\uffff\1\u00ab",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\126\30\uffff\1\124\1\125",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u0089",
            "\1\u0089",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b9\134\uffff\1\u00b8",
            "\1\u00ba\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\153",
            "\1\u008f",
            "\1\u008f",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c1\134\uffff\1\u00c0",
            "\1\u00c2\1\u00c3",
            "\1\165",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u009b\63\uffff\1\u009c",
            "\1\u009b\63\uffff\1\u009c",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\111\122\uffff\1\110",
            "\1\u00cc\1\u00cd",
            "\1\111",
            "\1\u00a5\33\uffff\1\u00a3\1\u00a4",
            "\1\u00a5\33\uffff\1\u00a3\1\u00a4",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\121\122\uffff\1\120",
            "\1\u00d1\1\u00d2",
            "\1\121",
            "\1\u00ac",
            "\1\u00ac",
            "\1\u00d5\50\uffff\1\u00d3\1\u00d4",
            "\1\u00d7\5\uffff\1\u00d6",
            "\1\u00de\110\uffff\1\u00d8\1\u00d9\1\u00da\1\u00db\1\u00dc\1\u00dd",
            "\1\u00e1\50\uffff\1\u00df\1\u00e0",
            "\1\u00e6\117\uffff\1\u00e2\1\u00e3\1\u00e4\1\u00e5",
            "\1\u00e9\50\uffff\1\u00e7\1\u00e8",
            "\1\u00ee\117\uffff\1\u00ea\1\u00eb\1\u00ec\1\u00ed",
            "\1\u00ef",
            "\1\u00b9",
            "\1\u00b9",
            "\1\u00f1\137\uffff\1\u00f0",
            "\1\u00f3\133\uffff\1\u00f2",
            "\1\u00f4",
            "\1\u00c1",
            "\1\u00c1",
            "\1\u00f5\1\u00f6",
            "\1\u00f7\1\u00f8",
            "\1\u0097\100\uffff\1\u0095\1\u0096",
            "\1\u00f9",
            "\1\u0097\101\uffff\1\u0096",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0097",
            "\1\u0100\1\u0101",
            "\1\u0102\1\u0103",
            "\1\u0099",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0109\11\uffff\1\u0108",
            "\1\u010a\1\u010b",
            "\1\u010c\1\u010d",
            "\1\u009c",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0113\105\uffff\1\u0112",
            "\1\111\121\uffff\1\107\1\110",
            "\1\u0114\1\u0115",
            "\1\u00a5\34\uffff\1\u00a4",
            "\1\u0116",
            "\1\u00a5",
            "\1\121\121\uffff\1\117\1\120",
            "\1\u00d5\51\uffff\1\u00d4",
            "\1\u00d5\51\uffff\1\u00d4",
            "\1\u00d5",
            "\1\u00d5",
            "\1\u00d7",
            "\1\u00de\111\uffff\1\u00d9\1\u00da\1\u00db\1\u00dc\1\u00dd",
            "\1\u00de\112\uffff\1\u00da\1\u00db\1\u00dc\1\u00dd",
            "\1\u00de\113\uffff\1\u00db\1\u00dc\1\u00dd",
            "\1\u00de\114\uffff\1\u00dc\1\u00dd",
            "\1\u00de\115\uffff\1\u00dd",
            "\1\u00de",
            "\1\u00e1\51\uffff\1\u00e0",
            "\1\u00e1\51\uffff\1\u00e0",
            "\1\u00e1",
            "\1\u00e1",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\126\31\uffff\1\125",
            "\1\u00e9\51\uffff\1\u00e8",
            "\1\u00e9\51\uffff\1\u00e8",
            "\1\u00e9",
            "\1\u00e9",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\126",
            "\1\u00f1",
            "\1\u00f1",
            "\1\u00f3",
            "\1\u0122\125\uffff\1\u0121",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0128\125\uffff\1\u0127",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d\1\u012e",
            "\1\u00e6\120\uffff\1\u00e3\1\u00e4\1\u00e5",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132\3\uffff\1\u0135\33\uffff\1\u0133\1\u0134",
            "\1\u0136\1\u0137",
            "\1\u00ee\120\uffff\1\u00eb\1\u00ec\1\u00ed",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013c\5\uffff\1\u013b",
            "\1\u0122",
            "\1\u0122",
            "\1\u013d",
            "\1\u013e",
            "\1\u0140\134\uffff\1\u013f",
            "\1\u0141\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0109",
            "\1\u0128",
            "\1\u0128",
            "\1\u0145",
            "\1\u0146",
            "\1\u0148\134\uffff\1\u0147",
            "\1\u0149\1\u014a",
            "\1\u0113",
            "\1\u014b",
            "\1\u00e6\122\uffff\1\u00e5",
            "\1\u014c\1\u014d",
            "\1\u00e6",
            "\1\u0135\33\uffff\1\u0133\1\u0134",
            "\1\u0135\33\uffff\1\u0133\1\u0134",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u00ee\122\uffff\1\u00ed",
            "\1\u0151\1\u0152",
            "\1\u00ee",
            "\1\u013c",
            "\1\u013c",
            "\1\u0153",
            "\1\u0140",
            "\1\u0140",
            "\1\u0155\137\uffff\1\u0154",
            "\1\u0157\133\uffff\1\u0156",
            "\1\u0158",
            "\1\u0148",
            "\1\u0148",
            "\1\u00e6\121\uffff\1\u00e4\1\u00e5",
            "\1\u0159\1\u015a",
            "\1\u0135\34\uffff\1\u0134",
            "\1\u015b",
            "\1\u0135",
            "\1\u00ee\121\uffff\1\u00ec\1\u00ed",
            "\1\u0155",
            "\1\u0155",
            "\1\u0157"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "541:3: (otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}' )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000006C0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000680000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001600000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000C200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000001E0200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000001A0200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000180200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000FE000200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000FC000200000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000F8000200000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000F0000200000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000E0000200000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000C0000200000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000200000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000E00400200000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000E00000200000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000C00000200000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000200000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0006000000200000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0004000000200000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0010000000020000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x1FE0000040200000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x1FC0000040200000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x1F80000040200000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x1F00000040200000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x1E00000040200000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x1C00000040200000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x1800000040200000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x1000000040200000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0xC000000000200000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x8000000000200000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000200000L,0x000000000000001CL});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000018L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000010L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000200000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000080L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000200000L,0x0000000000001E00L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000200000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000200000L,0x0000000000001800L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000200000L,0x0000000000001000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000200000L,0x0000000000030000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000200000L,0x0000000000020000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000200000L,0x0000000000180000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000200000L,0x0000000000100000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000002000200000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000200000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000200000L,0x0000000000800000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000002000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000080200000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000002000020000L,0x0000000002000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000200000L,0x0000000008000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000200000L,0x0000000FC0000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000200000L,0x0000000F80000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000200000L,0x0000000F00000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000200000L,0x0000000E00000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000200000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000200000L,0x0000000800000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000200000L,0x000001E000000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000200000L,0x000001C000000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000200000L,0x0000018000000000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0006000000220000L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000200000L,0x0000080000000000L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000200000L,0x0004000000000000L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000000200000L,0x0020000000000000L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000200000L,0x0002000000000000L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x0000000000220000L});

}