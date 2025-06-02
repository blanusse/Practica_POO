package ParcialesViejos.Primeros.Recuperatorios.Q2_2024.ejercicio3;

public class CannotBookException extends RuntimeException{
    private final static String MESSAGE = "Cannot Book";

    public CannotBookException(){

    }
    public String getMessage(){
        return MESSAGE;
    }
}
