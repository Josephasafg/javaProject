package ClientPack;

public class NewClient extends Client{
    private static final double discount = 0.10;
    public NewClient(int customerID, String firstName, String lastName, String phoneNumber) {
        super(customerID, firstName, lastName, phoneNumber, ClientTypes.NEW, discount);
    }
}
