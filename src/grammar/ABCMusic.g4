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

COMMENT : '%' (~'\n')+ LINEFEED -> skip;
FIELD_NUMBER : 'X:' (SPACE)* DIGITS ;
FIELD_TITLE : 'T:' (SPACE)*  (~'\n')+ ; 
FIELD_COMPOSER : 'C:' (SPACE)*  (~'\n')+ ; 
FIELD_DEFAULT_LENGTH : 'L:' (SPACE)* (DIGIT+ '/' DIGIT+) ;
FIELD_METER : 'M:' (SPACE)* ('C' | 'C|' | (DIGIT+ '/' DIGIT+)) ;
FIELD_TEMPO : 'Q:' (SPACE)* ((DIGIT+ '/' DIGIT+) '=')? DIGITS ;
FIELD_VOICE : 'V:' (SPACE)*  (~'\n')+ ; 

FRACTION : DIGIT+ '/' DIGIT+;

LINEFEED : ('\t' | '\r' | '\n')+ -> skip;
BASENOTE : 'C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B' | 'c' | 'd' | 'e' | 'f' | 'g' | 'a' | 'b';
KEYACCIDENTAL : '#' | 'b';
MODEMINOR : 'm';
SPACE : [ ] -> skip;
REST : 'z';
OCTAVE : '\''+ | ','+;
ACCIDENTAL : '^' | '^^' | '_' | '__' | '=';
BARLINE : '|' | '||' | '[|' | '|]' | ':|' | '|:';


FIELD_KEY : 'K:' (SPACE)* BASENOTE KEYACCIDENTAL? MODEMINOR?;

LYRIC : 'w:' LYRICAL_ELEMENT* (~'\n')*;
LYRICAL_ELEMENT : ' '+ | '-' | '_' | '*' | '~' | '\-' | '|' ; 

NTH_REPEAT : '[1' | '[2';

TUPLET_START : '(' DIGIT;

SLASH: '/';
L_BRACKET : '[';
R_BRACKET : ']';
DIGITS : DIGIT+;
DIGIT : '0'..'9';


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
abc_header : field_number field_title other_fields* field_key;

field_number : FIELD_NUMBER;
field_title : FIELD_TITLE;
other_fields : FIELD_COMPOSER | FIELD_DEFAULT_LENGTH | FIELD_METER | FIELD_TEMPO | FIELD_VOICE;
field_key : FIELD_KEY ;

/* Music stuff */
abc_music : voice+;
music_line : element+ LINEFEED (LYRIC LINEFEED)?;

pitch : ACCIDENTAL? BASENOTE OCTAVE?;
note : (pitch | REST) note_length?;
multinote: L_BRACKET (note)+ R_BRACKET;
note_length : (SLASH? DIGITS) | (DIGIT+ '/' DIGIT+);
note_element : note | multinote;
tuplet_element : TUPLET_START note_element+;

element : (note_element | tuplet_element | BARLINE | NTH_REPEAT) (SPACE*) ;

voice : (FIELD_VOICE music_line)+ | (music_line)?;