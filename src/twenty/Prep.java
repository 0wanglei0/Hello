package twenty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Prep {

    private static Connection con;
    private static PreparedStatement pstmt;
    private static ResultSet rs;
    public static void main(String[] args) {
        Prep p = new Prep();
        con = p.getConnection();
        try {
            pstmt = con.prepareStatement("Select * from wang.stu where id = ?");
            pstmt.setInt(1, 1);
            rs = pstmt.executeQuery();
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
            con = DriverManager.getConnection("jdbc:mysql://192.168.196.14:9100", "root", "password");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
