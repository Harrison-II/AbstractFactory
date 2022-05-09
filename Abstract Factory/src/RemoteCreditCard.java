import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteCreditCard extends UnicastRemoteObject implements CreditCard{
    protected RemoteCreditCard() throws RemoteException {
    }

    @Override
    public String isValid() throws Exception {
        return null;
    }

    @Override
    public String save() throws Exception {
        return null;
    }

    @Override
    public String getCardType() throws Exception {
        return null;
    }

    @Override
    public String getCardNumber() throws Exception {
        return null;
    }

    @Override
    public String getCardExpDate() throws Exception {
        return null;
    }
}
