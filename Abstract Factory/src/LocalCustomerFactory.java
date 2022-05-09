public class LocalCustomerFactory implements CustomerFactory{
    @Override
    public Address getAddress() {
        return new LocalAddress();
    }

    @Override
    public Account getAccount() {
        return new LocalAccount();
    }

    @Override
    public CreditCard getCreditCard() {
        return new LocalCreditCard();
    }
}
