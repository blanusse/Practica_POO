package ParcialesViejos.Primeros.PARCIAL_MIO.ejercicio3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TVShow implements Iterable<TVEpisode>{
    private int seasons;
    private int episodesPerSeason;
 
    public TVShow(int seasons, int episodesPerSeason){
   
        setEpisodesPerSeason(episodesPerSeason);
        setSeasons(seasons);
    }
 
//Setean las temporadas y capitulos por temporada de la serie, chequeando los requisitos pedidos
    public void setSeasons(int seasons){
        if(seasons <= 0){
            throw new RuntimeException("La cantidad de temporadas debe ser positiva");
        }
        this.seasons = seasons;
    }
    
    public void setEpisodesPerSeason(int episodesPerSeason){
        if(episodesPerSeason <= 0){
            throw new RuntimeException("La cantidad de episodios debe ser positiva");
        }
        this.episodesPerSeason = episodesPerSeason;
    }
 
 
    @Override
    public Iterator<TVEpisode> iterator(){
        return new Iterator<>(){
//guardo la cantidad de temporadas y capitulos actual para el iterador
            int maxEpisodes = episodesPerSeason; 
            int maxSeasons = seasons;
            int currentEpisode = 1;
            int currentSeason = 1;
            @Override
            public boolean hasNext(){
                return currentSeason <= maxSeasons;
            }
 
            @Override
            public TVEpisode next(){
                if(!hasNext()){
                    throw new NoSuchElementException();
                }
                TVEpisode toReturn = new TVEpisode(currentSeason, currentEpisode++);
                if(currentEpisode > maxEpisodes){ //significa que termino la temporada
                    currentEpisode = 1;
                    currentSeason++;
                }
                return toReturn;
            }
        };
    }
 
    
 
    
 
    
}