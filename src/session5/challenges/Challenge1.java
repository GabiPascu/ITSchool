package session5.challenges;

import java.util.Scanner;

public class Challenge1 {

   // 1. Even or Odd Checker
   // Write a Java program that takes an integer as input. If the number is even, print "Even". If it's odd, print "Odd".

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("You have an even number.");
        }else {
            System.out.println("You have an odd number.");
        }
    }
}
