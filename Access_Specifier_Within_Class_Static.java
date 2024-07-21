package Access_Specifier;

public class Access_Specifier_Within_Class_Static 
{
	public static void add()//public access specifier
	{
		System.out.println("add");
	}
	protected static void sub()//protected access specifier
	{
		System.out.println("sub");
	}
	private static void mul()//private access specifier
	{
		System.out.println("mul");
	}
	static void div()//default/package
	{
		System.out.println("div");
		
	}
	public static void main(String[] args) 
	
	{
		add();
		sub();
		mul();
		div();

	}

}
