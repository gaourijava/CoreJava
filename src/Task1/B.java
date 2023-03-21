package Task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class B 
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
			Object a=itr.next();
			if(a instanceof Character)
			{
				Character c=(Character)a;
				System.out.println(c);
			}
			else if(a instanceof Integer)
			{
				Integer i=(Integer)a;
				System.out.println(i);
			}
			else
			{
				String s=(String)a;
				System.out.println(s);
			}
		}
		
		
	}

}
