package session7.practice;

public class Classroom {

    public static void main(String[] args) {
        Student studentJohn = new Student();
        studentJohn.name = "John";
        studentJohn.age = 21;
        studentJohn.displayDetails();

        Student studentAlice = new Student();
        studentAlice.name = "Alice";
        studentAlice.age = 20;
        studentAlice.displayDetails();

        String name = "Bill";
        name = name.toLowerCase();
        System.out.println(name);
    }
}
