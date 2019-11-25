package lab5.challenge;

public abstract class Currency {
    protected double amount;

    public void setAmount(double amount){
        this.amount=amount;
    }

    protected double getAmount(){
        return amount;
    }

}
