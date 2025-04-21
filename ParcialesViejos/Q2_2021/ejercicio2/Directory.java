package ParcialesViejos.Q2_2021.ejercicio2;

import java.util.Arrays;
import java.util.Comparator;

public class Directory{
    private Person[] directory;
    private final int maxPersons;
    private int size;

    public Directory(int maxPersons){
        this.maxPersons = maxPersons;
        directory = new Person[maxPersons];
        this.size = 0;

    }

    public boolean canAdd(){
        return size < maxPersons;
    }

    public Directory addPerson(Person person) throws ReachedLimitException {
        if(!canAdd()){
            throw new ReachedLimitException(maxPersons);
        }
        directory[size++] = person;
        return this;
    }

    protected Person[] orderCopy(Comparator<Person> comp){
        Person[] toReturn = Arrays.copyOf(directory, size);
        Arrays.sort(toReturn, comp);
        return toReturn;



    }

    public Person[] persons(){
        return orderCopy(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int cmp = o1.getName().compareTo(o2.getName());
                if(cmp ==0){
                    cmp = o2.getAge()-o1.getAge();
                }
                return cmp;
            }
        });
    }

}
