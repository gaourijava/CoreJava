package Task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cal  
{
	int a=20;
	int b=10;

	public int  add()
	{
		int c=a+b;
		return c;
		
	}
	public int sub()
	{
		int c=a-b;
		return c;
	}	
		
	public int mul()
	{
		int c=a*b;
		return c;
	}
	public int div()
	{
		int c=a/b;
		return c;
	}	
		
		public static void main(String args[])
	{
		Cal c1=new Cal();
		
		List<Integer> al=new ArrayList<Integer>();
		al.add(c1.add());
		al.add(c1.sub());
		al.add(c1.mul());
		al.add(c1.div());
		
		Iterator<Integer>itr=al.iterator();
		
		for(Integer i:al)
		{
			System.out.println(i);
		}
		
	}
}
		
		



