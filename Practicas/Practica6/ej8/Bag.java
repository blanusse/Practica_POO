package Practicas.Practica6.ej8;

import java.util.Collection;

public interface Bag<T>{

    public void add(T element);
    public int size();
    public boolean contains(T element);
    public void remove(T element);
    public int sizeDistinct();
    public int count(T element);
}
