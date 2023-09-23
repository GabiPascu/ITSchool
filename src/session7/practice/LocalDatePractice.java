package session7.practice;

import java.time.LocalDate;

public class LocalDatePractice {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println("Today's date is: " + today);

        LocalDate afterTenYears = today.plusYears(10);
        System.out.println("The date after 10 years will be: " + afterTenYears);


    }
}