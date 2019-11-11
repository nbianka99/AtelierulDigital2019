package lab3.decorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage){
        super("White Whip ",4, beverage);
    }
}
