package by.javatr.task1.util;

import by.javatr.exceptions.BookAlreadyExistException;
import by.javatr.exceptions.InvalidArgumentException;
import by.javatr.exceptions.NoBookException;

import java.util.Comparator;
import java.util.List;

public interface BookListDao {

    public void addBook(Book book) throws BookAlreadyExistException, InvalidArgumentException;

    public void removeBook(Book book) throws NoBookException;

    public Book findByTag();

    public void sortBooksByTag(Comparator<Book> c);

    public List<Book> getBooks();
}
