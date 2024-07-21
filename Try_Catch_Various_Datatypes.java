package Try_Catch_Block;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch_Various_Datatypes
{
	static Scanner s1=new Scanner(System.in);
	public static void main(String[] args)
	{
	try
	{
		System.out.println("Enter the valid age");
		int age=s1.nextInt();
		System.out.println("Enter the valid salary");
		double sal=s1.nextDouble();
		System.out.println("Enter the valid weight");
		int weight=s1.nextInt();
		System.out.println("Enter the valid boolean answer of are u student");
		boolean ans=s1.nextBoolean();
	}
		catch (InputMismatchException a1)
	{
			System.out.println("Hey you need to enter valid credentials , please enter again");
			System.out.println("Enter the valid credentials");
		/*	int age1=s1.nextInt();
			System.out.println("Hey salary must be a valid numeric value , please enter again");
			System.out.println("Enter the valid salary");
			double sal1=s1.nextInt();
			System.out.println("Hey weight must be a valid numeric value , please enter again");
			System.out.println("Enter the valid weight");
			int weight1=s1.nextInt();
			System.out.println("Hey quetion must be a valid boolean asw , please enter again");
			System.out.println("Enter the valid ans true or false");
			boolean ans1=s1.nextBoolean();*/
	}

	}

}
