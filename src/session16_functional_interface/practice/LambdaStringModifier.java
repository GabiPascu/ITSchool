package session16_functional_interface.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LambdaStringModifier {

    public static void main(String[] args) {
        Function<String, Integer> stringLengthFinder = string -> string.length();
        System.out.println("String length: " + stringLengthFinder.apply("Happy Friday"));

        List<String> myList = Arrays.asList("Bob", "Alice", "Taylor");
        myList.stream()
                .filter(name -> name.startsWith("B"))
                .forEach(System.out::println);
    }
}
