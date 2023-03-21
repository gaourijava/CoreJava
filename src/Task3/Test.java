package Task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test 
{
	public static void main(String args[])
	{
			Scanner sc = new Scanner(System.in);
			Student s[] = new Student[3]; //
			for(int i=0;i<3;i++) 
			{
				s[i] = new Student();
				System.out.println("Enter Rollno");
				s[i].setRollno(sc.nextInt());
				System.out.println("Enter Name");
				s[i].setName(sc.next());
				System.out.println("Enter Add");
				s[i].setAdd(sc.next());
			}
			
			List<Student> al=new ArrayList<Student>();
			al.add(s[0]);
			al.add(s[1]);
			al.add(s[2]);
		
		Iterator<Student> itr=al.iterator();
		for(Student ss:al)
		{
			System.out.println(ss.getRollno());
			System.out.println(ss.getName());
			System.out.println(ss.getAdd());
			
		}
		
		
		
		
		
		
		
	}

}
