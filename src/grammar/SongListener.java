package grammar;

import grammar.ABCMusicParser.Field_voiceContext;
import grammar.ABCMusicParser.L_bracketContext;
import grammar.ABCMusicParser.LyricContext;
import grammar.ABCMusicParser.R_bracketContext;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import player.AccidentalEnum;
import player.Body;
import player.Chord;
import player.Fraction;
import player.Header;
import player.KeySignature;
import player.Music;
import player.Note;
import player.NoteEnum;
import player.Rest;
import player.Song;
import player.TupleEnum;
import player.Tuplet;
import player.Voice;

public class SongListener implements ABCMusicListener {
	
	private Song song;
	private Header header;
	private Body body;
	
	private int index;
	private String title;
	private String composer;
	private KeySignature key;
	private Fraction defaultLength;
	private Fraction meter;
	private int tempo;
	
	private List<Voice> voices = new ArrayList<Voice>();
	
	//temporary containers to be used when parsing higher-level objects
	private String voiceName;
	//container for things in the Voice
	private List<Music> components = new ArrayList<Music>();
	private List<Music> tupletNotes = new ArrayList<Music>();
	private List<Music> chordNotes = new ArrayList<Music>();
	
	//Notes are always put in this container. this will be assigned to the appropriate
	//container from above (see below) when necessary
	private List<Music> chordParentContainer = new ArrayList<Music>();
	private List<Music> tupletParentContainer = new ArrayList<Music>();
	private List<Music> noteContainer = new ArrayList<Music>();
	
	
	/**
	 * Top-level elements
	 */
	@Override public void enterAbc_tune(ABCMusicParser.Abc_tuneContext ctx) { }
	@Override public void exitAbc_tune(ABCMusicParser.Abc_tuneContext ctx) {
		song = new Song(header, body);
		System.out.println("Created Song");
	}
	
	@Override public void enterAbc_header(ABCMusicParser.Abc_headerContext ctx) { }
	@Override public void exitAbc_header(ABCMusicParser.Abc_headerContext ctx) {
		header = new Header(index, title, composer, key, meter, tempo);
		System.out.println("Created header");
	}
	
	@Override public void enterAbc_music(ABCMusicParser.Abc_musicContext ctx) {	}
	@Override public void exitAbc_music(ABCMusicParser.Abc_musicContext ctx) {
		body = new Body(voices);
		System.out.println("Created body");
	}
	
	/**
	 * Header Elements
	 */

	@Override public void enterField_number(ABCMusicParser.Field_numberContext ctx) { }
	@Override public void exitField_number(ABCMusicParser.Field_numberContext ctx) {
		String indexString = ctx.FIELD_NUMBER().getText().replace("X:", "").trim();
		index = Integer.parseInt(indexString);
		System.out.println("The index is " + indexString);
	}

	@Override public void enterField_title(ABCMusicParser.Field_titleContext ctx) { }
	@Override public void exitField_title(ABCMusicParser.Field_titleContext ctx) {
		title = ctx.FIELD_TITLE().getText().replace("T:", "").trim();
		System.out.println("The title is " + title);
	}

	@Override public void enterOther_fields(ABCMusicParser.Other_fieldsContext ctx) { }
	@Override public void exitOther_fields(ABCMusicParser.Other_fieldsContext ctx) {
		if(ctx.FIELD_COMPOSER() != null) {
			composer = ctx.FIELD_COMPOSER().getText().replace("C:", "").trim();
			System.out.println("Composer is " + composer);
		}
		if(ctx.FIELD_DEFAULT_LENGTH() != null) {
			String fracText = ctx.FIELD_DEFAULT_LENGTH().getText().replace("L:", "").trim();
			defaultLength = new Fraction(fracText);
			System.out.println("Default length is " + defaultLength);
		}
		if(ctx.FIELD_METER() != null) {
			String meterString = ctx.FIELD_METER().getText().replace("M:", "").trim();
			if(meterString.equals("C")) {
				meter = new Fraction(4,4);
			} else if(meterString.equals("C|")) {
				meter = new Fraction(2,2);
			} else {
				meter = new Fraction(meterString);
			}
			System.out.println("Meter is " + meter);
		}
		if(ctx.FIELD_TEMPO() != null) {
			//TODO also parse for optional length field
		    String tempoString = ctx.FIELD_TEMPO().getText().replace("Q:", "").trim();
		    int indexOfTempo = tempoString.indexOf("=");
		    if (indexOfTempo+1 >= 0 && indexOfTempo+1 < tempoString.length())
		        tempoString = tempoString.substring(indexOfTempo+1);
			tempo = Integer.parseInt(tempoString);
			System.out.println("Tempo is " + tempo);
		}
		if(ctx.FIELD_VOICE() != null) {
			//TODO what is this doing in the header?
			voiceName = ctx.FIELD_VOICE().getText().replace("V:", "").trim();
			System.out.println("Voice name is " + voiceName);
		}
	}

