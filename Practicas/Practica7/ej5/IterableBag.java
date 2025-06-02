package Practicas.Practica7.ej5;

public interface IterableBag<E extends Comparable<? super E>> extends Bag<E> {

    Iterable<E> elements();
    Iterable<E> elementsDistinct();
}