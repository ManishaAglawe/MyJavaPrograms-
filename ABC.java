package Abstract_Concrete;
abstract class XYZ //abstract class
{
	abstract void add();// abstract method
}

public class ABC extends XYZ // concrete class
{
	void add()//concrete non static method
	{
		System.out.println("The Real Method is here");
	}
    public static void main(String[] args) 
	{
		ABC a1=new ABC();
		a1.add();          //(new ABC().add();)another way to create object is this
  
	}

	
}
