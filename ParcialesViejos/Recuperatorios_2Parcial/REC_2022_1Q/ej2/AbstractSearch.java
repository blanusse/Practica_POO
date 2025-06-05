package ParcialesViejos.Recuperatorios_2Parcial.REC_2022_1Q.ej2;

import java.util.*;

public abstract class AbstractSearch {
    private  final SortedSet<Flight> set;
    private final String airport;

    public AbstractSearch(Comparator<Flight> comparator, String airport) {
        this.set = new TreeSet<>(comparator);
        this.airport = airport;
    }

    public void addSearchResult(String code, int stops, String airline, SeatCategory category){
        set.add(new Flight(code, stops, airline, category));
    }

    public Iterator<String> resultsIterator(){
        return new Iterator<>(){
            Iterator<Flight> flightIt = set.iterator();

            @Override
            public boolean hasNext() {
                return flightIt.hasNext();
            }

            @Override
            public String next() {
                return flightIt.next().toString();
            }
        };
    }

    public String toString(){
        return "Flight Search from %s with %d results".formatted(airport, set.size());
    }

}
