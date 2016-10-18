package twenty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExerciseTwo {

    static Connection con;
    static PreparedStatement pstmt;
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
        ExerciseTwo eo = new ExerciseTwo();
        con = eo.getConnection();
        try {
            pstmt = con.prepareStatement("insert into wang.stu (name, sex, birthday) values(?, ?, ?)");
            pstmt.setString(1, "li");
            pstmt.setString(2, "female");
            pstmt.setString(3, "19991019");
            pstmt.executeUpdate();
            System.out.println("data insert successed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
