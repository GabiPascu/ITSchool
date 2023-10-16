package session13_recap.session13_library_management_system;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class Library implements AddAndRemove {

    public List<Book> display() {
        List<Book> bookshelf = new LinkedList<>();

        Book d1 = new Book("Silent Patient", "Alex", 12);
        Book d2 = new Book("Harry Potter", "J.K. Rowling", 23);
        Book d3 = new Book("Moby Dick", "Herman Melville", 32);

        bookshelf.add(d1);
        bookshelf.add(d2);
        bookshelf.add(d3);

        return bookshelf;
    }

    public Book searchByTitle(String name, List<Book> bookshelf) {
        for (Book book : bookshelf) {
            if (book.getTitle().equalsIgnoreCase(name)) {
                return book;
            }
        }
        return null;
    }

    public Member searchMembers() {
        Member member = new Member("Mark", UUID.randomUUID());
        return member;
    }

    @Override
    public void add() {
        System.out.println("You have added: " + display());
    }

    @Override
    public void remove() {
        System.out.println("You have removed: " + display());
    }
}
