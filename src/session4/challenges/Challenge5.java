package session4.challenges;

public class Challenge5 {
    public static void main(String[] args) {

        printEvenNumbersUpTo(10);
    }

    public static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void printEvenNumbersUpTo(int limitValue) {
        for (int index = 0; index <= limitValue; index++) {
            if (index % 2 == 0) {
                System.out.print(index + " ");
            }
        }
    }
}
