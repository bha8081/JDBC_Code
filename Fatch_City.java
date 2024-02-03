// Data Fatch

import java.sql.*;
import java.util.Scanner;

public class Fatch_City
{
	public static void main(String[] args) throws Exception
	{
	  System.out.println("Enter City Name: ");
	  Scanner sc = new Scanner(System.in);

	  String city = sc.next();
	  city = "'" +city+ "'";

	  String query = "select *from BHAVESH.Data where ecity = " +city;

	  Class.forName("oracle.jdbc.driver.OracleDriver");

	  Connection conn = DriverManager.getConnection("jdbc:oracle:thin:BHAVESH/bhavesh@localhost:1521:XE","system","1234");

	  Statement st = conn.createStatement();

	  ResultSet rs = st.executeQuery(query);

	  while (rs.next())
	  {
		  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
	  }

	  rs.close();
	  st.close();
	  conn.close();
	}
}