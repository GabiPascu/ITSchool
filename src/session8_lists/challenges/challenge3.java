package session8_lists.challenges;

import java.util.ArrayList;

public class challenge3 {

    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduateStudentList = new ArrayList<>();

       for (int index = 0; index <= 10; index++){
           studentList.add(index, "Student" + index);
       }
        System.out.println("List of students: " + studentList);
       graduateStudentList.addAll(studentList);
        System.out.println("\n\n");
        System.out.println("Students that graduated: " + graduateStudentList);
    }
}