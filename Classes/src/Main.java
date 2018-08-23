import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        Cashier e1 = new Cashier(1,"asaf","g","",4,"d");
        Seller s1 = new Seller(5,"a","f","",5,"f");
        System.out.print(e1.getEmpCode() +" "+ s1.getEmpCode());


    }

    public static Connection getConnection() {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/JavaProject";
            String user = "root";
            String password = "Gard2325";
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected!");
            return con;

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
