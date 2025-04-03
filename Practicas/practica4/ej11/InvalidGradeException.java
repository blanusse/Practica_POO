package Practicas.practica4.ej11;

public class InvalidGradeException extends Exception{
    private static final String MESSAGE = "Grado invaido";

    public InvalidGradeException(){
        super(MESSAGE);
    }
}
