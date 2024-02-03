//First code.

import java.util.*;
public class Load_At_Runtime
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter fully Qualified className");

		String clsNm = sc.next();

		class cls = class.forName(clsNm);

		object obj = cls.newInstance();

		java.util.List l = (java.util.List)obj;

		l.add("Hello");
		l.add(34.6f);
		l.add(23);

		System.out.println(l);
	}
}