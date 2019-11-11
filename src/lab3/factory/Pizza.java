package lab3.factory;

public abstract class Pizza {
    private String name;
    private String dough;
    private String sauce;

    public Pizza(String name, String dough, String sauce){
        this.name=name;
    }

    public Pizza(String pizzaName) {
    }

    public void box(){
        System.out.println("box");
    }

    public void cut(){
        System.out.println("cut");
    }

    public void bake(){
        System.out.println("bake");
    }

    public void setDough(String dough){
        this.dough=dough;
    }

    public void setSauce(String sauce){
        this.sauce=sauce;
    }

    public abstract void prepare();


}
