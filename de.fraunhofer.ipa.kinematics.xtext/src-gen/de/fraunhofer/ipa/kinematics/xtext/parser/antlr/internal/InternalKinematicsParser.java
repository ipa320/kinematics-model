package de.fraunhofer.ipa.kinematics.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.ipa.kinematics.xtext.services.KinematicsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKinematicsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'robot'", "'{'", "'root_link'", "'joints'", "'}'", "'joint'", "'parent'", "'child'", "'link'"
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
    public static final int RULE_ML_COMMENT=7;

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
        	return "Kinematics";
       	}

       	@Override
       	protected KinematicsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleKinematics"
    // InternalKinematics.g:64:1: entryRuleKinematics returns [EObject current=null] : iv_ruleKinematics= ruleKinematics EOF ;
    public final EObject entryRuleKinematics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKinematics = null;


        try {
            // InternalKinematics.g:64:51: (iv_ruleKinematics= ruleKinematics EOF )
            // InternalKinematics.g:65:2: iv_ruleKinematics= ruleKinematics EOF
            {
             newCompositeNode(grammarAccess.getKinematicsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKinematics=ruleKinematics();

            state._fsp--;

             current =iv_ruleKinematics; 
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
    // $ANTLR end "entryRuleKinematics"


    // $ANTLR start "ruleKinematics"
    // InternalKinematics.g:71:1: ruleKinematics returns [EObject current=null] : (otherlv_0= 'robot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'root_link' ( (lv_root_link_4_0= rulelink ) ) (otherlv_5= 'joints' otherlv_6= '{' ( (lv_joints_7_0= rulejoint ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleKinematics() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_root_link_4_0 = null;

        EObject lv_joints_7_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:77:2: ( (otherlv_0= 'robot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'root_link' ( (lv_root_link_4_0= rulelink ) ) (otherlv_5= 'joints' otherlv_6= '{' ( (lv_joints_7_0= rulejoint ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalKinematics.g:78:2: (otherlv_0= 'robot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'root_link' ( (lv_root_link_4_0= rulelink ) ) (otherlv_5= 'joints' otherlv_6= '{' ( (lv_joints_7_0= rulejoint ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalKinematics.g:78:2: (otherlv_0= 'robot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'root_link' ( (lv_root_link_4_0= rulelink ) ) (otherlv_5= 'joints' otherlv_6= '{' ( (lv_joints_7_0= rulejoint ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalKinematics.g:79:3: otherlv_0= 'robot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'root_link' ( (lv_root_link_4_0= rulelink ) ) (otherlv_5= 'joints' otherlv_6= '{' ( (lv_joints_7_0= rulejoint ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getKinematicsAccess().getRobotKeyword_0());
            		
            // InternalKinematics.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalKinematics.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalKinematics.g:84:4: (lv_name_1_0= ruleEString )
            // InternalKinematics.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKinematicsAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKinematicsRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.kinematics.xtext.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getKinematicsAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getKinematicsAccess().getRoot_linkKeyword_3());
            		
            // InternalKinematics.g:110:3: ( (lv_root_link_4_0= rulelink ) )
            // InternalKinematics.g:111:4: (lv_root_link_4_0= rulelink )
            {
            // InternalKinematics.g:111:4: (lv_root_link_4_0= rulelink )
            // InternalKinematics.g:112:5: lv_root_link_4_0= rulelink
            {

            					newCompositeNode(grammarAccess.getKinematicsAccess().getRoot_linkLinkParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_root_link_4_0=rulelink();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKinematicsRule());
            					}
            					set(
            						current,
            						"root_link",
            						lv_root_link_4_0,
            						"de.fraunhofer.ipa.kinematics.xtext.Kinematics.link");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKinematics.g:129:3: (otherlv_5= 'joints' otherlv_6= '{' ( (lv_joints_7_0= rulejoint ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKinematics.g:130:4: otherlv_5= 'joints' otherlv_6= '{' ( (lv_joints_7_0= rulejoint ) )* otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getKinematicsAccess().getJointsKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getKinematicsAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalKinematics.g:138:4: ( (lv_joints_7_0= rulejoint ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==16) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalKinematics.g:139:5: (lv_joints_7_0= rulejoint )
                    	    {
                    	    // InternalKinematics.g:139:5: (lv_joints_7_0= rulejoint )
                    	    // InternalKinematics.g:140:6: lv_joints_7_0= rulejoint
                    	    {

                    	    						newCompositeNode(grammarAccess.getKinematicsAccess().getJointsJointParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_joints_7_0=rulejoint();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getKinematicsRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"joints",
                    	    							lv_joints_7_0,
                    	    							"de.fraunhofer.ipa.kinematics.xtext.Kinematics.joint");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getKinematicsAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getKinematicsAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleKinematics"


    // $ANTLR start "entryRulejoint"
    // InternalKinematics.g:170:1: entryRulejoint returns [EObject current=null] : iv_rulejoint= rulejoint EOF ;
    public final EObject entryRulejoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulejoint = null;


        try {
            // InternalKinematics.g:170:46: (iv_rulejoint= rulejoint EOF )
            // InternalKinematics.g:171:2: iv_rulejoint= rulejoint EOF
            {
             newCompositeNode(grammarAccess.getJointRule()); 
            pushFollow(FOLLOW_1);
            iv_rulejoint=rulejoint();

            state._fsp--;

             current =iv_rulejoint; 
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
    // $ANTLR end "entryRulejoint"


    // $ANTLR start "rulejoint"
    // InternalKinematics.g:177:1: rulejoint returns [EObject current=null] : (otherlv_0= 'joint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parent' ( ( ruleEString ) ) otherlv_5= 'child' ( (lv_child_6_0= rulelink ) ) otherlv_7= '}' ) ;
    public final EObject rulejoint() throws RecognitionException {
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
            // InternalKinematics.g:183:2: ( (otherlv_0= 'joint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parent' ( ( ruleEString ) ) otherlv_5= 'child' ( (lv_child_6_0= rulelink ) ) otherlv_7= '}' ) )
            // InternalKinematics.g:184:2: (otherlv_0= 'joint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parent' ( ( ruleEString ) ) otherlv_5= 'child' ( (lv_child_6_0= rulelink ) ) otherlv_7= '}' )
            {
            // InternalKinematics.g:184:2: (otherlv_0= 'joint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parent' ( ( ruleEString ) ) otherlv_5= 'child' ( (lv_child_6_0= rulelink ) ) otherlv_7= '}' )
            // InternalKinematics.g:185:3: otherlv_0= 'joint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parent' ( ( ruleEString ) ) otherlv_5= 'child' ( (lv_child_6_0= rulelink ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
            		
            // InternalKinematics.g:189:3: ( (lv_name_1_0= ruleEString ) )
            // InternalKinematics.g:190:4: (lv_name_1_0= ruleEString )
            {
            // InternalKinematics.g:190:4: (lv_name_1_0= ruleEString )
            // InternalKinematics.g:191:5: lv_name_1_0= ruleEString
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
            						"de.fraunhofer.ipa.kinematics.xtext.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getJointAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getJointAccess().getParentKeyword_3());
            		
            // InternalKinematics.g:216:3: ( ( ruleEString ) )
            // InternalKinematics.g:217:4: ( ruleEString )
            {
            // InternalKinematics.g:217:4: ( ruleEString )
            // InternalKinematics.g:218:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				

            					newCompositeNode(grammarAccess.getJointAccess().getParentLinkCrossReference_4_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getJointAccess().getChildKeyword_5());
            		
            // InternalKinematics.g:236:3: ( (lv_child_6_0= rulelink ) )
            // InternalKinematics.g:237:4: (lv_child_6_0= rulelink )
            {
            // InternalKinematics.g:237:4: (lv_child_6_0= rulelink )
            // InternalKinematics.g:238:5: lv_child_6_0= rulelink
            {

            					newCompositeNode(grammarAccess.getJointAccess().getChildLinkParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_child_6_0=rulelink();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_6_0,
            						"de.fraunhofer.ipa.kinematics.xtext.Kinematics.link");
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
    // $ANTLR end "rulejoint"


    // $ANTLR start "entryRulelink"
    // InternalKinematics.g:263:1: entryRulelink returns [EObject current=null] : iv_rulelink= rulelink EOF ;
    public final EObject entryRulelink() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelink = null;


        try {
            // InternalKinematics.g:263:45: (iv_rulelink= rulelink EOF )
            // InternalKinematics.g:264:2: iv_rulelink= rulelink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelink=rulelink();

            state._fsp--;

             current =iv_rulelink; 
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
    // $ANTLR end "entryRulelink"


    // $ANTLR start "rulelink"
    // InternalKinematics.g:270:1: rulelink returns [EObject current=null] : ( () otherlv_1= 'link' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject rulelink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:276:2: ( ( () otherlv_1= 'link' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalKinematics.g:277:2: ( () otherlv_1= 'link' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalKinematics.g:277:2: ( () otherlv_1= 'link' ( (lv_name_2_0= ruleEString ) ) )
            // InternalKinematics.g:278:3: () otherlv_1= 'link' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalKinematics.g:278:3: ()
            // InternalKinematics.g:279:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinkAccess().getLinkAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getLinkKeyword_1());
            		
            // InternalKinematics.g:289:3: ( (lv_name_2_0= ruleEString ) )
            // InternalKinematics.g:290:4: (lv_name_2_0= ruleEString )
            {
            // InternalKinematics.g:290:4: (lv_name_2_0= ruleEString )
            // InternalKinematics.g:291:5: lv_name_2_0= ruleEString
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
            						"de.fraunhofer.ipa.kinematics.xtext.Kinematics.EString");
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
    // $ANTLR end "rulelink"


    // $ANTLR start "entryRuleEString"
    // InternalKinematics.g:312:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalKinematics.g:312:47: (iv_ruleEString= ruleEString EOF )
            // InternalKinematics.g:313:2: iv_ruleEString= ruleEString EOF
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
    // InternalKinematics.g:319:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalKinematics.g:325:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalKinematics.g:326:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalKinematics.g:326:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalKinematics.g:327:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKinematics.g:335:3: this_ID_1= RULE_ID
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});

}