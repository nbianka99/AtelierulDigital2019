package lab2.challenge2;

import java.nio.file.attribute.AttributeView;

public class Main {
    public static void main(String[] args) {
        //premii
        Premiu p1=new Premiu("Oscar",1990);
        Premiu p2=new Premiu("Oscar",1980);
        Premiu p3=new Premiu("Oscar",2009);
        Premiu p4=new Premiu("Oscar",2010);


        //actori
        Premiu[] listaP1=new Premiu[2];
        listaP1[0]=p1;
        listaP1[1]=p2;
        Actor a1=new Actor("actor cu 2 oscaruri", 35, listaP1);
        Actor a2=new Actor("actor cu 1 oscar",20,new Premiu[] {p3});
        Actor a3=new Actor("actor cu 3 oscaruri",55, new Premiu[] {p2,p3,p4});
        Actor a4=new Actor("actor fara premiu",18,new Premiu[]{});

        //filme
        Film f1=new Film(1999,"Trei metri deasupra cerului",new Actor[]{a1,a2});
        Film f2=new Film(2010,"Lolita",new Actor[]{a3,a4,a1});

        //studio
        Studio studio1=new Studio("Cinema City", new Film[]{f1});
        Studio studio2=new Studio("Disney", new Film[] {f1,f2});

        Studio[] studios=new Studio[]{studio1,studio2};

     for(int i=0;i<studios.length;i++){
         if(studios[i].getNrFilme()>1){
             System.out.println(studios[i].getName());
         }
     }
     for(int i=0;i<studios.length;i++){
         Film f=studios[i].getFilmByActor("actor fara premiu");
            if(f!=null){
                System.out.println(studios[i]);
            }
     }
    }
}
