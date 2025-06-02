package ParcialesViejos.Primeros.Recuperatorios.Q2_2022.ejercicio2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomOrderedIteration <T> implements Iterable<T>{
    private T[] collection;
    private T lastElem;

    public CustomOrderedIteration(T[] collection, Comparator<T> comparator, T lastElem) {
        this.collection = Arrays.copyOf(collection, collection.length);
        Arrays.sort(this.collection, comparator);
        setStopElement(lastElem);
    }

    public void setStopElement(T lastElem){
        this.lastElem = lastElem;
    }


    @Override
    public Iterator<T> iterator(){
        return new Iterator<T>(){
            int current = 0;
            private final T currentStop = lastElem;

            @Override
            public boolean hasNext(){
                return current < collection.length && !(collection[current].equals(currentStop));
            }

            @Override
            public T next(){
                if(!hasNext()){
                    throw new NoSuchElementException();
                }
                return collection[current++];
            }
        };
    }


}
