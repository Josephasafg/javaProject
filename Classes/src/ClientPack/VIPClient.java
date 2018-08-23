package ClientPack;

public class VIPClient extends Client {
    private static final double discount = 0.20;
    public VIPClient(int customerID, String firstName, String lastName, String phoneNumber) {
        super(customerID, firstName, lastName, phoneNumber,ClientTypes.VIP, discount);
    }

}
