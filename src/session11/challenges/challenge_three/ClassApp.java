package session11.challenges.challenge_three;

public class ClassApp {

    public static void main(String[] args) {
       A firstStudent = new A(12,56,65);
       B secondStudent = new B(50, 30, 90, 60);

        System.out.println("Student A Percentage: " + firstStudent.getPercentage() + "%");
        System.out.println("Student B Percentage: " + secondStudent.getPercentage() + "%");



    }
}
