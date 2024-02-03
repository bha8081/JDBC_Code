// Program to display Columns meta information by using ResultMetaData.
import java.sql.*;

public class ResultSet_MetaData2
{
	public static void main(String[] args) throws Exception
	{
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:BHAVESH11F/bhavesh@localhost:1521:XE", "system", "1234");
		String sqlQuery = "select * from BHAVESH11F.DynamicInput";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sqlQuery);

		ResultSetMetaData rsmd = rs.getMetaData();
		String col1 = rsmd.getColumnName(1);
		String col2 = rsmd.getColumnName(2);
		String col3 = rsmd.getColumnName(3);
		String col4 = rsmd.getColumnName(4);

		System.out.println(col1+"\t"+col2+"\t"+col3+"\t"+col4);
		System.out.println("---------------------------------");

		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		}

        rs.close();
		st.close();
		conn.close();
	}
}