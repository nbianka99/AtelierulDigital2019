package lab2.challenge2;

public class Actor {
    private String name;
    private int varsta;
    private Premiu [] premii;

    public Actor(String name, int varsta, Premiu[] premii){
        this.name=name;
        this.varsta=varsta;
        this.premii=premii;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public Premiu[] getPremii() {
        return premii;
    }

    public void setPremii(Premiu[] premii) {
        this.premii = premii;
    }
}
