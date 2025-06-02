package Teorica.Collections.SharedDrive_v3;

import java.util.*;

public class SharedDrive {
    private final SequencedSet<SharedFile> collection = new TreeSet<>(new Comparator<>() {
        @Override
        public int compare(SharedFile o1, SharedFile o2) {
            int cmp = o1.name.compareTo(o2.name);
            if(cmp == 0){
                cmp = o1.area.compareTo(o2.area);
            }
            return cmp;
        }
    });

    public SharedDrive addFile(String name, String area){
        collection.add(new SharedFile(name, area));
        return this;
    }

    public Iterable<SharedFile> getAllFiles(){
        return collection;
    }

    public Iterable<SharedFile> getAllFilesReversed(){
        return collection.reversed();
    }



    public static class SharedFile {
        private final String name;
        private final String area;

        public SharedFile(String name, String area) {
            this.name = name;
            this.area = area;
        }
        @Override
        public String toString(){
            return "File %s in work area %s".formatted(name, area);
        }

        @Override
        public boolean equals(Object o){
            return o instanceof SharedFile file && file.area.equals(this.area) && file.name.equals(this.name);
        }

        @Override
        public int hashCode(){
            return Objects.hash(area, name);
        }
    }
}
