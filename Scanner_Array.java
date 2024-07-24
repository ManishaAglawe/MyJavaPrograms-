package String_Array_Prog;

import java.util.Arrays;
import java.util.Scanner;

public class Scanner_Array
{
	static Scanner s1=new Scanner(System.in);
	

	public static void main(String[] args) 
	{
		int rollno[]=new int [5];
		System.out.println("The rollno of o index is" + rollno[0]);
		rollno[0]=s1.nextInt();
		System.out.println("The rollno of 1st index is" + rollno[1]);
		rollno[1]=s1.nextInt();
		System.out.println("The rollno of 2nd index is" + rollno[2]);
		rollno[2]=s1.nextInt();
		System.out.println("The rollno of 3rd index is" + rollno[3]);
		rollno[3]=s1.nextInt();
		System.out.println("The rollno of 4th index is" + rollno[4]);
		rollno[4]=s1.nextInt();
		System.out.println(Arrays.toString(rollno));
		

	}

}
