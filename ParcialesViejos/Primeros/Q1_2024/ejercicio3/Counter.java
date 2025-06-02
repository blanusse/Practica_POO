package ParcialesViejos.Primeros.Q1_2024.ejercicio3;

public class Counter implements Comparable<Counter> {
    private boolean idle;
    private String company;
    private int number;

    public Counter(String company, int number){
        this.company = company;
        this.idle = true;
        this.number = number;
    }

    public void checkIn(){
        this.idle = false;
    }

    public boolean isCheckIn(){
        return !idle;
    }

    public String getAirline(){
        return company;
    }




    @Override
    public String toString(){
        return "Counter %d for %s is %s".formatted(number, company, idle ? "idle" : "checking in");
    }

    @Override
    public int compareTo(Counter o) {
        int cmp = this.company.compareTo(o.company);
        if(cmp == 0){
            cmp = this.number - o.number;
        }
        return cmp;
    }
}
