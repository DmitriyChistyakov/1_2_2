package Exception;

public class MyArrayDataException extends  RuntimeException{
    public MyArrayDataException(String message) {
        super(message);
    }

    public MyArrayDataException(String message, Throwable cause) {
        super(message, cause);
    }
}
/** Получилось вызвать только один из методов.. не могу понять как вызвать второй */