package ParcialesViejos.Primeros.Q1_2023.ejercicio2;

import java.time.LocalDate;

public class TVEpisode extends VideoCatalogElement{
    private final int season;

    public TVEpisode(String title, LocalDate airedDate, int season) {
        super(title, airedDate);
        this.season = season;
    }

    @Override
    public String toString(){
        return "%s is a TV Episode of %s".formatted(super.toString(), season);
    }
    //// The Finale aired on 1998-05-14 is a TV Episode of Season 9
}
