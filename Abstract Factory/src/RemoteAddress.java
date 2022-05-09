import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteAddress extends UnicastRemoteObject implements Address {
    protected RemoteAddress() throws RemoteException {
    }

    @Override
    public boolean isValid() throws Exception {
        return false;
    }

    @Override
    public boolean save() throws Exception {
        return false;
    }

    @Override
    public String address() throws Exception {
        return null;
    }

    @Override
    public String state() throws Exception {
        return null;
    }
}
