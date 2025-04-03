package Practicas.practica4.ej10;

public class NumberException extends Exception{
    private final static String MESSAGE = "Error for number %s: ";

    public NumberException(String number, String description){
        super(MESSAGE.formatted(number) + description);
    }
}
