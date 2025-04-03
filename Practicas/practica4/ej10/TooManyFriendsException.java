package Practicas.practica4.ej10;

public class TooManyFriendsException extends NumberException{

    private static final String MESSAGE = "Too many friends";

    public TooManyFriendsException(String number){
        super(number, MESSAGE);
    }
}
