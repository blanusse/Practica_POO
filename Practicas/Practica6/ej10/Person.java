package Practicas.Practica6.ej10;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
    private final String name;
    private final int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Person person &&
                name.equals(person.name) &&
                age == person.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString(){
        return "%s # %d".formatted(name, age);
    }


}
