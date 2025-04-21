package ParcialesViejos.Q1_2022.ejercicio3;

import java.time.LocalDate;
import java.util.Objects;

public class Attraction{
    private String attractionName;

    public Attraction(String attractionName) {
        this.attractionName = attractionName;
    }

    public String getAttractionName() {
        return attractionName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Attraction attraction))
            return false;
        return attractionName.equals(attraction.attractionName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(attractionName);
    }

    @Override
    public String toString(){
        return "%s".formatted(attractionName);
    }
}
