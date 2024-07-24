package ScannerClass;

import java.util.Scanner;

public class HumanInput_Run1	
{
	static Scanner s1=new Scanner(System.in);
	Scanner s2=new Scanner(System.in);
	static void add()
	{   
		System.out.println("enter value of the a and b ");
		int a=s1.nextInt();
		int b=s1.nextInt();
		int sum=a+b;
		System.out.println("Addition of the a and b is " +sum);
		
	}
	static void sub()
	{
		System.out.println("enter value of the a and b ");
		int a=s1.nextInt();
		int b=s1.nextInt();
		int substraction=a-b;
		System.out.println("Substraction of the a and b is " +substraction );
	}
    static void mul()
	{
    	System.out.println("enter value of the a and b ");
		int a=s1.nextInt();
		int b=s1.nextInt();
		int multiplication=a*b;
		System.out.println("multiplication of the a and b is " +multiplication);
	}
    static void div()
    {
    	System.out.println("enter value of the a and b ");
		int a=s1.nextInt();
		int b=s1.nextInt();
		int division=a/b;
		System.out.println("Division of the a and b is " +division);
    }
    static void mod()
    {
    	System.out.println("enter value of the a and b ");
		int a=s1.nextInt();
		int b=s1.nextInt();
		int m=a%b;
		System.out.println("Reminder of the a and b is " +m);
    }
   
    
	public static void main(String[] args) 
	{
	
		add();
		sub();
		mul();
		div();
		mod();
		
	}

}
