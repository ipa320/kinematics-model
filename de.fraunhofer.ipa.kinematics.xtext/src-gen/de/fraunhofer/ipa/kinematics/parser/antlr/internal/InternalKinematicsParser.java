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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'robot'", "'{'", "'robots'", "','", "'}'", "'prefix'", "'root_link'", "'joints'", "'ref_robot'", "'Link'", "'Joint'", "'parent'", "'child'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

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
        	return "robot";
       	}

       	@Override
       	protected KinematicsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulerobot"
    // InternalKinematics.g:64:1: entryRulerobot returns [EObject current=null] : iv_rulerobot= rulerobot EOF ;
    public final EObject entryRulerobot() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerobot = null;


        try {
            // InternalKinematics.g:64:46: (iv_rulerobot= rulerobot EOF )
            // InternalKinematics.g:65:2: iv_rulerobot= rulerobot EOF
            {
             newCompositeNode(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerobot=rulerobot();

            state._fsp--;

             current =iv_rulerobot; 
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
    // $ANTLR end "entryRulerobot"


    // $ANTLR start "rulerobot"
    // InternalKinematics.g:71:1: rulerobot returns [EObject current=null] : ( () otherlv_1= 'robot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'robots' otherlv_5= '{' ( (lv_robots_6_0= ruleref_robot ) ) (otherlv_7= ',' ( (lv_robots_8_0= ruleref_robot ) ) )* otherlv_9= '}' )? (otherlv_10= 'prefix' ( (lv_prefix_11_0= ruleEString ) ) )? (otherlv_12= 'root_link' ( (lv_root_link_13_0= ruleLink ) ) )? (otherlv_14= 'joints' otherlv_15= '{' ( (lv_joints_16_0= ruleJoint ) ) (otherlv_17= ',' ( (lv_joints_18_0= ruleJoint ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
    public final EObject rulerobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_robots_6_0 = null;

        EObject lv_robots_8_0 = null;

        AntlrDatatypeRuleToken lv_prefix_11_0 = null;

        EObject lv_root_link_13_0 = null;

        EObject lv_joints_16_0 = null;

        EObject lv_joints_18_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:77:2: ( ( () otherlv_1= 'robot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'robots' otherlv_5= '{' ( (lv_robots_6_0= ruleref_robot ) ) (otherlv_7= ',' ( (lv_robots_8_0= ruleref_robot ) ) )* otherlv_9= '}' )? (otherlv_10= 'prefix' ( (lv_prefix_11_0= ruleEString ) ) )? (otherlv_12= 'root_link' ( (lv_root_link_13_0= ruleLink ) ) )? (otherlv_14= 'joints' otherlv_15= '{' ( (lv_joints_16_0= ruleJoint ) ) (otherlv_17= ',' ( (lv_joints_18_0= ruleJoint ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // InternalKinematics.g:78:2: ( () otherlv_1= 'robot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'robots' otherlv_5= '{' ( (lv_robots_6_0= ruleref_robot ) ) (otherlv_7= ',' ( (lv_robots_8_0= ruleref_robot ) ) )* otherlv_9= '}' )? (otherlv_10= 'prefix' ( (lv_prefix_11_0= ruleEString ) ) )? (otherlv_12= 'root_link' ( (lv_root_link_13_0= ruleLink ) ) )? (otherlv_14= 'joints' otherlv_15= '{' ( (lv_joints_16_0= ruleJoint ) ) (otherlv_17= ',' ( (lv_joints_18_0= ruleJoint ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // InternalKinematics.g:78:2: ( () otherlv_1= 'robot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'robots' otherlv_5= '{' ( (lv_robots_6_0= ruleref_robot ) ) (otherlv_7= ',' ( (lv_robots_8_0= ruleref_robot ) ) )* otherlv_9= '}' )? (otherlv_10= 'prefix' ( (lv_prefix_11_0= ruleEString ) ) )? (otherlv_12= 'root_link' ( (lv_root_link_13_0= ruleLink ) ) )? (otherlv_14= 'joints' otherlv_15= '{' ( (lv_joints_16_0= ruleJoint ) ) (otherlv_17= ',' ( (lv_joints_18_0= ruleJoint ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // InternalKinematics.g:79:3: () otherlv_1= 'robot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'robots' otherlv_5= '{' ( (lv_robots_6_0= ruleref_robot ) ) (otherlv_7= ',' ( (lv_robots_8_0= ruleref_robot ) ) )* otherlv_9= '}' )? (otherlv_10= 'prefix' ( (lv_prefix_11_0= ruleEString ) ) )? (otherlv_12= 'root_link' ( (lv_root_link_13_0= ruleLink ) ) )? (otherlv_14= 'joints' otherlv_15= '{' ( (lv_joints_16_0= ruleJoint ) ) (otherlv_17= ',' ( (lv_joints_18_0= ruleJoint ) ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            // InternalKinematics.g:79:3: ()
            // InternalKinematics.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRobotAccess().getRobotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotAccess().getRobotKeyword_1());
            		
            // InternalKinematics.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalKinematics.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalKinematics.g:91:4: (lv_name_2_0= ruleEString )
            // InternalKinematics.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRobotAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalKinematics.g:113:3: (otherlv_4= 'robots' otherlv_5= '{' ( (lv_robots_6_0= ruleref_robot ) ) (otherlv_7= ',' ( (lv_robots_8_0= ruleref_robot ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKinematics.g:114:4: otherlv_4= 'robots' otherlv_5= '{' ( (lv_robots_6_0= ruleref_robot ) ) (otherlv_7= ',' ( (lv_robots_8_0= ruleref_robot ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getRobotAccess().getRobotsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalKinematics.g:122:4: ( (lv_robots_6_0= ruleref_robot ) )
                    // InternalKinematics.g:123:5: (lv_robots_6_0= ruleref_robot )
                    {
                    // InternalKinematics.g:123:5: (lv_robots_6_0= ruleref_robot )
                    // InternalKinematics.g:124:6: lv_robots_6_0= ruleref_robot
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getRobotsRef_robotParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_robots_6_0=ruleref_robot();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    						}
                    						add(
                    							current,
                    							"robots",
                    							lv_robots_6_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.ref_robot");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKinematics.g:141:4: (otherlv_7= ',' ( (lv_robots_8_0= ruleref_robot ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalKinematics.g:142:5: otherlv_7= ',' ( (lv_robots_8_0= ruleref_robot ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getRobotAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalKinematics.g:146:5: ( (lv_robots_8_0= ruleref_robot ) )
                    	    // InternalKinematics.g:147:6: (lv_robots_8_0= ruleref_robot )
                    	    {
                    	    // InternalKinematics.g:147:6: (lv_robots_8_0= ruleref_robot )
                    	    // InternalKinematics.g:148:7: lv_robots_8_0= ruleref_robot
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobotAccess().getRobotsRef_robotParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_robots_8_0=ruleref_robot();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRobotRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"robots",
                    	    								lv_robots_8_0,
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.ref_robot");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalKinematics.g:171:3: (otherlv_10= 'prefix' ( (lv_prefix_11_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKinematics.g:172:4: otherlv_10= 'prefix' ( (lv_prefix_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getRobotAccess().getPrefixKeyword_5_0());
                    			
                    // InternalKinematics.g:176:4: ( (lv_prefix_11_0= ruleEString ) )
                    // InternalKinematics.g:177:5: (lv_prefix_11_0= ruleEString )
                    {
                    // InternalKinematics.g:177:5: (lv_prefix_11_0= ruleEString )
                    // InternalKinematics.g:178:6: lv_prefix_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getPrefixEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_prefix_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    						}
                    						set(
                    							current,
                    							"prefix",
                    							lv_prefix_11_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:196:3: (otherlv_12= 'root_link' ( (lv_root_link_13_0= ruleLink ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalKinematics.g:197:4: otherlv_12= 'root_link' ( (lv_root_link_13_0= ruleLink ) )
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getRobotAccess().getRoot_linkKeyword_6_0());
                    			
                    // InternalKinematics.g:201:4: ( (lv_root_link_13_0= ruleLink ) )
                    // InternalKinematics.g:202:5: (lv_root_link_13_0= ruleLink )
                    {
                    // InternalKinematics.g:202:5: (lv_root_link_13_0= ruleLink )
                    // InternalKinematics.g:203:6: lv_root_link_13_0= ruleLink
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getRoot_linkLinkParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_root_link_13_0=ruleLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    						}
                    						set(
                    							current,
                    							"root_link",
                    							lv_root_link_13_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Link");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:221:3: (otherlv_14= 'joints' otherlv_15= '{' ( (lv_joints_16_0= ruleJoint ) ) (otherlv_17= ',' ( (lv_joints_18_0= ruleJoint ) ) )* otherlv_19= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKinematics.g:222:4: otherlv_14= 'joints' otherlv_15= '{' ( (lv_joints_16_0= ruleJoint ) ) (otherlv_17= ',' ( (lv_joints_18_0= ruleJoint ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getRobotAccess().getJointsKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_15, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalKinematics.g:230:4: ( (lv_joints_16_0= ruleJoint ) )
                    // InternalKinematics.g:231:5: (lv_joints_16_0= ruleJoint )
                    {
                    // InternalKinematics.g:231:5: (lv_joints_16_0= ruleJoint )
                    // InternalKinematics.g:232:6: lv_joints_16_0= ruleJoint
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getJointsJointParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_joints_16_0=ruleJoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    						}
                    						add(
                    							current,
                    							"joints",
                    							lv_joints_16_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Joint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKinematics.g:249:4: (otherlv_17= ',' ( (lv_joints_18_0= ruleJoint ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalKinematics.g:250:5: otherlv_17= ',' ( (lv_joints_18_0= ruleJoint ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getRobotAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalKinematics.g:254:5: ( (lv_joints_18_0= ruleJoint ) )
                    	    // InternalKinematics.g:255:6: (lv_joints_18_0= ruleJoint )
                    	    {
                    	    // InternalKinematics.g:255:6: (lv_joints_18_0= ruleJoint )
                    	    // InternalKinematics.g:256:7: lv_joints_18_0= ruleJoint
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobotAccess().getJointsJointParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_joints_18_0=ruleJoint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRobotRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"joints",
                    	    								lv_joints_18_0,
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.Joint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_19, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "rulerobot"


    // $ANTLR start "entryRuleref_robot"
    // InternalKinematics.g:287:1: entryRuleref_robot returns [EObject current=null] : iv_ruleref_robot= ruleref_robot EOF ;
    public final EObject entryRuleref_robot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleref_robot = null;


        try {
            // InternalKinematics.g:287:50: (iv_ruleref_robot= ruleref_robot EOF )
            // InternalKinematics.g:288:2: iv_ruleref_robot= ruleref_robot EOF
            {
             newCompositeNode(grammarAccess.getRef_robotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleref_robot=ruleref_robot();

            state._fsp--;

             current =iv_ruleref_robot; 
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
    // $ANTLR end "entryRuleref_robot"


    // $ANTLR start "ruleref_robot"
    // InternalKinematics.g:294:1: ruleref_robot returns [EObject current=null] : ( () otherlv_1= 'ref_robot' ( ( ruleEString ) ) otherlv_3= 'prefix' ( (lv_prefix_4_0= ruleEString ) ) ) ;
    public final EObject ruleref_robot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_prefix_4_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:300:2: ( ( () otherlv_1= 'ref_robot' ( ( ruleEString ) ) otherlv_3= 'prefix' ( (lv_prefix_4_0= ruleEString ) ) ) )
            // InternalKinematics.g:301:2: ( () otherlv_1= 'ref_robot' ( ( ruleEString ) ) otherlv_3= 'prefix' ( (lv_prefix_4_0= ruleEString ) ) )
            {
            // InternalKinematics.g:301:2: ( () otherlv_1= 'ref_robot' ( ( ruleEString ) ) otherlv_3= 'prefix' ( (lv_prefix_4_0= ruleEString ) ) )
            // InternalKinematics.g:302:3: () otherlv_1= 'ref_robot' ( ( ruleEString ) ) otherlv_3= 'prefix' ( (lv_prefix_4_0= ruleEString ) )
            {
            // InternalKinematics.g:302:3: ()
            // InternalKinematics.g:303:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRef_robotAccess().getRef_robotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRef_robotAccess().getRef_robotKeyword_1());
            		
            // InternalKinematics.g:313:3: ( ( ruleEString ) )
            // InternalKinematics.g:314:4: ( ruleEString )
            {
            // InternalKinematics.g:314:4: ( ruleEString )
            // InternalKinematics.g:315:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRef_robotRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRef_robotAccess().getRobotRobotCrossReference_2_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRef_robotAccess().getPrefixKeyword_3());
            		
            // InternalKinematics.g:333:3: ( (lv_prefix_4_0= ruleEString ) )
            // InternalKinematics.g:334:4: (lv_prefix_4_0= ruleEString )
            {
            // InternalKinematics.g:334:4: (lv_prefix_4_0= ruleEString )
            // InternalKinematics.g:335:5: lv_prefix_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRef_robotAccess().getPrefixEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_prefix_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRef_robotRule());
            					}
            					set(
            						current,
            						"prefix",
            						lv_prefix_4_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
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
    // $ANTLR end "ruleref_robot"


    // $ANTLR start "entryRuleLink"
    // InternalKinematics.g:356:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalKinematics.g:356:45: (iv_ruleLink= ruleLink EOF )
            // InternalKinematics.g:357:2: iv_ruleLink= ruleLink EOF
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
    // InternalKinematics.g:363:1: ruleLink returns [EObject current=null] : ( () otherlv_1= 'Link' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:369:2: ( ( () otherlv_1= 'Link' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalKinematics.g:370:2: ( () otherlv_1= 'Link' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalKinematics.g:370:2: ( () otherlv_1= 'Link' ( (lv_name_2_0= ruleEString ) ) )
            // InternalKinematics.g:371:3: () otherlv_1= 'Link' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalKinematics.g:371:3: ()
            // InternalKinematics.g:372:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinkAccess().getLinkAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getLinkKeyword_1());
            		
            // InternalKinematics.g:382:3: ( (lv_name_2_0= ruleEString ) )
            // InternalKinematics.g:383:4: (lv_name_2_0= ruleEString )
            {
            // InternalKinematics.g:383:4: (lv_name_2_0= ruleEString )
            // InternalKinematics.g:384:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleJoint"
    // InternalKinematics.g:405:1: entryRuleJoint returns [EObject current=null] : iv_ruleJoint= ruleJoint EOF ;
    public final EObject entryRuleJoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoint = null;


        try {
            // InternalKinematics.g:405:46: (iv_ruleJoint= ruleJoint EOF )
            // InternalKinematics.g:406:2: iv_ruleJoint= ruleJoint EOF
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
    // InternalKinematics.g:412:1: ruleJoint returns [EObject current=null] : (otherlv_0= 'Joint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parent' ( ( ruleEString ) ) otherlv_5= 'child' ( (lv_child_6_0= ruleLink ) ) otherlv_7= '}' ) ;
    public final EObject ruleJoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_child_6_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:418:2: ( (otherlv_0= 'Joint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parent' ( ( ruleEString ) ) otherlv_5= 'child' ( (lv_child_6_0= ruleLink ) ) otherlv_7= '}' ) )
            // InternalKinematics.g:419:2: (otherlv_0= 'Joint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parent' ( ( ruleEString ) ) otherlv_5= 'child' ( (lv_child_6_0= ruleLink ) ) otherlv_7= '}' )
            {
            // InternalKinematics.g:419:2: (otherlv_0= 'Joint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parent' ( ( ruleEString ) ) otherlv_5= 'child' ( (lv_child_6_0= ruleLink ) ) otherlv_7= '}' )
            // InternalKinematics.g:420:3: otherlv_0= 'Joint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parent' ( ( ruleEString ) ) otherlv_5= 'child' ( (lv_child_6_0= ruleLink ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
            		
            // InternalKinematics.g:424:3: ( (lv_name_1_0= ruleEString ) )
            // InternalKinematics.g:425:4: (lv_name_1_0= ruleEString )
            {
            // InternalKinematics.g:425:4: (lv_name_1_0= ruleEString )
            // InternalKinematics.g:426:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJointAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getJointAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getJointAccess().getParentKeyword_3());
            		
            // InternalKinematics.g:451:3: ( ( ruleEString ) )
            // InternalKinematics.g:452:4: ( ruleEString )
            {
            // InternalKinematics.g:452:4: ( ruleEString )
            // InternalKinematics.g:453:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				

            					newCompositeNode(grammarAccess.getJointAccess().getParentLinkCrossReference_4_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getJointAccess().getChildKeyword_5());
            		
            // InternalKinematics.g:471:3: ( (lv_child_6_0= ruleLink ) )
            // InternalKinematics.g:472:4: (lv_child_6_0= ruleLink )
            {
            // InternalKinematics.g:472:4: (lv_child_6_0= ruleLink )
            // InternalKinematics.g:473:5: lv_child_6_0= ruleLink
            {

            					newCompositeNode(grammarAccess.getJointAccess().getChildLinkParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_13);
            lv_child_6_0=ruleLink();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_6_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Link");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getJointAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleEString"
    // InternalKinematics.g:498:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalKinematics.g:498:47: (iv_ruleEString= ruleEString EOF )
            // InternalKinematics.g:499:2: iv_ruleEString= ruleEString EOF
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
    // InternalKinematics.g:505:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalKinematics.g:511:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalKinematics.g:512:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalKinematics.g:512:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalKinematics.g:513:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKinematics.g:521:3: this_ID_1= RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000007A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});

}