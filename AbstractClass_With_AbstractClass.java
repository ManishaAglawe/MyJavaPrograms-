package Abstract_Concrete;
abstract class Newclass1
{
	abstract void add();
	abstract void sub();
	
}
abstract class Newclass2 extends Newclass1
{
	abstract void add1();
	abstract void sub1();
}
public class AbstractClass_With_AbstractClass extends Newclass2
{ 
	void add()
	{
		System.out.println("  This is an addition method ");
		
	}
	void sub() 
	{
		
		System.out.println("  This is an substract method ");
	}
	void add1() 
	{
		System.out.println("  This is an Addition method1 ");
		
	}
	
	void sub1() 
	{
		
		System.out.println("  This is an substract method1 ");
	}

	public static void main(String[] args) 
	{
		AbstractClass_With_AbstractClass c1=new AbstractClass_With_AbstractClass();
		c1.add();
		c1.sub();
		c1.add1();
		c1.sub1();
		
	}
	
	}
