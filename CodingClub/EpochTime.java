package CodingClub;

import java.util.Date;
public class EpochTime {
    public static void main(String[] args) {
        Date date = new Date();
        long epochTime = date.getTime();
        System.out.println("Epoch Time: " + epochTime);

        for (int i = 0; i < 1000000; i++) {
            
        }
        long timeNow = new Date().getTime();
        long diff = (timeNow - epochTime);
        System.out.println(diff + " Millisecond to run 10^6 on my machine");

        System.out.println(new Date()); // Thu Jan 02 22:25:22 IST 2025

        System.out.println(new Date().toInstant()); // 2025-01-02T16:55:22.102Z

        Date dateFromEpoch = new Date(1735837117937L);
        System.out.println(dateFromEpoch);

        
    }
}
