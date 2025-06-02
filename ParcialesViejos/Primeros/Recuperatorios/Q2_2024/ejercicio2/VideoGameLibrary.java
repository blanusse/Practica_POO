package ParcialesViejos.Primeros.Recuperatorios.Q2_2024.ejercicio2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class VideoGameLibrary implements Iterable<VideoGame>{
    private VideoGame[] library;
    private int size;
    private final static int INITIAL_DIM = 10;

    public VideoGameLibrary(){
        this.library = new VideoGame[INITIAL_DIM];
        this.size = 0;
    }

    private void resize(){
        if(size % INITIAL_DIM == 0){
            this.library = Arrays.copyOf(library, size+INITIAL_DIM);
        }
    }

    public void addPhysicalGame(String name, int year, String place){
        resize();
        this.library[size++] = new PhysicalGame(name, year, place);
    }

    public void addDigitalGame(String name, int year, double gigas){
        resize();
        this.library[size++] = new DigitalGame(name, year, gigas);
    }

    public VideoGame[] orderLibrary(Comparator<VideoGame> comp){
        VideoGame[] toReturn = Arrays.copyOf(library, size);
        Arrays.sort(toReturn, comp);
        return toReturn;
    }

    public VideoGame[] getAscendingYearCopy(){
        return orderLibrary(new Comparator<VideoGame>(){
            @Override
            public int compare(VideoGame o1, VideoGame o2){
                int cmp = o1.getYear()-o2.getYear();
                if(cmp == 0){
                    cmp = o2.getName().compareTo(o1.getName());
                }
                return cmp;
            }
        });
    }
    public VideoGame[] getDescendingYearCopy(){
        return orderLibrary(new Comparator<VideoGame>(){
            @Override
            public int compare(VideoGame o1, VideoGame o2){
                int cmp = o2.getYear()-o1.getYear();
                if(cmp == 0){
                    cmp = o1.getName().compareTo(o2.getName());
                }
                return cmp;
            }
        });
    }


    @Override
    public Iterator<VideoGame> iterator(){
        return new Iterator<>(){
            int current = 0;

            @Override
            public boolean hasNext(){
                return current <size;
            }

            @Override
            public VideoGame next(){
                return library[current++];
            }


        };
    }
}
