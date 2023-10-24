package session15_hascode_and_enums.challenge.challenge_three;

public class Test {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setAge(22);
        student1.setName("Doe");
        student1.setEmail("random@email.com");

        Student student2 = new Student();
        student2.setAge(22);
        student2.setName("Doe");
        student2.setEmail("random@email.com");

        System.out.println("Student1 hashcode: " + student1.hashCode());
        System.out.println("Student2 hashcode: " + student2.hashCode());

        System.out.println(student1.equals(student2));
    }
}
