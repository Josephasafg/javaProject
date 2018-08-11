//import org.jetbrains.annotations.Contract;
import java.util.*;

public abstract class Client {
    private int customerNumber;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int customerID;
    private int index;
    private Map<Integer, List<String>> purchaseHistory;
    public Client(int customerID, String firstName, String lastName, String phoneNumber) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.index = 1;
        this.purchaseHistory = new HashMap<Integer, List<String>>();
        this.purchaseHistory.put(this.index, new ArrayList<>());
        /* Creating a random customer number. */
        Random rand = new Random();
        this.customerNumber = rand.nextInt(99999) + 1;
    }

    // TODO: after creating Purchase class, initialize our map


    public final int getCustomerNumber() {
        return this.customerNumber;
    }

    /* Setting a Customer number doesn't have to be random. */
    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public final int getCustomerID() {
        return this.customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
