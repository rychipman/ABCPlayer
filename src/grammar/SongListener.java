package grammar;

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

public class SongListener extends ABCMusicBaseListener {
	
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
	
	private List<Voice> voices;
	
	//temporary containers to be used when parsing higher-level objects
	private String voiceName;
	//container for things in the Voice
	private List<Music> components;
	private List<Music> tupletNotes;
	private List<Music> chordNotes;
	
	//Notes are always put in this container. this will be assigned to the appropriate
	//container from above (see below) when necessary
	private List<Music> chordParentContainer;
	private List<Music> tupletParentContainer;
	private List<Music> noteContainer;
	
	
	/**
	 * Top-level elements
	 */
	@Override public void enterAbc_tune(ABCMusicParser.Abc_tuneContext ctx) { }
	@Override public void exitAbc_tune(ABCMusicParser.Abc_tuneContext ctx) {
		song = new Song(header, body);
	}
	
	@Override public void enterAbc_header(ABCMusicParser.Abc_headerContext ctx) { }
	@Override public void exitAbc_header(ABCMusicParser.Abc_headerContext ctx) {
		header = new Header(index, title, composer, key, meter, tempo);
	}
	
	@Override public void enterAbc_music(ABCMusicParser.Abc_musicContext ctx) {	}
	@Override public void exitAbc_music(ABCMusicParser.Abc_musicContext ctx) {
		body = new Body(voices);
	}
	
	/**
	 * Header Elements
	 */

	@Override public void enterField_number(ABCMusicParser.Field_numberContext ctx) { }
	@Override public void exitField_number(ABCMusicParser.Field_numberContext ctx) {
		String indexString = parseText("X:", ctx.FIELD_NUMBER().getText());
		index = Integer.parseInt(indexString);
	}

	@Override public void enterField_title(ABCMusicParser.Field_titleContext ctx) { }
	@Override public void exitField_title(ABCMusicParser.Field_titleContext ctx) {
		title = parseText("T:", ctx.FIELD_TITLE().getText());
	}

	@Override public void enterOther_fields(ABCMusicParser.Other_fieldsContext ctx) { }
	@Override public void exitOther_fields(ABCMusicParser.Other_fieldsContext ctx) {
		if(ctx.FIELD_COMPOSER() != null) {
			
		}
		if(ctx.FIELD_DEFAULT_LENGTH() != null) {
			String fracText = ctx.FIELD_DEFAULT_LENGTH().getText();
			defaultLength = parseFraction(fracText);
		}
		if(ctx.FIELD_METER() != null) {
			String meterString = parseText("M:", ctx.FIELD_METER().getText());
			if(meterString.equals("C")) {
				meter = new Fraction(4,4);
			} else if(meterString.equals("C|")) {
				meter = new Fraction(2,2);
			} else {
				meter = parseFraction(meterString);
			}
		}
		if(ctx.FIELD_TEMPO() != null) {
			//TODO also parse for optional length field
			tempo = Integer.parseInt(ctx.FIELD_TEMPO().getText());
		}
		if(ctx.FIELD_VOICE() != null) {
			//TODO what is this doing in the header?
			voiceName = parseText("V:", ctx.FIELD_VOICE().getText());
		}
	}

	@Override public void enterField_key(ABCMusicParser.Field_keyContext ctx) { }
	@Override public void exitField_key(ABCMusicParser.Field_keyContext ctx) {
		String keyString = parseText("K:", ctx.FIELD_KEY().getText());
		key = new KeySignature(keyString);
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
		chordParentContainer = noteContainer;
		chordNotes = new ArrayList<Music>();
		noteContainer = chordNotes;
	}
	@Override public void exitMultinote(ABCMusicParser.MultinoteContext ctx) {
		//TODO not great form, but temporary -- assumes only notes can be in chords
		ArrayList<Note> notes = new ArrayList<Note>();
		for(Music m : chordNotes) {
			notes.add((Note)m);
		}
		chordParentContainer.add(new Chord(notes));
		noteContainer = chordParentContainer;
	}

	@Override public void enterTuplet_element(ABCMusicParser.Tuplet_elementContext ctx) {
		tupletParentContainer = noteContainer;
		//empty the tuplet note container
		tupletNotes = new ArrayList<Music>();
		//set the tuplet container as the current destination for all notes
		noteContainer = tupletNotes;
	}
	@Override public void exitTuplet_element(ABCMusicParser.Tuplet_elementContext ctx) {
		int type = Integer.parseInt(ctx.TUPLET_START().getText());
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
	}

	@Override public void enterNote_element(ABCMusicParser.Note_elementContext ctx) { }
	@Override public void exitNote_element(ABCMusicParser.Note_elementContext ctx) {
		//TODO parse the string into Accidental, note, octave, and duration parts
		Fraction duration = defaultLength;
		if(parsedDuration != null) {
			if(durationCtx.FRACTION() != null) {
				duration = fraction
			} else if(durationCtx.SLASH() != null) {
				int num = 1;
				int den = denominator of fraction
				duration = new Fraction(num, den);
			} else {
				int num = numerator of fraction
				int den = 1;
				duration = new Fraction(num, den);
			}
		}
		
		NoteEnum baseNote = NoteEnum.C;
		AccidentalEnum accidental = AccidentalEnum.NONE;
		int octave = 4;
		if(ctx.pitch() != null) {
			PitchContext pitchCtx = ctx.pitch();
			//TODO all this to parse and switch through the pitch
			//TODO do we need to add all the code for transposing here?
		}
		
		if(ctx.REST() != null) {
			noteContainer.add(new Rest(duration));
		} else {
			noteContainer.add(new Note(baseNote, accidental, octave, duration));
		}
	}

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
	
	private Fraction parseFraction(String str) {
		String[] fracArray = str.split("/");
		int num = Integer.parseInt(fracArray[0]);
		int den = Integer.parseInt(fracArray[1]);
		return new Fraction(num, den);
	}
	
	private String parseText(String label, String line) {
		//TODO make sure this works
		String[] split = line.split(label);
		return split[1].trim();
	}
}
