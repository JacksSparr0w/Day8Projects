package by.javatr.task1.util.comparators;

import by.javatr.task1.util.Book;

import java.util.Comparator;

public class CompareByAuthor implements Comparator<Book> {
    @Override
    public int compare(Book book, Book t1) {
        int rez = book.getAuthor().compareTo(t1.getAuthor());
        return rez;
    }
}
