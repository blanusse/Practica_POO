package ParcialesViejos.Primeros.Q1_2024.ejercicio2;

public class InvalidPaymentPlanException extends Exception{
    private final static String message = "Invalid payment plan";

    public String getMessage(){
        return message;
    }
}
