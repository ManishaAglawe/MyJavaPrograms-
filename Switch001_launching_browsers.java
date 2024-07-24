package Switch_In_Java;

import java.util.Scanner;

public class Switch001_launching_browsers 
{
public static void main(String[] args) 
 {
	Scanner s1=new Scanner(System.in);
	System.out.println("choose which browser to launch");
	System.out.println("Remember 1 for Firefox, 2 for Safari,3 for Chrome, 4 for Edge");
	int a=s1.nextInt();
	switch(a)
	{
     case 1:
		System.out.println("Launching Firefox Browser");
	    break;
     case 2:
	    System.out.println("Launching Safari Browser");
		break;
     case 3:
	    System.out.println("Launching Chrome Browser");
	    break;
     case 4:
		System.out.println("Launching Edge Browser");
        break;
	
	 }
  }
}
