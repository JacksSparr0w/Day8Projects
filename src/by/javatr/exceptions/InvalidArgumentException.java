package by.javatr.exceptions;

public class InvalidArgumentException extends Exception {

    public InvalidArgumentException(){

    }

    public InvalidArgumentException(String message, Throwable exception) {
        super(message, exception);
    }

    public InvalidArgumentException(String message) {
        super(message);
    }

    public InvalidArgumentException(Throwable exception) {
        super(exception);
    }

}
