package lab4.Exception;

public class Main {
    public void iterate(String[] strings) throws MyException {
        for(String s : strings){
            if(s==null){
                throw new MyException(" Null element in array");
            }
            System.out.println("Element="+s);
        }
    }
    public void catchWithFinally() { //a mers sa o arunc din Main ca nu a aparut niciodata
        Main m=new Main();
        String[] strings=new String[3];
        strings[0]="element1";
        strings[1]=null;
        strings[2]="element3";// nu a mai fost executat ca am aruncat o exceptie

        try{
            m.iterate(strings);
            System.out.println("after exception in try");
        }catch(MyException e){
            System.out.println(e);
            strings[1]="something";
            System.out.println(strings[1]);
        } finally {
            System.out.println("Finally was executed");
        }

    }

    public void methodThatThrowsException() throws MyException{
        Main m=new Main();
        m.iterate(new String[] {"el1",null,"el2"});
    }

    public void methodThatThrowsRunException(String s) throws RunException {
        if(s.equals("throw")){
            throw new RunException("Run exception");
        }
    }

    public void methodThatThrowsRunException2(String s)  {
        if(s.equals("throw")){
            throw new RunException("Run exception");
        }
    }

    public static void main(String[] args) {
        Main m=new Main();
        try {
            m.methodThatThrowsException();
        }catch(Exception e){
            e.printStackTrace();
        }

        try {
            m.methodThatThrowsRunException2("throw");
        } catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("after RunException");
    }
}
