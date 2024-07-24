package String_Array_Prog;

public class String_MatchesFunctionProb 
{

	public static void main(String[] args) 
	{
		String s="Automation Testing";
		 System.out.println(s.matches(".........n(.*)"));//. is one character and (.*) its % in SQL-->(_ _ _ _ _ _ _ _ _ _n%) 
		   
		 String s1="sushmh";
		 System.out.println(s1.matches("s(.*)"));// Starts with s
   		 System.out.println(s1.matches("(.*)h")); //ends with h
   		 System.out.println(s1.matches("s(.*)....(.*)h"));// four letters in between or not
		 
		
	}

}
