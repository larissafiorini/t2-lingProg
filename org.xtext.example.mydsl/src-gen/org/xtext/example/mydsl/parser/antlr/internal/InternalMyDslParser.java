package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_OPERATOR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "'define'", "')'", "'lambda'", "'if'", "'='"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_OPERATOR=6;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_expressions_0_0= ruleExpression ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_expressions_0_0= ruleExpression ) )* )
            // InternalMyDsl.g:78:2: ( (lv_expressions_0_0= ruleExpression ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_expressions_0_0= ruleExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_INT||LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_expressions_0_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_expressions_0_0= ruleExpression )
            	    // InternalMyDsl.g:80:4: lv_expressions_0_0= ruleExpression
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getExpressionsExpressionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_expressions_0_0=ruleExpression();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"expressions",
            	    					lv_expressions_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.Expression");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDefine"
    // InternalMyDsl.g:100:1: entryRuleDefine returns [EObject current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final EObject entryRuleDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefine = null;


        try {
            // InternalMyDsl.g:100:47: (iv_ruleDefine= ruleDefine EOF )
            // InternalMyDsl.g:101:2: iv_ruleDefine= ruleDefine EOF
            {
             newCompositeNode(grammarAccess.getDefineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefine=ruleDefine();

            state._fsp--;

             current =iv_ruleDefine; 
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
    // $ANTLR end "entryRuleDefine"


    // $ANTLR start "ruleDefine"
    // InternalMyDsl.g:107:1: ruleDefine returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'define' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject ruleDefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (otherlv_0= '(' otherlv_1= 'define' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalMyDsl.g:114:2: (otherlv_0= '(' otherlv_1= 'define' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalMyDsl.g:114:2: (otherlv_0= '(' otherlv_1= 'define' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalMyDsl.g:115:3: otherlv_0= '(' otherlv_1= 'define' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDefineAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDefineAccess().getDefineKeyword_1());
            		
            // InternalMyDsl.g:123:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:124:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:124:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:125:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDefineAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:141:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalMyDsl.g:142:4: (lv_value_3_0= RULE_INT )
            {
            // InternalMyDsl.g:142:4: (lv_value_3_0= RULE_INT )
            // InternalMyDsl.g:143:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_value_3_0, grammarAccess.getDefineAccess().getValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDefineAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleDefine"


    // $ANTLR start "entryRuleLambda"
    // InternalMyDsl.g:167:1: entryRuleLambda returns [EObject current=null] : iv_ruleLambda= ruleLambda EOF ;
    public final EObject entryRuleLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambda = null;


        try {
            // InternalMyDsl.g:167:47: (iv_ruleLambda= ruleLambda EOF )
            // InternalMyDsl.g:168:2: iv_ruleLambda= ruleLambda EOF
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
    // InternalMyDsl.g:174:1: ruleLambda returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'lambda' otherlv_2= '(' ( ( (lv_name_3_0= RULE_ID ) ) | ( (lv_value_4_0= RULE_INT ) ) ) (otherlv_5= ')' )* ) ;
    public final EObject ruleLambda() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_value_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:180:2: ( (otherlv_0= '(' otherlv_1= 'lambda' otherlv_2= '(' ( ( (lv_name_3_0= RULE_ID ) ) | ( (lv_value_4_0= RULE_INT ) ) ) (otherlv_5= ')' )* ) )
            // InternalMyDsl.g:181:2: (otherlv_0= '(' otherlv_1= 'lambda' otherlv_2= '(' ( ( (lv_name_3_0= RULE_ID ) ) | ( (lv_value_4_0= RULE_INT ) ) ) (otherlv_5= ')' )* )
            {
            // InternalMyDsl.g:181:2: (otherlv_0= '(' otherlv_1= 'lambda' otherlv_2= '(' ( ( (lv_name_3_0= RULE_ID ) ) | ( (lv_value_4_0= RULE_INT ) ) ) (otherlv_5= ')' )* )
            // InternalMyDsl.g:182:3: otherlv_0= '(' otherlv_1= 'lambda' otherlv_2= '(' ( ( (lv_name_3_0= RULE_ID ) ) | ( (lv_value_4_0= RULE_INT ) ) ) (otherlv_5= ')' )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getLambdaAccess().getLambdaKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:194:3: ( ( (lv_name_3_0= RULE_ID ) ) | ( (lv_value_4_0= RULE_INT ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_INT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:195:4: ( (lv_name_3_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:195:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalMyDsl.g:196:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalMyDsl.g:196:5: (lv_name_3_0= RULE_ID )
                    // InternalMyDsl.g:197:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getLambdaAccess().getNameIDTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLambdaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:214:4: ( (lv_value_4_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:214:4: ( (lv_value_4_0= RULE_INT ) )
                    // InternalMyDsl.g:215:5: (lv_value_4_0= RULE_INT )
                    {
                    // InternalMyDsl.g:215:5: (lv_value_4_0= RULE_INT )
                    // InternalMyDsl.g:216:6: lv_value_4_0= RULE_INT
                    {
                    lv_value_4_0=(Token)match(input,RULE_INT,FOLLOW_11); 

                    						newLeafNode(lv_value_4_0, grammarAccess.getLambdaAccess().getValueINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLambdaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:233:3: (otherlv_5= ')' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:234:4: otherlv_5= ')'
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_11); 

            	    				newLeafNode(otherlv_5, grammarAccess.getLambdaAccess().getRightParenthesisKeyword_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleLambda"


    // $ANTLR start "entryRuleConditional"
    // InternalMyDsl.g:243:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // InternalMyDsl.g:243:52: (iv_ruleConditional= ruleConditional EOF )
            // InternalMyDsl.g:244:2: iv_ruleConditional= ruleConditional EOF
            {
             newCompositeNode(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditional=ruleConditional();

            state._fsp--;

             current =iv_ruleConditional; 
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
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalMyDsl.g:250:1: ruleConditional returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'if' otherlv_2= '(' otherlv_3= '=' ( ( (lv_value_4_0= RULE_INT ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( (lv_value2_6_0= RULE_INT ) ) otherlv_7= ')' ( (lv_value3_8_0= RULE_INT ) ) (otherlv_9= ')' )? ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        Token lv_name_5_0=null;
        Token lv_value2_6_0=null;
        Token otherlv_7=null;
        Token lv_value3_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalMyDsl.g:256:2: ( (otherlv_0= '(' otherlv_1= 'if' otherlv_2= '(' otherlv_3= '=' ( ( (lv_value_4_0= RULE_INT ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( (lv_value2_6_0= RULE_INT ) ) otherlv_7= ')' ( (lv_value3_8_0= RULE_INT ) ) (otherlv_9= ')' )? ) )
            // InternalMyDsl.g:257:2: (otherlv_0= '(' otherlv_1= 'if' otherlv_2= '(' otherlv_3= '=' ( ( (lv_value_4_0= RULE_INT ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( (lv_value2_6_0= RULE_INT ) ) otherlv_7= ')' ( (lv_value3_8_0= RULE_INT ) ) (otherlv_9= ')' )? )
            {
            // InternalMyDsl.g:257:2: (otherlv_0= '(' otherlv_1= 'if' otherlv_2= '(' otherlv_3= '=' ( ( (lv_value_4_0= RULE_INT ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( (lv_value2_6_0= RULE_INT ) ) otherlv_7= ')' ( (lv_value3_8_0= RULE_INT ) ) (otherlv_9= ')' )? )
            // InternalMyDsl.g:258:3: otherlv_0= '(' otherlv_1= 'if' otherlv_2= '(' otherlv_3= '=' ( ( (lv_value_4_0= RULE_INT ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( (lv_value2_6_0= RULE_INT ) ) otherlv_7= ')' ( (lv_value3_8_0= RULE_INT ) ) (otherlv_9= ')' )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionalAccess().getIfKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionalAccess().getEqualsSignKeyword_3());
            		
            // InternalMyDsl.g:274:3: ( ( (lv_value_4_0= RULE_INT ) ) | ( (lv_name_5_0= RULE_ID ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:275:4: ( (lv_value_4_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:275:4: ( (lv_value_4_0= RULE_INT ) )
                    // InternalMyDsl.g:276:5: (lv_value_4_0= RULE_INT )
                    {
                    // InternalMyDsl.g:276:5: (lv_value_4_0= RULE_INT )
                    // InternalMyDsl.g:277:6: lv_value_4_0= RULE_INT
                    {
                    lv_value_4_0=(Token)match(input,RULE_INT,FOLLOW_6); 

                    						newLeafNode(lv_value_4_0, grammarAccess.getConditionalAccess().getValueINTTerminalRuleCall_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:294:4: ( (lv_name_5_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:294:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalMyDsl.g:295:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalMyDsl.g:295:5: (lv_name_5_0= RULE_ID )
                    // InternalMyDsl.g:296:6: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_name_5_0, grammarAccess.getConditionalAccess().getNameIDTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:313:3: ( (lv_value2_6_0= RULE_INT ) )
            // InternalMyDsl.g:314:4: (lv_value2_6_0= RULE_INT )
            {
            // InternalMyDsl.g:314:4: (lv_value2_6_0= RULE_INT )
            // InternalMyDsl.g:315:5: lv_value2_6_0= RULE_INT
            {
            lv_value2_6_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_value2_6_0, grammarAccess.getConditionalAccess().getValue2INTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value2",
            						lv_value2_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getConditionalAccess().getRightParenthesisKeyword_6());
            		
            // InternalMyDsl.g:335:3: ( (lv_value3_8_0= RULE_INT ) )
            // InternalMyDsl.g:336:4: (lv_value3_8_0= RULE_INT )
            {
            // InternalMyDsl.g:336:4: (lv_value3_8_0= RULE_INT )
            // InternalMyDsl.g:337:5: lv_value3_8_0= RULE_INT
            {
            lv_value3_8_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_value3_8_0, grammarAccess.getConditionalAccess().getValue3INTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value3",
            						lv_value3_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMyDsl.g:353:3: (otherlv_9= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:354:4: otherlv_9= ')'
                    {
                    otherlv_9=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getConditionalAccess().getRightParenthesisKeyword_8());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleOperation"
    // InternalMyDsl.g:363:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalMyDsl.g:363:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalMyDsl.g:364:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalMyDsl.g:370:1: ruleOperation returns [EObject current=null] : (otherlv_0= '(' ( (lv_op_1_0= RULE_OPERATOR ) ) ( (lv_value_2_0= RULE_INT ) ) ( (lv_value2_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_op_1_0=null;
        Token lv_value_2_0=null;
        Token lv_value2_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:376:2: ( (otherlv_0= '(' ( (lv_op_1_0= RULE_OPERATOR ) ) ( (lv_value_2_0= RULE_INT ) ) ( (lv_value2_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalMyDsl.g:377:2: (otherlv_0= '(' ( (lv_op_1_0= RULE_OPERATOR ) ) ( (lv_value_2_0= RULE_INT ) ) ( (lv_value2_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalMyDsl.g:377:2: (otherlv_0= '(' ( (lv_op_1_0= RULE_OPERATOR ) ) ( (lv_value_2_0= RULE_INT ) ) ( (lv_value2_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalMyDsl.g:378:3: otherlv_0= '(' ( (lv_op_1_0= RULE_OPERATOR ) ) ( (lv_value_2_0= RULE_INT ) ) ( (lv_value2_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:382:3: ( (lv_op_1_0= RULE_OPERATOR ) )
            // InternalMyDsl.g:383:4: (lv_op_1_0= RULE_OPERATOR )
            {
            // InternalMyDsl.g:383:4: (lv_op_1_0= RULE_OPERATOR )
            // InternalMyDsl.g:384:5: lv_op_1_0= RULE_OPERATOR
            {
            lv_op_1_0=(Token)match(input,RULE_OPERATOR,FOLLOW_6); 

            					newLeafNode(lv_op_1_0, grammarAccess.getOperationAccess().getOpOPERATORTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"op",
            						lv_op_1_0,
            						"org.xtext.example.mydsl.MyDsl.OPERATOR");
            				

            }


            }

            // InternalMyDsl.g:400:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalMyDsl.g:401:4: (lv_value_2_0= RULE_INT )
            {
            // InternalMyDsl.g:401:4: (lv_value_2_0= RULE_INT )
            // InternalMyDsl.g:402:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_value_2_0, grammarAccess.getOperationAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMyDsl.g:418:3: ( (lv_value2_3_0= RULE_INT ) )
            // InternalMyDsl.g:419:4: (lv_value2_3_0= RULE_INT )
            {
            // InternalMyDsl.g:419:4: (lv_value2_3_0= RULE_INT )
            // InternalMyDsl.g:420:5: lv_value2_3_0= RULE_INT
            {
            lv_value2_3_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_value2_3_0, grammarAccess.getOperationAccess().getValue2INTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value2",
            						lv_value2_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:444:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:444:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:445:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:451:1: ruleExpression returns [EObject current=null] : (this_Define_0= ruleDefine | ( (lv_value_1_0= RULE_INT ) ) | this_Lambda_2= ruleLambda | this_Conditional_3= ruleConditional | this_Operation_4= ruleOperation ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        EObject this_Define_0 = null;

        EObject this_Lambda_2 = null;

        EObject this_Conditional_3 = null;

        EObject this_Operation_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:457:2: ( (this_Define_0= ruleDefine | ( (lv_value_1_0= RULE_INT ) ) | this_Lambda_2= ruleLambda | this_Conditional_3= ruleConditional | this_Operation_4= ruleOperation ) )
            // InternalMyDsl.g:458:2: (this_Define_0= ruleDefine | ( (lv_value_1_0= RULE_INT ) ) | this_Lambda_2= ruleLambda | this_Conditional_3= ruleConditional | this_Operation_4= ruleOperation )
            {
            // InternalMyDsl.g:458:2: (this_Define_0= ruleDefine | ( (lv_value_1_0= RULE_INT ) ) | this_Lambda_2= ruleLambda | this_Conditional_3= ruleConditional | this_Operation_4= ruleOperation )
            int alt6=5;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                switch ( input.LA(2) ) {
                case RULE_OPERATOR:
                    {
                    alt6=5;
                    }
                    break;
                case 15:
                    {
                    alt6=3;
                    }
                    break;
                case 13:
                    {
                    alt6=1;
                    }
                    break;
                case 16:
                    {
                    alt6=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA6_0==RULE_INT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:459:3: this_Define_0= ruleDefine
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getDefineParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Define_0=ruleDefine();

                    state._fsp--;


                    			current = this_Define_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:468:3: ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:468:3: ( (lv_value_1_0= RULE_INT ) )
                    // InternalMyDsl.g:469:4: (lv_value_1_0= RULE_INT )
                    {
                    // InternalMyDsl.g:469:4: (lv_value_1_0= RULE_INT )
                    // InternalMyDsl.g:470:5: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_value_1_0, grammarAccess.getExpressionAccess().getValueINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpressionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_1_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:487:3: this_Lambda_2= ruleLambda
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getLambdaParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Lambda_2=ruleLambda();

                    state._fsp--;


                    			current = this_Lambda_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:496:3: this_Conditional_3= ruleConditional
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getConditionalParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Conditional_3=ruleConditional();

                    state._fsp--;


                    			current = this_Conditional_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:505:3: this_Operation_4= ruleOperation
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getOperationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Operation_4=ruleOperation();

                    state._fsp--;


                    			current = this_Operation_4;
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
    // $ANTLR end "ruleExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});

}