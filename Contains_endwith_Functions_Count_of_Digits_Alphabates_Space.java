package String_Functions;

import java.util.Arrays;

public class Contains_endwith_Functions_Count_of_Digits_Alphabates_Space 
{
	
	static int count_of_digit=0;
	static int count_of_alphabets=0;
	static int count_of_space=0;
public static void main(String[] args) 
{
String name="i am manish"; //  contains string function
	boolean answer=	name.contains("am");//m,i,sh
	//System.out.println(answer);
	boolean answer1=name.endsWith("manish");//endwith string function sh,m
	//System.out.println(answer1);
String s1="salary of ram is 9238761 *&^%$#";
	char c1[]=s1.toCharArray(); // by using this we can print like[s ,a ,l, a, r, y,....etc]
	//System.out.println(Arrays.toString(c1));
   // int r=s1.length();
   // System.out.println(r);
	for(int i=0;i<s1.length();i++)
{
	boolean b1=Character.isDigit(c1[i]);
	
	if(b1==true)
	{
		count_of_digit++; // when ever it is true count will increase 0,1,2,3,4,5.....
	}
	//System.out.println(count_of_digit);
	boolean b2=Character.isLetter(c1[i]);
	
	if(b2==true)
	{
		count_of_alphabets++;
	}
	
	boolean b3=	Character.isSpaceChar(c1[i]);
	if(b3==true)
	{
		count_of_space++;
	}
    
}
	System.out.println("The number of digits in the given string are -> "+count_of_digit);
	System.out.println("The number of alphabets in the given string are -> "+count_of_alphabets);
	System.out.println("The number of spaces in the given string are -> "+count_of_space);
    int e=s1.length()-((count_of_digit)+(count_of_alphabets)+(count_of_space));
	System.out.println("The Number of Special Character Present Are->" +e);
	
}
}
