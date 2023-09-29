package session8.challenges;

import java.util.LinkedList;

public class challenge6 {

    public static void main(String[] args) {
        LinkedList<String> studentList = new LinkedList<>();
        studentList.add("Mirel");
        studentList.add("Dorel");
        studentList.add("Gigel");

        if (studentList.contains("Gigel")) {
            studentList.remove("Gigel");
        }
        System.out.println(studentList);
    }
}
