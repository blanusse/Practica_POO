package ParcialesViejos.Primeros.Recuperatorios.Q2_2021.ejercicio2;

public class Employee implements  Comparable<Employee>{
    private Charge charge;
    private String name;
    private int age;


    public Employee(String name, int age, Charge charge){
        if(age < 0){
            throw new IllegalArgumentException();
        }
        this.age = age;
        this.charge = charge;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getSalary(int hours){
        return charge.getSalary(hours, age);

    }

    @Override
    public String toString(){
        return "<%s # %d años >".formatted(name, age);
    }

    @Override
    public int compareTo(Employee o){
        int cmp = this.age - o.age;
        if(cmp ==0 ){
            cmp = o.name.compareTo(this.name);
        }
        return cmp;
    }
}
