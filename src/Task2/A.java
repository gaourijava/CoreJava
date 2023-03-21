package Task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A        //Primitive Data Type
{
	public static void main(String args[])
	{
		List al=new ArrayList();
		al.add(73.30f);
		al.add(256.36d);
		al.add(11);
		al.add(77L);
		al.add(79.10f);
		al.add(87D);
		al.add(58l);
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Float f=(Float)itr.next();
			Double d=(Double)itr.next();
			Integer i=(Integer)itr.next();
			Long l=(Long)itr.next();
			Float f1=(Float)itr.next();
			Double d1=(Double)itr.next();
			Long l1=(Long)itr.next();
			
			System.out.println(f);
			System.out.println(d);
			System.out.println(i);
			System.out.println(l);
			System.out.println(f1);
			System.out.println(d1);
			System.out.println(l1);
			
			
		}
		
	}

}
