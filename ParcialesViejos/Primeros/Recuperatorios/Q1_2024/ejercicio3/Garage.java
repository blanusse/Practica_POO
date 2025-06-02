package ParcialesViejos.Primeros.Recuperatorios.Q1_2024.ejercicio3;

import java.util.Arrays;
import java.util.Comparator;

public abstract class Garage{
    private Stay[] garage;
    private static final int INITIAL_DIM = 10;
    private int size;

    public Garage(){
        this.garage = new Stay[INITIAL_DIM];
        this.size = 0;
    }

    private void resize(){
        if(size % INITIAL_DIM == 0){
            this.garage = Arrays.copyOf(garage, size+INITIAL_DIM);
        }
    }

    public Garage addStay(String plate, int days){
        resize();
        garage[size++] = new Stay(plate, days);
        return this;
    }


    protected Stay[] orderGarage(Comparator<Stay> comp){
        Stay[] toReturn = Arrays.copyOf(garage, size);
        Arrays.sort(toReturn, comp);
        return toReturn;
    }

    public abstract Stay[] getStaysCopy();




}
