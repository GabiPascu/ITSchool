package session13_recap.session13_library_management_system;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Library library = new Library();
//        System.out.println(library.display());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the book's name: ");
        String response = scanner.nextLine();

        Book book = new Book("Percy Jackson", "Rick", 43);
        System.out.println(library.searchByTitle(response, library.getBooks(book)));

//        Book book = new Book("Percy Jackson", "Rick", 43);
//        System.out.println(library.display());

//        library.addBook(new Book("Percy Jackson", "Rick", 43));
        System.out.println(library.getBooks(book));

    }
}

