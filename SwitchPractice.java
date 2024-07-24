package Switch_In_Java;

import java.util.Scanner;

public class SwitchPractice 
{
   
	public static void main(String[] args) 
	{
		 Scanner s1=new Scanner(System.in);
		   System.out.println("Hii");
		 
		int a=s1.nextInt();
		  System.out.println("value of a");
	    switch (a)
		{
		case 1 :
			System.out.println("1");
			break;
			
		case 2:
			System.out.println("2");
			break;
		case 3 :
			System.out.println("3");
			break;
		default:
		System.out.println("out of bound");
		}
		
		
	}
	
	

}
