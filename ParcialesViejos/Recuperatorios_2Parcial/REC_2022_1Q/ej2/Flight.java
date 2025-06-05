package ParcialesViejos.Recuperatorios_2Parcial.REC_2022_1Q.ej2;

public class Flight implements Comparable<Flight>{
    private final String code;
    private final int stops;
    private final String airline;
    private final SeatCategory category;

    public Flight(String code, int stops, String airline, SeatCategory category) {
        this.code = code;
        this.airline = airline;
        this.stops = stops;
        this.category = category;
    }

    public String toString(){
        return "%s | %d | %s | %s".formatted(code, stops, airline, category);
    }

    @Override
    public int compareTo(Flight o) {
        int cmp = this.stops-o.stops;
        if(cmp ==0){
            cmp = this.code.compareTo(o.code);
        }
        return cmp;
    }

    public String getCode() {
        return code;
    }

    public SeatCategory getCategory() {
        return category;
    }

    public int getStops() {
        return stops;
    }

    public String getAirline() {
        return airline;
    }
}
