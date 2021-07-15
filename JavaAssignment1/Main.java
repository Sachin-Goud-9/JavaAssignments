import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        //BufferedReader to take input
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FindFilesInOs findFilesInOs = new FindFilesInOs();
        System.out.println("Type \"exit\" to stop giving input for Searching Files.");
        //Input fileName
        while(true) {
            String inputFileRead = bufferedReader.readLine();
            if(inputFileRead == "exit") {
                break;
            }
            findFilesInOs.findFiles("/home",inputFileRead);
        }
    }
}
