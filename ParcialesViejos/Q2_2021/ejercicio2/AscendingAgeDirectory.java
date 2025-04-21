package ParcialesViejos.Q2_2021.ejercicio2;

import java.util.Comparator;

public class AscendingAgeDirectory extends Directory{

    public AscendingAgeDirectory(int maxPersons){
        super(maxPersons);
    }

    @Override
    public Person[] persons(){
        return super.orderCopy(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int cmp = o1.getAge() - o2.getAge();
                if(cmp ==0){
                    cmp = o1.getName().compareTo(o2.getName());
                }
                return cmp;
            }
        });
    }
}
