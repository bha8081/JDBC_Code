import java.sql.*;
import java.io.*;

public class Binary_image_data
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:BHAVESH11F/bhavesh@localhost:1521:XE", "system", "1234");
		
		File f = new File("E:\\JDBC\\D_sir\\BLOB\\radha.jpg");
		FileInputStream fis = new FileInputStream(f);

		String sqlQuery = "insert into values BHAVESH11F.BinaryData(?, ?)";
		PreparedStatement pst = conn.prepareStatement(sqlQuery);
        
		pst.setString(1, "Radha");
		pst.setBinaryStream(2, fis);
		System.out.println("inserting image from :"+f.getAbsolutePath());
		int updateCount = pst.executeUpdate();
		if(updateCount==1)
		{
			System.out.println("Record inserted");
		}
		else
		{
			System.out.println("Record not Found:");
		}

	}
}