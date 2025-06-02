package ParcialesViejos.Segundos.Q1_2022.ej1;

import java.util.Map;
import java.util.SequencedMap;
import java.util.function.Predicate;

public interface MysteryCollection<T> extends Map<Integer, T> {

    boolean contains(T element);

    void add(T element);

    Map<T, Integer> toBag();

    Map<T, Integer> toBag(Predicate<T> predicate);
}
