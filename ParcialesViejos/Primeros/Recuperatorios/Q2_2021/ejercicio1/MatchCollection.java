package ParcialesViejos.Primeros.Recuperatorios.Q2_2021.ejercicio1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class MatchCollection<T> implements Iterable<MatchElement<T>>{
    private T[] collection;
    private Predicate<T> predicate;

    public MatchCollection(T[] collection, Predicate<T> predicate) {
        this.collection = collection;
        this.predicate = predicate;
    }

    public MatchCollection(T[] collection){
        this(collection, new Predicate<T>() {
            @Override
            public boolean test(T e) {
                return true;
            }
        });
    }

    public void setCondition(Predicate<T> predicate) {
        this.predicate = predicate;
    }



    @Override
    public Iterator<MatchElement<T>> iterator(){
        return new Iterator<MatchElement<T>>() {
            int current = 0;
            Predicate<T> currentPred = predicate;

            @Override
            public boolean hasNext() {
                return current < collection.length;
            }

            @Override
            public MatchElement<T> next() {
                if(!hasNext()){
                    throw new NoSuchElementException();
                }
                MatchElement<T> toReturn = new MatchElement<>(collection[current]);
                if(currentPred.test(collection[current++])){
                    toReturn.setHasMatch();
                }
                return toReturn;
            }
        };
    }

}
