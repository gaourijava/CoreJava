package ExtraQuestionsOFTask5;

import java.util.Iterator;
import java.util.List;

public class ActingSchool 
{
	public static void main(String args[])
	{
		Theater t=new Theater();
		List data=t.m1();
		Iterator itr=data.iterator();
		while(itr.hasNext()) 
		{
			Actor ac=(Actor)itr.next();
			System.out.println("Age Of Actor="+ac.getAge());
			System.out.println("Name Of Actor="+ac.getName());
			System.out.println("Mobile Number Of Actor="+ac.getMobno());
			System.out.println("Filmname Of Actor="+ac.getFilmname());
		}
	}

}
