import java.sql.*;

public class Scrollable_ResultSet
{
	public static void main(String[] args) throws Exception
	{
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:BHAVESH11F/bhavesh@localhost:1521:XE", "system", "1234");
		Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = st.executeQuery("select * from BHAVESH11F.DynamicInput");
		System.out.println("Records in Forward Direction");
		System.out.println("EID\tENAME\tESALL\tEADDR");
        System.out.println("-------------------------");

		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
		}

		System.out.println("\n Records in Backward Direction");
		System.out.println("EID\tENAME\tESALL\tEADDR");
        System.out.println("-------------------------");

		while(rs.previous())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
		}
		conn.close();
	}
}