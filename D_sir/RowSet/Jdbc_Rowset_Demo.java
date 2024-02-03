import javax.sql.rowset.*;

public class Jdbc_Rowset_Demo
{
	public static void main(String[] args) throws Exception
	{
		RowSetFactory rsf = RowSetProvider.newFactory();
		JdbcRowSet rs = rsf.createJdbcRowSet();

		rs.setUrl("jdbc:oracle:thin:BHAVESH11F/bhavesh@localhost:1521:XE");
		rs.setUsername("system");
		rs.setPassword("1234");
		rs.setCommand("select * from BHAVESH11F.DynamicInput");
		rs.execute();

		System.out.println("Employee Details In Forward Diraction");
		System.out.println("EID\tENAME\tESALL\tEADDR");
		System.out.println("--------------------------");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
		}

		System.out.println("Employee Details In Backward Diraction");
		System.out.println("EID\tENAME\tESALL\tEADDR");
		System.out.println("--------------------------");
		while(rs.previous())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
		}

		System.out.println("Accessing Randomly...");
		rs.absolute(3);
		System.out.println(rs.getRow()+"--->"+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
        rs.first();
		System.out.println(rs.getRow()+"--->"+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
		rs.last();
		System.out.println(rs.getRow()+"--->"+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
		rs.close();
	}
}