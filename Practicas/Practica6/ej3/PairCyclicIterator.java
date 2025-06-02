package Practicas.Practica6.ej3;




import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class PairCyclicIterator<T> implements Iterator<Pair<T>> {
    private final Iterable<T> collection;
    private Iterator<T> iterator;

    public PairCyclicIterator(Collection<T> collection) {
        this.collection = collection;
        this.iterator = collection.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.collection.iterator().hasNext();
    }

    @Override
    public Pair<T> next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        T left, right;
        if(!iterator.hasNext()){
            iterator = collection.iterator();
        }
        left = iterator.next();
        if(!iterator.hasNext()){
            iterator = collection.iterator();
        }
        right = iterator.next();
        return new Pair<>(left, right);
    }
}
