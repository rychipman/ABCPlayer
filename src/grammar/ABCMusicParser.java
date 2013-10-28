// Generated from src/grammar/ABCMusic.g4 by ANTLR 4.0

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
		LINEFEED=1, TEXT=2, DIGIT=3, BASENOTE=4, KEYACCIDENTAL=5, MODEMINOR=6, 
		SPACE=7, REST=8, OCTAVE=9, ACCIDENTAL=10, BARLINE=11, FRACTION=12, DIGITS=13, 
		KEY=14, METER=15, COMMENT=16, FN_START=17, FTI_START=18, FC_START=19, 
		FD_START=20, FM_START=21, FTE_START=22, FV_START=23, FK_START=24, LYRIC=25, 
		LYRICAL_ELEMENT=26, NTH_REPEAT=27, L_PAREN=28, SLASH=29, L_BRACKET=30, 
		R_BRACKET=31;
	public static final String[] tokenNames = {
		"<INVALID>", "LINEFEED", "'Piece No.1'", "DIGIT", "BASENOTE", "KEYACCIDENTAL", 
		"'m'", "SPACE", "'z'", "OCTAVE", "ACCIDENTAL", "BARLINE", "FRACTION", 
		"DIGITS", "KEY", "METER", "COMMENT", "FN_START", "FTI_START", "FC_START", 
		"FD_START", "FM_START", "FTE_START", "FV_START", "FK_START", "LYRIC", 
		"LYRICAL_ELEMENT", "NTH_REPEAT", "'('", "'/'", "'['", "']'"
	};
	public static final int
		RULE_abc_tune = 0, RULE_abc_header = 1, RULE_end_of_line = 2, RULE_field_number = 3, 
		RULE_field_title = 4, RULE_other_fields = 5, RULE_field_composer = 6, 
		RULE_field_default_length = 7, RULE_field_meter = 8, RULE_field_tempo = 9, 
		RULE_field_voice = 10, RULE_field_key = 11, RULE_abc_music = 12, RULE_music_line = 13, 
		RULE_pitch = 14, RULE_note = 15, RULE_multinote = 16, RULE_note_length = 17, 
		RULE_note_element = 18, RULE_tuplet_element = 19, RULE_element = 20, RULE_voice = 21;
	public static final String[] ruleNames = {
		"abc_tune", "abc_header", "end_of_line", "field_number", "field_title", 
		"other_fields", "field_composer", "field_default_length", "field_meter", 
		"field_tempo", "field_voice", "field_key", "abc_music", "music_line", 
		"pitch", "note", "multinote", "note_length", "note_element", "tuplet_element", 
		"element", "voice"
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
			setState(44); abc_header();
			setState(45); abc_music();
			setState(46); match(EOF);
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
		public List<TerminalNode> COMMENT() { return getTokens(ABCMusicParser.COMMENT); }
		public Other_fieldsContext other_fields(int i) {
			return getRuleContext(Other_fieldsContext.class,i);
		}
		public Field_numberContext field_number() {
			return getRuleContext(Field_numberContext.class,0);
		}
		public TerminalNode COMMENT(int i) {
			return getToken(ABCMusicParser.COMMENT, i);
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
			setState(48); field_number();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(49); match(COMMENT);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55); field_title();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << FC_START) | (1L << FD_START) | (1L << FM_START) | (1L << FTE_START) | (1L << FV_START))) != 0)) {
				{
				{
				setState(56); other_fields();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62); field_key();
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
		public TerminalNode COMMENT() { return getToken(ABCMusicParser.COMMENT, 0); }
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
		enterRule(_localctx, 4, RULE_end_of_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==LINEFEED || _la==COMMENT) ) {
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

	public static class Field_numberContext extends ParserRuleContext {
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public TerminalNode FN_START() { return getToken(ABCMusicParser.FN_START, 0); }
		public TerminalNode DIGITS() { return getToken(ABCMusicParser.DIGITS, 0); }
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
		enterRule(_localctx, 6, RULE_field_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(FN_START);
			setState(67); match(DIGITS);
			setState(68); end_of_line();
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
		public TerminalNode FTI_START() { return getToken(ABCMusicParser.FTI_START, 0); }
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
		enterRule(_localctx, 8, RULE_field_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(FTI_START);
			setState(71); match(TEXT);
			setState(72); end_of_line();
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
		public TerminalNode COMMENT() { return getToken(ABCMusicParser.COMMENT, 0); }
		public Field_meterContext field_meter() {
			return getRuleContext(Field_meterContext.class,0);
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
		enterRule(_localctx, 10, RULE_other_fields);
		try {
			setState(80);
			switch (_input.LA(1)) {
			case FC_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(74); field_composer();
				}
				break;
			case FD_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); field_default_length();
				}
				break;
			case FM_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(76); field_meter();
				}
				break;
			case FTE_START:
				enterOuterAlt(_localctx, 4);
				{
				setState(77); field_tempo();
				}
				break;
			case FV_START:
				enterOuterAlt(_localctx, 5);
				{
				setState(78); field_voice();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(79); match(COMMENT);
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
		public TerminalNode FC_START() { return getToken(ABCMusicParser.FC_START, 0); }
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
		enterRule(_localctx, 12, RULE_field_composer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(FC_START);
			setState(83); match(TEXT);
			setState(84); end_of_line();
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
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public TerminalNode FD_START() { return getToken(ABCMusicParser.FD_START, 0); }
		public TerminalNode FRACTION() { return getToken(ABCMusicParser.FRACTION, 0); }
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
		enterRule(_localctx, 14, RULE_field_default_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(FD_START);
			setState(87); match(FRACTION);
			setState(88); end_of_line();
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
		public TerminalNode METER() { return getToken(ABCMusicParser.METER, 0); }
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public TerminalNode FM_START() { return getToken(ABCMusicParser.FM_START, 0); }
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
		enterRule(_localctx, 16, RULE_field_meter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(FM_START);
			setState(91); match(METER);
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

	public static class Field_tempoContext extends ParserRuleContext {
		public TerminalNode FTE_START() { return getToken(ABCMusicParser.FTE_START, 0); }
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public TerminalNode DIGITS() { return getToken(ABCMusicParser.DIGITS, 0); }
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
		enterRule(_localctx, 18, RULE_field_tempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); match(FTE_START);
			setState(95); match(DIGITS);
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

	public static class Field_voiceContext extends ParserRuleContext {
		public TerminalNode FV_START() { return getToken(ABCMusicParser.FV_START, 0); }
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
		enterRule(_localctx, 20, RULE_field_voice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(FV_START);
			setState(99); match(TEXT);
			setState(100); end_of_line();
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
		public TerminalNode FK_START() { return getToken(ABCMusicParser.FK_START, 0); }
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public TerminalNode KEY() { return getToken(ABCMusicParser.KEY, 0); }
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
		enterRule(_localctx, 22, RULE_field_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(FK_START);
			setState(103); match(KEY);
			setState(104); end_of_line();
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
		public List<VoiceContext> voice() {
			return getRuleContexts(VoiceContext.class);
		}
		public List<TerminalNode> COMMENT() { return getTokens(ABCMusicParser.COMMENT); }
		public VoiceContext voice(int i) {
			return getRuleContext(VoiceContext.class,i);
		}
		public TerminalNode COMMENT(int i) {
			return getToken(ABCMusicParser.COMMENT, i);
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
		enterRule(_localctx, 24, RULE_abc_music);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(108);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(106); voice();
						}
						break;

					case 2:
						{
						setState(107); match(COMMENT);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(110); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class Music_lineContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public TerminalNode LINEFEED(int i) {
			return getToken(ABCMusicParser.LINEFEED, i);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode LYRIC() { return getToken(ABCMusicParser.LYRIC, 0); }
		public List<TerminalNode> LINEFEED() { return getTokens(ABCMusicParser.LINEFEED); }
		public Music_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_music_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMusic_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMusic_line(this);
		}
	}

	public final Music_lineContext music_line() throws RecognitionException {
		Music_lineContext _localctx = new Music_lineContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_music_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112); element();
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASENOTE) | (1L << REST) | (1L << ACCIDENTAL) | (1L << BARLINE) | (1L << NTH_REPEAT) | (1L << L_PAREN) | (1L << L_BRACKET))) != 0) );
			setState(117); match(LINEFEED);
			setState(120);
			_la = _input.LA(1);
			if (_la==LYRIC) {
				{
				setState(118); match(LYRIC);
				setState(119); match(LINEFEED);
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
		enterRule(_localctx, 28, RULE_pitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if (_la==ACCIDENTAL) {
				{
				setState(122); match(ACCIDENTAL);
				}
			}

			setState(125); match(BASENOTE);
			setState(127);
			_la = _input.LA(1);
			if (_la==OCTAVE) {
				{
				setState(126); match(OCTAVE);
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

	public static class NoteContext extends ParserRuleContext {
		public Note_lengthContext note_length() {
			return getRuleContext(Note_lengthContext.class,0);
		}
		public TerminalNode REST() { return getToken(ABCMusicParser.REST, 0); }
		public PitchContext pitch() {
			return getRuleContext(PitchContext.class,0);
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
		enterRule(_localctx, 30, RULE_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			switch (_input.LA(1)) {
			case BASENOTE:
			case ACCIDENTAL:
				{
				setState(129); pitch();
				}
				break;
			case REST:
				{
				setState(130); match(REST);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(134);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRACTION) | (1L << DIGITS) | (1L << SLASH))) != 0)) {
				{
				setState(133); note_length();
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

	public static class MultinoteContext extends ParserRuleContext {
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public TerminalNode L_BRACKET() { return getToken(ABCMusicParser.L_BRACKET, 0); }
		public TerminalNode R_BRACKET() { return getToken(ABCMusicParser.R_BRACKET, 0); }
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public MultinoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multinote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMultinote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMultinote(this);
		}
	}

	public final MultinoteContext multinote() throws RecognitionException {
		MultinoteContext _localctx = new MultinoteContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_multinote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); match(L_BRACKET);
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137); note();
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASENOTE) | (1L << REST) | (1L << ACCIDENTAL))) != 0) );
			setState(142); match(R_BRACKET);
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
		public TerminalNode SLASH() { return getToken(ABCMusicParser.SLASH, 0); }
		public TerminalNode FRACTION() { return getToken(ABCMusicParser.FRACTION, 0); }
		public TerminalNode DIGITS() { return getToken(ABCMusicParser.DIGITS, 0); }
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
		enterRule(_localctx, 34, RULE_note_length);
		int _la;
		try {
			setState(149);
			switch (_input.LA(1)) {
			case DIGITS:
			case SLASH:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(145);
				_la = _input.LA(1);
				if (_la==SLASH) {
					{
					setState(144); match(SLASH);
					}
				}

				setState(147); match(DIGITS);
				}
				}
				break;
			case FRACTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(148); match(FRACTION);
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
		public MultinoteContext multinote() {
			return getRuleContext(MultinoteContext.class,0);
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
		enterRule(_localctx, 36, RULE_note_element);
		try {
			setState(153);
			switch (_input.LA(1)) {
			case BASENOTE:
			case REST:
			case ACCIDENTAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(151); note();
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(152); multinote();
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

	public static class Tuplet_elementContext extends ParserRuleContext {
		public Note_elementContext note_element(int i) {
			return getRuleContext(Note_elementContext.class,i);
		}
		public TerminalNode DIGIT() { return getToken(ABCMusicParser.DIGIT, 0); }
		public List<Note_elementContext> note_element() {
			return getRuleContexts(Note_elementContext.class);
		}
		public TerminalNode L_PAREN() { return getToken(ABCMusicParser.L_PAREN, 0); }
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
		enterRule(_localctx, 38, RULE_tuplet_element);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155); match(L_PAREN);
			setState(156); match(DIGIT);
			setState(158); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(157); note_element();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(160); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode SPACE(int i) {
			return getToken(ABCMusicParser.SPACE, i);
		}
		public TerminalNode BARLINE() { return getToken(ABCMusicParser.BARLINE, 0); }
		public TerminalNode NTH_REPEAT() { return getToken(ABCMusicParser.NTH_REPEAT, 0); }
		public List<TerminalNode> SPACE() { return getTokens(ABCMusicParser.SPACE); }
		public Note_elementContext note_element() {
			return getRuleContext(Note_elementContext.class,0);
		}
		public Tuplet_elementContext tuplet_element() {
			return getRuleContext(Tuplet_elementContext.class,0);
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
		enterRule(_localctx, 40, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			switch (_input.LA(1)) {
			case BASENOTE:
			case REST:
			case ACCIDENTAL:
			case L_BRACKET:
				{
				setState(162); note_element();
				}
				break;
			case L_PAREN:
				{
				setState(163); tuplet_element();
				}
				break;
			case BARLINE:
				{
				setState(164); match(BARLINE);
				}
				break;
			case NTH_REPEAT:
				{
				setState(165); match(NTH_REPEAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			{
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(168); match(SPACE);
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class VoiceContext extends ParserRuleContext {
		public Field_voiceContext field_voice(int i) {
			return getRuleContext(Field_voiceContext.class,i);
		}
		public Music_lineContext music_line(int i) {
			return getRuleContext(Music_lineContext.class,i);
		}
		public List<Music_lineContext> music_line() {
			return getRuleContexts(Music_lineContext.class);
		}
		public List<Field_voiceContext> field_voice() {
			return getRuleContexts(Field_voiceContext.class);
		}
		public VoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterVoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitVoice(this);
		}
	}

	public final VoiceContext voice() throws RecognitionException {
		VoiceContext _localctx = new VoiceContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_voice);
		try {
			int _alt;
			setState(184);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(174); field_voice();
						setState(175); music_line();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(179); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(181); music_line();
					}
					break;
				}
				}
				break;
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
		"\2\3!\u00bd\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\7\3\65\n\3\f\3\16\38\13\3\3\3\3\3\7\3<\n\3\f"+
		"\3\16\3?\13\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7S\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\6\16"+
		"o\n\16\r\16\16\16p\3\17\6\17t\n\17\r\17\16\17u\3\17\3\17\3\17\5\17{\n"+
		"\17\3\20\5\20~\n\20\3\20\3\20\5\20\u0082\n\20\3\21\3\21\5\21\u0086\n\21"+
		"\3\21\5\21\u0089\n\21\3\22\3\22\6\22\u008d\n\22\r\22\16\22\u008e\3\22"+
		"\3\22\3\23\5\23\u0094\n\23\3\23\3\23\5\23\u0098\n\23\3\24\3\24\5\24\u009c"+
		"\n\24\3\25\3\25\3\25\6\25\u00a1\n\25\r\25\16\25\u00a2\3\26\3\26\3\26\3"+
		"\26\5\26\u00a9\n\26\3\26\7\26\u00ac\n\26\f\26\16\26\u00af\13\26\3\27\3"+
		"\27\3\27\6\27\u00b4\n\27\r\27\16\27\u00b5\3\27\5\27\u00b9\n\27\5\27\u00bb"+
		"\n\27\3\27\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\3\4\3"+
		"\3\22\22\u00c1\2.\3\2\2\2\4\62\3\2\2\2\6B\3\2\2\2\bD\3\2\2\2\nH\3\2\2"+
		"\2\fR\3\2\2\2\16T\3\2\2\2\20X\3\2\2\2\22\\\3\2\2\2\24`\3\2\2\2\26d\3\2"+
		"\2\2\30h\3\2\2\2\32n\3\2\2\2\34s\3\2\2\2\36}\3\2\2\2 \u0085\3\2\2\2\""+
		"\u008a\3\2\2\2$\u0097\3\2\2\2&\u009b\3\2\2\2(\u009d\3\2\2\2*\u00a8\3\2"+
		"\2\2,\u00ba\3\2\2\2./\5\4\3\2/\60\5\32\16\2\60\61\7\1\2\2\61\3\3\2\2\2"+
		"\62\66\5\b\5\2\63\65\7\22\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2"+
		"\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29=\5\n\6\2:<\5\f\7\2;:\3\2\2\2<"+
		"?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\5\30\r\2A\5\3\2\2"+
		"\2BC\t\2\2\2C\7\3\2\2\2DE\7\23\2\2EF\7\17\2\2FG\5\6\4\2G\t\3\2\2\2HI\7"+
		"\24\2\2IJ\7\4\2\2JK\5\6\4\2K\13\3\2\2\2LS\5\16\b\2MS\5\20\t\2NS\5\22\n"+
		"\2OS\5\24\13\2PS\5\26\f\2QS\7\22\2\2RL\3\2\2\2RM\3\2\2\2RN\3\2\2\2RO\3"+
		"\2\2\2RP\3\2\2\2RQ\3\2\2\2S\r\3\2\2\2TU\7\25\2\2UV\7\4\2\2VW\5\6\4\2W"+
		"\17\3\2\2\2XY\7\26\2\2YZ\7\16\2\2Z[\5\6\4\2[\21\3\2\2\2\\]\7\27\2\2]^"+
		"\7\21\2\2^_\5\6\4\2_\23\3\2\2\2`a\7\30\2\2ab\7\17\2\2bc\5\6\4\2c\25\3"+
		"\2\2\2de\7\31\2\2ef\7\4\2\2fg\5\6\4\2g\27\3\2\2\2hi\7\32\2\2ij\7\20\2"+
		"\2jk\5\6\4\2k\31\3\2\2\2lo\5,\27\2mo\7\22\2\2nl\3\2\2\2nm\3\2\2\2op\3"+
		"\2\2\2pn\3\2\2\2pq\3\2\2\2q\33\3\2\2\2rt\5*\26\2sr\3\2\2\2tu\3\2\2\2u"+
		"s\3\2\2\2uv\3\2\2\2vw\3\2\2\2wz\7\3\2\2xy\7\33\2\2y{\7\3\2\2zx\3\2\2\2"+
		"z{\3\2\2\2{\35\3\2\2\2|~\7\f\2\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177"+
		"\u0081\7\6\2\2\u0080\u0082\7\13\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3"+
		"\2\2\2\u0082\37\3\2\2\2\u0083\u0086\5\36\20\2\u0084\u0086\7\n\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0089\5$"+
		"\23\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089!\3\2\2\2\u008a\u008c"+
		"\7 \2\2\u008b\u008d\5 \21\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7!"+
		"\2\2\u0091#\3\2\2\2\u0092\u0094\7\37\2\2\u0093\u0092\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0098\7\17\2\2\u0096\u0098\7\16\2\2"+
		"\u0097\u0093\3\2\2\2\u0097\u0096\3\2\2\2\u0098%\3\2\2\2\u0099\u009c\5"+
		" \21\2\u009a\u009c\5\"\22\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\'\3\2\2\2\u009d\u009e\7\36\2\2\u009e\u00a0\7\5\2\2\u009f\u00a1\5&\24"+
		"\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3)\3\2\2\2\u00a4\u00a9\5&\24\2\u00a5\u00a9\5(\25\2\u00a6"+
		"\u00a9\7\r\2\2\u00a7\u00a9\7\35\2\2\u00a8\u00a4\3\2\2\2\u00a8\u00a5\3"+
		"\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ad\3\2\2\2\u00aa"+
		"\u00ac\7\t\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae+\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1"+
		"\5\26\f\2\u00b1\u00b2\5\34\17\2\u00b2\u00b4\3\2\2\2\u00b3\u00b0\3\2\2"+
		"\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00bb"+
		"\3\2\2\2\u00b7\u00b9\5\34\17\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2"+
		"\u00b9\u00bb\3\2\2\2\u00ba\u00b3\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb-\3"+
		"\2\2\2\27\66=Rnpuz}\u0081\u0085\u0088\u008e\u0093\u0097\u009b\u00a2\u00a8"+
		"\u00ad\u00b5\u00b8\u00ba";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}