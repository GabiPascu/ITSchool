package ro.itschool.project.services;

import ro.itschool.project.models.entities.Book;

import java.util.List;

public interface BookService {

    Book createBook(Book book);

    List<Book> getAllBooks();
}