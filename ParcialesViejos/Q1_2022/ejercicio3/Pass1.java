package ParcialesViejos.Q1_2022.ejercicio3;

import java.time.LocalDate;

public class Pass1 implements CityPass{

    private final String name;
    private final LocalDate emissionDate;
    private final Attraction[] validAttractions;
    private int visits;

    public Pass1(Attraction[] validAttractions, String name, LocalDate date) {
        this.name = name;
        this.emissionDate = date;
        this.validAttractions = validAttractions;
        this.visits = 0;
    }

    public int getVisits(){
        return visits;
    }

    protected boolean canVisit(Attraction atraction, LocalDate date){
        return belongsIn(atraction) && !date.isBefore(emissionDate);
    }

    @Override
    public void visit(Attraction attraction, LocalDate date) throws CannotVisitAttractionException {
        if(!canVisit(attraction, date)){
            throw new CannotVisitAttractionException(attraction.getAttractionName());
        }
        System.out.printf("%s visited %s%n".formatted(name, attraction));
        visits++;
    }

    @Override
    public Attraction[] getAttractions() {
        return validAttractions;
    }


    @Override
    public String toString(){
        return "CityPass for %s used for %d atractions".formatted(name, visits);
    }
}
