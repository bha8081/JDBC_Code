import java.sql.*;

public class StoredProcedure1
{
	public static void main(String[] args) throws Exception
	{
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:BHAVESH11F/bhavesh@localhost:1521:XE", "system", "1234");
		CallableStatement cst = conn.prepareCall("{call addProc(?, ?, ?)}");

		cst.setInt(1, 300);
		cst.setInt(2, 400);

		cst.registerOutParameter(3, Types.INTEGER);
		cst.execute();

		System.out.println("Result..." +cst.getInt(3));
		conn.close();
	}
}