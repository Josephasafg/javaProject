import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {

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
