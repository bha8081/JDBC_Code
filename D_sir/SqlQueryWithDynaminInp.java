// Farmating sql query dynamic.

import java.sql.*;
import java.util.Scanner;

public class SqlQueryWithDynaminInp
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Entern Employee number: ");
		int eno = sc.nextInt();

		System.out.println("Enter Employee Name: ");
		String ename = sc.next();

		System.out.println("Enter Employee Salary: ");
		double esal = sc.nextDouble();

		System.out.println("Enter Employee Address: ");
		String eaddr = sc.next();

		String sqlQuery = "insert into Abc values("+eno+", ' "+ename+" ', ' "+esal+" ', ' "+eaddr+" ')";

		System.out.println("Hello Query with Your Dynamic Input is: ");

		System.out.println(sqlQuery);
	}
}