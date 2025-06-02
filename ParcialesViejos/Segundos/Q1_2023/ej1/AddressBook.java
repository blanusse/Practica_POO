package ParcialesViejos.Segundos.Q1_2023.ej1;


import java.util.*;

public class AddressBook {
    private final SortedMap<AddressBookGroup, SortedMap<String, Contact>> book = new TreeMap<>();

    public void addContact(AddressBookGroup group, String name, String number){
        book.putIfAbsent(group, new TreeMap<>());
        book.get(group).putIfAbsent(name, new Contact(name, number));
    }

    public Contact getContact(AddressBookGroup group, String name){
        if(!book.containsKey(group) || !book.get(group).containsKey(name)){
            throw new IllegalArgumentException();
        }
        return book.get(group).get(name);
    }

    public Collection<Contact> getAllContacts(AddressBookGroup group){
        if(!book.containsKey(group)){
            return new ArrayList<>();
        }
        return book.get(group).values();
    }

    public Collection<Contact> getAllContacts(){
        Collection<Contact> toReturn = new ArrayList<>();
        for(SortedMap<String, Contact> contact : book.values()){
            toReturn.addAll(contact.values());
        }
        return toReturn;
    }

    public void renameContact(AddressBookGroup group, String oldName, String newName){
        if(!book.containsKey(group) || !book.get(group).containsKey(oldName)){
            throw new IllegalArgumentException();
        }
        Contact contact = book.get(group).get(oldName);
        contact.setName(newName);
        book.get(group).remove(oldName);
        book.get(group).put(newName,contact);
    }
}
