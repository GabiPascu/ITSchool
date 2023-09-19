package session5.challenges;

import java.util.Scanner;
//WIP
//Write a program that asks the user to enter numbers. The program should continue prompting the user until they enter -1. After they enter -1, print the sum of all numbers entered (excluding -1).
public class Challenge6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        positiveNumber(number);
        while (number > -1) {
            System.out.println("Please enter another number: ");
        }
    }

    public static void positiveNumber(int number) {
        int sum = 0;
if (number == -1) {
    System.out.println(sum += number);
}

    }
}





