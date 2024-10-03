public class Contact {
    String name;
    String phoneNumber;
    String email;

    public Contact(String name, String phoneNumber, String email){
        this.name= name;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }

    public String getName(){
        return name;
    }
    public String getphoneNumber(){
        return phoneNumber;
    }
    public String getEmail(){
        return email;
    }

    @Override
    public String toString(){
        return "Name: " + name + " - Phone Number: " + phoneNumber + " - Email: " + email;
    }
}
