package Method_Overriding;
class Method1
{
	 void add()
	{
		System.out.println("1");
	}
	
}
class Method2 extends Method1
{
	void add()
	{
		System.out.println("2");
	}
	
}
public class Class1_Overriding extends Method2
{
	  void add()
	{
		System.out.println("3");//Suppressed all methods only child class method will be in output 
	}

	public static void main(String[] args)
	{
		
		Class1_Overriding c1=new Class1_Overriding();
		c1.add();
		
	}
}
