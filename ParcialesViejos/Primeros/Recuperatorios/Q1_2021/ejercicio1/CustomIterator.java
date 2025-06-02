package ParcialesViejos.Primeros.Recuperatorios.Q1_2021.ejercicio1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class CustomIterator<T> implements Iterator<T> {
    private T current;
    private UnaryOperator<T> operator;
    private Predicate<T> predicate;
    private boolean hasLimit;

    public CustomIterator(T current, UnaryOperator<T> operator, Predicate<T> predicate) {
        this.current = current;
        this.operator = operator;
        this.predicate = predicate;
        this.hasLimit = true;

    }

    public CustomIterator(T current, UnaryOperator<T> operator) {
        this.current = current;
        this.operator = operator;
        this.hasLimit = false;
    }


    @Override
    public boolean hasNext() {
        if(!hasLimit){
            return true;
        }
        return !predicate.test(current);
    }

    @Override
    public T next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        T toReturn = current;
        current = operator.apply(current);
        return toReturn;
    }
}
