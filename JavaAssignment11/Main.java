import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Character, Integer> characterCountMap = new HashMap<Character,Integer>();
        CountCharacterInAString countCharacterInAString = new CountCharacterInAString();
        WriteContentsToFile writeContentsToFile = new WriteContentsToFile();

        BufferedReader bufferedReader =new BufferedReader(new FileReader(args[0]));

        String lineReadFromBuffer = bufferedReader.readLine();
        while(read!=null){
            countCharacterInAString.countCharacterInAnInputString(characterCountMap, lineReadFromBuffer);
            lineReadFromBuffer=bufferedReader.readLine();
        }
        writeContentsToFile.writeDataToFile(characterCountMap);
    }
}
