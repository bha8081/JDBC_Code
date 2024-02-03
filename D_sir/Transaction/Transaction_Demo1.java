import java.sql.*;

public class Transaction_Demo1
{
	public static void main(String[] args) throws Exception
	{
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:BHAVESH11F/bhavesh@localhost:1521:XE", "system", "1234");
		
		// It is gives the 2 defult value.
		System.out.println(conn.getTransactionIsolation());

		// set my value
		conn.setTransactionIsolation(2);
		System.out.println(conn.getTransactionIsolation());

	}
}