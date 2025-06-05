package ParcialesViejos.Recuperatorios_2Parcial.REC_2022_1Q.ej2;

import java.util.Comparator;

public class AirlineFlightSearch extends AbstractSearch{
    private String airline;


    public AirlineFlightSearch(String airport, String airline) {
        super(new Comparator<Flight>(){
            @Override
            public int compare(Flight o1, Flight o2) {
                return o1.getCode().compareTo(o2.getCode());
            }
        }, airport);
        this.airline = airline;
    }


    @Override
    public void addSearchResult(String code, int stops, String airline, SeatCategory category) {
        if(this.airline.equals(airline)){
            super.addSearchResult(code, stops, airline, category);
        }
    }
}
