package ClientPack;

import java.io.IOException;
import java.sql.SQLException;

public class NewClient extends Client{
    private final double discount = 0.15;


    public NewClient() throws IOException{
        setcType(ClientTypes.NEW);
    }
    public NewClient(int customerID, String firstName, String lastName, String phoneNumber) throws IOException, SQLException {
        super(customerID, firstName, lastName, phoneNumber, ClientTypes.NEW);
    }

    @Override
    public double getDiscount() {
        return discount;
    }
}
