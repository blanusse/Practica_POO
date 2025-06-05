package ParcialesViejos.Recuperatorios_2Parcial.REC_2021_1Q.ej2;

import java.util.*;

public class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object o){
        if(o instanceof User other){
            return this.getName().equals(other.getName());
        }
        return false;
    }

    public int hashCode(){
        return Objects.hash(this.name);
    }

}
