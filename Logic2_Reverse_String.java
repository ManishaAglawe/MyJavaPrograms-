package String_Array_Prog;

public class Logic2_Reverse_String {

	public static void main(String[] args)
	{
		String name=" My Name Is Manisha";
		String a=name.toLowerCase();
		String reverse="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			char c1=a.charAt(i);
			reverse=reverse+c1; //c1=a,c1=h,c1=s,c1=i.....etc and reverse=a,reverse=ah,reverse=ahs......etc000000
			System.out.println(reverse);
		}
		System.out.println(reverse);
		
	}

}
