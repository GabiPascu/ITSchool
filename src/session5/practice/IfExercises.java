package session5.practice;

public class IfExercises {

    public static void main(String[] args) {
        int numberValue = 5;
        int numberToCompareValue = 10;
        printNumberComparisonInfo(numberValue, numberToCompareValue);
        printMultipleNumberComparisonInfo(numberValue);
    }

    private static void printNumberComparisonInfo(int number, int numberToCompare) {
        if (number > 10) {
            System.out.println("The number is greater than 10.");
        } else if (number == 10) {
            System.out.println("The number is equal to 10.");
        } else {
            System.out.println("The number is smaller than 10.");
        }
    }

    private static void printMultipleNumberComparisonInfo(int number) {
        if (number >= 0 && number <= 50) {
            System.out.println("The number is between 0 - 50.");
        } else if (number >= 51 && number <= 100) {
            System.out.println("The number is between 51 - 100.");
        } else {
            System.out.println("The number is out of range.");
        }
    }
}
