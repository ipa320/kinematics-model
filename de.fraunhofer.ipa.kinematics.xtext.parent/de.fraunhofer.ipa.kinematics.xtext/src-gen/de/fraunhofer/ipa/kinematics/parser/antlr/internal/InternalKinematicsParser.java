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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_JOINTTYPE", "RULE_DOUBLE", "RULE_DIGIT", "RULE_BOOLEAN", "RULE_DECINT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'{'", "'name'", "'version'", "'macro'", "','", "'}'", "'macroCall'", "'body'", "'Macro'", "'parameter'", "'Parameter'", "'type'", "'value'", "'String'", "'LinkRef'", "'Pose'", "'Body'", "'link'", "'joint'", "'MacroCall'", "'ParameterCall'", "'Joint'", "'parent'", "'child'", "'origin'", "'axis'", "'limit'", "'Link'", "'inertial'", "'visual'", "'collision'", "'rpy'", "'xyz'", "'Vector3'", "'Limit'", "'effort'", "'lower'", "'upper'", "'velocity'", "'Inertial'", "'mass'", "'inertia'", "'Visual'", "'geometry'", "'Collision'", "'Mass'", "'Inertia'", "'ixx'", "'ixy'", "'ixz'", "'iyy'", "'iyz'", "'izz'", "'Geometry'", "'box'", "'cylinder'", "'sphere'", "'mesh'", "'Box'", "'size'", "'Cylinder'", "'length'", "'radius'", "'Sphere'", "'Mesh'", "'filename'", "'scale'"
    };
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
        	return "Robot";
       	}

       	@Override
       	protected KinematicsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRobot"
    // InternalKinematics.g:64:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalKinematics.g:64:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalKinematics.g:65:2: iv_ruleRobot= ruleRobot EOF
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
    // InternalKinematics.g:71:1: ruleRobot returns [EObject current=null] : ( () otherlv_1= 'Robot' otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'version' ( (lv_version_6_0= RULE_STRING ) ) )? (otherlv_7= 'macro' otherlv_8= '{' ( (lv_macro_9_0= ruleMacro ) ) (otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) ) )* otherlv_12= '}' )? (otherlv_13= 'macroCall' otherlv_14= '{' ( (lv_macroCall_15_0= ruleMacroCall ) ) (otherlv_16= ',' ( (lv_macroCall_17_0= ruleMacroCall ) ) )* otherlv_18= '}' )? (otherlv_19= 'body' ( (lv_body_20_0= ruleBody ) ) )? otherlv_21= '}' ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_version_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject lv_macro_9_0 = null;

        EObject lv_macro_11_0 = null;

        EObject lv_macroCall_15_0 = null;

        EObject lv_macroCall_17_0 = null;

        EObject lv_body_20_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:77:2: ( ( () otherlv_1= 'Robot' otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'version' ( (lv_version_6_0= RULE_STRING ) ) )? (otherlv_7= 'macro' otherlv_8= '{' ( (lv_macro_9_0= ruleMacro ) ) (otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) ) )* otherlv_12= '}' )? (otherlv_13= 'macroCall' otherlv_14= '{' ( (lv_macroCall_15_0= ruleMacroCall ) ) (otherlv_16= ',' ( (lv_macroCall_17_0= ruleMacroCall ) ) )* otherlv_18= '}' )? (otherlv_19= 'body' ( (lv_body_20_0= ruleBody ) ) )? otherlv_21= '}' ) )
            // InternalKinematics.g:78:2: ( () otherlv_1= 'Robot' otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'version' ( (lv_version_6_0= RULE_STRING ) ) )? (otherlv_7= 'macro' otherlv_8= '{' ( (lv_macro_9_0= ruleMacro ) ) (otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) ) )* otherlv_12= '}' )? (otherlv_13= 'macroCall' otherlv_14= '{' ( (lv_macroCall_15_0= ruleMacroCall ) ) (otherlv_16= ',' ( (lv_macroCall_17_0= ruleMacroCall ) ) )* otherlv_18= '}' )? (otherlv_19= 'body' ( (lv_body_20_0= ruleBody ) ) )? otherlv_21= '}' )
            {
            // InternalKinematics.g:78:2: ( () otherlv_1= 'Robot' otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'version' ( (lv_version_6_0= RULE_STRING ) ) )? (otherlv_7= 'macro' otherlv_8= '{' ( (lv_macro_9_0= ruleMacro ) ) (otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) ) )* otherlv_12= '}' )? (otherlv_13= 'macroCall' otherlv_14= '{' ( (lv_macroCall_15_0= ruleMacroCall ) ) (otherlv_16= ',' ( (lv_macroCall_17_0= ruleMacroCall ) ) )* otherlv_18= '}' )? (otherlv_19= 'body' ( (lv_body_20_0= ruleBody ) ) )? otherlv_21= '}' )
            // InternalKinematics.g:79:3: () otherlv_1= 'Robot' otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'version' ( (lv_version_6_0= RULE_STRING ) ) )? (otherlv_7= 'macro' otherlv_8= '{' ( (lv_macro_9_0= ruleMacro ) ) (otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) ) )* otherlv_12= '}' )? (otherlv_13= 'macroCall' otherlv_14= '{' ( (lv_macroCall_15_0= ruleMacroCall ) ) (otherlv_16= ',' ( (lv_macroCall_17_0= ruleMacroCall ) ) )* otherlv_18= '}' )? (otherlv_19= 'body' ( (lv_body_20_0= ruleBody ) ) )? otherlv_21= '}'
            {
            // InternalKinematics.g:79:3: ()
            // InternalKinematics.g:80:4: 
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
            		
            // InternalKinematics.g:98:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalKinematics.g:99:4: (lv_name_4_0= RULE_ID )
            {
            // InternalKinematics.g:99:4: (lv_name_4_0= RULE_ID )
            // InternalKinematics.g:100:5: lv_name_4_0= RULE_ID
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

            // InternalKinematics.g:116:3: (otherlv_5= 'version' ( (lv_version_6_0= RULE_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalKinematics.g:117:4: otherlv_5= 'version' ( (lv_version_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getRobotAccess().getVersionKeyword_5_0());
                    			
                    // InternalKinematics.g:121:4: ( (lv_version_6_0= RULE_STRING ) )
                    // InternalKinematics.g:122:5: (lv_version_6_0= RULE_STRING )
                    {
                    // InternalKinematics.g:122:5: (lv_version_6_0= RULE_STRING )
                    // InternalKinematics.g:123:6: lv_version_6_0= RULE_STRING
                    {
                    lv_version_6_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_version_6_0, grammarAccess.getRobotAccess().getVersionSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRobotRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"version",
                    							lv_version_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:140:3: (otherlv_7= 'macro' otherlv_8= '{' ( (lv_macro_9_0= ruleMacro ) ) (otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) ) )* otherlv_12= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKinematics.g:141:4: otherlv_7= 'macro' otherlv_8= '{' ( (lv_macro_9_0= ruleMacro ) ) (otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getRobotAccess().getMacroKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalKinematics.g:149:4: ( (lv_macro_9_0= ruleMacro ) )
                    // InternalKinematics.g:150:5: (lv_macro_9_0= ruleMacro )
                    {
                    // InternalKinematics.g:150:5: (lv_macro_9_0= ruleMacro )
                    // InternalKinematics.g:151:6: lv_macro_9_0= ruleMacro
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getMacroMacroParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_macro_9_0=ruleMacro();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    						}
                    						add(
                    							current,
                    							"macro",
                    							lv_macro_9_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Macro");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKinematics.g:168:4: (otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==21) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalKinematics.g:169:5: otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) )
                    	    {
                    	    otherlv_10=(Token)match(input,21,FOLLOW_9); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getRobotAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalKinematics.g:173:5: ( (lv_macro_11_0= ruleMacro ) )
                    	    // InternalKinematics.g:174:6: (lv_macro_11_0= ruleMacro )
                    	    {
                    	    // InternalKinematics.g:174:6: (lv_macro_11_0= ruleMacro )
                    	    // InternalKinematics.g:175:7: lv_macro_11_0= ruleMacro
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobotAccess().getMacroMacroParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_macro_11_0=ruleMacro();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRobotRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"macro",
                    	    								lv_macro_11_0,
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.Macro");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,22,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalKinematics.g:198:3: (otherlv_13= 'macroCall' otherlv_14= '{' ( (lv_macroCall_15_0= ruleMacroCall ) ) (otherlv_16= ',' ( (lv_macroCall_17_0= ruleMacroCall ) ) )* otherlv_18= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKinematics.g:199:4: otherlv_13= 'macroCall' otherlv_14= '{' ( (lv_macroCall_15_0= ruleMacroCall ) ) (otherlv_16= ',' ( (lv_macroCall_17_0= ruleMacroCall ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getRobotAccess().getMacroCallKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalKinematics.g:207:4: ( (lv_macroCall_15_0= ruleMacroCall ) )
                    // InternalKinematics.g:208:5: (lv_macroCall_15_0= ruleMacroCall )
                    {
                    // InternalKinematics.g:208:5: (lv_macroCall_15_0= ruleMacroCall )
                    // InternalKinematics.g:209:6: lv_macroCall_15_0= ruleMacroCall
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getMacroCallMacroCallParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_macroCall_15_0=ruleMacroCall();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    						}
                    						add(
                    							current,
                    							"macroCall",
                    							lv_macroCall_15_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.MacroCall");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKinematics.g:226:4: (otherlv_16= ',' ( (lv_macroCall_17_0= ruleMacroCall ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==21) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalKinematics.g:227:5: otherlv_16= ',' ( (lv_macroCall_17_0= ruleMacroCall ) )
                    	    {
                    	    otherlv_16=(Token)match(input,21,FOLLOW_12); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getRobotAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalKinematics.g:231:5: ( (lv_macroCall_17_0= ruleMacroCall ) )
                    	    // InternalKinematics.g:232:6: (lv_macroCall_17_0= ruleMacroCall )
                    	    {
                    	    // InternalKinematics.g:232:6: (lv_macroCall_17_0= ruleMacroCall )
                    	    // InternalKinematics.g:233:7: lv_macroCall_17_0= ruleMacroCall
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobotAccess().getMacroCallMacroCallParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_macroCall_17_0=ruleMacroCall();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRobotRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"macroCall",
                    	    								lv_macroCall_17_0,
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.MacroCall");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalKinematics.g:256:3: (otherlv_19= 'body' ( (lv_body_20_0= ruleBody ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKinematics.g:257:4: otherlv_19= 'body' ( (lv_body_20_0= ruleBody ) )
                    {
                    otherlv_19=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_19, grammarAccess.getRobotAccess().getBodyKeyword_8_0());
                    			
                    // InternalKinematics.g:261:4: ( (lv_body_20_0= ruleBody ) )
                    // InternalKinematics.g:262:5: (lv_body_20_0= ruleBody )
                    {
                    // InternalKinematics.g:262:5: (lv_body_20_0= ruleBody )
                    // InternalKinematics.g:263:6: lv_body_20_0= ruleBody
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getBodyBodyParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_body_20_0=ruleBody();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_20_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Body");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalKinematics.g:289:1: entryRuleMacro returns [EObject current=null] : iv_ruleMacro= ruleMacro EOF ;
    public final EObject entryRuleMacro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacro = null;


        try {
            // InternalKinematics.g:289:46: (iv_ruleMacro= ruleMacro EOF )
            // InternalKinematics.g:290:2: iv_ruleMacro= ruleMacro EOF
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
    // InternalKinematics.g:296:1: ruleMacro returns [EObject current=null] : (otherlv_0= 'Macro' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'body' ( (lv_body_11_0= ruleBody ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleMacro() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_parameter_6_0 = null;

        EObject lv_parameter_8_0 = null;

        EObject lv_body_11_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:302:2: ( (otherlv_0= 'Macro' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'body' ( (lv_body_11_0= ruleBody ) ) )? otherlv_12= '}' ) )
            // InternalKinematics.g:303:2: (otherlv_0= 'Macro' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'body' ( (lv_body_11_0= ruleBody ) ) )? otherlv_12= '}' )
            {
            // InternalKinematics.g:303:2: (otherlv_0= 'Macro' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'body' ( (lv_body_11_0= ruleBody ) ) )? otherlv_12= '}' )
            // InternalKinematics.g:304:3: otherlv_0= 'Macro' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'body' ( (lv_body_11_0= ruleBody ) ) )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMacroAccess().getMacroKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMacroAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMacroAccess().getNameKeyword_2());
            		
            // InternalKinematics.g:316:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalKinematics.g:317:4: (lv_name_3_0= RULE_ID )
            {
            // InternalKinematics.g:317:4: (lv_name_3_0= RULE_ID )
            // InternalKinematics.g:318:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_3_0, grammarAccess.getMacroAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMacroRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalKinematics.g:334:3: (otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalKinematics.g:335:4: otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getMacroAccess().getParameterKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,17,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getMacroAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalKinematics.g:343:4: ( (lv_parameter_6_0= ruleParameter ) )
                    // InternalKinematics.g:344:5: (lv_parameter_6_0= ruleParameter )
                    {
                    // InternalKinematics.g:344:5: (lv_parameter_6_0= ruleParameter )
                    // InternalKinematics.g:345:6: lv_parameter_6_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getMacroAccess().getParameterParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_parameter_6_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMacroRule());
                    						}
                    						add(
                    							current,
                    							"parameter",
                    							lv_parameter_6_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKinematics.g:362:4: (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==21) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalKinematics.g:363:5: otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,21,FOLLOW_17); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getMacroAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalKinematics.g:367:5: ( (lv_parameter_8_0= ruleParameter ) )
                    	    // InternalKinematics.g:368:6: (lv_parameter_8_0= ruleParameter )
                    	    {
                    	    // InternalKinematics.g:368:6: (lv_parameter_8_0= ruleParameter )
                    	    // InternalKinematics.g:369:7: lv_parameter_8_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getMacroAccess().getParameterParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_parameter_8_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMacroRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameter",
                    	    								lv_parameter_8_0,
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getMacroAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalKinematics.g:392:3: (otherlv_10= 'body' ( (lv_body_11_0= ruleBody ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKinematics.g:393:4: otherlv_10= 'body' ( (lv_body_11_0= ruleBody ) )
                    {
                    otherlv_10=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getMacroAccess().getBodyKeyword_5_0());
                    			
                    // InternalKinematics.g:397:4: ( (lv_body_11_0= ruleBody ) )
                    // InternalKinematics.g:398:5: (lv_body_11_0= ruleBody )
                    {
                    // InternalKinematics.g:398:5: (lv_body_11_0= ruleBody )
                    // InternalKinematics.g:399:6: lv_body_11_0= ruleBody
                    {

                    						newCompositeNode(grammarAccess.getMacroAccess().getBodyBodyParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_body_11_0=ruleBody();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMacroRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_11_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Body");
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
    // InternalKinematics.g:425:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalKinematics.g:425:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalKinematics.g:426:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalKinematics.g:432:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= 'Parameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) (otherlv_6= 'value' ( (lv_value_7_0= ruleParameterValue ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_type_5_0 = null;

        EObject lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:438:2: ( ( () otherlv_1= 'Parameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) (otherlv_6= 'value' ( (lv_value_7_0= ruleParameterValue ) ) )? otherlv_8= '}' ) )
            // InternalKinematics.g:439:2: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) (otherlv_6= 'value' ( (lv_value_7_0= ruleParameterValue ) ) )? otherlv_8= '}' )
            {
            // InternalKinematics.g:439:2: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) (otherlv_6= 'value' ( (lv_value_7_0= ruleParameterValue ) ) )? otherlv_8= '}' )
            // InternalKinematics.g:440:3: () otherlv_1= 'Parameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) (otherlv_6= 'value' ( (lv_value_7_0= ruleParameterValue ) ) )? otherlv_8= '}'
            {
            // InternalKinematics.g:440:3: ()
            // InternalKinematics.g:441:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getParameterKeyword_1());
            		
            // InternalKinematics.g:451:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalKinematics.g:452:4: (lv_name_2_0= RULE_ID )
            {
            // InternalKinematics.g:452:4: (lv_name_2_0= RULE_ID )
            // InternalKinematics.g:453:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

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

            otherlv_3=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getTypeKeyword_4());
            		
            // InternalKinematics.g:477:3: ( (lv_type_5_0= ruleParameterType ) )
            // InternalKinematics.g:478:4: (lv_type_5_0= ruleParameterType )
            {
            // InternalKinematics.g:478:4: (lv_type_5_0= ruleParameterType )
            // InternalKinematics.g:479:5: lv_type_5_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeParameterTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_20);
            lv_type_5_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKinematics.g:496:3: (otherlv_6= 'value' ( (lv_value_7_0= ruleParameterValue ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalKinematics.g:497:4: otherlv_6= 'value' ( (lv_value_7_0= ruleParameterValue ) )
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_21); 

                    				newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getValueKeyword_6_0());
                    			
                    // InternalKinematics.g:501:4: ( (lv_value_7_0= ruleParameterValue ) )
                    // InternalKinematics.g:502:5: (lv_value_7_0= ruleParameterValue )
                    {
                    // InternalKinematics.g:502:5: (lv_value_7_0= ruleParameterValue )
                    // InternalKinematics.g:503:6: lv_value_7_0= ruleParameterValue
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getValueParameterValueParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_value_7_0=ruleParameterValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.ParameterValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalKinematics.g:529:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalKinematics.g:529:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalKinematics.g:530:2: iv_ruleParameterValue= ruleParameterValue EOF
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
    // InternalKinematics.g:536:1: ruleParameterValue returns [EObject current=null] : ( ( (lv_value_0_0= RULE_ID ) ) | this_Pose_1= rulePose | this_LinkRef_2= ruleLinkRef ) ;
    public final EObject ruleParameterValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        EObject this_Pose_1 = null;

        EObject this_LinkRef_2 = null;



        	enterRule();

        try {
            // InternalKinematics.g:542:2: ( ( ( (lv_value_0_0= RULE_ID ) ) | this_Pose_1= rulePose | this_LinkRef_2= ruleLinkRef ) )
            // InternalKinematics.g:543:2: ( ( (lv_value_0_0= RULE_ID ) ) | this_Pose_1= rulePose | this_LinkRef_2= ruleLinkRef )
            {
            // InternalKinematics.g:543:2: ( ( (lv_value_0_0= RULE_ID ) ) | this_Pose_1= rulePose | this_LinkRef_2= ruleLinkRef )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt11=1;
                }
                break;
            case 32:
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
                    // InternalKinematics.g:544:3: ( (lv_value_0_0= RULE_ID ) )
                    {
                    // InternalKinematics.g:544:3: ( (lv_value_0_0= RULE_ID ) )
                    // InternalKinematics.g:545:4: (lv_value_0_0= RULE_ID )
                    {
                    // InternalKinematics.g:545:4: (lv_value_0_0= RULE_ID )
                    // InternalKinematics.g:546:5: lv_value_0_0= RULE_ID
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
                    // InternalKinematics.g:563:3: this_Pose_1= rulePose
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
                    // InternalKinematics.g:572:3: this_LinkRef_2= ruleLinkRef
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
    // InternalKinematics.g:584:1: entryRuleLinkRef returns [EObject current=null] : iv_ruleLinkRef= ruleLinkRef EOF ;
    public final EObject entryRuleLinkRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkRef = null;


        try {
            // InternalKinematics.g:584:48: (iv_ruleLinkRef= ruleLinkRef EOF )
            // InternalKinematics.g:585:2: iv_ruleLinkRef= ruleLinkRef EOF
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
    // InternalKinematics.g:591:1: ruleLinkRef returns [EObject current=null] : ( (otherlv_0= RULE_STRING ) ) ;
    public final EObject ruleLinkRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalKinematics.g:597:2: ( ( (otherlv_0= RULE_STRING ) ) )
            // InternalKinematics.g:598:2: ( (otherlv_0= RULE_STRING ) )
            {
            // InternalKinematics.g:598:2: ( (otherlv_0= RULE_STRING ) )
            // InternalKinematics.g:599:3: (otherlv_0= RULE_STRING )
            {
            // InternalKinematics.g:599:3: (otherlv_0= RULE_STRING )
            // InternalKinematics.g:600:4: otherlv_0= RULE_STRING
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
    // InternalKinematics.g:614:1: entryRuleParameterString returns [EObject current=null] : iv_ruleParameterString= ruleParameterString EOF ;
    public final EObject entryRuleParameterString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterString = null;


        try {
            // InternalKinematics.g:614:56: (iv_ruleParameterString= ruleParameterString EOF )
            // InternalKinematics.g:615:2: iv_ruleParameterString= ruleParameterString EOF
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
    // InternalKinematics.g:621:1: ruleParameterString returns [EObject current=null] : ( () ( (otherlv_1= RULE_STRING ) )? ( (lv_value_2_0= RULE_ID ) )? ) ;
    public final EObject ruleParameterString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalKinematics.g:627:2: ( ( () ( (otherlv_1= RULE_STRING ) )? ( (lv_value_2_0= RULE_ID ) )? ) )
            // InternalKinematics.g:628:2: ( () ( (otherlv_1= RULE_STRING ) )? ( (lv_value_2_0= RULE_ID ) )? )
            {
            // InternalKinematics.g:628:2: ( () ( (otherlv_1= RULE_STRING ) )? ( (lv_value_2_0= RULE_ID ) )? )
            // InternalKinematics.g:629:3: () ( (otherlv_1= RULE_STRING ) )? ( (lv_value_2_0= RULE_ID ) )?
            {
            // InternalKinematics.g:629:3: ()
            // InternalKinematics.g:630:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStringAccess().getParameterStringAction_0(),
            					current);
            			

            }

            // InternalKinematics.g:636:3: ( (otherlv_1= RULE_STRING ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKinematics.g:637:4: (otherlv_1= RULE_STRING )
                    {
                    // InternalKinematics.g:637:4: (otherlv_1= RULE_STRING )
                    // InternalKinematics.g:638:5: otherlv_1= RULE_STRING
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterStringRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    					newLeafNode(otherlv_1, grammarAccess.getParameterStringAccess().getRefParameterCrossReference_1_0());
                    				

                    }


                    }
                    break;

            }

            // InternalKinematics.g:649:3: ( (lv_value_2_0= RULE_ID ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalKinematics.g:650:4: (lv_value_2_0= RULE_ID )
                    {
                    // InternalKinematics.g:650:4: (lv_value_2_0= RULE_ID )
                    // InternalKinematics.g:651:5: lv_value_2_0= RULE_ID
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
    // InternalKinematics.g:671:1: entryRuleParameterPose returns [EObject current=null] : iv_ruleParameterPose= ruleParameterPose EOF ;
    public final EObject entryRuleParameterPose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterPose = null;


        try {
            // InternalKinematics.g:671:54: (iv_ruleParameterPose= ruleParameterPose EOF )
            // InternalKinematics.g:672:2: iv_ruleParameterPose= ruleParameterPose EOF
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
    // InternalKinematics.g:678:1: ruleParameterPose returns [EObject current=null] : ( ( (otherlv_0= RULE_STRING ) ) | ( (lv_value_1_0= rulePose ) ) ) ;
    public final EObject ruleParameterPose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:684:2: ( ( ( (otherlv_0= RULE_STRING ) ) | ( (lv_value_1_0= rulePose ) ) ) )
            // InternalKinematics.g:685:2: ( ( (otherlv_0= RULE_STRING ) ) | ( (lv_value_1_0= rulePose ) ) )
            {
            // InternalKinematics.g:685:2: ( ( (otherlv_0= RULE_STRING ) ) | ( (lv_value_1_0= rulePose ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==32) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalKinematics.g:686:3: ( (otherlv_0= RULE_STRING ) )
                    {
                    // InternalKinematics.g:686:3: ( (otherlv_0= RULE_STRING ) )
                    // InternalKinematics.g:687:4: (otherlv_0= RULE_STRING )
                    {
                    // InternalKinematics.g:687:4: (otherlv_0= RULE_STRING )
                    // InternalKinematics.g:688:5: otherlv_0= RULE_STRING
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterPoseRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getParameterPoseAccess().getRefParameterCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKinematics.g:700:3: ( (lv_value_1_0= rulePose ) )
                    {
                    // InternalKinematics.g:700:3: ( (lv_value_1_0= rulePose ) )
                    // InternalKinematics.g:701:4: (lv_value_1_0= rulePose )
                    {
                    // InternalKinematics.g:701:4: (lv_value_1_0= rulePose )
                    // InternalKinematics.g:702:5: lv_value_1_0= rulePose
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
    // InternalKinematics.g:723:1: entryRuleParameterLink returns [EObject current=null] : iv_ruleParameterLink= ruleParameterLink EOF ;
    public final EObject entryRuleParameterLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterLink = null;


        try {
            // InternalKinematics.g:723:54: (iv_ruleParameterLink= ruleParameterLink EOF )
            // InternalKinematics.g:724:2: iv_ruleParameterLink= ruleParameterLink EOF
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
    // InternalKinematics.g:730:1: ruleParameterLink returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (otherlv_1= RULE_STRING ) ) ) ;
    public final EObject ruleParameterLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKinematics.g:736:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (otherlv_1= RULE_STRING ) ) ) )
            // InternalKinematics.g:737:2: ( ( (otherlv_0= RULE_ID ) ) | ( (otherlv_1= RULE_STRING ) ) )
            {
            // InternalKinematics.g:737:2: ( ( (otherlv_0= RULE_ID ) ) | ( (otherlv_1= RULE_STRING ) ) )
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
                    // InternalKinematics.g:738:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalKinematics.g:738:3: ( (otherlv_0= RULE_ID ) )
                    // InternalKinematics.g:739:4: (otherlv_0= RULE_ID )
                    {
                    // InternalKinematics.g:739:4: (otherlv_0= RULE_ID )
                    // InternalKinematics.g:740:5: otherlv_0= RULE_ID
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
                    // InternalKinematics.g:752:3: ( (otherlv_1= RULE_STRING ) )
                    {
                    // InternalKinematics.g:752:3: ( (otherlv_1= RULE_STRING ) )
                    // InternalKinematics.g:753:4: (otherlv_1= RULE_STRING )
                    {
                    // InternalKinematics.g:753:4: (otherlv_1= RULE_STRING )
                    // InternalKinematics.g:754:5: otherlv_1= RULE_STRING
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
    // InternalKinematics.g:769:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // InternalKinematics.g:769:54: (iv_ruleParameterType= ruleParameterType EOF )
            // InternalKinematics.g:770:2: iv_ruleParameterType= ruleParameterType EOF
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
    // InternalKinematics.g:776:1: ruleParameterType returns [EObject current=null] : (this_ParameterStringType_0= ruleParameterStringType | this_ParameterLinkRefType_1= ruleParameterLinkRefType | this_ParameterPoseType_2= ruleParameterPoseType ) ;
    public final EObject ruleParameterType() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterStringType_0 = null;

        EObject this_ParameterLinkRefType_1 = null;

        EObject this_ParameterPoseType_2 = null;



        	enterRule();

        try {
            // InternalKinematics.g:782:2: ( (this_ParameterStringType_0= ruleParameterStringType | this_ParameterLinkRefType_1= ruleParameterLinkRefType | this_ParameterPoseType_2= ruleParameterPoseType ) )
            // InternalKinematics.g:783:2: (this_ParameterStringType_0= ruleParameterStringType | this_ParameterLinkRefType_1= ruleParameterLinkRefType | this_ParameterPoseType_2= ruleParameterPoseType )
            {
            // InternalKinematics.g:783:2: (this_ParameterStringType_0= ruleParameterStringType | this_ParameterLinkRefType_1= ruleParameterLinkRefType | this_ParameterPoseType_2= ruleParameterPoseType )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt16=1;
                }
                break;
            case 31:
                {
                alt16=2;
                }
                break;
            case 32:
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
                    // InternalKinematics.g:784:3: this_ParameterStringType_0= ruleParameterStringType
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
                    // InternalKinematics.g:793:3: this_ParameterLinkRefType_1= ruleParameterLinkRefType
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
                    // InternalKinematics.g:802:3: this_ParameterPoseType_2= ruleParameterPoseType
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
    // InternalKinematics.g:814:1: entryRuleParameterStringType returns [EObject current=null] : iv_ruleParameterStringType= ruleParameterStringType EOF ;
    public final EObject entryRuleParameterStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStringType = null;


        try {
            // InternalKinematics.g:814:60: (iv_ruleParameterStringType= ruleParameterStringType EOF )
            // InternalKinematics.g:815:2: iv_ruleParameterStringType= ruleParameterStringType EOF
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
    // InternalKinematics.g:821:1: ruleParameterStringType returns [EObject current=null] : ( () otherlv_1= 'String' ) ;
    public final EObject ruleParameterStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKinematics.g:827:2: ( ( () otherlv_1= 'String' ) )
            // InternalKinematics.g:828:2: ( () otherlv_1= 'String' )
            {
            // InternalKinematics.g:828:2: ( () otherlv_1= 'String' )
            // InternalKinematics.g:829:3: () otherlv_1= 'String'
            {
            // InternalKinematics.g:829:3: ()
            // InternalKinematics.g:830:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_2); 

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
    // InternalKinematics.g:844:1: entryRuleParameterLinkRefType returns [EObject current=null] : iv_ruleParameterLinkRefType= ruleParameterLinkRefType EOF ;
    public final EObject entryRuleParameterLinkRefType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterLinkRefType = null;


        try {
            // InternalKinematics.g:844:61: (iv_ruleParameterLinkRefType= ruleParameterLinkRefType EOF )
            // InternalKinematics.g:845:2: iv_ruleParameterLinkRefType= ruleParameterLinkRefType EOF
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
    // InternalKinematics.g:851:1: ruleParameterLinkRefType returns [EObject current=null] : ( () otherlv_1= 'LinkRef' ) ;
    public final EObject ruleParameterLinkRefType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKinematics.g:857:2: ( ( () otherlv_1= 'LinkRef' ) )
            // InternalKinematics.g:858:2: ( () otherlv_1= 'LinkRef' )
            {
            // InternalKinematics.g:858:2: ( () otherlv_1= 'LinkRef' )
            // InternalKinematics.g:859:3: () otherlv_1= 'LinkRef'
            {
            // InternalKinematics.g:859:3: ()
            // InternalKinematics.g:860:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterLinkRefTypeAccess().getParameterLinkRefTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_2); 

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
    // InternalKinematics.g:874:1: entryRuleParameterPoseType returns [EObject current=null] : iv_ruleParameterPoseType= ruleParameterPoseType EOF ;
    public final EObject entryRuleParameterPoseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterPoseType = null;


        try {
            // InternalKinematics.g:874:58: (iv_ruleParameterPoseType= ruleParameterPoseType EOF )
            // InternalKinematics.g:875:2: iv_ruleParameterPoseType= ruleParameterPoseType EOF
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
    // InternalKinematics.g:881:1: ruleParameterPoseType returns [EObject current=null] : ( () otherlv_1= 'Pose' ) ;
    public final EObject ruleParameterPoseType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKinematics.g:887:2: ( ( () otherlv_1= 'Pose' ) )
            // InternalKinematics.g:888:2: ( () otherlv_1= 'Pose' )
            {
            // InternalKinematics.g:888:2: ( () otherlv_1= 'Pose' )
            // InternalKinematics.g:889:3: () otherlv_1= 'Pose'
            {
            // InternalKinematics.g:889:3: ()
            // InternalKinematics.g:890:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterPoseTypeAccess().getParameterPoseTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_2); 

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
    // InternalKinematics.g:904:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // InternalKinematics.g:904:45: (iv_ruleBody= ruleBody EOF )
            // InternalKinematics.g:905:2: iv_ruleBody= ruleBody EOF
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
    // InternalKinematics.g:911:1: ruleBody returns [EObject current=null] : ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
        EObject lv_link_5_0 = null;

        EObject lv_link_7_0 = null;

        EObject lv_joint_11_0 = null;

        EObject lv_joint_13_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:917:2: ( ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalKinematics.g:918:2: ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalKinematics.g:918:2: ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalKinematics.g:919:3: () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalKinematics.g:919:3: ()
            // InternalKinematics.g:920:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBodyAccess().getBodyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBodyAccess().getBodyKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKinematics.g:934:3: (otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalKinematics.g:935:4: otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getBodyAccess().getLinkKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,17,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalKinematics.g:943:4: ( (lv_link_5_0= ruleLink ) )
                    // InternalKinematics.g:944:5: (lv_link_5_0= ruleLink )
                    {
                    // InternalKinematics.g:944:5: (lv_link_5_0= ruleLink )
                    // InternalKinematics.g:945:6: lv_link_5_0= ruleLink
                    {

                    						newCompositeNode(grammarAccess.getBodyAccess().getLinkLinkParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_link_5_0=ruleLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBodyRule());
                    						}
                    						add(
                    							current,
                    							"link",
                    							lv_link_5_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Link");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKinematics.g:962:4: (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==21) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalKinematics.g:963:5: otherlv_6= ',' ( (lv_link_7_0= ruleLink ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_24); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getBodyAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalKinematics.g:967:5: ( (lv_link_7_0= ruleLink ) )
                    	    // InternalKinematics.g:968:6: (lv_link_7_0= ruleLink )
                    	    {
                    	    // InternalKinematics.g:968:6: (lv_link_7_0= ruleLink )
                    	    // InternalKinematics.g:969:7: lv_link_7_0= ruleLink
                    	    {

                    	    							newCompositeNode(grammarAccess.getBodyAccess().getLinkLinkParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_link_7_0=ruleLink();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"link",
                    	    								lv_link_7_0,
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.Link");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,22,FOLLOW_25); 

                    				newLeafNode(otherlv_8, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalKinematics.g:992:3: (otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalKinematics.g:993:4: otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getBodyAccess().getJointKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,17,FOLLOW_26); 

                    				newLeafNode(otherlv_10, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalKinematics.g:1001:4: ( (lv_joint_11_0= ruleJoint ) )
                    // InternalKinematics.g:1002:5: (lv_joint_11_0= ruleJoint )
                    {
                    // InternalKinematics.g:1002:5: (lv_joint_11_0= ruleJoint )
                    // InternalKinematics.g:1003:6: lv_joint_11_0= ruleJoint
                    {

                    						newCompositeNode(grammarAccess.getBodyAccess().getJointJointParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_joint_11_0=ruleJoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBodyRule());
                    						}
                    						add(
                    							current,
                    							"joint",
                    							lv_joint_11_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Joint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKinematics.g:1020:4: (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==21) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalKinematics.g:1021:5: otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) )
                    	    {
                    	    otherlv_12=(Token)match(input,21,FOLLOW_26); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getBodyAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalKinematics.g:1025:5: ( (lv_joint_13_0= ruleJoint ) )
                    	    // InternalKinematics.g:1026:6: (lv_joint_13_0= ruleJoint )
                    	    {
                    	    // InternalKinematics.g:1026:6: (lv_joint_13_0= ruleJoint )
                    	    // InternalKinematics.g:1027:7: lv_joint_13_0= ruleJoint
                    	    {

                    	    							newCompositeNode(grammarAccess.getBodyAccess().getJointJointParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_joint_13_0=ruleJoint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"joint",
                    	    								lv_joint_13_0,
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.Joint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_14, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalKinematics.g:1058:1: entryRuleMacroCall returns [EObject current=null] : iv_ruleMacroCall= ruleMacroCall EOF ;
    public final EObject entryRuleMacroCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacroCall = null;


        try {
            // InternalKinematics.g:1058:50: (iv_ruleMacroCall= ruleMacroCall EOF )
            // InternalKinematics.g:1059:2: iv_ruleMacroCall= ruleMacroCall EOF
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
    // InternalKinematics.g:1065:1: ruleMacroCall returns [EObject current=null] : ( () otherlv_1= 'MacroCall' otherlv_2= '{' otherlv_3= 'macro' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameterCall_7_0= ruleParameterCall ) ) (otherlv_8= ',' ( (lv_parameterCall_9_0= ruleParameterCall ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleMacroCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_parameterCall_7_0 = null;

        EObject lv_parameterCall_9_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:1071:2: ( ( () otherlv_1= 'MacroCall' otherlv_2= '{' otherlv_3= 'macro' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameterCall_7_0= ruleParameterCall ) ) (otherlv_8= ',' ( (lv_parameterCall_9_0= ruleParameterCall ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalKinematics.g:1072:2: ( () otherlv_1= 'MacroCall' otherlv_2= '{' otherlv_3= 'macro' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameterCall_7_0= ruleParameterCall ) ) (otherlv_8= ',' ( (lv_parameterCall_9_0= ruleParameterCall ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalKinematics.g:1072:2: ( () otherlv_1= 'MacroCall' otherlv_2= '{' otherlv_3= 'macro' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameterCall_7_0= ruleParameterCall ) ) (otherlv_8= ',' ( (lv_parameterCall_9_0= ruleParameterCall ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalKinematics.g:1073:3: () otherlv_1= 'MacroCall' otherlv_2= '{' otherlv_3= 'macro' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameterCall_7_0= ruleParameterCall ) ) (otherlv_8= ',' ( (lv_parameterCall_9_0= ruleParameterCall ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalKinematics.g:1073:3: ()
            // InternalKinematics.g:1074:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMacroCallAccess().getMacroCallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMacroCallAccess().getMacroCallKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getMacroCallAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMacroCallAccess().getMacroKeyword_3());
            		
            // InternalKinematics.g:1092:3: ( (otherlv_4= RULE_STRING ) )
            // InternalKinematics.g:1093:4: (otherlv_4= RULE_STRING )
            {
            // InternalKinematics.g:1093:4: (otherlv_4= RULE_STRING )
            // InternalKinematics.g:1094:5: otherlv_4= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMacroCallRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(otherlv_4, grammarAccess.getMacroCallAccess().getMacroMacroCrossReference_4_0());
            				

            }


            }

            // InternalKinematics.g:1105:3: (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameterCall_7_0= ruleParameterCall ) ) (otherlv_8= ',' ( (lv_parameterCall_9_0= ruleParameterCall ) ) )* otherlv_10= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalKinematics.g:1106:4: otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameterCall_7_0= ruleParameterCall ) ) (otherlv_8= ',' ( (lv_parameterCall_9_0= ruleParameterCall ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getMacroCallAccess().getParameterKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,17,FOLLOW_29); 

                    				newLeafNode(otherlv_6, grammarAccess.getMacroCallAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalKinematics.g:1114:4: ( (lv_parameterCall_7_0= ruleParameterCall ) )
                    // InternalKinematics.g:1115:5: (lv_parameterCall_7_0= ruleParameterCall )
                    {
                    // InternalKinematics.g:1115:5: (lv_parameterCall_7_0= ruleParameterCall )
                    // InternalKinematics.g:1116:6: lv_parameterCall_7_0= ruleParameterCall
                    {

                    						newCompositeNode(grammarAccess.getMacroCallAccess().getParameterCallParameterCallParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_parameterCall_7_0=ruleParameterCall();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMacroCallRule());
                    						}
                    						add(
                    							current,
                    							"parameterCall",
                    							lv_parameterCall_7_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.ParameterCall");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKinematics.g:1133:4: (otherlv_8= ',' ( (lv_parameterCall_9_0= ruleParameterCall ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==21) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalKinematics.g:1134:5: otherlv_8= ',' ( (lv_parameterCall_9_0= ruleParameterCall ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FOLLOW_29); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getMacroCallAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalKinematics.g:1138:5: ( (lv_parameterCall_9_0= ruleParameterCall ) )
                    	    // InternalKinematics.g:1139:6: (lv_parameterCall_9_0= ruleParameterCall )
                    	    {
                    	    // InternalKinematics.g:1139:6: (lv_parameterCall_9_0= ruleParameterCall )
                    	    // InternalKinematics.g:1140:7: lv_parameterCall_9_0= ruleParameterCall
                    	    {

                    	    							newCompositeNode(grammarAccess.getMacroCallAccess().getParameterCallParameterCallParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_parameterCall_9_0=ruleParameterCall();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMacroCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameterCall",
                    	    								lv_parameterCall_9_0,
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.ParameterCall");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_10, grammarAccess.getMacroCallAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getMacroCallAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalKinematics.g:1171:1: entryRuleParameterCall returns [EObject current=null] : iv_ruleParameterCall= ruleParameterCall EOF ;
    public final EObject entryRuleParameterCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterCall = null;


        try {
            // InternalKinematics.g:1171:54: (iv_ruleParameterCall= ruleParameterCall EOF )
            // InternalKinematics.g:1172:2: iv_ruleParameterCall= ruleParameterCall EOF
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
    // InternalKinematics.g:1178:1: ruleParameterCall returns [EObject current=null] : ( () otherlv_1= 'ParameterCall' otherlv_2= '{' otherlv_3= 'parameter' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'value' ( (lv_value_6_0= ruleParameterValue ) ) otherlv_7= '}' ) ;
    public final EObject ruleParameterCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:1184:2: ( ( () otherlv_1= 'ParameterCall' otherlv_2= '{' otherlv_3= 'parameter' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'value' ( (lv_value_6_0= ruleParameterValue ) ) otherlv_7= '}' ) )
            // InternalKinematics.g:1185:2: ( () otherlv_1= 'ParameterCall' otherlv_2= '{' otherlv_3= 'parameter' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'value' ( (lv_value_6_0= ruleParameterValue ) ) otherlv_7= '}' )
            {
            // InternalKinematics.g:1185:2: ( () otherlv_1= 'ParameterCall' otherlv_2= '{' otherlv_3= 'parameter' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'value' ( (lv_value_6_0= ruleParameterValue ) ) otherlv_7= '}' )
            // InternalKinematics.g:1186:3: () otherlv_1= 'ParameterCall' otherlv_2= '{' otherlv_3= 'parameter' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'value' ( (lv_value_6_0= ruleParameterValue ) ) otherlv_7= '}'
            {
            // InternalKinematics.g:1186:3: ()
            // InternalKinematics.g:1187:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterCallAccess().getParameterCallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterCallAccess().getParameterCallKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterCallAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterCallAccess().getParameterKeyword_3());
            		
            // InternalKinematics.g:1205:3: ( (otherlv_4= RULE_STRING ) )
            // InternalKinematics.g:1206:4: (otherlv_4= RULE_STRING )
            {
            // InternalKinematics.g:1206:4: (otherlv_4= RULE_STRING )
            // InternalKinematics.g:1207:5: otherlv_4= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterCallRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_31); 

            					newLeafNode(otherlv_4, grammarAccess.getParameterCallAccess().getParameterParameterCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterCallAccess().getValueKeyword_5());
            		
            // InternalKinematics.g:1222:3: ( (lv_value_6_0= ruleParameterValue ) )
            // InternalKinematics.g:1223:4: (lv_value_6_0= ruleParameterValue )
            {
            // InternalKinematics.g:1223:4: (lv_value_6_0= ruleParameterValue )
            // InternalKinematics.g:1224:5: lv_value_6_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getParameterCallAccess().getValueParameterValueParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getParameterCallAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalKinematics.g:1249:1: entryRuleJoint returns [EObject current=null] : iv_ruleJoint= ruleJoint EOF ;
    public final EObject entryRuleJoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoint = null;


        try {
            // InternalKinematics.g:1249:46: (iv_ruleJoint= ruleJoint EOF )
            // InternalKinematics.g:1250:2: iv_ruleJoint= ruleJoint EOF
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
    // InternalKinematics.g:1256:1: ruleJoint returns [EObject current=null] : (otherlv_0= 'Joint' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleParameterString ) ) otherlv_4= 'type' ( (lv_type_5_0= RULE_JOINTTYPE ) ) otherlv_6= 'parent' ( (lv_parent_7_0= ruleParameterLink ) ) otherlv_8= 'child' ( (lv_child_9_0= ruleParameterLink ) ) (otherlv_10= 'origin' ( (lv_origin_11_0= ruleParameterPose ) ) )? (otherlv_12= 'axis' ( (lv_axis_13_0= ruleVector3 ) ) )? (otherlv_14= 'limit' ( (lv_limit_15_0= ruleLimit ) ) )? otherlv_16= '}' ) ;
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
        EObject lv_name_3_0 = null;

        EObject lv_parent_7_0 = null;

        EObject lv_child_9_0 = null;

        EObject lv_origin_11_0 = null;

        EObject lv_axis_13_0 = null;

        EObject lv_limit_15_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:1262:2: ( (otherlv_0= 'Joint' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleParameterString ) ) otherlv_4= 'type' ( (lv_type_5_0= RULE_JOINTTYPE ) ) otherlv_6= 'parent' ( (lv_parent_7_0= ruleParameterLink ) ) otherlv_8= 'child' ( (lv_child_9_0= ruleParameterLink ) ) (otherlv_10= 'origin' ( (lv_origin_11_0= ruleParameterPose ) ) )? (otherlv_12= 'axis' ( (lv_axis_13_0= ruleVector3 ) ) )? (otherlv_14= 'limit' ( (lv_limit_15_0= ruleLimit ) ) )? otherlv_16= '}' ) )
            // InternalKinematics.g:1263:2: (otherlv_0= 'Joint' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleParameterString ) ) otherlv_4= 'type' ( (lv_type_5_0= RULE_JOINTTYPE ) ) otherlv_6= 'parent' ( (lv_parent_7_0= ruleParameterLink ) ) otherlv_8= 'child' ( (lv_child_9_0= ruleParameterLink ) ) (otherlv_10= 'origin' ( (lv_origin_11_0= ruleParameterPose ) ) )? (otherlv_12= 'axis' ( (lv_axis_13_0= ruleVector3 ) ) )? (otherlv_14= 'limit' ( (lv_limit_15_0= ruleLimit ) ) )? otherlv_16= '}' )
            {
            // InternalKinematics.g:1263:2: (otherlv_0= 'Joint' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleParameterString ) ) otherlv_4= 'type' ( (lv_type_5_0= RULE_JOINTTYPE ) ) otherlv_6= 'parent' ( (lv_parent_7_0= ruleParameterLink ) ) otherlv_8= 'child' ( (lv_child_9_0= ruleParameterLink ) ) (otherlv_10= 'origin' ( (lv_origin_11_0= ruleParameterPose ) ) )? (otherlv_12= 'axis' ( (lv_axis_13_0= ruleVector3 ) ) )? (otherlv_14= 'limit' ( (lv_limit_15_0= ruleLimit ) ) )? otherlv_16= '}' )
            // InternalKinematics.g:1264:3: otherlv_0= 'Joint' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleParameterString ) ) otherlv_4= 'type' ( (lv_type_5_0= RULE_JOINTTYPE ) ) otherlv_6= 'parent' ( (lv_parent_7_0= ruleParameterLink ) ) otherlv_8= 'child' ( (lv_child_9_0= ruleParameterLink ) ) (otherlv_10= 'origin' ( (lv_origin_11_0= ruleParameterPose ) ) )? (otherlv_12= 'axis' ( (lv_axis_13_0= ruleVector3 ) ) )? (otherlv_14= 'limit' ( (lv_limit_15_0= ruleLimit ) ) )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getJointAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getJointAccess().getNameKeyword_2());
            		
            // InternalKinematics.g:1276:3: ( (lv_name_3_0= ruleParameterString ) )
            // InternalKinematics.g:1277:4: (lv_name_3_0= ruleParameterString )
            {
            // InternalKinematics.g:1277:4: (lv_name_3_0= ruleParameterString )
            // InternalKinematics.g:1278:5: lv_name_3_0= ruleParameterString
            {

            					newCompositeNode(grammarAccess.getJointAccess().getNameParameterStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_3_0=ruleParameterString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.ParameterString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_33); 

            			newLeafNode(otherlv_4, grammarAccess.getJointAccess().getTypeKeyword_4());
            		
            // InternalKinematics.g:1299:3: ( (lv_type_5_0= RULE_JOINTTYPE ) )
            // InternalKinematics.g:1300:4: (lv_type_5_0= RULE_JOINTTYPE )
            {
            // InternalKinematics.g:1300:4: (lv_type_5_0= RULE_JOINTTYPE )
            // InternalKinematics.g:1301:5: lv_type_5_0= RULE_JOINTTYPE
            {
            lv_type_5_0=(Token)match(input,RULE_JOINTTYPE,FOLLOW_34); 

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

            otherlv_6=(Token)match(input,39,FOLLOW_35); 

            			newLeafNode(otherlv_6, grammarAccess.getJointAccess().getParentKeyword_6());
            		
            // InternalKinematics.g:1321:3: ( (lv_parent_7_0= ruleParameterLink ) )
            // InternalKinematics.g:1322:4: (lv_parent_7_0= ruleParameterLink )
            {
            // InternalKinematics.g:1322:4: (lv_parent_7_0= ruleParameterLink )
            // InternalKinematics.g:1323:5: lv_parent_7_0= ruleParameterLink
            {

            					newCompositeNode(grammarAccess.getJointAccess().getParentParameterLinkParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_36);
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

            otherlv_8=(Token)match(input,40,FOLLOW_35); 

            			newLeafNode(otherlv_8, grammarAccess.getJointAccess().getChildKeyword_8());
            		
            // InternalKinematics.g:1344:3: ( (lv_child_9_0= ruleParameterLink ) )
            // InternalKinematics.g:1345:4: (lv_child_9_0= ruleParameterLink )
            {
            // InternalKinematics.g:1345:4: (lv_child_9_0= ruleParameterLink )
            // InternalKinematics.g:1346:5: lv_child_9_0= ruleParameterLink
            {

            					newCompositeNode(grammarAccess.getJointAccess().getChildParameterLinkParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_37);
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

            // InternalKinematics.g:1363:3: (otherlv_10= 'origin' ( (lv_origin_11_0= ruleParameterPose ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalKinematics.g:1364:4: otherlv_10= 'origin' ( (lv_origin_11_0= ruleParameterPose ) )
                    {
                    otherlv_10=(Token)match(input,41,FOLLOW_38); 

                    				newLeafNode(otherlv_10, grammarAccess.getJointAccess().getOriginKeyword_10_0());
                    			
                    // InternalKinematics.g:1368:4: ( (lv_origin_11_0= ruleParameterPose ) )
                    // InternalKinematics.g:1369:5: (lv_origin_11_0= ruleParameterPose )
                    {
                    // InternalKinematics.g:1369:5: (lv_origin_11_0= ruleParameterPose )
                    // InternalKinematics.g:1370:6: lv_origin_11_0= ruleParameterPose
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getOriginParameterPoseParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_39);
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


                    }
                    break;

            }

            // InternalKinematics.g:1388:3: (otherlv_12= 'axis' ( (lv_axis_13_0= ruleVector3 ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalKinematics.g:1389:4: otherlv_12= 'axis' ( (lv_axis_13_0= ruleVector3 ) )
                    {
                    otherlv_12=(Token)match(input,42,FOLLOW_40); 

                    				newLeafNode(otherlv_12, grammarAccess.getJointAccess().getAxisKeyword_11_0());
                    			
                    // InternalKinematics.g:1393:4: ( (lv_axis_13_0= ruleVector3 ) )
                    // InternalKinematics.g:1394:5: (lv_axis_13_0= ruleVector3 )
                    {
                    // InternalKinematics.g:1394:5: (lv_axis_13_0= ruleVector3 )
                    // InternalKinematics.g:1395:6: lv_axis_13_0= ruleVector3
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getAxisVector3ParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_41);
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

            // InternalKinematics.g:1413:3: (otherlv_14= 'limit' ( (lv_limit_15_0= ruleLimit ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalKinematics.g:1414:4: otherlv_14= 'limit' ( (lv_limit_15_0= ruleLimit ) )
                    {
                    otherlv_14=(Token)match(input,43,FOLLOW_42); 

                    				newLeafNode(otherlv_14, grammarAccess.getJointAccess().getLimitKeyword_12_0());
                    			
                    // InternalKinematics.g:1418:4: ( (lv_limit_15_0= ruleLimit ) )
                    // InternalKinematics.g:1419:5: (lv_limit_15_0= ruleLimit )
                    {
                    // InternalKinematics.g:1419:5: (lv_limit_15_0= ruleLimit )
                    // InternalKinematics.g:1420:6: lv_limit_15_0= ruleLimit
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_12_1_0());
                    					
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

            otherlv_16=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getJointAccess().getRightCurlyBracketKeyword_13());
            		

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
    // InternalKinematics.g:1446:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalKinematics.g:1446:45: (iv_ruleLink= ruleLink EOF )
            // InternalKinematics.g:1447:2: iv_ruleLink= ruleLink EOF
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
    // InternalKinematics.g:1453:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleParameterString ) ) (otherlv_4= 'inertial' ( (lv_inertial_5_0= ruleInertial ) ) )? (otherlv_6= 'visual' ( (lv_visual_7_0= ruleVisual ) ) )? (otherlv_8= 'collision' ( (lv_collision_9_0= ruleCollision ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_name_3_0 = null;

        EObject lv_inertial_5_0 = null;

        EObject lv_visual_7_0 = null;

        EObject lv_collision_9_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:1459:2: ( (otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleParameterString ) ) (otherlv_4= 'inertial' ( (lv_inertial_5_0= ruleInertial ) ) )? (otherlv_6= 'visual' ( (lv_visual_7_0= ruleVisual ) ) )? (otherlv_8= 'collision' ( (lv_collision_9_0= ruleCollision ) ) )? otherlv_10= '}' ) )
            // InternalKinematics.g:1460:2: (otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleParameterString ) ) (otherlv_4= 'inertial' ( (lv_inertial_5_0= ruleInertial ) ) )? (otherlv_6= 'visual' ( (lv_visual_7_0= ruleVisual ) ) )? (otherlv_8= 'collision' ( (lv_collision_9_0= ruleCollision ) ) )? otherlv_10= '}' )
            {
            // InternalKinematics.g:1460:2: (otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleParameterString ) ) (otherlv_4= 'inertial' ( (lv_inertial_5_0= ruleInertial ) ) )? (otherlv_6= 'visual' ( (lv_visual_7_0= ruleVisual ) ) )? (otherlv_8= 'collision' ( (lv_collision_9_0= ruleCollision ) ) )? otherlv_10= '}' )
            // InternalKinematics.g:1461:3: otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleParameterString ) ) (otherlv_4= 'inertial' ( (lv_inertial_5_0= ruleInertial ) ) )? (otherlv_6= 'visual' ( (lv_visual_7_0= ruleVisual ) ) )? (otherlv_8= 'collision' ( (lv_collision_9_0= ruleCollision ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_43); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getNameKeyword_2());
            		
            // InternalKinematics.g:1473:3: ( (lv_name_3_0= ruleParameterString ) )
            // InternalKinematics.g:1474:4: (lv_name_3_0= ruleParameterString )
            {
            // InternalKinematics.g:1474:4: (lv_name_3_0= ruleParameterString )
            // InternalKinematics.g:1475:5: lv_name_3_0= ruleParameterString
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getNameParameterStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_44);
            lv_name_3_0=ruleParameterString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.ParameterString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKinematics.g:1492:3: (otherlv_4= 'inertial' ( (lv_inertial_5_0= ruleInertial ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==45) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalKinematics.g:1493:4: otherlv_4= 'inertial' ( (lv_inertial_5_0= ruleInertial ) )
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_45); 

                    				newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getInertialKeyword_4_0());
                    			
                    // InternalKinematics.g:1497:4: ( (lv_inertial_5_0= ruleInertial ) )
                    // InternalKinematics.g:1498:5: (lv_inertial_5_0= ruleInertial )
                    {
                    // InternalKinematics.g:1498:5: (lv_inertial_5_0= ruleInertial )
                    // InternalKinematics.g:1499:6: lv_inertial_5_0= ruleInertial
                    {

                    						newCompositeNode(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_46);
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

            // InternalKinematics.g:1517:3: (otherlv_6= 'visual' ( (lv_visual_7_0= ruleVisual ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==46) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalKinematics.g:1518:4: otherlv_6= 'visual' ( (lv_visual_7_0= ruleVisual ) )
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_47); 

                    				newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getVisualKeyword_5_0());
                    			
                    // InternalKinematics.g:1522:4: ( (lv_visual_7_0= ruleVisual ) )
                    // InternalKinematics.g:1523:5: (lv_visual_7_0= ruleVisual )
                    {
                    // InternalKinematics.g:1523:5: (lv_visual_7_0= ruleVisual )
                    // InternalKinematics.g:1524:6: lv_visual_7_0= ruleVisual
                    {

                    						newCompositeNode(grammarAccess.getLinkAccess().getVisualVisualParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_48);
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

            // InternalKinematics.g:1542:3: (otherlv_8= 'collision' ( (lv_collision_9_0= ruleCollision ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==47) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKinematics.g:1543:4: otherlv_8= 'collision' ( (lv_collision_9_0= ruleCollision ) )
                    {
                    otherlv_8=(Token)match(input,47,FOLLOW_49); 

                    				newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getCollisionKeyword_6_0());
                    			
                    // InternalKinematics.g:1547:4: ( (lv_collision_9_0= ruleCollision ) )
                    // InternalKinematics.g:1548:5: (lv_collision_9_0= ruleCollision )
                    {
                    // InternalKinematics.g:1548:5: (lv_collision_9_0= ruleCollision )
                    // InternalKinematics.g:1549:6: lv_collision_9_0= ruleCollision
                    {

                    						newCompositeNode(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_15);
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

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalKinematics.g:1575:1: entryRulePose returns [EObject current=null] : iv_rulePose= rulePose EOF ;
    public final EObject entryRulePose() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePose = null;


        try {
            // InternalKinematics.g:1575:45: (iv_rulePose= rulePose EOF )
            // InternalKinematics.g:1576:2: iv_rulePose= rulePose EOF
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
    // InternalKinematics.g:1582:1: rulePose returns [EObject current=null] : ( () otherlv_1= 'Pose' otherlv_2= '{' (otherlv_3= 'rpy' ( (lv_rpy_4_0= RULE_STRING ) ) )? (otherlv_5= 'xyz' ( (lv_xyz_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) ;
    public final EObject rulePose() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_rpy_4_0=null;
        Token otherlv_5=null;
        Token lv_xyz_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalKinematics.g:1588:2: ( ( () otherlv_1= 'Pose' otherlv_2= '{' (otherlv_3= 'rpy' ( (lv_rpy_4_0= RULE_STRING ) ) )? (otherlv_5= 'xyz' ( (lv_xyz_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) )
            // InternalKinematics.g:1589:2: ( () otherlv_1= 'Pose' otherlv_2= '{' (otherlv_3= 'rpy' ( (lv_rpy_4_0= RULE_STRING ) ) )? (otherlv_5= 'xyz' ( (lv_xyz_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            {
            // InternalKinematics.g:1589:2: ( () otherlv_1= 'Pose' otherlv_2= '{' (otherlv_3= 'rpy' ( (lv_rpy_4_0= RULE_STRING ) ) )? (otherlv_5= 'xyz' ( (lv_xyz_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            // InternalKinematics.g:1590:3: () otherlv_1= 'Pose' otherlv_2= '{' (otherlv_3= 'rpy' ( (lv_rpy_4_0= RULE_STRING ) ) )? (otherlv_5= 'xyz' ( (lv_xyz_6_0= RULE_STRING ) ) )? otherlv_7= '}'
            {
            // InternalKinematics.g:1590:3: ()
            // InternalKinematics.g:1591:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPoseAccess().getPoseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPoseAccess().getPoseKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getPoseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKinematics.g:1605:3: (otherlv_3= 'rpy' ( (lv_rpy_4_0= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==48) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalKinematics.g:1606:4: otherlv_3= 'rpy' ( (lv_rpy_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,48,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getPoseAccess().getRpyKeyword_3_0());
                    			
                    // InternalKinematics.g:1610:4: ( (lv_rpy_4_0= RULE_STRING ) )
                    // InternalKinematics.g:1611:5: (lv_rpy_4_0= RULE_STRING )
                    {
                    // InternalKinematics.g:1611:5: (lv_rpy_4_0= RULE_STRING )
                    // InternalKinematics.g:1612:6: lv_rpy_4_0= RULE_STRING
                    {
                    lv_rpy_4_0=(Token)match(input,RULE_STRING,FOLLOW_51); 

                    						newLeafNode(lv_rpy_4_0, grammarAccess.getPoseAccess().getRpySTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPoseRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"rpy",
                    							lv_rpy_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:1629:3: (otherlv_5= 'xyz' ( (lv_xyz_6_0= RULE_STRING ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==49) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalKinematics.g:1630:4: otherlv_5= 'xyz' ( (lv_xyz_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,49,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getPoseAccess().getXyzKeyword_4_0());
                    			
                    // InternalKinematics.g:1634:4: ( (lv_xyz_6_0= RULE_STRING ) )
                    // InternalKinematics.g:1635:5: (lv_xyz_6_0= RULE_STRING )
                    {
                    // InternalKinematics.g:1635:5: (lv_xyz_6_0= RULE_STRING )
                    // InternalKinematics.g:1636:6: lv_xyz_6_0= RULE_STRING
                    {
                    lv_xyz_6_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    						newLeafNode(lv_xyz_6_0, grammarAccess.getPoseAccess().getXyzSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPoseRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"xyz",
                    							lv_xyz_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

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


    // $ANTLR start "entryRuleVector3"
    // InternalKinematics.g:1661:1: entryRuleVector3 returns [EObject current=null] : iv_ruleVector3= ruleVector3 EOF ;
    public final EObject entryRuleVector3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector3 = null;


        try {
            // InternalKinematics.g:1661:48: (iv_ruleVector3= ruleVector3 EOF )
            // InternalKinematics.g:1662:2: iv_ruleVector3= ruleVector3 EOF
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
    // InternalKinematics.g:1668:1: ruleVector3 returns [EObject current=null] : ( () otherlv_1= 'Vector3' otherlv_2= '{' (otherlv_3= 'xyz' ( (lv_xyz_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleVector3() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_xyz_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalKinematics.g:1674:2: ( ( () otherlv_1= 'Vector3' otherlv_2= '{' (otherlv_3= 'xyz' ( (lv_xyz_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // InternalKinematics.g:1675:2: ( () otherlv_1= 'Vector3' otherlv_2= '{' (otherlv_3= 'xyz' ( (lv_xyz_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // InternalKinematics.g:1675:2: ( () otherlv_1= 'Vector3' otherlv_2= '{' (otherlv_3= 'xyz' ( (lv_xyz_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // InternalKinematics.g:1676:3: () otherlv_1= 'Vector3' otherlv_2= '{' (otherlv_3= 'xyz' ( (lv_xyz_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            // InternalKinematics.g:1676:3: ()
            // InternalKinematics.g:1677:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVector3Access().getVector3Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVector3Access().getVector3Keyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getVector3Access().getLeftCurlyBracketKeyword_2());
            		
            // InternalKinematics.g:1691:3: (otherlv_3= 'xyz' ( (lv_xyz_4_0= RULE_STRING ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==49) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalKinematics.g:1692:4: otherlv_3= 'xyz' ( (lv_xyz_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getVector3Access().getXyzKeyword_3_0());
                    			
                    // InternalKinematics.g:1696:4: ( (lv_xyz_4_0= RULE_STRING ) )
                    // InternalKinematics.g:1697:5: (lv_xyz_4_0= RULE_STRING )
                    {
                    // InternalKinematics.g:1697:5: (lv_xyz_4_0= RULE_STRING )
                    // InternalKinematics.g:1698:6: lv_xyz_4_0= RULE_STRING
                    {
                    lv_xyz_4_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    						newLeafNode(lv_xyz_4_0, grammarAccess.getVector3Access().getXyzSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVector3Rule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"xyz",
                    							lv_xyz_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getVector3Access().getRightCurlyBracketKeyword_4());
            		

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
    // InternalKinematics.g:1723:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // InternalKinematics.g:1723:46: (iv_ruleLimit= ruleLimit EOF )
            // InternalKinematics.g:1724:2: iv_ruleLimit= ruleLimit EOF
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
    // InternalKinematics.g:1730:1: ruleLimit returns [EObject current=null] : ( () otherlv_1= 'Limit' otherlv_2= '{' (otherlv_3= 'effort' ( (lv_effort_4_0= RULE_STRING ) ) )? (otherlv_5= 'lower' ( (lv_lower_6_0= RULE_STRING ) ) )? (otherlv_7= 'upper' ( (lv_upper_8_0= RULE_STRING ) ) )? (otherlv_9= 'velocity' ( (lv_velocity_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleLimit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_effort_4_0=null;
        Token otherlv_5=null;
        Token lv_lower_6_0=null;
        Token otherlv_7=null;
        Token lv_upper_8_0=null;
        Token otherlv_9=null;
        Token lv_velocity_10_0=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalKinematics.g:1736:2: ( ( () otherlv_1= 'Limit' otherlv_2= '{' (otherlv_3= 'effort' ( (lv_effort_4_0= RULE_STRING ) ) )? (otherlv_5= 'lower' ( (lv_lower_6_0= RULE_STRING ) ) )? (otherlv_7= 'upper' ( (lv_upper_8_0= RULE_STRING ) ) )? (otherlv_9= 'velocity' ( (lv_velocity_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) )
            // InternalKinematics.g:1737:2: ( () otherlv_1= 'Limit' otherlv_2= '{' (otherlv_3= 'effort' ( (lv_effort_4_0= RULE_STRING ) ) )? (otherlv_5= 'lower' ( (lv_lower_6_0= RULE_STRING ) ) )? (otherlv_7= 'upper' ( (lv_upper_8_0= RULE_STRING ) ) )? (otherlv_9= 'velocity' ( (lv_velocity_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            {
            // InternalKinematics.g:1737:2: ( () otherlv_1= 'Limit' otherlv_2= '{' (otherlv_3= 'effort' ( (lv_effort_4_0= RULE_STRING ) ) )? (otherlv_5= 'lower' ( (lv_lower_6_0= RULE_STRING ) ) )? (otherlv_7= 'upper' ( (lv_upper_8_0= RULE_STRING ) ) )? (otherlv_9= 'velocity' ( (lv_velocity_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            // InternalKinematics.g:1738:3: () otherlv_1= 'Limit' otherlv_2= '{' (otherlv_3= 'effort' ( (lv_effort_4_0= RULE_STRING ) ) )? (otherlv_5= 'lower' ( (lv_lower_6_0= RULE_STRING ) ) )? (otherlv_7= 'upper' ( (lv_upper_8_0= RULE_STRING ) ) )? (otherlv_9= 'velocity' ( (lv_velocity_10_0= RULE_STRING ) ) )? otherlv_11= '}'
            {
            // InternalKinematics.g:1738:3: ()
            // InternalKinematics.g:1739:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLimitAccess().getLimitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLimitAccess().getLimitKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getLimitAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKinematics.g:1753:3: (otherlv_3= 'effort' ( (lv_effort_4_0= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==52) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalKinematics.g:1754:4: otherlv_3= 'effort' ( (lv_effort_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,52,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getLimitAccess().getEffortKeyword_3_0());
                    			
                    // InternalKinematics.g:1758:4: ( (lv_effort_4_0= RULE_STRING ) )
                    // InternalKinematics.g:1759:5: (lv_effort_4_0= RULE_STRING )
                    {
                    // InternalKinematics.g:1759:5: (lv_effort_4_0= RULE_STRING )
                    // InternalKinematics.g:1760:6: lv_effort_4_0= RULE_STRING
                    {
                    lv_effort_4_0=(Token)match(input,RULE_STRING,FOLLOW_53); 

                    						newLeafNode(lv_effort_4_0, grammarAccess.getLimitAccess().getEffortSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLimitRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"effort",
                    							lv_effort_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:1777:3: (otherlv_5= 'lower' ( (lv_lower_6_0= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==53) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalKinematics.g:1778:4: otherlv_5= 'lower' ( (lv_lower_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,53,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getLimitAccess().getLowerKeyword_4_0());
                    			
                    // InternalKinematics.g:1782:4: ( (lv_lower_6_0= RULE_STRING ) )
                    // InternalKinematics.g:1783:5: (lv_lower_6_0= RULE_STRING )
                    {
                    // InternalKinematics.g:1783:5: (lv_lower_6_0= RULE_STRING )
                    // InternalKinematics.g:1784:6: lv_lower_6_0= RULE_STRING
                    {
                    lv_lower_6_0=(Token)match(input,RULE_STRING,FOLLOW_54); 

                    						newLeafNode(lv_lower_6_0, grammarAccess.getLimitAccess().getLowerSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLimitRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"lower",
                    							lv_lower_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:1801:3: (otherlv_7= 'upper' ( (lv_upper_8_0= RULE_STRING ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==54) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalKinematics.g:1802:4: otherlv_7= 'upper' ( (lv_upper_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,54,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getLimitAccess().getUpperKeyword_5_0());
                    			
                    // InternalKinematics.g:1806:4: ( (lv_upper_8_0= RULE_STRING ) )
                    // InternalKinematics.g:1807:5: (lv_upper_8_0= RULE_STRING )
                    {
                    // InternalKinematics.g:1807:5: (lv_upper_8_0= RULE_STRING )
                    // InternalKinematics.g:1808:6: lv_upper_8_0= RULE_STRING
                    {
                    lv_upper_8_0=(Token)match(input,RULE_STRING,FOLLOW_55); 

                    						newLeafNode(lv_upper_8_0, grammarAccess.getLimitAccess().getUpperSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLimitRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"upper",
                    							lv_upper_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:1825:3: (otherlv_9= 'velocity' ( (lv_velocity_10_0= RULE_STRING ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==55) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalKinematics.g:1826:4: otherlv_9= 'velocity' ( (lv_velocity_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,55,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getLimitAccess().getVelocityKeyword_6_0());
                    			
                    // InternalKinematics.g:1830:4: ( (lv_velocity_10_0= RULE_STRING ) )
                    // InternalKinematics.g:1831:5: (lv_velocity_10_0= RULE_STRING )
                    {
                    // InternalKinematics.g:1831:5: (lv_velocity_10_0= RULE_STRING )
                    // InternalKinematics.g:1832:6: lv_velocity_10_0= RULE_STRING
                    {
                    lv_velocity_10_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    						newLeafNode(lv_velocity_10_0, grammarAccess.getLimitAccess().getVelocitySTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLimitRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"velocity",
                    							lv_velocity_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

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


    // $ANTLR start "entryRuleInertial"
    // InternalKinematics.g:1857:1: entryRuleInertial returns [EObject current=null] : iv_ruleInertial= ruleInertial EOF ;
    public final EObject entryRuleInertial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertial = null;


        try {
            // InternalKinematics.g:1857:49: (iv_ruleInertial= ruleInertial EOF )
            // InternalKinematics.g:1858:2: iv_ruleInertial= ruleInertial EOF
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
    // InternalKinematics.g:1864:1: ruleInertial returns [EObject current=null] : ( () otherlv_1= 'Inertial' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )? (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )? otherlv_9= '}' ) ;
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
            // InternalKinematics.g:1870:2: ( ( () otherlv_1= 'Inertial' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )? (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )? otherlv_9= '}' ) )
            // InternalKinematics.g:1871:2: ( () otherlv_1= 'Inertial' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )? (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )? otherlv_9= '}' )
            {
            // InternalKinematics.g:1871:2: ( () otherlv_1= 'Inertial' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )? (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )? otherlv_9= '}' )
            // InternalKinematics.g:1872:3: () otherlv_1= 'Inertial' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )? (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )? otherlv_9= '}'
            {
            // InternalKinematics.g:1872:3: ()
            // InternalKinematics.g:1873:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInertialAccess().getInertialAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInertialAccess().getInertialKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_56); 

            			newLeafNode(otherlv_2, grammarAccess.getInertialAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKinematics.g:1887:3: (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==41) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalKinematics.g:1888:4: otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) )
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_57); 

                    				newLeafNode(otherlv_3, grammarAccess.getInertialAccess().getOriginKeyword_3_0());
                    			
                    // InternalKinematics.g:1892:4: ( (lv_origin_4_0= rulePose ) )
                    // InternalKinematics.g:1893:5: (lv_origin_4_0= rulePose )
                    {
                    // InternalKinematics.g:1893:5: (lv_origin_4_0= rulePose )
                    // InternalKinematics.g:1894:6: lv_origin_4_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getInertialAccess().getOriginPoseParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_58);
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

            // InternalKinematics.g:1912:3: (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==57) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalKinematics.g:1913:4: otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) )
                    {
                    otherlv_5=(Token)match(input,57,FOLLOW_59); 

                    				newLeafNode(otherlv_5, grammarAccess.getInertialAccess().getMassKeyword_4_0());
                    			
                    // InternalKinematics.g:1917:4: ( (lv_mass_6_0= ruleMass ) )
                    // InternalKinematics.g:1918:5: (lv_mass_6_0= ruleMass )
                    {
                    // InternalKinematics.g:1918:5: (lv_mass_6_0= ruleMass )
                    // InternalKinematics.g:1919:6: lv_mass_6_0= ruleMass
                    {

                    						newCompositeNode(grammarAccess.getInertialAccess().getMassMassParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_60);
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

            // InternalKinematics.g:1937:3: (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==58) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalKinematics.g:1938:4: otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) )
                    {
                    otherlv_7=(Token)match(input,58,FOLLOW_61); 

                    				newLeafNode(otherlv_7, grammarAccess.getInertialAccess().getInertiaKeyword_5_0());
                    			
                    // InternalKinematics.g:1942:4: ( (lv_inertia_8_0= ruleInertia ) )
                    // InternalKinematics.g:1943:5: (lv_inertia_8_0= ruleInertia )
                    {
                    // InternalKinematics.g:1943:5: (lv_inertia_8_0= ruleInertia )
                    // InternalKinematics.g:1944:6: lv_inertia_8_0= ruleInertia
                    {

                    						newCompositeNode(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
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
    // InternalKinematics.g:1970:1: entryRuleVisual returns [EObject current=null] : iv_ruleVisual= ruleVisual EOF ;
    public final EObject entryRuleVisual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisual = null;


        try {
            // InternalKinematics.g:1970:47: (iv_ruleVisual= ruleVisual EOF )
            // InternalKinematics.g:1971:2: iv_ruleVisual= ruleVisual EOF
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
    // InternalKinematics.g:1977:1: ruleVisual returns [EObject current=null] : (otherlv_0= 'Visual' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) otherlv_6= '}' ) ;
    public final EObject ruleVisual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_origin_3_0 = null;

        EObject lv_geometry_5_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:1983:2: ( (otherlv_0= 'Visual' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) otherlv_6= '}' ) )
            // InternalKinematics.g:1984:2: (otherlv_0= 'Visual' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) otherlv_6= '}' )
            {
            // InternalKinematics.g:1984:2: (otherlv_0= 'Visual' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) otherlv_6= '}' )
            // InternalKinematics.g:1985:3: otherlv_0= 'Visual' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVisualAccess().getVisualKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_62); 

            			newLeafNode(otherlv_1, grammarAccess.getVisualAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalKinematics.g:1993:3: (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==41) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalKinematics.g:1994:4: otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) )
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_57); 

                    				newLeafNode(otherlv_2, grammarAccess.getVisualAccess().getOriginKeyword_2_0());
                    			
                    // InternalKinematics.g:1998:4: ( (lv_origin_3_0= rulePose ) )
                    // InternalKinematics.g:1999:5: (lv_origin_3_0= rulePose )
                    {
                    // InternalKinematics.g:1999:5: (lv_origin_3_0= rulePose )
                    // InternalKinematics.g:2000:6: lv_origin_3_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getVisualAccess().getOriginPoseParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_63);
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

            otherlv_4=(Token)match(input,60,FOLLOW_64); 

            			newLeafNode(otherlv_4, grammarAccess.getVisualAccess().getGeometryKeyword_3());
            		
            // InternalKinematics.g:2022:3: ( (lv_geometry_5_0= ruleGeometry ) )
            // InternalKinematics.g:2023:4: (lv_geometry_5_0= ruleGeometry )
            {
            // InternalKinematics.g:2023:4: (lv_geometry_5_0= ruleGeometry )
            // InternalKinematics.g:2024:5: lv_geometry_5_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getVisualAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalKinematics.g:2049:1: entryRuleCollision returns [EObject current=null] : iv_ruleCollision= ruleCollision EOF ;
    public final EObject entryRuleCollision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollision = null;


        try {
            // InternalKinematics.g:2049:50: (iv_ruleCollision= ruleCollision EOF )
            // InternalKinematics.g:2050:2: iv_ruleCollision= ruleCollision EOF
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
    // InternalKinematics.g:2056:1: ruleCollision returns [EObject current=null] : (otherlv_0= 'Collision' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) otherlv_6= '}' ) ;
    public final EObject ruleCollision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_origin_3_0 = null;

        EObject lv_geometry_5_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:2062:2: ( (otherlv_0= 'Collision' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) otherlv_6= '}' ) )
            // InternalKinematics.g:2063:2: (otherlv_0= 'Collision' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) otherlv_6= '}' )
            {
            // InternalKinematics.g:2063:2: (otherlv_0= 'Collision' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) otherlv_6= '}' )
            // InternalKinematics.g:2064:3: otherlv_0= 'Collision' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCollisionAccess().getCollisionKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_62); 

            			newLeafNode(otherlv_1, grammarAccess.getCollisionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalKinematics.g:2072:3: (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==41) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalKinematics.g:2073:4: otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) )
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_57); 

                    				newLeafNode(otherlv_2, grammarAccess.getCollisionAccess().getOriginKeyword_2_0());
                    			
                    // InternalKinematics.g:2077:4: ( (lv_origin_3_0= rulePose ) )
                    // InternalKinematics.g:2078:5: (lv_origin_3_0= rulePose )
                    {
                    // InternalKinematics.g:2078:5: (lv_origin_3_0= rulePose )
                    // InternalKinematics.g:2079:6: lv_origin_3_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getCollisionAccess().getOriginPoseParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_63);
                    lv_origin_3_0=rulePose();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollisionRule());
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

            otherlv_4=(Token)match(input,60,FOLLOW_64); 

            			newLeafNode(otherlv_4, grammarAccess.getCollisionAccess().getGeometryKeyword_3());
            		
            // InternalKinematics.g:2101:3: ( (lv_geometry_5_0= ruleGeometry ) )
            // InternalKinematics.g:2102:4: (lv_geometry_5_0= ruleGeometry )
            {
            // InternalKinematics.g:2102:4: (lv_geometry_5_0= ruleGeometry )
            // InternalKinematics.g:2103:5: lv_geometry_5_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_geometry_5_0=ruleGeometry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollisionRule());
            					}
            					set(
            						current,
            						"geometry",
            						lv_geometry_5_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Geometry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCollisionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalKinematics.g:2128:1: entryRuleMass returns [EObject current=null] : iv_ruleMass= ruleMass EOF ;
    public final EObject entryRuleMass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMass = null;


        try {
            // InternalKinematics.g:2128:45: (iv_ruleMass= ruleMass EOF )
            // InternalKinematics.g:2129:2: iv_ruleMass= ruleMass EOF
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
    // InternalKinematics.g:2135:1: ruleMass returns [EObject current=null] : ( () otherlv_1= 'Mass' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleMass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:2141:2: ( ( () otherlv_1= 'Mass' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )? otherlv_5= '}' ) )
            // InternalKinematics.g:2142:2: ( () otherlv_1= 'Mass' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )? otherlv_5= '}' )
            {
            // InternalKinematics.g:2142:2: ( () otherlv_1= 'Mass' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )? otherlv_5= '}' )
            // InternalKinematics.g:2143:3: () otherlv_1= 'Mass' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )? otherlv_5= '}'
            {
            // InternalKinematics.g:2143:3: ()
            // InternalKinematics.g:2144:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMassAccess().getMassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMassAccess().getMassKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getMassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKinematics.g:2158:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==29) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalKinematics.g:2159:4: otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_65); 

                    				newLeafNode(otherlv_3, grammarAccess.getMassAccess().getValueKeyword_3_0());
                    			
                    // InternalKinematics.g:2163:4: ( (lv_value_4_0= ruleDouble0 ) )
                    // InternalKinematics.g:2164:5: (lv_value_4_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:2164:5: (lv_value_4_0= ruleDouble0 )
                    // InternalKinematics.g:2165:6: lv_value_4_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getMassAccess().getValueDouble0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
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
    // InternalKinematics.g:2191:1: entryRuleInertia returns [EObject current=null] : iv_ruleInertia= ruleInertia EOF ;
    public final EObject entryRuleInertia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertia = null;


        try {
            // InternalKinematics.g:2191:48: (iv_ruleInertia= ruleInertia EOF )
            // InternalKinematics.g:2192:2: iv_ruleInertia= ruleInertia EOF
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
    // InternalKinematics.g:2198:1: ruleInertia returns [EObject current=null] : ( () otherlv_1= 'Inertia' otherlv_2= '{' (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )? (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )? (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )? (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )? (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )? (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )? otherlv_15= '}' ) ;
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
            // InternalKinematics.g:2204:2: ( ( () otherlv_1= 'Inertia' otherlv_2= '{' (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )? (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )? (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )? (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )? (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )? (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )? otherlv_15= '}' ) )
            // InternalKinematics.g:2205:2: ( () otherlv_1= 'Inertia' otherlv_2= '{' (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )? (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )? (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )? (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )? (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )? (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )? otherlv_15= '}' )
            {
            // InternalKinematics.g:2205:2: ( () otherlv_1= 'Inertia' otherlv_2= '{' (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )? (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )? (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )? (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )? (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )? (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )? otherlv_15= '}' )
            // InternalKinematics.g:2206:3: () otherlv_1= 'Inertia' otherlv_2= '{' (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )? (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )? (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )? (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )? (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )? (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )? otherlv_15= '}'
            {
            // InternalKinematics.g:2206:3: ()
            // InternalKinematics.g:2207:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInertiaAccess().getInertiaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInertiaAccess().getInertiaKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_66); 

            			newLeafNode(otherlv_2, grammarAccess.getInertiaAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKinematics.g:2221:3: (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==64) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalKinematics.g:2222:4: otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) )
                    {
                    otherlv_3=(Token)match(input,64,FOLLOW_65); 

                    				newLeafNode(otherlv_3, grammarAccess.getInertiaAccess().getIxxKeyword_3_0());
                    			
                    // InternalKinematics.g:2226:4: ( (lv_ixx_4_0= ruleDouble0 ) )
                    // InternalKinematics.g:2227:5: (lv_ixx_4_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:2227:5: (lv_ixx_4_0= ruleDouble0 )
                    // InternalKinematics.g:2228:6: lv_ixx_4_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIxxDouble0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_67);
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

            // InternalKinematics.g:2246:3: (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==65) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalKinematics.g:2247:4: otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) )
                    {
                    otherlv_5=(Token)match(input,65,FOLLOW_65); 

                    				newLeafNode(otherlv_5, grammarAccess.getInertiaAccess().getIxyKeyword_4_0());
                    			
                    // InternalKinematics.g:2251:4: ( (lv_ixy_6_0= ruleDouble0 ) )
                    // InternalKinematics.g:2252:5: (lv_ixy_6_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:2252:5: (lv_ixy_6_0= ruleDouble0 )
                    // InternalKinematics.g:2253:6: lv_ixy_6_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIxyDouble0ParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_68);
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

            // InternalKinematics.g:2271:3: (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==66) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalKinematics.g:2272:4: otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) )
                    {
                    otherlv_7=(Token)match(input,66,FOLLOW_65); 

                    				newLeafNode(otherlv_7, grammarAccess.getInertiaAccess().getIxzKeyword_5_0());
                    			
                    // InternalKinematics.g:2276:4: ( (lv_ixz_8_0= ruleDouble0 ) )
                    // InternalKinematics.g:2277:5: (lv_ixz_8_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:2277:5: (lv_ixz_8_0= ruleDouble0 )
                    // InternalKinematics.g:2278:6: lv_ixz_8_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIxzDouble0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_69);
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

            // InternalKinematics.g:2296:3: (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==67) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalKinematics.g:2297:4: otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) )
                    {
                    otherlv_9=(Token)match(input,67,FOLLOW_65); 

                    				newLeafNode(otherlv_9, grammarAccess.getInertiaAccess().getIyyKeyword_6_0());
                    			
                    // InternalKinematics.g:2301:4: ( (lv_iyy_10_0= ruleDouble0 ) )
                    // InternalKinematics.g:2302:5: (lv_iyy_10_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:2302:5: (lv_iyy_10_0= ruleDouble0 )
                    // InternalKinematics.g:2303:6: lv_iyy_10_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIyyDouble0ParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_70);
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

            // InternalKinematics.g:2321:3: (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==68) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalKinematics.g:2322:4: otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) )
                    {
                    otherlv_11=(Token)match(input,68,FOLLOW_65); 

                    				newLeafNode(otherlv_11, grammarAccess.getInertiaAccess().getIyzKeyword_7_0());
                    			
                    // InternalKinematics.g:2326:4: ( (lv_iyz_12_0= ruleDouble0 ) )
                    // InternalKinematics.g:2327:5: (lv_iyz_12_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:2327:5: (lv_iyz_12_0= ruleDouble0 )
                    // InternalKinematics.g:2328:6: lv_iyz_12_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIyzDouble0ParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_71);
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

            // InternalKinematics.g:2346:3: (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==69) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalKinematics.g:2347:4: otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) )
                    {
                    otherlv_13=(Token)match(input,69,FOLLOW_65); 

                    				newLeafNode(otherlv_13, grammarAccess.getInertiaAccess().getIzzKeyword_8_0());
                    			
                    // InternalKinematics.g:2351:4: ( (lv_izz_14_0= ruleDouble0 ) )
                    // InternalKinematics.g:2352:5: (lv_izz_14_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:2352:5: (lv_izz_14_0= ruleDouble0 )
                    // InternalKinematics.g:2353:6: lv_izz_14_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIzzDouble0ParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_15);
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
    // InternalKinematics.g:2379:1: entryRuleGeometry returns [EObject current=null] : iv_ruleGeometry= ruleGeometry EOF ;
    public final EObject entryRuleGeometry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeometry = null;


        try {
            // InternalKinematics.g:2379:49: (iv_ruleGeometry= ruleGeometry EOF )
            // InternalKinematics.g:2380:2: iv_ruleGeometry= ruleGeometry EOF
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
    // InternalKinematics.g:2386:1: ruleGeometry returns [EObject current=null] : ( () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )? (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )? otherlv_11= '}' ) ;
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
            // InternalKinematics.g:2392:2: ( ( () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )? (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )? otherlv_11= '}' ) )
            // InternalKinematics.g:2393:2: ( () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )? (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )? otherlv_11= '}' )
            {
            // InternalKinematics.g:2393:2: ( () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )? (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )? otherlv_11= '}' )
            // InternalKinematics.g:2394:3: () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )? (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )? otherlv_11= '}'
            {
            // InternalKinematics.g:2394:3: ()
            // InternalKinematics.g:2395:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGeometryAccess().getGeometryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,70,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGeometryAccess().getGeometryKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_72); 

            			newLeafNode(otherlv_2, grammarAccess.getGeometryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKinematics.g:2409:3: (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==71) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalKinematics.g:2410:4: otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) )
                    {
                    otherlv_3=(Token)match(input,71,FOLLOW_73); 

                    				newLeafNode(otherlv_3, grammarAccess.getGeometryAccess().getBoxKeyword_3_0());
                    			
                    // InternalKinematics.g:2414:4: ( (lv_box_4_0= ruleBox ) )
                    // InternalKinematics.g:2415:5: (lv_box_4_0= ruleBox )
                    {
                    // InternalKinematics.g:2415:5: (lv_box_4_0= ruleBox )
                    // InternalKinematics.g:2416:6: lv_box_4_0= ruleBox
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getBoxBoxParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_74);
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

            // InternalKinematics.g:2434:3: (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==72) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalKinematics.g:2435:4: otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) )
                    {
                    otherlv_5=(Token)match(input,72,FOLLOW_75); 

                    				newLeafNode(otherlv_5, grammarAccess.getGeometryAccess().getCylinderKeyword_4_0());
                    			
                    // InternalKinematics.g:2439:4: ( (lv_cylinder_6_0= ruleCylinder ) )
                    // InternalKinematics.g:2440:5: (lv_cylinder_6_0= ruleCylinder )
                    {
                    // InternalKinematics.g:2440:5: (lv_cylinder_6_0= ruleCylinder )
                    // InternalKinematics.g:2441:6: lv_cylinder_6_0= ruleCylinder
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getCylinderCylinderParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_76);
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

            // InternalKinematics.g:2459:3: (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==73) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalKinematics.g:2460:4: otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) )
                    {
                    otherlv_7=(Token)match(input,73,FOLLOW_77); 

                    				newLeafNode(otherlv_7, grammarAccess.getGeometryAccess().getSphereKeyword_5_0());
                    			
                    // InternalKinematics.g:2464:4: ( (lv_sphere_8_0= ruleSphere ) )
                    // InternalKinematics.g:2465:5: (lv_sphere_8_0= ruleSphere )
                    {
                    // InternalKinematics.g:2465:5: (lv_sphere_8_0= ruleSphere )
                    // InternalKinematics.g:2466:6: lv_sphere_8_0= ruleSphere
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getSphereSphereParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_78);
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

            // InternalKinematics.g:2484:3: (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==74) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalKinematics.g:2485:4: otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) )
                    {
                    otherlv_9=(Token)match(input,74,FOLLOW_79); 

                    				newLeafNode(otherlv_9, grammarAccess.getGeometryAccess().getMeshKeyword_6_0());
                    			
                    // InternalKinematics.g:2489:4: ( (lv_mesh_10_0= ruleMesh ) )
                    // InternalKinematics.g:2490:5: (lv_mesh_10_0= ruleMesh )
                    {
                    // InternalKinematics.g:2490:5: (lv_mesh_10_0= ruleMesh )
                    // InternalKinematics.g:2491:6: lv_mesh_10_0= ruleMesh
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getMeshMeshParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_15);
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


    // $ANTLR start "entryRuleBox"
    // InternalKinematics.g:2517:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // InternalKinematics.g:2517:44: (iv_ruleBox= ruleBox EOF )
            // InternalKinematics.g:2518:2: iv_ruleBox= ruleBox EOF
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
    // InternalKinematics.g:2524:1: ruleBox returns [EObject current=null] : ( () otherlv_1= 'Box' otherlv_2= '{' (otherlv_3= 'size' ( (lv_size_4_0= ruleParameterString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_size_4_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:2530:2: ( ( () otherlv_1= 'Box' otherlv_2= '{' (otherlv_3= 'size' ( (lv_size_4_0= ruleParameterString ) ) )? otherlv_5= '}' ) )
            // InternalKinematics.g:2531:2: ( () otherlv_1= 'Box' otherlv_2= '{' (otherlv_3= 'size' ( (lv_size_4_0= ruleParameterString ) ) )? otherlv_5= '}' )
            {
            // InternalKinematics.g:2531:2: ( () otherlv_1= 'Box' otherlv_2= '{' (otherlv_3= 'size' ( (lv_size_4_0= ruleParameterString ) ) )? otherlv_5= '}' )
            // InternalKinematics.g:2532:3: () otherlv_1= 'Box' otherlv_2= '{' (otherlv_3= 'size' ( (lv_size_4_0= ruleParameterString ) ) )? otherlv_5= '}'
            {
            // InternalKinematics.g:2532:3: ()
            // InternalKinematics.g:2533:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoxAccess().getBoxAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,75,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBoxAccess().getBoxKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_80); 

            			newLeafNode(otherlv_2, grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKinematics.g:2547:3: (otherlv_3= 'size' ( (lv_size_4_0= ruleParameterString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==76) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalKinematics.g:2548:4: otherlv_3= 'size' ( (lv_size_4_0= ruleParameterString ) )
                    {
                    otherlv_3=(Token)match(input,76,FOLLOW_81); 

                    				newLeafNode(otherlv_3, grammarAccess.getBoxAccess().getSizeKeyword_3_0());
                    			
                    // InternalKinematics.g:2552:4: ( (lv_size_4_0= ruleParameterString ) )
                    // InternalKinematics.g:2553:5: (lv_size_4_0= ruleParameterString )
                    {
                    // InternalKinematics.g:2553:5: (lv_size_4_0= ruleParameterString )
                    // InternalKinematics.g:2554:6: lv_size_4_0= ruleParameterString
                    {

                    						newCompositeNode(grammarAccess.getBoxAccess().getSizeParameterStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_size_4_0=ruleParameterString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoxRule());
                    						}
                    						set(
                    							current,
                    							"size",
                    							lv_size_4_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.ParameterString");
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
    // InternalKinematics.g:2580:1: entryRuleCylinder returns [EObject current=null] : iv_ruleCylinder= ruleCylinder EOF ;
    public final EObject entryRuleCylinder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCylinder = null;


        try {
            // InternalKinematics.g:2580:49: (iv_ruleCylinder= ruleCylinder EOF )
            // InternalKinematics.g:2581:2: iv_ruleCylinder= ruleCylinder EOF
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
    // InternalKinematics.g:2587:1: ruleCylinder returns [EObject current=null] : (otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}' ) ;
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
            // InternalKinematics.g:2593:2: ( (otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}' ) )
            // InternalKinematics.g:2594:2: (otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}' )
            {
            // InternalKinematics.g:2594:2: (otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}' )
            // InternalKinematics.g:2595:3: otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCylinderAccess().getCylinderKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_82); 

            			newLeafNode(otherlv_1, grammarAccess.getCylinderAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,78,FOLLOW_65); 

            			newLeafNode(otherlv_2, grammarAccess.getCylinderAccess().getLengthKeyword_2());
            		
            // InternalKinematics.g:2607:3: ( (lv_length_3_0= ruleDouble0 ) )
            // InternalKinematics.g:2608:4: (lv_length_3_0= ruleDouble0 )
            {
            // InternalKinematics.g:2608:4: (lv_length_3_0= ruleDouble0 )
            // InternalKinematics.g:2609:5: lv_length_3_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getCylinderAccess().getLengthDouble0ParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_83);
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

            otherlv_4=(Token)match(input,79,FOLLOW_65); 

            			newLeafNode(otherlv_4, grammarAccess.getCylinderAccess().getRadiusKeyword_4());
            		
            // InternalKinematics.g:2630:3: ( (lv_radius_5_0= ruleDouble0 ) )
            // InternalKinematics.g:2631:4: (lv_radius_5_0= ruleDouble0 )
            {
            // InternalKinematics.g:2631:4: (lv_radius_5_0= ruleDouble0 )
            // InternalKinematics.g:2632:5: lv_radius_5_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getCylinderAccess().getRadiusDouble0ParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
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
    // InternalKinematics.g:2657:1: entryRuleSphere returns [EObject current=null] : iv_ruleSphere= ruleSphere EOF ;
    public final EObject entryRuleSphere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSphere = null;


        try {
            // InternalKinematics.g:2657:47: (iv_ruleSphere= ruleSphere EOF )
            // InternalKinematics.g:2658:2: iv_ruleSphere= ruleSphere EOF
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
    // InternalKinematics.g:2664:1: ruleSphere returns [EObject current=null] : (otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}' ) ;
    public final EObject ruleSphere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_radius_3_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:2670:2: ( (otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}' ) )
            // InternalKinematics.g:2671:2: (otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}' )
            {
            // InternalKinematics.g:2671:2: (otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}' )
            // InternalKinematics.g:2672:3: otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSphereAccess().getSphereKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_83); 

            			newLeafNode(otherlv_1, grammarAccess.getSphereAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,79,FOLLOW_65); 

            			newLeafNode(otherlv_2, grammarAccess.getSphereAccess().getRadiusKeyword_2());
            		
            // InternalKinematics.g:2684:3: ( (lv_radius_3_0= ruleDouble0 ) )
            // InternalKinematics.g:2685:4: (lv_radius_3_0= ruleDouble0 )
            {
            // InternalKinematics.g:2685:4: (lv_radius_3_0= ruleDouble0 )
            // InternalKinematics.g:2686:5: lv_radius_3_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getSphereAccess().getRadiusDouble0ParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
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
    // InternalKinematics.g:2711:1: entryRuleMesh returns [EObject current=null] : iv_ruleMesh= ruleMesh EOF ;
    public final EObject entryRuleMesh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMesh = null;


        try {
            // InternalKinematics.g:2711:45: (iv_ruleMesh= ruleMesh EOF )
            // InternalKinematics.g:2712:2: iv_ruleMesh= ruleMesh EOF
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
    // InternalKinematics.g:2718:1: ruleMesh returns [EObject current=null] : (otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= RULE_STRING ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleDouble0 ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleMesh() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_filename_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_scale_5_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:2724:2: ( (otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= RULE_STRING ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleDouble0 ) ) )? otherlv_6= '}' ) )
            // InternalKinematics.g:2725:2: (otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= RULE_STRING ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleDouble0 ) ) )? otherlv_6= '}' )
            {
            // InternalKinematics.g:2725:2: (otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= RULE_STRING ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleDouble0 ) ) )? otherlv_6= '}' )
            // InternalKinematics.g:2726:3: otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= RULE_STRING ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleDouble0 ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,81,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMeshAccess().getMeshKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_84); 

            			newLeafNode(otherlv_1, grammarAccess.getMeshAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,82,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMeshAccess().getFilenameKeyword_2());
            		
            // InternalKinematics.g:2738:3: ( (lv_filename_3_0= RULE_STRING ) )
            // InternalKinematics.g:2739:4: (lv_filename_3_0= RULE_STRING )
            {
            // InternalKinematics.g:2739:4: (lv_filename_3_0= RULE_STRING )
            // InternalKinematics.g:2740:5: lv_filename_3_0= RULE_STRING
            {
            lv_filename_3_0=(Token)match(input,RULE_STRING,FOLLOW_85); 

            					newLeafNode(lv_filename_3_0, grammarAccess.getMeshAccess().getFilenameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeshRule());
            					}
            					setWithLastConsumed(
            						current,
            						"filename",
            						lv_filename_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalKinematics.g:2756:3: (otherlv_4= 'scale' ( (lv_scale_5_0= ruleDouble0 ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==83) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalKinematics.g:2757:4: otherlv_4= 'scale' ( (lv_scale_5_0= ruleDouble0 ) )
                    {
                    otherlv_4=(Token)match(input,83,FOLLOW_65); 

                    				newLeafNode(otherlv_4, grammarAccess.getMeshAccess().getScaleKeyword_4_0());
                    			
                    // InternalKinematics.g:2761:4: ( (lv_scale_5_0= ruleDouble0 ) )
                    // InternalKinematics.g:2762:5: (lv_scale_5_0= ruleDouble0 )
                    {
                    // InternalKinematics.g:2762:5: (lv_scale_5_0= ruleDouble0 )
                    // InternalKinematics.g:2763:6: lv_scale_5_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getMeshAccess().getScaleDouble0ParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_scale_5_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeshRule());
                    						}
                    						set(
                    							current,
                    							"scale",
                    							lv_scale_5_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Double0");
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


    // $ANTLR start "entryRuleDouble0"
    // InternalKinematics.g:2789:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalKinematics.g:2789:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalKinematics.g:2790:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalKinematics.g:2796:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalKinematics.g:2802:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalKinematics.g:2803:2: this_DOUBLE_0= RULE_DOUBLE
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001D80000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001D00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000005400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000C00400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000010000030L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000E0000400000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000C0000400000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080000400000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000E00000400030L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000E00000400000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000C00000400000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000800000400000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0003000000400000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0002000000400000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x00F0000000400000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x00E0000000400000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x00C0000000400000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0080000000400000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0600020000400000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0600000000400000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0400000000400000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x1000020000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000400000L,0x000000000000003FL});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000400000L,0x000000000000003EL});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000400000L,0x000000000000003CL});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000038L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000030L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000020L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000780L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000700L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000600L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000400L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000400000L,0x0000000000001000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000400030L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000400000L,0x0000000000080000L});

}