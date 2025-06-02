package ParcialesViejos.Primeros.Recuperatorios.Q1_2023.ejercicio2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class WordCountCatalog implements Iterable<WordCount>{
    private WordCount[] catalog;
    private int size;
    private static final int INITIAL_DIM = 10;

    public WordCountCatalog(){
        this.catalog = new WordCount[INITIAL_DIM];
        this.size = 0;
    }


    public WordCount getByIndex(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException();
        }
        return catalog[index++];
    }

    private void resize(){
        if(size % INITIAL_DIM ==0){
            catalog = Arrays.copyOf(catalog, size + INITIAL_DIM);
        }
    }


    public WordCountCatalog add(WordCount newWord){
        resize();
        catalog[size++] = newWord;
        return this;
    }

    protected abstract Comparator<WordCount> getComparator();

    protected  WordCount[] orderColection(Comparator<WordCount> comparator){
        WordCount[] toReturn = Arrays.copyOf(catalog, size);
        Arrays.sort(toReturn, comparator);
        return toReturn;
    }

    @Override
    public Iterator<WordCount> iterator() {
        return new Iterator<>() {
            WordCount[] currentCatalog = orderColection(getComparator());
            int current = 0;
            @Override
            public boolean hasNext() {
                return current<size;
            }

            @Override
            public WordCount next() {
                if(!hasNext()){
                    throw new NoSuchElementException();
                }
                return currentCatalog[current++];
            }
        };
    }
}
