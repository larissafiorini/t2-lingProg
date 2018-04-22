/*
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Model");
		private final Assignment cOperationAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cOperationExpressionParserRuleCall_0 = (RuleCall)cOperationAssignment.eContents().get(0);
		
		//Model:
		//	operation+=Expression*;
		@Override public ParserRule getRule() { return rule; }
		
		//operation+=Expression*
		public Assignment getOperationAssignment() { return cOperationAssignment; }
		
		//Expression
		public RuleCall getOperationExpressionParserRuleCall_0() { return cOperationExpressionParserRuleCall_0; }
	}
	public class DefineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Define");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cDefineKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Define:
		//	'(' 'define' ID INT ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'(' 'define' ID INT ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//'define'
		public Keyword getDefineKeyword_1() { return cDefineKeyword_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_2() { return cIDTerminalRuleCall_2; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_3() { return cINTTerminalRuleCall_3; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class LambdaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Lambda");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLambdaKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final RuleCall cIDTerminalRuleCall_3_0 = (RuleCall)cAlternatives_3.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_3_1 = (RuleCall)cAlternatives_3.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Lambda:
		//	'(' 'lambda' '(' (ID | INT) ')'*;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' 'lambda' '(' (ID | INT) ')'*
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//'lambda'
		public Keyword getLambdaKeyword_1() { return cLambdaKeyword_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//ID | INT
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_3_0() { return cIDTerminalRuleCall_3_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_3_1() { return cINTTerminalRuleCall_3_1; }
		
		//')'*
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class OperatorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Operator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cPlusSignKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cAsteriskKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cSolidusKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		
		//Operator:
		//	'+' | '-' | '*' | '/';
		@Override public ParserRule getRule() { return rule; }
		
		//'+' | '-' | '*' | '/'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'+'
		public Keyword getPlusSignKeyword_0() { return cPlusSignKeyword_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1() { return cHyphenMinusKeyword_1; }
		
		//'*'
		public Keyword getAsteriskKeyword_2() { return cAsteriskKeyword_2; }
		
		//'/'
		public Keyword getSolidusKeyword_3() { return cSolidusKeyword_3; }
	}
	public class ConditionalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Conditional");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cIfKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final RuleCall cINTTerminalRuleCall_4_0 = (RuleCall)cAlternatives_4.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_4_1 = (RuleCall)cAlternatives_4.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final RuleCall cINTTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final Keyword cRightParenthesisKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Conditional:
		//	'(' 'if' '(' '=' (INT | ID) INT ')' INT ')'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' 'if' '(' '=' (INT | ID) INT ')' INT ')'?
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//'if'
		public Keyword getIfKeyword_1() { return cIfKeyword_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//'='
		public Keyword getEqualsSignKeyword_3() { return cEqualsSignKeyword_3; }
		
		//INT | ID
		public Alternatives getAlternatives_4() { return cAlternatives_4; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_4_0() { return cINTTerminalRuleCall_4_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_4_1() { return cIDTerminalRuleCall_4_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_5() { return cINTTerminalRuleCall_5; }
		
		//')'
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_7() { return cINTTerminalRuleCall_7; }
		
		//')'?
		public Keyword getRightParenthesisKeyword_8() { return cRightParenthesisKeyword_8; }
	}
	public class VariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Variable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cOperatorParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Variable:
		//	'(' Operator ID INT ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'(' Operator ID INT ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//Operator
		public RuleCall getOperatorParserRuleCall_1() { return cOperatorParserRuleCall_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_2() { return cIDTerminalRuleCall_2; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_3() { return cINTTerminalRuleCall_3; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class FactorialElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Factorial");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final RuleCall cVariableParserRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		
		//Factorial:
		//	'(' ID | Variable ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'(' ID | Variable ')'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'(' ID
		public Group getGroup_0() { return cGroup_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_0() { return cLeftParenthesisKeyword_0_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0_1() { return cIDTerminalRuleCall_0_1; }
		
		//Variable ')'
		public Group getGroup_1() { return cGroup_1; }
		
		//Variable
		public RuleCall getVariableParserRuleCall_1_0() { return cVariableParserRuleCall_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_1() { return cRightParenthesisKeyword_1_1; }
	}
	public class OperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Operation");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cOperatorParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0_2 = (RuleCall)cGroup_0.eContents().get(2);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final RuleCall cFactorialParserRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		
		//Operation:
		//	'(' Operator ID | Factorial ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'(' Operator ID | Factorial ')'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'(' Operator ID
		public Group getGroup_0() { return cGroup_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_0() { return cLeftParenthesisKeyword_0_0; }
		
		//Operator
		public RuleCall getOperatorParserRuleCall_0_1() { return cOperatorParserRuleCall_0_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0_2() { return cIDTerminalRuleCall_0_2; }
		
		//Factorial ')'
		public Group getGroup_1() { return cGroup_1; }
		
		//Factorial
		public RuleCall getFactorialParserRuleCall_1_0() { return cFactorialParserRuleCall_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_1() { return cRightParenthesisKeyword_1_1; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Expression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDefineParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cLambdaParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cConditionalParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cVariableParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cFactorialParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cOperationParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		
		//Expression:
		//	Define | INT | Lambda | Conditional | Variable | Factorial | Operation;
		@Override public ParserRule getRule() { return rule; }
		
		//Define | INT | Lambda | Conditional | Variable | Factorial | Operation
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Define
		public RuleCall getDefineParserRuleCall_0() { return cDefineParserRuleCall_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
		
		//Lambda
		public RuleCall getLambdaParserRuleCall_2() { return cLambdaParserRuleCall_2; }
		
		//Conditional
		public RuleCall getConditionalParserRuleCall_3() { return cConditionalParserRuleCall_3; }
		
		//Variable
		public RuleCall getVariableParserRuleCall_4() { return cVariableParserRuleCall_4; }
		
		//Factorial
		public RuleCall getFactorialParserRuleCall_5() { return cFactorialParserRuleCall_5; }
		
		//Operation
		public RuleCall getOperationParserRuleCall_6() { return cOperationParserRuleCall_6; }
	}
	
	
	private final ModelElements pModel;
	private final DefineElements pDefine;
	private final LambdaElements pLambda;
	private final OperatorElements pOperator;
	private final ConditionalElements pConditional;
	private final VariableElements pVariable;
	private final FactorialElements pFactorial;
	private final OperationElements pOperation;
	private final ExpressionElements pExpression;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pDefine = new DefineElements();
		this.pLambda = new LambdaElements();
		this.pOperator = new OperatorElements();
		this.pConditional = new ConditionalElements();
		this.pVariable = new VariableElements();
		this.pFactorial = new FactorialElements();
		this.pOperation = new OperationElements();
		this.pExpression = new ExpressionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	operation+=Expression*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Define:
	//	'(' 'define' ID INT ')';
	public DefineElements getDefineAccess() {
		return pDefine;
	}
	
	public ParserRule getDefineRule() {
		return getDefineAccess().getRule();
	}
	
	//Lambda:
	//	'(' 'lambda' '(' (ID | INT) ')'*;
	public LambdaElements getLambdaAccess() {
		return pLambda;
	}
	
	public ParserRule getLambdaRule() {
		return getLambdaAccess().getRule();
	}
	
	//Operator:
	//	'+' | '-' | '*' | '/';
	public OperatorElements getOperatorAccess() {
		return pOperator;
	}
	
	public ParserRule getOperatorRule() {
		return getOperatorAccess().getRule();
	}
	
	//Conditional:
	//	'(' 'if' '(' '=' (INT | ID) INT ')' INT ')'?;
	public ConditionalElements getConditionalAccess() {
		return pConditional;
	}
	
	public ParserRule getConditionalRule() {
		return getConditionalAccess().getRule();
	}
	
	//Variable:
	//	'(' Operator ID INT ')';
	public VariableElements getVariableAccess() {
		return pVariable;
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}
	
	//Factorial:
	//	'(' ID | Variable ')';
	public FactorialElements getFactorialAccess() {
		return pFactorial;
	}
	
	public ParserRule getFactorialRule() {
		return getFactorialAccess().getRule();
	}
	
	//Operation:
	//	'(' Operator ID | Factorial ')';
	public OperationElements getOperationAccess() {
		return pOperation;
	}
	
	public ParserRule getOperationRule() {
		return getOperationAccess().getRule();
	}
	
	//Expression:
	//	Define | INT | Lambda | Conditional | Variable | Factorial | Operation;
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
