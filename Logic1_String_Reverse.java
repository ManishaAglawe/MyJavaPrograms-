package String_Array_Prog;

public class Logic1_String_Reverse {

	public static void main(String[] args) 
	{
		String name="Manisha"; // string functions is not use for char int so it is use for only string 
		                       //can i use string function for manisha --> yes
		                       //can i use string function for reverse abhishek ---> no
		                        // because the reversing is a char data type so thats why we can not use this way to reverse a string 
		for(int i=name.length()-1;i>=0;i--) //what is the length of manisha is  7 (but what is index of 
		{                                   // the index of manisha a is 6 so thats why we write lenght-1)
			//System.out.println(i);
			
			System.out.print(name.charAt(i)); 
		}
		

	}

}
