package ParcialesViejos.Primeros.Q1_2023.ejercicio2;


import java.time.LocalDate;

public class VideoCatalogElement implements Comparable<VideoCatalogElement> {
    private final String title;
    private final LocalDate airedDate;

    public VideoCatalogElement(String title, LocalDate airedDate){
        this.title = title;
        this.airedDate = airedDate;
    }

    @Override
    public int compareTo(VideoCatalogElement o) {
        int cmp = o.airedDate.compareTo(this.airedDate);
        if(cmp == 0){
            cmp = this.title.compareTo(o.title);
        }
        return cmp;
    }

    @Override
    public String toString(){
        return "%s aired on %s".formatted(title, airedDate);
    }
}
