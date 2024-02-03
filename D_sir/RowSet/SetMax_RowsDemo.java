import java.sql.*;

public class SetMax_RowsDemo
{
	public static void main(String[] args) throws Exception
	{
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:BHAVESH11F/bhavesh@localhost:1521:XE", "system", "1234");
		Statement st = conn.createStatement();
		//st.setMaxRows(2);
		st.setFetchSize(500);
		ResultSet rs = st.executeQuery("select * from BHAVESH11F.DynamicInput");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));

		}
		conn.close();
	}
}