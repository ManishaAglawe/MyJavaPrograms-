package ScannerClass;

import java.util.Scanner;

public class Methods
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);//passing parameter is important here because the scanner class does not have non parameterize constructor it only have the parameterize constructor the region of passing the system.in is to invoke the parameterize constructor  
		String name=s1.next();//return type of next is string
		byte a=s1.nextByte();// return type of byte is byte
		short b=s1.nextShort();//return type of short is short
		long c=s1.nextLong();
		int d=s1.nextInt();
		boolean e=s1.nextBoolean();
		float a1=s1.nextFloat();
		double a2=s1.nextDouble();
		

	}

}
