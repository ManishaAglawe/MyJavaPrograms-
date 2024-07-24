package Inherritence;
class Chennai // chennai is grandparent class
{
	static void method1()
	{
		int a=10;
		int b=34;
		int sum=a+b;
		System.out.println(sum);
	}
}
class Delhi extends Chennai //delhi parent class
{
	static void method2()
	{
		int a=19;
		int b=22;
		int sub=a-b;
		System.out.println(sub);
	}
}

public class Pune extends Delhi //child class
{
	static void method3()
	{
		int a=19;
		int b=22;
		int div=a/b;
		System.out.println(div);
	}

	public static void main(String[] args) 
	{
		method1();
		method2();
		method3();

	}

}
