package Practicas.Practica6.ej9;

import java.util.Objects;

public class TimeData<T> {
    private T element;
    private int hours;
    private int minutes;

    public TimeData(T element, int hours, int minutes) {
        this.element = element;
        this.hours = hours;
        this.minutes = minutes;
    }


    public T getElement(){
        return this.element;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    @Override
    public boolean equals(Object o){
        return o instanceof TimeData<?> obj && this.element.equals(obj.element);
    }

    @Override
    public int hashCode(){
        return Objects.hash(element);
    }
}
