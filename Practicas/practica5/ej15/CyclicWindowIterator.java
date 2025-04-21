package Practicas.practica5.ej15;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CyclicWindowIterator<T> implements Iterator<T[]> {
    private int limit;
    private T[] collection;
    private T current;
    private int idx;

    public CyclicWindowIterator(T[] collection, int limit) {
        this.collection = collection;
        this.current = collection[0];
        this.limit = limit;
    }


    @Override
    public boolean hasNext() {
        return collection.length != 0;
    }

    @Override
    public T[] next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        T[] toReturn = (T[]) new Object[limit];
        for(int i=0; i<limit; i++){
            toReturn[i] = collection[(idx+i)%collection.length];
        }
        idx++;
        return toReturn;
    };
}
