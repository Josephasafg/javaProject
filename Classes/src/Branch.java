import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Branch {
    //private List<Employee> employeeList;
    //private List<Purchase> salesList;
    private double monthSalary;
    private double monthProfit;
    private String address;
    private int branchID;
    private static int bid = 0;
    private List<String> addressList = new ArrayList<>(Arrays.asList("Beach Front 89", "Oxford Street 5"));

    public Branch() {
      //  this.employeeList = new ArrayList<Employee>();

        this.branchID = ++bid;
        if(branchID == 1) {
            this.address = addressList.get(0);
        }
        else
            this.address = addressList.get(1);

    }
    public final int getBranchID() {
        return branchID;
    }

    public final String getAddress() {
        return this.address;
    }



    public static void main(String[] args) {
        Branch b = new Branch();
        Branch c = new Branch();
        System.out.println(b.address + " " + c.address);
    }


}
