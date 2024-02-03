import java.sql.*;
import javax.sql.rowset.*;

public class CachedRowSet_Demo
{
   public static void main(String[] args) throws Exception
	{
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:BHAVESH11F/bhavesh@localhost:1521:XE", "system", "1234");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from BHAVESH11F.DynamicInput");
		RowSetFactory rsf = RowSetProvider.newFactory();
		CachedRowSet crs = rsf.createCachedRowSet();
		crs.populate(rs);
		conn.close();
		//Now we cannot access RS but we can access CRS
		//if(rs.next()){}//RE:SQLException:Opertaion not allowed after ResultSet closed

		System.out.println("EID\tENAME\tESALL\tEADDR");
		System.out.println("-----------------------------");
        while(crs.next())
		{
			System.out.println(crs.getInt(1)+"\t"+crs.getString(2)+"\t "+crs.getInt(3)+"\t "+crs.getString(4));
			
		}
	}
}