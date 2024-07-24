package Collection_Problems;

import java.util.ArrayList;

public class Collection_Methods 
{

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add("manisha");                //add method of collection
		a1.add("sushma");
		a1.add("akash");
		a1.add("mahesh");
		a1.add(22);
		a1.add(false);
		a1.add("c");
		a1.add(1235896);
		a1.add(null);
		a1.add("manisha");
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();
		a2.addAll(a1);
		a2.add("Ram");
		System.out.println(a2);
		
		System.out.println(a2.contains("Ram"));
		System.out.println(a2.containsAll(a1));
		System.out.println(a2.isEmpty());
		ArrayList a3=new ArrayList();
		System.out.println(a3.isEmpty());
		
				.
	}

}
