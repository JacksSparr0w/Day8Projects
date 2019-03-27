package by.javatr.task1.util;

import by.javatr.exceptions.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library implements BookListDao {
    List<Book> books;

    public Library(){
        books = new ArrayList<Book>();
    }

    @Override
    public void addBook(Book b) throws BookAlreadyExistException, InvalidArgumentException {
        if (books.contains(b))
            throw new BookAlreadyExistException();
        books.add(new Book(b));
    }

    @Override
    public void removeBook(Book b) throws NoBookException{
        if(!books.contains(b))
            throw new NoBookException();
            books.remove(b);
    }

    @Override
    public Book findByTag() {
        return null;
    }

    @Override
    public void sortBooksByTag(Comparator<Book> c) {
        books.sort(c);
    }

    @Override
    public List<Book> getBooks() {
        return books.subList(0, books.size());
    }
}
