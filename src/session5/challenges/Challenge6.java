package session5.challenges;

import java.util.Scanner;


//Write a program that asks the user to enter numbers. The program should continue prompting the user until they enter -1. After they enter -1, print the sum of all numbers entered (excluding -1).
public class Challenge6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers (enter -1 to calculate the sum):");

        int number;
        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number == -1) {
                break; // Exit the loop when -1 is entered
            }

            sum += number; // Add the entered number to the sum
        }

        System.out.println("Sum of the entered numbers (excluding -1): " + sum);
        scanner.close();
    }
}





