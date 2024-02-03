// Sql Injection
import java.util.Scanner;
import java.sql.*;

public class SQLInjectionDemo
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee dept");
		String dept = sc.next();
		dept ="'"+dept+"'";

		System.out.println("Enter employee city");
		String city = sc.next();
		city ="'"+city+"'";
		
		String query = "select * from BHAVESH.Data where edpt ="+dept+" and ecity ="+city;
		System.out.println(query);

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:BHAVESH/bhavesh@localhost:1521:XE","system","1234");

		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(query);

		while (rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
		}
	   rs.close();
	   st.close();
	   conn.close();
	}
}