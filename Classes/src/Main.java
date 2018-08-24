import EmployeePack.Cashier;
import EmployeePack.Employee;
import EmployeePack.Manager;
import EmployeePack.Seller;
import org.jetbrains.annotations.Nullable;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Seller(3,"Asaf","Gardin",5.5,1);
        Manager m1 = new Manager(5,"Josh","Brolin",4.1,1);
        m1.addEmployeeToDB(e1);
        m1.addEmployeeToDB(m1);
        m1.delEmployeeFromDB(m1);

    }

}
