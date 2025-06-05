package ParcialesViejos.Recuperatorios_2Parcial.REC_2021_1Q.ej1;

import java.util.*;
import java.util.function.Predicate;


public interface SpecialCollection<T extends Comparable<? super T>> extends SortedSet<T>{

    public void deleteFirst();
    public void deleteFirst(Predicate<T> predicate);
    public void undoDeleteFirst();
}
