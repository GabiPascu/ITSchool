package session13_recap.session13_library_management_system;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Library library = new Library();
       System.out.println(library.display());

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the book's name: ");
//        String response = scanner.nextLine();
//        System.out.println(library.searchByTitle(response,library.display()));

        library.add();
    }
}

