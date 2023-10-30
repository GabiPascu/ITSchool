package session17_streams.challenges.challenge_two;

import java.util.Arrays;
import java.util.List;

public class ChallengeTwo {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        longestStringFinder(strings);
    }

    public static void longestStringFinder(List<String> list) {
        String string = list.stream()
                .max((string1, string2) ->Integer.compare(string1.length(), string2.length()))
                .orElse("Invalid input");
        System.out.println(string);
    }
}