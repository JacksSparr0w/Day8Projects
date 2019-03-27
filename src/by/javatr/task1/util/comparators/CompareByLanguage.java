package by.javatr.task1.util.comparators;

import by.javatr.task1.util.Book;

import java.util.Comparator;

public class CompareByLanguage implements Comparator<Book> {
    @Override
    public int compare(Book book, Book t1) {
        int rez = book.getLanguage().compareTo(t1.getLanguage());
        return rez;
    }
}
