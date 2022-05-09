import java.rmi.RemoteException;

public class RemoteCustomerFactory implements CustomerFactory{
    @Override
    public Address getAddress() throws RemoteException {
        return new RemoteAddress();
    }

    @Override
    public Account getAccount() throws RemoteException {
        return new RemoteAccount();
    }

    @Override
    public CreditCard getCreditCard() throws RemoteException {
        return new RemoteCreditCard();
    }
}
