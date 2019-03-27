package by.javatr.task1.util.find;

import by.javatr.exceptions.InvalidArgumentException;
import by.javatr.task1.util.Book;

public interface FindBy {
    public boolean compare(Book book,Object object);
}
