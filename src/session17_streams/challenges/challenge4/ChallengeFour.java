package session17_streams.challenges.challenge4;

import java.util.Arrays;
import java.util.List;

public class ChallengeFour {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three", "four");

    String string = strings.stream()
            .reduce((accumulator, value) -> accumulator + ", " + value)
            .get();

        System.out.println(string);
    }
}