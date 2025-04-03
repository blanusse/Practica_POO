package Practicas.practica3.ej2;

public class ej2 {
    public static void main(String args[]) {
        String s = "hola";
        System.out.println(s instanceof String);
        System.out.println(s instanceof Object);
        System.out.println(s.getClass().equals(String.class));
        System.out.println(s.getClass().equals(Object.class));
    }
}


//el instanceof compara un objeto con un tipo de objeto y devuelve un boolean.

//en cambio, el getClass devuelve el wrapper del objeto, y un string tiene como wrapper "java.lang.String", en cambio un Objeto tiene
// como wrapper "java.lang.Object"

//class java.lang.String
//class java.lang.Object