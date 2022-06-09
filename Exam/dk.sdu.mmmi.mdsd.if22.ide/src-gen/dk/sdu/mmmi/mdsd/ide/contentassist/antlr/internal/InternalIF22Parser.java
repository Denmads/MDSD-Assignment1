package dk.sdu.mmmi.mdsd.ide.contentassist.antlr.internal;

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
import dk.sdu.mmmi.mdsd.services.IF22GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIF22Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'story'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalIF22Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIF22Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIF22Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalIF22.g"; }


    	private IF22GrammarAccess grammarAccess;

    	public void setGrammarAccess(IF22GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleIF22"
    // InternalIF22.g:53:1: entryRuleIF22 : ruleIF22 EOF ;
    public final void entryRuleIF22() throws RecognitionException {
        try {
            // InternalIF22.g:54:1: ( ruleIF22 EOF )
            // InternalIF22.g:55:1: ruleIF22 EOF
            {
             before(grammarAccess.getIF22Rule()); 
            pushFollow(FOLLOW_1);
            ruleIF22();

            state._fsp--;

             after(grammarAccess.getIF22Rule()); 
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
    // $ANTLR end "entryRuleIF22"


    // $ANTLR start "ruleIF22"
    // InternalIF22.g:62:1: ruleIF22 : ( ( rule__IF22__Group__0 ) ) ;
    public final void ruleIF22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIF22.g:66:2: ( ( ( rule__IF22__Group__0 ) ) )
            // InternalIF22.g:67:2: ( ( rule__IF22__Group__0 ) )
            {
            // InternalIF22.g:67:2: ( ( rule__IF22__Group__0 ) )
            // InternalIF22.g:68:3: ( rule__IF22__Group__0 )
            {
             before(grammarAccess.getIF22Access().getGroup()); 
            // InternalIF22.g:69:3: ( rule__IF22__Group__0 )
            // InternalIF22.g:69:4: rule__IF22__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IF22__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIF22Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIF22"


    // $ANTLR start "rule__IF22__Group__0"
    // InternalIF22.g:77:1: rule__IF22__Group__0 : rule__IF22__Group__0__Impl rule__IF22__Group__1 ;
    public final void rule__IF22__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIF22.g:81:1: ( rule__IF22__Group__0__Impl rule__IF22__Group__1 )
            // InternalIF22.g:82:2: rule__IF22__Group__0__Impl rule__IF22__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__IF22__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IF22__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IF22__Group__0"


    // $ANTLR start "rule__IF22__Group__0__Impl"
    // InternalIF22.g:89:1: rule__IF22__Group__0__Impl : ( 'story' ) ;
    public final void rule__IF22__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIF22.g:93:1: ( ( 'story' ) )
            // InternalIF22.g:94:1: ( 'story' )
            {
            // InternalIF22.g:94:1: ( 'story' )
            // InternalIF22.g:95:2: 'story'
            {
             before(grammarAccess.getIF22Access().getStoryKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getIF22Access().getStoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IF22__Group__0__Impl"


    // $ANTLR start "rule__IF22__Group__1"
    // InternalIF22.g:104:1: rule__IF22__Group__1 : rule__IF22__Group__1__Impl ;
    public final void rule__IF22__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIF22.g:108:1: ( rule__IF22__Group__1__Impl )
            // InternalIF22.g:109:2: rule__IF22__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IF22__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IF22__Group__1"


    // $ANTLR start "rule__IF22__Group__1__Impl"
    // InternalIF22.g:115:1: rule__IF22__Group__1__Impl : ( ( rule__IF22__NameAssignment_1 ) ) ;
    public final void rule__IF22__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIF22.g:119:1: ( ( ( rule__IF22__NameAssignment_1 ) ) )
            // InternalIF22.g:120:1: ( ( rule__IF22__NameAssignment_1 ) )
            {
            // InternalIF22.g:120:1: ( ( rule__IF22__NameAssignment_1 ) )
            // InternalIF22.g:121:2: ( rule__IF22__NameAssignment_1 )
            {
             before(grammarAccess.getIF22Access().getNameAssignment_1()); 
            // InternalIF22.g:122:2: ( rule__IF22__NameAssignment_1 )
            // InternalIF22.g:122:3: rule__IF22__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IF22__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIF22Access().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IF22__Group__1__Impl"


    // $ANTLR start "rule__IF22__NameAssignment_1"
    // InternalIF22.g:131:1: rule__IF22__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__IF22__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIF22.g:135:1: ( ( RULE_ID ) )
            // InternalIF22.g:136:2: ( RULE_ID )
            {
            // InternalIF22.g:136:2: ( RULE_ID )
            // InternalIF22.g:137:3: RULE_ID
            {
             before(grammarAccess.getIF22Access().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIF22Access().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IF22__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});

}