package ParcialesViejos.Primeros.Recuperatorios.Q2_2021.ejercicio2;

import java.util.Arrays;

public class School {
    private Employee[] school;
    private int size;
    private final static int INITIAL_DIM = 10;

    public School(){
        this.school = new Employee[INITIAL_DIM];
        this.size = 0;
    }

    private void resize(){
        if(size % INITIAL_DIM ==0){
            school = Arrays.copyOf(school, INITIAL_DIM+size);
        }
    }

    public void hireEmployee(String name, int age, Charge charge){
        resize();
        school[size++] = new Employee(name, age, charge);
    }

    public Employee[] employees(){
        Employee[] toReturn = Arrays.copyOf(school, size);
        Arrays.sort(toReturn);
        return toReturn;
    }

    public int getSalary(String name, int hours){
        for(int i=0; i<size; i++){
            if(school[i].getName().compareTo(name) == 0){
                return school[i].getSalary(hours);
            }
        }
        throw new RuntimeException("Employee not found");
    }
}
