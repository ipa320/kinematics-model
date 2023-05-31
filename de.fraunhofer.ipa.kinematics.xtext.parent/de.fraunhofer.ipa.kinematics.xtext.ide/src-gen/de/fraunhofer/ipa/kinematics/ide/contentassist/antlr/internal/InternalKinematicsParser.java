package de.fraunhofer.ipa.kinematics.ide.contentassist.antlr.internal;

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_DOUBLE", "RULE_DIGIT", "RULE_BOOLEAN", "RULE_DECINT", "RULE_JOINTTYPE", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'{'", "'}'", "'Axis'", "'xyz'", "'Pose'", "'rpy'", "'Limit'", "'effort'", "'lower'", "'upper'", "'velocity'", "'Inertial'", "'origin'", "'mass'", "'inertia'", "'Visual'", "'geometry'", "'Collision'", "'Mass'", "'value'", "'Inertia'", "'ixx'", "'ixy'", "'ixz'", "'iyy'", "'iyz'", "'izz'", "'Geometry'", "'box'", "'cylinder'", "'sphere'", "'mesh'", "'Box'", "'size'", "'Cylinder'", "'length'", "'radius'", "'Sphere'", "'Mesh'", "'filename'", "'scale'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=7;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=10;
    public static final int RULE_DIGIT=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=5;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_JOINTTYPE=9;
    public static final int T__36=36;
    public static final int RULE_DECINT=8;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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

    	public void setGrammarAccess(KinematicsGrammarAccess grammarAccess) {
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
    // InternalKinematics.g:53:1: entryRuleRobot : ruleRobot EOF ;
    public final void entryRuleRobot() throws RecognitionException {
        try {
            // InternalKinematics.g:54:1: ( ruleRobot EOF )
            // InternalKinematics.g:55:1: ruleRobot EOF
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
    // InternalKinematics.g:62:1: ruleRobot : ( ( rule__Robot__Group__0 ) ) ;
    public final void ruleRobot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:66:2: ( ( ( rule__Robot__Group__0 ) ) )
            // InternalKinematics.g:67:2: ( ( rule__Robot__Group__0 ) )
            {
            // InternalKinematics.g:67:2: ( ( rule__Robot__Group__0 ) )
            // InternalKinematics.g:68:3: ( rule__Robot__Group__0 )
            {
             before(grammarAccess.getRobotAccess().getGroup()); 
            // InternalKinematics.g:69:3: ( rule__Robot__Group__0 )
            // InternalKinematics.g:69:4: rule__Robot__Group__0
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


    // $ANTLR start "entryRuleAxis"
    // InternalKinematics.g:78:1: entryRuleAxis : ruleAxis EOF ;
    public final void entryRuleAxis() throws RecognitionException {
        try {
            // InternalKinematics.g:79:1: ( ruleAxis EOF )
            // InternalKinematics.g:80:1: ruleAxis EOF
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
    // InternalKinematics.g:87:1: ruleAxis : ( ( rule__Axis__Group__0 ) ) ;
    public final void ruleAxis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:91:2: ( ( ( rule__Axis__Group__0 ) ) )
            // InternalKinematics.g:92:2: ( ( rule__Axis__Group__0 ) )
            {
            // InternalKinematics.g:92:2: ( ( rule__Axis__Group__0 ) )
            // InternalKinematics.g:93:3: ( rule__Axis__Group__0 )
            {
             before(grammarAccess.getAxisAccess().getGroup()); 
            // InternalKinematics.g:94:3: ( rule__Axis__Group__0 )
            // InternalKinematics.g:94:4: rule__Axis__Group__0
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


    // $ANTLR start "entryRulePose"
    // InternalKinematics.g:103:1: entryRulePose : rulePose EOF ;
    public final void entryRulePose() throws RecognitionException {
        try {
            // InternalKinematics.g:104:1: ( rulePose EOF )
            // InternalKinematics.g:105:1: rulePose EOF
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
    // InternalKinematics.g:112:1: rulePose : ( ( rule__Pose__Group__0 ) ) ;
    public final void rulePose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:116:2: ( ( ( rule__Pose__Group__0 ) ) )
            // InternalKinematics.g:117:2: ( ( rule__Pose__Group__0 ) )
            {
            // InternalKinematics.g:117:2: ( ( rule__Pose__Group__0 ) )
            // InternalKinematics.g:118:3: ( rule__Pose__Group__0 )
            {
             before(grammarAccess.getPoseAccess().getGroup()); 
            // InternalKinematics.g:119:3: ( rule__Pose__Group__0 )
            // InternalKinematics.g:119:4: rule__Pose__Group__0
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


    // $ANTLR start "entryRuleLimit"
    // InternalKinematics.g:128:1: entryRuleLimit : ruleLimit EOF ;
    public final void entryRuleLimit() throws RecognitionException {
        try {
            // InternalKinematics.g:129:1: ( ruleLimit EOF )
            // InternalKinematics.g:130:1: ruleLimit EOF
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
    // InternalKinematics.g:137:1: ruleLimit : ( ( rule__Limit__Group__0 ) ) ;
    public final void ruleLimit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:141:2: ( ( ( rule__Limit__Group__0 ) ) )
            // InternalKinematics.g:142:2: ( ( rule__Limit__Group__0 ) )
            {
            // InternalKinematics.g:142:2: ( ( rule__Limit__Group__0 ) )
            // InternalKinematics.g:143:3: ( rule__Limit__Group__0 )
            {
             before(grammarAccess.getLimitAccess().getGroup()); 
            // InternalKinematics.g:144:3: ( rule__Limit__Group__0 )
            // InternalKinematics.g:144:4: rule__Limit__Group__0
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
    // InternalKinematics.g:153:1: entryRuleInertial : ruleInertial EOF ;
    public final void entryRuleInertial() throws RecognitionException {
        try {
            // InternalKinematics.g:154:1: ( ruleInertial EOF )
            // InternalKinematics.g:155:1: ruleInertial EOF
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
    // InternalKinematics.g:162:1: ruleInertial : ( ( rule__Inertial__Group__0 ) ) ;
    public final void ruleInertial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:166:2: ( ( ( rule__Inertial__Group__0 ) ) )
            // InternalKinematics.g:167:2: ( ( rule__Inertial__Group__0 ) )
            {
            // InternalKinematics.g:167:2: ( ( rule__Inertial__Group__0 ) )
            // InternalKinematics.g:168:3: ( rule__Inertial__Group__0 )
            {
             before(grammarAccess.getInertialAccess().getGroup()); 
            // InternalKinematics.g:169:3: ( rule__Inertial__Group__0 )
            // InternalKinematics.g:169:4: rule__Inertial__Group__0
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
    // InternalKinematics.g:178:1: entryRuleVisual : ruleVisual EOF ;
    public final void entryRuleVisual() throws RecognitionException {
        try {
            // InternalKinematics.g:179:1: ( ruleVisual EOF )
            // InternalKinematics.g:180:1: ruleVisual EOF
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
    // InternalKinematics.g:187:1: ruleVisual : ( ( rule__Visual__Group__0 ) ) ;
    public final void ruleVisual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:191:2: ( ( ( rule__Visual__Group__0 ) ) )
            // InternalKinematics.g:192:2: ( ( rule__Visual__Group__0 ) )
            {
            // InternalKinematics.g:192:2: ( ( rule__Visual__Group__0 ) )
            // InternalKinematics.g:193:3: ( rule__Visual__Group__0 )
            {
             before(grammarAccess.getVisualAccess().getGroup()); 
            // InternalKinematics.g:194:3: ( rule__Visual__Group__0 )
            // InternalKinematics.g:194:4: rule__Visual__Group__0
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
    // InternalKinematics.g:203:1: entryRuleCollision : ruleCollision EOF ;
    public final void entryRuleCollision() throws RecognitionException {
        try {
            // InternalKinematics.g:204:1: ( ruleCollision EOF )
            // InternalKinematics.g:205:1: ruleCollision EOF
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
    // InternalKinematics.g:212:1: ruleCollision : ( ( rule__Collision__Group__0 ) ) ;
    public final void ruleCollision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:216:2: ( ( ( rule__Collision__Group__0 ) ) )
            // InternalKinematics.g:217:2: ( ( rule__Collision__Group__0 ) )
            {
            // InternalKinematics.g:217:2: ( ( rule__Collision__Group__0 ) )
            // InternalKinematics.g:218:3: ( rule__Collision__Group__0 )
            {
             before(grammarAccess.getCollisionAccess().getGroup()); 
            // InternalKinematics.g:219:3: ( rule__Collision__Group__0 )
            // InternalKinematics.g:219:4: rule__Collision__Group__0
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
    // InternalKinematics.g:228:1: entryRuleMass : ruleMass EOF ;
    public final void entryRuleMass() throws RecognitionException {
        try {
            // InternalKinematics.g:229:1: ( ruleMass EOF )
            // InternalKinematics.g:230:1: ruleMass EOF
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
    // InternalKinematics.g:237:1: ruleMass : ( ( rule__Mass__Group__0 ) ) ;
    public final void ruleMass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:241:2: ( ( ( rule__Mass__Group__0 ) ) )
            // InternalKinematics.g:242:2: ( ( rule__Mass__Group__0 ) )
            {
            // InternalKinematics.g:242:2: ( ( rule__Mass__Group__0 ) )
            // InternalKinematics.g:243:3: ( rule__Mass__Group__0 )
            {
             before(grammarAccess.getMassAccess().getGroup()); 
            // InternalKinematics.g:244:3: ( rule__Mass__Group__0 )
            // InternalKinematics.g:244:4: rule__Mass__Group__0
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
    // InternalKinematics.g:253:1: entryRuleInertia : ruleInertia EOF ;
    public final void entryRuleInertia() throws RecognitionException {
        try {
            // InternalKinematics.g:254:1: ( ruleInertia EOF )
            // InternalKinematics.g:255:1: ruleInertia EOF
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
    // InternalKinematics.g:262:1: ruleInertia : ( ( rule__Inertia__Group__0 ) ) ;
    public final void ruleInertia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:266:2: ( ( ( rule__Inertia__Group__0 ) ) )
            // InternalKinematics.g:267:2: ( ( rule__Inertia__Group__0 ) )
            {
            // InternalKinematics.g:267:2: ( ( rule__Inertia__Group__0 ) )
            // InternalKinematics.g:268:3: ( rule__Inertia__Group__0 )
            {
             before(grammarAccess.getInertiaAccess().getGroup()); 
            // InternalKinematics.g:269:3: ( rule__Inertia__Group__0 )
            // InternalKinematics.g:269:4: rule__Inertia__Group__0
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
    // InternalKinematics.g:278:1: entryRuleGeometry : ruleGeometry EOF ;
    public final void entryRuleGeometry() throws RecognitionException {
        try {
            // InternalKinematics.g:279:1: ( ruleGeometry EOF )
            // InternalKinematics.g:280:1: ruleGeometry EOF
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
    // InternalKinematics.g:287:1: ruleGeometry : ( ( rule__Geometry__Group__0 ) ) ;
    public final void ruleGeometry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:291:2: ( ( ( rule__Geometry__Group__0 ) ) )
            // InternalKinematics.g:292:2: ( ( rule__Geometry__Group__0 ) )
            {
            // InternalKinematics.g:292:2: ( ( rule__Geometry__Group__0 ) )
            // InternalKinematics.g:293:3: ( rule__Geometry__Group__0 )
            {
             before(grammarAccess.getGeometryAccess().getGroup()); 
            // InternalKinematics.g:294:3: ( rule__Geometry__Group__0 )
            // InternalKinematics.g:294:4: rule__Geometry__Group__0
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
    // InternalKinematics.g:303:1: entryRuleBox : ruleBox EOF ;
    public final void entryRuleBox() throws RecognitionException {
        try {
            // InternalKinematics.g:304:1: ( ruleBox EOF )
            // InternalKinematics.g:305:1: ruleBox EOF
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
    // InternalKinematics.g:312:1: ruleBox : ( ( rule__Box__Group__0 ) ) ;
    public final void ruleBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:316:2: ( ( ( rule__Box__Group__0 ) ) )
            // InternalKinematics.g:317:2: ( ( rule__Box__Group__0 ) )
            {
            // InternalKinematics.g:317:2: ( ( rule__Box__Group__0 ) )
            // InternalKinematics.g:318:3: ( rule__Box__Group__0 )
            {
             before(grammarAccess.getBoxAccess().getGroup()); 
            // InternalKinematics.g:319:3: ( rule__Box__Group__0 )
            // InternalKinematics.g:319:4: rule__Box__Group__0
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
    // InternalKinematics.g:328:1: entryRuleCylinder : ruleCylinder EOF ;
    public final void entryRuleCylinder() throws RecognitionException {
        try {
            // InternalKinematics.g:329:1: ( ruleCylinder EOF )
            // InternalKinematics.g:330:1: ruleCylinder EOF
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
    // InternalKinematics.g:337:1: ruleCylinder : ( ( rule__Cylinder__Group__0 ) ) ;
    public final void ruleCylinder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:341:2: ( ( ( rule__Cylinder__Group__0 ) ) )
            // InternalKinematics.g:342:2: ( ( rule__Cylinder__Group__0 ) )
            {
            // InternalKinematics.g:342:2: ( ( rule__Cylinder__Group__0 ) )
            // InternalKinematics.g:343:3: ( rule__Cylinder__Group__0 )
            {
             before(grammarAccess.getCylinderAccess().getGroup()); 
            // InternalKinematics.g:344:3: ( rule__Cylinder__Group__0 )
            // InternalKinematics.g:344:4: rule__Cylinder__Group__0
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
    // InternalKinematics.g:353:1: entryRuleSphere : ruleSphere EOF ;
    public final void entryRuleSphere() throws RecognitionException {
        try {
            // InternalKinematics.g:354:1: ( ruleSphere EOF )
            // InternalKinematics.g:355:1: ruleSphere EOF
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
    // InternalKinematics.g:362:1: ruleSphere : ( ( rule__Sphere__Group__0 ) ) ;
    public final void ruleSphere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:366:2: ( ( ( rule__Sphere__Group__0 ) ) )
            // InternalKinematics.g:367:2: ( ( rule__Sphere__Group__0 ) )
            {
            // InternalKinematics.g:367:2: ( ( rule__Sphere__Group__0 ) )
            // InternalKinematics.g:368:3: ( rule__Sphere__Group__0 )
            {
             before(grammarAccess.getSphereAccess().getGroup()); 
            // InternalKinematics.g:369:3: ( rule__Sphere__Group__0 )
            // InternalKinematics.g:369:4: rule__Sphere__Group__0
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
    // InternalKinematics.g:378:1: entryRuleMesh : ruleMesh EOF ;
    public final void entryRuleMesh() throws RecognitionException {
        try {
            // InternalKinematics.g:379:1: ( ruleMesh EOF )
            // InternalKinematics.g:380:1: ruleMesh EOF
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
    // InternalKinematics.g:387:1: ruleMesh : ( ( rule__Mesh__Group__0 ) ) ;
    public final void ruleMesh() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:391:2: ( ( ( rule__Mesh__Group__0 ) ) )
            // InternalKinematics.g:392:2: ( ( rule__Mesh__Group__0 ) )
            {
            // InternalKinematics.g:392:2: ( ( rule__Mesh__Group__0 ) )
            // InternalKinematics.g:393:3: ( rule__Mesh__Group__0 )
            {
             before(grammarAccess.getMeshAccess().getGroup()); 
            // InternalKinematics.g:394:3: ( rule__Mesh__Group__0 )
            // InternalKinematics.g:394:4: rule__Mesh__Group__0
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
    // InternalKinematics.g:403:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalKinematics.g:404:1: ( ruleEString EOF )
            // InternalKinematics.g:405:1: ruleEString EOF
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
    // InternalKinematics.g:412:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:416:2: ( ( RULE_STRING ) )
            // InternalKinematics.g:417:2: ( RULE_STRING )
            {
            // InternalKinematics.g:417:2: ( RULE_STRING )
            // InternalKinematics.g:418:3: RULE_STRING
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
    // InternalKinematics.g:428:1: entryRuleDouble0 : ruleDouble0 EOF ;
    public final void entryRuleDouble0() throws RecognitionException {
        try {
            // InternalKinematics.g:429:1: ( ruleDouble0 EOF )
            // InternalKinematics.g:430:1: ruleDouble0 EOF
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
    // InternalKinematics.g:437:1: ruleDouble0 : ( RULE_DOUBLE ) ;
    public final void ruleDouble0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:441:2: ( ( RULE_DOUBLE ) )
            // InternalKinematics.g:442:2: ( RULE_DOUBLE )
            {
            // InternalKinematics.g:442:2: ( RULE_DOUBLE )
            // InternalKinematics.g:443:3: RULE_DOUBLE
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


    // $ANTLR start "rule__Robot__Group__0"
    // InternalKinematics.g:452:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:456:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalKinematics.g:457:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
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
    // InternalKinematics.g:464:1: rule__Robot__Group__0__Impl : ( () ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:468:1: ( ( () ) )
            // InternalKinematics.g:469:1: ( () )
            {
            // InternalKinematics.g:469:1: ( () )
            // InternalKinematics.g:470:2: ()
            {
             before(grammarAccess.getRobotAccess().getXacroRobotAction_0()); 
            // InternalKinematics.g:471:2: ()
            // InternalKinematics.g:471:3: 
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
    // InternalKinematics.g:479:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:483:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalKinematics.g:484:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
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
    // InternalKinematics.g:491:1: rule__Robot__Group__1__Impl : ( 'Robot' ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:495:1: ( ( 'Robot' ) )
            // InternalKinematics.g:496:1: ( 'Robot' )
            {
            // InternalKinematics.g:496:1: ( 'Robot' )
            // InternalKinematics.g:497:2: 'Robot'
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
    // InternalKinematics.g:506:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl rule__Robot__Group__3 ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:510:1: ( rule__Robot__Group__2__Impl rule__Robot__Group__3 )
            // InternalKinematics.g:511:2: rule__Robot__Group__2__Impl rule__Robot__Group__3
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
    // InternalKinematics.g:518:1: rule__Robot__Group__2__Impl : ( '{' ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:522:1: ( ( '{' ) )
            // InternalKinematics.g:523:1: ( '{' )
            {
            // InternalKinematics.g:523:1: ( '{' )
            // InternalKinematics.g:524:2: '{'
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
    // InternalKinematics.g:533:1: rule__Robot__Group__3 : rule__Robot__Group__3__Impl ;
    public final void rule__Robot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:537:1: ( rule__Robot__Group__3__Impl )
            // InternalKinematics.g:538:2: rule__Robot__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalKinematics.g:544:1: rule__Robot__Group__3__Impl : ( '}' ) ;
    public final void rule__Robot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:548:1: ( ( '}' ) )
            // InternalKinematics.g:549:1: ( '}' )
            {
            // InternalKinematics.g:549:1: ( '}' )
            // InternalKinematics.g:550:2: '}'
            {
             before(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Axis__Group__0"
    // InternalKinematics.g:560:1: rule__Axis__Group__0 : rule__Axis__Group__0__Impl rule__Axis__Group__1 ;
    public final void rule__Axis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:564:1: ( rule__Axis__Group__0__Impl rule__Axis__Group__1 )
            // InternalKinematics.g:565:2: rule__Axis__Group__0__Impl rule__Axis__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalKinematics.g:572:1: rule__Axis__Group__0__Impl : ( () ) ;
    public final void rule__Axis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:576:1: ( ( () ) )
            // InternalKinematics.g:577:1: ( () )
            {
            // InternalKinematics.g:577:1: ( () )
            // InternalKinematics.g:578:2: ()
            {
             before(grammarAccess.getAxisAccess().getAxisAction_0()); 
            // InternalKinematics.g:579:2: ()
            // InternalKinematics.g:579:3: 
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
    // InternalKinematics.g:587:1: rule__Axis__Group__1 : rule__Axis__Group__1__Impl rule__Axis__Group__2 ;
    public final void rule__Axis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:591:1: ( rule__Axis__Group__1__Impl rule__Axis__Group__2 )
            // InternalKinematics.g:592:2: rule__Axis__Group__1__Impl rule__Axis__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalKinematics.g:599:1: rule__Axis__Group__1__Impl : ( 'Axis' ) ;
    public final void rule__Axis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:603:1: ( ( 'Axis' ) )
            // InternalKinematics.g:604:1: ( 'Axis' )
            {
            // InternalKinematics.g:604:1: ( 'Axis' )
            // InternalKinematics.g:605:2: 'Axis'
            {
             before(grammarAccess.getAxisAccess().getAxisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getAxisKeyword_1()); 

            }


            }

        }
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
    // InternalKinematics.g:614:1: rule__Axis__Group__2 : rule__Axis__Group__2__Impl rule__Axis__Group__3 ;
    public final void rule__Axis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:618:1: ( rule__Axis__Group__2__Impl rule__Axis__Group__3 )
            // InternalKinematics.g:619:2: rule__Axis__Group__2__Impl rule__Axis__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalKinematics.g:626:1: rule__Axis__Group__2__Impl : ( '{' ) ;
    public final void rule__Axis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:630:1: ( ( '{' ) )
            // InternalKinematics.g:631:1: ( '{' )
            {
            // InternalKinematics.g:631:1: ( '{' )
            // InternalKinematics.g:632:2: '{'
            {
             before(grammarAccess.getAxisAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalKinematics.g:641:1: rule__Axis__Group__3 : rule__Axis__Group__3__Impl rule__Axis__Group__4 ;
    public final void rule__Axis__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:645:1: ( rule__Axis__Group__3__Impl rule__Axis__Group__4 )
            // InternalKinematics.g:646:2: rule__Axis__Group__3__Impl rule__Axis__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Axis__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__4();

            state._fsp--;


            }

        }
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
    // InternalKinematics.g:653:1: rule__Axis__Group__3__Impl : ( ( rule__Axis__Group_3__0 )? ) ;
    public final void rule__Axis__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:657:1: ( ( ( rule__Axis__Group_3__0 )? ) )
            // InternalKinematics.g:658:1: ( ( rule__Axis__Group_3__0 )? )
            {
            // InternalKinematics.g:658:1: ( ( rule__Axis__Group_3__0 )? )
            // InternalKinematics.g:659:2: ( rule__Axis__Group_3__0 )?
            {
             before(grammarAccess.getAxisAccess().getGroup_3()); 
            // InternalKinematics.g:660:2: ( rule__Axis__Group_3__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalKinematics.g:660:3: rule__Axis__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Axis__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAxisAccess().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Axis__Group__4"
    // InternalKinematics.g:668:1: rule__Axis__Group__4 : rule__Axis__Group__4__Impl ;
    public final void rule__Axis__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:672:1: ( rule__Axis__Group__4__Impl )
            // InternalKinematics.g:673:2: rule__Axis__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Axis__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__4"


    // $ANTLR start "rule__Axis__Group__4__Impl"
    // InternalKinematics.g:679:1: rule__Axis__Group__4__Impl : ( '}' ) ;
    public final void rule__Axis__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:683:1: ( ( '}' ) )
            // InternalKinematics.g:684:1: ( '}' )
            {
            // InternalKinematics.g:684:1: ( '}' )
            // InternalKinematics.g:685:2: '}'
            {
             before(grammarAccess.getAxisAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__4__Impl"


    // $ANTLR start "rule__Axis__Group_3__0"
    // InternalKinematics.g:695:1: rule__Axis__Group_3__0 : rule__Axis__Group_3__0__Impl rule__Axis__Group_3__1 ;
    public final void rule__Axis__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:699:1: ( rule__Axis__Group_3__0__Impl rule__Axis__Group_3__1 )
            // InternalKinematics.g:700:2: rule__Axis__Group_3__0__Impl rule__Axis__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Axis__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_3__0"


    // $ANTLR start "rule__Axis__Group_3__0__Impl"
    // InternalKinematics.g:707:1: rule__Axis__Group_3__0__Impl : ( 'xyz' ) ;
    public final void rule__Axis__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:711:1: ( ( 'xyz' ) )
            // InternalKinematics.g:712:1: ( 'xyz' )
            {
            // InternalKinematics.g:712:1: ( 'xyz' )
            // InternalKinematics.g:713:2: 'xyz'
            {
             before(grammarAccess.getAxisAccess().getXyzKeyword_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getXyzKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_3__0__Impl"


    // $ANTLR start "rule__Axis__Group_3__1"
    // InternalKinematics.g:722:1: rule__Axis__Group_3__1 : rule__Axis__Group_3__1__Impl ;
    public final void rule__Axis__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:726:1: ( rule__Axis__Group_3__1__Impl )
            // InternalKinematics.g:727:2: rule__Axis__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Axis__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_3__1"


    // $ANTLR start "rule__Axis__Group_3__1__Impl"
    // InternalKinematics.g:733:1: rule__Axis__Group_3__1__Impl : ( ( rule__Axis__XyzAssignment_3_1 ) ) ;
    public final void rule__Axis__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:737:1: ( ( ( rule__Axis__XyzAssignment_3_1 ) ) )
            // InternalKinematics.g:738:1: ( ( rule__Axis__XyzAssignment_3_1 ) )
            {
            // InternalKinematics.g:738:1: ( ( rule__Axis__XyzAssignment_3_1 ) )
            // InternalKinematics.g:739:2: ( rule__Axis__XyzAssignment_3_1 )
            {
             before(grammarAccess.getAxisAccess().getXyzAssignment_3_1()); 
            // InternalKinematics.g:740:2: ( rule__Axis__XyzAssignment_3_1 )
            // InternalKinematics.g:740:3: rule__Axis__XyzAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Axis__XyzAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getXyzAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_3__1__Impl"


    // $ANTLR start "rule__Pose__Group__0"
    // InternalKinematics.g:749:1: rule__Pose__Group__0 : rule__Pose__Group__0__Impl rule__Pose__Group__1 ;
    public final void rule__Pose__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:753:1: ( rule__Pose__Group__0__Impl rule__Pose__Group__1 )
            // InternalKinematics.g:754:2: rule__Pose__Group__0__Impl rule__Pose__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalKinematics.g:761:1: rule__Pose__Group__0__Impl : ( () ) ;
    public final void rule__Pose__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:765:1: ( ( () ) )
            // InternalKinematics.g:766:1: ( () )
            {
            // InternalKinematics.g:766:1: ( () )
            // InternalKinematics.g:767:2: ()
            {
             before(grammarAccess.getPoseAccess().getPoseAction_0()); 
            // InternalKinematics.g:768:2: ()
            // InternalKinematics.g:768:3: 
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
    // InternalKinematics.g:776:1: rule__Pose__Group__1 : rule__Pose__Group__1__Impl rule__Pose__Group__2 ;
    public final void rule__Pose__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:780:1: ( rule__Pose__Group__1__Impl rule__Pose__Group__2 )
            // InternalKinematics.g:781:2: rule__Pose__Group__1__Impl rule__Pose__Group__2
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
    // InternalKinematics.g:788:1: rule__Pose__Group__1__Impl : ( 'Pose' ) ;
    public final void rule__Pose__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:792:1: ( ( 'Pose' ) )
            // InternalKinematics.g:793:1: ( 'Pose' )
            {
            // InternalKinematics.g:793:1: ( 'Pose' )
            // InternalKinematics.g:794:2: 'Pose'
            {
             before(grammarAccess.getPoseAccess().getPoseKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalKinematics.g:803:1: rule__Pose__Group__2 : rule__Pose__Group__2__Impl rule__Pose__Group__3 ;
    public final void rule__Pose__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:807:1: ( rule__Pose__Group__2__Impl rule__Pose__Group__3 )
            // InternalKinematics.g:808:2: rule__Pose__Group__2__Impl rule__Pose__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalKinematics.g:815:1: rule__Pose__Group__2__Impl : ( '{' ) ;
    public final void rule__Pose__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:819:1: ( ( '{' ) )
            // InternalKinematics.g:820:1: ( '{' )
            {
            // InternalKinematics.g:820:1: ( '{' )
            // InternalKinematics.g:821:2: '{'
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
    // InternalKinematics.g:830:1: rule__Pose__Group__3 : rule__Pose__Group__3__Impl rule__Pose__Group__4 ;
    public final void rule__Pose__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:834:1: ( rule__Pose__Group__3__Impl rule__Pose__Group__4 )
            // InternalKinematics.g:835:2: rule__Pose__Group__3__Impl rule__Pose__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalKinematics.g:842:1: rule__Pose__Group__3__Impl : ( ( rule__Pose__Group_3__0 )? ) ;
    public final void rule__Pose__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:846:1: ( ( ( rule__Pose__Group_3__0 )? ) )
            // InternalKinematics.g:847:1: ( ( rule__Pose__Group_3__0 )? )
            {
            // InternalKinematics.g:847:1: ( ( rule__Pose__Group_3__0 )? )
            // InternalKinematics.g:848:2: ( rule__Pose__Group_3__0 )?
            {
             before(grammarAccess.getPoseAccess().getGroup_3()); 
            // InternalKinematics.g:849:2: ( rule__Pose__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKinematics.g:849:3: rule__Pose__Group_3__0
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
    // InternalKinematics.g:857:1: rule__Pose__Group__4 : rule__Pose__Group__4__Impl rule__Pose__Group__5 ;
    public final void rule__Pose__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:861:1: ( rule__Pose__Group__4__Impl rule__Pose__Group__5 )
            // InternalKinematics.g:862:2: rule__Pose__Group__4__Impl rule__Pose__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalKinematics.g:869:1: rule__Pose__Group__4__Impl : ( ( rule__Pose__Group_4__0 )? ) ;
    public final void rule__Pose__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:873:1: ( ( ( rule__Pose__Group_4__0 )? ) )
            // InternalKinematics.g:874:1: ( ( rule__Pose__Group_4__0 )? )
            {
            // InternalKinematics.g:874:1: ( ( rule__Pose__Group_4__0 )? )
            // InternalKinematics.g:875:2: ( rule__Pose__Group_4__0 )?
            {
             before(grammarAccess.getPoseAccess().getGroup_4()); 
            // InternalKinematics.g:876:2: ( rule__Pose__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKinematics.g:876:3: rule__Pose__Group_4__0
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
    // InternalKinematics.g:884:1: rule__Pose__Group__5 : rule__Pose__Group__5__Impl ;
    public final void rule__Pose__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:888:1: ( rule__Pose__Group__5__Impl )
            // InternalKinematics.g:889:2: rule__Pose__Group__5__Impl
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
    // InternalKinematics.g:895:1: rule__Pose__Group__5__Impl : ( '}' ) ;
    public final void rule__Pose__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:899:1: ( ( '}' ) )
            // InternalKinematics.g:900:1: ( '}' )
            {
            // InternalKinematics.g:900:1: ( '}' )
            // InternalKinematics.g:901:2: '}'
            {
             before(grammarAccess.getPoseAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
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
    // InternalKinematics.g:911:1: rule__Pose__Group_3__0 : rule__Pose__Group_3__0__Impl rule__Pose__Group_3__1 ;
    public final void rule__Pose__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:915:1: ( rule__Pose__Group_3__0__Impl rule__Pose__Group_3__1 )
            // InternalKinematics.g:916:2: rule__Pose__Group_3__0__Impl rule__Pose__Group_3__1
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
    // InternalKinematics.g:923:1: rule__Pose__Group_3__0__Impl : ( 'rpy' ) ;
    public final void rule__Pose__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:927:1: ( ( 'rpy' ) )
            // InternalKinematics.g:928:1: ( 'rpy' )
            {
            // InternalKinematics.g:928:1: ( 'rpy' )
            // InternalKinematics.g:929:2: 'rpy'
            {
             before(grammarAccess.getPoseAccess().getRpyKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalKinematics.g:938:1: rule__Pose__Group_3__1 : rule__Pose__Group_3__1__Impl ;
    public final void rule__Pose__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:942:1: ( rule__Pose__Group_3__1__Impl )
            // InternalKinematics.g:943:2: rule__Pose__Group_3__1__Impl
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
    // InternalKinematics.g:949:1: rule__Pose__Group_3__1__Impl : ( ( rule__Pose__RpyAssignment_3_1 ) ) ;
    public final void rule__Pose__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:953:1: ( ( ( rule__Pose__RpyAssignment_3_1 ) ) )
            // InternalKinematics.g:954:1: ( ( rule__Pose__RpyAssignment_3_1 ) )
            {
            // InternalKinematics.g:954:1: ( ( rule__Pose__RpyAssignment_3_1 ) )
            // InternalKinematics.g:955:2: ( rule__Pose__RpyAssignment_3_1 )
            {
             before(grammarAccess.getPoseAccess().getRpyAssignment_3_1()); 
            // InternalKinematics.g:956:2: ( rule__Pose__RpyAssignment_3_1 )
            // InternalKinematics.g:956:3: rule__Pose__RpyAssignment_3_1
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
    // InternalKinematics.g:965:1: rule__Pose__Group_4__0 : rule__Pose__Group_4__0__Impl rule__Pose__Group_4__1 ;
    public final void rule__Pose__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:969:1: ( rule__Pose__Group_4__0__Impl rule__Pose__Group_4__1 )
            // InternalKinematics.g:970:2: rule__Pose__Group_4__0__Impl rule__Pose__Group_4__1
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
    // InternalKinematics.g:977:1: rule__Pose__Group_4__0__Impl : ( 'xyz' ) ;
    public final void rule__Pose__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:981:1: ( ( 'xyz' ) )
            // InternalKinematics.g:982:1: ( 'xyz' )
            {
            // InternalKinematics.g:982:1: ( 'xyz' )
            // InternalKinematics.g:983:2: 'xyz'
            {
             before(grammarAccess.getPoseAccess().getXyzKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalKinematics.g:992:1: rule__Pose__Group_4__1 : rule__Pose__Group_4__1__Impl ;
    public final void rule__Pose__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:996:1: ( rule__Pose__Group_4__1__Impl )
            // InternalKinematics.g:997:2: rule__Pose__Group_4__1__Impl
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
    // InternalKinematics.g:1003:1: rule__Pose__Group_4__1__Impl : ( ( rule__Pose__XyzAssignment_4_1 ) ) ;
    public final void rule__Pose__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1007:1: ( ( ( rule__Pose__XyzAssignment_4_1 ) ) )
            // InternalKinematics.g:1008:1: ( ( rule__Pose__XyzAssignment_4_1 ) )
            {
            // InternalKinematics.g:1008:1: ( ( rule__Pose__XyzAssignment_4_1 ) )
            // InternalKinematics.g:1009:2: ( rule__Pose__XyzAssignment_4_1 )
            {
             before(grammarAccess.getPoseAccess().getXyzAssignment_4_1()); 
            // InternalKinematics.g:1010:2: ( rule__Pose__XyzAssignment_4_1 )
            // InternalKinematics.g:1010:3: rule__Pose__XyzAssignment_4_1
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


    // $ANTLR start "rule__Limit__Group__0"
    // InternalKinematics.g:1019:1: rule__Limit__Group__0 : rule__Limit__Group__0__Impl rule__Limit__Group__1 ;
    public final void rule__Limit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1023:1: ( rule__Limit__Group__0__Impl rule__Limit__Group__1 )
            // InternalKinematics.g:1024:2: rule__Limit__Group__0__Impl rule__Limit__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalKinematics.g:1031:1: rule__Limit__Group__0__Impl : ( () ) ;
    public final void rule__Limit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1035:1: ( ( () ) )
            // InternalKinematics.g:1036:1: ( () )
            {
            // InternalKinematics.g:1036:1: ( () )
            // InternalKinematics.g:1037:2: ()
            {
             before(grammarAccess.getLimitAccess().getLimitAction_0()); 
            // InternalKinematics.g:1038:2: ()
            // InternalKinematics.g:1038:3: 
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
    // InternalKinematics.g:1046:1: rule__Limit__Group__1 : rule__Limit__Group__1__Impl rule__Limit__Group__2 ;
    public final void rule__Limit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1050:1: ( rule__Limit__Group__1__Impl rule__Limit__Group__2 )
            // InternalKinematics.g:1051:2: rule__Limit__Group__1__Impl rule__Limit__Group__2
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
    // InternalKinematics.g:1058:1: rule__Limit__Group__1__Impl : ( 'Limit' ) ;
    public final void rule__Limit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1062:1: ( ( 'Limit' ) )
            // InternalKinematics.g:1063:1: ( 'Limit' )
            {
            // InternalKinematics.g:1063:1: ( 'Limit' )
            // InternalKinematics.g:1064:2: 'Limit'
            {
             before(grammarAccess.getLimitAccess().getLimitKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalKinematics.g:1073:1: rule__Limit__Group__2 : rule__Limit__Group__2__Impl rule__Limit__Group__3 ;
    public final void rule__Limit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1077:1: ( rule__Limit__Group__2__Impl rule__Limit__Group__3 )
            // InternalKinematics.g:1078:2: rule__Limit__Group__2__Impl rule__Limit__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalKinematics.g:1085:1: rule__Limit__Group__2__Impl : ( '{' ) ;
    public final void rule__Limit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1089:1: ( ( '{' ) )
            // InternalKinematics.g:1090:1: ( '{' )
            {
            // InternalKinematics.g:1090:1: ( '{' )
            // InternalKinematics.g:1091:2: '{'
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
    // InternalKinematics.g:1100:1: rule__Limit__Group__3 : rule__Limit__Group__3__Impl rule__Limit__Group__4 ;
    public final void rule__Limit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1104:1: ( rule__Limit__Group__3__Impl rule__Limit__Group__4 )
            // InternalKinematics.g:1105:2: rule__Limit__Group__3__Impl rule__Limit__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalKinematics.g:1112:1: rule__Limit__Group__3__Impl : ( ( rule__Limit__Group_3__0 )? ) ;
    public final void rule__Limit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1116:1: ( ( ( rule__Limit__Group_3__0 )? ) )
            // InternalKinematics.g:1117:1: ( ( rule__Limit__Group_3__0 )? )
            {
            // InternalKinematics.g:1117:1: ( ( rule__Limit__Group_3__0 )? )
            // InternalKinematics.g:1118:2: ( rule__Limit__Group_3__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_3()); 
            // InternalKinematics.g:1119:2: ( rule__Limit__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalKinematics.g:1119:3: rule__Limit__Group_3__0
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
    // InternalKinematics.g:1127:1: rule__Limit__Group__4 : rule__Limit__Group__4__Impl rule__Limit__Group__5 ;
    public final void rule__Limit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1131:1: ( rule__Limit__Group__4__Impl rule__Limit__Group__5 )
            // InternalKinematics.g:1132:2: rule__Limit__Group__4__Impl rule__Limit__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalKinematics.g:1139:1: rule__Limit__Group__4__Impl : ( ( rule__Limit__Group_4__0 )? ) ;
    public final void rule__Limit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1143:1: ( ( ( rule__Limit__Group_4__0 )? ) )
            // InternalKinematics.g:1144:1: ( ( rule__Limit__Group_4__0 )? )
            {
            // InternalKinematics.g:1144:1: ( ( rule__Limit__Group_4__0 )? )
            // InternalKinematics.g:1145:2: ( rule__Limit__Group_4__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_4()); 
            // InternalKinematics.g:1146:2: ( rule__Limit__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKinematics.g:1146:3: rule__Limit__Group_4__0
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
    // InternalKinematics.g:1154:1: rule__Limit__Group__5 : rule__Limit__Group__5__Impl rule__Limit__Group__6 ;
    public final void rule__Limit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1158:1: ( rule__Limit__Group__5__Impl rule__Limit__Group__6 )
            // InternalKinematics.g:1159:2: rule__Limit__Group__5__Impl rule__Limit__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalKinematics.g:1166:1: rule__Limit__Group__5__Impl : ( ( rule__Limit__Group_5__0 )? ) ;
    public final void rule__Limit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1170:1: ( ( ( rule__Limit__Group_5__0 )? ) )
            // InternalKinematics.g:1171:1: ( ( rule__Limit__Group_5__0 )? )
            {
            // InternalKinematics.g:1171:1: ( ( rule__Limit__Group_5__0 )? )
            // InternalKinematics.g:1172:2: ( rule__Limit__Group_5__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_5()); 
            // InternalKinematics.g:1173:2: ( rule__Limit__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKinematics.g:1173:3: rule__Limit__Group_5__0
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
    // InternalKinematics.g:1181:1: rule__Limit__Group__6 : rule__Limit__Group__6__Impl rule__Limit__Group__7 ;
    public final void rule__Limit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1185:1: ( rule__Limit__Group__6__Impl rule__Limit__Group__7 )
            // InternalKinematics.g:1186:2: rule__Limit__Group__6__Impl rule__Limit__Group__7
            {
            pushFollow(FOLLOW_12);
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
    // InternalKinematics.g:1193:1: rule__Limit__Group__6__Impl : ( ( rule__Limit__Group_6__0 )? ) ;
    public final void rule__Limit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1197:1: ( ( ( rule__Limit__Group_6__0 )? ) )
            // InternalKinematics.g:1198:1: ( ( rule__Limit__Group_6__0 )? )
            {
            // InternalKinematics.g:1198:1: ( ( rule__Limit__Group_6__0 )? )
            // InternalKinematics.g:1199:2: ( rule__Limit__Group_6__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_6()); 
            // InternalKinematics.g:1200:2: ( rule__Limit__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKinematics.g:1200:3: rule__Limit__Group_6__0
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
    // InternalKinematics.g:1208:1: rule__Limit__Group__7 : rule__Limit__Group__7__Impl ;
    public final void rule__Limit__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1212:1: ( rule__Limit__Group__7__Impl )
            // InternalKinematics.g:1213:2: rule__Limit__Group__7__Impl
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
    // InternalKinematics.g:1219:1: rule__Limit__Group__7__Impl : ( '}' ) ;
    public final void rule__Limit__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1223:1: ( ( '}' ) )
            // InternalKinematics.g:1224:1: ( '}' )
            {
            // InternalKinematics.g:1224:1: ( '}' )
            // InternalKinematics.g:1225:2: '}'
            {
             before(grammarAccess.getLimitAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
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
    // InternalKinematics.g:1235:1: rule__Limit__Group_3__0 : rule__Limit__Group_3__0__Impl rule__Limit__Group_3__1 ;
    public final void rule__Limit__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1239:1: ( rule__Limit__Group_3__0__Impl rule__Limit__Group_3__1 )
            // InternalKinematics.g:1240:2: rule__Limit__Group_3__0__Impl rule__Limit__Group_3__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalKinematics.g:1247:1: rule__Limit__Group_3__0__Impl : ( 'effort' ) ;
    public final void rule__Limit__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1251:1: ( ( 'effort' ) )
            // InternalKinematics.g:1252:1: ( 'effort' )
            {
            // InternalKinematics.g:1252:1: ( 'effort' )
            // InternalKinematics.g:1253:2: 'effort'
            {
             before(grammarAccess.getLimitAccess().getEffortKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalKinematics.g:1262:1: rule__Limit__Group_3__1 : rule__Limit__Group_3__1__Impl ;
    public final void rule__Limit__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1266:1: ( rule__Limit__Group_3__1__Impl )
            // InternalKinematics.g:1267:2: rule__Limit__Group_3__1__Impl
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
    // InternalKinematics.g:1273:1: rule__Limit__Group_3__1__Impl : ( ( rule__Limit__EffortAssignment_3_1 ) ) ;
    public final void rule__Limit__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1277:1: ( ( ( rule__Limit__EffortAssignment_3_1 ) ) )
            // InternalKinematics.g:1278:1: ( ( rule__Limit__EffortAssignment_3_1 ) )
            {
            // InternalKinematics.g:1278:1: ( ( rule__Limit__EffortAssignment_3_1 ) )
            // InternalKinematics.g:1279:2: ( rule__Limit__EffortAssignment_3_1 )
            {
             before(grammarAccess.getLimitAccess().getEffortAssignment_3_1()); 
            // InternalKinematics.g:1280:2: ( rule__Limit__EffortAssignment_3_1 )
            // InternalKinematics.g:1280:3: rule__Limit__EffortAssignment_3_1
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
    // InternalKinematics.g:1289:1: rule__Limit__Group_4__0 : rule__Limit__Group_4__0__Impl rule__Limit__Group_4__1 ;
    public final void rule__Limit__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1293:1: ( rule__Limit__Group_4__0__Impl rule__Limit__Group_4__1 )
            // InternalKinematics.g:1294:2: rule__Limit__Group_4__0__Impl rule__Limit__Group_4__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalKinematics.g:1301:1: rule__Limit__Group_4__0__Impl : ( 'lower' ) ;
    public final void rule__Limit__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1305:1: ( ( 'lower' ) )
            // InternalKinematics.g:1306:1: ( 'lower' )
            {
            // InternalKinematics.g:1306:1: ( 'lower' )
            // InternalKinematics.g:1307:2: 'lower'
            {
             before(grammarAccess.getLimitAccess().getLowerKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalKinematics.g:1316:1: rule__Limit__Group_4__1 : rule__Limit__Group_4__1__Impl ;
    public final void rule__Limit__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1320:1: ( rule__Limit__Group_4__1__Impl )
            // InternalKinematics.g:1321:2: rule__Limit__Group_4__1__Impl
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
    // InternalKinematics.g:1327:1: rule__Limit__Group_4__1__Impl : ( ( rule__Limit__LowerAssignment_4_1 ) ) ;
    public final void rule__Limit__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1331:1: ( ( ( rule__Limit__LowerAssignment_4_1 ) ) )
            // InternalKinematics.g:1332:1: ( ( rule__Limit__LowerAssignment_4_1 ) )
            {
            // InternalKinematics.g:1332:1: ( ( rule__Limit__LowerAssignment_4_1 ) )
            // InternalKinematics.g:1333:2: ( rule__Limit__LowerAssignment_4_1 )
            {
             before(grammarAccess.getLimitAccess().getLowerAssignment_4_1()); 
            // InternalKinematics.g:1334:2: ( rule__Limit__LowerAssignment_4_1 )
            // InternalKinematics.g:1334:3: rule__Limit__LowerAssignment_4_1
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
    // InternalKinematics.g:1343:1: rule__Limit__Group_5__0 : rule__Limit__Group_5__0__Impl rule__Limit__Group_5__1 ;
    public final void rule__Limit__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1347:1: ( rule__Limit__Group_5__0__Impl rule__Limit__Group_5__1 )
            // InternalKinematics.g:1348:2: rule__Limit__Group_5__0__Impl rule__Limit__Group_5__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalKinematics.g:1355:1: rule__Limit__Group_5__0__Impl : ( 'upper' ) ;
    public final void rule__Limit__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1359:1: ( ( 'upper' ) )
            // InternalKinematics.g:1360:1: ( 'upper' )
            {
            // InternalKinematics.g:1360:1: ( 'upper' )
            // InternalKinematics.g:1361:2: 'upper'
            {
             before(grammarAccess.getLimitAccess().getUpperKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalKinematics.g:1370:1: rule__Limit__Group_5__1 : rule__Limit__Group_5__1__Impl ;
    public final void rule__Limit__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1374:1: ( rule__Limit__Group_5__1__Impl )
            // InternalKinematics.g:1375:2: rule__Limit__Group_5__1__Impl
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
    // InternalKinematics.g:1381:1: rule__Limit__Group_5__1__Impl : ( ( rule__Limit__UpperAssignment_5_1 ) ) ;
    public final void rule__Limit__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1385:1: ( ( ( rule__Limit__UpperAssignment_5_1 ) ) )
            // InternalKinematics.g:1386:1: ( ( rule__Limit__UpperAssignment_5_1 ) )
            {
            // InternalKinematics.g:1386:1: ( ( rule__Limit__UpperAssignment_5_1 ) )
            // InternalKinematics.g:1387:2: ( rule__Limit__UpperAssignment_5_1 )
            {
             before(grammarAccess.getLimitAccess().getUpperAssignment_5_1()); 
            // InternalKinematics.g:1388:2: ( rule__Limit__UpperAssignment_5_1 )
            // InternalKinematics.g:1388:3: rule__Limit__UpperAssignment_5_1
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
    // InternalKinematics.g:1397:1: rule__Limit__Group_6__0 : rule__Limit__Group_6__0__Impl rule__Limit__Group_6__1 ;
    public final void rule__Limit__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1401:1: ( rule__Limit__Group_6__0__Impl rule__Limit__Group_6__1 )
            // InternalKinematics.g:1402:2: rule__Limit__Group_6__0__Impl rule__Limit__Group_6__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalKinematics.g:1409:1: rule__Limit__Group_6__0__Impl : ( 'velocity' ) ;
    public final void rule__Limit__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1413:1: ( ( 'velocity' ) )
            // InternalKinematics.g:1414:1: ( 'velocity' )
            {
            // InternalKinematics.g:1414:1: ( 'velocity' )
            // InternalKinematics.g:1415:2: 'velocity'
            {
             before(grammarAccess.getLimitAccess().getVelocityKeyword_6_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalKinematics.g:1424:1: rule__Limit__Group_6__1 : rule__Limit__Group_6__1__Impl ;
    public final void rule__Limit__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1428:1: ( rule__Limit__Group_6__1__Impl )
            // InternalKinematics.g:1429:2: rule__Limit__Group_6__1__Impl
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
    // InternalKinematics.g:1435:1: rule__Limit__Group_6__1__Impl : ( ( rule__Limit__VelocityAssignment_6_1 ) ) ;
    public final void rule__Limit__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1439:1: ( ( ( rule__Limit__VelocityAssignment_6_1 ) ) )
            // InternalKinematics.g:1440:1: ( ( rule__Limit__VelocityAssignment_6_1 ) )
            {
            // InternalKinematics.g:1440:1: ( ( rule__Limit__VelocityAssignment_6_1 ) )
            // InternalKinematics.g:1441:2: ( rule__Limit__VelocityAssignment_6_1 )
            {
             before(grammarAccess.getLimitAccess().getVelocityAssignment_6_1()); 
            // InternalKinematics.g:1442:2: ( rule__Limit__VelocityAssignment_6_1 )
            // InternalKinematics.g:1442:3: rule__Limit__VelocityAssignment_6_1
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
    // InternalKinematics.g:1451:1: rule__Inertial__Group__0 : rule__Inertial__Group__0__Impl rule__Inertial__Group__1 ;
    public final void rule__Inertial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1455:1: ( rule__Inertial__Group__0__Impl rule__Inertial__Group__1 )
            // InternalKinematics.g:1456:2: rule__Inertial__Group__0__Impl rule__Inertial__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalKinematics.g:1463:1: rule__Inertial__Group__0__Impl : ( () ) ;
    public final void rule__Inertial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1467:1: ( ( () ) )
            // InternalKinematics.g:1468:1: ( () )
            {
            // InternalKinematics.g:1468:1: ( () )
            // InternalKinematics.g:1469:2: ()
            {
             before(grammarAccess.getInertialAccess().getInertialAction_0()); 
            // InternalKinematics.g:1470:2: ()
            // InternalKinematics.g:1470:3: 
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
    // InternalKinematics.g:1478:1: rule__Inertial__Group__1 : rule__Inertial__Group__1__Impl rule__Inertial__Group__2 ;
    public final void rule__Inertial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1482:1: ( rule__Inertial__Group__1__Impl rule__Inertial__Group__2 )
            // InternalKinematics.g:1483:2: rule__Inertial__Group__1__Impl rule__Inertial__Group__2
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
    // InternalKinematics.g:1490:1: rule__Inertial__Group__1__Impl : ( 'Inertial' ) ;
    public final void rule__Inertial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1494:1: ( ( 'Inertial' ) )
            // InternalKinematics.g:1495:1: ( 'Inertial' )
            {
            // InternalKinematics.g:1495:1: ( 'Inertial' )
            // InternalKinematics.g:1496:2: 'Inertial'
            {
             before(grammarAccess.getInertialAccess().getInertialKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalKinematics.g:1505:1: rule__Inertial__Group__2 : rule__Inertial__Group__2__Impl rule__Inertial__Group__3 ;
    public final void rule__Inertial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1509:1: ( rule__Inertial__Group__2__Impl rule__Inertial__Group__3 )
            // InternalKinematics.g:1510:2: rule__Inertial__Group__2__Impl rule__Inertial__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalKinematics.g:1517:1: rule__Inertial__Group__2__Impl : ( '{' ) ;
    public final void rule__Inertial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1521:1: ( ( '{' ) )
            // InternalKinematics.g:1522:1: ( '{' )
            {
            // InternalKinematics.g:1522:1: ( '{' )
            // InternalKinematics.g:1523:2: '{'
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
    // InternalKinematics.g:1532:1: rule__Inertial__Group__3 : rule__Inertial__Group__3__Impl rule__Inertial__Group__4 ;
    public final void rule__Inertial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1536:1: ( rule__Inertial__Group__3__Impl rule__Inertial__Group__4 )
            // InternalKinematics.g:1537:2: rule__Inertial__Group__3__Impl rule__Inertial__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalKinematics.g:1544:1: rule__Inertial__Group__3__Impl : ( ( rule__Inertial__Group_3__0 )? ) ;
    public final void rule__Inertial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1548:1: ( ( ( rule__Inertial__Group_3__0 )? ) )
            // InternalKinematics.g:1549:1: ( ( rule__Inertial__Group_3__0 )? )
            {
            // InternalKinematics.g:1549:1: ( ( rule__Inertial__Group_3__0 )? )
            // InternalKinematics.g:1550:2: ( rule__Inertial__Group_3__0 )?
            {
             before(grammarAccess.getInertialAccess().getGroup_3()); 
            // InternalKinematics.g:1551:2: ( rule__Inertial__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalKinematics.g:1551:3: rule__Inertial__Group_3__0
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
    // InternalKinematics.g:1559:1: rule__Inertial__Group__4 : rule__Inertial__Group__4__Impl rule__Inertial__Group__5 ;
    public final void rule__Inertial__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1563:1: ( rule__Inertial__Group__4__Impl rule__Inertial__Group__5 )
            // InternalKinematics.g:1564:2: rule__Inertial__Group__4__Impl rule__Inertial__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalKinematics.g:1571:1: rule__Inertial__Group__4__Impl : ( ( rule__Inertial__Group_4__0 )? ) ;
    public final void rule__Inertial__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1575:1: ( ( ( rule__Inertial__Group_4__0 )? ) )
            // InternalKinematics.g:1576:1: ( ( rule__Inertial__Group_4__0 )? )
            {
            // InternalKinematics.g:1576:1: ( ( rule__Inertial__Group_4__0 )? )
            // InternalKinematics.g:1577:2: ( rule__Inertial__Group_4__0 )?
            {
             before(grammarAccess.getInertialAccess().getGroup_4()); 
            // InternalKinematics.g:1578:2: ( rule__Inertial__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKinematics.g:1578:3: rule__Inertial__Group_4__0
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
    // InternalKinematics.g:1586:1: rule__Inertial__Group__5 : rule__Inertial__Group__5__Impl rule__Inertial__Group__6 ;
    public final void rule__Inertial__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1590:1: ( rule__Inertial__Group__5__Impl rule__Inertial__Group__6 )
            // InternalKinematics.g:1591:2: rule__Inertial__Group__5__Impl rule__Inertial__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalKinematics.g:1598:1: rule__Inertial__Group__5__Impl : ( ( rule__Inertial__Group_5__0 )? ) ;
    public final void rule__Inertial__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1602:1: ( ( ( rule__Inertial__Group_5__0 )? ) )
            // InternalKinematics.g:1603:1: ( ( rule__Inertial__Group_5__0 )? )
            {
            // InternalKinematics.g:1603:1: ( ( rule__Inertial__Group_5__0 )? )
            // InternalKinematics.g:1604:2: ( rule__Inertial__Group_5__0 )?
            {
             before(grammarAccess.getInertialAccess().getGroup_5()); 
            // InternalKinematics.g:1605:2: ( rule__Inertial__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalKinematics.g:1605:3: rule__Inertial__Group_5__0
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
    // InternalKinematics.g:1613:1: rule__Inertial__Group__6 : rule__Inertial__Group__6__Impl ;
    public final void rule__Inertial__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1617:1: ( rule__Inertial__Group__6__Impl )
            // InternalKinematics.g:1618:2: rule__Inertial__Group__6__Impl
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
    // InternalKinematics.g:1624:1: rule__Inertial__Group__6__Impl : ( '}' ) ;
    public final void rule__Inertial__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1628:1: ( ( '}' ) )
            // InternalKinematics.g:1629:1: ( '}' )
            {
            // InternalKinematics.g:1629:1: ( '}' )
            // InternalKinematics.g:1630:2: '}'
            {
             before(grammarAccess.getInertialAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
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
    // InternalKinematics.g:1640:1: rule__Inertial__Group_3__0 : rule__Inertial__Group_3__0__Impl rule__Inertial__Group_3__1 ;
    public final void rule__Inertial__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1644:1: ( rule__Inertial__Group_3__0__Impl rule__Inertial__Group_3__1 )
            // InternalKinematics.g:1645:2: rule__Inertial__Group_3__0__Impl rule__Inertial__Group_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalKinematics.g:1652:1: rule__Inertial__Group_3__0__Impl : ( 'origin' ) ;
    public final void rule__Inertial__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1656:1: ( ( 'origin' ) )
            // InternalKinematics.g:1657:1: ( 'origin' )
            {
            // InternalKinematics.g:1657:1: ( 'origin' )
            // InternalKinematics.g:1658:2: 'origin'
            {
             before(grammarAccess.getInertialAccess().getOriginKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalKinematics.g:1667:1: rule__Inertial__Group_3__1 : rule__Inertial__Group_3__1__Impl ;
    public final void rule__Inertial__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1671:1: ( rule__Inertial__Group_3__1__Impl )
            // InternalKinematics.g:1672:2: rule__Inertial__Group_3__1__Impl
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
    // InternalKinematics.g:1678:1: rule__Inertial__Group_3__1__Impl : ( ( rule__Inertial__OriginAssignment_3_1 ) ) ;
    public final void rule__Inertial__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1682:1: ( ( ( rule__Inertial__OriginAssignment_3_1 ) ) )
            // InternalKinematics.g:1683:1: ( ( rule__Inertial__OriginAssignment_3_1 ) )
            {
            // InternalKinematics.g:1683:1: ( ( rule__Inertial__OriginAssignment_3_1 ) )
            // InternalKinematics.g:1684:2: ( rule__Inertial__OriginAssignment_3_1 )
            {
             before(grammarAccess.getInertialAccess().getOriginAssignment_3_1()); 
            // InternalKinematics.g:1685:2: ( rule__Inertial__OriginAssignment_3_1 )
            // InternalKinematics.g:1685:3: rule__Inertial__OriginAssignment_3_1
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
    // InternalKinematics.g:1694:1: rule__Inertial__Group_4__0 : rule__Inertial__Group_4__0__Impl rule__Inertial__Group_4__1 ;
    public final void rule__Inertial__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1698:1: ( rule__Inertial__Group_4__0__Impl rule__Inertial__Group_4__1 )
            // InternalKinematics.g:1699:2: rule__Inertial__Group_4__0__Impl rule__Inertial__Group_4__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalKinematics.g:1706:1: rule__Inertial__Group_4__0__Impl : ( 'mass' ) ;
    public final void rule__Inertial__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1710:1: ( ( 'mass' ) )
            // InternalKinematics.g:1711:1: ( 'mass' )
            {
            // InternalKinematics.g:1711:1: ( 'mass' )
            // InternalKinematics.g:1712:2: 'mass'
            {
             before(grammarAccess.getInertialAccess().getMassKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalKinematics.g:1721:1: rule__Inertial__Group_4__1 : rule__Inertial__Group_4__1__Impl ;
    public final void rule__Inertial__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1725:1: ( rule__Inertial__Group_4__1__Impl )
            // InternalKinematics.g:1726:2: rule__Inertial__Group_4__1__Impl
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
    // InternalKinematics.g:1732:1: rule__Inertial__Group_4__1__Impl : ( ( rule__Inertial__MassAssignment_4_1 ) ) ;
    public final void rule__Inertial__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1736:1: ( ( ( rule__Inertial__MassAssignment_4_1 ) ) )
            // InternalKinematics.g:1737:1: ( ( rule__Inertial__MassAssignment_4_1 ) )
            {
            // InternalKinematics.g:1737:1: ( ( rule__Inertial__MassAssignment_4_1 ) )
            // InternalKinematics.g:1738:2: ( rule__Inertial__MassAssignment_4_1 )
            {
             before(grammarAccess.getInertialAccess().getMassAssignment_4_1()); 
            // InternalKinematics.g:1739:2: ( rule__Inertial__MassAssignment_4_1 )
            // InternalKinematics.g:1739:3: rule__Inertial__MassAssignment_4_1
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
    // InternalKinematics.g:1748:1: rule__Inertial__Group_5__0 : rule__Inertial__Group_5__0__Impl rule__Inertial__Group_5__1 ;
    public final void rule__Inertial__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1752:1: ( rule__Inertial__Group_5__0__Impl rule__Inertial__Group_5__1 )
            // InternalKinematics.g:1753:2: rule__Inertial__Group_5__0__Impl rule__Inertial__Group_5__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalKinematics.g:1760:1: rule__Inertial__Group_5__0__Impl : ( 'inertia' ) ;
    public final void rule__Inertial__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1764:1: ( ( 'inertia' ) )
            // InternalKinematics.g:1765:1: ( 'inertia' )
            {
            // InternalKinematics.g:1765:1: ( 'inertia' )
            // InternalKinematics.g:1766:2: 'inertia'
            {
             before(grammarAccess.getInertialAccess().getInertiaKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalKinematics.g:1775:1: rule__Inertial__Group_5__1 : rule__Inertial__Group_5__1__Impl ;
    public final void rule__Inertial__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1779:1: ( rule__Inertial__Group_5__1__Impl )
            // InternalKinematics.g:1780:2: rule__Inertial__Group_5__1__Impl
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
    // InternalKinematics.g:1786:1: rule__Inertial__Group_5__1__Impl : ( ( rule__Inertial__InertiaAssignment_5_1 ) ) ;
    public final void rule__Inertial__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1790:1: ( ( ( rule__Inertial__InertiaAssignment_5_1 ) ) )
            // InternalKinematics.g:1791:1: ( ( rule__Inertial__InertiaAssignment_5_1 ) )
            {
            // InternalKinematics.g:1791:1: ( ( rule__Inertial__InertiaAssignment_5_1 ) )
            // InternalKinematics.g:1792:2: ( rule__Inertial__InertiaAssignment_5_1 )
            {
             before(grammarAccess.getInertialAccess().getInertiaAssignment_5_1()); 
            // InternalKinematics.g:1793:2: ( rule__Inertial__InertiaAssignment_5_1 )
            // InternalKinematics.g:1793:3: rule__Inertial__InertiaAssignment_5_1
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
    // InternalKinematics.g:1802:1: rule__Visual__Group__0 : rule__Visual__Group__0__Impl rule__Visual__Group__1 ;
    public final void rule__Visual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1806:1: ( rule__Visual__Group__0__Impl rule__Visual__Group__1 )
            // InternalKinematics.g:1807:2: rule__Visual__Group__0__Impl rule__Visual__Group__1
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
    // InternalKinematics.g:1814:1: rule__Visual__Group__0__Impl : ( 'Visual' ) ;
    public final void rule__Visual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1818:1: ( ( 'Visual' ) )
            // InternalKinematics.g:1819:1: ( 'Visual' )
            {
            // InternalKinematics.g:1819:1: ( 'Visual' )
            // InternalKinematics.g:1820:2: 'Visual'
            {
             before(grammarAccess.getVisualAccess().getVisualKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalKinematics.g:1829:1: rule__Visual__Group__1 : rule__Visual__Group__1__Impl rule__Visual__Group__2 ;
    public final void rule__Visual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1833:1: ( rule__Visual__Group__1__Impl rule__Visual__Group__2 )
            // InternalKinematics.g:1834:2: rule__Visual__Group__1__Impl rule__Visual__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalKinematics.g:1841:1: rule__Visual__Group__1__Impl : ( '{' ) ;
    public final void rule__Visual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1845:1: ( ( '{' ) )
            // InternalKinematics.g:1846:1: ( '{' )
            {
            // InternalKinematics.g:1846:1: ( '{' )
            // InternalKinematics.g:1847:2: '{'
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
    // InternalKinematics.g:1856:1: rule__Visual__Group__2 : rule__Visual__Group__2__Impl rule__Visual__Group__3 ;
    public final void rule__Visual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1860:1: ( rule__Visual__Group__2__Impl rule__Visual__Group__3 )
            // InternalKinematics.g:1861:2: rule__Visual__Group__2__Impl rule__Visual__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalKinematics.g:1868:1: rule__Visual__Group__2__Impl : ( ( rule__Visual__Group_2__0 )? ) ;
    public final void rule__Visual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1872:1: ( ( ( rule__Visual__Group_2__0 )? ) )
            // InternalKinematics.g:1873:1: ( ( rule__Visual__Group_2__0 )? )
            {
            // InternalKinematics.g:1873:1: ( ( rule__Visual__Group_2__0 )? )
            // InternalKinematics.g:1874:2: ( rule__Visual__Group_2__0 )?
            {
             before(grammarAccess.getVisualAccess().getGroup_2()); 
            // InternalKinematics.g:1875:2: ( rule__Visual__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKinematics.g:1875:3: rule__Visual__Group_2__0
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
    // InternalKinematics.g:1883:1: rule__Visual__Group__3 : rule__Visual__Group__3__Impl rule__Visual__Group__4 ;
    public final void rule__Visual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1887:1: ( rule__Visual__Group__3__Impl rule__Visual__Group__4 )
            // InternalKinematics.g:1888:2: rule__Visual__Group__3__Impl rule__Visual__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalKinematics.g:1895:1: rule__Visual__Group__3__Impl : ( 'geometry' ) ;
    public final void rule__Visual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1899:1: ( ( 'geometry' ) )
            // InternalKinematics.g:1900:1: ( 'geometry' )
            {
            // InternalKinematics.g:1900:1: ( 'geometry' )
            // InternalKinematics.g:1901:2: 'geometry'
            {
             before(grammarAccess.getVisualAccess().getGeometryKeyword_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalKinematics.g:1910:1: rule__Visual__Group__4 : rule__Visual__Group__4__Impl rule__Visual__Group__5 ;
    public final void rule__Visual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1914:1: ( rule__Visual__Group__4__Impl rule__Visual__Group__5 )
            // InternalKinematics.g:1915:2: rule__Visual__Group__4__Impl rule__Visual__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalKinematics.g:1922:1: rule__Visual__Group__4__Impl : ( ( rule__Visual__GeometryAssignment_4 ) ) ;
    public final void rule__Visual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1926:1: ( ( ( rule__Visual__GeometryAssignment_4 ) ) )
            // InternalKinematics.g:1927:1: ( ( rule__Visual__GeometryAssignment_4 ) )
            {
            // InternalKinematics.g:1927:1: ( ( rule__Visual__GeometryAssignment_4 ) )
            // InternalKinematics.g:1928:2: ( rule__Visual__GeometryAssignment_4 )
            {
             before(grammarAccess.getVisualAccess().getGeometryAssignment_4()); 
            // InternalKinematics.g:1929:2: ( rule__Visual__GeometryAssignment_4 )
            // InternalKinematics.g:1929:3: rule__Visual__GeometryAssignment_4
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
    // InternalKinematics.g:1937:1: rule__Visual__Group__5 : rule__Visual__Group__5__Impl ;
    public final void rule__Visual__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1941:1: ( rule__Visual__Group__5__Impl )
            // InternalKinematics.g:1942:2: rule__Visual__Group__5__Impl
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
    // InternalKinematics.g:1948:1: rule__Visual__Group__5__Impl : ( '}' ) ;
    public final void rule__Visual__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1952:1: ( ( '}' ) )
            // InternalKinematics.g:1953:1: ( '}' )
            {
            // InternalKinematics.g:1953:1: ( '}' )
            // InternalKinematics.g:1954:2: '}'
            {
             before(grammarAccess.getVisualAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
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
    // InternalKinematics.g:1964:1: rule__Visual__Group_2__0 : rule__Visual__Group_2__0__Impl rule__Visual__Group_2__1 ;
    public final void rule__Visual__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1968:1: ( rule__Visual__Group_2__0__Impl rule__Visual__Group_2__1 )
            // InternalKinematics.g:1969:2: rule__Visual__Group_2__0__Impl rule__Visual__Group_2__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalKinematics.g:1976:1: rule__Visual__Group_2__0__Impl : ( 'origin' ) ;
    public final void rule__Visual__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1980:1: ( ( 'origin' ) )
            // InternalKinematics.g:1981:1: ( 'origin' )
            {
            // InternalKinematics.g:1981:1: ( 'origin' )
            // InternalKinematics.g:1982:2: 'origin'
            {
             before(grammarAccess.getVisualAccess().getOriginKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalKinematics.g:1991:1: rule__Visual__Group_2__1 : rule__Visual__Group_2__1__Impl ;
    public final void rule__Visual__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1995:1: ( rule__Visual__Group_2__1__Impl )
            // InternalKinematics.g:1996:2: rule__Visual__Group_2__1__Impl
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
    // InternalKinematics.g:2002:1: rule__Visual__Group_2__1__Impl : ( ( rule__Visual__OriginAssignment_2_1 ) ) ;
    public final void rule__Visual__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2006:1: ( ( ( rule__Visual__OriginAssignment_2_1 ) ) )
            // InternalKinematics.g:2007:1: ( ( rule__Visual__OriginAssignment_2_1 ) )
            {
            // InternalKinematics.g:2007:1: ( ( rule__Visual__OriginAssignment_2_1 ) )
            // InternalKinematics.g:2008:2: ( rule__Visual__OriginAssignment_2_1 )
            {
             before(grammarAccess.getVisualAccess().getOriginAssignment_2_1()); 
            // InternalKinematics.g:2009:2: ( rule__Visual__OriginAssignment_2_1 )
            // InternalKinematics.g:2009:3: rule__Visual__OriginAssignment_2_1
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
    // InternalKinematics.g:2018:1: rule__Collision__Group__0 : rule__Collision__Group__0__Impl rule__Collision__Group__1 ;
    public final void rule__Collision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2022:1: ( rule__Collision__Group__0__Impl rule__Collision__Group__1 )
            // InternalKinematics.g:2023:2: rule__Collision__Group__0__Impl rule__Collision__Group__1
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
    // InternalKinematics.g:2030:1: rule__Collision__Group__0__Impl : ( 'Collision' ) ;
    public final void rule__Collision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2034:1: ( ( 'Collision' ) )
            // InternalKinematics.g:2035:1: ( 'Collision' )
            {
            // InternalKinematics.g:2035:1: ( 'Collision' )
            // InternalKinematics.g:2036:2: 'Collision'
            {
             before(grammarAccess.getCollisionAccess().getCollisionKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalKinematics.g:2045:1: rule__Collision__Group__1 : rule__Collision__Group__1__Impl rule__Collision__Group__2 ;
    public final void rule__Collision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2049:1: ( rule__Collision__Group__1__Impl rule__Collision__Group__2 )
            // InternalKinematics.g:2050:2: rule__Collision__Group__1__Impl rule__Collision__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalKinematics.g:2057:1: rule__Collision__Group__1__Impl : ( '{' ) ;
    public final void rule__Collision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2061:1: ( ( '{' ) )
            // InternalKinematics.g:2062:1: ( '{' )
            {
            // InternalKinematics.g:2062:1: ( '{' )
            // InternalKinematics.g:2063:2: '{'
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
    // InternalKinematics.g:2072:1: rule__Collision__Group__2 : rule__Collision__Group__2__Impl rule__Collision__Group__3 ;
    public final void rule__Collision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2076:1: ( rule__Collision__Group__2__Impl rule__Collision__Group__3 )
            // InternalKinematics.g:2077:2: rule__Collision__Group__2__Impl rule__Collision__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalKinematics.g:2084:1: rule__Collision__Group__2__Impl : ( ( rule__Collision__Group_2__0 )? ) ;
    public final void rule__Collision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2088:1: ( ( ( rule__Collision__Group_2__0 )? ) )
            // InternalKinematics.g:2089:1: ( ( rule__Collision__Group_2__0 )? )
            {
            // InternalKinematics.g:2089:1: ( ( rule__Collision__Group_2__0 )? )
            // InternalKinematics.g:2090:2: ( rule__Collision__Group_2__0 )?
            {
             before(grammarAccess.getCollisionAccess().getGroup_2()); 
            // InternalKinematics.g:2091:2: ( rule__Collision__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKinematics.g:2091:3: rule__Collision__Group_2__0
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
    // InternalKinematics.g:2099:1: rule__Collision__Group__3 : rule__Collision__Group__3__Impl rule__Collision__Group__4 ;
    public final void rule__Collision__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2103:1: ( rule__Collision__Group__3__Impl rule__Collision__Group__4 )
            // InternalKinematics.g:2104:2: rule__Collision__Group__3__Impl rule__Collision__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalKinematics.g:2111:1: rule__Collision__Group__3__Impl : ( 'geometry' ) ;
    public final void rule__Collision__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2115:1: ( ( 'geometry' ) )
            // InternalKinematics.g:2116:1: ( 'geometry' )
            {
            // InternalKinematics.g:2116:1: ( 'geometry' )
            // InternalKinematics.g:2117:2: 'geometry'
            {
             before(grammarAccess.getCollisionAccess().getGeometryKeyword_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalKinematics.g:2126:1: rule__Collision__Group__4 : rule__Collision__Group__4__Impl rule__Collision__Group__5 ;
    public final void rule__Collision__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2130:1: ( rule__Collision__Group__4__Impl rule__Collision__Group__5 )
            // InternalKinematics.g:2131:2: rule__Collision__Group__4__Impl rule__Collision__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalKinematics.g:2138:1: rule__Collision__Group__4__Impl : ( ( rule__Collision__GeometryAssignment_4 ) ) ;
    public final void rule__Collision__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2142:1: ( ( ( rule__Collision__GeometryAssignment_4 ) ) )
            // InternalKinematics.g:2143:1: ( ( rule__Collision__GeometryAssignment_4 ) )
            {
            // InternalKinematics.g:2143:1: ( ( rule__Collision__GeometryAssignment_4 ) )
            // InternalKinematics.g:2144:2: ( rule__Collision__GeometryAssignment_4 )
            {
             before(grammarAccess.getCollisionAccess().getGeometryAssignment_4()); 
            // InternalKinematics.g:2145:2: ( rule__Collision__GeometryAssignment_4 )
            // InternalKinematics.g:2145:3: rule__Collision__GeometryAssignment_4
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
    // InternalKinematics.g:2153:1: rule__Collision__Group__5 : rule__Collision__Group__5__Impl ;
    public final void rule__Collision__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2157:1: ( rule__Collision__Group__5__Impl )
            // InternalKinematics.g:2158:2: rule__Collision__Group__5__Impl
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
    // InternalKinematics.g:2164:1: rule__Collision__Group__5__Impl : ( '}' ) ;
    public final void rule__Collision__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2168:1: ( ( '}' ) )
            // InternalKinematics.g:2169:1: ( '}' )
            {
            // InternalKinematics.g:2169:1: ( '}' )
            // InternalKinematics.g:2170:2: '}'
            {
             before(grammarAccess.getCollisionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
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
    // InternalKinematics.g:2180:1: rule__Collision__Group_2__0 : rule__Collision__Group_2__0__Impl rule__Collision__Group_2__1 ;
    public final void rule__Collision__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2184:1: ( rule__Collision__Group_2__0__Impl rule__Collision__Group_2__1 )
            // InternalKinematics.g:2185:2: rule__Collision__Group_2__0__Impl rule__Collision__Group_2__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalKinematics.g:2192:1: rule__Collision__Group_2__0__Impl : ( 'origin' ) ;
    public final void rule__Collision__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2196:1: ( ( 'origin' ) )
            // InternalKinematics.g:2197:1: ( 'origin' )
            {
            // InternalKinematics.g:2197:1: ( 'origin' )
            // InternalKinematics.g:2198:2: 'origin'
            {
             before(grammarAccess.getCollisionAccess().getOriginKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalKinematics.g:2207:1: rule__Collision__Group_2__1 : rule__Collision__Group_2__1__Impl ;
    public final void rule__Collision__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2211:1: ( rule__Collision__Group_2__1__Impl )
            // InternalKinematics.g:2212:2: rule__Collision__Group_2__1__Impl
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
    // InternalKinematics.g:2218:1: rule__Collision__Group_2__1__Impl : ( ( rule__Collision__OriginAssignment_2_1 ) ) ;
    public final void rule__Collision__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2222:1: ( ( ( rule__Collision__OriginAssignment_2_1 ) ) )
            // InternalKinematics.g:2223:1: ( ( rule__Collision__OriginAssignment_2_1 ) )
            {
            // InternalKinematics.g:2223:1: ( ( rule__Collision__OriginAssignment_2_1 ) )
            // InternalKinematics.g:2224:2: ( rule__Collision__OriginAssignment_2_1 )
            {
             before(grammarAccess.getCollisionAccess().getOriginAssignment_2_1()); 
            // InternalKinematics.g:2225:2: ( rule__Collision__OriginAssignment_2_1 )
            // InternalKinematics.g:2225:3: rule__Collision__OriginAssignment_2_1
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
    // InternalKinematics.g:2234:1: rule__Mass__Group__0 : rule__Mass__Group__0__Impl rule__Mass__Group__1 ;
    public final void rule__Mass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2238:1: ( rule__Mass__Group__0__Impl rule__Mass__Group__1 )
            // InternalKinematics.g:2239:2: rule__Mass__Group__0__Impl rule__Mass__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalKinematics.g:2246:1: rule__Mass__Group__0__Impl : ( () ) ;
    public final void rule__Mass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2250:1: ( ( () ) )
            // InternalKinematics.g:2251:1: ( () )
            {
            // InternalKinematics.g:2251:1: ( () )
            // InternalKinematics.g:2252:2: ()
            {
             before(grammarAccess.getMassAccess().getMassAction_0()); 
            // InternalKinematics.g:2253:2: ()
            // InternalKinematics.g:2253:3: 
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
    // InternalKinematics.g:2261:1: rule__Mass__Group__1 : rule__Mass__Group__1__Impl rule__Mass__Group__2 ;
    public final void rule__Mass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2265:1: ( rule__Mass__Group__1__Impl rule__Mass__Group__2 )
            // InternalKinematics.g:2266:2: rule__Mass__Group__1__Impl rule__Mass__Group__2
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
    // InternalKinematics.g:2273:1: rule__Mass__Group__1__Impl : ( 'Mass' ) ;
    public final void rule__Mass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2277:1: ( ( 'Mass' ) )
            // InternalKinematics.g:2278:1: ( 'Mass' )
            {
            // InternalKinematics.g:2278:1: ( 'Mass' )
            // InternalKinematics.g:2279:2: 'Mass'
            {
             before(grammarAccess.getMassAccess().getMassKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalKinematics.g:2288:1: rule__Mass__Group__2 : rule__Mass__Group__2__Impl rule__Mass__Group__3 ;
    public final void rule__Mass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2292:1: ( rule__Mass__Group__2__Impl rule__Mass__Group__3 )
            // InternalKinematics.g:2293:2: rule__Mass__Group__2__Impl rule__Mass__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalKinematics.g:2300:1: rule__Mass__Group__2__Impl : ( '{' ) ;
    public final void rule__Mass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2304:1: ( ( '{' ) )
            // InternalKinematics.g:2305:1: ( '{' )
            {
            // InternalKinematics.g:2305:1: ( '{' )
            // InternalKinematics.g:2306:2: '{'
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
    // InternalKinematics.g:2315:1: rule__Mass__Group__3 : rule__Mass__Group__3__Impl rule__Mass__Group__4 ;
    public final void rule__Mass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2319:1: ( rule__Mass__Group__3__Impl rule__Mass__Group__4 )
            // InternalKinematics.g:2320:2: rule__Mass__Group__3__Impl rule__Mass__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalKinematics.g:2327:1: rule__Mass__Group__3__Impl : ( ( rule__Mass__Group_3__0 )? ) ;
    public final void rule__Mass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2331:1: ( ( ( rule__Mass__Group_3__0 )? ) )
            // InternalKinematics.g:2332:1: ( ( rule__Mass__Group_3__0 )? )
            {
            // InternalKinematics.g:2332:1: ( ( rule__Mass__Group_3__0 )? )
            // InternalKinematics.g:2333:2: ( rule__Mass__Group_3__0 )?
            {
             before(grammarAccess.getMassAccess().getGroup_3()); 
            // InternalKinematics.g:2334:2: ( rule__Mass__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalKinematics.g:2334:3: rule__Mass__Group_3__0
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
    // InternalKinematics.g:2342:1: rule__Mass__Group__4 : rule__Mass__Group__4__Impl ;
    public final void rule__Mass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2346:1: ( rule__Mass__Group__4__Impl )
            // InternalKinematics.g:2347:2: rule__Mass__Group__4__Impl
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
    // InternalKinematics.g:2353:1: rule__Mass__Group__4__Impl : ( '}' ) ;
    public final void rule__Mass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2357:1: ( ( '}' ) )
            // InternalKinematics.g:2358:1: ( '}' )
            {
            // InternalKinematics.g:2358:1: ( '}' )
            // InternalKinematics.g:2359:2: '}'
            {
             before(grammarAccess.getMassAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalKinematics.g:2369:1: rule__Mass__Group_3__0 : rule__Mass__Group_3__0__Impl rule__Mass__Group_3__1 ;
    public final void rule__Mass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2373:1: ( rule__Mass__Group_3__0__Impl rule__Mass__Group_3__1 )
            // InternalKinematics.g:2374:2: rule__Mass__Group_3__0__Impl rule__Mass__Group_3__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalKinematics.g:2381:1: rule__Mass__Group_3__0__Impl : ( 'value' ) ;
    public final void rule__Mass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2385:1: ( ( 'value' ) )
            // InternalKinematics.g:2386:1: ( 'value' )
            {
            // InternalKinematics.g:2386:1: ( 'value' )
            // InternalKinematics.g:2387:2: 'value'
            {
             before(grammarAccess.getMassAccess().getValueKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalKinematics.g:2396:1: rule__Mass__Group_3__1 : rule__Mass__Group_3__1__Impl ;
    public final void rule__Mass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2400:1: ( rule__Mass__Group_3__1__Impl )
            // InternalKinematics.g:2401:2: rule__Mass__Group_3__1__Impl
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
    // InternalKinematics.g:2407:1: rule__Mass__Group_3__1__Impl : ( ( rule__Mass__ValueAssignment_3_1 ) ) ;
    public final void rule__Mass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2411:1: ( ( ( rule__Mass__ValueAssignment_3_1 ) ) )
            // InternalKinematics.g:2412:1: ( ( rule__Mass__ValueAssignment_3_1 ) )
            {
            // InternalKinematics.g:2412:1: ( ( rule__Mass__ValueAssignment_3_1 ) )
            // InternalKinematics.g:2413:2: ( rule__Mass__ValueAssignment_3_1 )
            {
             before(grammarAccess.getMassAccess().getValueAssignment_3_1()); 
            // InternalKinematics.g:2414:2: ( rule__Mass__ValueAssignment_3_1 )
            // InternalKinematics.g:2414:3: rule__Mass__ValueAssignment_3_1
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
    // InternalKinematics.g:2423:1: rule__Inertia__Group__0 : rule__Inertia__Group__0__Impl rule__Inertia__Group__1 ;
    public final void rule__Inertia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2427:1: ( rule__Inertia__Group__0__Impl rule__Inertia__Group__1 )
            // InternalKinematics.g:2428:2: rule__Inertia__Group__0__Impl rule__Inertia__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalKinematics.g:2435:1: rule__Inertia__Group__0__Impl : ( () ) ;
    public final void rule__Inertia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2439:1: ( ( () ) )
            // InternalKinematics.g:2440:1: ( () )
            {
            // InternalKinematics.g:2440:1: ( () )
            // InternalKinematics.g:2441:2: ()
            {
             before(grammarAccess.getInertiaAccess().getInertiaAction_0()); 
            // InternalKinematics.g:2442:2: ()
            // InternalKinematics.g:2442:3: 
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
    // InternalKinematics.g:2450:1: rule__Inertia__Group__1 : rule__Inertia__Group__1__Impl rule__Inertia__Group__2 ;
    public final void rule__Inertia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2454:1: ( rule__Inertia__Group__1__Impl rule__Inertia__Group__2 )
            // InternalKinematics.g:2455:2: rule__Inertia__Group__1__Impl rule__Inertia__Group__2
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
    // InternalKinematics.g:2462:1: rule__Inertia__Group__1__Impl : ( 'Inertia' ) ;
    public final void rule__Inertia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2466:1: ( ( 'Inertia' ) )
            // InternalKinematics.g:2467:1: ( 'Inertia' )
            {
            // InternalKinematics.g:2467:1: ( 'Inertia' )
            // InternalKinematics.g:2468:2: 'Inertia'
            {
             before(grammarAccess.getInertiaAccess().getInertiaKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalKinematics.g:2477:1: rule__Inertia__Group__2 : rule__Inertia__Group__2__Impl rule__Inertia__Group__3 ;
    public final void rule__Inertia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2481:1: ( rule__Inertia__Group__2__Impl rule__Inertia__Group__3 )
            // InternalKinematics.g:2482:2: rule__Inertia__Group__2__Impl rule__Inertia__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalKinematics.g:2489:1: rule__Inertia__Group__2__Impl : ( '{' ) ;
    public final void rule__Inertia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2493:1: ( ( '{' ) )
            // InternalKinematics.g:2494:1: ( '{' )
            {
            // InternalKinematics.g:2494:1: ( '{' )
            // InternalKinematics.g:2495:2: '{'
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
    // InternalKinematics.g:2504:1: rule__Inertia__Group__3 : rule__Inertia__Group__3__Impl rule__Inertia__Group__4 ;
    public final void rule__Inertia__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2508:1: ( rule__Inertia__Group__3__Impl rule__Inertia__Group__4 )
            // InternalKinematics.g:2509:2: rule__Inertia__Group__3__Impl rule__Inertia__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalKinematics.g:2516:1: rule__Inertia__Group__3__Impl : ( ( rule__Inertia__Group_3__0 )? ) ;
    public final void rule__Inertia__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2520:1: ( ( ( rule__Inertia__Group_3__0 )? ) )
            // InternalKinematics.g:2521:1: ( ( rule__Inertia__Group_3__0 )? )
            {
            // InternalKinematics.g:2521:1: ( ( rule__Inertia__Group_3__0 )? )
            // InternalKinematics.g:2522:2: ( rule__Inertia__Group_3__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_3()); 
            // InternalKinematics.g:2523:2: ( rule__Inertia__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalKinematics.g:2523:3: rule__Inertia__Group_3__0
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
    // InternalKinematics.g:2531:1: rule__Inertia__Group__4 : rule__Inertia__Group__4__Impl rule__Inertia__Group__5 ;
    public final void rule__Inertia__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2535:1: ( rule__Inertia__Group__4__Impl rule__Inertia__Group__5 )
            // InternalKinematics.g:2536:2: rule__Inertia__Group__4__Impl rule__Inertia__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalKinematics.g:2543:1: rule__Inertia__Group__4__Impl : ( ( rule__Inertia__Group_4__0 )? ) ;
    public final void rule__Inertia__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2547:1: ( ( ( rule__Inertia__Group_4__0 )? ) )
            // InternalKinematics.g:2548:1: ( ( rule__Inertia__Group_4__0 )? )
            {
            // InternalKinematics.g:2548:1: ( ( rule__Inertia__Group_4__0 )? )
            // InternalKinematics.g:2549:2: ( rule__Inertia__Group_4__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_4()); 
            // InternalKinematics.g:2550:2: ( rule__Inertia__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalKinematics.g:2550:3: rule__Inertia__Group_4__0
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
    // InternalKinematics.g:2558:1: rule__Inertia__Group__5 : rule__Inertia__Group__5__Impl rule__Inertia__Group__6 ;
    public final void rule__Inertia__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2562:1: ( rule__Inertia__Group__5__Impl rule__Inertia__Group__6 )
            // InternalKinematics.g:2563:2: rule__Inertia__Group__5__Impl rule__Inertia__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalKinematics.g:2570:1: rule__Inertia__Group__5__Impl : ( ( rule__Inertia__Group_5__0 )? ) ;
    public final void rule__Inertia__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2574:1: ( ( ( rule__Inertia__Group_5__0 )? ) )
            // InternalKinematics.g:2575:1: ( ( rule__Inertia__Group_5__0 )? )
            {
            // InternalKinematics.g:2575:1: ( ( rule__Inertia__Group_5__0 )? )
            // InternalKinematics.g:2576:2: ( rule__Inertia__Group_5__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_5()); 
            // InternalKinematics.g:2577:2: ( rule__Inertia__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==40) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalKinematics.g:2577:3: rule__Inertia__Group_5__0
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
    // InternalKinematics.g:2585:1: rule__Inertia__Group__6 : rule__Inertia__Group__6__Impl rule__Inertia__Group__7 ;
    public final void rule__Inertia__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2589:1: ( rule__Inertia__Group__6__Impl rule__Inertia__Group__7 )
            // InternalKinematics.g:2590:2: rule__Inertia__Group__6__Impl rule__Inertia__Group__7
            {
            pushFollow(FOLLOW_21);
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
    // InternalKinematics.g:2597:1: rule__Inertia__Group__6__Impl : ( ( rule__Inertia__Group_6__0 )? ) ;
    public final void rule__Inertia__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2601:1: ( ( ( rule__Inertia__Group_6__0 )? ) )
            // InternalKinematics.g:2602:1: ( ( rule__Inertia__Group_6__0 )? )
            {
            // InternalKinematics.g:2602:1: ( ( rule__Inertia__Group_6__0 )? )
            // InternalKinematics.g:2603:2: ( rule__Inertia__Group_6__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_6()); 
            // InternalKinematics.g:2604:2: ( rule__Inertia__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==41) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalKinematics.g:2604:3: rule__Inertia__Group_6__0
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
    // InternalKinematics.g:2612:1: rule__Inertia__Group__7 : rule__Inertia__Group__7__Impl rule__Inertia__Group__8 ;
    public final void rule__Inertia__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2616:1: ( rule__Inertia__Group__7__Impl rule__Inertia__Group__8 )
            // InternalKinematics.g:2617:2: rule__Inertia__Group__7__Impl rule__Inertia__Group__8
            {
            pushFollow(FOLLOW_21);
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
    // InternalKinematics.g:2624:1: rule__Inertia__Group__7__Impl : ( ( rule__Inertia__Group_7__0 )? ) ;
    public final void rule__Inertia__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2628:1: ( ( ( rule__Inertia__Group_7__0 )? ) )
            // InternalKinematics.g:2629:1: ( ( rule__Inertia__Group_7__0 )? )
            {
            // InternalKinematics.g:2629:1: ( ( rule__Inertia__Group_7__0 )? )
            // InternalKinematics.g:2630:2: ( rule__Inertia__Group_7__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_7()); 
            // InternalKinematics.g:2631:2: ( rule__Inertia__Group_7__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==42) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalKinematics.g:2631:3: rule__Inertia__Group_7__0
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
    // InternalKinematics.g:2639:1: rule__Inertia__Group__8 : rule__Inertia__Group__8__Impl rule__Inertia__Group__9 ;
    public final void rule__Inertia__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2643:1: ( rule__Inertia__Group__8__Impl rule__Inertia__Group__9 )
            // InternalKinematics.g:2644:2: rule__Inertia__Group__8__Impl rule__Inertia__Group__9
            {
            pushFollow(FOLLOW_21);
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
    // InternalKinematics.g:2651:1: rule__Inertia__Group__8__Impl : ( ( rule__Inertia__Group_8__0 )? ) ;
    public final void rule__Inertia__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2655:1: ( ( ( rule__Inertia__Group_8__0 )? ) )
            // InternalKinematics.g:2656:1: ( ( rule__Inertia__Group_8__0 )? )
            {
            // InternalKinematics.g:2656:1: ( ( rule__Inertia__Group_8__0 )? )
            // InternalKinematics.g:2657:2: ( rule__Inertia__Group_8__0 )?
            {
             before(grammarAccess.getInertiaAccess().getGroup_8()); 
            // InternalKinematics.g:2658:2: ( rule__Inertia__Group_8__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==43) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalKinematics.g:2658:3: rule__Inertia__Group_8__0
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
    // InternalKinematics.g:2666:1: rule__Inertia__Group__9 : rule__Inertia__Group__9__Impl ;
    public final void rule__Inertia__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2670:1: ( rule__Inertia__Group__9__Impl )
            // InternalKinematics.g:2671:2: rule__Inertia__Group__9__Impl
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
    // InternalKinematics.g:2677:1: rule__Inertia__Group__9__Impl : ( '}' ) ;
    public final void rule__Inertia__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2681:1: ( ( '}' ) )
            // InternalKinematics.g:2682:1: ( '}' )
            {
            // InternalKinematics.g:2682:1: ( '}' )
            // InternalKinematics.g:2683:2: '}'
            {
             before(grammarAccess.getInertiaAccess().getRightCurlyBracketKeyword_9()); 
            match(input,18,FOLLOW_2); 
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
    // InternalKinematics.g:2693:1: rule__Inertia__Group_3__0 : rule__Inertia__Group_3__0__Impl rule__Inertia__Group_3__1 ;
    public final void rule__Inertia__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2697:1: ( rule__Inertia__Group_3__0__Impl rule__Inertia__Group_3__1 )
            // InternalKinematics.g:2698:2: rule__Inertia__Group_3__0__Impl rule__Inertia__Group_3__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalKinematics.g:2705:1: rule__Inertia__Group_3__0__Impl : ( 'ixx' ) ;
    public final void rule__Inertia__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2709:1: ( ( 'ixx' ) )
            // InternalKinematics.g:2710:1: ( 'ixx' )
            {
            // InternalKinematics.g:2710:1: ( 'ixx' )
            // InternalKinematics.g:2711:2: 'ixx'
            {
             before(grammarAccess.getInertiaAccess().getIxxKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalKinematics.g:2720:1: rule__Inertia__Group_3__1 : rule__Inertia__Group_3__1__Impl ;
    public final void rule__Inertia__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2724:1: ( rule__Inertia__Group_3__1__Impl )
            // InternalKinematics.g:2725:2: rule__Inertia__Group_3__1__Impl
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
    // InternalKinematics.g:2731:1: rule__Inertia__Group_3__1__Impl : ( ( rule__Inertia__IxxAssignment_3_1 ) ) ;
    public final void rule__Inertia__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2735:1: ( ( ( rule__Inertia__IxxAssignment_3_1 ) ) )
            // InternalKinematics.g:2736:1: ( ( rule__Inertia__IxxAssignment_3_1 ) )
            {
            // InternalKinematics.g:2736:1: ( ( rule__Inertia__IxxAssignment_3_1 ) )
            // InternalKinematics.g:2737:2: ( rule__Inertia__IxxAssignment_3_1 )
            {
             before(grammarAccess.getInertiaAccess().getIxxAssignment_3_1()); 
            // InternalKinematics.g:2738:2: ( rule__Inertia__IxxAssignment_3_1 )
            // InternalKinematics.g:2738:3: rule__Inertia__IxxAssignment_3_1
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
    // InternalKinematics.g:2747:1: rule__Inertia__Group_4__0 : rule__Inertia__Group_4__0__Impl rule__Inertia__Group_4__1 ;
    public final void rule__Inertia__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2751:1: ( rule__Inertia__Group_4__0__Impl rule__Inertia__Group_4__1 )
            // InternalKinematics.g:2752:2: rule__Inertia__Group_4__0__Impl rule__Inertia__Group_4__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalKinematics.g:2759:1: rule__Inertia__Group_4__0__Impl : ( 'ixy' ) ;
    public final void rule__Inertia__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2763:1: ( ( 'ixy' ) )
            // InternalKinematics.g:2764:1: ( 'ixy' )
            {
            // InternalKinematics.g:2764:1: ( 'ixy' )
            // InternalKinematics.g:2765:2: 'ixy'
            {
             before(grammarAccess.getInertiaAccess().getIxyKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalKinematics.g:2774:1: rule__Inertia__Group_4__1 : rule__Inertia__Group_4__1__Impl ;
    public final void rule__Inertia__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2778:1: ( rule__Inertia__Group_4__1__Impl )
            // InternalKinematics.g:2779:2: rule__Inertia__Group_4__1__Impl
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
    // InternalKinematics.g:2785:1: rule__Inertia__Group_4__1__Impl : ( ( rule__Inertia__IxyAssignment_4_1 ) ) ;
    public final void rule__Inertia__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2789:1: ( ( ( rule__Inertia__IxyAssignment_4_1 ) ) )
            // InternalKinematics.g:2790:1: ( ( rule__Inertia__IxyAssignment_4_1 ) )
            {
            // InternalKinematics.g:2790:1: ( ( rule__Inertia__IxyAssignment_4_1 ) )
            // InternalKinematics.g:2791:2: ( rule__Inertia__IxyAssignment_4_1 )
            {
             before(grammarAccess.getInertiaAccess().getIxyAssignment_4_1()); 
            // InternalKinematics.g:2792:2: ( rule__Inertia__IxyAssignment_4_1 )
            // InternalKinematics.g:2792:3: rule__Inertia__IxyAssignment_4_1
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
    // InternalKinematics.g:2801:1: rule__Inertia__Group_5__0 : rule__Inertia__Group_5__0__Impl rule__Inertia__Group_5__1 ;
    public final void rule__Inertia__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2805:1: ( rule__Inertia__Group_5__0__Impl rule__Inertia__Group_5__1 )
            // InternalKinematics.g:2806:2: rule__Inertia__Group_5__0__Impl rule__Inertia__Group_5__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalKinematics.g:2813:1: rule__Inertia__Group_5__0__Impl : ( 'ixz' ) ;
    public final void rule__Inertia__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2817:1: ( ( 'ixz' ) )
            // InternalKinematics.g:2818:1: ( 'ixz' )
            {
            // InternalKinematics.g:2818:1: ( 'ixz' )
            // InternalKinematics.g:2819:2: 'ixz'
            {
             before(grammarAccess.getInertiaAccess().getIxzKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalKinematics.g:2828:1: rule__Inertia__Group_5__1 : rule__Inertia__Group_5__1__Impl ;
    public final void rule__Inertia__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2832:1: ( rule__Inertia__Group_5__1__Impl )
            // InternalKinematics.g:2833:2: rule__Inertia__Group_5__1__Impl
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
    // InternalKinematics.g:2839:1: rule__Inertia__Group_5__1__Impl : ( ( rule__Inertia__IxzAssignment_5_1 ) ) ;
    public final void rule__Inertia__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2843:1: ( ( ( rule__Inertia__IxzAssignment_5_1 ) ) )
            // InternalKinematics.g:2844:1: ( ( rule__Inertia__IxzAssignment_5_1 ) )
            {
            // InternalKinematics.g:2844:1: ( ( rule__Inertia__IxzAssignment_5_1 ) )
            // InternalKinematics.g:2845:2: ( rule__Inertia__IxzAssignment_5_1 )
            {
             before(grammarAccess.getInertiaAccess().getIxzAssignment_5_1()); 
            // InternalKinematics.g:2846:2: ( rule__Inertia__IxzAssignment_5_1 )
            // InternalKinematics.g:2846:3: rule__Inertia__IxzAssignment_5_1
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
    // InternalKinematics.g:2855:1: rule__Inertia__Group_6__0 : rule__Inertia__Group_6__0__Impl rule__Inertia__Group_6__1 ;
    public final void rule__Inertia__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2859:1: ( rule__Inertia__Group_6__0__Impl rule__Inertia__Group_6__1 )
            // InternalKinematics.g:2860:2: rule__Inertia__Group_6__0__Impl rule__Inertia__Group_6__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalKinematics.g:2867:1: rule__Inertia__Group_6__0__Impl : ( 'iyy' ) ;
    public final void rule__Inertia__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2871:1: ( ( 'iyy' ) )
            // InternalKinematics.g:2872:1: ( 'iyy' )
            {
            // InternalKinematics.g:2872:1: ( 'iyy' )
            // InternalKinematics.g:2873:2: 'iyy'
            {
             before(grammarAccess.getInertiaAccess().getIyyKeyword_6_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalKinematics.g:2882:1: rule__Inertia__Group_6__1 : rule__Inertia__Group_6__1__Impl ;
    public final void rule__Inertia__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2886:1: ( rule__Inertia__Group_6__1__Impl )
            // InternalKinematics.g:2887:2: rule__Inertia__Group_6__1__Impl
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
    // InternalKinematics.g:2893:1: rule__Inertia__Group_6__1__Impl : ( ( rule__Inertia__IyyAssignment_6_1 ) ) ;
    public final void rule__Inertia__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2897:1: ( ( ( rule__Inertia__IyyAssignment_6_1 ) ) )
            // InternalKinematics.g:2898:1: ( ( rule__Inertia__IyyAssignment_6_1 ) )
            {
            // InternalKinematics.g:2898:1: ( ( rule__Inertia__IyyAssignment_6_1 ) )
            // InternalKinematics.g:2899:2: ( rule__Inertia__IyyAssignment_6_1 )
            {
             before(grammarAccess.getInertiaAccess().getIyyAssignment_6_1()); 
            // InternalKinematics.g:2900:2: ( rule__Inertia__IyyAssignment_6_1 )
            // InternalKinematics.g:2900:3: rule__Inertia__IyyAssignment_6_1
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
    // InternalKinematics.g:2909:1: rule__Inertia__Group_7__0 : rule__Inertia__Group_7__0__Impl rule__Inertia__Group_7__1 ;
    public final void rule__Inertia__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2913:1: ( rule__Inertia__Group_7__0__Impl rule__Inertia__Group_7__1 )
            // InternalKinematics.g:2914:2: rule__Inertia__Group_7__0__Impl rule__Inertia__Group_7__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalKinematics.g:2921:1: rule__Inertia__Group_7__0__Impl : ( 'iyz' ) ;
    public final void rule__Inertia__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2925:1: ( ( 'iyz' ) )
            // InternalKinematics.g:2926:1: ( 'iyz' )
            {
            // InternalKinematics.g:2926:1: ( 'iyz' )
            // InternalKinematics.g:2927:2: 'iyz'
            {
             before(grammarAccess.getInertiaAccess().getIyzKeyword_7_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalKinematics.g:2936:1: rule__Inertia__Group_7__1 : rule__Inertia__Group_7__1__Impl ;
    public final void rule__Inertia__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2940:1: ( rule__Inertia__Group_7__1__Impl )
            // InternalKinematics.g:2941:2: rule__Inertia__Group_7__1__Impl
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
    // InternalKinematics.g:2947:1: rule__Inertia__Group_7__1__Impl : ( ( rule__Inertia__IyzAssignment_7_1 ) ) ;
    public final void rule__Inertia__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2951:1: ( ( ( rule__Inertia__IyzAssignment_7_1 ) ) )
            // InternalKinematics.g:2952:1: ( ( rule__Inertia__IyzAssignment_7_1 ) )
            {
            // InternalKinematics.g:2952:1: ( ( rule__Inertia__IyzAssignment_7_1 ) )
            // InternalKinematics.g:2953:2: ( rule__Inertia__IyzAssignment_7_1 )
            {
             before(grammarAccess.getInertiaAccess().getIyzAssignment_7_1()); 
            // InternalKinematics.g:2954:2: ( rule__Inertia__IyzAssignment_7_1 )
            // InternalKinematics.g:2954:3: rule__Inertia__IyzAssignment_7_1
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
    // InternalKinematics.g:2963:1: rule__Inertia__Group_8__0 : rule__Inertia__Group_8__0__Impl rule__Inertia__Group_8__1 ;
    public final void rule__Inertia__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2967:1: ( rule__Inertia__Group_8__0__Impl rule__Inertia__Group_8__1 )
            // InternalKinematics.g:2968:2: rule__Inertia__Group_8__0__Impl rule__Inertia__Group_8__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalKinematics.g:2975:1: rule__Inertia__Group_8__0__Impl : ( 'izz' ) ;
    public final void rule__Inertia__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2979:1: ( ( 'izz' ) )
            // InternalKinematics.g:2980:1: ( 'izz' )
            {
            // InternalKinematics.g:2980:1: ( 'izz' )
            // InternalKinematics.g:2981:2: 'izz'
            {
             before(grammarAccess.getInertiaAccess().getIzzKeyword_8_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalKinematics.g:2990:1: rule__Inertia__Group_8__1 : rule__Inertia__Group_8__1__Impl ;
    public final void rule__Inertia__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2994:1: ( rule__Inertia__Group_8__1__Impl )
            // InternalKinematics.g:2995:2: rule__Inertia__Group_8__1__Impl
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
    // InternalKinematics.g:3001:1: rule__Inertia__Group_8__1__Impl : ( ( rule__Inertia__IzzAssignment_8_1 ) ) ;
    public final void rule__Inertia__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3005:1: ( ( ( rule__Inertia__IzzAssignment_8_1 ) ) )
            // InternalKinematics.g:3006:1: ( ( rule__Inertia__IzzAssignment_8_1 ) )
            {
            // InternalKinematics.g:3006:1: ( ( rule__Inertia__IzzAssignment_8_1 ) )
            // InternalKinematics.g:3007:2: ( rule__Inertia__IzzAssignment_8_1 )
            {
             before(grammarAccess.getInertiaAccess().getIzzAssignment_8_1()); 
            // InternalKinematics.g:3008:2: ( rule__Inertia__IzzAssignment_8_1 )
            // InternalKinematics.g:3008:3: rule__Inertia__IzzAssignment_8_1
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
    // InternalKinematics.g:3017:1: rule__Geometry__Group__0 : rule__Geometry__Group__0__Impl rule__Geometry__Group__1 ;
    public final void rule__Geometry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3021:1: ( rule__Geometry__Group__0__Impl rule__Geometry__Group__1 )
            // InternalKinematics.g:3022:2: rule__Geometry__Group__0__Impl rule__Geometry__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalKinematics.g:3029:1: rule__Geometry__Group__0__Impl : ( () ) ;
    public final void rule__Geometry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3033:1: ( ( () ) )
            // InternalKinematics.g:3034:1: ( () )
            {
            // InternalKinematics.g:3034:1: ( () )
            // InternalKinematics.g:3035:2: ()
            {
             before(grammarAccess.getGeometryAccess().getGeometryAction_0()); 
            // InternalKinematics.g:3036:2: ()
            // InternalKinematics.g:3036:3: 
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
    // InternalKinematics.g:3044:1: rule__Geometry__Group__1 : rule__Geometry__Group__1__Impl rule__Geometry__Group__2 ;
    public final void rule__Geometry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3048:1: ( rule__Geometry__Group__1__Impl rule__Geometry__Group__2 )
            // InternalKinematics.g:3049:2: rule__Geometry__Group__1__Impl rule__Geometry__Group__2
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
    // InternalKinematics.g:3056:1: rule__Geometry__Group__1__Impl : ( 'Geometry' ) ;
    public final void rule__Geometry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3060:1: ( ( 'Geometry' ) )
            // InternalKinematics.g:3061:1: ( 'Geometry' )
            {
            // InternalKinematics.g:3061:1: ( 'Geometry' )
            // InternalKinematics.g:3062:2: 'Geometry'
            {
             before(grammarAccess.getGeometryAccess().getGeometryKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalKinematics.g:3071:1: rule__Geometry__Group__2 : rule__Geometry__Group__2__Impl rule__Geometry__Group__3 ;
    public final void rule__Geometry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3075:1: ( rule__Geometry__Group__2__Impl rule__Geometry__Group__3 )
            // InternalKinematics.g:3076:2: rule__Geometry__Group__2__Impl rule__Geometry__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalKinematics.g:3083:1: rule__Geometry__Group__2__Impl : ( '{' ) ;
    public final void rule__Geometry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3087:1: ( ( '{' ) )
            // InternalKinematics.g:3088:1: ( '{' )
            {
            // InternalKinematics.g:3088:1: ( '{' )
            // InternalKinematics.g:3089:2: '{'
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
    // InternalKinematics.g:3098:1: rule__Geometry__Group__3 : rule__Geometry__Group__3__Impl rule__Geometry__Group__4 ;
    public final void rule__Geometry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3102:1: ( rule__Geometry__Group__3__Impl rule__Geometry__Group__4 )
            // InternalKinematics.g:3103:2: rule__Geometry__Group__3__Impl rule__Geometry__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalKinematics.g:3110:1: rule__Geometry__Group__3__Impl : ( ( rule__Geometry__Group_3__0 )? ) ;
    public final void rule__Geometry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3114:1: ( ( ( rule__Geometry__Group_3__0 )? ) )
            // InternalKinematics.g:3115:1: ( ( rule__Geometry__Group_3__0 )? )
            {
            // InternalKinematics.g:3115:1: ( ( rule__Geometry__Group_3__0 )? )
            // InternalKinematics.g:3116:2: ( rule__Geometry__Group_3__0 )?
            {
             before(grammarAccess.getGeometryAccess().getGroup_3()); 
            // InternalKinematics.g:3117:2: ( rule__Geometry__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==45) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalKinematics.g:3117:3: rule__Geometry__Group_3__0
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
    // InternalKinematics.g:3125:1: rule__Geometry__Group__4 : rule__Geometry__Group__4__Impl rule__Geometry__Group__5 ;
    public final void rule__Geometry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3129:1: ( rule__Geometry__Group__4__Impl rule__Geometry__Group__5 )
            // InternalKinematics.g:3130:2: rule__Geometry__Group__4__Impl rule__Geometry__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalKinematics.g:3137:1: rule__Geometry__Group__4__Impl : ( ( rule__Geometry__Group_4__0 )? ) ;
    public final void rule__Geometry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3141:1: ( ( ( rule__Geometry__Group_4__0 )? ) )
            // InternalKinematics.g:3142:1: ( ( rule__Geometry__Group_4__0 )? )
            {
            // InternalKinematics.g:3142:1: ( ( rule__Geometry__Group_4__0 )? )
            // InternalKinematics.g:3143:2: ( rule__Geometry__Group_4__0 )?
            {
             before(grammarAccess.getGeometryAccess().getGroup_4()); 
            // InternalKinematics.g:3144:2: ( rule__Geometry__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==46) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalKinematics.g:3144:3: rule__Geometry__Group_4__0
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
    // InternalKinematics.g:3152:1: rule__Geometry__Group__5 : rule__Geometry__Group__5__Impl rule__Geometry__Group__6 ;
    public final void rule__Geometry__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3156:1: ( rule__Geometry__Group__5__Impl rule__Geometry__Group__6 )
            // InternalKinematics.g:3157:2: rule__Geometry__Group__5__Impl rule__Geometry__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalKinematics.g:3164:1: rule__Geometry__Group__5__Impl : ( ( rule__Geometry__Group_5__0 )? ) ;
    public final void rule__Geometry__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3168:1: ( ( ( rule__Geometry__Group_5__0 )? ) )
            // InternalKinematics.g:3169:1: ( ( rule__Geometry__Group_5__0 )? )
            {
            // InternalKinematics.g:3169:1: ( ( rule__Geometry__Group_5__0 )? )
            // InternalKinematics.g:3170:2: ( rule__Geometry__Group_5__0 )?
            {
             before(grammarAccess.getGeometryAccess().getGroup_5()); 
            // InternalKinematics.g:3171:2: ( rule__Geometry__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==47) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalKinematics.g:3171:3: rule__Geometry__Group_5__0
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
    // InternalKinematics.g:3179:1: rule__Geometry__Group__6 : rule__Geometry__Group__6__Impl rule__Geometry__Group__7 ;
    public final void rule__Geometry__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3183:1: ( rule__Geometry__Group__6__Impl rule__Geometry__Group__7 )
            // InternalKinematics.g:3184:2: rule__Geometry__Group__6__Impl rule__Geometry__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalKinematics.g:3191:1: rule__Geometry__Group__6__Impl : ( ( rule__Geometry__Group_6__0 )? ) ;
    public final void rule__Geometry__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3195:1: ( ( ( rule__Geometry__Group_6__0 )? ) )
            // InternalKinematics.g:3196:1: ( ( rule__Geometry__Group_6__0 )? )
            {
            // InternalKinematics.g:3196:1: ( ( rule__Geometry__Group_6__0 )? )
            // InternalKinematics.g:3197:2: ( rule__Geometry__Group_6__0 )?
            {
             before(grammarAccess.getGeometryAccess().getGroup_6()); 
            // InternalKinematics.g:3198:2: ( rule__Geometry__Group_6__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==48) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalKinematics.g:3198:3: rule__Geometry__Group_6__0
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
    // InternalKinematics.g:3206:1: rule__Geometry__Group__7 : rule__Geometry__Group__7__Impl ;
    public final void rule__Geometry__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3210:1: ( rule__Geometry__Group__7__Impl )
            // InternalKinematics.g:3211:2: rule__Geometry__Group__7__Impl
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
    // InternalKinematics.g:3217:1: rule__Geometry__Group__7__Impl : ( '}' ) ;
    public final void rule__Geometry__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3221:1: ( ( '}' ) )
            // InternalKinematics.g:3222:1: ( '}' )
            {
            // InternalKinematics.g:3222:1: ( '}' )
            // InternalKinematics.g:3223:2: '}'
            {
             before(grammarAccess.getGeometryAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
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
    // InternalKinematics.g:3233:1: rule__Geometry__Group_3__0 : rule__Geometry__Group_3__0__Impl rule__Geometry__Group_3__1 ;
    public final void rule__Geometry__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3237:1: ( rule__Geometry__Group_3__0__Impl rule__Geometry__Group_3__1 )
            // InternalKinematics.g:3238:2: rule__Geometry__Group_3__0__Impl rule__Geometry__Group_3__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalKinematics.g:3245:1: rule__Geometry__Group_3__0__Impl : ( 'box' ) ;
    public final void rule__Geometry__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3249:1: ( ( 'box' ) )
            // InternalKinematics.g:3250:1: ( 'box' )
            {
            // InternalKinematics.g:3250:1: ( 'box' )
            // InternalKinematics.g:3251:2: 'box'
            {
             before(grammarAccess.getGeometryAccess().getBoxKeyword_3_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalKinematics.g:3260:1: rule__Geometry__Group_3__1 : rule__Geometry__Group_3__1__Impl ;
    public final void rule__Geometry__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3264:1: ( rule__Geometry__Group_3__1__Impl )
            // InternalKinematics.g:3265:2: rule__Geometry__Group_3__1__Impl
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
    // InternalKinematics.g:3271:1: rule__Geometry__Group_3__1__Impl : ( ( rule__Geometry__BoxAssignment_3_1 ) ) ;
    public final void rule__Geometry__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3275:1: ( ( ( rule__Geometry__BoxAssignment_3_1 ) ) )
            // InternalKinematics.g:3276:1: ( ( rule__Geometry__BoxAssignment_3_1 ) )
            {
            // InternalKinematics.g:3276:1: ( ( rule__Geometry__BoxAssignment_3_1 ) )
            // InternalKinematics.g:3277:2: ( rule__Geometry__BoxAssignment_3_1 )
            {
             before(grammarAccess.getGeometryAccess().getBoxAssignment_3_1()); 
            // InternalKinematics.g:3278:2: ( rule__Geometry__BoxAssignment_3_1 )
            // InternalKinematics.g:3278:3: rule__Geometry__BoxAssignment_3_1
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
    // InternalKinematics.g:3287:1: rule__Geometry__Group_4__0 : rule__Geometry__Group_4__0__Impl rule__Geometry__Group_4__1 ;
    public final void rule__Geometry__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3291:1: ( rule__Geometry__Group_4__0__Impl rule__Geometry__Group_4__1 )
            // InternalKinematics.g:3292:2: rule__Geometry__Group_4__0__Impl rule__Geometry__Group_4__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalKinematics.g:3299:1: rule__Geometry__Group_4__0__Impl : ( 'cylinder' ) ;
    public final void rule__Geometry__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3303:1: ( ( 'cylinder' ) )
            // InternalKinematics.g:3304:1: ( 'cylinder' )
            {
            // InternalKinematics.g:3304:1: ( 'cylinder' )
            // InternalKinematics.g:3305:2: 'cylinder'
            {
             before(grammarAccess.getGeometryAccess().getCylinderKeyword_4_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalKinematics.g:3314:1: rule__Geometry__Group_4__1 : rule__Geometry__Group_4__1__Impl ;
    public final void rule__Geometry__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3318:1: ( rule__Geometry__Group_4__1__Impl )
            // InternalKinematics.g:3319:2: rule__Geometry__Group_4__1__Impl
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
    // InternalKinematics.g:3325:1: rule__Geometry__Group_4__1__Impl : ( ( rule__Geometry__CylinderAssignment_4_1 ) ) ;
    public final void rule__Geometry__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3329:1: ( ( ( rule__Geometry__CylinderAssignment_4_1 ) ) )
            // InternalKinematics.g:3330:1: ( ( rule__Geometry__CylinderAssignment_4_1 ) )
            {
            // InternalKinematics.g:3330:1: ( ( rule__Geometry__CylinderAssignment_4_1 ) )
            // InternalKinematics.g:3331:2: ( rule__Geometry__CylinderAssignment_4_1 )
            {
             before(grammarAccess.getGeometryAccess().getCylinderAssignment_4_1()); 
            // InternalKinematics.g:3332:2: ( rule__Geometry__CylinderAssignment_4_1 )
            // InternalKinematics.g:3332:3: rule__Geometry__CylinderAssignment_4_1
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
    // InternalKinematics.g:3341:1: rule__Geometry__Group_5__0 : rule__Geometry__Group_5__0__Impl rule__Geometry__Group_5__1 ;
    public final void rule__Geometry__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3345:1: ( rule__Geometry__Group_5__0__Impl rule__Geometry__Group_5__1 )
            // InternalKinematics.g:3346:2: rule__Geometry__Group_5__0__Impl rule__Geometry__Group_5__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalKinematics.g:3353:1: rule__Geometry__Group_5__0__Impl : ( 'sphere' ) ;
    public final void rule__Geometry__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3357:1: ( ( 'sphere' ) )
            // InternalKinematics.g:3358:1: ( 'sphere' )
            {
            // InternalKinematics.g:3358:1: ( 'sphere' )
            // InternalKinematics.g:3359:2: 'sphere'
            {
             before(grammarAccess.getGeometryAccess().getSphereKeyword_5_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalKinematics.g:3368:1: rule__Geometry__Group_5__1 : rule__Geometry__Group_5__1__Impl ;
    public final void rule__Geometry__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3372:1: ( rule__Geometry__Group_5__1__Impl )
            // InternalKinematics.g:3373:2: rule__Geometry__Group_5__1__Impl
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
    // InternalKinematics.g:3379:1: rule__Geometry__Group_5__1__Impl : ( ( rule__Geometry__SphereAssignment_5_1 ) ) ;
    public final void rule__Geometry__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3383:1: ( ( ( rule__Geometry__SphereAssignment_5_1 ) ) )
            // InternalKinematics.g:3384:1: ( ( rule__Geometry__SphereAssignment_5_1 ) )
            {
            // InternalKinematics.g:3384:1: ( ( rule__Geometry__SphereAssignment_5_1 ) )
            // InternalKinematics.g:3385:2: ( rule__Geometry__SphereAssignment_5_1 )
            {
             before(grammarAccess.getGeometryAccess().getSphereAssignment_5_1()); 
            // InternalKinematics.g:3386:2: ( rule__Geometry__SphereAssignment_5_1 )
            // InternalKinematics.g:3386:3: rule__Geometry__SphereAssignment_5_1
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
    // InternalKinematics.g:3395:1: rule__Geometry__Group_6__0 : rule__Geometry__Group_6__0__Impl rule__Geometry__Group_6__1 ;
    public final void rule__Geometry__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3399:1: ( rule__Geometry__Group_6__0__Impl rule__Geometry__Group_6__1 )
            // InternalKinematics.g:3400:2: rule__Geometry__Group_6__0__Impl rule__Geometry__Group_6__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalKinematics.g:3407:1: rule__Geometry__Group_6__0__Impl : ( 'mesh' ) ;
    public final void rule__Geometry__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3411:1: ( ( 'mesh' ) )
            // InternalKinematics.g:3412:1: ( 'mesh' )
            {
            // InternalKinematics.g:3412:1: ( 'mesh' )
            // InternalKinematics.g:3413:2: 'mesh'
            {
             before(grammarAccess.getGeometryAccess().getMeshKeyword_6_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalKinematics.g:3422:1: rule__Geometry__Group_6__1 : rule__Geometry__Group_6__1__Impl ;
    public final void rule__Geometry__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3426:1: ( rule__Geometry__Group_6__1__Impl )
            // InternalKinematics.g:3427:2: rule__Geometry__Group_6__1__Impl
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
    // InternalKinematics.g:3433:1: rule__Geometry__Group_6__1__Impl : ( ( rule__Geometry__MeshAssignment_6_1 ) ) ;
    public final void rule__Geometry__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3437:1: ( ( ( rule__Geometry__MeshAssignment_6_1 ) ) )
            // InternalKinematics.g:3438:1: ( ( rule__Geometry__MeshAssignment_6_1 ) )
            {
            // InternalKinematics.g:3438:1: ( ( rule__Geometry__MeshAssignment_6_1 ) )
            // InternalKinematics.g:3439:2: ( rule__Geometry__MeshAssignment_6_1 )
            {
             before(grammarAccess.getGeometryAccess().getMeshAssignment_6_1()); 
            // InternalKinematics.g:3440:2: ( rule__Geometry__MeshAssignment_6_1 )
            // InternalKinematics.g:3440:3: rule__Geometry__MeshAssignment_6_1
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
    // InternalKinematics.g:3449:1: rule__Box__Group__0 : rule__Box__Group__0__Impl rule__Box__Group__1 ;
    public final void rule__Box__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3453:1: ( rule__Box__Group__0__Impl rule__Box__Group__1 )
            // InternalKinematics.g:3454:2: rule__Box__Group__0__Impl rule__Box__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalKinematics.g:3461:1: rule__Box__Group__0__Impl : ( () ) ;
    public final void rule__Box__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3465:1: ( ( () ) )
            // InternalKinematics.g:3466:1: ( () )
            {
            // InternalKinematics.g:3466:1: ( () )
            // InternalKinematics.g:3467:2: ()
            {
             before(grammarAccess.getBoxAccess().getBoxAction_0()); 
            // InternalKinematics.g:3468:2: ()
            // InternalKinematics.g:3468:3: 
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
    // InternalKinematics.g:3476:1: rule__Box__Group__1 : rule__Box__Group__1__Impl rule__Box__Group__2 ;
    public final void rule__Box__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3480:1: ( rule__Box__Group__1__Impl rule__Box__Group__2 )
            // InternalKinematics.g:3481:2: rule__Box__Group__1__Impl rule__Box__Group__2
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
    // InternalKinematics.g:3488:1: rule__Box__Group__1__Impl : ( 'Box' ) ;
    public final void rule__Box__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3492:1: ( ( 'Box' ) )
            // InternalKinematics.g:3493:1: ( 'Box' )
            {
            // InternalKinematics.g:3493:1: ( 'Box' )
            // InternalKinematics.g:3494:2: 'Box'
            {
             before(grammarAccess.getBoxAccess().getBoxKeyword_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalKinematics.g:3503:1: rule__Box__Group__2 : rule__Box__Group__2__Impl rule__Box__Group__3 ;
    public final void rule__Box__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3507:1: ( rule__Box__Group__2__Impl rule__Box__Group__3 )
            // InternalKinematics.g:3508:2: rule__Box__Group__2__Impl rule__Box__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalKinematics.g:3515:1: rule__Box__Group__2__Impl : ( '{' ) ;
    public final void rule__Box__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3519:1: ( ( '{' ) )
            // InternalKinematics.g:3520:1: ( '{' )
            {
            // InternalKinematics.g:3520:1: ( '{' )
            // InternalKinematics.g:3521:2: '{'
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
    // InternalKinematics.g:3530:1: rule__Box__Group__3 : rule__Box__Group__3__Impl rule__Box__Group__4 ;
    public final void rule__Box__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3534:1: ( rule__Box__Group__3__Impl rule__Box__Group__4 )
            // InternalKinematics.g:3535:2: rule__Box__Group__3__Impl rule__Box__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalKinematics.g:3542:1: rule__Box__Group__3__Impl : ( ( rule__Box__Group_3__0 )? ) ;
    public final void rule__Box__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3546:1: ( ( ( rule__Box__Group_3__0 )? ) )
            // InternalKinematics.g:3547:1: ( ( rule__Box__Group_3__0 )? )
            {
            // InternalKinematics.g:3547:1: ( ( rule__Box__Group_3__0 )? )
            // InternalKinematics.g:3548:2: ( rule__Box__Group_3__0 )?
            {
             before(grammarAccess.getBoxAccess().getGroup_3()); 
            // InternalKinematics.g:3549:2: ( rule__Box__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==50) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalKinematics.g:3549:3: rule__Box__Group_3__0
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
    // InternalKinematics.g:3557:1: rule__Box__Group__4 : rule__Box__Group__4__Impl ;
    public final void rule__Box__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3561:1: ( rule__Box__Group__4__Impl )
            // InternalKinematics.g:3562:2: rule__Box__Group__4__Impl
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
    // InternalKinematics.g:3568:1: rule__Box__Group__4__Impl : ( '}' ) ;
    public final void rule__Box__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3572:1: ( ( '}' ) )
            // InternalKinematics.g:3573:1: ( '}' )
            {
            // InternalKinematics.g:3573:1: ( '}' )
            // InternalKinematics.g:3574:2: '}'
            {
             before(grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalKinematics.g:3584:1: rule__Box__Group_3__0 : rule__Box__Group_3__0__Impl rule__Box__Group_3__1 ;
    public final void rule__Box__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3588:1: ( rule__Box__Group_3__0__Impl rule__Box__Group_3__1 )
            // InternalKinematics.g:3589:2: rule__Box__Group_3__0__Impl rule__Box__Group_3__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalKinematics.g:3596:1: rule__Box__Group_3__0__Impl : ( 'size' ) ;
    public final void rule__Box__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3600:1: ( ( 'size' ) )
            // InternalKinematics.g:3601:1: ( 'size' )
            {
            // InternalKinematics.g:3601:1: ( 'size' )
            // InternalKinematics.g:3602:2: 'size'
            {
             before(grammarAccess.getBoxAccess().getSizeKeyword_3_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalKinematics.g:3611:1: rule__Box__Group_3__1 : rule__Box__Group_3__1__Impl ;
    public final void rule__Box__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3615:1: ( rule__Box__Group_3__1__Impl )
            // InternalKinematics.g:3616:2: rule__Box__Group_3__1__Impl
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
    // InternalKinematics.g:3622:1: rule__Box__Group_3__1__Impl : ( ( rule__Box__SizeAssignment_3_1 ) ) ;
    public final void rule__Box__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3626:1: ( ( ( rule__Box__SizeAssignment_3_1 ) ) )
            // InternalKinematics.g:3627:1: ( ( rule__Box__SizeAssignment_3_1 ) )
            {
            // InternalKinematics.g:3627:1: ( ( rule__Box__SizeAssignment_3_1 ) )
            // InternalKinematics.g:3628:2: ( rule__Box__SizeAssignment_3_1 )
            {
             before(grammarAccess.getBoxAccess().getSizeAssignment_3_1()); 
            // InternalKinematics.g:3629:2: ( rule__Box__SizeAssignment_3_1 )
            // InternalKinematics.g:3629:3: rule__Box__SizeAssignment_3_1
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
    // InternalKinematics.g:3638:1: rule__Cylinder__Group__0 : rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 ;
    public final void rule__Cylinder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3642:1: ( rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 )
            // InternalKinematics.g:3643:2: rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1
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
    // InternalKinematics.g:3650:1: rule__Cylinder__Group__0__Impl : ( 'Cylinder' ) ;
    public final void rule__Cylinder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3654:1: ( ( 'Cylinder' ) )
            // InternalKinematics.g:3655:1: ( 'Cylinder' )
            {
            // InternalKinematics.g:3655:1: ( 'Cylinder' )
            // InternalKinematics.g:3656:2: 'Cylinder'
            {
             before(grammarAccess.getCylinderAccess().getCylinderKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalKinematics.g:3665:1: rule__Cylinder__Group__1 : rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 ;
    public final void rule__Cylinder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3669:1: ( rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 )
            // InternalKinematics.g:3670:2: rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalKinematics.g:3677:1: rule__Cylinder__Group__1__Impl : ( '{' ) ;
    public final void rule__Cylinder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3681:1: ( ( '{' ) )
            // InternalKinematics.g:3682:1: ( '{' )
            {
            // InternalKinematics.g:3682:1: ( '{' )
            // InternalKinematics.g:3683:2: '{'
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
    // InternalKinematics.g:3692:1: rule__Cylinder__Group__2 : rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 ;
    public final void rule__Cylinder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3696:1: ( rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 )
            // InternalKinematics.g:3697:2: rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalKinematics.g:3704:1: rule__Cylinder__Group__2__Impl : ( 'length' ) ;
    public final void rule__Cylinder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3708:1: ( ( 'length' ) )
            // InternalKinematics.g:3709:1: ( 'length' )
            {
            // InternalKinematics.g:3709:1: ( 'length' )
            // InternalKinematics.g:3710:2: 'length'
            {
             before(grammarAccess.getCylinderAccess().getLengthKeyword_2()); 
            match(input,52,FOLLOW_2); 
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
    // InternalKinematics.g:3719:1: rule__Cylinder__Group__3 : rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 ;
    public final void rule__Cylinder__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3723:1: ( rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 )
            // InternalKinematics.g:3724:2: rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalKinematics.g:3731:1: rule__Cylinder__Group__3__Impl : ( ( rule__Cylinder__LengthAssignment_3 ) ) ;
    public final void rule__Cylinder__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3735:1: ( ( ( rule__Cylinder__LengthAssignment_3 ) ) )
            // InternalKinematics.g:3736:1: ( ( rule__Cylinder__LengthAssignment_3 ) )
            {
            // InternalKinematics.g:3736:1: ( ( rule__Cylinder__LengthAssignment_3 ) )
            // InternalKinematics.g:3737:2: ( rule__Cylinder__LengthAssignment_3 )
            {
             before(grammarAccess.getCylinderAccess().getLengthAssignment_3()); 
            // InternalKinematics.g:3738:2: ( rule__Cylinder__LengthAssignment_3 )
            // InternalKinematics.g:3738:3: rule__Cylinder__LengthAssignment_3
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
    // InternalKinematics.g:3746:1: rule__Cylinder__Group__4 : rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 ;
    public final void rule__Cylinder__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3750:1: ( rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 )
            // InternalKinematics.g:3751:2: rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalKinematics.g:3758:1: rule__Cylinder__Group__4__Impl : ( 'radius' ) ;
    public final void rule__Cylinder__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3762:1: ( ( 'radius' ) )
            // InternalKinematics.g:3763:1: ( 'radius' )
            {
            // InternalKinematics.g:3763:1: ( 'radius' )
            // InternalKinematics.g:3764:2: 'radius'
            {
             before(grammarAccess.getCylinderAccess().getRadiusKeyword_4()); 
            match(input,53,FOLLOW_2); 
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
    // InternalKinematics.g:3773:1: rule__Cylinder__Group__5 : rule__Cylinder__Group__5__Impl rule__Cylinder__Group__6 ;
    public final void rule__Cylinder__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3777:1: ( rule__Cylinder__Group__5__Impl rule__Cylinder__Group__6 )
            // InternalKinematics.g:3778:2: rule__Cylinder__Group__5__Impl rule__Cylinder__Group__6
            {
            pushFollow(FOLLOW_5);
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
    // InternalKinematics.g:3785:1: rule__Cylinder__Group__5__Impl : ( ( rule__Cylinder__RadiusAssignment_5 ) ) ;
    public final void rule__Cylinder__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3789:1: ( ( ( rule__Cylinder__RadiusAssignment_5 ) ) )
            // InternalKinematics.g:3790:1: ( ( rule__Cylinder__RadiusAssignment_5 ) )
            {
            // InternalKinematics.g:3790:1: ( ( rule__Cylinder__RadiusAssignment_5 ) )
            // InternalKinematics.g:3791:2: ( rule__Cylinder__RadiusAssignment_5 )
            {
             before(grammarAccess.getCylinderAccess().getRadiusAssignment_5()); 
            // InternalKinematics.g:3792:2: ( rule__Cylinder__RadiusAssignment_5 )
            // InternalKinematics.g:3792:3: rule__Cylinder__RadiusAssignment_5
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
    // InternalKinematics.g:3800:1: rule__Cylinder__Group__6 : rule__Cylinder__Group__6__Impl ;
    public final void rule__Cylinder__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3804:1: ( rule__Cylinder__Group__6__Impl )
            // InternalKinematics.g:3805:2: rule__Cylinder__Group__6__Impl
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
    // InternalKinematics.g:3811:1: rule__Cylinder__Group__6__Impl : ( '}' ) ;
    public final void rule__Cylinder__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3815:1: ( ( '}' ) )
            // InternalKinematics.g:3816:1: ( '}' )
            {
            // InternalKinematics.g:3816:1: ( '}' )
            // InternalKinematics.g:3817:2: '}'
            {
             before(grammarAccess.getCylinderAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
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
    // InternalKinematics.g:3827:1: rule__Sphere__Group__0 : rule__Sphere__Group__0__Impl rule__Sphere__Group__1 ;
    public final void rule__Sphere__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3831:1: ( rule__Sphere__Group__0__Impl rule__Sphere__Group__1 )
            // InternalKinematics.g:3832:2: rule__Sphere__Group__0__Impl rule__Sphere__Group__1
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
    // InternalKinematics.g:3839:1: rule__Sphere__Group__0__Impl : ( 'Sphere' ) ;
    public final void rule__Sphere__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3843:1: ( ( 'Sphere' ) )
            // InternalKinematics.g:3844:1: ( 'Sphere' )
            {
            // InternalKinematics.g:3844:1: ( 'Sphere' )
            // InternalKinematics.g:3845:2: 'Sphere'
            {
             before(grammarAccess.getSphereAccess().getSphereKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalKinematics.g:3854:1: rule__Sphere__Group__1 : rule__Sphere__Group__1__Impl rule__Sphere__Group__2 ;
    public final void rule__Sphere__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3858:1: ( rule__Sphere__Group__1__Impl rule__Sphere__Group__2 )
            // InternalKinematics.g:3859:2: rule__Sphere__Group__1__Impl rule__Sphere__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalKinematics.g:3866:1: rule__Sphere__Group__1__Impl : ( '{' ) ;
    public final void rule__Sphere__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3870:1: ( ( '{' ) )
            // InternalKinematics.g:3871:1: ( '{' )
            {
            // InternalKinematics.g:3871:1: ( '{' )
            // InternalKinematics.g:3872:2: '{'
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
    // InternalKinematics.g:3881:1: rule__Sphere__Group__2 : rule__Sphere__Group__2__Impl rule__Sphere__Group__3 ;
    public final void rule__Sphere__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3885:1: ( rule__Sphere__Group__2__Impl rule__Sphere__Group__3 )
            // InternalKinematics.g:3886:2: rule__Sphere__Group__2__Impl rule__Sphere__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalKinematics.g:3893:1: rule__Sphere__Group__2__Impl : ( 'radius' ) ;
    public final void rule__Sphere__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3897:1: ( ( 'radius' ) )
            // InternalKinematics.g:3898:1: ( 'radius' )
            {
            // InternalKinematics.g:3898:1: ( 'radius' )
            // InternalKinematics.g:3899:2: 'radius'
            {
             before(grammarAccess.getSphereAccess().getRadiusKeyword_2()); 
            match(input,53,FOLLOW_2); 
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
    // InternalKinematics.g:3908:1: rule__Sphere__Group__3 : rule__Sphere__Group__3__Impl rule__Sphere__Group__4 ;
    public final void rule__Sphere__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3912:1: ( rule__Sphere__Group__3__Impl rule__Sphere__Group__4 )
            // InternalKinematics.g:3913:2: rule__Sphere__Group__3__Impl rule__Sphere__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalKinematics.g:3920:1: rule__Sphere__Group__3__Impl : ( ( rule__Sphere__RadiusAssignment_3 ) ) ;
    public final void rule__Sphere__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3924:1: ( ( ( rule__Sphere__RadiusAssignment_3 ) ) )
            // InternalKinematics.g:3925:1: ( ( rule__Sphere__RadiusAssignment_3 ) )
            {
            // InternalKinematics.g:3925:1: ( ( rule__Sphere__RadiusAssignment_3 ) )
            // InternalKinematics.g:3926:2: ( rule__Sphere__RadiusAssignment_3 )
            {
             before(grammarAccess.getSphereAccess().getRadiusAssignment_3()); 
            // InternalKinematics.g:3927:2: ( rule__Sphere__RadiusAssignment_3 )
            // InternalKinematics.g:3927:3: rule__Sphere__RadiusAssignment_3
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
    // InternalKinematics.g:3935:1: rule__Sphere__Group__4 : rule__Sphere__Group__4__Impl ;
    public final void rule__Sphere__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3939:1: ( rule__Sphere__Group__4__Impl )
            // InternalKinematics.g:3940:2: rule__Sphere__Group__4__Impl
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
    // InternalKinematics.g:3946:1: rule__Sphere__Group__4__Impl : ( '}' ) ;
    public final void rule__Sphere__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3950:1: ( ( '}' ) )
            // InternalKinematics.g:3951:1: ( '}' )
            {
            // InternalKinematics.g:3951:1: ( '}' )
            // InternalKinematics.g:3952:2: '}'
            {
             before(grammarAccess.getSphereAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalKinematics.g:3962:1: rule__Mesh__Group__0 : rule__Mesh__Group__0__Impl rule__Mesh__Group__1 ;
    public final void rule__Mesh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3966:1: ( rule__Mesh__Group__0__Impl rule__Mesh__Group__1 )
            // InternalKinematics.g:3967:2: rule__Mesh__Group__0__Impl rule__Mesh__Group__1
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
    // InternalKinematics.g:3974:1: rule__Mesh__Group__0__Impl : ( 'Mesh' ) ;
    public final void rule__Mesh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3978:1: ( ( 'Mesh' ) )
            // InternalKinematics.g:3979:1: ( 'Mesh' )
            {
            // InternalKinematics.g:3979:1: ( 'Mesh' )
            // InternalKinematics.g:3980:2: 'Mesh'
            {
             before(grammarAccess.getMeshAccess().getMeshKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalKinematics.g:3989:1: rule__Mesh__Group__1 : rule__Mesh__Group__1__Impl rule__Mesh__Group__2 ;
    public final void rule__Mesh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:3993:1: ( rule__Mesh__Group__1__Impl rule__Mesh__Group__2 )
            // InternalKinematics.g:3994:2: rule__Mesh__Group__1__Impl rule__Mesh__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalKinematics.g:4001:1: rule__Mesh__Group__1__Impl : ( '{' ) ;
    public final void rule__Mesh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4005:1: ( ( '{' ) )
            // InternalKinematics.g:4006:1: ( '{' )
            {
            // InternalKinematics.g:4006:1: ( '{' )
            // InternalKinematics.g:4007:2: '{'
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
    // InternalKinematics.g:4016:1: rule__Mesh__Group__2 : rule__Mesh__Group__2__Impl rule__Mesh__Group__3 ;
    public final void rule__Mesh__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4020:1: ( rule__Mesh__Group__2__Impl rule__Mesh__Group__3 )
            // InternalKinematics.g:4021:2: rule__Mesh__Group__2__Impl rule__Mesh__Group__3
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
    // InternalKinematics.g:4028:1: rule__Mesh__Group__2__Impl : ( 'filename' ) ;
    public final void rule__Mesh__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4032:1: ( ( 'filename' ) )
            // InternalKinematics.g:4033:1: ( 'filename' )
            {
            // InternalKinematics.g:4033:1: ( 'filename' )
            // InternalKinematics.g:4034:2: 'filename'
            {
             before(grammarAccess.getMeshAccess().getFilenameKeyword_2()); 
            match(input,56,FOLLOW_2); 
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
    // InternalKinematics.g:4043:1: rule__Mesh__Group__3 : rule__Mesh__Group__3__Impl rule__Mesh__Group__4 ;
    public final void rule__Mesh__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4047:1: ( rule__Mesh__Group__3__Impl rule__Mesh__Group__4 )
            // InternalKinematics.g:4048:2: rule__Mesh__Group__3__Impl rule__Mesh__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalKinematics.g:4055:1: rule__Mesh__Group__3__Impl : ( ( rule__Mesh__FilenameAssignment_3 ) ) ;
    public final void rule__Mesh__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4059:1: ( ( ( rule__Mesh__FilenameAssignment_3 ) ) )
            // InternalKinematics.g:4060:1: ( ( rule__Mesh__FilenameAssignment_3 ) )
            {
            // InternalKinematics.g:4060:1: ( ( rule__Mesh__FilenameAssignment_3 ) )
            // InternalKinematics.g:4061:2: ( rule__Mesh__FilenameAssignment_3 )
            {
             before(grammarAccess.getMeshAccess().getFilenameAssignment_3()); 
            // InternalKinematics.g:4062:2: ( rule__Mesh__FilenameAssignment_3 )
            // InternalKinematics.g:4062:3: rule__Mesh__FilenameAssignment_3
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
    // InternalKinematics.g:4070:1: rule__Mesh__Group__4 : rule__Mesh__Group__4__Impl rule__Mesh__Group__5 ;
    public final void rule__Mesh__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4074:1: ( rule__Mesh__Group__4__Impl rule__Mesh__Group__5 )
            // InternalKinematics.g:4075:2: rule__Mesh__Group__4__Impl rule__Mesh__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalKinematics.g:4082:1: rule__Mesh__Group__4__Impl : ( ( rule__Mesh__Group_4__0 )? ) ;
    public final void rule__Mesh__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4086:1: ( ( ( rule__Mesh__Group_4__0 )? ) )
            // InternalKinematics.g:4087:1: ( ( rule__Mesh__Group_4__0 )? )
            {
            // InternalKinematics.g:4087:1: ( ( rule__Mesh__Group_4__0 )? )
            // InternalKinematics.g:4088:2: ( rule__Mesh__Group_4__0 )?
            {
             before(grammarAccess.getMeshAccess().getGroup_4()); 
            // InternalKinematics.g:4089:2: ( rule__Mesh__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==57) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalKinematics.g:4089:3: rule__Mesh__Group_4__0
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
    // InternalKinematics.g:4097:1: rule__Mesh__Group__5 : rule__Mesh__Group__5__Impl ;
    public final void rule__Mesh__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4101:1: ( rule__Mesh__Group__5__Impl )
            // InternalKinematics.g:4102:2: rule__Mesh__Group__5__Impl
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
    // InternalKinematics.g:4108:1: rule__Mesh__Group__5__Impl : ( '}' ) ;
    public final void rule__Mesh__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4112:1: ( ( '}' ) )
            // InternalKinematics.g:4113:1: ( '}' )
            {
            // InternalKinematics.g:4113:1: ( '}' )
            // InternalKinematics.g:4114:2: '}'
            {
             before(grammarAccess.getMeshAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
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
    // InternalKinematics.g:4124:1: rule__Mesh__Group_4__0 : rule__Mesh__Group_4__0__Impl rule__Mesh__Group_4__1 ;
    public final void rule__Mesh__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4128:1: ( rule__Mesh__Group_4__0__Impl rule__Mesh__Group_4__1 )
            // InternalKinematics.g:4129:2: rule__Mesh__Group_4__0__Impl rule__Mesh__Group_4__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalKinematics.g:4136:1: rule__Mesh__Group_4__0__Impl : ( 'scale' ) ;
    public final void rule__Mesh__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4140:1: ( ( 'scale' ) )
            // InternalKinematics.g:4141:1: ( 'scale' )
            {
            // InternalKinematics.g:4141:1: ( 'scale' )
            // InternalKinematics.g:4142:2: 'scale'
            {
             before(grammarAccess.getMeshAccess().getScaleKeyword_4_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalKinematics.g:4151:1: rule__Mesh__Group_4__1 : rule__Mesh__Group_4__1__Impl ;
    public final void rule__Mesh__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4155:1: ( rule__Mesh__Group_4__1__Impl )
            // InternalKinematics.g:4156:2: rule__Mesh__Group_4__1__Impl
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
    // InternalKinematics.g:4162:1: rule__Mesh__Group_4__1__Impl : ( ( rule__Mesh__ScaleAssignment_4_1 ) ) ;
    public final void rule__Mesh__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4166:1: ( ( ( rule__Mesh__ScaleAssignment_4_1 ) ) )
            // InternalKinematics.g:4167:1: ( ( rule__Mesh__ScaleAssignment_4_1 ) )
            {
            // InternalKinematics.g:4167:1: ( ( rule__Mesh__ScaleAssignment_4_1 ) )
            // InternalKinematics.g:4168:2: ( rule__Mesh__ScaleAssignment_4_1 )
            {
             before(grammarAccess.getMeshAccess().getScaleAssignment_4_1()); 
            // InternalKinematics.g:4169:2: ( rule__Mesh__ScaleAssignment_4_1 )
            // InternalKinematics.g:4169:3: rule__Mesh__ScaleAssignment_4_1
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


    // $ANTLR start "rule__Axis__XyzAssignment_3_1"
    // InternalKinematics.g:4178:1: rule__Axis__XyzAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Axis__XyzAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4182:1: ( ( ruleEString ) )
            // InternalKinematics.g:4183:2: ( ruleEString )
            {
            // InternalKinematics.g:4183:2: ( ruleEString )
            // InternalKinematics.g:4184:3: ruleEString
            {
             before(grammarAccess.getAxisAccess().getXyzEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAxisAccess().getXyzEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__XyzAssignment_3_1"


    // $ANTLR start "rule__Pose__RpyAssignment_3_1"
    // InternalKinematics.g:4193:1: rule__Pose__RpyAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Pose__RpyAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4197:1: ( ( ruleEString ) )
            // InternalKinematics.g:4198:2: ( ruleEString )
            {
            // InternalKinematics.g:4198:2: ( ruleEString )
            // InternalKinematics.g:4199:3: ruleEString
            {
             before(grammarAccess.getPoseAccess().getRpyEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPoseAccess().getRpyEStringParserRuleCall_3_1_0()); 

            }


            }

        }
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
    // InternalKinematics.g:4208:1: rule__Pose__XyzAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Pose__XyzAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4212:1: ( ( ruleEString ) )
            // InternalKinematics.g:4213:2: ( ruleEString )
            {
            // InternalKinematics.g:4213:2: ( ruleEString )
            // InternalKinematics.g:4214:3: ruleEString
            {
             before(grammarAccess.getPoseAccess().getXyzEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPoseAccess().getXyzEStringParserRuleCall_4_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Limit__EffortAssignment_3_1"
    // InternalKinematics.g:4223:1: rule__Limit__EffortAssignment_3_1 : ( ruleDouble0 ) ;
    public final void rule__Limit__EffortAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4227:1: ( ( ruleDouble0 ) )
            // InternalKinematics.g:4228:2: ( ruleDouble0 )
            {
            // InternalKinematics.g:4228:2: ( ruleDouble0 )
            // InternalKinematics.g:4229:3: ruleDouble0
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
    // InternalKinematics.g:4238:1: rule__Limit__LowerAssignment_4_1 : ( ruleDouble0 ) ;
    public final void rule__Limit__LowerAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4242:1: ( ( ruleDouble0 ) )
            // InternalKinematics.g:4243:2: ( ruleDouble0 )
            {
            // InternalKinematics.g:4243:2: ( ruleDouble0 )
            // InternalKinematics.g:4244:3: ruleDouble0
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
    // InternalKinematics.g:4253:1: rule__Limit__UpperAssignment_5_1 : ( ruleDouble0 ) ;
    public final void rule__Limit__UpperAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4257:1: ( ( ruleDouble0 ) )
            // InternalKinematics.g:4258:2: ( ruleDouble0 )
            {
            // InternalKinematics.g:4258:2: ( ruleDouble0 )
            // InternalKinematics.g:4259:3: ruleDouble0
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
    // InternalKinematics.g:4268:1: rule__Limit__VelocityAssignment_6_1 : ( ruleDouble0 ) ;
    public final void rule__Limit__VelocityAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4272:1: ( ( ruleDouble0 ) )
            // InternalKinematics.g:4273:2: ( ruleDouble0 )
            {
            // InternalKinematics.g:4273:2: ( ruleDouble0 )
            // InternalKinematics.g:4274:3: ruleDouble0
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
    // InternalKinematics.g:4283:1: rule__Inertial__OriginAssignment_3_1 : ( rulePose ) ;
    public final void rule__Inertial__OriginAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4287:1: ( ( rulePose ) )
            // InternalKinematics.g:4288:2: ( rulePose )
            {
            // InternalKinematics.g:4288:2: ( rulePose )
            // InternalKinematics.g:4289:3: rulePose
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
    // InternalKinematics.g:4298:1: rule__Inertial__MassAssignment_4_1 : ( ruleMass ) ;
    public final void rule__Inertial__MassAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4302:1: ( ( ruleMass ) )
            // InternalKinematics.g:4303:2: ( ruleMass )
            {
            // InternalKinematics.g:4303:2: ( ruleMass )
            // InternalKinematics.g:4304:3: ruleMass
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
    // InternalKinematics.g:4313:1: rule__Inertial__InertiaAssignment_5_1 : ( ruleInertia ) ;
    public final void rule__Inertial__InertiaAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4317:1: ( ( ruleInertia ) )
            // InternalKinematics.g:4318:2: ( ruleInertia )
            {
            // InternalKinematics.g:4318:2: ( ruleInertia )
            // InternalKinematics.g:4319:3: ruleInertia
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
    // InternalKinematics.g:4328:1: rule__Visual__OriginAssignment_2_1 : ( rulePose ) ;
    public final void rule__Visual__OriginAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4332:1: ( ( rulePose ) )
            // InternalKinematics.g:4333:2: ( rulePose )
            {
            // InternalKinematics.g:4333:2: ( rulePose )
            // InternalKinematics.g:4334:3: rulePose
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
    // InternalKinematics.g:4343:1: rule__Visual__GeometryAssignment_4 : ( ruleGeometry ) ;
    public final void rule__Visual__GeometryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4347:1: ( ( ruleGeometry ) )
            // InternalKinematics.g:4348:2: ( ruleGeometry )
            {
            // InternalKinematics.g:4348:2: ( ruleGeometry )
            // InternalKinematics.g:4349:3: ruleGeometry
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
    // InternalKinematics.g:4358:1: rule__Collision__OriginAssignment_2_1 : ( rulePose ) ;
    public final void rule__Collision__OriginAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4362:1: ( ( rulePose ) )
            // InternalKinematics.g:4363:2: ( rulePose )
            {
            // InternalKinematics.g:4363:2: ( rulePose )
            // InternalKinematics.g:4364:3: rulePose
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
    // InternalKinematics.g:4373:1: rule__Collision__GeometryAssignment_4 : ( ruleGeometry ) ;
    public final void rule__Collision__GeometryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4377:1: ( ( ruleGeometry ) )
            // InternalKinematics.g:4378:2: ( ruleGeometry )
            {
            // InternalKinematics.g:4378:2: ( ruleGeometry )
            // InternalKinematics.g:4379:3: ruleGeometry
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
    // InternalKinematics.g:4388:1: rule__Mass__ValueAssignment_3_1 : ( ruleDouble0 ) ;
    public final void rule__Mass__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4392:1: ( ( ruleDouble0 ) )
            // InternalKinematics.g:4393:2: ( ruleDouble0 )
            {
            // InternalKinematics.g:4393:2: ( ruleDouble0 )
            // InternalKinematics.g:4394:3: ruleDouble0
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
    // InternalKinematics.g:4403:1: rule__Inertia__IxxAssignment_3_1 : ( ruleDouble0 ) ;
    public final void rule__Inertia__IxxAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4407:1: ( ( ruleDouble0 ) )
            // InternalKinematics.g:4408:2: ( ruleDouble0 )
            {
            // InternalKinematics.g:4408:2: ( ruleDouble0 )
            // InternalKinematics.g:4409:3: ruleDouble0
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
    // InternalKinematics.g:4418:1: rule__Inertia__IxyAssignment_4_1 : ( ruleDouble0 ) ;
    public final void rule__Inertia__IxyAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4422:1: ( ( ruleDouble0 ) )
            // InternalKinematics.g:4423:2: ( ruleDouble0 )
            {
            // InternalKinematics.g:4423:2: ( ruleDouble0 )
            // InternalKinematics.g:4424:3: ruleDouble0
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
    // InternalKinematics.g:4433:1: rule__Inertia__IxzAssignment_5_1 : ( ruleDouble0 ) ;
    public final void rule__Inertia__IxzAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4437:1: ( ( ruleDouble0 ) )
            // InternalKinematics.g:4438:2: ( ruleDouble0 )
            {
            // InternalKinematics.g:4438:2: ( ruleDouble0 )
            // InternalKinematics.g:4439:3: ruleDouble0
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
    // InternalKinematics.g:4448:1: rule__Inertia__IyyAssignment_6_1 : ( ruleDouble0 ) ;
    public final void rule__Inertia__IyyAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4452:1: ( ( ruleDouble0 ) )
            // InternalKinematics.g:4453:2: ( ruleDouble0 )
            {
            // InternalKinematics.g:4453:2: ( ruleDouble0 )
            // InternalKinematics.g:4454:3: ruleDouble0
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
    // InternalKinematics.g:4463:1: rule__Inertia__IyzAssignment_7_1 : ( ruleDouble0 ) ;
    public final void rule__Inertia__IyzAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4467:1: ( ( ruleDouble0 ) )
            // InternalKinematics.g:4468:2: ( ruleDouble0 )
            {
            // InternalKinematics.g:4468:2: ( ruleDouble0 )
            // InternalKinematics.g:4469:3: ruleDouble0
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
    // InternalKinematics.g:4478:1: rule__Inertia__IzzAssignment_8_1 : ( ruleDouble0 ) ;
    public final void rule__Inertia__IzzAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4482:1: ( ( ruleDouble0 ) )
            // InternalKinematics.g:4483:2: ( ruleDouble0 )
            {
            // InternalKinematics.g:4483:2: ( ruleDouble0 )
            // InternalKinematics.g:4484:3: ruleDouble0
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
    // InternalKinematics.g:4493:1: rule__Geometry__BoxAssignment_3_1 : ( ruleBox ) ;
    public final void rule__Geometry__BoxAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4497:1: ( ( ruleBox ) )
            // InternalKinematics.g:4498:2: ( ruleBox )
            {
            // InternalKinematics.g:4498:2: ( ruleBox )
            // InternalKinematics.g:4499:3: ruleBox
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
    // InternalKinematics.g:4508:1: rule__Geometry__CylinderAssignment_4_1 : ( ruleCylinder ) ;
    public final void rule__Geometry__CylinderAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4512:1: ( ( ruleCylinder ) )
            // InternalKinematics.g:4513:2: ( ruleCylinder )
            {
            // InternalKinematics.g:4513:2: ( ruleCylinder )
            // InternalKinematics.g:4514:3: ruleCylinder
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
    // InternalKinematics.g:4523:1: rule__Geometry__SphereAssignment_5_1 : ( ruleSphere ) ;
    public final void rule__Geometry__SphereAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4527:1: ( ( ruleSphere ) )
            // InternalKinematics.g:4528:2: ( ruleSphere )
            {
            // InternalKinematics.g:4528:2: ( ruleSphere )
            // InternalKinematics.g:4529:3: ruleSphere
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
    // InternalKinematics.g:4538:1: rule__Geometry__MeshAssignment_6_1 : ( ruleMesh ) ;
    public final void rule__Geometry__MeshAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4542:1: ( ( ruleMesh ) )
            // InternalKinematics.g:4543:2: ( ruleMesh )
            {
            // InternalKinematics.g:4543:2: ( ruleMesh )
            // InternalKinematics.g:4544:3: ruleMesh
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
    // InternalKinematics.g:4553:1: rule__Box__SizeAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Box__SizeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4557:1: ( ( ruleEString ) )
            // InternalKinematics.g:4558:2: ( ruleEString )
            {
            // InternalKinematics.g:4558:2: ( ruleEString )
            // InternalKinematics.g:4559:3: ruleEString
            {
             before(grammarAccess.getBoxAccess().getSizeEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getSizeEStringParserRuleCall_3_1_0()); 

            }


            }

        }
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
    // InternalKinematics.g:4568:1: rule__Cylinder__LengthAssignment_3 : ( ruleDouble0 ) ;
    public final void rule__Cylinder__LengthAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4572:1: ( ( ruleDouble0 ) )
            // InternalKinematics.g:4573:2: ( ruleDouble0 )
            {
            // InternalKinematics.g:4573:2: ( ruleDouble0 )
            // InternalKinematics.g:4574:3: ruleDouble0
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
    // InternalKinematics.g:4583:1: rule__Cylinder__RadiusAssignment_5 : ( ruleDouble0 ) ;
    public final void rule__Cylinder__RadiusAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4587:1: ( ( ruleDouble0 ) )
            // InternalKinematics.g:4588:2: ( ruleDouble0 )
            {
            // InternalKinematics.g:4588:2: ( ruleDouble0 )
            // InternalKinematics.g:4589:3: ruleDouble0
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
    // InternalKinematics.g:4598:1: rule__Sphere__RadiusAssignment_3 : ( ruleDouble0 ) ;
    public final void rule__Sphere__RadiusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4602:1: ( ( ruleDouble0 ) )
            // InternalKinematics.g:4603:2: ( ruleDouble0 )
            {
            // InternalKinematics.g:4603:2: ( ruleDouble0 )
            // InternalKinematics.g:4604:3: ruleDouble0
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
    // InternalKinematics.g:4613:1: rule__Mesh__FilenameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Mesh__FilenameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4617:1: ( ( RULE_STRING ) )
            // InternalKinematics.g:4618:2: ( RULE_STRING )
            {
            // InternalKinematics.g:4618:2: ( RULE_STRING )
            // InternalKinematics.g:4619:3: RULE_STRING
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
    // InternalKinematics.g:4628:1: rule__Mesh__ScaleAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Mesh__ScaleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:4632:1: ( ( ruleEString ) )
            // InternalKinematics.g:4633:2: ( ruleEString )
            {
            // InternalKinematics.g:4633:2: ( ruleEString )
            // InternalKinematics.g:4634:3: ruleEString
            {
             before(grammarAccess.getMeshAccess().getScaleEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMeshAccess().getScaleEStringParserRuleCall_4_1_0()); 

            }


            }

        }
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000540000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000F040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000E0040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000FC000040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001E00000040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0004000000040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0200000000040000L});

}