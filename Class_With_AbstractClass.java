package Abstract_Concrete;
class Amazon
{
	static void add()
	{
		System.out.println("This is static method");
	}
	void sub()
	{
		System.out.println("This is nonstatic  method");
	}
}
abstract class Login extends Amazon
{
	abstract void mul();
}
public class Class_With_AbstractClass extends Login
{
	void mul() 
	{
		System.out.println("This is abstract method ");
	}

	public static void main(String[] args) 
	{
		
		Class_With_AbstractClass a1=new Class_With_AbstractClass ();
		a1.mul();
		add();
		a1.sub();

	}

	
	
}
