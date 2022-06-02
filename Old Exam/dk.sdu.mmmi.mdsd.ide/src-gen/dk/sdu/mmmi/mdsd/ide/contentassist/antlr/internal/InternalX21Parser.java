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


    // $ANTLR start "entryRuleStream"
    // InternalX21.g:270:1: entryRuleStream : ruleStream EOF ;
    public final void entryRuleStream() throws RecognitionException {
        try {
            // InternalX21.g:271:1: ( ruleStream EOF )
            // InternalX21.g:272:1: ruleStream EOF
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
    // InternalX21.g:279:1: ruleStream : ( ( rule__Stream__Group__0 ) ) ;
    public final void ruleStream() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:283:2: ( ( ( rule__Stream__Group__0 ) ) )
            // InternalX21.g:284:2: ( ( rule__Stream__Group__0 ) )
            {
            // InternalX21.g:284:2: ( ( rule__Stream__Group__0 ) )
            // InternalX21.g:285:3: ( rule__Stream__Group__0 )
            {
             before(grammarAccess.getStreamAccess().getGroup()); 
            // InternalX21.g:286:3: ( rule__Stream__Group__0 )
            // InternalX21.g:286:4: rule__Stream__Group__0
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
    // InternalX21.g:295:1: entryRuleElementList : ruleElementList EOF ;
    public final void entryRuleElementList() throws RecognitionException {
        try {
            // InternalX21.g:296:1: ( ruleElementList EOF )
            // InternalX21.g:297:1: ruleElementList EOF
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
    // InternalX21.g:304:1: ruleElementList : ( ( rule__ElementList__Group__0 ) ) ;
    public final void ruleElementList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:308:2: ( ( ( rule__ElementList__Group__0 ) ) )
            // InternalX21.g:309:2: ( ( rule__ElementList__Group__0 ) )
            {
            // InternalX21.g:309:2: ( ( rule__ElementList__Group__0 ) )
            // InternalX21.g:310:3: ( rule__ElementList__Group__0 )
            {
             before(grammarAccess.getElementListAccess().getGroup()); 
            // InternalX21.g:311:3: ( rule__ElementList__Group__0 )
            // InternalX21.g:311:4: rule__ElementList__Group__0
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
    // InternalX21.g:320:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalX21.g:321:1: ( ruleElement EOF )
            // InternalX21.g:322:1: ruleElement EOF
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
    // InternalX21.g:329:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:333:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalX21.g:334:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalX21.g:334:2: ( ( rule__Element__Alternatives ) )
            // InternalX21.g:335:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalX21.g:336:3: ( rule__Element__Alternatives )
            // InternalX21.g:336:4: rule__Element__Alternatives
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
    // InternalX21.g:345:1: entryRuleDataDecl : ruleDataDecl EOF ;
    public final void entryRuleDataDecl() throws RecognitionException {
        try {
            // InternalX21.g:346:1: ( ruleDataDecl EOF )
            // InternalX21.g:347:1: ruleDataDecl EOF
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
    // InternalX21.g:354:1: ruleDataDecl : ( ( rule__DataDecl__Group__0 ) ) ;
    public final void ruleDataDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:358:2: ( ( ( rule__DataDecl__Group__0 ) ) )
            // InternalX21.g:359:2: ( ( rule__DataDecl__Group__0 ) )
            {
            // InternalX21.g:359:2: ( ( rule__DataDecl__Group__0 ) )
            // InternalX21.g:360:3: ( rule__DataDecl__Group__0 )
            {
             before(grammarAccess.getDataDeclAccess().getGroup()); 
            // InternalX21.g:361:3: ( rule__DataDecl__Group__0 )
            // InternalX21.g:361:4: rule__DataDecl__Group__0
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
    // InternalX21.g:370:1: entryRuleDataVariable : ruleDataVariable EOF ;
    public final void entryRuleDataVariable() throws RecognitionException {
        try {
            // InternalX21.g:371:1: ( ruleDataVariable EOF )
            // InternalX21.g:372:1: ruleDataVariable EOF
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
    // InternalX21.g:379:1: ruleDataVariable : ( ( rule__DataVariable__Group__0 ) ) ;
    public final void ruleDataVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:383:2: ( ( ( rule__DataVariable__Group__0 ) ) )
            // InternalX21.g:384:2: ( ( rule__DataVariable__Group__0 ) )
            {
            // InternalX21.g:384:2: ( ( rule__DataVariable__Group__0 ) )
            // InternalX21.g:385:3: ( rule__DataVariable__Group__0 )
            {
             before(grammarAccess.getDataVariableAccess().getGroup()); 
            // InternalX21.g:386:3: ( rule__DataVariable__Group__0 )
            // InternalX21.g:386:4: rule__DataVariable__Group__0
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
    // InternalX21.g:395:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalX21.g:396:1: ( ruleType EOF )
            // InternalX21.g:397:1: ruleType EOF
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
    // InternalX21.g:404:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:408:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalX21.g:409:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalX21.g:409:2: ( ( rule__Type__Alternatives ) )
            // InternalX21.g:410:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalX21.g:411:3: ( rule__Type__Alternatives )
            // InternalX21.g:411:4: rule__Type__Alternatives
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
    // InternalX21.g:420:1: entryRuleLogicExp : ruleLogicExp EOF ;
    public final void entryRuleLogicExp() throws RecognitionException {
        try {
            // InternalX21.g:421:1: ( ruleLogicExp EOF )
            // InternalX21.g:422:1: ruleLogicExp EOF
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
    // InternalX21.g:429:1: ruleLogicExp : ( ( rule__LogicExp__Group__0 ) ) ;
    public final void ruleLogicExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:433:2: ( ( ( rule__LogicExp__Group__0 ) ) )
            // InternalX21.g:434:2: ( ( rule__LogicExp__Group__0 ) )
            {
            // InternalX21.g:434:2: ( ( rule__LogicExp__Group__0 ) )
            // InternalX21.g:435:3: ( rule__LogicExp__Group__0 )
            {
             before(grammarAccess.getLogicExpAccess().getGroup()); 
            // InternalX21.g:436:3: ( rule__LogicExp__Group__0 )
            // InternalX21.g:436:4: rule__LogicExp__Group__0
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
    // InternalX21.g:445:1: entryRuleExp : ruleExp EOF ;
    public final void entryRuleExp() throws RecognitionException {
        try {
            // InternalX21.g:446:1: ( ruleExp EOF )
            // InternalX21.g:447:1: ruleExp EOF
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
    // InternalX21.g:454:1: ruleExp : ( ( rule__Exp__Group__0 ) ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:458:2: ( ( ( rule__Exp__Group__0 ) ) )
            // InternalX21.g:459:2: ( ( rule__Exp__Group__0 ) )
            {
            // InternalX21.g:459:2: ( ( rule__Exp__Group__0 ) )
            // InternalX21.g:460:3: ( rule__Exp__Group__0 )
            {
             before(grammarAccess.getExpAccess().getGroup()); 
            // InternalX21.g:461:3: ( rule__Exp__Group__0 )
            // InternalX21.g:461:4: rule__Exp__Group__0
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
    // InternalX21.g:470:1: entryRuleMulDiv : ruleMulDiv EOF ;
    public final void entryRuleMulDiv() throws RecognitionException {
        try {
            // InternalX21.g:471:1: ( ruleMulDiv EOF )
            // InternalX21.g:472:1: ruleMulDiv EOF
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
    // InternalX21.g:479:1: ruleMulDiv : ( ( rule__MulDiv__Group__0 ) ) ;
    public final void ruleMulDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:483:2: ( ( ( rule__MulDiv__Group__0 ) ) )
            // InternalX21.g:484:2: ( ( rule__MulDiv__Group__0 ) )
            {
            // InternalX21.g:484:2: ( ( rule__MulDiv__Group__0 ) )
            // InternalX21.g:485:3: ( rule__MulDiv__Group__0 )
            {
             before(grammarAccess.getMulDivAccess().getGroup()); 
            // InternalX21.g:486:3: ( rule__MulDiv__Group__0 )
            // InternalX21.g:486:4: rule__MulDiv__Group__0
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
    // InternalX21.g:495:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalX21.g:496:1: ( rulePrimary EOF )
            // InternalX21.g:497:1: rulePrimary EOF
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
    // InternalX21.g:504:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:508:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalX21.g:509:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalX21.g:509:2: ( ( rule__Primary__Alternatives ) )
            // InternalX21.g:510:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalX21.g:511:3: ( rule__Primary__Alternatives )
            // InternalX21.g:511:4: rule__Primary__Alternatives
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
    // InternalX21.g:520:1: entryRuleLetStatement : ruleLetStatement EOF ;
    public final void entryRuleLetStatement() throws RecognitionException {
        try {
            // InternalX21.g:521:1: ( ruleLetStatement EOF )
            // InternalX21.g:522:1: ruleLetStatement EOF
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
    // InternalX21.g:529:1: ruleLetStatement : ( ( rule__LetStatement__Group__0 ) ) ;
    public final void ruleLetStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:533:2: ( ( ( rule__LetStatement__Group__0 ) ) )
            // InternalX21.g:534:2: ( ( rule__LetStatement__Group__0 ) )
            {
            // InternalX21.g:534:2: ( ( rule__LetStatement__Group__0 ) )
            // InternalX21.g:535:3: ( rule__LetStatement__Group__0 )
            {
             before(grammarAccess.getLetStatementAccess().getGroup()); 
            // InternalX21.g:536:3: ( rule__LetStatement__Group__0 )
            // InternalX21.g:536:4: rule__LetStatement__Group__0
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
    // InternalX21.g:545:1: entryRuleDataAccess : ruleDataAccess EOF ;
    public final void entryRuleDataAccess() throws RecognitionException {
        try {
            // InternalX21.g:546:1: ( ruleDataAccess EOF )
            // InternalX21.g:547:1: ruleDataAccess EOF
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
    // InternalX21.g:554:1: ruleDataAccess : ( ( rule__DataAccess__Group__0 ) ) ;
    public final void ruleDataAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:558:2: ( ( ( rule__DataAccess__Group__0 ) ) )
            // InternalX21.g:559:2: ( ( rule__DataAccess__Group__0 ) )
            {
            // InternalX21.g:559:2: ( ( rule__DataAccess__Group__0 ) )
            // InternalX21.g:560:3: ( rule__DataAccess__Group__0 )
            {
             before(grammarAccess.getDataAccessAccess().getGroup()); 
            // InternalX21.g:561:3: ( rule__DataAccess__Group__0 )
            // InternalX21.g:561:4: rule__DataAccess__Group__0
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
    // InternalX21.g:570:1: entryRuleNone : ruleNone EOF ;
    public final void entryRuleNone() throws RecognitionException {
        try {
            // InternalX21.g:571:1: ( ruleNone EOF )
            // InternalX21.g:572:1: ruleNone EOF
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
    // InternalX21.g:579:1: ruleNone : ( ( rule__None__Group__0 ) ) ;
    public final void ruleNone() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:583:2: ( ( ( rule__None__Group__0 ) ) )
            // InternalX21.g:584:2: ( ( rule__None__Group__0 ) )
            {
            // InternalX21.g:584:2: ( ( rule__None__Group__0 ) )
            // InternalX21.g:585:3: ( rule__None__Group__0 )
            {
             before(grammarAccess.getNoneAccess().getGroup()); 
            // InternalX21.g:586:3: ( rule__None__Group__0 )
            // InternalX21.g:586:4: rule__None__Group__0
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
    // InternalX21.g:595:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // InternalX21.g:596:1: ( ruleIfStatement EOF )
            // InternalX21.g:597:1: ruleIfStatement EOF
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
    // InternalX21.g:604:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:608:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // InternalX21.g:609:2: ( ( rule__IfStatement__Group__0 ) )
            {
            // InternalX21.g:609:2: ( ( rule__IfStatement__Group__0 ) )
            // InternalX21.g:610:3: ( rule__IfStatement__Group__0 )
            {
             before(grammarAccess.getIfStatementAccess().getGroup()); 
            // InternalX21.g:611:3: ( rule__IfStatement__Group__0 )
            // InternalX21.g:611:4: rule__IfStatement__Group__0
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
    // InternalX21.g:620:1: entryRuleNewStatement : ruleNewStatement EOF ;
    public final void entryRuleNewStatement() throws RecognitionException {
        try {
            // InternalX21.g:621:1: ( ruleNewStatement EOF )
            // InternalX21.g:622:1: ruleNewStatement EOF
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
    // InternalX21.g:629:1: ruleNewStatement : ( ( rule__NewStatement__Group__0 ) ) ;
    public final void ruleNewStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:633:2: ( ( ( rule__NewStatement__Group__0 ) ) )
            // InternalX21.g:634:2: ( ( rule__NewStatement__Group__0 ) )
            {
            // InternalX21.g:634:2: ( ( rule__NewStatement__Group__0 ) )
            // InternalX21.g:635:3: ( rule__NewStatement__Group__0 )
            {
             before(grammarAccess.getNewStatementAccess().getGroup()); 
            // InternalX21.g:636:3: ( rule__NewStatement__Group__0 )
            // InternalX21.g:636:4: rule__NewStatement__Group__0
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
    // InternalX21.g:645:1: entryRuleVarAssignment : ruleVarAssignment EOF ;
    public final void entryRuleVarAssignment() throws RecognitionException {
        try {
            // InternalX21.g:646:1: ( ruleVarAssignment EOF )
            // InternalX21.g:647:1: ruleVarAssignment EOF
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
    // InternalX21.g:654:1: ruleVarAssignment : ( ( rule__VarAssignment__Group__0 ) ) ;
    public final void ruleVarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:658:2: ( ( ( rule__VarAssignment__Group__0 ) ) )
            // InternalX21.g:659:2: ( ( rule__VarAssignment__Group__0 ) )
            {
            // InternalX21.g:659:2: ( ( rule__VarAssignment__Group__0 ) )
            // InternalX21.g:660:3: ( rule__VarAssignment__Group__0 )
            {
             before(grammarAccess.getVarAssignmentAccess().getGroup()); 
            // InternalX21.g:661:3: ( rule__VarAssignment__Group__0 )
            // InternalX21.g:661:4: rule__VarAssignment__Group__0
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
    // InternalX21.g:669:1: rule__Declaration__Alternatives : ( ( ruleFunction ) | ( ruleInput ) | ( ruleNode ) | ( ruleStream ) | ( ruleDataDecl ) | ( ruleParameter ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:673:1: ( ( ruleFunction ) | ( ruleInput ) | ( ruleNode ) | ( ruleStream ) | ( ruleDataDecl ) | ( ruleParameter ) )
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
                    // InternalX21.g:674:2: ( ruleFunction )
                    {
                    // InternalX21.g:674:2: ( ruleFunction )
                    // InternalX21.g:675:3: ruleFunction
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
                    // InternalX21.g:680:2: ( ruleInput )
                    {
                    // InternalX21.g:680:2: ( ruleInput )
                    // InternalX21.g:681:3: ruleInput
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
                    // InternalX21.g:686:2: ( ruleNode )
                    {
                    // InternalX21.g:686:2: ( ruleNode )
                    // InternalX21.g:687:3: ruleNode
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
                    // InternalX21.g:692:2: ( ruleStream )
                    {
                    // InternalX21.g:692:2: ( ruleStream )
                    // InternalX21.g:693:3: ruleStream
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
                    // InternalX21.g:698:2: ( ruleDataDecl )
                    {
                    // InternalX21.g:698:2: ( ruleDataDecl )
                    // InternalX21.g:699:3: ruleDataDecl
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
                    // InternalX21.g:704:2: ( ruleParameter )
                    {
                    // InternalX21.g:704:2: ( ruleParameter )
                    // InternalX21.g:705:3: ruleParameter
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
    // InternalX21.g:714:1: rule__FunctionOrLambda__Alternatives_1 : ( ( ( rule__FunctionOrLambda__Group_1_0__0 ) ) | ( ruleLambda ) );
    public final void rule__FunctionOrLambda__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:718:1: ( ( ( rule__FunctionOrLambda__Group_1_0__0 ) ) | ( ruleLambda ) )
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
                    // InternalX21.g:719:2: ( ( rule__FunctionOrLambda__Group_1_0__0 ) )
                    {
                    // InternalX21.g:719:2: ( ( rule__FunctionOrLambda__Group_1_0__0 ) )
                    // InternalX21.g:720:3: ( rule__FunctionOrLambda__Group_1_0__0 )
                    {
                     before(grammarAccess.getFunctionOrLambdaAccess().getGroup_1_0()); 
                    // InternalX21.g:721:3: ( rule__FunctionOrLambda__Group_1_0__0 )
                    // InternalX21.g:721:4: rule__FunctionOrLambda__Group_1_0__0
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
                    // InternalX21.g:725:2: ( ruleLambda )
                    {
                    // InternalX21.g:725:2: ( ruleLambda )
                    // InternalX21.g:726:3: ruleLambda
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


    // $ANTLR start "rule__Element__Alternatives"
    // InternalX21.g:735:1: rule__Element__Alternatives : ( ( ( rule__Element__Group_0__0 ) ) | ( ( rule__Element__Group_1__0 ) ) | ( ( rule__Element__Group_2__0 ) ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:739:1: ( ( ( rule__Element__Group_0__0 ) ) | ( ( rule__Element__Group_1__0 ) ) | ( ( rule__Element__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 26:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalX21.g:740:2: ( ( rule__Element__Group_0__0 ) )
                    {
                    // InternalX21.g:740:2: ( ( rule__Element__Group_0__0 ) )
                    // InternalX21.g:741:3: ( rule__Element__Group_0__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_0()); 
                    // InternalX21.g:742:3: ( rule__Element__Group_0__0 )
                    // InternalX21.g:742:4: rule__Element__Group_0__0
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
                    // InternalX21.g:746:2: ( ( rule__Element__Group_1__0 ) )
                    {
                    // InternalX21.g:746:2: ( ( rule__Element__Group_1__0 ) )
                    // InternalX21.g:747:3: ( rule__Element__Group_1__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_1()); 
                    // InternalX21.g:748:3: ( rule__Element__Group_1__0 )
                    // InternalX21.g:748:4: rule__Element__Group_1__0
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
                    // InternalX21.g:752:2: ( ( rule__Element__Group_2__0 ) )
                    {
                    // InternalX21.g:752:2: ( ( rule__Element__Group_2__0 ) )
                    // InternalX21.g:753:3: ( rule__Element__Group_2__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_2()); 
                    // InternalX21.g:754:3: ( rule__Element__Group_2__0 )
                    // InternalX21.g:754:4: rule__Element__Group_2__0
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
    // InternalX21.g:762:1: rule__Type__Alternatives : ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:766:1: ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt4=1;
                }
                break;
            case 29:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
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
                    // InternalX21.g:767:2: ( ( rule__Type__Group_0__0 ) )
                    {
                    // InternalX21.g:767:2: ( ( rule__Type__Group_0__0 ) )
                    // InternalX21.g:768:3: ( rule__Type__Group_0__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_0()); 
                    // InternalX21.g:769:3: ( rule__Type__Group_0__0 )
                    // InternalX21.g:769:4: rule__Type__Group_0__0
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
                    // InternalX21.g:773:2: ( ( rule__Type__Group_1__0 ) )
                    {
                    // InternalX21.g:773:2: ( ( rule__Type__Group_1__0 ) )
                    // InternalX21.g:774:3: ( rule__Type__Group_1__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_1()); 
                    // InternalX21.g:775:3: ( rule__Type__Group_1__0 )
                    // InternalX21.g:775:4: rule__Type__Group_1__0
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
                    // InternalX21.g:779:2: ( ( rule__Type__Group_2__0 ) )
                    {
                    // InternalX21.g:779:2: ( ( rule__Type__Group_2__0 ) )
                    // InternalX21.g:780:3: ( rule__Type__Group_2__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_2()); 
                    // InternalX21.g:781:3: ( rule__Type__Group_2__0 )
                    // InternalX21.g:781:4: rule__Type__Group_2__0
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
    // InternalX21.g:789:1: rule__LogicExp__Alternatives_1 : ( ( ( rule__LogicExp__Group_1_0__0 ) ) | ( ( rule__LogicExp__Group_1_1__0 ) ) | ( ( rule__LogicExp__Group_1_2__0 ) ) | ( ( rule__LogicExp__Group_1_3__0 ) ) | ( ( rule__LogicExp__Group_1_4__0 ) ) );
    public final void rule__LogicExp__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:793:1: ( ( ( rule__LogicExp__Group_1_0__0 ) ) | ( ( rule__LogicExp__Group_1_1__0 ) ) | ( ( rule__LogicExp__Group_1_2__0 ) ) | ( ( rule__LogicExp__Group_1_3__0 ) ) | ( ( rule__LogicExp__Group_1_4__0 ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt5=1;
                }
                break;
            case 31:
                {
                alt5=2;
                }
                break;
            case 32:
                {
                alt5=3;
                }
                break;
            case 33:
                {
                alt5=4;
                }
                break;
            case 34:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalX21.g:794:2: ( ( rule__LogicExp__Group_1_0__0 ) )
                    {
                    // InternalX21.g:794:2: ( ( rule__LogicExp__Group_1_0__0 ) )
                    // InternalX21.g:795:3: ( rule__LogicExp__Group_1_0__0 )
                    {
                     before(grammarAccess.getLogicExpAccess().getGroup_1_0()); 
                    // InternalX21.g:796:3: ( rule__LogicExp__Group_1_0__0 )
                    // InternalX21.g:796:4: rule__LogicExp__Group_1_0__0
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
                    // InternalX21.g:800:2: ( ( rule__LogicExp__Group_1_1__0 ) )
                    {
                    // InternalX21.g:800:2: ( ( rule__LogicExp__Group_1_1__0 ) )
                    // InternalX21.g:801:3: ( rule__LogicExp__Group_1_1__0 )
                    {
                     before(grammarAccess.getLogicExpAccess().getGroup_1_1()); 
                    // InternalX21.g:802:3: ( rule__LogicExp__Group_1_1__0 )
                    // InternalX21.g:802:4: rule__LogicExp__Group_1_1__0
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
                    // InternalX21.g:806:2: ( ( rule__LogicExp__Group_1_2__0 ) )
                    {
                    // InternalX21.g:806:2: ( ( rule__LogicExp__Group_1_2__0 ) )
                    // InternalX21.g:807:3: ( rule__LogicExp__Group_1_2__0 )
                    {
                     before(grammarAccess.getLogicExpAccess().getGroup_1_2()); 
                    // InternalX21.g:808:3: ( rule__LogicExp__Group_1_2__0 )
                    // InternalX21.g:808:4: rule__LogicExp__Group_1_2__0
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
                    // InternalX21.g:812:2: ( ( rule__LogicExp__Group_1_3__0 ) )
                    {
                    // InternalX21.g:812:2: ( ( rule__LogicExp__Group_1_3__0 ) )
                    // InternalX21.g:813:3: ( rule__LogicExp__Group_1_3__0 )
                    {
                     before(grammarAccess.getLogicExpAccess().getGroup_1_3()); 
                    // InternalX21.g:814:3: ( rule__LogicExp__Group_1_3__0 )
                    // InternalX21.g:814:4: rule__LogicExp__Group_1_3__0
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
                    // InternalX21.g:818:2: ( ( rule__LogicExp__Group_1_4__0 ) )
                    {
                    // InternalX21.g:818:2: ( ( rule__LogicExp__Group_1_4__0 ) )
                    // InternalX21.g:819:3: ( rule__LogicExp__Group_1_4__0 )
                    {
                     before(grammarAccess.getLogicExpAccess().getGroup_1_4()); 
                    // InternalX21.g:820:3: ( rule__LogicExp__Group_1_4__0 )
                    // InternalX21.g:820:4: rule__LogicExp__Group_1_4__0
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
    // InternalX21.g:828:1: rule__Exp__Alternatives_1_0 : ( ( ( rule__Exp__Group_1_0_0__0 ) ) | ( () ) );
    public final void rule__Exp__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:832:1: ( ( ( rule__Exp__Group_1_0_0__0 ) ) | ( () ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==35) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_INT)||LA6_0==15||LA6_0==38||(LA6_0>=42 && LA6_0<=43)||LA6_0==46) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalX21.g:833:2: ( ( rule__Exp__Group_1_0_0__0 ) )
                    {
                    // InternalX21.g:833:2: ( ( rule__Exp__Group_1_0_0__0 ) )
                    // InternalX21.g:834:3: ( rule__Exp__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_0()); 
                    // InternalX21.g:835:3: ( rule__Exp__Group_1_0_0__0 )
                    // InternalX21.g:835:4: rule__Exp__Group_1_0_0__0
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
                    // InternalX21.g:839:2: ( () )
                    {
                    // InternalX21.g:839:2: ( () )
                    // InternalX21.g:840:3: ()
                    {
                     before(grammarAccess.getExpAccess().getMinusLeftAction_1_0_1()); 
                    // InternalX21.g:841:3: ()
                    // InternalX21.g:841:4: 
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
    // InternalX21.g:849:1: rule__MulDiv__Alternatives_1_0 : ( ( ( rule__MulDiv__Group_1_0_0__0 ) ) | ( ( rule__MulDiv__Group_1_0_1__0 ) ) );
    public final void rule__MulDiv__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:853:1: ( ( ( rule__MulDiv__Group_1_0_0__0 ) ) | ( ( rule__MulDiv__Group_1_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==36) ) {
                alt7=1;
            }
            else if ( (LA7_0==37) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalX21.g:854:2: ( ( rule__MulDiv__Group_1_0_0__0 ) )
                    {
                    // InternalX21.g:854:2: ( ( rule__MulDiv__Group_1_0_0__0 ) )
                    // InternalX21.g:855:3: ( rule__MulDiv__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMulDivAccess().getGroup_1_0_0()); 
                    // InternalX21.g:856:3: ( rule__MulDiv__Group_1_0_0__0 )
                    // InternalX21.g:856:4: rule__MulDiv__Group_1_0_0__0
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
                    // InternalX21.g:860:2: ( ( rule__MulDiv__Group_1_0_1__0 ) )
                    {
                    // InternalX21.g:860:2: ( ( rule__MulDiv__Group_1_0_1__0 ) )
                    // InternalX21.g:861:3: ( rule__MulDiv__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMulDivAccess().getGroup_1_0_1()); 
                    // InternalX21.g:862:3: ( rule__MulDiv__Group_1_0_1__0 )
                    // InternalX21.g:862:4: rule__MulDiv__Group_1_0_1__0
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
    // InternalX21.g:870:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleLetStatement ) | ( ruleDataAccess ) | ( ruleNone ) | ( ruleIfStatement ) | ( ruleNewStatement ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:874:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleLetStatement ) | ( ruleDataAccess ) | ( ruleNone ) | ( ruleIfStatement ) | ( ruleNewStatement ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt8=1;
                }
                break;
            case 15:
                {
                alt8=2;
                }
                break;
            case 38:
                {
                alt8=3;
                }
                break;
            case RULE_ID:
                {
                alt8=4;
                }
                break;
            case 42:
                {
                alt8=5;
                }
                break;
            case 43:
                {
                alt8=6;
                }
                break;
            case 46:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalX21.g:875:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalX21.g:875:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalX21.g:876:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalX21.g:877:3: ( rule__Primary__Group_0__0 )
                    // InternalX21.g:877:4: rule__Primary__Group_0__0
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
                    // InternalX21.g:881:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalX21.g:881:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalX21.g:882:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalX21.g:883:3: ( rule__Primary__Group_1__0 )
                    // InternalX21.g:883:4: rule__Primary__Group_1__0
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
                    // InternalX21.g:887:2: ( ruleLetStatement )
                    {
                    // InternalX21.g:887:2: ( ruleLetStatement )
                    // InternalX21.g:888:3: ruleLetStatement
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
                    // InternalX21.g:893:2: ( ruleDataAccess )
                    {
                    // InternalX21.g:893:2: ( ruleDataAccess )
                    // InternalX21.g:894:3: ruleDataAccess
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
                    // InternalX21.g:899:2: ( ruleNone )
                    {
                    // InternalX21.g:899:2: ( ruleNone )
                    // InternalX21.g:900:3: ruleNone
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
                    // InternalX21.g:905:2: ( ruleIfStatement )
                    {
                    // InternalX21.g:905:2: ( ruleIfStatement )
                    // InternalX21.g:906:3: ruleIfStatement
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
                    // InternalX21.g:911:2: ( ruleNewStatement )
                    {
                    // InternalX21.g:911:2: ( ruleNewStatement )
                    // InternalX21.g:912:3: ruleNewStatement
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
    // InternalX21.g:921:1: rule__X21__Group__0 : rule__X21__Group__0__Impl rule__X21__Group__1 ;
    public final void rule__X21__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:925:1: ( rule__X21__Group__0__Impl rule__X21__Group__1 )
            // InternalX21.g:926:2: rule__X21__Group__0__Impl rule__X21__Group__1
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
    // InternalX21.g:933:1: rule__X21__Group__0__Impl : ( () ) ;
    public final void rule__X21__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:937:1: ( ( () ) )
            // InternalX21.g:938:1: ( () )
            {
            // InternalX21.g:938:1: ( () )
            // InternalX21.g:939:2: ()
            {
             before(grammarAccess.getX21Access().getX21Action_0()); 
            // InternalX21.g:940:2: ()
            // InternalX21.g:940:3: 
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
    // InternalX21.g:948:1: rule__X21__Group__1 : rule__X21__Group__1__Impl rule__X21__Group__2 ;
    public final void rule__X21__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:952:1: ( rule__X21__Group__1__Impl rule__X21__Group__2 )
            // InternalX21.g:953:2: rule__X21__Group__1__Impl rule__X21__Group__2
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
    // InternalX21.g:960:1: rule__X21__Group__1__Impl : ( 'program' ) ;
    public final void rule__X21__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:964:1: ( ( 'program' ) )
            // InternalX21.g:965:1: ( 'program' )
            {
            // InternalX21.g:965:1: ( 'program' )
            // InternalX21.g:966:2: 'program'
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
    // InternalX21.g:975:1: rule__X21__Group__2 : rule__X21__Group__2__Impl rule__X21__Group__3 ;
    public final void rule__X21__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:979:1: ( rule__X21__Group__2__Impl rule__X21__Group__3 )
            // InternalX21.g:980:2: rule__X21__Group__2__Impl rule__X21__Group__3
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
    // InternalX21.g:987:1: rule__X21__Group__2__Impl : ( ( rule__X21__NameAssignment_2 ) ) ;
    public final void rule__X21__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:991:1: ( ( ( rule__X21__NameAssignment_2 ) ) )
            // InternalX21.g:992:1: ( ( rule__X21__NameAssignment_2 ) )
            {
            // InternalX21.g:992:1: ( ( rule__X21__NameAssignment_2 ) )
            // InternalX21.g:993:2: ( rule__X21__NameAssignment_2 )
            {
             before(grammarAccess.getX21Access().getNameAssignment_2()); 
            // InternalX21.g:994:2: ( rule__X21__NameAssignment_2 )
            // InternalX21.g:994:3: rule__X21__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__X21__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getX21Access().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalX21.g:1002:1: rule__X21__Group__3 : rule__X21__Group__3__Impl ;
    public final void rule__X21__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1006:1: ( rule__X21__Group__3__Impl )
            // InternalX21.g:1007:2: rule__X21__Group__3__Impl
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
    // InternalX21.g:1013:1: rule__X21__Group__3__Impl : ( ( rule__X21__DeclarationsAssignment_3 )* ) ;
    public final void rule__X21__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1017:1: ( ( ( rule__X21__DeclarationsAssignment_3 )* ) )
            // InternalX21.g:1018:1: ( ( rule__X21__DeclarationsAssignment_3 )* )
            {
            // InternalX21.g:1018:1: ( ( rule__X21__DeclarationsAssignment_3 )* )
            // InternalX21.g:1019:2: ( rule__X21__DeclarationsAssignment_3 )*
            {
             before(grammarAccess.getX21Access().getDeclarationsAssignment_3()); 
            // InternalX21.g:1020:2: ( rule__X21__DeclarationsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=13 && LA9_0<=14)||LA9_0==19||(LA9_0>=22 && LA9_0<=23)||LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalX21.g:1020:3: rule__X21__DeclarationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__X21__DeclarationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalX21.g:1029:1: rule__NameAndType__Group__0 : rule__NameAndType__Group__0__Impl rule__NameAndType__Group__1 ;
    public final void rule__NameAndType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1033:1: ( rule__NameAndType__Group__0__Impl rule__NameAndType__Group__1 )
            // InternalX21.g:1034:2: rule__NameAndType__Group__0__Impl rule__NameAndType__Group__1
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
    // InternalX21.g:1041:1: rule__NameAndType__Group__0__Impl : ( ( rule__NameAndType__NameAssignment_0 ) ) ;
    public final void rule__NameAndType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1045:1: ( ( ( rule__NameAndType__NameAssignment_0 ) ) )
            // InternalX21.g:1046:1: ( ( rule__NameAndType__NameAssignment_0 ) )
            {
            // InternalX21.g:1046:1: ( ( rule__NameAndType__NameAssignment_0 ) )
            // InternalX21.g:1047:2: ( rule__NameAndType__NameAssignment_0 )
            {
             before(grammarAccess.getNameAndTypeAccess().getNameAssignment_0()); 
            // InternalX21.g:1048:2: ( rule__NameAndType__NameAssignment_0 )
            // InternalX21.g:1048:3: rule__NameAndType__NameAssignment_0
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
    // InternalX21.g:1056:1: rule__NameAndType__Group__1 : rule__NameAndType__Group__1__Impl rule__NameAndType__Group__2 ;
    public final void rule__NameAndType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1060:1: ( rule__NameAndType__Group__1__Impl rule__NameAndType__Group__2 )
            // InternalX21.g:1061:2: rule__NameAndType__Group__1__Impl rule__NameAndType__Group__2
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
    // InternalX21.g:1068:1: rule__NameAndType__Group__1__Impl : ( ':' ) ;
    public final void rule__NameAndType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1072:1: ( ( ':' ) )
            // InternalX21.g:1073:1: ( ':' )
            {
            // InternalX21.g:1073:1: ( ':' )
            // InternalX21.g:1074:2: ':'
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
    // InternalX21.g:1083:1: rule__NameAndType__Group__2 : rule__NameAndType__Group__2__Impl ;
    public final void rule__NameAndType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1087:1: ( rule__NameAndType__Group__2__Impl )
            // InternalX21.g:1088:2: rule__NameAndType__Group__2__Impl
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
    // InternalX21.g:1094:1: rule__NameAndType__Group__2__Impl : ( ( rule__NameAndType__TypeAssignment_2 ) ) ;
    public final void rule__NameAndType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1098:1: ( ( ( rule__NameAndType__TypeAssignment_2 ) ) )
            // InternalX21.g:1099:1: ( ( rule__NameAndType__TypeAssignment_2 ) )
            {
            // InternalX21.g:1099:1: ( ( rule__NameAndType__TypeAssignment_2 ) )
            // InternalX21.g:1100:2: ( rule__NameAndType__TypeAssignment_2 )
            {
             before(grammarAccess.getNameAndTypeAccess().getTypeAssignment_2()); 
            // InternalX21.g:1101:2: ( rule__NameAndType__TypeAssignment_2 )
            // InternalX21.g:1101:3: rule__NameAndType__TypeAssignment_2
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
    // InternalX21.g:1110:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1114:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalX21.g:1115:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalX21.g:1122:1: rule__Parameter__Group__0__Impl : ( 'parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1126:1: ( ( 'parameter' ) )
            // InternalX21.g:1127:1: ( 'parameter' )
            {
            // InternalX21.g:1127:1: ( 'parameter' )
            // InternalX21.g:1128:2: 'parameter'
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
    // InternalX21.g:1137:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1141:1: ( rule__Parameter__Group__1__Impl )
            // InternalX21.g:1142:2: rule__Parameter__Group__1__Impl
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
    // InternalX21.g:1148:1: rule__Parameter__Group__1__Impl : ( ruleNameAndType ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1152:1: ( ( ruleNameAndType ) )
            // InternalX21.g:1153:1: ( ruleNameAndType )
            {
            // InternalX21.g:1153:1: ( ruleNameAndType )
            // InternalX21.g:1154:2: ruleNameAndType
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
    // InternalX21.g:1164:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1168:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalX21.g:1169:2: rule__Function__Group__0__Impl rule__Function__Group__1
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
    // InternalX21.g:1176:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1180:1: ( ( 'function' ) )
            // InternalX21.g:1181:1: ( 'function' )
            {
            // InternalX21.g:1181:1: ( 'function' )
            // InternalX21.g:1182:2: 'function'
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
    // InternalX21.g:1191:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1195:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalX21.g:1196:2: rule__Function__Group__1__Impl rule__Function__Group__2
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
    // InternalX21.g:1203:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1207:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // InternalX21.g:1208:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // InternalX21.g:1208:1: ( ( rule__Function__NameAssignment_1 ) )
            // InternalX21.g:1209:2: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // InternalX21.g:1210:2: ( rule__Function__NameAssignment_1 )
            // InternalX21.g:1210:3: rule__Function__NameAssignment_1
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
    // InternalX21.g:1218:1: rule__Function__Group__2 : rule__Function__Group__2__Impl ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1222:1: ( rule__Function__Group__2__Impl )
            // InternalX21.g:1223:2: rule__Function__Group__2__Impl
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
    // InternalX21.g:1229:1: rule__Function__Group__2__Impl : ( ( rule__Function__BodyAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1233:1: ( ( ( rule__Function__BodyAssignment_2 ) ) )
            // InternalX21.g:1234:1: ( ( rule__Function__BodyAssignment_2 ) )
            {
            // InternalX21.g:1234:1: ( ( rule__Function__BodyAssignment_2 ) )
            // InternalX21.g:1235:2: ( rule__Function__BodyAssignment_2 )
            {
             before(grammarAccess.getFunctionAccess().getBodyAssignment_2()); 
            // InternalX21.g:1236:2: ( rule__Function__BodyAssignment_2 )
            // InternalX21.g:1236:3: rule__Function__BodyAssignment_2
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
    // InternalX21.g:1245:1: rule__Lambda__Group__0 : rule__Lambda__Group__0__Impl rule__Lambda__Group__1 ;
    public final void rule__Lambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1249:1: ( rule__Lambda__Group__0__Impl rule__Lambda__Group__1 )
            // InternalX21.g:1250:2: rule__Lambda__Group__0__Impl rule__Lambda__Group__1
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
    // InternalX21.g:1257:1: rule__Lambda__Group__0__Impl : ( '(' ) ;
    public final void rule__Lambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1261:1: ( ( '(' ) )
            // InternalX21.g:1262:1: ( '(' )
            {
            // InternalX21.g:1262:1: ( '(' )
            // InternalX21.g:1263:2: '('
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
    // InternalX21.g:1272:1: rule__Lambda__Group__1 : rule__Lambda__Group__1__Impl rule__Lambda__Group__2 ;
    public final void rule__Lambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1276:1: ( rule__Lambda__Group__1__Impl rule__Lambda__Group__2 )
            // InternalX21.g:1277:2: rule__Lambda__Group__1__Impl rule__Lambda__Group__2
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
    // InternalX21.g:1284:1: rule__Lambda__Group__1__Impl : ( ruleNameAndType ) ;
    public final void rule__Lambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1288:1: ( ( ruleNameAndType ) )
            // InternalX21.g:1289:1: ( ruleNameAndType )
            {
            // InternalX21.g:1289:1: ( ruleNameAndType )
            // InternalX21.g:1290:2: ruleNameAndType
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
    // InternalX21.g:1299:1: rule__Lambda__Group__2 : rule__Lambda__Group__2__Impl rule__Lambda__Group__3 ;
    public final void rule__Lambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1303:1: ( rule__Lambda__Group__2__Impl rule__Lambda__Group__3 )
            // InternalX21.g:1304:2: rule__Lambda__Group__2__Impl rule__Lambda__Group__3
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
    // InternalX21.g:1311:1: rule__Lambda__Group__2__Impl : ( ')' ) ;
    public final void rule__Lambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1315:1: ( ( ')' ) )
            // InternalX21.g:1316:1: ( ')' )
            {
            // InternalX21.g:1316:1: ( ')' )
            // InternalX21.g:1317:2: ')'
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
    // InternalX21.g:1326:1: rule__Lambda__Group__3 : rule__Lambda__Group__3__Impl rule__Lambda__Group__4 ;
    public final void rule__Lambda__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1330:1: ( rule__Lambda__Group__3__Impl rule__Lambda__Group__4 )
            // InternalX21.g:1331:2: rule__Lambda__Group__3__Impl rule__Lambda__Group__4
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
    // InternalX21.g:1338:1: rule__Lambda__Group__3__Impl : ( '{' ) ;
    public final void rule__Lambda__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1342:1: ( ( '{' ) )
            // InternalX21.g:1343:1: ( '{' )
            {
            // InternalX21.g:1343:1: ( '{' )
            // InternalX21.g:1344:2: '{'
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
    // InternalX21.g:1353:1: rule__Lambda__Group__4 : rule__Lambda__Group__4__Impl rule__Lambda__Group__5 ;
    public final void rule__Lambda__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1357:1: ( rule__Lambda__Group__4__Impl rule__Lambda__Group__5 )
            // InternalX21.g:1358:2: rule__Lambda__Group__4__Impl rule__Lambda__Group__5
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
    // InternalX21.g:1365:1: rule__Lambda__Group__4__Impl : ( ( rule__Lambda__LogicAssignment_4 ) ) ;
    public final void rule__Lambda__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1369:1: ( ( ( rule__Lambda__LogicAssignment_4 ) ) )
            // InternalX21.g:1370:1: ( ( rule__Lambda__LogicAssignment_4 ) )
            {
            // InternalX21.g:1370:1: ( ( rule__Lambda__LogicAssignment_4 ) )
            // InternalX21.g:1371:2: ( rule__Lambda__LogicAssignment_4 )
            {
             before(grammarAccess.getLambdaAccess().getLogicAssignment_4()); 
            // InternalX21.g:1372:2: ( rule__Lambda__LogicAssignment_4 )
            // InternalX21.g:1372:3: rule__Lambda__LogicAssignment_4
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
    // InternalX21.g:1380:1: rule__Lambda__Group__5 : rule__Lambda__Group__5__Impl ;
    public final void rule__Lambda__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1384:1: ( rule__Lambda__Group__5__Impl )
            // InternalX21.g:1385:2: rule__Lambda__Group__5__Impl
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
    // InternalX21.g:1391:1: rule__Lambda__Group__5__Impl : ( '}' ) ;
    public final void rule__Lambda__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1395:1: ( ( '}' ) )
            // InternalX21.g:1396:1: ( '}' )
            {
            // InternalX21.g:1396:1: ( '}' )
            // InternalX21.g:1397:2: '}'
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
    // InternalX21.g:1407:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1411:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalX21.g:1412:2: rule__Input__Group__0__Impl rule__Input__Group__1
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
    // InternalX21.g:1419:1: rule__Input__Group__0__Impl : ( 'input' ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1423:1: ( ( 'input' ) )
            // InternalX21.g:1424:1: ( 'input' )
            {
            // InternalX21.g:1424:1: ( 'input' )
            // InternalX21.g:1425:2: 'input'
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
    // InternalX21.g:1434:1: rule__Input__Group__1 : rule__Input__Group__1__Impl ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1438:1: ( rule__Input__Group__1__Impl )
            // InternalX21.g:1439:2: rule__Input__Group__1__Impl
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
    // InternalX21.g:1445:1: rule__Input__Group__1__Impl : ( ruleNameAndType ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1449:1: ( ( ruleNameAndType ) )
            // InternalX21.g:1450:1: ( ruleNameAndType )
            {
            // InternalX21.g:1450:1: ( ruleNameAndType )
            // InternalX21.g:1451:2: ruleNameAndType
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
    // InternalX21.g:1461:1: rule__FunctionOrLambda__Group__0 : rule__FunctionOrLambda__Group__0__Impl rule__FunctionOrLambda__Group__1 ;
    public final void rule__FunctionOrLambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1465:1: ( rule__FunctionOrLambda__Group__0__Impl rule__FunctionOrLambda__Group__1 )
            // InternalX21.g:1466:2: rule__FunctionOrLambda__Group__0__Impl rule__FunctionOrLambda__Group__1
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
    // InternalX21.g:1473:1: rule__FunctionOrLambda__Group__0__Impl : ( '[' ) ;
    public final void rule__FunctionOrLambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1477:1: ( ( '[' ) )
            // InternalX21.g:1478:1: ( '[' )
            {
            // InternalX21.g:1478:1: ( '[' )
            // InternalX21.g:1479:2: '['
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
    // InternalX21.g:1488:1: rule__FunctionOrLambda__Group__1 : rule__FunctionOrLambda__Group__1__Impl rule__FunctionOrLambda__Group__2 ;
    public final void rule__FunctionOrLambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1492:1: ( rule__FunctionOrLambda__Group__1__Impl rule__FunctionOrLambda__Group__2 )
            // InternalX21.g:1493:2: rule__FunctionOrLambda__Group__1__Impl rule__FunctionOrLambda__Group__2
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
    // InternalX21.g:1500:1: rule__FunctionOrLambda__Group__1__Impl : ( ( rule__FunctionOrLambda__Alternatives_1 ) ) ;
    public final void rule__FunctionOrLambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1504:1: ( ( ( rule__FunctionOrLambda__Alternatives_1 ) ) )
            // InternalX21.g:1505:1: ( ( rule__FunctionOrLambda__Alternatives_1 ) )
            {
            // InternalX21.g:1505:1: ( ( rule__FunctionOrLambda__Alternatives_1 ) )
            // InternalX21.g:1506:2: ( rule__FunctionOrLambda__Alternatives_1 )
            {
             before(grammarAccess.getFunctionOrLambdaAccess().getAlternatives_1()); 
            // InternalX21.g:1507:2: ( rule__FunctionOrLambda__Alternatives_1 )
            // InternalX21.g:1507:3: rule__FunctionOrLambda__Alternatives_1
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
    // InternalX21.g:1515:1: rule__FunctionOrLambda__Group__2 : rule__FunctionOrLambda__Group__2__Impl ;
    public final void rule__FunctionOrLambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1519:1: ( rule__FunctionOrLambda__Group__2__Impl )
            // InternalX21.g:1520:2: rule__FunctionOrLambda__Group__2__Impl
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
    // InternalX21.g:1526:1: rule__FunctionOrLambda__Group__2__Impl : ( ']' ) ;
    public final void rule__FunctionOrLambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1530:1: ( ( ']' ) )
            // InternalX21.g:1531:1: ( ']' )
            {
            // InternalX21.g:1531:1: ( ']' )
            // InternalX21.g:1532:2: ']'
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
    // InternalX21.g:1542:1: rule__FunctionOrLambda__Group_1_0__0 : rule__FunctionOrLambda__Group_1_0__0__Impl rule__FunctionOrLambda__Group_1_0__1 ;
    public final void rule__FunctionOrLambda__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1546:1: ( rule__FunctionOrLambda__Group_1_0__0__Impl rule__FunctionOrLambda__Group_1_0__1 )
            // InternalX21.g:1547:2: rule__FunctionOrLambda__Group_1_0__0__Impl rule__FunctionOrLambda__Group_1_0__1
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
    // InternalX21.g:1554:1: rule__FunctionOrLambda__Group_1_0__0__Impl : ( () ) ;
    public final void rule__FunctionOrLambda__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1558:1: ( ( () ) )
            // InternalX21.g:1559:1: ( () )
            {
            // InternalX21.g:1559:1: ( () )
            // InternalX21.g:1560:2: ()
            {
             before(grammarAccess.getFunctionOrLambdaAccess().getFunctionReferenceAction_1_0_0()); 
            // InternalX21.g:1561:2: ()
            // InternalX21.g:1561:3: 
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
    // InternalX21.g:1569:1: rule__FunctionOrLambda__Group_1_0__1 : rule__FunctionOrLambda__Group_1_0__1__Impl ;
    public final void rule__FunctionOrLambda__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1573:1: ( rule__FunctionOrLambda__Group_1_0__1__Impl )
            // InternalX21.g:1574:2: rule__FunctionOrLambda__Group_1_0__1__Impl
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
    // InternalX21.g:1580:1: rule__FunctionOrLambda__Group_1_0__1__Impl : ( ( rule__FunctionOrLambda__RefAssignment_1_0_1 ) ) ;
    public final void rule__FunctionOrLambda__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1584:1: ( ( ( rule__FunctionOrLambda__RefAssignment_1_0_1 ) ) )
            // InternalX21.g:1585:1: ( ( rule__FunctionOrLambda__RefAssignment_1_0_1 ) )
            {
            // InternalX21.g:1585:1: ( ( rule__FunctionOrLambda__RefAssignment_1_0_1 ) )
            // InternalX21.g:1586:2: ( rule__FunctionOrLambda__RefAssignment_1_0_1 )
            {
             before(grammarAccess.getFunctionOrLambdaAccess().getRefAssignment_1_0_1()); 
            // InternalX21.g:1587:2: ( rule__FunctionOrLambda__RefAssignment_1_0_1 )
            // InternalX21.g:1587:3: rule__FunctionOrLambda__RefAssignment_1_0_1
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
    // InternalX21.g:1596:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1600:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalX21.g:1601:2: rule__Node__Group__0__Impl rule__Node__Group__1
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
    // InternalX21.g:1608:1: rule__Node__Group__0__Impl : ( 'node' ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1612:1: ( ( 'node' ) )
            // InternalX21.g:1613:1: ( 'node' )
            {
            // InternalX21.g:1613:1: ( 'node' )
            // InternalX21.g:1614:2: 'node'
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
    // InternalX21.g:1623:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1627:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalX21.g:1628:2: rule__Node__Group__1__Impl rule__Node__Group__2
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
    // InternalX21.g:1635:1: rule__Node__Group__1__Impl : ( ( rule__Node__NameAssignment_1 ) ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1639:1: ( ( ( rule__Node__NameAssignment_1 ) ) )
            // InternalX21.g:1640:1: ( ( rule__Node__NameAssignment_1 ) )
            {
            // InternalX21.g:1640:1: ( ( rule__Node__NameAssignment_1 ) )
            // InternalX21.g:1641:2: ( rule__Node__NameAssignment_1 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_1()); 
            // InternalX21.g:1642:2: ( rule__Node__NameAssignment_1 )
            // InternalX21.g:1642:3: rule__Node__NameAssignment_1
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
    // InternalX21.g:1650:1: rule__Node__Group__2 : rule__Node__Group__2__Impl ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1654:1: ( rule__Node__Group__2__Impl )
            // InternalX21.g:1655:2: rule__Node__Group__2__Impl
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
    // InternalX21.g:1661:1: rule__Node__Group__2__Impl : ( ( rule__Node__BodyAssignment_2 ) ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1665:1: ( ( ( rule__Node__BodyAssignment_2 ) ) )
            // InternalX21.g:1666:1: ( ( rule__Node__BodyAssignment_2 ) )
            {
            // InternalX21.g:1666:1: ( ( rule__Node__BodyAssignment_2 ) )
            // InternalX21.g:1667:2: ( rule__Node__BodyAssignment_2 )
            {
             before(grammarAccess.getNodeAccess().getBodyAssignment_2()); 
            // InternalX21.g:1668:2: ( rule__Node__BodyAssignment_2 )
            // InternalX21.g:1668:3: rule__Node__BodyAssignment_2
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
    // InternalX21.g:1677:1: rule__Stream__Group__0 : rule__Stream__Group__0__Impl rule__Stream__Group__1 ;
    public final void rule__Stream__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1681:1: ( rule__Stream__Group__0__Impl rule__Stream__Group__1 )
            // InternalX21.g:1682:2: rule__Stream__Group__0__Impl rule__Stream__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalX21.g:1689:1: rule__Stream__Group__0__Impl : ( 'stream' ) ;
    public final void rule__Stream__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1693:1: ( ( 'stream' ) )
            // InternalX21.g:1694:1: ( 'stream' )
            {
            // InternalX21.g:1694:1: ( 'stream' )
            // InternalX21.g:1695:2: 'stream'
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
    // InternalX21.g:1704:1: rule__Stream__Group__1 : rule__Stream__Group__1__Impl rule__Stream__Group__2 ;
    public final void rule__Stream__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1708:1: ( rule__Stream__Group__1__Impl rule__Stream__Group__2 )
            // InternalX21.g:1709:2: rule__Stream__Group__1__Impl rule__Stream__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalX21.g:1716:1: rule__Stream__Group__1__Impl : ( ( rule__Stream__StartNodesAssignment_1 ) ) ;
    public final void rule__Stream__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1720:1: ( ( ( rule__Stream__StartNodesAssignment_1 ) ) )
            // InternalX21.g:1721:1: ( ( rule__Stream__StartNodesAssignment_1 ) )
            {
            // InternalX21.g:1721:1: ( ( rule__Stream__StartNodesAssignment_1 ) )
            // InternalX21.g:1722:2: ( rule__Stream__StartNodesAssignment_1 )
            {
             before(grammarAccess.getStreamAccess().getStartNodesAssignment_1()); 
            // InternalX21.g:1723:2: ( rule__Stream__StartNodesAssignment_1 )
            // InternalX21.g:1723:3: rule__Stream__StartNodesAssignment_1
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
    // InternalX21.g:1731:1: rule__Stream__Group__2 : rule__Stream__Group__2__Impl rule__Stream__Group__3 ;
    public final void rule__Stream__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1735:1: ( rule__Stream__Group__2__Impl rule__Stream__Group__3 )
            // InternalX21.g:1736:2: rule__Stream__Group__2__Impl rule__Stream__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalX21.g:1743:1: rule__Stream__Group__2__Impl : ( ( rule__Stream__Group_2__0 )* ) ;
    public final void rule__Stream__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1747:1: ( ( ( rule__Stream__Group_2__0 )* ) )
            // InternalX21.g:1748:1: ( ( rule__Stream__Group_2__0 )* )
            {
            // InternalX21.g:1748:1: ( ( rule__Stream__Group_2__0 )* )
            // InternalX21.g:1749:2: ( rule__Stream__Group_2__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_2()); 
            // InternalX21.g:1750:2: ( rule__Stream__Group_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalX21.g:1750:3: rule__Stream__Group_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Stream__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalX21.g:1758:1: rule__Stream__Group__3 : rule__Stream__Group__3__Impl ;
    public final void rule__Stream__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1762:1: ( rule__Stream__Group__3__Impl )
            // InternalX21.g:1763:2: rule__Stream__Group__3__Impl
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
    // InternalX21.g:1769:1: rule__Stream__Group__3__Impl : ( ( ( rule__Stream__Group_3__0 ) ) ( ( rule__Stream__Group_3__0 )* ) ) ;
    public final void rule__Stream__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1773:1: ( ( ( ( rule__Stream__Group_3__0 ) ) ( ( rule__Stream__Group_3__0 )* ) ) )
            // InternalX21.g:1774:1: ( ( ( rule__Stream__Group_3__0 ) ) ( ( rule__Stream__Group_3__0 )* ) )
            {
            // InternalX21.g:1774:1: ( ( ( rule__Stream__Group_3__0 ) ) ( ( rule__Stream__Group_3__0 )* ) )
            // InternalX21.g:1775:2: ( ( rule__Stream__Group_3__0 ) ) ( ( rule__Stream__Group_3__0 )* )
            {
            // InternalX21.g:1775:2: ( ( rule__Stream__Group_3__0 ) )
            // InternalX21.g:1776:3: ( rule__Stream__Group_3__0 )
            {
             before(grammarAccess.getStreamAccess().getGroup_3()); 
            // InternalX21.g:1777:3: ( rule__Stream__Group_3__0 )
            // InternalX21.g:1777:4: rule__Stream__Group_3__0
            {
            pushFollow(FOLLOW_19);
            rule__Stream__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getGroup_3()); 

            }

            // InternalX21.g:1780:2: ( ( rule__Stream__Group_3__0 )* )
            // InternalX21.g:1781:3: ( rule__Stream__Group_3__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_3()); 
            // InternalX21.g:1782:3: ( rule__Stream__Group_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalX21.g:1782:4: rule__Stream__Group_3__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Stream__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalX21.g:1792:1: rule__Stream__Group_2__0 : rule__Stream__Group_2__0__Impl rule__Stream__Group_2__1 ;
    public final void rule__Stream__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1796:1: ( rule__Stream__Group_2__0__Impl rule__Stream__Group_2__1 )
            // InternalX21.g:1797:2: rule__Stream__Group_2__0__Impl rule__Stream__Group_2__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalX21.g:1804:1: rule__Stream__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Stream__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1808:1: ( ( ',' ) )
            // InternalX21.g:1809:1: ( ',' )
            {
            // InternalX21.g:1809:1: ( ',' )
            // InternalX21.g:1810:2: ','
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
    // InternalX21.g:1819:1: rule__Stream__Group_2__1 : rule__Stream__Group_2__1__Impl ;
    public final void rule__Stream__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1823:1: ( rule__Stream__Group_2__1__Impl )
            // InternalX21.g:1824:2: rule__Stream__Group_2__1__Impl
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
    // InternalX21.g:1830:1: rule__Stream__Group_2__1__Impl : ( ( rule__Stream__StartNodesAssignment_2_1 ) ) ;
    public final void rule__Stream__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1834:1: ( ( ( rule__Stream__StartNodesAssignment_2_1 ) ) )
            // InternalX21.g:1835:1: ( ( rule__Stream__StartNodesAssignment_2_1 ) )
            {
            // InternalX21.g:1835:1: ( ( rule__Stream__StartNodesAssignment_2_1 ) )
            // InternalX21.g:1836:2: ( rule__Stream__StartNodesAssignment_2_1 )
            {
             before(grammarAccess.getStreamAccess().getStartNodesAssignment_2_1()); 
            // InternalX21.g:1837:2: ( rule__Stream__StartNodesAssignment_2_1 )
            // InternalX21.g:1837:3: rule__Stream__StartNodesAssignment_2_1
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
    // InternalX21.g:1846:1: rule__Stream__Group_3__0 : rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1 ;
    public final void rule__Stream__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1850:1: ( rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1 )
            // InternalX21.g:1851:2: rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalX21.g:1858:1: rule__Stream__Group_3__0__Impl : ( 'to' ) ;
    public final void rule__Stream__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1862:1: ( ( 'to' ) )
            // InternalX21.g:1863:1: ( 'to' )
            {
            // InternalX21.g:1863:1: ( 'to' )
            // InternalX21.g:1864:2: 'to'
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
    // InternalX21.g:1873:1: rule__Stream__Group_3__1 : rule__Stream__Group_3__1__Impl ;
    public final void rule__Stream__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1877:1: ( rule__Stream__Group_3__1__Impl )
            // InternalX21.g:1878:2: rule__Stream__Group_3__1__Impl
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
    // InternalX21.g:1884:1: rule__Stream__Group_3__1__Impl : ( ( rule__Stream__PointsAssignment_3_1 ) ) ;
    public final void rule__Stream__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1888:1: ( ( ( rule__Stream__PointsAssignment_3_1 ) ) )
            // InternalX21.g:1889:1: ( ( rule__Stream__PointsAssignment_3_1 ) )
            {
            // InternalX21.g:1889:1: ( ( rule__Stream__PointsAssignment_3_1 ) )
            // InternalX21.g:1890:2: ( rule__Stream__PointsAssignment_3_1 )
            {
             before(grammarAccess.getStreamAccess().getPointsAssignment_3_1()); 
            // InternalX21.g:1891:2: ( rule__Stream__PointsAssignment_3_1 )
            // InternalX21.g:1891:3: rule__Stream__PointsAssignment_3_1
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
    // InternalX21.g:1900:1: rule__ElementList__Group__0 : rule__ElementList__Group__0__Impl rule__ElementList__Group__1 ;
    public final void rule__ElementList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1904:1: ( rule__ElementList__Group__0__Impl rule__ElementList__Group__1 )
            // InternalX21.g:1905:2: rule__ElementList__Group__0__Impl rule__ElementList__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalX21.g:1912:1: rule__ElementList__Group__0__Impl : ( ( rule__ElementList__ElementsAssignment_0 ) ) ;
    public final void rule__ElementList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1916:1: ( ( ( rule__ElementList__ElementsAssignment_0 ) ) )
            // InternalX21.g:1917:1: ( ( rule__ElementList__ElementsAssignment_0 ) )
            {
            // InternalX21.g:1917:1: ( ( rule__ElementList__ElementsAssignment_0 ) )
            // InternalX21.g:1918:2: ( rule__ElementList__ElementsAssignment_0 )
            {
             before(grammarAccess.getElementListAccess().getElementsAssignment_0()); 
            // InternalX21.g:1919:2: ( rule__ElementList__ElementsAssignment_0 )
            // InternalX21.g:1919:3: rule__ElementList__ElementsAssignment_0
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
    // InternalX21.g:1927:1: rule__ElementList__Group__1 : rule__ElementList__Group__1__Impl ;
    public final void rule__ElementList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1931:1: ( rule__ElementList__Group__1__Impl )
            // InternalX21.g:1932:2: rule__ElementList__Group__1__Impl
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
    // InternalX21.g:1938:1: rule__ElementList__Group__1__Impl : ( ( rule__ElementList__Group_1__0 )* ) ;
    public final void rule__ElementList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1942:1: ( ( ( rule__ElementList__Group_1__0 )* ) )
            // InternalX21.g:1943:1: ( ( rule__ElementList__Group_1__0 )* )
            {
            // InternalX21.g:1943:1: ( ( rule__ElementList__Group_1__0 )* )
            // InternalX21.g:1944:2: ( rule__ElementList__Group_1__0 )*
            {
             before(grammarAccess.getElementListAccess().getGroup_1()); 
            // InternalX21.g:1945:2: ( rule__ElementList__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalX21.g:1945:3: rule__ElementList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ElementList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalX21.g:1954:1: rule__ElementList__Group_1__0 : rule__ElementList__Group_1__0__Impl rule__ElementList__Group_1__1 ;
    public final void rule__ElementList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1958:1: ( rule__ElementList__Group_1__0__Impl rule__ElementList__Group_1__1 )
            // InternalX21.g:1959:2: rule__ElementList__Group_1__0__Impl rule__ElementList__Group_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalX21.g:1966:1: rule__ElementList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ElementList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1970:1: ( ( ',' ) )
            // InternalX21.g:1971:1: ( ',' )
            {
            // InternalX21.g:1971:1: ( ',' )
            // InternalX21.g:1972:2: ','
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
    // InternalX21.g:1981:1: rule__ElementList__Group_1__1 : rule__ElementList__Group_1__1__Impl ;
    public final void rule__ElementList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1985:1: ( rule__ElementList__Group_1__1__Impl )
            // InternalX21.g:1986:2: rule__ElementList__Group_1__1__Impl
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
    // InternalX21.g:1992:1: rule__ElementList__Group_1__1__Impl : ( ( rule__ElementList__ElementsAssignment_1_1 ) ) ;
    public final void rule__ElementList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1996:1: ( ( ( rule__ElementList__ElementsAssignment_1_1 ) ) )
            // InternalX21.g:1997:1: ( ( rule__ElementList__ElementsAssignment_1_1 ) )
            {
            // InternalX21.g:1997:1: ( ( rule__ElementList__ElementsAssignment_1_1 ) )
            // InternalX21.g:1998:2: ( rule__ElementList__ElementsAssignment_1_1 )
            {
             before(grammarAccess.getElementListAccess().getElementsAssignment_1_1()); 
            // InternalX21.g:1999:2: ( rule__ElementList__ElementsAssignment_1_1 )
            // InternalX21.g:1999:3: rule__ElementList__ElementsAssignment_1_1
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
    // InternalX21.g:2008:1: rule__Element__Group_0__0 : rule__Element__Group_0__0__Impl rule__Element__Group_0__1 ;
    public final void rule__Element__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2012:1: ( rule__Element__Group_0__0__Impl rule__Element__Group_0__1 )
            // InternalX21.g:2013:2: rule__Element__Group_0__0__Impl rule__Element__Group_0__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalX21.g:2020:1: rule__Element__Group_0__0__Impl : ( () ) ;
    public final void rule__Element__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2024:1: ( ( () ) )
            // InternalX21.g:2025:1: ( () )
            {
            // InternalX21.g:2025:1: ( () )
            // InternalX21.g:2026:2: ()
            {
             before(grammarAccess.getElementAccess().getNodeRefAction_0_0()); 
            // InternalX21.g:2027:2: ()
            // InternalX21.g:2027:3: 
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
    // InternalX21.g:2035:1: rule__Element__Group_0__1 : rule__Element__Group_0__1__Impl ;
    public final void rule__Element__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2039:1: ( rule__Element__Group_0__1__Impl )
            // InternalX21.g:2040:2: rule__Element__Group_0__1__Impl
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
    // InternalX21.g:2046:1: rule__Element__Group_0__1__Impl : ( ( rule__Element__RefAssignment_0_1 ) ) ;
    public final void rule__Element__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2050:1: ( ( ( rule__Element__RefAssignment_0_1 ) ) )
            // InternalX21.g:2051:1: ( ( rule__Element__RefAssignment_0_1 ) )
            {
            // InternalX21.g:2051:1: ( ( rule__Element__RefAssignment_0_1 ) )
            // InternalX21.g:2052:2: ( rule__Element__RefAssignment_0_1 )
            {
             before(grammarAccess.getElementAccess().getRefAssignment_0_1()); 
            // InternalX21.g:2053:2: ( rule__Element__RefAssignment_0_1 )
            // InternalX21.g:2053:3: rule__Element__RefAssignment_0_1
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
    // InternalX21.g:2062:1: rule__Element__Group_1__0 : rule__Element__Group_1__0__Impl rule__Element__Group_1__1 ;
    public final void rule__Element__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2066:1: ( rule__Element__Group_1__0__Impl rule__Element__Group_1__1 )
            // InternalX21.g:2067:2: rule__Element__Group_1__0__Impl rule__Element__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalX21.g:2074:1: rule__Element__Group_1__0__Impl : ( () ) ;
    public final void rule__Element__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2078:1: ( ( () ) )
            // InternalX21.g:2079:1: ( () )
            {
            // InternalX21.g:2079:1: ( () )
            // InternalX21.g:2080:2: ()
            {
             before(grammarAccess.getElementAccess().getAnonymousElementAction_1_0()); 
            // InternalX21.g:2081:2: ()
            // InternalX21.g:2081:3: 
            {
            }

             after(grammarAccess.getElementAccess().getAnonymousElementAction_1_0()); 

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
    // InternalX21.g:2089:1: rule__Element__Group_1__1 : rule__Element__Group_1__1__Impl ;
    public final void rule__Element__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2093:1: ( rule__Element__Group_1__1__Impl )
            // InternalX21.g:2094:2: rule__Element__Group_1__1__Impl
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
    // InternalX21.g:2100:1: rule__Element__Group_1__1__Impl : ( ( rule__Element__BodyAssignment_1_1 ) ) ;
    public final void rule__Element__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2104:1: ( ( ( rule__Element__BodyAssignment_1_1 ) ) )
            // InternalX21.g:2105:1: ( ( rule__Element__BodyAssignment_1_1 ) )
            {
            // InternalX21.g:2105:1: ( ( rule__Element__BodyAssignment_1_1 ) )
            // InternalX21.g:2106:2: ( rule__Element__BodyAssignment_1_1 )
            {
             before(grammarAccess.getElementAccess().getBodyAssignment_1_1()); 
            // InternalX21.g:2107:2: ( rule__Element__BodyAssignment_1_1 )
            // InternalX21.g:2107:3: rule__Element__BodyAssignment_1_1
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
    // InternalX21.g:2116:1: rule__Element__Group_2__0 : rule__Element__Group_2__0__Impl rule__Element__Group_2__1 ;
    public final void rule__Element__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2120:1: ( rule__Element__Group_2__0__Impl rule__Element__Group_2__1 )
            // InternalX21.g:2121:2: rule__Element__Group_2__0__Impl rule__Element__Group_2__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalX21.g:2128:1: rule__Element__Group_2__0__Impl : ( () ) ;
    public final void rule__Element__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2132:1: ( ( () ) )
            // InternalX21.g:2133:1: ( () )
            {
            // InternalX21.g:2133:1: ( () )
            // InternalX21.g:2134:2: ()
            {
             before(grammarAccess.getElementAccess().getOutputAction_2_0()); 
            // InternalX21.g:2135:2: ()
            // InternalX21.g:2135:3: 
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
    // InternalX21.g:2143:1: rule__Element__Group_2__1 : rule__Element__Group_2__1__Impl rule__Element__Group_2__2 ;
    public final void rule__Element__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2147:1: ( rule__Element__Group_2__1__Impl rule__Element__Group_2__2 )
            // InternalX21.g:2148:2: rule__Element__Group_2__1__Impl rule__Element__Group_2__2
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
    // InternalX21.g:2155:1: rule__Element__Group_2__1__Impl : ( 'output' ) ;
    public final void rule__Element__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2159:1: ( ( 'output' ) )
            // InternalX21.g:2160:1: ( 'output' )
            {
            // InternalX21.g:2160:1: ( 'output' )
            // InternalX21.g:2161:2: 'output'
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
    // InternalX21.g:2170:1: rule__Element__Group_2__2 : rule__Element__Group_2__2__Impl ;
    public final void rule__Element__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2174:1: ( rule__Element__Group_2__2__Impl )
            // InternalX21.g:2175:2: rule__Element__Group_2__2__Impl
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
    // InternalX21.g:2181:1: rule__Element__Group_2__2__Impl : ( ( rule__Element__NameAssignment_2_2 ) ) ;
    public final void rule__Element__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2185:1: ( ( ( rule__Element__NameAssignment_2_2 ) ) )
            // InternalX21.g:2186:1: ( ( rule__Element__NameAssignment_2_2 ) )
            {
            // InternalX21.g:2186:1: ( ( rule__Element__NameAssignment_2_2 ) )
            // InternalX21.g:2187:2: ( rule__Element__NameAssignment_2_2 )
            {
             before(grammarAccess.getElementAccess().getNameAssignment_2_2()); 
            // InternalX21.g:2188:2: ( rule__Element__NameAssignment_2_2 )
            // InternalX21.g:2188:3: rule__Element__NameAssignment_2_2
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
    // InternalX21.g:2197:1: rule__DataDecl__Group__0 : rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1 ;
    public final void rule__DataDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2201:1: ( rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1 )
            // InternalX21.g:2202:2: rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1
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
    // InternalX21.g:2209:1: rule__DataDecl__Group__0__Impl : ( 'data' ) ;
    public final void rule__DataDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2213:1: ( ( 'data' ) )
            // InternalX21.g:2214:1: ( 'data' )
            {
            // InternalX21.g:2214:1: ( 'data' )
            // InternalX21.g:2215:2: 'data'
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
    // InternalX21.g:2224:1: rule__DataDecl__Group__1 : rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2 ;
    public final void rule__DataDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2228:1: ( rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2 )
            // InternalX21.g:2229:2: rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2
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
    // InternalX21.g:2236:1: rule__DataDecl__Group__1__Impl : ( ( rule__DataDecl__NameAssignment_1 ) ) ;
    public final void rule__DataDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2240:1: ( ( ( rule__DataDecl__NameAssignment_1 ) ) )
            // InternalX21.g:2241:1: ( ( rule__DataDecl__NameAssignment_1 ) )
            {
            // InternalX21.g:2241:1: ( ( rule__DataDecl__NameAssignment_1 ) )
            // InternalX21.g:2242:2: ( rule__DataDecl__NameAssignment_1 )
            {
             before(grammarAccess.getDataDeclAccess().getNameAssignment_1()); 
            // InternalX21.g:2243:2: ( rule__DataDecl__NameAssignment_1 )
            // InternalX21.g:2243:3: rule__DataDecl__NameAssignment_1
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
    // InternalX21.g:2251:1: rule__DataDecl__Group__2 : rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3 ;
    public final void rule__DataDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2255:1: ( rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3 )
            // InternalX21.g:2256:2: rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3
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
    // InternalX21.g:2263:1: rule__DataDecl__Group__2__Impl : ( '{' ) ;
    public final void rule__DataDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2267:1: ( ( '{' ) )
            // InternalX21.g:2268:1: ( '{' )
            {
            // InternalX21.g:2268:1: ( '{' )
            // InternalX21.g:2269:2: '{'
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
    // InternalX21.g:2278:1: rule__DataDecl__Group__3 : rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4 ;
    public final void rule__DataDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2282:1: ( rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4 )
            // InternalX21.g:2283:2: rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalX21.g:2290:1: rule__DataDecl__Group__3__Impl : ( ( rule__DataDecl__VariablesAssignment_3 ) ) ;
    public final void rule__DataDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2294:1: ( ( ( rule__DataDecl__VariablesAssignment_3 ) ) )
            // InternalX21.g:2295:1: ( ( rule__DataDecl__VariablesAssignment_3 ) )
            {
            // InternalX21.g:2295:1: ( ( rule__DataDecl__VariablesAssignment_3 ) )
            // InternalX21.g:2296:2: ( rule__DataDecl__VariablesAssignment_3 )
            {
             before(grammarAccess.getDataDeclAccess().getVariablesAssignment_3()); 
            // InternalX21.g:2297:2: ( rule__DataDecl__VariablesAssignment_3 )
            // InternalX21.g:2297:3: rule__DataDecl__VariablesAssignment_3
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
    // InternalX21.g:2305:1: rule__DataDecl__Group__4 : rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5 ;
    public final void rule__DataDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2309:1: ( rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5 )
            // InternalX21.g:2310:2: rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalX21.g:2317:1: rule__DataDecl__Group__4__Impl : ( ( rule__DataDecl__Group_4__0 )* ) ;
    public final void rule__DataDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2321:1: ( ( ( rule__DataDecl__Group_4__0 )* ) )
            // InternalX21.g:2322:1: ( ( rule__DataDecl__Group_4__0 )* )
            {
            // InternalX21.g:2322:1: ( ( rule__DataDecl__Group_4__0 )* )
            // InternalX21.g:2323:2: ( rule__DataDecl__Group_4__0 )*
            {
             before(grammarAccess.getDataDeclAccess().getGroup_4()); 
            // InternalX21.g:2324:2: ( rule__DataDecl__Group_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalX21.g:2324:3: rule__DataDecl__Group_4__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__DataDecl__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalX21.g:2332:1: rule__DataDecl__Group__5 : rule__DataDecl__Group__5__Impl ;
    public final void rule__DataDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2336:1: ( rule__DataDecl__Group__5__Impl )
            // InternalX21.g:2337:2: rule__DataDecl__Group__5__Impl
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
    // InternalX21.g:2343:1: rule__DataDecl__Group__5__Impl : ( '}' ) ;
    public final void rule__DataDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2347:1: ( ( '}' ) )
            // InternalX21.g:2348:1: ( '}' )
            {
            // InternalX21.g:2348:1: ( '}' )
            // InternalX21.g:2349:2: '}'
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
    // InternalX21.g:2359:1: rule__DataDecl__Group_4__0 : rule__DataDecl__Group_4__0__Impl rule__DataDecl__Group_4__1 ;
    public final void rule__DataDecl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2363:1: ( rule__DataDecl__Group_4__0__Impl rule__DataDecl__Group_4__1 )
            // InternalX21.g:2364:2: rule__DataDecl__Group_4__0__Impl rule__DataDecl__Group_4__1
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
    // InternalX21.g:2371:1: rule__DataDecl__Group_4__0__Impl : ( ',' ) ;
    public final void rule__DataDecl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2375:1: ( ( ',' ) )
            // InternalX21.g:2376:1: ( ',' )
            {
            // InternalX21.g:2376:1: ( ',' )
            // InternalX21.g:2377:2: ','
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
    // InternalX21.g:2386:1: rule__DataDecl__Group_4__1 : rule__DataDecl__Group_4__1__Impl ;
    public final void rule__DataDecl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2390:1: ( rule__DataDecl__Group_4__1__Impl )
            // InternalX21.g:2391:2: rule__DataDecl__Group_4__1__Impl
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
    // InternalX21.g:2397:1: rule__DataDecl__Group_4__1__Impl : ( ( rule__DataDecl__VariablesAssignment_4_1 ) ) ;
    public final void rule__DataDecl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2401:1: ( ( ( rule__DataDecl__VariablesAssignment_4_1 ) ) )
            // InternalX21.g:2402:1: ( ( rule__DataDecl__VariablesAssignment_4_1 ) )
            {
            // InternalX21.g:2402:1: ( ( rule__DataDecl__VariablesAssignment_4_1 ) )
            // InternalX21.g:2403:2: ( rule__DataDecl__VariablesAssignment_4_1 )
            {
             before(grammarAccess.getDataDeclAccess().getVariablesAssignment_4_1()); 
            // InternalX21.g:2404:2: ( rule__DataDecl__VariablesAssignment_4_1 )
            // InternalX21.g:2404:3: rule__DataDecl__VariablesAssignment_4_1
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
    // InternalX21.g:2413:1: rule__DataVariable__Group__0 : rule__DataVariable__Group__0__Impl rule__DataVariable__Group__1 ;
    public final void rule__DataVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2417:1: ( rule__DataVariable__Group__0__Impl rule__DataVariable__Group__1 )
            // InternalX21.g:2418:2: rule__DataVariable__Group__0__Impl rule__DataVariable__Group__1
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
    // InternalX21.g:2425:1: rule__DataVariable__Group__0__Impl : ( ( rule__DataVariable__NameAssignment_0 ) ) ;
    public final void rule__DataVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2429:1: ( ( ( rule__DataVariable__NameAssignment_0 ) ) )
            // InternalX21.g:2430:1: ( ( rule__DataVariable__NameAssignment_0 ) )
            {
            // InternalX21.g:2430:1: ( ( rule__DataVariable__NameAssignment_0 ) )
            // InternalX21.g:2431:2: ( rule__DataVariable__NameAssignment_0 )
            {
             before(grammarAccess.getDataVariableAccess().getNameAssignment_0()); 
            // InternalX21.g:2432:2: ( rule__DataVariable__NameAssignment_0 )
            // InternalX21.g:2432:3: rule__DataVariable__NameAssignment_0
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
    // InternalX21.g:2440:1: rule__DataVariable__Group__1 : rule__DataVariable__Group__1__Impl rule__DataVariable__Group__2 ;
    public final void rule__DataVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2444:1: ( rule__DataVariable__Group__1__Impl rule__DataVariable__Group__2 )
            // InternalX21.g:2445:2: rule__DataVariable__Group__1__Impl rule__DataVariable__Group__2
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
    // InternalX21.g:2452:1: rule__DataVariable__Group__1__Impl : ( ':' ) ;
    public final void rule__DataVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2456:1: ( ( ':' ) )
            // InternalX21.g:2457:1: ( ':' )
            {
            // InternalX21.g:2457:1: ( ':' )
            // InternalX21.g:2458:2: ':'
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
    // InternalX21.g:2467:1: rule__DataVariable__Group__2 : rule__DataVariable__Group__2__Impl ;
    public final void rule__DataVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2471:1: ( rule__DataVariable__Group__2__Impl )
            // InternalX21.g:2472:2: rule__DataVariable__Group__2__Impl
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
    // InternalX21.g:2478:1: rule__DataVariable__Group__2__Impl : ( ( rule__DataVariable__TypeAssignment_2 ) ) ;
    public final void rule__DataVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2482:1: ( ( ( rule__DataVariable__TypeAssignment_2 ) ) )
            // InternalX21.g:2483:1: ( ( rule__DataVariable__TypeAssignment_2 ) )
            {
            // InternalX21.g:2483:1: ( ( rule__DataVariable__TypeAssignment_2 ) )
            // InternalX21.g:2484:2: ( rule__DataVariable__TypeAssignment_2 )
            {
             before(grammarAccess.getDataVariableAccess().getTypeAssignment_2()); 
            // InternalX21.g:2485:2: ( rule__DataVariable__TypeAssignment_2 )
            // InternalX21.g:2485:3: rule__DataVariable__TypeAssignment_2
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
    // InternalX21.g:2494:1: rule__Type__Group_0__0 : rule__Type__Group_0__0__Impl rule__Type__Group_0__1 ;
    public final void rule__Type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2498:1: ( rule__Type__Group_0__0__Impl rule__Type__Group_0__1 )
            // InternalX21.g:2499:2: rule__Type__Group_0__0__Impl rule__Type__Group_0__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalX21.g:2506:1: rule__Type__Group_0__0__Impl : ( () ) ;
    public final void rule__Type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2510:1: ( ( () ) )
            // InternalX21.g:2511:1: ( () )
            {
            // InternalX21.g:2511:1: ( () )
            // InternalX21.g:2512:2: ()
            {
             before(grammarAccess.getTypeAccess().getIntTypeAction_0_0()); 
            // InternalX21.g:2513:2: ()
            // InternalX21.g:2513:3: 
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
    // InternalX21.g:2521:1: rule__Type__Group_0__1 : rule__Type__Group_0__1__Impl ;
    public final void rule__Type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2525:1: ( rule__Type__Group_0__1__Impl )
            // InternalX21.g:2526:2: rule__Type__Group_0__1__Impl
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
    // InternalX21.g:2532:1: rule__Type__Group_0__1__Impl : ( 'int' ) ;
    public final void rule__Type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2536:1: ( ( 'int' ) )
            // InternalX21.g:2537:1: ( 'int' )
            {
            // InternalX21.g:2537:1: ( 'int' )
            // InternalX21.g:2538:2: 'int'
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
    // InternalX21.g:2548:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2552:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // InternalX21.g:2553:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalX21.g:2560:1: rule__Type__Group_1__0__Impl : ( () ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2564:1: ( ( () ) )
            // InternalX21.g:2565:1: ( () )
            {
            // InternalX21.g:2565:1: ( () )
            // InternalX21.g:2566:2: ()
            {
             before(grammarAccess.getTypeAccess().getStringTypeAction_1_0()); 
            // InternalX21.g:2567:2: ()
            // InternalX21.g:2567:3: 
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
    // InternalX21.g:2575:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2579:1: ( rule__Type__Group_1__1__Impl )
            // InternalX21.g:2580:2: rule__Type__Group_1__1__Impl
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
    // InternalX21.g:2586:1: rule__Type__Group_1__1__Impl : ( 'string' ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2590:1: ( ( 'string' ) )
            // InternalX21.g:2591:1: ( 'string' )
            {
            // InternalX21.g:2591:1: ( 'string' )
            // InternalX21.g:2592:2: 'string'
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
    // InternalX21.g:2602:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2606:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalX21.g:2607:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
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
    // InternalX21.g:2614:1: rule__Type__Group_2__0__Impl : ( () ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2618:1: ( ( () ) )
            // InternalX21.g:2619:1: ( () )
            {
            // InternalX21.g:2619:1: ( () )
            // InternalX21.g:2620:2: ()
            {
             before(grammarAccess.getTypeAccess().getCustomTypeAction_2_0()); 
            // InternalX21.g:2621:2: ()
            // InternalX21.g:2621:3: 
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
    // InternalX21.g:2629:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2633:1: ( rule__Type__Group_2__1__Impl )
            // InternalX21.g:2634:2: rule__Type__Group_2__1__Impl
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
    // InternalX21.g:2640:1: rule__Type__Group_2__1__Impl : ( ( rule__Type__DeclarationAssignment_2_1 ) ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2644:1: ( ( ( rule__Type__DeclarationAssignment_2_1 ) ) )
            // InternalX21.g:2645:1: ( ( rule__Type__DeclarationAssignment_2_1 ) )
            {
            // InternalX21.g:2645:1: ( ( rule__Type__DeclarationAssignment_2_1 ) )
            // InternalX21.g:2646:2: ( rule__Type__DeclarationAssignment_2_1 )
            {
             before(grammarAccess.getTypeAccess().getDeclarationAssignment_2_1()); 
            // InternalX21.g:2647:2: ( rule__Type__DeclarationAssignment_2_1 )
            // InternalX21.g:2647:3: rule__Type__DeclarationAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__DeclarationAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getDeclarationAssignment_2_1()); 

            }


            }

        }
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
    // InternalX21.g:2656:1: rule__LogicExp__Group__0 : rule__LogicExp__Group__0__Impl rule__LogicExp__Group__1 ;
    public final void rule__LogicExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2660:1: ( rule__LogicExp__Group__0__Impl rule__LogicExp__Group__1 )
            // InternalX21.g:2661:2: rule__LogicExp__Group__0__Impl rule__LogicExp__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalX21.g:2668:1: rule__LogicExp__Group__0__Impl : ( ruleExp ) ;
    public final void rule__LogicExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2672:1: ( ( ruleExp ) )
            // InternalX21.g:2673:1: ( ruleExp )
            {
            // InternalX21.g:2673:1: ( ruleExp )
            // InternalX21.g:2674:2: ruleExp
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
    // InternalX21.g:2683:1: rule__LogicExp__Group__1 : rule__LogicExp__Group__1__Impl rule__LogicExp__Group__2 ;
    public final void rule__LogicExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2687:1: ( rule__LogicExp__Group__1__Impl rule__LogicExp__Group__2 )
            // InternalX21.g:2688:2: rule__LogicExp__Group__1__Impl rule__LogicExp__Group__2
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
    // InternalX21.g:2695:1: rule__LogicExp__Group__1__Impl : ( ( rule__LogicExp__Alternatives_1 ) ) ;
    public final void rule__LogicExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2699:1: ( ( ( rule__LogicExp__Alternatives_1 ) ) )
            // InternalX21.g:2700:1: ( ( rule__LogicExp__Alternatives_1 ) )
            {
            // InternalX21.g:2700:1: ( ( rule__LogicExp__Alternatives_1 ) )
            // InternalX21.g:2701:2: ( rule__LogicExp__Alternatives_1 )
            {
             before(grammarAccess.getLogicExpAccess().getAlternatives_1()); 
            // InternalX21.g:2702:2: ( rule__LogicExp__Alternatives_1 )
            // InternalX21.g:2702:3: rule__LogicExp__Alternatives_1
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
    // InternalX21.g:2710:1: rule__LogicExp__Group__2 : rule__LogicExp__Group__2__Impl ;
    public final void rule__LogicExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2714:1: ( rule__LogicExp__Group__2__Impl )
            // InternalX21.g:2715:2: rule__LogicExp__Group__2__Impl
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
    // InternalX21.g:2721:1: rule__LogicExp__Group__2__Impl : ( ( rule__LogicExp__RightAssignment_2 ) ) ;
    public final void rule__LogicExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2725:1: ( ( ( rule__LogicExp__RightAssignment_2 ) ) )
            // InternalX21.g:2726:1: ( ( rule__LogicExp__RightAssignment_2 ) )
            {
            // InternalX21.g:2726:1: ( ( rule__LogicExp__RightAssignment_2 ) )
            // InternalX21.g:2727:2: ( rule__LogicExp__RightAssignment_2 )
            {
             before(grammarAccess.getLogicExpAccess().getRightAssignment_2()); 
            // InternalX21.g:2728:2: ( rule__LogicExp__RightAssignment_2 )
            // InternalX21.g:2728:3: rule__LogicExp__RightAssignment_2
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
    // InternalX21.g:2737:1: rule__LogicExp__Group_1_0__0 : rule__LogicExp__Group_1_0__0__Impl rule__LogicExp__Group_1_0__1 ;
    public final void rule__LogicExp__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2741:1: ( rule__LogicExp__Group_1_0__0__Impl rule__LogicExp__Group_1_0__1 )
            // InternalX21.g:2742:2: rule__LogicExp__Group_1_0__0__Impl rule__LogicExp__Group_1_0__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalX21.g:2749:1: rule__LogicExp__Group_1_0__0__Impl : ( () ) ;
    public final void rule__LogicExp__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2753:1: ( ( () ) )
            // InternalX21.g:2754:1: ( () )
            {
            // InternalX21.g:2754:1: ( () )
            // InternalX21.g:2755:2: ()
            {
             before(grammarAccess.getLogicExpAccess().getEqualsLeftAction_1_0_0()); 
            // InternalX21.g:2756:2: ()
            // InternalX21.g:2756:3: 
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
    // InternalX21.g:2764:1: rule__LogicExp__Group_1_0__1 : rule__LogicExp__Group_1_0__1__Impl ;
    public final void rule__LogicExp__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2768:1: ( rule__LogicExp__Group_1_0__1__Impl )
            // InternalX21.g:2769:2: rule__LogicExp__Group_1_0__1__Impl
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
    // InternalX21.g:2775:1: rule__LogicExp__Group_1_0__1__Impl : ( '=' ) ;
    public final void rule__LogicExp__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2779:1: ( ( '=' ) )
            // InternalX21.g:2780:1: ( '=' )
            {
            // InternalX21.g:2780:1: ( '=' )
            // InternalX21.g:2781:2: '='
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
    // InternalX21.g:2791:1: rule__LogicExp__Group_1_1__0 : rule__LogicExp__Group_1_1__0__Impl rule__LogicExp__Group_1_1__1 ;
    public final void rule__LogicExp__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2795:1: ( rule__LogicExp__Group_1_1__0__Impl rule__LogicExp__Group_1_1__1 )
            // InternalX21.g:2796:2: rule__LogicExp__Group_1_1__0__Impl rule__LogicExp__Group_1_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalX21.g:2803:1: rule__LogicExp__Group_1_1__0__Impl : ( () ) ;
    public final void rule__LogicExp__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2807:1: ( ( () ) )
            // InternalX21.g:2808:1: ( () )
            {
            // InternalX21.g:2808:1: ( () )
            // InternalX21.g:2809:2: ()
            {
             before(grammarAccess.getLogicExpAccess().getLessThanLeftAction_1_1_0()); 
            // InternalX21.g:2810:2: ()
            // InternalX21.g:2810:3: 
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
    // InternalX21.g:2818:1: rule__LogicExp__Group_1_1__1 : rule__LogicExp__Group_1_1__1__Impl ;
    public final void rule__LogicExp__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2822:1: ( rule__LogicExp__Group_1_1__1__Impl )
            // InternalX21.g:2823:2: rule__LogicExp__Group_1_1__1__Impl
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
    // InternalX21.g:2829:1: rule__LogicExp__Group_1_1__1__Impl : ( '<' ) ;
    public final void rule__LogicExp__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2833:1: ( ( '<' ) )
            // InternalX21.g:2834:1: ( '<' )
            {
            // InternalX21.g:2834:1: ( '<' )
            // InternalX21.g:2835:2: '<'
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
    // InternalX21.g:2845:1: rule__LogicExp__Group_1_2__0 : rule__LogicExp__Group_1_2__0__Impl rule__LogicExp__Group_1_2__1 ;
    public final void rule__LogicExp__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2849:1: ( rule__LogicExp__Group_1_2__0__Impl rule__LogicExp__Group_1_2__1 )
            // InternalX21.g:2850:2: rule__LogicExp__Group_1_2__0__Impl rule__LogicExp__Group_1_2__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalX21.g:2857:1: rule__LogicExp__Group_1_2__0__Impl : ( () ) ;
    public final void rule__LogicExp__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2861:1: ( ( () ) )
            // InternalX21.g:2862:1: ( () )
            {
            // InternalX21.g:2862:1: ( () )
            // InternalX21.g:2863:2: ()
            {
             before(grammarAccess.getLogicExpAccess().getGreaterThanLeftAction_1_2_0()); 
            // InternalX21.g:2864:2: ()
            // InternalX21.g:2864:3: 
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
    // InternalX21.g:2872:1: rule__LogicExp__Group_1_2__1 : rule__LogicExp__Group_1_2__1__Impl ;
    public final void rule__LogicExp__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2876:1: ( rule__LogicExp__Group_1_2__1__Impl )
            // InternalX21.g:2877:2: rule__LogicExp__Group_1_2__1__Impl
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
    // InternalX21.g:2883:1: rule__LogicExp__Group_1_2__1__Impl : ( '>' ) ;
    public final void rule__LogicExp__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2887:1: ( ( '>' ) )
            // InternalX21.g:2888:1: ( '>' )
            {
            // InternalX21.g:2888:1: ( '>' )
            // InternalX21.g:2889:2: '>'
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
    // InternalX21.g:2899:1: rule__LogicExp__Group_1_3__0 : rule__LogicExp__Group_1_3__0__Impl rule__LogicExp__Group_1_3__1 ;
    public final void rule__LogicExp__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2903:1: ( rule__LogicExp__Group_1_3__0__Impl rule__LogicExp__Group_1_3__1 )
            // InternalX21.g:2904:2: rule__LogicExp__Group_1_3__0__Impl rule__LogicExp__Group_1_3__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalX21.g:2911:1: rule__LogicExp__Group_1_3__0__Impl : ( () ) ;
    public final void rule__LogicExp__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2915:1: ( ( () ) )
            // InternalX21.g:2916:1: ( () )
            {
            // InternalX21.g:2916:1: ( () )
            // InternalX21.g:2917:2: ()
            {
             before(grammarAccess.getLogicExpAccess().getLessThanOrEqualsLeftAction_1_3_0()); 
            // InternalX21.g:2918:2: ()
            // InternalX21.g:2918:3: 
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
    // InternalX21.g:2926:1: rule__LogicExp__Group_1_3__1 : rule__LogicExp__Group_1_3__1__Impl ;
    public final void rule__LogicExp__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2930:1: ( rule__LogicExp__Group_1_3__1__Impl )
            // InternalX21.g:2931:2: rule__LogicExp__Group_1_3__1__Impl
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
    // InternalX21.g:2937:1: rule__LogicExp__Group_1_3__1__Impl : ( '<=' ) ;
    public final void rule__LogicExp__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2941:1: ( ( '<=' ) )
            // InternalX21.g:2942:1: ( '<=' )
            {
            // InternalX21.g:2942:1: ( '<=' )
            // InternalX21.g:2943:2: '<='
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
    // InternalX21.g:2953:1: rule__LogicExp__Group_1_4__0 : rule__LogicExp__Group_1_4__0__Impl rule__LogicExp__Group_1_4__1 ;
    public final void rule__LogicExp__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2957:1: ( rule__LogicExp__Group_1_4__0__Impl rule__LogicExp__Group_1_4__1 )
            // InternalX21.g:2958:2: rule__LogicExp__Group_1_4__0__Impl rule__LogicExp__Group_1_4__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalX21.g:2965:1: rule__LogicExp__Group_1_4__0__Impl : ( () ) ;
    public final void rule__LogicExp__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2969:1: ( ( () ) )
            // InternalX21.g:2970:1: ( () )
            {
            // InternalX21.g:2970:1: ( () )
            // InternalX21.g:2971:2: ()
            {
             before(grammarAccess.getLogicExpAccess().getGreaterThanOrEqualsLeftAction_1_4_0()); 
            // InternalX21.g:2972:2: ()
            // InternalX21.g:2972:3: 
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
    // InternalX21.g:2980:1: rule__LogicExp__Group_1_4__1 : rule__LogicExp__Group_1_4__1__Impl ;
    public final void rule__LogicExp__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2984:1: ( rule__LogicExp__Group_1_4__1__Impl )
            // InternalX21.g:2985:2: rule__LogicExp__Group_1_4__1__Impl
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
    // InternalX21.g:2991:1: rule__LogicExp__Group_1_4__1__Impl : ( '>=' ) ;
    public final void rule__LogicExp__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2995:1: ( ( '>=' ) )
            // InternalX21.g:2996:1: ( '>=' )
            {
            // InternalX21.g:2996:1: ( '>=' )
            // InternalX21.g:2997:2: '>='
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
    // InternalX21.g:3007:1: rule__Exp__Group__0 : rule__Exp__Group__0__Impl rule__Exp__Group__1 ;
    public final void rule__Exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3011:1: ( rule__Exp__Group__0__Impl rule__Exp__Group__1 )
            // InternalX21.g:3012:2: rule__Exp__Group__0__Impl rule__Exp__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalX21.g:3019:1: rule__Exp__Group__0__Impl : ( ruleMulDiv ) ;
    public final void rule__Exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3023:1: ( ( ruleMulDiv ) )
            // InternalX21.g:3024:1: ( ruleMulDiv )
            {
            // InternalX21.g:3024:1: ( ruleMulDiv )
            // InternalX21.g:3025:2: ruleMulDiv
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
    // InternalX21.g:3034:1: rule__Exp__Group__1 : rule__Exp__Group__1__Impl ;
    public final void rule__Exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3038:1: ( rule__Exp__Group__1__Impl )
            // InternalX21.g:3039:2: rule__Exp__Group__1__Impl
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
    // InternalX21.g:3045:1: rule__Exp__Group__1__Impl : ( ( rule__Exp__Group_1__0 )* ) ;
    public final void rule__Exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3049:1: ( ( ( rule__Exp__Group_1__0 )* ) )
            // InternalX21.g:3050:1: ( ( rule__Exp__Group_1__0 )* )
            {
            // InternalX21.g:3050:1: ( ( rule__Exp__Group_1__0 )* )
            // InternalX21.g:3051:2: ( rule__Exp__Group_1__0 )*
            {
             before(grammarAccess.getExpAccess().getGroup_1()); 
            // InternalX21.g:3052:2: ( rule__Exp__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_INT)||LA14_0==15||LA14_0==35||LA14_0==38||(LA14_0>=42 && LA14_0<=43)||LA14_0==46) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalX21.g:3052:3: rule__Exp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Exp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalX21.g:3061:1: rule__Exp__Group_1__0 : rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 ;
    public final void rule__Exp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3065:1: ( rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 )
            // InternalX21.g:3066:2: rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1
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
    // InternalX21.g:3073:1: rule__Exp__Group_1__0__Impl : ( ( rule__Exp__Alternatives_1_0 ) ) ;
    public final void rule__Exp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3077:1: ( ( ( rule__Exp__Alternatives_1_0 ) ) )
            // InternalX21.g:3078:1: ( ( rule__Exp__Alternatives_1_0 ) )
            {
            // InternalX21.g:3078:1: ( ( rule__Exp__Alternatives_1_0 ) )
            // InternalX21.g:3079:2: ( rule__Exp__Alternatives_1_0 )
            {
             before(grammarAccess.getExpAccess().getAlternatives_1_0()); 
            // InternalX21.g:3080:2: ( rule__Exp__Alternatives_1_0 )
            // InternalX21.g:3080:3: rule__Exp__Alternatives_1_0
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
    // InternalX21.g:3088:1: rule__Exp__Group_1__1 : rule__Exp__Group_1__1__Impl ;
    public final void rule__Exp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3092:1: ( rule__Exp__Group_1__1__Impl )
            // InternalX21.g:3093:2: rule__Exp__Group_1__1__Impl
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
    // InternalX21.g:3099:1: rule__Exp__Group_1__1__Impl : ( ( rule__Exp__RightAssignment_1_1 ) ) ;
    public final void rule__Exp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3103:1: ( ( ( rule__Exp__RightAssignment_1_1 ) ) )
            // InternalX21.g:3104:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            {
            // InternalX21.g:3104:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            // InternalX21.g:3105:2: ( rule__Exp__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpAccess().getRightAssignment_1_1()); 
            // InternalX21.g:3106:2: ( rule__Exp__RightAssignment_1_1 )
            // InternalX21.g:3106:3: rule__Exp__RightAssignment_1_1
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
    // InternalX21.g:3115:1: rule__Exp__Group_1_0_0__0 : rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1 ;
    public final void rule__Exp__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3119:1: ( rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1 )
            // InternalX21.g:3120:2: rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalX21.g:3127:1: rule__Exp__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3131:1: ( ( () ) )
            // InternalX21.g:3132:1: ( () )
            {
            // InternalX21.g:3132:1: ( () )
            // InternalX21.g:3133:2: ()
            {
             before(grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalX21.g:3134:2: ()
            // InternalX21.g:3134:3: 
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
    // InternalX21.g:3142:1: rule__Exp__Group_1_0_0__1 : rule__Exp__Group_1_0_0__1__Impl ;
    public final void rule__Exp__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3146:1: ( rule__Exp__Group_1_0_0__1__Impl )
            // InternalX21.g:3147:2: rule__Exp__Group_1_0_0__1__Impl
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
    // InternalX21.g:3153:1: rule__Exp__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Exp__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3157:1: ( ( '+' ) )
            // InternalX21.g:3158:1: ( '+' )
            {
            // InternalX21.g:3158:1: ( '+' )
            // InternalX21.g:3159:2: '+'
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
    // InternalX21.g:3169:1: rule__MulDiv__Group__0 : rule__MulDiv__Group__0__Impl rule__MulDiv__Group__1 ;
    public final void rule__MulDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3173:1: ( rule__MulDiv__Group__0__Impl rule__MulDiv__Group__1 )
            // InternalX21.g:3174:2: rule__MulDiv__Group__0__Impl rule__MulDiv__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalX21.g:3181:1: rule__MulDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3185:1: ( ( rulePrimary ) )
            // InternalX21.g:3186:1: ( rulePrimary )
            {
            // InternalX21.g:3186:1: ( rulePrimary )
            // InternalX21.g:3187:2: rulePrimary
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
    // InternalX21.g:3196:1: rule__MulDiv__Group__1 : rule__MulDiv__Group__1__Impl ;
    public final void rule__MulDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3200:1: ( rule__MulDiv__Group__1__Impl )
            // InternalX21.g:3201:2: rule__MulDiv__Group__1__Impl
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
    // InternalX21.g:3207:1: rule__MulDiv__Group__1__Impl : ( ( rule__MulDiv__Group_1__0 )* ) ;
    public final void rule__MulDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3211:1: ( ( ( rule__MulDiv__Group_1__0 )* ) )
            // InternalX21.g:3212:1: ( ( rule__MulDiv__Group_1__0 )* )
            {
            // InternalX21.g:3212:1: ( ( rule__MulDiv__Group_1__0 )* )
            // InternalX21.g:3213:2: ( rule__MulDiv__Group_1__0 )*
            {
             before(grammarAccess.getMulDivAccess().getGroup_1()); 
            // InternalX21.g:3214:2: ( rule__MulDiv__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=36 && LA15_0<=37)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalX21.g:3214:3: rule__MulDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__MulDiv__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalX21.g:3223:1: rule__MulDiv__Group_1__0 : rule__MulDiv__Group_1__0__Impl rule__MulDiv__Group_1__1 ;
    public final void rule__MulDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3227:1: ( rule__MulDiv__Group_1__0__Impl rule__MulDiv__Group_1__1 )
            // InternalX21.g:3228:2: rule__MulDiv__Group_1__0__Impl rule__MulDiv__Group_1__1
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
    // InternalX21.g:3235:1: rule__MulDiv__Group_1__0__Impl : ( ( rule__MulDiv__Alternatives_1_0 ) ) ;
    public final void rule__MulDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3239:1: ( ( ( rule__MulDiv__Alternatives_1_0 ) ) )
            // InternalX21.g:3240:1: ( ( rule__MulDiv__Alternatives_1_0 ) )
            {
            // InternalX21.g:3240:1: ( ( rule__MulDiv__Alternatives_1_0 ) )
            // InternalX21.g:3241:2: ( rule__MulDiv__Alternatives_1_0 )
            {
             before(grammarAccess.getMulDivAccess().getAlternatives_1_0()); 
            // InternalX21.g:3242:2: ( rule__MulDiv__Alternatives_1_0 )
            // InternalX21.g:3242:3: rule__MulDiv__Alternatives_1_0
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
    // InternalX21.g:3250:1: rule__MulDiv__Group_1__1 : rule__MulDiv__Group_1__1__Impl ;
    public final void rule__MulDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3254:1: ( rule__MulDiv__Group_1__1__Impl )
            // InternalX21.g:3255:2: rule__MulDiv__Group_1__1__Impl
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
    // InternalX21.g:3261:1: rule__MulDiv__Group_1__1__Impl : ( ( rule__MulDiv__RightAssignment_1_1 ) ) ;
    public final void rule__MulDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3265:1: ( ( ( rule__MulDiv__RightAssignment_1_1 ) ) )
            // InternalX21.g:3266:1: ( ( rule__MulDiv__RightAssignment_1_1 ) )
            {
            // InternalX21.g:3266:1: ( ( rule__MulDiv__RightAssignment_1_1 ) )
            // InternalX21.g:3267:2: ( rule__MulDiv__RightAssignment_1_1 )
            {
             before(grammarAccess.getMulDivAccess().getRightAssignment_1_1()); 
            // InternalX21.g:3268:2: ( rule__MulDiv__RightAssignment_1_1 )
            // InternalX21.g:3268:3: rule__MulDiv__RightAssignment_1_1
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
    // InternalX21.g:3277:1: rule__MulDiv__Group_1_0_0__0 : rule__MulDiv__Group_1_0_0__0__Impl rule__MulDiv__Group_1_0_0__1 ;
    public final void rule__MulDiv__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3281:1: ( rule__MulDiv__Group_1_0_0__0__Impl rule__MulDiv__Group_1_0_0__1 )
            // InternalX21.g:3282:2: rule__MulDiv__Group_1_0_0__0__Impl rule__MulDiv__Group_1_0_0__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalX21.g:3289:1: rule__MulDiv__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MulDiv__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3293:1: ( ( () ) )
            // InternalX21.g:3294:1: ( () )
            {
            // InternalX21.g:3294:1: ( () )
            // InternalX21.g:3295:2: ()
            {
             before(grammarAccess.getMulDivAccess().getMulLeftAction_1_0_0_0()); 
            // InternalX21.g:3296:2: ()
            // InternalX21.g:3296:3: 
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
    // InternalX21.g:3304:1: rule__MulDiv__Group_1_0_0__1 : rule__MulDiv__Group_1_0_0__1__Impl ;
    public final void rule__MulDiv__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3308:1: ( rule__MulDiv__Group_1_0_0__1__Impl )
            // InternalX21.g:3309:2: rule__MulDiv__Group_1_0_0__1__Impl
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
    // InternalX21.g:3315:1: rule__MulDiv__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__MulDiv__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3319:1: ( ( '*' ) )
            // InternalX21.g:3320:1: ( '*' )
            {
            // InternalX21.g:3320:1: ( '*' )
            // InternalX21.g:3321:2: '*'
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
    // InternalX21.g:3331:1: rule__MulDiv__Group_1_0_1__0 : rule__MulDiv__Group_1_0_1__0__Impl rule__MulDiv__Group_1_0_1__1 ;
    public final void rule__MulDiv__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3335:1: ( rule__MulDiv__Group_1_0_1__0__Impl rule__MulDiv__Group_1_0_1__1 )
            // InternalX21.g:3336:2: rule__MulDiv__Group_1_0_1__0__Impl rule__MulDiv__Group_1_0_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalX21.g:3343:1: rule__MulDiv__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__MulDiv__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3347:1: ( ( () ) )
            // InternalX21.g:3348:1: ( () )
            {
            // InternalX21.g:3348:1: ( () )
            // InternalX21.g:3349:2: ()
            {
             before(grammarAccess.getMulDivAccess().getDivLeftAction_1_0_1_0()); 
            // InternalX21.g:3350:2: ()
            // InternalX21.g:3350:3: 
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
    // InternalX21.g:3358:1: rule__MulDiv__Group_1_0_1__1 : rule__MulDiv__Group_1_0_1__1__Impl ;
    public final void rule__MulDiv__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3362:1: ( rule__MulDiv__Group_1_0_1__1__Impl )
            // InternalX21.g:3363:2: rule__MulDiv__Group_1_0_1__1__Impl
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
    // InternalX21.g:3369:1: rule__MulDiv__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__MulDiv__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3373:1: ( ( '/' ) )
            // InternalX21.g:3374:1: ( '/' )
            {
            // InternalX21.g:3374:1: ( '/' )
            // InternalX21.g:3375:2: '/'
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
    // InternalX21.g:3385:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3389:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalX21.g:3390:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalX21.g:3397:1: rule__Primary__Group_0__0__Impl : ( () ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3401:1: ( ( () ) )
            // InternalX21.g:3402:1: ( () )
            {
            // InternalX21.g:3402:1: ( () )
            // InternalX21.g:3403:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getIntAction_0_0()); 
            // InternalX21.g:3404:2: ()
            // InternalX21.g:3404:3: 
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
    // InternalX21.g:3412:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3416:1: ( rule__Primary__Group_0__1__Impl )
            // InternalX21.g:3417:2: rule__Primary__Group_0__1__Impl
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
    // InternalX21.g:3423:1: rule__Primary__Group_0__1__Impl : ( ( rule__Primary__ValueAssignment_0_1 ) ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3427:1: ( ( ( rule__Primary__ValueAssignment_0_1 ) ) )
            // InternalX21.g:3428:1: ( ( rule__Primary__ValueAssignment_0_1 ) )
            {
            // InternalX21.g:3428:1: ( ( rule__Primary__ValueAssignment_0_1 ) )
            // InternalX21.g:3429:2: ( rule__Primary__ValueAssignment_0_1 )
            {
             before(grammarAccess.getPrimaryAccess().getValueAssignment_0_1()); 
            // InternalX21.g:3430:2: ( rule__Primary__ValueAssignment_0_1 )
            // InternalX21.g:3430:3: rule__Primary__ValueAssignment_0_1
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
    // InternalX21.g:3439:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3443:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalX21.g:3444:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
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
    // InternalX21.g:3451:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3455:1: ( ( () ) )
            // InternalX21.g:3456:1: ( () )
            {
            // InternalX21.g:3456:1: ( () )
            // InternalX21.g:3457:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getParenthesisAction_1_0()); 
            // InternalX21.g:3458:2: ()
            // InternalX21.g:3458:3: 
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
    // InternalX21.g:3466:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3470:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalX21.g:3471:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
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
    // InternalX21.g:3478:1: rule__Primary__Group_1__1__Impl : ( '(' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3482:1: ( ( '(' ) )
            // InternalX21.g:3483:1: ( '(' )
            {
            // InternalX21.g:3483:1: ( '(' )
            // InternalX21.g:3484:2: '('
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
    // InternalX21.g:3493:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl rule__Primary__Group_1__3 ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3497:1: ( rule__Primary__Group_1__2__Impl rule__Primary__Group_1__3 )
            // InternalX21.g:3498:2: rule__Primary__Group_1__2__Impl rule__Primary__Group_1__3
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
    // InternalX21.g:3505:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__BodyAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3509:1: ( ( ( rule__Primary__BodyAssignment_1_2 ) ) )
            // InternalX21.g:3510:1: ( ( rule__Primary__BodyAssignment_1_2 ) )
            {
            // InternalX21.g:3510:1: ( ( rule__Primary__BodyAssignment_1_2 ) )
            // InternalX21.g:3511:2: ( rule__Primary__BodyAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getBodyAssignment_1_2()); 
            // InternalX21.g:3512:2: ( rule__Primary__BodyAssignment_1_2 )
            // InternalX21.g:3512:3: rule__Primary__BodyAssignment_1_2
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
    // InternalX21.g:3520:1: rule__Primary__Group_1__3 : rule__Primary__Group_1__3__Impl ;
    public final void rule__Primary__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3524:1: ( rule__Primary__Group_1__3__Impl )
            // InternalX21.g:3525:2: rule__Primary__Group_1__3__Impl
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
    // InternalX21.g:3531:1: rule__Primary__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Primary__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3535:1: ( ( ')' ) )
            // InternalX21.g:3536:1: ( ')' )
            {
            // InternalX21.g:3536:1: ( ')' )
            // InternalX21.g:3537:2: ')'
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
    // InternalX21.g:3547:1: rule__LetStatement__Group__0 : rule__LetStatement__Group__0__Impl rule__LetStatement__Group__1 ;
    public final void rule__LetStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3551:1: ( rule__LetStatement__Group__0__Impl rule__LetStatement__Group__1 )
            // InternalX21.g:3552:2: rule__LetStatement__Group__0__Impl rule__LetStatement__Group__1
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
    // InternalX21.g:3559:1: rule__LetStatement__Group__0__Impl : ( 'let' ) ;
    public final void rule__LetStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3563:1: ( ( 'let' ) )
            // InternalX21.g:3564:1: ( 'let' )
            {
            // InternalX21.g:3564:1: ( 'let' )
            // InternalX21.g:3565:2: 'let'
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
    // InternalX21.g:3574:1: rule__LetStatement__Group__1 : rule__LetStatement__Group__1__Impl rule__LetStatement__Group__2 ;
    public final void rule__LetStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3578:1: ( rule__LetStatement__Group__1__Impl rule__LetStatement__Group__2 )
            // InternalX21.g:3579:2: rule__LetStatement__Group__1__Impl rule__LetStatement__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalX21.g:3586:1: rule__LetStatement__Group__1__Impl : ( ( rule__LetStatement__NameAssignment_1 ) ) ;
    public final void rule__LetStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3590:1: ( ( ( rule__LetStatement__NameAssignment_1 ) ) )
            // InternalX21.g:3591:1: ( ( rule__LetStatement__NameAssignment_1 ) )
            {
            // InternalX21.g:3591:1: ( ( rule__LetStatement__NameAssignment_1 ) )
            // InternalX21.g:3592:2: ( rule__LetStatement__NameAssignment_1 )
            {
             before(grammarAccess.getLetStatementAccess().getNameAssignment_1()); 
            // InternalX21.g:3593:2: ( rule__LetStatement__NameAssignment_1 )
            // InternalX21.g:3593:3: rule__LetStatement__NameAssignment_1
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
    // InternalX21.g:3601:1: rule__LetStatement__Group__2 : rule__LetStatement__Group__2__Impl rule__LetStatement__Group__3 ;
    public final void rule__LetStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3605:1: ( rule__LetStatement__Group__2__Impl rule__LetStatement__Group__3 )
            // InternalX21.g:3606:2: rule__LetStatement__Group__2__Impl rule__LetStatement__Group__3
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
    // InternalX21.g:3613:1: rule__LetStatement__Group__2__Impl : ( '=' ) ;
    public final void rule__LetStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3617:1: ( ( '=' ) )
            // InternalX21.g:3618:1: ( '=' )
            {
            // InternalX21.g:3618:1: ( '=' )
            // InternalX21.g:3619:2: '='
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
    // InternalX21.g:3628:1: rule__LetStatement__Group__3 : rule__LetStatement__Group__3__Impl rule__LetStatement__Group__4 ;
    public final void rule__LetStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3632:1: ( rule__LetStatement__Group__3__Impl rule__LetStatement__Group__4 )
            // InternalX21.g:3633:2: rule__LetStatement__Group__3__Impl rule__LetStatement__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalX21.g:3640:1: rule__LetStatement__Group__3__Impl : ( ( rule__LetStatement__ValueAssignment_3 ) ) ;
    public final void rule__LetStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3644:1: ( ( ( rule__LetStatement__ValueAssignment_3 ) ) )
            // InternalX21.g:3645:1: ( ( rule__LetStatement__ValueAssignment_3 ) )
            {
            // InternalX21.g:3645:1: ( ( rule__LetStatement__ValueAssignment_3 ) )
            // InternalX21.g:3646:2: ( rule__LetStatement__ValueAssignment_3 )
            {
             before(grammarAccess.getLetStatementAccess().getValueAssignment_3()); 
            // InternalX21.g:3647:2: ( rule__LetStatement__ValueAssignment_3 )
            // InternalX21.g:3647:3: rule__LetStatement__ValueAssignment_3
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
    // InternalX21.g:3655:1: rule__LetStatement__Group__4 : rule__LetStatement__Group__4__Impl rule__LetStatement__Group__5 ;
    public final void rule__LetStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3659:1: ( rule__LetStatement__Group__4__Impl rule__LetStatement__Group__5 )
            // InternalX21.g:3660:2: rule__LetStatement__Group__4__Impl rule__LetStatement__Group__5
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
    // InternalX21.g:3667:1: rule__LetStatement__Group__4__Impl : ( 'in' ) ;
    public final void rule__LetStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3671:1: ( ( 'in' ) )
            // InternalX21.g:3672:1: ( 'in' )
            {
            // InternalX21.g:3672:1: ( 'in' )
            // InternalX21.g:3673:2: 'in'
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
    // InternalX21.g:3682:1: rule__LetStatement__Group__5 : rule__LetStatement__Group__5__Impl rule__LetStatement__Group__6 ;
    public final void rule__LetStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3686:1: ( rule__LetStatement__Group__5__Impl rule__LetStatement__Group__6 )
            // InternalX21.g:3687:2: rule__LetStatement__Group__5__Impl rule__LetStatement__Group__6
            {
            pushFollow(FOLLOW_37);
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
    // InternalX21.g:3694:1: rule__LetStatement__Group__5__Impl : ( ( rule__LetStatement__BodyAssignment_5 ) ) ;
    public final void rule__LetStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3698:1: ( ( ( rule__LetStatement__BodyAssignment_5 ) ) )
            // InternalX21.g:3699:1: ( ( rule__LetStatement__BodyAssignment_5 ) )
            {
            // InternalX21.g:3699:1: ( ( rule__LetStatement__BodyAssignment_5 ) )
            // InternalX21.g:3700:2: ( rule__LetStatement__BodyAssignment_5 )
            {
             before(grammarAccess.getLetStatementAccess().getBodyAssignment_5()); 
            // InternalX21.g:3701:2: ( rule__LetStatement__BodyAssignment_5 )
            // InternalX21.g:3701:3: rule__LetStatement__BodyAssignment_5
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
    // InternalX21.g:3709:1: rule__LetStatement__Group__6 : rule__LetStatement__Group__6__Impl ;
    public final void rule__LetStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3713:1: ( rule__LetStatement__Group__6__Impl )
            // InternalX21.g:3714:2: rule__LetStatement__Group__6__Impl
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
    // InternalX21.g:3720:1: rule__LetStatement__Group__6__Impl : ( 'end' ) ;
    public final void rule__LetStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3724:1: ( ( 'end' ) )
            // InternalX21.g:3725:1: ( 'end' )
            {
            // InternalX21.g:3725:1: ( 'end' )
            // InternalX21.g:3726:2: 'end'
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
    // InternalX21.g:3736:1: rule__DataAccess__Group__0 : rule__DataAccess__Group__0__Impl rule__DataAccess__Group__1 ;
    public final void rule__DataAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3740:1: ( rule__DataAccess__Group__0__Impl rule__DataAccess__Group__1 )
            // InternalX21.g:3741:2: rule__DataAccess__Group__0__Impl rule__DataAccess__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalX21.g:3748:1: rule__DataAccess__Group__0__Impl : ( ( rule__DataAccess__RefAssignment_0 ) ) ;
    public final void rule__DataAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3752:1: ( ( ( rule__DataAccess__RefAssignment_0 ) ) )
            // InternalX21.g:3753:1: ( ( rule__DataAccess__RefAssignment_0 ) )
            {
            // InternalX21.g:3753:1: ( ( rule__DataAccess__RefAssignment_0 ) )
            // InternalX21.g:3754:2: ( rule__DataAccess__RefAssignment_0 )
            {
             before(grammarAccess.getDataAccessAccess().getRefAssignment_0()); 
            // InternalX21.g:3755:2: ( rule__DataAccess__RefAssignment_0 )
            // InternalX21.g:3755:3: rule__DataAccess__RefAssignment_0
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
    // InternalX21.g:3763:1: rule__DataAccess__Group__1 : rule__DataAccess__Group__1__Impl ;
    public final void rule__DataAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3767:1: ( rule__DataAccess__Group__1__Impl )
            // InternalX21.g:3768:2: rule__DataAccess__Group__1__Impl
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
    // InternalX21.g:3774:1: rule__DataAccess__Group__1__Impl : ( ( rule__DataAccess__Group_1__0 )* ) ;
    public final void rule__DataAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3778:1: ( ( ( rule__DataAccess__Group_1__0 )* ) )
            // InternalX21.g:3779:1: ( ( rule__DataAccess__Group_1__0 )* )
            {
            // InternalX21.g:3779:1: ( ( rule__DataAccess__Group_1__0 )* )
            // InternalX21.g:3780:2: ( rule__DataAccess__Group_1__0 )*
            {
             before(grammarAccess.getDataAccessAccess().getGroup_1()); 
            // InternalX21.g:3781:2: ( rule__DataAccess__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==41) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalX21.g:3781:3: rule__DataAccess__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__DataAccess__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalX21.g:3790:1: rule__DataAccess__Group_1__0 : rule__DataAccess__Group_1__0__Impl rule__DataAccess__Group_1__1 ;
    public final void rule__DataAccess__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3794:1: ( rule__DataAccess__Group_1__0__Impl rule__DataAccess__Group_1__1 )
            // InternalX21.g:3795:2: rule__DataAccess__Group_1__0__Impl rule__DataAccess__Group_1__1
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
    // InternalX21.g:3802:1: rule__DataAccess__Group_1__0__Impl : ( '.' ) ;
    public final void rule__DataAccess__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3806:1: ( ( '.' ) )
            // InternalX21.g:3807:1: ( '.' )
            {
            // InternalX21.g:3807:1: ( '.' )
            // InternalX21.g:3808:2: '.'
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
    // InternalX21.g:3817:1: rule__DataAccess__Group_1__1 : rule__DataAccess__Group_1__1__Impl ;
    public final void rule__DataAccess__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3821:1: ( rule__DataAccess__Group_1__1__Impl )
            // InternalX21.g:3822:2: rule__DataAccess__Group_1__1__Impl
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
    // InternalX21.g:3828:1: rule__DataAccess__Group_1__1__Impl : ( ( rule__DataAccess__VarRefsAssignment_1_1 ) ) ;
    public final void rule__DataAccess__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3832:1: ( ( ( rule__DataAccess__VarRefsAssignment_1_1 ) ) )
            // InternalX21.g:3833:1: ( ( rule__DataAccess__VarRefsAssignment_1_1 ) )
            {
            // InternalX21.g:3833:1: ( ( rule__DataAccess__VarRefsAssignment_1_1 ) )
            // InternalX21.g:3834:2: ( rule__DataAccess__VarRefsAssignment_1_1 )
            {
             before(grammarAccess.getDataAccessAccess().getVarRefsAssignment_1_1()); 
            // InternalX21.g:3835:2: ( rule__DataAccess__VarRefsAssignment_1_1 )
            // InternalX21.g:3835:3: rule__DataAccess__VarRefsAssignment_1_1
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
    // InternalX21.g:3844:1: rule__None__Group__0 : rule__None__Group__0__Impl rule__None__Group__1 ;
    public final void rule__None__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3848:1: ( rule__None__Group__0__Impl rule__None__Group__1 )
            // InternalX21.g:3849:2: rule__None__Group__0__Impl rule__None__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalX21.g:3856:1: rule__None__Group__0__Impl : ( () ) ;
    public final void rule__None__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3860:1: ( ( () ) )
            // InternalX21.g:3861:1: ( () )
            {
            // InternalX21.g:3861:1: ( () )
            // InternalX21.g:3862:2: ()
            {
             before(grammarAccess.getNoneAccess().getNoneAction_0()); 
            // InternalX21.g:3863:2: ()
            // InternalX21.g:3863:3: 
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
    // InternalX21.g:3871:1: rule__None__Group__1 : rule__None__Group__1__Impl ;
    public final void rule__None__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3875:1: ( rule__None__Group__1__Impl )
            // InternalX21.g:3876:2: rule__None__Group__1__Impl
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
    // InternalX21.g:3882:1: rule__None__Group__1__Impl : ( 'none' ) ;
    public final void rule__None__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3886:1: ( ( 'none' ) )
            // InternalX21.g:3887:1: ( 'none' )
            {
            // InternalX21.g:3887:1: ( 'none' )
            // InternalX21.g:3888:2: 'none'
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
    // InternalX21.g:3898:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3902:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalX21.g:3903:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
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
    // InternalX21.g:3910:1: rule__IfStatement__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3914:1: ( ( 'if' ) )
            // InternalX21.g:3915:1: ( 'if' )
            {
            // InternalX21.g:3915:1: ( 'if' )
            // InternalX21.g:3916:2: 'if'
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
    // InternalX21.g:3925:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3929:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalX21.g:3930:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalX21.g:3937:1: rule__IfStatement__Group__1__Impl : ( ( rule__IfStatement__ConditionAssignment_1 ) ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3941:1: ( ( ( rule__IfStatement__ConditionAssignment_1 ) ) )
            // InternalX21.g:3942:1: ( ( rule__IfStatement__ConditionAssignment_1 ) )
            {
            // InternalX21.g:3942:1: ( ( rule__IfStatement__ConditionAssignment_1 ) )
            // InternalX21.g:3943:2: ( rule__IfStatement__ConditionAssignment_1 )
            {
             before(grammarAccess.getIfStatementAccess().getConditionAssignment_1()); 
            // InternalX21.g:3944:2: ( rule__IfStatement__ConditionAssignment_1 )
            // InternalX21.g:3944:3: rule__IfStatement__ConditionAssignment_1
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
    // InternalX21.g:3952:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3956:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // InternalX21.g:3957:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
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
    // InternalX21.g:3964:1: rule__IfStatement__Group__2__Impl : ( 'then' ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3968:1: ( ( 'then' ) )
            // InternalX21.g:3969:1: ( 'then' )
            {
            // InternalX21.g:3969:1: ( 'then' )
            // InternalX21.g:3970:2: 'then'
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
    // InternalX21.g:3979:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3983:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // InternalX21.g:3984:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalX21.g:3991:1: rule__IfStatement__Group__3__Impl : ( ( rule__IfStatement__TrueExpAssignment_3 ) ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3995:1: ( ( ( rule__IfStatement__TrueExpAssignment_3 ) ) )
            // InternalX21.g:3996:1: ( ( rule__IfStatement__TrueExpAssignment_3 ) )
            {
            // InternalX21.g:3996:1: ( ( rule__IfStatement__TrueExpAssignment_3 ) )
            // InternalX21.g:3997:2: ( rule__IfStatement__TrueExpAssignment_3 )
            {
             before(grammarAccess.getIfStatementAccess().getTrueExpAssignment_3()); 
            // InternalX21.g:3998:2: ( rule__IfStatement__TrueExpAssignment_3 )
            // InternalX21.g:3998:3: rule__IfStatement__TrueExpAssignment_3
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
    // InternalX21.g:4006:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4010:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // InternalX21.g:4011:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
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
    // InternalX21.g:4018:1: rule__IfStatement__Group__4__Impl : ( 'else' ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4022:1: ( ( 'else' ) )
            // InternalX21.g:4023:1: ( 'else' )
            {
            // InternalX21.g:4023:1: ( 'else' )
            // InternalX21.g:4024:2: 'else'
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
    // InternalX21.g:4033:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4037:1: ( rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 )
            // InternalX21.g:4038:2: rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6
            {
            pushFollow(FOLLOW_37);
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
    // InternalX21.g:4045:1: rule__IfStatement__Group__5__Impl : ( ( rule__IfStatement__FalseExpAssignment_5 ) ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4049:1: ( ( ( rule__IfStatement__FalseExpAssignment_5 ) ) )
            // InternalX21.g:4050:1: ( ( rule__IfStatement__FalseExpAssignment_5 ) )
            {
            // InternalX21.g:4050:1: ( ( rule__IfStatement__FalseExpAssignment_5 ) )
            // InternalX21.g:4051:2: ( rule__IfStatement__FalseExpAssignment_5 )
            {
             before(grammarAccess.getIfStatementAccess().getFalseExpAssignment_5()); 
            // InternalX21.g:4052:2: ( rule__IfStatement__FalseExpAssignment_5 )
            // InternalX21.g:4052:3: rule__IfStatement__FalseExpAssignment_5
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
    // InternalX21.g:4060:1: rule__IfStatement__Group__6 : rule__IfStatement__Group__6__Impl ;
    public final void rule__IfStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4064:1: ( rule__IfStatement__Group__6__Impl )
            // InternalX21.g:4065:2: rule__IfStatement__Group__6__Impl
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
    // InternalX21.g:4071:1: rule__IfStatement__Group__6__Impl : ( 'end' ) ;
    public final void rule__IfStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4075:1: ( ( 'end' ) )
            // InternalX21.g:4076:1: ( 'end' )
            {
            // InternalX21.g:4076:1: ( 'end' )
            // InternalX21.g:4077:2: 'end'
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
    // InternalX21.g:4087:1: rule__NewStatement__Group__0 : rule__NewStatement__Group__0__Impl rule__NewStatement__Group__1 ;
    public final void rule__NewStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4091:1: ( rule__NewStatement__Group__0__Impl rule__NewStatement__Group__1 )
            // InternalX21.g:4092:2: rule__NewStatement__Group__0__Impl rule__NewStatement__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalX21.g:4099:1: rule__NewStatement__Group__0__Impl : ( 'new' ) ;
    public final void rule__NewStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4103:1: ( ( 'new' ) )
            // InternalX21.g:4104:1: ( 'new' )
            {
            // InternalX21.g:4104:1: ( 'new' )
            // InternalX21.g:4105:2: 'new'
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
    // InternalX21.g:4114:1: rule__NewStatement__Group__1 : rule__NewStatement__Group__1__Impl rule__NewStatement__Group__2 ;
    public final void rule__NewStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4118:1: ( rule__NewStatement__Group__1__Impl rule__NewStatement__Group__2 )
            // InternalX21.g:4119:2: rule__NewStatement__Group__1__Impl rule__NewStatement__Group__2
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
    // InternalX21.g:4126:1: rule__NewStatement__Group__1__Impl : ( ( rule__NewStatement__TypeAssignment_1 ) ) ;
    public final void rule__NewStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4130:1: ( ( ( rule__NewStatement__TypeAssignment_1 ) ) )
            // InternalX21.g:4131:1: ( ( rule__NewStatement__TypeAssignment_1 ) )
            {
            // InternalX21.g:4131:1: ( ( rule__NewStatement__TypeAssignment_1 ) )
            // InternalX21.g:4132:2: ( rule__NewStatement__TypeAssignment_1 )
            {
             before(grammarAccess.getNewStatementAccess().getTypeAssignment_1()); 
            // InternalX21.g:4133:2: ( rule__NewStatement__TypeAssignment_1 )
            // InternalX21.g:4133:3: rule__NewStatement__TypeAssignment_1
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
    // InternalX21.g:4141:1: rule__NewStatement__Group__2 : rule__NewStatement__Group__2__Impl rule__NewStatement__Group__3 ;
    public final void rule__NewStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4145:1: ( rule__NewStatement__Group__2__Impl rule__NewStatement__Group__3 )
            // InternalX21.g:4146:2: rule__NewStatement__Group__2__Impl rule__NewStatement__Group__3
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
    // InternalX21.g:4153:1: rule__NewStatement__Group__2__Impl : ( '[' ) ;
    public final void rule__NewStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4157:1: ( ( '[' ) )
            // InternalX21.g:4158:1: ( '[' )
            {
            // InternalX21.g:4158:1: ( '[' )
            // InternalX21.g:4159:2: '['
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
    // InternalX21.g:4168:1: rule__NewStatement__Group__3 : rule__NewStatement__Group__3__Impl rule__NewStatement__Group__4 ;
    public final void rule__NewStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4172:1: ( rule__NewStatement__Group__3__Impl rule__NewStatement__Group__4 )
            // InternalX21.g:4173:2: rule__NewStatement__Group__3__Impl rule__NewStatement__Group__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalX21.g:4180:1: rule__NewStatement__Group__3__Impl : ( ( rule__NewStatement__VariablesAssignment_3 ) ) ;
    public final void rule__NewStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4184:1: ( ( ( rule__NewStatement__VariablesAssignment_3 ) ) )
            // InternalX21.g:4185:1: ( ( rule__NewStatement__VariablesAssignment_3 ) )
            {
            // InternalX21.g:4185:1: ( ( rule__NewStatement__VariablesAssignment_3 ) )
            // InternalX21.g:4186:2: ( rule__NewStatement__VariablesAssignment_3 )
            {
             before(grammarAccess.getNewStatementAccess().getVariablesAssignment_3()); 
            // InternalX21.g:4187:2: ( rule__NewStatement__VariablesAssignment_3 )
            // InternalX21.g:4187:3: rule__NewStatement__VariablesAssignment_3
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
    // InternalX21.g:4195:1: rule__NewStatement__Group__4 : rule__NewStatement__Group__4__Impl rule__NewStatement__Group__5 ;
    public final void rule__NewStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4199:1: ( rule__NewStatement__Group__4__Impl rule__NewStatement__Group__5 )
            // InternalX21.g:4200:2: rule__NewStatement__Group__4__Impl rule__NewStatement__Group__5
            {
            pushFollow(FOLLOW_43);
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
    // InternalX21.g:4207:1: rule__NewStatement__Group__4__Impl : ( ( rule__NewStatement__Group_4__0 )* ) ;
    public final void rule__NewStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4211:1: ( ( ( rule__NewStatement__Group_4__0 )* ) )
            // InternalX21.g:4212:1: ( ( rule__NewStatement__Group_4__0 )* )
            {
            // InternalX21.g:4212:1: ( ( rule__NewStatement__Group_4__0 )* )
            // InternalX21.g:4213:2: ( rule__NewStatement__Group_4__0 )*
            {
             before(grammarAccess.getNewStatementAccess().getGroup_4()); 
            // InternalX21.g:4214:2: ( rule__NewStatement__Group_4__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==24) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalX21.g:4214:3: rule__NewStatement__Group_4__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__NewStatement__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalX21.g:4222:1: rule__NewStatement__Group__5 : rule__NewStatement__Group__5__Impl ;
    public final void rule__NewStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4226:1: ( rule__NewStatement__Group__5__Impl )
            // InternalX21.g:4227:2: rule__NewStatement__Group__5__Impl
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
    // InternalX21.g:4233:1: rule__NewStatement__Group__5__Impl : ( ']' ) ;
    public final void rule__NewStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4237:1: ( ( ']' ) )
            // InternalX21.g:4238:1: ( ']' )
            {
            // InternalX21.g:4238:1: ( ']' )
            // InternalX21.g:4239:2: ']'
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
    // InternalX21.g:4249:1: rule__NewStatement__Group_4__0 : rule__NewStatement__Group_4__0__Impl rule__NewStatement__Group_4__1 ;
    public final void rule__NewStatement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4253:1: ( rule__NewStatement__Group_4__0__Impl rule__NewStatement__Group_4__1 )
            // InternalX21.g:4254:2: rule__NewStatement__Group_4__0__Impl rule__NewStatement__Group_4__1
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
    // InternalX21.g:4261:1: rule__NewStatement__Group_4__0__Impl : ( ',' ) ;
    public final void rule__NewStatement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4265:1: ( ( ',' ) )
            // InternalX21.g:4266:1: ( ',' )
            {
            // InternalX21.g:4266:1: ( ',' )
            // InternalX21.g:4267:2: ','
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
    // InternalX21.g:4276:1: rule__NewStatement__Group_4__1 : rule__NewStatement__Group_4__1__Impl ;
    public final void rule__NewStatement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4280:1: ( rule__NewStatement__Group_4__1__Impl )
            // InternalX21.g:4281:2: rule__NewStatement__Group_4__1__Impl
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
    // InternalX21.g:4287:1: rule__NewStatement__Group_4__1__Impl : ( ( rule__NewStatement__VariablesAssignment_4_1 ) ) ;
    public final void rule__NewStatement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4291:1: ( ( ( rule__NewStatement__VariablesAssignment_4_1 ) ) )
            // InternalX21.g:4292:1: ( ( rule__NewStatement__VariablesAssignment_4_1 ) )
            {
            // InternalX21.g:4292:1: ( ( rule__NewStatement__VariablesAssignment_4_1 ) )
            // InternalX21.g:4293:2: ( rule__NewStatement__VariablesAssignment_4_1 )
            {
             before(grammarAccess.getNewStatementAccess().getVariablesAssignment_4_1()); 
            // InternalX21.g:4294:2: ( rule__NewStatement__VariablesAssignment_4_1 )
            // InternalX21.g:4294:3: rule__NewStatement__VariablesAssignment_4_1
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
    // InternalX21.g:4303:1: rule__VarAssignment__Group__0 : rule__VarAssignment__Group__0__Impl rule__VarAssignment__Group__1 ;
    public final void rule__VarAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4307:1: ( rule__VarAssignment__Group__0__Impl rule__VarAssignment__Group__1 )
            // InternalX21.g:4308:2: rule__VarAssignment__Group__0__Impl rule__VarAssignment__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalX21.g:4315:1: rule__VarAssignment__Group__0__Impl : ( ( rule__VarAssignment__VariableAssignment_0 ) ) ;
    public final void rule__VarAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4319:1: ( ( ( rule__VarAssignment__VariableAssignment_0 ) ) )
            // InternalX21.g:4320:1: ( ( rule__VarAssignment__VariableAssignment_0 ) )
            {
            // InternalX21.g:4320:1: ( ( rule__VarAssignment__VariableAssignment_0 ) )
            // InternalX21.g:4321:2: ( rule__VarAssignment__VariableAssignment_0 )
            {
             before(grammarAccess.getVarAssignmentAccess().getVariableAssignment_0()); 
            // InternalX21.g:4322:2: ( rule__VarAssignment__VariableAssignment_0 )
            // InternalX21.g:4322:3: rule__VarAssignment__VariableAssignment_0
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
    // InternalX21.g:4330:1: rule__VarAssignment__Group__1 : rule__VarAssignment__Group__1__Impl rule__VarAssignment__Group__2 ;
    public final void rule__VarAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4334:1: ( rule__VarAssignment__Group__1__Impl rule__VarAssignment__Group__2 )
            // InternalX21.g:4335:2: rule__VarAssignment__Group__1__Impl rule__VarAssignment__Group__2
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
    // InternalX21.g:4342:1: rule__VarAssignment__Group__1__Impl : ( '=' ) ;
    public final void rule__VarAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4346:1: ( ( '=' ) )
            // InternalX21.g:4347:1: ( '=' )
            {
            // InternalX21.g:4347:1: ( '=' )
            // InternalX21.g:4348:2: '='
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
    // InternalX21.g:4357:1: rule__VarAssignment__Group__2 : rule__VarAssignment__Group__2__Impl ;
    public final void rule__VarAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4361:1: ( rule__VarAssignment__Group__2__Impl )
            // InternalX21.g:4362:2: rule__VarAssignment__Group__2__Impl
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
    // InternalX21.g:4368:1: rule__VarAssignment__Group__2__Impl : ( ( rule__VarAssignment__ValueAssignment_2 ) ) ;
    public final void rule__VarAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4372:1: ( ( ( rule__VarAssignment__ValueAssignment_2 ) ) )
            // InternalX21.g:4373:1: ( ( rule__VarAssignment__ValueAssignment_2 ) )
            {
            // InternalX21.g:4373:1: ( ( rule__VarAssignment__ValueAssignment_2 ) )
            // InternalX21.g:4374:2: ( rule__VarAssignment__ValueAssignment_2 )
            {
             before(grammarAccess.getVarAssignmentAccess().getValueAssignment_2()); 
            // InternalX21.g:4375:2: ( rule__VarAssignment__ValueAssignment_2 )
            // InternalX21.g:4375:3: rule__VarAssignment__ValueAssignment_2
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


    // $ANTLR start "rule__X21__NameAssignment_2"
    // InternalX21.g:4384:1: rule__X21__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__X21__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4388:1: ( ( RULE_ID ) )
            // InternalX21.g:4389:2: ( RULE_ID )
            {
            // InternalX21.g:4389:2: ( RULE_ID )
            // InternalX21.g:4390:3: RULE_ID
            {
             before(grammarAccess.getX21Access().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getX21Access().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X21__NameAssignment_2"


    // $ANTLR start "rule__X21__DeclarationsAssignment_3"
    // InternalX21.g:4399:1: rule__X21__DeclarationsAssignment_3 : ( ruleDeclaration ) ;
    public final void rule__X21__DeclarationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4403:1: ( ( ruleDeclaration ) )
            // InternalX21.g:4404:2: ( ruleDeclaration )
            {
            // InternalX21.g:4404:2: ( ruleDeclaration )
            // InternalX21.g:4405:3: ruleDeclaration
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
    // InternalX21.g:4414:1: rule__NameAndType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NameAndType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4418:1: ( ( RULE_ID ) )
            // InternalX21.g:4419:2: ( RULE_ID )
            {
            // InternalX21.g:4419:2: ( RULE_ID )
            // InternalX21.g:4420:3: RULE_ID
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
    // InternalX21.g:4429:1: rule__NameAndType__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__NameAndType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4433:1: ( ( ruleType ) )
            // InternalX21.g:4434:2: ( ruleType )
            {
            // InternalX21.g:4434:2: ( ruleType )
            // InternalX21.g:4435:3: ruleType
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
    // InternalX21.g:4444:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4448:1: ( ( RULE_ID ) )
            // InternalX21.g:4449:2: ( RULE_ID )
            {
            // InternalX21.g:4449:2: ( RULE_ID )
            // InternalX21.g:4450:3: RULE_ID
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
    // InternalX21.g:4459:1: rule__Function__BodyAssignment_2 : ( ruleLambda ) ;
    public final void rule__Function__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4463:1: ( ( ruleLambda ) )
            // InternalX21.g:4464:2: ( ruleLambda )
            {
            // InternalX21.g:4464:2: ( ruleLambda )
            // InternalX21.g:4465:3: ruleLambda
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
    // InternalX21.g:4474:1: rule__Lambda__LogicAssignment_4 : ( ruleExp ) ;
    public final void rule__Lambda__LogicAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4478:1: ( ( ruleExp ) )
            // InternalX21.g:4479:2: ( ruleExp )
            {
            // InternalX21.g:4479:2: ( ruleExp )
            // InternalX21.g:4480:3: ruleExp
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
    // InternalX21.g:4489:1: rule__FunctionOrLambda__RefAssignment_1_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionOrLambda__RefAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4493:1: ( ( ( RULE_ID ) ) )
            // InternalX21.g:4494:2: ( ( RULE_ID ) )
            {
            // InternalX21.g:4494:2: ( ( RULE_ID ) )
            // InternalX21.g:4495:3: ( RULE_ID )
            {
             before(grammarAccess.getFunctionOrLambdaAccess().getRefFunctionCrossReference_1_0_1_0()); 
            // InternalX21.g:4496:3: ( RULE_ID )
            // InternalX21.g:4497:4: RULE_ID
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
    // InternalX21.g:4508:1: rule__Node__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4512:1: ( ( RULE_ID ) )
            // InternalX21.g:4513:2: ( RULE_ID )
            {
            // InternalX21.g:4513:2: ( RULE_ID )
            // InternalX21.g:4514:3: RULE_ID
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
    // InternalX21.g:4523:1: rule__Node__BodyAssignment_2 : ( ruleFunctionOrLambda ) ;
    public final void rule__Node__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4527:1: ( ( ruleFunctionOrLambda ) )
            // InternalX21.g:4528:2: ( ruleFunctionOrLambda )
            {
            // InternalX21.g:4528:2: ( ruleFunctionOrLambda )
            // InternalX21.g:4529:3: ruleFunctionOrLambda
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
    // InternalX21.g:4538:1: rule__Stream__StartNodesAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Stream__StartNodesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4542:1: ( ( ( RULE_ID ) ) )
            // InternalX21.g:4543:2: ( ( RULE_ID ) )
            {
            // InternalX21.g:4543:2: ( ( RULE_ID ) )
            // InternalX21.g:4544:3: ( RULE_ID )
            {
             before(grammarAccess.getStreamAccess().getStartNodesNodeOrInputCrossReference_1_0()); 
            // InternalX21.g:4545:3: ( RULE_ID )
            // InternalX21.g:4546:4: RULE_ID
            {
             before(grammarAccess.getStreamAccess().getStartNodesNodeOrInputIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getStartNodesNodeOrInputIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getStreamAccess().getStartNodesNodeOrInputCrossReference_1_0()); 

            }


            }

        }
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
    // InternalX21.g:4557:1: rule__Stream__StartNodesAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Stream__StartNodesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4561:1: ( ( ( RULE_ID ) ) )
            // InternalX21.g:4562:2: ( ( RULE_ID ) )
            {
            // InternalX21.g:4562:2: ( ( RULE_ID ) )
            // InternalX21.g:4563:3: ( RULE_ID )
            {
             before(grammarAccess.getStreamAccess().getStartNodesNodeOrInputCrossReference_2_1_0()); 
            // InternalX21.g:4564:3: ( RULE_ID )
            // InternalX21.g:4565:4: RULE_ID
            {
             before(grammarAccess.getStreamAccess().getStartNodesNodeOrInputIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getStartNodesNodeOrInputIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getStreamAccess().getStartNodesNodeOrInputCrossReference_2_1_0()); 

            }


            }

        }
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
    // InternalX21.g:4576:1: rule__Stream__PointsAssignment_3_1 : ( ruleElementList ) ;
    public final void rule__Stream__PointsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4580:1: ( ( ruleElementList ) )
            // InternalX21.g:4581:2: ( ruleElementList )
            {
            // InternalX21.g:4581:2: ( ruleElementList )
            // InternalX21.g:4582:3: ruleElementList
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
    // InternalX21.g:4591:1: rule__ElementList__ElementsAssignment_0 : ( ruleElement ) ;
    public final void rule__ElementList__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4595:1: ( ( ruleElement ) )
            // InternalX21.g:4596:2: ( ruleElement )
            {
            // InternalX21.g:4596:2: ( ruleElement )
            // InternalX21.g:4597:3: ruleElement
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
    // InternalX21.g:4606:1: rule__ElementList__ElementsAssignment_1_1 : ( ruleElement ) ;
    public final void rule__ElementList__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4610:1: ( ( ruleElement ) )
            // InternalX21.g:4611:2: ( ruleElement )
            {
            // InternalX21.g:4611:2: ( ruleElement )
            // InternalX21.g:4612:3: ruleElement
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
    // InternalX21.g:4621:1: rule__Element__RefAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Element__RefAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4625:1: ( ( ( RULE_ID ) ) )
            // InternalX21.g:4626:2: ( ( RULE_ID ) )
            {
            // InternalX21.g:4626:2: ( ( RULE_ID ) )
            // InternalX21.g:4627:3: ( RULE_ID )
            {
             before(grammarAccess.getElementAccess().getRefNodeCrossReference_0_1_0()); 
            // InternalX21.g:4628:3: ( RULE_ID )
            // InternalX21.g:4629:4: RULE_ID
            {
             before(grammarAccess.getElementAccess().getRefNodeIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getRefNodeIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getElementAccess().getRefNodeCrossReference_0_1_0()); 

            }


            }

        }
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
    // InternalX21.g:4640:1: rule__Element__BodyAssignment_1_1 : ( ruleFunctionOrLambda ) ;
    public final void rule__Element__BodyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4644:1: ( ( ruleFunctionOrLambda ) )
            // InternalX21.g:4645:2: ( ruleFunctionOrLambda )
            {
            // InternalX21.g:4645:2: ( ruleFunctionOrLambda )
            // InternalX21.g:4646:3: ruleFunctionOrLambda
            {
             before(grammarAccess.getElementAccess().getBodyFunctionOrLambdaParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionOrLambda();

            state._fsp--;

             after(grammarAccess.getElementAccess().getBodyFunctionOrLambdaParserRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalX21.g:4655:1: rule__Element__NameAssignment_2_2 : ( RULE_ID ) ;
    public final void rule__Element__NameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4659:1: ( ( RULE_ID ) )
            // InternalX21.g:4660:2: ( RULE_ID )
            {
            // InternalX21.g:4660:2: ( RULE_ID )
            // InternalX21.g:4661:3: RULE_ID
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
    // InternalX21.g:4670:1: rule__DataDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4674:1: ( ( RULE_ID ) )
            // InternalX21.g:4675:2: ( RULE_ID )
            {
            // InternalX21.g:4675:2: ( RULE_ID )
            // InternalX21.g:4676:3: RULE_ID
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
    // InternalX21.g:4685:1: rule__DataDecl__VariablesAssignment_3 : ( ruleDataVariable ) ;
    public final void rule__DataDecl__VariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4689:1: ( ( ruleDataVariable ) )
            // InternalX21.g:4690:2: ( ruleDataVariable )
            {
            // InternalX21.g:4690:2: ( ruleDataVariable )
            // InternalX21.g:4691:3: ruleDataVariable
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
    // InternalX21.g:4700:1: rule__DataDecl__VariablesAssignment_4_1 : ( ruleDataVariable ) ;
    public final void rule__DataDecl__VariablesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4704:1: ( ( ruleDataVariable ) )
            // InternalX21.g:4705:2: ( ruleDataVariable )
            {
            // InternalX21.g:4705:2: ( ruleDataVariable )
            // InternalX21.g:4706:3: ruleDataVariable
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
    // InternalX21.g:4715:1: rule__DataVariable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DataVariable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4719:1: ( ( RULE_ID ) )
            // InternalX21.g:4720:2: ( RULE_ID )
            {
            // InternalX21.g:4720:2: ( RULE_ID )
            // InternalX21.g:4721:3: RULE_ID
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
    // InternalX21.g:4730:1: rule__DataVariable__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__DataVariable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4734:1: ( ( ruleType ) )
            // InternalX21.g:4735:2: ( ruleType )
            {
            // InternalX21.g:4735:2: ( ruleType )
            // InternalX21.g:4736:3: ruleType
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


    // $ANTLR start "rule__Type__DeclarationAssignment_2_1"
    // InternalX21.g:4745:1: rule__Type__DeclarationAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Type__DeclarationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4749:1: ( ( ( RULE_ID ) ) )
            // InternalX21.g:4750:2: ( ( RULE_ID ) )
            {
            // InternalX21.g:4750:2: ( ( RULE_ID ) )
            // InternalX21.g:4751:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeAccess().getDeclarationDataDeclCrossReference_2_1_0()); 
            // InternalX21.g:4752:3: ( RULE_ID )
            // InternalX21.g:4753:4: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getDeclarationDataDeclIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getDeclarationDataDeclIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getTypeAccess().getDeclarationDataDeclCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__DeclarationAssignment_2_1"


    // $ANTLR start "rule__LogicExp__RightAssignment_2"
    // InternalX21.g:4764:1: rule__LogicExp__RightAssignment_2 : ( ruleExp ) ;
    public final void rule__LogicExp__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4768:1: ( ( ruleExp ) )
            // InternalX21.g:4769:2: ( ruleExp )
            {
            // InternalX21.g:4769:2: ( ruleExp )
            // InternalX21.g:4770:3: ruleExp
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
    // InternalX21.g:4779:1: rule__Exp__RightAssignment_1_1 : ( ruleMulDiv ) ;
    public final void rule__Exp__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4783:1: ( ( ruleMulDiv ) )
            // InternalX21.g:4784:2: ( ruleMulDiv )
            {
            // InternalX21.g:4784:2: ( ruleMulDiv )
            // InternalX21.g:4785:3: ruleMulDiv
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
    // InternalX21.g:4794:1: rule__MulDiv__RightAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__MulDiv__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4798:1: ( ( rulePrimary ) )
            // InternalX21.g:4799:2: ( rulePrimary )
            {
            // InternalX21.g:4799:2: ( rulePrimary )
            // InternalX21.g:4800:3: rulePrimary
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
    // InternalX21.g:4809:1: rule__Primary__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Primary__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4813:1: ( ( RULE_INT ) )
            // InternalX21.g:4814:2: ( RULE_INT )
            {
            // InternalX21.g:4814:2: ( RULE_INT )
            // InternalX21.g:4815:3: RULE_INT
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
    // InternalX21.g:4824:1: rule__Primary__BodyAssignment_1_2 : ( ruleExp ) ;
    public final void rule__Primary__BodyAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4828:1: ( ( ruleExp ) )
            // InternalX21.g:4829:2: ( ruleExp )
            {
            // InternalX21.g:4829:2: ( ruleExp )
            // InternalX21.g:4830:3: ruleExp
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
    // InternalX21.g:4839:1: rule__LetStatement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LetStatement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4843:1: ( ( RULE_ID ) )
            // InternalX21.g:4844:2: ( RULE_ID )
            {
            // InternalX21.g:4844:2: ( RULE_ID )
            // InternalX21.g:4845:3: RULE_ID
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
    // InternalX21.g:4854:1: rule__LetStatement__ValueAssignment_3 : ( ruleExp ) ;
    public final void rule__LetStatement__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4858:1: ( ( ruleExp ) )
            // InternalX21.g:4859:2: ( ruleExp )
            {
            // InternalX21.g:4859:2: ( ruleExp )
            // InternalX21.g:4860:3: ruleExp
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
    // InternalX21.g:4869:1: rule__LetStatement__BodyAssignment_5 : ( ruleExp ) ;
    public final void rule__LetStatement__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4873:1: ( ( ruleExp ) )
            // InternalX21.g:4874:2: ( ruleExp )
            {
            // InternalX21.g:4874:2: ( ruleExp )
            // InternalX21.g:4875:3: ruleExp
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
    // InternalX21.g:4884:1: rule__DataAccess__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DataAccess__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4888:1: ( ( ( RULE_ID ) ) )
            // InternalX21.g:4889:2: ( ( RULE_ID ) )
            {
            // InternalX21.g:4889:2: ( ( RULE_ID ) )
            // InternalX21.g:4890:3: ( RULE_ID )
            {
             before(grammarAccess.getDataAccessAccess().getRefDataRefCrossReference_0_0()); 
            // InternalX21.g:4891:3: ( RULE_ID )
            // InternalX21.g:4892:4: RULE_ID
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
    // InternalX21.g:4903:1: rule__DataAccess__VarRefsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataAccess__VarRefsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4907:1: ( ( ( RULE_ID ) ) )
            // InternalX21.g:4908:2: ( ( RULE_ID ) )
            {
            // InternalX21.g:4908:2: ( ( RULE_ID ) )
            // InternalX21.g:4909:3: ( RULE_ID )
            {
             before(grammarAccess.getDataAccessAccess().getVarRefsDataVariableCrossReference_1_1_0()); 
            // InternalX21.g:4910:3: ( RULE_ID )
            // InternalX21.g:4911:4: RULE_ID
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
    // InternalX21.g:4922:1: rule__IfStatement__ConditionAssignment_1 : ( ruleLogicExp ) ;
    public final void rule__IfStatement__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4926:1: ( ( ruleLogicExp ) )
            // InternalX21.g:4927:2: ( ruleLogicExp )
            {
            // InternalX21.g:4927:2: ( ruleLogicExp )
            // InternalX21.g:4928:3: ruleLogicExp
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
    // InternalX21.g:4937:1: rule__IfStatement__TrueExpAssignment_3 : ( ruleExp ) ;
    public final void rule__IfStatement__TrueExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4941:1: ( ( ruleExp ) )
            // InternalX21.g:4942:2: ( ruleExp )
            {
            // InternalX21.g:4942:2: ( ruleExp )
            // InternalX21.g:4943:3: ruleExp
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
    // InternalX21.g:4952:1: rule__IfStatement__FalseExpAssignment_5 : ( ruleExp ) ;
    public final void rule__IfStatement__FalseExpAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4956:1: ( ( ruleExp ) )
            // InternalX21.g:4957:2: ( ruleExp )
            {
            // InternalX21.g:4957:2: ( ruleExp )
            // InternalX21.g:4958:3: ruleExp
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
    // InternalX21.g:4967:1: rule__NewStatement__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__NewStatement__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4971:1: ( ( ( RULE_ID ) ) )
            // InternalX21.g:4972:2: ( ( RULE_ID ) )
            {
            // InternalX21.g:4972:2: ( ( RULE_ID ) )
            // InternalX21.g:4973:3: ( RULE_ID )
            {
             before(grammarAccess.getNewStatementAccess().getTypeDataDeclCrossReference_1_0()); 
            // InternalX21.g:4974:3: ( RULE_ID )
            // InternalX21.g:4975:4: RULE_ID
            {
             before(grammarAccess.getNewStatementAccess().getTypeDataDeclIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewStatementAccess().getTypeDataDeclIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getNewStatementAccess().getTypeDataDeclCrossReference_1_0()); 

            }


            }

        }
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
    // InternalX21.g:4986:1: rule__NewStatement__VariablesAssignment_3 : ( ruleVarAssignment ) ;
    public final void rule__NewStatement__VariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4990:1: ( ( ruleVarAssignment ) )
            // InternalX21.g:4991:2: ( ruleVarAssignment )
            {
            // InternalX21.g:4991:2: ( ruleVarAssignment )
            // InternalX21.g:4992:3: ruleVarAssignment
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
    // InternalX21.g:5001:1: rule__NewStatement__VariablesAssignment_4_1 : ( ruleVarAssignment ) ;
    public final void rule__NewStatement__VariablesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:5005:1: ( ( ruleVarAssignment ) )
            // InternalX21.g:5006:2: ( ruleVarAssignment )
            {
            // InternalX21.g:5006:2: ( ruleVarAssignment )
            // InternalX21.g:5007:3: ruleVarAssignment
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
    // InternalX21.g:5016:1: rule__VarAssignment__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__VarAssignment__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:5020:1: ( ( ( RULE_ID ) ) )
            // InternalX21.g:5021:2: ( ( RULE_ID ) )
            {
            // InternalX21.g:5021:2: ( ( RULE_ID ) )
            // InternalX21.g:5022:3: ( RULE_ID )
            {
             before(grammarAccess.getVarAssignmentAccess().getVariableDataVariableCrossReference_0_0()); 
            // InternalX21.g:5023:3: ( RULE_ID )
            // InternalX21.g:5024:4: RULE_ID
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
    // InternalX21.g:5035:1: rule__VarAssignment__ValueAssignment_2 : ( ruleExp ) ;
    public final void rule__VarAssignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:5039:1: ( ( ruleExp ) )
            // InternalX21.g:5040:2: ( ruleExp )
            {
            // InternalX21.g:5040:2: ( ruleExp )
            // InternalX21.g:5041:3: ruleExp
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
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004100010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000007C0000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000001200000L});

}