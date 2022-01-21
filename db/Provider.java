package oes.db;
import java.sql.*;
public class Provider {
    public static Connection getOracleConnection()
    {
        Connection con = null;
	try
        {
            Class.forName("oracle.jdbc.OracleDriver");

	    con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.22:1521:xe","system","1234");
	    System.out.println("Connection successful!");
	}catch (Exception e) {System.out.println(e);}
    return con;
    }
}
	