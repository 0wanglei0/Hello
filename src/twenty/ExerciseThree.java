package twenty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExerciseThree {

    static Connection con;
    static PreparedStatement ps;
    static ResultSet rs;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://192.168.196.14:9100", "root", "password");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args) {
        ExerciseThree et = new ExerciseThree();
        con = et.getConnection();
        try {
            ps = con.prepareStatement("delete from wang.stu where birthday < ?");
            ps.setString(1, "20001001");
            ps.executeUpdate();
            System.out.println("data deleted successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
