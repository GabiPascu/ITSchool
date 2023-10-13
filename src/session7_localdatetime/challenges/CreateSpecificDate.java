package session7_localdatetime.challenges;

import java.time.LocalDate;

public class CreateSpecificDate {

    public static void main(String[] args) {
        createSpecificDate(2025, 8, 19);

    }

    public static void createSpecificDate(int  year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println(date);
    }
}