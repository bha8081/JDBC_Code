// Programm to create a table;

import java.sql.*;

public class ToCreateTableDemo
{
	public static void main(String[] args) throws Exception
	{
	  String driver = "oracle.jdbc.OracleDriver";
	//  String jdbc_url = "jdbc:oracle:thin@localhost:1521:XE";
	//  String user = "BHAVESH11F";
	//  String pwd = "bhavesh";

	  String sql_query= "create table Abc(eno number, ename varchar2(10), esal number(10), eaddr varchar2(10))";
	  Class.forName(driver);
	  Connection con = DriverManager.getConnection("jdbc:oracle:thin:BHAVESH11F/bhavesh@localhost:1521:XE", "system", "1234");
	  Statement st = con.createStatement();
	  st.executeUpdate(sql_query);
	  System.out.println("Table Create Done");
	  con.close();
	}
}