package session4.challenges;

import java.util.ArrayList;

public class Challenge10 {
    public static void main(String[] args) {
        ArrayList<Integer> listOne = new ArrayList<>();
        ArrayList<Integer> listTwo = new ArrayList<>(listOne);

        listOne.add(1);
        listOne.add(2);
        listOne.add(3);

        listOne.add(5);

        System.out.println("listOne: " + listOne);
        System.out.println("listTwo: " + listTwo);

    }
}
