package twenty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Renewal {

    static Connection con;
    static PreparedStatement sql;
    static ResultSet rs;

    public static Connection getCon() {
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
    public static void main(String[] args) {
        con = getCon();
        try {
            sql = con.prepareStatement("select * from wang.stu");
            rs = sql.executeQuery();
            System.out.println("data changed before");
            while (rs.next()) {
                String id = rs.getString(1);
                String name = rs.getString("name");
                String sex = rs.getString("sex");
                String birthDay = rs.getString("birthday");
                System.out.println("id : " + id);
                System.out.println("name : " + name);
                System.out.println("sex : " + sex);
                System.out.println("birthDay : " + birthDay);
            }

            sql = con.prepareStatement("insert into wang.stu(name, sex, birthday) values(?, ?, ?)");
            sql.setString(1, "zhang");
            sql.setString(2, "male");
            sql.setString(3, "20161005");
            sql.executeUpdate();
            sql = con.prepareStatement("update wang.stu set birthday = ? where id = 1");
            sql.setString(1, "20161017");
            sql.executeUpdate();
            sql.executeUpdate("delete from wang.stu where id = 1");
            sql.setInt(1, 1);
            sql.executeUpdate();
            sql = con.prepareStatement("select * from wang.stu");
            rs = sql.executeQuery();
            System.out.println("data changed after");
            while (rs.next()) {
                String id = rs.getString(1);
                String name = rs.getString("name");
                String sex = rs.getString("sex");
                String birthDay = rs.getString("birthday");
                System.out.println("id : " + id);
                System.out.println("name : " + name);
                System.out.println("sex : " + sex);
                System.out.println("birthDay : " + birthDay);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
