package ParcialesViejos.Q1_2021.ejercicio2;

public class TVResponse extends TVShow{
    private boolean inRange;

    public TVResponse(String name, double rating) {
        super(name, rating);
        this.inRange = false;
    }

    public void setInRange(){
        this.inRange = true;
    }

    public boolean isInRange(){
        return inRange;
    }

    @Override
    public String toString(){
        return "%s : %.2f ### %s".formatted(this.getName(), this.getRating(), inRange ? "In range" : "Out of Range");
    }
}
