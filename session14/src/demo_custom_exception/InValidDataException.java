package demo_custom_exception;

public class InValidDataException extends Exception {
    public InValidDataException(String message) {
        super(message);
    }
}
