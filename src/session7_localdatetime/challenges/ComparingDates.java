package session7_localdatetime.challenges;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ComparingDates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the 1st date in format YYYY-MM-DD: ");
        String date1 = scanner.nextLine();
        System.out.println("Please enter the 2nd date in format YYYY-MM-DD: ");
        String date2 = scanner.nextLine();
        System.out.println(areDatesEqual(date1, date2));
    }

    public static boolean areDatesEqual(String date1, String date2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date1Converted = LocalDate.parse(date1, formatter);
        LocalDate date2Converted = LocalDate.parse(date2, formatter);

        if (date1Converted.compareTo(date2Converted) == 0) {
            return true;
        } else{
            return false;
        }
    }
}