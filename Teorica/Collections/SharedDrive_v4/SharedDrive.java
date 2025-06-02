package Teorica.Collections.SharedDrive_v4;

import java.util.*;

public class SharedDrive {
    private final SequencedMap<String, SequencedSet<SharedFile>> map = new TreeMap<>();


    public SharedDrive addFile(String name, String area){
        //si no esta el area la agrega
        map.putIfAbsent(area, new TreeSet<>((o1, o2) -> o1.name.compareTo(o2.name)));
        //el get devuelve el SequencedSet, y dsp se hace el add sobre eso
        map.get(area).add(new SharedFile(name, area)); //agrega en el area el nuevo file
        return this;
    }

    public Collection<SharedFile> getWorkAreaFiles(String area){
        return map.getOrDefault(area, new TreeSet<>());
    }

    public SequencedSet<String> getWorkAreas(){
        return map.sequencedKeySet().reversed();
    }

    public int filesCount(String area){
        return map.get(area).size();
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
