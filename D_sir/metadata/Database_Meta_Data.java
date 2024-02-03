import java.sql.*;

public class Database_Meta_Data
{
	public static void main(String[] args) throws Exception
	{
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:BHAVESH11F/bhavesh@localhost:1521:XE", "system", "1234");
		DatabaseMetaData dbmd = conn.getMetaData();
		System.out.println("Database product Name: "+dbmd.getDatabaseProductName());
		System.out.println("Database product Version: "+dbmd.getDatabaseProductVersion());
		System.out.println("Database Major Version: "+dbmd.getDatabaseMajorVersion());
		System.out.println("Database Minor Version: "+dbmd.getDatabaseMinorVersion());
        System.out.println("JDBC Major Version: "+dbmd.getJDBCMajorVersion());
		System.out.println("JDBC Minor Version: "+dbmd.getJDBCMi norVersion());
		System.out.println("DriverName: "+dbmd.getDriverName());
		System.out.println("DriverVersion: "+dbmd.getDriverVersion());
		System.out.println("URL: "+dbmd.getURL());
		System.out.println("User Name: "+dbmd.getUserName());
		System.out.println("MaxColumns In Table: "+dbmd.getMaxColumnsInTable());
		System.out.println("Max Row Size: "+dbmd.getMaxRowSize());
		System.out.println("Max Statement Length: "+dbmd.getMaxStatementLength());
		System.out.println("Max Table in Select: "+dbmd.getMaxTablesInSelect());
		System.out.println("Max Table Name Length: "+dbmd.getMaxTableNameLength());
        System.out.println("SQL Keywords: "+dbmd.getSQLKeywords());
		System.out.println("Numeric Function: "+dbmd.getNumericFunctions());
		System.out.println("String Function: "+dbmd.getStringFunctions());
		System.out.println("System Function: "+dbmd.getSystemFunctions());
		System.out.println("supports Full Outer Joins: "+dbmd.supportsFullOuterJoins());
		System.out.println("supports Stored Procedures: "+dbmd.supportsStoredProcedures());
		conn.close();
	}
}