package lab3.factory;

public class ChicagoPizza2 extends Pizza {
    public ChicagoPizza2(String name){
        super(name);

    }

    @Override
    public void prepare(){
        System.out.println("prepare2");
        setDough("chicago2");
        setSauce("sweet 2");
    }
}
