package session3.practice;

public class BinaryArithmeticOperators {
    public static void main(String[] args) {
        int number1 = 10, number2 = 20;

        System.out.println("Arithmetic operations with int:");
        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 * number2);
        System.out.println(number2 / number1);
        System.out.println(number1 % number2);

        double double1 = 10.5;
        double double2 = 4.5;
        System.out.println("Arithmetic operations with double:");
        System.out.println(double1 + double2);
        System.out.println(double1 - double2);
        System.out.println(double1 * double2);
        System.out.println(double2 / double1);
        System.out.println(double1 % double2);

        short myByte1 = 3;
        short myByte2 = 5;

        //short result = myByte1 * myByte2; --> this leads to compile errors due to numeric promotion

    }
}
