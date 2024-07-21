package Access_Specifier;

public class Student_In_one_package
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

}
