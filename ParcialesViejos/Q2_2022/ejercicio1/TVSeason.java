package ParcialesViejos.Q2_2022.ejercicio1;

import java.util.Arrays;
import java.util.Comparator;

public class TVSeason{
    private TVEpisode[] season;

    public TVSeason(TVEpisode[] season){
        this.season = season;
    }

    private TVEpisode[] orderSeason(Comparator<TVEpisode> cmp){
        TVEpisode[] toRet = this.season;
        Arrays.sort(toRet, cmp);
        return toRet;
    }

    public TVEpisode[] getDateOrderCopy(){
        return orderSeason(new Comparator<TVEpisode>() {
            @Override
            public int compare(TVEpisode o1, TVEpisode o2) {
                int cmp = o2.getAiredDate().compareTo(o1.getAiredDate());
                if(cmp == 0){
                    cmp = Integer.compare(o1.getId(), o2.getId());
                }
                return cmp;
            }
        });
    }

    public TVEpisode[] getNameOrderCopy(){
        return orderSeason(new Comparator<TVEpisode>() {
            @Override
            public int compare(TVEpisode o1, TVEpisode o2) {
                int cmp = o1.getTitle().compareTo(o2.getTitle());
                if(cmp == 0){
                    cmp = Integer.compare(o1.getId(), o2.getId());
                }
                return cmp;
            }
        });
    }

    public TVEpisode[] getRatingOrderCopy(){
        return orderSeason(new Comparator<TVEpisode>() {
            @Override
            public int compare(TVEpisode o1, TVEpisode o2) {
                int cmp = Double.compare(o2.getRating(), (o1.getRating()));
                if(cmp == 0){
                    cmp = Integer.compare(o1.getId(), o2.getId());
                }
                return cmp;
            }
        });
    }






}
