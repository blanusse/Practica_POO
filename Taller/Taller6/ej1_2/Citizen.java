package Taller.Taller6.ej1_2;

import java.util.Objects;

public class Citizen {
    private int DNI;
    private String name;
    private String lastName;

    public Citizen(int DNI, String name, String lastName) {
        this.DNI = DNI;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o){
        return o instanceof Citizen citizen && this.DNI==citizen.DNI && this.lastName.equals(citizen.lastName) && this.name.equals(citizen.name);

    }

    @Override
    public int hashCode(){
        return Objects.hash(DNI, lastName, name);
    }

    @Override
    public String toString(){
        return "%s %s %d".formatted(name, lastName, DNI);
    }


    public int getDNI() {
        return DNI;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

}
