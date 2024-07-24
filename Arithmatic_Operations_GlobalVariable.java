package Variables;

public class Arithmatic_Operations_GlobalVariable
{
	static int a=33;
	static int b=25;
	static int c=a*b;
	static int d=a-b;
	static double e=a/b;
	static int r=a+b;
	static double s=a%b;
	static void arithmatic()
	{
		System.out.println("Multiplication is ="+c);
		System.out.println("Substraction is ="+d);
		System.out.println("Division is ="+e);
		System.out.println("Addition is ="+r);
		System.out.println("Reminder is ="+s);
	}

	public static void main(String[] args) 
	{
		arithmatic();		
	}

}
