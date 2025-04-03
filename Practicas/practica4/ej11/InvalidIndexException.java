package Practicas.practica4.ej11;

public class InvalidIndexException extends Exception{
    private static final String MESSAGE = "Indice invalido";

    public InvalidIndexException(){
        super(MESSAGE);
    }
}
