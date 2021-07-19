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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'robot'", "'{'", "'prefix'", "'}'", "'root_link'", "'joints'", "','", "'Link'", "'Joint'", "'parent'", "'child'"
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


    // $ANTLR start "entryRuleLink"
    // InternalKinematics.g:78:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalKinematics.g:79:1: ( ruleLink EOF )
            // InternalKinematics.g:80:1: ruleLink EOF
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
    // InternalKinematics.g:87:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:91:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalKinematics.g:92:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalKinematics.g:92:2: ( ( rule__Link__Group__0 ) )
            // InternalKinematics.g:93:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalKinematics.g:94:3: ( rule__Link__Group__0 )
            // InternalKinematics.g:94:4: rule__Link__Group__0
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
    // InternalKinematics.g:103:1: entryRuleJoint : ruleJoint EOF ;
    public final void entryRuleJoint() throws RecognitionException {
        try {
            // InternalKinematics.g:104:1: ( ruleJoint EOF )
            // InternalKinematics.g:105:1: ruleJoint EOF
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
    // InternalKinematics.g:112:1: ruleJoint : ( ( rule__Joint__Group__0 ) ) ;
    public final void ruleJoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:116:2: ( ( ( rule__Joint__Group__0 ) ) )
            // InternalKinematics.g:117:2: ( ( rule__Joint__Group__0 ) )
            {
            // InternalKinematics.g:117:2: ( ( rule__Joint__Group__0 ) )
            // InternalKinematics.g:118:3: ( rule__Joint__Group__0 )
            {
             before(grammarAccess.getJointAccess().getGroup()); 
            // InternalKinematics.g:119:3: ( rule__Joint__Group__0 )
            // InternalKinematics.g:119:4: rule__Joint__Group__0
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
    // InternalKinematics.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalKinematics.g:129:1: ( ruleEString EOF )
            // InternalKinematics.g:130:1: ruleEString EOF
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
    // InternalKinematics.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalKinematics.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalKinematics.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalKinematics.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalKinematics.g:144:3: ( rule__EString__Alternatives )
            // InternalKinematics.g:144:4: rule__EString__Alternatives
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
    // InternalKinematics.g:152:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:156:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalKinematics.g:157:2: ( RULE_STRING )
                    {
                    // InternalKinematics.g:157:2: ( RULE_STRING )
                    // InternalKinematics.g:158:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKinematics.g:163:2: ( RULE_ID )
                    {
                    // InternalKinematics.g:163:2: ( RULE_ID )
                    // InternalKinematics.g:164:3: RULE_ID
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
    // InternalKinematics.g:173:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:177:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalKinematics.g:178:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
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
    // InternalKinematics.g:185:1: rule__Robot__Group__0__Impl : ( () ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:189:1: ( ( () ) )
            // InternalKinematics.g:190:1: ( () )
            {
            // InternalKinematics.g:190:1: ( () )
            // InternalKinematics.g:191:2: ()
            {
             before(grammarAccess.getRobotAccess().getRobotAction_0()); 
            // InternalKinematics.g:192:2: ()
            // InternalKinematics.g:192:3: 
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
    // InternalKinematics.g:200:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:204:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalKinematics.g:205:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
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
    // InternalKinematics.g:212:1: rule__Robot__Group__1__Impl : ( 'robot' ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:216:1: ( ( 'robot' ) )
            // InternalKinematics.g:217:1: ( 'robot' )
            {
            // InternalKinematics.g:217:1: ( 'robot' )
            // InternalKinematics.g:218:2: 'robot'
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
    // InternalKinematics.g:227:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl rule__Robot__Group__3 ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:231:1: ( rule__Robot__Group__2__Impl rule__Robot__Group__3 )
            // InternalKinematics.g:232:2: rule__Robot__Group__2__Impl rule__Robot__Group__3
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
    // InternalKinematics.g:239:1: rule__Robot__Group__2__Impl : ( ( rule__Robot__NameAssignment_2 ) ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:243:1: ( ( ( rule__Robot__NameAssignment_2 ) ) )
            // InternalKinematics.g:244:1: ( ( rule__Robot__NameAssignment_2 ) )
            {
            // InternalKinematics.g:244:1: ( ( rule__Robot__NameAssignment_2 ) )
            // InternalKinematics.g:245:2: ( rule__Robot__NameAssignment_2 )
            {
             before(grammarAccess.getRobotAccess().getNameAssignment_2()); 
            // InternalKinematics.g:246:2: ( rule__Robot__NameAssignment_2 )
            // InternalKinematics.g:246:3: rule__Robot__NameAssignment_2
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
    // InternalKinematics.g:254:1: rule__Robot__Group__3 : rule__Robot__Group__3__Impl rule__Robot__Group__4 ;
    public final void rule__Robot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:258:1: ( rule__Robot__Group__3__Impl rule__Robot__Group__4 )
            // InternalKinematics.g:259:2: rule__Robot__Group__3__Impl rule__Robot__Group__4
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
    // InternalKinematics.g:266:1: rule__Robot__Group__3__Impl : ( '{' ) ;
    public final void rule__Robot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:270:1: ( ( '{' ) )
            // InternalKinematics.g:271:1: ( '{' )
            {
            // InternalKinematics.g:271:1: ( '{' )
            // InternalKinematics.g:272:2: '{'
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
    // InternalKinematics.g:281:1: rule__Robot__Group__4 : rule__Robot__Group__4__Impl rule__Robot__Group__5 ;
    public final void rule__Robot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:285:1: ( rule__Robot__Group__4__Impl rule__Robot__Group__5 )
            // InternalKinematics.g:286:2: rule__Robot__Group__4__Impl rule__Robot__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalKinematics.g:293:1: rule__Robot__Group__4__Impl : ( 'prefix' ) ;
    public final void rule__Robot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:297:1: ( ( 'prefix' ) )
            // InternalKinematics.g:298:1: ( 'prefix' )
            {
            // InternalKinematics.g:298:1: ( 'prefix' )
            // InternalKinematics.g:299:2: 'prefix'
            {
             before(grammarAccess.getRobotAccess().getPrefixKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getPrefixKeyword_4()); 

            }


            }

        }
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
    // InternalKinematics.g:308:1: rule__Robot__Group__5 : rule__Robot__Group__5__Impl rule__Robot__Group__6 ;
    public final void rule__Robot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:312:1: ( rule__Robot__Group__5__Impl rule__Robot__Group__6 )
            // InternalKinematics.g:313:2: rule__Robot__Group__5__Impl rule__Robot__Group__6
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
    // InternalKinematics.g:320:1: rule__Robot__Group__5__Impl : ( ( rule__Robot__PrefixAssignment_5 ) ) ;
    public final void rule__Robot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:324:1: ( ( ( rule__Robot__PrefixAssignment_5 ) ) )
            // InternalKinematics.g:325:1: ( ( rule__Robot__PrefixAssignment_5 ) )
            {
            // InternalKinematics.g:325:1: ( ( rule__Robot__PrefixAssignment_5 ) )
            // InternalKinematics.g:326:2: ( rule__Robot__PrefixAssignment_5 )
            {
             before(grammarAccess.getRobotAccess().getPrefixAssignment_5()); 
            // InternalKinematics.g:327:2: ( rule__Robot__PrefixAssignment_5 )
            // InternalKinematics.g:327:3: rule__Robot__PrefixAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Robot__PrefixAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getPrefixAssignment_5()); 

            }


            }

        }
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
    // InternalKinematics.g:335:1: rule__Robot__Group__6 : rule__Robot__Group__6__Impl rule__Robot__Group__7 ;
    public final void rule__Robot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:339:1: ( rule__Robot__Group__6__Impl rule__Robot__Group__7 )
            // InternalKinematics.g:340:2: rule__Robot__Group__6__Impl rule__Robot__Group__7
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
    // InternalKinematics.g:347:1: rule__Robot__Group__6__Impl : ( ( rule__Robot__Group_6__0 )? ) ;
    public final void rule__Robot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:351:1: ( ( ( rule__Robot__Group_6__0 )? ) )
            // InternalKinematics.g:352:1: ( ( rule__Robot__Group_6__0 )? )
            {
            // InternalKinematics.g:352:1: ( ( rule__Robot__Group_6__0 )? )
            // InternalKinematics.g:353:2: ( rule__Robot__Group_6__0 )?
            {
             before(grammarAccess.getRobotAccess().getGroup_6()); 
            // InternalKinematics.g:354:2: ( rule__Robot__Group_6__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKinematics.g:354:3: rule__Robot__Group_6__0
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
    // InternalKinematics.g:362:1: rule__Robot__Group__7 : rule__Robot__Group__7__Impl rule__Robot__Group__8 ;
    public final void rule__Robot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:366:1: ( rule__Robot__Group__7__Impl rule__Robot__Group__8 )
            // InternalKinematics.g:367:2: rule__Robot__Group__7__Impl rule__Robot__Group__8
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
    // InternalKinematics.g:374:1: rule__Robot__Group__7__Impl : ( ( rule__Robot__Group_7__0 )? ) ;
    public final void rule__Robot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:378:1: ( ( ( rule__Robot__Group_7__0 )? ) )
            // InternalKinematics.g:379:1: ( ( rule__Robot__Group_7__0 )? )
            {
            // InternalKinematics.g:379:1: ( ( rule__Robot__Group_7__0 )? )
            // InternalKinematics.g:380:2: ( rule__Robot__Group_7__0 )?
            {
             before(grammarAccess.getRobotAccess().getGroup_7()); 
            // InternalKinematics.g:381:2: ( rule__Robot__Group_7__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKinematics.g:381:3: rule__Robot__Group_7__0
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
    // InternalKinematics.g:389:1: rule__Robot__Group__8 : rule__Robot__Group__8__Impl ;
    public final void rule__Robot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:393:1: ( rule__Robot__Group__8__Impl )
            // InternalKinematics.g:394:2: rule__Robot__Group__8__Impl
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
    // InternalKinematics.g:400:1: rule__Robot__Group__8__Impl : ( '}' ) ;
    public final void rule__Robot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:404:1: ( ( '}' ) )
            // InternalKinematics.g:405:1: ( '}' )
            {
            // InternalKinematics.g:405:1: ( '}' )
            // InternalKinematics.g:406:2: '}'
            {
             before(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_2); 
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


    // $ANTLR start "rule__Robot__Group_6__0"
    // InternalKinematics.g:416:1: rule__Robot__Group_6__0 : rule__Robot__Group_6__0__Impl rule__Robot__Group_6__1 ;
    public final void rule__Robot__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:420:1: ( rule__Robot__Group_6__0__Impl rule__Robot__Group_6__1 )
            // InternalKinematics.g:421:2: rule__Robot__Group_6__0__Impl rule__Robot__Group_6__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalKinematics.g:428:1: rule__Robot__Group_6__0__Impl : ( 'root_link' ) ;
    public final void rule__Robot__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:432:1: ( ( 'root_link' ) )
            // InternalKinematics.g:433:1: ( 'root_link' )
            {
            // InternalKinematics.g:433:1: ( 'root_link' )
            // InternalKinematics.g:434:2: 'root_link'
            {
             before(grammarAccess.getRobotAccess().getRoot_linkKeyword_6_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalKinematics.g:443:1: rule__Robot__Group_6__1 : rule__Robot__Group_6__1__Impl ;
    public final void rule__Robot__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:447:1: ( rule__Robot__Group_6__1__Impl )
            // InternalKinematics.g:448:2: rule__Robot__Group_6__1__Impl
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
    // InternalKinematics.g:454:1: rule__Robot__Group_6__1__Impl : ( ( rule__Robot__Root_linkAssignment_6_1 ) ) ;
    public final void rule__Robot__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:458:1: ( ( ( rule__Robot__Root_linkAssignment_6_1 ) ) )
            // InternalKinematics.g:459:1: ( ( rule__Robot__Root_linkAssignment_6_1 ) )
            {
            // InternalKinematics.g:459:1: ( ( rule__Robot__Root_linkAssignment_6_1 ) )
            // InternalKinematics.g:460:2: ( rule__Robot__Root_linkAssignment_6_1 )
            {
             before(grammarAccess.getRobotAccess().getRoot_linkAssignment_6_1()); 
            // InternalKinematics.g:461:2: ( rule__Robot__Root_linkAssignment_6_1 )
            // InternalKinematics.g:461:3: rule__Robot__Root_linkAssignment_6_1
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
    // InternalKinematics.g:470:1: rule__Robot__Group_7__0 : rule__Robot__Group_7__0__Impl rule__Robot__Group_7__1 ;
    public final void rule__Robot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:474:1: ( rule__Robot__Group_7__0__Impl rule__Robot__Group_7__1 )
            // InternalKinematics.g:475:2: rule__Robot__Group_7__0__Impl rule__Robot__Group_7__1
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
    // InternalKinematics.g:482:1: rule__Robot__Group_7__0__Impl : ( 'joints' ) ;
    public final void rule__Robot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:486:1: ( ( 'joints' ) )
            // InternalKinematics.g:487:1: ( 'joints' )
            {
            // InternalKinematics.g:487:1: ( 'joints' )
            // InternalKinematics.g:488:2: 'joints'
            {
             before(grammarAccess.getRobotAccess().getJointsKeyword_7_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalKinematics.g:497:1: rule__Robot__Group_7__1 : rule__Robot__Group_7__1__Impl rule__Robot__Group_7__2 ;
    public final void rule__Robot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:501:1: ( rule__Robot__Group_7__1__Impl rule__Robot__Group_7__2 )
            // InternalKinematics.g:502:2: rule__Robot__Group_7__1__Impl rule__Robot__Group_7__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalKinematics.g:509:1: rule__Robot__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Robot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:513:1: ( ( '{' ) )
            // InternalKinematics.g:514:1: ( '{' )
            {
            // InternalKinematics.g:514:1: ( '{' )
            // InternalKinematics.g:515:2: '{'
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
    // InternalKinematics.g:524:1: rule__Robot__Group_7__2 : rule__Robot__Group_7__2__Impl rule__Robot__Group_7__3 ;
    public final void rule__Robot__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:528:1: ( rule__Robot__Group_7__2__Impl rule__Robot__Group_7__3 )
            // InternalKinematics.g:529:2: rule__Robot__Group_7__2__Impl rule__Robot__Group_7__3
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
    // InternalKinematics.g:536:1: rule__Robot__Group_7__2__Impl : ( ( rule__Robot__JointsAssignment_7_2 ) ) ;
    public final void rule__Robot__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:540:1: ( ( ( rule__Robot__JointsAssignment_7_2 ) ) )
            // InternalKinematics.g:541:1: ( ( rule__Robot__JointsAssignment_7_2 ) )
            {
            // InternalKinematics.g:541:1: ( ( rule__Robot__JointsAssignment_7_2 ) )
            // InternalKinematics.g:542:2: ( rule__Robot__JointsAssignment_7_2 )
            {
             before(grammarAccess.getRobotAccess().getJointsAssignment_7_2()); 
            // InternalKinematics.g:543:2: ( rule__Robot__JointsAssignment_7_2 )
            // InternalKinematics.g:543:3: rule__Robot__JointsAssignment_7_2
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
    // InternalKinematics.g:551:1: rule__Robot__Group_7__3 : rule__Robot__Group_7__3__Impl rule__Robot__Group_7__4 ;
    public final void rule__Robot__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:555:1: ( rule__Robot__Group_7__3__Impl rule__Robot__Group_7__4 )
            // InternalKinematics.g:556:2: rule__Robot__Group_7__3__Impl rule__Robot__Group_7__4
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
    // InternalKinematics.g:563:1: rule__Robot__Group_7__3__Impl : ( ( rule__Robot__Group_7_3__0 )* ) ;
    public final void rule__Robot__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:567:1: ( ( ( rule__Robot__Group_7_3__0 )* ) )
            // InternalKinematics.g:568:1: ( ( rule__Robot__Group_7_3__0 )* )
            {
            // InternalKinematics.g:568:1: ( ( rule__Robot__Group_7_3__0 )* )
            // InternalKinematics.g:569:2: ( rule__Robot__Group_7_3__0 )*
            {
             before(grammarAccess.getRobotAccess().getGroup_7_3()); 
            // InternalKinematics.g:570:2: ( rule__Robot__Group_7_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKinematics.g:570:3: rule__Robot__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Robot__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalKinematics.g:578:1: rule__Robot__Group_7__4 : rule__Robot__Group_7__4__Impl ;
    public final void rule__Robot__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:582:1: ( rule__Robot__Group_7__4__Impl )
            // InternalKinematics.g:583:2: rule__Robot__Group_7__4__Impl
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
    // InternalKinematics.g:589:1: rule__Robot__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Robot__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:593:1: ( ( '}' ) )
            // InternalKinematics.g:594:1: ( '}' )
            {
            // InternalKinematics.g:594:1: ( '}' )
            // InternalKinematics.g:595:2: '}'
            {
             before(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,14,FOLLOW_2); 
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
    // InternalKinematics.g:605:1: rule__Robot__Group_7_3__0 : rule__Robot__Group_7_3__0__Impl rule__Robot__Group_7_3__1 ;
    public final void rule__Robot__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:609:1: ( rule__Robot__Group_7_3__0__Impl rule__Robot__Group_7_3__1 )
            // InternalKinematics.g:610:2: rule__Robot__Group_7_3__0__Impl rule__Robot__Group_7_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalKinematics.g:617:1: rule__Robot__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Robot__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:621:1: ( ( ',' ) )
            // InternalKinematics.g:622:1: ( ',' )
            {
            // InternalKinematics.g:622:1: ( ',' )
            // InternalKinematics.g:623:2: ','
            {
             before(grammarAccess.getRobotAccess().getCommaKeyword_7_3_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalKinematics.g:632:1: rule__Robot__Group_7_3__1 : rule__Robot__Group_7_3__1__Impl ;
    public final void rule__Robot__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:636:1: ( rule__Robot__Group_7_3__1__Impl )
            // InternalKinematics.g:637:2: rule__Robot__Group_7_3__1__Impl
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
    // InternalKinematics.g:643:1: rule__Robot__Group_7_3__1__Impl : ( ( rule__Robot__JointsAssignment_7_3_1 ) ) ;
    public final void rule__Robot__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:647:1: ( ( ( rule__Robot__JointsAssignment_7_3_1 ) ) )
            // InternalKinematics.g:648:1: ( ( rule__Robot__JointsAssignment_7_3_1 ) )
            {
            // InternalKinematics.g:648:1: ( ( rule__Robot__JointsAssignment_7_3_1 ) )
            // InternalKinematics.g:649:2: ( rule__Robot__JointsAssignment_7_3_1 )
            {
             before(grammarAccess.getRobotAccess().getJointsAssignment_7_3_1()); 
            // InternalKinematics.g:650:2: ( rule__Robot__JointsAssignment_7_3_1 )
            // InternalKinematics.g:650:3: rule__Robot__JointsAssignment_7_3_1
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


    // $ANTLR start "rule__Link__Group__0"
    // InternalKinematics.g:659:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:663:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalKinematics.g:664:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalKinematics.g:671:1: rule__Link__Group__0__Impl : ( () ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:675:1: ( ( () ) )
            // InternalKinematics.g:676:1: ( () )
            {
            // InternalKinematics.g:676:1: ( () )
            // InternalKinematics.g:677:2: ()
            {
             before(grammarAccess.getLinkAccess().getLinkAction_0()); 
            // InternalKinematics.g:678:2: ()
            // InternalKinematics.g:678:3: 
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
    // InternalKinematics.g:686:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:690:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalKinematics.g:691:2: rule__Link__Group__1__Impl rule__Link__Group__2
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
    // InternalKinematics.g:698:1: rule__Link__Group__1__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:702:1: ( ( 'Link' ) )
            // InternalKinematics.g:703:1: ( 'Link' )
            {
            // InternalKinematics.g:703:1: ( 'Link' )
            // InternalKinematics.g:704:2: 'Link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalKinematics.g:713:1: rule__Link__Group__2 : rule__Link__Group__2__Impl ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:717:1: ( rule__Link__Group__2__Impl )
            // InternalKinematics.g:718:2: rule__Link__Group__2__Impl
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
    // InternalKinematics.g:724:1: rule__Link__Group__2__Impl : ( ( rule__Link__NameAssignment_2 ) ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:728:1: ( ( ( rule__Link__NameAssignment_2 ) ) )
            // InternalKinematics.g:729:1: ( ( rule__Link__NameAssignment_2 ) )
            {
            // InternalKinematics.g:729:1: ( ( rule__Link__NameAssignment_2 ) )
            // InternalKinematics.g:730:2: ( rule__Link__NameAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_2()); 
            // InternalKinematics.g:731:2: ( rule__Link__NameAssignment_2 )
            // InternalKinematics.g:731:3: rule__Link__NameAssignment_2
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
    // InternalKinematics.g:740:1: rule__Joint__Group__0 : rule__Joint__Group__0__Impl rule__Joint__Group__1 ;
    public final void rule__Joint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:744:1: ( rule__Joint__Group__0__Impl rule__Joint__Group__1 )
            // InternalKinematics.g:745:2: rule__Joint__Group__0__Impl rule__Joint__Group__1
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
    // InternalKinematics.g:752:1: rule__Joint__Group__0__Impl : ( 'Joint' ) ;
    public final void rule__Joint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:756:1: ( ( 'Joint' ) )
            // InternalKinematics.g:757:1: ( 'Joint' )
            {
            // InternalKinematics.g:757:1: ( 'Joint' )
            // InternalKinematics.g:758:2: 'Joint'
            {
             before(grammarAccess.getJointAccess().getJointKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalKinematics.g:767:1: rule__Joint__Group__1 : rule__Joint__Group__1__Impl rule__Joint__Group__2 ;
    public final void rule__Joint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:771:1: ( rule__Joint__Group__1__Impl rule__Joint__Group__2 )
            // InternalKinematics.g:772:2: rule__Joint__Group__1__Impl rule__Joint__Group__2
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
    // InternalKinematics.g:779:1: rule__Joint__Group__1__Impl : ( ( rule__Joint__NameAssignment_1 ) ) ;
    public final void rule__Joint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:783:1: ( ( ( rule__Joint__NameAssignment_1 ) ) )
            // InternalKinematics.g:784:1: ( ( rule__Joint__NameAssignment_1 ) )
            {
            // InternalKinematics.g:784:1: ( ( rule__Joint__NameAssignment_1 ) )
            // InternalKinematics.g:785:2: ( rule__Joint__NameAssignment_1 )
            {
             before(grammarAccess.getJointAccess().getNameAssignment_1()); 
            // InternalKinematics.g:786:2: ( rule__Joint__NameAssignment_1 )
            // InternalKinematics.g:786:3: rule__Joint__NameAssignment_1
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
    // InternalKinematics.g:794:1: rule__Joint__Group__2 : rule__Joint__Group__2__Impl rule__Joint__Group__3 ;
    public final void rule__Joint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:798:1: ( rule__Joint__Group__2__Impl rule__Joint__Group__3 )
            // InternalKinematics.g:799:2: rule__Joint__Group__2__Impl rule__Joint__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalKinematics.g:806:1: rule__Joint__Group__2__Impl : ( '{' ) ;
    public final void rule__Joint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:810:1: ( ( '{' ) )
            // InternalKinematics.g:811:1: ( '{' )
            {
            // InternalKinematics.g:811:1: ( '{' )
            // InternalKinematics.g:812:2: '{'
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
    // InternalKinematics.g:821:1: rule__Joint__Group__3 : rule__Joint__Group__3__Impl rule__Joint__Group__4 ;
    public final void rule__Joint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:825:1: ( rule__Joint__Group__3__Impl rule__Joint__Group__4 )
            // InternalKinematics.g:826:2: rule__Joint__Group__3__Impl rule__Joint__Group__4
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
    // InternalKinematics.g:833:1: rule__Joint__Group__3__Impl : ( 'parent' ) ;
    public final void rule__Joint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:837:1: ( ( 'parent' ) )
            // InternalKinematics.g:838:1: ( 'parent' )
            {
            // InternalKinematics.g:838:1: ( 'parent' )
            // InternalKinematics.g:839:2: 'parent'
            {
             before(grammarAccess.getJointAccess().getParentKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalKinematics.g:848:1: rule__Joint__Group__4 : rule__Joint__Group__4__Impl rule__Joint__Group__5 ;
    public final void rule__Joint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:852:1: ( rule__Joint__Group__4__Impl rule__Joint__Group__5 )
            // InternalKinematics.g:853:2: rule__Joint__Group__4__Impl rule__Joint__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalKinematics.g:860:1: rule__Joint__Group__4__Impl : ( ( rule__Joint__ParentAssignment_4 ) ) ;
    public final void rule__Joint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:864:1: ( ( ( rule__Joint__ParentAssignment_4 ) ) )
            // InternalKinematics.g:865:1: ( ( rule__Joint__ParentAssignment_4 ) )
            {
            // InternalKinematics.g:865:1: ( ( rule__Joint__ParentAssignment_4 ) )
            // InternalKinematics.g:866:2: ( rule__Joint__ParentAssignment_4 )
            {
             before(grammarAccess.getJointAccess().getParentAssignment_4()); 
            // InternalKinematics.g:867:2: ( rule__Joint__ParentAssignment_4 )
            // InternalKinematics.g:867:3: rule__Joint__ParentAssignment_4
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
    // InternalKinematics.g:875:1: rule__Joint__Group__5 : rule__Joint__Group__5__Impl rule__Joint__Group__6 ;
    public final void rule__Joint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:879:1: ( rule__Joint__Group__5__Impl rule__Joint__Group__6 )
            // InternalKinematics.g:880:2: rule__Joint__Group__5__Impl rule__Joint__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalKinematics.g:887:1: rule__Joint__Group__5__Impl : ( 'child' ) ;
    public final void rule__Joint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:891:1: ( ( 'child' ) )
            // InternalKinematics.g:892:1: ( 'child' )
            {
            // InternalKinematics.g:892:1: ( 'child' )
            // InternalKinematics.g:893:2: 'child'
            {
             before(grammarAccess.getJointAccess().getChildKeyword_5()); 
            match(input,21,FOLLOW_2); 
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
    // InternalKinematics.g:902:1: rule__Joint__Group__6 : rule__Joint__Group__6__Impl rule__Joint__Group__7 ;
    public final void rule__Joint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:906:1: ( rule__Joint__Group__6__Impl rule__Joint__Group__7 )
            // InternalKinematics.g:907:2: rule__Joint__Group__6__Impl rule__Joint__Group__7
            {
            pushFollow(FOLLOW_14);
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
    // InternalKinematics.g:914:1: rule__Joint__Group__6__Impl : ( ( rule__Joint__ChildAssignment_6 ) ) ;
    public final void rule__Joint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:918:1: ( ( ( rule__Joint__ChildAssignment_6 ) ) )
            // InternalKinematics.g:919:1: ( ( rule__Joint__ChildAssignment_6 ) )
            {
            // InternalKinematics.g:919:1: ( ( rule__Joint__ChildAssignment_6 ) )
            // InternalKinematics.g:920:2: ( rule__Joint__ChildAssignment_6 )
            {
             before(grammarAccess.getJointAccess().getChildAssignment_6()); 
            // InternalKinematics.g:921:2: ( rule__Joint__ChildAssignment_6 )
            // InternalKinematics.g:921:3: rule__Joint__ChildAssignment_6
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
    // InternalKinematics.g:929:1: rule__Joint__Group__7 : rule__Joint__Group__7__Impl ;
    public final void rule__Joint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:933:1: ( rule__Joint__Group__7__Impl )
            // InternalKinematics.g:934:2: rule__Joint__Group__7__Impl
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
    // InternalKinematics.g:940:1: rule__Joint__Group__7__Impl : ( '}' ) ;
    public final void rule__Joint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:944:1: ( ( '}' ) )
            // InternalKinematics.g:945:1: ( '}' )
            {
            // InternalKinematics.g:945:1: ( '}' )
            // InternalKinematics.g:946:2: '}'
            {
             before(grammarAccess.getJointAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
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
    // InternalKinematics.g:956:1: rule__Robot__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Robot__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:960:1: ( ( ruleEString ) )
            // InternalKinematics.g:961:2: ( ruleEString )
            {
            // InternalKinematics.g:961:2: ( ruleEString )
            // InternalKinematics.g:962:3: ruleEString
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


    // $ANTLR start "rule__Robot__PrefixAssignment_5"
    // InternalKinematics.g:971:1: rule__Robot__PrefixAssignment_5 : ( ruleEString ) ;
    public final void rule__Robot__PrefixAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:975:1: ( ( ruleEString ) )
            // InternalKinematics.g:976:2: ( ruleEString )
            {
            // InternalKinematics.g:976:2: ( ruleEString )
            // InternalKinematics.g:977:3: ruleEString
            {
             before(grammarAccess.getRobotAccess().getPrefixEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getPrefixEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__PrefixAssignment_5"


    // $ANTLR start "rule__Robot__Root_linkAssignment_6_1"
    // InternalKinematics.g:986:1: rule__Robot__Root_linkAssignment_6_1 : ( ruleLink ) ;
    public final void rule__Robot__Root_linkAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:990:1: ( ( ruleLink ) )
            // InternalKinematics.g:991:2: ( ruleLink )
            {
            // InternalKinematics.g:991:2: ( ruleLink )
            // InternalKinematics.g:992:3: ruleLink
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
    // InternalKinematics.g:1001:1: rule__Robot__JointsAssignment_7_2 : ( ruleJoint ) ;
    public final void rule__Robot__JointsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1005:1: ( ( ruleJoint ) )
            // InternalKinematics.g:1006:2: ( ruleJoint )
            {
            // InternalKinematics.g:1006:2: ( ruleJoint )
            // InternalKinematics.g:1007:3: ruleJoint
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
    // InternalKinematics.g:1016:1: rule__Robot__JointsAssignment_7_3_1 : ( ruleJoint ) ;
    public final void rule__Robot__JointsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1020:1: ( ( ruleJoint ) )
            // InternalKinematics.g:1021:2: ( ruleJoint )
            {
            // InternalKinematics.g:1021:2: ( ruleJoint )
            // InternalKinematics.g:1022:3: ruleJoint
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


    // $ANTLR start "rule__Link__NameAssignment_2"
    // InternalKinematics.g:1031:1: rule__Link__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Link__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1035:1: ( ( ruleEString ) )
            // InternalKinematics.g:1036:2: ( ruleEString )
            {
            // InternalKinematics.g:1036:2: ( ruleEString )
            // InternalKinematics.g:1037:3: ruleEString
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
    // InternalKinematics.g:1046:1: rule__Joint__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Joint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1050:1: ( ( ruleEString ) )
            // InternalKinematics.g:1051:2: ( ruleEString )
            {
            // InternalKinematics.g:1051:2: ( ruleEString )
            // InternalKinematics.g:1052:3: ruleEString
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
    // InternalKinematics.g:1061:1: rule__Joint__ParentAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Joint__ParentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1065:1: ( ( ( ruleEString ) ) )
            // InternalKinematics.g:1066:2: ( ( ruleEString ) )
            {
            // InternalKinematics.g:1066:2: ( ( ruleEString ) )
            // InternalKinematics.g:1067:3: ( ruleEString )
            {
             before(grammarAccess.getJointAccess().getParentLinkCrossReference_4_0()); 
            // InternalKinematics.g:1068:3: ( ruleEString )
            // InternalKinematics.g:1069:4: ruleEString
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
    // InternalKinematics.g:1080:1: rule__Joint__ChildAssignment_6 : ( ruleLink ) ;
    public final void rule__Joint__ChildAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1084:1: ( ( ruleLink ) )
            // InternalKinematics.g:1085:2: ( ruleLink )
            {
            // InternalKinematics.g:1085:2: ( ruleLink )
            // InternalKinematics.g:1086:3: ruleLink
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});

}