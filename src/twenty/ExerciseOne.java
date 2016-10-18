package twenty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExerciseOne {
    static Connection con;
    static Statement sql;
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
        ExerciseOne e = new ExerciseOne();
        try {
            con = e.getConnection();
            sql = con.createStatement();
            rs = sql.executeQuery("select * from wang.emp where dapt = 'sale'");
            while (rs.next()) {
                String id = rs.getString(1);
                String name = rs.getString(2);
                String dapt;
                dapt = rs.getString("dapt");
                System.out.println("id = " + id);
                System.out.println("name = " + name);
                System.out.println("dapt = " + dapt);
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }

}
