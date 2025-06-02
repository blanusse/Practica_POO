package Practicas.Practica7.ej1;

import java.util.List;
import java.util.function.Predicate;

public interface FilterList<T> extends List<T> {


    public List<T> filter(Predicate<T> criteria);
}
