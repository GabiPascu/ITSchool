package session14.practice;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {
        List<Integer> myList = initializeList();
        System.out.println(myList);

        List<Integer> updateList = getupdateList(myList, 1, 10);
        System.out.println(updateList);

        List<Integer> evenNumbers = getEvenNumbersList(myList);
        System.out.println(evenNumbers);

        int maxValue = findMaximum(myList);
        System.out.println(String.format("Max value is: %d", maxValue));
    }

    private static Integer findMaximum(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("Invalid list");
            return null;
        }

        int maxValue = list.get(0);
        for (int number : list) {
            if (number > maxValue) {
                maxValue = number;

            }
        }
        return maxValue;
    }
    public static List<Integer> initializeList() {
        List<Integer> list = new ArrayList<>();

        for (int index = 0; index < 10; index++) {
            list.add(index);
        }
        return list;
    }

    public static List<Integer> getupdateList(List<Integer> list, int index, int value) {
        if (index >= list.size() || index < 0) {
            System.out.println("Invalid index");
            return list;
        }


        List<Integer> result = new ArrayList<>(list);
        list.set(index, value);
        return list;
    }

    public static List<Integer> getEvenNumbersList(List<Integer> list) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : list) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}