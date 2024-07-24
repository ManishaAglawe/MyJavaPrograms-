package Exceptions_In_Java;

import java.util.Arrays;

public class Array_String_IndexOutOfBound_Excption 
{

	public static void main(String[] args)
	{
		String name="manisha";
		System.out.println(name.indexOf("m"));
        
		int rollno[]=new int[5];// [3] will give us ArrayIndexOutOfBoundsException
		rollno[0]=80;
		rollno[1]=20;
		rollno[1]=820;
		rollno[2]=81;
		rollno[3]=801;
		System.out.println(Arrays.toString(rollno)); 
		
		
		
		String q="manish";
		for(int i=0;i<q.length()+2;i++)// +2 will give us StringIndexOutOfBoundsException
		{
			System.out.println(q.charAt(i));
		}
	}

}
