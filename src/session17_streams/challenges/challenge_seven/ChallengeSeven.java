package session17_streams.challenges.challenge_seven;

import java.util.Arrays;
import java.util.List;

public class ChallengeSeven {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "World", "Java", "Streams");

        List<Integer> list = strings.stream()
                .map(String::length)
                .toList();

        System.out.println(list);
    }
}
