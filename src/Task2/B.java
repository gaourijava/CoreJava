package Task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class B 
{
public static void main(String args[])
{
	List al=new ArrayList();
	al.add(73.30f);
	al.add(256.39d);
	al.add(11);
	al.add(77L);
	al.add(79.10f);
	al.add(87D);
	al.add(58l);
	
	Iterator itr=al.iterator();
	while(itr.hasNext())
	{
		Object a=itr.next();
		if(a instanceof Integer)
		{
			Integer i=(Integer)a;
			System.out.println(i);
		}
		else if(a instanceof Float)
		{
			Float f=(Float)a;
			System.out.println(f);
		}
		else if(a instanceof Double)
		{
			Double d=(Double)a;
			System.out.println(d);
		}
		else
		{
			Long l=(Long)a;
			System.out.println(l);
		}
	}
	
}
}
