package Practicas.Practica2.ej8;

public class Ej8 {
    public static void main(String[] args) {
        Double valores[] = {1.1, 2.2, 3.3};
        for(Double valor : valores) {
            valor *= 2;
            System.out.printf("El valor es %g\n", valor);
        }
        for(Double valor : valores) {
            valor *= 2;
            System.out.printf("El valor es %g\n", valor);
        }
    }
}

//Se imprime dos veces lo mismo porque el valor de "valor" no se guarda y se vuelve a declarar en cero cuando se comienza
// cada for each