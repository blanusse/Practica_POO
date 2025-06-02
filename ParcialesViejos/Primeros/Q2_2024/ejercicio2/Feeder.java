package ParcialesViejos.Primeros.Q2_2024.ejercicio2;

import java.util.Arrays;
import java.util.Comparator;

public class Feeder {
    private final static int INITIAL_DIM = 10;
    private Article[] colection;
    private int size;


    public Feeder(){
        this.colection = new Article[INITIAL_DIM];
        this.size = 0;
    }


    public Article firstUnread(FeedType type){
        for(int i=0; i<size; i++){
            if(!colection[i].status){
                if(type == null || colection[i].type.equals(type)){
                    return colection[i];
                }
            }
        }
        throw new IllegalArgumentException();
    }


    public Article firstUnread(){
        return firstUnread(null);
    }



    public Article addArticle(FeedType type, String title){
        if(size == colection.length){
            colection = Arrays.copyOf(colection, INITIAL_DIM+size);
        }
        Article toRet = new Article(type, title);
        colection[size++] = toRet;
        return toRet;

    }


    public Article[] getArticlesCopy(){
        return getArticlesCopy(Comparator.naturalOrder());
    }

    public Article[] getReversedArticlesCopy(){
        return getArticlesCopy(Comparator.reverseOrder());
    }


    private Article[] getArticlesCopy(Comparator<Article> comp){
        Article[] toRet = Arrays.copyOf(colection, size);
        Arrays.sort(toRet, comp);
        return toRet;
    }


}


