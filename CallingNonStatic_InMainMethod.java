package StaticNonstatic_Methods;

public class CallingNonStatic_InMainMethod 
{
    void method()//to call non static method in main method need to create object in main method
    {
    	int i=20;
    	System.out.println(i);
    }
    void method1()
    {
    	int b=30;
    	System.out.println(b);
    }
	public static void main(String[] args) 
	{
		CallingNonStatic_InMainMethod c1=new CallingNonStatic_InMainMethod();
		c1.method();
		c1.method1();

	}

}
