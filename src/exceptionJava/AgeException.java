package exceptionJava;

public class AgeException extends Exception {
    AgeException(String message){
        // pass message to parent class
        super(message);
    }
}
