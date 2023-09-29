package session9.practice.Book_Management_System;

public class BookManagementSystem {

    public static void main(String[] args) {
        Author alice = new Author("Alice");
        Book book = new Book("Journey to Wonderland", alice);

        System.out.println("Book title: " + book.getTitle());
        System.out.println("Book author: " + book.getAuthorName());
    }
}
