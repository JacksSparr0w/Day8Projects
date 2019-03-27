package by.javatr.exceptions;

public class BookAlreadyExistException extends Exception{

    public BookAlreadyExistException(){

    }

    public BookAlreadyExistException(String message, Throwable exception) {
        super(message, exception);
    }

    public BookAlreadyExistException(String message) {
        super(message);
    }

    public BookAlreadyExistException(Throwable exception) {
        super(exception);
    }

}
