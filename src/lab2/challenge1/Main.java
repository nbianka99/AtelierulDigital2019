package lab2.challenge1;

public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("Madalin",70 ,30);
        Fighter f2=new Fighter("Richard",100,10);
        BoxingMatch boxingMatch=new BoxingMatch(f1,f2);
        System.out.println(boxingMatch.fight());
        System.out.println(f2);
        System.out.println(f1);
        System.out.println("Number of fighters: "+Fighter.getNumberOfFighters());


    }
}
