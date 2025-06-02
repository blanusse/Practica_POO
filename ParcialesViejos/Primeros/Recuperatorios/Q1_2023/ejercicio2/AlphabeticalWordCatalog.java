package ParcialesViejos.Primeros.Recuperatorios.Q1_2023.ejercicio2;

import java.util.Comparator;

public class AlphabeticalWordCatalog extends WordCountCatalog{

    public AlphabeticalWordCatalog(){
        super();
    }

    @Override
    protected Comparator<WordCount> getComparator() {
        return new Comparator<WordCount>() {
            @Override
            public int compare(WordCount o1, WordCount o2) {
                int cmp = o1.getWord().compareTo(o2.getWord());
                if(cmp == 0){
                    cmp = o1.getCount()-o2.getCount();
                }
                return cmp;
            }
        };
    }

}
