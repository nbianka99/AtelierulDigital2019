package lab2.challenge2;

public class Studio {
    private String name;
    private Film [] filme;

    public Studio(String name, Film[] filme){
        this.name=name;
        this.filme=filme;
    }

    public String toString(){
        return name;
    }

    public Film getFilmByActor(String actorName){
        for(int i=0;i<filme.length;i++){
            if(filme[i].getActorByName(actorName)!=null){
                return filme[i];
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Film[] getFilme() {
        return filme;
    }

    public void setFilme(Film[] filme) {
        this.filme = filme;
    }

    public int getNrFilme(){
        return filme.length;
    }




}
