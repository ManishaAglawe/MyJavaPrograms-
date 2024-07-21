package Abstract_Concrete;
 class Class1 //concrete class
{
	static void add()//concrete method1
	{
		System.out.println("This is static concrete method1");
	}
	void sub()//concrete method2
	{
		System.out.println("  This is nonstatic concrete method2 ");
	}
}
 abstract class Class2 extends Class1
 {
	 abstract void add8();
	 abstract void add2();
	 static void mod()//concrete method1
		{
			System.out.println("This is static concrete mod method ");
		}
		void mul()//concrete method2
		{
			System.out.println("  This is nonstatic concrete mul method ");
		}
		
 }
 abstract class Class3 extends Class2
 {
	 static void mod2()//concrete method1
		{
			System.out.println("This is static concrete mod2 method ");
		}
		void mul3()//concrete method2
		{
			System.out.println("  This is nonstatic concrete mul3 method ");
		}
 }

public class Class_AbstractClass_AbstractClass extends Class3
{
	
	void add8() 
	{
		System.out.println("add8");
		
	}

	void add2()
	{
		System.out.println("add2");
		
	}
	public static void main(String[] args)
	{
		Class_AbstractClass_AbstractClass c1=new Class_AbstractClass_AbstractClass();
		c1.add8();//only this methods are calling because it is abstract methods
		c1.add2();//this one is also abstract method
		mod2();
        c1.mul3();
        add();
        mod();
        c1.sub();
        c1.mul();
	}

	
	
	
	
}
