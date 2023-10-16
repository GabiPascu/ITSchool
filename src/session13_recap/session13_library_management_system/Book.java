package session13_recap.session13_library_management_system;

import java.util.UUID;

public class Book extends Library {

    private String title;
    private String author;
    private String publisher;
    private int ISBN; //ISBN = 13 digit unique identifier number for books
    private int numberOfCopies;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book " +
                "title:'" + title + '\'' +
                ", Author='" + author + '\'' +
                ", ISBN=" + ISBN +
                '\'';
    }
}
