package session15_hascode_and_enums.practice.enums;

public class EnumsPractice {

    public static void main(String[] args) {
             printEnumValues();
             printDayMessage(Day.FRIDAY);
    }

    private static void printDayMessage(Day day) {
        switch (day) {
            case MONDAY -> System.out.println("Start of the week.");
            case FRIDAY -> System.out.println("It's Fri-YAY.");
            default -> System.out.println("Invalid day.");
        }
    }
    private static void printEnumValues() {
        for (Day day : Day.values()) {
            System.out.println(day + " is a weekday: " + day.isWeekday());
        }
    }
}