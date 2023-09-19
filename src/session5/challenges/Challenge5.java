package session5.challenges;

//Write a program that generates and prints the first n numbers of the Fibonacci series, where n is provided by the user.

import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        generateFibonacci(number);
        scanner.close();
    }
    public static void generateFibonacci(int number) {
        long[] fibonacci = new long[number];

        fibonacci[0] = 0;
        if (number > 1) {
            fibonacci[1] = 1;
        }
        for (int index = 2; index < number; index++) {
            fibonacci[1] = fibonacci[index - 1] + fibonacci[index - 2];
        }
        for (int index = 0; index < number; index++) {
            System.out.println(fibonacci[index] + " ");
        }
    }
}
