// Generated from ABCMusic.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ABCMusicParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__25=1, T__24=2, T__23=3, T__22=4, T__21=5, T__20=6, T__19=7, T__18=8, 
		T__17=9, T__16=10, T__15=11, T__14=12, T__13=13, T__12=14, T__11=15, T__10=16, 
		T__9=17, T__8=18, T__7=19, T__6=20, T__5=21, T__4=22, T__3=23, T__2=24, 
		T__1=25, T__0=26, LINEFEED=27, TEXT=28, DIGIT=29, BASENOTE=30, KEYACCIDENTAL=31, 
		MODEMINOR=32, SPACE=33, REST=34, OCTAVE=35, ACCIDENTAL=36, BARLINE=37;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'C'", "'C:'", "'*'", "'-'", "'['", "'('", "'X:'", 
		"'T:'", "'Q:'", "'w:'", "' '", "'-'", "'M:'", "'[2'", "'%'", "'L:'", "'_'", 
		"'='", "'V:'", "'K:'", "'[1'", "'/'", "'~'", "'C|'", "'|'", "LINEFEED", 
		"TEXT", "DIGIT", "BASENOTE", "KEYACCIDENTAL", "'m'", "SPACE", "'z'", "OCTAVE", 
		"ACCIDENTAL", "BARLINE"
	};
	public static final int
		RULE_abc_tune = 0, RULE_abc_header = 1, RULE_field_number = 2, RULE_field_title = 3, 
		RULE_other_fields = 4, RULE_field_composer = 5, RULE_field_default_length = 6, 
		RULE_field_meter = 7, RULE_field_tempo = 8, RULE_field_voice = 9, RULE_field_key = 10, 
		RULE_comment = 11, RULE_note_length_strict = 12, RULE_meter = 13, RULE_meter_fraction = 14, 
		RULE_tempo = 15, RULE_key = 16, RULE_abc_music = 17, RULE_abc_line = 18, 
		RULE_element = 19, RULE_note_element = 20, RULE_note = 21, RULE_note_or_rest = 22, 
		RULE_pitch = 23, RULE_note_length = 24, RULE_tuplet_element = 25, RULE_tuplet_spec = 26, 
		RULE_multi_note = 27, RULE_nth_repeat = 28, RULE_mid_tune_field = 29, 
		RULE_end_of_line = 30, RULE_lyric = 31, RULE_lyrical_element = 32;
	public static final String[] ruleNames = {
		"abc_tune", "abc_header", "field_number", "field_title", "other_fields", 
		"field_composer", "field_default_length", "field_meter", "field_tempo", 
		"field_voice", "field_key", "comment", "note_length_strict", "meter", 
		"meter_fraction", "tempo", "key", "abc_music", "abc_line", "element", 
		"note_element", "note", "note_or_rest", "pitch", "note_length", "tuplet_element", 
		"tuplet_spec", "multi_note", "nth_repeat", "mid_tune_field", "end_of_line", 
		"lyric", "lyrical_element"
	};

	@Override
	public String getGrammarFileName() { return "ABCMusic.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	    // This method makes the lexer or parser stop running if it encounters
	    // invalid input and throw a RuntimeException.
	    public void reportErrorsAsExceptions() {
	        removeErrorListeners();
	        addErrorListener(new ExceptionThrowingErrorListener());
	    }

	    private static class ExceptionThrowingErrorListener extends BaseErrorListener {
	        @Override
	        public void syntaxError(Recognizer<?, ?> recognizer,
	                Object offendingSymbol, int line, int charPositionInLine,
	                String msg, RecognitionException e) {
	            throw new RuntimeException(msg);
	        }
	    }

	public ABCMusicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Abc_tuneContext extends ParserRuleContext {
		public Abc_musicContext abc_music() {
			return getRuleContext(Abc_musicContext.class,0);
		}
		public Abc_headerContext abc_header() {
			return getRuleContext(Abc_headerContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ABCMusicParser.EOF, 0); }
		public Abc_tuneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_tune; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbc_tune(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbc_tune(this);
		}
	}

	public final Abc_tuneContext abc_tune() throws RecognitionException {
		Abc_tuneContext _localctx = new Abc_tuneContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_abc_tune);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); abc_header();
			setState(67); abc_music();
			setState(68); match(EOF);
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

	public static class Abc_headerContext extends ParserRuleContext {
		public Field_keyContext field_key() {
			return getRuleContext(Field_keyContext.class,0);
		}
		public List<Other_fieldsContext> other_fields() {
			return getRuleContexts(Other_fieldsContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public Other_fieldsContext other_fields(int i) {
			return getRuleContext(Other_fieldsContext.class,i);
		}
		public Field_numberContext field_number() {
			return getRuleContext(Field_numberContext.class,0);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public Field_titleContext field_title() {
			return getRuleContext(Field_titleContext.class,0);
		}
		public Abc_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbc_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbc_header(this);
		}
	}

	public final Abc_headerContext abc_header() throws RecognitionException {
		Abc_headerContext _localctx = new Abc_headerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_abc_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); field_number();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==16) {
				{
				{
				setState(71); comment();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77); field_title();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 10) | (1L << 14) | (1L << 16) | (1L << 17) | (1L << 20))) != 0)) {
				{
				{
				setState(78); other_fields();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84); field_key();
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

	public static class Field_numberContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(ABCMusicParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(ABCMusicParser.DIGIT); }
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public Field_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_number(this);
		}
	}

	public final Field_numberContext field_number() throws RecognitionException {
		Field_numberContext _localctx = new Field_numberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_field_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(8);
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(87); match(DIGIT);
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(92); end_of_line();
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

	public static class Field_titleContext extends ParserRuleContext {
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(ABCMusicParser.TEXT, 0); }
		public Field_titleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_title(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_title(this);
		}
	}

	public final Field_titleContext field_title() throws RecognitionException {
		Field_titleContext _localctx = new Field_titleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); match(9);
			setState(95); match(TEXT);
			setState(96); end_of_line();
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

	public static class Other_fieldsContext extends ParserRuleContext {
		public Field_tempoContext field_tempo() {
			return getRuleContext(Field_tempoContext.class,0);
		}
		public Field_default_lengthContext field_default_length() {
			return getRuleContext(Field_default_lengthContext.class,0);
		}
		public Field_meterContext field_meter() {
			return getRuleContext(Field_meterContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Field_composerContext field_composer() {
			return getRuleContext(Field_composerContext.class,0);
		}
		public Field_voiceContext field_voice() {
			return getRuleContext(Field_voiceContext.class,0);
		}
		public Other_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterOther_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitOther_fields(this);
		}
	}

	public final Other_fieldsContext other_fields() throws RecognitionException {
		Other_fieldsContext _localctx = new Other_fieldsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_other_fields);
		try {
			setState(104);
			switch (_input.LA(1)) {
			case 3:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); field_composer();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 2);
				{
				setState(99); field_default_length();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 3);
				{
				setState(100); field_meter();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 4);
				{
				setState(101); field_tempo();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 5);
				{
				setState(102); field_voice();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 6);
				{
				setState(103); comment();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Field_composerContext extends ParserRuleContext {
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(ABCMusicParser.TEXT, 0); }
		public Field_composerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_composer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_composer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_composer(this);
		}
	}

	public final Field_composerContext field_composer() throws RecognitionException {
		Field_composerContext _localctx = new Field_composerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_field_composer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(3);
			setState(107); match(TEXT);
			setState(108); end_of_line();
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

	public static class Field_default_lengthContext extends ParserRuleContext {
		public Note_length_strictContext note_length_strict() {
			return getRuleContext(Note_length_strictContext.class,0);
		}
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public Field_default_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_default_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_default_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_default_length(this);
		}
	}

	public final Field_default_lengthContext field_default_length() throws RecognitionException {
		Field_default_lengthContext _localctx = new Field_default_lengthContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field_default_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(17);
			setState(111); note_length_strict();
			setState(112); end_of_line();
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

	public static class Field_meterContext extends ParserRuleContext {
		public MeterContext meter() {
			return getRuleContext(MeterContext.class,0);
		}
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public Field_meterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_meter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_meter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_meter(this);
		}
	}

	public final Field_meterContext field_meter() throws RecognitionException {
		Field_meterContext _localctx = new Field_meterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_field_meter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(14);
			setState(115); meter();
			setState(116); end_of_line();
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

	public static class Field_tempoContext extends ParserRuleContext {
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public TempoContext tempo() {
			return getRuleContext(TempoContext.class,0);
		}
		public Field_tempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_tempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_tempo(this);
		}
	}

	public final Field_tempoContext field_tempo() throws RecognitionException {
		Field_tempoContext _localctx = new Field_tempoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_field_tempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(10);
			setState(119); tempo();
			setState(120); end_of_line();
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

	public static class Field_voiceContext extends ParserRuleContext {
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(ABCMusicParser.TEXT, 0); }
		public Field_voiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_voice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_voice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_voice(this);
		}
	}

	public final Field_voiceContext field_voice() throws RecognitionException {
		Field_voiceContext _localctx = new Field_voiceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_field_voice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(20);
			setState(123); match(TEXT);
			setState(124); end_of_line();
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

	public static class Field_keyContext extends ParserRuleContext {
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public Field_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_key(this);
		}
	}

	public final Field_keyContext field_key() throws RecognitionException {
		Field_keyContext _localctx = new Field_keyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_field_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(21);
			setState(127); key();
			setState(128); end_of_line();
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(ABCMusicParser.TEXT, 0); }
		public TerminalNode LINEFEED() { return getToken(ABCMusicParser.LINEFEED, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); match(16);
			setState(131); match(TEXT);
			setState(132); match(LINEFEED);
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

	public static class Note_length_strictContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(ABCMusicParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(ABCMusicParser.DIGIT); }
		public Note_length_strictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_length_strict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote_length_strict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote_length_strict(this);
		}
	}

	public final Note_length_strictContext note_length_strict() throws RecognitionException {
		Note_length_strictContext _localctx = new Note_length_strictContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_note_length_strict);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(134); match(DIGIT);
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(139); match(23);
			setState(141); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(140); match(DIGIT);
				}
				}
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class MeterContext extends ParserRuleContext {
		public Meter_fractionContext meter_fraction() {
			return getRuleContext(Meter_fractionContext.class,0);
		}
		public MeterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMeter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMeter(this);
		}
	}

	public final MeterContext meter() throws RecognitionException {
		MeterContext _localctx = new MeterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_meter);
		try {
			setState(148);
			switch (_input.LA(1)) {
			case 2:
				enterOuterAlt(_localctx, 1);
				{
				setState(145); match(2);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 2);
				{
				setState(146); match(25);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(147); meter_fraction();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Meter_fractionContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(ABCMusicParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(ABCMusicParser.DIGIT); }
		public Meter_fractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meter_fraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMeter_fraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMeter_fraction(this);
		}
	}

	public final Meter_fractionContext meter_fraction() throws RecognitionException {
		Meter_fractionContext _localctx = new Meter_fractionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_meter_fraction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(150); match(DIGIT);
				}
				}
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(155); match(23);
			setState(157); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(156); match(DIGIT);
				}
				}
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class TempoContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(ABCMusicParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(ABCMusicParser.DIGIT); }
		public Meter_fractionContext meter_fraction() {
			return getRuleContext(Meter_fractionContext.class,0);
		}
		public TempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTempo(this);
		}
	}

	public final TempoContext tempo() throws RecognitionException {
		TempoContext _localctx = new TempoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tempo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); meter_fraction();
			setState(162); match(19);
			setState(164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(163); match(DIGIT);
				}
				}
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode BASENOTE() { return getToken(ABCMusicParser.BASENOTE, 0); }
		public TerminalNode MODEMINOR() { return getToken(ABCMusicParser.MODEMINOR, 0); }
		public TerminalNode KEYACCIDENTAL() { return getToken(ABCMusicParser.KEYACCIDENTAL, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); match(BASENOTE);
			setState(170);
			_la = _input.LA(1);
			if (_la==KEYACCIDENTAL) {
				{
				setState(169); match(KEYACCIDENTAL);
				}
			}

			setState(173);
			_la = _input.LA(1);
			if (_la==MODEMINOR) {
				{
				setState(172); match(MODEMINOR);
				}
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

	public static class Abc_musicContext extends ParserRuleContext {
		public Abc_lineContext abc_line(int i) {
			return getRuleContext(Abc_lineContext.class,i);
		}
		public List<Abc_lineContext> abc_line() {
			return getRuleContexts(Abc_lineContext.class);
		}
		public Abc_musicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_music; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbc_music(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbc_music(this);
		}
	}

	public final Abc_musicContext abc_music() throws RecognitionException {
		Abc_musicContext _localctx = new Abc_musicContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_abc_music);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(175); abc_line();
				}
				}
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 15) | (1L << 16) | (1L << 20) | (1L << 22) | (1L << BASENOTE) | (1L << SPACE) | (1L << REST) | (1L << ACCIDENTAL) | (1L << BARLINE))) != 0) );
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

	public static class Abc_lineContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public LyricContext lyric() {
			return getRuleContext(LyricContext.class,0);
		}
		public Mid_tune_fieldContext mid_tune_field() {
			return getRuleContext(Mid_tune_fieldContext.class,0);
		}
		public TerminalNode LINEFEED(int i) {
			return getToken(ABCMusicParser.LINEFEED, i);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public List<TerminalNode> LINEFEED() { return getTokens(ABCMusicParser.LINEFEED); }
		public Abc_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbc_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbc_line(this);
		}
	}

	public final Abc_lineContext abc_line() throws RecognitionException {
		Abc_lineContext _localctx = new Abc_lineContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_abc_line);
		int _la;
		try {
			setState(193);
			switch (_input.LA(1)) {
			case 6:
			case 7:
			case 15:
			case 22:
			case BASENOTE:
			case SPACE:
			case REST:
			case ACCIDENTAL:
			case BARLINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(180); element();
					}
					}
					setState(183); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 15) | (1L << 22) | (1L << BASENOTE) | (1L << SPACE) | (1L << REST) | (1L << ACCIDENTAL) | (1L << BARLINE))) != 0) );
				setState(185); match(LINEFEED);
				setState(189);
				_la = _input.LA(1);
				if (_la==11) {
					{
					setState(186); lyric();
					setState(187); match(LINEFEED);
					}
				}

				}
				break;
			case 20:
				enterOuterAlt(_localctx, 2);
				{
				setState(191); mid_tune_field();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 3);
				{
				setState(192); comment();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode BARLINE() { return getToken(ABCMusicParser.BARLINE, 0); }
		public TerminalNode SPACE() { return getToken(ABCMusicParser.SPACE, 0); }
		public Note_elementContext note_element() {
			return getRuleContext(Note_elementContext.class,0);
		}
		public Tuplet_elementContext tuplet_element() {
			return getRuleContext(Tuplet_elementContext.class,0);
		}
		public Nth_repeatContext nth_repeat() {
			return getRuleContext(Nth_repeatContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_element);
		try {
			setState(200);
			switch (_input.LA(1)) {
			case 6:
			case BASENOTE:
			case REST:
			case ACCIDENTAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(195); note_element();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 2);
				{
				setState(196); tuplet_element();
				}
				break;
			case BARLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(197); match(BARLINE);
				}
				break;
			case 15:
			case 22:
				enterOuterAlt(_localctx, 4);
				{
				setState(198); nth_repeat();
				}
				break;
			case SPACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(199); match(SPACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Note_elementContext extends ParserRuleContext {
		public Multi_noteContext multi_note() {
			return getRuleContext(Multi_noteContext.class,0);
		}
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public Note_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote_element(this);
		}
	}

	public final Note_elementContext note_element() throws RecognitionException {
		Note_elementContext _localctx = new Note_elementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_note_element);
		try {
			setState(204);
			switch (_input.LA(1)) {
			case BASENOTE:
			case REST:
			case ACCIDENTAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(202); note();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 2);
				{
				setState(203); multi_note();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NoteContext extends ParserRuleContext {
		public Note_or_restContext note_or_rest() {
			return getRuleContext(Note_or_restContext.class,0);
		}
		public Note_lengthContext note_length() {
			return getRuleContext(Note_lengthContext.class,0);
		}
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); note_or_rest();
			setState(208);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(207); note_length();
				}
				break;
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

	public static class Note_or_restContext extends ParserRuleContext {
		public TerminalNode REST() { return getToken(ABCMusicParser.REST, 0); }
		public PitchContext pitch() {
			return getRuleContext(PitchContext.class,0);
		}
		public Note_or_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_or_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote_or_rest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote_or_rest(this);
		}
	}

	public final Note_or_restContext note_or_rest() throws RecognitionException {
		Note_or_restContext _localctx = new Note_or_restContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_note_or_rest);
		try {
			setState(212);
			switch (_input.LA(1)) {
			case BASENOTE:
			case ACCIDENTAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(210); pitch();
				}
				break;
			case REST:
				enterOuterAlt(_localctx, 2);
				{
				setState(211); match(REST);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PitchContext extends ParserRuleContext {
		public TerminalNode OCTAVE() { return getToken(ABCMusicParser.OCTAVE, 0); }
		public TerminalNode BASENOTE() { return getToken(ABCMusicParser.BASENOTE, 0); }
		public TerminalNode ACCIDENTAL() { return getToken(ABCMusicParser.ACCIDENTAL, 0); }
		public PitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterPitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitPitch(this);
		}
	}

	public final PitchContext pitch() throws RecognitionException {
		PitchContext _localctx = new PitchContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if (_la==ACCIDENTAL) {
				{
				setState(214); match(ACCIDENTAL);
				}
			}

			setState(217); match(BASENOTE);
			setState(219);
			_la = _input.LA(1);
			if (_la==OCTAVE) {
				{
				setState(218); match(OCTAVE);
				}
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

	public static class Note_lengthContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(ABCMusicParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(ABCMusicParser.DIGIT); }
		public Note_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote_length(this);
		}
	}

	public final Note_lengthContext note_length() throws RecognitionException {
		Note_lengthContext _localctx = new Note_lengthContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_note_length);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_la = _input.LA(1);
			if (_la==DIGIT) {
				{
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(221); match(DIGIT);
					}
					}
					setState(224); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
			}

			setState(236);
			_la = _input.LA(1);
			if (_la==23) {
				{
				setState(228); match(23);
				setState(234);
				_la = _input.LA(1);
				if (_la==DIGIT) {
					{
					setState(230); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(229); match(DIGIT);
						}
						}
						setState(232); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==DIGIT );
					}
				}

				}
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

	public static class Tuplet_elementContext extends ParserRuleContext {
		public Note_elementContext note_element(int i) {
			return getRuleContext(Note_elementContext.class,i);
		}
		public List<Note_elementContext> note_element() {
			return getRuleContexts(Note_elementContext.class);
		}
		public Tuplet_specContext tuplet_spec() {
			return getRuleContext(Tuplet_specContext.class,0);
		}
		public Tuplet_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplet_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTuplet_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTuplet_element(this);
		}
	}

	public final Tuplet_elementContext tuplet_element() throws RecognitionException {
		Tuplet_elementContext _localctx = new Tuplet_elementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tuplet_element);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238); tuplet_spec();
			setState(240); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(239); note_element();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(242); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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

	public static class Tuplet_specContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(ABCMusicParser.DIGIT, 0); }
		public Tuplet_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplet_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTuplet_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTuplet_spec(this);
		}
	}

	public final Tuplet_specContext tuplet_spec() throws RecognitionException {
		Tuplet_specContext _localctx = new Tuplet_specContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tuplet_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); match(7);
			setState(245); match(DIGIT);
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

	public static class Multi_noteContext extends ParserRuleContext {
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public Multi_noteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMulti_note(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMulti_note(this);
		}
	}

	public final Multi_noteContext multi_note() throws RecognitionException {
		Multi_noteContext _localctx = new Multi_noteContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_multi_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247); match(6);
			setState(249); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(248); note();
				}
				}
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASENOTE) | (1L << REST) | (1L << ACCIDENTAL))) != 0) );
			setState(253); match(1);
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

	public static class Nth_repeatContext extends ParserRuleContext {
		public Nth_repeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nth_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNth_repeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNth_repeat(this);
		}
	}

	public final Nth_repeatContext nth_repeat() throws RecognitionException {
		Nth_repeatContext _localctx = new Nth_repeatContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_nth_repeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_la = _input.LA(1);
			if ( !(_la==15 || _la==22) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Mid_tune_fieldContext extends ParserRuleContext {
		public Field_voiceContext field_voice() {
			return getRuleContext(Field_voiceContext.class,0);
		}
		public Mid_tune_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mid_tune_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMid_tune_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMid_tune_field(this);
		}
	}

	public final Mid_tune_fieldContext mid_tune_field() throws RecognitionException {
		Mid_tune_fieldContext _localctx = new Mid_tune_fieldContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mid_tune_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); field_voice();
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

	public static class End_of_lineContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public TerminalNode LINEFEED() { return getToken(ABCMusicParser.LINEFEED, 0); }
		public End_of_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_of_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterEnd_of_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitEnd_of_line(this);
		}
	}

	public final End_of_lineContext end_of_line() throws RecognitionException {
		End_of_lineContext _localctx = new End_of_lineContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_end_of_line);
		try {
			setState(261);
			switch (_input.LA(1)) {
			case 16:
				enterOuterAlt(_localctx, 1);
				{
				setState(259); comment();
				}
				break;
			case LINEFEED:
				enterOuterAlt(_localctx, 2);
				{
				setState(260); match(LINEFEED);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LyricContext extends ParserRuleContext {
		public List<Lyrical_elementContext> lyrical_element() {
			return getRuleContexts(Lyrical_elementContext.class);
		}
		public Lyrical_elementContext lyrical_element(int i) {
			return getRuleContext(Lyrical_elementContext.class,i);
		}
		public LyricContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterLyric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitLyric(this);
		}
	}

	public final LyricContext lyric() throws RecognitionException {
		LyricContext _localctx = new LyricContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_lyric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); match(11);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 5) | (1L << 12) | (1L << 13) | (1L << 18) | (1L << 24) | (1L << 26) | (1L << TEXT))) != 0)) {
				{
				{
				setState(264); lyrical_element();
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Lyrical_elementContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(ABCMusicParser.TEXT, 0); }
		public Lyrical_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyrical_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterLyrical_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitLyrical_element(this);
		}
	}

	public final Lyrical_elementContext lyrical_element() throws RecognitionException {
		Lyrical_elementContext _localctx = new Lyrical_elementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_lyrical_element);
		try {
			int _alt;
			setState(282);
			switch (_input.LA(1)) {
			case 12:
				enterOuterAlt(_localctx, 1);
				{
				setState(271); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(270); match(12);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(273); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 2);
				{
				setState(275); match(5);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 3);
				{
				setState(276); match(18);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(277); match(4);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 5);
				{
				setState(278); match(24);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 6);
				{
				setState(279); match(13);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 7);
				{
				setState(280); match(26);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 8);
				{
				setState(281); match(TEXT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static final String _serializedATN =
		"\2\3\'\u011f\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\3\3\3\7\3K\n\3\f\3\16"+
		"\3N\13\3\3\3\3\3\7\3R\n\3\f\3\16\3U\13\3\3\3\3\3\3\4\3\4\6\4[\n\4\r\4"+
		"\16\4\\\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6k\n\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\6\16\u008a\n\16\r\16\16"+
		"\16\u008b\3\16\3\16\6\16\u0090\n\16\r\16\16\16\u0091\3\17\3\17\3\17\5"+
		"\17\u0097\n\17\3\20\6\20\u009a\n\20\r\20\16\20\u009b\3\20\3\20\6\20\u00a0"+
		"\n\20\r\20\16\20\u00a1\3\21\3\21\3\21\6\21\u00a7\n\21\r\21\16\21\u00a8"+
		"\3\22\3\22\5\22\u00ad\n\22\3\22\5\22\u00b0\n\22\3\23\6\23\u00b3\n\23\r"+
		"\23\16\23\u00b4\3\24\6\24\u00b8\n\24\r\24\16\24\u00b9\3\24\3\24\3\24\3"+
		"\24\5\24\u00c0\n\24\3\24\3\24\5\24\u00c4\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u00cb\n\25\3\26\3\26\5\26\u00cf\n\26\3\27\3\27\5\27\u00d3\n\27\3"+
		"\30\3\30\5\30\u00d7\n\30\3\31\5\31\u00da\n\31\3\31\3\31\5\31\u00de\n\31"+
		"\3\32\6\32\u00e1\n\32\r\32\16\32\u00e2\5\32\u00e5\n\32\3\32\3\32\6\32"+
		"\u00e9\n\32\r\32\16\32\u00ea\5\32\u00ed\n\32\5\32\u00ef\n\32\3\33\3\33"+
		"\6\33\u00f3\n\33\r\33\16\33\u00f4\3\34\3\34\3\34\3\35\3\35\6\35\u00fc"+
		"\n\35\r\35\16\35\u00fd\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \5 \u0108\n"+
		" \3!\3!\7!\u010c\n!\f!\16!\u010f\13!\3\"\6\"\u0112\n\"\r\"\16\"\u0113"+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u011d\n\"\3\"\2#\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\3\4\21\21\30\30\u012d"+
		"\2D\3\2\2\2\4H\3\2\2\2\6X\3\2\2\2\b`\3\2\2\2\nj\3\2\2\2\fl\3\2\2\2\16"+
		"p\3\2\2\2\20t\3\2\2\2\22x\3\2\2\2\24|\3\2\2\2\26\u0080\3\2\2\2\30\u0084"+
		"\3\2\2\2\32\u0089\3\2\2\2\34\u0096\3\2\2\2\36\u0099\3\2\2\2 \u00a3\3\2"+
		"\2\2\"\u00aa\3\2\2\2$\u00b2\3\2\2\2&\u00c3\3\2\2\2(\u00ca\3\2\2\2*\u00ce"+
		"\3\2\2\2,\u00d0\3\2\2\2.\u00d6\3\2\2\2\60\u00d9\3\2\2\2\62\u00e4\3\2\2"+
		"\2\64\u00f0\3\2\2\2\66\u00f6\3\2\2\28\u00f9\3\2\2\2:\u0101\3\2\2\2<\u0103"+
		"\3\2\2\2>\u0107\3\2\2\2@\u0109\3\2\2\2B\u011c\3\2\2\2DE\5\4\3\2EF\5$\23"+
		"\2FG\7\1\2\2G\3\3\2\2\2HL\5\6\4\2IK\5\30\r\2JI\3\2\2\2KN\3\2\2\2LJ\3\2"+
		"\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OS\5\b\5\2PR\5\n\6\2QP\3\2\2\2RU\3\2"+
		"\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\5\26\f\2W\5\3\2\2\2XZ\7"+
		"\n\2\2Y[\7\37\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2"+
		"^_\5> \2_\7\3\2\2\2`a\7\13\2\2ab\7\36\2\2bc\5> \2c\t\3\2\2\2dk\5\f\7\2"+
		"ek\5\16\b\2fk\5\20\t\2gk\5\22\n\2hk\5\24\13\2ik\5\30\r\2jd\3\2\2\2je\3"+
		"\2\2\2jf\3\2\2\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2k\13\3\2\2\2lm\7\5\2\2m"+
		"n\7\36\2\2no\5> \2o\r\3\2\2\2pq\7\23\2\2qr\5\32\16\2rs\5> \2s\17\3\2\2"+
		"\2tu\7\20\2\2uv\5\34\17\2vw\5> \2w\21\3\2\2\2xy\7\f\2\2yz\5 \21\2z{\5"+
		"> \2{\23\3\2\2\2|}\7\26\2\2}~\7\36\2\2~\177\5> \2\177\25\3\2\2\2\u0080"+
		"\u0081\7\27\2\2\u0081\u0082\5\"\22\2\u0082\u0083\5> \2\u0083\27\3\2\2"+
		"\2\u0084\u0085\7\22\2\2\u0085\u0086\7\36\2\2\u0086\u0087\7\35\2\2\u0087"+
		"\31\3\2\2\2\u0088\u008a\7\37\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2"+
		"\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f"+
		"\7\31\2\2\u008e\u0090\7\37\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2"+
		"\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\33\3\2\2\2\u0093\u0097"+
		"\7\4\2\2\u0094\u0097\7\33\2\2\u0095\u0097\5\36\20\2\u0096\u0093\3\2\2"+
		"\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\35\3\2\2\2\u0098\u009a"+
		"\7\37\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2"+
		"\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\7\31\2\2\u009e\u00a0"+
		"\7\37\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2"+
		"\u00a1\u00a2\3\2\2\2\u00a2\37\3\2\2\2\u00a3\u00a4\5\36\20\2\u00a4\u00a6"+
		"\7\25\2\2\u00a5\u00a7\7\37\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2"+
		"\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9!\3\2\2\2\u00aa\u00ac\7"+
		" \2\2\u00ab\u00ad\7!\2\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00af\3\2\2\2\u00ae\u00b0\7\"\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0#\3\2\2\2\u00b1\u00b3\5&\24\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5%\3\2\2\2\u00b6"+
		"\u00b8\5(\25\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bf\7\35\2\2\u00bc"+
		"\u00bd\5@!\2\u00bd\u00be\7\35\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bc\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c4\3\2\2\2\u00c1\u00c4\5<\37\2\u00c2"+
		"\u00c4\5\30\r\2\u00c3\u00b7\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3"+
		"\2\2\2\u00c4\'\3\2\2\2\u00c5\u00cb\5*\26\2\u00c6\u00cb\5\64\33\2\u00c7"+
		"\u00cb\7\'\2\2\u00c8\u00cb\5:\36\2\u00c9\u00cb\7#\2\2\u00ca\u00c5\3\2"+
		"\2\2\u00ca\u00c6\3\2\2\2\u00ca\u00c7\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb)\3\2\2\2\u00cc\u00cf\5,\27\2\u00cd\u00cf\58\35\2"+
		"\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf+\3\2\2\2\u00d0\u00d2\5"+
		".\30\2\u00d1\u00d3\5\62\32\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"-\3\2\2\2\u00d4\u00d7\5\60\31\2\u00d5\u00d7\7$\2\2\u00d6\u00d4\3\2\2\2"+
		"\u00d6\u00d5\3\2\2\2\u00d7/\3\2\2\2\u00d8\u00da\7&\2\2\u00d9\u00d8\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\7 \2\2\u00dc"+
		"\u00de\7%\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\61\3\2\2\2"+
		"\u00df\u00e1\7\37\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00ee\3\2\2\2\u00e6\u00ec\7\31\2\2\u00e7\u00e9\7"+
		"\37\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00e6\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\63\3\2\2\2\u00f0\u00f2\5\66\34\2\u00f1\u00f3\5*\26\2\u00f2\u00f1\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\65\3\2\2\2\u00f6\u00f7\7\t\2\2\u00f7\u00f8\7\37\2\2\u00f8\67\3\2\2\2"+
		"\u00f9\u00fb\7\b\2\2\u00fa\u00fc\5,\27\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0100\7\3\2\2\u01009\3\2\2\2\u0101\u0102\t\2\2\2\u0102;\3\2\2\2\u0103"+
		"\u0104\5\24\13\2\u0104=\3\2\2\2\u0105\u0108\5\30\r\2\u0106\u0108\7\35"+
		"\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108?\3\2\2\2\u0109\u010d"+
		"\7\r\2\2\u010a\u010c\5B\"\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010eA\3\2\2\2\u010f\u010d\3\2\2\2"+
		"\u0110\u0112\7\16\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u011d\3\2\2\2\u0115\u011d\7\7\2\2\u0116"+
		"\u011d\7\24\2\2\u0117\u011d\7\6\2\2\u0118\u011d\7\32\2\2\u0119\u011d\7"+
		"\17\2\2\u011a\u011d\7\34\2\2\u011b\u011d\7\36\2\2\u011c\u0111\3\2\2\2"+
		"\u011c\u0115\3\2\2\2\u011c\u0116\3\2\2\2\u011c\u0117\3\2\2\2\u011c\u0118"+
		"\3\2\2\2\u011c\u0119\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d"+
		"C\3\2\2\2#LS\\j\u008b\u0091\u0096\u009b\u00a1\u00a8\u00ac\u00af\u00b4"+
		"\u00b9\u00bf\u00c3\u00ca\u00ce\u00d2\u00d6\u00d9\u00dd\u00e2\u00e4\u00ea"+
		"\u00ec\u00ee\u00f4\u00fd\u0107\u010d\u0113\u011c";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}