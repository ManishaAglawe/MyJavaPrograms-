package Conditional_Statements;

public class Nested_If_Else {

	public static void main(String[] args) 
	{
	int a=70;
	int b=29;
	if(a>b)
	{
		if(b==a)
		{
			System.out.println("condition 1");
		}
		else if(a>b)
		     {
			System.out.println("condition 2");
		     }
		     else
		     {
			System.out.println("condition 3");
			 }
	}
	else
	{
		System.out.println("condition 4");
	}
	
	}

}
