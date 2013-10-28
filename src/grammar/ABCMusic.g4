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

COMMENT : '%' (~'\n')+ LINEFEED;
FN_START : 'X:' (SPACE)* DIGITS ;
FTI_START : 'T:' (SPACE)*  (~'\n')+ ; 
FC_START : 'C:' (SPACE)*  (~'\n')+ ; 
FD_START : 'L:' (SPACE)* (DIGIT+ '/' DIGIT+) ;
FM_START : 'M:' (SPACE)* ('C' | 'C|' | (DIGIT+ '/' DIGIT+)) ;
FTE_START : 'Q:' (SPACE)* ((DIGIT+ '/' DIGIT+) '=')? DIGITS ;
FV_START : 'V:' (SPACE)*  (~'\n')+ ; 

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


FK_START : 'K:' (SPACE)* BASENOTE KEYACCIDENTAL? MODEMINOR?;

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
 
abc_tune : EOF;

/* Header stuff */
abc_header : field_number COMMENT* field_title other_fields* field_key;

field_number : FN_START;
field_title : FTI_START;
other_fields : field_composer | field_default_length | field_meter | field_tempo | field_voice | COMMENT;
field_composer : FC_START ;
field_default_length : FD_START ;
field_meter : FM_START ;
field_tempo : FTE_START  ;
field_voice : FV_START ;
field_key : FK_START ;

/* Music stuff */
abc_music : (voice | COMMENT)+;
music_line : element+ LINEFEED (LYRIC LINEFEED)?;

pitch : ACCIDENTAL? BASENOTE OCTAVE?;
note : (pitch | REST) note_length?;
multinote: L_BRACKET (note)+ R_BRACKET;
note_length : (SLASH? DIGITS) | (DIGIT+ '/' DIGIT+);
note_element : note | multinote;
tuplet_element : TUPLET_START note_element+;

element : (note_element | tuplet_element | BARLINE | NTH_REPEAT) (SPACE*) ;

voice : (field_voice music_line)+ | (music_line)?;