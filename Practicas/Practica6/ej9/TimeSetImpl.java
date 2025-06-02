package Practicas.Practica6.ej9;

import java.sql.Time;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

public class TimeSetImpl<T> implements TimeSet<T>{
    private final Set<TimeData<T>> set = new TreeSet<>((o1, o2) -> {
        int cmp = o1.getHours() - o2.getHours();
        if (cmp == 0) {
            cmp = o1.getMinutes()-o2.getMinutes();
        }
        return cmp;
    });

    @Override
    public void add(T elem, int hours, int minutes) {
        TimeData<T> toAdd = new TimeData<>(elem, hours, minutes);
        set.remove(toAdd);
        set.add(toAdd);
    }

    @Override
    public void remove(T elem) {
//        for (TimeData<T> data : set){
//            if(data.getElement().equals(elem)){
//                set.remove(data);
//            }
//        }
        set.removeIf(new Predicate<TimeData<T>>() {
            @Override
            public boolean test(TimeData<T> tTimeData) {
                return tTimeData.getElement().equals(elem);
            }
        });
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean contains(T elem) {
        for(TimeData<T> data : set){
            if(data.getElement().equals(elem)){
                return true;
            }
        }
        return false;
    }

    private boolean checkTime(int hour, int minute){
        return hour<24 && hour>=0 && minute>=0 && minute<60;
    }

    private boolean isInInterval(int hoursFrom, int minutesFrom, int hoursTo, int minutesTo, TimeData<T> data){
        return data.getHours()>=hoursFrom && data.getMinutes()>=minutesFrom && data.getHours()<=hoursTo && data.getMinutes()<=minutesTo;
    }

    @Override
    public Set<T> retrieve(int hoursFrom, int minutesFrom, int hoursTo, int minutesTo) {
        if(hoursFrom > hoursTo || (hoursFrom == hoursTo && minutesFrom > minutesTo) || !checkTime(hoursFrom, minutesFrom) || !checkTime(hoursTo, minutesTo)){
            throw new IllegalArgumentException();
        }
        Set<T> toReturn = new HashSet<>();
        for(TimeData<T> data : set){
            if(isInInterval(hoursFrom, minutesFrom, hoursTo, minutesTo, data)){
                toReturn.add(data.getElement());
            }
        }
        return toReturn;
    }
}
