package ScannerClass;

import java.util.Scanner;

public class InputMistmatch_Exception 
{
	

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int age=s1.nextInt();// If Your enter the age value as string ex manisha so it will give this exception-->Exception in thread "main" java.util.InputMismatchException
	   	
	}

}
