package Interface;
interface Class1 //interface class
{
	void mul(); //Abstract methods
	void sub();
}

public class InterfaceConcept implements Class1
{
	public void mul()// when we are calling the interface methods that is abstract method we are not mention there access specifier public but when we are calling it will be comming automatically
	{
		System.out.println("This is interface mul method");	
	}
    public void sub()
	{
		System.out.println("This is interface sub method");	
	}
	public static void main(String[] args) 
	{
		InterfaceConcept i1=new InterfaceConcept();
		i1.mul();
		i1.sub();
	}

	
	

}
