package ParcialesViejos.Primeros.Recuperatorios.Q1_2024.ejercicio2;

public class InvalidPurchaseException extends RuntimeException{

    public InvalidPurchaseException(){

    }

    public String getMessage(){
        return "Invalid Purchase";
    }
}
