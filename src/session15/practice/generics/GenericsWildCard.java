package session15.practice.generics;

import java.util.Arrays;
import java.util.List;

public class GenericsWildCard {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Alice", "Bob");
        List<Integer> integerList = Arrays.asList(1,2,3);

printClassName(stringList);
printClassName(integerList);
    }

    private static void printClassName (List<?> list) {
        System.out.println(list.get(0).getClass().getSimpleName());
    }
}
