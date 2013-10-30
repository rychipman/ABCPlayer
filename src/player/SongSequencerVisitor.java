package player;

import java.util.HashMap;
import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import sound.LyricListener;
import sound.Pitch;
import sound.SequencePlayer;

public class SongSequencerVisitor implements ISongSequencerVisitor{
    private KeySignature keySignature;
    private Fraction noteLengthPerBeat;
    private int beatsPerMinute;
    private HashMap<String, List<Music>> musicForVoiceName;
    
    public SongSequencerVisitor(){
        this.musicForVoiceName = new HashMap<String, List<Music>>();
    }
    
    @Override
    public void visit(Song song) {
        song.getHeader().accept(this);
        song.getBody().accept(this);
    }

    @Override
    public void visit(Header header) {
        this.keySignature = header.getKeySignature();
        this.noteLengthPerBeat = header.getNoteLengthPerBeat();
        this.beatsPerMinute = header.getBeatsPerMinute();
        System.out.println("Key sig is " + this.keySignature);
        System.out
                .println("note length per beat is " + noteLengthPerBeat);
        System.out.println("beats per minute is " + beatsPerMinute);
    }

    @Override
    public void visit(Body body) {
        for(Voice v : body.getVoices())
            v.accept(this);
    }

    @Override
    public void visit(Voice voice) {
        this.musicForVoiceName.put(voice.getVoiceName(), voice.getSongComponents());
    }
    
    public void play() throws MidiUnavailableException, InvalidMidiDataException{
        Fraction lcmCalc = new Fraction(1,1);
        for (String voiceName : this.musicForVoiceName.keySet())
            for(Music m : this.musicForVoiceName.get(voiceName))
                lcmCalc = new Fraction(1, Fraction.LCM(m.getDuration().getDenominator(), lcmCalc.getDenominator()));
                Fraction ticksPerBeat = new Fraction(1, lcmCalc.getDenominator() / this.noteLengthPerBeat.getDenominator());
        
        LyricListener listener = new LyricListener() {
             public void processLyricEvent(String text) {
                 System.out.println(text);
             }
        };
        SequencePlayer seqPlayer = new SequencePlayer(this.beatsPerMinute, ticksPerBeat.getDenominator(), listener);
                
        int startTick = 0;
        int duration;
        for (String voiceName : this.musicForVoiceName.keySet()){
            for(Music m : this.musicForVoiceName.get(voiceName)){
                duration = (ticksPerBeat.getDenominator() * m.getDuration().getNumerator() * this.noteLengthPerBeat.getDenominator()) / m.getDuration().getDenominator();
                if (m instanceof Note){
                    Note mNote = (Note)m;
                    Pitch pitch = new Pitch(mNote.getNote().toString().charAt(0)).transpose(mNote.getAccidental().getSemitoneOffset() + 12*mNote.getOctave());
                    if (mNote.getSyllable() != null) {seqPlayer.addLyricEvent(mNote.getSyllable(), startTick);}
                    System.out.println("Sequencing " + pitch
                            + ", " + startTick + ", "
                            + duration);
                    seqPlayer.addNote(pitch.toMidiNote(), startTick, duration);
                    startTick += duration;
                } else if (m instanceof Chord){
                    Chord mChord = (Chord)m;
                    if (mChord.getSyllable() != null) {seqPlayer.addLyricEvent(mChord.getSyllable(), startTick);}
                    for (Note n : mChord.getNotes()){
                        Pitch pitch = new Pitch(n.getNote().toString().charAt(0)).transpose(n.getAccidental().getSemitoneOffset() + 12*n.getOctave());
                        System.out.println("Sequencing " + pitch
                                + ", " + startTick + ", "
                                + duration);
                        seqPlayer.addNote(pitch.toMidiNote(), startTick, duration);
                    }
                    startTick += duration;
                } else if (m instanceof Tuplet) {
                    Tuplet mTuplet = (Tuplet)m;
                    int tupleNoteDur = duration;
                    tupleNoteDur = getTupleNoteDur(mTuplet.getType(), tupleNoteDur);
                    for (Music tupletElem : mTuplet.getNotes()){
                        if(tupletElem instanceof Note) {
                            Pitch pitch1 = null;
                        	Note n = (Note)tupletElem;
                        	pitch1 = new Pitch(n.getNote().toString().charAt(0)).transpose(n.getAccidental().getSemitoneOffset() + 12*n.getOctave());
                        	if (n.getSyllable() != null) {seqPlayer.addLyricEvent(n.getSyllable(), startTick);}
                        	System.out.println("Sequencing " + pitch1
                                    + ", " + startTick + ", "
                                    + tupleNoteDur);
                        	seqPlayer.addNote(pitch1.toMidiNote(), startTick, tupleNoteDur); 
                        	startTick += tupleNoteDur;
                        } else if (tupletElem instanceof Chord) {
                            Chord c = (Chord)tupletElem;
                            if (c.getSyllable() != null) {seqPlayer.addLyricEvent(c.getSyllable(), startTick);}
                            for (Note note : c.getNotes()){
                                Pitch pitch2 = null;
                                pitch2 = new Pitch(note.getNote().toString().charAt(0)).transpose(note.getAccidental().getSemitoneOffset() + 12*note.getOctave());
                                System.out.println("Sequencing " + pitch2
                                        + ", " + startTick + ", "
                                        + tupleNoteDur);
                                seqPlayer.addNote(pitch2.toMidiNote(), startTick, tupleNoteDur);
                            }
                            startTick += tupleNoteDur;
                        } else if (tupletElem instanceof Rest) {
                            startTick += tupleNoteDur;
                        } else {
                            throw new RuntimeException("You cannot build a tuple out of anything but a Note, Chord, or Rest");
                        }
                    }
                } else if (m instanceof Rest){
                    startTick += duration;
                }
            }
        }
        seqPlayer.play();
    }
    
    public static int getTupleNoteDur(TupleEnum type, int duration) {
        switch (type) {
        case DUPLET:
            duration /= 2;
            break;
        case TRIPLET:
            duration /= 3;
            break;
        case QUADRUPLET:
            duration /= 4;
            break;
        }
        return duration;
    }
    
}
