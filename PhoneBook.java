import java.util.*;
public class PhoneBook {
    private static HashMap<String, Contact> phoneBook = new HashMap<String, Contact>();
    public static void main(String[] args) {
        
        
    }

    public static void addContact(String name, String phoneNumber, String email){
        Contact contact = new Contact("Kim", "23923", "kasda");
        phoneBook.put(contact.getName(), contact);
    }

}
