package lab3.factory;

public class ChicagoPizza extends Pizza {
    public ChicagoPizza(String pizzaName){
        super(pizzaName);
    }

    @Override
    public void prepare(){
        System.out.println("Prepare ChicagoPizza");
        setDough("sweet chicago");
        setSauce("sweet");
    }
}
