// Work with the DATE Value's.

import java.util.Scanner;
import java.sql;

public class Work_On_Date_Value
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date values= YYYY-MM-DD");
		String strDate = sc.next();

		SimpleDateFormat sdf = new SimpleDateFormat("DD-MM-YYYY");

		java.util.Date utilDate = sdf.parse(strDate);

		long ms = utilDate.getTime();

		java.sql.Date sqlDate = new java.sqlDate(ms);

		System.out.println("Date Value is: " +sqlDate);
	}
}