package session7.practice;

public class MathPractice {

    public static void main(String[] args) {
        double firstNumber = 2.4;
        double secondNumber = 5.7;

        double maxNumber = Math.max(firstNumber, secondNumber);
        System.out.println("The maximum number is: " + maxNumber);
        System.out.println("The maximum number rounded: " + Math.round(maxNumber));

        double x1 = 2.5, y1 = 3.6;
        double x2 = 5.1, y2 = 6.2;

        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("The distance between the two points is: " + distance);
    }
}
