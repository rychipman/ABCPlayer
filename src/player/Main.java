package player;

import java.io.IOException;

import grammar.ABCMusicParserTest;

/**
 * Main entry point of your application.
 */
public class Main {

    /**
     * Plays the input file using Java MIDI API and displays
     * header information to the standard output stream.
     * 
     * (Your code should not exit the application abnormally using
     * System.exit().)
     * 
     * @param file the name of input abc file
     */
    public static void play(String file) {
        // YOUR CODE HERE
    }

    public static void main(String[] args) {
        // CALL play() HERE
        try {
            System.out.println(ABCMusicParserTest.parseFile(ABCMusicParserTest.songFileNames[0]));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
