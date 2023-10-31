package session17_streams.challenges.challenge_ten;

import java.util.Arrays;
import java.util.List;

public class ChallengeTen {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");

        int numberOfIntegers = strings.stream()
                .flatMap(string -> Arrays.stream(string.split(" ")))
                .map(String::length)
                        .reduce(0, Integer::sum);

        System.out.println(numberOfIntegers);
    }
}