package session17_streams.challenges.challenge_nine;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ChallengeNine {

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Hello World", "Hello Everyone", "Welcome to the World of Java");

        List<String> string = sentences.stream()
                .flatMap(word -> Arrays.stream(word.split(" ")))
                .toList();

        System.out.println(string);

        Map.Entry<String, Long> mostFrequentWord = string.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get();

        System.out.println(mostFrequentWord);
    }
}
