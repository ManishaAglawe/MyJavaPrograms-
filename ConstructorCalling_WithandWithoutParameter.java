package Constructors;

public class ConstructorCalling_WithandWithoutParameter 
{
	ConstructorCalling_WithandWithoutParameter()//it is non parameterize/constructor name must be same as class name
	{
		System.out.println("constructor without para");
	}
	ConstructorCalling_WithandWithoutParameter(int a,int b)//parameterize constructor
	{
		System.out.println(a);
		System.out.println(b);
	}
    
	public static void main(String[] args) 
	{
		System.out.println("main method");
	  ConstructorCalling_WithandWithoutParameter c1=new ConstructorCalling_WithandWithoutParameter();
	  ConstructorCalling_WithandWithoutParameter c2=new ConstructorCalling_WithandWithoutParameter(10,40);
	  
	}

}
