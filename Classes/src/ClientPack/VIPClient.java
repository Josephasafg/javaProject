package ClientPack;

public class VIPClient extends Client {
    private double discount;
    public VIPClient(int customerID, String firstName, String lastName, String phoneNumber) {
        super(customerID, firstName, lastName, phoneNumber);
        this.discount = 0.10;
    }

    public static void main(String[] args) {
        VIPClient p = new VIPClient(4,"asaf", "gardin", "878435");
        System.out.println(p.getCustomerID());
    }
}
