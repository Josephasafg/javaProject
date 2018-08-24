package EmployeePack;

import EmployeePack.Employee;
import EmployeePack.EmployeeTypes;

public class Seller extends Employee {
    public Seller() {}

    public Seller(int id, String firstName, String lastName, double totalHours, int branchNumber) {
        super(id, firstName, lastName, totalHours, branchNumber, EmployeeTypes.SELLER);
    }

}
