package session8_lists.challenges;

import java.util.ArrayList;
import java.util.List;

public class challenge7 {

    public static void main(String[] args) {
        String[] fruitsArr = {"berry", "banana", "strawberries", "pumpkin", "apple"};
        ArrayList<String> fruitsList = new ArrayList<>(List.of(fruitsArr));
        System.out.println("Before sorting: " + fruitsList);
        printSortedArray(fruitsList);
    }

    public static void printSortedArray(ArrayList<String> array) {
        array.sort(String::compareToIgnoreCase);
        array.sort((string1, string2) -> string2.length() - string1.length());
        System.out.println("Sorted array: " + array);
    }
}