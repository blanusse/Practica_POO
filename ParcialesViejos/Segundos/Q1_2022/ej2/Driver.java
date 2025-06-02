package ParcialesViejos.Segundos.Q1_2022.ej2;

import java.time.LocalDate;
import java.util.SortedMap;
import java.util.TreeMap;

public class Driver {
    private final SortedMap<LocalDate, Infraction> infractionsByDate = new TreeMap<>();
    private int points;

    public Driver(int points) {
        this.points = points;
    }

    public void takePoints(int points) {
        this.points -= points;
    }

    public int getPoints() {
        return points;
    }

    public SortedMap<LocalDate, Infraction> getInfractionsByDate() {
        return infractionsByDate;
    }
}
