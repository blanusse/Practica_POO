package Teorica.Iterable;

import java.util.Iterator;

public interface Queue<T> extends Iterable<T>{

    void enqueue(T element);
    T dequeue();
    boolean isEmpty();
}
