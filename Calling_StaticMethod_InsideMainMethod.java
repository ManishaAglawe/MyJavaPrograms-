package StaticNonstatic_Methods;

public class Calling_StaticMethod_InsideMainMethod 

{
	static void add()//to call static method we need to write only method name in main method
	{
		int a=394;
		int b=23;
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
	 add();
	}

}
