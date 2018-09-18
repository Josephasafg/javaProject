package EmployeePack;

import ClientPack.Client;
import ClientPack.NewClient;
import ClientPack.RegularClient;
import ClientPack.VIPClient;
import EmployeePack.Employee;
import Shop.Branch;
import Shop.Item;
import Utilities.GlobalLogger;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;

public class ManagerTools {
    private GlobalLogger log = new GlobalLogger("projectLog.log");

    private final String driver = "org.gjt.mm.mysql.Driver";
    private final Connection url = DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/javaproject", "root", "Gard2325");

    public ManagerTools() throws SQLException, IOException {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            log.logger.setLevel(Level.INFO);
        }catch(Exception e) {
            throw new IllegalStateException("Cannot connect to MySQL");
        }
    }

    public void addEmployee(Employee employee) {
        // TODO: make it more secure!
        try {
            Class.forName(driver);
            log.logger.info("Adding Employee "+ employee.getFirstName() + " to Database.");
            String insert = "INSERT INTO employee (id, firstName, lastName,empCode, totalHours, type, branchNumber,password,phone) VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = url.prepareStatement(insert);
            Statement st = url.createStatement();
            statement.setInt(1,employee.getId());
            statement.setString(2,employee.getFirstName());
            statement.setString(3,employee.getLastName());
            statement.setInt(4,employee.getEmpCode());
            statement.setDouble(5,employee.getTotalHours());
            statement.setString(6,employee.getType().name());
            statement.setInt(7,employee.getBranchNumber());
            statement.setString(8,employee.getPassword());
            statement.setString(9,employee.getPhone());

            statement.executeUpdate();
            statement.close();
            url.close();
            log.logger.info("id: "+ employee.getId()+ "\nName: "+employee.getFirstName()+
                    " " + employee.getLastName()+"\nEmployee Code: "+ employee.getEmpCode()+"\n");

        } catch(SQLException | ClassNotFoundException e) {
            log.logger.severe("Could not add employee "+ employee.getFirstName()+
                    " "+ employee.getLastName()+ " to database");
            e.printStackTrace();
        }
    }

    public void deleteEmp(Employee employee) {
        try {
            Class.forName(driver);
            log.logger.info("Deleting employee " + employee.getFirstName()
                    +" "+ employee.getLastName()+"\n");
            PreparedStatement statement = url.prepareStatement
                    ("DELETE FROM employee WHERE id = ?;");
            statement.setInt(1,employee.getId());
            statement.executeUpdate();
            statement.close();
            url.close();
            log.logger.info("Employee number: "+ employee.getEmpCode()
                    + " was deleted successfully!");
        } catch (Exception e) {
            log.logger.severe("Failed to delete employee: #"+ employee.getEmpCode());
            e.printStackTrace();
        }
    }

    public Employee createEmp(String empType){
        Employee currentEmployee = null;
        switch (empType) {
            case "MANAGER":
                try {
                    currentEmployee = new Manager();
                    currentEmployee.setType(EmployeeTypes.MANAGER);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "SELLER":
                try {
                    currentEmployee = new Seller();
                    currentEmployee.setType(EmployeeTypes.SELLER);
                } catch (IOException e) {
                    e.printStackTrace(); }
                break;
            case "CASHIER":
                try {
                    currentEmployee = new Cashier();
                    currentEmployee.setType(EmployeeTypes.CASHIER);
                } catch (IOException | SQLException e) {
                    e.printStackTrace(); }
                break;
        }
        return currentEmployee;
    }

    public void updateEmployee(Employee employee) {
        try {
            Class.forName(driver);
            log.logger.info("Updating employee number: #"+employee.getEmpCode());
            PreparedStatement statement = url.prepareStatement("update employee set totalHours = ?" +
                    "where empCode = ?");
            statement.setDouble(1, employee.getTotalHours());
            statement.setInt(2, employee.getEmpCode());
            statement.executeUpdate();
            statement.close();
            url.close();
            log.logger.info("Successfully updated employee info!");
        } catch (Exception e) {
            log.logger.severe("Failed to update employee details");
            e.printStackTrace();
        }
    }

    public void addItemToInventory(Item item) {
        try {
            log.logger.info("Adding item: "+ item.getName() + " to DB...");
            Class.forName(driver);
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String insert = "INSERT INTO item (id, name, rackNum,currentQuantity,originalQuantity, vendor, cost, size, arrivalDate, type) VALUES(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = url.prepareStatement(insert);
            Statement st = url.createStatement();
            statement.setInt(1,item.getId());
            statement.setString(2,item.getName());
            statement.setInt(3,item.getRackNum());
            statement.setInt(4, item.getCurrentQuantity());
            statement.setInt(5,item.getOriginalQuantity());
            statement.setString(6,item.getVendor());
            statement.setDouble(7,item.getCost());
            statement.setString(8,item.getSize());
            statement.setString(9, dateFormat.format(item.getAddedDate()));
            statement.setString(10,item.getiType().name());
            statement.executeUpdate();
            statement.close();
            url.close();
            log.logger.info("Successfully added item: "+item.getName()+" to DB");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            log.logger.severe("Failed to added item "+ item.getName()+ " to DB...");
            e.printStackTrace(); }
    }



    public Client createClient(String clientType){
        Client currentClient = null;
        switch (clientType) {
            case "NEW":
                try {
                    currentClient = new NewClient();
                    //currentClient.set(EmployeeTypes.MANAGER);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "REGULAR":
                try {
                    currentClient = new RegularClient();
                    //currentEmployee.setType(EmployeeTypes.SELLER);
                } catch (IOException e) {
                    e.printStackTrace(); }
                break;
            case "VIP":
                try {
                    currentClient = new VIPClient();
                    //currentEmployee.setType(EmployeeTypes.CASHIER);
                } catch (IOException e) {
                    e.printStackTrace(); }
                break;
        }
        return currentClient;
    }


    public void addCustomer(Client client) {
        try {
            Class.forName(driver);
            log.logger.info("Adding Employee "+ client.getFirstName() + " to Database.");
            String insert = "INSERT INTO client " +
                    "(customerID, firstName, lastName,phoneNumber,customerNumber, type,discount) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement statement = url.prepareStatement(insert);
            Statement st = url.createStatement();
            statement.setInt(1,client.getCustomerID());
            statement.setString(2,client.getFirstName());
            statement.setString(3,client.getLastName());
            statement.setString(4,client.getPhoneNumber());
            statement.setInt(5,client.getCustomerNumber());
            statement.setString(6,client.getcType().name());
            statement.setDouble(7,client.getDiscount());
            statement.executeUpdate();
            statement.close();
            url.close();
            log.logger.info("id: "+ client.getCustomerID()+ "\nName: "+client.getFirstName()+
                    " " + client.getLastName()+"\nEmployee Code: "+ client.getCustomerNumber()+"\n");

        } catch(SQLException | ClassNotFoundException e) {
            log.logger.severe("Could not add employee "+ client.getFirstName()+
                    " "+ client.getLastName()+ " to database");
            e.printStackTrace();

        }
    }

    public void deleteClient(int id) {
        try {
            Class.forName(driver);
            PreparedStatement statement = url.prepareStatement
                    ("DELETE FROM client WHERE customerID=?;");
            statement.setInt(1,id);
            statement.executeUpdate();
            statement.close();
            url.close();
        } catch (Exception e) {
            log.logger.severe("Failed to delete Client with ID: " + id);
            e.printStackTrace();
        }

    }

    public void addBranch(Branch branch) {
        try {
            Class.forName(driver);
            PreparedStatement statement = url.prepareStatement("INSERT INTO branch (ID, monthProfit, monthSalary, address, month) " +
                    "VALUES (?,?,?,?,?)");
            statement.setInt(1, branch.getBranchID());
            statement.setDouble(2, branch.getMonthProfit());
            statement.setDouble(3, branch.getMonthSalary());
            statement.setString(4, branch.getAddress());
            statement.setString(5, branch.getMonth());
            statement.executeUpdate();
            statement.close();
            url.close();
            log.logger.info("Branch #"+ branch.getBranchID()+ " was successfully added to DB\n");
        }catch (Exception e) {
            log.logger.severe("Failed to add branch #"
                    +branch.getBranchID() +" to Database");
            e.printStackTrace();
        }
    }

    public void changePassword(Employee employee, String password) {
        // TODO: add password
    }
}


