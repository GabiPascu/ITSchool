package session8.practice;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 8, 9, 4};
        //     index     0  1  2.......

        sortArray(numbers);
        System.out.println("Printed array" + Arrays.toString(numbers));
        System.out.println("Binary search index value: " +Arrays.binarySearch(numbers, 9));

        String[][] names = {{"Mr", "Ms"}, {"Alice", "John"}};
        print2DArray(names);

        int firstArrayNumber = numbers[0];
        System.out.println(firstArrayNumber);
        printArrayAverage(numbers);
    }

    public static void sortArray(int[] array) {
        Arrays.sort(array);
    }

    public static void printArrayAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        int average = sum / numbers.length;
        System.out.println("The average is" + average);
    }

    public static void print2DArray(String[][] names) {
        for (int index = 0; index < names.length; index++) {
            for (int index2 = 0; index2 < names[index].length; index2++) {
                System.out.print(names[index][index2] + " ");
            }
            System.out.println(" ");
        }
    }
}