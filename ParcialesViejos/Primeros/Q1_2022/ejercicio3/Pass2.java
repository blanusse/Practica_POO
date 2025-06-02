package ParcialesViejos.Primeros.Q1_2022.ejercicio3;

import java.time.LocalDate;

public class Pass2 extends Pass1{
    private final int maxVisits;

    public Pass2(Attraction[] validAttractions, String name, LocalDate date, int maxVisits) {
        super(validAttractions, name, date);
        this.maxVisits = maxVisits;
    }

    @Override
    protected boolean canVisit(Attraction atraction, LocalDate date){
        return super.canVisit(atraction, date) && this.getVisits() < maxVisits;
    }
}
