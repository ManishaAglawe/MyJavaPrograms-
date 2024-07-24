package Super_Calling_Statement;

class Login
{
	Login(int i)
	{
		super();
		System.out.println("Login");
	}
}
class Logout extends Login
{
	Logout(int a)
	{
		super(60);
		System.out.println("Logout");
	}
}
public class TestCase2 extends Logout
{
	TestCase2(int c)
	{
		super(80);
		System.out.println("TestCase2");
	}
	public static void main(String[] args) 
	{
		TestCase2 t1=new TestCase2(33);
		

	}

}