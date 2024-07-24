package String_Functions;

public class String_CharAt_Indexofchar_trim_Substring 
{

	public static void main(String[] args)
	{
		String a="I Love My India "; // CharAt function 
		char first_char=a.charAt(2);
		System.out.println(first_char);
		 
		
		int i1=a.indexOf('y');// Index of char function
		System.out.println(i1);
		
		
		String trimmed=a.trim(); // trim function 
		System.out.println(trimmed);
		String b="  Hellow Boy How Are You   ";
		System.out.println(b);
		System.out.println(b.trim()); // it will remove the before and after string space only (middle spaces are not trim)
		
		String c="Hello Manisha";
		String c1=c.substring(3); // substring(start index) function--> it will start from 3rd index 
		System.out.println(c1);
		String c2=c.substring(6, 9); //substring(start index, end index) function--> starting of index is 6 and ending of index is 9
		System.out.println(c2);
		 
		
	/*	String input="Manisha Natthu Aglawe";
		String surname=input.substring(10,14);
		System.out.println(surname); */

	}

}
