package Practicas.Practica7.ej2;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class SimpleArrayList<T> extends ArrayList<T> implements SimpleList<T> {


    @Override
    public <E> E reduce(E starting, BiFunction<E, T, E> reducer) {
        E toReturn = starting;
        for(T element : this){
            toReturn = reducer.apply(toReturn, element);
        }
        return toReturn;
    }
}
