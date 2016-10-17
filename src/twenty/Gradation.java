package twenty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Gradation {
    private static Connection con;
    private static Statement sql;
    private static ResultSet res;
    public static void main(String[] args) {
        Gradation gdt = new Gradation();
        con = gdt.getConnection();
        try {
            sql = con.createStatement();
            res = sql.executeQuery("select * from wang.stu");
            while (res.next()) {
                String id = res.getString("id");
                String name = res.getString("name");
                String sex = res.getString("sex");
                String birthDay = res.getString("birthday");
                System.out.print("id : " + id);
                System.out.print(" name : " + name);
                System.out.print(" sex : " + sex);
                System.out.println(" birthDay : " + birthDay);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    public Connection getConnection() {
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
