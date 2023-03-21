package ExampleOfSir1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A   //Primitive Data Type
{
	public static void main(String args[])
	{
		List<Integer> al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);  //10,20,30,40 will get in one list
		System.out.println(al.get(0));  // 10 will get one by one,one below the other
		//But if we want multiple data at a time we need to use
		//Iterator= predefined interface
		Iterator<Integer> itr=al.iterator();
		//al's all data is stored in itr variable.
		//here,Iterator is datatype of itr variable.iterator();is method.
		for(Integer a:al)
		{
			System.out.println(a);
		}
	}

}
