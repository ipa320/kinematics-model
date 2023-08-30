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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FlangeAttachment", "BaseAttachment", "Ros2_control", "Connection", "Collision", "Component", "BaseLink", "Category", "Cylinder", "Filename", "Geometry", "Inertial", "Velocity", "EndLink", "GitRepo", "Inertia", "Package", "Version", "Branch", "Distro", "Effort", "Length", "Origin", "Parent", "Prefix", "Radius", "Sphere", "Visual", "AnyURI", "Child", "Group", "Joint", "Limit", "Lower", "Scale", "Upper", "Value", "Axis", "Link", "Mass", "Mesh", "Name", "Repo", "Size", "Type", "Box", "Ixx", "Ixy", "Ixz", "Iyy", "Iyz", "Izz", "Rpy", "Xyz", "Comma", "HyphenMinus", "LeftSquareBracket", "RightSquareBracket", "RULE_DIGIT", "RULE_BOOLEAN", "RULE_INT", "RULE_DOUBLE", "RULE_DECINT", "RULE_JOINTTYPE", "RULE_CATEGORY", "RULE_BEGIN", "RULE_END", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Origin=26;
    public static final int Lower=37;
    public static final int RULE_BEGIN=69;
    public static final int Distro=23;
    public static final int Size=47;
    public static final int Effort=24;
    public static final int Ixx=50;
    public static final int RULE_BOOLEAN=63;
    public static final int Ixz=52;
    public static final int Ixy=51;
    public static final int Name=45;
    public static final int Sphere=30;
    public static final int Version=21;
    public static final int Child=33;
    public static final int RightSquareBracket=61;
    public static final int RULE_ID=72;
    public static final int Iyy=53;
    public static final int Filename=13;
    public static final int Mesh=44;
    public static final int RULE_DIGIT=62;
    public static final int Box=49;
    public static final int Iyz=54;
    public static final int Joint=35;
    public static final int Mass=43;
    public static final int BaseLink=10;
    public static final int AnyURI=32;
    public static final int Repo=46;
    public static final int RULE_INT=64;
    public static final int Value=40;
    public static final int RULE_ML_COMMENT=74;
    public static final int Inertia=19;
    public static final int LeftSquareBracket=60;
    public static final int Package=20;
    public static final int EndLink=17;
    public static final int Link=42;
    public static final int Radius=29;
    public static final int Group=34;
    public static final int RULE_END=70;
    public static final int Category=11;
    public static final int Parent=27;
    public static final int Izz=55;
    public static final int RULE_STRING=73;
    public static final int Prefix=28;
    public static final int RULE_SL_COMMENT=71;
    public static final int BaseAttachment=5;
    public static final int Comma=58;
    public static final int HyphenMinus=59;
    public static final int RULE_CATEGORY=68;
    public static final int GitRepo=18;
    public static final int RULE_DOUBLE=65;
    public static final int Branch=22;
    public static final int Rpy=56;
    public static final int RULE_JOINTTYPE=67;
    public static final int RULE_DECINT=66;
    public static final int Component=9;
    public static final int EOF=-1;
    public static final int Visual=31;
    public static final int Axis=41;
    public static final int Upper=39;
    public static final int RULE_WS=75;
    public static final int Collision=8;
    public static final int Connection=7;
    public static final int Ros2_control=6;
    public static final int Scale=38;
    public static final int Inertial=15;
    public static final int RULE_ANY_OTHER=76;
    public static final int Velocity=16;
    public static final int Geometry=14;
    public static final int Cylinder=12;
    public static final int FlangeAttachment=4;
    public static final int Type=48;
    public static final int Length=25;
    public static final int Xyz=57;
    public static final int Limit=36;

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
        	return "Component";
       	}

       	@Override
       	protected KinematicsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleComponent"
    // InternalKinematicsParser.g:57:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalKinematicsParser.g:57:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalKinematicsParser.g:58:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalKinematicsParser.g:64:1: ruleComponent returns [EObject current=null] : ( () otherlv_1= Component this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) otherlv_5= Version ( (lv_version_6_0= ruleEString ) ) (otherlv_7= Category ( (lv_category_8_0= RULE_CATEGORY ) ) )? (otherlv_9= GitRepo ( (lv_gitRepo_10_0= ruleGitRepo ) ) )? ( (otherlv_11= BaseAttachment ( (lv_baseAttachment_12_0= ruleBaseAttachment ) )* ) | ( (lv_baseAttachment_13_0= ruleBaseAttachment ) ) )? ( (otherlv_14= FlangeAttachment ( (lv_flangeAttachment_15_0= ruleFlangeAttachment ) )* ) | ( (lv_flangeAttachment_16_0= ruleFlangeAttachment ) ) )? ( (otherlv_17= Component ( (lv_component_18_0= ruleConfiguredComponent ) )* ) | ( (lv_component_19_0= ruleConfiguredComponent ) ) )? ( (otherlv_20= Connection ( (lv_connection_21_0= ruleConnection ) )* ) | ( (lv_connection_22_0= ruleConnection ) ) )? ( (otherlv_23= Group ( (lv_group_24_0= ruleGroup ) )* ) | ( (lv_group_25_0= ruleGroup ) ) )? ( (otherlv_26= Link ( (lv_link_27_0= ruleLink ) )* ) | ( (lv_link_28_0= ruleLink ) ) )? ( (otherlv_29= Joint ( (lv_joint_30_0= ruleJoint ) )* ) | ( (lv_joint_31_0= ruleJoint ) ) )? this_END_32= RULE_END ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_category_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        Token otherlv_26=null;
        Token otherlv_29=null;
        Token this_END_32=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_version_6_0 = null;

        EObject lv_gitRepo_10_0 = null;

        EObject lv_baseAttachment_12_0 = null;

        EObject lv_baseAttachment_13_0 = null;

        EObject lv_flangeAttachment_15_0 = null;

        EObject lv_flangeAttachment_16_0 = null;

        EObject lv_component_18_0 = null;

        EObject lv_component_19_0 = null;

        EObject lv_connection_21_0 = null;

        EObject lv_connection_22_0 = null;

        EObject lv_group_24_0 = null;

        EObject lv_group_25_0 = null;

        EObject lv_link_27_0 = null;

        EObject lv_link_28_0 = null;

        EObject lv_joint_30_0 = null;

        EObject lv_joint_31_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:70:2: ( ( () otherlv_1= Component this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) otherlv_5= Version ( (lv_version_6_0= ruleEString ) ) (otherlv_7= Category ( (lv_category_8_0= RULE_CATEGORY ) ) )? (otherlv_9= GitRepo ( (lv_gitRepo_10_0= ruleGitRepo ) ) )? ( (otherlv_11= BaseAttachment ( (lv_baseAttachment_12_0= ruleBaseAttachment ) )* ) | ( (lv_baseAttachment_13_0= ruleBaseAttachment ) ) )? ( (otherlv_14= FlangeAttachment ( (lv_flangeAttachment_15_0= ruleFlangeAttachment ) )* ) | ( (lv_flangeAttachment_16_0= ruleFlangeAttachment ) ) )? ( (otherlv_17= Component ( (lv_component_18_0= ruleConfiguredComponent ) )* ) | ( (lv_component_19_0= ruleConfiguredComponent ) ) )? ( (otherlv_20= Connection ( (lv_connection_21_0= ruleConnection ) )* ) | ( (lv_connection_22_0= ruleConnection ) ) )? ( (otherlv_23= Group ( (lv_group_24_0= ruleGroup ) )* ) | ( (lv_group_25_0= ruleGroup ) ) )? ( (otherlv_26= Link ( (lv_link_27_0= ruleLink ) )* ) | ( (lv_link_28_0= ruleLink ) ) )? ( (otherlv_29= Joint ( (lv_joint_30_0= ruleJoint ) )* ) | ( (lv_joint_31_0= ruleJoint ) ) )? this_END_32= RULE_END ) )
            // InternalKinematicsParser.g:71:2: ( () otherlv_1= Component this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) otherlv_5= Version ( (lv_version_6_0= ruleEString ) ) (otherlv_7= Category ( (lv_category_8_0= RULE_CATEGORY ) ) )? (otherlv_9= GitRepo ( (lv_gitRepo_10_0= ruleGitRepo ) ) )? ( (otherlv_11= BaseAttachment ( (lv_baseAttachment_12_0= ruleBaseAttachment ) )* ) | ( (lv_baseAttachment_13_0= ruleBaseAttachment ) ) )? ( (otherlv_14= FlangeAttachment ( (lv_flangeAttachment_15_0= ruleFlangeAttachment ) )* ) | ( (lv_flangeAttachment_16_0= ruleFlangeAttachment ) ) )? ( (otherlv_17= Component ( (lv_component_18_0= ruleConfiguredComponent ) )* ) | ( (lv_component_19_0= ruleConfiguredComponent ) ) )? ( (otherlv_20= Connection ( (lv_connection_21_0= ruleConnection ) )* ) | ( (lv_connection_22_0= ruleConnection ) ) )? ( (otherlv_23= Group ( (lv_group_24_0= ruleGroup ) )* ) | ( (lv_group_25_0= ruleGroup ) ) )? ( (otherlv_26= Link ( (lv_link_27_0= ruleLink ) )* ) | ( (lv_link_28_0= ruleLink ) ) )? ( (otherlv_29= Joint ( (lv_joint_30_0= ruleJoint ) )* ) | ( (lv_joint_31_0= ruleJoint ) ) )? this_END_32= RULE_END )
            {
            // InternalKinematicsParser.g:71:2: ( () otherlv_1= Component this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) otherlv_5= Version ( (lv_version_6_0= ruleEString ) ) (otherlv_7= Category ( (lv_category_8_0= RULE_CATEGORY ) ) )? (otherlv_9= GitRepo ( (lv_gitRepo_10_0= ruleGitRepo ) ) )? ( (otherlv_11= BaseAttachment ( (lv_baseAttachment_12_0= ruleBaseAttachment ) )* ) | ( (lv_baseAttachment_13_0= ruleBaseAttachment ) ) )? ( (otherlv_14= FlangeAttachment ( (lv_flangeAttachment_15_0= ruleFlangeAttachment ) )* ) | ( (lv_flangeAttachment_16_0= ruleFlangeAttachment ) ) )? ( (otherlv_17= Component ( (lv_component_18_0= ruleConfiguredComponent ) )* ) | ( (lv_component_19_0= ruleConfiguredComponent ) ) )? ( (otherlv_20= Connection ( (lv_connection_21_0= ruleConnection ) )* ) | ( (lv_connection_22_0= ruleConnection ) ) )? ( (otherlv_23= Group ( (lv_group_24_0= ruleGroup ) )* ) | ( (lv_group_25_0= ruleGroup ) ) )? ( (otherlv_26= Link ( (lv_link_27_0= ruleLink ) )* ) | ( (lv_link_28_0= ruleLink ) ) )? ( (otherlv_29= Joint ( (lv_joint_30_0= ruleJoint ) )* ) | ( (lv_joint_31_0= ruleJoint ) ) )? this_END_32= RULE_END )
            // InternalKinematicsParser.g:72:3: () otherlv_1= Component this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) otherlv_5= Version ( (lv_version_6_0= ruleEString ) ) (otherlv_7= Category ( (lv_category_8_0= RULE_CATEGORY ) ) )? (otherlv_9= GitRepo ( (lv_gitRepo_10_0= ruleGitRepo ) ) )? ( (otherlv_11= BaseAttachment ( (lv_baseAttachment_12_0= ruleBaseAttachment ) )* ) | ( (lv_baseAttachment_13_0= ruleBaseAttachment ) ) )? ( (otherlv_14= FlangeAttachment ( (lv_flangeAttachment_15_0= ruleFlangeAttachment ) )* ) | ( (lv_flangeAttachment_16_0= ruleFlangeAttachment ) ) )? ( (otherlv_17= Component ( (lv_component_18_0= ruleConfiguredComponent ) )* ) | ( (lv_component_19_0= ruleConfiguredComponent ) ) )? ( (otherlv_20= Connection ( (lv_connection_21_0= ruleConnection ) )* ) | ( (lv_connection_22_0= ruleConnection ) ) )? ( (otherlv_23= Group ( (lv_group_24_0= ruleGroup ) )* ) | ( (lv_group_25_0= ruleGroup ) ) )? ( (otherlv_26= Link ( (lv_link_27_0= ruleLink ) )* ) | ( (lv_link_28_0= ruleLink ) ) )? ( (otherlv_29= Joint ( (lv_joint_30_0= ruleJoint ) )* ) | ( (lv_joint_31_0= ruleJoint ) ) )? this_END_32= RULE_END
            {
            // InternalKinematicsParser.g:72:3: ()
            // InternalKinematicsParser.g:73:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentAccess().getComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Component,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getComponentKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_4); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getComponentAccess().getBEGINTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,Name,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getNameKeyword_3());
            		
            // InternalKinematicsParser.g:91:3: ( (lv_name_4_0= ruleEString ) )
            // InternalKinematicsParser.g:92:4: (lv_name_4_0= ruleEString )
            {
            // InternalKinematicsParser.g:92:4: (lv_name_4_0= ruleEString )
            // InternalKinematicsParser.g:93:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,Version,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getVersionKeyword_5());
            		
            // InternalKinematicsParser.g:114:3: ( (lv_version_6_0= ruleEString ) )
            // InternalKinematicsParser.g:115:4: (lv_version_6_0= ruleEString )
            {
            // InternalKinematicsParser.g:115:4: (lv_version_6_0= ruleEString )
            // InternalKinematicsParser.g:116:5: lv_version_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getVersionEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_version_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					set(
            						current,
            						"version",
            						lv_version_6_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKinematicsParser.g:133:3: (otherlv_7= Category ( (lv_category_8_0= RULE_CATEGORY ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Category) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalKinematicsParser.g:134:4: otherlv_7= Category ( (lv_category_8_0= RULE_CATEGORY ) )
                    {
                    otherlv_7=(Token)match(input,Category,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getCategoryKeyword_7_0());
                    			
                    // InternalKinematicsParser.g:138:4: ( (lv_category_8_0= RULE_CATEGORY ) )
                    // InternalKinematicsParser.g:139:5: (lv_category_8_0= RULE_CATEGORY )
                    {
                    // InternalKinematicsParser.g:139:5: (lv_category_8_0= RULE_CATEGORY )
                    // InternalKinematicsParser.g:140:6: lv_category_8_0= RULE_CATEGORY
                    {
                    lv_category_8_0=(Token)match(input,RULE_CATEGORY,FOLLOW_9); 

                    						newLeafNode(lv_category_8_0, grammarAccess.getComponentAccess().getCategoryCATEGORYTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"category",
                    							lv_category_8_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.CATEGORY");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:157:3: (otherlv_9= GitRepo ( (lv_gitRepo_10_0= ruleGitRepo ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==GitRepo) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKinematicsParser.g:158:4: otherlv_9= GitRepo ( (lv_gitRepo_10_0= ruleGitRepo ) )
                    {
                    otherlv_9=(Token)match(input,GitRepo,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getGitRepoKeyword_8_0());
                    			
                    // InternalKinematicsParser.g:162:4: ( (lv_gitRepo_10_0= ruleGitRepo ) )
                    // InternalKinematicsParser.g:163:5: (lv_gitRepo_10_0= ruleGitRepo )
                    {
                    // InternalKinematicsParser.g:163:5: (lv_gitRepo_10_0= ruleGitRepo )
                    // InternalKinematicsParser.g:164:6: lv_gitRepo_10_0= ruleGitRepo
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getGitRepoGitRepoParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_gitRepo_10_0=ruleGitRepo();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						set(
                    							current,
                    							"gitRepo",
                    							lv_gitRepo_10_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.GitRepo");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:182:3: ( (otherlv_11= BaseAttachment ( (lv_baseAttachment_12_0= ruleBaseAttachment ) )* ) | ( (lv_baseAttachment_13_0= ruleBaseAttachment ) ) )?
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalKinematicsParser.g:183:4: (otherlv_11= BaseAttachment ( (lv_baseAttachment_12_0= ruleBaseAttachment ) )* )
                    {
                    // InternalKinematicsParser.g:183:4: (otherlv_11= BaseAttachment ( (lv_baseAttachment_12_0= ruleBaseAttachment ) )* )
                    // InternalKinematicsParser.g:184:5: otherlv_11= BaseAttachment ( (lv_baseAttachment_12_0= ruleBaseAttachment ) )*
                    {
                    otherlv_11=(Token)match(input,BaseAttachment,FOLLOW_11); 

                    					newLeafNode(otherlv_11, grammarAccess.getComponentAccess().getBaseAttachmentKeyword_9_0_0());
                    				
                    // InternalKinematicsParser.g:188:5: ( (lv_baseAttachment_12_0= ruleBaseAttachment ) )*
                    loop3:
                    do {
                        int alt3=2;
                        alt3 = dfa3.predict(input);
                        switch (alt3) {
                    	case 1 :
                    	    // InternalKinematicsParser.g:189:6: (lv_baseAttachment_12_0= ruleBaseAttachment )
                    	    {
                    	    // InternalKinematicsParser.g:189:6: (lv_baseAttachment_12_0= ruleBaseAttachment )
                    	    // InternalKinematicsParser.g:190:7: lv_baseAttachment_12_0= ruleBaseAttachment
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getBaseAttachmentBaseAttachmentParserRuleCall_9_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_baseAttachment_12_0=ruleBaseAttachment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"baseAttachment",
                    	    								lv_baseAttachment_12_0,
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.BaseAttachment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalKinematicsParser.g:209:4: ( (lv_baseAttachment_13_0= ruleBaseAttachment ) )
                    {
                    // InternalKinematicsParser.g:209:4: ( (lv_baseAttachment_13_0= ruleBaseAttachment ) )
                    // InternalKinematicsParser.g:210:5: (lv_baseAttachment_13_0= ruleBaseAttachment )
                    {
                    // InternalKinematicsParser.g:210:5: (lv_baseAttachment_13_0= ruleBaseAttachment )
                    // InternalKinematicsParser.g:211:6: lv_baseAttachment_13_0= ruleBaseAttachment
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getBaseAttachmentBaseAttachmentParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_baseAttachment_13_0=ruleBaseAttachment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"baseAttachment",
                    							lv_baseAttachment_13_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.BaseAttachment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:229:3: ( (otherlv_14= FlangeAttachment ( (lv_flangeAttachment_15_0= ruleFlangeAttachment ) )* ) | ( (lv_flangeAttachment_16_0= ruleFlangeAttachment ) ) )?
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==FlangeAttachment) ) {
                alt6=1;
            }
            else if ( (LA6_0==HyphenMinus) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==Name) ) {
                    int LA6_4 = input.LA(3);

                    if ( (LA6_4==RULE_STRING) ) {
                        int LA6_5 = input.LA(4);

                        if ( (LA6_5==RULE_BEGIN) ) {
                            int LA6_6 = input.LA(5);

                            if ( (LA6_6==Origin) ) {
                                alt6=2;
                            }
                        }
                    }
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalKinematicsParser.g:230:4: (otherlv_14= FlangeAttachment ( (lv_flangeAttachment_15_0= ruleFlangeAttachment ) )* )
                    {
                    // InternalKinematicsParser.g:230:4: (otherlv_14= FlangeAttachment ( (lv_flangeAttachment_15_0= ruleFlangeAttachment ) )* )
                    // InternalKinematicsParser.g:231:5: otherlv_14= FlangeAttachment ( (lv_flangeAttachment_15_0= ruleFlangeAttachment ) )*
                    {
                    otherlv_14=(Token)match(input,FlangeAttachment,FOLLOW_12); 

                    					newLeafNode(otherlv_14, grammarAccess.getComponentAccess().getFlangeAttachmentKeyword_10_0_0());
                    				
                    // InternalKinematicsParser.g:235:5: ( (lv_flangeAttachment_15_0= ruleFlangeAttachment ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==HyphenMinus) ) {
                            int LA5_2 = input.LA(2);

                            if ( (LA5_2==Name) ) {
                                int LA5_3 = input.LA(3);

                                if ( (LA5_3==RULE_STRING) ) {
                                    int LA5_4 = input.LA(4);

                                    if ( (LA5_4==RULE_BEGIN) ) {
                                        int LA5_5 = input.LA(5);

                                        if ( (LA5_5==Origin) ) {
                                            alt5=1;
                                        }


                                    }


                                }


                            }


                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalKinematicsParser.g:236:6: (lv_flangeAttachment_15_0= ruleFlangeAttachment )
                    	    {
                    	    // InternalKinematicsParser.g:236:6: (lv_flangeAttachment_15_0= ruleFlangeAttachment )
                    	    // InternalKinematicsParser.g:237:7: lv_flangeAttachment_15_0= ruleFlangeAttachment
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getFlangeAttachmentFlangeAttachmentParserRuleCall_10_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_flangeAttachment_15_0=ruleFlangeAttachment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"flangeAttachment",
                    	    								lv_flangeAttachment_15_0,
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.FlangeAttachment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalKinematicsParser.g:256:4: ( (lv_flangeAttachment_16_0= ruleFlangeAttachment ) )
                    {
                    // InternalKinematicsParser.g:256:4: ( (lv_flangeAttachment_16_0= ruleFlangeAttachment ) )
                    // InternalKinematicsParser.g:257:5: (lv_flangeAttachment_16_0= ruleFlangeAttachment )
                    {
                    // InternalKinematicsParser.g:257:5: (lv_flangeAttachment_16_0= ruleFlangeAttachment )
                    // InternalKinematicsParser.g:258:6: lv_flangeAttachment_16_0= ruleFlangeAttachment
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getFlangeAttachmentFlangeAttachmentParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_flangeAttachment_16_0=ruleFlangeAttachment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"flangeAttachment",
                    							lv_flangeAttachment_16_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.FlangeAttachment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:276:3: ( (otherlv_17= Component ( (lv_component_18_0= ruleConfiguredComponent ) )* ) | ( (lv_component_19_0= ruleConfiguredComponent ) ) )?
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Component) ) {
                alt8=1;
            }
            else if ( (LA8_0==HyphenMinus) ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==Name) ) {
                    int LA8_4 = input.LA(3);

                    if ( (LA8_4==RULE_STRING) ) {
                        int LA8_5 = input.LA(4);

                        if ( (LA8_5==RULE_BEGIN) ) {
                            int LA8_6 = input.LA(5);

                            if ( (LA8_6==Type) ) {
                                int LA8_7 = input.LA(6);

                                if ( (LA8_7==RULE_STRING) ) {
                                    alt8=2;
                                }
                            }
                        }
                    }
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalKinematicsParser.g:277:4: (otherlv_17= Component ( (lv_component_18_0= ruleConfiguredComponent ) )* )
                    {
                    // InternalKinematicsParser.g:277:4: (otherlv_17= Component ( (lv_component_18_0= ruleConfiguredComponent ) )* )
                    // InternalKinematicsParser.g:278:5: otherlv_17= Component ( (lv_component_18_0= ruleConfiguredComponent ) )*
                    {
                    otherlv_17=(Token)match(input,Component,FOLLOW_13); 

                    					newLeafNode(otherlv_17, grammarAccess.getComponentAccess().getComponentKeyword_11_0_0());
                    				
                    // InternalKinematicsParser.g:282:5: ( (lv_component_18_0= ruleConfiguredComponent ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==HyphenMinus) ) {
                            int LA7_2 = input.LA(2);

                            if ( (LA7_2==Name) ) {
                                int LA7_3 = input.LA(3);

                                if ( (LA7_3==RULE_STRING) ) {
                                    int LA7_4 = input.LA(4);

                                    if ( (LA7_4==RULE_BEGIN) ) {
                                        int LA7_5 = input.LA(5);

                                        if ( (LA7_5==Type) ) {
                                            int LA7_6 = input.LA(6);

                                            if ( (LA7_6==RULE_STRING) ) {
                                                alt7=1;
                                            }


                                        }


                                    }


                                }


                            }


                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalKinematicsParser.g:283:6: (lv_component_18_0= ruleConfiguredComponent )
                    	    {
                    	    // InternalKinematicsParser.g:283:6: (lv_component_18_0= ruleConfiguredComponent )
                    	    // InternalKinematicsParser.g:284:7: lv_component_18_0= ruleConfiguredComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getComponentConfiguredComponentParserRuleCall_11_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_component_18_0=ruleConfiguredComponent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"component",
                    	    								lv_component_18_0,
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.ConfiguredComponent");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalKinematicsParser.g:303:4: ( (lv_component_19_0= ruleConfiguredComponent ) )
                    {
                    // InternalKinematicsParser.g:303:4: ( (lv_component_19_0= ruleConfiguredComponent ) )
                    // InternalKinematicsParser.g:304:5: (lv_component_19_0= ruleConfiguredComponent )
                    {
                    // InternalKinematicsParser.g:304:5: (lv_component_19_0= ruleConfiguredComponent )
                    // InternalKinematicsParser.g:305:6: lv_component_19_0= ruleConfiguredComponent
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getComponentConfiguredComponentParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_component_19_0=ruleConfiguredComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"component",
                    							lv_component_19_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.ConfiguredComponent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:323:3: ( (otherlv_20= Connection ( (lv_connection_21_0= ruleConnection ) )* ) | ( (lv_connection_22_0= ruleConnection ) ) )?
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Connection) ) {
                alt10=1;
            }
            else if ( (LA10_0==HyphenMinus) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==Name) ) {
                    int LA10_4 = input.LA(3);

                    if ( (LA10_4==RULE_STRING) ) {
                        int LA10_5 = input.LA(4);

                        if ( (LA10_5==RULE_BEGIN) ) {
                            int LA10_6 = input.LA(5);

                            if ( (LA10_6==BaseAttachment) ) {
                                alt10=2;
                            }
                        }
                    }
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalKinematicsParser.g:324:4: (otherlv_20= Connection ( (lv_connection_21_0= ruleConnection ) )* )
                    {
                    // InternalKinematicsParser.g:324:4: (otherlv_20= Connection ( (lv_connection_21_0= ruleConnection ) )* )
                    // InternalKinematicsParser.g:325:5: otherlv_20= Connection ( (lv_connection_21_0= ruleConnection ) )*
                    {
                    otherlv_20=(Token)match(input,Connection,FOLLOW_14); 

                    					newLeafNode(otherlv_20, grammarAccess.getComponentAccess().getConnectionKeyword_12_0_0());
                    				
                    // InternalKinematicsParser.g:329:5: ( (lv_connection_21_0= ruleConnection ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==HyphenMinus) ) {
                            int LA9_2 = input.LA(2);

                            if ( (LA9_2==Name) ) {
                                int LA9_3 = input.LA(3);

                                if ( (LA9_3==RULE_STRING) ) {
                                    int LA9_4 = input.LA(4);

                                    if ( (LA9_4==RULE_BEGIN) ) {
                                        int LA9_5 = input.LA(5);

                                        if ( (LA9_5==BaseAttachment) ) {
                                            alt9=1;
                                        }


                                    }


                                }


                            }


                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalKinematicsParser.g:330:6: (lv_connection_21_0= ruleConnection )
                    	    {
                    	    // InternalKinematicsParser.g:330:6: (lv_connection_21_0= ruleConnection )
                    	    // InternalKinematicsParser.g:331:7: lv_connection_21_0= ruleConnection
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getConnectionConnectionParserRuleCall_12_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_connection_21_0=ruleConnection();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"connection",
                    	    								lv_connection_21_0,
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.Connection");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalKinematicsParser.g:350:4: ( (lv_connection_22_0= ruleConnection ) )
                    {
                    // InternalKinematicsParser.g:350:4: ( (lv_connection_22_0= ruleConnection ) )
                    // InternalKinematicsParser.g:351:5: (lv_connection_22_0= ruleConnection )
                    {
                    // InternalKinematicsParser.g:351:5: (lv_connection_22_0= ruleConnection )
                    // InternalKinematicsParser.g:352:6: lv_connection_22_0= ruleConnection
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getConnectionConnectionParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_connection_22_0=ruleConnection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"connection",
                    							lv_connection_22_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Connection");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:370:3: ( (otherlv_23= Group ( (lv_group_24_0= ruleGroup ) )* ) | ( (lv_group_25_0= ruleGroup ) ) )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Group) ) {
                alt12=1;
            }
            else if ( (LA12_0==HyphenMinus) ) {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==Name) ) {
                    int LA12_4 = input.LA(3);

                    if ( (LA12_4==RULE_STRING) ) {
                        int LA12_5 = input.LA(4);

                        if ( (LA12_5==RULE_BEGIN) ) {
                            int LA12_6 = input.LA(5);

                            if ( (LA12_6==BaseLink) ) {
                                alt12=2;
                            }
                        }
                    }
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalKinematicsParser.g:371:4: (otherlv_23= Group ( (lv_group_24_0= ruleGroup ) )* )
                    {
                    // InternalKinematicsParser.g:371:4: (otherlv_23= Group ( (lv_group_24_0= ruleGroup ) )* )
                    // InternalKinematicsParser.g:372:5: otherlv_23= Group ( (lv_group_24_0= ruleGroup ) )*
                    {
                    otherlv_23=(Token)match(input,Group,FOLLOW_15); 

                    					newLeafNode(otherlv_23, grammarAccess.getComponentAccess().getGroupKeyword_13_0_0());
                    				
                    // InternalKinematicsParser.g:376:5: ( (lv_group_24_0= ruleGroup ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==HyphenMinus) ) {
                            int LA11_2 = input.LA(2);

                            if ( (LA11_2==Name) ) {
                                int LA11_3 = input.LA(3);

                                if ( (LA11_3==RULE_STRING) ) {
                                    int LA11_4 = input.LA(4);

                                    if ( (LA11_4==RULE_BEGIN) ) {
                                        int LA11_5 = input.LA(5);

                                        if ( (LA11_5==BaseLink) ) {
                                            alt11=1;
                                        }


                                    }


                                }


                            }


                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalKinematicsParser.g:377:6: (lv_group_24_0= ruleGroup )
                    	    {
                    	    // InternalKinematicsParser.g:377:6: (lv_group_24_0= ruleGroup )
                    	    // InternalKinematicsParser.g:378:7: lv_group_24_0= ruleGroup
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getGroupGroupParserRuleCall_13_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_group_24_0=ruleGroup();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"group",
                    	    								lv_group_24_0,
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.Group");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalKinematicsParser.g:397:4: ( (lv_group_25_0= ruleGroup ) )
                    {
                    // InternalKinematicsParser.g:397:4: ( (lv_group_25_0= ruleGroup ) )
                    // InternalKinematicsParser.g:398:5: (lv_group_25_0= ruleGroup )
                    {
                    // InternalKinematicsParser.g:398:5: (lv_group_25_0= ruleGroup )
                    // InternalKinematicsParser.g:399:6: lv_group_25_0= ruleGroup
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getGroupGroupParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_group_25_0=ruleGroup();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"group",
                    							lv_group_25_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Group");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:417:3: ( (otherlv_26= Link ( (lv_link_27_0= ruleLink ) )* ) | ( (lv_link_28_0= ruleLink ) ) )?
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Link) ) {
                alt14=1;
            }
            else if ( (LA14_0==HyphenMinus) ) {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==Name) ) {
                    int LA14_4 = input.LA(3);

                    if ( (LA14_4==RULE_STRING) ) {
                        int LA14_5 = input.LA(4);

                        if ( (LA14_5==RULE_BEGIN) ) {
                            int LA14_6 = input.LA(5);

                            if ( (LA14_6==Collision||LA14_6==Inertial||LA14_6==Visual||LA14_6==RULE_END) ) {
                                alt14=2;
                            }
                        }
                        else if ( (LA14_5==Joint||LA14_5==HyphenMinus||LA14_5==RULE_END) ) {
                            alt14=2;
                        }
                    }
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalKinematicsParser.g:418:4: (otherlv_26= Link ( (lv_link_27_0= ruleLink ) )* )
                    {
                    // InternalKinematicsParser.g:418:4: (otherlv_26= Link ( (lv_link_27_0= ruleLink ) )* )
                    // InternalKinematicsParser.g:419:5: otherlv_26= Link ( (lv_link_27_0= ruleLink ) )*
                    {
                    otherlv_26=(Token)match(input,Link,FOLLOW_16); 

                    					newLeafNode(otherlv_26, grammarAccess.getComponentAccess().getLinkKeyword_14_0_0());
                    				
                    // InternalKinematicsParser.g:423:5: ( (lv_link_27_0= ruleLink ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==HyphenMinus) ) {
                            int LA13_2 = input.LA(2);

                            if ( (LA13_2==Name) ) {
                                int LA13_3 = input.LA(3);

                                if ( (LA13_3==RULE_STRING) ) {
                                    int LA13_4 = input.LA(4);

                                    if ( (LA13_4==RULE_BEGIN) ) {
                                        int LA13_5 = input.LA(5);

                                        if ( (LA13_5==Collision||LA13_5==Inertial||LA13_5==Visual||LA13_5==RULE_END) ) {
                                            alt13=1;
                                        }


                                    }
                                    else if ( (LA13_4==Joint||LA13_4==HyphenMinus||LA13_4==RULE_END) ) {
                                        alt13=1;
                                    }


                                }


                            }


                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalKinematicsParser.g:424:6: (lv_link_27_0= ruleLink )
                    	    {
                    	    // InternalKinematicsParser.g:424:6: (lv_link_27_0= ruleLink )
                    	    // InternalKinematicsParser.g:425:7: lv_link_27_0= ruleLink
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getLinkLinkParserRuleCall_14_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_link_27_0=ruleLink();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"link",
                    	    								lv_link_27_0,
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.Link");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalKinematicsParser.g:444:4: ( (lv_link_28_0= ruleLink ) )
                    {
                    // InternalKinematicsParser.g:444:4: ( (lv_link_28_0= ruleLink ) )
                    // InternalKinematicsParser.g:445:5: (lv_link_28_0= ruleLink )
                    {
                    // InternalKinematicsParser.g:445:5: (lv_link_28_0= ruleLink )
                    // InternalKinematicsParser.g:446:6: lv_link_28_0= ruleLink
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getLinkLinkParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_link_28_0=ruleLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"link",
                    							lv_link_28_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Link");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:464:3: ( (otherlv_29= Joint ( (lv_joint_30_0= ruleJoint ) )* ) | ( (lv_joint_31_0= ruleJoint ) ) )?
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Joint) ) {
                alt16=1;
            }
            else if ( (LA16_0==HyphenMinus) ) {
                alt16=2;
            }
            switch (alt16) {
                case 1 :
                    // InternalKinematicsParser.g:465:4: (otherlv_29= Joint ( (lv_joint_30_0= ruleJoint ) )* )
                    {
                    // InternalKinematicsParser.g:465:4: (otherlv_29= Joint ( (lv_joint_30_0= ruleJoint ) )* )
                    // InternalKinematicsParser.g:466:5: otherlv_29= Joint ( (lv_joint_30_0= ruleJoint ) )*
                    {
                    otherlv_29=(Token)match(input,Joint,FOLLOW_17); 

                    					newLeafNode(otherlv_29, grammarAccess.getComponentAccess().getJointKeyword_15_0_0());
                    				
                    // InternalKinematicsParser.g:470:5: ( (lv_joint_30_0= ruleJoint ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==HyphenMinus) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalKinematicsParser.g:471:6: (lv_joint_30_0= ruleJoint )
                    	    {
                    	    // InternalKinematicsParser.g:471:6: (lv_joint_30_0= ruleJoint )
                    	    // InternalKinematicsParser.g:472:7: lv_joint_30_0= ruleJoint
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getJointJointParserRuleCall_15_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_joint_30_0=ruleJoint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"joint",
                    	    								lv_joint_30_0,
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.Joint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalKinematicsParser.g:491:4: ( (lv_joint_31_0= ruleJoint ) )
                    {
                    // InternalKinematicsParser.g:491:4: ( (lv_joint_31_0= ruleJoint ) )
                    // InternalKinematicsParser.g:492:5: (lv_joint_31_0= ruleJoint )
                    {
                    // InternalKinematicsParser.g:492:5: (lv_joint_31_0= ruleJoint )
                    // InternalKinematicsParser.g:493:6: lv_joint_31_0= ruleJoint
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getJointJointParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_joint_31_0=ruleJoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"joint",
                    							lv_joint_31_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Joint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_32=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_32, grammarAccess.getComponentAccess().getENDTerminalRuleCall_16());
            		

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleConfiguredComponent"
    // InternalKinematicsParser.g:519:1: entryRuleConfiguredComponent returns [EObject current=null] : iv_ruleConfiguredComponent= ruleConfiguredComponent EOF ;
    public final EObject entryRuleConfiguredComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguredComponent = null;


        try {
            // InternalKinematicsParser.g:519:60: (iv_ruleConfiguredComponent= ruleConfiguredComponent EOF )
            // InternalKinematicsParser.g:520:2: iv_ruleConfiguredComponent= ruleConfiguredComponent EOF
            {
             newCompositeNode(grammarAccess.getConfiguredComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfiguredComponent=ruleConfiguredComponent();

            state._fsp--;

             current =iv_ruleConfiguredComponent; 
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
    // $ANTLR end "entryRuleConfiguredComponent"


    // $ANTLR start "ruleConfiguredComponent"
    // InternalKinematicsParser.g:526:1: ruleConfiguredComponent returns [EObject current=null] : (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( ( ruleEString ) ) (otherlv_6= Prefix ( (lv_prefix_7_0= ruleEString ) ) )? this_END_8= RULE_END ) ;
    public final EObject ruleConfiguredComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_END_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_prefix_7_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:532:2: ( (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( ( ruleEString ) ) (otherlv_6= Prefix ( (lv_prefix_7_0= ruleEString ) ) )? this_END_8= RULE_END ) )
            // InternalKinematicsParser.g:533:2: (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( ( ruleEString ) ) (otherlv_6= Prefix ( (lv_prefix_7_0= ruleEString ) ) )? this_END_8= RULE_END )
            {
            // InternalKinematicsParser.g:533:2: (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( ( ruleEString ) ) (otherlv_6= Prefix ( (lv_prefix_7_0= ruleEString ) ) )? this_END_8= RULE_END )
            // InternalKinematicsParser.g:534:3: otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( ( ruleEString ) ) (otherlv_6= Prefix ( (lv_prefix_7_0= ruleEString ) ) )? this_END_8= RULE_END
            {
            otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConfiguredComponentAccess().getHyphenMinusKeyword_0());
            		
            otherlv_1=(Token)match(input,Name,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getConfiguredComponentAccess().getNameKeyword_1());
            		
            // InternalKinematicsParser.g:542:3: ( (lv_name_2_0= ruleEString ) )
            // InternalKinematicsParser.g:543:4: (lv_name_2_0= ruleEString )
            {
            // InternalKinematicsParser.g:543:4: (lv_name_2_0= ruleEString )
            // InternalKinematicsParser.g:544:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConfiguredComponentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfiguredComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_19); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getConfiguredComponentAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Type,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getConfiguredComponentAccess().getTypeKeyword_4());
            		
            // InternalKinematicsParser.g:569:3: ( ( ruleEString ) )
            // InternalKinematicsParser.g:570:4: ( ruleEString )
            {
            // InternalKinematicsParser.g:570:4: ( ruleEString )
            // InternalKinematicsParser.g:571:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfiguredComponentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConfiguredComponentAccess().getTypeComponentCrossReference_5_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKinematicsParser.g:585:3: (otherlv_6= Prefix ( (lv_prefix_7_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Prefix) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalKinematicsParser.g:586:4: otherlv_6= Prefix ( (lv_prefix_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Prefix,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getConfiguredComponentAccess().getPrefixKeyword_6_0());
                    			
                    // InternalKinematicsParser.g:590:4: ( (lv_prefix_7_0= ruleEString ) )
                    // InternalKinematicsParser.g:591:5: (lv_prefix_7_0= ruleEString )
                    {
                    // InternalKinematicsParser.g:591:5: (lv_prefix_7_0= ruleEString )
                    // InternalKinematicsParser.g:592:6: lv_prefix_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getConfiguredComponentAccess().getPrefixEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_prefix_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConfiguredComponentRule());
                    						}
                    						set(
                    							current,
                    							"prefix",
                    							lv_prefix_7_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_8, grammarAccess.getConfiguredComponentAccess().getENDTerminalRuleCall_7());
            		

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
    // $ANTLR end "ruleConfiguredComponent"


    // $ANTLR start "entryRuleGitRepo"
    // InternalKinematicsParser.g:618:1: entryRuleGitRepo returns [EObject current=null] : iv_ruleGitRepo= ruleGitRepo EOF ;
    public final EObject entryRuleGitRepo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGitRepo = null;


        try {
            // InternalKinematicsParser.g:618:48: (iv_ruleGitRepo= ruleGitRepo EOF )
            // InternalKinematicsParser.g:619:2: iv_ruleGitRepo= ruleGitRepo EOF
            {
             newCompositeNode(grammarAccess.getGitRepoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGitRepo=ruleGitRepo();

            state._fsp--;

             current =iv_ruleGitRepo; 
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
    // $ANTLR end "entryRuleGitRepo"


    // $ANTLR start "ruleGitRepo"
    // InternalKinematicsParser.g:625:1: ruleGitRepo returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN otherlv_1= Distro ( (lv_distro_2_0= ruleEString ) ) otherlv_3= Repo ( (lv_repo_4_0= ruleEString ) ) otherlv_5= Branch ( (lv_branch_6_0= ruleEString ) ) otherlv_7= Package ( (lv_package_8_0= ruleEString ) ) otherlv_9= Version ( (lv_version_10_0= ruleEString ) ) this_END_11= RULE_END ) ;
    public final EObject ruleGitRepo() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token this_END_11=null;
        AntlrDatatypeRuleToken lv_distro_2_0 = null;

        AntlrDatatypeRuleToken lv_repo_4_0 = null;

        AntlrDatatypeRuleToken lv_branch_6_0 = null;

        AntlrDatatypeRuleToken lv_package_8_0 = null;

        AntlrDatatypeRuleToken lv_version_10_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:631:2: ( (this_BEGIN_0= RULE_BEGIN otherlv_1= Distro ( (lv_distro_2_0= ruleEString ) ) otherlv_3= Repo ( (lv_repo_4_0= ruleEString ) ) otherlv_5= Branch ( (lv_branch_6_0= ruleEString ) ) otherlv_7= Package ( (lv_package_8_0= ruleEString ) ) otherlv_9= Version ( (lv_version_10_0= ruleEString ) ) this_END_11= RULE_END ) )
            // InternalKinematicsParser.g:632:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Distro ( (lv_distro_2_0= ruleEString ) ) otherlv_3= Repo ( (lv_repo_4_0= ruleEString ) ) otherlv_5= Branch ( (lv_branch_6_0= ruleEString ) ) otherlv_7= Package ( (lv_package_8_0= ruleEString ) ) otherlv_9= Version ( (lv_version_10_0= ruleEString ) ) this_END_11= RULE_END )
            {
            // InternalKinematicsParser.g:632:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Distro ( (lv_distro_2_0= ruleEString ) ) otherlv_3= Repo ( (lv_repo_4_0= ruleEString ) ) otherlv_5= Branch ( (lv_branch_6_0= ruleEString ) ) otherlv_7= Package ( (lv_package_8_0= ruleEString ) ) otherlv_9= Version ( (lv_version_10_0= ruleEString ) ) this_END_11= RULE_END )
            // InternalKinematicsParser.g:633:3: this_BEGIN_0= RULE_BEGIN otherlv_1= Distro ( (lv_distro_2_0= ruleEString ) ) otherlv_3= Repo ( (lv_repo_4_0= ruleEString ) ) otherlv_5= Branch ( (lv_branch_6_0= ruleEString ) ) otherlv_7= Package ( (lv_package_8_0= ruleEString ) ) otherlv_9= Version ( (lv_version_10_0= ruleEString ) ) this_END_11= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_21); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getGitRepoAccess().getBEGINTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,Distro,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getGitRepoAccess().getDistroKeyword_1());
            		
            // InternalKinematicsParser.g:641:3: ( (lv_distro_2_0= ruleEString ) )
            // InternalKinematicsParser.g:642:4: (lv_distro_2_0= ruleEString )
            {
            // InternalKinematicsParser.g:642:4: (lv_distro_2_0= ruleEString )
            // InternalKinematicsParser.g:643:5: lv_distro_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGitRepoAccess().getDistroEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_distro_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGitRepoRule());
            					}
            					set(
            						current,
            						"distro",
            						lv_distro_2_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,Repo,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getGitRepoAccess().getRepoKeyword_3());
            		
            // InternalKinematicsParser.g:664:3: ( (lv_repo_4_0= ruleEString ) )
            // InternalKinematicsParser.g:665:4: (lv_repo_4_0= ruleEString )
            {
            // InternalKinematicsParser.g:665:4: (lv_repo_4_0= ruleEString )
            // InternalKinematicsParser.g:666:5: lv_repo_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGitRepoAccess().getRepoEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_repo_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGitRepoRule());
            					}
            					set(
            						current,
            						"repo",
            						lv_repo_4_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,Branch,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getGitRepoAccess().getBranchKeyword_5());
            		
            // InternalKinematicsParser.g:687:3: ( (lv_branch_6_0= ruleEString ) )
            // InternalKinematicsParser.g:688:4: (lv_branch_6_0= ruleEString )
            {
            // InternalKinematicsParser.g:688:4: (lv_branch_6_0= ruleEString )
            // InternalKinematicsParser.g:689:5: lv_branch_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGitRepoAccess().getBranchEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_24);
            lv_branch_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGitRepoRule());
            					}
            					set(
            						current,
            						"branch",
            						lv_branch_6_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,Package,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getGitRepoAccess().getPackageKeyword_7());
            		
            // InternalKinematicsParser.g:710:3: ( (lv_package_8_0= ruleEString ) )
            // InternalKinematicsParser.g:711:4: (lv_package_8_0= ruleEString )
            {
            // InternalKinematicsParser.g:711:4: (lv_package_8_0= ruleEString )
            // InternalKinematicsParser.g:712:5: lv_package_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGitRepoAccess().getPackageEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_6);
            lv_package_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGitRepoRule());
            					}
            					set(
            						current,
            						"package",
            						lv_package_8_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,Version,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getGitRepoAccess().getVersionKeyword_9());
            		
            // InternalKinematicsParser.g:733:3: ( (lv_version_10_0= ruleEString ) )
            // InternalKinematicsParser.g:734:4: (lv_version_10_0= ruleEString )
            {
            // InternalKinematicsParser.g:734:4: (lv_version_10_0= ruleEString )
            // InternalKinematicsParser.g:735:5: lv_version_10_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGitRepoAccess().getVersionEStringParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_18);
            lv_version_10_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGitRepoRule());
            					}
            					set(
            						current,
            						"version",
            						lv_version_10_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_11=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_11, grammarAccess.getGitRepoAccess().getENDTerminalRuleCall_11());
            		

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
    // $ANTLR end "ruleGitRepo"


    // $ANTLR start "entryRuleGroup"
    // InternalKinematicsParser.g:760:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalKinematicsParser.g:760:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalKinematicsParser.g:761:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
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
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalKinematicsParser.g:767:1: ruleGroup returns [EObject current=null] : (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= BaseLink ( ( ruleEString ) ) otherlv_6= EndLink ( ( ruleEString ) ) (otherlv_8= Ros2_control ( (lv_ros2_control_9_0= ruleEString ) ) )? this_END_10= RULE_END ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_END_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ros2_control_9_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:773:2: ( (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= BaseLink ( ( ruleEString ) ) otherlv_6= EndLink ( ( ruleEString ) ) (otherlv_8= Ros2_control ( (lv_ros2_control_9_0= ruleEString ) ) )? this_END_10= RULE_END ) )
            // InternalKinematicsParser.g:774:2: (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= BaseLink ( ( ruleEString ) ) otherlv_6= EndLink ( ( ruleEString ) ) (otherlv_8= Ros2_control ( (lv_ros2_control_9_0= ruleEString ) ) )? this_END_10= RULE_END )
            {
            // InternalKinematicsParser.g:774:2: (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= BaseLink ( ( ruleEString ) ) otherlv_6= EndLink ( ( ruleEString ) ) (otherlv_8= Ros2_control ( (lv_ros2_control_9_0= ruleEString ) ) )? this_END_10= RULE_END )
            // InternalKinematicsParser.g:775:3: otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= BaseLink ( ( ruleEString ) ) otherlv_6= EndLink ( ( ruleEString ) ) (otherlv_8= Ros2_control ( (lv_ros2_control_9_0= ruleEString ) ) )? this_END_10= RULE_END
            {
            otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getHyphenMinusKeyword_0());
            		
            otherlv_1=(Token)match(input,Name,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupAccess().getNameKeyword_1());
            		
            // InternalKinematicsParser.g:783:3: ( (lv_name_2_0= ruleEString ) )
            // InternalKinematicsParser.g:784:4: (lv_name_2_0= ruleEString )
            {
            // InternalKinematicsParser.g:784:4: (lv_name_2_0= ruleEString )
            // InternalKinematicsParser.g:785:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGroupAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_25); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getGroupAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,BaseLink,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getBaseLinkKeyword_4());
            		
            // InternalKinematicsParser.g:810:3: ( ( ruleEString ) )
            // InternalKinematicsParser.g:811:4: ( ruleEString )
            {
            // InternalKinematicsParser.g:811:4: ( ruleEString )
            // InternalKinematicsParser.g:812:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGroupAccess().getBaseLinkLinkCrossReference_5_0());
            				
            pushFollow(FOLLOW_26);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,EndLink,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getGroupAccess().getEndLinkKeyword_6());
            		
            // InternalKinematicsParser.g:830:3: ( ( ruleEString ) )
            // InternalKinematicsParser.g:831:4: ( ruleEString )
            {
            // InternalKinematicsParser.g:831:4: ( ruleEString )
            // InternalKinematicsParser.g:832:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGroupAccess().getEndLinkLinkCrossReference_7_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKinematicsParser.g:846:3: (otherlv_8= Ros2_control ( (lv_ros2_control_9_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Ros2_control) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalKinematicsParser.g:847:4: otherlv_8= Ros2_control ( (lv_ros2_control_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,Ros2_control,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getRos2_controlKeyword_8_0());
                    			
                    // InternalKinematicsParser.g:851:4: ( (lv_ros2_control_9_0= ruleEString ) )
                    // InternalKinematicsParser.g:852:5: (lv_ros2_control_9_0= ruleEString )
                    {
                    // InternalKinematicsParser.g:852:5: (lv_ros2_control_9_0= ruleEString )
                    // InternalKinematicsParser.g:853:6: lv_ros2_control_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGroupAccess().getRos2_controlEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_ros2_control_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGroupRule());
                    						}
                    						set(
                    							current,
                    							"ros2_control",
                    							lv_ros2_control_9_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_10=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_10, grammarAccess.getGroupAccess().getENDTerminalRuleCall_9());
            		

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
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleBaseAttachment"
    // InternalKinematicsParser.g:879:1: entryRuleBaseAttachment returns [EObject current=null] : iv_ruleBaseAttachment= ruleBaseAttachment EOF ;
    public final EObject entryRuleBaseAttachment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseAttachment = null;


        try {
            // InternalKinematicsParser.g:879:55: (iv_ruleBaseAttachment= ruleBaseAttachment EOF )
            // InternalKinematicsParser.g:880:2: iv_ruleBaseAttachment= ruleBaseAttachment EOF
            {
             newCompositeNode(grammarAccess.getBaseAttachmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseAttachment=ruleBaseAttachment();

            state._fsp--;

             current =iv_ruleBaseAttachment; 
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
    // $ANTLR end "entryRuleBaseAttachment"


    // $ANTLR start "ruleBaseAttachment"
    // InternalKinematicsParser.g:886:1: ruleBaseAttachment returns [EObject current=null] : (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Origin ( (lv_origin_5_0= rulePose ) ) otherlv_6= Parent ( ( ruleEString ) ) this_END_8= RULE_END ) ;
    public final EObject ruleBaseAttachment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_END_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_origin_5_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:892:2: ( (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Origin ( (lv_origin_5_0= rulePose ) ) otherlv_6= Parent ( ( ruleEString ) ) this_END_8= RULE_END ) )
            // InternalKinematicsParser.g:893:2: (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Origin ( (lv_origin_5_0= rulePose ) ) otherlv_6= Parent ( ( ruleEString ) ) this_END_8= RULE_END )
            {
            // InternalKinematicsParser.g:893:2: (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Origin ( (lv_origin_5_0= rulePose ) ) otherlv_6= Parent ( ( ruleEString ) ) this_END_8= RULE_END )
            // InternalKinematicsParser.g:894:3: otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Origin ( (lv_origin_5_0= rulePose ) ) otherlv_6= Parent ( ( ruleEString ) ) this_END_8= RULE_END
            {
            otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBaseAttachmentAccess().getHyphenMinusKeyword_0());
            		
            otherlv_1=(Token)match(input,Name,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getBaseAttachmentAccess().getNameKeyword_1());
            		
            // InternalKinematicsParser.g:902:3: ( (lv_name_2_0= ruleEString ) )
            // InternalKinematicsParser.g:903:4: (lv_name_2_0= ruleEString )
            {
            // InternalKinematicsParser.g:903:4: (lv_name_2_0= ruleEString )
            // InternalKinematicsParser.g:904:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBaseAttachmentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBaseAttachmentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_28); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getBaseAttachmentAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Origin,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getBaseAttachmentAccess().getOriginKeyword_4());
            		
            // InternalKinematicsParser.g:929:3: ( (lv_origin_5_0= rulePose ) )
            // InternalKinematicsParser.g:930:4: (lv_origin_5_0= rulePose )
            {
            // InternalKinematicsParser.g:930:4: (lv_origin_5_0= rulePose )
            // InternalKinematicsParser.g:931:5: lv_origin_5_0= rulePose
            {

            					newCompositeNode(grammarAccess.getBaseAttachmentAccess().getOriginPoseParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_29);
            lv_origin_5_0=rulePose();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBaseAttachmentRule());
            					}
            					set(
            						current,
            						"origin",
            						lv_origin_5_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Pose");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,Parent,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getBaseAttachmentAccess().getParentKeyword_6());
            		
            // InternalKinematicsParser.g:952:3: ( ( ruleEString ) )
            // InternalKinematicsParser.g:953:4: ( ruleEString )
            {
            // InternalKinematicsParser.g:953:4: ( ruleEString )
            // InternalKinematicsParser.g:954:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBaseAttachmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBaseAttachmentAccess().getParentLinkCrossReference_7_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_8, grammarAccess.getBaseAttachmentAccess().getENDTerminalRuleCall_8());
            		

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
    // $ANTLR end "ruleBaseAttachment"


    // $ANTLR start "entryRuleFlangeAttachment"
    // InternalKinematicsParser.g:976:1: entryRuleFlangeAttachment returns [EObject current=null] : iv_ruleFlangeAttachment= ruleFlangeAttachment EOF ;
    public final EObject entryRuleFlangeAttachment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlangeAttachment = null;


        try {
            // InternalKinematicsParser.g:976:57: (iv_ruleFlangeAttachment= ruleFlangeAttachment EOF )
            // InternalKinematicsParser.g:977:2: iv_ruleFlangeAttachment= ruleFlangeAttachment EOF
            {
             newCompositeNode(grammarAccess.getFlangeAttachmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFlangeAttachment=ruleFlangeAttachment();

            state._fsp--;

             current =iv_ruleFlangeAttachment; 
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
    // $ANTLR end "entryRuleFlangeAttachment"


    // $ANTLR start "ruleFlangeAttachment"
    // InternalKinematicsParser.g:983:1: ruleFlangeAttachment returns [EObject current=null] : (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Origin ( (lv_origin_5_0= rulePose ) ) otherlv_6= Parent ( ( ruleEString ) ) this_END_8= RULE_END ) ;
    public final EObject ruleFlangeAttachment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_END_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_origin_5_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:989:2: ( (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Origin ( (lv_origin_5_0= rulePose ) ) otherlv_6= Parent ( ( ruleEString ) ) this_END_8= RULE_END ) )
            // InternalKinematicsParser.g:990:2: (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Origin ( (lv_origin_5_0= rulePose ) ) otherlv_6= Parent ( ( ruleEString ) ) this_END_8= RULE_END )
            {
            // InternalKinematicsParser.g:990:2: (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Origin ( (lv_origin_5_0= rulePose ) ) otherlv_6= Parent ( ( ruleEString ) ) this_END_8= RULE_END )
            // InternalKinematicsParser.g:991:3: otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Origin ( (lv_origin_5_0= rulePose ) ) otherlv_6= Parent ( ( ruleEString ) ) this_END_8= RULE_END
            {
            otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFlangeAttachmentAccess().getHyphenMinusKeyword_0());
            		
            otherlv_1=(Token)match(input,Name,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFlangeAttachmentAccess().getNameKeyword_1());
            		
            // InternalKinematicsParser.g:999:3: ( (lv_name_2_0= ruleEString ) )
            // InternalKinematicsParser.g:1000:4: (lv_name_2_0= ruleEString )
            {
            // InternalKinematicsParser.g:1000:4: (lv_name_2_0= ruleEString )
            // InternalKinematicsParser.g:1001:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFlangeAttachmentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFlangeAttachmentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_28); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getFlangeAttachmentAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Origin,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getFlangeAttachmentAccess().getOriginKeyword_4());
            		
            // InternalKinematicsParser.g:1026:3: ( (lv_origin_5_0= rulePose ) )
            // InternalKinematicsParser.g:1027:4: (lv_origin_5_0= rulePose )
            {
            // InternalKinematicsParser.g:1027:4: (lv_origin_5_0= rulePose )
            // InternalKinematicsParser.g:1028:5: lv_origin_5_0= rulePose
            {

            					newCompositeNode(grammarAccess.getFlangeAttachmentAccess().getOriginPoseParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_29);
            lv_origin_5_0=rulePose();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFlangeAttachmentRule());
            					}
            					set(
            						current,
            						"origin",
            						lv_origin_5_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Pose");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,Parent,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getFlangeAttachmentAccess().getParentKeyword_6());
            		
            // InternalKinematicsParser.g:1049:3: ( ( ruleEString ) )
            // InternalKinematicsParser.g:1050:4: ( ruleEString )
            {
            // InternalKinematicsParser.g:1050:4: ( ruleEString )
            // InternalKinematicsParser.g:1051:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFlangeAttachmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFlangeAttachmentAccess().getParentLinkCrossReference_7_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_8, grammarAccess.getFlangeAttachmentAccess().getENDTerminalRuleCall_8());
            		

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
    // $ANTLR end "ruleFlangeAttachment"


    // $ANTLR start "entryRuleConnection"
    // InternalKinematicsParser.g:1073:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalKinematicsParser.g:1073:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalKinematicsParser.g:1074:2: iv_ruleConnection= ruleConnection EOF
            {
             newCompositeNode(grammarAccess.getConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnection=ruleConnection();

            state._fsp--;

             current =iv_ruleConnection; 
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
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // InternalKinematicsParser.g:1080:1: ruleConnection returns [EObject current=null] : (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= BaseAttachment ( ( ruleEString ) ) otherlv_6= FlangeAttachment ( ( ruleEString ) ) this_END_8= RULE_END ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_END_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:1086:2: ( (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= BaseAttachment ( ( ruleEString ) ) otherlv_6= FlangeAttachment ( ( ruleEString ) ) this_END_8= RULE_END ) )
            // InternalKinematicsParser.g:1087:2: (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= BaseAttachment ( ( ruleEString ) ) otherlv_6= FlangeAttachment ( ( ruleEString ) ) this_END_8= RULE_END )
            {
            // InternalKinematicsParser.g:1087:2: (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= BaseAttachment ( ( ruleEString ) ) otherlv_6= FlangeAttachment ( ( ruleEString ) ) this_END_8= RULE_END )
            // InternalKinematicsParser.g:1088:3: otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= BaseAttachment ( ( ruleEString ) ) otherlv_6= FlangeAttachment ( ( ruleEString ) ) this_END_8= RULE_END
            {
            otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectionAccess().getHyphenMinusKeyword_0());
            		
            otherlv_1=(Token)match(input,Name,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectionAccess().getNameKeyword_1());
            		
            // InternalKinematicsParser.g:1096:3: ( (lv_name_2_0= ruleEString ) )
            // InternalKinematicsParser.g:1097:4: (lv_name_2_0= ruleEString )
            {
            // InternalKinematicsParser.g:1097:4: (lv_name_2_0= ruleEString )
            // InternalKinematicsParser.g:1098:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConnectionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_30); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getConnectionAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,BaseAttachment,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getConnectionAccess().getBaseAttachmentKeyword_4());
            		
            // InternalKinematicsParser.g:1123:3: ( ( ruleEString ) )
            // InternalKinematicsParser.g:1124:4: ( ruleEString )
            {
            // InternalKinematicsParser.g:1124:4: ( ruleEString )
            // InternalKinematicsParser.g:1125:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectionAccess().getBaseAttachmentBaseAttachmentCrossReference_5_0());
            				
            pushFollow(FOLLOW_31);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,FlangeAttachment,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getConnectionAccess().getFlangeAttachmentKeyword_6());
            		
            // InternalKinematicsParser.g:1143:3: ( ( ruleEString ) )
            // InternalKinematicsParser.g:1144:4: ( ruleEString )
            {
            // InternalKinematicsParser.g:1144:4: ( ruleEString )
            // InternalKinematicsParser.g:1145:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectionAccess().getFlangeAttachmentFlangeAttachmentCrossReference_7_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_8, grammarAccess.getConnectionAccess().getENDTerminalRuleCall_8());
            		

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
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleJoint"
    // InternalKinematicsParser.g:1167:1: entryRuleJoint returns [EObject current=null] : iv_ruleJoint= ruleJoint EOF ;
    public final EObject entryRuleJoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoint = null;


        try {
            // InternalKinematicsParser.g:1167:46: (iv_ruleJoint= ruleJoint EOF )
            // InternalKinematicsParser.g:1168:2: iv_ruleJoint= ruleJoint EOF
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
    // InternalKinematicsParser.g:1174:1: ruleJoint returns [EObject current=null] : (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN (otherlv_4= Type ( (lv_type_5_0= RULE_JOINTTYPE ) ) ) (otherlv_6= Parent ( (lv_parent_7_0= ruleParent ) ) ) (otherlv_8= Child ( (lv_child_9_0= ruleChild ) ) ) (otherlv_10= Origin ( (lv_origin_11_0= rulePose ) ) ) (otherlv_12= Axis ( (lv_axis_13_0= ruleAxis ) ) )? (otherlv_14= Limit ( (lv_limit_15_0= ruleLimit ) ) )? this_END_16= RULE_END ) ;
    public final EObject ruleJoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token this_END_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parent_7_0 = null;

        EObject lv_child_9_0 = null;

        EObject lv_origin_11_0 = null;

        EObject lv_axis_13_0 = null;

        EObject lv_limit_15_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:1180:2: ( (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN (otherlv_4= Type ( (lv_type_5_0= RULE_JOINTTYPE ) ) ) (otherlv_6= Parent ( (lv_parent_7_0= ruleParent ) ) ) (otherlv_8= Child ( (lv_child_9_0= ruleChild ) ) ) (otherlv_10= Origin ( (lv_origin_11_0= rulePose ) ) ) (otherlv_12= Axis ( (lv_axis_13_0= ruleAxis ) ) )? (otherlv_14= Limit ( (lv_limit_15_0= ruleLimit ) ) )? this_END_16= RULE_END ) )
            // InternalKinematicsParser.g:1181:2: (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN (otherlv_4= Type ( (lv_type_5_0= RULE_JOINTTYPE ) ) ) (otherlv_6= Parent ( (lv_parent_7_0= ruleParent ) ) ) (otherlv_8= Child ( (lv_child_9_0= ruleChild ) ) ) (otherlv_10= Origin ( (lv_origin_11_0= rulePose ) ) ) (otherlv_12= Axis ( (lv_axis_13_0= ruleAxis ) ) )? (otherlv_14= Limit ( (lv_limit_15_0= ruleLimit ) ) )? this_END_16= RULE_END )
            {
            // InternalKinematicsParser.g:1181:2: (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN (otherlv_4= Type ( (lv_type_5_0= RULE_JOINTTYPE ) ) ) (otherlv_6= Parent ( (lv_parent_7_0= ruleParent ) ) ) (otherlv_8= Child ( (lv_child_9_0= ruleChild ) ) ) (otherlv_10= Origin ( (lv_origin_11_0= rulePose ) ) ) (otherlv_12= Axis ( (lv_axis_13_0= ruleAxis ) ) )? (otherlv_14= Limit ( (lv_limit_15_0= ruleLimit ) ) )? this_END_16= RULE_END )
            // InternalKinematicsParser.g:1182:3: otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN (otherlv_4= Type ( (lv_type_5_0= RULE_JOINTTYPE ) ) ) (otherlv_6= Parent ( (lv_parent_7_0= ruleParent ) ) ) (otherlv_8= Child ( (lv_child_9_0= ruleChild ) ) ) (otherlv_10= Origin ( (lv_origin_11_0= rulePose ) ) ) (otherlv_12= Axis ( (lv_axis_13_0= ruleAxis ) ) )? (otherlv_14= Limit ( (lv_limit_15_0= ruleLimit ) ) )? this_END_16= RULE_END
            {
            otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getJointAccess().getHyphenMinusKeyword_0());
            		
            otherlv_1=(Token)match(input,Name,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getJointAccess().getNameKeyword_1());
            		
            // InternalKinematicsParser.g:1190:3: ( (lv_name_2_0= ruleEString ) )
            // InternalKinematicsParser.g:1191:4: (lv_name_2_0= ruleEString )
            {
            // InternalKinematicsParser.g:1191:4: (lv_name_2_0= ruleEString )
            // InternalKinematicsParser.g:1192:5: lv_name_2_0= ruleEString
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

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_19); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getJointAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalKinematicsParser.g:1213:3: (otherlv_4= Type ( (lv_type_5_0= RULE_JOINTTYPE ) ) )
            // InternalKinematicsParser.g:1214:4: otherlv_4= Type ( (lv_type_5_0= RULE_JOINTTYPE ) )
            {
            otherlv_4=(Token)match(input,Type,FOLLOW_32); 

            				newLeafNode(otherlv_4, grammarAccess.getJointAccess().getTypeKeyword_4_0());
            			
            // InternalKinematicsParser.g:1218:4: ( (lv_type_5_0= RULE_JOINTTYPE ) )
            // InternalKinematicsParser.g:1219:5: (lv_type_5_0= RULE_JOINTTYPE )
            {
            // InternalKinematicsParser.g:1219:5: (lv_type_5_0= RULE_JOINTTYPE )
            // InternalKinematicsParser.g:1220:6: lv_type_5_0= RULE_JOINTTYPE
            {
            lv_type_5_0=(Token)match(input,RULE_JOINTTYPE,FOLLOW_29); 

            						newLeafNode(lv_type_5_0, grammarAccess.getJointAccess().getTypeJOINTTYPETerminalRuleCall_4_1_0());
            					

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


            }

            // InternalKinematicsParser.g:1237:3: (otherlv_6= Parent ( (lv_parent_7_0= ruleParent ) ) )
            // InternalKinematicsParser.g:1238:4: otherlv_6= Parent ( (lv_parent_7_0= ruleParent ) )
            {
            otherlv_6=(Token)match(input,Parent,FOLLOW_3); 

            				newLeafNode(otherlv_6, grammarAccess.getJointAccess().getParentKeyword_5_0());
            			
            // InternalKinematicsParser.g:1242:4: ( (lv_parent_7_0= ruleParent ) )
            // InternalKinematicsParser.g:1243:5: (lv_parent_7_0= ruleParent )
            {
            // InternalKinematicsParser.g:1243:5: (lv_parent_7_0= ruleParent )
            // InternalKinematicsParser.g:1244:6: lv_parent_7_0= ruleParent
            {

            						newCompositeNode(grammarAccess.getJointAccess().getParentParentParserRuleCall_5_1_0());
            					
            pushFollow(FOLLOW_33);
            lv_parent_7_0=ruleParent();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getJointRule());
            						}
            						set(
            							current,
            							"parent",
            							lv_parent_7_0,
            							"de.fraunhofer.ipa.kinematics.Kinematics.Parent");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalKinematicsParser.g:1262:3: (otherlv_8= Child ( (lv_child_9_0= ruleChild ) ) )
            // InternalKinematicsParser.g:1263:4: otherlv_8= Child ( (lv_child_9_0= ruleChild ) )
            {
            otherlv_8=(Token)match(input,Child,FOLLOW_3); 

            				newLeafNode(otherlv_8, grammarAccess.getJointAccess().getChildKeyword_6_0());
            			
            // InternalKinematicsParser.g:1267:4: ( (lv_child_9_0= ruleChild ) )
            // InternalKinematicsParser.g:1268:5: (lv_child_9_0= ruleChild )
            {
            // InternalKinematicsParser.g:1268:5: (lv_child_9_0= ruleChild )
            // InternalKinematicsParser.g:1269:6: lv_child_9_0= ruleChild
            {

            						newCompositeNode(grammarAccess.getJointAccess().getChildChildParserRuleCall_6_1_0());
            					
            pushFollow(FOLLOW_28);
            lv_child_9_0=ruleChild();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getJointRule());
            						}
            						set(
            							current,
            							"child",
            							lv_child_9_0,
            							"de.fraunhofer.ipa.kinematics.Kinematics.Child");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalKinematicsParser.g:1287:3: (otherlv_10= Origin ( (lv_origin_11_0= rulePose ) ) )
            // InternalKinematicsParser.g:1288:4: otherlv_10= Origin ( (lv_origin_11_0= rulePose ) )
            {
            otherlv_10=(Token)match(input,Origin,FOLLOW_3); 

            				newLeafNode(otherlv_10, grammarAccess.getJointAccess().getOriginKeyword_7_0());
            			
            // InternalKinematicsParser.g:1292:4: ( (lv_origin_11_0= rulePose ) )
            // InternalKinematicsParser.g:1293:5: (lv_origin_11_0= rulePose )
            {
            // InternalKinematicsParser.g:1293:5: (lv_origin_11_0= rulePose )
            // InternalKinematicsParser.g:1294:6: lv_origin_11_0= rulePose
            {

            						newCompositeNode(grammarAccess.getJointAccess().getOriginPoseParserRuleCall_7_1_0());
            					
            pushFollow(FOLLOW_34);
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


            }

            // InternalKinematicsParser.g:1312:3: (otherlv_12= Axis ( (lv_axis_13_0= ruleAxis ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Axis) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalKinematicsParser.g:1313:4: otherlv_12= Axis ( (lv_axis_13_0= ruleAxis ) )
                    {
                    otherlv_12=(Token)match(input,Axis,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getJointAccess().getAxisKeyword_8_0());
                    			
                    // InternalKinematicsParser.g:1317:4: ( (lv_axis_13_0= ruleAxis ) )
                    // InternalKinematicsParser.g:1318:5: (lv_axis_13_0= ruleAxis )
                    {
                    // InternalKinematicsParser.g:1318:5: (lv_axis_13_0= ruleAxis )
                    // InternalKinematicsParser.g:1319:6: lv_axis_13_0= ruleAxis
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_35);
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

            // InternalKinematicsParser.g:1337:3: (otherlv_14= Limit ( (lv_limit_15_0= ruleLimit ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Limit) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalKinematicsParser.g:1338:4: otherlv_14= Limit ( (lv_limit_15_0= ruleLimit ) )
                    {
                    otherlv_14=(Token)match(input,Limit,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getJointAccess().getLimitKeyword_9_0());
                    			
                    // InternalKinematicsParser.g:1342:4: ( (lv_limit_15_0= ruleLimit ) )
                    // InternalKinematicsParser.g:1343:5: (lv_limit_15_0= ruleLimit )
                    {
                    // InternalKinematicsParser.g:1343:5: (lv_limit_15_0= ruleLimit )
                    // InternalKinematicsParser.g:1344:6: lv_limit_15_0= ruleLimit
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

            			newLeafNode(this_END_16, grammarAccess.getJointAccess().getENDTerminalRuleCall_10());
            		

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


    // $ANTLR start "entryRuleParent"
    // InternalKinematicsParser.g:1370:1: entryRuleParent returns [EObject current=null] : iv_ruleParent= ruleParent EOF ;
    public final EObject entryRuleParent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParent = null;


        try {
            // InternalKinematicsParser.g:1370:47: (iv_ruleParent= ruleParent EOF )
            // InternalKinematicsParser.g:1371:2: iv_ruleParent= ruleParent EOF
            {
             newCompositeNode(grammarAccess.getParentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParent=ruleParent();

            state._fsp--;

             current =iv_ruleParent; 
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
    // $ANTLR end "entryRuleParent"


    // $ANTLR start "ruleParent"
    // InternalKinematicsParser.g:1377:1: ruleParent returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN otherlv_1= Link ( (lv_link_2_0= ruleEString ) ) this_END_3= RULE_END ) ;
    public final EObject ruleParent() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token otherlv_1=null;
        Token this_END_3=null;
        AntlrDatatypeRuleToken lv_link_2_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:1383:2: ( (this_BEGIN_0= RULE_BEGIN otherlv_1= Link ( (lv_link_2_0= ruleEString ) ) this_END_3= RULE_END ) )
            // InternalKinematicsParser.g:1384:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Link ( (lv_link_2_0= ruleEString ) ) this_END_3= RULE_END )
            {
            // InternalKinematicsParser.g:1384:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Link ( (lv_link_2_0= ruleEString ) ) this_END_3= RULE_END )
            // InternalKinematicsParser.g:1385:3: this_BEGIN_0= RULE_BEGIN otherlv_1= Link ( (lv_link_2_0= ruleEString ) ) this_END_3= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_36); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getParentAccess().getBEGINTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,Link,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getParentAccess().getLinkKeyword_1());
            		
            // InternalKinematicsParser.g:1393:3: ( (lv_link_2_0= ruleEString ) )
            // InternalKinematicsParser.g:1394:4: (lv_link_2_0= ruleEString )
            {
            // InternalKinematicsParser.g:1394:4: (lv_link_2_0= ruleEString )
            // InternalKinematicsParser.g:1395:5: lv_link_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParentAccess().getLinkEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_link_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParentRule());
            					}
            					set(
            						current,
            						"link",
            						lv_link_2_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_3, grammarAccess.getParentAccess().getENDTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleParent"


    // $ANTLR start "entryRuleChild"
    // InternalKinematicsParser.g:1420:1: entryRuleChild returns [EObject current=null] : iv_ruleChild= ruleChild EOF ;
    public final EObject entryRuleChild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild = null;


        try {
            // InternalKinematicsParser.g:1420:46: (iv_ruleChild= ruleChild EOF )
            // InternalKinematicsParser.g:1421:2: iv_ruleChild= ruleChild EOF
            {
             newCompositeNode(grammarAccess.getChildRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChild=ruleChild();

            state._fsp--;

             current =iv_ruleChild; 
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
    // $ANTLR end "entryRuleChild"


    // $ANTLR start "ruleChild"
    // InternalKinematicsParser.g:1427:1: ruleChild returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN otherlv_1= Link ( (lv_link_2_0= ruleEString ) ) this_END_3= RULE_END ) ;
    public final EObject ruleChild() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token otherlv_1=null;
        Token this_END_3=null;
        AntlrDatatypeRuleToken lv_link_2_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:1433:2: ( (this_BEGIN_0= RULE_BEGIN otherlv_1= Link ( (lv_link_2_0= ruleEString ) ) this_END_3= RULE_END ) )
            // InternalKinematicsParser.g:1434:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Link ( (lv_link_2_0= ruleEString ) ) this_END_3= RULE_END )
            {
            // InternalKinematicsParser.g:1434:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Link ( (lv_link_2_0= ruleEString ) ) this_END_3= RULE_END )
            // InternalKinematicsParser.g:1435:3: this_BEGIN_0= RULE_BEGIN otherlv_1= Link ( (lv_link_2_0= ruleEString ) ) this_END_3= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_36); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getChildAccess().getBEGINTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,Link,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getChildAccess().getLinkKeyword_1());
            		
            // InternalKinematicsParser.g:1443:3: ( (lv_link_2_0= ruleEString ) )
            // InternalKinematicsParser.g:1444:4: (lv_link_2_0= ruleEString )
            {
            // InternalKinematicsParser.g:1444:4: (lv_link_2_0= ruleEString )
            // InternalKinematicsParser.g:1445:5: lv_link_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getChildAccess().getLinkEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_link_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChildRule());
            					}
            					set(
            						current,
            						"link",
            						lv_link_2_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_3, grammarAccess.getChildAccess().getENDTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleChild"


    // $ANTLR start "entryRuleLink"
    // InternalKinematicsParser.g:1470:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalKinematicsParser.g:1470:45: (iv_ruleLink= ruleLink EOF )
            // InternalKinematicsParser.g:1471:2: iv_ruleLink= ruleLink EOF
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
    // InternalKinematicsParser.g:1477:1: ruleLink returns [EObject current=null] : (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) (this_BEGIN_3= RULE_BEGIN (otherlv_4= Inertial ( (lv_inertial_5_0= ruleInertial ) ) )? (otherlv_6= Visual ( (lv_visual_7_0= ruleVisual ) ) )? (otherlv_8= Collision ( (lv_collision_9_0= ruleCollision ) ) )? this_END_10= RULE_END )? ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_END_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_inertial_5_0 = null;

        EObject lv_visual_7_0 = null;

        EObject lv_collision_9_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:1483:2: ( (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) (this_BEGIN_3= RULE_BEGIN (otherlv_4= Inertial ( (lv_inertial_5_0= ruleInertial ) ) )? (otherlv_6= Visual ( (lv_visual_7_0= ruleVisual ) ) )? (otherlv_8= Collision ( (lv_collision_9_0= ruleCollision ) ) )? this_END_10= RULE_END )? ) )
            // InternalKinematicsParser.g:1484:2: (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) (this_BEGIN_3= RULE_BEGIN (otherlv_4= Inertial ( (lv_inertial_5_0= ruleInertial ) ) )? (otherlv_6= Visual ( (lv_visual_7_0= ruleVisual ) ) )? (otherlv_8= Collision ( (lv_collision_9_0= ruleCollision ) ) )? this_END_10= RULE_END )? )
            {
            // InternalKinematicsParser.g:1484:2: (otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) (this_BEGIN_3= RULE_BEGIN (otherlv_4= Inertial ( (lv_inertial_5_0= ruleInertial ) ) )? (otherlv_6= Visual ( (lv_visual_7_0= ruleVisual ) ) )? (otherlv_8= Collision ( (lv_collision_9_0= ruleCollision ) ) )? this_END_10= RULE_END )? )
            // InternalKinematicsParser.g:1485:3: otherlv_0= HyphenMinus otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) (this_BEGIN_3= RULE_BEGIN (otherlv_4= Inertial ( (lv_inertial_5_0= ruleInertial ) ) )? (otherlv_6= Visual ( (lv_visual_7_0= ruleVisual ) ) )? (otherlv_8= Collision ( (lv_collision_9_0= ruleCollision ) ) )? this_END_10= RULE_END )?
            {
            otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getHyphenMinusKeyword_0());
            		
            otherlv_1=(Token)match(input,Name,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getNameKeyword_1());
            		
            // InternalKinematicsParser.g:1493:3: ( (lv_name_2_0= ruleEString ) )
            // InternalKinematicsParser.g:1494:4: (lv_name_2_0= ruleEString )
            {
            // InternalKinematicsParser.g:1494:4: (lv_name_2_0= ruleEString )
            // InternalKinematicsParser.g:1495:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_37);
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

            // InternalKinematicsParser.g:1512:3: (this_BEGIN_3= RULE_BEGIN (otherlv_4= Inertial ( (lv_inertial_5_0= ruleInertial ) ) )? (otherlv_6= Visual ( (lv_visual_7_0= ruleVisual ) ) )? (otherlv_8= Collision ( (lv_collision_9_0= ruleCollision ) ) )? this_END_10= RULE_END )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_BEGIN) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalKinematicsParser.g:1513:4: this_BEGIN_3= RULE_BEGIN (otherlv_4= Inertial ( (lv_inertial_5_0= ruleInertial ) ) )? (otherlv_6= Visual ( (lv_visual_7_0= ruleVisual ) ) )? (otherlv_8= Collision ( (lv_collision_9_0= ruleCollision ) ) )? this_END_10= RULE_END
                    {
                    this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_38); 

                    				newLeafNode(this_BEGIN_3, grammarAccess.getLinkAccess().getBEGINTerminalRuleCall_3_0());
                    			
                    // InternalKinematicsParser.g:1517:4: (otherlv_4= Inertial ( (lv_inertial_5_0= ruleInertial ) ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==Inertial) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalKinematicsParser.g:1518:5: otherlv_4= Inertial ( (lv_inertial_5_0= ruleInertial ) )
                            {
                            otherlv_4=(Token)match(input,Inertial,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getInertialKeyword_3_1_0());
                            				
                            // InternalKinematicsParser.g:1522:5: ( (lv_inertial_5_0= ruleInertial ) )
                            // InternalKinematicsParser.g:1523:6: (lv_inertial_5_0= ruleInertial )
                            {
                            // InternalKinematicsParser.g:1523:6: (lv_inertial_5_0= ruleInertial )
                            // InternalKinematicsParser.g:1524:7: lv_inertial_5_0= ruleInertial
                            {

                            							newCompositeNode(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_39);
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

                    // InternalKinematicsParser.g:1542:4: (otherlv_6= Visual ( (lv_visual_7_0= ruleVisual ) ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==Visual) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalKinematicsParser.g:1543:5: otherlv_6= Visual ( (lv_visual_7_0= ruleVisual ) )
                            {
                            otherlv_6=(Token)match(input,Visual,FOLLOW_3); 

                            					newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getVisualKeyword_3_2_0());
                            				
                            // InternalKinematicsParser.g:1547:5: ( (lv_visual_7_0= ruleVisual ) )
                            // InternalKinematicsParser.g:1548:6: (lv_visual_7_0= ruleVisual )
                            {
                            // InternalKinematicsParser.g:1548:6: (lv_visual_7_0= ruleVisual )
                            // InternalKinematicsParser.g:1549:7: lv_visual_7_0= ruleVisual
                            {

                            							newCompositeNode(grammarAccess.getLinkAccess().getVisualVisualParserRuleCall_3_2_1_0());
                            						
                            pushFollow(FOLLOW_40);
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

                    // InternalKinematicsParser.g:1567:4: (otherlv_8= Collision ( (lv_collision_9_0= ruleCollision ) ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==Collision) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalKinematicsParser.g:1568:5: otherlv_8= Collision ( (lv_collision_9_0= ruleCollision ) )
                            {
                            otherlv_8=(Token)match(input,Collision,FOLLOW_3); 

                            					newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getCollisionKeyword_3_3_0());
                            				
                            // InternalKinematicsParser.g:1572:5: ( (lv_collision_9_0= ruleCollision ) )
                            // InternalKinematicsParser.g:1573:6: (lv_collision_9_0= ruleCollision )
                            {
                            // InternalKinematicsParser.g:1573:6: (lv_collision_9_0= ruleCollision )
                            // InternalKinematicsParser.g:1574:7: lv_collision_9_0= ruleCollision
                            {

                            							newCompositeNode(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_3_3_1_0());
                            						
                            pushFollow(FOLLOW_18);
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

                    				newLeafNode(this_END_10, grammarAccess.getLinkAccess().getENDTerminalRuleCall_3_4());
                    			

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
    // InternalKinematicsParser.g:1601:1: entryRulePose returns [EObject current=null] : iv_rulePose= rulePose EOF ;
    public final EObject entryRulePose() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePose = null;


        try {
            // InternalKinematicsParser.g:1601:45: (iv_rulePose= rulePose EOF )
            // InternalKinematicsParser.g:1602:2: iv_rulePose= rulePose EOF
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
    // InternalKinematicsParser.g:1608:1: rulePose returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Rpy otherlv_3= LeftSquareBracket ( (lv_rpy_4_0= RULE_DOUBLE ) ) (otherlv_5= Comma ( (lv_rpy_6_0= RULE_DOUBLE ) ) )* otherlv_7= RightSquareBracket )? (otherlv_8= Xyz otherlv_9= LeftSquareBracket ( (lv_xyz_10_0= RULE_DOUBLE ) ) (otherlv_11= Comma ( (lv_xyz_12_0= RULE_DOUBLE ) ) )* otherlv_13= RightSquareBracket )? this_END_14= RULE_END ) ;
    public final EObject rulePose() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_rpy_4_0=null;
        Token otherlv_5=null;
        Token lv_rpy_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_xyz_10_0=null;
        Token otherlv_11=null;
        Token lv_xyz_12_0=null;
        Token otherlv_13=null;
        Token this_END_14=null;


        	enterRule();

        try {
            // InternalKinematicsParser.g:1614:2: ( ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Rpy otherlv_3= LeftSquareBracket ( (lv_rpy_4_0= RULE_DOUBLE ) ) (otherlv_5= Comma ( (lv_rpy_6_0= RULE_DOUBLE ) ) )* otherlv_7= RightSquareBracket )? (otherlv_8= Xyz otherlv_9= LeftSquareBracket ( (lv_xyz_10_0= RULE_DOUBLE ) ) (otherlv_11= Comma ( (lv_xyz_12_0= RULE_DOUBLE ) ) )* otherlv_13= RightSquareBracket )? this_END_14= RULE_END ) )
            // InternalKinematicsParser.g:1615:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Rpy otherlv_3= LeftSquareBracket ( (lv_rpy_4_0= RULE_DOUBLE ) ) (otherlv_5= Comma ( (lv_rpy_6_0= RULE_DOUBLE ) ) )* otherlv_7= RightSquareBracket )? (otherlv_8= Xyz otherlv_9= LeftSquareBracket ( (lv_xyz_10_0= RULE_DOUBLE ) ) (otherlv_11= Comma ( (lv_xyz_12_0= RULE_DOUBLE ) ) )* otherlv_13= RightSquareBracket )? this_END_14= RULE_END )
            {
            // InternalKinematicsParser.g:1615:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Rpy otherlv_3= LeftSquareBracket ( (lv_rpy_4_0= RULE_DOUBLE ) ) (otherlv_5= Comma ( (lv_rpy_6_0= RULE_DOUBLE ) ) )* otherlv_7= RightSquareBracket )? (otherlv_8= Xyz otherlv_9= LeftSquareBracket ( (lv_xyz_10_0= RULE_DOUBLE ) ) (otherlv_11= Comma ( (lv_xyz_12_0= RULE_DOUBLE ) ) )* otherlv_13= RightSquareBracket )? this_END_14= RULE_END )
            // InternalKinematicsParser.g:1616:3: () this_BEGIN_1= RULE_BEGIN (otherlv_2= Rpy otherlv_3= LeftSquareBracket ( (lv_rpy_4_0= RULE_DOUBLE ) ) (otherlv_5= Comma ( (lv_rpy_6_0= RULE_DOUBLE ) ) )* otherlv_7= RightSquareBracket )? (otherlv_8= Xyz otherlv_9= LeftSquareBracket ( (lv_xyz_10_0= RULE_DOUBLE ) ) (otherlv_11= Comma ( (lv_xyz_12_0= RULE_DOUBLE ) ) )* otherlv_13= RightSquareBracket )? this_END_14= RULE_END
            {
            // InternalKinematicsParser.g:1616:3: ()
            // InternalKinematicsParser.g:1617:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPoseAccess().getPoseAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_41); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getPoseAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalKinematicsParser.g:1627:3: (otherlv_2= Rpy otherlv_3= LeftSquareBracket ( (lv_rpy_4_0= RULE_DOUBLE ) ) (otherlv_5= Comma ( (lv_rpy_6_0= RULE_DOUBLE ) ) )* otherlv_7= RightSquareBracket )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Rpy) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalKinematicsParser.g:1628:4: otherlv_2= Rpy otherlv_3= LeftSquareBracket ( (lv_rpy_4_0= RULE_DOUBLE ) ) (otherlv_5= Comma ( (lv_rpy_6_0= RULE_DOUBLE ) ) )* otherlv_7= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,Rpy,FOLLOW_42); 

                    				newLeafNode(otherlv_2, grammarAccess.getPoseAccess().getRpyKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_43); 

                    				newLeafNode(otherlv_3, grammarAccess.getPoseAccess().getLeftSquareBracketKeyword_2_1());
                    			
                    // InternalKinematicsParser.g:1636:4: ( (lv_rpy_4_0= RULE_DOUBLE ) )
                    // InternalKinematicsParser.g:1637:5: (lv_rpy_4_0= RULE_DOUBLE )
                    {
                    // InternalKinematicsParser.g:1637:5: (lv_rpy_4_0= RULE_DOUBLE )
                    // InternalKinematicsParser.g:1638:6: lv_rpy_4_0= RULE_DOUBLE
                    {
                    lv_rpy_4_0=(Token)match(input,RULE_DOUBLE,FOLLOW_44); 

                    						newLeafNode(lv_rpy_4_0, grammarAccess.getPoseAccess().getRpyDOUBLETerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPoseRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"rpy",
                    							lv_rpy_4_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.DOUBLE");
                    					

                    }


                    }

                    // InternalKinematicsParser.g:1654:4: (otherlv_5= Comma ( (lv_rpy_6_0= RULE_DOUBLE ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==Comma) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalKinematicsParser.g:1655:5: otherlv_5= Comma ( (lv_rpy_6_0= RULE_DOUBLE ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_43); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getPoseAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalKinematicsParser.g:1659:5: ( (lv_rpy_6_0= RULE_DOUBLE ) )
                    	    // InternalKinematicsParser.g:1660:6: (lv_rpy_6_0= RULE_DOUBLE )
                    	    {
                    	    // InternalKinematicsParser.g:1660:6: (lv_rpy_6_0= RULE_DOUBLE )
                    	    // InternalKinematicsParser.g:1661:7: lv_rpy_6_0= RULE_DOUBLE
                    	    {
                    	    lv_rpy_6_0=(Token)match(input,RULE_DOUBLE,FOLLOW_44); 

                    	    							newLeafNode(lv_rpy_6_0, grammarAccess.getPoseAccess().getRpyDOUBLETerminalRuleCall_2_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPoseRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"rpy",
                    	    								lv_rpy_6_0,
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.DOUBLE");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,RightSquareBracket,FOLLOW_45); 

                    				newLeafNode(otherlv_7, grammarAccess.getPoseAccess().getRightSquareBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalKinematicsParser.g:1683:3: (otherlv_8= Xyz otherlv_9= LeftSquareBracket ( (lv_xyz_10_0= RULE_DOUBLE ) ) (otherlv_11= Comma ( (lv_xyz_12_0= RULE_DOUBLE ) ) )* otherlv_13= RightSquareBracket )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Xyz) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKinematicsParser.g:1684:4: otherlv_8= Xyz otherlv_9= LeftSquareBracket ( (lv_xyz_10_0= RULE_DOUBLE ) ) (otherlv_11= Comma ( (lv_xyz_12_0= RULE_DOUBLE ) ) )* otherlv_13= RightSquareBracket
                    {
                    otherlv_8=(Token)match(input,Xyz,FOLLOW_42); 

                    				newLeafNode(otherlv_8, grammarAccess.getPoseAccess().getXyzKeyword_3_0());
                    			
                    otherlv_9=(Token)match(input,LeftSquareBracket,FOLLOW_43); 

                    				newLeafNode(otherlv_9, grammarAccess.getPoseAccess().getLeftSquareBracketKeyword_3_1());
                    			
                    // InternalKinematicsParser.g:1692:4: ( (lv_xyz_10_0= RULE_DOUBLE ) )
                    // InternalKinematicsParser.g:1693:5: (lv_xyz_10_0= RULE_DOUBLE )
                    {
                    // InternalKinematicsParser.g:1693:5: (lv_xyz_10_0= RULE_DOUBLE )
                    // InternalKinematicsParser.g:1694:6: lv_xyz_10_0= RULE_DOUBLE
                    {
                    lv_xyz_10_0=(Token)match(input,RULE_DOUBLE,FOLLOW_44); 

                    						newLeafNode(lv_xyz_10_0, grammarAccess.getPoseAccess().getXyzDOUBLETerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPoseRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"xyz",
                    							lv_xyz_10_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.DOUBLE");
                    					

                    }


                    }

                    // InternalKinematicsParser.g:1710:4: (otherlv_11= Comma ( (lv_xyz_12_0= RULE_DOUBLE ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==Comma) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalKinematicsParser.g:1711:5: otherlv_11= Comma ( (lv_xyz_12_0= RULE_DOUBLE ) )
                    	    {
                    	    otherlv_11=(Token)match(input,Comma,FOLLOW_43); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getPoseAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalKinematicsParser.g:1715:5: ( (lv_xyz_12_0= RULE_DOUBLE ) )
                    	    // InternalKinematicsParser.g:1716:6: (lv_xyz_12_0= RULE_DOUBLE )
                    	    {
                    	    // InternalKinematicsParser.g:1716:6: (lv_xyz_12_0= RULE_DOUBLE )
                    	    // InternalKinematicsParser.g:1717:7: lv_xyz_12_0= RULE_DOUBLE
                    	    {
                    	    lv_xyz_12_0=(Token)match(input,RULE_DOUBLE,FOLLOW_44); 

                    	    							newLeafNode(lv_xyz_12_0, grammarAccess.getPoseAccess().getXyzDOUBLETerminalRuleCall_3_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPoseRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"xyz",
                    	    								lv_xyz_12_0,
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.DOUBLE");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,RightSquareBracket,FOLLOW_18); 

                    				newLeafNode(otherlv_13, grammarAccess.getPoseAccess().getRightSquareBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            this_END_14=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_14, grammarAccess.getPoseAccess().getENDTerminalRuleCall_4());
            		

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
    // InternalKinematicsParser.g:1747:1: entryRuleAxis returns [EObject current=null] : iv_ruleAxis= ruleAxis EOF ;
    public final EObject entryRuleAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxis = null;


        try {
            // InternalKinematicsParser.g:1747:45: (iv_ruleAxis= ruleAxis EOF )
            // InternalKinematicsParser.g:1748:2: iv_ruleAxis= ruleAxis EOF
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
    // InternalKinematicsParser.g:1754:1: ruleAxis returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Xyz ( (lv_xyz_3_0= ruleEString ) ) )? this_END_4= RULE_END ) ;
    public final EObject ruleAxis() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_xyz_3_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:1760:2: ( ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Xyz ( (lv_xyz_3_0= ruleEString ) ) )? this_END_4= RULE_END ) )
            // InternalKinematicsParser.g:1761:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Xyz ( (lv_xyz_3_0= ruleEString ) ) )? this_END_4= RULE_END )
            {
            // InternalKinematicsParser.g:1761:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Xyz ( (lv_xyz_3_0= ruleEString ) ) )? this_END_4= RULE_END )
            // InternalKinematicsParser.g:1762:3: () this_BEGIN_1= RULE_BEGIN (otherlv_2= Xyz ( (lv_xyz_3_0= ruleEString ) ) )? this_END_4= RULE_END
            {
            // InternalKinematicsParser.g:1762:3: ()
            // InternalKinematicsParser.g:1763:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAxisAccess().getAxisAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_45); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getAxisAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalKinematicsParser.g:1773:3: (otherlv_2= Xyz ( (lv_xyz_3_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Xyz) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalKinematicsParser.g:1774:4: otherlv_2= Xyz ( (lv_xyz_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Xyz,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getAxisAccess().getXyzKeyword_2_0());
                    			
                    // InternalKinematicsParser.g:1778:4: ( (lv_xyz_3_0= ruleEString ) )
                    // InternalKinematicsParser.g:1779:5: (lv_xyz_3_0= ruleEString )
                    {
                    // InternalKinematicsParser.g:1779:5: (lv_xyz_3_0= ruleEString )
                    // InternalKinematicsParser.g:1780:6: lv_xyz_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAxisAccess().getXyzEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_xyz_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAxisRule());
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

            			newLeafNode(this_END_4, grammarAccess.getAxisAccess().getENDTerminalRuleCall_3());
            		

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


    // $ANTLR start "entryRuleLimit"
    // InternalKinematicsParser.g:1806:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // InternalKinematicsParser.g:1806:46: (iv_ruleLimit= ruleLimit EOF )
            // InternalKinematicsParser.g:1807:2: iv_ruleLimit= ruleLimit EOF
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
    // InternalKinematicsParser.g:1813:1: ruleLimit returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Effort ( (lv_effort_3_0= RULE_DOUBLE ) ) )? (otherlv_4= Lower ( (lv_lower_5_0= RULE_DOUBLE ) ) )? (otherlv_6= Upper ( (lv_upper_7_0= RULE_DOUBLE ) ) )? (otherlv_8= Velocity ( (lv_velocity_9_0= RULE_DOUBLE ) ) )? this_END_10= RULE_END ) ;
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
            // InternalKinematicsParser.g:1819:2: ( ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Effort ( (lv_effort_3_0= RULE_DOUBLE ) ) )? (otherlv_4= Lower ( (lv_lower_5_0= RULE_DOUBLE ) ) )? (otherlv_6= Upper ( (lv_upper_7_0= RULE_DOUBLE ) ) )? (otherlv_8= Velocity ( (lv_velocity_9_0= RULE_DOUBLE ) ) )? this_END_10= RULE_END ) )
            // InternalKinematicsParser.g:1820:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Effort ( (lv_effort_3_0= RULE_DOUBLE ) ) )? (otherlv_4= Lower ( (lv_lower_5_0= RULE_DOUBLE ) ) )? (otherlv_6= Upper ( (lv_upper_7_0= RULE_DOUBLE ) ) )? (otherlv_8= Velocity ( (lv_velocity_9_0= RULE_DOUBLE ) ) )? this_END_10= RULE_END )
            {
            // InternalKinematicsParser.g:1820:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Effort ( (lv_effort_3_0= RULE_DOUBLE ) ) )? (otherlv_4= Lower ( (lv_lower_5_0= RULE_DOUBLE ) ) )? (otherlv_6= Upper ( (lv_upper_7_0= RULE_DOUBLE ) ) )? (otherlv_8= Velocity ( (lv_velocity_9_0= RULE_DOUBLE ) ) )? this_END_10= RULE_END )
            // InternalKinematicsParser.g:1821:3: () this_BEGIN_1= RULE_BEGIN (otherlv_2= Effort ( (lv_effort_3_0= RULE_DOUBLE ) ) )? (otherlv_4= Lower ( (lv_lower_5_0= RULE_DOUBLE ) ) )? (otherlv_6= Upper ( (lv_upper_7_0= RULE_DOUBLE ) ) )? (otherlv_8= Velocity ( (lv_velocity_9_0= RULE_DOUBLE ) ) )? this_END_10= RULE_END
            {
            // InternalKinematicsParser.g:1821:3: ()
            // InternalKinematicsParser.g:1822:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLimitAccess().getLimitAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_46); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getLimitAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalKinematicsParser.g:1832:3: (otherlv_2= Effort ( (lv_effort_3_0= RULE_DOUBLE ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Effort) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalKinematicsParser.g:1833:4: otherlv_2= Effort ( (lv_effort_3_0= RULE_DOUBLE ) )
                    {
                    otherlv_2=(Token)match(input,Effort,FOLLOW_43); 

                    				newLeafNode(otherlv_2, grammarAccess.getLimitAccess().getEffortKeyword_2_0());
                    			
                    // InternalKinematicsParser.g:1837:4: ( (lv_effort_3_0= RULE_DOUBLE ) )
                    // InternalKinematicsParser.g:1838:5: (lv_effort_3_0= RULE_DOUBLE )
                    {
                    // InternalKinematicsParser.g:1838:5: (lv_effort_3_0= RULE_DOUBLE )
                    // InternalKinematicsParser.g:1839:6: lv_effort_3_0= RULE_DOUBLE
                    {
                    lv_effort_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_47); 

                    						newLeafNode(lv_effort_3_0, grammarAccess.getLimitAccess().getEffortDOUBLETerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLimitRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"effort",
                    							lv_effort_3_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.DOUBLE");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:1856:3: (otherlv_4= Lower ( (lv_lower_5_0= RULE_DOUBLE ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Lower) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalKinematicsParser.g:1857:4: otherlv_4= Lower ( (lv_lower_5_0= RULE_DOUBLE ) )
                    {
                    otherlv_4=(Token)match(input,Lower,FOLLOW_43); 

                    				newLeafNode(otherlv_4, grammarAccess.getLimitAccess().getLowerKeyword_3_0());
                    			
                    // InternalKinematicsParser.g:1861:4: ( (lv_lower_5_0= RULE_DOUBLE ) )
                    // InternalKinematicsParser.g:1862:5: (lv_lower_5_0= RULE_DOUBLE )
                    {
                    // InternalKinematicsParser.g:1862:5: (lv_lower_5_0= RULE_DOUBLE )
                    // InternalKinematicsParser.g:1863:6: lv_lower_5_0= RULE_DOUBLE
                    {
                    lv_lower_5_0=(Token)match(input,RULE_DOUBLE,FOLLOW_48); 

                    						newLeafNode(lv_lower_5_0, grammarAccess.getLimitAccess().getLowerDOUBLETerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLimitRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"lower",
                    							lv_lower_5_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.DOUBLE");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:1880:3: (otherlv_6= Upper ( (lv_upper_7_0= RULE_DOUBLE ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Upper) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalKinematicsParser.g:1881:4: otherlv_6= Upper ( (lv_upper_7_0= RULE_DOUBLE ) )
                    {
                    otherlv_6=(Token)match(input,Upper,FOLLOW_43); 

                    				newLeafNode(otherlv_6, grammarAccess.getLimitAccess().getUpperKeyword_4_0());
                    			
                    // InternalKinematicsParser.g:1885:4: ( (lv_upper_7_0= RULE_DOUBLE ) )
                    // InternalKinematicsParser.g:1886:5: (lv_upper_7_0= RULE_DOUBLE )
                    {
                    // InternalKinematicsParser.g:1886:5: (lv_upper_7_0= RULE_DOUBLE )
                    // InternalKinematicsParser.g:1887:6: lv_upper_7_0= RULE_DOUBLE
                    {
                    lv_upper_7_0=(Token)match(input,RULE_DOUBLE,FOLLOW_49); 

                    						newLeafNode(lv_upper_7_0, grammarAccess.getLimitAccess().getUpperDOUBLETerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLimitRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"upper",
                    							lv_upper_7_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.DOUBLE");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:1904:3: (otherlv_8= Velocity ( (lv_velocity_9_0= RULE_DOUBLE ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Velocity) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalKinematicsParser.g:1905:4: otherlv_8= Velocity ( (lv_velocity_9_0= RULE_DOUBLE ) )
                    {
                    otherlv_8=(Token)match(input,Velocity,FOLLOW_43); 

                    				newLeafNode(otherlv_8, grammarAccess.getLimitAccess().getVelocityKeyword_5_0());
                    			
                    // InternalKinematicsParser.g:1909:4: ( (lv_velocity_9_0= RULE_DOUBLE ) )
                    // InternalKinematicsParser.g:1910:5: (lv_velocity_9_0= RULE_DOUBLE )
                    {
                    // InternalKinematicsParser.g:1910:5: (lv_velocity_9_0= RULE_DOUBLE )
                    // InternalKinematicsParser.g:1911:6: lv_velocity_9_0= RULE_DOUBLE
                    {
                    lv_velocity_9_0=(Token)match(input,RULE_DOUBLE,FOLLOW_18); 

                    						newLeafNode(lv_velocity_9_0, grammarAccess.getLimitAccess().getVelocityDOUBLETerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLimitRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"velocity",
                    							lv_velocity_9_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.DOUBLE");
                    					

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
    // InternalKinematicsParser.g:1936:1: entryRuleInertial returns [EObject current=null] : iv_ruleInertial= ruleInertial EOF ;
    public final EObject entryRuleInertial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertial = null;


        try {
            // InternalKinematicsParser.g:1936:49: (iv_ruleInertial= ruleInertial EOF )
            // InternalKinematicsParser.g:1937:2: iv_ruleInertial= ruleInertial EOF
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
    // InternalKinematicsParser.g:1943:1: ruleInertial returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Origin ( (lv_origin_3_0= rulePose ) ) )? (otherlv_4= Mass ( (lv_mass_5_0= ruleMass ) ) )? (otherlv_6= Inertia ( (lv_inertia_7_0= ruleInertia ) ) )? this_END_8= RULE_END ) ;
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
            // InternalKinematicsParser.g:1949:2: ( ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Origin ( (lv_origin_3_0= rulePose ) ) )? (otherlv_4= Mass ( (lv_mass_5_0= ruleMass ) ) )? (otherlv_6= Inertia ( (lv_inertia_7_0= ruleInertia ) ) )? this_END_8= RULE_END ) )
            // InternalKinematicsParser.g:1950:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Origin ( (lv_origin_3_0= rulePose ) ) )? (otherlv_4= Mass ( (lv_mass_5_0= ruleMass ) ) )? (otherlv_6= Inertia ( (lv_inertia_7_0= ruleInertia ) ) )? this_END_8= RULE_END )
            {
            // InternalKinematicsParser.g:1950:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Origin ( (lv_origin_3_0= rulePose ) ) )? (otherlv_4= Mass ( (lv_mass_5_0= ruleMass ) ) )? (otherlv_6= Inertia ( (lv_inertia_7_0= ruleInertia ) ) )? this_END_8= RULE_END )
            // InternalKinematicsParser.g:1951:3: () this_BEGIN_1= RULE_BEGIN (otherlv_2= Origin ( (lv_origin_3_0= rulePose ) ) )? (otherlv_4= Mass ( (lv_mass_5_0= ruleMass ) ) )? (otherlv_6= Inertia ( (lv_inertia_7_0= ruleInertia ) ) )? this_END_8= RULE_END
            {
            // InternalKinematicsParser.g:1951:3: ()
            // InternalKinematicsParser.g:1952:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInertialAccess().getInertialAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_50); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getInertialAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalKinematicsParser.g:1962:3: (otherlv_2= Origin ( (lv_origin_3_0= rulePose ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Origin) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalKinematicsParser.g:1963:4: otherlv_2= Origin ( (lv_origin_3_0= rulePose ) )
                    {
                    otherlv_2=(Token)match(input,Origin,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getInertialAccess().getOriginKeyword_2_0());
                    			
                    // InternalKinematicsParser.g:1967:4: ( (lv_origin_3_0= rulePose ) )
                    // InternalKinematicsParser.g:1968:5: (lv_origin_3_0= rulePose )
                    {
                    // InternalKinematicsParser.g:1968:5: (lv_origin_3_0= rulePose )
                    // InternalKinematicsParser.g:1969:6: lv_origin_3_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getInertialAccess().getOriginPoseParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_51);
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

            // InternalKinematicsParser.g:1987:3: (otherlv_4= Mass ( (lv_mass_5_0= ruleMass ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Mass) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalKinematicsParser.g:1988:4: otherlv_4= Mass ( (lv_mass_5_0= ruleMass ) )
                    {
                    otherlv_4=(Token)match(input,Mass,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getInertialAccess().getMassKeyword_3_0());
                    			
                    // InternalKinematicsParser.g:1992:4: ( (lv_mass_5_0= ruleMass ) )
                    // InternalKinematicsParser.g:1993:5: (lv_mass_5_0= ruleMass )
                    {
                    // InternalKinematicsParser.g:1993:5: (lv_mass_5_0= ruleMass )
                    // InternalKinematicsParser.g:1994:6: lv_mass_5_0= ruleMass
                    {

                    						newCompositeNode(grammarAccess.getInertialAccess().getMassMassParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_52);
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

            // InternalKinematicsParser.g:2012:3: (otherlv_6= Inertia ( (lv_inertia_7_0= ruleInertia ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Inertia) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalKinematicsParser.g:2013:4: otherlv_6= Inertia ( (lv_inertia_7_0= ruleInertia ) )
                    {
                    otherlv_6=(Token)match(input,Inertia,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getInertialAccess().getInertiaKeyword_4_0());
                    			
                    // InternalKinematicsParser.g:2017:4: ( (lv_inertia_7_0= ruleInertia ) )
                    // InternalKinematicsParser.g:2018:5: (lv_inertia_7_0= ruleInertia )
                    {
                    // InternalKinematicsParser.g:2018:5: (lv_inertia_7_0= ruleInertia )
                    // InternalKinematicsParser.g:2019:6: lv_inertia_7_0= ruleInertia
                    {

                    						newCompositeNode(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
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
    // InternalKinematicsParser.g:2045:1: entryRuleVisual returns [EObject current=null] : iv_ruleVisual= ruleVisual EOF ;
    public final EObject entryRuleVisual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisual = null;


        try {
            // InternalKinematicsParser.g:2045:47: (iv_ruleVisual= ruleVisual EOF )
            // InternalKinematicsParser.g:2046:2: iv_ruleVisual= ruleVisual EOF
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
    // InternalKinematicsParser.g:2052:1: ruleVisual returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END ) ;
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
            // InternalKinematicsParser.g:2058:2: ( (this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END ) )
            // InternalKinematicsParser.g:2059:2: (this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END )
            {
            // InternalKinematicsParser.g:2059:2: (this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END )
            // InternalKinematicsParser.g:2060:3: this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_53); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getVisualAccess().getBEGINTerminalRuleCall_0());
            		
            // InternalKinematicsParser.g:2064:3: (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Origin) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalKinematicsParser.g:2065:4: otherlv_1= Origin ( (lv_origin_2_0= rulePose ) )
                    {
                    otherlv_1=(Token)match(input,Origin,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getVisualAccess().getOriginKeyword_1_0());
                    			
                    // InternalKinematicsParser.g:2069:4: ( (lv_origin_2_0= rulePose ) )
                    // InternalKinematicsParser.g:2070:5: (lv_origin_2_0= rulePose )
                    {
                    // InternalKinematicsParser.g:2070:5: (lv_origin_2_0= rulePose )
                    // InternalKinematicsParser.g:2071:6: lv_origin_2_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getVisualAccess().getOriginPoseParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_54);
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
            		
            // InternalKinematicsParser.g:2093:3: ( (lv_geometry_4_0= ruleGeometry ) )
            // InternalKinematicsParser.g:2094:4: (lv_geometry_4_0= ruleGeometry )
            {
            // InternalKinematicsParser.g:2094:4: (lv_geometry_4_0= ruleGeometry )
            // InternalKinematicsParser.g:2095:5: lv_geometry_4_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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
    // InternalKinematicsParser.g:2120:1: entryRuleCollision returns [EObject current=null] : iv_ruleCollision= ruleCollision EOF ;
    public final EObject entryRuleCollision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollision = null;


        try {
            // InternalKinematicsParser.g:2120:50: (iv_ruleCollision= ruleCollision EOF )
            // InternalKinematicsParser.g:2121:2: iv_ruleCollision= ruleCollision EOF
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
    // InternalKinematicsParser.g:2127:1: ruleCollision returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END ) ;
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
            // InternalKinematicsParser.g:2133:2: ( (this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END ) )
            // InternalKinematicsParser.g:2134:2: (this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END )
            {
            // InternalKinematicsParser.g:2134:2: (this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END )
            // InternalKinematicsParser.g:2135:3: this_BEGIN_0= RULE_BEGIN (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )? otherlv_3= Geometry ( (lv_geometry_4_0= ruleGeometry ) ) this_END_5= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_53); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getCollisionAccess().getBEGINTerminalRuleCall_0());
            		
            // InternalKinematicsParser.g:2139:3: (otherlv_1= Origin ( (lv_origin_2_0= rulePose ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Origin) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalKinematicsParser.g:2140:4: otherlv_1= Origin ( (lv_origin_2_0= rulePose ) )
                    {
                    otherlv_1=(Token)match(input,Origin,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getCollisionAccess().getOriginKeyword_1_0());
                    			
                    // InternalKinematicsParser.g:2144:4: ( (lv_origin_2_0= rulePose ) )
                    // InternalKinematicsParser.g:2145:5: (lv_origin_2_0= rulePose )
                    {
                    // InternalKinematicsParser.g:2145:5: (lv_origin_2_0= rulePose )
                    // InternalKinematicsParser.g:2146:6: lv_origin_2_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getCollisionAccess().getOriginPoseParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_54);
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
            		
            // InternalKinematicsParser.g:2168:3: ( (lv_geometry_4_0= ruleGeometry ) )
            // InternalKinematicsParser.g:2169:4: (lv_geometry_4_0= ruleGeometry )
            {
            // InternalKinematicsParser.g:2169:4: (lv_geometry_4_0= ruleGeometry )
            // InternalKinematicsParser.g:2170:5: lv_geometry_4_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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
    // InternalKinematicsParser.g:2195:1: entryRuleMass returns [EObject current=null] : iv_ruleMass= ruleMass EOF ;
    public final EObject entryRuleMass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMass = null;


        try {
            // InternalKinematicsParser.g:2195:45: (iv_ruleMass= ruleMass EOF )
            // InternalKinematicsParser.g:2196:2: iv_ruleMass= ruleMass EOF
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
    // InternalKinematicsParser.g:2202:1: ruleMass returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN otherlv_2= Value ( (lv_value_3_0= RULE_DOUBLE ) ) this_END_4= RULE_END ) ;
    public final EObject ruleMass() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token this_END_4=null;


        	enterRule();

        try {
            // InternalKinematicsParser.g:2208:2: ( ( () this_BEGIN_1= RULE_BEGIN otherlv_2= Value ( (lv_value_3_0= RULE_DOUBLE ) ) this_END_4= RULE_END ) )
            // InternalKinematicsParser.g:2209:2: ( () this_BEGIN_1= RULE_BEGIN otherlv_2= Value ( (lv_value_3_0= RULE_DOUBLE ) ) this_END_4= RULE_END )
            {
            // InternalKinematicsParser.g:2209:2: ( () this_BEGIN_1= RULE_BEGIN otherlv_2= Value ( (lv_value_3_0= RULE_DOUBLE ) ) this_END_4= RULE_END )
            // InternalKinematicsParser.g:2210:3: () this_BEGIN_1= RULE_BEGIN otherlv_2= Value ( (lv_value_3_0= RULE_DOUBLE ) ) this_END_4= RULE_END
            {
            // InternalKinematicsParser.g:2210:3: ()
            // InternalKinematicsParser.g:2211:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMassAccess().getMassAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_55); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getMassAccess().getBEGINTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,Value,FOLLOW_43); 

            			newLeafNode(otherlv_2, grammarAccess.getMassAccess().getValueKeyword_2());
            		
            // InternalKinematicsParser.g:2225:3: ( (lv_value_3_0= RULE_DOUBLE ) )
            // InternalKinematicsParser.g:2226:4: (lv_value_3_0= RULE_DOUBLE )
            {
            // InternalKinematicsParser.g:2226:4: (lv_value_3_0= RULE_DOUBLE )
            // InternalKinematicsParser.g:2227:5: lv_value_3_0= RULE_DOUBLE
            {
            lv_value_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_18); 

            					newLeafNode(lv_value_3_0, grammarAccess.getMassAccess().getValueDOUBLETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.DOUBLE");
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getMassAccess().getENDTerminalRuleCall_4());
            		

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
    // InternalKinematicsParser.g:2251:1: entryRuleInertia returns [EObject current=null] : iv_ruleInertia= ruleInertia EOF ;
    public final EObject entryRuleInertia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertia = null;


        try {
            // InternalKinematicsParser.g:2251:48: (iv_ruleInertia= ruleInertia EOF )
            // InternalKinematicsParser.g:2252:2: iv_ruleInertia= ruleInertia EOF
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
    // InternalKinematicsParser.g:2258:1: ruleInertia returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Ixx ( (lv_ixx_3_0= RULE_DOUBLE ) ) )? (otherlv_4= Ixy ( (lv_ixy_5_0= RULE_DOUBLE ) ) )? (otherlv_6= Ixz ( (lv_ixz_7_0= RULE_DOUBLE ) ) )? (otherlv_8= Iyy ( (lv_iyy_9_0= RULE_DOUBLE ) ) )? (otherlv_10= Iyz ( (lv_iyz_11_0= RULE_DOUBLE ) ) )? (otherlv_12= Izz ( (lv_izz_13_0= RULE_DOUBLE ) ) )? this_END_14= RULE_END ) ;
    public final EObject ruleInertia() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token lv_ixx_3_0=null;
        Token otherlv_4=null;
        Token lv_ixy_5_0=null;
        Token otherlv_6=null;
        Token lv_ixz_7_0=null;
        Token otherlv_8=null;
        Token lv_iyy_9_0=null;
        Token otherlv_10=null;
        Token lv_iyz_11_0=null;
        Token otherlv_12=null;
        Token lv_izz_13_0=null;
        Token this_END_14=null;


        	enterRule();

        try {
            // InternalKinematicsParser.g:2264:2: ( ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Ixx ( (lv_ixx_3_0= RULE_DOUBLE ) ) )? (otherlv_4= Ixy ( (lv_ixy_5_0= RULE_DOUBLE ) ) )? (otherlv_6= Ixz ( (lv_ixz_7_0= RULE_DOUBLE ) ) )? (otherlv_8= Iyy ( (lv_iyy_9_0= RULE_DOUBLE ) ) )? (otherlv_10= Iyz ( (lv_iyz_11_0= RULE_DOUBLE ) ) )? (otherlv_12= Izz ( (lv_izz_13_0= RULE_DOUBLE ) ) )? this_END_14= RULE_END ) )
            // InternalKinematicsParser.g:2265:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Ixx ( (lv_ixx_3_0= RULE_DOUBLE ) ) )? (otherlv_4= Ixy ( (lv_ixy_5_0= RULE_DOUBLE ) ) )? (otherlv_6= Ixz ( (lv_ixz_7_0= RULE_DOUBLE ) ) )? (otherlv_8= Iyy ( (lv_iyy_9_0= RULE_DOUBLE ) ) )? (otherlv_10= Iyz ( (lv_iyz_11_0= RULE_DOUBLE ) ) )? (otherlv_12= Izz ( (lv_izz_13_0= RULE_DOUBLE ) ) )? this_END_14= RULE_END )
            {
            // InternalKinematicsParser.g:2265:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Ixx ( (lv_ixx_3_0= RULE_DOUBLE ) ) )? (otherlv_4= Ixy ( (lv_ixy_5_0= RULE_DOUBLE ) ) )? (otherlv_6= Ixz ( (lv_ixz_7_0= RULE_DOUBLE ) ) )? (otherlv_8= Iyy ( (lv_iyy_9_0= RULE_DOUBLE ) ) )? (otherlv_10= Iyz ( (lv_iyz_11_0= RULE_DOUBLE ) ) )? (otherlv_12= Izz ( (lv_izz_13_0= RULE_DOUBLE ) ) )? this_END_14= RULE_END )
            // InternalKinematicsParser.g:2266:3: () this_BEGIN_1= RULE_BEGIN (otherlv_2= Ixx ( (lv_ixx_3_0= RULE_DOUBLE ) ) )? (otherlv_4= Ixy ( (lv_ixy_5_0= RULE_DOUBLE ) ) )? (otherlv_6= Ixz ( (lv_ixz_7_0= RULE_DOUBLE ) ) )? (otherlv_8= Iyy ( (lv_iyy_9_0= RULE_DOUBLE ) ) )? (otherlv_10= Iyz ( (lv_iyz_11_0= RULE_DOUBLE ) ) )? (otherlv_12= Izz ( (lv_izz_13_0= RULE_DOUBLE ) ) )? this_END_14= RULE_END
            {
            // InternalKinematicsParser.g:2266:3: ()
            // InternalKinematicsParser.g:2267:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInertiaAccess().getInertiaAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_56); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getInertiaAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalKinematicsParser.g:2277:3: (otherlv_2= Ixx ( (lv_ixx_3_0= RULE_DOUBLE ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Ixx) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalKinematicsParser.g:2278:4: otherlv_2= Ixx ( (lv_ixx_3_0= RULE_DOUBLE ) )
                    {
                    otherlv_2=(Token)match(input,Ixx,FOLLOW_43); 

                    				newLeafNode(otherlv_2, grammarAccess.getInertiaAccess().getIxxKeyword_2_0());
                    			
                    // InternalKinematicsParser.g:2282:4: ( (lv_ixx_3_0= RULE_DOUBLE ) )
                    // InternalKinematicsParser.g:2283:5: (lv_ixx_3_0= RULE_DOUBLE )
                    {
                    // InternalKinematicsParser.g:2283:5: (lv_ixx_3_0= RULE_DOUBLE )
                    // InternalKinematicsParser.g:2284:6: lv_ixx_3_0= RULE_DOUBLE
                    {
                    lv_ixx_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_57); 

                    						newLeafNode(lv_ixx_3_0, grammarAccess.getInertiaAccess().getIxxDOUBLETerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInertiaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ixx",
                    							lv_ixx_3_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.DOUBLE");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:2301:3: (otherlv_4= Ixy ( (lv_ixy_5_0= RULE_DOUBLE ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==Ixy) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalKinematicsParser.g:2302:4: otherlv_4= Ixy ( (lv_ixy_5_0= RULE_DOUBLE ) )
                    {
                    otherlv_4=(Token)match(input,Ixy,FOLLOW_43); 

                    				newLeafNode(otherlv_4, grammarAccess.getInertiaAccess().getIxyKeyword_3_0());
                    			
                    // InternalKinematicsParser.g:2306:4: ( (lv_ixy_5_0= RULE_DOUBLE ) )
                    // InternalKinematicsParser.g:2307:5: (lv_ixy_5_0= RULE_DOUBLE )
                    {
                    // InternalKinematicsParser.g:2307:5: (lv_ixy_5_0= RULE_DOUBLE )
                    // InternalKinematicsParser.g:2308:6: lv_ixy_5_0= RULE_DOUBLE
                    {
                    lv_ixy_5_0=(Token)match(input,RULE_DOUBLE,FOLLOW_58); 

                    						newLeafNode(lv_ixy_5_0, grammarAccess.getInertiaAccess().getIxyDOUBLETerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInertiaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ixy",
                    							lv_ixy_5_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.DOUBLE");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:2325:3: (otherlv_6= Ixz ( (lv_ixz_7_0= RULE_DOUBLE ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Ixz) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalKinematicsParser.g:2326:4: otherlv_6= Ixz ( (lv_ixz_7_0= RULE_DOUBLE ) )
                    {
                    otherlv_6=(Token)match(input,Ixz,FOLLOW_43); 

                    				newLeafNode(otherlv_6, grammarAccess.getInertiaAccess().getIxzKeyword_4_0());
                    			
                    // InternalKinematicsParser.g:2330:4: ( (lv_ixz_7_0= RULE_DOUBLE ) )
                    // InternalKinematicsParser.g:2331:5: (lv_ixz_7_0= RULE_DOUBLE )
                    {
                    // InternalKinematicsParser.g:2331:5: (lv_ixz_7_0= RULE_DOUBLE )
                    // InternalKinematicsParser.g:2332:6: lv_ixz_7_0= RULE_DOUBLE
                    {
                    lv_ixz_7_0=(Token)match(input,RULE_DOUBLE,FOLLOW_59); 

                    						newLeafNode(lv_ixz_7_0, grammarAccess.getInertiaAccess().getIxzDOUBLETerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInertiaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ixz",
                    							lv_ixz_7_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.DOUBLE");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:2349:3: (otherlv_8= Iyy ( (lv_iyy_9_0= RULE_DOUBLE ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==Iyy) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalKinematicsParser.g:2350:4: otherlv_8= Iyy ( (lv_iyy_9_0= RULE_DOUBLE ) )
                    {
                    otherlv_8=(Token)match(input,Iyy,FOLLOW_43); 

                    				newLeafNode(otherlv_8, grammarAccess.getInertiaAccess().getIyyKeyword_5_0());
                    			
                    // InternalKinematicsParser.g:2354:4: ( (lv_iyy_9_0= RULE_DOUBLE ) )
                    // InternalKinematicsParser.g:2355:5: (lv_iyy_9_0= RULE_DOUBLE )
                    {
                    // InternalKinematicsParser.g:2355:5: (lv_iyy_9_0= RULE_DOUBLE )
                    // InternalKinematicsParser.g:2356:6: lv_iyy_9_0= RULE_DOUBLE
                    {
                    lv_iyy_9_0=(Token)match(input,RULE_DOUBLE,FOLLOW_60); 

                    						newLeafNode(lv_iyy_9_0, grammarAccess.getInertiaAccess().getIyyDOUBLETerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInertiaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"iyy",
                    							lv_iyy_9_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.DOUBLE");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:2373:3: (otherlv_10= Iyz ( (lv_iyz_11_0= RULE_DOUBLE ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Iyz) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalKinematicsParser.g:2374:4: otherlv_10= Iyz ( (lv_iyz_11_0= RULE_DOUBLE ) )
                    {
                    otherlv_10=(Token)match(input,Iyz,FOLLOW_43); 

                    				newLeafNode(otherlv_10, grammarAccess.getInertiaAccess().getIyzKeyword_6_0());
                    			
                    // InternalKinematicsParser.g:2378:4: ( (lv_iyz_11_0= RULE_DOUBLE ) )
                    // InternalKinematicsParser.g:2379:5: (lv_iyz_11_0= RULE_DOUBLE )
                    {
                    // InternalKinematicsParser.g:2379:5: (lv_iyz_11_0= RULE_DOUBLE )
                    // InternalKinematicsParser.g:2380:6: lv_iyz_11_0= RULE_DOUBLE
                    {
                    lv_iyz_11_0=(Token)match(input,RULE_DOUBLE,FOLLOW_61); 

                    						newLeafNode(lv_iyz_11_0, grammarAccess.getInertiaAccess().getIyzDOUBLETerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInertiaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"iyz",
                    							lv_iyz_11_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.DOUBLE");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematicsParser.g:2397:3: (otherlv_12= Izz ( (lv_izz_13_0= RULE_DOUBLE ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Izz) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalKinematicsParser.g:2398:4: otherlv_12= Izz ( (lv_izz_13_0= RULE_DOUBLE ) )
                    {
                    otherlv_12=(Token)match(input,Izz,FOLLOW_43); 

                    				newLeafNode(otherlv_12, grammarAccess.getInertiaAccess().getIzzKeyword_7_0());
                    			
                    // InternalKinematicsParser.g:2402:4: ( (lv_izz_13_0= RULE_DOUBLE ) )
                    // InternalKinematicsParser.g:2403:5: (lv_izz_13_0= RULE_DOUBLE )
                    {
                    // InternalKinematicsParser.g:2403:5: (lv_izz_13_0= RULE_DOUBLE )
                    // InternalKinematicsParser.g:2404:6: lv_izz_13_0= RULE_DOUBLE
                    {
                    lv_izz_13_0=(Token)match(input,RULE_DOUBLE,FOLLOW_18); 

                    						newLeafNode(lv_izz_13_0, grammarAccess.getInertiaAccess().getIzzDOUBLETerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInertiaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"izz",
                    							lv_izz_13_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.DOUBLE");
                    					

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
    // InternalKinematicsParser.g:2429:1: entryRuleGeometry returns [EObject current=null] : iv_ruleGeometry= ruleGeometry EOF ;
    public final EObject entryRuleGeometry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeometry = null;


        try {
            // InternalKinematicsParser.g:2429:49: (iv_ruleGeometry= ruleGeometry EOF )
            // InternalKinematicsParser.g:2430:2: iv_ruleGeometry= ruleGeometry EOF
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
    // InternalKinematicsParser.g:2436:1: ruleGeometry returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Box ( (lv_box_3_0= ruleBox ) ) )? (otherlv_4= Cylinder ( (lv_cylinder_5_0= ruleCylinder ) ) )? (otherlv_6= Sphere ( (lv_sphere_7_0= ruleSphere ) ) )? (otherlv_8= Mesh ( (lv_mesh_9_0= ruleMesh ) ) )? this_END_10= RULE_END ) ;
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
            // InternalKinematicsParser.g:2442:2: ( ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Box ( (lv_box_3_0= ruleBox ) ) )? (otherlv_4= Cylinder ( (lv_cylinder_5_0= ruleCylinder ) ) )? (otherlv_6= Sphere ( (lv_sphere_7_0= ruleSphere ) ) )? (otherlv_8= Mesh ( (lv_mesh_9_0= ruleMesh ) ) )? this_END_10= RULE_END ) )
            // InternalKinematicsParser.g:2443:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Box ( (lv_box_3_0= ruleBox ) ) )? (otherlv_4= Cylinder ( (lv_cylinder_5_0= ruleCylinder ) ) )? (otherlv_6= Sphere ( (lv_sphere_7_0= ruleSphere ) ) )? (otherlv_8= Mesh ( (lv_mesh_9_0= ruleMesh ) ) )? this_END_10= RULE_END )
            {
            // InternalKinematicsParser.g:2443:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Box ( (lv_box_3_0= ruleBox ) ) )? (otherlv_4= Cylinder ( (lv_cylinder_5_0= ruleCylinder ) ) )? (otherlv_6= Sphere ( (lv_sphere_7_0= ruleSphere ) ) )? (otherlv_8= Mesh ( (lv_mesh_9_0= ruleMesh ) ) )? this_END_10= RULE_END )
            // InternalKinematicsParser.g:2444:3: () this_BEGIN_1= RULE_BEGIN (otherlv_2= Box ( (lv_box_3_0= ruleBox ) ) )? (otherlv_4= Cylinder ( (lv_cylinder_5_0= ruleCylinder ) ) )? (otherlv_6= Sphere ( (lv_sphere_7_0= ruleSphere ) ) )? (otherlv_8= Mesh ( (lv_mesh_9_0= ruleMesh ) ) )? this_END_10= RULE_END
            {
            // InternalKinematicsParser.g:2444:3: ()
            // InternalKinematicsParser.g:2445:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGeometryAccess().getGeometryAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_62); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getGeometryAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalKinematicsParser.g:2455:3: (otherlv_2= Box ( (lv_box_3_0= ruleBox ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==Box) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalKinematicsParser.g:2456:4: otherlv_2= Box ( (lv_box_3_0= ruleBox ) )
                    {
                    otherlv_2=(Token)match(input,Box,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getGeometryAccess().getBoxKeyword_2_0());
                    			
                    // InternalKinematicsParser.g:2460:4: ( (lv_box_3_0= ruleBox ) )
                    // InternalKinematicsParser.g:2461:5: (lv_box_3_0= ruleBox )
                    {
                    // InternalKinematicsParser.g:2461:5: (lv_box_3_0= ruleBox )
                    // InternalKinematicsParser.g:2462:6: lv_box_3_0= ruleBox
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getBoxBoxParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_63);
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

            // InternalKinematicsParser.g:2480:3: (otherlv_4= Cylinder ( (lv_cylinder_5_0= ruleCylinder ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Cylinder) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalKinematicsParser.g:2481:4: otherlv_4= Cylinder ( (lv_cylinder_5_0= ruleCylinder ) )
                    {
                    otherlv_4=(Token)match(input,Cylinder,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getGeometryAccess().getCylinderKeyword_3_0());
                    			
                    // InternalKinematicsParser.g:2485:4: ( (lv_cylinder_5_0= ruleCylinder ) )
                    // InternalKinematicsParser.g:2486:5: (lv_cylinder_5_0= ruleCylinder )
                    {
                    // InternalKinematicsParser.g:2486:5: (lv_cylinder_5_0= ruleCylinder )
                    // InternalKinematicsParser.g:2487:6: lv_cylinder_5_0= ruleCylinder
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getCylinderCylinderParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_64);
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

            // InternalKinematicsParser.g:2505:3: (otherlv_6= Sphere ( (lv_sphere_7_0= ruleSphere ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Sphere) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalKinematicsParser.g:2506:4: otherlv_6= Sphere ( (lv_sphere_7_0= ruleSphere ) )
                    {
                    otherlv_6=(Token)match(input,Sphere,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getGeometryAccess().getSphereKeyword_4_0());
                    			
                    // InternalKinematicsParser.g:2510:4: ( (lv_sphere_7_0= ruleSphere ) )
                    // InternalKinematicsParser.g:2511:5: (lv_sphere_7_0= ruleSphere )
                    {
                    // InternalKinematicsParser.g:2511:5: (lv_sphere_7_0= ruleSphere )
                    // InternalKinematicsParser.g:2512:6: lv_sphere_7_0= ruleSphere
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getSphereSphereParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_65);
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

            // InternalKinematicsParser.g:2530:3: (otherlv_8= Mesh ( (lv_mesh_9_0= ruleMesh ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==Mesh) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalKinematicsParser.g:2531:4: otherlv_8= Mesh ( (lv_mesh_9_0= ruleMesh ) )
                    {
                    otherlv_8=(Token)match(input,Mesh,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getGeometryAccess().getMeshKeyword_5_0());
                    			
                    // InternalKinematicsParser.g:2535:4: ( (lv_mesh_9_0= ruleMesh ) )
                    // InternalKinematicsParser.g:2536:5: (lv_mesh_9_0= ruleMesh )
                    {
                    // InternalKinematicsParser.g:2536:5: (lv_mesh_9_0= ruleMesh )
                    // InternalKinematicsParser.g:2537:6: lv_mesh_9_0= ruleMesh
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getMeshMeshParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_18);
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
    // InternalKinematicsParser.g:2563:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // InternalKinematicsParser.g:2563:44: (iv_ruleBox= ruleBox EOF )
            // InternalKinematicsParser.g:2564:2: iv_ruleBox= ruleBox EOF
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
    // InternalKinematicsParser.g:2570:1: ruleBox returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN otherlv_2= Size ( (lv_size_3_0= ruleEString ) ) this_END_4= RULE_END ) ;
    public final EObject ruleBox() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_size_3_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:2576:2: ( ( () this_BEGIN_1= RULE_BEGIN otherlv_2= Size ( (lv_size_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            // InternalKinematicsParser.g:2577:2: ( () this_BEGIN_1= RULE_BEGIN otherlv_2= Size ( (lv_size_3_0= ruleEString ) ) this_END_4= RULE_END )
            {
            // InternalKinematicsParser.g:2577:2: ( () this_BEGIN_1= RULE_BEGIN otherlv_2= Size ( (lv_size_3_0= ruleEString ) ) this_END_4= RULE_END )
            // InternalKinematicsParser.g:2578:3: () this_BEGIN_1= RULE_BEGIN otherlv_2= Size ( (lv_size_3_0= ruleEString ) ) this_END_4= RULE_END
            {
            // InternalKinematicsParser.g:2578:3: ()
            // InternalKinematicsParser.g:2579:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoxAccess().getBoxAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_66); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getBoxAccess().getBEGINTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,Size,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getBoxAccess().getSizeKeyword_2());
            		
            // InternalKinematicsParser.g:2593:3: ( (lv_size_3_0= ruleEString ) )
            // InternalKinematicsParser.g:2594:4: (lv_size_3_0= ruleEString )
            {
            // InternalKinematicsParser.g:2594:4: (lv_size_3_0= ruleEString )
            // InternalKinematicsParser.g:2595:5: lv_size_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBoxAccess().getSizeEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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
    // InternalKinematicsParser.g:2620:1: entryRuleCylinder returns [EObject current=null] : iv_ruleCylinder= ruleCylinder EOF ;
    public final EObject entryRuleCylinder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCylinder = null;


        try {
            // InternalKinematicsParser.g:2620:49: (iv_ruleCylinder= ruleCylinder EOF )
            // InternalKinematicsParser.g:2621:2: iv_ruleCylinder= ruleCylinder EOF
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
    // InternalKinematicsParser.g:2627:1: ruleCylinder returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN otherlv_1= Length ( (lv_length_2_0= ruleEString ) ) otherlv_3= Radius ( (lv_radius_4_0= ruleEString ) ) this_END_5= RULE_END ) ;
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
            // InternalKinematicsParser.g:2633:2: ( (this_BEGIN_0= RULE_BEGIN otherlv_1= Length ( (lv_length_2_0= ruleEString ) ) otherlv_3= Radius ( (lv_radius_4_0= ruleEString ) ) this_END_5= RULE_END ) )
            // InternalKinematicsParser.g:2634:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Length ( (lv_length_2_0= ruleEString ) ) otherlv_3= Radius ( (lv_radius_4_0= ruleEString ) ) this_END_5= RULE_END )
            {
            // InternalKinematicsParser.g:2634:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Length ( (lv_length_2_0= ruleEString ) ) otherlv_3= Radius ( (lv_radius_4_0= ruleEString ) ) this_END_5= RULE_END )
            // InternalKinematicsParser.g:2635:3: this_BEGIN_0= RULE_BEGIN otherlv_1= Length ( (lv_length_2_0= ruleEString ) ) otherlv_3= Radius ( (lv_radius_4_0= ruleEString ) ) this_END_5= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_67); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getCylinderAccess().getBEGINTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,Length,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCylinderAccess().getLengthKeyword_1());
            		
            // InternalKinematicsParser.g:2643:3: ( (lv_length_2_0= ruleEString ) )
            // InternalKinematicsParser.g:2644:4: (lv_length_2_0= ruleEString )
            {
            // InternalKinematicsParser.g:2644:4: (lv_length_2_0= ruleEString )
            // InternalKinematicsParser.g:2645:5: lv_length_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCylinderAccess().getLengthEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_68);
            lv_length_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCylinderRule());
            					}
            					set(
            						current,
            						"length",
            						lv_length_2_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,Radius,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getCylinderAccess().getRadiusKeyword_3());
            		
            // InternalKinematicsParser.g:2666:3: ( (lv_radius_4_0= ruleEString ) )
            // InternalKinematicsParser.g:2667:4: (lv_radius_4_0= ruleEString )
            {
            // InternalKinematicsParser.g:2667:4: (lv_radius_4_0= ruleEString )
            // InternalKinematicsParser.g:2668:5: lv_radius_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCylinderAccess().getRadiusEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_radius_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCylinderRule());
            					}
            					set(
            						current,
            						"radius",
            						lv_radius_4_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
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
    // InternalKinematicsParser.g:2693:1: entryRuleSphere returns [EObject current=null] : iv_ruleSphere= ruleSphere EOF ;
    public final EObject entryRuleSphere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSphere = null;


        try {
            // InternalKinematicsParser.g:2693:47: (iv_ruleSphere= ruleSphere EOF )
            // InternalKinematicsParser.g:2694:2: iv_ruleSphere= ruleSphere EOF
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
    // InternalKinematicsParser.g:2700:1: ruleSphere returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN otherlv_1= Radius ( (lv_radius_2_0= ruleDouble0 ) ) this_END_3= RULE_END ) ;
    public final EObject ruleSphere() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token otherlv_1=null;
        Token this_END_3=null;
        AntlrDatatypeRuleToken lv_radius_2_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:2706:2: ( (this_BEGIN_0= RULE_BEGIN otherlv_1= Radius ( (lv_radius_2_0= ruleDouble0 ) ) this_END_3= RULE_END ) )
            // InternalKinematicsParser.g:2707:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Radius ( (lv_radius_2_0= ruleDouble0 ) ) this_END_3= RULE_END )
            {
            // InternalKinematicsParser.g:2707:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Radius ( (lv_radius_2_0= ruleDouble0 ) ) this_END_3= RULE_END )
            // InternalKinematicsParser.g:2708:3: this_BEGIN_0= RULE_BEGIN otherlv_1= Radius ( (lv_radius_2_0= ruleDouble0 ) ) this_END_3= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_68); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getSphereAccess().getBEGINTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,Radius,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getSphereAccess().getRadiusKeyword_1());
            		
            // InternalKinematicsParser.g:2716:3: ( (lv_radius_2_0= ruleDouble0 ) )
            // InternalKinematicsParser.g:2717:4: (lv_radius_2_0= ruleDouble0 )
            {
            // InternalKinematicsParser.g:2717:4: (lv_radius_2_0= ruleDouble0 )
            // InternalKinematicsParser.g:2718:5: lv_radius_2_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getSphereAccess().getRadiusDouble0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
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
    // InternalKinematicsParser.g:2743:1: entryRuleMesh returns [EObject current=null] : iv_ruleMesh= ruleMesh EOF ;
    public final EObject entryRuleMesh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMesh = null;


        try {
            // InternalKinematicsParser.g:2743:45: (iv_ruleMesh= ruleMesh EOF )
            // InternalKinematicsParser.g:2744:2: iv_ruleMesh= ruleMesh EOF
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
    // InternalKinematicsParser.g:2750:1: ruleMesh returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN otherlv_1= Filename ( (lv_filename_2_0= ruleEString ) ) (otherlv_3= Scale otherlv_4= LeftSquareBracket ( (lv_scale_5_0= RULE_DOUBLE ) ) (otherlv_6= Comma ( (lv_scale_7_0= RULE_DOUBLE ) ) )* otherlv_8= RightSquareBracket )? this_END_9= RULE_END ) ;
    public final EObject ruleMesh() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_scale_5_0=null;
        Token otherlv_6=null;
        Token lv_scale_7_0=null;
        Token otherlv_8=null;
        Token this_END_9=null;
        AntlrDatatypeRuleToken lv_filename_2_0 = null;



        	enterRule();

        try {
            // InternalKinematicsParser.g:2756:2: ( (this_BEGIN_0= RULE_BEGIN otherlv_1= Filename ( (lv_filename_2_0= ruleEString ) ) (otherlv_3= Scale otherlv_4= LeftSquareBracket ( (lv_scale_5_0= RULE_DOUBLE ) ) (otherlv_6= Comma ( (lv_scale_7_0= RULE_DOUBLE ) ) )* otherlv_8= RightSquareBracket )? this_END_9= RULE_END ) )
            // InternalKinematicsParser.g:2757:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Filename ( (lv_filename_2_0= ruleEString ) ) (otherlv_3= Scale otherlv_4= LeftSquareBracket ( (lv_scale_5_0= RULE_DOUBLE ) ) (otherlv_6= Comma ( (lv_scale_7_0= RULE_DOUBLE ) ) )* otherlv_8= RightSquareBracket )? this_END_9= RULE_END )
            {
            // InternalKinematicsParser.g:2757:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Filename ( (lv_filename_2_0= ruleEString ) ) (otherlv_3= Scale otherlv_4= LeftSquareBracket ( (lv_scale_5_0= RULE_DOUBLE ) ) (otherlv_6= Comma ( (lv_scale_7_0= RULE_DOUBLE ) ) )* otherlv_8= RightSquareBracket )? this_END_9= RULE_END )
            // InternalKinematicsParser.g:2758:3: this_BEGIN_0= RULE_BEGIN otherlv_1= Filename ( (lv_filename_2_0= ruleEString ) ) (otherlv_3= Scale otherlv_4= LeftSquareBracket ( (lv_scale_5_0= RULE_DOUBLE ) ) (otherlv_6= Comma ( (lv_scale_7_0= RULE_DOUBLE ) ) )* otherlv_8= RightSquareBracket )? this_END_9= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_69); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getMeshAccess().getBEGINTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,Filename,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMeshAccess().getFilenameKeyword_1());
            		
            // InternalKinematicsParser.g:2766:3: ( (lv_filename_2_0= ruleEString ) )
            // InternalKinematicsParser.g:2767:4: (lv_filename_2_0= ruleEString )
            {
            // InternalKinematicsParser.g:2767:4: (lv_filename_2_0= ruleEString )
            // InternalKinematicsParser.g:2768:5: lv_filename_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeshAccess().getFilenameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_70);
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

            // InternalKinematicsParser.g:2785:3: (otherlv_3= Scale otherlv_4= LeftSquareBracket ( (lv_scale_5_0= RULE_DOUBLE ) ) (otherlv_6= Comma ( (lv_scale_7_0= RULE_DOUBLE ) ) )* otherlv_8= RightSquareBracket )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==Scale) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalKinematicsParser.g:2786:4: otherlv_3= Scale otherlv_4= LeftSquareBracket ( (lv_scale_5_0= RULE_DOUBLE ) ) (otherlv_6= Comma ( (lv_scale_7_0= RULE_DOUBLE ) ) )* otherlv_8= RightSquareBracket
                    {
                    otherlv_3=(Token)match(input,Scale,FOLLOW_42); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeshAccess().getScaleKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,LeftSquareBracket,FOLLOW_43); 

                    				newLeafNode(otherlv_4, grammarAccess.getMeshAccess().getLeftSquareBracketKeyword_3_1());
                    			
                    // InternalKinematicsParser.g:2794:4: ( (lv_scale_5_0= RULE_DOUBLE ) )
                    // InternalKinematicsParser.g:2795:5: (lv_scale_5_0= RULE_DOUBLE )
                    {
                    // InternalKinematicsParser.g:2795:5: (lv_scale_5_0= RULE_DOUBLE )
                    // InternalKinematicsParser.g:2796:6: lv_scale_5_0= RULE_DOUBLE
                    {
                    lv_scale_5_0=(Token)match(input,RULE_DOUBLE,FOLLOW_44); 

                    						newLeafNode(lv_scale_5_0, grammarAccess.getMeshAccess().getScaleDOUBLETerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMeshRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"scale",
                    							lv_scale_5_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.DOUBLE");
                    					

                    }


                    }

                    // InternalKinematicsParser.g:2812:4: (otherlv_6= Comma ( (lv_scale_7_0= RULE_DOUBLE ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==Comma) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalKinematicsParser.g:2813:5: otherlv_6= Comma ( (lv_scale_7_0= RULE_DOUBLE ) )
                    	    {
                    	    otherlv_6=(Token)match(input,Comma,FOLLOW_43); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getMeshAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalKinematicsParser.g:2817:5: ( (lv_scale_7_0= RULE_DOUBLE ) )
                    	    // InternalKinematicsParser.g:2818:6: (lv_scale_7_0= RULE_DOUBLE )
                    	    {
                    	    // InternalKinematicsParser.g:2818:6: (lv_scale_7_0= RULE_DOUBLE )
                    	    // InternalKinematicsParser.g:2819:7: lv_scale_7_0= RULE_DOUBLE
                    	    {
                    	    lv_scale_7_0=(Token)match(input,RULE_DOUBLE,FOLLOW_44); 

                    	    							newLeafNode(lv_scale_7_0, grammarAccess.getMeshAccess().getScaleDOUBLETerminalRuleCall_3_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMeshRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"scale",
                    	    								lv_scale_7_0,
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.DOUBLE");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,RightSquareBracket,FOLLOW_18); 

                    				newLeafNode(otherlv_8, grammarAccess.getMeshAccess().getRightSquareBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            this_END_9=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_9, grammarAccess.getMeshAccess().getENDTerminalRuleCall_4());
            		

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
    // InternalKinematicsParser.g:2849:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalKinematicsParser.g:2849:47: (iv_ruleEString= ruleEString EOF )
            // InternalKinematicsParser.g:2850:2: iv_ruleEString= ruleEString EOF
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
    // InternalKinematicsParser.g:2856:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalKinematicsParser.g:2862:2: (this_STRING_0= RULE_STRING )
            // InternalKinematicsParser.g:2863:2: this_STRING_0= RULE_STRING
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
    // InternalKinematicsParser.g:2873:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalKinematicsParser.g:2873:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalKinematicsParser.g:2874:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalKinematicsParser.g:2880:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalKinematicsParser.g:2886:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalKinematicsParser.g:2887:2: this_DOUBLE_0= RULE_DOUBLE
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


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\31\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\55\1\uffff\1\111\1\43\1\5\1\105\1\70\2\74\1\33\2\101\1\111\2\72\1\106\1\101\1\71\1\101\1\106\1\uffff\2\72";
    static final String dfa_3s = "\1\106\1\uffff\1\55\1\uffff\1\111\2\106\1\105\1\106\2\74\1\33\2\101\1\111\2\75\1\106\1\101\1\106\1\101\1\106\1\uffff\2\75";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\3\22\uffff\1\2\2\uffff";
    static final String dfa_5s = "\31\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\1\1\uffff\1\3\1\uffff\1\3\30\uffff\2\3\6\uffff\1\3\20\uffff\1\2\12\uffff\1\3",
            "",
            "\1\4",
            "",
            "\1\5",
            "\1\3\27\uffff\1\3\11\uffff\1\6\1\3",
            "\1\3\2\uffff\1\3\1\uffff\1\3\4\uffff\1\3\12\uffff\1\7\4\uffff\1\3\20\uffff\1\3\25\uffff\1\3",
            "\1\10",
            "\1\11\1\12\14\uffff\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22\2\uffff\1\23",
            "\1\24\2\uffff\1\25",
            "\1\26",
            "\1\27",
            "\1\12\14\uffff\1\13",
            "\1\30",
            "\1\13",
            "",
            "\1\22\2\uffff\1\23",
            "\1\24\2\uffff\1\25"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "182:3: ( (otherlv_11= BaseAttachment ( (lv_baseAttachment_12_0= ruleBaseAttachment ) )* ) | ( (lv_baseAttachment_13_0= ruleBaseAttachment ) ) )?";
        }
    }
    static final String dfa_7s = "\30\uffff";
    static final String dfa_8s = "\1\4\1\uffff\1\55\1\111\1\43\1\5\1\105\1\70\2\74\1\33\2\101\1\111\2\72\1\106\1\101\1\71\1\101\1\106\1\uffff\2\72";
    static final String dfa_9s = "\1\106\1\uffff\1\55\1\111\2\106\1\105\1\106\2\74\1\33\2\101\1\111\2\75\1\106\1\101\1\106\1\101\1\106\1\uffff\2\75";
    static final String dfa_10s = "\1\uffff\1\2\23\uffff\1\1\2\uffff";
    static final String dfa_11s = "\30\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\2\uffff\1\1\1\uffff\1\1\30\uffff\2\1\6\uffff\1\1\20\uffff\1\2\12\uffff\1\1",
            "",
            "\1\3",
            "\1\4",
            "\1\1\27\uffff\1\1\11\uffff\1\5\1\1",
            "\1\1\2\uffff\1\1\1\uffff\1\1\4\uffff\1\1\12\uffff\1\6\4\uffff\1\1\20\uffff\1\1\25\uffff\1\1",
            "\1\7",
            "\1\10\1\11\14\uffff\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21\2\uffff\1\22",
            "\1\23\2\uffff\1\24",
            "\1\25",
            "\1\26",
            "\1\11\14\uffff\1\12",
            "\1\27",
            "\1\12",
            "",
            "\1\21\2\uffff\1\22",
            "\1\23\2\uffff\1\24"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()* loopback of 188:5: ( (lv_baseAttachment_12_0= ruleBaseAttachment ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0800040C00040AB0L,0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0800040C000402B0L,0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0800040C000002B0L,0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0800040C00000290L,0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0800040C00000280L,0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0800040C00000080L,0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0800040C00000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0800040800000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0800000800000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000021000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000080008100L,0x0000000000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000080000100L,0x0000000000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0300000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x2400000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x000000A001010000L,0x0000000000000040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x000000A000010000L,0x0000000000000040L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000008000010000L,0x0000000000000040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000040L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000080004080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000080000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x00FC000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x00F8000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x00F0000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x00E0000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x00C0000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0002100040001000L,0x0000000000000040L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000100040001000L,0x0000000000000040L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000100040000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000040L});

}