package session17_streams.challenges.challenge3;

import java.util.ArrayList;
import java.util.List;

public class ChallengeThree {

    public static void main(String[] args) {
        List<Integer> myList = printUpTo();

        List<Integer> primeNumber = myList.stream()
                .filter(ChallengeThree::checkIfPrime)
                .toList();

        System.out.println(primeNumber);
    }

    public static boolean checkIfPrime(int number) {
        for (int index = 2; index <= number / 2; index++) {
            if (number % index == 0)
                return false;
        }
        return true;
    }

    public static List<Integer> printUpTo() {
        List<Integer> list = new ArrayList<>();
        for (int index = 1; index <= 100; index++) {
            list.add(index);
        }
        return list;
    }
}