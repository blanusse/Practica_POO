package Practicas.Practica1.ej1;


public class Gear {
    private int chainring;
    private double cog;


    public Gear(int a, double b){
        chainring = a;
        cog = b;
    }
    public double getRatio(){
        return chainring/cog;
    }
}
