package Task6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Details 
{
	public List<Employee>  setdetails()
	{
		Scanner sc = new Scanner(System.in);			
		System.out.println("How many Employe");
		int en = sc.nextInt();
		Employee e = new Employee();
		Employee earr[] = new Employee[en];
		List<Employee>el=new ArrayList<Employee>();
		
		for(int i = 0; i<earr.length;i++)
		{
			System.out.println("Enter Employee ID:");
			e.setEmpid(sc.nextInt());
			System.out.println("Enter Employee Name:");
			e.setEmpname(sc.next());
			System.out.println("Enter Employee Designation:");
			e.setEmpdesig(sc.next());
			System.out.println("Enter Employee Sal");
			e.setEmpsalary(sc.nextDouble());
			earr[i] = e;
			el.add(earr[i]);			
		}
		
		return el;
	}
}
			
		
		
	
		


