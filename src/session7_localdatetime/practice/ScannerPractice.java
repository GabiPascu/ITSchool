package session7_localdatetime.practice;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String input = scanner.nextLine();
//
//        System.out.println("You entered: " + input);
//        printConsoleSum(scanner);
        printConsoleAverage(scanner);
    }

    public static void printConsoleSum(Scanner scanner) {
        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();

        int sum = number1 + number2;
        System.out.println("The sum is: " + sum);
    }

    public static void printConsoleAverage (Scanner scanner) {
        double sum = 0;

        for (int index = 0; index < 5; index++) {
            System.out.println("Enter your number: ");
            sum += scanner.nextInt();
        }
        double average = sum / 5;
        System.out.println("The average is: " + sum);
    }
}
