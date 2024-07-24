package Inherritence;
class GrandParent
{
	void method1()
	{
		int a=10;
		int b=34;
		int sum=a+b;
		System.out.println(sum);
	}
}
class Parent extends GrandParent
{
	void method2()
	{
		int a=19;
		int b=22;
		int sub=a-b;
		System.out.println(sub);
	}
}
public class ChildClassMultilevel extends Parent
{
	void method3()
	{
		int a=12;
		int b=20;
		int mod=a%b;
		System.out.println(mod);
	}

	public static void main(String[] args)
	{
		ChildClassMultilevel c1=new ChildClassMultilevel();
		
		c1.method1();
		c1.method2();
		c1.method3();

	}

}
