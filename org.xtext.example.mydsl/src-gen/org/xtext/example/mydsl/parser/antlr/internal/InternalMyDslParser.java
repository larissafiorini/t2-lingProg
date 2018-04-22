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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "'define'", "')'", "'lambda'", "'+'", "'-'", "'*'", "'/'", "'if'", "'='"
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
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

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
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_operation_0_0= ruleExpression ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operation_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_operation_0_0= ruleExpression ) )* )
            // InternalMyDsl.g:78:2: ( (lv_operation_0_0= ruleExpression ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_operation_0_0= ruleExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_INT||LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_operation_0_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_operation_0_0= ruleExpression )
            	    // InternalMyDsl.g:80:4: lv_operation_0_0= ruleExpression
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getOperationExpressionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_operation_0_0=ruleExpression();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"operation",
            	    					lv_operation_0_0,
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
    // InternalMyDsl.g:100:1: entryRuleDefine returns [String current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final String entryRuleDefine() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefine = null;


        try {
            // InternalMyDsl.g:100:46: (iv_ruleDefine= ruleDefine EOF )
            // InternalMyDsl.g:101:2: iv_ruleDefine= ruleDefine EOF
            {
             newCompositeNode(grammarAccess.getDefineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefine=ruleDefine();

            state._fsp--;

             current =iv_ruleDefine.getText(); 
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
    // InternalMyDsl.g:107:1: ruleDefine returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' kw= 'define' this_ID_2= RULE_ID this_INT_3= RULE_INT kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleDefine() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (kw= '(' kw= 'define' this_ID_2= RULE_ID this_INT_3= RULE_INT kw= ')' ) )
            // InternalMyDsl.g:114:2: (kw= '(' kw= 'define' this_ID_2= RULE_ID this_INT_3= RULE_INT kw= ')' )
            {
            // InternalMyDsl.g:114:2: (kw= '(' kw= 'define' this_ID_2= RULE_ID this_INT_3= RULE_INT kw= ')' )
            // InternalMyDsl.g:115:3: kw= '(' kw= 'define' this_ID_2= RULE_ID this_INT_3= RULE_INT kw= ')'
            {
            kw=(Token)match(input,11,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDefineAccess().getLeftParenthesisKeyword_0());
            		
            kw=(Token)match(input,12,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDefineAccess().getDefineKeyword_1());
            		
            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            			current.merge(this_ID_2);
            		

            			newLeafNode(this_ID_2, grammarAccess.getDefineAccess().getIDTerminalRuleCall_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_7); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getDefineAccess().getINTTerminalRuleCall_3());
            		
            kw=(Token)match(input,13,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDefineAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalMyDsl.g:148:1: entryRuleLambda returns [String current=null] : iv_ruleLambda= ruleLambda EOF ;
    public final String entryRuleLambda() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLambda = null;


        try {
            // InternalMyDsl.g:148:46: (iv_ruleLambda= ruleLambda EOF )
            // InternalMyDsl.g:149:2: iv_ruleLambda= ruleLambda EOF
            {
             newCompositeNode(grammarAccess.getLambdaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLambda=ruleLambda();

            state._fsp--;

             current =iv_ruleLambda.getText(); 
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
    // InternalMyDsl.g:155:1: ruleLambda returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' kw= 'lambda' kw= '(' (this_ID_3= RULE_ID | this_INT_4= RULE_INT ) (kw= ')' )* ) ;
    public final AntlrDatatypeRuleToken ruleLambda() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:161:2: ( (kw= '(' kw= 'lambda' kw= '(' (this_ID_3= RULE_ID | this_INT_4= RULE_INT ) (kw= ')' )* ) )
            // InternalMyDsl.g:162:2: (kw= '(' kw= 'lambda' kw= '(' (this_ID_3= RULE_ID | this_INT_4= RULE_INT ) (kw= ')' )* )
            {
            // InternalMyDsl.g:162:2: (kw= '(' kw= 'lambda' kw= '(' (this_ID_3= RULE_ID | this_INT_4= RULE_INT ) (kw= ')' )* )
            // InternalMyDsl.g:163:3: kw= '(' kw= 'lambda' kw= '(' (this_ID_3= RULE_ID | this_INT_4= RULE_INT ) (kw= ')' )*
            {
            kw=(Token)match(input,11,FOLLOW_8); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_0());
            		
            kw=(Token)match(input,14,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getLambdaAccess().getLambdaKeyword_1());
            		
            kw=(Token)match(input,11,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:178:3: (this_ID_3= RULE_ID | this_INT_4= RULE_INT )
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
                    // InternalMyDsl.g:179:4: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_11); 

                    				current.merge(this_ID_3);
                    			

                    				newLeafNode(this_ID_3, grammarAccess.getLambdaAccess().getIDTerminalRuleCall_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:187:4: this_INT_4= RULE_INT
                    {
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_11); 

                    				current.merge(this_INT_4);
                    			

                    				newLeafNode(this_INT_4, grammarAccess.getLambdaAccess().getINTTerminalRuleCall_3_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:195:3: (kw= ')' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:196:4: kw= ')'
            	    {
            	    kw=(Token)match(input,13,FOLLOW_11); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getLambdaAccess().getRightParenthesisKeyword_4());
            	    			

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


    // $ANTLR start "entryRuleOperator"
    // InternalMyDsl.g:206:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalMyDsl.g:206:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalMyDsl.g:207:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator.getText(); 
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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalMyDsl.g:213:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:219:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) )
            // InternalMyDsl.g:220:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            {
            // InternalMyDsl.g:220:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 18:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:221:3: kw= '+'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:227:3: kw= '-'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:233:3: kw= '*'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:239:3: kw= '/'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getSolidusKeyword_3());
                    		

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleConditional"
    // InternalMyDsl.g:248:1: entryRuleConditional returns [String current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final String entryRuleConditional() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditional = null;


        try {
            // InternalMyDsl.g:248:51: (iv_ruleConditional= ruleConditional EOF )
            // InternalMyDsl.g:249:2: iv_ruleConditional= ruleConditional EOF
            {
             newCompositeNode(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditional=ruleConditional();

            state._fsp--;

             current =iv_ruleConditional.getText(); 
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
    // InternalMyDsl.g:255:1: ruleConditional returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' kw= 'if' kw= '(' kw= '=' (this_INT_4= RULE_INT | this_ID_5= RULE_ID ) this_INT_6= RULE_INT kw= ')' this_INT_8= RULE_INT (kw= ')' )? ) ;
    public final AntlrDatatypeRuleToken ruleConditional() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_4=null;
        Token this_ID_5=null;
        Token this_INT_6=null;
        Token this_INT_8=null;


        	enterRule();

        try {
            // InternalMyDsl.g:261:2: ( (kw= '(' kw= 'if' kw= '(' kw= '=' (this_INT_4= RULE_INT | this_ID_5= RULE_ID ) this_INT_6= RULE_INT kw= ')' this_INT_8= RULE_INT (kw= ')' )? ) )
            // InternalMyDsl.g:262:2: (kw= '(' kw= 'if' kw= '(' kw= '=' (this_INT_4= RULE_INT | this_ID_5= RULE_ID ) this_INT_6= RULE_INT kw= ')' this_INT_8= RULE_INT (kw= ')' )? )
            {
            // InternalMyDsl.g:262:2: (kw= '(' kw= 'if' kw= '(' kw= '=' (this_INT_4= RULE_INT | this_ID_5= RULE_ID ) this_INT_6= RULE_INT kw= ')' this_INT_8= RULE_INT (kw= ')' )? )
            // InternalMyDsl.g:263:3: kw= '(' kw= 'if' kw= '(' kw= '=' (this_INT_4= RULE_INT | this_ID_5= RULE_ID ) this_INT_6= RULE_INT kw= ')' this_INT_8= RULE_INT (kw= ')' )?
            {
            kw=(Token)match(input,11,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_0());
            		
            kw=(Token)match(input,19,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getConditionalAccess().getIfKeyword_1());
            		
            kw=(Token)match(input,11,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_2());
            		
            kw=(Token)match(input,20,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getConditionalAccess().getEqualsSignKeyword_3());
            		
            // InternalMyDsl.g:283:3: (this_INT_4= RULE_INT | this_ID_5= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:284:4: this_INT_4= RULE_INT
                    {
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_6); 

                    				current.merge(this_INT_4);
                    			

                    				newLeafNode(this_INT_4, grammarAccess.getConditionalAccess().getINTTerminalRuleCall_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:292:4: this_ID_5= RULE_ID
                    {
                    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_6); 

                    				current.merge(this_ID_5);
                    			

                    				newLeafNode(this_ID_5, grammarAccess.getConditionalAccess().getIDTerminalRuleCall_4_1());
                    			

                    }
                    break;

            }

            this_INT_6=(Token)match(input,RULE_INT,FOLLOW_7); 

            			current.merge(this_INT_6);
            		

            			newLeafNode(this_INT_6, grammarAccess.getConditionalAccess().getINTTerminalRuleCall_5());
            		
            kw=(Token)match(input,13,FOLLOW_6); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getConditionalAccess().getRightParenthesisKeyword_6());
            		
            this_INT_8=(Token)match(input,RULE_INT,FOLLOW_11); 

            			current.merge(this_INT_8);
            		

            			newLeafNode(this_INT_8, grammarAccess.getConditionalAccess().getINTTerminalRuleCall_7());
            		
            // InternalMyDsl.g:319:3: (kw= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:320:4: kw= ')'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConditionalAccess().getRightParenthesisKeyword_8());
                    			

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


    // $ANTLR start "entryRuleVariable"
    // InternalMyDsl.g:330:1: entryRuleVariable returns [String current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final String entryRuleVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariable = null;


        try {
            // InternalMyDsl.g:330:48: (iv_ruleVariable= ruleVariable EOF )
            // InternalMyDsl.g:331:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable.getText(); 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMyDsl.g:337:1: ruleVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' this_Operator_1= ruleOperator this_ID_2= RULE_ID this_INT_3= RULE_INT kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_3=null;
        AntlrDatatypeRuleToken this_Operator_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:343:2: ( (kw= '(' this_Operator_1= ruleOperator this_ID_2= RULE_ID this_INT_3= RULE_INT kw= ')' ) )
            // InternalMyDsl.g:344:2: (kw= '(' this_Operator_1= ruleOperator this_ID_2= RULE_ID this_INT_3= RULE_INT kw= ')' )
            {
            // InternalMyDsl.g:344:2: (kw= '(' this_Operator_1= ruleOperator this_ID_2= RULE_ID this_INT_3= RULE_INT kw= ')' )
            // InternalMyDsl.g:345:3: kw= '(' this_Operator_1= ruleOperator this_ID_2= RULE_ID this_INT_3= RULE_INT kw= ')'
            {
            kw=(Token)match(input,11,FOLLOW_14); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getVariableAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getVariableAccess().getOperatorParserRuleCall_1());
            		
            pushFollow(FOLLOW_5);
            this_Operator_1=ruleOperator();

            state._fsp--;


            			current.merge(this_Operator_1);
            		

            			afterParserOrEnumRuleCall();
            		
            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            			current.merge(this_ID_2);
            		

            			newLeafNode(this_ID_2, grammarAccess.getVariableAccess().getIDTerminalRuleCall_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_7); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getVariableAccess().getINTTerminalRuleCall_3());
            		
            kw=(Token)match(input,13,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getVariableAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleFactorial"
    // InternalMyDsl.g:383:1: entryRuleFactorial returns [String current=null] : iv_ruleFactorial= ruleFactorial EOF ;
    public final String entryRuleFactorial() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFactorial = null;


        try {
            // InternalMyDsl.g:383:49: (iv_ruleFactorial= ruleFactorial EOF )
            // InternalMyDsl.g:384:2: iv_ruleFactorial= ruleFactorial EOF
            {
             newCompositeNode(grammarAccess.getFactorialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactorial=ruleFactorial();

            state._fsp--;

             current =iv_ruleFactorial.getText(); 
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
    // $ANTLR end "entryRuleFactorial"


    // $ANTLR start "ruleFactorial"
    // InternalMyDsl.g:390:1: ruleFactorial returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '(' this_ID_1= RULE_ID ) | (this_Variable_2= ruleVariable kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleFactorial() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_Variable_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:396:2: ( ( (kw= '(' this_ID_1= RULE_ID ) | (this_Variable_2= ruleVariable kw= ')' ) ) )
            // InternalMyDsl.g:397:2: ( (kw= '(' this_ID_1= RULE_ID ) | (this_Variable_2= ruleVariable kw= ')' ) )
            {
            // InternalMyDsl.g:397:2: ( (kw= '(' this_ID_1= RULE_ID ) | (this_Variable_2= ruleVariable kw= ')' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    alt7=1;
                }
                else if ( ((LA7_1>=15 && LA7_1<=18)) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:398:3: (kw= '(' this_ID_1= RULE_ID )
                    {
                    // InternalMyDsl.g:398:3: (kw= '(' this_ID_1= RULE_ID )
                    // InternalMyDsl.g:399:4: kw= '(' this_ID_1= RULE_ID
                    {
                    kw=(Token)match(input,11,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFactorialAccess().getLeftParenthesisKeyword_0_0());
                    			
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				current.merge(this_ID_1);
                    			

                    				newLeafNode(this_ID_1, grammarAccess.getFactorialAccess().getIDTerminalRuleCall_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:413:3: (this_Variable_2= ruleVariable kw= ')' )
                    {
                    // InternalMyDsl.g:413:3: (this_Variable_2= ruleVariable kw= ')' )
                    // InternalMyDsl.g:414:4: this_Variable_2= ruleVariable kw= ')'
                    {

                    				newCompositeNode(grammarAccess.getFactorialAccess().getVariableParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_7);
                    this_Variable_2=ruleVariable();

                    state._fsp--;


                    				current.merge(this_Variable_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,13,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFactorialAccess().getRightParenthesisKeyword_1_1());
                    			

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
    // $ANTLR end "ruleFactorial"


    // $ANTLR start "entryRuleOperation"
    // InternalMyDsl.g:434:1: entryRuleOperation returns [String current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final String entryRuleOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperation = null;


        try {
            // InternalMyDsl.g:434:49: (iv_ruleOperation= ruleOperation EOF )
            // InternalMyDsl.g:435:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation.getText(); 
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
    // InternalMyDsl.g:441:1: ruleOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '(' this_Operator_1= ruleOperator this_ID_2= RULE_ID ) | (this_Factorial_3= ruleFactorial kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_Operator_1 = null;

        AntlrDatatypeRuleToken this_Factorial_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:447:2: ( ( (kw= '(' this_Operator_1= ruleOperator this_ID_2= RULE_ID ) | (this_Factorial_3= ruleFactorial kw= ')' ) ) )
            // InternalMyDsl.g:448:2: ( (kw= '(' this_Operator_1= ruleOperator this_ID_2= RULE_ID ) | (this_Factorial_3= ruleFactorial kw= ')' ) )
            {
            // InternalMyDsl.g:448:2: ( (kw= '(' this_Operator_1= ruleOperator this_ID_2= RULE_ID ) | (this_Factorial_3= ruleFactorial kw= ')' ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:449:3: (kw= '(' this_Operator_1= ruleOperator this_ID_2= RULE_ID )
                    {
                    // InternalMyDsl.g:449:3: (kw= '(' this_Operator_1= ruleOperator this_ID_2= RULE_ID )
                    // InternalMyDsl.g:450:4: kw= '(' this_Operator_1= ruleOperator this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,11,FOLLOW_14); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getOperationAccess().getOperatorParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_5);
                    this_Operator_1=ruleOperator();

                    state._fsp--;


                    				current.merge(this_Operator_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				current.merge(this_ID_2);
                    			

                    				newLeafNode(this_ID_2, grammarAccess.getOperationAccess().getIDTerminalRuleCall_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:474:3: (this_Factorial_3= ruleFactorial kw= ')' )
                    {
                    // InternalMyDsl.g:474:3: (this_Factorial_3= ruleFactorial kw= ')' )
                    // InternalMyDsl.g:475:4: this_Factorial_3= ruleFactorial kw= ')'
                    {

                    				newCompositeNode(grammarAccess.getOperationAccess().getFactorialParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_7);
                    this_Factorial_3=ruleFactorial();

                    state._fsp--;


                    				current.merge(this_Factorial_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,13,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOperationAccess().getRightParenthesisKeyword_1_1());
                    			

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:495:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:495:50: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:496:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression.getText(); 
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
    // InternalMyDsl.g:502:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Define_0= ruleDefine | this_INT_1= RULE_INT | this_Lambda_2= ruleLambda | this_Conditional_3= ruleConditional | this_Variable_4= ruleVariable | this_Factorial_5= ruleFactorial | this_Operation_6= ruleOperation ) ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        AntlrDatatypeRuleToken this_Define_0 = null;

        AntlrDatatypeRuleToken this_Lambda_2 = null;

        AntlrDatatypeRuleToken this_Conditional_3 = null;

        AntlrDatatypeRuleToken this_Variable_4 = null;

        AntlrDatatypeRuleToken this_Factorial_5 = null;

        AntlrDatatypeRuleToken this_Operation_6 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:508:2: ( (this_Define_0= ruleDefine | this_INT_1= RULE_INT | this_Lambda_2= ruleLambda | this_Conditional_3= ruleConditional | this_Variable_4= ruleVariable | this_Factorial_5= ruleFactorial | this_Operation_6= ruleOperation ) )
            // InternalMyDsl.g:509:2: (this_Define_0= ruleDefine | this_INT_1= RULE_INT | this_Lambda_2= ruleLambda | this_Conditional_3= ruleConditional | this_Variable_4= ruleVariable | this_Factorial_5= ruleFactorial | this_Operation_6= ruleOperation )
            {
            // InternalMyDsl.g:509:2: (this_Define_0= ruleDefine | this_INT_1= RULE_INT | this_Lambda_2= ruleLambda | this_Conditional_3= ruleConditional | this_Variable_4= ruleVariable | this_Factorial_5= ruleFactorial | this_Operation_6= ruleOperation )
            int alt9=7;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:510:3: this_Define_0= ruleDefine
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getDefineParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Define_0=ruleDefine();

                    state._fsp--;


                    			current.merge(this_Define_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:521:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getExpressionAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:529:3: this_Lambda_2= ruleLambda
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getLambdaParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Lambda_2=ruleLambda();

                    state._fsp--;


                    			current.merge(this_Lambda_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:540:3: this_Conditional_3= ruleConditional
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getConditionalParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Conditional_3=ruleConditional();

                    state._fsp--;


                    			current.merge(this_Conditional_3);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:551:3: this_Variable_4= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getVariableParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_4=ruleVariable();

                    state._fsp--;


                    			current.merge(this_Variable_4);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:562:3: this_Factorial_5= ruleFactorial
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getFactorialParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Factorial_5=ruleFactorial();

                    state._fsp--;


                    			current.merge(this_Factorial_5);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:573:3: this_Operation_6= ruleOperation
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getOperationParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Operation_6=ruleOperation();

                    state._fsp--;


                    			current.merge(this_Operation_6);
                    		

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


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\7\uffff\1\10\1\uffff\1\10";
    static final String dfa_3s = "\1\13\5\4\1\uffff\1\5\1\uffff\1\5";
    static final String dfa_4s = "\1\13\1\22\4\4\1\uffff\1\13\1\uffff\1\15";
    static final String dfa_5s = "\6\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\6\12\uffff\1\2\1\3\1\4\1\5",
            "\1\7",
            "\1\7",
            "\1\7",
            "\1\7",
            "",
            "\1\11\5\uffff\1\10",
            "",
            "\1\10\5\uffff\1\10\1\uffff\1\6"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "448:2: ( (kw= '(' this_Operator_1= ruleOperator this_ID_2= RULE_ID ) | (this_Factorial_3= ruleFactorial kw= ')' ) )";
        }
    }
    static final String dfa_8s = "\22\uffff";
    static final String dfa_9s = "\12\uffff\1\14\1\15\2\uffff\1\15\1\20\1\uffff\1\14";
    static final String dfa_10s = "\1\5\1\4\4\uffff\4\4\2\5\2\uffff\2\5\1\uffff\1\5";
    static final String dfa_11s = "\1\13\1\23\4\uffff\4\4\1\15\1\13\2\uffff\2\15\1\uffff\1\15";
    static final String dfa_12s = "\2\uffff\1\2\1\4\1\1\1\3\6\uffff\1\6\1\7\2\uffff\1\5\1\uffff";
    static final String dfa_13s = "\22\uffff}>";
    static final String[] dfa_14s = {
            "\1\2\5\uffff\1\1",
            "\1\12\7\uffff\1\4\1\uffff\1\5\1\6\1\7\1\10\1\11\1\3",
            "",
            "",
            "",
            "",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\14\5\uffff\1\14\1\uffff\1\15",
            "\1\16\5\uffff\1\15",
            "",
            "",
            "\1\15\5\uffff\1\15\1\uffff\1\17",
            "\1\20\5\uffff\1\20\1\uffff\1\21",
            "",
            "\1\14\5\uffff\1\14\1\uffff\1\15"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "509:2: (this_Define_0= ruleDefine | this_INT_1= RULE_INT | this_Lambda_2= ruleLambda | this_Conditional_3= ruleConditional | this_Variable_4= ruleVariable | this_Factorial_5= ruleFactorial | this_Operation_6= ruleOperation )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000822L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000078000L});

}