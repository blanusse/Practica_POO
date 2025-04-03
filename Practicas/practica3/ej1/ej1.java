package Practicas.practica3.ej1;

public class ej1 {
    public static void main(String[] args) {
        String s1, s2;
//        String s1 = "hola";
//        String s2 = "hola";
        s1 = new String("hola");
        s2 = new String("hola");
        if (s1.equals(s2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }
    }
}

// la salida es son distintos porque se usa el == en vez del .equals y el == compara los hash code de cada uno
//
//String s1 = "hola";
//String s2 = "hola";

//if (s1.equals(s2))