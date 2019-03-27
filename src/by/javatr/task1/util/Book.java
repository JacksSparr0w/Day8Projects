package by.javatr.task1.util;

import by.javatr.exceptions.InvalidArgumentException;

import java.util.Objects;

public class Book{
    private String name;
    private String author;
    private double price;
    private Language language;

    public Book(String name, String author)throws InvalidArgumentException {
        //TODO: странные строки
        if (name == null || name.equals(""))
            throw new InvalidArgumentException("Поле ИМЯ пусто");
        if (author == null || author.equals(""))
            throw new InvalidArgumentException("Поле АВТОР пусто");
        
        this.name = name;
        this.author = author;
    }

    public Book(String name, String author, double price) throws InvalidArgumentException{
        this(name, author);
        if (price <= 0)
            throw new InvalidArgumentException("Цена не является положительным числом");
        this.price = price;
    }

    public Book(String name, String author, double price, Language language) throws InvalidArgumentException {
        this(name, author, price);
        this.language = language;
    }

    public Book(Book anotherBook) throws InvalidArgumentException {
        this(anotherBook.getName(), anotherBook.getAuthor(), anotherBook.getPrice(), anotherBook.getLanguage());
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public Language getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", language=" + language +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price &&
                name.equals(book.name) &&
                author.equals(book.author) &&
                language == book.language;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, price, language);
    }

}
