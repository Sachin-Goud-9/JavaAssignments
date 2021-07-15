
import java.net.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String ipAddress = bufferedReader.readLine();
        TimeTakenToPing timeTakenToPing = new TimeTakenToPing();
        timeTakenToPing.pingRequest(ipAddress);
    }
}
