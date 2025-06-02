package ParcialesViejos.Primeros.Q2_2021.ejercicio2;

import java.util.Comparator;

public class DescendingNameDirectory extends Directory{

    public DescendingNameDirectory(int maxPersons) {
        super(maxPersons);
    }

    @Override
    public Person[] persons(){
        return super.orderCopy(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int cmp = o2.getName().compareTo(o1.getName());
                if(cmp ==0){
                    cmp = o1.getAge()-o2.getAge();
                }
                return cmp;
            }
        });
    }
}
