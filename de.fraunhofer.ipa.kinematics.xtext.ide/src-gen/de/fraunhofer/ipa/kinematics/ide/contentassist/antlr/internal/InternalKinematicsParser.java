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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'robot'", "'{'", "'}'", "'robots'", "','", "'prefix'", "'root_link'", "'joints'", "'ref_robot'", "'Link'", "'Joint'", "'parent'", "'child'"
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



    // $ANTLR start "entryRulerobot"
    // InternalKinematics.g:53:1: entryRulerobot : rulerobot EOF ;
    public final void entryRulerobot() throws RecognitionException {
        try {
            // InternalKinematics.g:54:1: ( rulerobot EOF )
            // InternalKinematics.g:55:1: rulerobot EOF
            {
             before(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            rulerobot();

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
    // $ANTLR end "entryRulerobot"


    // $ANTLR start "rulerobot"
    // InternalKinematics.g:62:1: rulerobot : ( ( rule__Robot__Group__0 ) ) ;
    public final void rulerobot() throws RecognitionException {

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
    // $ANTLR end "rulerobot"


    // $ANTLR start "entryRuleref_robot"
    // InternalKinematics.g:78:1: entryRuleref_robot : ruleref_robot EOF ;
    public final void entryRuleref_robot() throws RecognitionException {
        try {
            // InternalKinematics.g:79:1: ( ruleref_robot EOF )
            // InternalKinematics.g:80:1: ruleref_robot EOF
            {
             before(grammarAccess.getRef_robotRule()); 
            pushFollow(FOLLOW_1);
            ruleref_robot();

            state._fsp--;

             after(grammarAccess.getRef_robotRule()); 
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
    // $ANTLR end "entryRuleref_robot"


    // $ANTLR start "ruleref_robot"
    // InternalKinematics.g:87:1: ruleref_robot : ( ( rule__Ref_robot__Group__0 ) ) ;
    public final void ruleref_robot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:91:2: ( ( ( rule__Ref_robot__Group__0 ) ) )
            // InternalKinematics.g:92:2: ( ( rule__Ref_robot__Group__0 ) )
            {
            // InternalKinematics.g:92:2: ( ( rule__Ref_robot__Group__0 ) )
            // InternalKinematics.g:93:3: ( rule__Ref_robot__Group__0 )
            {
             before(grammarAccess.getRef_robotAccess().getGroup()); 
            // InternalKinematics.g:94:3: ( rule__Ref_robot__Group__0 )
            // InternalKinematics.g:94:4: rule__Ref_robot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ref_robot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRef_robotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleref_robot"


    // $ANTLR start "entryRuleLink"
    // InternalKinematics.g:103:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalKinematics.g:104:1: ( ruleLink EOF )
            // InternalKinematics.g:105:1: ruleLink EOF
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
    // InternalKinematics.g:112:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:116:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalKinematics.g:117:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalKinematics.g:117:2: ( ( rule__Link__Group__0 ) )
            // InternalKinematics.g:118:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalKinematics.g:119:3: ( rule__Link__Group__0 )
            // InternalKinematics.g:119:4: rule__Link__Group__0
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


    // $ANTLR start "entryRuleJoint"
    // InternalKinematics.g:128:1: entryRuleJoint : ruleJoint EOF ;
    public final void entryRuleJoint() throws RecognitionException {
        try {
            // InternalKinematics.g:129:1: ( ruleJoint EOF )
            // InternalKinematics.g:130:1: ruleJoint EOF
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
    // InternalKinematics.g:137:1: ruleJoint : ( ( rule__Joint__Group__0 ) ) ;
    public final void ruleJoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:141:2: ( ( ( rule__Joint__Group__0 ) ) )
            // InternalKinematics.g:142:2: ( ( rule__Joint__Group__0 ) )
            {
            // InternalKinematics.g:142:2: ( ( rule__Joint__Group__0 ) )
            // InternalKinematics.g:143:3: ( rule__Joint__Group__0 )
            {
             before(grammarAccess.getJointAccess().getGroup()); 
            // InternalKinematics.g:144:3: ( rule__Joint__Group__0 )
            // InternalKinematics.g:144:4: rule__Joint__Group__0
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


    // $ANTLR start "entryRuleEString"
    // InternalKinematics.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalKinematics.g:154:1: ( ruleEString EOF )
            // InternalKinematics.g:155:1: ruleEString EOF
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
    // InternalKinematics.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalKinematics.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalKinematics.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalKinematics.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalKinematics.g:169:3: ( rule__EString__Alternatives )
            // InternalKinematics.g:169:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalKinematics.g:177:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:181:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalKinematics.g:182:2: ( RULE_STRING )
                    {
                    // InternalKinematics.g:182:2: ( RULE_STRING )
                    // InternalKinematics.g:183:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKinematics.g:188:2: ( RULE_ID )
                    {
                    // InternalKinematics.g:188:2: ( RULE_ID )
                    // InternalKinematics.g:189:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Robot__Group__0"
    // InternalKinematics.g:198:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:202:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalKinematics.g:203:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
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
    // InternalKinematics.g:210:1: rule__Robot__Group__0__Impl : ( () ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:214:1: ( ( () ) )
            // InternalKinematics.g:215:1: ( () )
            {
            // InternalKinematics.g:215:1: ( () )
            // InternalKinematics.g:216:2: ()
            {
             before(grammarAccess.getRobotAccess().getRobotAction_0()); 
            // InternalKinematics.g:217:2: ()
            // InternalKinematics.g:217:3: 
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
    // InternalKinematics.g:225:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:229:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalKinematics.g:230:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
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
    // InternalKinematics.g:237:1: rule__Robot__Group__1__Impl : ( 'robot' ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:241:1: ( ( 'robot' ) )
            // InternalKinematics.g:242:1: ( 'robot' )
            {
            // InternalKinematics.g:242:1: ( 'robot' )
            // InternalKinematics.g:243:2: 'robot'
            {
             before(grammarAccess.getRobotAccess().getRobotKeyword_1()); 
            match(input,11,FOLLOW_2); 
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
    // InternalKinematics.g:252:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl rule__Robot__Group__3 ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:256:1: ( rule__Robot__Group__2__Impl rule__Robot__Group__3 )
            // InternalKinematics.g:257:2: rule__Robot__Group__2__Impl rule__Robot__Group__3
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
    // InternalKinematics.g:264:1: rule__Robot__Group__2__Impl : ( ( rule__Robot__NameAssignment_2 ) ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:268:1: ( ( ( rule__Robot__NameAssignment_2 ) ) )
            // InternalKinematics.g:269:1: ( ( rule__Robot__NameAssignment_2 ) )
            {
            // InternalKinematics.g:269:1: ( ( rule__Robot__NameAssignment_2 ) )
            // InternalKinematics.g:270:2: ( rule__Robot__NameAssignment_2 )
            {
             before(grammarAccess.getRobotAccess().getNameAssignment_2()); 
            // InternalKinematics.g:271:2: ( rule__Robot__NameAssignment_2 )
            // InternalKinematics.g:271:3: rule__Robot__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Robot__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalKinematics.g:279:1: rule__Robot__Group__3 : rule__Robot__Group__3__Impl rule__Robot__Group__4 ;
    public final void rule__Robot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:283:1: ( rule__Robot__Group__3__Impl rule__Robot__Group__4 )
            // InternalKinematics.g:284:2: rule__Robot__Group__3__Impl rule__Robot__Group__4
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
    // InternalKinematics.g:291:1: rule__Robot__Group__3__Impl : ( '{' ) ;
    public final void rule__Robot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:295:1: ( ( '{' ) )
            // InternalKinematics.g:296:1: ( '{' )
            {
            // InternalKinematics.g:296:1: ( '{' )
            // InternalKinematics.g:297:2: '{'
            {
             before(grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalKinematics.g:306:1: rule__Robot__Group__4 : rule__Robot__Group__4__Impl rule__Robot__Group__5 ;
    public final void rule__Robot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:310:1: ( rule__Robot__Group__4__Impl rule__Robot__Group__5 )
            // InternalKinematics.g:311:2: rule__Robot__Group__4__Impl rule__Robot__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalKinematics.g:318:1: rule__Robot__Group__4__Impl : ( ( rule__Robot__Group_4__0 )? ) ;
    public final void rule__Robot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:322:1: ( ( ( rule__Robot__Group_4__0 )? ) )
            // InternalKinematics.g:323:1: ( ( rule__Robot__Group_4__0 )? )
            {
            // InternalKinematics.g:323:1: ( ( rule__Robot__Group_4__0 )? )
            // InternalKinematics.g:324:2: ( rule__Robot__Group_4__0 )?
            {
             before(grammarAccess.getRobotAccess().getGroup_4()); 
            // InternalKinematics.g:325:2: ( rule__Robot__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKinematics.g:325:3: rule__Robot__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Robot__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRobotAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalKinematics.g:333:1: rule__Robot__Group__5 : rule__Robot__Group__5__Impl rule__Robot__Group__6 ;
    public final void rule__Robot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:337:1: ( rule__Robot__Group__5__Impl rule__Robot__Group__6 )
            // InternalKinematics.g:338:2: rule__Robot__Group__5__Impl rule__Robot__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalKinematics.g:345:1: rule__Robot__Group__5__Impl : ( ( rule__Robot__Group_5__0 )? ) ;
    public final void rule__Robot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:349:1: ( ( ( rule__Robot__Group_5__0 )? ) )
            // InternalKinematics.g:350:1: ( ( rule__Robot__Group_5__0 )? )
            {
            // InternalKinematics.g:350:1: ( ( rule__Robot__Group_5__0 )? )
            // InternalKinematics.g:351:2: ( rule__Robot__Group_5__0 )?
            {
             before(grammarAccess.getRobotAccess().getGroup_5()); 
            // InternalKinematics.g:352:2: ( rule__Robot__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKinematics.g:352:3: rule__Robot__Group_5__0
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
    // InternalKinematics.g:360:1: rule__Robot__Group__6 : rule__Robot__Group__6__Impl rule__Robot__Group__7 ;
    public final void rule__Robot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:364:1: ( rule__Robot__Group__6__Impl rule__Robot__Group__7 )
            // InternalKinematics.g:365:2: rule__Robot__Group__6__Impl rule__Robot__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalKinematics.g:372:1: rule__Robot__Group__6__Impl : ( ( rule__Robot__Group_6__0 )? ) ;
    public final void rule__Robot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:376:1: ( ( ( rule__Robot__Group_6__0 )? ) )
            // InternalKinematics.g:377:1: ( ( rule__Robot__Group_6__0 )? )
            {
            // InternalKinematics.g:377:1: ( ( rule__Robot__Group_6__0 )? )
            // InternalKinematics.g:378:2: ( rule__Robot__Group_6__0 )?
            {
             before(grammarAccess.getRobotAccess().getGroup_6()); 
            // InternalKinematics.g:379:2: ( rule__Robot__Group_6__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalKinematics.g:379:3: rule__Robot__Group_6__0
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
    // InternalKinematics.g:387:1: rule__Robot__Group__7 : rule__Robot__Group__7__Impl rule__Robot__Group__8 ;
    public final void rule__Robot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:391:1: ( rule__Robot__Group__7__Impl rule__Robot__Group__8 )
            // InternalKinematics.g:392:2: rule__Robot__Group__7__Impl rule__Robot__Group__8
            {
            pushFollow(FOLLOW_6);
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
    // InternalKinematics.g:399:1: rule__Robot__Group__7__Impl : ( ( rule__Robot__Group_7__0 )? ) ;
    public final void rule__Robot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:403:1: ( ( ( rule__Robot__Group_7__0 )? ) )
            // InternalKinematics.g:404:1: ( ( rule__Robot__Group_7__0 )? )
            {
            // InternalKinematics.g:404:1: ( ( rule__Robot__Group_7__0 )? )
            // InternalKinematics.g:405:2: ( rule__Robot__Group_7__0 )?
            {
             before(grammarAccess.getRobotAccess().getGroup_7()); 
            // InternalKinematics.g:406:2: ( rule__Robot__Group_7__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKinematics.g:406:3: rule__Robot__Group_7__0
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
    // InternalKinematics.g:414:1: rule__Robot__Group__8 : rule__Robot__Group__8__Impl ;
    public final void rule__Robot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:418:1: ( rule__Robot__Group__8__Impl )
            // InternalKinematics.g:419:2: rule__Robot__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__8__Impl();

            state._fsp--;


            }

        }
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
    // InternalKinematics.g:425:1: rule__Robot__Group__8__Impl : ( '}' ) ;
    public final void rule__Robot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:429:1: ( ( '}' ) )
            // InternalKinematics.g:430:1: ( '}' )
            {
            // InternalKinematics.g:430:1: ( '}' )
            // InternalKinematics.g:431:2: '}'
            {
             before(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Robot__Group_4__0"
    // InternalKinematics.g:441:1: rule__Robot__Group_4__0 : rule__Robot__Group_4__0__Impl rule__Robot__Group_4__1 ;
    public final void rule__Robot__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:445:1: ( rule__Robot__Group_4__0__Impl rule__Robot__Group_4__1 )
            // InternalKinematics.g:446:2: rule__Robot__Group_4__0__Impl rule__Robot__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Robot__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4__0"


    // $ANTLR start "rule__Robot__Group_4__0__Impl"
    // InternalKinematics.g:453:1: rule__Robot__Group_4__0__Impl : ( 'robots' ) ;
    public final void rule__Robot__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:457:1: ( ( 'robots' ) )
            // InternalKinematics.g:458:1: ( 'robots' )
            {
            // InternalKinematics.g:458:1: ( 'robots' )
            // InternalKinematics.g:459:2: 'robots'
            {
             before(grammarAccess.getRobotAccess().getRobotsKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getRobotsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4__0__Impl"


    // $ANTLR start "rule__Robot__Group_4__1"
    // InternalKinematics.g:468:1: rule__Robot__Group_4__1 : rule__Robot__Group_4__1__Impl rule__Robot__Group_4__2 ;
    public final void rule__Robot__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:472:1: ( rule__Robot__Group_4__1__Impl rule__Robot__Group_4__2 )
            // InternalKinematics.g:473:2: rule__Robot__Group_4__1__Impl rule__Robot__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Robot__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4__1"


    // $ANTLR start "rule__Robot__Group_4__1__Impl"
    // InternalKinematics.g:480:1: rule__Robot__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Robot__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:484:1: ( ( '{' ) )
            // InternalKinematics.g:485:1: ( '{' )
            {
            // InternalKinematics.g:485:1: ( '{' )
            // InternalKinematics.g:486:2: '{'
            {
             before(grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4__1__Impl"


    // $ANTLR start "rule__Robot__Group_4__2"
    // InternalKinematics.g:495:1: rule__Robot__Group_4__2 : rule__Robot__Group_4__2__Impl rule__Robot__Group_4__3 ;
    public final void rule__Robot__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:499:1: ( rule__Robot__Group_4__2__Impl rule__Robot__Group_4__3 )
            // InternalKinematics.g:500:2: rule__Robot__Group_4__2__Impl rule__Robot__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Robot__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4__2"


    // $ANTLR start "rule__Robot__Group_4__2__Impl"
    // InternalKinematics.g:507:1: rule__Robot__Group_4__2__Impl : ( ( rule__Robot__RobotsAssignment_4_2 ) ) ;
    public final void rule__Robot__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:511:1: ( ( ( rule__Robot__RobotsAssignment_4_2 ) ) )
            // InternalKinematics.g:512:1: ( ( rule__Robot__RobotsAssignment_4_2 ) )
            {
            // InternalKinematics.g:512:1: ( ( rule__Robot__RobotsAssignment_4_2 ) )
            // InternalKinematics.g:513:2: ( rule__Robot__RobotsAssignment_4_2 )
            {
             before(grammarAccess.getRobotAccess().getRobotsAssignment_4_2()); 
            // InternalKinematics.g:514:2: ( rule__Robot__RobotsAssignment_4_2 )
            // InternalKinematics.g:514:3: rule__Robot__RobotsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Robot__RobotsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getRobotsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4__2__Impl"


    // $ANTLR start "rule__Robot__Group_4__3"
    // InternalKinematics.g:522:1: rule__Robot__Group_4__3 : rule__Robot__Group_4__3__Impl rule__Robot__Group_4__4 ;
    public final void rule__Robot__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:526:1: ( rule__Robot__Group_4__3__Impl rule__Robot__Group_4__4 )
            // InternalKinematics.g:527:2: rule__Robot__Group_4__3__Impl rule__Robot__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__Robot__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4__3"


    // $ANTLR start "rule__Robot__Group_4__3__Impl"
    // InternalKinematics.g:534:1: rule__Robot__Group_4__3__Impl : ( ( rule__Robot__Group_4_3__0 )* ) ;
    public final void rule__Robot__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:538:1: ( ( ( rule__Robot__Group_4_3__0 )* ) )
            // InternalKinematics.g:539:1: ( ( rule__Robot__Group_4_3__0 )* )
            {
            // InternalKinematics.g:539:1: ( ( rule__Robot__Group_4_3__0 )* )
            // InternalKinematics.g:540:2: ( rule__Robot__Group_4_3__0 )*
            {
             before(grammarAccess.getRobotAccess().getGroup_4_3()); 
            // InternalKinematics.g:541:2: ( rule__Robot__Group_4_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalKinematics.g:541:3: rule__Robot__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Robot__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRobotAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4__3__Impl"


    // $ANTLR start "rule__Robot__Group_4__4"
    // InternalKinematics.g:549:1: rule__Robot__Group_4__4 : rule__Robot__Group_4__4__Impl ;
    public final void rule__Robot__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:553:1: ( rule__Robot__Group_4__4__Impl )
            // InternalKinematics.g:554:2: rule__Robot__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4__4"


    // $ANTLR start "rule__Robot__Group_4__4__Impl"
    // InternalKinematics.g:560:1: rule__Robot__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Robot__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:564:1: ( ( '}' ) )
            // InternalKinematics.g:565:1: ( '}' )
            {
            // InternalKinematics.g:565:1: ( '}' )
            // InternalKinematics.g:566:2: '}'
            {
             before(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4__4__Impl"


    // $ANTLR start "rule__Robot__Group_4_3__0"
    // InternalKinematics.g:576:1: rule__Robot__Group_4_3__0 : rule__Robot__Group_4_3__0__Impl rule__Robot__Group_4_3__1 ;
    public final void rule__Robot__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:580:1: ( rule__Robot__Group_4_3__0__Impl rule__Robot__Group_4_3__1 )
            // InternalKinematics.g:581:2: rule__Robot__Group_4_3__0__Impl rule__Robot__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Robot__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4_3__0"


    // $ANTLR start "rule__Robot__Group_4_3__0__Impl"
    // InternalKinematics.g:588:1: rule__Robot__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Robot__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:592:1: ( ( ',' ) )
            // InternalKinematics.g:593:1: ( ',' )
            {
            // InternalKinematics.g:593:1: ( ',' )
            // InternalKinematics.g:594:2: ','
            {
             before(grammarAccess.getRobotAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4_3__0__Impl"


    // $ANTLR start "rule__Robot__Group_4_3__1"
    // InternalKinematics.g:603:1: rule__Robot__Group_4_3__1 : rule__Robot__Group_4_3__1__Impl ;
    public final void rule__Robot__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:607:1: ( rule__Robot__Group_4_3__1__Impl )
            // InternalKinematics.g:608:2: rule__Robot__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4_3__1"


    // $ANTLR start "rule__Robot__Group_4_3__1__Impl"
    // InternalKinematics.g:614:1: rule__Robot__Group_4_3__1__Impl : ( ( rule__Robot__RobotsAssignment_4_3_1 ) ) ;
    public final void rule__Robot__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:618:1: ( ( ( rule__Robot__RobotsAssignment_4_3_1 ) ) )
            // InternalKinematics.g:619:1: ( ( rule__Robot__RobotsAssignment_4_3_1 ) )
            {
            // InternalKinematics.g:619:1: ( ( rule__Robot__RobotsAssignment_4_3_1 ) )
            // InternalKinematics.g:620:2: ( rule__Robot__RobotsAssignment_4_3_1 )
            {
             before(grammarAccess.getRobotAccess().getRobotsAssignment_4_3_1()); 
            // InternalKinematics.g:621:2: ( rule__Robot__RobotsAssignment_4_3_1 )
            // InternalKinematics.g:621:3: rule__Robot__RobotsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Robot__RobotsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getRobotsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4_3__1__Impl"


    // $ANTLR start "rule__Robot__Group_5__0"
    // InternalKinematics.g:630:1: rule__Robot__Group_5__0 : rule__Robot__Group_5__0__Impl rule__Robot__Group_5__1 ;
    public final void rule__Robot__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:634:1: ( rule__Robot__Group_5__0__Impl rule__Robot__Group_5__1 )
            // InternalKinematics.g:635:2: rule__Robot__Group_5__0__Impl rule__Robot__Group_5__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalKinematics.g:642:1: rule__Robot__Group_5__0__Impl : ( 'prefix' ) ;
    public final void rule__Robot__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:646:1: ( ( 'prefix' ) )
            // InternalKinematics.g:647:1: ( 'prefix' )
            {
            // InternalKinematics.g:647:1: ( 'prefix' )
            // InternalKinematics.g:648:2: 'prefix'
            {
             before(grammarAccess.getRobotAccess().getPrefixKeyword_5_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getPrefixKeyword_5_0()); 

            }


            }

        }
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
    // InternalKinematics.g:657:1: rule__Robot__Group_5__1 : rule__Robot__Group_5__1__Impl ;
    public final void rule__Robot__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:661:1: ( rule__Robot__Group_5__1__Impl )
            // InternalKinematics.g:662:2: rule__Robot__Group_5__1__Impl
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
    // InternalKinematics.g:668:1: rule__Robot__Group_5__1__Impl : ( ( rule__Robot__PrefixAssignment_5_1 ) ) ;
    public final void rule__Robot__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:672:1: ( ( ( rule__Robot__PrefixAssignment_5_1 ) ) )
            // InternalKinematics.g:673:1: ( ( rule__Robot__PrefixAssignment_5_1 ) )
            {
            // InternalKinematics.g:673:1: ( ( rule__Robot__PrefixAssignment_5_1 ) )
            // InternalKinematics.g:674:2: ( rule__Robot__PrefixAssignment_5_1 )
            {
             before(grammarAccess.getRobotAccess().getPrefixAssignment_5_1()); 
            // InternalKinematics.g:675:2: ( rule__Robot__PrefixAssignment_5_1 )
            // InternalKinematics.g:675:3: rule__Robot__PrefixAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Robot__PrefixAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getPrefixAssignment_5_1()); 

            }


            }

        }
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
    // InternalKinematics.g:684:1: rule__Robot__Group_6__0 : rule__Robot__Group_6__0__Impl rule__Robot__Group_6__1 ;
    public final void rule__Robot__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:688:1: ( rule__Robot__Group_6__0__Impl rule__Robot__Group_6__1 )
            // InternalKinematics.g:689:2: rule__Robot__Group_6__0__Impl rule__Robot__Group_6__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalKinematics.g:696:1: rule__Robot__Group_6__0__Impl : ( 'root_link' ) ;
    public final void rule__Robot__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:700:1: ( ( 'root_link' ) )
            // InternalKinematics.g:701:1: ( 'root_link' )
            {
            // InternalKinematics.g:701:1: ( 'root_link' )
            // InternalKinematics.g:702:2: 'root_link'
            {
             before(grammarAccess.getRobotAccess().getRoot_linkKeyword_6_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getRoot_linkKeyword_6_0()); 

            }


            }

        }
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
    // InternalKinematics.g:711:1: rule__Robot__Group_6__1 : rule__Robot__Group_6__1__Impl ;
    public final void rule__Robot__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:715:1: ( rule__Robot__Group_6__1__Impl )
            // InternalKinematics.g:716:2: rule__Robot__Group_6__1__Impl
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
    // InternalKinematics.g:722:1: rule__Robot__Group_6__1__Impl : ( ( rule__Robot__Root_linkAssignment_6_1 ) ) ;
    public final void rule__Robot__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:726:1: ( ( ( rule__Robot__Root_linkAssignment_6_1 ) ) )
            // InternalKinematics.g:727:1: ( ( rule__Robot__Root_linkAssignment_6_1 ) )
            {
            // InternalKinematics.g:727:1: ( ( rule__Robot__Root_linkAssignment_6_1 ) )
            // InternalKinematics.g:728:2: ( rule__Robot__Root_linkAssignment_6_1 )
            {
             before(grammarAccess.getRobotAccess().getRoot_linkAssignment_6_1()); 
            // InternalKinematics.g:729:2: ( rule__Robot__Root_linkAssignment_6_1 )
            // InternalKinematics.g:729:3: rule__Robot__Root_linkAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Root_linkAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getRoot_linkAssignment_6_1()); 

            }


            }

        }
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
    // InternalKinematics.g:738:1: rule__Robot__Group_7__0 : rule__Robot__Group_7__0__Impl rule__Robot__Group_7__1 ;
    public final void rule__Robot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:742:1: ( rule__Robot__Group_7__0__Impl rule__Robot__Group_7__1 )
            // InternalKinematics.g:743:2: rule__Robot__Group_7__0__Impl rule__Robot__Group_7__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalKinematics.g:750:1: rule__Robot__Group_7__0__Impl : ( 'joints' ) ;
    public final void rule__Robot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:754:1: ( ( 'joints' ) )
            // InternalKinematics.g:755:1: ( 'joints' )
            {
            // InternalKinematics.g:755:1: ( 'joints' )
            // InternalKinematics.g:756:2: 'joints'
            {
             before(grammarAccess.getRobotAccess().getJointsKeyword_7_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getJointsKeyword_7_0()); 

            }


            }

        }
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
    // InternalKinematics.g:765:1: rule__Robot__Group_7__1 : rule__Robot__Group_7__1__Impl rule__Robot__Group_7__2 ;
    public final void rule__Robot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:769:1: ( rule__Robot__Group_7__1__Impl rule__Robot__Group_7__2 )
            // InternalKinematics.g:770:2: rule__Robot__Group_7__1__Impl rule__Robot__Group_7__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalKinematics.g:777:1: rule__Robot__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Robot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:781:1: ( ( '{' ) )
            // InternalKinematics.g:782:1: ( '{' )
            {
            // InternalKinematics.g:782:1: ( '{' )
            // InternalKinematics.g:783:2: '{'
            {
             before(grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalKinematics.g:792:1: rule__Robot__Group_7__2 : rule__Robot__Group_7__2__Impl rule__Robot__Group_7__3 ;
    public final void rule__Robot__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:796:1: ( rule__Robot__Group_7__2__Impl rule__Robot__Group_7__3 )
            // InternalKinematics.g:797:2: rule__Robot__Group_7__2__Impl rule__Robot__Group_7__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalKinematics.g:804:1: rule__Robot__Group_7__2__Impl : ( ( rule__Robot__JointsAssignment_7_2 ) ) ;
    public final void rule__Robot__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:808:1: ( ( ( rule__Robot__JointsAssignment_7_2 ) ) )
            // InternalKinematics.g:809:1: ( ( rule__Robot__JointsAssignment_7_2 ) )
            {
            // InternalKinematics.g:809:1: ( ( rule__Robot__JointsAssignment_7_2 ) )
            // InternalKinematics.g:810:2: ( rule__Robot__JointsAssignment_7_2 )
            {
             before(grammarAccess.getRobotAccess().getJointsAssignment_7_2()); 
            // InternalKinematics.g:811:2: ( rule__Robot__JointsAssignment_7_2 )
            // InternalKinematics.g:811:3: rule__Robot__JointsAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Robot__JointsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getJointsAssignment_7_2()); 

            }


            }

        }
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
    // InternalKinematics.g:819:1: rule__Robot__Group_7__3 : rule__Robot__Group_7__3__Impl rule__Robot__Group_7__4 ;
    public final void rule__Robot__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:823:1: ( rule__Robot__Group_7__3__Impl rule__Robot__Group_7__4 )
            // InternalKinematics.g:824:2: rule__Robot__Group_7__3__Impl rule__Robot__Group_7__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalKinematics.g:831:1: rule__Robot__Group_7__3__Impl : ( ( rule__Robot__Group_7_3__0 )* ) ;
    public final void rule__Robot__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:835:1: ( ( ( rule__Robot__Group_7_3__0 )* ) )
            // InternalKinematics.g:836:1: ( ( rule__Robot__Group_7_3__0 )* )
            {
            // InternalKinematics.g:836:1: ( ( rule__Robot__Group_7_3__0 )* )
            // InternalKinematics.g:837:2: ( rule__Robot__Group_7_3__0 )*
            {
             before(grammarAccess.getRobotAccess().getGroup_7_3()); 
            // InternalKinematics.g:838:2: ( rule__Robot__Group_7_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKinematics.g:838:3: rule__Robot__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Robot__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalKinematics.g:846:1: rule__Robot__Group_7__4 : rule__Robot__Group_7__4__Impl ;
    public final void rule__Robot__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:850:1: ( rule__Robot__Group_7__4__Impl )
            // InternalKinematics.g:851:2: rule__Robot__Group_7__4__Impl
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
    // InternalKinematics.g:857:1: rule__Robot__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Robot__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:861:1: ( ( '}' ) )
            // InternalKinematics.g:862:1: ( '}' )
            {
            // InternalKinematics.g:862:1: ( '}' )
            // InternalKinematics.g:863:2: '}'
            {
             before(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalKinematics.g:873:1: rule__Robot__Group_7_3__0 : rule__Robot__Group_7_3__0__Impl rule__Robot__Group_7_3__1 ;
    public final void rule__Robot__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:877:1: ( rule__Robot__Group_7_3__0__Impl rule__Robot__Group_7_3__1 )
            // InternalKinematics.g:878:2: rule__Robot__Group_7_3__0__Impl rule__Robot__Group_7_3__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalKinematics.g:885:1: rule__Robot__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Robot__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:889:1: ( ( ',' ) )
            // InternalKinematics.g:890:1: ( ',' )
            {
            // InternalKinematics.g:890:1: ( ',' )
            // InternalKinematics.g:891:2: ','
            {
             before(grammarAccess.getRobotAccess().getCommaKeyword_7_3_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalKinematics.g:900:1: rule__Robot__Group_7_3__1 : rule__Robot__Group_7_3__1__Impl ;
    public final void rule__Robot__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:904:1: ( rule__Robot__Group_7_3__1__Impl )
            // InternalKinematics.g:905:2: rule__Robot__Group_7_3__1__Impl
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
    // InternalKinematics.g:911:1: rule__Robot__Group_7_3__1__Impl : ( ( rule__Robot__JointsAssignment_7_3_1 ) ) ;
    public final void rule__Robot__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:915:1: ( ( ( rule__Robot__JointsAssignment_7_3_1 ) ) )
            // InternalKinematics.g:916:1: ( ( rule__Robot__JointsAssignment_7_3_1 ) )
            {
            // InternalKinematics.g:916:1: ( ( rule__Robot__JointsAssignment_7_3_1 ) )
            // InternalKinematics.g:917:2: ( rule__Robot__JointsAssignment_7_3_1 )
            {
             before(grammarAccess.getRobotAccess().getJointsAssignment_7_3_1()); 
            // InternalKinematics.g:918:2: ( rule__Robot__JointsAssignment_7_3_1 )
            // InternalKinematics.g:918:3: rule__Robot__JointsAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Robot__JointsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getJointsAssignment_7_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Ref_robot__Group__0"
    // InternalKinematics.g:927:1: rule__Ref_robot__Group__0 : rule__Ref_robot__Group__0__Impl rule__Ref_robot__Group__1 ;
    public final void rule__Ref_robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:931:1: ( rule__Ref_robot__Group__0__Impl rule__Ref_robot__Group__1 )
            // InternalKinematics.g:932:2: rule__Ref_robot__Group__0__Impl rule__Ref_robot__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Ref_robot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ref_robot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref_robot__Group__0"


    // $ANTLR start "rule__Ref_robot__Group__0__Impl"
    // InternalKinematics.g:939:1: rule__Ref_robot__Group__0__Impl : ( () ) ;
    public final void rule__Ref_robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:943:1: ( ( () ) )
            // InternalKinematics.g:944:1: ( () )
            {
            // InternalKinematics.g:944:1: ( () )
            // InternalKinematics.g:945:2: ()
            {
             before(grammarAccess.getRef_robotAccess().getRef_robotAction_0()); 
            // InternalKinematics.g:946:2: ()
            // InternalKinematics.g:946:3: 
            {
            }

             after(grammarAccess.getRef_robotAccess().getRef_robotAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref_robot__Group__0__Impl"


    // $ANTLR start "rule__Ref_robot__Group__1"
    // InternalKinematics.g:954:1: rule__Ref_robot__Group__1 : rule__Ref_robot__Group__1__Impl rule__Ref_robot__Group__2 ;
    public final void rule__Ref_robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:958:1: ( rule__Ref_robot__Group__1__Impl rule__Ref_robot__Group__2 )
            // InternalKinematics.g:959:2: rule__Ref_robot__Group__1__Impl rule__Ref_robot__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Ref_robot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ref_robot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref_robot__Group__1"


    // $ANTLR start "rule__Ref_robot__Group__1__Impl"
    // InternalKinematics.g:966:1: rule__Ref_robot__Group__1__Impl : ( 'ref_robot' ) ;
    public final void rule__Ref_robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:970:1: ( ( 'ref_robot' ) )
            // InternalKinematics.g:971:1: ( 'ref_robot' )
            {
            // InternalKinematics.g:971:1: ( 'ref_robot' )
            // InternalKinematics.g:972:2: 'ref_robot'
            {
             before(grammarAccess.getRef_robotAccess().getRef_robotKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRef_robotAccess().getRef_robotKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref_robot__Group__1__Impl"


    // $ANTLR start "rule__Ref_robot__Group__2"
    // InternalKinematics.g:981:1: rule__Ref_robot__Group__2 : rule__Ref_robot__Group__2__Impl rule__Ref_robot__Group__3 ;
    public final void rule__Ref_robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:985:1: ( rule__Ref_robot__Group__2__Impl rule__Ref_robot__Group__3 )
            // InternalKinematics.g:986:2: rule__Ref_robot__Group__2__Impl rule__Ref_robot__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Ref_robot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ref_robot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref_robot__Group__2"


    // $ANTLR start "rule__Ref_robot__Group__2__Impl"
    // InternalKinematics.g:993:1: rule__Ref_robot__Group__2__Impl : ( ( rule__Ref_robot__RobotAssignment_2 ) ) ;
    public final void rule__Ref_robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:997:1: ( ( ( rule__Ref_robot__RobotAssignment_2 ) ) )
            // InternalKinematics.g:998:1: ( ( rule__Ref_robot__RobotAssignment_2 ) )
            {
            // InternalKinematics.g:998:1: ( ( rule__Ref_robot__RobotAssignment_2 ) )
            // InternalKinematics.g:999:2: ( rule__Ref_robot__RobotAssignment_2 )
            {
             before(grammarAccess.getRef_robotAccess().getRobotAssignment_2()); 
            // InternalKinematics.g:1000:2: ( rule__Ref_robot__RobotAssignment_2 )
            // InternalKinematics.g:1000:3: rule__Ref_robot__RobotAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Ref_robot__RobotAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRef_robotAccess().getRobotAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref_robot__Group__2__Impl"


    // $ANTLR start "rule__Ref_robot__Group__3"
    // InternalKinematics.g:1008:1: rule__Ref_robot__Group__3 : rule__Ref_robot__Group__3__Impl rule__Ref_robot__Group__4 ;
    public final void rule__Ref_robot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1012:1: ( rule__Ref_robot__Group__3__Impl rule__Ref_robot__Group__4 )
            // InternalKinematics.g:1013:2: rule__Ref_robot__Group__3__Impl rule__Ref_robot__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Ref_robot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ref_robot__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref_robot__Group__3"


    // $ANTLR start "rule__Ref_robot__Group__3__Impl"
    // InternalKinematics.g:1020:1: rule__Ref_robot__Group__3__Impl : ( 'prefix' ) ;
    public final void rule__Ref_robot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1024:1: ( ( 'prefix' ) )
            // InternalKinematics.g:1025:1: ( 'prefix' )
            {
            // InternalKinematics.g:1025:1: ( 'prefix' )
            // InternalKinematics.g:1026:2: 'prefix'
            {
             before(grammarAccess.getRef_robotAccess().getPrefixKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRef_robotAccess().getPrefixKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref_robot__Group__3__Impl"


    // $ANTLR start "rule__Ref_robot__Group__4"
    // InternalKinematics.g:1035:1: rule__Ref_robot__Group__4 : rule__Ref_robot__Group__4__Impl ;
    public final void rule__Ref_robot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1039:1: ( rule__Ref_robot__Group__4__Impl )
            // InternalKinematics.g:1040:2: rule__Ref_robot__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ref_robot__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref_robot__Group__4"


    // $ANTLR start "rule__Ref_robot__Group__4__Impl"
    // InternalKinematics.g:1046:1: rule__Ref_robot__Group__4__Impl : ( ( rule__Ref_robot__PrefixAssignment_4 ) ) ;
    public final void rule__Ref_robot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1050:1: ( ( ( rule__Ref_robot__PrefixAssignment_4 ) ) )
            // InternalKinematics.g:1051:1: ( ( rule__Ref_robot__PrefixAssignment_4 ) )
            {
            // InternalKinematics.g:1051:1: ( ( rule__Ref_robot__PrefixAssignment_4 ) )
            // InternalKinematics.g:1052:2: ( rule__Ref_robot__PrefixAssignment_4 )
            {
             before(grammarAccess.getRef_robotAccess().getPrefixAssignment_4()); 
            // InternalKinematics.g:1053:2: ( rule__Ref_robot__PrefixAssignment_4 )
            // InternalKinematics.g:1053:3: rule__Ref_robot__PrefixAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Ref_robot__PrefixAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRef_robotAccess().getPrefixAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref_robot__Group__4__Impl"


    // $ANTLR start "rule__Link__Group__0"
    // InternalKinematics.g:1062:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1066:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalKinematics.g:1067:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalKinematics.g:1074:1: rule__Link__Group__0__Impl : ( () ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1078:1: ( ( () ) )
            // InternalKinematics.g:1079:1: ( () )
            {
            // InternalKinematics.g:1079:1: ( () )
            // InternalKinematics.g:1080:2: ()
            {
             before(grammarAccess.getLinkAccess().getLinkAction_0()); 
            // InternalKinematics.g:1081:2: ()
            // InternalKinematics.g:1081:3: 
            {
            }

             after(grammarAccess.getLinkAccess().getLinkAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0__Impl"


    // $ANTLR start "rule__Link__Group__1"
    // InternalKinematics.g:1089:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1093:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalKinematics.g:1094:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalKinematics.g:1101:1: rule__Link__Group__1__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1105:1: ( ( 'Link' ) )
            // InternalKinematics.g:1106:1: ( 'Link' )
            {
            // InternalKinematics.g:1106:1: ( 'Link' )
            // InternalKinematics.g:1107:2: 'Link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLinkKeyword_1()); 

            }


            }

        }
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
    // InternalKinematics.g:1116:1: rule__Link__Group__2 : rule__Link__Group__2__Impl ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1120:1: ( rule__Link__Group__2__Impl )
            // InternalKinematics.g:1121:2: rule__Link__Group__2__Impl
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
    // InternalKinematics.g:1127:1: rule__Link__Group__2__Impl : ( ( rule__Link__NameAssignment_2 ) ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1131:1: ( ( ( rule__Link__NameAssignment_2 ) ) )
            // InternalKinematics.g:1132:1: ( ( rule__Link__NameAssignment_2 ) )
            {
            // InternalKinematics.g:1132:1: ( ( rule__Link__NameAssignment_2 ) )
            // InternalKinematics.g:1133:2: ( rule__Link__NameAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_2()); 
            // InternalKinematics.g:1134:2: ( rule__Link__NameAssignment_2 )
            // InternalKinematics.g:1134:3: rule__Link__NameAssignment_2
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


    // $ANTLR start "rule__Joint__Group__0"
    // InternalKinematics.g:1143:1: rule__Joint__Group__0 : rule__Joint__Group__0__Impl rule__Joint__Group__1 ;
    public final void rule__Joint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1147:1: ( rule__Joint__Group__0__Impl rule__Joint__Group__1 )
            // InternalKinematics.g:1148:2: rule__Joint__Group__0__Impl rule__Joint__Group__1
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
    // InternalKinematics.g:1155:1: rule__Joint__Group__0__Impl : ( 'Joint' ) ;
    public final void rule__Joint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1159:1: ( ( 'Joint' ) )
            // InternalKinematics.g:1160:1: ( 'Joint' )
            {
            // InternalKinematics.g:1160:1: ( 'Joint' )
            // InternalKinematics.g:1161:2: 'Joint'
            {
             before(grammarAccess.getJointAccess().getJointKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalKinematics.g:1170:1: rule__Joint__Group__1 : rule__Joint__Group__1__Impl rule__Joint__Group__2 ;
    public final void rule__Joint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1174:1: ( rule__Joint__Group__1__Impl rule__Joint__Group__2 )
            // InternalKinematics.g:1175:2: rule__Joint__Group__1__Impl rule__Joint__Group__2
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
    // InternalKinematics.g:1182:1: rule__Joint__Group__1__Impl : ( ( rule__Joint__NameAssignment_1 ) ) ;
    public final void rule__Joint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1186:1: ( ( ( rule__Joint__NameAssignment_1 ) ) )
            // InternalKinematics.g:1187:1: ( ( rule__Joint__NameAssignment_1 ) )
            {
            // InternalKinematics.g:1187:1: ( ( rule__Joint__NameAssignment_1 ) )
            // InternalKinematics.g:1188:2: ( rule__Joint__NameAssignment_1 )
            {
             before(grammarAccess.getJointAccess().getNameAssignment_1()); 
            // InternalKinematics.g:1189:2: ( rule__Joint__NameAssignment_1 )
            // InternalKinematics.g:1189:3: rule__Joint__NameAssignment_1
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
    // InternalKinematics.g:1197:1: rule__Joint__Group__2 : rule__Joint__Group__2__Impl rule__Joint__Group__3 ;
    public final void rule__Joint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1201:1: ( rule__Joint__Group__2__Impl rule__Joint__Group__3 )
            // InternalKinematics.g:1202:2: rule__Joint__Group__2__Impl rule__Joint__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalKinematics.g:1209:1: rule__Joint__Group__2__Impl : ( '{' ) ;
    public final void rule__Joint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1213:1: ( ( '{' ) )
            // InternalKinematics.g:1214:1: ( '{' )
            {
            // InternalKinematics.g:1214:1: ( '{' )
            // InternalKinematics.g:1215:2: '{'
            {
             before(grammarAccess.getJointAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalKinematics.g:1224:1: rule__Joint__Group__3 : rule__Joint__Group__3__Impl rule__Joint__Group__4 ;
    public final void rule__Joint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1228:1: ( rule__Joint__Group__3__Impl rule__Joint__Group__4 )
            // InternalKinematics.g:1229:2: rule__Joint__Group__3__Impl rule__Joint__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalKinematics.g:1236:1: rule__Joint__Group__3__Impl : ( 'parent' ) ;
    public final void rule__Joint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1240:1: ( ( 'parent' ) )
            // InternalKinematics.g:1241:1: ( 'parent' )
            {
            // InternalKinematics.g:1241:1: ( 'parent' )
            // InternalKinematics.g:1242:2: 'parent'
            {
             before(grammarAccess.getJointAccess().getParentKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getParentKeyword_3()); 

            }


            }

        }
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
    // InternalKinematics.g:1251:1: rule__Joint__Group__4 : rule__Joint__Group__4__Impl rule__Joint__Group__5 ;
    public final void rule__Joint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1255:1: ( rule__Joint__Group__4__Impl rule__Joint__Group__5 )
            // InternalKinematics.g:1256:2: rule__Joint__Group__4__Impl rule__Joint__Group__5
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
    // InternalKinematics.g:1263:1: rule__Joint__Group__4__Impl : ( ( rule__Joint__ParentAssignment_4 ) ) ;
    public final void rule__Joint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1267:1: ( ( ( rule__Joint__ParentAssignment_4 ) ) )
            // InternalKinematics.g:1268:1: ( ( rule__Joint__ParentAssignment_4 ) )
            {
            // InternalKinematics.g:1268:1: ( ( rule__Joint__ParentAssignment_4 ) )
            // InternalKinematics.g:1269:2: ( rule__Joint__ParentAssignment_4 )
            {
             before(grammarAccess.getJointAccess().getParentAssignment_4()); 
            // InternalKinematics.g:1270:2: ( rule__Joint__ParentAssignment_4 )
            // InternalKinematics.g:1270:3: rule__Joint__ParentAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ParentAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getParentAssignment_4()); 

            }


            }

        }
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
    // InternalKinematics.g:1278:1: rule__Joint__Group__5 : rule__Joint__Group__5__Impl rule__Joint__Group__6 ;
    public final void rule__Joint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1282:1: ( rule__Joint__Group__5__Impl rule__Joint__Group__6 )
            // InternalKinematics.g:1283:2: rule__Joint__Group__5__Impl rule__Joint__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalKinematics.g:1290:1: rule__Joint__Group__5__Impl : ( 'child' ) ;
    public final void rule__Joint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1294:1: ( ( 'child' ) )
            // InternalKinematics.g:1295:1: ( 'child' )
            {
            // InternalKinematics.g:1295:1: ( 'child' )
            // InternalKinematics.g:1296:2: 'child'
            {
             before(grammarAccess.getJointAccess().getChildKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getChildKeyword_5()); 

            }


            }

        }
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
    // InternalKinematics.g:1305:1: rule__Joint__Group__6 : rule__Joint__Group__6__Impl rule__Joint__Group__7 ;
    public final void rule__Joint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1309:1: ( rule__Joint__Group__6__Impl rule__Joint__Group__7 )
            // InternalKinematics.g:1310:2: rule__Joint__Group__6__Impl rule__Joint__Group__7
            {
            pushFollow(FOLLOW_15);
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
    // InternalKinematics.g:1317:1: rule__Joint__Group__6__Impl : ( ( rule__Joint__ChildAssignment_6 ) ) ;
    public final void rule__Joint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1321:1: ( ( ( rule__Joint__ChildAssignment_6 ) ) )
            // InternalKinematics.g:1322:1: ( ( rule__Joint__ChildAssignment_6 ) )
            {
            // InternalKinematics.g:1322:1: ( ( rule__Joint__ChildAssignment_6 ) )
            // InternalKinematics.g:1323:2: ( rule__Joint__ChildAssignment_6 )
            {
             before(grammarAccess.getJointAccess().getChildAssignment_6()); 
            // InternalKinematics.g:1324:2: ( rule__Joint__ChildAssignment_6 )
            // InternalKinematics.g:1324:3: rule__Joint__ChildAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ChildAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getChildAssignment_6()); 

            }


            }

        }
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
    // InternalKinematics.g:1332:1: rule__Joint__Group__7 : rule__Joint__Group__7__Impl ;
    public final void rule__Joint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1336:1: ( rule__Joint__Group__7__Impl )
            // InternalKinematics.g:1337:2: rule__Joint__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalKinematics.g:1343:1: rule__Joint__Group__7__Impl : ( '}' ) ;
    public final void rule__Joint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1347:1: ( ( '}' ) )
            // InternalKinematics.g:1348:1: ( '}' )
            {
            // InternalKinematics.g:1348:1: ( '}' )
            // InternalKinematics.g:1349:2: '}'
            {
             before(grammarAccess.getJointAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Robot__NameAssignment_2"
    // InternalKinematics.g:1359:1: rule__Robot__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Robot__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1363:1: ( ( ruleEString ) )
            // InternalKinematics.g:1364:2: ( ruleEString )
            {
            // InternalKinematics.g:1364:2: ( ruleEString )
            // InternalKinematics.g:1365:3: ruleEString
            {
             before(grammarAccess.getRobotAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__NameAssignment_2"


    // $ANTLR start "rule__Robot__RobotsAssignment_4_2"
    // InternalKinematics.g:1374:1: rule__Robot__RobotsAssignment_4_2 : ( ruleref_robot ) ;
    public final void rule__Robot__RobotsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1378:1: ( ( ruleref_robot ) )
            // InternalKinematics.g:1379:2: ( ruleref_robot )
            {
            // InternalKinematics.g:1379:2: ( ruleref_robot )
            // InternalKinematics.g:1380:3: ruleref_robot
            {
             before(grammarAccess.getRobotAccess().getRobotsRef_robotParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleref_robot();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getRobotsRef_robotParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__RobotsAssignment_4_2"


    // $ANTLR start "rule__Robot__RobotsAssignment_4_3_1"
    // InternalKinematics.g:1389:1: rule__Robot__RobotsAssignment_4_3_1 : ( ruleref_robot ) ;
    public final void rule__Robot__RobotsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1393:1: ( ( ruleref_robot ) )
            // InternalKinematics.g:1394:2: ( ruleref_robot )
            {
            // InternalKinematics.g:1394:2: ( ruleref_robot )
            // InternalKinematics.g:1395:3: ruleref_robot
            {
             before(grammarAccess.getRobotAccess().getRobotsRef_robotParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleref_robot();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getRobotsRef_robotParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__RobotsAssignment_4_3_1"


    // $ANTLR start "rule__Robot__PrefixAssignment_5_1"
    // InternalKinematics.g:1404:1: rule__Robot__PrefixAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Robot__PrefixAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1408:1: ( ( ruleEString ) )
            // InternalKinematics.g:1409:2: ( ruleEString )
            {
            // InternalKinematics.g:1409:2: ( ruleEString )
            // InternalKinematics.g:1410:3: ruleEString
            {
             before(grammarAccess.getRobotAccess().getPrefixEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getPrefixEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__PrefixAssignment_5_1"


    // $ANTLR start "rule__Robot__Root_linkAssignment_6_1"
    // InternalKinematics.g:1419:1: rule__Robot__Root_linkAssignment_6_1 : ( ruleLink ) ;
    public final void rule__Robot__Root_linkAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1423:1: ( ( ruleLink ) )
            // InternalKinematics.g:1424:2: ( ruleLink )
            {
            // InternalKinematics.g:1424:2: ( ruleLink )
            // InternalKinematics.g:1425:3: ruleLink
            {
             before(grammarAccess.getRobotAccess().getRoot_linkLinkParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getRoot_linkLinkParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Root_linkAssignment_6_1"


    // $ANTLR start "rule__Robot__JointsAssignment_7_2"
    // InternalKinematics.g:1434:1: rule__Robot__JointsAssignment_7_2 : ( ruleJoint ) ;
    public final void rule__Robot__JointsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1438:1: ( ( ruleJoint ) )
            // InternalKinematics.g:1439:2: ( ruleJoint )
            {
            // InternalKinematics.g:1439:2: ( ruleJoint )
            // InternalKinematics.g:1440:3: ruleJoint
            {
             before(grammarAccess.getRobotAccess().getJointsJointParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getJointsJointParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__JointsAssignment_7_2"


    // $ANTLR start "rule__Robot__JointsAssignment_7_3_1"
    // InternalKinematics.g:1449:1: rule__Robot__JointsAssignment_7_3_1 : ( ruleJoint ) ;
    public final void rule__Robot__JointsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1453:1: ( ( ruleJoint ) )
            // InternalKinematics.g:1454:2: ( ruleJoint )
            {
            // InternalKinematics.g:1454:2: ( ruleJoint )
            // InternalKinematics.g:1455:3: ruleJoint
            {
             before(grammarAccess.getRobotAccess().getJointsJointParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getJointsJointParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__JointsAssignment_7_3_1"


    // $ANTLR start "rule__Ref_robot__RobotAssignment_2"
    // InternalKinematics.g:1464:1: rule__Ref_robot__RobotAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Ref_robot__RobotAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1468:1: ( ( ( ruleEString ) ) )
            // InternalKinematics.g:1469:2: ( ( ruleEString ) )
            {
            // InternalKinematics.g:1469:2: ( ( ruleEString ) )
            // InternalKinematics.g:1470:3: ( ruleEString )
            {
             before(grammarAccess.getRef_robotAccess().getRobotRobotCrossReference_2_0()); 
            // InternalKinematics.g:1471:3: ( ruleEString )
            // InternalKinematics.g:1472:4: ruleEString
            {
             before(grammarAccess.getRef_robotAccess().getRobotRobotEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRef_robotAccess().getRobotRobotEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRef_robotAccess().getRobotRobotCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref_robot__RobotAssignment_2"


    // $ANTLR start "rule__Ref_robot__PrefixAssignment_4"
    // InternalKinematics.g:1483:1: rule__Ref_robot__PrefixAssignment_4 : ( ruleEString ) ;
    public final void rule__Ref_robot__PrefixAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1487:1: ( ( ruleEString ) )
            // InternalKinematics.g:1488:2: ( ruleEString )
            {
            // InternalKinematics.g:1488:2: ( ruleEString )
            // InternalKinematics.g:1489:3: ruleEString
            {
             before(grammarAccess.getRef_robotAccess().getPrefixEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRef_robotAccess().getPrefixEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref_robot__PrefixAssignment_4"


    // $ANTLR start "rule__Link__NameAssignment_2"
    // InternalKinematics.g:1498:1: rule__Link__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Link__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1502:1: ( ( ruleEString ) )
            // InternalKinematics.g:1503:2: ( ruleEString )
            {
            // InternalKinematics.g:1503:2: ( ruleEString )
            // InternalKinematics.g:1504:3: ruleEString
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


    // $ANTLR start "rule__Joint__NameAssignment_1"
    // InternalKinematics.g:1513:1: rule__Joint__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Joint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1517:1: ( ( ruleEString ) )
            // InternalKinematics.g:1518:2: ( ruleEString )
            {
            // InternalKinematics.g:1518:2: ( ruleEString )
            // InternalKinematics.g:1519:3: ruleEString
            {
             before(grammarAccess.getJointAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJointAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Joint__ParentAssignment_4"
    // InternalKinematics.g:1528:1: rule__Joint__ParentAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Joint__ParentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1532:1: ( ( ( ruleEString ) ) )
            // InternalKinematics.g:1533:2: ( ( ruleEString ) )
            {
            // InternalKinematics.g:1533:2: ( ( ruleEString ) )
            // InternalKinematics.g:1534:3: ( ruleEString )
            {
             before(grammarAccess.getJointAccess().getParentLinkCrossReference_4_0()); 
            // InternalKinematics.g:1535:3: ( ruleEString )
            // InternalKinematics.g:1536:4: ruleEString
            {
             before(grammarAccess.getJointAccess().getParentLinkEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJointAccess().getParentLinkEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getJointAccess().getParentLinkCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__ParentAssignment_4"


    // $ANTLR start "rule__Joint__ChildAssignment_6"
    // InternalKinematics.g:1547:1: rule__Joint__ChildAssignment_6 : ( ruleLink ) ;
    public final void rule__Joint__ChildAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1551:1: ( ( ruleLink ) )
            // InternalKinematics.g:1552:2: ( ruleLink )
            {
            // InternalKinematics.g:1552:2: ( ruleLink )
            // InternalKinematics.g:1553:3: ruleLink
            {
             before(grammarAccess.getJointAccess().getChildLinkParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getJointAccess().getChildLinkParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__ChildAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000076000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002000L});

}