package Inherritence;
class ParentClass
{
	void method1()
	{
		int a=30;
		int b=78;
		int mul=a*b;
		System.out.println(mul);
	}
}
public class ChildClassSingleLevelNonstatic extends ParentClass
{

	void method2()
	{
		int a=303;
		int b=3;
		int div=a/b;
		System.out.println(div);
	}


	public static void main(String[] args) 
	{
		ChildClassSingleLevelNonstatic c1=new ChildClassSingleLevelNonstatic();
		c1.method1();
		c1.method2();
		

	}

}
