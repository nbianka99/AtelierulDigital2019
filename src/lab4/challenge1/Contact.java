package lab4.challenge1;

public class Contact {
    private String name;
    private double phoneNumber;

    public Contact(String name, double phoneNumber){
        this.name=name;
        this.phoneNumber=phoneNumber;
    }

    public String getName() {
        return name;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public String toString(){
        return " Name: "+name +" phone number: "+phoneNumber;
    }
}
