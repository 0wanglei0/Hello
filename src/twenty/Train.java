package twenty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Train {

    private static Connection conn;
    private static Statement stmt;
    private static ResultSet rs;
    public static void main(String[] args) {
        Train t = new Train();
        conn = t.getConnection();
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from wang.stu where name like 'a'");
            while (rs.next()) {
                String id = rs.getString(1);
                String name = rs.getString("name");
                System.out.println("id = " + id);
                System.out.println("name = " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            conn = DriverManager.getConnection("jdbc:mysql://192.168.196.14:9100", "root", "password");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
