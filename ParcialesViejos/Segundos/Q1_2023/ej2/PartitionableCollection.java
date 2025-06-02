package ParcialesViejos.Segundos.Q1_2023.ej2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PartitionableCollection<T> extends ArrayList<T>{

    public PartitionableCollection<T> getSelected(Predicate<T> predicate){
        PartitionableCollection<T> toReturn = new PartitionableCollection<>();
        for(T elem : this){
            if(predicate.test(elem)){
                toReturn.add(elem);
            }
        }
        return toReturn;
    }

    public PartitionableCollection<T> getRejected(Predicate<T> predicate){
        return getSelected(predicate.negate());
    }

}
