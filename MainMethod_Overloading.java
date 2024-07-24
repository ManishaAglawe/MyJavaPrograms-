package Overloading;

public class MainMethod_Overloading 
{
	
	public static void main()
	{
	System.out.println("1");	
    }
	public static void main(int a)
	{
		int sum=a+10;
		System.out.println(sum);
	}
	public static void main(double b )
	{
		double sub=b-10;
		System.out.println(sub);
	}
	public static void main(char c,int s)
	{
		char name='M';
		int a=s+11;
		System.out.println(name);
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		main();
		main(10);
		main(3.24);
		main('c',45);

	}

}
