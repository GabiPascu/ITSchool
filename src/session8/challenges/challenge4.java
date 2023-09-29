package session8.challenges;

public class challenge4 {

    public static void main(String[] args) {
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        printEvenAndOddNumbers(numbers);
    }
    public static void printEvenAndOddNumbers (int[] array) {
        int countEven = 0;
        int countOdd = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Even numbers: " + countEven);
        System.out.println("Odd numbers: " + countOdd);
    }
}
