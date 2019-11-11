package lab3.factory;

public  class ChicagoPizzaStore extends AbstractFactory {
    Pizza pizza=null;
    public Pizza createPizza(String pizzaName){
        if(pizzaName == "Chicago1"){
             pizza =new ChicagoPizza(pizzaName);
        }else{
            if(pizzaName == "Chicago2"){
                pizza =new ChicagoPizza2(pizzaName);
            }
        }
        System.out.println("Create pizza in Chicago Style");
        return pizza;
    }
}
