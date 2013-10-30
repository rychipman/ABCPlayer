package player;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SongTest {
    
    @Test
    public void test() {
    	Main.play("sample_abc/waxies_dargle.abc");
//        for (String fileName : SongTest.getAllSampleFileNames()){
//            Main.play(fileName);
//        }
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
