package by.javatr.task1.util.comparators;

import by.javatr.task1.util.Book;

import java.util.Comparator;

public class CompareByPrice implements Comparator<Book> {
    @Override
    public int compare(Book book, Book t1) {
        int rez = Double.compare(book.getPrice(), t1.getPrice());
        return rez;
    }
}
