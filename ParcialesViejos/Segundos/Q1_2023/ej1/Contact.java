package ParcialesViejos.Segundos.Q1_2023.ej1;

public class Contact{
    private String name;
    private final String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    @Override
    public String toString() {
        return "| %s has %s as phone number |".formatted(name, phoneNumber);
    }
}