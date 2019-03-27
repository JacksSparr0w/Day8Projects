package by.javatr.task1.util.find;

import by.javatr.task1.util.Book;

public class FindByName implements FindBy {
    @Override
    public boolean compare(Book book, Object object) {
        String name = (String) object;
        return name.equals(book.getName());
    }
}
