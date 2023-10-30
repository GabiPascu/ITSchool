package session17_streams.challenges.challenge_six;

import java.util.ArrayList;
import java.util.List;

public class ChallengeSix {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        int sum = integerList.stream()
                .reduce((element, nextElement) -> element + nextElement)
                .get();

        System.out.println(sum);


    }
}
