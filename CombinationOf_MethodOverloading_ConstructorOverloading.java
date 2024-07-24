package Overloading;

public class CombinationOf_MethodOverloading_ConstructorOverloading
{
	
	static void sub()//static method overloading
	{
		System.out.println("static method1");
	}
	static void sub(int c,int d)
	{
		int sub=c+d+10;
		System.out.println(sub);
	}
	void add()//nonstatic method overloading/method name will be same but different argument
	{
		System.out.println("nonstatic");
	}
	void add(int a, int b)
	{
		int sum=a+b+5;
		System.out.println(sum);
	}
	CombinationOf_MethodOverloading_ConstructorOverloading()
	{
		System.out.println("no para constructor");
	}
	CombinationOf_MethodOverloading_ConstructorOverloading(int f)
	{
		int r=f*2;
		System.out.println(r);
	}
 
	public static void main(String[] args) 
	{
		sub();
		sub(10,20);
		CombinationOf_MethodOverloading_ConstructorOverloading m=new CombinationOf_MethodOverloading_ConstructorOverloading();
		m.add();
		m.add(23,33);
		CombinationOf_MethodOverloading_ConstructorOverloading m1=new CombinationOf_MethodOverloading_ConstructorOverloading();
		CombinationOf_MethodOverloading_ConstructorOverloading m2=new CombinationOf_MethodOverloading_ConstructorOverloading(2);
		
		
	}

}
