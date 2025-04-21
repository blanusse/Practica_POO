package ParcialesViejos.Q1_2021.ejercicio1;

import java.util.Arrays;
import java.util.Comparator;

public class Inventory {
    private Item[] colection;


    public Inventory(Item[] col){
        this.colection = col;
    }

    public Item[] getItems(){
        Item[] toReturn = Arrays.copyOf(colection, colection.length);
        Arrays.sort(toReturn);
        return toReturn;
    }

    public Item[] getItems(Comparator<Item> comparator){
        Item[] toReturn = Arrays.copyOf(colection, colection.length);
        Arrays.sort(toReturn, comparator);
        return toReturn;
    }
}
