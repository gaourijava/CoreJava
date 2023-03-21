package Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collage 
{
	
		public List<Student> m1()           //set and add student data into list here
		{
			Scanner sc=new Scanner(System.in);
			Student s=new Student();			
			List<Student> cl = new ArrayList<Student>();					
			System.out.println("How many students data");
			int n = sc.nextInt();
			Student st[] = new Student[n];
			
			for(int i = 0; i<n;i++)
			{
				st[i]=new Student();
				System.out.println("Enter Name of  Student");
				s.setName(sc.next());
				System.out.println("Enter Roll of   Student");
				s.setRollno(sc.nextInt());
				st[i] =s;
				cl.add(st[i]);
			}
			return cl;			
		}			
}
			
	