package session17_streams.challenges.challenge11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ChallengeEleven {

    public static void main(String[] args) throws IOException {

        Path textPath = Path.of("src/session17_streams/challenges/challenge11/text.txt");

        List<String> words = Files.lines(textPath)
                .flatMap(str -> Arrays.stream(str.split(", ")))
                .toList();

        String word = words.stream()
                .flatMap(str -> Arrays.stream(str.split(" ")))
                .max(Comparator.comparing(String::length))
                .get();

        System.out.println(word);
    }
}
