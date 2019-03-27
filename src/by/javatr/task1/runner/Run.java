package by.javatr.task1.runner;

import by.javatr.exceptions.BookAlreadyExistException;
import by.javatr.exceptions.InvalidArgumentException;
import by.javatr.exceptions.NoBookException;
import by.javatr.task1.util.Book;
import by.javatr.task1.util.BookListDao;
import by.javatr.task1.util.Language;
import by.javatr.task1.util.Library;
import by.javatr.task1.util.comparators.CompareByPrice;
import by.javatr.task1.util.find.FindByAuthor;
import by.javatr.task1.util.find.FindByLanguage;

import java.util.List;

public class Run {
    public static void main(String[] arg){
        BookListDao library = new Library();
        try{
            library.addBook(new Book("name1", "author1", 12.1, Language.ENGLISH));
            library.addBook(new Book("name1", "author2", 12, Language.FRENCH));
            library.addBook(new Book("name2", "author3", 12.6, Language.ENGLISH));
            library.addBook(new Book("name3", "author3", 12.6, Language.ITALIAN));
            library.addBook(new Book("name4", "author2", 12.1, Language.ENGLISH));
            library.addBook(new Book("name4", "author2", 12.1, Language.ENGLISH));
            library.addBook(new Book("", "author2", 12.1, Language.ENGLISH));           //invalid
            library.addBook(new Book("name4", "", 12.1, Language.ENGLISH));             //invalid
            library.addBook(new Book("name4", "author2", -12.1, Language.ENGLISH));     //invalid
            library.addBook(new Book("name4", "author2", 0, Language.ENGLISH));         //invalid
            library.addBook(new Book("qwe", "qwe", 100.6, Language.ITALIAN));

        }
        catch (InvalidArgumentException | BookAlreadyExistException e){
            System.err.println("Ошибка добавления: " + e);
        }

        print(library.getBooks(), "All");


        library.sortBooksByTag(new CompareByPrice());

        print(library.getBooks(), "Sort by price");

        print(library.findByTag(new FindByLanguage(), Language.FRENCH), "find FRENCH");
        try{
            library.removeBook(library.findByTag(new FindByAuthor(), "author3"));
            print(library.getBooks(), "remove author3");
        }
        catch (NoBookException e){
            System.err.println(e);
        }


    }

    public static void print(List<Book> list, String description){
        System.out.println(description);

        for (Book b : list)
            System.out.println(b);
    }
}
