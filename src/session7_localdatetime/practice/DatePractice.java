package session7_localdatetime.practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePractice {

    public static void main(String[] args) {
        Date dateUtil = new Date();
        java.sql.Date dateSql = new java.sql.Date(dateUtil.getTime());

        System.out.println("java.util.Date: " + dateUtil);
        System.out.println("java.util.Date: " + dateSql);

        extractTimeFromUtilDate();
    }

    public static void extractTimeFromUtilDate() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String time = sdf.format(date);
        System.out.println("Time portion: " + time);
    }
}