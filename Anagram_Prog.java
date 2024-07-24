package String_Functions;

import java.util.Arrays;

public class Anagram_Prog
{
public static void main(String[]args) {
	String a1="inch";
	String a2="chin";
	if(a1.length()!=a2.length())
	{
		System.out.println("Its not a anagram");
	}
	else
	{
		System.out.println("Eligible to become anagram but need to see....");
		
			char c1[]=a1.toCharArray();
		char c2[]=a2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
	

		boolean myfinalanswer=	Arrays.equals(c1, c2);
		if(myfinalanswer==true)
		{
			System.out.println("hey the given 2 strings are Anagarm");
		}
		else
		{
			System.out.println("hey the given 2 strings are NOT Anagarm");

		}
}
}
}
	
