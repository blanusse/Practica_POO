package Practicas.practica3.ej5;

public class ej5Tester {
    public static void main(String[] args) {
        classA a = new classA();
        a.print(3); //A integer 3 java.lang.Integer
        a.print(3.14); //A number 3.14 java.lang.Double
        a.print((Number) 3); //A number 3 java.lang.Integer
        a.print((Object) 3); //A Object 3 java.lang.Integer
        //esto es porque el getClass va al ultimo nivel del objeto, es decir si es un entero, por mas que se lo
        //castee a Object con getClass te entrega java.lang.integer

        classA b1 = new classB();
        b1.print(3.14); //Clase B number 3.14 java.lang.Double
        b1.print("Hola"); //Clase A Object Hola java.lang.String
        b1.print((Number) 3);//Clase B number 3 java.lang.Integer
        b1.print((Object) 3); //Clase A object 3 java.lang.Integer
        //Solo hay polimorfismo con el metodo print que recibe un Number, con el resto sigue imprimiendo lo de A

        classB b2 = new classB();
        b2.print(3.14);
        b2.print("Hola");
        b2.print((Number) 3);
        b2.print((Object) 3);
        //Imprimen lo mismo que el bloque anterior porque sigue teniendo los mismos metodos
    }
}
