package by.javatr.task1.util;

import by.javatr.exceptions.*;
    import by.javatr.task1.util.find.FindBy;

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
            if(!books.contains(b))
                throw new NoBookException("Такой книги не существует");
            books.remove(b);
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
}
