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

LINEFEED : [\t\r\n]+;
TEXT : .+?;
DIGIT : '0'..'9';
BASENOTE : 'C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B' | 'c' | 'd' | 'e' | 'f' | 'g' | 'a' | 'b';
KEYACCIDENTAL : '#' | 'b';
MODEMINOR : 'm';
SPACE : [ ];
REST : 'z';
OCTAVE : '\''+ | ','+;
ACCIDENTAL : '^' | '^^' | '_' | '__' | '=';
BARLINE : '|' | '||' | '[|' | '|]' | ':|' | '|:';
FIELD_NUMBER : 'X:' DIGIT;

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

/** Header stuff */
abc_header : field_number comment* field_title other_fields* field_key;

field_number : FIELD_NUMBER EOF;
field_title : 'T:' TEXT end_of_line;
other_fields : field_composer | field_default_length | field_meter | field_tempo | field_voice | comment;
field_composer : 'C:' TEXT end_of_line;
field_default_length : 'L:' note_length_strict end_of_line;
field_meter : 'M:' meter end_of_line;
field_tempo : 'Q:' tempo end_of_line;
field_voice : 'V:' TEXT end_of_line;
field_key : 'K:' key end_of_line;
comment : '%' TEXT LINEFEED;
note_length_strict : DIGIT+ '/' DIGIT+;
meter : 'C' | 'C|' | meter_fraction;
meter_fraction : DIGIT+ '/' DIGIT+;
tempo : meter_fraction '=' DIGIT+;

key : BASENOTE KEYACCIDENTAL? MODEMINOR?;

/** Music stuff */
abc_music : abc_line+;
abc_line : element+ LINEFEED (lyric LINEFEED)? | mid_tune_field | comment;
element : note_element | tuplet_element | BARLINE | nth_repeat | SPACE ;

note_element : note | multi_note;
note : note_or_rest note_length?;
note_or_rest : pitch | REST;
pitch : ACCIDENTAL? BASENOTE OCTAVE?;
note_length : (DIGIT+)? ('/' (DIGIT+)?)?;

tuplet_element : tuplet_spec note_element+;
tuplet_spec : '(' DIGIT;

multi_note : '[' note+ ']';

nth_repeat : '[1' | '[2';

mid_tune_field : field_voice;

end_of_line : comment | LINEFEED;

lyric : 'w:' lyrical_element*;
lyrical_element : ' '+ | '-' | '_' | '*' | '~' | '\-' | '|' | TEXT;








