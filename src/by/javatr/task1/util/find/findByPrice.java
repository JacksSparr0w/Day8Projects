package by.javatr.task1.util.find;

import by.javatr.exceptions.InvalidArgumentException;
import by.javatr.task1.util.Book;

public class findByPrice implements FindBy {
    @Override
    public boolean compare(Book book, Object object){
        Double d = (Double) object;
        return d.equals(book.getPrice());
    }
}
