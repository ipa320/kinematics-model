package de.fraunhofer.ipa.kinematics.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.ipa.kinematics.services.KinematicsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKinematicsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_DOUBLE", "RULE_DIGIT", "RULE_BOOLEAN", "RULE_DECINT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RobotType'", "'{'", "'name'", "'version'", "'link'", "','", "'}'", "'joint'", "'material'", "'transmission'", "'Joint'", "'type'", "'origin'", "'parent'", "'child'", "'axis'", "'calibration'", "'dynamics'", "'limit'", "'safetyController'", "'mimic'", "'Link'", "'inertial'", "'visual'", "'collision'", "'MaterialGlobal'", "'color'", "'texture'", "'Transmission'", "'mechanicalReduction'", "'leftActuator'", "'rightActuator'", "'flexJoint'", "'rollJoint'", "'gapJoint'", "'passiveJoint'", "'useSimulatedGripperJoint'", "'actuator'", "'Pose'", "'rpy'", "'xyz'", "'Axis'", "'Calibration'", "'falling'", "'referencePosition'", "'rising'", "'Dynamics'", "'damping'", "'friction'", "'Limit'", "'effort'", "'lower'", "'upper'", "'velocity'", "'SafetyController'", "'kPosition'", "'kVelocity'", "'softLowerLimit'", "'softUpperLimit'", "'Mimic'", "'multiplier'", "'offset'", "'Inertial'", "'mass'", "'inertia'", "'Visual'", "'geometry'", "'Collision'", "'verbose'", "'Mass'", "'value'", "'Inertia'", "'ixx'", "'ixy'", "'ixz'", "'iyy'", "'iyz'", "'izz'", "'Geometry'", "'box'", "'cylinder'", "'sphere'", "'mesh'", "'Material'", "'Box'", "'size'", "'Cylinder'", "'length'", "'radius'", "'Sphere'", "'Mesh'", "'filename'", "'scale'", "'AnyURI'", "'Color'", "'rgba'", "'Texture'", "'Verbose'", "'ActuatorTransmission'", "'GapJointTransmission'", "'a'", "'b'", "'gearRatio'", "'h'", "'l0'", "'phi0'", "'r'", "'screwReduction'", "'t0'", "'theta0'", "'PassiveJointTransmission'", "'UseSimulatedGripperJointType'", "'Name'"
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
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_DIGIT=7;
    public static final int RULE_INT=10;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
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


        public InternalKinematicsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKinematicsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKinematicsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKinematics.g"; }



     	private KinematicsGrammarAccess grammarAccess;

        public InternalKinematicsParser(TokenStream input, KinematicsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RobotType";
       	}

       	@Override
       	protected KinematicsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRobotType"
    // InternalKinematics.g:64:1: entryRuleRobotType returns [EObject current=null] : iv_ruleRobotType= ruleRobotType EOF ;
    public final EObject entryRuleRobotType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotType = null;


        try {
            // InternalKinematics.g:64:50: (iv_ruleRobotType= ruleRobotType EOF )
            // InternalKinematics.g:65:2: iv_ruleRobotType= ruleRobotType EOF
            {
             newCompositeNode(grammarAccess.getRobotTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobotType=ruleRobotType();

            state._fsp--;

             current =iv_ruleRobotType; 
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
    // $ANTLR end "entryRuleRobotType"


    // $ANTLR start "ruleRobotType"
    // InternalKinematics.g:71:1: ruleRobotType returns [EObject current=null] : (otherlv_0= 'RobotType' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'version' ( (lv_version_5_0= ruleEString ) ) )? (otherlv_6= 'link' otherlv_7= '{' ( (lv_link_8_0= ruleLink ) ) (otherlv_9= ',' ( (lv_link_10_0= ruleLink ) ) )* otherlv_11= '}' )? (otherlv_12= 'joint' otherlv_13= '{' ( (lv_joint_14_0= ruleJoint ) ) (otherlv_15= ',' ( (lv_joint_16_0= ruleJoint ) ) )* otherlv_17= '}' )? (otherlv_18= 'material' otherlv_19= '{' ( (lv_material_20_0= ruleMaterialGlobal ) ) (otherlv_21= ',' ( (lv_material_22_0= ruleMaterialGlobal ) ) )* otherlv_23= '}' )? (otherlv_24= 'transmission' otherlv_25= '{' ( (lv_transmission_26_0= ruleTransmission ) ) (otherlv_27= ',' ( (lv_transmission_28_0= ruleTransmission ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) ;
    public final EObject ruleRobotType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
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
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_version_5_0 = null;

        EObject lv_link_8_0 = null;

        EObject lv_link_10_0 = null;

        EObject lv_joint_14_0 = null;

        EObject lv_joint_16_0 = null;

        EObject lv_material_20_0 = null;

        EObject lv_material_22_0 = null;

        EObject lv_transmission_26_0 = null;

        EObject lv_transmission_28_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:77:2: ( (otherlv_0= 'RobotType' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'version' ( (lv_version_5_0= ruleEString ) ) )? (otherlv_6= 'link' otherlv_7= '{' ( (lv_link_8_0= ruleLink ) ) (otherlv_9= ',' ( (lv_link_10_0= ruleLink ) ) )* otherlv_11= '}' )? (otherlv_12= 'joint' otherlv_13= '{' ( (lv_joint_14_0= ruleJoint ) ) (otherlv_15= ',' ( (lv_joint_16_0= ruleJoint ) ) )* otherlv_17= '}' )? (otherlv_18= 'material' otherlv_19= '{' ( (lv_material_20_0= ruleMaterialGlobal ) ) (otherlv_21= ',' ( (lv_material_22_0= ruleMaterialGlobal ) ) )* otherlv_23= '}' )? (otherlv_24= 'transmission' otherlv_25= '{' ( (lv_transmission_26_0= ruleTransmission ) ) (otherlv_27= ',' ( (lv_transmission_28_0= ruleTransmission ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) )
            // InternalKinematics.g:78:2: (otherlv_0= 'RobotType' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'version' ( (lv_version_5_0= ruleEString ) ) )? (otherlv_6= 'link' otherlv_7= '{' ( (lv_link_8_0= ruleLink ) ) (otherlv_9= ',' ( (lv_link_10_0= ruleLink ) ) )* otherlv_11= '}' )? (otherlv_12= 'joint' otherlv_13= '{' ( (lv_joint_14_0= ruleJoint ) ) (otherlv_15= ',' ( (lv_joint_16_0= ruleJoint ) ) )* otherlv_17= '}' )? (otherlv_18= 'material' otherlv_19= '{' ( (lv_material_20_0= ruleMaterialGlobal ) ) (otherlv_21= ',' ( (lv_material_22_0= ruleMaterialGlobal ) ) )* otherlv_23= '}' )? (otherlv_24= 'transmission' otherlv_25= '{' ( (lv_transmission_26_0= ruleTransmission ) ) (otherlv_27= ',' ( (lv_transmission_28_0= ruleTransmission ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            {
            // InternalKinematics.g:78:2: (otherlv_0= 'RobotType' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'version' ( (lv_version_5_0= ruleEString ) ) )? (otherlv_6= 'link' otherlv_7= '{' ( (lv_link_8_0= ruleLink ) ) (otherlv_9= ',' ( (lv_link_10_0= ruleLink ) ) )* otherlv_11= '}' )? (otherlv_12= 'joint' otherlv_13= '{' ( (lv_joint_14_0= ruleJoint ) ) (otherlv_15= ',' ( (lv_joint_16_0= ruleJoint ) ) )* otherlv_17= '}' )? (otherlv_18= 'material' otherlv_19= '{' ( (lv_material_20_0= ruleMaterialGlobal ) ) (otherlv_21= ',' ( (lv_material_22_0= ruleMaterialGlobal ) ) )* otherlv_23= '}' )? (otherlv_24= 'transmission' otherlv_25= '{' ( (lv_transmission_26_0= ruleTransmission ) ) (otherlv_27= ',' ( (lv_transmission_28_0= ruleTransmission ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            // InternalKinematics.g:79:3: otherlv_0= 'RobotType' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'version' ( (lv_version_5_0= ruleEString ) ) )? (otherlv_6= 'link' otherlv_7= '{' ( (lv_link_8_0= ruleLink ) ) (otherlv_9= ',' ( (lv_link_10_0= ruleLink ) ) )* otherlv_11= '}' )? (otherlv_12= 'joint' otherlv_13= '{' ( (lv_joint_14_0= ruleJoint ) ) (otherlv_15= ',' ( (lv_joint_16_0= ruleJoint ) ) )* otherlv_17= '}' )? (otherlv_18= 'material' otherlv_19= '{' ( (lv_material_20_0= ruleMaterialGlobal ) ) (otherlv_21= ',' ( (lv_material_22_0= ruleMaterialGlobal ) ) )* otherlv_23= '}' )? (otherlv_24= 'transmission' otherlv_25= '{' ( (lv_transmission_26_0= ruleTransmission ) ) (otherlv_27= ',' ( (lv_transmission_28_0= ruleTransmission ) ) )* otherlv_29= '}' )? otherlv_30= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotTypeAccess().getRobotTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getRobotTypeAccess().getNameKeyword_2());
            		
            // InternalKinematics.g:91:3: ( (lv_name_3_0= ruleEString ) )
            // InternalKinematics.g:92:4: (lv_name_3_0= ruleEString )
            {
            // InternalKinematics.g:92:4: (lv_name_3_0= ruleEString )
            // InternalKinematics.g:93:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRobotTypeAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKinematics.g:110:3: (otherlv_4= 'version' ( (lv_version_5_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalKinematics.g:111:4: otherlv_4= 'version' ( (lv_version_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRobotTypeAccess().getVersionKeyword_4_0());
                    			
                    // InternalKinematics.g:115:4: ( (lv_version_5_0= ruleEString ) )
                    // InternalKinematics.g:116:5: (lv_version_5_0= ruleEString )
                    {
                    // InternalKinematics.g:116:5: (lv_version_5_0= ruleEString )
                    // InternalKinematics.g:117:6: lv_version_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRobotTypeAccess().getVersionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_version_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotTypeRule());
                    						}
                    						set(
                    							current,
                    							"version",
                    							lv_version_5_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:135:3: (otherlv_6= 'link' otherlv_7= '{' ( (lv_link_8_0= ruleLink ) ) (otherlv_9= ',' ( (lv_link_10_0= ruleLink ) ) )* otherlv_11= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKinematics.g:136:4: otherlv_6= 'link' otherlv_7= '{' ( (lv_link_8_0= ruleLink ) ) (otherlv_9= ',' ( (lv_link_10_0= ruleLink ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getRobotTypeAccess().getLinkKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getRobotTypeAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalKinematics.g:144:4: ( (lv_link_8_0= ruleLink ) )
                    // InternalKinematics.g:145:5: (lv_link_8_0= ruleLink )
                    {
                    // InternalKinematics.g:145:5: (lv_link_8_0= ruleLink )
                    // InternalKinematics.g:146:6: lv_link_8_0= ruleLink
                    {

                    						newCompositeNode(grammarAccess.getRobotTypeAccess().getLinkLinkParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_link_8_0=ruleLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotTypeRule());
                    						}
                    						add(
                    							current,
                    							"link",
                    							lv_link_8_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Link");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKinematics.g:163:4: (otherlv_9= ',' ( (lv_link_10_0= ruleLink ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==20) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalKinematics.g:164:5: otherlv_9= ',' ( (lv_link_10_0= ruleLink ) )
                    	    {
                    	    otherlv_9=(Token)match(input,20,FOLLOW_8); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getRobotTypeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalKinematics.g:168:5: ( (lv_link_10_0= ruleLink ) )
                    	    // InternalKinematics.g:169:6: (lv_link_10_0= ruleLink )
                    	    {
                    	    // InternalKinematics.g:169:6: (lv_link_10_0= ruleLink )
                    	    // InternalKinematics.g:170:7: lv_link_10_0= ruleLink
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobotTypeAccess().getLinkLinkParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_link_10_0=ruleLink();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRobotTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"link",
                    	    								lv_link_10_0,
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.Link");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getRobotTypeAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalKinematics.g:193:3: (otherlv_12= 'joint' otherlv_13= '{' ( (lv_joint_14_0= ruleJoint ) ) (otherlv_15= ',' ( (lv_joint_16_0= ruleJoint ) ) )* otherlv_17= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKinematics.g:194:4: otherlv_12= 'joint' otherlv_13= '{' ( (lv_joint_14_0= ruleJoint ) ) (otherlv_15= ',' ( (lv_joint_16_0= ruleJoint ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getRobotTypeAccess().getJointKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getRobotTypeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalKinematics.g:202:4: ( (lv_joint_14_0= ruleJoint ) )
                    // InternalKinematics.g:203:5: (lv_joint_14_0= ruleJoint )
                    {
                    // InternalKinematics.g:203:5: (lv_joint_14_0= ruleJoint )
                    // InternalKinematics.g:204:6: lv_joint_14_0= ruleJoint
                    {

                    						newCompositeNode(grammarAccess.getRobotTypeAccess().getJointJointParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_joint_14_0=ruleJoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotTypeRule());
                    						}
                    						add(
                    							current,
                    							"joint",
                    							lv_joint_14_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Joint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKinematics.g:221:4: (otherlv_15= ',' ( (lv_joint_16_0= ruleJoint ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==20) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalKinematics.g:222:5: otherlv_15= ',' ( (lv_joint_16_0= ruleJoint ) )
                    	    {
                    	    otherlv_15=(Token)match(input,20,FOLLOW_11); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getRobotTypeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalKinematics.g:226:5: ( (lv_joint_16_0= ruleJoint ) )
                    	    // InternalKinematics.g:227:6: (lv_joint_16_0= ruleJoint )
                    	    {
                    	    // InternalKinematics.g:227:6: (lv_joint_16_0= ruleJoint )
                    	    // InternalKinematics.g:228:7: lv_joint_16_0= ruleJoint
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobotTypeAccess().getJointJointParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_joint_16_0=ruleJoint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRobotTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"joint",
                    	    								lv_joint_16_0,
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.Joint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_17, grammarAccess.getRobotTypeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalKinematics.g:251:3: (otherlv_18= 'material' otherlv_19= '{' ( (lv_material_20_0= ruleMaterialGlobal ) ) (otherlv_21= ',' ( (lv_material_22_0= ruleMaterialGlobal ) ) )* otherlv_23= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKinematics.g:252:4: otherlv_18= 'material' otherlv_19= '{' ( (lv_material_20_0= ruleMaterialGlobal ) ) (otherlv_21= ',' ( (lv_material_22_0= ruleMaterialGlobal ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getRobotTypeAccess().getMaterialKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_19, grammarAccess.getRobotTypeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalKinematics.g:260:4: ( (lv_material_20_0= ruleMaterialGlobal ) )
                    // InternalKinematics.g:261:5: (lv_material_20_0= ruleMaterialGlobal )
                    {
                    // InternalKinematics.g:261:5: (lv_material_20_0= ruleMaterialGlobal )
                    // InternalKinematics.g:262:6: lv_material_20_0= ruleMaterialGlobal
                    {

                    						newCompositeNode(grammarAccess.getRobotTypeAccess().getMaterialMaterialGlobalParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_material_20_0=ruleMaterialGlobal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotTypeRule());
                    						}
                    						add(
                    							current,
                    							"material",
                    							lv_material_20_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.MaterialGlobal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKinematics.g:279:4: (otherlv_21= ',' ( (lv_material_22_0= ruleMaterialGlobal ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==20) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalKinematics.g:280:5: otherlv_21= ',' ( (lv_material_22_0= ruleMaterialGlobal ) )
                    	    {
                    	    otherlv_21=(Token)match(input,20,FOLLOW_13); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getRobotTypeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalKinematics.g:284:5: ( (lv_material_22_0= ruleMaterialGlobal ) )
                    	    // InternalKinematics.g:285:6: (lv_material_22_0= ruleMaterialGlobal )
                    	    {
                    	    // InternalKinematics.g:285:6: (lv_material_22_0= ruleMaterialGlobal )
                    	    // InternalKinematics.g:286:7: lv_material_22_0= ruleMaterialGlobal
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobotTypeAccess().getMaterialMaterialGlobalParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_material_22_0=ruleMaterialGlobal();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRobotTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"material",
                    	    								lv_material_22_0,
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.MaterialGlobal");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_23, grammarAccess.getRobotTypeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalKinematics.g:309:3: (otherlv_24= 'transmission' otherlv_25= '{' ( (lv_transmission_26_0= ruleTransmission ) ) (otherlv_27= ',' ( (lv_transmission_28_0= ruleTransmission ) ) )* otherlv_29= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKinematics.g:310:4: otherlv_24= 'transmission' otherlv_25= '{' ( (lv_transmission_26_0= ruleTransmission ) ) (otherlv_27= ',' ( (lv_transmission_28_0= ruleTransmission ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getRobotTypeAccess().getTransmissionKeyword_8_0());
                    			
                    otherlv_25=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_25, grammarAccess.getRobotTypeAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalKinematics.g:318:4: ( (lv_transmission_26_0= ruleTransmission ) )
                    // InternalKinematics.g:319:5: (lv_transmission_26_0= ruleTransmission )
                    {
                    // InternalKinematics.g:319:5: (lv_transmission_26_0= ruleTransmission )
                    // InternalKinematics.g:320:6: lv_transmission_26_0= ruleTransmission
                    {

                    						newCompositeNode(grammarAccess.getRobotTypeAccess().getTransmissionTransmissionParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_transmission_26_0=ruleTransmission();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotTypeRule());
                    						}
                    						add(
                    							current,
                    							"transmission",
                    							lv_transmission_26_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Transmission");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKinematics.g:337:4: (otherlv_27= ',' ( (lv_transmission_28_0= ruleTransmission ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==20) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalKinematics.g:338:5: otherlv_27= ',' ( (lv_transmission_28_0= ruleTransmission ) )
                    	    {
                    	    otherlv_27=(Token)match(input,20,FOLLOW_15); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getRobotTypeAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalKinematics.g:342:5: ( (lv_transmission_28_0= ruleTransmission ) )
                    	    // InternalKinematics.g:343:6: (lv_transmission_28_0= ruleTransmission )
                    	    {
                    	    // InternalKinematics.g:343:6: (lv_transmission_28_0= ruleTransmission )
                    	    // InternalKinematics.g:344:7: lv_transmission_28_0= ruleTransmission
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobotTypeAccess().getTransmissionTransmissionParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_transmission_28_0=ruleTransmission();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRobotTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"transmission",
                    	    								lv_transmission_28_0,
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.Transmission");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_29, grammarAccess.getRobotTypeAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_30=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getRobotTypeAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleRobotType"


    // $ANTLR start "entryRuleEString"
    // InternalKinematics.g:375:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalKinematics.g:375:47: (iv_ruleEString= ruleEString EOF )
            // InternalKinematics.g:376:2: iv_ruleEString= ruleEString EOF
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
    // InternalKinematics.g:382:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalKinematics.g:388:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalKinematics.g:389:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalKinematics.g:389:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalKinematics.g:390:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKinematics.g:398:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleJoint"
    // InternalKinematics.g:409:1: entryRuleJoint returns [EObject current=null] : iv_ruleJoint= ruleJoint EOF ;
    public final EObject entryRuleJoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoint = null;


        try {
            // InternalKinematics.g:409:46: (iv_ruleJoint= ruleJoint EOF )
            // InternalKinematics.g:410:2: iv_ruleJoint= ruleJoint EOF
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
    // InternalKinematics.g:416:1: ruleJoint returns [EObject current=null] : (otherlv_0= 'Joint' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) (otherlv_6= 'origin' ( (lv_origin_7_0= rulePose ) ) )? otherlv_8= 'parent' ( ( ruleEString ) ) otherlv_10= 'child' ( ( ruleEString ) ) (otherlv_12= 'axis' ( (lv_axis_13_0= ruleAxis ) ) )? (otherlv_14= 'calibration' ( (lv_calibration_15_0= ruleCalibration ) ) )? (otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )? (otherlv_18= 'limit' ( (lv_limit_19_0= ruleLimit ) ) )? (otherlv_20= 'safetyController' ( (lv_safetyController_21_0= ruleSafetyController ) ) )? (otherlv_22= 'mimic' ( (lv_mimic_23_0= ruleMimic ) ) )? otherlv_24= '}' ) ;
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

        EObject lv_origin_7_0 = null;

        EObject lv_axis_13_0 = null;

        EObject lv_calibration_15_0 = null;

        EObject lv_dynamics_17_0 = null;

        EObject lv_limit_19_0 = null;

        EObject lv_safetyController_21_0 = null;

        EObject lv_mimic_23_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:422:2: ( (otherlv_0= 'Joint' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) (otherlv_6= 'origin' ( (lv_origin_7_0= rulePose ) ) )? otherlv_8= 'parent' ( ( ruleEString ) ) otherlv_10= 'child' ( ( ruleEString ) ) (otherlv_12= 'axis' ( (lv_axis_13_0= ruleAxis ) ) )? (otherlv_14= 'calibration' ( (lv_calibration_15_0= ruleCalibration ) ) )? (otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )? (otherlv_18= 'limit' ( (lv_limit_19_0= ruleLimit ) ) )? (otherlv_20= 'safetyController' ( (lv_safetyController_21_0= ruleSafetyController ) ) )? (otherlv_22= 'mimic' ( (lv_mimic_23_0= ruleMimic ) ) )? otherlv_24= '}' ) )
            // InternalKinematics.g:423:2: (otherlv_0= 'Joint' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) (otherlv_6= 'origin' ( (lv_origin_7_0= rulePose ) ) )? otherlv_8= 'parent' ( ( ruleEString ) ) otherlv_10= 'child' ( ( ruleEString ) ) (otherlv_12= 'axis' ( (lv_axis_13_0= ruleAxis ) ) )? (otherlv_14= 'calibration' ( (lv_calibration_15_0= ruleCalibration ) ) )? (otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )? (otherlv_18= 'limit' ( (lv_limit_19_0= ruleLimit ) ) )? (otherlv_20= 'safetyController' ( (lv_safetyController_21_0= ruleSafetyController ) ) )? (otherlv_22= 'mimic' ( (lv_mimic_23_0= ruleMimic ) ) )? otherlv_24= '}' )
            {
            // InternalKinematics.g:423:2: (otherlv_0= 'Joint' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) (otherlv_6= 'origin' ( (lv_origin_7_0= rulePose ) ) )? otherlv_8= 'parent' ( ( ruleEString ) ) otherlv_10= 'child' ( ( ruleEString ) ) (otherlv_12= 'axis' ( (lv_axis_13_0= ruleAxis ) ) )? (otherlv_14= 'calibration' ( (lv_calibration_15_0= ruleCalibration ) ) )? (otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )? (otherlv_18= 'limit' ( (lv_limit_19_0= ruleLimit ) ) )? (otherlv_20= 'safetyController' ( (lv_safetyController_21_0= ruleSafetyController ) ) )? (otherlv_22= 'mimic' ( (lv_mimic_23_0= ruleMimic ) ) )? otherlv_24= '}' )
            // InternalKinematics.g:424:3: otherlv_0= 'Joint' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) (otherlv_6= 'origin' ( (lv_origin_7_0= rulePose ) ) )? otherlv_8= 'parent' ( ( ruleEString ) ) otherlv_10= 'child' ( ( ruleEString ) ) (otherlv_12= 'axis' ( (lv_axis_13_0= ruleAxis ) ) )? (otherlv_14= 'calibration' ( (lv_calibration_15_0= ruleCalibration ) ) )? (otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )? (otherlv_18= 'limit' ( (lv_limit_19_0= ruleLimit ) ) )? (otherlv_20= 'safetyController' ( (lv_safetyController_21_0= ruleSafetyController ) ) )? (otherlv_22= 'mimic' ( (lv_mimic_23_0= ruleMimic ) ) )? otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getJointAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getJointAccess().getNameKeyword_2());
            		
            // InternalKinematics.g:436:3: ( (lv_name_3_0= ruleEString ) )
            // InternalKinematics.g:437:4: (lv_name_3_0= ruleEString )
            {
            // InternalKinematics.g:437:4: (lv_name_3_0= ruleEString )
            // InternalKinematics.g:438:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJointAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getJointAccess().getTypeKeyword_4());
            		
            // InternalKinematics.g:459:3: ( (lv_type_5_0= ruleEString ) )
            // InternalKinematics.g:460:4: (lv_type_5_0= ruleEString )
            {
            // InternalKinematics.g:460:4: (lv_type_5_0= ruleEString )
            // InternalKinematics.g:461:5: lv_type_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJointAccess().getTypeEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_18);
            lv_type_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKinematics.g:478:3: (otherlv_6= 'origin' ( (lv_origin_7_0= rulePose ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKinematics.g:479:4: otherlv_6= 'origin' ( (lv_origin_7_0= rulePose ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getJointAccess().getOriginKeyword_6_0());
                    			
                    // InternalKinematics.g:483:4: ( (lv_origin_7_0= rulePose ) )
                    // InternalKinematics.g:484:5: (lv_origin_7_0= rulePose )
                    {
                    // InternalKinematics.g:484:5: (lv_origin_7_0= rulePose )
                    // InternalKinematics.g:485:6: lv_origin_7_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getOriginPoseParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_origin_7_0=rulePose();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"origin",
                    							lv_origin_7_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Pose");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getJointAccess().getParentKeyword_7());
            		
            // InternalKinematics.g:507:3: ( ( ruleEString ) )
            // InternalKinematics.g:508:4: ( ruleEString )
            {
            // InternalKinematics.g:508:4: ( ruleEString )
            // InternalKinematics.g:509:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				

            					newCompositeNode(grammarAccess.getJointAccess().getParentLinkCrossReference_8_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getJointAccess().getChildKeyword_9());
            		
            // InternalKinematics.g:527:3: ( ( ruleEString ) )
            // InternalKinematics.g:528:4: ( ruleEString )
            {
            // InternalKinematics.g:528:4: ( ruleEString )
            // InternalKinematics.g:529:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				

            					newCompositeNode(grammarAccess.getJointAccess().getChildLinkCrossReference_10_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKinematics.g:543:3: (otherlv_12= 'axis' ( (lv_axis_13_0= ruleAxis ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKinematics.g:544:4: otherlv_12= 'axis' ( (lv_axis_13_0= ruleAxis ) )
                    {
                    otherlv_12=(Token)match(input,30,FOLLOW_23); 

                    				newLeafNode(otherlv_12, grammarAccess.getJointAccess().getAxisKeyword_11_0());
                    			
                    // InternalKinematics.g:548:4: ( (lv_axis_13_0= ruleAxis ) )
                    // InternalKinematics.g:549:5: (lv_axis_13_0= ruleAxis )
                    {
                    // InternalKinematics.g:549:5: (lv_axis_13_0= ruleAxis )
                    // InternalKinematics.g:550:6: lv_axis_13_0= ruleAxis
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_axis_13_0=ruleAxis();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"axis",
                    							lv_axis_13_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Axis");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:568:3: (otherlv_14= 'calibration' ( (lv_calibration_15_0= ruleCalibration ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalKinematics.g:569:4: otherlv_14= 'calibration' ( (lv_calibration_15_0= ruleCalibration ) )
                    {
                    otherlv_14=(Token)match(input,31,FOLLOW_25); 

                    				newLeafNode(otherlv_14, grammarAccess.getJointAccess().getCalibrationKeyword_12_0());
                    			
                    // InternalKinematics.g:573:4: ( (lv_calibration_15_0= ruleCalibration ) )
                    // InternalKinematics.g:574:5: (lv_calibration_15_0= ruleCalibration )
                    {
                    // InternalKinematics.g:574:5: (lv_calibration_15_0= ruleCalibration )
                    // InternalKinematics.g:575:6: lv_calibration_15_0= ruleCalibration
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getCalibrationCalibrationParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_calibration_15_0=ruleCalibration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"calibration",
                    							lv_calibration_15_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Calibration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:593:3: (otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalKinematics.g:594:4: otherlv_16= 'dynamics' ( (lv_dynamics_17_0= ruleDynamics ) )
                    {
                    otherlv_16=(Token)match(input,32,FOLLOW_27); 

                    				newLeafNode(otherlv_16, grammarAccess.getJointAccess().getDynamicsKeyword_13_0());
                    			
                    // InternalKinematics.g:598:4: ( (lv_dynamics_17_0= ruleDynamics ) )
                    // InternalKinematics.g:599:5: (lv_dynamics_17_0= ruleDynamics )
                    {
                    // InternalKinematics.g:599:5: (lv_dynamics_17_0= ruleDynamics )
                    // InternalKinematics.g:600:6: lv_dynamics_17_0= ruleDynamics
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getDynamicsDynamicsParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_dynamics_17_0=ruleDynamics();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"dynamics",
                    							lv_dynamics_17_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Dynamics");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:618:3: (otherlv_18= 'limit' ( (lv_limit_19_0= ruleLimit ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalKinematics.g:619:4: otherlv_18= 'limit' ( (lv_limit_19_0= ruleLimit ) )
                    {
                    otherlv_18=(Token)match(input,33,FOLLOW_29); 

                    				newLeafNode(otherlv_18, grammarAccess.getJointAccess().getLimitKeyword_14_0());
                    			
                    // InternalKinematics.g:623:4: ( (lv_limit_19_0= ruleLimit ) )
                    // InternalKinematics.g:624:5: (lv_limit_19_0= ruleLimit )
                    {
                    // InternalKinematics.g:624:5: (lv_limit_19_0= ruleLimit )
                    // InternalKinematics.g:625:6: lv_limit_19_0= ruleLimit
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_limit_19_0=ruleLimit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"limit",
                    							lv_limit_19_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Limit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:643:3: (otherlv_20= 'safetyController' ( (lv_safetyController_21_0= ruleSafetyController ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalKinematics.g:644:4: otherlv_20= 'safetyController' ( (lv_safetyController_21_0= ruleSafetyController ) )
                    {
                    otherlv_20=(Token)match(input,34,FOLLOW_31); 

                    				newLeafNode(otherlv_20, grammarAccess.getJointAccess().getSafetyControllerKeyword_15_0());
                    			
                    // InternalKinematics.g:648:4: ( (lv_safetyController_21_0= ruleSafetyController ) )
                    // InternalKinematics.g:649:5: (lv_safetyController_21_0= ruleSafetyController )
                    {
                    // InternalKinematics.g:649:5: (lv_safetyController_21_0= ruleSafetyController )
                    // InternalKinematics.g:650:6: lv_safetyController_21_0= ruleSafetyController
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getSafetyControllerSafetyControllerParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_safetyController_21_0=ruleSafetyController();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"safetyController",
                    							lv_safetyController_21_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.SafetyController");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:668:3: (otherlv_22= 'mimic' ( (lv_mimic_23_0= ruleMimic ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalKinematics.g:669:4: otherlv_22= 'mimic' ( (lv_mimic_23_0= ruleMimic ) )
                    {
                    otherlv_22=(Token)match(input,35,FOLLOW_33); 

                    				newLeafNode(otherlv_22, grammarAccess.getJointAccess().getMimicKeyword_16_0());
                    			
                    // InternalKinematics.g:673:4: ( (lv_mimic_23_0= ruleMimic ) )
                    // InternalKinematics.g:674:5: (lv_mimic_23_0= ruleMimic )
                    {
                    // InternalKinematics.g:674:5: (lv_mimic_23_0= ruleMimic )
                    // InternalKinematics.g:675:6: lv_mimic_23_0= ruleMimic
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getMimicMimicParserRuleCall_16_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_mimic_23_0=ruleMimic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"mimic",
                    							lv_mimic_23_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Mimic");
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
    // InternalKinematics.g:701:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalKinematics.g:701:45: (iv_ruleLink= ruleLink EOF )
            // InternalKinematics.g:702:2: iv_ruleLink= ruleLink EOF
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
    // InternalKinematics.g:708:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'inertial' ( (lv_inertial_7_0= ruleInertial ) ) )? (otherlv_8= 'visual' ( (lv_visual_9_0= ruleVisual ) ) )? (otherlv_10= 'collision' ( (lv_collision_11_0= ruleCollision ) ) )? otherlv_12= '}' ) ;
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
            // InternalKinematics.g:714:2: ( (otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'inertial' ( (lv_inertial_7_0= ruleInertial ) ) )? (otherlv_8= 'visual' ( (lv_visual_9_0= ruleVisual ) ) )? (otherlv_10= 'collision' ( (lv_collision_11_0= ruleCollision ) ) )? otherlv_12= '}' ) )
            // InternalKinematics.g:715:2: (otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'inertial' ( (lv_inertial_7_0= ruleInertial ) ) )? (otherlv_8= 'visual' ( (lv_visual_9_0= ruleVisual ) ) )? (otherlv_10= 'collision' ( (lv_collision_11_0= ruleCollision ) ) )? otherlv_12= '}' )
            {
            // InternalKinematics.g:715:2: (otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'inertial' ( (lv_inertial_7_0= ruleInertial ) ) )? (otherlv_8= 'visual' ( (lv_visual_9_0= ruleVisual ) ) )? (otherlv_10= 'collision' ( (lv_collision_11_0= ruleCollision ) ) )? otherlv_12= '}' )
            // InternalKinematics.g:716:3: otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'inertial' ( (lv_inertial_7_0= ruleInertial ) ) )? (otherlv_8= 'visual' ( (lv_visual_9_0= ruleVisual ) ) )? (otherlv_10= 'collision' ( (lv_collision_11_0= ruleCollision ) ) )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getNameKeyword_2());
            		
            // InternalKinematics.g:728:3: ( (lv_name_3_0= ruleEString ) )
            // InternalKinematics.g:729:4: (lv_name_3_0= ruleEString )
            {
            // InternalKinematics.g:729:4: (lv_name_3_0= ruleEString )
            // InternalKinematics.g:730:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKinematics.g:747:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalKinematics.g:748:4: otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getTypeKeyword_4_0());
                    			
                    // InternalKinematics.g:752:4: ( (lv_type_5_0= ruleEString ) )
                    // InternalKinematics.g:753:5: (lv_type_5_0= ruleEString )
                    {
                    // InternalKinematics.g:753:5: (lv_type_5_0= ruleEString )
                    // InternalKinematics.g:754:6: lv_type_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLinkAccess().getTypeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_type_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:772:3: (otherlv_6= 'inertial' ( (lv_inertial_7_0= ruleInertial ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalKinematics.g:773:4: otherlv_6= 'inertial' ( (lv_inertial_7_0= ruleInertial ) )
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_36); 

                    				newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getInertialKeyword_5_0());
                    			
                    // InternalKinematics.g:777:4: ( (lv_inertial_7_0= ruleInertial ) )
                    // InternalKinematics.g:778:5: (lv_inertial_7_0= ruleInertial )
                    {
                    // InternalKinematics.g:778:5: (lv_inertial_7_0= ruleInertial )
                    // InternalKinematics.g:779:6: lv_inertial_7_0= ruleInertial
                    {

                    						newCompositeNode(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_inertial_7_0=ruleInertial();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    						}
                    						set(
                    							current,
                    							"inertial",
                    							lv_inertial_7_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Inertial");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:797:3: (otherlv_8= 'visual' ( (lv_visual_9_0= ruleVisual ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalKinematics.g:798:4: otherlv_8= 'visual' ( (lv_visual_9_0= ruleVisual ) )
                    {
                    otherlv_8=(Token)match(input,38,FOLLOW_38); 

                    				newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getVisualKeyword_6_0());
                    			
                    // InternalKinematics.g:802:4: ( (lv_visual_9_0= ruleVisual ) )
                    // InternalKinematics.g:803:5: (lv_visual_9_0= ruleVisual )
                    {
                    // InternalKinematics.g:803:5: (lv_visual_9_0= ruleVisual )
                    // InternalKinematics.g:804:6: lv_visual_9_0= ruleVisual
                    {

                    						newCompositeNode(grammarAccess.getLinkAccess().getVisualVisualParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_visual_9_0=ruleVisual();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    						}
                    						set(
                    							current,
                    							"visual",
                    							lv_visual_9_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Visual");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:822:3: (otherlv_10= 'collision' ( (lv_collision_11_0= ruleCollision ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalKinematics.g:823:4: otherlv_10= 'collision' ( (lv_collision_11_0= ruleCollision ) )
                    {
                    otherlv_10=(Token)match(input,39,FOLLOW_40); 

                    				newLeafNode(otherlv_10, grammarAccess.getLinkAccess().getCollisionKeyword_7_0());
                    			
                    // InternalKinematics.g:827:4: ( (lv_collision_11_0= ruleCollision ) )
                    // InternalKinematics.g:828:5: (lv_collision_11_0= ruleCollision )
                    {
                    // InternalKinematics.g:828:5: (lv_collision_11_0= ruleCollision )
                    // InternalKinematics.g:829:6: lv_collision_11_0= ruleCollision
                    {

                    						newCompositeNode(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_collision_11_0=ruleCollision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    						}
                    						set(
                    							current,
                    							"collision",
                    							lv_collision_11_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Collision");
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
    // InternalKinematics.g:855:1: entryRuleMaterialGlobal returns [EObject current=null] : iv_ruleMaterialGlobal= ruleMaterialGlobal EOF ;
    public final EObject entryRuleMaterialGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaterialGlobal = null;


        try {
            // InternalKinematics.g:855:55: (iv_ruleMaterialGlobal= ruleMaterialGlobal EOF )
            // InternalKinematics.g:856:2: iv_ruleMaterialGlobal= ruleMaterialGlobal EOF
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
    // InternalKinematics.g:862:1: ruleMaterialGlobal returns [EObject current=null] : (otherlv_0= 'MaterialGlobal' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )? (otherlv_6= 'texture' ( (lv_texture_7_0= ruleTexture ) ) )? otherlv_8= '}' ) ;
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
            // InternalKinematics.g:868:2: ( (otherlv_0= 'MaterialGlobal' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )? (otherlv_6= 'texture' ( (lv_texture_7_0= ruleTexture ) ) )? otherlv_8= '}' ) )
            // InternalKinematics.g:869:2: (otherlv_0= 'MaterialGlobal' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )? (otherlv_6= 'texture' ( (lv_texture_7_0= ruleTexture ) ) )? otherlv_8= '}' )
            {
            // InternalKinematics.g:869:2: (otherlv_0= 'MaterialGlobal' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )? (otherlv_6= 'texture' ( (lv_texture_7_0= ruleTexture ) ) )? otherlv_8= '}' )
            // InternalKinematics.g:870:3: otherlv_0= 'MaterialGlobal' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )? (otherlv_6= 'texture' ( (lv_texture_7_0= ruleTexture ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMaterialGlobalAccess().getMaterialGlobalKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMaterialGlobalAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMaterialGlobalAccess().getNameKeyword_2());
            		
            // InternalKinematics.g:882:3: ( (lv_name_3_0= ruleEString ) )
            // InternalKinematics.g:883:4: (lv_name_3_0= ruleEString )
            {
            // InternalKinematics.g:883:4: (lv_name_3_0= ruleEString )
            // InternalKinematics.g:884:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMaterialGlobalAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_41);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaterialGlobalRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKinematics.g:901:3: (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalKinematics.g:902:4: otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) )
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_42); 

                    				newLeafNode(otherlv_4, grammarAccess.getMaterialGlobalAccess().getColorKeyword_4_0());
                    			
                    // InternalKinematics.g:906:4: ( (lv_color_5_0= ruleColor ) )
                    // InternalKinematics.g:907:5: (lv_color_5_0= ruleColor )
                    {
                    // InternalKinematics.g:907:5: (lv_color_5_0= ruleColor )
                    // InternalKinematics.g:908:6: lv_color_5_0= ruleColor
                    {

                    						newCompositeNode(grammarAccess.getMaterialGlobalAccess().getColorColorParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_color_5_0=ruleColor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMaterialGlobalRule());
                    						}
                    						set(
                    							current,
                    							"color",
                    							lv_color_5_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:926:3: (otherlv_6= 'texture' ( (lv_texture_7_0= ruleTexture ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalKinematics.g:927:4: otherlv_6= 'texture' ( (lv_texture_7_0= ruleTexture ) )
                    {
                    otherlv_6=(Token)match(input,42,FOLLOW_44); 

                    				newLeafNode(otherlv_6, grammarAccess.getMaterialGlobalAccess().getTextureKeyword_5_0());
                    			
                    // InternalKinematics.g:931:4: ( (lv_texture_7_0= ruleTexture ) )
                    // InternalKinematics.g:932:5: (lv_texture_7_0= ruleTexture )
                    {
                    // InternalKinematics.g:932:5: (lv_texture_7_0= ruleTexture )
                    // InternalKinematics.g:933:6: lv_texture_7_0= ruleTexture
                    {

                    						newCompositeNode(grammarAccess.getMaterialGlobalAccess().getTextureTextureParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_texture_7_0=ruleTexture();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMaterialGlobalRule());
                    						}
                    						set(
                    							current,
                    							"texture",
                    							lv_texture_7_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Texture");
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
    // InternalKinematics.g:959:1: entryRuleTransmission returns [EObject current=null] : iv_ruleTransmission= ruleTransmission EOF ;
    public final EObject entryRuleTransmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransmission = null;


        try {
            // InternalKinematics.g:959:53: (iv_ruleTransmission= ruleTransmission EOF )
            // InternalKinematics.g:960:2: iv_ruleTransmission= ruleTransmission EOF
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
    // InternalKinematics.g:966:1: ruleTransmission returns [EObject current=null] : (otherlv_0= 'Transmission' otherlv_1= '{' (otherlv_2= 'mechanicalReduction' otherlv_3= '{' ( (lv_mechanicalReduction_4_0= ruleDouble0 ) ) (otherlv_5= ',' ( (lv_mechanicalReduction_6_0= ruleDouble0 ) ) )* otherlv_7= '}' )? otherlv_8= 'name' ( (lv_name_9_0= ruleEString ) ) otherlv_10= 'type' ( (lv_type_11_0= ruleEString ) ) (otherlv_12= 'leftActuator' otherlv_13= '{' ( (lv_leftActuator_14_0= ruleActuatorTransmission ) ) (otherlv_15= ',' ( (lv_leftActuator_16_0= ruleActuatorTransmission ) ) )* otherlv_17= '}' )? (otherlv_18= 'rightActuator' otherlv_19= '{' ( (lv_rightActuator_20_0= ruleActuatorTransmission ) ) (otherlv_21= ',' ( (lv_rightActuator_22_0= ruleActuatorTransmission ) ) )* otherlv_23= '}' )? (otherlv_24= 'flexJoint' otherlv_25= '{' ( (lv_flexJoint_26_0= ruleActuatorTransmission ) ) (otherlv_27= ',' ( (lv_flexJoint_28_0= ruleActuatorTransmission ) ) )* otherlv_29= '}' )? (otherlv_30= 'rollJoint' otherlv_31= '{' ( (lv_rollJoint_32_0= ruleActuatorTransmission ) ) (otherlv_33= ',' ( (lv_rollJoint_34_0= ruleActuatorTransmission ) ) )* otherlv_35= '}' )? (otherlv_36= 'gapJoint' otherlv_37= '{' ( (lv_gapJoint_38_0= ruleGapJointTransmission ) ) (otherlv_39= ',' ( (lv_gapJoint_40_0= ruleGapJointTransmission ) ) )* otherlv_41= '}' )? (otherlv_42= 'passiveJoint' otherlv_43= '{' ( (lv_passiveJoint_44_0= rulePassiveJointTransmission ) ) (otherlv_45= ',' ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) ) )* otherlv_47= '}' )? (otherlv_48= 'useSimulatedGripperJoint' otherlv_49= '{' ( (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType ) ) (otherlv_51= ',' ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) ) )* otherlv_53= '}' )? (otherlv_54= 'actuator' otherlv_55= '{' ( (lv_actuator_56_0= ruleName ) ) (otherlv_57= ',' ( (lv_actuator_58_0= ruleName ) ) )* otherlv_59= '}' )? (otherlv_60= 'joint' otherlv_61= '{' ( (lv_joint_62_0= ruleName ) ) (otherlv_63= ',' ( (lv_joint_64_0= ruleName ) ) )* otherlv_65= '}' )? otherlv_66= '}' ) ;
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
            // InternalKinematics.g:972:2: ( (otherlv_0= 'Transmission' otherlv_1= '{' (otherlv_2= 'mechanicalReduction' otherlv_3= '{' ( (lv_mechanicalReduction_4_0= ruleDouble0 ) ) (otherlv_5= ',' ( (lv_mechanicalReduction_6_0= ruleDouble0 ) ) )* otherlv_7= '}' )? otherlv_8= 'name' ( (lv_name_9_0= ruleEString ) ) otherlv_10= 'type' ( (lv_type_11_0= ruleEString ) ) (otherlv_12= 'leftActuator' otherlv_13= '{' ( (lv_leftActuator_14_0= ruleActuatorTransmission ) ) (otherlv_15= ',' ( (lv_leftActuator_16_0= ruleActuatorTransmission ) ) )* otherlv_17= '}' )? (otherlv_18= 'rightActuator' otherlv_19= '{' ( (lv_rightActuator_20_0= ruleActuatorTransmission ) ) (otherlv_21= ',' ( (lv_rightActuator_22_0= ruleActuatorTransmission ) ) )* otherlv_23= '}' )? (otherlv_24= 'flexJoint' otherlv_25= '{' ( (lv_flexJoint_26_0= ruleActuatorTransmission ) ) (otherlv_27= ',' ( (lv_flexJoint_28_0= ruleActuatorTransmission ) ) )* otherlv_29= '}' )? (otherlv_30= 'rollJoint' otherlv_31= '{' ( (lv_rollJoint_32_0= ruleActuatorTransmission ) ) (otherlv_33= ',' ( (lv_rollJoint_34_0= ruleActuatorTransmission ) ) )* otherlv_35= '}' )? (otherlv_36= 'gapJoint' otherlv_37= '{' ( (lv_gapJoint_38_0= ruleGapJointTransmission ) ) (otherlv_39= ',' ( (lv_gapJoint_40_0= ruleGapJointTransmission ) ) )* otherlv_41= '}' )? (otherlv_42= 'passiveJoint' otherlv_43= '{' ( (lv_passiveJoint_44_0= rulePassiveJointTransmission ) ) (otherlv_45= ',' ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) ) )* otherlv_47= '}' )? (otherlv_48= 'useSimulatedGripperJoint' otherlv_49= '{' ( (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType ) ) (otherlv_51= ',' ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) ) )* otherlv_53= '}' )? (otherlv_54= 'actuator' otherlv_55= '{' ( (lv_actuator_56_0= ruleName ) ) (otherlv_57= ',' ( (lv_actuator_58_0= ruleName ) ) )* otherlv_59= '}' )? (otherlv_60= 'joint' otherlv_61= '{' ( (lv_joint_62_0= ruleName ) ) (otherlv_63= ',' ( (lv_joint_64_0= ruleName ) ) )* otherlv_65= '}' )? otherlv_66= '}' ) )
            // InternalKinematics.g:973:2: (otherlv_0= 'Transmission' otherlv_1= '{' (otherlv_2= 'mechanicalReduction' otherlv_3= '{' ( (lv_mechanicalReduction_4_0= ruleDouble0 ) ) (otherlv_5= ',' ( (lv_mechanicalReduction_6_0= ruleDouble0 ) ) )* otherlv_7= '}' )? otherlv_8= 'name' ( (lv_name_9_0= ruleEString ) ) otherlv_10= 'type' ( (lv_type_11_0= ruleEString ) ) (otherlv_12= 'leftActuator' otherlv_13= '{' ( (lv_leftActuator_14_0= ruleActuatorTransmission ) ) (otherlv_15= ',' ( (lv_leftActuator_16_0= ruleActuatorTransmission ) ) )* otherlv_17= '}' )? (otherlv_18= 'rightActuator' otherlv_19= '{' ( (lv_rightActuator_20_0= ruleActuatorTransmission ) ) (otherlv_21= ',' ( (lv_rightActuator_22_0= ruleActuatorTransmission ) ) )* otherlv_23= '}' )? (otherlv_24= 'flexJoint' otherlv_25= '{' ( (lv_flexJoint_26_0= ruleActuatorTransmission ) ) (otherlv_27= ',' ( (lv_flexJoint_28_0= ruleActuatorTransmission ) ) )* otherlv_29= '}' )? (otherlv_30= 'rollJoint' otherlv_31= '{' ( (lv_rollJoint_32_0= ruleActuatorTransmission ) ) (otherlv_33= ',' ( (lv_rollJoint_34_0= ruleActuatorTransmission ) ) )* otherlv_35= '}' )? (otherlv_36= 'gapJoint' otherlv_37= '{' ( (lv_gapJoint_38_0= ruleGapJointTransmission ) ) (otherlv_39= ',' ( (lv_gapJoint_40_0= ruleGapJointTransmission ) ) )* otherlv_41= '}' )? (otherlv_42= 'passiveJoint' otherlv_43= '{' ( (lv_passiveJoint_44_0= rulePassiveJointTransmission ) ) (otherlv_45= ',' ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) ) )* otherlv_47= '}' )? (otherlv_48= 'useSimulatedGripperJoint' otherlv_49= '{' ( (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType ) ) (otherlv_51= ',' ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) ) )* otherlv_53= '}' )? (otherlv_54= 'actuator' otherlv_55= '{' ( (lv_actuator_56_0= ruleName ) ) (otherlv_57= ',' ( (lv_actuator_58_0= ruleName ) ) )* otherlv_59= '}' )? (otherlv_60= 'joint' otherlv_61= '{' ( (lv_joint_62_0= ruleName ) ) (otherlv_63= ',' ( (lv_joint_64_0= ruleName ) ) )* otherlv_65= '}' )? otherlv_66= '}' )
            {
            // InternalKinematics.g:973:2: (otherlv_0= 'Transmission' otherlv_1= '{' (otherlv_2= 'mechanicalReduction' otherlv_3= '{' ( (lv_mechanicalReduction_4_0= ruleDouble0 ) ) (otherlv_5= ',' ( (lv_mechanicalReduction_6_0= ruleDouble0 ) ) )* otherlv_7= '}' )? otherlv_8= 'name' ( (lv_name_9_0= ruleEString ) ) otherlv_10= 'type' ( (lv_type_11_0= ruleEString ) ) (otherlv_12= 'leftActuator' otherlv_13= '{' ( (lv_leftActuator_14_0= ruleActuatorTransmission ) ) (otherlv_15= ',' ( (lv_leftActuator_16_0= ruleActuatorTransmission ) ) )* otherlv_17= '}' )? (otherlv_18= 'rightActuator' otherlv_19= '{' ( (lv_rightActuator_20_0= ruleActuatorTransmission ) ) (otherlv_21= ',' ( (lv_rightActuator_22_0= ruleActuatorTransmission ) ) )* otherlv_23= '}' )? (otherlv_24= 'flexJoint' otherlv_25= '{' ( (lv_flexJoint_26_0= ruleActuatorTransmission ) ) (otherlv_27= ',' ( (lv_flexJoint_28_0= ruleActuatorTransmission ) ) )* otherlv_29= '}' )? (otherlv_30= 'rollJoint' otherlv_31= '{' ( (lv_rollJoint_32_0= ruleActuatorTransmission ) ) (otherlv_33= ',' ( (lv_rollJoint_34_0= ruleActuatorTransmission ) ) )* otherlv_35= '}' )? (otherlv_36= 'gapJoint' otherlv_37= '{' ( (lv_gapJoint_38_0= ruleGapJointTransmission ) ) (otherlv_39= ',' ( (lv_gapJoint_40_0= ruleGapJointTransmission ) ) )* otherlv_41= '}' )? (otherlv_42= 'passiveJoint' otherlv_43= '{' ( (lv_passiveJoint_44_0= rulePassiveJointTransmission ) ) (otherlv_45= ',' ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) ) )* otherlv_47= '}' )? (otherlv_48= 'useSimulatedGripperJoint' otherlv_49= '{' ( (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType ) ) (otherlv_51= ',' ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) ) )* otherlv_53= '}' )? (otherlv_54= 'actuator' otherlv_55= '{' ( (lv_actuator_56_0= ruleName ) ) (otherlv_57= ',' ( (lv_actuator_58_0= ruleName ) ) )* otherlv_59= '}' )? (otherlv_60= 'joint' otherlv_61= '{' ( (lv_joint_62_0= ruleName ) ) (otherlv_63= ',' ( (lv_joint_64_0= ruleName ) ) )* otherlv_65= '}' )? otherlv_66= '}' )
            // InternalKinematics.g:974:3: otherlv_0= 'Transmission' otherlv_1= '{' (otherlv_2= 'mechanicalReduction' otherlv_3= '{' ( (lv_mechanicalReduction_4_0= ruleDouble0 ) ) (otherlv_5= ',' ( (lv_mechanicalReduction_6_0= ruleDouble0 ) ) )* otherlv_7= '}' )? otherlv_8= 'name' ( (lv_name_9_0= ruleEString ) ) otherlv_10= 'type' ( (lv_type_11_0= ruleEString ) ) (otherlv_12= 'leftActuator' otherlv_13= '{' ( (lv_leftActuator_14_0= ruleActuatorTransmission ) ) (otherlv_15= ',' ( (lv_leftActuator_16_0= ruleActuatorTransmission ) ) )* otherlv_17= '}' )? (otherlv_18= 'rightActuator' otherlv_19= '{' ( (lv_rightActuator_20_0= ruleActuatorTransmission ) ) (otherlv_21= ',' ( (lv_rightActuator_22_0= ruleActuatorTransmission ) ) )* otherlv_23= '}' )? (otherlv_24= 'flexJoint' otherlv_25= '{' ( (lv_flexJoint_26_0= ruleActuatorTransmission ) ) (otherlv_27= ',' ( (lv_flexJoint_28_0= ruleActuatorTransmission ) ) )* otherlv_29= '}' )? (otherlv_30= 'rollJoint' otherlv_31= '{' ( (lv_rollJoint_32_0= ruleActuatorTransmission ) ) (otherlv_33= ',' ( (lv_rollJoint_34_0= ruleActuatorTransmission ) ) )* otherlv_35= '}' )? (otherlv_36= 'gapJoint' otherlv_37= '{' ( (lv_gapJoint_38_0= ruleGapJointTransmission ) ) (otherlv_39= ',' ( (lv_gapJoint_40_0= ruleGapJointTransmission ) ) )* otherlv_41= '}' )? (otherlv_42= 'passiveJoint' otherlv_43= '{' ( (lv_passiveJoint_44_0= rulePassiveJointTransmission ) ) (otherlv_45= ',' ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) ) )* otherlv_47= '}' )? (otherlv_48= 'useSimulatedGripperJoint' otherlv_49= '{' ( (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType ) ) (otherlv_51= ',' ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) ) )* otherlv_53= '}' )? (otherlv_54= 'actuator' otherlv_55= '{' ( (lv_actuator_56_0= ruleName ) ) (otherlv_57= ',' ( (lv_actuator_58_0= ruleName ) ) )* otherlv_59= '}' )? (otherlv_60= 'joint' otherlv_61= '{' ( (lv_joint_62_0= ruleName ) ) (otherlv_63= ',' ( (lv_joint_64_0= ruleName ) ) )* otherlv_65= '}' )? otherlv_66= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransmissionAccess().getTransmissionKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalKinematics.g:982:3: (otherlv_2= 'mechanicalReduction' otherlv_3= '{' ( (lv_mechanicalReduction_4_0= ruleDouble0 ) ) (otherlv_5= ',' ( (lv_mechanicalReduction_6_0= ruleDouble0 ) ) )* otherlv_7= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==44) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalKinematics.g:983:4: otherlv_2= 'mechanicalReduction' otherlv_3= '{' ( (lv_mechanicalReduction_4_0= ruleDouble0 ) ) (otherlv_5= ',' ( (lv_mechanicalReduction_6_0= ruleDouble0 ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getTransmissionAccess().getMechanicalReductionKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,16,FOLLOW_46); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalKinematics.g:991:4: ( (lv_mechanicalReduction_4_0= ruleDouble0 ) )
                    // InternalKinematics.g:992:5: (lv_mechanicalReduction_4_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:992:5: (lv_mechanicalReduction_4_0= ruleDouble0 )
                    // InternalKinematics.g:993:6: lv_mechanicalReduction_4_0= ruleDouble0
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
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKinematics.g:1010:4: (otherlv_5= ',' ( (lv_mechanicalReduction_6_0= ruleDouble0 ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==20) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalKinematics.g:1011:5: otherlv_5= ',' ( (lv_mechanicalReduction_6_0= ruleDouble0 ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FOLLOW_46); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getTransmissionAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalKinematics.g:1015:5: ( (lv_mechanicalReduction_6_0= ruleDouble0 ) )
                    	    // InternalKinematics.g:1016:6: (lv_mechanicalReduction_6_0= ruleDouble0 )
                    	    {
                    	    // InternalKinematics.g:1016:6: (lv_mechanicalReduction_6_0= ruleDouble0 )
                    	    // InternalKinematics.g:1017:7: lv_mechanicalReduction_6_0= ruleDouble0
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
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getTransmissionAccess().getNameKeyword_3());
            		
            // InternalKinematics.g:1044:3: ( (lv_name_9_0= ruleEString ) )
            // InternalKinematics.g:1045:4: (lv_name_9_0= ruleEString )
            {
            // InternalKinematics.g:1045:4: (lv_name_9_0= ruleEString )
            // InternalKinematics.g:1046:5: lv_name_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransmissionAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_9_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransmissionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_9_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getTransmissionAccess().getTypeKeyword_5());
            		
            // InternalKinematics.g:1067:3: ( (lv_type_11_0= ruleEString ) )
            // InternalKinematics.g:1068:4: (lv_type_11_0= ruleEString )
            {
            // InternalKinematics.g:1068:4: (lv_type_11_0= ruleEString )
            // InternalKinematics.g:1069:5: lv_type_11_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransmissionAccess().getTypeEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_47);
            lv_type_11_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransmissionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_11_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKinematics.g:1086:3: (otherlv_12= 'leftActuator' otherlv_13= '{' ( (lv_leftActuator_14_0= ruleActuatorTransmission ) ) (otherlv_15= ',' ( (lv_leftActuator_16_0= ruleActuatorTransmission ) ) )* otherlv_17= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalKinematics.g:1087:4: otherlv_12= 'leftActuator' otherlv_13= '{' ( (lv_leftActuator_14_0= ruleActuatorTransmission ) ) (otherlv_15= ',' ( (lv_leftActuator_16_0= ruleActuatorTransmission ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getTransmissionAccess().getLeftActuatorKeyword_7_0());
                    			
                    otherlv_13=(Token)match(input,16,FOLLOW_48); 

                    				newLeafNode(otherlv_13, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalKinematics.g:1095:4: ( (lv_leftActuator_14_0= ruleActuatorTransmission ) )
                    // InternalKinematics.g:1096:5: (lv_leftActuator_14_0= ruleActuatorTransmission )
                    {
                    // InternalKinematics.g:1096:5: (lv_leftActuator_14_0= ruleActuatorTransmission )
                    // InternalKinematics.g:1097:6: lv_leftActuator_14_0= ruleActuatorTransmission
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
                    							"de.fraunhofer.ipa.kinematics.Kinematics.ActuatorTransmission");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKinematics.g:1114:4: (otherlv_15= ',' ( (lv_leftActuator_16_0= ruleActuatorTransmission ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==20) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalKinematics.g:1115:5: otherlv_15= ',' ( (lv_leftActuator_16_0= ruleActuatorTransmission ) )
                    	    {
                    	    otherlv_15=(Token)match(input,20,FOLLOW_48); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getTransmissionAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalKinematics.g:1119:5: ( (lv_leftActuator_16_0= ruleActuatorTransmission ) )
                    	    // InternalKinematics.g:1120:6: (lv_leftActuator_16_0= ruleActuatorTransmission )
                    	    {
                    	    // InternalKinematics.g:1120:6: (lv_leftActuator_16_0= ruleActuatorTransmission )
                    	    // InternalKinematics.g:1121:7: lv_leftActuator_16_0= ruleActuatorTransmission
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
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.ActuatorTransmission");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,21,FOLLOW_49); 

                    				newLeafNode(otherlv_17, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalKinematics.g:1144:3: (otherlv_18= 'rightActuator' otherlv_19= '{' ( (lv_rightActuator_20_0= ruleActuatorTransmission ) ) (otherlv_21= ',' ( (lv_rightActuator_22_0= ruleActuatorTransmission ) ) )* otherlv_23= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==46) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalKinematics.g:1145:4: otherlv_18= 'rightActuator' otherlv_19= '{' ( (lv_rightActuator_20_0= ruleActuatorTransmission ) ) (otherlv_21= ',' ( (lv_rightActuator_22_0= ruleActuatorTransmission ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getTransmissionAccess().getRightActuatorKeyword_8_0());
                    			
                    otherlv_19=(Token)match(input,16,FOLLOW_48); 

                    				newLeafNode(otherlv_19, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalKinematics.g:1153:4: ( (lv_rightActuator_20_0= ruleActuatorTransmission ) )
                    // InternalKinematics.g:1154:5: (lv_rightActuator_20_0= ruleActuatorTransmission )
                    {
                    // InternalKinematics.g:1154:5: (lv_rightActuator_20_0= ruleActuatorTransmission )
                    // InternalKinematics.g:1155:6: lv_rightActuator_20_0= ruleActuatorTransmission
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
                    							"de.fraunhofer.ipa.kinematics.Kinematics.ActuatorTransmission");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKinematics.g:1172:4: (otherlv_21= ',' ( (lv_rightActuator_22_0= ruleActuatorTransmission ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==20) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalKinematics.g:1173:5: otherlv_21= ',' ( (lv_rightActuator_22_0= ruleActuatorTransmission ) )
                    	    {
                    	    otherlv_21=(Token)match(input,20,FOLLOW_48); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getTransmissionAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalKinematics.g:1177:5: ( (lv_rightActuator_22_0= ruleActuatorTransmission ) )
                    	    // InternalKinematics.g:1178:6: (lv_rightActuator_22_0= ruleActuatorTransmission )
                    	    {
                    	    // InternalKinematics.g:1178:6: (lv_rightActuator_22_0= ruleActuatorTransmission )
                    	    // InternalKinematics.g:1179:7: lv_rightActuator_22_0= ruleActuatorTransmission
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
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.ActuatorTransmission");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,21,FOLLOW_50); 

                    				newLeafNode(otherlv_23, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalKinematics.g:1202:3: (otherlv_24= 'flexJoint' otherlv_25= '{' ( (lv_flexJoint_26_0= ruleActuatorTransmission ) ) (otherlv_27= ',' ( (lv_flexJoint_28_0= ruleActuatorTransmission ) ) )* otherlv_29= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==47) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalKinematics.g:1203:4: otherlv_24= 'flexJoint' otherlv_25= '{' ( (lv_flexJoint_26_0= ruleActuatorTransmission ) ) (otherlv_27= ',' ( (lv_flexJoint_28_0= ruleActuatorTransmission ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getTransmissionAccess().getFlexJointKeyword_9_0());
                    			
                    otherlv_25=(Token)match(input,16,FOLLOW_48); 

                    				newLeafNode(otherlv_25, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalKinematics.g:1211:4: ( (lv_flexJoint_26_0= ruleActuatorTransmission ) )
                    // InternalKinematics.g:1212:5: (lv_flexJoint_26_0= ruleActuatorTransmission )
                    {
                    // InternalKinematics.g:1212:5: (lv_flexJoint_26_0= ruleActuatorTransmission )
                    // InternalKinematics.g:1213:6: lv_flexJoint_26_0= ruleActuatorTransmission
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
                    							"de.fraunhofer.ipa.kinematics.Kinematics.ActuatorTransmission");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKinematics.g:1230:4: (otherlv_27= ',' ( (lv_flexJoint_28_0= ruleActuatorTransmission ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==20) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalKinematics.g:1231:5: otherlv_27= ',' ( (lv_flexJoint_28_0= ruleActuatorTransmission ) )
                    	    {
                    	    otherlv_27=(Token)match(input,20,FOLLOW_48); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getTransmissionAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalKinematics.g:1235:5: ( (lv_flexJoint_28_0= ruleActuatorTransmission ) )
                    	    // InternalKinematics.g:1236:6: (lv_flexJoint_28_0= ruleActuatorTransmission )
                    	    {
                    	    // InternalKinematics.g:1236:6: (lv_flexJoint_28_0= ruleActuatorTransmission )
                    	    // InternalKinematics.g:1237:7: lv_flexJoint_28_0= ruleActuatorTransmission
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
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.ActuatorTransmission");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,21,FOLLOW_51); 

                    				newLeafNode(otherlv_29, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalKinematics.g:1260:3: (otherlv_30= 'rollJoint' otherlv_31= '{' ( (lv_rollJoint_32_0= ruleActuatorTransmission ) ) (otherlv_33= ',' ( (lv_rollJoint_34_0= ruleActuatorTransmission ) ) )* otherlv_35= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==48) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalKinematics.g:1261:4: otherlv_30= 'rollJoint' otherlv_31= '{' ( (lv_rollJoint_32_0= ruleActuatorTransmission ) ) (otherlv_33= ',' ( (lv_rollJoint_34_0= ruleActuatorTransmission ) ) )* otherlv_35= '}'
                    {
                    otherlv_30=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_30, grammarAccess.getTransmissionAccess().getRollJointKeyword_10_0());
                    			
                    otherlv_31=(Token)match(input,16,FOLLOW_48); 

                    				newLeafNode(otherlv_31, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalKinematics.g:1269:4: ( (lv_rollJoint_32_0= ruleActuatorTransmission ) )
                    // InternalKinematics.g:1270:5: (lv_rollJoint_32_0= ruleActuatorTransmission )
                    {
                    // InternalKinematics.g:1270:5: (lv_rollJoint_32_0= ruleActuatorTransmission )
                    // InternalKinematics.g:1271:6: lv_rollJoint_32_0= ruleActuatorTransmission
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
                    							"de.fraunhofer.ipa.kinematics.Kinematics.ActuatorTransmission");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKinematics.g:1288:4: (otherlv_33= ',' ( (lv_rollJoint_34_0= ruleActuatorTransmission ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==20) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalKinematics.g:1289:5: otherlv_33= ',' ( (lv_rollJoint_34_0= ruleActuatorTransmission ) )
                    	    {
                    	    otherlv_33=(Token)match(input,20,FOLLOW_48); 

                    	    					newLeafNode(otherlv_33, grammarAccess.getTransmissionAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalKinematics.g:1293:5: ( (lv_rollJoint_34_0= ruleActuatorTransmission ) )
                    	    // InternalKinematics.g:1294:6: (lv_rollJoint_34_0= ruleActuatorTransmission )
                    	    {
                    	    // InternalKinematics.g:1294:6: (lv_rollJoint_34_0= ruleActuatorTransmission )
                    	    // InternalKinematics.g:1295:7: lv_rollJoint_34_0= ruleActuatorTransmission
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
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.ActuatorTransmission");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,21,FOLLOW_52); 

                    				newLeafNode(otherlv_35, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalKinematics.g:1318:3: (otherlv_36= 'gapJoint' otherlv_37= '{' ( (lv_gapJoint_38_0= ruleGapJointTransmission ) ) (otherlv_39= ',' ( (lv_gapJoint_40_0= ruleGapJointTransmission ) ) )* otherlv_41= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==49) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalKinematics.g:1319:4: otherlv_36= 'gapJoint' otherlv_37= '{' ( (lv_gapJoint_38_0= ruleGapJointTransmission ) ) (otherlv_39= ',' ( (lv_gapJoint_40_0= ruleGapJointTransmission ) ) )* otherlv_41= '}'
                    {
                    otherlv_36=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_36, grammarAccess.getTransmissionAccess().getGapJointKeyword_11_0());
                    			
                    otherlv_37=(Token)match(input,16,FOLLOW_53); 

                    				newLeafNode(otherlv_37, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalKinematics.g:1327:4: ( (lv_gapJoint_38_0= ruleGapJointTransmission ) )
                    // InternalKinematics.g:1328:5: (lv_gapJoint_38_0= ruleGapJointTransmission )
                    {
                    // InternalKinematics.g:1328:5: (lv_gapJoint_38_0= ruleGapJointTransmission )
                    // InternalKinematics.g:1329:6: lv_gapJoint_38_0= ruleGapJointTransmission
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
                    							"de.fraunhofer.ipa.kinematics.Kinematics.GapJointTransmission");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKinematics.g:1346:4: (otherlv_39= ',' ( (lv_gapJoint_40_0= ruleGapJointTransmission ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==20) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalKinematics.g:1347:5: otherlv_39= ',' ( (lv_gapJoint_40_0= ruleGapJointTransmission ) )
                    	    {
                    	    otherlv_39=(Token)match(input,20,FOLLOW_53); 

                    	    					newLeafNode(otherlv_39, grammarAccess.getTransmissionAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalKinematics.g:1351:5: ( (lv_gapJoint_40_0= ruleGapJointTransmission ) )
                    	    // InternalKinematics.g:1352:6: (lv_gapJoint_40_0= ruleGapJointTransmission )
                    	    {
                    	    // InternalKinematics.g:1352:6: (lv_gapJoint_40_0= ruleGapJointTransmission )
                    	    // InternalKinematics.g:1353:7: lv_gapJoint_40_0= ruleGapJointTransmission
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
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.GapJointTransmission");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_41=(Token)match(input,21,FOLLOW_54); 

                    				newLeafNode(otherlv_41, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalKinematics.g:1376:3: (otherlv_42= 'passiveJoint' otherlv_43= '{' ( (lv_passiveJoint_44_0= rulePassiveJointTransmission ) ) (otherlv_45= ',' ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) ) )* otherlv_47= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==50) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalKinematics.g:1377:4: otherlv_42= 'passiveJoint' otherlv_43= '{' ( (lv_passiveJoint_44_0= rulePassiveJointTransmission ) ) (otherlv_45= ',' ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) ) )* otherlv_47= '}'
                    {
                    otherlv_42=(Token)match(input,50,FOLLOW_3); 

                    				newLeafNode(otherlv_42, grammarAccess.getTransmissionAccess().getPassiveJointKeyword_12_0());
                    			
                    otherlv_43=(Token)match(input,16,FOLLOW_55); 

                    				newLeafNode(otherlv_43, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalKinematics.g:1385:4: ( (lv_passiveJoint_44_0= rulePassiveJointTransmission ) )
                    // InternalKinematics.g:1386:5: (lv_passiveJoint_44_0= rulePassiveJointTransmission )
                    {
                    // InternalKinematics.g:1386:5: (lv_passiveJoint_44_0= rulePassiveJointTransmission )
                    // InternalKinematics.g:1387:6: lv_passiveJoint_44_0= rulePassiveJointTransmission
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
                    							"de.fraunhofer.ipa.kinematics.Kinematics.PassiveJointTransmission");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKinematics.g:1404:4: (otherlv_45= ',' ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==20) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalKinematics.g:1405:5: otherlv_45= ',' ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) )
                    	    {
                    	    otherlv_45=(Token)match(input,20,FOLLOW_55); 

                    	    					newLeafNode(otherlv_45, grammarAccess.getTransmissionAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalKinematics.g:1409:5: ( (lv_passiveJoint_46_0= rulePassiveJointTransmission ) )
                    	    // InternalKinematics.g:1410:6: (lv_passiveJoint_46_0= rulePassiveJointTransmission )
                    	    {
                    	    // InternalKinematics.g:1410:6: (lv_passiveJoint_46_0= rulePassiveJointTransmission )
                    	    // InternalKinematics.g:1411:7: lv_passiveJoint_46_0= rulePassiveJointTransmission
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
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.PassiveJointTransmission");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_47=(Token)match(input,21,FOLLOW_56); 

                    				newLeafNode(otherlv_47, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalKinematics.g:1434:3: (otherlv_48= 'useSimulatedGripperJoint' otherlv_49= '{' ( (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType ) ) (otherlv_51= ',' ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) ) )* otherlv_53= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==51) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalKinematics.g:1435:4: otherlv_48= 'useSimulatedGripperJoint' otherlv_49= '{' ( (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType ) ) (otherlv_51= ',' ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) ) )* otherlv_53= '}'
                    {
                    otherlv_48=(Token)match(input,51,FOLLOW_3); 

                    				newLeafNode(otherlv_48, grammarAccess.getTransmissionAccess().getUseSimulatedGripperJointKeyword_13_0());
                    			
                    otherlv_49=(Token)match(input,16,FOLLOW_57); 

                    				newLeafNode(otherlv_49, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalKinematics.g:1443:4: ( (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType ) )
                    // InternalKinematics.g:1444:5: (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType )
                    {
                    // InternalKinematics.g:1444:5: (lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType )
                    // InternalKinematics.g:1445:6: lv_useSimulatedGripperJoint_50_0= ruleUseSimulatedGripperJointType
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
                    							"de.fraunhofer.ipa.kinematics.Kinematics.UseSimulatedGripperJointType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKinematics.g:1462:4: (otherlv_51= ',' ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==20) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalKinematics.g:1463:5: otherlv_51= ',' ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) )
                    	    {
                    	    otherlv_51=(Token)match(input,20,FOLLOW_57); 

                    	    					newLeafNode(otherlv_51, grammarAccess.getTransmissionAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalKinematics.g:1467:5: ( (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType ) )
                    	    // InternalKinematics.g:1468:6: (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType )
                    	    {
                    	    // InternalKinematics.g:1468:6: (lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType )
                    	    // InternalKinematics.g:1469:7: lv_useSimulatedGripperJoint_52_0= ruleUseSimulatedGripperJointType
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
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.UseSimulatedGripperJointType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_53=(Token)match(input,21,FOLLOW_58); 

                    				newLeafNode(otherlv_53, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            // InternalKinematics.g:1492:3: (otherlv_54= 'actuator' otherlv_55= '{' ( (lv_actuator_56_0= ruleName ) ) (otherlv_57= ',' ( (lv_actuator_58_0= ruleName ) ) )* otherlv_59= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==52) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalKinematics.g:1493:4: otherlv_54= 'actuator' otherlv_55= '{' ( (lv_actuator_56_0= ruleName ) ) (otherlv_57= ',' ( (lv_actuator_58_0= ruleName ) ) )* otherlv_59= '}'
                    {
                    otherlv_54=(Token)match(input,52,FOLLOW_3); 

                    				newLeafNode(otherlv_54, grammarAccess.getTransmissionAccess().getActuatorKeyword_14_0());
                    			
                    otherlv_55=(Token)match(input,16,FOLLOW_59); 

                    				newLeafNode(otherlv_55, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalKinematics.g:1501:4: ( (lv_actuator_56_0= ruleName ) )
                    // InternalKinematics.g:1502:5: (lv_actuator_56_0= ruleName )
                    {
                    // InternalKinematics.g:1502:5: (lv_actuator_56_0= ruleName )
                    // InternalKinematics.g:1503:6: lv_actuator_56_0= ruleName
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
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKinematics.g:1520:4: (otherlv_57= ',' ( (lv_actuator_58_0= ruleName ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==20) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalKinematics.g:1521:5: otherlv_57= ',' ( (lv_actuator_58_0= ruleName ) )
                    	    {
                    	    otherlv_57=(Token)match(input,20,FOLLOW_59); 

                    	    					newLeafNode(otherlv_57, grammarAccess.getTransmissionAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalKinematics.g:1525:5: ( (lv_actuator_58_0= ruleName ) )
                    	    // InternalKinematics.g:1526:6: (lv_actuator_58_0= ruleName )
                    	    {
                    	    // InternalKinematics.g:1526:6: (lv_actuator_58_0= ruleName )
                    	    // InternalKinematics.g:1527:7: lv_actuator_58_0= ruleName
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
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.Name");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_59=(Token)match(input,21,FOLLOW_60); 

                    				newLeafNode(otherlv_59, grammarAccess.getTransmissionAccess().getRightCurlyBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            // InternalKinematics.g:1550:3: (otherlv_60= 'joint' otherlv_61= '{' ( (lv_joint_62_0= ruleName ) ) (otherlv_63= ',' ( (lv_joint_64_0= ruleName ) ) )* otherlv_65= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==22) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalKinematics.g:1551:4: otherlv_60= 'joint' otherlv_61= '{' ( (lv_joint_62_0= ruleName ) ) (otherlv_63= ',' ( (lv_joint_64_0= ruleName ) ) )* otherlv_65= '}'
                    {
                    otherlv_60=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_60, grammarAccess.getTransmissionAccess().getJointKeyword_15_0());
                    			
                    otherlv_61=(Token)match(input,16,FOLLOW_59); 

                    				newLeafNode(otherlv_61, grammarAccess.getTransmissionAccess().getLeftCurlyBracketKeyword_15_1());
                    			
                    // InternalKinematics.g:1559:4: ( (lv_joint_62_0= ruleName ) )
                    // InternalKinematics.g:1560:5: (lv_joint_62_0= ruleName )
                    {
                    // InternalKinematics.g:1560:5: (lv_joint_62_0= ruleName )
                    // InternalKinematics.g:1561:6: lv_joint_62_0= ruleName
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
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKinematics.g:1578:4: (otherlv_63= ',' ( (lv_joint_64_0= ruleName ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==20) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalKinematics.g:1579:5: otherlv_63= ',' ( (lv_joint_64_0= ruleName ) )
                    	    {
                    	    otherlv_63=(Token)match(input,20,FOLLOW_59); 

                    	    					newLeafNode(otherlv_63, grammarAccess.getTransmissionAccess().getCommaKeyword_15_3_0());
                    	    				
                    	    // InternalKinematics.g:1583:5: ( (lv_joint_64_0= ruleName ) )
                    	    // InternalKinematics.g:1584:6: (lv_joint_64_0= ruleName )
                    	    {
                    	    // InternalKinematics.g:1584:6: (lv_joint_64_0= ruleName )
                    	    // InternalKinematics.g:1585:7: lv_joint_64_0= ruleName
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
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.Name");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_65=(Token)match(input,21,FOLLOW_16); 

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
    // InternalKinematics.g:1616:1: entryRulePose returns [EObject current=null] : iv_rulePose= rulePose EOF ;
    public final EObject entryRulePose() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePose = null;


        try {
            // InternalKinematics.g:1616:45: (iv_rulePose= rulePose EOF )
            // InternalKinematics.g:1617:2: iv_rulePose= rulePose EOF
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
    // InternalKinematics.g:1623:1: rulePose returns [EObject current=null] : ( () otherlv_1= 'Pose' otherlv_2= '{' (otherlv_3= 'rpy' ( (lv_rpy_4_0= ruleEString ) ) )? (otherlv_5= 'xyz' ( (lv_xyz_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
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
            // InternalKinematics.g:1629:2: ( ( () otherlv_1= 'Pose' otherlv_2= '{' (otherlv_3= 'rpy' ( (lv_rpy_4_0= ruleEString ) ) )? (otherlv_5= 'xyz' ( (lv_xyz_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalKinematics.g:1630:2: ( () otherlv_1= 'Pose' otherlv_2= '{' (otherlv_3= 'rpy' ( (lv_rpy_4_0= ruleEString ) ) )? (otherlv_5= 'xyz' ( (lv_xyz_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalKinematics.g:1630:2: ( () otherlv_1= 'Pose' otherlv_2= '{' (otherlv_3= 'rpy' ( (lv_rpy_4_0= ruleEString ) ) )? (otherlv_5= 'xyz' ( (lv_xyz_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalKinematics.g:1631:3: () otherlv_1= 'Pose' otherlv_2= '{' (otherlv_3= 'rpy' ( (lv_rpy_4_0= ruleEString ) ) )? (otherlv_5= 'xyz' ( (lv_xyz_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalKinematics.g:1631:3: ()
            // InternalKinematics.g:1632:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPoseAccess().getPoseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPoseAccess().getPoseKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_61); 

            			newLeafNode(otherlv_2, grammarAccess.getPoseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKinematics.g:1646:3: (otherlv_3= 'rpy' ( (lv_rpy_4_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==54) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalKinematics.g:1647:4: otherlv_3= 'rpy' ( (lv_rpy_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getPoseAccess().getRpyKeyword_3_0());
                    			
                    // InternalKinematics.g:1651:4: ( (lv_rpy_4_0= ruleEString ) )
                    // InternalKinematics.g:1652:5: (lv_rpy_4_0= ruleEString )
                    {
                    // InternalKinematics.g:1652:5: (lv_rpy_4_0= ruleEString )
                    // InternalKinematics.g:1653:6: lv_rpy_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPoseAccess().getRpyEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_62);
                    lv_rpy_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPoseRule());
                    						}
                    						set(
                    							current,
                    							"rpy",
                    							lv_rpy_4_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:1671:3: (otherlv_5= 'xyz' ( (lv_xyz_6_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==55) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalKinematics.g:1672:4: otherlv_5= 'xyz' ( (lv_xyz_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,55,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getPoseAccess().getXyzKeyword_4_0());
                    			
                    // InternalKinematics.g:1676:4: ( (lv_xyz_6_0= ruleEString ) )
                    // InternalKinematics.g:1677:5: (lv_xyz_6_0= ruleEString )
                    {
                    // InternalKinematics.g:1677:5: (lv_xyz_6_0= ruleEString )
                    // InternalKinematics.g:1678:6: lv_xyz_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPoseAccess().getXyzEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_xyz_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPoseRule());
                    						}
                    						set(
                    							current,
                    							"xyz",
                    							lv_xyz_6_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.EString");
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
    // InternalKinematics.g:1704:1: entryRuleAxis returns [EObject current=null] : iv_ruleAxis= ruleAxis EOF ;
    public final EObject entryRuleAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxis = null;


        try {
            // InternalKinematics.g:1704:45: (iv_ruleAxis= ruleAxis EOF )
            // InternalKinematics.g:1705:2: iv_ruleAxis= ruleAxis EOF
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
    // InternalKinematics.g:1711:1: ruleAxis returns [EObject current=null] : ( () otherlv_1= 'Axis' otherlv_2= '{' (otherlv_3= 'xyz' ( (lv_xyz_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleAxis() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_xyz_4_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:1717:2: ( ( () otherlv_1= 'Axis' otherlv_2= '{' (otherlv_3= 'xyz' ( (lv_xyz_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalKinematics.g:1718:2: ( () otherlv_1= 'Axis' otherlv_2= '{' (otherlv_3= 'xyz' ( (lv_xyz_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalKinematics.g:1718:2: ( () otherlv_1= 'Axis' otherlv_2= '{' (otherlv_3= 'xyz' ( (lv_xyz_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalKinematics.g:1719:3: () otherlv_1= 'Axis' otherlv_2= '{' (otherlv_3= 'xyz' ( (lv_xyz_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalKinematics.g:1719:3: ()
            // InternalKinematics.g:1720:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAxisAccess().getAxisAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAxisAccess().getAxisKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_62); 

            			newLeafNode(otherlv_2, grammarAccess.getAxisAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKinematics.g:1734:3: (otherlv_3= 'xyz' ( (lv_xyz_4_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==55) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalKinematics.g:1735:4: otherlv_3= 'xyz' ( (lv_xyz_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,55,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getAxisAccess().getXyzKeyword_3_0());
                    			
                    // InternalKinematics.g:1739:4: ( (lv_xyz_4_0= ruleEString ) )
                    // InternalKinematics.g:1740:5: (lv_xyz_4_0= ruleEString )
                    {
                    // InternalKinematics.g:1740:5: (lv_xyz_4_0= ruleEString )
                    // InternalKinematics.g:1741:6: lv_xyz_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAxisAccess().getXyzEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_xyz_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAxisRule());
                    						}
                    						set(
                    							current,
                    							"xyz",
                    							lv_xyz_4_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.EString");
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
    // InternalKinematics.g:1767:1: entryRuleCalibration returns [EObject current=null] : iv_ruleCalibration= ruleCalibration EOF ;
    public final EObject entryRuleCalibration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalibration = null;


        try {
            // InternalKinematics.g:1767:52: (iv_ruleCalibration= ruleCalibration EOF )
            // InternalKinematics.g:1768:2: iv_ruleCalibration= ruleCalibration EOF
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
    // InternalKinematics.g:1774:1: ruleCalibration returns [EObject current=null] : ( () otherlv_1= 'Calibration' otherlv_2= '{' (otherlv_3= 'falling' ( (lv_falling_4_0= ruleDouble0 ) ) )? (otherlv_5= 'referencePosition' ( (lv_referencePosition_6_0= ruleDouble0 ) ) )? (otherlv_7= 'rising' ( (lv_rising_8_0= ruleDouble0 ) ) )? otherlv_9= '}' ) ;
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
            // InternalKinematics.g:1780:2: ( ( () otherlv_1= 'Calibration' otherlv_2= '{' (otherlv_3= 'falling' ( (lv_falling_4_0= ruleDouble0 ) ) )? (otherlv_5= 'referencePosition' ( (lv_referencePosition_6_0= ruleDouble0 ) ) )? (otherlv_7= 'rising' ( (lv_rising_8_0= ruleDouble0 ) ) )? otherlv_9= '}' ) )
            // InternalKinematics.g:1781:2: ( () otherlv_1= 'Calibration' otherlv_2= '{' (otherlv_3= 'falling' ( (lv_falling_4_0= ruleDouble0 ) ) )? (otherlv_5= 'referencePosition' ( (lv_referencePosition_6_0= ruleDouble0 ) ) )? (otherlv_7= 'rising' ( (lv_rising_8_0= ruleDouble0 ) ) )? otherlv_9= '}' )
            {
            // InternalKinematics.g:1781:2: ( () otherlv_1= 'Calibration' otherlv_2= '{' (otherlv_3= 'falling' ( (lv_falling_4_0= ruleDouble0 ) ) )? (otherlv_5= 'referencePosition' ( (lv_referencePosition_6_0= ruleDouble0 ) ) )? (otherlv_7= 'rising' ( (lv_rising_8_0= ruleDouble0 ) ) )? otherlv_9= '}' )
            // InternalKinematics.g:1782:3: () otherlv_1= 'Calibration' otherlv_2= '{' (otherlv_3= 'falling' ( (lv_falling_4_0= ruleDouble0 ) ) )? (otherlv_5= 'referencePosition' ( (lv_referencePosition_6_0= ruleDouble0 ) ) )? (otherlv_7= 'rising' ( (lv_rising_8_0= ruleDouble0 ) ) )? otherlv_9= '}'
            {
            // InternalKinematics.g:1782:3: ()
            // InternalKinematics.g:1783:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCalibrationAccess().getCalibrationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCalibrationAccess().getCalibrationKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_63); 

            			newLeafNode(otherlv_2, grammarAccess.getCalibrationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKinematics.g:1797:3: (otherlv_3= 'falling' ( (lv_falling_4_0= ruleDouble0 ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==58) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalKinematics.g:1798:4: otherlv_3= 'falling' ( (lv_falling_4_0= ruleDouble0 ) )
                    {
                    otherlv_3=(Token)match(input,58,FOLLOW_46); 

                    				newLeafNode(otherlv_3, grammarAccess.getCalibrationAccess().getFallingKeyword_3_0());
                    			
                    // InternalKinematics.g:1802:4: ( (lv_falling_4_0= ruleDouble0 ) )
                    // InternalKinematics.g:1803:5: (lv_falling_4_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:1803:5: (lv_falling_4_0= ruleDouble0 )
                    // InternalKinematics.g:1804:6: lv_falling_4_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getCalibrationAccess().getFallingDouble0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    lv_falling_4_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCalibrationRule());
                    						}
                    						set(
                    							current,
                    							"falling",
                    							lv_falling_4_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:1822:3: (otherlv_5= 'referencePosition' ( (lv_referencePosition_6_0= ruleDouble0 ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==59) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalKinematics.g:1823:4: otherlv_5= 'referencePosition' ( (lv_referencePosition_6_0= ruleDouble0 ) )
                    {
                    otherlv_5=(Token)match(input,59,FOLLOW_46); 

                    				newLeafNode(otherlv_5, grammarAccess.getCalibrationAccess().getReferencePositionKeyword_4_0());
                    			
                    // InternalKinematics.g:1827:4: ( (lv_referencePosition_6_0= ruleDouble0 ) )
                    // InternalKinematics.g:1828:5: (lv_referencePosition_6_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:1828:5: (lv_referencePosition_6_0= ruleDouble0 )
                    // InternalKinematics.g:1829:6: lv_referencePosition_6_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getCalibrationAccess().getReferencePositionDouble0ParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_65);
                    lv_referencePosition_6_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCalibrationRule());
                    						}
                    						set(
                    							current,
                    							"referencePosition",
                    							lv_referencePosition_6_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:1847:3: (otherlv_7= 'rising' ( (lv_rising_8_0= ruleDouble0 ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==60) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalKinematics.g:1848:4: otherlv_7= 'rising' ( (lv_rising_8_0= ruleDouble0 ) )
                    {
                    otherlv_7=(Token)match(input,60,FOLLOW_46); 

                    				newLeafNode(otherlv_7, grammarAccess.getCalibrationAccess().getRisingKeyword_5_0());
                    			
                    // InternalKinematics.g:1852:4: ( (lv_rising_8_0= ruleDouble0 ) )
                    // InternalKinematics.g:1853:5: (lv_rising_8_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:1853:5: (lv_rising_8_0= ruleDouble0 )
                    // InternalKinematics.g:1854:6: lv_rising_8_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getCalibrationAccess().getRisingDouble0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_rising_8_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCalibrationRule());
                    						}
                    						set(
                    							current,
                    							"rising",
                    							lv_rising_8_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
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
    // InternalKinematics.g:1880:1: entryRuleDynamics returns [EObject current=null] : iv_ruleDynamics= ruleDynamics EOF ;
    public final EObject entryRuleDynamics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamics = null;


        try {
            // InternalKinematics.g:1880:49: (iv_ruleDynamics= ruleDynamics EOF )
            // InternalKinematics.g:1881:2: iv_ruleDynamics= ruleDynamics EOF
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
    // InternalKinematics.g:1887:1: ruleDynamics returns [EObject current=null] : ( () otherlv_1= 'Dynamics' otherlv_2= '{' (otherlv_3= 'damping' ( (lv_damping_4_0= ruleDouble0 ) ) )? (otherlv_5= 'friction' ( (lv_friction_6_0= ruleDouble0 ) ) )? otherlv_7= '}' ) ;
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
            // InternalKinematics.g:1893:2: ( ( () otherlv_1= 'Dynamics' otherlv_2= '{' (otherlv_3= 'damping' ( (lv_damping_4_0= ruleDouble0 ) ) )? (otherlv_5= 'friction' ( (lv_friction_6_0= ruleDouble0 ) ) )? otherlv_7= '}' ) )
            // InternalKinematics.g:1894:2: ( () otherlv_1= 'Dynamics' otherlv_2= '{' (otherlv_3= 'damping' ( (lv_damping_4_0= ruleDouble0 ) ) )? (otherlv_5= 'friction' ( (lv_friction_6_0= ruleDouble0 ) ) )? otherlv_7= '}' )
            {
            // InternalKinematics.g:1894:2: ( () otherlv_1= 'Dynamics' otherlv_2= '{' (otherlv_3= 'damping' ( (lv_damping_4_0= ruleDouble0 ) ) )? (otherlv_5= 'friction' ( (lv_friction_6_0= ruleDouble0 ) ) )? otherlv_7= '}' )
            // InternalKinematics.g:1895:3: () otherlv_1= 'Dynamics' otherlv_2= '{' (otherlv_3= 'damping' ( (lv_damping_4_0= ruleDouble0 ) ) )? (otherlv_5= 'friction' ( (lv_friction_6_0= ruleDouble0 ) ) )? otherlv_7= '}'
            {
            // InternalKinematics.g:1895:3: ()
            // InternalKinematics.g:1896:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDynamicsAccess().getDynamicsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDynamicsAccess().getDynamicsKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_66); 

            			newLeafNode(otherlv_2, grammarAccess.getDynamicsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKinematics.g:1910:3: (otherlv_3= 'damping' ( (lv_damping_4_0= ruleDouble0 ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==62) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalKinematics.g:1911:4: otherlv_3= 'damping' ( (lv_damping_4_0= ruleDouble0 ) )
                    {
                    otherlv_3=(Token)match(input,62,FOLLOW_46); 

                    				newLeafNode(otherlv_3, grammarAccess.getDynamicsAccess().getDampingKeyword_3_0());
                    			
                    // InternalKinematics.g:1915:4: ( (lv_damping_4_0= ruleDouble0 ) )
                    // InternalKinematics.g:1916:5: (lv_damping_4_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:1916:5: (lv_damping_4_0= ruleDouble0 )
                    // InternalKinematics.g:1917:6: lv_damping_4_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getDynamicsAccess().getDampingDouble0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_67);
                    lv_damping_4_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDynamicsRule());
                    						}
                    						set(
                    							current,
                    							"damping",
                    							lv_damping_4_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:1935:3: (otherlv_5= 'friction' ( (lv_friction_6_0= ruleDouble0 ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==63) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalKinematics.g:1936:4: otherlv_5= 'friction' ( (lv_friction_6_0= ruleDouble0 ) )
                    {
                    otherlv_5=(Token)match(input,63,FOLLOW_46); 

                    				newLeafNode(otherlv_5, grammarAccess.getDynamicsAccess().getFrictionKeyword_4_0());
                    			
                    // InternalKinematics.g:1940:4: ( (lv_friction_6_0= ruleDouble0 ) )
                    // InternalKinematics.g:1941:5: (lv_friction_6_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:1941:5: (lv_friction_6_0= ruleDouble0 )
                    // InternalKinematics.g:1942:6: lv_friction_6_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getDynamicsAccess().getFrictionDouble0ParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_friction_6_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDynamicsRule());
                    						}
                    						set(
                    							current,
                    							"friction",
                    							lv_friction_6_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
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
    // InternalKinematics.g:1968:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // InternalKinematics.g:1968:46: (iv_ruleLimit= ruleLimit EOF )
            // InternalKinematics.g:1969:2: iv_ruleLimit= ruleLimit EOF
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
    // InternalKinematics.g:1975:1: ruleLimit returns [EObject current=null] : ( () otherlv_1= 'Limit' otherlv_2= '{' (otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) ) )? (otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) ) )? (otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) ) )? (otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) ) )? otherlv_11= '}' ) ;
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
            // InternalKinematics.g:1981:2: ( ( () otherlv_1= 'Limit' otherlv_2= '{' (otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) ) )? (otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) ) )? (otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) ) )? (otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) ) )? otherlv_11= '}' ) )
            // InternalKinematics.g:1982:2: ( () otherlv_1= 'Limit' otherlv_2= '{' (otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) ) )? (otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) ) )? (otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) ) )? (otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) ) )? otherlv_11= '}' )
            {
            // InternalKinematics.g:1982:2: ( () otherlv_1= 'Limit' otherlv_2= '{' (otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) ) )? (otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) ) )? (otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) ) )? (otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) ) )? otherlv_11= '}' )
            // InternalKinematics.g:1983:3: () otherlv_1= 'Limit' otherlv_2= '{' (otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) ) )? (otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) ) )? (otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) ) )? (otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) ) )? otherlv_11= '}'
            {
            // InternalKinematics.g:1983:3: ()
            // InternalKinematics.g:1984:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLimitAccess().getLimitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLimitAccess().getLimitKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_68); 

            			newLeafNode(otherlv_2, grammarAccess.getLimitAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKinematics.g:1998:3: (otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==65) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalKinematics.g:1999:4: otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) )
                    {
                    otherlv_3=(Token)match(input,65,FOLLOW_46); 

                    				newLeafNode(otherlv_3, grammarAccess.getLimitAccess().getEffortKeyword_3_0());
                    			
                    // InternalKinematics.g:2003:4: ( (lv_effort_4_0= ruleDouble0 ) )
                    // InternalKinematics.g:2004:5: (lv_effort_4_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:2004:5: (lv_effort_4_0= ruleDouble0 )
                    // InternalKinematics.g:2005:6: lv_effort_4_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getLimitAccess().getEffortDouble0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_69);
                    lv_effort_4_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLimitRule());
                    						}
                    						set(
                    							current,
                    							"effort",
                    							lv_effort_4_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:2023:3: (otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==66) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalKinematics.g:2024:4: otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) )
                    {
                    otherlv_5=(Token)match(input,66,FOLLOW_46); 

                    				newLeafNode(otherlv_5, grammarAccess.getLimitAccess().getLowerKeyword_4_0());
                    			
                    // InternalKinematics.g:2028:4: ( (lv_lower_6_0= ruleDouble0 ) )
                    // InternalKinematics.g:2029:5: (lv_lower_6_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:2029:5: (lv_lower_6_0= ruleDouble0 )
                    // InternalKinematics.g:2030:6: lv_lower_6_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getLimitAccess().getLowerDouble0ParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_70);
                    lv_lower_6_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLimitRule());
                    						}
                    						set(
                    							current,
                    							"lower",
                    							lv_lower_6_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:2048:3: (otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==67) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalKinematics.g:2049:4: otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) )
                    {
                    otherlv_7=(Token)match(input,67,FOLLOW_46); 

                    				newLeafNode(otherlv_7, grammarAccess.getLimitAccess().getUpperKeyword_5_0());
                    			
                    // InternalKinematics.g:2053:4: ( (lv_upper_8_0= ruleDouble0 ) )
                    // InternalKinematics.g:2054:5: (lv_upper_8_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:2054:5: (lv_upper_8_0= ruleDouble0 )
                    // InternalKinematics.g:2055:6: lv_upper_8_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getLimitAccess().getUpperDouble0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_71);
                    lv_upper_8_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLimitRule());
                    						}
                    						set(
                    							current,
                    							"upper",
                    							lv_upper_8_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:2073:3: (otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==68) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalKinematics.g:2074:4: otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) )
                    {
                    otherlv_9=(Token)match(input,68,FOLLOW_46); 

                    				newLeafNode(otherlv_9, grammarAccess.getLimitAccess().getVelocityKeyword_6_0());
                    			
                    // InternalKinematics.g:2078:4: ( (lv_velocity_10_0= ruleDouble0 ) )
                    // InternalKinematics.g:2079:5: (lv_velocity_10_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:2079:5: (lv_velocity_10_0= ruleDouble0 )
                    // InternalKinematics.g:2080:6: lv_velocity_10_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getLimitAccess().getVelocityDouble0ParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_velocity_10_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLimitRule());
                    						}
                    						set(
                    							current,
                    							"velocity",
                    							lv_velocity_10_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
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
    // InternalKinematics.g:2106:1: entryRuleSafetyController returns [EObject current=null] : iv_ruleSafetyController= ruleSafetyController EOF ;
    public final EObject entryRuleSafetyController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSafetyController = null;


        try {
            // InternalKinematics.g:2106:57: (iv_ruleSafetyController= ruleSafetyController EOF )
            // InternalKinematics.g:2107:2: iv_ruleSafetyController= ruleSafetyController EOF
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
    // InternalKinematics.g:2113:1: ruleSafetyController returns [EObject current=null] : (otherlv_0= 'SafetyController' otherlv_1= '{' (otherlv_2= 'kPosition' ( (lv_kPosition_3_0= ruleDouble0 ) ) )? otherlv_4= 'kVelocity' ( (lv_kVelocity_5_0= ruleDouble0 ) ) (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleDouble0 ) ) )? (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleDouble0 ) ) )? otherlv_10= '}' ) ;
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
            // InternalKinematics.g:2119:2: ( (otherlv_0= 'SafetyController' otherlv_1= '{' (otherlv_2= 'kPosition' ( (lv_kPosition_3_0= ruleDouble0 ) ) )? otherlv_4= 'kVelocity' ( (lv_kVelocity_5_0= ruleDouble0 ) ) (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleDouble0 ) ) )? (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleDouble0 ) ) )? otherlv_10= '}' ) )
            // InternalKinematics.g:2120:2: (otherlv_0= 'SafetyController' otherlv_1= '{' (otherlv_2= 'kPosition' ( (lv_kPosition_3_0= ruleDouble0 ) ) )? otherlv_4= 'kVelocity' ( (lv_kVelocity_5_0= ruleDouble0 ) ) (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleDouble0 ) ) )? (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleDouble0 ) ) )? otherlv_10= '}' )
            {
            // InternalKinematics.g:2120:2: (otherlv_0= 'SafetyController' otherlv_1= '{' (otherlv_2= 'kPosition' ( (lv_kPosition_3_0= ruleDouble0 ) ) )? otherlv_4= 'kVelocity' ( (lv_kVelocity_5_0= ruleDouble0 ) ) (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleDouble0 ) ) )? (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleDouble0 ) ) )? otherlv_10= '}' )
            // InternalKinematics.g:2121:3: otherlv_0= 'SafetyController' otherlv_1= '{' (otherlv_2= 'kPosition' ( (lv_kPosition_3_0= ruleDouble0 ) ) )? otherlv_4= 'kVelocity' ( (lv_kVelocity_5_0= ruleDouble0 ) ) (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleDouble0 ) ) )? (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleDouble0 ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSafetyControllerAccess().getSafetyControllerKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_72); 

            			newLeafNode(otherlv_1, grammarAccess.getSafetyControllerAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalKinematics.g:2129:3: (otherlv_2= 'kPosition' ( (lv_kPosition_3_0= ruleDouble0 ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==70) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalKinematics.g:2130:4: otherlv_2= 'kPosition' ( (lv_kPosition_3_0= ruleDouble0 ) )
                    {
                    otherlv_2=(Token)match(input,70,FOLLOW_46); 

                    				newLeafNode(otherlv_2, grammarAccess.getSafetyControllerAccess().getKPositionKeyword_2_0());
                    			
                    // InternalKinematics.g:2134:4: ( (lv_kPosition_3_0= ruleDouble0 ) )
                    // InternalKinematics.g:2135:5: (lv_kPosition_3_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:2135:5: (lv_kPosition_3_0= ruleDouble0 )
                    // InternalKinematics.g:2136:6: lv_kPosition_3_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getSafetyControllerAccess().getKPositionDouble0ParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_73);
                    lv_kPosition_3_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
                    						}
                    						set(
                    							current,
                    							"kPosition",
                    							lv_kPosition_3_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,71,FOLLOW_46); 

            			newLeafNode(otherlv_4, grammarAccess.getSafetyControllerAccess().getKVelocityKeyword_3());
            		
            // InternalKinematics.g:2158:3: ( (lv_kVelocity_5_0= ruleDouble0 ) )
            // InternalKinematics.g:2159:4: (lv_kVelocity_5_0= ruleDouble0 )
            {
            // InternalKinematics.g:2159:4: (lv_kVelocity_5_0= ruleDouble0 )
            // InternalKinematics.g:2160:5: lv_kVelocity_5_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getSafetyControllerAccess().getKVelocityDouble0ParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_74);
            lv_kVelocity_5_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
            					}
            					set(
            						current,
            						"kVelocity",
            						lv_kVelocity_5_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKinematics.g:2177:3: (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleDouble0 ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==72) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalKinematics.g:2178:4: otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleDouble0 ) )
                    {
                    otherlv_6=(Token)match(input,72,FOLLOW_46); 

                    				newLeafNode(otherlv_6, grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_5_0());
                    			
                    // InternalKinematics.g:2182:4: ( (lv_softLowerLimit_7_0= ruleDouble0 ) )
                    // InternalKinematics.g:2183:5: (lv_softLowerLimit_7_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:2183:5: (lv_softLowerLimit_7_0= ruleDouble0 )
                    // InternalKinematics.g:2184:6: lv_softLowerLimit_7_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitDouble0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_75);
                    lv_softLowerLimit_7_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
                    						}
                    						set(
                    							current,
                    							"softLowerLimit",
                    							lv_softLowerLimit_7_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:2202:3: (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleDouble0 ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==73) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalKinematics.g:2203:4: otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleDouble0 ) )
                    {
                    otherlv_8=(Token)match(input,73,FOLLOW_46); 

                    				newLeafNode(otherlv_8, grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_6_0());
                    			
                    // InternalKinematics.g:2207:4: ( (lv_softUpperLimit_9_0= ruleDouble0 ) )
                    // InternalKinematics.g:2208:5: (lv_softUpperLimit_9_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:2208:5: (lv_softUpperLimit_9_0= ruleDouble0 )
                    // InternalKinematics.g:2209:6: lv_softUpperLimit_9_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitDouble0ParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_softUpperLimit_9_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
                    						}
                    						set(
                    							current,
                    							"softUpperLimit",
                    							lv_softUpperLimit_9_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
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
    // InternalKinematics.g:2235:1: entryRuleMimic returns [EObject current=null] : iv_ruleMimic= ruleMimic EOF ;
    public final EObject entryRuleMimic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMimic = null;


        try {
            // InternalKinematics.g:2235:46: (iv_ruleMimic= ruleMimic EOF )
            // InternalKinematics.g:2236:2: iv_ruleMimic= ruleMimic EOF
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
    // InternalKinematics.g:2242:1: ruleMimic returns [EObject current=null] : (otherlv_0= 'Mimic' otherlv_1= '{' otherlv_2= 'joint' ( (lv_joint_3_0= ruleEString ) ) (otherlv_4= 'multiplier' ( (lv_multiplier_5_0= ruleDouble0 ) ) )? (otherlv_6= 'offset' ( (lv_offset_7_0= ruleDouble0 ) ) )? otherlv_8= '}' ) ;
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
            // InternalKinematics.g:2248:2: ( (otherlv_0= 'Mimic' otherlv_1= '{' otherlv_2= 'joint' ( (lv_joint_3_0= ruleEString ) ) (otherlv_4= 'multiplier' ( (lv_multiplier_5_0= ruleDouble0 ) ) )? (otherlv_6= 'offset' ( (lv_offset_7_0= ruleDouble0 ) ) )? otherlv_8= '}' ) )
            // InternalKinematics.g:2249:2: (otherlv_0= 'Mimic' otherlv_1= '{' otherlv_2= 'joint' ( (lv_joint_3_0= ruleEString ) ) (otherlv_4= 'multiplier' ( (lv_multiplier_5_0= ruleDouble0 ) ) )? (otherlv_6= 'offset' ( (lv_offset_7_0= ruleDouble0 ) ) )? otherlv_8= '}' )
            {
            // InternalKinematics.g:2249:2: (otherlv_0= 'Mimic' otherlv_1= '{' otherlv_2= 'joint' ( (lv_joint_3_0= ruleEString ) ) (otherlv_4= 'multiplier' ( (lv_multiplier_5_0= ruleDouble0 ) ) )? (otherlv_6= 'offset' ( (lv_offset_7_0= ruleDouble0 ) ) )? otherlv_8= '}' )
            // InternalKinematics.g:2250:3: otherlv_0= 'Mimic' otherlv_1= '{' otherlv_2= 'joint' ( (lv_joint_3_0= ruleEString ) ) (otherlv_4= 'multiplier' ( (lv_multiplier_5_0= ruleDouble0 ) ) )? (otherlv_6= 'offset' ( (lv_offset_7_0= ruleDouble0 ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMimicAccess().getMimicKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_76); 

            			newLeafNode(otherlv_1, grammarAccess.getMimicAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMimicAccess().getJointKeyword_2());
            		
            // InternalKinematics.g:2262:3: ( (lv_joint_3_0= ruleEString ) )
            // InternalKinematics.g:2263:4: (lv_joint_3_0= ruleEString )
            {
            // InternalKinematics.g:2263:4: (lv_joint_3_0= ruleEString )
            // InternalKinematics.g:2264:5: lv_joint_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMimicAccess().getJointEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_77);
            lv_joint_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMimicRule());
            					}
            					set(
            						current,
            						"joint",
            						lv_joint_3_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKinematics.g:2281:3: (otherlv_4= 'multiplier' ( (lv_multiplier_5_0= ruleDouble0 ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==75) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalKinematics.g:2282:4: otherlv_4= 'multiplier' ( (lv_multiplier_5_0= ruleDouble0 ) )
                    {
                    otherlv_4=(Token)match(input,75,FOLLOW_46); 

                    				newLeafNode(otherlv_4, grammarAccess.getMimicAccess().getMultiplierKeyword_4_0());
                    			
                    // InternalKinematics.g:2286:4: ( (lv_multiplier_5_0= ruleDouble0 ) )
                    // InternalKinematics.g:2287:5: (lv_multiplier_5_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:2287:5: (lv_multiplier_5_0= ruleDouble0 )
                    // InternalKinematics.g:2288:6: lv_multiplier_5_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getMimicAccess().getMultiplierDouble0ParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_78);
                    lv_multiplier_5_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMimicRule());
                    						}
                    						set(
                    							current,
                    							"multiplier",
                    							lv_multiplier_5_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:2306:3: (otherlv_6= 'offset' ( (lv_offset_7_0= ruleDouble0 ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==76) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalKinematics.g:2307:4: otherlv_6= 'offset' ( (lv_offset_7_0= ruleDouble0 ) )
                    {
                    otherlv_6=(Token)match(input,76,FOLLOW_46); 

                    				newLeafNode(otherlv_6, grammarAccess.getMimicAccess().getOffsetKeyword_5_0());
                    			
                    // InternalKinematics.g:2311:4: ( (lv_offset_7_0= ruleDouble0 ) )
                    // InternalKinematics.g:2312:5: (lv_offset_7_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:2312:5: (lv_offset_7_0= ruleDouble0 )
                    // InternalKinematics.g:2313:6: lv_offset_7_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getMimicAccess().getOffsetDouble0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_offset_7_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMimicRule());
                    						}
                    						set(
                    							current,
                    							"offset",
                    							lv_offset_7_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
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
    // InternalKinematics.g:2339:1: entryRuleInertial returns [EObject current=null] : iv_ruleInertial= ruleInertial EOF ;
    public final EObject entryRuleInertial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertial = null;


        try {
            // InternalKinematics.g:2339:49: (iv_ruleInertial= ruleInertial EOF )
            // InternalKinematics.g:2340:2: iv_ruleInertial= ruleInertial EOF
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
    // InternalKinematics.g:2346:1: ruleInertial returns [EObject current=null] : ( () otherlv_1= 'Inertial' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )? (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )? otherlv_9= '}' ) ;
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
            // InternalKinematics.g:2352:2: ( ( () otherlv_1= 'Inertial' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )? (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )? otherlv_9= '}' ) )
            // InternalKinematics.g:2353:2: ( () otherlv_1= 'Inertial' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )? (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )? otherlv_9= '}' )
            {
            // InternalKinematics.g:2353:2: ( () otherlv_1= 'Inertial' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )? (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )? otherlv_9= '}' )
            // InternalKinematics.g:2354:3: () otherlv_1= 'Inertial' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )? (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )? otherlv_9= '}'
            {
            // InternalKinematics.g:2354:3: ()
            // InternalKinematics.g:2355:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInertialAccess().getInertialAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,77,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInertialAccess().getInertialKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_79); 

            			newLeafNode(otherlv_2, grammarAccess.getInertialAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKinematics.g:2369:3: (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==27) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalKinematics.g:2370:4: otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getInertialAccess().getOriginKeyword_3_0());
                    			
                    // InternalKinematics.g:2374:4: ( (lv_origin_4_0= rulePose ) )
                    // InternalKinematics.g:2375:5: (lv_origin_4_0= rulePose )
                    {
                    // InternalKinematics.g:2375:5: (lv_origin_4_0= rulePose )
                    // InternalKinematics.g:2376:6: lv_origin_4_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getInertialAccess().getOriginPoseParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_80);
                    lv_origin_4_0=rulePose();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertialRule());
                    						}
                    						set(
                    							current,
                    							"origin",
                    							lv_origin_4_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Pose");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:2394:3: (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==78) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalKinematics.g:2395:4: otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) )
                    {
                    otherlv_5=(Token)match(input,78,FOLLOW_81); 

                    				newLeafNode(otherlv_5, grammarAccess.getInertialAccess().getMassKeyword_4_0());
                    			
                    // InternalKinematics.g:2399:4: ( (lv_mass_6_0= ruleMass ) )
                    // InternalKinematics.g:2400:5: (lv_mass_6_0= ruleMass )
                    {
                    // InternalKinematics.g:2400:5: (lv_mass_6_0= ruleMass )
                    // InternalKinematics.g:2401:6: lv_mass_6_0= ruleMass
                    {

                    						newCompositeNode(grammarAccess.getInertialAccess().getMassMassParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_82);
                    lv_mass_6_0=ruleMass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertialRule());
                    						}
                    						set(
                    							current,
                    							"mass",
                    							lv_mass_6_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Mass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:2419:3: (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==79) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalKinematics.g:2420:4: otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) )
                    {
                    otherlv_7=(Token)match(input,79,FOLLOW_83); 

                    				newLeafNode(otherlv_7, grammarAccess.getInertialAccess().getInertiaKeyword_5_0());
                    			
                    // InternalKinematics.g:2424:4: ( (lv_inertia_8_0= ruleInertia ) )
                    // InternalKinematics.g:2425:5: (lv_inertia_8_0= ruleInertia )
                    {
                    // InternalKinematics.g:2425:5: (lv_inertia_8_0= ruleInertia )
                    // InternalKinematics.g:2426:6: lv_inertia_8_0= ruleInertia
                    {

                    						newCompositeNode(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_inertia_8_0=ruleInertia();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertialRule());
                    						}
                    						set(
                    							current,
                    							"inertia",
                    							lv_inertia_8_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Inertia");
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
    // InternalKinematics.g:2452:1: entryRuleVisual returns [EObject current=null] : iv_ruleVisual= ruleVisual EOF ;
    public final EObject entryRuleVisual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisual = null;


        try {
            // InternalKinematics.g:2452:47: (iv_ruleVisual= ruleVisual EOF )
            // InternalKinematics.g:2453:2: iv_ruleVisual= ruleVisual EOF
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
    // InternalKinematics.g:2459:1: ruleVisual returns [EObject current=null] : (otherlv_0= 'Visual' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) (otherlv_6= 'material' ( (lv_material_7_0= ruleMaterial ) ) )? otherlv_8= '}' ) ;
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
            // InternalKinematics.g:2465:2: ( (otherlv_0= 'Visual' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) (otherlv_6= 'material' ( (lv_material_7_0= ruleMaterial ) ) )? otherlv_8= '}' ) )
            // InternalKinematics.g:2466:2: (otherlv_0= 'Visual' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) (otherlv_6= 'material' ( (lv_material_7_0= ruleMaterial ) ) )? otherlv_8= '}' )
            {
            // InternalKinematics.g:2466:2: (otherlv_0= 'Visual' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) (otherlv_6= 'material' ( (lv_material_7_0= ruleMaterial ) ) )? otherlv_8= '}' )
            // InternalKinematics.g:2467:3: otherlv_0= 'Visual' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) (otherlv_6= 'material' ( (lv_material_7_0= ruleMaterial ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVisualAccess().getVisualKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_84); 

            			newLeafNode(otherlv_1, grammarAccess.getVisualAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalKinematics.g:2475:3: (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==27) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalKinematics.g:2476:4: otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getVisualAccess().getOriginKeyword_2_0());
                    			
                    // InternalKinematics.g:2480:4: ( (lv_origin_3_0= rulePose ) )
                    // InternalKinematics.g:2481:5: (lv_origin_3_0= rulePose )
                    {
                    // InternalKinematics.g:2481:5: (lv_origin_3_0= rulePose )
                    // InternalKinematics.g:2482:6: lv_origin_3_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getVisualAccess().getOriginPoseParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_85);
                    lv_origin_3_0=rulePose();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVisualRule());
                    						}
                    						set(
                    							current,
                    							"origin",
                    							lv_origin_3_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Pose");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,81,FOLLOW_86); 

            			newLeafNode(otherlv_4, grammarAccess.getVisualAccess().getGeometryKeyword_3());
            		
            // InternalKinematics.g:2504:3: ( (lv_geometry_5_0= ruleGeometry ) )
            // InternalKinematics.g:2505:4: (lv_geometry_5_0= ruleGeometry )
            {
            // InternalKinematics.g:2505:4: (lv_geometry_5_0= ruleGeometry )
            // InternalKinematics.g:2506:5: lv_geometry_5_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_87);
            lv_geometry_5_0=ruleGeometry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisualRule());
            					}
            					set(
            						current,
            						"geometry",
            						lv_geometry_5_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Geometry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKinematics.g:2523:3: (otherlv_6= 'material' ( (lv_material_7_0= ruleMaterial ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==23) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalKinematics.g:2524:4: otherlv_6= 'material' ( (lv_material_7_0= ruleMaterial ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_88); 

                    				newLeafNode(otherlv_6, grammarAccess.getVisualAccess().getMaterialKeyword_5_0());
                    			
                    // InternalKinematics.g:2528:4: ( (lv_material_7_0= ruleMaterial ) )
                    // InternalKinematics.g:2529:5: (lv_material_7_0= ruleMaterial )
                    {
                    // InternalKinematics.g:2529:5: (lv_material_7_0= ruleMaterial )
                    // InternalKinematics.g:2530:6: lv_material_7_0= ruleMaterial
                    {

                    						newCompositeNode(grammarAccess.getVisualAccess().getMaterialMaterialParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_material_7_0=ruleMaterial();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVisualRule());
                    						}
                    						set(
                    							current,
                    							"material",
                    							lv_material_7_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Material");
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
    // InternalKinematics.g:2556:1: entryRuleCollision returns [EObject current=null] : iv_ruleCollision= ruleCollision EOF ;
    public final EObject entryRuleCollision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollision = null;


        try {
            // InternalKinematics.g:2556:50: (iv_ruleCollision= ruleCollision EOF )
            // InternalKinematics.g:2557:2: iv_ruleCollision= ruleCollision EOF
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
    // InternalKinematics.g:2563:1: ruleCollision returns [EObject current=null] : (otherlv_0= 'Collision' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'origin' ( (lv_origin_5_0= rulePose ) ) )? otherlv_6= 'geometry' ( (lv_geometry_7_0= ruleGeometry ) ) (otherlv_8= 'verbose' ( (lv_verbose_9_0= ruleVerbose ) ) )? otherlv_10= '}' ) ;
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
            // InternalKinematics.g:2569:2: ( (otherlv_0= 'Collision' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'origin' ( (lv_origin_5_0= rulePose ) ) )? otherlv_6= 'geometry' ( (lv_geometry_7_0= ruleGeometry ) ) (otherlv_8= 'verbose' ( (lv_verbose_9_0= ruleVerbose ) ) )? otherlv_10= '}' ) )
            // InternalKinematics.g:2570:2: (otherlv_0= 'Collision' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'origin' ( (lv_origin_5_0= rulePose ) ) )? otherlv_6= 'geometry' ( (lv_geometry_7_0= ruleGeometry ) ) (otherlv_8= 'verbose' ( (lv_verbose_9_0= ruleVerbose ) ) )? otherlv_10= '}' )
            {
            // InternalKinematics.g:2570:2: (otherlv_0= 'Collision' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'origin' ( (lv_origin_5_0= rulePose ) ) )? otherlv_6= 'geometry' ( (lv_geometry_7_0= ruleGeometry ) ) (otherlv_8= 'verbose' ( (lv_verbose_9_0= ruleVerbose ) ) )? otherlv_10= '}' )
            // InternalKinematics.g:2571:3: otherlv_0= 'Collision' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'origin' ( (lv_origin_5_0= rulePose ) ) )? otherlv_6= 'geometry' ( (lv_geometry_7_0= ruleGeometry ) ) (otherlv_8= 'verbose' ( (lv_verbose_9_0= ruleVerbose ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCollisionAccess().getCollisionKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_89); 

            			newLeafNode(otherlv_1, grammarAccess.getCollisionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalKinematics.g:2579:3: (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==17) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalKinematics.g:2580:4: otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getCollisionAccess().getNameKeyword_2_0());
                    			
                    // InternalKinematics.g:2584:4: ( (lv_name_3_0= ruleEString ) )
                    // InternalKinematics.g:2585:5: (lv_name_3_0= ruleEString )
                    {
                    // InternalKinematics.g:2585:5: (lv_name_3_0= ruleEString )
                    // InternalKinematics.g:2586:6: lv_name_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCollisionAccess().getNameEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_84);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollisionRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:2604:3: (otherlv_4= 'origin' ( (lv_origin_5_0= rulePose ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==27) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalKinematics.g:2605:4: otherlv_4= 'origin' ( (lv_origin_5_0= rulePose ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getCollisionAccess().getOriginKeyword_3_0());
                    			
                    // InternalKinematics.g:2609:4: ( (lv_origin_5_0= rulePose ) )
                    // InternalKinematics.g:2610:5: (lv_origin_5_0= rulePose )
                    {
                    // InternalKinematics.g:2610:5: (lv_origin_5_0= rulePose )
                    // InternalKinematics.g:2611:6: lv_origin_5_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getCollisionAccess().getOriginPoseParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_85);
                    lv_origin_5_0=rulePose();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollisionRule());
                    						}
                    						set(
                    							current,
                    							"origin",
                    							lv_origin_5_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Pose");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,81,FOLLOW_86); 

            			newLeafNode(otherlv_6, grammarAccess.getCollisionAccess().getGeometryKeyword_4());
            		
            // InternalKinematics.g:2633:3: ( (lv_geometry_7_0= ruleGeometry ) )
            // InternalKinematics.g:2634:4: (lv_geometry_7_0= ruleGeometry )
            {
            // InternalKinematics.g:2634:4: (lv_geometry_7_0= ruleGeometry )
            // InternalKinematics.g:2635:5: lv_geometry_7_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_90);
            lv_geometry_7_0=ruleGeometry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollisionRule());
            					}
            					set(
            						current,
            						"geometry",
            						lv_geometry_7_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Geometry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKinematics.g:2652:3: (otherlv_8= 'verbose' ( (lv_verbose_9_0= ruleVerbose ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==83) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalKinematics.g:2653:4: otherlv_8= 'verbose' ( (lv_verbose_9_0= ruleVerbose ) )
                    {
                    otherlv_8=(Token)match(input,83,FOLLOW_91); 

                    				newLeafNode(otherlv_8, grammarAccess.getCollisionAccess().getVerboseKeyword_6_0());
                    			
                    // InternalKinematics.g:2657:4: ( (lv_verbose_9_0= ruleVerbose ) )
                    // InternalKinematics.g:2658:5: (lv_verbose_9_0= ruleVerbose )
                    {
                    // InternalKinematics.g:2658:5: (lv_verbose_9_0= ruleVerbose )
                    // InternalKinematics.g:2659:6: lv_verbose_9_0= ruleVerbose
                    {

                    						newCompositeNode(grammarAccess.getCollisionAccess().getVerboseVerboseParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_verbose_9_0=ruleVerbose();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollisionRule());
                    						}
                    						set(
                    							current,
                    							"verbose",
                    							lv_verbose_9_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Verbose");
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
    // InternalKinematics.g:2685:1: entryRuleMass returns [EObject current=null] : iv_ruleMass= ruleMass EOF ;
    public final EObject entryRuleMass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMass = null;


        try {
            // InternalKinematics.g:2685:45: (iv_ruleMass= ruleMass EOF )
            // InternalKinematics.g:2686:2: iv_ruleMass= ruleMass EOF
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
    // InternalKinematics.g:2692:1: ruleMass returns [EObject current=null] : ( () otherlv_1= 'Mass' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleMass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:2698:2: ( ( () otherlv_1= 'Mass' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )? otherlv_5= '}' ) )
            // InternalKinematics.g:2699:2: ( () otherlv_1= 'Mass' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )? otherlv_5= '}' )
            {
            // InternalKinematics.g:2699:2: ( () otherlv_1= 'Mass' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )? otherlv_5= '}' )
            // InternalKinematics.g:2700:3: () otherlv_1= 'Mass' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )? otherlv_5= '}'
            {
            // InternalKinematics.g:2700:3: ()
            // InternalKinematics.g:2701:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMassAccess().getMassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,84,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMassAccess().getMassKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_92); 

            			newLeafNode(otherlv_2, grammarAccess.getMassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKinematics.g:2715:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==85) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalKinematics.g:2716:4: otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) )
                    {
                    otherlv_3=(Token)match(input,85,FOLLOW_46); 

                    				newLeafNode(otherlv_3, grammarAccess.getMassAccess().getValueKeyword_3_0());
                    			
                    // InternalKinematics.g:2720:4: ( (lv_value_4_0= ruleDouble0 ) )
                    // InternalKinematics.g:2721:5: (lv_value_4_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:2721:5: (lv_value_4_0= ruleDouble0 )
                    // InternalKinematics.g:2722:6: lv_value_4_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getMassAccess().getValueDouble0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_value_4_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMassRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
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
    // InternalKinematics.g:2748:1: entryRuleInertia returns [EObject current=null] : iv_ruleInertia= ruleInertia EOF ;
    public final EObject entryRuleInertia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertia = null;


        try {
            // InternalKinematics.g:2748:48: (iv_ruleInertia= ruleInertia EOF )
            // InternalKinematics.g:2749:2: iv_ruleInertia= ruleInertia EOF
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
    // InternalKinematics.g:2755:1: ruleInertia returns [EObject current=null] : ( () otherlv_1= 'Inertia' otherlv_2= '{' (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )? (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )? (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )? (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )? (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )? (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )? otherlv_15= '}' ) ;
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
            // InternalKinematics.g:2761:2: ( ( () otherlv_1= 'Inertia' otherlv_2= '{' (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )? (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )? (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )? (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )? (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )? (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )? otherlv_15= '}' ) )
            // InternalKinematics.g:2762:2: ( () otherlv_1= 'Inertia' otherlv_2= '{' (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )? (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )? (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )? (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )? (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )? (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )? otherlv_15= '}' )
            {
            // InternalKinematics.g:2762:2: ( () otherlv_1= 'Inertia' otherlv_2= '{' (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )? (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )? (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )? (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )? (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )? (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )? otherlv_15= '}' )
            // InternalKinematics.g:2763:3: () otherlv_1= 'Inertia' otherlv_2= '{' (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )? (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )? (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )? (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )? (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )? (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )? otherlv_15= '}'
            {
            // InternalKinematics.g:2763:3: ()
            // InternalKinematics.g:2764:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInertiaAccess().getInertiaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,86,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInertiaAccess().getInertiaKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_93); 

            			newLeafNode(otherlv_2, grammarAccess.getInertiaAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKinematics.g:2778:3: (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==87) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalKinematics.g:2779:4: otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) )
                    {
                    otherlv_3=(Token)match(input,87,FOLLOW_46); 

                    				newLeafNode(otherlv_3, grammarAccess.getInertiaAccess().getIxxKeyword_3_0());
                    			
                    // InternalKinematics.g:2783:4: ( (lv_ixx_4_0= ruleDouble0 ) )
                    // InternalKinematics.g:2784:5: (lv_ixx_4_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:2784:5: (lv_ixx_4_0= ruleDouble0 )
                    // InternalKinematics.g:2785:6: lv_ixx_4_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIxxDouble0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_94);
                    lv_ixx_4_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertiaRule());
                    						}
                    						set(
                    							current,
                    							"ixx",
                    							lv_ixx_4_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:2803:3: (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==88) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalKinematics.g:2804:4: otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) )
                    {
                    otherlv_5=(Token)match(input,88,FOLLOW_46); 

                    				newLeafNode(otherlv_5, grammarAccess.getInertiaAccess().getIxyKeyword_4_0());
                    			
                    // InternalKinematics.g:2808:4: ( (lv_ixy_6_0= ruleDouble0 ) )
                    // InternalKinematics.g:2809:5: (lv_ixy_6_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:2809:5: (lv_ixy_6_0= ruleDouble0 )
                    // InternalKinematics.g:2810:6: lv_ixy_6_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIxyDouble0ParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_95);
                    lv_ixy_6_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertiaRule());
                    						}
                    						set(
                    							current,
                    							"ixy",
                    							lv_ixy_6_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:2828:3: (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==89) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalKinematics.g:2829:4: otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) )
                    {
                    otherlv_7=(Token)match(input,89,FOLLOW_46); 

                    				newLeafNode(otherlv_7, grammarAccess.getInertiaAccess().getIxzKeyword_5_0());
                    			
                    // InternalKinematics.g:2833:4: ( (lv_ixz_8_0= ruleDouble0 ) )
                    // InternalKinematics.g:2834:5: (lv_ixz_8_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:2834:5: (lv_ixz_8_0= ruleDouble0 )
                    // InternalKinematics.g:2835:6: lv_ixz_8_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIxzDouble0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_96);
                    lv_ixz_8_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertiaRule());
                    						}
                    						set(
                    							current,
                    							"ixz",
                    							lv_ixz_8_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:2853:3: (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==90) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalKinematics.g:2854:4: otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) )
                    {
                    otherlv_9=(Token)match(input,90,FOLLOW_46); 

                    				newLeafNode(otherlv_9, grammarAccess.getInertiaAccess().getIyyKeyword_6_0());
                    			
                    // InternalKinematics.g:2858:4: ( (lv_iyy_10_0= ruleDouble0 ) )
                    // InternalKinematics.g:2859:5: (lv_iyy_10_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:2859:5: (lv_iyy_10_0= ruleDouble0 )
                    // InternalKinematics.g:2860:6: lv_iyy_10_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIyyDouble0ParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_97);
                    lv_iyy_10_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertiaRule());
                    						}
                    						set(
                    							current,
                    							"iyy",
                    							lv_iyy_10_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:2878:3: (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==91) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalKinematics.g:2879:4: otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) )
                    {
                    otherlv_11=(Token)match(input,91,FOLLOW_46); 

                    				newLeafNode(otherlv_11, grammarAccess.getInertiaAccess().getIyzKeyword_7_0());
                    			
                    // InternalKinematics.g:2883:4: ( (lv_iyz_12_0= ruleDouble0 ) )
                    // InternalKinematics.g:2884:5: (lv_iyz_12_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:2884:5: (lv_iyz_12_0= ruleDouble0 )
                    // InternalKinematics.g:2885:6: lv_iyz_12_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIyzDouble0ParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_98);
                    lv_iyz_12_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertiaRule());
                    						}
                    						set(
                    							current,
                    							"iyz",
                    							lv_iyz_12_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:2903:3: (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==92) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalKinematics.g:2904:4: otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) )
                    {
                    otherlv_13=(Token)match(input,92,FOLLOW_46); 

                    				newLeafNode(otherlv_13, grammarAccess.getInertiaAccess().getIzzKeyword_8_0());
                    			
                    // InternalKinematics.g:2908:4: ( (lv_izz_14_0= ruleDouble0 ) )
                    // InternalKinematics.g:2909:5: (lv_izz_14_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:2909:5: (lv_izz_14_0= ruleDouble0 )
                    // InternalKinematics.g:2910:6: lv_izz_14_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIzzDouble0ParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_izz_14_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertiaRule());
                    						}
                    						set(
                    							current,
                    							"izz",
                    							lv_izz_14_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
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
    // InternalKinematics.g:2936:1: entryRuleGeometry returns [EObject current=null] : iv_ruleGeometry= ruleGeometry EOF ;
    public final EObject entryRuleGeometry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeometry = null;


        try {
            // InternalKinematics.g:2936:49: (iv_ruleGeometry= ruleGeometry EOF )
            // InternalKinematics.g:2937:2: iv_ruleGeometry= ruleGeometry EOF
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
    // InternalKinematics.g:2943:1: ruleGeometry returns [EObject current=null] : ( () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )? (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )? otherlv_11= '}' ) ;
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
            // InternalKinematics.g:2949:2: ( ( () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )? (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )? otherlv_11= '}' ) )
            // InternalKinematics.g:2950:2: ( () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )? (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )? otherlv_11= '}' )
            {
            // InternalKinematics.g:2950:2: ( () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )? (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )? otherlv_11= '}' )
            // InternalKinematics.g:2951:3: () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )? (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )? otherlv_11= '}'
            {
            // InternalKinematics.g:2951:3: ()
            // InternalKinematics.g:2952:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGeometryAccess().getGeometryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,93,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGeometryAccess().getGeometryKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_99); 

            			newLeafNode(otherlv_2, grammarAccess.getGeometryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKinematics.g:2966:3: (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==94) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalKinematics.g:2967:4: otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) )
                    {
                    otherlv_3=(Token)match(input,94,FOLLOW_100); 

                    				newLeafNode(otherlv_3, grammarAccess.getGeometryAccess().getBoxKeyword_3_0());
                    			
                    // InternalKinematics.g:2971:4: ( (lv_box_4_0= ruleBox ) )
                    // InternalKinematics.g:2972:5: (lv_box_4_0= ruleBox )
                    {
                    // InternalKinematics.g:2972:5: (lv_box_4_0= ruleBox )
                    // InternalKinematics.g:2973:6: lv_box_4_0= ruleBox
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getBoxBoxParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_101);
                    lv_box_4_0=ruleBox();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGeometryRule());
                    						}
                    						set(
                    							current,
                    							"box",
                    							lv_box_4_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Box");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:2991:3: (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==95) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalKinematics.g:2992:4: otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) )
                    {
                    otherlv_5=(Token)match(input,95,FOLLOW_102); 

                    				newLeafNode(otherlv_5, grammarAccess.getGeometryAccess().getCylinderKeyword_4_0());
                    			
                    // InternalKinematics.g:2996:4: ( (lv_cylinder_6_0= ruleCylinder ) )
                    // InternalKinematics.g:2997:5: (lv_cylinder_6_0= ruleCylinder )
                    {
                    // InternalKinematics.g:2997:5: (lv_cylinder_6_0= ruleCylinder )
                    // InternalKinematics.g:2998:6: lv_cylinder_6_0= ruleCylinder
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getCylinderCylinderParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_103);
                    lv_cylinder_6_0=ruleCylinder();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGeometryRule());
                    						}
                    						set(
                    							current,
                    							"cylinder",
                    							lv_cylinder_6_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Cylinder");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:3016:3: (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==96) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalKinematics.g:3017:4: otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) )
                    {
                    otherlv_7=(Token)match(input,96,FOLLOW_104); 

                    				newLeafNode(otherlv_7, grammarAccess.getGeometryAccess().getSphereKeyword_5_0());
                    			
                    // InternalKinematics.g:3021:4: ( (lv_sphere_8_0= ruleSphere ) )
                    // InternalKinematics.g:3022:5: (lv_sphere_8_0= ruleSphere )
                    {
                    // InternalKinematics.g:3022:5: (lv_sphere_8_0= ruleSphere )
                    // InternalKinematics.g:3023:6: lv_sphere_8_0= ruleSphere
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getSphereSphereParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_105);
                    lv_sphere_8_0=ruleSphere();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGeometryRule());
                    						}
                    						set(
                    							current,
                    							"sphere",
                    							lv_sphere_8_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Sphere");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:3041:3: (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==97) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalKinematics.g:3042:4: otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) )
                    {
                    otherlv_9=(Token)match(input,97,FOLLOW_106); 

                    				newLeafNode(otherlv_9, grammarAccess.getGeometryAccess().getMeshKeyword_6_0());
                    			
                    // InternalKinematics.g:3046:4: ( (lv_mesh_10_0= ruleMesh ) )
                    // InternalKinematics.g:3047:5: (lv_mesh_10_0= ruleMesh )
                    {
                    // InternalKinematics.g:3047:5: (lv_mesh_10_0= ruleMesh )
                    // InternalKinematics.g:3048:6: lv_mesh_10_0= ruleMesh
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getMeshMeshParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_mesh_10_0=ruleMesh();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGeometryRule());
                    						}
                    						set(
                    							current,
                    							"mesh",
                    							lv_mesh_10_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Mesh");
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
    // InternalKinematics.g:3074:1: entryRuleMaterial returns [EObject current=null] : iv_ruleMaterial= ruleMaterial EOF ;
    public final EObject entryRuleMaterial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaterial = null;


        try {
            // InternalKinematics.g:3074:49: (iv_ruleMaterial= ruleMaterial EOF )
            // InternalKinematics.g:3075:2: iv_ruleMaterial= ruleMaterial EOF
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
    // InternalKinematics.g:3081:1: ruleMaterial returns [EObject current=null] : ( () otherlv_1= 'Material' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'color' ( (lv_color_6_0= ruleColor ) ) )? (otherlv_7= 'texture' ( (lv_texture_8_0= ruleTexture ) ) )? otherlv_9= '}' ) ;
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
            // InternalKinematics.g:3087:2: ( ( () otherlv_1= 'Material' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'color' ( (lv_color_6_0= ruleColor ) ) )? (otherlv_7= 'texture' ( (lv_texture_8_0= ruleTexture ) ) )? otherlv_9= '}' ) )
            // InternalKinematics.g:3088:2: ( () otherlv_1= 'Material' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'color' ( (lv_color_6_0= ruleColor ) ) )? (otherlv_7= 'texture' ( (lv_texture_8_0= ruleTexture ) ) )? otherlv_9= '}' )
            {
            // InternalKinematics.g:3088:2: ( () otherlv_1= 'Material' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'color' ( (lv_color_6_0= ruleColor ) ) )? (otherlv_7= 'texture' ( (lv_texture_8_0= ruleTexture ) ) )? otherlv_9= '}' )
            // InternalKinematics.g:3089:3: () otherlv_1= 'Material' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'color' ( (lv_color_6_0= ruleColor ) ) )? (otherlv_7= 'texture' ( (lv_texture_8_0= ruleTexture ) ) )? otherlv_9= '}'
            {
            // InternalKinematics.g:3089:3: ()
            // InternalKinematics.g:3090:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMaterialAccess().getMaterialAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,98,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMaterialAccess().getMaterialKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_107); 

            			newLeafNode(otherlv_2, grammarAccess.getMaterialAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKinematics.g:3104:3: (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==17) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalKinematics.g:3105:4: otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getMaterialAccess().getNameKeyword_3_0());
                    			
                    // InternalKinematics.g:3109:4: ( (lv_name_4_0= ruleEString ) )
                    // InternalKinematics.g:3110:5: (lv_name_4_0= ruleEString )
                    {
                    // InternalKinematics.g:3110:5: (lv_name_4_0= ruleEString )
                    // InternalKinematics.g:3111:6: lv_name_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMaterialAccess().getNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_name_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMaterialRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:3129:3: (otherlv_5= 'color' ( (lv_color_6_0= ruleColor ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==41) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalKinematics.g:3130:4: otherlv_5= 'color' ( (lv_color_6_0= ruleColor ) )
                    {
                    otherlv_5=(Token)match(input,41,FOLLOW_42); 

                    				newLeafNode(otherlv_5, grammarAccess.getMaterialAccess().getColorKeyword_4_0());
                    			
                    // InternalKinematics.g:3134:4: ( (lv_color_6_0= ruleColor ) )
                    // InternalKinematics.g:3135:5: (lv_color_6_0= ruleColor )
                    {
                    // InternalKinematics.g:3135:5: (lv_color_6_0= ruleColor )
                    // InternalKinematics.g:3136:6: lv_color_6_0= ruleColor
                    {

                    						newCompositeNode(grammarAccess.getMaterialAccess().getColorColorParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_color_6_0=ruleColor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMaterialRule());
                    						}
                    						set(
                    							current,
                    							"color",
                    							lv_color_6_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:3154:3: (otherlv_7= 'texture' ( (lv_texture_8_0= ruleTexture ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==42) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalKinematics.g:3155:4: otherlv_7= 'texture' ( (lv_texture_8_0= ruleTexture ) )
                    {
                    otherlv_7=(Token)match(input,42,FOLLOW_44); 

                    				newLeafNode(otherlv_7, grammarAccess.getMaterialAccess().getTextureKeyword_5_0());
                    			
                    // InternalKinematics.g:3159:4: ( (lv_texture_8_0= ruleTexture ) )
                    // InternalKinematics.g:3160:5: (lv_texture_8_0= ruleTexture )
                    {
                    // InternalKinematics.g:3160:5: (lv_texture_8_0= ruleTexture )
                    // InternalKinematics.g:3161:6: lv_texture_8_0= ruleTexture
                    {

                    						newCompositeNode(grammarAccess.getMaterialAccess().getTextureTextureParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_texture_8_0=ruleTexture();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMaterialRule());
                    						}
                    						set(
                    							current,
                    							"texture",
                    							lv_texture_8_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Texture");
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
    // InternalKinematics.g:3187:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // InternalKinematics.g:3187:44: (iv_ruleBox= ruleBox EOF )
            // InternalKinematics.g:3188:2: iv_ruleBox= ruleBox EOF
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
    // InternalKinematics.g:3194:1: ruleBox returns [EObject current=null] : ( () otherlv_1= 'Box' otherlv_2= '{' (otherlv_3= 'size' ( (lv_size_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_size_4_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:3200:2: ( ( () otherlv_1= 'Box' otherlv_2= '{' (otherlv_3= 'size' ( (lv_size_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalKinematics.g:3201:2: ( () otherlv_1= 'Box' otherlv_2= '{' (otherlv_3= 'size' ( (lv_size_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalKinematics.g:3201:2: ( () otherlv_1= 'Box' otherlv_2= '{' (otherlv_3= 'size' ( (lv_size_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalKinematics.g:3202:3: () otherlv_1= 'Box' otherlv_2= '{' (otherlv_3= 'size' ( (lv_size_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalKinematics.g:3202:3: ()
            // InternalKinematics.g:3203:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoxAccess().getBoxAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,99,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBoxAccess().getBoxKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_108); 

            			newLeafNode(otherlv_2, grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKinematics.g:3217:3: (otherlv_3= 'size' ( (lv_size_4_0= ruleEString ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==100) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalKinematics.g:3218:4: otherlv_3= 'size' ( (lv_size_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,100,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getBoxAccess().getSizeKeyword_3_0());
                    			
                    // InternalKinematics.g:3222:4: ( (lv_size_4_0= ruleEString ) )
                    // InternalKinematics.g:3223:5: (lv_size_4_0= ruleEString )
                    {
                    // InternalKinematics.g:3223:5: (lv_size_4_0= ruleEString )
                    // InternalKinematics.g:3224:6: lv_size_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBoxAccess().getSizeEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_size_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoxRule());
                    						}
                    						set(
                    							current,
                    							"size",
                    							lv_size_4_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.EString");
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
    // InternalKinematics.g:3250:1: entryRuleCylinder returns [EObject current=null] : iv_ruleCylinder= ruleCylinder EOF ;
    public final EObject entryRuleCylinder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCylinder = null;


        try {
            // InternalKinematics.g:3250:49: (iv_ruleCylinder= ruleCylinder EOF )
            // InternalKinematics.g:3251:2: iv_ruleCylinder= ruleCylinder EOF
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
    // InternalKinematics.g:3257:1: ruleCylinder returns [EObject current=null] : (otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}' ) ;
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
            // InternalKinematics.g:3263:2: ( (otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}' ) )
            // InternalKinematics.g:3264:2: (otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}' )
            {
            // InternalKinematics.g:3264:2: (otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}' )
            // InternalKinematics.g:3265:3: otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,101,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCylinderAccess().getCylinderKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_109); 

            			newLeafNode(otherlv_1, grammarAccess.getCylinderAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,102,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getCylinderAccess().getLengthKeyword_2());
            		
            // InternalKinematics.g:3277:3: ( (lv_length_3_0= ruleDouble0 ) )
            // InternalKinematics.g:3278:4: (lv_length_3_0= ruleDouble0 )
            {
            // InternalKinematics.g:3278:4: (lv_length_3_0= ruleDouble0 )
            // InternalKinematics.g:3279:5: lv_length_3_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getCylinderAccess().getLengthDouble0ParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_110);
            lv_length_3_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCylinderRule());
            					}
            					set(
            						current,
            						"length",
            						lv_length_3_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,103,FOLLOW_46); 

            			newLeafNode(otherlv_4, grammarAccess.getCylinderAccess().getRadiusKeyword_4());
            		
            // InternalKinematics.g:3300:3: ( (lv_radius_5_0= ruleDouble0 ) )
            // InternalKinematics.g:3301:4: (lv_radius_5_0= ruleDouble0 )
            {
            // InternalKinematics.g:3301:4: (lv_radius_5_0= ruleDouble0 )
            // InternalKinematics.g:3302:5: lv_radius_5_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getCylinderAccess().getRadiusDouble0ParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
            lv_radius_5_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCylinderRule());
            					}
            					set(
            						current,
            						"radius",
            						lv_radius_5_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
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
    // InternalKinematics.g:3327:1: entryRuleSphere returns [EObject current=null] : iv_ruleSphere= ruleSphere EOF ;
    public final EObject entryRuleSphere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSphere = null;


        try {
            // InternalKinematics.g:3327:47: (iv_ruleSphere= ruleSphere EOF )
            // InternalKinematics.g:3328:2: iv_ruleSphere= ruleSphere EOF
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
    // InternalKinematics.g:3334:1: ruleSphere returns [EObject current=null] : (otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}' ) ;
    public final EObject ruleSphere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_radius_3_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:3340:2: ( (otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}' ) )
            // InternalKinematics.g:3341:2: (otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}' )
            {
            // InternalKinematics.g:3341:2: (otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}' )
            // InternalKinematics.g:3342:3: otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,104,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSphereAccess().getSphereKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_110); 

            			newLeafNode(otherlv_1, grammarAccess.getSphereAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,103,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getSphereAccess().getRadiusKeyword_2());
            		
            // InternalKinematics.g:3354:3: ( (lv_radius_3_0= ruleDouble0 ) )
            // InternalKinematics.g:3355:4: (lv_radius_3_0= ruleDouble0 )
            {
            // InternalKinematics.g:3355:4: (lv_radius_3_0= ruleDouble0 )
            // InternalKinematics.g:3356:5: lv_radius_3_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getSphereAccess().getRadiusDouble0ParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_radius_3_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSphereRule());
            					}
            					set(
            						current,
            						"radius",
            						lv_radius_3_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
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
    // InternalKinematics.g:3381:1: entryRuleMesh returns [EObject current=null] : iv_ruleMesh= ruleMesh EOF ;
    public final EObject entryRuleMesh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMesh = null;


        try {
            // InternalKinematics.g:3381:45: (iv_ruleMesh= ruleMesh EOF )
            // InternalKinematics.g:3382:2: iv_ruleMesh= ruleMesh EOF
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
    // InternalKinematics.g:3388:1: ruleMesh returns [EObject current=null] : (otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= ruleEString ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
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
            // InternalKinematics.g:3394:2: ( (otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= ruleEString ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalKinematics.g:3395:2: (otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= ruleEString ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalKinematics.g:3395:2: (otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= ruleEString ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalKinematics.g:3396:3: otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= ruleEString ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,105,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMeshAccess().getMeshKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_111); 

            			newLeafNode(otherlv_1, grammarAccess.getMeshAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,106,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMeshAccess().getFilenameKeyword_2());
            		
            // InternalKinematics.g:3408:3: ( (lv_filename_3_0= ruleEString ) )
            // InternalKinematics.g:3409:4: (lv_filename_3_0= ruleEString )
            {
            // InternalKinematics.g:3409:4: (lv_filename_3_0= ruleEString )
            // InternalKinematics.g:3410:5: lv_filename_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeshAccess().getFilenameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_112);
            lv_filename_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeshRule());
            					}
            					set(
            						current,
            						"filename",
            						lv_filename_3_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKinematics.g:3427:3: (otherlv_4= 'scale' ( (lv_scale_5_0= ruleEString ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==107) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalKinematics.g:3428:4: otherlv_4= 'scale' ( (lv_scale_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,107,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getMeshAccess().getScaleKeyword_4_0());
                    			
                    // InternalKinematics.g:3432:4: ( (lv_scale_5_0= ruleEString ) )
                    // InternalKinematics.g:3433:5: (lv_scale_5_0= ruleEString )
                    {
                    // InternalKinematics.g:3433:5: (lv_scale_5_0= ruleEString )
                    // InternalKinematics.g:3434:6: lv_scale_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeshAccess().getScaleEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_scale_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeshRule());
                    						}
                    						set(
                    							current,
                    							"scale",
                    							lv_scale_5_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.EString");
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
    // InternalKinematics.g:3460:1: entryRuleAnyURI returns [String current=null] : iv_ruleAnyURI= ruleAnyURI EOF ;
    public final String entryRuleAnyURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnyURI = null;


        try {
            // InternalKinematics.g:3460:46: (iv_ruleAnyURI= ruleAnyURI EOF )
            // InternalKinematics.g:3461:2: iv_ruleAnyURI= ruleAnyURI EOF
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
    // InternalKinematics.g:3467:1: ruleAnyURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'AnyURI' ;
    public final AntlrDatatypeRuleToken ruleAnyURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKinematics.g:3473:2: (kw= 'AnyURI' )
            // InternalKinematics.g:3474:2: kw= 'AnyURI'
            {
            kw=(Token)match(input,108,FOLLOW_2); 

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
    // InternalKinematics.g:3482:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalKinematics.g:3482:46: (iv_ruleColor= ruleColor EOF )
            // InternalKinematics.g:3483:2: iv_ruleColor= ruleColor EOF
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
    // InternalKinematics.g:3489:1: ruleColor returns [EObject current=null] : ( () otherlv_1= 'Color' otherlv_2= '{' (otherlv_3= 'rgba' ( (lv_rgba_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_rgba_4_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:3495:2: ( ( () otherlv_1= 'Color' otherlv_2= '{' (otherlv_3= 'rgba' ( (lv_rgba_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalKinematics.g:3496:2: ( () otherlv_1= 'Color' otherlv_2= '{' (otherlv_3= 'rgba' ( (lv_rgba_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalKinematics.g:3496:2: ( () otherlv_1= 'Color' otherlv_2= '{' (otherlv_3= 'rgba' ( (lv_rgba_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalKinematics.g:3497:3: () otherlv_1= 'Color' otherlv_2= '{' (otherlv_3= 'rgba' ( (lv_rgba_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalKinematics.g:3497:3: ()
            // InternalKinematics.g:3498:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColorAccess().getColorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,109,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getColorAccess().getColorKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_113); 

            			newLeafNode(otherlv_2, grammarAccess.getColorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKinematics.g:3512:3: (otherlv_3= 'rgba' ( (lv_rgba_4_0= ruleEString ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==110) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalKinematics.g:3513:4: otherlv_3= 'rgba' ( (lv_rgba_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,110,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getColorAccess().getRgbaKeyword_3_0());
                    			
                    // InternalKinematics.g:3517:4: ( (lv_rgba_4_0= ruleEString ) )
                    // InternalKinematics.g:3518:5: (lv_rgba_4_0= ruleEString )
                    {
                    // InternalKinematics.g:3518:5: (lv_rgba_4_0= ruleEString )
                    // InternalKinematics.g:3519:6: lv_rgba_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getColorAccess().getRgbaEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_rgba_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColorRule());
                    						}
                    						set(
                    							current,
                    							"rgba",
                    							lv_rgba_4_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.EString");
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
    // InternalKinematics.g:3545:1: entryRuleTexture returns [EObject current=null] : iv_ruleTexture= ruleTexture EOF ;
    public final EObject entryRuleTexture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTexture = null;


        try {
            // InternalKinematics.g:3545:48: (iv_ruleTexture= ruleTexture EOF )
            // InternalKinematics.g:3546:2: iv_ruleTexture= ruleTexture EOF
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
    // InternalKinematics.g:3552:1: ruleTexture returns [EObject current=null] : ( () otherlv_1= 'Texture' otherlv_2= '{' (otherlv_3= 'filename' ( (lv_filename_4_0= ruleAnyURI ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleTexture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_filename_4_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:3558:2: ( ( () otherlv_1= 'Texture' otherlv_2= '{' (otherlv_3= 'filename' ( (lv_filename_4_0= ruleAnyURI ) ) )? otherlv_5= '}' ) )
            // InternalKinematics.g:3559:2: ( () otherlv_1= 'Texture' otherlv_2= '{' (otherlv_3= 'filename' ( (lv_filename_4_0= ruleAnyURI ) ) )? otherlv_5= '}' )
            {
            // InternalKinematics.g:3559:2: ( () otherlv_1= 'Texture' otherlv_2= '{' (otherlv_3= 'filename' ( (lv_filename_4_0= ruleAnyURI ) ) )? otherlv_5= '}' )
            // InternalKinematics.g:3560:3: () otherlv_1= 'Texture' otherlv_2= '{' (otherlv_3= 'filename' ( (lv_filename_4_0= ruleAnyURI ) ) )? otherlv_5= '}'
            {
            // InternalKinematics.g:3560:3: ()
            // InternalKinematics.g:3561:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextureAccess().getTextureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,111,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTextureAccess().getTextureKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_114); 

            			newLeafNode(otherlv_2, grammarAccess.getTextureAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKinematics.g:3575:3: (otherlv_3= 'filename' ( (lv_filename_4_0= ruleAnyURI ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==106) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalKinematics.g:3576:4: otherlv_3= 'filename' ( (lv_filename_4_0= ruleAnyURI ) )
                    {
                    otherlv_3=(Token)match(input,106,FOLLOW_115); 

                    				newLeafNode(otherlv_3, grammarAccess.getTextureAccess().getFilenameKeyword_3_0());
                    			
                    // InternalKinematics.g:3580:4: ( (lv_filename_4_0= ruleAnyURI ) )
                    // InternalKinematics.g:3581:5: (lv_filename_4_0= ruleAnyURI )
                    {
                    // InternalKinematics.g:3581:5: (lv_filename_4_0= ruleAnyURI )
                    // InternalKinematics.g:3582:6: lv_filename_4_0= ruleAnyURI
                    {

                    						newCompositeNode(grammarAccess.getTextureAccess().getFilenameAnyURIParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_filename_4_0=ruleAnyURI();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextureRule());
                    						}
                    						set(
                    							current,
                    							"filename",
                    							lv_filename_4_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.AnyURI");
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
    // InternalKinematics.g:3608:1: entryRuleVerbose returns [EObject current=null] : iv_ruleVerbose= ruleVerbose EOF ;
    public final EObject entryRuleVerbose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerbose = null;


        try {
            // InternalKinematics.g:3608:48: (iv_ruleVerbose= ruleVerbose EOF )
            // InternalKinematics.g:3609:2: iv_ruleVerbose= ruleVerbose EOF
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
    // InternalKinematics.g:3615:1: ruleVerbose returns [EObject current=null] : ( () otherlv_1= 'Verbose' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleVerbose() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:3621:2: ( ( () otherlv_1= 'Verbose' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalKinematics.g:3622:2: ( () otherlv_1= 'Verbose' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalKinematics.g:3622:2: ( () otherlv_1= 'Verbose' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalKinematics.g:3623:3: () otherlv_1= 'Verbose' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalKinematics.g:3623:3: ()
            // InternalKinematics.g:3624:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVerboseAccess().getVerboseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,112,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVerboseAccess().getVerboseKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_92); 

            			newLeafNode(otherlv_2, grammarAccess.getVerboseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKinematics.g:3638:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==85) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalKinematics.g:3639:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,85,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getVerboseAccess().getValueKeyword_3_0());
                    			
                    // InternalKinematics.g:3643:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalKinematics.g:3644:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalKinematics.g:3644:5: (lv_value_4_0= ruleEString )
                    // InternalKinematics.g:3645:6: lv_value_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVerboseAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVerboseRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.EString");
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
    // InternalKinematics.g:3671:1: entryRuleActuatorTransmission returns [EObject current=null] : iv_ruleActuatorTransmission= ruleActuatorTransmission EOF ;
    public final EObject entryRuleActuatorTransmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuatorTransmission = null;


        try {
            // InternalKinematics.g:3671:61: (iv_ruleActuatorTransmission= ruleActuatorTransmission EOF )
            // InternalKinematics.g:3672:2: iv_ruleActuatorTransmission= ruleActuatorTransmission EOF
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
    // InternalKinematics.g:3678:1: ruleActuatorTransmission returns [EObject current=null] : (otherlv_0= 'ActuatorTransmission' otherlv_1= '{' otherlv_2= 'mechanicalReduction' ( (lv_mechanicalReduction_3_0= ruleDouble0 ) ) otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '}' ) ;
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
            // InternalKinematics.g:3684:2: ( (otherlv_0= 'ActuatorTransmission' otherlv_1= '{' otherlv_2= 'mechanicalReduction' ( (lv_mechanicalReduction_3_0= ruleDouble0 ) ) otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '}' ) )
            // InternalKinematics.g:3685:2: (otherlv_0= 'ActuatorTransmission' otherlv_1= '{' otherlv_2= 'mechanicalReduction' ( (lv_mechanicalReduction_3_0= ruleDouble0 ) ) otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '}' )
            {
            // InternalKinematics.g:3685:2: (otherlv_0= 'ActuatorTransmission' otherlv_1= '{' otherlv_2= 'mechanicalReduction' ( (lv_mechanicalReduction_3_0= ruleDouble0 ) ) otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '}' )
            // InternalKinematics.g:3686:3: otherlv_0= 'ActuatorTransmission' otherlv_1= '{' otherlv_2= 'mechanicalReduction' ( (lv_mechanicalReduction_3_0= ruleDouble0 ) ) otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,113,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActuatorTransmissionAccess().getActuatorTransmissionKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_116); 

            			newLeafNode(otherlv_1, grammarAccess.getActuatorTransmissionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,44,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getActuatorTransmissionAccess().getMechanicalReductionKeyword_2());
            		
            // InternalKinematics.g:3698:3: ( (lv_mechanicalReduction_3_0= ruleDouble0 ) )
            // InternalKinematics.g:3699:4: (lv_mechanicalReduction_3_0= ruleDouble0 )
            {
            // InternalKinematics.g:3699:4: (lv_mechanicalReduction_3_0= ruleDouble0 )
            // InternalKinematics.g:3700:5: lv_mechanicalReduction_3_0= ruleDouble0
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
            						"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getActuatorTransmissionAccess().getNameKeyword_4());
            		
            // InternalKinematics.g:3721:3: ( (lv_name_5_0= ruleEString ) )
            // InternalKinematics.g:3722:4: (lv_name_5_0= ruleEString )
            {
            // InternalKinematics.g:3722:4: (lv_name_5_0= ruleEString )
            // InternalKinematics.g:3723:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActuatorTransmissionAccess().getNameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
            lv_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActuatorTransmissionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
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
    // InternalKinematics.g:3748:1: entryRuleGapJointTransmission returns [EObject current=null] : iv_ruleGapJointTransmission= ruleGapJointTransmission EOF ;
    public final EObject entryRuleGapJointTransmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGapJointTransmission = null;


        try {
            // InternalKinematics.g:3748:61: (iv_ruleGapJointTransmission= ruleGapJointTransmission EOF )
            // InternalKinematics.g:3749:2: iv_ruleGapJointTransmission= ruleGapJointTransmission EOF
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
    // InternalKinematics.g:3755:1: ruleGapJointTransmission returns [EObject current=null] : (otherlv_0= 'GapJointTransmission' otherlv_1= '{' otherlv_2= 'a' ( (lv_a_3_0= ruleDouble0 ) ) otherlv_4= 'b' ( (lv_b_5_0= ruleDouble0 ) ) otherlv_6= 'gearRatio' ( (lv_gearRatio_7_0= ruleDouble0 ) ) otherlv_8= 'h' ( (lv_h_9_0= ruleDouble0 ) ) otherlv_10= 'l0' ( (lv_l0_11_0= ruleDouble0 ) ) otherlv_12= 'mechanicalReduction' ( (lv_mechanicalReduction_13_0= ruleDouble0 ) ) otherlv_14= 'name' ( (lv_name_15_0= ruleEString ) ) otherlv_16= 'phi0' ( (lv_phi0_17_0= ruleDouble0 ) ) otherlv_18= 'r' ( (lv_r_19_0= ruleDouble0 ) ) otherlv_20= 'screwReduction' ( (lv_screwReduction_21_0= ruleDouble0 ) ) otherlv_22= 't0' ( (lv_t0_23_0= ruleDouble0 ) ) otherlv_24= 'theta0' ( (lv_theta0_25_0= ruleDouble0 ) ) otherlv_26= '}' ) ;
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
            // InternalKinematics.g:3761:2: ( (otherlv_0= 'GapJointTransmission' otherlv_1= '{' otherlv_2= 'a' ( (lv_a_3_0= ruleDouble0 ) ) otherlv_4= 'b' ( (lv_b_5_0= ruleDouble0 ) ) otherlv_6= 'gearRatio' ( (lv_gearRatio_7_0= ruleDouble0 ) ) otherlv_8= 'h' ( (lv_h_9_0= ruleDouble0 ) ) otherlv_10= 'l0' ( (lv_l0_11_0= ruleDouble0 ) ) otherlv_12= 'mechanicalReduction' ( (lv_mechanicalReduction_13_0= ruleDouble0 ) ) otherlv_14= 'name' ( (lv_name_15_0= ruleEString ) ) otherlv_16= 'phi0' ( (lv_phi0_17_0= ruleDouble0 ) ) otherlv_18= 'r' ( (lv_r_19_0= ruleDouble0 ) ) otherlv_20= 'screwReduction' ( (lv_screwReduction_21_0= ruleDouble0 ) ) otherlv_22= 't0' ( (lv_t0_23_0= ruleDouble0 ) ) otherlv_24= 'theta0' ( (lv_theta0_25_0= ruleDouble0 ) ) otherlv_26= '}' ) )
            // InternalKinematics.g:3762:2: (otherlv_0= 'GapJointTransmission' otherlv_1= '{' otherlv_2= 'a' ( (lv_a_3_0= ruleDouble0 ) ) otherlv_4= 'b' ( (lv_b_5_0= ruleDouble0 ) ) otherlv_6= 'gearRatio' ( (lv_gearRatio_7_0= ruleDouble0 ) ) otherlv_8= 'h' ( (lv_h_9_0= ruleDouble0 ) ) otherlv_10= 'l0' ( (lv_l0_11_0= ruleDouble0 ) ) otherlv_12= 'mechanicalReduction' ( (lv_mechanicalReduction_13_0= ruleDouble0 ) ) otherlv_14= 'name' ( (lv_name_15_0= ruleEString ) ) otherlv_16= 'phi0' ( (lv_phi0_17_0= ruleDouble0 ) ) otherlv_18= 'r' ( (lv_r_19_0= ruleDouble0 ) ) otherlv_20= 'screwReduction' ( (lv_screwReduction_21_0= ruleDouble0 ) ) otherlv_22= 't0' ( (lv_t0_23_0= ruleDouble0 ) ) otherlv_24= 'theta0' ( (lv_theta0_25_0= ruleDouble0 ) ) otherlv_26= '}' )
            {
            // InternalKinematics.g:3762:2: (otherlv_0= 'GapJointTransmission' otherlv_1= '{' otherlv_2= 'a' ( (lv_a_3_0= ruleDouble0 ) ) otherlv_4= 'b' ( (lv_b_5_0= ruleDouble0 ) ) otherlv_6= 'gearRatio' ( (lv_gearRatio_7_0= ruleDouble0 ) ) otherlv_8= 'h' ( (lv_h_9_0= ruleDouble0 ) ) otherlv_10= 'l0' ( (lv_l0_11_0= ruleDouble0 ) ) otherlv_12= 'mechanicalReduction' ( (lv_mechanicalReduction_13_0= ruleDouble0 ) ) otherlv_14= 'name' ( (lv_name_15_0= ruleEString ) ) otherlv_16= 'phi0' ( (lv_phi0_17_0= ruleDouble0 ) ) otherlv_18= 'r' ( (lv_r_19_0= ruleDouble0 ) ) otherlv_20= 'screwReduction' ( (lv_screwReduction_21_0= ruleDouble0 ) ) otherlv_22= 't0' ( (lv_t0_23_0= ruleDouble0 ) ) otherlv_24= 'theta0' ( (lv_theta0_25_0= ruleDouble0 ) ) otherlv_26= '}' )
            // InternalKinematics.g:3763:3: otherlv_0= 'GapJointTransmission' otherlv_1= '{' otherlv_2= 'a' ( (lv_a_3_0= ruleDouble0 ) ) otherlv_4= 'b' ( (lv_b_5_0= ruleDouble0 ) ) otherlv_6= 'gearRatio' ( (lv_gearRatio_7_0= ruleDouble0 ) ) otherlv_8= 'h' ( (lv_h_9_0= ruleDouble0 ) ) otherlv_10= 'l0' ( (lv_l0_11_0= ruleDouble0 ) ) otherlv_12= 'mechanicalReduction' ( (lv_mechanicalReduction_13_0= ruleDouble0 ) ) otherlv_14= 'name' ( (lv_name_15_0= ruleEString ) ) otherlv_16= 'phi0' ( (lv_phi0_17_0= ruleDouble0 ) ) otherlv_18= 'r' ( (lv_r_19_0= ruleDouble0 ) ) otherlv_20= 'screwReduction' ( (lv_screwReduction_21_0= ruleDouble0 ) ) otherlv_22= 't0' ( (lv_t0_23_0= ruleDouble0 ) ) otherlv_24= 'theta0' ( (lv_theta0_25_0= ruleDouble0 ) ) otherlv_26= '}'
            {
            otherlv_0=(Token)match(input,114,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGapJointTransmissionAccess().getGapJointTransmissionKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_117); 

            			newLeafNode(otherlv_1, grammarAccess.getGapJointTransmissionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,115,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getGapJointTransmissionAccess().getAKeyword_2());
            		
            // InternalKinematics.g:3775:3: ( (lv_a_3_0= ruleDouble0 ) )
            // InternalKinematics.g:3776:4: (lv_a_3_0= ruleDouble0 )
            {
            // InternalKinematics.g:3776:4: (lv_a_3_0= ruleDouble0 )
            // InternalKinematics.g:3777:5: lv_a_3_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getADouble0ParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_118);
            lv_a_3_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGapJointTransmissionRule());
            					}
            					set(
            						current,
            						"a",
            						lv_a_3_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,116,FOLLOW_46); 

            			newLeafNode(otherlv_4, grammarAccess.getGapJointTransmissionAccess().getBKeyword_4());
            		
            // InternalKinematics.g:3798:3: ( (lv_b_5_0= ruleDouble0 ) )
            // InternalKinematics.g:3799:4: (lv_b_5_0= ruleDouble0 )
            {
            // InternalKinematics.g:3799:4: (lv_b_5_0= ruleDouble0 )
            // InternalKinematics.g:3800:5: lv_b_5_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getBDouble0ParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_119);
            lv_b_5_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGapJointTransmissionRule());
            					}
            					set(
            						current,
            						"b",
            						lv_b_5_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,117,FOLLOW_46); 

            			newLeafNode(otherlv_6, grammarAccess.getGapJointTransmissionAccess().getGearRatioKeyword_6());
            		
            // InternalKinematics.g:3821:3: ( (lv_gearRatio_7_0= ruleDouble0 ) )
            // InternalKinematics.g:3822:4: (lv_gearRatio_7_0= ruleDouble0 )
            {
            // InternalKinematics.g:3822:4: (lv_gearRatio_7_0= ruleDouble0 )
            // InternalKinematics.g:3823:5: lv_gearRatio_7_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getGearRatioDouble0ParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_120);
            lv_gearRatio_7_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGapJointTransmissionRule());
            					}
            					set(
            						current,
            						"gearRatio",
            						lv_gearRatio_7_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,118,FOLLOW_46); 

            			newLeafNode(otherlv_8, grammarAccess.getGapJointTransmissionAccess().getHKeyword_8());
            		
            // InternalKinematics.g:3844:3: ( (lv_h_9_0= ruleDouble0 ) )
            // InternalKinematics.g:3845:4: (lv_h_9_0= ruleDouble0 )
            {
            // InternalKinematics.g:3845:4: (lv_h_9_0= ruleDouble0 )
            // InternalKinematics.g:3846:5: lv_h_9_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getHDouble0ParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_121);
            lv_h_9_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGapJointTransmissionRule());
            					}
            					set(
            						current,
            						"h",
            						lv_h_9_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,119,FOLLOW_46); 

            			newLeafNode(otherlv_10, grammarAccess.getGapJointTransmissionAccess().getL0Keyword_10());
            		
            // InternalKinematics.g:3867:3: ( (lv_l0_11_0= ruleDouble0 ) )
            // InternalKinematics.g:3868:4: (lv_l0_11_0= ruleDouble0 )
            {
            // InternalKinematics.g:3868:4: (lv_l0_11_0= ruleDouble0 )
            // InternalKinematics.g:3869:5: lv_l0_11_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getL0Double0ParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_116);
            lv_l0_11_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGapJointTransmissionRule());
            					}
            					set(
            						current,
            						"l0",
            						lv_l0_11_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,44,FOLLOW_46); 

            			newLeafNode(otherlv_12, grammarAccess.getGapJointTransmissionAccess().getMechanicalReductionKeyword_12());
            		
            // InternalKinematics.g:3890:3: ( (lv_mechanicalReduction_13_0= ruleDouble0 ) )
            // InternalKinematics.g:3891:4: (lv_mechanicalReduction_13_0= ruleDouble0 )
            {
            // InternalKinematics.g:3891:4: (lv_mechanicalReduction_13_0= ruleDouble0 )
            // InternalKinematics.g:3892:5: lv_mechanicalReduction_13_0= ruleDouble0
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
            						"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_14, grammarAccess.getGapJointTransmissionAccess().getNameKeyword_14());
            		
            // InternalKinematics.g:3913:3: ( (lv_name_15_0= ruleEString ) )
            // InternalKinematics.g:3914:4: (lv_name_15_0= ruleEString )
            {
            // InternalKinematics.g:3914:4: (lv_name_15_0= ruleEString )
            // InternalKinematics.g:3915:5: lv_name_15_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getNameEStringParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_122);
            lv_name_15_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGapJointTransmissionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_15_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,120,FOLLOW_46); 

            			newLeafNode(otherlv_16, grammarAccess.getGapJointTransmissionAccess().getPhi0Keyword_16());
            		
            // InternalKinematics.g:3936:3: ( (lv_phi0_17_0= ruleDouble0 ) )
            // InternalKinematics.g:3937:4: (lv_phi0_17_0= ruleDouble0 )
            {
            // InternalKinematics.g:3937:4: (lv_phi0_17_0= ruleDouble0 )
            // InternalKinematics.g:3938:5: lv_phi0_17_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getPhi0Double0ParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_123);
            lv_phi0_17_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGapJointTransmissionRule());
            					}
            					set(
            						current,
            						"phi0",
            						lv_phi0_17_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,121,FOLLOW_46); 

            			newLeafNode(otherlv_18, grammarAccess.getGapJointTransmissionAccess().getRKeyword_18());
            		
            // InternalKinematics.g:3959:3: ( (lv_r_19_0= ruleDouble0 ) )
            // InternalKinematics.g:3960:4: (lv_r_19_0= ruleDouble0 )
            {
            // InternalKinematics.g:3960:4: (lv_r_19_0= ruleDouble0 )
            // InternalKinematics.g:3961:5: lv_r_19_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getRDouble0ParserRuleCall_19_0());
            				
            pushFollow(FOLLOW_124);
            lv_r_19_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGapJointTransmissionRule());
            					}
            					set(
            						current,
            						"r",
            						lv_r_19_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_20=(Token)match(input,122,FOLLOW_46); 

            			newLeafNode(otherlv_20, grammarAccess.getGapJointTransmissionAccess().getScrewReductionKeyword_20());
            		
            // InternalKinematics.g:3982:3: ( (lv_screwReduction_21_0= ruleDouble0 ) )
            // InternalKinematics.g:3983:4: (lv_screwReduction_21_0= ruleDouble0 )
            {
            // InternalKinematics.g:3983:4: (lv_screwReduction_21_0= ruleDouble0 )
            // InternalKinematics.g:3984:5: lv_screwReduction_21_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getScrewReductionDouble0ParserRuleCall_21_0());
            				
            pushFollow(FOLLOW_125);
            lv_screwReduction_21_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGapJointTransmissionRule());
            					}
            					set(
            						current,
            						"screwReduction",
            						lv_screwReduction_21_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_22=(Token)match(input,123,FOLLOW_46); 

            			newLeafNode(otherlv_22, grammarAccess.getGapJointTransmissionAccess().getT0Keyword_22());
            		
            // InternalKinematics.g:4005:3: ( (lv_t0_23_0= ruleDouble0 ) )
            // InternalKinematics.g:4006:4: (lv_t0_23_0= ruleDouble0 )
            {
            // InternalKinematics.g:4006:4: (lv_t0_23_0= ruleDouble0 )
            // InternalKinematics.g:4007:5: lv_t0_23_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getT0Double0ParserRuleCall_23_0());
            				
            pushFollow(FOLLOW_126);
            lv_t0_23_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGapJointTransmissionRule());
            					}
            					set(
            						current,
            						"t0",
            						lv_t0_23_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_24=(Token)match(input,124,FOLLOW_46); 

            			newLeafNode(otherlv_24, grammarAccess.getGapJointTransmissionAccess().getTheta0Keyword_24());
            		
            // InternalKinematics.g:4028:3: ( (lv_theta0_25_0= ruleDouble0 ) )
            // InternalKinematics.g:4029:4: (lv_theta0_25_0= ruleDouble0 )
            {
            // InternalKinematics.g:4029:4: (lv_theta0_25_0= ruleDouble0 )
            // InternalKinematics.g:4030:5: lv_theta0_25_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getGapJointTransmissionAccess().getTheta0Double0ParserRuleCall_25_0());
            				
            pushFollow(FOLLOW_16);
            lv_theta0_25_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGapJointTransmissionRule());
            					}
            					set(
            						current,
            						"theta0",
            						lv_theta0_25_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
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
    // InternalKinematics.g:4055:1: entryRulePassiveJointTransmission returns [EObject current=null] : iv_rulePassiveJointTransmission= rulePassiveJointTransmission EOF ;
    public final EObject entryRulePassiveJointTransmission() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePassiveJointTransmission = null;


        try {
            // InternalKinematics.g:4055:65: (iv_rulePassiveJointTransmission= rulePassiveJointTransmission EOF )
            // InternalKinematics.g:4056:2: iv_rulePassiveJointTransmission= rulePassiveJointTransmission EOF
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
    // InternalKinematics.g:4062:1: rulePassiveJointTransmission returns [EObject current=null] : (otherlv_0= 'PassiveJointTransmission' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject rulePassiveJointTransmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:4068:2: ( (otherlv_0= 'PassiveJointTransmission' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // InternalKinematics.g:4069:2: (otherlv_0= 'PassiveJointTransmission' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // InternalKinematics.g:4069:2: (otherlv_0= 'PassiveJointTransmission' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '}' )
            // InternalKinematics.g:4070:3: otherlv_0= 'PassiveJointTransmission' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,125,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPassiveJointTransmissionAccess().getPassiveJointTransmissionKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPassiveJointTransmissionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPassiveJointTransmissionAccess().getNameKeyword_2());
            		
            // InternalKinematics.g:4082:3: ( (lv_name_3_0= ruleEString ) )
            // InternalKinematics.g:4083:4: (lv_name_3_0= ruleEString )
            {
            // InternalKinematics.g:4083:4: (lv_name_3_0= ruleEString )
            // InternalKinematics.g:4084:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPassiveJointTransmissionAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPassiveJointTransmissionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
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
    // InternalKinematics.g:4109:1: entryRuleUseSimulatedGripperJointType returns [EObject current=null] : iv_ruleUseSimulatedGripperJointType= ruleUseSimulatedGripperJointType EOF ;
    public final EObject entryRuleUseSimulatedGripperJointType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseSimulatedGripperJointType = null;


        try {
            // InternalKinematics.g:4109:69: (iv_ruleUseSimulatedGripperJointType= ruleUseSimulatedGripperJointType EOF )
            // InternalKinematics.g:4110:2: iv_ruleUseSimulatedGripperJointType= ruleUseSimulatedGripperJointType EOF
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
    // InternalKinematics.g:4116:1: ruleUseSimulatedGripperJointType returns [EObject current=null] : ( () otherlv_1= 'UseSimulatedGripperJointType' ) ;
    public final EObject ruleUseSimulatedGripperJointType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKinematics.g:4122:2: ( ( () otherlv_1= 'UseSimulatedGripperJointType' ) )
            // InternalKinematics.g:4123:2: ( () otherlv_1= 'UseSimulatedGripperJointType' )
            {
            // InternalKinematics.g:4123:2: ( () otherlv_1= 'UseSimulatedGripperJointType' )
            // InternalKinematics.g:4124:3: () otherlv_1= 'UseSimulatedGripperJointType'
            {
            // InternalKinematics.g:4124:3: ()
            // InternalKinematics.g:4125:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUseSimulatedGripperJointTypeAccess().getUseSimulatedGripperJointTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,126,FOLLOW_2); 

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
    // InternalKinematics.g:4139:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // InternalKinematics.g:4139:45: (iv_ruleName= ruleName EOF )
            // InternalKinematics.g:4140:2: iv_ruleName= ruleName EOF
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
    // InternalKinematics.g:4146:1: ruleName returns [EObject current=null] : ( () otherlv_1= 'Name' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:4152:2: ( ( () otherlv_1= 'Name' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalKinematics.g:4153:2: ( () otherlv_1= 'Name' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalKinematics.g:4153:2: ( () otherlv_1= 'Name' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalKinematics.g:4154:3: () otherlv_1= 'Name' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalKinematics.g:4154:3: ()
            // InternalKinematics.g:4155:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNameAccess().getNameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,127,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNameAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_127); 

            			newLeafNode(otherlv_2, grammarAccess.getNameAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKinematics.g:4169:3: (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==17) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalKinematics.g:4170:4: otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getNameAccess().getNameKeyword_3_0());
                    			
                    // InternalKinematics.g:4174:4: ( (lv_name_4_0= ruleEString ) )
                    // InternalKinematics.g:4175:5: (lv_name_4_0= ruleEString )
                    {
                    // InternalKinematics.g:4175:5: (lv_name_4_0= ruleEString )
                    // InternalKinematics.g:4176:6: lv_name_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getNameAccess().getNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_name_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNameRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.EString");
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
    // InternalKinematics.g:4202:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalKinematics.g:4202:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalKinematics.g:4203:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalKinematics.g:4209:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalKinematics.g:4215:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalKinematics.g:4216:2: this_DOUBLE_0= RULE_DOUBLE
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001EC0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001E80000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001A00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000FC0200000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000F80200000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000F00200000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000E00200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000C00200000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000E004200000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000E000200000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000C000200000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000060000200000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000040000200000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x001FE00000600000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x001FC00000600000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x001F800000600000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x001F000000600000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x001E000000600000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x001C000000600000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0018000000600000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0010000000600000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x00C0000000200000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x1C00000000200000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x1800000000200000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x1000000000200000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0xC000000000200000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x8000000000200000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000200000L,0x000000000000001EL});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000200000L,0x000000000000001CL});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000018L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000010L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000300L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000200L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000200000L,0x0000000000001800L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000200000L,0x0000000000001000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000008200000L,0x000000000000C000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000200000L,0x000000000000C000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000200000L,0x0000000000008000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000008000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000008020000L,0x0000000000020000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000200000L,0x0000000000080000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000200000L,0x0000000000200000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000200000L,0x000000001F800000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000200000L,0x000000001F000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000200000L,0x000000001E000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000200000L,0x000000001C000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000200000L,0x0000000018000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000200000L,0x0000000010000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000200000L,0x00000003C0000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000200000L,0x0000000380000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000200000L,0x0000000300000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000200000L,0x0000000200000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000060000220000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000200000L,0x0000001000000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000200000L,0x0000080000000000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000200000L,0x0000400000000000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000200000L,0x0000040000000000L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000000220000L});

}