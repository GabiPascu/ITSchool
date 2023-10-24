package session15_hascode_and_enums.challenge.challenge_two;

import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setAge(22);
        person1.setName("John");

        Person person2 = new Person();
        person2.setName("John");
        person2.setAge(22);

        Set<Person> personSet = new HashSet<>();
        personSet.add(person1);
        personSet.add(person2);

        System.out.println(personSet.size());
        System.out.println("Person1 hashcode: " + person1.hashCode());
        System.out.println("Person2 hashcode: " + person2.hashCode());
        System.out.println(person1.equals(person2));
    }
}
