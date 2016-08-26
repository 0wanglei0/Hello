package OneToForteen;
import java.sql.*;
public class db {
	private String dbDriver="com.microsoft.jdbc.sqlserver.SQLServerDriver";

	 private String sConnStr = "jdbc:microsoft:sqlserver://localhost:1433;databasename=jspqyrlzyxns"; 
	  public Connection connect = null;
	  public ResultSet rs=null;
	  public db() {
	    try {
	     
	      Class.forName(dbDriver).newInstance(); 
	     
	      connect = DriverManager.getConnection(sConnStr,"sa",""); 
	     
	    }
	    catch (Exception ex) {
	      System.out.println("12121");
	    }
	  }
	
	  
	  public ResultSet executeQuery(String sql) {
			try{
				connect=DriverManager.getConnection(sConnStr,"sa","");
				Statement stmt=connect.createStatement();
				rs=stmt.executeQuery(sql);
			}catch(SQLException ex){
				System.err.println(ex.getMessage());
			}
			return rs;
		}
	  public void executeUpdate(String sql)
	    {
	    	
	    	Statement stmt=null;
	    	rs=null;
	    	try
	    	{   connect=DriverManager.getConnection(sConnStr,"sa","");
	    		stmt=connect.createStatement();
	    		stmt.executeUpdate(sql);
	    		stmt.close();
	    		connect.close();
	    		
	    	
	    	}
	    	catch(SQLException ex)
	    	{
	    		System.err.println(ex.getMessage());
	    		
	    		
	    	}
	    
	    	
	    }
}
