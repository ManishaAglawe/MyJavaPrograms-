package String_Array_Prog;

import java.util.Arrays;

public class EqualsIgnoreCase_IsEmpty_EndWith_Spilt_Repeat
{

	public static void main(String[] args) 
	{
	String s1="Manisha";
	boolean b1=s1.equalsIgnoreCase("Manisha");
	System.out.println(b1);
	
	String s2="";
	System.out.println(s2.isEmpty());
	
	String s3="manisha";
	System.out.println(s3.endsWith("a"));
	System.out.println(s3.endsWith("h"));
	
	String s4="my name is manisha";
	String s5[]=s4.split(" ");
	System.out.println(s5[0]);
	System.out.println(Arrays.toString(s5));
     
	String s6[]=s4.split(" ", 3);
	System.out.println(Arrays.toString(s6));
	
	String s9="software";
	String answer=s9.repeat(5);
	System.out.println(answer);
	}

}
