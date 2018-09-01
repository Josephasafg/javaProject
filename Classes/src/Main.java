import EmployeePack.Cashier;
import EmployeePack.Employee;
import EmployeePack.Manager;
import EmployeePack.Seller;
import Shop.Item;
import Shop.ItemType;
import Utilities.GlobalLogger;
import Utilities.LoginTools;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;

public class Main {
    private GlobalLogger log = new GlobalLogger("projectLog.log");

    public Main() throws IOException {
        try {
            log.logger.setLevel(Level.INFO);
        }catch(Exception e) {
            throw new IllegalStateException("Cannot write log");
        }
    }
    public static void main(String[] args) throws IOException, SQLException {
        //Employee e1 = new Seller(3,"Asaf","Gardin",5.5,1, "054243432");
        Manager m1 = new Manager(121,"Brandon","Flock",232,1,"0543044054", "Gard2324");
        //m1.addEmployeeToDB(e1);
        //m1.addEmployeeToDB(m1);
        //m1.delEmployeeFromDB(m1);
        //m1.delEmployeeFromDB(e1);
        Item item = new Item(33,"Boots", 2,19,"Timerbland", new Date(),"13",200.0, ItemType.SHOES);

        m1.addItemToDB(item);
    }

}
