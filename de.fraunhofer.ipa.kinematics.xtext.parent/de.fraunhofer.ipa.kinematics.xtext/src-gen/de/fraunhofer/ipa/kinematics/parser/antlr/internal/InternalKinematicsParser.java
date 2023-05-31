package de.fraunhofer.ipa.kinematics.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Parameters", "Xacrorobot", "Collision", "Cylinder", "Filename", "Geometry", "Inertial", "Velocity", "Inertia", "Default", "Effort", "Length", "Macros", "Origin", "Parent", "Radius", "Sphere", "Visual", "AnyURI", "Child", "Joint", "Limit", "Lower", "Scale", "Upper", "Axis", "Link", "Mass", "Mesh", "Name", "Type", "Value", "Box", "Ixx", "Ixy", "Ixz", "Iyy", "Iyz", "Izz", "Rpy", "Size", "Xyz", "HyphenMinus", "DigitZero", "DigitOne", "DigitTwo", "Colon", "RULE_DIGIT", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_JOINTTYPE", "RULE_BEGIN", "RULE_END", "RULE_SL_COMMENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Origin=17;
    public static final int DigitTwo=49;
    public static final int Lower=26;
    public static final int RULE_BEGIN=56;
    public static final int Size=44;
    public static final int Effort=14;
    public static final int Ixx=37;
    public static final int RULE_BOOLEAN=52;
    public static final int Ixz=39;
    public static final int Ixy=38;
    public static final int Name=33;
    public static final int Sphere=20;
    public static final int Child=23;
    public static final int Parameters=4;
    public static final int RULE_ID=59;
    public static final int Iyy=40;
    public static final int Filename=8;
    public static final int Mesh=32;
    public static final int RULE_DIGIT=51;
    public static final int Box=36;
    public static final int Iyz=41;
    public static final int Joint=24;
    public static final int Macros=16;
    public static final int Mass=31;
    public static final int AnyURI=22;
    public static final int DigitZero=47;
    public static final int RULE_INT=60;
    public static final int Value=35;
    public static final int RULE_ML_COMMENT=62;
    public static final int Inertia=12;
    public static final int Link=30;
    public static final int Xacrorobot=5;
    public static final int Radius=19;
    public static final int RULE_END=57;
    public static final int Parent=18;
    public static final int Izz=42;
    public static final int RULE_STRING=61;
    public static final int RULE_SL_COMMENT=58;
    public static final int HyphenMinus=46;
    public static final int RULE_DOUBLE=54;
    public static final int Rpy=43;
    public static final int RULE_JOINTTYPE=55;
    public static final int Colon=50;
    public static final int RULE_DECINT=53;
    public static final int EOF=-1;
    public static final int Visual=21;
    public static final int Axis=29;
    public static final int Upper=28;
    public static final int RULE_WS=63;
    public static final int Collision=6;
    public static final int DigitOne=48;
    public static final int Scale=27;
    public static final int Inertial=10;
    public static final int RULE_ANY_OTHER=64;
    public static final int Velocity=11;
    public static final int Default=13;
    public static final int Geometry=9;
    public static final int Cylinder=7;
    public static final int Type=34;
    public static final int Length=15;
    public static final int Xyz=45;
    public static final int Limit=25;

    // delegates
    // delegators


        public InternalKinematicsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKinematicsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKinematicsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKinematicsParser.g"; }



     	private KinematicsGrammarAccess grammarAccess;

        public InternalKinematicsParser(TokenStream input, KinematicsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Robot";
       	}

       	@Override
       	protected KinematicsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRobot"
    // InternalKinematicsParser.g:58:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalKinematicsParser.g:58:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalKinematicsParser.g:59:2: iv_ruleRobot= ruleRobot EOF
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
    // InternalKinematicsParser.g:65:1: ruleRobot returns [EObject current=null] : ( () otherlv_1= Xacrorobot this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Macros ( (lv_macros_6_0= ruleMacro ) )* )? this_END_7= RULE_END ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_END_7=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_macros_6_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:71:2: ( ( () otherlv_1= Xacrorobot this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Macros ( (lv_macros_6_0= ruleMacro ) )* )? this_END_7= RULE_END ) )
            // InternalKinematicsParser.g:72:2: ( () otherlv_1= Xacrorobot this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Macros ( (lv_macros_6_0= ruleMacro ) )* )? this_END_7= RULE_END )
            {
            // InternalKinematicsParser.g:72:2: ( () otherlv_1= Xacrorobot this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Macros ( (lv_macros_6_0= ruleMacro ) )* )? this_END_7= RULE_END )
            // InternalKinematicsParser.g:73:3: () otherlv_1= Xacrorobot this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Macros ( (lv_macros_6_0= ruleMacro ) )* )? this_END_7= RULE_END
            {
            // InternalKinematicsParser.g:73:3: ()
            // InternalKinematicsParser.g:74:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRobotAccess().getXacroRobotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Xacrorobot,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotAccess().getXacrorobotKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_4); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getRobotAccess().getBEGINTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,Name,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRobotAccess().getNameKeyword_3());
            		
            // InternalKinematicsParser.g:92:3: ( (lv_name_4_0= ruleEString ) )
            // InternalKinematicsParser.g:93:4: (lv_name_4_0= ruleEString )
            {
            // InternalKinematicsParser.g:93:4: (lv_name_4_0= ruleEString )
            // InternalKinematicsParser.g:94:5: lv_name_4_0= ruleEString
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
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKinematicsParser.g:111:3: (otherlv_5= Macros ( (lv_macros_6_0= ruleMacro ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Macros) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKinematicsParser.g:112:4: otherlv_5= Macros ( (lv_macros_6_0= ruleMacro ) )*
                    {
                    otherlv_5=(Token)match(input,Macros,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getRobotAccess().getMacrosKeyword_5_0());
                    			
                    // InternalKinematicsParser.g:116:4: ( (lv_macros_6_0= ruleMacro ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==HyphenMinus) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalKinematicsParser.g:117:5: (lv_macros_6_0= ruleMacro )
                    	    {
                    	    // InternalKinematicsParser.g:117:5: (lv_macros_6_0= ruleMacro )
                    	    // InternalKinematicsParser.g:118:6: lv_macros_6_0= ruleMacro
                    	    {

                    	    						newCompositeNode(grammarAccess.getRobotAccess().getMacrosMacroParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_macros_6_0=ruleMacro();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"macros",
                    	    							lv_macros_6_0,
                    	    							"de.fraunhofer.ipa.kinematics.Kinematics.Macro");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            this_END_7=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_7, grammarAccess.getRobotAccess().getENDTerminalRuleCall_6());
            		

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


    // $ANTLR start "entryRuleMacro"
    // InternalKinematicsParser.g:144:1: entryRuleMacro returns [EObject current=null] : iv_ruleMacro= ruleMacro EOF ;
    public final EObject entryRuleMacro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacro = null;


        try {
            // InternalKinematicsParser.g:144:46: (iv_ruleMacro= ruleMacro EOF )
            // InternalKinematicsParser.g:145:2: iv_ruleMacro= ruleMacro EOF
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
    // InternalKinematicsParser.g:151:1: ruleMacro returns [EObject current=null] : (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN (otherlv_4= Parameters ( (lv_parameters_5_0= ruleParameter ) )* )? (otherlv_6= Link ( (lv_link_7_0= ruleLink ) )* )? (otherlv_8= Joint ( (lv_joint_9_0= ruleJoint ) )* )? this_END_10= RULE_END ) ;
    public final EObject ruleMacro() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_END_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_link_7_0 = null;

        EObject lv_joint_9_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:157:2: ( (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN (otherlv_4= Parameters ( (lv_parameters_5_0= ruleParameter ) )* )? (otherlv_6= Link ( (lv_link_7_0= ruleLink ) )* )? (otherlv_8= Joint ( (lv_joint_9_0= ruleJoint ) )* )? this_END_10= RULE_END ) )
            // InternalKinematicsParser.g:158:2: (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN (otherlv_4= Parameters ( (lv_parameters_5_0= ruleParameter ) )* )? (otherlv_6= Link ( (lv_link_7_0= ruleLink ) )* )? (otherlv_8= Joint ( (lv_joint_9_0= ruleJoint ) )* )? this_END_10= RULE_END )
            {
            // InternalKinematicsParser.g:158:2: (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN (otherlv_4= Parameters ( (lv_parameters_5_0= ruleParameter ) )* )? (otherlv_6= Link ( (lv_link_7_0= ruleLink ) )* )? (otherlv_8= Joint ( (lv_joint_9_0= ruleJoint ) )* )? this_END_10= RULE_END )
            // InternalKinematicsParser.g:159:3: otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN (otherlv_4= Parameters ( (lv_parameters_5_0= ruleParameter ) )* )? (otherlv_6= Link ( (lv_link_7_0= ruleLink ) )* )? (otherlv_8= Joint ( (lv_joint_9_0= ruleJoint ) )* )? this_END_10= RULE_END
            {
            otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMacroAccess().getHyphenMinusKeyword_0());
            		
            otherlv_1=(Token)match(input,Name,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMacroAccess().getNameKeyword_1());
            		
            // InternalKinematicsParser.g:167:3: ( (lv_name_2_0= ruleEString ) )
            // InternalKinematicsParser.g:168:4: (lv_name_2_0= ruleEString )
            {
            // InternalKinematicsParser.g:168:4: (lv_name_2_0= ruleEString )
            // InternalKinematicsParser.g:169:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMacroAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMacroRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_8); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getMacroAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalKinematicsParser.g:190:3: (otherlv_4= Parameters ( (lv_parameters_5_0= ruleParameter ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Parameters) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalKinematicsParser.g:191:4: otherlv_4= Parameters ( (lv_parameters_5_0= ruleParameter ) )*
                    {
                    otherlv_4=(Token)match(input,Parameters,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getMacroAccess().getParametersKeyword_4_0());
                    			
                    // InternalKinematicsParser.g:195:4: ( (lv_parameters_5_0= ruleParameter ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==HyphenMinus) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalKinematicsParser.g:196:5: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalKinematicsParser.g:196:5: (lv_parameters_5_0= ruleParameter )
                    	    // InternalKinematicsParser.g:197:6: lv_parameters_5_0= ruleParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getMacroAccess().getParametersParameterParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMacroRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parameters",
                    	    							lv_parameters_5_0,
                    	    							"de.fraunhofer.ipa.kinematics.Kinematics.Parameter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalKinematicsParser.g:215:3: (otherlv_6= Link ( (lv_link_7_0= ruleLink ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Link) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKinematicsParser.g:216:4: otherlv_6= Link ( (lv_link_7_0= ruleLink ) )*
                    {
                    otherlv_6=(Token)match(input,Link,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getMacroAccess().getLinkKeyword_5_0());
                    			
                    // InternalKinematicsParser.g:220:4: ( (lv_link_7_0= ruleLink ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==HyphenMinus) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalKinematicsParser.g:221:5: (lv_link_7_0= ruleLink )
                    	    {
                    	    // InternalKinematicsParser.g:221:5: (lv_link_7_0= ruleLink )
                    	    // InternalKinematicsParser.g:222:6: lv_link_7_0= ruleLink
                    	    {

                    	    						newCompositeNode(grammarAccess.getMacroAccess().getLinkLinkParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_link_7_0=ruleLink();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMacroRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"link",
                    	    							lv_link_7_0,
                    	    							"de.fraunhofer.ipa.kinematics.Kinematics.Link");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalKinematicsParser.g:240:3: (otherlv_8= Joint ( (lv_joint_9_0= ruleJoint ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Joint) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalKinematicsParser.g:241:4: otherlv_8= Joint ( (lv_joint_9_0= ruleJoint ) )*
                    {
                    otherlv_8=(Token)match(input,Joint,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getMacroAccess().getJointKeyword_6_0());
                    			
                    // InternalKinematicsParser.g:245:4: ( (lv_joint_9_0= ruleJoint ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==HyphenMinus) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalKinematicsParser.g:246:5: (lv_joint_9_0= ruleJoint )
                    	    {
                    	    // InternalKinematicsParser.g:246:5: (lv_joint_9_0= ruleJoint )
                    	    // InternalKinematicsParser.g:247:6: lv_joint_9_0= ruleJoint
                    	    {

                    	    						newCompositeNode(grammarAccess.getMacroAccess().getJointJointParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_joint_9_0=ruleJoint();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMacroRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"joint",
                    	    							lv_joint_9_0,
                    	    							"de.fraunhofer.ipa.kinematics.Kinematics.Joint");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            this_END_10=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_10, grammarAccess.getMacroAccess().getENDTerminalRuleCall_7());
            		

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
    // InternalKinematicsParser.g:273:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalKinematicsParser.g:273:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalKinematicsParser.g:274:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalKinematicsParser.g:280:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= HyphenMinus otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_BEGIN_4= RULE_BEGIN otherlv_5= Type ( (lv_type_6_0= ruleParameterType ) ) (otherlv_7= Default ( (lv_default_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= ruleEString ) ) )? this_END_11= RULE_END ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_BEGIN_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token this_END_11=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        Enumerator lv_type_6_0 = null;

        AntlrDatatypeRuleToken lv_default_8_0 = null;

        AntlrDatatypeRuleToken lv_value_10_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:286:2: ( ( () otherlv_1= HyphenMinus otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_BEGIN_4= RULE_BEGIN otherlv_5= Type ( (lv_type_6_0= ruleParameterType ) ) (otherlv_7= Default ( (lv_default_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= ruleEString ) ) )? this_END_11= RULE_END ) )
            // InternalKinematicsParser.g:287:2: ( () otherlv_1= HyphenMinus otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_BEGIN_4= RULE_BEGIN otherlv_5= Type ( (lv_type_6_0= ruleParameterType ) ) (otherlv_7= Default ( (lv_default_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= ruleEString ) ) )? this_END_11= RULE_END )
            {
            // InternalKinematicsParser.g:287:2: ( () otherlv_1= HyphenMinus otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_BEGIN_4= RULE_BEGIN otherlv_5= Type ( (lv_type_6_0= ruleParameterType ) ) (otherlv_7= Default ( (lv_default_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= ruleEString ) ) )? this_END_11= RULE_END )
            // InternalKinematicsParser.g:288:3: () otherlv_1= HyphenMinus otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_BEGIN_4= RULE_BEGIN otherlv_5= Type ( (lv_type_6_0= ruleParameterType ) ) (otherlv_7= Default ( (lv_default_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= ruleEString ) ) )? this_END_11= RULE_END
            {
            // InternalKinematicsParser.g:288:3: ()
            // InternalKinematicsParser.g:289:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,HyphenMinus,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getHyphenMinusKeyword_1());
            		
            otherlv_2=(Token)match(input,Name,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getNameKeyword_2());
            		
            // InternalKinematicsParser.g:303:3: ( (lv_name_3_0= ruleEString ) )
            // InternalKinematicsParser.g:304:4: (lv_name_3_0= ruleEString )
            {
            // InternalKinematicsParser.g:304:4: (lv_name_3_0= ruleEString )
            // InternalKinematicsParser.g:305:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_11); 

            			newLeafNode(this_BEGIN_4, grammarAccess.getParameterAccess().getBEGINTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,Type,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getTypeKeyword_5());
            		
            // InternalKinematicsParser.g:330:3: ( (lv_type_6_0= ruleParameterType ) )
            // InternalKinematicsParser.g:331:4: (lv_type_6_0= ruleParameterType )
            {
            // InternalKinematicsParser.g:331:4: (lv_type_6_0= ruleParameterType )
            // InternalKinematicsParser.g:332:5: lv_type_6_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeParameterTypeEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_13);
            lv_type_6_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_6_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKinematicsParser.g:349:3: (otherlv_7= Default ( (lv_default_8_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Default) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKinematicsParser.g:350:4: otherlv_7= Default ( (lv_default_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Default,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getParameterAccess().getDefaultKeyword_7_0());
                    			
                    // InternalKinematicsParser.g:354:4: ( (lv_default_8_0= ruleEString ) )
                    // InternalKinematicsParser.g:355:5: (lv_default_8_0= ruleEString )
                    {
                    // InternalKinematicsParser.g:355:5: (lv_default_8_0= ruleEString )
                    // InternalKinematicsParser.g:356:6: lv_default_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getDefaultEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_default_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_8_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:374:3: (otherlv_9= Value ( (lv_value_10_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Value) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalKinematicsParser.g:375:4: otherlv_9= Value ( (lv_value_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getParameterAccess().getValueKeyword_8_0());
                    			
                    // InternalKinematicsParser.g:379:4: ( (lv_value_10_0= ruleEString ) )
                    // InternalKinematicsParser.g:380:5: (lv_value_10_0= ruleEString )
                    {
                    // InternalKinematicsParser.g:380:5: (lv_value_10_0= ruleEString )
                    // InternalKinematicsParser.g:381:6: lv_value_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getValueEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_value_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_10_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_11=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_11, grammarAccess.getParameterAccess().getENDTerminalRuleCall_9());
            		

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


    // $ANTLR start "entryRuleJoint"
    // InternalKinematicsParser.g:407:1: entryRuleJoint returns [EObject current=null] : iv_ruleJoint= ruleJoint EOF ;
    public final EObject entryRuleJoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoint = null;


        try {
            // InternalKinematicsParser.g:407:46: (iv_ruleJoint= ruleJoint EOF )
            // InternalKinematicsParser.g:408:2: iv_ruleJoint= ruleJoint EOF
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
    // InternalKinematicsParser.g:414:1: ruleJoint returns [EObject current=null] : (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( (lv_type_5_0= RULE_JOINTTYPE ) ) otherlv_6= Parent ( (otherlv_7= RULE_ID ) ) otherlv_8= Child ( (otherlv_9= RULE_ID ) ) otherlv_10= Origin ( (lv_origin_11_0= rulePose ) ) (otherlv_12= Axis ( (lv_axis_13_0= ruleVector3 ) ) )? (otherlv_14= Limit ( (lv_limit_15_0= ruleLimit ) ) )? this_END_16= RULE_END ) ;
    public final EObject ruleJoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token this_END_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_origin_11_0 = null;

        EObject lv_axis_13_0 = null;

        EObject lv_limit_15_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:420:2: ( (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( (lv_type_5_0= RULE_JOINTTYPE ) ) otherlv_6= Parent ( (otherlv_7= RULE_ID ) ) otherlv_8= Child ( (otherlv_9= RULE_ID ) ) otherlv_10= Origin ( (lv_origin_11_0= rulePose ) ) (otherlv_12= Axis ( (lv_axis_13_0= ruleVector3 ) ) )? (otherlv_14= Limit ( (lv_limit_15_0= ruleLimit ) ) )? this_END_16= RULE_END ) )
            // InternalKinematicsParser.g:421:2: (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( (lv_type_5_0= RULE_JOINTTYPE ) ) otherlv_6= Parent ( (otherlv_7= RULE_ID ) ) otherlv_8= Child ( (otherlv_9= RULE_ID ) ) otherlv_10= Origin ( (lv_origin_11_0= rulePose ) ) (otherlv_12= Axis ( (lv_axis_13_0= ruleVector3 ) ) )? (otherlv_14= Limit ( (lv_limit_15_0= ruleLimit ) ) )? this_END_16= RULE_END )
            {
            // InternalKinematicsParser.g:421:2: (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( (lv_type_5_0= RULE_JOINTTYPE ) ) otherlv_6= Parent ( (otherlv_7= RULE_ID ) ) otherlv_8= Child ( (otherlv_9= RULE_ID ) ) otherlv_10= Origin ( (lv_origin_11_0= rulePose ) ) (otherlv_12= Axis ( (lv_axis_13_0= ruleVector3 ) ) )? (otherlv_14= Limit ( (lv_limit_15_0= ruleLimit ) ) )? this_END_16= RULE_END )
            // InternalKinematicsParser.g:422:3: otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( (lv_type_5_0= RULE_JOINTTYPE ) ) otherlv_6= Parent ( (otherlv_7= RULE_ID ) ) otherlv_8= Child ( (otherlv_9= RULE_ID ) ) otherlv_10= Origin ( (lv_origin_11_0= rulePose ) ) (otherlv_12= Axis ( (lv_axis_13_0= ruleVector3 ) ) )? (otherlv_14= Limit ( (lv_limit_15_0= ruleLimit ) ) )? this_END_16= RULE_END
            {
            otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getJointAccess().getHyphenMinusKeyword_0());
            		
            otherlv_1=(Token)match(input,Name,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getJointAccess().getNameKeyword_1());
            		
            // InternalKinematicsParser.g:430:3: ( (lv_name_2_0= ruleEString ) )
            // InternalKinematicsParser.g:431:4: (lv_name_2_0= ruleEString )
            {
            // InternalKinematicsParser.g:431:4: (lv_name_2_0= ruleEString )
            // InternalKinematicsParser.g:432:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJointAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_11); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getJointAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Type,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getJointAccess().getTypeKeyword_4());
            		
            // InternalKinematicsParser.g:457:3: ( (lv_type_5_0= RULE_JOINTTYPE ) )
            // InternalKinematicsParser.g:458:4: (lv_type_5_0= RULE_JOINTTYPE )
            {
            // InternalKinematicsParser.g:458:4: (lv_type_5_0= RULE_JOINTTYPE )
            // InternalKinematicsParser.g:459:5: lv_type_5_0= RULE_JOINTTYPE
            {
            lv_type_5_0=(Token)match(input,RULE_JOINTTYPE,FOLLOW_17); 

            					newLeafNode(lv_type_5_0, grammarAccess.getJointAccess().getTypeJOINTTYPETerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_5_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.JOINTTYPE");
            				

            }


            }

            otherlv_6=(Token)match(input,Parent,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getJointAccess().getParentKeyword_6());
            		
            // InternalKinematicsParser.g:479:3: ( (otherlv_7= RULE_ID ) )
            // InternalKinematicsParser.g:480:4: (otherlv_7= RULE_ID )
            {
            // InternalKinematicsParser.g:480:4: (otherlv_7= RULE_ID )
            // InternalKinematicsParser.g:481:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_7, grammarAccess.getJointAccess().getParentLinkCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,Child,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getJointAccess().getChildKeyword_8());
            		
            // InternalKinematicsParser.g:496:3: ( (otherlv_9= RULE_ID ) )
            // InternalKinematicsParser.g:497:4: (otherlv_9= RULE_ID )
            {
            // InternalKinematicsParser.g:497:4: (otherlv_9= RULE_ID )
            // InternalKinematicsParser.g:498:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_9, grammarAccess.getJointAccess().getChildLinkCrossReference_9_0());
            				

            }


            }

            otherlv_10=(Token)match(input,Origin,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getJointAccess().getOriginKeyword_10());
            		
            // InternalKinematicsParser.g:513:3: ( (lv_origin_11_0= rulePose ) )
            // InternalKinematicsParser.g:514:4: (lv_origin_11_0= rulePose )
            {
            // InternalKinematicsParser.g:514:4: (lv_origin_11_0= rulePose )
            // InternalKinematicsParser.g:515:5: lv_origin_11_0= rulePose
            {

            					newCompositeNode(grammarAccess.getJointAccess().getOriginPoseParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_21);
            lv_origin_11_0=rulePose();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"origin",
            						lv_origin_11_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Pose");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKinematicsParser.g:532:3: (otherlv_12= Axis ( (lv_axis_13_0= ruleVector3 ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Axis) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKinematicsParser.g:533:4: otherlv_12= Axis ( (lv_axis_13_0= ruleVector3 ) )
                    {
                    otherlv_12=(Token)match(input,Axis,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getJointAccess().getAxisKeyword_12_0());
                    			
                    // InternalKinematicsParser.g:537:4: ( (lv_axis_13_0= ruleVector3 ) )
                    // InternalKinematicsParser.g:538:5: (lv_axis_13_0= ruleVector3 )
                    {
                    // InternalKinematicsParser.g:538:5: (lv_axis_13_0= ruleVector3 )
                    // InternalKinematicsParser.g:539:6: lv_axis_13_0= ruleVector3
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getAxisVector3ParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_axis_13_0=ruleVector3();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"axis",
                    							lv_axis_13_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Vector3");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:557:3: (otherlv_14= Limit ( (lv_limit_15_0= ruleLimit ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Limit) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKinematicsParser.g:558:4: otherlv_14= Limit ( (lv_limit_15_0= ruleLimit ) )
                    {
                    otherlv_14=(Token)match(input,Limit,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getJointAccess().getLimitKeyword_13_0());
                    			
                    // InternalKinematicsParser.g:562:4: ( (lv_limit_15_0= ruleLimit ) )
                    // InternalKinematicsParser.g:563:5: (lv_limit_15_0= ruleLimit )
                    {
                    // InternalKinematicsParser.g:563:5: (lv_limit_15_0= ruleLimit )
                    // InternalKinematicsParser.g:564:6: lv_limit_15_0= ruleLimit
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_limit_15_0=ruleLimit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"limit",
                    							lv_limit_15_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Limit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_16=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_16, grammarAccess.getJointAccess().getENDTerminalRuleCall_14());
            		

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
    // InternalKinematicsParser.g:590:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalKinematicsParser.g:590:45: (iv_ruleLink= ruleLink EOF )
            // InternalKinematicsParser.g:591:2: iv_ruleLink= ruleLink EOF
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
    // InternalKinematicsParser.g:597:1: ruleLink returns [EObject current=null] : (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Inertial ( (lv_inertial_6_0= ruleInertial ) ) )? (otherlv_7= Visual ( (lv_visual_8_0= ruleVisual ) ) )? (otherlv_9= Collision ( (lv_collision_10_0= ruleCollision ) ) )? this_END_11= RULE_END )? ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token this_END_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_inertial_6_0 = null;

        EObject lv_visual_8_0 = null;

        EObject lv_collision_10_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:603:2: ( (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Inertial ( (lv_inertial_6_0= ruleInertial ) ) )? (otherlv_7= Visual ( (lv_visual_8_0= ruleVisual ) ) )? (otherlv_9= Collision ( (lv_collision_10_0= ruleCollision ) ) )? this_END_11= RULE_END )? ) )
            // InternalKinematicsParser.g:604:2: (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Inertial ( (lv_inertial_6_0= ruleInertial ) ) )? (otherlv_7= Visual ( (lv_visual_8_0= ruleVisual ) ) )? (otherlv_9= Collision ( (lv_collision_10_0= ruleCollision ) ) )? this_END_11= RULE_END )? )
            {
            // InternalKinematicsParser.g:604:2: (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Inertial ( (lv_inertial_6_0= ruleInertial ) ) )? (otherlv_7= Visual ( (lv_visual_8_0= ruleVisual ) ) )? (otherlv_9= Collision ( (lv_collision_10_0= ruleCollision ) ) )? this_END_11= RULE_END )? )
            // InternalKinematicsParser.g:605:3: otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Inertial ( (lv_inertial_6_0= ruleInertial ) ) )? (otherlv_7= Visual ( (lv_visual_8_0= ruleVisual ) ) )? (otherlv_9= Collision ( (lv_collision_10_0= ruleCollision ) ) )? this_END_11= RULE_END )?
            {
            otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getHyphenMinusKeyword_0());
            		
            otherlv_1=(Token)match(input,Name,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getNameKeyword_1());
            		
            // InternalKinematicsParser.g:613:3: ( (lv_name_2_0= ruleEString ) )
            // InternalKinematicsParser.g:614:4: (lv_name_2_0= ruleEString )
            {
            // InternalKinematicsParser.g:614:4: (lv_name_2_0= ruleEString )
            // InternalKinematicsParser.g:615:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKinematicsParser.g:632:3: (otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Inertial ( (lv_inertial_6_0= ruleInertial ) ) )? (otherlv_7= Visual ( (lv_visual_8_0= ruleVisual ) ) )? (otherlv_9= Collision ( (lv_collision_10_0= ruleCollision ) ) )? this_END_11= RULE_END )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Colon) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalKinematicsParser.g:633:4: otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Inertial ( (lv_inertial_6_0= ruleInertial ) ) )? (otherlv_7= Visual ( (lv_visual_8_0= ruleVisual ) ) )? (otherlv_9= Collision ( (lv_collision_10_0= ruleCollision ) ) )? this_END_11= RULE_END
                    {
                    otherlv_3=(Token)match(input,Colon,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getColonKeyword_3_0());
                    			
                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_24); 

                    				newLeafNode(this_BEGIN_4, grammarAccess.getLinkAccess().getBEGINTerminalRuleCall_3_1());
                    			
                    // InternalKinematicsParser.g:641:4: (otherlv_5= Inertial ( (lv_inertial_6_0= ruleInertial ) ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==Inertial) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalKinematicsParser.g:642:5: otherlv_5= Inertial ( (lv_inertial_6_0= ruleInertial ) )
                            {
                            otherlv_5=(Token)match(input,Inertial,FOLLOW_3); 

                            					newLeafNode(otherlv_5, grammarAccess.getLinkAccess().getInertialKeyword_3_2_0());
                            				
                            // InternalKinematicsParser.g:646:5: ( (lv_inertial_6_0= ruleInertial ) )
                            // InternalKinematicsParser.g:647:6: (lv_inertial_6_0= ruleInertial )
                            {
                            // InternalKinematicsParser.g:647:6: (lv_inertial_6_0= ruleInertial )
                            // InternalKinematicsParser.g:648:7: lv_inertial_6_0= ruleInertial
                            {

                            							newCompositeNode(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_3_2_1_0());
                            						
                            pushFollow(FOLLOW_25);
                            lv_inertial_6_0=ruleInertial();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getLinkRule());
                            							}
                            							set(
                            								current,
                            								"inertial",
                            								lv_inertial_6_0,
                            								"de.fraunhofer.ipa.kinematics.Kinematics.Inertial");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalKinematicsParser.g:666:4: (otherlv_7= Visual ( (lv_visual_8_0= ruleVisual ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==Visual) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalKinematicsParser.g:667:5: otherlv_7= Visual ( (lv_visual_8_0= ruleVisual ) )
                            {
                            otherlv_7=(Token)match(input,Visual,FOLLOW_3); 

                            					newLeafNode(otherlv_7, grammarAccess.getLinkAccess().getVisualKeyword_3_3_0());
                            				
                            // InternalKinematicsParser.g:671:5: ( (lv_visual_8_0= ruleVisual ) )
                            // InternalKinematicsParser.g:672:6: (lv_visual_8_0= ruleVisual )
                            {
                            // InternalKinematicsParser.g:672:6: (lv_visual_8_0= ruleVisual )
                            // InternalKinematicsParser.g:673:7: lv_visual_8_0= ruleVisual
                            {

                            							newCompositeNode(grammarAccess.getLinkAccess().getVisualVisualParserRuleCall_3_3_1_0());
                            						
                            pushFollow(FOLLOW_26);
                            lv_visual_8_0=ruleVisual();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getLinkRule());
                            							}
                            							set(
                            								current,
                            								"visual",
                            								lv_visual_8_0,
                            								"de.fraunhofer.ipa.kinematics.Kinematics.Visual");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalKinematicsParser.g:691:4: (otherlv_9= Collision ( (lv_collision_10_0= ruleCollision ) ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==Collision) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalKinematicsParser.g:692:5: otherlv_9= Collision ( (lv_collision_10_0= ruleCollision ) )
                            {
                            otherlv_9=(Token)match(input,Collision,FOLLOW_3); 

                            					newLeafNode(otherlv_9, grammarAccess.getLinkAccess().getCollisionKeyword_3_4_0());
                            				
                            // InternalKinematicsParser.g:696:5: ( (lv_collision_10_0= ruleCollision ) )
                            // InternalKinematicsParser.g:697:6: (lv_collision_10_0= ruleCollision )
                            {
                            // InternalKinematicsParser.g:697:6: (lv_collision_10_0= ruleCollision )
                            // InternalKinematicsParser.g:698:7: lv_collision_10_0= ruleCollision
                            {

                            							newCompositeNode(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_3_4_1_0());
                            						
                            pushFollow(FOLLOW_15);
                            lv_collision_10_0=ruleCollision();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getLinkRule());
                            							}
                            							set(
                            								current,
                            								"collision",
                            								lv_collision_10_0,
                            								"de.fraunhofer.ipa.kinematics.Kinematics.Collision");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    this_END_11=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_11, grammarAccess.getLinkAccess().getENDTerminalRuleCall_3_5());
                    			

                    }
                    break;

            }


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


    // $ANTLR start "entryRulePose"
    // InternalKinematicsParser.g:725:1: entryRulePose returns [EObject current=null] : iv_rulePose= rulePose EOF ;
    public final EObject entryRulePose() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePose = null;


        try {
            // InternalKinematicsParser.g:725:45: (iv_rulePose= rulePose EOF )
            // InternalKinematicsParser.g:726:2: iv_rulePose= rulePose EOF
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
    // InternalKinematicsParser.g:732:1: rulePose returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Rpy ( (lv_rpy_3_0= ruleEString ) ) )? (otherlv_4= Xyz ( (lv_xyz_5_0= ruleEString ) ) )? this_END_6= RULE_END ) ;
    public final EObject rulePose() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_END_6=null;
        AntlrDatatypeRuleToken lv_rpy_3_0 = null;

        AntlrDatatypeRuleToken lv_xyz_5_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:738:2: ( ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Rpy ( (lv_rpy_3_0= ruleEString ) ) )? (otherlv_4= Xyz ( (lv_xyz_5_0= ruleEString ) ) )? this_END_6= RULE_END ) )
            // InternalKinematicsParser.g:739:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Rpy ( (lv_rpy_3_0= ruleEString ) ) )? (otherlv_4= Xyz ( (lv_xyz_5_0= ruleEString ) ) )? this_END_6= RULE_END )
            {
            // InternalKinematicsParser.g:739:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Rpy ( (lv_rpy_3_0= ruleEString ) ) )? (otherlv_4= Xyz ( (lv_xyz_5_0= ruleEString ) ) )? this_END_6= RULE_END )
            // InternalKinematicsParser.g:740:3: () this_BEGIN_1= RULE_BEGIN (otherlv_2= Rpy ( (lv_rpy_3_0= ruleEString ) ) )? (otherlv_4= Xyz ( (lv_xyz_5_0= ruleEString ) ) )? this_END_6= RULE_END
            {
            // InternalKinematicsParser.g:740:3: ()
            // InternalKinematicsParser.g:741:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPoseAccess().getPoseAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_27); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getPoseAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalKinematicsParser.g:751:3: (otherlv_2= Rpy ( (lv_rpy_3_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Rpy) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalKinematicsParser.g:752:4: otherlv_2= Rpy ( (lv_rpy_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Rpy,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getPoseAccess().getRpyKeyword_2_0());
                    			
                    // InternalKinematicsParser.g:756:4: ( (lv_rpy_3_0= ruleEString ) )
                    // InternalKinematicsParser.g:757:5: (lv_rpy_3_0= ruleEString )
                    {
                    // InternalKinematicsParser.g:757:5: (lv_rpy_3_0= ruleEString )
                    // InternalKinematicsParser.g:758:6: lv_rpy_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPoseAccess().getRpyEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_rpy_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPoseRule());
                    						}
                    						set(
                    							current,
                    							"rpy",
                    							lv_rpy_3_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:776:3: (otherlv_4= Xyz ( (lv_xyz_5_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Xyz) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalKinematicsParser.g:777:4: otherlv_4= Xyz ( (lv_xyz_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,Xyz,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getPoseAccess().getXyzKeyword_3_0());
                    			
                    // InternalKinematicsParser.g:781:4: ( (lv_xyz_5_0= ruleEString ) )
                    // InternalKinematicsParser.g:782:5: (lv_xyz_5_0= ruleEString )
                    {
                    // InternalKinematicsParser.g:782:5: (lv_xyz_5_0= ruleEString )
                    // InternalKinematicsParser.g:783:6: lv_xyz_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPoseAccess().getXyzEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_xyz_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPoseRule());
                    						}
                    						set(
                    							current,
                    							"xyz",
                    							lv_xyz_5_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_6, grammarAccess.getPoseAccess().getENDTerminalRuleCall_4());
            		

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


    // $ANTLR start "entryRuleVector3"
    // InternalKinematicsParser.g:809:1: entryRuleVector3 returns [EObject current=null] : iv_ruleVector3= ruleVector3 EOF ;
    public final EObject entryRuleVector3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector3 = null;


        try {
            // InternalKinematicsParser.g:809:48: (iv_ruleVector3= ruleVector3 EOF )
            // InternalKinematicsParser.g:810:2: iv_ruleVector3= ruleVector3 EOF
            {
             newCompositeNode(grammarAccess.getVector3Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVector3=ruleVector3();

            state._fsp--;

             current =iv_ruleVector3; 
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
    // $ANTLR end "entryRuleVector3"


    // $ANTLR start "ruleVector3"
    // InternalKinematicsParser.g:816:1: ruleVector3 returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Xyz ( (lv_xyz_3_0= ruleEString ) ) )? this_END_4= RULE_END ) ;
    public final EObject ruleVector3() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_xyz_3_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:822:2: ( ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Xyz ( (lv_xyz_3_0= ruleEString ) ) )? this_END_4= RULE_END ) )
            // InternalKinematicsParser.g:823:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Xyz ( (lv_xyz_3_0= ruleEString ) ) )? this_END_4= RULE_END )
            {
            // InternalKinematicsParser.g:823:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Xyz ( (lv_xyz_3_0= ruleEString ) ) )? this_END_4= RULE_END )
            // InternalKinematicsParser.g:824:3: () this_BEGIN_1= RULE_BEGIN (otherlv_2= Xyz ( (lv_xyz_3_0= ruleEString ) ) )? this_END_4= RULE_END
            {
            // InternalKinematicsParser.g:824:3: ()
            // InternalKinematicsParser.g:825:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVector3Access().getAxisAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_28); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getVector3Access().getBEGINTerminalRuleCall_1());
            		
            // InternalKinematicsParser.g:835:3: (otherlv_2= Xyz ( (lv_xyz_3_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Xyz) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalKinematicsParser.g:836:4: otherlv_2= Xyz ( (lv_xyz_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Xyz,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getVector3Access().getXyzKeyword_2_0());
                    			
                    // InternalKinematicsParser.g:840:4: ( (lv_xyz_3_0= ruleEString ) )
                    // InternalKinematicsParser.g:841:5: (lv_xyz_3_0= ruleEString )
                    {
                    // InternalKinematicsParser.g:841:5: (lv_xyz_3_0= ruleEString )
                    // InternalKinematicsParser.g:842:6: lv_xyz_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVector3Access().getXyzEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_xyz_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVector3Rule());
                    						}
                    						set(
                    							current,
                    							"xyz",
                    							lv_xyz_3_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getVector3Access().getENDTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleVector3"


    // $ANTLR start "entryRuleLimit"
    // InternalKinematicsParser.g:868:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // InternalKinematicsParser.g:868:46: (iv_ruleLimit= ruleLimit EOF )
            // InternalKinematicsParser.g:869:2: iv_ruleLimit= ruleLimit EOF
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
    // InternalKinematicsParser.g:875:1: ruleLimit returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Effort ( (lv_effort_3_0= ruleDouble0 ) ) )? (otherlv_4= Lower ( (lv_lower_5_0= ruleDouble0 ) ) )? (otherlv_6= Upper ( (lv_upper_7_0= ruleDouble0 ) ) )? (otherlv_8= Velocity ( (lv_velocity_9_0= ruleDouble0 ) ) )? this_END_10= RULE_END ) ;
    public final EObject ruleLimit() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_END_10=null;
        AntlrDatatypeRuleToken lv_effort_3_0 = null;

        AntlrDatatypeRuleToken lv_lower_5_0 = null;

        AntlrDatatypeRuleToken lv_upper_7_0 = null;

        AntlrDatatypeRuleToken lv_velocity_9_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:881:2: ( ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Effort ( (lv_effort_3_0= ruleDouble0 ) ) )? (otherlv_4= Lower ( (lv_lower_5_0= ruleDouble0 ) ) )? (otherlv_6= Upper ( (lv_upper_7_0= ruleDouble0 ) ) )? (otherlv_8= Velocity ( (lv_velocity_9_0= ruleDouble0 ) ) )? this_END_10= RULE_END ) )
            // InternalKinematicsParser.g:882:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Effort ( (lv_effort_3_0= ruleDouble0 ) ) )? (otherlv_4= Lower ( (lv_lower_5_0= ruleDouble0 ) ) )? (otherlv_6= Upper ( (lv_upper_7_0= ruleDouble0 ) ) )? (otherlv_8= Velocity ( (lv_velocity_9_0= ruleDouble0 ) ) )? this_END_10= RULE_END )
            {
            // InternalKinematicsParser.g:882:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Effort ( (lv_effort_3_0= ruleDouble0 ) ) )? (otherlv_4= Lower ( (lv_lower_5_0= ruleDouble0 ) ) )? (otherlv_6= Upper ( (lv_upper_7_0= ruleDouble0 ) ) )? (otherlv_8= Velocity ( (lv_velocity_9_0= ruleDouble0 ) ) )? this_END_10= RULE_END )
            // InternalKinematicsParser.g:883:3: () this_BEGIN_1= RULE_BEGIN (otherlv_2= Effort ( (lv_effort_3_0= ruleDouble0 ) ) )? (otherlv_4= Lower ( (lv_lower_5_0= ruleDouble0 ) ) )? (otherlv_6= Upper ( (lv_upper_7_0= ruleDouble0 ) ) )? (otherlv_8= Velocity ( (lv_velocity_9_0= ruleDouble0 ) ) )? this_END_10= RULE_END
            {
            // InternalKinematicsParser.g:883:3: ()
            // InternalKinematicsParser.g:884:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLimitAccess().getLimitAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_29); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getLimitAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalKinematicsParser.g:894:3: (otherlv_2= Effort ( (lv_effort_3_0= ruleDouble0 ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Effort) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalKinematicsParser.g:895:4: otherlv_2= Effort ( (lv_effort_3_0= ruleDouble0 ) )
                    {
                    otherlv_2=(Token)match(input,Effort,FOLLOW_30); 

                    				newLeafNode(otherlv_2, grammarAccess.getLimitAccess().getEffortKeyword_2_0());
                    			
                    // InternalKinematicsParser.g:899:4: ( (lv_effort_3_0= ruleDouble0 ) )
                    // InternalKinematicsParser.g:900:5: (lv_effort_3_0= ruleDouble0 )
                    {
                    // InternalKinematicsParser.g:900:5: (lv_effort_3_0= ruleDouble0 )
                    // InternalKinematicsParser.g:901:6: lv_effort_3_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getLimitAccess().getEffortDouble0ParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_effort_3_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLimitRule());
                    						}
                    						set(
                    							current,
                    							"effort",
                    							lv_effort_3_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:919:3: (otherlv_4= Lower ( (lv_lower_5_0= ruleDouble0 ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Lower) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalKinematicsParser.g:920:4: otherlv_4= Lower ( (lv_lower_5_0= ruleDouble0 ) )
                    {
                    otherlv_4=(Token)match(input,Lower,FOLLOW_30); 

                    				newLeafNode(otherlv_4, grammarAccess.getLimitAccess().getLowerKeyword_3_0());
                    			
                    // InternalKinematicsParser.g:924:4: ( (lv_lower_5_0= ruleDouble0 ) )
                    // InternalKinematicsParser.g:925:5: (lv_lower_5_0= ruleDouble0 )
                    {
                    // InternalKinematicsParser.g:925:5: (lv_lower_5_0= ruleDouble0 )
                    // InternalKinematicsParser.g:926:6: lv_lower_5_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getLimitAccess().getLowerDouble0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_lower_5_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLimitRule());
                    						}
                    						set(
                    							current,
                    							"lower",
                    							lv_lower_5_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:944:3: (otherlv_6= Upper ( (lv_upper_7_0= ruleDouble0 ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Upper) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalKinematicsParser.g:945:4: otherlv_6= Upper ( (lv_upper_7_0= ruleDouble0 ) )
                    {
                    otherlv_6=(Token)match(input,Upper,FOLLOW_30); 

                    				newLeafNode(otherlv_6, grammarAccess.getLimitAccess().getUpperKeyword_4_0());
                    			
                    // InternalKinematicsParser.g:949:4: ( (lv_upper_7_0= ruleDouble0 ) )
                    // InternalKinematicsParser.g:950:5: (lv_upper_7_0= ruleDouble0 )
                    {
                    // InternalKinematicsParser.g:950:5: (lv_upper_7_0= ruleDouble0 )
                    // InternalKinematicsParser.g:951:6: lv_upper_7_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getLimitAccess().getUpperDouble0ParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_upper_7_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLimitRule());
                    						}
                    						set(
                    							current,
                    							"upper",
                    							lv_upper_7_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:969:3: (otherlv_8= Velocity ( (lv_velocity_9_0= ruleDouble0 ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Velocity) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalKinematicsParser.g:970:4: otherlv_8= Velocity ( (lv_velocity_9_0= ruleDouble0 ) )
                    {
                    otherlv_8=(Token)match(input,Velocity,FOLLOW_30); 

                    				newLeafNode(otherlv_8, grammarAccess.getLimitAccess().getVelocityKeyword_5_0());
                    			
                    // InternalKinematicsParser.g:974:4: ( (lv_velocity_9_0= ruleDouble0 ) )
                    // InternalKinematicsParser.g:975:5: (lv_velocity_9_0= ruleDouble0 )
                    {
                    // InternalKinematicsParser.g:975:5: (lv_velocity_9_0= ruleDouble0 )
                    // InternalKinematicsParser.g:976:6: lv_velocity_9_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getLimitAccess().getVelocityDouble0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_velocity_9_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLimitRule());
                    						}
                    						set(
                    							current,
                    							"velocity",
                    							lv_velocity_9_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_10=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_10, grammarAccess.getLimitAccess().getENDTerminalRuleCall_6());
            		

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


    // $ANTLR start "entryRuleInertial"
    // InternalKinematicsParser.g:1002:1: entryRuleInertial returns [EObject current=null] : iv_ruleInertial= ruleInertial EOF ;
    public final EObject entryRuleInertial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertial = null;


        try {
            // InternalKinematicsParser.g:1002:49: (iv_ruleInertial= ruleInertial EOF )
            // InternalKinematicsParser.g:1003:2: iv_ruleInertial= ruleInertial EOF
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
    // InternalKinematicsParser.g:1009:1: ruleInertial returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Origin ( (lv_origin_3_0= rulePose ) ) )? (otherlv_4= Mass ( (lv_mass_5_0= ruleMass ) ) )? (otherlv_6= Inertia ( (lv_inertia_7_0= ruleInertia ) ) )? this_END_8= RULE_END ) ;
    public final EObject ruleInertial() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_END_8=null;
        EObject lv_origin_3_0 = null;

        EObject lv_mass_5_0 = null;

        EObject lv_inertia_7_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:1015:2: ( ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Origin ( (lv_origin_3_0= rulePose ) ) )? (otherlv_4= Mass ( (lv_mass_5_0= ruleMass ) ) )? (otherlv_6= Inertia ( (lv_inertia_7_0= ruleInertia ) ) )? this_END_8= RULE_END ) )
            // InternalKinematicsParser.g:1016:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Origin ( (lv_origin_3_0= rulePose ) ) )? (otherlv_4= Mass ( (lv_mass_5_0= ruleMass ) ) )? (otherlv_6= Inertia ( (lv_inertia_7_0= ruleInertia ) ) )? this_END_8= RULE_END )
            {
            // InternalKinematicsParser.g:1016:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Origin ( (lv_origin_3_0= rulePose ) ) )? (otherlv_4= Mass ( (lv_mass_5_0= ruleMass ) ) )? (otherlv_6= Inertia ( (lv_inertia_7_0= ruleInertia ) ) )? this_END_8= RULE_END )
            // InternalKinematicsParser.g:1017:3: () this_BEGIN_1= RULE_BEGIN (otherlv_2= Origin ( (lv_origin_3_0= rulePose ) ) )? (otherlv_4= Mass ( (lv_mass_5_0= ruleMass ) ) )? (otherlv_6= Inertia ( (lv_inertia_7_0= ruleInertia ) ) )? this_END_8= RULE_END
            {
            // InternalKinematicsParser.g:1017:3: ()
            // InternalKinematicsParser.g:1018:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInertialAccess().getInertialAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_34); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getInertialAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalKinematicsParser.g:1028:3: (otherlv_2= Origin ( (lv_origin_3_0= rulePose ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Origin) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalKinematicsParser.g:1029:4: otherlv_2= Origin ( (lv_origin_3_0= rulePose ) )
                    {
                    otherlv_2=(Token)match(input,Origin,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getInertialAccess().getOriginKeyword_2_0());
                    			
                    // InternalKinematicsParser.g:1033:4: ( (lv_origin_3_0= rulePose ) )
                    // InternalKinematicsParser.g:1034:5: (lv_origin_3_0= rulePose )
                    {
                    // InternalKinematicsParser.g:1034:5: (lv_origin_3_0= rulePose )
                    // InternalKinematicsParser.g:1035:6: lv_origin_3_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getInertialAccess().getOriginPoseParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_origin_3_0=rulePose();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertialRule());
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

            // InternalKinematicsParser.g:1053:3: (otherlv_4= Mass ( (lv_mass_5_0= ruleMass ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Mass) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalKinematicsParser.g:1054:4: otherlv_4= Mass ( (lv_mass_5_0= ruleMass ) )
                    {
                    otherlv_4=(Token)match(input,Mass,FOLLOW_30); 

                    				newLeafNode(otherlv_4, grammarAccess.getInertialAccess().getMassKeyword_3_0());
                    			
                    // InternalKinematicsParser.g:1058:4: ( (lv_mass_5_0= ruleMass ) )
                    // InternalKinematicsParser.g:1059:5: (lv_mass_5_0= ruleMass )
                    {
                    // InternalKinematicsParser.g:1059:5: (lv_mass_5_0= ruleMass )
                    // InternalKinematicsParser.g:1060:6: lv_mass_5_0= ruleMass
                    {

                    						newCompositeNode(grammarAccess.getInertialAccess().getMassMassParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_mass_5_0=ruleMass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertialRule());
                    						}
                    						set(
                    							current,
                    							"mass",
                    							lv_mass_5_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Mass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:1078:3: (otherlv_6= Inertia ( (lv_inertia_7_0= ruleInertia ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Inertia) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalKinematicsParser.g:1079:4: otherlv_6= Inertia ( (lv_inertia_7_0= ruleInertia ) )
                    {
                    otherlv_6=(Token)match(input,Inertia,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getInertialAccess().getInertiaKeyword_4_0());
                    			
                    // InternalKinematicsParser.g:1083:4: ( (lv_inertia_7_0= ruleInertia ) )
                    // InternalKinematicsParser.g:1084:5: (lv_inertia_7_0= ruleInertia )
                    {
                    // InternalKinematicsParser.g:1084:5: (lv_inertia_7_0= ruleInertia )
                    // InternalKinematicsParser.g:1085:6: lv_inertia_7_0= ruleInertia
                    {

                    						newCompositeNode(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_inertia_7_0=ruleInertia();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertialRule());
                    						}
                    						set(
                    							current,
                    							"inertia",
                    							lv_inertia_7_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Inertia");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_8, grammarAccess.getInertialAccess().getENDTerminalRuleCall_5());
            		

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
    // InternalKinematicsParser.g:1111:1: entryRuleVisual returns [EObject current=null] : iv_ruleVisual= ruleVisual EOF ;
    public final EObject entryRuleVisual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisual = null;


        try {
            // InternalKinematicsParser.g:1111:47: (iv_ruleVisual= ruleVisual EOF )
            // InternalKinematicsParser.g:1112:2: iv_ruleVisual= ruleVisual EOF
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
    // InternalKinematicsParser.g:1118:1: ruleVisual returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END ) ;
    public final EObject ruleVisual() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_END_5=null;
        EObject lv_origin_2_0 = null;

        EObject lv_geometry_4_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:1124:2: ( (this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END ) )
            // InternalKinematicsParser.g:1125:2: (this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END )
            {
            // InternalKinematicsParser.g:1125:2: (this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END )
            // InternalKinematicsParser.g:1126:3: this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_37); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getVisualAccess().getBEGINTerminalRuleCall_0());
            		
            // InternalKinematicsParser.g:1130:3: (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Origin) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalKinematicsParser.g:1131:4: otherlv_1= Origin ( (lv_origin_2_0= rulePose ) )
                    {
                    otherlv_1=(Token)match(input,Origin,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getVisualAccess().getOriginKeyword_1_0());
                    			
                    // InternalKinematicsParser.g:1135:4: ( (lv_origin_2_0= rulePose ) )
                    // InternalKinematicsParser.g:1136:5: (lv_origin_2_0= rulePose )
                    {
                    // InternalKinematicsParser.g:1136:5: (lv_origin_2_0= rulePose )
                    // InternalKinematicsParser.g:1137:6: lv_origin_2_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getVisualAccess().getOriginPoseParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_origin_2_0=rulePose();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVisualRule());
                    						}
                    						set(
                    							current,
                    							"origin",
                    							lv_origin_2_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Pose");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,Geometry,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getVisualAccess().getGeometryKeyword_2());
            		
            // InternalKinematicsParser.g:1159:3: ( (lv_geometry_4_0= ruleGeometry ) )
            // InternalKinematicsParser.g:1160:4: (lv_geometry_4_0= ruleGeometry )
            {
            // InternalKinematicsParser.g:1160:4: (lv_geometry_4_0= ruleGeometry )
            // InternalKinematicsParser.g:1161:5: lv_geometry_4_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_geometry_4_0=ruleGeometry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisualRule());
            					}
            					set(
            						current,
            						"geometry",
            						lv_geometry_4_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Geometry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_5, grammarAccess.getVisualAccess().getENDTerminalRuleCall_4());
            		

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
    // InternalKinematicsParser.g:1186:1: entryRuleCollision returns [EObject current=null] : iv_ruleCollision= ruleCollision EOF ;
    public final EObject entryRuleCollision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollision = null;


        try {
            // InternalKinematicsParser.g:1186:50: (iv_ruleCollision= ruleCollision EOF )
            // InternalKinematicsParser.g:1187:2: iv_ruleCollision= ruleCollision EOF
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
    // InternalKinematicsParser.g:1193:1: ruleCollision returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END ) ;
    public final EObject ruleCollision() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_END_5=null;
        EObject lv_origin_2_0 = null;

        EObject lv_geometry_4_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:1199:2: ( (this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END ) )
            // InternalKinematicsParser.g:1200:2: (this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END )
            {
            // InternalKinematicsParser.g:1200:2: (this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END )
            // InternalKinematicsParser.g:1201:3: this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_37); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getCollisionAccess().getBEGINTerminalRuleCall_0());
            		
            // InternalKinematicsParser.g:1205:3: (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Origin) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKinematicsParser.g:1206:4: otherlv_1= Origin ( (lv_origin_2_0= rulePose ) )
                    {
                    otherlv_1=(Token)match(input,Origin,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getCollisionAccess().getOriginKeyword_1_0());
                    			
                    // InternalKinematicsParser.g:1210:4: ( (lv_origin_2_0= rulePose ) )
                    // InternalKinematicsParser.g:1211:5: (lv_origin_2_0= rulePose )
                    {
                    // InternalKinematicsParser.g:1211:5: (lv_origin_2_0= rulePose )
                    // InternalKinematicsParser.g:1212:6: lv_origin_2_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getCollisionAccess().getOriginPoseParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_origin_2_0=rulePose();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollisionRule());
                    						}
                    						set(
                    							current,
                    							"origin",
                    							lv_origin_2_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Pose");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,Geometry,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCollisionAccess().getGeometryKeyword_2());
            		
            // InternalKinematicsParser.g:1234:3: ( (lv_geometry_4_0= ruleGeometry ) )
            // InternalKinematicsParser.g:1235:4: (lv_geometry_4_0= ruleGeometry )
            {
            // InternalKinematicsParser.g:1235:4: (lv_geometry_4_0= ruleGeometry )
            // InternalKinematicsParser.g:1236:5: lv_geometry_4_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_geometry_4_0=ruleGeometry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollisionRule());
            					}
            					set(
            						current,
            						"geometry",
            						lv_geometry_4_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Geometry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_5, grammarAccess.getCollisionAccess().getENDTerminalRuleCall_4());
            		

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
    // InternalKinematicsParser.g:1261:1: entryRuleMass returns [EObject current=null] : iv_ruleMass= ruleMass EOF ;
    public final EObject entryRuleMass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMass = null;


        try {
            // InternalKinematicsParser.g:1261:45: (iv_ruleMass= ruleMass EOF )
            // InternalKinematicsParser.g:1262:2: iv_ruleMass= ruleMass EOF
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
    // InternalKinematicsParser.g:1268:1: ruleMass returns [EObject current=null] : ( () ( (lv_value_1_0= ruleDouble0 ) ) ) ;
    public final EObject ruleMass() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:1274:2: ( ( () ( (lv_value_1_0= ruleDouble0 ) ) ) )
            // InternalKinematicsParser.g:1275:2: ( () ( (lv_value_1_0= ruleDouble0 ) ) )
            {
            // InternalKinematicsParser.g:1275:2: ( () ( (lv_value_1_0= ruleDouble0 ) ) )
            // InternalKinematicsParser.g:1276:3: () ( (lv_value_1_0= ruleDouble0 ) )
            {
            // InternalKinematicsParser.g:1276:3: ()
            // InternalKinematicsParser.g:1277:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMassAccess().getMassAction_0(),
            					current);
            			

            }

            // InternalKinematicsParser.g:1283:3: ( (lv_value_1_0= ruleDouble0 ) )
            // InternalKinematicsParser.g:1284:4: (lv_value_1_0= ruleDouble0 )
            {
            // InternalKinematicsParser.g:1284:4: (lv_value_1_0= ruleDouble0 )
            // InternalKinematicsParser.g:1285:5: lv_value_1_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getMassAccess().getValueDouble0ParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMassRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // InternalKinematicsParser.g:1306:1: entryRuleInertia returns [EObject current=null] : iv_ruleInertia= ruleInertia EOF ;
    public final EObject entryRuleInertia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertia = null;


        try {
            // InternalKinematicsParser.g:1306:48: (iv_ruleInertia= ruleInertia EOF )
            // InternalKinematicsParser.g:1307:2: iv_ruleInertia= ruleInertia EOF
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
    // InternalKinematicsParser.g:1313:1: ruleInertia returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Ixx ( (lv_ixx_3_0= ruleDouble0 ) ) )? (otherlv_4= Ixy ( (lv_ixy_5_0= ruleDouble0 ) ) )? (otherlv_6= Ixz ( (lv_ixz_7_0= ruleDouble0 ) ) )? (otherlv_8= Iyy ( (lv_iyy_9_0= ruleDouble0 ) ) )? (otherlv_10= Iyz ( (lv_iyz_11_0= ruleDouble0 ) ) )? (otherlv_12= Izz ( (lv_izz_13_0= ruleDouble0 ) ) )? this_END_14= RULE_END ) ;
    public final EObject ruleInertia() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token this_END_14=null;
        AntlrDatatypeRuleToken lv_ixx_3_0 = null;

        AntlrDatatypeRuleToken lv_ixy_5_0 = null;

        AntlrDatatypeRuleToken lv_ixz_7_0 = null;

        AntlrDatatypeRuleToken lv_iyy_9_0 = null;

        AntlrDatatypeRuleToken lv_iyz_11_0 = null;

        AntlrDatatypeRuleToken lv_izz_13_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:1319:2: ( ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Ixx ( (lv_ixx_3_0= ruleDouble0 ) ) )? (otherlv_4= Ixy ( (lv_ixy_5_0= ruleDouble0 ) ) )? (otherlv_6= Ixz ( (lv_ixz_7_0= ruleDouble0 ) ) )? (otherlv_8= Iyy ( (lv_iyy_9_0= ruleDouble0 ) ) )? (otherlv_10= Iyz ( (lv_iyz_11_0= ruleDouble0 ) ) )? (otherlv_12= Izz ( (lv_izz_13_0= ruleDouble0 ) ) )? this_END_14= RULE_END ) )
            // InternalKinematicsParser.g:1320:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Ixx ( (lv_ixx_3_0= ruleDouble0 ) ) )? (otherlv_4= Ixy ( (lv_ixy_5_0= ruleDouble0 ) ) )? (otherlv_6= Ixz ( (lv_ixz_7_0= ruleDouble0 ) ) )? (otherlv_8= Iyy ( (lv_iyy_9_0= ruleDouble0 ) ) )? (otherlv_10= Iyz ( (lv_iyz_11_0= ruleDouble0 ) ) )? (otherlv_12= Izz ( (lv_izz_13_0= ruleDouble0 ) ) )? this_END_14= RULE_END )
            {
            // InternalKinematicsParser.g:1320:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Ixx ( (lv_ixx_3_0= ruleDouble0 ) ) )? (otherlv_4= Ixy ( (lv_ixy_5_0= ruleDouble0 ) ) )? (otherlv_6= Ixz ( (lv_ixz_7_0= ruleDouble0 ) ) )? (otherlv_8= Iyy ( (lv_iyy_9_0= ruleDouble0 ) ) )? (otherlv_10= Iyz ( (lv_iyz_11_0= ruleDouble0 ) ) )? (otherlv_12= Izz ( (lv_izz_13_0= ruleDouble0 ) ) )? this_END_14= RULE_END )
            // InternalKinematicsParser.g:1321:3: () this_BEGIN_1= RULE_BEGIN (otherlv_2= Ixx ( (lv_ixx_3_0= ruleDouble0 ) ) )? (otherlv_4= Ixy ( (lv_ixy_5_0= ruleDouble0 ) ) )? (otherlv_6= Ixz ( (lv_ixz_7_0= ruleDouble0 ) ) )? (otherlv_8= Iyy ( (lv_iyy_9_0= ruleDouble0 ) ) )? (otherlv_10= Iyz ( (lv_iyz_11_0= ruleDouble0 ) ) )? (otherlv_12= Izz ( (lv_izz_13_0= ruleDouble0 ) ) )? this_END_14= RULE_END
            {
            // InternalKinematicsParser.g:1321:3: ()
            // InternalKinematicsParser.g:1322:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInertiaAccess().getInertiaAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_39); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getInertiaAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalKinematicsParser.g:1332:3: (otherlv_2= Ixx ( (lv_ixx_3_0= ruleDouble0 ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Ixx) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalKinematicsParser.g:1333:4: otherlv_2= Ixx ( (lv_ixx_3_0= ruleDouble0 ) )
                    {
                    otherlv_2=(Token)match(input,Ixx,FOLLOW_30); 

                    				newLeafNode(otherlv_2, grammarAccess.getInertiaAccess().getIxxKeyword_2_0());
                    			
                    // InternalKinematicsParser.g:1337:4: ( (lv_ixx_3_0= ruleDouble0 ) )
                    // InternalKinematicsParser.g:1338:5: (lv_ixx_3_0= ruleDouble0 )
                    {
                    // InternalKinematicsParser.g:1338:5: (lv_ixx_3_0= ruleDouble0 )
                    // InternalKinematicsParser.g:1339:6: lv_ixx_3_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIxxDouble0ParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_ixx_3_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertiaRule());
                    						}
                    						set(
                    							current,
                    							"ixx",
                    							lv_ixx_3_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:1357:3: (otherlv_4= Ixy ( (lv_ixy_5_0= ruleDouble0 ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Ixy) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalKinematicsParser.g:1358:4: otherlv_4= Ixy ( (lv_ixy_5_0= ruleDouble0 ) )
                    {
                    otherlv_4=(Token)match(input,Ixy,FOLLOW_30); 

                    				newLeafNode(otherlv_4, grammarAccess.getInertiaAccess().getIxyKeyword_3_0());
                    			
                    // InternalKinematicsParser.g:1362:4: ( (lv_ixy_5_0= ruleDouble0 ) )
                    // InternalKinematicsParser.g:1363:5: (lv_ixy_5_0= ruleDouble0 )
                    {
                    // InternalKinematicsParser.g:1363:5: (lv_ixy_5_0= ruleDouble0 )
                    // InternalKinematicsParser.g:1364:6: lv_ixy_5_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIxyDouble0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_ixy_5_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertiaRule());
                    						}
                    						set(
                    							current,
                    							"ixy",
                    							lv_ixy_5_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:1382:3: (otherlv_6= Ixz ( (lv_ixz_7_0= ruleDouble0 ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Ixz) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalKinematicsParser.g:1383:4: otherlv_6= Ixz ( (lv_ixz_7_0= ruleDouble0 ) )
                    {
                    otherlv_6=(Token)match(input,Ixz,FOLLOW_30); 

                    				newLeafNode(otherlv_6, grammarAccess.getInertiaAccess().getIxzKeyword_4_0());
                    			
                    // InternalKinematicsParser.g:1387:4: ( (lv_ixz_7_0= ruleDouble0 ) )
                    // InternalKinematicsParser.g:1388:5: (lv_ixz_7_0= ruleDouble0 )
                    {
                    // InternalKinematicsParser.g:1388:5: (lv_ixz_7_0= ruleDouble0 )
                    // InternalKinematicsParser.g:1389:6: lv_ixz_7_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIxzDouble0ParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_ixz_7_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertiaRule());
                    						}
                    						set(
                    							current,
                    							"ixz",
                    							lv_ixz_7_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:1407:3: (otherlv_8= Iyy ( (lv_iyy_9_0= ruleDouble0 ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Iyy) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalKinematicsParser.g:1408:4: otherlv_8= Iyy ( (lv_iyy_9_0= ruleDouble0 ) )
                    {
                    otherlv_8=(Token)match(input,Iyy,FOLLOW_30); 

                    				newLeafNode(otherlv_8, grammarAccess.getInertiaAccess().getIyyKeyword_5_0());
                    			
                    // InternalKinematicsParser.g:1412:4: ( (lv_iyy_9_0= ruleDouble0 ) )
                    // InternalKinematicsParser.g:1413:5: (lv_iyy_9_0= ruleDouble0 )
                    {
                    // InternalKinematicsParser.g:1413:5: (lv_iyy_9_0= ruleDouble0 )
                    // InternalKinematicsParser.g:1414:6: lv_iyy_9_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIyyDouble0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_iyy_9_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertiaRule());
                    						}
                    						set(
                    							current,
                    							"iyy",
                    							lv_iyy_9_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:1432:3: (otherlv_10= Iyz ( (lv_iyz_11_0= ruleDouble0 ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Iyz) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalKinematicsParser.g:1433:4: otherlv_10= Iyz ( (lv_iyz_11_0= ruleDouble0 ) )
                    {
                    otherlv_10=(Token)match(input,Iyz,FOLLOW_30); 

                    				newLeafNode(otherlv_10, grammarAccess.getInertiaAccess().getIyzKeyword_6_0());
                    			
                    // InternalKinematicsParser.g:1437:4: ( (lv_iyz_11_0= ruleDouble0 ) )
                    // InternalKinematicsParser.g:1438:5: (lv_iyz_11_0= ruleDouble0 )
                    {
                    // InternalKinematicsParser.g:1438:5: (lv_iyz_11_0= ruleDouble0 )
                    // InternalKinematicsParser.g:1439:6: lv_iyz_11_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIyzDouble0ParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_iyz_11_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertiaRule());
                    						}
                    						set(
                    							current,
                    							"iyz",
                    							lv_iyz_11_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:1457:3: (otherlv_12= Izz ( (lv_izz_13_0= ruleDouble0 ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Izz) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalKinematicsParser.g:1458:4: otherlv_12= Izz ( (lv_izz_13_0= ruleDouble0 ) )
                    {
                    otherlv_12=(Token)match(input,Izz,FOLLOW_30); 

                    				newLeafNode(otherlv_12, grammarAccess.getInertiaAccess().getIzzKeyword_7_0());
                    			
                    // InternalKinematicsParser.g:1462:4: ( (lv_izz_13_0= ruleDouble0 ) )
                    // InternalKinematicsParser.g:1463:5: (lv_izz_13_0= ruleDouble0 )
                    {
                    // InternalKinematicsParser.g:1463:5: (lv_izz_13_0= ruleDouble0 )
                    // InternalKinematicsParser.g:1464:6: lv_izz_13_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIzzDouble0ParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_izz_13_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertiaRule());
                    						}
                    						set(
                    							current,
                    							"izz",
                    							lv_izz_13_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_14=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_14, grammarAccess.getInertiaAccess().getENDTerminalRuleCall_8());
            		

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
    // InternalKinematicsParser.g:1490:1: entryRuleGeometry returns [EObject current=null] : iv_ruleGeometry= ruleGeometry EOF ;
    public final EObject entryRuleGeometry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeometry = null;


        try {
            // InternalKinematicsParser.g:1490:49: (iv_ruleGeometry= ruleGeometry EOF )
            // InternalKinematicsParser.g:1491:2: iv_ruleGeometry= ruleGeometry EOF
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
    // InternalKinematicsParser.g:1497:1: ruleGeometry returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Box ( (lv_box_3_0= ruleBox ) ) )? (otherlv_4= Cylinder ( (lv_cylinder_5_0= ruleCylinder ) ) )? (otherlv_6= Sphere ( (lv_sphere_7_0= ruleSphere ) ) )? (otherlv_8= Mesh ( (lv_mesh_9_0= ruleMesh ) ) )? this_END_10= RULE_END ) ;
    public final EObject ruleGeometry() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_END_10=null;
        EObject lv_box_3_0 = null;

        EObject lv_cylinder_5_0 = null;

        EObject lv_sphere_7_0 = null;

        EObject lv_mesh_9_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:1503:2: ( ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Box ( (lv_box_3_0= ruleBox ) ) )? (otherlv_4= Cylinder ( (lv_cylinder_5_0= ruleCylinder ) ) )? (otherlv_6= Sphere ( (lv_sphere_7_0= ruleSphere ) ) )? (otherlv_8= Mesh ( (lv_mesh_9_0= ruleMesh ) ) )? this_END_10= RULE_END ) )
            // InternalKinematicsParser.g:1504:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Box ( (lv_box_3_0= ruleBox ) ) )? (otherlv_4= Cylinder ( (lv_cylinder_5_0= ruleCylinder ) ) )? (otherlv_6= Sphere ( (lv_sphere_7_0= ruleSphere ) ) )? (otherlv_8= Mesh ( (lv_mesh_9_0= ruleMesh ) ) )? this_END_10= RULE_END )
            {
            // InternalKinematicsParser.g:1504:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Box ( (lv_box_3_0= ruleBox ) ) )? (otherlv_4= Cylinder ( (lv_cylinder_5_0= ruleCylinder ) ) )? (otherlv_6= Sphere ( (lv_sphere_7_0= ruleSphere ) ) )? (otherlv_8= Mesh ( (lv_mesh_9_0= ruleMesh ) ) )? this_END_10= RULE_END )
            // InternalKinematicsParser.g:1505:3: () this_BEGIN_1= RULE_BEGIN (otherlv_2= Box ( (lv_box_3_0= ruleBox ) ) )? (otherlv_4= Cylinder ( (lv_cylinder_5_0= ruleCylinder ) ) )? (otherlv_6= Sphere ( (lv_sphere_7_0= ruleSphere ) ) )? (otherlv_8= Mesh ( (lv_mesh_9_0= ruleMesh ) ) )? this_END_10= RULE_END
            {
            // InternalKinematicsParser.g:1505:3: ()
            // InternalKinematicsParser.g:1506:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGeometryAccess().getGeometryAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_45); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getGeometryAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalKinematicsParser.g:1516:3: (otherlv_2= Box ( (lv_box_3_0= ruleBox ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Box) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalKinematicsParser.g:1517:4: otherlv_2= Box ( (lv_box_3_0= ruleBox ) )
                    {
                    otherlv_2=(Token)match(input,Box,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getGeometryAccess().getBoxKeyword_2_0());
                    			
                    // InternalKinematicsParser.g:1521:4: ( (lv_box_3_0= ruleBox ) )
                    // InternalKinematicsParser.g:1522:5: (lv_box_3_0= ruleBox )
                    {
                    // InternalKinematicsParser.g:1522:5: (lv_box_3_0= ruleBox )
                    // InternalKinematicsParser.g:1523:6: lv_box_3_0= ruleBox
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getBoxBoxParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_box_3_0=ruleBox();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGeometryRule());
                    						}
                    						set(
                    							current,
                    							"box",
                    							lv_box_3_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Box");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:1541:3: (otherlv_4= Cylinder ( (lv_cylinder_5_0= ruleCylinder ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Cylinder) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalKinematicsParser.g:1542:4: otherlv_4= Cylinder ( (lv_cylinder_5_0= ruleCylinder ) )
                    {
                    otherlv_4=(Token)match(input,Cylinder,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getGeometryAccess().getCylinderKeyword_3_0());
                    			
                    // InternalKinematicsParser.g:1546:4: ( (lv_cylinder_5_0= ruleCylinder ) )
                    // InternalKinematicsParser.g:1547:5: (lv_cylinder_5_0= ruleCylinder )
                    {
                    // InternalKinematicsParser.g:1547:5: (lv_cylinder_5_0= ruleCylinder )
                    // InternalKinematicsParser.g:1548:6: lv_cylinder_5_0= ruleCylinder
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getCylinderCylinderParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_cylinder_5_0=ruleCylinder();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGeometryRule());
                    						}
                    						set(
                    							current,
                    							"cylinder",
                    							lv_cylinder_5_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Cylinder");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:1566:3: (otherlv_6= Sphere ( (lv_sphere_7_0= ruleSphere ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Sphere) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalKinematicsParser.g:1567:4: otherlv_6= Sphere ( (lv_sphere_7_0= ruleSphere ) )
                    {
                    otherlv_6=(Token)match(input,Sphere,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getGeometryAccess().getSphereKeyword_4_0());
                    			
                    // InternalKinematicsParser.g:1571:4: ( (lv_sphere_7_0= ruleSphere ) )
                    // InternalKinematicsParser.g:1572:5: (lv_sphere_7_0= ruleSphere )
                    {
                    // InternalKinematicsParser.g:1572:5: (lv_sphere_7_0= ruleSphere )
                    // InternalKinematicsParser.g:1573:6: lv_sphere_7_0= ruleSphere
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getSphereSphereParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_sphere_7_0=ruleSphere();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGeometryRule());
                    						}
                    						set(
                    							current,
                    							"sphere",
                    							lv_sphere_7_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Sphere");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:1591:3: (otherlv_8= Mesh ( (lv_mesh_9_0= ruleMesh ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Mesh) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalKinematicsParser.g:1592:4: otherlv_8= Mesh ( (lv_mesh_9_0= ruleMesh ) )
                    {
                    otherlv_8=(Token)match(input,Mesh,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getGeometryAccess().getMeshKeyword_5_0());
                    			
                    // InternalKinematicsParser.g:1596:4: ( (lv_mesh_9_0= ruleMesh ) )
                    // InternalKinematicsParser.g:1597:5: (lv_mesh_9_0= ruleMesh )
                    {
                    // InternalKinematicsParser.g:1597:5: (lv_mesh_9_0= ruleMesh )
                    // InternalKinematicsParser.g:1598:6: lv_mesh_9_0= ruleMesh
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getMeshMeshParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_mesh_9_0=ruleMesh();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGeometryRule());
                    						}
                    						set(
                    							current,
                    							"mesh",
                    							lv_mesh_9_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Mesh");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_10=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_10, grammarAccess.getGeometryAccess().getENDTerminalRuleCall_6());
            		

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


    // $ANTLR start "entryRuleBox"
    // InternalKinematicsParser.g:1624:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // InternalKinematicsParser.g:1624:44: (iv_ruleBox= ruleBox EOF )
            // InternalKinematicsParser.g:1625:2: iv_ruleBox= ruleBox EOF
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
    // InternalKinematicsParser.g:1631:1: ruleBox returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN otherlv_2= Size ( (lv_size_3_0= ruleEString ) ) this_END_4= RULE_END ) ;
    public final EObject ruleBox() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_size_3_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:1637:2: ( ( () this_BEGIN_1= RULE_BEGIN otherlv_2= Size ( (lv_size_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            // InternalKinematicsParser.g:1638:2: ( () this_BEGIN_1= RULE_BEGIN otherlv_2= Size ( (lv_size_3_0= ruleEString ) ) this_END_4= RULE_END )
            {
            // InternalKinematicsParser.g:1638:2: ( () this_BEGIN_1= RULE_BEGIN otherlv_2= Size ( (lv_size_3_0= ruleEString ) ) this_END_4= RULE_END )
            // InternalKinematicsParser.g:1639:3: () this_BEGIN_1= RULE_BEGIN otherlv_2= Size ( (lv_size_3_0= ruleEString ) ) this_END_4= RULE_END
            {
            // InternalKinematicsParser.g:1639:3: ()
            // InternalKinematicsParser.g:1640:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoxAccess().getBoxAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_49); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getBoxAccess().getBEGINTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,Size,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getBoxAccess().getSizeKeyword_2());
            		
            // InternalKinematicsParser.g:1654:3: ( (lv_size_3_0= ruleEString ) )
            // InternalKinematicsParser.g:1655:4: (lv_size_3_0= ruleEString )
            {
            // InternalKinematicsParser.g:1655:4: (lv_size_3_0= ruleEString )
            // InternalKinematicsParser.g:1656:5: lv_size_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBoxAccess().getSizeEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_size_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoxRule());
            					}
            					set(
            						current,
            						"size",
            						lv_size_3_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getBoxAccess().getENDTerminalRuleCall_4());
            		

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
    // InternalKinematicsParser.g:1681:1: entryRuleCylinder returns [EObject current=null] : iv_ruleCylinder= ruleCylinder EOF ;
    public final EObject entryRuleCylinder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCylinder = null;


        try {
            // InternalKinematicsParser.g:1681:49: (iv_ruleCylinder= ruleCylinder EOF )
            // InternalKinematicsParser.g:1682:2: iv_ruleCylinder= ruleCylinder EOF
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
    // InternalKinematicsParser.g:1688:1: ruleCylinder returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN otherlv_1= Length ( (lv_length_2_0= ruleDouble0 ) ) otherlv_3= Radius ( (lv_radius_4_0= ruleDouble0 ) ) this_END_5= RULE_END ) ;
    public final EObject ruleCylinder() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_END_5=null;
        AntlrDatatypeRuleToken lv_length_2_0 = null;

        AntlrDatatypeRuleToken lv_radius_4_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:1694:2: ( (this_BEGIN_0= RULE_BEGIN otherlv_1= Length ( (lv_length_2_0= ruleDouble0 ) ) otherlv_3= Radius ( (lv_radius_4_0= ruleDouble0 ) ) this_END_5= RULE_END ) )
            // InternalKinematicsParser.g:1695:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Length ( (lv_length_2_0= ruleDouble0 ) ) otherlv_3= Radius ( (lv_radius_4_0= ruleDouble0 ) ) this_END_5= RULE_END )
            {
            // InternalKinematicsParser.g:1695:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Length ( (lv_length_2_0= ruleDouble0 ) ) otherlv_3= Radius ( (lv_radius_4_0= ruleDouble0 ) ) this_END_5= RULE_END )
            // InternalKinematicsParser.g:1696:3: this_BEGIN_0= RULE_BEGIN otherlv_1= Length ( (lv_length_2_0= ruleDouble0 ) ) otherlv_3= Radius ( (lv_radius_4_0= ruleDouble0 ) ) this_END_5= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_50); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getCylinderAccess().getBEGINTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,Length,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getCylinderAccess().getLengthKeyword_1());
            		
            // InternalKinematicsParser.g:1704:3: ( (lv_length_2_0= ruleDouble0 ) )
            // InternalKinematicsParser.g:1705:4: (lv_length_2_0= ruleDouble0 )
            {
            // InternalKinematicsParser.g:1705:4: (lv_length_2_0= ruleDouble0 )
            // InternalKinematicsParser.g:1706:5: lv_length_2_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getCylinderAccess().getLengthDouble0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_51);
            lv_length_2_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCylinderRule());
            					}
            					set(
            						current,
            						"length",
            						lv_length_2_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,Radius,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getCylinderAccess().getRadiusKeyword_3());
            		
            // InternalKinematicsParser.g:1727:3: ( (lv_radius_4_0= ruleDouble0 ) )
            // InternalKinematicsParser.g:1728:4: (lv_radius_4_0= ruleDouble0 )
            {
            // InternalKinematicsParser.g:1728:4: (lv_radius_4_0= ruleDouble0 )
            // InternalKinematicsParser.g:1729:5: lv_radius_4_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getCylinderAccess().getRadiusDouble0ParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_radius_4_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCylinderRule());
            					}
            					set(
            						current,
            						"radius",
            						lv_radius_4_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_5, grammarAccess.getCylinderAccess().getENDTerminalRuleCall_5());
            		

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
    // InternalKinematicsParser.g:1754:1: entryRuleSphere returns [EObject current=null] : iv_ruleSphere= ruleSphere EOF ;
    public final EObject entryRuleSphere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSphere = null;


        try {
            // InternalKinematicsParser.g:1754:47: (iv_ruleSphere= ruleSphere EOF )
            // InternalKinematicsParser.g:1755:2: iv_ruleSphere= ruleSphere EOF
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
    // InternalKinematicsParser.g:1761:1: ruleSphere returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN otherlv_1= Radius ( (lv_radius_2_0= ruleDouble0 ) ) this_END_3= RULE_END ) ;
    public final EObject ruleSphere() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token otherlv_1=null;
        Token this_END_3=null;
        AntlrDatatypeRuleToken lv_radius_2_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:1767:2: ( (this_BEGIN_0= RULE_BEGIN otherlv_1= Radius ( (lv_radius_2_0= ruleDouble0 ) ) this_END_3= RULE_END ) )
            // InternalKinematicsParser.g:1768:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Radius ( (lv_radius_2_0= ruleDouble0 ) ) this_END_3= RULE_END )
            {
            // InternalKinematicsParser.g:1768:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Radius ( (lv_radius_2_0= ruleDouble0 ) ) this_END_3= RULE_END )
            // InternalKinematicsParser.g:1769:3: this_BEGIN_0= RULE_BEGIN otherlv_1= Radius ( (lv_radius_2_0= ruleDouble0 ) ) this_END_3= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_51); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getSphereAccess().getBEGINTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,Radius,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getSphereAccess().getRadiusKeyword_1());
            		
            // InternalKinematicsParser.g:1777:3: ( (lv_radius_2_0= ruleDouble0 ) )
            // InternalKinematicsParser.g:1778:4: (lv_radius_2_0= ruleDouble0 )
            {
            // InternalKinematicsParser.g:1778:4: (lv_radius_2_0= ruleDouble0 )
            // InternalKinematicsParser.g:1779:5: lv_radius_2_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getSphereAccess().getRadiusDouble0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_radius_2_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSphereRule());
            					}
            					set(
            						current,
            						"radius",
            						lv_radius_2_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_3, grammarAccess.getSphereAccess().getENDTerminalRuleCall_3());
            		

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
    // InternalKinematicsParser.g:1804:1: entryRuleMesh returns [EObject current=null] : iv_ruleMesh= ruleMesh EOF ;
    public final EObject entryRuleMesh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMesh = null;


        try {
            // InternalKinematicsParser.g:1804:45: (iv_ruleMesh= ruleMesh EOF )
            // InternalKinematicsParser.g:1805:2: iv_ruleMesh= ruleMesh EOF
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
    // InternalKinematicsParser.g:1811:1: ruleMesh returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN otherlv_1= Filename ( (lv_filename_2_0= ruleEString ) ) (otherlv_3= Scale ( (lv_scale_4_0= ruleEString ) ) )? this_END_5= RULE_END ) ;
    public final EObject ruleMesh() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_END_5=null;
        AntlrDatatypeRuleToken lv_filename_2_0 = null;

        AntlrDatatypeRuleToken lv_scale_4_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:1817:2: ( (this_BEGIN_0= RULE_BEGIN otherlv_1= Filename ( (lv_filename_2_0= ruleEString ) ) (otherlv_3= Scale ( (lv_scale_4_0= ruleEString ) ) )? this_END_5= RULE_END ) )
            // InternalKinematicsParser.g:1818:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Filename ( (lv_filename_2_0= ruleEString ) ) (otherlv_3= Scale ( (lv_scale_4_0= ruleEString ) ) )? this_END_5= RULE_END )
            {
            // InternalKinematicsParser.g:1818:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Filename ( (lv_filename_2_0= ruleEString ) ) (otherlv_3= Scale ( (lv_scale_4_0= ruleEString ) ) )? this_END_5= RULE_END )
            // InternalKinematicsParser.g:1819:3: this_BEGIN_0= RULE_BEGIN otherlv_1= Filename ( (lv_filename_2_0= ruleEString ) ) (otherlv_3= Scale ( (lv_scale_4_0= ruleEString ) ) )? this_END_5= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_52); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getMeshAccess().getBEGINTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,Filename,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMeshAccess().getFilenameKeyword_1());
            		
            // InternalKinematicsParser.g:1827:3: ( (lv_filename_2_0= ruleEString ) )
            // InternalKinematicsParser.g:1828:4: (lv_filename_2_0= ruleEString )
            {
            // InternalKinematicsParser.g:1828:4: (lv_filename_2_0= ruleEString )
            // InternalKinematicsParser.g:1829:5: lv_filename_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeshAccess().getFilenameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_53);
            lv_filename_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeshRule());
            					}
            					set(
            						current,
            						"filename",
            						lv_filename_2_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKinematicsParser.g:1846:3: (otherlv_3= Scale ( (lv_scale_4_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Scale) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalKinematicsParser.g:1847:4: otherlv_3= Scale ( (lv_scale_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,Scale,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeshAccess().getScaleKeyword_3_0());
                    			
                    // InternalKinematicsParser.g:1851:4: ( (lv_scale_4_0= ruleEString ) )
                    // InternalKinematicsParser.g:1852:5: (lv_scale_4_0= ruleEString )
                    {
                    // InternalKinematicsParser.g:1852:5: (lv_scale_4_0= ruleEString )
                    // InternalKinematicsParser.g:1853:6: lv_scale_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeshAccess().getScaleEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_scale_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeshRule());
                    						}
                    						set(
                    							current,
                    							"scale",
                    							lv_scale_4_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_5, grammarAccess.getMeshAccess().getENDTerminalRuleCall_4());
            		

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


    // $ANTLR start "entryRuleEString"
    // InternalKinematicsParser.g:1879:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalKinematicsParser.g:1879:47: (iv_ruleEString= ruleEString EOF )
            // InternalKinematicsParser.g:1880:2: iv_ruleEString= ruleEString EOF
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
    // InternalKinematicsParser.g:1886:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalKinematicsParser.g:1892:2: (this_STRING_0= RULE_STRING )
            // InternalKinematicsParser.g:1893:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall());
            	

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


    // $ANTLR start "entryRuleDouble0"
    // InternalKinematicsParser.g:1903:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalKinematicsParser.g:1903:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalKinematicsParser.g:1904:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalKinematicsParser.g:1910:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalKinematicsParser.g:1916:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalKinematicsParser.g:1917:2: this_DOUBLE_0= RULE_DOUBLE
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


    // $ANTLR start "ruleParameterType"
    // InternalKinematicsParser.g:1927:1: ruleParameterType returns [Enumerator current=null] : ( (enumLiteral_0= DigitZero ) | (enumLiteral_1= DigitOne ) | (enumLiteral_2= DigitTwo ) ) ;
    public final Enumerator ruleParameterType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalKinematicsParser.g:1933:2: ( ( (enumLiteral_0= DigitZero ) | (enumLiteral_1= DigitOne ) | (enumLiteral_2= DigitTwo ) ) )
            // InternalKinematicsParser.g:1934:2: ( (enumLiteral_0= DigitZero ) | (enumLiteral_1= DigitOne ) | (enumLiteral_2= DigitTwo ) )
            {
            // InternalKinematicsParser.g:1934:2: ( (enumLiteral_0= DigitZero ) | (enumLiteral_1= DigitOne ) | (enumLiteral_2= DigitTwo ) )
            int alt40=3;
            switch ( input.LA(1) ) {
            case DigitZero:
                {
                alt40=1;
                }
                break;
            case DigitOne:
                {
                alt40=2;
                }
                break;
            case DigitTwo:
                {
                alt40=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalKinematicsParser.g:1935:3: (enumLiteral_0= DigitZero )
                    {
                    // InternalKinematicsParser.g:1935:3: (enumLiteral_0= DigitZero )
                    // InternalKinematicsParser.g:1936:4: enumLiteral_0= DigitZero
                    {
                    enumLiteral_0=(Token)match(input,DigitZero,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getLinkEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getParameterTypeAccess().getLinkEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalKinematicsParser.g:1943:3: (enumLiteral_1= DigitOne )
                    {
                    // InternalKinematicsParser.g:1943:3: (enumLiteral_1= DigitOne )
                    // InternalKinematicsParser.g:1944:4: enumLiteral_1= DigitOne
                    {
                    enumLiteral_1=(Token)match(input,DigitOne,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getStringEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getParameterTypeAccess().getStringEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalKinematicsParser.g:1951:3: (enumLiteral_2= DigitTwo )
                    {
                    // InternalKinematicsParser.g:1951:3: (enumLiteral_2= DigitTwo )
                    // InternalKinematicsParser.g:1952:4: enumLiteral_2= DigitTwo
                    {
                    enumLiteral_2=(Token)match(input,DigitTwo,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getPoseEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getParameterTypeAccess().getPoseEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleParameterType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0200000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0200000041000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0200400041000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0200400001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0200000800002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0200000800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0200000022000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0200000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0200000000200440L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0200000000200040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0200000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0200280000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0200200000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0200000014004800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0200000014000800L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0200000010000800L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0200000000000800L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0200000080021000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0200000080001000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0200000000001000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000020200L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x020007E000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x020007C000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0200078000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0200070000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0200060000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0200040000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0200001100100080L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0200000100100080L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0200000100100000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0200000100000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0200000008000000L});

}