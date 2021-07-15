import java.io.*;
import java.util.*;


public class WriteContentsToFile {
    public void writeDataToFile(HashMap<Character, Integer> characterCountMap) throws IOEXception {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("outputFile.txt"));
        for(Character keyOfCharacterCountMap : characterCountMap.keySet()){
            bufferedWriter.append(c+" "+characterCountMap.get(keyOfCharacterCountMap));
            bufferedWriter.append("\n");
        }
        bufferedWriter.close();
    }
}
