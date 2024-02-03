// SQL Injection problem Programe.

import java.sql.*;
import java.util.Scanner;

public class SQL_Injection
{
  public static void main(String[] args) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id :");
		String d = sc.nextLine();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:BHAVESH11F/bhavesh@localhost:1521:XE", "system", "1234");

		String sqlQuery = "select * from BHAVESH11F.DynamicInput where eid="+id;
        Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sqlQuery);

		while(rs.next())
		{
			System.out.println(rs.getInt(1)+ "\t" +rs.getString(2)+ "\t" +rs.getInt(3)+ "\t" +rs.getString(4));
		}
            rs.close();
			st.close();
			conn.close(); 
	}

}