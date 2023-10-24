package session16_functional_interface.practice;

import java.util.ArrayList;
import java.util.List;

public class LambdaPractice {

    public static void main(String[] args) {
        IntSum getSum = (a, b) -> a + b;
        IntMultiply getMultiply = (a, b) -> a * b;

        System.out.println("getSum: " + getSum.sum(10, 30));
        System.out.println("getMultiply" + getMultiply.multiply(2,5));

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");

        //print names elements with lambda
        names.forEach(name -> System.out.println(name));

        //print names elements with for
        for (String name : names) {
            System.out.println(name);
        }
    }
}