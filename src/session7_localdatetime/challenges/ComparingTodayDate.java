package session7_localdatetime.challenges;

import java.time.LocalDate;

public class ComparingTodayDate {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(isTodaySpecificDay(localDate));
    }

    public static boolean isTodaySpecificDay(LocalDate date) {
        LocalDate specificDate = LocalDate.of(2019, 12, 10);
        if (date.compareTo(specificDate) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
