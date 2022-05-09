public class LocalAccount implements Account{

    @Override
    public boolean isValid() throws Exception {
        return false;
    }

    @Override
    public boolean save() throws Exception {
        return false;
    }

    @Override
    public String getFirstName() throws Exception {
        return null;
    }

    @Override
    public String getLastName() throws Exception {
        return null;
    }
}
