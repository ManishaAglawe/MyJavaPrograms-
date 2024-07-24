package Exceptions_In_Java;

import java.util.Scanner;

public class ScannerClass_InputMissmatch {

	public static void main(String[] args) {
		
		{
			Scanner s1=new Scanner(System.in);
			int age=s1.nextInt();// If Your enter the age value as string ex manisha so it will give this exception-->Exception in thread "main" java.util.InputMismatchException
		}

	}

}
