package ParcialesViejos.Primeros.Q1_2023.ejercicio2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class VideoCatalog {
    private VideoCatalogElement[] catalog;
    private int size;
    private final static int INITIAL_DIM = 10;

    public VideoCatalog(){
        catalog = new VideoCatalogElement[INITIAL_DIM];
        size = 0;
    }

    private void resize(VideoCatalogElement[] catalog){
        if(size % INITIAL_DIM == 0){
            catalog = Arrays.copyOf(catalog, size+INITIAL_DIM);
        }
    }

    public VideoCatalog add(String title, LocalDate date, int season){
        resize(catalog);
        catalog[size++] = new TVEpisode(title, date, season);
        return this;
    }

    public VideoCatalog add(String title, LocalDate date, String studio){
        resize(catalog);
        catalog[size++] = new Movie(title, date, studio);
        return this;
    }


    private VideoCatalogElement[] getCustomCopy(Comparator<VideoCatalogElement> cmp) {
        VideoCatalogElement[] copy = Arrays.copyOf(catalog, size);
//        Arrays.sort(copy, cmp);
        return copy;

    }
    public VideoCatalogElement[] getDescendingDateCopy() {
        return getCustomCopy(Comparator.naturalOrder());
    }
    public VideoCatalogElement[] getChronologicalDateCopy() {
        return getCustomCopy(Comparator.reverseOrder());
    }
}
