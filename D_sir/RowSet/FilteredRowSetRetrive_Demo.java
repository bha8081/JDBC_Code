import java.sql.*;
import javax.sql.*;
import javax.sql.rowset.*;

class EmployeeSalaryFilter implements Predicate
{
	float low;
	float high;
	public EmployeeSalaryFilter(float low, float high)
	{
		this.low = low;
		this.high = high;
	}
	//this method will be called at the time of row insertion
	public boolean evaluate(Object value, String columnName) throws SQLException
	{
		return false;
	}
	//this method will be called at the time of row insertion
	public boolean evaluate(Object value, int columnindex) throws SQLException
	{
	   return false;	
	}

	public boolean evaluate(RowSet rs)
	{
		boolean eval = false;
		try{
			FilteredRowSet frs = (FilteredRowSet)rs;
			float esal = frs.getFloat(3);
			if((esal>=low) && (esal<=high)){
				eval = true;
			} else {
				eval = false;
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		return eval;
	}
}

public class FilteredRowSetRetrive_Demo
{
	public static void main(String[] args) throws Exception
	{
		RowSetFactory rsf = RowSetProvider.newFactory();
		FilteredRowSet rs = rsf.createFilteredRowSet();
		rs.setUrl = ("jdbc:oracle:thin:BHAVESH11F/bhavesh@localhost:1521:XE");
		rs.setUsername = ("system");
		rs.setPassword = ("1234");
		rs.setCommand = ("select * from BHAVESH11F.DynamicInput");
		rs.execute();

		System.out.println("Data Before Filtering");
		System.out.println("EID\tENAME\tESALL\tEADDR");
		System.out.println("-----------------------------");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
		}
		EmployeeSalaryFilter f = new EmployeeSalaryFilter(4500, 8000);
		rs.setFilter(f);
		rs.beforeFirst();
		System.out.println("Data After Filtering");
		System.out.println("EID\tENAME\tESALL\tEADDR");
		System.out.println("-----------------------------");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
		}
		rs.close();
	}
}