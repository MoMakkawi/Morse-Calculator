// Generated from c:\Users\HCC\Desktop\MorseCalculator\MorseCalculator\MorseCalculatorParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MorseCalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ZERO=1, ONE=2, TWO=3, THREE=4, FOUR=5, FIVE=6, SIX=7, SEVEN=8, EIGHT=9, 
		NINE=10, PLUS=11, MULTIPLY=12, MINUS=13, DIVIDE=14, ONEWHITESPACEATLIST=15;
	public static final int
		RULE_compileUnit = 0, RULE_equation = 1, RULE_arithoperation = 2, RULE_number = 3, 
		RULE_digit = 4;
	public static final String[] ruleNames = {
		"compileUnit", "equation", "arithoperation", "number", "digit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-----'", "'.----'", "'..---'", "'...--'", "'....-'", "'.....'", 
		"'-....'", "'--...'", "'---..'", "'----.'", "'.-.-.'", "'-..-'", "'-....-'", 
		"'-..-.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", 
		"NINE", "PLUS", "MULTIPLY", "MINUS", "DIVIDE", "ONEWHITESPACEATLIST"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MorseCalculatorParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MorseCalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompileUnitContext extends ParserRuleContext {
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MorseCalculatorParser.EOF, 0); }
		public CompileUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compileUnit; }
	}

	public final CompileUnitContext compileUnit() throws RecognitionException {
		CompileUnitContext _localctx = new CompileUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compileUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			equation();
			setState(11);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EquationContext extends ParserRuleContext {
		public List<ArithoperationContext> arithoperation() {
			return getRuleContexts(ArithoperationContext.class);
		}
		public ArithoperationContext arithoperation(int i) {
			return getRuleContext(ArithoperationContext.class,i);
		}
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_equation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(13);
				arithoperation(0);
				}
				}
				setState(16); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithoperationContext extends ParserRuleContext {
		public ArithoperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithoperation; }
	 
		public ArithoperationContext() { }
		public void copyFrom(ArithoperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstantContext extends ArithoperationContext {
		public NumberContext Number;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ConstantContext(ArithoperationContext ctx) { copyFrom(ctx); }
	}
	public static class OperationContext extends ArithoperationContext {
		public ArithoperationContext Left;
		public Token ArithmeticOperations;
		public ArithoperationContext Right;
		public List<ArithoperationContext> arithoperation() {
			return getRuleContexts(ArithoperationContext.class);
		}
		public ArithoperationContext arithoperation(int i) {
			return getRuleContext(ArithoperationContext.class,i);
		}
		public OperationContext(ArithoperationContext ctx) { copyFrom(ctx); }
	}

	public final ArithoperationContext arithoperation() throws RecognitionException {
		return arithoperation(0);
	}

	private ArithoperationContext arithoperation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithoperationContext _localctx = new ArithoperationContext(_ctx, _parentState);
		ArithoperationContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_arithoperation, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ConstantContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(19);
			((ConstantContext)_localctx).Number = number();
			}
			_ctx.stop = _input.LT(-1);
			setState(26);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperationContext(new ArithoperationContext(_parentctx, _parentState));
					((OperationContext)_localctx).Left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_arithoperation);
					setState(21);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(22);
					((OperationContext)_localctx).ArithmeticOperations = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MULTIPLY) | (1L << MINUS) | (1L << DIVIDE))) != 0)) ) {
						((OperationContext)_localctx).ArithmeticOperations = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(23);
					((OperationContext)_localctx).Right = arithoperation(3);
					}
					} 
				}
				setState(28);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_number);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(30); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(29);
					digit();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(32); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitContext extends ParserRuleContext {
		public TerminalNode ZERO() { return getToken(MorseCalculatorParser.ZERO, 0); }
		public TerminalNode ONE() { return getToken(MorseCalculatorParser.ONE, 0); }
		public TerminalNode TWO() { return getToken(MorseCalculatorParser.TWO, 0); }
		public TerminalNode THREE() { return getToken(MorseCalculatorParser.THREE, 0); }
		public TerminalNode FOUR() { return getToken(MorseCalculatorParser.FOUR, 0); }
		public TerminalNode FIVE() { return getToken(MorseCalculatorParser.FIVE, 0); }
		public TerminalNode SIX() { return getToken(MorseCalculatorParser.SIX, 0); }
		public TerminalNode SEVEN() { return getToken(MorseCalculatorParser.SEVEN, 0); }
		public TerminalNode EIGHT() { return getToken(MorseCalculatorParser.EIGHT, 0); }
		public TerminalNode NINE() { return getToken(MorseCalculatorParser.NINE, 0); }
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return arithoperation_sempred((ArithoperationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithoperation_sempred(ArithoperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21\'\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\3\6\3\21\n\3\r\3\16\3\22\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4\33\n\4\f\4\16\4\36\13\4\3\5\6\5!\n\5\r\5\16"+
		"\5\"\3\6\3\6\3\6\2\3\6\7\2\4\6\b\n\2\4\3\2\r\20\3\2\3\f\2$\2\f\3\2\2\2"+
		"\4\20\3\2\2\2\6\24\3\2\2\2\b \3\2\2\2\n$\3\2\2\2\f\r\5\4\3\2\r\16\7\2"+
		"\2\3\16\3\3\2\2\2\17\21\5\6\4\2\20\17\3\2\2\2\21\22\3\2\2\2\22\20\3\2"+
		"\2\2\22\23\3\2\2\2\23\5\3\2\2\2\24\25\b\4\1\2\25\26\5\b\5\2\26\34\3\2"+
		"\2\2\27\30\f\4\2\2\30\31\t\2\2\2\31\33\5\6\4\5\32\27\3\2\2\2\33\36\3\2"+
		"\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\7\3\2\2\2\36\34\3\2\2\2\37!\5\n\6"+
		"\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\t\3\2\2\2$%\t\3\2\2%"+
		"\13\3\2\2\2\5\22\34\"";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}