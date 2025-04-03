package Practicas.Practica2.ej7;

public class Histograma {
    public static void main(String[] args){
        int max = 0;
        int[] vec = new int[10]; //en cada celda habra la cantidad de numeros que hay
        for(String n : args){
            int num = Integer.parseInt(n);
            if(num < 0 || num > 100){
                System.out.println("Numero %d" + num  + "no aceptable");
                return;
            }
            vec[num/10]++;
            if(vec[num/10] > max){
                max = vec[num/10];
            }
        }
        printAll(vec, max);
    }

    private static void printAll(int[] vec, int max){
        for (int i = max; i > 0; i--) {
            System.out.print("| ");
            for (int aFrec : vec) {
                System.out.print(aFrec >= i ? '*' : ' ');
                System.out.print(" | ");
            }
            System.out.println();
        }
        for (int aFrec : vec) {
            System.out.print("+---");
        }
        System.out.print("+\n");
        for (int i = 0; i <= vec.length; i++) {
            System.out.printf("%-4d", i*10);
        }

    }
}
