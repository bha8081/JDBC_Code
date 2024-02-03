//Programm to All select value in Table.

import java.sql.*;
public class Sellect_All_Row
{
   public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:BHAVESH11F/bhavesh@localhost:1521:XE", "system", "1234");

		Statement st = conn.createStatement();

        String query = "select * from BHAVESH11F.DynamicInput where esal >= 9000";

		System.out.println(query);

	//	ResultSet rs = st.executeQuery("select * from BHAVESH11F.DynamicInput where esal > 9000");
	    ResultSet rs = st.executeQuery(query);

		boolean flag = false;

		System.out.println("EID\tENAME\t ESAL \tEADDR");
		System.out.println("------------------------------");

		while(rs.next())
		{
			flag = true;
			System.out.println(rs.getInt(1)+ "\t" +rs.getString(2)+ "\t " +rs.getInt(3)+ "\t " +rs.getString(4));
		}
		
		if (flag == false)
		{
			System.out.println("No Matched Records Found!!");
		}

		rs.close();
		st.close();
		conn.close();
	}
}