	@Override public void enterField_key(ABCMusicParser.Field_keyContext ctx) { }
	@Override public void exitField_key(ABCMusicParser.Field_keyContext ctx) {
		String keyString = ctx.FIELD_KEY().getText().replace("K:", "").trim();
		key = new KeySignature(keyString);
		System.out.println("Key is " + keyString);
	}
	
	/**
	 * Music Elements
	 */
	
	@Override public void enterBarline(ABCMusicParser.BarlineContext ctx) { }
	@Override public void exitBarline(ABCMusicParser.BarlineContext ctx) { }
	
	@Override public void enterAbc_line(ABCMusicParser.Abc_lineContext ctx) { }
	@Override public void exitAbc_line(ABCMusicParser.Abc_lineContext ctx) { }
	
	@Override public void enterElement(ABCMusicParser.ElementContext ctx) { }
	@Override public void exitElement(ABCMusicParser.ElementContext ctx) { }

	@Override public void enterMultinote(ABCMusicParser.MultinoteContext ctx) {	
	    System.out.println("Started multinote");
	}
	@Override public void exitMultinote(ABCMusicParser.MultinoteContext ctx) {
	    System.out.println("Ended multinote");
	}

	@Override public void enterTuplet_element(ABCMusicParser.Tuplet_elementContext ctx) {
		tupletParentContainer = noteContainer;
		//empty the tuplet note container
		tupletNotes = new ArrayList<Music>();
		//set the tuplet container as the current destination for all notes
		noteContainer = tupletNotes;
	}
	@Override public void exitTuplet_element(ABCMusicParser.Tuplet_elementContext ctx) {
		int type = Integer.parseInt(ctx.TUPLET_START().getText().replace("(", "").trim());
		TupleEnum tupletType = TupleEnum.TRIPLET;
		switch(type) {
		    case 2: tupletType = TupleEnum.DUPLET; break;
		    case 3: tupletType = TupleEnum.TRIPLET; break;
		    case 4: tupletType = TupleEnum.QUADRUPLET; break;
		}
		//create the tuplet object and append it to the voice
		tupletParentContainer.add(new Tuplet(tupletType, tupletNotes));		    
		//set the container back to the main voice
		noteContainer = tupletParentContainer;
		System.out.println("Tuplet with " + new Tuplet(tupletType, tupletNotes));
	}

	@Override public void enterNote_element(ABCMusicParser.Note_elementContext ctx) { }
	/**
	 * Called whenever the lisener exits a note_element. If the note element is also a multinote,
	 * it ignores and lets the multinote handler take it. If it is a basic note, parses and creates
	 * the note object
	 */
	@Override public void exitNote_element(ABCMusicParser.Note_elementContext ctx) {
		// if this is a base note element, not a multinote (chord)
		if(ctx.NOTE() != null) {
			//Split the string into a note and a note_duration part
			String noteString = ctx.NOTE().getText();
			String[] splitNote = noteString.split("(?=[\\d+/])",2);
			String pitchString = splitNote[0];
			
			//Parse the not duration
			Fraction duration = defaultLength;
			if(splitNote.length == 2) {
				//TODO why does fraction notation for duration allow for just a slash?
				String durationString = splitNote[1];
				String[] splitFraction = durationString.split("(?=/)|(?<=/)");
				if(splitFraction.length == 3) {
					int num = 1;
					int den = 1;
					if(splitFraction[0].equals("")) {
						den = Integer.parseInt(splitFraction[2]);
					} else if(splitFraction[2].equals("")) {
						//this case should never happen..right?
					} else {
						num = Integer.parseInt(splitFraction[0]);
						den = Integer.parseInt(splitFraction[2]);
					}
					duration = new Fraction(num, den);
				} else if(splitFraction.length == 1) {
					int num = Integer.parseInt(splitFraction[0]);
					int den = 1;
					duration = new Fraction(num, den);
				}
			}
			
			//Set arbitrary default values
			NoteEnum baseNote = NoteEnum.C;
			AccidentalEnum accidental = AccidentalEnum.NONE;
			int octave = 0;	
			
			//split the pitch into accidental, basenote, octave
			String[] splitPitch = pitchString.split("(?=[A-Ga-gz])|(?<=[A-Ga-gz])");
			
			//parse for basenote
			String basenoteString = splitPitch[1];
			if(basenoteString.toLowerCase().equals("a")) {
				baseNote = NoteEnum.A;
			} else if(basenoteString.toLowerCase().equals("b")) {
				baseNote = NoteEnum.B;
			} else if(basenoteString.toLowerCase().equals("c")) {
				baseNote = NoteEnum.C;
			} else if(basenoteString.toLowerCase().equals("d")) {
				baseNote = NoteEnum.D;
			} else if(basenoteString.toLowerCase().equals("e")) {
				baseNote = NoteEnum.E;
			} else if(basenoteString.toLowerCase().equals("f")) {
				baseNote = NoteEnum.F;
			} else if(basenoteString.toLowerCase().equals("g")) {
				baseNote = NoteEnum.G;
			}
			
			//Apply key signature
			accidental = setKeySigAccidental(baseNote);			
			
			//Apply any inline accidentals
			String accidentalString = splitPitch[0];
			if(accidentalString.equals("_")) {
				accidental = AccidentalEnum.FLAT;
			} else if(accidentalString.equals("__")) {
				accidental = AccidentalEnum.DOUBLE_FLAT;
			} else if(accidentalString.equals("^")) {
				accidental = AccidentalEnum.SHARP;
			} else if(accidentalString.equals("^^")) {
				accidental = AccidentalEnum.DOUBLE_SHARP;
			} else if(accidentalString.equals("=")) {
				accidental = AccidentalEnum.NATURAL;
			}
			
			//parse for octave
			if(basenoteString.equals(basenoteString.toLowerCase()))
				octave++;
			if(splitPitch.length == 3) {
				//if octave is specified
				String octaveString = splitPitch[2];
				String octaveType = octaveString.substring(0, 1); 
				for(int i=0; i<octaveString.length(); i++) {
					if(octaveType.equals("'"))
						octave++;
					else if(octaveType.equals(","))
						octave--;
				}
			}		
			
			//add a rest or a note
			if(basenoteString.equals("z")) {
				noteContainer.add(new Rest(duration));
			} else {
				noteContainer.add(new Note(baseNote, accidental, octave, duration));
				System.out.println(noteContainer.get(noteContainer.size() - 1));
			}
		}
	}
	
