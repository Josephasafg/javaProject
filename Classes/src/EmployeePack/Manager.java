package EmployeePack;

import EmployeePack.Employee;

public class Manager extends Employee {
    public Manager(){}
    public Manager(int id, String firstName, String lastName, String extraInfo, double totalHours,int branchNumber) {
        super(id, firstName, lastName, extraInfo, totalHours,branchNumber, EmployeeTypes.MANAGER);
    }

    public void addEmployeeToDB(Employee employee) {
        ManagerTools.add(employee);

    }

}
