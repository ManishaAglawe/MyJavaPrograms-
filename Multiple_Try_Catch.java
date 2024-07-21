package Try_Catch_Block;

import java.util.InputMismatchException;

public class Multiple_Try_Catch {

	public static void main(String[] args)
	{
	int rollno[]=new int[3]; //array
	rollno[0]=33;  // manisha
	rollno[1]=12;  // sushma
	rollno[2]=21;  // akash
	
	try
	{
		rollno[5]=23; //ravi
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
}
}
