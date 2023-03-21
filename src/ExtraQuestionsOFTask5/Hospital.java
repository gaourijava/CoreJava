package ExtraQuestionsOFTask5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hospital 
{
	public List m1()
	{//set and add doctor data into list here
    	
   		List l=new ArrayList();
   		Doctor d=new Doctor();
   		Scanner sc=new Scanner(System.in);

   		System.out.println("Number of Doctors");
   		int dn=sc.nextInt();
   		Doctor dc[]=new Doctor[dn];
   		for(int i=0;i<dn;i++)
   		{
   			System.out.println("Name of a Doctor");
   			d.setName(sc.next());
   			System.out.println("Age of a Doctor");
   			d.setAge(sc.nextInt());
   			System.out.println("Hospitalname of  a Doctor");
   			d.setHospitalname(sc.next());
   			System.out.println("Degree  of  a Doctor");
   			d.setDegree(sc.next());
   			dc[i]=d;
   			l.add(dc[i]);
   		}
   		return l;
   			
   		

	}




}
