package Try_Catch_Block;

public class Try_And_Catch_Block_Infinity 
{

	public static void main(String[] args) 
	{
		try {
			int a=1/0 ;// a=b/c ; b from parent class and c comes from grand parent class
			System.out.println(a);
			
		}
		
		catch(ArithmeticException a1)
		{
			System.out.println(" Handling the exception");
		}

	}

}