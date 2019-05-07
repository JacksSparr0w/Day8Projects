package by.javatr.task1.util;

import by.javatr.exceptions.*;
import by.javatr.task1.util.find.FindBy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Library implements BookListDao {
    List<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    @Override
    public void addBook(Book b) throws BookAlreadyExistException, InvalidArgumentException {
        if (books.contains(b))
            throw new BookAlreadyExistException("Книга уже есть в библиотеке");
        books.add(new Book(b));
    }

    @Override
    public void removeBook(Book b) throws NoBookException{
        if(!books.contains(b))
            throw new NoBookException("Такой книги не существует");
            books.remove(b);
    }



    @Override
    public void removeBook(List<Book> removeList) throws NoBookException{
        for (Book b : removeList){
            removeBook(b);
        }
    }

    @Override
    public List<Book> findByTag(FindBy findBy, Object object){
        List<Book> buf = new ArrayList<>();
        for (Book b : books) {
            if (findBy.compare(b, object))
                buf.add(b);
        }
        return buf;
    }

    @Override
    public void sortBooksByTag(Comparator<Book> c) {
        books.sort(c);
    }

    @Override
    public List<Book> getBooks() {
        return books.subList(0, books.size());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(books);
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
