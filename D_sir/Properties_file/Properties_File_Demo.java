import java.sql.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_File_Demo
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException
	{
		FileInputStream file = new FileInputStream("db.properties");
        Properties p = new Properties();
		p.load(file);

		Class.forName(p.getProperty("driver"));
		Connection conn = DriverManager.getConnection(p.getProperty("Jdbc_url"), p.getProperty("user_name"), p.getProperty("user_pwd"));

		ResultSet rs = conn.createStatement().executeQuery("select * from BHAVESH11F.DynamicInput");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
		}
		conn.close();
	}
}