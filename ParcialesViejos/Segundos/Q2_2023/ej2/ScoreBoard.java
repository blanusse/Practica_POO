package ParcialesViejos.Segundos.Q2_2023.ej2;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class ScoreBoard<S extends Comparable<? super S>> extends TreeSet<PlayerScore<S>>{


    public SortedSet<PlayerScore<S>> getTopScores(int size){
        SortedSet<PlayerScore<S>> toReturn =  new TreeSet<>();
        for(PlayerScore<S> player : this){
            if(size <= 0){
                return toReturn;
            }
            size--;
            toReturn.add(player);
        }
        return toReturn;
    }


}
