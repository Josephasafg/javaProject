package EmployeePack;

import EmployeePack.Employee;
import EmployeePack.EmployeeTypes;

import java.io.IOException;

public class Seller extends Employee {
    public Seller() throws IOException {
        setType(EmployeeTypes.SELLER);
    }

    public Seller(int id, String firstName, String lastName, double totalHours, int branchNumber, String phone, String password) throws IOException {
        super(id, firstName, lastName, totalHours, branchNumber, EmployeeTypes.SELLER, phone, password);
    }

}
