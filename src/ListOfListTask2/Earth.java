package ListOfListTask2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Earth 
{
	public static void main(String args[])
	{
		List mh=new ArrayList();
		mh.add("Pune");
		mh.add("Mumbai");
		mh.add("Ahemadnagar");
		mh.add("Beed");
		mh.add("Satara");
		
		List gj=new ArrayList();
		gj.add("Surat");
		gj.add("Ahemdabad");
		gj.add("Gandhinagar");
		gj.add("Badodara");
		
		List jh=new ArrayList();
		jh.add("Ranchi");
		jh.add("Lohardaga");
		
		List india=new ArrayList();
		india.add(mh);
		india.add(gj);
		india.add(jh);
		
		
		List state1=new ArrayList();
		state1.add("City1");
		state1.add("City2");
		state1.add("City3");
		
		List state2=new ArrayList();
		state2.add("City4");
		state2.add("City5");	
		state2.add("City6");
		
		List state3=new ArrayList();
		state3.add("City7");
		state3.add("City8");
		state3.add("City9");
		
		List usa=new ArrayList();
		usa.add(state1);
		usa.add(state2);
		usa.add(state3);
		
		List world=new ArrayList();
		world.add(india);
		world.add(usa);
		
		Iterator itr=world.iterator();
		
		while(itr.hasNext())
		{
			List a=(List)itr.next();
			
			Iterator itr1=a.iterator();
			while(itr1.hasNext())
			{
				List a1=(List)itr1.next();
				Iterator itr2=a1.iterator();
				while(itr2.hasNext())
				{
					String a2=(String)itr2.next();
					System.out.println(a2);
				}
				
				
				
			}
			
		}
			
		
		
		
	}

}
