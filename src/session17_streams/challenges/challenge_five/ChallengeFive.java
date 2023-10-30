package session17_streams.challenges.challenge_five;

import java.util.Arrays;
import java.util.List;

public class ChallengeFive {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Alice", "Johnson", 20), new Person("Bob", "Smith", 17));

        List<Person> drinkingAge = people.stream()
                .filter(person -> person.getAge() > 18)
                .toList();

        System.out.println(drinkingAge);
    }

}
