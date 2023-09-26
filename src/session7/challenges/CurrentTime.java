package session7.challenges;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentTime {

    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        displayCurrentTime(currentTime);
    }
    public static void displayCurrentTime(LocalTime time){
        LocalTime time = LocalTime.now();
        currentTime.format(DateTimeFormatter.ofPattern("HH:MM:SS"));
    }
}
