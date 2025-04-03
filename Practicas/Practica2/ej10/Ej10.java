package Practicas.Practica2.ej10;

public class Ej10 {
    public static void main(String[] args) {
        Integer[][] matriz = new Integer[2][2]; //crea matriz de 2x2
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;
        //setea los valores de cada celda
        for(Integer[] fila : matriz) { // itera las filas
            for(Integer columna : fila) { //itera las columnas
                System.out.print(columna);
            }
            fila[1] = fila[0] + 3;
            System.out.println();
        }
        for(Integer[] fila : matriz) {
            for(Integer columna : fila) {
                System.out.print(columna);
            }
            System.out.println();
        }
    }
}
//Devuelve :
//12
//34
//14
//36

//