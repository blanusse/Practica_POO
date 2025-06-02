package ParcialesViejos.Primeros.Q2_2021.ejercicio1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class MatchIterator<T> implements Iterator<MatchElement<T>> {
    private T[] colection;
    private Predicate<T> pred;
    private int currentIndex;

    public MatchIterator(T[] colection, Predicate<T> pred){
        this.colection = colection;
        this.pred = pred;
        this.currentIndex = 0;
    }


    @Override
    public boolean hasNext(){
        return currentIndex < colection.length;
    }

    @Override
    public MatchElement<T> next(){
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        MatchElement<T> toReturn = new MatchElement<>(colection[currentIndex++]);
        if(pred.test(toReturn.getElement())){
            toReturn.match();
        }
        return toReturn;
    }


}
