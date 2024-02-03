// Select from Nth Hightes Salery.

import java.sql.*;
import java.util.Scanner;

public class Nth_Hightes_Salery
{
	public static void main(String[] args) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:BHAVESH11F/bhavesh@localhost:1521:XE", "system", "1234");

        //String query = "select * from BHAVESH11F.DynamicInput";
        String query = "select * from (select eid, ename, esal, eaddr, rank() over (order by esal DESC) ranking from BHAVESH11F.DynamicInput) where ranking =" +n;
        System.out.println(query);
		System.out.println("Salary in DESC order :-");

        Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);

		while(rs.next())
		{
			System.out.println(rs.getInt(1)+ "\t " +rs.getString(2)+ "\t "+rs.getInt(3)+ " \t" +rs.getString(4));

		}

		rs.close();
		st.close();
		conn.close();
	}
}