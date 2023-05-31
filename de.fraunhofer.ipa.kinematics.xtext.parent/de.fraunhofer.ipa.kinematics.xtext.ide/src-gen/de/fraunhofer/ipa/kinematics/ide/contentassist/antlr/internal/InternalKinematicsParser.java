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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("HyphenMinus", "'-'");
    		tokenNameToValue.put("DigitZero", "'0'");
    		tokenNameToValue.put("DigitOne", "'1'");
    		tokenNameToValue.put("DigitTwo", "'2'");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("Box", "'box:'");
    		tokenNameToValue.put("Ixx", "'ixx:'");
    		tokenNameToValue.put("Ixy", "'ixy:'");
    		tokenNameToValue.put("Ixz", "'ixz:'");
    		tokenNameToValue.put("Iyy", "'iyy:'");
    		tokenNameToValue.put("Iyz", "'iyz:'");
    		tokenNameToValue.put("Izz", "'izz:'");
    		tokenNameToValue.put("Rpy", "'rpy:'");
    		tokenNameToValue.put("Size", "'size'");
    		tokenNameToValue.put("Xyz", "'xyz:'");
    		tokenNameToValue.put("Axis", "'axis:'");
    		tokenNameToValue.put("Link", "'link:'");
    		tokenNameToValue.put("Mass", "'mass:'");
    		tokenNameToValue.put("Mesh", "'mesh:'");
    		tokenNameToValue.put("Name", "'name:'");
    		tokenNameToValue.put("Type", "'type:'");
    		tokenNameToValue.put("Value", "'value'");
    		tokenNameToValue.put("AnyURI", "'AnyURI'");
    		tokenNameToValue.put("Child", "'child:'");
    		tokenNameToValue.put("Joint", "'joint:'");
    		tokenNameToValue.put("Limit", "'limit:'");
    		tokenNameToValue.put("Lower", "'lower:'");
    		tokenNameToValue.put("Scale", "'scale:'");
    		tokenNameToValue.put("Upper", "'upper:'");
    		tokenNameToValue.put("Default", "'default'");
    		tokenNameToValue.put("Effort", "'effort:'");
    		tokenNameToValue.put("Length", "'length:'");
    		tokenNameToValue.put("Macros", "'macros:'");
    		tokenNameToValue.put("Origin", "'origin:'");
    		tokenNameToValue.put("Parent", "'parent:'");
    		tokenNameToValue.put("Radius", "'radius:'");
    		tokenNameToValue.put("Sphere", "'sphere:'");
    		tokenNameToValue.put("Visual", "'visual:'");
    		tokenNameToValue.put("Inertia", "'inertia:'");
    		tokenNameToValue.put("Cylinder", "'cylinder:'");
    		tokenNameToValue.put("Filename", "'filename:'");
    		tokenNameToValue.put("Geometry", "'geometry:'");
    		tokenNameToValue.put("Inertial", "'inertial:'");
    		tokenNameToValue.put("Velocity", "'velocity:'");
    		tokenNameToValue.put("Collision", "'collision:'");
    		tokenNameToValue.put("Parameters", "'parameters:'");
    		tokenNameToValue.put("Xacrorobot", "'xacrorobot:'");
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



    // $ANTLR start "entryRuleRobot"
    // InternalKinematicsParser.g:102:1: entryRuleRobot : ruleRobot EOF ;
    public final void entryRuleRobot() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:103:1: ( ruleRobot EOF )
            // InternalKinematicsParser.g:104:1: ruleRobot EOF
            {
             before(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            ruleRobot();

            state._fsp--;

             after(grammarAccess.getRobotRule()); 
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
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalKinematicsParser.g:111:1: ruleRobot : ( ( rule__Robot__Group__0 ) ) ;
    public final void ruleRobot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:115:2: ( ( ( rule__Robot__Group__0 ) ) )
            // InternalKinematicsParser.g:116:2: ( ( rule__Robot__Group__0 ) )
            {
            // InternalKinematicsParser.g:116:2: ( ( rule__Robot__Group__0 ) )
            // InternalKinematicsParser.g:117:3: ( rule__Robot__Group__0 )
            {
             before(grammarAccess.getRobotAccess().getGroup()); 
            // InternalKinematicsParser.g:118:3: ( rule__Robot__Group__0 )
            // InternalKinematicsParser.g:118:4: rule__Robot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleMacro"
    // InternalKinematicsParser.g:127:1: entryRuleMacro : ruleMacro EOF ;
    public final void entryRuleMacro() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:128:1: ( ruleMacro EOF )
            // InternalKinematicsParser.g:129:1: ruleMacro EOF
            {
             before(grammarAccess.getMacroRule()); 
            pushFollow(FOLLOW_1);
            ruleMacro();

            state._fsp--;

             after(grammarAccess.getMacroRule()); 
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
    // $ANTLR end "entryRuleMacro"


    // $ANTLR start "ruleMacro"
    // InternalKinematicsParser.g:136:1: ruleMacro : ( ( rule__Macro__Group__0 ) ) ;
    public final void ruleMacro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:140:2: ( ( ( rule__Macro__Group__0 ) ) )
            // InternalKinematicsParser.g:141:2: ( ( rule__Macro__Group__0 ) )
            {
            // InternalKinematicsParser.g:141:2: ( ( rule__Macro__Group__0 ) )
            // InternalKinematicsParser.g:142:3: ( rule__Macro__Group__0 )
            {
             before(grammarAccess.getMacroAccess().getGroup()); 
            // InternalKinematicsParser.g:143:3: ( rule__Macro__Group__0 )
            // InternalKinematicsParser.g:143:4: rule__Macro__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Macro__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMacroAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMacro"


    // $ANTLR start "entryRuleParameter"
    // InternalKinematicsParser.g:152:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:153:1: ( ruleParameter EOF )
            // InternalKinematicsParser.g:154:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalKinematicsParser.g:161:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:165:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalKinematicsParser.g:166:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalKinematicsParser.g:166:2: ( ( rule__Parameter__Group__0 ) )
            // InternalKinematicsParser.g:167:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalKinematicsParser.g:168:3: ( rule__Parameter__Group__0 )
            // InternalKinematicsParser.g:168:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleJoint"
    // InternalKinematicsParser.g:177:1: entryRuleJoint : ruleJoint EOF ;
    public final void entryRuleJoint() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:178:1: ( ruleJoint EOF )
            // InternalKinematicsParser.g:179:1: ruleJoint EOF
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
    // InternalKinematicsParser.g:186:1: ruleJoint : ( ( rule__Joint__Group__0 ) ) ;
    public final void ruleJoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:190:2: ( ( ( rule__Joint__Group__0 ) ) )
            // InternalKinematicsParser.g:191:2: ( ( rule__Joint__Group__0 ) )
            {
            // InternalKinematicsParser.g:191:2: ( ( rule__Joint__Group__0 ) )
            // InternalKinematicsParser.g:192:3: ( rule__Joint__Group__0 )
            {
             before(grammarAccess.getJointAccess().getGroup()); 
            // InternalKinematicsParser.g:193:3: ( rule__Joint__Group__0 )
            // InternalKinematicsParser.g:193:4: rule__Joint__Group__0
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


    // $ANTLR start "entryRuleLink"
    // InternalKinematicsParser.g:202:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:203:1: ( ruleLink EOF )
            // InternalKinematicsParser.g:204:1: ruleLink EOF
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
    // InternalKinematicsParser.g:211:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:215:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalKinematicsParser.g:216:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalKinematicsParser.g:216:2: ( ( rule__Link__Group__0 ) )
            // InternalKinematicsParser.g:217:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalKinematicsParser.g:218:3: ( rule__Link__Group__0 )
            // InternalKinematicsParser.g:218:4: rule__Link__Group__0
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
    // InternalKinematicsParser.g:227:1: entryRulePose : rulePose EOF ;
    public final void entryRulePose() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:228:1: ( rulePose EOF )
            // InternalKinematicsParser.g:229:1: rulePose EOF
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
    // InternalKinematicsParser.g:236:1: rulePose : ( ( rule__Pose__Group__0 ) ) ;
    public final void rulePose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:240:2: ( ( ( rule__Pose__Group__0 ) ) )
            // InternalKinematicsParser.g:241:2: ( ( rule__Pose__Group__0 ) )
            {
            // InternalKinematicsParser.g:241:2: ( ( rule__Pose__Group__0 ) )
            // InternalKinematicsParser.g:242:3: ( rule__Pose__Group__0 )
            {
             before(grammarAccess.getPoseAccess().getGroup()); 
            // InternalKinematicsParser.g:243:3: ( rule__Pose__Group__0 )
            // InternalKinematicsParser.g:243:4: rule__Pose__Group__0
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


    // $ANTLR start "entryRuleVector3"
    // InternalKinematicsParser.g:252:1: entryRuleVector3 : ruleVector3 EOF ;
    public final void entryRuleVector3() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:253:1: ( ruleVector3 EOF )
            // InternalKinematicsParser.g:254:1: ruleVector3 EOF
            {
             before(grammarAccess.getVector3Rule()); 
            pushFollow(FOLLOW_1);
            ruleVector3();

            state._fsp--;

             after(grammarAccess.getVector3Rule()); 
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
    // $ANTLR end "entryRuleVector3"


    // $ANTLR start "ruleVector3"
    // InternalKinematicsParser.g:261:1: ruleVector3 : ( ( rule__Vector3__Group__0 ) ) ;
    public final void ruleVector3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:265:2: ( ( ( rule__Vector3__Group__0 ) ) )
            // InternalKinematicsParser.g:266:2: ( ( rule__Vector3__Group__0 ) )
            {
            // InternalKinematicsParser.g:266:2: ( ( rule__Vector3__Group__0 ) )
            // InternalKinematicsParser.g:267:3: ( rule__Vector3__Group__0 )
            {
             before(grammarAccess.getVector3Access().getGroup()); 
            // InternalKinematicsParser.g:268:3: ( rule__Vector3__Group__0 )
            // InternalKinematicsParser.g:268:4: rule__Vector3__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Vector3__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVector3Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVector3"


    // $ANTLR start "entryRuleLimit"
    // InternalKinematicsParser.g:277:1: entryRuleLimit : ruleLimit EOF ;
    public final void entryRuleLimit() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:278:1: ( ruleLimit EOF )
            // InternalKinematicsParser.g:279:1: ruleLimit EOF
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
    // InternalKinematicsParser.g:286:1: ruleLimit : ( ( rule__Limit__Group__0 ) ) ;
    public final void ruleLimit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:290:2: ( ( ( rule__Limit__Group__0 ) ) )
            // InternalKinematicsParser.g:291:2: ( ( rule__Limit__Group__0 ) )
            {
            // InternalKinematicsParser.g:291:2: ( ( rule__Limit__Group__0 ) )
            // InternalKinematicsParser.g:292:3: ( rule__Limit__Group__0 )
            {
             before(grammarAccess.getLimitAccess().getGroup()); 
            // InternalKinematicsParser.g:293:3: ( rule__Limit__Group__0 )
            // InternalKinematicsParser.g:293:4: rule__Limit__Group__0
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
    // InternalKinematicsParser.g:302:1: entryRuleInertial : ruleInertial EOF ;
    public final void entryRuleInertial() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:303:1: ( ruleInertial EOF )
            // InternalKinematicsParser.g:304:1: ruleInertial EOF
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
    // InternalKinematicsParser.g:311:1: ruleInertial : ( ( rule__Inertial__Group__0 ) ) ;
    public final void ruleInertial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:315:2: ( ( ( rule__Inertial__Group__0 ) ) )
            // InternalKinematicsParser.g:316:2: ( ( rule__Inertial__Group__0 ) )
            {
            // InternalKinematicsParser.g:316:2: ( ( rule__Inertial__Group__0 ) )
            // InternalKinematicsParser.g:317:3: ( rule__Inertial__Group__0 )
            {
             before(grammarAccess.getInertialAccess().getGroup()); 
            // InternalKinematicsParser.g:318:3: ( rule__Inertial__Group__0 )
            // InternalKinematicsParser.g:318:4: rule__Inertial__Group__0
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
    // InternalKinematicsParser.g:327:1: entryRuleVisual : ruleVisual EOF ;
    public final void entryRuleVisual() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:328:1: ( ruleVisual EOF )
            // InternalKinematicsParser.g:329:1: ruleVisual EOF
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
    // InternalKinematicsParser.g:336:1: ruleVisual : ( ( rule__Visual__Group__0 ) ) ;
    public final void ruleVisual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:340:2: ( ( ( rule__Visual__Group__0 ) ) )
            // InternalKinematicsParser.g:341:2: ( ( rule__Visual__Group__0 ) )
            {
            // InternalKinematicsParser.g:341:2: ( ( rule__Visual__Group__0 ) )
            // InternalKinematicsParser.g:342:3: ( rule__Visual__Group__0 )
            {
             before(grammarAccess.getVisualAccess().getGroup()); 
            // InternalKinematicsParser.g:343:3: ( rule__Visual__Group__0 )
            // InternalKinematicsParser.g:343:4: rule__Visual__Group__0
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
    // InternalKinematicsParser.g:352:1: entryRuleCollision : ruleCollision EOF ;
    public final void entryRuleCollision() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:353:1: ( ruleCollision EOF )
            // InternalKinematicsParser.g:354:1: ruleCollision EOF
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
    // InternalKinematicsParser.g:361:1: ruleCollision : ( ( rule__Collision__Group__0 ) ) ;
    public final void ruleCollision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:365:2: ( ( ( rule__Collision__Group__0 ) ) )
            // InternalKinematicsParser.g:366:2: ( ( rule__Collision__Group__0 ) )
            {
            // InternalKinematicsParser.g:366:2: ( ( rule__Collision__Group__0 ) )
            // InternalKinematicsParser.g:367:3: ( rule__Collision__Group__0 )
            {
             before(grammarAccess.getCollisionAccess().getGroup()); 
            // InternalKinematicsParser.g:368:3: ( rule__Collision__Group__0 )
            // InternalKinematicsParser.g:368:4: rule__Collision__Group__0
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
    // InternalKinematicsParser.g:377:1: entryRuleMass : ruleMass EOF ;
    public final void entryRuleMass() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:378:1: ( ruleMass EOF )
            // InternalKinematicsParser.g:379:1: ruleMass EOF
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
    // InternalKinematicsParser.g:386:1: ruleMass : ( ( rule__Mass__Group__0 ) ) ;
    public final void ruleMass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:390:2: ( ( ( rule__Mass__Group__0 ) ) )
            // InternalKinematicsParser.g:391:2: ( ( rule__Mass__Group__0 ) )
            {
            // InternalKinematicsParser.g:391:2: ( ( rule__Mass__Group__0 ) )
            // InternalKinematicsParser.g:392:3: ( rule__Mass__Group__0 )
            {
             before(grammarAccess.getMassAccess().getGroup()); 
            // InternalKinematicsParser.g:393:3: ( rule__Mass__Group__0 )
            // InternalKinematicsParser.g:393:4: rule__Mass__Group__0
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
    // InternalKinematicsParser.g:402:1: entryRuleInertia : ruleInertia EOF ;
    public final void entryRuleInertia() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:403:1: ( ruleInertia EOF )
            // InternalKinematicsParser.g:404:1: ruleInertia EOF
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
    // InternalKinematicsParser.g:411:1: ruleInertia : ( ( rule__Inertia__Group__0 ) ) ;
    public final void ruleInertia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:415:2: ( ( ( rule__Inertia__Group__0 ) ) )
            // InternalKinematicsParser.g:416:2: ( ( rule__Inertia__Group__0 ) )
            {
            // InternalKinematicsParser.g:416:2: ( ( rule__Inertia__Group__0 ) )
            // InternalKinematicsParser.g:417:3: ( rule__Inertia__Group__0 )
            {
             before(grammarAccess.getInertiaAccess().getGroup()); 
            // InternalKinematicsParser.g:418:3: ( rule__Inertia__Group__0 )
            // InternalKinematicsParser.g:418:4: rule__Inertia__Group__0
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
    // InternalKinematicsParser.g:427:1: entryRuleGeometry : ruleGeometry EOF ;
    public final void entryRuleGeometry() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:428:1: ( ruleGeometry EOF )
            // InternalKinematicsParser.g:429:1: ruleGeometry EOF
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
    // InternalKinematicsParser.g:436:1: ruleGeometry : ( ( rule__Geometry__Group__0 ) ) ;
    public final void ruleGeometry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:440:2: ( ( ( rule__Geometry__Group__0 ) ) )
            // InternalKinematicsParser.g:441:2: ( ( rule__Geometry__Group__0 ) )
            {
            // InternalKinematicsParser.g:441:2: ( ( rule__Geometry__Group__0 ) )
            // InternalKinematicsParser.g:442:3: ( rule__Geometry__Group__0 )
            {
             before(grammarAccess.getGeometryAccess().getGroup()); 
            // InternalKinematicsParser.g:443:3: ( rule__Geometry__Group__0 )
            // InternalKinematicsParser.g:443:4: rule__Geometry__Group__0
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
    // InternalKinematicsParser.g:452:1: entryRuleBox : ruleBox EOF ;
    public final void entryRuleBox() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:453:1: ( ruleBox EOF )
            // InternalKinematicsParser.g:454:1: ruleBox EOF
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
    // InternalKinematicsParser.g:461:1: ruleBox : ( ( rule__Box__Group__0 ) ) ;
    public final void ruleBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:465:2: ( ( ( rule__Box__Group__0 ) ) )
            // InternalKinematicsParser.g:466:2: ( ( rule__Box__Group__0 ) )
            {
            // InternalKinematicsParser.g:466:2: ( ( rule__Box__Group__0 ) )
            // InternalKinematicsParser.g:467:3: ( rule__Box__Group__0 )
            {
             before(grammarAccess.getBoxAccess().getGroup()); 
            // InternalKinematicsParser.g:468:3: ( rule__Box__Group__0 )
            // InternalKinematicsParser.g:468:4: rule__Box__Group__0
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
    // InternalKinematicsParser.g:477:1: entryRuleCylinder : ruleCylinder EOF ;
    public final void entryRuleCylinder() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:478:1: ( ruleCylinder EOF )
            // InternalKinematicsParser.g:479:1: ruleCylinder EOF
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
    // InternalKinematicsParser.g:486:1: ruleCylinder : ( ( rule__Cylinder__Group__0 ) ) ;
    public final void ruleCylinder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:490:2: ( ( ( rule__Cylinder__Group__0 ) ) )
            // InternalKinematicsParser.g:491:2: ( ( rule__Cylinder__Group__0 ) )
            {
            // InternalKinematicsParser.g:491:2: ( ( rule__Cylinder__Group__0 ) )
            // InternalKinematicsParser.g:492:3: ( rule__Cylinder__Group__0 )
            {
             before(grammarAccess.getCylinderAccess().getGroup()); 
            // InternalKinematicsParser.g:493:3: ( rule__Cylinder__Group__0 )
            // InternalKinematicsParser.g:493:4: rule__Cylinder__Group__0
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
    // InternalKinematicsParser.g:502:1: entryRuleSphere : ruleSphere EOF ;
    public final void entryRuleSphere() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:503:1: ( ruleSphere EOF )
            // InternalKinematicsParser.g:504:1: ruleSphere EOF
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
    // InternalKinematicsParser.g:511:1: ruleSphere : ( ( rule__Sphere__Group__0 ) ) ;
    public final void ruleSphere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:515:2: ( ( ( rule__Sphere__Group__0 ) ) )
            // InternalKinematicsParser.g:516:2: ( ( rule__Sphere__Group__0 ) )
            {
            // InternalKinematicsParser.g:516:2: ( ( rule__Sphere__Group__0 ) )
            // InternalKinematicsParser.g:517:3: ( rule__Sphere__Group__0 )
            {
             before(grammarAccess.getSphereAccess().getGroup()); 
            // InternalKinematicsParser.g:518:3: ( rule__Sphere__Group__0 )
            // InternalKinematicsParser.g:518:4: rule__Sphere__Group__0
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
    // InternalKinematicsParser.g:527:1: entryRuleMesh : ruleMesh EOF ;
    public final void entryRuleMesh() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:528:1: ( ruleMesh EOF )
            // InternalKinematicsParser.g:529:1: ruleMesh EOF
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
    // InternalKinematicsParser.g:536:1: ruleMesh : ( ( rule__Mesh__Group__0 ) ) ;
    public final void ruleMesh() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:540:2: ( ( ( rule__Mesh__Group__0 ) ) )
            // InternalKinematicsParser.g:541:2: ( ( rule__Mesh__Group__0 ) )
            {
            // InternalKinematicsParser.g:541:2: ( ( rule__Mesh__Group__0 ) )
            // InternalKinematicsParser.g:542:3: ( rule__Mesh__Group__0 )
            {
             before(grammarAccess.getMeshAccess().getGroup()); 
            // InternalKinematicsParser.g:543:3: ( rule__Mesh__Group__0 )
            // InternalKinematicsParser.g:543:4: rule__Mesh__Group__0
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
    // InternalKinematicsParser.g:552:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:553:1: ( ruleEString EOF )
            // InternalKinematicsParser.g:554:1: ruleEString EOF
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
    // InternalKinematicsParser.g:561:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:565:2: ( ( RULE_STRING ) )
            // InternalKinematicsParser.g:566:2: ( RULE_STRING )
            {
            // InternalKinematicsParser.g:566:2: ( RULE_STRING )
            // InternalKinematicsParser.g:567:3: RULE_STRING
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
    // InternalKinematicsParser.g:577:1: entryRuleDouble0 : ruleDouble0 EOF ;
    public final void entryRuleDouble0() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:578:1: ( ruleDouble0 EOF )
            // InternalKinematicsParser.g:579:1: ruleDouble0 EOF
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
    // InternalKinematicsParser.g:586:1: ruleDouble0 : ( RULE_DOUBLE ) ;
    public final void ruleDouble0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:590:2: ( ( RULE_DOUBLE ) )
            // InternalKinematicsParser.g:591:2: ( RULE_DOUBLE )
            {
            // InternalKinematicsParser.g:591:2: ( RULE_DOUBLE )
            // InternalKinematicsParser.g:592:3: RULE_DOUBLE
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


    // $ANTLR start "ruleParameterType"
    // InternalKinematicsParser.g:602:1: ruleParameterType : ( ( rule__ParameterType__Alternatives ) ) ;
    public final void ruleParameterType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:606:1: ( ( ( rule__ParameterType__Alternatives ) ) )
            // InternalKinematicsParser.g:607:2: ( ( rule__ParameterType__Alternatives ) )
            {
            // InternalKinematicsParser.g:607:2: ( ( rule__ParameterType__Alternatives ) )
            // InternalKinematicsParser.g:608:3: ( rule__ParameterType__Alternatives )
            {
             before(grammarAccess.getParameterTypeAccess().getAlternatives()); 
            // InternalKinematicsParser.g:609:3: ( rule__ParameterType__Alternatives )
            // InternalKinematicsParser.g:609:4: rule__ParameterType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ParameterType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "rule__ParameterType__Alternatives"
    // InternalKinematicsParser.g:617:1: rule__ParameterType__Alternatives : ( ( ( DigitZero ) ) | ( ( DigitOne ) ) | ( ( DigitTwo ) ) );
    public final void rule__ParameterType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:621:1: ( ( ( DigitZero ) ) | ( ( DigitOne ) ) | ( ( DigitTwo ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case DigitZero:
                {
                alt1=1;
                }
                break;
            case DigitOne:
                {
                alt1=2;
                }
                break;
            case DigitTwo:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalKinematicsParser.g:622:2: ( ( DigitZero ) )
                    {
                    // InternalKinematicsParser.g:622:2: ( ( DigitZero ) )
                    // InternalKinematicsParser.g:623:3: ( DigitZero )
                    {
                     before(grammarAccess.getParameterTypeAccess().getLinkEnumLiteralDeclaration_0()); 
                    // InternalKinematicsParser.g:624:3: ( DigitZero )
                    // InternalKinematicsParser.g:624:4: DigitZero
                    {
                    match(input,DigitZero,FOLLOW_2); 

                    }

                     after(grammarAccess.getParameterTypeAccess().getLinkEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKinematicsParser.g:628:2: ( ( DigitOne ) )
                    {
                    // InternalKinematicsParser.g:628:2: ( ( DigitOne ) )
                    // InternalKinematicsParser.g:629:3: ( DigitOne )
                    {
                     before(grammarAccess.getParameterTypeAccess().getStringEnumLiteralDeclaration_1()); 
                    // InternalKinematicsParser.g:630:3: ( DigitOne )
                    // InternalKinematicsParser.g:630:4: DigitOne
                    {
                    match(input,DigitOne,FOLLOW_2); 

                    }

                     after(grammarAccess.getParameterTypeAccess().getStringEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKinematicsParser.g:634:2: ( ( DigitTwo ) )
                    {
                    // InternalKinematicsParser.g:634:2: ( ( DigitTwo ) )
                    // InternalKinematicsParser.g:635:3: ( DigitTwo )
                    {
                     before(grammarAccess.getParameterTypeAccess().getPoseEnumLiteralDeclaration_2()); 
                    // InternalKinematicsParser.g:636:3: ( DigitTwo )
                    // InternalKinematicsParser.g:636:4: DigitTwo
                    {
                    match(input,DigitTwo,FOLLOW_2); 

                    }

                     after(grammarAccess.getParameterTypeAccess().getPoseEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__ParameterType__Alternatives"


    // $ANTLR start "rule__Robot__Group__0"
    // InternalKinematicsParser.g:644:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:648:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalKinematicsParser.g:649:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Robot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__0"


    // $ANTLR start "rule__Robot__Group__0__Impl"
    // InternalKinematicsParser.g:656:1: rule__Robot__Group__0__Impl : ( () ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:660:1: ( ( () ) )
            // InternalKinematicsParser.g:661:1: ( () )
            {
            // InternalKinematicsParser.g:661:1: ( () )
            // InternalKinematicsParser.g:662:2: ()
            {
             before(grammarAccess.getRobotAccess().getXacroRobotAction_0()); 
            // InternalKinematicsParser.g:663:2: ()
            // InternalKinematicsParser.g:663:3: 
            {
            }

             after(grammarAccess.getRobotAccess().getXacroRobotAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__0__Impl"


    // $ANTLR start "rule__Robot__Group__1"
    // InternalKinematicsParser.g:671:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:675:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalKinematicsParser.g:676:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Robot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__1"


    // $ANTLR start "rule__Robot__Group__1__Impl"
    // InternalKinematicsParser.g:683:1: rule__Robot__Group__1__Impl : ( Xacrorobot ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:687:1: ( ( Xacrorobot ) )
            // InternalKinematicsParser.g:688:1: ( Xacrorobot )
            {
            // InternalKinematicsParser.g:688:1: ( Xacrorobot )
            // InternalKinematicsParser.g:689:2: Xacrorobot
            {
             before(grammarAccess.getRobotAccess().getXacrorobotKeyword_1()); 
            match(input,Xacrorobot,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getXacrorobotKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__1__Impl"


    // $ANTLR start "rule__Robot__Group__2"
    // InternalKinematicsParser.g:698:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl rule__Robot__Group__3 ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:702:1: ( rule__Robot__Group__2__Impl rule__Robot__Group__3 )
            // InternalKinematicsParser.g:703:2: rule__Robot__Group__2__Impl rule__Robot__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Robot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__2"


    // $ANTLR start "rule__Robot__Group__2__Impl"
    // InternalKinematicsParser.g:710:1: rule__Robot__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:714:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:715:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:715:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:716:2: RULE_BEGIN
            {
             before(grammarAccess.getRobotAccess().getBEGINTerminalRuleCall_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getBEGINTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__2__Impl"


    // $ANTLR start "rule__Robot__Group__3"
    // InternalKinematicsParser.g:725:1: rule__Robot__Group__3 : rule__Robot__Group__3__Impl rule__Robot__Group__4 ;
    public final void rule__Robot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:729:1: ( rule__Robot__Group__3__Impl rule__Robot__Group__4 )
            // InternalKinematicsParser.g:730:2: rule__Robot__Group__3__Impl rule__Robot__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Robot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__3"


    // $ANTLR start "rule__Robot__Group__3__Impl"
    // InternalKinematicsParser.g:737:1: rule__Robot__Group__3__Impl : ( Name ) ;
    public final void rule__Robot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:741:1: ( ( Name ) )
            // InternalKinematicsParser.g:742:1: ( Name )
            {
            // InternalKinematicsParser.g:742:1: ( Name )
            // InternalKinematicsParser.g:743:2: Name
            {
             before(grammarAccess.getRobotAccess().getNameKeyword_3()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__3__Impl"


    // $ANTLR start "rule__Robot__Group__4"
    // InternalKinematicsParser.g:752:1: rule__Robot__Group__4 : rule__Robot__Group__4__Impl rule__Robot__Group__5 ;
    public final void rule__Robot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:756:1: ( rule__Robot__Group__4__Impl rule__Robot__Group__5 )
            // InternalKinematicsParser.g:757:2: rule__Robot__Group__4__Impl rule__Robot__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Robot__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__4"


    // $ANTLR start "rule__Robot__Group__4__Impl"
    // InternalKinematicsParser.g:764:1: rule__Robot__Group__4__Impl : ( ( rule__Robot__NameAssignment_4 ) ) ;
    public final void rule__Robot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:768:1: ( ( ( rule__Robot__NameAssignment_4 ) ) )
            // InternalKinematicsParser.g:769:1: ( ( rule__Robot__NameAssignment_4 ) )
            {
            // InternalKinematicsParser.g:769:1: ( ( rule__Robot__NameAssignment_4 ) )
            // InternalKinematicsParser.g:770:2: ( rule__Robot__NameAssignment_4 )
            {
             before(grammarAccess.getRobotAccess().getNameAssignment_4()); 
            // InternalKinematicsParser.g:771:2: ( rule__Robot__NameAssignment_4 )
            // InternalKinematicsParser.g:771:3: rule__Robot__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Robot__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__4__Impl"


    // $ANTLR start "rule__Robot__Group__5"
    // InternalKinematicsParser.g:779:1: rule__Robot__Group__5 : rule__Robot__Group__5__Impl rule__Robot__Group__6 ;
    public final void rule__Robot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:783:1: ( rule__Robot__Group__5__Impl rule__Robot__Group__6 )
            // InternalKinematicsParser.g:784:2: rule__Robot__Group__5__Impl rule__Robot__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Robot__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__5"


    // $ANTLR start "rule__Robot__Group__5__Impl"
    // InternalKinematicsParser.g:791:1: rule__Robot__Group__5__Impl : ( ( rule__Robot__Group_5__0 )? ) ;
    public final void rule__Robot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:795:1: ( ( ( rule__Robot__Group_5__0 )? ) )
            // InternalKinematicsParser.g:796:1: ( ( rule__Robot__Group_5__0 )? )
            {
            // InternalKinematicsParser.g:796:1: ( ( rule__Robot__Group_5__0 )? )
            // InternalKinematicsParser.g:797:2: ( rule__Robot__Group_5__0 )?
            {
             before(grammarAccess.getRobotAccess().getGroup_5()); 
            // InternalKinematicsParser.g:798:2: ( rule__Robot__Group_5__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Macros) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKinematicsParser.g:798:3: rule__Robot__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Robot__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRobotAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__5__Impl"


    // $ANTLR start "rule__Robot__Group__6"
    // InternalKinematicsParser.g:806:1: rule__Robot__Group__6 : rule__Robot__Group__6__Impl ;
    public final void rule__Robot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:810:1: ( rule__Robot__Group__6__Impl )
            // InternalKinematicsParser.g:811:2: rule__Robot__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__6"


    // $ANTLR start "rule__Robot__Group__6__Impl"
    // InternalKinematicsParser.g:817:1: rule__Robot__Group__6__Impl : ( RULE_END ) ;
    public final void rule__Robot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:821:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:822:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:822:1: ( RULE_END )
            // InternalKinematicsParser.g:823:2: RULE_END
            {
             before(grammarAccess.getRobotAccess().getENDTerminalRuleCall_6()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getENDTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__6__Impl"


    // $ANTLR start "rule__Robot__Group_5__0"
    // InternalKinematicsParser.g:833:1: rule__Robot__Group_5__0 : rule__Robot__Group_5__0__Impl rule__Robot__Group_5__1 ;
    public final void rule__Robot__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:837:1: ( rule__Robot__Group_5__0__Impl rule__Robot__Group_5__1 )
            // InternalKinematicsParser.g:838:2: rule__Robot__Group_5__0__Impl rule__Robot__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Robot__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_5__0"


    // $ANTLR start "rule__Robot__Group_5__0__Impl"
    // InternalKinematicsParser.g:845:1: rule__Robot__Group_5__0__Impl : ( Macros ) ;
    public final void rule__Robot__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:849:1: ( ( Macros ) )
            // InternalKinematicsParser.g:850:1: ( Macros )
            {
            // InternalKinematicsParser.g:850:1: ( Macros )
            // InternalKinematicsParser.g:851:2: Macros
            {
             before(grammarAccess.getRobotAccess().getMacrosKeyword_5_0()); 
            match(input,Macros,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getMacrosKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_5__0__Impl"


    // $ANTLR start "rule__Robot__Group_5__1"
    // InternalKinematicsParser.g:860:1: rule__Robot__Group_5__1 : rule__Robot__Group_5__1__Impl ;
    public final void rule__Robot__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:864:1: ( rule__Robot__Group_5__1__Impl )
            // InternalKinematicsParser.g:865:2: rule__Robot__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_5__1"


    // $ANTLR start "rule__Robot__Group_5__1__Impl"
    // InternalKinematicsParser.g:871:1: rule__Robot__Group_5__1__Impl : ( ( rule__Robot__MacrosAssignment_5_1 )* ) ;
    public final void rule__Robot__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:875:1: ( ( ( rule__Robot__MacrosAssignment_5_1 )* ) )
            // InternalKinematicsParser.g:876:1: ( ( rule__Robot__MacrosAssignment_5_1 )* )
            {
            // InternalKinematicsParser.g:876:1: ( ( rule__Robot__MacrosAssignment_5_1 )* )
            // InternalKinematicsParser.g:877:2: ( rule__Robot__MacrosAssignment_5_1 )*
            {
             before(grammarAccess.getRobotAccess().getMacrosAssignment_5_1()); 
            // InternalKinematicsParser.g:878:2: ( rule__Robot__MacrosAssignment_5_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==HyphenMinus) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKinematicsParser.g:878:3: rule__Robot__MacrosAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Robot__MacrosAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getRobotAccess().getMacrosAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_5__1__Impl"


    // $ANTLR start "rule__Macro__Group__0"
    // InternalKinematicsParser.g:887:1: rule__Macro__Group__0 : rule__Macro__Group__0__Impl rule__Macro__Group__1 ;
    public final void rule__Macro__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:891:1: ( rule__Macro__Group__0__Impl rule__Macro__Group__1 )
            // InternalKinematicsParser.g:892:2: rule__Macro__Group__0__Impl rule__Macro__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Macro__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Macro__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group__0"


    // $ANTLR start "rule__Macro__Group__0__Impl"
    // InternalKinematicsParser.g:899:1: rule__Macro__Group__0__Impl : ( HyphenMinus ) ;
    public final void rule__Macro__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:903:1: ( ( HyphenMinus ) )
            // InternalKinematicsParser.g:904:1: ( HyphenMinus )
            {
            // InternalKinematicsParser.g:904:1: ( HyphenMinus )
            // InternalKinematicsParser.g:905:2: HyphenMinus
            {
             before(grammarAccess.getMacroAccess().getHyphenMinusKeyword_0()); 
            match(input,HyphenMinus,FOLLOW_2); 
             after(grammarAccess.getMacroAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group__0__Impl"


    // $ANTLR start "rule__Macro__Group__1"
    // InternalKinematicsParser.g:914:1: rule__Macro__Group__1 : rule__Macro__Group__1__Impl rule__Macro__Group__2 ;
    public final void rule__Macro__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:918:1: ( rule__Macro__Group__1__Impl rule__Macro__Group__2 )
            // InternalKinematicsParser.g:919:2: rule__Macro__Group__1__Impl rule__Macro__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Macro__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Macro__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group__1"


    // $ANTLR start "rule__Macro__Group__1__Impl"
    // InternalKinematicsParser.g:926:1: rule__Macro__Group__1__Impl : ( Name ) ;
    public final void rule__Macro__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:930:1: ( ( Name ) )
            // InternalKinematicsParser.g:931:1: ( Name )
            {
            // InternalKinematicsParser.g:931:1: ( Name )
            // InternalKinematicsParser.g:932:2: Name
            {
             before(grammarAccess.getMacroAccess().getNameKeyword_1()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getMacroAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group__1__Impl"


    // $ANTLR start "rule__Macro__Group__2"
    // InternalKinematicsParser.g:941:1: rule__Macro__Group__2 : rule__Macro__Group__2__Impl rule__Macro__Group__3 ;
    public final void rule__Macro__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:945:1: ( rule__Macro__Group__2__Impl rule__Macro__Group__3 )
            // InternalKinematicsParser.g:946:2: rule__Macro__Group__2__Impl rule__Macro__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Macro__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Macro__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group__2"


    // $ANTLR start "rule__Macro__Group__2__Impl"
    // InternalKinematicsParser.g:953:1: rule__Macro__Group__2__Impl : ( ( rule__Macro__NameAssignment_2 ) ) ;
    public final void rule__Macro__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:957:1: ( ( ( rule__Macro__NameAssignment_2 ) ) )
            // InternalKinematicsParser.g:958:1: ( ( rule__Macro__NameAssignment_2 ) )
            {
            // InternalKinematicsParser.g:958:1: ( ( rule__Macro__NameAssignment_2 ) )
            // InternalKinematicsParser.g:959:2: ( rule__Macro__NameAssignment_2 )
            {
             before(grammarAccess.getMacroAccess().getNameAssignment_2()); 
            // InternalKinematicsParser.g:960:2: ( rule__Macro__NameAssignment_2 )
            // InternalKinematicsParser.g:960:3: rule__Macro__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Macro__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMacroAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group__2__Impl"


    // $ANTLR start "rule__Macro__Group__3"
    // InternalKinematicsParser.g:968:1: rule__Macro__Group__3 : rule__Macro__Group__3__Impl rule__Macro__Group__4 ;
    public final void rule__Macro__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:972:1: ( rule__Macro__Group__3__Impl rule__Macro__Group__4 )
            // InternalKinematicsParser.g:973:2: rule__Macro__Group__3__Impl rule__Macro__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Macro__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Macro__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group__3"


    // $ANTLR start "rule__Macro__Group__3__Impl"
    // InternalKinematicsParser.g:980:1: rule__Macro__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__Macro__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:984:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:985:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:985:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:986:2: RULE_BEGIN
            {
             before(grammarAccess.getMacroAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getMacroAccess().getBEGINTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group__3__Impl"


    // $ANTLR start "rule__Macro__Group__4"
    // InternalKinematicsParser.g:995:1: rule__Macro__Group__4 : rule__Macro__Group__4__Impl rule__Macro__Group__5 ;
    public final void rule__Macro__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:999:1: ( rule__Macro__Group__4__Impl rule__Macro__Group__5 )
            // InternalKinematicsParser.g:1000:2: rule__Macro__Group__4__Impl rule__Macro__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Macro__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Macro__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group__4"


    // $ANTLR start "rule__Macro__Group__4__Impl"
    // InternalKinematicsParser.g:1007:1: rule__Macro__Group__4__Impl : ( ( rule__Macro__Group_4__0 )? ) ;
    public final void rule__Macro__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1011:1: ( ( ( rule__Macro__Group_4__0 )? ) )
            // InternalKinematicsParser.g:1012:1: ( ( rule__Macro__Group_4__0 )? )
            {
            // InternalKinematicsParser.g:1012:1: ( ( rule__Macro__Group_4__0 )? )
            // InternalKinematicsParser.g:1013:2: ( rule__Macro__Group_4__0 )?
            {
             before(grammarAccess.getMacroAccess().getGroup_4()); 
            // InternalKinematicsParser.g:1014:2: ( rule__Macro__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Parameters) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalKinematicsParser.g:1014:3: rule__Macro__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Macro__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMacroAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group__4__Impl"


    // $ANTLR start "rule__Macro__Group__5"
    // InternalKinematicsParser.g:1022:1: rule__Macro__Group__5 : rule__Macro__Group__5__Impl rule__Macro__Group__6 ;
    public final void rule__Macro__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1026:1: ( rule__Macro__Group__5__Impl rule__Macro__Group__6 )
            // InternalKinematicsParser.g:1027:2: rule__Macro__Group__5__Impl rule__Macro__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Macro__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Macro__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group__5"


    // $ANTLR start "rule__Macro__Group__5__Impl"
    // InternalKinematicsParser.g:1034:1: rule__Macro__Group__5__Impl : ( ( rule__Macro__Group_5__0 )? ) ;
    public final void rule__Macro__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1038:1: ( ( ( rule__Macro__Group_5__0 )? ) )
            // InternalKinematicsParser.g:1039:1: ( ( rule__Macro__Group_5__0 )? )
            {
            // InternalKinematicsParser.g:1039:1: ( ( rule__Macro__Group_5__0 )? )
            // InternalKinematicsParser.g:1040:2: ( rule__Macro__Group_5__0 )?
            {
             before(grammarAccess.getMacroAccess().getGroup_5()); 
            // InternalKinematicsParser.g:1041:2: ( rule__Macro__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Link) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKinematicsParser.g:1041:3: rule__Macro__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Macro__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMacroAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group__5__Impl"


    // $ANTLR start "rule__Macro__Group__6"
    // InternalKinematicsParser.g:1049:1: rule__Macro__Group__6 : rule__Macro__Group__6__Impl rule__Macro__Group__7 ;
    public final void rule__Macro__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1053:1: ( rule__Macro__Group__6__Impl rule__Macro__Group__7 )
            // InternalKinematicsParser.g:1054:2: rule__Macro__Group__6__Impl rule__Macro__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Macro__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Macro__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group__6"


    // $ANTLR start "rule__Macro__Group__6__Impl"
    // InternalKinematicsParser.g:1061:1: rule__Macro__Group__6__Impl : ( ( rule__Macro__Group_6__0 )? ) ;
    public final void rule__Macro__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1065:1: ( ( ( rule__Macro__Group_6__0 )? ) )
            // InternalKinematicsParser.g:1066:1: ( ( rule__Macro__Group_6__0 )? )
            {
            // InternalKinematicsParser.g:1066:1: ( ( rule__Macro__Group_6__0 )? )
            // InternalKinematicsParser.g:1067:2: ( rule__Macro__Group_6__0 )?
            {
             before(grammarAccess.getMacroAccess().getGroup_6()); 
            // InternalKinematicsParser.g:1068:2: ( rule__Macro__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Joint) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKinematicsParser.g:1068:3: rule__Macro__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Macro__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMacroAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group__6__Impl"


    // $ANTLR start "rule__Macro__Group__7"
    // InternalKinematicsParser.g:1076:1: rule__Macro__Group__7 : rule__Macro__Group__7__Impl ;
    public final void rule__Macro__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1080:1: ( rule__Macro__Group__7__Impl )
            // InternalKinematicsParser.g:1081:2: rule__Macro__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Macro__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group__7"


    // $ANTLR start "rule__Macro__Group__7__Impl"
    // InternalKinematicsParser.g:1087:1: rule__Macro__Group__7__Impl : ( RULE_END ) ;
    public final void rule__Macro__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1091:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:1092:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:1092:1: ( RULE_END )
            // InternalKinematicsParser.g:1093:2: RULE_END
            {
             before(grammarAccess.getMacroAccess().getENDTerminalRuleCall_7()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getMacroAccess().getENDTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group__7__Impl"


    // $ANTLR start "rule__Macro__Group_4__0"
    // InternalKinematicsParser.g:1103:1: rule__Macro__Group_4__0 : rule__Macro__Group_4__0__Impl rule__Macro__Group_4__1 ;
    public final void rule__Macro__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1107:1: ( rule__Macro__Group_4__0__Impl rule__Macro__Group_4__1 )
            // InternalKinematicsParser.g:1108:2: rule__Macro__Group_4__0__Impl rule__Macro__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Macro__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Macro__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group_4__0"


    // $ANTLR start "rule__Macro__Group_4__0__Impl"
    // InternalKinematicsParser.g:1115:1: rule__Macro__Group_4__0__Impl : ( Parameters ) ;
    public final void rule__Macro__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1119:1: ( ( Parameters ) )
            // InternalKinematicsParser.g:1120:1: ( Parameters )
            {
            // InternalKinematicsParser.g:1120:1: ( Parameters )
            // InternalKinematicsParser.g:1121:2: Parameters
            {
             before(grammarAccess.getMacroAccess().getParametersKeyword_4_0()); 
            match(input,Parameters,FOLLOW_2); 
             after(grammarAccess.getMacroAccess().getParametersKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group_4__0__Impl"


    // $ANTLR start "rule__Macro__Group_4__1"
    // InternalKinematicsParser.g:1130:1: rule__Macro__Group_4__1 : rule__Macro__Group_4__1__Impl ;
    public final void rule__Macro__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1134:1: ( rule__Macro__Group_4__1__Impl )
            // InternalKinematicsParser.g:1135:2: rule__Macro__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Macro__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group_4__1"


    // $ANTLR start "rule__Macro__Group_4__1__Impl"
    // InternalKinematicsParser.g:1141:1: rule__Macro__Group_4__1__Impl : ( ( rule__Macro__ParametersAssignment_4_1 )* ) ;
    public final void rule__Macro__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1145:1: ( ( ( rule__Macro__ParametersAssignment_4_1 )* ) )
            // InternalKinematicsParser.g:1146:1: ( ( rule__Macro__ParametersAssignment_4_1 )* )
            {
            // InternalKinematicsParser.g:1146:1: ( ( rule__Macro__ParametersAssignment_4_1 )* )
            // InternalKinematicsParser.g:1147:2: ( rule__Macro__ParametersAssignment_4_1 )*
            {
             before(grammarAccess.getMacroAccess().getParametersAssignment_4_1()); 
            // InternalKinematicsParser.g:1148:2: ( rule__Macro__ParametersAssignment_4_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==HyphenMinus) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKinematicsParser.g:1148:3: rule__Macro__ParametersAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Macro__ParametersAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getMacroAccess().getParametersAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group_4__1__Impl"


    // $ANTLR start "rule__Macro__Group_5__0"
    // InternalKinematicsParser.g:1157:1: rule__Macro__Group_5__0 : rule__Macro__Group_5__0__Impl rule__Macro__Group_5__1 ;
    public final void rule__Macro__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1161:1: ( rule__Macro__Group_5__0__Impl rule__Macro__Group_5__1 )
            // InternalKinematicsParser.g:1162:2: rule__Macro__Group_5__0__Impl rule__Macro__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Macro__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Macro__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group_5__0"


    // $ANTLR start "rule__Macro__Group_5__0__Impl"
    // InternalKinematicsParser.g:1169:1: rule__Macro__Group_5__0__Impl : ( Link ) ;
    public final void rule__Macro__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1173:1: ( ( Link ) )
            // InternalKinematicsParser.g:1174:1: ( Link )
            {
            // InternalKinematicsParser.g:1174:1: ( Link )
            // InternalKinematicsParser.g:1175:2: Link
            {
             before(grammarAccess.getMacroAccess().getLinkKeyword_5_0()); 
            match(input,Link,FOLLOW_2); 
             after(grammarAccess.getMacroAccess().getLinkKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group_5__0__Impl"


    // $ANTLR start "rule__Macro__Group_5__1"
    // InternalKinematicsParser.g:1184:1: rule__Macro__Group_5__1 : rule__Macro__Group_5__1__Impl ;
    public final void rule__Macro__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1188:1: ( rule__Macro__Group_5__1__Impl )
            // InternalKinematicsParser.g:1189:2: rule__Macro__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Macro__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group_5__1"


    // $ANTLR start "rule__Macro__Group_5__1__Impl"
    // InternalKinematicsParser.g:1195:1: rule__Macro__Group_5__1__Impl : ( ( rule__Macro__LinkAssignment_5_1 )* ) ;
    public final void rule__Macro__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1199:1: ( ( ( rule__Macro__LinkAssignment_5_1 )* ) )
            // InternalKinematicsParser.g:1200:1: ( ( rule__Macro__LinkAssignment_5_1 )* )
            {
            // InternalKinematicsParser.g:1200:1: ( ( rule__Macro__LinkAssignment_5_1 )* )
            // InternalKinematicsParser.g:1201:2: ( rule__Macro__LinkAssignment_5_1 )*
            {
             before(grammarAccess.getMacroAccess().getLinkAssignment_5_1()); 
            // InternalKinematicsParser.g:1202:2: ( rule__Macro__LinkAssignment_5_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==HyphenMinus) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKinematicsParser.g:1202:3: rule__Macro__LinkAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Macro__LinkAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMacroAccess().getLinkAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group_5__1__Impl"


    // $ANTLR start "rule__Macro__Group_6__0"
    // InternalKinematicsParser.g:1211:1: rule__Macro__Group_6__0 : rule__Macro__Group_6__0__Impl rule__Macro__Group_6__1 ;
    public final void rule__Macro__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1215:1: ( rule__Macro__Group_6__0__Impl rule__Macro__Group_6__1 )
            // InternalKinematicsParser.g:1216:2: rule__Macro__Group_6__0__Impl rule__Macro__Group_6__1
            {
            pushFollow(FOLLOW_8);
            rule__Macro__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Macro__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group_6__0"


    // $ANTLR start "rule__Macro__Group_6__0__Impl"
    // InternalKinematicsParser.g:1223:1: rule__Macro__Group_6__0__Impl : ( Joint ) ;
    public final void rule__Macro__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1227:1: ( ( Joint ) )
            // InternalKinematicsParser.g:1228:1: ( Joint )
            {
            // InternalKinematicsParser.g:1228:1: ( Joint )
            // InternalKinematicsParser.g:1229:2: Joint
            {
             before(grammarAccess.getMacroAccess().getJointKeyword_6_0()); 
            match(input,Joint,FOLLOW_2); 
             after(grammarAccess.getMacroAccess().getJointKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group_6__0__Impl"


    // $ANTLR start "rule__Macro__Group_6__1"
    // InternalKinematicsParser.g:1238:1: rule__Macro__Group_6__1 : rule__Macro__Group_6__1__Impl ;
    public final void rule__Macro__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1242:1: ( rule__Macro__Group_6__1__Impl )
            // InternalKinematicsParser.g:1243:2: rule__Macro__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Macro__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group_6__1"


    // $ANTLR start "rule__Macro__Group_6__1__Impl"
    // InternalKinematicsParser.g:1249:1: rule__Macro__Group_6__1__Impl : ( ( rule__Macro__JointAssignment_6_1 )* ) ;
    public final void rule__Macro__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1253:1: ( ( ( rule__Macro__JointAssignment_6_1 )* ) )
            // InternalKinematicsParser.g:1254:1: ( ( rule__Macro__JointAssignment_6_1 )* )
            {
            // InternalKinematicsParser.g:1254:1: ( ( rule__Macro__JointAssignment_6_1 )* )
            // InternalKinematicsParser.g:1255:2: ( rule__Macro__JointAssignment_6_1 )*
            {
             before(grammarAccess.getMacroAccess().getJointAssignment_6_1()); 
            // InternalKinematicsParser.g:1256:2: ( rule__Macro__JointAssignment_6_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==HyphenMinus) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKinematicsParser.g:1256:3: rule__Macro__JointAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Macro__JointAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getMacroAccess().getJointAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group_6__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalKinematicsParser.g:1265:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1269:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalKinematicsParser.g:1270:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalKinematicsParser.g:1277:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1281:1: ( ( () ) )
            // InternalKinematicsParser.g:1282:1: ( () )
            {
            // InternalKinematicsParser.g:1282:1: ( () )
            // InternalKinematicsParser.g:1283:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalKinematicsParser.g:1284:2: ()
            // InternalKinematicsParser.g:1284:3: 
            {
            }

             after(grammarAccess.getParameterAccess().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalKinematicsParser.g:1292:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1296:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalKinematicsParser.g:1297:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalKinematicsParser.g:1304:1: rule__Parameter__Group__1__Impl : ( HyphenMinus ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1308:1: ( ( HyphenMinus ) )
            // InternalKinematicsParser.g:1309:1: ( HyphenMinus )
            {
            // InternalKinematicsParser.g:1309:1: ( HyphenMinus )
            // InternalKinematicsParser.g:1310:2: HyphenMinus
            {
             before(grammarAccess.getParameterAccess().getHyphenMinusKeyword_1()); 
            match(input,HyphenMinus,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalKinematicsParser.g:1319:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1323:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalKinematicsParser.g:1324:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalKinematicsParser.g:1331:1: rule__Parameter__Group__2__Impl : ( Name ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1335:1: ( ( Name ) )
            // InternalKinematicsParser.g:1336:1: ( Name )
            {
            // InternalKinematicsParser.g:1336:1: ( Name )
            // InternalKinematicsParser.g:1337:2: Name
            {
             before(grammarAccess.getParameterAccess().getNameKeyword_2()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalKinematicsParser.g:1346:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1350:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalKinematicsParser.g:1351:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Parameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalKinematicsParser.g:1358:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__NameAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1362:1: ( ( ( rule__Parameter__NameAssignment_3 ) ) )
            // InternalKinematicsParser.g:1363:1: ( ( rule__Parameter__NameAssignment_3 ) )
            {
            // InternalKinematicsParser.g:1363:1: ( ( rule__Parameter__NameAssignment_3 ) )
            // InternalKinematicsParser.g:1364:2: ( rule__Parameter__NameAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_3()); 
            // InternalKinematicsParser.g:1365:2: ( rule__Parameter__NameAssignment_3 )
            // InternalKinematicsParser.g:1365:3: rule__Parameter__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group__4"
    // InternalKinematicsParser.g:1373:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1377:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // InternalKinematicsParser.g:1378:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Parameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4"


    // $ANTLR start "rule__Parameter__Group__4__Impl"
    // InternalKinematicsParser.g:1385:1: rule__Parameter__Group__4__Impl : ( RULE_BEGIN ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1389:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:1390:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:1390:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:1391:2: RULE_BEGIN
            {
             before(grammarAccess.getParameterAccess().getBEGINTerminalRuleCall_4()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getBEGINTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4__Impl"


    // $ANTLR start "rule__Parameter__Group__5"
    // InternalKinematicsParser.g:1400:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl rule__Parameter__Group__6 ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1404:1: ( rule__Parameter__Group__5__Impl rule__Parameter__Group__6 )
            // InternalKinematicsParser.g:1405:2: rule__Parameter__Group__5__Impl rule__Parameter__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Parameter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__5"


    // $ANTLR start "rule__Parameter__Group__5__Impl"
    // InternalKinematicsParser.g:1412:1: rule__Parameter__Group__5__Impl : ( Type ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1416:1: ( ( Type ) )
            // InternalKinematicsParser.g:1417:1: ( Type )
            {
            // InternalKinematicsParser.g:1417:1: ( Type )
            // InternalKinematicsParser.g:1418:2: Type
            {
             before(grammarAccess.getParameterAccess().getTypeKeyword_5()); 
            match(input,Type,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getTypeKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__5__Impl"


    // $ANTLR start "rule__Parameter__Group__6"
    // InternalKinematicsParser.g:1427:1: rule__Parameter__Group__6 : rule__Parameter__Group__6__Impl rule__Parameter__Group__7 ;
    public final void rule__Parameter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1431:1: ( rule__Parameter__Group__6__Impl rule__Parameter__Group__7 )
            // InternalKinematicsParser.g:1432:2: rule__Parameter__Group__6__Impl rule__Parameter__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Parameter__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__6"


    // $ANTLR start "rule__Parameter__Group__6__Impl"
    // InternalKinematicsParser.g:1439:1: rule__Parameter__Group__6__Impl : ( ( rule__Parameter__TypeAssignment_6 ) ) ;
    public final void rule__Parameter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1443:1: ( ( ( rule__Parameter__TypeAssignment_6 ) ) )
            // InternalKinematicsParser.g:1444:1: ( ( rule__Parameter__TypeAssignment_6 ) )
            {
            // InternalKinematicsParser.g:1444:1: ( ( rule__Parameter__TypeAssignment_6 ) )
            // InternalKinematicsParser.g:1445:2: ( rule__Parameter__TypeAssignment_6 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_6()); 
            // InternalKinematicsParser.g:1446:2: ( rule__Parameter__TypeAssignment_6 )
            // InternalKinematicsParser.g:1446:3: rule__Parameter__TypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__6__Impl"


    // $ANTLR start "rule__Parameter__Group__7"
    // InternalKinematicsParser.g:1454:1: rule__Parameter__Group__7 : rule__Parameter__Group__7__Impl rule__Parameter__Group__8 ;
    public final void rule__Parameter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1458:1: ( rule__Parameter__Group__7__Impl rule__Parameter__Group__8 )
            // InternalKinematicsParser.g:1459:2: rule__Parameter__Group__7__Impl rule__Parameter__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Parameter__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__7"


    // $ANTLR start "rule__Parameter__Group__7__Impl"
    // InternalKinematicsParser.g:1466:1: rule__Parameter__Group__7__Impl : ( ( rule__Parameter__Group_7__0 )? ) ;
    public final void rule__Parameter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1470:1: ( ( ( rule__Parameter__Group_7__0 )? ) )
            // InternalKinematicsParser.g:1471:1: ( ( rule__Parameter__Group_7__0 )? )
            {
            // InternalKinematicsParser.g:1471:1: ( ( rule__Parameter__Group_7__0 )? )
            // InternalKinematicsParser.g:1472:2: ( rule__Parameter__Group_7__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_7()); 
            // InternalKinematicsParser.g:1473:2: ( rule__Parameter__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Default) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalKinematicsParser.g:1473:3: rule__Parameter__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__7__Impl"


    // $ANTLR start "rule__Parameter__Group__8"
    // InternalKinematicsParser.g:1481:1: rule__Parameter__Group__8 : rule__Parameter__Group__8__Impl rule__Parameter__Group__9 ;
    public final void rule__Parameter__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1485:1: ( rule__Parameter__Group__8__Impl rule__Parameter__Group__9 )
            // InternalKinematicsParser.g:1486:2: rule__Parameter__Group__8__Impl rule__Parameter__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__Parameter__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__8"


    // $ANTLR start "rule__Parameter__Group__8__Impl"
    // InternalKinematicsParser.g:1493:1: rule__Parameter__Group__8__Impl : ( ( rule__Parameter__Group_8__0 )? ) ;
    public final void rule__Parameter__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1497:1: ( ( ( rule__Parameter__Group_8__0 )? ) )
            // InternalKinematicsParser.g:1498:1: ( ( rule__Parameter__Group_8__0 )? )
            {
            // InternalKinematicsParser.g:1498:1: ( ( rule__Parameter__Group_8__0 )? )
            // InternalKinematicsParser.g:1499:2: ( rule__Parameter__Group_8__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_8()); 
            // InternalKinematicsParser.g:1500:2: ( rule__Parameter__Group_8__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Value) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKinematicsParser.g:1500:3: rule__Parameter__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__8__Impl"


    // $ANTLR start "rule__Parameter__Group__9"
    // InternalKinematicsParser.g:1508:1: rule__Parameter__Group__9 : rule__Parameter__Group__9__Impl ;
    public final void rule__Parameter__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1512:1: ( rule__Parameter__Group__9__Impl )
            // InternalKinematicsParser.g:1513:2: rule__Parameter__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__9"


    // $ANTLR start "rule__Parameter__Group__9__Impl"
    // InternalKinematicsParser.g:1519:1: rule__Parameter__Group__9__Impl : ( RULE_END ) ;
    public final void rule__Parameter__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1523:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:1524:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:1524:1: ( RULE_END )
            // InternalKinematicsParser.g:1525:2: RULE_END
            {
             before(grammarAccess.getParameterAccess().getENDTerminalRuleCall_9()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getENDTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__9__Impl"


    // $ANTLR start "rule__Parameter__Group_7__0"
    // InternalKinematicsParser.g:1535:1: rule__Parameter__Group_7__0 : rule__Parameter__Group_7__0__Impl rule__Parameter__Group_7__1 ;
    public final void rule__Parameter__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1539:1: ( rule__Parameter__Group_7__0__Impl rule__Parameter__Group_7__1 )
            // InternalKinematicsParser.g:1540:2: rule__Parameter__Group_7__0__Impl rule__Parameter__Group_7__1
            {
            pushFollow(FOLLOW_6);
            rule__Parameter__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_7__0"


    // $ANTLR start "rule__Parameter__Group_7__0__Impl"
    // InternalKinematicsParser.g:1547:1: rule__Parameter__Group_7__0__Impl : ( Default ) ;
    public final void rule__Parameter__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1551:1: ( ( Default ) )
            // InternalKinematicsParser.g:1552:1: ( Default )
            {
            // InternalKinematicsParser.g:1552:1: ( Default )
            // InternalKinematicsParser.g:1553:2: Default
            {
             before(grammarAccess.getParameterAccess().getDefaultKeyword_7_0()); 
            match(input,Default,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getDefaultKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_7__0__Impl"


    // $ANTLR start "rule__Parameter__Group_7__1"
    // InternalKinematicsParser.g:1562:1: rule__Parameter__Group_7__1 : rule__Parameter__Group_7__1__Impl ;
    public final void rule__Parameter__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1566:1: ( rule__Parameter__Group_7__1__Impl )
            // InternalKinematicsParser.g:1567:2: rule__Parameter__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_7__1"


    // $ANTLR start "rule__Parameter__Group_7__1__Impl"
    // InternalKinematicsParser.g:1573:1: rule__Parameter__Group_7__1__Impl : ( ( rule__Parameter__DefaultAssignment_7_1 ) ) ;
    public final void rule__Parameter__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1577:1: ( ( ( rule__Parameter__DefaultAssignment_7_1 ) ) )
            // InternalKinematicsParser.g:1578:1: ( ( rule__Parameter__DefaultAssignment_7_1 ) )
            {
            // InternalKinematicsParser.g:1578:1: ( ( rule__Parameter__DefaultAssignment_7_1 ) )
            // InternalKinematicsParser.g:1579:2: ( rule__Parameter__DefaultAssignment_7_1 )
            {
             before(grammarAccess.getParameterAccess().getDefaultAssignment_7_1()); 
            // InternalKinematicsParser.g:1580:2: ( rule__Parameter__DefaultAssignment_7_1 )
            // InternalKinematicsParser.g:1580:3: rule__Parameter__DefaultAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__DefaultAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getDefaultAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_7__1__Impl"


    // $ANTLR start "rule__Parameter__Group_8__0"
    // InternalKinematicsParser.g:1589:1: rule__Parameter__Group_8__0 : rule__Parameter__Group_8__0__Impl rule__Parameter__Group_8__1 ;
    public final void rule__Parameter__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1593:1: ( rule__Parameter__Group_8__0__Impl rule__Parameter__Group_8__1 )
            // InternalKinematicsParser.g:1594:2: rule__Parameter__Group_8__0__Impl rule__Parameter__Group_8__1
            {
            pushFollow(FOLLOW_6);
            rule__Parameter__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_8__0"


    // $ANTLR start "rule__Parameter__Group_8__0__Impl"
    // InternalKinematicsParser.g:1601:1: rule__Parameter__Group_8__0__Impl : ( Value ) ;
    public final void rule__Parameter__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1605:1: ( ( Value ) )
            // InternalKinematicsParser.g:1606:1: ( Value )
            {
            // InternalKinematicsParser.g:1606:1: ( Value )
            // InternalKinematicsParser.g:1607:2: Value
            {
             before(grammarAccess.getParameterAccess().getValueKeyword_8_0()); 
            match(input,Value,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getValueKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_8__0__Impl"


    // $ANTLR start "rule__Parameter__Group_8__1"
    // InternalKinematicsParser.g:1616:1: rule__Parameter__Group_8__1 : rule__Parameter__Group_8__1__Impl ;
    public final void rule__Parameter__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1620:1: ( rule__Parameter__Group_8__1__Impl )
            // InternalKinematicsParser.g:1621:2: rule__Parameter__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_8__1"


    // $ANTLR start "rule__Parameter__Group_8__1__Impl"
    // InternalKinematicsParser.g:1627:1: rule__Parameter__Group_8__1__Impl : ( ( rule__Parameter__ValueAssignment_8_1 ) ) ;
    public final void rule__Parameter__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1631:1: ( ( ( rule__Parameter__ValueAssignment_8_1 ) ) )
            // InternalKinematicsParser.g:1632:1: ( ( rule__Parameter__ValueAssignment_8_1 ) )
            {
            // InternalKinematicsParser.g:1632:1: ( ( rule__Parameter__ValueAssignment_8_1 ) )
            // InternalKinematicsParser.g:1633:2: ( rule__Parameter__ValueAssignment_8_1 )
            {
             before(grammarAccess.getParameterAccess().getValueAssignment_8_1()); 
            // InternalKinematicsParser.g:1634:2: ( rule__Parameter__ValueAssignment_8_1 )
            // InternalKinematicsParser.g:1634:3: rule__Parameter__ValueAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ValueAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getValueAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_8__1__Impl"


    // $ANTLR start "rule__Joint__Group__0"
    // InternalKinematicsParser.g:1643:1: rule__Joint__Group__0 : rule__Joint__Group__0__Impl rule__Joint__Group__1 ;
    public final void rule__Joint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1647:1: ( rule__Joint__Group__0__Impl rule__Joint__Group__1 )
            // InternalKinematicsParser.g:1648:2: rule__Joint__Group__0__Impl rule__Joint__Group__1
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
    // InternalKinematicsParser.g:1655:1: rule__Joint__Group__0__Impl : ( HyphenMinus ) ;
    public final void rule__Joint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1659:1: ( ( HyphenMinus ) )
            // InternalKinematicsParser.g:1660:1: ( HyphenMinus )
            {
            // InternalKinematicsParser.g:1660:1: ( HyphenMinus )
            // InternalKinematicsParser.g:1661:2: HyphenMinus
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
    // InternalKinematicsParser.g:1670:1: rule__Joint__Group__1 : rule__Joint__Group__1__Impl rule__Joint__Group__2 ;
    public final void rule__Joint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1674:1: ( rule__Joint__Group__1__Impl rule__Joint__Group__2 )
            // InternalKinematicsParser.g:1675:2: rule__Joint__Group__1__Impl rule__Joint__Group__2
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
    // InternalKinematicsParser.g:1682:1: rule__Joint__Group__1__Impl : ( Name ) ;
    public final void rule__Joint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1686:1: ( ( Name ) )
            // InternalKinematicsParser.g:1687:1: ( Name )
            {
            // InternalKinematicsParser.g:1687:1: ( Name )
            // InternalKinematicsParser.g:1688:2: Name
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
    // InternalKinematicsParser.g:1697:1: rule__Joint__Group__2 : rule__Joint__Group__2__Impl rule__Joint__Group__3 ;
    public final void rule__Joint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1701:1: ( rule__Joint__Group__2__Impl rule__Joint__Group__3 )
            // InternalKinematicsParser.g:1702:2: rule__Joint__Group__2__Impl rule__Joint__Group__3
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
    // InternalKinematicsParser.g:1709:1: rule__Joint__Group__2__Impl : ( ( rule__Joint__NameAssignment_2 ) ) ;
    public final void rule__Joint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1713:1: ( ( ( rule__Joint__NameAssignment_2 ) ) )
            // InternalKinematicsParser.g:1714:1: ( ( rule__Joint__NameAssignment_2 ) )
            {
            // InternalKinematicsParser.g:1714:1: ( ( rule__Joint__NameAssignment_2 ) )
            // InternalKinematicsParser.g:1715:2: ( rule__Joint__NameAssignment_2 )
            {
             before(grammarAccess.getJointAccess().getNameAssignment_2()); 
            // InternalKinematicsParser.g:1716:2: ( rule__Joint__NameAssignment_2 )
            // InternalKinematicsParser.g:1716:3: rule__Joint__NameAssignment_2
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
    // InternalKinematicsParser.g:1724:1: rule__Joint__Group__3 : rule__Joint__Group__3__Impl rule__Joint__Group__4 ;
    public final void rule__Joint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1728:1: ( rule__Joint__Group__3__Impl rule__Joint__Group__4 )
            // InternalKinematicsParser.g:1729:2: rule__Joint__Group__3__Impl rule__Joint__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalKinematicsParser.g:1736:1: rule__Joint__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__Joint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1740:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:1741:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:1741:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:1742:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:1751:1: rule__Joint__Group__4 : rule__Joint__Group__4__Impl rule__Joint__Group__5 ;
    public final void rule__Joint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1755:1: ( rule__Joint__Group__4__Impl rule__Joint__Group__5 )
            // InternalKinematicsParser.g:1756:2: rule__Joint__Group__4__Impl rule__Joint__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalKinematicsParser.g:1763:1: rule__Joint__Group__4__Impl : ( Type ) ;
    public final void rule__Joint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1767:1: ( ( Type ) )
            // InternalKinematicsParser.g:1768:1: ( Type )
            {
            // InternalKinematicsParser.g:1768:1: ( Type )
            // InternalKinematicsParser.g:1769:2: Type
            {
             before(grammarAccess.getJointAccess().getTypeKeyword_4()); 
            match(input,Type,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getTypeKeyword_4()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:1778:1: rule__Joint__Group__5 : rule__Joint__Group__5__Impl rule__Joint__Group__6 ;
    public final void rule__Joint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1782:1: ( rule__Joint__Group__5__Impl rule__Joint__Group__6 )
            // InternalKinematicsParser.g:1783:2: rule__Joint__Group__5__Impl rule__Joint__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalKinematicsParser.g:1790:1: rule__Joint__Group__5__Impl : ( ( rule__Joint__TypeAssignment_5 ) ) ;
    public final void rule__Joint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1794:1: ( ( ( rule__Joint__TypeAssignment_5 ) ) )
            // InternalKinematicsParser.g:1795:1: ( ( rule__Joint__TypeAssignment_5 ) )
            {
            // InternalKinematicsParser.g:1795:1: ( ( rule__Joint__TypeAssignment_5 ) )
            // InternalKinematicsParser.g:1796:2: ( rule__Joint__TypeAssignment_5 )
            {
             before(grammarAccess.getJointAccess().getTypeAssignment_5()); 
            // InternalKinematicsParser.g:1797:2: ( rule__Joint__TypeAssignment_5 )
            // InternalKinematicsParser.g:1797:3: rule__Joint__TypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Joint__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getTypeAssignment_5()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:1805:1: rule__Joint__Group__6 : rule__Joint__Group__6__Impl rule__Joint__Group__7 ;
    public final void rule__Joint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1809:1: ( rule__Joint__Group__6__Impl rule__Joint__Group__7 )
            // InternalKinematicsParser.g:1810:2: rule__Joint__Group__6__Impl rule__Joint__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalKinematicsParser.g:1817:1: rule__Joint__Group__6__Impl : ( Parent ) ;
    public final void rule__Joint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1821:1: ( ( Parent ) )
            // InternalKinematicsParser.g:1822:1: ( Parent )
            {
            // InternalKinematicsParser.g:1822:1: ( Parent )
            // InternalKinematicsParser.g:1823:2: Parent
            {
             before(grammarAccess.getJointAccess().getParentKeyword_6()); 
            match(input,Parent,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getParentKeyword_6()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:1832:1: rule__Joint__Group__7 : rule__Joint__Group__7__Impl rule__Joint__Group__8 ;
    public final void rule__Joint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1836:1: ( rule__Joint__Group__7__Impl rule__Joint__Group__8 )
            // InternalKinematicsParser.g:1837:2: rule__Joint__Group__7__Impl rule__Joint__Group__8
            {
            pushFollow(FOLLOW_17);
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
    // InternalKinematicsParser.g:1844:1: rule__Joint__Group__7__Impl : ( ( rule__Joint__ParentAssignment_7 ) ) ;
    public final void rule__Joint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1848:1: ( ( ( rule__Joint__ParentAssignment_7 ) ) )
            // InternalKinematicsParser.g:1849:1: ( ( rule__Joint__ParentAssignment_7 ) )
            {
            // InternalKinematicsParser.g:1849:1: ( ( rule__Joint__ParentAssignment_7 ) )
            // InternalKinematicsParser.g:1850:2: ( rule__Joint__ParentAssignment_7 )
            {
             before(grammarAccess.getJointAccess().getParentAssignment_7()); 
            // InternalKinematicsParser.g:1851:2: ( rule__Joint__ParentAssignment_7 )
            // InternalKinematicsParser.g:1851:3: rule__Joint__ParentAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ParentAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getParentAssignment_7()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:1859:1: rule__Joint__Group__8 : rule__Joint__Group__8__Impl rule__Joint__Group__9 ;
    public final void rule__Joint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1863:1: ( rule__Joint__Group__8__Impl rule__Joint__Group__9 )
            // InternalKinematicsParser.g:1864:2: rule__Joint__Group__8__Impl rule__Joint__Group__9
            {
            pushFollow(FOLLOW_16);
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
    // InternalKinematicsParser.g:1871:1: rule__Joint__Group__8__Impl : ( Child ) ;
    public final void rule__Joint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1875:1: ( ( Child ) )
            // InternalKinematicsParser.g:1876:1: ( Child )
            {
            // InternalKinematicsParser.g:1876:1: ( Child )
            // InternalKinematicsParser.g:1877:2: Child
            {
             before(grammarAccess.getJointAccess().getChildKeyword_8()); 
            match(input,Child,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getChildKeyword_8()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:1886:1: rule__Joint__Group__9 : rule__Joint__Group__9__Impl rule__Joint__Group__10 ;
    public final void rule__Joint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1890:1: ( rule__Joint__Group__9__Impl rule__Joint__Group__10 )
            // InternalKinematicsParser.g:1891:2: rule__Joint__Group__9__Impl rule__Joint__Group__10
            {
            pushFollow(FOLLOW_18);
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
    // InternalKinematicsParser.g:1898:1: rule__Joint__Group__9__Impl : ( ( rule__Joint__ChildAssignment_9 ) ) ;
    public final void rule__Joint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1902:1: ( ( ( rule__Joint__ChildAssignment_9 ) ) )
            // InternalKinematicsParser.g:1903:1: ( ( rule__Joint__ChildAssignment_9 ) )
            {
            // InternalKinematicsParser.g:1903:1: ( ( rule__Joint__ChildAssignment_9 ) )
            // InternalKinematicsParser.g:1904:2: ( rule__Joint__ChildAssignment_9 )
            {
             before(grammarAccess.getJointAccess().getChildAssignment_9()); 
            // InternalKinematicsParser.g:1905:2: ( rule__Joint__ChildAssignment_9 )
            // InternalKinematicsParser.g:1905:3: rule__Joint__ChildAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ChildAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getChildAssignment_9()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:1913:1: rule__Joint__Group__10 : rule__Joint__Group__10__Impl rule__Joint__Group__11 ;
    public final void rule__Joint__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1917:1: ( rule__Joint__Group__10__Impl rule__Joint__Group__11 )
            // InternalKinematicsParser.g:1918:2: rule__Joint__Group__10__Impl rule__Joint__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__Joint__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__11();

            state._fsp--;


            }

        }
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
    // InternalKinematicsParser.g:1925:1: rule__Joint__Group__10__Impl : ( Origin ) ;
    public final void rule__Joint__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1929:1: ( ( Origin ) )
            // InternalKinematicsParser.g:1930:1: ( Origin )
            {
            // InternalKinematicsParser.g:1930:1: ( Origin )
            // InternalKinematicsParser.g:1931:2: Origin
            {
             before(grammarAccess.getJointAccess().getOriginKeyword_10()); 
            match(input,Origin,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getOriginKeyword_10()); 

            }


            }

        }
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


    // $ANTLR start "rule__Joint__Group__11"
    // InternalKinematicsParser.g:1940:1: rule__Joint__Group__11 : rule__Joint__Group__11__Impl rule__Joint__Group__12 ;
    public final void rule__Joint__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1944:1: ( rule__Joint__Group__11__Impl rule__Joint__Group__12 )
            // InternalKinematicsParser.g:1945:2: rule__Joint__Group__11__Impl rule__Joint__Group__12
            {
            pushFollow(FOLLOW_19);
            rule__Joint__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__11"


    // $ANTLR start "rule__Joint__Group__11__Impl"
    // InternalKinematicsParser.g:1952:1: rule__Joint__Group__11__Impl : ( ( rule__Joint__OriginAssignment_11 ) ) ;
    public final void rule__Joint__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1956:1: ( ( ( rule__Joint__OriginAssignment_11 ) ) )
            // InternalKinematicsParser.g:1957:1: ( ( rule__Joint__OriginAssignment_11 ) )
            {
            // InternalKinematicsParser.g:1957:1: ( ( rule__Joint__OriginAssignment_11 ) )
            // InternalKinematicsParser.g:1958:2: ( rule__Joint__OriginAssignment_11 )
            {
             before(grammarAccess.getJointAccess().getOriginAssignment_11()); 
            // InternalKinematicsParser.g:1959:2: ( rule__Joint__OriginAssignment_11 )
            // InternalKinematicsParser.g:1959:3: rule__Joint__OriginAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Joint__OriginAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getOriginAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__11__Impl"


    // $ANTLR start "rule__Joint__Group__12"
    // InternalKinematicsParser.g:1967:1: rule__Joint__Group__12 : rule__Joint__Group__12__Impl rule__Joint__Group__13 ;
    public final void rule__Joint__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1971:1: ( rule__Joint__Group__12__Impl rule__Joint__Group__13 )
            // InternalKinematicsParser.g:1972:2: rule__Joint__Group__12__Impl rule__Joint__Group__13
            {
            pushFollow(FOLLOW_19);
            rule__Joint__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__12"


    // $ANTLR start "rule__Joint__Group__12__Impl"
    // InternalKinematicsParser.g:1979:1: rule__Joint__Group__12__Impl : ( ( rule__Joint__Group_12__0 )? ) ;
    public final void rule__Joint__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1983:1: ( ( ( rule__Joint__Group_12__0 )? ) )
            // InternalKinematicsParser.g:1984:1: ( ( rule__Joint__Group_12__0 )? )
            {
            // InternalKinematicsParser.g:1984:1: ( ( rule__Joint__Group_12__0 )? )
            // InternalKinematicsParser.g:1985:2: ( rule__Joint__Group_12__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_12()); 
            // InternalKinematicsParser.g:1986:2: ( rule__Joint__Group_12__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Axis) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKinematicsParser.g:1986:3: rule__Joint__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__12__Impl"


    // $ANTLR start "rule__Joint__Group__13"
    // InternalKinematicsParser.g:1994:1: rule__Joint__Group__13 : rule__Joint__Group__13__Impl rule__Joint__Group__14 ;
    public final void rule__Joint__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1998:1: ( rule__Joint__Group__13__Impl rule__Joint__Group__14 )
            // InternalKinematicsParser.g:1999:2: rule__Joint__Group__13__Impl rule__Joint__Group__14
            {
            pushFollow(FOLLOW_19);
            rule__Joint__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__13"


    // $ANTLR start "rule__Joint__Group__13__Impl"
    // InternalKinematicsParser.g:2006:1: rule__Joint__Group__13__Impl : ( ( rule__Joint__Group_13__0 )? ) ;
    public final void rule__Joint__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2010:1: ( ( ( rule__Joint__Group_13__0 )? ) )
            // InternalKinematicsParser.g:2011:1: ( ( rule__Joint__Group_13__0 )? )
            {
            // InternalKinematicsParser.g:2011:1: ( ( rule__Joint__Group_13__0 )? )
            // InternalKinematicsParser.g:2012:2: ( rule__Joint__Group_13__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_13()); 
            // InternalKinematicsParser.g:2013:2: ( rule__Joint__Group_13__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Limit) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalKinematicsParser.g:2013:3: rule__Joint__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__13__Impl"


    // $ANTLR start "rule__Joint__Group__14"
    // InternalKinematicsParser.g:2021:1: rule__Joint__Group__14 : rule__Joint__Group__14__Impl ;
    public final void rule__Joint__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2025:1: ( rule__Joint__Group__14__Impl )
            // InternalKinematicsParser.g:2026:2: rule__Joint__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__14"


    // $ANTLR start "rule__Joint__Group__14__Impl"
    // InternalKinematicsParser.g:2032:1: rule__Joint__Group__14__Impl : ( RULE_END ) ;
    public final void rule__Joint__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2036:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:2037:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:2037:1: ( RULE_END )
            // InternalKinematicsParser.g:2038:2: RULE_END
            {
             before(grammarAccess.getJointAccess().getENDTerminalRuleCall_14()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getENDTerminalRuleCall_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__14__Impl"


    // $ANTLR start "rule__Joint__Group_12__0"
    // InternalKinematicsParser.g:2048:1: rule__Joint__Group_12__0 : rule__Joint__Group_12__0__Impl rule__Joint__Group_12__1 ;
    public final void rule__Joint__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2052:1: ( rule__Joint__Group_12__0__Impl rule__Joint__Group_12__1 )
            // InternalKinematicsParser.g:2053:2: rule__Joint__Group_12__0__Impl rule__Joint__Group_12__1
            {
            pushFollow(FOLLOW_4);
            rule__Joint__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_12__0"


    // $ANTLR start "rule__Joint__Group_12__0__Impl"
    // InternalKinematicsParser.g:2060:1: rule__Joint__Group_12__0__Impl : ( Axis ) ;
    public final void rule__Joint__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2064:1: ( ( Axis ) )
            // InternalKinematicsParser.g:2065:1: ( Axis )
            {
            // InternalKinematicsParser.g:2065:1: ( Axis )
            // InternalKinematicsParser.g:2066:2: Axis
            {
             before(grammarAccess.getJointAccess().getAxisKeyword_12_0()); 
            match(input,Axis,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getAxisKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_12__0__Impl"


    // $ANTLR start "rule__Joint__Group_12__1"
    // InternalKinematicsParser.g:2075:1: rule__Joint__Group_12__1 : rule__Joint__Group_12__1__Impl ;
    public final void rule__Joint__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2079:1: ( rule__Joint__Group_12__1__Impl )
            // InternalKinematicsParser.g:2080:2: rule__Joint__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_12__1"


    // $ANTLR start "rule__Joint__Group_12__1__Impl"
    // InternalKinematicsParser.g:2086:1: rule__Joint__Group_12__1__Impl : ( ( rule__Joint__AxisAssignment_12_1 ) ) ;
    public final void rule__Joint__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2090:1: ( ( ( rule__Joint__AxisAssignment_12_1 ) ) )
            // InternalKinematicsParser.g:2091:1: ( ( rule__Joint__AxisAssignment_12_1 ) )
            {
            // InternalKinematicsParser.g:2091:1: ( ( rule__Joint__AxisAssignment_12_1 ) )
            // InternalKinematicsParser.g:2092:2: ( rule__Joint__AxisAssignment_12_1 )
            {
             before(grammarAccess.getJointAccess().getAxisAssignment_12_1()); 
            // InternalKinematicsParser.g:2093:2: ( rule__Joint__AxisAssignment_12_1 )
            // InternalKinematicsParser.g:2093:3: rule__Joint__AxisAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__AxisAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getAxisAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_12__1__Impl"


    // $ANTLR start "rule__Joint__Group_13__0"
    // InternalKinematicsParser.g:2102:1: rule__Joint__Group_13__0 : rule__Joint__Group_13__0__Impl rule__Joint__Group_13__1 ;
    public final void rule__Joint__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2106:1: ( rule__Joint__Group_13__0__Impl rule__Joint__Group_13__1 )
            // InternalKinematicsParser.g:2107:2: rule__Joint__Group_13__0__Impl rule__Joint__Group_13__1
            {
            pushFollow(FOLLOW_4);
            rule__Joint__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_13__0"


    // $ANTLR start "rule__Joint__Group_13__0__Impl"
    // InternalKinematicsParser.g:2114:1: rule__Joint__Group_13__0__Impl : ( Limit ) ;
    public final void rule__Joint__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2118:1: ( ( Limit ) )
            // InternalKinematicsParser.g:2119:1: ( Limit )
            {
            // InternalKinematicsParser.g:2119:1: ( Limit )
            // InternalKinematicsParser.g:2120:2: Limit
            {
             before(grammarAccess.getJointAccess().getLimitKeyword_13_0()); 
            match(input,Limit,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getLimitKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_13__0__Impl"


    // $ANTLR start "rule__Joint__Group_13__1"
    // InternalKinematicsParser.g:2129:1: rule__Joint__Group_13__1 : rule__Joint__Group_13__1__Impl ;
    public final void rule__Joint__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2133:1: ( rule__Joint__Group_13__1__Impl )
            // InternalKinematicsParser.g:2134:2: rule__Joint__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_13__1"


    // $ANTLR start "rule__Joint__Group_13__1__Impl"
    // InternalKinematicsParser.g:2140:1: rule__Joint__Group_13__1__Impl : ( ( rule__Joint__LimitAssignment_13_1 ) ) ;
    public final void rule__Joint__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2144:1: ( ( ( rule__Joint__LimitAssignment_13_1 ) ) )
            // InternalKinematicsParser.g:2145:1: ( ( rule__Joint__LimitAssignment_13_1 ) )
            {
            // InternalKinematicsParser.g:2145:1: ( ( rule__Joint__LimitAssignment_13_1 ) )
            // InternalKinematicsParser.g:2146:2: ( rule__Joint__LimitAssignment_13_1 )
            {
             before(grammarAccess.getJointAccess().getLimitAssignment_13_1()); 
            // InternalKinematicsParser.g:2147:2: ( rule__Joint__LimitAssignment_13_1 )
            // InternalKinematicsParser.g:2147:3: rule__Joint__LimitAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__LimitAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getLimitAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_13__1__Impl"


    // $ANTLR start "rule__Link__Group__0"
    // InternalKinematicsParser.g:2156:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2160:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalKinematicsParser.g:2161:2: rule__Link__Group__0__Impl rule__Link__Group__1
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
    // InternalKinematicsParser.g:2168:1: rule__Link__Group__0__Impl : ( HyphenMinus ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2172:1: ( ( HyphenMinus ) )
            // InternalKinematicsParser.g:2173:1: ( HyphenMinus )
            {
            // InternalKinematicsParser.g:2173:1: ( HyphenMinus )
            // InternalKinematicsParser.g:2174:2: HyphenMinus
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
    // InternalKinematicsParser.g:2183:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2187:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalKinematicsParser.g:2188:2: rule__Link__Group__1__Impl rule__Link__Group__2
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
    // InternalKinematicsParser.g:2195:1: rule__Link__Group__1__Impl : ( Name ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2199:1: ( ( Name ) )
            // InternalKinematicsParser.g:2200:1: ( Name )
            {
            // InternalKinematicsParser.g:2200:1: ( Name )
            // InternalKinematicsParser.g:2201:2: Name
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
    // InternalKinematicsParser.g:2210:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2214:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalKinematicsParser.g:2215:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalKinematicsParser.g:2222:1: rule__Link__Group__2__Impl : ( ( rule__Link__NameAssignment_2 ) ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2226:1: ( ( ( rule__Link__NameAssignment_2 ) ) )
            // InternalKinematicsParser.g:2227:1: ( ( rule__Link__NameAssignment_2 ) )
            {
            // InternalKinematicsParser.g:2227:1: ( ( rule__Link__NameAssignment_2 ) )
            // InternalKinematicsParser.g:2228:2: ( rule__Link__NameAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_2()); 
            // InternalKinematicsParser.g:2229:2: ( rule__Link__NameAssignment_2 )
            // InternalKinematicsParser.g:2229:3: rule__Link__NameAssignment_2
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
    // InternalKinematicsParser.g:2237:1: rule__Link__Group__3 : rule__Link__Group__3__Impl ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2241:1: ( rule__Link__Group__3__Impl )
            // InternalKinematicsParser.g:2242:2: rule__Link__Group__3__Impl
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
    // InternalKinematicsParser.g:2248:1: rule__Link__Group__3__Impl : ( ( rule__Link__Group_3__0 )? ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2252:1: ( ( ( rule__Link__Group_3__0 )? ) )
            // InternalKinematicsParser.g:2253:1: ( ( rule__Link__Group_3__0 )? )
            {
            // InternalKinematicsParser.g:2253:1: ( ( rule__Link__Group_3__0 )? )
            // InternalKinematicsParser.g:2254:2: ( rule__Link__Group_3__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_3()); 
            // InternalKinematicsParser.g:2255:2: ( rule__Link__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Colon) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalKinematicsParser.g:2255:3: rule__Link__Group_3__0
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
    // InternalKinematicsParser.g:2264:1: rule__Link__Group_3__0 : rule__Link__Group_3__0__Impl rule__Link__Group_3__1 ;
    public final void rule__Link__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2268:1: ( rule__Link__Group_3__0__Impl rule__Link__Group_3__1 )
            // InternalKinematicsParser.g:2269:2: rule__Link__Group_3__0__Impl rule__Link__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalKinematicsParser.g:2276:1: rule__Link__Group_3__0__Impl : ( Colon ) ;
    public final void rule__Link__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2280:1: ( ( Colon ) )
            // InternalKinematicsParser.g:2281:1: ( Colon )
            {
            // InternalKinematicsParser.g:2281:1: ( Colon )
            // InternalKinematicsParser.g:2282:2: Colon
            {
             before(grammarAccess.getLinkAccess().getColonKeyword_3_0()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getColonKeyword_3_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:2291:1: rule__Link__Group_3__1 : rule__Link__Group_3__1__Impl rule__Link__Group_3__2 ;
    public final void rule__Link__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2295:1: ( rule__Link__Group_3__1__Impl rule__Link__Group_3__2 )
            // InternalKinematicsParser.g:2296:2: rule__Link__Group_3__1__Impl rule__Link__Group_3__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalKinematicsParser.g:2303:1: rule__Link__Group_3__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Link__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2307:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:2308:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:2308:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:2309:2: RULE_BEGIN
            {
             before(grammarAccess.getLinkAccess().getBEGINTerminalRuleCall_3_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getBEGINTerminalRuleCall_3_1()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:2318:1: rule__Link__Group_3__2 : rule__Link__Group_3__2__Impl rule__Link__Group_3__3 ;
    public final void rule__Link__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2322:1: ( rule__Link__Group_3__2__Impl rule__Link__Group_3__3 )
            // InternalKinematicsParser.g:2323:2: rule__Link__Group_3__2__Impl rule__Link__Group_3__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalKinematicsParser.g:2330:1: rule__Link__Group_3__2__Impl : ( ( rule__Link__Group_3_2__0 )? ) ;
    public final void rule__Link__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2334:1: ( ( ( rule__Link__Group_3_2__0 )? ) )
            // InternalKinematicsParser.g:2335:1: ( ( rule__Link__Group_3_2__0 )? )
            {
            // InternalKinematicsParser.g:2335:1: ( ( rule__Link__Group_3_2__0 )? )
            // InternalKinematicsParser.g:2336:2: ( rule__Link__Group_3_2__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_3_2()); 
            // InternalKinematicsParser.g:2337:2: ( rule__Link__Group_3_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Inertial) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalKinematicsParser.g:2337:3: rule__Link__Group_3_2__0
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
    // InternalKinematicsParser.g:2345:1: rule__Link__Group_3__3 : rule__Link__Group_3__3__Impl rule__Link__Group_3__4 ;
    public final void rule__Link__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2349:1: ( rule__Link__Group_3__3__Impl rule__Link__Group_3__4 )
            // InternalKinematicsParser.g:2350:2: rule__Link__Group_3__3__Impl rule__Link__Group_3__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalKinematicsParser.g:2357:1: rule__Link__Group_3__3__Impl : ( ( rule__Link__Group_3_3__0 )? ) ;
    public final void rule__Link__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2361:1: ( ( ( rule__Link__Group_3_3__0 )? ) )
            // InternalKinematicsParser.g:2362:1: ( ( rule__Link__Group_3_3__0 )? )
            {
            // InternalKinematicsParser.g:2362:1: ( ( rule__Link__Group_3_3__0 )? )
            // InternalKinematicsParser.g:2363:2: ( rule__Link__Group_3_3__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_3_3()); 
            // InternalKinematicsParser.g:2364:2: ( rule__Link__Group_3_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Visual) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalKinematicsParser.g:2364:3: rule__Link__Group_3_3__0
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
    // InternalKinematicsParser.g:2372:1: rule__Link__Group_3__4 : rule__Link__Group_3__4__Impl rule__Link__Group_3__5 ;
    public final void rule__Link__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2376:1: ( rule__Link__Group_3__4__Impl rule__Link__Group_3__5 )
            // InternalKinematicsParser.g:2377:2: rule__Link__Group_3__4__Impl rule__Link__Group_3__5
            {
            pushFollow(FOLLOW_21);
            rule__Link__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_3__5();

            state._fsp--;


            }

        }
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
    // InternalKinematicsParser.g:2384:1: rule__Link__Group_3__4__Impl : ( ( rule__Link__Group_3_4__0 )? ) ;
    public final void rule__Link__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2388:1: ( ( ( rule__Link__Group_3_4__0 )? ) )
            // InternalKinematicsParser.g:2389:1: ( ( rule__Link__Group_3_4__0 )? )
            {
            // InternalKinematicsParser.g:2389:1: ( ( rule__Link__Group_3_4__0 )? )
            // InternalKinematicsParser.g:2390:2: ( rule__Link__Group_3_4__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_3_4()); 
            // InternalKinematicsParser.g:2391:2: ( rule__Link__Group_3_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Collision) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalKinematicsParser.g:2391:3: rule__Link__Group_3_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_3_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_3_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Link__Group_3__5"
    // InternalKinematicsParser.g:2399:1: rule__Link__Group_3__5 : rule__Link__Group_3__5__Impl ;
    public final void rule__Link__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2403:1: ( rule__Link__Group_3__5__Impl )
            // InternalKinematicsParser.g:2404:2: rule__Link__Group_3__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_3__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3__5"


    // $ANTLR start "rule__Link__Group_3__5__Impl"
    // InternalKinematicsParser.g:2410:1: rule__Link__Group_3__5__Impl : ( RULE_END ) ;
    public final void rule__Link__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2414:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:2415:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:2415:1: ( RULE_END )
            // InternalKinematicsParser.g:2416:2: RULE_END
            {
             before(grammarAccess.getLinkAccess().getENDTerminalRuleCall_3_5()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getENDTerminalRuleCall_3_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3__5__Impl"


    // $ANTLR start "rule__Link__Group_3_2__0"
    // InternalKinematicsParser.g:2426:1: rule__Link__Group_3_2__0 : rule__Link__Group_3_2__0__Impl rule__Link__Group_3_2__1 ;
    public final void rule__Link__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2430:1: ( rule__Link__Group_3_2__0__Impl rule__Link__Group_3_2__1 )
            // InternalKinematicsParser.g:2431:2: rule__Link__Group_3_2__0__Impl rule__Link__Group_3_2__1
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
    // InternalKinematicsParser.g:2438:1: rule__Link__Group_3_2__0__Impl : ( Inertial ) ;
    public final void rule__Link__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2442:1: ( ( Inertial ) )
            // InternalKinematicsParser.g:2443:1: ( Inertial )
            {
            // InternalKinematicsParser.g:2443:1: ( Inertial )
            // InternalKinematicsParser.g:2444:2: Inertial
            {
             before(grammarAccess.getLinkAccess().getInertialKeyword_3_2_0()); 
            match(input,Inertial,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getInertialKeyword_3_2_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:2453:1: rule__Link__Group_3_2__1 : rule__Link__Group_3_2__1__Impl ;
    public final void rule__Link__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2457:1: ( rule__Link__Group_3_2__1__Impl )
            // InternalKinematicsParser.g:2458:2: rule__Link__Group_3_2__1__Impl
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
    // InternalKinematicsParser.g:2464:1: rule__Link__Group_3_2__1__Impl : ( ( rule__Link__InertialAssignment_3_2_1 ) ) ;
    public final void rule__Link__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2468:1: ( ( ( rule__Link__InertialAssignment_3_2_1 ) ) )
            // InternalKinematicsParser.g:2469:1: ( ( rule__Link__InertialAssignment_3_2_1 ) )
            {
            // InternalKinematicsParser.g:2469:1: ( ( rule__Link__InertialAssignment_3_2_1 ) )
            // InternalKinematicsParser.g:2470:2: ( rule__Link__InertialAssignment_3_2_1 )
            {
             before(grammarAccess.getLinkAccess().getInertialAssignment_3_2_1()); 
            // InternalKinematicsParser.g:2471:2: ( rule__Link__InertialAssignment_3_2_1 )
            // InternalKinematicsParser.g:2471:3: rule__Link__InertialAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__InertialAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getInertialAssignment_3_2_1()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:2480:1: rule__Link__Group_3_3__0 : rule__Link__Group_3_3__0__Impl rule__Link__Group_3_3__1 ;
    public final void rule__Link__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2484:1: ( rule__Link__Group_3_3__0__Impl rule__Link__Group_3_3__1 )
            // InternalKinematicsParser.g:2485:2: rule__Link__Group_3_3__0__Impl rule__Link__Group_3_3__1
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
    // InternalKinematicsParser.g:2492:1: rule__Link__Group_3_3__0__Impl : ( Visual ) ;
    public final void rule__Link__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2496:1: ( ( Visual ) )
            // InternalKinematicsParser.g:2497:1: ( Visual )
            {
            // InternalKinematicsParser.g:2497:1: ( Visual )
            // InternalKinematicsParser.g:2498:2: Visual
            {
             before(grammarAccess.getLinkAccess().getVisualKeyword_3_3_0()); 
            match(input,Visual,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getVisualKeyword_3_3_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:2507:1: rule__Link__Group_3_3__1 : rule__Link__Group_3_3__1__Impl ;
    public final void rule__Link__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2511:1: ( rule__Link__Group_3_3__1__Impl )
            // InternalKinematicsParser.g:2512:2: rule__Link__Group_3_3__1__Impl
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
    // InternalKinematicsParser.g:2518:1: rule__Link__Group_3_3__1__Impl : ( ( rule__Link__VisualAssignment_3_3_1 ) ) ;
    public final void rule__Link__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2522:1: ( ( ( rule__Link__VisualAssignment_3_3_1 ) ) )
            // InternalKinematicsParser.g:2523:1: ( ( rule__Link__VisualAssignment_3_3_1 ) )
            {
            // InternalKinematicsParser.g:2523:1: ( ( rule__Link__VisualAssignment_3_3_1 ) )
            // InternalKinematicsParser.g:2524:2: ( rule__Link__VisualAssignment_3_3_1 )
            {
             before(grammarAccess.getLinkAccess().getVisualAssignment_3_3_1()); 
            // InternalKinematicsParser.g:2525:2: ( rule__Link__VisualAssignment_3_3_1 )
            // InternalKinematicsParser.g:2525:3: rule__Link__VisualAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__VisualAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getVisualAssignment_3_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Link__Group_3_4__0"
    // InternalKinematicsParser.g:2534:1: rule__Link__Group_3_4__0 : rule__Link__Group_3_4__0__Impl rule__Link__Group_3_4__1 ;
    public final void rule__Link__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2538:1: ( rule__Link__Group_3_4__0__Impl rule__Link__Group_3_4__1 )
            // InternalKinematicsParser.g:2539:2: rule__Link__Group_3_4__0__Impl rule__Link__Group_3_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Link__Group_3_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_3_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3_4__0"


    // $ANTLR start "rule__Link__Group_3_4__0__Impl"
    // InternalKinematicsParser.g:2546:1: rule__Link__Group_3_4__0__Impl : ( Collision ) ;
    public final void rule__Link__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2550:1: ( ( Collision ) )
            // InternalKinematicsParser.g:2551:1: ( Collision )
            {
            // InternalKinematicsParser.g:2551:1: ( Collision )
            // InternalKinematicsParser.g:2552:2: Collision
            {
             before(grammarAccess.getLinkAccess().getCollisionKeyword_3_4_0()); 
            match(input,Collision,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getCollisionKeyword_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3_4__0__Impl"


    // $ANTLR start "rule__Link__Group_3_4__1"
    // InternalKinematicsParser.g:2561:1: rule__Link__Group_3_4__1 : rule__Link__Group_3_4__1__Impl ;
    public final void rule__Link__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2565:1: ( rule__Link__Group_3_4__1__Impl )
            // InternalKinematicsParser.g:2566:2: rule__Link__Group_3_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_3_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3_4__1"


    // $ANTLR start "rule__Link__Group_3_4__1__Impl"
    // InternalKinematicsParser.g:2572:1: rule__Link__Group_3_4__1__Impl : ( ( rule__Link__CollisionAssignment_3_4_1 ) ) ;
    public final void rule__Link__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2576:1: ( ( ( rule__Link__CollisionAssignment_3_4_1 ) ) )
            // InternalKinematicsParser.g:2577:1: ( ( rule__Link__CollisionAssignment_3_4_1 ) )
            {
            // InternalKinematicsParser.g:2577:1: ( ( rule__Link__CollisionAssignment_3_4_1 ) )
            // InternalKinematicsParser.g:2578:2: ( rule__Link__CollisionAssignment_3_4_1 )
            {
             before(grammarAccess.getLinkAccess().getCollisionAssignment_3_4_1()); 
            // InternalKinematicsParser.g:2579:2: ( rule__Link__CollisionAssignment_3_4_1 )
            // InternalKinematicsParser.g:2579:3: rule__Link__CollisionAssignment_3_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__CollisionAssignment_3_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getCollisionAssignment_3_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3_4__1__Impl"


    // $ANTLR start "rule__Pose__Group__0"
    // InternalKinematicsParser.g:2588:1: rule__Pose__Group__0 : rule__Pose__Group__0__Impl rule__Pose__Group__1 ;
    public final void rule__Pose__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2592:1: ( rule__Pose__Group__0__Impl rule__Pose__Group__1 )
            // InternalKinematicsParser.g:2593:2: rule__Pose__Group__0__Impl rule__Pose__Group__1
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
    // InternalKinematicsParser.g:2600:1: rule__Pose__Group__0__Impl : ( () ) ;
    public final void rule__Pose__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2604:1: ( ( () ) )
            // InternalKinematicsParser.g:2605:1: ( () )
            {
            // InternalKinematicsParser.g:2605:1: ( () )
            // InternalKinematicsParser.g:2606:2: ()
            {
             before(grammarAccess.getPoseAccess().getPoseAction_0()); 
            // InternalKinematicsParser.g:2607:2: ()
            // InternalKinematicsParser.g:2607:3: 
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
    // InternalKinematicsParser.g:2615:1: rule__Pose__Group__1 : rule__Pose__Group__1__Impl rule__Pose__Group__2 ;
    public final void rule__Pose__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2619:1: ( rule__Pose__Group__1__Impl rule__Pose__Group__2 )
            // InternalKinematicsParser.g:2620:2: rule__Pose__Group__1__Impl rule__Pose__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalKinematicsParser.g:2627:1: rule__Pose__Group__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Pose__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2631:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:2632:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:2632:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:2633:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:2642:1: rule__Pose__Group__2 : rule__Pose__Group__2__Impl rule__Pose__Group__3 ;
    public final void rule__Pose__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2646:1: ( rule__Pose__Group__2__Impl rule__Pose__Group__3 )
            // InternalKinematicsParser.g:2647:2: rule__Pose__Group__2__Impl rule__Pose__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalKinematicsParser.g:2654:1: rule__Pose__Group__2__Impl : ( ( rule__Pose__Group_2__0 )? ) ;
    public final void rule__Pose__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2658:1: ( ( ( rule__Pose__Group_2__0 )? ) )
            // InternalKinematicsParser.g:2659:1: ( ( rule__Pose__Group_2__0 )? )
            {
            // InternalKinematicsParser.g:2659:1: ( ( rule__Pose__Group_2__0 )? )
            // InternalKinematicsParser.g:2660:2: ( rule__Pose__Group_2__0 )?
            {
             before(grammarAccess.getPoseAccess().getGroup_2()); 
            // InternalKinematicsParser.g:2661:2: ( rule__Pose__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Rpy) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalKinematicsParser.g:2661:3: rule__Pose__Group_2__0
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
    // InternalKinematicsParser.g:2669:1: rule__Pose__Group__3 : rule__Pose__Group__3__Impl rule__Pose__Group__4 ;
    public final void rule__Pose__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2673:1: ( rule__Pose__Group__3__Impl rule__Pose__Group__4 )
            // InternalKinematicsParser.g:2674:2: rule__Pose__Group__3__Impl rule__Pose__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalKinematicsParser.g:2681:1: rule__Pose__Group__3__Impl : ( ( rule__Pose__Group_3__0 )? ) ;
    public final void rule__Pose__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2685:1: ( ( ( rule__Pose__Group_3__0 )? ) )
            // InternalKinematicsParser.g:2686:1: ( ( rule__Pose__Group_3__0 )? )
            {
            // InternalKinematicsParser.g:2686:1: ( ( rule__Pose__Group_3__0 )? )
            // InternalKinematicsParser.g:2687:2: ( rule__Pose__Group_3__0 )?
            {
             before(grammarAccess.getPoseAccess().getGroup_3()); 
            // InternalKinematicsParser.g:2688:2: ( rule__Pose__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Xyz) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalKinematicsParser.g:2688:3: rule__Pose__Group_3__0
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
    // InternalKinematicsParser.g:2696:1: rule__Pose__Group__4 : rule__Pose__Group__4__Impl ;
    public final void rule__Pose__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2700:1: ( rule__Pose__Group__4__Impl )
            // InternalKinematicsParser.g:2701:2: rule__Pose__Group__4__Impl
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
    // InternalKinematicsParser.g:2707:1: rule__Pose__Group__4__Impl : ( RULE_END ) ;
    public final void rule__Pose__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2711:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:2712:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:2712:1: ( RULE_END )
            // InternalKinematicsParser.g:2713:2: RULE_END
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
    // InternalKinematicsParser.g:2723:1: rule__Pose__Group_2__0 : rule__Pose__Group_2__0__Impl rule__Pose__Group_2__1 ;
    public final void rule__Pose__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2727:1: ( rule__Pose__Group_2__0__Impl rule__Pose__Group_2__1 )
            // InternalKinematicsParser.g:2728:2: rule__Pose__Group_2__0__Impl rule__Pose__Group_2__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalKinematicsParser.g:2735:1: rule__Pose__Group_2__0__Impl : ( Rpy ) ;
    public final void rule__Pose__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2739:1: ( ( Rpy ) )
            // InternalKinematicsParser.g:2740:1: ( Rpy )
            {
            // InternalKinematicsParser.g:2740:1: ( Rpy )
            // InternalKinematicsParser.g:2741:2: Rpy
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
    // InternalKinematicsParser.g:2750:1: rule__Pose__Group_2__1 : rule__Pose__Group_2__1__Impl ;
    public final void rule__Pose__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2754:1: ( rule__Pose__Group_2__1__Impl )
            // InternalKinematicsParser.g:2755:2: rule__Pose__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pose__Group_2__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalKinematicsParser.g:2761:1: rule__Pose__Group_2__1__Impl : ( ( rule__Pose__RpyAssignment_2_1 ) ) ;
    public final void rule__Pose__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2765:1: ( ( ( rule__Pose__RpyAssignment_2_1 ) ) )
            // InternalKinematicsParser.g:2766:1: ( ( rule__Pose__RpyAssignment_2_1 ) )
            {
            // InternalKinematicsParser.g:2766:1: ( ( rule__Pose__RpyAssignment_2_1 ) )
            // InternalKinematicsParser.g:2767:2: ( rule__Pose__RpyAssignment_2_1 )
            {
             before(grammarAccess.getPoseAccess().getRpyAssignment_2_1()); 
            // InternalKinematicsParser.g:2768:2: ( rule__Pose__RpyAssignment_2_1 )
            // InternalKinematicsParser.g:2768:3: rule__Pose__RpyAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Pose__RpyAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPoseAccess().getRpyAssignment_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Pose__Group_3__0"
    // InternalKinematicsParser.g:2777:1: rule__Pose__Group_3__0 : rule__Pose__Group_3__0__Impl rule__Pose__Group_3__1 ;
    public final void rule__Pose__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2781:1: ( rule__Pose__Group_3__0__Impl rule__Pose__Group_3__1 )
            // InternalKinematicsParser.g:2782:2: rule__Pose__Group_3__0__Impl rule__Pose__Group_3__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalKinematicsParser.g:2789:1: rule__Pose__Group_3__0__Impl : ( Xyz ) ;
    public final void rule__Pose__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2793:1: ( ( Xyz ) )
            // InternalKinematicsParser.g:2794:1: ( Xyz )
            {
            // InternalKinematicsParser.g:2794:1: ( Xyz )
            // InternalKinematicsParser.g:2795:2: Xyz
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
    // InternalKinematicsParser.g:2804:1: rule__Pose__Group_3__1 : rule__Pose__Group_3__1__Impl ;
    public final void rule__Pose__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2808:1: ( rule__Pose__Group_3__1__Impl )
            // InternalKinematicsParser.g:2809:2: rule__Pose__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pose__Group_3__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalKinematicsParser.g:2815:1: rule__Pose__Group_3__1__Impl : ( ( rule__Pose__XyzAssignment_3_1 ) ) ;
    public final void rule__Pose__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2819:1: ( ( ( rule__Pose__XyzAssignment_3_1 ) ) )
            // InternalKinematicsParser.g:2820:1: ( ( rule__Pose__XyzAssignment_3_1 ) )
            {
            // InternalKinematicsParser.g:2820:1: ( ( rule__Pose__XyzAssignment_3_1 ) )
            // InternalKinematicsParser.g:2821:2: ( rule__Pose__XyzAssignment_3_1 )
            {
             before(grammarAccess.getPoseAccess().getXyzAssignment_3_1()); 
            // InternalKinematicsParser.g:2822:2: ( rule__Pose__XyzAssignment_3_1 )
            // InternalKinematicsParser.g:2822:3: rule__Pose__XyzAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Pose__XyzAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPoseAccess().getXyzAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Vector3__Group__0"
    // InternalKinematicsParser.g:2831:1: rule__Vector3__Group__0 : rule__Vector3__Group__0__Impl rule__Vector3__Group__1 ;
    public final void rule__Vector3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2835:1: ( rule__Vector3__Group__0__Impl rule__Vector3__Group__1 )
            // InternalKinematicsParser.g:2836:2: rule__Vector3__Group__0__Impl rule__Vector3__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Vector3__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vector3__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector3__Group__0"


    // $ANTLR start "rule__Vector3__Group__0__Impl"
    // InternalKinematicsParser.g:2843:1: rule__Vector3__Group__0__Impl : ( () ) ;
    public final void rule__Vector3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2847:1: ( ( () ) )
            // InternalKinematicsParser.g:2848:1: ( () )
            {
            // InternalKinematicsParser.g:2848:1: ( () )
            // InternalKinematicsParser.g:2849:2: ()
            {
             before(grammarAccess.getVector3Access().getAxisAction_0()); 
            // InternalKinematicsParser.g:2850:2: ()
            // InternalKinematicsParser.g:2850:3: 
            {
            }

             after(grammarAccess.getVector3Access().getAxisAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector3__Group__0__Impl"


    // $ANTLR start "rule__Vector3__Group__1"
    // InternalKinematicsParser.g:2858:1: rule__Vector3__Group__1 : rule__Vector3__Group__1__Impl rule__Vector3__Group__2 ;
    public final void rule__Vector3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2862:1: ( rule__Vector3__Group__1__Impl rule__Vector3__Group__2 )
            // InternalKinematicsParser.g:2863:2: rule__Vector3__Group__1__Impl rule__Vector3__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Vector3__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vector3__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector3__Group__1"


    // $ANTLR start "rule__Vector3__Group__1__Impl"
    // InternalKinematicsParser.g:2870:1: rule__Vector3__Group__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Vector3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2874:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:2875:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:2875:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:2876:2: RULE_BEGIN
            {
             before(grammarAccess.getVector3Access().getBEGINTerminalRuleCall_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getVector3Access().getBEGINTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector3__Group__1__Impl"


    // $ANTLR start "rule__Vector3__Group__2"
    // InternalKinematicsParser.g:2885:1: rule__Vector3__Group__2 : rule__Vector3__Group__2__Impl rule__Vector3__Group__3 ;
    public final void rule__Vector3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2889:1: ( rule__Vector3__Group__2__Impl rule__Vector3__Group__3 )
            // InternalKinematicsParser.g:2890:2: rule__Vector3__Group__2__Impl rule__Vector3__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Vector3__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vector3__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector3__Group__2"


    // $ANTLR start "rule__Vector3__Group__2__Impl"
    // InternalKinematicsParser.g:2897:1: rule__Vector3__Group__2__Impl : ( ( rule__Vector3__Group_2__0 )? ) ;
    public final void rule__Vector3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2901:1: ( ( ( rule__Vector3__Group_2__0 )? ) )
            // InternalKinematicsParser.g:2902:1: ( ( rule__Vector3__Group_2__0 )? )
            {
            // InternalKinematicsParser.g:2902:1: ( ( rule__Vector3__Group_2__0 )? )
            // InternalKinematicsParser.g:2903:2: ( rule__Vector3__Group_2__0 )?
            {
             before(grammarAccess.getVector3Access().getGroup_2()); 
            // InternalKinematicsParser.g:2904:2: ( rule__Vector3__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Xyz) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalKinematicsParser.g:2904:3: rule__Vector3__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Vector3__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVector3Access().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector3__Group__2__Impl"


    // $ANTLR start "rule__Vector3__Group__3"
    // InternalKinematicsParser.g:2912:1: rule__Vector3__Group__3 : rule__Vector3__Group__3__Impl ;
    public final void rule__Vector3__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2916:1: ( rule__Vector3__Group__3__Impl )
            // InternalKinematicsParser.g:2917:2: rule__Vector3__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vector3__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector3__Group__3"


    // $ANTLR start "rule__Vector3__Group__3__Impl"
    // InternalKinematicsParser.g:2923:1: rule__Vector3__Group__3__Impl : ( RULE_END ) ;
    public final void rule__Vector3__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2927:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:2928:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:2928:1: ( RULE_END )
            // InternalKinematicsParser.g:2929:2: RULE_END
            {
             before(grammarAccess.getVector3Access().getENDTerminalRuleCall_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getVector3Access().getENDTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector3__Group__3__Impl"


    // $ANTLR start "rule__Vector3__Group_2__0"
    // InternalKinematicsParser.g:2939:1: rule__Vector3__Group_2__0 : rule__Vector3__Group_2__0__Impl rule__Vector3__Group_2__1 ;
    public final void rule__Vector3__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2943:1: ( rule__Vector3__Group_2__0__Impl rule__Vector3__Group_2__1 )
            // InternalKinematicsParser.g:2944:2: rule__Vector3__Group_2__0__Impl rule__Vector3__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Vector3__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vector3__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector3__Group_2__0"


    // $ANTLR start "rule__Vector3__Group_2__0__Impl"
    // InternalKinematicsParser.g:2951:1: rule__Vector3__Group_2__0__Impl : ( Xyz ) ;
    public final void rule__Vector3__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2955:1: ( ( Xyz ) )
            // InternalKinematicsParser.g:2956:1: ( Xyz )
            {
            // InternalKinematicsParser.g:2956:1: ( Xyz )
            // InternalKinematicsParser.g:2957:2: Xyz
            {
             before(grammarAccess.getVector3Access().getXyzKeyword_2_0()); 
            match(input,Xyz,FOLLOW_2); 
             after(grammarAccess.getVector3Access().getXyzKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector3__Group_2__0__Impl"


    // $ANTLR start "rule__Vector3__Group_2__1"
    // InternalKinematicsParser.g:2966:1: rule__Vector3__Group_2__1 : rule__Vector3__Group_2__1__Impl ;
    public final void rule__Vector3__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2970:1: ( rule__Vector3__Group_2__1__Impl )
            // InternalKinematicsParser.g:2971:2: rule__Vector3__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vector3__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector3__Group_2__1"


    // $ANTLR start "rule__Vector3__Group_2__1__Impl"
    // InternalKinematicsParser.g:2977:1: rule__Vector3__Group_2__1__Impl : ( ( rule__Vector3__XyzAssignment_2_1 ) ) ;
    public final void rule__Vector3__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2981:1: ( ( ( rule__Vector3__XyzAssignment_2_1 ) ) )
            // InternalKinematicsParser.g:2982:1: ( ( rule__Vector3__XyzAssignment_2_1 ) )
            {
            // InternalKinematicsParser.g:2982:1: ( ( rule__Vector3__XyzAssignment_2_1 ) )
            // InternalKinematicsParser.g:2983:2: ( rule__Vector3__XyzAssignment_2_1 )
            {
             before(grammarAccess.getVector3Access().getXyzAssignment_2_1()); 
            // InternalKinematicsParser.g:2984:2: ( rule__Vector3__XyzAssignment_2_1 )
            // InternalKinematicsParser.g:2984:3: rule__Vector3__XyzAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Vector3__XyzAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVector3Access().getXyzAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector3__Group_2__1__Impl"


    // $ANTLR start "rule__Limit__Group__0"
    // InternalKinematicsParser.g:2993:1: rule__Limit__Group__0 : rule__Limit__Group__0__Impl rule__Limit__Group__1 ;
    public final void rule__Limit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2997:1: ( rule__Limit__Group__0__Impl rule__Limit__Group__1 )
            // InternalKinematicsParser.g:2998:2: rule__Limit__Group__0__Impl rule__Limit__Group__1
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
    // InternalKinematicsParser.g:3005:1: rule__Limit__Group__0__Impl : ( () ) ;
    public final void rule__Limit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3009:1: ( ( () ) )
            // InternalKinematicsParser.g:3010:1: ( () )
            {
            // InternalKinematicsParser.g:3010:1: ( () )
            // InternalKinematicsParser.g:3011:2: ()
            {
             before(grammarAccess.getLimitAccess().getLimitAction_0()); 
            // InternalKinematicsParser.g:3012:2: ()
            // InternalKinematicsParser.g:3012:3: 
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
    // InternalKinematicsParser.g:3020:1: rule__Limit__Group__1 : rule__Limit__Group__1__Impl rule__Limit__Group__2 ;
    public final void rule__Limit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3024:1: ( rule__Limit__Group__1__Impl rule__Limit__Group__2 )
            // InternalKinematicsParser.g:3025:2: rule__Limit__Group__1__Impl rule__Limit__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalKinematicsParser.g:3032:1: rule__Limit__Group__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Limit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3036:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:3037:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:3037:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:3038:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:3047:1: rule__Limit__Group__2 : rule__Limit__Group__2__Impl rule__Limit__Group__3 ;
    public final void rule__Limit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3051:1: ( rule__Limit__Group__2__Impl rule__Limit__Group__3 )
            // InternalKinematicsParser.g:3052:2: rule__Limit__Group__2__Impl rule__Limit__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalKinematicsParser.g:3059:1: rule__Limit__Group__2__Impl : ( ( rule__Limit__Group_2__0 )? ) ;
    public final void rule__Limit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3063:1: ( ( ( rule__Limit__Group_2__0 )? ) )
            // InternalKinematicsParser.g:3064:1: ( ( rule__Limit__Group_2__0 )? )
            {
            // InternalKinematicsParser.g:3064:1: ( ( rule__Limit__Group_2__0 )? )
            // InternalKinematicsParser.g:3065:2: ( rule__Limit__Group_2__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_2()); 
            // InternalKinematicsParser.g:3066:2: ( rule__Limit__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Effort) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalKinematicsParser.g:3066:3: rule__Limit__Group_2__0
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
    // InternalKinematicsParser.g:3074:1: rule__Limit__Group__3 : rule__Limit__Group__3__Impl rule__Limit__Group__4 ;
    public final void rule__Limit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3078:1: ( rule__Limit__Group__3__Impl rule__Limit__Group__4 )
            // InternalKinematicsParser.g:3079:2: rule__Limit__Group__3__Impl rule__Limit__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalKinematicsParser.g:3086:1: rule__Limit__Group__3__Impl : ( ( rule__Limit__Group_3__0 )? ) ;
    public final void rule__Limit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3090:1: ( ( ( rule__Limit__Group_3__0 )? ) )
            // InternalKinematicsParser.g:3091:1: ( ( rule__Limit__Group_3__0 )? )
            {
            // InternalKinematicsParser.g:3091:1: ( ( rule__Limit__Group_3__0 )? )
            // InternalKinematicsParser.g:3092:2: ( rule__Limit__Group_3__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_3()); 
            // InternalKinematicsParser.g:3093:2: ( rule__Limit__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Lower) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalKinematicsParser.g:3093:3: rule__Limit__Group_3__0
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
    // InternalKinematicsParser.g:3101:1: rule__Limit__Group__4 : rule__Limit__Group__4__Impl rule__Limit__Group__5 ;
    public final void rule__Limit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3105:1: ( rule__Limit__Group__4__Impl rule__Limit__Group__5 )
            // InternalKinematicsParser.g:3106:2: rule__Limit__Group__4__Impl rule__Limit__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalKinematicsParser.g:3113:1: rule__Limit__Group__4__Impl : ( ( rule__Limit__Group_4__0 )? ) ;
    public final void rule__Limit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3117:1: ( ( ( rule__Limit__Group_4__0 )? ) )
            // InternalKinematicsParser.g:3118:1: ( ( rule__Limit__Group_4__0 )? )
            {
            // InternalKinematicsParser.g:3118:1: ( ( rule__Limit__Group_4__0 )? )
            // InternalKinematicsParser.g:3119:2: ( rule__Limit__Group_4__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_4()); 
            // InternalKinematicsParser.g:3120:2: ( rule__Limit__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Upper) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalKinematicsParser.g:3120:3: rule__Limit__Group_4__0
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
    // InternalKinematicsParser.g:3128:1: rule__Limit__Group__5 : rule__Limit__Group__5__Impl rule__Limit__Group__6 ;
    public final void rule__Limit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3132:1: ( rule__Limit__Group__5__Impl rule__Limit__Group__6 )
            // InternalKinematicsParser.g:3133:2: rule__Limit__Group__5__Impl rule__Limit__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalKinematicsParser.g:3140:1: rule__Limit__Group__5__Impl : ( ( rule__Limit__Group_5__0 )? ) ;
    public final void rule__Limit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3144:1: ( ( ( rule__Limit__Group_5__0 )? ) )
            // InternalKinematicsParser.g:3145:1: ( ( rule__Limit__Group_5__0 )? )
            {
            // InternalKinematicsParser.g:3145:1: ( ( rule__Limit__Group_5__0 )? )
            // InternalKinematicsParser.g:3146:2: ( rule__Limit__Group_5__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_5()); 
            // InternalKinematicsParser.g:3147:2: ( rule__Limit__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Velocity) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalKinematicsParser.g:3147:3: rule__Limit__Group_5__0
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
    // InternalKinematicsParser.g:3155:1: rule__Limit__Group__6 : rule__Limit__Group__6__Impl ;
    public final void rule__Limit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3159:1: ( rule__Limit__Group__6__Impl )
            // InternalKinematicsParser.g:3160:2: rule__Limit__Group__6__Impl
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
    // InternalKinematicsParser.g:3166:1: rule__Limit__Group__6__Impl : ( RULE_END ) ;
    public final void rule__Limit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3170:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:3171:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:3171:1: ( RULE_END )
            // InternalKinematicsParser.g:3172:2: RULE_END
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
    // InternalKinematicsParser.g:3182:1: rule__Limit__Group_2__0 : rule__Limit__Group_2__0__Impl rule__Limit__Group_2__1 ;
    public final void rule__Limit__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3186:1: ( rule__Limit__Group_2__0__Impl rule__Limit__Group_2__1 )
            // InternalKinematicsParser.g:3187:2: rule__Limit__Group_2__0__Impl rule__Limit__Group_2__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalKinematicsParser.g:3194:1: rule__Limit__Group_2__0__Impl : ( Effort ) ;
    public final void rule__Limit__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3198:1: ( ( Effort ) )
            // InternalKinematicsParser.g:3199:1: ( Effort )
            {
            // InternalKinematicsParser.g:3199:1: ( Effort )
            // InternalKinematicsParser.g:3200:2: Effort
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
    // InternalKinematicsParser.g:3209:1: rule__Limit__Group_2__1 : rule__Limit__Group_2__1__Impl ;
    public final void rule__Limit__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3213:1: ( rule__Limit__Group_2__1__Impl )
            // InternalKinematicsParser.g:3214:2: rule__Limit__Group_2__1__Impl
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
    // InternalKinematicsParser.g:3220:1: rule__Limit__Group_2__1__Impl : ( ( rule__Limit__EffortAssignment_2_1 ) ) ;
    public final void rule__Limit__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3224:1: ( ( ( rule__Limit__EffortAssignment_2_1 ) ) )
            // InternalKinematicsParser.g:3225:1: ( ( rule__Limit__EffortAssignment_2_1 ) )
            {
            // InternalKinematicsParser.g:3225:1: ( ( rule__Limit__EffortAssignment_2_1 ) )
            // InternalKinematicsParser.g:3226:2: ( rule__Limit__EffortAssignment_2_1 )
            {
             before(grammarAccess.getLimitAccess().getEffortAssignment_2_1()); 
            // InternalKinematicsParser.g:3227:2: ( rule__Limit__EffortAssignment_2_1 )
            // InternalKinematicsParser.g:3227:3: rule__Limit__EffortAssignment_2_1
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
    // InternalKinematicsParser.g:3236:1: rule__Limit__Group_3__0 : rule__Limit__Group_3__0__Impl rule__Limit__Group_3__1 ;
    public final void rule__Limit__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3240:1: ( rule__Limit__Group_3__0__Impl rule__Limit__Group_3__1 )
            // InternalKinematicsParser.g:3241:2: rule__Limit__Group_3__0__Impl rule__Limit__Group_3__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalKinematicsParser.g:3248:1: rule__Limit__Group_3__0__Impl : ( Lower ) ;
    public final void rule__Limit__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3252:1: ( ( Lower ) )
            // InternalKinematicsParser.g:3253:1: ( Lower )
            {
            // InternalKinematicsParser.g:3253:1: ( Lower )
            // InternalKinematicsParser.g:3254:2: Lower
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
    // InternalKinematicsParser.g:3263:1: rule__Limit__Group_3__1 : rule__Limit__Group_3__1__Impl ;
    public final void rule__Limit__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3267:1: ( rule__Limit__Group_3__1__Impl )
            // InternalKinematicsParser.g:3268:2: rule__Limit__Group_3__1__Impl
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
    // InternalKinematicsParser.g:3274:1: rule__Limit__Group_3__1__Impl : ( ( rule__Limit__LowerAssignment_3_1 ) ) ;
    public final void rule__Limit__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3278:1: ( ( ( rule__Limit__LowerAssignment_3_1 ) ) )
            // InternalKinematicsParser.g:3279:1: ( ( rule__Limit__LowerAssignment_3_1 ) )
            {
            // InternalKinematicsParser.g:3279:1: ( ( rule__Limit__LowerAssignment_3_1 ) )
            // InternalKinematicsParser.g:3280:2: ( rule__Limit__LowerAssignment_3_1 )
            {
             before(grammarAccess.getLimitAccess().getLowerAssignment_3_1()); 
            // InternalKinematicsParser.g:3281:2: ( rule__Limit__LowerAssignment_3_1 )
            // InternalKinematicsParser.g:3281:3: rule__Limit__LowerAssignment_3_1
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
    // InternalKinematicsParser.g:3290:1: rule__Limit__Group_4__0 : rule__Limit__Group_4__0__Impl rule__Limit__Group_4__1 ;
    public final void rule__Limit__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3294:1: ( rule__Limit__Group_4__0__Impl rule__Limit__Group_4__1 )
            // InternalKinematicsParser.g:3295:2: rule__Limit__Group_4__0__Impl rule__Limit__Group_4__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalKinematicsParser.g:3302:1: rule__Limit__Group_4__0__Impl : ( Upper ) ;
    public final void rule__Limit__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3306:1: ( ( Upper ) )
            // InternalKinematicsParser.g:3307:1: ( Upper )
            {
            // InternalKinematicsParser.g:3307:1: ( Upper )
            // InternalKinematicsParser.g:3308:2: Upper
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
    // InternalKinematicsParser.g:3317:1: rule__Limit__Group_4__1 : rule__Limit__Group_4__1__Impl ;
    public final void rule__Limit__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3321:1: ( rule__Limit__Group_4__1__Impl )
            // InternalKinematicsParser.g:3322:2: rule__Limit__Group_4__1__Impl
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
    // InternalKinematicsParser.g:3328:1: rule__Limit__Group_4__1__Impl : ( ( rule__Limit__UpperAssignment_4_1 ) ) ;
    public final void rule__Limit__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3332:1: ( ( ( rule__Limit__UpperAssignment_4_1 ) ) )
            // InternalKinematicsParser.g:3333:1: ( ( rule__Limit__UpperAssignment_4_1 ) )
            {
            // InternalKinematicsParser.g:3333:1: ( ( rule__Limit__UpperAssignment_4_1 ) )
            // InternalKinematicsParser.g:3334:2: ( rule__Limit__UpperAssignment_4_1 )
            {
             before(grammarAccess.getLimitAccess().getUpperAssignment_4_1()); 
            // InternalKinematicsParser.g:3335:2: ( rule__Limit__UpperAssignment_4_1 )
            // InternalKinematicsParser.g:3335:3: rule__Limit__UpperAssignment_4_1
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
    // InternalKinematicsParser.g:3344:1: rule__Limit__Group_5__0 : rule__Limit__Group_5__0__Impl rule__Limit__Group_5__1 ;
    public final void rule__Limit__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3348:1: ( rule__Limit__Group_5__0__Impl rule__Limit__Group_5__1 )
            // InternalKinematicsParser.g:3349:2: rule__Limit__Group_5__0__Impl rule__Limit__Group_5__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalKinematicsParser.g:3356:1: rule__Limit__Group_5__0__Impl : ( Velocity ) ;
    public final void rule__Limit__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3360:1: ( ( Velocity ) )
            // InternalKinematicsParser.g:3361:1: ( Velocity )
            {
            // InternalKinematicsParser.g:3361:1: ( Velocity )
            // InternalKinematicsParser.g:3362:2: Velocity
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
    // InternalKinematicsParser.g:3371:1: rule__Limit__Group_5__1 : rule__Limit__Group_5__1__Impl ;
    public final void rule__Limit__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3375:1: ( rule__Limit__Group_5__1__Impl )
            // InternalKinematicsParser.g:3376:2: rule__Limit__Group_5__1__Impl
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
    // InternalKinematicsParser.g:3382:1: rule__Limit__Group_5__1__Impl : ( ( rule__Limit__VelocityAssignment_5_1 ) ) ;
    public final void rule__Limit__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3386:1: ( ( ( rule__Limit__VelocityAssignment_5_1 ) ) )
            // InternalKinematicsParser.g:3387:1: ( ( rule__Limit__VelocityAssignment_5_1 ) )
            {
            // InternalKinematicsParser.g:3387:1: ( ( rule__Limit__VelocityAssignment_5_1 ) )
            // InternalKinematicsParser.g:3388:2: ( rule__Limit__VelocityAssignment_5_1 )
            {
             before(grammarAccess.getLimitAccess().getVelocityAssignment_5_1()); 
            // InternalKinematicsParser.g:3389:2: ( rule__Limit__VelocityAssignment_5_1 )
            // InternalKinematicsParser.g:3389:3: rule__Limit__VelocityAssignment_5_1
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
    // InternalKinematicsParser.g:3398:1: rule__Inertial__Group__0 : rule__Inertial__Group__0__Impl rule__Inertial__Group__1 ;
    public final void rule__Inertial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3402:1: ( rule__Inertial__Group__0__Impl rule__Inertial__Group__1 )
            // InternalKinematicsParser.g:3403:2: rule__Inertial__Group__0__Impl rule__Inertial__Group__1
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
    // InternalKinematicsParser.g:3410:1: rule__Inertial__Group__0__Impl : ( () ) ;
    public final void rule__Inertial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3414:1: ( ( () ) )
            // InternalKinematicsParser.g:3415:1: ( () )
            {
            // InternalKinematicsParser.g:3415:1: ( () )
            // InternalKinematicsParser.g:3416:2: ()
            {
             before(grammarAccess.getInertialAccess().getInertialAction_0()); 
            // InternalKinematicsParser.g:3417:2: ()
            // InternalKinematicsParser.g:3417:3: 
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
    // InternalKinematicsParser.g:3425:1: rule__Inertial__Group__1 : rule__Inertial__Group__1__Impl rule__Inertial__Group__2 ;
    public final void rule__Inertial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3429:1: ( rule__Inertial__Group__1__Impl rule__Inertial__Group__2 )
            // InternalKinematicsParser.g:3430:2: rule__Inertial__Group__1__Impl rule__Inertial__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalKinematicsParser.g:3437:1: rule__Inertial__Group__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Inertial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3441:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:3442:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:3442:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:3443:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:3452:1: rule__Inertial__Group__2 : rule__Inertial__Group__2__Impl rule__Inertial__Group__3 ;
    public final void rule__Inertial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3456:1: ( rule__Inertial__Group__2__Impl rule__Inertial__Group__3 )
            // InternalKinematicsParser.g:3457:2: rule__Inertial__Group__2__Impl rule__Inertial__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalKinematicsParser.g:3464:1: rule__Inertial__Group__2__Impl : ( ( rule__Inertial__Group_2__0 )? ) ;
    public final void rule__Inertial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3468:1: ( ( ( rule__Inertial__Group_2__0 )? ) )
            // InternalKinematicsParser.g:3469:1: ( ( rule__Inertial__Group_2__0 )? )
            {
            // InternalKinematicsParser.g:3469:1: ( ( rule__Inertial__Group_2__0 )? )
            // InternalKinematicsParser.g:3470:2: ( rule__Inertial__Group_2__0 )?
            {
             before(grammarAccess.getInertialAccess().getGroup_2()); 
            // InternalKinematicsParser.g:3471:2: ( rule__Inertial__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Origin) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalKinematicsParser.g:3471:3: rule__Inertial__Group_2__0
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
    // InternalKinematicsParser.g:3479:1: rule__Inertial__Group__3 : rule__Inertial__Group__3__Impl rule__Inertial__Group__4 ;
    public final void rule__Inertial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3483:1: ( rule__Inertial__Group__3__Impl rule__Inertial__Group__4 )
            // InternalKinematicsParser.g:3484:2: rule__Inertial__Group__3__Impl rule__Inertial__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalKinematicsParser.g:3491:1: rule__Inertial__Group__3__Impl : ( ( rule__Inertial__Group_3__0 )? ) ;
    public final void rule__Inertial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3495:1: ( ( ( rule__Inertial__Group_3__0 )? ) )
            // InternalKinematicsParser.g:3496:1: ( ( rule__Inertial__Group_3__0 )? )
            {
            // InternalKinematicsParser.g:3496:1: ( ( rule__Inertial__Group_3__0 )? )
            // InternalKinematicsParser.g:3497:2: ( rule__Inertial__Group_3__0 )?
            {
             before(grammarAccess.getInertialAccess().getGroup_3()); 
            // InternalKinematicsParser.g:3498:2: ( rule__Inertial__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Mass) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalKinematicsParser.g:3498:3: rule__Inertial__Group_3__0
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
    // InternalKinematicsParser.g:3506:1: rule__Inertial__Group__4 : rule__Inertial__Group__4__Impl rule__Inertial__Group__5 ;
    public final void rule__Inertial__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3510:1: ( rule__Inertial__Group__4__Impl rule__Inertial__Group__5 )
            // InternalKinematicsParser.g:3511:2: rule__Inertial__Group__4__Impl rule__Inertial__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalKinematicsParser.g:3518:1: rule__Inertial__Group__4__Impl : ( ( rule__Inertial__Group_4__0 )? ) ;
    public final void rule__Inertial__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3522:1: ( ( ( rule__Inertial__Group_4__0 )? ) )
            // InternalKinematicsParser.g:3523:1: ( ( rule__Inertial__Group_4__0 )? )
            {
            // InternalKinematicsParser.g:3523:1: ( ( rule__Inertial__Group_4__0 )? )
            // InternalKinematicsParser.g:3524:2: ( rule__Inertial__Group_4__0 )?
            {
             before(grammarAccess.getInertialAccess().getGroup_4()); 
            // InternalKinematicsParser.g:3525:2: ( rule__Inertial__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Inertia) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalKinematicsParser.g:3525:3: rule__Inertial__Group_4__0
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
    // InternalKinematicsParser.g:3533:1: rule__Inertial__Group__5 : rule__Inertial__Group__5__Impl ;
    public final void rule__Inertial__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3537:1: ( rule__Inertial__Group__5__Impl )
            // InternalKinematicsParser.g:3538:2: rule__Inertial__Group__5__Impl
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
    // InternalKinematicsParser.g:3544:1: rule__Inertial__Group__5__Impl : ( RULE_END ) ;
    public final void rule__Inertial__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3548:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:3549:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:3549:1: ( RULE_END )
            // InternalKinematicsParser.g:3550:2: RULE_END
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
    // InternalKinematicsParser.g:3560:1: rule__Inertial__Group_2__0 : rule__Inertial__Group_2__0__Impl rule__Inertial__Group_2__1 ;
    public final void rule__Inertial__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3564:1: ( rule__Inertial__Group_2__0__Impl rule__Inertial__Group_2__1 )
            // InternalKinematicsParser.g:3565:2: rule__Inertial__Group_2__0__Impl rule__Inertial__Group_2__1
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
    // InternalKinematicsParser.g:3572:1: rule__Inertial__Group_2__0__Impl : ( Origin ) ;
    public final void rule__Inertial__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3576:1: ( ( Origin ) )
            // InternalKinematicsParser.g:3577:1: ( Origin )
            {
            // InternalKinematicsParser.g:3577:1: ( Origin )
            // InternalKinematicsParser.g:3578:2: Origin
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
    // InternalKinematicsParser.g:3587:1: rule__Inertial__Group_2__1 : rule__Inertial__Group_2__1__Impl ;
    public final void rule__Inertial__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3591:1: ( rule__Inertial__Group_2__1__Impl )
            // InternalKinematicsParser.g:3592:2: rule__Inertial__Group_2__1__Impl
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
    // InternalKinematicsParser.g:3598:1: rule__Inertial__Group_2__1__Impl : ( ( rule__Inertial__OriginAssignment_2_1 ) ) ;
    public final void rule__Inertial__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3602:1: ( ( ( rule__Inertial__OriginAssignment_2_1 ) ) )
            // InternalKinematicsParser.g:3603:1: ( ( rule__Inertial__OriginAssignment_2_1 ) )
            {
            // InternalKinematicsParser.g:3603:1: ( ( rule__Inertial__OriginAssignment_2_1 ) )
            // InternalKinematicsParser.g:3604:2: ( rule__Inertial__OriginAssignment_2_1 )
            {
             before(grammarAccess.getInertialAccess().getOriginAssignment_2_1()); 
            // InternalKinematicsParser.g:3605:2: ( rule__Inertial__OriginAssignment_2_1 )
            // InternalKinematicsParser.g:3605:3: rule__Inertial__OriginAssignment_2_1
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
    // InternalKinematicsParser.g:3614:1: rule__Inertial__Group_3__0 : rule__Inertial__Group_3__0__Impl rule__Inertial__Group_3__1 ;
    public final void rule__Inertial__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3618:1: ( rule__Inertial__Group_3__0__Impl rule__Inertial__Group_3__1 )
            // InternalKinematicsParser.g:3619:2: rule__Inertial__Group_3__0__Impl rule__Inertial__Group_3__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalKinematicsParser.g:3626:1: rule__Inertial__Group_3__0__Impl : ( Mass ) ;
    public final void rule__Inertial__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3630:1: ( ( Mass ) )
            // InternalKinematicsParser.g:3631:1: ( Mass )
            {
            // InternalKinematicsParser.g:3631:1: ( Mass )
            // InternalKinematicsParser.g:3632:2: Mass
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
    // InternalKinematicsParser.g:3641:1: rule__Inertial__Group_3__1 : rule__Inertial__Group_3__1__Impl ;
    public final void rule__Inertial__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3645:1: ( rule__Inertial__Group_3__1__Impl )
            // InternalKinematicsParser.g:3646:2: rule__Inertial__Group_3__1__Impl
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
    // InternalKinematicsParser.g:3652:1: rule__Inertial__Group_3__1__Impl : ( ( rule__Inertial__MassAssignment_3_1 ) ) ;
    public final void rule__Inertial__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3656:1: ( ( ( rule__Inertial__MassAssignment_3_1 ) ) )
            // InternalKinematicsParser.g:3657:1: ( ( rule__Inertial__MassAssignment_3_1 ) )
            {
            // InternalKinematicsParser.g:3657:1: ( ( rule__Inertial__MassAssignment_3_1 ) )
            // InternalKinematicsParser.g:3658:2: ( rule__Inertial__MassAssignment_3_1 )
            {
             before(grammarAccess.getInertialAccess().getMassAssignment_3_1()); 
            // InternalKinematicsParser.g:3659:2: ( rule__Inertial__MassAssignment_3_1 )
            // InternalKinematicsParser.g:3659:3: rule__Inertial__MassAssignment_3_1
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
    // InternalKinematicsParser.g:3668:1: rule__Inertial__Group_4__0 : rule__Inertial__Group_4__0__Impl rule__Inertial__Group_4__1 ;
    public final void rule__Inertial__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3672:1: ( rule__Inertial__Group_4__0__Impl rule__Inertial__Group_4__1 )
            // InternalKinematicsParser.g:3673:2: rule__Inertial__Group_4__0__Impl rule__Inertial__Group_4__1
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
    // InternalKinematicsParser.g:3680:1: rule__Inertial__Group_4__0__Impl : ( Inertia ) ;
    public final void rule__Inertial__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3684:1: ( ( Inertia ) )
            // InternalKinematicsParser.g:3685:1: ( Inertia )
            {
            // InternalKinematicsParser.g:3685:1: ( Inertia )
            // InternalKinematicsParser.g:3686:2: Inertia
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
    // InternalKinematicsParser.g:3695:1: rule__Inertial__Group_4__1 : rule__Inertial__Group_4__1__Impl ;
    public final void rule__Inertial__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3699:1: ( rule__Inertial__Group_4__1__Impl )
            // InternalKinematicsParser.g:3700:2: rule__Inertial__Group_4__1__Impl
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
    // InternalKinematicsParser.g:3706:1: rule__Inertial__Group_4__1__Impl : ( ( rule__Inertial__InertiaAssignment_4_1 ) ) ;
    public final void rule__Inertial__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3710:1: ( ( ( rule__Inertial__InertiaAssignment_4_1 ) ) )
            // InternalKinematicsParser.g:3711:1: ( ( rule__Inertial__InertiaAssignment_4_1 ) )
            {
            // InternalKinematicsParser.g:3711:1: ( ( rule__Inertial__InertiaAssignment_4_1 ) )
            // InternalKinematicsParser.g:3712:2: ( rule__Inertial__InertiaAssignment_4_1 )
            {
             before(grammarAccess.getInertialAccess().getInertiaAssignment_4_1()); 
            // InternalKinematicsParser.g:3713:2: ( rule__Inertial__InertiaAssignment_4_1 )
            // InternalKinematicsParser.g:3713:3: rule__Inertial__InertiaAssignment_4_1
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
    // InternalKinematicsParser.g:3722:1: rule__Visual__Group__0 : rule__Visual__Group__0__Impl rule__Visual__Group__1 ;
    public final void rule__Visual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3726:1: ( rule__Visual__Group__0__Impl rule__Visual__Group__1 )
            // InternalKinematicsParser.g:3727:2: rule__Visual__Group__0__Impl rule__Visual__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalKinematicsParser.g:3734:1: rule__Visual__Group__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Visual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3738:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:3739:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:3739:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:3740:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:3749:1: rule__Visual__Group__1 : rule__Visual__Group__1__Impl rule__Visual__Group__2 ;
    public final void rule__Visual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3753:1: ( rule__Visual__Group__1__Impl rule__Visual__Group__2 )
            // InternalKinematicsParser.g:3754:2: rule__Visual__Group__1__Impl rule__Visual__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalKinematicsParser.g:3761:1: rule__Visual__Group__1__Impl : ( ( rule__Visual__Group_1__0 )? ) ;
    public final void rule__Visual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3765:1: ( ( ( rule__Visual__Group_1__0 )? ) )
            // InternalKinematicsParser.g:3766:1: ( ( rule__Visual__Group_1__0 )? )
            {
            // InternalKinematicsParser.g:3766:1: ( ( rule__Visual__Group_1__0 )? )
            // InternalKinematicsParser.g:3767:2: ( rule__Visual__Group_1__0 )?
            {
             before(grammarAccess.getVisualAccess().getGroup_1()); 
            // InternalKinematicsParser.g:3768:2: ( rule__Visual__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Origin) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKinematicsParser.g:3768:3: rule__Visual__Group_1__0
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
    // InternalKinematicsParser.g:3776:1: rule__Visual__Group__2 : rule__Visual__Group__2__Impl rule__Visual__Group__3 ;
    public final void rule__Visual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3780:1: ( rule__Visual__Group__2__Impl rule__Visual__Group__3 )
            // InternalKinematicsParser.g:3781:2: rule__Visual__Group__2__Impl rule__Visual__Group__3
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
    // InternalKinematicsParser.g:3788:1: rule__Visual__Group__2__Impl : ( Geometry ) ;
    public final void rule__Visual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3792:1: ( ( Geometry ) )
            // InternalKinematicsParser.g:3793:1: ( Geometry )
            {
            // InternalKinematicsParser.g:3793:1: ( Geometry )
            // InternalKinematicsParser.g:3794:2: Geometry
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
    // InternalKinematicsParser.g:3803:1: rule__Visual__Group__3 : rule__Visual__Group__3__Impl rule__Visual__Group__4 ;
    public final void rule__Visual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3807:1: ( rule__Visual__Group__3__Impl rule__Visual__Group__4 )
            // InternalKinematicsParser.g:3808:2: rule__Visual__Group__3__Impl rule__Visual__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalKinematicsParser.g:3815:1: rule__Visual__Group__3__Impl : ( ( rule__Visual__GeometryAssignment_3 ) ) ;
    public final void rule__Visual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3819:1: ( ( ( rule__Visual__GeometryAssignment_3 ) ) )
            // InternalKinematicsParser.g:3820:1: ( ( rule__Visual__GeometryAssignment_3 ) )
            {
            // InternalKinematicsParser.g:3820:1: ( ( rule__Visual__GeometryAssignment_3 ) )
            // InternalKinematicsParser.g:3821:2: ( rule__Visual__GeometryAssignment_3 )
            {
             before(grammarAccess.getVisualAccess().getGeometryAssignment_3()); 
            // InternalKinematicsParser.g:3822:2: ( rule__Visual__GeometryAssignment_3 )
            // InternalKinematicsParser.g:3822:3: rule__Visual__GeometryAssignment_3
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
    // InternalKinematicsParser.g:3830:1: rule__Visual__Group__4 : rule__Visual__Group__4__Impl ;
    public final void rule__Visual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3834:1: ( rule__Visual__Group__4__Impl )
            // InternalKinematicsParser.g:3835:2: rule__Visual__Group__4__Impl
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
    // InternalKinematicsParser.g:3841:1: rule__Visual__Group__4__Impl : ( RULE_END ) ;
    public final void rule__Visual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3845:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:3846:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:3846:1: ( RULE_END )
            // InternalKinematicsParser.g:3847:2: RULE_END
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
    // InternalKinematicsParser.g:3857:1: rule__Visual__Group_1__0 : rule__Visual__Group_1__0__Impl rule__Visual__Group_1__1 ;
    public final void rule__Visual__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3861:1: ( rule__Visual__Group_1__0__Impl rule__Visual__Group_1__1 )
            // InternalKinematicsParser.g:3862:2: rule__Visual__Group_1__0__Impl rule__Visual__Group_1__1
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
    // InternalKinematicsParser.g:3869:1: rule__Visual__Group_1__0__Impl : ( Origin ) ;
    public final void rule__Visual__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3873:1: ( ( Origin ) )
            // InternalKinematicsParser.g:3874:1: ( Origin )
            {
            // InternalKinematicsParser.g:3874:1: ( Origin )
            // InternalKinematicsParser.g:3875:2: Origin
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
    // InternalKinematicsParser.g:3884:1: rule__Visual__Group_1__1 : rule__Visual__Group_1__1__Impl ;
    public final void rule__Visual__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3888:1: ( rule__Visual__Group_1__1__Impl )
            // InternalKinematicsParser.g:3889:2: rule__Visual__Group_1__1__Impl
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
    // InternalKinematicsParser.g:3895:1: rule__Visual__Group_1__1__Impl : ( ( rule__Visual__OriginAssignment_1_1 ) ) ;
    public final void rule__Visual__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3899:1: ( ( ( rule__Visual__OriginAssignment_1_1 ) ) )
            // InternalKinematicsParser.g:3900:1: ( ( rule__Visual__OriginAssignment_1_1 ) )
            {
            // InternalKinematicsParser.g:3900:1: ( ( rule__Visual__OriginAssignment_1_1 ) )
            // InternalKinematicsParser.g:3901:2: ( rule__Visual__OriginAssignment_1_1 )
            {
             before(grammarAccess.getVisualAccess().getOriginAssignment_1_1()); 
            // InternalKinematicsParser.g:3902:2: ( rule__Visual__OriginAssignment_1_1 )
            // InternalKinematicsParser.g:3902:3: rule__Visual__OriginAssignment_1_1
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
    // InternalKinematicsParser.g:3911:1: rule__Collision__Group__0 : rule__Collision__Group__0__Impl rule__Collision__Group__1 ;
    public final void rule__Collision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3915:1: ( rule__Collision__Group__0__Impl rule__Collision__Group__1 )
            // InternalKinematicsParser.g:3916:2: rule__Collision__Group__0__Impl rule__Collision__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalKinematicsParser.g:3923:1: rule__Collision__Group__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Collision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3927:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:3928:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:3928:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:3929:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:3938:1: rule__Collision__Group__1 : rule__Collision__Group__1__Impl rule__Collision__Group__2 ;
    public final void rule__Collision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3942:1: ( rule__Collision__Group__1__Impl rule__Collision__Group__2 )
            // InternalKinematicsParser.g:3943:2: rule__Collision__Group__1__Impl rule__Collision__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalKinematicsParser.g:3950:1: rule__Collision__Group__1__Impl : ( ( rule__Collision__Group_1__0 )? ) ;
    public final void rule__Collision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3954:1: ( ( ( rule__Collision__Group_1__0 )? ) )
            // InternalKinematicsParser.g:3955:1: ( ( rule__Collision__Group_1__0 )? )
            {
            // InternalKinematicsParser.g:3955:1: ( ( rule__Collision__Group_1__0 )? )
            // InternalKinematicsParser.g:3956:2: ( rule__Collision__Group_1__0 )?
            {
             before(grammarAccess.getCollisionAccess().getGroup_1()); 
            // InternalKinematicsParser.g:3957:2: ( rule__Collision__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Origin) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalKinematicsParser.g:3957:3: rule__Collision__Group_1__0
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
    // InternalKinematicsParser.g:3965:1: rule__Collision__Group__2 : rule__Collision__Group__2__Impl rule__Collision__Group__3 ;
    public final void rule__Collision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3969:1: ( rule__Collision__Group__2__Impl rule__Collision__Group__3 )
            // InternalKinematicsParser.g:3970:2: rule__Collision__Group__2__Impl rule__Collision__Group__3
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
    // InternalKinematicsParser.g:3977:1: rule__Collision__Group__2__Impl : ( Geometry ) ;
    public final void rule__Collision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3981:1: ( ( Geometry ) )
            // InternalKinematicsParser.g:3982:1: ( Geometry )
            {
            // InternalKinematicsParser.g:3982:1: ( Geometry )
            // InternalKinematicsParser.g:3983:2: Geometry
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
    // InternalKinematicsParser.g:3992:1: rule__Collision__Group__3 : rule__Collision__Group__3__Impl rule__Collision__Group__4 ;
    public final void rule__Collision__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3996:1: ( rule__Collision__Group__3__Impl rule__Collision__Group__4 )
            // InternalKinematicsParser.g:3997:2: rule__Collision__Group__3__Impl rule__Collision__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalKinematicsParser.g:4004:1: rule__Collision__Group__3__Impl : ( ( rule__Collision__GeometryAssignment_3 ) ) ;
    public final void rule__Collision__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4008:1: ( ( ( rule__Collision__GeometryAssignment_3 ) ) )
            // InternalKinematicsParser.g:4009:1: ( ( rule__Collision__GeometryAssignment_3 ) )
            {
            // InternalKinematicsParser.g:4009:1: ( ( rule__Collision__GeometryAssignment_3 ) )
            // InternalKinematicsParser.g:4010:2: ( rule__Collision__GeometryAssignment_3 )
            {
             before(grammarAccess.getCollisionAccess().getGeometryAssignment_3()); 
            // InternalKinematicsParser.g:4011:2: ( rule__Collision__GeometryAssignment_3 )
            // InternalKinematicsParser.g:4011:3: rule__Collision__GeometryAssignment_3
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
    // InternalKinematicsParser.g:4019:1: rule__Collision__Group__4 : rule__Collision__Group__4__Impl ;
    public final void rule__Collision__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4023:1: ( rule__Collision__Group__4__Impl )
            // InternalKinematicsParser.g:4024:2: rule__Collision__Group__4__Impl
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
    // InternalKinematicsParser.g:4030:1: rule__Collision__Group__4__Impl : ( RULE_END ) ;
    public final void rule__Collision__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4034:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:4035:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:4035:1: ( RULE_END )
            // InternalKinematicsParser.g:4036:2: RULE_END
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
    // InternalKinematicsParser.g:4046:1: rule__Collision__Group_1__0 : rule__Collision__Group_1__0__Impl rule__Collision__Group_1__1 ;
    public final void rule__Collision__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4050:1: ( rule__Collision__Group_1__0__Impl rule__Collision__Group_1__1 )
            // InternalKinematicsParser.g:4051:2: rule__Collision__Group_1__0__Impl rule__Collision__Group_1__1
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
    // InternalKinematicsParser.g:4058:1: rule__Collision__Group_1__0__Impl : ( Origin ) ;
    public final void rule__Collision__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4062:1: ( ( Origin ) )
            // InternalKinematicsParser.g:4063:1: ( Origin )
            {
            // InternalKinematicsParser.g:4063:1: ( Origin )
            // InternalKinematicsParser.g:4064:2: Origin
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
    // InternalKinematicsParser.g:4073:1: rule__Collision__Group_1__1 : rule__Collision__Group_1__1__Impl ;
    public final void rule__Collision__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4077:1: ( rule__Collision__Group_1__1__Impl )
            // InternalKinematicsParser.g:4078:2: rule__Collision__Group_1__1__Impl
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
    // InternalKinematicsParser.g:4084:1: rule__Collision__Group_1__1__Impl : ( ( rule__Collision__OriginAssignment_1_1 ) ) ;
    public final void rule__Collision__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4088:1: ( ( ( rule__Collision__OriginAssignment_1_1 ) ) )
            // InternalKinematicsParser.g:4089:1: ( ( rule__Collision__OriginAssignment_1_1 ) )
            {
            // InternalKinematicsParser.g:4089:1: ( ( rule__Collision__OriginAssignment_1_1 ) )
            // InternalKinematicsParser.g:4090:2: ( rule__Collision__OriginAssignment_1_1 )
            {
             before(grammarAccess.getCollisionAccess().getOriginAssignment_1_1()); 
            // InternalKinematicsParser.g:4091:2: ( rule__Collision__OriginAssignment_1_1 )
            // InternalKinematicsParser.g:4091:3: rule__Collision__OriginAssignment_1_1
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
    // InternalKinematicsParser.g:4100:1: rule__Mass__Group__0 : rule__Mass__Group__0__Impl rule__Mass__Group__1 ;
    public final void rule__Mass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4104:1: ( rule__Mass__Group__0__Impl rule__Mass__Group__1 )
            // InternalKinematicsParser.g:4105:2: rule__Mass__Group__0__Impl rule__Mass__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalKinematicsParser.g:4112:1: rule__Mass__Group__0__Impl : ( () ) ;
    public final void rule__Mass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4116:1: ( ( () ) )
            // InternalKinematicsParser.g:4117:1: ( () )
            {
            // InternalKinematicsParser.g:4117:1: ( () )
            // InternalKinematicsParser.g:4118:2: ()
            {
             before(grammarAccess.getMassAccess().getMassAction_0()); 
            // InternalKinematicsParser.g:4119:2: ()
            // InternalKinematicsParser.g:4119:3: 
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
    // InternalKinematicsParser.g:4127:1: rule__Mass__Group__1 : rule__Mass__Group__1__Impl ;
    public final void rule__Mass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4131:1: ( rule__Mass__Group__1__Impl )
            // InternalKinematicsParser.g:4132:2: rule__Mass__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mass__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalKinematicsParser.g:4138:1: rule__Mass__Group__1__Impl : ( ( rule__Mass__ValueAssignment_1 ) ) ;
    public final void rule__Mass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4142:1: ( ( ( rule__Mass__ValueAssignment_1 ) ) )
            // InternalKinematicsParser.g:4143:1: ( ( rule__Mass__ValueAssignment_1 ) )
            {
            // InternalKinematicsParser.g:4143:1: ( ( rule__Mass__ValueAssignment_1 ) )
            // InternalKinematicsParser.g:4144:2: ( rule__Mass__ValueAssignment_1 )
            {
             before(grammarAccess.getMassAccess().getValueAssignment_1()); 
            // InternalKinematicsParser.g:4145:2: ( rule__Mass__ValueAssignment_1 )
            // InternalKinematicsParser.g:4145:3: rule__Mass__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Mass__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMassAccess().getValueAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Inertia__Group__0"
    // InternalKinematicsParser.g:4154:1: rule__Inertia__Group__0 : rule__Inertia__Group__0__Impl rule__Inertia__Group__1 ;
    public final void rule__Inertia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4158:1: ( rule__Inertia__Group__0__Impl rule__Inertia__Group__1 )
            // InternalKinematicsParser.g:4159:2: rule__Inertia__Group__0__Impl rule__Inertia__Group__1
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
    // InternalKinematicsParser.g:4166:1: rule__Inertia__Group__0__Impl : ( () ) ;
    public final void rule__Inertia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4170:1: ( ( () ) )
            // InternalKinematicsParser.g:4171:1: ( () )
            {
            // InternalKinematicsParser.g:4171:1: ( () )
            // InternalKinematicsParser.g:4172:2: ()
            {
             before(grammarAccess.getInertiaAccess().getInertiaAction_0()); 
            // InternalKinematicsParser.g:4173:2: ()
            // InternalKinematicsParser.g:4173:3: 
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
    // InternalKinematicsParser.g:4181:1: rule__Inertia__Group__1 : rule__Inertia__Group__1__Impl rule__Inertia__Group__2 ;
    public final void rule__Inertia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4185:1: ( rule__Inertia__Group__1__Impl rule__Inertia__Group__2 )
            // InternalKinematicsParser.g:4186:2: rule__Inertia__Group__1__Impl rule__Inertia__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalKinematicsParser.g:4193:1: rule__Inertia__Group__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Inertia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4197:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:4198:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:4198:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:4199:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:4208:1: rule__Inertia__Group__2 : rule__Inertia__Group__2__Impl rule__Inertia__Group__3 ;
    public final void rule__Inertia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4212:1: ( rule__Inertia__Group__2__Impl rule__Inertia__Group__3 )
            // InternalKinematicsParser.g:4213:2: rule__Inertia__Group__2__Impl rule__Inertia__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalKinematicsParser.g:4220:1: rule__Inertia__Group__2__Impl : ( ( rule__Inertia__Group_2__0 )? ) ;
    public final void rule__Inertia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4224:1: ( ( ( rule__Inertia__Group_2__0 )? ) )
            // InternalKinematicsParser.g:4225:1: ( ( rule__Inertia__Group_2__0 )? )
            {
            // InternalKinematicsParser.g:4225:1: ( ( rule__Inertia__Group_2__0 )? )
            // InternalKinematicsParser.g:4226:2: ( rule__Inertia__Group_2__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_2()); 
            // InternalKinematicsParser.g:4227:2: ( rule__Inertia__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Ixx) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalKinematicsParser.g:4227:3: rule__Inertia__Group_2__0
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
    // InternalKinematicsParser.g:4235:1: rule__Inertia__Group__3 : rule__Inertia__Group__3__Impl rule__Inertia__Group__4 ;
    public final void rule__Inertia__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4239:1: ( rule__Inertia__Group__3__Impl rule__Inertia__Group__4 )
            // InternalKinematicsParser.g:4240:2: rule__Inertia__Group__3__Impl rule__Inertia__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalKinematicsParser.g:4247:1: rule__Inertia__Group__3__Impl : ( ( rule__Inertia__Group_3__0 )? ) ;
    public final void rule__Inertia__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4251:1: ( ( ( rule__Inertia__Group_3__0 )? ) )
            // InternalKinematicsParser.g:4252:1: ( ( rule__Inertia__Group_3__0 )? )
            {
            // InternalKinematicsParser.g:4252:1: ( ( rule__Inertia__Group_3__0 )? )
            // InternalKinematicsParser.g:4253:2: ( rule__Inertia__Group_3__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_3()); 
            // InternalKinematicsParser.g:4254:2: ( rule__Inertia__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Ixy) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalKinematicsParser.g:4254:3: rule__Inertia__Group_3__0
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
    // InternalKinematicsParser.g:4262:1: rule__Inertia__Group__4 : rule__Inertia__Group__4__Impl rule__Inertia__Group__5 ;
    public final void rule__Inertia__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4266:1: ( rule__Inertia__Group__4__Impl rule__Inertia__Group__5 )
            // InternalKinematicsParser.g:4267:2: rule__Inertia__Group__4__Impl rule__Inertia__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalKinematicsParser.g:4274:1: rule__Inertia__Group__4__Impl : ( ( rule__Inertia__Group_4__0 )? ) ;
    public final void rule__Inertia__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4278:1: ( ( ( rule__Inertia__Group_4__0 )? ) )
            // InternalKinematicsParser.g:4279:1: ( ( rule__Inertia__Group_4__0 )? )
            {
            // InternalKinematicsParser.g:4279:1: ( ( rule__Inertia__Group_4__0 )? )
            // InternalKinematicsParser.g:4280:2: ( rule__Inertia__Group_4__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_4()); 
            // InternalKinematicsParser.g:4281:2: ( rule__Inertia__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Ixz) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalKinematicsParser.g:4281:3: rule__Inertia__Group_4__0
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
    // InternalKinematicsParser.g:4289:1: rule__Inertia__Group__5 : rule__Inertia__Group__5__Impl rule__Inertia__Group__6 ;
    public final void rule__Inertia__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4293:1: ( rule__Inertia__Group__5__Impl rule__Inertia__Group__6 )
            // InternalKinematicsParser.g:4294:2: rule__Inertia__Group__5__Impl rule__Inertia__Group__6
            {
            pushFollow(FOLLOW_29);
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
    // InternalKinematicsParser.g:4301:1: rule__Inertia__Group__5__Impl : ( ( rule__Inertia__Group_5__0 )? ) ;
    public final void rule__Inertia__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4305:1: ( ( ( rule__Inertia__Group_5__0 )? ) )
            // InternalKinematicsParser.g:4306:1: ( ( rule__Inertia__Group_5__0 )? )
            {
            // InternalKinematicsParser.g:4306:1: ( ( rule__Inertia__Group_5__0 )? )
            // InternalKinematicsParser.g:4307:2: ( rule__Inertia__Group_5__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_5()); 
            // InternalKinematicsParser.g:4308:2: ( rule__Inertia__Group_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Iyy) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalKinematicsParser.g:4308:3: rule__Inertia__Group_5__0
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
    // InternalKinematicsParser.g:4316:1: rule__Inertia__Group__6 : rule__Inertia__Group__6__Impl rule__Inertia__Group__7 ;
    public final void rule__Inertia__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4320:1: ( rule__Inertia__Group__6__Impl rule__Inertia__Group__7 )
            // InternalKinematicsParser.g:4321:2: rule__Inertia__Group__6__Impl rule__Inertia__Group__7
            {
            pushFollow(FOLLOW_29);
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
    // InternalKinematicsParser.g:4328:1: rule__Inertia__Group__6__Impl : ( ( rule__Inertia__Group_6__0 )? ) ;
    public final void rule__Inertia__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4332:1: ( ( ( rule__Inertia__Group_6__0 )? ) )
            // InternalKinematicsParser.g:4333:1: ( ( rule__Inertia__Group_6__0 )? )
            {
            // InternalKinematicsParser.g:4333:1: ( ( rule__Inertia__Group_6__0 )? )
            // InternalKinematicsParser.g:4334:2: ( rule__Inertia__Group_6__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_6()); 
            // InternalKinematicsParser.g:4335:2: ( rule__Inertia__Group_6__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Iyz) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalKinematicsParser.g:4335:3: rule__Inertia__Group_6__0
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
    // InternalKinematicsParser.g:4343:1: rule__Inertia__Group__7 : rule__Inertia__Group__7__Impl rule__Inertia__Group__8 ;
    public final void rule__Inertia__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4347:1: ( rule__Inertia__Group__7__Impl rule__Inertia__Group__8 )
            // InternalKinematicsParser.g:4348:2: rule__Inertia__Group__7__Impl rule__Inertia__Group__8
            {
            pushFollow(FOLLOW_29);
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
    // InternalKinematicsParser.g:4355:1: rule__Inertia__Group__7__Impl : ( ( rule__Inertia__Group_7__0 )? ) ;
    public final void rule__Inertia__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4359:1: ( ( ( rule__Inertia__Group_7__0 )? ) )
            // InternalKinematicsParser.g:4360:1: ( ( rule__Inertia__Group_7__0 )? )
            {
            // InternalKinematicsParser.g:4360:1: ( ( rule__Inertia__Group_7__0 )? )
            // InternalKinematicsParser.g:4361:2: ( rule__Inertia__Group_7__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_7()); 
            // InternalKinematicsParser.g:4362:2: ( rule__Inertia__Group_7__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Izz) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalKinematicsParser.g:4362:3: rule__Inertia__Group_7__0
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
    // InternalKinematicsParser.g:4370:1: rule__Inertia__Group__8 : rule__Inertia__Group__8__Impl ;
    public final void rule__Inertia__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4374:1: ( rule__Inertia__Group__8__Impl )
            // InternalKinematicsParser.g:4375:2: rule__Inertia__Group__8__Impl
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
    // InternalKinematicsParser.g:4381:1: rule__Inertia__Group__8__Impl : ( RULE_END ) ;
    public final void rule__Inertia__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4385:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:4386:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:4386:1: ( RULE_END )
            // InternalKinematicsParser.g:4387:2: RULE_END
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
    // InternalKinematicsParser.g:4397:1: rule__Inertia__Group_2__0 : rule__Inertia__Group_2__0__Impl rule__Inertia__Group_2__1 ;
    public final void rule__Inertia__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4401:1: ( rule__Inertia__Group_2__0__Impl rule__Inertia__Group_2__1 )
            // InternalKinematicsParser.g:4402:2: rule__Inertia__Group_2__0__Impl rule__Inertia__Group_2__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalKinematicsParser.g:4409:1: rule__Inertia__Group_2__0__Impl : ( Ixx ) ;
    public final void rule__Inertia__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4413:1: ( ( Ixx ) )
            // InternalKinematicsParser.g:4414:1: ( Ixx )
            {
            // InternalKinematicsParser.g:4414:1: ( Ixx )
            // InternalKinematicsParser.g:4415:2: Ixx
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
    // InternalKinematicsParser.g:4424:1: rule__Inertia__Group_2__1 : rule__Inertia__Group_2__1__Impl ;
    public final void rule__Inertia__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4428:1: ( rule__Inertia__Group_2__1__Impl )
            // InternalKinematicsParser.g:4429:2: rule__Inertia__Group_2__1__Impl
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
    // InternalKinematicsParser.g:4435:1: rule__Inertia__Group_2__1__Impl : ( ( rule__Inertia__IxxAssignment_2_1 ) ) ;
    public final void rule__Inertia__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4439:1: ( ( ( rule__Inertia__IxxAssignment_2_1 ) ) )
            // InternalKinematicsParser.g:4440:1: ( ( rule__Inertia__IxxAssignment_2_1 ) )
            {
            // InternalKinematicsParser.g:4440:1: ( ( rule__Inertia__IxxAssignment_2_1 ) )
            // InternalKinematicsParser.g:4441:2: ( rule__Inertia__IxxAssignment_2_1 )
            {
             before(grammarAccess.getInertiaAccess().getIxxAssignment_2_1()); 
            // InternalKinematicsParser.g:4442:2: ( rule__Inertia__IxxAssignment_2_1 )
            // InternalKinematicsParser.g:4442:3: rule__Inertia__IxxAssignment_2_1
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
    // InternalKinematicsParser.g:4451:1: rule__Inertia__Group_3__0 : rule__Inertia__Group_3__0__Impl rule__Inertia__Group_3__1 ;
    public final void rule__Inertia__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4455:1: ( rule__Inertia__Group_3__0__Impl rule__Inertia__Group_3__1 )
            // InternalKinematicsParser.g:4456:2: rule__Inertia__Group_3__0__Impl rule__Inertia__Group_3__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalKinematicsParser.g:4463:1: rule__Inertia__Group_3__0__Impl : ( Ixy ) ;
    public final void rule__Inertia__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4467:1: ( ( Ixy ) )
            // InternalKinematicsParser.g:4468:1: ( Ixy )
            {
            // InternalKinematicsParser.g:4468:1: ( Ixy )
            // InternalKinematicsParser.g:4469:2: Ixy
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
    // InternalKinematicsParser.g:4478:1: rule__Inertia__Group_3__1 : rule__Inertia__Group_3__1__Impl ;
    public final void rule__Inertia__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4482:1: ( rule__Inertia__Group_3__1__Impl )
            // InternalKinematicsParser.g:4483:2: rule__Inertia__Group_3__1__Impl
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
    // InternalKinematicsParser.g:4489:1: rule__Inertia__Group_3__1__Impl : ( ( rule__Inertia__IxyAssignment_3_1 ) ) ;
    public final void rule__Inertia__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4493:1: ( ( ( rule__Inertia__IxyAssignment_3_1 ) ) )
            // InternalKinematicsParser.g:4494:1: ( ( rule__Inertia__IxyAssignment_3_1 ) )
            {
            // InternalKinematicsParser.g:4494:1: ( ( rule__Inertia__IxyAssignment_3_1 ) )
            // InternalKinematicsParser.g:4495:2: ( rule__Inertia__IxyAssignment_3_1 )
            {
             before(grammarAccess.getInertiaAccess().getIxyAssignment_3_1()); 
            // InternalKinematicsParser.g:4496:2: ( rule__Inertia__IxyAssignment_3_1 )
            // InternalKinematicsParser.g:4496:3: rule__Inertia__IxyAssignment_3_1
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
    // InternalKinematicsParser.g:4505:1: rule__Inertia__Group_4__0 : rule__Inertia__Group_4__0__Impl rule__Inertia__Group_4__1 ;
    public final void rule__Inertia__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4509:1: ( rule__Inertia__Group_4__0__Impl rule__Inertia__Group_4__1 )
            // InternalKinematicsParser.g:4510:2: rule__Inertia__Group_4__0__Impl rule__Inertia__Group_4__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalKinematicsParser.g:4517:1: rule__Inertia__Group_4__0__Impl : ( Ixz ) ;
    public final void rule__Inertia__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4521:1: ( ( Ixz ) )
            // InternalKinematicsParser.g:4522:1: ( Ixz )
            {
            // InternalKinematicsParser.g:4522:1: ( Ixz )
            // InternalKinematicsParser.g:4523:2: Ixz
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
    // InternalKinematicsParser.g:4532:1: rule__Inertia__Group_4__1 : rule__Inertia__Group_4__1__Impl ;
    public final void rule__Inertia__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4536:1: ( rule__Inertia__Group_4__1__Impl )
            // InternalKinematicsParser.g:4537:2: rule__Inertia__Group_4__1__Impl
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
    // InternalKinematicsParser.g:4543:1: rule__Inertia__Group_4__1__Impl : ( ( rule__Inertia__IxzAssignment_4_1 ) ) ;
    public final void rule__Inertia__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4547:1: ( ( ( rule__Inertia__IxzAssignment_4_1 ) ) )
            // InternalKinematicsParser.g:4548:1: ( ( rule__Inertia__IxzAssignment_4_1 ) )
            {
            // InternalKinematicsParser.g:4548:1: ( ( rule__Inertia__IxzAssignment_4_1 ) )
            // InternalKinematicsParser.g:4549:2: ( rule__Inertia__IxzAssignment_4_1 )
            {
             before(grammarAccess.getInertiaAccess().getIxzAssignment_4_1()); 
            // InternalKinematicsParser.g:4550:2: ( rule__Inertia__IxzAssignment_4_1 )
            // InternalKinematicsParser.g:4550:3: rule__Inertia__IxzAssignment_4_1
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
    // InternalKinematicsParser.g:4559:1: rule__Inertia__Group_5__0 : rule__Inertia__Group_5__0__Impl rule__Inertia__Group_5__1 ;
    public final void rule__Inertia__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4563:1: ( rule__Inertia__Group_5__0__Impl rule__Inertia__Group_5__1 )
            // InternalKinematicsParser.g:4564:2: rule__Inertia__Group_5__0__Impl rule__Inertia__Group_5__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalKinematicsParser.g:4571:1: rule__Inertia__Group_5__0__Impl : ( Iyy ) ;
    public final void rule__Inertia__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4575:1: ( ( Iyy ) )
            // InternalKinematicsParser.g:4576:1: ( Iyy )
            {
            // InternalKinematicsParser.g:4576:1: ( Iyy )
            // InternalKinematicsParser.g:4577:2: Iyy
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
    // InternalKinematicsParser.g:4586:1: rule__Inertia__Group_5__1 : rule__Inertia__Group_5__1__Impl ;
    public final void rule__Inertia__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4590:1: ( rule__Inertia__Group_5__1__Impl )
            // InternalKinematicsParser.g:4591:2: rule__Inertia__Group_5__1__Impl
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
    // InternalKinematicsParser.g:4597:1: rule__Inertia__Group_5__1__Impl : ( ( rule__Inertia__IyyAssignment_5_1 ) ) ;
    public final void rule__Inertia__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4601:1: ( ( ( rule__Inertia__IyyAssignment_5_1 ) ) )
            // InternalKinematicsParser.g:4602:1: ( ( rule__Inertia__IyyAssignment_5_1 ) )
            {
            // InternalKinematicsParser.g:4602:1: ( ( rule__Inertia__IyyAssignment_5_1 ) )
            // InternalKinematicsParser.g:4603:2: ( rule__Inertia__IyyAssignment_5_1 )
            {
             before(grammarAccess.getInertiaAccess().getIyyAssignment_5_1()); 
            // InternalKinematicsParser.g:4604:2: ( rule__Inertia__IyyAssignment_5_1 )
            // InternalKinematicsParser.g:4604:3: rule__Inertia__IyyAssignment_5_1
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
    // InternalKinematicsParser.g:4613:1: rule__Inertia__Group_6__0 : rule__Inertia__Group_6__0__Impl rule__Inertia__Group_6__1 ;
    public final void rule__Inertia__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4617:1: ( rule__Inertia__Group_6__0__Impl rule__Inertia__Group_6__1 )
            // InternalKinematicsParser.g:4618:2: rule__Inertia__Group_6__0__Impl rule__Inertia__Group_6__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalKinematicsParser.g:4625:1: rule__Inertia__Group_6__0__Impl : ( Iyz ) ;
    public final void rule__Inertia__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4629:1: ( ( Iyz ) )
            // InternalKinematicsParser.g:4630:1: ( Iyz )
            {
            // InternalKinematicsParser.g:4630:1: ( Iyz )
            // InternalKinematicsParser.g:4631:2: Iyz
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
    // InternalKinematicsParser.g:4640:1: rule__Inertia__Group_6__1 : rule__Inertia__Group_6__1__Impl ;
    public final void rule__Inertia__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4644:1: ( rule__Inertia__Group_6__1__Impl )
            // InternalKinematicsParser.g:4645:2: rule__Inertia__Group_6__1__Impl
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
    // InternalKinematicsParser.g:4651:1: rule__Inertia__Group_6__1__Impl : ( ( rule__Inertia__IyzAssignment_6_1 ) ) ;
    public final void rule__Inertia__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4655:1: ( ( ( rule__Inertia__IyzAssignment_6_1 ) ) )
            // InternalKinematicsParser.g:4656:1: ( ( rule__Inertia__IyzAssignment_6_1 ) )
            {
            // InternalKinematicsParser.g:4656:1: ( ( rule__Inertia__IyzAssignment_6_1 ) )
            // InternalKinematicsParser.g:4657:2: ( rule__Inertia__IyzAssignment_6_1 )
            {
             before(grammarAccess.getInertiaAccess().getIyzAssignment_6_1()); 
            // InternalKinematicsParser.g:4658:2: ( rule__Inertia__IyzAssignment_6_1 )
            // InternalKinematicsParser.g:4658:3: rule__Inertia__IyzAssignment_6_1
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
    // InternalKinematicsParser.g:4667:1: rule__Inertia__Group_7__0 : rule__Inertia__Group_7__0__Impl rule__Inertia__Group_7__1 ;
    public final void rule__Inertia__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4671:1: ( rule__Inertia__Group_7__0__Impl rule__Inertia__Group_7__1 )
            // InternalKinematicsParser.g:4672:2: rule__Inertia__Group_7__0__Impl rule__Inertia__Group_7__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalKinematicsParser.g:4679:1: rule__Inertia__Group_7__0__Impl : ( Izz ) ;
    public final void rule__Inertia__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4683:1: ( ( Izz ) )
            // InternalKinematicsParser.g:4684:1: ( Izz )
            {
            // InternalKinematicsParser.g:4684:1: ( Izz )
            // InternalKinematicsParser.g:4685:2: Izz
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
    // InternalKinematicsParser.g:4694:1: rule__Inertia__Group_7__1 : rule__Inertia__Group_7__1__Impl ;
    public final void rule__Inertia__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4698:1: ( rule__Inertia__Group_7__1__Impl )
            // InternalKinematicsParser.g:4699:2: rule__Inertia__Group_7__1__Impl
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
    // InternalKinematicsParser.g:4705:1: rule__Inertia__Group_7__1__Impl : ( ( rule__Inertia__IzzAssignment_7_1 ) ) ;
    public final void rule__Inertia__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4709:1: ( ( ( rule__Inertia__IzzAssignment_7_1 ) ) )
            // InternalKinematicsParser.g:4710:1: ( ( rule__Inertia__IzzAssignment_7_1 ) )
            {
            // InternalKinematicsParser.g:4710:1: ( ( rule__Inertia__IzzAssignment_7_1 ) )
            // InternalKinematicsParser.g:4711:2: ( rule__Inertia__IzzAssignment_7_1 )
            {
             before(grammarAccess.getInertiaAccess().getIzzAssignment_7_1()); 
            // InternalKinematicsParser.g:4712:2: ( rule__Inertia__IzzAssignment_7_1 )
            // InternalKinematicsParser.g:4712:3: rule__Inertia__IzzAssignment_7_1
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
    // InternalKinematicsParser.g:4721:1: rule__Geometry__Group__0 : rule__Geometry__Group__0__Impl rule__Geometry__Group__1 ;
    public final void rule__Geometry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4725:1: ( rule__Geometry__Group__0__Impl rule__Geometry__Group__1 )
            // InternalKinematicsParser.g:4726:2: rule__Geometry__Group__0__Impl rule__Geometry__Group__1
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
    // InternalKinematicsParser.g:4733:1: rule__Geometry__Group__0__Impl : ( () ) ;
    public final void rule__Geometry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4737:1: ( ( () ) )
            // InternalKinematicsParser.g:4738:1: ( () )
            {
            // InternalKinematicsParser.g:4738:1: ( () )
            // InternalKinematicsParser.g:4739:2: ()
            {
             before(grammarAccess.getGeometryAccess().getGeometryAction_0()); 
            // InternalKinematicsParser.g:4740:2: ()
            // InternalKinematicsParser.g:4740:3: 
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
    // InternalKinematicsParser.g:4748:1: rule__Geometry__Group__1 : rule__Geometry__Group__1__Impl rule__Geometry__Group__2 ;
    public final void rule__Geometry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4752:1: ( rule__Geometry__Group__1__Impl rule__Geometry__Group__2 )
            // InternalKinematicsParser.g:4753:2: rule__Geometry__Group__1__Impl rule__Geometry__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalKinematicsParser.g:4760:1: rule__Geometry__Group__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Geometry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4764:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:4765:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:4765:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:4766:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:4775:1: rule__Geometry__Group__2 : rule__Geometry__Group__2__Impl rule__Geometry__Group__3 ;
    public final void rule__Geometry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4779:1: ( rule__Geometry__Group__2__Impl rule__Geometry__Group__3 )
            // InternalKinematicsParser.g:4780:2: rule__Geometry__Group__2__Impl rule__Geometry__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalKinematicsParser.g:4787:1: rule__Geometry__Group__2__Impl : ( ( rule__Geometry__Group_2__0 )? ) ;
    public final void rule__Geometry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4791:1: ( ( ( rule__Geometry__Group_2__0 )? ) )
            // InternalKinematicsParser.g:4792:1: ( ( rule__Geometry__Group_2__0 )? )
            {
            // InternalKinematicsParser.g:4792:1: ( ( rule__Geometry__Group_2__0 )? )
            // InternalKinematicsParser.g:4793:2: ( rule__Geometry__Group_2__0 )?
            {
             before(grammarAccess.getGeometryAccess().getGroup_2()); 
            // InternalKinematicsParser.g:4794:2: ( rule__Geometry__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Box) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalKinematicsParser.g:4794:3: rule__Geometry__Group_2__0
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
    // InternalKinematicsParser.g:4802:1: rule__Geometry__Group__3 : rule__Geometry__Group__3__Impl rule__Geometry__Group__4 ;
    public final void rule__Geometry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4806:1: ( rule__Geometry__Group__3__Impl rule__Geometry__Group__4 )
            // InternalKinematicsParser.g:4807:2: rule__Geometry__Group__3__Impl rule__Geometry__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalKinematicsParser.g:4814:1: rule__Geometry__Group__3__Impl : ( ( rule__Geometry__Group_3__0 )? ) ;
    public final void rule__Geometry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4818:1: ( ( ( rule__Geometry__Group_3__0 )? ) )
            // InternalKinematicsParser.g:4819:1: ( ( rule__Geometry__Group_3__0 )? )
            {
            // InternalKinematicsParser.g:4819:1: ( ( rule__Geometry__Group_3__0 )? )
            // InternalKinematicsParser.g:4820:2: ( rule__Geometry__Group_3__0 )?
            {
             before(grammarAccess.getGeometryAccess().getGroup_3()); 
            // InternalKinematicsParser.g:4821:2: ( rule__Geometry__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Cylinder) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalKinematicsParser.g:4821:3: rule__Geometry__Group_3__0
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
    // InternalKinematicsParser.g:4829:1: rule__Geometry__Group__4 : rule__Geometry__Group__4__Impl rule__Geometry__Group__5 ;
    public final void rule__Geometry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4833:1: ( rule__Geometry__Group__4__Impl rule__Geometry__Group__5 )
            // InternalKinematicsParser.g:4834:2: rule__Geometry__Group__4__Impl rule__Geometry__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalKinematicsParser.g:4841:1: rule__Geometry__Group__4__Impl : ( ( rule__Geometry__Group_4__0 )? ) ;
    public final void rule__Geometry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4845:1: ( ( ( rule__Geometry__Group_4__0 )? ) )
            // InternalKinematicsParser.g:4846:1: ( ( rule__Geometry__Group_4__0 )? )
            {
            // InternalKinematicsParser.g:4846:1: ( ( rule__Geometry__Group_4__0 )? )
            // InternalKinematicsParser.g:4847:2: ( rule__Geometry__Group_4__0 )?
            {
             before(grammarAccess.getGeometryAccess().getGroup_4()); 
            // InternalKinematicsParser.g:4848:2: ( rule__Geometry__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Sphere) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalKinematicsParser.g:4848:3: rule__Geometry__Group_4__0
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
    // InternalKinematicsParser.g:4856:1: rule__Geometry__Group__5 : rule__Geometry__Group__5__Impl rule__Geometry__Group__6 ;
    public final void rule__Geometry__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4860:1: ( rule__Geometry__Group__5__Impl rule__Geometry__Group__6 )
            // InternalKinematicsParser.g:4861:2: rule__Geometry__Group__5__Impl rule__Geometry__Group__6
            {
            pushFollow(FOLLOW_30);
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
    // InternalKinematicsParser.g:4868:1: rule__Geometry__Group__5__Impl : ( ( rule__Geometry__Group_5__0 )? ) ;
    public final void rule__Geometry__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4872:1: ( ( ( rule__Geometry__Group_5__0 )? ) )
            // InternalKinematicsParser.g:4873:1: ( ( rule__Geometry__Group_5__0 )? )
            {
            // InternalKinematicsParser.g:4873:1: ( ( rule__Geometry__Group_5__0 )? )
            // InternalKinematicsParser.g:4874:2: ( rule__Geometry__Group_5__0 )?
            {
             before(grammarAccess.getGeometryAccess().getGroup_5()); 
            // InternalKinematicsParser.g:4875:2: ( rule__Geometry__Group_5__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Mesh) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalKinematicsParser.g:4875:3: rule__Geometry__Group_5__0
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
    // InternalKinematicsParser.g:4883:1: rule__Geometry__Group__6 : rule__Geometry__Group__6__Impl ;
    public final void rule__Geometry__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4887:1: ( rule__Geometry__Group__6__Impl )
            // InternalKinematicsParser.g:4888:2: rule__Geometry__Group__6__Impl
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
    // InternalKinematicsParser.g:4894:1: rule__Geometry__Group__6__Impl : ( RULE_END ) ;
    public final void rule__Geometry__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4898:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:4899:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:4899:1: ( RULE_END )
            // InternalKinematicsParser.g:4900:2: RULE_END
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
    // InternalKinematicsParser.g:4910:1: rule__Geometry__Group_2__0 : rule__Geometry__Group_2__0__Impl rule__Geometry__Group_2__1 ;
    public final void rule__Geometry__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4914:1: ( rule__Geometry__Group_2__0__Impl rule__Geometry__Group_2__1 )
            // InternalKinematicsParser.g:4915:2: rule__Geometry__Group_2__0__Impl rule__Geometry__Group_2__1
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
    // InternalKinematicsParser.g:4922:1: rule__Geometry__Group_2__0__Impl : ( Box ) ;
    public final void rule__Geometry__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4926:1: ( ( Box ) )
            // InternalKinematicsParser.g:4927:1: ( Box )
            {
            // InternalKinematicsParser.g:4927:1: ( Box )
            // InternalKinematicsParser.g:4928:2: Box
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
    // InternalKinematicsParser.g:4937:1: rule__Geometry__Group_2__1 : rule__Geometry__Group_2__1__Impl ;
    public final void rule__Geometry__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4941:1: ( rule__Geometry__Group_2__1__Impl )
            // InternalKinematicsParser.g:4942:2: rule__Geometry__Group_2__1__Impl
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
    // InternalKinematicsParser.g:4948:1: rule__Geometry__Group_2__1__Impl : ( ( rule__Geometry__BoxAssignment_2_1 ) ) ;
    public final void rule__Geometry__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4952:1: ( ( ( rule__Geometry__BoxAssignment_2_1 ) ) )
            // InternalKinematicsParser.g:4953:1: ( ( rule__Geometry__BoxAssignment_2_1 ) )
            {
            // InternalKinematicsParser.g:4953:1: ( ( rule__Geometry__BoxAssignment_2_1 ) )
            // InternalKinematicsParser.g:4954:2: ( rule__Geometry__BoxAssignment_2_1 )
            {
             before(grammarAccess.getGeometryAccess().getBoxAssignment_2_1()); 
            // InternalKinematicsParser.g:4955:2: ( rule__Geometry__BoxAssignment_2_1 )
            // InternalKinematicsParser.g:4955:3: rule__Geometry__BoxAssignment_2_1
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
    // InternalKinematicsParser.g:4964:1: rule__Geometry__Group_3__0 : rule__Geometry__Group_3__0__Impl rule__Geometry__Group_3__1 ;
    public final void rule__Geometry__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4968:1: ( rule__Geometry__Group_3__0__Impl rule__Geometry__Group_3__1 )
            // InternalKinematicsParser.g:4969:2: rule__Geometry__Group_3__0__Impl rule__Geometry__Group_3__1
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
    // InternalKinematicsParser.g:4976:1: rule__Geometry__Group_3__0__Impl : ( Cylinder ) ;
    public final void rule__Geometry__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4980:1: ( ( Cylinder ) )
            // InternalKinematicsParser.g:4981:1: ( Cylinder )
            {
            // InternalKinematicsParser.g:4981:1: ( Cylinder )
            // InternalKinematicsParser.g:4982:2: Cylinder
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
    // InternalKinematicsParser.g:4991:1: rule__Geometry__Group_3__1 : rule__Geometry__Group_3__1__Impl ;
    public final void rule__Geometry__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4995:1: ( rule__Geometry__Group_3__1__Impl )
            // InternalKinematicsParser.g:4996:2: rule__Geometry__Group_3__1__Impl
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
    // InternalKinematicsParser.g:5002:1: rule__Geometry__Group_3__1__Impl : ( ( rule__Geometry__CylinderAssignment_3_1 ) ) ;
    public final void rule__Geometry__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5006:1: ( ( ( rule__Geometry__CylinderAssignment_3_1 ) ) )
            // InternalKinematicsParser.g:5007:1: ( ( rule__Geometry__CylinderAssignment_3_1 ) )
            {
            // InternalKinematicsParser.g:5007:1: ( ( rule__Geometry__CylinderAssignment_3_1 ) )
            // InternalKinematicsParser.g:5008:2: ( rule__Geometry__CylinderAssignment_3_1 )
            {
             before(grammarAccess.getGeometryAccess().getCylinderAssignment_3_1()); 
            // InternalKinematicsParser.g:5009:2: ( rule__Geometry__CylinderAssignment_3_1 )
            // InternalKinematicsParser.g:5009:3: rule__Geometry__CylinderAssignment_3_1
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
    // InternalKinematicsParser.g:5018:1: rule__Geometry__Group_4__0 : rule__Geometry__Group_4__0__Impl rule__Geometry__Group_4__1 ;
    public final void rule__Geometry__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5022:1: ( rule__Geometry__Group_4__0__Impl rule__Geometry__Group_4__1 )
            // InternalKinematicsParser.g:5023:2: rule__Geometry__Group_4__0__Impl rule__Geometry__Group_4__1
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
    // InternalKinematicsParser.g:5030:1: rule__Geometry__Group_4__0__Impl : ( Sphere ) ;
    public final void rule__Geometry__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5034:1: ( ( Sphere ) )
            // InternalKinematicsParser.g:5035:1: ( Sphere )
            {
            // InternalKinematicsParser.g:5035:1: ( Sphere )
            // InternalKinematicsParser.g:5036:2: Sphere
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
    // InternalKinematicsParser.g:5045:1: rule__Geometry__Group_4__1 : rule__Geometry__Group_4__1__Impl ;
    public final void rule__Geometry__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5049:1: ( rule__Geometry__Group_4__1__Impl )
            // InternalKinematicsParser.g:5050:2: rule__Geometry__Group_4__1__Impl
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
    // InternalKinematicsParser.g:5056:1: rule__Geometry__Group_4__1__Impl : ( ( rule__Geometry__SphereAssignment_4_1 ) ) ;
    public final void rule__Geometry__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5060:1: ( ( ( rule__Geometry__SphereAssignment_4_1 ) ) )
            // InternalKinematicsParser.g:5061:1: ( ( rule__Geometry__SphereAssignment_4_1 ) )
            {
            // InternalKinematicsParser.g:5061:1: ( ( rule__Geometry__SphereAssignment_4_1 ) )
            // InternalKinematicsParser.g:5062:2: ( rule__Geometry__SphereAssignment_4_1 )
            {
             before(grammarAccess.getGeometryAccess().getSphereAssignment_4_1()); 
            // InternalKinematicsParser.g:5063:2: ( rule__Geometry__SphereAssignment_4_1 )
            // InternalKinematicsParser.g:5063:3: rule__Geometry__SphereAssignment_4_1
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
    // InternalKinematicsParser.g:5072:1: rule__Geometry__Group_5__0 : rule__Geometry__Group_5__0__Impl rule__Geometry__Group_5__1 ;
    public final void rule__Geometry__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5076:1: ( rule__Geometry__Group_5__0__Impl rule__Geometry__Group_5__1 )
            // InternalKinematicsParser.g:5077:2: rule__Geometry__Group_5__0__Impl rule__Geometry__Group_5__1
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
    // InternalKinematicsParser.g:5084:1: rule__Geometry__Group_5__0__Impl : ( Mesh ) ;
    public final void rule__Geometry__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5088:1: ( ( Mesh ) )
            // InternalKinematicsParser.g:5089:1: ( Mesh )
            {
            // InternalKinematicsParser.g:5089:1: ( Mesh )
            // InternalKinematicsParser.g:5090:2: Mesh
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
    // InternalKinematicsParser.g:5099:1: rule__Geometry__Group_5__1 : rule__Geometry__Group_5__1__Impl ;
    public final void rule__Geometry__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5103:1: ( rule__Geometry__Group_5__1__Impl )
            // InternalKinematicsParser.g:5104:2: rule__Geometry__Group_5__1__Impl
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
    // InternalKinematicsParser.g:5110:1: rule__Geometry__Group_5__1__Impl : ( ( rule__Geometry__MeshAssignment_5_1 ) ) ;
    public final void rule__Geometry__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5114:1: ( ( ( rule__Geometry__MeshAssignment_5_1 ) ) )
            // InternalKinematicsParser.g:5115:1: ( ( rule__Geometry__MeshAssignment_5_1 ) )
            {
            // InternalKinematicsParser.g:5115:1: ( ( rule__Geometry__MeshAssignment_5_1 ) )
            // InternalKinematicsParser.g:5116:2: ( rule__Geometry__MeshAssignment_5_1 )
            {
             before(grammarAccess.getGeometryAccess().getMeshAssignment_5_1()); 
            // InternalKinematicsParser.g:5117:2: ( rule__Geometry__MeshAssignment_5_1 )
            // InternalKinematicsParser.g:5117:3: rule__Geometry__MeshAssignment_5_1
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
    // InternalKinematicsParser.g:5126:1: rule__Box__Group__0 : rule__Box__Group__0__Impl rule__Box__Group__1 ;
    public final void rule__Box__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5130:1: ( rule__Box__Group__0__Impl rule__Box__Group__1 )
            // InternalKinematicsParser.g:5131:2: rule__Box__Group__0__Impl rule__Box__Group__1
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
    // InternalKinematicsParser.g:5138:1: rule__Box__Group__0__Impl : ( () ) ;
    public final void rule__Box__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5142:1: ( ( () ) )
            // InternalKinematicsParser.g:5143:1: ( () )
            {
            // InternalKinematicsParser.g:5143:1: ( () )
            // InternalKinematicsParser.g:5144:2: ()
            {
             before(grammarAccess.getBoxAccess().getBoxAction_0()); 
            // InternalKinematicsParser.g:5145:2: ()
            // InternalKinematicsParser.g:5145:3: 
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
    // InternalKinematicsParser.g:5153:1: rule__Box__Group__1 : rule__Box__Group__1__Impl rule__Box__Group__2 ;
    public final void rule__Box__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5157:1: ( rule__Box__Group__1__Impl rule__Box__Group__2 )
            // InternalKinematicsParser.g:5158:2: rule__Box__Group__1__Impl rule__Box__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalKinematicsParser.g:5165:1: rule__Box__Group__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Box__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5169:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:5170:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:5170:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:5171:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:5180:1: rule__Box__Group__2 : rule__Box__Group__2__Impl rule__Box__Group__3 ;
    public final void rule__Box__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5184:1: ( rule__Box__Group__2__Impl rule__Box__Group__3 )
            // InternalKinematicsParser.g:5185:2: rule__Box__Group__2__Impl rule__Box__Group__3
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
    // InternalKinematicsParser.g:5192:1: rule__Box__Group__2__Impl : ( Size ) ;
    public final void rule__Box__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5196:1: ( ( Size ) )
            // InternalKinematicsParser.g:5197:1: ( Size )
            {
            // InternalKinematicsParser.g:5197:1: ( Size )
            // InternalKinematicsParser.g:5198:2: Size
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
    // InternalKinematicsParser.g:5207:1: rule__Box__Group__3 : rule__Box__Group__3__Impl rule__Box__Group__4 ;
    public final void rule__Box__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5211:1: ( rule__Box__Group__3__Impl rule__Box__Group__4 )
            // InternalKinematicsParser.g:5212:2: rule__Box__Group__3__Impl rule__Box__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalKinematicsParser.g:5219:1: rule__Box__Group__3__Impl : ( ( rule__Box__SizeAssignment_3 ) ) ;
    public final void rule__Box__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5223:1: ( ( ( rule__Box__SizeAssignment_3 ) ) )
            // InternalKinematicsParser.g:5224:1: ( ( rule__Box__SizeAssignment_3 ) )
            {
            // InternalKinematicsParser.g:5224:1: ( ( rule__Box__SizeAssignment_3 ) )
            // InternalKinematicsParser.g:5225:2: ( rule__Box__SizeAssignment_3 )
            {
             before(grammarAccess.getBoxAccess().getSizeAssignment_3()); 
            // InternalKinematicsParser.g:5226:2: ( rule__Box__SizeAssignment_3 )
            // InternalKinematicsParser.g:5226:3: rule__Box__SizeAssignment_3
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
    // InternalKinematicsParser.g:5234:1: rule__Box__Group__4 : rule__Box__Group__4__Impl ;
    public final void rule__Box__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5238:1: ( rule__Box__Group__4__Impl )
            // InternalKinematicsParser.g:5239:2: rule__Box__Group__4__Impl
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
    // InternalKinematicsParser.g:5245:1: rule__Box__Group__4__Impl : ( RULE_END ) ;
    public final void rule__Box__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5249:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:5250:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:5250:1: ( RULE_END )
            // InternalKinematicsParser.g:5251:2: RULE_END
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
    // InternalKinematicsParser.g:5261:1: rule__Cylinder__Group__0 : rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 ;
    public final void rule__Cylinder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5265:1: ( rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 )
            // InternalKinematicsParser.g:5266:2: rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalKinematicsParser.g:5273:1: rule__Cylinder__Group__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Cylinder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5277:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:5278:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:5278:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:5279:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:5288:1: rule__Cylinder__Group__1 : rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 ;
    public final void rule__Cylinder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5292:1: ( rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 )
            // InternalKinematicsParser.g:5293:2: rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalKinematicsParser.g:5300:1: rule__Cylinder__Group__1__Impl : ( Length ) ;
    public final void rule__Cylinder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5304:1: ( ( Length ) )
            // InternalKinematicsParser.g:5305:1: ( Length )
            {
            // InternalKinematicsParser.g:5305:1: ( Length )
            // InternalKinematicsParser.g:5306:2: Length
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
    // InternalKinematicsParser.g:5315:1: rule__Cylinder__Group__2 : rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 ;
    public final void rule__Cylinder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5319:1: ( rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 )
            // InternalKinematicsParser.g:5320:2: rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalKinematicsParser.g:5327:1: rule__Cylinder__Group__2__Impl : ( ( rule__Cylinder__LengthAssignment_2 ) ) ;
    public final void rule__Cylinder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5331:1: ( ( ( rule__Cylinder__LengthAssignment_2 ) ) )
            // InternalKinematicsParser.g:5332:1: ( ( rule__Cylinder__LengthAssignment_2 ) )
            {
            // InternalKinematicsParser.g:5332:1: ( ( rule__Cylinder__LengthAssignment_2 ) )
            // InternalKinematicsParser.g:5333:2: ( rule__Cylinder__LengthAssignment_2 )
            {
             before(grammarAccess.getCylinderAccess().getLengthAssignment_2()); 
            // InternalKinematicsParser.g:5334:2: ( rule__Cylinder__LengthAssignment_2 )
            // InternalKinematicsParser.g:5334:3: rule__Cylinder__LengthAssignment_2
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
    // InternalKinematicsParser.g:5342:1: rule__Cylinder__Group__3 : rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 ;
    public final void rule__Cylinder__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5346:1: ( rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 )
            // InternalKinematicsParser.g:5347:2: rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalKinematicsParser.g:5354:1: rule__Cylinder__Group__3__Impl : ( Radius ) ;
    public final void rule__Cylinder__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5358:1: ( ( Radius ) )
            // InternalKinematicsParser.g:5359:1: ( Radius )
            {
            // InternalKinematicsParser.g:5359:1: ( Radius )
            // InternalKinematicsParser.g:5360:2: Radius
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
    // InternalKinematicsParser.g:5369:1: rule__Cylinder__Group__4 : rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 ;
    public final void rule__Cylinder__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5373:1: ( rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 )
            // InternalKinematicsParser.g:5374:2: rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalKinematicsParser.g:5381:1: rule__Cylinder__Group__4__Impl : ( ( rule__Cylinder__RadiusAssignment_4 ) ) ;
    public final void rule__Cylinder__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5385:1: ( ( ( rule__Cylinder__RadiusAssignment_4 ) ) )
            // InternalKinematicsParser.g:5386:1: ( ( rule__Cylinder__RadiusAssignment_4 ) )
            {
            // InternalKinematicsParser.g:5386:1: ( ( rule__Cylinder__RadiusAssignment_4 ) )
            // InternalKinematicsParser.g:5387:2: ( rule__Cylinder__RadiusAssignment_4 )
            {
             before(grammarAccess.getCylinderAccess().getRadiusAssignment_4()); 
            // InternalKinematicsParser.g:5388:2: ( rule__Cylinder__RadiusAssignment_4 )
            // InternalKinematicsParser.g:5388:3: rule__Cylinder__RadiusAssignment_4
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
    // InternalKinematicsParser.g:5396:1: rule__Cylinder__Group__5 : rule__Cylinder__Group__5__Impl ;
    public final void rule__Cylinder__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5400:1: ( rule__Cylinder__Group__5__Impl )
            // InternalKinematicsParser.g:5401:2: rule__Cylinder__Group__5__Impl
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
    // InternalKinematicsParser.g:5407:1: rule__Cylinder__Group__5__Impl : ( RULE_END ) ;
    public final void rule__Cylinder__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5411:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:5412:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:5412:1: ( RULE_END )
            // InternalKinematicsParser.g:5413:2: RULE_END
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
    // InternalKinematicsParser.g:5423:1: rule__Sphere__Group__0 : rule__Sphere__Group__0__Impl rule__Sphere__Group__1 ;
    public final void rule__Sphere__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5427:1: ( rule__Sphere__Group__0__Impl rule__Sphere__Group__1 )
            // InternalKinematicsParser.g:5428:2: rule__Sphere__Group__0__Impl rule__Sphere__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalKinematicsParser.g:5435:1: rule__Sphere__Group__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Sphere__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5439:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:5440:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:5440:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:5441:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:5450:1: rule__Sphere__Group__1 : rule__Sphere__Group__1__Impl rule__Sphere__Group__2 ;
    public final void rule__Sphere__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5454:1: ( rule__Sphere__Group__1__Impl rule__Sphere__Group__2 )
            // InternalKinematicsParser.g:5455:2: rule__Sphere__Group__1__Impl rule__Sphere__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalKinematicsParser.g:5462:1: rule__Sphere__Group__1__Impl : ( Radius ) ;
    public final void rule__Sphere__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5466:1: ( ( Radius ) )
            // InternalKinematicsParser.g:5467:1: ( Radius )
            {
            // InternalKinematicsParser.g:5467:1: ( Radius )
            // InternalKinematicsParser.g:5468:2: Radius
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
    // InternalKinematicsParser.g:5477:1: rule__Sphere__Group__2 : rule__Sphere__Group__2__Impl rule__Sphere__Group__3 ;
    public final void rule__Sphere__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5481:1: ( rule__Sphere__Group__2__Impl rule__Sphere__Group__3 )
            // InternalKinematicsParser.g:5482:2: rule__Sphere__Group__2__Impl rule__Sphere__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalKinematicsParser.g:5489:1: rule__Sphere__Group__2__Impl : ( ( rule__Sphere__RadiusAssignment_2 ) ) ;
    public final void rule__Sphere__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5493:1: ( ( ( rule__Sphere__RadiusAssignment_2 ) ) )
            // InternalKinematicsParser.g:5494:1: ( ( rule__Sphere__RadiusAssignment_2 ) )
            {
            // InternalKinematicsParser.g:5494:1: ( ( rule__Sphere__RadiusAssignment_2 ) )
            // InternalKinematicsParser.g:5495:2: ( rule__Sphere__RadiusAssignment_2 )
            {
             before(grammarAccess.getSphereAccess().getRadiusAssignment_2()); 
            // InternalKinematicsParser.g:5496:2: ( rule__Sphere__RadiusAssignment_2 )
            // InternalKinematicsParser.g:5496:3: rule__Sphere__RadiusAssignment_2
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
    // InternalKinematicsParser.g:5504:1: rule__Sphere__Group__3 : rule__Sphere__Group__3__Impl ;
    public final void rule__Sphere__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5508:1: ( rule__Sphere__Group__3__Impl )
            // InternalKinematicsParser.g:5509:2: rule__Sphere__Group__3__Impl
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
    // InternalKinematicsParser.g:5515:1: rule__Sphere__Group__3__Impl : ( RULE_END ) ;
    public final void rule__Sphere__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5519:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:5520:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:5520:1: ( RULE_END )
            // InternalKinematicsParser.g:5521:2: RULE_END
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
    // InternalKinematicsParser.g:5531:1: rule__Mesh__Group__0 : rule__Mesh__Group__0__Impl rule__Mesh__Group__1 ;
    public final void rule__Mesh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5535:1: ( rule__Mesh__Group__0__Impl rule__Mesh__Group__1 )
            // InternalKinematicsParser.g:5536:2: rule__Mesh__Group__0__Impl rule__Mesh__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalKinematicsParser.g:5543:1: rule__Mesh__Group__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Mesh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5547:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:5548:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:5548:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:5549:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:5558:1: rule__Mesh__Group__1 : rule__Mesh__Group__1__Impl rule__Mesh__Group__2 ;
    public final void rule__Mesh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5562:1: ( rule__Mesh__Group__1__Impl rule__Mesh__Group__2 )
            // InternalKinematicsParser.g:5563:2: rule__Mesh__Group__1__Impl rule__Mesh__Group__2
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
    // InternalKinematicsParser.g:5570:1: rule__Mesh__Group__1__Impl : ( Filename ) ;
    public final void rule__Mesh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5574:1: ( ( Filename ) )
            // InternalKinematicsParser.g:5575:1: ( Filename )
            {
            // InternalKinematicsParser.g:5575:1: ( Filename )
            // InternalKinematicsParser.g:5576:2: Filename
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
    // InternalKinematicsParser.g:5585:1: rule__Mesh__Group__2 : rule__Mesh__Group__2__Impl rule__Mesh__Group__3 ;
    public final void rule__Mesh__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5589:1: ( rule__Mesh__Group__2__Impl rule__Mesh__Group__3 )
            // InternalKinematicsParser.g:5590:2: rule__Mesh__Group__2__Impl rule__Mesh__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalKinematicsParser.g:5597:1: rule__Mesh__Group__2__Impl : ( ( rule__Mesh__FilenameAssignment_2 ) ) ;
    public final void rule__Mesh__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5601:1: ( ( ( rule__Mesh__FilenameAssignment_2 ) ) )
            // InternalKinematicsParser.g:5602:1: ( ( rule__Mesh__FilenameAssignment_2 ) )
            {
            // InternalKinematicsParser.g:5602:1: ( ( rule__Mesh__FilenameAssignment_2 ) )
            // InternalKinematicsParser.g:5603:2: ( rule__Mesh__FilenameAssignment_2 )
            {
             before(grammarAccess.getMeshAccess().getFilenameAssignment_2()); 
            // InternalKinematicsParser.g:5604:2: ( rule__Mesh__FilenameAssignment_2 )
            // InternalKinematicsParser.g:5604:3: rule__Mesh__FilenameAssignment_2
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
    // InternalKinematicsParser.g:5612:1: rule__Mesh__Group__3 : rule__Mesh__Group__3__Impl rule__Mesh__Group__4 ;
    public final void rule__Mesh__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5616:1: ( rule__Mesh__Group__3__Impl rule__Mesh__Group__4 )
            // InternalKinematicsParser.g:5617:2: rule__Mesh__Group__3__Impl rule__Mesh__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalKinematicsParser.g:5624:1: rule__Mesh__Group__3__Impl : ( ( rule__Mesh__Group_3__0 )? ) ;
    public final void rule__Mesh__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5628:1: ( ( ( rule__Mesh__Group_3__0 )? ) )
            // InternalKinematicsParser.g:5629:1: ( ( rule__Mesh__Group_3__0 )? )
            {
            // InternalKinematicsParser.g:5629:1: ( ( rule__Mesh__Group_3__0 )? )
            // InternalKinematicsParser.g:5630:2: ( rule__Mesh__Group_3__0 )?
            {
             before(grammarAccess.getMeshAccess().getGroup_3()); 
            // InternalKinematicsParser.g:5631:2: ( rule__Mesh__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==Scale) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalKinematicsParser.g:5631:3: rule__Mesh__Group_3__0
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
    // InternalKinematicsParser.g:5639:1: rule__Mesh__Group__4 : rule__Mesh__Group__4__Impl ;
    public final void rule__Mesh__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5643:1: ( rule__Mesh__Group__4__Impl )
            // InternalKinematicsParser.g:5644:2: rule__Mesh__Group__4__Impl
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
    // InternalKinematicsParser.g:5650:1: rule__Mesh__Group__4__Impl : ( RULE_END ) ;
    public final void rule__Mesh__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5654:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:5655:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:5655:1: ( RULE_END )
            // InternalKinematicsParser.g:5656:2: RULE_END
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
    // InternalKinematicsParser.g:5666:1: rule__Mesh__Group_3__0 : rule__Mesh__Group_3__0__Impl rule__Mesh__Group_3__1 ;
    public final void rule__Mesh__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5670:1: ( rule__Mesh__Group_3__0__Impl rule__Mesh__Group_3__1 )
            // InternalKinematicsParser.g:5671:2: rule__Mesh__Group_3__0__Impl rule__Mesh__Group_3__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalKinematicsParser.g:5678:1: rule__Mesh__Group_3__0__Impl : ( Scale ) ;
    public final void rule__Mesh__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5682:1: ( ( Scale ) )
            // InternalKinematicsParser.g:5683:1: ( Scale )
            {
            // InternalKinematicsParser.g:5683:1: ( Scale )
            // InternalKinematicsParser.g:5684:2: Scale
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
    // InternalKinematicsParser.g:5693:1: rule__Mesh__Group_3__1 : rule__Mesh__Group_3__1__Impl ;
    public final void rule__Mesh__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5697:1: ( rule__Mesh__Group_3__1__Impl )
            // InternalKinematicsParser.g:5698:2: rule__Mesh__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__Group_3__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalKinematicsParser.g:5704:1: rule__Mesh__Group_3__1__Impl : ( ( rule__Mesh__ScaleAssignment_3_1 ) ) ;
    public final void rule__Mesh__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5708:1: ( ( ( rule__Mesh__ScaleAssignment_3_1 ) ) )
            // InternalKinematicsParser.g:5709:1: ( ( rule__Mesh__ScaleAssignment_3_1 ) )
            {
            // InternalKinematicsParser.g:5709:1: ( ( rule__Mesh__ScaleAssignment_3_1 ) )
            // InternalKinematicsParser.g:5710:2: ( rule__Mesh__ScaleAssignment_3_1 )
            {
             before(grammarAccess.getMeshAccess().getScaleAssignment_3_1()); 
            // InternalKinematicsParser.g:5711:2: ( rule__Mesh__ScaleAssignment_3_1 )
            // InternalKinematicsParser.g:5711:3: rule__Mesh__ScaleAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__ScaleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMeshAccess().getScaleAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Robot__NameAssignment_4"
    // InternalKinematicsParser.g:5720:1: rule__Robot__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__Robot__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5724:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:5725:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:5725:2: ( ruleEString )
            // InternalKinematicsParser.g:5726:3: ruleEString
            {
             before(grammarAccess.getRobotAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__NameAssignment_4"


    // $ANTLR start "rule__Robot__MacrosAssignment_5_1"
    // InternalKinematicsParser.g:5735:1: rule__Robot__MacrosAssignment_5_1 : ( ruleMacro ) ;
    public final void rule__Robot__MacrosAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5739:1: ( ( ruleMacro ) )
            // InternalKinematicsParser.g:5740:2: ( ruleMacro )
            {
            // InternalKinematicsParser.g:5740:2: ( ruleMacro )
            // InternalKinematicsParser.g:5741:3: ruleMacro
            {
             before(grammarAccess.getRobotAccess().getMacrosMacroParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMacro();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getMacrosMacroParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__MacrosAssignment_5_1"


    // $ANTLR start "rule__Macro__NameAssignment_2"
    // InternalKinematicsParser.g:5750:1: rule__Macro__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Macro__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5754:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:5755:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:5755:2: ( ruleEString )
            // InternalKinematicsParser.g:5756:3: ruleEString
            {
             before(grammarAccess.getMacroAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMacroAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__NameAssignment_2"


    // $ANTLR start "rule__Macro__ParametersAssignment_4_1"
    // InternalKinematicsParser.g:5765:1: rule__Macro__ParametersAssignment_4_1 : ( ruleParameter ) ;
    public final void rule__Macro__ParametersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5769:1: ( ( ruleParameter ) )
            // InternalKinematicsParser.g:5770:2: ( ruleParameter )
            {
            // InternalKinematicsParser.g:5770:2: ( ruleParameter )
            // InternalKinematicsParser.g:5771:3: ruleParameter
            {
             before(grammarAccess.getMacroAccess().getParametersParameterParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMacroAccess().getParametersParameterParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__ParametersAssignment_4_1"


    // $ANTLR start "rule__Macro__LinkAssignment_5_1"
    // InternalKinematicsParser.g:5780:1: rule__Macro__LinkAssignment_5_1 : ( ruleLink ) ;
    public final void rule__Macro__LinkAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5784:1: ( ( ruleLink ) )
            // InternalKinematicsParser.g:5785:2: ( ruleLink )
            {
            // InternalKinematicsParser.g:5785:2: ( ruleLink )
            // InternalKinematicsParser.g:5786:3: ruleLink
            {
             before(grammarAccess.getMacroAccess().getLinkLinkParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getMacroAccess().getLinkLinkParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__LinkAssignment_5_1"


    // $ANTLR start "rule__Macro__JointAssignment_6_1"
    // InternalKinematicsParser.g:5795:1: rule__Macro__JointAssignment_6_1 : ( ruleJoint ) ;
    public final void rule__Macro__JointAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5799:1: ( ( ruleJoint ) )
            // InternalKinematicsParser.g:5800:2: ( ruleJoint )
            {
            // InternalKinematicsParser.g:5800:2: ( ruleJoint )
            // InternalKinematicsParser.g:5801:3: ruleJoint
            {
             before(grammarAccess.getMacroAccess().getJointJointParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getMacroAccess().getJointJointParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__JointAssignment_6_1"


    // $ANTLR start "rule__Parameter__NameAssignment_3"
    // InternalKinematicsParser.g:5810:1: rule__Parameter__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5814:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:5815:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:5815:2: ( ruleEString )
            // InternalKinematicsParser.g:5816:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_3"


    // $ANTLR start "rule__Parameter__TypeAssignment_6"
    // InternalKinematicsParser.g:5825:1: rule__Parameter__TypeAssignment_6 : ( ruleParameterType ) ;
    public final void rule__Parameter__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5829:1: ( ( ruleParameterType ) )
            // InternalKinematicsParser.g:5830:2: ( ruleParameterType )
            {
            // InternalKinematicsParser.g:5830:2: ( ruleParameterType )
            // InternalKinematicsParser.g:5831:3: ruleParameterType
            {
             before(grammarAccess.getParameterAccess().getTypeParameterTypeEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeParameterTypeEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_6"


    // $ANTLR start "rule__Parameter__DefaultAssignment_7_1"
    // InternalKinematicsParser.g:5840:1: rule__Parameter__DefaultAssignment_7_1 : ( ruleEString ) ;
    public final void rule__Parameter__DefaultAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5844:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:5845:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:5845:2: ( ruleEString )
            // InternalKinematicsParser.g:5846:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getDefaultEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getDefaultEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__DefaultAssignment_7_1"


    // $ANTLR start "rule__Parameter__ValueAssignment_8_1"
    // InternalKinematicsParser.g:5855:1: rule__Parameter__ValueAssignment_8_1 : ( ruleEString ) ;
    public final void rule__Parameter__ValueAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5859:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:5860:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:5860:2: ( ruleEString )
            // InternalKinematicsParser.g:5861:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getValueEStringParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getValueEStringParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ValueAssignment_8_1"


    // $ANTLR start "rule__Joint__NameAssignment_2"
    // InternalKinematicsParser.g:5870:1: rule__Joint__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Joint__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5874:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:5875:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:5875:2: ( ruleEString )
            // InternalKinematicsParser.g:5876:3: ruleEString
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


    // $ANTLR start "rule__Joint__TypeAssignment_5"
    // InternalKinematicsParser.g:5885:1: rule__Joint__TypeAssignment_5 : ( RULE_JOINTTYPE ) ;
    public final void rule__Joint__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5889:1: ( ( RULE_JOINTTYPE ) )
            // InternalKinematicsParser.g:5890:2: ( RULE_JOINTTYPE )
            {
            // InternalKinematicsParser.g:5890:2: ( RULE_JOINTTYPE )
            // InternalKinematicsParser.g:5891:3: RULE_JOINTTYPE
            {
             before(grammarAccess.getJointAccess().getTypeJOINTTYPETerminalRuleCall_5_0()); 
            match(input,RULE_JOINTTYPE,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getTypeJOINTTYPETerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__TypeAssignment_5"


    // $ANTLR start "rule__Joint__ParentAssignment_7"
    // InternalKinematicsParser.g:5900:1: rule__Joint__ParentAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__ParentAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5904:1: ( ( ( RULE_ID ) ) )
            // InternalKinematicsParser.g:5905:2: ( ( RULE_ID ) )
            {
            // InternalKinematicsParser.g:5905:2: ( ( RULE_ID ) )
            // InternalKinematicsParser.g:5906:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getParentLinkCrossReference_7_0()); 
            // InternalKinematicsParser.g:5907:3: ( RULE_ID )
            // InternalKinematicsParser.g:5908:4: RULE_ID
            {
             before(grammarAccess.getJointAccess().getParentLinkIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getParentLinkIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getJointAccess().getParentLinkCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__ParentAssignment_7"


    // $ANTLR start "rule__Joint__ChildAssignment_9"
    // InternalKinematicsParser.g:5919:1: rule__Joint__ChildAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__ChildAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5923:1: ( ( ( RULE_ID ) ) )
            // InternalKinematicsParser.g:5924:2: ( ( RULE_ID ) )
            {
            // InternalKinematicsParser.g:5924:2: ( ( RULE_ID ) )
            // InternalKinematicsParser.g:5925:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getChildLinkCrossReference_9_0()); 
            // InternalKinematicsParser.g:5926:3: ( RULE_ID )
            // InternalKinematicsParser.g:5927:4: RULE_ID
            {
             before(grammarAccess.getJointAccess().getChildLinkIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getChildLinkIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getJointAccess().getChildLinkCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__ChildAssignment_9"


    // $ANTLR start "rule__Joint__OriginAssignment_11"
    // InternalKinematicsParser.g:5938:1: rule__Joint__OriginAssignment_11 : ( rulePose ) ;
    public final void rule__Joint__OriginAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5942:1: ( ( rulePose ) )
            // InternalKinematicsParser.g:5943:2: ( rulePose )
            {
            // InternalKinematicsParser.g:5943:2: ( rulePose )
            // InternalKinematicsParser.g:5944:3: rulePose
            {
             before(grammarAccess.getJointAccess().getOriginPoseParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            rulePose();

            state._fsp--;

             after(grammarAccess.getJointAccess().getOriginPoseParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__OriginAssignment_11"


    // $ANTLR start "rule__Joint__AxisAssignment_12_1"
    // InternalKinematicsParser.g:5953:1: rule__Joint__AxisAssignment_12_1 : ( ruleVector3 ) ;
    public final void rule__Joint__AxisAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5957:1: ( ( ruleVector3 ) )
            // InternalKinematicsParser.g:5958:2: ( ruleVector3 )
            {
            // InternalKinematicsParser.g:5958:2: ( ruleVector3 )
            // InternalKinematicsParser.g:5959:3: ruleVector3
            {
             before(grammarAccess.getJointAccess().getAxisVector3ParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVector3();

            state._fsp--;

             after(grammarAccess.getJointAccess().getAxisVector3ParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__AxisAssignment_12_1"


    // $ANTLR start "rule__Joint__LimitAssignment_13_1"
    // InternalKinematicsParser.g:5968:1: rule__Joint__LimitAssignment_13_1 : ( ruleLimit ) ;
    public final void rule__Joint__LimitAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5972:1: ( ( ruleLimit ) )
            // InternalKinematicsParser.g:5973:2: ( ruleLimit )
            {
            // InternalKinematicsParser.g:5973:2: ( ruleLimit )
            // InternalKinematicsParser.g:5974:3: ruleLimit
            {
             before(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLimit();

            state._fsp--;

             after(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__LimitAssignment_13_1"


    // $ANTLR start "rule__Link__NameAssignment_2"
    // InternalKinematicsParser.g:5983:1: rule__Link__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Link__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5987:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:5988:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:5988:2: ( ruleEString )
            // InternalKinematicsParser.g:5989:3: ruleEString
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


    // $ANTLR start "rule__Link__InertialAssignment_3_2_1"
    // InternalKinematicsParser.g:5998:1: rule__Link__InertialAssignment_3_2_1 : ( ruleInertial ) ;
    public final void rule__Link__InertialAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6002:1: ( ( ruleInertial ) )
            // InternalKinematicsParser.g:6003:2: ( ruleInertial )
            {
            // InternalKinematicsParser.g:6003:2: ( ruleInertial )
            // InternalKinematicsParser.g:6004:3: ruleInertial
            {
             before(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInertial();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__InertialAssignment_3_2_1"


    // $ANTLR start "rule__Link__VisualAssignment_3_3_1"
    // InternalKinematicsParser.g:6013:1: rule__Link__VisualAssignment_3_3_1 : ( ruleVisual ) ;
    public final void rule__Link__VisualAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6017:1: ( ( ruleVisual ) )
            // InternalKinematicsParser.g:6018:2: ( ruleVisual )
            {
            // InternalKinematicsParser.g:6018:2: ( ruleVisual )
            // InternalKinematicsParser.g:6019:3: ruleVisual
            {
             before(grammarAccess.getLinkAccess().getVisualVisualParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVisual();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getVisualVisualParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__VisualAssignment_3_3_1"


    // $ANTLR start "rule__Link__CollisionAssignment_3_4_1"
    // InternalKinematicsParser.g:6028:1: rule__Link__CollisionAssignment_3_4_1 : ( ruleCollision ) ;
    public final void rule__Link__CollisionAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6032:1: ( ( ruleCollision ) )
            // InternalKinematicsParser.g:6033:2: ( ruleCollision )
            {
            // InternalKinematicsParser.g:6033:2: ( ruleCollision )
            // InternalKinematicsParser.g:6034:3: ruleCollision
            {
             before(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_3_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCollision();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_3_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__CollisionAssignment_3_4_1"


    // $ANTLR start "rule__Pose__RpyAssignment_2_1"
    // InternalKinematicsParser.g:6043:1: rule__Pose__RpyAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Pose__RpyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6047:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:6048:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:6048:2: ( ruleEString )
            // InternalKinematicsParser.g:6049:3: ruleEString
            {
             before(grammarAccess.getPoseAccess().getRpyEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPoseAccess().getRpyEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__RpyAssignment_2_1"


    // $ANTLR start "rule__Pose__XyzAssignment_3_1"
    // InternalKinematicsParser.g:6058:1: rule__Pose__XyzAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Pose__XyzAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6062:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:6063:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:6063:2: ( ruleEString )
            // InternalKinematicsParser.g:6064:3: ruleEString
            {
             before(grammarAccess.getPoseAccess().getXyzEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPoseAccess().getXyzEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__XyzAssignment_3_1"


    // $ANTLR start "rule__Vector3__XyzAssignment_2_1"
    // InternalKinematicsParser.g:6073:1: rule__Vector3__XyzAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Vector3__XyzAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6077:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:6078:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:6078:2: ( ruleEString )
            // InternalKinematicsParser.g:6079:3: ruleEString
            {
             before(grammarAccess.getVector3Access().getXyzEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVector3Access().getXyzEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector3__XyzAssignment_2_1"


    // $ANTLR start "rule__Limit__EffortAssignment_2_1"
    // InternalKinematicsParser.g:6088:1: rule__Limit__EffortAssignment_2_1 : ( ruleDouble0 ) ;
    public final void rule__Limit__EffortAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6092:1: ( ( ruleDouble0 ) )
            // InternalKinematicsParser.g:6093:2: ( ruleDouble0 )
            {
            // InternalKinematicsParser.g:6093:2: ( ruleDouble0 )
            // InternalKinematicsParser.g:6094:3: ruleDouble0
            {
             before(grammarAccess.getLimitAccess().getEffortDouble0ParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getEffortDouble0ParserRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:6103:1: rule__Limit__LowerAssignment_3_1 : ( ruleDouble0 ) ;
    public final void rule__Limit__LowerAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6107:1: ( ( ruleDouble0 ) )
            // InternalKinematicsParser.g:6108:2: ( ruleDouble0 )
            {
            // InternalKinematicsParser.g:6108:2: ( ruleDouble0 )
            // InternalKinematicsParser.g:6109:3: ruleDouble0
            {
             before(grammarAccess.getLimitAccess().getLowerDouble0ParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getLowerDouble0ParserRuleCall_3_1_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:6118:1: rule__Limit__UpperAssignment_4_1 : ( ruleDouble0 ) ;
    public final void rule__Limit__UpperAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6122:1: ( ( ruleDouble0 ) )
            // InternalKinematicsParser.g:6123:2: ( ruleDouble0 )
            {
            // InternalKinematicsParser.g:6123:2: ( ruleDouble0 )
            // InternalKinematicsParser.g:6124:3: ruleDouble0
            {
             before(grammarAccess.getLimitAccess().getUpperDouble0ParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getUpperDouble0ParserRuleCall_4_1_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:6133:1: rule__Limit__VelocityAssignment_5_1 : ( ruleDouble0 ) ;
    public final void rule__Limit__VelocityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6137:1: ( ( ruleDouble0 ) )
            // InternalKinematicsParser.g:6138:2: ( ruleDouble0 )
            {
            // InternalKinematicsParser.g:6138:2: ( ruleDouble0 )
            // InternalKinematicsParser.g:6139:3: ruleDouble0
            {
             before(grammarAccess.getLimitAccess().getVelocityDouble0ParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getVelocityDouble0ParserRuleCall_5_1_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:6148:1: rule__Inertial__OriginAssignment_2_1 : ( rulePose ) ;
    public final void rule__Inertial__OriginAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6152:1: ( ( rulePose ) )
            // InternalKinematicsParser.g:6153:2: ( rulePose )
            {
            // InternalKinematicsParser.g:6153:2: ( rulePose )
            // InternalKinematicsParser.g:6154:3: rulePose
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
    // InternalKinematicsParser.g:6163:1: rule__Inertial__MassAssignment_3_1 : ( ruleMass ) ;
    public final void rule__Inertial__MassAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6167:1: ( ( ruleMass ) )
            // InternalKinematicsParser.g:6168:2: ( ruleMass )
            {
            // InternalKinematicsParser.g:6168:2: ( ruleMass )
            // InternalKinematicsParser.g:6169:3: ruleMass
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
    // InternalKinematicsParser.g:6178:1: rule__Inertial__InertiaAssignment_4_1 : ( ruleInertia ) ;
    public final void rule__Inertial__InertiaAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6182:1: ( ( ruleInertia ) )
            // InternalKinematicsParser.g:6183:2: ( ruleInertia )
            {
            // InternalKinematicsParser.g:6183:2: ( ruleInertia )
            // InternalKinematicsParser.g:6184:3: ruleInertia
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
    // InternalKinematicsParser.g:6193:1: rule__Visual__OriginAssignment_1_1 : ( rulePose ) ;
    public final void rule__Visual__OriginAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6197:1: ( ( rulePose ) )
            // InternalKinematicsParser.g:6198:2: ( rulePose )
            {
            // InternalKinematicsParser.g:6198:2: ( rulePose )
            // InternalKinematicsParser.g:6199:3: rulePose
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
    // InternalKinematicsParser.g:6208:1: rule__Visual__GeometryAssignment_3 : ( ruleGeometry ) ;
    public final void rule__Visual__GeometryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6212:1: ( ( ruleGeometry ) )
            // InternalKinematicsParser.g:6213:2: ( ruleGeometry )
            {
            // InternalKinematicsParser.g:6213:2: ( ruleGeometry )
            // InternalKinematicsParser.g:6214:3: ruleGeometry
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
    // InternalKinematicsParser.g:6223:1: rule__Collision__OriginAssignment_1_1 : ( rulePose ) ;
    public final void rule__Collision__OriginAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6227:1: ( ( rulePose ) )
            // InternalKinematicsParser.g:6228:2: ( rulePose )
            {
            // InternalKinematicsParser.g:6228:2: ( rulePose )
            // InternalKinematicsParser.g:6229:3: rulePose
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
    // InternalKinematicsParser.g:6238:1: rule__Collision__GeometryAssignment_3 : ( ruleGeometry ) ;
    public final void rule__Collision__GeometryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6242:1: ( ( ruleGeometry ) )
            // InternalKinematicsParser.g:6243:2: ( ruleGeometry )
            {
            // InternalKinematicsParser.g:6243:2: ( ruleGeometry )
            // InternalKinematicsParser.g:6244:3: ruleGeometry
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


    // $ANTLR start "rule__Mass__ValueAssignment_1"
    // InternalKinematicsParser.g:6253:1: rule__Mass__ValueAssignment_1 : ( ruleDouble0 ) ;
    public final void rule__Mass__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6257:1: ( ( ruleDouble0 ) )
            // InternalKinematicsParser.g:6258:2: ( ruleDouble0 )
            {
            // InternalKinematicsParser.g:6258:2: ( ruleDouble0 )
            // InternalKinematicsParser.g:6259:3: ruleDouble0
            {
             before(grammarAccess.getMassAccess().getValueDouble0ParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getMassAccess().getValueDouble0ParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__ValueAssignment_1"


    // $ANTLR start "rule__Inertia__IxxAssignment_2_1"
    // InternalKinematicsParser.g:6268:1: rule__Inertia__IxxAssignment_2_1 : ( ruleDouble0 ) ;
    public final void rule__Inertia__IxxAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6272:1: ( ( ruleDouble0 ) )
            // InternalKinematicsParser.g:6273:2: ( ruleDouble0 )
            {
            // InternalKinematicsParser.g:6273:2: ( ruleDouble0 )
            // InternalKinematicsParser.g:6274:3: ruleDouble0
            {
             before(grammarAccess.getInertiaAccess().getIxxDouble0ParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIxxDouble0ParserRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:6283:1: rule__Inertia__IxyAssignment_3_1 : ( ruleDouble0 ) ;
    public final void rule__Inertia__IxyAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6287:1: ( ( ruleDouble0 ) )
            // InternalKinematicsParser.g:6288:2: ( ruleDouble0 )
            {
            // InternalKinematicsParser.g:6288:2: ( ruleDouble0 )
            // InternalKinematicsParser.g:6289:3: ruleDouble0
            {
             before(grammarAccess.getInertiaAccess().getIxyDouble0ParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIxyDouble0ParserRuleCall_3_1_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:6298:1: rule__Inertia__IxzAssignment_4_1 : ( ruleDouble0 ) ;
    public final void rule__Inertia__IxzAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6302:1: ( ( ruleDouble0 ) )
            // InternalKinematicsParser.g:6303:2: ( ruleDouble0 )
            {
            // InternalKinematicsParser.g:6303:2: ( ruleDouble0 )
            // InternalKinematicsParser.g:6304:3: ruleDouble0
            {
             before(grammarAccess.getInertiaAccess().getIxzDouble0ParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIxzDouble0ParserRuleCall_4_1_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:6313:1: rule__Inertia__IyyAssignment_5_1 : ( ruleDouble0 ) ;
    public final void rule__Inertia__IyyAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6317:1: ( ( ruleDouble0 ) )
            // InternalKinematicsParser.g:6318:2: ( ruleDouble0 )
            {
            // InternalKinematicsParser.g:6318:2: ( ruleDouble0 )
            // InternalKinematicsParser.g:6319:3: ruleDouble0
            {
             before(grammarAccess.getInertiaAccess().getIyyDouble0ParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIyyDouble0ParserRuleCall_5_1_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:6328:1: rule__Inertia__IyzAssignment_6_1 : ( ruleDouble0 ) ;
    public final void rule__Inertia__IyzAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6332:1: ( ( ruleDouble0 ) )
            // InternalKinematicsParser.g:6333:2: ( ruleDouble0 )
            {
            // InternalKinematicsParser.g:6333:2: ( ruleDouble0 )
            // InternalKinematicsParser.g:6334:3: ruleDouble0
            {
             before(grammarAccess.getInertiaAccess().getIyzDouble0ParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIyzDouble0ParserRuleCall_6_1_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:6343:1: rule__Inertia__IzzAssignment_7_1 : ( ruleDouble0 ) ;
    public final void rule__Inertia__IzzAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6347:1: ( ( ruleDouble0 ) )
            // InternalKinematicsParser.g:6348:2: ( ruleDouble0 )
            {
            // InternalKinematicsParser.g:6348:2: ( ruleDouble0 )
            // InternalKinematicsParser.g:6349:3: ruleDouble0
            {
             before(grammarAccess.getInertiaAccess().getIzzDouble0ParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIzzDouble0ParserRuleCall_7_1_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:6358:1: rule__Geometry__BoxAssignment_2_1 : ( ruleBox ) ;
    public final void rule__Geometry__BoxAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6362:1: ( ( ruleBox ) )
            // InternalKinematicsParser.g:6363:2: ( ruleBox )
            {
            // InternalKinematicsParser.g:6363:2: ( ruleBox )
            // InternalKinematicsParser.g:6364:3: ruleBox
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
    // InternalKinematicsParser.g:6373:1: rule__Geometry__CylinderAssignment_3_1 : ( ruleCylinder ) ;
    public final void rule__Geometry__CylinderAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6377:1: ( ( ruleCylinder ) )
            // InternalKinematicsParser.g:6378:2: ( ruleCylinder )
            {
            // InternalKinematicsParser.g:6378:2: ( ruleCylinder )
            // InternalKinematicsParser.g:6379:3: ruleCylinder
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
    // InternalKinematicsParser.g:6388:1: rule__Geometry__SphereAssignment_4_1 : ( ruleSphere ) ;
    public final void rule__Geometry__SphereAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6392:1: ( ( ruleSphere ) )
            // InternalKinematicsParser.g:6393:2: ( ruleSphere )
            {
            // InternalKinematicsParser.g:6393:2: ( ruleSphere )
            // InternalKinematicsParser.g:6394:3: ruleSphere
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
    // InternalKinematicsParser.g:6403:1: rule__Geometry__MeshAssignment_5_1 : ( ruleMesh ) ;
    public final void rule__Geometry__MeshAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6407:1: ( ( ruleMesh ) )
            // InternalKinematicsParser.g:6408:2: ( ruleMesh )
            {
            // InternalKinematicsParser.g:6408:2: ( ruleMesh )
            // InternalKinematicsParser.g:6409:3: ruleMesh
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
    // InternalKinematicsParser.g:6418:1: rule__Box__SizeAssignment_3 : ( ruleEString ) ;
    public final void rule__Box__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6422:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:6423:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:6423:2: ( ruleEString )
            // InternalKinematicsParser.g:6424:3: ruleEString
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
    // InternalKinematicsParser.g:6433:1: rule__Cylinder__LengthAssignment_2 : ( ruleDouble0 ) ;
    public final void rule__Cylinder__LengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6437:1: ( ( ruleDouble0 ) )
            // InternalKinematicsParser.g:6438:2: ( ruleDouble0 )
            {
            // InternalKinematicsParser.g:6438:2: ( ruleDouble0 )
            // InternalKinematicsParser.g:6439:3: ruleDouble0
            {
             before(grammarAccess.getCylinderAccess().getLengthDouble0ParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getCylinderAccess().getLengthDouble0ParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:6448:1: rule__Cylinder__RadiusAssignment_4 : ( ruleDouble0 ) ;
    public final void rule__Cylinder__RadiusAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6452:1: ( ( ruleDouble0 ) )
            // InternalKinematicsParser.g:6453:2: ( ruleDouble0 )
            {
            // InternalKinematicsParser.g:6453:2: ( ruleDouble0 )
            // InternalKinematicsParser.g:6454:3: ruleDouble0
            {
             before(grammarAccess.getCylinderAccess().getRadiusDouble0ParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getCylinderAccess().getRadiusDouble0ParserRuleCall_4_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:6463:1: rule__Sphere__RadiusAssignment_2 : ( ruleDouble0 ) ;
    public final void rule__Sphere__RadiusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6467:1: ( ( ruleDouble0 ) )
            // InternalKinematicsParser.g:6468:2: ( ruleDouble0 )
            {
            // InternalKinematicsParser.g:6468:2: ( ruleDouble0 )
            // InternalKinematicsParser.g:6469:3: ruleDouble0
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
    // InternalKinematicsParser.g:6478:1: rule__Mesh__FilenameAssignment_2 : ( ruleEString ) ;
    public final void rule__Mesh__FilenameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6482:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:6483:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:6483:2: ( ruleEString )
            // InternalKinematicsParser.g:6484:3: ruleEString
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


    // $ANTLR start "rule__Mesh__ScaleAssignment_3_1"
    // InternalKinematicsParser.g:6493:1: rule__Mesh__ScaleAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Mesh__ScaleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6497:1: ( ( ruleEString ) )
            // InternalKinematicsParser.g:6498:2: ( ruleEString )
            {
            // InternalKinematicsParser.g:6498:2: ( ruleEString )
            // InternalKinematicsParser.g:6499:3: ruleEString
            {
             before(grammarAccess.getMeshAccess().getScaleEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMeshAccess().getScaleEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__ScaleAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0200000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0200000041000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0200000800002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0200000022000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0200000000200440L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0200280000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0200200000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0200000014004800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0200000080021000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000020200L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x020007E000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0200001100100080L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0200000008000000L});

}