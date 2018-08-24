package EmployeePack;

import EmployeePack.Employee;

import java.sql.SQLException;

public class Manager extends Employee {
    private ManagerTools managerTools;
    {
        try {
            managerTools = new ManagerTools();
        } catch (SQLException e) { e.printStackTrace();}
    }

    public Manager(){}

    public Manager(int id, String firstName, String lastName, String extraInfo, double totalHours,int branchNumber) {
        super(id, firstName, lastName, extraInfo, totalHours,branchNumber, EmployeeTypes.MANAGER);
    }

    public void addEmployeeToDB(Employee employee) {
        managerTools.addEmployee(employee);
    }

    public void setPassword() {

    }

}
