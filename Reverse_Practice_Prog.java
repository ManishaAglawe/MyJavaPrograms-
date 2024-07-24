package String_Functions;

public class Reverse_Practice_Prog 
{
    
	public static void main(String[] args) 
	{
	    String b=" Aai pappa";
		String c=b.toLowerCase();
		String reverse="";
		for(int i=c.length()-1;i>=0;i--)
		{
			char d=c.charAt(i);
			reverse=reverse+d;
			//System.out.println(reverse);
		}
		System.out.println(reverse);

	
	}

}
