//How to execute Select and Non_Select Queries by using execute() method.

import java.sql.*;
import java.util.*;

public class Select_NonSelectQuery
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Query :- ");
		String sqlQuery = sc.nextLine();

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:BHAVESH11F\bhavesh@localhost:1521:XE", "system", "1234");

		Statement st = conn.createStatement();
		boolean b = st.execute(sqlQuery);
		if (b == true) // select query.
		{
			ResultSet rs = st.getResultSet();

			while(rs.next())
			{
				System.out.println(rs.getInt(1)+ "\t " +rs.getString(2)+ "\t " +rs.getInt(3)+ "\t " +rs.getString(4));
			}
		}
		else // non select query.
		{
			int rowCount = st.getUpdateCount();
			System.out.println("The number of records effected is:" +rowCount);

		}

		//rs.close();
		st.close();
		conn.close();
	}
}