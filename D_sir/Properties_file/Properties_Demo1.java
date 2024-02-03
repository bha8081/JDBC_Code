import java.sql.*;
import java.util.*;
import java.io.*;
import java.sql.SQLException;

public class Properties_Demo1
{
	public static void main(String[] args) throws Exception, SQLException
	{
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("db.text");
		p.load(fis);
		//String driver = p.getProperty("driver");
		String url = p.getProperty("Jdbc_url");
		String user = p.getProperty("user_name");
		String pwd = p.getProperty("user_pwd");
        
		Connection conn = DriverManager.getConnection(url,user,pwd);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from BHAVESH11F.DynamicInput");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));

		}
		conn.close();
	}
}