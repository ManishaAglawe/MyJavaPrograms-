package Interface;
interface Superclass
{
 void add();
}
interface Subclass
{
 void sub();
}
public class MultipleLevelInherritance implements Superclass,Subclass
{
	public void sub()
	{
		System.out.println("interface calling sub method");
	}
    public void add() 
	{
		System.out.println("interface calling add method");
	}
	public static void main(String[] args) 
	{
		MultipleLevelInherritance m1=new MultipleLevelInherritance();
		m1.sub();
		m1.add();

	}

}
