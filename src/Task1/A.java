package Task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A 
{
	public static void main(String args[])
	{
		List al=new ArrayList();
		al.add(34);
		al.add("ABC");
		al.add('m');
		al.add("XYZ");
		al.add(45);
		al.add('A');
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Integer i=(Integer)itr.next();
			String s=(String)itr.next();
			char c=(char)itr.next();
			String s1=(String)itr.next();
			Integer i1=(Integer)itr.next();
			char c1=(char)itr.next();
			
			System.out.println(i);
			System.out.println(s);
			System.out.println(c);
			System.out.println(s1);
			System.out.println(i1);
			System.out.println(c1);
			
		}
		
	}

}
