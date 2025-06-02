package Practicas.Practica7.ej5;

import java.util.*;

public class IterableBagImpl<E extends Comparable<? super E>> extends BagImpl<E> implements IterableBag<E>{

    public IterableBagImpl(){
        this.bag = new TreeMap<>(Comparator.reverseOrder());
    }


    @Override
    public Iterable<E> elements() {
        List<E> toReturn = new ArrayList<>();
        for(Map.Entry<E, Integer> entry : bag.entrySet()){
            toReturn.add(entry.getKey());
        }
        return toReturn;
    }

    @Override
    public Iterable<E> elementsDistinct() {
        return bag.keySet();
    }
}
