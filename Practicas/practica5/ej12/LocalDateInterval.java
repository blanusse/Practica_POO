package Practicas.practica5.ej12;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LocalDateInterval implements Iterable<LocalDate> {
    private LocalDate start;
    private LocalDate end;
    private int gap;


    public LocalDateInterval(LocalDate start, LocalDate end, int gap) {
        this.end = end;
        this.start = start;
        this.gap = gap;
    }




    @Override
    public Iterator<LocalDate> iterator() {
        return new Iterator<>() {
            LocalDate endDate = end;
            LocalDate current = start;

            @Override
            public boolean hasNext() {
                return (endDate.isAfter(current) || endDate.equals(current));
            }

            @Override
            public LocalDate next() {
                if(!hasNext()){
                    throw new NoSuchElementException();
                }
                LocalDate toRet = current;
                current = current.plusDays(gap);
                return toRet;
            }
        };
    }

}
