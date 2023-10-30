package session17_streams.challenges.challenge_one;

import java.util.Arrays;
import java.util.List;

public class ChallengeOne {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);
        printEvenNumbers(numbers);
    }

    public static void printEvenNumbers(List<Integer> numberList) {
        List<Integer> evenNumbers = numberList.stream()
                .filter(number -> number % 2 == 0)
                .toList();
        System.out.println("My even numbers: " + evenNumbers);
    }
}