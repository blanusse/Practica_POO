package ParcialesViejos.Segundos.Q1_2023.ej1;

public class AddressBookGroup implements Comparable<AddressBookGroup>{
    private final String name;

    public AddressBookGroup(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(AddressBookGroup o) {
        return this.name.compareTo(o.name);
    }
}