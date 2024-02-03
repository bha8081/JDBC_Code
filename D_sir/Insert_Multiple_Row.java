// Insert multiple row in table;

import java.sql.*;
import java.util.*;

public class Insert_Multiple_Row
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:BHAVESH11F/bhavesh@localhost:1521:XE", "system", "1234");

		Statement st = conn.createStatement();
		
		ResultSet rs = st.executeQuery("select * from BAHVESH11F.DynamicInput");
	    
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			System.out.println("Employee Id: ");
			int eid = sc.nextInt();

			System.out.println("Employee Name: ");
			String ename = sc.next();

			System.out.println("Employee salery: ");
			double esal = sc.nextDouble();

			System.out.println("Employee Address: ");
			String eaddr = sc.next();

		String sqlQuery = String.format("insert into DynamicInput values (%d, '%s', '%f', '%s')", eid, ename, esal, eaddr);
		st.executeUpdate(sqlQuery);

		System.out.println("Record Insert Successfully :-");
		System.out.println("DO you want to insert one more record[Yes/No]:");

		String option = sc.next();
	     if(option.equalsIgnoreCase("No"))
			{
				break;
			}
		}
	    conn.close();
	}
}