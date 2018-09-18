package ClientPack;

import java.io.IOException;
import java.sql.SQLException;

public class VIPClient extends Client {
    private final double discount = 0.20;

    public VIPClient() throws IOException{
        setcType(ClientTypes.VIP);
    }

    public VIPClient(int customerID, String firstName, String lastName, String phoneNumber) throws IOException, SQLException {
        super(customerID, firstName, lastName, phoneNumber,ClientTypes.VIP);
    }

    @Override
    public double getDiscount() {
        return discount;
    }
}
