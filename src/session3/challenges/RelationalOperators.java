package session3.challenges;

import java.util.Scanner;

public class RelationalOperators {

    public static void main(String[] args) {

        boolean greaterThan = true;
        boolean lessThan = false;

        System.out.println("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Please add a 2nd number: ");
        int number2 = scanner.nextInt();
        if (number1 > number2) {
            System.out.println(number1 + " is greater than " + number2);
        } else if (number1 < number2) {
            System.out.println(number1 + " is less than " + number2);
        } else {
            System.out.println(number1 + " is equal to " + number2);
        }
        scanner.close();
    }
}



