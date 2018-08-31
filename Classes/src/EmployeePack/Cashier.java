package EmployeePack;

import ClientPack.Client;
import EmployeePack.Employee;
import EmployeePack.EmployeeTypes;
import Shop.Item;

import java.io.IOException;
import java.sql.*;
import java.util.List;

public class Cashier extends Employee {
    private final String driver = "org.gjt.mm.mysql.Driver";
    private final Connection url = DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/javaproject", "root", "Gard2325");

    public Cashier() throws IOException, SQLException {}

    public Cashier(int id, String firstName, String lastName, double totalHours, int branchNumber, String phone, String password) throws IOException, SQLException {
        super(id, firstName, lastName, totalHours, branchNumber, EmployeeTypes.CASHIER, phone, password);
    }

    public void clientPurchase() {

    }

    public void addClient(Client client) {
        try {
            Class.forName(driver);
            PreparedStatement statement = url.prepareStatement
                    ("INSERT INTO client(customerID,firstName,lastName,phoneNumber,customerID,type) " +
                            "VALUES (?,?,?,?,?,?)");
            Statement st = url.createStatement();
            statement.setInt(1,client.getCustomerID());
            statement.setString(2,client.getFirstName());
            statement.setString(3,client.getLastName());
            statement.setString(4,client.getPhoneNumber());
            statement.setInt(5,client.getCustomerNumber());
            //statement.setString(6,client.getcType().name);
            statement.executeUpdate();
            statement.close();
            url.close();
            log.logger.info("Client addedd to DB");
        } catch (Exception e) {e.printStackTrace();}
    }

    public void removePurchasedItems(List<Item> items) {
         try {
             Class.forName(driver);
             PreparedStatement statement = url.prepareStatement
                     ("DELETE FROM inventory WHERE id=?;");
             for(int i=0;i<items.size();i++) {
                 statement.setInt(i, items.get(i).getId());
             }
             statement.executeUpdate();
             statement.close();
             url.close();

         }catch (Exception e){
             log.logger.severe("Failed to delete items from DB");
             e.printStackTrace();
         }
    }

}
