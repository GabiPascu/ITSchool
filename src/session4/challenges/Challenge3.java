package session4.challenges;

public class Challenge3 {
    public static void main(String[] args) {
        int age = 17;
        {
            if (age >= 18) {
                System.out.println("I am an adult");
            } else if (age < 18) {
                System.out.println("I am not an adult");
            }
        }
    }
}