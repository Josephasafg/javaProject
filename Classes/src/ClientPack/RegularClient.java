package ClientPack;

import java.io.IOException;

public class RegularClient extends Client{
    private static final double discount = 0.10;
    public RegularClient(int customerID, String firstName, String lastName, String phoneNumber) throws IOException {
        super(customerID, firstName, lastName, phoneNumber,ClientTypes.REGULAR,discount);
    }
}
