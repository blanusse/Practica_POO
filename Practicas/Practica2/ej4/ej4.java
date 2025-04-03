package Practicas.Practica2.ej4;

public class ej4 {
    public static void main(String[] args) {
        Integer valor1 = Integer.valueOf(args[0]);
        Integer valor2 = Integer.valueOf(args[1]);
        Integer suma = valor1 + valor2;
//        System.out.println(suma.toString());
        System.out.println(suma);
    }
}

//Value of es un metodo de clase de la clase Integer, sirve para devolver como int un string de un numero

//toString es un metodo de instancia que sirve para crear un string a partir de un numero dado

//Si hubiese sido lo mismo porque al invocarlo sin el toString, dentro de la clase print se usa el metodo que
//recibe como parametro un objeto y dentro de eso usa el toString

