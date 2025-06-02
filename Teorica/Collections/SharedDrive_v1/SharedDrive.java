package Teorica.Collections.SharedDrive_v1;

import java.util.*;
import java.util.function.Predicate;

public class SharedDrive{
    private final SequencedCollection<SharedFile> list = new ArrayList<>();


    public SharedDrive addFile(String s1, String s2){
        this.list.add(new SharedFile(s1, s2));
        return this;
    }

    public Iterable<SharedFile> getAllFiles(){
        return new ArrayList<>(list); //o puede ser solo return list;
    }

    public SharedFile getLastFile(){
        return list.getLast();
    }

    public SharedFile getFirstFile(Predicate<? super SharedFile> predicate){
        for(SharedFile sharedFile : list){ //itero el list
            if(predicate.test(sharedFile)){
                return sharedFile;
            }
        }
        throw new NoSuchElementException();
    }







    public static class SharedFile {
        private String name;
        private String area;

        public SharedFile(String name, String area) {
            this.name = name;
            this.area = area;
        }
        @Override
        public String toString(){
            return "File %s in work area %s".formatted(name, area);
        }

        public String getFileName() {
            return name;
        }

        public String getFileArea() {
            return area;
        }
    }
}
