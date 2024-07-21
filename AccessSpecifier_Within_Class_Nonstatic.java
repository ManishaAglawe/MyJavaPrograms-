package Access_Specifier;

public class AccessSpecifier_Within_Class_Nonstatic
{
	public void add()//public access specifier
	{
		System.out.println("add");
	}
	protected void sub()//protected access specifier
	{
		System.out.println("sub");
	}
	private void mul()//private access specifier
	{
		System.out.println("mul");
	}
	void div()//default/package
	{
		System.out.println("div");
		
	}

	public static void main(String[] args)
	{
	   	
		AccessSpecifier_Within_Class_Nonstatic c1=new AccessSpecifier_Within_Class_Nonstatic();
		c1.add();
		c1.sub();
		c1.mul();
		c1.div();
	}

}
