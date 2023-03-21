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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("HyphenMinus", "'-'");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("Pose", "'Pose'");
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
    		tokenNameToValue.put("Body", "'body:'");
    		tokenNameToValue.put("Mass", "'mass:'");
    		tokenNameToValue.put("Mesh", "'mesh:'");
    		tokenNameToValue.put("Name", "'name:'");
    		tokenNameToValue.put("Type", "'type:'");
    		tokenNameToValue.put("Value", "'value'");
    		tokenNameToValue.put("AnyURI", "'AnyURI'");
    		tokenNameToValue.put("String", "'String'");
    		tokenNameToValue.put("Child", "'child:'");
    		tokenNameToValue.put("Limit", "'limit:'");
    		tokenNameToValue.put("Links", "'links:'");
    		tokenNameToValue.put("Lower", "'lower:'");
    		tokenNameToValue.put("Robot", "'robot:'");
    		tokenNameToValue.put("Scale", "'scale:'");
    		tokenNameToValue.put("Upper", "'upper:'");
    		tokenNameToValue.put("LinkRef", "'LinkRef'");
    		tokenNameToValue.put("Default", "'default'");
    		tokenNameToValue.put("Effort", "'effort:'");
    		tokenNameToValue.put("Joints", "'joints:'");
    		tokenNameToValue.put("Length", "'length:'");
    		tokenNameToValue.put("Macros", "'macros:'");
    		tokenNameToValue.put("Origin", "'origin:'");
    		tokenNameToValue.put("Parent", "'parent:'");
    		tokenNameToValue.put("Radius", "'radius:'");
    		tokenNameToValue.put("Sphere", "'sphere:'");
    		tokenNameToValue.put("Visual", "'visual:'");
    		tokenNameToValue.put("Inertia", "'inertia:'");
    		tokenNameToValue.put("Version", "'version:'");
    		tokenNameToValue.put("Cylinder", "'cylinder:'");
    		tokenNameToValue.put("Filename", "'filename:'");
    		tokenNameToValue.put("Geometry", "'geometry:'");
    		tokenNameToValue.put("Inertial", "'inertial:'");
    		tokenNameToValue.put("Velocity", "'velocity:'");
    		tokenNameToValue.put("Collision", "'collision:'");
    		tokenNameToValue.put("MacroCalls", "'macroCalls:'");
    		tokenNameToValue.put("Parameters", "'parameters:'");
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
    // InternalKinematicsParser.g:105:1: entryRuleRobot : ruleRobot EOF ;
    public final void entryRuleRobot() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:106:1: ( ruleRobot EOF )
            // InternalKinematicsParser.g:107:1: ruleRobot EOF
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
    // InternalKinematicsParser.g:114:1: ruleRobot : ( ( rule__Robot__Group__0 ) ) ;
    public final void ruleRobot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:118:2: ( ( ( rule__Robot__Group__0 ) ) )
            // InternalKinematicsParser.g:119:2: ( ( rule__Robot__Group__0 ) )
            {
            // InternalKinematicsParser.g:119:2: ( ( rule__Robot__Group__0 ) )
            // InternalKinematicsParser.g:120:3: ( rule__Robot__Group__0 )
            {
             before(grammarAccess.getRobotAccess().getGroup()); 
            // InternalKinematicsParser.g:121:3: ( rule__Robot__Group__0 )
            // InternalKinematicsParser.g:121:4: rule__Robot__Group__0
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
    // InternalKinematicsParser.g:130:1: entryRuleMacro : ruleMacro EOF ;
    public final void entryRuleMacro() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:131:1: ( ruleMacro EOF )
            // InternalKinematicsParser.g:132:1: ruleMacro EOF
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
    // InternalKinematicsParser.g:139:1: ruleMacro : ( ( rule__Macro__Group__0 ) ) ;
    public final void ruleMacro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:143:2: ( ( ( rule__Macro__Group__0 ) ) )
            // InternalKinematicsParser.g:144:2: ( ( rule__Macro__Group__0 ) )
            {
            // InternalKinematicsParser.g:144:2: ( ( rule__Macro__Group__0 ) )
            // InternalKinematicsParser.g:145:3: ( rule__Macro__Group__0 )
            {
             before(grammarAccess.getMacroAccess().getGroup()); 
            // InternalKinematicsParser.g:146:3: ( rule__Macro__Group__0 )
            // InternalKinematicsParser.g:146:4: rule__Macro__Group__0
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
    // InternalKinematicsParser.g:155:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:156:1: ( ruleParameter EOF )
            // InternalKinematicsParser.g:157:1: ruleParameter EOF
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
    // InternalKinematicsParser.g:164:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:168:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalKinematicsParser.g:169:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalKinematicsParser.g:169:2: ( ( rule__Parameter__Group__0 ) )
            // InternalKinematicsParser.g:170:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalKinematicsParser.g:171:3: ( rule__Parameter__Group__0 )
            // InternalKinematicsParser.g:171:4: rule__Parameter__Group__0
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


    // $ANTLR start "entryRuleParameterValue"
    // InternalKinematicsParser.g:180:1: entryRuleParameterValue : ruleParameterValue EOF ;
    public final void entryRuleParameterValue() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:181:1: ( ruleParameterValue EOF )
            // InternalKinematicsParser.g:182:1: ruleParameterValue EOF
            {
             before(grammarAccess.getParameterValueRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterValueRule()); 
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
    // $ANTLR end "entryRuleParameterValue"


    // $ANTLR start "ruleParameterValue"
    // InternalKinematicsParser.g:189:1: ruleParameterValue : ( ( rule__ParameterValue__Alternatives ) ) ;
    public final void ruleParameterValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:193:2: ( ( ( rule__ParameterValue__Alternatives ) ) )
            // InternalKinematicsParser.g:194:2: ( ( rule__ParameterValue__Alternatives ) )
            {
            // InternalKinematicsParser.g:194:2: ( ( rule__ParameterValue__Alternatives ) )
            // InternalKinematicsParser.g:195:3: ( rule__ParameterValue__Alternatives )
            {
             before(grammarAccess.getParameterValueAccess().getAlternatives()); 
            // InternalKinematicsParser.g:196:3: ( rule__ParameterValue__Alternatives )
            // InternalKinematicsParser.g:196:4: rule__ParameterValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterValue"


    // $ANTLR start "entryRuleLinkRef"
    // InternalKinematicsParser.g:205:1: entryRuleLinkRef : ruleLinkRef EOF ;
    public final void entryRuleLinkRef() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:206:1: ( ruleLinkRef EOF )
            // InternalKinematicsParser.g:207:1: ruleLinkRef EOF
            {
             before(grammarAccess.getLinkRefRule()); 
            pushFollow(FOLLOW_1);
            ruleLinkRef();

            state._fsp--;

             after(grammarAccess.getLinkRefRule()); 
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
    // $ANTLR end "entryRuleLinkRef"


    // $ANTLR start "ruleLinkRef"
    // InternalKinematicsParser.g:214:1: ruleLinkRef : ( ( rule__LinkRef__RefAssignment ) ) ;
    public final void ruleLinkRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:218:2: ( ( ( rule__LinkRef__RefAssignment ) ) )
            // InternalKinematicsParser.g:219:2: ( ( rule__LinkRef__RefAssignment ) )
            {
            // InternalKinematicsParser.g:219:2: ( ( rule__LinkRef__RefAssignment ) )
            // InternalKinematicsParser.g:220:3: ( rule__LinkRef__RefAssignment )
            {
             before(grammarAccess.getLinkRefAccess().getRefAssignment()); 
            // InternalKinematicsParser.g:221:3: ( rule__LinkRef__RefAssignment )
            // InternalKinematicsParser.g:221:4: rule__LinkRef__RefAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LinkRef__RefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLinkRefAccess().getRefAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinkRef"


    // $ANTLR start "entryRuleParameterString"
    // InternalKinematicsParser.g:230:1: entryRuleParameterString : ruleParameterString EOF ;
    public final void entryRuleParameterString() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:231:1: ( ruleParameterString EOF )
            // InternalKinematicsParser.g:232:1: ruleParameterString EOF
            {
             before(grammarAccess.getParameterStringRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterString();

            state._fsp--;

             after(grammarAccess.getParameterStringRule()); 
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
    // $ANTLR end "entryRuleParameterString"


    // $ANTLR start "ruleParameterString"
    // InternalKinematicsParser.g:239:1: ruleParameterString : ( ( rule__ParameterString__Group__0 ) ) ;
    public final void ruleParameterString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:243:2: ( ( ( rule__ParameterString__Group__0 ) ) )
            // InternalKinematicsParser.g:244:2: ( ( rule__ParameterString__Group__0 ) )
            {
            // InternalKinematicsParser.g:244:2: ( ( rule__ParameterString__Group__0 ) )
            // InternalKinematicsParser.g:245:3: ( rule__ParameterString__Group__0 )
            {
             before(grammarAccess.getParameterStringAccess().getGroup()); 
            // InternalKinematicsParser.g:246:3: ( rule__ParameterString__Group__0 )
            // InternalKinematicsParser.g:246:4: rule__ParameterString__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterString"


    // $ANTLR start "entryRuleParameterPose"
    // InternalKinematicsParser.g:255:1: entryRuleParameterPose : ruleParameterPose EOF ;
    public final void entryRuleParameterPose() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:256:1: ( ruleParameterPose EOF )
            // InternalKinematicsParser.g:257:1: ruleParameterPose EOF
            {
             before(grammarAccess.getParameterPoseRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterPose();

            state._fsp--;

             after(grammarAccess.getParameterPoseRule()); 
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
    // $ANTLR end "entryRuleParameterPose"


    // $ANTLR start "ruleParameterPose"
    // InternalKinematicsParser.g:264:1: ruleParameterPose : ( ( rule__ParameterPose__Alternatives ) ) ;
    public final void ruleParameterPose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:268:2: ( ( ( rule__ParameterPose__Alternatives ) ) )
            // InternalKinematicsParser.g:269:2: ( ( rule__ParameterPose__Alternatives ) )
            {
            // InternalKinematicsParser.g:269:2: ( ( rule__ParameterPose__Alternatives ) )
            // InternalKinematicsParser.g:270:3: ( rule__ParameterPose__Alternatives )
            {
             before(grammarAccess.getParameterPoseAccess().getAlternatives()); 
            // InternalKinematicsParser.g:271:3: ( rule__ParameterPose__Alternatives )
            // InternalKinematicsParser.g:271:4: rule__ParameterPose__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ParameterPose__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterPoseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterPose"


    // $ANTLR start "entryRuleParameterLink"
    // InternalKinematicsParser.g:280:1: entryRuleParameterLink : ruleParameterLink EOF ;
    public final void entryRuleParameterLink() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:281:1: ( ruleParameterLink EOF )
            // InternalKinematicsParser.g:282:1: ruleParameterLink EOF
            {
             before(grammarAccess.getParameterLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterLink();

            state._fsp--;

             after(grammarAccess.getParameterLinkRule()); 
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
    // $ANTLR end "entryRuleParameterLink"


    // $ANTLR start "ruleParameterLink"
    // InternalKinematicsParser.g:289:1: ruleParameterLink : ( ( rule__ParameterLink__Alternatives ) ) ;
    public final void ruleParameterLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:293:2: ( ( ( rule__ParameterLink__Alternatives ) ) )
            // InternalKinematicsParser.g:294:2: ( ( rule__ParameterLink__Alternatives ) )
            {
            // InternalKinematicsParser.g:294:2: ( ( rule__ParameterLink__Alternatives ) )
            // InternalKinematicsParser.g:295:3: ( rule__ParameterLink__Alternatives )
            {
             before(grammarAccess.getParameterLinkAccess().getAlternatives()); 
            // InternalKinematicsParser.g:296:3: ( rule__ParameterLink__Alternatives )
            // InternalKinematicsParser.g:296:4: rule__ParameterLink__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ParameterLink__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterLinkAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterLink"


    // $ANTLR start "entryRuleParameterType"
    // InternalKinematicsParser.g:305:1: entryRuleParameterType : ruleParameterType EOF ;
    public final void entryRuleParameterType() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:306:1: ( ruleParameterType EOF )
            // InternalKinematicsParser.g:307:1: ruleParameterType EOF
            {
             before(grammarAccess.getParameterTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterTypeRule()); 
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
    // $ANTLR end "entryRuleParameterType"


    // $ANTLR start "ruleParameterType"
    // InternalKinematicsParser.g:314:1: ruleParameterType : ( ( rule__ParameterType__Alternatives ) ) ;
    public final void ruleParameterType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:318:2: ( ( ( rule__ParameterType__Alternatives ) ) )
            // InternalKinematicsParser.g:319:2: ( ( rule__ParameterType__Alternatives ) )
            {
            // InternalKinematicsParser.g:319:2: ( ( rule__ParameterType__Alternatives ) )
            // InternalKinematicsParser.g:320:3: ( rule__ParameterType__Alternatives )
            {
             before(grammarAccess.getParameterTypeAccess().getAlternatives()); 
            // InternalKinematicsParser.g:321:3: ( rule__ParameterType__Alternatives )
            // InternalKinematicsParser.g:321:4: rule__ParameterType__Alternatives
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


    // $ANTLR start "entryRuleParameterStringType"
    // InternalKinematicsParser.g:330:1: entryRuleParameterStringType : ruleParameterStringType EOF ;
    public final void entryRuleParameterStringType() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:331:1: ( ruleParameterStringType EOF )
            // InternalKinematicsParser.g:332:1: ruleParameterStringType EOF
            {
             before(grammarAccess.getParameterStringTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterStringType();

            state._fsp--;

             after(grammarAccess.getParameterStringTypeRule()); 
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
    // $ANTLR end "entryRuleParameterStringType"


    // $ANTLR start "ruleParameterStringType"
    // InternalKinematicsParser.g:339:1: ruleParameterStringType : ( ( rule__ParameterStringType__Group__0 ) ) ;
    public final void ruleParameterStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:343:2: ( ( ( rule__ParameterStringType__Group__0 ) ) )
            // InternalKinematicsParser.g:344:2: ( ( rule__ParameterStringType__Group__0 ) )
            {
            // InternalKinematicsParser.g:344:2: ( ( rule__ParameterStringType__Group__0 ) )
            // InternalKinematicsParser.g:345:3: ( rule__ParameterStringType__Group__0 )
            {
             before(grammarAccess.getParameterStringTypeAccess().getGroup()); 
            // InternalKinematicsParser.g:346:3: ( rule__ParameterStringType__Group__0 )
            // InternalKinematicsParser.g:346:4: rule__ParameterStringType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStringType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStringTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterStringType"


    // $ANTLR start "entryRuleParameterLinkRefType"
    // InternalKinematicsParser.g:355:1: entryRuleParameterLinkRefType : ruleParameterLinkRefType EOF ;
    public final void entryRuleParameterLinkRefType() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:356:1: ( ruleParameterLinkRefType EOF )
            // InternalKinematicsParser.g:357:1: ruleParameterLinkRefType EOF
            {
             before(grammarAccess.getParameterLinkRefTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterLinkRefType();

            state._fsp--;

             after(grammarAccess.getParameterLinkRefTypeRule()); 
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
    // $ANTLR end "entryRuleParameterLinkRefType"


    // $ANTLR start "ruleParameterLinkRefType"
    // InternalKinematicsParser.g:364:1: ruleParameterLinkRefType : ( ( rule__ParameterLinkRefType__Group__0 ) ) ;
    public final void ruleParameterLinkRefType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:368:2: ( ( ( rule__ParameterLinkRefType__Group__0 ) ) )
            // InternalKinematicsParser.g:369:2: ( ( rule__ParameterLinkRefType__Group__0 ) )
            {
            // InternalKinematicsParser.g:369:2: ( ( rule__ParameterLinkRefType__Group__0 ) )
            // InternalKinematicsParser.g:370:3: ( rule__ParameterLinkRefType__Group__0 )
            {
             before(grammarAccess.getParameterLinkRefTypeAccess().getGroup()); 
            // InternalKinematicsParser.g:371:3: ( rule__ParameterLinkRefType__Group__0 )
            // InternalKinematicsParser.g:371:4: rule__ParameterLinkRefType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterLinkRefType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterLinkRefTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterLinkRefType"


    // $ANTLR start "entryRuleParameterPoseType"
    // InternalKinematicsParser.g:380:1: entryRuleParameterPoseType : ruleParameterPoseType EOF ;
    public final void entryRuleParameterPoseType() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:381:1: ( ruleParameterPoseType EOF )
            // InternalKinematicsParser.g:382:1: ruleParameterPoseType EOF
            {
             before(grammarAccess.getParameterPoseTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterPoseType();

            state._fsp--;

             after(grammarAccess.getParameterPoseTypeRule()); 
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
    // $ANTLR end "entryRuleParameterPoseType"


    // $ANTLR start "ruleParameterPoseType"
    // InternalKinematicsParser.g:389:1: ruleParameterPoseType : ( ( rule__ParameterPoseType__Group__0 ) ) ;
    public final void ruleParameterPoseType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:393:2: ( ( ( rule__ParameterPoseType__Group__0 ) ) )
            // InternalKinematicsParser.g:394:2: ( ( rule__ParameterPoseType__Group__0 ) )
            {
            // InternalKinematicsParser.g:394:2: ( ( rule__ParameterPoseType__Group__0 ) )
            // InternalKinematicsParser.g:395:3: ( rule__ParameterPoseType__Group__0 )
            {
             before(grammarAccess.getParameterPoseTypeAccess().getGroup()); 
            // InternalKinematicsParser.g:396:3: ( rule__ParameterPoseType__Group__0 )
            // InternalKinematicsParser.g:396:4: rule__ParameterPoseType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterPoseType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterPoseTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterPoseType"


    // $ANTLR start "entryRuleBody"
    // InternalKinematicsParser.g:405:1: entryRuleBody : ruleBody EOF ;
    public final void entryRuleBody() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:406:1: ( ruleBody EOF )
            // InternalKinematicsParser.g:407:1: ruleBody EOF
            {
             before(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getBodyRule()); 
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
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // InternalKinematicsParser.g:414:1: ruleBody : ( ( rule__Body__Group__0 ) ) ;
    public final void ruleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:418:2: ( ( ( rule__Body__Group__0 ) ) )
            // InternalKinematicsParser.g:419:2: ( ( rule__Body__Group__0 ) )
            {
            // InternalKinematicsParser.g:419:2: ( ( rule__Body__Group__0 ) )
            // InternalKinematicsParser.g:420:3: ( rule__Body__Group__0 )
            {
             before(grammarAccess.getBodyAccess().getGroup()); 
            // InternalKinematicsParser.g:421:3: ( rule__Body__Group__0 )
            // InternalKinematicsParser.g:421:4: rule__Body__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Body__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleMacroCall"
    // InternalKinematicsParser.g:430:1: entryRuleMacroCall : ruleMacroCall EOF ;
    public final void entryRuleMacroCall() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:431:1: ( ruleMacroCall EOF )
            // InternalKinematicsParser.g:432:1: ruleMacroCall EOF
            {
             before(grammarAccess.getMacroCallRule()); 
            pushFollow(FOLLOW_1);
            ruleMacroCall();

            state._fsp--;

             after(grammarAccess.getMacroCallRule()); 
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
    // $ANTLR end "entryRuleMacroCall"


    // $ANTLR start "ruleMacroCall"
    // InternalKinematicsParser.g:439:1: ruleMacroCall : ( ( rule__MacroCall__Group__0 ) ) ;
    public final void ruleMacroCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:443:2: ( ( ( rule__MacroCall__Group__0 ) ) )
            // InternalKinematicsParser.g:444:2: ( ( rule__MacroCall__Group__0 ) )
            {
            // InternalKinematicsParser.g:444:2: ( ( rule__MacroCall__Group__0 ) )
            // InternalKinematicsParser.g:445:3: ( rule__MacroCall__Group__0 )
            {
             before(grammarAccess.getMacroCallAccess().getGroup()); 
            // InternalKinematicsParser.g:446:3: ( rule__MacroCall__Group__0 )
            // InternalKinematicsParser.g:446:4: rule__MacroCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MacroCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMacroCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMacroCall"


    // $ANTLR start "entryRuleParameterCall"
    // InternalKinematicsParser.g:455:1: entryRuleParameterCall : ruleParameterCall EOF ;
    public final void entryRuleParameterCall() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:456:1: ( ruleParameterCall EOF )
            // InternalKinematicsParser.g:457:1: ruleParameterCall EOF
            {
             before(grammarAccess.getParameterCallRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterCall();

            state._fsp--;

             after(grammarAccess.getParameterCallRule()); 
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
    // $ANTLR end "entryRuleParameterCall"


    // $ANTLR start "ruleParameterCall"
    // InternalKinematicsParser.g:464:1: ruleParameterCall : ( ( rule__ParameterCall__Group__0 ) ) ;
    public final void ruleParameterCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:468:2: ( ( ( rule__ParameterCall__Group__0 ) ) )
            // InternalKinematicsParser.g:469:2: ( ( rule__ParameterCall__Group__0 ) )
            {
            // InternalKinematicsParser.g:469:2: ( ( rule__ParameterCall__Group__0 ) )
            // InternalKinematicsParser.g:470:3: ( rule__ParameterCall__Group__0 )
            {
             before(grammarAccess.getParameterCallAccess().getGroup()); 
            // InternalKinematicsParser.g:471:3: ( rule__ParameterCall__Group__0 )
            // InternalKinematicsParser.g:471:4: rule__ParameterCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterCall"


    // $ANTLR start "entryRuleJoint"
    // InternalKinematicsParser.g:480:1: entryRuleJoint : ruleJoint EOF ;
    public final void entryRuleJoint() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:481:1: ( ruleJoint EOF )
            // InternalKinematicsParser.g:482:1: ruleJoint EOF
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
    // InternalKinematicsParser.g:489:1: ruleJoint : ( ( rule__Joint__Group__0 ) ) ;
    public final void ruleJoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:493:2: ( ( ( rule__Joint__Group__0 ) ) )
            // InternalKinematicsParser.g:494:2: ( ( rule__Joint__Group__0 ) )
            {
            // InternalKinematicsParser.g:494:2: ( ( rule__Joint__Group__0 ) )
            // InternalKinematicsParser.g:495:3: ( rule__Joint__Group__0 )
            {
             before(grammarAccess.getJointAccess().getGroup()); 
            // InternalKinematicsParser.g:496:3: ( rule__Joint__Group__0 )
            // InternalKinematicsParser.g:496:4: rule__Joint__Group__0
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
    // InternalKinematicsParser.g:505:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:506:1: ( ruleLink EOF )
            // InternalKinematicsParser.g:507:1: ruleLink EOF
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
    // InternalKinematicsParser.g:514:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:518:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalKinematicsParser.g:519:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalKinematicsParser.g:519:2: ( ( rule__Link__Group__0 ) )
            // InternalKinematicsParser.g:520:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalKinematicsParser.g:521:3: ( rule__Link__Group__0 )
            // InternalKinematicsParser.g:521:4: rule__Link__Group__0
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
    // InternalKinematicsParser.g:530:1: entryRulePose : rulePose EOF ;
    public final void entryRulePose() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:531:1: ( rulePose EOF )
            // InternalKinematicsParser.g:532:1: rulePose EOF
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
    // InternalKinematicsParser.g:539:1: rulePose : ( ( rule__Pose__Group__0 ) ) ;
    public final void rulePose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:543:2: ( ( ( rule__Pose__Group__0 ) ) )
            // InternalKinematicsParser.g:544:2: ( ( rule__Pose__Group__0 ) )
            {
            // InternalKinematicsParser.g:544:2: ( ( rule__Pose__Group__0 ) )
            // InternalKinematicsParser.g:545:3: ( rule__Pose__Group__0 )
            {
             before(grammarAccess.getPoseAccess().getGroup()); 
            // InternalKinematicsParser.g:546:3: ( rule__Pose__Group__0 )
            // InternalKinematicsParser.g:546:4: rule__Pose__Group__0
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
    // InternalKinematicsParser.g:555:1: entryRuleVector3 : ruleVector3 EOF ;
    public final void entryRuleVector3() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:556:1: ( ruleVector3 EOF )
            // InternalKinematicsParser.g:557:1: ruleVector3 EOF
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
    // InternalKinematicsParser.g:564:1: ruleVector3 : ( ( rule__Vector3__Group__0 ) ) ;
    public final void ruleVector3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:568:2: ( ( ( rule__Vector3__Group__0 ) ) )
            // InternalKinematicsParser.g:569:2: ( ( rule__Vector3__Group__0 ) )
            {
            // InternalKinematicsParser.g:569:2: ( ( rule__Vector3__Group__0 ) )
            // InternalKinematicsParser.g:570:3: ( rule__Vector3__Group__0 )
            {
             before(grammarAccess.getVector3Access().getGroup()); 
            // InternalKinematicsParser.g:571:3: ( rule__Vector3__Group__0 )
            // InternalKinematicsParser.g:571:4: rule__Vector3__Group__0
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
    // InternalKinematicsParser.g:580:1: entryRuleLimit : ruleLimit EOF ;
    public final void entryRuleLimit() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:581:1: ( ruleLimit EOF )
            // InternalKinematicsParser.g:582:1: ruleLimit EOF
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
    // InternalKinematicsParser.g:589:1: ruleLimit : ( ( rule__Limit__Group__0 ) ) ;
    public final void ruleLimit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:593:2: ( ( ( rule__Limit__Group__0 ) ) )
            // InternalKinematicsParser.g:594:2: ( ( rule__Limit__Group__0 ) )
            {
            // InternalKinematicsParser.g:594:2: ( ( rule__Limit__Group__0 ) )
            // InternalKinematicsParser.g:595:3: ( rule__Limit__Group__0 )
            {
             before(grammarAccess.getLimitAccess().getGroup()); 
            // InternalKinematicsParser.g:596:3: ( rule__Limit__Group__0 )
            // InternalKinematicsParser.g:596:4: rule__Limit__Group__0
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
    // InternalKinematicsParser.g:605:1: entryRuleInertial : ruleInertial EOF ;
    public final void entryRuleInertial() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:606:1: ( ruleInertial EOF )
            // InternalKinematicsParser.g:607:1: ruleInertial EOF
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
    // InternalKinematicsParser.g:614:1: ruleInertial : ( ( rule__Inertial__Group__0 ) ) ;
    public final void ruleInertial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:618:2: ( ( ( rule__Inertial__Group__0 ) ) )
            // InternalKinematicsParser.g:619:2: ( ( rule__Inertial__Group__0 ) )
            {
            // InternalKinematicsParser.g:619:2: ( ( rule__Inertial__Group__0 ) )
            // InternalKinematicsParser.g:620:3: ( rule__Inertial__Group__0 )
            {
             before(grammarAccess.getInertialAccess().getGroup()); 
            // InternalKinematicsParser.g:621:3: ( rule__Inertial__Group__0 )
            // InternalKinematicsParser.g:621:4: rule__Inertial__Group__0
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
    // InternalKinematicsParser.g:630:1: entryRuleVisual : ruleVisual EOF ;
    public final void entryRuleVisual() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:631:1: ( ruleVisual EOF )
            // InternalKinematicsParser.g:632:1: ruleVisual EOF
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
    // InternalKinematicsParser.g:639:1: ruleVisual : ( ( rule__Visual__Group__0 ) ) ;
    public final void ruleVisual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:643:2: ( ( ( rule__Visual__Group__0 ) ) )
            // InternalKinematicsParser.g:644:2: ( ( rule__Visual__Group__0 ) )
            {
            // InternalKinematicsParser.g:644:2: ( ( rule__Visual__Group__0 ) )
            // InternalKinematicsParser.g:645:3: ( rule__Visual__Group__0 )
            {
             before(grammarAccess.getVisualAccess().getGroup()); 
            // InternalKinematicsParser.g:646:3: ( rule__Visual__Group__0 )
            // InternalKinematicsParser.g:646:4: rule__Visual__Group__0
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
    // InternalKinematicsParser.g:655:1: entryRuleCollision : ruleCollision EOF ;
    public final void entryRuleCollision() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:656:1: ( ruleCollision EOF )
            // InternalKinematicsParser.g:657:1: ruleCollision EOF
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
    // InternalKinematicsParser.g:664:1: ruleCollision : ( ( rule__Collision__Group__0 ) ) ;
    public final void ruleCollision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:668:2: ( ( ( rule__Collision__Group__0 ) ) )
            // InternalKinematicsParser.g:669:2: ( ( rule__Collision__Group__0 ) )
            {
            // InternalKinematicsParser.g:669:2: ( ( rule__Collision__Group__0 ) )
            // InternalKinematicsParser.g:670:3: ( rule__Collision__Group__0 )
            {
             before(grammarAccess.getCollisionAccess().getGroup()); 
            // InternalKinematicsParser.g:671:3: ( rule__Collision__Group__0 )
            // InternalKinematicsParser.g:671:4: rule__Collision__Group__0
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
    // InternalKinematicsParser.g:680:1: entryRuleMass : ruleMass EOF ;
    public final void entryRuleMass() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:681:1: ( ruleMass EOF )
            // InternalKinematicsParser.g:682:1: ruleMass EOF
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
    // InternalKinematicsParser.g:689:1: ruleMass : ( ( rule__Mass__Group__0 ) ) ;
    public final void ruleMass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:693:2: ( ( ( rule__Mass__Group__0 ) ) )
            // InternalKinematicsParser.g:694:2: ( ( rule__Mass__Group__0 ) )
            {
            // InternalKinematicsParser.g:694:2: ( ( rule__Mass__Group__0 ) )
            // InternalKinematicsParser.g:695:3: ( rule__Mass__Group__0 )
            {
             before(grammarAccess.getMassAccess().getGroup()); 
            // InternalKinematicsParser.g:696:3: ( rule__Mass__Group__0 )
            // InternalKinematicsParser.g:696:4: rule__Mass__Group__0
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
    // InternalKinematicsParser.g:705:1: entryRuleInertia : ruleInertia EOF ;
    public final void entryRuleInertia() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:706:1: ( ruleInertia EOF )
            // InternalKinematicsParser.g:707:1: ruleInertia EOF
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
    // InternalKinematicsParser.g:714:1: ruleInertia : ( ( rule__Inertia__Group__0 ) ) ;
    public final void ruleInertia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:718:2: ( ( ( rule__Inertia__Group__0 ) ) )
            // InternalKinematicsParser.g:719:2: ( ( rule__Inertia__Group__0 ) )
            {
            // InternalKinematicsParser.g:719:2: ( ( rule__Inertia__Group__0 ) )
            // InternalKinematicsParser.g:720:3: ( rule__Inertia__Group__0 )
            {
             before(grammarAccess.getInertiaAccess().getGroup()); 
            // InternalKinematicsParser.g:721:3: ( rule__Inertia__Group__0 )
            // InternalKinematicsParser.g:721:4: rule__Inertia__Group__0
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
    // InternalKinematicsParser.g:730:1: entryRuleGeometry : ruleGeometry EOF ;
    public final void entryRuleGeometry() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:731:1: ( ruleGeometry EOF )
            // InternalKinematicsParser.g:732:1: ruleGeometry EOF
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
    // InternalKinematicsParser.g:739:1: ruleGeometry : ( ( rule__Geometry__Group__0 ) ) ;
    public final void ruleGeometry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:743:2: ( ( ( rule__Geometry__Group__0 ) ) )
            // InternalKinematicsParser.g:744:2: ( ( rule__Geometry__Group__0 ) )
            {
            // InternalKinematicsParser.g:744:2: ( ( rule__Geometry__Group__0 ) )
            // InternalKinematicsParser.g:745:3: ( rule__Geometry__Group__0 )
            {
             before(grammarAccess.getGeometryAccess().getGroup()); 
            // InternalKinematicsParser.g:746:3: ( rule__Geometry__Group__0 )
            // InternalKinematicsParser.g:746:4: rule__Geometry__Group__0
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
    // InternalKinematicsParser.g:755:1: entryRuleBox : ruleBox EOF ;
    public final void entryRuleBox() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:756:1: ( ruleBox EOF )
            // InternalKinematicsParser.g:757:1: ruleBox EOF
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
    // InternalKinematicsParser.g:764:1: ruleBox : ( ( rule__Box__Group__0 ) ) ;
    public final void ruleBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:768:2: ( ( ( rule__Box__Group__0 ) ) )
            // InternalKinematicsParser.g:769:2: ( ( rule__Box__Group__0 ) )
            {
            // InternalKinematicsParser.g:769:2: ( ( rule__Box__Group__0 ) )
            // InternalKinematicsParser.g:770:3: ( rule__Box__Group__0 )
            {
             before(grammarAccess.getBoxAccess().getGroup()); 
            // InternalKinematicsParser.g:771:3: ( rule__Box__Group__0 )
            // InternalKinematicsParser.g:771:4: rule__Box__Group__0
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
    // InternalKinematicsParser.g:780:1: entryRuleCylinder : ruleCylinder EOF ;
    public final void entryRuleCylinder() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:781:1: ( ruleCylinder EOF )
            // InternalKinematicsParser.g:782:1: ruleCylinder EOF
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
    // InternalKinematicsParser.g:789:1: ruleCylinder : ( ( rule__Cylinder__Group__0 ) ) ;
    public final void ruleCylinder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:793:2: ( ( ( rule__Cylinder__Group__0 ) ) )
            // InternalKinematicsParser.g:794:2: ( ( rule__Cylinder__Group__0 ) )
            {
            // InternalKinematicsParser.g:794:2: ( ( rule__Cylinder__Group__0 ) )
            // InternalKinematicsParser.g:795:3: ( rule__Cylinder__Group__0 )
            {
             before(grammarAccess.getCylinderAccess().getGroup()); 
            // InternalKinematicsParser.g:796:3: ( rule__Cylinder__Group__0 )
            // InternalKinematicsParser.g:796:4: rule__Cylinder__Group__0
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
    // InternalKinematicsParser.g:805:1: entryRuleSphere : ruleSphere EOF ;
    public final void entryRuleSphere() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:806:1: ( ruleSphere EOF )
            // InternalKinematicsParser.g:807:1: ruleSphere EOF
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
    // InternalKinematicsParser.g:814:1: ruleSphere : ( ( rule__Sphere__Group__0 ) ) ;
    public final void ruleSphere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:818:2: ( ( ( rule__Sphere__Group__0 ) ) )
            // InternalKinematicsParser.g:819:2: ( ( rule__Sphere__Group__0 ) )
            {
            // InternalKinematicsParser.g:819:2: ( ( rule__Sphere__Group__0 ) )
            // InternalKinematicsParser.g:820:3: ( rule__Sphere__Group__0 )
            {
             before(grammarAccess.getSphereAccess().getGroup()); 
            // InternalKinematicsParser.g:821:3: ( rule__Sphere__Group__0 )
            // InternalKinematicsParser.g:821:4: rule__Sphere__Group__0
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
    // InternalKinematicsParser.g:830:1: entryRuleMesh : ruleMesh EOF ;
    public final void entryRuleMesh() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:831:1: ( ruleMesh EOF )
            // InternalKinematicsParser.g:832:1: ruleMesh EOF
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
    // InternalKinematicsParser.g:839:1: ruleMesh : ( ( rule__Mesh__Group__0 ) ) ;
    public final void ruleMesh() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:843:2: ( ( ( rule__Mesh__Group__0 ) ) )
            // InternalKinematicsParser.g:844:2: ( ( rule__Mesh__Group__0 ) )
            {
            // InternalKinematicsParser.g:844:2: ( ( rule__Mesh__Group__0 ) )
            // InternalKinematicsParser.g:845:3: ( rule__Mesh__Group__0 )
            {
             before(grammarAccess.getMeshAccess().getGroup()); 
            // InternalKinematicsParser.g:846:3: ( rule__Mesh__Group__0 )
            // InternalKinematicsParser.g:846:4: rule__Mesh__Group__0
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


    // $ANTLR start "entryRuleDouble0"
    // InternalKinematicsParser.g:855:1: entryRuleDouble0 : ruleDouble0 EOF ;
    public final void entryRuleDouble0() throws RecognitionException {
        try {
            // InternalKinematicsParser.g:856:1: ( ruleDouble0 EOF )
            // InternalKinematicsParser.g:857:1: ruleDouble0 EOF
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
    // InternalKinematicsParser.g:864:1: ruleDouble0 : ( RULE_DOUBLE ) ;
    public final void ruleDouble0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:868:2: ( ( RULE_DOUBLE ) )
            // InternalKinematicsParser.g:869:2: ( RULE_DOUBLE )
            {
            // InternalKinematicsParser.g:869:2: ( RULE_DOUBLE )
            // InternalKinematicsParser.g:870:3: RULE_DOUBLE
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


    // $ANTLR start "rule__ParameterValue__Alternatives"
    // InternalKinematicsParser.g:879:1: rule__ParameterValue__Alternatives : ( ( ( rule__ParameterValue__ValueAssignment_0 ) ) | ( rulePose ) | ( ruleLinkRef ) );
    public final void rule__ParameterValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:883:1: ( ( ( rule__ParameterValue__ValueAssignment_0 ) ) | ( rulePose ) | ( ruleLinkRef ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt1=1;
                }
                break;
            case RULE_BEGIN:
                {
                alt1=2;
                }
                break;
            case RULE_STRING:
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
                    // InternalKinematicsParser.g:884:2: ( ( rule__ParameterValue__ValueAssignment_0 ) )
                    {
                    // InternalKinematicsParser.g:884:2: ( ( rule__ParameterValue__ValueAssignment_0 ) )
                    // InternalKinematicsParser.g:885:3: ( rule__ParameterValue__ValueAssignment_0 )
                    {
                     before(grammarAccess.getParameterValueAccess().getValueAssignment_0()); 
                    // InternalKinematicsParser.g:886:3: ( rule__ParameterValue__ValueAssignment_0 )
                    // InternalKinematicsParser.g:886:4: rule__ParameterValue__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterValue__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterValueAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKinematicsParser.g:890:2: ( rulePose )
                    {
                    // InternalKinematicsParser.g:890:2: ( rulePose )
                    // InternalKinematicsParser.g:891:3: rulePose
                    {
                     before(grammarAccess.getParameterValueAccess().getPoseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePose();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getPoseParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKinematicsParser.g:896:2: ( ruleLinkRef )
                    {
                    // InternalKinematicsParser.g:896:2: ( ruleLinkRef )
                    // InternalKinematicsParser.g:897:3: ruleLinkRef
                    {
                     before(grammarAccess.getParameterValueAccess().getLinkRefParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLinkRef();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getLinkRefParserRuleCall_2()); 

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
    // $ANTLR end "rule__ParameterValue__Alternatives"


    // $ANTLR start "rule__ParameterPose__Alternatives"
    // InternalKinematicsParser.g:906:1: rule__ParameterPose__Alternatives : ( ( ( rule__ParameterPose__RefAssignment_0 ) ) | ( ( rule__ParameterPose__ValueAssignment_1 ) ) );
    public final void rule__ParameterPose__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:910:1: ( ( ( rule__ParameterPose__RefAssignment_0 ) ) | ( ( rule__ParameterPose__ValueAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_BEGIN) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalKinematicsParser.g:911:2: ( ( rule__ParameterPose__RefAssignment_0 ) )
                    {
                    // InternalKinematicsParser.g:911:2: ( ( rule__ParameterPose__RefAssignment_0 ) )
                    // InternalKinematicsParser.g:912:3: ( rule__ParameterPose__RefAssignment_0 )
                    {
                     before(grammarAccess.getParameterPoseAccess().getRefAssignment_0()); 
                    // InternalKinematicsParser.g:913:3: ( rule__ParameterPose__RefAssignment_0 )
                    // InternalKinematicsParser.g:913:4: rule__ParameterPose__RefAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterPose__RefAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterPoseAccess().getRefAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKinematicsParser.g:917:2: ( ( rule__ParameterPose__ValueAssignment_1 ) )
                    {
                    // InternalKinematicsParser.g:917:2: ( ( rule__ParameterPose__ValueAssignment_1 ) )
                    // InternalKinematicsParser.g:918:3: ( rule__ParameterPose__ValueAssignment_1 )
                    {
                     before(grammarAccess.getParameterPoseAccess().getValueAssignment_1()); 
                    // InternalKinematicsParser.g:919:3: ( rule__ParameterPose__ValueAssignment_1 )
                    // InternalKinematicsParser.g:919:4: rule__ParameterPose__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterPose__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterPoseAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__ParameterPose__Alternatives"


    // $ANTLR start "rule__ParameterLink__Alternatives"
    // InternalKinematicsParser.g:927:1: rule__ParameterLink__Alternatives : ( ( ( rule__ParameterLink__ParamAssignment_0 ) ) | ( ( rule__ParameterLink__LinkAssignment_1 ) ) );
    public final void rule__ParameterLink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:931:1: ( ( ( rule__ParameterLink__ParamAssignment_0 ) ) | ( ( rule__ParameterLink__LinkAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalKinematicsParser.g:932:2: ( ( rule__ParameterLink__ParamAssignment_0 ) )
                    {
                    // InternalKinematicsParser.g:932:2: ( ( rule__ParameterLink__ParamAssignment_0 ) )
                    // InternalKinematicsParser.g:933:3: ( rule__ParameterLink__ParamAssignment_0 )
                    {
                     before(grammarAccess.getParameterLinkAccess().getParamAssignment_0()); 
                    // InternalKinematicsParser.g:934:3: ( rule__ParameterLink__ParamAssignment_0 )
                    // InternalKinematicsParser.g:934:4: rule__ParameterLink__ParamAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterLink__ParamAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterLinkAccess().getParamAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKinematicsParser.g:938:2: ( ( rule__ParameterLink__LinkAssignment_1 ) )
                    {
                    // InternalKinematicsParser.g:938:2: ( ( rule__ParameterLink__LinkAssignment_1 ) )
                    // InternalKinematicsParser.g:939:3: ( rule__ParameterLink__LinkAssignment_1 )
                    {
                     before(grammarAccess.getParameterLinkAccess().getLinkAssignment_1()); 
                    // InternalKinematicsParser.g:940:3: ( rule__ParameterLink__LinkAssignment_1 )
                    // InternalKinematicsParser.g:940:4: rule__ParameterLink__LinkAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterLink__LinkAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterLinkAccess().getLinkAssignment_1()); 

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
    // $ANTLR end "rule__ParameterLink__Alternatives"


    // $ANTLR start "rule__ParameterType__Alternatives"
    // InternalKinematicsParser.g:948:1: rule__ParameterType__Alternatives : ( ( ruleParameterStringType ) | ( ruleParameterLinkRefType ) | ( ruleParameterPoseType ) );
    public final void rule__ParameterType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:952:1: ( ( ruleParameterStringType ) | ( ruleParameterLinkRefType ) | ( ruleParameterPoseType ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case String:
                {
                alt4=1;
                }
                break;
            case LinkRef:
                {
                alt4=2;
                }
                break;
            case Pose:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalKinematicsParser.g:953:2: ( ruleParameterStringType )
                    {
                    // InternalKinematicsParser.g:953:2: ( ruleParameterStringType )
                    // InternalKinematicsParser.g:954:3: ruleParameterStringType
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterStringTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterStringType();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterStringTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKinematicsParser.g:959:2: ( ruleParameterLinkRefType )
                    {
                    // InternalKinematicsParser.g:959:2: ( ruleParameterLinkRefType )
                    // InternalKinematicsParser.g:960:3: ruleParameterLinkRefType
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterLinkRefTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterLinkRefType();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterLinkRefTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKinematicsParser.g:965:2: ( ruleParameterPoseType )
                    {
                    // InternalKinematicsParser.g:965:2: ( ruleParameterPoseType )
                    // InternalKinematicsParser.g:966:3: ruleParameterPoseType
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterPoseTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterPoseType();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterPoseTypeParserRuleCall_2()); 

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
    // InternalKinematicsParser.g:975:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:979:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalKinematicsParser.g:980:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
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
    // InternalKinematicsParser.g:987:1: rule__Robot__Group__0__Impl : ( () ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:991:1: ( ( () ) )
            // InternalKinematicsParser.g:992:1: ( () )
            {
            // InternalKinematicsParser.g:992:1: ( () )
            // InternalKinematicsParser.g:993:2: ()
            {
             before(grammarAccess.getRobotAccess().getRobotAction_0()); 
            // InternalKinematicsParser.g:994:2: ()
            // InternalKinematicsParser.g:994:3: 
            {
            }

             after(grammarAccess.getRobotAccess().getRobotAction_0()); 

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
    // InternalKinematicsParser.g:1002:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1006:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalKinematicsParser.g:1007:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
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
    // InternalKinematicsParser.g:1014:1: rule__Robot__Group__1__Impl : ( Robot ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1018:1: ( ( Robot ) )
            // InternalKinematicsParser.g:1019:1: ( Robot )
            {
            // InternalKinematicsParser.g:1019:1: ( Robot )
            // InternalKinematicsParser.g:1020:2: Robot
            {
             before(grammarAccess.getRobotAccess().getRobotKeyword_1()); 
            match(input,Robot,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getRobotKeyword_1()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:1029:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl rule__Robot__Group__3 ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1033:1: ( rule__Robot__Group__2__Impl rule__Robot__Group__3 )
            // InternalKinematicsParser.g:1034:2: rule__Robot__Group__2__Impl rule__Robot__Group__3
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
    // InternalKinematicsParser.g:1041:1: rule__Robot__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1045:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:1046:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:1046:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:1047:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:1056:1: rule__Robot__Group__3 : rule__Robot__Group__3__Impl rule__Robot__Group__4 ;
    public final void rule__Robot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1060:1: ( rule__Robot__Group__3__Impl rule__Robot__Group__4 )
            // InternalKinematicsParser.g:1061:2: rule__Robot__Group__3__Impl rule__Robot__Group__4
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
    // InternalKinematicsParser.g:1068:1: rule__Robot__Group__3__Impl : ( Name ) ;
    public final void rule__Robot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1072:1: ( ( Name ) )
            // InternalKinematicsParser.g:1073:1: ( Name )
            {
            // InternalKinematicsParser.g:1073:1: ( Name )
            // InternalKinematicsParser.g:1074:2: Name
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
    // InternalKinematicsParser.g:1083:1: rule__Robot__Group__4 : rule__Robot__Group__4__Impl rule__Robot__Group__5 ;
    public final void rule__Robot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1087:1: ( rule__Robot__Group__4__Impl rule__Robot__Group__5 )
            // InternalKinematicsParser.g:1088:2: rule__Robot__Group__4__Impl rule__Robot__Group__5
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
    // InternalKinematicsParser.g:1095:1: rule__Robot__Group__4__Impl : ( ( rule__Robot__NameAssignment_4 ) ) ;
    public final void rule__Robot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1099:1: ( ( ( rule__Robot__NameAssignment_4 ) ) )
            // InternalKinematicsParser.g:1100:1: ( ( rule__Robot__NameAssignment_4 ) )
            {
            // InternalKinematicsParser.g:1100:1: ( ( rule__Robot__NameAssignment_4 ) )
            // InternalKinematicsParser.g:1101:2: ( rule__Robot__NameAssignment_4 )
            {
             before(grammarAccess.getRobotAccess().getNameAssignment_4()); 
            // InternalKinematicsParser.g:1102:2: ( rule__Robot__NameAssignment_4 )
            // InternalKinematicsParser.g:1102:3: rule__Robot__NameAssignment_4
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
    // InternalKinematicsParser.g:1110:1: rule__Robot__Group__5 : rule__Robot__Group__5__Impl rule__Robot__Group__6 ;
    public final void rule__Robot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1114:1: ( rule__Robot__Group__5__Impl rule__Robot__Group__6 )
            // InternalKinematicsParser.g:1115:2: rule__Robot__Group__5__Impl rule__Robot__Group__6
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
    // InternalKinematicsParser.g:1122:1: rule__Robot__Group__5__Impl : ( ( rule__Robot__Group_5__0 )? ) ;
    public final void rule__Robot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1126:1: ( ( ( rule__Robot__Group_5__0 )? ) )
            // InternalKinematicsParser.g:1127:1: ( ( rule__Robot__Group_5__0 )? )
            {
            // InternalKinematicsParser.g:1127:1: ( ( rule__Robot__Group_5__0 )? )
            // InternalKinematicsParser.g:1128:2: ( rule__Robot__Group_5__0 )?
            {
             before(grammarAccess.getRobotAccess().getGroup_5()); 
            // InternalKinematicsParser.g:1129:2: ( rule__Robot__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Version) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKinematicsParser.g:1129:3: rule__Robot__Group_5__0
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
    // InternalKinematicsParser.g:1137:1: rule__Robot__Group__6 : rule__Robot__Group__6__Impl rule__Robot__Group__7 ;
    public final void rule__Robot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1141:1: ( rule__Robot__Group__6__Impl rule__Robot__Group__7 )
            // InternalKinematicsParser.g:1142:2: rule__Robot__Group__6__Impl rule__Robot__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Robot__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__7();

            state._fsp--;


            }

        }
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
    // InternalKinematicsParser.g:1149:1: rule__Robot__Group__6__Impl : ( ( rule__Robot__Group_6__0 )? ) ;
    public final void rule__Robot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1153:1: ( ( ( rule__Robot__Group_6__0 )? ) )
            // InternalKinematicsParser.g:1154:1: ( ( rule__Robot__Group_6__0 )? )
            {
            // InternalKinematicsParser.g:1154:1: ( ( rule__Robot__Group_6__0 )? )
            // InternalKinematicsParser.g:1155:2: ( rule__Robot__Group_6__0 )?
            {
             before(grammarAccess.getRobotAccess().getGroup_6()); 
            // InternalKinematicsParser.g:1156:2: ( rule__Robot__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Macros) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKinematicsParser.g:1156:3: rule__Robot__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Robot__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRobotAccess().getGroup_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Robot__Group__7"
    // InternalKinematicsParser.g:1164:1: rule__Robot__Group__7 : rule__Robot__Group__7__Impl rule__Robot__Group__8 ;
    public final void rule__Robot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1168:1: ( rule__Robot__Group__7__Impl rule__Robot__Group__8 )
            // InternalKinematicsParser.g:1169:2: rule__Robot__Group__7__Impl rule__Robot__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Robot__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__7"


    // $ANTLR start "rule__Robot__Group__7__Impl"
    // InternalKinematicsParser.g:1176:1: rule__Robot__Group__7__Impl : ( ( rule__Robot__Group_7__0 )? ) ;
    public final void rule__Robot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1180:1: ( ( ( rule__Robot__Group_7__0 )? ) )
            // InternalKinematicsParser.g:1181:1: ( ( rule__Robot__Group_7__0 )? )
            {
            // InternalKinematicsParser.g:1181:1: ( ( rule__Robot__Group_7__0 )? )
            // InternalKinematicsParser.g:1182:2: ( rule__Robot__Group_7__0 )?
            {
             before(grammarAccess.getRobotAccess().getGroup_7()); 
            // InternalKinematicsParser.g:1183:2: ( rule__Robot__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==MacroCalls) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKinematicsParser.g:1183:3: rule__Robot__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Robot__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRobotAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__7__Impl"


    // $ANTLR start "rule__Robot__Group__8"
    // InternalKinematicsParser.g:1191:1: rule__Robot__Group__8 : rule__Robot__Group__8__Impl rule__Robot__Group__9 ;
    public final void rule__Robot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1195:1: ( rule__Robot__Group__8__Impl rule__Robot__Group__9 )
            // InternalKinematicsParser.g:1196:2: rule__Robot__Group__8__Impl rule__Robot__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__Robot__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__8"


    // $ANTLR start "rule__Robot__Group__8__Impl"
    // InternalKinematicsParser.g:1203:1: rule__Robot__Group__8__Impl : ( ( rule__Robot__Group_8__0 )? ) ;
    public final void rule__Robot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1207:1: ( ( ( rule__Robot__Group_8__0 )? ) )
            // InternalKinematicsParser.g:1208:1: ( ( rule__Robot__Group_8__0 )? )
            {
            // InternalKinematicsParser.g:1208:1: ( ( rule__Robot__Group_8__0 )? )
            // InternalKinematicsParser.g:1209:2: ( rule__Robot__Group_8__0 )?
            {
             before(grammarAccess.getRobotAccess().getGroup_8()); 
            // InternalKinematicsParser.g:1210:2: ( rule__Robot__Group_8__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Body) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalKinematicsParser.g:1210:3: rule__Robot__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Robot__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRobotAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__8__Impl"


    // $ANTLR start "rule__Robot__Group__9"
    // InternalKinematicsParser.g:1218:1: rule__Robot__Group__9 : rule__Robot__Group__9__Impl ;
    public final void rule__Robot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1222:1: ( rule__Robot__Group__9__Impl )
            // InternalKinematicsParser.g:1223:2: rule__Robot__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__9"


    // $ANTLR start "rule__Robot__Group__9__Impl"
    // InternalKinematicsParser.g:1229:1: rule__Robot__Group__9__Impl : ( RULE_END ) ;
    public final void rule__Robot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1233:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:1234:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:1234:1: ( RULE_END )
            // InternalKinematicsParser.g:1235:2: RULE_END
            {
             before(grammarAccess.getRobotAccess().getENDTerminalRuleCall_9()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getENDTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__9__Impl"


    // $ANTLR start "rule__Robot__Group_5__0"
    // InternalKinematicsParser.g:1245:1: rule__Robot__Group_5__0 : rule__Robot__Group_5__0__Impl rule__Robot__Group_5__1 ;
    public final void rule__Robot__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1249:1: ( rule__Robot__Group_5__0__Impl rule__Robot__Group_5__1 )
            // InternalKinematicsParser.g:1250:2: rule__Robot__Group_5__0__Impl rule__Robot__Group_5__1
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
    // InternalKinematicsParser.g:1257:1: rule__Robot__Group_5__0__Impl : ( Version ) ;
    public final void rule__Robot__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1261:1: ( ( Version ) )
            // InternalKinematicsParser.g:1262:1: ( Version )
            {
            // InternalKinematicsParser.g:1262:1: ( Version )
            // InternalKinematicsParser.g:1263:2: Version
            {
             before(grammarAccess.getRobotAccess().getVersionKeyword_5_0()); 
            match(input,Version,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getVersionKeyword_5_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:1272:1: rule__Robot__Group_5__1 : rule__Robot__Group_5__1__Impl ;
    public final void rule__Robot__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1276:1: ( rule__Robot__Group_5__1__Impl )
            // InternalKinematicsParser.g:1277:2: rule__Robot__Group_5__1__Impl
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
    // InternalKinematicsParser.g:1283:1: rule__Robot__Group_5__1__Impl : ( ( rule__Robot__VersionAssignment_5_1 ) ) ;
    public final void rule__Robot__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1287:1: ( ( ( rule__Robot__VersionAssignment_5_1 ) ) )
            // InternalKinematicsParser.g:1288:1: ( ( rule__Robot__VersionAssignment_5_1 ) )
            {
            // InternalKinematicsParser.g:1288:1: ( ( rule__Robot__VersionAssignment_5_1 ) )
            // InternalKinematicsParser.g:1289:2: ( rule__Robot__VersionAssignment_5_1 )
            {
             before(grammarAccess.getRobotAccess().getVersionAssignment_5_1()); 
            // InternalKinematicsParser.g:1290:2: ( rule__Robot__VersionAssignment_5_1 )
            // InternalKinematicsParser.g:1290:3: rule__Robot__VersionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Robot__VersionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getVersionAssignment_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Robot__Group_6__0"
    // InternalKinematicsParser.g:1299:1: rule__Robot__Group_6__0 : rule__Robot__Group_6__0__Impl rule__Robot__Group_6__1 ;
    public final void rule__Robot__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1303:1: ( rule__Robot__Group_6__0__Impl rule__Robot__Group_6__1 )
            // InternalKinematicsParser.g:1304:2: rule__Robot__Group_6__0__Impl rule__Robot__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__Robot__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_6__0"


    // $ANTLR start "rule__Robot__Group_6__0__Impl"
    // InternalKinematicsParser.g:1311:1: rule__Robot__Group_6__0__Impl : ( Macros ) ;
    public final void rule__Robot__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1315:1: ( ( Macros ) )
            // InternalKinematicsParser.g:1316:1: ( Macros )
            {
            // InternalKinematicsParser.g:1316:1: ( Macros )
            // InternalKinematicsParser.g:1317:2: Macros
            {
             before(grammarAccess.getRobotAccess().getMacrosKeyword_6_0()); 
            match(input,Macros,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getMacrosKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_6__0__Impl"


    // $ANTLR start "rule__Robot__Group_6__1"
    // InternalKinematicsParser.g:1326:1: rule__Robot__Group_6__1 : rule__Robot__Group_6__1__Impl ;
    public final void rule__Robot__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1330:1: ( rule__Robot__Group_6__1__Impl )
            // InternalKinematicsParser.g:1331:2: rule__Robot__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_6__1"


    // $ANTLR start "rule__Robot__Group_6__1__Impl"
    // InternalKinematicsParser.g:1337:1: rule__Robot__Group_6__1__Impl : ( ( rule__Robot__MacroAssignment_6_1 )* ) ;
    public final void rule__Robot__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1341:1: ( ( ( rule__Robot__MacroAssignment_6_1 )* ) )
            // InternalKinematicsParser.g:1342:1: ( ( rule__Robot__MacroAssignment_6_1 )* )
            {
            // InternalKinematicsParser.g:1342:1: ( ( rule__Robot__MacroAssignment_6_1 )* )
            // InternalKinematicsParser.g:1343:2: ( rule__Robot__MacroAssignment_6_1 )*
            {
             before(grammarAccess.getRobotAccess().getMacroAssignment_6_1()); 
            // InternalKinematicsParser.g:1344:2: ( rule__Robot__MacroAssignment_6_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==HyphenMinus) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKinematicsParser.g:1344:3: rule__Robot__MacroAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Robot__MacroAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRobotAccess().getMacroAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_6__1__Impl"


    // $ANTLR start "rule__Robot__Group_7__0"
    // InternalKinematicsParser.g:1353:1: rule__Robot__Group_7__0 : rule__Robot__Group_7__0__Impl rule__Robot__Group_7__1 ;
    public final void rule__Robot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1357:1: ( rule__Robot__Group_7__0__Impl rule__Robot__Group_7__1 )
            // InternalKinematicsParser.g:1358:2: rule__Robot__Group_7__0__Impl rule__Robot__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__Robot__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_7__0"


    // $ANTLR start "rule__Robot__Group_7__0__Impl"
    // InternalKinematicsParser.g:1365:1: rule__Robot__Group_7__0__Impl : ( MacroCalls ) ;
    public final void rule__Robot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1369:1: ( ( MacroCalls ) )
            // InternalKinematicsParser.g:1370:1: ( MacroCalls )
            {
            // InternalKinematicsParser.g:1370:1: ( MacroCalls )
            // InternalKinematicsParser.g:1371:2: MacroCalls
            {
             before(grammarAccess.getRobotAccess().getMacroCallsKeyword_7_0()); 
            match(input,MacroCalls,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getMacroCallsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_7__0__Impl"


    // $ANTLR start "rule__Robot__Group_7__1"
    // InternalKinematicsParser.g:1380:1: rule__Robot__Group_7__1 : rule__Robot__Group_7__1__Impl ;
    public final void rule__Robot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1384:1: ( rule__Robot__Group_7__1__Impl )
            // InternalKinematicsParser.g:1385:2: rule__Robot__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_7__1"


    // $ANTLR start "rule__Robot__Group_7__1__Impl"
    // InternalKinematicsParser.g:1391:1: rule__Robot__Group_7__1__Impl : ( ( rule__Robot__MacroCallAssignment_7_1 )* ) ;
    public final void rule__Robot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1395:1: ( ( ( rule__Robot__MacroCallAssignment_7_1 )* ) )
            // InternalKinematicsParser.g:1396:1: ( ( rule__Robot__MacroCallAssignment_7_1 )* )
            {
            // InternalKinematicsParser.g:1396:1: ( ( rule__Robot__MacroCallAssignment_7_1 )* )
            // InternalKinematicsParser.g:1397:2: ( rule__Robot__MacroCallAssignment_7_1 )*
            {
             before(grammarAccess.getRobotAccess().getMacroCallAssignment_7_1()); 
            // InternalKinematicsParser.g:1398:2: ( rule__Robot__MacroCallAssignment_7_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==HyphenMinus) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKinematicsParser.g:1398:3: rule__Robot__MacroCallAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Robot__MacroCallAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRobotAccess().getMacroCallAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_7__1__Impl"


    // $ANTLR start "rule__Robot__Group_8__0"
    // InternalKinematicsParser.g:1407:1: rule__Robot__Group_8__0 : rule__Robot__Group_8__0__Impl rule__Robot__Group_8__1 ;
    public final void rule__Robot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1411:1: ( rule__Robot__Group_8__0__Impl rule__Robot__Group_8__1 )
            // InternalKinematicsParser.g:1412:2: rule__Robot__Group_8__0__Impl rule__Robot__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__Robot__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_8__0"


    // $ANTLR start "rule__Robot__Group_8__0__Impl"
    // InternalKinematicsParser.g:1419:1: rule__Robot__Group_8__0__Impl : ( Body ) ;
    public final void rule__Robot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1423:1: ( ( Body ) )
            // InternalKinematicsParser.g:1424:1: ( Body )
            {
            // InternalKinematicsParser.g:1424:1: ( Body )
            // InternalKinematicsParser.g:1425:2: Body
            {
             before(grammarAccess.getRobotAccess().getBodyKeyword_8_0()); 
            match(input,Body,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getBodyKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_8__0__Impl"


    // $ANTLR start "rule__Robot__Group_8__1"
    // InternalKinematicsParser.g:1434:1: rule__Robot__Group_8__1 : rule__Robot__Group_8__1__Impl rule__Robot__Group_8__2 ;
    public final void rule__Robot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1438:1: ( rule__Robot__Group_8__1__Impl rule__Robot__Group_8__2 )
            // InternalKinematicsParser.g:1439:2: rule__Robot__Group_8__1__Impl rule__Robot__Group_8__2
            {
            pushFollow(FOLLOW_11);
            rule__Robot__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_8__1"


    // $ANTLR start "rule__Robot__Group_8__1__Impl"
    // InternalKinematicsParser.g:1446:1: rule__Robot__Group_8__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Robot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1450:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:1451:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:1451:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:1452:2: RULE_BEGIN
            {
             before(grammarAccess.getRobotAccess().getBEGINTerminalRuleCall_8_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getBEGINTerminalRuleCall_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_8__1__Impl"


    // $ANTLR start "rule__Robot__Group_8__2"
    // InternalKinematicsParser.g:1461:1: rule__Robot__Group_8__2 : rule__Robot__Group_8__2__Impl rule__Robot__Group_8__3 ;
    public final void rule__Robot__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1465:1: ( rule__Robot__Group_8__2__Impl rule__Robot__Group_8__3 )
            // InternalKinematicsParser.g:1466:2: rule__Robot__Group_8__2__Impl rule__Robot__Group_8__3
            {
            pushFollow(FOLLOW_12);
            rule__Robot__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_8__2"


    // $ANTLR start "rule__Robot__Group_8__2__Impl"
    // InternalKinematicsParser.g:1473:1: rule__Robot__Group_8__2__Impl : ( ( rule__Robot__BodyAssignment_8_2 ) ) ;
    public final void rule__Robot__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1477:1: ( ( ( rule__Robot__BodyAssignment_8_2 ) ) )
            // InternalKinematicsParser.g:1478:1: ( ( rule__Robot__BodyAssignment_8_2 ) )
            {
            // InternalKinematicsParser.g:1478:1: ( ( rule__Robot__BodyAssignment_8_2 ) )
            // InternalKinematicsParser.g:1479:2: ( rule__Robot__BodyAssignment_8_2 )
            {
             before(grammarAccess.getRobotAccess().getBodyAssignment_8_2()); 
            // InternalKinematicsParser.g:1480:2: ( rule__Robot__BodyAssignment_8_2 )
            // InternalKinematicsParser.g:1480:3: rule__Robot__BodyAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Robot__BodyAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getBodyAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_8__2__Impl"


    // $ANTLR start "rule__Robot__Group_8__3"
    // InternalKinematicsParser.g:1488:1: rule__Robot__Group_8__3 : rule__Robot__Group_8__3__Impl ;
    public final void rule__Robot__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1492:1: ( rule__Robot__Group_8__3__Impl )
            // InternalKinematicsParser.g:1493:2: rule__Robot__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_8__3"


    // $ANTLR start "rule__Robot__Group_8__3__Impl"
    // InternalKinematicsParser.g:1499:1: rule__Robot__Group_8__3__Impl : ( RULE_END ) ;
    public final void rule__Robot__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1503:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:1504:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:1504:1: ( RULE_END )
            // InternalKinematicsParser.g:1505:2: RULE_END
            {
             before(grammarAccess.getRobotAccess().getENDTerminalRuleCall_8_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getENDTerminalRuleCall_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_8__3__Impl"


    // $ANTLR start "rule__Macro__Group__0"
    // InternalKinematicsParser.g:1515:1: rule__Macro__Group__0 : rule__Macro__Group__0__Impl rule__Macro__Group__1 ;
    public final void rule__Macro__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1519:1: ( rule__Macro__Group__0__Impl rule__Macro__Group__1 )
            // InternalKinematicsParser.g:1520:2: rule__Macro__Group__0__Impl rule__Macro__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalKinematicsParser.g:1527:1: rule__Macro__Group__0__Impl : ( HyphenMinus ) ;
    public final void rule__Macro__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1531:1: ( ( HyphenMinus ) )
            // InternalKinematicsParser.g:1532:1: ( HyphenMinus )
            {
            // InternalKinematicsParser.g:1532:1: ( HyphenMinus )
            // InternalKinematicsParser.g:1533:2: HyphenMinus
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
    // InternalKinematicsParser.g:1542:1: rule__Macro__Group__1 : rule__Macro__Group__1__Impl rule__Macro__Group__2 ;
    public final void rule__Macro__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1546:1: ( rule__Macro__Group__1__Impl rule__Macro__Group__2 )
            // InternalKinematicsParser.g:1547:2: rule__Macro__Group__1__Impl rule__Macro__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalKinematicsParser.g:1554:1: rule__Macro__Group__1__Impl : ( ( rule__Macro__NameAssignment_1 ) ) ;
    public final void rule__Macro__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1558:1: ( ( ( rule__Macro__NameAssignment_1 ) ) )
            // InternalKinematicsParser.g:1559:1: ( ( rule__Macro__NameAssignment_1 ) )
            {
            // InternalKinematicsParser.g:1559:1: ( ( rule__Macro__NameAssignment_1 ) )
            // InternalKinematicsParser.g:1560:2: ( rule__Macro__NameAssignment_1 )
            {
             before(grammarAccess.getMacroAccess().getNameAssignment_1()); 
            // InternalKinematicsParser.g:1561:2: ( rule__Macro__NameAssignment_1 )
            // InternalKinematicsParser.g:1561:3: rule__Macro__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Macro__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMacroAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:1569:1: rule__Macro__Group__2 : rule__Macro__Group__2__Impl rule__Macro__Group__3 ;
    public final void rule__Macro__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1573:1: ( rule__Macro__Group__2__Impl rule__Macro__Group__3 )
            // InternalKinematicsParser.g:1574:2: rule__Macro__Group__2__Impl rule__Macro__Group__3
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
    // InternalKinematicsParser.g:1581:1: rule__Macro__Group__2__Impl : ( Colon ) ;
    public final void rule__Macro__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1585:1: ( ( Colon ) )
            // InternalKinematicsParser.g:1586:1: ( Colon )
            {
            // InternalKinematicsParser.g:1586:1: ( Colon )
            // InternalKinematicsParser.g:1587:2: Colon
            {
             before(grammarAccess.getMacroAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getMacroAccess().getColonKeyword_2()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:1596:1: rule__Macro__Group__3 : rule__Macro__Group__3__Impl rule__Macro__Group__4 ;
    public final void rule__Macro__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1600:1: ( rule__Macro__Group__3__Impl rule__Macro__Group__4 )
            // InternalKinematicsParser.g:1601:2: rule__Macro__Group__3__Impl rule__Macro__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalKinematicsParser.g:1608:1: rule__Macro__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__Macro__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1612:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:1613:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:1613:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:1614:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:1623:1: rule__Macro__Group__4 : rule__Macro__Group__4__Impl rule__Macro__Group__5 ;
    public final void rule__Macro__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1627:1: ( rule__Macro__Group__4__Impl rule__Macro__Group__5 )
            // InternalKinematicsParser.g:1628:2: rule__Macro__Group__4__Impl rule__Macro__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalKinematicsParser.g:1635:1: rule__Macro__Group__4__Impl : ( ( rule__Macro__Group_4__0 )? ) ;
    public final void rule__Macro__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1639:1: ( ( ( rule__Macro__Group_4__0 )? ) )
            // InternalKinematicsParser.g:1640:1: ( ( rule__Macro__Group_4__0 )? )
            {
            // InternalKinematicsParser.g:1640:1: ( ( rule__Macro__Group_4__0 )? )
            // InternalKinematicsParser.g:1641:2: ( rule__Macro__Group_4__0 )?
            {
             before(grammarAccess.getMacroAccess().getGroup_4()); 
            // InternalKinematicsParser.g:1642:2: ( rule__Macro__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Parameters) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKinematicsParser.g:1642:3: rule__Macro__Group_4__0
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
    // InternalKinematicsParser.g:1650:1: rule__Macro__Group__5 : rule__Macro__Group__5__Impl rule__Macro__Group__6 ;
    public final void rule__Macro__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1654:1: ( rule__Macro__Group__5__Impl rule__Macro__Group__6 )
            // InternalKinematicsParser.g:1655:2: rule__Macro__Group__5__Impl rule__Macro__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalKinematicsParser.g:1662:1: rule__Macro__Group__5__Impl : ( ( rule__Macro__Group_5__0 )? ) ;
    public final void rule__Macro__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1666:1: ( ( ( rule__Macro__Group_5__0 )? ) )
            // InternalKinematicsParser.g:1667:1: ( ( rule__Macro__Group_5__0 )? )
            {
            // InternalKinematicsParser.g:1667:1: ( ( rule__Macro__Group_5__0 )? )
            // InternalKinematicsParser.g:1668:2: ( rule__Macro__Group_5__0 )?
            {
             before(grammarAccess.getMacroAccess().getGroup_5()); 
            // InternalKinematicsParser.g:1669:2: ( rule__Macro__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Body) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKinematicsParser.g:1669:3: rule__Macro__Group_5__0
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
    // InternalKinematicsParser.g:1677:1: rule__Macro__Group__6 : rule__Macro__Group__6__Impl ;
    public final void rule__Macro__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1681:1: ( rule__Macro__Group__6__Impl )
            // InternalKinematicsParser.g:1682:2: rule__Macro__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Macro__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalKinematicsParser.g:1688:1: rule__Macro__Group__6__Impl : ( RULE_END ) ;
    public final void rule__Macro__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1692:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:1693:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:1693:1: ( RULE_END )
            // InternalKinematicsParser.g:1694:2: RULE_END
            {
             before(grammarAccess.getMacroAccess().getENDTerminalRuleCall_6()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getMacroAccess().getENDTerminalRuleCall_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Macro__Group_4__0"
    // InternalKinematicsParser.g:1704:1: rule__Macro__Group_4__0 : rule__Macro__Group_4__0__Impl rule__Macro__Group_4__1 ;
    public final void rule__Macro__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1708:1: ( rule__Macro__Group_4__0__Impl rule__Macro__Group_4__1 )
            // InternalKinematicsParser.g:1709:2: rule__Macro__Group_4__0__Impl rule__Macro__Group_4__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalKinematicsParser.g:1716:1: rule__Macro__Group_4__0__Impl : ( Parameters ) ;
    public final void rule__Macro__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1720:1: ( ( Parameters ) )
            // InternalKinematicsParser.g:1721:1: ( Parameters )
            {
            // InternalKinematicsParser.g:1721:1: ( Parameters )
            // InternalKinematicsParser.g:1722:2: Parameters
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
    // InternalKinematicsParser.g:1731:1: rule__Macro__Group_4__1 : rule__Macro__Group_4__1__Impl ;
    public final void rule__Macro__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1735:1: ( rule__Macro__Group_4__1__Impl )
            // InternalKinematicsParser.g:1736:2: rule__Macro__Group_4__1__Impl
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
    // InternalKinematicsParser.g:1742:1: rule__Macro__Group_4__1__Impl : ( ( rule__Macro__ParameterAssignment_4_1 )* ) ;
    public final void rule__Macro__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1746:1: ( ( ( rule__Macro__ParameterAssignment_4_1 )* ) )
            // InternalKinematicsParser.g:1747:1: ( ( rule__Macro__ParameterAssignment_4_1 )* )
            {
            // InternalKinematicsParser.g:1747:1: ( ( rule__Macro__ParameterAssignment_4_1 )* )
            // InternalKinematicsParser.g:1748:2: ( rule__Macro__ParameterAssignment_4_1 )*
            {
             before(grammarAccess.getMacroAccess().getParameterAssignment_4_1()); 
            // InternalKinematicsParser.g:1749:2: ( rule__Macro__ParameterAssignment_4_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==HyphenMinus) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKinematicsParser.g:1749:3: rule__Macro__ParameterAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Macro__ParameterAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMacroAccess().getParameterAssignment_4_1()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:1758:1: rule__Macro__Group_5__0 : rule__Macro__Group_5__0__Impl rule__Macro__Group_5__1 ;
    public final void rule__Macro__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1762:1: ( rule__Macro__Group_5__0__Impl rule__Macro__Group_5__1 )
            // InternalKinematicsParser.g:1763:2: rule__Macro__Group_5__0__Impl rule__Macro__Group_5__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalKinematicsParser.g:1770:1: rule__Macro__Group_5__0__Impl : ( Body ) ;
    public final void rule__Macro__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1774:1: ( ( Body ) )
            // InternalKinematicsParser.g:1775:1: ( Body )
            {
            // InternalKinematicsParser.g:1775:1: ( Body )
            // InternalKinematicsParser.g:1776:2: Body
            {
             before(grammarAccess.getMacroAccess().getBodyKeyword_5_0()); 
            match(input,Body,FOLLOW_2); 
             after(grammarAccess.getMacroAccess().getBodyKeyword_5_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:1785:1: rule__Macro__Group_5__1 : rule__Macro__Group_5__1__Impl rule__Macro__Group_5__2 ;
    public final void rule__Macro__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1789:1: ( rule__Macro__Group_5__1__Impl rule__Macro__Group_5__2 )
            // InternalKinematicsParser.g:1790:2: rule__Macro__Group_5__1__Impl rule__Macro__Group_5__2
            {
            pushFollow(FOLLOW_11);
            rule__Macro__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Macro__Group_5__2();

            state._fsp--;


            }

        }
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
    // InternalKinematicsParser.g:1797:1: rule__Macro__Group_5__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Macro__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1801:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:1802:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:1802:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:1803:2: RULE_BEGIN
            {
             before(grammarAccess.getMacroAccess().getBEGINTerminalRuleCall_5_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getMacroAccess().getBEGINTerminalRuleCall_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Macro__Group_5__2"
    // InternalKinematicsParser.g:1812:1: rule__Macro__Group_5__2 : rule__Macro__Group_5__2__Impl rule__Macro__Group_5__3 ;
    public final void rule__Macro__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1816:1: ( rule__Macro__Group_5__2__Impl rule__Macro__Group_5__3 )
            // InternalKinematicsParser.g:1817:2: rule__Macro__Group_5__2__Impl rule__Macro__Group_5__3
            {
            pushFollow(FOLLOW_12);
            rule__Macro__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Macro__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group_5__2"


    // $ANTLR start "rule__Macro__Group_5__2__Impl"
    // InternalKinematicsParser.g:1824:1: rule__Macro__Group_5__2__Impl : ( ( rule__Macro__BodyAssignment_5_2 ) ) ;
    public final void rule__Macro__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1828:1: ( ( ( rule__Macro__BodyAssignment_5_2 ) ) )
            // InternalKinematicsParser.g:1829:1: ( ( rule__Macro__BodyAssignment_5_2 ) )
            {
            // InternalKinematicsParser.g:1829:1: ( ( rule__Macro__BodyAssignment_5_2 ) )
            // InternalKinematicsParser.g:1830:2: ( rule__Macro__BodyAssignment_5_2 )
            {
             before(grammarAccess.getMacroAccess().getBodyAssignment_5_2()); 
            // InternalKinematicsParser.g:1831:2: ( rule__Macro__BodyAssignment_5_2 )
            // InternalKinematicsParser.g:1831:3: rule__Macro__BodyAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Macro__BodyAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getMacroAccess().getBodyAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group_5__2__Impl"


    // $ANTLR start "rule__Macro__Group_5__3"
    // InternalKinematicsParser.g:1839:1: rule__Macro__Group_5__3 : rule__Macro__Group_5__3__Impl ;
    public final void rule__Macro__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1843:1: ( rule__Macro__Group_5__3__Impl )
            // InternalKinematicsParser.g:1844:2: rule__Macro__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Macro__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group_5__3"


    // $ANTLR start "rule__Macro__Group_5__3__Impl"
    // InternalKinematicsParser.g:1850:1: rule__Macro__Group_5__3__Impl : ( RULE_END ) ;
    public final void rule__Macro__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1854:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:1855:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:1855:1: ( RULE_END )
            // InternalKinematicsParser.g:1856:2: RULE_END
            {
             before(grammarAccess.getMacroAccess().getENDTerminalRuleCall_5_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getMacroAccess().getENDTerminalRuleCall_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group_5__3__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalKinematicsParser.g:1866:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1870:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalKinematicsParser.g:1871:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalKinematicsParser.g:1878:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1882:1: ( ( () ) )
            // InternalKinematicsParser.g:1883:1: ( () )
            {
            // InternalKinematicsParser.g:1883:1: ( () )
            // InternalKinematicsParser.g:1884:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalKinematicsParser.g:1885:2: ()
            // InternalKinematicsParser.g:1885:3: 
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
    // InternalKinematicsParser.g:1893:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1897:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalKinematicsParser.g:1898:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalKinematicsParser.g:1905:1: rule__Parameter__Group__1__Impl : ( HyphenMinus ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1909:1: ( ( HyphenMinus ) )
            // InternalKinematicsParser.g:1910:1: ( HyphenMinus )
            {
            // InternalKinematicsParser.g:1910:1: ( HyphenMinus )
            // InternalKinematicsParser.g:1911:2: HyphenMinus
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
    // InternalKinematicsParser.g:1920:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1924:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalKinematicsParser.g:1925:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalKinematicsParser.g:1932:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__NameAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1936:1: ( ( ( rule__Parameter__NameAssignment_2 ) ) )
            // InternalKinematicsParser.g:1937:1: ( ( rule__Parameter__NameAssignment_2 ) )
            {
            // InternalKinematicsParser.g:1937:1: ( ( rule__Parameter__NameAssignment_2 ) )
            // InternalKinematicsParser.g:1938:2: ( rule__Parameter__NameAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_2()); 
            // InternalKinematicsParser.g:1939:2: ( rule__Parameter__NameAssignment_2 )
            // InternalKinematicsParser.g:1939:3: rule__Parameter__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:1947:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1951:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalKinematicsParser.g:1952:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
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
    // InternalKinematicsParser.g:1959:1: rule__Parameter__Group__3__Impl : ( Colon ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1963:1: ( ( Colon ) )
            // InternalKinematicsParser.g:1964:1: ( Colon )
            {
            // InternalKinematicsParser.g:1964:1: ( Colon )
            // InternalKinematicsParser.g:1965:2: Colon
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_3()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_3()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:1974:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1978:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // InternalKinematicsParser.g:1979:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalKinematicsParser.g:1986:1: rule__Parameter__Group__4__Impl : ( RULE_BEGIN ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:1990:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:1991:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:1991:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:1992:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:2001:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl rule__Parameter__Group__6 ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2005:1: ( rule__Parameter__Group__5__Impl rule__Parameter__Group__6 )
            // InternalKinematicsParser.g:2006:2: rule__Parameter__Group__5__Impl rule__Parameter__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalKinematicsParser.g:2013:1: rule__Parameter__Group__5__Impl : ( Type ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2017:1: ( ( Type ) )
            // InternalKinematicsParser.g:2018:1: ( Type )
            {
            // InternalKinematicsParser.g:2018:1: ( Type )
            // InternalKinematicsParser.g:2019:2: Type
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
    // InternalKinematicsParser.g:2028:1: rule__Parameter__Group__6 : rule__Parameter__Group__6__Impl rule__Parameter__Group__7 ;
    public final void rule__Parameter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2032:1: ( rule__Parameter__Group__6__Impl rule__Parameter__Group__7 )
            // InternalKinematicsParser.g:2033:2: rule__Parameter__Group__6__Impl rule__Parameter__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalKinematicsParser.g:2040:1: rule__Parameter__Group__6__Impl : ( ( rule__Parameter__TypeAssignment_6 ) ) ;
    public final void rule__Parameter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2044:1: ( ( ( rule__Parameter__TypeAssignment_6 ) ) )
            // InternalKinematicsParser.g:2045:1: ( ( rule__Parameter__TypeAssignment_6 ) )
            {
            // InternalKinematicsParser.g:2045:1: ( ( rule__Parameter__TypeAssignment_6 ) )
            // InternalKinematicsParser.g:2046:2: ( rule__Parameter__TypeAssignment_6 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_6()); 
            // InternalKinematicsParser.g:2047:2: ( rule__Parameter__TypeAssignment_6 )
            // InternalKinematicsParser.g:2047:3: rule__Parameter__TypeAssignment_6
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
    // InternalKinematicsParser.g:2055:1: rule__Parameter__Group__7 : rule__Parameter__Group__7__Impl rule__Parameter__Group__8 ;
    public final void rule__Parameter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2059:1: ( rule__Parameter__Group__7__Impl rule__Parameter__Group__8 )
            // InternalKinematicsParser.g:2060:2: rule__Parameter__Group__7__Impl rule__Parameter__Group__8
            {
            pushFollow(FOLLOW_17);
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
    // InternalKinematicsParser.g:2067:1: rule__Parameter__Group__7__Impl : ( ( rule__Parameter__Group_7__0 )? ) ;
    public final void rule__Parameter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2071:1: ( ( ( rule__Parameter__Group_7__0 )? ) )
            // InternalKinematicsParser.g:2072:1: ( ( rule__Parameter__Group_7__0 )? )
            {
            // InternalKinematicsParser.g:2072:1: ( ( rule__Parameter__Group_7__0 )? )
            // InternalKinematicsParser.g:2073:2: ( rule__Parameter__Group_7__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_7()); 
            // InternalKinematicsParser.g:2074:2: ( rule__Parameter__Group_7__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Default) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalKinematicsParser.g:2074:3: rule__Parameter__Group_7__0
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
    // InternalKinematicsParser.g:2082:1: rule__Parameter__Group__8 : rule__Parameter__Group__8__Impl ;
    public final void rule__Parameter__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2086:1: ( rule__Parameter__Group__8__Impl )
            // InternalKinematicsParser.g:2087:2: rule__Parameter__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__8__Impl();

            state._fsp--;


            }

        }
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
    // InternalKinematicsParser.g:2093:1: rule__Parameter__Group__8__Impl : ( RULE_END ) ;
    public final void rule__Parameter__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2097:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:2098:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:2098:1: ( RULE_END )
            // InternalKinematicsParser.g:2099:2: RULE_END
            {
             before(grammarAccess.getParameterAccess().getENDTerminalRuleCall_8()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getENDTerminalRuleCall_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Parameter__Group_7__0"
    // InternalKinematicsParser.g:2109:1: rule__Parameter__Group_7__0 : rule__Parameter__Group_7__0__Impl rule__Parameter__Group_7__1 ;
    public final void rule__Parameter__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2113:1: ( rule__Parameter__Group_7__0__Impl rule__Parameter__Group_7__1 )
            // InternalKinematicsParser.g:2114:2: rule__Parameter__Group_7__0__Impl rule__Parameter__Group_7__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalKinematicsParser.g:2121:1: rule__Parameter__Group_7__0__Impl : ( Default ) ;
    public final void rule__Parameter__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2125:1: ( ( Default ) )
            // InternalKinematicsParser.g:2126:1: ( Default )
            {
            // InternalKinematicsParser.g:2126:1: ( Default )
            // InternalKinematicsParser.g:2127:2: Default
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
    // InternalKinematicsParser.g:2136:1: rule__Parameter__Group_7__1 : rule__Parameter__Group_7__1__Impl ;
    public final void rule__Parameter__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2140:1: ( rule__Parameter__Group_7__1__Impl )
            // InternalKinematicsParser.g:2141:2: rule__Parameter__Group_7__1__Impl
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
    // InternalKinematicsParser.g:2147:1: rule__Parameter__Group_7__1__Impl : ( ( rule__Parameter__ValueAssignment_7_1 ) ) ;
    public final void rule__Parameter__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2151:1: ( ( ( rule__Parameter__ValueAssignment_7_1 ) ) )
            // InternalKinematicsParser.g:2152:1: ( ( rule__Parameter__ValueAssignment_7_1 ) )
            {
            // InternalKinematicsParser.g:2152:1: ( ( rule__Parameter__ValueAssignment_7_1 ) )
            // InternalKinematicsParser.g:2153:2: ( rule__Parameter__ValueAssignment_7_1 )
            {
             before(grammarAccess.getParameterAccess().getValueAssignment_7_1()); 
            // InternalKinematicsParser.g:2154:2: ( rule__Parameter__ValueAssignment_7_1 )
            // InternalKinematicsParser.g:2154:3: rule__Parameter__ValueAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ValueAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getValueAssignment_7_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ParameterString__Group__0"
    // InternalKinematicsParser.g:2163:1: rule__ParameterString__Group__0 : rule__ParameterString__Group__0__Impl rule__ParameterString__Group__1 ;
    public final void rule__ParameterString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2167:1: ( rule__ParameterString__Group__0__Impl rule__ParameterString__Group__1 )
            // InternalKinematicsParser.g:2168:2: rule__ParameterString__Group__0__Impl rule__ParameterString__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ParameterString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterString__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterString__Group__0"


    // $ANTLR start "rule__ParameterString__Group__0__Impl"
    // InternalKinematicsParser.g:2175:1: rule__ParameterString__Group__0__Impl : ( () ) ;
    public final void rule__ParameterString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2179:1: ( ( () ) )
            // InternalKinematicsParser.g:2180:1: ( () )
            {
            // InternalKinematicsParser.g:2180:1: ( () )
            // InternalKinematicsParser.g:2181:2: ()
            {
             before(grammarAccess.getParameterStringAccess().getParameterStringAction_0()); 
            // InternalKinematicsParser.g:2182:2: ()
            // InternalKinematicsParser.g:2182:3: 
            {
            }

             after(grammarAccess.getParameterStringAccess().getParameterStringAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterString__Group__0__Impl"


    // $ANTLR start "rule__ParameterString__Group__1"
    // InternalKinematicsParser.g:2190:1: rule__ParameterString__Group__1 : rule__ParameterString__Group__1__Impl rule__ParameterString__Group__2 ;
    public final void rule__ParameterString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2194:1: ( rule__ParameterString__Group__1__Impl rule__ParameterString__Group__2 )
            // InternalKinematicsParser.g:2195:2: rule__ParameterString__Group__1__Impl rule__ParameterString__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__ParameterString__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterString__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterString__Group__1"


    // $ANTLR start "rule__ParameterString__Group__1__Impl"
    // InternalKinematicsParser.g:2202:1: rule__ParameterString__Group__1__Impl : ( ( rule__ParameterString__RefAssignment_1 )? ) ;
    public final void rule__ParameterString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2206:1: ( ( ( rule__ParameterString__RefAssignment_1 )? ) )
            // InternalKinematicsParser.g:2207:1: ( ( rule__ParameterString__RefAssignment_1 )? )
            {
            // InternalKinematicsParser.g:2207:1: ( ( rule__ParameterString__RefAssignment_1 )? )
            // InternalKinematicsParser.g:2208:2: ( rule__ParameterString__RefAssignment_1 )?
            {
             before(grammarAccess.getParameterStringAccess().getRefAssignment_1()); 
            // InternalKinematicsParser.g:2209:2: ( rule__ParameterString__RefAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalKinematicsParser.g:2209:3: rule__ParameterString__RefAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterString__RefAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterStringAccess().getRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterString__Group__1__Impl"


    // $ANTLR start "rule__ParameterString__Group__2"
    // InternalKinematicsParser.g:2217:1: rule__ParameterString__Group__2 : rule__ParameterString__Group__2__Impl ;
    public final void rule__ParameterString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2221:1: ( rule__ParameterString__Group__2__Impl )
            // InternalKinematicsParser.g:2222:2: rule__ParameterString__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterString__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterString__Group__2"


    // $ANTLR start "rule__ParameterString__Group__2__Impl"
    // InternalKinematicsParser.g:2228:1: rule__ParameterString__Group__2__Impl : ( ( rule__ParameterString__ValueAssignment_2 )? ) ;
    public final void rule__ParameterString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2232:1: ( ( ( rule__ParameterString__ValueAssignment_2 )? ) )
            // InternalKinematicsParser.g:2233:1: ( ( rule__ParameterString__ValueAssignment_2 )? )
            {
            // InternalKinematicsParser.g:2233:1: ( ( rule__ParameterString__ValueAssignment_2 )? )
            // InternalKinematicsParser.g:2234:2: ( rule__ParameterString__ValueAssignment_2 )?
            {
             before(grammarAccess.getParameterStringAccess().getValueAssignment_2()); 
            // InternalKinematicsParser.g:2235:2: ( rule__ParameterString__ValueAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalKinematicsParser.g:2235:3: rule__ParameterString__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterString__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterStringAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterString__Group__2__Impl"


    // $ANTLR start "rule__ParameterStringType__Group__0"
    // InternalKinematicsParser.g:2244:1: rule__ParameterStringType__Group__0 : rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1 ;
    public final void rule__ParameterStringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2248:1: ( rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1 )
            // InternalKinematicsParser.g:2249:2: rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ParameterStringType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStringType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group__0"


    // $ANTLR start "rule__ParameterStringType__Group__0__Impl"
    // InternalKinematicsParser.g:2256:1: rule__ParameterStringType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterStringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2260:1: ( ( () ) )
            // InternalKinematicsParser.g:2261:1: ( () )
            {
            // InternalKinematicsParser.g:2261:1: ( () )
            // InternalKinematicsParser.g:2262:2: ()
            {
             before(grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0()); 
            // InternalKinematicsParser.g:2263:2: ()
            // InternalKinematicsParser.g:2263:3: 
            {
            }

             after(grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group__0__Impl"


    // $ANTLR start "rule__ParameterStringType__Group__1"
    // InternalKinematicsParser.g:2271:1: rule__ParameterStringType__Group__1 : rule__ParameterStringType__Group__1__Impl ;
    public final void rule__ParameterStringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2275:1: ( rule__ParameterStringType__Group__1__Impl )
            // InternalKinematicsParser.g:2276:2: rule__ParameterStringType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStringType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group__1"


    // $ANTLR start "rule__ParameterStringType__Group__1__Impl"
    // InternalKinematicsParser.g:2282:1: rule__ParameterStringType__Group__1__Impl : ( String ) ;
    public final void rule__ParameterStringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2286:1: ( ( String ) )
            // InternalKinematicsParser.g:2287:1: ( String )
            {
            // InternalKinematicsParser.g:2287:1: ( String )
            // InternalKinematicsParser.g:2288:2: String
            {
             before(grammarAccess.getParameterStringTypeAccess().getStringKeyword_1()); 
            match(input,String,FOLLOW_2); 
             after(grammarAccess.getParameterStringTypeAccess().getStringKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group__1__Impl"


    // $ANTLR start "rule__ParameterLinkRefType__Group__0"
    // InternalKinematicsParser.g:2298:1: rule__ParameterLinkRefType__Group__0 : rule__ParameterLinkRefType__Group__0__Impl rule__ParameterLinkRefType__Group__1 ;
    public final void rule__ParameterLinkRefType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2302:1: ( rule__ParameterLinkRefType__Group__0__Impl rule__ParameterLinkRefType__Group__1 )
            // InternalKinematicsParser.g:2303:2: rule__ParameterLinkRefType__Group__0__Impl rule__ParameterLinkRefType__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ParameterLinkRefType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterLinkRefType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterLinkRefType__Group__0"


    // $ANTLR start "rule__ParameterLinkRefType__Group__0__Impl"
    // InternalKinematicsParser.g:2310:1: rule__ParameterLinkRefType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterLinkRefType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2314:1: ( ( () ) )
            // InternalKinematicsParser.g:2315:1: ( () )
            {
            // InternalKinematicsParser.g:2315:1: ( () )
            // InternalKinematicsParser.g:2316:2: ()
            {
             before(grammarAccess.getParameterLinkRefTypeAccess().getParameterLinkRefTypeAction_0()); 
            // InternalKinematicsParser.g:2317:2: ()
            // InternalKinematicsParser.g:2317:3: 
            {
            }

             after(grammarAccess.getParameterLinkRefTypeAccess().getParameterLinkRefTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterLinkRefType__Group__0__Impl"


    // $ANTLR start "rule__ParameterLinkRefType__Group__1"
    // InternalKinematicsParser.g:2325:1: rule__ParameterLinkRefType__Group__1 : rule__ParameterLinkRefType__Group__1__Impl ;
    public final void rule__ParameterLinkRefType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2329:1: ( rule__ParameterLinkRefType__Group__1__Impl )
            // InternalKinematicsParser.g:2330:2: rule__ParameterLinkRefType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterLinkRefType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterLinkRefType__Group__1"


    // $ANTLR start "rule__ParameterLinkRefType__Group__1__Impl"
    // InternalKinematicsParser.g:2336:1: rule__ParameterLinkRefType__Group__1__Impl : ( LinkRef ) ;
    public final void rule__ParameterLinkRefType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2340:1: ( ( LinkRef ) )
            // InternalKinematicsParser.g:2341:1: ( LinkRef )
            {
            // InternalKinematicsParser.g:2341:1: ( LinkRef )
            // InternalKinematicsParser.g:2342:2: LinkRef
            {
             before(grammarAccess.getParameterLinkRefTypeAccess().getLinkRefKeyword_1()); 
            match(input,LinkRef,FOLLOW_2); 
             after(grammarAccess.getParameterLinkRefTypeAccess().getLinkRefKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterLinkRefType__Group__1__Impl"


    // $ANTLR start "rule__ParameterPoseType__Group__0"
    // InternalKinematicsParser.g:2352:1: rule__ParameterPoseType__Group__0 : rule__ParameterPoseType__Group__0__Impl rule__ParameterPoseType__Group__1 ;
    public final void rule__ParameterPoseType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2356:1: ( rule__ParameterPoseType__Group__0__Impl rule__ParameterPoseType__Group__1 )
            // InternalKinematicsParser.g:2357:2: rule__ParameterPoseType__Group__0__Impl rule__ParameterPoseType__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ParameterPoseType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterPoseType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPoseType__Group__0"


    // $ANTLR start "rule__ParameterPoseType__Group__0__Impl"
    // InternalKinematicsParser.g:2364:1: rule__ParameterPoseType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterPoseType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2368:1: ( ( () ) )
            // InternalKinematicsParser.g:2369:1: ( () )
            {
            // InternalKinematicsParser.g:2369:1: ( () )
            // InternalKinematicsParser.g:2370:2: ()
            {
             before(grammarAccess.getParameterPoseTypeAccess().getParameterPoseTypeAction_0()); 
            // InternalKinematicsParser.g:2371:2: ()
            // InternalKinematicsParser.g:2371:3: 
            {
            }

             after(grammarAccess.getParameterPoseTypeAccess().getParameterPoseTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPoseType__Group__0__Impl"


    // $ANTLR start "rule__ParameterPoseType__Group__1"
    // InternalKinematicsParser.g:2379:1: rule__ParameterPoseType__Group__1 : rule__ParameterPoseType__Group__1__Impl ;
    public final void rule__ParameterPoseType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2383:1: ( rule__ParameterPoseType__Group__1__Impl )
            // InternalKinematicsParser.g:2384:2: rule__ParameterPoseType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterPoseType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPoseType__Group__1"


    // $ANTLR start "rule__ParameterPoseType__Group__1__Impl"
    // InternalKinematicsParser.g:2390:1: rule__ParameterPoseType__Group__1__Impl : ( Pose ) ;
    public final void rule__ParameterPoseType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2394:1: ( ( Pose ) )
            // InternalKinematicsParser.g:2395:1: ( Pose )
            {
            // InternalKinematicsParser.g:2395:1: ( Pose )
            // InternalKinematicsParser.g:2396:2: Pose
            {
             before(grammarAccess.getParameterPoseTypeAccess().getPoseKeyword_1()); 
            match(input,Pose,FOLLOW_2); 
             after(grammarAccess.getParameterPoseTypeAccess().getPoseKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPoseType__Group__1__Impl"


    // $ANTLR start "rule__Body__Group__0"
    // InternalKinematicsParser.g:2406:1: rule__Body__Group__0 : rule__Body__Group__0__Impl rule__Body__Group__1 ;
    public final void rule__Body__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2410:1: ( rule__Body__Group__0__Impl rule__Body__Group__1 )
            // InternalKinematicsParser.g:2411:2: rule__Body__Group__0__Impl rule__Body__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Body__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__0"


    // $ANTLR start "rule__Body__Group__0__Impl"
    // InternalKinematicsParser.g:2418:1: rule__Body__Group__0__Impl : ( () ) ;
    public final void rule__Body__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2422:1: ( ( () ) )
            // InternalKinematicsParser.g:2423:1: ( () )
            {
            // InternalKinematicsParser.g:2423:1: ( () )
            // InternalKinematicsParser.g:2424:2: ()
            {
             before(grammarAccess.getBodyAccess().getBodyAction_0()); 
            // InternalKinematicsParser.g:2425:2: ()
            // InternalKinematicsParser.g:2425:3: 
            {
            }

             after(grammarAccess.getBodyAccess().getBodyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__0__Impl"


    // $ANTLR start "rule__Body__Group__1"
    // InternalKinematicsParser.g:2433:1: rule__Body__Group__1 : rule__Body__Group__1__Impl rule__Body__Group__2 ;
    public final void rule__Body__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2437:1: ( rule__Body__Group__1__Impl rule__Body__Group__2 )
            // InternalKinematicsParser.g:2438:2: rule__Body__Group__1__Impl rule__Body__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Body__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__1"


    // $ANTLR start "rule__Body__Group__1__Impl"
    // InternalKinematicsParser.g:2445:1: rule__Body__Group__1__Impl : ( ( rule__Body__Group_1__0 )? ) ;
    public final void rule__Body__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2449:1: ( ( ( rule__Body__Group_1__0 )? ) )
            // InternalKinematicsParser.g:2450:1: ( ( rule__Body__Group_1__0 )? )
            {
            // InternalKinematicsParser.g:2450:1: ( ( rule__Body__Group_1__0 )? )
            // InternalKinematicsParser.g:2451:2: ( rule__Body__Group_1__0 )?
            {
             before(grammarAccess.getBodyAccess().getGroup_1()); 
            // InternalKinematicsParser.g:2452:2: ( rule__Body__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Links) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalKinematicsParser.g:2452:3: rule__Body__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Body__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBodyAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__1__Impl"


    // $ANTLR start "rule__Body__Group__2"
    // InternalKinematicsParser.g:2460:1: rule__Body__Group__2 : rule__Body__Group__2__Impl ;
    public final void rule__Body__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2464:1: ( rule__Body__Group__2__Impl )
            // InternalKinematicsParser.g:2465:2: rule__Body__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Body__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__2"


    // $ANTLR start "rule__Body__Group__2__Impl"
    // InternalKinematicsParser.g:2471:1: rule__Body__Group__2__Impl : ( ( rule__Body__Group_2__0 )? ) ;
    public final void rule__Body__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2475:1: ( ( ( rule__Body__Group_2__0 )? ) )
            // InternalKinematicsParser.g:2476:1: ( ( rule__Body__Group_2__0 )? )
            {
            // InternalKinematicsParser.g:2476:1: ( ( rule__Body__Group_2__0 )? )
            // InternalKinematicsParser.g:2477:2: ( rule__Body__Group_2__0 )?
            {
             before(grammarAccess.getBodyAccess().getGroup_2()); 
            // InternalKinematicsParser.g:2478:2: ( rule__Body__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Joints) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalKinematicsParser.g:2478:3: rule__Body__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Body__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBodyAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__2__Impl"


    // $ANTLR start "rule__Body__Group_1__0"
    // InternalKinematicsParser.g:2487:1: rule__Body__Group_1__0 : rule__Body__Group_1__0__Impl rule__Body__Group_1__1 ;
    public final void rule__Body__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2491:1: ( rule__Body__Group_1__0__Impl rule__Body__Group_1__1 )
            // InternalKinematicsParser.g:2492:2: rule__Body__Group_1__0__Impl rule__Body__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Body__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_1__0"


    // $ANTLR start "rule__Body__Group_1__0__Impl"
    // InternalKinematicsParser.g:2499:1: rule__Body__Group_1__0__Impl : ( Links ) ;
    public final void rule__Body__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2503:1: ( ( Links ) )
            // InternalKinematicsParser.g:2504:1: ( Links )
            {
            // InternalKinematicsParser.g:2504:1: ( Links )
            // InternalKinematicsParser.g:2505:2: Links
            {
             before(grammarAccess.getBodyAccess().getLinksKeyword_1_0()); 
            match(input,Links,FOLLOW_2); 
             after(grammarAccess.getBodyAccess().getLinksKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_1__0__Impl"


    // $ANTLR start "rule__Body__Group_1__1"
    // InternalKinematicsParser.g:2514:1: rule__Body__Group_1__1 : rule__Body__Group_1__1__Impl ;
    public final void rule__Body__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2518:1: ( rule__Body__Group_1__1__Impl )
            // InternalKinematicsParser.g:2519:2: rule__Body__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Body__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_1__1"


    // $ANTLR start "rule__Body__Group_1__1__Impl"
    // InternalKinematicsParser.g:2525:1: rule__Body__Group_1__1__Impl : ( ( rule__Body__LinkAssignment_1_1 )* ) ;
    public final void rule__Body__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2529:1: ( ( ( rule__Body__LinkAssignment_1_1 )* ) )
            // InternalKinematicsParser.g:2530:1: ( ( rule__Body__LinkAssignment_1_1 )* )
            {
            // InternalKinematicsParser.g:2530:1: ( ( rule__Body__LinkAssignment_1_1 )* )
            // InternalKinematicsParser.g:2531:2: ( rule__Body__LinkAssignment_1_1 )*
            {
             before(grammarAccess.getBodyAccess().getLinkAssignment_1_1()); 
            // InternalKinematicsParser.g:2532:2: ( rule__Body__LinkAssignment_1_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==HyphenMinus) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKinematicsParser.g:2532:3: rule__Body__LinkAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Body__LinkAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getBodyAccess().getLinkAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_1__1__Impl"


    // $ANTLR start "rule__Body__Group_2__0"
    // InternalKinematicsParser.g:2541:1: rule__Body__Group_2__0 : rule__Body__Group_2__0__Impl rule__Body__Group_2__1 ;
    public final void rule__Body__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2545:1: ( rule__Body__Group_2__0__Impl rule__Body__Group_2__1 )
            // InternalKinematicsParser.g:2546:2: rule__Body__Group_2__0__Impl rule__Body__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Body__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_2__0"


    // $ANTLR start "rule__Body__Group_2__0__Impl"
    // InternalKinematicsParser.g:2553:1: rule__Body__Group_2__0__Impl : ( Joints ) ;
    public final void rule__Body__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2557:1: ( ( Joints ) )
            // InternalKinematicsParser.g:2558:1: ( Joints )
            {
            // InternalKinematicsParser.g:2558:1: ( Joints )
            // InternalKinematicsParser.g:2559:2: Joints
            {
             before(grammarAccess.getBodyAccess().getJointsKeyword_2_0()); 
            match(input,Joints,FOLLOW_2); 
             after(grammarAccess.getBodyAccess().getJointsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_2__0__Impl"


    // $ANTLR start "rule__Body__Group_2__1"
    // InternalKinematicsParser.g:2568:1: rule__Body__Group_2__1 : rule__Body__Group_2__1__Impl ;
    public final void rule__Body__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2572:1: ( rule__Body__Group_2__1__Impl )
            // InternalKinematicsParser.g:2573:2: rule__Body__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Body__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_2__1"


    // $ANTLR start "rule__Body__Group_2__1__Impl"
    // InternalKinematicsParser.g:2579:1: rule__Body__Group_2__1__Impl : ( ( rule__Body__JointAssignment_2_1 )* ) ;
    public final void rule__Body__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2583:1: ( ( ( rule__Body__JointAssignment_2_1 )* ) )
            // InternalKinematicsParser.g:2584:1: ( ( rule__Body__JointAssignment_2_1 )* )
            {
            // InternalKinematicsParser.g:2584:1: ( ( rule__Body__JointAssignment_2_1 )* )
            // InternalKinematicsParser.g:2585:2: ( rule__Body__JointAssignment_2_1 )*
            {
             before(grammarAccess.getBodyAccess().getJointAssignment_2_1()); 
            // InternalKinematicsParser.g:2586:2: ( rule__Body__JointAssignment_2_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==HyphenMinus) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKinematicsParser.g:2586:3: rule__Body__JointAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Body__JointAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getBodyAccess().getJointAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_2__1__Impl"


    // $ANTLR start "rule__MacroCall__Group__0"
    // InternalKinematicsParser.g:2595:1: rule__MacroCall__Group__0 : rule__MacroCall__Group__0__Impl rule__MacroCall__Group__1 ;
    public final void rule__MacroCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2599:1: ( rule__MacroCall__Group__0__Impl rule__MacroCall__Group__1 )
            // InternalKinematicsParser.g:2600:2: rule__MacroCall__Group__0__Impl rule__MacroCall__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MacroCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MacroCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group__0"


    // $ANTLR start "rule__MacroCall__Group__0__Impl"
    // InternalKinematicsParser.g:2607:1: rule__MacroCall__Group__0__Impl : ( () ) ;
    public final void rule__MacroCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2611:1: ( ( () ) )
            // InternalKinematicsParser.g:2612:1: ( () )
            {
            // InternalKinematicsParser.g:2612:1: ( () )
            // InternalKinematicsParser.g:2613:2: ()
            {
             before(grammarAccess.getMacroCallAccess().getMacroCallAction_0()); 
            // InternalKinematicsParser.g:2614:2: ()
            // InternalKinematicsParser.g:2614:3: 
            {
            }

             after(grammarAccess.getMacroCallAccess().getMacroCallAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group__0__Impl"


    // $ANTLR start "rule__MacroCall__Group__1"
    // InternalKinematicsParser.g:2622:1: rule__MacroCall__Group__1 : rule__MacroCall__Group__1__Impl rule__MacroCall__Group__2 ;
    public final void rule__MacroCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2626:1: ( rule__MacroCall__Group__1__Impl rule__MacroCall__Group__2 )
            // InternalKinematicsParser.g:2627:2: rule__MacroCall__Group__1__Impl rule__MacroCall__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__MacroCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MacroCall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group__1"


    // $ANTLR start "rule__MacroCall__Group__1__Impl"
    // InternalKinematicsParser.g:2634:1: rule__MacroCall__Group__1__Impl : ( HyphenMinus ) ;
    public final void rule__MacroCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2638:1: ( ( HyphenMinus ) )
            // InternalKinematicsParser.g:2639:1: ( HyphenMinus )
            {
            // InternalKinematicsParser.g:2639:1: ( HyphenMinus )
            // InternalKinematicsParser.g:2640:2: HyphenMinus
            {
             before(grammarAccess.getMacroCallAccess().getHyphenMinusKeyword_1()); 
            match(input,HyphenMinus,FOLLOW_2); 
             after(grammarAccess.getMacroCallAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group__1__Impl"


    // $ANTLR start "rule__MacroCall__Group__2"
    // InternalKinematicsParser.g:2649:1: rule__MacroCall__Group__2 : rule__MacroCall__Group__2__Impl rule__MacroCall__Group__3 ;
    public final void rule__MacroCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2653:1: ( rule__MacroCall__Group__2__Impl rule__MacroCall__Group__3 )
            // InternalKinematicsParser.g:2654:2: rule__MacroCall__Group__2__Impl rule__MacroCall__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__MacroCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MacroCall__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group__2"


    // $ANTLR start "rule__MacroCall__Group__2__Impl"
    // InternalKinematicsParser.g:2661:1: rule__MacroCall__Group__2__Impl : ( ( rule__MacroCall__MacroAssignment_2 ) ) ;
    public final void rule__MacroCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2665:1: ( ( ( rule__MacroCall__MacroAssignment_2 ) ) )
            // InternalKinematicsParser.g:2666:1: ( ( rule__MacroCall__MacroAssignment_2 ) )
            {
            // InternalKinematicsParser.g:2666:1: ( ( rule__MacroCall__MacroAssignment_2 ) )
            // InternalKinematicsParser.g:2667:2: ( rule__MacroCall__MacroAssignment_2 )
            {
             before(grammarAccess.getMacroCallAccess().getMacroAssignment_2()); 
            // InternalKinematicsParser.g:2668:2: ( rule__MacroCall__MacroAssignment_2 )
            // InternalKinematicsParser.g:2668:3: rule__MacroCall__MacroAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MacroCall__MacroAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMacroCallAccess().getMacroAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group__2__Impl"


    // $ANTLR start "rule__MacroCall__Group__3"
    // InternalKinematicsParser.g:2676:1: rule__MacroCall__Group__3 : rule__MacroCall__Group__3__Impl rule__MacroCall__Group__4 ;
    public final void rule__MacroCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2680:1: ( rule__MacroCall__Group__3__Impl rule__MacroCall__Group__4 )
            // InternalKinematicsParser.g:2681:2: rule__MacroCall__Group__3__Impl rule__MacroCall__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__MacroCall__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MacroCall__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group__3"


    // $ANTLR start "rule__MacroCall__Group__3__Impl"
    // InternalKinematicsParser.g:2688:1: rule__MacroCall__Group__3__Impl : ( Colon ) ;
    public final void rule__MacroCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2692:1: ( ( Colon ) )
            // InternalKinematicsParser.g:2693:1: ( Colon )
            {
            // InternalKinematicsParser.g:2693:1: ( Colon )
            // InternalKinematicsParser.g:2694:2: Colon
            {
             before(grammarAccess.getMacroCallAccess().getColonKeyword_3()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getMacroCallAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group__3__Impl"


    // $ANTLR start "rule__MacroCall__Group__4"
    // InternalKinematicsParser.g:2703:1: rule__MacroCall__Group__4 : rule__MacroCall__Group__4__Impl rule__MacroCall__Group__5 ;
    public final void rule__MacroCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2707:1: ( rule__MacroCall__Group__4__Impl rule__MacroCall__Group__5 )
            // InternalKinematicsParser.g:2708:2: rule__MacroCall__Group__4__Impl rule__MacroCall__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__MacroCall__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MacroCall__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group__4"


    // $ANTLR start "rule__MacroCall__Group__4__Impl"
    // InternalKinematicsParser.g:2715:1: rule__MacroCall__Group__4__Impl : ( RULE_BEGIN ) ;
    public final void rule__MacroCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2719:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:2720:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:2720:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:2721:2: RULE_BEGIN
            {
             before(grammarAccess.getMacroCallAccess().getBEGINTerminalRuleCall_4()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getMacroCallAccess().getBEGINTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group__4__Impl"


    // $ANTLR start "rule__MacroCall__Group__5"
    // InternalKinematicsParser.g:2730:1: rule__MacroCall__Group__5 : rule__MacroCall__Group__5__Impl rule__MacroCall__Group__6 ;
    public final void rule__MacroCall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2734:1: ( rule__MacroCall__Group__5__Impl rule__MacroCall__Group__6 )
            // InternalKinematicsParser.g:2735:2: rule__MacroCall__Group__5__Impl rule__MacroCall__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__MacroCall__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MacroCall__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group__5"


    // $ANTLR start "rule__MacroCall__Group__5__Impl"
    // InternalKinematicsParser.g:2742:1: rule__MacroCall__Group__5__Impl : ( ( rule__MacroCall__ParameterCallAssignment_5 )* ) ;
    public final void rule__MacroCall__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2746:1: ( ( ( rule__MacroCall__ParameterCallAssignment_5 )* ) )
            // InternalKinematicsParser.g:2747:1: ( ( rule__MacroCall__ParameterCallAssignment_5 )* )
            {
            // InternalKinematicsParser.g:2747:1: ( ( rule__MacroCall__ParameterCallAssignment_5 )* )
            // InternalKinematicsParser.g:2748:2: ( rule__MacroCall__ParameterCallAssignment_5 )*
            {
             before(grammarAccess.getMacroCallAccess().getParameterCallAssignment_5()); 
            // InternalKinematicsParser.g:2749:2: ( rule__MacroCall__ParameterCallAssignment_5 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==HyphenMinus) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKinematicsParser.g:2749:3: rule__MacroCall__ParameterCallAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__MacroCall__ParameterCallAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getMacroCallAccess().getParameterCallAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group__5__Impl"


    // $ANTLR start "rule__MacroCall__Group__6"
    // InternalKinematicsParser.g:2757:1: rule__MacroCall__Group__6 : rule__MacroCall__Group__6__Impl ;
    public final void rule__MacroCall__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2761:1: ( rule__MacroCall__Group__6__Impl )
            // InternalKinematicsParser.g:2762:2: rule__MacroCall__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MacroCall__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group__6"


    // $ANTLR start "rule__MacroCall__Group__6__Impl"
    // InternalKinematicsParser.g:2768:1: rule__MacroCall__Group__6__Impl : ( RULE_END ) ;
    public final void rule__MacroCall__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2772:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:2773:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:2773:1: ( RULE_END )
            // InternalKinematicsParser.g:2774:2: RULE_END
            {
             before(grammarAccess.getMacroCallAccess().getENDTerminalRuleCall_6()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getMacroCallAccess().getENDTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group__6__Impl"


    // $ANTLR start "rule__ParameterCall__Group__0"
    // InternalKinematicsParser.g:2784:1: rule__ParameterCall__Group__0 : rule__ParameterCall__Group__0__Impl rule__ParameterCall__Group__1 ;
    public final void rule__ParameterCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2788:1: ( rule__ParameterCall__Group__0__Impl rule__ParameterCall__Group__1 )
            // InternalKinematicsParser.g:2789:2: rule__ParameterCall__Group__0__Impl rule__ParameterCall__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ParameterCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterCall__Group__0"


    // $ANTLR start "rule__ParameterCall__Group__0__Impl"
    // InternalKinematicsParser.g:2796:1: rule__ParameterCall__Group__0__Impl : ( () ) ;
    public final void rule__ParameterCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2800:1: ( ( () ) )
            // InternalKinematicsParser.g:2801:1: ( () )
            {
            // InternalKinematicsParser.g:2801:1: ( () )
            // InternalKinematicsParser.g:2802:2: ()
            {
             before(grammarAccess.getParameterCallAccess().getParameterCallAction_0()); 
            // InternalKinematicsParser.g:2803:2: ()
            // InternalKinematicsParser.g:2803:3: 
            {
            }

             after(grammarAccess.getParameterCallAccess().getParameterCallAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterCall__Group__0__Impl"


    // $ANTLR start "rule__ParameterCall__Group__1"
    // InternalKinematicsParser.g:2811:1: rule__ParameterCall__Group__1 : rule__ParameterCall__Group__1__Impl rule__ParameterCall__Group__2 ;
    public final void rule__ParameterCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2815:1: ( rule__ParameterCall__Group__1__Impl rule__ParameterCall__Group__2 )
            // InternalKinematicsParser.g:2816:2: rule__ParameterCall__Group__1__Impl rule__ParameterCall__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ParameterCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterCall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterCall__Group__1"


    // $ANTLR start "rule__ParameterCall__Group__1__Impl"
    // InternalKinematicsParser.g:2823:1: rule__ParameterCall__Group__1__Impl : ( HyphenMinus ) ;
    public final void rule__ParameterCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2827:1: ( ( HyphenMinus ) )
            // InternalKinematicsParser.g:2828:1: ( HyphenMinus )
            {
            // InternalKinematicsParser.g:2828:1: ( HyphenMinus )
            // InternalKinematicsParser.g:2829:2: HyphenMinus
            {
             before(grammarAccess.getParameterCallAccess().getHyphenMinusKeyword_1()); 
            match(input,HyphenMinus,FOLLOW_2); 
             after(grammarAccess.getParameterCallAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterCall__Group__1__Impl"


    // $ANTLR start "rule__ParameterCall__Group__2"
    // InternalKinematicsParser.g:2838:1: rule__ParameterCall__Group__2 : rule__ParameterCall__Group__2__Impl rule__ParameterCall__Group__3 ;
    public final void rule__ParameterCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2842:1: ( rule__ParameterCall__Group__2__Impl rule__ParameterCall__Group__3 )
            // InternalKinematicsParser.g:2843:2: rule__ParameterCall__Group__2__Impl rule__ParameterCall__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ParameterCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterCall__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterCall__Group__2"


    // $ANTLR start "rule__ParameterCall__Group__2__Impl"
    // InternalKinematicsParser.g:2850:1: rule__ParameterCall__Group__2__Impl : ( ( rule__ParameterCall__ParameterAssignment_2 ) ) ;
    public final void rule__ParameterCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2854:1: ( ( ( rule__ParameterCall__ParameterAssignment_2 ) ) )
            // InternalKinematicsParser.g:2855:1: ( ( rule__ParameterCall__ParameterAssignment_2 ) )
            {
            // InternalKinematicsParser.g:2855:1: ( ( rule__ParameterCall__ParameterAssignment_2 ) )
            // InternalKinematicsParser.g:2856:2: ( rule__ParameterCall__ParameterAssignment_2 )
            {
             before(grammarAccess.getParameterCallAccess().getParameterAssignment_2()); 
            // InternalKinematicsParser.g:2857:2: ( rule__ParameterCall__ParameterAssignment_2 )
            // InternalKinematicsParser.g:2857:3: rule__ParameterCall__ParameterAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ParameterCall__ParameterAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterCallAccess().getParameterAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterCall__Group__2__Impl"


    // $ANTLR start "rule__ParameterCall__Group__3"
    // InternalKinematicsParser.g:2865:1: rule__ParameterCall__Group__3 : rule__ParameterCall__Group__3__Impl rule__ParameterCall__Group__4 ;
    public final void rule__ParameterCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2869:1: ( rule__ParameterCall__Group__3__Impl rule__ParameterCall__Group__4 )
            // InternalKinematicsParser.g:2870:2: rule__ParameterCall__Group__3__Impl rule__ParameterCall__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__ParameterCall__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterCall__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterCall__Group__3"


    // $ANTLR start "rule__ParameterCall__Group__3__Impl"
    // InternalKinematicsParser.g:2877:1: rule__ParameterCall__Group__3__Impl : ( Colon ) ;
    public final void rule__ParameterCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2881:1: ( ( Colon ) )
            // InternalKinematicsParser.g:2882:1: ( Colon )
            {
            // InternalKinematicsParser.g:2882:1: ( Colon )
            // InternalKinematicsParser.g:2883:2: Colon
            {
             before(grammarAccess.getParameterCallAccess().getColonKeyword_3()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getParameterCallAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterCall__Group__3__Impl"


    // $ANTLR start "rule__ParameterCall__Group__4"
    // InternalKinematicsParser.g:2892:1: rule__ParameterCall__Group__4 : rule__ParameterCall__Group__4__Impl rule__ParameterCall__Group__5 ;
    public final void rule__ParameterCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2896:1: ( rule__ParameterCall__Group__4__Impl rule__ParameterCall__Group__5 )
            // InternalKinematicsParser.g:2897:2: rule__ParameterCall__Group__4__Impl rule__ParameterCall__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__ParameterCall__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterCall__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterCall__Group__4"


    // $ANTLR start "rule__ParameterCall__Group__4__Impl"
    // InternalKinematicsParser.g:2904:1: rule__ParameterCall__Group__4__Impl : ( RULE_BEGIN ) ;
    public final void rule__ParameterCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2908:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:2909:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:2909:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:2910:2: RULE_BEGIN
            {
             before(grammarAccess.getParameterCallAccess().getBEGINTerminalRuleCall_4()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getParameterCallAccess().getBEGINTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterCall__Group__4__Impl"


    // $ANTLR start "rule__ParameterCall__Group__5"
    // InternalKinematicsParser.g:2919:1: rule__ParameterCall__Group__5 : rule__ParameterCall__Group__5__Impl rule__ParameterCall__Group__6 ;
    public final void rule__ParameterCall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2923:1: ( rule__ParameterCall__Group__5__Impl rule__ParameterCall__Group__6 )
            // InternalKinematicsParser.g:2924:2: rule__ParameterCall__Group__5__Impl rule__ParameterCall__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__ParameterCall__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterCall__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterCall__Group__5"


    // $ANTLR start "rule__ParameterCall__Group__5__Impl"
    // InternalKinematicsParser.g:2931:1: rule__ParameterCall__Group__5__Impl : ( Value ) ;
    public final void rule__ParameterCall__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2935:1: ( ( Value ) )
            // InternalKinematicsParser.g:2936:1: ( Value )
            {
            // InternalKinematicsParser.g:2936:1: ( Value )
            // InternalKinematicsParser.g:2937:2: Value
            {
             before(grammarAccess.getParameterCallAccess().getValueKeyword_5()); 
            match(input,Value,FOLLOW_2); 
             after(grammarAccess.getParameterCallAccess().getValueKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterCall__Group__5__Impl"


    // $ANTLR start "rule__ParameterCall__Group__6"
    // InternalKinematicsParser.g:2946:1: rule__ParameterCall__Group__6 : rule__ParameterCall__Group__6__Impl rule__ParameterCall__Group__7 ;
    public final void rule__ParameterCall__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2950:1: ( rule__ParameterCall__Group__6__Impl rule__ParameterCall__Group__7 )
            // InternalKinematicsParser.g:2951:2: rule__ParameterCall__Group__6__Impl rule__ParameterCall__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__ParameterCall__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterCall__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterCall__Group__6"


    // $ANTLR start "rule__ParameterCall__Group__6__Impl"
    // InternalKinematicsParser.g:2958:1: rule__ParameterCall__Group__6__Impl : ( ( rule__ParameterCall__ValueAssignment_6 ) ) ;
    public final void rule__ParameterCall__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2962:1: ( ( ( rule__ParameterCall__ValueAssignment_6 ) ) )
            // InternalKinematicsParser.g:2963:1: ( ( rule__ParameterCall__ValueAssignment_6 ) )
            {
            // InternalKinematicsParser.g:2963:1: ( ( rule__ParameterCall__ValueAssignment_6 ) )
            // InternalKinematicsParser.g:2964:2: ( rule__ParameterCall__ValueAssignment_6 )
            {
             before(grammarAccess.getParameterCallAccess().getValueAssignment_6()); 
            // InternalKinematicsParser.g:2965:2: ( rule__ParameterCall__ValueAssignment_6 )
            // InternalKinematicsParser.g:2965:3: rule__ParameterCall__ValueAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ParameterCall__ValueAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getParameterCallAccess().getValueAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterCall__Group__6__Impl"


    // $ANTLR start "rule__ParameterCall__Group__7"
    // InternalKinematicsParser.g:2973:1: rule__ParameterCall__Group__7 : rule__ParameterCall__Group__7__Impl ;
    public final void rule__ParameterCall__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2977:1: ( rule__ParameterCall__Group__7__Impl )
            // InternalKinematicsParser.g:2978:2: rule__ParameterCall__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterCall__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterCall__Group__7"


    // $ANTLR start "rule__ParameterCall__Group__7__Impl"
    // InternalKinematicsParser.g:2984:1: rule__ParameterCall__Group__7__Impl : ( RULE_END ) ;
    public final void rule__ParameterCall__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:2988:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:2989:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:2989:1: ( RULE_END )
            // InternalKinematicsParser.g:2990:2: RULE_END
            {
             before(grammarAccess.getParameterCallAccess().getENDTerminalRuleCall_7()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getParameterCallAccess().getENDTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterCall__Group__7__Impl"


    // $ANTLR start "rule__Joint__Group__0"
    // InternalKinematicsParser.g:3000:1: rule__Joint__Group__0 : rule__Joint__Group__0__Impl rule__Joint__Group__1 ;
    public final void rule__Joint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3004:1: ( rule__Joint__Group__0__Impl rule__Joint__Group__1 )
            // InternalKinematicsParser.g:3005:2: rule__Joint__Group__0__Impl rule__Joint__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalKinematicsParser.g:3012:1: rule__Joint__Group__0__Impl : ( HyphenMinus ) ;
    public final void rule__Joint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3016:1: ( ( HyphenMinus ) )
            // InternalKinematicsParser.g:3017:1: ( HyphenMinus )
            {
            // InternalKinematicsParser.g:3017:1: ( HyphenMinus )
            // InternalKinematicsParser.g:3018:2: HyphenMinus
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
    // InternalKinematicsParser.g:3027:1: rule__Joint__Group__1 : rule__Joint__Group__1__Impl rule__Joint__Group__2 ;
    public final void rule__Joint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3031:1: ( rule__Joint__Group__1__Impl rule__Joint__Group__2 )
            // InternalKinematicsParser.g:3032:2: rule__Joint__Group__1__Impl rule__Joint__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalKinematicsParser.g:3039:1: rule__Joint__Group__1__Impl : ( ( rule__Joint__NameAssignment_1 ) ) ;
    public final void rule__Joint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3043:1: ( ( ( rule__Joint__NameAssignment_1 ) ) )
            // InternalKinematicsParser.g:3044:1: ( ( rule__Joint__NameAssignment_1 ) )
            {
            // InternalKinematicsParser.g:3044:1: ( ( rule__Joint__NameAssignment_1 ) )
            // InternalKinematicsParser.g:3045:2: ( rule__Joint__NameAssignment_1 )
            {
             before(grammarAccess.getJointAccess().getNameAssignment_1()); 
            // InternalKinematicsParser.g:3046:2: ( rule__Joint__NameAssignment_1 )
            // InternalKinematicsParser.g:3046:3: rule__Joint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:3054:1: rule__Joint__Group__2 : rule__Joint__Group__2__Impl rule__Joint__Group__3 ;
    public final void rule__Joint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3058:1: ( rule__Joint__Group__2__Impl rule__Joint__Group__3 )
            // InternalKinematicsParser.g:3059:2: rule__Joint__Group__2__Impl rule__Joint__Group__3
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
    // InternalKinematicsParser.g:3066:1: rule__Joint__Group__2__Impl : ( Colon ) ;
    public final void rule__Joint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3070:1: ( ( Colon ) )
            // InternalKinematicsParser.g:3071:1: ( Colon )
            {
            // InternalKinematicsParser.g:3071:1: ( Colon )
            // InternalKinematicsParser.g:3072:2: Colon
            {
             before(grammarAccess.getJointAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getColonKeyword_2()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:3081:1: rule__Joint__Group__3 : rule__Joint__Group__3__Impl rule__Joint__Group__4 ;
    public final void rule__Joint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3085:1: ( rule__Joint__Group__3__Impl rule__Joint__Group__4 )
            // InternalKinematicsParser.g:3086:2: rule__Joint__Group__3__Impl rule__Joint__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalKinematicsParser.g:3093:1: rule__Joint__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__Joint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3097:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:3098:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:3098:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:3099:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:3108:1: rule__Joint__Group__4 : rule__Joint__Group__4__Impl rule__Joint__Group__5 ;
    public final void rule__Joint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3112:1: ( rule__Joint__Group__4__Impl rule__Joint__Group__5 )
            // InternalKinematicsParser.g:3113:2: rule__Joint__Group__4__Impl rule__Joint__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalKinematicsParser.g:3120:1: rule__Joint__Group__4__Impl : ( Type ) ;
    public final void rule__Joint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3124:1: ( ( Type ) )
            // InternalKinematicsParser.g:3125:1: ( Type )
            {
            // InternalKinematicsParser.g:3125:1: ( Type )
            // InternalKinematicsParser.g:3126:2: Type
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
    // InternalKinematicsParser.g:3135:1: rule__Joint__Group__5 : rule__Joint__Group__5__Impl rule__Joint__Group__6 ;
    public final void rule__Joint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3139:1: ( rule__Joint__Group__5__Impl rule__Joint__Group__6 )
            // InternalKinematicsParser.g:3140:2: rule__Joint__Group__5__Impl rule__Joint__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalKinematicsParser.g:3147:1: rule__Joint__Group__5__Impl : ( ( rule__Joint__TypeAssignment_5 ) ) ;
    public final void rule__Joint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3151:1: ( ( ( rule__Joint__TypeAssignment_5 ) ) )
            // InternalKinematicsParser.g:3152:1: ( ( rule__Joint__TypeAssignment_5 ) )
            {
            // InternalKinematicsParser.g:3152:1: ( ( rule__Joint__TypeAssignment_5 ) )
            // InternalKinematicsParser.g:3153:2: ( rule__Joint__TypeAssignment_5 )
            {
             before(grammarAccess.getJointAccess().getTypeAssignment_5()); 
            // InternalKinematicsParser.g:3154:2: ( rule__Joint__TypeAssignment_5 )
            // InternalKinematicsParser.g:3154:3: rule__Joint__TypeAssignment_5
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
    // InternalKinematicsParser.g:3162:1: rule__Joint__Group__6 : rule__Joint__Group__6__Impl rule__Joint__Group__7 ;
    public final void rule__Joint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3166:1: ( rule__Joint__Group__6__Impl rule__Joint__Group__7 )
            // InternalKinematicsParser.g:3167:2: rule__Joint__Group__6__Impl rule__Joint__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalKinematicsParser.g:3174:1: rule__Joint__Group__6__Impl : ( Parent ) ;
    public final void rule__Joint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3178:1: ( ( Parent ) )
            // InternalKinematicsParser.g:3179:1: ( Parent )
            {
            // InternalKinematicsParser.g:3179:1: ( Parent )
            // InternalKinematicsParser.g:3180:2: Parent
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
    // InternalKinematicsParser.g:3189:1: rule__Joint__Group__7 : rule__Joint__Group__7__Impl rule__Joint__Group__8 ;
    public final void rule__Joint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3193:1: ( rule__Joint__Group__7__Impl rule__Joint__Group__8 )
            // InternalKinematicsParser.g:3194:2: rule__Joint__Group__7__Impl rule__Joint__Group__8
            {
            pushFollow(FOLLOW_26);
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
    // InternalKinematicsParser.g:3201:1: rule__Joint__Group__7__Impl : ( ( rule__Joint__ParentAssignment_7 ) ) ;
    public final void rule__Joint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3205:1: ( ( ( rule__Joint__ParentAssignment_7 ) ) )
            // InternalKinematicsParser.g:3206:1: ( ( rule__Joint__ParentAssignment_7 ) )
            {
            // InternalKinematicsParser.g:3206:1: ( ( rule__Joint__ParentAssignment_7 ) )
            // InternalKinematicsParser.g:3207:2: ( rule__Joint__ParentAssignment_7 )
            {
             before(grammarAccess.getJointAccess().getParentAssignment_7()); 
            // InternalKinematicsParser.g:3208:2: ( rule__Joint__ParentAssignment_7 )
            // InternalKinematicsParser.g:3208:3: rule__Joint__ParentAssignment_7
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
    // InternalKinematicsParser.g:3216:1: rule__Joint__Group__8 : rule__Joint__Group__8__Impl rule__Joint__Group__9 ;
    public final void rule__Joint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3220:1: ( rule__Joint__Group__8__Impl rule__Joint__Group__9 )
            // InternalKinematicsParser.g:3221:2: rule__Joint__Group__8__Impl rule__Joint__Group__9
            {
            pushFollow(FOLLOW_19);
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
    // InternalKinematicsParser.g:3228:1: rule__Joint__Group__8__Impl : ( Child ) ;
    public final void rule__Joint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3232:1: ( ( Child ) )
            // InternalKinematicsParser.g:3233:1: ( Child )
            {
            // InternalKinematicsParser.g:3233:1: ( Child )
            // InternalKinematicsParser.g:3234:2: Child
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
    // InternalKinematicsParser.g:3243:1: rule__Joint__Group__9 : rule__Joint__Group__9__Impl rule__Joint__Group__10 ;
    public final void rule__Joint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3247:1: ( rule__Joint__Group__9__Impl rule__Joint__Group__10 )
            // InternalKinematicsParser.g:3248:2: rule__Joint__Group__9__Impl rule__Joint__Group__10
            {
            pushFollow(FOLLOW_27);
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
    // InternalKinematicsParser.g:3255:1: rule__Joint__Group__9__Impl : ( ( rule__Joint__ChildAssignment_9 ) ) ;
    public final void rule__Joint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3259:1: ( ( ( rule__Joint__ChildAssignment_9 ) ) )
            // InternalKinematicsParser.g:3260:1: ( ( rule__Joint__ChildAssignment_9 ) )
            {
            // InternalKinematicsParser.g:3260:1: ( ( rule__Joint__ChildAssignment_9 ) )
            // InternalKinematicsParser.g:3261:2: ( rule__Joint__ChildAssignment_9 )
            {
             before(grammarAccess.getJointAccess().getChildAssignment_9()); 
            // InternalKinematicsParser.g:3262:2: ( rule__Joint__ChildAssignment_9 )
            // InternalKinematicsParser.g:3262:3: rule__Joint__ChildAssignment_9
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
    // InternalKinematicsParser.g:3270:1: rule__Joint__Group__10 : rule__Joint__Group__10__Impl rule__Joint__Group__11 ;
    public final void rule__Joint__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3274:1: ( rule__Joint__Group__10__Impl rule__Joint__Group__11 )
            // InternalKinematicsParser.g:3275:2: rule__Joint__Group__10__Impl rule__Joint__Group__11
            {
            pushFollow(FOLLOW_28);
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
    // InternalKinematicsParser.g:3282:1: rule__Joint__Group__10__Impl : ( Origin ) ;
    public final void rule__Joint__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3286:1: ( ( Origin ) )
            // InternalKinematicsParser.g:3287:1: ( Origin )
            {
            // InternalKinematicsParser.g:3287:1: ( Origin )
            // InternalKinematicsParser.g:3288:2: Origin
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
    // InternalKinematicsParser.g:3297:1: rule__Joint__Group__11 : rule__Joint__Group__11__Impl rule__Joint__Group__12 ;
    public final void rule__Joint__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3301:1: ( rule__Joint__Group__11__Impl rule__Joint__Group__12 )
            // InternalKinematicsParser.g:3302:2: rule__Joint__Group__11__Impl rule__Joint__Group__12
            {
            pushFollow(FOLLOW_29);
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
    // InternalKinematicsParser.g:3309:1: rule__Joint__Group__11__Impl : ( ( rule__Joint__OriginAssignment_11 ) ) ;
    public final void rule__Joint__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3313:1: ( ( ( rule__Joint__OriginAssignment_11 ) ) )
            // InternalKinematicsParser.g:3314:1: ( ( rule__Joint__OriginAssignment_11 ) )
            {
            // InternalKinematicsParser.g:3314:1: ( ( rule__Joint__OriginAssignment_11 ) )
            // InternalKinematicsParser.g:3315:2: ( rule__Joint__OriginAssignment_11 )
            {
             before(grammarAccess.getJointAccess().getOriginAssignment_11()); 
            // InternalKinematicsParser.g:3316:2: ( rule__Joint__OriginAssignment_11 )
            // InternalKinematicsParser.g:3316:3: rule__Joint__OriginAssignment_11
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
    // InternalKinematicsParser.g:3324:1: rule__Joint__Group__12 : rule__Joint__Group__12__Impl rule__Joint__Group__13 ;
    public final void rule__Joint__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3328:1: ( rule__Joint__Group__12__Impl rule__Joint__Group__13 )
            // InternalKinematicsParser.g:3329:2: rule__Joint__Group__12__Impl rule__Joint__Group__13
            {
            pushFollow(FOLLOW_29);
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
    // InternalKinematicsParser.g:3336:1: rule__Joint__Group__12__Impl : ( ( rule__Joint__Group_12__0 )? ) ;
    public final void rule__Joint__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3340:1: ( ( ( rule__Joint__Group_12__0 )? ) )
            // InternalKinematicsParser.g:3341:1: ( ( rule__Joint__Group_12__0 )? )
            {
            // InternalKinematicsParser.g:3341:1: ( ( rule__Joint__Group_12__0 )? )
            // InternalKinematicsParser.g:3342:2: ( rule__Joint__Group_12__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_12()); 
            // InternalKinematicsParser.g:3343:2: ( rule__Joint__Group_12__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Axis) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalKinematicsParser.g:3343:3: rule__Joint__Group_12__0
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
    // InternalKinematicsParser.g:3351:1: rule__Joint__Group__13 : rule__Joint__Group__13__Impl rule__Joint__Group__14 ;
    public final void rule__Joint__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3355:1: ( rule__Joint__Group__13__Impl rule__Joint__Group__14 )
            // InternalKinematicsParser.g:3356:2: rule__Joint__Group__13__Impl rule__Joint__Group__14
            {
            pushFollow(FOLLOW_29);
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
    // InternalKinematicsParser.g:3363:1: rule__Joint__Group__13__Impl : ( ( rule__Joint__Group_13__0 )? ) ;
    public final void rule__Joint__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3367:1: ( ( ( rule__Joint__Group_13__0 )? ) )
            // InternalKinematicsParser.g:3368:1: ( ( rule__Joint__Group_13__0 )? )
            {
            // InternalKinematicsParser.g:3368:1: ( ( rule__Joint__Group_13__0 )? )
            // InternalKinematicsParser.g:3369:2: ( rule__Joint__Group_13__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_13()); 
            // InternalKinematicsParser.g:3370:2: ( rule__Joint__Group_13__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Limit) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalKinematicsParser.g:3370:3: rule__Joint__Group_13__0
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
    // InternalKinematicsParser.g:3378:1: rule__Joint__Group__14 : rule__Joint__Group__14__Impl ;
    public final void rule__Joint__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3382:1: ( rule__Joint__Group__14__Impl )
            // InternalKinematicsParser.g:3383:2: rule__Joint__Group__14__Impl
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
    // InternalKinematicsParser.g:3389:1: rule__Joint__Group__14__Impl : ( RULE_END ) ;
    public final void rule__Joint__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3393:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:3394:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:3394:1: ( RULE_END )
            // InternalKinematicsParser.g:3395:2: RULE_END
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
    // InternalKinematicsParser.g:3405:1: rule__Joint__Group_12__0 : rule__Joint__Group_12__0__Impl rule__Joint__Group_12__1 ;
    public final void rule__Joint__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3409:1: ( rule__Joint__Group_12__0__Impl rule__Joint__Group_12__1 )
            // InternalKinematicsParser.g:3410:2: rule__Joint__Group_12__0__Impl rule__Joint__Group_12__1
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
    // InternalKinematicsParser.g:3417:1: rule__Joint__Group_12__0__Impl : ( Axis ) ;
    public final void rule__Joint__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3421:1: ( ( Axis ) )
            // InternalKinematicsParser.g:3422:1: ( Axis )
            {
            // InternalKinematicsParser.g:3422:1: ( Axis )
            // InternalKinematicsParser.g:3423:2: Axis
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
    // InternalKinematicsParser.g:3432:1: rule__Joint__Group_12__1 : rule__Joint__Group_12__1__Impl ;
    public final void rule__Joint__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3436:1: ( rule__Joint__Group_12__1__Impl )
            // InternalKinematicsParser.g:3437:2: rule__Joint__Group_12__1__Impl
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
    // InternalKinematicsParser.g:3443:1: rule__Joint__Group_12__1__Impl : ( ( rule__Joint__AxisAssignment_12_1 ) ) ;
    public final void rule__Joint__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3447:1: ( ( ( rule__Joint__AxisAssignment_12_1 ) ) )
            // InternalKinematicsParser.g:3448:1: ( ( rule__Joint__AxisAssignment_12_1 ) )
            {
            // InternalKinematicsParser.g:3448:1: ( ( rule__Joint__AxisAssignment_12_1 ) )
            // InternalKinematicsParser.g:3449:2: ( rule__Joint__AxisAssignment_12_1 )
            {
             before(grammarAccess.getJointAccess().getAxisAssignment_12_1()); 
            // InternalKinematicsParser.g:3450:2: ( rule__Joint__AxisAssignment_12_1 )
            // InternalKinematicsParser.g:3450:3: rule__Joint__AxisAssignment_12_1
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
    // InternalKinematicsParser.g:3459:1: rule__Joint__Group_13__0 : rule__Joint__Group_13__0__Impl rule__Joint__Group_13__1 ;
    public final void rule__Joint__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3463:1: ( rule__Joint__Group_13__0__Impl rule__Joint__Group_13__1 )
            // InternalKinematicsParser.g:3464:2: rule__Joint__Group_13__0__Impl rule__Joint__Group_13__1
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
    // InternalKinematicsParser.g:3471:1: rule__Joint__Group_13__0__Impl : ( Limit ) ;
    public final void rule__Joint__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3475:1: ( ( Limit ) )
            // InternalKinematicsParser.g:3476:1: ( Limit )
            {
            // InternalKinematicsParser.g:3476:1: ( Limit )
            // InternalKinematicsParser.g:3477:2: Limit
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
    // InternalKinematicsParser.g:3486:1: rule__Joint__Group_13__1 : rule__Joint__Group_13__1__Impl ;
    public final void rule__Joint__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3490:1: ( rule__Joint__Group_13__1__Impl )
            // InternalKinematicsParser.g:3491:2: rule__Joint__Group_13__1__Impl
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
    // InternalKinematicsParser.g:3497:1: rule__Joint__Group_13__1__Impl : ( ( rule__Joint__LimitAssignment_13_1 ) ) ;
    public final void rule__Joint__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3501:1: ( ( ( rule__Joint__LimitAssignment_13_1 ) ) )
            // InternalKinematicsParser.g:3502:1: ( ( rule__Joint__LimitAssignment_13_1 ) )
            {
            // InternalKinematicsParser.g:3502:1: ( ( rule__Joint__LimitAssignment_13_1 ) )
            // InternalKinematicsParser.g:3503:2: ( rule__Joint__LimitAssignment_13_1 )
            {
             before(grammarAccess.getJointAccess().getLimitAssignment_13_1()); 
            // InternalKinematicsParser.g:3504:2: ( rule__Joint__LimitAssignment_13_1 )
            // InternalKinematicsParser.g:3504:3: rule__Joint__LimitAssignment_13_1
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
    // InternalKinematicsParser.g:3513:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3517:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalKinematicsParser.g:3518:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalKinematicsParser.g:3525:1: rule__Link__Group__0__Impl : ( HyphenMinus ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3529:1: ( ( HyphenMinus ) )
            // InternalKinematicsParser.g:3530:1: ( HyphenMinus )
            {
            // InternalKinematicsParser.g:3530:1: ( HyphenMinus )
            // InternalKinematicsParser.g:3531:2: HyphenMinus
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
    // InternalKinematicsParser.g:3540:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3544:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalKinematicsParser.g:3545:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalKinematicsParser.g:3552:1: rule__Link__Group__1__Impl : ( ( rule__Link__NameAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3556:1: ( ( ( rule__Link__NameAssignment_1 ) ) )
            // InternalKinematicsParser.g:3557:1: ( ( rule__Link__NameAssignment_1 ) )
            {
            // InternalKinematicsParser.g:3557:1: ( ( rule__Link__NameAssignment_1 ) )
            // InternalKinematicsParser.g:3558:2: ( rule__Link__NameAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_1()); 
            // InternalKinematicsParser.g:3559:2: ( rule__Link__NameAssignment_1 )
            // InternalKinematicsParser.g:3559:3: rule__Link__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:3567:1: rule__Link__Group__2 : rule__Link__Group__2__Impl ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3571:1: ( rule__Link__Group__2__Impl )
            // InternalKinematicsParser.g:3572:2: rule__Link__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalKinematicsParser.g:3578:1: rule__Link__Group__2__Impl : ( ( rule__Link__Group_2__0 )? ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3582:1: ( ( ( rule__Link__Group_2__0 )? ) )
            // InternalKinematicsParser.g:3583:1: ( ( rule__Link__Group_2__0 )? )
            {
            // InternalKinematicsParser.g:3583:1: ( ( rule__Link__Group_2__0 )? )
            // InternalKinematicsParser.g:3584:2: ( rule__Link__Group_2__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_2()); 
            // InternalKinematicsParser.g:3585:2: ( rule__Link__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Colon) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalKinematicsParser.g:3585:3: rule__Link__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Link__Group_2__0"
    // InternalKinematicsParser.g:3594:1: rule__Link__Group_2__0 : rule__Link__Group_2__0__Impl rule__Link__Group_2__1 ;
    public final void rule__Link__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3598:1: ( rule__Link__Group_2__0__Impl rule__Link__Group_2__1 )
            // InternalKinematicsParser.g:3599:2: rule__Link__Group_2__0__Impl rule__Link__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Link__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2__0"


    // $ANTLR start "rule__Link__Group_2__0__Impl"
    // InternalKinematicsParser.g:3606:1: rule__Link__Group_2__0__Impl : ( Colon ) ;
    public final void rule__Link__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3610:1: ( ( Colon ) )
            // InternalKinematicsParser.g:3611:1: ( Colon )
            {
            // InternalKinematicsParser.g:3611:1: ( Colon )
            // InternalKinematicsParser.g:3612:2: Colon
            {
             before(grammarAccess.getLinkAccess().getColonKeyword_2_0()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2__0__Impl"


    // $ANTLR start "rule__Link__Group_2__1"
    // InternalKinematicsParser.g:3621:1: rule__Link__Group_2__1 : rule__Link__Group_2__1__Impl rule__Link__Group_2__2 ;
    public final void rule__Link__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3625:1: ( rule__Link__Group_2__1__Impl rule__Link__Group_2__2 )
            // InternalKinematicsParser.g:3626:2: rule__Link__Group_2__1__Impl rule__Link__Group_2__2
            {
            pushFollow(FOLLOW_30);
            rule__Link__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2__1"


    // $ANTLR start "rule__Link__Group_2__1__Impl"
    // InternalKinematicsParser.g:3633:1: rule__Link__Group_2__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Link__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3637:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:3638:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:3638:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:3639:2: RULE_BEGIN
            {
             before(grammarAccess.getLinkAccess().getBEGINTerminalRuleCall_2_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getBEGINTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2__1__Impl"


    // $ANTLR start "rule__Link__Group_2__2"
    // InternalKinematicsParser.g:3648:1: rule__Link__Group_2__2 : rule__Link__Group_2__2__Impl rule__Link__Group_2__3 ;
    public final void rule__Link__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3652:1: ( rule__Link__Group_2__2__Impl rule__Link__Group_2__3 )
            // InternalKinematicsParser.g:3653:2: rule__Link__Group_2__2__Impl rule__Link__Group_2__3
            {
            pushFollow(FOLLOW_30);
            rule__Link__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2__2"


    // $ANTLR start "rule__Link__Group_2__2__Impl"
    // InternalKinematicsParser.g:3660:1: rule__Link__Group_2__2__Impl : ( ( rule__Link__Group_2_2__0 )? ) ;
    public final void rule__Link__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3664:1: ( ( ( rule__Link__Group_2_2__0 )? ) )
            // InternalKinematicsParser.g:3665:1: ( ( rule__Link__Group_2_2__0 )? )
            {
            // InternalKinematicsParser.g:3665:1: ( ( rule__Link__Group_2_2__0 )? )
            // InternalKinematicsParser.g:3666:2: ( rule__Link__Group_2_2__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_2_2()); 
            // InternalKinematicsParser.g:3667:2: ( rule__Link__Group_2_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Inertial) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalKinematicsParser.g:3667:3: rule__Link__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2__2__Impl"


    // $ANTLR start "rule__Link__Group_2__3"
    // InternalKinematicsParser.g:3675:1: rule__Link__Group_2__3 : rule__Link__Group_2__3__Impl rule__Link__Group_2__4 ;
    public final void rule__Link__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3679:1: ( rule__Link__Group_2__3__Impl rule__Link__Group_2__4 )
            // InternalKinematicsParser.g:3680:2: rule__Link__Group_2__3__Impl rule__Link__Group_2__4
            {
            pushFollow(FOLLOW_30);
            rule__Link__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2__3"


    // $ANTLR start "rule__Link__Group_2__3__Impl"
    // InternalKinematicsParser.g:3687:1: rule__Link__Group_2__3__Impl : ( ( rule__Link__Group_2_3__0 )? ) ;
    public final void rule__Link__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3691:1: ( ( ( rule__Link__Group_2_3__0 )? ) )
            // InternalKinematicsParser.g:3692:1: ( ( rule__Link__Group_2_3__0 )? )
            {
            // InternalKinematicsParser.g:3692:1: ( ( rule__Link__Group_2_3__0 )? )
            // InternalKinematicsParser.g:3693:2: ( rule__Link__Group_2_3__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_2_3()); 
            // InternalKinematicsParser.g:3694:2: ( rule__Link__Group_2_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Visual) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalKinematicsParser.g:3694:3: rule__Link__Group_2_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_2_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2__3__Impl"


    // $ANTLR start "rule__Link__Group_2__4"
    // InternalKinematicsParser.g:3702:1: rule__Link__Group_2__4 : rule__Link__Group_2__4__Impl rule__Link__Group_2__5 ;
    public final void rule__Link__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3706:1: ( rule__Link__Group_2__4__Impl rule__Link__Group_2__5 )
            // InternalKinematicsParser.g:3707:2: rule__Link__Group_2__4__Impl rule__Link__Group_2__5
            {
            pushFollow(FOLLOW_30);
            rule__Link__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2__4"


    // $ANTLR start "rule__Link__Group_2__4__Impl"
    // InternalKinematicsParser.g:3714:1: rule__Link__Group_2__4__Impl : ( ( rule__Link__Group_2_4__0 )? ) ;
    public final void rule__Link__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3718:1: ( ( ( rule__Link__Group_2_4__0 )? ) )
            // InternalKinematicsParser.g:3719:1: ( ( rule__Link__Group_2_4__0 )? )
            {
            // InternalKinematicsParser.g:3719:1: ( ( rule__Link__Group_2_4__0 )? )
            // InternalKinematicsParser.g:3720:2: ( rule__Link__Group_2_4__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_2_4()); 
            // InternalKinematicsParser.g:3721:2: ( rule__Link__Group_2_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Collision) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalKinematicsParser.g:3721:3: rule__Link__Group_2_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_2_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2__4__Impl"


    // $ANTLR start "rule__Link__Group_2__5"
    // InternalKinematicsParser.g:3729:1: rule__Link__Group_2__5 : rule__Link__Group_2__5__Impl ;
    public final void rule__Link__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3733:1: ( rule__Link__Group_2__5__Impl )
            // InternalKinematicsParser.g:3734:2: rule__Link__Group_2__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_2__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2__5"


    // $ANTLR start "rule__Link__Group_2__5__Impl"
    // InternalKinematicsParser.g:3740:1: rule__Link__Group_2__5__Impl : ( RULE_END ) ;
    public final void rule__Link__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3744:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:3745:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:3745:1: ( RULE_END )
            // InternalKinematicsParser.g:3746:2: RULE_END
            {
             before(grammarAccess.getLinkAccess().getENDTerminalRuleCall_2_5()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getENDTerminalRuleCall_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2__5__Impl"


    // $ANTLR start "rule__Link__Group_2_2__0"
    // InternalKinematicsParser.g:3756:1: rule__Link__Group_2_2__0 : rule__Link__Group_2_2__0__Impl rule__Link__Group_2_2__1 ;
    public final void rule__Link__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3760:1: ( rule__Link__Group_2_2__0__Impl rule__Link__Group_2_2__1 )
            // InternalKinematicsParser.g:3761:2: rule__Link__Group_2_2__0__Impl rule__Link__Group_2_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Link__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2_2__0"


    // $ANTLR start "rule__Link__Group_2_2__0__Impl"
    // InternalKinematicsParser.g:3768:1: rule__Link__Group_2_2__0__Impl : ( Inertial ) ;
    public final void rule__Link__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3772:1: ( ( Inertial ) )
            // InternalKinematicsParser.g:3773:1: ( Inertial )
            {
            // InternalKinematicsParser.g:3773:1: ( Inertial )
            // InternalKinematicsParser.g:3774:2: Inertial
            {
             before(grammarAccess.getLinkAccess().getInertialKeyword_2_2_0()); 
            match(input,Inertial,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getInertialKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2_2__0__Impl"


    // $ANTLR start "rule__Link__Group_2_2__1"
    // InternalKinematicsParser.g:3783:1: rule__Link__Group_2_2__1 : rule__Link__Group_2_2__1__Impl ;
    public final void rule__Link__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3787:1: ( rule__Link__Group_2_2__1__Impl )
            // InternalKinematicsParser.g:3788:2: rule__Link__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2_2__1"


    // $ANTLR start "rule__Link__Group_2_2__1__Impl"
    // InternalKinematicsParser.g:3794:1: rule__Link__Group_2_2__1__Impl : ( ( rule__Link__InertialAssignment_2_2_1 ) ) ;
    public final void rule__Link__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3798:1: ( ( ( rule__Link__InertialAssignment_2_2_1 ) ) )
            // InternalKinematicsParser.g:3799:1: ( ( rule__Link__InertialAssignment_2_2_1 ) )
            {
            // InternalKinematicsParser.g:3799:1: ( ( rule__Link__InertialAssignment_2_2_1 ) )
            // InternalKinematicsParser.g:3800:2: ( rule__Link__InertialAssignment_2_2_1 )
            {
             before(grammarAccess.getLinkAccess().getInertialAssignment_2_2_1()); 
            // InternalKinematicsParser.g:3801:2: ( rule__Link__InertialAssignment_2_2_1 )
            // InternalKinematicsParser.g:3801:3: rule__Link__InertialAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__InertialAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getInertialAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2_2__1__Impl"


    // $ANTLR start "rule__Link__Group_2_3__0"
    // InternalKinematicsParser.g:3810:1: rule__Link__Group_2_3__0 : rule__Link__Group_2_3__0__Impl rule__Link__Group_2_3__1 ;
    public final void rule__Link__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3814:1: ( rule__Link__Group_2_3__0__Impl rule__Link__Group_2_3__1 )
            // InternalKinematicsParser.g:3815:2: rule__Link__Group_2_3__0__Impl rule__Link__Group_2_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Link__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2_3__0"


    // $ANTLR start "rule__Link__Group_2_3__0__Impl"
    // InternalKinematicsParser.g:3822:1: rule__Link__Group_2_3__0__Impl : ( Visual ) ;
    public final void rule__Link__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3826:1: ( ( Visual ) )
            // InternalKinematicsParser.g:3827:1: ( Visual )
            {
            // InternalKinematicsParser.g:3827:1: ( Visual )
            // InternalKinematicsParser.g:3828:2: Visual
            {
             before(grammarAccess.getLinkAccess().getVisualKeyword_2_3_0()); 
            match(input,Visual,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getVisualKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2_3__0__Impl"


    // $ANTLR start "rule__Link__Group_2_3__1"
    // InternalKinematicsParser.g:3837:1: rule__Link__Group_2_3__1 : rule__Link__Group_2_3__1__Impl ;
    public final void rule__Link__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3841:1: ( rule__Link__Group_2_3__1__Impl )
            // InternalKinematicsParser.g:3842:2: rule__Link__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2_3__1"


    // $ANTLR start "rule__Link__Group_2_3__1__Impl"
    // InternalKinematicsParser.g:3848:1: rule__Link__Group_2_3__1__Impl : ( ( rule__Link__VisualAssignment_2_3_1 ) ) ;
    public final void rule__Link__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3852:1: ( ( ( rule__Link__VisualAssignment_2_3_1 ) ) )
            // InternalKinematicsParser.g:3853:1: ( ( rule__Link__VisualAssignment_2_3_1 ) )
            {
            // InternalKinematicsParser.g:3853:1: ( ( rule__Link__VisualAssignment_2_3_1 ) )
            // InternalKinematicsParser.g:3854:2: ( rule__Link__VisualAssignment_2_3_1 )
            {
             before(grammarAccess.getLinkAccess().getVisualAssignment_2_3_1()); 
            // InternalKinematicsParser.g:3855:2: ( rule__Link__VisualAssignment_2_3_1 )
            // InternalKinematicsParser.g:3855:3: rule__Link__VisualAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__VisualAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getVisualAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2_3__1__Impl"


    // $ANTLR start "rule__Link__Group_2_4__0"
    // InternalKinematicsParser.g:3864:1: rule__Link__Group_2_4__0 : rule__Link__Group_2_4__0__Impl rule__Link__Group_2_4__1 ;
    public final void rule__Link__Group_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3868:1: ( rule__Link__Group_2_4__0__Impl rule__Link__Group_2_4__1 )
            // InternalKinematicsParser.g:3869:2: rule__Link__Group_2_4__0__Impl rule__Link__Group_2_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Link__Group_2_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_2_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2_4__0"


    // $ANTLR start "rule__Link__Group_2_4__0__Impl"
    // InternalKinematicsParser.g:3876:1: rule__Link__Group_2_4__0__Impl : ( Collision ) ;
    public final void rule__Link__Group_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3880:1: ( ( Collision ) )
            // InternalKinematicsParser.g:3881:1: ( Collision )
            {
            // InternalKinematicsParser.g:3881:1: ( Collision )
            // InternalKinematicsParser.g:3882:2: Collision
            {
             before(grammarAccess.getLinkAccess().getCollisionKeyword_2_4_0()); 
            match(input,Collision,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getCollisionKeyword_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2_4__0__Impl"


    // $ANTLR start "rule__Link__Group_2_4__1"
    // InternalKinematicsParser.g:3891:1: rule__Link__Group_2_4__1 : rule__Link__Group_2_4__1__Impl ;
    public final void rule__Link__Group_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3895:1: ( rule__Link__Group_2_4__1__Impl )
            // InternalKinematicsParser.g:3896:2: rule__Link__Group_2_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_2_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2_4__1"


    // $ANTLR start "rule__Link__Group_2_4__1__Impl"
    // InternalKinematicsParser.g:3902:1: rule__Link__Group_2_4__1__Impl : ( ( rule__Link__CollisionAssignment_2_4_1 ) ) ;
    public final void rule__Link__Group_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3906:1: ( ( ( rule__Link__CollisionAssignment_2_4_1 ) ) )
            // InternalKinematicsParser.g:3907:1: ( ( rule__Link__CollisionAssignment_2_4_1 ) )
            {
            // InternalKinematicsParser.g:3907:1: ( ( rule__Link__CollisionAssignment_2_4_1 ) )
            // InternalKinematicsParser.g:3908:2: ( rule__Link__CollisionAssignment_2_4_1 )
            {
             before(grammarAccess.getLinkAccess().getCollisionAssignment_2_4_1()); 
            // InternalKinematicsParser.g:3909:2: ( rule__Link__CollisionAssignment_2_4_1 )
            // InternalKinematicsParser.g:3909:3: rule__Link__CollisionAssignment_2_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__CollisionAssignment_2_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getCollisionAssignment_2_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_2_4__1__Impl"


    // $ANTLR start "rule__Pose__Group__0"
    // InternalKinematicsParser.g:3918:1: rule__Pose__Group__0 : rule__Pose__Group__0__Impl rule__Pose__Group__1 ;
    public final void rule__Pose__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3922:1: ( rule__Pose__Group__0__Impl rule__Pose__Group__1 )
            // InternalKinematicsParser.g:3923:2: rule__Pose__Group__0__Impl rule__Pose__Group__1
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
    // InternalKinematicsParser.g:3930:1: rule__Pose__Group__0__Impl : ( () ) ;
    public final void rule__Pose__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3934:1: ( ( () ) )
            // InternalKinematicsParser.g:3935:1: ( () )
            {
            // InternalKinematicsParser.g:3935:1: ( () )
            // InternalKinematicsParser.g:3936:2: ()
            {
             before(grammarAccess.getPoseAccess().getPoseAction_0()); 
            // InternalKinematicsParser.g:3937:2: ()
            // InternalKinematicsParser.g:3937:3: 
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
    // InternalKinematicsParser.g:3945:1: rule__Pose__Group__1 : rule__Pose__Group__1__Impl rule__Pose__Group__2 ;
    public final void rule__Pose__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3949:1: ( rule__Pose__Group__1__Impl rule__Pose__Group__2 )
            // InternalKinematicsParser.g:3950:2: rule__Pose__Group__1__Impl rule__Pose__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalKinematicsParser.g:3957:1: rule__Pose__Group__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Pose__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3961:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:3962:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:3962:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:3963:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:3972:1: rule__Pose__Group__2 : rule__Pose__Group__2__Impl rule__Pose__Group__3 ;
    public final void rule__Pose__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3976:1: ( rule__Pose__Group__2__Impl rule__Pose__Group__3 )
            // InternalKinematicsParser.g:3977:2: rule__Pose__Group__2__Impl rule__Pose__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalKinematicsParser.g:3984:1: rule__Pose__Group__2__Impl : ( ( rule__Pose__Group_2__0 )? ) ;
    public final void rule__Pose__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:3988:1: ( ( ( rule__Pose__Group_2__0 )? ) )
            // InternalKinematicsParser.g:3989:1: ( ( rule__Pose__Group_2__0 )? )
            {
            // InternalKinematicsParser.g:3989:1: ( ( rule__Pose__Group_2__0 )? )
            // InternalKinematicsParser.g:3990:2: ( rule__Pose__Group_2__0 )?
            {
             before(grammarAccess.getPoseAccess().getGroup_2()); 
            // InternalKinematicsParser.g:3991:2: ( rule__Pose__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Rpy) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKinematicsParser.g:3991:3: rule__Pose__Group_2__0
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
    // InternalKinematicsParser.g:3999:1: rule__Pose__Group__3 : rule__Pose__Group__3__Impl rule__Pose__Group__4 ;
    public final void rule__Pose__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4003:1: ( rule__Pose__Group__3__Impl rule__Pose__Group__4 )
            // InternalKinematicsParser.g:4004:2: rule__Pose__Group__3__Impl rule__Pose__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalKinematicsParser.g:4011:1: rule__Pose__Group__3__Impl : ( ( rule__Pose__Group_3__0 )? ) ;
    public final void rule__Pose__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4015:1: ( ( ( rule__Pose__Group_3__0 )? ) )
            // InternalKinematicsParser.g:4016:1: ( ( rule__Pose__Group_3__0 )? )
            {
            // InternalKinematicsParser.g:4016:1: ( ( rule__Pose__Group_3__0 )? )
            // InternalKinematicsParser.g:4017:2: ( rule__Pose__Group_3__0 )?
            {
             before(grammarAccess.getPoseAccess().getGroup_3()); 
            // InternalKinematicsParser.g:4018:2: ( rule__Pose__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Xyz) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalKinematicsParser.g:4018:3: rule__Pose__Group_3__0
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
    // InternalKinematicsParser.g:4026:1: rule__Pose__Group__4 : rule__Pose__Group__4__Impl ;
    public final void rule__Pose__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4030:1: ( rule__Pose__Group__4__Impl )
            // InternalKinematicsParser.g:4031:2: rule__Pose__Group__4__Impl
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
    // InternalKinematicsParser.g:4037:1: rule__Pose__Group__4__Impl : ( RULE_END ) ;
    public final void rule__Pose__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4041:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:4042:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:4042:1: ( RULE_END )
            // InternalKinematicsParser.g:4043:2: RULE_END
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
    // InternalKinematicsParser.g:4053:1: rule__Pose__Group_2__0 : rule__Pose__Group_2__0__Impl rule__Pose__Group_2__1 ;
    public final void rule__Pose__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4057:1: ( rule__Pose__Group_2__0__Impl rule__Pose__Group_2__1 )
            // InternalKinematicsParser.g:4058:2: rule__Pose__Group_2__0__Impl rule__Pose__Group_2__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalKinematicsParser.g:4065:1: rule__Pose__Group_2__0__Impl : ( Rpy ) ;
    public final void rule__Pose__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4069:1: ( ( Rpy ) )
            // InternalKinematicsParser.g:4070:1: ( Rpy )
            {
            // InternalKinematicsParser.g:4070:1: ( Rpy )
            // InternalKinematicsParser.g:4071:2: Rpy
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
    // InternalKinematicsParser.g:4080:1: rule__Pose__Group_2__1 : rule__Pose__Group_2__1__Impl ;
    public final void rule__Pose__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4084:1: ( rule__Pose__Group_2__1__Impl )
            // InternalKinematicsParser.g:4085:2: rule__Pose__Group_2__1__Impl
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
    // InternalKinematicsParser.g:4091:1: rule__Pose__Group_2__1__Impl : ( ( rule__Pose__RpyAssignment_2_1 ) ) ;
    public final void rule__Pose__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4095:1: ( ( ( rule__Pose__RpyAssignment_2_1 ) ) )
            // InternalKinematicsParser.g:4096:1: ( ( rule__Pose__RpyAssignment_2_1 ) )
            {
            // InternalKinematicsParser.g:4096:1: ( ( rule__Pose__RpyAssignment_2_1 ) )
            // InternalKinematicsParser.g:4097:2: ( rule__Pose__RpyAssignment_2_1 )
            {
             before(grammarAccess.getPoseAccess().getRpyAssignment_2_1()); 
            // InternalKinematicsParser.g:4098:2: ( rule__Pose__RpyAssignment_2_1 )
            // InternalKinematicsParser.g:4098:3: rule__Pose__RpyAssignment_2_1
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
    // InternalKinematicsParser.g:4107:1: rule__Pose__Group_3__0 : rule__Pose__Group_3__0__Impl rule__Pose__Group_3__1 ;
    public final void rule__Pose__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4111:1: ( rule__Pose__Group_3__0__Impl rule__Pose__Group_3__1 )
            // InternalKinematicsParser.g:4112:2: rule__Pose__Group_3__0__Impl rule__Pose__Group_3__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalKinematicsParser.g:4119:1: rule__Pose__Group_3__0__Impl : ( Xyz ) ;
    public final void rule__Pose__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4123:1: ( ( Xyz ) )
            // InternalKinematicsParser.g:4124:1: ( Xyz )
            {
            // InternalKinematicsParser.g:4124:1: ( Xyz )
            // InternalKinematicsParser.g:4125:2: Xyz
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
    // InternalKinematicsParser.g:4134:1: rule__Pose__Group_3__1 : rule__Pose__Group_3__1__Impl ;
    public final void rule__Pose__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4138:1: ( rule__Pose__Group_3__1__Impl )
            // InternalKinematicsParser.g:4139:2: rule__Pose__Group_3__1__Impl
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
    // InternalKinematicsParser.g:4145:1: rule__Pose__Group_3__1__Impl : ( ( rule__Pose__XyzAssignment_3_1 ) ) ;
    public final void rule__Pose__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4149:1: ( ( ( rule__Pose__XyzAssignment_3_1 ) ) )
            // InternalKinematicsParser.g:4150:1: ( ( rule__Pose__XyzAssignment_3_1 ) )
            {
            // InternalKinematicsParser.g:4150:1: ( ( rule__Pose__XyzAssignment_3_1 ) )
            // InternalKinematicsParser.g:4151:2: ( rule__Pose__XyzAssignment_3_1 )
            {
             before(grammarAccess.getPoseAccess().getXyzAssignment_3_1()); 
            // InternalKinematicsParser.g:4152:2: ( rule__Pose__XyzAssignment_3_1 )
            // InternalKinematicsParser.g:4152:3: rule__Pose__XyzAssignment_3_1
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
    // InternalKinematicsParser.g:4161:1: rule__Vector3__Group__0 : rule__Vector3__Group__0__Impl rule__Vector3__Group__1 ;
    public final void rule__Vector3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4165:1: ( rule__Vector3__Group__0__Impl rule__Vector3__Group__1 )
            // InternalKinematicsParser.g:4166:2: rule__Vector3__Group__0__Impl rule__Vector3__Group__1
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
    // InternalKinematicsParser.g:4173:1: rule__Vector3__Group__0__Impl : ( () ) ;
    public final void rule__Vector3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4177:1: ( ( () ) )
            // InternalKinematicsParser.g:4178:1: ( () )
            {
            // InternalKinematicsParser.g:4178:1: ( () )
            // InternalKinematicsParser.g:4179:2: ()
            {
             before(grammarAccess.getVector3Access().getVector3Action_0()); 
            // InternalKinematicsParser.g:4180:2: ()
            // InternalKinematicsParser.g:4180:3: 
            {
            }

             after(grammarAccess.getVector3Access().getVector3Action_0()); 

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
    // InternalKinematicsParser.g:4188:1: rule__Vector3__Group__1 : rule__Vector3__Group__1__Impl rule__Vector3__Group__2 ;
    public final void rule__Vector3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4192:1: ( rule__Vector3__Group__1__Impl rule__Vector3__Group__2 )
            // InternalKinematicsParser.g:4193:2: rule__Vector3__Group__1__Impl rule__Vector3__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalKinematicsParser.g:4200:1: rule__Vector3__Group__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Vector3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4204:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:4205:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:4205:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:4206:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:4215:1: rule__Vector3__Group__2 : rule__Vector3__Group__2__Impl rule__Vector3__Group__3 ;
    public final void rule__Vector3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4219:1: ( rule__Vector3__Group__2__Impl rule__Vector3__Group__3 )
            // InternalKinematicsParser.g:4220:2: rule__Vector3__Group__2__Impl rule__Vector3__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalKinematicsParser.g:4227:1: rule__Vector3__Group__2__Impl : ( ( rule__Vector3__Group_2__0 )? ) ;
    public final void rule__Vector3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4231:1: ( ( ( rule__Vector3__Group_2__0 )? ) )
            // InternalKinematicsParser.g:4232:1: ( ( rule__Vector3__Group_2__0 )? )
            {
            // InternalKinematicsParser.g:4232:1: ( ( rule__Vector3__Group_2__0 )? )
            // InternalKinematicsParser.g:4233:2: ( rule__Vector3__Group_2__0 )?
            {
             before(grammarAccess.getVector3Access().getGroup_2()); 
            // InternalKinematicsParser.g:4234:2: ( rule__Vector3__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Xyz) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalKinematicsParser.g:4234:3: rule__Vector3__Group_2__0
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
    // InternalKinematicsParser.g:4242:1: rule__Vector3__Group__3 : rule__Vector3__Group__3__Impl ;
    public final void rule__Vector3__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4246:1: ( rule__Vector3__Group__3__Impl )
            // InternalKinematicsParser.g:4247:2: rule__Vector3__Group__3__Impl
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
    // InternalKinematicsParser.g:4253:1: rule__Vector3__Group__3__Impl : ( RULE_END ) ;
    public final void rule__Vector3__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4257:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:4258:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:4258:1: ( RULE_END )
            // InternalKinematicsParser.g:4259:2: RULE_END
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
    // InternalKinematicsParser.g:4269:1: rule__Vector3__Group_2__0 : rule__Vector3__Group_2__0__Impl rule__Vector3__Group_2__1 ;
    public final void rule__Vector3__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4273:1: ( rule__Vector3__Group_2__0__Impl rule__Vector3__Group_2__1 )
            // InternalKinematicsParser.g:4274:2: rule__Vector3__Group_2__0__Impl rule__Vector3__Group_2__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalKinematicsParser.g:4281:1: rule__Vector3__Group_2__0__Impl : ( Xyz ) ;
    public final void rule__Vector3__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4285:1: ( ( Xyz ) )
            // InternalKinematicsParser.g:4286:1: ( Xyz )
            {
            // InternalKinematicsParser.g:4286:1: ( Xyz )
            // InternalKinematicsParser.g:4287:2: Xyz
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
    // InternalKinematicsParser.g:4296:1: rule__Vector3__Group_2__1 : rule__Vector3__Group_2__1__Impl ;
    public final void rule__Vector3__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4300:1: ( rule__Vector3__Group_2__1__Impl )
            // InternalKinematicsParser.g:4301:2: rule__Vector3__Group_2__1__Impl
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
    // InternalKinematicsParser.g:4307:1: rule__Vector3__Group_2__1__Impl : ( ( rule__Vector3__XyzAssignment_2_1 ) ) ;
    public final void rule__Vector3__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4311:1: ( ( ( rule__Vector3__XyzAssignment_2_1 ) ) )
            // InternalKinematicsParser.g:4312:1: ( ( rule__Vector3__XyzAssignment_2_1 ) )
            {
            // InternalKinematicsParser.g:4312:1: ( ( rule__Vector3__XyzAssignment_2_1 ) )
            // InternalKinematicsParser.g:4313:2: ( rule__Vector3__XyzAssignment_2_1 )
            {
             before(grammarAccess.getVector3Access().getXyzAssignment_2_1()); 
            // InternalKinematicsParser.g:4314:2: ( rule__Vector3__XyzAssignment_2_1 )
            // InternalKinematicsParser.g:4314:3: rule__Vector3__XyzAssignment_2_1
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
    // InternalKinematicsParser.g:4323:1: rule__Limit__Group__0 : rule__Limit__Group__0__Impl rule__Limit__Group__1 ;
    public final void rule__Limit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4327:1: ( rule__Limit__Group__0__Impl rule__Limit__Group__1 )
            // InternalKinematicsParser.g:4328:2: rule__Limit__Group__0__Impl rule__Limit__Group__1
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
    // InternalKinematicsParser.g:4335:1: rule__Limit__Group__0__Impl : ( () ) ;
    public final void rule__Limit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4339:1: ( ( () ) )
            // InternalKinematicsParser.g:4340:1: ( () )
            {
            // InternalKinematicsParser.g:4340:1: ( () )
            // InternalKinematicsParser.g:4341:2: ()
            {
             before(grammarAccess.getLimitAccess().getLimitAction_0()); 
            // InternalKinematicsParser.g:4342:2: ()
            // InternalKinematicsParser.g:4342:3: 
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
    // InternalKinematicsParser.g:4350:1: rule__Limit__Group__1 : rule__Limit__Group__1__Impl rule__Limit__Group__2 ;
    public final void rule__Limit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4354:1: ( rule__Limit__Group__1__Impl rule__Limit__Group__2 )
            // InternalKinematicsParser.g:4355:2: rule__Limit__Group__1__Impl rule__Limit__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalKinematicsParser.g:4362:1: rule__Limit__Group__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Limit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4366:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:4367:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:4367:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:4368:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:4377:1: rule__Limit__Group__2 : rule__Limit__Group__2__Impl rule__Limit__Group__3 ;
    public final void rule__Limit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4381:1: ( rule__Limit__Group__2__Impl rule__Limit__Group__3 )
            // InternalKinematicsParser.g:4382:2: rule__Limit__Group__2__Impl rule__Limit__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalKinematicsParser.g:4389:1: rule__Limit__Group__2__Impl : ( ( rule__Limit__Group_2__0 )? ) ;
    public final void rule__Limit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4393:1: ( ( ( rule__Limit__Group_2__0 )? ) )
            // InternalKinematicsParser.g:4394:1: ( ( rule__Limit__Group_2__0 )? )
            {
            // InternalKinematicsParser.g:4394:1: ( ( rule__Limit__Group_2__0 )? )
            // InternalKinematicsParser.g:4395:2: ( rule__Limit__Group_2__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_2()); 
            // InternalKinematicsParser.g:4396:2: ( rule__Limit__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Effort) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalKinematicsParser.g:4396:3: rule__Limit__Group_2__0
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
    // InternalKinematicsParser.g:4404:1: rule__Limit__Group__3 : rule__Limit__Group__3__Impl rule__Limit__Group__4 ;
    public final void rule__Limit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4408:1: ( rule__Limit__Group__3__Impl rule__Limit__Group__4 )
            // InternalKinematicsParser.g:4409:2: rule__Limit__Group__3__Impl rule__Limit__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalKinematicsParser.g:4416:1: rule__Limit__Group__3__Impl : ( ( rule__Limit__Group_3__0 )? ) ;
    public final void rule__Limit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4420:1: ( ( ( rule__Limit__Group_3__0 )? ) )
            // InternalKinematicsParser.g:4421:1: ( ( rule__Limit__Group_3__0 )? )
            {
            // InternalKinematicsParser.g:4421:1: ( ( rule__Limit__Group_3__0 )? )
            // InternalKinematicsParser.g:4422:2: ( rule__Limit__Group_3__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_3()); 
            // InternalKinematicsParser.g:4423:2: ( rule__Limit__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Lower) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalKinematicsParser.g:4423:3: rule__Limit__Group_3__0
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
    // InternalKinematicsParser.g:4431:1: rule__Limit__Group__4 : rule__Limit__Group__4__Impl rule__Limit__Group__5 ;
    public final void rule__Limit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4435:1: ( rule__Limit__Group__4__Impl rule__Limit__Group__5 )
            // InternalKinematicsParser.g:4436:2: rule__Limit__Group__4__Impl rule__Limit__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalKinematicsParser.g:4443:1: rule__Limit__Group__4__Impl : ( ( rule__Limit__Group_4__0 )? ) ;
    public final void rule__Limit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4447:1: ( ( ( rule__Limit__Group_4__0 )? ) )
            // InternalKinematicsParser.g:4448:1: ( ( rule__Limit__Group_4__0 )? )
            {
            // InternalKinematicsParser.g:4448:1: ( ( rule__Limit__Group_4__0 )? )
            // InternalKinematicsParser.g:4449:2: ( rule__Limit__Group_4__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_4()); 
            // InternalKinematicsParser.g:4450:2: ( rule__Limit__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Upper) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalKinematicsParser.g:4450:3: rule__Limit__Group_4__0
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
    // InternalKinematicsParser.g:4458:1: rule__Limit__Group__5 : rule__Limit__Group__5__Impl rule__Limit__Group__6 ;
    public final void rule__Limit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4462:1: ( rule__Limit__Group__5__Impl rule__Limit__Group__6 )
            // InternalKinematicsParser.g:4463:2: rule__Limit__Group__5__Impl rule__Limit__Group__6
            {
            pushFollow(FOLLOW_33);
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
    // InternalKinematicsParser.g:4470:1: rule__Limit__Group__5__Impl : ( ( rule__Limit__Group_5__0 )? ) ;
    public final void rule__Limit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4474:1: ( ( ( rule__Limit__Group_5__0 )? ) )
            // InternalKinematicsParser.g:4475:1: ( ( rule__Limit__Group_5__0 )? )
            {
            // InternalKinematicsParser.g:4475:1: ( ( rule__Limit__Group_5__0 )? )
            // InternalKinematicsParser.g:4476:2: ( rule__Limit__Group_5__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_5()); 
            // InternalKinematicsParser.g:4477:2: ( rule__Limit__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Velocity) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalKinematicsParser.g:4477:3: rule__Limit__Group_5__0
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
    // InternalKinematicsParser.g:4485:1: rule__Limit__Group__6 : rule__Limit__Group__6__Impl ;
    public final void rule__Limit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4489:1: ( rule__Limit__Group__6__Impl )
            // InternalKinematicsParser.g:4490:2: rule__Limit__Group__6__Impl
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
    // InternalKinematicsParser.g:4496:1: rule__Limit__Group__6__Impl : ( RULE_END ) ;
    public final void rule__Limit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4500:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:4501:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:4501:1: ( RULE_END )
            // InternalKinematicsParser.g:4502:2: RULE_END
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
    // InternalKinematicsParser.g:4512:1: rule__Limit__Group_2__0 : rule__Limit__Group_2__0__Impl rule__Limit__Group_2__1 ;
    public final void rule__Limit__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4516:1: ( rule__Limit__Group_2__0__Impl rule__Limit__Group_2__1 )
            // InternalKinematicsParser.g:4517:2: rule__Limit__Group_2__0__Impl rule__Limit__Group_2__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalKinematicsParser.g:4524:1: rule__Limit__Group_2__0__Impl : ( Effort ) ;
    public final void rule__Limit__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4528:1: ( ( Effort ) )
            // InternalKinematicsParser.g:4529:1: ( Effort )
            {
            // InternalKinematicsParser.g:4529:1: ( Effort )
            // InternalKinematicsParser.g:4530:2: Effort
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
    // InternalKinematicsParser.g:4539:1: rule__Limit__Group_2__1 : rule__Limit__Group_2__1__Impl ;
    public final void rule__Limit__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4543:1: ( rule__Limit__Group_2__1__Impl )
            // InternalKinematicsParser.g:4544:2: rule__Limit__Group_2__1__Impl
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
    // InternalKinematicsParser.g:4550:1: rule__Limit__Group_2__1__Impl : ( ( rule__Limit__EffortAssignment_2_1 ) ) ;
    public final void rule__Limit__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4554:1: ( ( ( rule__Limit__EffortAssignment_2_1 ) ) )
            // InternalKinematicsParser.g:4555:1: ( ( rule__Limit__EffortAssignment_2_1 ) )
            {
            // InternalKinematicsParser.g:4555:1: ( ( rule__Limit__EffortAssignment_2_1 ) )
            // InternalKinematicsParser.g:4556:2: ( rule__Limit__EffortAssignment_2_1 )
            {
             before(grammarAccess.getLimitAccess().getEffortAssignment_2_1()); 
            // InternalKinematicsParser.g:4557:2: ( rule__Limit__EffortAssignment_2_1 )
            // InternalKinematicsParser.g:4557:3: rule__Limit__EffortAssignment_2_1
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
    // InternalKinematicsParser.g:4566:1: rule__Limit__Group_3__0 : rule__Limit__Group_3__0__Impl rule__Limit__Group_3__1 ;
    public final void rule__Limit__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4570:1: ( rule__Limit__Group_3__0__Impl rule__Limit__Group_3__1 )
            // InternalKinematicsParser.g:4571:2: rule__Limit__Group_3__0__Impl rule__Limit__Group_3__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalKinematicsParser.g:4578:1: rule__Limit__Group_3__0__Impl : ( Lower ) ;
    public final void rule__Limit__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4582:1: ( ( Lower ) )
            // InternalKinematicsParser.g:4583:1: ( Lower )
            {
            // InternalKinematicsParser.g:4583:1: ( Lower )
            // InternalKinematicsParser.g:4584:2: Lower
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
    // InternalKinematicsParser.g:4593:1: rule__Limit__Group_3__1 : rule__Limit__Group_3__1__Impl ;
    public final void rule__Limit__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4597:1: ( rule__Limit__Group_3__1__Impl )
            // InternalKinematicsParser.g:4598:2: rule__Limit__Group_3__1__Impl
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
    // InternalKinematicsParser.g:4604:1: rule__Limit__Group_3__1__Impl : ( ( rule__Limit__LowerAssignment_3_1 ) ) ;
    public final void rule__Limit__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4608:1: ( ( ( rule__Limit__LowerAssignment_3_1 ) ) )
            // InternalKinematicsParser.g:4609:1: ( ( rule__Limit__LowerAssignment_3_1 ) )
            {
            // InternalKinematicsParser.g:4609:1: ( ( rule__Limit__LowerAssignment_3_1 ) )
            // InternalKinematicsParser.g:4610:2: ( rule__Limit__LowerAssignment_3_1 )
            {
             before(grammarAccess.getLimitAccess().getLowerAssignment_3_1()); 
            // InternalKinematicsParser.g:4611:2: ( rule__Limit__LowerAssignment_3_1 )
            // InternalKinematicsParser.g:4611:3: rule__Limit__LowerAssignment_3_1
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
    // InternalKinematicsParser.g:4620:1: rule__Limit__Group_4__0 : rule__Limit__Group_4__0__Impl rule__Limit__Group_4__1 ;
    public final void rule__Limit__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4624:1: ( rule__Limit__Group_4__0__Impl rule__Limit__Group_4__1 )
            // InternalKinematicsParser.g:4625:2: rule__Limit__Group_4__0__Impl rule__Limit__Group_4__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalKinematicsParser.g:4632:1: rule__Limit__Group_4__0__Impl : ( Upper ) ;
    public final void rule__Limit__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4636:1: ( ( Upper ) )
            // InternalKinematicsParser.g:4637:1: ( Upper )
            {
            // InternalKinematicsParser.g:4637:1: ( Upper )
            // InternalKinematicsParser.g:4638:2: Upper
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
    // InternalKinematicsParser.g:4647:1: rule__Limit__Group_4__1 : rule__Limit__Group_4__1__Impl ;
    public final void rule__Limit__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4651:1: ( rule__Limit__Group_4__1__Impl )
            // InternalKinematicsParser.g:4652:2: rule__Limit__Group_4__1__Impl
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
    // InternalKinematicsParser.g:4658:1: rule__Limit__Group_4__1__Impl : ( ( rule__Limit__UpperAssignment_4_1 ) ) ;
    public final void rule__Limit__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4662:1: ( ( ( rule__Limit__UpperAssignment_4_1 ) ) )
            // InternalKinematicsParser.g:4663:1: ( ( rule__Limit__UpperAssignment_4_1 ) )
            {
            // InternalKinematicsParser.g:4663:1: ( ( rule__Limit__UpperAssignment_4_1 ) )
            // InternalKinematicsParser.g:4664:2: ( rule__Limit__UpperAssignment_4_1 )
            {
             before(grammarAccess.getLimitAccess().getUpperAssignment_4_1()); 
            // InternalKinematicsParser.g:4665:2: ( rule__Limit__UpperAssignment_4_1 )
            // InternalKinematicsParser.g:4665:3: rule__Limit__UpperAssignment_4_1
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
    // InternalKinematicsParser.g:4674:1: rule__Limit__Group_5__0 : rule__Limit__Group_5__0__Impl rule__Limit__Group_5__1 ;
    public final void rule__Limit__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4678:1: ( rule__Limit__Group_5__0__Impl rule__Limit__Group_5__1 )
            // InternalKinematicsParser.g:4679:2: rule__Limit__Group_5__0__Impl rule__Limit__Group_5__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalKinematicsParser.g:4686:1: rule__Limit__Group_5__0__Impl : ( Velocity ) ;
    public final void rule__Limit__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4690:1: ( ( Velocity ) )
            // InternalKinematicsParser.g:4691:1: ( Velocity )
            {
            // InternalKinematicsParser.g:4691:1: ( Velocity )
            // InternalKinematicsParser.g:4692:2: Velocity
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
    // InternalKinematicsParser.g:4701:1: rule__Limit__Group_5__1 : rule__Limit__Group_5__1__Impl ;
    public final void rule__Limit__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4705:1: ( rule__Limit__Group_5__1__Impl )
            // InternalKinematicsParser.g:4706:2: rule__Limit__Group_5__1__Impl
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
    // InternalKinematicsParser.g:4712:1: rule__Limit__Group_5__1__Impl : ( ( rule__Limit__VelocityAssignment_5_1 ) ) ;
    public final void rule__Limit__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4716:1: ( ( ( rule__Limit__VelocityAssignment_5_1 ) ) )
            // InternalKinematicsParser.g:4717:1: ( ( rule__Limit__VelocityAssignment_5_1 ) )
            {
            // InternalKinematicsParser.g:4717:1: ( ( rule__Limit__VelocityAssignment_5_1 ) )
            // InternalKinematicsParser.g:4718:2: ( rule__Limit__VelocityAssignment_5_1 )
            {
             before(grammarAccess.getLimitAccess().getVelocityAssignment_5_1()); 
            // InternalKinematicsParser.g:4719:2: ( rule__Limit__VelocityAssignment_5_1 )
            // InternalKinematicsParser.g:4719:3: rule__Limit__VelocityAssignment_5_1
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
    // InternalKinematicsParser.g:4728:1: rule__Inertial__Group__0 : rule__Inertial__Group__0__Impl rule__Inertial__Group__1 ;
    public final void rule__Inertial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4732:1: ( rule__Inertial__Group__0__Impl rule__Inertial__Group__1 )
            // InternalKinematicsParser.g:4733:2: rule__Inertial__Group__0__Impl rule__Inertial__Group__1
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
    // InternalKinematicsParser.g:4740:1: rule__Inertial__Group__0__Impl : ( () ) ;
    public final void rule__Inertial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4744:1: ( ( () ) )
            // InternalKinematicsParser.g:4745:1: ( () )
            {
            // InternalKinematicsParser.g:4745:1: ( () )
            // InternalKinematicsParser.g:4746:2: ()
            {
             before(grammarAccess.getInertialAccess().getInertialAction_0()); 
            // InternalKinematicsParser.g:4747:2: ()
            // InternalKinematicsParser.g:4747:3: 
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
    // InternalKinematicsParser.g:4755:1: rule__Inertial__Group__1 : rule__Inertial__Group__1__Impl rule__Inertial__Group__2 ;
    public final void rule__Inertial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4759:1: ( rule__Inertial__Group__1__Impl rule__Inertial__Group__2 )
            // InternalKinematicsParser.g:4760:2: rule__Inertial__Group__1__Impl rule__Inertial__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalKinematicsParser.g:4767:1: rule__Inertial__Group__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Inertial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4771:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:4772:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:4772:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:4773:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:4782:1: rule__Inertial__Group__2 : rule__Inertial__Group__2__Impl rule__Inertial__Group__3 ;
    public final void rule__Inertial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4786:1: ( rule__Inertial__Group__2__Impl rule__Inertial__Group__3 )
            // InternalKinematicsParser.g:4787:2: rule__Inertial__Group__2__Impl rule__Inertial__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalKinematicsParser.g:4794:1: rule__Inertial__Group__2__Impl : ( ( rule__Inertial__Group_2__0 )? ) ;
    public final void rule__Inertial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4798:1: ( ( ( rule__Inertial__Group_2__0 )? ) )
            // InternalKinematicsParser.g:4799:1: ( ( rule__Inertial__Group_2__0 )? )
            {
            // InternalKinematicsParser.g:4799:1: ( ( rule__Inertial__Group_2__0 )? )
            // InternalKinematicsParser.g:4800:2: ( rule__Inertial__Group_2__0 )?
            {
             before(grammarAccess.getInertialAccess().getGroup_2()); 
            // InternalKinematicsParser.g:4801:2: ( rule__Inertial__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Origin) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalKinematicsParser.g:4801:3: rule__Inertial__Group_2__0
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
    // InternalKinematicsParser.g:4809:1: rule__Inertial__Group__3 : rule__Inertial__Group__3__Impl rule__Inertial__Group__4 ;
    public final void rule__Inertial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4813:1: ( rule__Inertial__Group__3__Impl rule__Inertial__Group__4 )
            // InternalKinematicsParser.g:4814:2: rule__Inertial__Group__3__Impl rule__Inertial__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalKinematicsParser.g:4821:1: rule__Inertial__Group__3__Impl : ( ( rule__Inertial__Group_3__0 )? ) ;
    public final void rule__Inertial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4825:1: ( ( ( rule__Inertial__Group_3__0 )? ) )
            // InternalKinematicsParser.g:4826:1: ( ( rule__Inertial__Group_3__0 )? )
            {
            // InternalKinematicsParser.g:4826:1: ( ( rule__Inertial__Group_3__0 )? )
            // InternalKinematicsParser.g:4827:2: ( rule__Inertial__Group_3__0 )?
            {
             before(grammarAccess.getInertialAccess().getGroup_3()); 
            // InternalKinematicsParser.g:4828:2: ( rule__Inertial__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Mass) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalKinematicsParser.g:4828:3: rule__Inertial__Group_3__0
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
    // InternalKinematicsParser.g:4836:1: rule__Inertial__Group__4 : rule__Inertial__Group__4__Impl rule__Inertial__Group__5 ;
    public final void rule__Inertial__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4840:1: ( rule__Inertial__Group__4__Impl rule__Inertial__Group__5 )
            // InternalKinematicsParser.g:4841:2: rule__Inertial__Group__4__Impl rule__Inertial__Group__5
            {
            pushFollow(FOLLOW_34);
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
    // InternalKinematicsParser.g:4848:1: rule__Inertial__Group__4__Impl : ( ( rule__Inertial__Group_4__0 )? ) ;
    public final void rule__Inertial__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4852:1: ( ( ( rule__Inertial__Group_4__0 )? ) )
            // InternalKinematicsParser.g:4853:1: ( ( rule__Inertial__Group_4__0 )? )
            {
            // InternalKinematicsParser.g:4853:1: ( ( rule__Inertial__Group_4__0 )? )
            // InternalKinematicsParser.g:4854:2: ( rule__Inertial__Group_4__0 )?
            {
             before(grammarAccess.getInertialAccess().getGroup_4()); 
            // InternalKinematicsParser.g:4855:2: ( rule__Inertial__Group_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Inertia) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalKinematicsParser.g:4855:3: rule__Inertial__Group_4__0
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
    // InternalKinematicsParser.g:4863:1: rule__Inertial__Group__5 : rule__Inertial__Group__5__Impl ;
    public final void rule__Inertial__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4867:1: ( rule__Inertial__Group__5__Impl )
            // InternalKinematicsParser.g:4868:2: rule__Inertial__Group__5__Impl
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
    // InternalKinematicsParser.g:4874:1: rule__Inertial__Group__5__Impl : ( RULE_END ) ;
    public final void rule__Inertial__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4878:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:4879:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:4879:1: ( RULE_END )
            // InternalKinematicsParser.g:4880:2: RULE_END
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
    // InternalKinematicsParser.g:4890:1: rule__Inertial__Group_2__0 : rule__Inertial__Group_2__0__Impl rule__Inertial__Group_2__1 ;
    public final void rule__Inertial__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4894:1: ( rule__Inertial__Group_2__0__Impl rule__Inertial__Group_2__1 )
            // InternalKinematicsParser.g:4895:2: rule__Inertial__Group_2__0__Impl rule__Inertial__Group_2__1
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
    // InternalKinematicsParser.g:4902:1: rule__Inertial__Group_2__0__Impl : ( Origin ) ;
    public final void rule__Inertial__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4906:1: ( ( Origin ) )
            // InternalKinematicsParser.g:4907:1: ( Origin )
            {
            // InternalKinematicsParser.g:4907:1: ( Origin )
            // InternalKinematicsParser.g:4908:2: Origin
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
    // InternalKinematicsParser.g:4917:1: rule__Inertial__Group_2__1 : rule__Inertial__Group_2__1__Impl ;
    public final void rule__Inertial__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4921:1: ( rule__Inertial__Group_2__1__Impl )
            // InternalKinematicsParser.g:4922:2: rule__Inertial__Group_2__1__Impl
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
    // InternalKinematicsParser.g:4928:1: rule__Inertial__Group_2__1__Impl : ( ( rule__Inertial__OriginAssignment_2_1 ) ) ;
    public final void rule__Inertial__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4932:1: ( ( ( rule__Inertial__OriginAssignment_2_1 ) ) )
            // InternalKinematicsParser.g:4933:1: ( ( rule__Inertial__OriginAssignment_2_1 ) )
            {
            // InternalKinematicsParser.g:4933:1: ( ( rule__Inertial__OriginAssignment_2_1 ) )
            // InternalKinematicsParser.g:4934:2: ( rule__Inertial__OriginAssignment_2_1 )
            {
             before(grammarAccess.getInertialAccess().getOriginAssignment_2_1()); 
            // InternalKinematicsParser.g:4935:2: ( rule__Inertial__OriginAssignment_2_1 )
            // InternalKinematicsParser.g:4935:3: rule__Inertial__OriginAssignment_2_1
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
    // InternalKinematicsParser.g:4944:1: rule__Inertial__Group_3__0 : rule__Inertial__Group_3__0__Impl rule__Inertial__Group_3__1 ;
    public final void rule__Inertial__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4948:1: ( rule__Inertial__Group_3__0__Impl rule__Inertial__Group_3__1 )
            // InternalKinematicsParser.g:4949:2: rule__Inertial__Group_3__0__Impl rule__Inertial__Group_3__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalKinematicsParser.g:4956:1: rule__Inertial__Group_3__0__Impl : ( Mass ) ;
    public final void rule__Inertial__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4960:1: ( ( Mass ) )
            // InternalKinematicsParser.g:4961:1: ( Mass )
            {
            // InternalKinematicsParser.g:4961:1: ( Mass )
            // InternalKinematicsParser.g:4962:2: Mass
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
    // InternalKinematicsParser.g:4971:1: rule__Inertial__Group_3__1 : rule__Inertial__Group_3__1__Impl ;
    public final void rule__Inertial__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4975:1: ( rule__Inertial__Group_3__1__Impl )
            // InternalKinematicsParser.g:4976:2: rule__Inertial__Group_3__1__Impl
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
    // InternalKinematicsParser.g:4982:1: rule__Inertial__Group_3__1__Impl : ( ( rule__Inertial__MassAssignment_3_1 ) ) ;
    public final void rule__Inertial__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:4986:1: ( ( ( rule__Inertial__MassAssignment_3_1 ) ) )
            // InternalKinematicsParser.g:4987:1: ( ( rule__Inertial__MassAssignment_3_1 ) )
            {
            // InternalKinematicsParser.g:4987:1: ( ( rule__Inertial__MassAssignment_3_1 ) )
            // InternalKinematicsParser.g:4988:2: ( rule__Inertial__MassAssignment_3_1 )
            {
             before(grammarAccess.getInertialAccess().getMassAssignment_3_1()); 
            // InternalKinematicsParser.g:4989:2: ( rule__Inertial__MassAssignment_3_1 )
            // InternalKinematicsParser.g:4989:3: rule__Inertial__MassAssignment_3_1
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
    // InternalKinematicsParser.g:4998:1: rule__Inertial__Group_4__0 : rule__Inertial__Group_4__0__Impl rule__Inertial__Group_4__1 ;
    public final void rule__Inertial__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5002:1: ( rule__Inertial__Group_4__0__Impl rule__Inertial__Group_4__1 )
            // InternalKinematicsParser.g:5003:2: rule__Inertial__Group_4__0__Impl rule__Inertial__Group_4__1
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
    // InternalKinematicsParser.g:5010:1: rule__Inertial__Group_4__0__Impl : ( Inertia ) ;
    public final void rule__Inertial__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5014:1: ( ( Inertia ) )
            // InternalKinematicsParser.g:5015:1: ( Inertia )
            {
            // InternalKinematicsParser.g:5015:1: ( Inertia )
            // InternalKinematicsParser.g:5016:2: Inertia
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
    // InternalKinematicsParser.g:5025:1: rule__Inertial__Group_4__1 : rule__Inertial__Group_4__1__Impl ;
    public final void rule__Inertial__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5029:1: ( rule__Inertial__Group_4__1__Impl )
            // InternalKinematicsParser.g:5030:2: rule__Inertial__Group_4__1__Impl
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
    // InternalKinematicsParser.g:5036:1: rule__Inertial__Group_4__1__Impl : ( ( rule__Inertial__InertiaAssignment_4_1 ) ) ;
    public final void rule__Inertial__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5040:1: ( ( ( rule__Inertial__InertiaAssignment_4_1 ) ) )
            // InternalKinematicsParser.g:5041:1: ( ( rule__Inertial__InertiaAssignment_4_1 ) )
            {
            // InternalKinematicsParser.g:5041:1: ( ( rule__Inertial__InertiaAssignment_4_1 ) )
            // InternalKinematicsParser.g:5042:2: ( rule__Inertial__InertiaAssignment_4_1 )
            {
             before(grammarAccess.getInertialAccess().getInertiaAssignment_4_1()); 
            // InternalKinematicsParser.g:5043:2: ( rule__Inertial__InertiaAssignment_4_1 )
            // InternalKinematicsParser.g:5043:3: rule__Inertial__InertiaAssignment_4_1
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
    // InternalKinematicsParser.g:5052:1: rule__Visual__Group__0 : rule__Visual__Group__0__Impl rule__Visual__Group__1 ;
    public final void rule__Visual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5056:1: ( rule__Visual__Group__0__Impl rule__Visual__Group__1 )
            // InternalKinematicsParser.g:5057:2: rule__Visual__Group__0__Impl rule__Visual__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalKinematicsParser.g:5064:1: rule__Visual__Group__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Visual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5068:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:5069:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:5069:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:5070:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:5079:1: rule__Visual__Group__1 : rule__Visual__Group__1__Impl rule__Visual__Group__2 ;
    public final void rule__Visual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5083:1: ( rule__Visual__Group__1__Impl rule__Visual__Group__2 )
            // InternalKinematicsParser.g:5084:2: rule__Visual__Group__1__Impl rule__Visual__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalKinematicsParser.g:5091:1: rule__Visual__Group__1__Impl : ( ( rule__Visual__Group_1__0 )? ) ;
    public final void rule__Visual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5095:1: ( ( ( rule__Visual__Group_1__0 )? ) )
            // InternalKinematicsParser.g:5096:1: ( ( rule__Visual__Group_1__0 )? )
            {
            // InternalKinematicsParser.g:5096:1: ( ( rule__Visual__Group_1__0 )? )
            // InternalKinematicsParser.g:5097:2: ( rule__Visual__Group_1__0 )?
            {
             before(grammarAccess.getVisualAccess().getGroup_1()); 
            // InternalKinematicsParser.g:5098:2: ( rule__Visual__Group_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Origin) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalKinematicsParser.g:5098:3: rule__Visual__Group_1__0
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
    // InternalKinematicsParser.g:5106:1: rule__Visual__Group__2 : rule__Visual__Group__2__Impl rule__Visual__Group__3 ;
    public final void rule__Visual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5110:1: ( rule__Visual__Group__2__Impl rule__Visual__Group__3 )
            // InternalKinematicsParser.g:5111:2: rule__Visual__Group__2__Impl rule__Visual__Group__3
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
    // InternalKinematicsParser.g:5118:1: rule__Visual__Group__2__Impl : ( Geometry ) ;
    public final void rule__Visual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5122:1: ( ( Geometry ) )
            // InternalKinematicsParser.g:5123:1: ( Geometry )
            {
            // InternalKinematicsParser.g:5123:1: ( Geometry )
            // InternalKinematicsParser.g:5124:2: Geometry
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
    // InternalKinematicsParser.g:5133:1: rule__Visual__Group__3 : rule__Visual__Group__3__Impl rule__Visual__Group__4 ;
    public final void rule__Visual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5137:1: ( rule__Visual__Group__3__Impl rule__Visual__Group__4 )
            // InternalKinematicsParser.g:5138:2: rule__Visual__Group__3__Impl rule__Visual__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalKinematicsParser.g:5145:1: rule__Visual__Group__3__Impl : ( ( rule__Visual__GeometryAssignment_3 ) ) ;
    public final void rule__Visual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5149:1: ( ( ( rule__Visual__GeometryAssignment_3 ) ) )
            // InternalKinematicsParser.g:5150:1: ( ( rule__Visual__GeometryAssignment_3 ) )
            {
            // InternalKinematicsParser.g:5150:1: ( ( rule__Visual__GeometryAssignment_3 ) )
            // InternalKinematicsParser.g:5151:2: ( rule__Visual__GeometryAssignment_3 )
            {
             before(grammarAccess.getVisualAccess().getGeometryAssignment_3()); 
            // InternalKinematicsParser.g:5152:2: ( rule__Visual__GeometryAssignment_3 )
            // InternalKinematicsParser.g:5152:3: rule__Visual__GeometryAssignment_3
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
    // InternalKinematicsParser.g:5160:1: rule__Visual__Group__4 : rule__Visual__Group__4__Impl ;
    public final void rule__Visual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5164:1: ( rule__Visual__Group__4__Impl )
            // InternalKinematicsParser.g:5165:2: rule__Visual__Group__4__Impl
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
    // InternalKinematicsParser.g:5171:1: rule__Visual__Group__4__Impl : ( RULE_END ) ;
    public final void rule__Visual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5175:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:5176:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:5176:1: ( RULE_END )
            // InternalKinematicsParser.g:5177:2: RULE_END
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
    // InternalKinematicsParser.g:5187:1: rule__Visual__Group_1__0 : rule__Visual__Group_1__0__Impl rule__Visual__Group_1__1 ;
    public final void rule__Visual__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5191:1: ( rule__Visual__Group_1__0__Impl rule__Visual__Group_1__1 )
            // InternalKinematicsParser.g:5192:2: rule__Visual__Group_1__0__Impl rule__Visual__Group_1__1
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
    // InternalKinematicsParser.g:5199:1: rule__Visual__Group_1__0__Impl : ( Origin ) ;
    public final void rule__Visual__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5203:1: ( ( Origin ) )
            // InternalKinematicsParser.g:5204:1: ( Origin )
            {
            // InternalKinematicsParser.g:5204:1: ( Origin )
            // InternalKinematicsParser.g:5205:2: Origin
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
    // InternalKinematicsParser.g:5214:1: rule__Visual__Group_1__1 : rule__Visual__Group_1__1__Impl ;
    public final void rule__Visual__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5218:1: ( rule__Visual__Group_1__1__Impl )
            // InternalKinematicsParser.g:5219:2: rule__Visual__Group_1__1__Impl
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
    // InternalKinematicsParser.g:5225:1: rule__Visual__Group_1__1__Impl : ( ( rule__Visual__OriginAssignment_1_1 ) ) ;
    public final void rule__Visual__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5229:1: ( ( ( rule__Visual__OriginAssignment_1_1 ) ) )
            // InternalKinematicsParser.g:5230:1: ( ( rule__Visual__OriginAssignment_1_1 ) )
            {
            // InternalKinematicsParser.g:5230:1: ( ( rule__Visual__OriginAssignment_1_1 ) )
            // InternalKinematicsParser.g:5231:2: ( rule__Visual__OriginAssignment_1_1 )
            {
             before(grammarAccess.getVisualAccess().getOriginAssignment_1_1()); 
            // InternalKinematicsParser.g:5232:2: ( rule__Visual__OriginAssignment_1_1 )
            // InternalKinematicsParser.g:5232:3: rule__Visual__OriginAssignment_1_1
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
    // InternalKinematicsParser.g:5241:1: rule__Collision__Group__0 : rule__Collision__Group__0__Impl rule__Collision__Group__1 ;
    public final void rule__Collision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5245:1: ( rule__Collision__Group__0__Impl rule__Collision__Group__1 )
            // InternalKinematicsParser.g:5246:2: rule__Collision__Group__0__Impl rule__Collision__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalKinematicsParser.g:5253:1: rule__Collision__Group__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Collision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5257:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:5258:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:5258:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:5259:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:5268:1: rule__Collision__Group__1 : rule__Collision__Group__1__Impl rule__Collision__Group__2 ;
    public final void rule__Collision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5272:1: ( rule__Collision__Group__1__Impl rule__Collision__Group__2 )
            // InternalKinematicsParser.g:5273:2: rule__Collision__Group__1__Impl rule__Collision__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalKinematicsParser.g:5280:1: rule__Collision__Group__1__Impl : ( ( rule__Collision__Group_1__0 )? ) ;
    public final void rule__Collision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5284:1: ( ( ( rule__Collision__Group_1__0 )? ) )
            // InternalKinematicsParser.g:5285:1: ( ( rule__Collision__Group_1__0 )? )
            {
            // InternalKinematicsParser.g:5285:1: ( ( rule__Collision__Group_1__0 )? )
            // InternalKinematicsParser.g:5286:2: ( rule__Collision__Group_1__0 )?
            {
             before(grammarAccess.getCollisionAccess().getGroup_1()); 
            // InternalKinematicsParser.g:5287:2: ( rule__Collision__Group_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Origin) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalKinematicsParser.g:5287:3: rule__Collision__Group_1__0
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
    // InternalKinematicsParser.g:5295:1: rule__Collision__Group__2 : rule__Collision__Group__2__Impl rule__Collision__Group__3 ;
    public final void rule__Collision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5299:1: ( rule__Collision__Group__2__Impl rule__Collision__Group__3 )
            // InternalKinematicsParser.g:5300:2: rule__Collision__Group__2__Impl rule__Collision__Group__3
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
    // InternalKinematicsParser.g:5307:1: rule__Collision__Group__2__Impl : ( Geometry ) ;
    public final void rule__Collision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5311:1: ( ( Geometry ) )
            // InternalKinematicsParser.g:5312:1: ( Geometry )
            {
            // InternalKinematicsParser.g:5312:1: ( Geometry )
            // InternalKinematicsParser.g:5313:2: Geometry
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
    // InternalKinematicsParser.g:5322:1: rule__Collision__Group__3 : rule__Collision__Group__3__Impl rule__Collision__Group__4 ;
    public final void rule__Collision__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5326:1: ( rule__Collision__Group__3__Impl rule__Collision__Group__4 )
            // InternalKinematicsParser.g:5327:2: rule__Collision__Group__3__Impl rule__Collision__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalKinematicsParser.g:5334:1: rule__Collision__Group__3__Impl : ( ( rule__Collision__GeometryAssignment_3 ) ) ;
    public final void rule__Collision__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5338:1: ( ( ( rule__Collision__GeometryAssignment_3 ) ) )
            // InternalKinematicsParser.g:5339:1: ( ( rule__Collision__GeometryAssignment_3 ) )
            {
            // InternalKinematicsParser.g:5339:1: ( ( rule__Collision__GeometryAssignment_3 ) )
            // InternalKinematicsParser.g:5340:2: ( rule__Collision__GeometryAssignment_3 )
            {
             before(grammarAccess.getCollisionAccess().getGeometryAssignment_3()); 
            // InternalKinematicsParser.g:5341:2: ( rule__Collision__GeometryAssignment_3 )
            // InternalKinematicsParser.g:5341:3: rule__Collision__GeometryAssignment_3
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
    // InternalKinematicsParser.g:5349:1: rule__Collision__Group__4 : rule__Collision__Group__4__Impl ;
    public final void rule__Collision__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5353:1: ( rule__Collision__Group__4__Impl )
            // InternalKinematicsParser.g:5354:2: rule__Collision__Group__4__Impl
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
    // InternalKinematicsParser.g:5360:1: rule__Collision__Group__4__Impl : ( RULE_END ) ;
    public final void rule__Collision__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5364:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:5365:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:5365:1: ( RULE_END )
            // InternalKinematicsParser.g:5366:2: RULE_END
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
    // InternalKinematicsParser.g:5376:1: rule__Collision__Group_1__0 : rule__Collision__Group_1__0__Impl rule__Collision__Group_1__1 ;
    public final void rule__Collision__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5380:1: ( rule__Collision__Group_1__0__Impl rule__Collision__Group_1__1 )
            // InternalKinematicsParser.g:5381:2: rule__Collision__Group_1__0__Impl rule__Collision__Group_1__1
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
    // InternalKinematicsParser.g:5388:1: rule__Collision__Group_1__0__Impl : ( Origin ) ;
    public final void rule__Collision__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5392:1: ( ( Origin ) )
            // InternalKinematicsParser.g:5393:1: ( Origin )
            {
            // InternalKinematicsParser.g:5393:1: ( Origin )
            // InternalKinematicsParser.g:5394:2: Origin
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
    // InternalKinematicsParser.g:5403:1: rule__Collision__Group_1__1 : rule__Collision__Group_1__1__Impl ;
    public final void rule__Collision__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5407:1: ( rule__Collision__Group_1__1__Impl )
            // InternalKinematicsParser.g:5408:2: rule__Collision__Group_1__1__Impl
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
    // InternalKinematicsParser.g:5414:1: rule__Collision__Group_1__1__Impl : ( ( rule__Collision__OriginAssignment_1_1 ) ) ;
    public final void rule__Collision__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5418:1: ( ( ( rule__Collision__OriginAssignment_1_1 ) ) )
            // InternalKinematicsParser.g:5419:1: ( ( rule__Collision__OriginAssignment_1_1 ) )
            {
            // InternalKinematicsParser.g:5419:1: ( ( rule__Collision__OriginAssignment_1_1 ) )
            // InternalKinematicsParser.g:5420:2: ( rule__Collision__OriginAssignment_1_1 )
            {
             before(grammarAccess.getCollisionAccess().getOriginAssignment_1_1()); 
            // InternalKinematicsParser.g:5421:2: ( rule__Collision__OriginAssignment_1_1 )
            // InternalKinematicsParser.g:5421:3: rule__Collision__OriginAssignment_1_1
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
    // InternalKinematicsParser.g:5430:1: rule__Mass__Group__0 : rule__Mass__Group__0__Impl rule__Mass__Group__1 ;
    public final void rule__Mass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5434:1: ( rule__Mass__Group__0__Impl rule__Mass__Group__1 )
            // InternalKinematicsParser.g:5435:2: rule__Mass__Group__0__Impl rule__Mass__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalKinematicsParser.g:5442:1: rule__Mass__Group__0__Impl : ( () ) ;
    public final void rule__Mass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5446:1: ( ( () ) )
            // InternalKinematicsParser.g:5447:1: ( () )
            {
            // InternalKinematicsParser.g:5447:1: ( () )
            // InternalKinematicsParser.g:5448:2: ()
            {
             before(grammarAccess.getMassAccess().getMassAction_0()); 
            // InternalKinematicsParser.g:5449:2: ()
            // InternalKinematicsParser.g:5449:3: 
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
    // InternalKinematicsParser.g:5457:1: rule__Mass__Group__1 : rule__Mass__Group__1__Impl ;
    public final void rule__Mass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5461:1: ( rule__Mass__Group__1__Impl )
            // InternalKinematicsParser.g:5462:2: rule__Mass__Group__1__Impl
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
    // InternalKinematicsParser.g:5468:1: rule__Mass__Group__1__Impl : ( ( rule__Mass__ValueAssignment_1 ) ) ;
    public final void rule__Mass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5472:1: ( ( ( rule__Mass__ValueAssignment_1 ) ) )
            // InternalKinematicsParser.g:5473:1: ( ( rule__Mass__ValueAssignment_1 ) )
            {
            // InternalKinematicsParser.g:5473:1: ( ( rule__Mass__ValueAssignment_1 ) )
            // InternalKinematicsParser.g:5474:2: ( rule__Mass__ValueAssignment_1 )
            {
             before(grammarAccess.getMassAccess().getValueAssignment_1()); 
            // InternalKinematicsParser.g:5475:2: ( rule__Mass__ValueAssignment_1 )
            // InternalKinematicsParser.g:5475:3: rule__Mass__ValueAssignment_1
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
    // InternalKinematicsParser.g:5484:1: rule__Inertia__Group__0 : rule__Inertia__Group__0__Impl rule__Inertia__Group__1 ;
    public final void rule__Inertia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5488:1: ( rule__Inertia__Group__0__Impl rule__Inertia__Group__1 )
            // InternalKinematicsParser.g:5489:2: rule__Inertia__Group__0__Impl rule__Inertia__Group__1
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
    // InternalKinematicsParser.g:5496:1: rule__Inertia__Group__0__Impl : ( () ) ;
    public final void rule__Inertia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5500:1: ( ( () ) )
            // InternalKinematicsParser.g:5501:1: ( () )
            {
            // InternalKinematicsParser.g:5501:1: ( () )
            // InternalKinematicsParser.g:5502:2: ()
            {
             before(grammarAccess.getInertiaAccess().getInertiaAction_0()); 
            // InternalKinematicsParser.g:5503:2: ()
            // InternalKinematicsParser.g:5503:3: 
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
    // InternalKinematicsParser.g:5511:1: rule__Inertia__Group__1 : rule__Inertia__Group__1__Impl rule__Inertia__Group__2 ;
    public final void rule__Inertia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5515:1: ( rule__Inertia__Group__1__Impl rule__Inertia__Group__2 )
            // InternalKinematicsParser.g:5516:2: rule__Inertia__Group__1__Impl rule__Inertia__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalKinematicsParser.g:5523:1: rule__Inertia__Group__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Inertia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5527:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:5528:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:5528:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:5529:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:5538:1: rule__Inertia__Group__2 : rule__Inertia__Group__2__Impl rule__Inertia__Group__3 ;
    public final void rule__Inertia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5542:1: ( rule__Inertia__Group__2__Impl rule__Inertia__Group__3 )
            // InternalKinematicsParser.g:5543:2: rule__Inertia__Group__2__Impl rule__Inertia__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalKinematicsParser.g:5550:1: rule__Inertia__Group__2__Impl : ( ( rule__Inertia__Group_2__0 )? ) ;
    public final void rule__Inertia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5554:1: ( ( ( rule__Inertia__Group_2__0 )? ) )
            // InternalKinematicsParser.g:5555:1: ( ( rule__Inertia__Group_2__0 )? )
            {
            // InternalKinematicsParser.g:5555:1: ( ( rule__Inertia__Group_2__0 )? )
            // InternalKinematicsParser.g:5556:2: ( rule__Inertia__Group_2__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_2()); 
            // InternalKinematicsParser.g:5557:2: ( rule__Inertia__Group_2__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==Ixx) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalKinematicsParser.g:5557:3: rule__Inertia__Group_2__0
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
    // InternalKinematicsParser.g:5565:1: rule__Inertia__Group__3 : rule__Inertia__Group__3__Impl rule__Inertia__Group__4 ;
    public final void rule__Inertia__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5569:1: ( rule__Inertia__Group__3__Impl rule__Inertia__Group__4 )
            // InternalKinematicsParser.g:5570:2: rule__Inertia__Group__3__Impl rule__Inertia__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalKinematicsParser.g:5577:1: rule__Inertia__Group__3__Impl : ( ( rule__Inertia__Group_3__0 )? ) ;
    public final void rule__Inertia__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5581:1: ( ( ( rule__Inertia__Group_3__0 )? ) )
            // InternalKinematicsParser.g:5582:1: ( ( rule__Inertia__Group_3__0 )? )
            {
            // InternalKinematicsParser.g:5582:1: ( ( rule__Inertia__Group_3__0 )? )
            // InternalKinematicsParser.g:5583:2: ( rule__Inertia__Group_3__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_3()); 
            // InternalKinematicsParser.g:5584:2: ( rule__Inertia__Group_3__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Ixy) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalKinematicsParser.g:5584:3: rule__Inertia__Group_3__0
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
    // InternalKinematicsParser.g:5592:1: rule__Inertia__Group__4 : rule__Inertia__Group__4__Impl rule__Inertia__Group__5 ;
    public final void rule__Inertia__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5596:1: ( rule__Inertia__Group__4__Impl rule__Inertia__Group__5 )
            // InternalKinematicsParser.g:5597:2: rule__Inertia__Group__4__Impl rule__Inertia__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalKinematicsParser.g:5604:1: rule__Inertia__Group__4__Impl : ( ( rule__Inertia__Group_4__0 )? ) ;
    public final void rule__Inertia__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5608:1: ( ( ( rule__Inertia__Group_4__0 )? ) )
            // InternalKinematicsParser.g:5609:1: ( ( rule__Inertia__Group_4__0 )? )
            {
            // InternalKinematicsParser.g:5609:1: ( ( rule__Inertia__Group_4__0 )? )
            // InternalKinematicsParser.g:5610:2: ( rule__Inertia__Group_4__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_4()); 
            // InternalKinematicsParser.g:5611:2: ( rule__Inertia__Group_4__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==Ixz) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalKinematicsParser.g:5611:3: rule__Inertia__Group_4__0
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
    // InternalKinematicsParser.g:5619:1: rule__Inertia__Group__5 : rule__Inertia__Group__5__Impl rule__Inertia__Group__6 ;
    public final void rule__Inertia__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5623:1: ( rule__Inertia__Group__5__Impl rule__Inertia__Group__6 )
            // InternalKinematicsParser.g:5624:2: rule__Inertia__Group__5__Impl rule__Inertia__Group__6
            {
            pushFollow(FOLLOW_37);
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
    // InternalKinematicsParser.g:5631:1: rule__Inertia__Group__5__Impl : ( ( rule__Inertia__Group_5__0 )? ) ;
    public final void rule__Inertia__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5635:1: ( ( ( rule__Inertia__Group_5__0 )? ) )
            // InternalKinematicsParser.g:5636:1: ( ( rule__Inertia__Group_5__0 )? )
            {
            // InternalKinematicsParser.g:5636:1: ( ( rule__Inertia__Group_5__0 )? )
            // InternalKinematicsParser.g:5637:2: ( rule__Inertia__Group_5__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_5()); 
            // InternalKinematicsParser.g:5638:2: ( rule__Inertia__Group_5__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Iyy) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalKinematicsParser.g:5638:3: rule__Inertia__Group_5__0
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
    // InternalKinematicsParser.g:5646:1: rule__Inertia__Group__6 : rule__Inertia__Group__6__Impl rule__Inertia__Group__7 ;
    public final void rule__Inertia__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5650:1: ( rule__Inertia__Group__6__Impl rule__Inertia__Group__7 )
            // InternalKinematicsParser.g:5651:2: rule__Inertia__Group__6__Impl rule__Inertia__Group__7
            {
            pushFollow(FOLLOW_37);
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
    // InternalKinematicsParser.g:5658:1: rule__Inertia__Group__6__Impl : ( ( rule__Inertia__Group_6__0 )? ) ;
    public final void rule__Inertia__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5662:1: ( ( ( rule__Inertia__Group_6__0 )? ) )
            // InternalKinematicsParser.g:5663:1: ( ( rule__Inertia__Group_6__0 )? )
            {
            // InternalKinematicsParser.g:5663:1: ( ( rule__Inertia__Group_6__0 )? )
            // InternalKinematicsParser.g:5664:2: ( rule__Inertia__Group_6__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_6()); 
            // InternalKinematicsParser.g:5665:2: ( rule__Inertia__Group_6__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Iyz) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalKinematicsParser.g:5665:3: rule__Inertia__Group_6__0
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
    // InternalKinematicsParser.g:5673:1: rule__Inertia__Group__7 : rule__Inertia__Group__7__Impl rule__Inertia__Group__8 ;
    public final void rule__Inertia__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5677:1: ( rule__Inertia__Group__7__Impl rule__Inertia__Group__8 )
            // InternalKinematicsParser.g:5678:2: rule__Inertia__Group__7__Impl rule__Inertia__Group__8
            {
            pushFollow(FOLLOW_37);
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
    // InternalKinematicsParser.g:5685:1: rule__Inertia__Group__7__Impl : ( ( rule__Inertia__Group_7__0 )? ) ;
    public final void rule__Inertia__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5689:1: ( ( ( rule__Inertia__Group_7__0 )? ) )
            // InternalKinematicsParser.g:5690:1: ( ( rule__Inertia__Group_7__0 )? )
            {
            // InternalKinematicsParser.g:5690:1: ( ( rule__Inertia__Group_7__0 )? )
            // InternalKinematicsParser.g:5691:2: ( rule__Inertia__Group_7__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_7()); 
            // InternalKinematicsParser.g:5692:2: ( rule__Inertia__Group_7__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==Izz) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalKinematicsParser.g:5692:3: rule__Inertia__Group_7__0
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
    // InternalKinematicsParser.g:5700:1: rule__Inertia__Group__8 : rule__Inertia__Group__8__Impl ;
    public final void rule__Inertia__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5704:1: ( rule__Inertia__Group__8__Impl )
            // InternalKinematicsParser.g:5705:2: rule__Inertia__Group__8__Impl
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
    // InternalKinematicsParser.g:5711:1: rule__Inertia__Group__8__Impl : ( RULE_END ) ;
    public final void rule__Inertia__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5715:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:5716:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:5716:1: ( RULE_END )
            // InternalKinematicsParser.g:5717:2: RULE_END
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
    // InternalKinematicsParser.g:5727:1: rule__Inertia__Group_2__0 : rule__Inertia__Group_2__0__Impl rule__Inertia__Group_2__1 ;
    public final void rule__Inertia__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5731:1: ( rule__Inertia__Group_2__0__Impl rule__Inertia__Group_2__1 )
            // InternalKinematicsParser.g:5732:2: rule__Inertia__Group_2__0__Impl rule__Inertia__Group_2__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalKinematicsParser.g:5739:1: rule__Inertia__Group_2__0__Impl : ( Ixx ) ;
    public final void rule__Inertia__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5743:1: ( ( Ixx ) )
            // InternalKinematicsParser.g:5744:1: ( Ixx )
            {
            // InternalKinematicsParser.g:5744:1: ( Ixx )
            // InternalKinematicsParser.g:5745:2: Ixx
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
    // InternalKinematicsParser.g:5754:1: rule__Inertia__Group_2__1 : rule__Inertia__Group_2__1__Impl ;
    public final void rule__Inertia__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5758:1: ( rule__Inertia__Group_2__1__Impl )
            // InternalKinematicsParser.g:5759:2: rule__Inertia__Group_2__1__Impl
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
    // InternalKinematicsParser.g:5765:1: rule__Inertia__Group_2__1__Impl : ( ( rule__Inertia__IxxAssignment_2_1 ) ) ;
    public final void rule__Inertia__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5769:1: ( ( ( rule__Inertia__IxxAssignment_2_1 ) ) )
            // InternalKinematicsParser.g:5770:1: ( ( rule__Inertia__IxxAssignment_2_1 ) )
            {
            // InternalKinematicsParser.g:5770:1: ( ( rule__Inertia__IxxAssignment_2_1 ) )
            // InternalKinematicsParser.g:5771:2: ( rule__Inertia__IxxAssignment_2_1 )
            {
             before(grammarAccess.getInertiaAccess().getIxxAssignment_2_1()); 
            // InternalKinematicsParser.g:5772:2: ( rule__Inertia__IxxAssignment_2_1 )
            // InternalKinematicsParser.g:5772:3: rule__Inertia__IxxAssignment_2_1
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
    // InternalKinematicsParser.g:5781:1: rule__Inertia__Group_3__0 : rule__Inertia__Group_3__0__Impl rule__Inertia__Group_3__1 ;
    public final void rule__Inertia__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5785:1: ( rule__Inertia__Group_3__0__Impl rule__Inertia__Group_3__1 )
            // InternalKinematicsParser.g:5786:2: rule__Inertia__Group_3__0__Impl rule__Inertia__Group_3__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalKinematicsParser.g:5793:1: rule__Inertia__Group_3__0__Impl : ( Ixy ) ;
    public final void rule__Inertia__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5797:1: ( ( Ixy ) )
            // InternalKinematicsParser.g:5798:1: ( Ixy )
            {
            // InternalKinematicsParser.g:5798:1: ( Ixy )
            // InternalKinematicsParser.g:5799:2: Ixy
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
    // InternalKinematicsParser.g:5808:1: rule__Inertia__Group_3__1 : rule__Inertia__Group_3__1__Impl ;
    public final void rule__Inertia__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5812:1: ( rule__Inertia__Group_3__1__Impl )
            // InternalKinematicsParser.g:5813:2: rule__Inertia__Group_3__1__Impl
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
    // InternalKinematicsParser.g:5819:1: rule__Inertia__Group_3__1__Impl : ( ( rule__Inertia__IxyAssignment_3_1 ) ) ;
    public final void rule__Inertia__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5823:1: ( ( ( rule__Inertia__IxyAssignment_3_1 ) ) )
            // InternalKinematicsParser.g:5824:1: ( ( rule__Inertia__IxyAssignment_3_1 ) )
            {
            // InternalKinematicsParser.g:5824:1: ( ( rule__Inertia__IxyAssignment_3_1 ) )
            // InternalKinematicsParser.g:5825:2: ( rule__Inertia__IxyAssignment_3_1 )
            {
             before(grammarAccess.getInertiaAccess().getIxyAssignment_3_1()); 
            // InternalKinematicsParser.g:5826:2: ( rule__Inertia__IxyAssignment_3_1 )
            // InternalKinematicsParser.g:5826:3: rule__Inertia__IxyAssignment_3_1
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
    // InternalKinematicsParser.g:5835:1: rule__Inertia__Group_4__0 : rule__Inertia__Group_4__0__Impl rule__Inertia__Group_4__1 ;
    public final void rule__Inertia__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5839:1: ( rule__Inertia__Group_4__0__Impl rule__Inertia__Group_4__1 )
            // InternalKinematicsParser.g:5840:2: rule__Inertia__Group_4__0__Impl rule__Inertia__Group_4__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalKinematicsParser.g:5847:1: rule__Inertia__Group_4__0__Impl : ( Ixz ) ;
    public final void rule__Inertia__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5851:1: ( ( Ixz ) )
            // InternalKinematicsParser.g:5852:1: ( Ixz )
            {
            // InternalKinematicsParser.g:5852:1: ( Ixz )
            // InternalKinematicsParser.g:5853:2: Ixz
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
    // InternalKinematicsParser.g:5862:1: rule__Inertia__Group_4__1 : rule__Inertia__Group_4__1__Impl ;
    public final void rule__Inertia__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5866:1: ( rule__Inertia__Group_4__1__Impl )
            // InternalKinematicsParser.g:5867:2: rule__Inertia__Group_4__1__Impl
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
    // InternalKinematicsParser.g:5873:1: rule__Inertia__Group_4__1__Impl : ( ( rule__Inertia__IxzAssignment_4_1 ) ) ;
    public final void rule__Inertia__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5877:1: ( ( ( rule__Inertia__IxzAssignment_4_1 ) ) )
            // InternalKinematicsParser.g:5878:1: ( ( rule__Inertia__IxzAssignment_4_1 ) )
            {
            // InternalKinematicsParser.g:5878:1: ( ( rule__Inertia__IxzAssignment_4_1 ) )
            // InternalKinematicsParser.g:5879:2: ( rule__Inertia__IxzAssignment_4_1 )
            {
             before(grammarAccess.getInertiaAccess().getIxzAssignment_4_1()); 
            // InternalKinematicsParser.g:5880:2: ( rule__Inertia__IxzAssignment_4_1 )
            // InternalKinematicsParser.g:5880:3: rule__Inertia__IxzAssignment_4_1
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
    // InternalKinematicsParser.g:5889:1: rule__Inertia__Group_5__0 : rule__Inertia__Group_5__0__Impl rule__Inertia__Group_5__1 ;
    public final void rule__Inertia__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5893:1: ( rule__Inertia__Group_5__0__Impl rule__Inertia__Group_5__1 )
            // InternalKinematicsParser.g:5894:2: rule__Inertia__Group_5__0__Impl rule__Inertia__Group_5__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalKinematicsParser.g:5901:1: rule__Inertia__Group_5__0__Impl : ( Iyy ) ;
    public final void rule__Inertia__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5905:1: ( ( Iyy ) )
            // InternalKinematicsParser.g:5906:1: ( Iyy )
            {
            // InternalKinematicsParser.g:5906:1: ( Iyy )
            // InternalKinematicsParser.g:5907:2: Iyy
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
    // InternalKinematicsParser.g:5916:1: rule__Inertia__Group_5__1 : rule__Inertia__Group_5__1__Impl ;
    public final void rule__Inertia__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5920:1: ( rule__Inertia__Group_5__1__Impl )
            // InternalKinematicsParser.g:5921:2: rule__Inertia__Group_5__1__Impl
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
    // InternalKinematicsParser.g:5927:1: rule__Inertia__Group_5__1__Impl : ( ( rule__Inertia__IyyAssignment_5_1 ) ) ;
    public final void rule__Inertia__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5931:1: ( ( ( rule__Inertia__IyyAssignment_5_1 ) ) )
            // InternalKinematicsParser.g:5932:1: ( ( rule__Inertia__IyyAssignment_5_1 ) )
            {
            // InternalKinematicsParser.g:5932:1: ( ( rule__Inertia__IyyAssignment_5_1 ) )
            // InternalKinematicsParser.g:5933:2: ( rule__Inertia__IyyAssignment_5_1 )
            {
             before(grammarAccess.getInertiaAccess().getIyyAssignment_5_1()); 
            // InternalKinematicsParser.g:5934:2: ( rule__Inertia__IyyAssignment_5_1 )
            // InternalKinematicsParser.g:5934:3: rule__Inertia__IyyAssignment_5_1
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
    // InternalKinematicsParser.g:5943:1: rule__Inertia__Group_6__0 : rule__Inertia__Group_6__0__Impl rule__Inertia__Group_6__1 ;
    public final void rule__Inertia__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5947:1: ( rule__Inertia__Group_6__0__Impl rule__Inertia__Group_6__1 )
            // InternalKinematicsParser.g:5948:2: rule__Inertia__Group_6__0__Impl rule__Inertia__Group_6__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalKinematicsParser.g:5955:1: rule__Inertia__Group_6__0__Impl : ( Iyz ) ;
    public final void rule__Inertia__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5959:1: ( ( Iyz ) )
            // InternalKinematicsParser.g:5960:1: ( Iyz )
            {
            // InternalKinematicsParser.g:5960:1: ( Iyz )
            // InternalKinematicsParser.g:5961:2: Iyz
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
    // InternalKinematicsParser.g:5970:1: rule__Inertia__Group_6__1 : rule__Inertia__Group_6__1__Impl ;
    public final void rule__Inertia__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5974:1: ( rule__Inertia__Group_6__1__Impl )
            // InternalKinematicsParser.g:5975:2: rule__Inertia__Group_6__1__Impl
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
    // InternalKinematicsParser.g:5981:1: rule__Inertia__Group_6__1__Impl : ( ( rule__Inertia__IyzAssignment_6_1 ) ) ;
    public final void rule__Inertia__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:5985:1: ( ( ( rule__Inertia__IyzAssignment_6_1 ) ) )
            // InternalKinematicsParser.g:5986:1: ( ( rule__Inertia__IyzAssignment_6_1 ) )
            {
            // InternalKinematicsParser.g:5986:1: ( ( rule__Inertia__IyzAssignment_6_1 ) )
            // InternalKinematicsParser.g:5987:2: ( rule__Inertia__IyzAssignment_6_1 )
            {
             before(grammarAccess.getInertiaAccess().getIyzAssignment_6_1()); 
            // InternalKinematicsParser.g:5988:2: ( rule__Inertia__IyzAssignment_6_1 )
            // InternalKinematicsParser.g:5988:3: rule__Inertia__IyzAssignment_6_1
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
    // InternalKinematicsParser.g:5997:1: rule__Inertia__Group_7__0 : rule__Inertia__Group_7__0__Impl rule__Inertia__Group_7__1 ;
    public final void rule__Inertia__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6001:1: ( rule__Inertia__Group_7__0__Impl rule__Inertia__Group_7__1 )
            // InternalKinematicsParser.g:6002:2: rule__Inertia__Group_7__0__Impl rule__Inertia__Group_7__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalKinematicsParser.g:6009:1: rule__Inertia__Group_7__0__Impl : ( Izz ) ;
    public final void rule__Inertia__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6013:1: ( ( Izz ) )
            // InternalKinematicsParser.g:6014:1: ( Izz )
            {
            // InternalKinematicsParser.g:6014:1: ( Izz )
            // InternalKinematicsParser.g:6015:2: Izz
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
    // InternalKinematicsParser.g:6024:1: rule__Inertia__Group_7__1 : rule__Inertia__Group_7__1__Impl ;
    public final void rule__Inertia__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6028:1: ( rule__Inertia__Group_7__1__Impl )
            // InternalKinematicsParser.g:6029:2: rule__Inertia__Group_7__1__Impl
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
    // InternalKinematicsParser.g:6035:1: rule__Inertia__Group_7__1__Impl : ( ( rule__Inertia__IzzAssignment_7_1 ) ) ;
    public final void rule__Inertia__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6039:1: ( ( ( rule__Inertia__IzzAssignment_7_1 ) ) )
            // InternalKinematicsParser.g:6040:1: ( ( rule__Inertia__IzzAssignment_7_1 ) )
            {
            // InternalKinematicsParser.g:6040:1: ( ( rule__Inertia__IzzAssignment_7_1 ) )
            // InternalKinematicsParser.g:6041:2: ( rule__Inertia__IzzAssignment_7_1 )
            {
             before(grammarAccess.getInertiaAccess().getIzzAssignment_7_1()); 
            // InternalKinematicsParser.g:6042:2: ( rule__Inertia__IzzAssignment_7_1 )
            // InternalKinematicsParser.g:6042:3: rule__Inertia__IzzAssignment_7_1
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
    // InternalKinematicsParser.g:6051:1: rule__Geometry__Group__0 : rule__Geometry__Group__0__Impl rule__Geometry__Group__1 ;
    public final void rule__Geometry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6055:1: ( rule__Geometry__Group__0__Impl rule__Geometry__Group__1 )
            // InternalKinematicsParser.g:6056:2: rule__Geometry__Group__0__Impl rule__Geometry__Group__1
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
    // InternalKinematicsParser.g:6063:1: rule__Geometry__Group__0__Impl : ( () ) ;
    public final void rule__Geometry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6067:1: ( ( () ) )
            // InternalKinematicsParser.g:6068:1: ( () )
            {
            // InternalKinematicsParser.g:6068:1: ( () )
            // InternalKinematicsParser.g:6069:2: ()
            {
             before(grammarAccess.getGeometryAccess().getGeometryAction_0()); 
            // InternalKinematicsParser.g:6070:2: ()
            // InternalKinematicsParser.g:6070:3: 
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
    // InternalKinematicsParser.g:6078:1: rule__Geometry__Group__1 : rule__Geometry__Group__1__Impl rule__Geometry__Group__2 ;
    public final void rule__Geometry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6082:1: ( rule__Geometry__Group__1__Impl rule__Geometry__Group__2 )
            // InternalKinematicsParser.g:6083:2: rule__Geometry__Group__1__Impl rule__Geometry__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalKinematicsParser.g:6090:1: rule__Geometry__Group__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Geometry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6094:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:6095:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:6095:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:6096:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:6105:1: rule__Geometry__Group__2 : rule__Geometry__Group__2__Impl rule__Geometry__Group__3 ;
    public final void rule__Geometry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6109:1: ( rule__Geometry__Group__2__Impl rule__Geometry__Group__3 )
            // InternalKinematicsParser.g:6110:2: rule__Geometry__Group__2__Impl rule__Geometry__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalKinematicsParser.g:6117:1: rule__Geometry__Group__2__Impl : ( ( rule__Geometry__Group_2__0 )? ) ;
    public final void rule__Geometry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6121:1: ( ( ( rule__Geometry__Group_2__0 )? ) )
            // InternalKinematicsParser.g:6122:1: ( ( rule__Geometry__Group_2__0 )? )
            {
            // InternalKinematicsParser.g:6122:1: ( ( rule__Geometry__Group_2__0 )? )
            // InternalKinematicsParser.g:6123:2: ( rule__Geometry__Group_2__0 )?
            {
             before(grammarAccess.getGeometryAccess().getGroup_2()); 
            // InternalKinematicsParser.g:6124:2: ( rule__Geometry__Group_2__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Box) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalKinematicsParser.g:6124:3: rule__Geometry__Group_2__0
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
    // InternalKinematicsParser.g:6132:1: rule__Geometry__Group__3 : rule__Geometry__Group__3__Impl rule__Geometry__Group__4 ;
    public final void rule__Geometry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6136:1: ( rule__Geometry__Group__3__Impl rule__Geometry__Group__4 )
            // InternalKinematicsParser.g:6137:2: rule__Geometry__Group__3__Impl rule__Geometry__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalKinematicsParser.g:6144:1: rule__Geometry__Group__3__Impl : ( ( rule__Geometry__Group_3__0 )? ) ;
    public final void rule__Geometry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6148:1: ( ( ( rule__Geometry__Group_3__0 )? ) )
            // InternalKinematicsParser.g:6149:1: ( ( rule__Geometry__Group_3__0 )? )
            {
            // InternalKinematicsParser.g:6149:1: ( ( rule__Geometry__Group_3__0 )? )
            // InternalKinematicsParser.g:6150:2: ( rule__Geometry__Group_3__0 )?
            {
             before(grammarAccess.getGeometryAccess().getGroup_3()); 
            // InternalKinematicsParser.g:6151:2: ( rule__Geometry__Group_3__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Cylinder) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalKinematicsParser.g:6151:3: rule__Geometry__Group_3__0
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
    // InternalKinematicsParser.g:6159:1: rule__Geometry__Group__4 : rule__Geometry__Group__4__Impl rule__Geometry__Group__5 ;
    public final void rule__Geometry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6163:1: ( rule__Geometry__Group__4__Impl rule__Geometry__Group__5 )
            // InternalKinematicsParser.g:6164:2: rule__Geometry__Group__4__Impl rule__Geometry__Group__5
            {
            pushFollow(FOLLOW_38);
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
    // InternalKinematicsParser.g:6171:1: rule__Geometry__Group__4__Impl : ( ( rule__Geometry__Group_4__0 )? ) ;
    public final void rule__Geometry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6175:1: ( ( ( rule__Geometry__Group_4__0 )? ) )
            // InternalKinematicsParser.g:6176:1: ( ( rule__Geometry__Group_4__0 )? )
            {
            // InternalKinematicsParser.g:6176:1: ( ( rule__Geometry__Group_4__0 )? )
            // InternalKinematicsParser.g:6177:2: ( rule__Geometry__Group_4__0 )?
            {
             before(grammarAccess.getGeometryAccess().getGroup_4()); 
            // InternalKinematicsParser.g:6178:2: ( rule__Geometry__Group_4__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==Sphere) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalKinematicsParser.g:6178:3: rule__Geometry__Group_4__0
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
    // InternalKinematicsParser.g:6186:1: rule__Geometry__Group__5 : rule__Geometry__Group__5__Impl rule__Geometry__Group__6 ;
    public final void rule__Geometry__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6190:1: ( rule__Geometry__Group__5__Impl rule__Geometry__Group__6 )
            // InternalKinematicsParser.g:6191:2: rule__Geometry__Group__5__Impl rule__Geometry__Group__6
            {
            pushFollow(FOLLOW_38);
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
    // InternalKinematicsParser.g:6198:1: rule__Geometry__Group__5__Impl : ( ( rule__Geometry__Group_5__0 )? ) ;
    public final void rule__Geometry__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6202:1: ( ( ( rule__Geometry__Group_5__0 )? ) )
            // InternalKinematicsParser.g:6203:1: ( ( rule__Geometry__Group_5__0 )? )
            {
            // InternalKinematicsParser.g:6203:1: ( ( rule__Geometry__Group_5__0 )? )
            // InternalKinematicsParser.g:6204:2: ( rule__Geometry__Group_5__0 )?
            {
             before(grammarAccess.getGeometryAccess().getGroup_5()); 
            // InternalKinematicsParser.g:6205:2: ( rule__Geometry__Group_5__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==Mesh) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalKinematicsParser.g:6205:3: rule__Geometry__Group_5__0
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
    // InternalKinematicsParser.g:6213:1: rule__Geometry__Group__6 : rule__Geometry__Group__6__Impl ;
    public final void rule__Geometry__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6217:1: ( rule__Geometry__Group__6__Impl )
            // InternalKinematicsParser.g:6218:2: rule__Geometry__Group__6__Impl
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
    // InternalKinematicsParser.g:6224:1: rule__Geometry__Group__6__Impl : ( RULE_END ) ;
    public final void rule__Geometry__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6228:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:6229:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:6229:1: ( RULE_END )
            // InternalKinematicsParser.g:6230:2: RULE_END
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
    // InternalKinematicsParser.g:6240:1: rule__Geometry__Group_2__0 : rule__Geometry__Group_2__0__Impl rule__Geometry__Group_2__1 ;
    public final void rule__Geometry__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6244:1: ( rule__Geometry__Group_2__0__Impl rule__Geometry__Group_2__1 )
            // InternalKinematicsParser.g:6245:2: rule__Geometry__Group_2__0__Impl rule__Geometry__Group_2__1
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
    // InternalKinematicsParser.g:6252:1: rule__Geometry__Group_2__0__Impl : ( Box ) ;
    public final void rule__Geometry__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6256:1: ( ( Box ) )
            // InternalKinematicsParser.g:6257:1: ( Box )
            {
            // InternalKinematicsParser.g:6257:1: ( Box )
            // InternalKinematicsParser.g:6258:2: Box
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
    // InternalKinematicsParser.g:6267:1: rule__Geometry__Group_2__1 : rule__Geometry__Group_2__1__Impl ;
    public final void rule__Geometry__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6271:1: ( rule__Geometry__Group_2__1__Impl )
            // InternalKinematicsParser.g:6272:2: rule__Geometry__Group_2__1__Impl
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
    // InternalKinematicsParser.g:6278:1: rule__Geometry__Group_2__1__Impl : ( ( rule__Geometry__BoxAssignment_2_1 ) ) ;
    public final void rule__Geometry__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6282:1: ( ( ( rule__Geometry__BoxAssignment_2_1 ) ) )
            // InternalKinematicsParser.g:6283:1: ( ( rule__Geometry__BoxAssignment_2_1 ) )
            {
            // InternalKinematicsParser.g:6283:1: ( ( rule__Geometry__BoxAssignment_2_1 ) )
            // InternalKinematicsParser.g:6284:2: ( rule__Geometry__BoxAssignment_2_1 )
            {
             before(grammarAccess.getGeometryAccess().getBoxAssignment_2_1()); 
            // InternalKinematicsParser.g:6285:2: ( rule__Geometry__BoxAssignment_2_1 )
            // InternalKinematicsParser.g:6285:3: rule__Geometry__BoxAssignment_2_1
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
    // InternalKinematicsParser.g:6294:1: rule__Geometry__Group_3__0 : rule__Geometry__Group_3__0__Impl rule__Geometry__Group_3__1 ;
    public final void rule__Geometry__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6298:1: ( rule__Geometry__Group_3__0__Impl rule__Geometry__Group_3__1 )
            // InternalKinematicsParser.g:6299:2: rule__Geometry__Group_3__0__Impl rule__Geometry__Group_3__1
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
    // InternalKinematicsParser.g:6306:1: rule__Geometry__Group_3__0__Impl : ( Cylinder ) ;
    public final void rule__Geometry__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6310:1: ( ( Cylinder ) )
            // InternalKinematicsParser.g:6311:1: ( Cylinder )
            {
            // InternalKinematicsParser.g:6311:1: ( Cylinder )
            // InternalKinematicsParser.g:6312:2: Cylinder
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
    // InternalKinematicsParser.g:6321:1: rule__Geometry__Group_3__1 : rule__Geometry__Group_3__1__Impl ;
    public final void rule__Geometry__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6325:1: ( rule__Geometry__Group_3__1__Impl )
            // InternalKinematicsParser.g:6326:2: rule__Geometry__Group_3__1__Impl
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
    // InternalKinematicsParser.g:6332:1: rule__Geometry__Group_3__1__Impl : ( ( rule__Geometry__CylinderAssignment_3_1 ) ) ;
    public final void rule__Geometry__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6336:1: ( ( ( rule__Geometry__CylinderAssignment_3_1 ) ) )
            // InternalKinematicsParser.g:6337:1: ( ( rule__Geometry__CylinderAssignment_3_1 ) )
            {
            // InternalKinematicsParser.g:6337:1: ( ( rule__Geometry__CylinderAssignment_3_1 ) )
            // InternalKinematicsParser.g:6338:2: ( rule__Geometry__CylinderAssignment_3_1 )
            {
             before(grammarAccess.getGeometryAccess().getCylinderAssignment_3_1()); 
            // InternalKinematicsParser.g:6339:2: ( rule__Geometry__CylinderAssignment_3_1 )
            // InternalKinematicsParser.g:6339:3: rule__Geometry__CylinderAssignment_3_1
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
    // InternalKinematicsParser.g:6348:1: rule__Geometry__Group_4__0 : rule__Geometry__Group_4__0__Impl rule__Geometry__Group_4__1 ;
    public final void rule__Geometry__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6352:1: ( rule__Geometry__Group_4__0__Impl rule__Geometry__Group_4__1 )
            // InternalKinematicsParser.g:6353:2: rule__Geometry__Group_4__0__Impl rule__Geometry__Group_4__1
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
    // InternalKinematicsParser.g:6360:1: rule__Geometry__Group_4__0__Impl : ( Sphere ) ;
    public final void rule__Geometry__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6364:1: ( ( Sphere ) )
            // InternalKinematicsParser.g:6365:1: ( Sphere )
            {
            // InternalKinematicsParser.g:6365:1: ( Sphere )
            // InternalKinematicsParser.g:6366:2: Sphere
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
    // InternalKinematicsParser.g:6375:1: rule__Geometry__Group_4__1 : rule__Geometry__Group_4__1__Impl ;
    public final void rule__Geometry__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6379:1: ( rule__Geometry__Group_4__1__Impl )
            // InternalKinematicsParser.g:6380:2: rule__Geometry__Group_4__1__Impl
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
    // InternalKinematicsParser.g:6386:1: rule__Geometry__Group_4__1__Impl : ( ( rule__Geometry__SphereAssignment_4_1 ) ) ;
    public final void rule__Geometry__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6390:1: ( ( ( rule__Geometry__SphereAssignment_4_1 ) ) )
            // InternalKinematicsParser.g:6391:1: ( ( rule__Geometry__SphereAssignment_4_1 ) )
            {
            // InternalKinematicsParser.g:6391:1: ( ( rule__Geometry__SphereAssignment_4_1 ) )
            // InternalKinematicsParser.g:6392:2: ( rule__Geometry__SphereAssignment_4_1 )
            {
             before(grammarAccess.getGeometryAccess().getSphereAssignment_4_1()); 
            // InternalKinematicsParser.g:6393:2: ( rule__Geometry__SphereAssignment_4_1 )
            // InternalKinematicsParser.g:6393:3: rule__Geometry__SphereAssignment_4_1
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
    // InternalKinematicsParser.g:6402:1: rule__Geometry__Group_5__0 : rule__Geometry__Group_5__0__Impl rule__Geometry__Group_5__1 ;
    public final void rule__Geometry__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6406:1: ( rule__Geometry__Group_5__0__Impl rule__Geometry__Group_5__1 )
            // InternalKinematicsParser.g:6407:2: rule__Geometry__Group_5__0__Impl rule__Geometry__Group_5__1
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
    // InternalKinematicsParser.g:6414:1: rule__Geometry__Group_5__0__Impl : ( Mesh ) ;
    public final void rule__Geometry__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6418:1: ( ( Mesh ) )
            // InternalKinematicsParser.g:6419:1: ( Mesh )
            {
            // InternalKinematicsParser.g:6419:1: ( Mesh )
            // InternalKinematicsParser.g:6420:2: Mesh
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
    // InternalKinematicsParser.g:6429:1: rule__Geometry__Group_5__1 : rule__Geometry__Group_5__1__Impl ;
    public final void rule__Geometry__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6433:1: ( rule__Geometry__Group_5__1__Impl )
            // InternalKinematicsParser.g:6434:2: rule__Geometry__Group_5__1__Impl
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
    // InternalKinematicsParser.g:6440:1: rule__Geometry__Group_5__1__Impl : ( ( rule__Geometry__MeshAssignment_5_1 ) ) ;
    public final void rule__Geometry__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6444:1: ( ( ( rule__Geometry__MeshAssignment_5_1 ) ) )
            // InternalKinematicsParser.g:6445:1: ( ( rule__Geometry__MeshAssignment_5_1 ) )
            {
            // InternalKinematicsParser.g:6445:1: ( ( rule__Geometry__MeshAssignment_5_1 ) )
            // InternalKinematicsParser.g:6446:2: ( rule__Geometry__MeshAssignment_5_1 )
            {
             before(grammarAccess.getGeometryAccess().getMeshAssignment_5_1()); 
            // InternalKinematicsParser.g:6447:2: ( rule__Geometry__MeshAssignment_5_1 )
            // InternalKinematicsParser.g:6447:3: rule__Geometry__MeshAssignment_5_1
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
    // InternalKinematicsParser.g:6456:1: rule__Box__Group__0 : rule__Box__Group__0__Impl rule__Box__Group__1 ;
    public final void rule__Box__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6460:1: ( rule__Box__Group__0__Impl rule__Box__Group__1 )
            // InternalKinematicsParser.g:6461:2: rule__Box__Group__0__Impl rule__Box__Group__1
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
    // InternalKinematicsParser.g:6468:1: rule__Box__Group__0__Impl : ( () ) ;
    public final void rule__Box__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6472:1: ( ( () ) )
            // InternalKinematicsParser.g:6473:1: ( () )
            {
            // InternalKinematicsParser.g:6473:1: ( () )
            // InternalKinematicsParser.g:6474:2: ()
            {
             before(grammarAccess.getBoxAccess().getBoxAction_0()); 
            // InternalKinematicsParser.g:6475:2: ()
            // InternalKinematicsParser.g:6475:3: 
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
    // InternalKinematicsParser.g:6483:1: rule__Box__Group__1 : rule__Box__Group__1__Impl rule__Box__Group__2 ;
    public final void rule__Box__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6487:1: ( rule__Box__Group__1__Impl rule__Box__Group__2 )
            // InternalKinematicsParser.g:6488:2: rule__Box__Group__1__Impl rule__Box__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalKinematicsParser.g:6495:1: rule__Box__Group__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Box__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6499:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:6500:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:6500:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:6501:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:6510:1: rule__Box__Group__2 : rule__Box__Group__2__Impl rule__Box__Group__3 ;
    public final void rule__Box__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6514:1: ( rule__Box__Group__2__Impl rule__Box__Group__3 )
            // InternalKinematicsParser.g:6515:2: rule__Box__Group__2__Impl rule__Box__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalKinematicsParser.g:6522:1: rule__Box__Group__2__Impl : ( Size ) ;
    public final void rule__Box__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6526:1: ( ( Size ) )
            // InternalKinematicsParser.g:6527:1: ( Size )
            {
            // InternalKinematicsParser.g:6527:1: ( Size )
            // InternalKinematicsParser.g:6528:2: Size
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
    // InternalKinematicsParser.g:6537:1: rule__Box__Group__3 : rule__Box__Group__3__Impl rule__Box__Group__4 ;
    public final void rule__Box__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6541:1: ( rule__Box__Group__3__Impl rule__Box__Group__4 )
            // InternalKinematicsParser.g:6542:2: rule__Box__Group__3__Impl rule__Box__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalKinematicsParser.g:6549:1: rule__Box__Group__3__Impl : ( ( rule__Box__SizeAssignment_3 ) ) ;
    public final void rule__Box__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6553:1: ( ( ( rule__Box__SizeAssignment_3 ) ) )
            // InternalKinematicsParser.g:6554:1: ( ( rule__Box__SizeAssignment_3 ) )
            {
            // InternalKinematicsParser.g:6554:1: ( ( rule__Box__SizeAssignment_3 ) )
            // InternalKinematicsParser.g:6555:2: ( rule__Box__SizeAssignment_3 )
            {
             before(grammarAccess.getBoxAccess().getSizeAssignment_3()); 
            // InternalKinematicsParser.g:6556:2: ( rule__Box__SizeAssignment_3 )
            // InternalKinematicsParser.g:6556:3: rule__Box__SizeAssignment_3
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
    // InternalKinematicsParser.g:6564:1: rule__Box__Group__4 : rule__Box__Group__4__Impl ;
    public final void rule__Box__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6568:1: ( rule__Box__Group__4__Impl )
            // InternalKinematicsParser.g:6569:2: rule__Box__Group__4__Impl
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
    // InternalKinematicsParser.g:6575:1: rule__Box__Group__4__Impl : ( RULE_END ) ;
    public final void rule__Box__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6579:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:6580:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:6580:1: ( RULE_END )
            // InternalKinematicsParser.g:6581:2: RULE_END
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
    // InternalKinematicsParser.g:6591:1: rule__Cylinder__Group__0 : rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 ;
    public final void rule__Cylinder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6595:1: ( rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 )
            // InternalKinematicsParser.g:6596:2: rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalKinematicsParser.g:6603:1: rule__Cylinder__Group__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Cylinder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6607:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:6608:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:6608:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:6609:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:6618:1: rule__Cylinder__Group__1 : rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 ;
    public final void rule__Cylinder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6622:1: ( rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 )
            // InternalKinematicsParser.g:6623:2: rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalKinematicsParser.g:6630:1: rule__Cylinder__Group__1__Impl : ( Length ) ;
    public final void rule__Cylinder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6634:1: ( ( Length ) )
            // InternalKinematicsParser.g:6635:1: ( Length )
            {
            // InternalKinematicsParser.g:6635:1: ( Length )
            // InternalKinematicsParser.g:6636:2: Length
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
    // InternalKinematicsParser.g:6645:1: rule__Cylinder__Group__2 : rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 ;
    public final void rule__Cylinder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6649:1: ( rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 )
            // InternalKinematicsParser.g:6650:2: rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalKinematicsParser.g:6657:1: rule__Cylinder__Group__2__Impl : ( ( rule__Cylinder__LengthAssignment_2 ) ) ;
    public final void rule__Cylinder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6661:1: ( ( ( rule__Cylinder__LengthAssignment_2 ) ) )
            // InternalKinematicsParser.g:6662:1: ( ( rule__Cylinder__LengthAssignment_2 ) )
            {
            // InternalKinematicsParser.g:6662:1: ( ( rule__Cylinder__LengthAssignment_2 ) )
            // InternalKinematicsParser.g:6663:2: ( rule__Cylinder__LengthAssignment_2 )
            {
             before(grammarAccess.getCylinderAccess().getLengthAssignment_2()); 
            // InternalKinematicsParser.g:6664:2: ( rule__Cylinder__LengthAssignment_2 )
            // InternalKinematicsParser.g:6664:3: rule__Cylinder__LengthAssignment_2
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
    // InternalKinematicsParser.g:6672:1: rule__Cylinder__Group__3 : rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 ;
    public final void rule__Cylinder__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6676:1: ( rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 )
            // InternalKinematicsParser.g:6677:2: rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalKinematicsParser.g:6684:1: rule__Cylinder__Group__3__Impl : ( Radius ) ;
    public final void rule__Cylinder__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6688:1: ( ( Radius ) )
            // InternalKinematicsParser.g:6689:1: ( Radius )
            {
            // InternalKinematicsParser.g:6689:1: ( Radius )
            // InternalKinematicsParser.g:6690:2: Radius
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
    // InternalKinematicsParser.g:6699:1: rule__Cylinder__Group__4 : rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 ;
    public final void rule__Cylinder__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6703:1: ( rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 )
            // InternalKinematicsParser.g:6704:2: rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalKinematicsParser.g:6711:1: rule__Cylinder__Group__4__Impl : ( ( rule__Cylinder__RadiusAssignment_4 ) ) ;
    public final void rule__Cylinder__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6715:1: ( ( ( rule__Cylinder__RadiusAssignment_4 ) ) )
            // InternalKinematicsParser.g:6716:1: ( ( rule__Cylinder__RadiusAssignment_4 ) )
            {
            // InternalKinematicsParser.g:6716:1: ( ( rule__Cylinder__RadiusAssignment_4 ) )
            // InternalKinematicsParser.g:6717:2: ( rule__Cylinder__RadiusAssignment_4 )
            {
             before(grammarAccess.getCylinderAccess().getRadiusAssignment_4()); 
            // InternalKinematicsParser.g:6718:2: ( rule__Cylinder__RadiusAssignment_4 )
            // InternalKinematicsParser.g:6718:3: rule__Cylinder__RadiusAssignment_4
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
    // InternalKinematicsParser.g:6726:1: rule__Cylinder__Group__5 : rule__Cylinder__Group__5__Impl ;
    public final void rule__Cylinder__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6730:1: ( rule__Cylinder__Group__5__Impl )
            // InternalKinematicsParser.g:6731:2: rule__Cylinder__Group__5__Impl
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
    // InternalKinematicsParser.g:6737:1: rule__Cylinder__Group__5__Impl : ( RULE_END ) ;
    public final void rule__Cylinder__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6741:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:6742:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:6742:1: ( RULE_END )
            // InternalKinematicsParser.g:6743:2: RULE_END
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
    // InternalKinematicsParser.g:6753:1: rule__Sphere__Group__0 : rule__Sphere__Group__0__Impl rule__Sphere__Group__1 ;
    public final void rule__Sphere__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6757:1: ( rule__Sphere__Group__0__Impl rule__Sphere__Group__1 )
            // InternalKinematicsParser.g:6758:2: rule__Sphere__Group__0__Impl rule__Sphere__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalKinematicsParser.g:6765:1: rule__Sphere__Group__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Sphere__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6769:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:6770:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:6770:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:6771:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:6780:1: rule__Sphere__Group__1 : rule__Sphere__Group__1__Impl rule__Sphere__Group__2 ;
    public final void rule__Sphere__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6784:1: ( rule__Sphere__Group__1__Impl rule__Sphere__Group__2 )
            // InternalKinematicsParser.g:6785:2: rule__Sphere__Group__1__Impl rule__Sphere__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalKinematicsParser.g:6792:1: rule__Sphere__Group__1__Impl : ( Radius ) ;
    public final void rule__Sphere__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6796:1: ( ( Radius ) )
            // InternalKinematicsParser.g:6797:1: ( Radius )
            {
            // InternalKinematicsParser.g:6797:1: ( Radius )
            // InternalKinematicsParser.g:6798:2: Radius
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
    // InternalKinematicsParser.g:6807:1: rule__Sphere__Group__2 : rule__Sphere__Group__2__Impl rule__Sphere__Group__3 ;
    public final void rule__Sphere__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6811:1: ( rule__Sphere__Group__2__Impl rule__Sphere__Group__3 )
            // InternalKinematicsParser.g:6812:2: rule__Sphere__Group__2__Impl rule__Sphere__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalKinematicsParser.g:6819:1: rule__Sphere__Group__2__Impl : ( ( rule__Sphere__RadiusAssignment_2 ) ) ;
    public final void rule__Sphere__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6823:1: ( ( ( rule__Sphere__RadiusAssignment_2 ) ) )
            // InternalKinematicsParser.g:6824:1: ( ( rule__Sphere__RadiusAssignment_2 ) )
            {
            // InternalKinematicsParser.g:6824:1: ( ( rule__Sphere__RadiusAssignment_2 ) )
            // InternalKinematicsParser.g:6825:2: ( rule__Sphere__RadiusAssignment_2 )
            {
             before(grammarAccess.getSphereAccess().getRadiusAssignment_2()); 
            // InternalKinematicsParser.g:6826:2: ( rule__Sphere__RadiusAssignment_2 )
            // InternalKinematicsParser.g:6826:3: rule__Sphere__RadiusAssignment_2
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
    // InternalKinematicsParser.g:6834:1: rule__Sphere__Group__3 : rule__Sphere__Group__3__Impl ;
    public final void rule__Sphere__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6838:1: ( rule__Sphere__Group__3__Impl )
            // InternalKinematicsParser.g:6839:2: rule__Sphere__Group__3__Impl
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
    // InternalKinematicsParser.g:6845:1: rule__Sphere__Group__3__Impl : ( RULE_END ) ;
    public final void rule__Sphere__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6849:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:6850:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:6850:1: ( RULE_END )
            // InternalKinematicsParser.g:6851:2: RULE_END
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
    // InternalKinematicsParser.g:6861:1: rule__Mesh__Group__0 : rule__Mesh__Group__0__Impl rule__Mesh__Group__1 ;
    public final void rule__Mesh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6865:1: ( rule__Mesh__Group__0__Impl rule__Mesh__Group__1 )
            // InternalKinematicsParser.g:6866:2: rule__Mesh__Group__0__Impl rule__Mesh__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalKinematicsParser.g:6873:1: rule__Mesh__Group__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Mesh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6877:1: ( ( RULE_BEGIN ) )
            // InternalKinematicsParser.g:6878:1: ( RULE_BEGIN )
            {
            // InternalKinematicsParser.g:6878:1: ( RULE_BEGIN )
            // InternalKinematicsParser.g:6879:2: RULE_BEGIN
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
    // InternalKinematicsParser.g:6888:1: rule__Mesh__Group__1 : rule__Mesh__Group__1__Impl rule__Mesh__Group__2 ;
    public final void rule__Mesh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6892:1: ( rule__Mesh__Group__1__Impl rule__Mesh__Group__2 )
            // InternalKinematicsParser.g:6893:2: rule__Mesh__Group__1__Impl rule__Mesh__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalKinematicsParser.g:6900:1: rule__Mesh__Group__1__Impl : ( Filename ) ;
    public final void rule__Mesh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6904:1: ( ( Filename ) )
            // InternalKinematicsParser.g:6905:1: ( Filename )
            {
            // InternalKinematicsParser.g:6905:1: ( Filename )
            // InternalKinematicsParser.g:6906:2: Filename
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
    // InternalKinematicsParser.g:6915:1: rule__Mesh__Group__2 : rule__Mesh__Group__2__Impl rule__Mesh__Group__3 ;
    public final void rule__Mesh__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6919:1: ( rule__Mesh__Group__2__Impl rule__Mesh__Group__3 )
            // InternalKinematicsParser.g:6920:2: rule__Mesh__Group__2__Impl rule__Mesh__Group__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalKinematicsParser.g:6927:1: rule__Mesh__Group__2__Impl : ( ( rule__Mesh__FilenameAssignment_2 ) ) ;
    public final void rule__Mesh__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6931:1: ( ( ( rule__Mesh__FilenameAssignment_2 ) ) )
            // InternalKinematicsParser.g:6932:1: ( ( rule__Mesh__FilenameAssignment_2 ) )
            {
            // InternalKinematicsParser.g:6932:1: ( ( rule__Mesh__FilenameAssignment_2 ) )
            // InternalKinematicsParser.g:6933:2: ( rule__Mesh__FilenameAssignment_2 )
            {
             before(grammarAccess.getMeshAccess().getFilenameAssignment_2()); 
            // InternalKinematicsParser.g:6934:2: ( rule__Mesh__FilenameAssignment_2 )
            // InternalKinematicsParser.g:6934:3: rule__Mesh__FilenameAssignment_2
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
    // InternalKinematicsParser.g:6942:1: rule__Mesh__Group__3 : rule__Mesh__Group__3__Impl rule__Mesh__Group__4 ;
    public final void rule__Mesh__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6946:1: ( rule__Mesh__Group__3__Impl rule__Mesh__Group__4 )
            // InternalKinematicsParser.g:6947:2: rule__Mesh__Group__3__Impl rule__Mesh__Group__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalKinematicsParser.g:6954:1: rule__Mesh__Group__3__Impl : ( ( rule__Mesh__Group_3__0 )? ) ;
    public final void rule__Mesh__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6958:1: ( ( ( rule__Mesh__Group_3__0 )? ) )
            // InternalKinematicsParser.g:6959:1: ( ( rule__Mesh__Group_3__0 )? )
            {
            // InternalKinematicsParser.g:6959:1: ( ( rule__Mesh__Group_3__0 )? )
            // InternalKinematicsParser.g:6960:2: ( rule__Mesh__Group_3__0 )?
            {
             before(grammarAccess.getMeshAccess().getGroup_3()); 
            // InternalKinematicsParser.g:6961:2: ( rule__Mesh__Group_3__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==Scale) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalKinematicsParser.g:6961:3: rule__Mesh__Group_3__0
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
    // InternalKinematicsParser.g:6969:1: rule__Mesh__Group__4 : rule__Mesh__Group__4__Impl ;
    public final void rule__Mesh__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6973:1: ( rule__Mesh__Group__4__Impl )
            // InternalKinematicsParser.g:6974:2: rule__Mesh__Group__4__Impl
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
    // InternalKinematicsParser.g:6980:1: rule__Mesh__Group__4__Impl : ( RULE_END ) ;
    public final void rule__Mesh__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:6984:1: ( ( RULE_END ) )
            // InternalKinematicsParser.g:6985:1: ( RULE_END )
            {
            // InternalKinematicsParser.g:6985:1: ( RULE_END )
            // InternalKinematicsParser.g:6986:2: RULE_END
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
    // InternalKinematicsParser.g:6996:1: rule__Mesh__Group_3__0 : rule__Mesh__Group_3__0__Impl rule__Mesh__Group_3__1 ;
    public final void rule__Mesh__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7000:1: ( rule__Mesh__Group_3__0__Impl rule__Mesh__Group_3__1 )
            // InternalKinematicsParser.g:7001:2: rule__Mesh__Group_3__0__Impl rule__Mesh__Group_3__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalKinematicsParser.g:7008:1: rule__Mesh__Group_3__0__Impl : ( Scale ) ;
    public final void rule__Mesh__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7012:1: ( ( Scale ) )
            // InternalKinematicsParser.g:7013:1: ( Scale )
            {
            // InternalKinematicsParser.g:7013:1: ( Scale )
            // InternalKinematicsParser.g:7014:2: Scale
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
    // InternalKinematicsParser.g:7023:1: rule__Mesh__Group_3__1 : rule__Mesh__Group_3__1__Impl ;
    public final void rule__Mesh__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7027:1: ( rule__Mesh__Group_3__1__Impl )
            // InternalKinematicsParser.g:7028:2: rule__Mesh__Group_3__1__Impl
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
    // InternalKinematicsParser.g:7034:1: rule__Mesh__Group_3__1__Impl : ( ( rule__Mesh__ScaleAssignment_3_1 ) ) ;
    public final void rule__Mesh__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7038:1: ( ( ( rule__Mesh__ScaleAssignment_3_1 ) ) )
            // InternalKinematicsParser.g:7039:1: ( ( rule__Mesh__ScaleAssignment_3_1 ) )
            {
            // InternalKinematicsParser.g:7039:1: ( ( rule__Mesh__ScaleAssignment_3_1 ) )
            // InternalKinematicsParser.g:7040:2: ( rule__Mesh__ScaleAssignment_3_1 )
            {
             before(grammarAccess.getMeshAccess().getScaleAssignment_3_1()); 
            // InternalKinematicsParser.g:7041:2: ( rule__Mesh__ScaleAssignment_3_1 )
            // InternalKinematicsParser.g:7041:3: rule__Mesh__ScaleAssignment_3_1
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
    // InternalKinematicsParser.g:7050:1: rule__Robot__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Robot__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7054:1: ( ( RULE_ID ) )
            // InternalKinematicsParser.g:7055:2: ( RULE_ID )
            {
            // InternalKinematicsParser.g:7055:2: ( RULE_ID )
            // InternalKinematicsParser.g:7056:3: RULE_ID
            {
             before(grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Robot__VersionAssignment_5_1"
    // InternalKinematicsParser.g:7065:1: rule__Robot__VersionAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Robot__VersionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7069:1: ( ( RULE_STRING ) )
            // InternalKinematicsParser.g:7070:2: ( RULE_STRING )
            {
            // InternalKinematicsParser.g:7070:2: ( RULE_STRING )
            // InternalKinematicsParser.g:7071:3: RULE_STRING
            {
             before(grammarAccess.getRobotAccess().getVersionSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getVersionSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__VersionAssignment_5_1"


    // $ANTLR start "rule__Robot__MacroAssignment_6_1"
    // InternalKinematicsParser.g:7080:1: rule__Robot__MacroAssignment_6_1 : ( ruleMacro ) ;
    public final void rule__Robot__MacroAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7084:1: ( ( ruleMacro ) )
            // InternalKinematicsParser.g:7085:2: ( ruleMacro )
            {
            // InternalKinematicsParser.g:7085:2: ( ruleMacro )
            // InternalKinematicsParser.g:7086:3: ruleMacro
            {
             before(grammarAccess.getRobotAccess().getMacroMacroParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMacro();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getMacroMacroParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__MacroAssignment_6_1"


    // $ANTLR start "rule__Robot__MacroCallAssignment_7_1"
    // InternalKinematicsParser.g:7095:1: rule__Robot__MacroCallAssignment_7_1 : ( ruleMacroCall ) ;
    public final void rule__Robot__MacroCallAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7099:1: ( ( ruleMacroCall ) )
            // InternalKinematicsParser.g:7100:2: ( ruleMacroCall )
            {
            // InternalKinematicsParser.g:7100:2: ( ruleMacroCall )
            // InternalKinematicsParser.g:7101:3: ruleMacroCall
            {
             before(grammarAccess.getRobotAccess().getMacroCallMacroCallParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMacroCall();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getMacroCallMacroCallParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__MacroCallAssignment_7_1"


    // $ANTLR start "rule__Robot__BodyAssignment_8_2"
    // InternalKinematicsParser.g:7110:1: rule__Robot__BodyAssignment_8_2 : ( ruleBody ) ;
    public final void rule__Robot__BodyAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7114:1: ( ( ruleBody ) )
            // InternalKinematicsParser.g:7115:2: ( ruleBody )
            {
            // InternalKinematicsParser.g:7115:2: ( ruleBody )
            // InternalKinematicsParser.g:7116:3: ruleBody
            {
             before(grammarAccess.getRobotAccess().getBodyBodyParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getBodyBodyParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__BodyAssignment_8_2"


    // $ANTLR start "rule__Macro__NameAssignment_1"
    // InternalKinematicsParser.g:7125:1: rule__Macro__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Macro__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7129:1: ( ( RULE_ID ) )
            // InternalKinematicsParser.g:7130:2: ( RULE_ID )
            {
            // InternalKinematicsParser.g:7130:2: ( RULE_ID )
            // InternalKinematicsParser.g:7131:3: RULE_ID
            {
             before(grammarAccess.getMacroAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMacroAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__NameAssignment_1"


    // $ANTLR start "rule__Macro__ParameterAssignment_4_1"
    // InternalKinematicsParser.g:7140:1: rule__Macro__ParameterAssignment_4_1 : ( ruleParameter ) ;
    public final void rule__Macro__ParameterAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7144:1: ( ( ruleParameter ) )
            // InternalKinematicsParser.g:7145:2: ( ruleParameter )
            {
            // InternalKinematicsParser.g:7145:2: ( ruleParameter )
            // InternalKinematicsParser.g:7146:3: ruleParameter
            {
             before(grammarAccess.getMacroAccess().getParameterParameterParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMacroAccess().getParameterParameterParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__ParameterAssignment_4_1"


    // $ANTLR start "rule__Macro__BodyAssignment_5_2"
    // InternalKinematicsParser.g:7155:1: rule__Macro__BodyAssignment_5_2 : ( ruleBody ) ;
    public final void rule__Macro__BodyAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7159:1: ( ( ruleBody ) )
            // InternalKinematicsParser.g:7160:2: ( ruleBody )
            {
            // InternalKinematicsParser.g:7160:2: ( ruleBody )
            // InternalKinematicsParser.g:7161:3: ruleBody
            {
             before(grammarAccess.getMacroAccess().getBodyBodyParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getMacroAccess().getBodyBodyParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__BodyAssignment_5_2"


    // $ANTLR start "rule__Parameter__NameAssignment_2"
    // InternalKinematicsParser.g:7170:1: rule__Parameter__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7174:1: ( ( RULE_ID ) )
            // InternalKinematicsParser.g:7175:2: ( RULE_ID )
            {
            // InternalKinematicsParser.g:7175:2: ( RULE_ID )
            // InternalKinematicsParser.g:7176:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_2"


    // $ANTLR start "rule__Parameter__TypeAssignment_6"
    // InternalKinematicsParser.g:7185:1: rule__Parameter__TypeAssignment_6 : ( ruleParameterType ) ;
    public final void rule__Parameter__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7189:1: ( ( ruleParameterType ) )
            // InternalKinematicsParser.g:7190:2: ( ruleParameterType )
            {
            // InternalKinematicsParser.g:7190:2: ( ruleParameterType )
            // InternalKinematicsParser.g:7191:3: ruleParameterType
            {
             before(grammarAccess.getParameterAccess().getTypeParameterTypeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeParameterTypeParserRuleCall_6_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Parameter__ValueAssignment_7_1"
    // InternalKinematicsParser.g:7200:1: rule__Parameter__ValueAssignment_7_1 : ( ruleParameterValue ) ;
    public final void rule__Parameter__ValueAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7204:1: ( ( ruleParameterValue ) )
            // InternalKinematicsParser.g:7205:2: ( ruleParameterValue )
            {
            // InternalKinematicsParser.g:7205:2: ( ruleParameterValue )
            // InternalKinematicsParser.g:7206:3: ruleParameterValue
            {
             before(grammarAccess.getParameterAccess().getValueParameterValueParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getValueParameterValueParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ValueAssignment_7_1"


    // $ANTLR start "rule__ParameterValue__ValueAssignment_0"
    // InternalKinematicsParser.g:7215:1: rule__ParameterValue__ValueAssignment_0 : ( RULE_ID ) ;
    public final void rule__ParameterValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7219:1: ( ( RULE_ID ) )
            // InternalKinematicsParser.g:7220:2: ( RULE_ID )
            {
            // InternalKinematicsParser.g:7220:2: ( RULE_ID )
            // InternalKinematicsParser.g:7221:3: RULE_ID
            {
             before(grammarAccess.getParameterValueAccess().getValueIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterValueAccess().getValueIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValue__ValueAssignment_0"


    // $ANTLR start "rule__LinkRef__RefAssignment"
    // InternalKinematicsParser.g:7230:1: rule__LinkRef__RefAssignment : ( ( RULE_STRING ) ) ;
    public final void rule__LinkRef__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7234:1: ( ( ( RULE_STRING ) ) )
            // InternalKinematicsParser.g:7235:2: ( ( RULE_STRING ) )
            {
            // InternalKinematicsParser.g:7235:2: ( ( RULE_STRING ) )
            // InternalKinematicsParser.g:7236:3: ( RULE_STRING )
            {
             before(grammarAccess.getLinkRefAccess().getRefLinkCrossReference_0()); 
            // InternalKinematicsParser.g:7237:3: ( RULE_STRING )
            // InternalKinematicsParser.g:7238:4: RULE_STRING
            {
             before(grammarAccess.getLinkRefAccess().getRefLinkSTRINGTerminalRuleCall_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLinkRefAccess().getRefLinkSTRINGTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getLinkRefAccess().getRefLinkCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkRef__RefAssignment"


    // $ANTLR start "rule__ParameterString__RefAssignment_1"
    // InternalKinematicsParser.g:7249:1: rule__ParameterString__RefAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__ParameterString__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7253:1: ( ( ( RULE_STRING ) ) )
            // InternalKinematicsParser.g:7254:2: ( ( RULE_STRING ) )
            {
            // InternalKinematicsParser.g:7254:2: ( ( RULE_STRING ) )
            // InternalKinematicsParser.g:7255:3: ( RULE_STRING )
            {
             before(grammarAccess.getParameterStringAccess().getRefParameterCrossReference_1_0()); 
            // InternalKinematicsParser.g:7256:3: ( RULE_STRING )
            // InternalKinematicsParser.g:7257:4: RULE_STRING
            {
             before(grammarAccess.getParameterStringAccess().getRefParameterSTRINGTerminalRuleCall_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParameterStringAccess().getRefParameterSTRINGTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getParameterStringAccess().getRefParameterCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterString__RefAssignment_1"


    // $ANTLR start "rule__ParameterString__ValueAssignment_2"
    // InternalKinematicsParser.g:7268:1: rule__ParameterString__ValueAssignment_2 : ( RULE_ID ) ;
    public final void rule__ParameterString__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7272:1: ( ( RULE_ID ) )
            // InternalKinematicsParser.g:7273:2: ( RULE_ID )
            {
            // InternalKinematicsParser.g:7273:2: ( RULE_ID )
            // InternalKinematicsParser.g:7274:3: RULE_ID
            {
             before(grammarAccess.getParameterStringAccess().getValueIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterStringAccess().getValueIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterString__ValueAssignment_2"


    // $ANTLR start "rule__ParameterPose__RefAssignment_0"
    // InternalKinematicsParser.g:7283:1: rule__ParameterPose__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterPose__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7287:1: ( ( ( RULE_ID ) ) )
            // InternalKinematicsParser.g:7288:2: ( ( RULE_ID ) )
            {
            // InternalKinematicsParser.g:7288:2: ( ( RULE_ID ) )
            // InternalKinematicsParser.g:7289:3: ( RULE_ID )
            {
             before(grammarAccess.getParameterPoseAccess().getRefParameterCrossReference_0_0()); 
            // InternalKinematicsParser.g:7290:3: ( RULE_ID )
            // InternalKinematicsParser.g:7291:4: RULE_ID
            {
             before(grammarAccess.getParameterPoseAccess().getRefParameterIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterPoseAccess().getRefParameterIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getParameterPoseAccess().getRefParameterCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPose__RefAssignment_0"


    // $ANTLR start "rule__ParameterPose__ValueAssignment_1"
    // InternalKinematicsParser.g:7302:1: rule__ParameterPose__ValueAssignment_1 : ( rulePose ) ;
    public final void rule__ParameterPose__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7306:1: ( ( rulePose ) )
            // InternalKinematicsParser.g:7307:2: ( rulePose )
            {
            // InternalKinematicsParser.g:7307:2: ( rulePose )
            // InternalKinematicsParser.g:7308:3: rulePose
            {
             before(grammarAccess.getParameterPoseAccess().getValuePoseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePose();

            state._fsp--;

             after(grammarAccess.getParameterPoseAccess().getValuePoseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPose__ValueAssignment_1"


    // $ANTLR start "rule__ParameterLink__ParamAssignment_0"
    // InternalKinematicsParser.g:7317:1: rule__ParameterLink__ParamAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterLink__ParamAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7321:1: ( ( ( RULE_ID ) ) )
            // InternalKinematicsParser.g:7322:2: ( ( RULE_ID ) )
            {
            // InternalKinematicsParser.g:7322:2: ( ( RULE_ID ) )
            // InternalKinematicsParser.g:7323:3: ( RULE_ID )
            {
             before(grammarAccess.getParameterLinkAccess().getParamParameterCrossReference_0_0()); 
            // InternalKinematicsParser.g:7324:3: ( RULE_ID )
            // InternalKinematicsParser.g:7325:4: RULE_ID
            {
             before(grammarAccess.getParameterLinkAccess().getParamParameterIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterLinkAccess().getParamParameterIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getParameterLinkAccess().getParamParameterCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterLink__ParamAssignment_0"


    // $ANTLR start "rule__ParameterLink__LinkAssignment_1"
    // InternalKinematicsParser.g:7336:1: rule__ParameterLink__LinkAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__ParameterLink__LinkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7340:1: ( ( ( RULE_STRING ) ) )
            // InternalKinematicsParser.g:7341:2: ( ( RULE_STRING ) )
            {
            // InternalKinematicsParser.g:7341:2: ( ( RULE_STRING ) )
            // InternalKinematicsParser.g:7342:3: ( RULE_STRING )
            {
             before(grammarAccess.getParameterLinkAccess().getLinkLinkCrossReference_1_0()); 
            // InternalKinematicsParser.g:7343:3: ( RULE_STRING )
            // InternalKinematicsParser.g:7344:4: RULE_STRING
            {
             before(grammarAccess.getParameterLinkAccess().getLinkLinkSTRINGTerminalRuleCall_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParameterLinkAccess().getLinkLinkSTRINGTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getParameterLinkAccess().getLinkLinkCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterLink__LinkAssignment_1"


    // $ANTLR start "rule__Body__LinkAssignment_1_1"
    // InternalKinematicsParser.g:7355:1: rule__Body__LinkAssignment_1_1 : ( ruleLink ) ;
    public final void rule__Body__LinkAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7359:1: ( ( ruleLink ) )
            // InternalKinematicsParser.g:7360:2: ( ruleLink )
            {
            // InternalKinematicsParser.g:7360:2: ( ruleLink )
            // InternalKinematicsParser.g:7361:3: ruleLink
            {
             before(grammarAccess.getBodyAccess().getLinkLinkParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getBodyAccess().getLinkLinkParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__LinkAssignment_1_1"


    // $ANTLR start "rule__Body__JointAssignment_2_1"
    // InternalKinematicsParser.g:7370:1: rule__Body__JointAssignment_2_1 : ( ruleJoint ) ;
    public final void rule__Body__JointAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7374:1: ( ( ruleJoint ) )
            // InternalKinematicsParser.g:7375:2: ( ruleJoint )
            {
            // InternalKinematicsParser.g:7375:2: ( ruleJoint )
            // InternalKinematicsParser.g:7376:3: ruleJoint
            {
             before(grammarAccess.getBodyAccess().getJointJointParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getBodyAccess().getJointJointParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__JointAssignment_2_1"


    // $ANTLR start "rule__MacroCall__MacroAssignment_2"
    // InternalKinematicsParser.g:7385:1: rule__MacroCall__MacroAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__MacroCall__MacroAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7389:1: ( ( ( RULE_STRING ) ) )
            // InternalKinematicsParser.g:7390:2: ( ( RULE_STRING ) )
            {
            // InternalKinematicsParser.g:7390:2: ( ( RULE_STRING ) )
            // InternalKinematicsParser.g:7391:3: ( RULE_STRING )
            {
             before(grammarAccess.getMacroCallAccess().getMacroMacroCrossReference_2_0()); 
            // InternalKinematicsParser.g:7392:3: ( RULE_STRING )
            // InternalKinematicsParser.g:7393:4: RULE_STRING
            {
             before(grammarAccess.getMacroCallAccess().getMacroMacroSTRINGTerminalRuleCall_2_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMacroCallAccess().getMacroMacroSTRINGTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMacroCallAccess().getMacroMacroCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__MacroAssignment_2"


    // $ANTLR start "rule__MacroCall__ParameterCallAssignment_5"
    // InternalKinematicsParser.g:7404:1: rule__MacroCall__ParameterCallAssignment_5 : ( ruleParameterCall ) ;
    public final void rule__MacroCall__ParameterCallAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7408:1: ( ( ruleParameterCall ) )
            // InternalKinematicsParser.g:7409:2: ( ruleParameterCall )
            {
            // InternalKinematicsParser.g:7409:2: ( ruleParameterCall )
            // InternalKinematicsParser.g:7410:3: ruleParameterCall
            {
             before(grammarAccess.getMacroCallAccess().getParameterCallParameterCallParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterCall();

            state._fsp--;

             after(grammarAccess.getMacroCallAccess().getParameterCallParameterCallParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__ParameterCallAssignment_5"


    // $ANTLR start "rule__ParameterCall__ParameterAssignment_2"
    // InternalKinematicsParser.g:7419:1: rule__ParameterCall__ParameterAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__ParameterCall__ParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7423:1: ( ( ( RULE_STRING ) ) )
            // InternalKinematicsParser.g:7424:2: ( ( RULE_STRING ) )
            {
            // InternalKinematicsParser.g:7424:2: ( ( RULE_STRING ) )
            // InternalKinematicsParser.g:7425:3: ( RULE_STRING )
            {
             before(grammarAccess.getParameterCallAccess().getParameterParameterCrossReference_2_0()); 
            // InternalKinematicsParser.g:7426:3: ( RULE_STRING )
            // InternalKinematicsParser.g:7427:4: RULE_STRING
            {
             before(grammarAccess.getParameterCallAccess().getParameterParameterSTRINGTerminalRuleCall_2_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParameterCallAccess().getParameterParameterSTRINGTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getParameterCallAccess().getParameterParameterCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterCall__ParameterAssignment_2"


    // $ANTLR start "rule__ParameterCall__ValueAssignment_6"
    // InternalKinematicsParser.g:7438:1: rule__ParameterCall__ValueAssignment_6 : ( ruleParameterValue ) ;
    public final void rule__ParameterCall__ValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7442:1: ( ( ruleParameterValue ) )
            // InternalKinematicsParser.g:7443:2: ( ruleParameterValue )
            {
            // InternalKinematicsParser.g:7443:2: ( ruleParameterValue )
            // InternalKinematicsParser.g:7444:3: ruleParameterValue
            {
             before(grammarAccess.getParameterCallAccess().getValueParameterValueParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterCallAccess().getValueParameterValueParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterCall__ValueAssignment_6"


    // $ANTLR start "rule__Joint__NameAssignment_1"
    // InternalKinematicsParser.g:7453:1: rule__Joint__NameAssignment_1 : ( ruleParameterString ) ;
    public final void rule__Joint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7457:1: ( ( ruleParameterString ) )
            // InternalKinematicsParser.g:7458:2: ( ruleParameterString )
            {
            // InternalKinematicsParser.g:7458:2: ( ruleParameterString )
            // InternalKinematicsParser.g:7459:3: ruleParameterString
            {
             before(grammarAccess.getJointAccess().getNameParameterStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterString();

            state._fsp--;

             after(grammarAccess.getJointAccess().getNameParameterStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__NameAssignment_1"


    // $ANTLR start "rule__Joint__TypeAssignment_5"
    // InternalKinematicsParser.g:7468:1: rule__Joint__TypeAssignment_5 : ( RULE_JOINTTYPE ) ;
    public final void rule__Joint__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7472:1: ( ( RULE_JOINTTYPE ) )
            // InternalKinematicsParser.g:7473:2: ( RULE_JOINTTYPE )
            {
            // InternalKinematicsParser.g:7473:2: ( RULE_JOINTTYPE )
            // InternalKinematicsParser.g:7474:3: RULE_JOINTTYPE
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
    // InternalKinematicsParser.g:7483:1: rule__Joint__ParentAssignment_7 : ( ruleParameterLink ) ;
    public final void rule__Joint__ParentAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7487:1: ( ( ruleParameterLink ) )
            // InternalKinematicsParser.g:7488:2: ( ruleParameterLink )
            {
            // InternalKinematicsParser.g:7488:2: ( ruleParameterLink )
            // InternalKinematicsParser.g:7489:3: ruleParameterLink
            {
             before(grammarAccess.getJointAccess().getParentParameterLinkParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterLink();

            state._fsp--;

             after(grammarAccess.getJointAccess().getParentParameterLinkParserRuleCall_7_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:7498:1: rule__Joint__ChildAssignment_9 : ( ruleParameterLink ) ;
    public final void rule__Joint__ChildAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7502:1: ( ( ruleParameterLink ) )
            // InternalKinematicsParser.g:7503:2: ( ruleParameterLink )
            {
            // InternalKinematicsParser.g:7503:2: ( ruleParameterLink )
            // InternalKinematicsParser.g:7504:3: ruleParameterLink
            {
             before(grammarAccess.getJointAccess().getChildParameterLinkParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterLink();

            state._fsp--;

             after(grammarAccess.getJointAccess().getChildParameterLinkParserRuleCall_9_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:7513:1: rule__Joint__OriginAssignment_11 : ( ruleParameterPose ) ;
    public final void rule__Joint__OriginAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7517:1: ( ( ruleParameterPose ) )
            // InternalKinematicsParser.g:7518:2: ( ruleParameterPose )
            {
            // InternalKinematicsParser.g:7518:2: ( ruleParameterPose )
            // InternalKinematicsParser.g:7519:3: ruleParameterPose
            {
             before(grammarAccess.getJointAccess().getOriginParameterPoseParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterPose();

            state._fsp--;

             after(grammarAccess.getJointAccess().getOriginParameterPoseParserRuleCall_11_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:7528:1: rule__Joint__AxisAssignment_12_1 : ( ruleVector3 ) ;
    public final void rule__Joint__AxisAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7532:1: ( ( ruleVector3 ) )
            // InternalKinematicsParser.g:7533:2: ( ruleVector3 )
            {
            // InternalKinematicsParser.g:7533:2: ( ruleVector3 )
            // InternalKinematicsParser.g:7534:3: ruleVector3
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
    // InternalKinematicsParser.g:7543:1: rule__Joint__LimitAssignment_13_1 : ( ruleLimit ) ;
    public final void rule__Joint__LimitAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7547:1: ( ( ruleLimit ) )
            // InternalKinematicsParser.g:7548:2: ( ruleLimit )
            {
            // InternalKinematicsParser.g:7548:2: ( ruleLimit )
            // InternalKinematicsParser.g:7549:3: ruleLimit
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


    // $ANTLR start "rule__Link__NameAssignment_1"
    // InternalKinematicsParser.g:7558:1: rule__Link__NameAssignment_1 : ( ruleParameterString ) ;
    public final void rule__Link__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7562:1: ( ( ruleParameterString ) )
            // InternalKinematicsParser.g:7563:2: ( ruleParameterString )
            {
            // InternalKinematicsParser.g:7563:2: ( ruleParameterString )
            // InternalKinematicsParser.g:7564:3: ruleParameterString
            {
             before(grammarAccess.getLinkAccess().getNameParameterStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterString();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getNameParameterStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__NameAssignment_1"


    // $ANTLR start "rule__Link__InertialAssignment_2_2_1"
    // InternalKinematicsParser.g:7573:1: rule__Link__InertialAssignment_2_2_1 : ( ruleInertial ) ;
    public final void rule__Link__InertialAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7577:1: ( ( ruleInertial ) )
            // InternalKinematicsParser.g:7578:2: ( ruleInertial )
            {
            // InternalKinematicsParser.g:7578:2: ( ruleInertial )
            // InternalKinematicsParser.g:7579:3: ruleInertial
            {
             before(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInertial();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__InertialAssignment_2_2_1"


    // $ANTLR start "rule__Link__VisualAssignment_2_3_1"
    // InternalKinematicsParser.g:7588:1: rule__Link__VisualAssignment_2_3_1 : ( ruleVisual ) ;
    public final void rule__Link__VisualAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7592:1: ( ( ruleVisual ) )
            // InternalKinematicsParser.g:7593:2: ( ruleVisual )
            {
            // InternalKinematicsParser.g:7593:2: ( ruleVisual )
            // InternalKinematicsParser.g:7594:3: ruleVisual
            {
             before(grammarAccess.getLinkAccess().getVisualVisualParserRuleCall_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVisual();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getVisualVisualParserRuleCall_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__VisualAssignment_2_3_1"


    // $ANTLR start "rule__Link__CollisionAssignment_2_4_1"
    // InternalKinematicsParser.g:7603:1: rule__Link__CollisionAssignment_2_4_1 : ( ruleCollision ) ;
    public final void rule__Link__CollisionAssignment_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7607:1: ( ( ruleCollision ) )
            // InternalKinematicsParser.g:7608:2: ( ruleCollision )
            {
            // InternalKinematicsParser.g:7608:2: ( ruleCollision )
            // InternalKinematicsParser.g:7609:3: ruleCollision
            {
             before(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_2_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCollision();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_2_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__CollisionAssignment_2_4_1"


    // $ANTLR start "rule__Pose__RpyAssignment_2_1"
    // InternalKinematicsParser.g:7618:1: rule__Pose__RpyAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Pose__RpyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7622:1: ( ( RULE_STRING ) )
            // InternalKinematicsParser.g:7623:2: ( RULE_STRING )
            {
            // InternalKinematicsParser.g:7623:2: ( RULE_STRING )
            // InternalKinematicsParser.g:7624:3: RULE_STRING
            {
             before(grammarAccess.getPoseAccess().getRpySTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getRpySTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:7633:1: rule__Pose__XyzAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Pose__XyzAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7637:1: ( ( RULE_STRING ) )
            // InternalKinematicsParser.g:7638:2: ( RULE_STRING )
            {
            // InternalKinematicsParser.g:7638:2: ( RULE_STRING )
            // InternalKinematicsParser.g:7639:3: RULE_STRING
            {
             before(grammarAccess.getPoseAccess().getXyzSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getXyzSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:7648:1: rule__Vector3__XyzAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Vector3__XyzAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7652:1: ( ( RULE_STRING ) )
            // InternalKinematicsParser.g:7653:2: ( RULE_STRING )
            {
            // InternalKinematicsParser.g:7653:2: ( RULE_STRING )
            // InternalKinematicsParser.g:7654:3: RULE_STRING
            {
             before(grammarAccess.getVector3Access().getXyzSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVector3Access().getXyzSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:7663:1: rule__Limit__EffortAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Limit__EffortAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7667:1: ( ( RULE_STRING ) )
            // InternalKinematicsParser.g:7668:2: ( RULE_STRING )
            {
            // InternalKinematicsParser.g:7668:2: ( RULE_STRING )
            // InternalKinematicsParser.g:7669:3: RULE_STRING
            {
             before(grammarAccess.getLimitAccess().getEffortSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getEffortSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:7678:1: rule__Limit__LowerAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Limit__LowerAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7682:1: ( ( RULE_STRING ) )
            // InternalKinematicsParser.g:7683:2: ( RULE_STRING )
            {
            // InternalKinematicsParser.g:7683:2: ( RULE_STRING )
            // InternalKinematicsParser.g:7684:3: RULE_STRING
            {
             before(grammarAccess.getLimitAccess().getLowerSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getLowerSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:7693:1: rule__Limit__UpperAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Limit__UpperAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7697:1: ( ( RULE_STRING ) )
            // InternalKinematicsParser.g:7698:2: ( RULE_STRING )
            {
            // InternalKinematicsParser.g:7698:2: ( RULE_STRING )
            // InternalKinematicsParser.g:7699:3: RULE_STRING
            {
             before(grammarAccess.getLimitAccess().getUpperSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getUpperSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:7708:1: rule__Limit__VelocityAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Limit__VelocityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7712:1: ( ( RULE_STRING ) )
            // InternalKinematicsParser.g:7713:2: ( RULE_STRING )
            {
            // InternalKinematicsParser.g:7713:2: ( RULE_STRING )
            // InternalKinematicsParser.g:7714:3: RULE_STRING
            {
             before(grammarAccess.getLimitAccess().getVelocitySTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getVelocitySTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:7723:1: rule__Inertial__OriginAssignment_2_1 : ( rulePose ) ;
    public final void rule__Inertial__OriginAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7727:1: ( ( rulePose ) )
            // InternalKinematicsParser.g:7728:2: ( rulePose )
            {
            // InternalKinematicsParser.g:7728:2: ( rulePose )
            // InternalKinematicsParser.g:7729:3: rulePose
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
    // InternalKinematicsParser.g:7738:1: rule__Inertial__MassAssignment_3_1 : ( ruleMass ) ;
    public final void rule__Inertial__MassAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7742:1: ( ( ruleMass ) )
            // InternalKinematicsParser.g:7743:2: ( ruleMass )
            {
            // InternalKinematicsParser.g:7743:2: ( ruleMass )
            // InternalKinematicsParser.g:7744:3: ruleMass
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
    // InternalKinematicsParser.g:7753:1: rule__Inertial__InertiaAssignment_4_1 : ( ruleInertia ) ;
    public final void rule__Inertial__InertiaAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7757:1: ( ( ruleInertia ) )
            // InternalKinematicsParser.g:7758:2: ( ruleInertia )
            {
            // InternalKinematicsParser.g:7758:2: ( ruleInertia )
            // InternalKinematicsParser.g:7759:3: ruleInertia
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
    // InternalKinematicsParser.g:7768:1: rule__Visual__OriginAssignment_1_1 : ( rulePose ) ;
    public final void rule__Visual__OriginAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7772:1: ( ( rulePose ) )
            // InternalKinematicsParser.g:7773:2: ( rulePose )
            {
            // InternalKinematicsParser.g:7773:2: ( rulePose )
            // InternalKinematicsParser.g:7774:3: rulePose
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
    // InternalKinematicsParser.g:7783:1: rule__Visual__GeometryAssignment_3 : ( ruleGeometry ) ;
    public final void rule__Visual__GeometryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7787:1: ( ( ruleGeometry ) )
            // InternalKinematicsParser.g:7788:2: ( ruleGeometry )
            {
            // InternalKinematicsParser.g:7788:2: ( ruleGeometry )
            // InternalKinematicsParser.g:7789:3: ruleGeometry
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
    // InternalKinematicsParser.g:7798:1: rule__Collision__OriginAssignment_1_1 : ( rulePose ) ;
    public final void rule__Collision__OriginAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7802:1: ( ( rulePose ) )
            // InternalKinematicsParser.g:7803:2: ( rulePose )
            {
            // InternalKinematicsParser.g:7803:2: ( rulePose )
            // InternalKinematicsParser.g:7804:3: rulePose
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
    // InternalKinematicsParser.g:7813:1: rule__Collision__GeometryAssignment_3 : ( ruleGeometry ) ;
    public final void rule__Collision__GeometryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7817:1: ( ( ruleGeometry ) )
            // InternalKinematicsParser.g:7818:2: ( ruleGeometry )
            {
            // InternalKinematicsParser.g:7818:2: ( ruleGeometry )
            // InternalKinematicsParser.g:7819:3: ruleGeometry
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
    // InternalKinematicsParser.g:7828:1: rule__Mass__ValueAssignment_1 : ( ruleDouble0 ) ;
    public final void rule__Mass__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7832:1: ( ( ruleDouble0 ) )
            // InternalKinematicsParser.g:7833:2: ( ruleDouble0 )
            {
            // InternalKinematicsParser.g:7833:2: ( ruleDouble0 )
            // InternalKinematicsParser.g:7834:3: ruleDouble0
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
    // InternalKinematicsParser.g:7843:1: rule__Inertia__IxxAssignment_2_1 : ( ruleDouble0 ) ;
    public final void rule__Inertia__IxxAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7847:1: ( ( ruleDouble0 ) )
            // InternalKinematicsParser.g:7848:2: ( ruleDouble0 )
            {
            // InternalKinematicsParser.g:7848:2: ( ruleDouble0 )
            // InternalKinematicsParser.g:7849:3: ruleDouble0
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
    // InternalKinematicsParser.g:7858:1: rule__Inertia__IxyAssignment_3_1 : ( ruleDouble0 ) ;
    public final void rule__Inertia__IxyAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7862:1: ( ( ruleDouble0 ) )
            // InternalKinematicsParser.g:7863:2: ( ruleDouble0 )
            {
            // InternalKinematicsParser.g:7863:2: ( ruleDouble0 )
            // InternalKinematicsParser.g:7864:3: ruleDouble0
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
    // InternalKinematicsParser.g:7873:1: rule__Inertia__IxzAssignment_4_1 : ( ruleDouble0 ) ;
    public final void rule__Inertia__IxzAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7877:1: ( ( ruleDouble0 ) )
            // InternalKinematicsParser.g:7878:2: ( ruleDouble0 )
            {
            // InternalKinematicsParser.g:7878:2: ( ruleDouble0 )
            // InternalKinematicsParser.g:7879:3: ruleDouble0
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
    // InternalKinematicsParser.g:7888:1: rule__Inertia__IyyAssignment_5_1 : ( ruleDouble0 ) ;
    public final void rule__Inertia__IyyAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7892:1: ( ( ruleDouble0 ) )
            // InternalKinematicsParser.g:7893:2: ( ruleDouble0 )
            {
            // InternalKinematicsParser.g:7893:2: ( ruleDouble0 )
            // InternalKinematicsParser.g:7894:3: ruleDouble0
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
    // InternalKinematicsParser.g:7903:1: rule__Inertia__IyzAssignment_6_1 : ( ruleDouble0 ) ;
    public final void rule__Inertia__IyzAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7907:1: ( ( ruleDouble0 ) )
            // InternalKinematicsParser.g:7908:2: ( ruleDouble0 )
            {
            // InternalKinematicsParser.g:7908:2: ( ruleDouble0 )
            // InternalKinematicsParser.g:7909:3: ruleDouble0
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
    // InternalKinematicsParser.g:7918:1: rule__Inertia__IzzAssignment_7_1 : ( ruleDouble0 ) ;
    public final void rule__Inertia__IzzAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7922:1: ( ( ruleDouble0 ) )
            // InternalKinematicsParser.g:7923:2: ( ruleDouble0 )
            {
            // InternalKinematicsParser.g:7923:2: ( ruleDouble0 )
            // InternalKinematicsParser.g:7924:3: ruleDouble0
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
    // InternalKinematicsParser.g:7933:1: rule__Geometry__BoxAssignment_2_1 : ( ruleBox ) ;
    public final void rule__Geometry__BoxAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7937:1: ( ( ruleBox ) )
            // InternalKinematicsParser.g:7938:2: ( ruleBox )
            {
            // InternalKinematicsParser.g:7938:2: ( ruleBox )
            // InternalKinematicsParser.g:7939:3: ruleBox
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
    // InternalKinematicsParser.g:7948:1: rule__Geometry__CylinderAssignment_3_1 : ( ruleCylinder ) ;
    public final void rule__Geometry__CylinderAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7952:1: ( ( ruleCylinder ) )
            // InternalKinematicsParser.g:7953:2: ( ruleCylinder )
            {
            // InternalKinematicsParser.g:7953:2: ( ruleCylinder )
            // InternalKinematicsParser.g:7954:3: ruleCylinder
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
    // InternalKinematicsParser.g:7963:1: rule__Geometry__SphereAssignment_4_1 : ( ruleSphere ) ;
    public final void rule__Geometry__SphereAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7967:1: ( ( ruleSphere ) )
            // InternalKinematicsParser.g:7968:2: ( ruleSphere )
            {
            // InternalKinematicsParser.g:7968:2: ( ruleSphere )
            // InternalKinematicsParser.g:7969:3: ruleSphere
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
    // InternalKinematicsParser.g:7978:1: rule__Geometry__MeshAssignment_5_1 : ( ruleMesh ) ;
    public final void rule__Geometry__MeshAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7982:1: ( ( ruleMesh ) )
            // InternalKinematicsParser.g:7983:2: ( ruleMesh )
            {
            // InternalKinematicsParser.g:7983:2: ( ruleMesh )
            // InternalKinematicsParser.g:7984:3: ruleMesh
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
    // InternalKinematicsParser.g:7993:1: rule__Box__SizeAssignment_3 : ( ruleParameterString ) ;
    public final void rule__Box__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:7997:1: ( ( ruleParameterString ) )
            // InternalKinematicsParser.g:7998:2: ( ruleParameterString )
            {
            // InternalKinematicsParser.g:7998:2: ( ruleParameterString )
            // InternalKinematicsParser.g:7999:3: ruleParameterString
            {
             before(grammarAccess.getBoxAccess().getSizeParameterStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterString();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getSizeParameterStringParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:8008:1: rule__Cylinder__LengthAssignment_2 : ( ruleDouble0 ) ;
    public final void rule__Cylinder__LengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8012:1: ( ( ruleDouble0 ) )
            // InternalKinematicsParser.g:8013:2: ( ruleDouble0 )
            {
            // InternalKinematicsParser.g:8013:2: ( ruleDouble0 )
            // InternalKinematicsParser.g:8014:3: ruleDouble0
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
    // InternalKinematicsParser.g:8023:1: rule__Cylinder__RadiusAssignment_4 : ( ruleDouble0 ) ;
    public final void rule__Cylinder__RadiusAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8027:1: ( ( ruleDouble0 ) )
            // InternalKinematicsParser.g:8028:2: ( ruleDouble0 )
            {
            // InternalKinematicsParser.g:8028:2: ( ruleDouble0 )
            // InternalKinematicsParser.g:8029:3: ruleDouble0
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
    // InternalKinematicsParser.g:8038:1: rule__Sphere__RadiusAssignment_2 : ( ruleDouble0 ) ;
    public final void rule__Sphere__RadiusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8042:1: ( ( ruleDouble0 ) )
            // InternalKinematicsParser.g:8043:2: ( ruleDouble0 )
            {
            // InternalKinematicsParser.g:8043:2: ( ruleDouble0 )
            // InternalKinematicsParser.g:8044:3: ruleDouble0
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
    // InternalKinematicsParser.g:8053:1: rule__Mesh__FilenameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Mesh__FilenameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8057:1: ( ( RULE_STRING ) )
            // InternalKinematicsParser.g:8058:2: ( RULE_STRING )
            {
            // InternalKinematicsParser.g:8058:2: ( RULE_STRING )
            // InternalKinematicsParser.g:8059:3: RULE_STRING
            {
             before(grammarAccess.getMeshAccess().getFilenameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getFilenameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalKinematicsParser.g:8068:1: rule__Mesh__ScaleAssignment_3_1 : ( ruleDouble0 ) ;
    public final void rule__Mesh__ScaleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematicsParser.g:8072:1: ( ( ruleDouble0 ) )
            // InternalKinematicsParser.g:8073:2: ( ruleDouble0 )
            {
            // InternalKinematicsParser.g:8073:2: ( ruleDouble0 )
            // InternalKinematicsParser.g:8074:3: ruleDouble0
            {
             before(grammarAccess.getMeshAccess().getScaleDouble0ParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getMeshAccess().getScaleDouble0ParserRuleCall_3_1_0()); 

            }


            }

        }
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x1000000800082010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x1000000800000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000020004004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x1000000000008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x4800000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x1010000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x4800000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x1000000410000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x1000000001000440L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x100A000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x1008000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x1000000240010800L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x1000001000101000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000100200L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x1001F80000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x1000042000800080L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x1000000100000000L});

}