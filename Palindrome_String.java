package String_Array_Prog;

public class Palindrome_String {

	public static void main(String[] args)
	{
		String name="rotator";// (madam) if u write Rotator then input is not palindrom
		String input=name.toLowerCase();
		String reverse="";
		
		
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			reverse=reverse+c1;
			
		}
		System.out.println(reverse);
		
		boolean result=name.equals(reverse); // palindrom logic
		System.out.println(result);
		
		if(result==true)
		{
			System.out.println("input is palindrom");
		}
		else
		{
			System.out.println(" input is not a palindrom");
		}
	}

}
