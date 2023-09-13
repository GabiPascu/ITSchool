package session4.practice;

public class StringMemoryReference {

    public static void main(String[] args) {
        String greeting = new String("Hello");
        String greetingOne = "hello";
        String greetingTwo = "Hello";

        System.out.println(greetingOne == greetingTwo);
        System.out.println(greetingOne.equalsIgnoreCase(greetingTwo)); //ignores if its upper or lower case

        System.out.println(greeting == greetingOne); // compares the variables entirely
        System.out.println(greeting.equals(greetingOne)); //compares only the content

        int number1 = 10;
        double number2 = 10.0;
        System.out.println(number1 == number2);
    }
}
