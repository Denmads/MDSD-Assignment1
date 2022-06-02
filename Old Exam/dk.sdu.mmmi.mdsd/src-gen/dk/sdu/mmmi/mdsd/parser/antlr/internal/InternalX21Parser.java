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
import dk.sdu.mmmi.mdsd.services.X21GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalX21Parser extends AbstractInternalAntlrParser {
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

        public InternalX21Parser(TokenStream input, X21GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "X21";
       	}

       	@Override
       	protected X21GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleX21"
    // InternalX21.g:64:1: entryRuleX21 returns [EObject current=null] : iv_ruleX21= ruleX21 EOF ;
    public final EObject entryRuleX21() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleX21 = null;


        try {
            // InternalX21.g:64:44: (iv_ruleX21= ruleX21 EOF )
            // InternalX21.g:65:2: iv_ruleX21= ruleX21 EOF
            {
             newCompositeNode(grammarAccess.getX21Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleX21=ruleX21();

            state._fsp--;

             current =iv_ruleX21; 
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
    // $ANTLR end "entryRuleX21"


    // $ANTLR start "ruleX21"
    // InternalX21.g:71:1: ruleX21 returns [EObject current=null] : ( () otherlv_1= 'program' this_ID_2= RULE_ID ( (lv_declarations_3_0= ruleDeclaration ) )* ) ;
    public final EObject ruleX21() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_ID_2=null;
        EObject lv_declarations_3_0 = null;



        	enterRule();

        try {
            // InternalX21.g:77:2: ( ( () otherlv_1= 'program' this_ID_2= RULE_ID ( (lv_declarations_3_0= ruleDeclaration ) )* ) )
            // InternalX21.g:78:2: ( () otherlv_1= 'program' this_ID_2= RULE_ID ( (lv_declarations_3_0= ruleDeclaration ) )* )
            {
            // InternalX21.g:78:2: ( () otherlv_1= 'program' this_ID_2= RULE_ID ( (lv_declarations_3_0= ruleDeclaration ) )* )
            // InternalX21.g:79:3: () otherlv_1= 'program' this_ID_2= RULE_ID ( (lv_declarations_3_0= ruleDeclaration ) )*
            {
            // InternalX21.g:79:3: ()
            // InternalX21.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getX21Access().getX21Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getX21Access().getProgramKeyword_1());
            		
            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(this_ID_2, grammarAccess.getX21Access().getIDTerminalRuleCall_2());
            		
            // InternalX21.g:94:3: ( (lv_declarations_3_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=14)||LA1_0==19||(LA1_0>=22 && LA1_0<=23)||LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalX21.g:95:4: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // InternalX21.g:95:4: (lv_declarations_3_0= ruleDeclaration )
            	    // InternalX21.g:96:5: lv_declarations_3_0= ruleDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getX21Access().getDeclarationsDeclarationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_declarations_3_0=ruleDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getX21Rule());
            	    					}
            	    					add(
            	    						current,
            	    						"declarations",
            	    						lv_declarations_3_0,
            	    						"dk.sdu.mmmi.mdsd.X21.Declaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleX21"


    // $ANTLR start "entryRuleDeclaration"
    // InternalX21.g:117:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalX21.g:117:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalX21.g:118:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalX21.g:124:1: ruleDeclaration returns [EObject current=null] : (this_Function_0= ruleFunction | this_Input_1= ruleInput | this_Node_2= ruleNode | this_Stream_3= ruleStream | this_DataDecl_4= ruleDataDecl | this_Parameter_5= ruleParameter ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Function_0 = null;

        EObject this_Input_1 = null;

        EObject this_Node_2 = null;

        EObject this_Stream_3 = null;

        EObject this_DataDecl_4 = null;

        EObject this_Parameter_5 = null;



        	enterRule();

        try {
            // InternalX21.g:130:2: ( (this_Function_0= ruleFunction | this_Input_1= ruleInput | this_Node_2= ruleNode | this_Stream_3= ruleStream | this_DataDecl_4= ruleDataDecl | this_Parameter_5= ruleParameter ) )
            // InternalX21.g:131:2: (this_Function_0= ruleFunction | this_Input_1= ruleInput | this_Node_2= ruleNode | this_Stream_3= ruleStream | this_DataDecl_4= ruleDataDecl | this_Parameter_5= ruleParameter )
            {
            // InternalX21.g:131:2: (this_Function_0= ruleFunction | this_Input_1= ruleInput | this_Node_2= ruleNode | this_Stream_3= ruleStream | this_DataDecl_4= ruleDataDecl | this_Parameter_5= ruleParameter )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            case 23:
                {
                alt2=4;
                }
                break;
            case 27:
                {
                alt2=5;
                }
                break;
            case 13:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalX21.g:132:3: this_Function_0= ruleFunction
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getFunctionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Function_0=ruleFunction();

                    state._fsp--;


                    			current = this_Function_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalX21.g:141:3: this_Input_1= ruleInput
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getInputParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Input_1=ruleInput();

                    state._fsp--;


                    			current = this_Input_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalX21.g:150:3: this_Node_2= ruleNode
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getNodeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Node_2=ruleNode();

                    state._fsp--;


                    			current = this_Node_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalX21.g:159:3: this_Stream_3= ruleStream
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getStreamParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Stream_3=ruleStream();

                    state._fsp--;


                    			current = this_Stream_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalX21.g:168:3: this_DataDecl_4= ruleDataDecl
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getDataDeclParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataDecl_4=ruleDataDecl();

                    state._fsp--;


                    			current = this_DataDecl_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalX21.g:177:3: this_Parameter_5= ruleParameter
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getParameterParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parameter_5=ruleParameter();

                    state._fsp--;


                    			current = this_Parameter_5;
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "ruleNameAndType"
    // InternalX21.g:190:1: ruleNameAndType[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleNameAndType(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalX21.g:196:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // InternalX21.g:197:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalX21.g:197:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // InternalX21.g:198:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // InternalX21.g:198:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalX21.g:199:4: (lv_name_0_0= RULE_ID )
            {
            // InternalX21.g:199:4: (lv_name_0_0= RULE_ID )
            // InternalX21.g:200:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getNameAndTypeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNameAndTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getNameAndTypeAccess().getColonKeyword_1());
            		
            // InternalX21.g:220:3: ( (lv_type_2_0= ruleType ) )
            // InternalX21.g:221:4: (lv_type_2_0= ruleType )
            {
            // InternalX21.g:221:4: (lv_type_2_0= ruleType )
            // InternalX21.g:222:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getNameAndTypeAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNameAndTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"dk.sdu.mmmi.mdsd.X21.Type");
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
    // $ANTLR end "ruleNameAndType"


    // $ANTLR start "entryRuleParameter"
    // InternalX21.g:243:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalX21.g:243:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalX21.g:244:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalX21.g:250:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'parameter' this_NameAndType_1= ruleNameAndType[$current] ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_NameAndType_1 = null;



        	enterRule();

        try {
            // InternalX21.g:256:2: ( (otherlv_0= 'parameter' this_NameAndType_1= ruleNameAndType[$current] ) )
            // InternalX21.g:257:2: (otherlv_0= 'parameter' this_NameAndType_1= ruleNameAndType[$current] )
            {
            // InternalX21.g:257:2: (otherlv_0= 'parameter' this_NameAndType_1= ruleNameAndType[$current] )
            // InternalX21.g:258:3: otherlv_0= 'parameter' this_NameAndType_1= ruleNameAndType[$current]
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getParameterRule());
            			}
            			newCompositeNode(grammarAccess.getParameterAccess().getNameAndTypeParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_NameAndType_1=ruleNameAndType(current);

            state._fsp--;


            			current = this_NameAndType_1;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleFunction"
    // InternalX21.g:277:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalX21.g:277:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalX21.g:278:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalX21.g:284:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= ruleLambda ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalX21.g:290:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= ruleLambda ) ) ) )
            // InternalX21.g:291:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= ruleLambda ) ) )
            {
            // InternalX21.g:291:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= ruleLambda ) ) )
            // InternalX21.g:292:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= ruleLambda ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalX21.g:296:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalX21.g:297:4: (lv_name_1_0= RULE_ID )
            {
            // InternalX21.g:297:4: (lv_name_1_0= RULE_ID )
            // InternalX21.g:298:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalX21.g:314:3: ( (lv_body_2_0= ruleLambda ) )
            // InternalX21.g:315:4: (lv_body_2_0= ruleLambda )
            {
            // InternalX21.g:315:4: (lv_body_2_0= ruleLambda )
            // InternalX21.g:316:5: lv_body_2_0= ruleLambda
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getBodyLambdaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_2_0=ruleLambda();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_2_0,
            						"dk.sdu.mmmi.mdsd.X21.Lambda");
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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleLambda"
    // InternalX21.g:337:1: entryRuleLambda returns [EObject current=null] : iv_ruleLambda= ruleLambda EOF ;
    public final EObject entryRuleLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambda = null;


        try {
            // InternalX21.g:337:47: (iv_ruleLambda= ruleLambda EOF )
            // InternalX21.g:338:2: iv_ruleLambda= ruleLambda EOF
            {
             newCompositeNode(grammarAccess.getLambdaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLambda=ruleLambda();

            state._fsp--;

             current =iv_ruleLambda; 
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
    // $ANTLR end "entryRuleLambda"


    // $ANTLR start "ruleLambda"
    // InternalX21.g:344:1: ruleLambda returns [EObject current=null] : (otherlv_0= '(' this_NameAndType_1= ruleNameAndType[$current] otherlv_2= ')' otherlv_3= '{' ( (lv_logic_4_0= ruleExp ) ) otherlv_5= '}' ) ;
    public final EObject ruleLambda() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_NameAndType_1 = null;

        EObject lv_logic_4_0 = null;



        	enterRule();

        try {
            // InternalX21.g:350:2: ( (otherlv_0= '(' this_NameAndType_1= ruleNameAndType[$current] otherlv_2= ')' otherlv_3= '{' ( (lv_logic_4_0= ruleExp ) ) otherlv_5= '}' ) )
            // InternalX21.g:351:2: (otherlv_0= '(' this_NameAndType_1= ruleNameAndType[$current] otherlv_2= ')' otherlv_3= '{' ( (lv_logic_4_0= ruleExp ) ) otherlv_5= '}' )
            {
            // InternalX21.g:351:2: (otherlv_0= '(' this_NameAndType_1= ruleNameAndType[$current] otherlv_2= ')' otherlv_3= '{' ( (lv_logic_4_0= ruleExp ) ) otherlv_5= '}' )
            // InternalX21.g:352:3: otherlv_0= '(' this_NameAndType_1= ruleNameAndType[$current] otherlv_2= ')' otherlv_3= '{' ( (lv_logic_4_0= ruleExp ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_0());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getLambdaRule());
            			}
            			newCompositeNode(grammarAccess.getLambdaAccess().getNameAndTypeParserRuleCall_1());
            		
            pushFollow(FOLLOW_8);
            this_NameAndType_1=ruleNameAndType(current);

            state._fsp--;


            			current = this_NameAndType_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getLambdaAccess().getRightParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getLambdaAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalX21.g:375:3: ( (lv_logic_4_0= ruleExp ) )
            // InternalX21.g:376:4: (lv_logic_4_0= ruleExp )
            {
            // InternalX21.g:376:4: (lv_logic_4_0= ruleExp )
            // InternalX21.g:377:5: lv_logic_4_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLambdaAccess().getLogicExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_logic_4_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLambdaRule());
            					}
            					set(
            						current,
            						"logic",
            						lv_logic_4_0,
            						"dk.sdu.mmmi.mdsd.X21.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLambdaAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleLambda"


    // $ANTLR start "entryRuleInput"
    // InternalX21.g:402:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalX21.g:402:46: (iv_ruleInput= ruleInput EOF )
            // InternalX21.g:403:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalX21.g:409:1: ruleInput returns [EObject current=null] : (otherlv_0= 'input' this_NameAndType_1= ruleNameAndType[$current] ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_NameAndType_1 = null;



        	enterRule();

        try {
            // InternalX21.g:415:2: ( (otherlv_0= 'input' this_NameAndType_1= ruleNameAndType[$current] ) )
            // InternalX21.g:416:2: (otherlv_0= 'input' this_NameAndType_1= ruleNameAndType[$current] )
            {
            // InternalX21.g:416:2: (otherlv_0= 'input' this_NameAndType_1= ruleNameAndType[$current] )
            // InternalX21.g:417:3: otherlv_0= 'input' this_NameAndType_1= ruleNameAndType[$current]
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputAccess().getInputKeyword_0());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getInputRule());
            			}
            			newCompositeNode(grammarAccess.getInputAccess().getNameAndTypeParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_NameAndType_1=ruleNameAndType(current);

            state._fsp--;


            			current = this_NameAndType_1;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleFunctionOrLambda"
    // InternalX21.g:436:1: entryRuleFunctionOrLambda returns [EObject current=null] : iv_ruleFunctionOrLambda= ruleFunctionOrLambda EOF ;
    public final EObject entryRuleFunctionOrLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionOrLambda = null;


        try {
            // InternalX21.g:436:57: (iv_ruleFunctionOrLambda= ruleFunctionOrLambda EOF )
            // InternalX21.g:437:2: iv_ruleFunctionOrLambda= ruleFunctionOrLambda EOF
            {
             newCompositeNode(grammarAccess.getFunctionOrLambdaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionOrLambda=ruleFunctionOrLambda();

            state._fsp--;

             current =iv_ruleFunctionOrLambda; 
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
    // $ANTLR end "entryRuleFunctionOrLambda"


    // $ANTLR start "ruleFunctionOrLambda"
    // InternalX21.g:443:1: ruleFunctionOrLambda returns [EObject current=null] : (otherlv_0= '[' ( ( () ( (otherlv_2= RULE_ID ) ) ) | this_Lambda_3= ruleLambda ) otherlv_4= ']' ) ;
    public final EObject ruleFunctionOrLambda() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Lambda_3 = null;



        	enterRule();

        try {
            // InternalX21.g:449:2: ( (otherlv_0= '[' ( ( () ( (otherlv_2= RULE_ID ) ) ) | this_Lambda_3= ruleLambda ) otherlv_4= ']' ) )
            // InternalX21.g:450:2: (otherlv_0= '[' ( ( () ( (otherlv_2= RULE_ID ) ) ) | this_Lambda_3= ruleLambda ) otherlv_4= ']' )
            {
            // InternalX21.g:450:2: (otherlv_0= '[' ( ( () ( (otherlv_2= RULE_ID ) ) ) | this_Lambda_3= ruleLambda ) otherlv_4= ']' )
            // InternalX21.g:451:3: otherlv_0= '[' ( ( () ( (otherlv_2= RULE_ID ) ) ) | this_Lambda_3= ruleLambda ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionOrLambdaAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalX21.g:455:3: ( ( () ( (otherlv_2= RULE_ID ) ) ) | this_Lambda_3= ruleLambda )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalX21.g:456:4: ( () ( (otherlv_2= RULE_ID ) ) )
                    {
                    // InternalX21.g:456:4: ( () ( (otherlv_2= RULE_ID ) ) )
                    // InternalX21.g:457:5: () ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalX21.g:457:5: ()
                    // InternalX21.g:458:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getFunctionOrLambdaAccess().getFunctionReferenceAction_1_0_0(),
                    							current);
                    					

                    }

                    // InternalX21.g:464:5: ( (otherlv_2= RULE_ID ) )
                    // InternalX21.g:465:6: (otherlv_2= RULE_ID )
                    {
                    // InternalX21.g:465:6: (otherlv_2= RULE_ID )
                    // InternalX21.g:466:7: otherlv_2= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFunctionOrLambdaRule());
                    							}
                    						
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_13); 

                    							newLeafNode(otherlv_2, grammarAccess.getFunctionOrLambdaAccess().getRefFunctionCrossReference_1_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:479:4: this_Lambda_3= ruleLambda
                    {

                    				newCompositeNode(grammarAccess.getFunctionOrLambdaAccess().getLambdaParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_13);
                    this_Lambda_3=ruleLambda();

                    state._fsp--;


                    				current = this_Lambda_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionOrLambdaAccess().getRightSquareBracketKeyword_2());
            		

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
    // $ANTLR end "ruleFunctionOrLambda"


    // $ANTLR start "entryRuleNode"
    // InternalX21.g:496:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalX21.g:496:45: (iv_ruleNode= ruleNode EOF )
            // InternalX21.g:497:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalX21.g:503:1: ruleNode returns [EObject current=null] : (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= ruleFunctionOrLambda ) ) ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalX21.g:509:2: ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= ruleFunctionOrLambda ) ) ) )
            // InternalX21.g:510:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= ruleFunctionOrLambda ) ) )
            {
            // InternalX21.g:510:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= ruleFunctionOrLambda ) ) )
            // InternalX21.g:511:3: otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= ruleFunctionOrLambda ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
            		
            // InternalX21.g:515:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalX21.g:516:4: (lv_name_1_0= RULE_ID )
            {
            // InternalX21.g:516:4: (lv_name_1_0= RULE_ID )
            // InternalX21.g:517:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalX21.g:533:3: ( (lv_body_2_0= ruleFunctionOrLambda ) )
            // InternalX21.g:534:4: (lv_body_2_0= ruleFunctionOrLambda )
            {
            // InternalX21.g:534:4: (lv_body_2_0= ruleFunctionOrLambda )
            // InternalX21.g:535:5: lv_body_2_0= ruleFunctionOrLambda
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getBodyFunctionOrLambdaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_2_0=ruleFunctionOrLambda();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_2_0,
            						"dk.sdu.mmmi.mdsd.X21.FunctionOrLambda");
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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleStream"
    // InternalX21.g:556:1: entryRuleStream returns [EObject current=null] : iv_ruleStream= ruleStream EOF ;
    public final EObject entryRuleStream() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStream = null;


        try {
            // InternalX21.g:556:47: (iv_ruleStream= ruleStream EOF )
            // InternalX21.g:557:2: iv_ruleStream= ruleStream EOF
            {
             newCompositeNode(grammarAccess.getStreamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStream=ruleStream();

            state._fsp--;

             current =iv_ruleStream; 
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
    // $ANTLR end "entryRuleStream"


    // $ANTLR start "ruleStream"
    // InternalX21.g:563:1: ruleStream returns [EObject current=null] : (otherlv_0= 'stream' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'to' ( (lv_points_5_0= ruleElementList ) ) )+ ) ;
    public final EObject ruleStream() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_points_5_0 = null;



        	enterRule();

        try {
            // InternalX21.g:569:2: ( (otherlv_0= 'stream' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'to' ( (lv_points_5_0= ruleElementList ) ) )+ ) )
            // InternalX21.g:570:2: (otherlv_0= 'stream' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'to' ( (lv_points_5_0= ruleElementList ) ) )+ )
            {
            // InternalX21.g:570:2: (otherlv_0= 'stream' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'to' ( (lv_points_5_0= ruleElementList ) ) )+ )
            // InternalX21.g:571:3: otherlv_0= 'stream' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'to' ( (lv_points_5_0= ruleElementList ) ) )+
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStreamAccess().getStreamKeyword_0());
            		
            // InternalX21.g:575:3: ( (otherlv_1= RULE_ID ) )
            // InternalX21.g:576:4: (otherlv_1= RULE_ID )
            {
            // InternalX21.g:576:4: (otherlv_1= RULE_ID )
            // InternalX21.g:577:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStreamRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_1, grammarAccess.getStreamAccess().getStartNodesNodeOrInputCrossReference_1_0());
            				

            }


            }

            // InternalX21.g:588:3: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalX21.g:589:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getStreamAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalX21.g:593:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalX21.g:594:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalX21.g:594:5: (otherlv_3= RULE_ID )
            	    // InternalX21.g:595:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getStreamRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    						newLeafNode(otherlv_3, grammarAccess.getStreamAccess().getStartNodesNodeOrInputCrossReference_2_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalX21.g:607:3: (otherlv_4= 'to' ( (lv_points_5_0= ruleElementList ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==25) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalX21.g:608:4: otherlv_4= 'to' ( (lv_points_5_0= ruleElementList ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_16); 

            	    				newLeafNode(otherlv_4, grammarAccess.getStreamAccess().getToKeyword_3_0());
            	    			
            	    // InternalX21.g:612:4: ( (lv_points_5_0= ruleElementList ) )
            	    // InternalX21.g:613:5: (lv_points_5_0= ruleElementList )
            	    {
            	    // InternalX21.g:613:5: (lv_points_5_0= ruleElementList )
            	    // InternalX21.g:614:6: lv_points_5_0= ruleElementList
            	    {

            	    						newCompositeNode(grammarAccess.getStreamAccess().getPointsElementListParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_points_5_0=ruleElementList();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStreamRule());
            	    						}
            	    						add(
            	    							current,
            	    							"points",
            	    							lv_points_5_0,
            	    							"dk.sdu.mmmi.mdsd.X21.ElementList");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // $ANTLR end "ruleStream"


    // $ANTLR start "entryRuleElementList"
    // InternalX21.g:636:1: entryRuleElementList returns [EObject current=null] : iv_ruleElementList= ruleElementList EOF ;
    public final EObject entryRuleElementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementList = null;


        try {
            // InternalX21.g:636:52: (iv_ruleElementList= ruleElementList EOF )
            // InternalX21.g:637:2: iv_ruleElementList= ruleElementList EOF
            {
             newCompositeNode(grammarAccess.getElementListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementList=ruleElementList();

            state._fsp--;

             current =iv_ruleElementList; 
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
    // $ANTLR end "entryRuleElementList"


    // $ANTLR start "ruleElementList"
    // InternalX21.g:643:1: ruleElementList returns [EObject current=null] : ( ( (lv_elements_0_0= ruleElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleElement ) ) )* ) ;
    public final EObject ruleElementList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalX21.g:649:2: ( ( ( (lv_elements_0_0= ruleElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleElement ) ) )* ) )
            // InternalX21.g:650:2: ( ( (lv_elements_0_0= ruleElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleElement ) ) )* )
            {
            // InternalX21.g:650:2: ( ( (lv_elements_0_0= ruleElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleElement ) ) )* )
            // InternalX21.g:651:3: ( (lv_elements_0_0= ruleElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleElement ) ) )*
            {
            // InternalX21.g:651:3: ( (lv_elements_0_0= ruleElement ) )
            // InternalX21.g:652:4: (lv_elements_0_0= ruleElement )
            {
            // InternalX21.g:652:4: (lv_elements_0_0= ruleElement )
            // InternalX21.g:653:5: lv_elements_0_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getElementListAccess().getElementsElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_elements_0_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementListRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_0_0,
            						"dk.sdu.mmmi.mdsd.X21.Element");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalX21.g:670:3: (otherlv_1= ',' ( (lv_elements_2_0= ruleElement ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalX21.g:671:4: otherlv_1= ',' ( (lv_elements_2_0= ruleElement ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_16); 

            	    				newLeafNode(otherlv_1, grammarAccess.getElementListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalX21.g:675:4: ( (lv_elements_2_0= ruleElement ) )
            	    // InternalX21.g:676:5: (lv_elements_2_0= ruleElement )
            	    {
            	    // InternalX21.g:676:5: (lv_elements_2_0= ruleElement )
            	    // InternalX21.g:677:6: lv_elements_2_0= ruleElement
            	    {

            	    						newCompositeNode(grammarAccess.getElementListAccess().getElementsElementParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_elements_2_0=ruleElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getElementListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_2_0,
            	    							"dk.sdu.mmmi.mdsd.X21.Element");
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
    // $ANTLR end "ruleElementList"


    // $ANTLR start "entryRuleElement"
    // InternalX21.g:699:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalX21.g:699:48: (iv_ruleElement= ruleElement EOF )
            // InternalX21.g:700:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalX21.g:706:1: ruleElement returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_body_3_0= ruleFunctionOrLambda ) ) ) | ( () otherlv_5= 'output' ( (lv_name_6_0= RULE_ID ) ) ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalX21.g:712:2: ( ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_body_3_0= ruleFunctionOrLambda ) ) ) | ( () otherlv_5= 'output' ( (lv_name_6_0= RULE_ID ) ) ) ) )
            // InternalX21.g:713:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_body_3_0= ruleFunctionOrLambda ) ) ) | ( () otherlv_5= 'output' ( (lv_name_6_0= RULE_ID ) ) ) )
            {
            // InternalX21.g:713:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_body_3_0= ruleFunctionOrLambda ) ) ) | ( () otherlv_5= 'output' ( (lv_name_6_0= RULE_ID ) ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 26:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalX21.g:714:3: ( () ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalX21.g:714:3: ( () ( (otherlv_1= RULE_ID ) ) )
                    // InternalX21.g:715:4: () ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalX21.g:715:4: ()
                    // InternalX21.g:716:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getElementAccess().getNodeRefAction_0_0(),
                    						current);
                    				

                    }

                    // InternalX21.g:722:4: ( (otherlv_1= RULE_ID ) )
                    // InternalX21.g:723:5: (otherlv_1= RULE_ID )
                    {
                    // InternalX21.g:723:5: (otherlv_1= RULE_ID )
                    // InternalX21.g:724:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElementRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_1, grammarAccess.getElementAccess().getRefNodeCrossReference_0_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:737:3: ( () ( (lv_body_3_0= ruleFunctionOrLambda ) ) )
                    {
                    // InternalX21.g:737:3: ( () ( (lv_body_3_0= ruleFunctionOrLambda ) ) )
                    // InternalX21.g:738:4: () ( (lv_body_3_0= ruleFunctionOrLambda ) )
                    {
                    // InternalX21.g:738:4: ()
                    // InternalX21.g:739:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getElementAccess().getAnonymousElementAction_1_0(),
                    						current);
                    				

                    }

                    // InternalX21.g:745:4: ( (lv_body_3_0= ruleFunctionOrLambda ) )
                    // InternalX21.g:746:5: (lv_body_3_0= ruleFunctionOrLambda )
                    {
                    // InternalX21.g:746:5: (lv_body_3_0= ruleFunctionOrLambda )
                    // InternalX21.g:747:6: lv_body_3_0= ruleFunctionOrLambda
                    {

                    						newCompositeNode(grammarAccess.getElementAccess().getBodyFunctionOrLambdaParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_body_3_0=ruleFunctionOrLambda();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_3_0,
                    							"dk.sdu.mmmi.mdsd.X21.FunctionOrLambda");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalX21.g:766:3: ( () otherlv_5= 'output' ( (lv_name_6_0= RULE_ID ) ) )
                    {
                    // InternalX21.g:766:3: ( () otherlv_5= 'output' ( (lv_name_6_0= RULE_ID ) ) )
                    // InternalX21.g:767:4: () otherlv_5= 'output' ( (lv_name_6_0= RULE_ID ) )
                    {
                    // InternalX21.g:767:4: ()
                    // InternalX21.g:768:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getElementAccess().getOutputAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getElementAccess().getOutputKeyword_2_1());
                    			
                    // InternalX21.g:778:4: ( (lv_name_6_0= RULE_ID ) )
                    // InternalX21.g:779:5: (lv_name_6_0= RULE_ID )
                    {
                    // InternalX21.g:779:5: (lv_name_6_0= RULE_ID )
                    // InternalX21.g:780:6: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_6_0, grammarAccess.getElementAccess().getNameIDTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleDataDecl"
    // InternalX21.g:801:1: entryRuleDataDecl returns [EObject current=null] : iv_ruleDataDecl= ruleDataDecl EOF ;
    public final EObject entryRuleDataDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDecl = null;


        try {
            // InternalX21.g:801:49: (iv_ruleDataDecl= ruleDataDecl EOF )
            // InternalX21.g:802:2: iv_ruleDataDecl= ruleDataDecl EOF
            {
             newCompositeNode(grammarAccess.getDataDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataDecl=ruleDataDecl();

            state._fsp--;

             current =iv_ruleDataDecl; 
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
    // $ANTLR end "entryRuleDataDecl"


    // $ANTLR start "ruleDataDecl"
    // InternalX21.g:808:1: ruleDataDecl returns [EObject current=null] : (otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleDataVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleDataVariable ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleDataDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_variables_3_0 = null;

        EObject lv_variables_5_0 = null;



        	enterRule();

        try {
            // InternalX21.g:814:2: ( (otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleDataVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleDataVariable ) ) )* otherlv_6= '}' ) )
            // InternalX21.g:815:2: (otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleDataVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleDataVariable ) ) )* otherlv_6= '}' )
            {
            // InternalX21.g:815:2: (otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleDataVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleDataVariable ) ) )* otherlv_6= '}' )
            // InternalX21.g:816:3: otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleDataVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleDataVariable ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDataDeclAccess().getDataKeyword_0());
            		
            // InternalX21.g:820:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalX21.g:821:4: (lv_name_1_0= RULE_ID )
            {
            // InternalX21.g:821:4: (lv_name_1_0= RULE_ID )
            // InternalX21.g:822:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataDeclAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getDataDeclAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalX21.g:842:3: ( (lv_variables_3_0= ruleDataVariable ) )
            // InternalX21.g:843:4: (lv_variables_3_0= ruleDataVariable )
            {
            // InternalX21.g:843:4: (lv_variables_3_0= ruleDataVariable )
            // InternalX21.g:844:5: lv_variables_3_0= ruleDataVariable
            {

            					newCompositeNode(grammarAccess.getDataDeclAccess().getVariablesDataVariableParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_variables_3_0=ruleDataVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataDeclRule());
            					}
            					add(
            						current,
            						"variables",
            						lv_variables_3_0,
            						"dk.sdu.mmmi.mdsd.X21.DataVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalX21.g:861:3: (otherlv_4= ',' ( (lv_variables_5_0= ruleDataVariable ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalX21.g:862:4: otherlv_4= ',' ( (lv_variables_5_0= ruleDataVariable ) )
            	    {
            	    otherlv_4=(Token)match(input,24,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDataDeclAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalX21.g:866:4: ( (lv_variables_5_0= ruleDataVariable ) )
            	    // InternalX21.g:867:5: (lv_variables_5_0= ruleDataVariable )
            	    {
            	    // InternalX21.g:867:5: (lv_variables_5_0= ruleDataVariable )
            	    // InternalX21.g:868:6: lv_variables_5_0= ruleDataVariable
            	    {

            	    						newCompositeNode(grammarAccess.getDataDeclAccess().getVariablesDataVariableParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_variables_5_0=ruleDataVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDataDeclRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variables",
            	    							lv_variables_5_0,
            	    							"dk.sdu.mmmi.mdsd.X21.DataVariable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDataDeclAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleDataDecl"


    // $ANTLR start "entryRuleDataVariable"
    // InternalX21.g:894:1: entryRuleDataVariable returns [EObject current=null] : iv_ruleDataVariable= ruleDataVariable EOF ;
    public final EObject entryRuleDataVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataVariable = null;


        try {
            // InternalX21.g:894:53: (iv_ruleDataVariable= ruleDataVariable EOF )
            // InternalX21.g:895:2: iv_ruleDataVariable= ruleDataVariable EOF
            {
             newCompositeNode(grammarAccess.getDataVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataVariable=ruleDataVariable();

            state._fsp--;

             current =iv_ruleDataVariable; 
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
    // $ANTLR end "entryRuleDataVariable"


    // $ANTLR start "ruleDataVariable"
    // InternalX21.g:901:1: ruleDataVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleDataVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalX21.g:907:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // InternalX21.g:908:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalX21.g:908:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // InternalX21.g:909:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // InternalX21.g:909:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalX21.g:910:4: (lv_name_0_0= RULE_ID )
            {
            // InternalX21.g:910:4: (lv_name_0_0= RULE_ID )
            // InternalX21.g:911:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDataVariableAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDataVariableAccess().getColonKeyword_1());
            		
            // InternalX21.g:931:3: ( (lv_type_2_0= ruleType ) )
            // InternalX21.g:932:4: (lv_type_2_0= ruleType )
            {
            // InternalX21.g:932:4: (lv_type_2_0= ruleType )
            // InternalX21.g:933:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getDataVariableAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataVariableRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"dk.sdu.mmmi.mdsd.X21.Type");
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
    // $ANTLR end "ruleDataVariable"


    // $ANTLR start "entryRuleType"
    // InternalX21.g:954:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalX21.g:954:45: (iv_ruleType= ruleType EOF )
            // InternalX21.g:955:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalX21.g:961:1: ruleType returns [EObject current=null] : ( ( () otherlv_1= 'int' ) | ( () otherlv_3= 'string' ) | ( () ( (otherlv_5= RULE_ID ) ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalX21.g:967:2: ( ( ( () otherlv_1= 'int' ) | ( () otherlv_3= 'string' ) | ( () ( (otherlv_5= RULE_ID ) ) ) ) )
            // InternalX21.g:968:2: ( ( () otherlv_1= 'int' ) | ( () otherlv_3= 'string' ) | ( () ( (otherlv_5= RULE_ID ) ) ) )
            {
            // InternalX21.g:968:2: ( ( () otherlv_1= 'int' ) | ( () otherlv_3= 'string' ) | ( () ( (otherlv_5= RULE_ID ) ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt9=1;
                }
                break;
            case 29:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalX21.g:969:3: ( () otherlv_1= 'int' )
                    {
                    // InternalX21.g:969:3: ( () otherlv_1= 'int' )
                    // InternalX21.g:970:4: () otherlv_1= 'int'
                    {
                    // InternalX21.g:970:4: ()
                    // InternalX21.g:971:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getIntTypeAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getIntKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:983:3: ( () otherlv_3= 'string' )
                    {
                    // InternalX21.g:983:3: ( () otherlv_3= 'string' )
                    // InternalX21.g:984:4: () otherlv_3= 'string'
                    {
                    // InternalX21.g:984:4: ()
                    // InternalX21.g:985:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getStringTypeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getStringKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalX21.g:997:3: ( () ( (otherlv_5= RULE_ID ) ) )
                    {
                    // InternalX21.g:997:3: ( () ( (otherlv_5= RULE_ID ) ) )
                    // InternalX21.g:998:4: () ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalX21.g:998:4: ()
                    // InternalX21.g:999:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getCustomTypeAction_2_0(),
                    						current);
                    				

                    }

                    // InternalX21.g:1005:4: ( (otherlv_5= RULE_ID ) )
                    // InternalX21.g:1006:5: (otherlv_5= RULE_ID )
                    {
                    // InternalX21.g:1006:5: (otherlv_5= RULE_ID )
                    // InternalX21.g:1007:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getDeclarationDataDeclCrossReference_2_1_0());
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleLogicExp"
    // InternalX21.g:1023:1: entryRuleLogicExp returns [EObject current=null] : iv_ruleLogicExp= ruleLogicExp EOF ;
    public final EObject entryRuleLogicExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicExp = null;


        try {
            // InternalX21.g:1023:49: (iv_ruleLogicExp= ruleLogicExp EOF )
            // InternalX21.g:1024:2: iv_ruleLogicExp= ruleLogicExp EOF
            {
             newCompositeNode(grammarAccess.getLogicExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicExp=ruleLogicExp();

            state._fsp--;

             current =iv_ruleLogicExp; 
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
    // $ANTLR end "entryRuleLogicExp"


    // $ANTLR start "ruleLogicExp"
    // InternalX21.g:1030:1: ruleLogicExp returns [EObject current=null] : (this_Exp_0= ruleExp ( ( () otherlv_2= '=' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '>=' ) ) ( (lv_right_11_0= ruleExp ) ) ) ;
    public final EObject ruleLogicExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject this_Exp_0 = null;

        EObject lv_right_11_0 = null;



        	enterRule();

        try {
            // InternalX21.g:1036:2: ( (this_Exp_0= ruleExp ( ( () otherlv_2= '=' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '>=' ) ) ( (lv_right_11_0= ruleExp ) ) ) )
            // InternalX21.g:1037:2: (this_Exp_0= ruleExp ( ( () otherlv_2= '=' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '>=' ) ) ( (lv_right_11_0= ruleExp ) ) )
            {
            // InternalX21.g:1037:2: (this_Exp_0= ruleExp ( ( () otherlv_2= '=' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '>=' ) ) ( (lv_right_11_0= ruleExp ) ) )
            // InternalX21.g:1038:3: this_Exp_0= ruleExp ( ( () otherlv_2= '=' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '>=' ) ) ( (lv_right_11_0= ruleExp ) )
            {

            			newCompositeNode(grammarAccess.getLogicExpAccess().getExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_Exp_0=ruleExp();

            state._fsp--;


            			current = this_Exp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalX21.g:1046:3: ( ( () otherlv_2= '=' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '>=' ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt10=1;
                }
                break;
            case 31:
                {
                alt10=2;
                }
                break;
            case 32:
                {
                alt10=3;
                }
                break;
            case 33:
                {
                alt10=4;
                }
                break;
            case 34:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalX21.g:1047:4: ( () otherlv_2= '=' )
                    {
                    // InternalX21.g:1047:4: ( () otherlv_2= '=' )
                    // InternalX21.g:1048:5: () otherlv_2= '='
                    {
                    // InternalX21.g:1048:5: ()
                    // InternalX21.g:1049:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getLogicExpAccess().getEqualsLeftAction_1_0_0(),
                    							current);
                    					

                    }

                    otherlv_2=(Token)match(input,30,FOLLOW_10); 

                    					newLeafNode(otherlv_2, grammarAccess.getLogicExpAccess().getEqualsSignKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:1061:4: ( () otherlv_4= '<' )
                    {
                    // InternalX21.g:1061:4: ( () otherlv_4= '<' )
                    // InternalX21.g:1062:5: () otherlv_4= '<'
                    {
                    // InternalX21.g:1062:5: ()
                    // InternalX21.g:1063:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getLogicExpAccess().getLessThanLeftAction_1_1_0(),
                    							current);
                    					

                    }

                    otherlv_4=(Token)match(input,31,FOLLOW_10); 

                    					newLeafNode(otherlv_4, grammarAccess.getLogicExpAccess().getLessThanSignKeyword_1_1_1());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalX21.g:1075:4: ( () otherlv_6= '>' )
                    {
                    // InternalX21.g:1075:4: ( () otherlv_6= '>' )
                    // InternalX21.g:1076:5: () otherlv_6= '>'
                    {
                    // InternalX21.g:1076:5: ()
                    // InternalX21.g:1077:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getLogicExpAccess().getGreaterThanLeftAction_1_2_0(),
                    							current);
                    					

                    }

                    otherlv_6=(Token)match(input,32,FOLLOW_10); 

                    					newLeafNode(otherlv_6, grammarAccess.getLogicExpAccess().getGreaterThanSignKeyword_1_2_1());
                    				

                    }


                    }
                    break;
                case 4 :
                    // InternalX21.g:1089:4: ( () otherlv_8= '<=' )
                    {
                    // InternalX21.g:1089:4: ( () otherlv_8= '<=' )
                    // InternalX21.g:1090:5: () otherlv_8= '<='
                    {
                    // InternalX21.g:1090:5: ()
                    // InternalX21.g:1091:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getLogicExpAccess().getLessThanOrEqualsLeftAction_1_3_0(),
                    							current);
                    					

                    }

                    otherlv_8=(Token)match(input,33,FOLLOW_10); 

                    					newLeafNode(otherlv_8, grammarAccess.getLogicExpAccess().getLessThanSignEqualsSignKeyword_1_3_1());
                    				

                    }


                    }
                    break;
                case 5 :
                    // InternalX21.g:1103:4: ( () otherlv_10= '>=' )
                    {
                    // InternalX21.g:1103:4: ( () otherlv_10= '>=' )
                    // InternalX21.g:1104:5: () otherlv_10= '>='
                    {
                    // InternalX21.g:1104:5: ()
                    // InternalX21.g:1105:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getLogicExpAccess().getGreaterThanOrEqualsLeftAction_1_4_0(),
                    							current);
                    					

                    }

                    otherlv_10=(Token)match(input,34,FOLLOW_10); 

                    					newLeafNode(otherlv_10, grammarAccess.getLogicExpAccess().getGreaterThanSignEqualsSignKeyword_1_4_1());
                    				

                    }


                    }
                    break;

            }

            // InternalX21.g:1117:3: ( (lv_right_11_0= ruleExp ) )
            // InternalX21.g:1118:4: (lv_right_11_0= ruleExp )
            {
            // InternalX21.g:1118:4: (lv_right_11_0= ruleExp )
            // InternalX21.g:1119:5: lv_right_11_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLogicExpAccess().getRightExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_11_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicExpRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_11_0,
            						"dk.sdu.mmmi.mdsd.X21.Exp");
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
    // $ANTLR end "ruleLogicExp"


    // $ANTLR start "entryRuleExp"
    // InternalX21.g:1140:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalX21.g:1140:44: (iv_ruleExp= ruleExp EOF )
            // InternalX21.g:1141:2: iv_ruleExp= ruleExp EOF
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
    // InternalX21.g:1147:1: ruleExp returns [EObject current=null] : (this_MulDiv_0= ruleMulDiv ( ( ( () otherlv_2= '+' ) | () ) ( (lv_right_4_0= ruleMulDiv ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_MulDiv_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalX21.g:1153:2: ( (this_MulDiv_0= ruleMulDiv ( ( ( () otherlv_2= '+' ) | () ) ( (lv_right_4_0= ruleMulDiv ) ) )* ) )
            // InternalX21.g:1154:2: (this_MulDiv_0= ruleMulDiv ( ( ( () otherlv_2= '+' ) | () ) ( (lv_right_4_0= ruleMulDiv ) ) )* )
            {
            // InternalX21.g:1154:2: (this_MulDiv_0= ruleMulDiv ( ( ( () otherlv_2= '+' ) | () ) ( (lv_right_4_0= ruleMulDiv ) ) )* )
            // InternalX21.g:1155:3: this_MulDiv_0= ruleMulDiv ( ( ( () otherlv_2= '+' ) | () ) ( (lv_right_4_0= ruleMulDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getMulDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_MulDiv_0=ruleMulDiv();

            state._fsp--;


            			current = this_MulDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalX21.g:1163:3: ( ( ( () otherlv_2= '+' ) | () ) ( (lv_right_4_0= ruleMulDiv ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_INT)||LA12_0==15||LA12_0==35||LA12_0==38||(LA12_0>=42 && LA12_0<=43)||LA12_0==46) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalX21.g:1164:4: ( ( () otherlv_2= '+' ) | () ) ( (lv_right_4_0= ruleMulDiv ) )
            	    {
            	    // InternalX21.g:1164:4: ( ( () otherlv_2= '+' ) | () )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==35) ) {
            	        alt11=1;
            	    }
            	    else if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_INT)||LA11_0==15||LA11_0==38||(LA11_0>=42 && LA11_0<=43)||LA11_0==46) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalX21.g:1165:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalX21.g:1165:5: ( () otherlv_2= '+' )
            	            // InternalX21.g:1166:6: () otherlv_2= '+'
            	            {
            	            // InternalX21.g:1166:6: ()
            	            // InternalX21.g:1167:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,35,FOLLOW_10); 

            	            						newLeafNode(otherlv_2, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalX21.g:1179:5: ()
            	            {
            	            // InternalX21.g:1179:5: ()
            	            // InternalX21.g:1180:6: 
            	            {

            	            						current = forceCreateModelElementAndSet(
            	            							grammarAccess.getExpAccess().getMinusLeftAction_1_0_1(),
            	            							current);
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalX21.g:1187:4: ( (lv_right_4_0= ruleMulDiv ) )
            	    // InternalX21.g:1188:5: (lv_right_4_0= ruleMulDiv )
            	    {
            	    // InternalX21.g:1188:5: (lv_right_4_0= ruleMulDiv )
            	    // InternalX21.g:1189:6: lv_right_4_0= ruleMulDiv
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightMulDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_right_4_0=ruleMulDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
            	    							"dk.sdu.mmmi.mdsd.X21.MulDiv");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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


    // $ANTLR start "entryRuleMulDiv"
    // InternalX21.g:1211:1: entryRuleMulDiv returns [EObject current=null] : iv_ruleMulDiv= ruleMulDiv EOF ;
    public final EObject entryRuleMulDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulDiv = null;


        try {
            // InternalX21.g:1211:47: (iv_ruleMulDiv= ruleMulDiv EOF )
            // InternalX21.g:1212:2: iv_ruleMulDiv= ruleMulDiv EOF
            {
             newCompositeNode(grammarAccess.getMulDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulDiv=ruleMulDiv();

            state._fsp--;

             current =iv_ruleMulDiv; 
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
    // $ANTLR end "entryRuleMulDiv"


    // $ANTLR start "ruleMulDiv"
    // InternalX21.g:1218:1: ruleMulDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalX21.g:1224:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalX21.g:1225:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalX21.g:1225:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalX21.g:1226:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalX21.g:1234:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=36 && LA14_0<=37)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalX21.g:1235:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalX21.g:1235:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==36) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==37) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalX21.g:1236:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalX21.g:1236:5: ( () otherlv_2= '*' )
            	            // InternalX21.g:1237:6: () otherlv_2= '*'
            	            {
            	            // InternalX21.g:1237:6: ()
            	            // InternalX21.g:1238:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMulDivAccess().getMulLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,36,FOLLOW_10); 

            	            						newLeafNode(otherlv_2, grammarAccess.getMulDivAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalX21.g:1250:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalX21.g:1250:5: ( () otherlv_4= '/' )
            	            // InternalX21.g:1251:6: () otherlv_4= '/'
            	            {
            	            // InternalX21.g:1251:6: ()
            	            // InternalX21.g:1252:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMulDivAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,37,FOLLOW_10); 

            	            						newLeafNode(otherlv_4, grammarAccess.getMulDivAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalX21.g:1264:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalX21.g:1265:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalX21.g:1265:5: (lv_right_5_0= rulePrimary )
            	    // InternalX21.g:1266:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMulDivAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.X21.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleMulDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalX21.g:1288:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalX21.g:1288:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalX21.g:1289:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalX21.g:1295:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_body_4_0= ruleExp ) ) otherlv_5= ')' ) | this_LetStatement_6= ruleLetStatement | this_DataAccess_7= ruleDataAccess | this_None_8= ruleNone | this_IfStatement_9= ruleIfStatement | this_NewStatement_10= ruleNewStatement ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_body_4_0 = null;

        EObject this_LetStatement_6 = null;

        EObject this_DataAccess_7 = null;

        EObject this_None_8 = null;

        EObject this_IfStatement_9 = null;

        EObject this_NewStatement_10 = null;



        	enterRule();

        try {
            // InternalX21.g:1301:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_body_4_0= ruleExp ) ) otherlv_5= ')' ) | this_LetStatement_6= ruleLetStatement | this_DataAccess_7= ruleDataAccess | this_None_8= ruleNone | this_IfStatement_9= ruleIfStatement | this_NewStatement_10= ruleNewStatement ) )
            // InternalX21.g:1302:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_body_4_0= ruleExp ) ) otherlv_5= ')' ) | this_LetStatement_6= ruleLetStatement | this_DataAccess_7= ruleDataAccess | this_None_8= ruleNone | this_IfStatement_9= ruleIfStatement | this_NewStatement_10= ruleNewStatement )
            {
            // InternalX21.g:1302:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_body_4_0= ruleExp ) ) otherlv_5= ')' ) | this_LetStatement_6= ruleLetStatement | this_DataAccess_7= ruleDataAccess | this_None_8= ruleNone | this_IfStatement_9= ruleIfStatement | this_NewStatement_10= ruleNewStatement )
            int alt15=7;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt15=1;
                }
                break;
            case 15:
                {
                alt15=2;
                }
                break;
            case 38:
                {
                alt15=3;
                }
                break;
            case RULE_ID:
                {
                alt15=4;
                }
                break;
            case 42:
                {
                alt15=5;
                }
                break;
            case 43:
                {
                alt15=6;
                }
                break;
            case 46:
                {
                alt15=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalX21.g:1303:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalX21.g:1303:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalX21.g:1304:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalX21.g:1304:4: ()
                    // InternalX21.g:1305:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getIntAction_0_0(),
                    						current);
                    				

                    }

                    // InternalX21.g:1311:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalX21.g:1312:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalX21.g:1312:5: (lv_value_1_0= RULE_INT )
                    // InternalX21.g:1313:6: lv_value_1_0= RULE_INT
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
                    // InternalX21.g:1331:3: ( () otherlv_3= '(' ( (lv_body_4_0= ruleExp ) ) otherlv_5= ')' )
                    {
                    // InternalX21.g:1331:3: ( () otherlv_3= '(' ( (lv_body_4_0= ruleExp ) ) otherlv_5= ')' )
                    // InternalX21.g:1332:4: () otherlv_3= '(' ( (lv_body_4_0= ruleExp ) ) otherlv_5= ')'
                    {
                    // InternalX21.g:1332:4: ()
                    // InternalX21.g:1333:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getParenthesisAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalX21.g:1343:4: ( (lv_body_4_0= ruleExp ) )
                    // InternalX21.g:1344:5: (lv_body_4_0= ruleExp )
                    {
                    // InternalX21.g:1344:5: (lv_body_4_0= ruleExp )
                    // InternalX21.g:1345:6: lv_body_4_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getBodyExpParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_body_4_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_4_0,
                    							"dk.sdu.mmmi.mdsd.X21.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalX21.g:1368:3: this_LetStatement_6= ruleLetStatement
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLetStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LetStatement_6=ruleLetStatement();

                    state._fsp--;


                    			current = this_LetStatement_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalX21.g:1377:3: this_DataAccess_7= ruleDataAccess
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getDataAccessParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataAccess_7=ruleDataAccess();

                    state._fsp--;


                    			current = this_DataAccess_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalX21.g:1386:3: this_None_8= ruleNone
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNoneParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_None_8=ruleNone();

                    state._fsp--;


                    			current = this_None_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalX21.g:1395:3: this_IfStatement_9= ruleIfStatement
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getIfStatementParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfStatement_9=ruleIfStatement();

                    state._fsp--;


                    			current = this_IfStatement_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalX21.g:1404:3: this_NewStatement_10= ruleNewStatement
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNewStatementParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_NewStatement_10=ruleNewStatement();

                    state._fsp--;


                    			current = this_NewStatement_10;
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


    // $ANTLR start "entryRuleLetStatement"
    // InternalX21.g:1416:1: entryRuleLetStatement returns [EObject current=null] : iv_ruleLetStatement= ruleLetStatement EOF ;
    public final EObject entryRuleLetStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetStatement = null;


        try {
            // InternalX21.g:1416:53: (iv_ruleLetStatement= ruleLetStatement EOF )
            // InternalX21.g:1417:2: iv_ruleLetStatement= ruleLetStatement EOF
            {
             newCompositeNode(grammarAccess.getLetStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLetStatement=ruleLetStatement();

            state._fsp--;

             current =iv_ruleLetStatement; 
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
    // $ANTLR end "entryRuleLetStatement"


    // $ANTLR start "ruleLetStatement"
    // InternalX21.g:1423:1: ruleLetStatement returns [EObject current=null] : (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' ) ;
    public final EObject ruleLetStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_value_3_0 = null;

        EObject lv_body_5_0 = null;



        	enterRule();

        try {
            // InternalX21.g:1429:2: ( (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' ) )
            // InternalX21.g:1430:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' )
            {
            // InternalX21.g:1430:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' )
            // InternalX21.g:1431:3: otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLetStatementAccess().getLetKeyword_0());
            		
            // InternalX21.g:1435:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalX21.g:1436:4: (lv_name_1_0= RULE_ID )
            {
            // InternalX21.g:1436:4: (lv_name_1_0= RULE_ID )
            // InternalX21.g:1437:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLetStatementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLetStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getLetStatementAccess().getEqualsSignKeyword_2());
            		
            // InternalX21.g:1457:3: ( (lv_value_3_0= ruleExp ) )
            // InternalX21.g:1458:4: (lv_value_3_0= ruleExp )
            {
            // InternalX21.g:1458:4: (lv_value_3_0= ruleExp )
            // InternalX21.g:1459:5: lv_value_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetStatementAccess().getValueExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_value_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetStatementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"dk.sdu.mmmi.mdsd.X21.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,39,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getLetStatementAccess().getInKeyword_4());
            		
            // InternalX21.g:1480:3: ( (lv_body_5_0= ruleExp ) )
            // InternalX21.g:1481:4: (lv_body_5_0= ruleExp )
            {
            // InternalX21.g:1481:4: (lv_body_5_0= ruleExp )
            // InternalX21.g:1482:5: lv_body_5_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetStatementAccess().getBodyExpParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_25);
            lv_body_5_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetStatementRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_5_0,
            						"dk.sdu.mmmi.mdsd.X21.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLetStatementAccess().getEndKeyword_6());
            		

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
    // $ANTLR end "ruleLetStatement"


    // $ANTLR start "entryRuleDataAccess"
    // InternalX21.g:1507:1: entryRuleDataAccess returns [EObject current=null] : iv_ruleDataAccess= ruleDataAccess EOF ;
    public final EObject entryRuleDataAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataAccess = null;


        try {
            // InternalX21.g:1507:51: (iv_ruleDataAccess= ruleDataAccess EOF )
            // InternalX21.g:1508:2: iv_ruleDataAccess= ruleDataAccess EOF
            {
             newCompositeNode(grammarAccess.getDataAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataAccess=ruleDataAccess();

            state._fsp--;

             current =iv_ruleDataAccess; 
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
    // $ANTLR end "entryRuleDataAccess"


    // $ANTLR start "ruleDataAccess"
    // InternalX21.g:1514:1: ruleDataAccess returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleDataAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalX21.g:1520:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalX21.g:1521:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalX21.g:1521:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )* )
            // InternalX21.g:1522:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalX21.g:1522:3: ( (otherlv_0= RULE_ID ) )
            // InternalX21.g:1523:4: (otherlv_0= RULE_ID )
            {
            // InternalX21.g:1523:4: (otherlv_0= RULE_ID )
            // InternalX21.g:1524:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataAccessRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_0, grammarAccess.getDataAccessAccess().getRefDataRefCrossReference_0_0());
            				

            }


            }

            // InternalX21.g:1535:3: (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==41) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalX21.g:1536:4: otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,41,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getDataAccessAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalX21.g:1540:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalX21.g:1541:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalX21.g:1541:5: (otherlv_2= RULE_ID )
            	    // InternalX21.g:1542:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDataAccessRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_26); 

            	    						newLeafNode(otherlv_2, grammarAccess.getDataAccessAccess().getVarRefsDataVariableCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleDataAccess"


    // $ANTLR start "entryRuleNone"
    // InternalX21.g:1558:1: entryRuleNone returns [EObject current=null] : iv_ruleNone= ruleNone EOF ;
    public final EObject entryRuleNone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNone = null;


        try {
            // InternalX21.g:1558:45: (iv_ruleNone= ruleNone EOF )
            // InternalX21.g:1559:2: iv_ruleNone= ruleNone EOF
            {
             newCompositeNode(grammarAccess.getNoneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNone=ruleNone();

            state._fsp--;

             current =iv_ruleNone; 
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
    // $ANTLR end "entryRuleNone"


    // $ANTLR start "ruleNone"
    // InternalX21.g:1565:1: ruleNone returns [EObject current=null] : ( () otherlv_1= 'none' ) ;
    public final EObject ruleNone() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalX21.g:1571:2: ( ( () otherlv_1= 'none' ) )
            // InternalX21.g:1572:2: ( () otherlv_1= 'none' )
            {
            // InternalX21.g:1572:2: ( () otherlv_1= 'none' )
            // InternalX21.g:1573:3: () otherlv_1= 'none'
            {
            // InternalX21.g:1573:3: ()
            // InternalX21.g:1574:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNoneAccess().getNoneAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNoneAccess().getNoneKeyword_1());
            		

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
    // $ANTLR end "ruleNone"


    // $ANTLR start "entryRuleIfStatement"
    // InternalX21.g:1588:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalX21.g:1588:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalX21.g:1589:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             newCompositeNode(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;

             current =iv_ruleIfStatement; 
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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalX21.g:1595:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleLogicExp ) ) otherlv_2= 'then' ( (lv_trueExp_3_0= ruleExp ) ) otherlv_4= 'else' ( (lv_falseExp_5_0= ruleExp ) ) otherlv_6= 'end' ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_condition_1_0 = null;

        EObject lv_trueExp_3_0 = null;

        EObject lv_falseExp_5_0 = null;



        	enterRule();

        try {
            // InternalX21.g:1601:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleLogicExp ) ) otherlv_2= 'then' ( (lv_trueExp_3_0= ruleExp ) ) otherlv_4= 'else' ( (lv_falseExp_5_0= ruleExp ) ) otherlv_6= 'end' ) )
            // InternalX21.g:1602:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleLogicExp ) ) otherlv_2= 'then' ( (lv_trueExp_3_0= ruleExp ) ) otherlv_4= 'else' ( (lv_falseExp_5_0= ruleExp ) ) otherlv_6= 'end' )
            {
            // InternalX21.g:1602:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleLogicExp ) ) otherlv_2= 'then' ( (lv_trueExp_3_0= ruleExp ) ) otherlv_4= 'else' ( (lv_falseExp_5_0= ruleExp ) ) otherlv_6= 'end' )
            // InternalX21.g:1603:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleLogicExp ) ) otherlv_2= 'then' ( (lv_trueExp_3_0= ruleExp ) ) otherlv_4= 'else' ( (lv_falseExp_5_0= ruleExp ) ) otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
            		
            // InternalX21.g:1607:3: ( (lv_condition_1_0= ruleLogicExp ) )
            // InternalX21.g:1608:4: (lv_condition_1_0= ruleLogicExp )
            {
            // InternalX21.g:1608:4: (lv_condition_1_0= ruleLogicExp )
            // InternalX21.g:1609:5: lv_condition_1_0= ruleLogicExp
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getConditionLogicExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_condition_1_0=ruleLogicExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"dk.sdu.mmmi.mdsd.X21.LogicExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getThenKeyword_2());
            		
            // InternalX21.g:1630:3: ( (lv_trueExp_3_0= ruleExp ) )
            // InternalX21.g:1631:4: (lv_trueExp_3_0= ruleExp )
            {
            // InternalX21.g:1631:4: (lv_trueExp_3_0= ruleExp )
            // InternalX21.g:1632:5: lv_trueExp_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getTrueExpExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_trueExp_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"trueExp",
            						lv_trueExp_3_0,
            						"dk.sdu.mmmi.mdsd.X21.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,45,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getElseKeyword_4());
            		
            // InternalX21.g:1653:3: ( (lv_falseExp_5_0= ruleExp ) )
            // InternalX21.g:1654:4: (lv_falseExp_5_0= ruleExp )
            {
            // InternalX21.g:1654:4: (lv_falseExp_5_0= ruleExp )
            // InternalX21.g:1655:5: lv_falseExp_5_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getFalseExpExpParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_25);
            lv_falseExp_5_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"falseExp",
            						lv_falseExp_5_0,
            						"dk.sdu.mmmi.mdsd.X21.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getIfStatementAccess().getEndKeyword_6());
            		

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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleNewStatement"
    // InternalX21.g:1680:1: entryRuleNewStatement returns [EObject current=null] : iv_ruleNewStatement= ruleNewStatement EOF ;
    public final EObject entryRuleNewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewStatement = null;


        try {
            // InternalX21.g:1680:53: (iv_ruleNewStatement= ruleNewStatement EOF )
            // InternalX21.g:1681:2: iv_ruleNewStatement= ruleNewStatement EOF
            {
             newCompositeNode(grammarAccess.getNewStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNewStatement=ruleNewStatement();

            state._fsp--;

             current =iv_ruleNewStatement; 
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
    // $ANTLR end "entryRuleNewStatement"


    // $ANTLR start "ruleNewStatement"
    // InternalX21.g:1687:1: ruleNewStatement returns [EObject current=null] : (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_variables_3_0= ruleVarAssignment ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVarAssignment ) ) )* otherlv_6= ']' ) ;
    public final EObject ruleNewStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_variables_3_0 = null;

        EObject lv_variables_5_0 = null;



        	enterRule();

        try {
            // InternalX21.g:1693:2: ( (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_variables_3_0= ruleVarAssignment ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVarAssignment ) ) )* otherlv_6= ']' ) )
            // InternalX21.g:1694:2: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_variables_3_0= ruleVarAssignment ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVarAssignment ) ) )* otherlv_6= ']' )
            {
            // InternalX21.g:1694:2: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_variables_3_0= ruleVarAssignment ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVarAssignment ) ) )* otherlv_6= ']' )
            // InternalX21.g:1695:3: otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_variables_3_0= ruleVarAssignment ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVarAssignment ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNewStatementAccess().getNewKeyword_0());
            		
            // InternalX21.g:1699:3: ( (otherlv_1= RULE_ID ) )
            // InternalX21.g:1700:4: (otherlv_1= RULE_ID )
            {
            // InternalX21.g:1700:4: (otherlv_1= RULE_ID )
            // InternalX21.g:1701:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNewStatementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_1, grammarAccess.getNewStatementAccess().getTypeDataDeclCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getNewStatementAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalX21.g:1716:3: ( (lv_variables_3_0= ruleVarAssignment ) )
            // InternalX21.g:1717:4: (lv_variables_3_0= ruleVarAssignment )
            {
            // InternalX21.g:1717:4: (lv_variables_3_0= ruleVarAssignment )
            // InternalX21.g:1718:5: lv_variables_3_0= ruleVarAssignment
            {

            					newCompositeNode(grammarAccess.getNewStatementAccess().getVariablesVarAssignmentParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_variables_3_0=ruleVarAssignment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNewStatementRule());
            					}
            					add(
            						current,
            						"variables",
            						lv_variables_3_0,
            						"dk.sdu.mmmi.mdsd.X21.VarAssignment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalX21.g:1735:3: (otherlv_4= ',' ( (lv_variables_5_0= ruleVarAssignment ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==24) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalX21.g:1736:4: otherlv_4= ',' ( (lv_variables_5_0= ruleVarAssignment ) )
            	    {
            	    otherlv_4=(Token)match(input,24,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getNewStatementAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalX21.g:1740:4: ( (lv_variables_5_0= ruleVarAssignment ) )
            	    // InternalX21.g:1741:5: (lv_variables_5_0= ruleVarAssignment )
            	    {
            	    // InternalX21.g:1741:5: (lv_variables_5_0= ruleVarAssignment )
            	    // InternalX21.g:1742:6: lv_variables_5_0= ruleVarAssignment
            	    {

            	    						newCompositeNode(grammarAccess.getNewStatementAccess().getVariablesVarAssignmentParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_variables_5_0=ruleVarAssignment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNewStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variables",
            	    							lv_variables_5_0,
            	    							"dk.sdu.mmmi.mdsd.X21.VarAssignment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getNewStatementAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleNewStatement"


    // $ANTLR start "entryRuleVarAssignment"
    // InternalX21.g:1768:1: entryRuleVarAssignment returns [EObject current=null] : iv_ruleVarAssignment= ruleVarAssignment EOF ;
    public final EObject entryRuleVarAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarAssignment = null;


        try {
            // InternalX21.g:1768:54: (iv_ruleVarAssignment= ruleVarAssignment EOF )
            // InternalX21.g:1769:2: iv_ruleVarAssignment= ruleVarAssignment EOF
            {
             newCompositeNode(grammarAccess.getVarAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarAssignment=ruleVarAssignment();

            state._fsp--;

             current =iv_ruleVarAssignment; 
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
    // $ANTLR end "entryRuleVarAssignment"


    // $ANTLR start "ruleVarAssignment"
    // InternalX21.g:1775:1: ruleVarAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExp ) ) ) ;
    public final EObject ruleVarAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalX21.g:1781:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExp ) ) ) )
            // InternalX21.g:1782:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExp ) ) )
            {
            // InternalX21.g:1782:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExp ) ) )
            // InternalX21.g:1783:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExp ) )
            {
            // InternalX21.g:1783:3: ( (otherlv_0= RULE_ID ) )
            // InternalX21.g:1784:4: (otherlv_0= RULE_ID )
            {
            // InternalX21.g:1784:4: (otherlv_0= RULE_ID )
            // InternalX21.g:1785:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarAssignmentRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_0, grammarAccess.getVarAssignmentAccess().getVariableDataVariableCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getVarAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalX21.g:1800:3: ( (lv_value_2_0= ruleExp ) )
            // InternalX21.g:1801:4: (lv_value_2_0= ruleExp )
            {
            // InternalX21.g:1801:4: (lv_value_2_0= ruleExp )
            // InternalX21.g:1802:5: lv_value_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVarAssignmentAccess().getValueExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarAssignmentRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"dk.sdu.mmmi.mdsd.X21.Exp");
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
    // $ANTLR end "ruleVarAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008C86002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000030000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00004C4000008030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004100010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000007C0000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00004C4800008032L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000001200000L});

}