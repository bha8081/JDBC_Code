// Program demostrantion of preparedStatement.

import java.sql.*;
import java.util.Scanner;

public class Prepared_Statement_Demo2
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:BHAVESH11F/bhavesh@localhost:1521:XE", "system", "1234");

		String sqlQuery = "insert into BHAVESH11F.PreparedStatement values(?, ?, ?, ?)";
		PreparedStatement pst = conn.prepareStatement(sqlQuery);

		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter Employee Number :");
			int number = sc.nextInt();

			System.out.println("Enter Employee Name :");
			String name = sc.next();

			System.out.println("Enter Employee Sal :");
			double sal = sc.nextDouble();

			System.out.println("Enter Employee Addr: ");
			String addr = sc.next();

			pst.setInt(1, number);
			pst.setString(2, name);
			pst.setDouble(3, sal);
			pst.setString(4, addr);
			pst.executeUpdate();

			System.out.println("Record Inserted Successfully");
			System.out.println("Do you want to insert more record[Yes/No]:");
			String option = sc.next();

            if (option.equalsIgnoreCase("No"))
            {
				break;
            }
		}
		conn.close();
	}
}