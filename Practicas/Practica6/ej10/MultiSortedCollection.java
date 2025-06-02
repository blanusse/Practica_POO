package Practicas.Practica6.ej10;

import java.util.Comparator;
public interface MultiSortedCollection<T> {

    void add(Comparator<T> comp);


    void add(T elem);

    void remove(T elem);

    Iterable<T> iterable(Comparator<T> comp);
}