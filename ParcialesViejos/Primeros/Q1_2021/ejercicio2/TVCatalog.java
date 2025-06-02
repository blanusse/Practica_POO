package ParcialesViejos.Primeros.Q1_2021.ejercicio2;

public interface TVCatalog extends Iterable<TVResponse>{

   TVCatalog addTVShow(String name, double rating);

   void setRatingRange(double min, double max);

}
