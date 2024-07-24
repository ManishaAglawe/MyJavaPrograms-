package Variables;

public class AreaOfCircle_UsingGlobalVariable
{
	static double pi=3.14;//global static variable
	static double r=5;
	static double a;
	static void circlearea()//formula for area of circle is pi r square
	{
		a=pi*r*r;
		
	}
         public static void main(String[] args)
	        {
	         	circlearea();
		        System.out.println("Area of Circle is =" +a);

	         }

}
