package session14.practice;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {
        Set<String> mySet = initializeSet();
        displaySetElements(mySet);
    }

    private static void displaySetElements(Set<String> setInput) {
        for (String input : setInput) {
            System.out.println(input);
        }
    }
    private static Set<String> initializeSet() {
        Set<String> mySet = new HashSet<>();
        mySet.add("apple");
        mySet.add("orange");
        mySet.add("apple");

        return mySet;
    }
}