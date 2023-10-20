package session15.practice;

import java.util.HashSet;
import java.util.Set;

public class EqualsAndHashcodePractice {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setFirstName("Alice");
        employee1.setLastName("Bond");

        Employee employee2 = new Employee();
        employee2.setId(1);
        employee2.setFirstName("Alice");
        employee2.setLastName("Bond");

        System.out.println("employee1 equals employee2: " + employee1.equals(employee2));
        System.out.println("employee1 hashcode" + employee1.hashCode());
        System.out.println("employee2 hashcode" + employee2.hashCode());

        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(employee1);
        employeeSet.add(employee2);

        System.out.println("Set size: " + employeeSet.size());

        System.out.println("employee1: " + employee1);
    }
}