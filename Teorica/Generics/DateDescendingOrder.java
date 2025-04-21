package Teorica.Generics;

import java.util.Comparator;

public class DateDescendingOrder implements Comparator<Date> {


    @Override
    public int compare(Date o1, Date o2) {
        int cmp = Integer.compare(o1.getYear(), o2.getYear());
        if(cmp == 0){
            cmp = o1.getMonth() - o2.getMonth();
            if(cmp ==0){
                cmp = o1.getDay() - o2.getDay();
            }
        }
        return cmp;
    }
}
