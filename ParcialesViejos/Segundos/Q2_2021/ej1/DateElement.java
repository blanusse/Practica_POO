package ParcialesViejos.Segundos.Q2_2021.ej1;

import java.time.LocalDate;
import java.util.Objects;

public class DateElement<T extends Comparable<? super T>> implements Comparable<DateElement<T>>{
    private final T elem;
    private final LocalDate date;

    public DateElement(T elem, LocalDate date) {
        this.elem = elem;
        this.date = date;
    }

    public T getElem() {
        return elem;
    }

    public LocalDate getDate() {
        return date;
    }



    @Override
    public int compareTo(DateElement<T> o) {
        int cmp = this.date.compareTo(o.date);
        if(cmp == 0){
            cmp = o.elem.compareTo(this.elem);
        }
        return cmp;
    }
}
