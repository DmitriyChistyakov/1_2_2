package Exception;
/** изменение*/

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException(String message) {
        super(message);
    }

    public MyArraySizeException(String message, Throwable cause) { //пока не понял как его применить и что передать
        super(message, cause);
    }
}
