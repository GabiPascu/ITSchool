package session17_streams.challenges.challenge8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChallengeEight {

    public static void main(String[] args) {
        String sentence = "Hello world";
        List<String> vowels = new ArrayList<>(List.of("a", "e", "i", "o", "u"));

        int vowelsCounter = (int) Arrays.stream(sentence.split(""))
                .filter(vowels::contains)
                .count();

        System.out.println(vowelsCounter);
    }
}
