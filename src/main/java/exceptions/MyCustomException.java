package exceptions;

//Checked Exception
public class MyCustomException extends Exception {

    MyCustomException(String message) {
        super(message);
    }
}
