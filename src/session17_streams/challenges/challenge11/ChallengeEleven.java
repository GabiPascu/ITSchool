package session17_streams.challenges.challenge11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ChallengeEleven {

    public static void main(String[] args) throws IOException {

//        Path textPath = Path.of("src/session17_streams/challenges/challenge11/text.txt");
//
//        List<String> words = Files.lines(textPath)
//                .flatMap(str -> Arrays.stream(str.split(", ")))
//                .toList();
//
//        String word = words.stream()
//                .flatMap(str -> Arrays.stream(str.split(" ")))
//                .max(Comparator.comparing(String::length))
//                .get();
//
//        System.out.println(words);

        InputStream inputStream = ChallengeEleven.class.getResourceAsStream("/session17_streams/challenges/challenge11/text.txt");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = bufferedReader.readLine();

        String result = null;
        if (line != null) {
            result = Arrays.stream(line.split(","))
                    .max((s1, s2) -> s1.length() - s2.length())
                    .orElse(null);
        }
        System.out.println(result);
    }
}
