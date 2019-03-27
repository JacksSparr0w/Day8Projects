package by.javatr.task1.util.find;

import by.javatr.exceptions.InvalidArgumentException;
import by.javatr.task1.util.Book;

public class FindByAuthor implements FindBy {
    @Override
    public boolean compare(Book book, Object object){
        String author = (String) object;
        return book.getAuthor().equals(author);

    }
}
