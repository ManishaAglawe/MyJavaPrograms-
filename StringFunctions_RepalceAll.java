package String_Array_Prog;

public class StringFunctions_RepalceAll
{

	public static void main(String[] args) 
	{
		String name="ram";
		String name1=name.replaceAll("a", "");// this function will replace the 'a' with nothing
		System.out.println(name1);

		String name2=name.replaceAll("a", "r"); // replacing 'a' with 'r'
		System.out.println(name2);
		 
		String name3=" My Name is Manisha";
		String name4=name3.replaceAll(" ",""); // Removing all spaces
		System.out.println(name4);
		 
		String a="MaNishA";
		String s=a.replaceAll("[A-Z]",""); // Removing capital letter in string
		System.out.println(s);
		
		String a2="MaNishA";
		String s2=a2.replaceAll("[a-z]",""); // Removing small letter in string
		System.out.println(s2);
		 
	    String s1="My 2344 Name Is Manisha"; // Removing all numeric values
		String b=s1.replaceAll("[0-9]","");
		System.out.println(b);
		
		

	}

}
