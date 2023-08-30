package de.fraunhofer.ipa.kinematics.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.fraunhofer.ipa.kinematics.services.KinematicsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKinematicsParser extends AbstractInternalContentAssistParser {
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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("HyphenMinus", "'-'");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("Box", "'box:'");
    		tokenNameToValue.put("Ixx", "'ixx:'");
    		tokenNameToValue.put("Ixy", "'ixy:'");
    		tokenNameToValue.put("Ixz", "'ixz:'");
    		tokenNameToValue.put("Iyy", "'iyy:'");
    		tokenNameToValue.put("Iyz", "'iyz:'");
    		tokenNameToValue.put("Izz", "'izz:'");
    		tokenNameToValue.put("Rpy", "'rpy:'");
    		tokenNameToValue.put("Xyz", "'xyz:'");
    		tokenNameToValue.put("Axis", "'axis:'");
    		tokenNameToValue.put("Link", "'link:'");
    		tokenNameToValue.put("Mass", "'mass:'");
    		tokenNameToValue.put("Mesh", "'mesh:'");
    		tokenNameToValue.put("Name", "'name:'");
    		tokenNameToValue.put("Repo", "'repo:'");
    		tokenNameToValue.put("Size", "'size:'");
    		tokenNameToValue.put("Type", "'type:'");
    		tokenNameToValue.put("AnyURI", "'AnyURI'");
    		tokenNameToValue.put("Child", "'child:'");
    		tokenNameToValue.put("Group", "'group:'");
    		tokenNameToValue.put("Joint", "'joint:'");
    		tokenNameToValue.put("Limit", "'limit:'");
    		tokenNameToValue.put("Lower", "'lower:'");
    		tokenNameToValue.put("Scale", "'scale:'");
    		tokenNameToValue.put("Upper", "'upper:'");
    		tokenNameToValue.put("Value", "'value:'");
    		tokenNameToValue.put("Branch", "'branch:'");
    		tokenNameToValue.put("Distro", "'distro:'");
    		tokenNameToValue.put("Effort", "'effort:'");
    		tokenNameToValue.put("Length", "'length:'");
    		tokenNameToValue.put("Origin", "'origin:'");
    		tokenNameToValue.put("Parent", "'parent:'");
    		tokenNameToValue.put("Prefix", "'prefix:'");
    		tokenNameToValue.put("Radius", "'radius:'");
    		tokenNameToValue.put("Sphere", "'sphere:'");
    		tokenNameToValue.put("Visual", "'visual:'");
    		tokenNameToValue.put("EndLink", "'endLink:'");
    		tokenNameToValue.put("GitRepo", "'gitRepo:'");
    		tokenNameToValue.put("Inertia", "'inertia:'");
    		tokenNameToValue.put("Package", "'package:'");
    		tokenNameToValue.put("Version", "'version:'");
    		tokenNameToValue.put("BaseLink", "'baseLink:'");
    		tokenNameToValue.put("Category", "'category:'");
    		tokenNameToValue.put("Cylinder", "'cylinder:'");
    		tokenNameToValue.put("Filename", "'filename:'");
    		tokenNameToValue.put("Geometry", "'geometry:'");
    		tokenNameToValue.put("Inertial", "'inertial:'");
    		tokenNameToValue.put("Velocity", "'velocity:'");
    		tokenNameToValue.put("Collision", "'collision:'");
    		tokenNameToValue.put("Component", "'component:'");
    		tokenNameToValue.put("Connection", "'connection:'");
    		tokenNameToValue.put("Ros2_control", "'ros2_control:'");
    		tokenNameToValue.put("BaseAttachment", "'baseAttachment:'");
    		tokenNameToValue.put("FlangeAttachment", "'flangeAttachment:'");
    	}

    	public void setGrammarAccess(KinematicsGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleComponent"
    // InternalKinematicsParser.g:113:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:114:1: ( ruleComponent EOF )
            // InternalKinematicsParser.g:115:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalKinematicsParser.g:122:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:126:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalKinematicsParser.g:127:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalKinematicsParser.g:127:2: ( ( rule__Component__Group__0 ) )
            // InternalKinematicsParser.g:128:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalKinematicsParser.g:129:3: ( rule__Component__Group__0 )
            // InternalKinematicsParser.g:129:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleConfiguredComponent"
    // InternalKinematicsParser.g:138:1: entryRuleConfiguredComponent : ruleConfiguredComponent EOF ;
    public final void entryRuleConfiguredComponent() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:139:1: ( ruleConfiguredComponent EOF )
            // InternalKinematicsParser.g:140:1: ruleConfiguredComponent EOF
            {
             before(grammarAccess.getConfiguredComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleConfiguredComponent();

            state._fsp--;

             after(grammarAccess.getConfiguredComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfiguredComponent"


    // $ANTLR start "ruleConfiguredComponent"
    // InternalKinematicsParser.g:147:1: ruleConfiguredComponent : ( ( rule__ConfiguredComponent__Group__0 ) ) ;
    public final void ruleConfiguredComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:151:2: ( ( ( rule__ConfiguredComponent__Group__0 ) ) )
            // InternalKinematicsParser.g:152:2: ( ( rule__ConfiguredComponent__Group__0 ) )
            {
            // InternalKinematicsParser.g:152:2: ( ( rule__ConfiguredComponent__Group__0 ) )
            // InternalKinematicsParser.g:153:3: ( rule__ConfiguredComponent__Group__0 )
            {
             before(grammarAccess.getConfiguredComponentAccess().getGroup()); 
            // InternalKinematicsParser.g:154:3: ( rule__ConfiguredComponent__Group__0 )
            // InternalKinematicsParser.g:154:4: rule__ConfiguredComponent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConfiguredComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfiguredComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfiguredComponent"


    // $ANTLR start "entryRuleGitRepo"
    // InternalKinematicsParser.g:163:1: entryRuleGitRepo : ruleGitRepo EOF ;
    public final void entryRuleGitRepo() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:164:1: ( ruleGitRepo EOF )
            // InternalKinematicsParser.g:165:1: ruleGitRepo EOF
            {
             before(grammarAccess.getGitRepoRule()); 
            pushFollow(FOLLOW_1);
            ruleGitRepo();

            state._fsp--;

             after(grammarAccess.getGitRepoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGitRepo"


    // $ANTLR start "ruleGitRepo"
    // InternalKinematicsParser.g:172:1: ruleGitRepo : ( ( rule__GitRepo__Group__0 ) ) ;
    public final void ruleGitRepo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:176:2: ( ( ( rule__GitRepo__Group__0 ) ) )
            // InternalKinematicsParser.g:177:2: ( ( rule__GitRepo__Group__0 ) )
            {
            // InternalKinematicsParser.g:177:2: ( ( rule__GitRepo__Group__0 ) )
            // InternalKinematicsParser.g:178:3: ( rule__GitRepo__Group__0 )
            {
             before(grammarAccess.getGitRepoAccess().getGroup()); 
            // InternalKinematicsParser.g:179:3: ( rule__GitRepo__Group__0 )
            // InternalKinematicsParser.g:179:4: rule__GitRepo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GitRepo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGitRepoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGitRepo"


    // $ANTLR start "entryRuleGroup"
    // InternalKinematicsParser.g:188:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:189:1: ( ruleGroup EOF )
            // InternalKinematicsParser.g:190:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalKinematicsParser.g:197:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:201:2: ( ( ( rule__Group__Group__0 ) ) )
            // InternalKinematicsParser.g:202:2: ( ( rule__Group__Group__0 ) )
            {
            // InternalKinematicsParser.g:202:2: ( ( rule__Group__Group__0 ) )
            // InternalKinematicsParser.g:203:3: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // InternalKinematicsParser.g:204:3: ( rule__Group__Group__0 )
            // InternalKinematicsParser.g:204:4: rule__Group__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleBaseAttachment"
    // InternalKinematicsParser.g:213:1: entryRuleBaseAttachment : ruleBaseAttachment EOF ;
    public final void entryRuleBaseAttachment() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:214:1: ( ruleBaseAttachment EOF )
            // InternalKinematicsParser.g:215:1: ruleBaseAttachment EOF
            {
             before(grammarAccess.getBaseAttachmentRule()); 
            pushFollow(FOLLOW_1);
            ruleBaseAttachment();

            state._fsp--;

             after(grammarAccess.getBaseAttachmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBaseAttachment"


    // $ANTLR start "ruleBaseAttachment"
    // InternalKinematicsParser.g:222:1: ruleBaseAttachment : ( ( rule__BaseAttachment__Group__0 ) ) ;
    public final void ruleBaseAttachment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:226:2: ( ( ( rule__BaseAttachment__Group__0 ) ) )
            // InternalKinematicsParser.g:227:2: ( ( rule__BaseAttachment__Group__0 ) )
            {
            // InternalKinematicsParser.g:227:2: ( ( rule__BaseAttachment__Group__0 ) )
            // InternalKinematicsParser.g:228:3: ( rule__BaseAttachment__Group__0 )
            {
             before(grammarAccess.getBaseAttachmentAccess().getGroup()); 
            // InternalKinematicsParser.g:229:3: ( rule__BaseAttachment__Group__0 )
            // InternalKinematicsParser.g:229:4: rule__BaseAttachment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BaseAttachment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBaseAttachmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseAttachment"


    // $ANTLR start "entryRuleFlangeAttachment"
    // InternalKinematicsParser.g:238:1: entryRuleFlangeAttachment : ruleFlangeAttachment EOF ;
    public final void entryRuleFlangeAttachment() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:239:1: ( ruleFlangeAttachment EOF )
            // InternalKinematicsParser.g:240:1: ruleFlangeAttachment EOF
            {
             before(grammarAccess.getFlangeAttachmentRule()); 
            pushFollow(FOLLOW_1);
            ruleFlangeAttachment();

            state._fsp--;

             after(grammarAccess.getFlangeAttachmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFlangeAttachment"


    // $ANTLR start "ruleFlangeAttachment"
    // InternalKinematicsParser.g:247:1: ruleFlangeAttachment : ( ( rule__FlangeAttachment__Group__0 ) ) ;
    public final void ruleFlangeAttachment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:251:2: ( ( ( rule__FlangeAttachment__Group__0 ) ) )
            // InternalKinematicsParser.g:252:2: ( ( rule__FlangeAttachment__Group__0 ) )
            {
            // InternalKinematicsParser.g:252:2: ( ( rule__FlangeAttachment__Group__0 ) )
            // InternalKinematicsParser.g:253:3: ( rule__FlangeAttachment__Group__0 )
            {
             before(grammarAccess.getFlangeAttachmentAccess().getGroup()); 
            // InternalKinematicsParser.g:254:3: ( rule__FlangeAttachment__Group__0 )
            // InternalKinematicsParser.g:254:4: rule__FlangeAttachment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FlangeAttachment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFlangeAttachmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFlangeAttachment"


    // $ANTLR start "entryRuleConnection"
    // InternalKinematicsParser.g:263:1: entryRuleConnection : ruleConnection EOF ;
    public final void entryRuleConnection() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:264:1: ( ruleConnection EOF )
            // InternalKinematicsParser.g:265:1: ruleConnection EOF
            {
             before(grammarAccess.getConnectionRule()); 
            pushFollow(FOLLOW_1);
            ruleConnection();

            state._fsp--;

             after(grammarAccess.getConnectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // InternalKinematicsParser.g:272:1: ruleConnection : ( ( rule__Connection__Group__0 ) ) ;
    public final void ruleConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:276:2: ( ( ( rule__Connection__Group__0 ) ) )
            // InternalKinematicsParser.g:277:2: ( ( rule__Connection__Group__0 ) )
            {
            // InternalKinematicsParser.g:277:2: ( ( rule__Connection__Group__0 ) )
            // InternalKinematicsParser.g:278:3: ( rule__Connection__Group__0 )
            {
             before(grammarAccess.getConnectionAccess().getGroup()); 
            // InternalKinematicsParser.g:279:3: ( rule__Connection__Group__0 )
            // InternalKinematicsParser.g:279:4: rule__Connection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Connection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleJoint"
    // InternalKinematicsParser.g:288:1: entryRuleJoint : ruleJoint EOF ;
    public final void entryRuleJoint() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:289:1: ( ruleJoint EOF )
            // InternalKinematicsParser.g:290:1: ruleJoint EOF
            {
             before(grammarAccess.getJointRule()); 
            pushFollow(FOLLOW_1);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getJointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJoint"


    // $ANTLR start "ruleJoint"
    // InternalKinematicsParser.g:297:1: ruleJoint : ( ( rule__Joint__Group__0 ) ) ;
    public final void ruleJoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:301:2: ( ( ( rule__Joint__Group__0 ) ) )
            // InternalKinematicsParser.g:302:2: ( ( rule__Joint__Group__0 ) )
            {
            // InternalKinematicsParser.g:302:2: ( ( rule__Joint__Group__0 ) )
            // InternalKinematicsParser.g:303:3: ( rule__Joint__Group__0 )
            {
             before(grammarAccess.getJointAccess().getGroup()); 
            // InternalKinematicsParser.g:304:3: ( rule__Joint__Group__0 )
            // InternalKinematicsParser.g:304:4: rule__Joint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJoint"


    // $ANTLR start "entryRuleParent"
    // InternalKinematicsParser.g:313:1: entryRuleParent : ruleParent EOF ;
    public final void entryRuleParent() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:314:1: ( ruleParent EOF )
            // InternalKinematicsParser.g:315:1: ruleParent EOF
            {
             before(grammarAccess.getParentRule()); 
            pushFollow(FOLLOW_1);
            ruleParent();

            state._fsp--;

             after(grammarAccess.getParentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParent"


    // $ANTLR start "ruleParent"
    // InternalKinematicsParser.g:322:1: ruleParent : ( ( rule__Parent__Group__0 ) ) ;
    public final void ruleParent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:326:2: ( ( ( rule__Parent__Group__0 ) ) )
            // InternalKinematicsParser.g:327:2: ( ( rule__Parent__Group__0 ) )
            {
            // InternalKinematicsParser.g:327:2: ( ( rule__Parent__Group__0 ) )
            // InternalKinematicsParser.g:328:3: ( rule__Parent__Group__0 )
            {
             before(grammarAccess.getParentAccess().getGroup()); 
            // InternalKinematicsParser.g:329:3: ( rule__Parent__Group__0 )
            // InternalKinematicsParser.g:329:4: rule__Parent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParent"


    // $ANTLR start "entryRuleChild"
    // InternalKinematicsParser.g:338:1: entryRuleChild : ruleChild EOF ;
    public final void entryRuleChild() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:339:1: ( ruleChild EOF )
            // InternalKinematicsParser.g:340:1: ruleChild EOF
            {
             before(grammarAccess.getChildRule()); 
            pushFollow(FOLLOW_1);
            ruleChild();

            state._fsp--;

             after(grammarAccess.getChildRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChild"


    // $ANTLR start "ruleChild"
    // InternalKinematicsParser.g:347:1: ruleChild : ( ( rule__Child__Group__0 ) ) ;
    public final void ruleChild() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:351:2: ( ( ( rule__Child__Group__0 ) ) )
            // InternalKinematicsParser.g:352:2: ( ( rule__Child__Group__0 ) )
            {
            // InternalKinematicsParser.g:352:2: ( ( rule__Child__Group__0 ) )
            // InternalKinematicsParser.g:353:3: ( rule__Child__Group__0 )
            {
             before(grammarAccess.getChildAccess().getGroup()); 
            // InternalKinematicsParser.g:354:3: ( rule__Child__Group__0 )
            // InternalKinematicsParser.g:354:4: rule__Child__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Child__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChildAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChild"


    // $ANTLR start "entryRuleLink"
    // InternalKinematicsParser.g:363:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:364:1: ( ruleLink EOF )
            // InternalKinematicsParser.g:365:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalKinematicsParser.g:372:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:376:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalKinematicsParser.g:377:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalKinematicsParser.g:377:2: ( ( rule__Link__Group__0 ) )
            // InternalKinematicsParser.g:378:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalKinematicsParser.g:379:3: ( rule__Link__Group__0 )
            // InternalKinematicsParser.g:379:4: rule__Link__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRulePose"
    // InternalKinematicsParser.g:388:1: entryRulePose : rulePose EOF ;
    public final void entryRulePose() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:389:1: ( rulePose EOF )
            // InternalKinematicsParser.g:390:1: rulePose EOF
            {
             before(grammarAccess.getPoseRule()); 
            pushFollow(FOLLOW_1);
            rulePose();

            state._fsp--;

             after(grammarAccess.getPoseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePose"


    // $ANTLR start "rulePose"
    // InternalKinematicsParser.g:397:1: rulePose : ( ( rule__Pose__Group__0 ) ) ;
    public final void rulePose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:401:2: ( ( ( rule__Pose__Group__0 ) ) )
            // InternalKinematicsParser.g:402:2: ( ( rule__Pose__Group__0 ) )
            {
            // InternalKinematicsParser.g:402:2: ( ( rule__Pose__Group__0 ) )
            // InternalKinematicsParser.g:403:3: ( rule__Pose__Group__0 )
            {
             before(grammarAccess.getPoseAccess().getGroup()); 
            // InternalKinematicsParser.g:404:3: ( rule__Pose__Group__0 )
            // InternalKinematicsParser.g:404:4: rule__Pose__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pose__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPoseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePose"


    // $ANTLR start "entryRuleAxis"
    // InternalKinematicsParser.g:413:1: entryRuleAxis : ruleAxis EOF ;
    public final void entryRuleAxis() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:414:1: ( ruleAxis EOF )
            // InternalKinematicsParser.g:415:1: ruleAxis EOF
            {
             before(grammarAccess.getAxisRule()); 
            pushFollow(FOLLOW_1);
            ruleAxis();

            state._fsp--;

             after(grammarAccess.getAxisRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAxis"


    // $ANTLR start "ruleAxis"
    // InternalKinematicsParser.g:422:1: ruleAxis : ( ( rule__Axis__Group__0 ) ) ;
    public final void ruleAxis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:426:2: ( ( ( rule__Axis__Group__0 ) ) )
            // InternalKinematicsParser.g:427:2: ( ( rule__Axis__Group__0 ) )
            {
            // InternalKinematicsParser.g:427:2: ( ( rule__Axis__Group__0 ) )
            // InternalKinematicsParser.g:428:3: ( rule__Axis__Group__0 )
            {
             before(grammarAccess.getAxisAccess().getGroup()); 
            // InternalKinematicsParser.g:429:3: ( rule__Axis__Group__0 )
            // InternalKinematicsParser.g:429:4: rule__Axis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Axis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAxis"


    // $ANTLR start "entryRuleLimit"
    // InternalKinematicsParser.g:438:1: entryRuleLimit : ruleLimit EOF ;
    public final void entryRuleLimit() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:439:1: ( ruleLimit EOF )
            // InternalKinematicsParser.g:440:1: ruleLimit EOF
            {
             before(grammarAccess.getLimitRule()); 
            pushFollow(FOLLOW_1);
            ruleLimit();

            state._fsp--;

             after(grammarAccess.getLimitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLimit"


    // $ANTLR start "ruleLimit"
    // InternalKinematicsParser.g:447:1: ruleLimit : ( ( rule__Limit__Group__0 ) ) ;
    public final void ruleLimit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:451:2: ( ( ( rule__Limit__Group__0 ) ) )
            // InternalKinematicsParser.g:452:2: ( ( rule__Limit__Group__0 ) )
            {
            // InternalKinematicsParser.g:452:2: ( ( rule__Limit__Group__0 ) )
            // InternalKinematicsParser.g:453:3: ( rule__Limit__Group__0 )
            {
             before(grammarAccess.getLimitAccess().getGroup()); 
            // InternalKinematicsParser.g:454:3: ( rule__Limit__Group__0 )
            // InternalKinematicsParser.g:454:4: rule__Limit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLimit"


    // $ANTLR start "entryRuleInertial"
    // InternalKinematicsParser.g:463:1: entryRuleInertial : ruleInertial EOF ;
    public final void entryRuleInertial() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:464:1: ( ruleInertial EOF )
            // InternalKinematicsParser.g:465:1: ruleInertial EOF
            {
             before(grammarAccess.getInertialRule()); 
            pushFollow(FOLLOW_1);
            ruleInertial();

            state._fsp--;

             after(grammarAccess.getInertialRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInertial"


    // $ANTLR start "ruleInertial"
    // InternalKinematicsParser.g:472:1: ruleInertial : ( ( rule__Inertial__Group__0 ) ) ;
    public final void ruleInertial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:476:2: ( ( ( rule__Inertial__Group__0 ) ) )
            // InternalKinematicsParser.g:477:2: ( ( rule__Inertial__Group__0 ) )
            {
            // InternalKinematicsParser.g:477:2: ( ( rule__Inertial__Group__0 ) )
            // InternalKinematicsParser.g:478:3: ( rule__Inertial__Group__0 )
            {
             before(grammarAccess.getInertialAccess().getGroup()); 
            // InternalKinematicsParser.g:479:3: ( rule__Inertial__Group__0 )
            // InternalKinematicsParser.g:479:4: rule__Inertial__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInertial"


    // $ANTLR start "entryRuleVisual"
    // InternalKinematicsParser.g:488:1: entryRuleVisual : ruleVisual EOF ;
    public final void entryRuleVisual() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:489:1: ( ruleVisual EOF )
            // InternalKinematicsParser.g:490:1: ruleVisual EOF
            {
             before(grammarAccess.getVisualRule()); 
            pushFollow(FOLLOW_1);
            ruleVisual();

            state._fsp--;

             after(grammarAccess.getVisualRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVisual"


    // $ANTLR start "ruleVisual"
    // InternalKinematicsParser.g:497:1: ruleVisual : ( ( rule__Visual__Group__0 ) ) ;
    public final void ruleVisual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:501:2: ( ( ( rule__Visual__Group__0 ) ) )
            // InternalKinematicsParser.g:502:2: ( ( rule__Visual__Group__0 ) )
            {
            // InternalKinematicsParser.g:502:2: ( ( rule__Visual__Group__0 ) )
            // InternalKinematicsParser.g:503:3: ( rule__Visual__Group__0 )
            {
             before(grammarAccess.getVisualAccess().getGroup()); 
            // InternalKinematicsParser.g:504:3: ( rule__Visual__Group__0 )
            // InternalKinematicsParser.g:504:4: rule__Visual__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Visual__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVisualAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisual"


    // $ANTLR start "entryRuleCollision"
    // InternalKinematicsParser.g:513:1: entryRuleCollision : ruleCollision EOF ;
    public final void entryRuleCollision() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:514:1: ( ruleCollision EOF )
            // InternalKinematicsParser.g:515:1: ruleCollision EOF
            {
             before(grammarAccess.getCollisionRule()); 
            pushFollow(FOLLOW_1);
            ruleCollision();

            state._fsp--;

             after(grammarAccess.getCollisionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCollision"


    // $ANTLR start "ruleCollision"
    // InternalKinematicsParser.g:522:1: ruleCollision : ( ( rule__Collision__Group__0 ) ) ;
    public final void ruleCollision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:526:2: ( ( ( rule__Collision__Group__0 ) ) )
            // InternalKinematicsParser.g:527:2: ( ( rule__Collision__Group__0 ) )
            {
            // InternalKinematicsParser.g:527:2: ( ( rule__Collision__Group__0 ) )
            // InternalKinematicsParser.g:528:3: ( rule__Collision__Group__0 )
            {
             before(grammarAccess.getCollisionAccess().getGroup()); 
            // InternalKinematicsParser.g:529:3: ( rule__Collision__Group__0 )
            // InternalKinematicsParser.g:529:4: rule__Collision__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Collision__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollision"


    // $ANTLR start "entryRuleMass"
    // InternalKinematicsParser.g:538:1: entryRuleMass : ruleMass EOF ;
    public final void entryRuleMass() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:539:1: ( ruleMass EOF )
            // InternalKinematicsParser.g:540:1: ruleMass EOF
            {
             before(grammarAccess.getMassRule()); 
            pushFollow(FOLLOW_1);
            ruleMass();

            state._fsp--;

             after(grammarAccess.getMassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMass"


    // $ANTLR start "ruleMass"
    // InternalKinematicsParser.g:547:1: ruleMass : ( ( rule__Mass__Group__0 ) ) ;
    public final void ruleMass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:551:2: ( ( ( rule__Mass__Group__0 ) ) )
            // InternalKinematicsParser.g:552:2: ( ( rule__Mass__Group__0 ) )
            {
            // InternalKinematicsParser.g:552:2: ( ( rule__Mass__Group__0 ) )
            // InternalKinematicsParser.g:553:3: ( rule__Mass__Group__0 )
            {
             before(grammarAccess.getMassAccess().getGroup()); 
            // InternalKinematicsParser.g:554:3: ( rule__Mass__Group__0 )
            // InternalKinematicsParser.g:554:4: rule__Mass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMass"


    // $ANTLR start "entryRuleInertia"
    // InternalKinematicsParser.g:563:1: entryRuleInertia : ruleInertia EOF ;
    public final void entryRuleInertia() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:564:1: ( ruleInertia EOF )
            // InternalKinematicsParser.g:565:1: ruleInertia EOF
            {
             before(grammarAccess.getInertiaRule()); 
            pushFollow(FOLLOW_1);
            ruleInertia();

            state._fsp--;

             after(grammarAccess.getInertiaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInertia"


    // $ANTLR start "ruleInertia"
    // InternalKinematicsParser.g:572:1: ruleInertia : ( ( rule__Inertia__Group__0 ) ) ;
    public final void ruleInertia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:576:2: ( ( ( rule__Inertia__Group__0 ) ) )
            // InternalKinematicsParser.g:577:2: ( ( rule__Inertia__Group__0 ) )
            {
            // InternalKinematicsParser.g:577:2: ( ( rule__Inertia__Group__0 ) )
            // InternalKinematicsParser.g:578:3: ( rule__Inertia__Group__0 )
            {
             before(grammarAccess.getInertiaAccess().getGroup()); 
            // InternalKinematicsParser.g:579:3: ( rule__Inertia__Group__0 )
            // InternalKinematicsParser.g:579:4: rule__Inertia__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInertia"


    // $ANTLR start "entryRuleGeometry"
    // InternalKinematicsParser.g:588:1: entryRuleGeometry : ruleGeometry EOF ;
    public final void entryRuleGeometry() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:589:1: ( ruleGeometry EOF )
            // InternalKinematicsParser.g:590:1: ruleGeometry EOF
            {
             before(grammarAccess.getGeometryRule()); 
            pushFollow(FOLLOW_1);
            ruleGeometry();

            state._fsp--;

             after(grammarAccess.getGeometryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeometry"


    // $ANTLR start "ruleGeometry"
    // InternalKinematicsParser.g:597:1: ruleGeometry : ( ( rule__Geometry__Group__0 ) ) ;
    public final void ruleGeometry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:601:2: ( ( ( rule__Geometry__Group__0 ) ) )
            // InternalKinematicsParser.g:602:2: ( ( rule__Geometry__Group__0 ) )
            {
            // InternalKinematicsParser.g:602:2: ( ( rule__Geometry__Group__0 ) )
            // InternalKinematicsParser.g:603:3: ( rule__Geometry__Group__0 )
            {
             before(grammarAccess.getGeometryAccess().getGroup()); 
            // InternalKinematicsParser.g:604:3: ( rule__Geometry__Group__0 )
            // InternalKinematicsParser.g:604:4: rule__Geometry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeometryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeometry"


    // $ANTLR start "entryRuleBox"
    // InternalKinematicsParser.g:613:1: entryRuleBox : ruleBox EOF ;
    public final void entryRuleBox() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:614:1: ( ruleBox EOF )
            // InternalKinematicsParser.g:615:1: ruleBox EOF
            {
             before(grammarAccess.getBoxRule()); 
            pushFollow(FOLLOW_1);
            ruleBox();

            state._fsp--;

             after(grammarAccess.getBoxRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBox"


    // $ANTLR start "ruleBox"
    // InternalKinematicsParser.g:622:1: ruleBox : ( ( rule__Box__Group__0 ) ) ;
    public final void ruleBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:626:2: ( ( ( rule__Box__Group__0 ) ) )
            // InternalKinematicsParser.g:627:2: ( ( rule__Box__Group__0 ) )
            {
            // InternalKinematicsParser.g:627:2: ( ( rule__Box__Group__0 ) )
            // InternalKinematicsParser.g:628:3: ( rule__Box__Group__0 )
            {
             before(grammarAccess.getBoxAccess().getGroup()); 
            // InternalKinematicsParser.g:629:3: ( rule__Box__Group__0 )
            // InternalKinematicsParser.g:629:4: rule__Box__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleCylinder"
    // InternalKinematicsParser.g:638:1: entryRuleCylinder : ruleCylinder EOF ;
    public final void entryRuleCylinder() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:639:1: ( ruleCylinder EOF )
            // InternalKinematicsParser.g:640:1: ruleCylinder EOF
            {
             before(grammarAccess.getCylinderRule()); 
            pushFollow(FOLLOW_1);
            ruleCylinder();

            state._fsp--;

             after(grammarAccess.getCylinderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCylinder"


    // $ANTLR start "ruleCylinder"
    // InternalKinematicsParser.g:647:1: ruleCylinder : ( ( rule__Cylinder__Group__0 ) ) ;
    public final void ruleCylinder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:651:2: ( ( ( rule__Cylinder__Group__0 ) ) )
            // InternalKinematicsParser.g:652:2: ( ( rule__Cylinder__Group__0 ) )
            {
            // InternalKinematicsParser.g:652:2: ( ( rule__Cylinder__Group__0 ) )
            // InternalKinematicsParser.g:653:3: ( rule__Cylinder__Group__0 )
            {
             before(grammarAccess.getCylinderAccess().getGroup()); 
            // InternalKinematicsParser.g:654:3: ( rule__Cylinder__Group__0 )
            // InternalKinematicsParser.g:654:4: rule__Cylinder__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCylinder"


    // $ANTLR start "entryRuleSphere"
    // InternalKinematicsParser.g:663:1: entryRuleSphere : ruleSphere EOF ;
    public final void entryRuleSphere() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:664:1: ( ruleSphere EOF )
            // InternalKinematicsParser.g:665:1: ruleSphere EOF
            {
             before(grammarAccess.getSphereRule()); 
            pushFollow(FOLLOW_1);
            ruleSphere();

            state._fsp--;

             after(grammarAccess.getSphereRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSphere"


    // $ANTLR start "ruleSphere"
    // InternalKinematicsParser.g:672:1: ruleSphere : ( ( rule__Sphere__Group__0 ) ) ;
    public final void ruleSphere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:676:2: ( ( ( rule__Sphere__Group__0 ) ) )
            // InternalKinematicsParser.g:677:2: ( ( rule__Sphere__Group__0 ) )
            {
            // InternalKinematicsParser.g:677:2: ( ( rule__Sphere__Group__0 ) )
            // InternalKinematicsParser.g:678:3: ( rule__Sphere__Group__0 )
            {
             before(grammarAccess.getSphereAccess().getGroup()); 
            // InternalKinematicsParser.g:679:3: ( rule__Sphere__Group__0 )
            // InternalKinematicsParser.g:679:4: rule__Sphere__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSphereAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSphere"


    // $ANTLR start "entryRuleMesh"
    // InternalKinematicsParser.g:688:1: entryRuleMesh : ruleMesh EOF ;
    public final void entryRuleMesh() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:689:1: ( ruleMesh EOF )
            // InternalKinematicsParser.g:690:1: ruleMesh EOF
            {
             before(grammarAccess.getMeshRule()); 
            pushFollow(FOLLOW_1);
            ruleMesh();

            state._fsp--;

             after(grammarAccess.getMeshRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMesh"


    // $ANTLR start "ruleMesh"
    // InternalKinematicsParser.g:697:1: ruleMesh : ( ( rule__Mesh__Group__0 ) ) ;
    public final void ruleMesh() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:701:2: ( ( ( rule__Mesh__Group__0 ) ) )
            // InternalKinematicsParser.g:702:2: ( ( rule__Mesh__Group__0 ) )
            {
            // InternalKinematicsParser.g:702:2: ( ( rule__Mesh__Group__0 ) )
            // InternalKinematicsParser.g:703:3: ( rule__Mesh__Group__0 )
            {
             before(grammarAccess.getMeshAccess().getGroup()); 
            // InternalKinematicsParser.g:704:3: ( rule__Mesh__Group__0 )
            // InternalKinematicsParser.g:704:4: rule__Mesh__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeshAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMesh"


    // $ANTLR start "entryRuleEString"
    // InternalKinematicsParser.g:713:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:714:1: ( ruleEString EOF )
            // InternalKinematicsParser.g:715:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalKinematicsParser.g:722:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:726:2: ( ( RULE_STRING ) )
            // InternalKinematicsParser.g:727:2: ( RULE_STRING )
            {
            // InternalKinematicsParser.g:727:2: ( RULE_STRING )
            // InternalKinematicsParser.g:728:3: RULE_STRING
            {
             before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleDouble0"
    // InternalKinematicsParser.g:738:1: entryRuleDouble0 : ruleDouble0 EOF ;
    public final void entryRuleDouble0() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:739:1: ( ruleDouble0 EOF )
            // InternalKinematicsParser.g:740:1: ruleDouble0 EOF
            {
             before(grammarAccess.getDouble0Rule()); 
            pushFollow(FOLLOW_1);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getDouble0Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDouble0"


    // $ANTLR start "ruleDouble0"
    // InternalKinematicsParser.g:747:1: ruleDouble0 : ( RULE_DOUBLE ) ;
    public final void ruleDouble0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:751:2: ( ( RULE_DOUBLE ) )
            // InternalKinematicsParser.g:752:2: ( RULE_DOUBLE )
            {
            // InternalKinematicsParser.g:752:2: ( RULE_DOUBLE )
            // InternalKinematicsParser.g:753:3: RULE_DOUBLE
            {
             before(grammarAccess.getDouble0Access().getDOUBLETerminalRuleCall()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getDouble0Access().getDOUBLETerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDouble0"


    // $ANTLR start "rule__Component__Alternatives_9"
    // InternalKinematicsParser.g:762:1: rule__Component__Alternatives_9 : ( ( ( rule__Component__Group_9_0__0 ) ) | ( ( rule__Component__BaseAttachmentAssignment_9_1 ) ) );
    public final void rule__Component__Alternatives_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:766:1: ( ( ( rule__Component__Group_9_0__0 ) ) | ( ( rule__Component__BaseAttachmentAssignment_9_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==BaseAttachment) ) {
                alt1=1;
            }
            else if ( (LA1_0==HyphenMinus) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalKinematicsParser.g:767:2: ( ( rule__Component__Group_9_0__0 ) )
                    {
                    // InternalKinematicsParser.g:767:2: ( ( rule__Component__Group_9_0__0 ) )
                    // InternalKinematicsParser.g:768:3: ( rule__Component__Group_9_0__0 )
                    {
                     before(grammarAccess.getComponentAccess().getGroup_9_0()); 
                    // InternalKinematicsParser.g:769:3: ( rule__Component__Group_9_0__0 )
                    // InternalKinematicsParser.g:769:4: rule__Component__Group_9_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_9_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getGroup_9_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKinematicsParser.g:773:2: ( ( rule__Component__BaseAttachmentAssignment_9_1 ) )
                    {
                    // InternalKinematicsParser.g:773:2: ( ( rule__Component__BaseAttachmentAssignment_9_1 ) )
                    // InternalKinematicsParser.g:774:3: ( rule__Component__BaseAttachmentAssignment_9_1 )
                    {
                     before(grammarAccess.getComponentAccess().getBaseAttachmentAssignment_9_1()); 
                    // InternalKinematicsParser.g:775:3: ( rule__Component__BaseAttachmentAssignment_9_1 )
                    // InternalKinematicsParser.g:775:4: rule__Component__BaseAttachmentAssignment_9_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__BaseAttachmentAssignment_9_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getBaseAttachmentAssignment_9_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Alternatives_9"


    // $ANTLR start "rule__Component__Alternatives_10"
    // InternalKinematicsParser.g:783:1: rule__Component__Alternatives_10 : ( ( ( rule__Component__Group_10_0__0 ) ) | ( ( rule__Component__FlangeAttachmentAssignment_10_1 ) ) );
    public final void rule__Component__Alternatives_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:787:1: ( ( ( rule__Component__Group_10_0__0 ) ) | ( ( rule__Component__FlangeAttachmentAssignment_10_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==FlangeAttachment) ) {
                alt2=1;
            }
            else if ( (LA2_0==HyphenMinus) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalKinematicsParser.g:788:2: ( ( rule__Component__Group_10_0__0 ) )
                    {
                    // InternalKinematicsParser.g:788:2: ( ( rule__Component__Group_10_0__0 ) )
                    // InternalKinematicsParser.g:789:3: ( rule__Component__Group_10_0__0 )
                    {
                     before(grammarAccess.getComponentAccess().getGroup_10_0()); 
                    // InternalKinematicsParser.g:790:3: ( rule__Component__Group_10_0__0 )
                    // InternalKinematicsParser.g:790:4: rule__Component__Group_10_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_10_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getGroup_10_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKinematicsParser.g:794:2: ( ( rule__Component__FlangeAttachmentAssignment_10_1 ) )
                    {
                    // InternalKinematicsParser.g:794:2: ( ( rule__Component__FlangeAttachmentAssignment_10_1 ) )
                    // InternalKinematicsParser.g:795:3: ( rule__Component__FlangeAttachmentAssignment_10_1 )
                    {
                     before(grammarAccess.getComponentAccess().getFlangeAttachmentAssignment_10_1()); 
                    // InternalKinematicsParser.g:796:3: ( rule__Component__FlangeAttachmentAssignment_10_1 )
                    // InternalKinematicsParser.g:796:4: rule__Component__FlangeAttachmentAssignment_10_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__FlangeAttachmentAssignment_10_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getFlangeAttachmentAssignment_10_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Alternatives_10"


    // $ANTLR start "rule__Component__Alternatives_11"
    // InternalKinematicsParser.g:804:1: rule__Component__Alternatives_11 : ( ( ( rule__Component__Group_11_0__0 ) ) | ( ( rule__Component__ComponentAssignment_11_1 ) ) );
    public final void rule__Component__Alternatives_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:808:1: ( ( ( rule__Component__Group_11_0__0 ) ) | ( ( rule__Component__ComponentAssignment_11_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Component) ) {
                alt3=1;
            }
            else if ( (LA3_0==HyphenMinus) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalKinematicsParser.g:809:2: ( ( rule__Component__Group_11_0__0 ) )
                    {
                    // InternalKinematicsParser.g:809:2: ( ( rule__Component__Group_11_0__0 ) )
                    // InternalKinematicsParser.g:810:3: ( rule__Component__Group_11_0__0 )
                    {
                     before(grammarAccess.getComponentAccess().getGroup_11_0()); 
                    // InternalKinematicsParser.g:811:3: ( rule__Component__Group_11_0__0 )
                    // InternalKinematicsParser.g:811:4: rule__Component__Group_11_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_11_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getGroup_11_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKinematicsParser.g:815:2: ( ( rule__Component__ComponentAssignment_11_1 ) )
                    {
                    // InternalKinematicsParser.g:815:2: ( ( rule__Component__ComponentAssignment_11_1 ) )
                    // InternalKinematicsParser.g:816:3: ( rule__Component__ComponentAssignment_11_1 )
                    {
                     before(grammarAccess.getComponentAccess().getComponentAssignment_11_1()); 
                    // InternalKinematicsParser.g:817:3: ( rule__Component__ComponentAssignment_11_1 )
                    // InternalKinematicsParser.g:817:4: rule__Component__ComponentAssignment_11_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__ComponentAssignment_11_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getComponentAssignment_11_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Alternatives_11"


    // $ANTLR start "rule__Component__Alternatives_12"
    // InternalKinematicsParser.g:825:1: rule__Component__Alternatives_12 : ( ( ( rule__Component__Group_12_0__0 ) ) | ( ( rule__Component__ConnectionAssignment_12_1 ) ) );
    public final void rule__Component__Alternatives_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:829:1: ( ( ( rule__Component__Group_12_0__0 ) ) | ( ( rule__Component__ConnectionAssignment_12_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Connection) ) {
                alt4=1;
            }
            else if ( (LA4_0==HyphenMinus) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalKinematicsParser.g:830:2: ( ( rule__Component__Group_12_0__0 ) )
                    {
                    // InternalKinematicsParser.g:830:2: ( ( rule__Component__Group_12_0__0 ) )
                    // InternalKinematicsParser.g:831:3: ( rule__Component__Group_12_0__0 )
                    {
                     before(grammarAccess.getComponentAccess().getGroup_12_0()); 
                    // InternalKinematicsParser.g:832:3: ( rule__Component__Group_12_0__0 )
                    // InternalKinematicsParser.g:832:4: rule__Component__Group_12_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_12_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getGroup_12_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKinematicsParser.g:836:2: ( ( rule__Component__ConnectionAssignment_12_1 ) )
                    {
                    // InternalKinematicsParser.g:836:2: ( ( rule__Component__ConnectionAssignment_12_1 ) )
                    // InternalKinematicsParser.g:837:3: ( rule__Component__ConnectionAssignment_12_1 )
                    {
                     before(grammarAccess.getComponentAccess().getConnectionAssignment_12_1()); 
                    // InternalKinematicsParser.g:838:3: ( rule__Component__ConnectionAssignment_12_1 )
                    // InternalKinematicsParser.g:838:4: rule__Component__ConnectionAssignment_12_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__ConnectionAssignment_12_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getConnectionAssignment_12_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Alternatives_12"


    // $ANTLR start "rule__Component__Alternatives_13"
    // InternalKinematicsParser.g:846:1: rule__Component__Alternatives_13 : ( ( ( rule__Component__Group_13_0__0 ) ) | ( ( rule__Component__GroupAssignment_13_1 ) ) );
    public final void rule__Component__Alternatives_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:850:1: ( ( ( rule__Component__Group_13_0__0 ) ) | ( ( rule__Component__GroupAssignment_13_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Group) ) {
                alt5=1;
            }
            else if ( (LA5_0==HyphenMinus) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalKinematicsParser.g:851:2: ( ( rule__Component__Group_13_0__0 ) )
                    {
                    // InternalKinematicsParser.g:851:2: ( ( rule__Component__Group_13_0__0 ) )
                    // InternalKinematicsParser.g:852:3: ( rule__Component__Group_13_0__0 )
                    {
                     before(grammarAccess.getComponentAccess().getGroup_13_0()); 
                    // InternalKinematicsParser.g:853:3: ( rule__Component__Group_13_0__0 )
                    // InternalKinematicsParser.g:853:4: rule__Component__Group_13_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_13_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getGroup_13_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKinematicsParser.g:857:2: ( ( rule__Component__GroupAssignment_13_1 ) )
                    {
                    // InternalKinematicsParser.g:857:2: ( ( rule__Component__GroupAssignment_13_1 ) )
                    // InternalKinematicsParser.g:858:3: ( rule__Component__GroupAssignment_13_1 )
                    {
                     before(grammarAccess.getComponentAccess().getGroupAssignment_13_1()); 
                    // InternalKinematicsParser.g:859:3: ( rule__Component__GroupAssignment_13_1 )
                    // InternalKinematicsParser.g:859:4: rule__Component__GroupAssignment_13_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__GroupAssignment_13_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getGroupAssignment_13_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Alternatives_13"


    // $ANTLR start "rule__Component__Alternatives_14"
    // InternalKinematicsParser.g:867:1: rule__Component__Alternatives_14 : ( ( ( rule__Component__Group_14_0__0 ) ) | ( ( rule__Component__LinkAssignment_14_1 ) ) );
    public final void rule__Component__Alternatives_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:871:1: ( ( ( rule__Component__Group_14_0__0 ) ) | ( ( rule__Component__LinkAssignment_14_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Link) ) {
                alt6=1;
            }
            else if ( (LA6_0==HyphenMinus) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalKinematicsParser.g:872:2: ( ( rule__Component__Group_14_0__0 ) )
                    {
                    // InternalKinematicsParser.g:872:2: ( ( rule__Component__Group_14_0__0 ) )
                    // InternalKinematicsParser.g:873:3: ( rule__Component__Group_14_0__0 )
                    {
                     before(grammarAccess.getComponentAccess().getGroup_14_0()); 
                    // InternalKinematicsParser.g:874:3: ( rule__Component__Group_14_0__0 )
                    // InternalKinematicsParser.g:874:4: rule__Component__Group_14_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_14_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getGroup_14_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKinematicsParser.g:878:2: ( ( rule__Component__LinkAssignment_14_1 ) )
                    {
                    // InternalKinematicsParser.g:878:2: ( ( rule__Component__LinkAssignment_14_1 ) )
                    // InternalKinematicsParser.g:879:3: ( rule__Component__LinkAssignment_14_1 )
                    {
                     before(grammarAccess.getComponentAccess().getLinkAssignment_14_1()); 
                    // InternalKinematicsParser.g:880:3: ( rule__Component__LinkAssignment_14_1 )
                    // InternalKinematicsParser.g:880:4: rule__Component__LinkAssignment_14_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__LinkAssignment_14_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getLinkAssignment_14_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Alternatives_14"


    // $ANTLR start "rule__Component__Alternatives_15"
    // InternalKinematicsParser.g:888:1: rule__Component__Alternatives_15 : ( ( ( rule__Component__Group_15_0__0 ) ) | ( ( rule__Component__JointAssignment_15_1 ) ) );
    public final void rule__Component__Alternatives_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:892:1: ( ( ( rule__Component__Group_15_0__0 ) ) | ( ( rule__Component__JointAssignment_15_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Joint) ) {
                alt7=1;
            }
            else if ( (LA7_0==HyphenMinus) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalKinematicsParser.g:893:2: ( ( rule__Component__Group_15_0__0 ) )
                    {
                    // InternalKinematicsParser.g:893:2: ( ( rule__Component__Group_15_0__0 ) )
                    // InternalKinematicsParser.g:894:3: ( rule__Component__Group_15_0__0 )
                    {
                     before(grammarAccess.getComponentAccess().getGroup_15_0()); 
                    // InternalKinematicsParser.g:895:3: ( rule__Component__Group_15_0__0 )
                    // InternalKinematicsParser.g:895:4: rule__Component__Group_15_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_15_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getGroup_15_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKinematicsParser.g:899:2: ( ( rule__Component__JointAssignment_15_1 ) )
                    {
                    // InternalKinematicsParser.g:899:2: ( ( rule__Component__JointAssignment_15_1 ) )
                    // InternalKinematicsParser.g:900:3: ( rule__Component__JointAssignment_15_1 )
                    {
                     before(grammarAccess.getComponentAccess().getJointAssignment_15_1()); 
                    // InternalKinematicsParser.g:901:3: ( rule__Component__JointAssignment_15_1 )
                    // InternalKinematicsParser.g:901:4: rule__Component__JointAssignment_15_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__JointAssignment_15_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getJointAssignment_15_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Alternatives_15"


    // $ANTLR start "rule__Component__Group__0"
    // InternalKinematicsParser.g:909:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:913:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalKinematicsParser.g:914:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalKinematicsParser.g:921:1: rule__Component__Group__0__Impl : ( () ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:925:1: ( ( () ) )
            // InternalKinematicsParser.g:926:1: ( () )
            {
            // InternalKinematicsParser.g:926:1: ( () )
            // InternalKinematicsParser.g:927:2: ()
            {
             before(grammarAccess.getComponentAccess().getComponentAction_0()); 
            // InternalKinematicsParser.g:928:2: ()
            // InternalKinematicsParser.g:928:3: 
            {
            }

             after(grammarAccess.getComponentAccess().getComponentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalKinematicsParser.g:936:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:940:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalKinematicsParser.g:941:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalKinematicsParser.g:948:1: rule__Component__Group__1__Impl : ( Component ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:952:1: ( ( Component ) )
            // InternalKinematicsParser.g:953:1: ( Component )
            {
            // InternalKinematicsParser.g:953:1: ( Component )
            // InternalKinematicsParser.g:954:2: Component
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_1()); 
            match(input,Component,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalKinematicsParser.g:963:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:967:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalKinematicsParser.g:968:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // InternalKinematicsParser.g:975:1: rule__Component__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:979:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:980:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:980:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:981:2: RULE_BEGIN
            {
             before(grammarAccess.getComponentAccess().getBEGINTerminalRuleCall_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getBEGINTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // InternalKinematicsParser.g:990:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:994:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalKinematicsParser.g:995:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // InternalKinematicsParser.g:1002:1: rule__Component__Group__3__Impl : ( Name ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1006:1: ( ( Name ) )
            // InternalKinematicsParser.g:1007:1: ( Name )
            {
            // InternalKinematicsParser.g:1007:1: ( Name )
            // InternalKinematicsParser.g:1008:2: Name
            {
             before(grammarAccess.getComponentAccess().getNameKeyword_3()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // InternalKinematicsParser.g:1017:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1021:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalKinematicsParser.g:1022:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Component__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // InternalKinematicsParser.g:1029:1: rule__Component__Group__4__Impl : ( ( rule__Component__NameAssignment_4 ) ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1033:1: ( ( ( rule__Component__NameAssignment_4 ) ) )
            // InternalKinematicsParser.g:1034:1: ( ( rule__Component__NameAssignment_4 ) )
            {
            // InternalKinematicsParser.g:1034:1: ( ( rule__Component__NameAssignment_4 ) )
            // InternalKinematicsParser.g:1035:2: ( rule__Component__NameAssignment_4 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_4()); 
            // InternalKinematicsParser.g:1036:2: ( rule__Component__NameAssignment_4 )
            // InternalKinematicsParser.g:1036:3: rule__Component__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__Component__Group__5"
    // InternalKinematicsParser.g:1044:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1048:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalKinematicsParser.g:1049:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Component__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5"


    // $ANTLR start "rule__Component__Group__5__Impl"
    // InternalKinematicsParser.g:1056:1: rule__Component__Group__5__Impl : ( Version ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1060:1: ( ( Version ) )
            // InternalKinematicsParser.g:1061:1: ( Version )
            {
            // InternalKinematicsParser.g:1061:1: ( Version )
            // InternalKinematicsParser.g:1062:2: Version
            {
             before(grammarAccess.getComponentAccess().getVersionKeyword_5()); 
            match(input,Version,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getVersionKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5__Impl"


    // $ANTLR start "rule__Component__Group__6"
    // InternalKinematicsParser.g:1071:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1075:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // InternalKinematicsParser.g:1076:2: rule__Component__Group__6__Impl rule__Component__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Component__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__6"


    // $ANTLR start "rule__Component__Group__6__Impl"
    // InternalKinematicsParser.g:1083:1: rule__Component__Group__6__Impl : ( ( rule__Component__VersionAssignment_6 ) ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1087:1: ( ( ( rule__Component__VersionAssignment_6 ) ) )
            // InternalKinematicsParser.g:1088:1: ( ( rule__Component__VersionAssignment_6 ) )
            {
            // InternalKinematicsParser.g:1088:1: ( ( rule__Component__VersionAssignment_6 ) )
            // InternalKinematicsParser.g:1089:2: ( rule__Component__VersionAssignment_6 )
            {
             before(grammarAccess.getComponentAccess().getVersionAssignment_6()); 
            // InternalKinematicsParser.g:1090:2: ( rule__Component__VersionAssignment_6 )
            // InternalKinematicsParser.g:1090:3: rule__Component__VersionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Component__VersionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getVersionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__6__Impl"


    // $ANTLR start "rule__Component__Group__7"
    // InternalKinematicsParser.g:1098:1: rule__Component__Group__7 : rule__Component__Group__7__Impl rule__Component__Group__8 ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1102:1: ( rule__Component__Group__7__Impl rule__Component__Group__8 )
            // InternalKinematicsParser.g:1103:2: rule__Component__Group__7__Impl rule__Component__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Component__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__7"


    // $ANTLR start "rule__Component__Group__7__Impl"
    // InternalKinematicsParser.g:1110:1: rule__Component__Group__7__Impl : ( ( rule__Component__Group_7__0 )? ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1114:1: ( ( ( rule__Component__Group_7__0 )? ) )
            // InternalKinematicsParser.g:1115:1: ( ( rule__Component__Group_7__0 )? )
            {
            // InternalKinematicsParser.g:1115:1: ( ( rule__Component__Group_7__0 )? )
            // InternalKinematicsParser.g:1116:2: ( rule__Component__Group_7__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_7()); 
            // InternalKinematicsParser.g:1117:2: ( rule__Component__Group_7__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Category) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalKinematicsParser.g:1117:3: rule__Component__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__7__Impl"


    // $ANTLR start "rule__Component__Group__8"
    // InternalKinematicsParser.g:1125:1: rule__Component__Group__8 : rule__Component__Group__8__Impl rule__Component__Group__9 ;
    public final void rule__Component__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1129:1: ( rule__Component__Group__8__Impl rule__Component__Group__9 )
            // InternalKinematicsParser.g:1130:2: rule__Component__Group__8__Impl rule__Component__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__Component__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__8"


    // $ANTLR start "rule__Component__Group__8__Impl"
    // InternalKinematicsParser.g:1137:1: rule__Component__Group__8__Impl : ( ( rule__Component__Group_8__0 )? ) ;
    public final void rule__Component__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1141:1: ( ( ( rule__Component__Group_8__0 )? ) )
            // InternalKinematicsParser.g:1142:1: ( ( rule__Component__Group_8__0 )? )
            {
            // InternalKinematicsParser.g:1142:1: ( ( rule__Component__Group_8__0 )? )
            // InternalKinematicsParser.g:1143:2: ( rule__Component__Group_8__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_8()); 
            // InternalKinematicsParser.g:1144:2: ( rule__Component__Group_8__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==GitRepo) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKinematicsParser.g:1144:3: rule__Component__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__8__Impl"


    // $ANTLR start "rule__Component__Group__9"
    // InternalKinematicsParser.g:1152:1: rule__Component__Group__9 : rule__Component__Group__9__Impl rule__Component__Group__10 ;
    public final void rule__Component__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1156:1: ( rule__Component__Group__9__Impl rule__Component__Group__10 )
            // InternalKinematicsParser.g:1157:2: rule__Component__Group__9__Impl rule__Component__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__Component__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__9"


    // $ANTLR start "rule__Component__Group__9__Impl"
    // InternalKinematicsParser.g:1164:1: rule__Component__Group__9__Impl : ( ( rule__Component__Alternatives_9 )? ) ;
    public final void rule__Component__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1168:1: ( ( ( rule__Component__Alternatives_9 )? ) )
            // InternalKinematicsParser.g:1169:1: ( ( rule__Component__Alternatives_9 )? )
            {
            // InternalKinematicsParser.g:1169:1: ( ( rule__Component__Alternatives_9 )? )
            // InternalKinematicsParser.g:1170:2: ( rule__Component__Alternatives_9 )?
            {
             before(grammarAccess.getComponentAccess().getAlternatives_9()); 
            // InternalKinematicsParser.g:1171:2: ( rule__Component__Alternatives_9 )?
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalKinematicsParser.g:1171:3: rule__Component__Alternatives_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Alternatives_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getAlternatives_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__9__Impl"


    // $ANTLR start "rule__Component__Group__10"
    // InternalKinematicsParser.g:1179:1: rule__Component__Group__10 : rule__Component__Group__10__Impl rule__Component__Group__11 ;
    public final void rule__Component__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1183:1: ( rule__Component__Group__10__Impl rule__Component__Group__11 )
            // InternalKinematicsParser.g:1184:2: rule__Component__Group__10__Impl rule__Component__Group__11
            {
            pushFollow(FOLLOW_8);
            rule__Component__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__10"


    // $ANTLR start "rule__Component__Group__10__Impl"
    // InternalKinematicsParser.g:1191:1: rule__Component__Group__10__Impl : ( ( rule__Component__Alternatives_10 )? ) ;
    public final void rule__Component__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1195:1: ( ( ( rule__Component__Alternatives_10 )? ) )
            // InternalKinematicsParser.g:1196:1: ( ( rule__Component__Alternatives_10 )? )
            {
            // InternalKinematicsParser.g:1196:1: ( ( rule__Component__Alternatives_10 )? )
            // InternalKinematicsParser.g:1197:2: ( rule__Component__Alternatives_10 )?
            {
             before(grammarAccess.getComponentAccess().getAlternatives_10()); 
            // InternalKinematicsParser.g:1198:2: ( rule__Component__Alternatives_10 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==FlangeAttachment) ) {
                alt11=1;
            }
            else if ( (LA11_0==HyphenMinus) ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==Name) ) {
                    int LA11_4 = input.LA(3);

                    if ( (LA11_4==RULE_STRING) ) {
                        int LA11_5 = input.LA(4);

                        if ( (LA11_5==RULE_BEGIN) ) {
                            int LA11_6 = input.LA(5);

                            if ( (LA11_6==Origin) ) {
                                alt11=1;
                            }
                        }
                    }
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalKinematicsParser.g:1198:3: rule__Component__Alternatives_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Alternatives_10();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getAlternatives_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__10__Impl"


    // $ANTLR start "rule__Component__Group__11"
    // InternalKinematicsParser.g:1206:1: rule__Component__Group__11 : rule__Component__Group__11__Impl rule__Component__Group__12 ;
    public final void rule__Component__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1210:1: ( rule__Component__Group__11__Impl rule__Component__Group__12 )
            // InternalKinematicsParser.g:1211:2: rule__Component__Group__11__Impl rule__Component__Group__12
            {
            pushFollow(FOLLOW_8);
            rule__Component__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__11"


    // $ANTLR start "rule__Component__Group__11__Impl"
    // InternalKinematicsParser.g:1218:1: rule__Component__Group__11__Impl : ( ( rule__Component__Alternatives_11 )? ) ;
    public final void rule__Component__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1222:1: ( ( ( rule__Component__Alternatives_11 )? ) )
            // InternalKinematicsParser.g:1223:1: ( ( rule__Component__Alternatives_11 )? )
            {
            // InternalKinematicsParser.g:1223:1: ( ( rule__Component__Alternatives_11 )? )
            // InternalKinematicsParser.g:1224:2: ( rule__Component__Alternatives_11 )?
            {
             before(grammarAccess.getComponentAccess().getAlternatives_11()); 
            // InternalKinematicsParser.g:1225:2: ( rule__Component__Alternatives_11 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Component) ) {
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

                            if ( (LA12_6==Type) ) {
                                int LA12_7 = input.LA(6);

                                if ( (LA12_7==RULE_STRING) ) {
                                    alt12=1;
                                }
                            }
                        }
                    }
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalKinematicsParser.g:1225:3: rule__Component__Alternatives_11
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Alternatives_11();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getAlternatives_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__11__Impl"


    // $ANTLR start "rule__Component__Group__12"
    // InternalKinematicsParser.g:1233:1: rule__Component__Group__12 : rule__Component__Group__12__Impl rule__Component__Group__13 ;
    public final void rule__Component__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1237:1: ( rule__Component__Group__12__Impl rule__Component__Group__13 )
            // InternalKinematicsParser.g:1238:2: rule__Component__Group__12__Impl rule__Component__Group__13
            {
            pushFollow(FOLLOW_8);
            rule__Component__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__12"


    // $ANTLR start "rule__Component__Group__12__Impl"
    // InternalKinematicsParser.g:1245:1: rule__Component__Group__12__Impl : ( ( rule__Component__Alternatives_12 )? ) ;
    public final void rule__Component__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1249:1: ( ( ( rule__Component__Alternatives_12 )? ) )
            // InternalKinematicsParser.g:1250:1: ( ( rule__Component__Alternatives_12 )? )
            {
            // InternalKinematicsParser.g:1250:1: ( ( rule__Component__Alternatives_12 )? )
            // InternalKinematicsParser.g:1251:2: ( rule__Component__Alternatives_12 )?
            {
             before(grammarAccess.getComponentAccess().getAlternatives_12()); 
            // InternalKinematicsParser.g:1252:2: ( rule__Component__Alternatives_12 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Connection) ) {
                alt13=1;
            }
            else if ( (LA13_0==HyphenMinus) ) {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==Name) ) {
                    int LA13_4 = input.LA(3);

                    if ( (LA13_4==RULE_STRING) ) {
                        int LA13_5 = input.LA(4);

                        if ( (LA13_5==RULE_BEGIN) ) {
                            int LA13_6 = input.LA(5);

                            if ( (LA13_6==BaseAttachment) ) {
                                alt13=1;
                            }
                        }
                    }
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalKinematicsParser.g:1252:3: rule__Component__Alternatives_12
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Alternatives_12();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getAlternatives_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__12__Impl"


    // $ANTLR start "rule__Component__Group__13"
    // InternalKinematicsParser.g:1260:1: rule__Component__Group__13 : rule__Component__Group__13__Impl rule__Component__Group__14 ;
    public final void rule__Component__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1264:1: ( rule__Component__Group__13__Impl rule__Component__Group__14 )
            // InternalKinematicsParser.g:1265:2: rule__Component__Group__13__Impl rule__Component__Group__14
            {
            pushFollow(FOLLOW_8);
            rule__Component__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__13"


    // $ANTLR start "rule__Component__Group__13__Impl"
    // InternalKinematicsParser.g:1272:1: rule__Component__Group__13__Impl : ( ( rule__Component__Alternatives_13 )? ) ;
    public final void rule__Component__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1276:1: ( ( ( rule__Component__Alternatives_13 )? ) )
            // InternalKinematicsParser.g:1277:1: ( ( rule__Component__Alternatives_13 )? )
            {
            // InternalKinematicsParser.g:1277:1: ( ( rule__Component__Alternatives_13 )? )
            // InternalKinematicsParser.g:1278:2: ( rule__Component__Alternatives_13 )?
            {
             before(grammarAccess.getComponentAccess().getAlternatives_13()); 
            // InternalKinematicsParser.g:1279:2: ( rule__Component__Alternatives_13 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Group) ) {
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

                            if ( (LA14_6==BaseLink) ) {
                                alt14=1;
                            }
                        }
                    }
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalKinematicsParser.g:1279:3: rule__Component__Alternatives_13
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Alternatives_13();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getAlternatives_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__13__Impl"


    // $ANTLR start "rule__Component__Group__14"
    // InternalKinematicsParser.g:1287:1: rule__Component__Group__14 : rule__Component__Group__14__Impl rule__Component__Group__15 ;
    public final void rule__Component__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1291:1: ( rule__Component__Group__14__Impl rule__Component__Group__15 )
            // InternalKinematicsParser.g:1292:2: rule__Component__Group__14__Impl rule__Component__Group__15
            {
            pushFollow(FOLLOW_8);
            rule__Component__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__14"


    // $ANTLR start "rule__Component__Group__14__Impl"
    // InternalKinematicsParser.g:1299:1: rule__Component__Group__14__Impl : ( ( rule__Component__Alternatives_14 )? ) ;
    public final void rule__Component__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1303:1: ( ( ( rule__Component__Alternatives_14 )? ) )
            // InternalKinematicsParser.g:1304:1: ( ( rule__Component__Alternatives_14 )? )
            {
            // InternalKinematicsParser.g:1304:1: ( ( rule__Component__Alternatives_14 )? )
            // InternalKinematicsParser.g:1305:2: ( rule__Component__Alternatives_14 )?
            {
             before(grammarAccess.getComponentAccess().getAlternatives_14()); 
            // InternalKinematicsParser.g:1306:2: ( rule__Component__Alternatives_14 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Link) ) {
                alt15=1;
            }
            else if ( (LA15_0==HyphenMinus) ) {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==Name) ) {
                    int LA15_4 = input.LA(3);

                    if ( (LA15_4==RULE_STRING) ) {
                        int LA15_5 = input.LA(4);

                        if ( (LA15_5==RULE_BEGIN) ) {
                            int LA15_6 = input.LA(5);

                            if ( (LA15_6==Collision||LA15_6==Inertial||LA15_6==Visual||LA15_6==RULE_END) ) {
                                alt15=1;
                            }
                        }
                        else if ( (LA15_5==Joint||LA15_5==HyphenMinus||LA15_5==RULE_END) ) {
                            alt15=1;
                        }
                    }
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalKinematicsParser.g:1306:3: rule__Component__Alternatives_14
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Alternatives_14();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getAlternatives_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__14__Impl"


    // $ANTLR start "rule__Component__Group__15"
    // InternalKinematicsParser.g:1314:1: rule__Component__Group__15 : rule__Component__Group__15__Impl rule__Component__Group__16 ;
    public final void rule__Component__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1318:1: ( rule__Component__Group__15__Impl rule__Component__Group__16 )
            // InternalKinematicsParser.g:1319:2: rule__Component__Group__15__Impl rule__Component__Group__16
            {
            pushFollow(FOLLOW_8);
            rule__Component__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__15"


    // $ANTLR start "rule__Component__Group__15__Impl"
    // InternalKinematicsParser.g:1326:1: rule__Component__Group__15__Impl : ( ( rule__Component__Alternatives_15 )? ) ;
    public final void rule__Component__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1330:1: ( ( ( rule__Component__Alternatives_15 )? ) )
            // InternalKinematicsParser.g:1331:1: ( ( rule__Component__Alternatives_15 )? )
            {
            // InternalKinematicsParser.g:1331:1: ( ( rule__Component__Alternatives_15 )? )
            // InternalKinematicsParser.g:1332:2: ( rule__Component__Alternatives_15 )?
            {
             before(grammarAccess.getComponentAccess().getAlternatives_15()); 
            // InternalKinematicsParser.g:1333:2: ( rule__Component__Alternatives_15 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Joint||LA16_0==HyphenMinus) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalKinematicsParser.g:1333:3: rule__Component__Alternatives_15
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Alternatives_15();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getAlternatives_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__15__Impl"


    // $ANTLR start "rule__Component__Group__16"
    // InternalKinematicsParser.g:1341:1: rule__Component__Group__16 : rule__Component__Group__16__Impl ;
    public final void rule__Component__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1345:1: ( rule__Component__Group__16__Impl )
            // InternalKinematicsParser.g:1346:2: rule__Component__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__16"


    // $ANTLR start "rule__Component__Group__16__Impl"
    // InternalKinematicsParser.g:1352:1: rule__Component__Group__16__Impl : ( RULE_END ) ;
    public final void rule__Component__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1356:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:1357:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:1357:1: ( RULE_END )
            // InternalKinematicsParser.g:1358:2: RULE_END
            {
             before(grammarAccess.getComponentAccess().getENDTerminalRuleCall_16()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getENDTerminalRuleCall_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__16__Impl"


    // $ANTLR start "rule__Component__Group_7__0"
    // InternalKinematicsParser.g:1368:1: rule__Component__Group_7__0 : rule__Component__Group_7__0__Impl rule__Component__Group_7__1 ;
    public final void rule__Component__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1372:1: ( rule__Component__Group_7__0__Impl rule__Component__Group_7__1 )
            // InternalKinematicsParser.g:1373:2: rule__Component__Group_7__0__Impl rule__Component__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__Component__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_7__0"


    // $ANTLR start "rule__Component__Group_7__0__Impl"
    // InternalKinematicsParser.g:1380:1: rule__Component__Group_7__0__Impl : ( Category ) ;
    public final void rule__Component__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1384:1: ( ( Category ) )
            // InternalKinematicsParser.g:1385:1: ( Category )
            {
            // InternalKinematicsParser.g:1385:1: ( Category )
            // InternalKinematicsParser.g:1386:2: Category
            {
             before(grammarAccess.getComponentAccess().getCategoryKeyword_7_0()); 
            match(input,Category,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getCategoryKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_7__0__Impl"


    // $ANTLR start "rule__Component__Group_7__1"
    // InternalKinematicsParser.g:1395:1: rule__Component__Group_7__1 : rule__Component__Group_7__1__Impl ;
    public final void rule__Component__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1399:1: ( rule__Component__Group_7__1__Impl )
            // InternalKinematicsParser.g:1400:2: rule__Component__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_7__1"


    // $ANTLR start "rule__Component__Group_7__1__Impl"
    // InternalKinematicsParser.g:1406:1: rule__Component__Group_7__1__Impl : ( ( rule__Component__CategoryAssignment_7_1 ) ) ;
    public final void rule__Component__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1410:1: ( ( ( rule__Component__CategoryAssignment_7_1 ) ) )
            // InternalKinematicsParser.g:1411:1: ( ( rule__Component__CategoryAssignment_7_1 ) )
            {
            // InternalKinematicsParser.g:1411:1: ( ( rule__Component__CategoryAssignment_7_1 ) )
            // InternalKinematicsParser.g:1412:2: ( rule__Component__CategoryAssignment_7_1 )
            {
             before(grammarAccess.getComponentAccess().getCategoryAssignment_7_1()); 
            // InternalKinematicsParser.g:1413:2: ( rule__Component__CategoryAssignment_7_1 )
            // InternalKinematicsParser.g:1413:3: rule__Component__CategoryAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__CategoryAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getCategoryAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_7__1__Impl"


    // $ANTLR start "rule__Component__Group_8__0"
    // InternalKinematicsParser.g:1422:1: rule__Component__Group_8__0 : rule__Component__Group_8__0__Impl rule__Component__Group_8__1 ;
    public final void rule__Component__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1426:1: ( rule__Component__Group_8__0__Impl rule__Component__Group_8__1 )
            // InternalKinematicsParser.g:1427:2: rule__Component__Group_8__0__Impl rule__Component__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__Component__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_8__0"


    // $ANTLR start "rule__Component__Group_8__0__Impl"
    // InternalKinematicsParser.g:1434:1: rule__Component__Group_8__0__Impl : ( GitRepo ) ;
    public final void rule__Component__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1438:1: ( ( GitRepo ) )
            // InternalKinematicsParser.g:1439:1: ( GitRepo )
            {
            // InternalKinematicsParser.g:1439:1: ( GitRepo )
            // InternalKinematicsParser.g:1440:2: GitRepo
            {
             before(grammarAccess.getComponentAccess().getGitRepoKeyword_8_0()); 
            match(input,GitRepo,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getGitRepoKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_8__0__Impl"


    // $ANTLR start "rule__Component__Group_8__1"
    // InternalKinematicsParser.g:1449:1: rule__Component__Group_8__1 : rule__Component__Group_8__1__Impl ;
    public final void rule__Component__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1453:1: ( rule__Component__Group_8__1__Impl )
            // InternalKinematicsParser.g:1454:2: rule__Component__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_8__1"


    // $ANTLR start "rule__Component__Group_8__1__Impl"
    // InternalKinematicsParser.g:1460:1: rule__Component__Group_8__1__Impl : ( ( rule__Component__GitRepoAssignment_8_1 ) ) ;
    public final void rule__Component__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1464:1: ( ( ( rule__Component__GitRepoAssignment_8_1 ) ) )
            // InternalKinematicsParser.g:1465:1: ( ( rule__Component__GitRepoAssignment_8_1 ) )
            {
            // InternalKinematicsParser.g:1465:1: ( ( rule__Component__GitRepoAssignment_8_1 ) )
            // InternalKinematicsParser.g:1466:2: ( rule__Component__GitRepoAssignment_8_1 )
            {
             before(grammarAccess.getComponentAccess().getGitRepoAssignment_8_1()); 
            // InternalKinematicsParser.g:1467:2: ( rule__Component__GitRepoAssignment_8_1 )
            // InternalKinematicsParser.g:1467:3: rule__Component__GitRepoAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__GitRepoAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGitRepoAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_8__1__Impl"


    // $ANTLR start "rule__Component__Group_9_0__0"
    // InternalKinematicsParser.g:1476:1: rule__Component__Group_9_0__0 : rule__Component__Group_9_0__0__Impl rule__Component__Group_9_0__1 ;
    public final void rule__Component__Group_9_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1480:1: ( rule__Component__Group_9_0__0__Impl rule__Component__Group_9_0__1 )
            // InternalKinematicsParser.g:1481:2: rule__Component__Group_9_0__0__Impl rule__Component__Group_9_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Component__Group_9_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_9_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_9_0__0"


    // $ANTLR start "rule__Component__Group_9_0__0__Impl"
    // InternalKinematicsParser.g:1488:1: rule__Component__Group_9_0__0__Impl : ( BaseAttachment ) ;
    public final void rule__Component__Group_9_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1492:1: ( ( BaseAttachment ) )
            // InternalKinematicsParser.g:1493:1: ( BaseAttachment )
            {
            // InternalKinematicsParser.g:1493:1: ( BaseAttachment )
            // InternalKinematicsParser.g:1494:2: BaseAttachment
            {
             before(grammarAccess.getComponentAccess().getBaseAttachmentKeyword_9_0_0()); 
            match(input,BaseAttachment,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getBaseAttachmentKeyword_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_9_0__0__Impl"


    // $ANTLR start "rule__Component__Group_9_0__1"
    // InternalKinematicsParser.g:1503:1: rule__Component__Group_9_0__1 : rule__Component__Group_9_0__1__Impl ;
    public final void rule__Component__Group_9_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1507:1: ( rule__Component__Group_9_0__1__Impl )
            // InternalKinematicsParser.g:1508:2: rule__Component__Group_9_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_9_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_9_0__1"


    // $ANTLR start "rule__Component__Group_9_0__1__Impl"
    // InternalKinematicsParser.g:1514:1: rule__Component__Group_9_0__1__Impl : ( ( rule__Component__BaseAttachmentAssignment_9_0_1 )* ) ;
    public final void rule__Component__Group_9_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1518:1: ( ( ( rule__Component__BaseAttachmentAssignment_9_0_1 )* ) )
            // InternalKinematicsParser.g:1519:1: ( ( rule__Component__BaseAttachmentAssignment_9_0_1 )* )
            {
            // InternalKinematicsParser.g:1519:1: ( ( rule__Component__BaseAttachmentAssignment_9_0_1 )* )
            // InternalKinematicsParser.g:1520:2: ( rule__Component__BaseAttachmentAssignment_9_0_1 )*
            {
             before(grammarAccess.getComponentAccess().getBaseAttachmentAssignment_9_0_1()); 
            // InternalKinematicsParser.g:1521:2: ( rule__Component__BaseAttachmentAssignment_9_0_1 )*
            loop17:
            do {
                int alt17=2;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // InternalKinematicsParser.g:1521:3: rule__Component__BaseAttachmentAssignment_9_0_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Component__BaseAttachmentAssignment_9_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getBaseAttachmentAssignment_9_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_9_0__1__Impl"


    // $ANTLR start "rule__Component__Group_10_0__0"
    // InternalKinematicsParser.g:1530:1: rule__Component__Group_10_0__0 : rule__Component__Group_10_0__0__Impl rule__Component__Group_10_0__1 ;
    public final void rule__Component__Group_10_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1534:1: ( rule__Component__Group_10_0__0__Impl rule__Component__Group_10_0__1 )
            // InternalKinematicsParser.g:1535:2: rule__Component__Group_10_0__0__Impl rule__Component__Group_10_0__1
            {
            pushFollow(FOLLOW_12);
            rule__Component__Group_10_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_10_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10_0__0"


    // $ANTLR start "rule__Component__Group_10_0__0__Impl"
    // InternalKinematicsParser.g:1542:1: rule__Component__Group_10_0__0__Impl : ( FlangeAttachment ) ;
    public final void rule__Component__Group_10_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1546:1: ( ( FlangeAttachment ) )
            // InternalKinematicsParser.g:1547:1: ( FlangeAttachment )
            {
            // InternalKinematicsParser.g:1547:1: ( FlangeAttachment )
            // InternalKinematicsParser.g:1548:2: FlangeAttachment
            {
             before(grammarAccess.getComponentAccess().getFlangeAttachmentKeyword_10_0_0()); 
            match(input,FlangeAttachment,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getFlangeAttachmentKeyword_10_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10_0__0__Impl"


    // $ANTLR start "rule__Component__Group_10_0__1"
    // InternalKinematicsParser.g:1557:1: rule__Component__Group_10_0__1 : rule__Component__Group_10_0__1__Impl ;
    public final void rule__Component__Group_10_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1561:1: ( rule__Component__Group_10_0__1__Impl )
            // InternalKinematicsParser.g:1562:2: rule__Component__Group_10_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_10_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10_0__1"


    // $ANTLR start "rule__Component__Group_10_0__1__Impl"
    // InternalKinematicsParser.g:1568:1: rule__Component__Group_10_0__1__Impl : ( ( rule__Component__FlangeAttachmentAssignment_10_0_1 )* ) ;
    public final void rule__Component__Group_10_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1572:1: ( ( ( rule__Component__FlangeAttachmentAssignment_10_0_1 )* ) )
            // InternalKinematicsParser.g:1573:1: ( ( rule__Component__FlangeAttachmentAssignment_10_0_1 )* )
            {
            // InternalKinematicsParser.g:1573:1: ( ( rule__Component__FlangeAttachmentAssignment_10_0_1 )* )
            // InternalKinematicsParser.g:1574:2: ( rule__Component__FlangeAttachmentAssignment_10_0_1 )*
            {
             before(grammarAccess.getComponentAccess().getFlangeAttachmentAssignment_10_0_1()); 
            // InternalKinematicsParser.g:1575:2: ( rule__Component__FlangeAttachmentAssignment_10_0_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==HyphenMinus) ) {
                    int LA18_2 = input.LA(2);

                    if ( (LA18_2==Name) ) {
                        int LA18_3 = input.LA(3);

                        if ( (LA18_3==RULE_STRING) ) {
                            int LA18_4 = input.LA(4);

                            if ( (LA18_4==RULE_BEGIN) ) {
                                int LA18_5 = input.LA(5);

                                if ( (LA18_5==Origin) ) {
                                    alt18=1;
                                }


                            }


                        }


                    }


                }


                switch (alt18) {
            	case 1 :
            	    // InternalKinematicsParser.g:1575:3: rule__Component__FlangeAttachmentAssignment_10_0_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Component__FlangeAttachmentAssignment_10_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getFlangeAttachmentAssignment_10_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10_0__1__Impl"


    // $ANTLR start "rule__Component__Group_11_0__0"
    // InternalKinematicsParser.g:1584:1: rule__Component__Group_11_0__0 : rule__Component__Group_11_0__0__Impl rule__Component__Group_11_0__1 ;
    public final void rule__Component__Group_11_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1588:1: ( rule__Component__Group_11_0__0__Impl rule__Component__Group_11_0__1 )
            // InternalKinematicsParser.g:1589:2: rule__Component__Group_11_0__0__Impl rule__Component__Group_11_0__1
            {
            pushFollow(FOLLOW_14);
            rule__Component__Group_11_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_11_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_11_0__0"


    // $ANTLR start "rule__Component__Group_11_0__0__Impl"
    // InternalKinematicsParser.g:1596:1: rule__Component__Group_11_0__0__Impl : ( Component ) ;
    public final void rule__Component__Group_11_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1600:1: ( ( Component ) )
            // InternalKinematicsParser.g:1601:1: ( Component )
            {
            // InternalKinematicsParser.g:1601:1: ( Component )
            // InternalKinematicsParser.g:1602:2: Component
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_11_0_0()); 
            match(input,Component,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_11_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_11_0__0__Impl"


    // $ANTLR start "rule__Component__Group_11_0__1"
    // InternalKinematicsParser.g:1611:1: rule__Component__Group_11_0__1 : rule__Component__Group_11_0__1__Impl ;
    public final void rule__Component__Group_11_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1615:1: ( rule__Component__Group_11_0__1__Impl )
            // InternalKinematicsParser.g:1616:2: rule__Component__Group_11_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_11_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_11_0__1"


    // $ANTLR start "rule__Component__Group_11_0__1__Impl"
    // InternalKinematicsParser.g:1622:1: rule__Component__Group_11_0__1__Impl : ( ( rule__Component__ComponentAssignment_11_0_1 )* ) ;
    public final void rule__Component__Group_11_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1626:1: ( ( ( rule__Component__ComponentAssignment_11_0_1 )* ) )
            // InternalKinematicsParser.g:1627:1: ( ( rule__Component__ComponentAssignment_11_0_1 )* )
            {
            // InternalKinematicsParser.g:1627:1: ( ( rule__Component__ComponentAssignment_11_0_1 )* )
            // InternalKinematicsParser.g:1628:2: ( rule__Component__ComponentAssignment_11_0_1 )*
            {
             before(grammarAccess.getComponentAccess().getComponentAssignment_11_0_1()); 
            // InternalKinematicsParser.g:1629:2: ( rule__Component__ComponentAssignment_11_0_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==HyphenMinus) ) {
                    int LA19_2 = input.LA(2);

                    if ( (LA19_2==Name) ) {
                        int LA19_3 = input.LA(3);

                        if ( (LA19_3==RULE_STRING) ) {
                            int LA19_4 = input.LA(4);

                            if ( (LA19_4==RULE_BEGIN) ) {
                                int LA19_5 = input.LA(5);

                                if ( (LA19_5==Type) ) {
                                    int LA19_6 = input.LA(6);

                                    if ( (LA19_6==RULE_STRING) ) {
                                        alt19=1;
                                    }


                                }


                            }


                        }


                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalKinematicsParser.g:1629:3: rule__Component__ComponentAssignment_11_0_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Component__ComponentAssignment_11_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getComponentAssignment_11_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_11_0__1__Impl"


    // $ANTLR start "rule__Component__Group_12_0__0"
    // InternalKinematicsParser.g:1638:1: rule__Component__Group_12_0__0 : rule__Component__Group_12_0__0__Impl rule__Component__Group_12_0__1 ;
    public final void rule__Component__Group_12_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1642:1: ( rule__Component__Group_12_0__0__Impl rule__Component__Group_12_0__1 )
            // InternalKinematicsParser.g:1643:2: rule__Component__Group_12_0__0__Impl rule__Component__Group_12_0__1
            {
            pushFollow(FOLLOW_16);
            rule__Component__Group_12_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_12_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_12_0__0"


    // $ANTLR start "rule__Component__Group_12_0__0__Impl"
    // InternalKinematicsParser.g:1650:1: rule__Component__Group_12_0__0__Impl : ( Connection ) ;
    public final void rule__Component__Group_12_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1654:1: ( ( Connection ) )
            // InternalKinematicsParser.g:1655:1: ( Connection )
            {
            // InternalKinematicsParser.g:1655:1: ( Connection )
            // InternalKinematicsParser.g:1656:2: Connection
            {
             before(grammarAccess.getComponentAccess().getConnectionKeyword_12_0_0()); 
            match(input,Connection,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getConnectionKeyword_12_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_12_0__0__Impl"


    // $ANTLR start "rule__Component__Group_12_0__1"
    // InternalKinematicsParser.g:1665:1: rule__Component__Group_12_0__1 : rule__Component__Group_12_0__1__Impl ;
    public final void rule__Component__Group_12_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1669:1: ( rule__Component__Group_12_0__1__Impl )
            // InternalKinematicsParser.g:1670:2: rule__Component__Group_12_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_12_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_12_0__1"


    // $ANTLR start "rule__Component__Group_12_0__1__Impl"
    // InternalKinematicsParser.g:1676:1: rule__Component__Group_12_0__1__Impl : ( ( rule__Component__ConnectionAssignment_12_0_1 )* ) ;
    public final void rule__Component__Group_12_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1680:1: ( ( ( rule__Component__ConnectionAssignment_12_0_1 )* ) )
            // InternalKinematicsParser.g:1681:1: ( ( rule__Component__ConnectionAssignment_12_0_1 )* )
            {
            // InternalKinematicsParser.g:1681:1: ( ( rule__Component__ConnectionAssignment_12_0_1 )* )
            // InternalKinematicsParser.g:1682:2: ( rule__Component__ConnectionAssignment_12_0_1 )*
            {
             before(grammarAccess.getComponentAccess().getConnectionAssignment_12_0_1()); 
            // InternalKinematicsParser.g:1683:2: ( rule__Component__ConnectionAssignment_12_0_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==HyphenMinus) ) {
                    int LA20_2 = input.LA(2);

                    if ( (LA20_2==Name) ) {
                        int LA20_3 = input.LA(3);

                        if ( (LA20_3==RULE_STRING) ) {
                            int LA20_4 = input.LA(4);

                            if ( (LA20_4==RULE_BEGIN) ) {
                                int LA20_5 = input.LA(5);

                                if ( (LA20_5==BaseAttachment) ) {
                                    alt20=1;
                                }


                            }


                        }


                    }


                }


                switch (alt20) {
            	case 1 :
            	    // InternalKinematicsParser.g:1683:3: rule__Component__ConnectionAssignment_12_0_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Component__ConnectionAssignment_12_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getConnectionAssignment_12_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_12_0__1__Impl"


    // $ANTLR start "rule__Component__Group_13_0__0"
    // InternalKinematicsParser.g:1692:1: rule__Component__Group_13_0__0 : rule__Component__Group_13_0__0__Impl rule__Component__Group_13_0__1 ;
    public final void rule__Component__Group_13_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1696:1: ( rule__Component__Group_13_0__0__Impl rule__Component__Group_13_0__1 )
            // InternalKinematicsParser.g:1697:2: rule__Component__Group_13_0__0__Impl rule__Component__Group_13_0__1
            {
            pushFollow(FOLLOW_18);
            rule__Component__Group_13_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_13_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_13_0__0"


    // $ANTLR start "rule__Component__Group_13_0__0__Impl"
    // InternalKinematicsParser.g:1704:1: rule__Component__Group_13_0__0__Impl : ( Group ) ;
    public final void rule__Component__Group_13_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1708:1: ( ( Group ) )
            // InternalKinematicsParser.g:1709:1: ( Group )
            {
            // InternalKinematicsParser.g:1709:1: ( Group )
            // InternalKinematicsParser.g:1710:2: Group
            {
             before(grammarAccess.getComponentAccess().getGroupKeyword_13_0_0()); 
            match(input,Group,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getGroupKeyword_13_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_13_0__0__Impl"


    // $ANTLR start "rule__Component__Group_13_0__1"
    // InternalKinematicsParser.g:1719:1: rule__Component__Group_13_0__1 : rule__Component__Group_13_0__1__Impl ;
    public final void rule__Component__Group_13_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1723:1: ( rule__Component__Group_13_0__1__Impl )
            // InternalKinematicsParser.g:1724:2: rule__Component__Group_13_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_13_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_13_0__1"


    // $ANTLR start "rule__Component__Group_13_0__1__Impl"
    // InternalKinematicsParser.g:1730:1: rule__Component__Group_13_0__1__Impl : ( ( rule__Component__GroupAssignment_13_0_1 )* ) ;
    public final void rule__Component__Group_13_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1734:1: ( ( ( rule__Component__GroupAssignment_13_0_1 )* ) )
            // InternalKinematicsParser.g:1735:1: ( ( rule__Component__GroupAssignment_13_0_1 )* )
            {
            // InternalKinematicsParser.g:1735:1: ( ( rule__Component__GroupAssignment_13_0_1 )* )
            // InternalKinematicsParser.g:1736:2: ( rule__Component__GroupAssignment_13_0_1 )*
            {
             before(grammarAccess.getComponentAccess().getGroupAssignment_13_0_1()); 
            // InternalKinematicsParser.g:1737:2: ( rule__Component__GroupAssignment_13_0_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==HyphenMinus) ) {
                    int LA21_2 = input.LA(2);

                    if ( (LA21_2==Name) ) {
                        int LA21_3 = input.LA(3);

                        if ( (LA21_3==RULE_STRING) ) {
                            int LA21_4 = input.LA(4);

                            if ( (LA21_4==RULE_BEGIN) ) {
                                int LA21_5 = input.LA(5);

                                if ( (LA21_5==BaseLink) ) {
                                    alt21=1;
                                }


                            }


                        }


                    }


                }


                switch (alt21) {
            	case 1 :
            	    // InternalKinematicsParser.g:1737:3: rule__Component__GroupAssignment_13_0_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Component__GroupAssignment_13_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getGroupAssignment_13_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_13_0__1__Impl"


    // $ANTLR start "rule__Component__Group_14_0__0"
    // InternalKinematicsParser.g:1746:1: rule__Component__Group_14_0__0 : rule__Component__Group_14_0__0__Impl rule__Component__Group_14_0__1 ;
    public final void rule__Component__Group_14_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1750:1: ( rule__Component__Group_14_0__0__Impl rule__Component__Group_14_0__1 )
            // InternalKinematicsParser.g:1751:2: rule__Component__Group_14_0__0__Impl rule__Component__Group_14_0__1
            {
            pushFollow(FOLLOW_20);
            rule__Component__Group_14_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_14_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_14_0__0"


    // $ANTLR start "rule__Component__Group_14_0__0__Impl"
    // InternalKinematicsParser.g:1758:1: rule__Component__Group_14_0__0__Impl : ( Link ) ;
    public final void rule__Component__Group_14_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1762:1: ( ( Link ) )
            // InternalKinematicsParser.g:1763:1: ( Link )
            {
            // InternalKinematicsParser.g:1763:1: ( Link )
            // InternalKinematicsParser.g:1764:2: Link
            {
             before(grammarAccess.getComponentAccess().getLinkKeyword_14_0_0()); 
            match(input,Link,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLinkKeyword_14_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_14_0__0__Impl"


    // $ANTLR start "rule__Component__Group_14_0__1"
    // InternalKinematicsParser.g:1773:1: rule__Component__Group_14_0__1 : rule__Component__Group_14_0__1__Impl ;
    public final void rule__Component__Group_14_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1777:1: ( rule__Component__Group_14_0__1__Impl )
            // InternalKinematicsParser.g:1778:2: rule__Component__Group_14_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_14_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_14_0__1"


    // $ANTLR start "rule__Component__Group_14_0__1__Impl"
    // InternalKinematicsParser.g:1784:1: rule__Component__Group_14_0__1__Impl : ( ( rule__Component__LinkAssignment_14_0_1 )* ) ;
    public final void rule__Component__Group_14_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1788:1: ( ( ( rule__Component__LinkAssignment_14_0_1 )* ) )
            // InternalKinematicsParser.g:1789:1: ( ( rule__Component__LinkAssignment_14_0_1 )* )
            {
            // InternalKinematicsParser.g:1789:1: ( ( rule__Component__LinkAssignment_14_0_1 )* )
            // InternalKinematicsParser.g:1790:2: ( rule__Component__LinkAssignment_14_0_1 )*
            {
             before(grammarAccess.getComponentAccess().getLinkAssignment_14_0_1()); 
            // InternalKinematicsParser.g:1791:2: ( rule__Component__LinkAssignment_14_0_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==HyphenMinus) ) {
                    int LA22_2 = input.LA(2);

                    if ( (LA22_2==Name) ) {
                        int LA22_3 = input.LA(3);

                        if ( (LA22_3==RULE_STRING) ) {
                            int LA22_4 = input.LA(4);

                            if ( (LA22_4==RULE_BEGIN) ) {
                                int LA22_5 = input.LA(5);

                                if ( (LA22_5==Collision||LA22_5==Inertial||LA22_5==Visual||LA22_5==RULE_END) ) {
                                    alt22=1;
                                }


                            }
                            else if ( (LA22_4==Joint||LA22_4==HyphenMinus||LA22_4==RULE_END) ) {
                                alt22=1;
                            }


                        }


                    }


                }


                switch (alt22) {
            	case 1 :
            	    // InternalKinematicsParser.g:1791:3: rule__Component__LinkAssignment_14_0_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Component__LinkAssignment_14_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getLinkAssignment_14_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_14_0__1__Impl"


    // $ANTLR start "rule__Component__Group_15_0__0"
    // InternalKinematicsParser.g:1800:1: rule__Component__Group_15_0__0 : rule__Component__Group_15_0__0__Impl rule__Component__Group_15_0__1 ;
    public final void rule__Component__Group_15_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1804:1: ( rule__Component__Group_15_0__0__Impl rule__Component__Group_15_0__1 )
            // InternalKinematicsParser.g:1805:2: rule__Component__Group_15_0__0__Impl rule__Component__Group_15_0__1
            {
            pushFollow(FOLLOW_22);
            rule__Component__Group_15_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_15_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_15_0__0"


    // $ANTLR start "rule__Component__Group_15_0__0__Impl"
    // InternalKinematicsParser.g:1812:1: rule__Component__Group_15_0__0__Impl : ( Joint ) ;
    public final void rule__Component__Group_15_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1816:1: ( ( Joint ) )
            // InternalKinematicsParser.g:1817:1: ( Joint )
            {
            // InternalKinematicsParser.g:1817:1: ( Joint )
            // InternalKinematicsParser.g:1818:2: Joint
            {
             before(grammarAccess.getComponentAccess().getJointKeyword_15_0_0()); 
            match(input,Joint,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getJointKeyword_15_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_15_0__0__Impl"


    // $ANTLR start "rule__Component__Group_15_0__1"
    // InternalKinematicsParser.g:1827:1: rule__Component__Group_15_0__1 : rule__Component__Group_15_0__1__Impl ;
    public final void rule__Component__Group_15_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1831:1: ( rule__Component__Group_15_0__1__Impl )
            // InternalKinematicsParser.g:1832:2: rule__Component__Group_15_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_15_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_15_0__1"


    // $ANTLR start "rule__Component__Group_15_0__1__Impl"
    // InternalKinematicsParser.g:1838:1: rule__Component__Group_15_0__1__Impl : ( ( rule__Component__JointAssignment_15_0_1 )* ) ;
    public final void rule__Component__Group_15_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1842:1: ( ( ( rule__Component__JointAssignment_15_0_1 )* ) )
            // InternalKinematicsParser.g:1843:1: ( ( rule__Component__JointAssignment_15_0_1 )* )
            {
            // InternalKinematicsParser.g:1843:1: ( ( rule__Component__JointAssignment_15_0_1 )* )
            // InternalKinematicsParser.g:1844:2: ( rule__Component__JointAssignment_15_0_1 )*
            {
             before(grammarAccess.getComponentAccess().getJointAssignment_15_0_1()); 
            // InternalKinematicsParser.g:1845:2: ( rule__Component__JointAssignment_15_0_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==HyphenMinus) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKinematicsParser.g:1845:3: rule__Component__JointAssignment_15_0_1
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Component__JointAssignment_15_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getJointAssignment_15_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_15_0__1__Impl"


    // $ANTLR start "rule__ConfiguredComponent__Group__0"
    // InternalKinematicsParser.g:1854:1: rule__ConfiguredComponent__Group__0 : rule__ConfiguredComponent__Group__0__Impl rule__ConfiguredComponent__Group__1 ;
    public final void rule__ConfiguredComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1858:1: ( rule__ConfiguredComponent__Group__0__Impl rule__ConfiguredComponent__Group__1 )
            // InternalKinematicsParser.g:1859:2: rule__ConfiguredComponent__Group__0__Impl rule__ConfiguredComponent__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ConfiguredComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfiguredComponent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguredComponent__Group__0"


    // $ANTLR start "rule__ConfiguredComponent__Group__0__Impl"
    // InternalKinematicsParser.g:1866:1: rule__ConfiguredComponent__Group__0__Impl : ( HyphenMinus ) ;
    public final void rule__ConfiguredComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1870:1: ( ( HyphenMinus ) )
            // InternalKinematicsParser.g:1871:1: ( HyphenMinus )
            {
            // InternalKinematicsParser.g:1871:1: ( HyphenMinus )
            // InternalKinematicsParser.g:1872:2: HyphenMinus
            {
             before(grammarAccess.getConfiguredComponentAccess().getHyphenMinusKeyword_0()); 
            match(input,HyphenMinus,FOLLOW_2); 
             after(grammarAccess.getConfiguredComponentAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguredComponent__Group__0__Impl"


    // $ANTLR start "rule__ConfiguredComponent__Group__1"
    // InternalKinematicsParser.g:1881:1: rule__ConfiguredComponent__Group__1 : rule__ConfiguredComponent__Group__1__Impl rule__ConfiguredComponent__Group__2 ;
    public final void rule__ConfiguredComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1885:1: ( rule__ConfiguredComponent__Group__1__Impl rule__ConfiguredComponent__Group__2 )
            // InternalKinematicsParser.g:1886:2: rule__ConfiguredComponent__Group__1__Impl rule__ConfiguredComponent__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ConfiguredComponent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfiguredComponent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguredComponent__Group__1"


    // $ANTLR start "rule__ConfiguredComponent__Group__1__Impl"
    // InternalKinematicsParser.g:1893:1: rule__ConfiguredComponent__Group__1__Impl : ( Name ) ;
    public final void rule__ConfiguredComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1897:1: ( ( Name ) )
            // InternalKinematicsParser.g:1898:1: ( Name )
            {
            // InternalKinematicsParser.g:1898:1: ( Name )
            // InternalKinematicsParser.g:1899:2: Name
            {
             before(grammarAccess.getConfiguredComponentAccess().getNameKeyword_1()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getConfiguredComponentAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguredComponent__Group__1__Impl"


    // $ANTLR start "rule__ConfiguredComponent__Group__2"
    // InternalKinematicsParser.g:1908:1: rule__ConfiguredComponent__Group__2 : rule__ConfiguredComponent__Group__2__Impl rule__ConfiguredComponent__Group__3 ;
    public final void rule__ConfiguredComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1912:1: ( rule__ConfiguredComponent__Group__2__Impl rule__ConfiguredComponent__Group__3 )
            // InternalKinematicsParser.g:1913:2: rule__ConfiguredComponent__Group__2__Impl rule__ConfiguredComponent__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ConfiguredComponent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfiguredComponent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguredComponent__Group__2"


    // $ANTLR start "rule__ConfiguredComponent__Group__2__Impl"
    // InternalKinematicsParser.g:1920:1: rule__ConfiguredComponent__Group__2__Impl : ( ( rule__ConfiguredComponent__NameAssignment_2 ) ) ;
    public final void rule__ConfiguredComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1924:1: ( ( ( rule__ConfiguredComponent__NameAssignment_2 ) ) )
            // InternalKinematicsParser.g:1925:1: ( ( rule__ConfiguredComponent__NameAssignment_2 ) )
            {
            // InternalKinematicsParser.g:1925:1: ( ( rule__ConfiguredComponent__NameAssignment_2 ) )
            // InternalKinematicsParser.g:1926:2: ( rule__ConfiguredComponent__NameAssignment_2 )
            {
             before(grammarAccess.getConfiguredComponentAccess().getNameAssignment_2()); 
            // InternalKinematicsParser.g:1927:2: ( rule__ConfiguredComponent__NameAssignment_2 )
            // InternalKinematicsParser.g:1927:3: rule__ConfiguredComponent__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConfiguredComponent__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConfiguredComponentAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguredComponent__Group__2__Impl"


    // $ANTLR start "rule__ConfiguredComponent__Group__3"
    // InternalKinematicsParser.g:1935:1: rule__ConfiguredComponent__Group__3 : rule__ConfiguredComponent__Group__3__Impl rule__ConfiguredComponent__Group__4 ;
    public final void rule__ConfiguredComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1939:1: ( rule__ConfiguredComponent__Group__3__Impl rule__ConfiguredComponent__Group__4 )
            // InternalKinematicsParser.g:1940:2: rule__ConfiguredComponent__Group__3__Impl rule__ConfiguredComponent__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__ConfiguredComponent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfiguredComponent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguredComponent__Group__3"


    // $ANTLR start "rule__ConfiguredComponent__Group__3__Impl"
    // InternalKinematicsParser.g:1947:1: rule__ConfiguredComponent__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__ConfiguredComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1951:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:1952:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:1952:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:1953:2: RULE_BEGIN
            {
             before(grammarAccess.getConfiguredComponentAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getConfiguredComponentAccess().getBEGINTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguredComponent__Group__3__Impl"


    // $ANTLR start "rule__ConfiguredComponent__Group__4"
    // InternalKinematicsParser.g:1962:1: rule__ConfiguredComponent__Group__4 : rule__ConfiguredComponent__Group__4__Impl rule__ConfiguredComponent__Group__5 ;
    public final void rule__ConfiguredComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1966:1: ( rule__ConfiguredComponent__Group__4__Impl rule__ConfiguredComponent__Group__5 )
            // InternalKinematicsParser.g:1967:2: rule__ConfiguredComponent__Group__4__Impl rule__ConfiguredComponent__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ConfiguredComponent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfiguredComponent__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguredComponent__Group__4"


    // $ANTLR start "rule__ConfiguredComponent__Group__4__Impl"
    // InternalKinematicsParser.g:1974:1: rule__ConfiguredComponent__Group__4__Impl : ( Type ) ;
    public final void rule__ConfiguredComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1978:1: ( ( Type ) )
            // InternalKinematicsParser.g:1979:1: ( Type )
            {
            // InternalKinematicsParser.g:1979:1: ( Type )
            // InternalKinematicsParser.g:1980:2: Type
            {
             before(grammarAccess.getConfiguredComponentAccess().getTypeKeyword_4()); 
            match(input,Type,FOLLOW_2); 
             after(grammarAccess.getConfiguredComponentAccess().getTypeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguredComponent__Group__4__Impl"


    // $ANTLR start "rule__ConfiguredComponent__Group__5"
    // InternalKinematicsParser.g:1989:1: rule__ConfiguredComponent__Group__5 : rule__ConfiguredComponent__Group__5__Impl rule__ConfiguredComponent__Group__6 ;
    public final void rule__ConfiguredComponent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1993:1: ( rule__ConfiguredComponent__Group__5__Impl rule__ConfiguredComponent__Group__6 )
            // InternalKinematicsParser.g:1994:2: rule__ConfiguredComponent__Group__5__Impl rule__ConfiguredComponent__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__ConfiguredComponent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfiguredComponent__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguredComponent__Group__5"


    // $ANTLR start "rule__ConfiguredComponent__Group__5__Impl"
    // InternalKinematicsParser.g:2001:1: rule__ConfiguredComponent__Group__5__Impl : ( ( rule__ConfiguredComponent__TypeAssignment_5 ) ) ;
    public final void rule__ConfiguredComponent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2005:1: ( ( ( rule__ConfiguredComponent__TypeAssignment_5 ) ) )
            // InternalKinematicsParser.g:2006:1: ( ( rule__ConfiguredComponent__TypeAssignment_5 ) )
            {
            // InternalKinematicsParser.g:2006:1: ( ( rule__ConfiguredComponent__TypeAssignment_5 ) )
            // InternalKinematicsParser.g:2007:2: ( rule__ConfiguredComponent__TypeAssignment_5 )
            {
             before(grammarAccess.getConfiguredComponentAccess().getTypeAssignment_5()); 
            // InternalKinematicsParser.g:2008:2: ( rule__ConfiguredComponent__TypeAssignment_5 )
            // InternalKinematicsParser.g:2008:3: rule__ConfiguredComponent__TypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ConfiguredComponent__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConfiguredComponentAccess().getTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguredComponent__Group__5__Impl"


    // $ANTLR start "rule__ConfiguredComponent__Group__6"
    // InternalKinematicsParser.g:2016:1: rule__ConfiguredComponent__Group__6 : rule__ConfiguredComponent__Group__6__Impl rule__ConfiguredComponent__Group__7 ;
    public final void rule__ConfiguredComponent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2020:1: ( rule__ConfiguredComponent__Group__6__Impl rule__ConfiguredComponent__Group__7 )
            // InternalKinematicsParser.g:2021:2: rule__ConfiguredComponent__Group__6__Impl rule__ConfiguredComponent__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__ConfiguredComponent__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfiguredComponent__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguredComponent__Group__6"


    // $ANTLR start "rule__ConfiguredComponent__Group__6__Impl"
    // InternalKinematicsParser.g:2028:1: rule__ConfiguredComponent__Group__6__Impl : ( ( rule__ConfiguredComponent__Group_6__0 )? ) ;
    public final void rule__ConfiguredComponent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2032:1: ( ( ( rule__ConfiguredComponent__Group_6__0 )? ) )
            // InternalKinematicsParser.g:2033:1: ( ( rule__ConfiguredComponent__Group_6__0 )? )
            {
            // InternalKinematicsParser.g:2033:1: ( ( rule__ConfiguredComponent__Group_6__0 )? )
            // InternalKinematicsParser.g:2034:2: ( rule__ConfiguredComponent__Group_6__0 )?
            {
             before(grammarAccess.getConfiguredComponentAccess().getGroup_6()); 
            // InternalKinematicsParser.g:2035:2: ( rule__ConfiguredComponent__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Prefix) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalKinematicsParser.g:2035:3: rule__ConfiguredComponent__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConfiguredComponent__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfiguredComponentAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguredComponent__Group__6__Impl"


    // $ANTLR start "rule__ConfiguredComponent__Group__7"
    // InternalKinematicsParser.g:2043:1: rule__ConfiguredComponent__Group__7 : rule__ConfiguredComponent__Group__7__Impl ;
    public final void rule__ConfiguredComponent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2047:1: ( rule__ConfiguredComponent__Group__7__Impl )
            // InternalKinematicsParser.g:2048:2: rule__ConfiguredComponent__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfiguredComponent__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguredComponent__Group__7"


    // $ANTLR start "rule__ConfiguredComponent__Group__7__Impl"
    // InternalKinematicsParser.g:2054:1: rule__ConfiguredComponent__Group__7__Impl : ( RULE_END ) ;
    public final void rule__ConfiguredComponent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2058:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:2059:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:2059:1: ( RULE_END )
            // InternalKinematicsParser.g:2060:2: RULE_END
            {
             before(grammarAccess.getConfiguredComponentAccess().getENDTerminalRuleCall_7()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getConfiguredComponentAccess().getENDTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguredComponent__Group__7__Impl"


    // $ANTLR start "rule__ConfiguredComponent__Group_6__0"
    // InternalKinematicsParser.g:2070:1: rule__ConfiguredComponent__Group_6__0 : rule__ConfiguredComponent__Group_6__0__Impl rule__ConfiguredComponent__Group_6__1 ;
    public final void rule__ConfiguredComponent__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2074:1: ( rule__ConfiguredComponent__Group_6__0__Impl rule__ConfiguredComponent__Group_6__1 )
            // InternalKinematicsParser.g:2075:2: rule__ConfiguredComponent__Group_6__0__Impl rule__ConfiguredComponent__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__ConfiguredComponent__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfiguredComponent__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguredComponent__Group_6__0"


    // $ANTLR start "rule__ConfiguredComponent__Group_6__0__Impl"
    // InternalKinematicsParser.g:2082:1: rule__ConfiguredComponent__Group_6__0__Impl : ( Prefix ) ;
    public final void rule__ConfiguredComponent__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2086:1: ( ( Prefix ) )
            // InternalKinematicsParser.g:2087:1: ( Prefix )
            {
            // InternalKinematicsParser.g:2087:1: ( Prefix )
            // InternalKinematicsParser.g:2088:2: Prefix
            {
             before(grammarAccess.getConfiguredComponentAccess().getPrefixKeyword_6_0()); 
            match(input,Prefix,FOLLOW_2); 
             after(grammarAccess.getConfiguredComponentAccess().getPrefixKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguredComponent__Group_6__0__Impl"


    // $ANTLR start "rule__ConfiguredComponent__Group_6__1"
    // InternalKinematicsParser.g:2097:1: rule__ConfiguredComponent__Group_6__1 : rule__ConfiguredComponent__Group_6__1__Impl ;
    public final void rule__ConfiguredComponent__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2101:1: ( rule__ConfiguredComponent__Group_6__1__Impl )
            // InternalKinematicsParser.g:2102:2: rule__ConfiguredComponent__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfiguredComponent__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguredComponent__Group_6__1"


    // $ANTLR start "rule__ConfiguredComponent__Group_6__1__Impl"
    // InternalKinematicsParser.g:2108:1: rule__ConfiguredComponent__Group_6__1__Impl : ( ( rule__ConfiguredComponent__PrefixAssignment_6_1 ) ) ;
    public final void rule__ConfiguredComponent__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2112:1: ( ( ( rule__ConfiguredComponent__PrefixAssignment_6_1 ) ) )
            // InternalKinematicsParser.g:2113:1: ( ( rule__ConfiguredComponent__PrefixAssignment_6_1 ) )
            {
            // InternalKinematicsParser.g:2113:1: ( ( rule__ConfiguredComponent__PrefixAssignment_6_1 ) )
            // InternalKinematicsParser.g:2114:2: ( rule__ConfiguredComponent__PrefixAssignment_6_1 )
            {
             before(grammarAccess.getConfiguredComponentAccess().getPrefixAssignment_6_1()); 
            // InternalKinematicsParser.g:2115:2: ( rule__ConfiguredComponent__PrefixAssignment_6_1 )
            // InternalKinematicsParser.g:2115:3: rule__ConfiguredComponent__PrefixAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ConfiguredComponent__PrefixAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getConfiguredComponentAccess().getPrefixAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguredComponent__Group_6__1__Impl"


    // $ANTLR start "rule__GitRepo__Group__0"
    // InternalKinematicsParser.g:2124:1: rule__GitRepo__Group__0 : rule__GitRepo__Group__0__Impl rule__GitRepo__Group__1 ;
    public final void rule__GitRepo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2128:1: ( rule__GitRepo__Group__0__Impl rule__GitRepo__Group__1 )
            // InternalKinematicsParser.g:2129:2: rule__GitRepo__Group__0__Impl rule__GitRepo__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__GitRepo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GitRepo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__Group__0"


    // $ANTLR start "rule__GitRepo__Group__0__Impl"
    // InternalKinematicsParser.g:2136:1: rule__GitRepo__Group__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__GitRepo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2140:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:2141:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:2141:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:2142:2: RULE_BEGIN
            {
             before(grammarAccess.getGitRepoAccess().getBEGINTerminalRuleCall_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getGitRepoAccess().getBEGINTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__Group__0__Impl"


    // $ANTLR start "rule__GitRepo__Group__1"
    // InternalKinematicsParser.g:2151:1: rule__GitRepo__Group__1 : rule__GitRepo__Group__1__Impl rule__GitRepo__Group__2 ;
    public final void rule__GitRepo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2155:1: ( rule__GitRepo__Group__1__Impl rule__GitRepo__Group__2 )
            // InternalKinematicsParser.g:2156:2: rule__GitRepo__Group__1__Impl rule__GitRepo__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__GitRepo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GitRepo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__Group__1"


    // $ANTLR start "rule__GitRepo__Group__1__Impl"
    // InternalKinematicsParser.g:2163:1: rule__GitRepo__Group__1__Impl : ( Distro ) ;
    public final void rule__GitRepo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2167:1: ( ( Distro ) )
            // InternalKinematicsParser.g:2168:1: ( Distro )
            {
            // InternalKinematicsParser.g:2168:1: ( Distro )
            // InternalKinematicsParser.g:2169:2: Distro
            {
             before(grammarAccess.getGitRepoAccess().getDistroKeyword_1()); 
            match(input,Distro,FOLLOW_2); 
             after(grammarAccess.getGitRepoAccess().getDistroKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__Group__1__Impl"


    // $ANTLR start "rule__GitRepo__Group__2"
    // InternalKinematicsParser.g:2178:1: rule__GitRepo__Group__2 : rule__GitRepo__Group__2__Impl rule__GitRepo__Group__3 ;
    public final void rule__GitRepo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2182:1: ( rule__GitRepo__Group__2__Impl rule__GitRepo__Group__3 )
            // InternalKinematicsParser.g:2183:2: rule__GitRepo__Group__2__Impl rule__GitRepo__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__GitRepo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GitRepo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__Group__2"


    // $ANTLR start "rule__GitRepo__Group__2__Impl"
    // InternalKinematicsParser.g:2190:1: rule__GitRepo__Group__2__Impl : ( ( rule__GitRepo__DistroAssignment_2 ) ) ;
    public final void rule__GitRepo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2194:1: ( ( ( rule__GitRepo__DistroAssignment_2 ) ) )
            // InternalKinematicsParser.g:2195:1: ( ( rule__GitRepo__DistroAssignment_2 ) )
            {
            // InternalKinematicsParser.g:2195:1: ( ( rule__GitRepo__DistroAssignment_2 ) )
            // InternalKinematicsParser.g:2196:2: ( rule__GitRepo__DistroAssignment_2 )
            {
             before(grammarAccess.getGitRepoAccess().getDistroAssignment_2()); 
            // InternalKinematicsParser.g:2197:2: ( rule__GitRepo__DistroAssignment_2 )
            // InternalKinematicsParser.g:2197:3: rule__GitRepo__DistroAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GitRepo__DistroAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGitRepoAccess().getDistroAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__Group__2__Impl"


    // $ANTLR start "rule__GitRepo__Group__3"
    // InternalKinematicsParser.g:2205:1: rule__GitRepo__Group__3 : rule__GitRepo__Group__3__Impl rule__GitRepo__Group__4 ;
    public final void rule__GitRepo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2209:1: ( rule__GitRepo__Group__3__Impl rule__GitRepo__Group__4 )
            // InternalKinematicsParser.g:2210:2: rule__GitRepo__Group__3__Impl rule__GitRepo__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__GitRepo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GitRepo__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__Group__3"


    // $ANTLR start "rule__GitRepo__Group__3__Impl"
    // InternalKinematicsParser.g:2217:1: rule__GitRepo__Group__3__Impl : ( Repo ) ;
    public final void rule__GitRepo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2221:1: ( ( Repo ) )
            // InternalKinematicsParser.g:2222:1: ( Repo )
            {
            // InternalKinematicsParser.g:2222:1: ( Repo )
            // InternalKinematicsParser.g:2223:2: Repo
            {
             before(grammarAccess.getGitRepoAccess().getRepoKeyword_3()); 
            match(input,Repo,FOLLOW_2); 
             after(grammarAccess.getGitRepoAccess().getRepoKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__Group__3__Impl"


    // $ANTLR start "rule__GitRepo__Group__4"
    // InternalKinematicsParser.g:2232:1: rule__GitRepo__Group__4 : rule__GitRepo__Group__4__Impl rule__GitRepo__Group__5 ;
    public final void rule__GitRepo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2236:1: ( rule__GitRepo__Group__4__Impl rule__GitRepo__Group__5 )
            // InternalKinematicsParser.g:2237:2: rule__GitRepo__Group__4__Impl rule__GitRepo__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__GitRepo__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GitRepo__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__Group__4"


    // $ANTLR start "rule__GitRepo__Group__4__Impl"
    // InternalKinematicsParser.g:2244:1: rule__GitRepo__Group__4__Impl : ( ( rule__GitRepo__RepoAssignment_4 ) ) ;
    public final void rule__GitRepo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2248:1: ( ( ( rule__GitRepo__RepoAssignment_4 ) ) )
            // InternalKinematicsParser.g:2249:1: ( ( rule__GitRepo__RepoAssignment_4 ) )
            {
            // InternalKinematicsParser.g:2249:1: ( ( rule__GitRepo__RepoAssignment_4 ) )
            // InternalKinematicsParser.g:2250:2: ( rule__GitRepo__RepoAssignment_4 )
            {
             before(grammarAccess.getGitRepoAccess().getRepoAssignment_4()); 
            // InternalKinematicsParser.g:2251:2: ( rule__GitRepo__RepoAssignment_4 )
            // InternalKinematicsParser.g:2251:3: rule__GitRepo__RepoAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__GitRepo__RepoAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGitRepoAccess().getRepoAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__Group__4__Impl"


    // $ANTLR start "rule__GitRepo__Group__5"
    // InternalKinematicsParser.g:2259:1: rule__GitRepo__Group__5 : rule__GitRepo__Group__5__Impl rule__GitRepo__Group__6 ;
    public final void rule__GitRepo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2263:1: ( rule__GitRepo__Group__5__Impl rule__GitRepo__Group__6 )
            // InternalKinematicsParser.g:2264:2: rule__GitRepo__Group__5__Impl rule__GitRepo__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__GitRepo__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GitRepo__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__Group__5"


    // $ANTLR start "rule__GitRepo__Group__5__Impl"
    // InternalKinematicsParser.g:2271:1: rule__GitRepo__Group__5__Impl : ( Branch ) ;
    public final void rule__GitRepo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2275:1: ( ( Branch ) )
            // InternalKinematicsParser.g:2276:1: ( Branch )
            {
            // InternalKinematicsParser.g:2276:1: ( Branch )
            // InternalKinematicsParser.g:2277:2: Branch
            {
             before(grammarAccess.getGitRepoAccess().getBranchKeyword_5()); 
            match(input,Branch,FOLLOW_2); 
             after(grammarAccess.getGitRepoAccess().getBranchKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__Group__5__Impl"


    // $ANTLR start "rule__GitRepo__Group__6"
    // InternalKinematicsParser.g:2286:1: rule__GitRepo__Group__6 : rule__GitRepo__Group__6__Impl rule__GitRepo__Group__7 ;
    public final void rule__GitRepo__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2290:1: ( rule__GitRepo__Group__6__Impl rule__GitRepo__Group__7 )
            // InternalKinematicsParser.g:2291:2: rule__GitRepo__Group__6__Impl rule__GitRepo__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__GitRepo__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GitRepo__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__Group__6"


    // $ANTLR start "rule__GitRepo__Group__6__Impl"
    // InternalKinematicsParser.g:2298:1: rule__GitRepo__Group__6__Impl : ( ( rule__GitRepo__BranchAssignment_6 ) ) ;
    public final void rule__GitRepo__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2302:1: ( ( ( rule__GitRepo__BranchAssignment_6 ) ) )
            // InternalKinematicsParser.g:2303:1: ( ( rule__GitRepo__BranchAssignment_6 ) )
            {
            // InternalKinematicsParser.g:2303:1: ( ( rule__GitRepo__BranchAssignment_6 ) )
            // InternalKinematicsParser.g:2304:2: ( rule__GitRepo__BranchAssignment_6 )
            {
             before(grammarAccess.getGitRepoAccess().getBranchAssignment_6()); 
            // InternalKinematicsParser.g:2305:2: ( rule__GitRepo__BranchAssignment_6 )
            // InternalKinematicsParser.g:2305:3: rule__GitRepo__BranchAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__GitRepo__BranchAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getGitRepoAccess().getBranchAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__Group__6__Impl"


    // $ANTLR start "rule__GitRepo__Group__7"
    // InternalKinematicsParser.g:2313:1: rule__GitRepo__Group__7 : rule__GitRepo__Group__7__Impl rule__GitRepo__Group__8 ;
    public final void rule__GitRepo__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2317:1: ( rule__GitRepo__Group__7__Impl rule__GitRepo__Group__8 )
            // InternalKinematicsParser.g:2318:2: rule__GitRepo__Group__7__Impl rule__GitRepo__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__GitRepo__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GitRepo__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__Group__7"


    // $ANTLR start "rule__GitRepo__Group__7__Impl"
    // InternalKinematicsParser.g:2325:1: rule__GitRepo__Group__7__Impl : ( Package ) ;
    public final void rule__GitRepo__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2329:1: ( ( Package ) )
            // InternalKinematicsParser.g:2330:1: ( Package )
            {
            // InternalKinematicsParser.g:2330:1: ( Package )
            // InternalKinematicsParser.g:2331:2: Package
            {
             before(grammarAccess.getGitRepoAccess().getPackageKeyword_7()); 
            match(input,Package,FOLLOW_2); 
             after(grammarAccess.getGitRepoAccess().getPackageKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__Group__7__Impl"


    // $ANTLR start "rule__GitRepo__Group__8"
    // InternalKinematicsParser.g:2340:1: rule__GitRepo__Group__8 : rule__GitRepo__Group__8__Impl rule__GitRepo__Group__9 ;
    public final void rule__GitRepo__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2344:1: ( rule__GitRepo__Group__8__Impl rule__GitRepo__Group__9 )
            // InternalKinematicsParser.g:2345:2: rule__GitRepo__Group__8__Impl rule__GitRepo__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__GitRepo__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GitRepo__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__Group__8"


    // $ANTLR start "rule__GitRepo__Group__8__Impl"
    // InternalKinematicsParser.g:2352:1: rule__GitRepo__Group__8__Impl : ( ( rule__GitRepo__PackageAssignment_8 ) ) ;
    public final void rule__GitRepo__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2356:1: ( ( ( rule__GitRepo__PackageAssignment_8 ) ) )
            // InternalKinematicsParser.g:2357:1: ( ( rule__GitRepo__PackageAssignment_8 ) )
            {
            // InternalKinematicsParser.g:2357:1: ( ( rule__GitRepo__PackageAssignment_8 ) )
            // InternalKinematicsParser.g:2358:2: ( rule__GitRepo__PackageAssignment_8 )
            {
             before(grammarAccess.getGitRepoAccess().getPackageAssignment_8()); 
            // InternalKinematicsParser.g:2359:2: ( rule__GitRepo__PackageAssignment_8 )
            // InternalKinematicsParser.g:2359:3: rule__GitRepo__PackageAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__GitRepo__PackageAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getGitRepoAccess().getPackageAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__Group__8__Impl"


    // $ANTLR start "rule__GitRepo__Group__9"
    // InternalKinematicsParser.g:2367:1: rule__GitRepo__Group__9 : rule__GitRepo__Group__9__Impl rule__GitRepo__Group__10 ;
    public final void rule__GitRepo__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2371:1: ( rule__GitRepo__Group__9__Impl rule__GitRepo__Group__10 )
            // InternalKinematicsParser.g:2372:2: rule__GitRepo__Group__9__Impl rule__GitRepo__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__GitRepo__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GitRepo__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__Group__9"


    // $ANTLR start "rule__GitRepo__Group__9__Impl"
    // InternalKinematicsParser.g:2379:1: rule__GitRepo__Group__9__Impl : ( Version ) ;
    public final void rule__GitRepo__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2383:1: ( ( Version ) )
            // InternalKinematicsParser.g:2384:1: ( Version )
            {
            // InternalKinematicsParser.g:2384:1: ( Version )
            // InternalKinematicsParser.g:2385:2: Version
            {
             before(grammarAccess.getGitRepoAccess().getVersionKeyword_9()); 
            match(input,Version,FOLLOW_2); 
             after(grammarAccess.getGitRepoAccess().getVersionKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__Group__9__Impl"


    // $ANTLR start "rule__GitRepo__Group__10"
    // InternalKinematicsParser.g:2394:1: rule__GitRepo__Group__10 : rule__GitRepo__Group__10__Impl rule__GitRepo__Group__11 ;
    public final void rule__GitRepo__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2398:1: ( rule__GitRepo__Group__10__Impl rule__GitRepo__Group__11 )
            // InternalKinematicsParser.g:2399:2: rule__GitRepo__Group__10__Impl rule__GitRepo__Group__11
            {
            pushFollow(FOLLOW_30);
            rule__GitRepo__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GitRepo__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__Group__10"


    // $ANTLR start "rule__GitRepo__Group__10__Impl"
    // InternalKinematicsParser.g:2406:1: rule__GitRepo__Group__10__Impl : ( ( rule__GitRepo__VersionAssignment_10 ) ) ;
    public final void rule__GitRepo__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2410:1: ( ( ( rule__GitRepo__VersionAssignment_10 ) ) )
            // InternalKinematicsParser.g:2411:1: ( ( rule__GitRepo__VersionAssignment_10 ) )
            {
            // InternalKinematicsParser.g:2411:1: ( ( rule__GitRepo__VersionAssignment_10 ) )
            // InternalKinematicsParser.g:2412:2: ( rule__GitRepo__VersionAssignment_10 )
            {
             before(grammarAccess.getGitRepoAccess().getVersionAssignment_10()); 
            // InternalKinematicsParser.g:2413:2: ( rule__GitRepo__VersionAssignment_10 )
            // InternalKinematicsParser.g:2413:3: rule__GitRepo__VersionAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__GitRepo__VersionAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getGitRepoAccess().getVersionAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__Group__10__Impl"


    // $ANTLR start "rule__GitRepo__Group__11"
    // InternalKinematicsParser.g:2421:1: rule__GitRepo__Group__11 : rule__GitRepo__Group__11__Impl ;
    public final void rule__GitRepo__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2425:1: ( rule__GitRepo__Group__11__Impl )
            // InternalKinematicsParser.g:2426:2: rule__GitRepo__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GitRepo__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__Group__11"


    // $ANTLR start "rule__GitRepo__Group__11__Impl"
    // InternalKinematicsParser.g:2432:1: rule__GitRepo__Group__11__Impl : ( RULE_END ) ;
    public final void rule__GitRepo__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2436:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:2437:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:2437:1: ( RULE_END )
            // InternalKinematicsParser.g:2438:2: RULE_END
            {
             before(grammarAccess.getGitRepoAccess().getENDTerminalRuleCall_11()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getGitRepoAccess().getENDTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__Group__11__Impl"


    // $ANTLR start "rule__Group__Group__0"
    // InternalKinematicsParser.g:2448:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2452:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // InternalKinematicsParser.g:2453:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0"


    // $ANTLR start "rule__Group__Group__0__Impl"
    // InternalKinematicsParser.g:2460:1: rule__Group__Group__0__Impl : ( HyphenMinus ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2464:1: ( ( HyphenMinus ) )
            // InternalKinematicsParser.g:2465:1: ( HyphenMinus )
            {
            // InternalKinematicsParser.g:2465:1: ( HyphenMinus )
            // InternalKinematicsParser.g:2466:2: HyphenMinus
            {
             before(grammarAccess.getGroupAccess().getHyphenMinusKeyword_0()); 
            match(input,HyphenMinus,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0__Impl"


    // $ANTLR start "rule__Group__Group__1"
    // InternalKinematicsParser.g:2475:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2479:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // InternalKinematicsParser.g:2480:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1"


    // $ANTLR start "rule__Group__Group__1__Impl"
    // InternalKinematicsParser.g:2487:1: rule__Group__Group__1__Impl : ( Name ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2491:1: ( ( Name ) )
            // InternalKinematicsParser.g:2492:1: ( Name )
            {
            // InternalKinematicsParser.g:2492:1: ( Name )
            // InternalKinematicsParser.g:2493:2: Name
            {
             before(grammarAccess.getGroupAccess().getNameKeyword_1()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1__Impl"


    // $ANTLR start "rule__Group__Group__2"
    // InternalKinematicsParser.g:2502:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2506:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // InternalKinematicsParser.g:2507:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__2"


    // $ANTLR start "rule__Group__Group__2__Impl"
    // InternalKinematicsParser.g:2514:1: rule__Group__Group__2__Impl : ( ( rule__Group__NameAssignment_2 ) ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2518:1: ( ( ( rule__Group__NameAssignment_2 ) ) )
            // InternalKinematicsParser.g:2519:1: ( ( rule__Group__NameAssignment_2 ) )
            {
            // InternalKinematicsParser.g:2519:1: ( ( rule__Group__NameAssignment_2 ) )
            // InternalKinematicsParser.g:2520:2: ( rule__Group__NameAssignment_2 )
            {
             before(grammarAccess.getGroupAccess().getNameAssignment_2()); 
            // InternalKinematicsParser.g:2521:2: ( rule__Group__NameAssignment_2 )
            // InternalKinematicsParser.g:2521:3: rule__Group__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Group__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__2__Impl"


    // $ANTLR start "rule__Group__Group__3"
    // InternalKinematicsParser.g:2529:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2533:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // InternalKinematicsParser.g:2534:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__3"


    // $ANTLR start "rule__Group__Group__3__Impl"
    // InternalKinematicsParser.g:2541:1: rule__Group__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2545:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:2546:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:2546:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:2547:2: RULE_BEGIN
            {
             before(grammarAccess.getGroupAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getBEGINTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__3__Impl"


    // $ANTLR start "rule__Group__Group__4"
    // InternalKinematicsParser.g:2556:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2560:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // InternalKinematicsParser.g:2561:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Group__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__4"


    // $ANTLR start "rule__Group__Group__4__Impl"
    // InternalKinematicsParser.g:2568:1: rule__Group__Group__4__Impl : ( BaseLink ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2572:1: ( ( BaseLink ) )
            // InternalKinematicsParser.g:2573:1: ( BaseLink )
            {
            // InternalKinematicsParser.g:2573:1: ( BaseLink )
            // InternalKinematicsParser.g:2574:2: BaseLink
            {
             before(grammarAccess.getGroupAccess().getBaseLinkKeyword_4()); 
            match(input,BaseLink,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getBaseLinkKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__4__Impl"


    // $ANTLR start "rule__Group__Group__5"
    // InternalKinematicsParser.g:2583:1: rule__Group__Group__5 : rule__Group__Group__5__Impl rule__Group__Group__6 ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2587:1: ( rule__Group__Group__5__Impl rule__Group__Group__6 )
            // InternalKinematicsParser.g:2588:2: rule__Group__Group__5__Impl rule__Group__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__Group__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__5"


    // $ANTLR start "rule__Group__Group__5__Impl"
    // InternalKinematicsParser.g:2595:1: rule__Group__Group__5__Impl : ( ( rule__Group__BaseLinkAssignment_5 ) ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2599:1: ( ( ( rule__Group__BaseLinkAssignment_5 ) ) )
            // InternalKinematicsParser.g:2600:1: ( ( rule__Group__BaseLinkAssignment_5 ) )
            {
            // InternalKinematicsParser.g:2600:1: ( ( rule__Group__BaseLinkAssignment_5 ) )
            // InternalKinematicsParser.g:2601:2: ( rule__Group__BaseLinkAssignment_5 )
            {
             before(grammarAccess.getGroupAccess().getBaseLinkAssignment_5()); 
            // InternalKinematicsParser.g:2602:2: ( rule__Group__BaseLinkAssignment_5 )
            // InternalKinematicsParser.g:2602:3: rule__Group__BaseLinkAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Group__BaseLinkAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getBaseLinkAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__5__Impl"


    // $ANTLR start "rule__Group__Group__6"
    // InternalKinematicsParser.g:2610:1: rule__Group__Group__6 : rule__Group__Group__6__Impl rule__Group__Group__7 ;
    public final void rule__Group__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2614:1: ( rule__Group__Group__6__Impl rule__Group__Group__7 )
            // InternalKinematicsParser.g:2615:2: rule__Group__Group__6__Impl rule__Group__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Group__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__6"


    // $ANTLR start "rule__Group__Group__6__Impl"
    // InternalKinematicsParser.g:2622:1: rule__Group__Group__6__Impl : ( EndLink ) ;
    public final void rule__Group__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2626:1: ( ( EndLink ) )
            // InternalKinematicsParser.g:2627:1: ( EndLink )
            {
            // InternalKinematicsParser.g:2627:1: ( EndLink )
            // InternalKinematicsParser.g:2628:2: EndLink
            {
             before(grammarAccess.getGroupAccess().getEndLinkKeyword_6()); 
            match(input,EndLink,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getEndLinkKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__6__Impl"


    // $ANTLR start "rule__Group__Group__7"
    // InternalKinematicsParser.g:2637:1: rule__Group__Group__7 : rule__Group__Group__7__Impl rule__Group__Group__8 ;
    public final void rule__Group__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2641:1: ( rule__Group__Group__7__Impl rule__Group__Group__8 )
            // InternalKinematicsParser.g:2642:2: rule__Group__Group__7__Impl rule__Group__Group__8
            {
            pushFollow(FOLLOW_33);
            rule__Group__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__7"


    // $ANTLR start "rule__Group__Group__7__Impl"
    // InternalKinematicsParser.g:2649:1: rule__Group__Group__7__Impl : ( ( rule__Group__EndLinkAssignment_7 ) ) ;
    public final void rule__Group__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2653:1: ( ( ( rule__Group__EndLinkAssignment_7 ) ) )
            // InternalKinematicsParser.g:2654:1: ( ( rule__Group__EndLinkAssignment_7 ) )
            {
            // InternalKinematicsParser.g:2654:1: ( ( rule__Group__EndLinkAssignment_7 ) )
            // InternalKinematicsParser.g:2655:2: ( rule__Group__EndLinkAssignment_7 )
            {
             before(grammarAccess.getGroupAccess().getEndLinkAssignment_7()); 
            // InternalKinematicsParser.g:2656:2: ( rule__Group__EndLinkAssignment_7 )
            // InternalKinematicsParser.g:2656:3: rule__Group__EndLinkAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Group__EndLinkAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getEndLinkAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__7__Impl"


    // $ANTLR start "rule__Group__Group__8"
    // InternalKinematicsParser.g:2664:1: rule__Group__Group__8 : rule__Group__Group__8__Impl rule__Group__Group__9 ;
    public final void rule__Group__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2668:1: ( rule__Group__Group__8__Impl rule__Group__Group__9 )
            // InternalKinematicsParser.g:2669:2: rule__Group__Group__8__Impl rule__Group__Group__9
            {
            pushFollow(FOLLOW_33);
            rule__Group__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__8"


    // $ANTLR start "rule__Group__Group__8__Impl"
    // InternalKinematicsParser.g:2676:1: rule__Group__Group__8__Impl : ( ( rule__Group__Group_8__0 )? ) ;
    public final void rule__Group__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2680:1: ( ( ( rule__Group__Group_8__0 )? ) )
            // InternalKinematicsParser.g:2681:1: ( ( rule__Group__Group_8__0 )? )
            {
            // InternalKinematicsParser.g:2681:1: ( ( rule__Group__Group_8__0 )? )
            // InternalKinematicsParser.g:2682:2: ( rule__Group__Group_8__0 )?
            {
             before(grammarAccess.getGroupAccess().getGroup_8()); 
            // InternalKinematicsParser.g:2683:2: ( rule__Group__Group_8__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Ros2_control) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalKinematicsParser.g:2683:3: rule__Group__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Group__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__8__Impl"


    // $ANTLR start "rule__Group__Group__9"
    // InternalKinematicsParser.g:2691:1: rule__Group__Group__9 : rule__Group__Group__9__Impl ;
    public final void rule__Group__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2695:1: ( rule__Group__Group__9__Impl )
            // InternalKinematicsParser.g:2696:2: rule__Group__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__9"


    // $ANTLR start "rule__Group__Group__9__Impl"
    // InternalKinematicsParser.g:2702:1: rule__Group__Group__9__Impl : ( RULE_END ) ;
    public final void rule__Group__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2706:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:2707:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:2707:1: ( RULE_END )
            // InternalKinematicsParser.g:2708:2: RULE_END
            {
             before(grammarAccess.getGroupAccess().getENDTerminalRuleCall_9()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getENDTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__9__Impl"


    // $ANTLR start "rule__Group__Group_8__0"
    // InternalKinematicsParser.g:2718:1: rule__Group__Group_8__0 : rule__Group__Group_8__0__Impl rule__Group__Group_8__1 ;
    public final void rule__Group__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2722:1: ( rule__Group__Group_8__0__Impl rule__Group__Group_8__1 )
            // InternalKinematicsParser.g:2723:2: rule__Group__Group_8__0__Impl rule__Group__Group_8__1
            {
            pushFollow(FOLLOW_6);
            rule__Group__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_8__0"


    // $ANTLR start "rule__Group__Group_8__0__Impl"
    // InternalKinematicsParser.g:2730:1: rule__Group__Group_8__0__Impl : ( Ros2_control ) ;
    public final void rule__Group__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2734:1: ( ( Ros2_control ) )
            // InternalKinematicsParser.g:2735:1: ( Ros2_control )
            {
            // InternalKinematicsParser.g:2735:1: ( Ros2_control )
            // InternalKinematicsParser.g:2736:2: Ros2_control
            {
             before(grammarAccess.getGroupAccess().getRos2_controlKeyword_8_0()); 
            match(input,Ros2_control,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getRos2_controlKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_8__0__Impl"


    // $ANTLR start "rule__Group__Group_8__1"
    // InternalKinematicsParser.g:2745:1: rule__Group__Group_8__1 : rule__Group__Group_8__1__Impl ;
    public final void rule__Group__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2749:1: ( rule__Group__Group_8__1__Impl )
            // InternalKinematicsParser.g:2750:2: rule__Group__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_8__1"


    // $ANTLR start "rule__Group__Group_8__1__Impl"
    // InternalKinematicsParser.g:2756:1: rule__Group__Group_8__1__Impl : ( ( rule__Group__Ros2_controlAssignment_8_1 ) ) ;
    public final void rule__Group__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2760:1: ( ( ( rule__Group__Ros2_controlAssignment_8_1 ) ) )
            // InternalKinematicsParser.g:2761:1: ( ( rule__Group__Ros2_controlAssignment_8_1 ) )
            {
            // InternalKinematicsParser.g:2761:1: ( ( rule__Group__Ros2_controlAssignment_8_1 ) )
            // InternalKinematicsParser.g:2762:2: ( rule__Group__Ros2_controlAssignment_8_1 )
            {
             before(grammarAccess.getGroupAccess().getRos2_controlAssignment_8_1()); 
            // InternalKinematicsParser.g:2763:2: ( rule__Group__Ros2_controlAssignment_8_1 )
            // InternalKinematicsParser.g:2763:3: rule__Group__Ros2_controlAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Group__Ros2_controlAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getRos2_controlAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_8__1__Impl"


    // $ANTLR start "rule__BaseAttachment__Group__0"
    // InternalKinematicsParser.g:2772:1: rule__BaseAttachment__Group__0 : rule__BaseAttachment__Group__0__Impl rule__BaseAttachment__Group__1 ;
    public final void rule__BaseAttachment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2776:1: ( rule__BaseAttachment__Group__0__Impl rule__BaseAttachment__Group__1 )
            // InternalKinematicsParser.g:2777:2: rule__BaseAttachment__Group__0__Impl rule__BaseAttachment__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__BaseAttachment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseAttachment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseAttachment__Group__0"


    // $ANTLR start "rule__BaseAttachment__Group__0__Impl"
    // InternalKinematicsParser.g:2784:1: rule__BaseAttachment__Group__0__Impl : ( HyphenMinus ) ;
    public final void rule__BaseAttachment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2788:1: ( ( HyphenMinus ) )
            // InternalKinematicsParser.g:2789:1: ( HyphenMinus )
            {
            // InternalKinematicsParser.g:2789:1: ( HyphenMinus )
            // InternalKinematicsParser.g:2790:2: HyphenMinus
            {
             before(grammarAccess.getBaseAttachmentAccess().getHyphenMinusKeyword_0()); 
            match(input,HyphenMinus,FOLLOW_2); 
             after(grammarAccess.getBaseAttachmentAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseAttachment__Group__0__Impl"


    // $ANTLR start "rule__BaseAttachment__Group__1"
    // InternalKinematicsParser.g:2799:1: rule__BaseAttachment__Group__1 : rule__BaseAttachment__Group__1__Impl rule__BaseAttachment__Group__2 ;
    public final void rule__BaseAttachment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2803:1: ( rule__BaseAttachment__Group__1__Impl rule__BaseAttachment__Group__2 )
            // InternalKinematicsParser.g:2804:2: rule__BaseAttachment__Group__1__Impl rule__BaseAttachment__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__BaseAttachment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseAttachment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseAttachment__Group__1"


    // $ANTLR start "rule__BaseAttachment__Group__1__Impl"
    // InternalKinematicsParser.g:2811:1: rule__BaseAttachment__Group__1__Impl : ( Name ) ;
    public final void rule__BaseAttachment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2815:1: ( ( Name ) )
            // InternalKinematicsParser.g:2816:1: ( Name )
            {
            // InternalKinematicsParser.g:2816:1: ( Name )
            // InternalKinematicsParser.g:2817:2: Name
            {
             before(grammarAccess.getBaseAttachmentAccess().getNameKeyword_1()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getBaseAttachmentAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseAttachment__Group__1__Impl"


    // $ANTLR start "rule__BaseAttachment__Group__2"
    // InternalKinematicsParser.g:2826:1: rule__BaseAttachment__Group__2 : rule__BaseAttachment__Group__2__Impl rule__BaseAttachment__Group__3 ;
    public final void rule__BaseAttachment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2830:1: ( rule__BaseAttachment__Group__2__Impl rule__BaseAttachment__Group__3 )
            // InternalKinematicsParser.g:2831:2: rule__BaseAttachment__Group__2__Impl rule__BaseAttachment__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__BaseAttachment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseAttachment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseAttachment__Group__2"


    // $ANTLR start "rule__BaseAttachment__Group__2__Impl"
    // InternalKinematicsParser.g:2838:1: rule__BaseAttachment__Group__2__Impl : ( ( rule__BaseAttachment__NameAssignment_2 ) ) ;
    public final void rule__BaseAttachment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2842:1: ( ( ( rule__BaseAttachment__NameAssignment_2 ) ) )
            // InternalKinematicsParser.g:2843:1: ( ( rule__BaseAttachment__NameAssignment_2 ) )
            {
            // InternalKinematicsParser.g:2843:1: ( ( rule__BaseAttachment__NameAssignment_2 ) )
            // InternalKinematicsParser.g:2844:2: ( rule__BaseAttachment__NameAssignment_2 )
            {
             before(grammarAccess.getBaseAttachmentAccess().getNameAssignment_2()); 
            // InternalKinematicsParser.g:2845:2: ( rule__BaseAttachment__NameAssignment_2 )
            // InternalKinematicsParser.g:2845:3: rule__BaseAttachment__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BaseAttachment__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBaseAttachmentAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseAttachment__Group__2__Impl"


    // $ANTLR start "rule__BaseAttachment__Group__3"
    // InternalKinematicsParser.g:2853:1: rule__BaseAttachment__Group__3 : rule__BaseAttachment__Group__3__Impl rule__BaseAttachment__Group__4 ;
    public final void rule__BaseAttachment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2857:1: ( rule__BaseAttachment__Group__3__Impl rule__BaseAttachment__Group__4 )
            // InternalKinematicsParser.g:2858:2: rule__BaseAttachment__Group__3__Impl rule__BaseAttachment__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__BaseAttachment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseAttachment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseAttachment__Group__3"


    // $ANTLR start "rule__BaseAttachment__Group__3__Impl"
    // InternalKinematicsParser.g:2865:1: rule__BaseAttachment__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__BaseAttachment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2869:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:2870:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:2870:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:2871:2: RULE_BEGIN
            {
             before(grammarAccess.getBaseAttachmentAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getBaseAttachmentAccess().getBEGINTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseAttachment__Group__3__Impl"


    // $ANTLR start "rule__BaseAttachment__Group__4"
    // InternalKinematicsParser.g:2880:1: rule__BaseAttachment__Group__4 : rule__BaseAttachment__Group__4__Impl rule__BaseAttachment__Group__5 ;
    public final void rule__BaseAttachment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2884:1: ( rule__BaseAttachment__Group__4__Impl rule__BaseAttachment__Group__5 )
            // InternalKinematicsParser.g:2885:2: rule__BaseAttachment__Group__4__Impl rule__BaseAttachment__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__BaseAttachment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseAttachment__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseAttachment__Group__4"


    // $ANTLR start "rule__BaseAttachment__Group__4__Impl"
    // InternalKinematicsParser.g:2892:1: rule__BaseAttachment__Group__4__Impl : ( Origin ) ;
    public final void rule__BaseAttachment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2896:1: ( ( Origin ) )
            // InternalKinematicsParser.g:2897:1: ( Origin )
            {
            // InternalKinematicsParser.g:2897:1: ( Origin )
            // InternalKinematicsParser.g:2898:2: Origin
            {
             before(grammarAccess.getBaseAttachmentAccess().getOriginKeyword_4()); 
            match(input,Origin,FOLLOW_2); 
             after(grammarAccess.getBaseAttachmentAccess().getOriginKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseAttachment__Group__4__Impl"


    // $ANTLR start "rule__BaseAttachment__Group__5"
    // InternalKinematicsParser.g:2907:1: rule__BaseAttachment__Group__5 : rule__BaseAttachment__Group__5__Impl rule__BaseAttachment__Group__6 ;
    public final void rule__BaseAttachment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2911:1: ( rule__BaseAttachment__Group__5__Impl rule__BaseAttachment__Group__6 )
            // InternalKinematicsParser.g:2912:2: rule__BaseAttachment__Group__5__Impl rule__BaseAttachment__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__BaseAttachment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseAttachment__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseAttachment__Group__5"


    // $ANTLR start "rule__BaseAttachment__Group__5__Impl"
    // InternalKinematicsParser.g:2919:1: rule__BaseAttachment__Group__5__Impl : ( ( rule__BaseAttachment__OriginAssignment_5 ) ) ;
    public final void rule__BaseAttachment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2923:1: ( ( ( rule__BaseAttachment__OriginAssignment_5 ) ) )
            // InternalKinematicsParser.g:2924:1: ( ( rule__BaseAttachment__OriginAssignment_5 ) )
            {
            // InternalKinematicsParser.g:2924:1: ( ( rule__BaseAttachment__OriginAssignment_5 ) )
            // InternalKinematicsParser.g:2925:2: ( rule__BaseAttachment__OriginAssignment_5 )
            {
             before(grammarAccess.getBaseAttachmentAccess().getOriginAssignment_5()); 
            // InternalKinematicsParser.g:2926:2: ( rule__BaseAttachment__OriginAssignment_5 )
            // InternalKinematicsParser.g:2926:3: rule__BaseAttachment__OriginAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__BaseAttachment__OriginAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBaseAttachmentAccess().getOriginAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseAttachment__Group__5__Impl"


    // $ANTLR start "rule__BaseAttachment__Group__6"
    // InternalKinematicsParser.g:2934:1: rule__BaseAttachment__Group__6 : rule__BaseAttachment__Group__6__Impl rule__BaseAttachment__Group__7 ;
    public final void rule__BaseAttachment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2938:1: ( rule__BaseAttachment__Group__6__Impl rule__BaseAttachment__Group__7 )
            // InternalKinematicsParser.g:2939:2: rule__BaseAttachment__Group__6__Impl rule__BaseAttachment__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__BaseAttachment__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseAttachment__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseAttachment__Group__6"


    // $ANTLR start "rule__BaseAttachment__Group__6__Impl"
    // InternalKinematicsParser.g:2946:1: rule__BaseAttachment__Group__6__Impl : ( Parent ) ;
    public final void rule__BaseAttachment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2950:1: ( ( Parent ) )
            // InternalKinematicsParser.g:2951:1: ( Parent )
            {
            // InternalKinematicsParser.g:2951:1: ( Parent )
            // InternalKinematicsParser.g:2952:2: Parent
            {
             before(grammarAccess.getBaseAttachmentAccess().getParentKeyword_6()); 
            match(input,Parent,FOLLOW_2); 
             after(grammarAccess.getBaseAttachmentAccess().getParentKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseAttachment__Group__6__Impl"


    // $ANTLR start "rule__BaseAttachment__Group__7"
    // InternalKinematicsParser.g:2961:1: rule__BaseAttachment__Group__7 : rule__BaseAttachment__Group__7__Impl rule__BaseAttachment__Group__8 ;
    public final void rule__BaseAttachment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2965:1: ( rule__BaseAttachment__Group__7__Impl rule__BaseAttachment__Group__8 )
            // InternalKinematicsParser.g:2966:2: rule__BaseAttachment__Group__7__Impl rule__BaseAttachment__Group__8
            {
            pushFollow(FOLLOW_30);
            rule__BaseAttachment__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseAttachment__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseAttachment__Group__7"


    // $ANTLR start "rule__BaseAttachment__Group__7__Impl"
    // InternalKinematicsParser.g:2973:1: rule__BaseAttachment__Group__7__Impl : ( ( rule__BaseAttachment__ParentAssignment_7 ) ) ;
    public final void rule__BaseAttachment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2977:1: ( ( ( rule__BaseAttachment__ParentAssignment_7 ) ) )
            // InternalKinematicsParser.g:2978:1: ( ( rule__BaseAttachment__ParentAssignment_7 ) )
            {
            // InternalKinematicsParser.g:2978:1: ( ( rule__BaseAttachment__ParentAssignment_7 ) )
            // InternalKinematicsParser.g:2979:2: ( rule__BaseAttachment__ParentAssignment_7 )
            {
             before(grammarAccess.getBaseAttachmentAccess().getParentAssignment_7()); 
            // InternalKinematicsParser.g:2980:2: ( rule__BaseAttachment__ParentAssignment_7 )
            // InternalKinematicsParser.g:2980:3: rule__BaseAttachment__ParentAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__BaseAttachment__ParentAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getBaseAttachmentAccess().getParentAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseAttachment__Group__7__Impl"


    // $ANTLR start "rule__BaseAttachment__Group__8"
    // InternalKinematicsParser.g:2988:1: rule__BaseAttachment__Group__8 : rule__BaseAttachment__Group__8__Impl ;
    public final void rule__BaseAttachment__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2992:1: ( rule__BaseAttachment__Group__8__Impl )
            // InternalKinematicsParser.g:2993:2: rule__BaseAttachment__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseAttachment__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseAttachment__Group__8"


    // $ANTLR start "rule__BaseAttachment__Group__8__Impl"
    // InternalKinematicsParser.g:2999:1: rule__BaseAttachment__Group__8__Impl : ( RULE_END ) ;
    public final void rule__BaseAttachment__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3003:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:3004:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:3004:1: ( RULE_END )
            // InternalKinematicsParser.g:3005:2: RULE_END
            {
             before(grammarAccess.getBaseAttachmentAccess().getENDTerminalRuleCall_8()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getBaseAttachmentAccess().getENDTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseAttachment__Group__8__Impl"


    // $ANTLR start "rule__FlangeAttachment__Group__0"
    // InternalKinematicsParser.g:3015:1: rule__FlangeAttachment__Group__0 : rule__FlangeAttachment__Group__0__Impl rule__FlangeAttachment__Group__1 ;
    public final void rule__FlangeAttachment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3019:1: ( rule__FlangeAttachment__Group__0__Impl rule__FlangeAttachment__Group__1 )
            // InternalKinematicsParser.g:3020:2: rule__FlangeAttachment__Group__0__Impl rule__FlangeAttachment__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__FlangeAttachment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FlangeAttachment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlangeAttachment__Group__0"


    // $ANTLR start "rule__FlangeAttachment__Group__0__Impl"
    // InternalKinematicsParser.g:3027:1: rule__FlangeAttachment__Group__0__Impl : ( HyphenMinus ) ;
    public final void rule__FlangeAttachment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3031:1: ( ( HyphenMinus ) )
            // InternalKinematicsParser.g:3032:1: ( HyphenMinus )
            {
            // InternalKinematicsParser.g:3032:1: ( HyphenMinus )
            // InternalKinematicsParser.g:3033:2: HyphenMinus
            {
             before(grammarAccess.getFlangeAttachmentAccess().getHyphenMinusKeyword_0()); 
            match(input,HyphenMinus,FOLLOW_2); 
             after(grammarAccess.getFlangeAttachmentAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlangeAttachment__Group__0__Impl"


    // $ANTLR start "rule__FlangeAttachment__Group__1"
    // InternalKinematicsParser.g:3042:1: rule__FlangeAttachment__Group__1 : rule__FlangeAttachment__Group__1__Impl rule__FlangeAttachment__Group__2 ;
    public final void rule__FlangeAttachment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3046:1: ( rule__FlangeAttachment__Group__1__Impl rule__FlangeAttachment__Group__2 )
            // InternalKinematicsParser.g:3047:2: rule__FlangeAttachment__Group__1__Impl rule__FlangeAttachment__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__FlangeAttachment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FlangeAttachment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlangeAttachment__Group__1"


    // $ANTLR start "rule__FlangeAttachment__Group__1__Impl"
    // InternalKinematicsParser.g:3054:1: rule__FlangeAttachment__Group__1__Impl : ( Name ) ;
    public final void rule__FlangeAttachment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3058:1: ( ( Name ) )
            // InternalKinematicsParser.g:3059:1: ( Name )
            {
            // InternalKinematicsParser.g:3059:1: ( Name )
            // InternalKinematicsParser.g:3060:2: Name
            {
             before(grammarAccess.getFlangeAttachmentAccess().getNameKeyword_1()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getFlangeAttachmentAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlangeAttachment__Group__1__Impl"


    // $ANTLR start "rule__FlangeAttachment__Group__2"
    // InternalKinematicsParser.g:3069:1: rule__FlangeAttachment__Group__2 : rule__FlangeAttachment__Group__2__Impl rule__FlangeAttachment__Group__3 ;
    public final void rule__FlangeAttachment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3073:1: ( rule__FlangeAttachment__Group__2__Impl rule__FlangeAttachment__Group__3 )
            // InternalKinematicsParser.g:3074:2: rule__FlangeAttachment__Group__2__Impl rule__FlangeAttachment__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__FlangeAttachment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FlangeAttachment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlangeAttachment__Group__2"


    // $ANTLR start "rule__FlangeAttachment__Group__2__Impl"
    // InternalKinematicsParser.g:3081:1: rule__FlangeAttachment__Group__2__Impl : ( ( rule__FlangeAttachment__NameAssignment_2 ) ) ;
    public final void rule__FlangeAttachment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3085:1: ( ( ( rule__FlangeAttachment__NameAssignment_2 ) ) )
            // InternalKinematicsParser.g:3086:1: ( ( rule__FlangeAttachment__NameAssignment_2 ) )
            {
            // InternalKinematicsParser.g:3086:1: ( ( rule__FlangeAttachment__NameAssignment_2 ) )
            // InternalKinematicsParser.g:3087:2: ( rule__FlangeAttachment__NameAssignment_2 )
            {
             before(grammarAccess.getFlangeAttachmentAccess().getNameAssignment_2()); 
            // InternalKinematicsParser.g:3088:2: ( rule__FlangeAttachment__NameAssignment_2 )
            // InternalKinematicsParser.g:3088:3: rule__FlangeAttachment__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FlangeAttachment__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFlangeAttachmentAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlangeAttachment__Group__2__Impl"


    // $ANTLR start "rule__FlangeAttachment__Group__3"
    // InternalKinematicsParser.g:3096:1: rule__FlangeAttachment__Group__3 : rule__FlangeAttachment__Group__3__Impl rule__FlangeAttachment__Group__4 ;
    public final void rule__FlangeAttachment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3100:1: ( rule__FlangeAttachment__Group__3__Impl rule__FlangeAttachment__Group__4 )
            // InternalKinematicsParser.g:3101:2: rule__FlangeAttachment__Group__3__Impl rule__FlangeAttachment__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__FlangeAttachment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FlangeAttachment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlangeAttachment__Group__3"


    // $ANTLR start "rule__FlangeAttachment__Group__3__Impl"
    // InternalKinematicsParser.g:3108:1: rule__FlangeAttachment__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__FlangeAttachment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3112:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:3113:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:3113:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:3114:2: RULE_BEGIN
            {
             before(grammarAccess.getFlangeAttachmentAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getFlangeAttachmentAccess().getBEGINTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlangeAttachment__Group__3__Impl"


    // $ANTLR start "rule__FlangeAttachment__Group__4"
    // InternalKinematicsParser.g:3123:1: rule__FlangeAttachment__Group__4 : rule__FlangeAttachment__Group__4__Impl rule__FlangeAttachment__Group__5 ;
    public final void rule__FlangeAttachment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3127:1: ( rule__FlangeAttachment__Group__4__Impl rule__FlangeAttachment__Group__5 )
            // InternalKinematicsParser.g:3128:2: rule__FlangeAttachment__Group__4__Impl rule__FlangeAttachment__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__FlangeAttachment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FlangeAttachment__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlangeAttachment__Group__4"


    // $ANTLR start "rule__FlangeAttachment__Group__4__Impl"
    // InternalKinematicsParser.g:3135:1: rule__FlangeAttachment__Group__4__Impl : ( Origin ) ;
    public final void rule__FlangeAttachment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3139:1: ( ( Origin ) )
            // InternalKinematicsParser.g:3140:1: ( Origin )
            {
            // InternalKinematicsParser.g:3140:1: ( Origin )
            // InternalKinematicsParser.g:3141:2: Origin
            {
             before(grammarAccess.getFlangeAttachmentAccess().getOriginKeyword_4()); 
            match(input,Origin,FOLLOW_2); 
             after(grammarAccess.getFlangeAttachmentAccess().getOriginKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlangeAttachment__Group__4__Impl"


    // $ANTLR start "rule__FlangeAttachment__Group__5"
    // InternalKinematicsParser.g:3150:1: rule__FlangeAttachment__Group__5 : rule__FlangeAttachment__Group__5__Impl rule__FlangeAttachment__Group__6 ;
    public final void rule__FlangeAttachment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3154:1: ( rule__FlangeAttachment__Group__5__Impl rule__FlangeAttachment__Group__6 )
            // InternalKinematicsParser.g:3155:2: rule__FlangeAttachment__Group__5__Impl rule__FlangeAttachment__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__FlangeAttachment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FlangeAttachment__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlangeAttachment__Group__5"


    // $ANTLR start "rule__FlangeAttachment__Group__5__Impl"
    // InternalKinematicsParser.g:3162:1: rule__FlangeAttachment__Group__5__Impl : ( ( rule__FlangeAttachment__OriginAssignment_5 ) ) ;
    public final void rule__FlangeAttachment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3166:1: ( ( ( rule__FlangeAttachment__OriginAssignment_5 ) ) )
            // InternalKinematicsParser.g:3167:1: ( ( rule__FlangeAttachment__OriginAssignment_5 ) )
            {
            // InternalKinematicsParser.g:3167:1: ( ( rule__FlangeAttachment__OriginAssignment_5 ) )
            // InternalKinematicsParser.g:3168:2: ( rule__FlangeAttachment__OriginAssignment_5 )
            {
             before(grammarAccess.getFlangeAttachmentAccess().getOriginAssignment_5()); 
            // InternalKinematicsParser.g:3169:2: ( rule__FlangeAttachment__OriginAssignment_5 )
            // InternalKinematicsParser.g:3169:3: rule__FlangeAttachment__OriginAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__FlangeAttachment__OriginAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFlangeAttachmentAccess().getOriginAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlangeAttachment__Group__5__Impl"


    // $ANTLR start "rule__FlangeAttachment__Group__6"
    // InternalKinematicsParser.g:3177:1: rule__FlangeAttachment__Group__6 : rule__FlangeAttachment__Group__6__Impl rule__FlangeAttachment__Group__7 ;
    public final void rule__FlangeAttachment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3181:1: ( rule__FlangeAttachment__Group__6__Impl rule__FlangeAttachment__Group__7 )
            // InternalKinematicsParser.g:3182:2: rule__FlangeAttachment__Group__6__Impl rule__FlangeAttachment__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__FlangeAttachment__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FlangeAttachment__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlangeAttachment__Group__6"


    // $ANTLR start "rule__FlangeAttachment__Group__6__Impl"
    // InternalKinematicsParser.g:3189:1: rule__FlangeAttachment__Group__6__Impl : ( Parent ) ;
    public final void rule__FlangeAttachment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3193:1: ( ( Parent ) )
            // InternalKinematicsParser.g:3194:1: ( Parent )
            {
            // InternalKinematicsParser.g:3194:1: ( Parent )
            // InternalKinematicsParser.g:3195:2: Parent
            {
             before(grammarAccess.getFlangeAttachmentAccess().getParentKeyword_6()); 
            match(input,Parent,FOLLOW_2); 
             after(grammarAccess.getFlangeAttachmentAccess().getParentKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlangeAttachment__Group__6__Impl"


    // $ANTLR start "rule__FlangeAttachment__Group__7"
    // InternalKinematicsParser.g:3204:1: rule__FlangeAttachment__Group__7 : rule__FlangeAttachment__Group__7__Impl rule__FlangeAttachment__Group__8 ;
    public final void rule__FlangeAttachment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3208:1: ( rule__FlangeAttachment__Group__7__Impl rule__FlangeAttachment__Group__8 )
            // InternalKinematicsParser.g:3209:2: rule__FlangeAttachment__Group__7__Impl rule__FlangeAttachment__Group__8
            {
            pushFollow(FOLLOW_30);
            rule__FlangeAttachment__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FlangeAttachment__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlangeAttachment__Group__7"


    // $ANTLR start "rule__FlangeAttachment__Group__7__Impl"
    // InternalKinematicsParser.g:3216:1: rule__FlangeAttachment__Group__7__Impl : ( ( rule__FlangeAttachment__ParentAssignment_7 ) ) ;
    public final void rule__FlangeAttachment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3220:1: ( ( ( rule__FlangeAttachment__ParentAssignment_7 ) ) )
            // InternalKinematicsParser.g:3221:1: ( ( rule__FlangeAttachment__ParentAssignment_7 ) )
            {
            // InternalKinematicsParser.g:3221:1: ( ( rule__FlangeAttachment__ParentAssignment_7 ) )
            // InternalKinematicsParser.g:3222:2: ( rule__FlangeAttachment__ParentAssignment_7 )
            {
             before(grammarAccess.getFlangeAttachmentAccess().getParentAssignment_7()); 
            // InternalKinematicsParser.g:3223:2: ( rule__FlangeAttachment__ParentAssignment_7 )
            // InternalKinematicsParser.g:3223:3: rule__FlangeAttachment__ParentAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__FlangeAttachment__ParentAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getFlangeAttachmentAccess().getParentAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlangeAttachment__Group__7__Impl"


    // $ANTLR start "rule__FlangeAttachment__Group__8"
    // InternalKinematicsParser.g:3231:1: rule__FlangeAttachment__Group__8 : rule__FlangeAttachment__Group__8__Impl ;
    public final void rule__FlangeAttachment__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3235:1: ( rule__FlangeAttachment__Group__8__Impl )
            // InternalKinematicsParser.g:3236:2: rule__FlangeAttachment__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FlangeAttachment__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlangeAttachment__Group__8"


    // $ANTLR start "rule__FlangeAttachment__Group__8__Impl"
    // InternalKinematicsParser.g:3242:1: rule__FlangeAttachment__Group__8__Impl : ( RULE_END ) ;
    public final void rule__FlangeAttachment__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3246:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:3247:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:3247:1: ( RULE_END )
            // InternalKinematicsParser.g:3248:2: RULE_END
            {
             before(grammarAccess.getFlangeAttachmentAccess().getENDTerminalRuleCall_8()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getFlangeAttachmentAccess().getENDTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlangeAttachment__Group__8__Impl"


    // $ANTLR start "rule__Connection__Group__0"
    // InternalKinematicsParser.g:3258:1: rule__Connection__Group__0 : rule__Connection__Group__0__Impl rule__Connection__Group__1 ;
    public final void rule__Connection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3262:1: ( rule__Connection__Group__0__Impl rule__Connection__Group__1 )
            // InternalKinematicsParser.g:3263:2: rule__Connection__Group__0__Impl rule__Connection__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Connection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__0"


    // $ANTLR start "rule__Connection__Group__0__Impl"
    // InternalKinematicsParser.g:3270:1: rule__Connection__Group__0__Impl : ( HyphenMinus ) ;
    public final void rule__Connection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3274:1: ( ( HyphenMinus ) )
            // InternalKinematicsParser.g:3275:1: ( HyphenMinus )
            {
            // InternalKinematicsParser.g:3275:1: ( HyphenMinus )
            // InternalKinematicsParser.g:3276:2: HyphenMinus
            {
             before(grammarAccess.getConnectionAccess().getHyphenMinusKeyword_0()); 
            match(input,HyphenMinus,FOLLOW_2); 
             after(grammarAccess.getConnectionAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__0__Impl"


    // $ANTLR start "rule__Connection__Group__1"
    // InternalKinematicsParser.g:3285:1: rule__Connection__Group__1 : rule__Connection__Group__1__Impl rule__Connection__Group__2 ;
    public final void rule__Connection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3289:1: ( rule__Connection__Group__1__Impl rule__Connection__Group__2 )
            // InternalKinematicsParser.g:3290:2: rule__Connection__Group__1__Impl rule__Connection__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Connection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__1"


    // $ANTLR start "rule__Connection__Group__1__Impl"
    // InternalKinematicsParser.g:3297:1: rule__Connection__Group__1__Impl : ( Name ) ;
    public final void rule__Connection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3301:1: ( ( Name ) )
            // InternalKinematicsParser.g:3302:1: ( Name )
            {
            // InternalKinematicsParser.g:3302:1: ( Name )
            // InternalKinematicsParser.g:3303:2: Name
            {
             before(grammarAccess.getConnectionAccess().getNameKeyword_1()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getConnectionAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__1__Impl"


    // $ANTLR start "rule__Connection__Group__2"
    // InternalKinematicsParser.g:3312:1: rule__Connection__Group__2 : rule__Connection__Group__2__Impl rule__Connection__Group__3 ;
    public final void rule__Connection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3316:1: ( rule__Connection__Group__2__Impl rule__Connection__Group__3 )
            // InternalKinematicsParser.g:3317:2: rule__Connection__Group__2__Impl rule__Connection__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Connection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__2"


    // $ANTLR start "rule__Connection__Group__2__Impl"
    // InternalKinematicsParser.g:3324:1: rule__Connection__Group__2__Impl : ( ( rule__Connection__NameAssignment_2 ) ) ;
    public final void rule__Connection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3328:1: ( ( ( rule__Connection__NameAssignment_2 ) ) )
            // InternalKinematicsParser.g:3329:1: ( ( rule__Connection__NameAssignment_2 ) )
            {
            // InternalKinematicsParser.g:3329:1: ( ( rule__Connection__NameAssignment_2 ) )
            // InternalKinematicsParser.g:3330:2: ( rule__Connection__NameAssignment_2 )
            {
             before(grammarAccess.getConnectionAccess().getNameAssignment_2()); 
            // InternalKinematicsParser.g:3331:2: ( rule__Connection__NameAssignment_2 )
            // InternalKinematicsParser.g:3331:3: rule__Connection__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Connection__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__2__Impl"


    // $ANTLR start "rule__Connection__Group__3"
    // InternalKinematicsParser.g:3339:1: rule__Connection__Group__3 : rule__Connection__Group__3__Impl rule__Connection__Group__4 ;
    public final void rule__Connection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3343:1: ( rule__Connection__Group__3__Impl rule__Connection__Group__4 )
            // InternalKinematicsParser.g:3344:2: rule__Connection__Group__3__Impl rule__Connection__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__Connection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__3"


    // $ANTLR start "rule__Connection__Group__3__Impl"
    // InternalKinematicsParser.g:3351:1: rule__Connection__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__Connection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3355:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:3356:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:3356:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:3357:2: RULE_BEGIN
            {
             before(grammarAccess.getConnectionAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getConnectionAccess().getBEGINTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__3__Impl"


    // $ANTLR start "rule__Connection__Group__4"
    // InternalKinematicsParser.g:3366:1: rule__Connection__Group__4 : rule__Connection__Group__4__Impl rule__Connection__Group__5 ;
    public final void rule__Connection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3370:1: ( rule__Connection__Group__4__Impl rule__Connection__Group__5 )
            // InternalKinematicsParser.g:3371:2: rule__Connection__Group__4__Impl rule__Connection__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Connection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__4"


    // $ANTLR start "rule__Connection__Group__4__Impl"
    // InternalKinematicsParser.g:3378:1: rule__Connection__Group__4__Impl : ( BaseAttachment ) ;
    public final void rule__Connection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3382:1: ( ( BaseAttachment ) )
            // InternalKinematicsParser.g:3383:1: ( BaseAttachment )
            {
            // InternalKinematicsParser.g:3383:1: ( BaseAttachment )
            // InternalKinematicsParser.g:3384:2: BaseAttachment
            {
             before(grammarAccess.getConnectionAccess().getBaseAttachmentKeyword_4()); 
            match(input,BaseAttachment,FOLLOW_2); 
             after(grammarAccess.getConnectionAccess().getBaseAttachmentKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__4__Impl"


    // $ANTLR start "rule__Connection__Group__5"
    // InternalKinematicsParser.g:3393:1: rule__Connection__Group__5 : rule__Connection__Group__5__Impl rule__Connection__Group__6 ;
    public final void rule__Connection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3397:1: ( rule__Connection__Group__5__Impl rule__Connection__Group__6 )
            // InternalKinematicsParser.g:3398:2: rule__Connection__Group__5__Impl rule__Connection__Group__6
            {
            pushFollow(FOLLOW_37);
            rule__Connection__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__5"


    // $ANTLR start "rule__Connection__Group__5__Impl"
    // InternalKinematicsParser.g:3405:1: rule__Connection__Group__5__Impl : ( ( rule__Connection__BaseAttachmentAssignment_5 ) ) ;
    public final void rule__Connection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3409:1: ( ( ( rule__Connection__BaseAttachmentAssignment_5 ) ) )
            // InternalKinematicsParser.g:3410:1: ( ( rule__Connection__BaseAttachmentAssignment_5 ) )
            {
            // InternalKinematicsParser.g:3410:1: ( ( rule__Connection__BaseAttachmentAssignment_5 ) )
            // InternalKinematicsParser.g:3411:2: ( rule__Connection__BaseAttachmentAssignment_5 )
            {
             before(grammarAccess.getConnectionAccess().getBaseAttachmentAssignment_5()); 
            // InternalKinematicsParser.g:3412:2: ( rule__Connection__BaseAttachmentAssignment_5 )
            // InternalKinematicsParser.g:3412:3: rule__Connection__BaseAttachmentAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Connection__BaseAttachmentAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getBaseAttachmentAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__5__Impl"


    // $ANTLR start "rule__Connection__Group__6"
    // InternalKinematicsParser.g:3420:1: rule__Connection__Group__6 : rule__Connection__Group__6__Impl rule__Connection__Group__7 ;
    public final void rule__Connection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3424:1: ( rule__Connection__Group__6__Impl rule__Connection__Group__7 )
            // InternalKinematicsParser.g:3425:2: rule__Connection__Group__6__Impl rule__Connection__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Connection__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__6"


    // $ANTLR start "rule__Connection__Group__6__Impl"
    // InternalKinematicsParser.g:3432:1: rule__Connection__Group__6__Impl : ( FlangeAttachment ) ;
    public final void rule__Connection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3436:1: ( ( FlangeAttachment ) )
            // InternalKinematicsParser.g:3437:1: ( FlangeAttachment )
            {
            // InternalKinematicsParser.g:3437:1: ( FlangeAttachment )
            // InternalKinematicsParser.g:3438:2: FlangeAttachment
            {
             before(grammarAccess.getConnectionAccess().getFlangeAttachmentKeyword_6()); 
            match(input,FlangeAttachment,FOLLOW_2); 
             after(grammarAccess.getConnectionAccess().getFlangeAttachmentKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__6__Impl"


    // $ANTLR start "rule__Connection__Group__7"
    // InternalKinematicsParser.g:3447:1: rule__Connection__Group__7 : rule__Connection__Group__7__Impl rule__Connection__Group__8 ;
    public final void rule__Connection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3451:1: ( rule__Connection__Group__7__Impl rule__Connection__Group__8 )
            // InternalKinematicsParser.g:3452:2: rule__Connection__Group__7__Impl rule__Connection__Group__8
            {
            pushFollow(FOLLOW_30);
            rule__Connection__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__7"


    // $ANTLR start "rule__Connection__Group__7__Impl"
    // InternalKinematicsParser.g:3459:1: rule__Connection__Group__7__Impl : ( ( rule__Connection__FlangeAttachmentAssignment_7 ) ) ;
    public final void rule__Connection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3463:1: ( ( ( rule__Connection__FlangeAttachmentAssignment_7 ) ) )
            // InternalKinematicsParser.g:3464:1: ( ( rule__Connection__FlangeAttachmentAssignment_7 ) )
            {
            // InternalKinematicsParser.g:3464:1: ( ( rule__Connection__FlangeAttachmentAssignment_7 ) )
            // InternalKinematicsParser.g:3465:2: ( rule__Connection__FlangeAttachmentAssignment_7 )
            {
             before(grammarAccess.getConnectionAccess().getFlangeAttachmentAssignment_7()); 
            // InternalKinematicsParser.g:3466:2: ( rule__Connection__FlangeAttachmentAssignment_7 )
            // InternalKinematicsParser.g:3466:3: rule__Connection__FlangeAttachmentAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Connection__FlangeAttachmentAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getFlangeAttachmentAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__7__Impl"


    // $ANTLR start "rule__Connection__Group__8"
    // InternalKinematicsParser.g:3474:1: rule__Connection__Group__8 : rule__Connection__Group__8__Impl ;
    public final void rule__Connection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3478:1: ( rule__Connection__Group__8__Impl )
            // InternalKinematicsParser.g:3479:2: rule__Connection__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connection__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__8"


    // $ANTLR start "rule__Connection__Group__8__Impl"
    // InternalKinematicsParser.g:3485:1: rule__Connection__Group__8__Impl : ( RULE_END ) ;
    public final void rule__Connection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3489:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:3490:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:3490:1: ( RULE_END )
            // InternalKinematicsParser.g:3491:2: RULE_END
            {
             before(grammarAccess.getConnectionAccess().getENDTerminalRuleCall_8()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getConnectionAccess().getENDTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__8__Impl"


    // $ANTLR start "rule__Joint__Group__0"
    // InternalKinematicsParser.g:3501:1: rule__Joint__Group__0 : rule__Joint__Group__0__Impl rule__Joint__Group__1 ;
    public final void rule__Joint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3505:1: ( rule__Joint__Group__0__Impl rule__Joint__Group__1 )
            // InternalKinematicsParser.g:3506:2: rule__Joint__Group__0__Impl rule__Joint__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Joint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__0"


    // $ANTLR start "rule__Joint__Group__0__Impl"
    // InternalKinematicsParser.g:3513:1: rule__Joint__Group__0__Impl : ( HyphenMinus ) ;
    public final void rule__Joint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3517:1: ( ( HyphenMinus ) )
            // InternalKinematicsParser.g:3518:1: ( HyphenMinus )
            {
            // InternalKinematicsParser.g:3518:1: ( HyphenMinus )
            // InternalKinematicsParser.g:3519:2: HyphenMinus
            {
             before(grammarAccess.getJointAccess().getHyphenMinusKeyword_0()); 
            match(input,HyphenMinus,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__0__Impl"


    // $ANTLR start "rule__Joint__Group__1"
    // InternalKinematicsParser.g:3528:1: rule__Joint__Group__1 : rule__Joint__Group__1__Impl rule__Joint__Group__2 ;
    public final void rule__Joint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3532:1: ( rule__Joint__Group__1__Impl rule__Joint__Group__2 )
            // InternalKinematicsParser.g:3533:2: rule__Joint__Group__1__Impl rule__Joint__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Joint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__1"


    // $ANTLR start "rule__Joint__Group__1__Impl"
    // InternalKinematicsParser.g:3540:1: rule__Joint__Group__1__Impl : ( Name ) ;
    public final void rule__Joint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3544:1: ( ( Name ) )
            // InternalKinematicsParser.g:3545:1: ( Name )
            {
            // InternalKinematicsParser.g:3545:1: ( Name )
            // InternalKinematicsParser.g:3546:2: Name
            {
             before(grammarAccess.getJointAccess().getNameKeyword_1()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__1__Impl"


    // $ANTLR start "rule__Joint__Group__2"
    // InternalKinematicsParser.g:3555:1: rule__Joint__Group__2 : rule__Joint__Group__2__Impl rule__Joint__Group__3 ;
    public final void rule__Joint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3559:1: ( rule__Joint__Group__2__Impl rule__Joint__Group__3 )
            // InternalKinematicsParser.g:3560:2: rule__Joint__Group__2__Impl rule__Joint__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Joint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__2"


    // $ANTLR start "rule__Joint__Group__2__Impl"
    // InternalKinematicsParser.g:3567:1: rule__Joint__Group__2__Impl : ( ( rule__Joint__NameAssignment_2 ) ) ;
    public final void rule__Joint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3571:1: ( ( ( rule__Joint__NameAssignment_2 ) ) )
            // InternalKinematicsParser.g:3572:1: ( ( rule__Joint__NameAssignment_2 ) )
            {
            // InternalKinematicsParser.g:3572:1: ( ( rule__Joint__NameAssignment_2 ) )
            // InternalKinematicsParser.g:3573:2: ( rule__Joint__NameAssignment_2 )
            {
             before(grammarAccess.getJointAccess().getNameAssignment_2()); 
            // InternalKinematicsParser.g:3574:2: ( rule__Joint__NameAssignment_2 )
            // InternalKinematicsParser.g:3574:3: rule__Joint__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Joint__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__2__Impl"


    // $ANTLR start "rule__Joint__Group__3"
    // InternalKinematicsParser.g:3582:1: rule__Joint__Group__3 : rule__Joint__Group__3__Impl rule__Joint__Group__4 ;
    public final void rule__Joint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3586:1: ( rule__Joint__Group__3__Impl rule__Joint__Group__4 )
            // InternalKinematicsParser.g:3587:2: rule__Joint__Group__3__Impl rule__Joint__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Joint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__3"


    // $ANTLR start "rule__Joint__Group__3__Impl"
    // InternalKinematicsParser.g:3594:1: rule__Joint__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__Joint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3598:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:3599:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:3599:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:3600:2: RULE_BEGIN
            {
             before(grammarAccess.getJointAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getBEGINTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__3__Impl"


    // $ANTLR start "rule__Joint__Group__4"
    // InternalKinematicsParser.g:3609:1: rule__Joint__Group__4 : rule__Joint__Group__4__Impl rule__Joint__Group__5 ;
    public final void rule__Joint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3613:1: ( rule__Joint__Group__4__Impl rule__Joint__Group__5 )
            // InternalKinematicsParser.g:3614:2: rule__Joint__Group__4__Impl rule__Joint__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__Joint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__4"


    // $ANTLR start "rule__Joint__Group__4__Impl"
    // InternalKinematicsParser.g:3621:1: rule__Joint__Group__4__Impl : ( ( rule__Joint__Group_4__0 ) ) ;
    public final void rule__Joint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3625:1: ( ( ( rule__Joint__Group_4__0 ) ) )
            // InternalKinematicsParser.g:3626:1: ( ( rule__Joint__Group_4__0 ) )
            {
            // InternalKinematicsParser.g:3626:1: ( ( rule__Joint__Group_4__0 ) )
            // InternalKinematicsParser.g:3627:2: ( rule__Joint__Group_4__0 )
            {
             before(grammarAccess.getJointAccess().getGroup_4()); 
            // InternalKinematicsParser.g:3628:2: ( rule__Joint__Group_4__0 )
            // InternalKinematicsParser.g:3628:3: rule__Joint__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__4__Impl"


    // $ANTLR start "rule__Joint__Group__5"
    // InternalKinematicsParser.g:3636:1: rule__Joint__Group__5 : rule__Joint__Group__5__Impl rule__Joint__Group__6 ;
    public final void rule__Joint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3640:1: ( rule__Joint__Group__5__Impl rule__Joint__Group__6 )
            // InternalKinematicsParser.g:3641:2: rule__Joint__Group__5__Impl rule__Joint__Group__6
            {
            pushFollow(FOLLOW_38);
            rule__Joint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__5"


    // $ANTLR start "rule__Joint__Group__5__Impl"
    // InternalKinematicsParser.g:3648:1: rule__Joint__Group__5__Impl : ( ( rule__Joint__Group_5__0 ) ) ;
    public final void rule__Joint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3652:1: ( ( ( rule__Joint__Group_5__0 ) ) )
            // InternalKinematicsParser.g:3653:1: ( ( rule__Joint__Group_5__0 ) )
            {
            // InternalKinematicsParser.g:3653:1: ( ( rule__Joint__Group_5__0 ) )
            // InternalKinematicsParser.g:3654:2: ( rule__Joint__Group_5__0 )
            {
             before(grammarAccess.getJointAccess().getGroup_5()); 
            // InternalKinematicsParser.g:3655:2: ( rule__Joint__Group_5__0 )
            // InternalKinematicsParser.g:3655:3: rule__Joint__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__5__Impl"


    // $ANTLR start "rule__Joint__Group__6"
    // InternalKinematicsParser.g:3663:1: rule__Joint__Group__6 : rule__Joint__Group__6__Impl rule__Joint__Group__7 ;
    public final void rule__Joint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3667:1: ( rule__Joint__Group__6__Impl rule__Joint__Group__7 )
            // InternalKinematicsParser.g:3668:2: rule__Joint__Group__6__Impl rule__Joint__Group__7
            {
            pushFollow(FOLLOW_34);
            rule__Joint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__6"


    // $ANTLR start "rule__Joint__Group__6__Impl"
    // InternalKinematicsParser.g:3675:1: rule__Joint__Group__6__Impl : ( ( rule__Joint__Group_6__0 ) ) ;
    public final void rule__Joint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3679:1: ( ( ( rule__Joint__Group_6__0 ) ) )
            // InternalKinematicsParser.g:3680:1: ( ( rule__Joint__Group_6__0 ) )
            {
            // InternalKinematicsParser.g:3680:1: ( ( rule__Joint__Group_6__0 ) )
            // InternalKinematicsParser.g:3681:2: ( rule__Joint__Group_6__0 )
            {
             before(grammarAccess.getJointAccess().getGroup_6()); 
            // InternalKinematicsParser.g:3682:2: ( rule__Joint__Group_6__0 )
            // InternalKinematicsParser.g:3682:3: rule__Joint__Group_6__0
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__6__Impl"


    // $ANTLR start "rule__Joint__Group__7"
    // InternalKinematicsParser.g:3690:1: rule__Joint__Group__7 : rule__Joint__Group__7__Impl rule__Joint__Group__8 ;
    public final void rule__Joint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3694:1: ( rule__Joint__Group__7__Impl rule__Joint__Group__8 )
            // InternalKinematicsParser.g:3695:2: rule__Joint__Group__7__Impl rule__Joint__Group__8
            {
            pushFollow(FOLLOW_39);
            rule__Joint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__7"


    // $ANTLR start "rule__Joint__Group__7__Impl"
    // InternalKinematicsParser.g:3702:1: rule__Joint__Group__7__Impl : ( ( rule__Joint__Group_7__0 ) ) ;
    public final void rule__Joint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3706:1: ( ( ( rule__Joint__Group_7__0 ) ) )
            // InternalKinematicsParser.g:3707:1: ( ( rule__Joint__Group_7__0 ) )
            {
            // InternalKinematicsParser.g:3707:1: ( ( rule__Joint__Group_7__0 ) )
            // InternalKinematicsParser.g:3708:2: ( rule__Joint__Group_7__0 )
            {
             before(grammarAccess.getJointAccess().getGroup_7()); 
            // InternalKinematicsParser.g:3709:2: ( rule__Joint__Group_7__0 )
            // InternalKinematicsParser.g:3709:3: rule__Joint__Group_7__0
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_7__0();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__7__Impl"


    // $ANTLR start "rule__Joint__Group__8"
    // InternalKinematicsParser.g:3717:1: rule__Joint__Group__8 : rule__Joint__Group__8__Impl rule__Joint__Group__9 ;
    public final void rule__Joint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3721:1: ( rule__Joint__Group__8__Impl rule__Joint__Group__9 )
            // InternalKinematicsParser.g:3722:2: rule__Joint__Group__8__Impl rule__Joint__Group__9
            {
            pushFollow(FOLLOW_39);
            rule__Joint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__8"


    // $ANTLR start "rule__Joint__Group__8__Impl"
    // InternalKinematicsParser.g:3729:1: rule__Joint__Group__8__Impl : ( ( rule__Joint__Group_8__0 )? ) ;
    public final void rule__Joint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3733:1: ( ( ( rule__Joint__Group_8__0 )? ) )
            // InternalKinematicsParser.g:3734:1: ( ( rule__Joint__Group_8__0 )? )
            {
            // InternalKinematicsParser.g:3734:1: ( ( rule__Joint__Group_8__0 )? )
            // InternalKinematicsParser.g:3735:2: ( rule__Joint__Group_8__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_8()); 
            // InternalKinematicsParser.g:3736:2: ( rule__Joint__Group_8__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Axis) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalKinematicsParser.g:3736:3: rule__Joint__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__8__Impl"


    // $ANTLR start "rule__Joint__Group__9"
    // InternalKinematicsParser.g:3744:1: rule__Joint__Group__9 : rule__Joint__Group__9__Impl rule__Joint__Group__10 ;
    public final void rule__Joint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3748:1: ( rule__Joint__Group__9__Impl rule__Joint__Group__10 )
            // InternalKinematicsParser.g:3749:2: rule__Joint__Group__9__Impl rule__Joint__Group__10
            {
            pushFollow(FOLLOW_39);
            rule__Joint__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__9"


    // $ANTLR start "rule__Joint__Group__9__Impl"
    // InternalKinematicsParser.g:3756:1: rule__Joint__Group__9__Impl : ( ( rule__Joint__Group_9__0 )? ) ;
    public final void rule__Joint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3760:1: ( ( ( rule__Joint__Group_9__0 )? ) )
            // InternalKinematicsParser.g:3761:1: ( ( rule__Joint__Group_9__0 )? )
            {
            // InternalKinematicsParser.g:3761:1: ( ( rule__Joint__Group_9__0 )? )
            // InternalKinematicsParser.g:3762:2: ( rule__Joint__Group_9__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_9()); 
            // InternalKinematicsParser.g:3763:2: ( rule__Joint__Group_9__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Limit) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalKinematicsParser.g:3763:3: rule__Joint__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__9__Impl"


    // $ANTLR start "rule__Joint__Group__10"
    // InternalKinematicsParser.g:3771:1: rule__Joint__Group__10 : rule__Joint__Group__10__Impl ;
    public final void rule__Joint__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3775:1: ( rule__Joint__Group__10__Impl )
            // InternalKinematicsParser.g:3776:2: rule__Joint__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__10"


    // $ANTLR start "rule__Joint__Group__10__Impl"
    // InternalKinematicsParser.g:3782:1: rule__Joint__Group__10__Impl : ( RULE_END ) ;
    public final void rule__Joint__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3786:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:3787:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:3787:1: ( RULE_END )
            // InternalKinematicsParser.g:3788:2: RULE_END
            {
             before(grammarAccess.getJointAccess().getENDTerminalRuleCall_10()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getENDTerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__10__Impl"


    // $ANTLR start "rule__Joint__Group_4__0"
    // InternalKinematicsParser.g:3798:1: rule__Joint__Group_4__0 : rule__Joint__Group_4__0__Impl rule__Joint__Group_4__1 ;
    public final void rule__Joint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3802:1: ( rule__Joint__Group_4__0__Impl rule__Joint__Group_4__1 )
            // InternalKinematicsParser.g:3803:2: rule__Joint__Group_4__0__Impl rule__Joint__Group_4__1
            {
            pushFollow(FOLLOW_40);
            rule__Joint__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_4__0"


    // $ANTLR start "rule__Joint__Group_4__0__Impl"
    // InternalKinematicsParser.g:3810:1: rule__Joint__Group_4__0__Impl : ( Type ) ;
    public final void rule__Joint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3814:1: ( ( Type ) )
            // InternalKinematicsParser.g:3815:1: ( Type )
            {
            // InternalKinematicsParser.g:3815:1: ( Type )
            // InternalKinematicsParser.g:3816:2: Type
            {
             before(grammarAccess.getJointAccess().getTypeKeyword_4_0()); 
            match(input,Type,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_4__0__Impl"


    // $ANTLR start "rule__Joint__Group_4__1"
    // InternalKinematicsParser.g:3825:1: rule__Joint__Group_4__1 : rule__Joint__Group_4__1__Impl ;
    public final void rule__Joint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3829:1: ( rule__Joint__Group_4__1__Impl )
            // InternalKinematicsParser.g:3830:2: rule__Joint__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_4__1"


    // $ANTLR start "rule__Joint__Group_4__1__Impl"
    // InternalKinematicsParser.g:3836:1: rule__Joint__Group_4__1__Impl : ( ( rule__Joint__TypeAssignment_4_1 ) ) ;
    public final void rule__Joint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3840:1: ( ( ( rule__Joint__TypeAssignment_4_1 ) ) )
            // InternalKinematicsParser.g:3841:1: ( ( rule__Joint__TypeAssignment_4_1 ) )
            {
            // InternalKinematicsParser.g:3841:1: ( ( rule__Joint__TypeAssignment_4_1 ) )
            // InternalKinematicsParser.g:3842:2: ( rule__Joint__TypeAssignment_4_1 )
            {
             before(grammarAccess.getJointAccess().getTypeAssignment_4_1()); 
            // InternalKinematicsParser.g:3843:2: ( rule__Joint__TypeAssignment_4_1 )
            // InternalKinematicsParser.g:3843:3: rule__Joint__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_4__1__Impl"


    // $ANTLR start "rule__Joint__Group_5__0"
    // InternalKinematicsParser.g:3852:1: rule__Joint__Group_5__0 : rule__Joint__Group_5__0__Impl rule__Joint__Group_5__1 ;
    public final void rule__Joint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3856:1: ( rule__Joint__Group_5__0__Impl rule__Joint__Group_5__1 )
            // InternalKinematicsParser.g:3857:2: rule__Joint__Group_5__0__Impl rule__Joint__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Joint__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_5__0"


    // $ANTLR start "rule__Joint__Group_5__0__Impl"
    // InternalKinematicsParser.g:3864:1: rule__Joint__Group_5__0__Impl : ( Parent ) ;
    public final void rule__Joint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3868:1: ( ( Parent ) )
            // InternalKinematicsParser.g:3869:1: ( Parent )
            {
            // InternalKinematicsParser.g:3869:1: ( Parent )
            // InternalKinematicsParser.g:3870:2: Parent
            {
             before(grammarAccess.getJointAccess().getParentKeyword_5_0()); 
            match(input,Parent,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getParentKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_5__0__Impl"


    // $ANTLR start "rule__Joint__Group_5__1"
    // InternalKinematicsParser.g:3879:1: rule__Joint__Group_5__1 : rule__Joint__Group_5__1__Impl ;
    public final void rule__Joint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3883:1: ( rule__Joint__Group_5__1__Impl )
            // InternalKinematicsParser.g:3884:2: rule__Joint__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_5__1"


    // $ANTLR start "rule__Joint__Group_5__1__Impl"
    // InternalKinematicsParser.g:3890:1: rule__Joint__Group_5__1__Impl : ( ( rule__Joint__ParentAssignment_5_1 ) ) ;
    public final void rule__Joint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3894:1: ( ( ( rule__Joint__ParentAssignment_5_1 ) ) )
            // InternalKinematicsParser.g:3895:1: ( ( rule__Joint__ParentAssignment_5_1 ) )
            {
            // InternalKinematicsParser.g:3895:1: ( ( rule__Joint__ParentAssignment_5_1 ) )
            // InternalKinematicsParser.g:3896:2: ( rule__Joint__ParentAssignment_5_1 )
            {
             before(grammarAccess.getJointAccess().getParentAssignment_5_1()); 
            // InternalKinematicsParser.g:3897:2: ( rule__Joint__ParentAssignment_5_1 )
            // InternalKinematicsParser.g:3897:3: rule__Joint__ParentAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ParentAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getParentAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_5__1__Impl"


    // $ANTLR start "rule__Joint__Group_6__0"
    // InternalKinematicsParser.g:3906:1: rule__Joint__Group_6__0 : rule__Joint__Group_6__0__Impl rule__Joint__Group_6__1 ;
    public final void rule__Joint__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3910:1: ( rule__Joint__Group_6__0__Impl rule__Joint__Group_6__1 )
            // InternalKinematicsParser.g:3911:2: rule__Joint__Group_6__0__Impl rule__Joint__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Joint__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_6__0"


    // $ANTLR start "rule__Joint__Group_6__0__Impl"
    // InternalKinematicsParser.g:3918:1: rule__Joint__Group_6__0__Impl : ( Child ) ;
    public final void rule__Joint__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3922:1: ( ( Child ) )
            // InternalKinematicsParser.g:3923:1: ( Child )
            {
            // InternalKinematicsParser.g:3923:1: ( Child )
            // InternalKinematicsParser.g:3924:2: Child
            {
             before(grammarAccess.getJointAccess().getChildKeyword_6_0()); 
            match(input,Child,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getChildKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_6__0__Impl"


    // $ANTLR start "rule__Joint__Group_6__1"
    // InternalKinematicsParser.g:3933:1: rule__Joint__Group_6__1 : rule__Joint__Group_6__1__Impl ;
    public final void rule__Joint__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3937:1: ( rule__Joint__Group_6__1__Impl )
            // InternalKinematicsParser.g:3938:2: rule__Joint__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_6__1"


    // $ANTLR start "rule__Joint__Group_6__1__Impl"
    // InternalKinematicsParser.g:3944:1: rule__Joint__Group_6__1__Impl : ( ( rule__Joint__ChildAssignment_6_1 ) ) ;
    public final void rule__Joint__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3948:1: ( ( ( rule__Joint__ChildAssignment_6_1 ) ) )
            // InternalKinematicsParser.g:3949:1: ( ( rule__Joint__ChildAssignment_6_1 ) )
            {
            // InternalKinematicsParser.g:3949:1: ( ( rule__Joint__ChildAssignment_6_1 ) )
            // InternalKinematicsParser.g:3950:2: ( rule__Joint__ChildAssignment_6_1 )
            {
             before(grammarAccess.getJointAccess().getChildAssignment_6_1()); 
            // InternalKinematicsParser.g:3951:2: ( rule__Joint__ChildAssignment_6_1 )
            // InternalKinematicsParser.g:3951:3: rule__Joint__ChildAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ChildAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getChildAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_6__1__Impl"


    // $ANTLR start "rule__Joint__Group_7__0"
    // InternalKinematicsParser.g:3960:1: rule__Joint__Group_7__0 : rule__Joint__Group_7__0__Impl rule__Joint__Group_7__1 ;
    public final void rule__Joint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3964:1: ( rule__Joint__Group_7__0__Impl rule__Joint__Group_7__1 )
            // InternalKinematicsParser.g:3965:2: rule__Joint__Group_7__0__Impl rule__Joint__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__Joint__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_7__0"


    // $ANTLR start "rule__Joint__Group_7__0__Impl"
    // InternalKinematicsParser.g:3972:1: rule__Joint__Group_7__0__Impl : ( Origin ) ;
    public final void rule__Joint__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3976:1: ( ( Origin ) )
            // InternalKinematicsParser.g:3977:1: ( Origin )
            {
            // InternalKinematicsParser.g:3977:1: ( Origin )
            // InternalKinematicsParser.g:3978:2: Origin
            {
             before(grammarAccess.getJointAccess().getOriginKeyword_7_0()); 
            match(input,Origin,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getOriginKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_7__0__Impl"


    // $ANTLR start "rule__Joint__Group_7__1"
    // InternalKinematicsParser.g:3987:1: rule__Joint__Group_7__1 : rule__Joint__Group_7__1__Impl ;
    public final void rule__Joint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3991:1: ( rule__Joint__Group_7__1__Impl )
            // InternalKinematicsParser.g:3992:2: rule__Joint__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_7__1"


    // $ANTLR start "rule__Joint__Group_7__1__Impl"
    // InternalKinematicsParser.g:3998:1: rule__Joint__Group_7__1__Impl : ( ( rule__Joint__OriginAssignment_7_1 ) ) ;
    public final void rule__Joint__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4002:1: ( ( ( rule__Joint__OriginAssignment_7_1 ) ) )
            // InternalKinematicsParser.g:4003:1: ( ( rule__Joint__OriginAssignment_7_1 ) )
            {
            // InternalKinematicsParser.g:4003:1: ( ( rule__Joint__OriginAssignment_7_1 ) )
            // InternalKinematicsParser.g:4004:2: ( rule__Joint__OriginAssignment_7_1 )
            {
             before(grammarAccess.getJointAccess().getOriginAssignment_7_1()); 
            // InternalKinematicsParser.g:4005:2: ( rule__Joint__OriginAssignment_7_1 )
            // InternalKinematicsParser.g:4005:3: rule__Joint__OriginAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__OriginAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getOriginAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_7__1__Impl"


    // $ANTLR start "rule__Joint__Group_8__0"
    // InternalKinematicsParser.g:4014:1: rule__Joint__Group_8__0 : rule__Joint__Group_8__0__Impl rule__Joint__Group_8__1 ;
    public final void rule__Joint__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4018:1: ( rule__Joint__Group_8__0__Impl rule__Joint__Group_8__1 )
            // InternalKinematicsParser.g:4019:2: rule__Joint__Group_8__0__Impl rule__Joint__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__Joint__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_8__0"


    // $ANTLR start "rule__Joint__Group_8__0__Impl"
    // InternalKinematicsParser.g:4026:1: rule__Joint__Group_8__0__Impl : ( Axis ) ;
    public final void rule__Joint__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4030:1: ( ( Axis ) )
            // InternalKinematicsParser.g:4031:1: ( Axis )
            {
            // InternalKinematicsParser.g:4031:1: ( Axis )
            // InternalKinematicsParser.g:4032:2: Axis
            {
             before(grammarAccess.getJointAccess().getAxisKeyword_8_0()); 
            match(input,Axis,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getAxisKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_8__0__Impl"


    // $ANTLR start "rule__Joint__Group_8__1"
    // InternalKinematicsParser.g:4041:1: rule__Joint__Group_8__1 : rule__Joint__Group_8__1__Impl ;
    public final void rule__Joint__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4045:1: ( rule__Joint__Group_8__1__Impl )
            // InternalKinematicsParser.g:4046:2: rule__Joint__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_8__1"


    // $ANTLR start "rule__Joint__Group_8__1__Impl"
    // InternalKinematicsParser.g:4052:1: rule__Joint__Group_8__1__Impl : ( ( rule__Joint__AxisAssignment_8_1 ) ) ;
    public final void rule__Joint__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4056:1: ( ( ( rule__Joint__AxisAssignment_8_1 ) ) )
            // InternalKinematicsParser.g:4057:1: ( ( rule__Joint__AxisAssignment_8_1 ) )
            {
            // InternalKinematicsParser.g:4057:1: ( ( rule__Joint__AxisAssignment_8_1 ) )
            // InternalKinematicsParser.g:4058:2: ( rule__Joint__AxisAssignment_8_1 )
            {
             before(grammarAccess.getJointAccess().getAxisAssignment_8_1()); 
            // InternalKinematicsParser.g:4059:2: ( rule__Joint__AxisAssignment_8_1 )
            // InternalKinematicsParser.g:4059:3: rule__Joint__AxisAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__AxisAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getAxisAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_8__1__Impl"


    // $ANTLR start "rule__Joint__Group_9__0"
    // InternalKinematicsParser.g:4068:1: rule__Joint__Group_9__0 : rule__Joint__Group_9__0__Impl rule__Joint__Group_9__1 ;
    public final void rule__Joint__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4072:1: ( rule__Joint__Group_9__0__Impl rule__Joint__Group_9__1 )
            // InternalKinematicsParser.g:4073:2: rule__Joint__Group_9__0__Impl rule__Joint__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__Joint__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_9__0"


    // $ANTLR start "rule__Joint__Group_9__0__Impl"
    // InternalKinematicsParser.g:4080:1: rule__Joint__Group_9__0__Impl : ( Limit ) ;
    public final void rule__Joint__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4084:1: ( ( Limit ) )
            // InternalKinematicsParser.g:4085:1: ( Limit )
            {
            // InternalKinematicsParser.g:4085:1: ( Limit )
            // InternalKinematicsParser.g:4086:2: Limit
            {
             before(grammarAccess.getJointAccess().getLimitKeyword_9_0()); 
            match(input,Limit,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getLimitKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_9__0__Impl"


    // $ANTLR start "rule__Joint__Group_9__1"
    // InternalKinematicsParser.g:4095:1: rule__Joint__Group_9__1 : rule__Joint__Group_9__1__Impl ;
    public final void rule__Joint__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4099:1: ( rule__Joint__Group_9__1__Impl )
            // InternalKinematicsParser.g:4100:2: rule__Joint__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_9__1"


    // $ANTLR start "rule__Joint__Group_9__1__Impl"
    // InternalKinematicsParser.g:4106:1: rule__Joint__Group_9__1__Impl : ( ( rule__Joint__LimitAssignment_9_1 ) ) ;
    public final void rule__Joint__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4110:1: ( ( ( rule__Joint__LimitAssignment_9_1 ) ) )
            // InternalKinematicsParser.g:4111:1: ( ( rule__Joint__LimitAssignment_9_1 ) )
            {
            // InternalKinematicsParser.g:4111:1: ( ( rule__Joint__LimitAssignment_9_1 ) )
            // InternalKinematicsParser.g:4112:2: ( rule__Joint__LimitAssignment_9_1 )
            {
             before(grammarAccess.getJointAccess().getLimitAssignment_9_1()); 
            // InternalKinematicsParser.g:4113:2: ( rule__Joint__LimitAssignment_9_1 )
            // InternalKinematicsParser.g:4113:3: rule__Joint__LimitAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__LimitAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getLimitAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_9__1__Impl"


    // $ANTLR start "rule__Parent__Group__0"
    // InternalKinematicsParser.g:4122:1: rule__Parent__Group__0 : rule__Parent__Group__0__Impl rule__Parent__Group__1 ;
    public final void rule__Parent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4126:1: ( rule__Parent__Group__0__Impl rule__Parent__Group__1 )
            // InternalKinematicsParser.g:4127:2: rule__Parent__Group__0__Impl rule__Parent__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__Parent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parent__Group__0"


    // $ANTLR start "rule__Parent__Group__0__Impl"
    // InternalKinematicsParser.g:4134:1: rule__Parent__Group__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Parent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4138:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:4139:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:4139:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:4140:2: RULE_BEGIN
            {
             before(grammarAccess.getParentAccess().getBEGINTerminalRuleCall_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getParentAccess().getBEGINTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parent__Group__0__Impl"


    // $ANTLR start "rule__Parent__Group__1"
    // InternalKinematicsParser.g:4149:1: rule__Parent__Group__1 : rule__Parent__Group__1__Impl rule__Parent__Group__2 ;
    public final void rule__Parent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4153:1: ( rule__Parent__Group__1__Impl rule__Parent__Group__2 )
            // InternalKinematicsParser.g:4154:2: rule__Parent__Group__1__Impl rule__Parent__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Parent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parent__Group__1"


    // $ANTLR start "rule__Parent__Group__1__Impl"
    // InternalKinematicsParser.g:4161:1: rule__Parent__Group__1__Impl : ( Link ) ;
    public final void rule__Parent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4165:1: ( ( Link ) )
            // InternalKinematicsParser.g:4166:1: ( Link )
            {
            // InternalKinematicsParser.g:4166:1: ( Link )
            // InternalKinematicsParser.g:4167:2: Link
            {
             before(grammarAccess.getParentAccess().getLinkKeyword_1()); 
            match(input,Link,FOLLOW_2); 
             after(grammarAccess.getParentAccess().getLinkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parent__Group__1__Impl"


    // $ANTLR start "rule__Parent__Group__2"
    // InternalKinematicsParser.g:4176:1: rule__Parent__Group__2 : rule__Parent__Group__2__Impl rule__Parent__Group__3 ;
    public final void rule__Parent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4180:1: ( rule__Parent__Group__2__Impl rule__Parent__Group__3 )
            // InternalKinematicsParser.g:4181:2: rule__Parent__Group__2__Impl rule__Parent__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Parent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parent__Group__2"


    // $ANTLR start "rule__Parent__Group__2__Impl"
    // InternalKinematicsParser.g:4188:1: rule__Parent__Group__2__Impl : ( ( rule__Parent__LinkAssignment_2 ) ) ;
    public final void rule__Parent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4192:1: ( ( ( rule__Parent__LinkAssignment_2 ) ) )
            // InternalKinematicsParser.g:4193:1: ( ( rule__Parent__LinkAssignment_2 ) )
            {
            // InternalKinematicsParser.g:4193:1: ( ( rule__Parent__LinkAssignment_2 ) )
            // InternalKinematicsParser.g:4194:2: ( rule__Parent__LinkAssignment_2 )
            {
             before(grammarAccess.getParentAccess().getLinkAssignment_2()); 
            // InternalKinematicsParser.g:4195:2: ( rule__Parent__LinkAssignment_2 )
            // InternalKinematicsParser.g:4195:3: rule__Parent__LinkAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parent__LinkAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParentAccess().getLinkAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parent__Group__2__Impl"


    // $ANTLR start "rule__Parent__Group__3"
    // InternalKinematicsParser.g:4203:1: rule__Parent__Group__3 : rule__Parent__Group__3__Impl ;
    public final void rule__Parent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4207:1: ( rule__Parent__Group__3__Impl )
            // InternalKinematicsParser.g:4208:2: rule__Parent__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parent__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parent__Group__3"


    // $ANTLR start "rule__Parent__Group__3__Impl"
    // InternalKinematicsParser.g:4214:1: rule__Parent__Group__3__Impl : ( RULE_END ) ;
    public final void rule__Parent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4218:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:4219:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:4219:1: ( RULE_END )
            // InternalKinematicsParser.g:4220:2: RULE_END
            {
             before(grammarAccess.getParentAccess().getENDTerminalRuleCall_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getParentAccess().getENDTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parent__Group__3__Impl"


    // $ANTLR start "rule__Child__Group__0"
    // InternalKinematicsParser.g:4230:1: rule__Child__Group__0 : rule__Child__Group__0__Impl rule__Child__Group__1 ;
    public final void rule__Child__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4234:1: ( rule__Child__Group__0__Impl rule__Child__Group__1 )
            // InternalKinematicsParser.g:4235:2: rule__Child__Group__0__Impl rule__Child__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__Child__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Child__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Child__Group__0"


    // $ANTLR start "rule__Child__Group__0__Impl"
    // InternalKinematicsParser.g:4242:1: rule__Child__Group__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Child__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4246:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:4247:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:4247:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:4248:2: RULE_BEGIN
            {
             before(grammarAccess.getChildAccess().getBEGINTerminalRuleCall_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getChildAccess().getBEGINTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Child__Group__0__Impl"


    // $ANTLR start "rule__Child__Group__1"
    // InternalKinematicsParser.g:4257:1: rule__Child__Group__1 : rule__Child__Group__1__Impl rule__Child__Group__2 ;
    public final void rule__Child__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4261:1: ( rule__Child__Group__1__Impl rule__Child__Group__2 )
            // InternalKinematicsParser.g:4262:2: rule__Child__Group__1__Impl rule__Child__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Child__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Child__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Child__Group__1"


    // $ANTLR start "rule__Child__Group__1__Impl"
    // InternalKinematicsParser.g:4269:1: rule__Child__Group__1__Impl : ( Link ) ;
    public final void rule__Child__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4273:1: ( ( Link ) )
            // InternalKinematicsParser.g:4274:1: ( Link )
            {
            // InternalKinematicsParser.g:4274:1: ( Link )
            // InternalKinematicsParser.g:4275:2: Link
            {
             before(grammarAccess.getChildAccess().getLinkKeyword_1()); 
            match(input,Link,FOLLOW_2); 
             after(grammarAccess.getChildAccess().getLinkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Child__Group__1__Impl"


    // $ANTLR start "rule__Child__Group__2"
    // InternalKinematicsParser.g:4284:1: rule__Child__Group__2 : rule__Child__Group__2__Impl rule__Child__Group__3 ;
    public final void rule__Child__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4288:1: ( rule__Child__Group__2__Impl rule__Child__Group__3 )
            // InternalKinematicsParser.g:4289:2: rule__Child__Group__2__Impl rule__Child__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Child__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Child__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Child__Group__2"


    // $ANTLR start "rule__Child__Group__2__Impl"
    // InternalKinematicsParser.g:4296:1: rule__Child__Group__2__Impl : ( ( rule__Child__LinkAssignment_2 ) ) ;
    public final void rule__Child__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4300:1: ( ( ( rule__Child__LinkAssignment_2 ) ) )
            // InternalKinematicsParser.g:4301:1: ( ( rule__Child__LinkAssignment_2 ) )
            {
            // InternalKinematicsParser.g:4301:1: ( ( rule__Child__LinkAssignment_2 ) )
            // InternalKinematicsParser.g:4302:2: ( rule__Child__LinkAssignment_2 )
            {
             before(grammarAccess.getChildAccess().getLinkAssignment_2()); 
            // InternalKinematicsParser.g:4303:2: ( rule__Child__LinkAssignment_2 )
            // InternalKinematicsParser.g:4303:3: rule__Child__LinkAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Child__LinkAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChildAccess().getLinkAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Child__Group__2__Impl"


    // $ANTLR start "rule__Child__Group__3"
    // InternalKinematicsParser.g:4311:1: rule__Child__Group__3 : rule__Child__Group__3__Impl ;
    public final void rule__Child__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4315:1: ( rule__Child__Group__3__Impl )
            // InternalKinematicsParser.g:4316:2: rule__Child__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Child__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Child__Group__3"


    // $ANTLR start "rule__Child__Group__3__Impl"
    // InternalKinematicsParser.g:4322:1: rule__Child__Group__3__Impl : ( RULE_END ) ;
    public final void rule__Child__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4326:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:4327:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:4327:1: ( RULE_END )
            // InternalKinematicsParser.g:4328:2: RULE_END
            {
             before(grammarAccess.getChildAccess().getENDTerminalRuleCall_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getChildAccess().getENDTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Child__Group__3__Impl"


    // $ANTLR start "rule__Link__Group__0"
    // InternalKinematicsParser.g:4338:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4342:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalKinematicsParser.g:4343:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Link__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0"


    // $ANTLR start "rule__Link__Group__0__Impl"
    // InternalKinematicsParser.g:4350:1: rule__Link__Group__0__Impl : ( HyphenMinus ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4354:1: ( ( HyphenMinus ) )
            // InternalKinematicsParser.g:4355:1: ( HyphenMinus )
            {
            // InternalKinematicsParser.g:4355:1: ( HyphenMinus )
            // InternalKinematicsParser.g:4356:2: HyphenMinus
            {
             before(grammarAccess.getLinkAccess().getHyphenMinusKeyword_0()); 
            match(input,HyphenMinus,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0__Impl"


    // $ANTLR start "rule__Link__Group__1"
    // InternalKinematicsParser.g:4365:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4369:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalKinematicsParser.g:4370:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Link__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1"


    // $ANTLR start "rule__Link__Group__1__Impl"
    // InternalKinematicsParser.g:4377:1: rule__Link__Group__1__Impl : ( Name ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4381:1: ( ( Name ) )
            // InternalKinematicsParser.g:4382:1: ( Name )
            {
            // InternalKinematicsParser.g:4382:1: ( Name )
            // InternalKinematicsParser.g:4383:2: Name
            {
             before(grammarAccess.getLinkAccess().getNameKeyword_1()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1__Impl"


    // $ANTLR start "rule__Link__Group__2"
    // InternalKinematicsParser.g:4392:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4396:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalKinematicsParser.g:4397:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Link__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2"


    // $ANTLR start "rule__Link__Group__2__Impl"
    // InternalKinematicsParser.g:4404:1: rule__Link__Group__2__Impl : ( ( rule__Link__NameAssignment_2 ) ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4408:1: ( ( ( rule__Link__NameAssignment_2 ) ) )
            // InternalKinematicsParser.g:4409:1: ( ( rule__Link__NameAssignment_2 ) )
            {
            // InternalKinematicsParser.g:4409:1: ( ( rule__Link__NameAssignment_2 ) )
            // InternalKinematicsParser.g:4410:2: ( rule__Link__NameAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_2()); 
            // InternalKinematicsParser.g:4411:2: ( rule__Link__NameAssignment_2 )
            // InternalKinematicsParser.g:4411:3: rule__Link__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Link__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2__Impl"


    // $ANTLR start "rule__Link__Group__3"
    // InternalKinematicsParser.g:4419:1: rule__Link__Group__3 : rule__Link__Group__3__Impl ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4423:1: ( rule__Link__Group__3__Impl )
            // InternalKinematicsParser.g:4424:2: rule__Link__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3"


    // $ANTLR start "rule__Link__Group__3__Impl"
    // InternalKinematicsParser.g:4430:1: rule__Link__Group__3__Impl : ( ( rule__Link__Group_3__0 )? ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4434:1: ( ( ( rule__Link__Group_3__0 )? ) )
            // InternalKinematicsParser.g:4435:1: ( ( rule__Link__Group_3__0 )? )
            {
            // InternalKinematicsParser.g:4435:1: ( ( rule__Link__Group_3__0 )? )
            // InternalKinematicsParser.g:4436:2: ( rule__Link__Group_3__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_3()); 
            // InternalKinematicsParser.g:4437:2: ( rule__Link__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_BEGIN) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKinematicsParser.g:4437:3: rule__Link__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3__Impl"


    // $ANTLR start "rule__Link__Group_3__0"
    // InternalKinematicsParser.g:4446:1: rule__Link__Group_3__0 : rule__Link__Group_3__0__Impl rule__Link__Group_3__1 ;
    public final void rule__Link__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4450:1: ( rule__Link__Group_3__0__Impl rule__Link__Group_3__1 )
            // InternalKinematicsParser.g:4451:2: rule__Link__Group_3__0__Impl rule__Link__Group_3__1
            {
            pushFollow(FOLLOW_42);
            rule__Link__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3__0"


    // $ANTLR start "rule__Link__Group_3__0__Impl"
    // InternalKinematicsParser.g:4458:1: rule__Link__Group_3__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Link__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4462:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:4463:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:4463:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:4464:2: RULE_BEGIN
            {
             before(grammarAccess.getLinkAccess().getBEGINTerminalRuleCall_3_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getBEGINTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3__0__Impl"


    // $ANTLR start "rule__Link__Group_3__1"
    // InternalKinematicsParser.g:4473:1: rule__Link__Group_3__1 : rule__Link__Group_3__1__Impl rule__Link__Group_3__2 ;
    public final void rule__Link__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4477:1: ( rule__Link__Group_3__1__Impl rule__Link__Group_3__2 )
            // InternalKinematicsParser.g:4478:2: rule__Link__Group_3__1__Impl rule__Link__Group_3__2
            {
            pushFollow(FOLLOW_42);
            rule__Link__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3__1"


    // $ANTLR start "rule__Link__Group_3__1__Impl"
    // InternalKinematicsParser.g:4485:1: rule__Link__Group_3__1__Impl : ( ( rule__Link__Group_3_1__0 )? ) ;
    public final void rule__Link__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4489:1: ( ( ( rule__Link__Group_3_1__0 )? ) )
            // InternalKinematicsParser.g:4490:1: ( ( rule__Link__Group_3_1__0 )? )
            {
            // InternalKinematicsParser.g:4490:1: ( ( rule__Link__Group_3_1__0 )? )
            // InternalKinematicsParser.g:4491:2: ( rule__Link__Group_3_1__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_3_1()); 
            // InternalKinematicsParser.g:4492:2: ( rule__Link__Group_3_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Inertial) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalKinematicsParser.g:4492:3: rule__Link__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3__1__Impl"


    // $ANTLR start "rule__Link__Group_3__2"
    // InternalKinematicsParser.g:4500:1: rule__Link__Group_3__2 : rule__Link__Group_3__2__Impl rule__Link__Group_3__3 ;
    public final void rule__Link__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4504:1: ( rule__Link__Group_3__2__Impl rule__Link__Group_3__3 )
            // InternalKinematicsParser.g:4505:2: rule__Link__Group_3__2__Impl rule__Link__Group_3__3
            {
            pushFollow(FOLLOW_42);
            rule__Link__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3__2"


    // $ANTLR start "rule__Link__Group_3__2__Impl"
    // InternalKinematicsParser.g:4512:1: rule__Link__Group_3__2__Impl : ( ( rule__Link__Group_3_2__0 )? ) ;
    public final void rule__Link__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4516:1: ( ( ( rule__Link__Group_3_2__0 )? ) )
            // InternalKinematicsParser.g:4517:1: ( ( rule__Link__Group_3_2__0 )? )
            {
            // InternalKinematicsParser.g:4517:1: ( ( rule__Link__Group_3_2__0 )? )
            // InternalKinematicsParser.g:4518:2: ( rule__Link__Group_3_2__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_3_2()); 
            // InternalKinematicsParser.g:4519:2: ( rule__Link__Group_3_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Visual) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalKinematicsParser.g:4519:3: rule__Link__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_3_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3__2__Impl"


    // $ANTLR start "rule__Link__Group_3__3"
    // InternalKinematicsParser.g:4527:1: rule__Link__Group_3__3 : rule__Link__Group_3__3__Impl rule__Link__Group_3__4 ;
    public final void rule__Link__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4531:1: ( rule__Link__Group_3__3__Impl rule__Link__Group_3__4 )
            // InternalKinematicsParser.g:4532:2: rule__Link__Group_3__3__Impl rule__Link__Group_3__4
            {
            pushFollow(FOLLOW_42);
            rule__Link__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3__3"


    // $ANTLR start "rule__Link__Group_3__3__Impl"
    // InternalKinematicsParser.g:4539:1: rule__Link__Group_3__3__Impl : ( ( rule__Link__Group_3_3__0 )? ) ;
    public final void rule__Link__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4543:1: ( ( ( rule__Link__Group_3_3__0 )? ) )
            // InternalKinematicsParser.g:4544:1: ( ( rule__Link__Group_3_3__0 )? )
            {
            // InternalKinematicsParser.g:4544:1: ( ( rule__Link__Group_3_3__0 )? )
            // InternalKinematicsParser.g:4545:2: ( rule__Link__Group_3_3__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_3_3()); 
            // InternalKinematicsParser.g:4546:2: ( rule__Link__Group_3_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Collision) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalKinematicsParser.g:4546:3: rule__Link__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_3_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3__3__Impl"


    // $ANTLR start "rule__Link__Group_3__4"
    // InternalKinematicsParser.g:4554:1: rule__Link__Group_3__4 : rule__Link__Group_3__4__Impl ;
    public final void rule__Link__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4558:1: ( rule__Link__Group_3__4__Impl )
            // InternalKinematicsParser.g:4559:2: rule__Link__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3__4"


    // $ANTLR start "rule__Link__Group_3__4__Impl"
    // InternalKinematicsParser.g:4565:1: rule__Link__Group_3__4__Impl : ( RULE_END ) ;
    public final void rule__Link__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4569:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:4570:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:4570:1: ( RULE_END )
            // InternalKinematicsParser.g:4571:2: RULE_END
            {
             before(grammarAccess.getLinkAccess().getENDTerminalRuleCall_3_4()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getENDTerminalRuleCall_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3__4__Impl"


    // $ANTLR start "rule__Link__Group_3_1__0"
    // InternalKinematicsParser.g:4581:1: rule__Link__Group_3_1__0 : rule__Link__Group_3_1__0__Impl rule__Link__Group_3_1__1 ;
    public final void rule__Link__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4585:1: ( rule__Link__Group_3_1__0__Impl rule__Link__Group_3_1__1 )
            // InternalKinematicsParser.g:4586:2: rule__Link__Group_3_1__0__Impl rule__Link__Group_3_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Link__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3_1__0"


    // $ANTLR start "rule__Link__Group_3_1__0__Impl"
    // InternalKinematicsParser.g:4593:1: rule__Link__Group_3_1__0__Impl : ( Inertial ) ;
    public final void rule__Link__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4597:1: ( ( Inertial ) )
            // InternalKinematicsParser.g:4598:1: ( Inertial )
            {
            // InternalKinematicsParser.g:4598:1: ( Inertial )
            // InternalKinematicsParser.g:4599:2: Inertial
            {
             before(grammarAccess.getLinkAccess().getInertialKeyword_3_1_0()); 
            match(input,Inertial,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getInertialKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3_1__0__Impl"


    // $ANTLR start "rule__Link__Group_3_1__1"
    // InternalKinematicsParser.g:4608:1: rule__Link__Group_3_1__1 : rule__Link__Group_3_1__1__Impl ;
    public final void rule__Link__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4612:1: ( rule__Link__Group_3_1__1__Impl )
            // InternalKinematicsParser.g:4613:2: rule__Link__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3_1__1"


    // $ANTLR start "rule__Link__Group_3_1__1__Impl"
    // InternalKinematicsParser.g:4619:1: rule__Link__Group_3_1__1__Impl : ( ( rule__Link__InertialAssignment_3_1_1 ) ) ;
    public final void rule__Link__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4623:1: ( ( ( rule__Link__InertialAssignment_3_1_1 ) ) )
            // InternalKinematicsParser.g:4624:1: ( ( rule__Link__InertialAssignment_3_1_1 ) )
            {
            // InternalKinematicsParser.g:4624:1: ( ( rule__Link__InertialAssignment_3_1_1 ) )
            // InternalKinematicsParser.g:4625:2: ( rule__Link__InertialAssignment_3_1_1 )
            {
             before(grammarAccess.getLinkAccess().getInertialAssignment_3_1_1()); 
            // InternalKinematicsParser.g:4626:2: ( rule__Link__InertialAssignment_3_1_1 )
            // InternalKinematicsParser.g:4626:3: rule__Link__InertialAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__InertialAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getInertialAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3_1__1__Impl"


    // $ANTLR start "rule__Link__Group_3_2__0"
    // InternalKinematicsParser.g:4635:1: rule__Link__Group_3_2__0 : rule__Link__Group_3_2__0__Impl rule__Link__Group_3_2__1 ;
    public final void rule__Link__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4639:1: ( rule__Link__Group_3_2__0__Impl rule__Link__Group_3_2__1 )
            // InternalKinematicsParser.g:4640:2: rule__Link__Group_3_2__0__Impl rule__Link__Group_3_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Link__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3_2__0"


    // $ANTLR start "rule__Link__Group_3_2__0__Impl"
    // InternalKinematicsParser.g:4647:1: rule__Link__Group_3_2__0__Impl : ( Visual ) ;
    public final void rule__Link__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4651:1: ( ( Visual ) )
            // InternalKinematicsParser.g:4652:1: ( Visual )
            {
            // InternalKinematicsParser.g:4652:1: ( Visual )
            // InternalKinematicsParser.g:4653:2: Visual
            {
             before(grammarAccess.getLinkAccess().getVisualKeyword_3_2_0()); 
            match(input,Visual,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getVisualKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3_2__0__Impl"


    // $ANTLR start "rule__Link__Group_3_2__1"
    // InternalKinematicsParser.g:4662:1: rule__Link__Group_3_2__1 : rule__Link__Group_3_2__1__Impl ;
    public final void rule__Link__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4666:1: ( rule__Link__Group_3_2__1__Impl )
            // InternalKinematicsParser.g:4667:2: rule__Link__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3_2__1"


    // $ANTLR start "rule__Link__Group_3_2__1__Impl"
    // InternalKinematicsParser.g:4673:1: rule__Link__Group_3_2__1__Impl : ( ( rule__Link__VisualAssignment_3_2_1 ) ) ;
    public final void rule__Link__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4677:1: ( ( ( rule__Link__VisualAssignment_3_2_1 ) ) )
            // InternalKinematicsParser.g:4678:1: ( ( rule__Link__VisualAssignment_3_2_1 ) )
            {
            // InternalKinematicsParser.g:4678:1: ( ( rule__Link__VisualAssignment_3_2_1 ) )
            // InternalKinematicsParser.g:4679:2: ( rule__Link__VisualAssignment_3_2_1 )
            {
             before(grammarAccess.getLinkAccess().getVisualAssignment_3_2_1()); 
            // InternalKinematicsParser.g:4680:2: ( rule__Link__VisualAssignment_3_2_1 )
            // InternalKinematicsParser.g:4680:3: rule__Link__VisualAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__VisualAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getVisualAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3_2__1__Impl"


    // $ANTLR start "rule__Link__Group_3_3__0"
    // InternalKinematicsParser.g:4689:1: rule__Link__Group_3_3__0 : rule__Link__Group_3_3__0__Impl rule__Link__Group_3_3__1 ;
    public final void rule__Link__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4693:1: ( rule__Link__Group_3_3__0__Impl rule__Link__Group_3_3__1 )
            // InternalKinematicsParser.g:4694:2: rule__Link__Group_3_3__0__Impl rule__Link__Group_3_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Link__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3_3__0"


    // $ANTLR start "rule__Link__Group_3_3__0__Impl"
    // InternalKinematicsParser.g:4701:1: rule__Link__Group_3_3__0__Impl : ( Collision ) ;
    public final void rule__Link__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4705:1: ( ( Collision ) )
            // InternalKinematicsParser.g:4706:1: ( Collision )
            {
            // InternalKinematicsParser.g:4706:1: ( Collision )
            // InternalKinematicsParser.g:4707:2: Collision
            {
             before(grammarAccess.getLinkAccess().getCollisionKeyword_3_3_0()); 
            match(input,Collision,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getCollisionKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3_3__0__Impl"


    // $ANTLR start "rule__Link__Group_3_3__1"
    // InternalKinematicsParser.g:4716:1: rule__Link__Group_3_3__1 : rule__Link__Group_3_3__1__Impl ;
    public final void rule__Link__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4720:1: ( rule__Link__Group_3_3__1__Impl )
            // InternalKinematicsParser.g:4721:2: rule__Link__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3_3__1"


    // $ANTLR start "rule__Link__Group_3_3__1__Impl"
    // InternalKinematicsParser.g:4727:1: rule__Link__Group_3_3__1__Impl : ( ( rule__Link__CollisionAssignment_3_3_1 ) ) ;
    public final void rule__Link__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4731:1: ( ( ( rule__Link__CollisionAssignment_3_3_1 ) ) )
            // InternalKinematicsParser.g:4732:1: ( ( rule__Link__CollisionAssignment_3_3_1 ) )
            {
            // InternalKinematicsParser.g:4732:1: ( ( rule__Link__CollisionAssignment_3_3_1 ) )
            // InternalKinematicsParser.g:4733:2: ( rule__Link__CollisionAssignment_3_3_1 )
            {
             before(grammarAccess.getLinkAccess().getCollisionAssignment_3_3_1()); 
            // InternalKinematicsParser.g:4734:2: ( rule__Link__CollisionAssignment_3_3_1 )
            // InternalKinematicsParser.g:4734:3: rule__Link__CollisionAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__CollisionAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getCollisionAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3_3__1__Impl"


    // $ANTLR start "rule__Pose__Group__0"
    // InternalKinematicsParser.g:4743:1: rule__Pose__Group__0 : rule__Pose__Group__0__Impl rule__Pose__Group__1 ;
    public final void rule__Pose__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4747:1: ( rule__Pose__Group__0__Impl rule__Pose__Group__1 )
            // InternalKinematicsParser.g:4748:2: rule__Pose__Group__0__Impl rule__Pose__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Pose__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group__0"


    // $ANTLR start "rule__Pose__Group__0__Impl"
    // InternalKinematicsParser.g:4755:1: rule__Pose__Group__0__Impl : ( () ) ;
    public final void rule__Pose__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4759:1: ( ( () ) )
            // InternalKinematicsParser.g:4760:1: ( () )
            {
            // InternalKinematicsParser.g:4760:1: ( () )
            // InternalKinematicsParser.g:4761:2: ()
            {
             before(grammarAccess.getPoseAccess().getPoseAction_0()); 
            // InternalKinematicsParser.g:4762:2: ()
            // InternalKinematicsParser.g:4762:3: 
            {
            }

             after(grammarAccess.getPoseAccess().getPoseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group__0__Impl"


    // $ANTLR start "rule__Pose__Group__1"
    // InternalKinematicsParser.g:4770:1: rule__Pose__Group__1 : rule__Pose__Group__1__Impl rule__Pose__Group__2 ;
    public final void rule__Pose__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4774:1: ( rule__Pose__Group__1__Impl rule__Pose__Group__2 )
            // InternalKinematicsParser.g:4775:2: rule__Pose__Group__1__Impl rule__Pose__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__Pose__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group__1"


    // $ANTLR start "rule__Pose__Group__1__Impl"
    // InternalKinematicsParser.g:4782:1: rule__Pose__Group__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Pose__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4786:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:4787:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:4787:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:4788:2: RULE_BEGIN
            {
             before(grammarAccess.getPoseAccess().getBEGINTerminalRuleCall_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getBEGINTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group__1__Impl"


    // $ANTLR start "rule__Pose__Group__2"
    // InternalKinematicsParser.g:4797:1: rule__Pose__Group__2 : rule__Pose__Group__2__Impl rule__Pose__Group__3 ;
    public final void rule__Pose__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4801:1: ( rule__Pose__Group__2__Impl rule__Pose__Group__3 )
            // InternalKinematicsParser.g:4802:2: rule__Pose__Group__2__Impl rule__Pose__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__Pose__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group__2"


    // $ANTLR start "rule__Pose__Group__2__Impl"
    // InternalKinematicsParser.g:4809:1: rule__Pose__Group__2__Impl : ( ( rule__Pose__Group_2__0 )? ) ;
    public final void rule__Pose__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4813:1: ( ( ( rule__Pose__Group_2__0 )? ) )
            // InternalKinematicsParser.g:4814:1: ( ( rule__Pose__Group_2__0 )? )
            {
            // InternalKinematicsParser.g:4814:1: ( ( rule__Pose__Group_2__0 )? )
            // InternalKinematicsParser.g:4815:2: ( rule__Pose__Group_2__0 )?
            {
             before(grammarAccess.getPoseAccess().getGroup_2()); 
            // InternalKinematicsParser.g:4816:2: ( rule__Pose__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Rpy) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalKinematicsParser.g:4816:3: rule__Pose__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pose__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPoseAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group__2__Impl"


    // $ANTLR start "rule__Pose__Group__3"
    // InternalKinematicsParser.g:4824:1: rule__Pose__Group__3 : rule__Pose__Group__3__Impl rule__Pose__Group__4 ;
    public final void rule__Pose__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4828:1: ( rule__Pose__Group__3__Impl rule__Pose__Group__4 )
            // InternalKinematicsParser.g:4829:2: rule__Pose__Group__3__Impl rule__Pose__Group__4
            {
            pushFollow(FOLLOW_43);
            rule__Pose__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group__3"


    // $ANTLR start "rule__Pose__Group__3__Impl"
    // InternalKinematicsParser.g:4836:1: rule__Pose__Group__3__Impl : ( ( rule__Pose__Group_3__0 )? ) ;
    public final void rule__Pose__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4840:1: ( ( ( rule__Pose__Group_3__0 )? ) )
            // InternalKinematicsParser.g:4841:1: ( ( rule__Pose__Group_3__0 )? )
            {
            // InternalKinematicsParser.g:4841:1: ( ( rule__Pose__Group_3__0 )? )
            // InternalKinematicsParser.g:4842:2: ( rule__Pose__Group_3__0 )?
            {
             before(grammarAccess.getPoseAccess().getGroup_3()); 
            // InternalKinematicsParser.g:4843:2: ( rule__Pose__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Xyz) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalKinematicsParser.g:4843:3: rule__Pose__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pose__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPoseAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group__3__Impl"


    // $ANTLR start "rule__Pose__Group__4"
    // InternalKinematicsParser.g:4851:1: rule__Pose__Group__4 : rule__Pose__Group__4__Impl ;
    public final void rule__Pose__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4855:1: ( rule__Pose__Group__4__Impl )
            // InternalKinematicsParser.g:4856:2: rule__Pose__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pose__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group__4"


    // $ANTLR start "rule__Pose__Group__4__Impl"
    // InternalKinematicsParser.g:4862:1: rule__Pose__Group__4__Impl : ( RULE_END ) ;
    public final void rule__Pose__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4866:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:4867:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:4867:1: ( RULE_END )
            // InternalKinematicsParser.g:4868:2: RULE_END
            {
             before(grammarAccess.getPoseAccess().getENDTerminalRuleCall_4()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getENDTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group__4__Impl"


    // $ANTLR start "rule__Pose__Group_2__0"
    // InternalKinematicsParser.g:4878:1: rule__Pose__Group_2__0 : rule__Pose__Group_2__0__Impl rule__Pose__Group_2__1 ;
    public final void rule__Pose__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4882:1: ( rule__Pose__Group_2__0__Impl rule__Pose__Group_2__1 )
            // InternalKinematicsParser.g:4883:2: rule__Pose__Group_2__0__Impl rule__Pose__Group_2__1
            {
            pushFollow(FOLLOW_44);
            rule__Pose__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_2__0"


    // $ANTLR start "rule__Pose__Group_2__0__Impl"
    // InternalKinematicsParser.g:4890:1: rule__Pose__Group_2__0__Impl : ( Rpy ) ;
    public final void rule__Pose__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4894:1: ( ( Rpy ) )
            // InternalKinematicsParser.g:4895:1: ( Rpy )
            {
            // InternalKinematicsParser.g:4895:1: ( Rpy )
            // InternalKinematicsParser.g:4896:2: Rpy
            {
             before(grammarAccess.getPoseAccess().getRpyKeyword_2_0()); 
            match(input,Rpy,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getRpyKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_2__0__Impl"


    // $ANTLR start "rule__Pose__Group_2__1"
    // InternalKinematicsParser.g:4905:1: rule__Pose__Group_2__1 : rule__Pose__Group_2__1__Impl rule__Pose__Group_2__2 ;
    public final void rule__Pose__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4909:1: ( rule__Pose__Group_2__1__Impl rule__Pose__Group_2__2 )
            // InternalKinematicsParser.g:4910:2: rule__Pose__Group_2__1__Impl rule__Pose__Group_2__2
            {
            pushFollow(FOLLOW_45);
            rule__Pose__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_2__1"


    // $ANTLR start "rule__Pose__Group_2__1__Impl"
    // InternalKinematicsParser.g:4917:1: rule__Pose__Group_2__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__Pose__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4921:1: ( ( LeftSquareBracket ) )
            // InternalKinematicsParser.g:4922:1: ( LeftSquareBracket )
            {
            // InternalKinematicsParser.g:4922:1: ( LeftSquareBracket )
            // InternalKinematicsParser.g:4923:2: LeftSquareBracket
            {
             before(grammarAccess.getPoseAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getLeftSquareBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_2__1__Impl"


    // $ANTLR start "rule__Pose__Group_2__2"
    // InternalKinematicsParser.g:4932:1: rule__Pose__Group_2__2 : rule__Pose__Group_2__2__Impl rule__Pose__Group_2__3 ;
    public final void rule__Pose__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4936:1: ( rule__Pose__Group_2__2__Impl rule__Pose__Group_2__3 )
            // InternalKinematicsParser.g:4937:2: rule__Pose__Group_2__2__Impl rule__Pose__Group_2__3
            {
            pushFollow(FOLLOW_46);
            rule__Pose__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_2__2"


    // $ANTLR start "rule__Pose__Group_2__2__Impl"
    // InternalKinematicsParser.g:4944:1: rule__Pose__Group_2__2__Impl : ( ( rule__Pose__RpyAssignment_2_2 ) ) ;
    public final void rule__Pose__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4948:1: ( ( ( rule__Pose__RpyAssignment_2_2 ) ) )
            // InternalKinematicsParser.g:4949:1: ( ( rule__Pose__RpyAssignment_2_2 ) )
            {
            // InternalKinematicsParser.g:4949:1: ( ( rule__Pose__RpyAssignment_2_2 ) )
            // InternalKinematicsParser.g:4950:2: ( rule__Pose__RpyAssignment_2_2 )
            {
             before(grammarAccess.getPoseAccess().getRpyAssignment_2_2()); 
            // InternalKinematicsParser.g:4951:2: ( rule__Pose__RpyAssignment_2_2 )
            // InternalKinematicsParser.g:4951:3: rule__Pose__RpyAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Pose__RpyAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getPoseAccess().getRpyAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_2__2__Impl"


    // $ANTLR start "rule__Pose__Group_2__3"
    // InternalKinematicsParser.g:4959:1: rule__Pose__Group_2__3 : rule__Pose__Group_2__3__Impl rule__Pose__Group_2__4 ;
    public final void rule__Pose__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4963:1: ( rule__Pose__Group_2__3__Impl rule__Pose__Group_2__4 )
            // InternalKinematicsParser.g:4964:2: rule__Pose__Group_2__3__Impl rule__Pose__Group_2__4
            {
            pushFollow(FOLLOW_46);
            rule__Pose__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_2__3"


    // $ANTLR start "rule__Pose__Group_2__3__Impl"
    // InternalKinematicsParser.g:4971:1: rule__Pose__Group_2__3__Impl : ( ( rule__Pose__Group_2_3__0 )* ) ;
    public final void rule__Pose__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4975:1: ( ( ( rule__Pose__Group_2_3__0 )* ) )
            // InternalKinematicsParser.g:4976:1: ( ( rule__Pose__Group_2_3__0 )* )
            {
            // InternalKinematicsParser.g:4976:1: ( ( rule__Pose__Group_2_3__0 )* )
            // InternalKinematicsParser.g:4977:2: ( rule__Pose__Group_2_3__0 )*
            {
             before(grammarAccess.getPoseAccess().getGroup_2_3()); 
            // InternalKinematicsParser.g:4978:2: ( rule__Pose__Group_2_3__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==Comma) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalKinematicsParser.g:4978:3: rule__Pose__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__Pose__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getPoseAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_2__3__Impl"


    // $ANTLR start "rule__Pose__Group_2__4"
    // InternalKinematicsParser.g:4986:1: rule__Pose__Group_2__4 : rule__Pose__Group_2__4__Impl ;
    public final void rule__Pose__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4990:1: ( rule__Pose__Group_2__4__Impl )
            // InternalKinematicsParser.g:4991:2: rule__Pose__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pose__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_2__4"


    // $ANTLR start "rule__Pose__Group_2__4__Impl"
    // InternalKinematicsParser.g:4997:1: rule__Pose__Group_2__4__Impl : ( RightSquareBracket ) ;
    public final void rule__Pose__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5001:1: ( ( RightSquareBracket ) )
            // InternalKinematicsParser.g:5002:1: ( RightSquareBracket )
            {
            // InternalKinematicsParser.g:5002:1: ( RightSquareBracket )
            // InternalKinematicsParser.g:5003:2: RightSquareBracket
            {
             before(grammarAccess.getPoseAccess().getRightSquareBracketKeyword_2_4()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getRightSquareBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_2__4__Impl"


    // $ANTLR start "rule__Pose__Group_2_3__0"
    // InternalKinematicsParser.g:5013:1: rule__Pose__Group_2_3__0 : rule__Pose__Group_2_3__0__Impl rule__Pose__Group_2_3__1 ;
    public final void rule__Pose__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5017:1: ( rule__Pose__Group_2_3__0__Impl rule__Pose__Group_2_3__1 )
            // InternalKinematicsParser.g:5018:2: rule__Pose__Group_2_3__0__Impl rule__Pose__Group_2_3__1
            {
            pushFollow(FOLLOW_45);
            rule__Pose__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_2_3__0"


    // $ANTLR start "rule__Pose__Group_2_3__0__Impl"
    // InternalKinematicsParser.g:5025:1: rule__Pose__Group_2_3__0__Impl : ( Comma ) ;
    public final void rule__Pose__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5029:1: ( ( Comma ) )
            // InternalKinematicsParser.g:5030:1: ( Comma )
            {
            // InternalKinematicsParser.g:5030:1: ( Comma )
            // InternalKinematicsParser.g:5031:2: Comma
            {
             before(grammarAccess.getPoseAccess().getCommaKeyword_2_3_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_2_3__0__Impl"


    // $ANTLR start "rule__Pose__Group_2_3__1"
    // InternalKinematicsParser.g:5040:1: rule__Pose__Group_2_3__1 : rule__Pose__Group_2_3__1__Impl ;
    public final void rule__Pose__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5044:1: ( rule__Pose__Group_2_3__1__Impl )
            // InternalKinematicsParser.g:5045:2: rule__Pose__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pose__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_2_3__1"


    // $ANTLR start "rule__Pose__Group_2_3__1__Impl"
    // InternalKinematicsParser.g:5051:1: rule__Pose__Group_2_3__1__Impl : ( ( rule__Pose__RpyAssignment_2_3_1 ) ) ;
    public final void rule__Pose__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5055:1: ( ( ( rule__Pose__RpyAssignment_2_3_1 ) ) )
            // InternalKinematicsParser.g:5056:1: ( ( rule__Pose__RpyAssignment_2_3_1 ) )
            {
            // InternalKinematicsParser.g:5056:1: ( ( rule__Pose__RpyAssignment_2_3_1 ) )
            // InternalKinematicsParser.g:5057:2: ( rule__Pose__RpyAssignment_2_3_1 )
            {
             before(grammarAccess.getPoseAccess().getRpyAssignment_2_3_1()); 
            // InternalKinematicsParser.g:5058:2: ( rule__Pose__RpyAssignment_2_3_1 )
            // InternalKinematicsParser.g:5058:3: rule__Pose__RpyAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Pose__RpyAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPoseAccess().getRpyAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_2_3__1__Impl"


    // $ANTLR start "rule__Pose__Group_3__0"
    // InternalKinematicsParser.g:5067:1: rule__Pose__Group_3__0 : rule__Pose__Group_3__0__Impl rule__Pose__Group_3__1 ;
    public final void rule__Pose__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5071:1: ( rule__Pose__Group_3__0__Impl rule__Pose__Group_3__1 )
            // InternalKinematicsParser.g:5072:2: rule__Pose__Group_3__0__Impl rule__Pose__Group_3__1
            {
            pushFollow(FOLLOW_44);
            rule__Pose__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_3__0"


    // $ANTLR start "rule__Pose__Group_3__0__Impl"
    // InternalKinematicsParser.g:5079:1: rule__Pose__Group_3__0__Impl : ( Xyz ) ;
    public final void rule__Pose__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5083:1: ( ( Xyz ) )
            // InternalKinematicsParser.g:5084:1: ( Xyz )
            {
            // InternalKinematicsParser.g:5084:1: ( Xyz )
            // InternalKinematicsParser.g:5085:2: Xyz
            {
             before(grammarAccess.getPoseAccess().getXyzKeyword_3_0()); 
            match(input,Xyz,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getXyzKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_3__0__Impl"


    // $ANTLR start "rule__Pose__Group_3__1"
    // InternalKinematicsParser.g:5094:1: rule__Pose__Group_3__1 : rule__Pose__Group_3__1__Impl rule__Pose__Group_3__2 ;
    public final void rule__Pose__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5098:1: ( rule__Pose__Group_3__1__Impl rule__Pose__Group_3__2 )
            // InternalKinematicsParser.g:5099:2: rule__Pose__Group_3__1__Impl rule__Pose__Group_3__2
            {
            pushFollow(FOLLOW_45);
            rule__Pose__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_3__1"


    // $ANTLR start "rule__Pose__Group_3__1__Impl"
    // InternalKinematicsParser.g:5106:1: rule__Pose__Group_3__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__Pose__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5110:1: ( ( LeftSquareBracket ) )
            // InternalKinematicsParser.g:5111:1: ( LeftSquareBracket )
            {
            // InternalKinematicsParser.g:5111:1: ( LeftSquareBracket )
            // InternalKinematicsParser.g:5112:2: LeftSquareBracket
            {
             before(grammarAccess.getPoseAccess().getLeftSquareBracketKeyword_3_1()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getLeftSquareBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_3__1__Impl"


    // $ANTLR start "rule__Pose__Group_3__2"
    // InternalKinematicsParser.g:5121:1: rule__Pose__Group_3__2 : rule__Pose__Group_3__2__Impl rule__Pose__Group_3__3 ;
    public final void rule__Pose__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5125:1: ( rule__Pose__Group_3__2__Impl rule__Pose__Group_3__3 )
            // InternalKinematicsParser.g:5126:2: rule__Pose__Group_3__2__Impl rule__Pose__Group_3__3
            {
            pushFollow(FOLLOW_46);
            rule__Pose__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_3__2"


    // $ANTLR start "rule__Pose__Group_3__2__Impl"
    // InternalKinematicsParser.g:5133:1: rule__Pose__Group_3__2__Impl : ( ( rule__Pose__XyzAssignment_3_2 ) ) ;
    public final void rule__Pose__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5137:1: ( ( ( rule__Pose__XyzAssignment_3_2 ) ) )
            // InternalKinematicsParser.g:5138:1: ( ( rule__Pose__XyzAssignment_3_2 ) )
            {
            // InternalKinematicsParser.g:5138:1: ( ( rule__Pose__XyzAssignment_3_2 ) )
            // InternalKinematicsParser.g:5139:2: ( rule__Pose__XyzAssignment_3_2 )
            {
             before(grammarAccess.getPoseAccess().getXyzAssignment_3_2()); 
            // InternalKinematicsParser.g:5140:2: ( rule__Pose__XyzAssignment_3_2 )
            // InternalKinematicsParser.g:5140:3: rule__Pose__XyzAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Pose__XyzAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getPoseAccess().getXyzAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_3__2__Impl"


    // $ANTLR start "rule__Pose__Group_3__3"
    // InternalKinematicsParser.g:5148:1: rule__Pose__Group_3__3 : rule__Pose__Group_3__3__Impl rule__Pose__Group_3__4 ;
    public final void rule__Pose__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5152:1: ( rule__Pose__Group_3__3__Impl rule__Pose__Group_3__4 )
            // InternalKinematicsParser.g:5153:2: rule__Pose__Group_3__3__Impl rule__Pose__Group_3__4
            {
            pushFollow(FOLLOW_46);
            rule__Pose__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_3__3"


    // $ANTLR start "rule__Pose__Group_3__3__Impl"
    // InternalKinematicsParser.g:5160:1: rule__Pose__Group_3__3__Impl : ( ( rule__Pose__Group_3_3__0 )* ) ;
    public final void rule__Pose__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5164:1: ( ( ( rule__Pose__Group_3_3__0 )* ) )
            // InternalKinematicsParser.g:5165:1: ( ( rule__Pose__Group_3_3__0 )* )
            {
            // InternalKinematicsParser.g:5165:1: ( ( rule__Pose__Group_3_3__0 )* )
            // InternalKinematicsParser.g:5166:2: ( rule__Pose__Group_3_3__0 )*
            {
             before(grammarAccess.getPoseAccess().getGroup_3_3()); 
            // InternalKinematicsParser.g:5167:2: ( rule__Pose__Group_3_3__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==Comma) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalKinematicsParser.g:5167:3: rule__Pose__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__Pose__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getPoseAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_3__3__Impl"


    // $ANTLR start "rule__Pose__Group_3__4"
    // InternalKinematicsParser.g:5175:1: rule__Pose__Group_3__4 : rule__Pose__Group_3__4__Impl ;
    public final void rule__Pose__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5179:1: ( rule__Pose__Group_3__4__Impl )
            // InternalKinematicsParser.g:5180:2: rule__Pose__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pose__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_3__4"


    // $ANTLR start "rule__Pose__Group_3__4__Impl"
    // InternalKinematicsParser.g:5186:1: rule__Pose__Group_3__4__Impl : ( RightSquareBracket ) ;
    public final void rule__Pose__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5190:1: ( ( RightSquareBracket ) )
            // InternalKinematicsParser.g:5191:1: ( RightSquareBracket )
            {
            // InternalKinematicsParser.g:5191:1: ( RightSquareBracket )
            // InternalKinematicsParser.g:5192:2: RightSquareBracket
            {
             before(grammarAccess.getPoseAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getRightSquareBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_3__4__Impl"


    // $ANTLR start "rule__Pose__Group_3_3__0"
    // InternalKinematicsParser.g:5202:1: rule__Pose__Group_3_3__0 : rule__Pose__Group_3_3__0__Impl rule__Pose__Group_3_3__1 ;
    public final void rule__Pose__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5206:1: ( rule__Pose__Group_3_3__0__Impl rule__Pose__Group_3_3__1 )
            // InternalKinematicsParser.g:5207:2: rule__Pose__Group_3_3__0__Impl rule__Pose__Group_3_3__1
            {
            pushFollow(FOLLOW_45);
            rule__Pose__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_3_3__0"


    // $ANTLR start "rule__Pose__Group_3_3__0__Impl"
    // InternalKinematicsParser.g:5214:1: rule__Pose__Group_3_3__0__Impl : ( Comma ) ;
    public final void rule__Pose__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5218:1: ( ( Comma ) )
            // InternalKinematicsParser.g:5219:1: ( Comma )
            {
            // InternalKinematicsParser.g:5219:1: ( Comma )
            // InternalKinematicsParser.g:5220:2: Comma
            {
             before(grammarAccess.getPoseAccess().getCommaKeyword_3_3_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_3_3__0__Impl"


    // $ANTLR start "rule__Pose__Group_3_3__1"
    // InternalKinematicsParser.g:5229:1: rule__Pose__Group_3_3__1 : rule__Pose__Group_3_3__1__Impl ;
    public final void rule__Pose__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5233:1: ( rule__Pose__Group_3_3__1__Impl )
            // InternalKinematicsParser.g:5234:2: rule__Pose__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pose__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_3_3__1"


    // $ANTLR start "rule__Pose__Group_3_3__1__Impl"
    // InternalKinematicsParser.g:5240:1: rule__Pose__Group_3_3__1__Impl : ( ( rule__Pose__XyzAssignment_3_3_1 ) ) ;
    public final void rule__Pose__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5244:1: ( ( ( rule__Pose__XyzAssignment_3_3_1 ) ) )
            // InternalKinematicsParser.g:5245:1: ( ( rule__Pose__XyzAssignment_3_3_1 ) )
            {
            // InternalKinematicsParser.g:5245:1: ( ( rule__Pose__XyzAssignment_3_3_1 ) )
            // InternalKinematicsParser.g:5246:2: ( rule__Pose__XyzAssignment_3_3_1 )
            {
             before(grammarAccess.getPoseAccess().getXyzAssignment_3_3_1()); 
            // InternalKinematicsParser.g:5247:2: ( rule__Pose__XyzAssignment_3_3_1 )
            // InternalKinematicsParser.g:5247:3: rule__Pose__XyzAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Pose__XyzAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPoseAccess().getXyzAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_3_3__1__Impl"


    // $ANTLR start "rule__Axis__Group__0"
    // InternalKinematicsParser.g:5256:1: rule__Axis__Group__0 : rule__Axis__Group__0__Impl rule__Axis__Group__1 ;
    public final void rule__Axis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5260:1: ( rule__Axis__Group__0__Impl rule__Axis__Group__1 )
            // InternalKinematicsParser.g:5261:2: rule__Axis__Group__0__Impl rule__Axis__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Axis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__0"


    // $ANTLR start "rule__Axis__Group__0__Impl"
    // InternalKinematicsParser.g:5268:1: rule__Axis__Group__0__Impl : ( () ) ;
    public final void rule__Axis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5272:1: ( ( () ) )
            // InternalKinematicsParser.g:5273:1: ( () )
            {
            // InternalKinematicsParser.g:5273:1: ( () )
            // InternalKinematicsParser.g:5274:2: ()
            {
             before(grammarAccess.getAxisAccess().getAxisAction_0()); 
            // InternalKinematicsParser.g:5275:2: ()
            // InternalKinematicsParser.g:5275:3: 
            {
            }

             after(grammarAccess.getAxisAccess().getAxisAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__0__Impl"


    // $ANTLR start "rule__Axis__Group__1"
    // InternalKinematicsParser.g:5283:1: rule__Axis__Group__1 : rule__Axis__Group__1__Impl rule__Axis__Group__2 ;
    public final void rule__Axis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5287:1: ( rule__Axis__Group__1__Impl rule__Axis__Group__2 )
            // InternalKinematicsParser.g:5288:2: rule__Axis__Group__1__Impl rule__Axis__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__Axis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__1"


    // $ANTLR start "rule__Axis__Group__1__Impl"
    // InternalKinematicsParser.g:5295:1: rule__Axis__Group__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Axis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5299:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:5300:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:5300:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:5301:2: RULE_BEGIN
            {
             before(grammarAccess.getAxisAccess().getBEGINTerminalRuleCall_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getBEGINTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__1__Impl"


    // $ANTLR start "rule__Axis__Group__2"
    // InternalKinematicsParser.g:5310:1: rule__Axis__Group__2 : rule__Axis__Group__2__Impl rule__Axis__Group__3 ;
    public final void rule__Axis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5314:1: ( rule__Axis__Group__2__Impl rule__Axis__Group__3 )
            // InternalKinematicsParser.g:5315:2: rule__Axis__Group__2__Impl rule__Axis__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__Axis__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__2"


    // $ANTLR start "rule__Axis__Group__2__Impl"
    // InternalKinematicsParser.g:5322:1: rule__Axis__Group__2__Impl : ( ( rule__Axis__Group_2__0 )? ) ;
    public final void rule__Axis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5326:1: ( ( ( rule__Axis__Group_2__0 )? ) )
            // InternalKinematicsParser.g:5327:1: ( ( rule__Axis__Group_2__0 )? )
            {
            // InternalKinematicsParser.g:5327:1: ( ( rule__Axis__Group_2__0 )? )
            // InternalKinematicsParser.g:5328:2: ( rule__Axis__Group_2__0 )?
            {
             before(grammarAccess.getAxisAccess().getGroup_2()); 
            // InternalKinematicsParser.g:5329:2: ( rule__Axis__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Xyz) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalKinematicsParser.g:5329:3: rule__Axis__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Axis__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAxisAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__2__Impl"


    // $ANTLR start "rule__Axis__Group__3"
    // InternalKinematicsParser.g:5337:1: rule__Axis__Group__3 : rule__Axis__Group__3__Impl ;
    public final void rule__Axis__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5341:1: ( rule__Axis__Group__3__Impl )
            // InternalKinematicsParser.g:5342:2: rule__Axis__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Axis__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__3"


    // $ANTLR start "rule__Axis__Group__3__Impl"
    // InternalKinematicsParser.g:5348:1: rule__Axis__Group__3__Impl : ( RULE_END ) ;
    public final void rule__Axis__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5352:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:5353:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:5353:1: ( RULE_END )
            // InternalKinematicsParser.g:5354:2: RULE_END
            {
             before(grammarAccess.getAxisAccess().getENDTerminalRuleCall_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getENDTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__3__Impl"


    // $ANTLR start "rule__Axis__Group_2__0"
    // InternalKinematicsParser.g:5364:1: rule__Axis__Group_2__0 : rule__Axis__Group_2__0__Impl rule__Axis__Group_2__1 ;
    public final void rule__Axis__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5368:1: ( rule__Axis__Group_2__0__Impl rule__Axis__Group_2__1 )
            // InternalKinematicsParser.g:5369:2: rule__Axis__Group_2__0__Impl rule__Axis__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Axis__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_2__0"


    // $ANTLR start "rule__Axis__Group_2__0__Impl"
    // InternalKinematicsParser.g:5376:1: rule__Axis__Group_2__0__Impl : ( Xyz ) ;
    public final void rule__Axis__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5380:1: ( ( Xyz ) )
            // InternalKinematicsParser.g:5381:1: ( Xyz )
            {
            // InternalKinematicsParser.g:5381:1: ( Xyz )
            // InternalKinematicsParser.g:5382:2: Xyz
            {
             before(grammarAccess.getAxisAccess().getXyzKeyword_2_0()); 
            match(input,Xyz,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getXyzKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_2__0__Impl"


    // $ANTLR start "rule__Axis__Group_2__1"
    // InternalKinematicsParser.g:5391:1: rule__Axis__Group_2__1 : rule__Axis__Group_2__1__Impl ;
    public final void rule__Axis__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5395:1: ( rule__Axis__Group_2__1__Impl )
            // InternalKinematicsParser.g:5396:2: rule__Axis__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Axis__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_2__1"


    // $ANTLR start "rule__Axis__Group_2__1__Impl"
    // InternalKinematicsParser.g:5402:1: rule__Axis__Group_2__1__Impl : ( ( rule__Axis__XyzAssignment_2_1 ) ) ;
    public final void rule__Axis__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5406:1: ( ( ( rule__Axis__XyzAssignment_2_1 ) ) )
            // InternalKinematicsParser.g:5407:1: ( ( rule__Axis__XyzAssignment_2_1 ) )
            {
            // InternalKinematicsParser.g:5407:1: ( ( rule__Axis__XyzAssignment_2_1 ) )
            // InternalKinematicsParser.g:5408:2: ( rule__Axis__XyzAssignment_2_1 )
            {
             before(grammarAccess.getAxisAccess().getXyzAssignment_2_1()); 
            // InternalKinematicsParser.g:5409:2: ( rule__Axis__XyzAssignment_2_1 )
            // InternalKinematicsParser.g:5409:3: rule__Axis__XyzAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Axis__XyzAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getXyzAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_2__1__Impl"


    // $ANTLR start "rule__Limit__Group__0"
    // InternalKinematicsParser.g:5418:1: rule__Limit__Group__0 : rule__Limit__Group__0__Impl rule__Limit__Group__1 ;
    public final void rule__Limit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5422:1: ( rule__Limit__Group__0__Impl rule__Limit__Group__1 )
            // InternalKinematicsParser.g:5423:2: rule__Limit__Group__0__Impl rule__Limit__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Limit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__0"


    // $ANTLR start "rule__Limit__Group__0__Impl"
    // InternalKinematicsParser.g:5430:1: rule__Limit__Group__0__Impl : ( () ) ;
    public final void rule__Limit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5434:1: ( ( () ) )
            // InternalKinematicsParser.g:5435:1: ( () )
            {
            // InternalKinematicsParser.g:5435:1: ( () )
            // InternalKinematicsParser.g:5436:2: ()
            {
             before(grammarAccess.getLimitAccess().getLimitAction_0()); 
            // InternalKinematicsParser.g:5437:2: ()
            // InternalKinematicsParser.g:5437:3: 
            {
            }

             after(grammarAccess.getLimitAccess().getLimitAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__0__Impl"


    // $ANTLR start "rule__Limit__Group__1"
    // InternalKinematicsParser.g:5445:1: rule__Limit__Group__1 : rule__Limit__Group__1__Impl rule__Limit__Group__2 ;
    public final void rule__Limit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5449:1: ( rule__Limit__Group__1__Impl rule__Limit__Group__2 )
            // InternalKinematicsParser.g:5450:2: rule__Limit__Group__1__Impl rule__Limit__Group__2
            {
            pushFollow(FOLLOW_49);
            rule__Limit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__1"


    // $ANTLR start "rule__Limit__Group__1__Impl"
    // InternalKinematicsParser.g:5457:1: rule__Limit__Group__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Limit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5461:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:5462:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:5462:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:5463:2: RULE_BEGIN
            {
             before(grammarAccess.getLimitAccess().getBEGINTerminalRuleCall_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getBEGINTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__1__Impl"


    // $ANTLR start "rule__Limit__Group__2"
    // InternalKinematicsParser.g:5472:1: rule__Limit__Group__2 : rule__Limit__Group__2__Impl rule__Limit__Group__3 ;
    public final void rule__Limit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5476:1: ( rule__Limit__Group__2__Impl rule__Limit__Group__3 )
            // InternalKinematicsParser.g:5477:2: rule__Limit__Group__2__Impl rule__Limit__Group__3
            {
            pushFollow(FOLLOW_49);
            rule__Limit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__2"


    // $ANTLR start "rule__Limit__Group__2__Impl"
    // InternalKinematicsParser.g:5484:1: rule__Limit__Group__2__Impl : ( ( rule__Limit__Group_2__0 )? ) ;
    public final void rule__Limit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5488:1: ( ( ( rule__Limit__Group_2__0 )? ) )
            // InternalKinematicsParser.g:5489:1: ( ( rule__Limit__Group_2__0 )? )
            {
            // InternalKinematicsParser.g:5489:1: ( ( rule__Limit__Group_2__0 )? )
            // InternalKinematicsParser.g:5490:2: ( rule__Limit__Group_2__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_2()); 
            // InternalKinematicsParser.g:5491:2: ( rule__Limit__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Effort) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalKinematicsParser.g:5491:3: rule__Limit__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limit__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__2__Impl"


    // $ANTLR start "rule__Limit__Group__3"
    // InternalKinematicsParser.g:5499:1: rule__Limit__Group__3 : rule__Limit__Group__3__Impl rule__Limit__Group__4 ;
    public final void rule__Limit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5503:1: ( rule__Limit__Group__3__Impl rule__Limit__Group__4 )
            // InternalKinematicsParser.g:5504:2: rule__Limit__Group__3__Impl rule__Limit__Group__4
            {
            pushFollow(FOLLOW_49);
            rule__Limit__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__3"


    // $ANTLR start "rule__Limit__Group__3__Impl"
    // InternalKinematicsParser.g:5511:1: rule__Limit__Group__3__Impl : ( ( rule__Limit__Group_3__0 )? ) ;
    public final void rule__Limit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5515:1: ( ( ( rule__Limit__Group_3__0 )? ) )
            // InternalKinematicsParser.g:5516:1: ( ( rule__Limit__Group_3__0 )? )
            {
            // InternalKinematicsParser.g:5516:1: ( ( rule__Limit__Group_3__0 )? )
            // InternalKinematicsParser.g:5517:2: ( rule__Limit__Group_3__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_3()); 
            // InternalKinematicsParser.g:5518:2: ( rule__Limit__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Lower) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalKinematicsParser.g:5518:3: rule__Limit__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limit__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__3__Impl"


    // $ANTLR start "rule__Limit__Group__4"
    // InternalKinematicsParser.g:5526:1: rule__Limit__Group__4 : rule__Limit__Group__4__Impl rule__Limit__Group__5 ;
    public final void rule__Limit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5530:1: ( rule__Limit__Group__4__Impl rule__Limit__Group__5 )
            // InternalKinematicsParser.g:5531:2: rule__Limit__Group__4__Impl rule__Limit__Group__5
            {
            pushFollow(FOLLOW_49);
            rule__Limit__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__4"


    // $ANTLR start "rule__Limit__Group__4__Impl"
    // InternalKinematicsParser.g:5538:1: rule__Limit__Group__4__Impl : ( ( rule__Limit__Group_4__0 )? ) ;
    public final void rule__Limit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5542:1: ( ( ( rule__Limit__Group_4__0 )? ) )
            // InternalKinematicsParser.g:5543:1: ( ( rule__Limit__Group_4__0 )? )
            {
            // InternalKinematicsParser.g:5543:1: ( ( rule__Limit__Group_4__0 )? )
            // InternalKinematicsParser.g:5544:2: ( rule__Limit__Group_4__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_4()); 
            // InternalKinematicsParser.g:5545:2: ( rule__Limit__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Upper) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalKinematicsParser.g:5545:3: rule__Limit__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limit__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__4__Impl"


    // $ANTLR start "rule__Limit__Group__5"
    // InternalKinematicsParser.g:5553:1: rule__Limit__Group__5 : rule__Limit__Group__5__Impl rule__Limit__Group__6 ;
    public final void rule__Limit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5557:1: ( rule__Limit__Group__5__Impl rule__Limit__Group__6 )
            // InternalKinematicsParser.g:5558:2: rule__Limit__Group__5__Impl rule__Limit__Group__6
            {
            pushFollow(FOLLOW_49);
            rule__Limit__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__5"


    // $ANTLR start "rule__Limit__Group__5__Impl"
    // InternalKinematicsParser.g:5565:1: rule__Limit__Group__5__Impl : ( ( rule__Limit__Group_5__0 )? ) ;
    public final void rule__Limit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5569:1: ( ( ( rule__Limit__Group_5__0 )? ) )
            // InternalKinematicsParser.g:5570:1: ( ( rule__Limit__Group_5__0 )? )
            {
            // InternalKinematicsParser.g:5570:1: ( ( rule__Limit__Group_5__0 )? )
            // InternalKinematicsParser.g:5571:2: ( rule__Limit__Group_5__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_5()); 
            // InternalKinematicsParser.g:5572:2: ( rule__Limit__Group_5__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==Velocity) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalKinematicsParser.g:5572:3: rule__Limit__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limit__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__5__Impl"


    // $ANTLR start "rule__Limit__Group__6"
    // InternalKinematicsParser.g:5580:1: rule__Limit__Group__6 : rule__Limit__Group__6__Impl ;
    public final void rule__Limit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5584:1: ( rule__Limit__Group__6__Impl )
            // InternalKinematicsParser.g:5585:2: rule__Limit__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__6"


    // $ANTLR start "rule__Limit__Group__6__Impl"
    // InternalKinematicsParser.g:5591:1: rule__Limit__Group__6__Impl : ( RULE_END ) ;
    public final void rule__Limit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5595:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:5596:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:5596:1: ( RULE_END )
            // InternalKinematicsParser.g:5597:2: RULE_END
            {
             before(grammarAccess.getLimitAccess().getENDTerminalRuleCall_6()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getENDTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__6__Impl"


    // $ANTLR start "rule__Limit__Group_2__0"
    // InternalKinematicsParser.g:5607:1: rule__Limit__Group_2__0 : rule__Limit__Group_2__0__Impl rule__Limit__Group_2__1 ;
    public final void rule__Limit__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5611:1: ( rule__Limit__Group_2__0__Impl rule__Limit__Group_2__1 )
            // InternalKinematicsParser.g:5612:2: rule__Limit__Group_2__0__Impl rule__Limit__Group_2__1
            {
            pushFollow(FOLLOW_45);
            rule__Limit__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_2__0"


    // $ANTLR start "rule__Limit__Group_2__0__Impl"
    // InternalKinematicsParser.g:5619:1: rule__Limit__Group_2__0__Impl : ( Effort ) ;
    public final void rule__Limit__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5623:1: ( ( Effort ) )
            // InternalKinematicsParser.g:5624:1: ( Effort )
            {
            // InternalKinematicsParser.g:5624:1: ( Effort )
            // InternalKinematicsParser.g:5625:2: Effort
            {
             before(grammarAccess.getLimitAccess().getEffortKeyword_2_0()); 
            match(input,Effort,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getEffortKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_2__0__Impl"


    // $ANTLR start "rule__Limit__Group_2__1"
    // InternalKinematicsParser.g:5634:1: rule__Limit__Group_2__1 : rule__Limit__Group_2__1__Impl ;
    public final void rule__Limit__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5638:1: ( rule__Limit__Group_2__1__Impl )
            // InternalKinematicsParser.g:5639:2: rule__Limit__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_2__1"


    // $ANTLR start "rule__Limit__Group_2__1__Impl"
    // InternalKinematicsParser.g:5645:1: rule__Limit__Group_2__1__Impl : ( ( rule__Limit__EffortAssignment_2_1 ) ) ;
    public final void rule__Limit__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5649:1: ( ( ( rule__Limit__EffortAssignment_2_1 ) ) )
            // InternalKinematicsParser.g:5650:1: ( ( rule__Limit__EffortAssignment_2_1 ) )
            {
            // InternalKinematicsParser.g:5650:1: ( ( rule__Limit__EffortAssignment_2_1 ) )
            // InternalKinematicsParser.g:5651:2: ( rule__Limit__EffortAssignment_2_1 )
            {
             before(grammarAccess.getLimitAccess().getEffortAssignment_2_1()); 
            // InternalKinematicsParser.g:5652:2: ( rule__Limit__EffortAssignment_2_1 )
            // InternalKinematicsParser.g:5652:3: rule__Limit__EffortAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Limit__EffortAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getEffortAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_2__1__Impl"


    // $ANTLR start "rule__Limit__Group_3__0"
    // InternalKinematicsParser.g:5661:1: rule__Limit__Group_3__0 : rule__Limit__Group_3__0__Impl rule__Limit__Group_3__1 ;
    public final void rule__Limit__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5665:1: ( rule__Limit__Group_3__0__Impl rule__Limit__Group_3__1 )
            // InternalKinematicsParser.g:5666:2: rule__Limit__Group_3__0__Impl rule__Limit__Group_3__1
            {
            pushFollow(FOLLOW_45);
            rule__Limit__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_3__0"


    // $ANTLR start "rule__Limit__Group_3__0__Impl"
    // InternalKinematicsParser.g:5673:1: rule__Limit__Group_3__0__Impl : ( Lower ) ;
    public final void rule__Limit__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5677:1: ( ( Lower ) )
            // InternalKinematicsParser.g:5678:1: ( Lower )
            {
            // InternalKinematicsParser.g:5678:1: ( Lower )
            // InternalKinematicsParser.g:5679:2: Lower
            {
             before(grammarAccess.getLimitAccess().getLowerKeyword_3_0()); 
            match(input,Lower,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getLowerKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_3__0__Impl"


    // $ANTLR start "rule__Limit__Group_3__1"
    // InternalKinematicsParser.g:5688:1: rule__Limit__Group_3__1 : rule__Limit__Group_3__1__Impl ;
    public final void rule__Limit__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5692:1: ( rule__Limit__Group_3__1__Impl )
            // InternalKinematicsParser.g:5693:2: rule__Limit__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_3__1"


    // $ANTLR start "rule__Limit__Group_3__1__Impl"
    // InternalKinematicsParser.g:5699:1: rule__Limit__Group_3__1__Impl : ( ( rule__Limit__LowerAssignment_3_1 ) ) ;
    public final void rule__Limit__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5703:1: ( ( ( rule__Limit__LowerAssignment_3_1 ) ) )
            // InternalKinematicsParser.g:5704:1: ( ( rule__Limit__LowerAssignment_3_1 ) )
            {
            // InternalKinematicsParser.g:5704:1: ( ( rule__Limit__LowerAssignment_3_1 ) )
            // InternalKinematicsParser.g:5705:2: ( rule__Limit__LowerAssignment_3_1 )
            {
             before(grammarAccess.getLimitAccess().getLowerAssignment_3_1()); 
            // InternalKinematicsParser.g:5706:2: ( rule__Limit__LowerAssignment_3_1 )
            // InternalKinematicsParser.g:5706:3: rule__Limit__LowerAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Limit__LowerAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getLowerAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_3__1__Impl"


    // $ANTLR start "rule__Limit__Group_4__0"
    // InternalKinematicsParser.g:5715:1: rule__Limit__Group_4__0 : rule__Limit__Group_4__0__Impl rule__Limit__Group_4__1 ;
    public final void rule__Limit__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5719:1: ( rule__Limit__Group_4__0__Impl rule__Limit__Group_4__1 )
            // InternalKinematicsParser.g:5720:2: rule__Limit__Group_4__0__Impl rule__Limit__Group_4__1
            {
            pushFollow(FOLLOW_45);
            rule__Limit__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_4__0"


    // $ANTLR start "rule__Limit__Group_4__0__Impl"
    // InternalKinematicsParser.g:5727:1: rule__Limit__Group_4__0__Impl : ( Upper ) ;
    public final void rule__Limit__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5731:1: ( ( Upper ) )
            // InternalKinematicsParser.g:5732:1: ( Upper )
            {
            // InternalKinematicsParser.g:5732:1: ( Upper )
            // InternalKinematicsParser.g:5733:2: Upper
            {
             before(grammarAccess.getLimitAccess().getUpperKeyword_4_0()); 
            match(input,Upper,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getUpperKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_4__0__Impl"


    // $ANTLR start "rule__Limit__Group_4__1"
    // InternalKinematicsParser.g:5742:1: rule__Limit__Group_4__1 : rule__Limit__Group_4__1__Impl ;
    public final void rule__Limit__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5746:1: ( rule__Limit__Group_4__1__Impl )
            // InternalKinematicsParser.g:5747:2: rule__Limit__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_4__1"


    // $ANTLR start "rule__Limit__Group_4__1__Impl"
    // InternalKinematicsParser.g:5753:1: rule__Limit__Group_4__1__Impl : ( ( rule__Limit__UpperAssignment_4_1 ) ) ;
    public final void rule__Limit__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5757:1: ( ( ( rule__Limit__UpperAssignment_4_1 ) ) )
            // InternalKinematicsParser.g:5758:1: ( ( rule__Limit__UpperAssignment_4_1 ) )
            {
            // InternalKinematicsParser.g:5758:1: ( ( rule__Limit__UpperAssignment_4_1 ) )
            // InternalKinematicsParser.g:5759:2: ( rule__Limit__UpperAssignment_4_1 )
            {
             before(grammarAccess.getLimitAccess().getUpperAssignment_4_1()); 
            // InternalKinematicsParser.g:5760:2: ( rule__Limit__UpperAssignment_4_1 )
            // InternalKinematicsParser.g:5760:3: rule__Limit__UpperAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Limit__UpperAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getUpperAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_4__1__Impl"


    // $ANTLR start "rule__Limit__Group_5__0"
    // InternalKinematicsParser.g:5769:1: rule__Limit__Group_5__0 : rule__Limit__Group_5__0__Impl rule__Limit__Group_5__1 ;
    public final void rule__Limit__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5773:1: ( rule__Limit__Group_5__0__Impl rule__Limit__Group_5__1 )
            // InternalKinematicsParser.g:5774:2: rule__Limit__Group_5__0__Impl rule__Limit__Group_5__1
            {
            pushFollow(FOLLOW_45);
            rule__Limit__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_5__0"


    // $ANTLR start "rule__Limit__Group_5__0__Impl"
    // InternalKinematicsParser.g:5781:1: rule__Limit__Group_5__0__Impl : ( Velocity ) ;
    public final void rule__Limit__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5785:1: ( ( Velocity ) )
            // InternalKinematicsParser.g:5786:1: ( Velocity )
            {
            // InternalKinematicsParser.g:5786:1: ( Velocity )
            // InternalKinematicsParser.g:5787:2: Velocity
            {
             before(grammarAccess.getLimitAccess().getVelocityKeyword_5_0()); 
            match(input,Velocity,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getVelocityKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_5__0__Impl"


    // $ANTLR start "rule__Limit__Group_5__1"
    // InternalKinematicsParser.g:5796:1: rule__Limit__Group_5__1 : rule__Limit__Group_5__1__Impl ;
    public final void rule__Limit__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5800:1: ( rule__Limit__Group_5__1__Impl )
            // InternalKinematicsParser.g:5801:2: rule__Limit__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_5__1"


    // $ANTLR start "rule__Limit__Group_5__1__Impl"
    // InternalKinematicsParser.g:5807:1: rule__Limit__Group_5__1__Impl : ( ( rule__Limit__VelocityAssignment_5_1 ) ) ;
    public final void rule__Limit__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5811:1: ( ( ( rule__Limit__VelocityAssignment_5_1 ) ) )
            // InternalKinematicsParser.g:5812:1: ( ( rule__Limit__VelocityAssignment_5_1 ) )
            {
            // InternalKinematicsParser.g:5812:1: ( ( rule__Limit__VelocityAssignment_5_1 ) )
            // InternalKinematicsParser.g:5813:2: ( rule__Limit__VelocityAssignment_5_1 )
            {
             before(grammarAccess.getLimitAccess().getVelocityAssignment_5_1()); 
            // InternalKinematicsParser.g:5814:2: ( rule__Limit__VelocityAssignment_5_1 )
            // InternalKinematicsParser.g:5814:3: rule__Limit__VelocityAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Limit__VelocityAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getVelocityAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_5__1__Impl"


    // $ANTLR start "rule__Inertial__Group__0"
    // InternalKinematicsParser.g:5823:1: rule__Inertial__Group__0 : rule__Inertial__Group__0__Impl rule__Inertial__Group__1 ;
    public final void rule__Inertial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5827:1: ( rule__Inertial__Group__0__Impl rule__Inertial__Group__1 )
            // InternalKinematicsParser.g:5828:2: rule__Inertial__Group__0__Impl rule__Inertial__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Inertial__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__0"


    // $ANTLR start "rule__Inertial__Group__0__Impl"
    // InternalKinematicsParser.g:5835:1: rule__Inertial__Group__0__Impl : ( () ) ;
    public final void rule__Inertial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5839:1: ( ( () ) )
            // InternalKinematicsParser.g:5840:1: ( () )
            {
            // InternalKinematicsParser.g:5840:1: ( () )
            // InternalKinematicsParser.g:5841:2: ()
            {
             before(grammarAccess.getInertialAccess().getInertialAction_0()); 
            // InternalKinematicsParser.g:5842:2: ()
            // InternalKinematicsParser.g:5842:3: 
            {
            }

             after(grammarAccess.getInertialAccess().getInertialAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__0__Impl"


    // $ANTLR start "rule__Inertial__Group__1"
    // InternalKinematicsParser.g:5850:1: rule__Inertial__Group__1 : rule__Inertial__Group__1__Impl rule__Inertial__Group__2 ;
    public final void rule__Inertial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5854:1: ( rule__Inertial__Group__1__Impl rule__Inertial__Group__2 )
            // InternalKinematicsParser.g:5855:2: rule__Inertial__Group__1__Impl rule__Inertial__Group__2
            {
            pushFollow(FOLLOW_50);
            rule__Inertial__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__1"


    // $ANTLR start "rule__Inertial__Group__1__Impl"
    // InternalKinematicsParser.g:5862:1: rule__Inertial__Group__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Inertial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5866:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:5867:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:5867:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:5868:2: RULE_BEGIN
            {
             before(grammarAccess.getInertialAccess().getBEGINTerminalRuleCall_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getInertialAccess().getBEGINTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__1__Impl"


    // $ANTLR start "rule__Inertial__Group__2"
    // InternalKinematicsParser.g:5877:1: rule__Inertial__Group__2 : rule__Inertial__Group__2__Impl rule__Inertial__Group__3 ;
    public final void rule__Inertial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5881:1: ( rule__Inertial__Group__2__Impl rule__Inertial__Group__3 )
            // InternalKinematicsParser.g:5882:2: rule__Inertial__Group__2__Impl rule__Inertial__Group__3
            {
            pushFollow(FOLLOW_50);
            rule__Inertial__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__2"


    // $ANTLR start "rule__Inertial__Group__2__Impl"
    // InternalKinematicsParser.g:5889:1: rule__Inertial__Group__2__Impl : ( ( rule__Inertial__Group_2__0 )? ) ;
    public final void rule__Inertial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5893:1: ( ( ( rule__Inertial__Group_2__0 )? ) )
            // InternalKinematicsParser.g:5894:1: ( ( rule__Inertial__Group_2__0 )? )
            {
            // InternalKinematicsParser.g:5894:1: ( ( rule__Inertial__Group_2__0 )? )
            // InternalKinematicsParser.g:5895:2: ( rule__Inertial__Group_2__0 )?
            {
             before(grammarAccess.getInertialAccess().getGroup_2()); 
            // InternalKinematicsParser.g:5896:2: ( rule__Inertial__Group_2__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Origin) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalKinematicsParser.g:5896:3: rule__Inertial__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inertial__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInertialAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__2__Impl"


    // $ANTLR start "rule__Inertial__Group__3"
    // InternalKinematicsParser.g:5904:1: rule__Inertial__Group__3 : rule__Inertial__Group__3__Impl rule__Inertial__Group__4 ;
    public final void rule__Inertial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5908:1: ( rule__Inertial__Group__3__Impl rule__Inertial__Group__4 )
            // InternalKinematicsParser.g:5909:2: rule__Inertial__Group__3__Impl rule__Inertial__Group__4
            {
            pushFollow(FOLLOW_50);
            rule__Inertial__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__3"


    // $ANTLR start "rule__Inertial__Group__3__Impl"
    // InternalKinematicsParser.g:5916:1: rule__Inertial__Group__3__Impl : ( ( rule__Inertial__Group_3__0 )? ) ;
    public final void rule__Inertial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5920:1: ( ( ( rule__Inertial__Group_3__0 )? ) )
            // InternalKinematicsParser.g:5921:1: ( ( rule__Inertial__Group_3__0 )? )
            {
            // InternalKinematicsParser.g:5921:1: ( ( rule__Inertial__Group_3__0 )? )
            // InternalKinematicsParser.g:5922:2: ( rule__Inertial__Group_3__0 )?
            {
             before(grammarAccess.getInertialAccess().getGroup_3()); 
            // InternalKinematicsParser.g:5923:2: ( rule__Inertial__Group_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==Mass) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalKinematicsParser.g:5923:3: rule__Inertial__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inertial__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInertialAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__3__Impl"


    // $ANTLR start "rule__Inertial__Group__4"
    // InternalKinematicsParser.g:5931:1: rule__Inertial__Group__4 : rule__Inertial__Group__4__Impl rule__Inertial__Group__5 ;
    public final void rule__Inertial__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5935:1: ( rule__Inertial__Group__4__Impl rule__Inertial__Group__5 )
            // InternalKinematicsParser.g:5936:2: rule__Inertial__Group__4__Impl rule__Inertial__Group__5
            {
            pushFollow(FOLLOW_50);
            rule__Inertial__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__4"


    // $ANTLR start "rule__Inertial__Group__4__Impl"
    // InternalKinematicsParser.g:5943:1: rule__Inertial__Group__4__Impl : ( ( rule__Inertial__Group_4__0 )? ) ;
    public final void rule__Inertial__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5947:1: ( ( ( rule__Inertial__Group_4__0 )? ) )
            // InternalKinematicsParser.g:5948:1: ( ( rule__Inertial__Group_4__0 )? )
            {
            // InternalKinematicsParser.g:5948:1: ( ( rule__Inertial__Group_4__0 )? )
            // InternalKinematicsParser.g:5949:2: ( rule__Inertial__Group_4__0 )?
            {
             before(grammarAccess.getInertialAccess().getGroup_4()); 
            // InternalKinematicsParser.g:5950:2: ( rule__Inertial__Group_4__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Inertia) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalKinematicsParser.g:5950:3: rule__Inertial__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inertial__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInertialAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__4__Impl"


    // $ANTLR start "rule__Inertial__Group__5"
    // InternalKinematicsParser.g:5958:1: rule__Inertial__Group__5 : rule__Inertial__Group__5__Impl ;
    public final void rule__Inertial__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5962:1: ( rule__Inertial__Group__5__Impl )
            // InternalKinematicsParser.g:5963:2: rule__Inertial__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__5"


    // $ANTLR start "rule__Inertial__Group__5__Impl"
    // InternalKinematicsParser.g:5969:1: rule__Inertial__Group__5__Impl : ( RULE_END ) ;
    public final void rule__Inertial__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5973:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:5974:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:5974:1: ( RULE_END )
            // InternalKinematicsParser.g:5975:2: RULE_END
            {
             before(grammarAccess.getInertialAccess().getENDTerminalRuleCall_5()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getInertialAccess().getENDTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__5__Impl"


    // $ANTLR start "rule__Inertial__Group_2__0"
    // InternalKinematicsParser.g:5985:1: rule__Inertial__Group_2__0 : rule__Inertial__Group_2__0__Impl rule__Inertial__Group_2__1 ;
    public final void rule__Inertial__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5989:1: ( rule__Inertial__Group_2__0__Impl rule__Inertial__Group_2__1 )
            // InternalKinematicsParser.g:5990:2: rule__Inertial__Group_2__0__Impl rule__Inertial__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Inertial__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group_2__0"


    // $ANTLR start "rule__Inertial__Group_2__0__Impl"
    // InternalKinematicsParser.g:5997:1: rule__Inertial__Group_2__0__Impl : ( Origin ) ;
    public final void rule__Inertial__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6001:1: ( ( Origin ) )
            // InternalKinematicsParser.g:6002:1: ( Origin )
            {
            // InternalKinematicsParser.g:6002:1: ( Origin )
            // InternalKinematicsParser.g:6003:2: Origin
            {
             before(grammarAccess.getInertialAccess().getOriginKeyword_2_0()); 
            match(input,Origin,FOLLOW_2); 
             after(grammarAccess.getInertialAccess().getOriginKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group_2__0__Impl"


    // $ANTLR start "rule__Inertial__Group_2__1"
    // InternalKinematicsParser.g:6012:1: rule__Inertial__Group_2__1 : rule__Inertial__Group_2__1__Impl ;
    public final void rule__Inertial__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6016:1: ( rule__Inertial__Group_2__1__Impl )
            // InternalKinematicsParser.g:6017:2: rule__Inertial__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group_2__1"


    // $ANTLR start "rule__Inertial__Group_2__1__Impl"
    // InternalKinematicsParser.g:6023:1: rule__Inertial__Group_2__1__Impl : ( ( rule__Inertial__OriginAssignment_2_1 ) ) ;
    public final void rule__Inertial__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6027:1: ( ( ( rule__Inertial__OriginAssignment_2_1 ) ) )
            // InternalKinematicsParser.g:6028:1: ( ( rule__Inertial__OriginAssignment_2_1 ) )
            {
            // InternalKinematicsParser.g:6028:1: ( ( rule__Inertial__OriginAssignment_2_1 ) )
            // InternalKinematicsParser.g:6029:2: ( rule__Inertial__OriginAssignment_2_1 )
            {
             before(grammarAccess.getInertialAccess().getOriginAssignment_2_1()); 
            // InternalKinematicsParser.g:6030:2: ( rule__Inertial__OriginAssignment_2_1 )
            // InternalKinematicsParser.g:6030:3: rule__Inertial__OriginAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__OriginAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getOriginAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group_2__1__Impl"


    // $ANTLR start "rule__Inertial__Group_3__0"
    // InternalKinematicsParser.g:6039:1: rule__Inertial__Group_3__0 : rule__Inertial__Group_3__0__Impl rule__Inertial__Group_3__1 ;
    public final void rule__Inertial__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6043:1: ( rule__Inertial__Group_3__0__Impl rule__Inertial__Group_3__1 )
            // InternalKinematicsParser.g:6044:2: rule__Inertial__Group_3__0__Impl rule__Inertial__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Inertial__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group_3__0"


    // $ANTLR start "rule__Inertial__Group_3__0__Impl"
    // InternalKinematicsParser.g:6051:1: rule__Inertial__Group_3__0__Impl : ( Mass ) ;
    public final void rule__Inertial__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6055:1: ( ( Mass ) )
            // InternalKinematicsParser.g:6056:1: ( Mass )
            {
            // InternalKinematicsParser.g:6056:1: ( Mass )
            // InternalKinematicsParser.g:6057:2: Mass
            {
             before(grammarAccess.getInertialAccess().getMassKeyword_3_0()); 
            match(input,Mass,FOLLOW_2); 
             after(grammarAccess.getInertialAccess().getMassKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group_3__0__Impl"


    // $ANTLR start "rule__Inertial__Group_3__1"
    // InternalKinematicsParser.g:6066:1: rule__Inertial__Group_3__1 : rule__Inertial__Group_3__1__Impl ;
    public final void rule__Inertial__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6070:1: ( rule__Inertial__Group_3__1__Impl )
            // InternalKinematicsParser.g:6071:2: rule__Inertial__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group_3__1"


    // $ANTLR start "rule__Inertial__Group_3__1__Impl"
    // InternalKinematicsParser.g:6077:1: rule__Inertial__Group_3__1__Impl : ( ( rule__Inertial__MassAssignment_3_1 ) ) ;
    public final void rule__Inertial__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6081:1: ( ( ( rule__Inertial__MassAssignment_3_1 ) ) )
            // InternalKinematicsParser.g:6082:1: ( ( rule__Inertial__MassAssignment_3_1 ) )
            {
            // InternalKinematicsParser.g:6082:1: ( ( rule__Inertial__MassAssignment_3_1 ) )
            // InternalKinematicsParser.g:6083:2: ( rule__Inertial__MassAssignment_3_1 )
            {
             before(grammarAccess.getInertialAccess().getMassAssignment_3_1()); 
            // InternalKinematicsParser.g:6084:2: ( rule__Inertial__MassAssignment_3_1 )
            // InternalKinematicsParser.g:6084:3: rule__Inertial__MassAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__MassAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getMassAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group_3__1__Impl"


    // $ANTLR start "rule__Inertial__Group_4__0"
    // InternalKinematicsParser.g:6093:1: rule__Inertial__Group_4__0 : rule__Inertial__Group_4__0__Impl rule__Inertial__Group_4__1 ;
    public final void rule__Inertial__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6097:1: ( rule__Inertial__Group_4__0__Impl rule__Inertial__Group_4__1 )
            // InternalKinematicsParser.g:6098:2: rule__Inertial__Group_4__0__Impl rule__Inertial__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Inertial__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group_4__0"


    // $ANTLR start "rule__Inertial__Group_4__0__Impl"
    // InternalKinematicsParser.g:6105:1: rule__Inertial__Group_4__0__Impl : ( Inertia ) ;
    public final void rule__Inertial__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6109:1: ( ( Inertia ) )
            // InternalKinematicsParser.g:6110:1: ( Inertia )
            {
            // InternalKinematicsParser.g:6110:1: ( Inertia )
            // InternalKinematicsParser.g:6111:2: Inertia
            {
             before(grammarAccess.getInertialAccess().getInertiaKeyword_4_0()); 
            match(input,Inertia,FOLLOW_2); 
             after(grammarAccess.getInertialAccess().getInertiaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group_4__0__Impl"


    // $ANTLR start "rule__Inertial__Group_4__1"
    // InternalKinematicsParser.g:6120:1: rule__Inertial__Group_4__1 : rule__Inertial__Group_4__1__Impl ;
    public final void rule__Inertial__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6124:1: ( rule__Inertial__Group_4__1__Impl )
            // InternalKinematicsParser.g:6125:2: rule__Inertial__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group_4__1"


    // $ANTLR start "rule__Inertial__Group_4__1__Impl"
    // InternalKinematicsParser.g:6131:1: rule__Inertial__Group_4__1__Impl : ( ( rule__Inertial__InertiaAssignment_4_1 ) ) ;
    public final void rule__Inertial__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6135:1: ( ( ( rule__Inertial__InertiaAssignment_4_1 ) ) )
            // InternalKinematicsParser.g:6136:1: ( ( rule__Inertial__InertiaAssignment_4_1 ) )
            {
            // InternalKinematicsParser.g:6136:1: ( ( rule__Inertial__InertiaAssignment_4_1 ) )
            // InternalKinematicsParser.g:6137:2: ( rule__Inertial__InertiaAssignment_4_1 )
            {
             before(grammarAccess.getInertialAccess().getInertiaAssignment_4_1()); 
            // InternalKinematicsParser.g:6138:2: ( rule__Inertial__InertiaAssignment_4_1 )
            // InternalKinematicsParser.g:6138:3: rule__Inertial__InertiaAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__InertiaAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getInertiaAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group_4__1__Impl"


    // $ANTLR start "rule__Visual__Group__0"
    // InternalKinematicsParser.g:6147:1: rule__Visual__Group__0 : rule__Visual__Group__0__Impl rule__Visual__Group__1 ;
    public final void rule__Visual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6151:1: ( rule__Visual__Group__0__Impl rule__Visual__Group__1 )
            // InternalKinematicsParser.g:6152:2: rule__Visual__Group__0__Impl rule__Visual__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__Visual__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__0"


    // $ANTLR start "rule__Visual__Group__0__Impl"
    // InternalKinematicsParser.g:6159:1: rule__Visual__Group__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Visual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6163:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:6164:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:6164:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:6165:2: RULE_BEGIN
            {
             before(grammarAccess.getVisualAccess().getBEGINTerminalRuleCall_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getBEGINTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__0__Impl"


    // $ANTLR start "rule__Visual__Group__1"
    // InternalKinematicsParser.g:6174:1: rule__Visual__Group__1 : rule__Visual__Group__1__Impl rule__Visual__Group__2 ;
    public final void rule__Visual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6178:1: ( rule__Visual__Group__1__Impl rule__Visual__Group__2 )
            // InternalKinematicsParser.g:6179:2: rule__Visual__Group__1__Impl rule__Visual__Group__2
            {
            pushFollow(FOLLOW_51);
            rule__Visual__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__1"


    // $ANTLR start "rule__Visual__Group__1__Impl"
    // InternalKinematicsParser.g:6186:1: rule__Visual__Group__1__Impl : ( ( rule__Visual__Group_1__0 )? ) ;
    public final void rule__Visual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6190:1: ( ( ( rule__Visual__Group_1__0 )? ) )
            // InternalKinematicsParser.g:6191:1: ( ( rule__Visual__Group_1__0 )? )
            {
            // InternalKinematicsParser.g:6191:1: ( ( rule__Visual__Group_1__0 )? )
            // InternalKinematicsParser.g:6192:2: ( rule__Visual__Group_1__0 )?
            {
             before(grammarAccess.getVisualAccess().getGroup_1()); 
            // InternalKinematicsParser.g:6193:2: ( rule__Visual__Group_1__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Origin) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalKinematicsParser.g:6193:3: rule__Visual__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Visual__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVisualAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__1__Impl"


    // $ANTLR start "rule__Visual__Group__2"
    // InternalKinematicsParser.g:6201:1: rule__Visual__Group__2 : rule__Visual__Group__2__Impl rule__Visual__Group__3 ;
    public final void rule__Visual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6205:1: ( rule__Visual__Group__2__Impl rule__Visual__Group__3 )
            // InternalKinematicsParser.g:6206:2: rule__Visual__Group__2__Impl rule__Visual__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Visual__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__2"


    // $ANTLR start "rule__Visual__Group__2__Impl"
    // InternalKinematicsParser.g:6213:1: rule__Visual__Group__2__Impl : ( Geometry ) ;
    public final void rule__Visual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6217:1: ( ( Geometry ) )
            // InternalKinematicsParser.g:6218:1: ( Geometry )
            {
            // InternalKinematicsParser.g:6218:1: ( Geometry )
            // InternalKinematicsParser.g:6219:2: Geometry
            {
             before(grammarAccess.getVisualAccess().getGeometryKeyword_2()); 
            match(input,Geometry,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getGeometryKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__2__Impl"


    // $ANTLR start "rule__Visual__Group__3"
    // InternalKinematicsParser.g:6228:1: rule__Visual__Group__3 : rule__Visual__Group__3__Impl rule__Visual__Group__4 ;
    public final void rule__Visual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6232:1: ( rule__Visual__Group__3__Impl rule__Visual__Group__4 )
            // InternalKinematicsParser.g:6233:2: rule__Visual__Group__3__Impl rule__Visual__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Visual__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__3"


    // $ANTLR start "rule__Visual__Group__3__Impl"
    // InternalKinematicsParser.g:6240:1: rule__Visual__Group__3__Impl : ( ( rule__Visual__GeometryAssignment_3 ) ) ;
    public final void rule__Visual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6244:1: ( ( ( rule__Visual__GeometryAssignment_3 ) ) )
            // InternalKinematicsParser.g:6245:1: ( ( rule__Visual__GeometryAssignment_3 ) )
            {
            // InternalKinematicsParser.g:6245:1: ( ( rule__Visual__GeometryAssignment_3 ) )
            // InternalKinematicsParser.g:6246:2: ( rule__Visual__GeometryAssignment_3 )
            {
             before(grammarAccess.getVisualAccess().getGeometryAssignment_3()); 
            // InternalKinematicsParser.g:6247:2: ( rule__Visual__GeometryAssignment_3 )
            // InternalKinematicsParser.g:6247:3: rule__Visual__GeometryAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Visual__GeometryAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVisualAccess().getGeometryAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__3__Impl"


    // $ANTLR start "rule__Visual__Group__4"
    // InternalKinematicsParser.g:6255:1: rule__Visual__Group__4 : rule__Visual__Group__4__Impl ;
    public final void rule__Visual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6259:1: ( rule__Visual__Group__4__Impl )
            // InternalKinematicsParser.g:6260:2: rule__Visual__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Visual__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__4"


    // $ANTLR start "rule__Visual__Group__4__Impl"
    // InternalKinematicsParser.g:6266:1: rule__Visual__Group__4__Impl : ( RULE_END ) ;
    public final void rule__Visual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6270:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:6271:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:6271:1: ( RULE_END )
            // InternalKinematicsParser.g:6272:2: RULE_END
            {
             before(grammarAccess.getVisualAccess().getENDTerminalRuleCall_4()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getENDTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__4__Impl"


    // $ANTLR start "rule__Visual__Group_1__0"
    // InternalKinematicsParser.g:6282:1: rule__Visual__Group_1__0 : rule__Visual__Group_1__0__Impl rule__Visual__Group_1__1 ;
    public final void rule__Visual__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6286:1: ( rule__Visual__Group_1__0__Impl rule__Visual__Group_1__1 )
            // InternalKinematicsParser.g:6287:2: rule__Visual__Group_1__0__Impl rule__Visual__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Visual__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group_1__0"


    // $ANTLR start "rule__Visual__Group_1__0__Impl"
    // InternalKinematicsParser.g:6294:1: rule__Visual__Group_1__0__Impl : ( Origin ) ;
    public final void rule__Visual__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6298:1: ( ( Origin ) )
            // InternalKinematicsParser.g:6299:1: ( Origin )
            {
            // InternalKinematicsParser.g:6299:1: ( Origin )
            // InternalKinematicsParser.g:6300:2: Origin
            {
             before(grammarAccess.getVisualAccess().getOriginKeyword_1_0()); 
            match(input,Origin,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getOriginKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group_1__0__Impl"


    // $ANTLR start "rule__Visual__Group_1__1"
    // InternalKinematicsParser.g:6309:1: rule__Visual__Group_1__1 : rule__Visual__Group_1__1__Impl ;
    public final void rule__Visual__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6313:1: ( rule__Visual__Group_1__1__Impl )
            // InternalKinematicsParser.g:6314:2: rule__Visual__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Visual__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group_1__1"


    // $ANTLR start "rule__Visual__Group_1__1__Impl"
    // InternalKinematicsParser.g:6320:1: rule__Visual__Group_1__1__Impl : ( ( rule__Visual__OriginAssignment_1_1 ) ) ;
    public final void rule__Visual__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6324:1: ( ( ( rule__Visual__OriginAssignment_1_1 ) ) )
            // InternalKinematicsParser.g:6325:1: ( ( rule__Visual__OriginAssignment_1_1 ) )
            {
            // InternalKinematicsParser.g:6325:1: ( ( rule__Visual__OriginAssignment_1_1 ) )
            // InternalKinematicsParser.g:6326:2: ( rule__Visual__OriginAssignment_1_1 )
            {
             before(grammarAccess.getVisualAccess().getOriginAssignment_1_1()); 
            // InternalKinematicsParser.g:6327:2: ( rule__Visual__OriginAssignment_1_1 )
            // InternalKinematicsParser.g:6327:3: rule__Visual__OriginAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Visual__OriginAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVisualAccess().getOriginAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group_1__1__Impl"


    // $ANTLR start "rule__Collision__Group__0"
    // InternalKinematicsParser.g:6336:1: rule__Collision__Group__0 : rule__Collision__Group__0__Impl rule__Collision__Group__1 ;
    public final void rule__Collision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6340:1: ( rule__Collision__Group__0__Impl rule__Collision__Group__1 )
            // InternalKinematicsParser.g:6341:2: rule__Collision__Group__0__Impl rule__Collision__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__Collision__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__0"


    // $ANTLR start "rule__Collision__Group__0__Impl"
    // InternalKinematicsParser.g:6348:1: rule__Collision__Group__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Collision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6352:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:6353:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:6353:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:6354:2: RULE_BEGIN
            {
             before(grammarAccess.getCollisionAccess().getBEGINTerminalRuleCall_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getBEGINTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__0__Impl"


    // $ANTLR start "rule__Collision__Group__1"
    // InternalKinematicsParser.g:6363:1: rule__Collision__Group__1 : rule__Collision__Group__1__Impl rule__Collision__Group__2 ;
    public final void rule__Collision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6367:1: ( rule__Collision__Group__1__Impl rule__Collision__Group__2 )
            // InternalKinematicsParser.g:6368:2: rule__Collision__Group__1__Impl rule__Collision__Group__2
            {
            pushFollow(FOLLOW_51);
            rule__Collision__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__1"


    // $ANTLR start "rule__Collision__Group__1__Impl"
    // InternalKinematicsParser.g:6375:1: rule__Collision__Group__1__Impl : ( ( rule__Collision__Group_1__0 )? ) ;
    public final void rule__Collision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6379:1: ( ( ( rule__Collision__Group_1__0 )? ) )
            // InternalKinematicsParser.g:6380:1: ( ( rule__Collision__Group_1__0 )? )
            {
            // InternalKinematicsParser.g:6380:1: ( ( rule__Collision__Group_1__0 )? )
            // InternalKinematicsParser.g:6381:2: ( rule__Collision__Group_1__0 )?
            {
             before(grammarAccess.getCollisionAccess().getGroup_1()); 
            // InternalKinematicsParser.g:6382:2: ( rule__Collision__Group_1__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==Origin) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalKinematicsParser.g:6382:3: rule__Collision__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Collision__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollisionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__1__Impl"


    // $ANTLR start "rule__Collision__Group__2"
    // InternalKinematicsParser.g:6390:1: rule__Collision__Group__2 : rule__Collision__Group__2__Impl rule__Collision__Group__3 ;
    public final void rule__Collision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6394:1: ( rule__Collision__Group__2__Impl rule__Collision__Group__3 )
            // InternalKinematicsParser.g:6395:2: rule__Collision__Group__2__Impl rule__Collision__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Collision__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__2"


    // $ANTLR start "rule__Collision__Group__2__Impl"
    // InternalKinematicsParser.g:6402:1: rule__Collision__Group__2__Impl : ( Geometry ) ;
    public final void rule__Collision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6406:1: ( ( Geometry ) )
            // InternalKinematicsParser.g:6407:1: ( Geometry )
            {
            // InternalKinematicsParser.g:6407:1: ( Geometry )
            // InternalKinematicsParser.g:6408:2: Geometry
            {
             before(grammarAccess.getCollisionAccess().getGeometryKeyword_2()); 
            match(input,Geometry,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getGeometryKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__2__Impl"


    // $ANTLR start "rule__Collision__Group__3"
    // InternalKinematicsParser.g:6417:1: rule__Collision__Group__3 : rule__Collision__Group__3__Impl rule__Collision__Group__4 ;
    public final void rule__Collision__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6421:1: ( rule__Collision__Group__3__Impl rule__Collision__Group__4 )
            // InternalKinematicsParser.g:6422:2: rule__Collision__Group__3__Impl rule__Collision__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Collision__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__3"


    // $ANTLR start "rule__Collision__Group__3__Impl"
    // InternalKinematicsParser.g:6429:1: rule__Collision__Group__3__Impl : ( ( rule__Collision__GeometryAssignment_3 ) ) ;
    public final void rule__Collision__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6433:1: ( ( ( rule__Collision__GeometryAssignment_3 ) ) )
            // InternalKinematicsParser.g:6434:1: ( ( rule__Collision__GeometryAssignment_3 ) )
            {
            // InternalKinematicsParser.g:6434:1: ( ( rule__Collision__GeometryAssignment_3 ) )
            // InternalKinematicsParser.g:6435:2: ( rule__Collision__GeometryAssignment_3 )
            {
             before(grammarAccess.getCollisionAccess().getGeometryAssignment_3()); 
            // InternalKinematicsParser.g:6436:2: ( rule__Collision__GeometryAssignment_3 )
            // InternalKinematicsParser.g:6436:3: rule__Collision__GeometryAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Collision__GeometryAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getGeometryAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__3__Impl"


    // $ANTLR start "rule__Collision__Group__4"
    // InternalKinematicsParser.g:6444:1: rule__Collision__Group__4 : rule__Collision__Group__4__Impl ;
    public final void rule__Collision__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6448:1: ( rule__Collision__Group__4__Impl )
            // InternalKinematicsParser.g:6449:2: rule__Collision__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collision__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__4"


    // $ANTLR start "rule__Collision__Group__4__Impl"
    // InternalKinematicsParser.g:6455:1: rule__Collision__Group__4__Impl : ( RULE_END ) ;
    public final void rule__Collision__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6459:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:6460:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:6460:1: ( RULE_END )
            // InternalKinematicsParser.g:6461:2: RULE_END
            {
             before(grammarAccess.getCollisionAccess().getENDTerminalRuleCall_4()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getENDTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__4__Impl"


    // $ANTLR start "rule__Collision__Group_1__0"
    // InternalKinematicsParser.g:6471:1: rule__Collision__Group_1__0 : rule__Collision__Group_1__0__Impl rule__Collision__Group_1__1 ;
    public final void rule__Collision__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6475:1: ( rule__Collision__Group_1__0__Impl rule__Collision__Group_1__1 )
            // InternalKinematicsParser.g:6476:2: rule__Collision__Group_1__0__Impl rule__Collision__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Collision__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group_1__0"


    // $ANTLR start "rule__Collision__Group_1__0__Impl"
    // InternalKinematicsParser.g:6483:1: rule__Collision__Group_1__0__Impl : ( Origin ) ;
    public final void rule__Collision__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6487:1: ( ( Origin ) )
            // InternalKinematicsParser.g:6488:1: ( Origin )
            {
            // InternalKinematicsParser.g:6488:1: ( Origin )
            // InternalKinematicsParser.g:6489:2: Origin
            {
             before(grammarAccess.getCollisionAccess().getOriginKeyword_1_0()); 
            match(input,Origin,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getOriginKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group_1__0__Impl"


    // $ANTLR start "rule__Collision__Group_1__1"
    // InternalKinematicsParser.g:6498:1: rule__Collision__Group_1__1 : rule__Collision__Group_1__1__Impl ;
    public final void rule__Collision__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6502:1: ( rule__Collision__Group_1__1__Impl )
            // InternalKinematicsParser.g:6503:2: rule__Collision__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collision__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group_1__1"


    // $ANTLR start "rule__Collision__Group_1__1__Impl"
    // InternalKinematicsParser.g:6509:1: rule__Collision__Group_1__1__Impl : ( ( rule__Collision__OriginAssignment_1_1 ) ) ;
    public final void rule__Collision__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6513:1: ( ( ( rule__Collision__OriginAssignment_1_1 ) ) )
            // InternalKinematicsParser.g:6514:1: ( ( rule__Collision__OriginAssignment_1_1 ) )
            {
            // InternalKinematicsParser.g:6514:1: ( ( rule__Collision__OriginAssignment_1_1 ) )
            // InternalKinematicsParser.g:6515:2: ( rule__Collision__OriginAssignment_1_1 )
            {
             before(grammarAccess.getCollisionAccess().getOriginAssignment_1_1()); 
            // InternalKinematicsParser.g:6516:2: ( rule__Collision__OriginAssignment_1_1 )
            // InternalKinematicsParser.g:6516:3: rule__Collision__OriginAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Collision__OriginAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getOriginAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group_1__1__Impl"


    // $ANTLR start "rule__Mass__Group__0"
    // InternalKinematicsParser.g:6525:1: rule__Mass__Group__0 : rule__Mass__Group__0__Impl rule__Mass__Group__1 ;
    public final void rule__Mass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6529:1: ( rule__Mass__Group__0__Impl rule__Mass__Group__1 )
            // InternalKinematicsParser.g:6530:2: rule__Mass__Group__0__Impl rule__Mass__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Mass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__0"


    // $ANTLR start "rule__Mass__Group__0__Impl"
    // InternalKinematicsParser.g:6537:1: rule__Mass__Group__0__Impl : ( () ) ;
    public final void rule__Mass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6541:1: ( ( () ) )
            // InternalKinematicsParser.g:6542:1: ( () )
            {
            // InternalKinematicsParser.g:6542:1: ( () )
            // InternalKinematicsParser.g:6543:2: ()
            {
             before(grammarAccess.getMassAccess().getMassAction_0()); 
            // InternalKinematicsParser.g:6544:2: ()
            // InternalKinematicsParser.g:6544:3: 
            {
            }

             after(grammarAccess.getMassAccess().getMassAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__0__Impl"


    // $ANTLR start "rule__Mass__Group__1"
    // InternalKinematicsParser.g:6552:1: rule__Mass__Group__1 : rule__Mass__Group__1__Impl rule__Mass__Group__2 ;
    public final void rule__Mass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6556:1: ( rule__Mass__Group__1__Impl rule__Mass__Group__2 )
            // InternalKinematicsParser.g:6557:2: rule__Mass__Group__1__Impl rule__Mass__Group__2
            {
            pushFollow(FOLLOW_52);
            rule__Mass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__1"


    // $ANTLR start "rule__Mass__Group__1__Impl"
    // InternalKinematicsParser.g:6564:1: rule__Mass__Group__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Mass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6568:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:6569:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:6569:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:6570:2: RULE_BEGIN
            {
             before(grammarAccess.getMassAccess().getBEGINTerminalRuleCall_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getBEGINTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__1__Impl"


    // $ANTLR start "rule__Mass__Group__2"
    // InternalKinematicsParser.g:6579:1: rule__Mass__Group__2 : rule__Mass__Group__2__Impl rule__Mass__Group__3 ;
    public final void rule__Mass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6583:1: ( rule__Mass__Group__2__Impl rule__Mass__Group__3 )
            // InternalKinematicsParser.g:6584:2: rule__Mass__Group__2__Impl rule__Mass__Group__3
            {
            pushFollow(FOLLOW_45);
            rule__Mass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__2"


    // $ANTLR start "rule__Mass__Group__2__Impl"
    // InternalKinematicsParser.g:6591:1: rule__Mass__Group__2__Impl : ( Value ) ;
    public final void rule__Mass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6595:1: ( ( Value ) )
            // InternalKinematicsParser.g:6596:1: ( Value )
            {
            // InternalKinematicsParser.g:6596:1: ( Value )
            // InternalKinematicsParser.g:6597:2: Value
            {
             before(grammarAccess.getMassAccess().getValueKeyword_2()); 
            match(input,Value,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getValueKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__2__Impl"


    // $ANTLR start "rule__Mass__Group__3"
    // InternalKinematicsParser.g:6606:1: rule__Mass__Group__3 : rule__Mass__Group__3__Impl rule__Mass__Group__4 ;
    public final void rule__Mass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6610:1: ( rule__Mass__Group__3__Impl rule__Mass__Group__4 )
            // InternalKinematicsParser.g:6611:2: rule__Mass__Group__3__Impl rule__Mass__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Mass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mass__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__3"


    // $ANTLR start "rule__Mass__Group__3__Impl"
    // InternalKinematicsParser.g:6618:1: rule__Mass__Group__3__Impl : ( ( rule__Mass__ValueAssignment_3 ) ) ;
    public final void rule__Mass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6622:1: ( ( ( rule__Mass__ValueAssignment_3 ) ) )
            // InternalKinematicsParser.g:6623:1: ( ( rule__Mass__ValueAssignment_3 ) )
            {
            // InternalKinematicsParser.g:6623:1: ( ( rule__Mass__ValueAssignment_3 ) )
            // InternalKinematicsParser.g:6624:2: ( rule__Mass__ValueAssignment_3 )
            {
             before(grammarAccess.getMassAccess().getValueAssignment_3()); 
            // InternalKinematicsParser.g:6625:2: ( rule__Mass__ValueAssignment_3 )
            // InternalKinematicsParser.g:6625:3: rule__Mass__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Mass__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMassAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__3__Impl"


    // $ANTLR start "rule__Mass__Group__4"
    // InternalKinematicsParser.g:6633:1: rule__Mass__Group__4 : rule__Mass__Group__4__Impl ;
    public final void rule__Mass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6637:1: ( rule__Mass__Group__4__Impl )
            // InternalKinematicsParser.g:6638:2: rule__Mass__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mass__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__4"


    // $ANTLR start "rule__Mass__Group__4__Impl"
    // InternalKinematicsParser.g:6644:1: rule__Mass__Group__4__Impl : ( RULE_END ) ;
    public final void rule__Mass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6648:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:6649:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:6649:1: ( RULE_END )
            // InternalKinematicsParser.g:6650:2: RULE_END
            {
             before(grammarAccess.getMassAccess().getENDTerminalRuleCall_4()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getENDTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__4__Impl"


    // $ANTLR start "rule__Inertia__Group__0"
    // InternalKinematicsParser.g:6660:1: rule__Inertia__Group__0 : rule__Inertia__Group__0__Impl rule__Inertia__Group__1 ;
    public final void rule__Inertia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6664:1: ( rule__Inertia__Group__0__Impl rule__Inertia__Group__1 )
            // InternalKinematicsParser.g:6665:2: rule__Inertia__Group__0__Impl rule__Inertia__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Inertia__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__0"


    // $ANTLR start "rule__Inertia__Group__0__Impl"
    // InternalKinematicsParser.g:6672:1: rule__Inertia__Group__0__Impl : ( () ) ;
    public final void rule__Inertia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6676:1: ( ( () ) )
            // InternalKinematicsParser.g:6677:1: ( () )
            {
            // InternalKinematicsParser.g:6677:1: ( () )
            // InternalKinematicsParser.g:6678:2: ()
            {
             before(grammarAccess.getInertiaAccess().getInertiaAction_0()); 
            // InternalKinematicsParser.g:6679:2: ()
            // InternalKinematicsParser.g:6679:3: 
            {
            }

             after(grammarAccess.getInertiaAccess().getInertiaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__0__Impl"


    // $ANTLR start "rule__Inertia__Group__1"
    // InternalKinematicsParser.g:6687:1: rule__Inertia__Group__1 : rule__Inertia__Group__1__Impl rule__Inertia__Group__2 ;
    public final void rule__Inertia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6691:1: ( rule__Inertia__Group__1__Impl rule__Inertia__Group__2 )
            // InternalKinematicsParser.g:6692:2: rule__Inertia__Group__1__Impl rule__Inertia__Group__2
            {
            pushFollow(FOLLOW_53);
            rule__Inertia__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__1"


    // $ANTLR start "rule__Inertia__Group__1__Impl"
    // InternalKinematicsParser.g:6699:1: rule__Inertia__Group__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Inertia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6703:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:6704:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:6704:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:6705:2: RULE_BEGIN
            {
             before(grammarAccess.getInertiaAccess().getBEGINTerminalRuleCall_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getBEGINTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__1__Impl"


    // $ANTLR start "rule__Inertia__Group__2"
    // InternalKinematicsParser.g:6714:1: rule__Inertia__Group__2 : rule__Inertia__Group__2__Impl rule__Inertia__Group__3 ;
    public final void rule__Inertia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6718:1: ( rule__Inertia__Group__2__Impl rule__Inertia__Group__3 )
            // InternalKinematicsParser.g:6719:2: rule__Inertia__Group__2__Impl rule__Inertia__Group__3
            {
            pushFollow(FOLLOW_53);
            rule__Inertia__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__2"


    // $ANTLR start "rule__Inertia__Group__2__Impl"
    // InternalKinematicsParser.g:6726:1: rule__Inertia__Group__2__Impl : ( ( rule__Inertia__Group_2__0 )? ) ;
    public final void rule__Inertia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6730:1: ( ( ( rule__Inertia__Group_2__0 )? ) )
            // InternalKinematicsParser.g:6731:1: ( ( rule__Inertia__Group_2__0 )? )
            {
            // InternalKinematicsParser.g:6731:1: ( ( rule__Inertia__Group_2__0 )? )
            // InternalKinematicsParser.g:6732:2: ( rule__Inertia__Group_2__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_2()); 
            // InternalKinematicsParser.g:6733:2: ( rule__Inertia__Group_2__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Ixx) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalKinematicsParser.g:6733:3: rule__Inertia__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inertia__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInertiaAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__2__Impl"


    // $ANTLR start "rule__Inertia__Group__3"
    // InternalKinematicsParser.g:6741:1: rule__Inertia__Group__3 : rule__Inertia__Group__3__Impl rule__Inertia__Group__4 ;
    public final void rule__Inertia__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6745:1: ( rule__Inertia__Group__3__Impl rule__Inertia__Group__4 )
            // InternalKinematicsParser.g:6746:2: rule__Inertia__Group__3__Impl rule__Inertia__Group__4
            {
            pushFollow(FOLLOW_53);
            rule__Inertia__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__3"


    // $ANTLR start "rule__Inertia__Group__3__Impl"
    // InternalKinematicsParser.g:6753:1: rule__Inertia__Group__3__Impl : ( ( rule__Inertia__Group_3__0 )? ) ;
    public final void rule__Inertia__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6757:1: ( ( ( rule__Inertia__Group_3__0 )? ) )
            // InternalKinematicsParser.g:6758:1: ( ( rule__Inertia__Group_3__0 )? )
            {
            // InternalKinematicsParser.g:6758:1: ( ( rule__Inertia__Group_3__0 )? )
            // InternalKinematicsParser.g:6759:2: ( rule__Inertia__Group_3__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_3()); 
            // InternalKinematicsParser.g:6760:2: ( rule__Inertia__Group_3__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Ixy) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalKinematicsParser.g:6760:3: rule__Inertia__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inertia__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInertiaAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__3__Impl"


    // $ANTLR start "rule__Inertia__Group__4"
    // InternalKinematicsParser.g:6768:1: rule__Inertia__Group__4 : rule__Inertia__Group__4__Impl rule__Inertia__Group__5 ;
    public final void rule__Inertia__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6772:1: ( rule__Inertia__Group__4__Impl rule__Inertia__Group__5 )
            // InternalKinematicsParser.g:6773:2: rule__Inertia__Group__4__Impl rule__Inertia__Group__5
            {
            pushFollow(FOLLOW_53);
            rule__Inertia__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__4"


    // $ANTLR start "rule__Inertia__Group__4__Impl"
    // InternalKinematicsParser.g:6780:1: rule__Inertia__Group__4__Impl : ( ( rule__Inertia__Group_4__0 )? ) ;
    public final void rule__Inertia__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6784:1: ( ( ( rule__Inertia__Group_4__0 )? ) )
            // InternalKinematicsParser.g:6785:1: ( ( rule__Inertia__Group_4__0 )? )
            {
            // InternalKinematicsParser.g:6785:1: ( ( rule__Inertia__Group_4__0 )? )
            // InternalKinematicsParser.g:6786:2: ( rule__Inertia__Group_4__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_4()); 
            // InternalKinematicsParser.g:6787:2: ( rule__Inertia__Group_4__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==Ixz) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalKinematicsParser.g:6787:3: rule__Inertia__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inertia__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInertiaAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__4__Impl"


    // $ANTLR start "rule__Inertia__Group__5"
    // InternalKinematicsParser.g:6795:1: rule__Inertia__Group__5 : rule__Inertia__Group__5__Impl rule__Inertia__Group__6 ;
    public final void rule__Inertia__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6799:1: ( rule__Inertia__Group__5__Impl rule__Inertia__Group__6 )
            // InternalKinematicsParser.g:6800:2: rule__Inertia__Group__5__Impl rule__Inertia__Group__6
            {
            pushFollow(FOLLOW_53);
            rule__Inertia__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__5"


    // $ANTLR start "rule__Inertia__Group__5__Impl"
    // InternalKinematicsParser.g:6807:1: rule__Inertia__Group__5__Impl : ( ( rule__Inertia__Group_5__0 )? ) ;
    public final void rule__Inertia__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6811:1: ( ( ( rule__Inertia__Group_5__0 )? ) )
            // InternalKinematicsParser.g:6812:1: ( ( rule__Inertia__Group_5__0 )? )
            {
            // InternalKinematicsParser.g:6812:1: ( ( rule__Inertia__Group_5__0 )? )
            // InternalKinematicsParser.g:6813:2: ( rule__Inertia__Group_5__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_5()); 
            // InternalKinematicsParser.g:6814:2: ( rule__Inertia__Group_5__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==Iyy) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalKinematicsParser.g:6814:3: rule__Inertia__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inertia__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInertiaAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__5__Impl"


    // $ANTLR start "rule__Inertia__Group__6"
    // InternalKinematicsParser.g:6822:1: rule__Inertia__Group__6 : rule__Inertia__Group__6__Impl rule__Inertia__Group__7 ;
    public final void rule__Inertia__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6826:1: ( rule__Inertia__Group__6__Impl rule__Inertia__Group__7 )
            // InternalKinematicsParser.g:6827:2: rule__Inertia__Group__6__Impl rule__Inertia__Group__7
            {
            pushFollow(FOLLOW_53);
            rule__Inertia__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__6"


    // $ANTLR start "rule__Inertia__Group__6__Impl"
    // InternalKinematicsParser.g:6834:1: rule__Inertia__Group__6__Impl : ( ( rule__Inertia__Group_6__0 )? ) ;
    public final void rule__Inertia__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6838:1: ( ( ( rule__Inertia__Group_6__0 )? ) )
            // InternalKinematicsParser.g:6839:1: ( ( rule__Inertia__Group_6__0 )? )
            {
            // InternalKinematicsParser.g:6839:1: ( ( rule__Inertia__Group_6__0 )? )
            // InternalKinematicsParser.g:6840:2: ( rule__Inertia__Group_6__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_6()); 
            // InternalKinematicsParser.g:6841:2: ( rule__Inertia__Group_6__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==Iyz) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalKinematicsParser.g:6841:3: rule__Inertia__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inertia__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInertiaAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__6__Impl"


    // $ANTLR start "rule__Inertia__Group__7"
    // InternalKinematicsParser.g:6849:1: rule__Inertia__Group__7 : rule__Inertia__Group__7__Impl rule__Inertia__Group__8 ;
    public final void rule__Inertia__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6853:1: ( rule__Inertia__Group__7__Impl rule__Inertia__Group__8 )
            // InternalKinematicsParser.g:6854:2: rule__Inertia__Group__7__Impl rule__Inertia__Group__8
            {
            pushFollow(FOLLOW_53);
            rule__Inertia__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__7"


    // $ANTLR start "rule__Inertia__Group__7__Impl"
    // InternalKinematicsParser.g:6861:1: rule__Inertia__Group__7__Impl : ( ( rule__Inertia__Group_7__0 )? ) ;
    public final void rule__Inertia__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6865:1: ( ( ( rule__Inertia__Group_7__0 )? ) )
            // InternalKinematicsParser.g:6866:1: ( ( rule__Inertia__Group_7__0 )? )
            {
            // InternalKinematicsParser.g:6866:1: ( ( rule__Inertia__Group_7__0 )? )
            // InternalKinematicsParser.g:6867:2: ( rule__Inertia__Group_7__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_7()); 
            // InternalKinematicsParser.g:6868:2: ( rule__Inertia__Group_7__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==Izz) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalKinematicsParser.g:6868:3: rule__Inertia__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inertia__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInertiaAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__7__Impl"


    // $ANTLR start "rule__Inertia__Group__8"
    // InternalKinematicsParser.g:6876:1: rule__Inertia__Group__8 : rule__Inertia__Group__8__Impl ;
    public final void rule__Inertia__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6880:1: ( rule__Inertia__Group__8__Impl )
            // InternalKinematicsParser.g:6881:2: rule__Inertia__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__8"


    // $ANTLR start "rule__Inertia__Group__8__Impl"
    // InternalKinematicsParser.g:6887:1: rule__Inertia__Group__8__Impl : ( RULE_END ) ;
    public final void rule__Inertia__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6891:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:6892:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:6892:1: ( RULE_END )
            // InternalKinematicsParser.g:6893:2: RULE_END
            {
             before(grammarAccess.getInertiaAccess().getENDTerminalRuleCall_8()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getENDTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__8__Impl"


    // $ANTLR start "rule__Inertia__Group_2__0"
    // InternalKinematicsParser.g:6903:1: rule__Inertia__Group_2__0 : rule__Inertia__Group_2__0__Impl rule__Inertia__Group_2__1 ;
    public final void rule__Inertia__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6907:1: ( rule__Inertia__Group_2__0__Impl rule__Inertia__Group_2__1 )
            // InternalKinematicsParser.g:6908:2: rule__Inertia__Group_2__0__Impl rule__Inertia__Group_2__1
            {
            pushFollow(FOLLOW_45);
            rule__Inertia__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_2__0"


    // $ANTLR start "rule__Inertia__Group_2__0__Impl"
    // InternalKinematicsParser.g:6915:1: rule__Inertia__Group_2__0__Impl : ( Ixx ) ;
    public final void rule__Inertia__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6919:1: ( ( Ixx ) )
            // InternalKinematicsParser.g:6920:1: ( Ixx )
            {
            // InternalKinematicsParser.g:6920:1: ( Ixx )
            // InternalKinematicsParser.g:6921:2: Ixx
            {
             before(grammarAccess.getInertiaAccess().getIxxKeyword_2_0()); 
            match(input,Ixx,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIxxKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_2__0__Impl"


    // $ANTLR start "rule__Inertia__Group_2__1"
    // InternalKinematicsParser.g:6930:1: rule__Inertia__Group_2__1 : rule__Inertia__Group_2__1__Impl ;
    public final void rule__Inertia__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6934:1: ( rule__Inertia__Group_2__1__Impl )
            // InternalKinematicsParser.g:6935:2: rule__Inertia__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_2__1"


    // $ANTLR start "rule__Inertia__Group_2__1__Impl"
    // InternalKinematicsParser.g:6941:1: rule__Inertia__Group_2__1__Impl : ( ( rule__Inertia__IxxAssignment_2_1 ) ) ;
    public final void rule__Inertia__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6945:1: ( ( ( rule__Inertia__IxxAssignment_2_1 ) ) )
            // InternalKinematicsParser.g:6946:1: ( ( rule__Inertia__IxxAssignment_2_1 ) )
            {
            // InternalKinematicsParser.g:6946:1: ( ( rule__Inertia__IxxAssignment_2_1 ) )
            // InternalKinematicsParser.g:6947:2: ( rule__Inertia__IxxAssignment_2_1 )
            {
             before(grammarAccess.getInertiaAccess().getIxxAssignment_2_1()); 
            // InternalKinematicsParser.g:6948:2: ( rule__Inertia__IxxAssignment_2_1 )
            // InternalKinematicsParser.g:6948:3: rule__Inertia__IxxAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IxxAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIxxAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_2__1__Impl"


    // $ANTLR start "rule__Inertia__Group_3__0"
    // InternalKinematicsParser.g:6957:1: rule__Inertia__Group_3__0 : rule__Inertia__Group_3__0__Impl rule__Inertia__Group_3__1 ;
    public final void rule__Inertia__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6961:1: ( rule__Inertia__Group_3__0__Impl rule__Inertia__Group_3__1 )
            // InternalKinematicsParser.g:6962:2: rule__Inertia__Group_3__0__Impl rule__Inertia__Group_3__1
            {
            pushFollow(FOLLOW_45);
            rule__Inertia__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_3__0"


    // $ANTLR start "rule__Inertia__Group_3__0__Impl"
    // InternalKinematicsParser.g:6969:1: rule__Inertia__Group_3__0__Impl : ( Ixy ) ;
    public final void rule__Inertia__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6973:1: ( ( Ixy ) )
            // InternalKinematicsParser.g:6974:1: ( Ixy )
            {
            // InternalKinematicsParser.g:6974:1: ( Ixy )
            // InternalKinematicsParser.g:6975:2: Ixy
            {
             before(grammarAccess.getInertiaAccess().getIxyKeyword_3_0()); 
            match(input,Ixy,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIxyKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_3__0__Impl"


    // $ANTLR start "rule__Inertia__Group_3__1"
    // InternalKinematicsParser.g:6984:1: rule__Inertia__Group_3__1 : rule__Inertia__Group_3__1__Impl ;
    public final void rule__Inertia__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6988:1: ( rule__Inertia__Group_3__1__Impl )
            // InternalKinematicsParser.g:6989:2: rule__Inertia__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_3__1"


    // $ANTLR start "rule__Inertia__Group_3__1__Impl"
    // InternalKinematicsParser.g:6995:1: rule__Inertia__Group_3__1__Impl : ( ( rule__Inertia__IxyAssignment_3_1 ) ) ;
    public final void rule__Inertia__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6999:1: ( ( ( rule__Inertia__IxyAssignment_3_1 ) ) )
            // InternalKinematicsParser.g:7000:1: ( ( rule__Inertia__IxyAssignment_3_1 ) )
            {
            // InternalKinematicsParser.g:7000:1: ( ( rule__Inertia__IxyAssignment_3_1 ) )
            // InternalKinematicsParser.g:7001:2: ( rule__Inertia__IxyAssignment_3_1 )
            {
             before(grammarAccess.getInertiaAccess().getIxyAssignment_3_1()); 
            // InternalKinematicsParser.g:7002:2: ( rule__Inertia__IxyAssignment_3_1 )
            // InternalKinematicsParser.g:7002:3: rule__Inertia__IxyAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IxyAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIxyAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_3__1__Impl"


    // $ANTLR start "rule__Inertia__Group_4__0"
    // InternalKinematicsParser.g:7011:1: rule__Inertia__Group_4__0 : rule__Inertia__Group_4__0__Impl rule__Inertia__Group_4__1 ;
    public final void rule__Inertia__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7015:1: ( rule__Inertia__Group_4__0__Impl rule__Inertia__Group_4__1 )
            // InternalKinematicsParser.g:7016:2: rule__Inertia__Group_4__0__Impl rule__Inertia__Group_4__1
            {
            pushFollow(FOLLOW_45);
            rule__Inertia__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_4__0"


    // $ANTLR start "rule__Inertia__Group_4__0__Impl"
    // InternalKinematicsParser.g:7023:1: rule__Inertia__Group_4__0__Impl : ( Ixz ) ;
    public final void rule__Inertia__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7027:1: ( ( Ixz ) )
            // InternalKinematicsParser.g:7028:1: ( Ixz )
            {
            // InternalKinematicsParser.g:7028:1: ( Ixz )
            // InternalKinematicsParser.g:7029:2: Ixz
            {
             before(grammarAccess.getInertiaAccess().getIxzKeyword_4_0()); 
            match(input,Ixz,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIxzKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_4__0__Impl"


    // $ANTLR start "rule__Inertia__Group_4__1"
    // InternalKinematicsParser.g:7038:1: rule__Inertia__Group_4__1 : rule__Inertia__Group_4__1__Impl ;
    public final void rule__Inertia__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7042:1: ( rule__Inertia__Group_4__1__Impl )
            // InternalKinematicsParser.g:7043:2: rule__Inertia__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_4__1"


    // $ANTLR start "rule__Inertia__Group_4__1__Impl"
    // InternalKinematicsParser.g:7049:1: rule__Inertia__Group_4__1__Impl : ( ( rule__Inertia__IxzAssignment_4_1 ) ) ;
    public final void rule__Inertia__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7053:1: ( ( ( rule__Inertia__IxzAssignment_4_1 ) ) )
            // InternalKinematicsParser.g:7054:1: ( ( rule__Inertia__IxzAssignment_4_1 ) )
            {
            // InternalKinematicsParser.g:7054:1: ( ( rule__Inertia__IxzAssignment_4_1 ) )
            // InternalKinematicsParser.g:7055:2: ( rule__Inertia__IxzAssignment_4_1 )
            {
             before(grammarAccess.getInertiaAccess().getIxzAssignment_4_1()); 
            // InternalKinematicsParser.g:7056:2: ( rule__Inertia__IxzAssignment_4_1 )
            // InternalKinematicsParser.g:7056:3: rule__Inertia__IxzAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IxzAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIxzAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_4__1__Impl"


    // $ANTLR start "rule__Inertia__Group_5__0"
    // InternalKinematicsParser.g:7065:1: rule__Inertia__Group_5__0 : rule__Inertia__Group_5__0__Impl rule__Inertia__Group_5__1 ;
    public final void rule__Inertia__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7069:1: ( rule__Inertia__Group_5__0__Impl rule__Inertia__Group_5__1 )
            // InternalKinematicsParser.g:7070:2: rule__Inertia__Group_5__0__Impl rule__Inertia__Group_5__1
            {
            pushFollow(FOLLOW_45);
            rule__Inertia__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_5__0"


    // $ANTLR start "rule__Inertia__Group_5__0__Impl"
    // InternalKinematicsParser.g:7077:1: rule__Inertia__Group_5__0__Impl : ( Iyy ) ;
    public final void rule__Inertia__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7081:1: ( ( Iyy ) )
            // InternalKinematicsParser.g:7082:1: ( Iyy )
            {
            // InternalKinematicsParser.g:7082:1: ( Iyy )
            // InternalKinematicsParser.g:7083:2: Iyy
            {
             before(grammarAccess.getInertiaAccess().getIyyKeyword_5_0()); 
            match(input,Iyy,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIyyKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_5__0__Impl"


    // $ANTLR start "rule__Inertia__Group_5__1"
    // InternalKinematicsParser.g:7092:1: rule__Inertia__Group_5__1 : rule__Inertia__Group_5__1__Impl ;
    public final void rule__Inertia__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7096:1: ( rule__Inertia__Group_5__1__Impl )
            // InternalKinematicsParser.g:7097:2: rule__Inertia__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_5__1"


    // $ANTLR start "rule__Inertia__Group_5__1__Impl"
    // InternalKinematicsParser.g:7103:1: rule__Inertia__Group_5__1__Impl : ( ( rule__Inertia__IyyAssignment_5_1 ) ) ;
    public final void rule__Inertia__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7107:1: ( ( ( rule__Inertia__IyyAssignment_5_1 ) ) )
            // InternalKinematicsParser.g:7108:1: ( ( rule__Inertia__IyyAssignment_5_1 ) )
            {
            // InternalKinematicsParser.g:7108:1: ( ( rule__Inertia__IyyAssignment_5_1 ) )
            // InternalKinematicsParser.g:7109:2: ( rule__Inertia__IyyAssignment_5_1 )
            {
             before(grammarAccess.getInertiaAccess().getIyyAssignment_5_1()); 
            // InternalKinematicsParser.g:7110:2: ( rule__Inertia__IyyAssignment_5_1 )
            // InternalKinematicsParser.g:7110:3: rule__Inertia__IyyAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IyyAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIyyAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_5__1__Impl"


    // $ANTLR start "rule__Inertia__Group_6__0"
    // InternalKinematicsParser.g:7119:1: rule__Inertia__Group_6__0 : rule__Inertia__Group_6__0__Impl rule__Inertia__Group_6__1 ;
    public final void rule__Inertia__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7123:1: ( rule__Inertia__Group_6__0__Impl rule__Inertia__Group_6__1 )
            // InternalKinematicsParser.g:7124:2: rule__Inertia__Group_6__0__Impl rule__Inertia__Group_6__1
            {
            pushFollow(FOLLOW_45);
            rule__Inertia__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_6__0"


    // $ANTLR start "rule__Inertia__Group_6__0__Impl"
    // InternalKinematicsParser.g:7131:1: rule__Inertia__Group_6__0__Impl : ( Iyz ) ;
    public final void rule__Inertia__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7135:1: ( ( Iyz ) )
            // InternalKinematicsParser.g:7136:1: ( Iyz )
            {
            // InternalKinematicsParser.g:7136:1: ( Iyz )
            // InternalKinematicsParser.g:7137:2: Iyz
            {
             before(grammarAccess.getInertiaAccess().getIyzKeyword_6_0()); 
            match(input,Iyz,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIyzKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_6__0__Impl"


    // $ANTLR start "rule__Inertia__Group_6__1"
    // InternalKinematicsParser.g:7146:1: rule__Inertia__Group_6__1 : rule__Inertia__Group_6__1__Impl ;
    public final void rule__Inertia__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7150:1: ( rule__Inertia__Group_6__1__Impl )
            // InternalKinematicsParser.g:7151:2: rule__Inertia__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_6__1"


    // $ANTLR start "rule__Inertia__Group_6__1__Impl"
    // InternalKinematicsParser.g:7157:1: rule__Inertia__Group_6__1__Impl : ( ( rule__Inertia__IyzAssignment_6_1 ) ) ;
    public final void rule__Inertia__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7161:1: ( ( ( rule__Inertia__IyzAssignment_6_1 ) ) )
            // InternalKinematicsParser.g:7162:1: ( ( rule__Inertia__IyzAssignment_6_1 ) )
            {
            // InternalKinematicsParser.g:7162:1: ( ( rule__Inertia__IyzAssignment_6_1 ) )
            // InternalKinematicsParser.g:7163:2: ( rule__Inertia__IyzAssignment_6_1 )
            {
             before(grammarAccess.getInertiaAccess().getIyzAssignment_6_1()); 
            // InternalKinematicsParser.g:7164:2: ( rule__Inertia__IyzAssignment_6_1 )
            // InternalKinematicsParser.g:7164:3: rule__Inertia__IyzAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IyzAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIyzAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_6__1__Impl"


    // $ANTLR start "rule__Inertia__Group_7__0"
    // InternalKinematicsParser.g:7173:1: rule__Inertia__Group_7__0 : rule__Inertia__Group_7__0__Impl rule__Inertia__Group_7__1 ;
    public final void rule__Inertia__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7177:1: ( rule__Inertia__Group_7__0__Impl rule__Inertia__Group_7__1 )
            // InternalKinematicsParser.g:7178:2: rule__Inertia__Group_7__0__Impl rule__Inertia__Group_7__1
            {
            pushFollow(FOLLOW_45);
            rule__Inertia__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_7__0"


    // $ANTLR start "rule__Inertia__Group_7__0__Impl"
    // InternalKinematicsParser.g:7185:1: rule__Inertia__Group_7__0__Impl : ( Izz ) ;
    public final void rule__Inertia__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7189:1: ( ( Izz ) )
            // InternalKinematicsParser.g:7190:1: ( Izz )
            {
            // InternalKinematicsParser.g:7190:1: ( Izz )
            // InternalKinematicsParser.g:7191:2: Izz
            {
             before(grammarAccess.getInertiaAccess().getIzzKeyword_7_0()); 
            match(input,Izz,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIzzKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_7__0__Impl"


    // $ANTLR start "rule__Inertia__Group_7__1"
    // InternalKinematicsParser.g:7200:1: rule__Inertia__Group_7__1 : rule__Inertia__Group_7__1__Impl ;
    public final void rule__Inertia__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7204:1: ( rule__Inertia__Group_7__1__Impl )
            // InternalKinematicsParser.g:7205:2: rule__Inertia__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_7__1"


    // $ANTLR start "rule__Inertia__Group_7__1__Impl"
    // InternalKinematicsParser.g:7211:1: rule__Inertia__Group_7__1__Impl : ( ( rule__Inertia__IzzAssignment_7_1 ) ) ;
    public final void rule__Inertia__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7215:1: ( ( ( rule__Inertia__IzzAssignment_7_1 ) ) )
            // InternalKinematicsParser.g:7216:1: ( ( rule__Inertia__IzzAssignment_7_1 ) )
            {
            // InternalKinematicsParser.g:7216:1: ( ( rule__Inertia__IzzAssignment_7_1 ) )
            // InternalKinematicsParser.g:7217:2: ( rule__Inertia__IzzAssignment_7_1 )
            {
             before(grammarAccess.getInertiaAccess().getIzzAssignment_7_1()); 
            // InternalKinematicsParser.g:7218:2: ( rule__Inertia__IzzAssignment_7_1 )
            // InternalKinematicsParser.g:7218:3: rule__Inertia__IzzAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IzzAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIzzAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_7__1__Impl"


    // $ANTLR start "rule__Geometry__Group__0"
    // InternalKinematicsParser.g:7227:1: rule__Geometry__Group__0 : rule__Geometry__Group__0__Impl rule__Geometry__Group__1 ;
    public final void rule__Geometry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7231:1: ( rule__Geometry__Group__0__Impl rule__Geometry__Group__1 )
            // InternalKinematicsParser.g:7232:2: rule__Geometry__Group__0__Impl rule__Geometry__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Geometry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geometry__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__0"


    // $ANTLR start "rule__Geometry__Group__0__Impl"
    // InternalKinematicsParser.g:7239:1: rule__Geometry__Group__0__Impl : ( () ) ;
    public final void rule__Geometry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7243:1: ( ( () ) )
            // InternalKinematicsParser.g:7244:1: ( () )
            {
            // InternalKinematicsParser.g:7244:1: ( () )
            // InternalKinematicsParser.g:7245:2: ()
            {
             before(grammarAccess.getGeometryAccess().getGeometryAction_0()); 
            // InternalKinematicsParser.g:7246:2: ()
            // InternalKinematicsParser.g:7246:3: 
            {
            }

             after(grammarAccess.getGeometryAccess().getGeometryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__0__Impl"


    // $ANTLR start "rule__Geometry__Group__1"
    // InternalKinematicsParser.g:7254:1: rule__Geometry__Group__1 : rule__Geometry__Group__1__Impl rule__Geometry__Group__2 ;
    public final void rule__Geometry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7258:1: ( rule__Geometry__Group__1__Impl rule__Geometry__Group__2 )
            // InternalKinematicsParser.g:7259:2: rule__Geometry__Group__1__Impl rule__Geometry__Group__2
            {
            pushFollow(FOLLOW_54);
            rule__Geometry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geometry__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__1"


    // $ANTLR start "rule__Geometry__Group__1__Impl"
    // InternalKinematicsParser.g:7266:1: rule__Geometry__Group__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Geometry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7270:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:7271:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:7271:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:7272:2: RULE_BEGIN
            {
             before(grammarAccess.getGeometryAccess().getBEGINTerminalRuleCall_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getGeometryAccess().getBEGINTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__1__Impl"


    // $ANTLR start "rule__Geometry__Group__2"
    // InternalKinematicsParser.g:7281:1: rule__Geometry__Group__2 : rule__Geometry__Group__2__Impl rule__Geometry__Group__3 ;
    public final void rule__Geometry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7285:1: ( rule__Geometry__Group__2__Impl rule__Geometry__Group__3 )
            // InternalKinematicsParser.g:7286:2: rule__Geometry__Group__2__Impl rule__Geometry__Group__3
            {
            pushFollow(FOLLOW_54);
            rule__Geometry__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geometry__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__2"


    // $ANTLR start "rule__Geometry__Group__2__Impl"
    // InternalKinematicsParser.g:7293:1: rule__Geometry__Group__2__Impl : ( ( rule__Geometry__Group_2__0 )? ) ;
    public final void rule__Geometry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7297:1: ( ( ( rule__Geometry__Group_2__0 )? ) )
            // InternalKinematicsParser.g:7298:1: ( ( rule__Geometry__Group_2__0 )? )
            {
            // InternalKinematicsParser.g:7298:1: ( ( rule__Geometry__Group_2__0 )? )
            // InternalKinematicsParser.g:7299:2: ( rule__Geometry__Group_2__0 )?
            {
             before(grammarAccess.getGeometryAccess().getGroup_2()); 
            // InternalKinematicsParser.g:7300:2: ( rule__Geometry__Group_2__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==Box) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalKinematicsParser.g:7300:3: rule__Geometry__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Geometry__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeometryAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__2__Impl"


    // $ANTLR start "rule__Geometry__Group__3"
    // InternalKinematicsParser.g:7308:1: rule__Geometry__Group__3 : rule__Geometry__Group__3__Impl rule__Geometry__Group__4 ;
    public final void rule__Geometry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7312:1: ( rule__Geometry__Group__3__Impl rule__Geometry__Group__4 )
            // InternalKinematicsParser.g:7313:2: rule__Geometry__Group__3__Impl rule__Geometry__Group__4
            {
            pushFollow(FOLLOW_54);
            rule__Geometry__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geometry__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__3"


    // $ANTLR start "rule__Geometry__Group__3__Impl"
    // InternalKinematicsParser.g:7320:1: rule__Geometry__Group__3__Impl : ( ( rule__Geometry__Group_3__0 )? ) ;
    public final void rule__Geometry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7324:1: ( ( ( rule__Geometry__Group_3__0 )? ) )
            // InternalKinematicsParser.g:7325:1: ( ( rule__Geometry__Group_3__0 )? )
            {
            // InternalKinematicsParser.g:7325:1: ( ( rule__Geometry__Group_3__0 )? )
            // InternalKinematicsParser.g:7326:2: ( rule__Geometry__Group_3__0 )?
            {
             before(grammarAccess.getGeometryAccess().getGroup_3()); 
            // InternalKinematicsParser.g:7327:2: ( rule__Geometry__Group_3__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==Cylinder) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalKinematicsParser.g:7327:3: rule__Geometry__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Geometry__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeometryAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__3__Impl"


    // $ANTLR start "rule__Geometry__Group__4"
    // InternalKinematicsParser.g:7335:1: rule__Geometry__Group__4 : rule__Geometry__Group__4__Impl rule__Geometry__Group__5 ;
    public final void rule__Geometry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7339:1: ( rule__Geometry__Group__4__Impl rule__Geometry__Group__5 )
            // InternalKinematicsParser.g:7340:2: rule__Geometry__Group__4__Impl rule__Geometry__Group__5
            {
            pushFollow(FOLLOW_54);
            rule__Geometry__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geometry__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__4"


    // $ANTLR start "rule__Geometry__Group__4__Impl"
    // InternalKinematicsParser.g:7347:1: rule__Geometry__Group__4__Impl : ( ( rule__Geometry__Group_4__0 )? ) ;
    public final void rule__Geometry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7351:1: ( ( ( rule__Geometry__Group_4__0 )? ) )
            // InternalKinematicsParser.g:7352:1: ( ( rule__Geometry__Group_4__0 )? )
            {
            // InternalKinematicsParser.g:7352:1: ( ( rule__Geometry__Group_4__0 )? )
            // InternalKinematicsParser.g:7353:2: ( rule__Geometry__Group_4__0 )?
            {
             before(grammarAccess.getGeometryAccess().getGroup_4()); 
            // InternalKinematicsParser.g:7354:2: ( rule__Geometry__Group_4__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==Sphere) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalKinematicsParser.g:7354:3: rule__Geometry__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Geometry__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeometryAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__4__Impl"


    // $ANTLR start "rule__Geometry__Group__5"
    // InternalKinematicsParser.g:7362:1: rule__Geometry__Group__5 : rule__Geometry__Group__5__Impl rule__Geometry__Group__6 ;
    public final void rule__Geometry__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7366:1: ( rule__Geometry__Group__5__Impl rule__Geometry__Group__6 )
            // InternalKinematicsParser.g:7367:2: rule__Geometry__Group__5__Impl rule__Geometry__Group__6
            {
            pushFollow(FOLLOW_54);
            rule__Geometry__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geometry__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__5"


    // $ANTLR start "rule__Geometry__Group__5__Impl"
    // InternalKinematicsParser.g:7374:1: rule__Geometry__Group__5__Impl : ( ( rule__Geometry__Group_5__0 )? ) ;
    public final void rule__Geometry__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7378:1: ( ( ( rule__Geometry__Group_5__0 )? ) )
            // InternalKinematicsParser.g:7379:1: ( ( rule__Geometry__Group_5__0 )? )
            {
            // InternalKinematicsParser.g:7379:1: ( ( rule__Geometry__Group_5__0 )? )
            // InternalKinematicsParser.g:7380:2: ( rule__Geometry__Group_5__0 )?
            {
             before(grammarAccess.getGeometryAccess().getGroup_5()); 
            // InternalKinematicsParser.g:7381:2: ( rule__Geometry__Group_5__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==Mesh) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalKinematicsParser.g:7381:3: rule__Geometry__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Geometry__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeometryAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__5__Impl"


    // $ANTLR start "rule__Geometry__Group__6"
    // InternalKinematicsParser.g:7389:1: rule__Geometry__Group__6 : rule__Geometry__Group__6__Impl ;
    public final void rule__Geometry__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7393:1: ( rule__Geometry__Group__6__Impl )
            // InternalKinematicsParser.g:7394:2: rule__Geometry__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__6"


    // $ANTLR start "rule__Geometry__Group__6__Impl"
    // InternalKinematicsParser.g:7400:1: rule__Geometry__Group__6__Impl : ( RULE_END ) ;
    public final void rule__Geometry__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7404:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:7405:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:7405:1: ( RULE_END )
            // InternalKinematicsParser.g:7406:2: RULE_END
            {
             before(grammarAccess.getGeometryAccess().getENDTerminalRuleCall_6()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getGeometryAccess().getENDTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__6__Impl"


    // $ANTLR start "rule__Geometry__Group_2__0"
    // InternalKinematicsParser.g:7416:1: rule__Geometry__Group_2__0 : rule__Geometry__Group_2__0__Impl rule__Geometry__Group_2__1 ;
    public final void rule__Geometry__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7420:1: ( rule__Geometry__Group_2__0__Impl rule__Geometry__Group_2__1 )
            // InternalKinematicsParser.g:7421:2: rule__Geometry__Group_2__0__Impl rule__Geometry__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Geometry__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geometry__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_2__0"


    // $ANTLR start "rule__Geometry__Group_2__0__Impl"
    // InternalKinematicsParser.g:7428:1: rule__Geometry__Group_2__0__Impl : ( Box ) ;
    public final void rule__Geometry__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7432:1: ( ( Box ) )
            // InternalKinematicsParser.g:7433:1: ( Box )
            {
            // InternalKinematicsParser.g:7433:1: ( Box )
            // InternalKinematicsParser.g:7434:2: Box
            {
             before(grammarAccess.getGeometryAccess().getBoxKeyword_2_0()); 
            match(input,Box,FOLLOW_2); 
             after(grammarAccess.getGeometryAccess().getBoxKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_2__0__Impl"


    // $ANTLR start "rule__Geometry__Group_2__1"
    // InternalKinematicsParser.g:7443:1: rule__Geometry__Group_2__1 : rule__Geometry__Group_2__1__Impl ;
    public final void rule__Geometry__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7447:1: ( rule__Geometry__Group_2__1__Impl )
            // InternalKinematicsParser.g:7448:2: rule__Geometry__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_2__1"


    // $ANTLR start "rule__Geometry__Group_2__1__Impl"
    // InternalKinematicsParser.g:7454:1: rule__Geometry__Group_2__1__Impl : ( ( rule__Geometry__BoxAssignment_2_1 ) ) ;
    public final void rule__Geometry__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7458:1: ( ( ( rule__Geometry__BoxAssignment_2_1 ) ) )
            // InternalKinematicsParser.g:7459:1: ( ( rule__Geometry__BoxAssignment_2_1 ) )
            {
            // InternalKinematicsParser.g:7459:1: ( ( rule__Geometry__BoxAssignment_2_1 ) )
            // InternalKinematicsParser.g:7460:2: ( rule__Geometry__BoxAssignment_2_1 )
            {
             before(grammarAccess.getGeometryAccess().getBoxAssignment_2_1()); 
            // InternalKinematicsParser.g:7461:2: ( rule__Geometry__BoxAssignment_2_1 )
            // InternalKinematicsParser.g:7461:3: rule__Geometry__BoxAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__BoxAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGeometryAccess().getBoxAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_2__1__Impl"


    // $ANTLR start "rule__Geometry__Group_3__0"
    // InternalKinematicsParser.g:7470:1: rule__Geometry__Group_3__0 : rule__Geometry__Group_3__0__Impl rule__Geometry__Group_3__1 ;
    public final void rule__Geometry__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7474:1: ( rule__Geometry__Group_3__0__Impl rule__Geometry__Group_3__1 )
            // InternalKinematicsParser.g:7475:2: rule__Geometry__Group_3__0__Impl rule__Geometry__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Geometry__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geometry__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_3__0"


    // $ANTLR start "rule__Geometry__Group_3__0__Impl"
    // InternalKinematicsParser.g:7482:1: rule__Geometry__Group_3__0__Impl : ( Cylinder ) ;
    public final void rule__Geometry__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7486:1: ( ( Cylinder ) )
            // InternalKinematicsParser.g:7487:1: ( Cylinder )
            {
            // InternalKinematicsParser.g:7487:1: ( Cylinder )
            // InternalKinematicsParser.g:7488:2: Cylinder
            {
             before(grammarAccess.getGeometryAccess().getCylinderKeyword_3_0()); 
            match(input,Cylinder,FOLLOW_2); 
             after(grammarAccess.getGeometryAccess().getCylinderKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_3__0__Impl"


    // $ANTLR start "rule__Geometry__Group_3__1"
    // InternalKinematicsParser.g:7497:1: rule__Geometry__Group_3__1 : rule__Geometry__Group_3__1__Impl ;
    public final void rule__Geometry__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7501:1: ( rule__Geometry__Group_3__1__Impl )
            // InternalKinematicsParser.g:7502:2: rule__Geometry__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_3__1"


    // $ANTLR start "rule__Geometry__Group_3__1__Impl"
    // InternalKinematicsParser.g:7508:1: rule__Geometry__Group_3__1__Impl : ( ( rule__Geometry__CylinderAssignment_3_1 ) ) ;
    public final void rule__Geometry__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7512:1: ( ( ( rule__Geometry__CylinderAssignment_3_1 ) ) )
            // InternalKinematicsParser.g:7513:1: ( ( rule__Geometry__CylinderAssignment_3_1 ) )
            {
            // InternalKinematicsParser.g:7513:1: ( ( rule__Geometry__CylinderAssignment_3_1 ) )
            // InternalKinematicsParser.g:7514:2: ( rule__Geometry__CylinderAssignment_3_1 )
            {
             before(grammarAccess.getGeometryAccess().getCylinderAssignment_3_1()); 
            // InternalKinematicsParser.g:7515:2: ( rule__Geometry__CylinderAssignment_3_1 )
            // InternalKinematicsParser.g:7515:3: rule__Geometry__CylinderAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__CylinderAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGeometryAccess().getCylinderAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_3__1__Impl"


    // $ANTLR start "rule__Geometry__Group_4__0"
    // InternalKinematicsParser.g:7524:1: rule__Geometry__Group_4__0 : rule__Geometry__Group_4__0__Impl rule__Geometry__Group_4__1 ;
    public final void rule__Geometry__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7528:1: ( rule__Geometry__Group_4__0__Impl rule__Geometry__Group_4__1 )
            // InternalKinematicsParser.g:7529:2: rule__Geometry__Group_4__0__Impl rule__Geometry__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Geometry__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geometry__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_4__0"


    // $ANTLR start "rule__Geometry__Group_4__0__Impl"
    // InternalKinematicsParser.g:7536:1: rule__Geometry__Group_4__0__Impl : ( Sphere ) ;
    public final void rule__Geometry__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7540:1: ( ( Sphere ) )
            // InternalKinematicsParser.g:7541:1: ( Sphere )
            {
            // InternalKinematicsParser.g:7541:1: ( Sphere )
            // InternalKinematicsParser.g:7542:2: Sphere
            {
             before(grammarAccess.getGeometryAccess().getSphereKeyword_4_0()); 
            match(input,Sphere,FOLLOW_2); 
             after(grammarAccess.getGeometryAccess().getSphereKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_4__0__Impl"


    // $ANTLR start "rule__Geometry__Group_4__1"
    // InternalKinematicsParser.g:7551:1: rule__Geometry__Group_4__1 : rule__Geometry__Group_4__1__Impl ;
    public final void rule__Geometry__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7555:1: ( rule__Geometry__Group_4__1__Impl )
            // InternalKinematicsParser.g:7556:2: rule__Geometry__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_4__1"


    // $ANTLR start "rule__Geometry__Group_4__1__Impl"
    // InternalKinematicsParser.g:7562:1: rule__Geometry__Group_4__1__Impl : ( ( rule__Geometry__SphereAssignment_4_1 ) ) ;
    public final void rule__Geometry__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7566:1: ( ( ( rule__Geometry__SphereAssignment_4_1 ) ) )
            // InternalKinematicsParser.g:7567:1: ( ( rule__Geometry__SphereAssignment_4_1 ) )
            {
            // InternalKinematicsParser.g:7567:1: ( ( rule__Geometry__SphereAssignment_4_1 ) )
            // InternalKinematicsParser.g:7568:2: ( rule__Geometry__SphereAssignment_4_1 )
            {
             before(grammarAccess.getGeometryAccess().getSphereAssignment_4_1()); 
            // InternalKinematicsParser.g:7569:2: ( rule__Geometry__SphereAssignment_4_1 )
            // InternalKinematicsParser.g:7569:3: rule__Geometry__SphereAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__SphereAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGeometryAccess().getSphereAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_4__1__Impl"


    // $ANTLR start "rule__Geometry__Group_5__0"
    // InternalKinematicsParser.g:7578:1: rule__Geometry__Group_5__0 : rule__Geometry__Group_5__0__Impl rule__Geometry__Group_5__1 ;
    public final void rule__Geometry__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7582:1: ( rule__Geometry__Group_5__0__Impl rule__Geometry__Group_5__1 )
            // InternalKinematicsParser.g:7583:2: rule__Geometry__Group_5__0__Impl rule__Geometry__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Geometry__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geometry__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_5__0"


    // $ANTLR start "rule__Geometry__Group_5__0__Impl"
    // InternalKinematicsParser.g:7590:1: rule__Geometry__Group_5__0__Impl : ( Mesh ) ;
    public final void rule__Geometry__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7594:1: ( ( Mesh ) )
            // InternalKinematicsParser.g:7595:1: ( Mesh )
            {
            // InternalKinematicsParser.g:7595:1: ( Mesh )
            // InternalKinematicsParser.g:7596:2: Mesh
            {
             before(grammarAccess.getGeometryAccess().getMeshKeyword_5_0()); 
            match(input,Mesh,FOLLOW_2); 
             after(grammarAccess.getGeometryAccess().getMeshKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_5__0__Impl"


    // $ANTLR start "rule__Geometry__Group_5__1"
    // InternalKinematicsParser.g:7605:1: rule__Geometry__Group_5__1 : rule__Geometry__Group_5__1__Impl ;
    public final void rule__Geometry__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7609:1: ( rule__Geometry__Group_5__1__Impl )
            // InternalKinematicsParser.g:7610:2: rule__Geometry__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_5__1"


    // $ANTLR start "rule__Geometry__Group_5__1__Impl"
    // InternalKinematicsParser.g:7616:1: rule__Geometry__Group_5__1__Impl : ( ( rule__Geometry__MeshAssignment_5_1 ) ) ;
    public final void rule__Geometry__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7620:1: ( ( ( rule__Geometry__MeshAssignment_5_1 ) ) )
            // InternalKinematicsParser.g:7621:1: ( ( rule__Geometry__MeshAssignment_5_1 ) )
            {
            // InternalKinematicsParser.g:7621:1: ( ( rule__Geometry__MeshAssignment_5_1 ) )
            // InternalKinematicsParser.g:7622:2: ( rule__Geometry__MeshAssignment_5_1 )
            {
             before(grammarAccess.getGeometryAccess().getMeshAssignment_5_1()); 
            // InternalKinematicsParser.g:7623:2: ( rule__Geometry__MeshAssignment_5_1 )
            // InternalKinematicsParser.g:7623:3: rule__Geometry__MeshAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__MeshAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getGeometryAccess().getMeshAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_5__1__Impl"


    // $ANTLR start "rule__Box__Group__0"
    // InternalKinematicsParser.g:7632:1: rule__Box__Group__0 : rule__Box__Group__0__Impl rule__Box__Group__1 ;
    public final void rule__Box__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7636:1: ( rule__Box__Group__0__Impl rule__Box__Group__1 )
            // InternalKinematicsParser.g:7637:2: rule__Box__Group__0__Impl rule__Box__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Box__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__0"


    // $ANTLR start "rule__Box__Group__0__Impl"
    // InternalKinematicsParser.g:7644:1: rule__Box__Group__0__Impl : ( () ) ;
    public final void rule__Box__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7648:1: ( ( () ) )
            // InternalKinematicsParser.g:7649:1: ( () )
            {
            // InternalKinematicsParser.g:7649:1: ( () )
            // InternalKinematicsParser.g:7650:2: ()
            {
             before(grammarAccess.getBoxAccess().getBoxAction_0()); 
            // InternalKinematicsParser.g:7651:2: ()
            // InternalKinematicsParser.g:7651:3: 
            {
            }

             after(grammarAccess.getBoxAccess().getBoxAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__0__Impl"


    // $ANTLR start "rule__Box__Group__1"
    // InternalKinematicsParser.g:7659:1: rule__Box__Group__1 : rule__Box__Group__1__Impl rule__Box__Group__2 ;
    public final void rule__Box__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7663:1: ( rule__Box__Group__1__Impl rule__Box__Group__2 )
            // InternalKinematicsParser.g:7664:2: rule__Box__Group__1__Impl rule__Box__Group__2
            {
            pushFollow(FOLLOW_55);
            rule__Box__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__1"


    // $ANTLR start "rule__Box__Group__1__Impl"
    // InternalKinematicsParser.g:7671:1: rule__Box__Group__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Box__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7675:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:7676:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:7676:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:7677:2: RULE_BEGIN
            {
             before(grammarAccess.getBoxAccess().getBEGINTerminalRuleCall_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getBEGINTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__1__Impl"


    // $ANTLR start "rule__Box__Group__2"
    // InternalKinematicsParser.g:7686:1: rule__Box__Group__2 : rule__Box__Group__2__Impl rule__Box__Group__3 ;
    public final void rule__Box__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7690:1: ( rule__Box__Group__2__Impl rule__Box__Group__3 )
            // InternalKinematicsParser.g:7691:2: rule__Box__Group__2__Impl rule__Box__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Box__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__2"


    // $ANTLR start "rule__Box__Group__2__Impl"
    // InternalKinematicsParser.g:7698:1: rule__Box__Group__2__Impl : ( Size ) ;
    public final void rule__Box__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7702:1: ( ( Size ) )
            // InternalKinematicsParser.g:7703:1: ( Size )
            {
            // InternalKinematicsParser.g:7703:1: ( Size )
            // InternalKinematicsParser.g:7704:2: Size
            {
             before(grammarAccess.getBoxAccess().getSizeKeyword_2()); 
            match(input,Size,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getSizeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__2__Impl"


    // $ANTLR start "rule__Box__Group__3"
    // InternalKinematicsParser.g:7713:1: rule__Box__Group__3 : rule__Box__Group__3__Impl rule__Box__Group__4 ;
    public final void rule__Box__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7717:1: ( rule__Box__Group__3__Impl rule__Box__Group__4 )
            // InternalKinematicsParser.g:7718:2: rule__Box__Group__3__Impl rule__Box__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Box__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__3"


    // $ANTLR start "rule__Box__Group__3__Impl"
    // InternalKinematicsParser.g:7725:1: rule__Box__Group__3__Impl : ( ( rule__Box__SizeAssignment_3 ) ) ;
    public final void rule__Box__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7729:1: ( ( ( rule__Box__SizeAssignment_3 ) ) )
            // InternalKinematicsParser.g:7730:1: ( ( rule__Box__SizeAssignment_3 ) )
            {
            // InternalKinematicsParser.g:7730:1: ( ( rule__Box__SizeAssignment_3 ) )
            // InternalKinematicsParser.g:7731:2: ( rule__Box__SizeAssignment_3 )
            {
             before(grammarAccess.getBoxAccess().getSizeAssignment_3()); 
            // InternalKinematicsParser.g:7732:2: ( rule__Box__SizeAssignment_3 )
            // InternalKinematicsParser.g:7732:3: rule__Box__SizeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Box__SizeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getSizeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__3__Impl"


    // $ANTLR start "rule__Box__Group__4"
    // InternalKinematicsParser.g:7740:1: rule__Box__Group__4 : rule__Box__Group__4__Impl ;
    public final void rule__Box__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7744:1: ( rule__Box__Group__4__Impl )
            // InternalKinematicsParser.g:7745:2: rule__Box__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__4"


    // $ANTLR start "rule__Box__Group__4__Impl"
    // InternalKinematicsParser.g:7751:1: rule__Box__Group__4__Impl : ( RULE_END ) ;
    public final void rule__Box__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7755:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:7756:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:7756:1: ( RULE_END )
            // InternalKinematicsParser.g:7757:2: RULE_END
            {
             before(grammarAccess.getBoxAccess().getENDTerminalRuleCall_4()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getENDTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__4__Impl"


    // $ANTLR start "rule__Cylinder__Group__0"
    // InternalKinematicsParser.g:7767:1: rule__Cylinder__Group__0 : rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 ;
    public final void rule__Cylinder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7771:1: ( rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 )
            // InternalKinematicsParser.g:7772:2: rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1
            {
            pushFollow(FOLLOW_56);
            rule__Cylinder__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__0"


    // $ANTLR start "rule__Cylinder__Group__0__Impl"
    // InternalKinematicsParser.g:7779:1: rule__Cylinder__Group__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Cylinder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7783:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:7784:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:7784:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:7785:2: RULE_BEGIN
            {
             before(grammarAccess.getCylinderAccess().getBEGINTerminalRuleCall_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getBEGINTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__0__Impl"


    // $ANTLR start "rule__Cylinder__Group__1"
    // InternalKinematicsParser.g:7794:1: rule__Cylinder__Group__1 : rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 ;
    public final void rule__Cylinder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7798:1: ( rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 )
            // InternalKinematicsParser.g:7799:2: rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Cylinder__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__1"


    // $ANTLR start "rule__Cylinder__Group__1__Impl"
    // InternalKinematicsParser.g:7806:1: rule__Cylinder__Group__1__Impl : ( Length ) ;
    public final void rule__Cylinder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7810:1: ( ( Length ) )
            // InternalKinematicsParser.g:7811:1: ( Length )
            {
            // InternalKinematicsParser.g:7811:1: ( Length )
            // InternalKinematicsParser.g:7812:2: Length
            {
             before(grammarAccess.getCylinderAccess().getLengthKeyword_1()); 
            match(input,Length,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getLengthKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__1__Impl"


    // $ANTLR start "rule__Cylinder__Group__2"
    // InternalKinematicsParser.g:7821:1: rule__Cylinder__Group__2 : rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 ;
    public final void rule__Cylinder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7825:1: ( rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 )
            // InternalKinematicsParser.g:7826:2: rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3
            {
            pushFollow(FOLLOW_57);
            rule__Cylinder__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__2"


    // $ANTLR start "rule__Cylinder__Group__2__Impl"
    // InternalKinematicsParser.g:7833:1: rule__Cylinder__Group__2__Impl : ( ( rule__Cylinder__LengthAssignment_2 ) ) ;
    public final void rule__Cylinder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7837:1: ( ( ( rule__Cylinder__LengthAssignment_2 ) ) )
            // InternalKinematicsParser.g:7838:1: ( ( rule__Cylinder__LengthAssignment_2 ) )
            {
            // InternalKinematicsParser.g:7838:1: ( ( rule__Cylinder__LengthAssignment_2 ) )
            // InternalKinematicsParser.g:7839:2: ( rule__Cylinder__LengthAssignment_2 )
            {
             before(grammarAccess.getCylinderAccess().getLengthAssignment_2()); 
            // InternalKinematicsParser.g:7840:2: ( rule__Cylinder__LengthAssignment_2 )
            // InternalKinematicsParser.g:7840:3: rule__Cylinder__LengthAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__LengthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getLengthAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__2__Impl"


    // $ANTLR start "rule__Cylinder__Group__3"
    // InternalKinematicsParser.g:7848:1: rule__Cylinder__Group__3 : rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 ;
    public final void rule__Cylinder__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7852:1: ( rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 )
            // InternalKinematicsParser.g:7853:2: rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Cylinder__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__3"


    // $ANTLR start "rule__Cylinder__Group__3__Impl"
    // InternalKinematicsParser.g:7860:1: rule__Cylinder__Group__3__Impl : ( Radius ) ;
    public final void rule__Cylinder__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7864:1: ( ( Radius ) )
            // InternalKinematicsParser.g:7865:1: ( Radius )
            {
            // InternalKinematicsParser.g:7865:1: ( Radius )
            // InternalKinematicsParser.g:7866:2: Radius
            {
             before(grammarAccess.getCylinderAccess().getRadiusKeyword_3()); 
            match(input,Radius,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getRadiusKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__3__Impl"


    // $ANTLR start "rule__Cylinder__Group__4"
    // InternalKinematicsParser.g:7875:1: rule__Cylinder__Group__4 : rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 ;
    public final void rule__Cylinder__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7879:1: ( rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 )
            // InternalKinematicsParser.g:7880:2: rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__Cylinder__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__4"


    // $ANTLR start "rule__Cylinder__Group__4__Impl"
    // InternalKinematicsParser.g:7887:1: rule__Cylinder__Group__4__Impl : ( ( rule__Cylinder__RadiusAssignment_4 ) ) ;
    public final void rule__Cylinder__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7891:1: ( ( ( rule__Cylinder__RadiusAssignment_4 ) ) )
            // InternalKinematicsParser.g:7892:1: ( ( rule__Cylinder__RadiusAssignment_4 ) )
            {
            // InternalKinematicsParser.g:7892:1: ( ( rule__Cylinder__RadiusAssignment_4 ) )
            // InternalKinematicsParser.g:7893:2: ( rule__Cylinder__RadiusAssignment_4 )
            {
             before(grammarAccess.getCylinderAccess().getRadiusAssignment_4()); 
            // InternalKinematicsParser.g:7894:2: ( rule__Cylinder__RadiusAssignment_4 )
            // InternalKinematicsParser.g:7894:3: rule__Cylinder__RadiusAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__RadiusAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getRadiusAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__4__Impl"


    // $ANTLR start "rule__Cylinder__Group__5"
    // InternalKinematicsParser.g:7902:1: rule__Cylinder__Group__5 : rule__Cylinder__Group__5__Impl ;
    public final void rule__Cylinder__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7906:1: ( rule__Cylinder__Group__5__Impl )
            // InternalKinematicsParser.g:7907:2: rule__Cylinder__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__5"


    // $ANTLR start "rule__Cylinder__Group__5__Impl"
    // InternalKinematicsParser.g:7913:1: rule__Cylinder__Group__5__Impl : ( RULE_END ) ;
    public final void rule__Cylinder__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7917:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:7918:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:7918:1: ( RULE_END )
            // InternalKinematicsParser.g:7919:2: RULE_END
            {
             before(grammarAccess.getCylinderAccess().getENDTerminalRuleCall_5()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getENDTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__5__Impl"


    // $ANTLR start "rule__Sphere__Group__0"
    // InternalKinematicsParser.g:7929:1: rule__Sphere__Group__0 : rule__Sphere__Group__0__Impl rule__Sphere__Group__1 ;
    public final void rule__Sphere__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7933:1: ( rule__Sphere__Group__0__Impl rule__Sphere__Group__1 )
            // InternalKinematicsParser.g:7934:2: rule__Sphere__Group__0__Impl rule__Sphere__Group__1
            {
            pushFollow(FOLLOW_57);
            rule__Sphere__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__0"


    // $ANTLR start "rule__Sphere__Group__0__Impl"
    // InternalKinematicsParser.g:7941:1: rule__Sphere__Group__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Sphere__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7945:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:7946:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:7946:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:7947:2: RULE_BEGIN
            {
             before(grammarAccess.getSphereAccess().getBEGINTerminalRuleCall_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getBEGINTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__0__Impl"


    // $ANTLR start "rule__Sphere__Group__1"
    // InternalKinematicsParser.g:7956:1: rule__Sphere__Group__1 : rule__Sphere__Group__1__Impl rule__Sphere__Group__2 ;
    public final void rule__Sphere__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7960:1: ( rule__Sphere__Group__1__Impl rule__Sphere__Group__2 )
            // InternalKinematicsParser.g:7961:2: rule__Sphere__Group__1__Impl rule__Sphere__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__Sphere__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__1"


    // $ANTLR start "rule__Sphere__Group__1__Impl"
    // InternalKinematicsParser.g:7968:1: rule__Sphere__Group__1__Impl : ( Radius ) ;
    public final void rule__Sphere__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7972:1: ( ( Radius ) )
            // InternalKinematicsParser.g:7973:1: ( Radius )
            {
            // InternalKinematicsParser.g:7973:1: ( Radius )
            // InternalKinematicsParser.g:7974:2: Radius
            {
             before(grammarAccess.getSphereAccess().getRadiusKeyword_1()); 
            match(input,Radius,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getRadiusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__1__Impl"


    // $ANTLR start "rule__Sphere__Group__2"
    // InternalKinematicsParser.g:7983:1: rule__Sphere__Group__2 : rule__Sphere__Group__2__Impl rule__Sphere__Group__3 ;
    public final void rule__Sphere__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7987:1: ( rule__Sphere__Group__2__Impl rule__Sphere__Group__3 )
            // InternalKinematicsParser.g:7988:2: rule__Sphere__Group__2__Impl rule__Sphere__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Sphere__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__2"


    // $ANTLR start "rule__Sphere__Group__2__Impl"
    // InternalKinematicsParser.g:7995:1: rule__Sphere__Group__2__Impl : ( ( rule__Sphere__RadiusAssignment_2 ) ) ;
    public final void rule__Sphere__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7999:1: ( ( ( rule__Sphere__RadiusAssignment_2 ) ) )
            // InternalKinematicsParser.g:8000:1: ( ( rule__Sphere__RadiusAssignment_2 ) )
            {
            // InternalKinematicsParser.g:8000:1: ( ( rule__Sphere__RadiusAssignment_2 ) )
            // InternalKinematicsParser.g:8001:2: ( rule__Sphere__RadiusAssignment_2 )
            {
             before(grammarAccess.getSphereAccess().getRadiusAssignment_2()); 
            // InternalKinematicsParser.g:8002:2: ( rule__Sphere__RadiusAssignment_2 )
            // InternalKinematicsParser.g:8002:3: rule__Sphere__RadiusAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__RadiusAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSphereAccess().getRadiusAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__2__Impl"


    // $ANTLR start "rule__Sphere__Group__3"
    // InternalKinematicsParser.g:8010:1: rule__Sphere__Group__3 : rule__Sphere__Group__3__Impl ;
    public final void rule__Sphere__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8014:1: ( rule__Sphere__Group__3__Impl )
            // InternalKinematicsParser.g:8015:2: rule__Sphere__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__3"


    // $ANTLR start "rule__Sphere__Group__3__Impl"
    // InternalKinematicsParser.g:8021:1: rule__Sphere__Group__3__Impl : ( RULE_END ) ;
    public final void rule__Sphere__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8025:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:8026:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:8026:1: ( RULE_END )
            // InternalKinematicsParser.g:8027:2: RULE_END
            {
             before(grammarAccess.getSphereAccess().getENDTerminalRuleCall_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getENDTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__3__Impl"


    // $ANTLR start "rule__Mesh__Group__0"
    // InternalKinematicsParser.g:8037:1: rule__Mesh__Group__0 : rule__Mesh__Group__0__Impl rule__Mesh__Group__1 ;
    public final void rule__Mesh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8041:1: ( rule__Mesh__Group__0__Impl rule__Mesh__Group__1 )
            // InternalKinematicsParser.g:8042:2: rule__Mesh__Group__0__Impl rule__Mesh__Group__1
            {
            pushFollow(FOLLOW_58);
            rule__Mesh__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__0"


    // $ANTLR start "rule__Mesh__Group__0__Impl"
    // InternalKinematicsParser.g:8049:1: rule__Mesh__Group__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Mesh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8053:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:8054:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:8054:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:8055:2: RULE_BEGIN
            {
             before(grammarAccess.getMeshAccess().getBEGINTerminalRuleCall_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getBEGINTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__0__Impl"


    // $ANTLR start "rule__Mesh__Group__1"
    // InternalKinematicsParser.g:8064:1: rule__Mesh__Group__1 : rule__Mesh__Group__1__Impl rule__Mesh__Group__2 ;
    public final void rule__Mesh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8068:1: ( rule__Mesh__Group__1__Impl rule__Mesh__Group__2 )
            // InternalKinematicsParser.g:8069:2: rule__Mesh__Group__1__Impl rule__Mesh__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Mesh__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__1"


    // $ANTLR start "rule__Mesh__Group__1__Impl"
    // InternalKinematicsParser.g:8076:1: rule__Mesh__Group__1__Impl : ( Filename ) ;
    public final void rule__Mesh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8080:1: ( ( Filename ) )
            // InternalKinematicsParser.g:8081:1: ( Filename )
            {
            // InternalKinematicsParser.g:8081:1: ( Filename )
            // InternalKinematicsParser.g:8082:2: Filename
            {
             before(grammarAccess.getMeshAccess().getFilenameKeyword_1()); 
            match(input,Filename,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getFilenameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__1__Impl"


    // $ANTLR start "rule__Mesh__Group__2"
    // InternalKinematicsParser.g:8091:1: rule__Mesh__Group__2 : rule__Mesh__Group__2__Impl rule__Mesh__Group__3 ;
    public final void rule__Mesh__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8095:1: ( rule__Mesh__Group__2__Impl rule__Mesh__Group__3 )
            // InternalKinematicsParser.g:8096:2: rule__Mesh__Group__2__Impl rule__Mesh__Group__3
            {
            pushFollow(FOLLOW_59);
            rule__Mesh__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__2"


    // $ANTLR start "rule__Mesh__Group__2__Impl"
    // InternalKinematicsParser.g:8103:1: rule__Mesh__Group__2__Impl : ( ( rule__Mesh__FilenameAssignment_2 ) ) ;
    public final void rule__Mesh__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8107:1: ( ( ( rule__Mesh__FilenameAssignment_2 ) ) )
            // InternalKinematicsParser.g:8108:1: ( ( rule__Mesh__FilenameAssignment_2 ) )
            {
            // InternalKinematicsParser.g:8108:1: ( ( rule__Mesh__FilenameAssignment_2 ) )
            // InternalKinematicsParser.g:8109:2: ( rule__Mesh__FilenameAssignment_2 )
            {
             before(grammarAccess.getMeshAccess().getFilenameAssignment_2()); 
            // InternalKinematicsParser.g:8110:2: ( rule__Mesh__FilenameAssignment_2 )
            // InternalKinematicsParser.g:8110:3: rule__Mesh__FilenameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__FilenameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMeshAccess().getFilenameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__2__Impl"


    // $ANTLR start "rule__Mesh__Group__3"
    // InternalKinematicsParser.g:8118:1: rule__Mesh__Group__3 : rule__Mesh__Group__3__Impl rule__Mesh__Group__4 ;
    public final void rule__Mesh__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8122:1: ( rule__Mesh__Group__3__Impl rule__Mesh__Group__4 )
            // InternalKinematicsParser.g:8123:2: rule__Mesh__Group__3__Impl rule__Mesh__Group__4
            {
            pushFollow(FOLLOW_59);
            rule__Mesh__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__3"


    // $ANTLR start "rule__Mesh__Group__3__Impl"
    // InternalKinematicsParser.g:8130:1: rule__Mesh__Group__3__Impl : ( ( rule__Mesh__Group_3__0 )? ) ;
    public final void rule__Mesh__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8134:1: ( ( ( rule__Mesh__Group_3__0 )? ) )
            // InternalKinematicsParser.g:8135:1: ( ( rule__Mesh__Group_3__0 )? )
            {
            // InternalKinematicsParser.g:8135:1: ( ( rule__Mesh__Group_3__0 )? )
            // InternalKinematicsParser.g:8136:2: ( rule__Mesh__Group_3__0 )?
            {
             before(grammarAccess.getMeshAccess().getGroup_3()); 
            // InternalKinematicsParser.g:8137:2: ( rule__Mesh__Group_3__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==Scale) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalKinematicsParser.g:8137:3: rule__Mesh__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mesh__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeshAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__3__Impl"


    // $ANTLR start "rule__Mesh__Group__4"
    // InternalKinematicsParser.g:8145:1: rule__Mesh__Group__4 : rule__Mesh__Group__4__Impl ;
    public final void rule__Mesh__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8149:1: ( rule__Mesh__Group__4__Impl )
            // InternalKinematicsParser.g:8150:2: rule__Mesh__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__4"


    // $ANTLR start "rule__Mesh__Group__4__Impl"
    // InternalKinematicsParser.g:8156:1: rule__Mesh__Group__4__Impl : ( RULE_END ) ;
    public final void rule__Mesh__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8160:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:8161:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:8161:1: ( RULE_END )
            // InternalKinematicsParser.g:8162:2: RULE_END
            {
             before(grammarAccess.getMeshAccess().getENDTerminalRuleCall_4()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getENDTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__4__Impl"


    // $ANTLR start "rule__Mesh__Group_3__0"
    // InternalKinematicsParser.g:8172:1: rule__Mesh__Group_3__0 : rule__Mesh__Group_3__0__Impl rule__Mesh__Group_3__1 ;
    public final void rule__Mesh__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8176:1: ( rule__Mesh__Group_3__0__Impl rule__Mesh__Group_3__1 )
            // InternalKinematicsParser.g:8177:2: rule__Mesh__Group_3__0__Impl rule__Mesh__Group_3__1
            {
            pushFollow(FOLLOW_44);
            rule__Mesh__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_3__0"


    // $ANTLR start "rule__Mesh__Group_3__0__Impl"
    // InternalKinematicsParser.g:8184:1: rule__Mesh__Group_3__0__Impl : ( Scale ) ;
    public final void rule__Mesh__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8188:1: ( ( Scale ) )
            // InternalKinematicsParser.g:8189:1: ( Scale )
            {
            // InternalKinematicsParser.g:8189:1: ( Scale )
            // InternalKinematicsParser.g:8190:2: Scale
            {
             before(grammarAccess.getMeshAccess().getScaleKeyword_3_0()); 
            match(input,Scale,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getScaleKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_3__0__Impl"


    // $ANTLR start "rule__Mesh__Group_3__1"
    // InternalKinematicsParser.g:8199:1: rule__Mesh__Group_3__1 : rule__Mesh__Group_3__1__Impl rule__Mesh__Group_3__2 ;
    public final void rule__Mesh__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8203:1: ( rule__Mesh__Group_3__1__Impl rule__Mesh__Group_3__2 )
            // InternalKinematicsParser.g:8204:2: rule__Mesh__Group_3__1__Impl rule__Mesh__Group_3__2
            {
            pushFollow(FOLLOW_45);
            rule__Mesh__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_3__1"


    // $ANTLR start "rule__Mesh__Group_3__1__Impl"
    // InternalKinematicsParser.g:8211:1: rule__Mesh__Group_3__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__Mesh__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8215:1: ( ( LeftSquareBracket ) )
            // InternalKinematicsParser.g:8216:1: ( LeftSquareBracket )
            {
            // InternalKinematicsParser.g:8216:1: ( LeftSquareBracket )
            // InternalKinematicsParser.g:8217:2: LeftSquareBracket
            {
             before(grammarAccess.getMeshAccess().getLeftSquareBracketKeyword_3_1()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getLeftSquareBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_3__1__Impl"


    // $ANTLR start "rule__Mesh__Group_3__2"
    // InternalKinematicsParser.g:8226:1: rule__Mesh__Group_3__2 : rule__Mesh__Group_3__2__Impl rule__Mesh__Group_3__3 ;
    public final void rule__Mesh__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8230:1: ( rule__Mesh__Group_3__2__Impl rule__Mesh__Group_3__3 )
            // InternalKinematicsParser.g:8231:2: rule__Mesh__Group_3__2__Impl rule__Mesh__Group_3__3
            {
            pushFollow(FOLLOW_46);
            rule__Mesh__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_3__2"


    // $ANTLR start "rule__Mesh__Group_3__2__Impl"
    // InternalKinematicsParser.g:8238:1: rule__Mesh__Group_3__2__Impl : ( ( rule__Mesh__ScaleAssignment_3_2 ) ) ;
    public final void rule__Mesh__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8242:1: ( ( ( rule__Mesh__ScaleAssignment_3_2 ) ) )
            // InternalKinematicsParser.g:8243:1: ( ( rule__Mesh__ScaleAssignment_3_2 ) )
            {
            // InternalKinematicsParser.g:8243:1: ( ( rule__Mesh__ScaleAssignment_3_2 ) )
            // InternalKinematicsParser.g:8244:2: ( rule__Mesh__ScaleAssignment_3_2 )
            {
             before(grammarAccess.getMeshAccess().getScaleAssignment_3_2()); 
            // InternalKinematicsParser.g:8245:2: ( rule__Mesh__ScaleAssignment_3_2 )
            // InternalKinematicsParser.g:8245:3: rule__Mesh__ScaleAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__ScaleAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getMeshAccess().getScaleAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_3__2__Impl"


    // $ANTLR start "rule__Mesh__Group_3__3"
    // InternalKinematicsParser.g:8253:1: rule__Mesh__Group_3__3 : rule__Mesh__Group_3__3__Impl rule__Mesh__Group_3__4 ;
    public final void rule__Mesh__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8257:1: ( rule__Mesh__Group_3__3__Impl rule__Mesh__Group_3__4 )
            // InternalKinematicsParser.g:8258:2: rule__Mesh__Group_3__3__Impl rule__Mesh__Group_3__4
            {
            pushFollow(FOLLOW_46);
            rule__Mesh__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_3__3"


    // $ANTLR start "rule__Mesh__Group_3__3__Impl"
    // InternalKinematicsParser.g:8265:1: rule__Mesh__Group_3__3__Impl : ( ( rule__Mesh__Group_3_3__0 )* ) ;
    public final void rule__Mesh__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8269:1: ( ( ( rule__Mesh__Group_3_3__0 )* ) )
            // InternalKinematicsParser.g:8270:1: ( ( rule__Mesh__Group_3_3__0 )* )
            {
            // InternalKinematicsParser.g:8270:1: ( ( rule__Mesh__Group_3_3__0 )* )
            // InternalKinematicsParser.g:8271:2: ( rule__Mesh__Group_3_3__0 )*
            {
             before(grammarAccess.getMeshAccess().getGroup_3_3()); 
            // InternalKinematicsParser.g:8272:2: ( rule__Mesh__Group_3_3__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==Comma) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalKinematicsParser.g:8272:3: rule__Mesh__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__Mesh__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getMeshAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_3__3__Impl"


    // $ANTLR start "rule__Mesh__Group_3__4"
    // InternalKinematicsParser.g:8280:1: rule__Mesh__Group_3__4 : rule__Mesh__Group_3__4__Impl ;
    public final void rule__Mesh__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8284:1: ( rule__Mesh__Group_3__4__Impl )
            // InternalKinematicsParser.g:8285:2: rule__Mesh__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_3__4"


    // $ANTLR start "rule__Mesh__Group_3__4__Impl"
    // InternalKinematicsParser.g:8291:1: rule__Mesh__Group_3__4__Impl : ( RightSquareBracket ) ;
    public final void rule__Mesh__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8295:1: ( ( RightSquareBracket ) )
            // InternalKinematicsParser.g:8296:1: ( RightSquareBracket )
            {
            // InternalKinematicsParser.g:8296:1: ( RightSquareBracket )
            // InternalKinematicsParser.g:8297:2: RightSquareBracket
            {
             before(grammarAccess.getMeshAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getRightSquareBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_3__4__Impl"


    // $ANTLR start "rule__Mesh__Group_3_3__0"
    // InternalKinematicsParser.g:8307:1: rule__Mesh__Group_3_3__0 : rule__Mesh__Group_3_3__0__Impl rule__Mesh__Group_3_3__1 ;
    public final void rule__Mesh__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8311:1: ( rule__Mesh__Group_3_3__0__Impl rule__Mesh__Group_3_3__1 )
            // InternalKinematicsParser.g:8312:2: rule__Mesh__Group_3_3__0__Impl rule__Mesh__Group_3_3__1
            {
            pushFollow(FOLLOW_45);
            rule__Mesh__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_3_3__0"


    // $ANTLR start "rule__Mesh__Group_3_3__0__Impl"
    // InternalKinematicsParser.g:8319:1: rule__Mesh__Group_3_3__0__Impl : ( Comma ) ;
    public final void rule__Mesh__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8323:1: ( ( Comma ) )
            // InternalKinematicsParser.g:8324:1: ( Comma )
            {
            // InternalKinematicsParser.g:8324:1: ( Comma )
            // InternalKinematicsParser.g:8325:2: Comma
            {
             before(grammarAccess.getMeshAccess().getCommaKeyword_3_3_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_3_3__0__Impl"


    // $ANTLR start "rule__Mesh__Group_3_3__1"
    // InternalKinematicsParser.g:8334:1: rule__Mesh__Group_3_3__1 : rule__Mesh__Group_3_3__1__Impl ;
    public final void rule__Mesh__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8338:1: ( rule__Mesh__Group_3_3__1__Impl )
            // InternalKinematicsParser.g:8339:2: rule__Mesh__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_3_3__1"


    // $ANTLR start "rule__Mesh__Group_3_3__1__Impl"
    // InternalKinematicsParser.g:8345:1: rule__Mesh__Group_3_3__1__Impl : ( ( rule__Mesh__ScaleAssignment_3_3_1 ) ) ;
    public final void rule__Mesh__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8349:1: ( ( ( rule__Mesh__ScaleAssignment_3_3_1 ) ) )
            // InternalKinematicsParser.g:8350:1: ( ( rule__Mesh__ScaleAssignment_3_3_1 ) )
            {
            // InternalKinematicsParser.g:8350:1: ( ( rule__Mesh__ScaleAssignment_3_3_1 ) )
            // InternalKinematicsParser.g:8351:2: ( rule__Mesh__ScaleAssignment_3_3_1 )
            {
             before(grammarAccess.getMeshAccess().getScaleAssignment_3_3_1()); 
            // InternalKinematicsParser.g:8352:2: ( rule__Mesh__ScaleAssignment_3_3_1 )
            // InternalKinematicsParser.g:8352:3: rule__Mesh__ScaleAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__ScaleAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMeshAccess().getScaleAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_3_3__1__Impl"


    // $ANTLR start "rule__Component__NameAssignment_4"
    // InternalKinematicsParser.g:8361:1: rule__Component__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__Component__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8365:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:8366:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:8366:2: ( ruleEString )
            // InternalKinematicsParser.g:8367:3: ruleEString
            {
             before(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NameAssignment_4"


    // $ANTLR start "rule__Component__VersionAssignment_6"
    // InternalKinematicsParser.g:8376:1: rule__Component__VersionAssignment_6 : ( ruleEString ) ;
    public final void rule__Component__VersionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8380:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:8381:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:8381:2: ( ruleEString )
            // InternalKinematicsParser.g:8382:3: ruleEString
            {
             before(grammarAccess.getComponentAccess().getVersionEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getVersionEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__VersionAssignment_6"


    // $ANTLR start "rule__Component__CategoryAssignment_7_1"
    // InternalKinematicsParser.g:8391:1: rule__Component__CategoryAssignment_7_1 : ( RULE_CATEGORY ) ;
    public final void rule__Component__CategoryAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8395:1: ( ( RULE_CATEGORY ) )
            // InternalKinematicsParser.g:8396:2: ( RULE_CATEGORY )
            {
            // InternalKinematicsParser.g:8396:2: ( RULE_CATEGORY )
            // InternalKinematicsParser.g:8397:3: RULE_CATEGORY
            {
             before(grammarAccess.getComponentAccess().getCategoryCATEGORYTerminalRuleCall_7_1_0()); 
            match(input,RULE_CATEGORY,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getCategoryCATEGORYTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__CategoryAssignment_7_1"


    // $ANTLR start "rule__Component__GitRepoAssignment_8_1"
    // InternalKinematicsParser.g:8406:1: rule__Component__GitRepoAssignment_8_1 : ( ruleGitRepo ) ;
    public final void rule__Component__GitRepoAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8410:1: ( ( ruleGitRepo ) )
            // InternalKinematicsParser.g:8411:2: ( ruleGitRepo )
            {
            // InternalKinematicsParser.g:8411:2: ( ruleGitRepo )
            // InternalKinematicsParser.g:8412:3: ruleGitRepo
            {
             before(grammarAccess.getComponentAccess().getGitRepoGitRepoParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGitRepo();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getGitRepoGitRepoParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__GitRepoAssignment_8_1"


    // $ANTLR start "rule__Component__BaseAttachmentAssignment_9_0_1"
    // InternalKinematicsParser.g:8421:1: rule__Component__BaseAttachmentAssignment_9_0_1 : ( ruleBaseAttachment ) ;
    public final void rule__Component__BaseAttachmentAssignment_9_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8425:1: ( ( ruleBaseAttachment ) )
            // InternalKinematicsParser.g:8426:2: ( ruleBaseAttachment )
            {
            // InternalKinematicsParser.g:8426:2: ( ruleBaseAttachment )
            // InternalKinematicsParser.g:8427:3: ruleBaseAttachment
            {
             before(grammarAccess.getComponentAccess().getBaseAttachmentBaseAttachmentParserRuleCall_9_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseAttachment();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getBaseAttachmentBaseAttachmentParserRuleCall_9_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__BaseAttachmentAssignment_9_0_1"


    // $ANTLR start "rule__Component__BaseAttachmentAssignment_9_1"
    // InternalKinematicsParser.g:8436:1: rule__Component__BaseAttachmentAssignment_9_1 : ( ruleBaseAttachment ) ;
    public final void rule__Component__BaseAttachmentAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8440:1: ( ( ruleBaseAttachment ) )
            // InternalKinematicsParser.g:8441:2: ( ruleBaseAttachment )
            {
            // InternalKinematicsParser.g:8441:2: ( ruleBaseAttachment )
            // InternalKinematicsParser.g:8442:3: ruleBaseAttachment
            {
             before(grammarAccess.getComponentAccess().getBaseAttachmentBaseAttachmentParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseAttachment();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getBaseAttachmentBaseAttachmentParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__BaseAttachmentAssignment_9_1"


    // $ANTLR start "rule__Component__FlangeAttachmentAssignment_10_0_1"
    // InternalKinematicsParser.g:8451:1: rule__Component__FlangeAttachmentAssignment_10_0_1 : ( ruleFlangeAttachment ) ;
    public final void rule__Component__FlangeAttachmentAssignment_10_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8455:1: ( ( ruleFlangeAttachment ) )
            // InternalKinematicsParser.g:8456:2: ( ruleFlangeAttachment )
            {
            // InternalKinematicsParser.g:8456:2: ( ruleFlangeAttachment )
            // InternalKinematicsParser.g:8457:3: ruleFlangeAttachment
            {
             before(grammarAccess.getComponentAccess().getFlangeAttachmentFlangeAttachmentParserRuleCall_10_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFlangeAttachment();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getFlangeAttachmentFlangeAttachmentParserRuleCall_10_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__FlangeAttachmentAssignment_10_0_1"


    // $ANTLR start "rule__Component__FlangeAttachmentAssignment_10_1"
    // InternalKinematicsParser.g:8466:1: rule__Component__FlangeAttachmentAssignment_10_1 : ( ruleFlangeAttachment ) ;
    public final void rule__Component__FlangeAttachmentAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8470:1: ( ( ruleFlangeAttachment ) )
            // InternalKinematicsParser.g:8471:2: ( ruleFlangeAttachment )
            {
            // InternalKinematicsParser.g:8471:2: ( ruleFlangeAttachment )
            // InternalKinematicsParser.g:8472:3: ruleFlangeAttachment
            {
             before(grammarAccess.getComponentAccess().getFlangeAttachmentFlangeAttachmentParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFlangeAttachment();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getFlangeAttachmentFlangeAttachmentParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__FlangeAttachmentAssignment_10_1"


    // $ANTLR start "rule__Component__ComponentAssignment_11_0_1"
    // InternalKinematicsParser.g:8481:1: rule__Component__ComponentAssignment_11_0_1 : ( ruleConfiguredComponent ) ;
    public final void rule__Component__ComponentAssignment_11_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8485:1: ( ( ruleConfiguredComponent ) )
            // InternalKinematicsParser.g:8486:2: ( ruleConfiguredComponent )
            {
            // InternalKinematicsParser.g:8486:2: ( ruleConfiguredComponent )
            // InternalKinematicsParser.g:8487:3: ruleConfiguredComponent
            {
             before(grammarAccess.getComponentAccess().getComponentConfiguredComponentParserRuleCall_11_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConfiguredComponent();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getComponentConfiguredComponentParserRuleCall_11_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ComponentAssignment_11_0_1"


    // $ANTLR start "rule__Component__ComponentAssignment_11_1"
    // InternalKinematicsParser.g:8496:1: rule__Component__ComponentAssignment_11_1 : ( ruleConfiguredComponent ) ;
    public final void rule__Component__ComponentAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8500:1: ( ( ruleConfiguredComponent ) )
            // InternalKinematicsParser.g:8501:2: ( ruleConfiguredComponent )
            {
            // InternalKinematicsParser.g:8501:2: ( ruleConfiguredComponent )
            // InternalKinematicsParser.g:8502:3: ruleConfiguredComponent
            {
             before(grammarAccess.getComponentAccess().getComponentConfiguredComponentParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConfiguredComponent();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getComponentConfiguredComponentParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ComponentAssignment_11_1"


    // $ANTLR start "rule__Component__ConnectionAssignment_12_0_1"
    // InternalKinematicsParser.g:8511:1: rule__Component__ConnectionAssignment_12_0_1 : ( ruleConnection ) ;
    public final void rule__Component__ConnectionAssignment_12_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8515:1: ( ( ruleConnection ) )
            // InternalKinematicsParser.g:8516:2: ( ruleConnection )
            {
            // InternalKinematicsParser.g:8516:2: ( ruleConnection )
            // InternalKinematicsParser.g:8517:3: ruleConnection
            {
             before(grammarAccess.getComponentAccess().getConnectionConnectionParserRuleCall_12_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConnection();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getConnectionConnectionParserRuleCall_12_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ConnectionAssignment_12_0_1"


    // $ANTLR start "rule__Component__ConnectionAssignment_12_1"
    // InternalKinematicsParser.g:8526:1: rule__Component__ConnectionAssignment_12_1 : ( ruleConnection ) ;
    public final void rule__Component__ConnectionAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8530:1: ( ( ruleConnection ) )
            // InternalKinematicsParser.g:8531:2: ( ruleConnection )
            {
            // InternalKinematicsParser.g:8531:2: ( ruleConnection )
            // InternalKinematicsParser.g:8532:3: ruleConnection
            {
             before(grammarAccess.getComponentAccess().getConnectionConnectionParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConnection();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getConnectionConnectionParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ConnectionAssignment_12_1"


    // $ANTLR start "rule__Component__GroupAssignment_13_0_1"
    // InternalKinematicsParser.g:8541:1: rule__Component__GroupAssignment_13_0_1 : ( ruleGroup ) ;
    public final void rule__Component__GroupAssignment_13_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8545:1: ( ( ruleGroup ) )
            // InternalKinematicsParser.g:8546:2: ( ruleGroup )
            {
            // InternalKinematicsParser.g:8546:2: ( ruleGroup )
            // InternalKinematicsParser.g:8547:3: ruleGroup
            {
             before(grammarAccess.getComponentAccess().getGroupGroupParserRuleCall_13_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getGroupGroupParserRuleCall_13_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__GroupAssignment_13_0_1"


    // $ANTLR start "rule__Component__GroupAssignment_13_1"
    // InternalKinematicsParser.g:8556:1: rule__Component__GroupAssignment_13_1 : ( ruleGroup ) ;
    public final void rule__Component__GroupAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8560:1: ( ( ruleGroup ) )
            // InternalKinematicsParser.g:8561:2: ( ruleGroup )
            {
            // InternalKinematicsParser.g:8561:2: ( ruleGroup )
            // InternalKinematicsParser.g:8562:3: ruleGroup
            {
             before(grammarAccess.getComponentAccess().getGroupGroupParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getGroupGroupParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__GroupAssignment_13_1"


    // $ANTLR start "rule__Component__LinkAssignment_14_0_1"
    // InternalKinematicsParser.g:8571:1: rule__Component__LinkAssignment_14_0_1 : ( ruleLink ) ;
    public final void rule__Component__LinkAssignment_14_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8575:1: ( ( ruleLink ) )
            // InternalKinematicsParser.g:8576:2: ( ruleLink )
            {
            // InternalKinematicsParser.g:8576:2: ( ruleLink )
            // InternalKinematicsParser.g:8577:3: ruleLink
            {
             before(grammarAccess.getComponentAccess().getLinkLinkParserRuleCall_14_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getLinkLinkParserRuleCall_14_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__LinkAssignment_14_0_1"


    // $ANTLR start "rule__Component__LinkAssignment_14_1"
    // InternalKinematicsParser.g:8586:1: rule__Component__LinkAssignment_14_1 : ( ruleLink ) ;
    public final void rule__Component__LinkAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8590:1: ( ( ruleLink ) )
            // InternalKinematicsParser.g:8591:2: ( ruleLink )
            {
            // InternalKinematicsParser.g:8591:2: ( ruleLink )
            // InternalKinematicsParser.g:8592:3: ruleLink
            {
             before(grammarAccess.getComponentAccess().getLinkLinkParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getLinkLinkParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__LinkAssignment_14_1"


    // $ANTLR start "rule__Component__JointAssignment_15_0_1"
    // InternalKinematicsParser.g:8601:1: rule__Component__JointAssignment_15_0_1 : ( ruleJoint ) ;
    public final void rule__Component__JointAssignment_15_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8605:1: ( ( ruleJoint ) )
            // InternalKinematicsParser.g:8606:2: ( ruleJoint )
            {
            // InternalKinematicsParser.g:8606:2: ( ruleJoint )
            // InternalKinematicsParser.g:8607:3: ruleJoint
            {
             before(grammarAccess.getComponentAccess().getJointJointParserRuleCall_15_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getJointJointParserRuleCall_15_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__JointAssignment_15_0_1"


    // $ANTLR start "rule__Component__JointAssignment_15_1"
    // InternalKinematicsParser.g:8616:1: rule__Component__JointAssignment_15_1 : ( ruleJoint ) ;
    public final void rule__Component__JointAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8620:1: ( ( ruleJoint ) )
            // InternalKinematicsParser.g:8621:2: ( ruleJoint )
            {
            // InternalKinematicsParser.g:8621:2: ( ruleJoint )
            // InternalKinematicsParser.g:8622:3: ruleJoint
            {
             before(grammarAccess.getComponentAccess().getJointJointParserRuleCall_15_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getJointJointParserRuleCall_15_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__JointAssignment_15_1"


    // $ANTLR start "rule__ConfiguredComponent__NameAssignment_2"
    // InternalKinematicsParser.g:8631:1: rule__ConfiguredComponent__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ConfiguredComponent__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8635:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:8636:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:8636:2: ( ruleEString )
            // InternalKinematicsParser.g:8637:3: ruleEString
            {
             before(grammarAccess.getConfiguredComponentAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConfiguredComponentAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguredComponent__NameAssignment_2"


    // $ANTLR start "rule__ConfiguredComponent__TypeAssignment_5"
    // InternalKinematicsParser.g:8646:1: rule__ConfiguredComponent__TypeAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__ConfiguredComponent__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8650:1: ( ( ( ruleEString ) ) )
            // InternalKinematicsParser.g:8651:2: ( ( ruleEString ) )
            {
            // InternalKinematicsParser.g:8651:2: ( ( ruleEString ) )
            // InternalKinematicsParser.g:8652:3: ( ruleEString )
            {
             before(grammarAccess.getConfiguredComponentAccess().getTypeComponentCrossReference_5_0()); 
            // InternalKinematicsParser.g:8653:3: ( ruleEString )
            // InternalKinematicsParser.g:8654:4: ruleEString
            {
             before(grammarAccess.getConfiguredComponentAccess().getTypeComponentEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConfiguredComponentAccess().getTypeComponentEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getConfiguredComponentAccess().getTypeComponentCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguredComponent__TypeAssignment_5"


    // $ANTLR start "rule__ConfiguredComponent__PrefixAssignment_6_1"
    // InternalKinematicsParser.g:8665:1: rule__ConfiguredComponent__PrefixAssignment_6_1 : ( ruleEString ) ;
    public final void rule__ConfiguredComponent__PrefixAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8669:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:8670:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:8670:2: ( ruleEString )
            // InternalKinematicsParser.g:8671:3: ruleEString
            {
             before(grammarAccess.getConfiguredComponentAccess().getPrefixEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConfiguredComponentAccess().getPrefixEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfiguredComponent__PrefixAssignment_6_1"


    // $ANTLR start "rule__GitRepo__DistroAssignment_2"
    // InternalKinematicsParser.g:8680:1: rule__GitRepo__DistroAssignment_2 : ( ruleEString ) ;
    public final void rule__GitRepo__DistroAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8684:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:8685:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:8685:2: ( ruleEString )
            // InternalKinematicsParser.g:8686:3: ruleEString
            {
             before(grammarAccess.getGitRepoAccess().getDistroEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGitRepoAccess().getDistroEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__DistroAssignment_2"


    // $ANTLR start "rule__GitRepo__RepoAssignment_4"
    // InternalKinematicsParser.g:8695:1: rule__GitRepo__RepoAssignment_4 : ( ruleEString ) ;
    public final void rule__GitRepo__RepoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8699:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:8700:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:8700:2: ( ruleEString )
            // InternalKinematicsParser.g:8701:3: ruleEString
            {
             before(grammarAccess.getGitRepoAccess().getRepoEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGitRepoAccess().getRepoEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__RepoAssignment_4"


    // $ANTLR start "rule__GitRepo__BranchAssignment_6"
    // InternalKinematicsParser.g:8710:1: rule__GitRepo__BranchAssignment_6 : ( ruleEString ) ;
    public final void rule__GitRepo__BranchAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8714:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:8715:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:8715:2: ( ruleEString )
            // InternalKinematicsParser.g:8716:3: ruleEString
            {
             before(grammarAccess.getGitRepoAccess().getBranchEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGitRepoAccess().getBranchEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__BranchAssignment_6"


    // $ANTLR start "rule__GitRepo__PackageAssignment_8"
    // InternalKinematicsParser.g:8725:1: rule__GitRepo__PackageAssignment_8 : ( ruleEString ) ;
    public final void rule__GitRepo__PackageAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8729:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:8730:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:8730:2: ( ruleEString )
            // InternalKinematicsParser.g:8731:3: ruleEString
            {
             before(grammarAccess.getGitRepoAccess().getPackageEStringParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGitRepoAccess().getPackageEStringParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__PackageAssignment_8"


    // $ANTLR start "rule__GitRepo__VersionAssignment_10"
    // InternalKinematicsParser.g:8740:1: rule__GitRepo__VersionAssignment_10 : ( ruleEString ) ;
    public final void rule__GitRepo__VersionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8744:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:8745:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:8745:2: ( ruleEString )
            // InternalKinematicsParser.g:8746:3: ruleEString
            {
             before(grammarAccess.getGitRepoAccess().getVersionEStringParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGitRepoAccess().getVersionEStringParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitRepo__VersionAssignment_10"


    // $ANTLR start "rule__Group__NameAssignment_2"
    // InternalKinematicsParser.g:8755:1: rule__Group__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Group__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8759:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:8760:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:8760:2: ( ruleEString )
            // InternalKinematicsParser.g:8761:3: ruleEString
            {
             before(grammarAccess.getGroupAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__NameAssignment_2"


    // $ANTLR start "rule__Group__BaseLinkAssignment_5"
    // InternalKinematicsParser.g:8770:1: rule__Group__BaseLinkAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Group__BaseLinkAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8774:1: ( ( ( ruleEString ) ) )
            // InternalKinematicsParser.g:8775:2: ( ( ruleEString ) )
            {
            // InternalKinematicsParser.g:8775:2: ( ( ruleEString ) )
            // InternalKinematicsParser.g:8776:3: ( ruleEString )
            {
             before(grammarAccess.getGroupAccess().getBaseLinkLinkCrossReference_5_0()); 
            // InternalKinematicsParser.g:8777:3: ( ruleEString )
            // InternalKinematicsParser.g:8778:4: ruleEString
            {
             before(grammarAccess.getGroupAccess().getBaseLinkLinkEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getBaseLinkLinkEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getGroupAccess().getBaseLinkLinkCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__BaseLinkAssignment_5"


    // $ANTLR start "rule__Group__EndLinkAssignment_7"
    // InternalKinematicsParser.g:8789:1: rule__Group__EndLinkAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__Group__EndLinkAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8793:1: ( ( ( ruleEString ) ) )
            // InternalKinematicsParser.g:8794:2: ( ( ruleEString ) )
            {
            // InternalKinematicsParser.g:8794:2: ( ( ruleEString ) )
            // InternalKinematicsParser.g:8795:3: ( ruleEString )
            {
             before(grammarAccess.getGroupAccess().getEndLinkLinkCrossReference_7_0()); 
            // InternalKinematicsParser.g:8796:3: ( ruleEString )
            // InternalKinematicsParser.g:8797:4: ruleEString
            {
             before(grammarAccess.getGroupAccess().getEndLinkLinkEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getEndLinkLinkEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getGroupAccess().getEndLinkLinkCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__EndLinkAssignment_7"


    // $ANTLR start "rule__Group__Ros2_controlAssignment_8_1"
    // InternalKinematicsParser.g:8808:1: rule__Group__Ros2_controlAssignment_8_1 : ( ruleEString ) ;
    public final void rule__Group__Ros2_controlAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8812:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:8813:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:8813:2: ( ruleEString )
            // InternalKinematicsParser.g:8814:3: ruleEString
            {
             before(grammarAccess.getGroupAccess().getRos2_controlEStringParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getRos2_controlEStringParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Ros2_controlAssignment_8_1"


    // $ANTLR start "rule__BaseAttachment__NameAssignment_2"
    // InternalKinematicsParser.g:8823:1: rule__BaseAttachment__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BaseAttachment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8827:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:8828:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:8828:2: ( ruleEString )
            // InternalKinematicsParser.g:8829:3: ruleEString
            {
             before(grammarAccess.getBaseAttachmentAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBaseAttachmentAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseAttachment__NameAssignment_2"


    // $ANTLR start "rule__BaseAttachment__OriginAssignment_5"
    // InternalKinematicsParser.g:8838:1: rule__BaseAttachment__OriginAssignment_5 : ( rulePose ) ;
    public final void rule__BaseAttachment__OriginAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8842:1: ( ( rulePose ) )
            // InternalKinematicsParser.g:8843:2: ( rulePose )
            {
            // InternalKinematicsParser.g:8843:2: ( rulePose )
            // InternalKinematicsParser.g:8844:3: rulePose
            {
             before(grammarAccess.getBaseAttachmentAccess().getOriginPoseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePose();

            state._fsp--;

             after(grammarAccess.getBaseAttachmentAccess().getOriginPoseParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseAttachment__OriginAssignment_5"


    // $ANTLR start "rule__BaseAttachment__ParentAssignment_7"
    // InternalKinematicsParser.g:8853:1: rule__BaseAttachment__ParentAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__BaseAttachment__ParentAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8857:1: ( ( ( ruleEString ) ) )
            // InternalKinematicsParser.g:8858:2: ( ( ruleEString ) )
            {
            // InternalKinematicsParser.g:8858:2: ( ( ruleEString ) )
            // InternalKinematicsParser.g:8859:3: ( ruleEString )
            {
             before(grammarAccess.getBaseAttachmentAccess().getParentLinkCrossReference_7_0()); 
            // InternalKinematicsParser.g:8860:3: ( ruleEString )
            // InternalKinematicsParser.g:8861:4: ruleEString
            {
             before(grammarAccess.getBaseAttachmentAccess().getParentLinkEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBaseAttachmentAccess().getParentLinkEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getBaseAttachmentAccess().getParentLinkCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseAttachment__ParentAssignment_7"


    // $ANTLR start "rule__FlangeAttachment__NameAssignment_2"
    // InternalKinematicsParser.g:8872:1: rule__FlangeAttachment__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__FlangeAttachment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8876:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:8877:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:8877:2: ( ruleEString )
            // InternalKinematicsParser.g:8878:3: ruleEString
            {
             before(grammarAccess.getFlangeAttachmentAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFlangeAttachmentAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlangeAttachment__NameAssignment_2"


    // $ANTLR start "rule__FlangeAttachment__OriginAssignment_5"
    // InternalKinematicsParser.g:8887:1: rule__FlangeAttachment__OriginAssignment_5 : ( rulePose ) ;
    public final void rule__FlangeAttachment__OriginAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8891:1: ( ( rulePose ) )
            // InternalKinematicsParser.g:8892:2: ( rulePose )
            {
            // InternalKinematicsParser.g:8892:2: ( rulePose )
            // InternalKinematicsParser.g:8893:3: rulePose
            {
             before(grammarAccess.getFlangeAttachmentAccess().getOriginPoseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePose();

            state._fsp--;

             after(grammarAccess.getFlangeAttachmentAccess().getOriginPoseParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlangeAttachment__OriginAssignment_5"


    // $ANTLR start "rule__FlangeAttachment__ParentAssignment_7"
    // InternalKinematicsParser.g:8902:1: rule__FlangeAttachment__ParentAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__FlangeAttachment__ParentAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8906:1: ( ( ( ruleEString ) ) )
            // InternalKinematicsParser.g:8907:2: ( ( ruleEString ) )
            {
            // InternalKinematicsParser.g:8907:2: ( ( ruleEString ) )
            // InternalKinematicsParser.g:8908:3: ( ruleEString )
            {
             before(grammarAccess.getFlangeAttachmentAccess().getParentLinkCrossReference_7_0()); 
            // InternalKinematicsParser.g:8909:3: ( ruleEString )
            // InternalKinematicsParser.g:8910:4: ruleEString
            {
             before(grammarAccess.getFlangeAttachmentAccess().getParentLinkEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFlangeAttachmentAccess().getParentLinkEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getFlangeAttachmentAccess().getParentLinkCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlangeAttachment__ParentAssignment_7"


    // $ANTLR start "rule__Connection__NameAssignment_2"
    // InternalKinematicsParser.g:8921:1: rule__Connection__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Connection__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8925:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:8926:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:8926:2: ( ruleEString )
            // InternalKinematicsParser.g:8927:3: ruleEString
            {
             before(grammarAccess.getConnectionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__NameAssignment_2"


    // $ANTLR start "rule__Connection__BaseAttachmentAssignment_5"
    // InternalKinematicsParser.g:8936:1: rule__Connection__BaseAttachmentAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Connection__BaseAttachmentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8940:1: ( ( ( ruleEString ) ) )
            // InternalKinematicsParser.g:8941:2: ( ( ruleEString ) )
            {
            // InternalKinematicsParser.g:8941:2: ( ( ruleEString ) )
            // InternalKinematicsParser.g:8942:3: ( ruleEString )
            {
             before(grammarAccess.getConnectionAccess().getBaseAttachmentBaseAttachmentCrossReference_5_0()); 
            // InternalKinematicsParser.g:8943:3: ( ruleEString )
            // InternalKinematicsParser.g:8944:4: ruleEString
            {
             before(grammarAccess.getConnectionAccess().getBaseAttachmentBaseAttachmentEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getBaseAttachmentBaseAttachmentEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getConnectionAccess().getBaseAttachmentBaseAttachmentCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__BaseAttachmentAssignment_5"


    // $ANTLR start "rule__Connection__FlangeAttachmentAssignment_7"
    // InternalKinematicsParser.g:8955:1: rule__Connection__FlangeAttachmentAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__Connection__FlangeAttachmentAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8959:1: ( ( ( ruleEString ) ) )
            // InternalKinematicsParser.g:8960:2: ( ( ruleEString ) )
            {
            // InternalKinematicsParser.g:8960:2: ( ( ruleEString ) )
            // InternalKinematicsParser.g:8961:3: ( ruleEString )
            {
             before(grammarAccess.getConnectionAccess().getFlangeAttachmentFlangeAttachmentCrossReference_7_0()); 
            // InternalKinematicsParser.g:8962:3: ( ruleEString )
            // InternalKinematicsParser.g:8963:4: ruleEString
            {
             before(grammarAccess.getConnectionAccess().getFlangeAttachmentFlangeAttachmentEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getFlangeAttachmentFlangeAttachmentEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getConnectionAccess().getFlangeAttachmentFlangeAttachmentCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__FlangeAttachmentAssignment_7"


    // $ANTLR start "rule__Joint__NameAssignment_2"
    // InternalKinematicsParser.g:8974:1: rule__Joint__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Joint__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8978:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:8979:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:8979:2: ( ruleEString )
            // InternalKinematicsParser.g:8980:3: ruleEString
            {
             before(grammarAccess.getJointAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJointAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__NameAssignment_2"


    // $ANTLR start "rule__Joint__TypeAssignment_4_1"
    // InternalKinematicsParser.g:8989:1: rule__Joint__TypeAssignment_4_1 : ( RULE_JOINTTYPE ) ;
    public final void rule__Joint__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8993:1: ( ( RULE_JOINTTYPE ) )
            // InternalKinematicsParser.g:8994:2: ( RULE_JOINTTYPE )
            {
            // InternalKinematicsParser.g:8994:2: ( RULE_JOINTTYPE )
            // InternalKinematicsParser.g:8995:3: RULE_JOINTTYPE
            {
             before(grammarAccess.getJointAccess().getTypeJOINTTYPETerminalRuleCall_4_1_0()); 
            match(input,RULE_JOINTTYPE,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getTypeJOINTTYPETerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__TypeAssignment_4_1"


    // $ANTLR start "rule__Joint__ParentAssignment_5_1"
    // InternalKinematicsParser.g:9004:1: rule__Joint__ParentAssignment_5_1 : ( ruleParent ) ;
    public final void rule__Joint__ParentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9008:1: ( ( ruleParent ) )
            // InternalKinematicsParser.g:9009:2: ( ruleParent )
            {
            // InternalKinematicsParser.g:9009:2: ( ruleParent )
            // InternalKinematicsParser.g:9010:3: ruleParent
            {
             before(grammarAccess.getJointAccess().getParentParentParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParent();

            state._fsp--;

             after(grammarAccess.getJointAccess().getParentParentParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__ParentAssignment_5_1"


    // $ANTLR start "rule__Joint__ChildAssignment_6_1"
    // InternalKinematicsParser.g:9019:1: rule__Joint__ChildAssignment_6_1 : ( ruleChild ) ;
    public final void rule__Joint__ChildAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9023:1: ( ( ruleChild ) )
            // InternalKinematicsParser.g:9024:2: ( ruleChild )
            {
            // InternalKinematicsParser.g:9024:2: ( ruleChild )
            // InternalKinematicsParser.g:9025:3: ruleChild
            {
             before(grammarAccess.getJointAccess().getChildChildParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleChild();

            state._fsp--;

             after(grammarAccess.getJointAccess().getChildChildParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__ChildAssignment_6_1"


    // $ANTLR start "rule__Joint__OriginAssignment_7_1"
    // InternalKinematicsParser.g:9034:1: rule__Joint__OriginAssignment_7_1 : ( rulePose ) ;
    public final void rule__Joint__OriginAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9038:1: ( ( rulePose ) )
            // InternalKinematicsParser.g:9039:2: ( rulePose )
            {
            // InternalKinematicsParser.g:9039:2: ( rulePose )
            // InternalKinematicsParser.g:9040:3: rulePose
            {
             before(grammarAccess.getJointAccess().getOriginPoseParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            rulePose();

            state._fsp--;

             after(grammarAccess.getJointAccess().getOriginPoseParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__OriginAssignment_7_1"


    // $ANTLR start "rule__Joint__AxisAssignment_8_1"
    // InternalKinematicsParser.g:9049:1: rule__Joint__AxisAssignment_8_1 : ( ruleAxis ) ;
    public final void rule__Joint__AxisAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9053:1: ( ( ruleAxis ) )
            // InternalKinematicsParser.g:9054:2: ( ruleAxis )
            {
            // InternalKinematicsParser.g:9054:2: ( ruleAxis )
            // InternalKinematicsParser.g:9055:3: ruleAxis
            {
             before(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAxis();

            state._fsp--;

             after(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__AxisAssignment_8_1"


    // $ANTLR start "rule__Joint__LimitAssignment_9_1"
    // InternalKinematicsParser.g:9064:1: rule__Joint__LimitAssignment_9_1 : ( ruleLimit ) ;
    public final void rule__Joint__LimitAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9068:1: ( ( ruleLimit ) )
            // InternalKinematicsParser.g:9069:2: ( ruleLimit )
            {
            // InternalKinematicsParser.g:9069:2: ( ruleLimit )
            // InternalKinematicsParser.g:9070:3: ruleLimit
            {
             before(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLimit();

            state._fsp--;

             after(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__LimitAssignment_9_1"


    // $ANTLR start "rule__Parent__LinkAssignment_2"
    // InternalKinematicsParser.g:9079:1: rule__Parent__LinkAssignment_2 : ( ruleEString ) ;
    public final void rule__Parent__LinkAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9083:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:9084:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:9084:2: ( ruleEString )
            // InternalKinematicsParser.g:9085:3: ruleEString
            {
             before(grammarAccess.getParentAccess().getLinkEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParentAccess().getLinkEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parent__LinkAssignment_2"


    // $ANTLR start "rule__Child__LinkAssignment_2"
    // InternalKinematicsParser.g:9094:1: rule__Child__LinkAssignment_2 : ( ruleEString ) ;
    public final void rule__Child__LinkAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9098:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:9099:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:9099:2: ( ruleEString )
            // InternalKinematicsParser.g:9100:3: ruleEString
            {
             before(grammarAccess.getChildAccess().getLinkEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getChildAccess().getLinkEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Child__LinkAssignment_2"


    // $ANTLR start "rule__Link__NameAssignment_2"
    // InternalKinematicsParser.g:9109:1: rule__Link__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Link__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9113:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:9114:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:9114:2: ( ruleEString )
            // InternalKinematicsParser.g:9115:3: ruleEString
            {
             before(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__NameAssignment_2"


    // $ANTLR start "rule__Link__InertialAssignment_3_1_1"
    // InternalKinematicsParser.g:9124:1: rule__Link__InertialAssignment_3_1_1 : ( ruleInertial ) ;
    public final void rule__Link__InertialAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9128:1: ( ( ruleInertial ) )
            // InternalKinematicsParser.g:9129:2: ( ruleInertial )
            {
            // InternalKinematicsParser.g:9129:2: ( ruleInertial )
            // InternalKinematicsParser.g:9130:3: ruleInertial
            {
             before(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInertial();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__InertialAssignment_3_1_1"


    // $ANTLR start "rule__Link__VisualAssignment_3_2_1"
    // InternalKinematicsParser.g:9139:1: rule__Link__VisualAssignment_3_2_1 : ( ruleVisual ) ;
    public final void rule__Link__VisualAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9143:1: ( ( ruleVisual ) )
            // InternalKinematicsParser.g:9144:2: ( ruleVisual )
            {
            // InternalKinematicsParser.g:9144:2: ( ruleVisual )
            // InternalKinematicsParser.g:9145:3: ruleVisual
            {
             before(grammarAccess.getLinkAccess().getVisualVisualParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVisual();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getVisualVisualParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__VisualAssignment_3_2_1"


    // $ANTLR start "rule__Link__CollisionAssignment_3_3_1"
    // InternalKinematicsParser.g:9154:1: rule__Link__CollisionAssignment_3_3_1 : ( ruleCollision ) ;
    public final void rule__Link__CollisionAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9158:1: ( ( ruleCollision ) )
            // InternalKinematicsParser.g:9159:2: ( ruleCollision )
            {
            // InternalKinematicsParser.g:9159:2: ( ruleCollision )
            // InternalKinematicsParser.g:9160:3: ruleCollision
            {
             before(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCollision();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__CollisionAssignment_3_3_1"


    // $ANTLR start "rule__Pose__RpyAssignment_2_2"
    // InternalKinematicsParser.g:9169:1: rule__Pose__RpyAssignment_2_2 : ( RULE_DOUBLE ) ;
    public final void rule__Pose__RpyAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9173:1: ( ( RULE_DOUBLE ) )
            // InternalKinematicsParser.g:9174:2: ( RULE_DOUBLE )
            {
            // InternalKinematicsParser.g:9174:2: ( RULE_DOUBLE )
            // InternalKinematicsParser.g:9175:3: RULE_DOUBLE
            {
             before(grammarAccess.getPoseAccess().getRpyDOUBLETerminalRuleCall_2_2_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getRpyDOUBLETerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__RpyAssignment_2_2"


    // $ANTLR start "rule__Pose__RpyAssignment_2_3_1"
    // InternalKinematicsParser.g:9184:1: rule__Pose__RpyAssignment_2_3_1 : ( RULE_DOUBLE ) ;
    public final void rule__Pose__RpyAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9188:1: ( ( RULE_DOUBLE ) )
            // InternalKinematicsParser.g:9189:2: ( RULE_DOUBLE )
            {
            // InternalKinematicsParser.g:9189:2: ( RULE_DOUBLE )
            // InternalKinematicsParser.g:9190:3: RULE_DOUBLE
            {
             before(grammarAccess.getPoseAccess().getRpyDOUBLETerminalRuleCall_2_3_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getRpyDOUBLETerminalRuleCall_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__RpyAssignment_2_3_1"


    // $ANTLR start "rule__Pose__XyzAssignment_3_2"
    // InternalKinematicsParser.g:9199:1: rule__Pose__XyzAssignment_3_2 : ( RULE_DOUBLE ) ;
    public final void rule__Pose__XyzAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9203:1: ( ( RULE_DOUBLE ) )
            // InternalKinematicsParser.g:9204:2: ( RULE_DOUBLE )
            {
            // InternalKinematicsParser.g:9204:2: ( RULE_DOUBLE )
            // InternalKinematicsParser.g:9205:3: RULE_DOUBLE
            {
             before(grammarAccess.getPoseAccess().getXyzDOUBLETerminalRuleCall_3_2_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getXyzDOUBLETerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__XyzAssignment_3_2"


    // $ANTLR start "rule__Pose__XyzAssignment_3_3_1"
    // InternalKinematicsParser.g:9214:1: rule__Pose__XyzAssignment_3_3_1 : ( RULE_DOUBLE ) ;
    public final void rule__Pose__XyzAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9218:1: ( ( RULE_DOUBLE ) )
            // InternalKinematicsParser.g:9219:2: ( RULE_DOUBLE )
            {
            // InternalKinematicsParser.g:9219:2: ( RULE_DOUBLE )
            // InternalKinematicsParser.g:9220:3: RULE_DOUBLE
            {
             before(grammarAccess.getPoseAccess().getXyzDOUBLETerminalRuleCall_3_3_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getXyzDOUBLETerminalRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__XyzAssignment_3_3_1"


    // $ANTLR start "rule__Axis__XyzAssignment_2_1"
    // InternalKinematicsParser.g:9229:1: rule__Axis__XyzAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Axis__XyzAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9233:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:9234:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:9234:2: ( ruleEString )
            // InternalKinematicsParser.g:9235:3: ruleEString
            {
             before(grammarAccess.getAxisAccess().getXyzEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAxisAccess().getXyzEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__XyzAssignment_2_1"


    // $ANTLR start "rule__Limit__EffortAssignment_2_1"
    // InternalKinematicsParser.g:9244:1: rule__Limit__EffortAssignment_2_1 : ( RULE_DOUBLE ) ;
    public final void rule__Limit__EffortAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9248:1: ( ( RULE_DOUBLE ) )
            // InternalKinematicsParser.g:9249:2: ( RULE_DOUBLE )
            {
            // InternalKinematicsParser.g:9249:2: ( RULE_DOUBLE )
            // InternalKinematicsParser.g:9250:3: RULE_DOUBLE
            {
             before(grammarAccess.getLimitAccess().getEffortDOUBLETerminalRuleCall_2_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getEffortDOUBLETerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__EffortAssignment_2_1"


    // $ANTLR start "rule__Limit__LowerAssignment_3_1"
    // InternalKinematicsParser.g:9259:1: rule__Limit__LowerAssignment_3_1 : ( RULE_DOUBLE ) ;
    public final void rule__Limit__LowerAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9263:1: ( ( RULE_DOUBLE ) )
            // InternalKinematicsParser.g:9264:2: ( RULE_DOUBLE )
            {
            // InternalKinematicsParser.g:9264:2: ( RULE_DOUBLE )
            // InternalKinematicsParser.g:9265:3: RULE_DOUBLE
            {
             before(grammarAccess.getLimitAccess().getLowerDOUBLETerminalRuleCall_3_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getLowerDOUBLETerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__LowerAssignment_3_1"


    // $ANTLR start "rule__Limit__UpperAssignment_4_1"
    // InternalKinematicsParser.g:9274:1: rule__Limit__UpperAssignment_4_1 : ( RULE_DOUBLE ) ;
    public final void rule__Limit__UpperAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9278:1: ( ( RULE_DOUBLE ) )
            // InternalKinematicsParser.g:9279:2: ( RULE_DOUBLE )
            {
            // InternalKinematicsParser.g:9279:2: ( RULE_DOUBLE )
            // InternalKinematicsParser.g:9280:3: RULE_DOUBLE
            {
             before(grammarAccess.getLimitAccess().getUpperDOUBLETerminalRuleCall_4_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getUpperDOUBLETerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__UpperAssignment_4_1"


    // $ANTLR start "rule__Limit__VelocityAssignment_5_1"
    // InternalKinematicsParser.g:9289:1: rule__Limit__VelocityAssignment_5_1 : ( RULE_DOUBLE ) ;
    public final void rule__Limit__VelocityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9293:1: ( ( RULE_DOUBLE ) )
            // InternalKinematicsParser.g:9294:2: ( RULE_DOUBLE )
            {
            // InternalKinematicsParser.g:9294:2: ( RULE_DOUBLE )
            // InternalKinematicsParser.g:9295:3: RULE_DOUBLE
            {
             before(grammarAccess.getLimitAccess().getVelocityDOUBLETerminalRuleCall_5_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getVelocityDOUBLETerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__VelocityAssignment_5_1"


    // $ANTLR start "rule__Inertial__OriginAssignment_2_1"
    // InternalKinematicsParser.g:9304:1: rule__Inertial__OriginAssignment_2_1 : ( rulePose ) ;
    public final void rule__Inertial__OriginAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9308:1: ( ( rulePose ) )
            // InternalKinematicsParser.g:9309:2: ( rulePose )
            {
            // InternalKinematicsParser.g:9309:2: ( rulePose )
            // InternalKinematicsParser.g:9310:3: rulePose
            {
             before(grammarAccess.getInertialAccess().getOriginPoseParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePose();

            state._fsp--;

             after(grammarAccess.getInertialAccess().getOriginPoseParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__OriginAssignment_2_1"


    // $ANTLR start "rule__Inertial__MassAssignment_3_1"
    // InternalKinematicsParser.g:9319:1: rule__Inertial__MassAssignment_3_1 : ( ruleMass ) ;
    public final void rule__Inertial__MassAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9323:1: ( ( ruleMass ) )
            // InternalKinematicsParser.g:9324:2: ( ruleMass )
            {
            // InternalKinematicsParser.g:9324:2: ( ruleMass )
            // InternalKinematicsParser.g:9325:3: ruleMass
            {
             before(grammarAccess.getInertialAccess().getMassMassParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMass();

            state._fsp--;

             after(grammarAccess.getInertialAccess().getMassMassParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__MassAssignment_3_1"


    // $ANTLR start "rule__Inertial__InertiaAssignment_4_1"
    // InternalKinematicsParser.g:9334:1: rule__Inertial__InertiaAssignment_4_1 : ( ruleInertia ) ;
    public final void rule__Inertial__InertiaAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9338:1: ( ( ruleInertia ) )
            // InternalKinematicsParser.g:9339:2: ( ruleInertia )
            {
            // InternalKinematicsParser.g:9339:2: ( ruleInertia )
            // InternalKinematicsParser.g:9340:3: ruleInertia
            {
             before(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInertia();

            state._fsp--;

             after(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__InertiaAssignment_4_1"


    // $ANTLR start "rule__Visual__OriginAssignment_1_1"
    // InternalKinematicsParser.g:9349:1: rule__Visual__OriginAssignment_1_1 : ( rulePose ) ;
    public final void rule__Visual__OriginAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9353:1: ( ( rulePose ) )
            // InternalKinematicsParser.g:9354:2: ( rulePose )
            {
            // InternalKinematicsParser.g:9354:2: ( rulePose )
            // InternalKinematicsParser.g:9355:3: rulePose
            {
             before(grammarAccess.getVisualAccess().getOriginPoseParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePose();

            state._fsp--;

             after(grammarAccess.getVisualAccess().getOriginPoseParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__OriginAssignment_1_1"


    // $ANTLR start "rule__Visual__GeometryAssignment_3"
    // InternalKinematicsParser.g:9364:1: rule__Visual__GeometryAssignment_3 : ( ruleGeometry ) ;
    public final void rule__Visual__GeometryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9368:1: ( ( ruleGeometry ) )
            // InternalKinematicsParser.g:9369:2: ( ruleGeometry )
            {
            // InternalKinematicsParser.g:9369:2: ( ruleGeometry )
            // InternalKinematicsParser.g:9370:3: ruleGeometry
            {
             before(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGeometry();

            state._fsp--;

             after(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__GeometryAssignment_3"


    // $ANTLR start "rule__Collision__OriginAssignment_1_1"
    // InternalKinematicsParser.g:9379:1: rule__Collision__OriginAssignment_1_1 : ( rulePose ) ;
    public final void rule__Collision__OriginAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9383:1: ( ( rulePose ) )
            // InternalKinematicsParser.g:9384:2: ( rulePose )
            {
            // InternalKinematicsParser.g:9384:2: ( rulePose )
            // InternalKinematicsParser.g:9385:3: rulePose
            {
             before(grammarAccess.getCollisionAccess().getOriginPoseParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePose();

            state._fsp--;

             after(grammarAccess.getCollisionAccess().getOriginPoseParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__OriginAssignment_1_1"


    // $ANTLR start "rule__Collision__GeometryAssignment_3"
    // InternalKinematicsParser.g:9394:1: rule__Collision__GeometryAssignment_3 : ( ruleGeometry ) ;
    public final void rule__Collision__GeometryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9398:1: ( ( ruleGeometry ) )
            // InternalKinematicsParser.g:9399:2: ( ruleGeometry )
            {
            // InternalKinematicsParser.g:9399:2: ( ruleGeometry )
            // InternalKinematicsParser.g:9400:3: ruleGeometry
            {
             before(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGeometry();

            state._fsp--;

             after(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__GeometryAssignment_3"


    // $ANTLR start "rule__Mass__ValueAssignment_3"
    // InternalKinematicsParser.g:9409:1: rule__Mass__ValueAssignment_3 : ( RULE_DOUBLE ) ;
    public final void rule__Mass__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9413:1: ( ( RULE_DOUBLE ) )
            // InternalKinematicsParser.g:9414:2: ( RULE_DOUBLE )
            {
            // InternalKinematicsParser.g:9414:2: ( RULE_DOUBLE )
            // InternalKinematicsParser.g:9415:3: RULE_DOUBLE
            {
             before(grammarAccess.getMassAccess().getValueDOUBLETerminalRuleCall_3_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getValueDOUBLETerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__ValueAssignment_3"


    // $ANTLR start "rule__Inertia__IxxAssignment_2_1"
    // InternalKinematicsParser.g:9424:1: rule__Inertia__IxxAssignment_2_1 : ( RULE_DOUBLE ) ;
    public final void rule__Inertia__IxxAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9428:1: ( ( RULE_DOUBLE ) )
            // InternalKinematicsParser.g:9429:2: ( RULE_DOUBLE )
            {
            // InternalKinematicsParser.g:9429:2: ( RULE_DOUBLE )
            // InternalKinematicsParser.g:9430:3: RULE_DOUBLE
            {
             before(grammarAccess.getInertiaAccess().getIxxDOUBLETerminalRuleCall_2_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIxxDOUBLETerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IxxAssignment_2_1"


    // $ANTLR start "rule__Inertia__IxyAssignment_3_1"
    // InternalKinematicsParser.g:9439:1: rule__Inertia__IxyAssignment_3_1 : ( RULE_DOUBLE ) ;
    public final void rule__Inertia__IxyAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9443:1: ( ( RULE_DOUBLE ) )
            // InternalKinematicsParser.g:9444:2: ( RULE_DOUBLE )
            {
            // InternalKinematicsParser.g:9444:2: ( RULE_DOUBLE )
            // InternalKinematicsParser.g:9445:3: RULE_DOUBLE
            {
             before(grammarAccess.getInertiaAccess().getIxyDOUBLETerminalRuleCall_3_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIxyDOUBLETerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IxyAssignment_3_1"


    // $ANTLR start "rule__Inertia__IxzAssignment_4_1"
    // InternalKinematicsParser.g:9454:1: rule__Inertia__IxzAssignment_4_1 : ( RULE_DOUBLE ) ;
    public final void rule__Inertia__IxzAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9458:1: ( ( RULE_DOUBLE ) )
            // InternalKinematicsParser.g:9459:2: ( RULE_DOUBLE )
            {
            // InternalKinematicsParser.g:9459:2: ( RULE_DOUBLE )
            // InternalKinematicsParser.g:9460:3: RULE_DOUBLE
            {
             before(grammarAccess.getInertiaAccess().getIxzDOUBLETerminalRuleCall_4_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIxzDOUBLETerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IxzAssignment_4_1"


    // $ANTLR start "rule__Inertia__IyyAssignment_5_1"
    // InternalKinematicsParser.g:9469:1: rule__Inertia__IyyAssignment_5_1 : ( RULE_DOUBLE ) ;
    public final void rule__Inertia__IyyAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9473:1: ( ( RULE_DOUBLE ) )
            // InternalKinematicsParser.g:9474:2: ( RULE_DOUBLE )
            {
            // InternalKinematicsParser.g:9474:2: ( RULE_DOUBLE )
            // InternalKinematicsParser.g:9475:3: RULE_DOUBLE
            {
             before(grammarAccess.getInertiaAccess().getIyyDOUBLETerminalRuleCall_5_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIyyDOUBLETerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IyyAssignment_5_1"


    // $ANTLR start "rule__Inertia__IyzAssignment_6_1"
    // InternalKinematicsParser.g:9484:1: rule__Inertia__IyzAssignment_6_1 : ( RULE_DOUBLE ) ;
    public final void rule__Inertia__IyzAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9488:1: ( ( RULE_DOUBLE ) )
            // InternalKinematicsParser.g:9489:2: ( RULE_DOUBLE )
            {
            // InternalKinematicsParser.g:9489:2: ( RULE_DOUBLE )
            // InternalKinematicsParser.g:9490:3: RULE_DOUBLE
            {
             before(grammarAccess.getInertiaAccess().getIyzDOUBLETerminalRuleCall_6_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIyzDOUBLETerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IyzAssignment_6_1"


    // $ANTLR start "rule__Inertia__IzzAssignment_7_1"
    // InternalKinematicsParser.g:9499:1: rule__Inertia__IzzAssignment_7_1 : ( RULE_DOUBLE ) ;
    public final void rule__Inertia__IzzAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9503:1: ( ( RULE_DOUBLE ) )
            // InternalKinematicsParser.g:9504:2: ( RULE_DOUBLE )
            {
            // InternalKinematicsParser.g:9504:2: ( RULE_DOUBLE )
            // InternalKinematicsParser.g:9505:3: RULE_DOUBLE
            {
             before(grammarAccess.getInertiaAccess().getIzzDOUBLETerminalRuleCall_7_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIzzDOUBLETerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IzzAssignment_7_1"


    // $ANTLR start "rule__Geometry__BoxAssignment_2_1"
    // InternalKinematicsParser.g:9514:1: rule__Geometry__BoxAssignment_2_1 : ( ruleBox ) ;
    public final void rule__Geometry__BoxAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9518:1: ( ( ruleBox ) )
            // InternalKinematicsParser.g:9519:2: ( ruleBox )
            {
            // InternalKinematicsParser.g:9519:2: ( ruleBox )
            // InternalKinematicsParser.g:9520:3: ruleBox
            {
             before(grammarAccess.getGeometryAccess().getBoxBoxParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBox();

            state._fsp--;

             after(grammarAccess.getGeometryAccess().getBoxBoxParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__BoxAssignment_2_1"


    // $ANTLR start "rule__Geometry__CylinderAssignment_3_1"
    // InternalKinematicsParser.g:9529:1: rule__Geometry__CylinderAssignment_3_1 : ( ruleCylinder ) ;
    public final void rule__Geometry__CylinderAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9533:1: ( ( ruleCylinder ) )
            // InternalKinematicsParser.g:9534:2: ( ruleCylinder )
            {
            // InternalKinematicsParser.g:9534:2: ( ruleCylinder )
            // InternalKinematicsParser.g:9535:3: ruleCylinder
            {
             before(grammarAccess.getGeometryAccess().getCylinderCylinderParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCylinder();

            state._fsp--;

             after(grammarAccess.getGeometryAccess().getCylinderCylinderParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__CylinderAssignment_3_1"


    // $ANTLR start "rule__Geometry__SphereAssignment_4_1"
    // InternalKinematicsParser.g:9544:1: rule__Geometry__SphereAssignment_4_1 : ( ruleSphere ) ;
    public final void rule__Geometry__SphereAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9548:1: ( ( ruleSphere ) )
            // InternalKinematicsParser.g:9549:2: ( ruleSphere )
            {
            // InternalKinematicsParser.g:9549:2: ( ruleSphere )
            // InternalKinematicsParser.g:9550:3: ruleSphere
            {
             before(grammarAccess.getGeometryAccess().getSphereSphereParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSphere();

            state._fsp--;

             after(grammarAccess.getGeometryAccess().getSphereSphereParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__SphereAssignment_4_1"


    // $ANTLR start "rule__Geometry__MeshAssignment_5_1"
    // InternalKinematicsParser.g:9559:1: rule__Geometry__MeshAssignment_5_1 : ( ruleMesh ) ;
    public final void rule__Geometry__MeshAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9563:1: ( ( ruleMesh ) )
            // InternalKinematicsParser.g:9564:2: ( ruleMesh )
            {
            // InternalKinematicsParser.g:9564:2: ( ruleMesh )
            // InternalKinematicsParser.g:9565:3: ruleMesh
            {
             before(grammarAccess.getGeometryAccess().getMeshMeshParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMesh();

            state._fsp--;

             after(grammarAccess.getGeometryAccess().getMeshMeshParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__MeshAssignment_5_1"


    // $ANTLR start "rule__Box__SizeAssignment_3"
    // InternalKinematicsParser.g:9574:1: rule__Box__SizeAssignment_3 : ( ruleEString ) ;
    public final void rule__Box__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9578:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:9579:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:9579:2: ( ruleEString )
            // InternalKinematicsParser.g:9580:3: ruleEString
            {
             before(grammarAccess.getBoxAccess().getSizeEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getSizeEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__SizeAssignment_3"


    // $ANTLR start "rule__Cylinder__LengthAssignment_2"
    // InternalKinematicsParser.g:9589:1: rule__Cylinder__LengthAssignment_2 : ( ruleEString ) ;
    public final void rule__Cylinder__LengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9593:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:9594:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:9594:2: ( ruleEString )
            // InternalKinematicsParser.g:9595:3: ruleEString
            {
             before(grammarAccess.getCylinderAccess().getLengthEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCylinderAccess().getLengthEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__LengthAssignment_2"


    // $ANTLR start "rule__Cylinder__RadiusAssignment_4"
    // InternalKinematicsParser.g:9604:1: rule__Cylinder__RadiusAssignment_4 : ( ruleEString ) ;
    public final void rule__Cylinder__RadiusAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9608:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:9609:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:9609:2: ( ruleEString )
            // InternalKinematicsParser.g:9610:3: ruleEString
            {
             before(grammarAccess.getCylinderAccess().getRadiusEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCylinderAccess().getRadiusEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__RadiusAssignment_4"


    // $ANTLR start "rule__Sphere__RadiusAssignment_2"
    // InternalKinematicsParser.g:9619:1: rule__Sphere__RadiusAssignment_2 : ( ruleDouble0 ) ;
    public final void rule__Sphere__RadiusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9623:1: ( ( ruleDouble0 ) )
            // InternalKinematicsParser.g:9624:2: ( ruleDouble0 )
            {
            // InternalKinematicsParser.g:9624:2: ( ruleDouble0 )
            // InternalKinematicsParser.g:9625:3: ruleDouble0
            {
             before(grammarAccess.getSphereAccess().getRadiusDouble0ParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getSphereAccess().getRadiusDouble0ParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__RadiusAssignment_2"


    // $ANTLR start "rule__Mesh__FilenameAssignment_2"
    // InternalKinematicsParser.g:9634:1: rule__Mesh__FilenameAssignment_2 : ( ruleEString ) ;
    public final void rule__Mesh__FilenameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9638:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:9639:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:9639:2: ( ruleEString )
            // InternalKinematicsParser.g:9640:3: ruleEString
            {
             before(grammarAccess.getMeshAccess().getFilenameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMeshAccess().getFilenameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__FilenameAssignment_2"


    // $ANTLR start "rule__Mesh__ScaleAssignment_3_2"
    // InternalKinematicsParser.g:9649:1: rule__Mesh__ScaleAssignment_3_2 : ( RULE_DOUBLE ) ;
    public final void rule__Mesh__ScaleAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9653:1: ( ( RULE_DOUBLE ) )
            // InternalKinematicsParser.g:9654:2: ( RULE_DOUBLE )
            {
            // InternalKinematicsParser.g:9654:2: ( RULE_DOUBLE )
            // InternalKinematicsParser.g:9655:3: RULE_DOUBLE
            {
             before(grammarAccess.getMeshAccess().getScaleDOUBLETerminalRuleCall_3_2_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getScaleDOUBLETerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__ScaleAssignment_3_2"


    // $ANTLR start "rule__Mesh__ScaleAssignment_3_3_1"
    // InternalKinematicsParser.g:9664:1: rule__Mesh__ScaleAssignment_3_3_1 : ( RULE_DOUBLE ) ;
    public final void rule__Mesh__ScaleAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:9668:1: ( ( RULE_DOUBLE ) )
            // InternalKinematicsParser.g:9669:2: ( RULE_DOUBLE )
            {
            // InternalKinematicsParser.g:9669:2: ( RULE_DOUBLE )
            // InternalKinematicsParser.g:9670:3: RULE_DOUBLE
            {
             before(grammarAccess.getMeshAccess().getScaleDOUBLETerminalRuleCall_3_3_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getScaleDOUBLETerminalRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__ScaleAssignment_3_3_1"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String dfa_1s = "\31\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\55\1\uffff\1\111\1\43\1\5\1\105\1\70\2\74\1\33\2\101\1\111\2\72\1\106\1\101\1\71\1\101\1\106\1\uffff\2\72";
    static final String dfa_3s = "\1\106\1\uffff\1\55\1\uffff\1\111\2\106\1\105\1\106\2\74\1\33\2\101\1\111\2\75\1\106\1\101\1\106\1\101\1\106\1\uffff\2\75";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\2\22\uffff\1\1\2\uffff";
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

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1171:2: ( rule__Component__Alternatives_9 )?";
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

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()* loopback of 1521:2: ( rule__Component__BaseAttachmentAssignment_9_0_1 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0800040C00040AB0L,0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0800000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0800000000000022L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0800000000000012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0800000000000200L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0800000000000202L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0800000000000080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0800000000000082L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0800000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0800000400000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0800040000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0800040000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0800000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0800000800000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000021000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000080008100L,0x0000000000000040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0300000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x2400000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000000A001010000L,0x0000000000000040L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000080004080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x00FC000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0002100040001000L,0x0000000000000040L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000040L});

}