	@Override
    public void enterLyric(LyricContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitLyric(LyricContext ctx) {
        List<String> lyric = new ArrayList<String>();
        StringBuilder syllable = new StringBuilder();
        String context = ctx.LYRIC().getText();

        for (int i=2; i < context.length(); i++) { //start at i = 2 so as to skip the w: at the beginning of lyric

            if (context.charAt(i) == '-') {
            	if(syllable != null) {
	            	syllable.append("-");
	                lyric.add(syllable.toString());
            	} else {
            		lyric.add("-");
            	}
                syllable = null;
            } else if (context.charAt(i) == '_') {
            	if(syllable != null) {
	            	syllable.append("_");
	                lyric.add(syllable.toString());
            	}
            	lyric.add("_");
                syllable = null;
            } else if (context.charAt(i) == '*') {
            	if(syllable != null)
            		lyric.add(syllable.toString());
            	lyric.add("");
                syllable = null;
            } else if (context.charAt(i) == '~') {
                syllable.append(" "); //
            } else if (String.valueOf(context.charAt(i)).equals("/-")) {
                syllable.append("-");
            } else if (context.charAt(i) == '|') {
                //TODO this one is hard...I'm gonna have to attach lyrics to notes bar by bar 
            } else if(context.charAt(i) == ' ') {
            	if(syllable != null)
            		lyric.add(syllable.toString());
            	syllable = null;
            } else { // else context[i] should be a letter
            	if(syllable == null)
            		syllable = new StringBuilder();
                syllable.append(context.charAt(i) + "");
            } 
            if(i == context.length()-1 && syllable != null) {
            	//don't forget to add any leftovers at the end!
            	lyric.add(syllable.toString());
            }
        } 
        
    }
    @Override
    public void enterField_voice(Field_voiceContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitField_voice(Field_voiceContext ctx) {
        String voiceName = ctx.getText().replace("V:", "").trim();
        System.out.println("Switched to voice name = " + voiceName);
        //voiceName = parseText("V:", ctx.FIELD_VOICE().getText());
        //System.out.println("Voice name is " + voiceName);
    }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
	
	private AccidentalEnum setKeySigAccidental(NoteEnum note) {
		int[] accidentals = key.getAccidentals();
		int index = 0;
		switch(note) {
		case A: index = 0; break;
		case B: index = 1; break;
		case C: index = 2; break;
		case D: index = 3; break;
		case E: index = 4; break;
		case F: index = 5; break;
		case G: index = 6; break;
		}
		if(accidentals[index] == 2)
			return AccidentalEnum.DOUBLE_SHARP;
		if(accidentals[index] == 1)
			return AccidentalEnum.SHARP;
		if(accidentals[index] == 0)
			return AccidentalEnum.NONE;
		if(accidentals[index] == -1)
			return AccidentalEnum.FLAT;
		if(accidentals[index] == -2)
			return AccidentalEnum.DOUBLE_FLAT;
		return AccidentalEnum.NONE;
	}

	public Song getSong() {
		return song;
	}
    @Override
    public void enterL_bracket(L_bracketContext ctx) {}
    @Override
    public void exitL_bracket(L_bracketContext ctx) {
        chordParentContainer = noteContainer;
        chordNotes = new ArrayList<Music>();
        noteContainer = chordNotes;
    }
    @Override
    public void enterR_bracket(R_bracketContext ctx) {}
    @Override
    public void exitR_bracket(R_bracketContext ctx) {
        ArrayList<Note> notes = new ArrayList<Note>();
        for(Music m : chordNotes) {
            notes.add((Note)m);
        }
        chordParentContainer.add(new Chord(notes));
        System.out.println(new Chord(notes));
        noteContainer = chordParentContainer;
        
    }
}
