package ClientPack;

import java.io.IOException;

public class VIPClient extends Client {
    private static final double discount = 0.20;
    public VIPClient(int customerID, String firstName, String lastName, String phoneNumber) throws IOException {
        super(customerID, firstName, lastName, phoneNumber,ClientTypes.VIP, discount);
    }

}
