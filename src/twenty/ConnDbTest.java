package twenty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnDbTest {
    public static void main(String[] args) {
        try {
            Class.forName("rtb");
            Connection conn = DriverManager.getConnection("192.168.196.14:9100", "root", "password");
            Statement stmt = conn.createStatement();
            String sql = "select * from dtgDb.item";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getRow());
                System.out.println(rs.toString());
            }
            conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
