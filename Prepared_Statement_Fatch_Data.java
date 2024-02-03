// String query = "select eid, ename from username.Tablename where edept="HR".
//import java.lang.ClassNotFoundException;
import java.util.Scanner;
import java.sql.*;

public class Prepared_Statement_Fatch_Data
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Department");
		String emDept = sc.next();

		Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:BHAVESH/bhavesh@localhost:1521:XE", "system", "1234");

		String query = "select eid, ename from BHAVESH.EmployeeDemo2 where edept=?";
		System.out.println(query);

		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, emDept);

		ResultSet rs = ps.executeQuery();

		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}

		rs.close();
		ps.close();
		conn.close();

	}
}