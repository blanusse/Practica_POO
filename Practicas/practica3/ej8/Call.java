package Practicas.practica3.ej8;

public class Call {

    private String from, to;
    private int duration;

    private static final double COST_PER_SECOND = 0.01;

    Call(String from, String to, int duration) {
        this.from = from;
        this.to = to;
        this.duration = duration;
    }

    public String getFrom(){
        return this.from;
    }
    public String getTo(){
        return this.to;
    }

    public double getCost() {
        return duration * COST_PER_SECOND;
    }

}
