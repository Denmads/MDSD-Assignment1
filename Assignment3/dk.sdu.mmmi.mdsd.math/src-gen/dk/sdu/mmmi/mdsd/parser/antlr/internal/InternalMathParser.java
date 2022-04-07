package dk.sdu.mmmi.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'external'", "'('", "','", "')'", "'int'", "'var'", "'='", "'+'", "'-'", "'*'", "'/'", "'let'", "'in'", "'end'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMath.g"; }



     	private MathGrammarAccess grammarAccess;

        public InternalMathParser(TokenStream input, MathGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MathProgram";
       	}

       	@Override
       	protected MathGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMathProgram"
    // InternalMath.g:64:1: entryRuleMathProgram returns [EObject current=null] : iv_ruleMathProgram= ruleMathProgram EOF ;
    public final EObject entryRuleMathProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathProgram = null;


        try {
            // InternalMath.g:64:52: (iv_ruleMathProgram= ruleMathProgram EOF )
            // InternalMath.g:65:2: iv_ruleMathProgram= ruleMathProgram EOF
            {
             newCompositeNode(grammarAccess.getMathProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathProgram=ruleMathProgram();

            state._fsp--;

             current =iv_ruleMathProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMathProgram"


    // $ANTLR start "ruleMathProgram"
    // InternalMath.g:71:1: ruleMathProgram returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externalFunctions_2_0= ruleExternalDeclaration ) )* ( (lv_variables_3_0= ruleVarBinding ) )* ) ;
    public final EObject ruleMathProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_externalFunctions_2_0 = null;

        EObject lv_variables_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:77:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externalFunctions_2_0= ruleExternalDeclaration ) )* ( (lv_variables_3_0= ruleVarBinding ) )* ) )
            // InternalMath.g:78:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externalFunctions_2_0= ruleExternalDeclaration ) )* ( (lv_variables_3_0= ruleVarBinding ) )* )
            {
            // InternalMath.g:78:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externalFunctions_2_0= ruleExternalDeclaration ) )* ( (lv_variables_3_0= ruleVarBinding ) )* )
            // InternalMath.g:79:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externalFunctions_2_0= ruleExternalDeclaration ) )* ( (lv_variables_3_0= ruleVarBinding ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMathProgramAccess().getProgramKeyword_0());
            		
            // InternalMath.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMathProgramAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMathProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMath.g:101:3: ( (lv_externalFunctions_2_0= ruleExternalDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMath.g:102:4: (lv_externalFunctions_2_0= ruleExternalDeclaration )
            	    {
            	    // InternalMath.g:102:4: (lv_externalFunctions_2_0= ruleExternalDeclaration )
            	    // InternalMath.g:103:5: lv_externalFunctions_2_0= ruleExternalDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getMathProgramAccess().getExternalFunctionsExternalDeclarationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_externalFunctions_2_0=ruleExternalDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMathProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"externalFunctions",
            	    						lv_externalFunctions_2_0,
            	    						"dk.sdu.mmmi.mdsd.Math.ExternalDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMath.g:120:3: ( (lv_variables_3_0= ruleVarBinding ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMath.g:121:4: (lv_variables_3_0= ruleVarBinding )
            	    {
            	    // InternalMath.g:121:4: (lv_variables_3_0= ruleVarBinding )
            	    // InternalMath.g:122:5: lv_variables_3_0= ruleVarBinding
            	    {

            	    					newCompositeNode(grammarAccess.getMathProgramAccess().getVariablesVarBindingParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_variables_3_0=ruleVarBinding();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMathProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_3_0,
            	    						"dk.sdu.mmmi.mdsd.Math.VarBinding");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMathProgram"


    // $ANTLR start "entryRuleExternalDeclaration"
    // InternalMath.g:143:1: entryRuleExternalDeclaration returns [EObject current=null] : iv_ruleExternalDeclaration= ruleExternalDeclaration EOF ;
    public final EObject entryRuleExternalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDeclaration = null;


        try {
            // InternalMath.g:143:60: (iv_ruleExternalDeclaration= ruleExternalDeclaration EOF )
            // InternalMath.g:144:2: iv_ruleExternalDeclaration= ruleExternalDeclaration EOF
            {
             newCompositeNode(grammarAccess.getExternalDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalDeclaration=ruleExternalDeclaration();

            state._fsp--;

             current =iv_ruleExternalDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalDeclaration"


    // $ANTLR start "ruleExternalDeclaration"
    // InternalMath.g:150:1: ruleExternalDeclaration returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterType ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleExternalDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:156:2: ( (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterType ) ) )* )? otherlv_6= ')' ) )
            // InternalMath.g:157:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterType ) ) )* )? otherlv_6= ')' )
            {
            // InternalMath.g:157:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterType ) ) )* )? otherlv_6= ')' )
            // InternalMath.g:158:3: otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterType ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalDeclarationAccess().getExternalKeyword_0());
            		
            // InternalMath.g:162:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:163:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:163:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:164:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExternalDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalDeclarationAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMath.g:184:3: ( ( (lv_parameters_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterType ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMath.g:185:4: ( (lv_parameters_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterType ) ) )*
                    {
                    // InternalMath.g:185:4: ( (lv_parameters_3_0= ruleParameterType ) )
                    // InternalMath.g:186:5: (lv_parameters_3_0= ruleParameterType )
                    {
                    // InternalMath.g:186:5: (lv_parameters_3_0= ruleParameterType )
                    // InternalMath.g:187:6: lv_parameters_3_0= ruleParameterType
                    {

                    						newCompositeNode(grammarAccess.getExternalDeclarationAccess().getParametersParameterTypeParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_3_0=ruleParameterType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_3_0,
                    							"dk.sdu.mmmi.mdsd.Math.ParameterType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMath.g:204:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterType ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMath.g:205:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterType ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getExternalDeclarationAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalMath.g:209:5: ( (lv_parameters_5_0= ruleParameterType ) )
                    	    // InternalMath.g:210:6: (lv_parameters_5_0= ruleParameterType )
                    	    {
                    	    // InternalMath.g:210:6: (lv_parameters_5_0= ruleParameterType )
                    	    // InternalMath.g:211:7: lv_parameters_5_0= ruleParameterType
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalDeclarationAccess().getParametersParameterTypeParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_5_0=ruleParameterType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalDeclarationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_5_0,
                    	    								"dk.sdu.mmmi.mdsd.Math.ParameterType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getExternalDeclarationAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalDeclaration"


    // $ANTLR start "entryRuleParameterType"
    // InternalMath.g:238:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // InternalMath.g:238:54: (iv_ruleParameterType= ruleParameterType EOF )
            // InternalMath.g:239:2: iv_ruleParameterType= ruleParameterType EOF
            {
             newCompositeNode(grammarAccess.getParameterTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterType=ruleParameterType();

            state._fsp--;

             current =iv_ruleParameterType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterType"


    // $ANTLR start "ruleParameterType"
    // InternalMath.g:245:1: ruleParameterType returns [EObject current=null] : ( () otherlv_1= 'int' ) ;
    public final EObject ruleParameterType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMath.g:251:2: ( ( () otherlv_1= 'int' ) )
            // InternalMath.g:252:2: ( () otherlv_1= 'int' )
            {
            // InternalMath.g:252:2: ( () otherlv_1= 'int' )
            // InternalMath.g:253:3: () otherlv_1= 'int'
            {
            // InternalMath.g:253:3: ()
            // InternalMath.g:254:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterTypeAccess().getIntTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterTypeAccess().getIntKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "entryRuleVarBinding"
    // InternalMath.g:268:1: entryRuleVarBinding returns [EObject current=null] : iv_ruleVarBinding= ruleVarBinding EOF ;
    public final EObject entryRuleVarBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarBinding = null;


        try {
            // InternalMath.g:268:51: (iv_ruleVarBinding= ruleVarBinding EOF )
            // InternalMath.g:269:2: iv_ruleVarBinding= ruleVarBinding EOF
            {
             newCompositeNode(grammarAccess.getVarBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarBinding=ruleVarBinding();

            state._fsp--;

             current =iv_ruleVarBinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarBinding"


    // $ANTLR start "ruleVarBinding"
    // InternalMath.g:275:1: ruleVarBinding returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) ) ;
    public final EObject ruleVarBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:281:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) ) )
            // InternalMath.g:282:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) )
            {
            // InternalMath.g:282:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) )
            // InternalMath.g:283:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVarBindingAccess().getVarKeyword_0());
            		
            // InternalMath.g:287:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:288:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:288:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:289:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVarBindingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getVarBindingAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:309:3: ( (lv_expression_3_0= ruleExp ) )
            // InternalMath.g:310:4: (lv_expression_3_0= ruleExp )
            {
            // InternalMath.g:310:4: (lv_expression_3_0= ruleExp )
            // InternalMath.g:311:5: lv_expression_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVarBindingAccess().getExpressionExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarBindingRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarBinding"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:332:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMath.g:332:44: (iv_ruleExp= ruleExp EOF )
            // InternalMath.g:333:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMath.g:339:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:345:2: ( (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalMath.g:346:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalMath.g:346:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalMath.g:347:3: this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:355:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=19 && LA6_0<=20)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMath.g:356:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalMath.g:356:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==19) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==20) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalMath.g:357:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalMath.g:357:5: ( () otherlv_2= '+' )
            	            // InternalMath.g:358:6: () otherlv_2= '+'
            	            {
            	            // InternalMath.g:358:6: ()
            	            // InternalMath.g:359:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,19,FOLLOW_11); 

            	            						newLeafNode(otherlv_2, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:371:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalMath.g:371:5: ( () otherlv_4= '-' )
            	            // InternalMath.g:372:6: () otherlv_4= '-'
            	            {
            	            // InternalMath.g:372:6: ()
            	            // InternalMath.g:373:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,20,FOLLOW_11); 

            	            						newLeafNode(otherlv_4, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:385:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalMath.g:386:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalMath.g:386:5: (lv_right_5_0= ruleFactor )
            	    // InternalMath.g:387:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalMath.g:409:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalMath.g:409:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalMath.g:410:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMath.g:416:1: ruleFactor returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:422:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalMath.g:423:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalMath.g:423:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalMath.g:424:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:432:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=21 && LA8_0<=22)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMath.g:433:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalMath.g:433:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==21) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==22) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalMath.g:434:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalMath.g:434:5: ( () otherlv_2= '*' )
            	            // InternalMath.g:435:6: () otherlv_2= '*'
            	            {
            	            // InternalMath.g:435:6: ()
            	            // InternalMath.g:436:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,21,FOLLOW_11); 

            	            						newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:448:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalMath.g:448:5: ( () otherlv_4= '/' )
            	            // InternalMath.g:449:6: () otherlv_4= '/'
            	            {
            	            // InternalMath.g:449:6: ()
            	            // InternalMath.g:450:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,22,FOLLOW_11); 

            	            						newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:462:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalMath.g:463:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalMath.g:463:5: (lv_right_5_0= rulePrimary )
            	    // InternalMath.g:464:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:486:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMath.g:486:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMath.g:487:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMath.g:493:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')' ) | this_VariableUse_6= ruleVariableUse | this_LetBinding_7= ruleLetBinding | this_ExternalCall_8= ruleExternalCall ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exp_4_0 = null;

        EObject this_VariableUse_6 = null;

        EObject this_LetBinding_7 = null;

        EObject this_ExternalCall_8 = null;



        	enterRule();

        try {
            // InternalMath.g:499:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')' ) | this_VariableUse_6= ruleVariableUse | this_LetBinding_7= ruleLetBinding | this_ExternalCall_8= ruleExternalCall ) )
            // InternalMath.g:500:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')' ) | this_VariableUse_6= ruleVariableUse | this_LetBinding_7= ruleLetBinding | this_ExternalCall_8= ruleExternalCall )
            {
            // InternalMath.g:500:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')' ) | this_VariableUse_6= ruleVariableUse | this_LetBinding_7= ruleLetBinding | this_ExternalCall_8= ruleExternalCall )
            int alt9=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case 13:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3==EOF||(LA9_3>=14 && LA9_3<=15)||LA9_3==17||(LA9_3>=19 && LA9_3<=22)||(LA9_3>=24 && LA9_3<=25)) ) {
                    alt9=3;
                }
                else if ( (LA9_3==13) ) {
                    alt9=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMath.g:501:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalMath.g:501:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalMath.g:502:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalMath.g:502:4: ()
                    // InternalMath.g:503:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getMathNumberAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMath.g:509:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalMath.g:510:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalMath.g:510:5: (lv_value_1_0= RULE_INT )
                    // InternalMath.g:511:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:529:3: ( () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')' )
                    {
                    // InternalMath.g:529:3: ( () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')' )
                    // InternalMath.g:530:4: () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')'
                    {
                    // InternalMath.g:530:4: ()
                    // InternalMath.g:531:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getParenthesisAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,13,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalMath.g:541:4: ( (lv_exp_4_0= ruleExp ) )
                    // InternalMath.g:542:5: (lv_exp_4_0= ruleExp )
                    {
                    // InternalMath.g:542:5: (lv_exp_4_0= ruleExp )
                    // InternalMath.g:543:6: lv_exp_4_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpExpParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_exp_4_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_4_0,
                    							"dk.sdu.mmmi.mdsd.Math.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMath.g:566:3: this_VariableUse_6= ruleVariableUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableUse_6=ruleVariableUse();

                    state._fsp--;


                    			current = this_VariableUse_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMath.g:575:3: this_LetBinding_7= ruleLetBinding
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLetBindingParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LetBinding_7=ruleLetBinding();

                    state._fsp--;


                    			current = this_LetBinding_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMath.g:584:3: this_ExternalCall_8= ruleExternalCall
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getExternalCallParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalCall_8=ruleExternalCall();

                    state._fsp--;


                    			current = this_ExternalCall_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleLetBinding"
    // InternalMath.g:596:1: entryRuleLetBinding returns [EObject current=null] : iv_ruleLetBinding= ruleLetBinding EOF ;
    public final EObject entryRuleLetBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetBinding = null;


        try {
            // InternalMath.g:596:51: (iv_ruleLetBinding= ruleLetBinding EOF )
            // InternalMath.g:597:2: iv_ruleLetBinding= ruleLetBinding EOF
            {
             newCompositeNode(grammarAccess.getLetBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLetBinding=ruleLetBinding();

            state._fsp--;

             current =iv_ruleLetBinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetBinding"


    // $ANTLR start "ruleLetBinding"
    // InternalMath.g:603:1: ruleLetBinding returns [EObject current=null] : (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' ) ;
    public final EObject ruleLetBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_binding_3_0 = null;

        EObject lv_body_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:609:2: ( (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' ) )
            // InternalMath.g:610:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' )
            {
            // InternalMath.g:610:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' )
            // InternalMath.g:611:3: otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLetBindingAccess().getLetKeyword_0());
            		
            // InternalMath.g:615:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:616:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:616:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:617:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLetBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getLetBindingAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:637:3: ( (lv_binding_3_0= ruleExp ) )
            // InternalMath.g:638:4: (lv_binding_3_0= ruleExp )
            {
            // InternalMath.g:638:4: (lv_binding_3_0= ruleExp )
            // InternalMath.g:639:5: lv_binding_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getBindingExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_binding_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"binding",
            						lv_binding_3_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getLetBindingAccess().getInKeyword_4());
            		
            // InternalMath.g:660:3: ( (lv_body_5_0= ruleExp ) )
            // InternalMath.g:661:4: (lv_body_5_0= ruleExp )
            {
            // InternalMath.g:661:4: (lv_body_5_0= ruleExp )
            // InternalMath.g:662:5: lv_body_5_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getBodyExpParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
            lv_body_5_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_5_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLetBindingAccess().getEndKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLetBinding"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMath.g:687:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalMath.g:687:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalMath.g:688:2: iv_ruleVariableUse= ruleVariableUse EOF
            {
             newCompositeNode(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableUse=ruleVariableUse();

            state._fsp--;

             current =iv_ruleVariableUse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMath.g:694:1: ruleVariableUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMath.g:700:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMath.g:701:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMath.g:701:2: ( (otherlv_0= RULE_ID ) )
            // InternalMath.g:702:3: (otherlv_0= RULE_ID )
            {
            // InternalMath.g:702:3: (otherlv_0= RULE_ID )
            // InternalMath.g:703:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableUseRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVariableUseAccess().getRefBindingCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableUse"


    // $ANTLR start "entryRuleExternalCall"
    // InternalMath.g:717:1: entryRuleExternalCall returns [EObject current=null] : iv_ruleExternalCall= ruleExternalCall EOF ;
    public final EObject entryRuleExternalCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCall = null;


        try {
            // InternalMath.g:717:53: (iv_ruleExternalCall= ruleExternalCall EOF )
            // InternalMath.g:718:2: iv_ruleExternalCall= ruleExternalCall EOF
            {
             newCompositeNode(grammarAccess.getExternalCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalCall=ruleExternalCall();

            state._fsp--;

             current =iv_ruleExternalCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalCall"


    // $ANTLR start "ruleExternalCall"
    // InternalMath.g:724:1: ruleExternalCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExp ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleExternalCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;



        	enterRule();

        try {
            // InternalMath.g:730:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExp ) ) )* )? otherlv_5= ')' ) )
            // InternalMath.g:731:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExp ) ) )* )? otherlv_5= ')' )
            {
            // InternalMath.g:731:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExp ) ) )* )? otherlv_5= ')' )
            // InternalMath.g:732:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExp ) ) )* )? otherlv_5= ')'
            {
            // InternalMath.g:732:3: ( (otherlv_0= RULE_ID ) )
            // InternalMath.g:733:4: (otherlv_0= RULE_ID )
            {
            // InternalMath.g:733:4: (otherlv_0= RULE_ID )
            // InternalMath.g:734:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_0, grammarAccess.getExternalCallAccess().getMethodExternalDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMath.g:749:3: ( ( (lv_arguments_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExp ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_INT)||LA11_0==13||LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMath.g:750:4: ( (lv_arguments_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExp ) ) )*
                    {
                    // InternalMath.g:750:4: ( (lv_arguments_2_0= ruleExp ) )
                    // InternalMath.g:751:5: (lv_arguments_2_0= ruleExp )
                    {
                    // InternalMath.g:751:5: (lv_arguments_2_0= ruleExp )
                    // InternalMath.g:752:6: lv_arguments_2_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getExternalCallAccess().getArgumentsExpParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_arguments_2_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalCallRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_2_0,
                    							"dk.sdu.mmmi.mdsd.Math.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMath.g:769:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleExp ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMath.g:770:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleExp ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getExternalCallAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalMath.g:774:5: ( (lv_arguments_4_0= ruleExp ) )
                    	    // InternalMath.g:775:6: (lv_arguments_4_0= ruleExp )
                    	    {
                    	    // InternalMath.g:775:6: (lv_arguments_4_0= ruleExp )
                    	    // InternalMath.g:776:7: lv_arguments_4_0= ruleExp
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalCallAccess().getArgumentsExpParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_arguments_4_0=ruleExp();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_4_0,
                    	    								"dk.sdu.mmmi.mdsd.Math.Exp");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalCallAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalCall"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000021002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000802030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000080A030L});

}