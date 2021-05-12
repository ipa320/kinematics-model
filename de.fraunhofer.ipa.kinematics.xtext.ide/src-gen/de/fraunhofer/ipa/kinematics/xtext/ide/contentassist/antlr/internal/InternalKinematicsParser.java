package de.fraunhofer.ipa.kinematics.xtext.ide.contentassist.antlr.internal;

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
import de.fraunhofer.ipa.kinematics.xtext.services.KinematicsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKinematicsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'robot'", "'{'", "'root_link'", "'}'", "'joints'", "'joint'", "'parent'", "'child'", "'link'"
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



    // $ANTLR start "entryRuleKinematics"
    // InternalKinematics.g:53:1: entryRuleKinematics : ruleKinematics EOF ;
    public final void entryRuleKinematics() throws RecognitionException {
        try {
            // InternalKinematics.g:54:1: ( ruleKinematics EOF )
            // InternalKinematics.g:55:1: ruleKinematics EOF
            {
             before(grammarAccess.getKinematicsRule()); 
            pushFollow(FOLLOW_1);
            ruleKinematics();

            state._fsp--;

             after(grammarAccess.getKinematicsRule()); 
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
    // $ANTLR end "entryRuleKinematics"


    // $ANTLR start "ruleKinematics"
    // InternalKinematics.g:62:1: ruleKinematics : ( ( rule__Kinematics__Group__0 ) ) ;
    public final void ruleKinematics() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:66:2: ( ( ( rule__Kinematics__Group__0 ) ) )
            // InternalKinematics.g:67:2: ( ( rule__Kinematics__Group__0 ) )
            {
            // InternalKinematics.g:67:2: ( ( rule__Kinematics__Group__0 ) )
            // InternalKinematics.g:68:3: ( rule__Kinematics__Group__0 )
            {
             before(grammarAccess.getKinematicsAccess().getGroup()); 
            // InternalKinematics.g:69:3: ( rule__Kinematics__Group__0 )
            // InternalKinematics.g:69:4: rule__Kinematics__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Kinematics__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKinematicsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKinematics"


    // $ANTLR start "entryRulejoint"
    // InternalKinematics.g:78:1: entryRulejoint : rulejoint EOF ;
    public final void entryRulejoint() throws RecognitionException {
        try {
            // InternalKinematics.g:79:1: ( rulejoint EOF )
            // InternalKinematics.g:80:1: rulejoint EOF
            {
             before(grammarAccess.getJointRule()); 
            pushFollow(FOLLOW_1);
            rulejoint();

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
    // $ANTLR end "entryRulejoint"


    // $ANTLR start "rulejoint"
    // InternalKinematics.g:87:1: rulejoint : ( ( rule__Joint__Group__0 ) ) ;
    public final void rulejoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:91:2: ( ( ( rule__Joint__Group__0 ) ) )
            // InternalKinematics.g:92:2: ( ( rule__Joint__Group__0 ) )
            {
            // InternalKinematics.g:92:2: ( ( rule__Joint__Group__0 ) )
            // InternalKinematics.g:93:3: ( rule__Joint__Group__0 )
            {
             before(grammarAccess.getJointAccess().getGroup()); 
            // InternalKinematics.g:94:3: ( rule__Joint__Group__0 )
            // InternalKinematics.g:94:4: rule__Joint__Group__0
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
    // $ANTLR end "rulejoint"


    // $ANTLR start "entryRulelink"
    // InternalKinematics.g:103:1: entryRulelink : rulelink EOF ;
    public final void entryRulelink() throws RecognitionException {
        try {
            // InternalKinematics.g:104:1: ( rulelink EOF )
            // InternalKinematics.g:105:1: rulelink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            rulelink();

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
    // $ANTLR end "entryRulelink"


    // $ANTLR start "rulelink"
    // InternalKinematics.g:112:1: rulelink : ( ( rule__Link__Group__0 ) ) ;
    public final void rulelink() throws RecognitionException {

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
    // $ANTLR end "rulelink"


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


    // $ANTLR start "rule__Kinematics__Group__0"
    // InternalKinematics.g:173:1: rule__Kinematics__Group__0 : rule__Kinematics__Group__0__Impl rule__Kinematics__Group__1 ;
    public final void rule__Kinematics__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:177:1: ( rule__Kinematics__Group__0__Impl rule__Kinematics__Group__1 )
            // InternalKinematics.g:178:2: rule__Kinematics__Group__0__Impl rule__Kinematics__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Kinematics__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kinematics__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinematics__Group__0"


    // $ANTLR start "rule__Kinematics__Group__0__Impl"
    // InternalKinematics.g:185:1: rule__Kinematics__Group__0__Impl : ( 'robot' ) ;
    public final void rule__Kinematics__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:189:1: ( ( 'robot' ) )
            // InternalKinematics.g:190:1: ( 'robot' )
            {
            // InternalKinematics.g:190:1: ( 'robot' )
            // InternalKinematics.g:191:2: 'robot'
            {
             before(grammarAccess.getKinematicsAccess().getRobotKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getKinematicsAccess().getRobotKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinematics__Group__0__Impl"


    // $ANTLR start "rule__Kinematics__Group__1"
    // InternalKinematics.g:200:1: rule__Kinematics__Group__1 : rule__Kinematics__Group__1__Impl rule__Kinematics__Group__2 ;
    public final void rule__Kinematics__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:204:1: ( rule__Kinematics__Group__1__Impl rule__Kinematics__Group__2 )
            // InternalKinematics.g:205:2: rule__Kinematics__Group__1__Impl rule__Kinematics__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Kinematics__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kinematics__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinematics__Group__1"


    // $ANTLR start "rule__Kinematics__Group__1__Impl"
    // InternalKinematics.g:212:1: rule__Kinematics__Group__1__Impl : ( ( rule__Kinematics__NameAssignment_1 ) ) ;
    public final void rule__Kinematics__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:216:1: ( ( ( rule__Kinematics__NameAssignment_1 ) ) )
            // InternalKinematics.g:217:1: ( ( rule__Kinematics__NameAssignment_1 ) )
            {
            // InternalKinematics.g:217:1: ( ( rule__Kinematics__NameAssignment_1 ) )
            // InternalKinematics.g:218:2: ( rule__Kinematics__NameAssignment_1 )
            {
             before(grammarAccess.getKinematicsAccess().getNameAssignment_1()); 
            // InternalKinematics.g:219:2: ( rule__Kinematics__NameAssignment_1 )
            // InternalKinematics.g:219:3: rule__Kinematics__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Kinematics__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKinematicsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinematics__Group__1__Impl"


    // $ANTLR start "rule__Kinematics__Group__2"
    // InternalKinematics.g:227:1: rule__Kinematics__Group__2 : rule__Kinematics__Group__2__Impl rule__Kinematics__Group__3 ;
    public final void rule__Kinematics__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:231:1: ( rule__Kinematics__Group__2__Impl rule__Kinematics__Group__3 )
            // InternalKinematics.g:232:2: rule__Kinematics__Group__2__Impl rule__Kinematics__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Kinematics__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kinematics__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinematics__Group__2"


    // $ANTLR start "rule__Kinematics__Group__2__Impl"
    // InternalKinematics.g:239:1: rule__Kinematics__Group__2__Impl : ( '{' ) ;
    public final void rule__Kinematics__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:243:1: ( ( '{' ) )
            // InternalKinematics.g:244:1: ( '{' )
            {
            // InternalKinematics.g:244:1: ( '{' )
            // InternalKinematics.g:245:2: '{'
            {
             before(grammarAccess.getKinematicsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getKinematicsAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinematics__Group__2__Impl"


    // $ANTLR start "rule__Kinematics__Group__3"
    // InternalKinematics.g:254:1: rule__Kinematics__Group__3 : rule__Kinematics__Group__3__Impl rule__Kinematics__Group__4 ;
    public final void rule__Kinematics__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:258:1: ( rule__Kinematics__Group__3__Impl rule__Kinematics__Group__4 )
            // InternalKinematics.g:259:2: rule__Kinematics__Group__3__Impl rule__Kinematics__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Kinematics__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kinematics__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinematics__Group__3"


    // $ANTLR start "rule__Kinematics__Group__3__Impl"
    // InternalKinematics.g:266:1: rule__Kinematics__Group__3__Impl : ( 'root_link' ) ;
    public final void rule__Kinematics__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:270:1: ( ( 'root_link' ) )
            // InternalKinematics.g:271:1: ( 'root_link' )
            {
            // InternalKinematics.g:271:1: ( 'root_link' )
            // InternalKinematics.g:272:2: 'root_link'
            {
             before(grammarAccess.getKinematicsAccess().getRoot_linkKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getKinematicsAccess().getRoot_linkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinematics__Group__3__Impl"


    // $ANTLR start "rule__Kinematics__Group__4"
    // InternalKinematics.g:281:1: rule__Kinematics__Group__4 : rule__Kinematics__Group__4__Impl rule__Kinematics__Group__5 ;
    public final void rule__Kinematics__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:285:1: ( rule__Kinematics__Group__4__Impl rule__Kinematics__Group__5 )
            // InternalKinematics.g:286:2: rule__Kinematics__Group__4__Impl rule__Kinematics__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Kinematics__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kinematics__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinematics__Group__4"


    // $ANTLR start "rule__Kinematics__Group__4__Impl"
    // InternalKinematics.g:293:1: rule__Kinematics__Group__4__Impl : ( ( rule__Kinematics__Root_linkAssignment_4 ) ) ;
    public final void rule__Kinematics__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:297:1: ( ( ( rule__Kinematics__Root_linkAssignment_4 ) ) )
            // InternalKinematics.g:298:1: ( ( rule__Kinematics__Root_linkAssignment_4 ) )
            {
            // InternalKinematics.g:298:1: ( ( rule__Kinematics__Root_linkAssignment_4 ) )
            // InternalKinematics.g:299:2: ( rule__Kinematics__Root_linkAssignment_4 )
            {
             before(grammarAccess.getKinematicsAccess().getRoot_linkAssignment_4()); 
            // InternalKinematics.g:300:2: ( rule__Kinematics__Root_linkAssignment_4 )
            // InternalKinematics.g:300:3: rule__Kinematics__Root_linkAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Kinematics__Root_linkAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getKinematicsAccess().getRoot_linkAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinematics__Group__4__Impl"


    // $ANTLR start "rule__Kinematics__Group__5"
    // InternalKinematics.g:308:1: rule__Kinematics__Group__5 : rule__Kinematics__Group__5__Impl rule__Kinematics__Group__6 ;
    public final void rule__Kinematics__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:312:1: ( rule__Kinematics__Group__5__Impl rule__Kinematics__Group__6 )
            // InternalKinematics.g:313:2: rule__Kinematics__Group__5__Impl rule__Kinematics__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Kinematics__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kinematics__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinematics__Group__5"


    // $ANTLR start "rule__Kinematics__Group__5__Impl"
    // InternalKinematics.g:320:1: rule__Kinematics__Group__5__Impl : ( ( rule__Kinematics__Group_5__0 )? ) ;
    public final void rule__Kinematics__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:324:1: ( ( ( rule__Kinematics__Group_5__0 )? ) )
            // InternalKinematics.g:325:1: ( ( rule__Kinematics__Group_5__0 )? )
            {
            // InternalKinematics.g:325:1: ( ( rule__Kinematics__Group_5__0 )? )
            // InternalKinematics.g:326:2: ( rule__Kinematics__Group_5__0 )?
            {
             before(grammarAccess.getKinematicsAccess().getGroup_5()); 
            // InternalKinematics.g:327:2: ( rule__Kinematics__Group_5__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKinematics.g:327:3: rule__Kinematics__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Kinematics__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKinematicsAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinematics__Group__5__Impl"


    // $ANTLR start "rule__Kinematics__Group__6"
    // InternalKinematics.g:335:1: rule__Kinematics__Group__6 : rule__Kinematics__Group__6__Impl ;
    public final void rule__Kinematics__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:339:1: ( rule__Kinematics__Group__6__Impl )
            // InternalKinematics.g:340:2: rule__Kinematics__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Kinematics__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinematics__Group__6"


    // $ANTLR start "rule__Kinematics__Group__6__Impl"
    // InternalKinematics.g:346:1: rule__Kinematics__Group__6__Impl : ( '}' ) ;
    public final void rule__Kinematics__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:350:1: ( ( '}' ) )
            // InternalKinematics.g:351:1: ( '}' )
            {
            // InternalKinematics.g:351:1: ( '}' )
            // InternalKinematics.g:352:2: '}'
            {
             before(grammarAccess.getKinematicsAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getKinematicsAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinematics__Group__6__Impl"


    // $ANTLR start "rule__Kinematics__Group_5__0"
    // InternalKinematics.g:362:1: rule__Kinematics__Group_5__0 : rule__Kinematics__Group_5__0__Impl rule__Kinematics__Group_5__1 ;
    public final void rule__Kinematics__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:366:1: ( rule__Kinematics__Group_5__0__Impl rule__Kinematics__Group_5__1 )
            // InternalKinematics.g:367:2: rule__Kinematics__Group_5__0__Impl rule__Kinematics__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Kinematics__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kinematics__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinematics__Group_5__0"


    // $ANTLR start "rule__Kinematics__Group_5__0__Impl"
    // InternalKinematics.g:374:1: rule__Kinematics__Group_5__0__Impl : ( 'joints' ) ;
    public final void rule__Kinematics__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:378:1: ( ( 'joints' ) )
            // InternalKinematics.g:379:1: ( 'joints' )
            {
            // InternalKinematics.g:379:1: ( 'joints' )
            // InternalKinematics.g:380:2: 'joints'
            {
             before(grammarAccess.getKinematicsAccess().getJointsKeyword_5_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getKinematicsAccess().getJointsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinematics__Group_5__0__Impl"


    // $ANTLR start "rule__Kinematics__Group_5__1"
    // InternalKinematics.g:389:1: rule__Kinematics__Group_5__1 : rule__Kinematics__Group_5__1__Impl rule__Kinematics__Group_5__2 ;
    public final void rule__Kinematics__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:393:1: ( rule__Kinematics__Group_5__1__Impl rule__Kinematics__Group_5__2 )
            // InternalKinematics.g:394:2: rule__Kinematics__Group_5__1__Impl rule__Kinematics__Group_5__2
            {
            pushFollow(FOLLOW_8);
            rule__Kinematics__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kinematics__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinematics__Group_5__1"


    // $ANTLR start "rule__Kinematics__Group_5__1__Impl"
    // InternalKinematics.g:401:1: rule__Kinematics__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Kinematics__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:405:1: ( ( '{' ) )
            // InternalKinematics.g:406:1: ( '{' )
            {
            // InternalKinematics.g:406:1: ( '{' )
            // InternalKinematics.g:407:2: '{'
            {
             before(grammarAccess.getKinematicsAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getKinematicsAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinematics__Group_5__1__Impl"


    // $ANTLR start "rule__Kinematics__Group_5__2"
    // InternalKinematics.g:416:1: rule__Kinematics__Group_5__2 : rule__Kinematics__Group_5__2__Impl rule__Kinematics__Group_5__3 ;
    public final void rule__Kinematics__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:420:1: ( rule__Kinematics__Group_5__2__Impl rule__Kinematics__Group_5__3 )
            // InternalKinematics.g:421:2: rule__Kinematics__Group_5__2__Impl rule__Kinematics__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__Kinematics__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kinematics__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinematics__Group_5__2"


    // $ANTLR start "rule__Kinematics__Group_5__2__Impl"
    // InternalKinematics.g:428:1: rule__Kinematics__Group_5__2__Impl : ( ( rule__Kinematics__JointsAssignment_5_2 )* ) ;
    public final void rule__Kinematics__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:432:1: ( ( ( rule__Kinematics__JointsAssignment_5_2 )* ) )
            // InternalKinematics.g:433:1: ( ( rule__Kinematics__JointsAssignment_5_2 )* )
            {
            // InternalKinematics.g:433:1: ( ( rule__Kinematics__JointsAssignment_5_2 )* )
            // InternalKinematics.g:434:2: ( rule__Kinematics__JointsAssignment_5_2 )*
            {
             before(grammarAccess.getKinematicsAccess().getJointsAssignment_5_2()); 
            // InternalKinematics.g:435:2: ( rule__Kinematics__JointsAssignment_5_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKinematics.g:435:3: rule__Kinematics__JointsAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Kinematics__JointsAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getKinematicsAccess().getJointsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinematics__Group_5__2__Impl"


    // $ANTLR start "rule__Kinematics__Group_5__3"
    // InternalKinematics.g:443:1: rule__Kinematics__Group_5__3 : rule__Kinematics__Group_5__3__Impl ;
    public final void rule__Kinematics__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:447:1: ( rule__Kinematics__Group_5__3__Impl )
            // InternalKinematics.g:448:2: rule__Kinematics__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Kinematics__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinematics__Group_5__3"


    // $ANTLR start "rule__Kinematics__Group_5__3__Impl"
    // InternalKinematics.g:454:1: rule__Kinematics__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Kinematics__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:458:1: ( ( '}' ) )
            // InternalKinematics.g:459:1: ( '}' )
            {
            // InternalKinematics.g:459:1: ( '}' )
            // InternalKinematics.g:460:2: '}'
            {
             before(grammarAccess.getKinematicsAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getKinematicsAccess().getRightCurlyBracketKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinematics__Group_5__3__Impl"


    // $ANTLR start "rule__Joint__Group__0"
    // InternalKinematics.g:470:1: rule__Joint__Group__0 : rule__Joint__Group__0__Impl rule__Joint__Group__1 ;
    public final void rule__Joint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:474:1: ( rule__Joint__Group__0__Impl rule__Joint__Group__1 )
            // InternalKinematics.g:475:2: rule__Joint__Group__0__Impl rule__Joint__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalKinematics.g:482:1: rule__Joint__Group__0__Impl : ( 'joint' ) ;
    public final void rule__Joint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:486:1: ( ( 'joint' ) )
            // InternalKinematics.g:487:1: ( 'joint' )
            {
            // InternalKinematics.g:487:1: ( 'joint' )
            // InternalKinematics.g:488:2: 'joint'
            {
             before(grammarAccess.getJointAccess().getJointKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalKinematics.g:497:1: rule__Joint__Group__1 : rule__Joint__Group__1__Impl rule__Joint__Group__2 ;
    public final void rule__Joint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:501:1: ( rule__Joint__Group__1__Impl rule__Joint__Group__2 )
            // InternalKinematics.g:502:2: rule__Joint__Group__1__Impl rule__Joint__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalKinematics.g:509:1: rule__Joint__Group__1__Impl : ( ( rule__Joint__NameAssignment_1 ) ) ;
    public final void rule__Joint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:513:1: ( ( ( rule__Joint__NameAssignment_1 ) ) )
            // InternalKinematics.g:514:1: ( ( rule__Joint__NameAssignment_1 ) )
            {
            // InternalKinematics.g:514:1: ( ( rule__Joint__NameAssignment_1 ) )
            // InternalKinematics.g:515:2: ( rule__Joint__NameAssignment_1 )
            {
             before(grammarAccess.getJointAccess().getNameAssignment_1()); 
            // InternalKinematics.g:516:2: ( rule__Joint__NameAssignment_1 )
            // InternalKinematics.g:516:3: rule__Joint__NameAssignment_1
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
    // InternalKinematics.g:524:1: rule__Joint__Group__2 : rule__Joint__Group__2__Impl rule__Joint__Group__3 ;
    public final void rule__Joint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:528:1: ( rule__Joint__Group__2__Impl rule__Joint__Group__3 )
            // InternalKinematics.g:529:2: rule__Joint__Group__2__Impl rule__Joint__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalKinematics.g:536:1: rule__Joint__Group__2__Impl : ( '{' ) ;
    public final void rule__Joint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:540:1: ( ( '{' ) )
            // InternalKinematics.g:541:1: ( '{' )
            {
            // InternalKinematics.g:541:1: ( '{' )
            // InternalKinematics.g:542:2: '{'
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
    // InternalKinematics.g:551:1: rule__Joint__Group__3 : rule__Joint__Group__3__Impl rule__Joint__Group__4 ;
    public final void rule__Joint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:555:1: ( rule__Joint__Group__3__Impl rule__Joint__Group__4 )
            // InternalKinematics.g:556:2: rule__Joint__Group__3__Impl rule__Joint__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalKinematics.g:563:1: rule__Joint__Group__3__Impl : ( 'parent' ) ;
    public final void rule__Joint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:567:1: ( ( 'parent' ) )
            // InternalKinematics.g:568:1: ( 'parent' )
            {
            // InternalKinematics.g:568:1: ( 'parent' )
            // InternalKinematics.g:569:2: 'parent'
            {
             before(grammarAccess.getJointAccess().getParentKeyword_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalKinematics.g:578:1: rule__Joint__Group__4 : rule__Joint__Group__4__Impl rule__Joint__Group__5 ;
    public final void rule__Joint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:582:1: ( rule__Joint__Group__4__Impl rule__Joint__Group__5 )
            // InternalKinematics.g:583:2: rule__Joint__Group__4__Impl rule__Joint__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalKinematics.g:590:1: rule__Joint__Group__4__Impl : ( ( rule__Joint__ParentAssignment_4 ) ) ;
    public final void rule__Joint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:594:1: ( ( ( rule__Joint__ParentAssignment_4 ) ) )
            // InternalKinematics.g:595:1: ( ( rule__Joint__ParentAssignment_4 ) )
            {
            // InternalKinematics.g:595:1: ( ( rule__Joint__ParentAssignment_4 ) )
            // InternalKinematics.g:596:2: ( rule__Joint__ParentAssignment_4 )
            {
             before(grammarAccess.getJointAccess().getParentAssignment_4()); 
            // InternalKinematics.g:597:2: ( rule__Joint__ParentAssignment_4 )
            // InternalKinematics.g:597:3: rule__Joint__ParentAssignment_4
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
    // InternalKinematics.g:605:1: rule__Joint__Group__5 : rule__Joint__Group__5__Impl rule__Joint__Group__6 ;
    public final void rule__Joint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:609:1: ( rule__Joint__Group__5__Impl rule__Joint__Group__6 )
            // InternalKinematics.g:610:2: rule__Joint__Group__5__Impl rule__Joint__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalKinematics.g:617:1: rule__Joint__Group__5__Impl : ( 'child' ) ;
    public final void rule__Joint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:621:1: ( ( 'child' ) )
            // InternalKinematics.g:622:1: ( 'child' )
            {
            // InternalKinematics.g:622:1: ( 'child' )
            // InternalKinematics.g:623:2: 'child'
            {
             before(grammarAccess.getJointAccess().getChildKeyword_5()); 
            match(input,18,FOLLOW_2); 
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
    // InternalKinematics.g:632:1: rule__Joint__Group__6 : rule__Joint__Group__6__Impl rule__Joint__Group__7 ;
    public final void rule__Joint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:636:1: ( rule__Joint__Group__6__Impl rule__Joint__Group__7 )
            // InternalKinematics.g:637:2: rule__Joint__Group__6__Impl rule__Joint__Group__7
            {
            pushFollow(FOLLOW_12);
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
    // InternalKinematics.g:644:1: rule__Joint__Group__6__Impl : ( ( rule__Joint__ChildAssignment_6 ) ) ;
    public final void rule__Joint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:648:1: ( ( ( rule__Joint__ChildAssignment_6 ) ) )
            // InternalKinematics.g:649:1: ( ( rule__Joint__ChildAssignment_6 ) )
            {
            // InternalKinematics.g:649:1: ( ( rule__Joint__ChildAssignment_6 ) )
            // InternalKinematics.g:650:2: ( rule__Joint__ChildAssignment_6 )
            {
             before(grammarAccess.getJointAccess().getChildAssignment_6()); 
            // InternalKinematics.g:651:2: ( rule__Joint__ChildAssignment_6 )
            // InternalKinematics.g:651:3: rule__Joint__ChildAssignment_6
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
    // InternalKinematics.g:659:1: rule__Joint__Group__7 : rule__Joint__Group__7__Impl ;
    public final void rule__Joint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:663:1: ( rule__Joint__Group__7__Impl )
            // InternalKinematics.g:664:2: rule__Joint__Group__7__Impl
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
    // InternalKinematics.g:670:1: rule__Joint__Group__7__Impl : ( '}' ) ;
    public final void rule__Joint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:674:1: ( ( '}' ) )
            // InternalKinematics.g:675:1: ( '}' )
            {
            // InternalKinematics.g:675:1: ( '}' )
            // InternalKinematics.g:676:2: '}'
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


    // $ANTLR start "rule__Link__Group__0"
    // InternalKinematics.g:686:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:690:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalKinematics.g:691:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalKinematics.g:698:1: rule__Link__Group__0__Impl : ( () ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:702:1: ( ( () ) )
            // InternalKinematics.g:703:1: ( () )
            {
            // InternalKinematics.g:703:1: ( () )
            // InternalKinematics.g:704:2: ()
            {
             before(grammarAccess.getLinkAccess().getLinkAction_0()); 
            // InternalKinematics.g:705:2: ()
            // InternalKinematics.g:705:3: 
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
    // InternalKinematics.g:713:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:717:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalKinematics.g:718:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalKinematics.g:725:1: rule__Link__Group__1__Impl : ( 'link' ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:729:1: ( ( 'link' ) )
            // InternalKinematics.g:730:1: ( 'link' )
            {
            // InternalKinematics.g:730:1: ( 'link' )
            // InternalKinematics.g:731:2: 'link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalKinematics.g:740:1: rule__Link__Group__2 : rule__Link__Group__2__Impl ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:744:1: ( rule__Link__Group__2__Impl )
            // InternalKinematics.g:745:2: rule__Link__Group__2__Impl
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
    // InternalKinematics.g:751:1: rule__Link__Group__2__Impl : ( ( rule__Link__NameAssignment_2 ) ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:755:1: ( ( ( rule__Link__NameAssignment_2 ) ) )
            // InternalKinematics.g:756:1: ( ( rule__Link__NameAssignment_2 ) )
            {
            // InternalKinematics.g:756:1: ( ( rule__Link__NameAssignment_2 ) )
            // InternalKinematics.g:757:2: ( rule__Link__NameAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_2()); 
            // InternalKinematics.g:758:2: ( rule__Link__NameAssignment_2 )
            // InternalKinematics.g:758:3: rule__Link__NameAssignment_2
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


    // $ANTLR start "rule__Kinematics__NameAssignment_1"
    // InternalKinematics.g:767:1: rule__Kinematics__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Kinematics__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:771:1: ( ( ruleEString ) )
            // InternalKinematics.g:772:2: ( ruleEString )
            {
            // InternalKinematics.g:772:2: ( ruleEString )
            // InternalKinematics.g:773:3: ruleEString
            {
             before(grammarAccess.getKinematicsAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKinematicsAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinematics__NameAssignment_1"


    // $ANTLR start "rule__Kinematics__Root_linkAssignment_4"
    // InternalKinematics.g:782:1: rule__Kinematics__Root_linkAssignment_4 : ( rulelink ) ;
    public final void rule__Kinematics__Root_linkAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:786:1: ( ( rulelink ) )
            // InternalKinematics.g:787:2: ( rulelink )
            {
            // InternalKinematics.g:787:2: ( rulelink )
            // InternalKinematics.g:788:3: rulelink
            {
             before(grammarAccess.getKinematicsAccess().getRoot_linkLinkParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulelink();

            state._fsp--;

             after(grammarAccess.getKinematicsAccess().getRoot_linkLinkParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinematics__Root_linkAssignment_4"


    // $ANTLR start "rule__Kinematics__JointsAssignment_5_2"
    // InternalKinematics.g:797:1: rule__Kinematics__JointsAssignment_5_2 : ( rulejoint ) ;
    public final void rule__Kinematics__JointsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:801:1: ( ( rulejoint ) )
            // InternalKinematics.g:802:2: ( rulejoint )
            {
            // InternalKinematics.g:802:2: ( rulejoint )
            // InternalKinematics.g:803:3: rulejoint
            {
             before(grammarAccess.getKinematicsAccess().getJointsJointParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            rulejoint();

            state._fsp--;

             after(grammarAccess.getKinematicsAccess().getJointsJointParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinematics__JointsAssignment_5_2"


    // $ANTLR start "rule__Joint__NameAssignment_1"
    // InternalKinematics.g:812:1: rule__Joint__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Joint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:816:1: ( ( ruleEString ) )
            // InternalKinematics.g:817:2: ( ruleEString )
            {
            // InternalKinematics.g:817:2: ( ruleEString )
            // InternalKinematics.g:818:3: ruleEString
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
    // InternalKinematics.g:827:1: rule__Joint__ParentAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Joint__ParentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:831:1: ( ( ( ruleEString ) ) )
            // InternalKinematics.g:832:2: ( ( ruleEString ) )
            {
            // InternalKinematics.g:832:2: ( ( ruleEString ) )
            // InternalKinematics.g:833:3: ( ruleEString )
            {
             before(grammarAccess.getJointAccess().getParentLinkCrossReference_4_0()); 
            // InternalKinematics.g:834:3: ( ruleEString )
            // InternalKinematics.g:835:4: ruleEString
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
    // InternalKinematics.g:846:1: rule__Joint__ChildAssignment_6 : ( rulelink ) ;
    public final void rule__Joint__ChildAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:850:1: ( ( rulelink ) )
            // InternalKinematics.g:851:2: ( rulelink )
            {
            // InternalKinematics.g:851:2: ( rulelink )
            // InternalKinematics.g:852:3: rulelink
            {
             before(grammarAccess.getJointAccess().getChildLinkParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulelink();

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


    // $ANTLR start "rule__Link__NameAssignment_2"
    // InternalKinematics.g:861:1: rule__Link__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Link__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:865:1: ( ( ruleEString ) )
            // InternalKinematics.g:866:2: ( ruleEString )
            {
            // InternalKinematics.g:866:2: ( ruleEString )
            // InternalKinematics.g:867:3: ruleEString
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L});

}