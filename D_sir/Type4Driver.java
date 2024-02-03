 import java.sql.*;

 public class Type4Driver
 {
	 public static void main (String[] args) throws Exception
	 {
		Class.forName("oracle.jdbc.OracleDriver");

		Connection con = DriverManager.getConnection("jdbc:oracl:thin:Bhavesh11F/bhavesh:@localhost:1521:XE", "system", "1234");

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from Bhavesh11F.Movies");

		while(rs.next())
		 {
			System.out.println(rs.getInt(1)+ " " +rs.getString(2)+ " " +rs.getString(3)+ " " +rs.getString(4));
		 }
		 rs.close();
		 st.close();
		 con.close();
	 }
 }