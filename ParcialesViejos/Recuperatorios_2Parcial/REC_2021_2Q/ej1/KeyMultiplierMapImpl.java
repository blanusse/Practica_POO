package ParcialesViejos.Recuperatorios_2Parcial.REC_2021_2Q.ej1;

import java.util.*;
import java.util.function.Function;


public class KeyMultiplierMapImpl<T> extends TreeMap<Integer, T> implements KeyMultiplierMap<T>  {
    public KeyMultiplierMapImpl() {
        super(Comparator.reverseOrder());
    }

    @Override
    public List<T> convert(Function<? super T, T> function) {
        List<T> toReturn = new ArrayList<>();
        for(Map.Entry<Integer, T> entry : this.entrySet()){
            for(int i=0; i<entry.getKey(); i++){
                toReturn.add(function.apply(entry.getValue()));
            }
        }
        return toReturn;
    }
}
