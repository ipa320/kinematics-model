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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MacroCalls", "Parameters", "Collision", "Cylinder", "Filename", "Geometry", "Inertial", "Velocity", "Inertia", "Version", "LinkRef", "Default", "Effort", "Joints", "Length", "Macros", "Origin", "Parent", "Radius", "Sphere", "Visual", "AnyURI", "String", "Child", "Limit", "Links", "Lower", "Robot", "Scale", "Upper", "Axis", "Body", "Mass", "Mesh", "Name", "Type", "Value", "Pose", "Box", "Ixx", "Ixy", "Ixz", "Iyy", "Iyz", "Izz", "Rpy", "Size", "Xyz", "HyphenMinus", "Colon", "RULE_DIGIT", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_JOINTTYPE", "RULE_BEGIN", "RULE_END", "RULE_SL_COMMENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Origin=20;
    public static final int Lower=30;
    public static final int RULE_BEGIN=59;
    public static final int Size=50;
    public static final int Effort=16;
    public static final int Ixx=43;
    public static final int RULE_BOOLEAN=55;
    public static final int Ixz=45;
    public static final int String=26;
    public static final int Ixy=44;
    public static final int Name=38;
    public static final int Sphere=23;
    public static final int Version=13;
    public static final int Pose=41;
    public static final int Child=27;
    public static final int Parameters=5;
    public static final int RULE_ID=62;
    public static final int Iyy=46;
    public static final int Filename=8;
    public static final int Mesh=37;
    public static final int RULE_DIGIT=54;
    public static final int Box=42;
    public static final int Iyz=47;
    public static final int Macros=19;
    public static final int Mass=36;
    public static final int AnyURI=25;
    public static final int RULE_INT=63;
    public static final int Value=40;
    public static final int RULE_ML_COMMENT=65;
    public static final int Inertia=12;
    public static final int Radius=22;
    public static final int RULE_END=60;
    public static final int Parent=21;
    public static final int Izz=48;
    public static final int RULE_STRING=64;
    public static final int RULE_SL_COMMENT=61;
    public static final int HyphenMinus=52;
    public static final int RULE_DOUBLE=57;
    public static final int Rpy=49;
    public static final int RULE_JOINTTYPE=58;
    public static final int Colon=53;
    public static final int RULE_DECINT=56;
    public static final int EOF=-1;
    public static final int Joints=17;
    public static final int Body=35;
    public static final int Visual=24;
    public static final int Axis=34;
    public static final int LinkRef=14;
    public static final int Upper=33;
    public static final int RULE_WS=66;
    public static final int Collision=6;
    public static final int Scale=32;
    public static final int Inertial=10;
    public static final int RULE_ANY_OTHER=67;
    public static final int Velocity=11;
    public static final int Default=15;
    public static final int MacroCalls=4;
    public static final int Geometry=9;
    public static final int Cylinder=7;
    public static final int Type=39;
    public static final int Length=18;
    public static final int Xyz=51;
    public static final int Links=29;
    public static final int Limit=28;
    public static final int Robot=31;

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
    // InternalKinematicsParser.g:57:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalKinematicsParser.g:57:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalKinematicsParser.g:58:2: iv_ruleRobot= ruleRobot EOF
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
    // InternalKinematicsParser.g:64:1: ruleRobot returns [EObject current=null] : ( () otherlv_1= Robot this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= Version ( (lv_version_6_0= ruleDouble0 ) ) )? (otherlv_7= Macros ( (lv_macro_8_0= ruleMacro ) )* )? (otherlv_9= MacroCalls ( (lv_macroCall_10_0= ruleMacroCall ) )* )? (otherlv_11= Body this_BEGIN_12= RULE_BEGIN ( (lv_body_13_0= ruleBody ) ) this_END_14= RULE_END )? this_END_15= RULE_END ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token this_BEGIN_12=null;
        Token this_END_14=null;
        Token this_END_15=null;
        AntlrDatatypeRuleToken lv_version_6_0 = null;

        EObject lv_macro_8_0 = null;

        EObject lv_macroCall_10_0 = null;

        EObject lv_body_13_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:70:2: ( ( () otherlv_1= Robot this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= Version ( (lv_version_6_0= ruleDouble0 ) ) )? (otherlv_7= Macros ( (lv_macro_8_0= ruleMacro ) )* )? (otherlv_9= MacroCalls ( (lv_macroCall_10_0= ruleMacroCall ) )* )? (otherlv_11= Body this_BEGIN_12= RULE_BEGIN ( (lv_body_13_0= ruleBody ) ) this_END_14= RULE_END )? this_END_15= RULE_END ) )
            // InternalKinematicsParser.g:71:2: ( () otherlv_1= Robot this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= Version ( (lv_version_6_0= ruleDouble0 ) ) )? (otherlv_7= Macros ( (lv_macro_8_0= ruleMacro ) )* )? (otherlv_9= MacroCalls ( (lv_macroCall_10_0= ruleMacroCall ) )* )? (otherlv_11= Body this_BEGIN_12= RULE_BEGIN ( (lv_body_13_0= ruleBody ) ) this_END_14= RULE_END )? this_END_15= RULE_END )
            {
            // InternalKinematicsParser.g:71:2: ( () otherlv_1= Robot this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= Version ( (lv_version_6_0= ruleDouble0 ) ) )? (otherlv_7= Macros ( (lv_macro_8_0= ruleMacro ) )* )? (otherlv_9= MacroCalls ( (lv_macroCall_10_0= ruleMacroCall ) )* )? (otherlv_11= Body this_BEGIN_12= RULE_BEGIN ( (lv_body_13_0= ruleBody ) ) this_END_14= RULE_END )? this_END_15= RULE_END )
            // InternalKinematicsParser.g:72:3: () otherlv_1= Robot this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= Version ( (lv_version_6_0= ruleDouble0 ) ) )? (otherlv_7= Macros ( (lv_macro_8_0= ruleMacro ) )* )? (otherlv_9= MacroCalls ( (lv_macroCall_10_0= ruleMacroCall ) )* )? (otherlv_11= Body this_BEGIN_12= RULE_BEGIN ( (lv_body_13_0= ruleBody ) ) this_END_14= RULE_END )? this_END_15= RULE_END
            {
            // InternalKinematicsParser.g:72:3: ()
            // InternalKinematicsParser.g:73:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRobotAccess().getRobotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Robot,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotAccess().getRobotKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_4); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getRobotAccess().getBEGINTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,Name,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRobotAccess().getNameKeyword_3());
            		
            // InternalKinematicsParser.g:91:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalKinematicsParser.g:92:4: (lv_name_4_0= RULE_ID )
            {
            // InternalKinematicsParser.g:92:4: (lv_name_4_0= RULE_ID )
            // InternalKinematicsParser.g:93:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_4_0, grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalKinematicsParser.g:109:3: (otherlv_5= Version ( (lv_version_6_0= ruleDouble0 ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Version) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalKinematicsParser.g:110:4: otherlv_5= Version ( (lv_version_6_0= ruleDouble0 ) )
                    {
                    otherlv_5=(Token)match(input,Version,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getRobotAccess().getVersionKeyword_5_0());
                    			
                    // InternalKinematicsParser.g:114:4: ( (lv_version_6_0= ruleDouble0 ) )
                    // InternalKinematicsParser.g:115:5: (lv_version_6_0= ruleDouble0 )
                    {
                    // InternalKinematicsParser.g:115:5: (lv_version_6_0= ruleDouble0 )
                    // InternalKinematicsParser.g:116:6: lv_version_6_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getVersionDouble0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_version_6_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    						}
                    						set(
                    							current,
                    							"version",
                    							lv_version_6_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:134:3: (otherlv_7= Macros ( (lv_macro_8_0= ruleMacro ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Macros) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKinematicsParser.g:135:4: otherlv_7= Macros ( (lv_macro_8_0= ruleMacro ) )*
                    {
                    otherlv_7=(Token)match(input,Macros,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getRobotAccess().getMacrosKeyword_6_0());
                    			
                    // InternalKinematicsParser.g:139:4: ( (lv_macro_8_0= ruleMacro ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==HyphenMinus) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalKinematicsParser.g:140:5: (lv_macro_8_0= ruleMacro )
                    	    {
                    	    // InternalKinematicsParser.g:140:5: (lv_macro_8_0= ruleMacro )
                    	    // InternalKinematicsParser.g:141:6: lv_macro_8_0= ruleMacro
                    	    {

                    	    						newCompositeNode(grammarAccess.getRobotAccess().getMacroMacroParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_macro_8_0=ruleMacro();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"macro",
                    	    							lv_macro_8_0,
                    	    							"de.fraunhofer.ipa.kinematics.Kinematics.Macro");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalKinematicsParser.g:159:3: (otherlv_9= MacroCalls ( (lv_macroCall_10_0= ruleMacroCall ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==MacroCalls) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKinematicsParser.g:160:4: otherlv_9= MacroCalls ( (lv_macroCall_10_0= ruleMacroCall ) )*
                    {
                    otherlv_9=(Token)match(input,MacroCalls,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getRobotAccess().getMacroCallsKeyword_7_0());
                    			
                    // InternalKinematicsParser.g:164:4: ( (lv_macroCall_10_0= ruleMacroCall ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==HyphenMinus) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalKinematicsParser.g:165:5: (lv_macroCall_10_0= ruleMacroCall )
                    	    {
                    	    // InternalKinematicsParser.g:165:5: (lv_macroCall_10_0= ruleMacroCall )
                    	    // InternalKinematicsParser.g:166:6: lv_macroCall_10_0= ruleMacroCall
                    	    {

                    	    						newCompositeNode(grammarAccess.getRobotAccess().getMacroCallMacroCallParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_macroCall_10_0=ruleMacroCall();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"macroCall",
                    	    							lv_macroCall_10_0,
                    	    							"de.fraunhofer.ipa.kinematics.Kinematics.MacroCall");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalKinematicsParser.g:184:3: (otherlv_11= Body this_BEGIN_12= RULE_BEGIN ( (lv_body_13_0= ruleBody ) ) this_END_14= RULE_END )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Body) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKinematicsParser.g:185:4: otherlv_11= Body this_BEGIN_12= RULE_BEGIN ( (lv_body_13_0= ruleBody ) ) this_END_14= RULE_END
                    {
                    otherlv_11=(Token)match(input,Body,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getRobotAccess().getBodyKeyword_8_0());
                    			
                    this_BEGIN_12=(Token)match(input,RULE_BEGIN,FOLLOW_11); 

                    				newLeafNode(this_BEGIN_12, grammarAccess.getRobotAccess().getBEGINTerminalRuleCall_8_1());
                    			
                    // InternalKinematicsParser.g:193:4: ( (lv_body_13_0= ruleBody ) )
                    // InternalKinematicsParser.g:194:5: (lv_body_13_0= ruleBody )
                    {
                    // InternalKinematicsParser.g:194:5: (lv_body_13_0= ruleBody )
                    // InternalKinematicsParser.g:195:6: lv_body_13_0= ruleBody
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getBodyBodyParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_body_13_0=ruleBody();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_13_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Body");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_END_14=(Token)match(input,RULE_END,FOLLOW_12); 

                    				newLeafNode(this_END_14, grammarAccess.getRobotAccess().getENDTerminalRuleCall_8_3());
                    			

                    }
                    break;

            }

            this_END_15=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_15, grammarAccess.getRobotAccess().getENDTerminalRuleCall_9());
            		

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
    // InternalKinematicsParser.g:225:1: entryRuleMacro returns [EObject current=null] : iv_ruleMacro= ruleMacro EOF ;
    public final EObject entryRuleMacro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacro = null;


        try {
            // InternalKinematicsParser.g:225:46: (iv_ruleMacro= ruleMacro EOF )
            // InternalKinematicsParser.g:226:2: iv_ruleMacro= ruleMacro EOF
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
    // InternalKinematicsParser.g:232:1: ruleMacro returns [EObject current=null] : (otherlv_0= HyphenMinus ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Parameters ( (lv_parameter_5_0= ruleParameter ) )* )? (otherlv_6= Body this_BEGIN_7= RULE_BEGIN ( (lv_body_8_0= ruleBody ) ) this_END_9= RULE_END )? this_END_10= RULE_END ) ;
    public final EObject ruleMacro() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        Token this_END_10=null;
        EObject lv_parameter_5_0 = null;

        EObject lv_body_8_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:238:2: ( (otherlv_0= HyphenMinus ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Parameters ( (lv_parameter_5_0= ruleParameter ) )* )? (otherlv_6= Body this_BEGIN_7= RULE_BEGIN ( (lv_body_8_0= ruleBody ) ) this_END_9= RULE_END )? this_END_10= RULE_END ) )
            // InternalKinematicsParser.g:239:2: (otherlv_0= HyphenMinus ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Parameters ( (lv_parameter_5_0= ruleParameter ) )* )? (otherlv_6= Body this_BEGIN_7= RULE_BEGIN ( (lv_body_8_0= ruleBody ) ) this_END_9= RULE_END )? this_END_10= RULE_END )
            {
            // InternalKinematicsParser.g:239:2: (otherlv_0= HyphenMinus ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Parameters ( (lv_parameter_5_0= ruleParameter ) )* )? (otherlv_6= Body this_BEGIN_7= RULE_BEGIN ( (lv_body_8_0= ruleBody ) ) this_END_9= RULE_END )? this_END_10= RULE_END )
            // InternalKinematicsParser.g:240:3: otherlv_0= HyphenMinus ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Parameters ( (lv_parameter_5_0= ruleParameter ) )* )? (otherlv_6= Body this_BEGIN_7= RULE_BEGIN ( (lv_body_8_0= ruleBody ) ) this_END_9= RULE_END )? this_END_10= RULE_END
            {
            otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMacroAccess().getHyphenMinusKeyword_0());
            		
            // InternalKinematicsParser.g:244:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalKinematicsParser.g:245:4: (lv_name_1_0= RULE_ID )
            {
            // InternalKinematicsParser.g:245:4: (lv_name_1_0= RULE_ID )
            // InternalKinematicsParser.g:246:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMacroAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMacroRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getMacroAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getMacroAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalKinematicsParser.g:270:3: (otherlv_4= Parameters ( (lv_parameter_5_0= ruleParameter ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Parameters) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalKinematicsParser.g:271:4: otherlv_4= Parameters ( (lv_parameter_5_0= ruleParameter ) )*
                    {
                    otherlv_4=(Token)match(input,Parameters,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getMacroAccess().getParametersKeyword_4_0());
                    			
                    // InternalKinematicsParser.g:275:4: ( (lv_parameter_5_0= ruleParameter ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==HyphenMinus) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalKinematicsParser.g:276:5: (lv_parameter_5_0= ruleParameter )
                    	    {
                    	    // InternalKinematicsParser.g:276:5: (lv_parameter_5_0= ruleParameter )
                    	    // InternalKinematicsParser.g:277:6: lv_parameter_5_0= ruleParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getMacroAccess().getParameterParameterParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_parameter_5_0=ruleParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMacroRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parameter",
                    	    							lv_parameter_5_0,
                    	    							"de.fraunhofer.ipa.kinematics.Kinematics.Parameter");
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

            // InternalKinematicsParser.g:295:3: (otherlv_6= Body this_BEGIN_7= RULE_BEGIN ( (lv_body_8_0= ruleBody ) ) this_END_9= RULE_END )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Body) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKinematicsParser.g:296:4: otherlv_6= Body this_BEGIN_7= RULE_BEGIN ( (lv_body_8_0= ruleBody ) ) this_END_9= RULE_END
                    {
                    otherlv_6=(Token)match(input,Body,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getMacroAccess().getBodyKeyword_5_0());
                    			
                    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_11); 

                    				newLeafNode(this_BEGIN_7, grammarAccess.getMacroAccess().getBEGINTerminalRuleCall_5_1());
                    			
                    // InternalKinematicsParser.g:304:4: ( (lv_body_8_0= ruleBody ) )
                    // InternalKinematicsParser.g:305:5: (lv_body_8_0= ruleBody )
                    {
                    // InternalKinematicsParser.g:305:5: (lv_body_8_0= ruleBody )
                    // InternalKinematicsParser.g:306:6: lv_body_8_0= ruleBody
                    {

                    						newCompositeNode(grammarAccess.getMacroAccess().getBodyBodyParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_body_8_0=ruleBody();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMacroRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_8_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Body");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_END_9=(Token)match(input,RULE_END,FOLLOW_12); 

                    				newLeafNode(this_END_9, grammarAccess.getMacroAccess().getENDTerminalRuleCall_5_3());
                    			

                    }
                    break;

            }

            this_END_10=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_10, grammarAccess.getMacroAccess().getENDTerminalRuleCall_6());
            		

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
    // InternalKinematicsParser.g:336:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalKinematicsParser.g:336:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalKinematicsParser.g:337:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalKinematicsParser.g:343:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= HyphenMinus ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN otherlv_5= Type ( (lv_type_6_0= ruleParameterType ) ) (otherlv_7= Default ( (lv_value_8_0= ruleParameterValue ) ) )? this_END_9= RULE_END ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_END_9=null;
        EObject lv_type_6_0 = null;

        EObject lv_value_8_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:349:2: ( ( () otherlv_1= HyphenMinus ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN otherlv_5= Type ( (lv_type_6_0= ruleParameterType ) ) (otherlv_7= Default ( (lv_value_8_0= ruleParameterValue ) ) )? this_END_9= RULE_END ) )
            // InternalKinematicsParser.g:350:2: ( () otherlv_1= HyphenMinus ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN otherlv_5= Type ( (lv_type_6_0= ruleParameterType ) ) (otherlv_7= Default ( (lv_value_8_0= ruleParameterValue ) ) )? this_END_9= RULE_END )
            {
            // InternalKinematicsParser.g:350:2: ( () otherlv_1= HyphenMinus ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN otherlv_5= Type ( (lv_type_6_0= ruleParameterType ) ) (otherlv_7= Default ( (lv_value_8_0= ruleParameterValue ) ) )? this_END_9= RULE_END )
            // InternalKinematicsParser.g:351:3: () otherlv_1= HyphenMinus ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN otherlv_5= Type ( (lv_type_6_0= ruleParameterType ) ) (otherlv_7= Default ( (lv_value_8_0= ruleParameterValue ) ) )? this_END_9= RULE_END
            {
            // InternalKinematicsParser.g:351:3: ()
            // InternalKinematicsParser.g:352:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,HyphenMinus,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getHyphenMinusKeyword_1());
            		
            // InternalKinematicsParser.g:362:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalKinematicsParser.g:363:4: (lv_name_2_0= RULE_ID )
            {
            // InternalKinematicsParser.g:363:4: (lv_name_2_0= RULE_ID )
            // InternalKinematicsParser.g:364:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_2_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,Colon,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getColonKeyword_3());
            		
            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            			newLeafNode(this_BEGIN_4, grammarAccess.getParameterAccess().getBEGINTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,Type,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getTypeKeyword_5());
            		
            // InternalKinematicsParser.g:392:3: ( (lv_type_6_0= ruleParameterType ) )
            // InternalKinematicsParser.g:393:4: (lv_type_6_0= ruleParameterType )
            {
            // InternalKinematicsParser.g:393:4: (lv_type_6_0= ruleParameterType )
            // InternalKinematicsParser.g:394:5: lv_type_6_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeParameterTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalKinematicsParser.g:411:3: (otherlv_7= Default ( (lv_value_8_0= ruleParameterValue ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Default) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalKinematicsParser.g:412:4: otherlv_7= Default ( (lv_value_8_0= ruleParameterValue ) )
                    {
                    otherlv_7=(Token)match(input,Default,FOLLOW_18); 

                    				newLeafNode(otherlv_7, grammarAccess.getParameterAccess().getDefaultKeyword_7_0());
                    			
                    // InternalKinematicsParser.g:416:4: ( (lv_value_8_0= ruleParameterValue ) )
                    // InternalKinematicsParser.g:417:5: (lv_value_8_0= ruleParameterValue )
                    {
                    // InternalKinematicsParser.g:417:5: (lv_value_8_0= ruleParameterValue )
                    // InternalKinematicsParser.g:418:6: lv_value_8_0= ruleParameterValue
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getValueParameterValueParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_value_8_0=ruleParameterValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_8_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.ParameterValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_9=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_9, grammarAccess.getParameterAccess().getENDTerminalRuleCall_8());
            		

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


    // $ANTLR start "entryRuleParameterValue"
    // InternalKinematicsParser.g:444:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalKinematicsParser.g:444:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalKinematicsParser.g:445:2: iv_ruleParameterValue= ruleParameterValue EOF
            {
             newCompositeNode(grammarAccess.getParameterValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterValue=ruleParameterValue();

            state._fsp--;

             current =iv_ruleParameterValue; 
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
    // $ANTLR end "entryRuleParameterValue"


    // $ANTLR start "ruleParameterValue"
    // InternalKinematicsParser.g:451:1: ruleParameterValue returns [EObject current=null] : ( ( (lv_value_0_0= RULE_ID ) ) | this_Pose_1= rulePose | this_LinkRef_2= ruleLinkRef ) ;
    public final EObject ruleParameterValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        EObject this_Pose_1 = null;

        EObject this_LinkRef_2 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:457:2: ( ( ( (lv_value_0_0= RULE_ID ) ) | this_Pose_1= rulePose | this_LinkRef_2= ruleLinkRef ) )
            // InternalKinematicsParser.g:458:2: ( ( (lv_value_0_0= RULE_ID ) ) | this_Pose_1= rulePose | this_LinkRef_2= ruleLinkRef )
            {
            // InternalKinematicsParser.g:458:2: ( ( (lv_value_0_0= RULE_ID ) ) | this_Pose_1= rulePose | this_LinkRef_2= ruleLinkRef )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt11=1;
                }
                break;
            case RULE_BEGIN:
                {
                alt11=2;
                }
                break;
            case RULE_STRING:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalKinematicsParser.g:459:3: ( (lv_value_0_0= RULE_ID ) )
                    {
                    // InternalKinematicsParser.g:459:3: ( (lv_value_0_0= RULE_ID ) )
                    // InternalKinematicsParser.g:460:4: (lv_value_0_0= RULE_ID )
                    {
                    // InternalKinematicsParser.g:460:4: (lv_value_0_0= RULE_ID )
                    // InternalKinematicsParser.g:461:5: lv_value_0_0= RULE_ID
                    {
                    lv_value_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_value_0_0, grammarAccess.getParameterValueAccess().getValueIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKinematicsParser.g:478:3: this_Pose_1= rulePose
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getPoseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Pose_1=rulePose();

                    state._fsp--;


                    			current = this_Pose_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalKinematicsParser.g:487:3: this_LinkRef_2= ruleLinkRef
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getLinkRefParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LinkRef_2=ruleLinkRef();

                    state._fsp--;


                    			current = this_LinkRef_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleParameterValue"


    // $ANTLR start "entryRuleLinkRef"
    // InternalKinematicsParser.g:499:1: entryRuleLinkRef returns [EObject current=null] : iv_ruleLinkRef= ruleLinkRef EOF ;
    public final EObject entryRuleLinkRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkRef = null;


        try {
            // InternalKinematicsParser.g:499:48: (iv_ruleLinkRef= ruleLinkRef EOF )
            // InternalKinematicsParser.g:500:2: iv_ruleLinkRef= ruleLinkRef EOF
            {
             newCompositeNode(grammarAccess.getLinkRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinkRef=ruleLinkRef();

            state._fsp--;

             current =iv_ruleLinkRef; 
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
    // $ANTLR end "entryRuleLinkRef"


    // $ANTLR start "ruleLinkRef"
    // InternalKinematicsParser.g:506:1: ruleLinkRef returns [EObject current=null] : ( (otherlv_0= RULE_STRING ) ) ;
    public final EObject ruleLinkRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalKinematicsParser.g:512:2: ( ( (otherlv_0= RULE_STRING ) ) )
            // InternalKinematicsParser.g:513:2: ( (otherlv_0= RULE_STRING ) )
            {
            // InternalKinematicsParser.g:513:2: ( (otherlv_0= RULE_STRING ) )
            // InternalKinematicsParser.g:514:3: (otherlv_0= RULE_STRING )
            {
            // InternalKinematicsParser.g:514:3: (otherlv_0= RULE_STRING )
            // InternalKinematicsParser.g:515:4: otherlv_0= RULE_STRING
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLinkRefRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getLinkRefAccess().getRefLinkCrossReference_0());
            			

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
    // $ANTLR end "ruleLinkRef"


    // $ANTLR start "entryRuleParameterString"
    // InternalKinematicsParser.g:529:1: entryRuleParameterString returns [EObject current=null] : iv_ruleParameterString= ruleParameterString EOF ;
    public final EObject entryRuleParameterString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterString = null;


        try {
            // InternalKinematicsParser.g:529:56: (iv_ruleParameterString= ruleParameterString EOF )
            // InternalKinematicsParser.g:530:2: iv_ruleParameterString= ruleParameterString EOF
            {
             newCompositeNode(grammarAccess.getParameterStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterString=ruleParameterString();

            state._fsp--;

             current =iv_ruleParameterString; 
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
    // $ANTLR end "entryRuleParameterString"


    // $ANTLR start "ruleParameterString"
    // InternalKinematicsParser.g:536:1: ruleParameterString returns [EObject current=null] : ( () ( (otherlv_1= RULE_STRING ) )? ( (lv_value_2_0= RULE_ID ) )? ) ;
    public final EObject ruleParameterString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalKinematicsParser.g:542:2: ( ( () ( (otherlv_1= RULE_STRING ) )? ( (lv_value_2_0= RULE_ID ) )? ) )
            // InternalKinematicsParser.g:543:2: ( () ( (otherlv_1= RULE_STRING ) )? ( (lv_value_2_0= RULE_ID ) )? )
            {
            // InternalKinematicsParser.g:543:2: ( () ( (otherlv_1= RULE_STRING ) )? ( (lv_value_2_0= RULE_ID ) )? )
            // InternalKinematicsParser.g:544:3: () ( (otherlv_1= RULE_STRING ) )? ( (lv_value_2_0= RULE_ID ) )?
            {
            // InternalKinematicsParser.g:544:3: ()
            // InternalKinematicsParser.g:545:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStringAccess().getParameterStringAction_0(),
            					current);
            			

            }

            // InternalKinematicsParser.g:551:3: ( (otherlv_1= RULE_STRING ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKinematicsParser.g:552:4: (otherlv_1= RULE_STRING )
                    {
                    // InternalKinematicsParser.g:552:4: (otherlv_1= RULE_STRING )
                    // InternalKinematicsParser.g:553:5: otherlv_1= RULE_STRING
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterStringRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    					newLeafNode(otherlv_1, grammarAccess.getParameterStringAccess().getRefParameterCrossReference_1_0());
                    				

                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:564:3: ( (lv_value_2_0= RULE_ID ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalKinematicsParser.g:565:4: (lv_value_2_0= RULE_ID )
                    {
                    // InternalKinematicsParser.g:565:4: (lv_value_2_0= RULE_ID )
                    // InternalKinematicsParser.g:566:5: lv_value_2_0= RULE_ID
                    {
                    lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_value_2_0, grammarAccess.getParameterStringAccess().getValueIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterStringRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


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
    // $ANTLR end "ruleParameterString"


    // $ANTLR start "entryRuleParameterPose"
    // InternalKinematicsParser.g:586:1: entryRuleParameterPose returns [EObject current=null] : iv_ruleParameterPose= ruleParameterPose EOF ;
    public final EObject entryRuleParameterPose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterPose = null;


        try {
            // InternalKinematicsParser.g:586:54: (iv_ruleParameterPose= ruleParameterPose EOF )
            // InternalKinematicsParser.g:587:2: iv_ruleParameterPose= ruleParameterPose EOF
            {
             newCompositeNode(grammarAccess.getParameterPoseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterPose=ruleParameterPose();

            state._fsp--;

             current =iv_ruleParameterPose; 
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
    // $ANTLR end "entryRuleParameterPose"


    // $ANTLR start "ruleParameterPose"
    // InternalKinematicsParser.g:593:1: ruleParameterPose returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_value_1_0= rulePose ) ) ) ;
    public final EObject ruleParameterPose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:599:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_value_1_0= rulePose ) ) ) )
            // InternalKinematicsParser.g:600:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_value_1_0= rulePose ) ) )
            {
            // InternalKinematicsParser.g:600:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_value_1_0= rulePose ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_BEGIN) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalKinematicsParser.g:601:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalKinematicsParser.g:601:3: ( (otherlv_0= RULE_ID ) )
                    // InternalKinematicsParser.g:602:4: (otherlv_0= RULE_ID )
                    {
                    // InternalKinematicsParser.g:602:4: (otherlv_0= RULE_ID )
                    // InternalKinematicsParser.g:603:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterPoseRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getParameterPoseAccess().getRefParameterCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKinematicsParser.g:615:3: ( (lv_value_1_0= rulePose ) )
                    {
                    // InternalKinematicsParser.g:615:3: ( (lv_value_1_0= rulePose ) )
                    // InternalKinematicsParser.g:616:4: (lv_value_1_0= rulePose )
                    {
                    // InternalKinematicsParser.g:616:4: (lv_value_1_0= rulePose )
                    // InternalKinematicsParser.g:617:5: lv_value_1_0= rulePose
                    {

                    					newCompositeNode(grammarAccess.getParameterPoseAccess().getValuePoseParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=rulePose();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParameterPoseRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_1_0,
                    						"de.fraunhofer.ipa.kinematics.Kinematics.Pose");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleParameterPose"


    // $ANTLR start "entryRuleParameterLink"
    // InternalKinematicsParser.g:638:1: entryRuleParameterLink returns [EObject current=null] : iv_ruleParameterLink= ruleParameterLink EOF ;
    public final EObject entryRuleParameterLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterLink = null;


        try {
            // InternalKinematicsParser.g:638:54: (iv_ruleParameterLink= ruleParameterLink EOF )
            // InternalKinematicsParser.g:639:2: iv_ruleParameterLink= ruleParameterLink EOF
            {
             newCompositeNode(grammarAccess.getParameterLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterLink=ruleParameterLink();

            state._fsp--;

             current =iv_ruleParameterLink; 
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
    // $ANTLR end "entryRuleParameterLink"


    // $ANTLR start "ruleParameterLink"
    // InternalKinematicsParser.g:645:1: ruleParameterLink returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (otherlv_1= RULE_STRING ) ) ) ;
    public final EObject ruleParameterLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKinematicsParser.g:651:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (otherlv_1= RULE_STRING ) ) ) )
            // InternalKinematicsParser.g:652:2: ( ( (otherlv_0= RULE_ID ) ) | ( (otherlv_1= RULE_STRING ) ) )
            {
            // InternalKinematicsParser.g:652:2: ( ( (otherlv_0= RULE_ID ) ) | ( (otherlv_1= RULE_STRING ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_STRING) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalKinematicsParser.g:653:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalKinematicsParser.g:653:3: ( (otherlv_0= RULE_ID ) )
                    // InternalKinematicsParser.g:654:4: (otherlv_0= RULE_ID )
                    {
                    // InternalKinematicsParser.g:654:4: (otherlv_0= RULE_ID )
                    // InternalKinematicsParser.g:655:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterLinkRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getParameterLinkAccess().getParamParameterCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKinematicsParser.g:667:3: ( (otherlv_1= RULE_STRING ) )
                    {
                    // InternalKinematicsParser.g:667:3: ( (otherlv_1= RULE_STRING ) )
                    // InternalKinematicsParser.g:668:4: (otherlv_1= RULE_STRING )
                    {
                    // InternalKinematicsParser.g:668:4: (otherlv_1= RULE_STRING )
                    // InternalKinematicsParser.g:669:5: otherlv_1= RULE_STRING
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterLinkRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(otherlv_1, grammarAccess.getParameterLinkAccess().getLinkLinkCrossReference_1_0());
                    				

                    }


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
    // $ANTLR end "ruleParameterLink"


    // $ANTLR start "entryRuleParameterType"
    // InternalKinematicsParser.g:684:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // InternalKinematicsParser.g:684:54: (iv_ruleParameterType= ruleParameterType EOF )
            // InternalKinematicsParser.g:685:2: iv_ruleParameterType= ruleParameterType EOF
            {
             newCompositeNode(grammarAccess.getParameterTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterType=ruleParameterType();

            state._fsp--;

             current =iv_ruleParameterType; 
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
    // $ANTLR end "entryRuleParameterType"


    // $ANTLR start "ruleParameterType"
    // InternalKinematicsParser.g:691:1: ruleParameterType returns [EObject current=null] : (this_ParameterStringType_0= ruleParameterStringType | this_ParameterLinkRefType_1= ruleParameterLinkRefType | this_ParameterPoseType_2= ruleParameterPoseType ) ;
    public final EObject ruleParameterType() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterStringType_0 = null;

        EObject this_ParameterLinkRefType_1 = null;

        EObject this_ParameterPoseType_2 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:697:2: ( (this_ParameterStringType_0= ruleParameterStringType | this_ParameterLinkRefType_1= ruleParameterLinkRefType | this_ParameterPoseType_2= ruleParameterPoseType ) )
            // InternalKinematicsParser.g:698:2: (this_ParameterStringType_0= ruleParameterStringType | this_ParameterLinkRefType_1= ruleParameterLinkRefType | this_ParameterPoseType_2= ruleParameterPoseType )
            {
            // InternalKinematicsParser.g:698:2: (this_ParameterStringType_0= ruleParameterStringType | this_ParameterLinkRefType_1= ruleParameterLinkRefType | this_ParameterPoseType_2= ruleParameterPoseType )
            int alt16=3;
            switch ( input.LA(1) ) {
            case String:
                {
                alt16=1;
                }
                break;
            case LinkRef:
                {
                alt16=2;
                }
                break;
            case Pose:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalKinematicsParser.g:699:3: this_ParameterStringType_0= ruleParameterStringType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterStringTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterStringType_0=ruleParameterStringType();

                    state._fsp--;


                    			current = this_ParameterStringType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKinematicsParser.g:708:3: this_ParameterLinkRefType_1= ruleParameterLinkRefType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterLinkRefTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterLinkRefType_1=ruleParameterLinkRefType();

                    state._fsp--;


                    			current = this_ParameterLinkRefType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalKinematicsParser.g:717:3: this_ParameterPoseType_2= ruleParameterPoseType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterPoseTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterPoseType_2=ruleParameterPoseType();

                    state._fsp--;


                    			current = this_ParameterPoseType_2;
                    			afterParserOrEnumRuleCall();
                    		

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


    // $ANTLR start "entryRuleParameterStringType"
    // InternalKinematicsParser.g:729:1: entryRuleParameterStringType returns [EObject current=null] : iv_ruleParameterStringType= ruleParameterStringType EOF ;
    public final EObject entryRuleParameterStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStringType = null;


        try {
            // InternalKinematicsParser.g:729:60: (iv_ruleParameterStringType= ruleParameterStringType EOF )
            // InternalKinematicsParser.g:730:2: iv_ruleParameterStringType= ruleParameterStringType EOF
            {
             newCompositeNode(grammarAccess.getParameterStringTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterStringType=ruleParameterStringType();

            state._fsp--;

             current =iv_ruleParameterStringType; 
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
    // $ANTLR end "entryRuleParameterStringType"


    // $ANTLR start "ruleParameterStringType"
    // InternalKinematicsParser.g:736:1: ruleParameterStringType returns [EObject current=null] : ( () otherlv_1= String ) ;
    public final EObject ruleParameterStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKinematicsParser.g:742:2: ( ( () otherlv_1= String ) )
            // InternalKinematicsParser.g:743:2: ( () otherlv_1= String )
            {
            // InternalKinematicsParser.g:743:2: ( () otherlv_1= String )
            // InternalKinematicsParser.g:744:3: () otherlv_1= String
            {
            // InternalKinematicsParser.g:744:3: ()
            // InternalKinematicsParser.g:745:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,String,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStringTypeAccess().getStringKeyword_1());
            		

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
    // $ANTLR end "ruleParameterStringType"


    // $ANTLR start "entryRuleParameterLinkRefType"
    // InternalKinematicsParser.g:759:1: entryRuleParameterLinkRefType returns [EObject current=null] : iv_ruleParameterLinkRefType= ruleParameterLinkRefType EOF ;
    public final EObject entryRuleParameterLinkRefType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterLinkRefType = null;


        try {
            // InternalKinematicsParser.g:759:61: (iv_ruleParameterLinkRefType= ruleParameterLinkRefType EOF )
            // InternalKinematicsParser.g:760:2: iv_ruleParameterLinkRefType= ruleParameterLinkRefType EOF
            {
             newCompositeNode(grammarAccess.getParameterLinkRefTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterLinkRefType=ruleParameterLinkRefType();

            state._fsp--;

             current =iv_ruleParameterLinkRefType; 
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
    // $ANTLR end "entryRuleParameterLinkRefType"


    // $ANTLR start "ruleParameterLinkRefType"
    // InternalKinematicsParser.g:766:1: ruleParameterLinkRefType returns [EObject current=null] : ( () otherlv_1= LinkRef ) ;
    public final EObject ruleParameterLinkRefType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKinematicsParser.g:772:2: ( ( () otherlv_1= LinkRef ) )
            // InternalKinematicsParser.g:773:2: ( () otherlv_1= LinkRef )
            {
            // InternalKinematicsParser.g:773:2: ( () otherlv_1= LinkRef )
            // InternalKinematicsParser.g:774:3: () otherlv_1= LinkRef
            {
            // InternalKinematicsParser.g:774:3: ()
            // InternalKinematicsParser.g:775:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterLinkRefTypeAccess().getParameterLinkRefTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LinkRef,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterLinkRefTypeAccess().getLinkRefKeyword_1());
            		

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
    // $ANTLR end "ruleParameterLinkRefType"


    // $ANTLR start "entryRuleParameterPoseType"
    // InternalKinematicsParser.g:789:1: entryRuleParameterPoseType returns [EObject current=null] : iv_ruleParameterPoseType= ruleParameterPoseType EOF ;
    public final EObject entryRuleParameterPoseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterPoseType = null;


        try {
            // InternalKinematicsParser.g:789:58: (iv_ruleParameterPoseType= ruleParameterPoseType EOF )
            // InternalKinematicsParser.g:790:2: iv_ruleParameterPoseType= ruleParameterPoseType EOF
            {
             newCompositeNode(grammarAccess.getParameterPoseTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterPoseType=ruleParameterPoseType();

            state._fsp--;

             current =iv_ruleParameterPoseType; 
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
    // $ANTLR end "entryRuleParameterPoseType"


    // $ANTLR start "ruleParameterPoseType"
    // InternalKinematicsParser.g:796:1: ruleParameterPoseType returns [EObject current=null] : ( () otherlv_1= Pose ) ;
    public final EObject ruleParameterPoseType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKinematicsParser.g:802:2: ( ( () otherlv_1= Pose ) )
            // InternalKinematicsParser.g:803:2: ( () otherlv_1= Pose )
            {
            // InternalKinematicsParser.g:803:2: ( () otherlv_1= Pose )
            // InternalKinematicsParser.g:804:3: () otherlv_1= Pose
            {
            // InternalKinematicsParser.g:804:3: ()
            // InternalKinematicsParser.g:805:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterPoseTypeAccess().getParameterPoseTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Pose,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterPoseTypeAccess().getPoseKeyword_1());
            		

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
    // $ANTLR end "ruleParameterPoseType"


    // $ANTLR start "entryRuleBody"
    // InternalKinematicsParser.g:819:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // InternalKinematicsParser.g:819:45: (iv_ruleBody= ruleBody EOF )
            // InternalKinematicsParser.g:820:2: iv_ruleBody= ruleBody EOF
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
    // InternalKinematicsParser.g:826:1: ruleBody returns [EObject current=null] : ( () (otherlv_1= Links ( (lv_links_2_0= ruleLink ) )* )? (otherlv_3= Joints ( (lv_joints_4_0= ruleJoint ) )* )? ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_links_2_0 = null;

        EObject lv_joints_4_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:832:2: ( ( () (otherlv_1= Links ( (lv_links_2_0= ruleLink ) )* )? (otherlv_3= Joints ( (lv_joints_4_0= ruleJoint ) )* )? ) )
            // InternalKinematicsParser.g:833:2: ( () (otherlv_1= Links ( (lv_links_2_0= ruleLink ) )* )? (otherlv_3= Joints ( (lv_joints_4_0= ruleJoint ) )* )? )
            {
            // InternalKinematicsParser.g:833:2: ( () (otherlv_1= Links ( (lv_links_2_0= ruleLink ) )* )? (otherlv_3= Joints ( (lv_joints_4_0= ruleJoint ) )* )? )
            // InternalKinematicsParser.g:834:3: () (otherlv_1= Links ( (lv_links_2_0= ruleLink ) )* )? (otherlv_3= Joints ( (lv_joints_4_0= ruleJoint ) )* )?
            {
            // InternalKinematicsParser.g:834:3: ()
            // InternalKinematicsParser.g:835:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBodyAccess().getBodyAction_0(),
            					current);
            			

            }

            // InternalKinematicsParser.g:841:3: (otherlv_1= Links ( (lv_links_2_0= ruleLink ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Links) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalKinematicsParser.g:842:4: otherlv_1= Links ( (lv_links_2_0= ruleLink ) )*
                    {
                    otherlv_1=(Token)match(input,Links,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getBodyAccess().getLinksKeyword_1_0());
                    			
                    // InternalKinematicsParser.g:846:4: ( (lv_links_2_0= ruleLink ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==HyphenMinus) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalKinematicsParser.g:847:5: (lv_links_2_0= ruleLink )
                    	    {
                    	    // InternalKinematicsParser.g:847:5: (lv_links_2_0= ruleLink )
                    	    // InternalKinematicsParser.g:848:6: lv_links_2_0= ruleLink
                    	    {

                    	    						newCompositeNode(grammarAccess.getBodyAccess().getLinksLinkParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_20);
                    	    lv_links_2_0=ruleLink();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getBodyRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"links",
                    	    							lv_links_2_0,
                    	    							"de.fraunhofer.ipa.kinematics.Kinematics.Link");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalKinematicsParser.g:866:3: (otherlv_3= Joints ( (lv_joints_4_0= ruleJoint ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Joints) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalKinematicsParser.g:867:4: otherlv_3= Joints ( (lv_joints_4_0= ruleJoint ) )*
                    {
                    otherlv_3=(Token)match(input,Joints,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getBodyAccess().getJointsKeyword_2_0());
                    			
                    // InternalKinematicsParser.g:871:4: ( (lv_joints_4_0= ruleJoint ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==HyphenMinus) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalKinematicsParser.g:872:5: (lv_joints_4_0= ruleJoint )
                    	    {
                    	    // InternalKinematicsParser.g:872:5: (lv_joints_4_0= ruleJoint )
                    	    // InternalKinematicsParser.g:873:6: lv_joints_4_0= ruleJoint
                    	    {

                    	    						newCompositeNode(grammarAccess.getBodyAccess().getJointsJointParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_21);
                    	    lv_joints_4_0=ruleJoint();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getBodyRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"joints",
                    	    							lv_joints_4_0,
                    	    							"de.fraunhofer.ipa.kinematics.Kinematics.Joint");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


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
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleMacroCall"
    // InternalKinematicsParser.g:895:1: entryRuleMacroCall returns [EObject current=null] : iv_ruleMacroCall= ruleMacroCall EOF ;
    public final EObject entryRuleMacroCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacroCall = null;


        try {
            // InternalKinematicsParser.g:895:50: (iv_ruleMacroCall= ruleMacroCall EOF )
            // InternalKinematicsParser.g:896:2: iv_ruleMacroCall= ruleMacroCall EOF
            {
             newCompositeNode(grammarAccess.getMacroCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMacroCall=ruleMacroCall();

            state._fsp--;

             current =iv_ruleMacroCall; 
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
    // $ANTLR end "entryRuleMacroCall"


    // $ANTLR start "ruleMacroCall"
    // InternalKinematicsParser.g:902:1: ruleMacroCall returns [EObject current=null] : ( () otherlv_1= HyphenMinus ( (otherlv_2= RULE_STRING ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_parameterCall_5_0= ruleParameterCall ) )* this_END_6= RULE_END ) ;
    public final EObject ruleMacroCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token this_END_6=null;
        EObject lv_parameterCall_5_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:908:2: ( ( () otherlv_1= HyphenMinus ( (otherlv_2= RULE_STRING ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_parameterCall_5_0= ruleParameterCall ) )* this_END_6= RULE_END ) )
            // InternalKinematicsParser.g:909:2: ( () otherlv_1= HyphenMinus ( (otherlv_2= RULE_STRING ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_parameterCall_5_0= ruleParameterCall ) )* this_END_6= RULE_END )
            {
            // InternalKinematicsParser.g:909:2: ( () otherlv_1= HyphenMinus ( (otherlv_2= RULE_STRING ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_parameterCall_5_0= ruleParameterCall ) )* this_END_6= RULE_END )
            // InternalKinematicsParser.g:910:3: () otherlv_1= HyphenMinus ( (otherlv_2= RULE_STRING ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_parameterCall_5_0= ruleParameterCall ) )* this_END_6= RULE_END
            {
            // InternalKinematicsParser.g:910:3: ()
            // InternalKinematicsParser.g:911:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMacroCallAccess().getMacroCallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,HyphenMinus,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getMacroCallAccess().getHyphenMinusKeyword_1());
            		
            // InternalKinematicsParser.g:921:3: ( (otherlv_2= RULE_STRING ) )
            // InternalKinematicsParser.g:922:4: (otherlv_2= RULE_STRING )
            {
            // InternalKinematicsParser.g:922:4: (otherlv_2= RULE_STRING )
            // InternalKinematicsParser.g:923:5: otherlv_2= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMacroCallRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(otherlv_2, grammarAccess.getMacroCallAccess().getMacroMacroCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,Colon,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getMacroCallAccess().getColonKeyword_3());
            		
            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_23); 

            			newLeafNode(this_BEGIN_4, grammarAccess.getMacroCallAccess().getBEGINTerminalRuleCall_4());
            		
            // InternalKinematicsParser.g:942:3: ( (lv_parameterCall_5_0= ruleParameterCall ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==HyphenMinus) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKinematicsParser.g:943:4: (lv_parameterCall_5_0= ruleParameterCall )
            	    {
            	    // InternalKinematicsParser.g:943:4: (lv_parameterCall_5_0= ruleParameterCall )
            	    // InternalKinematicsParser.g:944:5: lv_parameterCall_5_0= ruleParameterCall
            	    {

            	    					newCompositeNode(grammarAccess.getMacroCallAccess().getParameterCallParameterCallParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_parameterCall_5_0=ruleParameterCall();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMacroCallRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameterCall",
            	    						lv_parameterCall_5_0,
            	    						"de.fraunhofer.ipa.kinematics.Kinematics.ParameterCall");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_6, grammarAccess.getMacroCallAccess().getENDTerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleMacroCall"


    // $ANTLR start "entryRuleParameterCall"
    // InternalKinematicsParser.g:969:1: entryRuleParameterCall returns [EObject current=null] : iv_ruleParameterCall= ruleParameterCall EOF ;
    public final EObject entryRuleParameterCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterCall = null;


        try {
            // InternalKinematicsParser.g:969:54: (iv_ruleParameterCall= ruleParameterCall EOF )
            // InternalKinematicsParser.g:970:2: iv_ruleParameterCall= ruleParameterCall EOF
            {
             newCompositeNode(grammarAccess.getParameterCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterCall=ruleParameterCall();

            state._fsp--;

             current =iv_ruleParameterCall; 
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
    // $ANTLR end "entryRuleParameterCall"


    // $ANTLR start "ruleParameterCall"
    // InternalKinematicsParser.g:976:1: ruleParameterCall returns [EObject current=null] : ( () otherlv_1= HyphenMinus ( (otherlv_2= RULE_STRING ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN otherlv_5= Value ( (lv_value_6_0= ruleParameterValue ) ) this_END_7= RULE_END ) ;
    public final EObject ruleParameterCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token otherlv_5=null;
        Token this_END_7=null;
        EObject lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:982:2: ( ( () otherlv_1= HyphenMinus ( (otherlv_2= RULE_STRING ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN otherlv_5= Value ( (lv_value_6_0= ruleParameterValue ) ) this_END_7= RULE_END ) )
            // InternalKinematicsParser.g:983:2: ( () otherlv_1= HyphenMinus ( (otherlv_2= RULE_STRING ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN otherlv_5= Value ( (lv_value_6_0= ruleParameterValue ) ) this_END_7= RULE_END )
            {
            // InternalKinematicsParser.g:983:2: ( () otherlv_1= HyphenMinus ( (otherlv_2= RULE_STRING ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN otherlv_5= Value ( (lv_value_6_0= ruleParameterValue ) ) this_END_7= RULE_END )
            // InternalKinematicsParser.g:984:3: () otherlv_1= HyphenMinus ( (otherlv_2= RULE_STRING ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN otherlv_5= Value ( (lv_value_6_0= ruleParameterValue ) ) this_END_7= RULE_END
            {
            // InternalKinematicsParser.g:984:3: ()
            // InternalKinematicsParser.g:985:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterCallAccess().getParameterCallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,HyphenMinus,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterCallAccess().getHyphenMinusKeyword_1());
            		
            // InternalKinematicsParser.g:995:3: ( (otherlv_2= RULE_STRING ) )
            // InternalKinematicsParser.g:996:4: (otherlv_2= RULE_STRING )
            {
            // InternalKinematicsParser.g:996:4: (otherlv_2= RULE_STRING )
            // InternalKinematicsParser.g:997:5: otherlv_2= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterCallRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(otherlv_2, grammarAccess.getParameterCallAccess().getParameterParameterCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,Colon,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterCallAccess().getColonKeyword_3());
            		
            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_24); 

            			newLeafNode(this_BEGIN_4, grammarAccess.getParameterCallAccess().getBEGINTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,Value,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterCallAccess().getValueKeyword_5());
            		
            // InternalKinematicsParser.g:1020:3: ( (lv_value_6_0= ruleParameterValue ) )
            // InternalKinematicsParser.g:1021:4: (lv_value_6_0= ruleParameterValue )
            {
            // InternalKinematicsParser.g:1021:4: (lv_value_6_0= ruleParameterValue )
            // InternalKinematicsParser.g:1022:5: lv_value_6_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getParameterCallAccess().getValueParameterValueParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_value_6_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterCallRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_6_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.ParameterValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_7=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_7, grammarAccess.getParameterCallAccess().getENDTerminalRuleCall_7());
            		

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
    // $ANTLR end "ruleParameterCall"


    // $ANTLR start "entryRuleJoint"
    // InternalKinematicsParser.g:1047:1: entryRuleJoint returns [EObject current=null] : iv_ruleJoint= ruleJoint EOF ;
    public final EObject entryRuleJoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoint = null;


        try {
            // InternalKinematicsParser.g:1047:46: (iv_ruleJoint= ruleJoint EOF )
            // InternalKinematicsParser.g:1048:2: iv_ruleJoint= ruleJoint EOF
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
    // InternalKinematicsParser.g:1054:1: ruleJoint returns [EObject current=null] : (otherlv_0= HyphenMinus ( (lv_name_1_0= ruleParameterString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( (lv_type_5_0= RULE_JOINTTYPE ) ) otherlv_6= Parent ( (lv_parent_7_0= ruleParameterLink ) ) otherlv_8= Child ( (lv_child_9_0= ruleParameterLink ) ) otherlv_10= Origin ( (lv_origin_11_0= ruleParameterPose ) ) (otherlv_12= Axis ( (lv_axis_13_0= ruleVector3 ) ) )? (otherlv_14= Limit ( (lv_limit_15_0= ruleLimit ) ) )? this_END_16= RULE_END ) ;
    public final EObject ruleJoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token this_END_16=null;
        EObject lv_name_1_0 = null;

        EObject lv_parent_7_0 = null;

        EObject lv_child_9_0 = null;

        EObject lv_origin_11_0 = null;

        EObject lv_axis_13_0 = null;

        EObject lv_limit_15_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:1060:2: ( (otherlv_0= HyphenMinus ( (lv_name_1_0= ruleParameterString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( (lv_type_5_0= RULE_JOINTTYPE ) ) otherlv_6= Parent ( (lv_parent_7_0= ruleParameterLink ) ) otherlv_8= Child ( (lv_child_9_0= ruleParameterLink ) ) otherlv_10= Origin ( (lv_origin_11_0= ruleParameterPose ) ) (otherlv_12= Axis ( (lv_axis_13_0= ruleVector3 ) ) )? (otherlv_14= Limit ( (lv_limit_15_0= ruleLimit ) ) )? this_END_16= RULE_END ) )
            // InternalKinematicsParser.g:1061:2: (otherlv_0= HyphenMinus ( (lv_name_1_0= ruleParameterString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( (lv_type_5_0= RULE_JOINTTYPE ) ) otherlv_6= Parent ( (lv_parent_7_0= ruleParameterLink ) ) otherlv_8= Child ( (lv_child_9_0= ruleParameterLink ) ) otherlv_10= Origin ( (lv_origin_11_0= ruleParameterPose ) ) (otherlv_12= Axis ( (lv_axis_13_0= ruleVector3 ) ) )? (otherlv_14= Limit ( (lv_limit_15_0= ruleLimit ) ) )? this_END_16= RULE_END )
            {
            // InternalKinematicsParser.g:1061:2: (otherlv_0= HyphenMinus ( (lv_name_1_0= ruleParameterString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( (lv_type_5_0= RULE_JOINTTYPE ) ) otherlv_6= Parent ( (lv_parent_7_0= ruleParameterLink ) ) otherlv_8= Child ( (lv_child_9_0= ruleParameterLink ) ) otherlv_10= Origin ( (lv_origin_11_0= ruleParameterPose ) ) (otherlv_12= Axis ( (lv_axis_13_0= ruleVector3 ) ) )? (otherlv_14= Limit ( (lv_limit_15_0= ruleLimit ) ) )? this_END_16= RULE_END )
            // InternalKinematicsParser.g:1062:3: otherlv_0= HyphenMinus ( (lv_name_1_0= ruleParameterString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( (lv_type_5_0= RULE_JOINTTYPE ) ) otherlv_6= Parent ( (lv_parent_7_0= ruleParameterLink ) ) otherlv_8= Child ( (lv_child_9_0= ruleParameterLink ) ) otherlv_10= Origin ( (lv_origin_11_0= ruleParameterPose ) ) (otherlv_12= Axis ( (lv_axis_13_0= ruleVector3 ) ) )? (otherlv_14= Limit ( (lv_limit_15_0= ruleLimit ) ) )? this_END_16= RULE_END
            {
            otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getJointAccess().getHyphenMinusKeyword_0());
            		
            // InternalKinematicsParser.g:1066:3: ( (lv_name_1_0= ruleParameterString ) )
            // InternalKinematicsParser.g:1067:4: (lv_name_1_0= ruleParameterString )
            {
            // InternalKinematicsParser.g:1067:4: (lv_name_1_0= ruleParameterString )
            // InternalKinematicsParser.g:1068:5: lv_name_1_0= ruleParameterString
            {

            					newCompositeNode(grammarAccess.getJointAccess().getNameParameterStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_1_0=ruleParameterString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.ParameterString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getJointAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getJointAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Type,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getJointAccess().getTypeKeyword_4());
            		
            // InternalKinematicsParser.g:1097:3: ( (lv_type_5_0= RULE_JOINTTYPE ) )
            // InternalKinematicsParser.g:1098:4: (lv_type_5_0= RULE_JOINTTYPE )
            {
            // InternalKinematicsParser.g:1098:4: (lv_type_5_0= RULE_JOINTTYPE )
            // InternalKinematicsParser.g:1099:5: lv_type_5_0= RULE_JOINTTYPE
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
            						"de.fraunhofer.ipa.kinematics.Kinematics.JOINTTYPE");
            				

            }


            }

            otherlv_6=(Token)match(input,Parent,FOLLOW_28); 

            			newLeafNode(otherlv_6, grammarAccess.getJointAccess().getParentKeyword_6());
            		
            // InternalKinematicsParser.g:1119:3: ( (lv_parent_7_0= ruleParameterLink ) )
            // InternalKinematicsParser.g:1120:4: (lv_parent_7_0= ruleParameterLink )
            {
            // InternalKinematicsParser.g:1120:4: (lv_parent_7_0= ruleParameterLink )
            // InternalKinematicsParser.g:1121:5: lv_parent_7_0= ruleParameterLink
            {

            					newCompositeNode(grammarAccess.getJointAccess().getParentParameterLinkParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_29);
            lv_parent_7_0=ruleParameterLink();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"parent",
            						lv_parent_7_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.ParameterLink");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,Child,FOLLOW_28); 

            			newLeafNode(otherlv_8, grammarAccess.getJointAccess().getChildKeyword_8());
            		
            // InternalKinematicsParser.g:1142:3: ( (lv_child_9_0= ruleParameterLink ) )
            // InternalKinematicsParser.g:1143:4: (lv_child_9_0= ruleParameterLink )
            {
            // InternalKinematicsParser.g:1143:4: (lv_child_9_0= ruleParameterLink )
            // InternalKinematicsParser.g:1144:5: lv_child_9_0= ruleParameterLink
            {

            					newCompositeNode(grammarAccess.getJointAccess().getChildParameterLinkParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_30);
            lv_child_9_0=ruleParameterLink();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_9_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.ParameterLink");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,Origin,FOLLOW_31); 

            			newLeafNode(otherlv_10, grammarAccess.getJointAccess().getOriginKeyword_10());
            		
            // InternalKinematicsParser.g:1165:3: ( (lv_origin_11_0= ruleParameterPose ) )
            // InternalKinematicsParser.g:1166:4: (lv_origin_11_0= ruleParameterPose )
            {
            // InternalKinematicsParser.g:1166:4: (lv_origin_11_0= ruleParameterPose )
            // InternalKinematicsParser.g:1167:5: lv_origin_11_0= ruleParameterPose
            {

            					newCompositeNode(grammarAccess.getJointAccess().getOriginParameterPoseParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_32);
            lv_origin_11_0=ruleParameterPose();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"origin",
            						lv_origin_11_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.ParameterPose");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKinematicsParser.g:1184:3: (otherlv_12= Axis ( (lv_axis_13_0= ruleVector3 ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Axis) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalKinematicsParser.g:1185:4: otherlv_12= Axis ( (lv_axis_13_0= ruleVector3 ) )
                    {
                    otherlv_12=(Token)match(input,Axis,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getJointAccess().getAxisKeyword_12_0());
                    			
                    // InternalKinematicsParser.g:1189:4: ( (lv_axis_13_0= ruleVector3 ) )
                    // InternalKinematicsParser.g:1190:5: (lv_axis_13_0= ruleVector3 )
                    {
                    // InternalKinematicsParser.g:1190:5: (lv_axis_13_0= ruleVector3 )
                    // InternalKinematicsParser.g:1191:6: lv_axis_13_0= ruleVector3
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getAxisVector3ParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_33);
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

            // InternalKinematicsParser.g:1209:3: (otherlv_14= Limit ( (lv_limit_15_0= ruleLimit ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Limit) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalKinematicsParser.g:1210:4: otherlv_14= Limit ( (lv_limit_15_0= ruleLimit ) )
                    {
                    otherlv_14=(Token)match(input,Limit,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getJointAccess().getLimitKeyword_13_0());
                    			
                    // InternalKinematicsParser.g:1214:4: ( (lv_limit_15_0= ruleLimit ) )
                    // InternalKinematicsParser.g:1215:5: (lv_limit_15_0= ruleLimit )
                    {
                    // InternalKinematicsParser.g:1215:5: (lv_limit_15_0= ruleLimit )
                    // InternalKinematicsParser.g:1216:6: lv_limit_15_0= ruleLimit
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_12);
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
    // InternalKinematicsParser.g:1242:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalKinematicsParser.g:1242:45: (iv_ruleLink= ruleLink EOF )
            // InternalKinematicsParser.g:1243:2: iv_ruleLink= ruleLink EOF
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
    // InternalKinematicsParser.g:1249:1: ruleLink returns [EObject current=null] : (otherlv_0= HyphenMinus ( (lv_name_1_0= ruleParameterString ) ) (otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Inertial ( (lv_inertial_5_0= ruleInertial ) ) )? (otherlv_6= Visual ( (lv_visual_7_0= ruleVisual ) ) )? (otherlv_8= Collision ( (lv_collision_9_0= ruleCollision ) ) )? this_END_10= RULE_END )? ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_END_10=null;
        EObject lv_name_1_0 = null;

        EObject lv_inertial_5_0 = null;

        EObject lv_visual_7_0 = null;

        EObject lv_collision_9_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:1255:2: ( (otherlv_0= HyphenMinus ( (lv_name_1_0= ruleParameterString ) ) (otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Inertial ( (lv_inertial_5_0= ruleInertial ) ) )? (otherlv_6= Visual ( (lv_visual_7_0= ruleVisual ) ) )? (otherlv_8= Collision ( (lv_collision_9_0= ruleCollision ) ) )? this_END_10= RULE_END )? ) )
            // InternalKinematicsParser.g:1256:2: (otherlv_0= HyphenMinus ( (lv_name_1_0= ruleParameterString ) ) (otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Inertial ( (lv_inertial_5_0= ruleInertial ) ) )? (otherlv_6= Visual ( (lv_visual_7_0= ruleVisual ) ) )? (otherlv_8= Collision ( (lv_collision_9_0= ruleCollision ) ) )? this_END_10= RULE_END )? )
            {
            // InternalKinematicsParser.g:1256:2: (otherlv_0= HyphenMinus ( (lv_name_1_0= ruleParameterString ) ) (otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Inertial ( (lv_inertial_5_0= ruleInertial ) ) )? (otherlv_6= Visual ( (lv_visual_7_0= ruleVisual ) ) )? (otherlv_8= Collision ( (lv_collision_9_0= ruleCollision ) ) )? this_END_10= RULE_END )? )
            // InternalKinematicsParser.g:1257:3: otherlv_0= HyphenMinus ( (lv_name_1_0= ruleParameterString ) ) (otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Inertial ( (lv_inertial_5_0= ruleInertial ) ) )? (otherlv_6= Visual ( (lv_visual_7_0= ruleVisual ) ) )? (otherlv_8= Collision ( (lv_collision_9_0= ruleCollision ) ) )? this_END_10= RULE_END )?
            {
            otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getHyphenMinusKeyword_0());
            		
            // InternalKinematicsParser.g:1261:3: ( (lv_name_1_0= ruleParameterString ) )
            // InternalKinematicsParser.g:1262:4: (lv_name_1_0= ruleParameterString )
            {
            // InternalKinematicsParser.g:1262:4: (lv_name_1_0= ruleParameterString )
            // InternalKinematicsParser.g:1263:5: lv_name_1_0= ruleParameterString
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getNameParameterStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
            lv_name_1_0=ruleParameterString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.ParameterString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKinematicsParser.g:1280:3: (otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Inertial ( (lv_inertial_5_0= ruleInertial ) ) )? (otherlv_6= Visual ( (lv_visual_7_0= ruleVisual ) ) )? (otherlv_8= Collision ( (lv_collision_9_0= ruleCollision ) ) )? this_END_10= RULE_END )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Colon) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalKinematicsParser.g:1281:4: otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Inertial ( (lv_inertial_5_0= ruleInertial ) ) )? (otherlv_6= Visual ( (lv_visual_7_0= ruleVisual ) ) )? (otherlv_8= Collision ( (lv_collision_9_0= ruleCollision ) ) )? this_END_10= RULE_END
                    {
                    otherlv_2=(Token)match(input,Colon,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getColonKeyword_2_0());
                    			
                    this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_35); 

                    				newLeafNode(this_BEGIN_3, grammarAccess.getLinkAccess().getBEGINTerminalRuleCall_2_1());
                    			
                    // InternalKinematicsParser.g:1289:4: (otherlv_4= Inertial ( (lv_inertial_5_0= ruleInertial ) ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==Inertial) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalKinematicsParser.g:1290:5: otherlv_4= Inertial ( (lv_inertial_5_0= ruleInertial ) )
                            {
                            otherlv_4=(Token)match(input,Inertial,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getInertialKeyword_2_2_0());
                            				
                            // InternalKinematicsParser.g:1294:5: ( (lv_inertial_5_0= ruleInertial ) )
                            // InternalKinematicsParser.g:1295:6: (lv_inertial_5_0= ruleInertial )
                            {
                            // InternalKinematicsParser.g:1295:6: (lv_inertial_5_0= ruleInertial )
                            // InternalKinematicsParser.g:1296:7: lv_inertial_5_0= ruleInertial
                            {

                            							newCompositeNode(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_2_2_1_0());
                            						
                            pushFollow(FOLLOW_36);
                            lv_inertial_5_0=ruleInertial();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getLinkRule());
                            							}
                            							set(
                            								current,
                            								"inertial",
                            								lv_inertial_5_0,
                            								"de.fraunhofer.ipa.kinematics.Kinematics.Inertial");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalKinematicsParser.g:1314:4: (otherlv_6= Visual ( (lv_visual_7_0= ruleVisual ) ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==Visual) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalKinematicsParser.g:1315:5: otherlv_6= Visual ( (lv_visual_7_0= ruleVisual ) )
                            {
                            otherlv_6=(Token)match(input,Visual,FOLLOW_3); 

                            					newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getVisualKeyword_2_3_0());
                            				
                            // InternalKinematicsParser.g:1319:5: ( (lv_visual_7_0= ruleVisual ) )
                            // InternalKinematicsParser.g:1320:6: (lv_visual_7_0= ruleVisual )
                            {
                            // InternalKinematicsParser.g:1320:6: (lv_visual_7_0= ruleVisual )
                            // InternalKinematicsParser.g:1321:7: lv_visual_7_0= ruleVisual
                            {

                            							newCompositeNode(grammarAccess.getLinkAccess().getVisualVisualParserRuleCall_2_3_1_0());
                            						
                            pushFollow(FOLLOW_37);
                            lv_visual_7_0=ruleVisual();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getLinkRule());
                            							}
                            							set(
                            								current,
                            								"visual",
                            								lv_visual_7_0,
                            								"de.fraunhofer.ipa.kinematics.Kinematics.Visual");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalKinematicsParser.g:1339:4: (otherlv_8= Collision ( (lv_collision_9_0= ruleCollision ) ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==Collision) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalKinematicsParser.g:1340:5: otherlv_8= Collision ( (lv_collision_9_0= ruleCollision ) )
                            {
                            otherlv_8=(Token)match(input,Collision,FOLLOW_3); 

                            					newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getCollisionKeyword_2_4_0());
                            				
                            // InternalKinematicsParser.g:1344:5: ( (lv_collision_9_0= ruleCollision ) )
                            // InternalKinematicsParser.g:1345:6: (lv_collision_9_0= ruleCollision )
                            {
                            // InternalKinematicsParser.g:1345:6: (lv_collision_9_0= ruleCollision )
                            // InternalKinematicsParser.g:1346:7: lv_collision_9_0= ruleCollision
                            {

                            							newCompositeNode(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_2_4_1_0());
                            						
                            pushFollow(FOLLOW_12);
                            lv_collision_9_0=ruleCollision();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getLinkRule());
                            							}
                            							set(
                            								current,
                            								"collision",
                            								lv_collision_9_0,
                            								"de.fraunhofer.ipa.kinematics.Kinematics.Collision");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    this_END_10=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_10, grammarAccess.getLinkAccess().getENDTerminalRuleCall_2_5());
                    			

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
    // InternalKinematicsParser.g:1373:1: entryRulePose returns [EObject current=null] : iv_rulePose= rulePose EOF ;
    public final EObject entryRulePose() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePose = null;


        try {
            // InternalKinematicsParser.g:1373:45: (iv_rulePose= rulePose EOF )
            // InternalKinematicsParser.g:1374:2: iv_rulePose= rulePose EOF
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
    // InternalKinematicsParser.g:1380:1: rulePose returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Rpy ( (lv_rpy_3_0= RULE_STRING ) ) )? (otherlv_4= Xyz ( (lv_xyz_5_0= RULE_STRING ) ) )? this_END_6= RULE_END ) ;
    public final EObject rulePose() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token lv_rpy_3_0=null;
        Token otherlv_4=null;
        Token lv_xyz_5_0=null;
        Token this_END_6=null;


        	enterRule();

        try {
            // InternalKinematicsParser.g:1386:2: ( ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Rpy ( (lv_rpy_3_0= RULE_STRING ) ) )? (otherlv_4= Xyz ( (lv_xyz_5_0= RULE_STRING ) ) )? this_END_6= RULE_END ) )
            // InternalKinematicsParser.g:1387:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Rpy ( (lv_rpy_3_0= RULE_STRING ) ) )? (otherlv_4= Xyz ( (lv_xyz_5_0= RULE_STRING ) ) )? this_END_6= RULE_END )
            {
            // InternalKinematicsParser.g:1387:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Rpy ( (lv_rpy_3_0= RULE_STRING ) ) )? (otherlv_4= Xyz ( (lv_xyz_5_0= RULE_STRING ) ) )? this_END_6= RULE_END )
            // InternalKinematicsParser.g:1388:3: () this_BEGIN_1= RULE_BEGIN (otherlv_2= Rpy ( (lv_rpy_3_0= RULE_STRING ) ) )? (otherlv_4= Xyz ( (lv_xyz_5_0= RULE_STRING ) ) )? this_END_6= RULE_END
            {
            // InternalKinematicsParser.g:1388:3: ()
            // InternalKinematicsParser.g:1389:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPoseAccess().getPoseAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_38); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getPoseAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalKinematicsParser.g:1399:3: (otherlv_2= Rpy ( (lv_rpy_3_0= RULE_STRING ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Rpy) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKinematicsParser.g:1400:4: otherlv_2= Rpy ( (lv_rpy_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,Rpy,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getPoseAccess().getRpyKeyword_2_0());
                    			
                    // InternalKinematicsParser.g:1404:4: ( (lv_rpy_3_0= RULE_STRING ) )
                    // InternalKinematicsParser.g:1405:5: (lv_rpy_3_0= RULE_STRING )
                    {
                    // InternalKinematicsParser.g:1405:5: (lv_rpy_3_0= RULE_STRING )
                    // InternalKinematicsParser.g:1406:6: lv_rpy_3_0= RULE_STRING
                    {
                    lv_rpy_3_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

                    						newLeafNode(lv_rpy_3_0, grammarAccess.getPoseAccess().getRpySTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPoseRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"rpy",
                    							lv_rpy_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:1423:3: (otherlv_4= Xyz ( (lv_xyz_5_0= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Xyz) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalKinematicsParser.g:1424:4: otherlv_4= Xyz ( (lv_xyz_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,Xyz,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getPoseAccess().getXyzKeyword_3_0());
                    			
                    // InternalKinematicsParser.g:1428:4: ( (lv_xyz_5_0= RULE_STRING ) )
                    // InternalKinematicsParser.g:1429:5: (lv_xyz_5_0= RULE_STRING )
                    {
                    // InternalKinematicsParser.g:1429:5: (lv_xyz_5_0= RULE_STRING )
                    // InternalKinematicsParser.g:1430:6: lv_xyz_5_0= RULE_STRING
                    {
                    lv_xyz_5_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    						newLeafNode(lv_xyz_5_0, grammarAccess.getPoseAccess().getXyzSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPoseRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"xyz",
                    							lv_xyz_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

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
    // InternalKinematicsParser.g:1455:1: entryRuleVector3 returns [EObject current=null] : iv_ruleVector3= ruleVector3 EOF ;
    public final EObject entryRuleVector3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector3 = null;


        try {
            // InternalKinematicsParser.g:1455:48: (iv_ruleVector3= ruleVector3 EOF )
            // InternalKinematicsParser.g:1456:2: iv_ruleVector3= ruleVector3 EOF
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
    // InternalKinematicsParser.g:1462:1: ruleVector3 returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Xyz ( (lv_xyz_3_0= RULE_STRING ) ) )? this_END_4= RULE_END ) ;
    public final EObject ruleVector3() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token lv_xyz_3_0=null;
        Token this_END_4=null;


        	enterRule();

        try {
            // InternalKinematicsParser.g:1468:2: ( ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Xyz ( (lv_xyz_3_0= RULE_STRING ) ) )? this_END_4= RULE_END ) )
            // InternalKinematicsParser.g:1469:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Xyz ( (lv_xyz_3_0= RULE_STRING ) ) )? this_END_4= RULE_END )
            {
            // InternalKinematicsParser.g:1469:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Xyz ( (lv_xyz_3_0= RULE_STRING ) ) )? this_END_4= RULE_END )
            // InternalKinematicsParser.g:1470:3: () this_BEGIN_1= RULE_BEGIN (otherlv_2= Xyz ( (lv_xyz_3_0= RULE_STRING ) ) )? this_END_4= RULE_END
            {
            // InternalKinematicsParser.g:1470:3: ()
            // InternalKinematicsParser.g:1471:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVector3Access().getVector3Action_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_39); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getVector3Access().getBEGINTerminalRuleCall_1());
            		
            // InternalKinematicsParser.g:1481:3: (otherlv_2= Xyz ( (lv_xyz_3_0= RULE_STRING ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Xyz) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalKinematicsParser.g:1482:4: otherlv_2= Xyz ( (lv_xyz_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,Xyz,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getVector3Access().getXyzKeyword_2_0());
                    			
                    // InternalKinematicsParser.g:1486:4: ( (lv_xyz_3_0= RULE_STRING ) )
                    // InternalKinematicsParser.g:1487:5: (lv_xyz_3_0= RULE_STRING )
                    {
                    // InternalKinematicsParser.g:1487:5: (lv_xyz_3_0= RULE_STRING )
                    // InternalKinematicsParser.g:1488:6: lv_xyz_3_0= RULE_STRING
                    {
                    lv_xyz_3_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    						newLeafNode(lv_xyz_3_0, grammarAccess.getVector3Access().getXyzSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVector3Rule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"xyz",
                    							lv_xyz_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

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
    // InternalKinematicsParser.g:1513:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // InternalKinematicsParser.g:1513:46: (iv_ruleLimit= ruleLimit EOF )
            // InternalKinematicsParser.g:1514:2: iv_ruleLimit= ruleLimit EOF
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
    // InternalKinematicsParser.g:1520:1: ruleLimit returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Effort ( (lv_effort_3_0= RULE_STRING ) ) )? (otherlv_4= Lower ( (lv_lower_5_0= RULE_STRING ) ) )? (otherlv_6= Upper ( (lv_upper_7_0= RULE_STRING ) ) )? (otherlv_8= Velocity ( (lv_velocity_9_0= RULE_STRING ) ) )? this_END_10= RULE_END ) ;
    public final EObject ruleLimit() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token lv_effort_3_0=null;
        Token otherlv_4=null;
        Token lv_lower_5_0=null;
        Token otherlv_6=null;
        Token lv_upper_7_0=null;
        Token otherlv_8=null;
        Token lv_velocity_9_0=null;
        Token this_END_10=null;


        	enterRule();

        try {
            // InternalKinematicsParser.g:1526:2: ( ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Effort ( (lv_effort_3_0= RULE_STRING ) ) )? (otherlv_4= Lower ( (lv_lower_5_0= RULE_STRING ) ) )? (otherlv_6= Upper ( (lv_upper_7_0= RULE_STRING ) ) )? (otherlv_8= Velocity ( (lv_velocity_9_0= RULE_STRING ) ) )? this_END_10= RULE_END ) )
            // InternalKinematicsParser.g:1527:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Effort ( (lv_effort_3_0= RULE_STRING ) ) )? (otherlv_4= Lower ( (lv_lower_5_0= RULE_STRING ) ) )? (otherlv_6= Upper ( (lv_upper_7_0= RULE_STRING ) ) )? (otherlv_8= Velocity ( (lv_velocity_9_0= RULE_STRING ) ) )? this_END_10= RULE_END )
            {
            // InternalKinematicsParser.g:1527:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Effort ( (lv_effort_3_0= RULE_STRING ) ) )? (otherlv_4= Lower ( (lv_lower_5_0= RULE_STRING ) ) )? (otherlv_6= Upper ( (lv_upper_7_0= RULE_STRING ) ) )? (otherlv_8= Velocity ( (lv_velocity_9_0= RULE_STRING ) ) )? this_END_10= RULE_END )
            // InternalKinematicsParser.g:1528:3: () this_BEGIN_1= RULE_BEGIN (otherlv_2= Effort ( (lv_effort_3_0= RULE_STRING ) ) )? (otherlv_4= Lower ( (lv_lower_5_0= RULE_STRING ) ) )? (otherlv_6= Upper ( (lv_upper_7_0= RULE_STRING ) ) )? (otherlv_8= Velocity ( (lv_velocity_9_0= RULE_STRING ) ) )? this_END_10= RULE_END
            {
            // InternalKinematicsParser.g:1528:3: ()
            // InternalKinematicsParser.g:1529:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLimitAccess().getLimitAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_40); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getLimitAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalKinematicsParser.g:1539:3: (otherlv_2= Effort ( (lv_effort_3_0= RULE_STRING ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Effort) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalKinematicsParser.g:1540:4: otherlv_2= Effort ( (lv_effort_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,Effort,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getLimitAccess().getEffortKeyword_2_0());
                    			
                    // InternalKinematicsParser.g:1544:4: ( (lv_effort_3_0= RULE_STRING ) )
                    // InternalKinematicsParser.g:1545:5: (lv_effort_3_0= RULE_STRING )
                    {
                    // InternalKinematicsParser.g:1545:5: (lv_effort_3_0= RULE_STRING )
                    // InternalKinematicsParser.g:1546:6: lv_effort_3_0= RULE_STRING
                    {
                    lv_effort_3_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

                    						newLeafNode(lv_effort_3_0, grammarAccess.getLimitAccess().getEffortSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLimitRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"effort",
                    							lv_effort_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:1563:3: (otherlv_4= Lower ( (lv_lower_5_0= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Lower) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalKinematicsParser.g:1564:4: otherlv_4= Lower ( (lv_lower_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,Lower,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getLimitAccess().getLowerKeyword_3_0());
                    			
                    // InternalKinematicsParser.g:1568:4: ( (lv_lower_5_0= RULE_STRING ) )
                    // InternalKinematicsParser.g:1569:5: (lv_lower_5_0= RULE_STRING )
                    {
                    // InternalKinematicsParser.g:1569:5: (lv_lower_5_0= RULE_STRING )
                    // InternalKinematicsParser.g:1570:6: lv_lower_5_0= RULE_STRING
                    {
                    lv_lower_5_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

                    						newLeafNode(lv_lower_5_0, grammarAccess.getLimitAccess().getLowerSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLimitRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"lower",
                    							lv_lower_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:1587:3: (otherlv_6= Upper ( (lv_upper_7_0= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Upper) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalKinematicsParser.g:1588:4: otherlv_6= Upper ( (lv_upper_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,Upper,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getLimitAccess().getUpperKeyword_4_0());
                    			
                    // InternalKinematicsParser.g:1592:4: ( (lv_upper_7_0= RULE_STRING ) )
                    // InternalKinematicsParser.g:1593:5: (lv_upper_7_0= RULE_STRING )
                    {
                    // InternalKinematicsParser.g:1593:5: (lv_upper_7_0= RULE_STRING )
                    // InternalKinematicsParser.g:1594:6: lv_upper_7_0= RULE_STRING
                    {
                    lv_upper_7_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

                    						newLeafNode(lv_upper_7_0, grammarAccess.getLimitAccess().getUpperSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLimitRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"upper",
                    							lv_upper_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:1611:3: (otherlv_8= Velocity ( (lv_velocity_9_0= RULE_STRING ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Velocity) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalKinematicsParser.g:1612:4: otherlv_8= Velocity ( (lv_velocity_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,Velocity,FOLLOW_22); 

                    				newLeafNode(otherlv_8, grammarAccess.getLimitAccess().getVelocityKeyword_5_0());
                    			
                    // InternalKinematicsParser.g:1616:4: ( (lv_velocity_9_0= RULE_STRING ) )
                    // InternalKinematicsParser.g:1617:5: (lv_velocity_9_0= RULE_STRING )
                    {
                    // InternalKinematicsParser.g:1617:5: (lv_velocity_9_0= RULE_STRING )
                    // InternalKinematicsParser.g:1618:6: lv_velocity_9_0= RULE_STRING
                    {
                    lv_velocity_9_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    						newLeafNode(lv_velocity_9_0, grammarAccess.getLimitAccess().getVelocitySTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLimitRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"velocity",
                    							lv_velocity_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

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
    // InternalKinematicsParser.g:1643:1: entryRuleInertial returns [EObject current=null] : iv_ruleInertial= ruleInertial EOF ;
    public final EObject entryRuleInertial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertial = null;


        try {
            // InternalKinematicsParser.g:1643:49: (iv_ruleInertial= ruleInertial EOF )
            // InternalKinematicsParser.g:1644:2: iv_ruleInertial= ruleInertial EOF
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
    // InternalKinematicsParser.g:1650:1: ruleInertial returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Origin ( (lv_origin_3_0= rulePose ) ) )? (otherlv_4= Mass ( (lv_mass_5_0= ruleMass ) ) )? (otherlv_6= Inertia ( (lv_inertia_7_0= ruleInertia ) ) )? this_END_8= RULE_END ) ;
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
            // InternalKinematicsParser.g:1656:2: ( ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Origin ( (lv_origin_3_0= rulePose ) ) )? (otherlv_4= Mass ( (lv_mass_5_0= ruleMass ) ) )? (otherlv_6= Inertia ( (lv_inertia_7_0= ruleInertia ) ) )? this_END_8= RULE_END ) )
            // InternalKinematicsParser.g:1657:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Origin ( (lv_origin_3_0= rulePose ) ) )? (otherlv_4= Mass ( (lv_mass_5_0= ruleMass ) ) )? (otherlv_6= Inertia ( (lv_inertia_7_0= ruleInertia ) ) )? this_END_8= RULE_END )
            {
            // InternalKinematicsParser.g:1657:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Origin ( (lv_origin_3_0= rulePose ) ) )? (otherlv_4= Mass ( (lv_mass_5_0= ruleMass ) ) )? (otherlv_6= Inertia ( (lv_inertia_7_0= ruleInertia ) ) )? this_END_8= RULE_END )
            // InternalKinematicsParser.g:1658:3: () this_BEGIN_1= RULE_BEGIN (otherlv_2= Origin ( (lv_origin_3_0= rulePose ) ) )? (otherlv_4= Mass ( (lv_mass_5_0= ruleMass ) ) )? (otherlv_6= Inertia ( (lv_inertia_7_0= ruleInertia ) ) )? this_END_8= RULE_END
            {
            // InternalKinematicsParser.g:1658:3: ()
            // InternalKinematicsParser.g:1659:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInertialAccess().getInertialAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_44); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getInertialAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalKinematicsParser.g:1669:3: (otherlv_2= Origin ( (lv_origin_3_0= rulePose ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Origin) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalKinematicsParser.g:1670:4: otherlv_2= Origin ( (lv_origin_3_0= rulePose ) )
                    {
                    otherlv_2=(Token)match(input,Origin,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getInertialAccess().getOriginKeyword_2_0());
                    			
                    // InternalKinematicsParser.g:1674:4: ( (lv_origin_3_0= rulePose ) )
                    // InternalKinematicsParser.g:1675:5: (lv_origin_3_0= rulePose )
                    {
                    // InternalKinematicsParser.g:1675:5: (lv_origin_3_0= rulePose )
                    // InternalKinematicsParser.g:1676:6: lv_origin_3_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getInertialAccess().getOriginPoseParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_45);
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

            // InternalKinematicsParser.g:1694:3: (otherlv_4= Mass ( (lv_mass_5_0= ruleMass ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Mass) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalKinematicsParser.g:1695:4: otherlv_4= Mass ( (lv_mass_5_0= ruleMass ) )
                    {
                    otherlv_4=(Token)match(input,Mass,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getInertialAccess().getMassKeyword_3_0());
                    			
                    // InternalKinematicsParser.g:1699:4: ( (lv_mass_5_0= ruleMass ) )
                    // InternalKinematicsParser.g:1700:5: (lv_mass_5_0= ruleMass )
                    {
                    // InternalKinematicsParser.g:1700:5: (lv_mass_5_0= ruleMass )
                    // InternalKinematicsParser.g:1701:6: lv_mass_5_0= ruleMass
                    {

                    						newCompositeNode(grammarAccess.getInertialAccess().getMassMassParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_46);
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

            // InternalKinematicsParser.g:1719:3: (otherlv_6= Inertia ( (lv_inertia_7_0= ruleInertia ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Inertia) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalKinematicsParser.g:1720:4: otherlv_6= Inertia ( (lv_inertia_7_0= ruleInertia ) )
                    {
                    otherlv_6=(Token)match(input,Inertia,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getInertialAccess().getInertiaKeyword_4_0());
                    			
                    // InternalKinematicsParser.g:1724:4: ( (lv_inertia_7_0= ruleInertia ) )
                    // InternalKinematicsParser.g:1725:5: (lv_inertia_7_0= ruleInertia )
                    {
                    // InternalKinematicsParser.g:1725:5: (lv_inertia_7_0= ruleInertia )
                    // InternalKinematicsParser.g:1726:6: lv_inertia_7_0= ruleInertia
                    {

                    						newCompositeNode(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
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
    // InternalKinematicsParser.g:1752:1: entryRuleVisual returns [EObject current=null] : iv_ruleVisual= ruleVisual EOF ;
    public final EObject entryRuleVisual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisual = null;


        try {
            // InternalKinematicsParser.g:1752:47: (iv_ruleVisual= ruleVisual EOF )
            // InternalKinematicsParser.g:1753:2: iv_ruleVisual= ruleVisual EOF
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
    // InternalKinematicsParser.g:1759:1: ruleVisual returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END ) ;
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
            // InternalKinematicsParser.g:1765:2: ( (this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END ) )
            // InternalKinematicsParser.g:1766:2: (this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END )
            {
            // InternalKinematicsParser.g:1766:2: (this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END )
            // InternalKinematicsParser.g:1767:3: this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_47); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getVisualAccess().getBEGINTerminalRuleCall_0());
            		
            // InternalKinematicsParser.g:1771:3: (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Origin) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalKinematicsParser.g:1772:4: otherlv_1= Origin ( (lv_origin_2_0= rulePose ) )
                    {
                    otherlv_1=(Token)match(input,Origin,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getVisualAccess().getOriginKeyword_1_0());
                    			
                    // InternalKinematicsParser.g:1776:4: ( (lv_origin_2_0= rulePose ) )
                    // InternalKinematicsParser.g:1777:5: (lv_origin_2_0= rulePose )
                    {
                    // InternalKinematicsParser.g:1777:5: (lv_origin_2_0= rulePose )
                    // InternalKinematicsParser.g:1778:6: lv_origin_2_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getVisualAccess().getOriginPoseParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_48);
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
            		
            // InternalKinematicsParser.g:1800:3: ( (lv_geometry_4_0= ruleGeometry ) )
            // InternalKinematicsParser.g:1801:4: (lv_geometry_4_0= ruleGeometry )
            {
            // InternalKinematicsParser.g:1801:4: (lv_geometry_4_0= ruleGeometry )
            // InternalKinematicsParser.g:1802:5: lv_geometry_4_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
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
    // InternalKinematicsParser.g:1827:1: entryRuleCollision returns [EObject current=null] : iv_ruleCollision= ruleCollision EOF ;
    public final EObject entryRuleCollision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollision = null;


        try {
            // InternalKinematicsParser.g:1827:50: (iv_ruleCollision= ruleCollision EOF )
            // InternalKinematicsParser.g:1828:2: iv_ruleCollision= ruleCollision EOF
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
    // InternalKinematicsParser.g:1834:1: ruleCollision returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END ) ;
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
            // InternalKinematicsParser.g:1840:2: ( (this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END ) )
            // InternalKinematicsParser.g:1841:2: (this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END )
            {
            // InternalKinematicsParser.g:1841:2: (this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END )
            // InternalKinematicsParser.g:1842:3: this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_47); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getCollisionAccess().getBEGINTerminalRuleCall_0());
            		
            // InternalKinematicsParser.g:1846:3: (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Origin) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalKinematicsParser.g:1847:4: otherlv_1= Origin ( (lv_origin_2_0= rulePose ) )
                    {
                    otherlv_1=(Token)match(input,Origin,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getCollisionAccess().getOriginKeyword_1_0());
                    			
                    // InternalKinematicsParser.g:1851:4: ( (lv_origin_2_0= rulePose ) )
                    // InternalKinematicsParser.g:1852:5: (lv_origin_2_0= rulePose )
                    {
                    // InternalKinematicsParser.g:1852:5: (lv_origin_2_0= rulePose )
                    // InternalKinematicsParser.g:1853:6: lv_origin_2_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getCollisionAccess().getOriginPoseParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_48);
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
            		
            // InternalKinematicsParser.g:1875:3: ( (lv_geometry_4_0= ruleGeometry ) )
            // InternalKinematicsParser.g:1876:4: (lv_geometry_4_0= ruleGeometry )
            {
            // InternalKinematicsParser.g:1876:4: (lv_geometry_4_0= ruleGeometry )
            // InternalKinematicsParser.g:1877:5: lv_geometry_4_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
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
    // InternalKinematicsParser.g:1902:1: entryRuleMass returns [EObject current=null] : iv_ruleMass= ruleMass EOF ;
    public final EObject entryRuleMass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMass = null;


        try {
            // InternalKinematicsParser.g:1902:45: (iv_ruleMass= ruleMass EOF )
            // InternalKinematicsParser.g:1903:2: iv_ruleMass= ruleMass EOF
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
    // InternalKinematicsParser.g:1909:1: ruleMass returns [EObject current=null] : ( () ( (lv_value_1_0= ruleDouble0 ) ) ) ;
    public final EObject ruleMass() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:1915:2: ( ( () ( (lv_value_1_0= ruleDouble0 ) ) ) )
            // InternalKinematicsParser.g:1916:2: ( () ( (lv_value_1_0= ruleDouble0 ) ) )
            {
            // InternalKinematicsParser.g:1916:2: ( () ( (lv_value_1_0= ruleDouble0 ) ) )
            // InternalKinematicsParser.g:1917:3: () ( (lv_value_1_0= ruleDouble0 ) )
            {
            // InternalKinematicsParser.g:1917:3: ()
            // InternalKinematicsParser.g:1918:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMassAccess().getMassAction_0(),
            					current);
            			

            }

            // InternalKinematicsParser.g:1924:3: ( (lv_value_1_0= ruleDouble0 ) )
            // InternalKinematicsParser.g:1925:4: (lv_value_1_0= ruleDouble0 )
            {
            // InternalKinematicsParser.g:1925:4: (lv_value_1_0= ruleDouble0 )
            // InternalKinematicsParser.g:1926:5: lv_value_1_0= ruleDouble0
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
    // InternalKinematicsParser.g:1947:1: entryRuleInertia returns [EObject current=null] : iv_ruleInertia= ruleInertia EOF ;
    public final EObject entryRuleInertia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertia = null;


        try {
            // InternalKinematicsParser.g:1947:48: (iv_ruleInertia= ruleInertia EOF )
            // InternalKinematicsParser.g:1948:2: iv_ruleInertia= ruleInertia EOF
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
    // InternalKinematicsParser.g:1954:1: ruleInertia returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Ixx ( (lv_ixx_3_0= ruleDouble0 ) ) )? (otherlv_4= Ixy ( (lv_ixy_5_0= ruleDouble0 ) ) )? (otherlv_6= Ixz ( (lv_ixz_7_0= ruleDouble0 ) ) )? (otherlv_8= Iyy ( (lv_iyy_9_0= ruleDouble0 ) ) )? (otherlv_10= Iyz ( (lv_iyz_11_0= ruleDouble0 ) ) )? (otherlv_12= Izz ( (lv_izz_13_0= ruleDouble0 ) ) )? this_END_14= RULE_END ) ;
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
            // InternalKinematicsParser.g:1960:2: ( ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Ixx ( (lv_ixx_3_0= ruleDouble0 ) ) )? (otherlv_4= Ixy ( (lv_ixy_5_0= ruleDouble0 ) ) )? (otherlv_6= Ixz ( (lv_ixz_7_0= ruleDouble0 ) ) )? (otherlv_8= Iyy ( (lv_iyy_9_0= ruleDouble0 ) ) )? (otherlv_10= Iyz ( (lv_iyz_11_0= ruleDouble0 ) ) )? (otherlv_12= Izz ( (lv_izz_13_0= ruleDouble0 ) ) )? this_END_14= RULE_END ) )
            // InternalKinematicsParser.g:1961:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Ixx ( (lv_ixx_3_0= ruleDouble0 ) ) )? (otherlv_4= Ixy ( (lv_ixy_5_0= ruleDouble0 ) ) )? (otherlv_6= Ixz ( (lv_ixz_7_0= ruleDouble0 ) ) )? (otherlv_8= Iyy ( (lv_iyy_9_0= ruleDouble0 ) ) )? (otherlv_10= Iyz ( (lv_iyz_11_0= ruleDouble0 ) ) )? (otherlv_12= Izz ( (lv_izz_13_0= ruleDouble0 ) ) )? this_END_14= RULE_END )
            {
            // InternalKinematicsParser.g:1961:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Ixx ( (lv_ixx_3_0= ruleDouble0 ) ) )? (otherlv_4= Ixy ( (lv_ixy_5_0= ruleDouble0 ) ) )? (otherlv_6= Ixz ( (lv_ixz_7_0= ruleDouble0 ) ) )? (otherlv_8= Iyy ( (lv_iyy_9_0= ruleDouble0 ) ) )? (otherlv_10= Iyz ( (lv_iyz_11_0= ruleDouble0 ) ) )? (otherlv_12= Izz ( (lv_izz_13_0= ruleDouble0 ) ) )? this_END_14= RULE_END )
            // InternalKinematicsParser.g:1962:3: () this_BEGIN_1= RULE_BEGIN (otherlv_2= Ixx ( (lv_ixx_3_0= ruleDouble0 ) ) )? (otherlv_4= Ixy ( (lv_ixy_5_0= ruleDouble0 ) ) )? (otherlv_6= Ixz ( (lv_ixz_7_0= ruleDouble0 ) ) )? (otherlv_8= Iyy ( (lv_iyy_9_0= ruleDouble0 ) ) )? (otherlv_10= Iyz ( (lv_iyz_11_0= ruleDouble0 ) ) )? (otherlv_12= Izz ( (lv_izz_13_0= ruleDouble0 ) ) )? this_END_14= RULE_END
            {
            // InternalKinematicsParser.g:1962:3: ()
            // InternalKinematicsParser.g:1963:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInertiaAccess().getInertiaAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_49); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getInertiaAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalKinematicsParser.g:1973:3: (otherlv_2= Ixx ( (lv_ixx_3_0= ruleDouble0 ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==Ixx) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalKinematicsParser.g:1974:4: otherlv_2= Ixx ( (lv_ixx_3_0= ruleDouble0 ) )
                    {
                    otherlv_2=(Token)match(input,Ixx,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getInertiaAccess().getIxxKeyword_2_0());
                    			
                    // InternalKinematicsParser.g:1978:4: ( (lv_ixx_3_0= ruleDouble0 ) )
                    // InternalKinematicsParser.g:1979:5: (lv_ixx_3_0= ruleDouble0 )
                    {
                    // InternalKinematicsParser.g:1979:5: (lv_ixx_3_0= ruleDouble0 )
                    // InternalKinematicsParser.g:1980:6: lv_ixx_3_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIxxDouble0ParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_50);
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

            // InternalKinematicsParser.g:1998:3: (otherlv_4= Ixy ( (lv_ixy_5_0= ruleDouble0 ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Ixy) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalKinematicsParser.g:1999:4: otherlv_4= Ixy ( (lv_ixy_5_0= ruleDouble0 ) )
                    {
                    otherlv_4=(Token)match(input,Ixy,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getInertiaAccess().getIxyKeyword_3_0());
                    			
                    // InternalKinematicsParser.g:2003:4: ( (lv_ixy_5_0= ruleDouble0 ) )
                    // InternalKinematicsParser.g:2004:5: (lv_ixy_5_0= ruleDouble0 )
                    {
                    // InternalKinematicsParser.g:2004:5: (lv_ixy_5_0= ruleDouble0 )
                    // InternalKinematicsParser.g:2005:6: lv_ixy_5_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIxyDouble0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_51);
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

            // InternalKinematicsParser.g:2023:3: (otherlv_6= Ixz ( (lv_ixz_7_0= ruleDouble0 ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==Ixz) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalKinematicsParser.g:2024:4: otherlv_6= Ixz ( (lv_ixz_7_0= ruleDouble0 ) )
                    {
                    otherlv_6=(Token)match(input,Ixz,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getInertiaAccess().getIxzKeyword_4_0());
                    			
                    // InternalKinematicsParser.g:2028:4: ( (lv_ixz_7_0= ruleDouble0 ) )
                    // InternalKinematicsParser.g:2029:5: (lv_ixz_7_0= ruleDouble0 )
                    {
                    // InternalKinematicsParser.g:2029:5: (lv_ixz_7_0= ruleDouble0 )
                    // InternalKinematicsParser.g:2030:6: lv_ixz_7_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIxzDouble0ParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_52);
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

            // InternalKinematicsParser.g:2048:3: (otherlv_8= Iyy ( (lv_iyy_9_0= ruleDouble0 ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Iyy) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalKinematicsParser.g:2049:4: otherlv_8= Iyy ( (lv_iyy_9_0= ruleDouble0 ) )
                    {
                    otherlv_8=(Token)match(input,Iyy,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getInertiaAccess().getIyyKeyword_5_0());
                    			
                    // InternalKinematicsParser.g:2053:4: ( (lv_iyy_9_0= ruleDouble0 ) )
                    // InternalKinematicsParser.g:2054:5: (lv_iyy_9_0= ruleDouble0 )
                    {
                    // InternalKinematicsParser.g:2054:5: (lv_iyy_9_0= ruleDouble0 )
                    // InternalKinematicsParser.g:2055:6: lv_iyy_9_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIyyDouble0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_53);
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

            // InternalKinematicsParser.g:2073:3: (otherlv_10= Iyz ( (lv_iyz_11_0= ruleDouble0 ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Iyz) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalKinematicsParser.g:2074:4: otherlv_10= Iyz ( (lv_iyz_11_0= ruleDouble0 ) )
                    {
                    otherlv_10=(Token)match(input,Iyz,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getInertiaAccess().getIyzKeyword_6_0());
                    			
                    // InternalKinematicsParser.g:2078:4: ( (lv_iyz_11_0= ruleDouble0 ) )
                    // InternalKinematicsParser.g:2079:5: (lv_iyz_11_0= ruleDouble0 )
                    {
                    // InternalKinematicsParser.g:2079:5: (lv_iyz_11_0= ruleDouble0 )
                    // InternalKinematicsParser.g:2080:6: lv_iyz_11_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIyzDouble0ParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_54);
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

            // InternalKinematicsParser.g:2098:3: (otherlv_12= Izz ( (lv_izz_13_0= ruleDouble0 ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==Izz) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalKinematicsParser.g:2099:4: otherlv_12= Izz ( (lv_izz_13_0= ruleDouble0 ) )
                    {
                    otherlv_12=(Token)match(input,Izz,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getInertiaAccess().getIzzKeyword_7_0());
                    			
                    // InternalKinematicsParser.g:2103:4: ( (lv_izz_13_0= ruleDouble0 ) )
                    // InternalKinematicsParser.g:2104:5: (lv_izz_13_0= ruleDouble0 )
                    {
                    // InternalKinematicsParser.g:2104:5: (lv_izz_13_0= ruleDouble0 )
                    // InternalKinematicsParser.g:2105:6: lv_izz_13_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIzzDouble0ParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_12);
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
    // InternalKinematicsParser.g:2131:1: entryRuleGeometry returns [EObject current=null] : iv_ruleGeometry= ruleGeometry EOF ;
    public final EObject entryRuleGeometry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeometry = null;


        try {
            // InternalKinematicsParser.g:2131:49: (iv_ruleGeometry= ruleGeometry EOF )
            // InternalKinematicsParser.g:2132:2: iv_ruleGeometry= ruleGeometry EOF
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
    // InternalKinematicsParser.g:2138:1: ruleGeometry returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Box ( (lv_box_3_0= ruleBox ) ) )? (otherlv_4= Cylinder ( (lv_cylinder_5_0= ruleCylinder ) ) )? (otherlv_6= Sphere ( (lv_sphere_7_0= ruleSphere ) ) )? (otherlv_8= Mesh ( (lv_mesh_9_0= ruleMesh ) ) )? this_END_10= RULE_END ) ;
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
            // InternalKinematicsParser.g:2144:2: ( ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Box ( (lv_box_3_0= ruleBox ) ) )? (otherlv_4= Cylinder ( (lv_cylinder_5_0= ruleCylinder ) ) )? (otherlv_6= Sphere ( (lv_sphere_7_0= ruleSphere ) ) )? (otherlv_8= Mesh ( (lv_mesh_9_0= ruleMesh ) ) )? this_END_10= RULE_END ) )
            // InternalKinematicsParser.g:2145:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Box ( (lv_box_3_0= ruleBox ) ) )? (otherlv_4= Cylinder ( (lv_cylinder_5_0= ruleCylinder ) ) )? (otherlv_6= Sphere ( (lv_sphere_7_0= ruleSphere ) ) )? (otherlv_8= Mesh ( (lv_mesh_9_0= ruleMesh ) ) )? this_END_10= RULE_END )
            {
            // InternalKinematicsParser.g:2145:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Box ( (lv_box_3_0= ruleBox ) ) )? (otherlv_4= Cylinder ( (lv_cylinder_5_0= ruleCylinder ) ) )? (otherlv_6= Sphere ( (lv_sphere_7_0= ruleSphere ) ) )? (otherlv_8= Mesh ( (lv_mesh_9_0= ruleMesh ) ) )? this_END_10= RULE_END )
            // InternalKinematicsParser.g:2146:3: () this_BEGIN_1= RULE_BEGIN (otherlv_2= Box ( (lv_box_3_0= ruleBox ) ) )? (otherlv_4= Cylinder ( (lv_cylinder_5_0= ruleCylinder ) ) )? (otherlv_6= Sphere ( (lv_sphere_7_0= ruleSphere ) ) )? (otherlv_8= Mesh ( (lv_mesh_9_0= ruleMesh ) ) )? this_END_10= RULE_END
            {
            // InternalKinematicsParser.g:2146:3: ()
            // InternalKinematicsParser.g:2147:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGeometryAccess().getGeometryAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_55); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getGeometryAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalKinematicsParser.g:2157:3: (otherlv_2= Box ( (lv_box_3_0= ruleBox ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Box) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalKinematicsParser.g:2158:4: otherlv_2= Box ( (lv_box_3_0= ruleBox ) )
                    {
                    otherlv_2=(Token)match(input,Box,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getGeometryAccess().getBoxKeyword_2_0());
                    			
                    // InternalKinematicsParser.g:2162:4: ( (lv_box_3_0= ruleBox ) )
                    // InternalKinematicsParser.g:2163:5: (lv_box_3_0= ruleBox )
                    {
                    // InternalKinematicsParser.g:2163:5: (lv_box_3_0= ruleBox )
                    // InternalKinematicsParser.g:2164:6: lv_box_3_0= ruleBox
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getBoxBoxParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_56);
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

            // InternalKinematicsParser.g:2182:3: (otherlv_4= Cylinder ( (lv_cylinder_5_0= ruleCylinder ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Cylinder) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalKinematicsParser.g:2183:4: otherlv_4= Cylinder ( (lv_cylinder_5_0= ruleCylinder ) )
                    {
                    otherlv_4=(Token)match(input,Cylinder,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getGeometryAccess().getCylinderKeyword_3_0());
                    			
                    // InternalKinematicsParser.g:2187:4: ( (lv_cylinder_5_0= ruleCylinder ) )
                    // InternalKinematicsParser.g:2188:5: (lv_cylinder_5_0= ruleCylinder )
                    {
                    // InternalKinematicsParser.g:2188:5: (lv_cylinder_5_0= ruleCylinder )
                    // InternalKinematicsParser.g:2189:6: lv_cylinder_5_0= ruleCylinder
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getCylinderCylinderParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_57);
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

            // InternalKinematicsParser.g:2207:3: (otherlv_6= Sphere ( (lv_sphere_7_0= ruleSphere ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==Sphere) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalKinematicsParser.g:2208:4: otherlv_6= Sphere ( (lv_sphere_7_0= ruleSphere ) )
                    {
                    otherlv_6=(Token)match(input,Sphere,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getGeometryAccess().getSphereKeyword_4_0());
                    			
                    // InternalKinematicsParser.g:2212:4: ( (lv_sphere_7_0= ruleSphere ) )
                    // InternalKinematicsParser.g:2213:5: (lv_sphere_7_0= ruleSphere )
                    {
                    // InternalKinematicsParser.g:2213:5: (lv_sphere_7_0= ruleSphere )
                    // InternalKinematicsParser.g:2214:6: lv_sphere_7_0= ruleSphere
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getSphereSphereParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_58);
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

            // InternalKinematicsParser.g:2232:3: (otherlv_8= Mesh ( (lv_mesh_9_0= ruleMesh ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==Mesh) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalKinematicsParser.g:2233:4: otherlv_8= Mesh ( (lv_mesh_9_0= ruleMesh ) )
                    {
                    otherlv_8=(Token)match(input,Mesh,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getGeometryAccess().getMeshKeyword_5_0());
                    			
                    // InternalKinematicsParser.g:2237:4: ( (lv_mesh_9_0= ruleMesh ) )
                    // InternalKinematicsParser.g:2238:5: (lv_mesh_9_0= ruleMesh )
                    {
                    // InternalKinematicsParser.g:2238:5: (lv_mesh_9_0= ruleMesh )
                    // InternalKinematicsParser.g:2239:6: lv_mesh_9_0= ruleMesh
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getMeshMeshParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
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
    // InternalKinematicsParser.g:2265:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // InternalKinematicsParser.g:2265:44: (iv_ruleBox= ruleBox EOF )
            // InternalKinematicsParser.g:2266:2: iv_ruleBox= ruleBox EOF
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
    // InternalKinematicsParser.g:2272:1: ruleBox returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN otherlv_2= Size ( (lv_size_3_0= ruleParameterString ) ) this_END_4= RULE_END ) ;
    public final EObject ruleBox() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token this_END_4=null;
        EObject lv_size_3_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:2278:2: ( ( () this_BEGIN_1= RULE_BEGIN otherlv_2= Size ( (lv_size_3_0= ruleParameterString ) ) this_END_4= RULE_END ) )
            // InternalKinematicsParser.g:2279:2: ( () this_BEGIN_1= RULE_BEGIN otherlv_2= Size ( (lv_size_3_0= ruleParameterString ) ) this_END_4= RULE_END )
            {
            // InternalKinematicsParser.g:2279:2: ( () this_BEGIN_1= RULE_BEGIN otherlv_2= Size ( (lv_size_3_0= ruleParameterString ) ) this_END_4= RULE_END )
            // InternalKinematicsParser.g:2280:3: () this_BEGIN_1= RULE_BEGIN otherlv_2= Size ( (lv_size_3_0= ruleParameterString ) ) this_END_4= RULE_END
            {
            // InternalKinematicsParser.g:2280:3: ()
            // InternalKinematicsParser.g:2281:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoxAccess().getBoxAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_59); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getBoxAccess().getBEGINTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,Size,FOLLOW_60); 

            			newLeafNode(otherlv_2, grammarAccess.getBoxAccess().getSizeKeyword_2());
            		
            // InternalKinematicsParser.g:2295:3: ( (lv_size_3_0= ruleParameterString ) )
            // InternalKinematicsParser.g:2296:4: (lv_size_3_0= ruleParameterString )
            {
            // InternalKinematicsParser.g:2296:4: (lv_size_3_0= ruleParameterString )
            // InternalKinematicsParser.g:2297:5: lv_size_3_0= ruleParameterString
            {

            					newCompositeNode(grammarAccess.getBoxAccess().getSizeParameterStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_size_3_0=ruleParameterString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoxRule());
            					}
            					set(
            						current,
            						"size",
            						lv_size_3_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.ParameterString");
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
    // InternalKinematicsParser.g:2322:1: entryRuleCylinder returns [EObject current=null] : iv_ruleCylinder= ruleCylinder EOF ;
    public final EObject entryRuleCylinder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCylinder = null;


        try {
            // InternalKinematicsParser.g:2322:49: (iv_ruleCylinder= ruleCylinder EOF )
            // InternalKinematicsParser.g:2323:2: iv_ruleCylinder= ruleCylinder EOF
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
    // InternalKinematicsParser.g:2329:1: ruleCylinder returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN otherlv_1= Length ( (lv_length_2_0= ruleDouble0 ) ) otherlv_3= Radius ( (lv_radius_4_0= ruleDouble0 ) ) this_END_5= RULE_END ) ;
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
            // InternalKinematicsParser.g:2335:2: ( (this_BEGIN_0= RULE_BEGIN otherlv_1= Length ( (lv_length_2_0= ruleDouble0 ) ) otherlv_3= Radius ( (lv_radius_4_0= ruleDouble0 ) ) this_END_5= RULE_END ) )
            // InternalKinematicsParser.g:2336:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Length ( (lv_length_2_0= ruleDouble0 ) ) otherlv_3= Radius ( (lv_radius_4_0= ruleDouble0 ) ) this_END_5= RULE_END )
            {
            // InternalKinematicsParser.g:2336:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Length ( (lv_length_2_0= ruleDouble0 ) ) otherlv_3= Radius ( (lv_radius_4_0= ruleDouble0 ) ) this_END_5= RULE_END )
            // InternalKinematicsParser.g:2337:3: this_BEGIN_0= RULE_BEGIN otherlv_1= Length ( (lv_length_2_0= ruleDouble0 ) ) otherlv_3= Radius ( (lv_radius_4_0= ruleDouble0 ) ) this_END_5= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_61); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getCylinderAccess().getBEGINTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,Length,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCylinderAccess().getLengthKeyword_1());
            		
            // InternalKinematicsParser.g:2345:3: ( (lv_length_2_0= ruleDouble0 ) )
            // InternalKinematicsParser.g:2346:4: (lv_length_2_0= ruleDouble0 )
            {
            // InternalKinematicsParser.g:2346:4: (lv_length_2_0= ruleDouble0 )
            // InternalKinematicsParser.g:2347:5: lv_length_2_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getCylinderAccess().getLengthDouble0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_62);
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

            otherlv_3=(Token)match(input,Radius,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getCylinderAccess().getRadiusKeyword_3());
            		
            // InternalKinematicsParser.g:2368:3: ( (lv_radius_4_0= ruleDouble0 ) )
            // InternalKinematicsParser.g:2369:4: (lv_radius_4_0= ruleDouble0 )
            {
            // InternalKinematicsParser.g:2369:4: (lv_radius_4_0= ruleDouble0 )
            // InternalKinematicsParser.g:2370:5: lv_radius_4_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getCylinderAccess().getRadiusDouble0ParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
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
    // InternalKinematicsParser.g:2395:1: entryRuleSphere returns [EObject current=null] : iv_ruleSphere= ruleSphere EOF ;
    public final EObject entryRuleSphere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSphere = null;


        try {
            // InternalKinematicsParser.g:2395:47: (iv_ruleSphere= ruleSphere EOF )
            // InternalKinematicsParser.g:2396:2: iv_ruleSphere= ruleSphere EOF
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
    // InternalKinematicsParser.g:2402:1: ruleSphere returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN otherlv_1= Radius ( (lv_radius_2_0= ruleDouble0 ) ) this_END_3= RULE_END ) ;
    public final EObject ruleSphere() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token otherlv_1=null;
        Token this_END_3=null;
        AntlrDatatypeRuleToken lv_radius_2_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:2408:2: ( (this_BEGIN_0= RULE_BEGIN otherlv_1= Radius ( (lv_radius_2_0= ruleDouble0 ) ) this_END_3= RULE_END ) )
            // InternalKinematicsParser.g:2409:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Radius ( (lv_radius_2_0= ruleDouble0 ) ) this_END_3= RULE_END )
            {
            // InternalKinematicsParser.g:2409:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Radius ( (lv_radius_2_0= ruleDouble0 ) ) this_END_3= RULE_END )
            // InternalKinematicsParser.g:2410:3: this_BEGIN_0= RULE_BEGIN otherlv_1= Radius ( (lv_radius_2_0= ruleDouble0 ) ) this_END_3= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_62); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getSphereAccess().getBEGINTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,Radius,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getSphereAccess().getRadiusKeyword_1());
            		
            // InternalKinematicsParser.g:2418:3: ( (lv_radius_2_0= ruleDouble0 ) )
            // InternalKinematicsParser.g:2419:4: (lv_radius_2_0= ruleDouble0 )
            {
            // InternalKinematicsParser.g:2419:4: (lv_radius_2_0= ruleDouble0 )
            // InternalKinematicsParser.g:2420:5: lv_radius_2_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getSphereAccess().getRadiusDouble0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
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
    // InternalKinematicsParser.g:2445:1: entryRuleMesh returns [EObject current=null] : iv_ruleMesh= ruleMesh EOF ;
    public final EObject entryRuleMesh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMesh = null;


        try {
            // InternalKinematicsParser.g:2445:45: (iv_ruleMesh= ruleMesh EOF )
            // InternalKinematicsParser.g:2446:2: iv_ruleMesh= ruleMesh EOF
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
    // InternalKinematicsParser.g:2452:1: ruleMesh returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN otherlv_1= Filename ( (lv_filename_2_0= RULE_STRING ) ) (otherlv_3= Scale ( (lv_scale_4_0= ruleDouble0 ) ) )? this_END_5= RULE_END ) ;
    public final EObject ruleMesh() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token otherlv_1=null;
        Token lv_filename_2_0=null;
        Token otherlv_3=null;
        Token this_END_5=null;
        AntlrDatatypeRuleToken lv_scale_4_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:2458:2: ( (this_BEGIN_0= RULE_BEGIN otherlv_1= Filename ( (lv_filename_2_0= RULE_STRING ) ) (otherlv_3= Scale ( (lv_scale_4_0= ruleDouble0 ) ) )? this_END_5= RULE_END ) )
            // InternalKinematicsParser.g:2459:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Filename ( (lv_filename_2_0= RULE_STRING ) ) (otherlv_3= Scale ( (lv_scale_4_0= ruleDouble0 ) ) )? this_END_5= RULE_END )
            {
            // InternalKinematicsParser.g:2459:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Filename ( (lv_filename_2_0= RULE_STRING ) ) (otherlv_3= Scale ( (lv_scale_4_0= ruleDouble0 ) ) )? this_END_5= RULE_END )
            // InternalKinematicsParser.g:2460:3: this_BEGIN_0= RULE_BEGIN otherlv_1= Filename ( (lv_filename_2_0= RULE_STRING ) ) (otherlv_3= Scale ( (lv_scale_4_0= ruleDouble0 ) ) )? this_END_5= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_63); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getMeshAccess().getBEGINTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,Filename,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getMeshAccess().getFilenameKeyword_1());
            		
            // InternalKinematicsParser.g:2468:3: ( (lv_filename_2_0= RULE_STRING ) )
            // InternalKinematicsParser.g:2469:4: (lv_filename_2_0= RULE_STRING )
            {
            // InternalKinematicsParser.g:2469:4: (lv_filename_2_0= RULE_STRING )
            // InternalKinematicsParser.g:2470:5: lv_filename_2_0= RULE_STRING
            {
            lv_filename_2_0=(Token)match(input,RULE_STRING,FOLLOW_64); 

            					newLeafNode(lv_filename_2_0, grammarAccess.getMeshAccess().getFilenameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeshRule());
            					}
            					setWithLastConsumed(
            						current,
            						"filename",
            						lv_filename_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalKinematicsParser.g:2486:3: (otherlv_3= Scale ( (lv_scale_4_0= ruleDouble0 ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==Scale) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalKinematicsParser.g:2487:4: otherlv_3= Scale ( (lv_scale_4_0= ruleDouble0 ) )
                    {
                    otherlv_3=(Token)match(input,Scale,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeshAccess().getScaleKeyword_3_0());
                    			
                    // InternalKinematicsParser.g:2491:4: ( (lv_scale_4_0= ruleDouble0 ) )
                    // InternalKinematicsParser.g:2492:5: (lv_scale_4_0= ruleDouble0 )
                    {
                    // InternalKinematicsParser.g:2492:5: (lv_scale_4_0= ruleDouble0 )
                    // InternalKinematicsParser.g:2493:6: lv_scale_4_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getMeshAccess().getScaleDouble0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_scale_4_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeshRule());
                    						}
                    						set(
                    							current,
                    							"scale",
                    							lv_scale_4_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
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


    // $ANTLR start "entryRuleDouble0"
    // InternalKinematicsParser.g:2519:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalKinematicsParser.g:2519:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalKinematicsParser.g:2520:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalKinematicsParser.g:2526:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalKinematicsParser.g:2532:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalKinematicsParser.g:2533:2: this_DOUBLE_0= RULE_DOUBLE
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x1000000800082010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x1000000800080010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x1010000800000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x1010000800000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x1000000020020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x1000000800000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000020004004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x1000000000008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x4800000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0010000000020002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x1010000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x4020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x4800000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x1000000410000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x1000000010000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x1000000001000440L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x1000000001000040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x1000000000000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x100A000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1008000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x1000000240010800L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x1000000240000800L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x1000000200000800L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x1000000000000800L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x1000001000101000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1000001000001000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1000000000001000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000100200L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x1001F80000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x1001F00000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x1001E00000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x1001C00000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x1001800000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x1001000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x1000042000800080L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x1000002000800080L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x1000002000800000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x1000002000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x5000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x1000000100000000L});

}