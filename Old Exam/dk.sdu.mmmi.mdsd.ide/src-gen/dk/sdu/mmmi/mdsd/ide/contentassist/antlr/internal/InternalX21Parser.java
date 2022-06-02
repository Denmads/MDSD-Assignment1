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
import dk.sdu.mmmi.mdsd.services.X21GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalX21Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "':'", "'parameter'", "'function'", "'('", "')'", "'{'", "'}'", "'input'", "'['", "']'", "'node'", "'stream'", "','", "'to'", "'output'", "'data'", "'int'", "'string'", "'='", "'<'", "'>'", "'<='", "'>='", "'+'", "'*'", "'/'", "'let'", "'in'", "'end'", "'.'", "'none'", "'if'", "'then'", "'else'", "'new'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalX21Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalX21Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalX21Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalX21.g"; }


    	private X21GrammarAccess grammarAccess;

    	public void setGrammarAccess(X21GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleX21"
    // InternalX21.g:53:1: entryRuleX21 : ruleX21 EOF ;
    public final void entryRuleX21() throws RecognitionException {
        try {
            // InternalX21.g:54:1: ( ruleX21 EOF )
            // InternalX21.g:55:1: ruleX21 EOF
            {
             before(grammarAccess.getX21Rule()); 
            pushFollow(FOLLOW_1);
            ruleX21();

            state._fsp--;

             after(grammarAccess.getX21Rule()); 
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
    // $ANTLR end "entryRuleX21"


    // $ANTLR start "ruleX21"
    // InternalX21.g:62:1: ruleX21 : ( ( rule__X21__Group__0 ) ) ;
    public final void ruleX21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:66:2: ( ( ( rule__X21__Group__0 ) ) )
            // InternalX21.g:67:2: ( ( rule__X21__Group__0 ) )
            {
            // InternalX21.g:67:2: ( ( rule__X21__Group__0 ) )
            // InternalX21.g:68:3: ( rule__X21__Group__0 )
            {
             before(grammarAccess.getX21Access().getGroup()); 
            // InternalX21.g:69:3: ( rule__X21__Group__0 )
            // InternalX21.g:69:4: rule__X21__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__X21__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getX21Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleX21"


    // $ANTLR start "entryRuleDeclaration"
    // InternalX21.g:78:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalX21.g:79:1: ( ruleDeclaration EOF )
            // InternalX21.g:80:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalX21.g:87:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:91:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // InternalX21.g:92:2: ( ( rule__Declaration__Alternatives ) )
            {
            // InternalX21.g:92:2: ( ( rule__Declaration__Alternatives ) )
            // InternalX21.g:93:3: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // InternalX21.g:94:3: ( rule__Declaration__Alternatives )
            // InternalX21.g:94:4: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "ruleNameAndType"
    // InternalX21.g:104:1: ruleNameAndType : ( ( rule__NameAndType__Group__0 ) ) ;
    public final void ruleNameAndType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:108:2: ( ( ( rule__NameAndType__Group__0 ) ) )
            // InternalX21.g:109:2: ( ( rule__NameAndType__Group__0 ) )
            {
            // InternalX21.g:109:2: ( ( rule__NameAndType__Group__0 ) )
            // InternalX21.g:110:3: ( rule__NameAndType__Group__0 )
            {
             before(grammarAccess.getNameAndTypeAccess().getGroup()); 
            // InternalX21.g:111:3: ( rule__NameAndType__Group__0 )
            // InternalX21.g:111:4: rule__NameAndType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NameAndType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNameAndTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNameAndType"


    // $ANTLR start "entryRuleParameter"
    // InternalX21.g:120:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalX21.g:121:1: ( ruleParameter EOF )
            // InternalX21.g:122:1: ruleParameter EOF
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
    // InternalX21.g:129:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:133:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalX21.g:134:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalX21.g:134:2: ( ( rule__Parameter__Group__0 ) )
            // InternalX21.g:135:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalX21.g:136:3: ( rule__Parameter__Group__0 )
            // InternalX21.g:136:4: rule__Parameter__Group__0
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


    // $ANTLR start "entryRuleFunction"
    // InternalX21.g:145:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalX21.g:146:1: ( ruleFunction EOF )
            // InternalX21.g:147:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalX21.g:154:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:158:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalX21.g:159:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalX21.g:159:2: ( ( rule__Function__Group__0 ) )
            // InternalX21.g:160:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalX21.g:161:3: ( rule__Function__Group__0 )
            // InternalX21.g:161:4: rule__Function__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleLambda"
    // InternalX21.g:170:1: entryRuleLambda : ruleLambda EOF ;
    public final void entryRuleLambda() throws RecognitionException {
        try {
            // InternalX21.g:171:1: ( ruleLambda EOF )
            // InternalX21.g:172:1: ruleLambda EOF
            {
             before(grammarAccess.getLambdaRule()); 
            pushFollow(FOLLOW_1);
            ruleLambda();

            state._fsp--;

             after(grammarAccess.getLambdaRule()); 
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
    // $ANTLR end "entryRuleLambda"


    // $ANTLR start "ruleLambda"
    // InternalX21.g:179:1: ruleLambda : ( ( rule__Lambda__Group__0 ) ) ;
    public final void ruleLambda() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:183:2: ( ( ( rule__Lambda__Group__0 ) ) )
            // InternalX21.g:184:2: ( ( rule__Lambda__Group__0 ) )
            {
            // InternalX21.g:184:2: ( ( rule__Lambda__Group__0 ) )
            // InternalX21.g:185:3: ( rule__Lambda__Group__0 )
            {
             before(grammarAccess.getLambdaAccess().getGroup()); 
            // InternalX21.g:186:3: ( rule__Lambda__Group__0 )
            // InternalX21.g:186:4: rule__Lambda__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLambdaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLambda"


    // $ANTLR start "entryRuleInput"
    // InternalX21.g:195:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalX21.g:196:1: ( ruleInput EOF )
            // InternalX21.g:197:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalX21.g:204:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:208:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalX21.g:209:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalX21.g:209:2: ( ( rule__Input__Group__0 ) )
            // InternalX21.g:210:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalX21.g:211:3: ( rule__Input__Group__0 )
            // InternalX21.g:211:4: rule__Input__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleFunctionOrLambda"
    // InternalX21.g:220:1: entryRuleFunctionOrLambda : ruleFunctionOrLambda EOF ;
    public final void entryRuleFunctionOrLambda() throws RecognitionException {
        try {
            // InternalX21.g:221:1: ( ruleFunctionOrLambda EOF )
            // InternalX21.g:222:1: ruleFunctionOrLambda EOF
            {
             before(grammarAccess.getFunctionOrLambdaRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionOrLambda();

            state._fsp--;

             after(grammarAccess.getFunctionOrLambdaRule()); 
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
    // $ANTLR end "entryRuleFunctionOrLambda"


    // $ANTLR start "ruleFunctionOrLambda"
    // InternalX21.g:229:1: ruleFunctionOrLambda : ( ( rule__FunctionOrLambda__Group__0 ) ) ;
    public final void ruleFunctionOrLambda() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:233:2: ( ( ( rule__FunctionOrLambda__Group__0 ) ) )
            // InternalX21.g:234:2: ( ( rule__FunctionOrLambda__Group__0 ) )
            {
            // InternalX21.g:234:2: ( ( rule__FunctionOrLambda__Group__0 ) )
            // InternalX21.g:235:3: ( rule__FunctionOrLambda__Group__0 )
            {
             before(grammarAccess.getFunctionOrLambdaAccess().getGroup()); 
            // InternalX21.g:236:3: ( rule__FunctionOrLambda__Group__0 )
            // InternalX21.g:236:4: rule__FunctionOrLambda__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionOrLambda__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionOrLambdaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionOrLambda"


    // $ANTLR start "entryRuleNode"
    // InternalX21.g:245:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalX21.g:246:1: ( ruleNode EOF )
            // InternalX21.g:247:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalX21.g:254:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:258:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalX21.g:259:2: ( ( rule__Node__Group__0 ) )
            {
            // InternalX21.g:259:2: ( ( rule__Node__Group__0 ) )
            // InternalX21.g:260:3: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // InternalX21.g:261:3: ( rule__Node__Group__0 )
            // InternalX21.g:261:4: rule__Node__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleNodeOrInput"
    // InternalX21.g:270:1: entryRuleNodeOrInput : ruleNodeOrInput EOF ;
    public final void entryRuleNodeOrInput() throws RecognitionException {
        try {
            // InternalX21.g:271:1: ( ruleNodeOrInput EOF )
            // InternalX21.g:272:1: ruleNodeOrInput EOF
            {
             before(grammarAccess.getNodeOrInputRule()); 
            pushFollow(FOLLOW_1);
            ruleNodeOrInput();

            state._fsp--;

             after(grammarAccess.getNodeOrInputRule()); 
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
    // $ANTLR end "entryRuleNodeOrInput"


    // $ANTLR start "ruleNodeOrInput"
    // InternalX21.g:279:1: ruleNodeOrInput : ( ( rule__NodeOrInput__Alternatives ) ) ;
    public final void ruleNodeOrInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:283:2: ( ( ( rule__NodeOrInput__Alternatives ) ) )
            // InternalX21.g:284:2: ( ( rule__NodeOrInput__Alternatives ) )
            {
            // InternalX21.g:284:2: ( ( rule__NodeOrInput__Alternatives ) )
            // InternalX21.g:285:3: ( rule__NodeOrInput__Alternatives )
            {
             before(grammarAccess.getNodeOrInputAccess().getAlternatives()); 
            // InternalX21.g:286:3: ( rule__NodeOrInput__Alternatives )
            // InternalX21.g:286:4: rule__NodeOrInput__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NodeOrInput__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNodeOrInputAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeOrInput"


    // $ANTLR start "entryRuleStream"
    // InternalX21.g:295:1: entryRuleStream : ruleStream EOF ;
    public final void entryRuleStream() throws RecognitionException {
        try {
            // InternalX21.g:296:1: ( ruleStream EOF )
            // InternalX21.g:297:1: ruleStream EOF
            {
             before(grammarAccess.getStreamRule()); 
            pushFollow(FOLLOW_1);
            ruleStream();

            state._fsp--;

             after(grammarAccess.getStreamRule()); 
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
    // $ANTLR end "entryRuleStream"


    // $ANTLR start "ruleStream"
    // InternalX21.g:304:1: ruleStream : ( ( rule__Stream__Group__0 ) ) ;
    public final void ruleStream() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:308:2: ( ( ( rule__Stream__Group__0 ) ) )
            // InternalX21.g:309:2: ( ( rule__Stream__Group__0 ) )
            {
            // InternalX21.g:309:2: ( ( rule__Stream__Group__0 ) )
            // InternalX21.g:310:3: ( rule__Stream__Group__0 )
            {
             before(grammarAccess.getStreamAccess().getGroup()); 
            // InternalX21.g:311:3: ( rule__Stream__Group__0 )
            // InternalX21.g:311:4: rule__Stream__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Stream__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStream"


    // $ANTLR start "entryRuleElementList"
    // InternalX21.g:320:1: entryRuleElementList : ruleElementList EOF ;
    public final void entryRuleElementList() throws RecognitionException {
        try {
            // InternalX21.g:321:1: ( ruleElementList EOF )
            // InternalX21.g:322:1: ruleElementList EOF
            {
             before(grammarAccess.getElementListRule()); 
            pushFollow(FOLLOW_1);
            ruleElementList();

            state._fsp--;

             after(grammarAccess.getElementListRule()); 
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
    // $ANTLR end "entryRuleElementList"


    // $ANTLR start "ruleElementList"
    // InternalX21.g:329:1: ruleElementList : ( ( rule__ElementList__Group__0 ) ) ;
    public final void ruleElementList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:333:2: ( ( ( rule__ElementList__Group__0 ) ) )
            // InternalX21.g:334:2: ( ( rule__ElementList__Group__0 ) )
            {
            // InternalX21.g:334:2: ( ( rule__ElementList__Group__0 ) )
            // InternalX21.g:335:3: ( rule__ElementList__Group__0 )
            {
             before(grammarAccess.getElementListAccess().getGroup()); 
            // InternalX21.g:336:3: ( rule__ElementList__Group__0 )
            // InternalX21.g:336:4: rule__ElementList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElementList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementList"


    // $ANTLR start "entryRuleElement"
    // InternalX21.g:345:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalX21.g:346:1: ( ruleElement EOF )
            // InternalX21.g:347:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalX21.g:354:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:358:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalX21.g:359:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalX21.g:359:2: ( ( rule__Element__Alternatives ) )
            // InternalX21.g:360:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalX21.g:361:3: ( rule__Element__Alternatives )
            // InternalX21.g:361:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleDataDecl"
    // InternalX21.g:370:1: entryRuleDataDecl : ruleDataDecl EOF ;
    public final void entryRuleDataDecl() throws RecognitionException {
        try {
            // InternalX21.g:371:1: ( ruleDataDecl EOF )
            // InternalX21.g:372:1: ruleDataDecl EOF
            {
             before(grammarAccess.getDataDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleDataDecl();

            state._fsp--;

             after(grammarAccess.getDataDeclRule()); 
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
    // $ANTLR end "entryRuleDataDecl"


    // $ANTLR start "ruleDataDecl"
    // InternalX21.g:379:1: ruleDataDecl : ( ( rule__DataDecl__Group__0 ) ) ;
    public final void ruleDataDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:383:2: ( ( ( rule__DataDecl__Group__0 ) ) )
            // InternalX21.g:384:2: ( ( rule__DataDecl__Group__0 ) )
            {
            // InternalX21.g:384:2: ( ( rule__DataDecl__Group__0 ) )
            // InternalX21.g:385:3: ( rule__DataDecl__Group__0 )
            {
             before(grammarAccess.getDataDeclAccess().getGroup()); 
            // InternalX21.g:386:3: ( rule__DataDecl__Group__0 )
            // InternalX21.g:386:4: rule__DataDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataDecl"


    // $ANTLR start "entryRuleDataVariable"
    // InternalX21.g:395:1: entryRuleDataVariable : ruleDataVariable EOF ;
    public final void entryRuleDataVariable() throws RecognitionException {
        try {
            // InternalX21.g:396:1: ( ruleDataVariable EOF )
            // InternalX21.g:397:1: ruleDataVariable EOF
            {
             before(grammarAccess.getDataVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleDataVariable();

            state._fsp--;

             after(grammarAccess.getDataVariableRule()); 
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
    // $ANTLR end "entryRuleDataVariable"


    // $ANTLR start "ruleDataVariable"
    // InternalX21.g:404:1: ruleDataVariable : ( ( rule__DataVariable__Group__0 ) ) ;
    public final void ruleDataVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:408:2: ( ( ( rule__DataVariable__Group__0 ) ) )
            // InternalX21.g:409:2: ( ( rule__DataVariable__Group__0 ) )
            {
            // InternalX21.g:409:2: ( ( rule__DataVariable__Group__0 ) )
            // InternalX21.g:410:3: ( rule__DataVariable__Group__0 )
            {
             before(grammarAccess.getDataVariableAccess().getGroup()); 
            // InternalX21.g:411:3: ( rule__DataVariable__Group__0 )
            // InternalX21.g:411:4: rule__DataVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataVariable"


    // $ANTLR start "entryRuleType"
    // InternalX21.g:420:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalX21.g:421:1: ( ruleType EOF )
            // InternalX21.g:422:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalX21.g:429:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:433:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalX21.g:434:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalX21.g:434:2: ( ( rule__Type__Alternatives ) )
            // InternalX21.g:435:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalX21.g:436:3: ( rule__Type__Alternatives )
            // InternalX21.g:436:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleLogicExp"
    // InternalX21.g:445:1: entryRuleLogicExp : ruleLogicExp EOF ;
    public final void entryRuleLogicExp() throws RecognitionException {
        try {
            // InternalX21.g:446:1: ( ruleLogicExp EOF )
            // InternalX21.g:447:1: ruleLogicExp EOF
            {
             before(grammarAccess.getLogicExpRule()); 
            pushFollow(FOLLOW_1);
            ruleLogicExp();

            state._fsp--;

             after(grammarAccess.getLogicExpRule()); 
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
    // $ANTLR end "entryRuleLogicExp"


    // $ANTLR start "ruleLogicExp"
    // InternalX21.g:454:1: ruleLogicExp : ( ( rule__LogicExp__Group__0 ) ) ;
    public final void ruleLogicExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:458:2: ( ( ( rule__LogicExp__Group__0 ) ) )
            // InternalX21.g:459:2: ( ( rule__LogicExp__Group__0 ) )
            {
            // InternalX21.g:459:2: ( ( rule__LogicExp__Group__0 ) )
            // InternalX21.g:460:3: ( rule__LogicExp__Group__0 )
            {
             before(grammarAccess.getLogicExpAccess().getGroup()); 
            // InternalX21.g:461:3: ( rule__LogicExp__Group__0 )
            // InternalX21.g:461:4: rule__LogicExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LogicExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicExp"


    // $ANTLR start "entryRuleExp"
    // InternalX21.g:470:1: entryRuleExp : ruleExp EOF ;
    public final void entryRuleExp() throws RecognitionException {
        try {
            // InternalX21.g:471:1: ( ruleExp EOF )
            // InternalX21.g:472:1: ruleExp EOF
            {
             before(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpRule()); 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalX21.g:479:1: ruleExp : ( ( rule__Exp__Group__0 ) ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:483:2: ( ( ( rule__Exp__Group__0 ) ) )
            // InternalX21.g:484:2: ( ( rule__Exp__Group__0 ) )
            {
            // InternalX21.g:484:2: ( ( rule__Exp__Group__0 ) )
            // InternalX21.g:485:3: ( rule__Exp__Group__0 )
            {
             before(grammarAccess.getExpAccess().getGroup()); 
            // InternalX21.g:486:3: ( rule__Exp__Group__0 )
            // InternalX21.g:486:4: rule__Exp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleMulDiv"
    // InternalX21.g:495:1: entryRuleMulDiv : ruleMulDiv EOF ;
    public final void entryRuleMulDiv() throws RecognitionException {
        try {
            // InternalX21.g:496:1: ( ruleMulDiv EOF )
            // InternalX21.g:497:1: ruleMulDiv EOF
            {
             before(grammarAccess.getMulDivRule()); 
            pushFollow(FOLLOW_1);
            ruleMulDiv();

            state._fsp--;

             after(grammarAccess.getMulDivRule()); 
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
    // $ANTLR end "entryRuleMulDiv"


    // $ANTLR start "ruleMulDiv"
    // InternalX21.g:504:1: ruleMulDiv : ( ( rule__MulDiv__Group__0 ) ) ;
    public final void ruleMulDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:508:2: ( ( ( rule__MulDiv__Group__0 ) ) )
            // InternalX21.g:509:2: ( ( rule__MulDiv__Group__0 ) )
            {
            // InternalX21.g:509:2: ( ( rule__MulDiv__Group__0 ) )
            // InternalX21.g:510:3: ( rule__MulDiv__Group__0 )
            {
             before(grammarAccess.getMulDivAccess().getGroup()); 
            // InternalX21.g:511:3: ( rule__MulDiv__Group__0 )
            // InternalX21.g:511:4: rule__MulDiv__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MulDiv__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMulDivAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMulDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalX21.g:520:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalX21.g:521:1: ( rulePrimary EOF )
            // InternalX21.g:522:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalX21.g:529:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:533:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalX21.g:534:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalX21.g:534:2: ( ( rule__Primary__Alternatives ) )
            // InternalX21.g:535:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalX21.g:536:3: ( rule__Primary__Alternatives )
            // InternalX21.g:536:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleLetStatement"
    // InternalX21.g:545:1: entryRuleLetStatement : ruleLetStatement EOF ;
    public final void entryRuleLetStatement() throws RecognitionException {
        try {
            // InternalX21.g:546:1: ( ruleLetStatement EOF )
            // InternalX21.g:547:1: ruleLetStatement EOF
            {
             before(grammarAccess.getLetStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleLetStatement();

            state._fsp--;

             after(grammarAccess.getLetStatementRule()); 
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
    // $ANTLR end "entryRuleLetStatement"


    // $ANTLR start "ruleLetStatement"
    // InternalX21.g:554:1: ruleLetStatement : ( ( rule__LetStatement__Group__0 ) ) ;
    public final void ruleLetStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:558:2: ( ( ( rule__LetStatement__Group__0 ) ) )
            // InternalX21.g:559:2: ( ( rule__LetStatement__Group__0 ) )
            {
            // InternalX21.g:559:2: ( ( rule__LetStatement__Group__0 ) )
            // InternalX21.g:560:3: ( rule__LetStatement__Group__0 )
            {
             before(grammarAccess.getLetStatementAccess().getGroup()); 
            // InternalX21.g:561:3: ( rule__LetStatement__Group__0 )
            // InternalX21.g:561:4: rule__LetStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LetStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLetStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLetStatement"


    // $ANTLR start "entryRuleDataAccess"
    // InternalX21.g:570:1: entryRuleDataAccess : ruleDataAccess EOF ;
    public final void entryRuleDataAccess() throws RecognitionException {
        try {
            // InternalX21.g:571:1: ( ruleDataAccess EOF )
            // InternalX21.g:572:1: ruleDataAccess EOF
            {
             before(grammarAccess.getDataAccessRule()); 
            pushFollow(FOLLOW_1);
            ruleDataAccess();

            state._fsp--;

             after(grammarAccess.getDataAccessRule()); 
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
    // $ANTLR end "entryRuleDataAccess"


    // $ANTLR start "ruleDataAccess"
    // InternalX21.g:579:1: ruleDataAccess : ( ( rule__DataAccess__Group__0 ) ) ;
    public final void ruleDataAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:583:2: ( ( ( rule__DataAccess__Group__0 ) ) )
            // InternalX21.g:584:2: ( ( rule__DataAccess__Group__0 ) )
            {
            // InternalX21.g:584:2: ( ( rule__DataAccess__Group__0 ) )
            // InternalX21.g:585:3: ( rule__DataAccess__Group__0 )
            {
             before(grammarAccess.getDataAccessAccess().getGroup()); 
            // InternalX21.g:586:3: ( rule__DataAccess__Group__0 )
            // InternalX21.g:586:4: rule__DataAccess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataAccess__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataAccess"


    // $ANTLR start "entryRuleNone"
    // InternalX21.g:595:1: entryRuleNone : ruleNone EOF ;
    public final void entryRuleNone() throws RecognitionException {
        try {
            // InternalX21.g:596:1: ( ruleNone EOF )
            // InternalX21.g:597:1: ruleNone EOF
            {
             before(grammarAccess.getNoneRule()); 
            pushFollow(FOLLOW_1);
            ruleNone();

            state._fsp--;

             after(grammarAccess.getNoneRule()); 
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
    // $ANTLR end "entryRuleNone"


    // $ANTLR start "ruleNone"
    // InternalX21.g:604:1: ruleNone : ( ( rule__None__Group__0 ) ) ;
    public final void ruleNone() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:608:2: ( ( ( rule__None__Group__0 ) ) )
            // InternalX21.g:609:2: ( ( rule__None__Group__0 ) )
            {
            // InternalX21.g:609:2: ( ( rule__None__Group__0 ) )
            // InternalX21.g:610:3: ( rule__None__Group__0 )
            {
             before(grammarAccess.getNoneAccess().getGroup()); 
            // InternalX21.g:611:3: ( rule__None__Group__0 )
            // InternalX21.g:611:4: rule__None__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__None__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNone"


    // $ANTLR start "entryRuleIfStatement"
    // InternalX21.g:620:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // InternalX21.g:621:1: ( ruleIfStatement EOF )
            // InternalX21.g:622:1: ruleIfStatement EOF
            {
             before(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleIfStatement();

            state._fsp--;

             after(grammarAccess.getIfStatementRule()); 
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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalX21.g:629:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:633:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // InternalX21.g:634:2: ( ( rule__IfStatement__Group__0 ) )
            {
            // InternalX21.g:634:2: ( ( rule__IfStatement__Group__0 ) )
            // InternalX21.g:635:3: ( rule__IfStatement__Group__0 )
            {
             before(grammarAccess.getIfStatementAccess().getGroup()); 
            // InternalX21.g:636:3: ( rule__IfStatement__Group__0 )
            // InternalX21.g:636:4: rule__IfStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleNewStatement"
    // InternalX21.g:645:1: entryRuleNewStatement : ruleNewStatement EOF ;
    public final void entryRuleNewStatement() throws RecognitionException {
        try {
            // InternalX21.g:646:1: ( ruleNewStatement EOF )
            // InternalX21.g:647:1: ruleNewStatement EOF
            {
             before(grammarAccess.getNewStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleNewStatement();

            state._fsp--;

             after(grammarAccess.getNewStatementRule()); 
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
    // $ANTLR end "entryRuleNewStatement"


    // $ANTLR start "ruleNewStatement"
    // InternalX21.g:654:1: ruleNewStatement : ( ( rule__NewStatement__Group__0 ) ) ;
    public final void ruleNewStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:658:2: ( ( ( rule__NewStatement__Group__0 ) ) )
            // InternalX21.g:659:2: ( ( rule__NewStatement__Group__0 ) )
            {
            // InternalX21.g:659:2: ( ( rule__NewStatement__Group__0 ) )
            // InternalX21.g:660:3: ( rule__NewStatement__Group__0 )
            {
             before(grammarAccess.getNewStatementAccess().getGroup()); 
            // InternalX21.g:661:3: ( rule__NewStatement__Group__0 )
            // InternalX21.g:661:4: rule__NewStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NewStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNewStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNewStatement"


    // $ANTLR start "entryRuleVarAssignment"
    // InternalX21.g:670:1: entryRuleVarAssignment : ruleVarAssignment EOF ;
    public final void entryRuleVarAssignment() throws RecognitionException {
        try {
            // InternalX21.g:671:1: ( ruleVarAssignment EOF )
            // InternalX21.g:672:1: ruleVarAssignment EOF
            {
             before(grammarAccess.getVarAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleVarAssignment();

            state._fsp--;

             after(grammarAccess.getVarAssignmentRule()); 
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
    // $ANTLR end "entryRuleVarAssignment"


    // $ANTLR start "ruleVarAssignment"
    // InternalX21.g:679:1: ruleVarAssignment : ( ( rule__VarAssignment__Group__0 ) ) ;
    public final void ruleVarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:683:2: ( ( ( rule__VarAssignment__Group__0 ) ) )
            // InternalX21.g:684:2: ( ( rule__VarAssignment__Group__0 ) )
            {
            // InternalX21.g:684:2: ( ( rule__VarAssignment__Group__0 ) )
            // InternalX21.g:685:3: ( rule__VarAssignment__Group__0 )
            {
             before(grammarAccess.getVarAssignmentAccess().getGroup()); 
            // InternalX21.g:686:3: ( rule__VarAssignment__Group__0 )
            // InternalX21.g:686:4: rule__VarAssignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarAssignment"


    // $ANTLR start "rule__Declaration__Alternatives"
    // InternalX21.g:694:1: rule__Declaration__Alternatives : ( ( ruleFunction ) | ( ruleInput ) | ( ruleNode ) | ( ruleStream ) | ( ruleDataDecl ) | ( ruleParameter ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:698:1: ( ( ruleFunction ) | ( ruleInput ) | ( ruleNode ) | ( ruleStream ) | ( ruleDataDecl ) | ( ruleParameter ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case 22:
                {
                alt1=3;
                }
                break;
            case 23:
                {
                alt1=4;
                }
                break;
            case 27:
                {
                alt1=5;
                }
                break;
            case 13:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalX21.g:699:2: ( ruleFunction )
                    {
                    // InternalX21.g:699:2: ( ruleFunction )
                    // InternalX21.g:700:3: ruleFunction
                    {
                     before(grammarAccess.getDeclarationAccess().getFunctionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFunction();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getFunctionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:705:2: ( ruleInput )
                    {
                    // InternalX21.g:705:2: ( ruleInput )
                    // InternalX21.g:706:3: ruleInput
                    {
                     before(grammarAccess.getDeclarationAccess().getInputParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInput();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getInputParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalX21.g:711:2: ( ruleNode )
                    {
                    // InternalX21.g:711:2: ( ruleNode )
                    // InternalX21.g:712:3: ruleNode
                    {
                     before(grammarAccess.getDeclarationAccess().getNodeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNode();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getNodeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalX21.g:717:2: ( ruleStream )
                    {
                    // InternalX21.g:717:2: ( ruleStream )
                    // InternalX21.g:718:3: ruleStream
                    {
                     before(grammarAccess.getDeclarationAccess().getStreamParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleStream();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getStreamParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalX21.g:723:2: ( ruleDataDecl )
                    {
                    // InternalX21.g:723:2: ( ruleDataDecl )
                    // InternalX21.g:724:3: ruleDataDecl
                    {
                     before(grammarAccess.getDeclarationAccess().getDataDeclParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDataDecl();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getDataDeclParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalX21.g:729:2: ( ruleParameter )
                    {
                    // InternalX21.g:729:2: ( ruleParameter )
                    // InternalX21.g:730:3: ruleParameter
                    {
                     before(grammarAccess.getDeclarationAccess().getParameterParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleParameter();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getParameterParserRuleCall_5()); 

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
    // $ANTLR end "rule__Declaration__Alternatives"


    // $ANTLR start "rule__FunctionOrLambda__Alternatives_1"
    // InternalX21.g:739:1: rule__FunctionOrLambda__Alternatives_1 : ( ( ( rule__FunctionOrLambda__Group_1_0__0 ) ) | ( ruleLambda ) );
    public final void rule__FunctionOrLambda__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:743:1: ( ( ( rule__FunctionOrLambda__Group_1_0__0 ) ) | ( ruleLambda ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalX21.g:744:2: ( ( rule__FunctionOrLambda__Group_1_0__0 ) )
                    {
                    // InternalX21.g:744:2: ( ( rule__FunctionOrLambda__Group_1_0__0 ) )
                    // InternalX21.g:745:3: ( rule__FunctionOrLambda__Group_1_0__0 )
                    {
                     before(grammarAccess.getFunctionOrLambdaAccess().getGroup_1_0()); 
                    // InternalX21.g:746:3: ( rule__FunctionOrLambda__Group_1_0__0 )
                    // InternalX21.g:746:4: rule__FunctionOrLambda__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionOrLambda__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionOrLambdaAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:750:2: ( ruleLambda )
                    {
                    // InternalX21.g:750:2: ( ruleLambda )
                    // InternalX21.g:751:3: ruleLambda
                    {
                     before(grammarAccess.getFunctionOrLambdaAccess().getLambdaParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLambda();

                    state._fsp--;

                     after(grammarAccess.getFunctionOrLambdaAccess().getLambdaParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__FunctionOrLambda__Alternatives_1"


    // $ANTLR start "rule__NodeOrInput__Alternatives"
    // InternalX21.g:760:1: rule__NodeOrInput__Alternatives : ( ( ruleNode ) | ( ruleInput ) );
    public final void rule__NodeOrInput__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:764:1: ( ( ruleNode ) | ( ruleInput ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalX21.g:765:2: ( ruleNode )
                    {
                    // InternalX21.g:765:2: ( ruleNode )
                    // InternalX21.g:766:3: ruleNode
                    {
                     before(grammarAccess.getNodeOrInputAccess().getNodeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNode();

                    state._fsp--;

                     after(grammarAccess.getNodeOrInputAccess().getNodeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:771:2: ( ruleInput )
                    {
                    // InternalX21.g:771:2: ( ruleInput )
                    // InternalX21.g:772:3: ruleInput
                    {
                     before(grammarAccess.getNodeOrInputAccess().getInputParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInput();

                    state._fsp--;

                     after(grammarAccess.getNodeOrInputAccess().getInputParserRuleCall_1()); 

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
    // $ANTLR end "rule__NodeOrInput__Alternatives"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalX21.g:781:1: rule__Element__Alternatives : ( ( ( rule__Element__Group_0__0 ) ) | ( ( rule__Element__Group_1__0 ) ) | ( ( rule__Element__Group_2__0 ) ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:785:1: ( ( ( rule__Element__Group_0__0 ) ) | ( ( rule__Element__Group_1__0 ) ) | ( ( rule__Element__Group_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 26:
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
                    // InternalX21.g:786:2: ( ( rule__Element__Group_0__0 ) )
                    {
                    // InternalX21.g:786:2: ( ( rule__Element__Group_0__0 ) )
                    // InternalX21.g:787:3: ( rule__Element__Group_0__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_0()); 
                    // InternalX21.g:788:3: ( rule__Element__Group_0__0 )
                    // InternalX21.g:788:4: rule__Element__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:792:2: ( ( rule__Element__Group_1__0 ) )
                    {
                    // InternalX21.g:792:2: ( ( rule__Element__Group_1__0 ) )
                    // InternalX21.g:793:3: ( rule__Element__Group_1__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_1()); 
                    // InternalX21.g:794:3: ( rule__Element__Group_1__0 )
                    // InternalX21.g:794:4: rule__Element__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalX21.g:798:2: ( ( rule__Element__Group_2__0 ) )
                    {
                    // InternalX21.g:798:2: ( ( rule__Element__Group_2__0 ) )
                    // InternalX21.g:799:3: ( rule__Element__Group_2__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_2()); 
                    // InternalX21.g:800:3: ( rule__Element__Group_2__0 )
                    // InternalX21.g:800:4: rule__Element__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalX21.g:808:1: rule__Type__Alternatives : ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:812:1: ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt5=1;
                }
                break;
            case 29:
                {
                alt5=2;
                }
                break;
            case RULE_ID:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalX21.g:813:2: ( ( rule__Type__Group_0__0 ) )
                    {
                    // InternalX21.g:813:2: ( ( rule__Type__Group_0__0 ) )
                    // InternalX21.g:814:3: ( rule__Type__Group_0__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_0()); 
                    // InternalX21.g:815:3: ( rule__Type__Group_0__0 )
                    // InternalX21.g:815:4: rule__Type__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:819:2: ( ( rule__Type__Group_1__0 ) )
                    {
                    // InternalX21.g:819:2: ( ( rule__Type__Group_1__0 ) )
                    // InternalX21.g:820:3: ( rule__Type__Group_1__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_1()); 
                    // InternalX21.g:821:3: ( rule__Type__Group_1__0 )
                    // InternalX21.g:821:4: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalX21.g:825:2: ( ( rule__Type__Group_2__0 ) )
                    {
                    // InternalX21.g:825:2: ( ( rule__Type__Group_2__0 ) )
                    // InternalX21.g:826:3: ( rule__Type__Group_2__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_2()); 
                    // InternalX21.g:827:3: ( rule__Type__Group_2__0 )
                    // InternalX21.g:827:4: rule__Type__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__LogicExp__Alternatives_1"
    // InternalX21.g:835:1: rule__LogicExp__Alternatives_1 : ( ( ( rule__LogicExp__Group_1_0__0 ) ) | ( ( rule__LogicExp__Group_1_1__0 ) ) | ( ( rule__LogicExp__Group_1_2__0 ) ) | ( ( rule__LogicExp__Group_1_3__0 ) ) | ( ( rule__LogicExp__Group_1_4__0 ) ) );
    public final void rule__LogicExp__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:839:1: ( ( ( rule__LogicExp__Group_1_0__0 ) ) | ( ( rule__LogicExp__Group_1_1__0 ) ) | ( ( rule__LogicExp__Group_1_2__0 ) ) | ( ( rule__LogicExp__Group_1_3__0 ) ) | ( ( rule__LogicExp__Group_1_4__0 ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt6=1;
                }
                break;
            case 31:
                {
                alt6=2;
                }
                break;
            case 32:
                {
                alt6=3;
                }
                break;
            case 33:
                {
                alt6=4;
                }
                break;
            case 34:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalX21.g:840:2: ( ( rule__LogicExp__Group_1_0__0 ) )
                    {
                    // InternalX21.g:840:2: ( ( rule__LogicExp__Group_1_0__0 ) )
                    // InternalX21.g:841:3: ( rule__LogicExp__Group_1_0__0 )
                    {
                     before(grammarAccess.getLogicExpAccess().getGroup_1_0()); 
                    // InternalX21.g:842:3: ( rule__LogicExp__Group_1_0__0 )
                    // InternalX21.g:842:4: rule__LogicExp__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LogicExp__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLogicExpAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:846:2: ( ( rule__LogicExp__Group_1_1__0 ) )
                    {
                    // InternalX21.g:846:2: ( ( rule__LogicExp__Group_1_1__0 ) )
                    // InternalX21.g:847:3: ( rule__LogicExp__Group_1_1__0 )
                    {
                     before(grammarAccess.getLogicExpAccess().getGroup_1_1()); 
                    // InternalX21.g:848:3: ( rule__LogicExp__Group_1_1__0 )
                    // InternalX21.g:848:4: rule__LogicExp__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LogicExp__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLogicExpAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalX21.g:852:2: ( ( rule__LogicExp__Group_1_2__0 ) )
                    {
                    // InternalX21.g:852:2: ( ( rule__LogicExp__Group_1_2__0 ) )
                    // InternalX21.g:853:3: ( rule__LogicExp__Group_1_2__0 )
                    {
                     before(grammarAccess.getLogicExpAccess().getGroup_1_2()); 
                    // InternalX21.g:854:3: ( rule__LogicExp__Group_1_2__0 )
                    // InternalX21.g:854:4: rule__LogicExp__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LogicExp__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLogicExpAccess().getGroup_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalX21.g:858:2: ( ( rule__LogicExp__Group_1_3__0 ) )
                    {
                    // InternalX21.g:858:2: ( ( rule__LogicExp__Group_1_3__0 ) )
                    // InternalX21.g:859:3: ( rule__LogicExp__Group_1_3__0 )
                    {
                     before(grammarAccess.getLogicExpAccess().getGroup_1_3()); 
                    // InternalX21.g:860:3: ( rule__LogicExp__Group_1_3__0 )
                    // InternalX21.g:860:4: rule__LogicExp__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LogicExp__Group_1_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLogicExpAccess().getGroup_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalX21.g:864:2: ( ( rule__LogicExp__Group_1_4__0 ) )
                    {
                    // InternalX21.g:864:2: ( ( rule__LogicExp__Group_1_4__0 ) )
                    // InternalX21.g:865:3: ( rule__LogicExp__Group_1_4__0 )
                    {
                     before(grammarAccess.getLogicExpAccess().getGroup_1_4()); 
                    // InternalX21.g:866:3: ( rule__LogicExp__Group_1_4__0 )
                    // InternalX21.g:866:4: rule__LogicExp__Group_1_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LogicExp__Group_1_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLogicExpAccess().getGroup_1_4()); 

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
    // $ANTLR end "rule__LogicExp__Alternatives_1"


    // $ANTLR start "rule__Exp__Alternatives_1_0"
    // InternalX21.g:874:1: rule__Exp__Alternatives_1_0 : ( ( ( rule__Exp__Group_1_0_0__0 ) ) | ( () ) );
    public final void rule__Exp__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:878:1: ( ( ( rule__Exp__Group_1_0_0__0 ) ) | ( () ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==35) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_INT)||LA7_0==15||LA7_0==38||(LA7_0>=42 && LA7_0<=43)||LA7_0==46) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalX21.g:879:2: ( ( rule__Exp__Group_1_0_0__0 ) )
                    {
                    // InternalX21.g:879:2: ( ( rule__Exp__Group_1_0_0__0 ) )
                    // InternalX21.g:880:3: ( rule__Exp__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_0()); 
                    // InternalX21.g:881:3: ( rule__Exp__Group_1_0_0__0 )
                    // InternalX21.g:881:4: rule__Exp__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:885:2: ( () )
                    {
                    // InternalX21.g:885:2: ( () )
                    // InternalX21.g:886:3: ()
                    {
                     before(grammarAccess.getExpAccess().getMinusLeftAction_1_0_1()); 
                    // InternalX21.g:887:3: ()
                    // InternalX21.g:887:4: 
                    {
                    }

                     after(grammarAccess.getExpAccess().getMinusLeftAction_1_0_1()); 

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
    // $ANTLR end "rule__Exp__Alternatives_1_0"


    // $ANTLR start "rule__MulDiv__Alternatives_1_0"
    // InternalX21.g:895:1: rule__MulDiv__Alternatives_1_0 : ( ( ( rule__MulDiv__Group_1_0_0__0 ) ) | ( ( rule__MulDiv__Group_1_0_1__0 ) ) );
    public final void rule__MulDiv__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:899:1: ( ( ( rule__MulDiv__Group_1_0_0__0 ) ) | ( ( rule__MulDiv__Group_1_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==36) ) {
                alt8=1;
            }
            else if ( (LA8_0==37) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalX21.g:900:2: ( ( rule__MulDiv__Group_1_0_0__0 ) )
                    {
                    // InternalX21.g:900:2: ( ( rule__MulDiv__Group_1_0_0__0 ) )
                    // InternalX21.g:901:3: ( rule__MulDiv__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMulDivAccess().getGroup_1_0_0()); 
                    // InternalX21.g:902:3: ( rule__MulDiv__Group_1_0_0__0 )
                    // InternalX21.g:902:4: rule__MulDiv__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MulDiv__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMulDivAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:906:2: ( ( rule__MulDiv__Group_1_0_1__0 ) )
                    {
                    // InternalX21.g:906:2: ( ( rule__MulDiv__Group_1_0_1__0 ) )
                    // InternalX21.g:907:3: ( rule__MulDiv__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMulDivAccess().getGroup_1_0_1()); 
                    // InternalX21.g:908:3: ( rule__MulDiv__Group_1_0_1__0 )
                    // InternalX21.g:908:4: rule__MulDiv__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MulDiv__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMulDivAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__MulDiv__Alternatives_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalX21.g:916:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleLetStatement ) | ( ruleDataAccess ) | ( ruleNone ) | ( ruleIfStatement ) | ( ruleNewStatement ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:920:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleLetStatement ) | ( ruleDataAccess ) | ( ruleNone ) | ( ruleIfStatement ) | ( ruleNewStatement ) )
            int alt9=7;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case 15:
                {
                alt9=2;
                }
                break;
            case 38:
                {
                alt9=3;
                }
                break;
            case RULE_ID:
                {
                alt9=4;
                }
                break;
            case 42:
                {
                alt9=5;
                }
                break;
            case 43:
                {
                alt9=6;
                }
                break;
            case 46:
                {
                alt9=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalX21.g:921:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalX21.g:921:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalX21.g:922:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalX21.g:923:3: ( rule__Primary__Group_0__0 )
                    // InternalX21.g:923:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:927:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalX21.g:927:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalX21.g:928:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalX21.g:929:3: ( rule__Primary__Group_1__0 )
                    // InternalX21.g:929:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalX21.g:933:2: ( ruleLetStatement )
                    {
                    // InternalX21.g:933:2: ( ruleLetStatement )
                    // InternalX21.g:934:3: ruleLetStatement
                    {
                     before(grammarAccess.getPrimaryAccess().getLetStatementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLetStatement();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getLetStatementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalX21.g:939:2: ( ruleDataAccess )
                    {
                    // InternalX21.g:939:2: ( ruleDataAccess )
                    // InternalX21.g:940:3: ruleDataAccess
                    {
                     before(grammarAccess.getPrimaryAccess().getDataAccessParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDataAccess();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getDataAccessParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalX21.g:945:2: ( ruleNone )
                    {
                    // InternalX21.g:945:2: ( ruleNone )
                    // InternalX21.g:946:3: ruleNone
                    {
                     before(grammarAccess.getPrimaryAccess().getNoneParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleNone();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getNoneParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalX21.g:951:2: ( ruleIfStatement )
                    {
                    // InternalX21.g:951:2: ( ruleIfStatement )
                    // InternalX21.g:952:3: ruleIfStatement
                    {
                     before(grammarAccess.getPrimaryAccess().getIfStatementParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleIfStatement();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getIfStatementParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalX21.g:957:2: ( ruleNewStatement )
                    {
                    // InternalX21.g:957:2: ( ruleNewStatement )
                    // InternalX21.g:958:3: ruleNewStatement
                    {
                     before(grammarAccess.getPrimaryAccess().getNewStatementParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleNewStatement();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getNewStatementParserRuleCall_6()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__X21__Group__0"
    // InternalX21.g:967:1: rule__X21__Group__0 : rule__X21__Group__0__Impl rule__X21__Group__1 ;
    public final void rule__X21__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:971:1: ( rule__X21__Group__0__Impl rule__X21__Group__1 )
            // InternalX21.g:972:2: rule__X21__Group__0__Impl rule__X21__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__X21__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__X21__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X21__Group__0"


    // $ANTLR start "rule__X21__Group__0__Impl"
    // InternalX21.g:979:1: rule__X21__Group__0__Impl : ( () ) ;
    public final void rule__X21__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:983:1: ( ( () ) )
            // InternalX21.g:984:1: ( () )
            {
            // InternalX21.g:984:1: ( () )
            // InternalX21.g:985:2: ()
            {
             before(grammarAccess.getX21Access().getX21Action_0()); 
            // InternalX21.g:986:2: ()
            // InternalX21.g:986:3: 
            {
            }

             after(grammarAccess.getX21Access().getX21Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X21__Group__0__Impl"


    // $ANTLR start "rule__X21__Group__1"
    // InternalX21.g:994:1: rule__X21__Group__1 : rule__X21__Group__1__Impl rule__X21__Group__2 ;
    public final void rule__X21__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:998:1: ( rule__X21__Group__1__Impl rule__X21__Group__2 )
            // InternalX21.g:999:2: rule__X21__Group__1__Impl rule__X21__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__X21__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__X21__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X21__Group__1"


    // $ANTLR start "rule__X21__Group__1__Impl"
    // InternalX21.g:1006:1: rule__X21__Group__1__Impl : ( 'program' ) ;
    public final void rule__X21__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1010:1: ( ( 'program' ) )
            // InternalX21.g:1011:1: ( 'program' )
            {
            // InternalX21.g:1011:1: ( 'program' )
            // InternalX21.g:1012:2: 'program'
            {
             before(grammarAccess.getX21Access().getProgramKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getX21Access().getProgramKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X21__Group__1__Impl"


    // $ANTLR start "rule__X21__Group__2"
    // InternalX21.g:1021:1: rule__X21__Group__2 : rule__X21__Group__2__Impl rule__X21__Group__3 ;
    public final void rule__X21__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1025:1: ( rule__X21__Group__2__Impl rule__X21__Group__3 )
            // InternalX21.g:1026:2: rule__X21__Group__2__Impl rule__X21__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__X21__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__X21__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X21__Group__2"


    // $ANTLR start "rule__X21__Group__2__Impl"
    // InternalX21.g:1033:1: rule__X21__Group__2__Impl : ( RULE_ID ) ;
    public final void rule__X21__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1037:1: ( ( RULE_ID ) )
            // InternalX21.g:1038:1: ( RULE_ID )
            {
            // InternalX21.g:1038:1: ( RULE_ID )
            // InternalX21.g:1039:2: RULE_ID
            {
             before(grammarAccess.getX21Access().getIDTerminalRuleCall_2()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getX21Access().getIDTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X21__Group__2__Impl"


    // $ANTLR start "rule__X21__Group__3"
    // InternalX21.g:1048:1: rule__X21__Group__3 : rule__X21__Group__3__Impl ;
    public final void rule__X21__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1052:1: ( rule__X21__Group__3__Impl )
            // InternalX21.g:1053:2: rule__X21__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__X21__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X21__Group__3"


    // $ANTLR start "rule__X21__Group__3__Impl"
    // InternalX21.g:1059:1: rule__X21__Group__3__Impl : ( ( rule__X21__DeclarationsAssignment_3 )* ) ;
    public final void rule__X21__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1063:1: ( ( ( rule__X21__DeclarationsAssignment_3 )* ) )
            // InternalX21.g:1064:1: ( ( rule__X21__DeclarationsAssignment_3 )* )
            {
            // InternalX21.g:1064:1: ( ( rule__X21__DeclarationsAssignment_3 )* )
            // InternalX21.g:1065:2: ( rule__X21__DeclarationsAssignment_3 )*
            {
             before(grammarAccess.getX21Access().getDeclarationsAssignment_3()); 
            // InternalX21.g:1066:2: ( rule__X21__DeclarationsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=13 && LA10_0<=14)||LA10_0==19||(LA10_0>=22 && LA10_0<=23)||LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalX21.g:1066:3: rule__X21__DeclarationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__X21__DeclarationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getX21Access().getDeclarationsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X21__Group__3__Impl"


    // $ANTLR start "rule__NameAndType__Group__0"
    // InternalX21.g:1075:1: rule__NameAndType__Group__0 : rule__NameAndType__Group__0__Impl rule__NameAndType__Group__1 ;
    public final void rule__NameAndType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1079:1: ( rule__NameAndType__Group__0__Impl rule__NameAndType__Group__1 )
            // InternalX21.g:1080:2: rule__NameAndType__Group__0__Impl rule__NameAndType__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__NameAndType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameAndType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameAndType__Group__0"


    // $ANTLR start "rule__NameAndType__Group__0__Impl"
    // InternalX21.g:1087:1: rule__NameAndType__Group__0__Impl : ( ( rule__NameAndType__NameAssignment_0 ) ) ;
    public final void rule__NameAndType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1091:1: ( ( ( rule__NameAndType__NameAssignment_0 ) ) )
            // InternalX21.g:1092:1: ( ( rule__NameAndType__NameAssignment_0 ) )
            {
            // InternalX21.g:1092:1: ( ( rule__NameAndType__NameAssignment_0 ) )
            // InternalX21.g:1093:2: ( rule__NameAndType__NameAssignment_0 )
            {
             before(grammarAccess.getNameAndTypeAccess().getNameAssignment_0()); 
            // InternalX21.g:1094:2: ( rule__NameAndType__NameAssignment_0 )
            // InternalX21.g:1094:3: rule__NameAndType__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NameAndType__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNameAndTypeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameAndType__Group__0__Impl"


    // $ANTLR start "rule__NameAndType__Group__1"
    // InternalX21.g:1102:1: rule__NameAndType__Group__1 : rule__NameAndType__Group__1__Impl rule__NameAndType__Group__2 ;
    public final void rule__NameAndType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1106:1: ( rule__NameAndType__Group__1__Impl rule__NameAndType__Group__2 )
            // InternalX21.g:1107:2: rule__NameAndType__Group__1__Impl rule__NameAndType__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__NameAndType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameAndType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameAndType__Group__1"


    // $ANTLR start "rule__NameAndType__Group__1__Impl"
    // InternalX21.g:1114:1: rule__NameAndType__Group__1__Impl : ( ':' ) ;
    public final void rule__NameAndType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1118:1: ( ( ':' ) )
            // InternalX21.g:1119:1: ( ':' )
            {
            // InternalX21.g:1119:1: ( ':' )
            // InternalX21.g:1120:2: ':'
            {
             before(grammarAccess.getNameAndTypeAccess().getColonKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNameAndTypeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameAndType__Group__1__Impl"


    // $ANTLR start "rule__NameAndType__Group__2"
    // InternalX21.g:1129:1: rule__NameAndType__Group__2 : rule__NameAndType__Group__2__Impl ;
    public final void rule__NameAndType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1133:1: ( rule__NameAndType__Group__2__Impl )
            // InternalX21.g:1134:2: rule__NameAndType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NameAndType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameAndType__Group__2"


    // $ANTLR start "rule__NameAndType__Group__2__Impl"
    // InternalX21.g:1140:1: rule__NameAndType__Group__2__Impl : ( ( rule__NameAndType__TypeAssignment_2 ) ) ;
    public final void rule__NameAndType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1144:1: ( ( ( rule__NameAndType__TypeAssignment_2 ) ) )
            // InternalX21.g:1145:1: ( ( rule__NameAndType__TypeAssignment_2 ) )
            {
            // InternalX21.g:1145:1: ( ( rule__NameAndType__TypeAssignment_2 ) )
            // InternalX21.g:1146:2: ( rule__NameAndType__TypeAssignment_2 )
            {
             before(grammarAccess.getNameAndTypeAccess().getTypeAssignment_2()); 
            // InternalX21.g:1147:2: ( rule__NameAndType__TypeAssignment_2 )
            // InternalX21.g:1147:3: rule__NameAndType__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NameAndType__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNameAndTypeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameAndType__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalX21.g:1156:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1160:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalX21.g:1161:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalX21.g:1168:1: rule__Parameter__Group__0__Impl : ( 'parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1172:1: ( ( 'parameter' ) )
            // InternalX21.g:1173:1: ( 'parameter' )
            {
            // InternalX21.g:1173:1: ( 'parameter' )
            // InternalX21.g:1174:2: 'parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalX21.g:1183:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1187:1: ( rule__Parameter__Group__1__Impl )
            // InternalX21.g:1188:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalX21.g:1194:1: rule__Parameter__Group__1__Impl : ( ruleNameAndType ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1198:1: ( ( ruleNameAndType ) )
            // InternalX21.g:1199:1: ( ruleNameAndType )
            {
            // InternalX21.g:1199:1: ( ruleNameAndType )
            // InternalX21.g:1200:2: ruleNameAndType
            {
             before(grammarAccess.getParameterAccess().getNameAndTypeParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleNameAndType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameAndTypeParserRuleCall_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Function__Group__0"
    // InternalX21.g:1210:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1214:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalX21.g:1215:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // InternalX21.g:1222:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1226:1: ( ( 'function' ) )
            // InternalX21.g:1227:1: ( 'function' )
            {
            // InternalX21.g:1227:1: ( 'function' )
            // InternalX21.g:1228:2: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalX21.g:1237:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1241:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalX21.g:1242:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // InternalX21.g:1249:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1253:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // InternalX21.g:1254:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // InternalX21.g:1254:1: ( ( rule__Function__NameAssignment_1 ) )
            // InternalX21.g:1255:2: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // InternalX21.g:1256:2: ( rule__Function__NameAssignment_1 )
            // InternalX21.g:1256:3: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // InternalX21.g:1264:1: rule__Function__Group__2 : rule__Function__Group__2__Impl ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1268:1: ( rule__Function__Group__2__Impl )
            // InternalX21.g:1269:2: rule__Function__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // InternalX21.g:1275:1: rule__Function__Group__2__Impl : ( ( rule__Function__BodyAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1279:1: ( ( ( rule__Function__BodyAssignment_2 ) ) )
            // InternalX21.g:1280:1: ( ( rule__Function__BodyAssignment_2 ) )
            {
            // InternalX21.g:1280:1: ( ( rule__Function__BodyAssignment_2 ) )
            // InternalX21.g:1281:2: ( rule__Function__BodyAssignment_2 )
            {
             before(grammarAccess.getFunctionAccess().getBodyAssignment_2()); 
            // InternalX21.g:1282:2: ( rule__Function__BodyAssignment_2 )
            // InternalX21.g:1282:3: rule__Function__BodyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Function__BodyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getBodyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Lambda__Group__0"
    // InternalX21.g:1291:1: rule__Lambda__Group__0 : rule__Lambda__Group__0__Impl rule__Lambda__Group__1 ;
    public final void rule__Lambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1295:1: ( rule__Lambda__Group__0__Impl rule__Lambda__Group__1 )
            // InternalX21.g:1296:2: rule__Lambda__Group__0__Impl rule__Lambda__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Lambda__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__Group__0"


    // $ANTLR start "rule__Lambda__Group__0__Impl"
    // InternalX21.g:1303:1: rule__Lambda__Group__0__Impl : ( '(' ) ;
    public final void rule__Lambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1307:1: ( ( '(' ) )
            // InternalX21.g:1308:1: ( '(' )
            {
            // InternalX21.g:1308:1: ( '(' )
            // InternalX21.g:1309:2: '('
            {
             before(grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__Group__0__Impl"


    // $ANTLR start "rule__Lambda__Group__1"
    // InternalX21.g:1318:1: rule__Lambda__Group__1 : rule__Lambda__Group__1__Impl rule__Lambda__Group__2 ;
    public final void rule__Lambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1322:1: ( rule__Lambda__Group__1__Impl rule__Lambda__Group__2 )
            // InternalX21.g:1323:2: rule__Lambda__Group__1__Impl rule__Lambda__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Lambda__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__Group__1"


    // $ANTLR start "rule__Lambda__Group__1__Impl"
    // InternalX21.g:1330:1: rule__Lambda__Group__1__Impl : ( ruleNameAndType ) ;
    public final void rule__Lambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1334:1: ( ( ruleNameAndType ) )
            // InternalX21.g:1335:1: ( ruleNameAndType )
            {
            // InternalX21.g:1335:1: ( ruleNameAndType )
            // InternalX21.g:1336:2: ruleNameAndType
            {
             before(grammarAccess.getLambdaAccess().getNameAndTypeParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleNameAndType();

            state._fsp--;

             after(grammarAccess.getLambdaAccess().getNameAndTypeParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__Group__1__Impl"


    // $ANTLR start "rule__Lambda__Group__2"
    // InternalX21.g:1345:1: rule__Lambda__Group__2 : rule__Lambda__Group__2__Impl rule__Lambda__Group__3 ;
    public final void rule__Lambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1349:1: ( rule__Lambda__Group__2__Impl rule__Lambda__Group__3 )
            // InternalX21.g:1350:2: rule__Lambda__Group__2__Impl rule__Lambda__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Lambda__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__Group__2"


    // $ANTLR start "rule__Lambda__Group__2__Impl"
    // InternalX21.g:1357:1: rule__Lambda__Group__2__Impl : ( ')' ) ;
    public final void rule__Lambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1361:1: ( ( ')' ) )
            // InternalX21.g:1362:1: ( ')' )
            {
            // InternalX21.g:1362:1: ( ')' )
            // InternalX21.g:1363:2: ')'
            {
             before(grammarAccess.getLambdaAccess().getRightParenthesisKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__Group__2__Impl"


    // $ANTLR start "rule__Lambda__Group__3"
    // InternalX21.g:1372:1: rule__Lambda__Group__3 : rule__Lambda__Group__3__Impl rule__Lambda__Group__4 ;
    public final void rule__Lambda__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1376:1: ( rule__Lambda__Group__3__Impl rule__Lambda__Group__4 )
            // InternalX21.g:1377:2: rule__Lambda__Group__3__Impl rule__Lambda__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Lambda__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__Group__3"


    // $ANTLR start "rule__Lambda__Group__3__Impl"
    // InternalX21.g:1384:1: rule__Lambda__Group__3__Impl : ( '{' ) ;
    public final void rule__Lambda__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1388:1: ( ( '{' ) )
            // InternalX21.g:1389:1: ( '{' )
            {
            // InternalX21.g:1389:1: ( '{' )
            // InternalX21.g:1390:2: '{'
            {
             before(grammarAccess.getLambdaAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__Group__3__Impl"


    // $ANTLR start "rule__Lambda__Group__4"
    // InternalX21.g:1399:1: rule__Lambda__Group__4 : rule__Lambda__Group__4__Impl rule__Lambda__Group__5 ;
    public final void rule__Lambda__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1403:1: ( rule__Lambda__Group__4__Impl rule__Lambda__Group__5 )
            // InternalX21.g:1404:2: rule__Lambda__Group__4__Impl rule__Lambda__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Lambda__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__Group__4"


    // $ANTLR start "rule__Lambda__Group__4__Impl"
    // InternalX21.g:1411:1: rule__Lambda__Group__4__Impl : ( ( rule__Lambda__LogicAssignment_4 ) ) ;
    public final void rule__Lambda__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1415:1: ( ( ( rule__Lambda__LogicAssignment_4 ) ) )
            // InternalX21.g:1416:1: ( ( rule__Lambda__LogicAssignment_4 ) )
            {
            // InternalX21.g:1416:1: ( ( rule__Lambda__LogicAssignment_4 ) )
            // InternalX21.g:1417:2: ( rule__Lambda__LogicAssignment_4 )
            {
             before(grammarAccess.getLambdaAccess().getLogicAssignment_4()); 
            // InternalX21.g:1418:2: ( rule__Lambda__LogicAssignment_4 )
            // InternalX21.g:1418:3: rule__Lambda__LogicAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__LogicAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLambdaAccess().getLogicAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__Group__4__Impl"


    // $ANTLR start "rule__Lambda__Group__5"
    // InternalX21.g:1426:1: rule__Lambda__Group__5 : rule__Lambda__Group__5__Impl ;
    public final void rule__Lambda__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1430:1: ( rule__Lambda__Group__5__Impl )
            // InternalX21.g:1431:2: rule__Lambda__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__Group__5"


    // $ANTLR start "rule__Lambda__Group__5__Impl"
    // InternalX21.g:1437:1: rule__Lambda__Group__5__Impl : ( '}' ) ;
    public final void rule__Lambda__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1441:1: ( ( '}' ) )
            // InternalX21.g:1442:1: ( '}' )
            {
            // InternalX21.g:1442:1: ( '}' )
            // InternalX21.g:1443:2: '}'
            {
             before(grammarAccess.getLambdaAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__Group__5__Impl"


    // $ANTLR start "rule__Input__Group__0"
    // InternalX21.g:1453:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1457:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalX21.g:1458:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // InternalX21.g:1465:1: rule__Input__Group__0__Impl : ( 'input' ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1469:1: ( ( 'input' ) )
            // InternalX21.g:1470:1: ( 'input' )
            {
            // InternalX21.g:1470:1: ( 'input' )
            // InternalX21.g:1471:2: 'input'
            {
             before(grammarAccess.getInputAccess().getInputKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getInputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // InternalX21.g:1480:1: rule__Input__Group__1 : rule__Input__Group__1__Impl ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1484:1: ( rule__Input__Group__1__Impl )
            // InternalX21.g:1485:2: rule__Input__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // InternalX21.g:1491:1: rule__Input__Group__1__Impl : ( ruleNameAndType ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1495:1: ( ( ruleNameAndType ) )
            // InternalX21.g:1496:1: ( ruleNameAndType )
            {
            // InternalX21.g:1496:1: ( ruleNameAndType )
            // InternalX21.g:1497:2: ruleNameAndType
            {
             before(grammarAccess.getInputAccess().getNameAndTypeParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleNameAndType();

            state._fsp--;

             after(grammarAccess.getInputAccess().getNameAndTypeParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__FunctionOrLambda__Group__0"
    // InternalX21.g:1507:1: rule__FunctionOrLambda__Group__0 : rule__FunctionOrLambda__Group__0__Impl rule__FunctionOrLambda__Group__1 ;
    public final void rule__FunctionOrLambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1511:1: ( rule__FunctionOrLambda__Group__0__Impl rule__FunctionOrLambda__Group__1 )
            // InternalX21.g:1512:2: rule__FunctionOrLambda__Group__0__Impl rule__FunctionOrLambda__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__FunctionOrLambda__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionOrLambda__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionOrLambda__Group__0"


    // $ANTLR start "rule__FunctionOrLambda__Group__0__Impl"
    // InternalX21.g:1519:1: rule__FunctionOrLambda__Group__0__Impl : ( '[' ) ;
    public final void rule__FunctionOrLambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1523:1: ( ( '[' ) )
            // InternalX21.g:1524:1: ( '[' )
            {
            // InternalX21.g:1524:1: ( '[' )
            // InternalX21.g:1525:2: '['
            {
             before(grammarAccess.getFunctionOrLambdaAccess().getLeftSquareBracketKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFunctionOrLambdaAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionOrLambda__Group__0__Impl"


    // $ANTLR start "rule__FunctionOrLambda__Group__1"
    // InternalX21.g:1534:1: rule__FunctionOrLambda__Group__1 : rule__FunctionOrLambda__Group__1__Impl rule__FunctionOrLambda__Group__2 ;
    public final void rule__FunctionOrLambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1538:1: ( rule__FunctionOrLambda__Group__1__Impl rule__FunctionOrLambda__Group__2 )
            // InternalX21.g:1539:2: rule__FunctionOrLambda__Group__1__Impl rule__FunctionOrLambda__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__FunctionOrLambda__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionOrLambda__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionOrLambda__Group__1"


    // $ANTLR start "rule__FunctionOrLambda__Group__1__Impl"
    // InternalX21.g:1546:1: rule__FunctionOrLambda__Group__1__Impl : ( ( rule__FunctionOrLambda__Alternatives_1 ) ) ;
    public final void rule__FunctionOrLambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1550:1: ( ( ( rule__FunctionOrLambda__Alternatives_1 ) ) )
            // InternalX21.g:1551:1: ( ( rule__FunctionOrLambda__Alternatives_1 ) )
            {
            // InternalX21.g:1551:1: ( ( rule__FunctionOrLambda__Alternatives_1 ) )
            // InternalX21.g:1552:2: ( rule__FunctionOrLambda__Alternatives_1 )
            {
             before(grammarAccess.getFunctionOrLambdaAccess().getAlternatives_1()); 
            // InternalX21.g:1553:2: ( rule__FunctionOrLambda__Alternatives_1 )
            // InternalX21.g:1553:3: rule__FunctionOrLambda__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionOrLambda__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionOrLambdaAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionOrLambda__Group__1__Impl"


    // $ANTLR start "rule__FunctionOrLambda__Group__2"
    // InternalX21.g:1561:1: rule__FunctionOrLambda__Group__2 : rule__FunctionOrLambda__Group__2__Impl ;
    public final void rule__FunctionOrLambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1565:1: ( rule__FunctionOrLambda__Group__2__Impl )
            // InternalX21.g:1566:2: rule__FunctionOrLambda__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionOrLambda__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionOrLambda__Group__2"


    // $ANTLR start "rule__FunctionOrLambda__Group__2__Impl"
    // InternalX21.g:1572:1: rule__FunctionOrLambda__Group__2__Impl : ( ']' ) ;
    public final void rule__FunctionOrLambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1576:1: ( ( ']' ) )
            // InternalX21.g:1577:1: ( ']' )
            {
            // InternalX21.g:1577:1: ( ']' )
            // InternalX21.g:1578:2: ']'
            {
             before(grammarAccess.getFunctionOrLambdaAccess().getRightSquareBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFunctionOrLambdaAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionOrLambda__Group__2__Impl"


    // $ANTLR start "rule__FunctionOrLambda__Group_1_0__0"
    // InternalX21.g:1588:1: rule__FunctionOrLambda__Group_1_0__0 : rule__FunctionOrLambda__Group_1_0__0__Impl rule__FunctionOrLambda__Group_1_0__1 ;
    public final void rule__FunctionOrLambda__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1592:1: ( rule__FunctionOrLambda__Group_1_0__0__Impl rule__FunctionOrLambda__Group_1_0__1 )
            // InternalX21.g:1593:2: rule__FunctionOrLambda__Group_1_0__0__Impl rule__FunctionOrLambda__Group_1_0__1
            {
            pushFollow(FOLLOW_4);
            rule__FunctionOrLambda__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionOrLambda__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionOrLambda__Group_1_0__0"


    // $ANTLR start "rule__FunctionOrLambda__Group_1_0__0__Impl"
    // InternalX21.g:1600:1: rule__FunctionOrLambda__Group_1_0__0__Impl : ( () ) ;
    public final void rule__FunctionOrLambda__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1604:1: ( ( () ) )
            // InternalX21.g:1605:1: ( () )
            {
            // InternalX21.g:1605:1: ( () )
            // InternalX21.g:1606:2: ()
            {
             before(grammarAccess.getFunctionOrLambdaAccess().getFunctionReferenceAction_1_0_0()); 
            // InternalX21.g:1607:2: ()
            // InternalX21.g:1607:3: 
            {
            }

             after(grammarAccess.getFunctionOrLambdaAccess().getFunctionReferenceAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionOrLambda__Group_1_0__0__Impl"


    // $ANTLR start "rule__FunctionOrLambda__Group_1_0__1"
    // InternalX21.g:1615:1: rule__FunctionOrLambda__Group_1_0__1 : rule__FunctionOrLambda__Group_1_0__1__Impl ;
    public final void rule__FunctionOrLambda__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1619:1: ( rule__FunctionOrLambda__Group_1_0__1__Impl )
            // InternalX21.g:1620:2: rule__FunctionOrLambda__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionOrLambda__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionOrLambda__Group_1_0__1"


    // $ANTLR start "rule__FunctionOrLambda__Group_1_0__1__Impl"
    // InternalX21.g:1626:1: rule__FunctionOrLambda__Group_1_0__1__Impl : ( ( rule__FunctionOrLambda__RefAssignment_1_0_1 ) ) ;
    public final void rule__FunctionOrLambda__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1630:1: ( ( ( rule__FunctionOrLambda__RefAssignment_1_0_1 ) ) )
            // InternalX21.g:1631:1: ( ( rule__FunctionOrLambda__RefAssignment_1_0_1 ) )
            {
            // InternalX21.g:1631:1: ( ( rule__FunctionOrLambda__RefAssignment_1_0_1 ) )
            // InternalX21.g:1632:2: ( rule__FunctionOrLambda__RefAssignment_1_0_1 )
            {
             before(grammarAccess.getFunctionOrLambdaAccess().getRefAssignment_1_0_1()); 
            // InternalX21.g:1633:2: ( rule__FunctionOrLambda__RefAssignment_1_0_1 )
            // InternalX21.g:1633:3: rule__FunctionOrLambda__RefAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionOrLambda__RefAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionOrLambdaAccess().getRefAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionOrLambda__Group_1_0__1__Impl"


    // $ANTLR start "rule__Node__Group__0"
    // InternalX21.g:1642:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1646:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalX21.g:1647:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Node__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0"


    // $ANTLR start "rule__Node__Group__0__Impl"
    // InternalX21.g:1654:1: rule__Node__Group__0__Impl : ( 'node' ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1658:1: ( ( 'node' ) )
            // InternalX21.g:1659:1: ( 'node' )
            {
            // InternalX21.g:1659:1: ( 'node' )
            // InternalX21.g:1660:2: 'node'
            {
             before(grammarAccess.getNodeAccess().getNodeKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNodeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0__Impl"


    // $ANTLR start "rule__Node__Group__1"
    // InternalX21.g:1669:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1673:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalX21.g:1674:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Node__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1"


    // $ANTLR start "rule__Node__Group__1__Impl"
    // InternalX21.g:1681:1: rule__Node__Group__1__Impl : ( ( rule__Node__NameAssignment_1 ) ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1685:1: ( ( ( rule__Node__NameAssignment_1 ) ) )
            // InternalX21.g:1686:1: ( ( rule__Node__NameAssignment_1 ) )
            {
            // InternalX21.g:1686:1: ( ( rule__Node__NameAssignment_1 ) )
            // InternalX21.g:1687:2: ( rule__Node__NameAssignment_1 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_1()); 
            // InternalX21.g:1688:2: ( rule__Node__NameAssignment_1 )
            // InternalX21.g:1688:3: rule__Node__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1__Impl"


    // $ANTLR start "rule__Node__Group__2"
    // InternalX21.g:1696:1: rule__Node__Group__2 : rule__Node__Group__2__Impl ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1700:1: ( rule__Node__Group__2__Impl )
            // InternalX21.g:1701:2: rule__Node__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__2"


    // $ANTLR start "rule__Node__Group__2__Impl"
    // InternalX21.g:1707:1: rule__Node__Group__2__Impl : ( ( rule__Node__BodyAssignment_2 ) ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1711:1: ( ( ( rule__Node__BodyAssignment_2 ) ) )
            // InternalX21.g:1712:1: ( ( rule__Node__BodyAssignment_2 ) )
            {
            // InternalX21.g:1712:1: ( ( rule__Node__BodyAssignment_2 ) )
            // InternalX21.g:1713:2: ( rule__Node__BodyAssignment_2 )
            {
             before(grammarAccess.getNodeAccess().getBodyAssignment_2()); 
            // InternalX21.g:1714:2: ( rule__Node__BodyAssignment_2 )
            // InternalX21.g:1714:3: rule__Node__BodyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Node__BodyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getBodyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__2__Impl"


    // $ANTLR start "rule__Stream__Group__0"
    // InternalX21.g:1723:1: rule__Stream__Group__0 : rule__Stream__Group__0__Impl rule__Stream__Group__1 ;
    public final void rule__Stream__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1727:1: ( rule__Stream__Group__0__Impl rule__Stream__Group__1 )
            // InternalX21.g:1728:2: rule__Stream__Group__0__Impl rule__Stream__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Stream__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__0"


    // $ANTLR start "rule__Stream__Group__0__Impl"
    // InternalX21.g:1735:1: rule__Stream__Group__0__Impl : ( 'stream' ) ;
    public final void rule__Stream__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1739:1: ( ( 'stream' ) )
            // InternalX21.g:1740:1: ( 'stream' )
            {
            // InternalX21.g:1740:1: ( 'stream' )
            // InternalX21.g:1741:2: 'stream'
            {
             before(grammarAccess.getStreamAccess().getStreamKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getStreamKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__0__Impl"


    // $ANTLR start "rule__Stream__Group__1"
    // InternalX21.g:1750:1: rule__Stream__Group__1 : rule__Stream__Group__1__Impl rule__Stream__Group__2 ;
    public final void rule__Stream__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1754:1: ( rule__Stream__Group__1__Impl rule__Stream__Group__2 )
            // InternalX21.g:1755:2: rule__Stream__Group__1__Impl rule__Stream__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Stream__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__1"


    // $ANTLR start "rule__Stream__Group__1__Impl"
    // InternalX21.g:1762:1: rule__Stream__Group__1__Impl : ( ( rule__Stream__StartNodesAssignment_1 ) ) ;
    public final void rule__Stream__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1766:1: ( ( ( rule__Stream__StartNodesAssignment_1 ) ) )
            // InternalX21.g:1767:1: ( ( rule__Stream__StartNodesAssignment_1 ) )
            {
            // InternalX21.g:1767:1: ( ( rule__Stream__StartNodesAssignment_1 ) )
            // InternalX21.g:1768:2: ( rule__Stream__StartNodesAssignment_1 )
            {
             before(grammarAccess.getStreamAccess().getStartNodesAssignment_1()); 
            // InternalX21.g:1769:2: ( rule__Stream__StartNodesAssignment_1 )
            // InternalX21.g:1769:3: rule__Stream__StartNodesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Stream__StartNodesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getStartNodesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__1__Impl"


    // $ANTLR start "rule__Stream__Group__2"
    // InternalX21.g:1777:1: rule__Stream__Group__2 : rule__Stream__Group__2__Impl rule__Stream__Group__3 ;
    public final void rule__Stream__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1781:1: ( rule__Stream__Group__2__Impl rule__Stream__Group__3 )
            // InternalX21.g:1782:2: rule__Stream__Group__2__Impl rule__Stream__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Stream__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__2"


    // $ANTLR start "rule__Stream__Group__2__Impl"
    // InternalX21.g:1789:1: rule__Stream__Group__2__Impl : ( ( rule__Stream__Group_2__0 )* ) ;
    public final void rule__Stream__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1793:1: ( ( ( rule__Stream__Group_2__0 )* ) )
            // InternalX21.g:1794:1: ( ( rule__Stream__Group_2__0 )* )
            {
            // InternalX21.g:1794:1: ( ( rule__Stream__Group_2__0 )* )
            // InternalX21.g:1795:2: ( rule__Stream__Group_2__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_2()); 
            // InternalX21.g:1796:2: ( rule__Stream__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalX21.g:1796:3: rule__Stream__Group_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Stream__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getStreamAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__2__Impl"


    // $ANTLR start "rule__Stream__Group__3"
    // InternalX21.g:1804:1: rule__Stream__Group__3 : rule__Stream__Group__3__Impl ;
    public final void rule__Stream__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1808:1: ( rule__Stream__Group__3__Impl )
            // InternalX21.g:1809:2: rule__Stream__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stream__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__3"


    // $ANTLR start "rule__Stream__Group__3__Impl"
    // InternalX21.g:1815:1: rule__Stream__Group__3__Impl : ( ( ( rule__Stream__Group_3__0 ) ) ( ( rule__Stream__Group_3__0 )* ) ) ;
    public final void rule__Stream__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1819:1: ( ( ( ( rule__Stream__Group_3__0 ) ) ( ( rule__Stream__Group_3__0 )* ) ) )
            // InternalX21.g:1820:1: ( ( ( rule__Stream__Group_3__0 ) ) ( ( rule__Stream__Group_3__0 )* ) )
            {
            // InternalX21.g:1820:1: ( ( ( rule__Stream__Group_3__0 ) ) ( ( rule__Stream__Group_3__0 )* ) )
            // InternalX21.g:1821:2: ( ( rule__Stream__Group_3__0 ) ) ( ( rule__Stream__Group_3__0 )* )
            {
            // InternalX21.g:1821:2: ( ( rule__Stream__Group_3__0 ) )
            // InternalX21.g:1822:3: ( rule__Stream__Group_3__0 )
            {
             before(grammarAccess.getStreamAccess().getGroup_3()); 
            // InternalX21.g:1823:3: ( rule__Stream__Group_3__0 )
            // InternalX21.g:1823:4: rule__Stream__Group_3__0
            {
            pushFollow(FOLLOW_20);
            rule__Stream__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getGroup_3()); 

            }

            // InternalX21.g:1826:2: ( ( rule__Stream__Group_3__0 )* )
            // InternalX21.g:1827:3: ( rule__Stream__Group_3__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_3()); 
            // InternalX21.g:1828:3: ( rule__Stream__Group_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalX21.g:1828:4: rule__Stream__Group_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Stream__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getStreamAccess().getGroup_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__3__Impl"


    // $ANTLR start "rule__Stream__Group_2__0"
    // InternalX21.g:1838:1: rule__Stream__Group_2__0 : rule__Stream__Group_2__0__Impl rule__Stream__Group_2__1 ;
    public final void rule__Stream__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1842:1: ( rule__Stream__Group_2__0__Impl rule__Stream__Group_2__1 )
            // InternalX21.g:1843:2: rule__Stream__Group_2__0__Impl rule__Stream__Group_2__1
            {
            pushFollow(FOLLOW_17);
            rule__Stream__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group_2__0"


    // $ANTLR start "rule__Stream__Group_2__0__Impl"
    // InternalX21.g:1850:1: rule__Stream__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Stream__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1854:1: ( ( ',' ) )
            // InternalX21.g:1855:1: ( ',' )
            {
            // InternalX21.g:1855:1: ( ',' )
            // InternalX21.g:1856:2: ','
            {
             before(grammarAccess.getStreamAccess().getCommaKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group_2__0__Impl"


    // $ANTLR start "rule__Stream__Group_2__1"
    // InternalX21.g:1865:1: rule__Stream__Group_2__1 : rule__Stream__Group_2__1__Impl ;
    public final void rule__Stream__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1869:1: ( rule__Stream__Group_2__1__Impl )
            // InternalX21.g:1870:2: rule__Stream__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stream__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group_2__1"


    // $ANTLR start "rule__Stream__Group_2__1__Impl"
    // InternalX21.g:1876:1: rule__Stream__Group_2__1__Impl : ( ( rule__Stream__StartNodesAssignment_2_1 ) ) ;
    public final void rule__Stream__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1880:1: ( ( ( rule__Stream__StartNodesAssignment_2_1 ) ) )
            // InternalX21.g:1881:1: ( ( rule__Stream__StartNodesAssignment_2_1 ) )
            {
            // InternalX21.g:1881:1: ( ( rule__Stream__StartNodesAssignment_2_1 ) )
            // InternalX21.g:1882:2: ( rule__Stream__StartNodesAssignment_2_1 )
            {
             before(grammarAccess.getStreamAccess().getStartNodesAssignment_2_1()); 
            // InternalX21.g:1883:2: ( rule__Stream__StartNodesAssignment_2_1 )
            // InternalX21.g:1883:3: rule__Stream__StartNodesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Stream__StartNodesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getStartNodesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group_2__1__Impl"


    // $ANTLR start "rule__Stream__Group_3__0"
    // InternalX21.g:1892:1: rule__Stream__Group_3__0 : rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1 ;
    public final void rule__Stream__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1896:1: ( rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1 )
            // InternalX21.g:1897:2: rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__Stream__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group_3__0"


    // $ANTLR start "rule__Stream__Group_3__0__Impl"
    // InternalX21.g:1904:1: rule__Stream__Group_3__0__Impl : ( 'to' ) ;
    public final void rule__Stream__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1908:1: ( ( 'to' ) )
            // InternalX21.g:1909:1: ( 'to' )
            {
            // InternalX21.g:1909:1: ( 'to' )
            // InternalX21.g:1910:2: 'to'
            {
             before(grammarAccess.getStreamAccess().getToKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getToKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group_3__0__Impl"


    // $ANTLR start "rule__Stream__Group_3__1"
    // InternalX21.g:1919:1: rule__Stream__Group_3__1 : rule__Stream__Group_3__1__Impl ;
    public final void rule__Stream__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1923:1: ( rule__Stream__Group_3__1__Impl )
            // InternalX21.g:1924:2: rule__Stream__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stream__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group_3__1"


    // $ANTLR start "rule__Stream__Group_3__1__Impl"
    // InternalX21.g:1930:1: rule__Stream__Group_3__1__Impl : ( ( rule__Stream__PointsAssignment_3_1 ) ) ;
    public final void rule__Stream__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1934:1: ( ( ( rule__Stream__PointsAssignment_3_1 ) ) )
            // InternalX21.g:1935:1: ( ( rule__Stream__PointsAssignment_3_1 ) )
            {
            // InternalX21.g:1935:1: ( ( rule__Stream__PointsAssignment_3_1 ) )
            // InternalX21.g:1936:2: ( rule__Stream__PointsAssignment_3_1 )
            {
             before(grammarAccess.getStreamAccess().getPointsAssignment_3_1()); 
            // InternalX21.g:1937:2: ( rule__Stream__PointsAssignment_3_1 )
            // InternalX21.g:1937:3: rule__Stream__PointsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Stream__PointsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getPointsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group_3__1__Impl"


    // $ANTLR start "rule__ElementList__Group__0"
    // InternalX21.g:1946:1: rule__ElementList__Group__0 : rule__ElementList__Group__0__Impl rule__ElementList__Group__1 ;
    public final void rule__ElementList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1950:1: ( rule__ElementList__Group__0__Impl rule__ElementList__Group__1 )
            // InternalX21.g:1951:2: rule__ElementList__Group__0__Impl rule__ElementList__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ElementList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementList__Group__0"


    // $ANTLR start "rule__ElementList__Group__0__Impl"
    // InternalX21.g:1958:1: rule__ElementList__Group__0__Impl : ( ( rule__ElementList__ElementsAssignment_0 ) ) ;
    public final void rule__ElementList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1962:1: ( ( ( rule__ElementList__ElementsAssignment_0 ) ) )
            // InternalX21.g:1963:1: ( ( rule__ElementList__ElementsAssignment_0 ) )
            {
            // InternalX21.g:1963:1: ( ( rule__ElementList__ElementsAssignment_0 ) )
            // InternalX21.g:1964:2: ( rule__ElementList__ElementsAssignment_0 )
            {
             before(grammarAccess.getElementListAccess().getElementsAssignment_0()); 
            // InternalX21.g:1965:2: ( rule__ElementList__ElementsAssignment_0 )
            // InternalX21.g:1965:3: rule__ElementList__ElementsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ElementList__ElementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getElementListAccess().getElementsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementList__Group__0__Impl"


    // $ANTLR start "rule__ElementList__Group__1"
    // InternalX21.g:1973:1: rule__ElementList__Group__1 : rule__ElementList__Group__1__Impl ;
    public final void rule__ElementList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1977:1: ( rule__ElementList__Group__1__Impl )
            // InternalX21.g:1978:2: rule__ElementList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementList__Group__1"


    // $ANTLR start "rule__ElementList__Group__1__Impl"
    // InternalX21.g:1984:1: rule__ElementList__Group__1__Impl : ( ( rule__ElementList__Group_1__0 )* ) ;
    public final void rule__ElementList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1988:1: ( ( ( rule__ElementList__Group_1__0 )* ) )
            // InternalX21.g:1989:1: ( ( rule__ElementList__Group_1__0 )* )
            {
            // InternalX21.g:1989:1: ( ( rule__ElementList__Group_1__0 )* )
            // InternalX21.g:1990:2: ( rule__ElementList__Group_1__0 )*
            {
             before(grammarAccess.getElementListAccess().getGroup_1()); 
            // InternalX21.g:1991:2: ( rule__ElementList__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalX21.g:1991:3: rule__ElementList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ElementList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getElementListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementList__Group__1__Impl"


    // $ANTLR start "rule__ElementList__Group_1__0"
    // InternalX21.g:2000:1: rule__ElementList__Group_1__0 : rule__ElementList__Group_1__0__Impl rule__ElementList__Group_1__1 ;
    public final void rule__ElementList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2004:1: ( rule__ElementList__Group_1__0__Impl rule__ElementList__Group_1__1 )
            // InternalX21.g:2005:2: rule__ElementList__Group_1__0__Impl rule__ElementList__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__ElementList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementList__Group_1__0"


    // $ANTLR start "rule__ElementList__Group_1__0__Impl"
    // InternalX21.g:2012:1: rule__ElementList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ElementList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2016:1: ( ( ',' ) )
            // InternalX21.g:2017:1: ( ',' )
            {
            // InternalX21.g:2017:1: ( ',' )
            // InternalX21.g:2018:2: ','
            {
             before(grammarAccess.getElementListAccess().getCommaKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getElementListAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementList__Group_1__0__Impl"


    // $ANTLR start "rule__ElementList__Group_1__1"
    // InternalX21.g:2027:1: rule__ElementList__Group_1__1 : rule__ElementList__Group_1__1__Impl ;
    public final void rule__ElementList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2031:1: ( rule__ElementList__Group_1__1__Impl )
            // InternalX21.g:2032:2: rule__ElementList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementList__Group_1__1"


    // $ANTLR start "rule__ElementList__Group_1__1__Impl"
    // InternalX21.g:2038:1: rule__ElementList__Group_1__1__Impl : ( ( rule__ElementList__ElementsAssignment_1_1 ) ) ;
    public final void rule__ElementList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2042:1: ( ( ( rule__ElementList__ElementsAssignment_1_1 ) ) )
            // InternalX21.g:2043:1: ( ( rule__ElementList__ElementsAssignment_1_1 ) )
            {
            // InternalX21.g:2043:1: ( ( rule__ElementList__ElementsAssignment_1_1 ) )
            // InternalX21.g:2044:2: ( rule__ElementList__ElementsAssignment_1_1 )
            {
             before(grammarAccess.getElementListAccess().getElementsAssignment_1_1()); 
            // InternalX21.g:2045:2: ( rule__ElementList__ElementsAssignment_1_1 )
            // InternalX21.g:2045:3: rule__ElementList__ElementsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ElementList__ElementsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getElementListAccess().getElementsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementList__Group_1__1__Impl"


    // $ANTLR start "rule__Element__Group_0__0"
    // InternalX21.g:2054:1: rule__Element__Group_0__0 : rule__Element__Group_0__0__Impl rule__Element__Group_0__1 ;
    public final void rule__Element__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2058:1: ( rule__Element__Group_0__0__Impl rule__Element__Group_0__1 )
            // InternalX21.g:2059:2: rule__Element__Group_0__0__Impl rule__Element__Group_0__1
            {
            pushFollow(FOLLOW_23);
            rule__Element__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_0__0"


    // $ANTLR start "rule__Element__Group_0__0__Impl"
    // InternalX21.g:2066:1: rule__Element__Group_0__0__Impl : ( () ) ;
    public final void rule__Element__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2070:1: ( ( () ) )
            // InternalX21.g:2071:1: ( () )
            {
            // InternalX21.g:2071:1: ( () )
            // InternalX21.g:2072:2: ()
            {
             before(grammarAccess.getElementAccess().getNodeRefAction_0_0()); 
            // InternalX21.g:2073:2: ()
            // InternalX21.g:2073:3: 
            {
            }

             after(grammarAccess.getElementAccess().getNodeRefAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_0__0__Impl"


    // $ANTLR start "rule__Element__Group_0__1"
    // InternalX21.g:2081:1: rule__Element__Group_0__1 : rule__Element__Group_0__1__Impl ;
    public final void rule__Element__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2085:1: ( rule__Element__Group_0__1__Impl )
            // InternalX21.g:2086:2: rule__Element__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_0__1"


    // $ANTLR start "rule__Element__Group_0__1__Impl"
    // InternalX21.g:2092:1: rule__Element__Group_0__1__Impl : ( ( rule__Element__RefAssignment_0_1 ) ) ;
    public final void rule__Element__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2096:1: ( ( ( rule__Element__RefAssignment_0_1 ) ) )
            // InternalX21.g:2097:1: ( ( rule__Element__RefAssignment_0_1 ) )
            {
            // InternalX21.g:2097:1: ( ( rule__Element__RefAssignment_0_1 ) )
            // InternalX21.g:2098:2: ( rule__Element__RefAssignment_0_1 )
            {
             before(grammarAccess.getElementAccess().getRefAssignment_0_1()); 
            // InternalX21.g:2099:2: ( rule__Element__RefAssignment_0_1 )
            // InternalX21.g:2099:3: rule__Element__RefAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Element__RefAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getRefAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_0__1__Impl"


    // $ANTLR start "rule__Element__Group_1__0"
    // InternalX21.g:2108:1: rule__Element__Group_1__0 : rule__Element__Group_1__0__Impl rule__Element__Group_1__1 ;
    public final void rule__Element__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2112:1: ( rule__Element__Group_1__0__Impl rule__Element__Group_1__1 )
            // InternalX21.g:2113:2: rule__Element__Group_1__0__Impl rule__Element__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Element__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_1__0"


    // $ANTLR start "rule__Element__Group_1__0__Impl"
    // InternalX21.g:2120:1: rule__Element__Group_1__0__Impl : ( () ) ;
    public final void rule__Element__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2124:1: ( ( () ) )
            // InternalX21.g:2125:1: ( () )
            {
            // InternalX21.g:2125:1: ( () )
            // InternalX21.g:2126:2: ()
            {
             before(grammarAccess.getElementAccess().getAnonymousLambdaAction_1_0()); 
            // InternalX21.g:2127:2: ()
            // InternalX21.g:2127:3: 
            {
            }

             after(grammarAccess.getElementAccess().getAnonymousLambdaAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_1__0__Impl"


    // $ANTLR start "rule__Element__Group_1__1"
    // InternalX21.g:2135:1: rule__Element__Group_1__1 : rule__Element__Group_1__1__Impl ;
    public final void rule__Element__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2139:1: ( rule__Element__Group_1__1__Impl )
            // InternalX21.g:2140:2: rule__Element__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_1__1"


    // $ANTLR start "rule__Element__Group_1__1__Impl"
    // InternalX21.g:2146:1: rule__Element__Group_1__1__Impl : ( ( rule__Element__BodyAssignment_1_1 ) ) ;
    public final void rule__Element__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2150:1: ( ( ( rule__Element__BodyAssignment_1_1 ) ) )
            // InternalX21.g:2151:1: ( ( rule__Element__BodyAssignment_1_1 ) )
            {
            // InternalX21.g:2151:1: ( ( rule__Element__BodyAssignment_1_1 ) )
            // InternalX21.g:2152:2: ( rule__Element__BodyAssignment_1_1 )
            {
             before(grammarAccess.getElementAccess().getBodyAssignment_1_1()); 
            // InternalX21.g:2153:2: ( rule__Element__BodyAssignment_1_1 )
            // InternalX21.g:2153:3: rule__Element__BodyAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Element__BodyAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getBodyAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_1__1__Impl"


    // $ANTLR start "rule__Element__Group_2__0"
    // InternalX21.g:2162:1: rule__Element__Group_2__0 : rule__Element__Group_2__0__Impl rule__Element__Group_2__1 ;
    public final void rule__Element__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2166:1: ( rule__Element__Group_2__0__Impl rule__Element__Group_2__1 )
            // InternalX21.g:2167:2: rule__Element__Group_2__0__Impl rule__Element__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__Element__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_2__0"


    // $ANTLR start "rule__Element__Group_2__0__Impl"
    // InternalX21.g:2174:1: rule__Element__Group_2__0__Impl : ( () ) ;
    public final void rule__Element__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2178:1: ( ( () ) )
            // InternalX21.g:2179:1: ( () )
            {
            // InternalX21.g:2179:1: ( () )
            // InternalX21.g:2180:2: ()
            {
             before(grammarAccess.getElementAccess().getOutputAction_2_0()); 
            // InternalX21.g:2181:2: ()
            // InternalX21.g:2181:3: 
            {
            }

             after(grammarAccess.getElementAccess().getOutputAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_2__0__Impl"


    // $ANTLR start "rule__Element__Group_2__1"
    // InternalX21.g:2189:1: rule__Element__Group_2__1 : rule__Element__Group_2__1__Impl rule__Element__Group_2__2 ;
    public final void rule__Element__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2193:1: ( rule__Element__Group_2__1__Impl rule__Element__Group_2__2 )
            // InternalX21.g:2194:2: rule__Element__Group_2__1__Impl rule__Element__Group_2__2
            {
            pushFollow(FOLLOW_4);
            rule__Element__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_2__1"


    // $ANTLR start "rule__Element__Group_2__1__Impl"
    // InternalX21.g:2201:1: rule__Element__Group_2__1__Impl : ( 'output' ) ;
    public final void rule__Element__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2205:1: ( ( 'output' ) )
            // InternalX21.g:2206:1: ( 'output' )
            {
            // InternalX21.g:2206:1: ( 'output' )
            // InternalX21.g:2207:2: 'output'
            {
             before(grammarAccess.getElementAccess().getOutputKeyword_2_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getOutputKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_2__1__Impl"


    // $ANTLR start "rule__Element__Group_2__2"
    // InternalX21.g:2216:1: rule__Element__Group_2__2 : rule__Element__Group_2__2__Impl ;
    public final void rule__Element__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2220:1: ( rule__Element__Group_2__2__Impl )
            // InternalX21.g:2221:2: rule__Element__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_2__2"


    // $ANTLR start "rule__Element__Group_2__2__Impl"
    // InternalX21.g:2227:1: rule__Element__Group_2__2__Impl : ( ( rule__Element__NameAssignment_2_2 ) ) ;
    public final void rule__Element__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2231:1: ( ( ( rule__Element__NameAssignment_2_2 ) ) )
            // InternalX21.g:2232:1: ( ( rule__Element__NameAssignment_2_2 ) )
            {
            // InternalX21.g:2232:1: ( ( rule__Element__NameAssignment_2_2 ) )
            // InternalX21.g:2233:2: ( rule__Element__NameAssignment_2_2 )
            {
             before(grammarAccess.getElementAccess().getNameAssignment_2_2()); 
            // InternalX21.g:2234:2: ( rule__Element__NameAssignment_2_2 )
            // InternalX21.g:2234:3: rule__Element__NameAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Element__NameAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getNameAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_2__2__Impl"


    // $ANTLR start "rule__DataDecl__Group__0"
    // InternalX21.g:2243:1: rule__DataDecl__Group__0 : rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1 ;
    public final void rule__DataDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2247:1: ( rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1 )
            // InternalX21.g:2248:2: rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DataDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__Group__0"


    // $ANTLR start "rule__DataDecl__Group__0__Impl"
    // InternalX21.g:2255:1: rule__DataDecl__Group__0__Impl : ( 'data' ) ;
    public final void rule__DataDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2259:1: ( ( 'data' ) )
            // InternalX21.g:2260:1: ( 'data' )
            {
            // InternalX21.g:2260:1: ( 'data' )
            // InternalX21.g:2261:2: 'data'
            {
             before(grammarAccess.getDataDeclAccess().getDataKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getDataKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__Group__0__Impl"


    // $ANTLR start "rule__DataDecl__Group__1"
    // InternalX21.g:2270:1: rule__DataDecl__Group__1 : rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2 ;
    public final void rule__DataDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2274:1: ( rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2 )
            // InternalX21.g:2275:2: rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__DataDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__Group__1"


    // $ANTLR start "rule__DataDecl__Group__1__Impl"
    // InternalX21.g:2282:1: rule__DataDecl__Group__1__Impl : ( ( rule__DataDecl__NameAssignment_1 ) ) ;
    public final void rule__DataDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2286:1: ( ( ( rule__DataDecl__NameAssignment_1 ) ) )
            // InternalX21.g:2287:1: ( ( rule__DataDecl__NameAssignment_1 ) )
            {
            // InternalX21.g:2287:1: ( ( rule__DataDecl__NameAssignment_1 ) )
            // InternalX21.g:2288:2: ( rule__DataDecl__NameAssignment_1 )
            {
             before(grammarAccess.getDataDeclAccess().getNameAssignment_1()); 
            // InternalX21.g:2289:2: ( rule__DataDecl__NameAssignment_1 )
            // InternalX21.g:2289:3: rule__DataDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataDecl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataDeclAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__Group__1__Impl"


    // $ANTLR start "rule__DataDecl__Group__2"
    // InternalX21.g:2297:1: rule__DataDecl__Group__2 : rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3 ;
    public final void rule__DataDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2301:1: ( rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3 )
            // InternalX21.g:2302:2: rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__DataDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__Group__2"


    // $ANTLR start "rule__DataDecl__Group__2__Impl"
    // InternalX21.g:2309:1: rule__DataDecl__Group__2__Impl : ( '{' ) ;
    public final void rule__DataDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2313:1: ( ( '{' ) )
            // InternalX21.g:2314:1: ( '{' )
            {
            // InternalX21.g:2314:1: ( '{' )
            // InternalX21.g:2315:2: '{'
            {
             before(grammarAccess.getDataDeclAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__Group__2__Impl"


    // $ANTLR start "rule__DataDecl__Group__3"
    // InternalX21.g:2324:1: rule__DataDecl__Group__3 : rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4 ;
    public final void rule__DataDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2328:1: ( rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4 )
            // InternalX21.g:2329:2: rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__DataDecl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__Group__3"


    // $ANTLR start "rule__DataDecl__Group__3__Impl"
    // InternalX21.g:2336:1: rule__DataDecl__Group__3__Impl : ( ( rule__DataDecl__VariablesAssignment_3 ) ) ;
    public final void rule__DataDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2340:1: ( ( ( rule__DataDecl__VariablesAssignment_3 ) ) )
            // InternalX21.g:2341:1: ( ( rule__DataDecl__VariablesAssignment_3 ) )
            {
            // InternalX21.g:2341:1: ( ( rule__DataDecl__VariablesAssignment_3 ) )
            // InternalX21.g:2342:2: ( rule__DataDecl__VariablesAssignment_3 )
            {
             before(grammarAccess.getDataDeclAccess().getVariablesAssignment_3()); 
            // InternalX21.g:2343:2: ( rule__DataDecl__VariablesAssignment_3 )
            // InternalX21.g:2343:3: rule__DataDecl__VariablesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DataDecl__VariablesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataDeclAccess().getVariablesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__Group__3__Impl"


    // $ANTLR start "rule__DataDecl__Group__4"
    // InternalX21.g:2351:1: rule__DataDecl__Group__4 : rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5 ;
    public final void rule__DataDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2355:1: ( rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5 )
            // InternalX21.g:2356:2: rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__DataDecl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__Group__4"


    // $ANTLR start "rule__DataDecl__Group__4__Impl"
    // InternalX21.g:2363:1: rule__DataDecl__Group__4__Impl : ( ( rule__DataDecl__Group_4__0 )* ) ;
    public final void rule__DataDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2367:1: ( ( ( rule__DataDecl__Group_4__0 )* ) )
            // InternalX21.g:2368:1: ( ( rule__DataDecl__Group_4__0 )* )
            {
            // InternalX21.g:2368:1: ( ( rule__DataDecl__Group_4__0 )* )
            // InternalX21.g:2369:2: ( rule__DataDecl__Group_4__0 )*
            {
             before(grammarAccess.getDataDeclAccess().getGroup_4()); 
            // InternalX21.g:2370:2: ( rule__DataDecl__Group_4__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalX21.g:2370:3: rule__DataDecl__Group_4__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__DataDecl__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getDataDeclAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__Group__4__Impl"


    // $ANTLR start "rule__DataDecl__Group__5"
    // InternalX21.g:2378:1: rule__DataDecl__Group__5 : rule__DataDecl__Group__5__Impl ;
    public final void rule__DataDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2382:1: ( rule__DataDecl__Group__5__Impl )
            // InternalX21.g:2383:2: rule__DataDecl__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataDecl__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__Group__5"


    // $ANTLR start "rule__DataDecl__Group__5__Impl"
    // InternalX21.g:2389:1: rule__DataDecl__Group__5__Impl : ( '}' ) ;
    public final void rule__DataDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2393:1: ( ( '}' ) )
            // InternalX21.g:2394:1: ( '}' )
            {
            // InternalX21.g:2394:1: ( '}' )
            // InternalX21.g:2395:2: '}'
            {
             before(grammarAccess.getDataDeclAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__Group__5__Impl"


    // $ANTLR start "rule__DataDecl__Group_4__0"
    // InternalX21.g:2405:1: rule__DataDecl__Group_4__0 : rule__DataDecl__Group_4__0__Impl rule__DataDecl__Group_4__1 ;
    public final void rule__DataDecl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2409:1: ( rule__DataDecl__Group_4__0__Impl rule__DataDecl__Group_4__1 )
            // InternalX21.g:2410:2: rule__DataDecl__Group_4__0__Impl rule__DataDecl__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__DataDecl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__Group_4__0"


    // $ANTLR start "rule__DataDecl__Group_4__0__Impl"
    // InternalX21.g:2417:1: rule__DataDecl__Group_4__0__Impl : ( ',' ) ;
    public final void rule__DataDecl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2421:1: ( ( ',' ) )
            // InternalX21.g:2422:1: ( ',' )
            {
            // InternalX21.g:2422:1: ( ',' )
            // InternalX21.g:2423:2: ','
            {
             before(grammarAccess.getDataDeclAccess().getCommaKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__Group_4__0__Impl"


    // $ANTLR start "rule__DataDecl__Group_4__1"
    // InternalX21.g:2432:1: rule__DataDecl__Group_4__1 : rule__DataDecl__Group_4__1__Impl ;
    public final void rule__DataDecl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2436:1: ( rule__DataDecl__Group_4__1__Impl )
            // InternalX21.g:2437:2: rule__DataDecl__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataDecl__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__Group_4__1"


    // $ANTLR start "rule__DataDecl__Group_4__1__Impl"
    // InternalX21.g:2443:1: rule__DataDecl__Group_4__1__Impl : ( ( rule__DataDecl__VariablesAssignment_4_1 ) ) ;
    public final void rule__DataDecl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2447:1: ( ( ( rule__DataDecl__VariablesAssignment_4_1 ) ) )
            // InternalX21.g:2448:1: ( ( rule__DataDecl__VariablesAssignment_4_1 ) )
            {
            // InternalX21.g:2448:1: ( ( rule__DataDecl__VariablesAssignment_4_1 ) )
            // InternalX21.g:2449:2: ( rule__DataDecl__VariablesAssignment_4_1 )
            {
             before(grammarAccess.getDataDeclAccess().getVariablesAssignment_4_1()); 
            // InternalX21.g:2450:2: ( rule__DataDecl__VariablesAssignment_4_1 )
            // InternalX21.g:2450:3: rule__DataDecl__VariablesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DataDecl__VariablesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDataDeclAccess().getVariablesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__Group_4__1__Impl"


    // $ANTLR start "rule__DataVariable__Group__0"
    // InternalX21.g:2459:1: rule__DataVariable__Group__0 : rule__DataVariable__Group__0__Impl rule__DataVariable__Group__1 ;
    public final void rule__DataVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2463:1: ( rule__DataVariable__Group__0__Impl rule__DataVariable__Group__1 )
            // InternalX21.g:2464:2: rule__DataVariable__Group__0__Impl rule__DataVariable__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__DataVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataVariable__Group__0"


    // $ANTLR start "rule__DataVariable__Group__0__Impl"
    // InternalX21.g:2471:1: rule__DataVariable__Group__0__Impl : ( ( rule__DataVariable__NameAssignment_0 ) ) ;
    public final void rule__DataVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2475:1: ( ( ( rule__DataVariable__NameAssignment_0 ) ) )
            // InternalX21.g:2476:1: ( ( rule__DataVariable__NameAssignment_0 ) )
            {
            // InternalX21.g:2476:1: ( ( rule__DataVariable__NameAssignment_0 ) )
            // InternalX21.g:2477:2: ( rule__DataVariable__NameAssignment_0 )
            {
             before(grammarAccess.getDataVariableAccess().getNameAssignment_0()); 
            // InternalX21.g:2478:2: ( rule__DataVariable__NameAssignment_0 )
            // InternalX21.g:2478:3: rule__DataVariable__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DataVariable__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDataVariableAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataVariable__Group__0__Impl"


    // $ANTLR start "rule__DataVariable__Group__1"
    // InternalX21.g:2486:1: rule__DataVariable__Group__1 : rule__DataVariable__Group__1__Impl rule__DataVariable__Group__2 ;
    public final void rule__DataVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2490:1: ( rule__DataVariable__Group__1__Impl rule__DataVariable__Group__2 )
            // InternalX21.g:2491:2: rule__DataVariable__Group__1__Impl rule__DataVariable__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__DataVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataVariable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataVariable__Group__1"


    // $ANTLR start "rule__DataVariable__Group__1__Impl"
    // InternalX21.g:2498:1: rule__DataVariable__Group__1__Impl : ( ':' ) ;
    public final void rule__DataVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2502:1: ( ( ':' ) )
            // InternalX21.g:2503:1: ( ':' )
            {
            // InternalX21.g:2503:1: ( ':' )
            // InternalX21.g:2504:2: ':'
            {
             before(grammarAccess.getDataVariableAccess().getColonKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDataVariableAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataVariable__Group__1__Impl"


    // $ANTLR start "rule__DataVariable__Group__2"
    // InternalX21.g:2513:1: rule__DataVariable__Group__2 : rule__DataVariable__Group__2__Impl ;
    public final void rule__DataVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2517:1: ( rule__DataVariable__Group__2__Impl )
            // InternalX21.g:2518:2: rule__DataVariable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataVariable__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataVariable__Group__2"


    // $ANTLR start "rule__DataVariable__Group__2__Impl"
    // InternalX21.g:2524:1: rule__DataVariable__Group__2__Impl : ( ( rule__DataVariable__TypeAssignment_2 ) ) ;
    public final void rule__DataVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2528:1: ( ( ( rule__DataVariable__TypeAssignment_2 ) ) )
            // InternalX21.g:2529:1: ( ( rule__DataVariable__TypeAssignment_2 ) )
            {
            // InternalX21.g:2529:1: ( ( rule__DataVariable__TypeAssignment_2 ) )
            // InternalX21.g:2530:2: ( rule__DataVariable__TypeAssignment_2 )
            {
             before(grammarAccess.getDataVariableAccess().getTypeAssignment_2()); 
            // InternalX21.g:2531:2: ( rule__DataVariable__TypeAssignment_2 )
            // InternalX21.g:2531:3: rule__DataVariable__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DataVariable__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataVariableAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataVariable__Group__2__Impl"


    // $ANTLR start "rule__Type__Group_0__0"
    // InternalX21.g:2540:1: rule__Type__Group_0__0 : rule__Type__Group_0__0__Impl rule__Type__Group_0__1 ;
    public final void rule__Type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2544:1: ( rule__Type__Group_0__0__Impl rule__Type__Group_0__1 )
            // InternalX21.g:2545:2: rule__Type__Group_0__0__Impl rule__Type__Group_0__1
            {
            pushFollow(FOLLOW_25);
            rule__Type__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0"


    // $ANTLR start "rule__Type__Group_0__0__Impl"
    // InternalX21.g:2552:1: rule__Type__Group_0__0__Impl : ( () ) ;
    public final void rule__Type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2556:1: ( ( () ) )
            // InternalX21.g:2557:1: ( () )
            {
            // InternalX21.g:2557:1: ( () )
            // InternalX21.g:2558:2: ()
            {
             before(grammarAccess.getTypeAccess().getIntTypeAction_0_0()); 
            // InternalX21.g:2559:2: ()
            // InternalX21.g:2559:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getIntTypeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0__Impl"


    // $ANTLR start "rule__Type__Group_0__1"
    // InternalX21.g:2567:1: rule__Type__Group_0__1 : rule__Type__Group_0__1__Impl ;
    public final void rule__Type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2571:1: ( rule__Type__Group_0__1__Impl )
            // InternalX21.g:2572:2: rule__Type__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__1"


    // $ANTLR start "rule__Type__Group_0__1__Impl"
    // InternalX21.g:2578:1: rule__Type__Group_0__1__Impl : ( 'int' ) ;
    public final void rule__Type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2582:1: ( ( 'int' ) )
            // InternalX21.g:2583:1: ( 'int' )
            {
            // InternalX21.g:2583:1: ( 'int' )
            // InternalX21.g:2584:2: 'int'
            {
             before(grammarAccess.getTypeAccess().getIntKeyword_0_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getIntKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__1__Impl"


    // $ANTLR start "rule__Type__Group_1__0"
    // InternalX21.g:2594:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2598:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // InternalX21.g:2599:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__Type__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0"


    // $ANTLR start "rule__Type__Group_1__0__Impl"
    // InternalX21.g:2606:1: rule__Type__Group_1__0__Impl : ( () ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2610:1: ( ( () ) )
            // InternalX21.g:2611:1: ( () )
            {
            // InternalX21.g:2611:1: ( () )
            // InternalX21.g:2612:2: ()
            {
             before(grammarAccess.getTypeAccess().getStringTypeAction_1_0()); 
            // InternalX21.g:2613:2: ()
            // InternalX21.g:2613:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getStringTypeAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0__Impl"


    // $ANTLR start "rule__Type__Group_1__1"
    // InternalX21.g:2621:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2625:1: ( rule__Type__Group_1__1__Impl )
            // InternalX21.g:2626:2: rule__Type__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1"


    // $ANTLR start "rule__Type__Group_1__1__Impl"
    // InternalX21.g:2632:1: rule__Type__Group_1__1__Impl : ( 'string' ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2636:1: ( ( 'string' ) )
            // InternalX21.g:2637:1: ( 'string' )
            {
            // InternalX21.g:2637:1: ( 'string' )
            // InternalX21.g:2638:2: 'string'
            {
             before(grammarAccess.getTypeAccess().getStringKeyword_1_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getStringKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1__Impl"


    // $ANTLR start "rule__Type__Group_2__0"
    // InternalX21.g:2648:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2652:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalX21.g:2653:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Type__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0"


    // $ANTLR start "rule__Type__Group_2__0__Impl"
    // InternalX21.g:2660:1: rule__Type__Group_2__0__Impl : ( () ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2664:1: ( ( () ) )
            // InternalX21.g:2665:1: ( () )
            {
            // InternalX21.g:2665:1: ( () )
            // InternalX21.g:2666:2: ()
            {
             before(grammarAccess.getTypeAccess().getCustomTypeAction_2_0()); 
            // InternalX21.g:2667:2: ()
            // InternalX21.g:2667:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getCustomTypeAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0__Impl"


    // $ANTLR start "rule__Type__Group_2__1"
    // InternalX21.g:2675:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2679:1: ( rule__Type__Group_2__1__Impl )
            // InternalX21.g:2680:2: rule__Type__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1"


    // $ANTLR start "rule__Type__Group_2__1__Impl"
    // InternalX21.g:2686:1: rule__Type__Group_2__1__Impl : ( ( rule__Type__RefAssignment_2_1 ) ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2690:1: ( ( ( rule__Type__RefAssignment_2_1 ) ) )
            // InternalX21.g:2691:1: ( ( rule__Type__RefAssignment_2_1 ) )
            {
            // InternalX21.g:2691:1: ( ( rule__Type__RefAssignment_2_1 ) )
            // InternalX21.g:2692:2: ( rule__Type__RefAssignment_2_1 )
            {
             before(grammarAccess.getTypeAccess().getRefAssignment_2_1()); 
            // InternalX21.g:2693:2: ( rule__Type__RefAssignment_2_1 )
            // InternalX21.g:2693:3: rule__Type__RefAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__RefAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getRefAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1__Impl"


    // $ANTLR start "rule__LogicExp__Group__0"
    // InternalX21.g:2702:1: rule__LogicExp__Group__0 : rule__LogicExp__Group__0__Impl rule__LogicExp__Group__1 ;
    public final void rule__LogicExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2706:1: ( rule__LogicExp__Group__0__Impl rule__LogicExp__Group__1 )
            // InternalX21.g:2707:2: rule__LogicExp__Group__0__Impl rule__LogicExp__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__LogicExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicExp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExp__Group__0"


    // $ANTLR start "rule__LogicExp__Group__0__Impl"
    // InternalX21.g:2714:1: rule__LogicExp__Group__0__Impl : ( ruleExp ) ;
    public final void rule__LogicExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2718:1: ( ( ruleExp ) )
            // InternalX21.g:2719:1: ( ruleExp )
            {
            // InternalX21.g:2719:1: ( ruleExp )
            // InternalX21.g:2720:2: ruleExp
            {
             before(grammarAccess.getLogicExpAccess().getExpParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getLogicExpAccess().getExpParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExp__Group__0__Impl"


    // $ANTLR start "rule__LogicExp__Group__1"
    // InternalX21.g:2729:1: rule__LogicExp__Group__1 : rule__LogicExp__Group__1__Impl rule__LogicExp__Group__2 ;
    public final void rule__LogicExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2733:1: ( rule__LogicExp__Group__1__Impl rule__LogicExp__Group__2 )
            // InternalX21.g:2734:2: rule__LogicExp__Group__1__Impl rule__LogicExp__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__LogicExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicExp__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExp__Group__1"


    // $ANTLR start "rule__LogicExp__Group__1__Impl"
    // InternalX21.g:2741:1: rule__LogicExp__Group__1__Impl : ( ( rule__LogicExp__Alternatives_1 ) ) ;
    public final void rule__LogicExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2745:1: ( ( ( rule__LogicExp__Alternatives_1 ) ) )
            // InternalX21.g:2746:1: ( ( rule__LogicExp__Alternatives_1 ) )
            {
            // InternalX21.g:2746:1: ( ( rule__LogicExp__Alternatives_1 ) )
            // InternalX21.g:2747:2: ( rule__LogicExp__Alternatives_1 )
            {
             before(grammarAccess.getLogicExpAccess().getAlternatives_1()); 
            // InternalX21.g:2748:2: ( rule__LogicExp__Alternatives_1 )
            // InternalX21.g:2748:3: rule__LogicExp__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__LogicExp__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicExpAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExp__Group__1__Impl"


    // $ANTLR start "rule__LogicExp__Group__2"
    // InternalX21.g:2756:1: rule__LogicExp__Group__2 : rule__LogicExp__Group__2__Impl ;
    public final void rule__LogicExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2760:1: ( rule__LogicExp__Group__2__Impl )
            // InternalX21.g:2761:2: rule__LogicExp__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicExp__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExp__Group__2"


    // $ANTLR start "rule__LogicExp__Group__2__Impl"
    // InternalX21.g:2767:1: rule__LogicExp__Group__2__Impl : ( ( rule__LogicExp__RightAssignment_2 ) ) ;
    public final void rule__LogicExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2771:1: ( ( ( rule__LogicExp__RightAssignment_2 ) ) )
            // InternalX21.g:2772:1: ( ( rule__LogicExp__RightAssignment_2 ) )
            {
            // InternalX21.g:2772:1: ( ( rule__LogicExp__RightAssignment_2 ) )
            // InternalX21.g:2773:2: ( rule__LogicExp__RightAssignment_2 )
            {
             before(grammarAccess.getLogicExpAccess().getRightAssignment_2()); 
            // InternalX21.g:2774:2: ( rule__LogicExp__RightAssignment_2 )
            // InternalX21.g:2774:3: rule__LogicExp__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LogicExp__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLogicExpAccess().getRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExp__Group__2__Impl"


    // $ANTLR start "rule__LogicExp__Group_1_0__0"
    // InternalX21.g:2783:1: rule__LogicExp__Group_1_0__0 : rule__LogicExp__Group_1_0__0__Impl rule__LogicExp__Group_1_0__1 ;
    public final void rule__LogicExp__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2787:1: ( rule__LogicExp__Group_1_0__0__Impl rule__LogicExp__Group_1_0__1 )
            // InternalX21.g:2788:2: rule__LogicExp__Group_1_0__0__Impl rule__LogicExp__Group_1_0__1
            {
            pushFollow(FOLLOW_28);
            rule__LogicExp__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicExp__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExp__Group_1_0__0"


    // $ANTLR start "rule__LogicExp__Group_1_0__0__Impl"
    // InternalX21.g:2795:1: rule__LogicExp__Group_1_0__0__Impl : ( () ) ;
    public final void rule__LogicExp__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2799:1: ( ( () ) )
            // InternalX21.g:2800:1: ( () )
            {
            // InternalX21.g:2800:1: ( () )
            // InternalX21.g:2801:2: ()
            {
             before(grammarAccess.getLogicExpAccess().getEqualsLeftAction_1_0_0()); 
            // InternalX21.g:2802:2: ()
            // InternalX21.g:2802:3: 
            {
            }

             after(grammarAccess.getLogicExpAccess().getEqualsLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExp__Group_1_0__0__Impl"


    // $ANTLR start "rule__LogicExp__Group_1_0__1"
    // InternalX21.g:2810:1: rule__LogicExp__Group_1_0__1 : rule__LogicExp__Group_1_0__1__Impl ;
    public final void rule__LogicExp__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2814:1: ( rule__LogicExp__Group_1_0__1__Impl )
            // InternalX21.g:2815:2: rule__LogicExp__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicExp__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExp__Group_1_0__1"


    // $ANTLR start "rule__LogicExp__Group_1_0__1__Impl"
    // InternalX21.g:2821:1: rule__LogicExp__Group_1_0__1__Impl : ( '=' ) ;
    public final void rule__LogicExp__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2825:1: ( ( '=' ) )
            // InternalX21.g:2826:1: ( '=' )
            {
            // InternalX21.g:2826:1: ( '=' )
            // InternalX21.g:2827:2: '='
            {
             before(grammarAccess.getLogicExpAccess().getEqualsSignKeyword_1_0_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLogicExpAccess().getEqualsSignKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExp__Group_1_0__1__Impl"


    // $ANTLR start "rule__LogicExp__Group_1_1__0"
    // InternalX21.g:2837:1: rule__LogicExp__Group_1_1__0 : rule__LogicExp__Group_1_1__0__Impl rule__LogicExp__Group_1_1__1 ;
    public final void rule__LogicExp__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2841:1: ( rule__LogicExp__Group_1_1__0__Impl rule__LogicExp__Group_1_1__1 )
            // InternalX21.g:2842:2: rule__LogicExp__Group_1_1__0__Impl rule__LogicExp__Group_1_1__1
            {
            pushFollow(FOLLOW_29);
            rule__LogicExp__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicExp__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExp__Group_1_1__0"


    // $ANTLR start "rule__LogicExp__Group_1_1__0__Impl"
    // InternalX21.g:2849:1: rule__LogicExp__Group_1_1__0__Impl : ( () ) ;
    public final void rule__LogicExp__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2853:1: ( ( () ) )
            // InternalX21.g:2854:1: ( () )
            {
            // InternalX21.g:2854:1: ( () )
            // InternalX21.g:2855:2: ()
            {
             before(grammarAccess.getLogicExpAccess().getLessThanLeftAction_1_1_0()); 
            // InternalX21.g:2856:2: ()
            // InternalX21.g:2856:3: 
            {
            }

             after(grammarAccess.getLogicExpAccess().getLessThanLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExp__Group_1_1__0__Impl"


    // $ANTLR start "rule__LogicExp__Group_1_1__1"
    // InternalX21.g:2864:1: rule__LogicExp__Group_1_1__1 : rule__LogicExp__Group_1_1__1__Impl ;
    public final void rule__LogicExp__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2868:1: ( rule__LogicExp__Group_1_1__1__Impl )
            // InternalX21.g:2869:2: rule__LogicExp__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicExp__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExp__Group_1_1__1"


    // $ANTLR start "rule__LogicExp__Group_1_1__1__Impl"
    // InternalX21.g:2875:1: rule__LogicExp__Group_1_1__1__Impl : ( '<' ) ;
    public final void rule__LogicExp__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2879:1: ( ( '<' ) )
            // InternalX21.g:2880:1: ( '<' )
            {
            // InternalX21.g:2880:1: ( '<' )
            // InternalX21.g:2881:2: '<'
            {
             before(grammarAccess.getLogicExpAccess().getLessThanSignKeyword_1_1_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLogicExpAccess().getLessThanSignKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExp__Group_1_1__1__Impl"


    // $ANTLR start "rule__LogicExp__Group_1_2__0"
    // InternalX21.g:2891:1: rule__LogicExp__Group_1_2__0 : rule__LogicExp__Group_1_2__0__Impl rule__LogicExp__Group_1_2__1 ;
    public final void rule__LogicExp__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2895:1: ( rule__LogicExp__Group_1_2__0__Impl rule__LogicExp__Group_1_2__1 )
            // InternalX21.g:2896:2: rule__LogicExp__Group_1_2__0__Impl rule__LogicExp__Group_1_2__1
            {
            pushFollow(FOLLOW_30);
            rule__LogicExp__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicExp__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExp__Group_1_2__0"


    // $ANTLR start "rule__LogicExp__Group_1_2__0__Impl"
    // InternalX21.g:2903:1: rule__LogicExp__Group_1_2__0__Impl : ( () ) ;
    public final void rule__LogicExp__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2907:1: ( ( () ) )
            // InternalX21.g:2908:1: ( () )
            {
            // InternalX21.g:2908:1: ( () )
            // InternalX21.g:2909:2: ()
            {
             before(grammarAccess.getLogicExpAccess().getGreaterThanLeftAction_1_2_0()); 
            // InternalX21.g:2910:2: ()
            // InternalX21.g:2910:3: 
            {
            }

             after(grammarAccess.getLogicExpAccess().getGreaterThanLeftAction_1_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExp__Group_1_2__0__Impl"


    // $ANTLR start "rule__LogicExp__Group_1_2__1"
    // InternalX21.g:2918:1: rule__LogicExp__Group_1_2__1 : rule__LogicExp__Group_1_2__1__Impl ;
    public final void rule__LogicExp__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2922:1: ( rule__LogicExp__Group_1_2__1__Impl )
            // InternalX21.g:2923:2: rule__LogicExp__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicExp__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExp__Group_1_2__1"


    // $ANTLR start "rule__LogicExp__Group_1_2__1__Impl"
    // InternalX21.g:2929:1: rule__LogicExp__Group_1_2__1__Impl : ( '>' ) ;
    public final void rule__LogicExp__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2933:1: ( ( '>' ) )
            // InternalX21.g:2934:1: ( '>' )
            {
            // InternalX21.g:2934:1: ( '>' )
            // InternalX21.g:2935:2: '>'
            {
             before(grammarAccess.getLogicExpAccess().getGreaterThanSignKeyword_1_2_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLogicExpAccess().getGreaterThanSignKeyword_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExp__Group_1_2__1__Impl"


    // $ANTLR start "rule__LogicExp__Group_1_3__0"
    // InternalX21.g:2945:1: rule__LogicExp__Group_1_3__0 : rule__LogicExp__Group_1_3__0__Impl rule__LogicExp__Group_1_3__1 ;
    public final void rule__LogicExp__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2949:1: ( rule__LogicExp__Group_1_3__0__Impl rule__LogicExp__Group_1_3__1 )
            // InternalX21.g:2950:2: rule__LogicExp__Group_1_3__0__Impl rule__LogicExp__Group_1_3__1
            {
            pushFollow(FOLLOW_31);
            rule__LogicExp__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicExp__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExp__Group_1_3__0"


    // $ANTLR start "rule__LogicExp__Group_1_3__0__Impl"
    // InternalX21.g:2957:1: rule__LogicExp__Group_1_3__0__Impl : ( () ) ;
    public final void rule__LogicExp__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2961:1: ( ( () ) )
            // InternalX21.g:2962:1: ( () )
            {
            // InternalX21.g:2962:1: ( () )
            // InternalX21.g:2963:2: ()
            {
             before(grammarAccess.getLogicExpAccess().getLessThanOrEqualsLeftAction_1_3_0()); 
            // InternalX21.g:2964:2: ()
            // InternalX21.g:2964:3: 
            {
            }

             after(grammarAccess.getLogicExpAccess().getLessThanOrEqualsLeftAction_1_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExp__Group_1_3__0__Impl"


    // $ANTLR start "rule__LogicExp__Group_1_3__1"
    // InternalX21.g:2972:1: rule__LogicExp__Group_1_3__1 : rule__LogicExp__Group_1_3__1__Impl ;
    public final void rule__LogicExp__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2976:1: ( rule__LogicExp__Group_1_3__1__Impl )
            // InternalX21.g:2977:2: rule__LogicExp__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicExp__Group_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExp__Group_1_3__1"


    // $ANTLR start "rule__LogicExp__Group_1_3__1__Impl"
    // InternalX21.g:2983:1: rule__LogicExp__Group_1_3__1__Impl : ( '<=' ) ;
    public final void rule__LogicExp__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2987:1: ( ( '<=' ) )
            // InternalX21.g:2988:1: ( '<=' )
            {
            // InternalX21.g:2988:1: ( '<=' )
            // InternalX21.g:2989:2: '<='
            {
             before(grammarAccess.getLogicExpAccess().getLessThanSignEqualsSignKeyword_1_3_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLogicExpAccess().getLessThanSignEqualsSignKeyword_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExp__Group_1_3__1__Impl"


    // $ANTLR start "rule__LogicExp__Group_1_4__0"
    // InternalX21.g:2999:1: rule__LogicExp__Group_1_4__0 : rule__LogicExp__Group_1_4__0__Impl rule__LogicExp__Group_1_4__1 ;
    public final void rule__LogicExp__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3003:1: ( rule__LogicExp__Group_1_4__0__Impl rule__LogicExp__Group_1_4__1 )
            // InternalX21.g:3004:2: rule__LogicExp__Group_1_4__0__Impl rule__LogicExp__Group_1_4__1
            {
            pushFollow(FOLLOW_27);
            rule__LogicExp__Group_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicExp__Group_1_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExp__Group_1_4__0"


    // $ANTLR start "rule__LogicExp__Group_1_4__0__Impl"
    // InternalX21.g:3011:1: rule__LogicExp__Group_1_4__0__Impl : ( () ) ;
    public final void rule__LogicExp__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3015:1: ( ( () ) )
            // InternalX21.g:3016:1: ( () )
            {
            // InternalX21.g:3016:1: ( () )
            // InternalX21.g:3017:2: ()
            {
             before(grammarAccess.getLogicExpAccess().getGreaterThanOrEqualsLeftAction_1_4_0()); 
            // InternalX21.g:3018:2: ()
            // InternalX21.g:3018:3: 
            {
            }

             after(grammarAccess.getLogicExpAccess().getGreaterThanOrEqualsLeftAction_1_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExp__Group_1_4__0__Impl"


    // $ANTLR start "rule__LogicExp__Group_1_4__1"
    // InternalX21.g:3026:1: rule__LogicExp__Group_1_4__1 : rule__LogicExp__Group_1_4__1__Impl ;
    public final void rule__LogicExp__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3030:1: ( rule__LogicExp__Group_1_4__1__Impl )
            // InternalX21.g:3031:2: rule__LogicExp__Group_1_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicExp__Group_1_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExp__Group_1_4__1"


    // $ANTLR start "rule__LogicExp__Group_1_4__1__Impl"
    // InternalX21.g:3037:1: rule__LogicExp__Group_1_4__1__Impl : ( '>=' ) ;
    public final void rule__LogicExp__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3041:1: ( ( '>=' ) )
            // InternalX21.g:3042:1: ( '>=' )
            {
            // InternalX21.g:3042:1: ( '>=' )
            // InternalX21.g:3043:2: '>='
            {
             before(grammarAccess.getLogicExpAccess().getGreaterThanSignEqualsSignKeyword_1_4_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getLogicExpAccess().getGreaterThanSignEqualsSignKeyword_1_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExp__Group_1_4__1__Impl"


    // $ANTLR start "rule__Exp__Group__0"
    // InternalX21.g:3053:1: rule__Exp__Group__0 : rule__Exp__Group__0__Impl rule__Exp__Group__1 ;
    public final void rule__Exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3057:1: ( rule__Exp__Group__0__Impl rule__Exp__Group__1 )
            // InternalX21.g:3058:2: rule__Exp__Group__0__Impl rule__Exp__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Exp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__0"


    // $ANTLR start "rule__Exp__Group__0__Impl"
    // InternalX21.g:3065:1: rule__Exp__Group__0__Impl : ( ruleMulDiv ) ;
    public final void rule__Exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3069:1: ( ( ruleMulDiv ) )
            // InternalX21.g:3070:1: ( ruleMulDiv )
            {
            // InternalX21.g:3070:1: ( ruleMulDiv )
            // InternalX21.g:3071:2: ruleMulDiv
            {
             before(grammarAccess.getExpAccess().getMulDivParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMulDiv();

            state._fsp--;

             after(grammarAccess.getExpAccess().getMulDivParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__0__Impl"


    // $ANTLR start "rule__Exp__Group__1"
    // InternalX21.g:3080:1: rule__Exp__Group__1 : rule__Exp__Group__1__Impl ;
    public final void rule__Exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3084:1: ( rule__Exp__Group__1__Impl )
            // InternalX21.g:3085:2: rule__Exp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__1"


    // $ANTLR start "rule__Exp__Group__1__Impl"
    // InternalX21.g:3091:1: rule__Exp__Group__1__Impl : ( ( rule__Exp__Group_1__0 )* ) ;
    public final void rule__Exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3095:1: ( ( ( rule__Exp__Group_1__0 )* ) )
            // InternalX21.g:3096:1: ( ( rule__Exp__Group_1__0 )* )
            {
            // InternalX21.g:3096:1: ( ( rule__Exp__Group_1__0 )* )
            // InternalX21.g:3097:2: ( rule__Exp__Group_1__0 )*
            {
             before(grammarAccess.getExpAccess().getGroup_1()); 
            // InternalX21.g:3098:2: ( rule__Exp__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_INT)||LA15_0==15||LA15_0==35||LA15_0==38||(LA15_0>=42 && LA15_0<=43)||LA15_0==46) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalX21.g:3098:3: rule__Exp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Exp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getExpAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__1__Impl"


    // $ANTLR start "rule__Exp__Group_1__0"
    // InternalX21.g:3107:1: rule__Exp__Group_1__0 : rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 ;
    public final void rule__Exp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3111:1: ( rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 )
            // InternalX21.g:3112:2: rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Exp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__0"


    // $ANTLR start "rule__Exp__Group_1__0__Impl"
    // InternalX21.g:3119:1: rule__Exp__Group_1__0__Impl : ( ( rule__Exp__Alternatives_1_0 ) ) ;
    public final void rule__Exp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3123:1: ( ( ( rule__Exp__Alternatives_1_0 ) ) )
            // InternalX21.g:3124:1: ( ( rule__Exp__Alternatives_1_0 ) )
            {
            // InternalX21.g:3124:1: ( ( rule__Exp__Alternatives_1_0 ) )
            // InternalX21.g:3125:2: ( rule__Exp__Alternatives_1_0 )
            {
             before(grammarAccess.getExpAccess().getAlternatives_1_0()); 
            // InternalX21.g:3126:2: ( rule__Exp__Alternatives_1_0 )
            // InternalX21.g:3126:3: rule__Exp__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__0__Impl"


    // $ANTLR start "rule__Exp__Group_1__1"
    // InternalX21.g:3134:1: rule__Exp__Group_1__1 : rule__Exp__Group_1__1__Impl ;
    public final void rule__Exp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3138:1: ( rule__Exp__Group_1__1__Impl )
            // InternalX21.g:3139:2: rule__Exp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__1"


    // $ANTLR start "rule__Exp__Group_1__1__Impl"
    // InternalX21.g:3145:1: rule__Exp__Group_1__1__Impl : ( ( rule__Exp__RightAssignment_1_1 ) ) ;
    public final void rule__Exp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3149:1: ( ( ( rule__Exp__RightAssignment_1_1 ) ) )
            // InternalX21.g:3150:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            {
            // InternalX21.g:3150:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            // InternalX21.g:3151:2: ( rule__Exp__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpAccess().getRightAssignment_1_1()); 
            // InternalX21.g:3152:2: ( rule__Exp__RightAssignment_1_1 )
            // InternalX21.g:3152:3: rule__Exp__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Exp__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__1__Impl"


    // $ANTLR start "rule__Exp__Group_1_0_0__0"
    // InternalX21.g:3161:1: rule__Exp__Group_1_0_0__0 : rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1 ;
    public final void rule__Exp__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3165:1: ( rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1 )
            // InternalX21.g:3166:2: rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1
            {
            pushFollow(FOLLOW_32);
            rule__Exp__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_0__0"


    // $ANTLR start "rule__Exp__Group_1_0_0__0__Impl"
    // InternalX21.g:3173:1: rule__Exp__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3177:1: ( ( () ) )
            // InternalX21.g:3178:1: ( () )
            {
            // InternalX21.g:3178:1: ( () )
            // InternalX21.g:3179:2: ()
            {
             before(grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalX21.g:3180:2: ()
            // InternalX21.g:3180:3: 
            {
            }

             after(grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Exp__Group_1_0_0__1"
    // InternalX21.g:3188:1: rule__Exp__Group_1_0_0__1 : rule__Exp__Group_1_0_0__1__Impl ;
    public final void rule__Exp__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3192:1: ( rule__Exp__Group_1_0_0__1__Impl )
            // InternalX21.g:3193:2: rule__Exp__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_0__1"


    // $ANTLR start "rule__Exp__Group_1_0_0__1__Impl"
    // InternalX21.g:3199:1: rule__Exp__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Exp__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3203:1: ( ( '+' ) )
            // InternalX21.g:3204:1: ( '+' )
            {
            // InternalX21.g:3204:1: ( '+' )
            // InternalX21.g:3205:2: '+'
            {
             before(grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__MulDiv__Group__0"
    // InternalX21.g:3215:1: rule__MulDiv__Group__0 : rule__MulDiv__Group__0__Impl rule__MulDiv__Group__1 ;
    public final void rule__MulDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3219:1: ( rule__MulDiv__Group__0__Impl rule__MulDiv__Group__1 )
            // InternalX21.g:3220:2: rule__MulDiv__Group__0__Impl rule__MulDiv__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__MulDiv__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulDiv__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group__0"


    // $ANTLR start "rule__MulDiv__Group__0__Impl"
    // InternalX21.g:3227:1: rule__MulDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3231:1: ( ( rulePrimary ) )
            // InternalX21.g:3232:1: ( rulePrimary )
            {
            // InternalX21.g:3232:1: ( rulePrimary )
            // InternalX21.g:3233:2: rulePrimary
            {
             before(grammarAccess.getMulDivAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulDivAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group__0__Impl"


    // $ANTLR start "rule__MulDiv__Group__1"
    // InternalX21.g:3242:1: rule__MulDiv__Group__1 : rule__MulDiv__Group__1__Impl ;
    public final void rule__MulDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3246:1: ( rule__MulDiv__Group__1__Impl )
            // InternalX21.g:3247:2: rule__MulDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulDiv__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group__1"


    // $ANTLR start "rule__MulDiv__Group__1__Impl"
    // InternalX21.g:3253:1: rule__MulDiv__Group__1__Impl : ( ( rule__MulDiv__Group_1__0 )* ) ;
    public final void rule__MulDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3257:1: ( ( ( rule__MulDiv__Group_1__0 )* ) )
            // InternalX21.g:3258:1: ( ( rule__MulDiv__Group_1__0 )* )
            {
            // InternalX21.g:3258:1: ( ( rule__MulDiv__Group_1__0 )* )
            // InternalX21.g:3259:2: ( rule__MulDiv__Group_1__0 )*
            {
             before(grammarAccess.getMulDivAccess().getGroup_1()); 
            // InternalX21.g:3260:2: ( rule__MulDiv__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=36 && LA16_0<=37)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalX21.g:3260:3: rule__MulDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__MulDiv__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getMulDivAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group__1__Impl"


    // $ANTLR start "rule__MulDiv__Group_1__0"
    // InternalX21.g:3269:1: rule__MulDiv__Group_1__0 : rule__MulDiv__Group_1__0__Impl rule__MulDiv__Group_1__1 ;
    public final void rule__MulDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3273:1: ( rule__MulDiv__Group_1__0__Impl rule__MulDiv__Group_1__1 )
            // InternalX21.g:3274:2: rule__MulDiv__Group_1__0__Impl rule__MulDiv__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__MulDiv__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulDiv__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group_1__0"


    // $ANTLR start "rule__MulDiv__Group_1__0__Impl"
    // InternalX21.g:3281:1: rule__MulDiv__Group_1__0__Impl : ( ( rule__MulDiv__Alternatives_1_0 ) ) ;
    public final void rule__MulDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3285:1: ( ( ( rule__MulDiv__Alternatives_1_0 ) ) )
            // InternalX21.g:3286:1: ( ( rule__MulDiv__Alternatives_1_0 ) )
            {
            // InternalX21.g:3286:1: ( ( rule__MulDiv__Alternatives_1_0 ) )
            // InternalX21.g:3287:2: ( rule__MulDiv__Alternatives_1_0 )
            {
             before(grammarAccess.getMulDivAccess().getAlternatives_1_0()); 
            // InternalX21.g:3288:2: ( rule__MulDiv__Alternatives_1_0 )
            // InternalX21.g:3288:3: rule__MulDiv__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MulDiv__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMulDivAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group_1__0__Impl"


    // $ANTLR start "rule__MulDiv__Group_1__1"
    // InternalX21.g:3296:1: rule__MulDiv__Group_1__1 : rule__MulDiv__Group_1__1__Impl ;
    public final void rule__MulDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3300:1: ( rule__MulDiv__Group_1__1__Impl )
            // InternalX21.g:3301:2: rule__MulDiv__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulDiv__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group_1__1"


    // $ANTLR start "rule__MulDiv__Group_1__1__Impl"
    // InternalX21.g:3307:1: rule__MulDiv__Group_1__1__Impl : ( ( rule__MulDiv__RightAssignment_1_1 ) ) ;
    public final void rule__MulDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3311:1: ( ( ( rule__MulDiv__RightAssignment_1_1 ) ) )
            // InternalX21.g:3312:1: ( ( rule__MulDiv__RightAssignment_1_1 ) )
            {
            // InternalX21.g:3312:1: ( ( rule__MulDiv__RightAssignment_1_1 ) )
            // InternalX21.g:3313:2: ( rule__MulDiv__RightAssignment_1_1 )
            {
             before(grammarAccess.getMulDivAccess().getRightAssignment_1_1()); 
            // InternalX21.g:3314:2: ( rule__MulDiv__RightAssignment_1_1 )
            // InternalX21.g:3314:3: rule__MulDiv__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MulDiv__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMulDivAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group_1__1__Impl"


    // $ANTLR start "rule__MulDiv__Group_1_0_0__0"
    // InternalX21.g:3323:1: rule__MulDiv__Group_1_0_0__0 : rule__MulDiv__Group_1_0_0__0__Impl rule__MulDiv__Group_1_0_0__1 ;
    public final void rule__MulDiv__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3327:1: ( rule__MulDiv__Group_1_0_0__0__Impl rule__MulDiv__Group_1_0_0__1 )
            // InternalX21.g:3328:2: rule__MulDiv__Group_1_0_0__0__Impl rule__MulDiv__Group_1_0_0__1
            {
            pushFollow(FOLLOW_36);
            rule__MulDiv__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulDiv__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group_1_0_0__0"


    // $ANTLR start "rule__MulDiv__Group_1_0_0__0__Impl"
    // InternalX21.g:3335:1: rule__MulDiv__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MulDiv__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3339:1: ( ( () ) )
            // InternalX21.g:3340:1: ( () )
            {
            // InternalX21.g:3340:1: ( () )
            // InternalX21.g:3341:2: ()
            {
             before(grammarAccess.getMulDivAccess().getMulLeftAction_1_0_0_0()); 
            // InternalX21.g:3342:2: ()
            // InternalX21.g:3342:3: 
            {
            }

             after(grammarAccess.getMulDivAccess().getMulLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__MulDiv__Group_1_0_0__1"
    // InternalX21.g:3350:1: rule__MulDiv__Group_1_0_0__1 : rule__MulDiv__Group_1_0_0__1__Impl ;
    public final void rule__MulDiv__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3354:1: ( rule__MulDiv__Group_1_0_0__1__Impl )
            // InternalX21.g:3355:2: rule__MulDiv__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulDiv__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group_1_0_0__1"


    // $ANTLR start "rule__MulDiv__Group_1_0_0__1__Impl"
    // InternalX21.g:3361:1: rule__MulDiv__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__MulDiv__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3365:1: ( ( '*' ) )
            // InternalX21.g:3366:1: ( '*' )
            {
            // InternalX21.g:3366:1: ( '*' )
            // InternalX21.g:3367:2: '*'
            {
             before(grammarAccess.getMulDivAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMulDivAccess().getAsteriskKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__MulDiv__Group_1_0_1__0"
    // InternalX21.g:3377:1: rule__MulDiv__Group_1_0_1__0 : rule__MulDiv__Group_1_0_1__0__Impl rule__MulDiv__Group_1_0_1__1 ;
    public final void rule__MulDiv__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3381:1: ( rule__MulDiv__Group_1_0_1__0__Impl rule__MulDiv__Group_1_0_1__1 )
            // InternalX21.g:3382:2: rule__MulDiv__Group_1_0_1__0__Impl rule__MulDiv__Group_1_0_1__1
            {
            pushFollow(FOLLOW_34);
            rule__MulDiv__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulDiv__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group_1_0_1__0"


    // $ANTLR start "rule__MulDiv__Group_1_0_1__0__Impl"
    // InternalX21.g:3389:1: rule__MulDiv__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__MulDiv__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3393:1: ( ( () ) )
            // InternalX21.g:3394:1: ( () )
            {
            // InternalX21.g:3394:1: ( () )
            // InternalX21.g:3395:2: ()
            {
             before(grammarAccess.getMulDivAccess().getDivLeftAction_1_0_1_0()); 
            // InternalX21.g:3396:2: ()
            // InternalX21.g:3396:3: 
            {
            }

             after(grammarAccess.getMulDivAccess().getDivLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__MulDiv__Group_1_0_1__1"
    // InternalX21.g:3404:1: rule__MulDiv__Group_1_0_1__1 : rule__MulDiv__Group_1_0_1__1__Impl ;
    public final void rule__MulDiv__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3408:1: ( rule__MulDiv__Group_1_0_1__1__Impl )
            // InternalX21.g:3409:2: rule__MulDiv__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulDiv__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group_1_0_1__1"


    // $ANTLR start "rule__MulDiv__Group_1_0_1__1__Impl"
    // InternalX21.g:3415:1: rule__MulDiv__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__MulDiv__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3419:1: ( ( '/' ) )
            // InternalX21.g:3420:1: ( '/' )
            {
            // InternalX21.g:3420:1: ( '/' )
            // InternalX21.g:3421:2: '/'
            {
             before(grammarAccess.getMulDivAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMulDivAccess().getSolidusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalX21.g:3431:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3435:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalX21.g:3436:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_37);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalX21.g:3443:1: rule__Primary__Group_0__0__Impl : ( () ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3447:1: ( ( () ) )
            // InternalX21.g:3448:1: ( () )
            {
            // InternalX21.g:3448:1: ( () )
            // InternalX21.g:3449:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getIntAction_0_0()); 
            // InternalX21.g:3450:2: ()
            // InternalX21.g:3450:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getIntAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalX21.g:3458:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3462:1: ( rule__Primary__Group_0__1__Impl )
            // InternalX21.g:3463:2: rule__Primary__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalX21.g:3469:1: rule__Primary__Group_0__1__Impl : ( ( rule__Primary__ValueAssignment_0_1 ) ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3473:1: ( ( ( rule__Primary__ValueAssignment_0_1 ) ) )
            // InternalX21.g:3474:1: ( ( rule__Primary__ValueAssignment_0_1 ) )
            {
            // InternalX21.g:3474:1: ( ( rule__Primary__ValueAssignment_0_1 ) )
            // InternalX21.g:3475:2: ( rule__Primary__ValueAssignment_0_1 )
            {
             before(grammarAccess.getPrimaryAccess().getValueAssignment_0_1()); 
            // InternalX21.g:3476:2: ( rule__Primary__ValueAssignment_0_1 )
            // InternalX21.g:3476:3: rule__Primary__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalX21.g:3485:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3489:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalX21.g:3490:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalX21.g:3497:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3501:1: ( ( () ) )
            // InternalX21.g:3502:1: ( () )
            {
            // InternalX21.g:3502:1: ( () )
            // InternalX21.g:3503:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getParenthesisAction_1_0()); 
            // InternalX21.g:3504:2: ()
            // InternalX21.g:3504:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getParenthesisAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalX21.g:3512:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3516:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalX21.g:3517:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalX21.g:3524:1: rule__Primary__Group_1__1__Impl : ( '(' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3528:1: ( ( '(' ) )
            // InternalX21.g:3529:1: ( '(' )
            {
            // InternalX21.g:3529:1: ( '(' )
            // InternalX21.g:3530:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // InternalX21.g:3539:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl rule__Primary__Group_1__3 ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3543:1: ( rule__Primary__Group_1__2__Impl rule__Primary__Group_1__3 )
            // InternalX21.g:3544:2: rule__Primary__Group_1__2__Impl rule__Primary__Group_1__3
            {
            pushFollow(FOLLOW_10);
            rule__Primary__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // InternalX21.g:3551:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__BodyAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3555:1: ( ( ( rule__Primary__BodyAssignment_1_2 ) ) )
            // InternalX21.g:3556:1: ( ( rule__Primary__BodyAssignment_1_2 ) )
            {
            // InternalX21.g:3556:1: ( ( rule__Primary__BodyAssignment_1_2 ) )
            // InternalX21.g:3557:2: ( rule__Primary__BodyAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getBodyAssignment_1_2()); 
            // InternalX21.g:3558:2: ( rule__Primary__BodyAssignment_1_2 )
            // InternalX21.g:3558:3: rule__Primary__BodyAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__BodyAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getBodyAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_1__3"
    // InternalX21.g:3566:1: rule__Primary__Group_1__3 : rule__Primary__Group_1__3__Impl ;
    public final void rule__Primary__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3570:1: ( rule__Primary__Group_1__3__Impl )
            // InternalX21.g:3571:2: rule__Primary__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__3"


    // $ANTLR start "rule__Primary__Group_1__3__Impl"
    // InternalX21.g:3577:1: rule__Primary__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Primary__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3581:1: ( ( ')' ) )
            // InternalX21.g:3582:1: ( ')' )
            {
            // InternalX21.g:3582:1: ( ')' )
            // InternalX21.g:3583:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__3__Impl"


    // $ANTLR start "rule__LetStatement__Group__0"
    // InternalX21.g:3593:1: rule__LetStatement__Group__0 : rule__LetStatement__Group__0__Impl rule__LetStatement__Group__1 ;
    public final void rule__LetStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3597:1: ( rule__LetStatement__Group__0__Impl rule__LetStatement__Group__1 )
            // InternalX21.g:3598:2: rule__LetStatement__Group__0__Impl rule__LetStatement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LetStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group__0"


    // $ANTLR start "rule__LetStatement__Group__0__Impl"
    // InternalX21.g:3605:1: rule__LetStatement__Group__0__Impl : ( 'let' ) ;
    public final void rule__LetStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3609:1: ( ( 'let' ) )
            // InternalX21.g:3610:1: ( 'let' )
            {
            // InternalX21.g:3610:1: ( 'let' )
            // InternalX21.g:3611:2: 'let'
            {
             before(grammarAccess.getLetStatementAccess().getLetKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLetStatementAccess().getLetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group__0__Impl"


    // $ANTLR start "rule__LetStatement__Group__1"
    // InternalX21.g:3620:1: rule__LetStatement__Group__1 : rule__LetStatement__Group__1__Impl rule__LetStatement__Group__2 ;
    public final void rule__LetStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3624:1: ( rule__LetStatement__Group__1__Impl rule__LetStatement__Group__2 )
            // InternalX21.g:3625:2: rule__LetStatement__Group__1__Impl rule__LetStatement__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__LetStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group__1"


    // $ANTLR start "rule__LetStatement__Group__1__Impl"
    // InternalX21.g:3632:1: rule__LetStatement__Group__1__Impl : ( ( rule__LetStatement__NameAssignment_1 ) ) ;
    public final void rule__LetStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3636:1: ( ( ( rule__LetStatement__NameAssignment_1 ) ) )
            // InternalX21.g:3637:1: ( ( rule__LetStatement__NameAssignment_1 ) )
            {
            // InternalX21.g:3637:1: ( ( rule__LetStatement__NameAssignment_1 ) )
            // InternalX21.g:3638:2: ( rule__LetStatement__NameAssignment_1 )
            {
             before(grammarAccess.getLetStatementAccess().getNameAssignment_1()); 
            // InternalX21.g:3639:2: ( rule__LetStatement__NameAssignment_1 )
            // InternalX21.g:3639:3: rule__LetStatement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LetStatement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLetStatementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group__1__Impl"


    // $ANTLR start "rule__LetStatement__Group__2"
    // InternalX21.g:3647:1: rule__LetStatement__Group__2 : rule__LetStatement__Group__2__Impl rule__LetStatement__Group__3 ;
    public final void rule__LetStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3651:1: ( rule__LetStatement__Group__2__Impl rule__LetStatement__Group__3 )
            // InternalX21.g:3652:2: rule__LetStatement__Group__2__Impl rule__LetStatement__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__LetStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group__2"


    // $ANTLR start "rule__LetStatement__Group__2__Impl"
    // InternalX21.g:3659:1: rule__LetStatement__Group__2__Impl : ( '=' ) ;
    public final void rule__LetStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3663:1: ( ( '=' ) )
            // InternalX21.g:3664:1: ( '=' )
            {
            // InternalX21.g:3664:1: ( '=' )
            // InternalX21.g:3665:2: '='
            {
             before(grammarAccess.getLetStatementAccess().getEqualsSignKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLetStatementAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group__2__Impl"


    // $ANTLR start "rule__LetStatement__Group__3"
    // InternalX21.g:3674:1: rule__LetStatement__Group__3 : rule__LetStatement__Group__3__Impl rule__LetStatement__Group__4 ;
    public final void rule__LetStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3678:1: ( rule__LetStatement__Group__3__Impl rule__LetStatement__Group__4 )
            // InternalX21.g:3679:2: rule__LetStatement__Group__3__Impl rule__LetStatement__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__LetStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group__3"


    // $ANTLR start "rule__LetStatement__Group__3__Impl"
    // InternalX21.g:3686:1: rule__LetStatement__Group__3__Impl : ( ( rule__LetStatement__ValueAssignment_3 ) ) ;
    public final void rule__LetStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3690:1: ( ( ( rule__LetStatement__ValueAssignment_3 ) ) )
            // InternalX21.g:3691:1: ( ( rule__LetStatement__ValueAssignment_3 ) )
            {
            // InternalX21.g:3691:1: ( ( rule__LetStatement__ValueAssignment_3 ) )
            // InternalX21.g:3692:2: ( rule__LetStatement__ValueAssignment_3 )
            {
             before(grammarAccess.getLetStatementAccess().getValueAssignment_3()); 
            // InternalX21.g:3693:2: ( rule__LetStatement__ValueAssignment_3 )
            // InternalX21.g:3693:3: rule__LetStatement__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LetStatement__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLetStatementAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group__3__Impl"


    // $ANTLR start "rule__LetStatement__Group__4"
    // InternalX21.g:3701:1: rule__LetStatement__Group__4 : rule__LetStatement__Group__4__Impl rule__LetStatement__Group__5 ;
    public final void rule__LetStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3705:1: ( rule__LetStatement__Group__4__Impl rule__LetStatement__Group__5 )
            // InternalX21.g:3706:2: rule__LetStatement__Group__4__Impl rule__LetStatement__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__LetStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group__4"


    // $ANTLR start "rule__LetStatement__Group__4__Impl"
    // InternalX21.g:3713:1: rule__LetStatement__Group__4__Impl : ( 'in' ) ;
    public final void rule__LetStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3717:1: ( ( 'in' ) )
            // InternalX21.g:3718:1: ( 'in' )
            {
            // InternalX21.g:3718:1: ( 'in' )
            // InternalX21.g:3719:2: 'in'
            {
             before(grammarAccess.getLetStatementAccess().getInKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLetStatementAccess().getInKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group__4__Impl"


    // $ANTLR start "rule__LetStatement__Group__5"
    // InternalX21.g:3728:1: rule__LetStatement__Group__5 : rule__LetStatement__Group__5__Impl rule__LetStatement__Group__6 ;
    public final void rule__LetStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3732:1: ( rule__LetStatement__Group__5__Impl rule__LetStatement__Group__6 )
            // InternalX21.g:3733:2: rule__LetStatement__Group__5__Impl rule__LetStatement__Group__6
            {
            pushFollow(FOLLOW_39);
            rule__LetStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetStatement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group__5"


    // $ANTLR start "rule__LetStatement__Group__5__Impl"
    // InternalX21.g:3740:1: rule__LetStatement__Group__5__Impl : ( ( rule__LetStatement__BodyAssignment_5 ) ) ;
    public final void rule__LetStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3744:1: ( ( ( rule__LetStatement__BodyAssignment_5 ) ) )
            // InternalX21.g:3745:1: ( ( rule__LetStatement__BodyAssignment_5 ) )
            {
            // InternalX21.g:3745:1: ( ( rule__LetStatement__BodyAssignment_5 ) )
            // InternalX21.g:3746:2: ( rule__LetStatement__BodyAssignment_5 )
            {
             before(grammarAccess.getLetStatementAccess().getBodyAssignment_5()); 
            // InternalX21.g:3747:2: ( rule__LetStatement__BodyAssignment_5 )
            // InternalX21.g:3747:3: rule__LetStatement__BodyAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LetStatement__BodyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLetStatementAccess().getBodyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group__5__Impl"


    // $ANTLR start "rule__LetStatement__Group__6"
    // InternalX21.g:3755:1: rule__LetStatement__Group__6 : rule__LetStatement__Group__6__Impl ;
    public final void rule__LetStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3759:1: ( rule__LetStatement__Group__6__Impl )
            // InternalX21.g:3760:2: rule__LetStatement__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LetStatement__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group__6"


    // $ANTLR start "rule__LetStatement__Group__6__Impl"
    // InternalX21.g:3766:1: rule__LetStatement__Group__6__Impl : ( 'end' ) ;
    public final void rule__LetStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3770:1: ( ( 'end' ) )
            // InternalX21.g:3771:1: ( 'end' )
            {
            // InternalX21.g:3771:1: ( 'end' )
            // InternalX21.g:3772:2: 'end'
            {
             before(grammarAccess.getLetStatementAccess().getEndKeyword_6()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLetStatementAccess().getEndKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group__6__Impl"


    // $ANTLR start "rule__DataAccess__Group__0"
    // InternalX21.g:3782:1: rule__DataAccess__Group__0 : rule__DataAccess__Group__0__Impl rule__DataAccess__Group__1 ;
    public final void rule__DataAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3786:1: ( rule__DataAccess__Group__0__Impl rule__DataAccess__Group__1 )
            // InternalX21.g:3787:2: rule__DataAccess__Group__0__Impl rule__DataAccess__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__DataAccess__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccess__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__0"


    // $ANTLR start "rule__DataAccess__Group__0__Impl"
    // InternalX21.g:3794:1: rule__DataAccess__Group__0__Impl : ( ( rule__DataAccess__RefAssignment_0 ) ) ;
    public final void rule__DataAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3798:1: ( ( ( rule__DataAccess__RefAssignment_0 ) ) )
            // InternalX21.g:3799:1: ( ( rule__DataAccess__RefAssignment_0 ) )
            {
            // InternalX21.g:3799:1: ( ( rule__DataAccess__RefAssignment_0 ) )
            // InternalX21.g:3800:2: ( rule__DataAccess__RefAssignment_0 )
            {
             before(grammarAccess.getDataAccessAccess().getRefAssignment_0()); 
            // InternalX21.g:3801:2: ( rule__DataAccess__RefAssignment_0 )
            // InternalX21.g:3801:3: rule__DataAccess__RefAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DataAccess__RefAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessAccess().getRefAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__0__Impl"


    // $ANTLR start "rule__DataAccess__Group__1"
    // InternalX21.g:3809:1: rule__DataAccess__Group__1 : rule__DataAccess__Group__1__Impl ;
    public final void rule__DataAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3813:1: ( rule__DataAccess__Group__1__Impl )
            // InternalX21.g:3814:2: rule__DataAccess__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataAccess__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__1"


    // $ANTLR start "rule__DataAccess__Group__1__Impl"
    // InternalX21.g:3820:1: rule__DataAccess__Group__1__Impl : ( ( rule__DataAccess__Group_1__0 )* ) ;
    public final void rule__DataAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3824:1: ( ( ( rule__DataAccess__Group_1__0 )* ) )
            // InternalX21.g:3825:1: ( ( rule__DataAccess__Group_1__0 )* )
            {
            // InternalX21.g:3825:1: ( ( rule__DataAccess__Group_1__0 )* )
            // InternalX21.g:3826:2: ( rule__DataAccess__Group_1__0 )*
            {
             before(grammarAccess.getDataAccessAccess().getGroup_1()); 
            // InternalX21.g:3827:2: ( rule__DataAccess__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==41) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalX21.g:3827:3: rule__DataAccess__Group_1__0
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__DataAccess__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getDataAccessAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__1__Impl"


    // $ANTLR start "rule__DataAccess__Group_1__0"
    // InternalX21.g:3836:1: rule__DataAccess__Group_1__0 : rule__DataAccess__Group_1__0__Impl rule__DataAccess__Group_1__1 ;
    public final void rule__DataAccess__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3840:1: ( rule__DataAccess__Group_1__0__Impl rule__DataAccess__Group_1__1 )
            // InternalX21.g:3841:2: rule__DataAccess__Group_1__0__Impl rule__DataAccess__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__DataAccess__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccess__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group_1__0"


    // $ANTLR start "rule__DataAccess__Group_1__0__Impl"
    // InternalX21.g:3848:1: rule__DataAccess__Group_1__0__Impl : ( '.' ) ;
    public final void rule__DataAccess__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3852:1: ( ( '.' ) )
            // InternalX21.g:3853:1: ( '.' )
            {
            // InternalX21.g:3853:1: ( '.' )
            // InternalX21.g:3854:2: '.'
            {
             before(grammarAccess.getDataAccessAccess().getFullStopKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDataAccessAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group_1__0__Impl"


    // $ANTLR start "rule__DataAccess__Group_1__1"
    // InternalX21.g:3863:1: rule__DataAccess__Group_1__1 : rule__DataAccess__Group_1__1__Impl ;
    public final void rule__DataAccess__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3867:1: ( rule__DataAccess__Group_1__1__Impl )
            // InternalX21.g:3868:2: rule__DataAccess__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataAccess__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group_1__1"


    // $ANTLR start "rule__DataAccess__Group_1__1__Impl"
    // InternalX21.g:3874:1: rule__DataAccess__Group_1__1__Impl : ( ( rule__DataAccess__VarRefsAssignment_1_1 ) ) ;
    public final void rule__DataAccess__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3878:1: ( ( ( rule__DataAccess__VarRefsAssignment_1_1 ) ) )
            // InternalX21.g:3879:1: ( ( rule__DataAccess__VarRefsAssignment_1_1 ) )
            {
            // InternalX21.g:3879:1: ( ( rule__DataAccess__VarRefsAssignment_1_1 ) )
            // InternalX21.g:3880:2: ( rule__DataAccess__VarRefsAssignment_1_1 )
            {
             before(grammarAccess.getDataAccessAccess().getVarRefsAssignment_1_1()); 
            // InternalX21.g:3881:2: ( rule__DataAccess__VarRefsAssignment_1_1 )
            // InternalX21.g:3881:3: rule__DataAccess__VarRefsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DataAccess__VarRefsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessAccess().getVarRefsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group_1__1__Impl"


    // $ANTLR start "rule__None__Group__0"
    // InternalX21.g:3890:1: rule__None__Group__0 : rule__None__Group__0__Impl rule__None__Group__1 ;
    public final void rule__None__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3894:1: ( rule__None__Group__0__Impl rule__None__Group__1 )
            // InternalX21.g:3895:2: rule__None__Group__0__Impl rule__None__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__None__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__None__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__None__Group__0"


    // $ANTLR start "rule__None__Group__0__Impl"
    // InternalX21.g:3902:1: rule__None__Group__0__Impl : ( () ) ;
    public final void rule__None__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3906:1: ( ( () ) )
            // InternalX21.g:3907:1: ( () )
            {
            // InternalX21.g:3907:1: ( () )
            // InternalX21.g:3908:2: ()
            {
             before(grammarAccess.getNoneAccess().getNoneAction_0()); 
            // InternalX21.g:3909:2: ()
            // InternalX21.g:3909:3: 
            {
            }

             after(grammarAccess.getNoneAccess().getNoneAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__None__Group__0__Impl"


    // $ANTLR start "rule__None__Group__1"
    // InternalX21.g:3917:1: rule__None__Group__1 : rule__None__Group__1__Impl ;
    public final void rule__None__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3921:1: ( rule__None__Group__1__Impl )
            // InternalX21.g:3922:2: rule__None__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__None__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__None__Group__1"


    // $ANTLR start "rule__None__Group__1__Impl"
    // InternalX21.g:3928:1: rule__None__Group__1__Impl : ( 'none' ) ;
    public final void rule__None__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3932:1: ( ( 'none' ) )
            // InternalX21.g:3933:1: ( 'none' )
            {
            // InternalX21.g:3933:1: ( 'none' )
            // InternalX21.g:3934:2: 'none'
            {
             before(grammarAccess.getNoneAccess().getNoneKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getNoneAccess().getNoneKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__None__Group__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__0"
    // InternalX21.g:3944:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3948:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalX21.g:3949:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__IfStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__0"


    // $ANTLR start "rule__IfStatement__Group__0__Impl"
    // InternalX21.g:3956:1: rule__IfStatement__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3960:1: ( ( 'if' ) )
            // InternalX21.g:3961:1: ( 'if' )
            {
            // InternalX21.g:3961:1: ( 'if' )
            // InternalX21.g:3962:2: 'if'
            {
             before(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__0__Impl"


    // $ANTLR start "rule__IfStatement__Group__1"
    // InternalX21.g:3971:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3975:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalX21.g:3976:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__IfStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__1"


    // $ANTLR start "rule__IfStatement__Group__1__Impl"
    // InternalX21.g:3983:1: rule__IfStatement__Group__1__Impl : ( ( rule__IfStatement__ConditionAssignment_1 ) ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3987:1: ( ( ( rule__IfStatement__ConditionAssignment_1 ) ) )
            // InternalX21.g:3988:1: ( ( rule__IfStatement__ConditionAssignment_1 ) )
            {
            // InternalX21.g:3988:1: ( ( rule__IfStatement__ConditionAssignment_1 ) )
            // InternalX21.g:3989:2: ( rule__IfStatement__ConditionAssignment_1 )
            {
             before(grammarAccess.getIfStatementAccess().getConditionAssignment_1()); 
            // InternalX21.g:3990:2: ( rule__IfStatement__ConditionAssignment_1 )
            // InternalX21.g:3990:3: rule__IfStatement__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__2"
    // InternalX21.g:3998:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4002:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // InternalX21.g:4003:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__IfStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__2"


    // $ANTLR start "rule__IfStatement__Group__2__Impl"
    // InternalX21.g:4010:1: rule__IfStatement__Group__2__Impl : ( 'then' ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4014:1: ( ( 'then' ) )
            // InternalX21.g:4015:1: ( 'then' )
            {
            // InternalX21.g:4015:1: ( 'then' )
            // InternalX21.g:4016:2: 'then'
            {
             before(grammarAccess.getIfStatementAccess().getThenKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getThenKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__2__Impl"


    // $ANTLR start "rule__IfStatement__Group__3"
    // InternalX21.g:4025:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4029:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // InternalX21.g:4030:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__IfStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__3"


    // $ANTLR start "rule__IfStatement__Group__3__Impl"
    // InternalX21.g:4037:1: rule__IfStatement__Group__3__Impl : ( ( rule__IfStatement__TrueExpAssignment_3 ) ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4041:1: ( ( ( rule__IfStatement__TrueExpAssignment_3 ) ) )
            // InternalX21.g:4042:1: ( ( rule__IfStatement__TrueExpAssignment_3 ) )
            {
            // InternalX21.g:4042:1: ( ( rule__IfStatement__TrueExpAssignment_3 ) )
            // InternalX21.g:4043:2: ( rule__IfStatement__TrueExpAssignment_3 )
            {
             before(grammarAccess.getIfStatementAccess().getTrueExpAssignment_3()); 
            // InternalX21.g:4044:2: ( rule__IfStatement__TrueExpAssignment_3 )
            // InternalX21.g:4044:3: rule__IfStatement__TrueExpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__TrueExpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getTrueExpAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__3__Impl"


    // $ANTLR start "rule__IfStatement__Group__4"
    // InternalX21.g:4052:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4056:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // InternalX21.g:4057:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__IfStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__4"


    // $ANTLR start "rule__IfStatement__Group__4__Impl"
    // InternalX21.g:4064:1: rule__IfStatement__Group__4__Impl : ( 'else' ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4068:1: ( ( 'else' ) )
            // InternalX21.g:4069:1: ( 'else' )
            {
            // InternalX21.g:4069:1: ( 'else' )
            // InternalX21.g:4070:2: 'else'
            {
             before(grammarAccess.getIfStatementAccess().getElseKeyword_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getElseKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__4__Impl"


    // $ANTLR start "rule__IfStatement__Group__5"
    // InternalX21.g:4079:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4083:1: ( rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 )
            // InternalX21.g:4084:2: rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6
            {
            pushFollow(FOLLOW_39);
            rule__IfStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__5"


    // $ANTLR start "rule__IfStatement__Group__5__Impl"
    // InternalX21.g:4091:1: rule__IfStatement__Group__5__Impl : ( ( rule__IfStatement__FalseExpAssignment_5 ) ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4095:1: ( ( ( rule__IfStatement__FalseExpAssignment_5 ) ) )
            // InternalX21.g:4096:1: ( ( rule__IfStatement__FalseExpAssignment_5 ) )
            {
            // InternalX21.g:4096:1: ( ( rule__IfStatement__FalseExpAssignment_5 ) )
            // InternalX21.g:4097:2: ( rule__IfStatement__FalseExpAssignment_5 )
            {
             before(grammarAccess.getIfStatementAccess().getFalseExpAssignment_5()); 
            // InternalX21.g:4098:2: ( rule__IfStatement__FalseExpAssignment_5 )
            // InternalX21.g:4098:3: rule__IfStatement__FalseExpAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__FalseExpAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getFalseExpAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__5__Impl"


    // $ANTLR start "rule__IfStatement__Group__6"
    // InternalX21.g:4106:1: rule__IfStatement__Group__6 : rule__IfStatement__Group__6__Impl ;
    public final void rule__IfStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4110:1: ( rule__IfStatement__Group__6__Impl )
            // InternalX21.g:4111:2: rule__IfStatement__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__6"


    // $ANTLR start "rule__IfStatement__Group__6__Impl"
    // InternalX21.g:4117:1: rule__IfStatement__Group__6__Impl : ( 'end' ) ;
    public final void rule__IfStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4121:1: ( ( 'end' ) )
            // InternalX21.g:4122:1: ( 'end' )
            {
            // InternalX21.g:4122:1: ( 'end' )
            // InternalX21.g:4123:2: 'end'
            {
             before(grammarAccess.getIfStatementAccess().getEndKeyword_6()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getEndKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__6__Impl"


    // $ANTLR start "rule__NewStatement__Group__0"
    // InternalX21.g:4133:1: rule__NewStatement__Group__0 : rule__NewStatement__Group__0__Impl rule__NewStatement__Group__1 ;
    public final void rule__NewStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4137:1: ( rule__NewStatement__Group__0__Impl rule__NewStatement__Group__1 )
            // InternalX21.g:4138:2: rule__NewStatement__Group__0__Impl rule__NewStatement__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__NewStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group__0"


    // $ANTLR start "rule__NewStatement__Group__0__Impl"
    // InternalX21.g:4145:1: rule__NewStatement__Group__0__Impl : ( 'new' ) ;
    public final void rule__NewStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4149:1: ( ( 'new' ) )
            // InternalX21.g:4150:1: ( 'new' )
            {
            // InternalX21.g:4150:1: ( 'new' )
            // InternalX21.g:4151:2: 'new'
            {
             before(grammarAccess.getNewStatementAccess().getNewKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getNewStatementAccess().getNewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group__0__Impl"


    // $ANTLR start "rule__NewStatement__Group__1"
    // InternalX21.g:4160:1: rule__NewStatement__Group__1 : rule__NewStatement__Group__1__Impl rule__NewStatement__Group__2 ;
    public final void rule__NewStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4164:1: ( rule__NewStatement__Group__1__Impl rule__NewStatement__Group__2 )
            // InternalX21.g:4165:2: rule__NewStatement__Group__1__Impl rule__NewStatement__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__NewStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group__1"


    // $ANTLR start "rule__NewStatement__Group__1__Impl"
    // InternalX21.g:4172:1: rule__NewStatement__Group__1__Impl : ( ( rule__NewStatement__TypeAssignment_1 ) ) ;
    public final void rule__NewStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4176:1: ( ( ( rule__NewStatement__TypeAssignment_1 ) ) )
            // InternalX21.g:4177:1: ( ( rule__NewStatement__TypeAssignment_1 ) )
            {
            // InternalX21.g:4177:1: ( ( rule__NewStatement__TypeAssignment_1 ) )
            // InternalX21.g:4178:2: ( rule__NewStatement__TypeAssignment_1 )
            {
             before(grammarAccess.getNewStatementAccess().getTypeAssignment_1()); 
            // InternalX21.g:4179:2: ( rule__NewStatement__TypeAssignment_1 )
            // InternalX21.g:4179:3: rule__NewStatement__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NewStatement__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNewStatementAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group__1__Impl"


    // $ANTLR start "rule__NewStatement__Group__2"
    // InternalX21.g:4187:1: rule__NewStatement__Group__2 : rule__NewStatement__Group__2__Impl rule__NewStatement__Group__3 ;
    public final void rule__NewStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4191:1: ( rule__NewStatement__Group__2__Impl rule__NewStatement__Group__3 )
            // InternalX21.g:4192:2: rule__NewStatement__Group__2__Impl rule__NewStatement__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__NewStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group__2"


    // $ANTLR start "rule__NewStatement__Group__2__Impl"
    // InternalX21.g:4199:1: rule__NewStatement__Group__2__Impl : ( '[' ) ;
    public final void rule__NewStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4203:1: ( ( '[' ) )
            // InternalX21.g:4204:1: ( '[' )
            {
            // InternalX21.g:4204:1: ( '[' )
            // InternalX21.g:4205:2: '['
            {
             before(grammarAccess.getNewStatementAccess().getLeftSquareBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNewStatementAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group__2__Impl"


    // $ANTLR start "rule__NewStatement__Group__3"
    // InternalX21.g:4214:1: rule__NewStatement__Group__3 : rule__NewStatement__Group__3__Impl rule__NewStatement__Group__4 ;
    public final void rule__NewStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4218:1: ( rule__NewStatement__Group__3__Impl rule__NewStatement__Group__4 )
            // InternalX21.g:4219:2: rule__NewStatement__Group__3__Impl rule__NewStatement__Group__4
            {
            pushFollow(FOLLOW_46);
            rule__NewStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group__3"


    // $ANTLR start "rule__NewStatement__Group__3__Impl"
    // InternalX21.g:4226:1: rule__NewStatement__Group__3__Impl : ( ( rule__NewStatement__VariablesAssignment_3 ) ) ;
    public final void rule__NewStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4230:1: ( ( ( rule__NewStatement__VariablesAssignment_3 ) ) )
            // InternalX21.g:4231:1: ( ( rule__NewStatement__VariablesAssignment_3 ) )
            {
            // InternalX21.g:4231:1: ( ( rule__NewStatement__VariablesAssignment_3 ) )
            // InternalX21.g:4232:2: ( rule__NewStatement__VariablesAssignment_3 )
            {
             before(grammarAccess.getNewStatementAccess().getVariablesAssignment_3()); 
            // InternalX21.g:4233:2: ( rule__NewStatement__VariablesAssignment_3 )
            // InternalX21.g:4233:3: rule__NewStatement__VariablesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__NewStatement__VariablesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNewStatementAccess().getVariablesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group__3__Impl"


    // $ANTLR start "rule__NewStatement__Group__4"
    // InternalX21.g:4241:1: rule__NewStatement__Group__4 : rule__NewStatement__Group__4__Impl rule__NewStatement__Group__5 ;
    public final void rule__NewStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4245:1: ( rule__NewStatement__Group__4__Impl rule__NewStatement__Group__5 )
            // InternalX21.g:4246:2: rule__NewStatement__Group__4__Impl rule__NewStatement__Group__5
            {
            pushFollow(FOLLOW_46);
            rule__NewStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group__4"


    // $ANTLR start "rule__NewStatement__Group__4__Impl"
    // InternalX21.g:4253:1: rule__NewStatement__Group__4__Impl : ( ( rule__NewStatement__Group_4__0 )* ) ;
    public final void rule__NewStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4257:1: ( ( ( rule__NewStatement__Group_4__0 )* ) )
            // InternalX21.g:4258:1: ( ( rule__NewStatement__Group_4__0 )* )
            {
            // InternalX21.g:4258:1: ( ( rule__NewStatement__Group_4__0 )* )
            // InternalX21.g:4259:2: ( rule__NewStatement__Group_4__0 )*
            {
             before(grammarAccess.getNewStatementAccess().getGroup_4()); 
            // InternalX21.g:4260:2: ( rule__NewStatement__Group_4__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==24) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalX21.g:4260:3: rule__NewStatement__Group_4__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__NewStatement__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getNewStatementAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group__4__Impl"


    // $ANTLR start "rule__NewStatement__Group__5"
    // InternalX21.g:4268:1: rule__NewStatement__Group__5 : rule__NewStatement__Group__5__Impl ;
    public final void rule__NewStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4272:1: ( rule__NewStatement__Group__5__Impl )
            // InternalX21.g:4273:2: rule__NewStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewStatement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group__5"


    // $ANTLR start "rule__NewStatement__Group__5__Impl"
    // InternalX21.g:4279:1: rule__NewStatement__Group__5__Impl : ( ']' ) ;
    public final void rule__NewStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4283:1: ( ( ']' ) )
            // InternalX21.g:4284:1: ( ']' )
            {
            // InternalX21.g:4284:1: ( ']' )
            // InternalX21.g:4285:2: ']'
            {
             before(grammarAccess.getNewStatementAccess().getRightSquareBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getNewStatementAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group__5__Impl"


    // $ANTLR start "rule__NewStatement__Group_4__0"
    // InternalX21.g:4295:1: rule__NewStatement__Group_4__0 : rule__NewStatement__Group_4__0__Impl rule__NewStatement__Group_4__1 ;
    public final void rule__NewStatement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4299:1: ( rule__NewStatement__Group_4__0__Impl rule__NewStatement__Group_4__1 )
            // InternalX21.g:4300:2: rule__NewStatement__Group_4__0__Impl rule__NewStatement__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__NewStatement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewStatement__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group_4__0"


    // $ANTLR start "rule__NewStatement__Group_4__0__Impl"
    // InternalX21.g:4307:1: rule__NewStatement__Group_4__0__Impl : ( ',' ) ;
    public final void rule__NewStatement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4311:1: ( ( ',' ) )
            // InternalX21.g:4312:1: ( ',' )
            {
            // InternalX21.g:4312:1: ( ',' )
            // InternalX21.g:4313:2: ','
            {
             before(grammarAccess.getNewStatementAccess().getCommaKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getNewStatementAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group_4__0__Impl"


    // $ANTLR start "rule__NewStatement__Group_4__1"
    // InternalX21.g:4322:1: rule__NewStatement__Group_4__1 : rule__NewStatement__Group_4__1__Impl ;
    public final void rule__NewStatement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4326:1: ( rule__NewStatement__Group_4__1__Impl )
            // InternalX21.g:4327:2: rule__NewStatement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewStatement__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group_4__1"


    // $ANTLR start "rule__NewStatement__Group_4__1__Impl"
    // InternalX21.g:4333:1: rule__NewStatement__Group_4__1__Impl : ( ( rule__NewStatement__VariablesAssignment_4_1 ) ) ;
    public final void rule__NewStatement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4337:1: ( ( ( rule__NewStatement__VariablesAssignment_4_1 ) ) )
            // InternalX21.g:4338:1: ( ( rule__NewStatement__VariablesAssignment_4_1 ) )
            {
            // InternalX21.g:4338:1: ( ( rule__NewStatement__VariablesAssignment_4_1 ) )
            // InternalX21.g:4339:2: ( rule__NewStatement__VariablesAssignment_4_1 )
            {
             before(grammarAccess.getNewStatementAccess().getVariablesAssignment_4_1()); 
            // InternalX21.g:4340:2: ( rule__NewStatement__VariablesAssignment_4_1 )
            // InternalX21.g:4340:3: rule__NewStatement__VariablesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__NewStatement__VariablesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getNewStatementAccess().getVariablesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group_4__1__Impl"


    // $ANTLR start "rule__VarAssignment__Group__0"
    // InternalX21.g:4349:1: rule__VarAssignment__Group__0 : rule__VarAssignment__Group__0__Impl rule__VarAssignment__Group__1 ;
    public final void rule__VarAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4353:1: ( rule__VarAssignment__Group__0__Impl rule__VarAssignment__Group__1 )
            // InternalX21.g:4354:2: rule__VarAssignment__Group__0__Impl rule__VarAssignment__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__VarAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarAssignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssignment__Group__0"


    // $ANTLR start "rule__VarAssignment__Group__0__Impl"
    // InternalX21.g:4361:1: rule__VarAssignment__Group__0__Impl : ( ( rule__VarAssignment__VariableAssignment_0 ) ) ;
    public final void rule__VarAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4365:1: ( ( ( rule__VarAssignment__VariableAssignment_0 ) ) )
            // InternalX21.g:4366:1: ( ( rule__VarAssignment__VariableAssignment_0 ) )
            {
            // InternalX21.g:4366:1: ( ( rule__VarAssignment__VariableAssignment_0 ) )
            // InternalX21.g:4367:2: ( rule__VarAssignment__VariableAssignment_0 )
            {
             before(grammarAccess.getVarAssignmentAccess().getVariableAssignment_0()); 
            // InternalX21.g:4368:2: ( rule__VarAssignment__VariableAssignment_0 )
            // InternalX21.g:4368:3: rule__VarAssignment__VariableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VarAssignment__VariableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVarAssignmentAccess().getVariableAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssignment__Group__0__Impl"


    // $ANTLR start "rule__VarAssignment__Group__1"
    // InternalX21.g:4376:1: rule__VarAssignment__Group__1 : rule__VarAssignment__Group__1__Impl rule__VarAssignment__Group__2 ;
    public final void rule__VarAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4380:1: ( rule__VarAssignment__Group__1__Impl rule__VarAssignment__Group__2 )
            // InternalX21.g:4381:2: rule__VarAssignment__Group__1__Impl rule__VarAssignment__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__VarAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarAssignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssignment__Group__1"


    // $ANTLR start "rule__VarAssignment__Group__1__Impl"
    // InternalX21.g:4388:1: rule__VarAssignment__Group__1__Impl : ( '=' ) ;
    public final void rule__VarAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4392:1: ( ( '=' ) )
            // InternalX21.g:4393:1: ( '=' )
            {
            // InternalX21.g:4393:1: ( '=' )
            // InternalX21.g:4394:2: '='
            {
             before(grammarAccess.getVarAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getVarAssignmentAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssignment__Group__1__Impl"


    // $ANTLR start "rule__VarAssignment__Group__2"
    // InternalX21.g:4403:1: rule__VarAssignment__Group__2 : rule__VarAssignment__Group__2__Impl ;
    public final void rule__VarAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4407:1: ( rule__VarAssignment__Group__2__Impl )
            // InternalX21.g:4408:2: rule__VarAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarAssignment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssignment__Group__2"


    // $ANTLR start "rule__VarAssignment__Group__2__Impl"
    // InternalX21.g:4414:1: rule__VarAssignment__Group__2__Impl : ( ( rule__VarAssignment__ValueAssignment_2 ) ) ;
    public final void rule__VarAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4418:1: ( ( ( rule__VarAssignment__ValueAssignment_2 ) ) )
            // InternalX21.g:4419:1: ( ( rule__VarAssignment__ValueAssignment_2 ) )
            {
            // InternalX21.g:4419:1: ( ( rule__VarAssignment__ValueAssignment_2 ) )
            // InternalX21.g:4420:2: ( rule__VarAssignment__ValueAssignment_2 )
            {
             before(grammarAccess.getVarAssignmentAccess().getValueAssignment_2()); 
            // InternalX21.g:4421:2: ( rule__VarAssignment__ValueAssignment_2 )
            // InternalX21.g:4421:3: rule__VarAssignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VarAssignment__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVarAssignmentAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssignment__Group__2__Impl"


    // $ANTLR start "rule__X21__DeclarationsAssignment_3"
    // InternalX21.g:4430:1: rule__X21__DeclarationsAssignment_3 : ( ruleDeclaration ) ;
    public final void rule__X21__DeclarationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4434:1: ( ( ruleDeclaration ) )
            // InternalX21.g:4435:2: ( ruleDeclaration )
            {
            // InternalX21.g:4435:2: ( ruleDeclaration )
            // InternalX21.g:4436:3: ruleDeclaration
            {
             before(grammarAccess.getX21Access().getDeclarationsDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getX21Access().getDeclarationsDeclarationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X21__DeclarationsAssignment_3"


    // $ANTLR start "rule__NameAndType__NameAssignment_0"
    // InternalX21.g:4445:1: rule__NameAndType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NameAndType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4449:1: ( ( RULE_ID ) )
            // InternalX21.g:4450:2: ( RULE_ID )
            {
            // InternalX21.g:4450:2: ( RULE_ID )
            // InternalX21.g:4451:3: RULE_ID
            {
             before(grammarAccess.getNameAndTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNameAndTypeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameAndType__NameAssignment_0"


    // $ANTLR start "rule__NameAndType__TypeAssignment_2"
    // InternalX21.g:4460:1: rule__NameAndType__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__NameAndType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4464:1: ( ( ruleType ) )
            // InternalX21.g:4465:2: ( ruleType )
            {
            // InternalX21.g:4465:2: ( ruleType )
            // InternalX21.g:4466:3: ruleType
            {
             before(grammarAccess.getNameAndTypeAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getNameAndTypeAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameAndType__TypeAssignment_2"


    // $ANTLR start "rule__Function__NameAssignment_1"
    // InternalX21.g:4475:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4479:1: ( ( RULE_ID ) )
            // InternalX21.g:4480:2: ( RULE_ID )
            {
            // InternalX21.g:4480:2: ( RULE_ID )
            // InternalX21.g:4481:3: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NameAssignment_1"


    // $ANTLR start "rule__Function__BodyAssignment_2"
    // InternalX21.g:4490:1: rule__Function__BodyAssignment_2 : ( ruleLambda ) ;
    public final void rule__Function__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4494:1: ( ( ruleLambda ) )
            // InternalX21.g:4495:2: ( ruleLambda )
            {
            // InternalX21.g:4495:2: ( ruleLambda )
            // InternalX21.g:4496:3: ruleLambda
            {
             before(grammarAccess.getFunctionAccess().getBodyLambdaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLambda();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getBodyLambdaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__BodyAssignment_2"


    // $ANTLR start "rule__Lambda__LogicAssignment_4"
    // InternalX21.g:4505:1: rule__Lambda__LogicAssignment_4 : ( ruleExp ) ;
    public final void rule__Lambda__LogicAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4509:1: ( ( ruleExp ) )
            // InternalX21.g:4510:2: ( ruleExp )
            {
            // InternalX21.g:4510:2: ( ruleExp )
            // InternalX21.g:4511:3: ruleExp
            {
             before(grammarAccess.getLambdaAccess().getLogicExpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getLambdaAccess().getLogicExpParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__LogicAssignment_4"


    // $ANTLR start "rule__FunctionOrLambda__RefAssignment_1_0_1"
    // InternalX21.g:4520:1: rule__FunctionOrLambda__RefAssignment_1_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionOrLambda__RefAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4524:1: ( ( ( RULE_ID ) ) )
            // InternalX21.g:4525:2: ( ( RULE_ID ) )
            {
            // InternalX21.g:4525:2: ( ( RULE_ID ) )
            // InternalX21.g:4526:3: ( RULE_ID )
            {
             before(grammarAccess.getFunctionOrLambdaAccess().getRefFunctionCrossReference_1_0_1_0()); 
            // InternalX21.g:4527:3: ( RULE_ID )
            // InternalX21.g:4528:4: RULE_ID
            {
             before(grammarAccess.getFunctionOrLambdaAccess().getRefFunctionIDTerminalRuleCall_1_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionOrLambdaAccess().getRefFunctionIDTerminalRuleCall_1_0_1_0_1()); 

            }

             after(grammarAccess.getFunctionOrLambdaAccess().getRefFunctionCrossReference_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionOrLambda__RefAssignment_1_0_1"


    // $ANTLR start "rule__Node__NameAssignment_1"
    // InternalX21.g:4539:1: rule__Node__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4543:1: ( ( RULE_ID ) )
            // InternalX21.g:4544:2: ( RULE_ID )
            {
            // InternalX21.g:4544:2: ( RULE_ID )
            // InternalX21.g:4545:3: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__NameAssignment_1"


    // $ANTLR start "rule__Node__BodyAssignment_2"
    // InternalX21.g:4554:1: rule__Node__BodyAssignment_2 : ( ruleFunctionOrLambda ) ;
    public final void rule__Node__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4558:1: ( ( ruleFunctionOrLambda ) )
            // InternalX21.g:4559:2: ( ruleFunctionOrLambda )
            {
            // InternalX21.g:4559:2: ( ruleFunctionOrLambda )
            // InternalX21.g:4560:3: ruleFunctionOrLambda
            {
             before(grammarAccess.getNodeAccess().getBodyFunctionOrLambdaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionOrLambda();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getBodyFunctionOrLambdaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__BodyAssignment_2"


    // $ANTLR start "rule__Stream__StartNodesAssignment_1"
    // InternalX21.g:4569:1: rule__Stream__StartNodesAssignment_1 : ( ruleNodeOrInput ) ;
    public final void rule__Stream__StartNodesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4573:1: ( ( ruleNodeOrInput ) )
            // InternalX21.g:4574:2: ( ruleNodeOrInput )
            {
            // InternalX21.g:4574:2: ( ruleNodeOrInput )
            // InternalX21.g:4575:3: ruleNodeOrInput
            {
             before(grammarAccess.getStreamAccess().getStartNodesNodeOrInputParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeOrInput();

            state._fsp--;

             after(grammarAccess.getStreamAccess().getStartNodesNodeOrInputParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__StartNodesAssignment_1"


    // $ANTLR start "rule__Stream__StartNodesAssignment_2_1"
    // InternalX21.g:4584:1: rule__Stream__StartNodesAssignment_2_1 : ( ruleNodeOrInput ) ;
    public final void rule__Stream__StartNodesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4588:1: ( ( ruleNodeOrInput ) )
            // InternalX21.g:4589:2: ( ruleNodeOrInput )
            {
            // InternalX21.g:4589:2: ( ruleNodeOrInput )
            // InternalX21.g:4590:3: ruleNodeOrInput
            {
             before(grammarAccess.getStreamAccess().getStartNodesNodeOrInputParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeOrInput();

            state._fsp--;

             after(grammarAccess.getStreamAccess().getStartNodesNodeOrInputParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__StartNodesAssignment_2_1"


    // $ANTLR start "rule__Stream__PointsAssignment_3_1"
    // InternalX21.g:4599:1: rule__Stream__PointsAssignment_3_1 : ( ruleElementList ) ;
    public final void rule__Stream__PointsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4603:1: ( ( ruleElementList ) )
            // InternalX21.g:4604:2: ( ruleElementList )
            {
            // InternalX21.g:4604:2: ( ruleElementList )
            // InternalX21.g:4605:3: ruleElementList
            {
             before(grammarAccess.getStreamAccess().getPointsElementListParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElementList();

            state._fsp--;

             after(grammarAccess.getStreamAccess().getPointsElementListParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__PointsAssignment_3_1"


    // $ANTLR start "rule__ElementList__ElementsAssignment_0"
    // InternalX21.g:4614:1: rule__ElementList__ElementsAssignment_0 : ( ruleElement ) ;
    public final void rule__ElementList__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4618:1: ( ( ruleElement ) )
            // InternalX21.g:4619:2: ( ruleElement )
            {
            // InternalX21.g:4619:2: ( ruleElement )
            // InternalX21.g:4620:3: ruleElement
            {
             before(grammarAccess.getElementListAccess().getElementsElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementListAccess().getElementsElementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementList__ElementsAssignment_0"


    // $ANTLR start "rule__ElementList__ElementsAssignment_1_1"
    // InternalX21.g:4629:1: rule__ElementList__ElementsAssignment_1_1 : ( ruleElement ) ;
    public final void rule__ElementList__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4633:1: ( ( ruleElement ) )
            // InternalX21.g:4634:2: ( ruleElement )
            {
            // InternalX21.g:4634:2: ( ruleElement )
            // InternalX21.g:4635:3: ruleElement
            {
             before(grammarAccess.getElementListAccess().getElementsElementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementListAccess().getElementsElementParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementList__ElementsAssignment_1_1"


    // $ANTLR start "rule__Element__RefAssignment_0_1"
    // InternalX21.g:4644:1: rule__Element__RefAssignment_0_1 : ( ruleNode ) ;
    public final void rule__Element__RefAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4648:1: ( ( ruleNode ) )
            // InternalX21.g:4649:2: ( ruleNode )
            {
            // InternalX21.g:4649:2: ( ruleNode )
            // InternalX21.g:4650:3: ruleNode
            {
             before(grammarAccess.getElementAccess().getRefNodeParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getElementAccess().getRefNodeParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__RefAssignment_0_1"


    // $ANTLR start "rule__Element__BodyAssignment_1_1"
    // InternalX21.g:4659:1: rule__Element__BodyAssignment_1_1 : ( ruleLambda ) ;
    public final void rule__Element__BodyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4663:1: ( ( ruleLambda ) )
            // InternalX21.g:4664:2: ( ruleLambda )
            {
            // InternalX21.g:4664:2: ( ruleLambda )
            // InternalX21.g:4665:3: ruleLambda
            {
             before(grammarAccess.getElementAccess().getBodyLambdaParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLambda();

            state._fsp--;

             after(grammarAccess.getElementAccess().getBodyLambdaParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__BodyAssignment_1_1"


    // $ANTLR start "rule__Element__NameAssignment_2_2"
    // InternalX21.g:4674:1: rule__Element__NameAssignment_2_2 : ( RULE_ID ) ;
    public final void rule__Element__NameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4678:1: ( ( RULE_ID ) )
            // InternalX21.g:4679:2: ( RULE_ID )
            {
            // InternalX21.g:4679:2: ( RULE_ID )
            // InternalX21.g:4680:3: RULE_ID
            {
             before(grammarAccess.getElementAccess().getNameIDTerminalRuleCall_2_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getNameIDTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__NameAssignment_2_2"


    // $ANTLR start "rule__DataDecl__NameAssignment_1"
    // InternalX21.g:4689:1: rule__DataDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4693:1: ( ( RULE_ID ) )
            // InternalX21.g:4694:2: ( RULE_ID )
            {
            // InternalX21.g:4694:2: ( RULE_ID )
            // InternalX21.g:4695:3: RULE_ID
            {
             before(grammarAccess.getDataDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__NameAssignment_1"


    // $ANTLR start "rule__DataDecl__VariablesAssignment_3"
    // InternalX21.g:4704:1: rule__DataDecl__VariablesAssignment_3 : ( ruleDataVariable ) ;
    public final void rule__DataDecl__VariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4708:1: ( ( ruleDataVariable ) )
            // InternalX21.g:4709:2: ( ruleDataVariable )
            {
            // InternalX21.g:4709:2: ( ruleDataVariable )
            // InternalX21.g:4710:3: ruleDataVariable
            {
             before(grammarAccess.getDataDeclAccess().getVariablesDataVariableParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDataVariable();

            state._fsp--;

             after(grammarAccess.getDataDeclAccess().getVariablesDataVariableParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__VariablesAssignment_3"


    // $ANTLR start "rule__DataDecl__VariablesAssignment_4_1"
    // InternalX21.g:4719:1: rule__DataDecl__VariablesAssignment_4_1 : ( ruleDataVariable ) ;
    public final void rule__DataDecl__VariablesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4723:1: ( ( ruleDataVariable ) )
            // InternalX21.g:4724:2: ( ruleDataVariable )
            {
            // InternalX21.g:4724:2: ( ruleDataVariable )
            // InternalX21.g:4725:3: ruleDataVariable
            {
             before(grammarAccess.getDataDeclAccess().getVariablesDataVariableParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataVariable();

            state._fsp--;

             after(grammarAccess.getDataDeclAccess().getVariablesDataVariableParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__VariablesAssignment_4_1"


    // $ANTLR start "rule__DataVariable__NameAssignment_0"
    // InternalX21.g:4734:1: rule__DataVariable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DataVariable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4738:1: ( ( RULE_ID ) )
            // InternalX21.g:4739:2: ( RULE_ID )
            {
            // InternalX21.g:4739:2: ( RULE_ID )
            // InternalX21.g:4740:3: RULE_ID
            {
             before(grammarAccess.getDataVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataVariableAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataVariable__NameAssignment_0"


    // $ANTLR start "rule__DataVariable__TypeAssignment_2"
    // InternalX21.g:4749:1: rule__DataVariable__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__DataVariable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4753:1: ( ( ruleType ) )
            // InternalX21.g:4754:2: ( ruleType )
            {
            // InternalX21.g:4754:2: ( ruleType )
            // InternalX21.g:4755:3: ruleType
            {
             before(grammarAccess.getDataVariableAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDataVariableAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataVariable__TypeAssignment_2"


    // $ANTLR start "rule__Type__RefAssignment_2_1"
    // InternalX21.g:4764:1: rule__Type__RefAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Type__RefAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4768:1: ( ( ( RULE_ID ) ) )
            // InternalX21.g:4769:2: ( ( RULE_ID ) )
            {
            // InternalX21.g:4769:2: ( ( RULE_ID ) )
            // InternalX21.g:4770:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeAccess().getRefDataDeclCrossReference_2_1_0()); 
            // InternalX21.g:4771:3: ( RULE_ID )
            // InternalX21.g:4772:4: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getRefDataDeclIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRefDataDeclIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getTypeAccess().getRefDataDeclCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__RefAssignment_2_1"


    // $ANTLR start "rule__LogicExp__RightAssignment_2"
    // InternalX21.g:4783:1: rule__LogicExp__RightAssignment_2 : ( ruleExp ) ;
    public final void rule__LogicExp__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4787:1: ( ( ruleExp ) )
            // InternalX21.g:4788:2: ( ruleExp )
            {
            // InternalX21.g:4788:2: ( ruleExp )
            // InternalX21.g:4789:3: ruleExp
            {
             before(grammarAccess.getLogicExpAccess().getRightExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getLogicExpAccess().getRightExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExp__RightAssignment_2"


    // $ANTLR start "rule__Exp__RightAssignment_1_1"
    // InternalX21.g:4798:1: rule__Exp__RightAssignment_1_1 : ( ruleMulDiv ) ;
    public final void rule__Exp__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4802:1: ( ( ruleMulDiv ) )
            // InternalX21.g:4803:2: ( ruleMulDiv )
            {
            // InternalX21.g:4803:2: ( ruleMulDiv )
            // InternalX21.g:4804:3: ruleMulDiv
            {
             before(grammarAccess.getExpAccess().getRightMulDivParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMulDiv();

            state._fsp--;

             after(grammarAccess.getExpAccess().getRightMulDivParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__RightAssignment_1_1"


    // $ANTLR start "rule__MulDiv__RightAssignment_1_1"
    // InternalX21.g:4813:1: rule__MulDiv__RightAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__MulDiv__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4817:1: ( ( rulePrimary ) )
            // InternalX21.g:4818:2: ( rulePrimary )
            {
            // InternalX21.g:4818:2: ( rulePrimary )
            // InternalX21.g:4819:3: rulePrimary
            {
             before(grammarAccess.getMulDivAccess().getRightPrimaryParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulDivAccess().getRightPrimaryParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__RightAssignment_1_1"


    // $ANTLR start "rule__Primary__ValueAssignment_0_1"
    // InternalX21.g:4828:1: rule__Primary__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Primary__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4832:1: ( ( RULE_INT ) )
            // InternalX21.g:4833:2: ( RULE_INT )
            {
            // InternalX21.g:4833:2: ( RULE_INT )
            // InternalX21.g:4834:3: RULE_INT
            {
             before(grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ValueAssignment_0_1"


    // $ANTLR start "rule__Primary__BodyAssignment_1_2"
    // InternalX21.g:4843:1: rule__Primary__BodyAssignment_1_2 : ( ruleExp ) ;
    public final void rule__Primary__BodyAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4847:1: ( ( ruleExp ) )
            // InternalX21.g:4848:2: ( ruleExp )
            {
            // InternalX21.g:4848:2: ( ruleExp )
            // InternalX21.g:4849:3: ruleExp
            {
             before(grammarAccess.getPrimaryAccess().getBodyExpParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getBodyExpParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__BodyAssignment_1_2"


    // $ANTLR start "rule__LetStatement__NameAssignment_1"
    // InternalX21.g:4858:1: rule__LetStatement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LetStatement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4862:1: ( ( RULE_ID ) )
            // InternalX21.g:4863:2: ( RULE_ID )
            {
            // InternalX21.g:4863:2: ( RULE_ID )
            // InternalX21.g:4864:3: RULE_ID
            {
             before(grammarAccess.getLetStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLetStatementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__NameAssignment_1"


    // $ANTLR start "rule__LetStatement__ValueAssignment_3"
    // InternalX21.g:4873:1: rule__LetStatement__ValueAssignment_3 : ( ruleExp ) ;
    public final void rule__LetStatement__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4877:1: ( ( ruleExp ) )
            // InternalX21.g:4878:2: ( ruleExp )
            {
            // InternalX21.g:4878:2: ( ruleExp )
            // InternalX21.g:4879:3: ruleExp
            {
             before(grammarAccess.getLetStatementAccess().getValueExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getLetStatementAccess().getValueExpParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__ValueAssignment_3"


    // $ANTLR start "rule__LetStatement__BodyAssignment_5"
    // InternalX21.g:4888:1: rule__LetStatement__BodyAssignment_5 : ( ruleExp ) ;
    public final void rule__LetStatement__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4892:1: ( ( ruleExp ) )
            // InternalX21.g:4893:2: ( ruleExp )
            {
            // InternalX21.g:4893:2: ( ruleExp )
            // InternalX21.g:4894:3: ruleExp
            {
             before(grammarAccess.getLetStatementAccess().getBodyExpParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getLetStatementAccess().getBodyExpParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__BodyAssignment_5"


    // $ANTLR start "rule__DataAccess__RefAssignment_0"
    // InternalX21.g:4903:1: rule__DataAccess__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DataAccess__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4907:1: ( ( ( RULE_ID ) ) )
            // InternalX21.g:4908:2: ( ( RULE_ID ) )
            {
            // InternalX21.g:4908:2: ( ( RULE_ID ) )
            // InternalX21.g:4909:3: ( RULE_ID )
            {
             before(grammarAccess.getDataAccessAccess().getRefDataRefCrossReference_0_0()); 
            // InternalX21.g:4910:3: ( RULE_ID )
            // InternalX21.g:4911:4: RULE_ID
            {
             before(grammarAccess.getDataAccessAccess().getRefDataRefIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataAccessAccess().getRefDataRefIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDataAccessAccess().getRefDataRefCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__RefAssignment_0"


    // $ANTLR start "rule__DataAccess__VarRefsAssignment_1_1"
    // InternalX21.g:4922:1: rule__DataAccess__VarRefsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataAccess__VarRefsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4926:1: ( ( ( RULE_ID ) ) )
            // InternalX21.g:4927:2: ( ( RULE_ID ) )
            {
            // InternalX21.g:4927:2: ( ( RULE_ID ) )
            // InternalX21.g:4928:3: ( RULE_ID )
            {
             before(grammarAccess.getDataAccessAccess().getVarRefsDataVariableCrossReference_1_1_0()); 
            // InternalX21.g:4929:3: ( RULE_ID )
            // InternalX21.g:4930:4: RULE_ID
            {
             before(grammarAccess.getDataAccessAccess().getVarRefsDataVariableIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataAccessAccess().getVarRefsDataVariableIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getDataAccessAccess().getVarRefsDataVariableCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__VarRefsAssignment_1_1"


    // $ANTLR start "rule__IfStatement__ConditionAssignment_1"
    // InternalX21.g:4941:1: rule__IfStatement__ConditionAssignment_1 : ( ruleLogicExp ) ;
    public final void rule__IfStatement__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4945:1: ( ( ruleLogicExp ) )
            // InternalX21.g:4946:2: ( ruleLogicExp )
            {
            // InternalX21.g:4946:2: ( ruleLogicExp )
            // InternalX21.g:4947:3: ruleLogicExp
            {
             before(grammarAccess.getIfStatementAccess().getConditionLogicExpParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicExp();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getConditionLogicExpParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__ConditionAssignment_1"


    // $ANTLR start "rule__IfStatement__TrueExpAssignment_3"
    // InternalX21.g:4956:1: rule__IfStatement__TrueExpAssignment_3 : ( ruleExp ) ;
    public final void rule__IfStatement__TrueExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4960:1: ( ( ruleExp ) )
            // InternalX21.g:4961:2: ( ruleExp )
            {
            // InternalX21.g:4961:2: ( ruleExp )
            // InternalX21.g:4962:3: ruleExp
            {
             before(grammarAccess.getIfStatementAccess().getTrueExpExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getTrueExpExpParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__TrueExpAssignment_3"


    // $ANTLR start "rule__IfStatement__FalseExpAssignment_5"
    // InternalX21.g:4971:1: rule__IfStatement__FalseExpAssignment_5 : ( ruleExp ) ;
    public final void rule__IfStatement__FalseExpAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4975:1: ( ( ruleExp ) )
            // InternalX21.g:4976:2: ( ruleExp )
            {
            // InternalX21.g:4976:2: ( ruleExp )
            // InternalX21.g:4977:3: ruleExp
            {
             before(grammarAccess.getIfStatementAccess().getFalseExpExpParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getFalseExpExpParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__FalseExpAssignment_5"


    // $ANTLR start "rule__NewStatement__TypeAssignment_1"
    // InternalX21.g:4986:1: rule__NewStatement__TypeAssignment_1 : ( ruleDataDecl ) ;
    public final void rule__NewStatement__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4990:1: ( ( ruleDataDecl ) )
            // InternalX21.g:4991:2: ( ruleDataDecl )
            {
            // InternalX21.g:4991:2: ( ruleDataDecl )
            // InternalX21.g:4992:3: ruleDataDecl
            {
             before(grammarAccess.getNewStatementAccess().getTypeDataDeclParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataDecl();

            state._fsp--;

             after(grammarAccess.getNewStatementAccess().getTypeDataDeclParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__TypeAssignment_1"


    // $ANTLR start "rule__NewStatement__VariablesAssignment_3"
    // InternalX21.g:5001:1: rule__NewStatement__VariablesAssignment_3 : ( ruleVarAssignment ) ;
    public final void rule__NewStatement__VariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:5005:1: ( ( ruleVarAssignment ) )
            // InternalX21.g:5006:2: ( ruleVarAssignment )
            {
            // InternalX21.g:5006:2: ( ruleVarAssignment )
            // InternalX21.g:5007:3: ruleVarAssignment
            {
             before(grammarAccess.getNewStatementAccess().getVariablesVarAssignmentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVarAssignment();

            state._fsp--;

             after(grammarAccess.getNewStatementAccess().getVariablesVarAssignmentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__VariablesAssignment_3"


    // $ANTLR start "rule__NewStatement__VariablesAssignment_4_1"
    // InternalX21.g:5016:1: rule__NewStatement__VariablesAssignment_4_1 : ( ruleVarAssignment ) ;
    public final void rule__NewStatement__VariablesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:5020:1: ( ( ruleVarAssignment ) )
            // InternalX21.g:5021:2: ( ruleVarAssignment )
            {
            // InternalX21.g:5021:2: ( ruleVarAssignment )
            // InternalX21.g:5022:3: ruleVarAssignment
            {
             before(grammarAccess.getNewStatementAccess().getVariablesVarAssignmentParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarAssignment();

            state._fsp--;

             after(grammarAccess.getNewStatementAccess().getVariablesVarAssignmentParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__VariablesAssignment_4_1"


    // $ANTLR start "rule__VarAssignment__VariableAssignment_0"
    // InternalX21.g:5031:1: rule__VarAssignment__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__VarAssignment__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:5035:1: ( ( ( RULE_ID ) ) )
            // InternalX21.g:5036:2: ( ( RULE_ID ) )
            {
            // InternalX21.g:5036:2: ( ( RULE_ID ) )
            // InternalX21.g:5037:3: ( RULE_ID )
            {
             before(grammarAccess.getVarAssignmentAccess().getVariableDataVariableCrossReference_0_0()); 
            // InternalX21.g:5038:3: ( RULE_ID )
            // InternalX21.g:5039:4: RULE_ID
            {
             before(grammarAccess.getVarAssignmentAccess().getVariableDataVariableIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarAssignmentAccess().getVariableDataVariableIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getVarAssignmentAccess().getVariableDataVariableCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssignment__VariableAssignment_0"


    // $ANTLR start "rule__VarAssignment__ValueAssignment_2"
    // InternalX21.g:5050:1: rule__VarAssignment__ValueAssignment_2 : ( ruleExp ) ;
    public final void rule__VarAssignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:5054:1: ( ( ruleExp ) )
            // InternalX21.g:5055:2: ( ruleExp )
            {
            // InternalX21.g:5055:2: ( ruleExp )
            // InternalX21.g:5056:3: ruleExp
            {
             before(grammarAccess.getVarAssignmentAccess().getValueExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getVarAssignmentAccess().getValueExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssignment__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008C86000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008C86002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000030000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00004C4000008030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004408000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000007C0000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000001200000L});

}