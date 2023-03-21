package ExtraQuestionsOFTask5;

import java.util.Iterator;
import java.util.List;

public class Institute
{
	
		public static void main(String args[]){
	       		Hospital h=new Hospital();
	         		List data=h.m1();
	         		
	         		Iterator itr=data.iterator();
	         		while(itr.hasNext())
	         		{
	         			
	         			Doctor a= (Doctor) itr.next();
	         			System.out.println("Name of Doctor="+a.getName());
	         			System.out.println("Age of Doctor="+a.getAge());
	         			System.out.println("Hospitalname of Doctor="+a.getHospitalname());
	         			System.out.println("Degree of Doctor="+a.getDegree());
	         			
	         		}
	      		
	      	}

}
