package by.javatr.task1.util.find;

import by.javatr.task1.util.Book;
import by.javatr.task1.util.Language;

public class FindByLanguage implements FindBy {
    @Override
    public boolean compare(Book book, Object object) {
        Language language = (Language) object;
        return language == book.getLanguage();
    }
}
