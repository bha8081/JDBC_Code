public class Date_Value_1
{
	public static void main(String[] args)
	{
		java.util.Date udate = new java.util.Date();
		System.out.println("util Date: " +udate);

		long l = udate.getTime();

		java.sql.Date sdate = new java.sql.Date(l);
		System.out.println("sql date: " +sdate);
	}
	
}