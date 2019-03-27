package by.javatr.task1.util;

import by.javatr.exceptions.BookAlreadyExistException;
import by.javatr.exceptions.InvalidArgumentException;
import by.javatr.exceptions.NoBookException;
import by.javatr.task1.util.find.FindBy;

import java.util.Comparator;
import java.util.List;

public interface BookListDao {

    public void addBook(Book book) throws BookAlreadyExistException, InvalidArgumentException;

    public void removeBook(Book book) throws NoBookException;

    public void removeBook(List<Book> books) throws NoBookException;

    public List<Book> findByTag(FindBy findBy, Object object);

    public void sortBooksByTag(Comparator<Book> c);

    public List<Book> getBooks();
}
