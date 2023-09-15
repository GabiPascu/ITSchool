package session5.practice;

public class DoWhileExercises {

    public static void main(String[] args) {
        printNumbers();
        printReverseCounter();
    }

    public static void printNumbers() {
        int number = 1;
        do {
            System.out.println(number);
            number++;
        } while (number <= 10);
    }

    public static void printReverseCounter() {
        int number = 10;
        do {
            System.out.println(number);
            number--;
        } while (number >= 1);
    }
}