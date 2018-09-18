package ClientPack;//import org.jetbrains.annotations.Contract;
import DB.CustomerDB;
import EmployeePack.Cashier;
import EmployeePack.Manager;
import Shop.Item;
import Utilities.GlobalLogger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;


public abstract class Client {
    private GlobalLogger log = new GlobalLogger("projectLog.log");
    private double discount;
    private CustomerDB customerDB;
    private int customerNumber;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int customerID;
    private ClientTypes cType;
    private Map<Integer, List<Item>> purchases;
    private Map<Integer, Item> cart;


    public Client() throws IOException {
        cart = new HashMap<>();
        try {
            log.logger.setLevel(Level.INFO);
            customerDB = new CustomerDB();
        } catch(Exception e) {
            throw new IllegalStateException("Cannot write log");
        }
    }

    public Client(int customerID, String firstName, String lastName, String phoneNumber, ClientTypes cType) throws IOException, SQLException {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.cType = cType;
        this.discount = 0.0;
        int index = 1;
        this.cart = new HashMap<>();
        //this.cart.put(index, new Item());
        /* Creating a random customer number. */
        Random rand = new Random();
        this.customerNumber = rand.nextInt(99999) + 1;
    }

    public Map<Integer, Item> getCart() {
        return cart;
    }

    public void setCart(Map<Integer, Item> cart) {
        this.cart = cart;
    }


    public int createPurchaseID() {
        Random rand = new Random();
        return rand.nextInt(99999) + 1;
    }
    public void makePurchase(Map<Integer, Vector<Item>> shopping, String total) {
        log.logger.info(this.firstName+ " is requesting to buy following item: \n");
        for (Map.Entry<Integer, Vector<Item>> s: shopping.entrySet()) {
            Vector<Item> currentItem = shopping.get(s.getKey());
            for (Item aCurrentItem : currentItem) {
                log.logger.info(aCurrentItem.getName() + "\nAmount:" +
                        s.getKey());
            }
        }
        // TODO: 16/09/2018 check if random number was created before...
        int pid =createPurchaseID();
        customerDB.purchaseToDB(this.customerID, shopping,pid);
        customerDB.allPurchases(this.customerID, total,pid);
    }


    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setCustomerNumber() {
        Random rand = new Random();
        this.customerNumber = rand.nextInt(99999) + 1;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public ClientTypes getcType() {
        return cType;
    }

    public void setcType(ClientTypes cType) {
        this.cType = cType;
    }

    public double getDiscount() {
        return this.discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }


    // TODO: after creating Purchase class, initialize our map


}
