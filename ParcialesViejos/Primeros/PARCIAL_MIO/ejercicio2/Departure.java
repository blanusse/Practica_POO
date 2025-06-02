package ParcialesViejos.Primeros.PARCIAL_MIO.ejercicio2;

import java.time.LocalTime;
import java.util.Objects;

public class Departure implements Comparable<Departure>{
    private String destination;
    private int platform;
    private LocalTime time;
    private boolean hasDeparture;
 
//Constructor de partida que recibe tiempo, destino y plataforma
    public Departure(LocalTime time, String destination, int platform){
        this.destination = destination;
        this.platform = platform;
        this.time = time;
        this.hasDeparture = false;
    }
 
    protected void setDeparture(){
        this.hasDeparture = true;
    }
 
   @Override
     public int compareTo(Departure o){
        int cmp = o.getPlatform() - this.getPlatform();
            if(cmp == 0){
                  cmp = this.getDate().compareTo(o.getDate());
                  if(cmp ==0){
                      cmp = this.getDestination().compareTo(o.getDestination());
                  }
            }
            return cmp;
    }
 
    @Override
    public boolean equals(Object o){
        return o instanceof Departure other && this.destination.equals(other.destination) && this.platform == other.platform && this.time.equals(other.time);
    }
 
    @Override
    public int hashCode(){
        return Objects.hash(destination, platform, time);
    }
 
    @Override
    public String toString(){
      return "%s | %s | P0%d | %s".formatted(time, destination, platform, hasDeparture ? "DEPARTED" : "ON TIME");
    }
    
 
    //Getters
    protected int getPlatform(){
        return this.platform;    
    }
    protected String getDestination(){
        return this.destination;    
    }
    protected LocalTime getDate(){
        return this.time;
    }
}