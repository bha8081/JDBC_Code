// Farmating sql query dynamic.
// This code not run properly.

import java.sql.*;
import java.util.Scanner;
//import java.sql.SQLException;

public class DynaminInput
{
	public static void main(String[] args) throws Exception ,SQLException
	{
		try{

		Scanner sc = new Scanner(System.in);
		System.out.println("Entern Employee number: ");
		int eid = sc.nextInt();

		System.out.println("Enter Employee Name: ");
		String ename = sc.next();

		System.out.println("Enter Employee Salary: ");
		double esal = sc.nextDouble();

		System.out.println("Enter Employee Address: ");
		String eaddr = sc.next();

		String sqlQuery = "insert into BHAVESH11F.DynamicInput values("+eid+" ,' "+ename+" ', ' "+esal+" ', ' "+eaddr+" ')";

	    Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:BHAVESH11F/bhavesh@localhost:1521:XE", "system", "1234");

       // String sqlQuery = "insert into BAHVESH11F.DynamicInput values("+eid+", ' "+ename+" ', ' "+esal+" ', ' "+eaddr+" ')";

        System.out.println(sqlQuery);

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sqlQuery);

		while (rs.next())
		{
			System.out.println(rs.getInt(1)+ " " +rs.getString(2)+ " " +rs.getInt(3)+ " " +rs.getString(4));
		}

		//System.out.println("Hello Query with Your Dynamic Input is: ");
         
		 rs.close();
		 st.close();
		 con.close();
		}catch (Exception e) {
	e.printStackTrace();
    }
	}
}