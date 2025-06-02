package ParcialesViejos.Segundos.Q2_2021.ej1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class DateCollection<T extends Comparable<? super T>> extends TreeSet<DateElement<T>> {
    private LocalDate actualDate;



    public DateCollection(LocalDate actualDate) {
        this.changeToday(actualDate);
    }


    @Override
    public boolean add(DateElement<T> obj2){
        if (obj2.getDate().isAfter(actualDate)){
            throw new IllegalArgumentException();
        }
        return super.add(obj2);
    }

    public Iterable<T> getElementsBeforeToday(){
        return getElementsBefore(this.actualDate);
    }

    public void changeToday(LocalDate date){
        this.actualDate = date;
    }

    public Collection<T> getElementsBefore(LocalDate date){
        Collection<T> toReturn = new ArrayList<>();
        for(DateElement<T> obj : this){
            if(date.isAfter(obj.getDate())){
                toReturn.add(obj.getElem());
            }
        }
        return toReturn;
    }
}
