package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__ExpressionsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__ExpressionsAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__ExpressionsAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__ExpressionsAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Model__ExpressionsAssignment )*
            {
             before(grammarAccess.getModelAccess().getExpressionsAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Model__ExpressionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_INT||LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Model__ExpressionsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ExpressionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getExpressionsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDefine"
    // InternalMyDsl.g:78:1: entryRuleDefine : ruleDefine EOF ;
    public final void entryRuleDefine() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleDefine EOF )
            // InternalMyDsl.g:80:1: ruleDefine EOF
            {
             before(grammarAccess.getDefineRule()); 
            pushFollow(FOLLOW_1);
            ruleDefine();

            state._fsp--;

             after(grammarAccess.getDefineRule()); 
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
    // $ANTLR end "entryRuleDefine"


    // $ANTLR start "ruleDefine"
    // InternalMyDsl.g:87:1: ruleDefine : ( ( rule__Define__Group__0 ) ) ;
    public final void ruleDefine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Define__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Define__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Define__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Define__Group__0 )
            {
             before(grammarAccess.getDefineAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Define__Group__0 )
            // InternalMyDsl.g:94:4: rule__Define__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Define__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefine"


    // $ANTLR start "entryRuleLambda"
    // InternalMyDsl.g:103:1: entryRuleLambda : ruleLambda EOF ;
    public final void entryRuleLambda() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleLambda EOF )
            // InternalMyDsl.g:105:1: ruleLambda EOF
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
    // InternalMyDsl.g:112:1: ruleLambda : ( ( rule__Lambda__Group__0 ) ) ;
    public final void ruleLambda() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Lambda__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Lambda__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Lambda__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Lambda__Group__0 )
            {
             before(grammarAccess.getLambdaAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Lambda__Group__0 )
            // InternalMyDsl.g:119:4: rule__Lambda__Group__0
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


    // $ANTLR start "entryRuleConditional"
    // InternalMyDsl.g:128:1: entryRuleConditional : ruleConditional EOF ;
    public final void entryRuleConditional() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleConditional EOF )
            // InternalMyDsl.g:130:1: ruleConditional EOF
            {
             before(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_1);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getConditionalRule()); 
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
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalMyDsl.g:137:1: ruleConditional : ( ( rule__Conditional__Group__0 ) ) ;
    public final void ruleConditional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Conditional__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Conditional__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Conditional__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Conditional__Group__0 )
            {
             before(grammarAccess.getConditionalAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Conditional__Group__0 )
            // InternalMyDsl.g:144:4: rule__Conditional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleOperation"
    // InternalMyDsl.g:153:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleOperation EOF )
            // InternalMyDsl.g:155:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalMyDsl.g:162:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Operation__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Operation__Group__0 )
            // InternalMyDsl.g:169:4: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:178:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleExpression EOF )
            // InternalMyDsl.g:180:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:187:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Expression__Alternatives ) )
            // InternalMyDsl.g:193:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalMyDsl.g:194:3: ( rule__Expression__Alternatives )
            // InternalMyDsl.g:194:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "rule__Lambda__Alternatives_3"
    // InternalMyDsl.g:202:1: rule__Lambda__Alternatives_3 : ( ( ( rule__Lambda__NameAssignment_3_0 ) ) | ( ( rule__Lambda__ValueAssignment_3_1 ) ) );
    public final void rule__Lambda__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:206:1: ( ( ( rule__Lambda__NameAssignment_3_0 ) ) | ( ( rule__Lambda__ValueAssignment_3_1 ) ) )
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
                    // InternalMyDsl.g:207:2: ( ( rule__Lambda__NameAssignment_3_0 ) )
                    {
                    // InternalMyDsl.g:207:2: ( ( rule__Lambda__NameAssignment_3_0 ) )
                    // InternalMyDsl.g:208:3: ( rule__Lambda__NameAssignment_3_0 )
                    {
                     before(grammarAccess.getLambdaAccess().getNameAssignment_3_0()); 
                    // InternalMyDsl.g:209:3: ( rule__Lambda__NameAssignment_3_0 )
                    // InternalMyDsl.g:209:4: rule__Lambda__NameAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lambda__NameAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLambdaAccess().getNameAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:213:2: ( ( rule__Lambda__ValueAssignment_3_1 ) )
                    {
                    // InternalMyDsl.g:213:2: ( ( rule__Lambda__ValueAssignment_3_1 ) )
                    // InternalMyDsl.g:214:3: ( rule__Lambda__ValueAssignment_3_1 )
                    {
                     before(grammarAccess.getLambdaAccess().getValueAssignment_3_1()); 
                    // InternalMyDsl.g:215:3: ( rule__Lambda__ValueAssignment_3_1 )
                    // InternalMyDsl.g:215:4: rule__Lambda__ValueAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lambda__ValueAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLambdaAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__Lambda__Alternatives_3"


    // $ANTLR start "rule__Conditional__Alternatives_4"
    // InternalMyDsl.g:223:1: rule__Conditional__Alternatives_4 : ( ( ( rule__Conditional__ValueAssignment_4_0 ) ) | ( ( rule__Conditional__NameAssignment_4_1 ) ) );
    public final void rule__Conditional__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:227:1: ( ( ( rule__Conditional__ValueAssignment_4_0 ) ) | ( ( rule__Conditional__NameAssignment_4_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:228:2: ( ( rule__Conditional__ValueAssignment_4_0 ) )
                    {
                    // InternalMyDsl.g:228:2: ( ( rule__Conditional__ValueAssignment_4_0 ) )
                    // InternalMyDsl.g:229:3: ( rule__Conditional__ValueAssignment_4_0 )
                    {
                     before(grammarAccess.getConditionalAccess().getValueAssignment_4_0()); 
                    // InternalMyDsl.g:230:3: ( rule__Conditional__ValueAssignment_4_0 )
                    // InternalMyDsl.g:230:4: rule__Conditional__ValueAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conditional__ValueAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionalAccess().getValueAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:234:2: ( ( rule__Conditional__NameAssignment_4_1 ) )
                    {
                    // InternalMyDsl.g:234:2: ( ( rule__Conditional__NameAssignment_4_1 ) )
                    // InternalMyDsl.g:235:3: ( rule__Conditional__NameAssignment_4_1 )
                    {
                     before(grammarAccess.getConditionalAccess().getNameAssignment_4_1()); 
                    // InternalMyDsl.g:236:3: ( rule__Conditional__NameAssignment_4_1 )
                    // InternalMyDsl.g:236:4: rule__Conditional__NameAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conditional__NameAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionalAccess().getNameAssignment_4_1()); 

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
    // $ANTLR end "rule__Conditional__Alternatives_4"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalMyDsl.g:244:1: rule__Expression__Alternatives : ( ( ruleDefine ) | ( ( rule__Expression__ValueAssignment_1 ) ) | ( ruleLambda ) | ( ruleConditional ) | ( ruleOperation ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:248:1: ( ( ruleDefine ) | ( ( rule__Expression__ValueAssignment_1 ) ) | ( ruleLambda ) | ( ruleConditional ) | ( ruleOperation ) )
            int alt4=5;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                switch ( input.LA(2) ) {
                case 13:
                    {
                    alt4=1;
                    }
                    break;
                case 15:
                    {
                    alt4=3;
                    }
                    break;
                case RULE_OPERATOR:
                    {
                    alt4=5;
                    }
                    break;
                case 16:
                    {
                    alt4=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA4_0==RULE_INT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:249:2: ( ruleDefine )
                    {
                    // InternalMyDsl.g:249:2: ( ruleDefine )
                    // InternalMyDsl.g:250:3: ruleDefine
                    {
                     before(grammarAccess.getExpressionAccess().getDefineParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDefine();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getDefineParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:255:2: ( ( rule__Expression__ValueAssignment_1 ) )
                    {
                    // InternalMyDsl.g:255:2: ( ( rule__Expression__ValueAssignment_1 ) )
                    // InternalMyDsl.g:256:3: ( rule__Expression__ValueAssignment_1 )
                    {
                     before(grammarAccess.getExpressionAccess().getValueAssignment_1()); 
                    // InternalMyDsl.g:257:3: ( rule__Expression__ValueAssignment_1 )
                    // InternalMyDsl.g:257:4: rule__Expression__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:261:2: ( ruleLambda )
                    {
                    // InternalMyDsl.g:261:2: ( ruleLambda )
                    // InternalMyDsl.g:262:3: ruleLambda
                    {
                     before(grammarAccess.getExpressionAccess().getLambdaParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLambda();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getLambdaParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:267:2: ( ruleConditional )
                    {
                    // InternalMyDsl.g:267:2: ( ruleConditional )
                    // InternalMyDsl.g:268:3: ruleConditional
                    {
                     before(grammarAccess.getExpressionAccess().getConditionalParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleConditional();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getConditionalParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:273:2: ( ruleOperation )
                    {
                    // InternalMyDsl.g:273:2: ( ruleOperation )
                    // InternalMyDsl.g:274:3: ruleOperation
                    {
                     before(grammarAccess.getExpressionAccess().getOperationParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleOperation();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getOperationParserRuleCall_4()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Define__Group__0"
    // InternalMyDsl.g:283:1: rule__Define__Group__0 : rule__Define__Group__0__Impl rule__Define__Group__1 ;
    public final void rule__Define__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:287:1: ( rule__Define__Group__0__Impl rule__Define__Group__1 )
            // InternalMyDsl.g:288:2: rule__Define__Group__0__Impl rule__Define__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Define__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Define__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__0"


    // $ANTLR start "rule__Define__Group__0__Impl"
    // InternalMyDsl.g:295:1: rule__Define__Group__0__Impl : ( '(' ) ;
    public final void rule__Define__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:299:1: ( ( '(' ) )
            // InternalMyDsl.g:300:1: ( '(' )
            {
            // InternalMyDsl.g:300:1: ( '(' )
            // InternalMyDsl.g:301:2: '('
            {
             before(grammarAccess.getDefineAccess().getLeftParenthesisKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDefineAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__0__Impl"


    // $ANTLR start "rule__Define__Group__1"
    // InternalMyDsl.g:310:1: rule__Define__Group__1 : rule__Define__Group__1__Impl rule__Define__Group__2 ;
    public final void rule__Define__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:314:1: ( rule__Define__Group__1__Impl rule__Define__Group__2 )
            // InternalMyDsl.g:315:2: rule__Define__Group__1__Impl rule__Define__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Define__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Define__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__1"


    // $ANTLR start "rule__Define__Group__1__Impl"
    // InternalMyDsl.g:322:1: rule__Define__Group__1__Impl : ( 'define' ) ;
    public final void rule__Define__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:326:1: ( ( 'define' ) )
            // InternalMyDsl.g:327:1: ( 'define' )
            {
            // InternalMyDsl.g:327:1: ( 'define' )
            // InternalMyDsl.g:328:2: 'define'
            {
             before(grammarAccess.getDefineAccess().getDefineKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDefineAccess().getDefineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__1__Impl"


    // $ANTLR start "rule__Define__Group__2"
    // InternalMyDsl.g:337:1: rule__Define__Group__2 : rule__Define__Group__2__Impl rule__Define__Group__3 ;
    public final void rule__Define__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:1: ( rule__Define__Group__2__Impl rule__Define__Group__3 )
            // InternalMyDsl.g:342:2: rule__Define__Group__2__Impl rule__Define__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Define__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Define__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__2"


    // $ANTLR start "rule__Define__Group__2__Impl"
    // InternalMyDsl.g:349:1: rule__Define__Group__2__Impl : ( ( rule__Define__NameAssignment_2 ) ) ;
    public final void rule__Define__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:353:1: ( ( ( rule__Define__NameAssignment_2 ) ) )
            // InternalMyDsl.g:354:1: ( ( rule__Define__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:354:1: ( ( rule__Define__NameAssignment_2 ) )
            // InternalMyDsl.g:355:2: ( rule__Define__NameAssignment_2 )
            {
             before(grammarAccess.getDefineAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:356:2: ( rule__Define__NameAssignment_2 )
            // InternalMyDsl.g:356:3: rule__Define__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Define__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDefineAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__2__Impl"


    // $ANTLR start "rule__Define__Group__3"
    // InternalMyDsl.g:364:1: rule__Define__Group__3 : rule__Define__Group__3__Impl rule__Define__Group__4 ;
    public final void rule__Define__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:368:1: ( rule__Define__Group__3__Impl rule__Define__Group__4 )
            // InternalMyDsl.g:369:2: rule__Define__Group__3__Impl rule__Define__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Define__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Define__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__3"


    // $ANTLR start "rule__Define__Group__3__Impl"
    // InternalMyDsl.g:376:1: rule__Define__Group__3__Impl : ( ( rule__Define__ValueAssignment_3 ) ) ;
    public final void rule__Define__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:380:1: ( ( ( rule__Define__ValueAssignment_3 ) ) )
            // InternalMyDsl.g:381:1: ( ( rule__Define__ValueAssignment_3 ) )
            {
            // InternalMyDsl.g:381:1: ( ( rule__Define__ValueAssignment_3 ) )
            // InternalMyDsl.g:382:2: ( rule__Define__ValueAssignment_3 )
            {
             before(grammarAccess.getDefineAccess().getValueAssignment_3()); 
            // InternalMyDsl.g:383:2: ( rule__Define__ValueAssignment_3 )
            // InternalMyDsl.g:383:3: rule__Define__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Define__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDefineAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__3__Impl"


    // $ANTLR start "rule__Define__Group__4"
    // InternalMyDsl.g:391:1: rule__Define__Group__4 : rule__Define__Group__4__Impl ;
    public final void rule__Define__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:395:1: ( rule__Define__Group__4__Impl )
            // InternalMyDsl.g:396:2: rule__Define__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Define__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__4"


    // $ANTLR start "rule__Define__Group__4__Impl"
    // InternalMyDsl.g:402:1: rule__Define__Group__4__Impl : ( ')' ) ;
    public final void rule__Define__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:406:1: ( ( ')' ) )
            // InternalMyDsl.g:407:1: ( ')' )
            {
            // InternalMyDsl.g:407:1: ( ')' )
            // InternalMyDsl.g:408:2: ')'
            {
             before(grammarAccess.getDefineAccess().getRightParenthesisKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDefineAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__4__Impl"


    // $ANTLR start "rule__Lambda__Group__0"
    // InternalMyDsl.g:418:1: rule__Lambda__Group__0 : rule__Lambda__Group__0__Impl rule__Lambda__Group__1 ;
    public final void rule__Lambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:422:1: ( rule__Lambda__Group__0__Impl rule__Lambda__Group__1 )
            // InternalMyDsl.g:423:2: rule__Lambda__Group__0__Impl rule__Lambda__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:430:1: rule__Lambda__Group__0__Impl : ( '(' ) ;
    public final void rule__Lambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:434:1: ( ( '(' ) )
            // InternalMyDsl.g:435:1: ( '(' )
            {
            // InternalMyDsl.g:435:1: ( '(' )
            // InternalMyDsl.g:436:2: '('
            {
             before(grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_0()); 
            match(input,12,FOLLOW_2); 
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
    // InternalMyDsl.g:445:1: rule__Lambda__Group__1 : rule__Lambda__Group__1__Impl rule__Lambda__Group__2 ;
    public final void rule__Lambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:449:1: ( rule__Lambda__Group__1__Impl rule__Lambda__Group__2 )
            // InternalMyDsl.g:450:2: rule__Lambda__Group__1__Impl rule__Lambda__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:457:1: rule__Lambda__Group__1__Impl : ( 'lambda' ) ;
    public final void rule__Lambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:461:1: ( ( 'lambda' ) )
            // InternalMyDsl.g:462:1: ( 'lambda' )
            {
            // InternalMyDsl.g:462:1: ( 'lambda' )
            // InternalMyDsl.g:463:2: 'lambda'
            {
             before(grammarAccess.getLambdaAccess().getLambdaKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getLambdaKeyword_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:472:1: rule__Lambda__Group__2 : rule__Lambda__Group__2__Impl rule__Lambda__Group__3 ;
    public final void rule__Lambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:476:1: ( rule__Lambda__Group__2__Impl rule__Lambda__Group__3 )
            // InternalMyDsl.g:477:2: rule__Lambda__Group__2__Impl rule__Lambda__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:484:1: rule__Lambda__Group__2__Impl : ( '(' ) ;
    public final void rule__Lambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:488:1: ( ( '(' ) )
            // InternalMyDsl.g:489:1: ( '(' )
            {
            // InternalMyDsl.g:489:1: ( '(' )
            // InternalMyDsl.g:490:2: '('
            {
             before(grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:499:1: rule__Lambda__Group__3 : rule__Lambda__Group__3__Impl rule__Lambda__Group__4 ;
    public final void rule__Lambda__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:503:1: ( rule__Lambda__Group__3__Impl rule__Lambda__Group__4 )
            // InternalMyDsl.g:504:2: rule__Lambda__Group__3__Impl rule__Lambda__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:511:1: rule__Lambda__Group__3__Impl : ( ( rule__Lambda__Alternatives_3 ) ) ;
    public final void rule__Lambda__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:515:1: ( ( ( rule__Lambda__Alternatives_3 ) ) )
            // InternalMyDsl.g:516:1: ( ( rule__Lambda__Alternatives_3 ) )
            {
            // InternalMyDsl.g:516:1: ( ( rule__Lambda__Alternatives_3 ) )
            // InternalMyDsl.g:517:2: ( rule__Lambda__Alternatives_3 )
            {
             before(grammarAccess.getLambdaAccess().getAlternatives_3()); 
            // InternalMyDsl.g:518:2: ( rule__Lambda__Alternatives_3 )
            // InternalMyDsl.g:518:3: rule__Lambda__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getLambdaAccess().getAlternatives_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:526:1: rule__Lambda__Group__4 : rule__Lambda__Group__4__Impl ;
    public final void rule__Lambda__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:530:1: ( rule__Lambda__Group__4__Impl )
            // InternalMyDsl.g:531:2: rule__Lambda__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:537:1: rule__Lambda__Group__4__Impl : ( ( ')' )* ) ;
    public final void rule__Lambda__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:1: ( ( ( ')' )* ) )
            // InternalMyDsl.g:542:1: ( ( ')' )* )
            {
            // InternalMyDsl.g:542:1: ( ( ')' )* )
            // InternalMyDsl.g:543:2: ( ')' )*
            {
             before(grammarAccess.getLambdaAccess().getRightParenthesisKeyword_4()); 
            // InternalMyDsl.g:544:2: ( ')' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:544:3: ')'
            	    {
            	    match(input,14,FOLLOW_11); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getLambdaAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Conditional__Group__0"
    // InternalMyDsl.g:553:1: rule__Conditional__Group__0 : rule__Conditional__Group__0__Impl rule__Conditional__Group__1 ;
    public final void rule__Conditional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:557:1: ( rule__Conditional__Group__0__Impl rule__Conditional__Group__1 )
            // InternalMyDsl.g:558:2: rule__Conditional__Group__0__Impl rule__Conditional__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Conditional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__0"


    // $ANTLR start "rule__Conditional__Group__0__Impl"
    // InternalMyDsl.g:565:1: rule__Conditional__Group__0__Impl : ( '(' ) ;
    public final void rule__Conditional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:569:1: ( ( '(' ) )
            // InternalMyDsl.g:570:1: ( '(' )
            {
            // InternalMyDsl.g:570:1: ( '(' )
            // InternalMyDsl.g:571:2: '('
            {
             before(grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__0__Impl"


    // $ANTLR start "rule__Conditional__Group__1"
    // InternalMyDsl.g:580:1: rule__Conditional__Group__1 : rule__Conditional__Group__1__Impl rule__Conditional__Group__2 ;
    public final void rule__Conditional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:584:1: ( rule__Conditional__Group__1__Impl rule__Conditional__Group__2 )
            // InternalMyDsl.g:585:2: rule__Conditional__Group__1__Impl rule__Conditional__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Conditional__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__1"


    // $ANTLR start "rule__Conditional__Group__1__Impl"
    // InternalMyDsl.g:592:1: rule__Conditional__Group__1__Impl : ( 'if' ) ;
    public final void rule__Conditional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:596:1: ( ( 'if' ) )
            // InternalMyDsl.g:597:1: ( 'if' )
            {
            // InternalMyDsl.g:597:1: ( 'if' )
            // InternalMyDsl.g:598:2: 'if'
            {
             before(grammarAccess.getConditionalAccess().getIfKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getIfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__1__Impl"


    // $ANTLR start "rule__Conditional__Group__2"
    // InternalMyDsl.g:607:1: rule__Conditional__Group__2 : rule__Conditional__Group__2__Impl rule__Conditional__Group__3 ;
    public final void rule__Conditional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:611:1: ( rule__Conditional__Group__2__Impl rule__Conditional__Group__3 )
            // InternalMyDsl.g:612:2: rule__Conditional__Group__2__Impl rule__Conditional__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Conditional__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__2"


    // $ANTLR start "rule__Conditional__Group__2__Impl"
    // InternalMyDsl.g:619:1: rule__Conditional__Group__2__Impl : ( '(' ) ;
    public final void rule__Conditional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:623:1: ( ( '(' ) )
            // InternalMyDsl.g:624:1: ( '(' )
            {
            // InternalMyDsl.g:624:1: ( '(' )
            // InternalMyDsl.g:625:2: '('
            {
             before(grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__2__Impl"


    // $ANTLR start "rule__Conditional__Group__3"
    // InternalMyDsl.g:634:1: rule__Conditional__Group__3 : rule__Conditional__Group__3__Impl rule__Conditional__Group__4 ;
    public final void rule__Conditional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:638:1: ( rule__Conditional__Group__3__Impl rule__Conditional__Group__4 )
            // InternalMyDsl.g:639:2: rule__Conditional__Group__3__Impl rule__Conditional__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Conditional__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__3"


    // $ANTLR start "rule__Conditional__Group__3__Impl"
    // InternalMyDsl.g:646:1: rule__Conditional__Group__3__Impl : ( '=' ) ;
    public final void rule__Conditional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:650:1: ( ( '=' ) )
            // InternalMyDsl.g:651:1: ( '=' )
            {
            // InternalMyDsl.g:651:1: ( '=' )
            // InternalMyDsl.g:652:2: '='
            {
             before(grammarAccess.getConditionalAccess().getEqualsSignKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__3__Impl"


    // $ANTLR start "rule__Conditional__Group__4"
    // InternalMyDsl.g:661:1: rule__Conditional__Group__4 : rule__Conditional__Group__4__Impl rule__Conditional__Group__5 ;
    public final void rule__Conditional__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:665:1: ( rule__Conditional__Group__4__Impl rule__Conditional__Group__5 )
            // InternalMyDsl.g:666:2: rule__Conditional__Group__4__Impl rule__Conditional__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Conditional__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__4"


    // $ANTLR start "rule__Conditional__Group__4__Impl"
    // InternalMyDsl.g:673:1: rule__Conditional__Group__4__Impl : ( ( rule__Conditional__Alternatives_4 ) ) ;
    public final void rule__Conditional__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:677:1: ( ( ( rule__Conditional__Alternatives_4 ) ) )
            // InternalMyDsl.g:678:1: ( ( rule__Conditional__Alternatives_4 ) )
            {
            // InternalMyDsl.g:678:1: ( ( rule__Conditional__Alternatives_4 ) )
            // InternalMyDsl.g:679:2: ( rule__Conditional__Alternatives_4 )
            {
             before(grammarAccess.getConditionalAccess().getAlternatives_4()); 
            // InternalMyDsl.g:680:2: ( rule__Conditional__Alternatives_4 )
            // InternalMyDsl.g:680:3: rule__Conditional__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__4__Impl"


    // $ANTLR start "rule__Conditional__Group__5"
    // InternalMyDsl.g:688:1: rule__Conditional__Group__5 : rule__Conditional__Group__5__Impl rule__Conditional__Group__6 ;
    public final void rule__Conditional__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:692:1: ( rule__Conditional__Group__5__Impl rule__Conditional__Group__6 )
            // InternalMyDsl.g:693:2: rule__Conditional__Group__5__Impl rule__Conditional__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Conditional__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__5"


    // $ANTLR start "rule__Conditional__Group__5__Impl"
    // InternalMyDsl.g:700:1: rule__Conditional__Group__5__Impl : ( ( rule__Conditional__Value2Assignment_5 ) ) ;
    public final void rule__Conditional__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:704:1: ( ( ( rule__Conditional__Value2Assignment_5 ) ) )
            // InternalMyDsl.g:705:1: ( ( rule__Conditional__Value2Assignment_5 ) )
            {
            // InternalMyDsl.g:705:1: ( ( rule__Conditional__Value2Assignment_5 ) )
            // InternalMyDsl.g:706:2: ( rule__Conditional__Value2Assignment_5 )
            {
             before(grammarAccess.getConditionalAccess().getValue2Assignment_5()); 
            // InternalMyDsl.g:707:2: ( rule__Conditional__Value2Assignment_5 )
            // InternalMyDsl.g:707:3: rule__Conditional__Value2Assignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Value2Assignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getValue2Assignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__5__Impl"


    // $ANTLR start "rule__Conditional__Group__6"
    // InternalMyDsl.g:715:1: rule__Conditional__Group__6 : rule__Conditional__Group__6__Impl rule__Conditional__Group__7 ;
    public final void rule__Conditional__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:719:1: ( rule__Conditional__Group__6__Impl rule__Conditional__Group__7 )
            // InternalMyDsl.g:720:2: rule__Conditional__Group__6__Impl rule__Conditional__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Conditional__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__6"


    // $ANTLR start "rule__Conditional__Group__6__Impl"
    // InternalMyDsl.g:727:1: rule__Conditional__Group__6__Impl : ( ')' ) ;
    public final void rule__Conditional__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:731:1: ( ( ')' ) )
            // InternalMyDsl.g:732:1: ( ')' )
            {
            // InternalMyDsl.g:732:1: ( ')' )
            // InternalMyDsl.g:733:2: ')'
            {
             before(grammarAccess.getConditionalAccess().getRightParenthesisKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__6__Impl"


    // $ANTLR start "rule__Conditional__Group__7"
    // InternalMyDsl.g:742:1: rule__Conditional__Group__7 : rule__Conditional__Group__7__Impl rule__Conditional__Group__8 ;
    public final void rule__Conditional__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:746:1: ( rule__Conditional__Group__7__Impl rule__Conditional__Group__8 )
            // InternalMyDsl.g:747:2: rule__Conditional__Group__7__Impl rule__Conditional__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Conditional__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__7"


    // $ANTLR start "rule__Conditional__Group__7__Impl"
    // InternalMyDsl.g:754:1: rule__Conditional__Group__7__Impl : ( ( rule__Conditional__Value3Assignment_7 ) ) ;
    public final void rule__Conditional__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:758:1: ( ( ( rule__Conditional__Value3Assignment_7 ) ) )
            // InternalMyDsl.g:759:1: ( ( rule__Conditional__Value3Assignment_7 ) )
            {
            // InternalMyDsl.g:759:1: ( ( rule__Conditional__Value3Assignment_7 ) )
            // InternalMyDsl.g:760:2: ( rule__Conditional__Value3Assignment_7 )
            {
             before(grammarAccess.getConditionalAccess().getValue3Assignment_7()); 
            // InternalMyDsl.g:761:2: ( rule__Conditional__Value3Assignment_7 )
            // InternalMyDsl.g:761:3: rule__Conditional__Value3Assignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Value3Assignment_7();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getValue3Assignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__7__Impl"


    // $ANTLR start "rule__Conditional__Group__8"
    // InternalMyDsl.g:769:1: rule__Conditional__Group__8 : rule__Conditional__Group__8__Impl ;
    public final void rule__Conditional__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:773:1: ( rule__Conditional__Group__8__Impl )
            // InternalMyDsl.g:774:2: rule__Conditional__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__8"


    // $ANTLR start "rule__Conditional__Group__8__Impl"
    // InternalMyDsl.g:780:1: rule__Conditional__Group__8__Impl : ( ( ')' )? ) ;
    public final void rule__Conditional__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:784:1: ( ( ( ')' )? ) )
            // InternalMyDsl.g:785:1: ( ( ')' )? )
            {
            // InternalMyDsl.g:785:1: ( ( ')' )? )
            // InternalMyDsl.g:786:2: ( ')' )?
            {
             before(grammarAccess.getConditionalAccess().getRightParenthesisKeyword_8()); 
            // InternalMyDsl.g:787:2: ( ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:787:3: ')'
                    {
                    match(input,14,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getConditionalAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__8__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // InternalMyDsl.g:796:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:800:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalMyDsl.g:801:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // InternalMyDsl.g:808:1: rule__Operation__Group__0__Impl : ( '(' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:812:1: ( ( '(' ) )
            // InternalMyDsl.g:813:1: ( '(' )
            {
            // InternalMyDsl.g:813:1: ( '(' )
            // InternalMyDsl.g:814:2: '('
            {
             before(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // InternalMyDsl.g:823:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:827:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalMyDsl.g:828:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // InternalMyDsl.g:835:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__OpAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:839:1: ( ( ( rule__Operation__OpAssignment_1 ) ) )
            // InternalMyDsl.g:840:1: ( ( rule__Operation__OpAssignment_1 ) )
            {
            // InternalMyDsl.g:840:1: ( ( rule__Operation__OpAssignment_1 ) )
            // InternalMyDsl.g:841:2: ( rule__Operation__OpAssignment_1 )
            {
             before(grammarAccess.getOperationAccess().getOpAssignment_1()); 
            // InternalMyDsl.g:842:2: ( rule__Operation__OpAssignment_1 )
            // InternalMyDsl.g:842:3: rule__Operation__OpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__OpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getOpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // InternalMyDsl.g:850:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:854:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // InternalMyDsl.g:855:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // InternalMyDsl.g:862:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__ValueAssignment_2 ) ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:1: ( ( ( rule__Operation__ValueAssignment_2 ) ) )
            // InternalMyDsl.g:867:1: ( ( rule__Operation__ValueAssignment_2 ) )
            {
            // InternalMyDsl.g:867:1: ( ( rule__Operation__ValueAssignment_2 ) )
            // InternalMyDsl.g:868:2: ( rule__Operation__ValueAssignment_2 )
            {
             before(grammarAccess.getOperationAccess().getValueAssignment_2()); 
            // InternalMyDsl.g:869:2: ( rule__Operation__ValueAssignment_2 )
            // InternalMyDsl.g:869:3: rule__Operation__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Operation__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__3"
    // InternalMyDsl.g:877:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:881:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // InternalMyDsl.g:882:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
    // InternalMyDsl.g:889:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__Value2Assignment_3 ) ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:893:1: ( ( ( rule__Operation__Value2Assignment_3 ) ) )
            // InternalMyDsl.g:894:1: ( ( rule__Operation__Value2Assignment_3 ) )
            {
            // InternalMyDsl.g:894:1: ( ( rule__Operation__Value2Assignment_3 ) )
            // InternalMyDsl.g:895:2: ( rule__Operation__Value2Assignment_3 )
            {
             before(grammarAccess.getOperationAccess().getValue2Assignment_3()); 
            // InternalMyDsl.g:896:2: ( rule__Operation__Value2Assignment_3 )
            // InternalMyDsl.g:896:3: rule__Operation__Value2Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Value2Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getValue2Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__4"
    // InternalMyDsl.g:904:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:908:1: ( rule__Operation__Group__4__Impl )
            // InternalMyDsl.g:909:2: rule__Operation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4"


    // $ANTLR start "rule__Operation__Group__4__Impl"
    // InternalMyDsl.g:915:1: rule__Operation__Group__4__Impl : ( ')' ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:919:1: ( ( ')' ) )
            // InternalMyDsl.g:920:1: ( ')' )
            {
            // InternalMyDsl.g:920:1: ( ')' )
            // InternalMyDsl.g:921:2: ')'
            {
             before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4__Impl"


    // $ANTLR start "rule__Model__ExpressionsAssignment"
    // InternalMyDsl.g:931:1: rule__Model__ExpressionsAssignment : ( ruleExpression ) ;
    public final void rule__Model__ExpressionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:935:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:936:2: ( ruleExpression )
            {
            // InternalMyDsl.g:936:2: ( ruleExpression )
            // InternalMyDsl.g:937:3: ruleExpression
            {
             before(grammarAccess.getModelAccess().getExpressionsExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getModelAccess().getExpressionsExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ExpressionsAssignment"


    // $ANTLR start "rule__Define__NameAssignment_2"
    // InternalMyDsl.g:946:1: rule__Define__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Define__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:950:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:951:2: ( RULE_ID )
            {
            // InternalMyDsl.g:951:2: ( RULE_ID )
            // InternalMyDsl.g:952:3: RULE_ID
            {
             before(grammarAccess.getDefineAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefineAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__NameAssignment_2"


    // $ANTLR start "rule__Define__ValueAssignment_3"
    // InternalMyDsl.g:961:1: rule__Define__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__Define__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:965:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:966:2: ( RULE_INT )
            {
            // InternalMyDsl.g:966:2: ( RULE_INT )
            // InternalMyDsl.g:967:3: RULE_INT
            {
             before(grammarAccess.getDefineAccess().getValueINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDefineAccess().getValueINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__ValueAssignment_3"


    // $ANTLR start "rule__Lambda__NameAssignment_3_0"
    // InternalMyDsl.g:976:1: rule__Lambda__NameAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__Lambda__NameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:980:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:981:2: ( RULE_ID )
            {
            // InternalMyDsl.g:981:2: ( RULE_ID )
            // InternalMyDsl.g:982:3: RULE_ID
            {
             before(grammarAccess.getLambdaAccess().getNameIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getNameIDTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__NameAssignment_3_0"


    // $ANTLR start "rule__Lambda__ValueAssignment_3_1"
    // InternalMyDsl.g:991:1: rule__Lambda__ValueAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Lambda__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:995:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:996:2: ( RULE_INT )
            {
            // InternalMyDsl.g:996:2: ( RULE_INT )
            // InternalMyDsl.g:997:3: RULE_INT
            {
             before(grammarAccess.getLambdaAccess().getValueINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getValueINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__ValueAssignment_3_1"


    // $ANTLR start "rule__Conditional__ValueAssignment_4_0"
    // InternalMyDsl.g:1006:1: rule__Conditional__ValueAssignment_4_0 : ( RULE_INT ) ;
    public final void rule__Conditional__ValueAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1010:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1011:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1011:2: ( RULE_INT )
            // InternalMyDsl.g:1012:3: RULE_INT
            {
             before(grammarAccess.getConditionalAccess().getValueINTTerminalRuleCall_4_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getValueINTTerminalRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__ValueAssignment_4_0"


    // $ANTLR start "rule__Conditional__NameAssignment_4_1"
    // InternalMyDsl.g:1021:1: rule__Conditional__NameAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__Conditional__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1025:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1026:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1026:2: ( RULE_ID )
            // InternalMyDsl.g:1027:3: RULE_ID
            {
             before(grammarAccess.getConditionalAccess().getNameIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getNameIDTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__NameAssignment_4_1"


    // $ANTLR start "rule__Conditional__Value2Assignment_5"
    // InternalMyDsl.g:1036:1: rule__Conditional__Value2Assignment_5 : ( RULE_INT ) ;
    public final void rule__Conditional__Value2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1040:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1041:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1041:2: ( RULE_INT )
            // InternalMyDsl.g:1042:3: RULE_INT
            {
             before(grammarAccess.getConditionalAccess().getValue2INTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getValue2INTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Value2Assignment_5"


    // $ANTLR start "rule__Conditional__Value3Assignment_7"
    // InternalMyDsl.g:1051:1: rule__Conditional__Value3Assignment_7 : ( RULE_INT ) ;
    public final void rule__Conditional__Value3Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1055:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1056:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1056:2: ( RULE_INT )
            // InternalMyDsl.g:1057:3: RULE_INT
            {
             before(grammarAccess.getConditionalAccess().getValue3INTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getValue3INTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Value3Assignment_7"


    // $ANTLR start "rule__Operation__OpAssignment_1"
    // InternalMyDsl.g:1066:1: rule__Operation__OpAssignment_1 : ( RULE_OPERATOR ) ;
    public final void rule__Operation__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1070:1: ( ( RULE_OPERATOR ) )
            // InternalMyDsl.g:1071:2: ( RULE_OPERATOR )
            {
            // InternalMyDsl.g:1071:2: ( RULE_OPERATOR )
            // InternalMyDsl.g:1072:3: RULE_OPERATOR
            {
             before(grammarAccess.getOperationAccess().getOpOPERATORTerminalRuleCall_1_0()); 
            match(input,RULE_OPERATOR,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getOpOPERATORTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__OpAssignment_1"


    // $ANTLR start "rule__Operation__ValueAssignment_2"
    // InternalMyDsl.g:1081:1: rule__Operation__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__Operation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1085:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1086:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1086:2: ( RULE_INT )
            // InternalMyDsl.g:1087:3: RULE_INT
            {
             before(grammarAccess.getOperationAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ValueAssignment_2"


    // $ANTLR start "rule__Operation__Value2Assignment_3"
    // InternalMyDsl.g:1096:1: rule__Operation__Value2Assignment_3 : ( RULE_INT ) ;
    public final void rule__Operation__Value2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1100:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1101:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1101:2: ( RULE_INT )
            // InternalMyDsl.g:1102:3: RULE_INT
            {
             before(grammarAccess.getOperationAccess().getValue2INTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getValue2INTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Value2Assignment_3"


    // $ANTLR start "rule__Expression__ValueAssignment_1"
    // InternalMyDsl.g:1111:1: rule__Expression__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Expression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1115:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1116:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1116:2: ( RULE_INT )
            // InternalMyDsl.g:1117:3: RULE_INT
            {
             before(grammarAccess.getExpressionAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ValueAssignment_1"

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