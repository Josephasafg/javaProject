package EmployeePack;

import EmployeePack.Employee;

import java.io.IOException;
import java.sql.SQLException;

public class Manager extends Employee {
    private ManagerTools managerTools;
    {
        try {
            managerTools = new ManagerTools();
        } catch (SQLException | IOException e) { e.printStackTrace();}
    }

    public Manager() throws IOException{}

    public Manager(int id, String firstName, String lastName, double totalHours,int branchNumber, String phone, String password) throws  IOException {
        super(id, firstName, lastName, totalHours,branchNumber, EmployeeTypes.MANAGER,phone, password);
    }

    public void addEmployeeToDB(Employee employee) {
        managerTools.addEmployee(employee);
    }

    public void delEmployeeFromDB(Employee employee) {
        managerTools.deleteEmp(employee);
    }

    public void setPassword() {

    }

}
