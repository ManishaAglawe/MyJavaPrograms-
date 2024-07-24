package Collection_Problems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Listiterator_backward 
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
		System.out.println("Before The output is ");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("After The output is Nothing");
		ListIterator i2=a1.listIterator(); //it si not showing output because it is not done before directly a hasprevious need to to first hasnext after that we can do hasprevious
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
		
	}

}
