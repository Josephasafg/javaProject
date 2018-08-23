//package Database;
//import java.sql.*;
//
//
//public class Database {
//    public Database() {
//
//    }
//
//    public void connectDatabase() {
//        try {
//            String driver = "com.mysql.jdbc.Driver";
//            String url = "jdbc:mysql://localhost:3306/JavaProject";
//            String user = "root";
//            String password = "Gard2325";
//            Connection con = DriverManager.getConnection(url, user, password);
//
//            Statement stat = con.createStatement();
//            ResultSet rs = stat.executeQuery("select * from branch");
//            Class.forName(driver);
//            while (rs.next())
//                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " ");
//            stat.close();
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}
