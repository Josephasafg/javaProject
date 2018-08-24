package EmployeePack;

import ClientPack.Client;
import EmployeePack.Employee;
import Utilities.GlobalLogger;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;

public class ManagerTools {
    private GlobalLogger log = new GlobalLogger("projectLog.log");

    private final String driver = "org.gjt.mm.mysql.Driver";
    private final Connection url = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject", "root", "Gard2325");

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
            log.logger.info("Adding Employee "+ employee + " to Database.");
            String insert = "INSERT INTO employee(id, firstName, lastName,empCode, totalHours, type, branchNumber) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement statement = url.prepareStatement(insert);
            statement.setInt(1,employee.getId());
            statement.setString(2,employee.getFirstName());
            statement.setString(3,employee.getLastName());
            statement.setInt(4,employee.getEmpCode());
            statement.setDouble(5,employee.getTotalHours());
            statement.setString(6,employee.getType().name());
            statement.setInt(7,employee.getBranchNumber());
            log.logger.info("id: "+ employee.getId()+ "\nName: "+employee.getFirstName()+
                    " " + employee.getLastName()+"\nEmployee Code: "+ employee.getEmpCode()+"\n");

            statement.close();
            url.close();

        } catch(SQLException | ClassNotFoundException e) {
            log.logger.severe("Could not add employee "+ employee.getFirstName()+
                    " "+ employee.getLastName()+ " to database");
            e.printStackTrace();

        }
    }

    public void changePassword(Employee employee, String password) {
        // TODO: add password
    }
}


