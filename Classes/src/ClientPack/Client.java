package ClientPack;//import org.jetbrains.annotations.Contract;
import EmployeePack.Cashier;
import Shop.Item;
import Utilities.GlobalLogger;

import java.io.IOException;
import java.util.*;
import java.util.logging.Level;


public abstract class Client {
    private GlobalLogger log = new GlobalLogger("projectLog.log");
    protected double discount;
    private int customerNumber;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int customerID;
    private ClientTypes cType;
    private Map<Integer, List<String>> purchaseHistory;

    public Client() throws IOException {
        try {
            log.logger.setLevel(Level.INFO);
        } catch(Exception e) {
            throw new IllegalStateException("Cannot write log");
        }
    }


    public Client(int customerID, String firstName, String lastName, String phoneNumber, ClientTypes cType, double discount) throws IOException {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.cType = cType;
        this.discount = discount;
        int index = 1;
        this.purchaseHistory = new HashMap<Integer, List<String>>();
        this.purchaseHistory.put(index, new ArrayList<>());
        /* Creating a random customer number. */
        Random rand = new Random();
        this.customerNumber = rand.nextInt(99999) + 1;
    }

    public void makePurchase(List<Item> cart) {
        log.logger.info("Requesting to buy following items: \n");
        for(int i=0;i<cart.size();i++) {
            log.logger.info(i+") " + cart.get(i).getName());
        }


    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
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



    // TODO: after creating Purchase class, initialize our map


}
