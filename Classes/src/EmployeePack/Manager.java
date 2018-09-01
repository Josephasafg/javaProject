package EmployeePack;

import DB.ItemDB;
import EmployeePack.Employee;
import Shop.Item;

import java.io.IOException;
import java.sql.SQLException;

public class Manager extends Employee {
    private ManagerTools managerTools;
    private ItemDB itemDB;
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

    public void addItemToDB(Item item){
        managerTools.addItemToInventory(item);
    }

    public void delEmployeeFromDB(Employee employee) {
        managerTools.deleteEmp(employee);
    }

    public void setPassword() {

    }

}
