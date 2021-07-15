import java.net.*;
import java.io.*;

public class TimeTakenToPing {
    public void pingRequest(String ipAddress) throws UnknownHostException, IOException{
        long presentTime = System.currentTimeMillis();
        InetAddress inetAddress = InetAddress.getByName(ipAddress);
        System.out.println("Sending Ping Request to "+ ipAddress);
        if(inetAddress.isReachable(2000)) {
            System.out.println("Host is Reachable.");
        }
        else {
            System.out.println("Host is not Reachable.");
        }
        presentTime = System.currentTimeMillis() - presentTime;
        System.out.println("Time taken to ping the host: "+ ipAddress + " is " + presentTime + " milliseconds.");
    }
}
