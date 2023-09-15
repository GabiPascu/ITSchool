package session5.practice;

public class ForExercises {

    public static void main(String[] args) {
        printEvenNumbers(20);
        printFactorialOfNumber(3);

        int[] intArray = {2, 3, 7, 43, 67};
        printArrayMaxValue(intArray);

        String[] myArray = {"Apple", "Cherry", "Plum"};
        printArray(myArray);

        printSearchedValue(intArray, 7);

        int[][] secondArray = {{1, 2, 3}, {6, 9, 43}, {8, 1, 10}};
        print2DArray(secondArray);
    }

    public static void printEvenNumbers(int number) {
        for (int index = 0; index < number; index += 2) {
            System.out.println(index);
        }
    }

    public static void printFactorialOfNumber(int number) {
        if (number < 0) {
            System.out.println("Please enter a positive number");
            return;
        }
        System.out.println("We are here!");
        int factorial = 1;
        for (int index = 1; index <= number; index++) {
            factorial *= index;
        }
        System.out.println("Factorial: " + factorial);
    }

    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.println(element);
        }
    }

    public static void printArrayMaxValue(int[] array) {
        int maxValue = 0;
        for (int number : array) {
            if (number > maxValue) {
                maxValue = number;
            }
        }
        System.out.println("Max value: " + maxValue);
    }

    public static void printSearchedValue(int[] array, int value) {
        for (int number : array) {
            if (number == value) {
                System.out.println("Number found: " + value);
                break;
            }
        }
    }

    public static void print2DArray(int[][] array) {
        for (int rowIndex = 0; rowIndex < array.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < array[0].length; columnIndex++) {
                System.out.print(array[rowIndex][columnIndex] + " ");
            }
            System.out.println(" ");
        }
    }
}
