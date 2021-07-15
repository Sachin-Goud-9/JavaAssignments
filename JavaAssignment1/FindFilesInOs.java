import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindFilesInOs {
    public void findFiles(String pathToBeSearched, String fileName){
        //retrieve the fileName in the path
        File directory = new File(path);
        File files[] = directory.listFiles();

        if(files != null && files.length > 0) {
            for(File file : files) {
                if(file.isDirectory()) {
                    //recursively search for the files
                    findFiles(file.getAbsolutePath(), fileName);
                }
                else {
//					String eachFile = file.getAbsolutePath();
                    if(file.getName().endsWith("."+fileName)) {
                        System.out.println(file.getAbsolutePath() + " " + file.getName());
                    }
                }
            }
        }
    }
}
