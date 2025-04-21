package Practicas.practica5.ej3.Part1;

public interface LinearList<T> {
    void add(T obj);
    Object get(int i);
    void set(int i, T obj);
    void remove(int i);
    int indexOf(T obj);
    int size();
}
