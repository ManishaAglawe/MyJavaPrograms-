package StaticNonstatic_Methods;

public class StaticMethodCalling_WithAndWithout_Parameters 
{
	static void add()//non parameterized static method
	{
		System.out.println("non parameterized");
	}
	static void add(int a)//parameterized static method
	{
		int sum=a+70;
		System.out.println(sum);
	}
	static void methoddouble(double a, double b)
	{
		double d=a+b+20;
		System.out.println(d);
	}
 public static void main (String[]args)
 {
	 methoddouble(20,70);
	 add();
	 add(90);
 }
}
