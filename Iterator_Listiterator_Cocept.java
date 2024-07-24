package Collection_Problems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator_Listiterator_Cocept
{

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add("ravi");
		a1.add("manisha");           
		a1.add("sushma");
		a1.add("akash");
		a1.add("mahesh");
		System.out.println(a1);
		Iterator i1=a1.iterator();
		while(i1.hasNext()) // true if the iteration has more elements
		{
			System.out.println(i1.next()); //true if the iteration has more elements
		}
		
		System.out.println("Lets iterate in Forward Direction ");
		ListIterator i2=a1.listIterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		System.out.println("Lets iterate in Backward Direction");
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
		
		
		

	}

}
