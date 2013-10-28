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
		COMMENT=1, FN_START=2, FTI_START=3, FC_START=4, FD_START=5, FM_START=6, 
		FTE_START=7, FV_START=8, FRACTION=9, LINEFEED=10, BASENOTE=11, KEYACCIDENTAL=12, 
		MODEMINOR=13, SPACE=14, REST=15, OCTAVE=16, ACCIDENTAL=17, BARLINE=18, 
		FK_START=19, LYRIC=20, LYRICAL_ELEMENT=21, NTH_REPEAT=22, TUPLET_START=23, 
		SLASH=24, L_BRACKET=25, R_BRACKET=26, DIGITS=27, DIGIT=28;
	public static final String[] tokenNames = {
		"<INVALID>", "COMMENT", "FN_START", "FTI_START", "FC_START", "FD_START", 
		"FM_START", "FTE_START", "FV_START", "FRACTION", "LINEFEED", "BASENOTE", 
		"KEYACCIDENTAL", "'m'", "SPACE", "'z'", "OCTAVE", "ACCIDENTAL", "BARLINE", 
		"FK_START", "LYRIC", "LYRICAL_ELEMENT", "NTH_REPEAT", "TUPLET_START", 
		"'/'", "'['", "']'", "DIGITS", "DIGIT"
	};
	public static final int
		RULE_abc_tune = 0, RULE_abc_header = 1, RULE_field_number = 2, RULE_field_title = 3, 
		RULE_other_fields = 4, RULE_field_composer = 5, RULE_field_default_length = 6, 
		RULE_field_meter = 7, RULE_field_tempo = 8, RULE_field_voice = 9, RULE_field_key = 10, 
		RULE_abc_music = 11, RULE_music_line = 12, RULE_pitch = 13, RULE_note = 14, 
		RULE_multinote = 15, RULE_note_length = 16, RULE_note_element = 17, RULE_tuplet_element = 18, 
		RULE_element = 19, RULE_voice = 20;
	public static final String[] ruleNames = {
		"abc_tune", "abc_header", "field_number", "field_title", "other_fields", 
		"field_composer", "field_default_length", "field_meter", "field_tempo", 
		"field_voice", "field_key", "abc_music", "music_line", "pitch", "note", 
		"multinote", "note_length", "note_element", "tuplet_element", "element", 
		"voice"
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
			setState(42); match(EOF);
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
			setState(44); field_number();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(45); match(COMMENT);
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51); field_title();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << FC_START) | (1L << FD_START) | (1L << FM_START) | (1L << FTE_START) | (1L << FV_START))) != 0)) {
				{
				{
				setState(52); other_fields();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58); field_key();
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
		public TerminalNode FN_START() { return getToken(ABCMusicParser.FN_START, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); match(FN_START);
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
		enterRule(_localctx, 6, RULE_field_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); match(FTI_START);
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
		enterRule(_localctx, 8, RULE_other_fields);
		try {
			setState(70);
			switch (_input.LA(1)) {
			case FC_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); field_composer();
				}
				break;
			case FD_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(65); field_default_length();
				}
				break;
			case FM_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(66); field_meter();
				}
				break;
			case FTE_START:
				enterOuterAlt(_localctx, 4);
				{
				setState(67); field_tempo();
				}
				break;
			case FV_START:
				enterOuterAlt(_localctx, 5);
				{
				setState(68); field_voice();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(69); match(COMMENT);
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
		enterRule(_localctx, 10, RULE_field_composer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(FC_START);
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
		public TerminalNode FD_START() { return getToken(ABCMusicParser.FD_START, 0); }
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
			setState(74); match(FD_START);
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
		enterRule(_localctx, 14, RULE_field_meter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(FM_START);
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
			setState(78); match(FTE_START);
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
			setState(80); match(FV_START);
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
			setState(82); match(FK_START);
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
		enterRule(_localctx, 22, RULE_abc_music);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(86);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(84); voice();
						}
						break;

					case 2:
						{
						setState(85); match(COMMENT);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(88); 
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
		enterRule(_localctx, 24, RULE_music_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90); element();
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASENOTE) | (1L << REST) | (1L << ACCIDENTAL) | (1L << BARLINE) | (1L << NTH_REPEAT) | (1L << TUPLET_START) | (1L << L_BRACKET))) != 0) );
			setState(95); match(LINEFEED);
			setState(98);
			_la = _input.LA(1);
			if (_la==LYRIC) {
				{
				setState(96); match(LYRIC);
				setState(97); match(LINEFEED);
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
		enterRule(_localctx, 26, RULE_pitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if (_la==ACCIDENTAL) {
				{
				setState(100); match(ACCIDENTAL);
				}
			}

			setState(103); match(BASENOTE);
			setState(105);
			_la = _input.LA(1);
			if (_la==OCTAVE) {
				{
				setState(104); match(OCTAVE);
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
		enterRule(_localctx, 28, RULE_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			switch (_input.LA(1)) {
			case BASENOTE:
			case ACCIDENTAL:
				{
				setState(107); pitch();
				}
				break;
			case REST:
				{
				setState(108); match(REST);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(112);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SLASH) | (1L << DIGITS) | (1L << DIGIT))) != 0)) {
				{
				setState(111); note_length();
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
		enterRule(_localctx, 30, RULE_multinote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(L_BRACKET);
			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115); note();
				}
				}
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASENOTE) | (1L << REST) | (1L << ACCIDENTAL))) != 0) );
			setState(120); match(R_BRACKET);
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
		public TerminalNode SLASH() { return getToken(ABCMusicParser.SLASH, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(ABCMusicParser.DIGIT); }
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
		enterRule(_localctx, 32, RULE_note_length);
		int _la;
		try {
			setState(137);
			switch (_input.LA(1)) {
			case SLASH:
			case DIGITS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(123);
				_la = _input.LA(1);
				if (_la==SLASH) {
					{
					setState(122); match(SLASH);
					}
				}

				setState(125); match(DIGITS);
				}
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(126); match(DIGIT);
					}
					}
					setState(129); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				setState(131); match(SLASH);
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(132); match(DIGIT);
					}
					}
					setState(135); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
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
		enterRule(_localctx, 34, RULE_note_element);
		try {
			setState(141);
			switch (_input.LA(1)) {
			case BASENOTE:
			case REST:
			case ACCIDENTAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(139); note();
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(140); multinote();
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
		public TerminalNode TUPLET_START() { return getToken(ABCMusicParser.TUPLET_START, 0); }
		public List<Note_elementContext> note_element() {
			return getRuleContexts(Note_elementContext.class);
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
		enterRule(_localctx, 36, RULE_tuplet_element);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(TUPLET_START);
			setState(145); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(144); note_element();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(147); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		enterRule(_localctx, 38, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			switch (_input.LA(1)) {
			case BASENOTE:
			case REST:
			case ACCIDENTAL:
			case L_BRACKET:
				{
				setState(149); note_element();
				}
				break;
			case TUPLET_START:
				{
				setState(150); tuplet_element();
				}
				break;
			case BARLINE:
				{
				setState(151); match(BARLINE);
				}
				break;
			case NTH_REPEAT:
				{
				setState(152); match(NTH_REPEAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			{
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(155); match(SPACE);
				}
				}
				setState(160);
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
		enterRule(_localctx, 40, RULE_voice);
		try {
			int _alt;
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(161); field_voice();
						setState(162); music_line();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(166); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(168); music_line();
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
		"\2\3\36\u00b0\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3"+
		"\2\3\3\3\3\7\3\61\n\3\f\3\16\3\64\13\3\3\3\3\3\7\38\n\3\f\3\16\3;\13\3"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6I\n\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\6\rY\n\r\r\r\16\rZ\3\16"+
		"\6\16^\n\16\r\16\16\16_\3\16\3\16\3\16\5\16e\n\16\3\17\5\17h\n\17\3\17"+
		"\3\17\5\17l\n\17\3\20\3\20\5\20p\n\20\3\20\5\20s\n\20\3\21\3\21\6\21w"+
		"\n\21\r\21\16\21x\3\21\3\21\3\22\5\22~\n\22\3\22\3\22\6\22\u0082\n\22"+
		"\r\22\16\22\u0083\3\22\3\22\6\22\u0088\n\22\r\22\16\22\u0089\5\22\u008c"+
		"\n\22\3\23\3\23\5\23\u0090\n\23\3\24\3\24\6\24\u0094\n\24\r\24\16\24\u0095"+
		"\3\25\3\25\3\25\3\25\5\25\u009c\n\25\3\25\7\25\u009f\n\25\f\25\16\25\u00a2"+
		"\13\25\3\26\3\26\3\26\6\26\u00a7\n\26\r\26\16\26\u00a8\3\26\5\26\u00ac"+
		"\n\26\5\26\u00ae\n\26\3\26\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*\2\2\u00b7\2,\3\2\2\2\4.\3\2\2\2\6>\3\2\2\2\b@\3\2\2\2\nH\3\2\2"+
		"\2\fJ\3\2\2\2\16L\3\2\2\2\20N\3\2\2\2\22P\3\2\2\2\24R\3\2\2\2\26T\3\2"+
		"\2\2\30X\3\2\2\2\32]\3\2\2\2\34g\3\2\2\2\36o\3\2\2\2 t\3\2\2\2\"\u008b"+
		"\3\2\2\2$\u008f\3\2\2\2&\u0091\3\2\2\2(\u009b\3\2\2\2*\u00ad\3\2\2\2,"+
		"-\7\1\2\2-\3\3\2\2\2.\62\5\6\4\2/\61\7\3\2\2\60/\3\2\2\2\61\64\3\2\2\2"+
		"\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\659\5\b\5\2\66"+
		"8\5\n\6\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3"+
		"\2\2\2<=\5\26\f\2=\5\3\2\2\2>?\7\4\2\2?\7\3\2\2\2@A\7\5\2\2A\t\3\2\2\2"+
		"BI\5\f\7\2CI\5\16\b\2DI\5\20\t\2EI\5\22\n\2FI\5\24\13\2GI\7\3\2\2HB\3"+
		"\2\2\2HC\3\2\2\2HD\3\2\2\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2I\13\3\2\2\2J"+
		"K\7\6\2\2K\r\3\2\2\2LM\7\7\2\2M\17\3\2\2\2NO\7\b\2\2O\21\3\2\2\2PQ\7\t"+
		"\2\2Q\23\3\2\2\2RS\7\n\2\2S\25\3\2\2\2TU\7\25\2\2U\27\3\2\2\2VY\5*\26"+
		"\2WY\7\3\2\2XV\3\2\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\31\3\2"+
		"\2\2\\^\5(\25\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ad\7"+
		"\f\2\2bc\7\26\2\2ce\7\f\2\2db\3\2\2\2de\3\2\2\2e\33\3\2\2\2fh\7\23\2\2"+
		"gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ik\7\r\2\2jl\7\22\2\2kj\3\2\2\2kl\3\2\2"+
		"\2l\35\3\2\2\2mp\5\34\17\2np\7\21\2\2om\3\2\2\2on\3\2\2\2pr\3\2\2\2qs"+
		"\5\"\22\2rq\3\2\2\2rs\3\2\2\2s\37\3\2\2\2tv\7\33\2\2uw\5\36\20\2vu\3\2"+
		"\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\34\2\2{!\3\2\2\2|~\7"+
		"\32\2\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u008c\7\35\2\2\u0080\u0082"+
		"\7\36\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\7\32\2\2\u0086\u0088"+
		"\7\36\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2"+
		"\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b}\3\2\2\2\u008b\u0081\3"+
		"\2\2\2\u008c#\3\2\2\2\u008d\u0090\5\36\20\2\u008e\u0090\5 \21\2\u008f"+
		"\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090%\3\2\2\2\u0091\u0093\7\31\2\2"+
		"\u0092\u0094\5$\23\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\'\3\2\2\2\u0097\u009c\5$\23\2\u0098"+
		"\u009c\5&\24\2\u0099\u009c\7\24\2\2\u009a\u009c\7\30\2\2\u009b\u0097\3"+
		"\2\2\2\u009b\u0098\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\u00a0\3\2\2\2\u009d\u009f\7\20\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3"+
		"\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1)\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a3\u00a4\5\24\13\2\u00a4\u00a5\5\32\16\2\u00a5\u00a7\3\2\2"+
		"\2\u00a6\u00a3\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00ae\3\2\2\2\u00aa\u00ac\5\32\16\2\u00ab\u00aa\3\2\2\2"+
		"\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00a6\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ae+\3\2\2\2\31\629HXZ_dgkorx}\u0083\u0089\u008b\u008f\u0095"+
		"\u009b\u00a0\u00a8\u00ab\u00ad";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}