package ParcialesViejos.Primeros.Recuperatorios.Q1_2021.ejercicio2;

public class NoBillsException extends RuntimeException{


    @Override
    public String getMessage() {
        return "No bills";
    }
}
