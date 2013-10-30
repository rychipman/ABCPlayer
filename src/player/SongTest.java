package player;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Test to ensure that we can play all the songs
 */

public class SongTest {
    
    /*
     * Partition input space : Play all the songs in our sample_abc directory
     */
    
    /**
     * Iterate through every song in the sample directory and play it
     */
    @Test
    public void testAllSongs() {
        String[] playMe = {"jingle"};
        boolean playAll = true;
        for (String fileName : SongTest.getAllSampleFileNames()){
            for(String s : playMe)
                if(fileName.contains(s) || playAll){
                    Main.play(fileName);
                    break;
                }
        }
    }
    
    /**
     * @return array of strings, where each element is a filename of a sample song
     */
    private static String[] getAllSampleFileNames(){
        
        // Get files
        String SAMPLE_FILE_DIRECTORY = "sample_abc";
        File folder = new File(SAMPLE_FILE_DIRECTORY);
        File[] listOfFiles = folder.listFiles();
        
        // Get file names
        List<String> fileNames = new ArrayList<String>();
        for (File f : listOfFiles)
            fileNames.add(SAMPLE_FILE_DIRECTORY+"/"+f.getName());
        
        return fileNames.toArray(new String[]{});
    }

}
