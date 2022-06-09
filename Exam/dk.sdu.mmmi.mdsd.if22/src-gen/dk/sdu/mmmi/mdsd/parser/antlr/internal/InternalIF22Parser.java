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
import dk.sdu.mmmi.mdsd.services.IF22GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIF22Parser extends AbstractInternalAntlrParser {
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

        public InternalIF22Parser(TokenStream input, IF22GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "IF22";
       	}

       	@Override
       	protected IF22GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleIF22"
    // InternalIF22.g:64:1: entryRuleIF22 returns [EObject current=null] : iv_ruleIF22= ruleIF22 EOF ;
    public final EObject entryRuleIF22() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIF22 = null;


        try {
            // InternalIF22.g:64:45: (iv_ruleIF22= ruleIF22 EOF )
            // InternalIF22.g:65:2: iv_ruleIF22= ruleIF22 EOF
            {
             newCompositeNode(grammarAccess.getIF22Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIF22=ruleIF22();

            state._fsp--;

             current =iv_ruleIF22; 
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
    // $ANTLR end "entryRuleIF22"


    // $ANTLR start "ruleIF22"
    // InternalIF22.g:71:1: ruleIF22 returns [EObject current=null] : (otherlv_0= 'story' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleIF22() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalIF22.g:77:2: ( (otherlv_0= 'story' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalIF22.g:78:2: (otherlv_0= 'story' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalIF22.g:78:2: (otherlv_0= 'story' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalIF22.g:79:3: otherlv_0= 'story' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIF22Access().getStoryKeyword_0());
            		
            // InternalIF22.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIF22.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIF22.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalIF22.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIF22Access().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIF22Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleIF22"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});

}