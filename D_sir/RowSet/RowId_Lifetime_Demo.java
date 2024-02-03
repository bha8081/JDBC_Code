import java.sql.*;

public class RowId_Lifetime_Demo
{
	public static void main(String[] args) throws Exception
	{
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:BHAVESH11F/bhavesh@localhost:1521:XE", "system", "1234");
        DatabaseMetaData dbmd = conn.getMetaData();
		System.out.println(dbmd.getRowIdLifetime());
		conn.close();
	}
}