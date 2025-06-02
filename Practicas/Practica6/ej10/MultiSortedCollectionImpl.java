package Practicas.Practica6.ej10;

import java.util.*;

public class MultiSortedCollectionImpl<T> implements MultiSortedCollection<T> {

    private final Map<Comparator<T>, Set<T>> collection = new HashMap<>();

    @Override
    public void add(Comparator<T> comp) {
        collection.put(comp, new TreeSet<>(comp));
    }

    @Override
    public void add(T elem) {
        for(Set<T> set : collection.values()){
            set.add(elem);
        }
    }

    @Override
    public void remove(T elem) {
        for(Set<T> set : collection.values()){
            set.remove(elem);
        }
    }

    @Override
    public Iterable<T> iterable(Comparator<T> comp) {

        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return collection.get(comp).iterator();
            }
        };
    }

}
