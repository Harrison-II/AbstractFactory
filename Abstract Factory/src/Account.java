import java.rmi.Remote;

public interface Account extends Remote{
    String firstName = null;
    String lastName = null;


    boolean isValid() throws Exception;
    boolean save() throws Exception;
    String getFirstName() throws Exception;
    String getLastName() throws Exception;

}
