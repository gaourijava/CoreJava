package InstanceOfUse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example1 
{
	public static void main(String args[])
	{
		
		List<Object> al=new ArrayList<Object>();
		al.add(10);	         
		al.add(20);
		al.add("ABC");       
		al.add("PQR");
		al.add(57D);         
		al.add(56D);
	    al.add(88L);
		al.add(73.30F);    
		al.add(256.39F);
		
		Iterator<Object> itr=al.iterator();
		for(Object g:al)
		{
			
			if(g instanceof Integer){				
				System.out.println(g);
			}
			else if(g instanceof String){				
				System.out.println(g);
			}
			else if(g instanceof Double){			
				System.out.println(g);
			}
			else if(g instanceof Long){				
				System.out.println(g);
			}
			else{				
				System.out.println(g);
			}		
		}
	}
}
