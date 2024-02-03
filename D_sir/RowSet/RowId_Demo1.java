import java.sql.*;

public class RowId_Demo1
{
  public static void main(String[] agrs) throws Exception
	{
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:BHAVESH11F/bhavesh@localhost:1521:XE", "system", "1234");
		Statement st = conn.createStatement();
		String SqlQuery = "select rowid, eid, ename, esal, eaddr from BHAVESH11F.DynamicInput";
		ResultSet rs = st.executeQuery(SqlQuery);
		while(rs.next())
		{
			RowId id = rs.getRowId(1);
			byte[] b = id.getBytes();
			String rowid = new String(b);
		    System.out.println(rowid+"\t"+rs.getInt(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));	
		}

		conn.close();
	}
}