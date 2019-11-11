package lab3.decorator;

public class Main {
    public static void main(String[] args) {
        Espresso espresso=new Espresso();
        Milk milk=new Milk(espresso);
        Whip whip=new Whip(milk);
        System.out.println("Cost: "+ whip.getCost());
        System.out.println("Description: "+whip.getDescription());

        Beverage beverage=new DarkRoast();
        Beverage soy= new Soy(beverage);
        Beverage milk2= new Milk(soy);
        System.out.println("Cost: "+ milk2.getCost());
        System.out.println("Description: "+milk2.getDescription());
    }
}
