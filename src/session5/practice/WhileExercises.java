package session5.practice;

public class WhileExercises {

    public static void main(String[] args) {
        printNumber();
        printSumUntilLimit(100);
    }

    public static void printNumber() {
        int number = 1;
        while (number <= 10) {
            System.out.println(number);
            number++;
        }
    }

    public static void printSumUntilLimit(int value) {
        int number = 1;
        int sum = 0;
        while (number < 100) {
            sum += number;
            number++;
        }
        System.out.println("Sum: " + sum);
        }
    }

