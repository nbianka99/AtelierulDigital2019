package lab5.challenge;

public class ExchangeDesk {
    public <T extends Currency, V extends Currency> T convert(V from, Class<T> dest, double rate){
        T toReturn =null;
        double value=from.getAmount() * rate;

        try{
            toReturn= dest.getDeclaredConstructor().newInstance();  //da-mi constructorul decalarat si fa-mi new cu parametrul "value"
            toReturn.setAmount(value);
        } catch (Exception e){
            e.printStackTrace();
        }

        return toReturn;
    }
}
