package Inherritence;
class Parent_Class
{
	static void method1()
	{
		int a=10;
		int b=90;
		int sum=a+b;
		System.out.println(sum);
	}
	
}
public class ChidClassSingleLevel extends Parent_Class
{
	static void method2()
	{
		int a=10;
		int b=90;
		int sub=a-b;
		System.out.println(sub);
	}
	
public static void main(String[] args)
	{
		method1();
		method2();
	}

}
