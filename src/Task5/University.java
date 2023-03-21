package Task5;

import java.util.List;

public class University 
{
	public static void main(String args[])
	{
		Collage c=new Collage();
		List<Student> data=c.m1();
		
		for(Student ss:data)
		{
			System.out.println("Name of a Student="+""+ss.getName());
			System.out.println("Rollno of a Student="+""+ss.getRollno());
		}
		
		
		
		
	}
}
	
	
	
	

	
	

		
		
		
	


