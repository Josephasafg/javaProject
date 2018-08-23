import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Branch {
    private List<Employee> employeeList;
    //private List<Purchase> salesList;
    private List<Item> stockList;
    private double monthSalary;
    private double monthProfit;
    private String address;
    private int branchID;
    private static int bid = 0;
    private List<String> addressList = new ArrayList<>(Arrays.asList("Beach Front 89", "Oxford Street 5"));

    public Branch() {
        this.employeeList = new ArrayList<Employee>();
        this.monthProfit = 0;
        this.monthSalary = 0;
        this.branchID = ++bid;
        if(branchID == 1) {
            this.address = addressList.get(0);
        }
        else
            this.address = addressList.get(1);

    }

    public void setEmployeeList(/* COMPLETE LATER */) {

    }

    public void setStockList(/* COMPLETE LATER */) {

    }

    public void setMonthProfit(/* COMPLETE LATER */) {

    }

    public final int getBranchID() {
        return branchID;
    }

    public final String getAddress() {
        return this.address;
    }

    public final double getMonthProfit() {
        return this.monthProfit;
    }

    public final double getMonthSalary() {
        return this.monthSalary;
    }

}
