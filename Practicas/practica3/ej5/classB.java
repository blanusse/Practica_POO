package Practicas.practica3.ej5;

public class classB extends classA {
    public void print(Number num) {
        System.out.println(MESSAGE.formatted("B", "Number",num,num.getClass()));
    }
}