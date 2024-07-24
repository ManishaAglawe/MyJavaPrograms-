package Variables;

public class LocalVariable 
{
	static void method1()
	{
		int a=10;//def:-local variable which is inside any method and scope of this variable is starting of the method till the end of the method---static local variable
		System.out.println(a);
	}
	void method2()
	{
		int b=20;//Non static local variable calling
		System.out.println(b);
	}

	public static void main(String[] args) 
	{
     System.out.println("Local variable calling");
     method1();
	}

}
