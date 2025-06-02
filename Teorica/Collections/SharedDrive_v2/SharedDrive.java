package Teorica.Collections.SharedDrive_v2;

import java.util.*;
import java.util.function.Predicate;

public class SharedDrive{
    private final Set<SharedFile> files = new HashSet<>();

    public SharedDrive addFile(String s1, String s2){
        this.files.add(new SharedFile(s1, s2));
        return this;
    }

    public int filesCount(Predicate<? super SharedFile> predicate){
        int count = 0;
        for(SharedFile sharedFile : files){
            if(predicate.test(sharedFile)){
                count++;
            }
        }
        return count;
    }

//    public void renameFile(String file, String area, String newFile){ //ESTA OPCION ESTA BIEN TAMBIEN
//        if(!files.removeIf(new Predicate<SharedFile>() { //si no se pudo eliminar significa que no lo encontro
//            @Override
//            public boolean test(SharedFile sharedFile) {
//                return sharedFile.equals(new SharedFile(file, area));
//            }
//        })){
//            throw new IllegalArgumentException();
//        }
//        files.add(new SharedFile(newFile, area));
//    }

    public void renameFile(String file, String area, String newFile){
        if(!files.remove(new SharedFile(file, area))){
            throw new IllegalArgumentException();
        }
        files.add(new SharedFile(newFile, area));
    }

    public boolean fileExists(String s1, String s2){
        return files.contains(new SharedFile(s1, s2));

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
