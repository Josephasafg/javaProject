package EmployeePack;

import EmployeePack.Employee;
import EmployeePack.EmployeeTypes;

public class Cashier extends Employee {
     public Cashier(){}

    public Cashier(int id, String firstName, String lastName, String extraInfo, double totalHours, int branchNumber) {
        super(id, firstName, lastName, extraInfo, totalHours, branchNumber, EmployeeTypes.CASHIER);
    }

}
