import java.rmi.RemoteException;

public interface CustomerFactory {
    public Address getAddress() throws RemoteException;
    public Account getAccount() throws RemoteException;
    public CreditCard getCreditCard() throws RemoteException;
}
