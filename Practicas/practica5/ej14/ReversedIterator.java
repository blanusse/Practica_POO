package Practicas.practica5.ej14;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReversedIterator<T> implements Iterator<T> {
    private T[] vec;
    private int current;


    public ReversedIterator(T[] vec) {
        this.vec = vec;
        current = vec.length-1;
    }

    @Override
    public boolean hasNext() {
        return current >= 0;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return vec[current--];
    }
}


