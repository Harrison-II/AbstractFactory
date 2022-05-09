import java.rmi.Remote;

public interface CreditCard {
    public String cardType = null;
    public String cardNumber = null;
    public String cardExpDate = null;

    public String isValid() throws Exception;
    public String save() throws Exception;
    public String getCardType() throws Exception;
    public String getCardNumber() throws Exception;
    public String getCardExpDate() throws Exception;
}
