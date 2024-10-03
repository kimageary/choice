import java.util.*;
public class PhoneBook {
    private static HashMap<Integer, Contact> phoneBook = new HashMap<Integer, Contact>();
    private static int ID = 0;
    public static void main(String[] args) {
        
        addContact("Hayden", "123455", "kasdjk@mail.comll");
        addContact("Kim", "524324", "fsseas@mail.comll");
        addContact("Maddy", "432424", "ageaa@mail.comll");
        addContact("Aurora", "63242", "garfsa@mail.comll");
        
        System.out.println(phoneBook);
    }

    public static void addContact(String name, String phoneNumber, String email){
        Contact contact = new Contact(name, phoneNumber, email);
        phoneBook.put(ID, contact);
        ID++;g
    }

}
