package lab2.quiz;

class Mammal{
    String name="furry";
    String makeNoise(){
        return "generic noise";
    }
}

class Zebra extends Mammal{
    String name="stripes";
    String makesNoise(){
        return "bray";
    }
}
public class ZooKeeper {
    public static void main(String[] args) {
        new ZooKeeper().go();
    }
    void go(){
        Mammal m=new Zebra();
        System.out.println(m.name+m.makeNoise());
    }
}
