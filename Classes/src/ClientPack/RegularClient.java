package ClientPack;

import java.io.IOException;
import java.sql.SQLException;

public class RegularClient extends Client{
    private final double discount = 0.10;

    public RegularClient() throws IOException {
        setcType(ClientTypes.REGULAR);
    }
    public RegularClient(int customerID, String firstName, String lastName, String phoneNumber) throws IOException, SQLException {
        super(customerID, firstName, lastName, phoneNumber,ClientTypes.REGULAR);
    }

    @Override
    public double getDiscount() {
        return discount;
    }
}
