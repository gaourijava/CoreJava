package ExtraQuestionsOFTask5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Theater 
{
	public List m1()
	{
		Actor a=new Actor();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Actors Data");
		int n=sc.nextInt();
		Actor ar[]=new Actor[n];
		
		List al=new ArrayList();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Age of  Actor:"+i+1);
			a.setAge(sc.nextInt());
			System.out.println("Enter Name of Actor:"+i+1);
			a.setName(sc.next());
			System.out.println("Enter Mobile Number of  Actor:"+i+1);
			a.setMobno(sc.nextLong());
			System.out.println("Enter Filmname of  Actor:"+i+1);
			a.setFilmname(sc.next());
			ar[i]=a;
			al.add(ar[i]);
		}		
		return al;	
	}

}
