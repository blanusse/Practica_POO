package ParcialesViejos.Q1_2022.ejercicio3;

import java.time.LocalDate;

public class Pass3 extends Pass1{
    private LocalDate expireDate;


    public Pass3(Attraction[] validAttractions, String name, LocalDate date, LocalDate expireDate) {
        super(validAttractions, name, date);
        this.expireDate = expireDate;
    }

    @Override
    protected boolean canVisit(Attraction attraction, LocalDate date){
        return super.canVisit(attraction, date) && !date.isAfter(expireDate);

    }
}
