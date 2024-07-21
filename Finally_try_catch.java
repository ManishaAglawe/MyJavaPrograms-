package Try_Catch_Block;

import java.util.InputMismatchException;

public class Finally_try_catch 
{
	public static void main(String[] args)
		{
		int rollno[]=new int[3]; //array
		rollno[0]=33;  // manisha
		rollno[1]=12;  // sushma
		rollno[2]=21;  // akash
		
		try
		{
			rollno[3]=23; //ravi
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("You excided the size");
		}
		catch(NullPointerException a2)
		{
			System.out.println("handle the exception called NPE");
		}
	    catch(InputMismatchException a3)
		{
	    	System.out.println("handle the exception called IME");
		}
		finally
		{
			System.out.println("i am finally");
		}
	}
	}


