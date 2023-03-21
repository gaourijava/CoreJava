package ExampleOfSir2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test
{
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.setName("ABC");
		s1.setRollno(10);
		
		Student s2=new Student();
		s2.setName("XYZ");
		s2.setRollno(20);
		
		List<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		
		Iterator<Student> itr =al.iterator();
		for(Student s:al)
		{
			   
			System.out.println(s.getName());
			System.out.println(s.getRollno());
		}
		
		
	}

}
