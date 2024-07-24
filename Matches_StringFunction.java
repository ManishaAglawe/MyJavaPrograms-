package String_Array_Prog;

public class Matches_StringFunction
{
	

	public static void main(String[] args) 
	{
		String s1="rama";
		boolean b1=s1.matches("....");// To check is there exact four letters are present or not
		System.out.println(b1);
		
		String s2="Manisha"; //check if the string ends with a
		System.out.println(s2.matches("(.*)a")); 
		
	    System.out.println(s2.matches("M(.*)")); //check if the string starts with M

	    System.out.println(s2.matches("(.*)U(.*)")); // check is u present in given string or not
	    System.out.println(s2.matches("(.*)z(.*)")); // check is z present in given string or not
	    System.out.println(s2.matches("(.*)M(.*)")); // check is m present in given string or not
	    
	                                                 //check is letter a is present at 2nd place or not
	    System.out.println(s2.matches(".a(.*)"));
	     
	    
	    
	    //. indicates --> single char search,in SQL-->'_'
	    //(.*) Indicates-->multi char search , in SQL-->%
	    
	}

}
