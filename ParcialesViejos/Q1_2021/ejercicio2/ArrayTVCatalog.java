package ParcialesViejos.Q1_2021.ejercicio2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayTVCatalog implements TVCatalog{
    private TVShow[] catalog;
    private final static int INITIAL_DIM = 10;
    private double minRating, maxRating;
    private int size;


    public ArrayTVCatalog(){
        catalog = new TVShow[INITIAL_DIM];
        this.maxRating = 10;
        this.minRating = 0;
        size = 0;
    }

    private void resize(){
        if(size % INITIAL_DIM == 0){
            catalog = Arrays.copyOf(catalog, size + INITIAL_DIM);
        }
    }

    @Override
    public TVCatalog addTVShow(String name, double rating) {
        resize();
        catalog[size++] = new TVShow(name, rating);
        return this;
    }

    @Override
    public void setRatingRange(double min, double max) {
        this.minRating = min;
        this.maxRating = max;
    }

    @Override
    public Iterator<TVResponse> iterator(){
        return new Iterator<TVResponse>() {
            int current = 0;
            double minRating = ArrayTVCatalog.this.minRating;
            double maxRating = ArrayTVCatalog.this.maxRating;

            @Override
            public boolean hasNext() {
                return current<size;
            }

            @Override
            public TVResponse next() {
                if(!hasNext()){
                    throw new NoSuchElementException();
                }
                TVResponse toReturn = new TVResponse(catalog[current].getName(), catalog[current++].getRating());
                if(toReturn.getRating() < maxRating && toReturn.getRating() > minRating){
                    toReturn.setInRange();
                }
                return toReturn;
            }
        };
    }
}
