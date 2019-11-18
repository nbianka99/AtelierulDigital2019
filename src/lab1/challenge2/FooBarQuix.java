package lab1.challenge2;

public class FooBarQuix {
    String compute(int x){
        if(x%3==0){
            System.out.print("Foo");
        }
        if(x%10==3 || x/10==3){
            System.out.print("Foo");
        }
        if(x%5==0){
            System.out.print("Bar");
        }
        if(x%10==5 || x/10==5){
            System.out.print("Bar");
        }
        if(x%7==0){
            System.out.print("Qix");
        }
        if(x%10==7 || x/10==7){
            System.out.print("Qix");
        }

        return " ";
    }

    String compute2(int x){
        while(x!=0){
            if(x/10 == 0){
                System.out.print("*");
                x=x/10;
            } else{
                System.out.println( );
                x=x/10;
            }
        }
        return " ";
    }


    public static void main(String[] args) {
        FooBarQuix foo=new FooBarQuix();
        foo.compute2(105);
    }
}
