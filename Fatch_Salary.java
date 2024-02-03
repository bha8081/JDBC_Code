// Fatch Salary 20000 t0 50000.

import java.util.Scanner;
import java.sql.*;

public class Fatch_Salary
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The DEPT ");

		String dept = sc.next();

		dept = "'"+dept+"'";
		System.out.println("Enter Lower Salary");
        int salLower = sc.nextInt();

		System.out.println("Enter Higher Salary");
		int salHigher = sc.nextInt();

		String query = "select * from BHAVESH.Salary where eslry >="+salLower+ " and eslry <=" +salHigher+" and edpt="+dept;
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