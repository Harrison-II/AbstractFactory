public class LocalAddress implements Address{
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
