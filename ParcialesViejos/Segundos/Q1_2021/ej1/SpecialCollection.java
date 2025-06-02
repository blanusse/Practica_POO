package ParcialesViejos.Segundos.Q1_2021.ej1;

import java.util.SequencedSet;
import java.util.function.Predicate;

public interface SpecialCollection<T extends Comparable<? super T>> extends SequencedSet<T> {

    void deleteFirst();
    void deleteFirst(Predicate<T> predicate);
    void undoDeleteFirst();
}
