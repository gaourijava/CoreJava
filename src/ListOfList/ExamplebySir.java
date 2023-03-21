package ListOfList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExamplebySir 
{
	public static void main(String args[])
	{
		List<String> mh =new ArrayList<String>();
		mh.add("Pune");
		mh.add("Mumbai");
		
		List<String> guj=new ArrayList<String>();
		guj.add("Suart");
		guj.add("Ahemdabad");
		
		List<List<String>> india=new ArrayList<List<String>>();
		india.add(mh);
		india.add(guj);
		
		Iterator<List<String>> itr=india.iterator();
		//System.out.println(india);  //we will get output in List=[[Pune,Mumbai],[Surat,Ahemdabad]]
		while(itr.hasNext()) 
		{
			List<String>a= itr.next();
			//System.out.println(a); //we will get output [Pune,Mumbai]
			                                       //   [Surat,Ahemdabad]
			Iterator itr2= a.iterator();
			while(itr2.hasNext())
			{
				String s=(String)itr2.next();
				System.out.println(s);  //we will get output Pune
				                                          // Mumbai
				                                          // Surat
				                                          // Ahemdabad
			}
		}
		
				
	}

}
