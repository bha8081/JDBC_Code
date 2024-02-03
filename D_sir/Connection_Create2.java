// Create connection.
import java.sql.*;
public class Connection_Create2
{
	public static void main(String[] args) throws Exception
	{
		oracle.jdbc.driver.OracleDriver od = new oracle.jdbc.driver.OracleDriver();

		DriverManager.registerDriver(od);

		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:BHAVESH11F/bhavesh@localhost:1521:XE","system","1234");

		if(conn != null)
		{
			System.out.println("Connection Estabilist: ");
		}
		else {
			System.out.println("Connction not estabilist: ");
		}
	}
}