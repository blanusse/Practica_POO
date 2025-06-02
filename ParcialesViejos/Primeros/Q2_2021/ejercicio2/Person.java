package ParcialesViejos.Primeros.Q2_2021.ejercicio2;

public class Person {
    private final String name;
    private final int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "Person Name=%s, Age=%d".formatted(name, age);
    }
}