package grammar;

import grammar.ABCMusicParser.Field_voiceContext;
import grammar.ABCMusicParser.L_bracketContext;
import grammar.ABCMusicParser.LyricContext;
import grammar.ABCMusicParser.R_bracketContext;

import java.util.ArrayList;
import java.util.HashMap;
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
	
	private int index = 1;
	private String title = "DEFAULT";
	private String composer = "DEFAULT";
	private KeySignature key = null;
	private Fraction defaultLength = null;
	private Fraction meter = new Fraction(4,4);
	private Fraction tempoBeat = null;
	private int bpm = -1;
	
	private List<Voice> voices = new ArrayList<Voice>();
	private HashMap<String, List<Music>> musicForVoiceName = new HashMap<String, List<Music>>();
	
	private boolean inMultinote = false;
	private int remainingInTuplet = 0;
	
	//temporary containers to be used when parsing higher-level objects
	private String voiceName;
	//container for things in the Voice
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
		System.out.println(song.toString());
	}
	
	@Override public void enterAbc_header(ABCMusicParser.Abc_headerContext ctx) { }
	@Override public void exitAbc_header(ABCMusicParser.Abc_headerContext ctx) {
	    if(key == null)
	        throw new IllegalArgumentException("File is invalid - requires a key signature");
	    if(defaultLength == null)
	        defaultLength = (meter.getNumerator()*1.0/(1.0*meter.getDenominator()) < 0.75) ? new Fraction(1,16) : new Fraction(1,8);
	    if(bpm == -1)
	        bpm = 100;
	    if(tempoBeat == null)
	        tempoBeat = defaultLength;
		header = new Header(index, title, composer, key, meter, bpm, tempoBeat, defaultLength);
		System.out.println("Created header");
	}
	
	@Override public void enterAbc_music(ABCMusicParser.Abc_musicContext ctx) {	
	    if(this.voiceName == null){
	        this.voiceName = "THE_DEFAULT_VOICE";
	        this.musicForVoiceName.put(this.voiceName, new ArrayList<Music>());
	        System.out.println("Added the default voice");
	    }
	}
	@Override public void exitAbc_music(ABCMusicParser.Abc_musicContext ctx) {
	    for(String name : this.musicForVoiceName.keySet()){
	        System.out.println("Added voice " + name + " to voices list");
	        voices.add(new Voice(name, musicForVoiceName.get(name)));
	    }
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
	}

	@Override public void enterField_title(ABCMusicParser.Field_titleContext ctx) { }
	@Override public void exitField_title(ABCMusicParser.Field_titleContext ctx) {
		title = ctx.FIELD_TITLE().getText().replace("T:", "").trim();
	}

	@Override public void enterOther_fields(ABCMusicParser.Other_fieldsContext ctx) { }
	@Override public void exitOther_fields(ABCMusicParser.Other_fieldsContext ctx) {
		if(ctx.FIELD_COMPOSER() != null) {
			composer = ctx.FIELD_COMPOSER().getText().replace("C:", "").trim();
		}
		if(ctx.FIELD_DEFAULT_LENGTH() != null) {
			String fracText = ctx.FIELD_DEFAULT_LENGTH().getText().replace("L:", "").trim();
			defaultLength = new Fraction(fracText);
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
		}
		if(ctx.FIELD_TEMPO() != null) {
			//TODO also parse for optional length field
		    String[] tempoStrings = ctx.FIELD_TEMPO().getText().replace("Q:","").split("=");
		    tempoBeat = new Fraction(tempoStrings[0].trim());
		    bpm = Integer.parseInt(tempoStrings[1].trim());
		}
		if(ctx.FIELD_VOICE() != null) {
			voiceName = ctx.FIELD_VOICE().getText().replace("V:", "").trim();
			if(!this.musicForVoiceName.containsKey(voiceName))
			    this.musicForVoiceName.put(voiceName, new ArrayList<Music>());
		}
	}

	
	@Override public void enterField_key(ABCMusicParser.Field_keyContext ctx) { }
	@Override public void exitField_key(ABCMusicParser.Field_keyContext ctx) {
		String keyString = ctx.FIELD_KEY().getText().replace("K:", "").trim();
		key = new KeySignature(keyString);
	}
	
	/**
	 * Music Elements
	 */
	
	@Override public void enterBarline(ABCMusicParser.BarlineContext ctx) {
		if(barsContainer.size() > 0) {
			//if this is not the first bar of the line
			barsContainer.add(currentBar);
			currentBar = new ArrayList<Music>();
		}
		noteContainer = currentBar;
	}
	
	@Override public void enterAbc_line(ABCMusicParser.Abc_lineContext ctx) { }
	@Override public void exitAbc_line(ABCMusicParser.Abc_lineContext ctx) { }
	
	@Override public void enterElement(ABCMusicParser.ElementContext ctx) { }
	@Override public void exitElement(ABCMusicParser.ElementContext ctx) { }

	@Override public void enterMultinote(ABCMusicParser.MultinoteContext ctx) {	
	}
	@Override public void exitMultinote(ABCMusicParser.MultinoteContext ctx) {
	    this.inMultinote = false;
	}

	@Override public void enterTuplet_element(ABCMusicParser.Tuplet_elementContext ctx) {
		tupletParentContainer = noteContainer;
		//empty the tuplet note container
		tupletNotes = new ArrayList<Music>();
		//set the tuplet container as the current destination for all notes
		noteContainer = tupletNotes;
		this.inMultinote = true;
	}
	@Override public void exitTuplet_element(ABCMusicParser.Tuplet_elementContext ctx) {
		int type = 3;
	    if(ctx.DUPLET() != null)
		    type = 2;
	    else if (ctx.QUADRUPLET() != null)
	        type = 4;
	    
	    TupleEnum tupletType = TupleEnum.TRIPLET;
		switch(type) {
		    case 2: tupletType = TupleEnum.DUPLET; break;
		    case 3: tupletType = TupleEnum.TRIPLET; break;
		    case 4: tupletType = TupleEnum.QUADRUPLET; break;
		}
		this.inMultinote = false;
		//create the tuplet object and append it to the voice
		tupletParentContainer.add(new Tuplet(tupletType, tupletNotes));		    
		//set the container back to the main voice
		noteContainer = tupletParentContainer;
		this.musicForVoiceName.get(voiceName).add(new Tuplet(tupletType, tupletNotes));
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
			Fraction duration = new Fraction(1,1);
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
			    for(int i = 0; i < 20; i++)
				noteContainer.add(new Rest(duration));
			    if(!this.inMultinote)
			        this.musicForVoiceName.get(voiceName).add(new Rest(duration));
			} else {
				noteContainer.add(new Note(baseNote, accidental, octave, duration));
				if(!this.inMultinote){

				    this.musicForVoiceName.get(voiceName).add(new Note(baseNote, accidental, octave, duration));
				}
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
                if(syllable != null)
                	lyric.add(syllable.toString());
                lyric.add("|");
                syllable = null;
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
        matchLyricsToNotes(lyric, barsContainer);
    }
    @Override
    public void enterField_voice(Field_voiceContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitField_voice(Field_voiceContext ctx) {
        voiceName = ctx.getText().replace("V:", "").trim();
        if(!this.musicForVoiceName.containsKey(voiceName))
            this.musicForVoiceName.put(voiceName, new ArrayList<Music>());
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
	
	private void matchLyricsToNotes(List<String> lyrics, List<List<Music>> bars) {
		int noteCount = 0;
		for(int i=0; i<bars.size(); i++) {
			List<Music> bar = bars.get(i);
			for(int j=0; j<bar.size(); j++) {
				int index = noteCount;
				Music m = bar.get(j);
				if(m instanceof Note) {
					noteCount++;
					String lyric = lyrics.get(index);
					((Note)m).setSyllable(lyric);
				}
			}
		}
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
        this.inMultinote = true;
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
        noteContainer = chordParentContainer;
        this.inMultinote = false;
        this.musicForVoiceName.get(voiceName).add(new Chord(notes));
        
    }
}
