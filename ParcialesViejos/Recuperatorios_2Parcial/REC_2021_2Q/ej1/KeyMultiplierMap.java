package ParcialesViejos.Recuperatorios_2Parcial.REC_2021_2Q.ej1;

import java.util.*;
import java.util.function.Function;


public interface KeyMultiplierMap<T> extends SortedMap<Integer, T>{

    public List<T> convert(Function<? super T, T> function);



}
