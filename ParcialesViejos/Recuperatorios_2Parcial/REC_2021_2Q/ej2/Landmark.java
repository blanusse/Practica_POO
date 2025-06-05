package ParcialesViejos.Recuperatorios_2Parcial.REC_2021_2Q.ej2;

public class Landmark implements Comparable<Landmark>{
    private final String name;
    private final double rating;


    public Landmark(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    @Override
    public int compareTo(Landmark o) {
        int cmp = Double.compare(o.rating,this.rating);
        if(cmp == 0){
            cmp = this.name.compareTo(o.name);
        }
        return cmp;
    }

    public String toString(){
        return "# %s # %.1f #".formatted(name, rating);
    }
}
