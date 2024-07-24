package Super_Calling_Statement;
class Set_URL//Inheriting object class
{
	Set_URL()
	{
		super();
		System.out.println("Set_URL");
	}
}
class Launch_the_browser extends Set_URL
{
	Launch_the_browser()//super calling statement present at 1st line at each constructor,used to call parent constructor from child constructor
	{
		super();//define explicitly --->means forcefully--->u need to write
		System.out.println("Launch_the_browser");
	}
}
public class TestCase1 extends Launch_the_browser
{
	TestCase1()
	{
		
		System.out.println("TestCase1");
	}
	public static void main(String[] args) 
	{
		TestCase1 t1=new TestCase1();
		

	}

}
