package ParcialesViejos.Primeros.Recuperatorios.Q1_2023.ejercicio2;

import java.util.Comparator;

public class DescendingCountCatalog extends WordCountCatalog{

    public DescendingCountCatalog(){
        super();
    }

    @Override
    protected Comparator<WordCount> getComparator() {
        return new Comparator<WordCount>() {
            @Override
            public int compare(WordCount o1, WordCount o2) {
                int cmp = o2.getCount()-o1.getCount();
                if(cmp == 0){
                    cmp = o2.getWord().compareTo(o1.getWord());
                }
                return cmp;
            }
        };
    }

}

