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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_JOINTTYPE", "RULE_DOUBLE", "RULE_DIGIT", "RULE_BOOLEAN", "RULE_DECINT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'{'", "'name'", "'version'", "'macro'", "','", "'}'", "'macroCall'", "'body'", "'Macro'", "'parameter'", "'Parameter'", "'value'", "'+'", "'Body'", "'link'", "'joint'", "'MacroCall'", "'ParameterCall'", "'Joint'", "'type'", "'parent'", "'child'", "'origin'", "'axis'", "'limit'", "'Link'", "'inertial'", "'visual'", "'collision'", "'Pose'", "'rpy'", "'xyz'", "'Vector3'", "'Limit'", "'effort'", "'lower'", "'upper'", "'velocity'", "'Inertial'", "'mass'", "'inertia'", "'Visual'", "'geometry'", "'Collision'", "'Mass'", "'Inertia'", "'ixx'", "'ixy'", "'ixz'", "'iyy'", "'iyz'", "'izz'", "'Geometry'", "'box'", "'cylinder'", "'sphere'", "'mesh'", "'Box'", "'size'", "'Cylinder'", "'length'", "'radius'", "'Sphere'", "'Mesh'", "'filename'", "'scale'", "'AnyURI'"
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
    // InternalXacro.g:71:1: ruleRobot returns [EObject current=null] : ( () otherlv_1= 'Robot' otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'version' ( (lv_version_6_0= RULE_STRING ) ) )? (otherlv_7= 'macro' otherlv_8= '{' ( (lv_macro_9_0= ruleMacro ) ) (otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) ) )* otherlv_12= '}' )? (otherlv_13= 'macroCall' otherlv_14= '{' ( (lv_macroCall_15_0= ruleMacroCall ) ) (otherlv_16= ',' ( (lv_macroCall_17_0= ruleMacroCall ) ) )* otherlv_18= '}' )? (otherlv_19= 'body' ( (lv_body_20_0= ruleBody ) ) )? otherlv_21= '}' ) ;
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
            // InternalXacro.g:77:2: ( ( () otherlv_1= 'Robot' otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'version' ( (lv_version_6_0= RULE_STRING ) ) )? (otherlv_7= 'macro' otherlv_8= '{' ( (lv_macro_9_0= ruleMacro ) ) (otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) ) )* otherlv_12= '}' )? (otherlv_13= 'macroCall' otherlv_14= '{' ( (lv_macroCall_15_0= ruleMacroCall ) ) (otherlv_16= ',' ( (lv_macroCall_17_0= ruleMacroCall ) ) )* otherlv_18= '}' )? (otherlv_19= 'body' ( (lv_body_20_0= ruleBody ) ) )? otherlv_21= '}' ) )
            // InternalXacro.g:78:2: ( () otherlv_1= 'Robot' otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'version' ( (lv_version_6_0= RULE_STRING ) ) )? (otherlv_7= 'macro' otherlv_8= '{' ( (lv_macro_9_0= ruleMacro ) ) (otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) ) )* otherlv_12= '}' )? (otherlv_13= 'macroCall' otherlv_14= '{' ( (lv_macroCall_15_0= ruleMacroCall ) ) (otherlv_16= ',' ( (lv_macroCall_17_0= ruleMacroCall ) ) )* otherlv_18= '}' )? (otherlv_19= 'body' ( (lv_body_20_0= ruleBody ) ) )? otherlv_21= '}' )
            {
            // InternalXacro.g:78:2: ( () otherlv_1= 'Robot' otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'version' ( (lv_version_6_0= RULE_STRING ) ) )? (otherlv_7= 'macro' otherlv_8= '{' ( (lv_macro_9_0= ruleMacro ) ) (otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) ) )* otherlv_12= '}' )? (otherlv_13= 'macroCall' otherlv_14= '{' ( (lv_macroCall_15_0= ruleMacroCall ) ) (otherlv_16= ',' ( (lv_macroCall_17_0= ruleMacroCall ) ) )* otherlv_18= '}' )? (otherlv_19= 'body' ( (lv_body_20_0= ruleBody ) ) )? otherlv_21= '}' )
            // InternalXacro.g:79:3: () otherlv_1= 'Robot' otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'version' ( (lv_version_6_0= RULE_STRING ) ) )? (otherlv_7= 'macro' otherlv_8= '{' ( (lv_macro_9_0= ruleMacro ) ) (otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) ) )* otherlv_12= '}' )? (otherlv_13= 'macroCall' otherlv_14= '{' ( (lv_macroCall_15_0= ruleMacroCall ) ) (otherlv_16= ',' ( (lv_macroCall_17_0= ruleMacroCall ) ) )* otherlv_18= '}' )? (otherlv_19= 'body' ( (lv_body_20_0= ruleBody ) ) )? otherlv_21= '}'
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
            		
            // InternalXacro.g:98:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalXacro.g:99:4: (lv_name_4_0= RULE_ID )
            {
            // InternalXacro.g:99:4: (lv_name_4_0= RULE_ID )
            // InternalXacro.g:100:5: lv_name_4_0= RULE_ID
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

            // InternalXacro.g:116:3: (otherlv_5= 'version' ( (lv_version_6_0= RULE_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalXacro.g:117:4: otherlv_5= 'version' ( (lv_version_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getRobotAccess().getVersionKeyword_5_0());
                    			
                    // InternalXacro.g:121:4: ( (lv_version_6_0= RULE_STRING ) )
                    // InternalXacro.g:122:5: (lv_version_6_0= RULE_STRING )
                    {
                    // InternalXacro.g:122:5: (lv_version_6_0= RULE_STRING )
                    // InternalXacro.g:123:6: lv_version_6_0= RULE_STRING
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

            // InternalXacro.g:140:3: (otherlv_7= 'macro' otherlv_8= '{' ( (lv_macro_9_0= ruleMacro ) ) (otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) ) )* otherlv_12= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalXacro.g:141:4: otherlv_7= 'macro' otherlv_8= '{' ( (lv_macro_9_0= ruleMacro ) ) (otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getRobotAccess().getMacroKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalXacro.g:149:4: ( (lv_macro_9_0= ruleMacro ) )
                    // InternalXacro.g:150:5: (lv_macro_9_0= ruleMacro )
                    {
                    // InternalXacro.g:150:5: (lv_macro_9_0= ruleMacro )
                    // InternalXacro.g:151:6: lv_macro_9_0= ruleMacro
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
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Macro");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXacro.g:168:4: (otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==21) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalXacro.g:169:5: otherlv_10= ',' ( (lv_macro_11_0= ruleMacro ) )
                    	    {
                    	    otherlv_10=(Token)match(input,21,FOLLOW_9); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getRobotAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalXacro.g:173:5: ( (lv_macro_11_0= ruleMacro ) )
                    	    // InternalXacro.g:174:6: (lv_macro_11_0= ruleMacro )
                    	    {
                    	    // InternalXacro.g:174:6: (lv_macro_11_0= ruleMacro )
                    	    // InternalXacro.g:175:7: lv_macro_11_0= ruleMacro
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

                    otherlv_12=(Token)match(input,22,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:198:3: (otherlv_13= 'macroCall' otherlv_14= '{' ( (lv_macroCall_15_0= ruleMacroCall ) ) (otherlv_16= ',' ( (lv_macroCall_17_0= ruleMacroCall ) ) )* otherlv_18= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalXacro.g:199:4: otherlv_13= 'macroCall' otherlv_14= '{' ( (lv_macroCall_15_0= ruleMacroCall ) ) (otherlv_16= ',' ( (lv_macroCall_17_0= ruleMacroCall ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getRobotAccess().getMacroCallKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalXacro.g:207:4: ( (lv_macroCall_15_0= ruleMacroCall ) )
                    // InternalXacro.g:208:5: (lv_macroCall_15_0= ruleMacroCall )
                    {
                    // InternalXacro.g:208:5: (lv_macroCall_15_0= ruleMacroCall )
                    // InternalXacro.g:209:6: lv_macroCall_15_0= ruleMacroCall
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
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.MacroCall");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXacro.g:226:4: (otherlv_16= ',' ( (lv_macroCall_17_0= ruleMacroCall ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==21) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalXacro.g:227:5: otherlv_16= ',' ( (lv_macroCall_17_0= ruleMacroCall ) )
                    	    {
                    	    otherlv_16=(Token)match(input,21,FOLLOW_12); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getRobotAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalXacro.g:231:5: ( (lv_macroCall_17_0= ruleMacroCall ) )
                    	    // InternalXacro.g:232:6: (lv_macroCall_17_0= ruleMacroCall )
                    	    {
                    	    // InternalXacro.g:232:6: (lv_macroCall_17_0= ruleMacroCall )
                    	    // InternalXacro.g:233:7: lv_macroCall_17_0= ruleMacroCall
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
                    	    								"de.fraunhofer.ipa.kinematics.xacro.Xacro.MacroCall");
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

            // InternalXacro.g:256:3: (otherlv_19= 'body' ( (lv_body_20_0= ruleBody ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXacro.g:257:4: otherlv_19= 'body' ( (lv_body_20_0= ruleBody ) )
                    {
                    otherlv_19=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_19, grammarAccess.getRobotAccess().getBodyKeyword_8_0());
                    			
                    // InternalXacro.g:261:4: ( (lv_body_20_0= ruleBody ) )
                    // InternalXacro.g:262:5: (lv_body_20_0= ruleBody )
                    {
                    // InternalXacro.g:262:5: (lv_body_20_0= ruleBody )
                    // InternalXacro.g:263:6: lv_body_20_0= ruleBody
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
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Body");
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
    // InternalXacro.g:289:1: entryRuleMacro returns [EObject current=null] : iv_ruleMacro= ruleMacro EOF ;
    public final EObject entryRuleMacro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacro = null;


        try {
            // InternalXacro.g:289:46: (iv_ruleMacro= ruleMacro EOF )
            // InternalXacro.g:290:2: iv_ruleMacro= ruleMacro EOF
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
    // InternalXacro.g:296:1: ruleMacro returns [EObject current=null] : (otherlv_0= 'Macro' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'body' ( (lv_body_11_0= ruleBody ) ) )? otherlv_12= '}' ) ;
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
            // InternalXacro.g:302:2: ( (otherlv_0= 'Macro' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'body' ( (lv_body_11_0= ruleBody ) ) )? otherlv_12= '}' ) )
            // InternalXacro.g:303:2: (otherlv_0= 'Macro' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'body' ( (lv_body_11_0= ruleBody ) ) )? otherlv_12= '}' )
            {
            // InternalXacro.g:303:2: (otherlv_0= 'Macro' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'body' ( (lv_body_11_0= ruleBody ) ) )? otherlv_12= '}' )
            // InternalXacro.g:304:3: otherlv_0= 'Macro' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'body' ( (lv_body_11_0= ruleBody ) ) )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMacroAccess().getMacroKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMacroAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMacroAccess().getNameKeyword_2());
            		
            // InternalXacro.g:316:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalXacro.g:317:4: (lv_name_3_0= RULE_ID )
            {
            // InternalXacro.g:317:4: (lv_name_3_0= RULE_ID )
            // InternalXacro.g:318:5: lv_name_3_0= RULE_ID
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

            // InternalXacro.g:334:3: (otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXacro.g:335:4: otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getMacroAccess().getParameterKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,17,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getMacroAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalXacro.g:343:4: ( (lv_parameter_6_0= ruleParameter ) )
                    // InternalXacro.g:344:5: (lv_parameter_6_0= ruleParameter )
                    {
                    // InternalXacro.g:344:5: (lv_parameter_6_0= ruleParameter )
                    // InternalXacro.g:345:6: lv_parameter_6_0= ruleParameter
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
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXacro.g:362:4: (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==21) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalXacro.g:363:5: otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,21,FOLLOW_17); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getMacroAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalXacro.g:367:5: ( (lv_parameter_8_0= ruleParameter ) )
                    	    // InternalXacro.g:368:6: (lv_parameter_8_0= ruleParameter )
                    	    {
                    	    // InternalXacro.g:368:6: (lv_parameter_8_0= ruleParameter )
                    	    // InternalXacro.g:369:7: lv_parameter_8_0= ruleParameter
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
                    	    								"de.fraunhofer.ipa.kinematics.xacro.Xacro.Parameter");
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

            // InternalXacro.g:392:3: (otherlv_10= 'body' ( (lv_body_11_0= ruleBody ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXacro.g:393:4: otherlv_10= 'body' ( (lv_body_11_0= ruleBody ) )
                    {
                    otherlv_10=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getMacroAccess().getBodyKeyword_5_0());
                    			
                    // InternalXacro.g:397:4: ( (lv_body_11_0= ruleBody ) )
                    // InternalXacro.g:398:5: (lv_body_11_0= ruleBody )
                    {
                    // InternalXacro.g:398:5: (lv_body_11_0= ruleBody )
                    // InternalXacro.g:399:6: lv_body_11_0= ruleBody
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
    // InternalXacro.g:425:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalXacro.g:425:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalXacro.g:426:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalXacro.g:432:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= 'Parameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleParameterValue ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:438:2: ( ( () otherlv_1= 'Parameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleParameterValue ) ) )? otherlv_6= '}' ) )
            // InternalXacro.g:439:2: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleParameterValue ) ) )? otherlv_6= '}' )
            {
            // InternalXacro.g:439:2: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleParameterValue ) ) )? otherlv_6= '}' )
            // InternalXacro.g:440:3: () otherlv_1= 'Parameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleParameterValue ) ) )? otherlv_6= '}'
            {
            // InternalXacro.g:440:3: ()
            // InternalXacro.g:441:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getParameterKeyword_1());
            		
            // InternalXacro.g:451:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXacro.g:452:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXacro.g:452:4: (lv_name_2_0= RULE_ID )
            // InternalXacro.g:453:5: lv_name_2_0= RULE_ID
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
            		
            // InternalXacro.g:473:3: (otherlv_4= 'value' ( (lv_value_5_0= ruleParameterValue ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXacro.g:474:4: otherlv_4= 'value' ( (lv_value_5_0= ruleParameterValue ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getValueKeyword_4_0());
                    			
                    // InternalXacro.g:478:4: ( (lv_value_5_0= ruleParameterValue ) )
                    // InternalXacro.g:479:5: (lv_value_5_0= ruleParameterValue )
                    {
                    // InternalXacro.g:479:5: (lv_value_5_0= ruleParameterValue )
                    // InternalXacro.g:480:6: lv_value_5_0= ruleParameterValue
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getValueParameterValueParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_value_5_0=ruleParameterValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.ParameterValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalXacro.g:506:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalXacro.g:506:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalXacro.g:507:2: iv_ruleParameterValue= ruleParameterValue EOF
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
    // InternalXacro.g:513:1: ruleParameterValue returns [EObject current=null] : ( ( () ruleEString ) | this_Pose_2= rulePose ) ;
    public final EObject ruleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject this_Pose_2 = null;



        	enterRule();

        try {
            // InternalXacro.g:519:2: ( ( ( () ruleEString ) | this_Pose_2= rulePose ) )
            // InternalXacro.g:520:2: ( ( () ruleEString ) | this_Pose_2= rulePose )
            {
            // InternalXacro.g:520:2: ( ( () ruleEString ) | this_Pose_2= rulePose )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==46) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalXacro.g:521:3: ( () ruleEString )
                    {
                    // InternalXacro.g:521:3: ( () ruleEString )
                    // InternalXacro.g:522:4: () ruleEString
                    {
                    // InternalXacro.g:522:4: ()
                    // InternalXacro.g:523:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getParameterValueAccess().getParameterValueAction_0_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getParameterValueAccess().getEStringParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXacro.g:538:3: this_Pose_2= rulePose
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getPoseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Pose_2=rulePose();

                    state._fsp--;


                    			current = this_Pose_2;
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


    // $ANTLR start "entryRuleParameterString"
    // InternalXacro.g:550:1: entryRuleParameterString returns [EObject current=null] : iv_ruleParameterString= ruleParameterString EOF ;
    public final EObject entryRuleParameterString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterString = null;


        try {
            // InternalXacro.g:550:56: (iv_ruleParameterString= ruleParameterString EOF )
            // InternalXacro.g:551:2: iv_ruleParameterString= ruleParameterString EOF
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
    // InternalXacro.g:557:1: ruleParameterString returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_STRING ) )? (otherlv_2= '+' this_STRING_3= RULE_STRING )? ) | ( (lv_value_4_0= RULE_ID ) ) ) ;
    public final EObject ruleParameterString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_STRING_3=null;
        Token lv_value_4_0=null;


        	enterRule();

        try {
            // InternalXacro.g:563:2: ( ( ( () ( (otherlv_1= RULE_STRING ) )? (otherlv_2= '+' this_STRING_3= RULE_STRING )? ) | ( (lv_value_4_0= RULE_ID ) ) ) )
            // InternalXacro.g:564:2: ( ( () ( (otherlv_1= RULE_STRING ) )? (otherlv_2= '+' this_STRING_3= RULE_STRING )? ) | ( (lv_value_4_0= RULE_ID ) ) )
            {
            // InternalXacro.g:564:2: ( ( () ( (otherlv_1= RULE_STRING ) )? (otherlv_2= '+' this_STRING_3= RULE_STRING )? ) | ( (lv_value_4_0= RULE_ID ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EOF||LA14_0==RULE_STRING||LA14_0==22||LA14_0==29||LA14_0==36||(LA14_0>=43 && LA14_0<=45)) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalXacro.g:565:3: ( () ( (otherlv_1= RULE_STRING ) )? (otherlv_2= '+' this_STRING_3= RULE_STRING )? )
                    {
                    // InternalXacro.g:565:3: ( () ( (otherlv_1= RULE_STRING ) )? (otherlv_2= '+' this_STRING_3= RULE_STRING )? )
                    // InternalXacro.g:566:4: () ( (otherlv_1= RULE_STRING ) )? (otherlv_2= '+' this_STRING_3= RULE_STRING )?
                    {
                    // InternalXacro.g:566:4: ()
                    // InternalXacro.g:567:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getParameterStringAccess().getParameterStringAction_0_0(),
                    						current);
                    				

                    }

                    // InternalXacro.g:573:4: ( (otherlv_1= RULE_STRING ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_STRING) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalXacro.g:574:5: (otherlv_1= RULE_STRING )
                            {
                            // InternalXacro.g:574:5: (otherlv_1= RULE_STRING )
                            // InternalXacro.g:575:6: otherlv_1= RULE_STRING
                            {

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getParameterStringRule());
                            						}
                            					
                            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_20); 

                            						newLeafNode(otherlv_1, grammarAccess.getParameterStringAccess().getRefParameterCrossReference_0_1_0());
                            					

                            }


                            }
                            break;

                    }

                    // InternalXacro.g:586:4: (otherlv_2= '+' this_STRING_3= RULE_STRING )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==29) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalXacro.g:587:5: otherlv_2= '+' this_STRING_3= RULE_STRING
                            {
                            otherlv_2=(Token)match(input,29,FOLLOW_7); 

                            					newLeafNode(otherlv_2, grammarAccess.getParameterStringAccess().getPlusSignKeyword_0_2_0());
                            				
                            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_2); 

                            					newLeafNode(this_STRING_3, grammarAccess.getParameterStringAccess().getSTRINGTerminalRuleCall_0_2_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXacro.g:598:3: ( (lv_value_4_0= RULE_ID ) )
                    {
                    // InternalXacro.g:598:3: ( (lv_value_4_0= RULE_ID ) )
                    // InternalXacro.g:599:4: (lv_value_4_0= RULE_ID )
                    {
                    // InternalXacro.g:599:4: (lv_value_4_0= RULE_ID )
                    // InternalXacro.g:600:5: lv_value_4_0= RULE_ID
                    {
                    lv_value_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_value_4_0, grammarAccess.getParameterStringAccess().getValueIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterStringRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_4_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

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
    // $ANTLR end "ruleParameterString"


    // $ANTLR start "entryRuleParameterPose"
    // InternalXacro.g:620:1: entryRuleParameterPose returns [EObject current=null] : iv_ruleParameterPose= ruleParameterPose EOF ;
    public final EObject entryRuleParameterPose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterPose = null;


        try {
            // InternalXacro.g:620:54: (iv_ruleParameterPose= ruleParameterPose EOF )
            // InternalXacro.g:621:2: iv_ruleParameterPose= ruleParameterPose EOF
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
    // InternalXacro.g:627:1: ruleParameterPose returns [EObject current=null] : ( ( (otherlv_0= RULE_STRING ) ) | ( (lv_value_1_0= rulePose ) ) ) ;
    public final EObject ruleParameterPose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:633:2: ( ( ( (otherlv_0= RULE_STRING ) ) | ( (lv_value_1_0= rulePose ) ) ) )
            // InternalXacro.g:634:2: ( ( (otherlv_0= RULE_STRING ) ) | ( (lv_value_1_0= rulePose ) ) )
            {
            // InternalXacro.g:634:2: ( ( (otherlv_0= RULE_STRING ) ) | ( (lv_value_1_0= rulePose ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==46) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalXacro.g:635:3: ( (otherlv_0= RULE_STRING ) )
                    {
                    // InternalXacro.g:635:3: ( (otherlv_0= RULE_STRING ) )
                    // InternalXacro.g:636:4: (otherlv_0= RULE_STRING )
                    {
                    // InternalXacro.g:636:4: (otherlv_0= RULE_STRING )
                    // InternalXacro.g:637:5: otherlv_0= RULE_STRING
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
                    // InternalXacro.g:649:3: ( (lv_value_1_0= rulePose ) )
                    {
                    // InternalXacro.g:649:3: ( (lv_value_1_0= rulePose ) )
                    // InternalXacro.g:650:4: (lv_value_1_0= rulePose )
                    {
                    // InternalXacro.g:650:4: (lv_value_1_0= rulePose )
                    // InternalXacro.g:651:5: lv_value_1_0= rulePose
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
                    						"de.fraunhofer.ipa.kinematics.xacro.Xacro.Pose");
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


    // $ANTLR start "entryRuleBody"
    // InternalXacro.g:672:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // InternalXacro.g:672:45: (iv_ruleBody= ruleBody EOF )
            // InternalXacro.g:673:2: iv_ruleBody= ruleBody EOF
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
    // InternalXacro.g:679:1: ruleBody returns [EObject current=null] : ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // InternalXacro.g:685:2: ( ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalXacro.g:686:2: ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalXacro.g:686:2: ( () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalXacro.g:687:3: () otherlv_1= 'Body' otherlv_2= '{' (otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalXacro.g:687:3: ()
            // InternalXacro.g:688:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBodyAccess().getBodyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBodyAccess().getBodyKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:702:3: (otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXacro.g:703:4: otherlv_3= 'link' otherlv_4= '{' ( (lv_link_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getBodyAccess().getLinkKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,17,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalXacro.g:711:4: ( (lv_link_5_0= ruleLink ) )
                    // InternalXacro.g:712:5: (lv_link_5_0= ruleLink )
                    {
                    // InternalXacro.g:712:5: (lv_link_5_0= ruleLink )
                    // InternalXacro.g:713:6: lv_link_5_0= ruleLink
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
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Link");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXacro.g:730:4: (otherlv_6= ',' ( (lv_link_7_0= ruleLink ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==21) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalXacro.g:731:5: otherlv_6= ',' ( (lv_link_7_0= ruleLink ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_22); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getBodyAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalXacro.g:735:5: ( (lv_link_7_0= ruleLink ) )
                    	    // InternalXacro.g:736:6: (lv_link_7_0= ruleLink )
                    	    {
                    	    // InternalXacro.g:736:6: (lv_link_7_0= ruleLink )
                    	    // InternalXacro.g:737:7: lv_link_7_0= ruleLink
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
                    	    								"de.fraunhofer.ipa.kinematics.xacro.Xacro.Link");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,22,FOLLOW_23); 

                    				newLeafNode(otherlv_8, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalXacro.g:760:3: (otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXacro.g:761:4: otherlv_9= 'joint' otherlv_10= '{' ( (lv_joint_11_0= ruleJoint ) ) (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getBodyAccess().getJointKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,17,FOLLOW_24); 

                    				newLeafNode(otherlv_10, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalXacro.g:769:4: ( (lv_joint_11_0= ruleJoint ) )
                    // InternalXacro.g:770:5: (lv_joint_11_0= ruleJoint )
                    {
                    // InternalXacro.g:770:5: (lv_joint_11_0= ruleJoint )
                    // InternalXacro.g:771:6: lv_joint_11_0= ruleJoint
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
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Joint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXacro.g:788:4: (otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==21) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalXacro.g:789:5: otherlv_12= ',' ( (lv_joint_13_0= ruleJoint ) )
                    	    {
                    	    otherlv_12=(Token)match(input,21,FOLLOW_24); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getBodyAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalXacro.g:793:5: ( (lv_joint_13_0= ruleJoint ) )
                    	    // InternalXacro.g:794:6: (lv_joint_13_0= ruleJoint )
                    	    {
                    	    // InternalXacro.g:794:6: (lv_joint_13_0= ruleJoint )
                    	    // InternalXacro.g:795:7: lv_joint_13_0= ruleJoint
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
                    	    								"de.fraunhofer.ipa.kinematics.xacro.Xacro.Joint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
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
    // InternalXacro.g:826:1: entryRuleMacroCall returns [EObject current=null] : iv_ruleMacroCall= ruleMacroCall EOF ;
    public final EObject entryRuleMacroCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacroCall = null;


        try {
            // InternalXacro.g:826:50: (iv_ruleMacroCall= ruleMacroCall EOF )
            // InternalXacro.g:827:2: iv_ruleMacroCall= ruleMacroCall EOF
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
    // InternalXacro.g:833:1: ruleMacroCall returns [EObject current=null] : ( () otherlv_1= 'MacroCall' otherlv_2= '{' otherlv_3= 'macro' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameterCall_7_0= ruleParameterCall ) ) (otherlv_8= ',' ( (lv_parameterCall_9_0= ruleParameterCall ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalXacro.g:839:2: ( ( () otherlv_1= 'MacroCall' otherlv_2= '{' otherlv_3= 'macro' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameterCall_7_0= ruleParameterCall ) ) (otherlv_8= ',' ( (lv_parameterCall_9_0= ruleParameterCall ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalXacro.g:840:2: ( () otherlv_1= 'MacroCall' otherlv_2= '{' otherlv_3= 'macro' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameterCall_7_0= ruleParameterCall ) ) (otherlv_8= ',' ( (lv_parameterCall_9_0= ruleParameterCall ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalXacro.g:840:2: ( () otherlv_1= 'MacroCall' otherlv_2= '{' otherlv_3= 'macro' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameterCall_7_0= ruleParameterCall ) ) (otherlv_8= ',' ( (lv_parameterCall_9_0= ruleParameterCall ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalXacro.g:841:3: () otherlv_1= 'MacroCall' otherlv_2= '{' otherlv_3= 'macro' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameterCall_7_0= ruleParameterCall ) ) (otherlv_8= ',' ( (lv_parameterCall_9_0= ruleParameterCall ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalXacro.g:841:3: ()
            // InternalXacro.g:842:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMacroCallAccess().getMacroCallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMacroCallAccess().getMacroCallKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getMacroCallAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getMacroCallAccess().getMacroKeyword_3());
            		
            // InternalXacro.g:860:3: ( (otherlv_4= RULE_ID ) )
            // InternalXacro.g:861:4: (otherlv_4= RULE_ID )
            {
            // InternalXacro.g:861:4: (otherlv_4= RULE_ID )
            // InternalXacro.g:862:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMacroCallRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_4, grammarAccess.getMacroCallAccess().getMacroMacroCrossReference_4_0());
            				

            }


            }

            // InternalXacro.g:873:3: (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameterCall_7_0= ruleParameterCall ) ) (otherlv_8= ',' ( (lv_parameterCall_9_0= ruleParameterCall ) ) )* otherlv_10= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXacro.g:874:4: otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameterCall_7_0= ruleParameterCall ) ) (otherlv_8= ',' ( (lv_parameterCall_9_0= ruleParameterCall ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getMacroCallAccess().getParameterKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,17,FOLLOW_27); 

                    				newLeafNode(otherlv_6, grammarAccess.getMacroCallAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalXacro.g:882:4: ( (lv_parameterCall_7_0= ruleParameterCall ) )
                    // InternalXacro.g:883:5: (lv_parameterCall_7_0= ruleParameterCall )
                    {
                    // InternalXacro.g:883:5: (lv_parameterCall_7_0= ruleParameterCall )
                    // InternalXacro.g:884:6: lv_parameterCall_7_0= ruleParameterCall
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
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.ParameterCall");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXacro.g:901:4: (otherlv_8= ',' ( (lv_parameterCall_9_0= ruleParameterCall ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==21) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalXacro.g:902:5: otherlv_8= ',' ( (lv_parameterCall_9_0= ruleParameterCall ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FOLLOW_27); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getMacroCallAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalXacro.g:906:5: ( (lv_parameterCall_9_0= ruleParameterCall ) )
                    	    // InternalXacro.g:907:6: (lv_parameterCall_9_0= ruleParameterCall )
                    	    {
                    	    // InternalXacro.g:907:6: (lv_parameterCall_9_0= ruleParameterCall )
                    	    // InternalXacro.g:908:7: lv_parameterCall_9_0= ruleParameterCall
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
                    	    								"de.fraunhofer.ipa.kinematics.xacro.Xacro.ParameterCall");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
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
    // InternalXacro.g:939:1: entryRuleParameterCall returns [EObject current=null] : iv_ruleParameterCall= ruleParameterCall EOF ;
    public final EObject entryRuleParameterCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterCall = null;


        try {
            // InternalXacro.g:939:54: (iv_ruleParameterCall= ruleParameterCall EOF )
            // InternalXacro.g:940:2: iv_ruleParameterCall= ruleParameterCall EOF
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
    // InternalXacro.g:946:1: ruleParameterCall returns [EObject current=null] : ( () otherlv_1= 'ParameterCall' otherlv_2= '{' otherlv_3= 'parameter' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'value' ( (lv_value_6_0= ruleParameterValue ) ) otherlv_7= '}' ) ;
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
            // InternalXacro.g:952:2: ( ( () otherlv_1= 'ParameterCall' otherlv_2= '{' otherlv_3= 'parameter' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'value' ( (lv_value_6_0= ruleParameterValue ) ) otherlv_7= '}' ) )
            // InternalXacro.g:953:2: ( () otherlv_1= 'ParameterCall' otherlv_2= '{' otherlv_3= 'parameter' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'value' ( (lv_value_6_0= ruleParameterValue ) ) otherlv_7= '}' )
            {
            // InternalXacro.g:953:2: ( () otherlv_1= 'ParameterCall' otherlv_2= '{' otherlv_3= 'parameter' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'value' ( (lv_value_6_0= ruleParameterValue ) ) otherlv_7= '}' )
            // InternalXacro.g:954:3: () otherlv_1= 'ParameterCall' otherlv_2= '{' otherlv_3= 'parameter' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'value' ( (lv_value_6_0= ruleParameterValue ) ) otherlv_7= '}'
            {
            // InternalXacro.g:954:3: ()
            // InternalXacro.g:955:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterCallAccess().getParameterCallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterCallAccess().getParameterCallKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterCallAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterCallAccess().getParameterKeyword_3());
            		
            // InternalXacro.g:973:3: ( (otherlv_4= RULE_STRING ) )
            // InternalXacro.g:974:4: (otherlv_4= RULE_STRING )
            {
            // InternalXacro.g:974:4: (otherlv_4= RULE_STRING )
            // InternalXacro.g:975:5: otherlv_4= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterCallRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					newLeafNode(otherlv_4, grammarAccess.getParameterCallAccess().getParameterParameterCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterCallAccess().getValueKeyword_5());
            		
            // InternalXacro.g:990:3: ( (lv_value_6_0= ruleParameterValue ) )
            // InternalXacro.g:991:4: (lv_value_6_0= ruleParameterValue )
            {
            // InternalXacro.g:991:4: (lv_value_6_0= ruleParameterValue )
            // InternalXacro.g:992:5: lv_value_6_0= ruleParameterValue
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
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.ParameterValue");
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
    // InternalXacro.g:1017:1: entryRuleJoint returns [EObject current=null] : iv_ruleJoint= ruleJoint EOF ;
    public final EObject entryRuleJoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoint = null;


        try {
            // InternalXacro.g:1017:46: (iv_ruleJoint= ruleJoint EOF )
            // InternalXacro.g:1018:2: iv_ruleJoint= ruleJoint EOF
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
    // InternalXacro.g:1024:1: ruleJoint returns [EObject current=null] : (otherlv_0= 'Joint' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleParameterString ) ) otherlv_4= 'type' ( (lv_type_5_0= RULE_JOINTTYPE ) ) otherlv_6= 'parent' ( (otherlv_7= RULE_STRING ) ) otherlv_8= 'child' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'origin' ( (lv_origin_11_0= ruleParameterPose ) ) )? (otherlv_12= 'axis' ( (lv_axis_13_0= ruleVector3 ) ) )? (otherlv_14= 'limit' ( (lv_limit_15_0= ruleLimit ) ) )? otherlv_16= '}' ) ;
    public final EObject ruleJoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_name_3_0 = null;

        EObject lv_origin_11_0 = null;

        EObject lv_axis_13_0 = null;

        EObject lv_limit_15_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:1030:2: ( (otherlv_0= 'Joint' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleParameterString ) ) otherlv_4= 'type' ( (lv_type_5_0= RULE_JOINTTYPE ) ) otherlv_6= 'parent' ( (otherlv_7= RULE_STRING ) ) otherlv_8= 'child' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'origin' ( (lv_origin_11_0= ruleParameterPose ) ) )? (otherlv_12= 'axis' ( (lv_axis_13_0= ruleVector3 ) ) )? (otherlv_14= 'limit' ( (lv_limit_15_0= ruleLimit ) ) )? otherlv_16= '}' ) )
            // InternalXacro.g:1031:2: (otherlv_0= 'Joint' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleParameterString ) ) otherlv_4= 'type' ( (lv_type_5_0= RULE_JOINTTYPE ) ) otherlv_6= 'parent' ( (otherlv_7= RULE_STRING ) ) otherlv_8= 'child' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'origin' ( (lv_origin_11_0= ruleParameterPose ) ) )? (otherlv_12= 'axis' ( (lv_axis_13_0= ruleVector3 ) ) )? (otherlv_14= 'limit' ( (lv_limit_15_0= ruleLimit ) ) )? otherlv_16= '}' )
            {
            // InternalXacro.g:1031:2: (otherlv_0= 'Joint' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleParameterString ) ) otherlv_4= 'type' ( (lv_type_5_0= RULE_JOINTTYPE ) ) otherlv_6= 'parent' ( (otherlv_7= RULE_STRING ) ) otherlv_8= 'child' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'origin' ( (lv_origin_11_0= ruleParameterPose ) ) )? (otherlv_12= 'axis' ( (lv_axis_13_0= ruleVector3 ) ) )? (otherlv_14= 'limit' ( (lv_limit_15_0= ruleLimit ) ) )? otherlv_16= '}' )
            // InternalXacro.g:1032:3: otherlv_0= 'Joint' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleParameterString ) ) otherlv_4= 'type' ( (lv_type_5_0= RULE_JOINTTYPE ) ) otherlv_6= 'parent' ( (otherlv_7= RULE_STRING ) ) otherlv_8= 'child' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'origin' ( (lv_origin_11_0= ruleParameterPose ) ) )? (otherlv_12= 'axis' ( (lv_axis_13_0= ruleVector3 ) ) )? (otherlv_14= 'limit' ( (lv_limit_15_0= ruleLimit ) ) )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getJointAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getJointAccess().getNameKeyword_2());
            		
            // InternalXacro.g:1044:3: ( (lv_name_3_0= ruleParameterString ) )
            // InternalXacro.g:1045:4: (lv_name_3_0= ruleParameterString )
            {
            // InternalXacro.g:1045:4: (lv_name_3_0= ruleParameterString )
            // InternalXacro.g:1046:5: lv_name_3_0= ruleParameterString
            {

            					newCompositeNode(grammarAccess.getJointAccess().getNameParameterStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
            lv_name_3_0=ruleParameterString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.ParameterString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getJointAccess().getTypeKeyword_4());
            		
            // InternalXacro.g:1067:3: ( (lv_type_5_0= RULE_JOINTTYPE ) )
            // InternalXacro.g:1068:4: (lv_type_5_0= RULE_JOINTTYPE )
            {
            // InternalXacro.g:1068:4: (lv_type_5_0= RULE_JOINTTYPE )
            // InternalXacro.g:1069:5: lv_type_5_0= RULE_JOINTTYPE
            {
            lv_type_5_0=(Token)match(input,RULE_JOINTTYPE,FOLLOW_33); 

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

            otherlv_6=(Token)match(input,37,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getJointAccess().getParentKeyword_6());
            		
            // InternalXacro.g:1089:3: ( (otherlv_7= RULE_STRING ) )
            // InternalXacro.g:1090:4: (otherlv_7= RULE_STRING )
            {
            // InternalXacro.g:1090:4: (otherlv_7= RULE_STRING )
            // InternalXacro.g:1091:5: otherlv_7= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_STRING,FOLLOW_34); 

            					newLeafNode(otherlv_7, grammarAccess.getJointAccess().getParentLinkCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,38,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getJointAccess().getChildKeyword_8());
            		
            // InternalXacro.g:1106:3: ( (otherlv_9= RULE_STRING ) )
            // InternalXacro.g:1107:4: (otherlv_9= RULE_STRING )
            {
            // InternalXacro.g:1107:4: (otherlv_9= RULE_STRING )
            // InternalXacro.g:1108:5: otherlv_9= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_STRING,FOLLOW_35); 

            					newLeafNode(otherlv_9, grammarAccess.getJointAccess().getChildLinkCrossReference_9_0());
            				

            }


            }

            // InternalXacro.g:1119:3: (otherlv_10= 'origin' ( (lv_origin_11_0= ruleParameterPose ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalXacro.g:1120:4: otherlv_10= 'origin' ( (lv_origin_11_0= ruleParameterPose ) )
                    {
                    otherlv_10=(Token)match(input,39,FOLLOW_19); 

                    				newLeafNode(otherlv_10, grammarAccess.getJointAccess().getOriginKeyword_10_0());
                    			
                    // InternalXacro.g:1124:4: ( (lv_origin_11_0= ruleParameterPose ) )
                    // InternalXacro.g:1125:5: (lv_origin_11_0= ruleParameterPose )
                    {
                    // InternalXacro.g:1125:5: (lv_origin_11_0= ruleParameterPose )
                    // InternalXacro.g:1126:6: lv_origin_11_0= ruleParameterPose
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getOriginParameterPoseParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_origin_11_0=ruleParameterPose();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"origin",
                    							lv_origin_11_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.ParameterPose");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:1144:3: (otherlv_12= 'axis' ( (lv_axis_13_0= ruleVector3 ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalXacro.g:1145:4: otherlv_12= 'axis' ( (lv_axis_13_0= ruleVector3 ) )
                    {
                    otherlv_12=(Token)match(input,40,FOLLOW_37); 

                    				newLeafNode(otherlv_12, grammarAccess.getJointAccess().getAxisKeyword_11_0());
                    			
                    // InternalXacro.g:1149:4: ( (lv_axis_13_0= ruleVector3 ) )
                    // InternalXacro.g:1150:5: (lv_axis_13_0= ruleVector3 )
                    {
                    // InternalXacro.g:1150:5: (lv_axis_13_0= ruleVector3 )
                    // InternalXacro.g:1151:6: lv_axis_13_0= ruleVector3
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getAxisVector3ParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_axis_13_0=ruleVector3();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"axis",
                    							lv_axis_13_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Vector3");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:1169:3: (otherlv_14= 'limit' ( (lv_limit_15_0= ruleLimit ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalXacro.g:1170:4: otherlv_14= 'limit' ( (lv_limit_15_0= ruleLimit ) )
                    {
                    otherlv_14=(Token)match(input,41,FOLLOW_39); 

                    				newLeafNode(otherlv_14, grammarAccess.getJointAccess().getLimitKeyword_12_0());
                    			
                    // InternalXacro.g:1174:4: ( (lv_limit_15_0= ruleLimit ) )
                    // InternalXacro.g:1175:5: (lv_limit_15_0= ruleLimit )
                    {
                    // InternalXacro.g:1175:5: (lv_limit_15_0= ruleLimit )
                    // InternalXacro.g:1176:6: lv_limit_15_0= ruleLimit
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
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Limit");
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
    // InternalXacro.g:1202:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalXacro.g:1202:45: (iv_ruleLink= ruleLink EOF )
            // InternalXacro.g:1203:2: iv_ruleLink= ruleLink EOF
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
    // InternalXacro.g:1209:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleParameterString ) ) (otherlv_4= 'inertial' ( (lv_inertial_5_0= ruleInertial ) ) )? (otherlv_6= 'visual' ( (lv_visual_7_0= ruleVisual ) ) )? (otherlv_8= 'collision' ( (lv_collision_9_0= ruleCollision ) ) )? otherlv_10= '}' ) ;
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
            // InternalXacro.g:1215:2: ( (otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleParameterString ) ) (otherlv_4= 'inertial' ( (lv_inertial_5_0= ruleInertial ) ) )? (otherlv_6= 'visual' ( (lv_visual_7_0= ruleVisual ) ) )? (otherlv_8= 'collision' ( (lv_collision_9_0= ruleCollision ) ) )? otherlv_10= '}' ) )
            // InternalXacro.g:1216:2: (otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleParameterString ) ) (otherlv_4= 'inertial' ( (lv_inertial_5_0= ruleInertial ) ) )? (otherlv_6= 'visual' ( (lv_visual_7_0= ruleVisual ) ) )? (otherlv_8= 'collision' ( (lv_collision_9_0= ruleCollision ) ) )? otherlv_10= '}' )
            {
            // InternalXacro.g:1216:2: (otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleParameterString ) ) (otherlv_4= 'inertial' ( (lv_inertial_5_0= ruleInertial ) ) )? (otherlv_6= 'visual' ( (lv_visual_7_0= ruleVisual ) ) )? (otherlv_8= 'collision' ( (lv_collision_9_0= ruleCollision ) ) )? otherlv_10= '}' )
            // InternalXacro.g:1217:3: otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleParameterString ) ) (otherlv_4= 'inertial' ( (lv_inertial_5_0= ruleInertial ) ) )? (otherlv_6= 'visual' ( (lv_visual_7_0= ruleVisual ) ) )? (otherlv_8= 'collision' ( (lv_collision_9_0= ruleCollision ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getNameKeyword_2());
            		
            // InternalXacro.g:1229:3: ( (lv_name_3_0= ruleParameterString ) )
            // InternalXacro.g:1230:4: (lv_name_3_0= ruleParameterString )
            {
            // InternalXacro.g:1230:4: (lv_name_3_0= ruleParameterString )
            // InternalXacro.g:1231:5: lv_name_3_0= ruleParameterString
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getNameParameterStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_41);
            lv_name_3_0=ruleParameterString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.ParameterString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXacro.g:1248:3: (otherlv_4= 'inertial' ( (lv_inertial_5_0= ruleInertial ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalXacro.g:1249:4: otherlv_4= 'inertial' ( (lv_inertial_5_0= ruleInertial ) )
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_42); 

                    				newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getInertialKeyword_4_0());
                    			
                    // InternalXacro.g:1253:4: ( (lv_inertial_5_0= ruleInertial ) )
                    // InternalXacro.g:1254:5: (lv_inertial_5_0= ruleInertial )
                    {
                    // InternalXacro.g:1254:5: (lv_inertial_5_0= ruleInertial )
                    // InternalXacro.g:1255:6: lv_inertial_5_0= ruleInertial
                    {

                    						newCompositeNode(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_inertial_5_0=ruleInertial();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    						}
                    						set(
                    							current,
                    							"inertial",
                    							lv_inertial_5_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Inertial");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:1273:3: (otherlv_6= 'visual' ( (lv_visual_7_0= ruleVisual ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalXacro.g:1274:4: otherlv_6= 'visual' ( (lv_visual_7_0= ruleVisual ) )
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_44); 

                    				newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getVisualKeyword_5_0());
                    			
                    // InternalXacro.g:1278:4: ( (lv_visual_7_0= ruleVisual ) )
                    // InternalXacro.g:1279:5: (lv_visual_7_0= ruleVisual )
                    {
                    // InternalXacro.g:1279:5: (lv_visual_7_0= ruleVisual )
                    // InternalXacro.g:1280:6: lv_visual_7_0= ruleVisual
                    {

                    						newCompositeNode(grammarAccess.getLinkAccess().getVisualVisualParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_visual_7_0=ruleVisual();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    						}
                    						set(
                    							current,
                    							"visual",
                    							lv_visual_7_0,
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Visual");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXacro.g:1298:3: (otherlv_8= 'collision' ( (lv_collision_9_0= ruleCollision ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXacro.g:1299:4: otherlv_8= 'collision' ( (lv_collision_9_0= ruleCollision ) )
                    {
                    otherlv_8=(Token)match(input,45,FOLLOW_46); 

                    				newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getCollisionKeyword_6_0());
                    			
                    // InternalXacro.g:1303:4: ( (lv_collision_9_0= ruleCollision ) )
                    // InternalXacro.g:1304:5: (lv_collision_9_0= ruleCollision )
                    {
                    // InternalXacro.g:1304:5: (lv_collision_9_0= ruleCollision )
                    // InternalXacro.g:1305:6: lv_collision_9_0= ruleCollision
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
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Collision");
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
    // InternalXacro.g:1331:1: entryRulePose returns [EObject current=null] : iv_rulePose= rulePose EOF ;
    public final EObject entryRulePose() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePose = null;


        try {
            // InternalXacro.g:1331:45: (iv_rulePose= rulePose EOF )
            // InternalXacro.g:1332:2: iv_rulePose= rulePose EOF
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
    // InternalXacro.g:1338:1: rulePose returns [EObject current=null] : ( () otherlv_1= 'Pose' otherlv_2= '{' (otherlv_3= 'rpy' ( (lv_rpy_4_0= RULE_STRING ) ) )? (otherlv_5= 'xyz' ( (lv_xyz_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) ;
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
            // InternalXacro.g:1344:2: ( ( () otherlv_1= 'Pose' otherlv_2= '{' (otherlv_3= 'rpy' ( (lv_rpy_4_0= RULE_STRING ) ) )? (otherlv_5= 'xyz' ( (lv_xyz_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) )
            // InternalXacro.g:1345:2: ( () otherlv_1= 'Pose' otherlv_2= '{' (otherlv_3= 'rpy' ( (lv_rpy_4_0= RULE_STRING ) ) )? (otherlv_5= 'xyz' ( (lv_xyz_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            {
            // InternalXacro.g:1345:2: ( () otherlv_1= 'Pose' otherlv_2= '{' (otherlv_3= 'rpy' ( (lv_rpy_4_0= RULE_STRING ) ) )? (otherlv_5= 'xyz' ( (lv_xyz_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            // InternalXacro.g:1346:3: () otherlv_1= 'Pose' otherlv_2= '{' (otherlv_3= 'rpy' ( (lv_rpy_4_0= RULE_STRING ) ) )? (otherlv_5= 'xyz' ( (lv_xyz_6_0= RULE_STRING ) ) )? otherlv_7= '}'
            {
            // InternalXacro.g:1346:3: ()
            // InternalXacro.g:1347:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPoseAccess().getPoseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPoseAccess().getPoseKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getPoseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:1361:3: (otherlv_3= 'rpy' ( (lv_rpy_4_0= RULE_STRING ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==47) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalXacro.g:1362:4: otherlv_3= 'rpy' ( (lv_rpy_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,47,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getPoseAccess().getRpyKeyword_3_0());
                    			
                    // InternalXacro.g:1366:4: ( (lv_rpy_4_0= RULE_STRING ) )
                    // InternalXacro.g:1367:5: (lv_rpy_4_0= RULE_STRING )
                    {
                    // InternalXacro.g:1367:5: (lv_rpy_4_0= RULE_STRING )
                    // InternalXacro.g:1368:6: lv_rpy_4_0= RULE_STRING
                    {
                    lv_rpy_4_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

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

            // InternalXacro.g:1385:3: (otherlv_5= 'xyz' ( (lv_xyz_6_0= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==48) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalXacro.g:1386:4: otherlv_5= 'xyz' ( (lv_xyz_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,48,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getPoseAccess().getXyzKeyword_4_0());
                    			
                    // InternalXacro.g:1390:4: ( (lv_xyz_6_0= RULE_STRING ) )
                    // InternalXacro.g:1391:5: (lv_xyz_6_0= RULE_STRING )
                    {
                    // InternalXacro.g:1391:5: (lv_xyz_6_0= RULE_STRING )
                    // InternalXacro.g:1392:6: lv_xyz_6_0= RULE_STRING
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
    // InternalXacro.g:1417:1: entryRuleVector3 returns [EObject current=null] : iv_ruleVector3= ruleVector3 EOF ;
    public final EObject entryRuleVector3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector3 = null;


        try {
            // InternalXacro.g:1417:48: (iv_ruleVector3= ruleVector3 EOF )
            // InternalXacro.g:1418:2: iv_ruleVector3= ruleVector3 EOF
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
    // InternalXacro.g:1424:1: ruleVector3 returns [EObject current=null] : ( () otherlv_1= 'Vector3' otherlv_2= '{' (otherlv_3= 'xyz' ( (lv_xyz_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleVector3() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_xyz_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalXacro.g:1430:2: ( ( () otherlv_1= 'Vector3' otherlv_2= '{' (otherlv_3= 'xyz' ( (lv_xyz_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // InternalXacro.g:1431:2: ( () otherlv_1= 'Vector3' otherlv_2= '{' (otherlv_3= 'xyz' ( (lv_xyz_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // InternalXacro.g:1431:2: ( () otherlv_1= 'Vector3' otherlv_2= '{' (otherlv_3= 'xyz' ( (lv_xyz_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // InternalXacro.g:1432:3: () otherlv_1= 'Vector3' otherlv_2= '{' (otherlv_3= 'xyz' ( (lv_xyz_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            // InternalXacro.g:1432:3: ()
            // InternalXacro.g:1433:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVector3Access().getVector3Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVector3Access().getVector3Keyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_48); 

            			newLeafNode(otherlv_2, grammarAccess.getVector3Access().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:1447:3: (otherlv_3= 'xyz' ( (lv_xyz_4_0= RULE_STRING ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==48) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalXacro.g:1448:4: otherlv_3= 'xyz' ( (lv_xyz_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,48,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getVector3Access().getXyzKeyword_3_0());
                    			
                    // InternalXacro.g:1452:4: ( (lv_xyz_4_0= RULE_STRING ) )
                    // InternalXacro.g:1453:5: (lv_xyz_4_0= RULE_STRING )
                    {
                    // InternalXacro.g:1453:5: (lv_xyz_4_0= RULE_STRING )
                    // InternalXacro.g:1454:6: lv_xyz_4_0= RULE_STRING
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
    // InternalXacro.g:1479:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // InternalXacro.g:1479:46: (iv_ruleLimit= ruleLimit EOF )
            // InternalXacro.g:1480:2: iv_ruleLimit= ruleLimit EOF
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
    // InternalXacro.g:1486:1: ruleLimit returns [EObject current=null] : ( () otherlv_1= 'Limit' otherlv_2= '{' (otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) ) )? (otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) ) )? (otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) ) )? (otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) ) )? otherlv_11= '}' ) ;
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
            // InternalXacro.g:1492:2: ( ( () otherlv_1= 'Limit' otherlv_2= '{' (otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) ) )? (otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) ) )? (otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) ) )? (otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) ) )? otherlv_11= '}' ) )
            // InternalXacro.g:1493:2: ( () otherlv_1= 'Limit' otherlv_2= '{' (otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) ) )? (otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) ) )? (otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) ) )? (otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) ) )? otherlv_11= '}' )
            {
            // InternalXacro.g:1493:2: ( () otherlv_1= 'Limit' otherlv_2= '{' (otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) ) )? (otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) ) )? (otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) ) )? (otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) ) )? otherlv_11= '}' )
            // InternalXacro.g:1494:3: () otherlv_1= 'Limit' otherlv_2= '{' (otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) ) )? (otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) ) )? (otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) ) )? (otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) ) )? otherlv_11= '}'
            {
            // InternalXacro.g:1494:3: ()
            // InternalXacro.g:1495:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLimitAccess().getLimitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLimitAccess().getLimitKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_49); 

            			newLeafNode(otherlv_2, grammarAccess.getLimitAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:1509:3: (otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==51) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalXacro.g:1510:4: otherlv_3= 'effort' ( (lv_effort_4_0= ruleDouble0 ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_50); 

                    				newLeafNode(otherlv_3, grammarAccess.getLimitAccess().getEffortKeyword_3_0());
                    			
                    // InternalXacro.g:1514:4: ( (lv_effort_4_0= ruleDouble0 ) )
                    // InternalXacro.g:1515:5: (lv_effort_4_0= ruleDouble0 )
                    {
                    // InternalXacro.g:1515:5: (lv_effort_4_0= ruleDouble0 )
                    // InternalXacro.g:1516:6: lv_effort_4_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getLimitAccess().getEffortDouble0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_51);
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

            // InternalXacro.g:1534:3: (otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==52) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalXacro.g:1535:4: otherlv_5= 'lower' ( (lv_lower_6_0= ruleDouble0 ) )
                    {
                    otherlv_5=(Token)match(input,52,FOLLOW_50); 

                    				newLeafNode(otherlv_5, grammarAccess.getLimitAccess().getLowerKeyword_4_0());
                    			
                    // InternalXacro.g:1539:4: ( (lv_lower_6_0= ruleDouble0 ) )
                    // InternalXacro.g:1540:5: (lv_lower_6_0= ruleDouble0 )
                    {
                    // InternalXacro.g:1540:5: (lv_lower_6_0= ruleDouble0 )
                    // InternalXacro.g:1541:6: lv_lower_6_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getLimitAccess().getLowerDouble0ParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_52);
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

            // InternalXacro.g:1559:3: (otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==53) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalXacro.g:1560:4: otherlv_7= 'upper' ( (lv_upper_8_0= ruleDouble0 ) )
                    {
                    otherlv_7=(Token)match(input,53,FOLLOW_50); 

                    				newLeafNode(otherlv_7, grammarAccess.getLimitAccess().getUpperKeyword_5_0());
                    			
                    // InternalXacro.g:1564:4: ( (lv_upper_8_0= ruleDouble0 ) )
                    // InternalXacro.g:1565:5: (lv_upper_8_0= ruleDouble0 )
                    {
                    // InternalXacro.g:1565:5: (lv_upper_8_0= ruleDouble0 )
                    // InternalXacro.g:1566:6: lv_upper_8_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getLimitAccess().getUpperDouble0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_53);
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

            // InternalXacro.g:1584:3: (otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==54) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalXacro.g:1585:4: otherlv_9= 'velocity' ( (lv_velocity_10_0= ruleDouble0 ) )
                    {
                    otherlv_9=(Token)match(input,54,FOLLOW_50); 

                    				newLeafNode(otherlv_9, grammarAccess.getLimitAccess().getVelocityKeyword_6_0());
                    			
                    // InternalXacro.g:1589:4: ( (lv_velocity_10_0= ruleDouble0 ) )
                    // InternalXacro.g:1590:5: (lv_velocity_10_0= ruleDouble0 )
                    {
                    // InternalXacro.g:1590:5: (lv_velocity_10_0= ruleDouble0 )
                    // InternalXacro.g:1591:6: lv_velocity_10_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getLimitAccess().getVelocityDouble0ParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_15);
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


    // $ANTLR start "entryRuleInertial"
    // InternalXacro.g:1617:1: entryRuleInertial returns [EObject current=null] : iv_ruleInertial= ruleInertial EOF ;
    public final EObject entryRuleInertial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertial = null;


        try {
            // InternalXacro.g:1617:49: (iv_ruleInertial= ruleInertial EOF )
            // InternalXacro.g:1618:2: iv_ruleInertial= ruleInertial EOF
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
    // InternalXacro.g:1624:1: ruleInertial returns [EObject current=null] : ( () otherlv_1= 'Inertial' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )? (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )? otherlv_9= '}' ) ;
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
            // InternalXacro.g:1630:2: ( ( () otherlv_1= 'Inertial' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )? (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )? otherlv_9= '}' ) )
            // InternalXacro.g:1631:2: ( () otherlv_1= 'Inertial' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )? (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )? otherlv_9= '}' )
            {
            // InternalXacro.g:1631:2: ( () otherlv_1= 'Inertial' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )? (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )? otherlv_9= '}' )
            // InternalXacro.g:1632:3: () otherlv_1= 'Inertial' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )? (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )? otherlv_9= '}'
            {
            // InternalXacro.g:1632:3: ()
            // InternalXacro.g:1633:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInertialAccess().getInertialAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInertialAccess().getInertialKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getInertialAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:1647:3: (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==39) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalXacro.g:1648:4: otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getInertialAccess().getOriginKeyword_3_0());
                    			
                    // InternalXacro.g:1652:4: ( (lv_origin_4_0= rulePose ) )
                    // InternalXacro.g:1653:5: (lv_origin_4_0= rulePose )
                    {
                    // InternalXacro.g:1653:5: (lv_origin_4_0= rulePose )
                    // InternalXacro.g:1654:6: lv_origin_4_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getInertialAccess().getOriginPoseParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_55);
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

            // InternalXacro.g:1672:3: (otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==56) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalXacro.g:1673:4: otherlv_5= 'mass' ( (lv_mass_6_0= ruleMass ) )
                    {
                    otherlv_5=(Token)match(input,56,FOLLOW_56); 

                    				newLeafNode(otherlv_5, grammarAccess.getInertialAccess().getMassKeyword_4_0());
                    			
                    // InternalXacro.g:1677:4: ( (lv_mass_6_0= ruleMass ) )
                    // InternalXacro.g:1678:5: (lv_mass_6_0= ruleMass )
                    {
                    // InternalXacro.g:1678:5: (lv_mass_6_0= ruleMass )
                    // InternalXacro.g:1679:6: lv_mass_6_0= ruleMass
                    {

                    						newCompositeNode(grammarAccess.getInertialAccess().getMassMassParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_57);
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

            // InternalXacro.g:1697:3: (otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==57) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalXacro.g:1698:4: otherlv_7= 'inertia' ( (lv_inertia_8_0= ruleInertia ) )
                    {
                    otherlv_7=(Token)match(input,57,FOLLOW_58); 

                    				newLeafNode(otherlv_7, grammarAccess.getInertialAccess().getInertiaKeyword_5_0());
                    			
                    // InternalXacro.g:1702:4: ( (lv_inertia_8_0= ruleInertia ) )
                    // InternalXacro.g:1703:5: (lv_inertia_8_0= ruleInertia )
                    {
                    // InternalXacro.g:1703:5: (lv_inertia_8_0= ruleInertia )
                    // InternalXacro.g:1704:6: lv_inertia_8_0= ruleInertia
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
    // InternalXacro.g:1730:1: entryRuleVisual returns [EObject current=null] : iv_ruleVisual= ruleVisual EOF ;
    public final EObject entryRuleVisual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisual = null;


        try {
            // InternalXacro.g:1730:47: (iv_ruleVisual= ruleVisual EOF )
            // InternalXacro.g:1731:2: iv_ruleVisual= ruleVisual EOF
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
    // InternalXacro.g:1737:1: ruleVisual returns [EObject current=null] : (otherlv_0= 'Visual' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) otherlv_6= '}' ) ;
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
            // InternalXacro.g:1743:2: ( (otherlv_0= 'Visual' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) otherlv_6= '}' ) )
            // InternalXacro.g:1744:2: (otherlv_0= 'Visual' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) otherlv_6= '}' )
            {
            // InternalXacro.g:1744:2: (otherlv_0= 'Visual' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) otherlv_6= '}' )
            // InternalXacro.g:1745:3: otherlv_0= 'Visual' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVisualAccess().getVisualKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getVisualAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXacro.g:1753:3: (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalXacro.g:1754:4: otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) )
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getVisualAccess().getOriginKeyword_2_0());
                    			
                    // InternalXacro.g:1758:4: ( (lv_origin_3_0= rulePose ) )
                    // InternalXacro.g:1759:5: (lv_origin_3_0= rulePose )
                    {
                    // InternalXacro.g:1759:5: (lv_origin_3_0= rulePose )
                    // InternalXacro.g:1760:6: lv_origin_3_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getVisualAccess().getOriginPoseParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_60);
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

            otherlv_4=(Token)match(input,59,FOLLOW_61); 

            			newLeafNode(otherlv_4, grammarAccess.getVisualAccess().getGeometryKeyword_3());
            		
            // InternalXacro.g:1782:3: ( (lv_geometry_5_0= ruleGeometry ) )
            // InternalXacro.g:1783:4: (lv_geometry_5_0= ruleGeometry )
            {
            // InternalXacro.g:1783:4: (lv_geometry_5_0= ruleGeometry )
            // InternalXacro.g:1784:5: lv_geometry_5_0= ruleGeometry
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
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.Geometry");
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
    // InternalXacro.g:1809:1: entryRuleCollision returns [EObject current=null] : iv_ruleCollision= ruleCollision EOF ;
    public final EObject entryRuleCollision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollision = null;


        try {
            // InternalXacro.g:1809:50: (iv_ruleCollision= ruleCollision EOF )
            // InternalXacro.g:1810:2: iv_ruleCollision= ruleCollision EOF
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
    // InternalXacro.g:1816:1: ruleCollision returns [EObject current=null] : (otherlv_0= 'Collision' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) otherlv_6= '}' ) ;
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
            // InternalXacro.g:1822:2: ( (otherlv_0= 'Collision' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) otherlv_6= '}' ) )
            // InternalXacro.g:1823:2: (otherlv_0= 'Collision' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) otherlv_6= '}' )
            {
            // InternalXacro.g:1823:2: (otherlv_0= 'Collision' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) otherlv_6= '}' )
            // InternalXacro.g:1824:3: otherlv_0= 'Collision' otherlv_1= '{' (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )? otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCollisionAccess().getCollisionKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getCollisionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXacro.g:1832:3: (otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==39) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalXacro.g:1833:4: otherlv_2= 'origin' ( (lv_origin_3_0= rulePose ) )
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getCollisionAccess().getOriginKeyword_2_0());
                    			
                    // InternalXacro.g:1837:4: ( (lv_origin_3_0= rulePose ) )
                    // InternalXacro.g:1838:5: (lv_origin_3_0= rulePose )
                    {
                    // InternalXacro.g:1838:5: (lv_origin_3_0= rulePose )
                    // InternalXacro.g:1839:6: lv_origin_3_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getCollisionAccess().getOriginPoseParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_60);
                    lv_origin_3_0=rulePose();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollisionRule());
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

            otherlv_4=(Token)match(input,59,FOLLOW_61); 

            			newLeafNode(otherlv_4, grammarAccess.getCollisionAccess().getGeometryKeyword_3());
            		
            // InternalXacro.g:1861:3: ( (lv_geometry_5_0= ruleGeometry ) )
            // InternalXacro.g:1862:4: (lv_geometry_5_0= ruleGeometry )
            {
            // InternalXacro.g:1862:4: (lv_geometry_5_0= ruleGeometry )
            // InternalXacro.g:1863:5: lv_geometry_5_0= ruleGeometry
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
            						"de.fraunhofer.ipa.kinematics.xacro.Xacro.Geometry");
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
    // InternalXacro.g:1888:1: entryRuleMass returns [EObject current=null] : iv_ruleMass= ruleMass EOF ;
    public final EObject entryRuleMass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMass = null;


        try {
            // InternalXacro.g:1888:45: (iv_ruleMass= ruleMass EOF )
            // InternalXacro.g:1889:2: iv_ruleMass= ruleMass EOF
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
    // InternalXacro.g:1895:1: ruleMass returns [EObject current=null] : ( () otherlv_1= 'Mass' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleMass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:1901:2: ( ( () otherlv_1= 'Mass' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )? otherlv_5= '}' ) )
            // InternalXacro.g:1902:2: ( () otherlv_1= 'Mass' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )? otherlv_5= '}' )
            {
            // InternalXacro.g:1902:2: ( () otherlv_1= 'Mass' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )? otherlv_5= '}' )
            // InternalXacro.g:1903:3: () otherlv_1= 'Mass' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )? otherlv_5= '}'
            {
            // InternalXacro.g:1903:3: ()
            // InternalXacro.g:1904:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMassAccess().getMassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMassAccess().getMassKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getMassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:1918:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==28) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalXacro.g:1919:4: otherlv_3= 'value' ( (lv_value_4_0= ruleDouble0 ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_50); 

                    				newLeafNode(otherlv_3, grammarAccess.getMassAccess().getValueKeyword_3_0());
                    			
                    // InternalXacro.g:1923:4: ( (lv_value_4_0= ruleDouble0 ) )
                    // InternalXacro.g:1924:5: (lv_value_4_0= ruleDouble0 )
                    {
                    // InternalXacro.g:1924:5: (lv_value_4_0= ruleDouble0 )
                    // InternalXacro.g:1925:6: lv_value_4_0= ruleDouble0
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
    // InternalXacro.g:1951:1: entryRuleInertia returns [EObject current=null] : iv_ruleInertia= ruleInertia EOF ;
    public final EObject entryRuleInertia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertia = null;


        try {
            // InternalXacro.g:1951:48: (iv_ruleInertia= ruleInertia EOF )
            // InternalXacro.g:1952:2: iv_ruleInertia= ruleInertia EOF
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
    // InternalXacro.g:1958:1: ruleInertia returns [EObject current=null] : ( () otherlv_1= 'Inertia' otherlv_2= '{' (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )? (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )? (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )? (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )? (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )? (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )? otherlv_15= '}' ) ;
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
            // InternalXacro.g:1964:2: ( ( () otherlv_1= 'Inertia' otherlv_2= '{' (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )? (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )? (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )? (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )? (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )? (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )? otherlv_15= '}' ) )
            // InternalXacro.g:1965:2: ( () otherlv_1= 'Inertia' otherlv_2= '{' (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )? (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )? (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )? (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )? (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )? (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )? otherlv_15= '}' )
            {
            // InternalXacro.g:1965:2: ( () otherlv_1= 'Inertia' otherlv_2= '{' (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )? (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )? (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )? (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )? (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )? (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )? otherlv_15= '}' )
            // InternalXacro.g:1966:3: () otherlv_1= 'Inertia' otherlv_2= '{' (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )? (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )? (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )? (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )? (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )? (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )? otherlv_15= '}'
            {
            // InternalXacro.g:1966:3: ()
            // InternalXacro.g:1967:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInertiaAccess().getInertiaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInertiaAccess().getInertiaKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_62); 

            			newLeafNode(otherlv_2, grammarAccess.getInertiaAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:1981:3: (otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==63) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalXacro.g:1982:4: otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleDouble0 ) )
                    {
                    otherlv_3=(Token)match(input,63,FOLLOW_50); 

                    				newLeafNode(otherlv_3, grammarAccess.getInertiaAccess().getIxxKeyword_3_0());
                    			
                    // InternalXacro.g:1986:4: ( (lv_ixx_4_0= ruleDouble0 ) )
                    // InternalXacro.g:1987:5: (lv_ixx_4_0= ruleDouble0 )
                    {
                    // InternalXacro.g:1987:5: (lv_ixx_4_0= ruleDouble0 )
                    // InternalXacro.g:1988:6: lv_ixx_4_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIxxDouble0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_63);
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

            // InternalXacro.g:2006:3: (otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==64) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalXacro.g:2007:4: otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleDouble0 ) )
                    {
                    otherlv_5=(Token)match(input,64,FOLLOW_50); 

                    				newLeafNode(otherlv_5, grammarAccess.getInertiaAccess().getIxyKeyword_4_0());
                    			
                    // InternalXacro.g:2011:4: ( (lv_ixy_6_0= ruleDouble0 ) )
                    // InternalXacro.g:2012:5: (lv_ixy_6_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2012:5: (lv_ixy_6_0= ruleDouble0 )
                    // InternalXacro.g:2013:6: lv_ixy_6_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIxyDouble0ParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_64);
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

            // InternalXacro.g:2031:3: (otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==65) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalXacro.g:2032:4: otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleDouble0 ) )
                    {
                    otherlv_7=(Token)match(input,65,FOLLOW_50); 

                    				newLeafNode(otherlv_7, grammarAccess.getInertiaAccess().getIxzKeyword_5_0());
                    			
                    // InternalXacro.g:2036:4: ( (lv_ixz_8_0= ruleDouble0 ) )
                    // InternalXacro.g:2037:5: (lv_ixz_8_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2037:5: (lv_ixz_8_0= ruleDouble0 )
                    // InternalXacro.g:2038:6: lv_ixz_8_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIxzDouble0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_65);
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

            // InternalXacro.g:2056:3: (otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==66) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalXacro.g:2057:4: otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleDouble0 ) )
                    {
                    otherlv_9=(Token)match(input,66,FOLLOW_50); 

                    				newLeafNode(otherlv_9, grammarAccess.getInertiaAccess().getIyyKeyword_6_0());
                    			
                    // InternalXacro.g:2061:4: ( (lv_iyy_10_0= ruleDouble0 ) )
                    // InternalXacro.g:2062:5: (lv_iyy_10_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2062:5: (lv_iyy_10_0= ruleDouble0 )
                    // InternalXacro.g:2063:6: lv_iyy_10_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIyyDouble0ParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_66);
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

            // InternalXacro.g:2081:3: (otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==67) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalXacro.g:2082:4: otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleDouble0 ) )
                    {
                    otherlv_11=(Token)match(input,67,FOLLOW_50); 

                    				newLeafNode(otherlv_11, grammarAccess.getInertiaAccess().getIyzKeyword_7_0());
                    			
                    // InternalXacro.g:2086:4: ( (lv_iyz_12_0= ruleDouble0 ) )
                    // InternalXacro.g:2087:5: (lv_iyz_12_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2087:5: (lv_iyz_12_0= ruleDouble0 )
                    // InternalXacro.g:2088:6: lv_iyz_12_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getInertiaAccess().getIyzDouble0ParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_67);
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

            // InternalXacro.g:2106:3: (otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==68) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalXacro.g:2107:4: otherlv_13= 'izz' ( (lv_izz_14_0= ruleDouble0 ) )
                    {
                    otherlv_13=(Token)match(input,68,FOLLOW_50); 

                    				newLeafNode(otherlv_13, grammarAccess.getInertiaAccess().getIzzKeyword_8_0());
                    			
                    // InternalXacro.g:2111:4: ( (lv_izz_14_0= ruleDouble0 ) )
                    // InternalXacro.g:2112:5: (lv_izz_14_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2112:5: (lv_izz_14_0= ruleDouble0 )
                    // InternalXacro.g:2113:6: lv_izz_14_0= ruleDouble0
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
    // InternalXacro.g:2139:1: entryRuleGeometry returns [EObject current=null] : iv_ruleGeometry= ruleGeometry EOF ;
    public final EObject entryRuleGeometry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeometry = null;


        try {
            // InternalXacro.g:2139:49: (iv_ruleGeometry= ruleGeometry EOF )
            // InternalXacro.g:2140:2: iv_ruleGeometry= ruleGeometry EOF
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
    // InternalXacro.g:2146:1: ruleGeometry returns [EObject current=null] : ( () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )? (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )? otherlv_11= '}' ) ;
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
            // InternalXacro.g:2152:2: ( ( () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )? (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )? otherlv_11= '}' ) )
            // InternalXacro.g:2153:2: ( () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )? (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )? otherlv_11= '}' )
            {
            // InternalXacro.g:2153:2: ( () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )? (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )? otherlv_11= '}' )
            // InternalXacro.g:2154:3: () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )? (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )? otherlv_11= '}'
            {
            // InternalXacro.g:2154:3: ()
            // InternalXacro.g:2155:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGeometryAccess().getGeometryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGeometryAccess().getGeometryKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_68); 

            			newLeafNode(otherlv_2, grammarAccess.getGeometryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:2169:3: (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==70) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalXacro.g:2170:4: otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) )
                    {
                    otherlv_3=(Token)match(input,70,FOLLOW_69); 

                    				newLeafNode(otherlv_3, grammarAccess.getGeometryAccess().getBoxKeyword_3_0());
                    			
                    // InternalXacro.g:2174:4: ( (lv_box_4_0= ruleBox ) )
                    // InternalXacro.g:2175:5: (lv_box_4_0= ruleBox )
                    {
                    // InternalXacro.g:2175:5: (lv_box_4_0= ruleBox )
                    // InternalXacro.g:2176:6: lv_box_4_0= ruleBox
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getBoxBoxParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_70);
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

            // InternalXacro.g:2194:3: (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==71) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalXacro.g:2195:4: otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) )
                    {
                    otherlv_5=(Token)match(input,71,FOLLOW_71); 

                    				newLeafNode(otherlv_5, grammarAccess.getGeometryAccess().getCylinderKeyword_4_0());
                    			
                    // InternalXacro.g:2199:4: ( (lv_cylinder_6_0= ruleCylinder ) )
                    // InternalXacro.g:2200:5: (lv_cylinder_6_0= ruleCylinder )
                    {
                    // InternalXacro.g:2200:5: (lv_cylinder_6_0= ruleCylinder )
                    // InternalXacro.g:2201:6: lv_cylinder_6_0= ruleCylinder
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getCylinderCylinderParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_72);
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

            // InternalXacro.g:2219:3: (otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==72) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalXacro.g:2220:4: otherlv_7= 'sphere' ( (lv_sphere_8_0= ruleSphere ) )
                    {
                    otherlv_7=(Token)match(input,72,FOLLOW_73); 

                    				newLeafNode(otherlv_7, grammarAccess.getGeometryAccess().getSphereKeyword_5_0());
                    			
                    // InternalXacro.g:2224:4: ( (lv_sphere_8_0= ruleSphere ) )
                    // InternalXacro.g:2225:5: (lv_sphere_8_0= ruleSphere )
                    {
                    // InternalXacro.g:2225:5: (lv_sphere_8_0= ruleSphere )
                    // InternalXacro.g:2226:6: lv_sphere_8_0= ruleSphere
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getSphereSphereParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_74);
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

            // InternalXacro.g:2244:3: (otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==73) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalXacro.g:2245:4: otherlv_9= 'mesh' ( (lv_mesh_10_0= ruleMesh ) )
                    {
                    otherlv_9=(Token)match(input,73,FOLLOW_75); 

                    				newLeafNode(otherlv_9, grammarAccess.getGeometryAccess().getMeshKeyword_6_0());
                    			
                    // InternalXacro.g:2249:4: ( (lv_mesh_10_0= ruleMesh ) )
                    // InternalXacro.g:2250:5: (lv_mesh_10_0= ruleMesh )
                    {
                    // InternalXacro.g:2250:5: (lv_mesh_10_0= ruleMesh )
                    // InternalXacro.g:2251:6: lv_mesh_10_0= ruleMesh
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


    // $ANTLR start "entryRuleBox"
    // InternalXacro.g:2277:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // InternalXacro.g:2277:44: (iv_ruleBox= ruleBox EOF )
            // InternalXacro.g:2278:2: iv_ruleBox= ruleBox EOF
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
    // InternalXacro.g:2284:1: ruleBox returns [EObject current=null] : ( () otherlv_1= 'Box' otherlv_2= '{' (otherlv_3= 'size' ( (lv_size_4_0= ruleParameterString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_size_4_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:2290:2: ( ( () otherlv_1= 'Box' otherlv_2= '{' (otherlv_3= 'size' ( (lv_size_4_0= ruleParameterString ) ) )? otherlv_5= '}' ) )
            // InternalXacro.g:2291:2: ( () otherlv_1= 'Box' otherlv_2= '{' (otherlv_3= 'size' ( (lv_size_4_0= ruleParameterString ) ) )? otherlv_5= '}' )
            {
            // InternalXacro.g:2291:2: ( () otherlv_1= 'Box' otherlv_2= '{' (otherlv_3= 'size' ( (lv_size_4_0= ruleParameterString ) ) )? otherlv_5= '}' )
            // InternalXacro.g:2292:3: () otherlv_1= 'Box' otherlv_2= '{' (otherlv_3= 'size' ( (lv_size_4_0= ruleParameterString ) ) )? otherlv_5= '}'
            {
            // InternalXacro.g:2292:3: ()
            // InternalXacro.g:2293:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoxAccess().getBoxAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBoxAccess().getBoxKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_76); 

            			newLeafNode(otherlv_2, grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXacro.g:2307:3: (otherlv_3= 'size' ( (lv_size_4_0= ruleParameterString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==75) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalXacro.g:2308:4: otherlv_3= 'size' ( (lv_size_4_0= ruleParameterString ) )
                    {
                    otherlv_3=(Token)match(input,75,FOLLOW_77); 

                    				newLeafNode(otherlv_3, grammarAccess.getBoxAccess().getSizeKeyword_3_0());
                    			
                    // InternalXacro.g:2312:4: ( (lv_size_4_0= ruleParameterString ) )
                    // InternalXacro.g:2313:5: (lv_size_4_0= ruleParameterString )
                    {
                    // InternalXacro.g:2313:5: (lv_size_4_0= ruleParameterString )
                    // InternalXacro.g:2314:6: lv_size_4_0= ruleParameterString
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
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.ParameterString");
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
    // InternalXacro.g:2340:1: entryRuleCylinder returns [EObject current=null] : iv_ruleCylinder= ruleCylinder EOF ;
    public final EObject entryRuleCylinder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCylinder = null;


        try {
            // InternalXacro.g:2340:49: (iv_ruleCylinder= ruleCylinder EOF )
            // InternalXacro.g:2341:2: iv_ruleCylinder= ruleCylinder EOF
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
    // InternalXacro.g:2347:1: ruleCylinder returns [EObject current=null] : (otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}' ) ;
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
            // InternalXacro.g:2353:2: ( (otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}' ) )
            // InternalXacro.g:2354:2: (otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}' )
            {
            // InternalXacro.g:2354:2: (otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}' )
            // InternalXacro.g:2355:3: otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCylinderAccess().getCylinderKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_78); 

            			newLeafNode(otherlv_1, grammarAccess.getCylinderAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,77,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getCylinderAccess().getLengthKeyword_2());
            		
            // InternalXacro.g:2367:3: ( (lv_length_3_0= ruleDouble0 ) )
            // InternalXacro.g:2368:4: (lv_length_3_0= ruleDouble0 )
            {
            // InternalXacro.g:2368:4: (lv_length_3_0= ruleDouble0 )
            // InternalXacro.g:2369:5: lv_length_3_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getCylinderAccess().getLengthDouble0ParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_79);
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

            otherlv_4=(Token)match(input,78,FOLLOW_50); 

            			newLeafNode(otherlv_4, grammarAccess.getCylinderAccess().getRadiusKeyword_4());
            		
            // InternalXacro.g:2390:3: ( (lv_radius_5_0= ruleDouble0 ) )
            // InternalXacro.g:2391:4: (lv_radius_5_0= ruleDouble0 )
            {
            // InternalXacro.g:2391:4: (lv_radius_5_0= ruleDouble0 )
            // InternalXacro.g:2392:5: lv_radius_5_0= ruleDouble0
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
    // InternalXacro.g:2417:1: entryRuleSphere returns [EObject current=null] : iv_ruleSphere= ruleSphere EOF ;
    public final EObject entryRuleSphere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSphere = null;


        try {
            // InternalXacro.g:2417:47: (iv_ruleSphere= ruleSphere EOF )
            // InternalXacro.g:2418:2: iv_ruleSphere= ruleSphere EOF
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
    // InternalXacro.g:2424:1: ruleSphere returns [EObject current=null] : (otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}' ) ;
    public final EObject ruleSphere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_radius_3_0 = null;



        	enterRule();

        try {
            // InternalXacro.g:2430:2: ( (otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}' ) )
            // InternalXacro.g:2431:2: (otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}' )
            {
            // InternalXacro.g:2431:2: (otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}' )
            // InternalXacro.g:2432:3: otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSphereAccess().getSphereKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_79); 

            			newLeafNode(otherlv_1, grammarAccess.getSphereAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,78,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getSphereAccess().getRadiusKeyword_2());
            		
            // InternalXacro.g:2444:3: ( (lv_radius_3_0= ruleDouble0 ) )
            // InternalXacro.g:2445:4: (lv_radius_3_0= ruleDouble0 )
            {
            // InternalXacro.g:2445:4: (lv_radius_3_0= ruleDouble0 )
            // InternalXacro.g:2446:5: lv_radius_3_0= ruleDouble0
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
    // InternalXacro.g:2471:1: entryRuleMesh returns [EObject current=null] : iv_ruleMesh= ruleMesh EOF ;
    public final EObject entryRuleMesh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMesh = null;


        try {
            // InternalXacro.g:2471:45: (iv_ruleMesh= ruleMesh EOF )
            // InternalXacro.g:2472:2: iv_ruleMesh= ruleMesh EOF
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
    // InternalXacro.g:2478:1: ruleMesh returns [EObject current=null] : (otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= ruleAnyURI ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleDouble0 ) ) )? otherlv_6= '}' ) ;
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
            // InternalXacro.g:2484:2: ( (otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= ruleAnyURI ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleDouble0 ) ) )? otherlv_6= '}' ) )
            // InternalXacro.g:2485:2: (otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= ruleAnyURI ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleDouble0 ) ) )? otherlv_6= '}' )
            {
            // InternalXacro.g:2485:2: (otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= ruleAnyURI ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleDouble0 ) ) )? otherlv_6= '}' )
            // InternalXacro.g:2486:3: otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= ruleAnyURI ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleDouble0 ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMeshAccess().getMeshKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_80); 

            			newLeafNode(otherlv_1, grammarAccess.getMeshAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,81,FOLLOW_81); 

            			newLeafNode(otherlv_2, grammarAccess.getMeshAccess().getFilenameKeyword_2());
            		
            // InternalXacro.g:2498:3: ( (lv_filename_3_0= ruleAnyURI ) )
            // InternalXacro.g:2499:4: (lv_filename_3_0= ruleAnyURI )
            {
            // InternalXacro.g:2499:4: (lv_filename_3_0= ruleAnyURI )
            // InternalXacro.g:2500:5: lv_filename_3_0= ruleAnyURI
            {

            					newCompositeNode(grammarAccess.getMeshAccess().getFilenameAnyURIParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_82);
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

            // InternalXacro.g:2517:3: (otherlv_4= 'scale' ( (lv_scale_5_0= ruleDouble0 ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==82) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalXacro.g:2518:4: otherlv_4= 'scale' ( (lv_scale_5_0= ruleDouble0 ) )
                    {
                    otherlv_4=(Token)match(input,82,FOLLOW_50); 

                    				newLeafNode(otherlv_4, grammarAccess.getMeshAccess().getScaleKeyword_4_0());
                    			
                    // InternalXacro.g:2522:4: ( (lv_scale_5_0= ruleDouble0 ) )
                    // InternalXacro.g:2523:5: (lv_scale_5_0= ruleDouble0 )
                    {
                    // InternalXacro.g:2523:5: (lv_scale_5_0= ruleDouble0 )
                    // InternalXacro.g:2524:6: lv_scale_5_0= ruleDouble0
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
                    							"de.fraunhofer.ipa.kinematics.xacro.Xacro.Double0");
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
    // InternalXacro.g:2550:1: entryRuleAnyURI returns [String current=null] : iv_ruleAnyURI= ruleAnyURI EOF ;
    public final String entryRuleAnyURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnyURI = null;


        try {
            // InternalXacro.g:2550:46: (iv_ruleAnyURI= ruleAnyURI EOF )
            // InternalXacro.g:2551:2: iv_ruleAnyURI= ruleAnyURI EOF
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
    // InternalXacro.g:2557:1: ruleAnyURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'AnyURI' ;
    public final AntlrDatatypeRuleToken ruleAnyURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXacro.g:2563:2: (kw= 'AnyURI' )
            // InternalXacro.g:2564:2: kw= 'AnyURI'
            {
            kw=(Token)match(input,83,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEString"
    // InternalXacro.g:2572:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalXacro.g:2572:47: (iv_ruleEString= ruleEString EOF )
            // InternalXacro.g:2573:2: iv_ruleEString= ruleEString EOF
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
    // InternalXacro.g:2579:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalXacro.g:2585:2: (this_STRING_0= RULE_STRING )
            // InternalXacro.g:2586:2: this_STRING_0= RULE_STRING
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
    // InternalXacro.g:2596:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalXacro.g:2596:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalXacro.g:2597:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalXacro.g:2603:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalXacro.g:2609:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalXacro.g:2610:2: this_DOUBLE_0= RULE_DOUBLE
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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000005400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000400000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000180400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001020000030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000038000400000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000030000400000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000400000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000380020400030L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000380000400000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000300000400000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200000400000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001800000400000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0078000000400000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0070000000400000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0060000000400000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0040000000400000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0300008000400000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0300000000400000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0200000000400000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0800008000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x8000000000400000L,0x000000000000001FL});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000400000L,0x000000000000001FL});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000400000L,0x000000000000001EL});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000400000L,0x000000000000001CL});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000018L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000400000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000380L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000300L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000200L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000800L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000020400030L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000400000L,0x0000000000040000L});

}