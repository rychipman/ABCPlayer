package player;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SongTest {
    
    /*
     * Parition input space : Play all the songs in our sample directory
     */
    
    @Test
    public void testAllSongs() {
        String[] playMe = {"jingle"};
        for (String fileName : SongTest.getAllSampleFileNames()){
            for(String s : playMe)
                if(fileName.contains(s)){
                    Main.play(fileName);
                    break;
                }
        }
    }
    
    private static String[] getAllSampleFileNames(){
        String SAMPLE_FILE_DIRECTORY = "sample_abc";
        File folder = new File(SAMPLE_FILE_DIRECTORY);
        File[] listOfFiles = folder.listFiles();
        List<String> fileNames = new ArrayList<String>();
        for (File f : listOfFiles)
            fileNames.add(SAMPLE_FILE_DIRECTORY+"/"+f.getName());
        return fileNames.toArray(new String[]{});
    }

}
