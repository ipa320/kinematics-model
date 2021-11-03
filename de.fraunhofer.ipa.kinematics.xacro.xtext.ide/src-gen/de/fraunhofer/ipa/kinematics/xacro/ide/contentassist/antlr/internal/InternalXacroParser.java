package de.fraunhofer.ipa.kinematics.xacro.ide.contentassist.antlr.internal;

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
import de.fraunhofer.ipa.kinematics.xacro.services.XacroGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXacroParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE", "RULE_ID", "RULE_STRING", "RULE_JOINTTYPE", "RULE_DIGIT", "RULE_BOOLEAN", "RULE_DECINT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'{'", "'name'", "'}'", "'version'", "'macro'", "','", "'macroCall'", "'body'", "'Macro'", "'parameter'", "'Parameter'", "'type'", "'value'", "'String'", "'LinkRef'", "'Pose'", "'Body'", "'link'", "'joint'", "'MacroCall'", "'ParameterCall'", "'Joint'", "'parent'", "'child'", "'origin'", "'axis'", "'limit'", "'Link'", "'inertial'", "'visual'", "'collision'", "'rpy'", "'xyz'", "'Vector3'", "'Limit'", "'effort'", "'lower'", "'upper'", "'velocity'", "'Inertial'", "'mass'", "'inertia'", "'Visual'", "'geometry'", "'Collision'", "'Mass'", "'Inertia'", "'ixx'", "'ixy'", "'ixz'", "'iyy'", "'iyz'", "'izz'", "'Geometry'", "'box'", "'cylinder'", "'sphere'", "'mesh'", "'Box'", "'size'", "'Cylinder'", "'length'", "'radius'", "'Sphere'", "'Mesh'", "'filename'", "'scale'"
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
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=4;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int RULE_JOINTTYPE=7;
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

    	public void setGrammarAccess(XacroGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRobot"
    // InternalXacro.g:53:1: entryRuleRobot : ruleRobot EOF ;
    public final void entryRuleRobot() throws RecognitionException {
        try {
            // InternalXacro.g:54:1: ( ruleRobot EOF )
            // InternalXacro.g:55:1: ruleRobot EOF
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
    // InternalXacro.g:62:1: ruleRobot : ( ( rule__Robot__Group__0 ) ) ;
    public final void ruleRobot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:66:2: ( ( ( rule__Robot__Group__0 ) ) )
            // InternalXacro.g:67:2: ( ( rule__Robot__Group__0 ) )
            {
            // InternalXacro.g:67:2: ( ( rule__Robot__Group__0 ) )
            // InternalXacro.g:68:3: ( rule__Robot__Group__0 )
            {
             before(grammarAccess.getRobotAccess().getGroup()); 
            // InternalXacro.g:69:3: ( rule__Robot__Group__0 )
            // InternalXacro.g:69:4: rule__Robot__Group__0
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
    // InternalXacro.g:78:1: entryRuleMacro : ruleMacro EOF ;
    public final void entryRuleMacro() throws RecognitionException {
        try {
            // InternalXacro.g:79:1: ( ruleMacro EOF )
            // InternalXacro.g:80:1: ruleMacro EOF
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
    // InternalXacro.g:87:1: ruleMacro : ( ( rule__Macro__Group__0 ) ) ;
    public final void ruleMacro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:91:2: ( ( ( rule__Macro__Group__0 ) ) )
            // InternalXacro.g:92:2: ( ( rule__Macro__Group__0 ) )
            {
            // InternalXacro.g:92:2: ( ( rule__Macro__Group__0 ) )
            // InternalXacro.g:93:3: ( rule__Macro__Group__0 )
            {
             before(grammarAccess.getMacroAccess().getGroup()); 
            // InternalXacro.g:94:3: ( rule__Macro__Group__0 )
            // InternalXacro.g:94:4: rule__Macro__Group__0
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
    // InternalXacro.g:103:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalXacro.g:104:1: ( ruleParameter EOF )
            // InternalXacro.g:105:1: ruleParameter EOF
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
    // InternalXacro.g:112:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:116:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalXacro.g:117:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalXacro.g:117:2: ( ( rule__Parameter__Group__0 ) )
            // InternalXacro.g:118:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalXacro.g:119:3: ( rule__Parameter__Group__0 )
            // InternalXacro.g:119:4: rule__Parameter__Group__0
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
    // InternalXacro.g:128:1: entryRuleParameterValue : ruleParameterValue EOF ;
    public final void entryRuleParameterValue() throws RecognitionException {
        try {
            // InternalXacro.g:129:1: ( ruleParameterValue EOF )
            // InternalXacro.g:130:1: ruleParameterValue EOF
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
    // InternalXacro.g:137:1: ruleParameterValue : ( ( rule__ParameterValue__Alternatives ) ) ;
    public final void ruleParameterValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:141:2: ( ( ( rule__ParameterValue__Alternatives ) ) )
            // InternalXacro.g:142:2: ( ( rule__ParameterValue__Alternatives ) )
            {
            // InternalXacro.g:142:2: ( ( rule__ParameterValue__Alternatives ) )
            // InternalXacro.g:143:3: ( rule__ParameterValue__Alternatives )
            {
             before(grammarAccess.getParameterValueAccess().getAlternatives()); 
            // InternalXacro.g:144:3: ( rule__ParameterValue__Alternatives )
            // InternalXacro.g:144:4: rule__ParameterValue__Alternatives
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
    // InternalXacro.g:153:1: entryRuleLinkRef : ruleLinkRef EOF ;
    public final void entryRuleLinkRef() throws RecognitionException {
        try {
            // InternalXacro.g:154:1: ( ruleLinkRef EOF )
            // InternalXacro.g:155:1: ruleLinkRef EOF
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
    // InternalXacro.g:162:1: ruleLinkRef : ( ( rule__LinkRef__RefAssignment ) ) ;
    public final void ruleLinkRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:166:2: ( ( ( rule__LinkRef__RefAssignment ) ) )
            // InternalXacro.g:167:2: ( ( rule__LinkRef__RefAssignment ) )
            {
            // InternalXacro.g:167:2: ( ( rule__LinkRef__RefAssignment ) )
            // InternalXacro.g:168:3: ( rule__LinkRef__RefAssignment )
            {
             before(grammarAccess.getLinkRefAccess().getRefAssignment()); 
            // InternalXacro.g:169:3: ( rule__LinkRef__RefAssignment )
            // InternalXacro.g:169:4: rule__LinkRef__RefAssignment
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
    // InternalXacro.g:178:1: entryRuleParameterString : ruleParameterString EOF ;
    public final void entryRuleParameterString() throws RecognitionException {
        try {
            // InternalXacro.g:179:1: ( ruleParameterString EOF )
            // InternalXacro.g:180:1: ruleParameterString EOF
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
    // InternalXacro.g:187:1: ruleParameterString : ( ( rule__ParameterString__Group__0 ) ) ;
    public final void ruleParameterString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:191:2: ( ( ( rule__ParameterString__Group__0 ) ) )
            // InternalXacro.g:192:2: ( ( rule__ParameterString__Group__0 ) )
            {
            // InternalXacro.g:192:2: ( ( rule__ParameterString__Group__0 ) )
            // InternalXacro.g:193:3: ( rule__ParameterString__Group__0 )
            {
             before(grammarAccess.getParameterStringAccess().getGroup()); 
            // InternalXacro.g:194:3: ( rule__ParameterString__Group__0 )
            // InternalXacro.g:194:4: rule__ParameterString__Group__0
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
    // InternalXacro.g:203:1: entryRuleParameterPose : ruleParameterPose EOF ;
    public final void entryRuleParameterPose() throws RecognitionException {
        try {
            // InternalXacro.g:204:1: ( ruleParameterPose EOF )
            // InternalXacro.g:205:1: ruleParameterPose EOF
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
    // InternalXacro.g:212:1: ruleParameterPose : ( ( rule__ParameterPose__Alternatives ) ) ;
    public final void ruleParameterPose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:216:2: ( ( ( rule__ParameterPose__Alternatives ) ) )
            // InternalXacro.g:217:2: ( ( rule__ParameterPose__Alternatives ) )
            {
            // InternalXacro.g:217:2: ( ( rule__ParameterPose__Alternatives ) )
            // InternalXacro.g:218:3: ( rule__ParameterPose__Alternatives )
            {
             before(grammarAccess.getParameterPoseAccess().getAlternatives()); 
            // InternalXacro.g:219:3: ( rule__ParameterPose__Alternatives )
            // InternalXacro.g:219:4: rule__ParameterPose__Alternatives
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
    // InternalXacro.g:228:1: entryRuleParameterLink : ruleParameterLink EOF ;
    public final void entryRuleParameterLink() throws RecognitionException {
        try {
            // InternalXacro.g:229:1: ( ruleParameterLink EOF )
            // InternalXacro.g:230:1: ruleParameterLink EOF
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
    // InternalXacro.g:237:1: ruleParameterLink : ( ( rule__ParameterLink__Alternatives ) ) ;
    public final void ruleParameterLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:241:2: ( ( ( rule__ParameterLink__Alternatives ) ) )
            // InternalXacro.g:242:2: ( ( rule__ParameterLink__Alternatives ) )
            {
            // InternalXacro.g:242:2: ( ( rule__ParameterLink__Alternatives ) )
            // InternalXacro.g:243:3: ( rule__ParameterLink__Alternatives )
            {
             before(grammarAccess.getParameterLinkAccess().getAlternatives()); 
            // InternalXacro.g:244:3: ( rule__ParameterLink__Alternatives )
            // InternalXacro.g:244:4: rule__ParameterLink__Alternatives
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
    // InternalXacro.g:253:1: entryRuleParameterType : ruleParameterType EOF ;
    public final void entryRuleParameterType() throws RecognitionException {
        try {
            // InternalXacro.g:254:1: ( ruleParameterType EOF )
            // InternalXacro.g:255:1: ruleParameterType EOF
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
    // InternalXacro.g:262:1: ruleParameterType : ( ( rule__ParameterType__Alternatives ) ) ;
    public final void ruleParameterType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:266:2: ( ( ( rule__ParameterType__Alternatives ) ) )
            // InternalXacro.g:267:2: ( ( rule__ParameterType__Alternatives ) )
            {
            // InternalXacro.g:267:2: ( ( rule__ParameterType__Alternatives ) )
            // InternalXacro.g:268:3: ( rule__ParameterType__Alternatives )
            {
             before(grammarAccess.getParameterTypeAccess().getAlternatives()); 
            // InternalXacro.g:269:3: ( rule__ParameterType__Alternatives )
            // InternalXacro.g:269:4: rule__ParameterType__Alternatives
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
    // InternalXacro.g:278:1: entryRuleParameterStringType : ruleParameterStringType EOF ;
    public final void entryRuleParameterStringType() throws RecognitionException {
        try {
            // InternalXacro.g:279:1: ( ruleParameterStringType EOF )
            // InternalXacro.g:280:1: ruleParameterStringType EOF
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
    // InternalXacro.g:287:1: ruleParameterStringType : ( ( rule__ParameterStringType__Group__0 ) ) ;
    public final void ruleParameterStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:291:2: ( ( ( rule__ParameterStringType__Group__0 ) ) )
            // InternalXacro.g:292:2: ( ( rule__ParameterStringType__Group__0 ) )
            {
            // InternalXacro.g:292:2: ( ( rule__ParameterStringType__Group__0 ) )
            // InternalXacro.g:293:3: ( rule__ParameterStringType__Group__0 )
            {
             before(grammarAccess.getParameterStringTypeAccess().getGroup()); 
            // InternalXacro.g:294:3: ( rule__ParameterStringType__Group__0 )
            // InternalXacro.g:294:4: rule__ParameterStringType__Group__0
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
    // InternalXacro.g:303:1: entryRuleParameterLinkRefType : ruleParameterLinkRefType EOF ;
    public final void entryRuleParameterLinkRefType() throws RecognitionException {
        try {
            // InternalXacro.g:304:1: ( ruleParameterLinkRefType EOF )
            // InternalXacro.g:305:1: ruleParameterLinkRefType EOF
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
    // InternalXacro.g:312:1: ruleParameterLinkRefType : ( ( rule__ParameterLinkRefType__Group__0 ) ) ;
    public final void ruleParameterLinkRefType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:316:2: ( ( ( rule__ParameterLinkRefType__Group__0 ) ) )
            // InternalXacro.g:317:2: ( ( rule__ParameterLinkRefType__Group__0 ) )
            {
            // InternalXacro.g:317:2: ( ( rule__ParameterLinkRefType__Group__0 ) )
            // InternalXacro.g:318:3: ( rule__ParameterLinkRefType__Group__0 )
            {
             before(grammarAccess.getParameterLinkRefTypeAccess().getGroup()); 
            // InternalXacro.g:319:3: ( rule__ParameterLinkRefType__Group__0 )
            // InternalXacro.g:319:4: rule__ParameterLinkRefType__Group__0
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
    // InternalXacro.g:328:1: entryRuleParameterPoseType : ruleParameterPoseType EOF ;
    public final void entryRuleParameterPoseType() throws RecognitionException {
        try {
            // InternalXacro.g:329:1: ( ruleParameterPoseType EOF )
            // InternalXacro.g:330:1: ruleParameterPoseType EOF
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
    // InternalXacro.g:337:1: ruleParameterPoseType : ( ( rule__ParameterPoseType__Group__0 ) ) ;
    public final void ruleParameterPoseType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:341:2: ( ( ( rule__ParameterPoseType__Group__0 ) ) )
            // InternalXacro.g:342:2: ( ( rule__ParameterPoseType__Group__0 ) )
            {
            // InternalXacro.g:342:2: ( ( rule__ParameterPoseType__Group__0 ) )
            // InternalXacro.g:343:3: ( rule__ParameterPoseType__Group__0 )
            {
             before(grammarAccess.getParameterPoseTypeAccess().getGroup()); 
            // InternalXacro.g:344:3: ( rule__ParameterPoseType__Group__0 )
            // InternalXacro.g:344:4: rule__ParameterPoseType__Group__0
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
    // InternalXacro.g:353:1: entryRuleBody : ruleBody EOF ;
    public final void entryRuleBody() throws RecognitionException {
        try {
            // InternalXacro.g:354:1: ( ruleBody EOF )
            // InternalXacro.g:355:1: ruleBody EOF
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
    // InternalXacro.g:362:1: ruleBody : ( ( rule__Body__Group__0 ) ) ;
    public final void ruleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:366:2: ( ( ( rule__Body__Group__0 ) ) )
            // InternalXacro.g:367:2: ( ( rule__Body__Group__0 ) )
            {
            // InternalXacro.g:367:2: ( ( rule__Body__Group__0 ) )
            // InternalXacro.g:368:3: ( rule__Body__Group__0 )
            {
             before(grammarAccess.getBodyAccess().getGroup()); 
            // InternalXacro.g:369:3: ( rule__Body__Group__0 )
            // InternalXacro.g:369:4: rule__Body__Group__0
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
    // InternalXacro.g:378:1: entryRuleMacroCall : ruleMacroCall EOF ;
    public final void entryRuleMacroCall() throws RecognitionException {
        try {
            // InternalXacro.g:379:1: ( ruleMacroCall EOF )
            // InternalXacro.g:380:1: ruleMacroCall EOF
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
    // InternalXacro.g:387:1: ruleMacroCall : ( ( rule__MacroCall__Group__0 ) ) ;
    public final void ruleMacroCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:391:2: ( ( ( rule__MacroCall__Group__0 ) ) )
            // InternalXacro.g:392:2: ( ( rule__MacroCall__Group__0 ) )
            {
            // InternalXacro.g:392:2: ( ( rule__MacroCall__Group__0 ) )
            // InternalXacro.g:393:3: ( rule__MacroCall__Group__0 )
            {
             before(grammarAccess.getMacroCallAccess().getGroup()); 
            // InternalXacro.g:394:3: ( rule__MacroCall__Group__0 )
            // InternalXacro.g:394:4: rule__MacroCall__Group__0
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
    // InternalXacro.g:403:1: entryRuleParameterCall : ruleParameterCall EOF ;
    public final void entryRuleParameterCall() throws RecognitionException {
        try {
            // InternalXacro.g:404:1: ( ruleParameterCall EOF )
            // InternalXacro.g:405:1: ruleParameterCall EOF
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
    // InternalXacro.g:412:1: ruleParameterCall : ( ( rule__ParameterCall__Group__0 ) ) ;
    public final void ruleParameterCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:416:2: ( ( ( rule__ParameterCall__Group__0 ) ) )
            // InternalXacro.g:417:2: ( ( rule__ParameterCall__Group__0 ) )
            {
            // InternalXacro.g:417:2: ( ( rule__ParameterCall__Group__0 ) )
            // InternalXacro.g:418:3: ( rule__ParameterCall__Group__0 )
            {
             before(grammarAccess.getParameterCallAccess().getGroup()); 
            // InternalXacro.g:419:3: ( rule__ParameterCall__Group__0 )
            // InternalXacro.g:419:4: rule__ParameterCall__Group__0
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
    // InternalXacro.g:428:1: entryRuleJoint : ruleJoint EOF ;
    public final void entryRuleJoint() throws RecognitionException {
        try {
            // InternalXacro.g:429:1: ( ruleJoint EOF )
            // InternalXacro.g:430:1: ruleJoint EOF
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
    // InternalXacro.g:437:1: ruleJoint : ( ( rule__Joint__Group__0 ) ) ;
    public final void ruleJoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:441:2: ( ( ( rule__Joint__Group__0 ) ) )
            // InternalXacro.g:442:2: ( ( rule__Joint__Group__0 ) )
            {
            // InternalXacro.g:442:2: ( ( rule__Joint__Group__0 ) )
            // InternalXacro.g:443:3: ( rule__Joint__Group__0 )
            {
             before(grammarAccess.getJointAccess().getGroup()); 
            // InternalXacro.g:444:3: ( rule__Joint__Group__0 )
            // InternalXacro.g:444:4: rule__Joint__Group__0
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
    // InternalXacro.g:453:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalXacro.g:454:1: ( ruleLink EOF )
            // InternalXacro.g:455:1: ruleLink EOF
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
    // InternalXacro.g:462:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:466:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalXacro.g:467:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalXacro.g:467:2: ( ( rule__Link__Group__0 ) )
            // InternalXacro.g:468:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalXacro.g:469:3: ( rule__Link__Group__0 )
            // InternalXacro.g:469:4: rule__Link__Group__0
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
    // InternalXacro.g:478:1: entryRulePose : rulePose EOF ;
    public final void entryRulePose() throws RecognitionException {
        try {
            // InternalXacro.g:479:1: ( rulePose EOF )
            // InternalXacro.g:480:1: rulePose EOF
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
    // InternalXacro.g:487:1: rulePose : ( ( rule__Pose__Group__0 ) ) ;
    public final void rulePose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:491:2: ( ( ( rule__Pose__Group__0 ) ) )
            // InternalXacro.g:492:2: ( ( rule__Pose__Group__0 ) )
            {
            // InternalXacro.g:492:2: ( ( rule__Pose__Group__0 ) )
            // InternalXacro.g:493:3: ( rule__Pose__Group__0 )
            {
             before(grammarAccess.getPoseAccess().getGroup()); 
            // InternalXacro.g:494:3: ( rule__Pose__Group__0 )
            // InternalXacro.g:494:4: rule__Pose__Group__0
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
    // InternalXacro.g:503:1: entryRuleVector3 : ruleVector3 EOF ;
    public final void entryRuleVector3() throws RecognitionException {
        try {
            // InternalXacro.g:504:1: ( ruleVector3 EOF )
            // InternalXacro.g:505:1: ruleVector3 EOF
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
    // InternalXacro.g:512:1: ruleVector3 : ( ( rule__Vector3__Group__0 ) ) ;
    public final void ruleVector3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:516:2: ( ( ( rule__Vector3__Group__0 ) ) )
            // InternalXacro.g:517:2: ( ( rule__Vector3__Group__0 ) )
            {
            // InternalXacro.g:517:2: ( ( rule__Vector3__Group__0 ) )
            // InternalXacro.g:518:3: ( rule__Vector3__Group__0 )
            {
             before(grammarAccess.getVector3Access().getGroup()); 
            // InternalXacro.g:519:3: ( rule__Vector3__Group__0 )
            // InternalXacro.g:519:4: rule__Vector3__Group__0
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
    // InternalXacro.g:528:1: entryRuleLimit : ruleLimit EOF ;
    public final void entryRuleLimit() throws RecognitionException {
        try {
            // InternalXacro.g:529:1: ( ruleLimit EOF )
            // InternalXacro.g:530:1: ruleLimit EOF
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
    // InternalXacro.g:537:1: ruleLimit : ( ( rule__Limit__Group__0 ) ) ;
    public final void ruleLimit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:541:2: ( ( ( rule__Limit__Group__0 ) ) )
            // InternalXacro.g:542:2: ( ( rule__Limit__Group__0 ) )
            {
            // InternalXacro.g:542:2: ( ( rule__Limit__Group__0 ) )
            // InternalXacro.g:543:3: ( rule__Limit__Group__0 )
            {
             before(grammarAccess.getLimitAccess().getGroup()); 
            // InternalXacro.g:544:3: ( rule__Limit__Group__0 )
            // InternalXacro.g:544:4: rule__Limit__Group__0
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
    // InternalXacro.g:553:1: entryRuleInertial : ruleInertial EOF ;
    public final void entryRuleInertial() throws RecognitionException {
        try {
            // InternalXacro.g:554:1: ( ruleInertial EOF )
            // InternalXacro.g:555:1: ruleInertial EOF
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
    // InternalXacro.g:562:1: ruleInertial : ( ( rule__Inertial__Group__0 ) ) ;
    public final void ruleInertial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:566:2: ( ( ( rule__Inertial__Group__0 ) ) )
            // InternalXacro.g:567:2: ( ( rule__Inertial__Group__0 ) )
            {
            // InternalXacro.g:567:2: ( ( rule__Inertial__Group__0 ) )
            // InternalXacro.g:568:3: ( rule__Inertial__Group__0 )
            {
             before(grammarAccess.getInertialAccess().getGroup()); 
            // InternalXacro.g:569:3: ( rule__Inertial__Group__0 )
            // InternalXacro.g:569:4: rule__Inertial__Group__0
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
    // InternalXacro.g:578:1: entryRuleVisual : ruleVisual EOF ;
    public final void entryRuleVisual() throws RecognitionException {
        try {
            // InternalXacro.g:579:1: ( ruleVisual EOF )
            // InternalXacro.g:580:1: ruleVisual EOF
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
    // InternalXacro.g:587:1: ruleVisual : ( ( rule__Visual__Group__0 ) ) ;
    public final void ruleVisual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:591:2: ( ( ( rule__Visual__Group__0 ) ) )
            // InternalXacro.g:592:2: ( ( rule__Visual__Group__0 ) )
            {
            // InternalXacro.g:592:2: ( ( rule__Visual__Group__0 ) )
            // InternalXacro.g:593:3: ( rule__Visual__Group__0 )
            {
             before(grammarAccess.getVisualAccess().getGroup()); 
            // InternalXacro.g:594:3: ( rule__Visual__Group__0 )
            // InternalXacro.g:594:4: rule__Visual__Group__0
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
    // InternalXacro.g:603:1: entryRuleCollision : ruleCollision EOF ;
    public final void entryRuleCollision() throws RecognitionException {
        try {
            // InternalXacro.g:604:1: ( ruleCollision EOF )
            // InternalXacro.g:605:1: ruleCollision EOF
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
    // InternalXacro.g:612:1: ruleCollision : ( ( rule__Collision__Group__0 ) ) ;
    public final void ruleCollision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:616:2: ( ( ( rule__Collision__Group__0 ) ) )
            // InternalXacro.g:617:2: ( ( rule__Collision__Group__0 ) )
            {
            // InternalXacro.g:617:2: ( ( rule__Collision__Group__0 ) )
            // InternalXacro.g:618:3: ( rule__Collision__Group__0 )
            {
             before(grammarAccess.getCollisionAccess().getGroup()); 
            // InternalXacro.g:619:3: ( rule__Collision__Group__0 )
            // InternalXacro.g:619:4: rule__Collision__Group__0
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
    // InternalXacro.g:628:1: entryRuleMass : ruleMass EOF ;
    public final void entryRuleMass() throws RecognitionException {
        try {
            // InternalXacro.g:629:1: ( ruleMass EOF )
            // InternalXacro.g:630:1: ruleMass EOF
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
    // InternalXacro.g:637:1: ruleMass : ( ( rule__Mass__Group__0 ) ) ;
    public final void ruleMass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:641:2: ( ( ( rule__Mass__Group__0 ) ) )
            // InternalXacro.g:642:2: ( ( rule__Mass__Group__0 ) )
            {
            // InternalXacro.g:642:2: ( ( rule__Mass__Group__0 ) )
            // InternalXacro.g:643:3: ( rule__Mass__Group__0 )
            {
             before(grammarAccess.getMassAccess().getGroup()); 
            // InternalXacro.g:644:3: ( rule__Mass__Group__0 )
            // InternalXacro.g:644:4: rule__Mass__Group__0
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
    // InternalXacro.g:653:1: entryRuleInertia : ruleInertia EOF ;
    public final void entryRuleInertia() throws RecognitionException {
        try {
            // InternalXacro.g:654:1: ( ruleInertia EOF )
            // InternalXacro.g:655:1: ruleInertia EOF
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
    // InternalXacro.g:662:1: ruleInertia : ( ( rule__Inertia__Group__0 ) ) ;
    public final void ruleInertia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:666:2: ( ( ( rule__Inertia__Group__0 ) ) )
            // InternalXacro.g:667:2: ( ( rule__Inertia__Group__0 ) )
            {
            // InternalXacro.g:667:2: ( ( rule__Inertia__Group__0 ) )
            // InternalXacro.g:668:3: ( rule__Inertia__Group__0 )
            {
             before(grammarAccess.getInertiaAccess().getGroup()); 
            // InternalXacro.g:669:3: ( rule__Inertia__Group__0 )
            // InternalXacro.g:669:4: rule__Inertia__Group__0
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
    // InternalXacro.g:678:1: entryRuleGeometry : ruleGeometry EOF ;
    public final void entryRuleGeometry() throws RecognitionException {
        try {
            // InternalXacro.g:679:1: ( ruleGeometry EOF )
            // InternalXacro.g:680:1: ruleGeometry EOF
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
    // InternalXacro.g:687:1: ruleGeometry : ( ( rule__Geometry__Group__0 ) ) ;
    public final void ruleGeometry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:691:2: ( ( ( rule__Geometry__Group__0 ) ) )
            // InternalXacro.g:692:2: ( ( rule__Geometry__Group__0 ) )
            {
            // InternalXacro.g:692:2: ( ( rule__Geometry__Group__0 ) )
            // InternalXacro.g:693:3: ( rule__Geometry__Group__0 )
            {
             before(grammarAccess.getGeometryAccess().getGroup()); 
            // InternalXacro.g:694:3: ( rule__Geometry__Group__0 )
            // InternalXacro.g:694:4: rule__Geometry__Group__0
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
    // InternalXacro.g:703:1: entryRuleBox : ruleBox EOF ;
    public final void entryRuleBox() throws RecognitionException {
        try {
            // InternalXacro.g:704:1: ( ruleBox EOF )
            // InternalXacro.g:705:1: ruleBox EOF
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
    // InternalXacro.g:712:1: ruleBox : ( ( rule__Box__Group__0 ) ) ;
    public final void ruleBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:716:2: ( ( ( rule__Box__Group__0 ) ) )
            // InternalXacro.g:717:2: ( ( rule__Box__Group__0 ) )
            {
            // InternalXacro.g:717:2: ( ( rule__Box__Group__0 ) )
            // InternalXacro.g:718:3: ( rule__Box__Group__0 )
            {
             before(grammarAccess.getBoxAccess().getGroup()); 
            // InternalXacro.g:719:3: ( rule__Box__Group__0 )
            // InternalXacro.g:719:4: rule__Box__Group__0
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
    // InternalXacro.g:728:1: entryRuleCylinder : ruleCylinder EOF ;
    public final void entryRuleCylinder() throws RecognitionException {
        try {
            // InternalXacro.g:729:1: ( ruleCylinder EOF )
            // InternalXacro.g:730:1: ruleCylinder EOF
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
    // InternalXacro.g:737:1: ruleCylinder : ( ( rule__Cylinder__Group__0 ) ) ;
    public final void ruleCylinder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:741:2: ( ( ( rule__Cylinder__Group__0 ) ) )
            // InternalXacro.g:742:2: ( ( rule__Cylinder__Group__0 ) )
            {
            // InternalXacro.g:742:2: ( ( rule__Cylinder__Group__0 ) )
            // InternalXacro.g:743:3: ( rule__Cylinder__Group__0 )
            {
             before(grammarAccess.getCylinderAccess().getGroup()); 
            // InternalXacro.g:744:3: ( rule__Cylinder__Group__0 )
            // InternalXacro.g:744:4: rule__Cylinder__Group__0
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
    // InternalXacro.g:753:1: entryRuleSphere : ruleSphere EOF ;
    public final void entryRuleSphere() throws RecognitionException {
        try {
            // InternalXacro.g:754:1: ( ruleSphere EOF )
            // InternalXacro.g:755:1: ruleSphere EOF
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
    // InternalXacro.g:762:1: ruleSphere : ( ( rule__Sphere__Group__0 ) ) ;
    public final void ruleSphere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:766:2: ( ( ( rule__Sphere__Group__0 ) ) )
            // InternalXacro.g:767:2: ( ( rule__Sphere__Group__0 ) )
            {
            // InternalXacro.g:767:2: ( ( rule__Sphere__Group__0 ) )
            // InternalXacro.g:768:3: ( rule__Sphere__Group__0 )
            {
             before(grammarAccess.getSphereAccess().getGroup()); 
            // InternalXacro.g:769:3: ( rule__Sphere__Group__0 )
            // InternalXacro.g:769:4: rule__Sphere__Group__0
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
    // InternalXacro.g:778:1: entryRuleMesh : ruleMesh EOF ;
    public final void entryRuleMesh() throws RecognitionException {
        try {
            // InternalXacro.g:779:1: ( ruleMesh EOF )
            // InternalXacro.g:780:1: ruleMesh EOF
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
    // InternalXacro.g:787:1: ruleMesh : ( ( rule__Mesh__Group__0 ) ) ;
    public final void ruleMesh() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:791:2: ( ( ( rule__Mesh__Group__0 ) ) )
            // InternalXacro.g:792:2: ( ( rule__Mesh__Group__0 ) )
            {
            // InternalXacro.g:792:2: ( ( rule__Mesh__Group__0 ) )
            // InternalXacro.g:793:3: ( rule__Mesh__Group__0 )
            {
             before(grammarAccess.getMeshAccess().getGroup()); 
            // InternalXacro.g:794:3: ( rule__Mesh__Group__0 )
            // InternalXacro.g:794:4: rule__Mesh__Group__0
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
    // InternalXacro.g:803:1: entryRuleDouble0 : ruleDouble0 EOF ;
    public final void entryRuleDouble0() throws RecognitionException {
        try {
            // InternalXacro.g:804:1: ( ruleDouble0 EOF )
            // InternalXacro.g:805:1: ruleDouble0 EOF
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
    // InternalXacro.g:812:1: ruleDouble0 : ( RULE_DOUBLE ) ;
    public final void ruleDouble0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:816:2: ( ( RULE_DOUBLE ) )
            // InternalXacro.g:817:2: ( RULE_DOUBLE )
            {
            // InternalXacro.g:817:2: ( RULE_DOUBLE )
            // InternalXacro.g:818:3: RULE_DOUBLE
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
    // InternalXacro.g:827:1: rule__ParameterValue__Alternatives : ( ( ( rule__ParameterValue__ValueAssignment_0 ) ) | ( rulePose ) | ( ruleLinkRef ) );
    public final void rule__ParameterValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:831:1: ( ( ( rule__ParameterValue__ValueAssignment_0 ) ) | ( rulePose ) | ( ruleLinkRef ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt1=1;
                }
                break;
            case 32:
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
                    // InternalXacro.g:832:2: ( ( rule__ParameterValue__ValueAssignment_0 ) )
                    {
                    // InternalXacro.g:832:2: ( ( rule__ParameterValue__ValueAssignment_0 ) )
                    // InternalXacro.g:833:3: ( rule__ParameterValue__ValueAssignment_0 )
                    {
                     before(grammarAccess.getParameterValueAccess().getValueAssignment_0()); 
                    // InternalXacro.g:834:3: ( rule__ParameterValue__ValueAssignment_0 )
                    // InternalXacro.g:834:4: rule__ParameterValue__ValueAssignment_0
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
                    // InternalXacro.g:838:2: ( rulePose )
                    {
                    // InternalXacro.g:838:2: ( rulePose )
                    // InternalXacro.g:839:3: rulePose
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
                    // InternalXacro.g:844:2: ( ruleLinkRef )
                    {
                    // InternalXacro.g:844:2: ( ruleLinkRef )
                    // InternalXacro.g:845:3: ruleLinkRef
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
    // InternalXacro.g:854:1: rule__ParameterPose__Alternatives : ( ( ( rule__ParameterPose__RefAssignment_0 ) ) | ( ( rule__ParameterPose__ValueAssignment_1 ) ) );
    public final void rule__ParameterPose__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:858:1: ( ( ( rule__ParameterPose__RefAssignment_0 ) ) | ( ( rule__ParameterPose__ValueAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==32) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalXacro.g:859:2: ( ( rule__ParameterPose__RefAssignment_0 ) )
                    {
                    // InternalXacro.g:859:2: ( ( rule__ParameterPose__RefAssignment_0 ) )
                    // InternalXacro.g:860:3: ( rule__ParameterPose__RefAssignment_0 )
                    {
                     before(grammarAccess.getParameterPoseAccess().getRefAssignment_0()); 
                    // InternalXacro.g:861:3: ( rule__ParameterPose__RefAssignment_0 )
                    // InternalXacro.g:861:4: rule__ParameterPose__RefAssignment_0
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
                    // InternalXacro.g:865:2: ( ( rule__ParameterPose__ValueAssignment_1 ) )
                    {
                    // InternalXacro.g:865:2: ( ( rule__ParameterPose__ValueAssignment_1 ) )
                    // InternalXacro.g:866:3: ( rule__ParameterPose__ValueAssignment_1 )
                    {
                     before(grammarAccess.getParameterPoseAccess().getValueAssignment_1()); 
                    // InternalXacro.g:867:3: ( rule__ParameterPose__ValueAssignment_1 )
                    // InternalXacro.g:867:4: rule__ParameterPose__ValueAssignment_1
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
    // InternalXacro.g:875:1: rule__ParameterLink__Alternatives : ( ( ( rule__ParameterLink__ParamAssignment_0 ) ) | ( ( rule__ParameterLink__LinkAssignment_1 ) ) );
    public final void rule__ParameterLink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:879:1: ( ( ( rule__ParameterLink__ParamAssignment_0 ) ) | ( ( rule__ParameterLink__LinkAssignment_1 ) ) )
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
                    // InternalXacro.g:880:2: ( ( rule__ParameterLink__ParamAssignment_0 ) )
                    {
                    // InternalXacro.g:880:2: ( ( rule__ParameterLink__ParamAssignment_0 ) )
                    // InternalXacro.g:881:3: ( rule__ParameterLink__ParamAssignment_0 )
                    {
                     before(grammarAccess.getParameterLinkAccess().getParamAssignment_0()); 
                    // InternalXacro.g:882:3: ( rule__ParameterLink__ParamAssignment_0 )
                    // InternalXacro.g:882:4: rule__ParameterLink__ParamAssignment_0
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
                    // InternalXacro.g:886:2: ( ( rule__ParameterLink__LinkAssignment_1 ) )
                    {
                    // InternalXacro.g:886:2: ( ( rule__ParameterLink__LinkAssignment_1 ) )
                    // InternalXacro.g:887:3: ( rule__ParameterLink__LinkAssignment_1 )
                    {
                     before(grammarAccess.getParameterLinkAccess().getLinkAssignment_1()); 
                    // InternalXacro.g:888:3: ( rule__ParameterLink__LinkAssignment_1 )
                    // InternalXacro.g:888:4: rule__ParameterLink__LinkAssignment_1
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
    // InternalXacro.g:896:1: rule__ParameterType__Alternatives : ( ( ruleParameterStringType ) | ( ruleParameterLinkRefType ) | ( ruleParameterPoseType ) );
    public final void rule__ParameterType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:900:1: ( ( ruleParameterStringType ) | ( ruleParameterLinkRefType ) | ( ruleParameterPoseType ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt4=1;
                }
                break;
            case 31:
                {
                alt4=2;
                }
                break;
            case 32:
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
                    // InternalXacro.g:901:2: ( ruleParameterStringType )
                    {
                    // InternalXacro.g:901:2: ( ruleParameterStringType )
                    // InternalXacro.g:902:3: ruleParameterStringType
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
                    // InternalXacro.g:907:2: ( ruleParameterLinkRefType )
                    {
                    // InternalXacro.g:907:2: ( ruleParameterLinkRefType )
                    // InternalXacro.g:908:3: ruleParameterLinkRefType
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
                    // InternalXacro.g:913:2: ( ruleParameterPoseType )
                    {
                    // InternalXacro.g:913:2: ( ruleParameterPoseType )
                    // InternalXacro.g:914:3: ruleParameterPoseType
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
    // InternalXacro.g:923:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:927:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalXacro.g:928:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
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
    // InternalXacro.g:935:1: rule__Robot__Group__0__Impl : ( () ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:939:1: ( ( () ) )
            // InternalXacro.g:940:1: ( () )
            {
            // InternalXacro.g:940:1: ( () )
            // InternalXacro.g:941:2: ()
            {
             before(grammarAccess.getRobotAccess().getRobotAction_0()); 
            // InternalXacro.g:942:2: ()
            // InternalXacro.g:942:3: 
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
    // InternalXacro.g:950:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:954:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalXacro.g:955:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
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
    // InternalXacro.g:962:1: rule__Robot__Group__1__Impl : ( 'Robot' ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:966:1: ( ( 'Robot' ) )
            // InternalXacro.g:967:1: ( 'Robot' )
            {
            // InternalXacro.g:967:1: ( 'Robot' )
            // InternalXacro.g:968:2: 'Robot'
            {
             before(grammarAccess.getRobotAccess().getRobotKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalXacro.g:977:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl rule__Robot__Group__3 ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:981:1: ( rule__Robot__Group__2__Impl rule__Robot__Group__3 )
            // InternalXacro.g:982:2: rule__Robot__Group__2__Impl rule__Robot__Group__3
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
    // InternalXacro.g:989:1: rule__Robot__Group__2__Impl : ( '{' ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:993:1: ( ( '{' ) )
            // InternalXacro.g:994:1: ( '{' )
            {
            // InternalXacro.g:994:1: ( '{' )
            // InternalXacro.g:995:2: '{'
            {
             before(grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalXacro.g:1004:1: rule__Robot__Group__3 : rule__Robot__Group__3__Impl rule__Robot__Group__4 ;
    public final void rule__Robot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1008:1: ( rule__Robot__Group__3__Impl rule__Robot__Group__4 )
            // InternalXacro.g:1009:2: rule__Robot__Group__3__Impl rule__Robot__Group__4
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
    // InternalXacro.g:1016:1: rule__Robot__Group__3__Impl : ( 'name' ) ;
    public final void rule__Robot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1020:1: ( ( 'name' ) )
            // InternalXacro.g:1021:1: ( 'name' )
            {
            // InternalXacro.g:1021:1: ( 'name' )
            // InternalXacro.g:1022:2: 'name'
            {
             before(grammarAccess.getRobotAccess().getNameKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalXacro.g:1031:1: rule__Robot__Group__4 : rule__Robot__Group__4__Impl rule__Robot__Group__5 ;
    public final void rule__Robot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1035:1: ( rule__Robot__Group__4__Impl rule__Robot__Group__5 )
            // InternalXacro.g:1036:2: rule__Robot__Group__4__Impl rule__Robot__Group__5
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
    // InternalXacro.g:1043:1: rule__Robot__Group__4__Impl : ( ( rule__Robot__NameAssignment_4 ) ) ;
    public final void rule__Robot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1047:1: ( ( ( rule__Robot__NameAssignment_4 ) ) )
            // InternalXacro.g:1048:1: ( ( rule__Robot__NameAssignment_4 ) )
            {
            // InternalXacro.g:1048:1: ( ( rule__Robot__NameAssignment_4 ) )
            // InternalXacro.g:1049:2: ( rule__Robot__NameAssignment_4 )
            {
             before(grammarAccess.getRobotAccess().getNameAssignment_4()); 
            // InternalXacro.g:1050:2: ( rule__Robot__NameAssignment_4 )
            // InternalXacro.g:1050:3: rule__Robot__NameAssignment_4
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
    // InternalXacro.g:1058:1: rule__Robot__Group__5 : rule__Robot__Group__5__Impl rule__Robot__Group__6 ;
    public final void rule__Robot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1062:1: ( rule__Robot__Group__5__Impl rule__Robot__Group__6 )
            // InternalXacro.g:1063:2: rule__Robot__Group__5__Impl rule__Robot__Group__6
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
    // InternalXacro.g:1070:1: rule__Robot__Group__5__Impl : ( ( rule__Robot__Group_5__0 )? ) ;
    public final void rule__Robot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1074:1: ( ( ( rule__Robot__Group_5__0 )? ) )
            // InternalXacro.g:1075:1: ( ( rule__Robot__Group_5__0 )? )
            {
            // InternalXacro.g:1075:1: ( ( rule__Robot__Group_5__0 )? )
            // InternalXacro.g:1076:2: ( rule__Robot__Group_5__0 )?
            {
             before(grammarAccess.getRobotAccess().getGroup_5()); 
            // InternalXacro.g:1077:2: ( rule__Robot__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalXacro.g:1077:3: rule__Robot__Group_5__0
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
    // InternalXacro.g:1085:1: rule__Robot__Group__6 : rule__Robot__Group__6__Impl rule__Robot__Group__7 ;
    public final void rule__Robot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1089:1: ( rule__Robot__Group__6__Impl rule__Robot__Group__7 )
            // InternalXacro.g:1090:2: rule__Robot__Group__6__Impl rule__Robot__Group__7
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
    // InternalXacro.g:1097:1: rule__Robot__Group__6__Impl : ( ( rule__Robot__Group_6__0 )? ) ;
    public final void rule__Robot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1101:1: ( ( ( rule__Robot__Group_6__0 )? ) )
            // InternalXacro.g:1102:1: ( ( rule__Robot__Group_6__0 )? )
            {
            // InternalXacro.g:1102:1: ( ( rule__Robot__Group_6__0 )? )
            // InternalXacro.g:1103:2: ( rule__Robot__Group_6__0 )?
            {
             before(grammarAccess.getRobotAccess().getGroup_6()); 
            // InternalXacro.g:1104:2: ( rule__Robot__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXacro.g:1104:3: rule__Robot__Group_6__0
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
    // InternalXacro.g:1112:1: rule__Robot__Group__7 : rule__Robot__Group__7__Impl rule__Robot__Group__8 ;
    public final void rule__Robot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1116:1: ( rule__Robot__Group__7__Impl rule__Robot__Group__8 )
            // InternalXacro.g:1117:2: rule__Robot__Group__7__Impl rule__Robot__Group__8
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
    // InternalXacro.g:1124:1: rule__Robot__Group__7__Impl : ( ( rule__Robot__Group_7__0 )? ) ;
    public final void rule__Robot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1128:1: ( ( ( rule__Robot__Group_7__0 )? ) )
            // InternalXacro.g:1129:1: ( ( rule__Robot__Group_7__0 )? )
            {
            // InternalXacro.g:1129:1: ( ( rule__Robot__Group_7__0 )? )
            // InternalXacro.g:1130:2: ( rule__Robot__Group_7__0 )?
            {
             before(grammarAccess.getRobotAccess().getGroup_7()); 
            // InternalXacro.g:1131:2: ( rule__Robot__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXacro.g:1131:3: rule__Robot__Group_7__0
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
    // InternalXacro.g:1139:1: rule__Robot__Group__8 : rule__Robot__Group__8__Impl rule__Robot__Group__9 ;
    public final void rule__Robot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1143:1: ( rule__Robot__Group__8__Impl rule__Robot__Group__9 )
            // InternalXacro.g:1144:2: rule__Robot__Group__8__Impl rule__Robot__Group__9
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
    // InternalXacro.g:1151:1: rule__Robot__Group__8__Impl : ( ( rule__Robot__Group_8__0 )? ) ;
    public final void rule__Robot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1155:1: ( ( ( rule__Robot__Group_8__0 )? ) )
            // InternalXacro.g:1156:1: ( ( rule__Robot__Group_8__0 )? )
            {
            // InternalXacro.g:1156:1: ( ( rule__Robot__Group_8__0 )? )
            // InternalXacro.g:1157:2: ( rule__Robot__Group_8__0 )?
            {
             before(grammarAccess.getRobotAccess().getGroup_8()); 
            // InternalXacro.g:1158:2: ( rule__Robot__Group_8__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXacro.g:1158:3: rule__Robot__Group_8__0
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
    // InternalXacro.g:1166:1: rule__Robot__Group__9 : rule__Robot__Group__9__Impl ;
    public final void rule__Robot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1170:1: ( rule__Robot__Group__9__Impl )
            // InternalXacro.g:1171:2: rule__Robot__Group__9__Impl
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
    // InternalXacro.g:1177:1: rule__Robot__Group__9__Impl : ( '}' ) ;
    public final void rule__Robot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1181:1: ( ( '}' ) )
            // InternalXacro.g:1182:1: ( '}' )
            {
            // InternalXacro.g:1182:1: ( '}' )
            // InternalXacro.g:1183:2: '}'
            {
             before(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_9()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
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
    // InternalXacro.g:1193:1: rule__Robot__Group_5__0 : rule__Robot__Group_5__0__Impl rule__Robot__Group_5__1 ;
    public final void rule__Robot__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1197:1: ( rule__Robot__Group_5__0__Impl rule__Robot__Group_5__1 )
            // InternalXacro.g:1198:2: rule__Robot__Group_5__0__Impl rule__Robot__Group_5__1
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
    // InternalXacro.g:1205:1: rule__Robot__Group_5__0__Impl : ( 'version' ) ;
    public final void rule__Robot__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1209:1: ( ( 'version' ) )
            // InternalXacro.g:1210:1: ( 'version' )
            {
            // InternalXacro.g:1210:1: ( 'version' )
            // InternalXacro.g:1211:2: 'version'
            {
             before(grammarAccess.getRobotAccess().getVersionKeyword_5_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalXacro.g:1220:1: rule__Robot__Group_5__1 : rule__Robot__Group_5__1__Impl ;
    public final void rule__Robot__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1224:1: ( rule__Robot__Group_5__1__Impl )
            // InternalXacro.g:1225:2: rule__Robot__Group_5__1__Impl
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
    // InternalXacro.g:1231:1: rule__Robot__Group_5__1__Impl : ( ( rule__Robot__VersionAssignment_5_1 ) ) ;
    public final void rule__Robot__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1235:1: ( ( ( rule__Robot__VersionAssignment_5_1 ) ) )
            // InternalXacro.g:1236:1: ( ( rule__Robot__VersionAssignment_5_1 ) )
            {
            // InternalXacro.g:1236:1: ( ( rule__Robot__VersionAssignment_5_1 ) )
            // InternalXacro.g:1237:2: ( rule__Robot__VersionAssignment_5_1 )
            {
             before(grammarAccess.getRobotAccess().getVersionAssignment_5_1()); 
            // InternalXacro.g:1238:2: ( rule__Robot__VersionAssignment_5_1 )
            // InternalXacro.g:1238:3: rule__Robot__VersionAssignment_5_1
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
    // InternalXacro.g:1247:1: rule__Robot__Group_6__0 : rule__Robot__Group_6__0__Impl rule__Robot__Group_6__1 ;
    public final void rule__Robot__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1251:1: ( rule__Robot__Group_6__0__Impl rule__Robot__Group_6__1 )
            // InternalXacro.g:1252:2: rule__Robot__Group_6__0__Impl rule__Robot__Group_6__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalXacro.g:1259:1: rule__Robot__Group_6__0__Impl : ( 'macro' ) ;
    public final void rule__Robot__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1263:1: ( ( 'macro' ) )
            // InternalXacro.g:1264:1: ( 'macro' )
            {
            // InternalXacro.g:1264:1: ( 'macro' )
            // InternalXacro.g:1265:2: 'macro'
            {
             before(grammarAccess.getRobotAccess().getMacroKeyword_6_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getMacroKeyword_6_0()); 

            }


            }

        }
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
    // InternalXacro.g:1274:1: rule__Robot__Group_6__1 : rule__Robot__Group_6__1__Impl rule__Robot__Group_6__2 ;
    public final void rule__Robot__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1278:1: ( rule__Robot__Group_6__1__Impl rule__Robot__Group_6__2 )
            // InternalXacro.g:1279:2: rule__Robot__Group_6__1__Impl rule__Robot__Group_6__2
            {
            pushFollow(FOLLOW_9);
            rule__Robot__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_6__2();

            state._fsp--;


            }

        }
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
    // InternalXacro.g:1286:1: rule__Robot__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Robot__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1290:1: ( ( '{' ) )
            // InternalXacro.g:1291:1: ( '{' )
            {
            // InternalXacro.g:1291:1: ( '{' )
            // InternalXacro.g:1292:2: '{'
            {
             before(grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Robot__Group_6__2"
    // InternalXacro.g:1301:1: rule__Robot__Group_6__2 : rule__Robot__Group_6__2__Impl rule__Robot__Group_6__3 ;
    public final void rule__Robot__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1305:1: ( rule__Robot__Group_6__2__Impl rule__Robot__Group_6__3 )
            // InternalXacro.g:1306:2: rule__Robot__Group_6__2__Impl rule__Robot__Group_6__3
            {
            pushFollow(FOLLOW_10);
            rule__Robot__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_6__2"


    // $ANTLR start "rule__Robot__Group_6__2__Impl"
    // InternalXacro.g:1313:1: rule__Robot__Group_6__2__Impl : ( ( rule__Robot__MacroAssignment_6_2 ) ) ;
    public final void rule__Robot__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1317:1: ( ( ( rule__Robot__MacroAssignment_6_2 ) ) )
            // InternalXacro.g:1318:1: ( ( rule__Robot__MacroAssignment_6_2 ) )
            {
            // InternalXacro.g:1318:1: ( ( rule__Robot__MacroAssignment_6_2 ) )
            // InternalXacro.g:1319:2: ( rule__Robot__MacroAssignment_6_2 )
            {
             before(grammarAccess.getRobotAccess().getMacroAssignment_6_2()); 
            // InternalXacro.g:1320:2: ( rule__Robot__MacroAssignment_6_2 )
            // InternalXacro.g:1320:3: rule__Robot__MacroAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Robot__MacroAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getMacroAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_6__2__Impl"


    // $ANTLR start "rule__Robot__Group_6__3"
    // InternalXacro.g:1328:1: rule__Robot__Group_6__3 : rule__Robot__Group_6__3__Impl rule__Robot__Group_6__4 ;
    public final void rule__Robot__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1332:1: ( rule__Robot__Group_6__3__Impl rule__Robot__Group_6__4 )
            // InternalXacro.g:1333:2: rule__Robot__Group_6__3__Impl rule__Robot__Group_6__4
            {
            pushFollow(FOLLOW_10);
            rule__Robot__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_6__3"


    // $ANTLR start "rule__Robot__Group_6__3__Impl"
    // InternalXacro.g:1340:1: rule__Robot__Group_6__3__Impl : ( ( rule__Robot__Group_6_3__0 )* ) ;
    public final void rule__Robot__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1344:1: ( ( ( rule__Robot__Group_6_3__0 )* ) )
            // InternalXacro.g:1345:1: ( ( rule__Robot__Group_6_3__0 )* )
            {
            // InternalXacro.g:1345:1: ( ( rule__Robot__Group_6_3__0 )* )
            // InternalXacro.g:1346:2: ( rule__Robot__Group_6_3__0 )*
            {
             before(grammarAccess.getRobotAccess().getGroup_6_3()); 
            // InternalXacro.g:1347:2: ( rule__Robot__Group_6_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalXacro.g:1347:3: rule__Robot__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Robot__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRobotAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_6__3__Impl"


    // $ANTLR start "rule__Robot__Group_6__4"
    // InternalXacro.g:1355:1: rule__Robot__Group_6__4 : rule__Robot__Group_6__4__Impl ;
    public final void rule__Robot__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1359:1: ( rule__Robot__Group_6__4__Impl )
            // InternalXacro.g:1360:2: rule__Robot__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_6__4"


    // $ANTLR start "rule__Robot__Group_6__4__Impl"
    // InternalXacro.g:1366:1: rule__Robot__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Robot__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1370:1: ( ( '}' ) )
            // InternalXacro.g:1371:1: ( '}' )
            {
            // InternalXacro.g:1371:1: ( '}' )
            // InternalXacro.g:1372:2: '}'
            {
             before(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_6__4__Impl"


    // $ANTLR start "rule__Robot__Group_6_3__0"
    // InternalXacro.g:1382:1: rule__Robot__Group_6_3__0 : rule__Robot__Group_6_3__0__Impl rule__Robot__Group_6_3__1 ;
    public final void rule__Robot__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1386:1: ( rule__Robot__Group_6_3__0__Impl rule__Robot__Group_6_3__1 )
            // InternalXacro.g:1387:2: rule__Robot__Group_6_3__0__Impl rule__Robot__Group_6_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Robot__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_6_3__0"


    // $ANTLR start "rule__Robot__Group_6_3__0__Impl"
    // InternalXacro.g:1394:1: rule__Robot__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Robot__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1398:1: ( ( ',' ) )
            // InternalXacro.g:1399:1: ( ',' )
            {
            // InternalXacro.g:1399:1: ( ',' )
            // InternalXacro.g:1400:2: ','
            {
             before(grammarAccess.getRobotAccess().getCommaKeyword_6_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_6_3__0__Impl"


    // $ANTLR start "rule__Robot__Group_6_3__1"
    // InternalXacro.g:1409:1: rule__Robot__Group_6_3__1 : rule__Robot__Group_6_3__1__Impl ;
    public final void rule__Robot__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1413:1: ( rule__Robot__Group_6_3__1__Impl )
            // InternalXacro.g:1414:2: rule__Robot__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_6_3__1"


    // $ANTLR start "rule__Robot__Group_6_3__1__Impl"
    // InternalXacro.g:1420:1: rule__Robot__Group_6_3__1__Impl : ( ( rule__Robot__MacroAssignment_6_3_1 ) ) ;
    public final void rule__Robot__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1424:1: ( ( ( rule__Robot__MacroAssignment_6_3_1 ) ) )
            // InternalXacro.g:1425:1: ( ( rule__Robot__MacroAssignment_6_3_1 ) )
            {
            // InternalXacro.g:1425:1: ( ( rule__Robot__MacroAssignment_6_3_1 ) )
            // InternalXacro.g:1426:2: ( rule__Robot__MacroAssignment_6_3_1 )
            {
             before(grammarAccess.getRobotAccess().getMacroAssignment_6_3_1()); 
            // InternalXacro.g:1427:2: ( rule__Robot__MacroAssignment_6_3_1 )
            // InternalXacro.g:1427:3: rule__Robot__MacroAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Robot__MacroAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getMacroAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_6_3__1__Impl"


    // $ANTLR start "rule__Robot__Group_7__0"
    // InternalXacro.g:1436:1: rule__Robot__Group_7__0 : rule__Robot__Group_7__0__Impl rule__Robot__Group_7__1 ;
    public final void rule__Robot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1440:1: ( rule__Robot__Group_7__0__Impl rule__Robot__Group_7__1 )
            // InternalXacro.g:1441:2: rule__Robot__Group_7__0__Impl rule__Robot__Group_7__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalXacro.g:1448:1: rule__Robot__Group_7__0__Impl : ( 'macroCall' ) ;
    public final void rule__Robot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1452:1: ( ( 'macroCall' ) )
            // InternalXacro.g:1453:1: ( 'macroCall' )
            {
            // InternalXacro.g:1453:1: ( 'macroCall' )
            // InternalXacro.g:1454:2: 'macroCall'
            {
             before(grammarAccess.getRobotAccess().getMacroCallKeyword_7_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getMacroCallKeyword_7_0()); 

            }


            }

        }
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
    // InternalXacro.g:1463:1: rule__Robot__Group_7__1 : rule__Robot__Group_7__1__Impl rule__Robot__Group_7__2 ;
    public final void rule__Robot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1467:1: ( rule__Robot__Group_7__1__Impl rule__Robot__Group_7__2 )
            // InternalXacro.g:1468:2: rule__Robot__Group_7__1__Impl rule__Robot__Group_7__2
            {
            pushFollow(FOLLOW_12);
            rule__Robot__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_7__2();

            state._fsp--;


            }

        }
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
    // InternalXacro.g:1475:1: rule__Robot__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Robot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1479:1: ( ( '{' ) )
            // InternalXacro.g:1480:1: ( '{' )
            {
            // InternalXacro.g:1480:1: ( '{' )
            // InternalXacro.g:1481:2: '{'
            {
             before(grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Robot__Group_7__2"
    // InternalXacro.g:1490:1: rule__Robot__Group_7__2 : rule__Robot__Group_7__2__Impl rule__Robot__Group_7__3 ;
    public final void rule__Robot__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1494:1: ( rule__Robot__Group_7__2__Impl rule__Robot__Group_7__3 )
            // InternalXacro.g:1495:2: rule__Robot__Group_7__2__Impl rule__Robot__Group_7__3
            {
            pushFollow(FOLLOW_10);
            rule__Robot__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_7__2"


    // $ANTLR start "rule__Robot__Group_7__2__Impl"
    // InternalXacro.g:1502:1: rule__Robot__Group_7__2__Impl : ( ( rule__Robot__MacroCallAssignment_7_2 ) ) ;
    public final void rule__Robot__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1506:1: ( ( ( rule__Robot__MacroCallAssignment_7_2 ) ) )
            // InternalXacro.g:1507:1: ( ( rule__Robot__MacroCallAssignment_7_2 ) )
            {
            // InternalXacro.g:1507:1: ( ( rule__Robot__MacroCallAssignment_7_2 ) )
            // InternalXacro.g:1508:2: ( rule__Robot__MacroCallAssignment_7_2 )
            {
             before(grammarAccess.getRobotAccess().getMacroCallAssignment_7_2()); 
            // InternalXacro.g:1509:2: ( rule__Robot__MacroCallAssignment_7_2 )
            // InternalXacro.g:1509:3: rule__Robot__MacroCallAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Robot__MacroCallAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getMacroCallAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_7__2__Impl"


    // $ANTLR start "rule__Robot__Group_7__3"
    // InternalXacro.g:1517:1: rule__Robot__Group_7__3 : rule__Robot__Group_7__3__Impl rule__Robot__Group_7__4 ;
    public final void rule__Robot__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1521:1: ( rule__Robot__Group_7__3__Impl rule__Robot__Group_7__4 )
            // InternalXacro.g:1522:2: rule__Robot__Group_7__3__Impl rule__Robot__Group_7__4
            {
            pushFollow(FOLLOW_10);
            rule__Robot__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_7__3"


    // $ANTLR start "rule__Robot__Group_7__3__Impl"
    // InternalXacro.g:1529:1: rule__Robot__Group_7__3__Impl : ( ( rule__Robot__Group_7_3__0 )* ) ;
    public final void rule__Robot__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1533:1: ( ( ( rule__Robot__Group_7_3__0 )* ) )
            // InternalXacro.g:1534:1: ( ( rule__Robot__Group_7_3__0 )* )
            {
            // InternalXacro.g:1534:1: ( ( rule__Robot__Group_7_3__0 )* )
            // InternalXacro.g:1535:2: ( rule__Robot__Group_7_3__0 )*
            {
             before(grammarAccess.getRobotAccess().getGroup_7_3()); 
            // InternalXacro.g:1536:2: ( rule__Robot__Group_7_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalXacro.g:1536:3: rule__Robot__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Robot__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRobotAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_7__3__Impl"


    // $ANTLR start "rule__Robot__Group_7__4"
    // InternalXacro.g:1544:1: rule__Robot__Group_7__4 : rule__Robot__Group_7__4__Impl ;
    public final void rule__Robot__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1548:1: ( rule__Robot__Group_7__4__Impl )
            // InternalXacro.g:1549:2: rule__Robot__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_7__4"


    // $ANTLR start "rule__Robot__Group_7__4__Impl"
    // InternalXacro.g:1555:1: rule__Robot__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Robot__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1559:1: ( ( '}' ) )
            // InternalXacro.g:1560:1: ( '}' )
            {
            // InternalXacro.g:1560:1: ( '}' )
            // InternalXacro.g:1561:2: '}'
            {
             before(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_7__4__Impl"


    // $ANTLR start "rule__Robot__Group_7_3__0"
    // InternalXacro.g:1571:1: rule__Robot__Group_7_3__0 : rule__Robot__Group_7_3__0__Impl rule__Robot__Group_7_3__1 ;
    public final void rule__Robot__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1575:1: ( rule__Robot__Group_7_3__0__Impl rule__Robot__Group_7_3__1 )
            // InternalXacro.g:1576:2: rule__Robot__Group_7_3__0__Impl rule__Robot__Group_7_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Robot__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_7_3__0"


    // $ANTLR start "rule__Robot__Group_7_3__0__Impl"
    // InternalXacro.g:1583:1: rule__Robot__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Robot__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1587:1: ( ( ',' ) )
            // InternalXacro.g:1588:1: ( ',' )
            {
            // InternalXacro.g:1588:1: ( ',' )
            // InternalXacro.g:1589:2: ','
            {
             before(grammarAccess.getRobotAccess().getCommaKeyword_7_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_7_3__0__Impl"


    // $ANTLR start "rule__Robot__Group_7_3__1"
    // InternalXacro.g:1598:1: rule__Robot__Group_7_3__1 : rule__Robot__Group_7_3__1__Impl ;
    public final void rule__Robot__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1602:1: ( rule__Robot__Group_7_3__1__Impl )
            // InternalXacro.g:1603:2: rule__Robot__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_7_3__1"


    // $ANTLR start "rule__Robot__Group_7_3__1__Impl"
    // InternalXacro.g:1609:1: rule__Robot__Group_7_3__1__Impl : ( ( rule__Robot__MacroCallAssignment_7_3_1 ) ) ;
    public final void rule__Robot__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1613:1: ( ( ( rule__Robot__MacroCallAssignment_7_3_1 ) ) )
            // InternalXacro.g:1614:1: ( ( rule__Robot__MacroCallAssignment_7_3_1 ) )
            {
            // InternalXacro.g:1614:1: ( ( rule__Robot__MacroCallAssignment_7_3_1 ) )
            // InternalXacro.g:1615:2: ( rule__Robot__MacroCallAssignment_7_3_1 )
            {
             before(grammarAccess.getRobotAccess().getMacroCallAssignment_7_3_1()); 
            // InternalXacro.g:1616:2: ( rule__Robot__MacroCallAssignment_7_3_1 )
            // InternalXacro.g:1616:3: rule__Robot__MacroCallAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Robot__MacroCallAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getMacroCallAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_7_3__1__Impl"


    // $ANTLR start "rule__Robot__Group_8__0"
    // InternalXacro.g:1625:1: rule__Robot__Group_8__0 : rule__Robot__Group_8__0__Impl rule__Robot__Group_8__1 ;
    public final void rule__Robot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1629:1: ( rule__Robot__Group_8__0__Impl rule__Robot__Group_8__1 )
            // InternalXacro.g:1630:2: rule__Robot__Group_8__0__Impl rule__Robot__Group_8__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalXacro.g:1637:1: rule__Robot__Group_8__0__Impl : ( 'body' ) ;
    public final void rule__Robot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1641:1: ( ( 'body' ) )
            // InternalXacro.g:1642:1: ( 'body' )
            {
            // InternalXacro.g:1642:1: ( 'body' )
            // InternalXacro.g:1643:2: 'body'
            {
             before(grammarAccess.getRobotAccess().getBodyKeyword_8_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalXacro.g:1652:1: rule__Robot__Group_8__1 : rule__Robot__Group_8__1__Impl ;
    public final void rule__Robot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1656:1: ( rule__Robot__Group_8__1__Impl )
            // InternalXacro.g:1657:2: rule__Robot__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group_8__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXacro.g:1663:1: rule__Robot__Group_8__1__Impl : ( ( rule__Robot__BodyAssignment_8_1 ) ) ;
    public final void rule__Robot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1667:1: ( ( ( rule__Robot__BodyAssignment_8_1 ) ) )
            // InternalXacro.g:1668:1: ( ( rule__Robot__BodyAssignment_8_1 ) )
            {
            // InternalXacro.g:1668:1: ( ( rule__Robot__BodyAssignment_8_1 ) )
            // InternalXacro.g:1669:2: ( rule__Robot__BodyAssignment_8_1 )
            {
             before(grammarAccess.getRobotAccess().getBodyAssignment_8_1()); 
            // InternalXacro.g:1670:2: ( rule__Robot__BodyAssignment_8_1 )
            // InternalXacro.g:1670:3: rule__Robot__BodyAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Robot__BodyAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getBodyAssignment_8_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Macro__Group__0"
    // InternalXacro.g:1679:1: rule__Macro__Group__0 : rule__Macro__Group__0__Impl rule__Macro__Group__1 ;
    public final void rule__Macro__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1683:1: ( rule__Macro__Group__0__Impl rule__Macro__Group__1 )
            // InternalXacro.g:1684:2: rule__Macro__Group__0__Impl rule__Macro__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalXacro.g:1691:1: rule__Macro__Group__0__Impl : ( 'Macro' ) ;
    public final void rule__Macro__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1695:1: ( ( 'Macro' ) )
            // InternalXacro.g:1696:1: ( 'Macro' )
            {
            // InternalXacro.g:1696:1: ( 'Macro' )
            // InternalXacro.g:1697:2: 'Macro'
            {
             before(grammarAccess.getMacroAccess().getMacroKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMacroAccess().getMacroKeyword_0()); 

            }


            }

        }
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
    // InternalXacro.g:1706:1: rule__Macro__Group__1 : rule__Macro__Group__1__Impl rule__Macro__Group__2 ;
    public final void rule__Macro__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1710:1: ( rule__Macro__Group__1__Impl rule__Macro__Group__2 )
            // InternalXacro.g:1711:2: rule__Macro__Group__1__Impl rule__Macro__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalXacro.g:1718:1: rule__Macro__Group__1__Impl : ( '{' ) ;
    public final void rule__Macro__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1722:1: ( ( '{' ) )
            // InternalXacro.g:1723:1: ( '{' )
            {
            // InternalXacro.g:1723:1: ( '{' )
            // InternalXacro.g:1724:2: '{'
            {
             before(grammarAccess.getMacroAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMacroAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalXacro.g:1733:1: rule__Macro__Group__2 : rule__Macro__Group__2__Impl rule__Macro__Group__3 ;
    public final void rule__Macro__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1737:1: ( rule__Macro__Group__2__Impl rule__Macro__Group__3 )
            // InternalXacro.g:1738:2: rule__Macro__Group__2__Impl rule__Macro__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalXacro.g:1745:1: rule__Macro__Group__2__Impl : ( 'name' ) ;
    public final void rule__Macro__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1749:1: ( ( 'name' ) )
            // InternalXacro.g:1750:1: ( 'name' )
            {
            // InternalXacro.g:1750:1: ( 'name' )
            // InternalXacro.g:1751:2: 'name'
            {
             before(grammarAccess.getMacroAccess().getNameKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMacroAccess().getNameKeyword_2()); 

            }


            }

        }
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
    // InternalXacro.g:1760:1: rule__Macro__Group__3 : rule__Macro__Group__3__Impl rule__Macro__Group__4 ;
    public final void rule__Macro__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1764:1: ( rule__Macro__Group__3__Impl rule__Macro__Group__4 )
            // InternalXacro.g:1765:2: rule__Macro__Group__3__Impl rule__Macro__Group__4
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
    // InternalXacro.g:1772:1: rule__Macro__Group__3__Impl : ( ( rule__Macro__NameAssignment_3 ) ) ;
    public final void rule__Macro__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1776:1: ( ( ( rule__Macro__NameAssignment_3 ) ) )
            // InternalXacro.g:1777:1: ( ( rule__Macro__NameAssignment_3 ) )
            {
            // InternalXacro.g:1777:1: ( ( rule__Macro__NameAssignment_3 ) )
            // InternalXacro.g:1778:2: ( rule__Macro__NameAssignment_3 )
            {
             before(grammarAccess.getMacroAccess().getNameAssignment_3()); 
            // InternalXacro.g:1779:2: ( rule__Macro__NameAssignment_3 )
            // InternalXacro.g:1779:3: rule__Macro__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Macro__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMacroAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalXacro.g:1787:1: rule__Macro__Group__4 : rule__Macro__Group__4__Impl rule__Macro__Group__5 ;
    public final void rule__Macro__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1791:1: ( rule__Macro__Group__4__Impl rule__Macro__Group__5 )
            // InternalXacro.g:1792:2: rule__Macro__Group__4__Impl rule__Macro__Group__5
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
    // InternalXacro.g:1799:1: rule__Macro__Group__4__Impl : ( ( rule__Macro__Group_4__0 )? ) ;
    public final void rule__Macro__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1803:1: ( ( ( rule__Macro__Group_4__0 )? ) )
            // InternalXacro.g:1804:1: ( ( rule__Macro__Group_4__0 )? )
            {
            // InternalXacro.g:1804:1: ( ( rule__Macro__Group_4__0 )? )
            // InternalXacro.g:1805:2: ( rule__Macro__Group_4__0 )?
            {
             before(grammarAccess.getMacroAccess().getGroup_4()); 
            // InternalXacro.g:1806:2: ( rule__Macro__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXacro.g:1806:3: rule__Macro__Group_4__0
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
    // InternalXacro.g:1814:1: rule__Macro__Group__5 : rule__Macro__Group__5__Impl rule__Macro__Group__6 ;
    public final void rule__Macro__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1818:1: ( rule__Macro__Group__5__Impl rule__Macro__Group__6 )
            // InternalXacro.g:1819:2: rule__Macro__Group__5__Impl rule__Macro__Group__6
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
    // InternalXacro.g:1826:1: rule__Macro__Group__5__Impl : ( ( rule__Macro__Group_5__0 )? ) ;
    public final void rule__Macro__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1830:1: ( ( ( rule__Macro__Group_5__0 )? ) )
            // InternalXacro.g:1831:1: ( ( rule__Macro__Group_5__0 )? )
            {
            // InternalXacro.g:1831:1: ( ( rule__Macro__Group_5__0 )? )
            // InternalXacro.g:1832:2: ( rule__Macro__Group_5__0 )?
            {
             before(grammarAccess.getMacroAccess().getGroup_5()); 
            // InternalXacro.g:1833:2: ( rule__Macro__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalXacro.g:1833:3: rule__Macro__Group_5__0
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
    // InternalXacro.g:1841:1: rule__Macro__Group__6 : rule__Macro__Group__6__Impl ;
    public final void rule__Macro__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1845:1: ( rule__Macro__Group__6__Impl )
            // InternalXacro.g:1846:2: rule__Macro__Group__6__Impl
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
    // InternalXacro.g:1852:1: rule__Macro__Group__6__Impl : ( '}' ) ;
    public final void rule__Macro__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1856:1: ( ( '}' ) )
            // InternalXacro.g:1857:1: ( '}' )
            {
            // InternalXacro.g:1857:1: ( '}' )
            // InternalXacro.g:1858:2: '}'
            {
             before(grammarAccess.getMacroAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMacroAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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
    // InternalXacro.g:1868:1: rule__Macro__Group_4__0 : rule__Macro__Group_4__0__Impl rule__Macro__Group_4__1 ;
    public final void rule__Macro__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1872:1: ( rule__Macro__Group_4__0__Impl rule__Macro__Group_4__1 )
            // InternalXacro.g:1873:2: rule__Macro__Group_4__0__Impl rule__Macro__Group_4__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalXacro.g:1880:1: rule__Macro__Group_4__0__Impl : ( 'parameter' ) ;
    public final void rule__Macro__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1884:1: ( ( 'parameter' ) )
            // InternalXacro.g:1885:1: ( 'parameter' )
            {
            // InternalXacro.g:1885:1: ( 'parameter' )
            // InternalXacro.g:1886:2: 'parameter'
            {
             before(grammarAccess.getMacroAccess().getParameterKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMacroAccess().getParameterKeyword_4_0()); 

            }


            }

        }
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
    // InternalXacro.g:1895:1: rule__Macro__Group_4__1 : rule__Macro__Group_4__1__Impl rule__Macro__Group_4__2 ;
    public final void rule__Macro__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1899:1: ( rule__Macro__Group_4__1__Impl rule__Macro__Group_4__2 )
            // InternalXacro.g:1900:2: rule__Macro__Group_4__1__Impl rule__Macro__Group_4__2
            {
            pushFollow(FOLLOW_15);
            rule__Macro__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Macro__Group_4__2();

            state._fsp--;


            }

        }
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
    // InternalXacro.g:1907:1: rule__Macro__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Macro__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1911:1: ( ( '{' ) )
            // InternalXacro.g:1912:1: ( '{' )
            {
            // InternalXacro.g:1912:1: ( '{' )
            // InternalXacro.g:1913:2: '{'
            {
             before(grammarAccess.getMacroAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMacroAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Macro__Group_4__2"
    // InternalXacro.g:1922:1: rule__Macro__Group_4__2 : rule__Macro__Group_4__2__Impl rule__Macro__Group_4__3 ;
    public final void rule__Macro__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1926:1: ( rule__Macro__Group_4__2__Impl rule__Macro__Group_4__3 )
            // InternalXacro.g:1927:2: rule__Macro__Group_4__2__Impl rule__Macro__Group_4__3
            {
            pushFollow(FOLLOW_10);
            rule__Macro__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Macro__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group_4__2"


    // $ANTLR start "rule__Macro__Group_4__2__Impl"
    // InternalXacro.g:1934:1: rule__Macro__Group_4__2__Impl : ( ( rule__Macro__ParameterAssignment_4_2 ) ) ;
    public final void rule__Macro__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1938:1: ( ( ( rule__Macro__ParameterAssignment_4_2 ) ) )
            // InternalXacro.g:1939:1: ( ( rule__Macro__ParameterAssignment_4_2 ) )
            {
            // InternalXacro.g:1939:1: ( ( rule__Macro__ParameterAssignment_4_2 ) )
            // InternalXacro.g:1940:2: ( rule__Macro__ParameterAssignment_4_2 )
            {
             before(grammarAccess.getMacroAccess().getParameterAssignment_4_2()); 
            // InternalXacro.g:1941:2: ( rule__Macro__ParameterAssignment_4_2 )
            // InternalXacro.g:1941:3: rule__Macro__ParameterAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Macro__ParameterAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getMacroAccess().getParameterAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group_4__2__Impl"


    // $ANTLR start "rule__Macro__Group_4__3"
    // InternalXacro.g:1949:1: rule__Macro__Group_4__3 : rule__Macro__Group_4__3__Impl rule__Macro__Group_4__4 ;
    public final void rule__Macro__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1953:1: ( rule__Macro__Group_4__3__Impl rule__Macro__Group_4__4 )
            // InternalXacro.g:1954:2: rule__Macro__Group_4__3__Impl rule__Macro__Group_4__4
            {
            pushFollow(FOLLOW_10);
            rule__Macro__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Macro__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group_4__3"


    // $ANTLR start "rule__Macro__Group_4__3__Impl"
    // InternalXacro.g:1961:1: rule__Macro__Group_4__3__Impl : ( ( rule__Macro__Group_4_3__0 )* ) ;
    public final void rule__Macro__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1965:1: ( ( ( rule__Macro__Group_4_3__0 )* ) )
            // InternalXacro.g:1966:1: ( ( rule__Macro__Group_4_3__0 )* )
            {
            // InternalXacro.g:1966:1: ( ( rule__Macro__Group_4_3__0 )* )
            // InternalXacro.g:1967:2: ( rule__Macro__Group_4_3__0 )*
            {
             before(grammarAccess.getMacroAccess().getGroup_4_3()); 
            // InternalXacro.g:1968:2: ( rule__Macro__Group_4_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalXacro.g:1968:3: rule__Macro__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Macro__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMacroAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group_4__3__Impl"


    // $ANTLR start "rule__Macro__Group_4__4"
    // InternalXacro.g:1976:1: rule__Macro__Group_4__4 : rule__Macro__Group_4__4__Impl ;
    public final void rule__Macro__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1980:1: ( rule__Macro__Group_4__4__Impl )
            // InternalXacro.g:1981:2: rule__Macro__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Macro__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group_4__4"


    // $ANTLR start "rule__Macro__Group_4__4__Impl"
    // InternalXacro.g:1987:1: rule__Macro__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Macro__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:1991:1: ( ( '}' ) )
            // InternalXacro.g:1992:1: ( '}' )
            {
            // InternalXacro.g:1992:1: ( '}' )
            // InternalXacro.g:1993:2: '}'
            {
             before(grammarAccess.getMacroAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMacroAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group_4__4__Impl"


    // $ANTLR start "rule__Macro__Group_4_3__0"
    // InternalXacro.g:2003:1: rule__Macro__Group_4_3__0 : rule__Macro__Group_4_3__0__Impl rule__Macro__Group_4_3__1 ;
    public final void rule__Macro__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2007:1: ( rule__Macro__Group_4_3__0__Impl rule__Macro__Group_4_3__1 )
            // InternalXacro.g:2008:2: rule__Macro__Group_4_3__0__Impl rule__Macro__Group_4_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Macro__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Macro__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group_4_3__0"


    // $ANTLR start "rule__Macro__Group_4_3__0__Impl"
    // InternalXacro.g:2015:1: rule__Macro__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Macro__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2019:1: ( ( ',' ) )
            // InternalXacro.g:2020:1: ( ',' )
            {
            // InternalXacro.g:2020:1: ( ',' )
            // InternalXacro.g:2021:2: ','
            {
             before(grammarAccess.getMacroAccess().getCommaKeyword_4_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMacroAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group_4_3__0__Impl"


    // $ANTLR start "rule__Macro__Group_4_3__1"
    // InternalXacro.g:2030:1: rule__Macro__Group_4_3__1 : rule__Macro__Group_4_3__1__Impl ;
    public final void rule__Macro__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2034:1: ( rule__Macro__Group_4_3__1__Impl )
            // InternalXacro.g:2035:2: rule__Macro__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Macro__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group_4_3__1"


    // $ANTLR start "rule__Macro__Group_4_3__1__Impl"
    // InternalXacro.g:2041:1: rule__Macro__Group_4_3__1__Impl : ( ( rule__Macro__ParameterAssignment_4_3_1 ) ) ;
    public final void rule__Macro__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2045:1: ( ( ( rule__Macro__ParameterAssignment_4_3_1 ) ) )
            // InternalXacro.g:2046:1: ( ( rule__Macro__ParameterAssignment_4_3_1 ) )
            {
            // InternalXacro.g:2046:1: ( ( rule__Macro__ParameterAssignment_4_3_1 ) )
            // InternalXacro.g:2047:2: ( rule__Macro__ParameterAssignment_4_3_1 )
            {
             before(grammarAccess.getMacroAccess().getParameterAssignment_4_3_1()); 
            // InternalXacro.g:2048:2: ( rule__Macro__ParameterAssignment_4_3_1 )
            // InternalXacro.g:2048:3: rule__Macro__ParameterAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Macro__ParameterAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMacroAccess().getParameterAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__Group_4_3__1__Impl"


    // $ANTLR start "rule__Macro__Group_5__0"
    // InternalXacro.g:2057:1: rule__Macro__Group_5__0 : rule__Macro__Group_5__0__Impl rule__Macro__Group_5__1 ;
    public final void rule__Macro__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2061:1: ( rule__Macro__Group_5__0__Impl rule__Macro__Group_5__1 )
            // InternalXacro.g:2062:2: rule__Macro__Group_5__0__Impl rule__Macro__Group_5__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalXacro.g:2069:1: rule__Macro__Group_5__0__Impl : ( 'body' ) ;
    public final void rule__Macro__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2073:1: ( ( 'body' ) )
            // InternalXacro.g:2074:1: ( 'body' )
            {
            // InternalXacro.g:2074:1: ( 'body' )
            // InternalXacro.g:2075:2: 'body'
            {
             before(grammarAccess.getMacroAccess().getBodyKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalXacro.g:2084:1: rule__Macro__Group_5__1 : rule__Macro__Group_5__1__Impl ;
    public final void rule__Macro__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2088:1: ( rule__Macro__Group_5__1__Impl )
            // InternalXacro.g:2089:2: rule__Macro__Group_5__1__Impl
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
    // InternalXacro.g:2095:1: rule__Macro__Group_5__1__Impl : ( ( rule__Macro__BodyAssignment_5_1 ) ) ;
    public final void rule__Macro__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2099:1: ( ( ( rule__Macro__BodyAssignment_5_1 ) ) )
            // InternalXacro.g:2100:1: ( ( rule__Macro__BodyAssignment_5_1 ) )
            {
            // InternalXacro.g:2100:1: ( ( rule__Macro__BodyAssignment_5_1 ) )
            // InternalXacro.g:2101:2: ( rule__Macro__BodyAssignment_5_1 )
            {
             before(grammarAccess.getMacroAccess().getBodyAssignment_5_1()); 
            // InternalXacro.g:2102:2: ( rule__Macro__BodyAssignment_5_1 )
            // InternalXacro.g:2102:3: rule__Macro__BodyAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Macro__BodyAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMacroAccess().getBodyAssignment_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalXacro.g:2111:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2115:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalXacro.g:2116:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalXacro.g:2123:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2127:1: ( ( () ) )
            // InternalXacro.g:2128:1: ( () )
            {
            // InternalXacro.g:2128:1: ( () )
            // InternalXacro.g:2129:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalXacro.g:2130:2: ()
            // InternalXacro.g:2130:3: 
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
    // InternalXacro.g:2138:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2142:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalXacro.g:2143:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalXacro.g:2150:1: rule__Parameter__Group__1__Impl : ( 'Parameter' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2154:1: ( ( 'Parameter' ) )
            // InternalXacro.g:2155:1: ( 'Parameter' )
            {
            // InternalXacro.g:2155:1: ( 'Parameter' )
            // InternalXacro.g:2156:2: 'Parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_1()); 

            }


            }

        }
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
    // InternalXacro.g:2165:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2169:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalXacro.g:2170:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalXacro.g:2177:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__NameAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2181:1: ( ( ( rule__Parameter__NameAssignment_2 ) ) )
            // InternalXacro.g:2182:1: ( ( rule__Parameter__NameAssignment_2 ) )
            {
            // InternalXacro.g:2182:1: ( ( rule__Parameter__NameAssignment_2 ) )
            // InternalXacro.g:2183:2: ( rule__Parameter__NameAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_2()); 
            // InternalXacro.g:2184:2: ( rule__Parameter__NameAssignment_2 )
            // InternalXacro.g:2184:3: rule__Parameter__NameAssignment_2
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
    // InternalXacro.g:2192:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2196:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalXacro.g:2197:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalXacro.g:2204:1: rule__Parameter__Group__3__Impl : ( '{' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2208:1: ( ( '{' ) )
            // InternalXacro.g:2209:1: ( '{' )
            {
            // InternalXacro.g:2209:1: ( '{' )
            // InternalXacro.g:2210:2: '{'
            {
             before(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalXacro.g:2219:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2223:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // InternalXacro.g:2224:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalXacro.g:2231:1: rule__Parameter__Group__4__Impl : ( 'type' ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2235:1: ( ( 'type' ) )
            // InternalXacro.g:2236:1: ( 'type' )
            {
            // InternalXacro.g:2236:1: ( 'type' )
            // InternalXacro.g:2237:2: 'type'
            {
             before(grammarAccess.getParameterAccess().getTypeKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getTypeKeyword_4()); 

            }


            }

        }
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
    // InternalXacro.g:2246:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl rule__Parameter__Group__6 ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2250:1: ( rule__Parameter__Group__5__Impl rule__Parameter__Group__6 )
            // InternalXacro.g:2251:2: rule__Parameter__Group__5__Impl rule__Parameter__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalXacro.g:2258:1: rule__Parameter__Group__5__Impl : ( ( rule__Parameter__TypeAssignment_5 ) ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2262:1: ( ( ( rule__Parameter__TypeAssignment_5 ) ) )
            // InternalXacro.g:2263:1: ( ( rule__Parameter__TypeAssignment_5 ) )
            {
            // InternalXacro.g:2263:1: ( ( rule__Parameter__TypeAssignment_5 ) )
            // InternalXacro.g:2264:2: ( rule__Parameter__TypeAssignment_5 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_5()); 
            // InternalXacro.g:2265:2: ( rule__Parameter__TypeAssignment_5 )
            // InternalXacro.g:2265:3: rule__Parameter__TypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_5()); 

            }


            }

        }
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
    // InternalXacro.g:2273:1: rule__Parameter__Group__6 : rule__Parameter__Group__6__Impl rule__Parameter__Group__7 ;
    public final void rule__Parameter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2277:1: ( rule__Parameter__Group__6__Impl rule__Parameter__Group__7 )
            // InternalXacro.g:2278:2: rule__Parameter__Group__6__Impl rule__Parameter__Group__7
            {
            pushFollow(FOLLOW_18);
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
    // InternalXacro.g:2285:1: rule__Parameter__Group__6__Impl : ( ( rule__Parameter__Group_6__0 )? ) ;
    public final void rule__Parameter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2289:1: ( ( ( rule__Parameter__Group_6__0 )? ) )
            // InternalXacro.g:2290:1: ( ( rule__Parameter__Group_6__0 )? )
            {
            // InternalXacro.g:2290:1: ( ( rule__Parameter__Group_6__0 )? )
            // InternalXacro.g:2291:2: ( rule__Parameter__Group_6__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_6()); 
            // InternalXacro.g:2292:2: ( rule__Parameter__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXacro.g:2292:3: rule__Parameter__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalXacro.g:2300:1: rule__Parameter__Group__7 : rule__Parameter__Group__7__Impl ;
    public final void rule__Parameter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2304:1: ( rule__Parameter__Group__7__Impl )
            // InternalXacro.g:2305:2: rule__Parameter__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalXacro.g:2311:1: rule__Parameter__Group__7__Impl : ( '}' ) ;
    public final void rule__Parameter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2315:1: ( ( '}' ) )
            // InternalXacro.g:2316:1: ( '}' )
            {
            // InternalXacro.g:2316:1: ( '}' )
            // InternalXacro.g:2317:2: '}'
            {
             before(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Parameter__Group_6__0"
    // InternalXacro.g:2327:1: rule__Parameter__Group_6__0 : rule__Parameter__Group_6__0__Impl rule__Parameter__Group_6__1 ;
    public final void rule__Parameter__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2331:1: ( rule__Parameter__Group_6__0__Impl rule__Parameter__Group_6__1 )
            // InternalXacro.g:2332:2: rule__Parameter__Group_6__0__Impl rule__Parameter__Group_6__1
            {
            pushFollow(FOLLOW_19);
            rule__Parameter__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_6__0"


    // $ANTLR start "rule__Parameter__Group_6__0__Impl"
    // InternalXacro.g:2339:1: rule__Parameter__Group_6__0__Impl : ( 'value' ) ;
    public final void rule__Parameter__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2343:1: ( ( 'value' ) )
            // InternalXacro.g:2344:1: ( 'value' )
            {
            // InternalXacro.g:2344:1: ( 'value' )
            // InternalXacro.g:2345:2: 'value'
            {
             before(grammarAccess.getParameterAccess().getValueKeyword_6_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getValueKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_6__0__Impl"


    // $ANTLR start "rule__Parameter__Group_6__1"
    // InternalXacro.g:2354:1: rule__Parameter__Group_6__1 : rule__Parameter__Group_6__1__Impl ;
    public final void rule__Parameter__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2358:1: ( rule__Parameter__Group_6__1__Impl )
            // InternalXacro.g:2359:2: rule__Parameter__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_6__1"


    // $ANTLR start "rule__Parameter__Group_6__1__Impl"
    // InternalXacro.g:2365:1: rule__Parameter__Group_6__1__Impl : ( ( rule__Parameter__ValueAssignment_6_1 ) ) ;
    public final void rule__Parameter__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2369:1: ( ( ( rule__Parameter__ValueAssignment_6_1 ) ) )
            // InternalXacro.g:2370:1: ( ( rule__Parameter__ValueAssignment_6_1 ) )
            {
            // InternalXacro.g:2370:1: ( ( rule__Parameter__ValueAssignment_6_1 ) )
            // InternalXacro.g:2371:2: ( rule__Parameter__ValueAssignment_6_1 )
            {
             before(grammarAccess.getParameterAccess().getValueAssignment_6_1()); 
            // InternalXacro.g:2372:2: ( rule__Parameter__ValueAssignment_6_1 )
            // InternalXacro.g:2372:3: rule__Parameter__ValueAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ValueAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getValueAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_6__1__Impl"


    // $ANTLR start "rule__ParameterString__Group__0"
    // InternalXacro.g:2381:1: rule__ParameterString__Group__0 : rule__ParameterString__Group__0__Impl rule__ParameterString__Group__1 ;
    public final void rule__ParameterString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2385:1: ( rule__ParameterString__Group__0__Impl rule__ParameterString__Group__1 )
            // InternalXacro.g:2386:2: rule__ParameterString__Group__0__Impl rule__ParameterString__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalXacro.g:2393:1: rule__ParameterString__Group__0__Impl : ( () ) ;
    public final void rule__ParameterString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2397:1: ( ( () ) )
            // InternalXacro.g:2398:1: ( () )
            {
            // InternalXacro.g:2398:1: ( () )
            // InternalXacro.g:2399:2: ()
            {
             before(grammarAccess.getParameterStringAccess().getParameterStringAction_0()); 
            // InternalXacro.g:2400:2: ()
            // InternalXacro.g:2400:3: 
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
    // InternalXacro.g:2408:1: rule__ParameterString__Group__1 : rule__ParameterString__Group__1__Impl rule__ParameterString__Group__2 ;
    public final void rule__ParameterString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2412:1: ( rule__ParameterString__Group__1__Impl rule__ParameterString__Group__2 )
            // InternalXacro.g:2413:2: rule__ParameterString__Group__1__Impl rule__ParameterString__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalXacro.g:2420:1: rule__ParameterString__Group__1__Impl : ( ( rule__ParameterString__RefAssignment_1 )? ) ;
    public final void rule__ParameterString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2424:1: ( ( ( rule__ParameterString__RefAssignment_1 )? ) )
            // InternalXacro.g:2425:1: ( ( rule__ParameterString__RefAssignment_1 )? )
            {
            // InternalXacro.g:2425:1: ( ( rule__ParameterString__RefAssignment_1 )? )
            // InternalXacro.g:2426:2: ( rule__ParameterString__RefAssignment_1 )?
            {
             before(grammarAccess.getParameterStringAccess().getRefAssignment_1()); 
            // InternalXacro.g:2427:2: ( rule__ParameterString__RefAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXacro.g:2427:3: rule__ParameterString__RefAssignment_1
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
    // InternalXacro.g:2435:1: rule__ParameterString__Group__2 : rule__ParameterString__Group__2__Impl ;
    public final void rule__ParameterString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2439:1: ( rule__ParameterString__Group__2__Impl )
            // InternalXacro.g:2440:2: rule__ParameterString__Group__2__Impl
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
    // InternalXacro.g:2446:1: rule__ParameterString__Group__2__Impl : ( ( rule__ParameterString__ValueAssignment_2 )? ) ;
    public final void rule__ParameterString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2450:1: ( ( ( rule__ParameterString__ValueAssignment_2 )? ) )
            // InternalXacro.g:2451:1: ( ( rule__ParameterString__ValueAssignment_2 )? )
            {
            // InternalXacro.g:2451:1: ( ( rule__ParameterString__ValueAssignment_2 )? )
            // InternalXacro.g:2452:2: ( rule__ParameterString__ValueAssignment_2 )?
            {
             before(grammarAccess.getParameterStringAccess().getValueAssignment_2()); 
            // InternalXacro.g:2453:2: ( rule__ParameterString__ValueAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXacro.g:2453:3: rule__ParameterString__ValueAssignment_2
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
    // InternalXacro.g:2462:1: rule__ParameterStringType__Group__0 : rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1 ;
    public final void rule__ParameterStringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2466:1: ( rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1 )
            // InternalXacro.g:2467:2: rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalXacro.g:2474:1: rule__ParameterStringType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterStringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2478:1: ( ( () ) )
            // InternalXacro.g:2479:1: ( () )
            {
            // InternalXacro.g:2479:1: ( () )
            // InternalXacro.g:2480:2: ()
            {
             before(grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0()); 
            // InternalXacro.g:2481:2: ()
            // InternalXacro.g:2481:3: 
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
    // InternalXacro.g:2489:1: rule__ParameterStringType__Group__1 : rule__ParameterStringType__Group__1__Impl ;
    public final void rule__ParameterStringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2493:1: ( rule__ParameterStringType__Group__1__Impl )
            // InternalXacro.g:2494:2: rule__ParameterStringType__Group__1__Impl
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
    // InternalXacro.g:2500:1: rule__ParameterStringType__Group__1__Impl : ( 'String' ) ;
    public final void rule__ParameterStringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2504:1: ( ( 'String' ) )
            // InternalXacro.g:2505:1: ( 'String' )
            {
            // InternalXacro.g:2505:1: ( 'String' )
            // InternalXacro.g:2506:2: 'String'
            {
             before(grammarAccess.getParameterStringTypeAccess().getStringKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalXacro.g:2516:1: rule__ParameterLinkRefType__Group__0 : rule__ParameterLinkRefType__Group__0__Impl rule__ParameterLinkRefType__Group__1 ;
    public final void rule__ParameterLinkRefType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2520:1: ( rule__ParameterLinkRefType__Group__0__Impl rule__ParameterLinkRefType__Group__1 )
            // InternalXacro.g:2521:2: rule__ParameterLinkRefType__Group__0__Impl rule__ParameterLinkRefType__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalXacro.g:2528:1: rule__ParameterLinkRefType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterLinkRefType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2532:1: ( ( () ) )
            // InternalXacro.g:2533:1: ( () )
            {
            // InternalXacro.g:2533:1: ( () )
            // InternalXacro.g:2534:2: ()
            {
             before(grammarAccess.getParameterLinkRefTypeAccess().getParameterLinkRefTypeAction_0()); 
            // InternalXacro.g:2535:2: ()
            // InternalXacro.g:2535:3: 
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
    // InternalXacro.g:2543:1: rule__ParameterLinkRefType__Group__1 : rule__ParameterLinkRefType__Group__1__Impl ;
    public final void rule__ParameterLinkRefType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2547:1: ( rule__ParameterLinkRefType__Group__1__Impl )
            // InternalXacro.g:2548:2: rule__ParameterLinkRefType__Group__1__Impl
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
    // InternalXacro.g:2554:1: rule__ParameterLinkRefType__Group__1__Impl : ( 'LinkRef' ) ;
    public final void rule__ParameterLinkRefType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2558:1: ( ( 'LinkRef' ) )
            // InternalXacro.g:2559:1: ( 'LinkRef' )
            {
            // InternalXacro.g:2559:1: ( 'LinkRef' )
            // InternalXacro.g:2560:2: 'LinkRef'
            {
             before(grammarAccess.getParameterLinkRefTypeAccess().getLinkRefKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalXacro.g:2570:1: rule__ParameterPoseType__Group__0 : rule__ParameterPoseType__Group__0__Impl rule__ParameterPoseType__Group__1 ;
    public final void rule__ParameterPoseType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2574:1: ( rule__ParameterPoseType__Group__0__Impl rule__ParameterPoseType__Group__1 )
            // InternalXacro.g:2575:2: rule__ParameterPoseType__Group__0__Impl rule__ParameterPoseType__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalXacro.g:2582:1: rule__ParameterPoseType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterPoseType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2586:1: ( ( () ) )
            // InternalXacro.g:2587:1: ( () )
            {
            // InternalXacro.g:2587:1: ( () )
            // InternalXacro.g:2588:2: ()
            {
             before(grammarAccess.getParameterPoseTypeAccess().getParameterPoseTypeAction_0()); 
            // InternalXacro.g:2589:2: ()
            // InternalXacro.g:2589:3: 
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
    // InternalXacro.g:2597:1: rule__ParameterPoseType__Group__1 : rule__ParameterPoseType__Group__1__Impl ;
    public final void rule__ParameterPoseType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2601:1: ( rule__ParameterPoseType__Group__1__Impl )
            // InternalXacro.g:2602:2: rule__ParameterPoseType__Group__1__Impl
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
    // InternalXacro.g:2608:1: rule__ParameterPoseType__Group__1__Impl : ( 'Pose' ) ;
    public final void rule__ParameterPoseType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2612:1: ( ( 'Pose' ) )
            // InternalXacro.g:2613:1: ( 'Pose' )
            {
            // InternalXacro.g:2613:1: ( 'Pose' )
            // InternalXacro.g:2614:2: 'Pose'
            {
             before(grammarAccess.getParameterPoseTypeAccess().getPoseKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalXacro.g:2624:1: rule__Body__Group__0 : rule__Body__Group__0__Impl rule__Body__Group__1 ;
    public final void rule__Body__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2628:1: ( rule__Body__Group__0__Impl rule__Body__Group__1 )
            // InternalXacro.g:2629:2: rule__Body__Group__0__Impl rule__Body__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalXacro.g:2636:1: rule__Body__Group__0__Impl : ( () ) ;
    public final void rule__Body__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2640:1: ( ( () ) )
            // InternalXacro.g:2641:1: ( () )
            {
            // InternalXacro.g:2641:1: ( () )
            // InternalXacro.g:2642:2: ()
            {
             before(grammarAccess.getBodyAccess().getBodyAction_0()); 
            // InternalXacro.g:2643:2: ()
            // InternalXacro.g:2643:3: 
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
    // InternalXacro.g:2651:1: rule__Body__Group__1 : rule__Body__Group__1__Impl rule__Body__Group__2 ;
    public final void rule__Body__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2655:1: ( rule__Body__Group__1__Impl rule__Body__Group__2 )
            // InternalXacro.g:2656:2: rule__Body__Group__1__Impl rule__Body__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalXacro.g:2663:1: rule__Body__Group__1__Impl : ( 'Body' ) ;
    public final void rule__Body__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2667:1: ( ( 'Body' ) )
            // InternalXacro.g:2668:1: ( 'Body' )
            {
            // InternalXacro.g:2668:1: ( 'Body' )
            // InternalXacro.g:2669:2: 'Body'
            {
             before(grammarAccess.getBodyAccess().getBodyKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBodyAccess().getBodyKeyword_1()); 

            }


            }

        }
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
    // InternalXacro.g:2678:1: rule__Body__Group__2 : rule__Body__Group__2__Impl rule__Body__Group__3 ;
    public final void rule__Body__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2682:1: ( rule__Body__Group__2__Impl rule__Body__Group__3 )
            // InternalXacro.g:2683:2: rule__Body__Group__2__Impl rule__Body__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Body__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group__3();

            state._fsp--;


            }

        }
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
    // InternalXacro.g:2690:1: rule__Body__Group__2__Impl : ( '{' ) ;
    public final void rule__Body__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2694:1: ( ( '{' ) )
            // InternalXacro.g:2695:1: ( '{' )
            {
            // InternalXacro.g:2695:1: ( '{' )
            // InternalXacro.g:2696:2: '{'
            {
             before(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Body__Group__3"
    // InternalXacro.g:2705:1: rule__Body__Group__3 : rule__Body__Group__3__Impl rule__Body__Group__4 ;
    public final void rule__Body__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2709:1: ( rule__Body__Group__3__Impl rule__Body__Group__4 )
            // InternalXacro.g:2710:2: rule__Body__Group__3__Impl rule__Body__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Body__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__3"


    // $ANTLR start "rule__Body__Group__3__Impl"
    // InternalXacro.g:2717:1: rule__Body__Group__3__Impl : ( ( rule__Body__Group_3__0 )? ) ;
    public final void rule__Body__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2721:1: ( ( ( rule__Body__Group_3__0 )? ) )
            // InternalXacro.g:2722:1: ( ( rule__Body__Group_3__0 )? )
            {
            // InternalXacro.g:2722:1: ( ( rule__Body__Group_3__0 )? )
            // InternalXacro.g:2723:2: ( rule__Body__Group_3__0 )?
            {
             before(grammarAccess.getBodyAccess().getGroup_3()); 
            // InternalXacro.g:2724:2: ( rule__Body__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXacro.g:2724:3: rule__Body__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Body__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBodyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__3__Impl"


    // $ANTLR start "rule__Body__Group__4"
    // InternalXacro.g:2732:1: rule__Body__Group__4 : rule__Body__Group__4__Impl rule__Body__Group__5 ;
    public final void rule__Body__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2736:1: ( rule__Body__Group__4__Impl rule__Body__Group__5 )
            // InternalXacro.g:2737:2: rule__Body__Group__4__Impl rule__Body__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Body__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__4"


    // $ANTLR start "rule__Body__Group__4__Impl"
    // InternalXacro.g:2744:1: rule__Body__Group__4__Impl : ( ( rule__Body__Group_4__0 )? ) ;
    public final void rule__Body__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2748:1: ( ( ( rule__Body__Group_4__0 )? ) )
            // InternalXacro.g:2749:1: ( ( rule__Body__Group_4__0 )? )
            {
            // InternalXacro.g:2749:1: ( ( rule__Body__Group_4__0 )? )
            // InternalXacro.g:2750:2: ( rule__Body__Group_4__0 )?
            {
             before(grammarAccess.getBodyAccess().getGroup_4()); 
            // InternalXacro.g:2751:2: ( rule__Body__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalXacro.g:2751:3: rule__Body__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Body__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBodyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__4__Impl"


    // $ANTLR start "rule__Body__Group__5"
    // InternalXacro.g:2759:1: rule__Body__Group__5 : rule__Body__Group__5__Impl ;
    public final void rule__Body__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2763:1: ( rule__Body__Group__5__Impl )
            // InternalXacro.g:2764:2: rule__Body__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Body__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__5"


    // $ANTLR start "rule__Body__Group__5__Impl"
    // InternalXacro.g:2770:1: rule__Body__Group__5__Impl : ( '}' ) ;
    public final void rule__Body__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2774:1: ( ( '}' ) )
            // InternalXacro.g:2775:1: ( '}' )
            {
            // InternalXacro.g:2775:1: ( '}' )
            // InternalXacro.g:2776:2: '}'
            {
             before(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__5__Impl"


    // $ANTLR start "rule__Body__Group_3__0"
    // InternalXacro.g:2786:1: rule__Body__Group_3__0 : rule__Body__Group_3__0__Impl rule__Body__Group_3__1 ;
    public final void rule__Body__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2790:1: ( rule__Body__Group_3__0__Impl rule__Body__Group_3__1 )
            // InternalXacro.g:2791:2: rule__Body__Group_3__0__Impl rule__Body__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Body__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_3__0"


    // $ANTLR start "rule__Body__Group_3__0__Impl"
    // InternalXacro.g:2798:1: rule__Body__Group_3__0__Impl : ( 'link' ) ;
    public final void rule__Body__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2802:1: ( ( 'link' ) )
            // InternalXacro.g:2803:1: ( 'link' )
            {
            // InternalXacro.g:2803:1: ( 'link' )
            // InternalXacro.g:2804:2: 'link'
            {
             before(grammarAccess.getBodyAccess().getLinkKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBodyAccess().getLinkKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_3__0__Impl"


    // $ANTLR start "rule__Body__Group_3__1"
    // InternalXacro.g:2813:1: rule__Body__Group_3__1 : rule__Body__Group_3__1__Impl rule__Body__Group_3__2 ;
    public final void rule__Body__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2817:1: ( rule__Body__Group_3__1__Impl rule__Body__Group_3__2 )
            // InternalXacro.g:2818:2: rule__Body__Group_3__1__Impl rule__Body__Group_3__2
            {
            pushFollow(FOLLOW_24);
            rule__Body__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_3__1"


    // $ANTLR start "rule__Body__Group_3__1__Impl"
    // InternalXacro.g:2825:1: rule__Body__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Body__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2829:1: ( ( '{' ) )
            // InternalXacro.g:2830:1: ( '{' )
            {
            // InternalXacro.g:2830:1: ( '{' )
            // InternalXacro.g:2831:2: '{'
            {
             before(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_3__1__Impl"


    // $ANTLR start "rule__Body__Group_3__2"
    // InternalXacro.g:2840:1: rule__Body__Group_3__2 : rule__Body__Group_3__2__Impl rule__Body__Group_3__3 ;
    public final void rule__Body__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2844:1: ( rule__Body__Group_3__2__Impl rule__Body__Group_3__3 )
            // InternalXacro.g:2845:2: rule__Body__Group_3__2__Impl rule__Body__Group_3__3
            {
            pushFollow(FOLLOW_10);
            rule__Body__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_3__2"


    // $ANTLR start "rule__Body__Group_3__2__Impl"
    // InternalXacro.g:2852:1: rule__Body__Group_3__2__Impl : ( ( rule__Body__LinkAssignment_3_2 ) ) ;
    public final void rule__Body__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2856:1: ( ( ( rule__Body__LinkAssignment_3_2 ) ) )
            // InternalXacro.g:2857:1: ( ( rule__Body__LinkAssignment_3_2 ) )
            {
            // InternalXacro.g:2857:1: ( ( rule__Body__LinkAssignment_3_2 ) )
            // InternalXacro.g:2858:2: ( rule__Body__LinkAssignment_3_2 )
            {
             before(grammarAccess.getBodyAccess().getLinkAssignment_3_2()); 
            // InternalXacro.g:2859:2: ( rule__Body__LinkAssignment_3_2 )
            // InternalXacro.g:2859:3: rule__Body__LinkAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Body__LinkAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getLinkAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_3__2__Impl"


    // $ANTLR start "rule__Body__Group_3__3"
    // InternalXacro.g:2867:1: rule__Body__Group_3__3 : rule__Body__Group_3__3__Impl rule__Body__Group_3__4 ;
    public final void rule__Body__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2871:1: ( rule__Body__Group_3__3__Impl rule__Body__Group_3__4 )
            // InternalXacro.g:2872:2: rule__Body__Group_3__3__Impl rule__Body__Group_3__4
            {
            pushFollow(FOLLOW_10);
            rule__Body__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_3__3"


    // $ANTLR start "rule__Body__Group_3__3__Impl"
    // InternalXacro.g:2879:1: rule__Body__Group_3__3__Impl : ( ( rule__Body__Group_3_3__0 )* ) ;
    public final void rule__Body__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2883:1: ( ( ( rule__Body__Group_3_3__0 )* ) )
            // InternalXacro.g:2884:1: ( ( rule__Body__Group_3_3__0 )* )
            {
            // InternalXacro.g:2884:1: ( ( rule__Body__Group_3_3__0 )* )
            // InternalXacro.g:2885:2: ( rule__Body__Group_3_3__0 )*
            {
             before(grammarAccess.getBodyAccess().getGroup_3_3()); 
            // InternalXacro.g:2886:2: ( rule__Body__Group_3_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==22) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalXacro.g:2886:3: rule__Body__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Body__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getBodyAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_3__3__Impl"


    // $ANTLR start "rule__Body__Group_3__4"
    // InternalXacro.g:2894:1: rule__Body__Group_3__4 : rule__Body__Group_3__4__Impl ;
    public final void rule__Body__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2898:1: ( rule__Body__Group_3__4__Impl )
            // InternalXacro.g:2899:2: rule__Body__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Body__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_3__4"


    // $ANTLR start "rule__Body__Group_3__4__Impl"
    // InternalXacro.g:2905:1: rule__Body__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Body__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2909:1: ( ( '}' ) )
            // InternalXacro.g:2910:1: ( '}' )
            {
            // InternalXacro.g:2910:1: ( '}' )
            // InternalXacro.g:2911:2: '}'
            {
             before(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_3__4__Impl"


    // $ANTLR start "rule__Body__Group_3_3__0"
    // InternalXacro.g:2921:1: rule__Body__Group_3_3__0 : rule__Body__Group_3_3__0__Impl rule__Body__Group_3_3__1 ;
    public final void rule__Body__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2925:1: ( rule__Body__Group_3_3__0__Impl rule__Body__Group_3_3__1 )
            // InternalXacro.g:2926:2: rule__Body__Group_3_3__0__Impl rule__Body__Group_3_3__1
            {
            pushFollow(FOLLOW_24);
            rule__Body__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_3_3__0"


    // $ANTLR start "rule__Body__Group_3_3__0__Impl"
    // InternalXacro.g:2933:1: rule__Body__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Body__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2937:1: ( ( ',' ) )
            // InternalXacro.g:2938:1: ( ',' )
            {
            // InternalXacro.g:2938:1: ( ',' )
            // InternalXacro.g:2939:2: ','
            {
             before(grammarAccess.getBodyAccess().getCommaKeyword_3_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBodyAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_3_3__0__Impl"


    // $ANTLR start "rule__Body__Group_3_3__1"
    // InternalXacro.g:2948:1: rule__Body__Group_3_3__1 : rule__Body__Group_3_3__1__Impl ;
    public final void rule__Body__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2952:1: ( rule__Body__Group_3_3__1__Impl )
            // InternalXacro.g:2953:2: rule__Body__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Body__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_3_3__1"


    // $ANTLR start "rule__Body__Group_3_3__1__Impl"
    // InternalXacro.g:2959:1: rule__Body__Group_3_3__1__Impl : ( ( rule__Body__LinkAssignment_3_3_1 ) ) ;
    public final void rule__Body__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2963:1: ( ( ( rule__Body__LinkAssignment_3_3_1 ) ) )
            // InternalXacro.g:2964:1: ( ( rule__Body__LinkAssignment_3_3_1 ) )
            {
            // InternalXacro.g:2964:1: ( ( rule__Body__LinkAssignment_3_3_1 ) )
            // InternalXacro.g:2965:2: ( rule__Body__LinkAssignment_3_3_1 )
            {
             before(grammarAccess.getBodyAccess().getLinkAssignment_3_3_1()); 
            // InternalXacro.g:2966:2: ( rule__Body__LinkAssignment_3_3_1 )
            // InternalXacro.g:2966:3: rule__Body__LinkAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Body__LinkAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getLinkAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_3_3__1__Impl"


    // $ANTLR start "rule__Body__Group_4__0"
    // InternalXacro.g:2975:1: rule__Body__Group_4__0 : rule__Body__Group_4__0__Impl rule__Body__Group_4__1 ;
    public final void rule__Body__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2979:1: ( rule__Body__Group_4__0__Impl rule__Body__Group_4__1 )
            // InternalXacro.g:2980:2: rule__Body__Group_4__0__Impl rule__Body__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Body__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_4__0"


    // $ANTLR start "rule__Body__Group_4__0__Impl"
    // InternalXacro.g:2987:1: rule__Body__Group_4__0__Impl : ( 'joint' ) ;
    public final void rule__Body__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:2991:1: ( ( 'joint' ) )
            // InternalXacro.g:2992:1: ( 'joint' )
            {
            // InternalXacro.g:2992:1: ( 'joint' )
            // InternalXacro.g:2993:2: 'joint'
            {
             before(grammarAccess.getBodyAccess().getJointKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBodyAccess().getJointKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_4__0__Impl"


    // $ANTLR start "rule__Body__Group_4__1"
    // InternalXacro.g:3002:1: rule__Body__Group_4__1 : rule__Body__Group_4__1__Impl rule__Body__Group_4__2 ;
    public final void rule__Body__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3006:1: ( rule__Body__Group_4__1__Impl rule__Body__Group_4__2 )
            // InternalXacro.g:3007:2: rule__Body__Group_4__1__Impl rule__Body__Group_4__2
            {
            pushFollow(FOLLOW_25);
            rule__Body__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_4__1"


    // $ANTLR start "rule__Body__Group_4__1__Impl"
    // InternalXacro.g:3014:1: rule__Body__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Body__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3018:1: ( ( '{' ) )
            // InternalXacro.g:3019:1: ( '{' )
            {
            // InternalXacro.g:3019:1: ( '{' )
            // InternalXacro.g:3020:2: '{'
            {
             before(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_4__1__Impl"


    // $ANTLR start "rule__Body__Group_4__2"
    // InternalXacro.g:3029:1: rule__Body__Group_4__2 : rule__Body__Group_4__2__Impl rule__Body__Group_4__3 ;
    public final void rule__Body__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3033:1: ( rule__Body__Group_4__2__Impl rule__Body__Group_4__3 )
            // InternalXacro.g:3034:2: rule__Body__Group_4__2__Impl rule__Body__Group_4__3
            {
            pushFollow(FOLLOW_10);
            rule__Body__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_4__2"


    // $ANTLR start "rule__Body__Group_4__2__Impl"
    // InternalXacro.g:3041:1: rule__Body__Group_4__2__Impl : ( ( rule__Body__JointAssignment_4_2 ) ) ;
    public final void rule__Body__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3045:1: ( ( ( rule__Body__JointAssignment_4_2 ) ) )
            // InternalXacro.g:3046:1: ( ( rule__Body__JointAssignment_4_2 ) )
            {
            // InternalXacro.g:3046:1: ( ( rule__Body__JointAssignment_4_2 ) )
            // InternalXacro.g:3047:2: ( rule__Body__JointAssignment_4_2 )
            {
             before(grammarAccess.getBodyAccess().getJointAssignment_4_2()); 
            // InternalXacro.g:3048:2: ( rule__Body__JointAssignment_4_2 )
            // InternalXacro.g:3048:3: rule__Body__JointAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Body__JointAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getJointAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_4__2__Impl"


    // $ANTLR start "rule__Body__Group_4__3"
    // InternalXacro.g:3056:1: rule__Body__Group_4__3 : rule__Body__Group_4__3__Impl rule__Body__Group_4__4 ;
    public final void rule__Body__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3060:1: ( rule__Body__Group_4__3__Impl rule__Body__Group_4__4 )
            // InternalXacro.g:3061:2: rule__Body__Group_4__3__Impl rule__Body__Group_4__4
            {
            pushFollow(FOLLOW_10);
            rule__Body__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_4__3"


    // $ANTLR start "rule__Body__Group_4__3__Impl"
    // InternalXacro.g:3068:1: rule__Body__Group_4__3__Impl : ( ( rule__Body__Group_4_3__0 )* ) ;
    public final void rule__Body__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3072:1: ( ( ( rule__Body__Group_4_3__0 )* ) )
            // InternalXacro.g:3073:1: ( ( rule__Body__Group_4_3__0 )* )
            {
            // InternalXacro.g:3073:1: ( ( rule__Body__Group_4_3__0 )* )
            // InternalXacro.g:3074:2: ( rule__Body__Group_4_3__0 )*
            {
             before(grammarAccess.getBodyAccess().getGroup_4_3()); 
            // InternalXacro.g:3075:2: ( rule__Body__Group_4_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==22) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalXacro.g:3075:3: rule__Body__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Body__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getBodyAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_4__3__Impl"


    // $ANTLR start "rule__Body__Group_4__4"
    // InternalXacro.g:3083:1: rule__Body__Group_4__4 : rule__Body__Group_4__4__Impl ;
    public final void rule__Body__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3087:1: ( rule__Body__Group_4__4__Impl )
            // InternalXacro.g:3088:2: rule__Body__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Body__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_4__4"


    // $ANTLR start "rule__Body__Group_4__4__Impl"
    // InternalXacro.g:3094:1: rule__Body__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Body__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3098:1: ( ( '}' ) )
            // InternalXacro.g:3099:1: ( '}' )
            {
            // InternalXacro.g:3099:1: ( '}' )
            // InternalXacro.g:3100:2: '}'
            {
             before(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_4__4__Impl"


    // $ANTLR start "rule__Body__Group_4_3__0"
    // InternalXacro.g:3110:1: rule__Body__Group_4_3__0 : rule__Body__Group_4_3__0__Impl rule__Body__Group_4_3__1 ;
    public final void rule__Body__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3114:1: ( rule__Body__Group_4_3__0__Impl rule__Body__Group_4_3__1 )
            // InternalXacro.g:3115:2: rule__Body__Group_4_3__0__Impl rule__Body__Group_4_3__1
            {
            pushFollow(FOLLOW_25);
            rule__Body__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_4_3__0"


    // $ANTLR start "rule__Body__Group_4_3__0__Impl"
    // InternalXacro.g:3122:1: rule__Body__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Body__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3126:1: ( ( ',' ) )
            // InternalXacro.g:3127:1: ( ',' )
            {
            // InternalXacro.g:3127:1: ( ',' )
            // InternalXacro.g:3128:2: ','
            {
             before(grammarAccess.getBodyAccess().getCommaKeyword_4_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBodyAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_4_3__0__Impl"


    // $ANTLR start "rule__Body__Group_4_3__1"
    // InternalXacro.g:3137:1: rule__Body__Group_4_3__1 : rule__Body__Group_4_3__1__Impl ;
    public final void rule__Body__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3141:1: ( rule__Body__Group_4_3__1__Impl )
            // InternalXacro.g:3142:2: rule__Body__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Body__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_4_3__1"


    // $ANTLR start "rule__Body__Group_4_3__1__Impl"
    // InternalXacro.g:3148:1: rule__Body__Group_4_3__1__Impl : ( ( rule__Body__JointAssignment_4_3_1 ) ) ;
    public final void rule__Body__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3152:1: ( ( ( rule__Body__JointAssignment_4_3_1 ) ) )
            // InternalXacro.g:3153:1: ( ( rule__Body__JointAssignment_4_3_1 ) )
            {
            // InternalXacro.g:3153:1: ( ( rule__Body__JointAssignment_4_3_1 ) )
            // InternalXacro.g:3154:2: ( rule__Body__JointAssignment_4_3_1 )
            {
             before(grammarAccess.getBodyAccess().getJointAssignment_4_3_1()); 
            // InternalXacro.g:3155:2: ( rule__Body__JointAssignment_4_3_1 )
            // InternalXacro.g:3155:3: rule__Body__JointAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Body__JointAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getJointAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_4_3__1__Impl"


    // $ANTLR start "rule__MacroCall__Group__0"
    // InternalXacro.g:3164:1: rule__MacroCall__Group__0 : rule__MacroCall__Group__0__Impl rule__MacroCall__Group__1 ;
    public final void rule__MacroCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3168:1: ( rule__MacroCall__Group__0__Impl rule__MacroCall__Group__1 )
            // InternalXacro.g:3169:2: rule__MacroCall__Group__0__Impl rule__MacroCall__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalXacro.g:3176:1: rule__MacroCall__Group__0__Impl : ( () ) ;
    public final void rule__MacroCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3180:1: ( ( () ) )
            // InternalXacro.g:3181:1: ( () )
            {
            // InternalXacro.g:3181:1: ( () )
            // InternalXacro.g:3182:2: ()
            {
             before(grammarAccess.getMacroCallAccess().getMacroCallAction_0()); 
            // InternalXacro.g:3183:2: ()
            // InternalXacro.g:3183:3: 
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
    // InternalXacro.g:3191:1: rule__MacroCall__Group__1 : rule__MacroCall__Group__1__Impl rule__MacroCall__Group__2 ;
    public final void rule__MacroCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3195:1: ( rule__MacroCall__Group__1__Impl rule__MacroCall__Group__2 )
            // InternalXacro.g:3196:2: rule__MacroCall__Group__1__Impl rule__MacroCall__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalXacro.g:3203:1: rule__MacroCall__Group__1__Impl : ( 'MacroCall' ) ;
    public final void rule__MacroCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3207:1: ( ( 'MacroCall' ) )
            // InternalXacro.g:3208:1: ( 'MacroCall' )
            {
            // InternalXacro.g:3208:1: ( 'MacroCall' )
            // InternalXacro.g:3209:2: 'MacroCall'
            {
             before(grammarAccess.getMacroCallAccess().getMacroCallKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMacroCallAccess().getMacroCallKeyword_1()); 

            }


            }

        }
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
    // InternalXacro.g:3218:1: rule__MacroCall__Group__2 : rule__MacroCall__Group__2__Impl rule__MacroCall__Group__3 ;
    public final void rule__MacroCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3222:1: ( rule__MacroCall__Group__2__Impl rule__MacroCall__Group__3 )
            // InternalXacro.g:3223:2: rule__MacroCall__Group__2__Impl rule__MacroCall__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalXacro.g:3230:1: rule__MacroCall__Group__2__Impl : ( '{' ) ;
    public final void rule__MacroCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3234:1: ( ( '{' ) )
            // InternalXacro.g:3235:1: ( '{' )
            {
            // InternalXacro.g:3235:1: ( '{' )
            // InternalXacro.g:3236:2: '{'
            {
             before(grammarAccess.getMacroCallAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMacroCallAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalXacro.g:3245:1: rule__MacroCall__Group__3 : rule__MacroCall__Group__3__Impl rule__MacroCall__Group__4 ;
    public final void rule__MacroCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3249:1: ( rule__MacroCall__Group__3__Impl rule__MacroCall__Group__4 )
            // InternalXacro.g:3250:2: rule__MacroCall__Group__3__Impl rule__MacroCall__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalXacro.g:3257:1: rule__MacroCall__Group__3__Impl : ( 'macro' ) ;
    public final void rule__MacroCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3261:1: ( ( 'macro' ) )
            // InternalXacro.g:3262:1: ( 'macro' )
            {
            // InternalXacro.g:3262:1: ( 'macro' )
            // InternalXacro.g:3263:2: 'macro'
            {
             before(grammarAccess.getMacroCallAccess().getMacroKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMacroCallAccess().getMacroKeyword_3()); 

            }


            }

        }
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
    // InternalXacro.g:3272:1: rule__MacroCall__Group__4 : rule__MacroCall__Group__4__Impl rule__MacroCall__Group__5 ;
    public final void rule__MacroCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3276:1: ( rule__MacroCall__Group__4__Impl rule__MacroCall__Group__5 )
            // InternalXacro.g:3277:2: rule__MacroCall__Group__4__Impl rule__MacroCall__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalXacro.g:3284:1: rule__MacroCall__Group__4__Impl : ( ( rule__MacroCall__MacroAssignment_4 ) ) ;
    public final void rule__MacroCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3288:1: ( ( ( rule__MacroCall__MacroAssignment_4 ) ) )
            // InternalXacro.g:3289:1: ( ( rule__MacroCall__MacroAssignment_4 ) )
            {
            // InternalXacro.g:3289:1: ( ( rule__MacroCall__MacroAssignment_4 ) )
            // InternalXacro.g:3290:2: ( rule__MacroCall__MacroAssignment_4 )
            {
             before(grammarAccess.getMacroCallAccess().getMacroAssignment_4()); 
            // InternalXacro.g:3291:2: ( rule__MacroCall__MacroAssignment_4 )
            // InternalXacro.g:3291:3: rule__MacroCall__MacroAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MacroCall__MacroAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMacroCallAccess().getMacroAssignment_4()); 

            }


            }

        }
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
    // InternalXacro.g:3299:1: rule__MacroCall__Group__5 : rule__MacroCall__Group__5__Impl rule__MacroCall__Group__6 ;
    public final void rule__MacroCall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3303:1: ( rule__MacroCall__Group__5__Impl rule__MacroCall__Group__6 )
            // InternalXacro.g:3304:2: rule__MacroCall__Group__5__Impl rule__MacroCall__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalXacro.g:3311:1: rule__MacroCall__Group__5__Impl : ( ( rule__MacroCall__Group_5__0 )? ) ;
    public final void rule__MacroCall__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3315:1: ( ( ( rule__MacroCall__Group_5__0 )? ) )
            // InternalXacro.g:3316:1: ( ( rule__MacroCall__Group_5__0 )? )
            {
            // InternalXacro.g:3316:1: ( ( rule__MacroCall__Group_5__0 )? )
            // InternalXacro.g:3317:2: ( rule__MacroCall__Group_5__0 )?
            {
             before(grammarAccess.getMacroCallAccess().getGroup_5()); 
            // InternalXacro.g:3318:2: ( rule__MacroCall__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXacro.g:3318:3: rule__MacroCall__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MacroCall__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMacroCallAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalXacro.g:3326:1: rule__MacroCall__Group__6 : rule__MacroCall__Group__6__Impl ;
    public final void rule__MacroCall__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3330:1: ( rule__MacroCall__Group__6__Impl )
            // InternalXacro.g:3331:2: rule__MacroCall__Group__6__Impl
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
    // InternalXacro.g:3337:1: rule__MacroCall__Group__6__Impl : ( '}' ) ;
    public final void rule__MacroCall__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3341:1: ( ( '}' ) )
            // InternalXacro.g:3342:1: ( '}' )
            {
            // InternalXacro.g:3342:1: ( '}' )
            // InternalXacro.g:3343:2: '}'
            {
             before(grammarAccess.getMacroCallAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMacroCallAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__MacroCall__Group_5__0"
    // InternalXacro.g:3353:1: rule__MacroCall__Group_5__0 : rule__MacroCall__Group_5__0__Impl rule__MacroCall__Group_5__1 ;
    public final void rule__MacroCall__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3357:1: ( rule__MacroCall__Group_5__0__Impl rule__MacroCall__Group_5__1 )
            // InternalXacro.g:3358:2: rule__MacroCall__Group_5__0__Impl rule__MacroCall__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__MacroCall__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MacroCall__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group_5__0"


    // $ANTLR start "rule__MacroCall__Group_5__0__Impl"
    // InternalXacro.g:3365:1: rule__MacroCall__Group_5__0__Impl : ( 'parameter' ) ;
    public final void rule__MacroCall__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3369:1: ( ( 'parameter' ) )
            // InternalXacro.g:3370:1: ( 'parameter' )
            {
            // InternalXacro.g:3370:1: ( 'parameter' )
            // InternalXacro.g:3371:2: 'parameter'
            {
             before(grammarAccess.getMacroCallAccess().getParameterKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMacroCallAccess().getParameterKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group_5__0__Impl"


    // $ANTLR start "rule__MacroCall__Group_5__1"
    // InternalXacro.g:3380:1: rule__MacroCall__Group_5__1 : rule__MacroCall__Group_5__1__Impl rule__MacroCall__Group_5__2 ;
    public final void rule__MacroCall__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3384:1: ( rule__MacroCall__Group_5__1__Impl rule__MacroCall__Group_5__2 )
            // InternalXacro.g:3385:2: rule__MacroCall__Group_5__1__Impl rule__MacroCall__Group_5__2
            {
            pushFollow(FOLLOW_28);
            rule__MacroCall__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MacroCall__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group_5__1"


    // $ANTLR start "rule__MacroCall__Group_5__1__Impl"
    // InternalXacro.g:3392:1: rule__MacroCall__Group_5__1__Impl : ( '{' ) ;
    public final void rule__MacroCall__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3396:1: ( ( '{' ) )
            // InternalXacro.g:3397:1: ( '{' )
            {
            // InternalXacro.g:3397:1: ( '{' )
            // InternalXacro.g:3398:2: '{'
            {
             before(grammarAccess.getMacroCallAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMacroCallAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group_5__1__Impl"


    // $ANTLR start "rule__MacroCall__Group_5__2"
    // InternalXacro.g:3407:1: rule__MacroCall__Group_5__2 : rule__MacroCall__Group_5__2__Impl rule__MacroCall__Group_5__3 ;
    public final void rule__MacroCall__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3411:1: ( rule__MacroCall__Group_5__2__Impl rule__MacroCall__Group_5__3 )
            // InternalXacro.g:3412:2: rule__MacroCall__Group_5__2__Impl rule__MacroCall__Group_5__3
            {
            pushFollow(FOLLOW_10);
            rule__MacroCall__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MacroCall__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group_5__2"


    // $ANTLR start "rule__MacroCall__Group_5__2__Impl"
    // InternalXacro.g:3419:1: rule__MacroCall__Group_5__2__Impl : ( ( rule__MacroCall__ParameterCallAssignment_5_2 ) ) ;
    public final void rule__MacroCall__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3423:1: ( ( ( rule__MacroCall__ParameterCallAssignment_5_2 ) ) )
            // InternalXacro.g:3424:1: ( ( rule__MacroCall__ParameterCallAssignment_5_2 ) )
            {
            // InternalXacro.g:3424:1: ( ( rule__MacroCall__ParameterCallAssignment_5_2 ) )
            // InternalXacro.g:3425:2: ( rule__MacroCall__ParameterCallAssignment_5_2 )
            {
             before(grammarAccess.getMacroCallAccess().getParameterCallAssignment_5_2()); 
            // InternalXacro.g:3426:2: ( rule__MacroCall__ParameterCallAssignment_5_2 )
            // InternalXacro.g:3426:3: rule__MacroCall__ParameterCallAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__MacroCall__ParameterCallAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getMacroCallAccess().getParameterCallAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group_5__2__Impl"


    // $ANTLR start "rule__MacroCall__Group_5__3"
    // InternalXacro.g:3434:1: rule__MacroCall__Group_5__3 : rule__MacroCall__Group_5__3__Impl rule__MacroCall__Group_5__4 ;
    public final void rule__MacroCall__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3438:1: ( rule__MacroCall__Group_5__3__Impl rule__MacroCall__Group_5__4 )
            // InternalXacro.g:3439:2: rule__MacroCall__Group_5__3__Impl rule__MacroCall__Group_5__4
            {
            pushFollow(FOLLOW_10);
            rule__MacroCall__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MacroCall__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group_5__3"


    // $ANTLR start "rule__MacroCall__Group_5__3__Impl"
    // InternalXacro.g:3446:1: rule__MacroCall__Group_5__3__Impl : ( ( rule__MacroCall__Group_5_3__0 )* ) ;
    public final void rule__MacroCall__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3450:1: ( ( ( rule__MacroCall__Group_5_3__0 )* ) )
            // InternalXacro.g:3451:1: ( ( rule__MacroCall__Group_5_3__0 )* )
            {
            // InternalXacro.g:3451:1: ( ( rule__MacroCall__Group_5_3__0 )* )
            // InternalXacro.g:3452:2: ( rule__MacroCall__Group_5_3__0 )*
            {
             before(grammarAccess.getMacroCallAccess().getGroup_5_3()); 
            // InternalXacro.g:3453:2: ( rule__MacroCall__Group_5_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==22) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalXacro.g:3453:3: rule__MacroCall__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__MacroCall__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getMacroCallAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group_5__3__Impl"


    // $ANTLR start "rule__MacroCall__Group_5__4"
    // InternalXacro.g:3461:1: rule__MacroCall__Group_5__4 : rule__MacroCall__Group_5__4__Impl ;
    public final void rule__MacroCall__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3465:1: ( rule__MacroCall__Group_5__4__Impl )
            // InternalXacro.g:3466:2: rule__MacroCall__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MacroCall__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group_5__4"


    // $ANTLR start "rule__MacroCall__Group_5__4__Impl"
    // InternalXacro.g:3472:1: rule__MacroCall__Group_5__4__Impl : ( '}' ) ;
    public final void rule__MacroCall__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3476:1: ( ( '}' ) )
            // InternalXacro.g:3477:1: ( '}' )
            {
            // InternalXacro.g:3477:1: ( '}' )
            // InternalXacro.g:3478:2: '}'
            {
             before(grammarAccess.getMacroCallAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMacroCallAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group_5__4__Impl"


    // $ANTLR start "rule__MacroCall__Group_5_3__0"
    // InternalXacro.g:3488:1: rule__MacroCall__Group_5_3__0 : rule__MacroCall__Group_5_3__0__Impl rule__MacroCall__Group_5_3__1 ;
    public final void rule__MacroCall__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3492:1: ( rule__MacroCall__Group_5_3__0__Impl rule__MacroCall__Group_5_3__1 )
            // InternalXacro.g:3493:2: rule__MacroCall__Group_5_3__0__Impl rule__MacroCall__Group_5_3__1
            {
            pushFollow(FOLLOW_28);
            rule__MacroCall__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MacroCall__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group_5_3__0"


    // $ANTLR start "rule__MacroCall__Group_5_3__0__Impl"
    // InternalXacro.g:3500:1: rule__MacroCall__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__MacroCall__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3504:1: ( ( ',' ) )
            // InternalXacro.g:3505:1: ( ',' )
            {
            // InternalXacro.g:3505:1: ( ',' )
            // InternalXacro.g:3506:2: ','
            {
             before(grammarAccess.getMacroCallAccess().getCommaKeyword_5_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMacroCallAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group_5_3__0__Impl"


    // $ANTLR start "rule__MacroCall__Group_5_3__1"
    // InternalXacro.g:3515:1: rule__MacroCall__Group_5_3__1 : rule__MacroCall__Group_5_3__1__Impl ;
    public final void rule__MacroCall__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3519:1: ( rule__MacroCall__Group_5_3__1__Impl )
            // InternalXacro.g:3520:2: rule__MacroCall__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MacroCall__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group_5_3__1"


    // $ANTLR start "rule__MacroCall__Group_5_3__1__Impl"
    // InternalXacro.g:3526:1: rule__MacroCall__Group_5_3__1__Impl : ( ( rule__MacroCall__ParameterCallAssignment_5_3_1 ) ) ;
    public final void rule__MacroCall__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3530:1: ( ( ( rule__MacroCall__ParameterCallAssignment_5_3_1 ) ) )
            // InternalXacro.g:3531:1: ( ( rule__MacroCall__ParameterCallAssignment_5_3_1 ) )
            {
            // InternalXacro.g:3531:1: ( ( rule__MacroCall__ParameterCallAssignment_5_3_1 ) )
            // InternalXacro.g:3532:2: ( rule__MacroCall__ParameterCallAssignment_5_3_1 )
            {
             before(grammarAccess.getMacroCallAccess().getParameterCallAssignment_5_3_1()); 
            // InternalXacro.g:3533:2: ( rule__MacroCall__ParameterCallAssignment_5_3_1 )
            // InternalXacro.g:3533:3: rule__MacroCall__ParameterCallAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MacroCall__ParameterCallAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMacroCallAccess().getParameterCallAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__Group_5_3__1__Impl"


    // $ANTLR start "rule__ParameterCall__Group__0"
    // InternalXacro.g:3542:1: rule__ParameterCall__Group__0 : rule__ParameterCall__Group__0__Impl rule__ParameterCall__Group__1 ;
    public final void rule__ParameterCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3546:1: ( rule__ParameterCall__Group__0__Impl rule__ParameterCall__Group__1 )
            // InternalXacro.g:3547:2: rule__ParameterCall__Group__0__Impl rule__ParameterCall__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalXacro.g:3554:1: rule__ParameterCall__Group__0__Impl : ( () ) ;
    public final void rule__ParameterCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3558:1: ( ( () ) )
            // InternalXacro.g:3559:1: ( () )
            {
            // InternalXacro.g:3559:1: ( () )
            // InternalXacro.g:3560:2: ()
            {
             before(grammarAccess.getParameterCallAccess().getParameterCallAction_0()); 
            // InternalXacro.g:3561:2: ()
            // InternalXacro.g:3561:3: 
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
    // InternalXacro.g:3569:1: rule__ParameterCall__Group__1 : rule__ParameterCall__Group__1__Impl rule__ParameterCall__Group__2 ;
    public final void rule__ParameterCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3573:1: ( rule__ParameterCall__Group__1__Impl rule__ParameterCall__Group__2 )
            // InternalXacro.g:3574:2: rule__ParameterCall__Group__1__Impl rule__ParameterCall__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalXacro.g:3581:1: rule__ParameterCall__Group__1__Impl : ( 'ParameterCall' ) ;
    public final void rule__ParameterCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3585:1: ( ( 'ParameterCall' ) )
            // InternalXacro.g:3586:1: ( 'ParameterCall' )
            {
            // InternalXacro.g:3586:1: ( 'ParameterCall' )
            // InternalXacro.g:3587:2: 'ParameterCall'
            {
             before(grammarAccess.getParameterCallAccess().getParameterCallKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getParameterCallAccess().getParameterCallKeyword_1()); 

            }


            }

        }
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
    // InternalXacro.g:3596:1: rule__ParameterCall__Group__2 : rule__ParameterCall__Group__2__Impl rule__ParameterCall__Group__3 ;
    public final void rule__ParameterCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3600:1: ( rule__ParameterCall__Group__2__Impl rule__ParameterCall__Group__3 )
            // InternalXacro.g:3601:2: rule__ParameterCall__Group__2__Impl rule__ParameterCall__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalXacro.g:3608:1: rule__ParameterCall__Group__2__Impl : ( '{' ) ;
    public final void rule__ParameterCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3612:1: ( ( '{' ) )
            // InternalXacro.g:3613:1: ( '{' )
            {
            // InternalXacro.g:3613:1: ( '{' )
            // InternalXacro.g:3614:2: '{'
            {
             before(grammarAccess.getParameterCallAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getParameterCallAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalXacro.g:3623:1: rule__ParameterCall__Group__3 : rule__ParameterCall__Group__3__Impl rule__ParameterCall__Group__4 ;
    public final void rule__ParameterCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3627:1: ( rule__ParameterCall__Group__3__Impl rule__ParameterCall__Group__4 )
            // InternalXacro.g:3628:2: rule__ParameterCall__Group__3__Impl rule__ParameterCall__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalXacro.g:3635:1: rule__ParameterCall__Group__3__Impl : ( 'parameter' ) ;
    public final void rule__ParameterCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3639:1: ( ( 'parameter' ) )
            // InternalXacro.g:3640:1: ( 'parameter' )
            {
            // InternalXacro.g:3640:1: ( 'parameter' )
            // InternalXacro.g:3641:2: 'parameter'
            {
             before(grammarAccess.getParameterCallAccess().getParameterKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getParameterCallAccess().getParameterKeyword_3()); 

            }


            }

        }
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
    // InternalXacro.g:3650:1: rule__ParameterCall__Group__4 : rule__ParameterCall__Group__4__Impl rule__ParameterCall__Group__5 ;
    public final void rule__ParameterCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3654:1: ( rule__ParameterCall__Group__4__Impl rule__ParameterCall__Group__5 )
            // InternalXacro.g:3655:2: rule__ParameterCall__Group__4__Impl rule__ParameterCall__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalXacro.g:3662:1: rule__ParameterCall__Group__4__Impl : ( ( rule__ParameterCall__ParameterAssignment_4 ) ) ;
    public final void rule__ParameterCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3666:1: ( ( ( rule__ParameterCall__ParameterAssignment_4 ) ) )
            // InternalXacro.g:3667:1: ( ( rule__ParameterCall__ParameterAssignment_4 ) )
            {
            // InternalXacro.g:3667:1: ( ( rule__ParameterCall__ParameterAssignment_4 ) )
            // InternalXacro.g:3668:2: ( rule__ParameterCall__ParameterAssignment_4 )
            {
             before(grammarAccess.getParameterCallAccess().getParameterAssignment_4()); 
            // InternalXacro.g:3669:2: ( rule__ParameterCall__ParameterAssignment_4 )
            // InternalXacro.g:3669:3: rule__ParameterCall__ParameterAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ParameterCall__ParameterAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getParameterCallAccess().getParameterAssignment_4()); 

            }


            }

        }
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
    // InternalXacro.g:3677:1: rule__ParameterCall__Group__5 : rule__ParameterCall__Group__5__Impl rule__ParameterCall__Group__6 ;
    public final void rule__ParameterCall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3681:1: ( rule__ParameterCall__Group__5__Impl rule__ParameterCall__Group__6 )
            // InternalXacro.g:3682:2: rule__ParameterCall__Group__5__Impl rule__ParameterCall__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalXacro.g:3689:1: rule__ParameterCall__Group__5__Impl : ( 'value' ) ;
    public final void rule__ParameterCall__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3693:1: ( ( 'value' ) )
            // InternalXacro.g:3694:1: ( 'value' )
            {
            // InternalXacro.g:3694:1: ( 'value' )
            // InternalXacro.g:3695:2: 'value'
            {
             before(grammarAccess.getParameterCallAccess().getValueKeyword_5()); 
            match(input,29,FOLLOW_2); 
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
    // InternalXacro.g:3704:1: rule__ParameterCall__Group__6 : rule__ParameterCall__Group__6__Impl rule__ParameterCall__Group__7 ;
    public final void rule__ParameterCall__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3708:1: ( rule__ParameterCall__Group__6__Impl rule__ParameterCall__Group__7 )
            // InternalXacro.g:3709:2: rule__ParameterCall__Group__6__Impl rule__ParameterCall__Group__7
            {
            pushFollow(FOLLOW_31);
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
    // InternalXacro.g:3716:1: rule__ParameterCall__Group__6__Impl : ( ( rule__ParameterCall__ValueAssignment_6 ) ) ;
    public final void rule__ParameterCall__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3720:1: ( ( ( rule__ParameterCall__ValueAssignment_6 ) ) )
            // InternalXacro.g:3721:1: ( ( rule__ParameterCall__ValueAssignment_6 ) )
            {
            // InternalXacro.g:3721:1: ( ( rule__ParameterCall__ValueAssignment_6 ) )
            // InternalXacro.g:3722:2: ( rule__ParameterCall__ValueAssignment_6 )
            {
             before(grammarAccess.getParameterCallAccess().getValueAssignment_6()); 
            // InternalXacro.g:3723:2: ( rule__ParameterCall__ValueAssignment_6 )
            // InternalXacro.g:3723:3: rule__ParameterCall__ValueAssignment_6
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
    // InternalXacro.g:3731:1: rule__ParameterCall__Group__7 : rule__ParameterCall__Group__7__Impl ;
    public final void rule__ParameterCall__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3735:1: ( rule__ParameterCall__Group__7__Impl )
            // InternalXacro.g:3736:2: rule__ParameterCall__Group__7__Impl
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
    // InternalXacro.g:3742:1: rule__ParameterCall__Group__7__Impl : ( '}' ) ;
    public final void rule__ParameterCall__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3746:1: ( ( '}' ) )
            // InternalXacro.g:3747:1: ( '}' )
            {
            // InternalXacro.g:3747:1: ( '}' )
            // InternalXacro.g:3748:2: '}'
            {
             before(grammarAccess.getParameterCallAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getParameterCallAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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
    // InternalXacro.g:3758:1: rule__Joint__Group__0 : rule__Joint__Group__0__Impl rule__Joint__Group__1 ;
    public final void rule__Joint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3762:1: ( rule__Joint__Group__0__Impl rule__Joint__Group__1 )
            // InternalXacro.g:3763:2: rule__Joint__Group__0__Impl rule__Joint__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalXacro.g:3770:1: rule__Joint__Group__0__Impl : ( 'Joint' ) ;
    public final void rule__Joint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3774:1: ( ( 'Joint' ) )
            // InternalXacro.g:3775:1: ( 'Joint' )
            {
            // InternalXacro.g:3775:1: ( 'Joint' )
            // InternalXacro.g:3776:2: 'Joint'
            {
             before(grammarAccess.getJointAccess().getJointKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getJointKeyword_0()); 

            }


            }

        }
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
    // InternalXacro.g:3785:1: rule__Joint__Group__1 : rule__Joint__Group__1__Impl rule__Joint__Group__2 ;
    public final void rule__Joint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3789:1: ( rule__Joint__Group__1__Impl rule__Joint__Group__2 )
            // InternalXacro.g:3790:2: rule__Joint__Group__1__Impl rule__Joint__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalXacro.g:3797:1: rule__Joint__Group__1__Impl : ( '{' ) ;
    public final void rule__Joint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3801:1: ( ( '{' ) )
            // InternalXacro.g:3802:1: ( '{' )
            {
            // InternalXacro.g:3802:1: ( '{' )
            // InternalXacro.g:3803:2: '{'
            {
             before(grammarAccess.getJointAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalXacro.g:3812:1: rule__Joint__Group__2 : rule__Joint__Group__2__Impl rule__Joint__Group__3 ;
    public final void rule__Joint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3816:1: ( rule__Joint__Group__2__Impl rule__Joint__Group__3 )
            // InternalXacro.g:3817:2: rule__Joint__Group__2__Impl rule__Joint__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalXacro.g:3824:1: rule__Joint__Group__2__Impl : ( 'name' ) ;
    public final void rule__Joint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3828:1: ( ( 'name' ) )
            // InternalXacro.g:3829:1: ( 'name' )
            {
            // InternalXacro.g:3829:1: ( 'name' )
            // InternalXacro.g:3830:2: 'name'
            {
             before(grammarAccess.getJointAccess().getNameKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getNameKeyword_2()); 

            }


            }

        }
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
    // InternalXacro.g:3839:1: rule__Joint__Group__3 : rule__Joint__Group__3__Impl rule__Joint__Group__4 ;
    public final void rule__Joint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3843:1: ( rule__Joint__Group__3__Impl rule__Joint__Group__4 )
            // InternalXacro.g:3844:2: rule__Joint__Group__3__Impl rule__Joint__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalXacro.g:3851:1: rule__Joint__Group__3__Impl : ( ( rule__Joint__NameAssignment_3 ) ) ;
    public final void rule__Joint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3855:1: ( ( ( rule__Joint__NameAssignment_3 ) ) )
            // InternalXacro.g:3856:1: ( ( rule__Joint__NameAssignment_3 ) )
            {
            // InternalXacro.g:3856:1: ( ( rule__Joint__NameAssignment_3 ) )
            // InternalXacro.g:3857:2: ( rule__Joint__NameAssignment_3 )
            {
             before(grammarAccess.getJointAccess().getNameAssignment_3()); 
            // InternalXacro.g:3858:2: ( rule__Joint__NameAssignment_3 )
            // InternalXacro.g:3858:3: rule__Joint__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Joint__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalXacro.g:3866:1: rule__Joint__Group__4 : rule__Joint__Group__4__Impl rule__Joint__Group__5 ;
    public final void rule__Joint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3870:1: ( rule__Joint__Group__4__Impl rule__Joint__Group__5 )
            // InternalXacro.g:3871:2: rule__Joint__Group__4__Impl rule__Joint__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalXacro.g:3878:1: rule__Joint__Group__4__Impl : ( 'type' ) ;
    public final void rule__Joint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3882:1: ( ( 'type' ) )
            // InternalXacro.g:3883:1: ( 'type' )
            {
            // InternalXacro.g:3883:1: ( 'type' )
            // InternalXacro.g:3884:2: 'type'
            {
             before(grammarAccess.getJointAccess().getTypeKeyword_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalXacro.g:3893:1: rule__Joint__Group__5 : rule__Joint__Group__5__Impl rule__Joint__Group__6 ;
    public final void rule__Joint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3897:1: ( rule__Joint__Group__5__Impl rule__Joint__Group__6 )
            // InternalXacro.g:3898:2: rule__Joint__Group__5__Impl rule__Joint__Group__6
            {
            pushFollow(FOLLOW_33);
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
    // InternalXacro.g:3905:1: rule__Joint__Group__5__Impl : ( ( rule__Joint__TypeAssignment_5 ) ) ;
    public final void rule__Joint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3909:1: ( ( ( rule__Joint__TypeAssignment_5 ) ) )
            // InternalXacro.g:3910:1: ( ( rule__Joint__TypeAssignment_5 ) )
            {
            // InternalXacro.g:3910:1: ( ( rule__Joint__TypeAssignment_5 ) )
            // InternalXacro.g:3911:2: ( rule__Joint__TypeAssignment_5 )
            {
             before(grammarAccess.getJointAccess().getTypeAssignment_5()); 
            // InternalXacro.g:3912:2: ( rule__Joint__TypeAssignment_5 )
            // InternalXacro.g:3912:3: rule__Joint__TypeAssignment_5
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
    // InternalXacro.g:3920:1: rule__Joint__Group__6 : rule__Joint__Group__6__Impl rule__Joint__Group__7 ;
    public final void rule__Joint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3924:1: ( rule__Joint__Group__6__Impl rule__Joint__Group__7 )
            // InternalXacro.g:3925:2: rule__Joint__Group__6__Impl rule__Joint__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalXacro.g:3932:1: rule__Joint__Group__6__Impl : ( 'parent' ) ;
    public final void rule__Joint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3936:1: ( ( 'parent' ) )
            // InternalXacro.g:3937:1: ( 'parent' )
            {
            // InternalXacro.g:3937:1: ( 'parent' )
            // InternalXacro.g:3938:2: 'parent'
            {
             before(grammarAccess.getJointAccess().getParentKeyword_6()); 
            match(input,39,FOLLOW_2); 
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
    // InternalXacro.g:3947:1: rule__Joint__Group__7 : rule__Joint__Group__7__Impl rule__Joint__Group__8 ;
    public final void rule__Joint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3951:1: ( rule__Joint__Group__7__Impl rule__Joint__Group__8 )
            // InternalXacro.g:3952:2: rule__Joint__Group__7__Impl rule__Joint__Group__8
            {
            pushFollow(FOLLOW_34);
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
    // InternalXacro.g:3959:1: rule__Joint__Group__7__Impl : ( ( rule__Joint__ParentAssignment_7 ) ) ;
    public final void rule__Joint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3963:1: ( ( ( rule__Joint__ParentAssignment_7 ) ) )
            // InternalXacro.g:3964:1: ( ( rule__Joint__ParentAssignment_7 ) )
            {
            // InternalXacro.g:3964:1: ( ( rule__Joint__ParentAssignment_7 ) )
            // InternalXacro.g:3965:2: ( rule__Joint__ParentAssignment_7 )
            {
             before(grammarAccess.getJointAccess().getParentAssignment_7()); 
            // InternalXacro.g:3966:2: ( rule__Joint__ParentAssignment_7 )
            // InternalXacro.g:3966:3: rule__Joint__ParentAssignment_7
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
    // InternalXacro.g:3974:1: rule__Joint__Group__8 : rule__Joint__Group__8__Impl rule__Joint__Group__9 ;
    public final void rule__Joint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3978:1: ( rule__Joint__Group__8__Impl rule__Joint__Group__9 )
            // InternalXacro.g:3979:2: rule__Joint__Group__8__Impl rule__Joint__Group__9
            {
            pushFollow(FOLLOW_20);
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
    // InternalXacro.g:3986:1: rule__Joint__Group__8__Impl : ( 'child' ) ;
    public final void rule__Joint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:3990:1: ( ( 'child' ) )
            // InternalXacro.g:3991:1: ( 'child' )
            {
            // InternalXacro.g:3991:1: ( 'child' )
            // InternalXacro.g:3992:2: 'child'
            {
             before(grammarAccess.getJointAccess().getChildKeyword_8()); 
            match(input,40,FOLLOW_2); 
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
    // InternalXacro.g:4001:1: rule__Joint__Group__9 : rule__Joint__Group__9__Impl rule__Joint__Group__10 ;
    public final void rule__Joint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4005:1: ( rule__Joint__Group__9__Impl rule__Joint__Group__10 )
            // InternalXacro.g:4006:2: rule__Joint__Group__9__Impl rule__Joint__Group__10
            {
            pushFollow(FOLLOW_35);
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
    // InternalXacro.g:4013:1: rule__Joint__Group__9__Impl : ( ( rule__Joint__ChildAssignment_9 ) ) ;
    public final void rule__Joint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4017:1: ( ( ( rule__Joint__ChildAssignment_9 ) ) )
            // InternalXacro.g:4018:1: ( ( rule__Joint__ChildAssignment_9 ) )
            {
            // InternalXacro.g:4018:1: ( ( rule__Joint__ChildAssignment_9 ) )
            // InternalXacro.g:4019:2: ( rule__Joint__ChildAssignment_9 )
            {
             before(grammarAccess.getJointAccess().getChildAssignment_9()); 
            // InternalXacro.g:4020:2: ( rule__Joint__ChildAssignment_9 )
            // InternalXacro.g:4020:3: rule__Joint__ChildAssignment_9
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
    // InternalXacro.g:4028:1: rule__Joint__Group__10 : rule__Joint__Group__10__Impl rule__Joint__Group__11 ;
    public final void rule__Joint__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4032:1: ( rule__Joint__Group__10__Impl rule__Joint__Group__11 )
            // InternalXacro.g:4033:2: rule__Joint__Group__10__Impl rule__Joint__Group__11
            {
            pushFollow(FOLLOW_35);
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
    // InternalXacro.g:4040:1: rule__Joint__Group__10__Impl : ( ( rule__Joint__Group_10__0 )? ) ;
    public final void rule__Joint__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4044:1: ( ( ( rule__Joint__Group_10__0 )? ) )
            // InternalXacro.g:4045:1: ( ( rule__Joint__Group_10__0 )? )
            {
            // InternalXacro.g:4045:1: ( ( rule__Joint__Group_10__0 )? )
            // InternalXacro.g:4046:2: ( rule__Joint__Group_10__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_10()); 
            // InternalXacro.g:4047:2: ( rule__Joint__Group_10__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalXacro.g:4047:3: rule__Joint__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_10()); 

            }


            }

        }
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
    // InternalXacro.g:4055:1: rule__Joint__Group__11 : rule__Joint__Group__11__Impl rule__Joint__Group__12 ;
    public final void rule__Joint__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4059:1: ( rule__Joint__Group__11__Impl rule__Joint__Group__12 )
            // InternalXacro.g:4060:2: rule__Joint__Group__11__Impl rule__Joint__Group__12
            {
            pushFollow(FOLLOW_35);
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
    // InternalXacro.g:4067:1: rule__Joint__Group__11__Impl : ( ( rule__Joint__Group_11__0 )? ) ;
    public final void rule__Joint__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4071:1: ( ( ( rule__Joint__Group_11__0 )? ) )
            // InternalXacro.g:4072:1: ( ( rule__Joint__Group_11__0 )? )
            {
            // InternalXacro.g:4072:1: ( ( rule__Joint__Group_11__0 )? )
            // InternalXacro.g:4073:2: ( rule__Joint__Group_11__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_11()); 
            // InternalXacro.g:4074:2: ( rule__Joint__Group_11__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalXacro.g:4074:3: rule__Joint__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_11()); 

            }


            }

        }
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
    // InternalXacro.g:4082:1: rule__Joint__Group__12 : rule__Joint__Group__12__Impl rule__Joint__Group__13 ;
    public final void rule__Joint__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4086:1: ( rule__Joint__Group__12__Impl rule__Joint__Group__13 )
            // InternalXacro.g:4087:2: rule__Joint__Group__12__Impl rule__Joint__Group__13
            {
            pushFollow(FOLLOW_35);
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
    // InternalXacro.g:4094:1: rule__Joint__Group__12__Impl : ( ( rule__Joint__Group_12__0 )? ) ;
    public final void rule__Joint__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4098:1: ( ( ( rule__Joint__Group_12__0 )? ) )
            // InternalXacro.g:4099:1: ( ( rule__Joint__Group_12__0 )? )
            {
            // InternalXacro.g:4099:1: ( ( rule__Joint__Group_12__0 )? )
            // InternalXacro.g:4100:2: ( rule__Joint__Group_12__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_12()); 
            // InternalXacro.g:4101:2: ( rule__Joint__Group_12__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalXacro.g:4101:3: rule__Joint__Group_12__0
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
    // InternalXacro.g:4109:1: rule__Joint__Group__13 : rule__Joint__Group__13__Impl ;
    public final void rule__Joint__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4113:1: ( rule__Joint__Group__13__Impl )
            // InternalXacro.g:4114:2: rule__Joint__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group__13__Impl();

            state._fsp--;


            }

        }
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
    // InternalXacro.g:4120:1: rule__Joint__Group__13__Impl : ( '}' ) ;
    public final void rule__Joint__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4124:1: ( ( '}' ) )
            // InternalXacro.g:4125:1: ( '}' )
            {
            // InternalXacro.g:4125:1: ( '}' )
            // InternalXacro.g:4126:2: '}'
            {
             before(grammarAccess.getJointAccess().getRightCurlyBracketKeyword_13()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
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


    // $ANTLR start "rule__Joint__Group_10__0"
    // InternalXacro.g:4136:1: rule__Joint__Group_10__0 : rule__Joint__Group_10__0__Impl rule__Joint__Group_10__1 ;
    public final void rule__Joint__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4140:1: ( rule__Joint__Group_10__0__Impl rule__Joint__Group_10__1 )
            // InternalXacro.g:4141:2: rule__Joint__Group_10__0__Impl rule__Joint__Group_10__1
            {
            pushFollow(FOLLOW_36);
            rule__Joint__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_10__0"


    // $ANTLR start "rule__Joint__Group_10__0__Impl"
    // InternalXacro.g:4148:1: rule__Joint__Group_10__0__Impl : ( 'origin' ) ;
    public final void rule__Joint__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4152:1: ( ( 'origin' ) )
            // InternalXacro.g:4153:1: ( 'origin' )
            {
            // InternalXacro.g:4153:1: ( 'origin' )
            // InternalXacro.g:4154:2: 'origin'
            {
             before(grammarAccess.getJointAccess().getOriginKeyword_10_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getOriginKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_10__0__Impl"


    // $ANTLR start "rule__Joint__Group_10__1"
    // InternalXacro.g:4163:1: rule__Joint__Group_10__1 : rule__Joint__Group_10__1__Impl ;
    public final void rule__Joint__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4167:1: ( rule__Joint__Group_10__1__Impl )
            // InternalXacro.g:4168:2: rule__Joint__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_10__1"


    // $ANTLR start "rule__Joint__Group_10__1__Impl"
    // InternalXacro.g:4174:1: rule__Joint__Group_10__1__Impl : ( ( rule__Joint__OriginAssignment_10_1 ) ) ;
    public final void rule__Joint__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4178:1: ( ( ( rule__Joint__OriginAssignment_10_1 ) ) )
            // InternalXacro.g:4179:1: ( ( rule__Joint__OriginAssignment_10_1 ) )
            {
            // InternalXacro.g:4179:1: ( ( rule__Joint__OriginAssignment_10_1 ) )
            // InternalXacro.g:4180:2: ( rule__Joint__OriginAssignment_10_1 )
            {
             before(grammarAccess.getJointAccess().getOriginAssignment_10_1()); 
            // InternalXacro.g:4181:2: ( rule__Joint__OriginAssignment_10_1 )
            // InternalXacro.g:4181:3: rule__Joint__OriginAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__OriginAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getOriginAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_10__1__Impl"


    // $ANTLR start "rule__Joint__Group_11__0"
    // InternalXacro.g:4190:1: rule__Joint__Group_11__0 : rule__Joint__Group_11__0__Impl rule__Joint__Group_11__1 ;
    public final void rule__Joint__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4194:1: ( rule__Joint__Group_11__0__Impl rule__Joint__Group_11__1 )
            // InternalXacro.g:4195:2: rule__Joint__Group_11__0__Impl rule__Joint__Group_11__1
            {
            pushFollow(FOLLOW_37);
            rule__Joint__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_11__0"


    // $ANTLR start "rule__Joint__Group_11__0__Impl"
    // InternalXacro.g:4202:1: rule__Joint__Group_11__0__Impl : ( 'axis' ) ;
    public final void rule__Joint__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4206:1: ( ( 'axis' ) )
            // InternalXacro.g:4207:1: ( 'axis' )
            {
            // InternalXacro.g:4207:1: ( 'axis' )
            // InternalXacro.g:4208:2: 'axis'
            {
             before(grammarAccess.getJointAccess().getAxisKeyword_11_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getAxisKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_11__0__Impl"


    // $ANTLR start "rule__Joint__Group_11__1"
    // InternalXacro.g:4217:1: rule__Joint__Group_11__1 : rule__Joint__Group_11__1__Impl ;
    public final void rule__Joint__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4221:1: ( rule__Joint__Group_11__1__Impl )
            // InternalXacro.g:4222:2: rule__Joint__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_11__1"


    // $ANTLR start "rule__Joint__Group_11__1__Impl"
    // InternalXacro.g:4228:1: rule__Joint__Group_11__1__Impl : ( ( rule__Joint__AxisAssignment_11_1 ) ) ;
    public final void rule__Joint__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4232:1: ( ( ( rule__Joint__AxisAssignment_11_1 ) ) )
            // InternalXacro.g:4233:1: ( ( rule__Joint__AxisAssignment_11_1 ) )
            {
            // InternalXacro.g:4233:1: ( ( rule__Joint__AxisAssignment_11_1 ) )
            // InternalXacro.g:4234:2: ( rule__Joint__AxisAssignment_11_1 )
            {
             before(grammarAccess.getJointAccess().getAxisAssignment_11_1()); 
            // InternalXacro.g:4235:2: ( rule__Joint__AxisAssignment_11_1 )
            // InternalXacro.g:4235:3: rule__Joint__AxisAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__AxisAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getAxisAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_11__1__Impl"


    // $ANTLR start "rule__Joint__Group_12__0"
    // InternalXacro.g:4244:1: rule__Joint__Group_12__0 : rule__Joint__Group_12__0__Impl rule__Joint__Group_12__1 ;
    public final void rule__Joint__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4248:1: ( rule__Joint__Group_12__0__Impl rule__Joint__Group_12__1 )
            // InternalXacro.g:4249:2: rule__Joint__Group_12__0__Impl rule__Joint__Group_12__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalXacro.g:4256:1: rule__Joint__Group_12__0__Impl : ( 'limit' ) ;
    public final void rule__Joint__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4260:1: ( ( 'limit' ) )
            // InternalXacro.g:4261:1: ( 'limit' )
            {
            // InternalXacro.g:4261:1: ( 'limit' )
            // InternalXacro.g:4262:2: 'limit'
            {
             before(grammarAccess.getJointAccess().getLimitKeyword_12_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getLimitKeyword_12_0()); 

            }


            }

        }
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
    // InternalXacro.g:4271:1: rule__Joint__Group_12__1 : rule__Joint__Group_12__1__Impl ;
    public final void rule__Joint__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4275:1: ( rule__Joint__Group_12__1__Impl )
            // InternalXacro.g:4276:2: rule__Joint__Group_12__1__Impl
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
    // InternalXacro.g:4282:1: rule__Joint__Group_12__1__Impl : ( ( rule__Joint__LimitAssignment_12_1 ) ) ;
    public final void rule__Joint__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4286:1: ( ( ( rule__Joint__LimitAssignment_12_1 ) ) )
            // InternalXacro.g:4287:1: ( ( rule__Joint__LimitAssignment_12_1 ) )
            {
            // InternalXacro.g:4287:1: ( ( rule__Joint__LimitAssignment_12_1 ) )
            // InternalXacro.g:4288:2: ( rule__Joint__LimitAssignment_12_1 )
            {
             before(grammarAccess.getJointAccess().getLimitAssignment_12_1()); 
            // InternalXacro.g:4289:2: ( rule__Joint__LimitAssignment_12_1 )
            // InternalXacro.g:4289:3: rule__Joint__LimitAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__LimitAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getLimitAssignment_12_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Link__Group__0"
    // InternalXacro.g:4298:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4302:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalXacro.g:4303:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalXacro.g:4310:1: rule__Link__Group__0__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4314:1: ( ( 'Link' ) )
            // InternalXacro.g:4315:1: ( 'Link' )
            {
            // InternalXacro.g:4315:1: ( 'Link' )
            // InternalXacro.g:4316:2: 'Link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLinkKeyword_0()); 

            }


            }

        }
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
    // InternalXacro.g:4325:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4329:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalXacro.g:4330:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalXacro.g:4337:1: rule__Link__Group__1__Impl : ( '{' ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4341:1: ( ( '{' ) )
            // InternalXacro.g:4342:1: ( '{' )
            {
            // InternalXacro.g:4342:1: ( '{' )
            // InternalXacro.g:4343:2: '{'
            {
             before(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalXacro.g:4352:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4356:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalXacro.g:4357:2: rule__Link__Group__2__Impl rule__Link__Group__3
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
    // InternalXacro.g:4364:1: rule__Link__Group__2__Impl : ( 'name' ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4368:1: ( ( 'name' ) )
            // InternalXacro.g:4369:1: ( 'name' )
            {
            // InternalXacro.g:4369:1: ( 'name' )
            // InternalXacro.g:4370:2: 'name'
            {
             before(grammarAccess.getLinkAccess().getNameKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getNameKeyword_2()); 

            }


            }

        }
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
    // InternalXacro.g:4379:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4383:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // InternalXacro.g:4384:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__Link__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__4();

            state._fsp--;


            }

        }
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
    // InternalXacro.g:4391:1: rule__Link__Group__3__Impl : ( ( rule__Link__NameAssignment_3 ) ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4395:1: ( ( ( rule__Link__NameAssignment_3 ) ) )
            // InternalXacro.g:4396:1: ( ( rule__Link__NameAssignment_3 ) )
            {
            // InternalXacro.g:4396:1: ( ( rule__Link__NameAssignment_3 ) )
            // InternalXacro.g:4397:2: ( rule__Link__NameAssignment_3 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_3()); 
            // InternalXacro.g:4398:2: ( rule__Link__NameAssignment_3 )
            // InternalXacro.g:4398:3: rule__Link__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Link__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getNameAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Link__Group__4"
    // InternalXacro.g:4406:1: rule__Link__Group__4 : rule__Link__Group__4__Impl rule__Link__Group__5 ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4410:1: ( rule__Link__Group__4__Impl rule__Link__Group__5 )
            // InternalXacro.g:4411:2: rule__Link__Group__4__Impl rule__Link__Group__5
            {
            pushFollow(FOLLOW_39);
            rule__Link__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__4"


    // $ANTLR start "rule__Link__Group__4__Impl"
    // InternalXacro.g:4418:1: rule__Link__Group__4__Impl : ( ( rule__Link__Group_4__0 )? ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4422:1: ( ( ( rule__Link__Group_4__0 )? ) )
            // InternalXacro.g:4423:1: ( ( rule__Link__Group_4__0 )? )
            {
            // InternalXacro.g:4423:1: ( ( rule__Link__Group_4__0 )? )
            // InternalXacro.g:4424:2: ( rule__Link__Group_4__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_4()); 
            // InternalXacro.g:4425:2: ( rule__Link__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==45) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalXacro.g:4425:3: rule__Link__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__4__Impl"


    // $ANTLR start "rule__Link__Group__5"
    // InternalXacro.g:4433:1: rule__Link__Group__5 : rule__Link__Group__5__Impl rule__Link__Group__6 ;
    public final void rule__Link__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4437:1: ( rule__Link__Group__5__Impl rule__Link__Group__6 )
            // InternalXacro.g:4438:2: rule__Link__Group__5__Impl rule__Link__Group__6
            {
            pushFollow(FOLLOW_39);
            rule__Link__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__5"


    // $ANTLR start "rule__Link__Group__5__Impl"
    // InternalXacro.g:4445:1: rule__Link__Group__5__Impl : ( ( rule__Link__Group_5__0 )? ) ;
    public final void rule__Link__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4449:1: ( ( ( rule__Link__Group_5__0 )? ) )
            // InternalXacro.g:4450:1: ( ( rule__Link__Group_5__0 )? )
            {
            // InternalXacro.g:4450:1: ( ( rule__Link__Group_5__0 )? )
            // InternalXacro.g:4451:2: ( rule__Link__Group_5__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_5()); 
            // InternalXacro.g:4452:2: ( rule__Link__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==46) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXacro.g:4452:3: rule__Link__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__5__Impl"


    // $ANTLR start "rule__Link__Group__6"
    // InternalXacro.g:4460:1: rule__Link__Group__6 : rule__Link__Group__6__Impl rule__Link__Group__7 ;
    public final void rule__Link__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4464:1: ( rule__Link__Group__6__Impl rule__Link__Group__7 )
            // InternalXacro.g:4465:2: rule__Link__Group__6__Impl rule__Link__Group__7
            {
            pushFollow(FOLLOW_39);
            rule__Link__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__6"


    // $ANTLR start "rule__Link__Group__6__Impl"
    // InternalXacro.g:4472:1: rule__Link__Group__6__Impl : ( ( rule__Link__Group_6__0 )? ) ;
    public final void rule__Link__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4476:1: ( ( ( rule__Link__Group_6__0 )? ) )
            // InternalXacro.g:4477:1: ( ( rule__Link__Group_6__0 )? )
            {
            // InternalXacro.g:4477:1: ( ( rule__Link__Group_6__0 )? )
            // InternalXacro.g:4478:2: ( rule__Link__Group_6__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_6()); 
            // InternalXacro.g:4479:2: ( rule__Link__Group_6__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==47) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalXacro.g:4479:3: rule__Link__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__6__Impl"


    // $ANTLR start "rule__Link__Group__7"
    // InternalXacro.g:4487:1: rule__Link__Group__7 : rule__Link__Group__7__Impl ;
    public final void rule__Link__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4491:1: ( rule__Link__Group__7__Impl )
            // InternalXacro.g:4492:2: rule__Link__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__7"


    // $ANTLR start "rule__Link__Group__7__Impl"
    // InternalXacro.g:4498:1: rule__Link__Group__7__Impl : ( '}' ) ;
    public final void rule__Link__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4502:1: ( ( '}' ) )
            // InternalXacro.g:4503:1: ( '}' )
            {
            // InternalXacro.g:4503:1: ( '}' )
            // InternalXacro.g:4504:2: '}'
            {
             before(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__7__Impl"


    // $ANTLR start "rule__Link__Group_4__0"
    // InternalXacro.g:4514:1: rule__Link__Group_4__0 : rule__Link__Group_4__0__Impl rule__Link__Group_4__1 ;
    public final void rule__Link__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4518:1: ( rule__Link__Group_4__0__Impl rule__Link__Group_4__1 )
            // InternalXacro.g:4519:2: rule__Link__Group_4__0__Impl rule__Link__Group_4__1
            {
            pushFollow(FOLLOW_40);
            rule__Link__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_4__0"


    // $ANTLR start "rule__Link__Group_4__0__Impl"
    // InternalXacro.g:4526:1: rule__Link__Group_4__0__Impl : ( 'inertial' ) ;
    public final void rule__Link__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4530:1: ( ( 'inertial' ) )
            // InternalXacro.g:4531:1: ( 'inertial' )
            {
            // InternalXacro.g:4531:1: ( 'inertial' )
            // InternalXacro.g:4532:2: 'inertial'
            {
             before(grammarAccess.getLinkAccess().getInertialKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getInertialKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_4__0__Impl"


    // $ANTLR start "rule__Link__Group_4__1"
    // InternalXacro.g:4541:1: rule__Link__Group_4__1 : rule__Link__Group_4__1__Impl ;
    public final void rule__Link__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4545:1: ( rule__Link__Group_4__1__Impl )
            // InternalXacro.g:4546:2: rule__Link__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_4__1"


    // $ANTLR start "rule__Link__Group_4__1__Impl"
    // InternalXacro.g:4552:1: rule__Link__Group_4__1__Impl : ( ( rule__Link__InertialAssignment_4_1 ) ) ;
    public final void rule__Link__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4556:1: ( ( ( rule__Link__InertialAssignment_4_1 ) ) )
            // InternalXacro.g:4557:1: ( ( rule__Link__InertialAssignment_4_1 ) )
            {
            // InternalXacro.g:4557:1: ( ( rule__Link__InertialAssignment_4_1 ) )
            // InternalXacro.g:4558:2: ( rule__Link__InertialAssignment_4_1 )
            {
             before(grammarAccess.getLinkAccess().getInertialAssignment_4_1()); 
            // InternalXacro.g:4559:2: ( rule__Link__InertialAssignment_4_1 )
            // InternalXacro.g:4559:3: rule__Link__InertialAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__InertialAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getInertialAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_4__1__Impl"


    // $ANTLR start "rule__Link__Group_5__0"
    // InternalXacro.g:4568:1: rule__Link__Group_5__0 : rule__Link__Group_5__0__Impl rule__Link__Group_5__1 ;
    public final void rule__Link__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4572:1: ( rule__Link__Group_5__0__Impl rule__Link__Group_5__1 )
            // InternalXacro.g:4573:2: rule__Link__Group_5__0__Impl rule__Link__Group_5__1
            {
            pushFollow(FOLLOW_41);
            rule__Link__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_5__0"


    // $ANTLR start "rule__Link__Group_5__0__Impl"
    // InternalXacro.g:4580:1: rule__Link__Group_5__0__Impl : ( 'visual' ) ;
    public final void rule__Link__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4584:1: ( ( 'visual' ) )
            // InternalXacro.g:4585:1: ( 'visual' )
            {
            // InternalXacro.g:4585:1: ( 'visual' )
            // InternalXacro.g:4586:2: 'visual'
            {
             before(grammarAccess.getLinkAccess().getVisualKeyword_5_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getVisualKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_5__0__Impl"


    // $ANTLR start "rule__Link__Group_5__1"
    // InternalXacro.g:4595:1: rule__Link__Group_5__1 : rule__Link__Group_5__1__Impl ;
    public final void rule__Link__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4599:1: ( rule__Link__Group_5__1__Impl )
            // InternalXacro.g:4600:2: rule__Link__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_5__1"


    // $ANTLR start "rule__Link__Group_5__1__Impl"
    // InternalXacro.g:4606:1: rule__Link__Group_5__1__Impl : ( ( rule__Link__VisualAssignment_5_1 ) ) ;
    public final void rule__Link__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4610:1: ( ( ( rule__Link__VisualAssignment_5_1 ) ) )
            // InternalXacro.g:4611:1: ( ( rule__Link__VisualAssignment_5_1 ) )
            {
            // InternalXacro.g:4611:1: ( ( rule__Link__VisualAssignment_5_1 ) )
            // InternalXacro.g:4612:2: ( rule__Link__VisualAssignment_5_1 )
            {
             before(grammarAccess.getLinkAccess().getVisualAssignment_5_1()); 
            // InternalXacro.g:4613:2: ( rule__Link__VisualAssignment_5_1 )
            // InternalXacro.g:4613:3: rule__Link__VisualAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__VisualAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getVisualAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_5__1__Impl"


    // $ANTLR start "rule__Link__Group_6__0"
    // InternalXacro.g:4622:1: rule__Link__Group_6__0 : rule__Link__Group_6__0__Impl rule__Link__Group_6__1 ;
    public final void rule__Link__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4626:1: ( rule__Link__Group_6__0__Impl rule__Link__Group_6__1 )
            // InternalXacro.g:4627:2: rule__Link__Group_6__0__Impl rule__Link__Group_6__1
            {
            pushFollow(FOLLOW_42);
            rule__Link__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_6__0"


    // $ANTLR start "rule__Link__Group_6__0__Impl"
    // InternalXacro.g:4634:1: rule__Link__Group_6__0__Impl : ( 'collision' ) ;
    public final void rule__Link__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4638:1: ( ( 'collision' ) )
            // InternalXacro.g:4639:1: ( 'collision' )
            {
            // InternalXacro.g:4639:1: ( 'collision' )
            // InternalXacro.g:4640:2: 'collision'
            {
             before(grammarAccess.getLinkAccess().getCollisionKeyword_6_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getCollisionKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_6__0__Impl"


    // $ANTLR start "rule__Link__Group_6__1"
    // InternalXacro.g:4649:1: rule__Link__Group_6__1 : rule__Link__Group_6__1__Impl ;
    public final void rule__Link__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4653:1: ( rule__Link__Group_6__1__Impl )
            // InternalXacro.g:4654:2: rule__Link__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_6__1"


    // $ANTLR start "rule__Link__Group_6__1__Impl"
    // InternalXacro.g:4660:1: rule__Link__Group_6__1__Impl : ( ( rule__Link__CollisionAssignment_6_1 ) ) ;
    public final void rule__Link__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4664:1: ( ( ( rule__Link__CollisionAssignment_6_1 ) ) )
            // InternalXacro.g:4665:1: ( ( rule__Link__CollisionAssignment_6_1 ) )
            {
            // InternalXacro.g:4665:1: ( ( rule__Link__CollisionAssignment_6_1 ) )
            // InternalXacro.g:4666:2: ( rule__Link__CollisionAssignment_6_1 )
            {
             before(grammarAccess.getLinkAccess().getCollisionAssignment_6_1()); 
            // InternalXacro.g:4667:2: ( rule__Link__CollisionAssignment_6_1 )
            // InternalXacro.g:4667:3: rule__Link__CollisionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__CollisionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getCollisionAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_6__1__Impl"


    // $ANTLR start "rule__Pose__Group__0"
    // InternalXacro.g:4676:1: rule__Pose__Group__0 : rule__Pose__Group__0__Impl rule__Pose__Group__1 ;
    public final void rule__Pose__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4680:1: ( rule__Pose__Group__0__Impl rule__Pose__Group__1 )
            // InternalXacro.g:4681:2: rule__Pose__Group__0__Impl rule__Pose__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalXacro.g:4688:1: rule__Pose__Group__0__Impl : ( () ) ;
    public final void rule__Pose__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4692:1: ( ( () ) )
            // InternalXacro.g:4693:1: ( () )
            {
            // InternalXacro.g:4693:1: ( () )
            // InternalXacro.g:4694:2: ()
            {
             before(grammarAccess.getPoseAccess().getPoseAction_0()); 
            // InternalXacro.g:4695:2: ()
            // InternalXacro.g:4695:3: 
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
    // InternalXacro.g:4703:1: rule__Pose__Group__1 : rule__Pose__Group__1__Impl rule__Pose__Group__2 ;
    public final void rule__Pose__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4707:1: ( rule__Pose__Group__1__Impl rule__Pose__Group__2 )
            // InternalXacro.g:4708:2: rule__Pose__Group__1__Impl rule__Pose__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalXacro.g:4715:1: rule__Pose__Group__1__Impl : ( 'Pose' ) ;
    public final void rule__Pose__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4719:1: ( ( 'Pose' ) )
            // InternalXacro.g:4720:1: ( 'Pose' )
            {
            // InternalXacro.g:4720:1: ( 'Pose' )
            // InternalXacro.g:4721:2: 'Pose'
            {
             before(grammarAccess.getPoseAccess().getPoseKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getPoseKeyword_1()); 

            }


            }

        }
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
    // InternalXacro.g:4730:1: rule__Pose__Group__2 : rule__Pose__Group__2__Impl rule__Pose__Group__3 ;
    public final void rule__Pose__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4734:1: ( rule__Pose__Group__2__Impl rule__Pose__Group__3 )
            // InternalXacro.g:4735:2: rule__Pose__Group__2__Impl rule__Pose__Group__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalXacro.g:4742:1: rule__Pose__Group__2__Impl : ( '{' ) ;
    public final void rule__Pose__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4746:1: ( ( '{' ) )
            // InternalXacro.g:4747:1: ( '{' )
            {
            // InternalXacro.g:4747:1: ( '{' )
            // InternalXacro.g:4748:2: '{'
            {
             before(grammarAccess.getPoseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalXacro.g:4757:1: rule__Pose__Group__3 : rule__Pose__Group__3__Impl rule__Pose__Group__4 ;
    public final void rule__Pose__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4761:1: ( rule__Pose__Group__3__Impl rule__Pose__Group__4 )
            // InternalXacro.g:4762:2: rule__Pose__Group__3__Impl rule__Pose__Group__4
            {
            pushFollow(FOLLOW_44);
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
    // InternalXacro.g:4769:1: rule__Pose__Group__3__Impl : ( ( rule__Pose__Group_3__0 )? ) ;
    public final void rule__Pose__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4773:1: ( ( ( rule__Pose__Group_3__0 )? ) )
            // InternalXacro.g:4774:1: ( ( rule__Pose__Group_3__0 )? )
            {
            // InternalXacro.g:4774:1: ( ( rule__Pose__Group_3__0 )? )
            // InternalXacro.g:4775:2: ( rule__Pose__Group_3__0 )?
            {
             before(grammarAccess.getPoseAccess().getGroup_3()); 
            // InternalXacro.g:4776:2: ( rule__Pose__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==48) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalXacro.g:4776:3: rule__Pose__Group_3__0
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
    // InternalXacro.g:4784:1: rule__Pose__Group__4 : rule__Pose__Group__4__Impl rule__Pose__Group__5 ;
    public final void rule__Pose__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4788:1: ( rule__Pose__Group__4__Impl rule__Pose__Group__5 )
            // InternalXacro.g:4789:2: rule__Pose__Group__4__Impl rule__Pose__Group__5
            {
            pushFollow(FOLLOW_44);
            rule__Pose__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group__5();

            state._fsp--;


            }

        }
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
    // InternalXacro.g:4796:1: rule__Pose__Group__4__Impl : ( ( rule__Pose__Group_4__0 )? ) ;
    public final void rule__Pose__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4800:1: ( ( ( rule__Pose__Group_4__0 )? ) )
            // InternalXacro.g:4801:1: ( ( rule__Pose__Group_4__0 )? )
            {
            // InternalXacro.g:4801:1: ( ( rule__Pose__Group_4__0 )? )
            // InternalXacro.g:4802:2: ( rule__Pose__Group_4__0 )?
            {
             before(grammarAccess.getPoseAccess().getGroup_4()); 
            // InternalXacro.g:4803:2: ( rule__Pose__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==49) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalXacro.g:4803:3: rule__Pose__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pose__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPoseAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Pose__Group__5"
    // InternalXacro.g:4811:1: rule__Pose__Group__5 : rule__Pose__Group__5__Impl ;
    public final void rule__Pose__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4815:1: ( rule__Pose__Group__5__Impl )
            // InternalXacro.g:4816:2: rule__Pose__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pose__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group__5"


    // $ANTLR start "rule__Pose__Group__5__Impl"
    // InternalXacro.g:4822:1: rule__Pose__Group__5__Impl : ( '}' ) ;
    public final void rule__Pose__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4826:1: ( ( '}' ) )
            // InternalXacro.g:4827:1: ( '}' )
            {
            // InternalXacro.g:4827:1: ( '}' )
            // InternalXacro.g:4828:2: '}'
            {
             before(grammarAccess.getPoseAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group__5__Impl"


    // $ANTLR start "rule__Pose__Group_3__0"
    // InternalXacro.g:4838:1: rule__Pose__Group_3__0 : rule__Pose__Group_3__0__Impl rule__Pose__Group_3__1 ;
    public final void rule__Pose__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4842:1: ( rule__Pose__Group_3__0__Impl rule__Pose__Group_3__1 )
            // InternalXacro.g:4843:2: rule__Pose__Group_3__0__Impl rule__Pose__Group_3__1
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
    // InternalXacro.g:4850:1: rule__Pose__Group_3__0__Impl : ( 'rpy' ) ;
    public final void rule__Pose__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4854:1: ( ( 'rpy' ) )
            // InternalXacro.g:4855:1: ( 'rpy' )
            {
            // InternalXacro.g:4855:1: ( 'rpy' )
            // InternalXacro.g:4856:2: 'rpy'
            {
             before(grammarAccess.getPoseAccess().getRpyKeyword_3_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getRpyKeyword_3_0()); 

            }


            }

        }
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
    // InternalXacro.g:4865:1: rule__Pose__Group_3__1 : rule__Pose__Group_3__1__Impl ;
    public final void rule__Pose__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4869:1: ( rule__Pose__Group_3__1__Impl )
            // InternalXacro.g:4870:2: rule__Pose__Group_3__1__Impl
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
    // InternalXacro.g:4876:1: rule__Pose__Group_3__1__Impl : ( ( rule__Pose__RpyAssignment_3_1 ) ) ;
    public final void rule__Pose__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4880:1: ( ( ( rule__Pose__RpyAssignment_3_1 ) ) )
            // InternalXacro.g:4881:1: ( ( rule__Pose__RpyAssignment_3_1 ) )
            {
            // InternalXacro.g:4881:1: ( ( rule__Pose__RpyAssignment_3_1 ) )
            // InternalXacro.g:4882:2: ( rule__Pose__RpyAssignment_3_1 )
            {
             before(grammarAccess.getPoseAccess().getRpyAssignment_3_1()); 
            // InternalXacro.g:4883:2: ( rule__Pose__RpyAssignment_3_1 )
            // InternalXacro.g:4883:3: rule__Pose__RpyAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Pose__RpyAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPoseAccess().getRpyAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Pose__Group_4__0"
    // InternalXacro.g:4892:1: rule__Pose__Group_4__0 : rule__Pose__Group_4__0__Impl rule__Pose__Group_4__1 ;
    public final void rule__Pose__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4896:1: ( rule__Pose__Group_4__0__Impl rule__Pose__Group_4__1 )
            // InternalXacro.g:4897:2: rule__Pose__Group_4__0__Impl rule__Pose__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Pose__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_4__0"


    // $ANTLR start "rule__Pose__Group_4__0__Impl"
    // InternalXacro.g:4904:1: rule__Pose__Group_4__0__Impl : ( 'xyz' ) ;
    public final void rule__Pose__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4908:1: ( ( 'xyz' ) )
            // InternalXacro.g:4909:1: ( 'xyz' )
            {
            // InternalXacro.g:4909:1: ( 'xyz' )
            // InternalXacro.g:4910:2: 'xyz'
            {
             before(grammarAccess.getPoseAccess().getXyzKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getXyzKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_4__0__Impl"


    // $ANTLR start "rule__Pose__Group_4__1"
    // InternalXacro.g:4919:1: rule__Pose__Group_4__1 : rule__Pose__Group_4__1__Impl ;
    public final void rule__Pose__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4923:1: ( rule__Pose__Group_4__1__Impl )
            // InternalXacro.g:4924:2: rule__Pose__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pose__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_4__1"


    // $ANTLR start "rule__Pose__Group_4__1__Impl"
    // InternalXacro.g:4930:1: rule__Pose__Group_4__1__Impl : ( ( rule__Pose__XyzAssignment_4_1 ) ) ;
    public final void rule__Pose__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4934:1: ( ( ( rule__Pose__XyzAssignment_4_1 ) ) )
            // InternalXacro.g:4935:1: ( ( rule__Pose__XyzAssignment_4_1 ) )
            {
            // InternalXacro.g:4935:1: ( ( rule__Pose__XyzAssignment_4_1 ) )
            // InternalXacro.g:4936:2: ( rule__Pose__XyzAssignment_4_1 )
            {
             before(grammarAccess.getPoseAccess().getXyzAssignment_4_1()); 
            // InternalXacro.g:4937:2: ( rule__Pose__XyzAssignment_4_1 )
            // InternalXacro.g:4937:3: rule__Pose__XyzAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Pose__XyzAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPoseAccess().getXyzAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_4__1__Impl"


    // $ANTLR start "rule__Vector3__Group__0"
    // InternalXacro.g:4946:1: rule__Vector3__Group__0 : rule__Vector3__Group__0__Impl rule__Vector3__Group__1 ;
    public final void rule__Vector3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4950:1: ( rule__Vector3__Group__0__Impl rule__Vector3__Group__1 )
            // InternalXacro.g:4951:2: rule__Vector3__Group__0__Impl rule__Vector3__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalXacro.g:4958:1: rule__Vector3__Group__0__Impl : ( () ) ;
    public final void rule__Vector3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4962:1: ( ( () ) )
            // InternalXacro.g:4963:1: ( () )
            {
            // InternalXacro.g:4963:1: ( () )
            // InternalXacro.g:4964:2: ()
            {
             before(grammarAccess.getVector3Access().getVector3Action_0()); 
            // InternalXacro.g:4965:2: ()
            // InternalXacro.g:4965:3: 
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
    // InternalXacro.g:4973:1: rule__Vector3__Group__1 : rule__Vector3__Group__1__Impl rule__Vector3__Group__2 ;
    public final void rule__Vector3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4977:1: ( rule__Vector3__Group__1__Impl rule__Vector3__Group__2 )
            // InternalXacro.g:4978:2: rule__Vector3__Group__1__Impl rule__Vector3__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalXacro.g:4985:1: rule__Vector3__Group__1__Impl : ( 'Vector3' ) ;
    public final void rule__Vector3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:4989:1: ( ( 'Vector3' ) )
            // InternalXacro.g:4990:1: ( 'Vector3' )
            {
            // InternalXacro.g:4990:1: ( 'Vector3' )
            // InternalXacro.g:4991:2: 'Vector3'
            {
             before(grammarAccess.getVector3Access().getVector3Keyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getVector3Access().getVector3Keyword_1()); 

            }


            }

        }
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
    // InternalXacro.g:5000:1: rule__Vector3__Group__2 : rule__Vector3__Group__2__Impl rule__Vector3__Group__3 ;
    public final void rule__Vector3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5004:1: ( rule__Vector3__Group__2__Impl rule__Vector3__Group__3 )
            // InternalXacro.g:5005:2: rule__Vector3__Group__2__Impl rule__Vector3__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalXacro.g:5012:1: rule__Vector3__Group__2__Impl : ( '{' ) ;
    public final void rule__Vector3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5016:1: ( ( '{' ) )
            // InternalXacro.g:5017:1: ( '{' )
            {
            // InternalXacro.g:5017:1: ( '{' )
            // InternalXacro.g:5018:2: '{'
            {
             before(grammarAccess.getVector3Access().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVector3Access().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalXacro.g:5027:1: rule__Vector3__Group__3 : rule__Vector3__Group__3__Impl rule__Vector3__Group__4 ;
    public final void rule__Vector3__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5031:1: ( rule__Vector3__Group__3__Impl rule__Vector3__Group__4 )
            // InternalXacro.g:5032:2: rule__Vector3__Group__3__Impl rule__Vector3__Group__4
            {
            pushFollow(FOLLOW_45);
            rule__Vector3__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vector3__Group__4();

            state._fsp--;


            }

        }
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
    // InternalXacro.g:5039:1: rule__Vector3__Group__3__Impl : ( ( rule__Vector3__Group_3__0 )? ) ;
    public final void rule__Vector3__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5043:1: ( ( ( rule__Vector3__Group_3__0 )? ) )
            // InternalXacro.g:5044:1: ( ( rule__Vector3__Group_3__0 )? )
            {
            // InternalXacro.g:5044:1: ( ( rule__Vector3__Group_3__0 )? )
            // InternalXacro.g:5045:2: ( rule__Vector3__Group_3__0 )?
            {
             before(grammarAccess.getVector3Access().getGroup_3()); 
            // InternalXacro.g:5046:2: ( rule__Vector3__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==49) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalXacro.g:5046:3: rule__Vector3__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Vector3__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVector3Access().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Vector3__Group__4"
    // InternalXacro.g:5054:1: rule__Vector3__Group__4 : rule__Vector3__Group__4__Impl ;
    public final void rule__Vector3__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5058:1: ( rule__Vector3__Group__4__Impl )
            // InternalXacro.g:5059:2: rule__Vector3__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vector3__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector3__Group__4"


    // $ANTLR start "rule__Vector3__Group__4__Impl"
    // InternalXacro.g:5065:1: rule__Vector3__Group__4__Impl : ( '}' ) ;
    public final void rule__Vector3__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5069:1: ( ( '}' ) )
            // InternalXacro.g:5070:1: ( '}' )
            {
            // InternalXacro.g:5070:1: ( '}' )
            // InternalXacro.g:5071:2: '}'
            {
             before(grammarAccess.getVector3Access().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVector3Access().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector3__Group__4__Impl"


    // $ANTLR start "rule__Vector3__Group_3__0"
    // InternalXacro.g:5081:1: rule__Vector3__Group_3__0 : rule__Vector3__Group_3__0__Impl rule__Vector3__Group_3__1 ;
    public final void rule__Vector3__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5085:1: ( rule__Vector3__Group_3__0__Impl rule__Vector3__Group_3__1 )
            // InternalXacro.g:5086:2: rule__Vector3__Group_3__0__Impl rule__Vector3__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Vector3__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vector3__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector3__Group_3__0"


    // $ANTLR start "rule__Vector3__Group_3__0__Impl"
    // InternalXacro.g:5093:1: rule__Vector3__Group_3__0__Impl : ( 'xyz' ) ;
    public final void rule__Vector3__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5097:1: ( ( 'xyz' ) )
            // InternalXacro.g:5098:1: ( 'xyz' )
            {
            // InternalXacro.g:5098:1: ( 'xyz' )
            // InternalXacro.g:5099:2: 'xyz'
            {
             before(grammarAccess.getVector3Access().getXyzKeyword_3_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getVector3Access().getXyzKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector3__Group_3__0__Impl"


    // $ANTLR start "rule__Vector3__Group_3__1"
    // InternalXacro.g:5108:1: rule__Vector3__Group_3__1 : rule__Vector3__Group_3__1__Impl ;
    public final void rule__Vector3__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5112:1: ( rule__Vector3__Group_3__1__Impl )
            // InternalXacro.g:5113:2: rule__Vector3__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vector3__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector3__Group_3__1"


    // $ANTLR start "rule__Vector3__Group_3__1__Impl"
    // InternalXacro.g:5119:1: rule__Vector3__Group_3__1__Impl : ( ( rule__Vector3__XyzAssignment_3_1 ) ) ;
    public final void rule__Vector3__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5123:1: ( ( ( rule__Vector3__XyzAssignment_3_1 ) ) )
            // InternalXacro.g:5124:1: ( ( rule__Vector3__XyzAssignment_3_1 ) )
            {
            // InternalXacro.g:5124:1: ( ( rule__Vector3__XyzAssignment_3_1 ) )
            // InternalXacro.g:5125:2: ( rule__Vector3__XyzAssignment_3_1 )
            {
             before(grammarAccess.getVector3Access().getXyzAssignment_3_1()); 
            // InternalXacro.g:5126:2: ( rule__Vector3__XyzAssignment_3_1 )
            // InternalXacro.g:5126:3: rule__Vector3__XyzAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Vector3__XyzAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVector3Access().getXyzAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector3__Group_3__1__Impl"


    // $ANTLR start "rule__Limit__Group__0"
    // InternalXacro.g:5135:1: rule__Limit__Group__0 : rule__Limit__Group__0__Impl rule__Limit__Group__1 ;
    public final void rule__Limit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5139:1: ( rule__Limit__Group__0__Impl rule__Limit__Group__1 )
            // InternalXacro.g:5140:2: rule__Limit__Group__0__Impl rule__Limit__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalXacro.g:5147:1: rule__Limit__Group__0__Impl : ( () ) ;
    public final void rule__Limit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5151:1: ( ( () ) )
            // InternalXacro.g:5152:1: ( () )
            {
            // InternalXacro.g:5152:1: ( () )
            // InternalXacro.g:5153:2: ()
            {
             before(grammarAccess.getLimitAccess().getLimitAction_0()); 
            // InternalXacro.g:5154:2: ()
            // InternalXacro.g:5154:3: 
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
    // InternalXacro.g:5162:1: rule__Limit__Group__1 : rule__Limit__Group__1__Impl rule__Limit__Group__2 ;
    public final void rule__Limit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5166:1: ( rule__Limit__Group__1__Impl rule__Limit__Group__2 )
            // InternalXacro.g:5167:2: rule__Limit__Group__1__Impl rule__Limit__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalXacro.g:5174:1: rule__Limit__Group__1__Impl : ( 'Limit' ) ;
    public final void rule__Limit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5178:1: ( ( 'Limit' ) )
            // InternalXacro.g:5179:1: ( 'Limit' )
            {
            // InternalXacro.g:5179:1: ( 'Limit' )
            // InternalXacro.g:5180:2: 'Limit'
            {
             before(grammarAccess.getLimitAccess().getLimitKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getLimitKeyword_1()); 

            }


            }

        }
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
    // InternalXacro.g:5189:1: rule__Limit__Group__2 : rule__Limit__Group__2__Impl rule__Limit__Group__3 ;
    public final void rule__Limit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5193:1: ( rule__Limit__Group__2__Impl rule__Limit__Group__3 )
            // InternalXacro.g:5194:2: rule__Limit__Group__2__Impl rule__Limit__Group__3
            {
            pushFollow(FOLLOW_46);
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
    // InternalXacro.g:5201:1: rule__Limit__Group__2__Impl : ( '{' ) ;
    public final void rule__Limit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5205:1: ( ( '{' ) )
            // InternalXacro.g:5206:1: ( '{' )
            {
            // InternalXacro.g:5206:1: ( '{' )
            // InternalXacro.g:5207:2: '{'
            {
             before(grammarAccess.getLimitAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalXacro.g:5216:1: rule__Limit__Group__3 : rule__Limit__Group__3__Impl rule__Limit__Group__4 ;
    public final void rule__Limit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5220:1: ( rule__Limit__Group__3__Impl rule__Limit__Group__4 )
            // InternalXacro.g:5221:2: rule__Limit__Group__3__Impl rule__Limit__Group__4
            {
            pushFollow(FOLLOW_46);
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
    // InternalXacro.g:5228:1: rule__Limit__Group__3__Impl : ( ( rule__Limit__Group_3__0 )? ) ;
    public final void rule__Limit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5232:1: ( ( ( rule__Limit__Group_3__0 )? ) )
            // InternalXacro.g:5233:1: ( ( rule__Limit__Group_3__0 )? )
            {
            // InternalXacro.g:5233:1: ( ( rule__Limit__Group_3__0 )? )
            // InternalXacro.g:5234:2: ( rule__Limit__Group_3__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_3()); 
            // InternalXacro.g:5235:2: ( rule__Limit__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==52) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalXacro.g:5235:3: rule__Limit__Group_3__0
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
    // InternalXacro.g:5243:1: rule__Limit__Group__4 : rule__Limit__Group__4__Impl rule__Limit__Group__5 ;
    public final void rule__Limit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5247:1: ( rule__Limit__Group__4__Impl rule__Limit__Group__5 )
            // InternalXacro.g:5248:2: rule__Limit__Group__4__Impl rule__Limit__Group__5
            {
            pushFollow(FOLLOW_46);
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
    // InternalXacro.g:5255:1: rule__Limit__Group__4__Impl : ( ( rule__Limit__Group_4__0 )? ) ;
    public final void rule__Limit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5259:1: ( ( ( rule__Limit__Group_4__0 )? ) )
            // InternalXacro.g:5260:1: ( ( rule__Limit__Group_4__0 )? )
            {
            // InternalXacro.g:5260:1: ( ( rule__Limit__Group_4__0 )? )
            // InternalXacro.g:5261:2: ( rule__Limit__Group_4__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_4()); 
            // InternalXacro.g:5262:2: ( rule__Limit__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==53) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalXacro.g:5262:3: rule__Limit__Group_4__0
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
    // InternalXacro.g:5270:1: rule__Limit__Group__5 : rule__Limit__Group__5__Impl rule__Limit__Group__6 ;
    public final void rule__Limit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5274:1: ( rule__Limit__Group__5__Impl rule__Limit__Group__6 )
            // InternalXacro.g:5275:2: rule__Limit__Group__5__Impl rule__Limit__Group__6
            {
            pushFollow(FOLLOW_46);
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
    // InternalXacro.g:5282:1: rule__Limit__Group__5__Impl : ( ( rule__Limit__Group_5__0 )? ) ;
    public final void rule__Limit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5286:1: ( ( ( rule__Limit__Group_5__0 )? ) )
            // InternalXacro.g:5287:1: ( ( rule__Limit__Group_5__0 )? )
            {
            // InternalXacro.g:5287:1: ( ( rule__Limit__Group_5__0 )? )
            // InternalXacro.g:5288:2: ( rule__Limit__Group_5__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_5()); 
            // InternalXacro.g:5289:2: ( rule__Limit__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==54) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalXacro.g:5289:3: rule__Limit__Group_5__0
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
    // InternalXacro.g:5297:1: rule__Limit__Group__6 : rule__Limit__Group__6__Impl rule__Limit__Group__7 ;
    public final void rule__Limit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5301:1: ( rule__Limit__Group__6__Impl rule__Limit__Group__7 )
            // InternalXacro.g:5302:2: rule__Limit__Group__6__Impl rule__Limit__Group__7
            {
            pushFollow(FOLLOW_46);
            rule__Limit__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__7();

            state._fsp--;


            }

        }
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
    // InternalXacro.g:5309:1: rule__Limit__Group__6__Impl : ( ( rule__Limit__Group_6__0 )? ) ;
    public final void rule__Limit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5313:1: ( ( ( rule__Limit__Group_6__0 )? ) )
            // InternalXacro.g:5314:1: ( ( rule__Limit__Group_6__0 )? )
            {
            // InternalXacro.g:5314:1: ( ( rule__Limit__Group_6__0 )? )
            // InternalXacro.g:5315:2: ( rule__Limit__Group_6__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_6()); 
            // InternalXacro.g:5316:2: ( rule__Limit__Group_6__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==55) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalXacro.g:5316:3: rule__Limit__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limit__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitAccess().getGroup_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Limit__Group__7"
    // InternalXacro.g:5324:1: rule__Limit__Group__7 : rule__Limit__Group__7__Impl ;
    public final void rule__Limit__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5328:1: ( rule__Limit__Group__7__Impl )
            // InternalXacro.g:5329:2: rule__Limit__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__7"


    // $ANTLR start "rule__Limit__Group__7__Impl"
    // InternalXacro.g:5335:1: rule__Limit__Group__7__Impl : ( '}' ) ;
    public final void rule__Limit__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5339:1: ( ( '}' ) )
            // InternalXacro.g:5340:1: ( '}' )
            {
            // InternalXacro.g:5340:1: ( '}' )
            // InternalXacro.g:5341:2: '}'
            {
             before(grammarAccess.getLimitAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__7__Impl"


    // $ANTLR start "rule__Limit__Group_3__0"
    // InternalXacro.g:5351:1: rule__Limit__Group_3__0 : rule__Limit__Group_3__0__Impl rule__Limit__Group_3__1 ;
    public final void rule__Limit__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5355:1: ( rule__Limit__Group_3__0__Impl rule__Limit__Group_3__1 )
            // InternalXacro.g:5356:2: rule__Limit__Group_3__0__Impl rule__Limit__Group_3__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalXacro.g:5363:1: rule__Limit__Group_3__0__Impl : ( 'effort' ) ;
    public final void rule__Limit__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5367:1: ( ( 'effort' ) )
            // InternalXacro.g:5368:1: ( 'effort' )
            {
            // InternalXacro.g:5368:1: ( 'effort' )
            // InternalXacro.g:5369:2: 'effort'
            {
             before(grammarAccess.getLimitAccess().getEffortKeyword_3_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getEffortKeyword_3_0()); 

            }


            }

        }
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
    // InternalXacro.g:5378:1: rule__Limit__Group_3__1 : rule__Limit__Group_3__1__Impl ;
    public final void rule__Limit__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5382:1: ( rule__Limit__Group_3__1__Impl )
            // InternalXacro.g:5383:2: rule__Limit__Group_3__1__Impl
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
    // InternalXacro.g:5389:1: rule__Limit__Group_3__1__Impl : ( ( rule__Limit__EffortAssignment_3_1 ) ) ;
    public final void rule__Limit__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5393:1: ( ( ( rule__Limit__EffortAssignment_3_1 ) ) )
            // InternalXacro.g:5394:1: ( ( rule__Limit__EffortAssignment_3_1 ) )
            {
            // InternalXacro.g:5394:1: ( ( rule__Limit__EffortAssignment_3_1 ) )
            // InternalXacro.g:5395:2: ( rule__Limit__EffortAssignment_3_1 )
            {
             before(grammarAccess.getLimitAccess().getEffortAssignment_3_1()); 
            // InternalXacro.g:5396:2: ( rule__Limit__EffortAssignment_3_1 )
            // InternalXacro.g:5396:3: rule__Limit__EffortAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Limit__EffortAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getEffortAssignment_3_1()); 

            }


            }

        }
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
    // InternalXacro.g:5405:1: rule__Limit__Group_4__0 : rule__Limit__Group_4__0__Impl rule__Limit__Group_4__1 ;
    public final void rule__Limit__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5409:1: ( rule__Limit__Group_4__0__Impl rule__Limit__Group_4__1 )
            // InternalXacro.g:5410:2: rule__Limit__Group_4__0__Impl rule__Limit__Group_4__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalXacro.g:5417:1: rule__Limit__Group_4__0__Impl : ( 'lower' ) ;
    public final void rule__Limit__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5421:1: ( ( 'lower' ) )
            // InternalXacro.g:5422:1: ( 'lower' )
            {
            // InternalXacro.g:5422:1: ( 'lower' )
            // InternalXacro.g:5423:2: 'lower'
            {
             before(grammarAccess.getLimitAccess().getLowerKeyword_4_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getLowerKeyword_4_0()); 

            }


            }

        }
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
    // InternalXacro.g:5432:1: rule__Limit__Group_4__1 : rule__Limit__Group_4__1__Impl ;
    public final void rule__Limit__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5436:1: ( rule__Limit__Group_4__1__Impl )
            // InternalXacro.g:5437:2: rule__Limit__Group_4__1__Impl
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
    // InternalXacro.g:5443:1: rule__Limit__Group_4__1__Impl : ( ( rule__Limit__LowerAssignment_4_1 ) ) ;
    public final void rule__Limit__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5447:1: ( ( ( rule__Limit__LowerAssignment_4_1 ) ) )
            // InternalXacro.g:5448:1: ( ( rule__Limit__LowerAssignment_4_1 ) )
            {
            // InternalXacro.g:5448:1: ( ( rule__Limit__LowerAssignment_4_1 ) )
            // InternalXacro.g:5449:2: ( rule__Limit__LowerAssignment_4_1 )
            {
             before(grammarAccess.getLimitAccess().getLowerAssignment_4_1()); 
            // InternalXacro.g:5450:2: ( rule__Limit__LowerAssignment_4_1 )
            // InternalXacro.g:5450:3: rule__Limit__LowerAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Limit__LowerAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getLowerAssignment_4_1()); 

            }


            }

        }
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
    // InternalXacro.g:5459:1: rule__Limit__Group_5__0 : rule__Limit__Group_5__0__Impl rule__Limit__Group_5__1 ;
    public final void rule__Limit__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5463:1: ( rule__Limit__Group_5__0__Impl rule__Limit__Group_5__1 )
            // InternalXacro.g:5464:2: rule__Limit__Group_5__0__Impl rule__Limit__Group_5__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalXacro.g:5471:1: rule__Limit__Group_5__0__Impl : ( 'upper' ) ;
    public final void rule__Limit__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5475:1: ( ( 'upper' ) )
            // InternalXacro.g:5476:1: ( 'upper' )
            {
            // InternalXacro.g:5476:1: ( 'upper' )
            // InternalXacro.g:5477:2: 'upper'
            {
             before(grammarAccess.getLimitAccess().getUpperKeyword_5_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getUpperKeyword_5_0()); 

            }


            }

        }
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
    // InternalXacro.g:5486:1: rule__Limit__Group_5__1 : rule__Limit__Group_5__1__Impl ;
    public final void rule__Limit__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5490:1: ( rule__Limit__Group_5__1__Impl )
            // InternalXacro.g:5491:2: rule__Limit__Group_5__1__Impl
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
    // InternalXacro.g:5497:1: rule__Limit__Group_5__1__Impl : ( ( rule__Limit__UpperAssignment_5_1 ) ) ;
    public final void rule__Limit__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5501:1: ( ( ( rule__Limit__UpperAssignment_5_1 ) ) )
            // InternalXacro.g:5502:1: ( ( rule__Limit__UpperAssignment_5_1 ) )
            {
            // InternalXacro.g:5502:1: ( ( rule__Limit__UpperAssignment_5_1 ) )
            // InternalXacro.g:5503:2: ( rule__Limit__UpperAssignment_5_1 )
            {
             before(grammarAccess.getLimitAccess().getUpperAssignment_5_1()); 
            // InternalXacro.g:5504:2: ( rule__Limit__UpperAssignment_5_1 )
            // InternalXacro.g:5504:3: rule__Limit__UpperAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Limit__UpperAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getUpperAssignment_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Limit__Group_6__0"
    // InternalXacro.g:5513:1: rule__Limit__Group_6__0 : rule__Limit__Group_6__0__Impl rule__Limit__Group_6__1 ;
    public final void rule__Limit__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5517:1: ( rule__Limit__Group_6__0__Impl rule__Limit__Group_6__1 )
            // InternalXacro.g:5518:2: rule__Limit__Group_6__0__Impl rule__Limit__Group_6__1
            {
            pushFollow(FOLLOW_47);
            rule__Limit__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_6__0"


    // $ANTLR start "rule__Limit__Group_6__0__Impl"
    // InternalXacro.g:5525:1: rule__Limit__Group_6__0__Impl : ( 'velocity' ) ;
    public final void rule__Limit__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5529:1: ( ( 'velocity' ) )
            // InternalXacro.g:5530:1: ( 'velocity' )
            {
            // InternalXacro.g:5530:1: ( 'velocity' )
            // InternalXacro.g:5531:2: 'velocity'
            {
             before(grammarAccess.getLimitAccess().getVelocityKeyword_6_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getVelocityKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_6__0__Impl"


    // $ANTLR start "rule__Limit__Group_6__1"
    // InternalXacro.g:5540:1: rule__Limit__Group_6__1 : rule__Limit__Group_6__1__Impl ;
    public final void rule__Limit__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5544:1: ( rule__Limit__Group_6__1__Impl )
            // InternalXacro.g:5545:2: rule__Limit__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_6__1"


    // $ANTLR start "rule__Limit__Group_6__1__Impl"
    // InternalXacro.g:5551:1: rule__Limit__Group_6__1__Impl : ( ( rule__Limit__VelocityAssignment_6_1 ) ) ;
    public final void rule__Limit__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5555:1: ( ( ( rule__Limit__VelocityAssignment_6_1 ) ) )
            // InternalXacro.g:5556:1: ( ( rule__Limit__VelocityAssignment_6_1 ) )
            {
            // InternalXacro.g:5556:1: ( ( rule__Limit__VelocityAssignment_6_1 ) )
            // InternalXacro.g:5557:2: ( rule__Limit__VelocityAssignment_6_1 )
            {
             before(grammarAccess.getLimitAccess().getVelocityAssignment_6_1()); 
            // InternalXacro.g:5558:2: ( rule__Limit__VelocityAssignment_6_1 )
            // InternalXacro.g:5558:3: rule__Limit__VelocityAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Limit__VelocityAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getVelocityAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_6__1__Impl"


    // $ANTLR start "rule__Inertial__Group__0"
    // InternalXacro.g:5567:1: rule__Inertial__Group__0 : rule__Inertial__Group__0__Impl rule__Inertial__Group__1 ;
    public final void rule__Inertial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5571:1: ( rule__Inertial__Group__0__Impl rule__Inertial__Group__1 )
            // InternalXacro.g:5572:2: rule__Inertial__Group__0__Impl rule__Inertial__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalXacro.g:5579:1: rule__Inertial__Group__0__Impl : ( () ) ;
    public final void rule__Inertial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5583:1: ( ( () ) )
            // InternalXacro.g:5584:1: ( () )
            {
            // InternalXacro.g:5584:1: ( () )
            // InternalXacro.g:5585:2: ()
            {
             before(grammarAccess.getInertialAccess().getInertialAction_0()); 
            // InternalXacro.g:5586:2: ()
            // InternalXacro.g:5586:3: 
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
    // InternalXacro.g:5594:1: rule__Inertial__Group__1 : rule__Inertial__Group__1__Impl rule__Inertial__Group__2 ;
    public final void rule__Inertial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5598:1: ( rule__Inertial__Group__1__Impl rule__Inertial__Group__2 )
            // InternalXacro.g:5599:2: rule__Inertial__Group__1__Impl rule__Inertial__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalXacro.g:5606:1: rule__Inertial__Group__1__Impl : ( 'Inertial' ) ;
    public final void rule__Inertial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5610:1: ( ( 'Inertial' ) )
            // InternalXacro.g:5611:1: ( 'Inertial' )
            {
            // InternalXacro.g:5611:1: ( 'Inertial' )
            // InternalXacro.g:5612:2: 'Inertial'
            {
             before(grammarAccess.getInertialAccess().getInertialKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getInertialAccess().getInertialKeyword_1()); 

            }


            }

        }
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
    // InternalXacro.g:5621:1: rule__Inertial__Group__2 : rule__Inertial__Group__2__Impl rule__Inertial__Group__3 ;
    public final void rule__Inertial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5625:1: ( rule__Inertial__Group__2__Impl rule__Inertial__Group__3 )
            // InternalXacro.g:5626:2: rule__Inertial__Group__2__Impl rule__Inertial__Group__3
            {
            pushFollow(FOLLOW_48);
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
    // InternalXacro.g:5633:1: rule__Inertial__Group__2__Impl : ( '{' ) ;
    public final void rule__Inertial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5637:1: ( ( '{' ) )
            // InternalXacro.g:5638:1: ( '{' )
            {
            // InternalXacro.g:5638:1: ( '{' )
            // InternalXacro.g:5639:2: '{'
            {
             before(grammarAccess.getInertialAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getInertialAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalXacro.g:5648:1: rule__Inertial__Group__3 : rule__Inertial__Group__3__Impl rule__Inertial__Group__4 ;
    public final void rule__Inertial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5652:1: ( rule__Inertial__Group__3__Impl rule__Inertial__Group__4 )
            // InternalXacro.g:5653:2: rule__Inertial__Group__3__Impl rule__Inertial__Group__4
            {
            pushFollow(FOLLOW_48);
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
    // InternalXacro.g:5660:1: rule__Inertial__Group__3__Impl : ( ( rule__Inertial__Group_3__0 )? ) ;
    public final void rule__Inertial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5664:1: ( ( ( rule__Inertial__Group_3__0 )? ) )
            // InternalXacro.g:5665:1: ( ( rule__Inertial__Group_3__0 )? )
            {
            // InternalXacro.g:5665:1: ( ( rule__Inertial__Group_3__0 )? )
            // InternalXacro.g:5666:2: ( rule__Inertial__Group_3__0 )?
            {
             before(grammarAccess.getInertialAccess().getGroup_3()); 
            // InternalXacro.g:5667:2: ( rule__Inertial__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==41) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalXacro.g:5667:3: rule__Inertial__Group_3__0
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
    // InternalXacro.g:5675:1: rule__Inertial__Group__4 : rule__Inertial__Group__4__Impl rule__Inertial__Group__5 ;
    public final void rule__Inertial__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5679:1: ( rule__Inertial__Group__4__Impl rule__Inertial__Group__5 )
            // InternalXacro.g:5680:2: rule__Inertial__Group__4__Impl rule__Inertial__Group__5
            {
            pushFollow(FOLLOW_48);
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
    // InternalXacro.g:5687:1: rule__Inertial__Group__4__Impl : ( ( rule__Inertial__Group_4__0 )? ) ;
    public final void rule__Inertial__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5691:1: ( ( ( rule__Inertial__Group_4__0 )? ) )
            // InternalXacro.g:5692:1: ( ( rule__Inertial__Group_4__0 )? )
            {
            // InternalXacro.g:5692:1: ( ( rule__Inertial__Group_4__0 )? )
            // InternalXacro.g:5693:2: ( rule__Inertial__Group_4__0 )?
            {
             before(grammarAccess.getInertialAccess().getGroup_4()); 
            // InternalXacro.g:5694:2: ( rule__Inertial__Group_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==57) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalXacro.g:5694:3: rule__Inertial__Group_4__0
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
    // InternalXacro.g:5702:1: rule__Inertial__Group__5 : rule__Inertial__Group__5__Impl rule__Inertial__Group__6 ;
    public final void rule__Inertial__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5706:1: ( rule__Inertial__Group__5__Impl rule__Inertial__Group__6 )
            // InternalXacro.g:5707:2: rule__Inertial__Group__5__Impl rule__Inertial__Group__6
            {
            pushFollow(FOLLOW_48);
            rule__Inertial__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group__6();

            state._fsp--;


            }

        }
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
    // InternalXacro.g:5714:1: rule__Inertial__Group__5__Impl : ( ( rule__Inertial__Group_5__0 )? ) ;
    public final void rule__Inertial__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5718:1: ( ( ( rule__Inertial__Group_5__0 )? ) )
            // InternalXacro.g:5719:1: ( ( rule__Inertial__Group_5__0 )? )
            {
            // InternalXacro.g:5719:1: ( ( rule__Inertial__Group_5__0 )? )
            // InternalXacro.g:5720:2: ( rule__Inertial__Group_5__0 )?
            {
             before(grammarAccess.getInertialAccess().getGroup_5()); 
            // InternalXacro.g:5721:2: ( rule__Inertial__Group_5__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==58) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalXacro.g:5721:3: rule__Inertial__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inertial__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInertialAccess().getGroup_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Inertial__Group__6"
    // InternalXacro.g:5729:1: rule__Inertial__Group__6 : rule__Inertial__Group__6__Impl ;
    public final void rule__Inertial__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5733:1: ( rule__Inertial__Group__6__Impl )
            // InternalXacro.g:5734:2: rule__Inertial__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__6"


    // $ANTLR start "rule__Inertial__Group__6__Impl"
    // InternalXacro.g:5740:1: rule__Inertial__Group__6__Impl : ( '}' ) ;
    public final void rule__Inertial__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5744:1: ( ( '}' ) )
            // InternalXacro.g:5745:1: ( '}' )
            {
            // InternalXacro.g:5745:1: ( '}' )
            // InternalXacro.g:5746:2: '}'
            {
             before(grammarAccess.getInertialAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInertialAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__6__Impl"


    // $ANTLR start "rule__Inertial__Group_3__0"
    // InternalXacro.g:5756:1: rule__Inertial__Group_3__0 : rule__Inertial__Group_3__0__Impl rule__Inertial__Group_3__1 ;
    public final void rule__Inertial__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5760:1: ( rule__Inertial__Group_3__0__Impl rule__Inertial__Group_3__1 )
            // InternalXacro.g:5761:2: rule__Inertial__Group_3__0__Impl rule__Inertial__Group_3__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalXacro.g:5768:1: rule__Inertial__Group_3__0__Impl : ( 'origin' ) ;
    public final void rule__Inertial__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5772:1: ( ( 'origin' ) )
            // InternalXacro.g:5773:1: ( 'origin' )
            {
            // InternalXacro.g:5773:1: ( 'origin' )
            // InternalXacro.g:5774:2: 'origin'
            {
             before(grammarAccess.getInertialAccess().getOriginKeyword_3_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getInertialAccess().getOriginKeyword_3_0()); 

            }


            }

        }
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
    // InternalXacro.g:5783:1: rule__Inertial__Group_3__1 : rule__Inertial__Group_3__1__Impl ;
    public final void rule__Inertial__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5787:1: ( rule__Inertial__Group_3__1__Impl )
            // InternalXacro.g:5788:2: rule__Inertial__Group_3__1__Impl
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
    // InternalXacro.g:5794:1: rule__Inertial__Group_3__1__Impl : ( ( rule__Inertial__OriginAssignment_3_1 ) ) ;
    public final void rule__Inertial__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5798:1: ( ( ( rule__Inertial__OriginAssignment_3_1 ) ) )
            // InternalXacro.g:5799:1: ( ( rule__Inertial__OriginAssignment_3_1 ) )
            {
            // InternalXacro.g:5799:1: ( ( rule__Inertial__OriginAssignment_3_1 ) )
            // InternalXacro.g:5800:2: ( rule__Inertial__OriginAssignment_3_1 )
            {
             before(grammarAccess.getInertialAccess().getOriginAssignment_3_1()); 
            // InternalXacro.g:5801:2: ( rule__Inertial__OriginAssignment_3_1 )
            // InternalXacro.g:5801:3: rule__Inertial__OriginAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__OriginAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getOriginAssignment_3_1()); 

            }


            }

        }
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
    // InternalXacro.g:5810:1: rule__Inertial__Group_4__0 : rule__Inertial__Group_4__0__Impl rule__Inertial__Group_4__1 ;
    public final void rule__Inertial__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5814:1: ( rule__Inertial__Group_4__0__Impl rule__Inertial__Group_4__1 )
            // InternalXacro.g:5815:2: rule__Inertial__Group_4__0__Impl rule__Inertial__Group_4__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalXacro.g:5822:1: rule__Inertial__Group_4__0__Impl : ( 'mass' ) ;
    public final void rule__Inertial__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5826:1: ( ( 'mass' ) )
            // InternalXacro.g:5827:1: ( 'mass' )
            {
            // InternalXacro.g:5827:1: ( 'mass' )
            // InternalXacro.g:5828:2: 'mass'
            {
             before(grammarAccess.getInertialAccess().getMassKeyword_4_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getInertialAccess().getMassKeyword_4_0()); 

            }


            }

        }
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
    // InternalXacro.g:5837:1: rule__Inertial__Group_4__1 : rule__Inertial__Group_4__1__Impl ;
    public final void rule__Inertial__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5841:1: ( rule__Inertial__Group_4__1__Impl )
            // InternalXacro.g:5842:2: rule__Inertial__Group_4__1__Impl
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
    // InternalXacro.g:5848:1: rule__Inertial__Group_4__1__Impl : ( ( rule__Inertial__MassAssignment_4_1 ) ) ;
    public final void rule__Inertial__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5852:1: ( ( ( rule__Inertial__MassAssignment_4_1 ) ) )
            // InternalXacro.g:5853:1: ( ( rule__Inertial__MassAssignment_4_1 ) )
            {
            // InternalXacro.g:5853:1: ( ( rule__Inertial__MassAssignment_4_1 ) )
            // InternalXacro.g:5854:2: ( rule__Inertial__MassAssignment_4_1 )
            {
             before(grammarAccess.getInertialAccess().getMassAssignment_4_1()); 
            // InternalXacro.g:5855:2: ( rule__Inertial__MassAssignment_4_1 )
            // InternalXacro.g:5855:3: rule__Inertial__MassAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__MassAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getMassAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Inertial__Group_5__0"
    // InternalXacro.g:5864:1: rule__Inertial__Group_5__0 : rule__Inertial__Group_5__0__Impl rule__Inertial__Group_5__1 ;
    public final void rule__Inertial__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5868:1: ( rule__Inertial__Group_5__0__Impl rule__Inertial__Group_5__1 )
            // InternalXacro.g:5869:2: rule__Inertial__Group_5__0__Impl rule__Inertial__Group_5__1
            {
            pushFollow(FOLLOW_50);
            rule__Inertial__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group_5__0"


    // $ANTLR start "rule__Inertial__Group_5__0__Impl"
    // InternalXacro.g:5876:1: rule__Inertial__Group_5__0__Impl : ( 'inertia' ) ;
    public final void rule__Inertial__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5880:1: ( ( 'inertia' ) )
            // InternalXacro.g:5881:1: ( 'inertia' )
            {
            // InternalXacro.g:5881:1: ( 'inertia' )
            // InternalXacro.g:5882:2: 'inertia'
            {
             before(grammarAccess.getInertialAccess().getInertiaKeyword_5_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getInertialAccess().getInertiaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group_5__0__Impl"


    // $ANTLR start "rule__Inertial__Group_5__1"
    // InternalXacro.g:5891:1: rule__Inertial__Group_5__1 : rule__Inertial__Group_5__1__Impl ;
    public final void rule__Inertial__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5895:1: ( rule__Inertial__Group_5__1__Impl )
            // InternalXacro.g:5896:2: rule__Inertial__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group_5__1"


    // $ANTLR start "rule__Inertial__Group_5__1__Impl"
    // InternalXacro.g:5902:1: rule__Inertial__Group_5__1__Impl : ( ( rule__Inertial__InertiaAssignment_5_1 ) ) ;
    public final void rule__Inertial__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5906:1: ( ( ( rule__Inertial__InertiaAssignment_5_1 ) ) )
            // InternalXacro.g:5907:1: ( ( rule__Inertial__InertiaAssignment_5_1 ) )
            {
            // InternalXacro.g:5907:1: ( ( rule__Inertial__InertiaAssignment_5_1 ) )
            // InternalXacro.g:5908:2: ( rule__Inertial__InertiaAssignment_5_1 )
            {
             before(grammarAccess.getInertialAccess().getInertiaAssignment_5_1()); 
            // InternalXacro.g:5909:2: ( rule__Inertial__InertiaAssignment_5_1 )
            // InternalXacro.g:5909:3: rule__Inertial__InertiaAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__InertiaAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getInertiaAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group_5__1__Impl"


    // $ANTLR start "rule__Visual__Group__0"
    // InternalXacro.g:5918:1: rule__Visual__Group__0 : rule__Visual__Group__0__Impl rule__Visual__Group__1 ;
    public final void rule__Visual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5922:1: ( rule__Visual__Group__0__Impl rule__Visual__Group__1 )
            // InternalXacro.g:5923:2: rule__Visual__Group__0__Impl rule__Visual__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalXacro.g:5930:1: rule__Visual__Group__0__Impl : ( 'Visual' ) ;
    public final void rule__Visual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5934:1: ( ( 'Visual' ) )
            // InternalXacro.g:5935:1: ( 'Visual' )
            {
            // InternalXacro.g:5935:1: ( 'Visual' )
            // InternalXacro.g:5936:2: 'Visual'
            {
             before(grammarAccess.getVisualAccess().getVisualKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getVisualKeyword_0()); 

            }


            }

        }
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
    // InternalXacro.g:5945:1: rule__Visual__Group__1 : rule__Visual__Group__1__Impl rule__Visual__Group__2 ;
    public final void rule__Visual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5949:1: ( rule__Visual__Group__1__Impl rule__Visual__Group__2 )
            // InternalXacro.g:5950:2: rule__Visual__Group__1__Impl rule__Visual__Group__2
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
    // InternalXacro.g:5957:1: rule__Visual__Group__1__Impl : ( '{' ) ;
    public final void rule__Visual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5961:1: ( ( '{' ) )
            // InternalXacro.g:5962:1: ( '{' )
            {
            // InternalXacro.g:5962:1: ( '{' )
            // InternalXacro.g:5963:2: '{'
            {
             before(grammarAccess.getVisualAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalXacro.g:5972:1: rule__Visual__Group__2 : rule__Visual__Group__2__Impl rule__Visual__Group__3 ;
    public final void rule__Visual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5976:1: ( rule__Visual__Group__2__Impl rule__Visual__Group__3 )
            // InternalXacro.g:5977:2: rule__Visual__Group__2__Impl rule__Visual__Group__3
            {
            pushFollow(FOLLOW_51);
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
    // InternalXacro.g:5984:1: rule__Visual__Group__2__Impl : ( ( rule__Visual__Group_2__0 )? ) ;
    public final void rule__Visual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:5988:1: ( ( ( rule__Visual__Group_2__0 )? ) )
            // InternalXacro.g:5989:1: ( ( rule__Visual__Group_2__0 )? )
            {
            // InternalXacro.g:5989:1: ( ( rule__Visual__Group_2__0 )? )
            // InternalXacro.g:5990:2: ( rule__Visual__Group_2__0 )?
            {
             before(grammarAccess.getVisualAccess().getGroup_2()); 
            // InternalXacro.g:5991:2: ( rule__Visual__Group_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==41) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalXacro.g:5991:3: rule__Visual__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Visual__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVisualAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalXacro.g:5999:1: rule__Visual__Group__3 : rule__Visual__Group__3__Impl rule__Visual__Group__4 ;
    public final void rule__Visual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6003:1: ( rule__Visual__Group__3__Impl rule__Visual__Group__4 )
            // InternalXacro.g:6004:2: rule__Visual__Group__3__Impl rule__Visual__Group__4
            {
            pushFollow(FOLLOW_52);
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
    // InternalXacro.g:6011:1: rule__Visual__Group__3__Impl : ( 'geometry' ) ;
    public final void rule__Visual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6015:1: ( ( 'geometry' ) )
            // InternalXacro.g:6016:1: ( 'geometry' )
            {
            // InternalXacro.g:6016:1: ( 'geometry' )
            // InternalXacro.g:6017:2: 'geometry'
            {
             before(grammarAccess.getVisualAccess().getGeometryKeyword_3()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getGeometryKeyword_3()); 

            }


            }

        }
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
    // InternalXacro.g:6026:1: rule__Visual__Group__4 : rule__Visual__Group__4__Impl rule__Visual__Group__5 ;
    public final void rule__Visual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6030:1: ( rule__Visual__Group__4__Impl rule__Visual__Group__5 )
            // InternalXacro.g:6031:2: rule__Visual__Group__4__Impl rule__Visual__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__Visual__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__5();

            state._fsp--;


            }

        }
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
    // InternalXacro.g:6038:1: rule__Visual__Group__4__Impl : ( ( rule__Visual__GeometryAssignment_4 ) ) ;
    public final void rule__Visual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6042:1: ( ( ( rule__Visual__GeometryAssignment_4 ) ) )
            // InternalXacro.g:6043:1: ( ( rule__Visual__GeometryAssignment_4 ) )
            {
            // InternalXacro.g:6043:1: ( ( rule__Visual__GeometryAssignment_4 ) )
            // InternalXacro.g:6044:2: ( rule__Visual__GeometryAssignment_4 )
            {
             before(grammarAccess.getVisualAccess().getGeometryAssignment_4()); 
            // InternalXacro.g:6045:2: ( rule__Visual__GeometryAssignment_4 )
            // InternalXacro.g:6045:3: rule__Visual__GeometryAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Visual__GeometryAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVisualAccess().getGeometryAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Visual__Group__5"
    // InternalXacro.g:6053:1: rule__Visual__Group__5 : rule__Visual__Group__5__Impl ;
    public final void rule__Visual__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6057:1: ( rule__Visual__Group__5__Impl )
            // InternalXacro.g:6058:2: rule__Visual__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Visual__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__5"


    // $ANTLR start "rule__Visual__Group__5__Impl"
    // InternalXacro.g:6064:1: rule__Visual__Group__5__Impl : ( '}' ) ;
    public final void rule__Visual__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6068:1: ( ( '}' ) )
            // InternalXacro.g:6069:1: ( '}' )
            {
            // InternalXacro.g:6069:1: ( '}' )
            // InternalXacro.g:6070:2: '}'
            {
             before(grammarAccess.getVisualAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__5__Impl"


    // $ANTLR start "rule__Visual__Group_2__0"
    // InternalXacro.g:6080:1: rule__Visual__Group_2__0 : rule__Visual__Group_2__0__Impl rule__Visual__Group_2__1 ;
    public final void rule__Visual__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6084:1: ( rule__Visual__Group_2__0__Impl rule__Visual__Group_2__1 )
            // InternalXacro.g:6085:2: rule__Visual__Group_2__0__Impl rule__Visual__Group_2__1
            {
            pushFollow(FOLLOW_43);
            rule__Visual__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group_2__0"


    // $ANTLR start "rule__Visual__Group_2__0__Impl"
    // InternalXacro.g:6092:1: rule__Visual__Group_2__0__Impl : ( 'origin' ) ;
    public final void rule__Visual__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6096:1: ( ( 'origin' ) )
            // InternalXacro.g:6097:1: ( 'origin' )
            {
            // InternalXacro.g:6097:1: ( 'origin' )
            // InternalXacro.g:6098:2: 'origin'
            {
             before(grammarAccess.getVisualAccess().getOriginKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getOriginKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group_2__0__Impl"


    // $ANTLR start "rule__Visual__Group_2__1"
    // InternalXacro.g:6107:1: rule__Visual__Group_2__1 : rule__Visual__Group_2__1__Impl ;
    public final void rule__Visual__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6111:1: ( rule__Visual__Group_2__1__Impl )
            // InternalXacro.g:6112:2: rule__Visual__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Visual__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group_2__1"


    // $ANTLR start "rule__Visual__Group_2__1__Impl"
    // InternalXacro.g:6118:1: rule__Visual__Group_2__1__Impl : ( ( rule__Visual__OriginAssignment_2_1 ) ) ;
    public final void rule__Visual__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6122:1: ( ( ( rule__Visual__OriginAssignment_2_1 ) ) )
            // InternalXacro.g:6123:1: ( ( rule__Visual__OriginAssignment_2_1 ) )
            {
            // InternalXacro.g:6123:1: ( ( rule__Visual__OriginAssignment_2_1 ) )
            // InternalXacro.g:6124:2: ( rule__Visual__OriginAssignment_2_1 )
            {
             before(grammarAccess.getVisualAccess().getOriginAssignment_2_1()); 
            // InternalXacro.g:6125:2: ( rule__Visual__OriginAssignment_2_1 )
            // InternalXacro.g:6125:3: rule__Visual__OriginAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Visual__OriginAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVisualAccess().getOriginAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group_2__1__Impl"


    // $ANTLR start "rule__Collision__Group__0"
    // InternalXacro.g:6134:1: rule__Collision__Group__0 : rule__Collision__Group__0__Impl rule__Collision__Group__1 ;
    public final void rule__Collision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6138:1: ( rule__Collision__Group__0__Impl rule__Collision__Group__1 )
            // InternalXacro.g:6139:2: rule__Collision__Group__0__Impl rule__Collision__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalXacro.g:6146:1: rule__Collision__Group__0__Impl : ( 'Collision' ) ;
    public final void rule__Collision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6150:1: ( ( 'Collision' ) )
            // InternalXacro.g:6151:1: ( 'Collision' )
            {
            // InternalXacro.g:6151:1: ( 'Collision' )
            // InternalXacro.g:6152:2: 'Collision'
            {
             before(grammarAccess.getCollisionAccess().getCollisionKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getCollisionKeyword_0()); 

            }


            }

        }
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
    // InternalXacro.g:6161:1: rule__Collision__Group__1 : rule__Collision__Group__1__Impl rule__Collision__Group__2 ;
    public final void rule__Collision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6165:1: ( rule__Collision__Group__1__Impl rule__Collision__Group__2 )
            // InternalXacro.g:6166:2: rule__Collision__Group__1__Impl rule__Collision__Group__2
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
    // InternalXacro.g:6173:1: rule__Collision__Group__1__Impl : ( '{' ) ;
    public final void rule__Collision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6177:1: ( ( '{' ) )
            // InternalXacro.g:6178:1: ( '{' )
            {
            // InternalXacro.g:6178:1: ( '{' )
            // InternalXacro.g:6179:2: '{'
            {
             before(grammarAccess.getCollisionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalXacro.g:6188:1: rule__Collision__Group__2 : rule__Collision__Group__2__Impl rule__Collision__Group__3 ;
    public final void rule__Collision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6192:1: ( rule__Collision__Group__2__Impl rule__Collision__Group__3 )
            // InternalXacro.g:6193:2: rule__Collision__Group__2__Impl rule__Collision__Group__3
            {
            pushFollow(FOLLOW_51);
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
    // InternalXacro.g:6200:1: rule__Collision__Group__2__Impl : ( ( rule__Collision__Group_2__0 )? ) ;
    public final void rule__Collision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6204:1: ( ( ( rule__Collision__Group_2__0 )? ) )
            // InternalXacro.g:6205:1: ( ( rule__Collision__Group_2__0 )? )
            {
            // InternalXacro.g:6205:1: ( ( rule__Collision__Group_2__0 )? )
            // InternalXacro.g:6206:2: ( rule__Collision__Group_2__0 )?
            {
             before(grammarAccess.getCollisionAccess().getGroup_2()); 
            // InternalXacro.g:6207:2: ( rule__Collision__Group_2__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==41) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalXacro.g:6207:3: rule__Collision__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Collision__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollisionAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalXacro.g:6215:1: rule__Collision__Group__3 : rule__Collision__Group__3__Impl rule__Collision__Group__4 ;
    public final void rule__Collision__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6219:1: ( rule__Collision__Group__3__Impl rule__Collision__Group__4 )
            // InternalXacro.g:6220:2: rule__Collision__Group__3__Impl rule__Collision__Group__4
            {
            pushFollow(FOLLOW_52);
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
    // InternalXacro.g:6227:1: rule__Collision__Group__3__Impl : ( 'geometry' ) ;
    public final void rule__Collision__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6231:1: ( ( 'geometry' ) )
            // InternalXacro.g:6232:1: ( 'geometry' )
            {
            // InternalXacro.g:6232:1: ( 'geometry' )
            // InternalXacro.g:6233:2: 'geometry'
            {
             before(grammarAccess.getCollisionAccess().getGeometryKeyword_3()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getGeometryKeyword_3()); 

            }


            }

        }
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
    // InternalXacro.g:6242:1: rule__Collision__Group__4 : rule__Collision__Group__4__Impl rule__Collision__Group__5 ;
    public final void rule__Collision__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6246:1: ( rule__Collision__Group__4__Impl rule__Collision__Group__5 )
            // InternalXacro.g:6247:2: rule__Collision__Group__4__Impl rule__Collision__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__Collision__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__5();

            state._fsp--;


            }

        }
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
    // InternalXacro.g:6254:1: rule__Collision__Group__4__Impl : ( ( rule__Collision__GeometryAssignment_4 ) ) ;
    public final void rule__Collision__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6258:1: ( ( ( rule__Collision__GeometryAssignment_4 ) ) )
            // InternalXacro.g:6259:1: ( ( rule__Collision__GeometryAssignment_4 ) )
            {
            // InternalXacro.g:6259:1: ( ( rule__Collision__GeometryAssignment_4 ) )
            // InternalXacro.g:6260:2: ( rule__Collision__GeometryAssignment_4 )
            {
             before(grammarAccess.getCollisionAccess().getGeometryAssignment_4()); 
            // InternalXacro.g:6261:2: ( rule__Collision__GeometryAssignment_4 )
            // InternalXacro.g:6261:3: rule__Collision__GeometryAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Collision__GeometryAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getGeometryAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Collision__Group__5"
    // InternalXacro.g:6269:1: rule__Collision__Group__5 : rule__Collision__Group__5__Impl ;
    public final void rule__Collision__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6273:1: ( rule__Collision__Group__5__Impl )
            // InternalXacro.g:6274:2: rule__Collision__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collision__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__5"


    // $ANTLR start "rule__Collision__Group__5__Impl"
    // InternalXacro.g:6280:1: rule__Collision__Group__5__Impl : ( '}' ) ;
    public final void rule__Collision__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6284:1: ( ( '}' ) )
            // InternalXacro.g:6285:1: ( '}' )
            {
            // InternalXacro.g:6285:1: ( '}' )
            // InternalXacro.g:6286:2: '}'
            {
             before(grammarAccess.getCollisionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__5__Impl"


    // $ANTLR start "rule__Collision__Group_2__0"
    // InternalXacro.g:6296:1: rule__Collision__Group_2__0 : rule__Collision__Group_2__0__Impl rule__Collision__Group_2__1 ;
    public final void rule__Collision__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6300:1: ( rule__Collision__Group_2__0__Impl rule__Collision__Group_2__1 )
            // InternalXacro.g:6301:2: rule__Collision__Group_2__0__Impl rule__Collision__Group_2__1
            {
            pushFollow(FOLLOW_43);
            rule__Collision__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group_2__0"


    // $ANTLR start "rule__Collision__Group_2__0__Impl"
    // InternalXacro.g:6308:1: rule__Collision__Group_2__0__Impl : ( 'origin' ) ;
    public final void rule__Collision__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6312:1: ( ( 'origin' ) )
            // InternalXacro.g:6313:1: ( 'origin' )
            {
            // InternalXacro.g:6313:1: ( 'origin' )
            // InternalXacro.g:6314:2: 'origin'
            {
             before(grammarAccess.getCollisionAccess().getOriginKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getOriginKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group_2__0__Impl"


    // $ANTLR start "rule__Collision__Group_2__1"
    // InternalXacro.g:6323:1: rule__Collision__Group_2__1 : rule__Collision__Group_2__1__Impl ;
    public final void rule__Collision__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6327:1: ( rule__Collision__Group_2__1__Impl )
            // InternalXacro.g:6328:2: rule__Collision__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collision__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group_2__1"


    // $ANTLR start "rule__Collision__Group_2__1__Impl"
    // InternalXacro.g:6334:1: rule__Collision__Group_2__1__Impl : ( ( rule__Collision__OriginAssignment_2_1 ) ) ;
    public final void rule__Collision__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6338:1: ( ( ( rule__Collision__OriginAssignment_2_1 ) ) )
            // InternalXacro.g:6339:1: ( ( rule__Collision__OriginAssignment_2_1 ) )
            {
            // InternalXacro.g:6339:1: ( ( rule__Collision__OriginAssignment_2_1 ) )
            // InternalXacro.g:6340:2: ( rule__Collision__OriginAssignment_2_1 )
            {
             before(grammarAccess.getCollisionAccess().getOriginAssignment_2_1()); 
            // InternalXacro.g:6341:2: ( rule__Collision__OriginAssignment_2_1 )
            // InternalXacro.g:6341:3: rule__Collision__OriginAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Collision__OriginAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getOriginAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group_2__1__Impl"


    // $ANTLR start "rule__Mass__Group__0"
    // InternalXacro.g:6350:1: rule__Mass__Group__0 : rule__Mass__Group__0__Impl rule__Mass__Group__1 ;
    public final void rule__Mass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6354:1: ( rule__Mass__Group__0__Impl rule__Mass__Group__1 )
            // InternalXacro.g:6355:2: rule__Mass__Group__0__Impl rule__Mass__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalXacro.g:6362:1: rule__Mass__Group__0__Impl : ( () ) ;
    public final void rule__Mass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6366:1: ( ( () ) )
            // InternalXacro.g:6367:1: ( () )
            {
            // InternalXacro.g:6367:1: ( () )
            // InternalXacro.g:6368:2: ()
            {
             before(grammarAccess.getMassAccess().getMassAction_0()); 
            // InternalXacro.g:6369:2: ()
            // InternalXacro.g:6369:3: 
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
    // InternalXacro.g:6377:1: rule__Mass__Group__1 : rule__Mass__Group__1__Impl rule__Mass__Group__2 ;
    public final void rule__Mass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6381:1: ( rule__Mass__Group__1__Impl rule__Mass__Group__2 )
            // InternalXacro.g:6382:2: rule__Mass__Group__1__Impl rule__Mass__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalXacro.g:6389:1: rule__Mass__Group__1__Impl : ( 'Mass' ) ;
    public final void rule__Mass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6393:1: ( ( 'Mass' ) )
            // InternalXacro.g:6394:1: ( 'Mass' )
            {
            // InternalXacro.g:6394:1: ( 'Mass' )
            // InternalXacro.g:6395:2: 'Mass'
            {
             before(grammarAccess.getMassAccess().getMassKeyword_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getMassKeyword_1()); 

            }


            }

        }
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
    // InternalXacro.g:6404:1: rule__Mass__Group__2 : rule__Mass__Group__2__Impl rule__Mass__Group__3 ;
    public final void rule__Mass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6408:1: ( rule__Mass__Group__2__Impl rule__Mass__Group__3 )
            // InternalXacro.g:6409:2: rule__Mass__Group__2__Impl rule__Mass__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalXacro.g:6416:1: rule__Mass__Group__2__Impl : ( '{' ) ;
    public final void rule__Mass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6420:1: ( ( '{' ) )
            // InternalXacro.g:6421:1: ( '{' )
            {
            // InternalXacro.g:6421:1: ( '{' )
            // InternalXacro.g:6422:2: '{'
            {
             before(grammarAccess.getMassAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalXacro.g:6431:1: rule__Mass__Group__3 : rule__Mass__Group__3__Impl rule__Mass__Group__4 ;
    public final void rule__Mass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6435:1: ( rule__Mass__Group__3__Impl rule__Mass__Group__4 )
            // InternalXacro.g:6436:2: rule__Mass__Group__3__Impl rule__Mass__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalXacro.g:6443:1: rule__Mass__Group__3__Impl : ( ( rule__Mass__Group_3__0 )? ) ;
    public final void rule__Mass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6447:1: ( ( ( rule__Mass__Group_3__0 )? ) )
            // InternalXacro.g:6448:1: ( ( rule__Mass__Group_3__0 )? )
            {
            // InternalXacro.g:6448:1: ( ( rule__Mass__Group_3__0 )? )
            // InternalXacro.g:6449:2: ( rule__Mass__Group_3__0 )?
            {
             before(grammarAccess.getMassAccess().getGroup_3()); 
            // InternalXacro.g:6450:2: ( rule__Mass__Group_3__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==29) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalXacro.g:6450:3: rule__Mass__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mass__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMassAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalXacro.g:6458:1: rule__Mass__Group__4 : rule__Mass__Group__4__Impl ;
    public final void rule__Mass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6462:1: ( rule__Mass__Group__4__Impl )
            // InternalXacro.g:6463:2: rule__Mass__Group__4__Impl
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
    // InternalXacro.g:6469:1: rule__Mass__Group__4__Impl : ( '}' ) ;
    public final void rule__Mass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6473:1: ( ( '}' ) )
            // InternalXacro.g:6474:1: ( '}' )
            {
            // InternalXacro.g:6474:1: ( '}' )
            // InternalXacro.g:6475:2: '}'
            {
             before(grammarAccess.getMassAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Mass__Group_3__0"
    // InternalXacro.g:6485:1: rule__Mass__Group_3__0 : rule__Mass__Group_3__0__Impl rule__Mass__Group_3__1 ;
    public final void rule__Mass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6489:1: ( rule__Mass__Group_3__0__Impl rule__Mass__Group_3__1 )
            // InternalXacro.g:6490:2: rule__Mass__Group_3__0__Impl rule__Mass__Group_3__1
            {
            pushFollow(FOLLOW_47);
            rule__Mass__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mass__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group_3__0"


    // $ANTLR start "rule__Mass__Group_3__0__Impl"
    // InternalXacro.g:6497:1: rule__Mass__Group_3__0__Impl : ( 'value' ) ;
    public final void rule__Mass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6501:1: ( ( 'value' ) )
            // InternalXacro.g:6502:1: ( 'value' )
            {
            // InternalXacro.g:6502:1: ( 'value' )
            // InternalXacro.g:6503:2: 'value'
            {
             before(grammarAccess.getMassAccess().getValueKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getValueKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group_3__0__Impl"


    // $ANTLR start "rule__Mass__Group_3__1"
    // InternalXacro.g:6512:1: rule__Mass__Group_3__1 : rule__Mass__Group_3__1__Impl ;
    public final void rule__Mass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6516:1: ( rule__Mass__Group_3__1__Impl )
            // InternalXacro.g:6517:2: rule__Mass__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mass__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group_3__1"


    // $ANTLR start "rule__Mass__Group_3__1__Impl"
    // InternalXacro.g:6523:1: rule__Mass__Group_3__1__Impl : ( ( rule__Mass__ValueAssignment_3_1 ) ) ;
    public final void rule__Mass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6527:1: ( ( ( rule__Mass__ValueAssignment_3_1 ) ) )
            // InternalXacro.g:6528:1: ( ( rule__Mass__ValueAssignment_3_1 ) )
            {
            // InternalXacro.g:6528:1: ( ( rule__Mass__ValueAssignment_3_1 ) )
            // InternalXacro.g:6529:2: ( rule__Mass__ValueAssignment_3_1 )
            {
             before(grammarAccess.getMassAccess().getValueAssignment_3_1()); 
            // InternalXacro.g:6530:2: ( rule__Mass__ValueAssignment_3_1 )
            // InternalXacro.g:6530:3: rule__Mass__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Mass__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMassAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group_3__1__Impl"


    // $ANTLR start "rule__Inertia__Group__0"
    // InternalXacro.g:6539:1: rule__Inertia__Group__0 : rule__Inertia__Group__0__Impl rule__Inertia__Group__1 ;
    public final void rule__Inertia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6543:1: ( rule__Inertia__Group__0__Impl rule__Inertia__Group__1 )
            // InternalXacro.g:6544:2: rule__Inertia__Group__0__Impl rule__Inertia__Group__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalXacro.g:6551:1: rule__Inertia__Group__0__Impl : ( () ) ;
    public final void rule__Inertia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6555:1: ( ( () ) )
            // InternalXacro.g:6556:1: ( () )
            {
            // InternalXacro.g:6556:1: ( () )
            // InternalXacro.g:6557:2: ()
            {
             before(grammarAccess.getInertiaAccess().getInertiaAction_0()); 
            // InternalXacro.g:6558:2: ()
            // InternalXacro.g:6558:3: 
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
    // InternalXacro.g:6566:1: rule__Inertia__Group__1 : rule__Inertia__Group__1__Impl rule__Inertia__Group__2 ;
    public final void rule__Inertia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6570:1: ( rule__Inertia__Group__1__Impl rule__Inertia__Group__2 )
            // InternalXacro.g:6571:2: rule__Inertia__Group__1__Impl rule__Inertia__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalXacro.g:6578:1: rule__Inertia__Group__1__Impl : ( 'Inertia' ) ;
    public final void rule__Inertia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6582:1: ( ( 'Inertia' ) )
            // InternalXacro.g:6583:1: ( 'Inertia' )
            {
            // InternalXacro.g:6583:1: ( 'Inertia' )
            // InternalXacro.g:6584:2: 'Inertia'
            {
             before(grammarAccess.getInertiaAccess().getInertiaKeyword_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getInertiaKeyword_1()); 

            }


            }

        }
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
    // InternalXacro.g:6593:1: rule__Inertia__Group__2 : rule__Inertia__Group__2__Impl rule__Inertia__Group__3 ;
    public final void rule__Inertia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6597:1: ( rule__Inertia__Group__2__Impl rule__Inertia__Group__3 )
            // InternalXacro.g:6598:2: rule__Inertia__Group__2__Impl rule__Inertia__Group__3
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
    // InternalXacro.g:6605:1: rule__Inertia__Group__2__Impl : ( '{' ) ;
    public final void rule__Inertia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6609:1: ( ( '{' ) )
            // InternalXacro.g:6610:1: ( '{' )
            {
            // InternalXacro.g:6610:1: ( '{' )
            // InternalXacro.g:6611:2: '{'
            {
             before(grammarAccess.getInertiaAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalXacro.g:6620:1: rule__Inertia__Group__3 : rule__Inertia__Group__3__Impl rule__Inertia__Group__4 ;
    public final void rule__Inertia__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6624:1: ( rule__Inertia__Group__3__Impl rule__Inertia__Group__4 )
            // InternalXacro.g:6625:2: rule__Inertia__Group__3__Impl rule__Inertia__Group__4
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
    // InternalXacro.g:6632:1: rule__Inertia__Group__3__Impl : ( ( rule__Inertia__Group_3__0 )? ) ;
    public final void rule__Inertia__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6636:1: ( ( ( rule__Inertia__Group_3__0 )? ) )
            // InternalXacro.g:6637:1: ( ( rule__Inertia__Group_3__0 )? )
            {
            // InternalXacro.g:6637:1: ( ( rule__Inertia__Group_3__0 )? )
            // InternalXacro.g:6638:2: ( rule__Inertia__Group_3__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_3()); 
            // InternalXacro.g:6639:2: ( rule__Inertia__Group_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==64) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalXacro.g:6639:3: rule__Inertia__Group_3__0
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
    // InternalXacro.g:6647:1: rule__Inertia__Group__4 : rule__Inertia__Group__4__Impl rule__Inertia__Group__5 ;
    public final void rule__Inertia__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6651:1: ( rule__Inertia__Group__4__Impl rule__Inertia__Group__5 )
            // InternalXacro.g:6652:2: rule__Inertia__Group__4__Impl rule__Inertia__Group__5
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
    // InternalXacro.g:6659:1: rule__Inertia__Group__4__Impl : ( ( rule__Inertia__Group_4__0 )? ) ;
    public final void rule__Inertia__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6663:1: ( ( ( rule__Inertia__Group_4__0 )? ) )
            // InternalXacro.g:6664:1: ( ( rule__Inertia__Group_4__0 )? )
            {
            // InternalXacro.g:6664:1: ( ( rule__Inertia__Group_4__0 )? )
            // InternalXacro.g:6665:2: ( rule__Inertia__Group_4__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_4()); 
            // InternalXacro.g:6666:2: ( rule__Inertia__Group_4__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==65) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalXacro.g:6666:3: rule__Inertia__Group_4__0
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
    // InternalXacro.g:6674:1: rule__Inertia__Group__5 : rule__Inertia__Group__5__Impl rule__Inertia__Group__6 ;
    public final void rule__Inertia__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6678:1: ( rule__Inertia__Group__5__Impl rule__Inertia__Group__6 )
            // InternalXacro.g:6679:2: rule__Inertia__Group__5__Impl rule__Inertia__Group__6
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
    // InternalXacro.g:6686:1: rule__Inertia__Group__5__Impl : ( ( rule__Inertia__Group_5__0 )? ) ;
    public final void rule__Inertia__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6690:1: ( ( ( rule__Inertia__Group_5__0 )? ) )
            // InternalXacro.g:6691:1: ( ( rule__Inertia__Group_5__0 )? )
            {
            // InternalXacro.g:6691:1: ( ( rule__Inertia__Group_5__0 )? )
            // InternalXacro.g:6692:2: ( rule__Inertia__Group_5__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_5()); 
            // InternalXacro.g:6693:2: ( rule__Inertia__Group_5__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==66) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalXacro.g:6693:3: rule__Inertia__Group_5__0
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
    // InternalXacro.g:6701:1: rule__Inertia__Group__6 : rule__Inertia__Group__6__Impl rule__Inertia__Group__7 ;
    public final void rule__Inertia__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6705:1: ( rule__Inertia__Group__6__Impl rule__Inertia__Group__7 )
            // InternalXacro.g:6706:2: rule__Inertia__Group__6__Impl rule__Inertia__Group__7
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
    // InternalXacro.g:6713:1: rule__Inertia__Group__6__Impl : ( ( rule__Inertia__Group_6__0 )? ) ;
    public final void rule__Inertia__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6717:1: ( ( ( rule__Inertia__Group_6__0 )? ) )
            // InternalXacro.g:6718:1: ( ( rule__Inertia__Group_6__0 )? )
            {
            // InternalXacro.g:6718:1: ( ( rule__Inertia__Group_6__0 )? )
            // InternalXacro.g:6719:2: ( rule__Inertia__Group_6__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_6()); 
            // InternalXacro.g:6720:2: ( rule__Inertia__Group_6__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==67) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalXacro.g:6720:3: rule__Inertia__Group_6__0
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
    // InternalXacro.g:6728:1: rule__Inertia__Group__7 : rule__Inertia__Group__7__Impl rule__Inertia__Group__8 ;
    public final void rule__Inertia__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6732:1: ( rule__Inertia__Group__7__Impl rule__Inertia__Group__8 )
            // InternalXacro.g:6733:2: rule__Inertia__Group__7__Impl rule__Inertia__Group__8
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
    // InternalXacro.g:6740:1: rule__Inertia__Group__7__Impl : ( ( rule__Inertia__Group_7__0 )? ) ;
    public final void rule__Inertia__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6744:1: ( ( ( rule__Inertia__Group_7__0 )? ) )
            // InternalXacro.g:6745:1: ( ( rule__Inertia__Group_7__0 )? )
            {
            // InternalXacro.g:6745:1: ( ( rule__Inertia__Group_7__0 )? )
            // InternalXacro.g:6746:2: ( rule__Inertia__Group_7__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_7()); 
            // InternalXacro.g:6747:2: ( rule__Inertia__Group_7__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==68) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalXacro.g:6747:3: rule__Inertia__Group_7__0
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
    // InternalXacro.g:6755:1: rule__Inertia__Group__8 : rule__Inertia__Group__8__Impl rule__Inertia__Group__9 ;
    public final void rule__Inertia__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6759:1: ( rule__Inertia__Group__8__Impl rule__Inertia__Group__9 )
            // InternalXacro.g:6760:2: rule__Inertia__Group__8__Impl rule__Inertia__Group__9
            {
            pushFollow(FOLLOW_53);
            rule__Inertia__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__9();

            state._fsp--;


            }

        }
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
    // InternalXacro.g:6767:1: rule__Inertia__Group__8__Impl : ( ( rule__Inertia__Group_8__0 )? ) ;
    public final void rule__Inertia__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6771:1: ( ( ( rule__Inertia__Group_8__0 )? ) )
            // InternalXacro.g:6772:1: ( ( rule__Inertia__Group_8__0 )? )
            {
            // InternalXacro.g:6772:1: ( ( rule__Inertia__Group_8__0 )? )
            // InternalXacro.g:6773:2: ( rule__Inertia__Group_8__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_8()); 
            // InternalXacro.g:6774:2: ( rule__Inertia__Group_8__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==69) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalXacro.g:6774:3: rule__Inertia__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inertia__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInertiaAccess().getGroup_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Inertia__Group__9"
    // InternalXacro.g:6782:1: rule__Inertia__Group__9 : rule__Inertia__Group__9__Impl ;
    public final void rule__Inertia__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6786:1: ( rule__Inertia__Group__9__Impl )
            // InternalXacro.g:6787:2: rule__Inertia__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__9"


    // $ANTLR start "rule__Inertia__Group__9__Impl"
    // InternalXacro.g:6793:1: rule__Inertia__Group__9__Impl : ( '}' ) ;
    public final void rule__Inertia__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6797:1: ( ( '}' ) )
            // InternalXacro.g:6798:1: ( '}' )
            {
            // InternalXacro.g:6798:1: ( '}' )
            // InternalXacro.g:6799:2: '}'
            {
             before(grammarAccess.getInertiaAccess().getRightCurlyBracketKeyword_9()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__9__Impl"


    // $ANTLR start "rule__Inertia__Group_3__0"
    // InternalXacro.g:6809:1: rule__Inertia__Group_3__0 : rule__Inertia__Group_3__0__Impl rule__Inertia__Group_3__1 ;
    public final void rule__Inertia__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6813:1: ( rule__Inertia__Group_3__0__Impl rule__Inertia__Group_3__1 )
            // InternalXacro.g:6814:2: rule__Inertia__Group_3__0__Impl rule__Inertia__Group_3__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalXacro.g:6821:1: rule__Inertia__Group_3__0__Impl : ( 'ixx' ) ;
    public final void rule__Inertia__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6825:1: ( ( 'ixx' ) )
            // InternalXacro.g:6826:1: ( 'ixx' )
            {
            // InternalXacro.g:6826:1: ( 'ixx' )
            // InternalXacro.g:6827:2: 'ixx'
            {
             before(grammarAccess.getInertiaAccess().getIxxKeyword_3_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIxxKeyword_3_0()); 

            }


            }

        }
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
    // InternalXacro.g:6836:1: rule__Inertia__Group_3__1 : rule__Inertia__Group_3__1__Impl ;
    public final void rule__Inertia__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6840:1: ( rule__Inertia__Group_3__1__Impl )
            // InternalXacro.g:6841:2: rule__Inertia__Group_3__1__Impl
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
    // InternalXacro.g:6847:1: rule__Inertia__Group_3__1__Impl : ( ( rule__Inertia__IxxAssignment_3_1 ) ) ;
    public final void rule__Inertia__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6851:1: ( ( ( rule__Inertia__IxxAssignment_3_1 ) ) )
            // InternalXacro.g:6852:1: ( ( rule__Inertia__IxxAssignment_3_1 ) )
            {
            // InternalXacro.g:6852:1: ( ( rule__Inertia__IxxAssignment_3_1 ) )
            // InternalXacro.g:6853:2: ( rule__Inertia__IxxAssignment_3_1 )
            {
             before(grammarAccess.getInertiaAccess().getIxxAssignment_3_1()); 
            // InternalXacro.g:6854:2: ( rule__Inertia__IxxAssignment_3_1 )
            // InternalXacro.g:6854:3: rule__Inertia__IxxAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IxxAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIxxAssignment_3_1()); 

            }


            }

        }
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
    // InternalXacro.g:6863:1: rule__Inertia__Group_4__0 : rule__Inertia__Group_4__0__Impl rule__Inertia__Group_4__1 ;
    public final void rule__Inertia__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6867:1: ( rule__Inertia__Group_4__0__Impl rule__Inertia__Group_4__1 )
            // InternalXacro.g:6868:2: rule__Inertia__Group_4__0__Impl rule__Inertia__Group_4__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalXacro.g:6875:1: rule__Inertia__Group_4__0__Impl : ( 'ixy' ) ;
    public final void rule__Inertia__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6879:1: ( ( 'ixy' ) )
            // InternalXacro.g:6880:1: ( 'ixy' )
            {
            // InternalXacro.g:6880:1: ( 'ixy' )
            // InternalXacro.g:6881:2: 'ixy'
            {
             before(grammarAccess.getInertiaAccess().getIxyKeyword_4_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIxyKeyword_4_0()); 

            }


            }

        }
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
    // InternalXacro.g:6890:1: rule__Inertia__Group_4__1 : rule__Inertia__Group_4__1__Impl ;
    public final void rule__Inertia__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6894:1: ( rule__Inertia__Group_4__1__Impl )
            // InternalXacro.g:6895:2: rule__Inertia__Group_4__1__Impl
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
    // InternalXacro.g:6901:1: rule__Inertia__Group_4__1__Impl : ( ( rule__Inertia__IxyAssignment_4_1 ) ) ;
    public final void rule__Inertia__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6905:1: ( ( ( rule__Inertia__IxyAssignment_4_1 ) ) )
            // InternalXacro.g:6906:1: ( ( rule__Inertia__IxyAssignment_4_1 ) )
            {
            // InternalXacro.g:6906:1: ( ( rule__Inertia__IxyAssignment_4_1 ) )
            // InternalXacro.g:6907:2: ( rule__Inertia__IxyAssignment_4_1 )
            {
             before(grammarAccess.getInertiaAccess().getIxyAssignment_4_1()); 
            // InternalXacro.g:6908:2: ( rule__Inertia__IxyAssignment_4_1 )
            // InternalXacro.g:6908:3: rule__Inertia__IxyAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IxyAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIxyAssignment_4_1()); 

            }


            }

        }
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
    // InternalXacro.g:6917:1: rule__Inertia__Group_5__0 : rule__Inertia__Group_5__0__Impl rule__Inertia__Group_5__1 ;
    public final void rule__Inertia__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6921:1: ( rule__Inertia__Group_5__0__Impl rule__Inertia__Group_5__1 )
            // InternalXacro.g:6922:2: rule__Inertia__Group_5__0__Impl rule__Inertia__Group_5__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalXacro.g:6929:1: rule__Inertia__Group_5__0__Impl : ( 'ixz' ) ;
    public final void rule__Inertia__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6933:1: ( ( 'ixz' ) )
            // InternalXacro.g:6934:1: ( 'ixz' )
            {
            // InternalXacro.g:6934:1: ( 'ixz' )
            // InternalXacro.g:6935:2: 'ixz'
            {
             before(grammarAccess.getInertiaAccess().getIxzKeyword_5_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIxzKeyword_5_0()); 

            }


            }

        }
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
    // InternalXacro.g:6944:1: rule__Inertia__Group_5__1 : rule__Inertia__Group_5__1__Impl ;
    public final void rule__Inertia__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6948:1: ( rule__Inertia__Group_5__1__Impl )
            // InternalXacro.g:6949:2: rule__Inertia__Group_5__1__Impl
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
    // InternalXacro.g:6955:1: rule__Inertia__Group_5__1__Impl : ( ( rule__Inertia__IxzAssignment_5_1 ) ) ;
    public final void rule__Inertia__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6959:1: ( ( ( rule__Inertia__IxzAssignment_5_1 ) ) )
            // InternalXacro.g:6960:1: ( ( rule__Inertia__IxzAssignment_5_1 ) )
            {
            // InternalXacro.g:6960:1: ( ( rule__Inertia__IxzAssignment_5_1 ) )
            // InternalXacro.g:6961:2: ( rule__Inertia__IxzAssignment_5_1 )
            {
             before(grammarAccess.getInertiaAccess().getIxzAssignment_5_1()); 
            // InternalXacro.g:6962:2: ( rule__Inertia__IxzAssignment_5_1 )
            // InternalXacro.g:6962:3: rule__Inertia__IxzAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IxzAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIxzAssignment_5_1()); 

            }


            }

        }
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
    // InternalXacro.g:6971:1: rule__Inertia__Group_6__0 : rule__Inertia__Group_6__0__Impl rule__Inertia__Group_6__1 ;
    public final void rule__Inertia__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6975:1: ( rule__Inertia__Group_6__0__Impl rule__Inertia__Group_6__1 )
            // InternalXacro.g:6976:2: rule__Inertia__Group_6__0__Impl rule__Inertia__Group_6__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalXacro.g:6983:1: rule__Inertia__Group_6__0__Impl : ( 'iyy' ) ;
    public final void rule__Inertia__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:6987:1: ( ( 'iyy' ) )
            // InternalXacro.g:6988:1: ( 'iyy' )
            {
            // InternalXacro.g:6988:1: ( 'iyy' )
            // InternalXacro.g:6989:2: 'iyy'
            {
             before(grammarAccess.getInertiaAccess().getIyyKeyword_6_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIyyKeyword_6_0()); 

            }


            }

        }
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
    // InternalXacro.g:6998:1: rule__Inertia__Group_6__1 : rule__Inertia__Group_6__1__Impl ;
    public final void rule__Inertia__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7002:1: ( rule__Inertia__Group_6__1__Impl )
            // InternalXacro.g:7003:2: rule__Inertia__Group_6__1__Impl
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
    // InternalXacro.g:7009:1: rule__Inertia__Group_6__1__Impl : ( ( rule__Inertia__IyyAssignment_6_1 ) ) ;
    public final void rule__Inertia__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7013:1: ( ( ( rule__Inertia__IyyAssignment_6_1 ) ) )
            // InternalXacro.g:7014:1: ( ( rule__Inertia__IyyAssignment_6_1 ) )
            {
            // InternalXacro.g:7014:1: ( ( rule__Inertia__IyyAssignment_6_1 ) )
            // InternalXacro.g:7015:2: ( rule__Inertia__IyyAssignment_6_1 )
            {
             before(grammarAccess.getInertiaAccess().getIyyAssignment_6_1()); 
            // InternalXacro.g:7016:2: ( rule__Inertia__IyyAssignment_6_1 )
            // InternalXacro.g:7016:3: rule__Inertia__IyyAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IyyAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIyyAssignment_6_1()); 

            }


            }

        }
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
    // InternalXacro.g:7025:1: rule__Inertia__Group_7__0 : rule__Inertia__Group_7__0__Impl rule__Inertia__Group_7__1 ;
    public final void rule__Inertia__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7029:1: ( rule__Inertia__Group_7__0__Impl rule__Inertia__Group_7__1 )
            // InternalXacro.g:7030:2: rule__Inertia__Group_7__0__Impl rule__Inertia__Group_7__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalXacro.g:7037:1: rule__Inertia__Group_7__0__Impl : ( 'iyz' ) ;
    public final void rule__Inertia__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7041:1: ( ( 'iyz' ) )
            // InternalXacro.g:7042:1: ( 'iyz' )
            {
            // InternalXacro.g:7042:1: ( 'iyz' )
            // InternalXacro.g:7043:2: 'iyz'
            {
             before(grammarAccess.getInertiaAccess().getIyzKeyword_7_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIyzKeyword_7_0()); 

            }


            }

        }
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
    // InternalXacro.g:7052:1: rule__Inertia__Group_7__1 : rule__Inertia__Group_7__1__Impl ;
    public final void rule__Inertia__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7056:1: ( rule__Inertia__Group_7__1__Impl )
            // InternalXacro.g:7057:2: rule__Inertia__Group_7__1__Impl
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
    // InternalXacro.g:7063:1: rule__Inertia__Group_7__1__Impl : ( ( rule__Inertia__IyzAssignment_7_1 ) ) ;
    public final void rule__Inertia__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7067:1: ( ( ( rule__Inertia__IyzAssignment_7_1 ) ) )
            // InternalXacro.g:7068:1: ( ( rule__Inertia__IyzAssignment_7_1 ) )
            {
            // InternalXacro.g:7068:1: ( ( rule__Inertia__IyzAssignment_7_1 ) )
            // InternalXacro.g:7069:2: ( rule__Inertia__IyzAssignment_7_1 )
            {
             before(grammarAccess.getInertiaAccess().getIyzAssignment_7_1()); 
            // InternalXacro.g:7070:2: ( rule__Inertia__IyzAssignment_7_1 )
            // InternalXacro.g:7070:3: rule__Inertia__IyzAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IyzAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIyzAssignment_7_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Inertia__Group_8__0"
    // InternalXacro.g:7079:1: rule__Inertia__Group_8__0 : rule__Inertia__Group_8__0__Impl rule__Inertia__Group_8__1 ;
    public final void rule__Inertia__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7083:1: ( rule__Inertia__Group_8__0__Impl rule__Inertia__Group_8__1 )
            // InternalXacro.g:7084:2: rule__Inertia__Group_8__0__Impl rule__Inertia__Group_8__1
            {
            pushFollow(FOLLOW_47);
            rule__Inertia__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_8__0"


    // $ANTLR start "rule__Inertia__Group_8__0__Impl"
    // InternalXacro.g:7091:1: rule__Inertia__Group_8__0__Impl : ( 'izz' ) ;
    public final void rule__Inertia__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7095:1: ( ( 'izz' ) )
            // InternalXacro.g:7096:1: ( 'izz' )
            {
            // InternalXacro.g:7096:1: ( 'izz' )
            // InternalXacro.g:7097:2: 'izz'
            {
             before(grammarAccess.getInertiaAccess().getIzzKeyword_8_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIzzKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_8__0__Impl"


    // $ANTLR start "rule__Inertia__Group_8__1"
    // InternalXacro.g:7106:1: rule__Inertia__Group_8__1 : rule__Inertia__Group_8__1__Impl ;
    public final void rule__Inertia__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7110:1: ( rule__Inertia__Group_8__1__Impl )
            // InternalXacro.g:7111:2: rule__Inertia__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_8__1"


    // $ANTLR start "rule__Inertia__Group_8__1__Impl"
    // InternalXacro.g:7117:1: rule__Inertia__Group_8__1__Impl : ( ( rule__Inertia__IzzAssignment_8_1 ) ) ;
    public final void rule__Inertia__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7121:1: ( ( ( rule__Inertia__IzzAssignment_8_1 ) ) )
            // InternalXacro.g:7122:1: ( ( rule__Inertia__IzzAssignment_8_1 ) )
            {
            // InternalXacro.g:7122:1: ( ( rule__Inertia__IzzAssignment_8_1 ) )
            // InternalXacro.g:7123:2: ( rule__Inertia__IzzAssignment_8_1 )
            {
             before(grammarAccess.getInertiaAccess().getIzzAssignment_8_1()); 
            // InternalXacro.g:7124:2: ( rule__Inertia__IzzAssignment_8_1 )
            // InternalXacro.g:7124:3: rule__Inertia__IzzAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IzzAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIzzAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group_8__1__Impl"


    // $ANTLR start "rule__Geometry__Group__0"
    // InternalXacro.g:7133:1: rule__Geometry__Group__0 : rule__Geometry__Group__0__Impl rule__Geometry__Group__1 ;
    public final void rule__Geometry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7137:1: ( rule__Geometry__Group__0__Impl rule__Geometry__Group__1 )
            // InternalXacro.g:7138:2: rule__Geometry__Group__0__Impl rule__Geometry__Group__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalXacro.g:7145:1: rule__Geometry__Group__0__Impl : ( () ) ;
    public final void rule__Geometry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7149:1: ( ( () ) )
            // InternalXacro.g:7150:1: ( () )
            {
            // InternalXacro.g:7150:1: ( () )
            // InternalXacro.g:7151:2: ()
            {
             before(grammarAccess.getGeometryAccess().getGeometryAction_0()); 
            // InternalXacro.g:7152:2: ()
            // InternalXacro.g:7152:3: 
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
    // InternalXacro.g:7160:1: rule__Geometry__Group__1 : rule__Geometry__Group__1__Impl rule__Geometry__Group__2 ;
    public final void rule__Geometry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7164:1: ( rule__Geometry__Group__1__Impl rule__Geometry__Group__2 )
            // InternalXacro.g:7165:2: rule__Geometry__Group__1__Impl rule__Geometry__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalXacro.g:7172:1: rule__Geometry__Group__1__Impl : ( 'Geometry' ) ;
    public final void rule__Geometry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7176:1: ( ( 'Geometry' ) )
            // InternalXacro.g:7177:1: ( 'Geometry' )
            {
            // InternalXacro.g:7177:1: ( 'Geometry' )
            // InternalXacro.g:7178:2: 'Geometry'
            {
             before(grammarAccess.getGeometryAccess().getGeometryKeyword_1()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getGeometryAccess().getGeometryKeyword_1()); 

            }


            }

        }
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
    // InternalXacro.g:7187:1: rule__Geometry__Group__2 : rule__Geometry__Group__2__Impl rule__Geometry__Group__3 ;
    public final void rule__Geometry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7191:1: ( rule__Geometry__Group__2__Impl rule__Geometry__Group__3 )
            // InternalXacro.g:7192:2: rule__Geometry__Group__2__Impl rule__Geometry__Group__3
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
    // InternalXacro.g:7199:1: rule__Geometry__Group__2__Impl : ( '{' ) ;
    public final void rule__Geometry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7203:1: ( ( '{' ) )
            // InternalXacro.g:7204:1: ( '{' )
            {
            // InternalXacro.g:7204:1: ( '{' )
            // InternalXacro.g:7205:2: '{'
            {
             before(grammarAccess.getGeometryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGeometryAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalXacro.g:7214:1: rule__Geometry__Group__3 : rule__Geometry__Group__3__Impl rule__Geometry__Group__4 ;
    public final void rule__Geometry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7218:1: ( rule__Geometry__Group__3__Impl rule__Geometry__Group__4 )
            // InternalXacro.g:7219:2: rule__Geometry__Group__3__Impl rule__Geometry__Group__4
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
    // InternalXacro.g:7226:1: rule__Geometry__Group__3__Impl : ( ( rule__Geometry__Group_3__0 )? ) ;
    public final void rule__Geometry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7230:1: ( ( ( rule__Geometry__Group_3__0 )? ) )
            // InternalXacro.g:7231:1: ( ( rule__Geometry__Group_3__0 )? )
            {
            // InternalXacro.g:7231:1: ( ( rule__Geometry__Group_3__0 )? )
            // InternalXacro.g:7232:2: ( rule__Geometry__Group_3__0 )?
            {
             before(grammarAccess.getGeometryAccess().getGroup_3()); 
            // InternalXacro.g:7233:2: ( rule__Geometry__Group_3__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==71) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalXacro.g:7233:3: rule__Geometry__Group_3__0
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
    // InternalXacro.g:7241:1: rule__Geometry__Group__4 : rule__Geometry__Group__4__Impl rule__Geometry__Group__5 ;
    public final void rule__Geometry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7245:1: ( rule__Geometry__Group__4__Impl rule__Geometry__Group__5 )
            // InternalXacro.g:7246:2: rule__Geometry__Group__4__Impl rule__Geometry__Group__5
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
    // InternalXacro.g:7253:1: rule__Geometry__Group__4__Impl : ( ( rule__Geometry__Group_4__0 )? ) ;
    public final void rule__Geometry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7257:1: ( ( ( rule__Geometry__Group_4__0 )? ) )
            // InternalXacro.g:7258:1: ( ( rule__Geometry__Group_4__0 )? )
            {
            // InternalXacro.g:7258:1: ( ( rule__Geometry__Group_4__0 )? )
            // InternalXacro.g:7259:2: ( rule__Geometry__Group_4__0 )?
            {
             before(grammarAccess.getGeometryAccess().getGroup_4()); 
            // InternalXacro.g:7260:2: ( rule__Geometry__Group_4__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==72) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalXacro.g:7260:3: rule__Geometry__Group_4__0
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
    // InternalXacro.g:7268:1: rule__Geometry__Group__5 : rule__Geometry__Group__5__Impl rule__Geometry__Group__6 ;
    public final void rule__Geometry__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7272:1: ( rule__Geometry__Group__5__Impl rule__Geometry__Group__6 )
            // InternalXacro.g:7273:2: rule__Geometry__Group__5__Impl rule__Geometry__Group__6
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
    // InternalXacro.g:7280:1: rule__Geometry__Group__5__Impl : ( ( rule__Geometry__Group_5__0 )? ) ;
    public final void rule__Geometry__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7284:1: ( ( ( rule__Geometry__Group_5__0 )? ) )
            // InternalXacro.g:7285:1: ( ( rule__Geometry__Group_5__0 )? )
            {
            // InternalXacro.g:7285:1: ( ( rule__Geometry__Group_5__0 )? )
            // InternalXacro.g:7286:2: ( rule__Geometry__Group_5__0 )?
            {
             before(grammarAccess.getGeometryAccess().getGroup_5()); 
            // InternalXacro.g:7287:2: ( rule__Geometry__Group_5__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==73) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalXacro.g:7287:3: rule__Geometry__Group_5__0
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
    // InternalXacro.g:7295:1: rule__Geometry__Group__6 : rule__Geometry__Group__6__Impl rule__Geometry__Group__7 ;
    public final void rule__Geometry__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7299:1: ( rule__Geometry__Group__6__Impl rule__Geometry__Group__7 )
            // InternalXacro.g:7300:2: rule__Geometry__Group__6__Impl rule__Geometry__Group__7
            {
            pushFollow(FOLLOW_54);
            rule__Geometry__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geometry__Group__7();

            state._fsp--;


            }

        }
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
    // InternalXacro.g:7307:1: rule__Geometry__Group__6__Impl : ( ( rule__Geometry__Group_6__0 )? ) ;
    public final void rule__Geometry__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7311:1: ( ( ( rule__Geometry__Group_6__0 )? ) )
            // InternalXacro.g:7312:1: ( ( rule__Geometry__Group_6__0 )? )
            {
            // InternalXacro.g:7312:1: ( ( rule__Geometry__Group_6__0 )? )
            // InternalXacro.g:7313:2: ( rule__Geometry__Group_6__0 )?
            {
             before(grammarAccess.getGeometryAccess().getGroup_6()); 
            // InternalXacro.g:7314:2: ( rule__Geometry__Group_6__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==74) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalXacro.g:7314:3: rule__Geometry__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Geometry__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeometryAccess().getGroup_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Geometry__Group__7"
    // InternalXacro.g:7322:1: rule__Geometry__Group__7 : rule__Geometry__Group__7__Impl ;
    public final void rule__Geometry__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7326:1: ( rule__Geometry__Group__7__Impl )
            // InternalXacro.g:7327:2: rule__Geometry__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__7"


    // $ANTLR start "rule__Geometry__Group__7__Impl"
    // InternalXacro.g:7333:1: rule__Geometry__Group__7__Impl : ( '}' ) ;
    public final void rule__Geometry__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7337:1: ( ( '}' ) )
            // InternalXacro.g:7338:1: ( '}' )
            {
            // InternalXacro.g:7338:1: ( '}' )
            // InternalXacro.g:7339:2: '}'
            {
             before(grammarAccess.getGeometryAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGeometryAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__7__Impl"


    // $ANTLR start "rule__Geometry__Group_3__0"
    // InternalXacro.g:7349:1: rule__Geometry__Group_3__0 : rule__Geometry__Group_3__0__Impl rule__Geometry__Group_3__1 ;
    public final void rule__Geometry__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7353:1: ( rule__Geometry__Group_3__0__Impl rule__Geometry__Group_3__1 )
            // InternalXacro.g:7354:2: rule__Geometry__Group_3__0__Impl rule__Geometry__Group_3__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalXacro.g:7361:1: rule__Geometry__Group_3__0__Impl : ( 'box' ) ;
    public final void rule__Geometry__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7365:1: ( ( 'box' ) )
            // InternalXacro.g:7366:1: ( 'box' )
            {
            // InternalXacro.g:7366:1: ( 'box' )
            // InternalXacro.g:7367:2: 'box'
            {
             before(grammarAccess.getGeometryAccess().getBoxKeyword_3_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getGeometryAccess().getBoxKeyword_3_0()); 

            }


            }

        }
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
    // InternalXacro.g:7376:1: rule__Geometry__Group_3__1 : rule__Geometry__Group_3__1__Impl ;
    public final void rule__Geometry__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7380:1: ( rule__Geometry__Group_3__1__Impl )
            // InternalXacro.g:7381:2: rule__Geometry__Group_3__1__Impl
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
    // InternalXacro.g:7387:1: rule__Geometry__Group_3__1__Impl : ( ( rule__Geometry__BoxAssignment_3_1 ) ) ;
    public final void rule__Geometry__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7391:1: ( ( ( rule__Geometry__BoxAssignment_3_1 ) ) )
            // InternalXacro.g:7392:1: ( ( rule__Geometry__BoxAssignment_3_1 ) )
            {
            // InternalXacro.g:7392:1: ( ( rule__Geometry__BoxAssignment_3_1 ) )
            // InternalXacro.g:7393:2: ( rule__Geometry__BoxAssignment_3_1 )
            {
             before(grammarAccess.getGeometryAccess().getBoxAssignment_3_1()); 
            // InternalXacro.g:7394:2: ( rule__Geometry__BoxAssignment_3_1 )
            // InternalXacro.g:7394:3: rule__Geometry__BoxAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__BoxAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGeometryAccess().getBoxAssignment_3_1()); 

            }


            }

        }
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
    // InternalXacro.g:7403:1: rule__Geometry__Group_4__0 : rule__Geometry__Group_4__0__Impl rule__Geometry__Group_4__1 ;
    public final void rule__Geometry__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7407:1: ( rule__Geometry__Group_4__0__Impl rule__Geometry__Group_4__1 )
            // InternalXacro.g:7408:2: rule__Geometry__Group_4__0__Impl rule__Geometry__Group_4__1
            {
            pushFollow(FOLLOW_56);
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
    // InternalXacro.g:7415:1: rule__Geometry__Group_4__0__Impl : ( 'cylinder' ) ;
    public final void rule__Geometry__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7419:1: ( ( 'cylinder' ) )
            // InternalXacro.g:7420:1: ( 'cylinder' )
            {
            // InternalXacro.g:7420:1: ( 'cylinder' )
            // InternalXacro.g:7421:2: 'cylinder'
            {
             before(grammarAccess.getGeometryAccess().getCylinderKeyword_4_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getGeometryAccess().getCylinderKeyword_4_0()); 

            }


            }

        }
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
    // InternalXacro.g:7430:1: rule__Geometry__Group_4__1 : rule__Geometry__Group_4__1__Impl ;
    public final void rule__Geometry__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7434:1: ( rule__Geometry__Group_4__1__Impl )
            // InternalXacro.g:7435:2: rule__Geometry__Group_4__1__Impl
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
    // InternalXacro.g:7441:1: rule__Geometry__Group_4__1__Impl : ( ( rule__Geometry__CylinderAssignment_4_1 ) ) ;
    public final void rule__Geometry__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7445:1: ( ( ( rule__Geometry__CylinderAssignment_4_1 ) ) )
            // InternalXacro.g:7446:1: ( ( rule__Geometry__CylinderAssignment_4_1 ) )
            {
            // InternalXacro.g:7446:1: ( ( rule__Geometry__CylinderAssignment_4_1 ) )
            // InternalXacro.g:7447:2: ( rule__Geometry__CylinderAssignment_4_1 )
            {
             before(grammarAccess.getGeometryAccess().getCylinderAssignment_4_1()); 
            // InternalXacro.g:7448:2: ( rule__Geometry__CylinderAssignment_4_1 )
            // InternalXacro.g:7448:3: rule__Geometry__CylinderAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__CylinderAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGeometryAccess().getCylinderAssignment_4_1()); 

            }


            }

        }
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
    // InternalXacro.g:7457:1: rule__Geometry__Group_5__0 : rule__Geometry__Group_5__0__Impl rule__Geometry__Group_5__1 ;
    public final void rule__Geometry__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7461:1: ( rule__Geometry__Group_5__0__Impl rule__Geometry__Group_5__1 )
            // InternalXacro.g:7462:2: rule__Geometry__Group_5__0__Impl rule__Geometry__Group_5__1
            {
            pushFollow(FOLLOW_57);
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
    // InternalXacro.g:7469:1: rule__Geometry__Group_5__0__Impl : ( 'sphere' ) ;
    public final void rule__Geometry__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7473:1: ( ( 'sphere' ) )
            // InternalXacro.g:7474:1: ( 'sphere' )
            {
            // InternalXacro.g:7474:1: ( 'sphere' )
            // InternalXacro.g:7475:2: 'sphere'
            {
             before(grammarAccess.getGeometryAccess().getSphereKeyword_5_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getGeometryAccess().getSphereKeyword_5_0()); 

            }


            }

        }
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
    // InternalXacro.g:7484:1: rule__Geometry__Group_5__1 : rule__Geometry__Group_5__1__Impl ;
    public final void rule__Geometry__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7488:1: ( rule__Geometry__Group_5__1__Impl )
            // InternalXacro.g:7489:2: rule__Geometry__Group_5__1__Impl
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
    // InternalXacro.g:7495:1: rule__Geometry__Group_5__1__Impl : ( ( rule__Geometry__SphereAssignment_5_1 ) ) ;
    public final void rule__Geometry__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7499:1: ( ( ( rule__Geometry__SphereAssignment_5_1 ) ) )
            // InternalXacro.g:7500:1: ( ( rule__Geometry__SphereAssignment_5_1 ) )
            {
            // InternalXacro.g:7500:1: ( ( rule__Geometry__SphereAssignment_5_1 ) )
            // InternalXacro.g:7501:2: ( rule__Geometry__SphereAssignment_5_1 )
            {
             before(grammarAccess.getGeometryAccess().getSphereAssignment_5_1()); 
            // InternalXacro.g:7502:2: ( rule__Geometry__SphereAssignment_5_1 )
            // InternalXacro.g:7502:3: rule__Geometry__SphereAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__SphereAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getGeometryAccess().getSphereAssignment_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Geometry__Group_6__0"
    // InternalXacro.g:7511:1: rule__Geometry__Group_6__0 : rule__Geometry__Group_6__0__Impl rule__Geometry__Group_6__1 ;
    public final void rule__Geometry__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7515:1: ( rule__Geometry__Group_6__0__Impl rule__Geometry__Group_6__1 )
            // InternalXacro.g:7516:2: rule__Geometry__Group_6__0__Impl rule__Geometry__Group_6__1
            {
            pushFollow(FOLLOW_58);
            rule__Geometry__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geometry__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_6__0"


    // $ANTLR start "rule__Geometry__Group_6__0__Impl"
    // InternalXacro.g:7523:1: rule__Geometry__Group_6__0__Impl : ( 'mesh' ) ;
    public final void rule__Geometry__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7527:1: ( ( 'mesh' ) )
            // InternalXacro.g:7528:1: ( 'mesh' )
            {
            // InternalXacro.g:7528:1: ( 'mesh' )
            // InternalXacro.g:7529:2: 'mesh'
            {
             before(grammarAccess.getGeometryAccess().getMeshKeyword_6_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getGeometryAccess().getMeshKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_6__0__Impl"


    // $ANTLR start "rule__Geometry__Group_6__1"
    // InternalXacro.g:7538:1: rule__Geometry__Group_6__1 : rule__Geometry__Group_6__1__Impl ;
    public final void rule__Geometry__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7542:1: ( rule__Geometry__Group_6__1__Impl )
            // InternalXacro.g:7543:2: rule__Geometry__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_6__1"


    // $ANTLR start "rule__Geometry__Group_6__1__Impl"
    // InternalXacro.g:7549:1: rule__Geometry__Group_6__1__Impl : ( ( rule__Geometry__MeshAssignment_6_1 ) ) ;
    public final void rule__Geometry__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7553:1: ( ( ( rule__Geometry__MeshAssignment_6_1 ) ) )
            // InternalXacro.g:7554:1: ( ( rule__Geometry__MeshAssignment_6_1 ) )
            {
            // InternalXacro.g:7554:1: ( ( rule__Geometry__MeshAssignment_6_1 ) )
            // InternalXacro.g:7555:2: ( rule__Geometry__MeshAssignment_6_1 )
            {
             before(grammarAccess.getGeometryAccess().getMeshAssignment_6_1()); 
            // InternalXacro.g:7556:2: ( rule__Geometry__MeshAssignment_6_1 )
            // InternalXacro.g:7556:3: rule__Geometry__MeshAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__MeshAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getGeometryAccess().getMeshAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_6__1__Impl"


    // $ANTLR start "rule__Box__Group__0"
    // InternalXacro.g:7565:1: rule__Box__Group__0 : rule__Box__Group__0__Impl rule__Box__Group__1 ;
    public final void rule__Box__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7569:1: ( rule__Box__Group__0__Impl rule__Box__Group__1 )
            // InternalXacro.g:7570:2: rule__Box__Group__0__Impl rule__Box__Group__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalXacro.g:7577:1: rule__Box__Group__0__Impl : ( () ) ;
    public final void rule__Box__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7581:1: ( ( () ) )
            // InternalXacro.g:7582:1: ( () )
            {
            // InternalXacro.g:7582:1: ( () )
            // InternalXacro.g:7583:2: ()
            {
             before(grammarAccess.getBoxAccess().getBoxAction_0()); 
            // InternalXacro.g:7584:2: ()
            // InternalXacro.g:7584:3: 
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
    // InternalXacro.g:7592:1: rule__Box__Group__1 : rule__Box__Group__1__Impl rule__Box__Group__2 ;
    public final void rule__Box__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7596:1: ( rule__Box__Group__1__Impl rule__Box__Group__2 )
            // InternalXacro.g:7597:2: rule__Box__Group__1__Impl rule__Box__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalXacro.g:7604:1: rule__Box__Group__1__Impl : ( 'Box' ) ;
    public final void rule__Box__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7608:1: ( ( 'Box' ) )
            // InternalXacro.g:7609:1: ( 'Box' )
            {
            // InternalXacro.g:7609:1: ( 'Box' )
            // InternalXacro.g:7610:2: 'Box'
            {
             before(grammarAccess.getBoxAccess().getBoxKeyword_1()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getBoxKeyword_1()); 

            }


            }

        }
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
    // InternalXacro.g:7619:1: rule__Box__Group__2 : rule__Box__Group__2__Impl rule__Box__Group__3 ;
    public final void rule__Box__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7623:1: ( rule__Box__Group__2__Impl rule__Box__Group__3 )
            // InternalXacro.g:7624:2: rule__Box__Group__2__Impl rule__Box__Group__3
            {
            pushFollow(FOLLOW_59);
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
    // InternalXacro.g:7631:1: rule__Box__Group__2__Impl : ( '{' ) ;
    public final void rule__Box__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7635:1: ( ( '{' ) )
            // InternalXacro.g:7636:1: ( '{' )
            {
            // InternalXacro.g:7636:1: ( '{' )
            // InternalXacro.g:7637:2: '{'
            {
             before(grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalXacro.g:7646:1: rule__Box__Group__3 : rule__Box__Group__3__Impl rule__Box__Group__4 ;
    public final void rule__Box__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7650:1: ( rule__Box__Group__3__Impl rule__Box__Group__4 )
            // InternalXacro.g:7651:2: rule__Box__Group__3__Impl rule__Box__Group__4
            {
            pushFollow(FOLLOW_59);
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
    // InternalXacro.g:7658:1: rule__Box__Group__3__Impl : ( ( rule__Box__Group_3__0 )? ) ;
    public final void rule__Box__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7662:1: ( ( ( rule__Box__Group_3__0 )? ) )
            // InternalXacro.g:7663:1: ( ( rule__Box__Group_3__0 )? )
            {
            // InternalXacro.g:7663:1: ( ( rule__Box__Group_3__0 )? )
            // InternalXacro.g:7664:2: ( rule__Box__Group_3__0 )?
            {
             before(grammarAccess.getBoxAccess().getGroup_3()); 
            // InternalXacro.g:7665:2: ( rule__Box__Group_3__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==76) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalXacro.g:7665:3: rule__Box__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Box__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoxAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalXacro.g:7673:1: rule__Box__Group__4 : rule__Box__Group__4__Impl ;
    public final void rule__Box__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7677:1: ( rule__Box__Group__4__Impl )
            // InternalXacro.g:7678:2: rule__Box__Group__4__Impl
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
    // InternalXacro.g:7684:1: rule__Box__Group__4__Impl : ( '}' ) ;
    public final void rule__Box__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7688:1: ( ( '}' ) )
            // InternalXacro.g:7689:1: ( '}' )
            {
            // InternalXacro.g:7689:1: ( '}' )
            // InternalXacro.g:7690:2: '}'
            {
             before(grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Box__Group_3__0"
    // InternalXacro.g:7700:1: rule__Box__Group_3__0 : rule__Box__Group_3__0__Impl rule__Box__Group_3__1 ;
    public final void rule__Box__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7704:1: ( rule__Box__Group_3__0__Impl rule__Box__Group_3__1 )
            // InternalXacro.g:7705:2: rule__Box__Group_3__0__Impl rule__Box__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__Box__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_3__0"


    // $ANTLR start "rule__Box__Group_3__0__Impl"
    // InternalXacro.g:7712:1: rule__Box__Group_3__0__Impl : ( 'size' ) ;
    public final void rule__Box__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7716:1: ( ( 'size' ) )
            // InternalXacro.g:7717:1: ( 'size' )
            {
            // InternalXacro.g:7717:1: ( 'size' )
            // InternalXacro.g:7718:2: 'size'
            {
             before(grammarAccess.getBoxAccess().getSizeKeyword_3_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getSizeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_3__0__Impl"


    // $ANTLR start "rule__Box__Group_3__1"
    // InternalXacro.g:7727:1: rule__Box__Group_3__1 : rule__Box__Group_3__1__Impl ;
    public final void rule__Box__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7731:1: ( rule__Box__Group_3__1__Impl )
            // InternalXacro.g:7732:2: rule__Box__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_3__1"


    // $ANTLR start "rule__Box__Group_3__1__Impl"
    // InternalXacro.g:7738:1: rule__Box__Group_3__1__Impl : ( ( rule__Box__SizeAssignment_3_1 ) ) ;
    public final void rule__Box__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7742:1: ( ( ( rule__Box__SizeAssignment_3_1 ) ) )
            // InternalXacro.g:7743:1: ( ( rule__Box__SizeAssignment_3_1 ) )
            {
            // InternalXacro.g:7743:1: ( ( rule__Box__SizeAssignment_3_1 ) )
            // InternalXacro.g:7744:2: ( rule__Box__SizeAssignment_3_1 )
            {
             before(grammarAccess.getBoxAccess().getSizeAssignment_3_1()); 
            // InternalXacro.g:7745:2: ( rule__Box__SizeAssignment_3_1 )
            // InternalXacro.g:7745:3: rule__Box__SizeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Box__SizeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getSizeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_3__1__Impl"


    // $ANTLR start "rule__Cylinder__Group__0"
    // InternalXacro.g:7754:1: rule__Cylinder__Group__0 : rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 ;
    public final void rule__Cylinder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7758:1: ( rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 )
            // InternalXacro.g:7759:2: rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalXacro.g:7766:1: rule__Cylinder__Group__0__Impl : ( 'Cylinder' ) ;
    public final void rule__Cylinder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7770:1: ( ( 'Cylinder' ) )
            // InternalXacro.g:7771:1: ( 'Cylinder' )
            {
            // InternalXacro.g:7771:1: ( 'Cylinder' )
            // InternalXacro.g:7772:2: 'Cylinder'
            {
             before(grammarAccess.getCylinderAccess().getCylinderKeyword_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getCylinderKeyword_0()); 

            }


            }

        }
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
    // InternalXacro.g:7781:1: rule__Cylinder__Group__1 : rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 ;
    public final void rule__Cylinder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7785:1: ( rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 )
            // InternalXacro.g:7786:2: rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2
            {
            pushFollow(FOLLOW_60);
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
    // InternalXacro.g:7793:1: rule__Cylinder__Group__1__Impl : ( '{' ) ;
    public final void rule__Cylinder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7797:1: ( ( '{' ) )
            // InternalXacro.g:7798:1: ( '{' )
            {
            // InternalXacro.g:7798:1: ( '{' )
            // InternalXacro.g:7799:2: '{'
            {
             before(grammarAccess.getCylinderAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalXacro.g:7808:1: rule__Cylinder__Group__2 : rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 ;
    public final void rule__Cylinder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7812:1: ( rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 )
            // InternalXacro.g:7813:2: rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3
            {
            pushFollow(FOLLOW_47);
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
    // InternalXacro.g:7820:1: rule__Cylinder__Group__2__Impl : ( 'length' ) ;
    public final void rule__Cylinder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7824:1: ( ( 'length' ) )
            // InternalXacro.g:7825:1: ( 'length' )
            {
            // InternalXacro.g:7825:1: ( 'length' )
            // InternalXacro.g:7826:2: 'length'
            {
             before(grammarAccess.getCylinderAccess().getLengthKeyword_2()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getLengthKeyword_2()); 

            }


            }

        }
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
    // InternalXacro.g:7835:1: rule__Cylinder__Group__3 : rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 ;
    public final void rule__Cylinder__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7839:1: ( rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 )
            // InternalXacro.g:7840:2: rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4
            {
            pushFollow(FOLLOW_61);
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
    // InternalXacro.g:7847:1: rule__Cylinder__Group__3__Impl : ( ( rule__Cylinder__LengthAssignment_3 ) ) ;
    public final void rule__Cylinder__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7851:1: ( ( ( rule__Cylinder__LengthAssignment_3 ) ) )
            // InternalXacro.g:7852:1: ( ( rule__Cylinder__LengthAssignment_3 ) )
            {
            // InternalXacro.g:7852:1: ( ( rule__Cylinder__LengthAssignment_3 ) )
            // InternalXacro.g:7853:2: ( rule__Cylinder__LengthAssignment_3 )
            {
             before(grammarAccess.getCylinderAccess().getLengthAssignment_3()); 
            // InternalXacro.g:7854:2: ( rule__Cylinder__LengthAssignment_3 )
            // InternalXacro.g:7854:3: rule__Cylinder__LengthAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__LengthAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getLengthAssignment_3()); 

            }


            }

        }
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
    // InternalXacro.g:7862:1: rule__Cylinder__Group__4 : rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 ;
    public final void rule__Cylinder__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7866:1: ( rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 )
            // InternalXacro.g:7867:2: rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5
            {
            pushFollow(FOLLOW_47);
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
    // InternalXacro.g:7874:1: rule__Cylinder__Group__4__Impl : ( 'radius' ) ;
    public final void rule__Cylinder__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7878:1: ( ( 'radius' ) )
            // InternalXacro.g:7879:1: ( 'radius' )
            {
            // InternalXacro.g:7879:1: ( 'radius' )
            // InternalXacro.g:7880:2: 'radius'
            {
             before(grammarAccess.getCylinderAccess().getRadiusKeyword_4()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getRadiusKeyword_4()); 

            }


            }

        }
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
    // InternalXacro.g:7889:1: rule__Cylinder__Group__5 : rule__Cylinder__Group__5__Impl rule__Cylinder__Group__6 ;
    public final void rule__Cylinder__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7893:1: ( rule__Cylinder__Group__5__Impl rule__Cylinder__Group__6 )
            // InternalXacro.g:7894:2: rule__Cylinder__Group__5__Impl rule__Cylinder__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__Cylinder__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__6();

            state._fsp--;


            }

        }
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
    // InternalXacro.g:7901:1: rule__Cylinder__Group__5__Impl : ( ( rule__Cylinder__RadiusAssignment_5 ) ) ;
    public final void rule__Cylinder__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7905:1: ( ( ( rule__Cylinder__RadiusAssignment_5 ) ) )
            // InternalXacro.g:7906:1: ( ( rule__Cylinder__RadiusAssignment_5 ) )
            {
            // InternalXacro.g:7906:1: ( ( rule__Cylinder__RadiusAssignment_5 ) )
            // InternalXacro.g:7907:2: ( rule__Cylinder__RadiusAssignment_5 )
            {
             before(grammarAccess.getCylinderAccess().getRadiusAssignment_5()); 
            // InternalXacro.g:7908:2: ( rule__Cylinder__RadiusAssignment_5 )
            // InternalXacro.g:7908:3: rule__Cylinder__RadiusAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__RadiusAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getRadiusAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Cylinder__Group__6"
    // InternalXacro.g:7916:1: rule__Cylinder__Group__6 : rule__Cylinder__Group__6__Impl ;
    public final void rule__Cylinder__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7920:1: ( rule__Cylinder__Group__6__Impl )
            // InternalXacro.g:7921:2: rule__Cylinder__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__6"


    // $ANTLR start "rule__Cylinder__Group__6__Impl"
    // InternalXacro.g:7927:1: rule__Cylinder__Group__6__Impl : ( '}' ) ;
    public final void rule__Cylinder__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7931:1: ( ( '}' ) )
            // InternalXacro.g:7932:1: ( '}' )
            {
            // InternalXacro.g:7932:1: ( '}' )
            // InternalXacro.g:7933:2: '}'
            {
             before(grammarAccess.getCylinderAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__6__Impl"


    // $ANTLR start "rule__Sphere__Group__0"
    // InternalXacro.g:7943:1: rule__Sphere__Group__0 : rule__Sphere__Group__0__Impl rule__Sphere__Group__1 ;
    public final void rule__Sphere__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7947:1: ( rule__Sphere__Group__0__Impl rule__Sphere__Group__1 )
            // InternalXacro.g:7948:2: rule__Sphere__Group__0__Impl rule__Sphere__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalXacro.g:7955:1: rule__Sphere__Group__0__Impl : ( 'Sphere' ) ;
    public final void rule__Sphere__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7959:1: ( ( 'Sphere' ) )
            // InternalXacro.g:7960:1: ( 'Sphere' )
            {
            // InternalXacro.g:7960:1: ( 'Sphere' )
            // InternalXacro.g:7961:2: 'Sphere'
            {
             before(grammarAccess.getSphereAccess().getSphereKeyword_0()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getSphereKeyword_0()); 

            }


            }

        }
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
    // InternalXacro.g:7970:1: rule__Sphere__Group__1 : rule__Sphere__Group__1__Impl rule__Sphere__Group__2 ;
    public final void rule__Sphere__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7974:1: ( rule__Sphere__Group__1__Impl rule__Sphere__Group__2 )
            // InternalXacro.g:7975:2: rule__Sphere__Group__1__Impl rule__Sphere__Group__2
            {
            pushFollow(FOLLOW_61);
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
    // InternalXacro.g:7982:1: rule__Sphere__Group__1__Impl : ( '{' ) ;
    public final void rule__Sphere__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:7986:1: ( ( '{' ) )
            // InternalXacro.g:7987:1: ( '{' )
            {
            // InternalXacro.g:7987:1: ( '{' )
            // InternalXacro.g:7988:2: '{'
            {
             before(grammarAccess.getSphereAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalXacro.g:7997:1: rule__Sphere__Group__2 : rule__Sphere__Group__2__Impl rule__Sphere__Group__3 ;
    public final void rule__Sphere__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8001:1: ( rule__Sphere__Group__2__Impl rule__Sphere__Group__3 )
            // InternalXacro.g:8002:2: rule__Sphere__Group__2__Impl rule__Sphere__Group__3
            {
            pushFollow(FOLLOW_47);
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
    // InternalXacro.g:8009:1: rule__Sphere__Group__2__Impl : ( 'radius' ) ;
    public final void rule__Sphere__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8013:1: ( ( 'radius' ) )
            // InternalXacro.g:8014:1: ( 'radius' )
            {
            // InternalXacro.g:8014:1: ( 'radius' )
            // InternalXacro.g:8015:2: 'radius'
            {
             before(grammarAccess.getSphereAccess().getRadiusKeyword_2()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getRadiusKeyword_2()); 

            }


            }

        }
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
    // InternalXacro.g:8024:1: rule__Sphere__Group__3 : rule__Sphere__Group__3__Impl rule__Sphere__Group__4 ;
    public final void rule__Sphere__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8028:1: ( rule__Sphere__Group__3__Impl rule__Sphere__Group__4 )
            // InternalXacro.g:8029:2: rule__Sphere__Group__3__Impl rule__Sphere__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Sphere__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__4();

            state._fsp--;


            }

        }
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
    // InternalXacro.g:8036:1: rule__Sphere__Group__3__Impl : ( ( rule__Sphere__RadiusAssignment_3 ) ) ;
    public final void rule__Sphere__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8040:1: ( ( ( rule__Sphere__RadiusAssignment_3 ) ) )
            // InternalXacro.g:8041:1: ( ( rule__Sphere__RadiusAssignment_3 ) )
            {
            // InternalXacro.g:8041:1: ( ( rule__Sphere__RadiusAssignment_3 ) )
            // InternalXacro.g:8042:2: ( rule__Sphere__RadiusAssignment_3 )
            {
             before(grammarAccess.getSphereAccess().getRadiusAssignment_3()); 
            // InternalXacro.g:8043:2: ( rule__Sphere__RadiusAssignment_3 )
            // InternalXacro.g:8043:3: rule__Sphere__RadiusAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__RadiusAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSphereAccess().getRadiusAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Sphere__Group__4"
    // InternalXacro.g:8051:1: rule__Sphere__Group__4 : rule__Sphere__Group__4__Impl ;
    public final void rule__Sphere__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8055:1: ( rule__Sphere__Group__4__Impl )
            // InternalXacro.g:8056:2: rule__Sphere__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__4"


    // $ANTLR start "rule__Sphere__Group__4__Impl"
    // InternalXacro.g:8062:1: rule__Sphere__Group__4__Impl : ( '}' ) ;
    public final void rule__Sphere__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8066:1: ( ( '}' ) )
            // InternalXacro.g:8067:1: ( '}' )
            {
            // InternalXacro.g:8067:1: ( '}' )
            // InternalXacro.g:8068:2: '}'
            {
             before(grammarAccess.getSphereAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__4__Impl"


    // $ANTLR start "rule__Mesh__Group__0"
    // InternalXacro.g:8078:1: rule__Mesh__Group__0 : rule__Mesh__Group__0__Impl rule__Mesh__Group__1 ;
    public final void rule__Mesh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8082:1: ( rule__Mesh__Group__0__Impl rule__Mesh__Group__1 )
            // InternalXacro.g:8083:2: rule__Mesh__Group__0__Impl rule__Mesh__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalXacro.g:8090:1: rule__Mesh__Group__0__Impl : ( 'Mesh' ) ;
    public final void rule__Mesh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8094:1: ( ( 'Mesh' ) )
            // InternalXacro.g:8095:1: ( 'Mesh' )
            {
            // InternalXacro.g:8095:1: ( 'Mesh' )
            // InternalXacro.g:8096:2: 'Mesh'
            {
             before(grammarAccess.getMeshAccess().getMeshKeyword_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getMeshKeyword_0()); 

            }


            }

        }
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
    // InternalXacro.g:8105:1: rule__Mesh__Group__1 : rule__Mesh__Group__1__Impl rule__Mesh__Group__2 ;
    public final void rule__Mesh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8109:1: ( rule__Mesh__Group__1__Impl rule__Mesh__Group__2 )
            // InternalXacro.g:8110:2: rule__Mesh__Group__1__Impl rule__Mesh__Group__2
            {
            pushFollow(FOLLOW_62);
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
    // InternalXacro.g:8117:1: rule__Mesh__Group__1__Impl : ( '{' ) ;
    public final void rule__Mesh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8121:1: ( ( '{' ) )
            // InternalXacro.g:8122:1: ( '{' )
            {
            // InternalXacro.g:8122:1: ( '{' )
            // InternalXacro.g:8123:2: '{'
            {
             before(grammarAccess.getMeshAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalXacro.g:8132:1: rule__Mesh__Group__2 : rule__Mesh__Group__2__Impl rule__Mesh__Group__3 ;
    public final void rule__Mesh__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8136:1: ( rule__Mesh__Group__2__Impl rule__Mesh__Group__3 )
            // InternalXacro.g:8137:2: rule__Mesh__Group__2__Impl rule__Mesh__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalXacro.g:8144:1: rule__Mesh__Group__2__Impl : ( 'filename' ) ;
    public final void rule__Mesh__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8148:1: ( ( 'filename' ) )
            // InternalXacro.g:8149:1: ( 'filename' )
            {
            // InternalXacro.g:8149:1: ( 'filename' )
            // InternalXacro.g:8150:2: 'filename'
            {
             before(grammarAccess.getMeshAccess().getFilenameKeyword_2()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getFilenameKeyword_2()); 

            }


            }

        }
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
    // InternalXacro.g:8159:1: rule__Mesh__Group__3 : rule__Mesh__Group__3__Impl rule__Mesh__Group__4 ;
    public final void rule__Mesh__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8163:1: ( rule__Mesh__Group__3__Impl rule__Mesh__Group__4 )
            // InternalXacro.g:8164:2: rule__Mesh__Group__3__Impl rule__Mesh__Group__4
            {
            pushFollow(FOLLOW_63);
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
    // InternalXacro.g:8171:1: rule__Mesh__Group__3__Impl : ( ( rule__Mesh__FilenameAssignment_3 ) ) ;
    public final void rule__Mesh__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8175:1: ( ( ( rule__Mesh__FilenameAssignment_3 ) ) )
            // InternalXacro.g:8176:1: ( ( rule__Mesh__FilenameAssignment_3 ) )
            {
            // InternalXacro.g:8176:1: ( ( rule__Mesh__FilenameAssignment_3 ) )
            // InternalXacro.g:8177:2: ( rule__Mesh__FilenameAssignment_3 )
            {
             before(grammarAccess.getMeshAccess().getFilenameAssignment_3()); 
            // InternalXacro.g:8178:2: ( rule__Mesh__FilenameAssignment_3 )
            // InternalXacro.g:8178:3: rule__Mesh__FilenameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__FilenameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMeshAccess().getFilenameAssignment_3()); 

            }


            }

        }
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
    // InternalXacro.g:8186:1: rule__Mesh__Group__4 : rule__Mesh__Group__4__Impl rule__Mesh__Group__5 ;
    public final void rule__Mesh__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8190:1: ( rule__Mesh__Group__4__Impl rule__Mesh__Group__5 )
            // InternalXacro.g:8191:2: rule__Mesh__Group__4__Impl rule__Mesh__Group__5
            {
            pushFollow(FOLLOW_63);
            rule__Mesh__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group__5();

            state._fsp--;


            }

        }
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
    // InternalXacro.g:8198:1: rule__Mesh__Group__4__Impl : ( ( rule__Mesh__Group_4__0 )? ) ;
    public final void rule__Mesh__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8202:1: ( ( ( rule__Mesh__Group_4__0 )? ) )
            // InternalXacro.g:8203:1: ( ( rule__Mesh__Group_4__0 )? )
            {
            // InternalXacro.g:8203:1: ( ( rule__Mesh__Group_4__0 )? )
            // InternalXacro.g:8204:2: ( rule__Mesh__Group_4__0 )?
            {
             before(grammarAccess.getMeshAccess().getGroup_4()); 
            // InternalXacro.g:8205:2: ( rule__Mesh__Group_4__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==83) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalXacro.g:8205:3: rule__Mesh__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mesh__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeshAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Mesh__Group__5"
    // InternalXacro.g:8213:1: rule__Mesh__Group__5 : rule__Mesh__Group__5__Impl ;
    public final void rule__Mesh__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8217:1: ( rule__Mesh__Group__5__Impl )
            // InternalXacro.g:8218:2: rule__Mesh__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__5"


    // $ANTLR start "rule__Mesh__Group__5__Impl"
    // InternalXacro.g:8224:1: rule__Mesh__Group__5__Impl : ( '}' ) ;
    public final void rule__Mesh__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8228:1: ( ( '}' ) )
            // InternalXacro.g:8229:1: ( '}' )
            {
            // InternalXacro.g:8229:1: ( '}' )
            // InternalXacro.g:8230:2: '}'
            {
             before(grammarAccess.getMeshAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__5__Impl"


    // $ANTLR start "rule__Mesh__Group_4__0"
    // InternalXacro.g:8240:1: rule__Mesh__Group_4__0 : rule__Mesh__Group_4__0__Impl rule__Mesh__Group_4__1 ;
    public final void rule__Mesh__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8244:1: ( rule__Mesh__Group_4__0__Impl rule__Mesh__Group_4__1 )
            // InternalXacro.g:8245:2: rule__Mesh__Group_4__0__Impl rule__Mesh__Group_4__1
            {
            pushFollow(FOLLOW_47);
            rule__Mesh__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_4__0"


    // $ANTLR start "rule__Mesh__Group_4__0__Impl"
    // InternalXacro.g:8252:1: rule__Mesh__Group_4__0__Impl : ( 'scale' ) ;
    public final void rule__Mesh__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8256:1: ( ( 'scale' ) )
            // InternalXacro.g:8257:1: ( 'scale' )
            {
            // InternalXacro.g:8257:1: ( 'scale' )
            // InternalXacro.g:8258:2: 'scale'
            {
             before(grammarAccess.getMeshAccess().getScaleKeyword_4_0()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getScaleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_4__0__Impl"


    // $ANTLR start "rule__Mesh__Group_4__1"
    // InternalXacro.g:8267:1: rule__Mesh__Group_4__1 : rule__Mesh__Group_4__1__Impl ;
    public final void rule__Mesh__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8271:1: ( rule__Mesh__Group_4__1__Impl )
            // InternalXacro.g:8272:2: rule__Mesh__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_4__1"


    // $ANTLR start "rule__Mesh__Group_4__1__Impl"
    // InternalXacro.g:8278:1: rule__Mesh__Group_4__1__Impl : ( ( rule__Mesh__ScaleAssignment_4_1 ) ) ;
    public final void rule__Mesh__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8282:1: ( ( ( rule__Mesh__ScaleAssignment_4_1 ) ) )
            // InternalXacro.g:8283:1: ( ( rule__Mesh__ScaleAssignment_4_1 ) )
            {
            // InternalXacro.g:8283:1: ( ( rule__Mesh__ScaleAssignment_4_1 ) )
            // InternalXacro.g:8284:2: ( rule__Mesh__ScaleAssignment_4_1 )
            {
             before(grammarAccess.getMeshAccess().getScaleAssignment_4_1()); 
            // InternalXacro.g:8285:2: ( rule__Mesh__ScaleAssignment_4_1 )
            // InternalXacro.g:8285:3: rule__Mesh__ScaleAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__ScaleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMeshAccess().getScaleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_4__1__Impl"


    // $ANTLR start "rule__Robot__NameAssignment_4"
    // InternalXacro.g:8294:1: rule__Robot__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Robot__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8298:1: ( ( RULE_ID ) )
            // InternalXacro.g:8299:2: ( RULE_ID )
            {
            // InternalXacro.g:8299:2: ( RULE_ID )
            // InternalXacro.g:8300:3: RULE_ID
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
    // InternalXacro.g:8309:1: rule__Robot__VersionAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Robot__VersionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8313:1: ( ( RULE_STRING ) )
            // InternalXacro.g:8314:2: ( RULE_STRING )
            {
            // InternalXacro.g:8314:2: ( RULE_STRING )
            // InternalXacro.g:8315:3: RULE_STRING
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


    // $ANTLR start "rule__Robot__MacroAssignment_6_2"
    // InternalXacro.g:8324:1: rule__Robot__MacroAssignment_6_2 : ( ruleMacro ) ;
    public final void rule__Robot__MacroAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8328:1: ( ( ruleMacro ) )
            // InternalXacro.g:8329:2: ( ruleMacro )
            {
            // InternalXacro.g:8329:2: ( ruleMacro )
            // InternalXacro.g:8330:3: ruleMacro
            {
             before(grammarAccess.getRobotAccess().getMacroMacroParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMacro();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getMacroMacroParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__MacroAssignment_6_2"


    // $ANTLR start "rule__Robot__MacroAssignment_6_3_1"
    // InternalXacro.g:8339:1: rule__Robot__MacroAssignment_6_3_1 : ( ruleMacro ) ;
    public final void rule__Robot__MacroAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8343:1: ( ( ruleMacro ) )
            // InternalXacro.g:8344:2: ( ruleMacro )
            {
            // InternalXacro.g:8344:2: ( ruleMacro )
            // InternalXacro.g:8345:3: ruleMacro
            {
             before(grammarAccess.getRobotAccess().getMacroMacroParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMacro();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getMacroMacroParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__MacroAssignment_6_3_1"


    // $ANTLR start "rule__Robot__MacroCallAssignment_7_2"
    // InternalXacro.g:8354:1: rule__Robot__MacroCallAssignment_7_2 : ( ruleMacroCall ) ;
    public final void rule__Robot__MacroCallAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8358:1: ( ( ruleMacroCall ) )
            // InternalXacro.g:8359:2: ( ruleMacroCall )
            {
            // InternalXacro.g:8359:2: ( ruleMacroCall )
            // InternalXacro.g:8360:3: ruleMacroCall
            {
             before(grammarAccess.getRobotAccess().getMacroCallMacroCallParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMacroCall();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getMacroCallMacroCallParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__MacroCallAssignment_7_2"


    // $ANTLR start "rule__Robot__MacroCallAssignment_7_3_1"
    // InternalXacro.g:8369:1: rule__Robot__MacroCallAssignment_7_3_1 : ( ruleMacroCall ) ;
    public final void rule__Robot__MacroCallAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8373:1: ( ( ruleMacroCall ) )
            // InternalXacro.g:8374:2: ( ruleMacroCall )
            {
            // InternalXacro.g:8374:2: ( ruleMacroCall )
            // InternalXacro.g:8375:3: ruleMacroCall
            {
             before(grammarAccess.getRobotAccess().getMacroCallMacroCallParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMacroCall();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getMacroCallMacroCallParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__MacroCallAssignment_7_3_1"


    // $ANTLR start "rule__Robot__BodyAssignment_8_1"
    // InternalXacro.g:8384:1: rule__Robot__BodyAssignment_8_1 : ( ruleBody ) ;
    public final void rule__Robot__BodyAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8388:1: ( ( ruleBody ) )
            // InternalXacro.g:8389:2: ( ruleBody )
            {
            // InternalXacro.g:8389:2: ( ruleBody )
            // InternalXacro.g:8390:3: ruleBody
            {
             before(grammarAccess.getRobotAccess().getBodyBodyParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getBodyBodyParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__BodyAssignment_8_1"


    // $ANTLR start "rule__Macro__NameAssignment_3"
    // InternalXacro.g:8399:1: rule__Macro__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Macro__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8403:1: ( ( RULE_ID ) )
            // InternalXacro.g:8404:2: ( RULE_ID )
            {
            // InternalXacro.g:8404:2: ( RULE_ID )
            // InternalXacro.g:8405:3: RULE_ID
            {
             before(grammarAccess.getMacroAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMacroAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__NameAssignment_3"


    // $ANTLR start "rule__Macro__ParameterAssignment_4_2"
    // InternalXacro.g:8414:1: rule__Macro__ParameterAssignment_4_2 : ( ruleParameter ) ;
    public final void rule__Macro__ParameterAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8418:1: ( ( ruleParameter ) )
            // InternalXacro.g:8419:2: ( ruleParameter )
            {
            // InternalXacro.g:8419:2: ( ruleParameter )
            // InternalXacro.g:8420:3: ruleParameter
            {
             before(grammarAccess.getMacroAccess().getParameterParameterParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMacroAccess().getParameterParameterParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__ParameterAssignment_4_2"


    // $ANTLR start "rule__Macro__ParameterAssignment_4_3_1"
    // InternalXacro.g:8429:1: rule__Macro__ParameterAssignment_4_3_1 : ( ruleParameter ) ;
    public final void rule__Macro__ParameterAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8433:1: ( ( ruleParameter ) )
            // InternalXacro.g:8434:2: ( ruleParameter )
            {
            // InternalXacro.g:8434:2: ( ruleParameter )
            // InternalXacro.g:8435:3: ruleParameter
            {
             before(grammarAccess.getMacroAccess().getParameterParameterParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMacroAccess().getParameterParameterParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__ParameterAssignment_4_3_1"


    // $ANTLR start "rule__Macro__BodyAssignment_5_1"
    // InternalXacro.g:8444:1: rule__Macro__BodyAssignment_5_1 : ( ruleBody ) ;
    public final void rule__Macro__BodyAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8448:1: ( ( ruleBody ) )
            // InternalXacro.g:8449:2: ( ruleBody )
            {
            // InternalXacro.g:8449:2: ( ruleBody )
            // InternalXacro.g:8450:3: ruleBody
            {
             before(grammarAccess.getMacroAccess().getBodyBodyParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getMacroAccess().getBodyBodyParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Macro__BodyAssignment_5_1"


    // $ANTLR start "rule__Parameter__NameAssignment_2"
    // InternalXacro.g:8459:1: rule__Parameter__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8463:1: ( ( RULE_ID ) )
            // InternalXacro.g:8464:2: ( RULE_ID )
            {
            // InternalXacro.g:8464:2: ( RULE_ID )
            // InternalXacro.g:8465:3: RULE_ID
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


    // $ANTLR start "rule__Parameter__TypeAssignment_5"
    // InternalXacro.g:8474:1: rule__Parameter__TypeAssignment_5 : ( ruleParameterType ) ;
    public final void rule__Parameter__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8478:1: ( ( ruleParameterType ) )
            // InternalXacro.g:8479:2: ( ruleParameterType )
            {
            // InternalXacro.g:8479:2: ( ruleParameterType )
            // InternalXacro.g:8480:3: ruleParameterType
            {
             before(grammarAccess.getParameterAccess().getTypeParameterTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeParameterTypeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_5"


    // $ANTLR start "rule__Parameter__ValueAssignment_6_1"
    // InternalXacro.g:8489:1: rule__Parameter__ValueAssignment_6_1 : ( ruleParameterValue ) ;
    public final void rule__Parameter__ValueAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8493:1: ( ( ruleParameterValue ) )
            // InternalXacro.g:8494:2: ( ruleParameterValue )
            {
            // InternalXacro.g:8494:2: ( ruleParameterValue )
            // InternalXacro.g:8495:3: ruleParameterValue
            {
             before(grammarAccess.getParameterAccess().getValueParameterValueParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getValueParameterValueParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ValueAssignment_6_1"


    // $ANTLR start "rule__ParameterValue__ValueAssignment_0"
    // InternalXacro.g:8504:1: rule__ParameterValue__ValueAssignment_0 : ( RULE_ID ) ;
    public final void rule__ParameterValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8508:1: ( ( RULE_ID ) )
            // InternalXacro.g:8509:2: ( RULE_ID )
            {
            // InternalXacro.g:8509:2: ( RULE_ID )
            // InternalXacro.g:8510:3: RULE_ID
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
    // InternalXacro.g:8519:1: rule__LinkRef__RefAssignment : ( ( RULE_STRING ) ) ;
    public final void rule__LinkRef__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8523:1: ( ( ( RULE_STRING ) ) )
            // InternalXacro.g:8524:2: ( ( RULE_STRING ) )
            {
            // InternalXacro.g:8524:2: ( ( RULE_STRING ) )
            // InternalXacro.g:8525:3: ( RULE_STRING )
            {
             before(grammarAccess.getLinkRefAccess().getRefLinkCrossReference_0()); 
            // InternalXacro.g:8526:3: ( RULE_STRING )
            // InternalXacro.g:8527:4: RULE_STRING
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
    // InternalXacro.g:8538:1: rule__ParameterString__RefAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__ParameterString__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8542:1: ( ( ( RULE_STRING ) ) )
            // InternalXacro.g:8543:2: ( ( RULE_STRING ) )
            {
            // InternalXacro.g:8543:2: ( ( RULE_STRING ) )
            // InternalXacro.g:8544:3: ( RULE_STRING )
            {
             before(grammarAccess.getParameterStringAccess().getRefParameterCrossReference_1_0()); 
            // InternalXacro.g:8545:3: ( RULE_STRING )
            // InternalXacro.g:8546:4: RULE_STRING
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
    // InternalXacro.g:8557:1: rule__ParameterString__ValueAssignment_2 : ( RULE_ID ) ;
    public final void rule__ParameterString__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8561:1: ( ( RULE_ID ) )
            // InternalXacro.g:8562:2: ( RULE_ID )
            {
            // InternalXacro.g:8562:2: ( RULE_ID )
            // InternalXacro.g:8563:3: RULE_ID
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
    // InternalXacro.g:8572:1: rule__ParameterPose__RefAssignment_0 : ( ( RULE_STRING ) ) ;
    public final void rule__ParameterPose__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8576:1: ( ( ( RULE_STRING ) ) )
            // InternalXacro.g:8577:2: ( ( RULE_STRING ) )
            {
            // InternalXacro.g:8577:2: ( ( RULE_STRING ) )
            // InternalXacro.g:8578:3: ( RULE_STRING )
            {
             before(grammarAccess.getParameterPoseAccess().getRefParameterCrossReference_0_0()); 
            // InternalXacro.g:8579:3: ( RULE_STRING )
            // InternalXacro.g:8580:4: RULE_STRING
            {
             before(grammarAccess.getParameterPoseAccess().getRefParameterSTRINGTerminalRuleCall_0_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParameterPoseAccess().getRefParameterSTRINGTerminalRuleCall_0_0_1()); 

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
    // InternalXacro.g:8591:1: rule__ParameterPose__ValueAssignment_1 : ( rulePose ) ;
    public final void rule__ParameterPose__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8595:1: ( ( rulePose ) )
            // InternalXacro.g:8596:2: ( rulePose )
            {
            // InternalXacro.g:8596:2: ( rulePose )
            // InternalXacro.g:8597:3: rulePose
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
    // InternalXacro.g:8606:1: rule__ParameterLink__ParamAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterLink__ParamAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8610:1: ( ( ( RULE_ID ) ) )
            // InternalXacro.g:8611:2: ( ( RULE_ID ) )
            {
            // InternalXacro.g:8611:2: ( ( RULE_ID ) )
            // InternalXacro.g:8612:3: ( RULE_ID )
            {
             before(grammarAccess.getParameterLinkAccess().getParamParameterCrossReference_0_0()); 
            // InternalXacro.g:8613:3: ( RULE_ID )
            // InternalXacro.g:8614:4: RULE_ID
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
    // InternalXacro.g:8625:1: rule__ParameterLink__LinkAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__ParameterLink__LinkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8629:1: ( ( ( RULE_STRING ) ) )
            // InternalXacro.g:8630:2: ( ( RULE_STRING ) )
            {
            // InternalXacro.g:8630:2: ( ( RULE_STRING ) )
            // InternalXacro.g:8631:3: ( RULE_STRING )
            {
             before(grammarAccess.getParameterLinkAccess().getLinkLinkCrossReference_1_0()); 
            // InternalXacro.g:8632:3: ( RULE_STRING )
            // InternalXacro.g:8633:4: RULE_STRING
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


    // $ANTLR start "rule__Body__LinkAssignment_3_2"
    // InternalXacro.g:8644:1: rule__Body__LinkAssignment_3_2 : ( ruleLink ) ;
    public final void rule__Body__LinkAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8648:1: ( ( ruleLink ) )
            // InternalXacro.g:8649:2: ( ruleLink )
            {
            // InternalXacro.g:8649:2: ( ruleLink )
            // InternalXacro.g:8650:3: ruleLink
            {
             before(grammarAccess.getBodyAccess().getLinkLinkParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getBodyAccess().getLinkLinkParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__LinkAssignment_3_2"


    // $ANTLR start "rule__Body__LinkAssignment_3_3_1"
    // InternalXacro.g:8659:1: rule__Body__LinkAssignment_3_3_1 : ( ruleLink ) ;
    public final void rule__Body__LinkAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8663:1: ( ( ruleLink ) )
            // InternalXacro.g:8664:2: ( ruleLink )
            {
            // InternalXacro.g:8664:2: ( ruleLink )
            // InternalXacro.g:8665:3: ruleLink
            {
             before(grammarAccess.getBodyAccess().getLinkLinkParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getBodyAccess().getLinkLinkParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__LinkAssignment_3_3_1"


    // $ANTLR start "rule__Body__JointAssignment_4_2"
    // InternalXacro.g:8674:1: rule__Body__JointAssignment_4_2 : ( ruleJoint ) ;
    public final void rule__Body__JointAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8678:1: ( ( ruleJoint ) )
            // InternalXacro.g:8679:2: ( ruleJoint )
            {
            // InternalXacro.g:8679:2: ( ruleJoint )
            // InternalXacro.g:8680:3: ruleJoint
            {
             before(grammarAccess.getBodyAccess().getJointJointParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getBodyAccess().getJointJointParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__JointAssignment_4_2"


    // $ANTLR start "rule__Body__JointAssignment_4_3_1"
    // InternalXacro.g:8689:1: rule__Body__JointAssignment_4_3_1 : ( ruleJoint ) ;
    public final void rule__Body__JointAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8693:1: ( ( ruleJoint ) )
            // InternalXacro.g:8694:2: ( ruleJoint )
            {
            // InternalXacro.g:8694:2: ( ruleJoint )
            // InternalXacro.g:8695:3: ruleJoint
            {
             before(grammarAccess.getBodyAccess().getJointJointParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getBodyAccess().getJointJointParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__JointAssignment_4_3_1"


    // $ANTLR start "rule__MacroCall__MacroAssignment_4"
    // InternalXacro.g:8704:1: rule__MacroCall__MacroAssignment_4 : ( ( RULE_STRING ) ) ;
    public final void rule__MacroCall__MacroAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8708:1: ( ( ( RULE_STRING ) ) )
            // InternalXacro.g:8709:2: ( ( RULE_STRING ) )
            {
            // InternalXacro.g:8709:2: ( ( RULE_STRING ) )
            // InternalXacro.g:8710:3: ( RULE_STRING )
            {
             before(grammarAccess.getMacroCallAccess().getMacroMacroCrossReference_4_0()); 
            // InternalXacro.g:8711:3: ( RULE_STRING )
            // InternalXacro.g:8712:4: RULE_STRING
            {
             before(grammarAccess.getMacroCallAccess().getMacroMacroSTRINGTerminalRuleCall_4_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMacroCallAccess().getMacroMacroSTRINGTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getMacroCallAccess().getMacroMacroCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__MacroAssignment_4"


    // $ANTLR start "rule__MacroCall__ParameterCallAssignment_5_2"
    // InternalXacro.g:8723:1: rule__MacroCall__ParameterCallAssignment_5_2 : ( ruleParameterCall ) ;
    public final void rule__MacroCall__ParameterCallAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8727:1: ( ( ruleParameterCall ) )
            // InternalXacro.g:8728:2: ( ruleParameterCall )
            {
            // InternalXacro.g:8728:2: ( ruleParameterCall )
            // InternalXacro.g:8729:3: ruleParameterCall
            {
             before(grammarAccess.getMacroCallAccess().getParameterCallParameterCallParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterCall();

            state._fsp--;

             after(grammarAccess.getMacroCallAccess().getParameterCallParameterCallParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__ParameterCallAssignment_5_2"


    // $ANTLR start "rule__MacroCall__ParameterCallAssignment_5_3_1"
    // InternalXacro.g:8738:1: rule__MacroCall__ParameterCallAssignment_5_3_1 : ( ruleParameterCall ) ;
    public final void rule__MacroCall__ParameterCallAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8742:1: ( ( ruleParameterCall ) )
            // InternalXacro.g:8743:2: ( ruleParameterCall )
            {
            // InternalXacro.g:8743:2: ( ruleParameterCall )
            // InternalXacro.g:8744:3: ruleParameterCall
            {
             before(grammarAccess.getMacroCallAccess().getParameterCallParameterCallParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterCall();

            state._fsp--;

             after(grammarAccess.getMacroCallAccess().getParameterCallParameterCallParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroCall__ParameterCallAssignment_5_3_1"


    // $ANTLR start "rule__ParameterCall__ParameterAssignment_4"
    // InternalXacro.g:8753:1: rule__ParameterCall__ParameterAssignment_4 : ( ( RULE_STRING ) ) ;
    public final void rule__ParameterCall__ParameterAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8757:1: ( ( ( RULE_STRING ) ) )
            // InternalXacro.g:8758:2: ( ( RULE_STRING ) )
            {
            // InternalXacro.g:8758:2: ( ( RULE_STRING ) )
            // InternalXacro.g:8759:3: ( RULE_STRING )
            {
             before(grammarAccess.getParameterCallAccess().getParameterParameterCrossReference_4_0()); 
            // InternalXacro.g:8760:3: ( RULE_STRING )
            // InternalXacro.g:8761:4: RULE_STRING
            {
             before(grammarAccess.getParameterCallAccess().getParameterParameterSTRINGTerminalRuleCall_4_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParameterCallAccess().getParameterParameterSTRINGTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getParameterCallAccess().getParameterParameterCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterCall__ParameterAssignment_4"


    // $ANTLR start "rule__ParameterCall__ValueAssignment_6"
    // InternalXacro.g:8772:1: rule__ParameterCall__ValueAssignment_6 : ( ruleParameterValue ) ;
    public final void rule__ParameterCall__ValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8776:1: ( ( ruleParameterValue ) )
            // InternalXacro.g:8777:2: ( ruleParameterValue )
            {
            // InternalXacro.g:8777:2: ( ruleParameterValue )
            // InternalXacro.g:8778:3: ruleParameterValue
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


    // $ANTLR start "rule__Joint__NameAssignment_3"
    // InternalXacro.g:8787:1: rule__Joint__NameAssignment_3 : ( ruleParameterString ) ;
    public final void rule__Joint__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8791:1: ( ( ruleParameterString ) )
            // InternalXacro.g:8792:2: ( ruleParameterString )
            {
            // InternalXacro.g:8792:2: ( ruleParameterString )
            // InternalXacro.g:8793:3: ruleParameterString
            {
             before(grammarAccess.getJointAccess().getNameParameterStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterString();

            state._fsp--;

             after(grammarAccess.getJointAccess().getNameParameterStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__NameAssignment_3"


    // $ANTLR start "rule__Joint__TypeAssignment_5"
    // InternalXacro.g:8802:1: rule__Joint__TypeAssignment_5 : ( RULE_JOINTTYPE ) ;
    public final void rule__Joint__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8806:1: ( ( RULE_JOINTTYPE ) )
            // InternalXacro.g:8807:2: ( RULE_JOINTTYPE )
            {
            // InternalXacro.g:8807:2: ( RULE_JOINTTYPE )
            // InternalXacro.g:8808:3: RULE_JOINTTYPE
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
    // InternalXacro.g:8817:1: rule__Joint__ParentAssignment_7 : ( ruleParameterLink ) ;
    public final void rule__Joint__ParentAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8821:1: ( ( ruleParameterLink ) )
            // InternalXacro.g:8822:2: ( ruleParameterLink )
            {
            // InternalXacro.g:8822:2: ( ruleParameterLink )
            // InternalXacro.g:8823:3: ruleParameterLink
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
    // InternalXacro.g:8832:1: rule__Joint__ChildAssignment_9 : ( ruleParameterLink ) ;
    public final void rule__Joint__ChildAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8836:1: ( ( ruleParameterLink ) )
            // InternalXacro.g:8837:2: ( ruleParameterLink )
            {
            // InternalXacro.g:8837:2: ( ruleParameterLink )
            // InternalXacro.g:8838:3: ruleParameterLink
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


    // $ANTLR start "rule__Joint__OriginAssignment_10_1"
    // InternalXacro.g:8847:1: rule__Joint__OriginAssignment_10_1 : ( ruleParameterPose ) ;
    public final void rule__Joint__OriginAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8851:1: ( ( ruleParameterPose ) )
            // InternalXacro.g:8852:2: ( ruleParameterPose )
            {
            // InternalXacro.g:8852:2: ( ruleParameterPose )
            // InternalXacro.g:8853:3: ruleParameterPose
            {
             before(grammarAccess.getJointAccess().getOriginParameterPoseParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterPose();

            state._fsp--;

             after(grammarAccess.getJointAccess().getOriginParameterPoseParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__OriginAssignment_10_1"


    // $ANTLR start "rule__Joint__AxisAssignment_11_1"
    // InternalXacro.g:8862:1: rule__Joint__AxisAssignment_11_1 : ( ruleVector3 ) ;
    public final void rule__Joint__AxisAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8866:1: ( ( ruleVector3 ) )
            // InternalXacro.g:8867:2: ( ruleVector3 )
            {
            // InternalXacro.g:8867:2: ( ruleVector3 )
            // InternalXacro.g:8868:3: ruleVector3
            {
             before(grammarAccess.getJointAccess().getAxisVector3ParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVector3();

            state._fsp--;

             after(grammarAccess.getJointAccess().getAxisVector3ParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__AxisAssignment_11_1"


    // $ANTLR start "rule__Joint__LimitAssignment_12_1"
    // InternalXacro.g:8877:1: rule__Joint__LimitAssignment_12_1 : ( ruleLimit ) ;
    public final void rule__Joint__LimitAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8881:1: ( ( ruleLimit ) )
            // InternalXacro.g:8882:2: ( ruleLimit )
            {
            // InternalXacro.g:8882:2: ( ruleLimit )
            // InternalXacro.g:8883:3: ruleLimit
            {
             before(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLimit();

            state._fsp--;

             after(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__LimitAssignment_12_1"


    // $ANTLR start "rule__Link__NameAssignment_3"
    // InternalXacro.g:8892:1: rule__Link__NameAssignment_3 : ( ruleParameterString ) ;
    public final void rule__Link__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8896:1: ( ( ruleParameterString ) )
            // InternalXacro.g:8897:2: ( ruleParameterString )
            {
            // InternalXacro.g:8897:2: ( ruleParameterString )
            // InternalXacro.g:8898:3: ruleParameterString
            {
             before(grammarAccess.getLinkAccess().getNameParameterStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterString();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getNameParameterStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__NameAssignment_3"


    // $ANTLR start "rule__Link__InertialAssignment_4_1"
    // InternalXacro.g:8907:1: rule__Link__InertialAssignment_4_1 : ( ruleInertial ) ;
    public final void rule__Link__InertialAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8911:1: ( ( ruleInertial ) )
            // InternalXacro.g:8912:2: ( ruleInertial )
            {
            // InternalXacro.g:8912:2: ( ruleInertial )
            // InternalXacro.g:8913:3: ruleInertial
            {
             before(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInertial();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__InertialAssignment_4_1"


    // $ANTLR start "rule__Link__VisualAssignment_5_1"
    // InternalXacro.g:8922:1: rule__Link__VisualAssignment_5_1 : ( ruleVisual ) ;
    public final void rule__Link__VisualAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8926:1: ( ( ruleVisual ) )
            // InternalXacro.g:8927:2: ( ruleVisual )
            {
            // InternalXacro.g:8927:2: ( ruleVisual )
            // InternalXacro.g:8928:3: ruleVisual
            {
             before(grammarAccess.getLinkAccess().getVisualVisualParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVisual();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getVisualVisualParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__VisualAssignment_5_1"


    // $ANTLR start "rule__Link__CollisionAssignment_6_1"
    // InternalXacro.g:8937:1: rule__Link__CollisionAssignment_6_1 : ( ruleCollision ) ;
    public final void rule__Link__CollisionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8941:1: ( ( ruleCollision ) )
            // InternalXacro.g:8942:2: ( ruleCollision )
            {
            // InternalXacro.g:8942:2: ( ruleCollision )
            // InternalXacro.g:8943:3: ruleCollision
            {
             before(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCollision();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__CollisionAssignment_6_1"


    // $ANTLR start "rule__Pose__RpyAssignment_3_1"
    // InternalXacro.g:8952:1: rule__Pose__RpyAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Pose__RpyAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8956:1: ( ( RULE_STRING ) )
            // InternalXacro.g:8957:2: ( RULE_STRING )
            {
            // InternalXacro.g:8957:2: ( RULE_STRING )
            // InternalXacro.g:8958:3: RULE_STRING
            {
             before(grammarAccess.getPoseAccess().getRpySTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getRpySTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__RpyAssignment_3_1"


    // $ANTLR start "rule__Pose__XyzAssignment_4_1"
    // InternalXacro.g:8967:1: rule__Pose__XyzAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Pose__XyzAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8971:1: ( ( RULE_STRING ) )
            // InternalXacro.g:8972:2: ( RULE_STRING )
            {
            // InternalXacro.g:8972:2: ( RULE_STRING )
            // InternalXacro.g:8973:3: RULE_STRING
            {
             before(grammarAccess.getPoseAccess().getXyzSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getXyzSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__XyzAssignment_4_1"


    // $ANTLR start "rule__Vector3__XyzAssignment_3_1"
    // InternalXacro.g:8982:1: rule__Vector3__XyzAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Vector3__XyzAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:8986:1: ( ( RULE_STRING ) )
            // InternalXacro.g:8987:2: ( RULE_STRING )
            {
            // InternalXacro.g:8987:2: ( RULE_STRING )
            // InternalXacro.g:8988:3: RULE_STRING
            {
             before(grammarAccess.getVector3Access().getXyzSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVector3Access().getXyzSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector3__XyzAssignment_3_1"


    // $ANTLR start "rule__Limit__EffortAssignment_3_1"
    // InternalXacro.g:8997:1: rule__Limit__EffortAssignment_3_1 : ( ruleDouble0 ) ;
    public final void rule__Limit__EffortAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9001:1: ( ( ruleDouble0 ) )
            // InternalXacro.g:9002:2: ( ruleDouble0 )
            {
            // InternalXacro.g:9002:2: ( ruleDouble0 )
            // InternalXacro.g:9003:3: ruleDouble0
            {
             before(grammarAccess.getLimitAccess().getEffortDouble0ParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getEffortDouble0ParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__EffortAssignment_3_1"


    // $ANTLR start "rule__Limit__LowerAssignment_4_1"
    // InternalXacro.g:9012:1: rule__Limit__LowerAssignment_4_1 : ( ruleDouble0 ) ;
    public final void rule__Limit__LowerAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9016:1: ( ( ruleDouble0 ) )
            // InternalXacro.g:9017:2: ( ruleDouble0 )
            {
            // InternalXacro.g:9017:2: ( ruleDouble0 )
            // InternalXacro.g:9018:3: ruleDouble0
            {
             before(grammarAccess.getLimitAccess().getLowerDouble0ParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getLowerDouble0ParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__LowerAssignment_4_1"


    // $ANTLR start "rule__Limit__UpperAssignment_5_1"
    // InternalXacro.g:9027:1: rule__Limit__UpperAssignment_5_1 : ( ruleDouble0 ) ;
    public final void rule__Limit__UpperAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9031:1: ( ( ruleDouble0 ) )
            // InternalXacro.g:9032:2: ( ruleDouble0 )
            {
            // InternalXacro.g:9032:2: ( ruleDouble0 )
            // InternalXacro.g:9033:3: ruleDouble0
            {
             before(grammarAccess.getLimitAccess().getUpperDouble0ParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getUpperDouble0ParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__UpperAssignment_5_1"


    // $ANTLR start "rule__Limit__VelocityAssignment_6_1"
    // InternalXacro.g:9042:1: rule__Limit__VelocityAssignment_6_1 : ( ruleDouble0 ) ;
    public final void rule__Limit__VelocityAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9046:1: ( ( ruleDouble0 ) )
            // InternalXacro.g:9047:2: ( ruleDouble0 )
            {
            // InternalXacro.g:9047:2: ( ruleDouble0 )
            // InternalXacro.g:9048:3: ruleDouble0
            {
             before(grammarAccess.getLimitAccess().getVelocityDouble0ParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getVelocityDouble0ParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__VelocityAssignment_6_1"


    // $ANTLR start "rule__Inertial__OriginAssignment_3_1"
    // InternalXacro.g:9057:1: rule__Inertial__OriginAssignment_3_1 : ( rulePose ) ;
    public final void rule__Inertial__OriginAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9061:1: ( ( rulePose ) )
            // InternalXacro.g:9062:2: ( rulePose )
            {
            // InternalXacro.g:9062:2: ( rulePose )
            // InternalXacro.g:9063:3: rulePose
            {
             before(grammarAccess.getInertialAccess().getOriginPoseParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePose();

            state._fsp--;

             after(grammarAccess.getInertialAccess().getOriginPoseParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__OriginAssignment_3_1"


    // $ANTLR start "rule__Inertial__MassAssignment_4_1"
    // InternalXacro.g:9072:1: rule__Inertial__MassAssignment_4_1 : ( ruleMass ) ;
    public final void rule__Inertial__MassAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9076:1: ( ( ruleMass ) )
            // InternalXacro.g:9077:2: ( ruleMass )
            {
            // InternalXacro.g:9077:2: ( ruleMass )
            // InternalXacro.g:9078:3: ruleMass
            {
             before(grammarAccess.getInertialAccess().getMassMassParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMass();

            state._fsp--;

             after(grammarAccess.getInertialAccess().getMassMassParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__MassAssignment_4_1"


    // $ANTLR start "rule__Inertial__InertiaAssignment_5_1"
    // InternalXacro.g:9087:1: rule__Inertial__InertiaAssignment_5_1 : ( ruleInertia ) ;
    public final void rule__Inertial__InertiaAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9091:1: ( ( ruleInertia ) )
            // InternalXacro.g:9092:2: ( ruleInertia )
            {
            // InternalXacro.g:9092:2: ( ruleInertia )
            // InternalXacro.g:9093:3: ruleInertia
            {
             before(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInertia();

            state._fsp--;

             after(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__InertiaAssignment_5_1"


    // $ANTLR start "rule__Visual__OriginAssignment_2_1"
    // InternalXacro.g:9102:1: rule__Visual__OriginAssignment_2_1 : ( rulePose ) ;
    public final void rule__Visual__OriginAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9106:1: ( ( rulePose ) )
            // InternalXacro.g:9107:2: ( rulePose )
            {
            // InternalXacro.g:9107:2: ( rulePose )
            // InternalXacro.g:9108:3: rulePose
            {
             before(grammarAccess.getVisualAccess().getOriginPoseParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePose();

            state._fsp--;

             after(grammarAccess.getVisualAccess().getOriginPoseParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__OriginAssignment_2_1"


    // $ANTLR start "rule__Visual__GeometryAssignment_4"
    // InternalXacro.g:9117:1: rule__Visual__GeometryAssignment_4 : ( ruleGeometry ) ;
    public final void rule__Visual__GeometryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9121:1: ( ( ruleGeometry ) )
            // InternalXacro.g:9122:2: ( ruleGeometry )
            {
            // InternalXacro.g:9122:2: ( ruleGeometry )
            // InternalXacro.g:9123:3: ruleGeometry
            {
             before(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGeometry();

            state._fsp--;

             after(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__GeometryAssignment_4"


    // $ANTLR start "rule__Collision__OriginAssignment_2_1"
    // InternalXacro.g:9132:1: rule__Collision__OriginAssignment_2_1 : ( rulePose ) ;
    public final void rule__Collision__OriginAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9136:1: ( ( rulePose ) )
            // InternalXacro.g:9137:2: ( rulePose )
            {
            // InternalXacro.g:9137:2: ( rulePose )
            // InternalXacro.g:9138:3: rulePose
            {
             before(grammarAccess.getCollisionAccess().getOriginPoseParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePose();

            state._fsp--;

             after(grammarAccess.getCollisionAccess().getOriginPoseParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__OriginAssignment_2_1"


    // $ANTLR start "rule__Collision__GeometryAssignment_4"
    // InternalXacro.g:9147:1: rule__Collision__GeometryAssignment_4 : ( ruleGeometry ) ;
    public final void rule__Collision__GeometryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9151:1: ( ( ruleGeometry ) )
            // InternalXacro.g:9152:2: ( ruleGeometry )
            {
            // InternalXacro.g:9152:2: ( ruleGeometry )
            // InternalXacro.g:9153:3: ruleGeometry
            {
             before(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGeometry();

            state._fsp--;

             after(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__GeometryAssignment_4"


    // $ANTLR start "rule__Mass__ValueAssignment_3_1"
    // InternalXacro.g:9162:1: rule__Mass__ValueAssignment_3_1 : ( ruleDouble0 ) ;
    public final void rule__Mass__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9166:1: ( ( ruleDouble0 ) )
            // InternalXacro.g:9167:2: ( ruleDouble0 )
            {
            // InternalXacro.g:9167:2: ( ruleDouble0 )
            // InternalXacro.g:9168:3: ruleDouble0
            {
             before(grammarAccess.getMassAccess().getValueDouble0ParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getMassAccess().getValueDouble0ParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__ValueAssignment_3_1"


    // $ANTLR start "rule__Inertia__IxxAssignment_3_1"
    // InternalXacro.g:9177:1: rule__Inertia__IxxAssignment_3_1 : ( ruleDouble0 ) ;
    public final void rule__Inertia__IxxAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9181:1: ( ( ruleDouble0 ) )
            // InternalXacro.g:9182:2: ( ruleDouble0 )
            {
            // InternalXacro.g:9182:2: ( ruleDouble0 )
            // InternalXacro.g:9183:3: ruleDouble0
            {
             before(grammarAccess.getInertiaAccess().getIxxDouble0ParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIxxDouble0ParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IxxAssignment_3_1"


    // $ANTLR start "rule__Inertia__IxyAssignment_4_1"
    // InternalXacro.g:9192:1: rule__Inertia__IxyAssignment_4_1 : ( ruleDouble0 ) ;
    public final void rule__Inertia__IxyAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9196:1: ( ( ruleDouble0 ) )
            // InternalXacro.g:9197:2: ( ruleDouble0 )
            {
            // InternalXacro.g:9197:2: ( ruleDouble0 )
            // InternalXacro.g:9198:3: ruleDouble0
            {
             before(grammarAccess.getInertiaAccess().getIxyDouble0ParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIxyDouble0ParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IxyAssignment_4_1"


    // $ANTLR start "rule__Inertia__IxzAssignment_5_1"
    // InternalXacro.g:9207:1: rule__Inertia__IxzAssignment_5_1 : ( ruleDouble0 ) ;
    public final void rule__Inertia__IxzAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9211:1: ( ( ruleDouble0 ) )
            // InternalXacro.g:9212:2: ( ruleDouble0 )
            {
            // InternalXacro.g:9212:2: ( ruleDouble0 )
            // InternalXacro.g:9213:3: ruleDouble0
            {
             before(grammarAccess.getInertiaAccess().getIxzDouble0ParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIxzDouble0ParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IxzAssignment_5_1"


    // $ANTLR start "rule__Inertia__IyyAssignment_6_1"
    // InternalXacro.g:9222:1: rule__Inertia__IyyAssignment_6_1 : ( ruleDouble0 ) ;
    public final void rule__Inertia__IyyAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9226:1: ( ( ruleDouble0 ) )
            // InternalXacro.g:9227:2: ( ruleDouble0 )
            {
            // InternalXacro.g:9227:2: ( ruleDouble0 )
            // InternalXacro.g:9228:3: ruleDouble0
            {
             before(grammarAccess.getInertiaAccess().getIyyDouble0ParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIyyDouble0ParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IyyAssignment_6_1"


    // $ANTLR start "rule__Inertia__IyzAssignment_7_1"
    // InternalXacro.g:9237:1: rule__Inertia__IyzAssignment_7_1 : ( ruleDouble0 ) ;
    public final void rule__Inertia__IyzAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9241:1: ( ( ruleDouble0 ) )
            // InternalXacro.g:9242:2: ( ruleDouble0 )
            {
            // InternalXacro.g:9242:2: ( ruleDouble0 )
            // InternalXacro.g:9243:3: ruleDouble0
            {
             before(grammarAccess.getInertiaAccess().getIyzDouble0ParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIyzDouble0ParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IyzAssignment_7_1"


    // $ANTLR start "rule__Inertia__IzzAssignment_8_1"
    // InternalXacro.g:9252:1: rule__Inertia__IzzAssignment_8_1 : ( ruleDouble0 ) ;
    public final void rule__Inertia__IzzAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9256:1: ( ( ruleDouble0 ) )
            // InternalXacro.g:9257:2: ( ruleDouble0 )
            {
            // InternalXacro.g:9257:2: ( ruleDouble0 )
            // InternalXacro.g:9258:3: ruleDouble0
            {
             before(grammarAccess.getInertiaAccess().getIzzDouble0ParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIzzDouble0ParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IzzAssignment_8_1"


    // $ANTLR start "rule__Geometry__BoxAssignment_3_1"
    // InternalXacro.g:9267:1: rule__Geometry__BoxAssignment_3_1 : ( ruleBox ) ;
    public final void rule__Geometry__BoxAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9271:1: ( ( ruleBox ) )
            // InternalXacro.g:9272:2: ( ruleBox )
            {
            // InternalXacro.g:9272:2: ( ruleBox )
            // InternalXacro.g:9273:3: ruleBox
            {
             before(grammarAccess.getGeometryAccess().getBoxBoxParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBox();

            state._fsp--;

             after(grammarAccess.getGeometryAccess().getBoxBoxParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__BoxAssignment_3_1"


    // $ANTLR start "rule__Geometry__CylinderAssignment_4_1"
    // InternalXacro.g:9282:1: rule__Geometry__CylinderAssignment_4_1 : ( ruleCylinder ) ;
    public final void rule__Geometry__CylinderAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9286:1: ( ( ruleCylinder ) )
            // InternalXacro.g:9287:2: ( ruleCylinder )
            {
            // InternalXacro.g:9287:2: ( ruleCylinder )
            // InternalXacro.g:9288:3: ruleCylinder
            {
             before(grammarAccess.getGeometryAccess().getCylinderCylinderParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCylinder();

            state._fsp--;

             after(grammarAccess.getGeometryAccess().getCylinderCylinderParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__CylinderAssignment_4_1"


    // $ANTLR start "rule__Geometry__SphereAssignment_5_1"
    // InternalXacro.g:9297:1: rule__Geometry__SphereAssignment_5_1 : ( ruleSphere ) ;
    public final void rule__Geometry__SphereAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9301:1: ( ( ruleSphere ) )
            // InternalXacro.g:9302:2: ( ruleSphere )
            {
            // InternalXacro.g:9302:2: ( ruleSphere )
            // InternalXacro.g:9303:3: ruleSphere
            {
             before(grammarAccess.getGeometryAccess().getSphereSphereParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSphere();

            state._fsp--;

             after(grammarAccess.getGeometryAccess().getSphereSphereParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__SphereAssignment_5_1"


    // $ANTLR start "rule__Geometry__MeshAssignment_6_1"
    // InternalXacro.g:9312:1: rule__Geometry__MeshAssignment_6_1 : ( ruleMesh ) ;
    public final void rule__Geometry__MeshAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9316:1: ( ( ruleMesh ) )
            // InternalXacro.g:9317:2: ( ruleMesh )
            {
            // InternalXacro.g:9317:2: ( ruleMesh )
            // InternalXacro.g:9318:3: ruleMesh
            {
             before(grammarAccess.getGeometryAccess().getMeshMeshParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMesh();

            state._fsp--;

             after(grammarAccess.getGeometryAccess().getMeshMeshParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__MeshAssignment_6_1"


    // $ANTLR start "rule__Box__SizeAssignment_3_1"
    // InternalXacro.g:9327:1: rule__Box__SizeAssignment_3_1 : ( ruleParameterString ) ;
    public final void rule__Box__SizeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9331:1: ( ( ruleParameterString ) )
            // InternalXacro.g:9332:2: ( ruleParameterString )
            {
            // InternalXacro.g:9332:2: ( ruleParameterString )
            // InternalXacro.g:9333:3: ruleParameterString
            {
             before(grammarAccess.getBoxAccess().getSizeParameterStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterString();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getSizeParameterStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__SizeAssignment_3_1"


    // $ANTLR start "rule__Cylinder__LengthAssignment_3"
    // InternalXacro.g:9342:1: rule__Cylinder__LengthAssignment_3 : ( ruleDouble0 ) ;
    public final void rule__Cylinder__LengthAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9346:1: ( ( ruleDouble0 ) )
            // InternalXacro.g:9347:2: ( ruleDouble0 )
            {
            // InternalXacro.g:9347:2: ( ruleDouble0 )
            // InternalXacro.g:9348:3: ruleDouble0
            {
             before(grammarAccess.getCylinderAccess().getLengthDouble0ParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getCylinderAccess().getLengthDouble0ParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__LengthAssignment_3"


    // $ANTLR start "rule__Cylinder__RadiusAssignment_5"
    // InternalXacro.g:9357:1: rule__Cylinder__RadiusAssignment_5 : ( ruleDouble0 ) ;
    public final void rule__Cylinder__RadiusAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9361:1: ( ( ruleDouble0 ) )
            // InternalXacro.g:9362:2: ( ruleDouble0 )
            {
            // InternalXacro.g:9362:2: ( ruleDouble0 )
            // InternalXacro.g:9363:3: ruleDouble0
            {
             before(grammarAccess.getCylinderAccess().getRadiusDouble0ParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getCylinderAccess().getRadiusDouble0ParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__RadiusAssignment_5"


    // $ANTLR start "rule__Sphere__RadiusAssignment_3"
    // InternalXacro.g:9372:1: rule__Sphere__RadiusAssignment_3 : ( ruleDouble0 ) ;
    public final void rule__Sphere__RadiusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9376:1: ( ( ruleDouble0 ) )
            // InternalXacro.g:9377:2: ( ruleDouble0 )
            {
            // InternalXacro.g:9377:2: ( ruleDouble0 )
            // InternalXacro.g:9378:3: ruleDouble0
            {
             before(grammarAccess.getSphereAccess().getRadiusDouble0ParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getSphereAccess().getRadiusDouble0ParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__RadiusAssignment_3"


    // $ANTLR start "rule__Mesh__FilenameAssignment_3"
    // InternalXacro.g:9387:1: rule__Mesh__FilenameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Mesh__FilenameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9391:1: ( ( RULE_STRING ) )
            // InternalXacro.g:9392:2: ( RULE_STRING )
            {
            // InternalXacro.g:9392:2: ( RULE_STRING )
            // InternalXacro.g:9393:3: RULE_STRING
            {
             before(grammarAccess.getMeshAccess().getFilenameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getFilenameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__FilenameAssignment_3"


    // $ANTLR start "rule__Mesh__ScaleAssignment_4_1"
    // InternalXacro.g:9402:1: rule__Mesh__ScaleAssignment_4_1 : ( ruleDouble0 ) ;
    public final void rule__Mesh__ScaleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXacro.g:9406:1: ( ( ruleDouble0 ) )
            // InternalXacro.g:9407:2: ( ruleDouble0 )
            {
            // InternalXacro.g:9407:2: ( ruleDouble0 )
            // InternalXacro.g:9408:3: ruleDouble0
            {
             before(grammarAccess.getMeshAccess().getScaleDouble0ParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getMeshAccess().getScaleDouble0ParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__ScaleAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001B80000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000005080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000060L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000C00080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000E0000080000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000E00000080000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0003000000080000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000080000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00F0000000080000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0600020000080000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x1000020000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000080000L,0x000000000000003FL});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000780L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000080000L,0x0000000000001000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000080000L,0x0000000000080000L});

}