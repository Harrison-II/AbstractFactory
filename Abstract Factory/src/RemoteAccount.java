import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class RemoteAccount extends UnicastRemoteObject implements Account{

    protected RemoteAccount() throws RemoteException {
    }

    @Override
    public boolean isValid() throws RemoteException {
        return false;
    }

    @Override
    public boolean save() throws RemoteException {
        return false;
    }

    @Override
    public String getFirstName() throws RemoteException {
        return null;
    }

    @Override
    public String getLastName() throws RemoteException {
        return null;
    }
}
