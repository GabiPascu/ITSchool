package session7.practice;

import java.sql.Timestamp;

public class TimeStampPractice {

    public static void main(String[] args) {
        Timestamp currentTimeStamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Current timestamp: " + currentTimeStamp);

        Timestamp timestamp1 = Timestamp.valueOf("2023-09-22 15:20:30.214");
        Timestamp timestamp2 = Timestamp.valueOf("2023-09-22 15:21:30.214");

        long differenceInSeconds = (timestamp2.getTime() - timestamp1.getTime()) / 1000;
        System.out.println(differenceInSeconds);
    }
}