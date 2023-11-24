package ro.itschool.project.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ro.itschool.project.models.entities.Book;

import java.util.ArrayList;
import java.util.List;

//@Slf4j
@Service
public class BookServiceImpl implements BookService {

    List<Book> bookList = new ArrayList<>();


    @Override
    public Book createBook(Book book) {
        if (!isValid(book)) {
            throw new RuntimeException("Invalid input");
        }

        long bookId = bookList.size() + 1L;
        book.setId(bookId);

        //save the book
        bookList.add(book);
//        log.info("Book with id {} has been created", book.getId());

        return bookList.get((int) bookId - 1);
    }

    @Override
    public List<Book> getAllBooks() {
//        log.info("Retrieved book list.");
        return bookList;
    }

    private boolean isValid(Book book) {

        return !book.getTitle().isEmpty()
                && book.getAuthor().isEmpty()
                && book.getPrice() != null;

    }
}