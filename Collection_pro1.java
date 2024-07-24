package Collection_Problems;

import java.util.ArrayList;

public class Collection_pro1 {

	public static void main(String[] args) 
	{

		ArrayList a1=new ArrayList();
		a1.add("ravi");
		a1.add("manisha");           
		a1.add("sushma");
		a1.add("akash");
		a1.add("mahesh");
		System.out.println("The size ofa1 is " + a1.size());
		System.out.println("Before Removal-->"+a1);
		a1.remove("manisha");
		System.out.println("The size of a1 after removal of object 1 is--> " +a1.size());
		System.out.println("After Removal-->"+a1);
		
		System.out.println("------------------------------------------------------------");
		ArrayList a2=new ArrayList();
		a2.addAll(a1);
		a2.add("Surya");
		a2.removeAll(a1);
		System.out.println(a2);
		System.out.println(a2.size());
		 
		ArrayList a3=new ArrayList();
		a3.add("1");
		a3.add("67");
		a3.add("64");
		a3.add("90");
		a3.add("22");
		System.out.println("Before clearing -->"+a3);
		a3.clear();
		System.out.println("After clearing -->"+a3);
	

	}

}
