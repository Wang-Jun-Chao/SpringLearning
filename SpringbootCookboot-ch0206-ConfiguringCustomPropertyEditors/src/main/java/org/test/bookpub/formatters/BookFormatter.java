package org.test.bookpub.formatters;

import org.springframework.format.Formatter;
import org.test.bookpub.entity.Book;
import org.test.bookpub.repository.BookRepository;

import java.text.ParseException;
import java.util.Locale;

/**
 * Mostly because of its statefulness and lack of thread safety, since version 3, Spring has
 * added a Formatter interface as a replacement for PropertyEditor. The Formatters are
 * intended to provide a similar functionality but in a completely thread-safe manner and
 * focusing on a very specific task of parsing a String in an object type and converting an
 * object to its String representation.
 */
public class BookFormatter implements Formatter<Book> {
    private BookRepository repository;

    public BookFormatter(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book parse(String bookIdentifier, Locale locale) throws ParseException {
        Book book = repository.findBookByIsbn(bookIdentifier);
        return book != null ? book : repository.findOne(Long.valueOf(bookIdentifier));
    }

    @Override
    public String print(Book book, Locale locale) {
        return book.getIsbn();
    }
}
