package ClientPack;

public class RegularClient extends Client{
    private static final double discount = 0.10;
    public RegularClient(int customerID, String firstName, String lastName, String phoneNumber) {
        super(customerID, firstName, lastName, phoneNumber,ClientTypes.REGULAR,discount);
    }
}
