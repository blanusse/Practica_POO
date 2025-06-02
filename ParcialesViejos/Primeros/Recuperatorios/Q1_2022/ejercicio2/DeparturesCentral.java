package ParcialesViejos.Primeros.Recuperatorios.Q1_2022.ejercicio2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DeparturesCentral implements Iterable<Departure>{
    private Departure[] central;
    private final static int INITIAL_DIM = 10;
    private int size;


    public DeparturesCentral(){
        this.central = new Departure[INITIAL_DIM];
        this.size = 0;
    }

    private void resize(){
        if(size % INITIAL_DIM == 0){
            central = Arrays.copyOf(central, size+ INITIAL_DIM);
        }
    }

    public DeparturesCentral addDeparture(String code, LocalDate date){
        central[size++] = new Departure(code, date);
        return this;
    }

    public Departure getDepartureByIndex(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException();
        }
        return central[index];
    }


    private Departure[] orderCopy(Comparator<Departure> comparator){
        Departure[] toReturn = Arrays.copyOf(central, size);
        Arrays.sort(toReturn, comparator);
        return toReturn;

    }

    public Departure[] departures(){
        return orderCopy(Comparator.naturalOrder());
    }

    public Departure[] departures(Comparator<Departure> comparator){
        return orderCopy(comparator);
    }

    @Override
    public Iterator<Departure> iterator(){
        return new Iterator<Departure>() {
            int current = 0;
            @Override
            public boolean hasNext() {
                return current < size;
            }

            @Override
            public Departure next() {
                if(!hasNext()){
                    throw new NoSuchElementException();
                }
                return central[current++];
            }
        };
    }
}
