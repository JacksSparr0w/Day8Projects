package by.javatr.exceptions;

public class NoBookException extends Exception {
    public NoBookException(){

    }

    public NoBookException(String message, Throwable exception) {
        super(message, exception);
    }

    public NoBookException(String message) {
        super(message);
    }

    public NoBookException(Throwable exception) {
        super(exception);
    }
}
