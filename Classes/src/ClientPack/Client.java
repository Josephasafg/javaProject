package ClientPack;//import org.jetbrains.annotations.Contract;
import java.util.*;

public abstract class Client {
    protected double discount;
    private int customerNumber;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int customerID;
    private ClientTypes cType;
    private Map<Integer, List<String>> purchaseHistory;

    public Client(){}

    public ClientTypes getcType() {
        return cType;
    }

    public void setcType(ClientTypes cType) {
        this.cType = cType;
    }

    public Client(int customerID, String firstName, String lastName, String phoneNumber, ClientTypes cType, double discount) {
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



    // TODO: after creating Purchase class, initialize our map


}
