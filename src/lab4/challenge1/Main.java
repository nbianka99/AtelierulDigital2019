package lab4.challenge1;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb=new PhoneBook("src\\lab4\\challenge1\\phoneBook.txt");
        pb.importContacts(); // Tot afiseaza null dupa cateva contcate, de ce? Am schimbat for-ul in PhoneBook cu iteratia cu count!
       // pb.displayContacts();
        pb.searchContact("Vali");
        //De ce afiseaza numai null? Nu am apelat metoda importContacts!!
    }
}
