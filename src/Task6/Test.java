package Task6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test 
{
	public static void main(String args[])
	{
		Details d=new Details();
		List<Employee>data=d.setdetails();
		
		
		for(Employee eee:data)
		{
			System.out.println("Enter Employee ID:"+""+eee.getEmpid());
			System.out.println("Enter Employee name:"+""+eee.getEmpname());
			System.out.println("Enter Employee Designation:"+""+eee.getEmpdesig());
			System.out.println("Enter Employee Salary:"+""+eee.getEmpsalary());
		}
	}
		
		
}
