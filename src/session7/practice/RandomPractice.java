package session7.practice;


import java.util.*;

public class RandomPractice {

    public static void main(String[] args) {
        Random random = new Random();

        for (int index = 1; index <= 10; index++) {
            int randomInt = random.nextInt(1, 100);
         //   System.out.println("Random number " + index + ": " + randomInt);
         //   System.out.println("UUID " + index + ": " + UUID.randomUUID());

        }

        String[] fruits = {"apple", "banana", "cherry"};

        for (int index = 0; index < 3 ; index++) {
            String randomFruit = fruits[random.nextInt(fruits.length)];
            System.out.println(randomFruit);
        }

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Collections.shuffle(numbers, random);
        System.out.println(numbers);
    }
}
