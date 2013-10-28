/**
 * This file is the grammar file used by ANTLR.
 *
 * In order to compile this file, navigate to this directory
 * (<src/grammar>) and run the following command:
 *
 * java _jar ../../antlr.jar ABCMusic.g4
 */

grammar ABCMusic;

/*
 * This puts 'package grammar;' at the top of the output Java files.
 * Do not change these lines unless you know what you're doing.
 */
@header {
package grammar;
}

/*
 * This adds code to the generated lexer and parser. This makes the lexer and
 * parser throw errors if they encounter invalid input. Do not change these
 * lines unless you know what you're doing.
 */
@members {
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
}

/*
 * These are the lexical rules. They define the tokens used by the lexer.
 */

LINEFEED : ('\t' | '\r' | '\n')+;
fragment TEXT : 'Piece No.1';
DIGIT : '0'..'9';
BASENOTE : 'C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B' | 'c' | 'd' | 'e' | 'f' | 'g' | 'a' | 'b';
KEYACCIDENTAL : '#' | 'b';
MODEMINOR : 'm';
SPACE : [ ];
REST : 'z';
OCTAVE : '\''+ | ','+;
ACCIDENTAL : '^' | '^^' | '_' | '__' | '=';
BARLINE : '|' | '||' | '[|' | '|]' | ':|' | '|:';

FRACTION : DIGIT+ '/' DIGIT+;
KEY : BASENOTE KEYACCIDENTAL? MODEMINOR?;
TEMPO : FRACTION '=' DIGIT+;
METER : 'C' | 'C|' | FRACTION;
COMMENT : '%' TEXT LINEFEED;

FIELD_NUMBER : 'X:' (SPACE)* DIGIT;
FIELD_TITLE : 'T:' (SPACE)* TEXT;
FIELD_COMPOSER: 'C:' (SPACE)* TEXT;
FIELD_DEFAULT_LENGTH: 'L:' (SPACE)* FRACTION;
FIELD_METER: 'M:' (SPACE)* METER;
FIELD_TEMPO: 'Q:' (SPACE)* TEMPO;
FIELD_VOICE: 'V:' (SPACE)* TEXT;
FIELD_KEY: 'K:' (SPACE)* KEY;

LYRIC : 'w:' LYRICAL_ELEMENT*;
LYRICAL_ELEMENT : ' '+ | '-' | '_' | '*' | '~' | '\-' | '|' | TEXT;

NTH_REPEAT : '[1' | '[2';

TUPLET_SPEC : '(' DIGIT;

SLASH: '/';
L_BRACKET : '[';
R_BRACKET : ']';


/*
 * These are the parser rules. They define the structures used by the parser.
 *
 * You should make sure you have one rule that describes the entire input.
 * This is the 'start rule'. The start rule should end with the special
 * predefined token EOF so that it describes the entire input. Below, we've made
 * 'line' the start rule.
 *
 * For more information, see
 * http://www.antlr.org/wiki/display/ANTLR4/Parser+Rules#ParserRules-StartRulesandEOF
 */
 
abc_tune : abc_header abc_music EOF;

/* Header stuff */
abc_header : field_number COMMENT* field_title other_fields* field_key;

end_of_line: COMMENT | LINEFEED;
field_number : FIELD_NUMBER end_of_line;
field_title : FIELD_TITLE end_of_line;
other_fields : field_composer | field_default_length | field_meter | field_tempo | field_voice | COMMENT;
field_composer : FIELD_COMPOSER end_of_line;
field_default_length : FIELD_DEFAULT_LENGTH end_of_line;
field_meter : FIELD_METER end_of_line;
field_tempo : FIELD_TEMPO end_of_line;
field_voice : FIELD_VOICE end_of_line;
field_key : FIELD_KEY end_of_line;

/* Music stuff */
abc_music : abc_line+;
abc_line : element+ LINEFEED (LYRIC LINEFEED)? | mid_tune_field | COMMENT;

pitch : ACCIDENTAL? BASENOTE OCTAVE?;
multinote: L_BRACKET (pitch | REST)+ R_BRACKET;
note_length : (SLASH? DIGIT+) | FRACTION;
note_element : (pitch | REST | multinote) note_length?;
tuplet_element : TUPLET_SPEC note_element+;

element : (note_element | tuplet_element | BARLINE | NTH_REPEAT) (SPACE) ;

mid_tune_field : field_voice;