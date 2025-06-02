package Practicas.Practica7.ej2;


import java.util.List;
import java.util.function.BiFunction;

public interface SimpleList<T> extends List<T> {

    public <E> E reduce(E starting, BiFunction<E, T, E> reducer);
}


