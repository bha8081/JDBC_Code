import java.sql.*;
import java.text.*;

public class Date_Retriv_Demo
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:BHAVESH11F/bhavesh@localhost:1521:XE", "system", "1234");
   
        PreparedStatement pst = conn.prepareStatement("select * from BHAVESH11F.RetriveData");
		ResultSet rs = pst.executeQuery();
		//SimpleDateFormat smpt = new SimpleDateFormat("dd-MM-yyyy");
		//System.out.println("NAME\t   ADDR\t   DOB");
		//System.out.println("........................");

		while(rs.next())
		{
			
			String name = rs.getString(1);
			String addr = rs.getString(2);
			java.sql.Date sdate = new java.sql.Date(3);
			//String s = smpt.format(sdate);
			System.out.println(name+"   "+addr+"   "+sdate);
		}
	    rs.close();
	    pst.close();
        conn.close();
	}
}