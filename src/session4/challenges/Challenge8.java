package session4.challenges;

public class Challenge8 {
    public static void main(String[] args) {

        int factorialNumber = 1;
        int number = 5;

        for (int i = 1; i <= number; i++) {
            factorialNumber = factorialNumber * i;
        }
        System.out.println("The factorial number for " + number + " is " + factorialNumber);
    }
}