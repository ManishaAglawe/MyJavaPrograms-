package Try_Catch_Block;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch_Single 
{
  static Scanner s1=new Scanner(System.in);
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Enter the valid age");
			int age=s1.nextInt();
			
		}
		catch (InputMismatchException a1)
		{
			System.out.println("Hey age must be a valid numeric value , please enter again");
			System.out.println("Enter the valid age");
			int age1=s1.nextInt();
		}
		
		
		
			System.out.println("Please enter your name");
			String name=s1.next();
		

	}

}
