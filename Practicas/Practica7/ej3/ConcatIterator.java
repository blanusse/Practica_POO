package Practicas.Practica7.ej3;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class ConcatIterator<T> implements Iterator<T> {

    private Iterator<T> currentIt;
    private final Iterator<T> nextIt;

    public ConcatIterator(Iterator<T> currentIt, Iterator<T> nextIt) {
        this.currentIt = currentIt;
        this.nextIt = nextIt;
    }


    @Override
    public boolean hasNext() {
        if(!currentIt.hasNext() && currentIt != nextIt){
            currentIt = nextIt;
        }
        return currentIt.hasNext();
    }

    @Override
    public T next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        return currentIt.next();
    }
}
