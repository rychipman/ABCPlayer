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

COMMENT : '%' (~'\n')* -> skip;
FIELD_NUMBER : 'X:' (SPACE)* DIGIT+ ;
FIELD_TITLE : 'T:' (SPACE)*  (~'\n')+ ; 
FIELD_COMPOSER : 'C:' (SPACE)*  (~'\n')+ ; 
FIELD_DEFAULT_LENGTH : 'L:' (SPACE)* (DIGIT+ '/' DIGIT+) ;
FIELD_METER : 'M:' (SPACE)* ('C' | 'C|' | (DIGIT+ '/' DIGIT+)) ;
FIELD_TEMPO : 'Q:' (SPACE)* ((DIGIT+ '/' DIGIT+) '=')? DIGIT+ ;
FIELD_VOICE : 'V:' (SPACE)*  (~'\n')+ ; 

FRACTION : DIGIT+ '/' DIGIT+;

LINEFEED : ('\t' | '\r' | '\n')+ ;
NOTE : (PITCH | REST) ( SLASH | (DIGIT+ SLASH) | (SLASH? DIGIT+) | (DIGIT+ '/' DIGIT+))?;
PITCH : ('^' | '^^' | '_' | '__' | '=')? ('C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B' | 'c' | 'd' | 'e' | 'f' | 'g' | 'a' | 'b') ('\''+ | ','+)?;
KEYACCIDENTAL : '#' | 'b';
MODEMINOR : 'm';
SPACE : ' '+ -> skip;
REST : 'z';
BARLINE : '|' | '||' | '[|' | '|]' | ':|' | '|:';


FIELD_KEY : 'K:' (SPACE)* ('C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B' | 'c' | 'd' | 'e' | 'f' | 'g' | 'a' | 'b') KEYACCIDENTAL? MODEMINOR?;

LYRIC : 'w:' (' '+ | '-' | '_' | '*' | '~' | '\-' | '|' )* (~'\n')*; 

NTH_REPEAT : '[1' | '[2';

DUPLET : '(2';
TRIPLET : '(3';
QUADRUPLET : '(4';

SLASH: '/';
L_BRACKET : '[';
R_BRACKET : ']';
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
abc_header : field_number LINEFEED field_title LINEFEED (other_fields LINEFEED)* field_key LINEFEED;

field_number : FIELD_NUMBER;
field_title : FIELD_TITLE;
other_fields : FIELD_COMPOSER | FIELD_DEFAULT_LENGTH | FIELD_METER | FIELD_TEMPO | FIELD_VOICE;
field_key : FIELD_KEY ;

/* Music stuff */
abc_music : abc_line+;
abc_line : (element+ LINEFEED* (lyric LINEFEED*)? | field_voice) LINEFEED?;

lyric : LYRIC;
field_voice : FIELD_VOICE;
l_bracket : L_BRACKET;
r_bracket : R_BRACKET;
multinote: l_bracket (note_element)+ r_bracket;
note_element : NOTE | multinote;

tuplet_element : (DUPLET element element) | (TRIPLET element element element) | (QUADRUPLET element element element element);
barline : BARLINE SPACE*;
element : (note_element | tuplet_element | barline | NTH_REPEAT ) (SPACE*) ;