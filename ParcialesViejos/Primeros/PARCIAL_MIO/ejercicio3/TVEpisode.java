package ParcialesViejos.Primeros.PARCIAL_MIO.ejercicio3;

public class TVEpisode{
    private int season;
    private int episode;
 
    public TVEpisode(int season, int episode){
      this.season = season;
      this.episode = episode;
    }
 
 
  @Override
  public String toString(){
      return "[S%dE%d]".formatted(season, episode);
  }
 
 
}