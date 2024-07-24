package ScannerClass;

import java.util.Scanner;

public class AreaofRectangle 
{
	static Scanner s1=new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Enter the value of l ");
		int l=s1.nextInt();
		System.out.println("Enter the value of w ");
		int w=s1.nextInt();
	    int b=l*w;
	    System.out.println("Area of rectangle is "+b);

	}

}
