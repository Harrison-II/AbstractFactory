public interface Address{
    String address = null;
    String city = null;
    String state = null;

    boolean isValid() throws Exception;
    boolean save() throws Exception;
    String address() throws Exception;
    String state() throws Exception;

}
