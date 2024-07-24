package Interface;
interface Grandparent 
{
	void add(); //these are the abstract methods which need not need to declare abstract keyword in front on them because it is interface class
	void sub();
}
abstract class Parent implements Grandparent
{
	abstract void subb();//abstract methods
	abstract void mul();
	void mod()
	{
		System.out.println("The concrete method1 ");
	}
	static void div()
	{
		System.out.println("The concrete method2 ");
	}
}
class Child extends Parent
{
	void Addition()
	{
		System.out.println("The concrete method1 ");
	}
	static void Substraction()
	{
		System.out.println("The concrete method2 ");
	}
	
	public void add() 
	{
		System.out.println("This is interface add method");
		
	}
	
	public void sub() 
	{
		System.out.println("This is interface sub method");	
		
	}
	
	void subb() 
	{
		System.out.println("This is Abstract subb method");
		
	}
	
	void mul() 
	{
		System.out.println("This is Abstract subb method");
		
	}
	
	
}
public class SuperInterface 
{

	public static void main(String[] args) 
	{
		Child c1=new Child();
		c1.Addition();			
		}

}
